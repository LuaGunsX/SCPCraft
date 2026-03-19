/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import ModLoader;
/*     */ import SCPCraft.mod_SCP;
/*     */ import agi;
/*     */ import alj;
/*     */ import amq;
/*     */ import ays;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import lm;
/*     */ import lq;
/*     */ import md;
/*     */ import qx;
/*     */ import up;
/*     */ import ur;
/*     */ import yc;
/*     */ import ym;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPBlockElectricWool
/*     */   extends amq
/*     */ {
/*     */   private boolean torchActive = true;
/*  30 */   private static Map redstoneUpdateInfoCache = new HashMap<Object, Object>();
/*     */ 
/*     */   
/*     */   private boolean checkForBurnout(yc par1World, int par2, int par3, int par4, boolean par5) {
/*  34 */     if (!redstoneUpdateInfoCache.containsKey(par1World))
/*     */     {
/*  36 */       redstoneUpdateInfoCache.put(par1World, new ArrayList());
/*     */     }
/*     */     
/*  39 */     if (par5)
/*     */     {
/*  41 */       ((List<alj>)redstoneUpdateInfoCache.get(par1World)).add(new alj(par2, par3, par4, par1World.G()));
/*     */     }
/*     */     
/*  44 */     int var6 = 0;
/*  45 */     Iterator<alj> var7 = ((List)redstoneUpdateInfoCache.get(par1World)).iterator();
/*     */     
/*  47 */     while (var7.hasNext()) {
/*     */       
/*  49 */       alj var8 = var7.next();
/*     */       
/*  51 */       if (var8.getX() == par2 && var8.getY() == par3 && var8.getZ() == par4) {
/*     */         
/*  53 */         var6++;
/*     */         
/*  55 */         if (var6 >= 8)
/*     */         {
/*  57 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  62 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SCPBlockElectricWool(int par1, int par2, boolean par3) {
/*  67 */     super(par1, par2, agi.q);
/*  68 */     this.torchActive = par3;
/*  69 */     b(true);
/*  70 */     a(mod_SCP.tabBlockSCP);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  79 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int q_() {
/*  84 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a_(ym par1IBlockAccess, int par2, int par3, int par4, int par5) {
/*  89 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  94 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int r_() {
/* 102 */     return 2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void g(yc par1World, int par2, int par3, int par4) {
/* 110 */     if (par1World.h(par2, par3, par4) == 0)
/*     */     {
/* 112 */       super.g(par1World, par2, par3, par4);
/*     */     }
/*     */     
/* 115 */     if (this.torchActive) {
/*     */       
/* 117 */       par1World.h(par2, par3 - 1, par4, this.cm);
/* 118 */       par1World.h(par2, par3 + 1, par4, this.cm);
/* 119 */       par1World.h(par2 - 1, par3, par4, this.cm);
/* 120 */       par1World.h(par2 + 1, par3, par4, this.cm);
/* 121 */       par1World.h(par2, par3, par4 - 1, this.cm);
/* 122 */       par1World.h(par2, par3, par4 + 1, this.cm);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, int par5, int par6) {
/* 131 */     if (this.torchActive) {
/*     */       
/* 133 */       par1World.h(par2, par3 - 1, par4, this.cm);
/* 134 */       par1World.h(par2, par3 + 1, par4, this.cm);
/* 135 */       par1World.h(par2 - 1, par3, par4, this.cm);
/* 136 */       par1World.h(par2 + 1, par3, par4, this.cm);
/* 137 */       par1World.h(par2, par3, par4 - 1, this.cm);
/* 138 */       par1World.h(par2, par3, par4 + 1, this.cm);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isPoweringTo(ym par1IBlockAccess, int par2, int par3, int par4, int par5) {
/* 147 */     if (!this.torchActive)
/*     */     {
/* 149 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 153 */     int var6 = par1IBlockAccess.h(par2, par3, par4);
/* 154 */     return (var6 == 5 && par5 == 1) ? false : ((var6 == 3 && par5 == 3) ? false : ((var6 == 4 && par5 == 2) ? false : ((var6 == 1 && par5 == 5) ? false : ((var6 != 2 || par5 != 4)))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isIndirectlyPowered(yc par1World, int par2, int par3, int par4) {
/* 163 */     int var5 = par1World.h(par2, par3, par4);
/* 164 */     return (var5 == 5 && par1World.l(par2, par3 - 1, par4, 0)) ? true : ((var5 == 3 && par1World.l(par2, par3, par4 - 1, 2)) ? true : ((var5 == 4 && par1World.l(par2, par3, par4 + 1, 3)) ? true : ((var5 == 1 && par1World.l(par2 - 1, par3, par4, 4)) ? true : ((var5 == 2 && par1World.l(par2 + 1, par3, par4, 5))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(yc par1World, int par2, int par3, int par4, Random par5Random) {
/* 172 */     boolean var6 = isIndirectlyPowered(par1World, par2, par3, par4);
/* 173 */     List<alj> var7 = (List)redstoneUpdateInfoCache.get(par1World);
/*     */     
/* 175 */     while (var7 != null && !var7.isEmpty() && par1World.G() - ((alj)var7.get(0)).getUpdateTime() > 60L)
/*     */     {
/* 177 */       var7.remove(0);
/*     */     }
/*     */     
/* 180 */     if (this.torchActive) {
/*     */       
/* 182 */       if (var6) {
/*     */         
/* 184 */         par1World.d(par2, par3, par4, mod_SCP.ElectricWool.cm, par1World.h(par2, par3, par4));
/*     */         
/* 186 */         if (checkForBurnout(par1World, par2, par3, par4, true))
/*     */         {
/* 188 */           par1World.a((par2 + 0.5F), (par3 + 0.5F), (par4 + 0.5F), "random.fizz", 0.5F, 2.6F + (par1World.t.nextFloat() - par1World.t.nextFloat()) * 0.8F);
/*     */           
/* 190 */           for (int var8 = 0; var8 < 5; var8++)
/*     */           {
/* 192 */             double var9 = par2 + par5Random.nextDouble() * 0.6D + 0.2D;
/* 193 */             double var11 = par3 + par5Random.nextDouble() * 0.6D + 0.2D;
/* 194 */             double var13 = par4 + par5Random.nextDouble() * 0.6D + 0.2D;
/*     */           }
/*     */         
/*     */         }
/*     */       
/*     */       } 
/* 200 */     } else if (!var6 && !checkForBurnout(par1World, par2, par3, par4, false)) {
/*     */       
/* 202 */       par1World.d(par2, par3, par4, mod_SCP.ElectricWool.cm, par1World.h(par2, par3, par4));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, int par5) {
/* 212 */     super.a(par1World, par2, par3, par4, par5);
/* 213 */     par1World.a(par2, par3, par4, this.cm, r_());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isIndirectlyPoweringTo(yc par1World, int par2, int par3, int par4, int par5) {
/* 221 */     return (par5 == 0) ? isPoweringTo((ym)par1World, par2, par3, par4, par5) : false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(int par1, Random par2Random, int par3) {
/* 229 */     return mod_SCP.ElectricWool.cm;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean i() {
/* 237 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, qx par5EntityPlayer) {
/* 242 */     ur var2 = par5EntityPlayer.bJ.g();
/* 243 */     if (var2 != null) {
/*     */       
/* 245 */       if (var2.c != mod_SCP.TothBrush.cj) par5EntityPlayer.d(new lm(mod_SCP.electricity.H, 10, 0));
/*     */     
/*     */     } else {
/*     */       
/* 249 */       par5EntityPlayer.d(new lm(mod_SCP.electricity.H, 10, 1));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(yc par1World, int par2, int par3, int par4) {
/* 258 */     return mod_SCP.ElectricWool.cm;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onTimeChanged(yc par1World, long par2, long par4) {
/* 266 */     List var6 = (List)redstoneUpdateInfoCache.get(par1World);
/*     */ 
/*     */     
/* 269 */     if (var6 != null)
/*     */     {
/* 271 */       for (Iterator<alj> var7 = var6.iterator(); var7.hasNext(); var8.setUpdateTime(var8.getUpdateTime() + par2))
/*     */       {
/* 273 */         alj var8 = var7.next();
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yc world, int i, int j, int k, lq entity) {
/* 280 */     ays ays = (ModLoader.getMinecraftInstance()).g;
/* 281 */     ur itemstack = ((qx)ays).bJ.b[3];
/*     */     
/* 283 */     if (itemstack != null && itemstack.c == up.ad.cj)
/*     */     {
/* 285 */       if (entity instanceof qx)
/*     */       {
/* 287 */         ((md)entity).d(new lm(mod_SCP.electricity.H, 100, 1));
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlockElectricWool.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */