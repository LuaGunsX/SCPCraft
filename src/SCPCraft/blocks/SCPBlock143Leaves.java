/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import ModLoader;
/*     */ import SCPCraft.mod_SCP;
/*     */ import agi;
/*     */ import amq;
/*     */ import amy;
/*     */ import aoe;
/*     */ import java.util.Random;
/*     */ import jq;
/*     */ import lq;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import qx;
/*     */ import up;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public class SCPBlock143Leaves
/*     */   extends amy
/*     */ {
/*  21 */   private int fancyg = 1;
/*  22 */   private int fastg = 47;
/*     */   
/*     */   private int hurrdurr;
/*     */   int[] adjacentTreeBlocks;
/*     */   
/*     */   public SCPBlock143Leaves(int i) {
/*  28 */     super(i, i, agi.j, false);
/*  29 */     b(true);
/*  30 */     a(mod_SCP.tabBlockSCP);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTextureFile() {
/*  35 */     return "/SCPCraft/textures/SCPblox.png";
/*     */   }
/*     */ 
/*     */   
/*     */   public aoe e(yc par1World, int par2, int par3, int par4) {
/*  40 */     float var5 = 0.125F;
/*  41 */     return aoe.a().a((par2 + var5), (par3 + var5), (par4 + var5), ((par2 + 1) - var5), ((par3 + 1) - var5), ((par4 + 1) - var5));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, lq par5Entity) {
/*  46 */     par5Entity.a(mod_SCP.SCP143, 4);
/*     */   }
/*     */ 
/*     */   
/*     */   public int o() {
/*  51 */     double d = 0.5D;
/*  52 */     double d1 = 1.0D;
/*  53 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void onBlockRemoval(yc world, int i, int j, int k) {
/*  58 */     int l = 1;
/*  59 */     int i1 = l + 1;
/*  60 */     if (world.d(i - i1, j - i1, k - i1, i + i1, j + i1, k + i1))
/*     */     {
/*  62 */       for (int j1 = -l; j1 <= l; j1++) {
/*     */         
/*  64 */         for (int k1 = -l; k1 <= l; k1++) {
/*     */           
/*  66 */           for (int l1 = -l; l1 <= l; l1++) {
/*     */             
/*  68 */             int i2 = world.a(i + j1, j + k1, k + l1);
/*  69 */             if (i2 == mod_SCP.SCP143Leaves.cm) {
/*     */               
/*  71 */               int j2 = world.h(i + j1, j + k1, k + l1);
/*  72 */               world.d(i + j1, j + k1, k + l1, j2 | 0x8);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(yc world, int i, int j, int k, Random random) {
/*  85 */     if (world.I) {
/*     */       return;
/*     */     }
/*     */     
/*  89 */     int l = world.h(i, j, k);
/*  90 */     if ((l & 0x8) != 0 && (l & 0x4) == 0) {
/*     */       
/*  92 */       byte byte0 = 4;
/*  93 */       int i1 = byte0 + 1;
/*  94 */       byte byte1 = 32;
/*  95 */       int j1 = byte1 * byte1;
/*  96 */       int k1 = byte1 / 2;
/*  97 */       if (this.adjacentTreeBlocks == null)
/*     */       {
/*  99 */         this.adjacentTreeBlocks = new int[byte1 * byte1 * byte1];
/*     */       }
/* 101 */       if (world.d(i - i1, j - i1, k - i1, i + i1, j + i1, k + i1)) {
/*     */         
/* 103 */         for (int l1 = -byte0; l1 <= byte0; l1++) {
/*     */           
/* 105 */           for (int k2 = -byte0; k2 <= byte0; k2++) {
/*     */             
/* 107 */             for (int i3 = -byte0; i3 <= byte0; i3++) {
/*     */               
/* 109 */               int k3 = world.a(i + l1, j + k2, k + i3);
/* 110 */               if (k3 == mod_SCP.SCP143Log.cm) {
/*     */                 
/* 112 */                 this.adjacentTreeBlocks[(l1 + k1) * j1 + (k2 + k1) * byte1 + i3 + k1] = 0;
/*     */               
/*     */               }
/* 115 */               else if (k3 == mod_SCP.SCP143Leaves.cm) {
/*     */                 
/* 117 */                 this.adjacentTreeBlocks[(l1 + k1) * j1 + (k2 + k1) * byte1 + i3 + k1] = -2;
/*     */               } else {
/*     */                 
/* 120 */                 this.adjacentTreeBlocks[(l1 + k1) * j1 + (k2 + k1) * byte1 + i3 + k1] = -1;
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */ 
/*     */ 
/*     */         
/* 128 */         for (int i2 = 1; i2 <= 4; i2++) {
/*     */           
/* 130 */           for (int l2 = -byte0; l2 <= byte0; l2++) {
/*     */             
/* 132 */             for (int j3 = -byte0; j3 <= byte0; j3++) {
/*     */               
/* 134 */               for (int l3 = -byte0; l3 <= byte0; l3++) {
/*     */                 
/* 136 */                 if (this.adjacentTreeBlocks[(l2 + k1) * j1 + (j3 + k1) * byte1 + l3 + k1] == i2 - 1) {
/*     */ 
/*     */ 
/*     */                   
/* 140 */                   if (this.adjacentTreeBlocks[(l2 + k1 - 1) * j1 + (j3 + k1) * byte1 + l3 + k1] == -2)
/*     */                   {
/* 142 */                     this.adjacentTreeBlocks[(l2 + k1 - 1) * j1 + (j3 + k1) * byte1 + l3 + k1] = i2;
/*     */                   }
/* 144 */                   if (this.adjacentTreeBlocks[(l2 + k1 + 1) * j1 + (j3 + k1) * byte1 + l3 + k1] == -2)
/*     */                   {
/* 146 */                     this.adjacentTreeBlocks[(l2 + k1 + 1) * j1 + (j3 + k1) * byte1 + l3 + k1] = i2;
/*     */                   }
/* 148 */                   if (this.adjacentTreeBlocks[(l2 + k1) * j1 + (j3 + k1 - 1) * byte1 + l3 + k1] == -2)
/*     */                   {
/* 150 */                     this.adjacentTreeBlocks[(l2 + k1) * j1 + (j3 + k1 - 1) * byte1 + l3 + k1] = i2;
/*     */                   }
/* 152 */                   if (this.adjacentTreeBlocks[(l2 + k1) * j1 + (j3 + k1 + 1) * byte1 + l3 + k1] == -2)
/*     */                   {
/* 154 */                     this.adjacentTreeBlocks[(l2 + k1) * j1 + (j3 + k1 + 1) * byte1 + l3 + k1] = i2;
/*     */                   }
/* 156 */                   if (this.adjacentTreeBlocks[(l2 + k1) * j1 + (j3 + k1) * byte1 + l3 + k1 - 1] == -2)
/*     */                   {
/* 158 */                     this.adjacentTreeBlocks[(l2 + k1) * j1 + (j3 + k1) * byte1 + l3 + k1 - 1] = i2;
/*     */                   }
/* 160 */                   if (this.adjacentTreeBlocks[(l2 + k1) * j1 + (j3 + k1) * byte1 + l3 + k1 + 1] == -2)
/*     */                   {
/* 162 */                     this.adjacentTreeBlocks[(l2 + k1) * j1 + (j3 + k1) * byte1 + l3 + k1 + 1] = i2;
/*     */                   }
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 173 */       int j2 = this.adjacentTreeBlocks[k1 * j1 + k1 * byte1 + k1];
/* 174 */       if (j2 >= 0) {
/*     */         
/* 176 */         world.d(i, j, k, l & 0xFFFFFFF7);
/*     */       } else {
/*     */         
/* 179 */         removeLeaves(world, i, j, k);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void removeLeaves(yc world, int i, int j, int k) {
/* 186 */     c(world, i, j, k, world.h(i, j, k), 0);
/* 187 */     world.e(i, j, k, 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(Random random) {
/* 192 */     return (random.nextInt(20) != 0) ? 0 : 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int i, Random random, int j) {
/* 197 */     return mod_SCP.SCP143Sapling.cm;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yc world, qx entityplayer, int i, int j, int k, int l) {
/* 202 */     if (!world.I && entityplayer.bS() != null && (entityplayer.bS()).c == up.be.cj) {
/*     */       
/* 204 */       entityplayer.a(jq.C[this.cm], 1);
/* 205 */       b(world, i, j, k, new ur(amq.N.cm, 1, l & 0x3));
/*     */     }
/*     */     else {
/*     */       
/* 209 */       super.a(world, entityplayer, i, j, k, l);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(int i) {
/* 215 */     return i & 0x3;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int n() {
/* 223 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 232 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 240 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int i, int j) {
/* 245 */     Minecraft mc = ModLoader.getMinecraftInstance();
/* 246 */     if (mc.y.j || Minecraft.t())
/*     */     {
/* 248 */       return this.fancyg;
/*     */     }
/*     */ 
/*     */     
/* 252 */     return this.fastg;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGraphicsLevel(boolean flag) {
/* 258 */     this.c = flag;
/* 259 */     this.cl = this.hurrdurr + (flag ? 0 : 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(yc world, int i, int j, int k, lq entity) {
/* 264 */     super.b(world, i, j, k, entity);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlock143Leaves.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */