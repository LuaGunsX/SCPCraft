/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import ModLoader;
/*     */ import SCPCraft.mod_SCP;
/*     */ import agi;
/*     */ import amq;
/*     */ import aoe;
/*     */ import java.util.Random;
/*     */ import yc;
/*     */ import ym;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCP310Fire
/*     */   extends amq
/*     */ {
/*  17 */   private int[] chanceToEncourageFire = new int[256];
/*  18 */   public yc worldObj = (yc)(ModLoader.getMinecraftInstance()).e;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  24 */   private int[] abilityToCatchFire = new int[256];
/*     */ 
/*     */   
/*     */   public SCP310Fire(int par1, int par2) {
/*  28 */     super(par1, par2, agi.o);
/*  29 */     b(true);
/*  30 */     a(mod_SCP.tabBlockSCP);
/*     */   }
/*     */ 
/*     */   
/*     */   public void t_() {
/*  35 */     setBurnRate(amq.A.cm, 5, 20);
/*  36 */     setBurnRate(amq.bQ.cm, 5, 20);
/*  37 */     setBurnRate(amq.bR.cm, 5, 20);
/*  38 */     setBurnRate(amq.bc.cm, 5, 20);
/*  39 */     setBurnRate(amq.aw.cm, 5, 20);
/*  40 */     setBurnRate(amq.ca.cm, 5, 20);
/*  41 */     setBurnRate(amq.bZ.cm, 5, 20);
/*  42 */     setBurnRate(amq.cb.cm, 5, 20);
/*  43 */     setBurnRate(amq.M.cm, 5, 5);
/*  44 */     setBurnRate(amq.N.cm, 30, 60);
/*  45 */     setBurnRate(amq.aq.cm, 30, 20);
/*  46 */     setBurnRate(amq.ap.cm, 15, 100);
/*  47 */     setBurnRate(amq.aa.cm, 60, 100);
/*  48 */     setBurnRate(amq.ae.cm, 30, 60);
/*  49 */     setBurnRate(amq.bx.cm, 15, 100);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setBurnRate(int par1, int par2, int par3) {
/*  54 */     this.chanceToEncourageFire[par1] = par2;
/*  55 */     this.abilityToCatchFire[par1] = par3;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public aoe e(yc par1World, int par2, int par3, int par4) {
/*  64 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  73 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  81 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int d() {
/*  89 */     return 3;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(Random par1Random) {
/*  97 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int r_() {
/* 105 */     return 30;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(yc par1World, int par2, int par3, int par4, Random par5Random) {
/* 113 */     boolean var6 = (par1World.a(par2, par3 - 1, par4) == amq.be.cm);
/* 114 */     var6 = true;
/*     */     
/* 116 */     if (par1World.u instanceof aat && par1World.a(par2, par3 - 1, par4) == amq.C.cm)
/*     */     {
/* 118 */       var6 = true;
/*     */     }
/*     */     
/* 121 */     if (!b(par1World, par2, par3, par4))
/*     */     {
/* 123 */       par1World.e(par2, par3, par4, 0);
/*     */     }
/*     */     
/* 126 */     if (par1World.N() && (par1World.D(par2, par3, par4) || par1World.D(par2 - 1, par3, par4) || par1World.D(par2 + 1, par3, par4) || par1World.D(par2, par3, par4 - 1) || par1World.D(par2, par3, par4 + 1))) {
/*     */       
/* 128 */       par1World.e(par2, par3, par4, 0);
/*     */     }
/*     */     else {
/*     */       
/* 132 */       int var7 = par1World.h(par2, par3, par4);
/*     */       
/* 134 */       if (var7 < 15)
/*     */       {
/* 136 */         par1World.d(par2, par3, par4, var7 + par5Random.nextInt(3) / 2);
/*     */       }
/*     */       
/* 139 */       par1World.a(par2, par3, par4, this.cm, r_() + par5Random.nextInt(10));
/*     */       
/* 141 */       if (!var6 && !canNeighborBurn(par1World, par2, par3, par4)) {
/*     */         
/* 143 */         if (!par1World.v(par2, par3 - 1, par4) || var7 > 3)
/*     */         {
/* 145 */           par1World.e(par2, par3, par4, 0);
/*     */         }
/*     */       }
/* 148 */       else if (!var6 && !canBlockCatchFire((ym)par1World, par2, par3 - 1, par4) && var7 == 15 && par5Random.nextInt(4) == 0) {
/*     */         
/* 150 */         par1World.e(par2, par3, par4, 0);
/*     */       }
/*     */       else {
/*     */         
/* 154 */         boolean var8 = par1World.E(par2, par3, par4);
/* 155 */         byte var9 = 0;
/*     */         
/* 157 */         if (var8)
/*     */         {
/* 159 */           var9 = -50;
/*     */         }
/*     */         
/* 162 */         tryToCatchBlockOnFire(par1World, par2 + 1, par3, par4, 300 + var9, par5Random, var7);
/* 163 */         tryToCatchBlockOnFire(par1World, par2 - 1, par3, par4, 300 + var9, par5Random, var7);
/* 164 */         tryToCatchBlockOnFire(par1World, par2, par3 - 1, par4, 250 + var9, par5Random, var7);
/* 165 */         tryToCatchBlockOnFire(par1World, par2, par3 + 1, par4, 250 + var9, par5Random, var7);
/* 166 */         tryToCatchBlockOnFire(par1World, par2, par3, par4 - 1, 300 + var9, par5Random, var7);
/* 167 */         tryToCatchBlockOnFire(par1World, par2, par3, par4 + 1, 300 + var9, par5Random, var7);
/*     */         
/* 169 */         for (int var10 = par2 - 1; var10 <= par2 + 1; var10++) {
/*     */           
/* 171 */           for (int var11 = par4 - 1; var11 <= par4 + 1; var11++) {
/*     */             
/* 173 */             for (int var12 = par3 - 1; var12 <= par3 + 4; var12++) {
/*     */               
/* 175 */               if (var10 != par2 || var12 != par3 || var11 != par4) {
/*     */                 
/* 177 */                 int var13 = 100;
/*     */                 
/* 179 */                 if (var12 > par3 + 1)
/*     */                 {
/* 181 */                   var13 += (var12 - par3 + 1) * 100;
/*     */                 }
/*     */                 
/* 184 */                 int var14 = getChanceOfNeighborsEncouragingFire(par1World, var10, var12, var11);
/*     */                 
/* 186 */                 if (var14 > 0) {
/*     */                   
/* 188 */                   int var15 = (var14 + 40) / (var7 + 30);
/*     */                   
/* 190 */                   if (var8)
/*     */                   {
/* 192 */                     var15 /= 2;
/*     */                   }
/*     */                   
/* 195 */                   if (var15 > 0 && par5Random.nextInt(var13) <= var15 && (!par1World.N() || !par1World.D(var10, var12, var11)) && !par1World.D(var10 - 1, var12, par4) && !par1World.D(var10 + 1, var12, var11) && !par1World.D(var10, var12, var11 - 1) && !par1World.D(var10, var12, var11 + 1)) {
/*     */                     
/* 197 */                     int var16 = var7 + par5Random.nextInt(5) / 4;
/*     */                     
/* 199 */                     if (var16 > 15)
/*     */                     {
/* 201 */                       var16 = 15;
/*     */                     }
/*     */                     
/* 204 */                     par1World.d(var10, var12, var11, this.cm, var16);
/*     */                   } 
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void tryToCatchBlockOnFire(yc par1World, int par2, int par3, int par4, int par5, Random par6Random, int par7) {
/* 217 */     int var8 = this.abilityToCatchFire[par1World.a(par2, par3, par4)];
/*     */     
/* 219 */     if (par6Random.nextInt(par5) < var8) {
/*     */       
/* 221 */       boolean var9 = (par1World.a(par2, par3, par4) == amq.ap.cm);
/*     */       
/* 223 */       if (par6Random.nextInt(par7 + 10) < 5 && !par1World.D(par2, par3, par4)) {
/*     */         
/* 225 */         int var10 = par7 + par6Random.nextInt(5) / 4;
/*     */         
/* 227 */         if (var10 > 15)
/*     */         {
/* 229 */           var10 = 15;
/*     */         }
/*     */         
/* 232 */         par1World.d(par2, par3, par4, this.cm, var10);
/*     */       }
/*     */       else {
/*     */         
/* 236 */         par1World.e(par2, par3, par4, 0);
/*     */       } 
/*     */       
/* 239 */       if (var9)
/*     */       {
/* 241 */         amq.ap.c(par1World, par2, par3, par4, 1);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean canNeighborBurn(yc par1World, int par2, int par3, int par4) {
/* 251 */     return canBlockCatchFire((ym)par1World, par2 + 1, par3, par4) ? true : (canBlockCatchFire((ym)par1World, par2 - 1, par3, par4) ? true : (canBlockCatchFire((ym)par1World, par2, par3 - 1, par4) ? true : (canBlockCatchFire((ym)par1World, par2, par3 + 1, par4) ? true : (canBlockCatchFire((ym)par1World, par2, par3, par4 - 1) ? true : canBlockCatchFire((ym)par1World, par2, par3, par4 + 1)))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int getChanceOfNeighborsEncouragingFire(yc par1World, int par2, int par3, int par4) {
/* 259 */     byte var5 = 0;
/*     */     
/* 261 */     if (!par1World.c(par2, par3, par4))
/*     */     {
/* 263 */       return 0;
/*     */     }
/*     */ 
/*     */     
/* 267 */     int var6 = getChanceToEncourageFire(par1World, par2 + 1, par3, par4, var5);
/* 268 */     var6 = getChanceToEncourageFire(par1World, par2 - 1, par3, par4, var6);
/* 269 */     var6 = getChanceToEncourageFire(par1World, par2, par3 - 1, par4, var6);
/* 270 */     var6 = getChanceToEncourageFire(par1World, par2, par3 + 1, par4, var6);
/* 271 */     var6 = getChanceToEncourageFire(par1World, par2, par3, par4 - 1, var6);
/* 272 */     var6 = getChanceToEncourageFire(par1World, par2, par3, par4 + 1, var6);
/* 273 */     return var6;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean m() {
/* 282 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canBlockCatchFire(ym par1IBlockAccess, int par2, int par3, int par4) {
/* 290 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getChanceToEncourageFire(yc par1World, int par2, int par3, int par4, int par5) {
/* 300 */     int var6 = 10;
/* 301 */     return (var6 > par5) ? var6 : par5;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(yc par1World, int par2, int par3, int par4) {
/* 309 */     return (par1World.v(par2, par3 - 1, par4) || canNeighborBurn(par1World, par2, par3, par4));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, int par5) {
/* 318 */     if (!par1World.v(par2, par3 - 1, par4) && !canNeighborBurn(par1World, par2, par3, par4))
/*     */     {
/* 320 */       par1World.e(par2, par3, par4, 0);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void g(yc par1World, int par2, int par3, int par4) {
/* 329 */     if (par1World.u.h > 0 || par1World.a(par2, par3 - 1, par4) != amq.as.cm || !amq.bh.i_(par1World, par2, par3, par4))
/*     */     {
/* 331 */       if (!par1World.v(par2, par3 - 1, par4) && !canNeighborBurn(par1World, par2, par3, par4)) {
/*     */         
/* 333 */         par1World.e(par2, par3, par4, 0);
/*     */       }
/*     */       else {
/*     */         
/* 337 */         par1World.a(par2, par3, par4, this.cm, r_() + par1World.t.nextInt(10));
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, Random par5Random) {
/* 347 */     if (par5Random.nextInt(24) == 0)
/*     */     {
/* 349 */       par1World.a((par2 + 0.5F), (par3 + 0.5F), (par4 + 0.5F), "fire.fire", 1.0F + par5Random.nextFloat(), par5Random.nextFloat() * 0.7F + 0.3F);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 357 */     if (!par1World.v(par2, par3 - 1, par4) && !amq.au.d((ym)par1World, par2, par3 - 1, par4)) {
/*     */       
/* 359 */       if (amq.au.d((ym)par1World, par2 - 1, par3, par4))
/*     */       {
/* 361 */         for (int var6 = 0; var6 < 2; var6++) {
/*     */           
/* 363 */           float var7 = par2 + par5Random.nextFloat() * 0.1F;
/* 364 */           float var8 = par3 + par5Random.nextFloat();
/* 365 */           float var9 = par4 + par5Random.nextFloat();
/* 366 */           par1World.a("largesmoke", var7, var8, var9, 0.0D, 0.0D, 0.0D);
/*     */         } 
/*     */       }
/*     */       
/* 370 */       if (amq.au.d((ym)par1World, par2 + 1, par3, par4))
/*     */       {
/* 372 */         for (int var6 = 0; var6 < 2; var6++) {
/*     */           
/* 374 */           float var7 = (par2 + 1) - par5Random.nextFloat() * 0.1F;
/* 375 */           float var8 = par3 + par5Random.nextFloat();
/* 376 */           float var9 = par4 + par5Random.nextFloat();
/* 377 */           par1World.a("largesmoke", var7, var8, var9, 0.0D, 0.0D, 0.0D);
/*     */         } 
/*     */       }
/*     */       
/* 381 */       if (amq.au.d((ym)par1World, par2, par3, par4 - 1))
/*     */       {
/* 383 */         for (int var6 = 0; var6 < 2; var6++) {
/*     */           
/* 385 */           float var7 = par2 + par5Random.nextFloat();
/* 386 */           float var8 = par3 + par5Random.nextFloat();
/* 387 */           float var9 = par4 + par5Random.nextFloat() * 0.1F;
/* 388 */           par1World.a("largesmoke", var7, var8, var9, 0.0D, 0.0D, 0.0D);
/*     */         } 
/*     */       }
/*     */       
/* 392 */       if (amq.au.d((ym)par1World, par2, par3, par4 + 1))
/*     */       {
/* 394 */         for (int var6 = 0; var6 < 2; var6++) {
/*     */           
/* 396 */           float var7 = par2 + par5Random.nextFloat();
/* 397 */           float var8 = par3 + par5Random.nextFloat();
/* 398 */           float var9 = (par4 + 1) - par5Random.nextFloat() * 0.1F;
/* 399 */           par1World.a("largesmoke", var7, var8, var9, 0.0D, 0.0D, 0.0D);
/*     */         } 
/*     */       }
/*     */       
/* 403 */       if (amq.au.d((ym)par1World, par2, par3 + 1, par4))
/*     */       {
/* 405 */         for (int var6 = 0; var6 < 2; var6++)
/*     */         {
/* 407 */           float var7 = par2 + par5Random.nextFloat();
/* 408 */           float var8 = (par3 + 1) - par5Random.nextFloat() * 0.1F;
/* 409 */           float var9 = par4 + par5Random.nextFloat();
/* 410 */           par1World.a("largesmoke", var7, var8, var9, 0.0D, 0.0D, 0.0D);
/*     */         }
/*     */       
/*     */       }
/*     */     } else {
/*     */       
/* 416 */       for (int var6 = 0; var6 < 3; var6++) {
/*     */         
/* 418 */         float var7 = par2 + par5Random.nextFloat();
/* 419 */         float var8 = par3 + par5Random.nextFloat() * 0.5F + 0.5F;
/* 420 */         float var9 = par4 + par5Random.nextFloat();
/* 421 */         par1World.a("largesmoke", var7, var8, var9, 0.0D, 0.0D, 0.0D);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCP310Fire.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */