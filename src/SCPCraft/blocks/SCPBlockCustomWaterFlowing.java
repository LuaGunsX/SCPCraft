/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import agi;
/*     */ import akx;
/*     */ import amq;
/*     */ import java.util.Random;
/*     */ import yc;
/*     */ import ym;
/*     */ 
/*     */ public abstract class SCPBlockCustomWaterFlowing
/*     */   extends akx {
/*     */   int numAdjacentSources;
/*     */   boolean[] isOptimalFlowDirection;
/*     */   int[] flowCost;
/*  15 */   double red = 0.0D;
/*  16 */   double green = 0.0D;
/*  17 */   double blue = 0.0D;
/*     */   
/*     */   protected SCPBlockCustomWaterFlowing(int i, agi material) {
/*  20 */     super(i, material);
/*  21 */     this.numAdjacentSources = 0;
/*  22 */     this.isOptimalFlowDirection = new boolean[4];
/*  23 */     this.flowCost = new int[4];
/*     */   }
/*     */   
/*     */   public abstract int b(ym paramym, int paramInt1, int paramInt2, int paramInt3);
/*     */   
/*     */   private void updateFlow(yc world, int i, int j, int k) {
/*  29 */     int l = world.h(i, j, k);
/*  30 */     world.c(i, j, k, this.cm - 1, l);
/*  31 */     world.e(i, j, k, i, j, k);
/*  32 */     world.i(i, j, k);
/*     */   }
/*     */   
/*     */   public void b(yc world, int i, int j, int k, Random random) {
/*  36 */     int l = f_(world, i, j, k);
/*  37 */     byte byte0 = 1;
/*  38 */     if (this.cB == agi.i && !world.u.e) {
/*  39 */       byte0 = 2;
/*     */     }
/*  41 */     boolean flag = true;
/*  42 */     if (l > 0) {
/*  43 */       int i1 = -100;
/*  44 */       this.numAdjacentSources = 0;
/*  45 */       i1 = getSmallestFlowDecay(world, i - 1, j, k, i1);
/*  46 */       i1 = getSmallestFlowDecay(world, i + 1, j, k, i1);
/*  47 */       i1 = getSmallestFlowDecay(world, i, j, k - 1, i1);
/*  48 */       i1 = getSmallestFlowDecay(world, i, j, k + 1, i1);
/*  49 */       int j1 = i1 + byte0;
/*  50 */       if (j1 >= 8 || i1 < 0) {
/*  51 */         j1 = -1;
/*     */       }
/*  53 */       if (f_(world, i, j + 1, k) >= 0) {
/*  54 */         int l1 = f_(world, i, j + 1, k);
/*  55 */         if (l1 >= 8) {
/*  56 */           j1 = l1;
/*     */         } else {
/*  58 */           j1 = l1 + 8;
/*     */         } 
/*     */       } 
/*  61 */       if (this.numAdjacentSources >= 2 && this.cB == agi.h) {
/*  62 */         if (world.g(i, j - 1, k).a()) {
/*  63 */           j1 = 0;
/*  64 */         } else if (world.g(i, j - 1, k) == this.cB && world.h(i, j, k) == 0) {
/*  65 */           j1 = 0;
/*     */         } 
/*     */       }
/*  68 */       if (this.cB == agi.i && l < 8 && j1 < 8 && j1 > l && random.nextInt(4) != 0) {
/*  69 */         j1 = l;
/*  70 */         flag = false;
/*     */       } 
/*  72 */       if (j1 != l) {
/*  73 */         l = j1;
/*  74 */         if (l < 0) {
/*  75 */           world.e(i, j, k, 0);
/*     */         } else {
/*  77 */           world.c(i, j, k, l);
/*  78 */           world.a(i, j, k, this.cm, r_());
/*  79 */           world.h(i, j, k, this.cm);
/*     */         } 
/*  81 */       } else if (flag) {
/*  82 */         updateFlow(world, i, j, k);
/*     */       } 
/*     */     } else {
/*  85 */       updateFlow(world, i, j, k);
/*     */     } 
/*  87 */     if (liquidCanDisplaceBlock(world, i, j - 1, k)) {
/*  88 */       if (this.cB == agi.i && world.g(i, j - 1, k) == agi.h) {
/*  89 */         world.e(i, j - 1, k, amq.w.cm);
/*  90 */         j(world, i, j - 1, k);
/*     */         return;
/*     */       } 
/*  93 */       if (l >= 8) {
/*  94 */         world.d(i, j - 1, k, this.cm, l);
/*     */       } else {
/*  96 */         world.d(i, j - 1, k, this.cm, l + 8);
/*     */       } 
/*  98 */     } else if (l >= 0 && (l == 0 || blockBlocksFlow(world, i, j - 1, k))) {
/*  99 */       boolean[] aflag = getOptimalFlowDirections(world, i, j, k);
/* 100 */       int k1 = l + byte0;
/* 101 */       if (l >= 8) {
/* 102 */         k1 = 1;
/*     */       }
/* 104 */       if (k1 >= 8) {
/*     */         return;
/*     */       }
/* 107 */       if (aflag[0]) {
/* 108 */         flowIntoBlock(world, i - 1, j, k, k1);
/*     */       }
/* 110 */       if (aflag[1]) {
/* 111 */         flowIntoBlock(world, i + 1, j, k, k1);
/*     */       }
/* 113 */       if (aflag[2]) {
/* 114 */         flowIntoBlock(world, i, j, k - 1, k1);
/*     */       }
/* 116 */       if (aflag[3]) {
/* 117 */         flowIntoBlock(world, i, j, k + 1, k1);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void flowIntoBlock(yc world, int i, int j, int k, int l) {
/* 123 */     if (liquidCanDisplaceBlock(world, i, j, k)) {
/* 124 */       int i1 = world.a(i, j, k);
/* 125 */       if (i1 > 0) {
/* 126 */         if (this.cB == agi.i) {
/* 127 */           j(world, i, j, k);
/*     */         } else {
/* 129 */           amq.p[i1].c(world, i, j, k, world.h(i, j, k), 0);
/*     */         } 
/*     */       }
/* 132 */       world.d(i, j, k, this.cm, l);
/*     */     } 
/*     */   }
/*     */   
/*     */   private int calculateFlowCost(yc world, int i, int j, int k, int l, int i1) {
/* 137 */     int j1 = 1000;
/* 138 */     for (int k1 = 0; k1 < 4; k1++) {
/* 139 */       if ((k1 != 0 || i1 != 1) && (k1 != 1 || i1 != 0) && (k1 != 2 || i1 != 3) && (k1 != 3 || i1 != 2)) {
/*     */ 
/*     */         
/* 142 */         int l1 = i;
/* 143 */         int i2 = j;
/* 144 */         int j2 = k;
/* 145 */         if (k1 == 0) {
/* 146 */           l1--;
/*     */         }
/* 148 */         if (k1 == 1) {
/* 149 */           l1++;
/*     */         }
/* 151 */         if (k1 == 2) {
/* 152 */           j2--;
/*     */         }
/* 154 */         if (k1 == 3) {
/* 155 */           j2++;
/*     */         }
/* 157 */         if (!blockBlocksFlow(world, l1, i2, j2) && (world.g(l1, i2, j2) != this.cB || world.h(l1, i2, j2) != 0)) {
/*     */ 
/*     */           
/* 160 */           if (!blockBlocksFlow(world, l1, i2 - 1, j2)) {
/* 161 */             return l;
/*     */           }
/* 163 */           if (l < 4) {
/*     */ 
/*     */             
/* 166 */             int k2 = calculateFlowCost(world, l1, i2, j2, l + 1, k1);
/* 167 */             if (k2 < j1)
/* 168 */               j1 = k2; 
/*     */           } 
/*     */         } 
/*     */       } 
/* 172 */     }  return j1;
/*     */   }
/*     */   
/*     */   private boolean[] getOptimalFlowDirections(yc world, int i, int j, int k) {
/* 176 */     for (int l = 0; l < 4; l++) {
/* 177 */       this.flowCost[l] = 1000;
/* 178 */       int j1 = i;
/* 179 */       int i2 = j;
/* 180 */       int j2 = k;
/* 181 */       if (l == 0) {
/* 182 */         j1--;
/*     */       }
/* 184 */       if (l == 1) {
/* 185 */         j1++;
/*     */       }
/* 187 */       if (l == 2) {
/* 188 */         j2--;
/*     */       }
/* 190 */       if (l == 3) {
/* 191 */         j2++;
/*     */       }
/* 193 */       if (!blockBlocksFlow(world, j1, i2, j2) && (world.g(j1, i2, j2) != this.cB || world.h(j1, i2, j2) != 0))
/*     */       {
/*     */         
/* 196 */         if (!blockBlocksFlow(world, j1, i2 - 1, j2)) {
/* 197 */           this.flowCost[l] = 0;
/*     */         } else {
/* 199 */           this.flowCost[l] = calculateFlowCost(world, j1, i2, j2, 1, l);
/*     */         } 
/*     */       }
/*     */     } 
/* 203 */     int i1 = this.flowCost[0];
/* 204 */     for (int k1 = 1; k1 < 4; k1++) {
/* 205 */       if (this.flowCost[k1] < i1) {
/* 206 */         i1 = this.flowCost[k1];
/*     */       }
/*     */     } 
/*     */     
/* 210 */     for (int l1 = 0; l1 < 4; l1++) {
/* 211 */       this.isOptimalFlowDirection[l1] = (this.flowCost[l1] == i1);
/*     */     }
/*     */     
/* 214 */     return this.isOptimalFlowDirection;
/*     */   }
/*     */ 
/*     */   
/*     */   public void bubbleColor(double par1, double par2, double par3) {
/* 219 */     this.red = par1;
/* 220 */     this.green = par2;
/* 221 */     this.blue = par3;
/*     */   }
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, Random par5Random) {
/* 225 */     super.a(par1World, par2, par3, par4, par5Random);
/* 226 */     if (par5Random.nextInt(10) == 0) {
/* 227 */       int i = par1World.h(par2, par3, par4);
/*     */       
/* 229 */       if (i <= 0 || i >= 8) {
/* 230 */         par1World.a("mobSpell", (par2 + par5Random.nextFloat()), (par3 + par5Random.nextFloat()), (par4 + par5Random.nextFloat()), this.red, this.green, this.blue);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean blockBlocksFlow(yc world, int i, int j, int k) {
/* 236 */     int l = world.a(i, j, k);
/* 237 */     if (l == amq.aH.cm || l == amq.aO.cm || l == amq.aG.cm || l == amq.aI.cm || l == amq.ba.cm) {
/* 238 */       return true;
/*     */     }
/* 240 */     if (l == 0) {
/* 241 */       return false;
/*     */     }
/* 243 */     agi material = (amq.p[l]).cB;
/* 244 */     if (material == agi.C) {
/* 245 */       return true;
/*     */     }
/* 247 */     return material.a();
/*     */   }
/*     */   
/*     */   protected int getSmallestFlowDecay(yc world, int i, int j, int k, int l) {
/* 251 */     int i1 = f_(world, i, j, k);
/* 252 */     if (i1 < 0) {
/* 253 */       return l;
/*     */     }
/* 255 */     if (i1 == 0) {
/* 256 */       this.numAdjacentSources++;
/*     */     }
/* 258 */     if (i1 >= 8) {
/* 259 */       i1 = 0;
/*     */     }
/* 261 */     return (l >= 0 && i1 >= l) ? l : i1;
/*     */   }
/*     */   
/*     */   private boolean liquidCanDisplaceBlock(yc world, int i, int j, int k) {
/* 265 */     agi material = world.g(i, j, k);
/* 266 */     if (material == this.cB) {
/* 267 */       return false;
/*     */     }
/* 269 */     if (material == agi.i) {
/* 270 */       return false;
/*     */     }
/* 272 */     return !blockBlocksFlow(world, i, j, k);
/*     */   }
/*     */ 
/*     */   
/*     */   public void g(yc world, int i, int j, int k) {
/* 277 */     super.g(world, i, j, k);
/* 278 */     if (world.a(i, j, k) == this.cm)
/* 279 */       world.a(i, j, k, this.cm, r_()); 
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlockCustomWaterFlowing.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */