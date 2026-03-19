/*     */ import SCPCraft.mod_SCP;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class akx
/*     */   extends amq
/*     */ {
/*     */   protected akx(int par1, agi par2Material) {
/*  18 */     super(par1, ((par2Material == agi.i) ? 14 : 12) * 16 + 13, par2Material);
/*  19 */     float var3 = 0.0F;
/*  20 */     float var4 = 0.0F;
/*  21 */     a(0.0F + var4, 0.0F + var3, 0.0F + var4, 1.0F + var4, 1.0F + var3, 1.0F + var4);
/*  22 */     b(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(ym par1IBlockAccess, int par2, int par3, int par4) {
/*  27 */     return (this.cB != agi.i);
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int o() {
/*  33 */     return 16777215;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int b(ym par1IBlockAccess, int par2, int par3, int par4) {
/*  44 */     if (this.cB != agi.h)
/*     */     {
/*  46 */       return 16777215;
/*     */     }
/*     */ 
/*     */     
/*  50 */     int var5 = 0;
/*  51 */     int var6 = 0;
/*  52 */     int var7 = 0;
/*     */     
/*  54 */     for (int var8 = -1; var8 <= 1; var8++) {
/*     */       
/*  56 */       for (int var9 = -1; var9 <= 1; var9++) {
/*     */         
/*  58 */         int var10 = par1IBlockAccess.a(par2 + var9, par4 + var8).getWaterColorMultiplier();
/*  59 */         var5 += (var10 & 0xFF0000) >> 16;
/*  60 */         var6 += (var10 & 0xFF00) >> 8;
/*  61 */         var7 += var10 & 0xFF;
/*     */       } 
/*     */     } 
/*     */     
/*  65 */     return (var5 / 9 & 0xFF) << 16 | (var6 / 9 & 0xFF) << 8 | var7 / 9 & 0xFF;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static float e(int par0) {
/*  74 */     if (par0 >= 8)
/*     */     {
/*  76 */       par0 = 0;
/*     */     }
/*     */     
/*  79 */     return (par0 + 1) / 9.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(int par1) {
/*  87 */     return (par1 != 0 && par1 != 1) ? (this.cl + 1) : this.cl;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int f_(yc par1World, int par2, int par3, int par4) {
/*  96 */     return (par1World.g(par2, par3, par4) == this.cB) ? par1World.h(par2, par3, par4) : -1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int d(ym par1IBlockAccess, int par2, int par3, int par4) {
/* 105 */     if (par1IBlockAccess.g(par2, par3, par4) != this.cB)
/*     */     {
/* 107 */       return -1;
/*     */     }
/*     */ 
/*     */     
/* 111 */     int var5 = par1IBlockAccess.h(par2, par3, par4);
/*     */     
/* 113 */     if (var5 >= 8)
/*     */     {
/* 115 */       var5 = 0;
/*     */     }
/*     */     
/* 118 */     return var5;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 127 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 136 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(int par1, boolean par2) {
/* 144 */     return (par2 && par1 == 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a_(ym par1IBlockAccess, int par2, int par3, int par4, int par5) {
/* 153 */     agi var6 = par1IBlockAccess.g(par2, par3, par4);
/* 154 */     return (var6 == this.cB) ? false : ((par5 == 1) ? true : ((var6 == agi.v) ? false : super.a_(par1IBlockAccess, par2, par3, par4, par5)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public boolean a(ym par1IBlockAccess, int par2, int par3, int par4, int par5) {
/* 165 */     agi var6 = par1IBlockAccess.g(par2, par3, par4);
/* 166 */     return (var6 == this.cB) ? false : ((par5 == 1) ? true : ((var6 == agi.v) ? false : super.a(par1IBlockAccess, par2, par3, par4, par5)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public aoe e(yc par1World, int par2, int par3, int par4) {
/* 175 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int d() {
/* 183 */     return 4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(int par1, Random par2Random, int par3) {
/* 191 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(Random par1Random) {
/* 199 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private aoj g(ym par1IBlockAccess, int par2, int par3, int par4) {
/* 207 */     aoj var5 = par1IBlockAccess.S().a(0.0D, 0.0D, 0.0D);
/* 208 */     int var6 = d(par1IBlockAccess, par2, par3, par4);
/*     */     
/* 210 */     for (int var7 = 0; var7 < 4; var7++) {
/*     */       
/* 212 */       int var8 = par2;
/* 213 */       int var10 = par4;
/*     */       
/* 215 */       if (var7 == 0)
/*     */       {
/* 217 */         var8 = par2 - 1;
/*     */       }
/*     */       
/* 220 */       if (var7 == 1)
/*     */       {
/* 222 */         var10 = par4 - 1;
/*     */       }
/*     */       
/* 225 */       if (var7 == 2)
/*     */       {
/* 227 */         var8++;
/*     */       }
/*     */       
/* 230 */       if (var7 == 3)
/*     */       {
/* 232 */         var10++;
/*     */       }
/*     */       
/* 235 */       int var11 = d(par1IBlockAccess, var8, par3, var10);
/*     */ 
/*     */       
/* 238 */       if (var11 < 0) {
/*     */         
/* 240 */         if (!par1IBlockAccess.g(var8, par3, var10).c()) {
/*     */           
/* 242 */           var11 = d(par1IBlockAccess, var8, par3 - 1, var10);
/*     */           
/* 244 */           if (var11 >= 0)
/*     */           {
/* 246 */             int var12 = var11 - var6 - 8;
/* 247 */             var5 = var5.c(((var8 - par2) * var12), ((par3 - par3) * var12), ((var10 - par4) * var12));
/*     */           }
/*     */         
/*     */         } 
/* 251 */       } else if (var11 >= 0) {
/*     */         
/* 253 */         int var12 = var11 - var6;
/* 254 */         var5 = var5.c(((var8 - par2) * var12), ((par3 - par3) * var12), ((var10 - par4) * var12));
/*     */       } 
/*     */     } 
/*     */     
/* 258 */     if (par1IBlockAccess.h(par2, par3, par4) >= 8) {
/*     */       
/* 260 */       boolean var13 = false;
/*     */       
/* 262 */       if (var13 || a_(par1IBlockAccess, par2, par3, par4 - 1, 2))
/*     */       {
/* 264 */         var13 = true;
/*     */       }
/*     */       
/* 267 */       if (var13 || a_(par1IBlockAccess, par2, par3, par4 + 1, 3))
/*     */       {
/* 269 */         var13 = true;
/*     */       }
/*     */       
/* 272 */       if (var13 || a_(par1IBlockAccess, par2 - 1, par3, par4, 4))
/*     */       {
/* 274 */         var13 = true;
/*     */       }
/*     */       
/* 277 */       if (var13 || a_(par1IBlockAccess, par2 + 1, par3, par4, 5))
/*     */       {
/* 279 */         var13 = true;
/*     */       }
/*     */       
/* 282 */       if (var13 || a_(par1IBlockAccess, par2, par3 + 1, par4 - 1, 2))
/*     */       {
/* 284 */         var13 = true;
/*     */       }
/*     */       
/* 287 */       if (var13 || a_(par1IBlockAccess, par2, par3 + 1, par4 + 1, 3))
/*     */       {
/* 289 */         var13 = true;
/*     */       }
/*     */       
/* 292 */       if (var13 || a_(par1IBlockAccess, par2 - 1, par3 + 1, par4, 4))
/*     */       {
/* 294 */         var13 = true;
/*     */       }
/*     */       
/* 297 */       if (var13 || a_(par1IBlockAccess, par2 + 1, par3 + 1, par4, 5))
/*     */       {
/* 299 */         var13 = true;
/*     */       }
/*     */       
/* 302 */       if (var13)
/*     */       {
/* 304 */         var5 = var5.a().c(0.0D, -6.0D, 0.0D);
/*     */       }
/*     */     } 
/*     */     
/* 308 */     var5 = var5.a();
/* 309 */     return var5;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, lq par5Entity, aoj par6Vec3) {
/* 317 */     aoj var7 = g(par1World, par2, par3, par4);
/* 318 */     par6Vec3.c += var7.c;
/* 319 */     par6Vec3.d += var7.d;
/* 320 */     par6Vec3.e += var7.e;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int r_() {
/* 328 */     return (this.cB == agi.h) ? 5 : ((this.cB == agi.i) ? 30 : 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int e(ym par1IBlockAccess, int par2, int par3, int par4) {
/* 338 */     int var5 = par1IBlockAccess.i(par2, par3, par4, 0);
/* 339 */     int var6 = par1IBlockAccess.i(par2, par3 + 1, par4, 0);
/* 340 */     int var7 = var5 & 0xFF;
/* 341 */     int var8 = var6 & 0xFF;
/* 342 */     int var9 = var5 >> 16 & 0xFF;
/* 343 */     int var10 = var6 >> 16 & 0xFF;
/* 344 */     return ((var7 > var8) ? var7 : var8) | ((var9 > var10) ? var9 : var10) << 16;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public float f(ym par1IBlockAccess, int par2, int par3, int par4) {
/* 354 */     float var5 = par1IBlockAccess.p(par2, par3, par4);
/* 355 */     float var6 = par1IBlockAccess.p(par2, par3 + 1, par4);
/* 356 */     return (var5 > var6) ? var5 : var6;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int n() {
/* 366 */     return (this.cB == agi.h) ? 1 : 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void a(yc par1World, int par2, int par3, int par4, Random par5Random) {
/* 378 */     if (this.cB == agi.h) {
/*     */       
/* 380 */       if (par5Random.nextInt(10) == 0) {
/*     */         
/* 382 */         int i = par1World.h(par2, par3, par4);
/*     */         
/* 384 */         if (i <= 0 || i >= 8)
/*     */         {
/* 386 */           par1World.a("suspended", (par2 + par5Random.nextFloat()), (par3 + par5Random.nextFloat()), (par4 + par5Random.nextFloat()), 0.0D, 0.0D, 0.0D);
/*     */         }
/*     */       } 
/*     */       
/* 390 */       for (int var6 = 0; var6 < 0; var6++) {
/*     */         
/* 392 */         int var7 = par5Random.nextInt(4);
/* 393 */         int var8 = par2;
/* 394 */         int var9 = par4;
/*     */         
/* 396 */         if (var7 == 0)
/*     */         {
/* 398 */           var8 = par2 - 1;
/*     */         }
/*     */         
/* 401 */         if (var7 == 1)
/*     */         {
/* 403 */           var8++;
/*     */         }
/*     */         
/* 406 */         if (var7 == 2)
/*     */         {
/* 408 */           var9 = par4 - 1;
/*     */         }
/*     */         
/* 411 */         if (var7 == 3)
/*     */         {
/* 413 */           var9++;
/*     */         }
/*     */         
/* 416 */         if (par1World.g(var8, par3, var9) == agi.a && (par1World.g(var8, par3 - 1, var9).c() || par1World.g(var8, par3 - 1, var9).d())) {
/*     */           
/* 418 */           float var10 = 0.0625F;
/* 419 */           double var11 = (par2 + par5Random.nextFloat());
/* 420 */           double var13 = (par3 + par5Random.nextFloat());
/* 421 */           double var15 = (par4 + par5Random.nextFloat());
/*     */           
/* 423 */           if (var7 == 0)
/*     */           {
/* 425 */             var11 = (par2 - var10);
/*     */           }
/*     */           
/* 428 */           if (var7 == 1)
/*     */           {
/* 430 */             var11 = ((par2 + 1) + var10);
/*     */           }
/*     */           
/* 433 */           if (var7 == 2)
/*     */           {
/* 435 */             var15 = (par4 - var10);
/*     */           }
/*     */           
/* 438 */           if (var7 == 3)
/*     */           {
/* 440 */             var15 = ((par4 + 1) + var10);
/*     */           }
/*     */           
/* 443 */           double var17 = 0.0D;
/* 444 */           double var19 = 0.0D;
/*     */           
/* 446 */           if (var7 == 0)
/*     */           {
/* 448 */             var17 = -var10;
/*     */           }
/*     */           
/* 451 */           if (var7 == 1)
/*     */           {
/* 453 */             var17 = var10;
/*     */           }
/*     */           
/* 456 */           if (var7 == 2)
/*     */           {
/* 458 */             var19 = -var10;
/*     */           }
/*     */           
/* 461 */           if (var7 == 3)
/*     */           {
/* 463 */             var19 = var10;
/*     */           }
/*     */           
/* 466 */           par1World.a("splash", var11, var13, var15, var17, 0.0D, var19);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 471 */     if (this.cB == agi.h && par5Random.nextInt(64) == 0) {
/*     */       
/* 473 */       int var6 = par1World.h(par2, par3, par4);
/*     */       
/* 475 */       if (var6 > 0 && var6 < 8)
/*     */       {
/* 477 */         par1World.a((par2 + 0.5F), (par3 + 0.5F), (par4 + 0.5F), "liquid.water", par5Random.nextFloat() * 0.25F + 0.75F, par5Random.nextFloat() * 1.0F + 0.5F, false);
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 485 */     if (this.cB == agi.i && par1World.g(par2, par3 + 1, par4) == agi.a && !par1World.s(par2, par3 + 1, par4)) {
/*     */       
/* 487 */       if (par5Random.nextInt(100) == 0) {
/*     */         
/* 489 */         double var21 = (par2 + par5Random.nextFloat());
/* 490 */         double var22 = par3 + this.cx;
/* 491 */         double var23 = (par4 + par5Random.nextFloat());
/* 492 */         par1World.a("lava", var21, var22, var23, 0.0D, 0.0D, 0.0D);
/* 493 */         par1World.a(var21, var22, var23, "liquid.lavapop", 0.2F + par5Random.nextFloat() * 0.2F, 0.9F + par5Random.nextFloat() * 0.15F, false);
/*     */       } 
/*     */       
/* 496 */       if (par5Random.nextInt(200) == 0)
/*     */       {
/* 498 */         par1World.a(par2, par3, par4, "liquid.lava", 0.2F + par5Random.nextFloat() * 0.2F, 0.9F + par5Random.nextFloat() * 0.15F, false);
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 503 */     if (this.cB == mod_SCP.SCP354 && par1World.g(par2, par3 + 1, par4) == agi.a && !par1World.s(par2, par3 + 1, par4))
/*     */     {
/* 505 */       if (par5Random.nextInt(100) == 0) {
/*     */         
/* 507 */         double var21 = (par2 + par5Random.nextFloat());
/* 508 */         double var22 = par3 + this.cx;
/* 509 */         double var23 = (par4 + par5Random.nextFloat());
/* 510 */         par1World.a(var21, var22, var23, "mob.ghast.scream", 0.2F + par5Random.nextFloat() * 0.2F, 0.9F + par5Random.nextFloat() * 0.15F);
/*     */       } 
/*     */     }
/*     */     
/* 514 */     if (par5Random.nextInt(10) == 0 && par1World.v(par2, par3 - 1, par4) && !par1World.g(par2, par3 - 2, par4).c()) {
/*     */       
/* 516 */       double var21 = (par2 + par5Random.nextFloat());
/* 517 */       double var22 = par3 - 1.05D;
/* 518 */       double var23 = (par4 + par5Random.nextFloat());
/*     */       
/* 520 */       if (this.cB == agi.h) {
/*     */         
/* 522 */         par1World.a("dripWater", var21, var22, var23, 0.0D, 0.0D, 0.0D);
/*     */       }
/*     */       else {
/*     */         
/* 526 */         par1World.a("dripLava", var21, var22, var23, 0.0D, 0.0D, 0.0D);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public static double a(ym par0IBlockAccess, int par1, int par2, int par3, agi par4Material) {
/* 538 */     aoj var5 = null;
/*     */     
/* 540 */     if (par4Material == agi.h)
/*     */     {
/* 542 */       var5 = ((akx)amq.D).g(par0IBlockAccess, par1, par2, par3);
/*     */     }
/*     */     
/* 545 */     if (par4Material == agi.i)
/*     */     {
/* 547 */       var5 = ((akx)amq.F).g(par0IBlockAccess, par1, par2, par3);
/*     */     }
/*     */ 
/*     */     
/* 551 */     if (par4Material == mod_SCP.SCP354)
/*     */     {
/* 553 */       var5 = ((akx)mod_SCP.SCP354Flowing).g(par0IBlockAccess, par1, par2, par3);
/*     */     }
/*     */ 
/*     */     
/* 557 */     return (var5.c == 0.0D && var5.e == 0.0D) ? -1000.0D : (Math.atan2(var5.e, var5.c) - 1.5707963267948966D);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void g(yc par1World, int par2, int par3, int par4) {
/* 565 */     l(par1World, par2, par3, par4);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, int par5) {
/* 574 */     l(par1World, par2, par3, par4);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void l(yc par1World, int par2, int par3, int par4) {
/* 582 */     if (par1World.a(par2, par3, par4) == this.cm)
/*     */     {
/* 584 */       if (this.cB == agi.i) {
/*     */         
/* 586 */         boolean var5 = false;
/*     */         
/* 588 */         if (var5 || par1World.g(par2, par3, par4 - 1) == agi.h)
/*     */         {
/* 590 */           var5 = true;
/*     */         }
/*     */         
/* 593 */         if (var5 || par1World.g(par2, par3, par4 + 1) == agi.h)
/*     */         {
/* 595 */           var5 = true;
/*     */         }
/*     */         
/* 598 */         if (var5 || par1World.g(par2 - 1, par3, par4) == agi.h)
/*     */         {
/* 600 */           var5 = true;
/*     */         }
/*     */         
/* 603 */         if (var5 || par1World.g(par2 + 1, par3, par4) == agi.h)
/*     */         {
/* 605 */           var5 = true;
/*     */         }
/*     */         
/* 608 */         if (var5 || par1World.g(par2, par3 + 1, par4) == agi.h)
/*     */         {
/* 610 */           var5 = true;
/*     */         }
/*     */         
/* 613 */         if (var5) {
/*     */           
/* 615 */           int var6 = par1World.h(par2, par3, par4);
/*     */           
/* 617 */           if (var6 == 0) {
/*     */             
/* 619 */             par1World.e(par2, par3, par4, amq.as.cm);
/*     */           }
/* 621 */           else if (var6 <= 4) {
/*     */             
/* 623 */             par1World.e(par2, par3, par4, amq.z.cm);
/*     */           } 
/*     */           
/* 626 */           j(par1World, par2, par3, par4);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 632 */     if (this.cB == mod_SCP.SCP354) {
/*     */       
/* 634 */       boolean var5 = false;
/*     */       
/* 636 */       if (var5 || par1World.g(par2, par3, par4 - 1) == agi.h || par1World.g(par2, par3, par4 - 1) == agi.i)
/*     */       {
/* 638 */         var5 = true;
/*     */       }
/*     */       
/* 641 */       if (var5 || par1World.g(par2, par3, par4 + 1) == agi.h || par1World.g(par2, par3, par4 + 1) == agi.i)
/*     */       {
/* 643 */         var5 = true;
/*     */       }
/*     */       
/* 646 */       if (var5 || par1World.g(par2 - 1, par3, par4) == agi.h || par1World.g(par2 - 1, par3, par4) == agi.i)
/*     */       {
/* 648 */         var5 = true;
/*     */       }
/*     */       
/* 651 */       if (var5 || par1World.g(par2 + 1, par3, par4) == agi.h || par1World.g(par2 + 1, par3, par4) == agi.i)
/*     */       {
/* 653 */         var5 = true;
/*     */       }
/*     */       
/* 656 */       if (var5 || par1World.g(par2, par3 + 1, par4) == agi.h || par1World.g(par2, par3 + 1, par4) == agi.i)
/*     */       {
/* 658 */         var5 = true;
/*     */       }
/*     */       
/* 661 */       if (var5) {
/*     */         
/* 663 */         int var6 = par1World.h(par2, par3, par4);
/* 664 */         float var1 = 0.3F;
/* 665 */         par1World.a((lq)null, par2, par3, par4, var1, true);
/* 666 */         if (var6 == 0) {
/*     */           
/* 668 */           par1World.e(par2, par3, par4, mod_SCP.BloodBlock.cm);
/*     */         }
/* 670 */         else if (var6 <= 4) {
/*     */           
/* 672 */           par1World.e(par2, par3, par4, mod_SCP.BloodBlock.cm);
/*     */         } 
/*     */         
/* 675 */         triggerSCP354MixEffects(par1World, par2, par3, par4);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void triggerSCP354MixEffects(yc par1World, int par2, int par3, int par4) {
/* 683 */     par1World.a((par2 + 0.5F), (par3 + 0.5F), (par4 + 0.5F), "random.explode", 0.5F, 2.6F + (par1World.t.nextFloat() - par1World.t.nextFloat()) * 0.8F);
/*     */     
/* 685 */     for (int var5 = 0; var5 < 8; var5++)
/*     */     {
/* 687 */       par1World.a("explosion", par2 + Math.random(), par3 + 1.2D, par4 + Math.random(), 0.0D, 0.0D, 0.0D);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void j(yc par1World, int par2, int par3, int par4) {
/* 696 */     par1World.a((par2 + 0.5F), (par3 + 0.5F), (par4 + 0.5F), "random.fizz", 0.5F, 2.6F + (par1World.t.nextFloat() - par1World.t.nextFloat()) * 0.8F);
/*     */     
/* 698 */     for (int var5 = 0; var5 < 8; var5++)
/*     */     {
/* 700 */       par1World.a("largesmoke", par2 + Math.random(), par3 + 1.2D, par4 + Math.random(), 0.0D, 0.0D, 0.0D);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/akx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */