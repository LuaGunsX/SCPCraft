/*     */ import SCPCraft.entities.SCPEntity015Boss;
/*     */ import SCPCraft.entities.SCPEntityReal682;
/*     */ import SCPCraft.mod_SCP;
/*     */ import SCPCraft.renders.SCPRender015Boss;
/*     */ import SCPCraft.renders.SCPRender682;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.awt.Color;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraftforge.common.ForgeHooks;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @SideOnly(Side.CLIENT)
/*     */ public class atr
/*     */   extends ats
/*     */ {
/*  41 */   private static final bce b = new bce();
/*  42 */   private final Random c = new Random();
/*     */   
/*     */   private final Minecraft d;
/*     */   
/*     */   private final atc e;
/*  47 */   private int f = 0;
/*     */ 
/*     */   
/*  50 */   private String g = "";
/*     */ 
/*     */   
/*  53 */   private int h = 0;
/*     */   
/*     */   private boolean i = false;
/*     */   
/*  57 */   public float a = 1.0F;
/*     */   
/*     */   private int k;
/*     */   private ur l;
/*     */   
/*     */   public atr(Minecraft par1Minecraft) {
/*  63 */     this.d = par1Minecraft;
/*  64 */     this.e = new atc(par1Minecraft);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float par1, boolean par2, int par3, int par4) {
/*  72 */     aum var5 = new aum(this.d.y, this.d.c, this.d.d);
/*  73 */     int var6 = var5.a();
/*  74 */     int var7 = var5.b();
/*  75 */     atq var8 = this.d.p;
/*  76 */     this.d.t.c();
/*  77 */     GL11.glEnable(3042);
/*     */     
/*  79 */     if (Minecraft.t()) {
/*     */       
/*  81 */       a(this.d.g.c(par1), var6, var7);
/*     */     }
/*     */     else {
/*     */       
/*  85 */       GL11.glBlendFunc(770, 771);
/*     */     } 
/*     */     
/*  88 */     ur var9 = this.d.g.bJ.f(3);
/*     */     
/*  90 */     if (this.d.y.W == 0 && var9 != null && var9.c == amq.bd.cm)
/*     */     {
/*  92 */       a(var6, var7);
/*     */     }
/*     */     
/*  95 */     if (!this.d.g.a(ll.k)) {
/*     */       
/*  97 */       float var10 = this.d.g.ck + (this.d.g.j - this.d.g.ck) * par1;
/*     */       
/*  99 */       if (var10 > 0.0F)
/*     */       {
/* 101 */         b(var10, var6, var7);
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 117 */     if (!this.d.b.a()) {
/*     */       
/* 119 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 120 */       GL11.glBindTexture(3553, this.d.o.b("/gui/gui.png"));
/* 121 */       qw var31 = this.d.g.bJ;
/* 122 */       this.j = -90.0F;
/* 123 */       b(var6 / 2 - 91, var7 - 22, 0, 0, 182, 22);
/* 124 */       b(var6 / 2 - 91 - 1 + var31.c * 20, var7 - 22 - 1, 0, 22, 24, 22);
/* 125 */       GL11.glBindTexture(3553, this.d.o.b("/gui/icons.png"));
/* 126 */       GL11.glEnable(3042);
/* 127 */       GL11.glBlendFunc(775, 769);
/* 128 */       b(var6 / 2 - 7, var7 / 2 - 7, 0, 0, 16, 16);
/* 129 */       GL11.glDisable(3042);
/* 130 */       boolean var11 = (this.d.g.ae / 3 % 2 == 1);
/*     */       
/* 132 */       if (this.d.g.ae < 10)
/*     */       {
/* 134 */         var11 = false;
/*     */       }
/*     */       
/* 137 */       int var12 = this.d.g.aU();
/* 138 */       int var13 = this.d.g.aS;
/* 139 */       this.c.setSeed((this.f * 312871));
/* 140 */       boolean var14 = false;
/* 141 */       rp var15 = this.d.g.cc();
/* 142 */       int var16 = var15.a();
/* 143 */       int var17 = var15.b();
/* 144 */       this.d.I.a("bossHealth");
/* 145 */       d();
/*     */       
/* 147 */       renderSCP015BossHealth();
/* 148 */       renderSCP682Health();
/* 149 */       this.d.I.b();
/*     */ 
/*     */       
/* 152 */       if (this.d.b.b()) {
/*     */         
/* 154 */         int i = var6 / 2 - 91;
/* 155 */         int var19 = var6 / 2 + 91;
/* 156 */         this.d.I.a("expBar");
/* 157 */         int var20 = this.d.g.cb();
/*     */         
/* 159 */         if (var20 > 0) {
/*     */           
/* 161 */           short var21 = 182;
/* 162 */           int k = (int)(this.d.g.cg * (var21 + 1));
/* 163 */           int j = var7 - 32 + 3;
/* 164 */           b(i, j, 0, 64, var21, 5);
/*     */           
/* 166 */           if (k > 0)
/*     */           {
/* 168 */             b(i, j, 0, 69, k, 5);
/*     */           }
/*     */         } 
/*     */         
/* 172 */         int var47 = var7 - 39;
/* 173 */         int var22 = var47 - 10;
/* 174 */         int var23 = ForgeHooks.getTotalArmorValue((qx)this.d.g);
/* 175 */         int var24 = -1;
/*     */         
/* 177 */         if (this.d.g.a(ll.l))
/*     */         {
/* 179 */           var24 = this.f % 25;
/*     */         }
/*     */         
/* 182 */         this.d.I.c("healthArmor");
/*     */ 
/*     */         
/*     */         int var25;
/*     */ 
/*     */         
/* 188 */         for (var25 = 0; var25 < 10; var25++) {
/*     */           
/* 190 */           if (var23 > 0) {
/*     */             
/* 192 */             int j = i + var25 * 8;
/*     */             
/* 194 */             if (var25 * 2 + 1 < var23)
/*     */             {
/* 196 */               b(j, var22, 34, 9, 9, 9);
/*     */             }
/*     */             
/* 199 */             if (var25 * 2 + 1 == var23)
/*     */             {
/* 201 */               b(j, var22, 25, 9, 9, 9);
/*     */             }
/*     */             
/* 204 */             if (var25 * 2 + 1 > var23)
/*     */             {
/* 206 */               b(j, var22, 16, 9, 9, 9);
/*     */             }
/*     */           } 
/*     */           
/* 210 */           int var26 = 16;
/*     */           
/* 212 */           if (this.d.g.a(ll.u)) {
/*     */             
/* 214 */             var26 += 36;
/*     */           }
/* 216 */           else if (this.d.g.a(ll.v)) {
/*     */             
/* 218 */             var26 += 72;
/*     */           } 
/*     */           
/* 221 */           byte var27 = 0;
/*     */           
/* 223 */           if (var11)
/*     */           {
/* 225 */             var27 = 1;
/*     */           }
/*     */           
/* 228 */           int var28 = i + var25 * 8;
/* 229 */           int var29 = var47;
/*     */           
/* 231 */           if (var12 <= 4)
/*     */           {
/* 233 */             var29 = var47 + this.c.nextInt(2);
/*     */           }
/*     */           
/* 236 */           if (var25 == var24)
/*     */           {
/* 238 */             var29 -= 2;
/*     */           }
/*     */           
/* 241 */           byte var30 = 0;
/*     */           
/* 243 */           if (this.d.e.K().t())
/*     */           {
/* 245 */             var30 = 5;
/*     */           }
/*     */ 
/*     */           
/* 249 */           if (this.d.g.a(mod_SCP.crystal)) {
/*     */             
/* 251 */             GL11.glBindTexture(3553, this.d.o.b("/SCPCraft/textures/guis/SCPIcons.png"));
/* 252 */             var26 += 18;
/*     */           } 
/*     */           
/* 255 */           b(var28, var29, 16 + var27 * 9, 9 * var30, 9, 9);
/*     */           
/* 257 */           if (var11) {
/*     */             
/* 259 */             if (var25 * 2 + 1 < var13)
/*     */             {
/* 261 */               b(var28, var29, var26 + 54, 9 * var30, 9, 9);
/*     */             }
/*     */             
/* 264 */             if (var25 * 2 + 1 == var13)
/*     */             {
/* 266 */               b(var28, var29, var26 + 63, 9 * var30, 9, 9);
/*     */             }
/*     */           } 
/*     */           
/* 270 */           if (var25 * 2 + 1 < var12)
/*     */           {
/* 272 */             b(var28, var29, var26 + 36, 9 * var30, 9, 9);
/*     */           }
/*     */           
/* 275 */           if (var25 * 2 + 1 == var12)
/*     */           {
/* 277 */             b(var28, var29, var26 + 45, 9 * var30, 9, 9);
/*     */           }
/*     */         } 
/*     */         
/* 281 */         this.d.I.c("food");
/*     */ 
/*     */         
/* 284 */         for (var25 = 0; var25 < 10; var25++) {
/*     */           
/* 286 */           int var26 = var47;
/* 287 */           int var51 = 16;
/* 288 */           byte var52 = 0;
/*     */           
/* 290 */           if (this.d.g.a(ll.s)) {
/*     */             
/* 292 */             var51 += 36;
/* 293 */             var52 = 13;
/*     */           } 
/*     */ 
/*     */           
/* 297 */           byte hungerY = 27;
/* 298 */           if (this.d.g.a(mod_SCP.crystal)) {
/*     */             
/* 300 */             GL11.glBindTexture(3553, this.d.o.b("/SCPCraft/textures/guis/SCPIcons.png"));
/* 301 */             var51 += 18;
/* 302 */             var52 = 0;
/* 303 */             hungerY = 9;
/*     */           } 
/*     */           
/* 306 */           if (this.d.g.cc().e() <= 0.0F && this.f % (var16 * 3 + 1) == 0)
/*     */           {
/* 308 */             var26 = var47 + this.c.nextInt(3) - 1;
/*     */           }
/*     */           
/* 311 */           if (var14)
/*     */           {
/* 313 */             var52 = 1;
/*     */           }
/*     */           
/* 316 */           int var29 = var19 - var25 * 8 - 9;
/*     */           
/* 318 */           b(var29, var26, 16 + var52 * 9, hungerY, 9, 9);
/* 319 */           if (var14) {
/*     */             
/* 321 */             if (var25 * 2 + 1 < var17)
/*     */             {
/*     */               
/* 324 */               b(var29, var26, var51 + 54, hungerY, 9, 9);
/*     */             }
/*     */             
/* 327 */             if (var25 * 2 + 1 == var17)
/*     */             {
/*     */               
/* 330 */               b(var29, var26, var51 + 63, hungerY, 9, 9);
/*     */             }
/*     */           } 
/*     */           
/* 334 */           if (var25 * 2 + 1 < var16)
/*     */           {
/*     */             
/* 337 */             b(var29, var26, var51 + 36, hungerY, 9, 9);
/*     */           }
/*     */           
/* 340 */           if (var25 * 2 + 1 == var16)
/*     */           {
/*     */             
/* 343 */             b(var29, var26, var51 + 45, hungerY, 9, 9);
/*     */           }
/*     */         } 
/*     */         
/* 347 */         this.d.I.c("air");
/*     */         
/* 349 */         if (this.d.g.a(agi.h)) {
/*     */           
/* 351 */           var25 = this.d.g.al();
/* 352 */           int var26 = ke.f((var25 - 2) * 10.0D / 300.0D);
/* 353 */           int var51 = ke.f(var25 * 10.0D / 300.0D) - var26;
/*     */           
/* 355 */           for (int var28 = 0; var28 < var26 + var51; var28++) {
/*     */             
/* 357 */             if (var28 < var26) {
/*     */               
/* 359 */               b(var19 - var28 * 8 - 9, var22, 16, 18, 9, 9);
/*     */             }
/*     */             else {
/*     */               
/* 363 */               b(var19 - var28 * 8 - 9, var22, 25, 18, 9, 9);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 368 */         this.d.I.b();
/*     */       } 
/*     */ 
/*     */       
/* 372 */       this.d.I.a("blinkBar");
/* 373 */       if (mod_SCP.isActive) {
/* 374 */         int var23 = var7 - 20;
/* 375 */         int var25 = this.d.g.getBlink();
/* 376 */         int var19 = var6 / 2 + 91;
/* 377 */         int var26 = ke.f((var25 + 2) * 10.0D / 300.0D);
/* 378 */         GL11.glBindTexture(3553, this.d.o.b("/SCPCraft/textures/guis/SCPIcons.png"));
/* 379 */         b(var19 - 281, var23 - 1, 0, 18, 83, 11);
/* 380 */         b(var19 - 301, var23 - 1, 83, 18, 17, 11);
/*     */         
/* 382 */         for (int var28 = 0; var28 < 10; var28++) {
/*     */           
/* 384 */           if (var28 < var26)
/*     */           {
/* 386 */             b(var19 + var28 * 8 - 280, var23, 100, 18, 9, 9);
/*     */           }
/*     */         } 
/*     */       } 
/*     */       
/* 391 */       GL11.glDisable(3042);
/* 392 */       this.d.I.a("actionBar");
/* 393 */       GL11.glEnable(32826);
/* 394 */       arw.c();
/*     */       
/* 396 */       for (int var18 = 0; var18 < 9; var18++) {
/*     */         
/* 398 */         int var19 = var6 / 2 - 90 + var18 * 20 + 2;
/* 399 */         int var20 = var7 - 16 - 3;
/* 400 */         a(var18, var19, var20, par1);
/*     */       } 
/*     */       
/* 403 */       arw.a();
/* 404 */       GL11.glDisable(32826);
/* 405 */       this.d.I.b();
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 410 */     if (this.d.g.a(mod_SCP.bloodStone)) {
/*     */       
/* 412 */       this.d.I.a("taint");
/* 413 */       GL11.glDisable(2929);
/* 414 */       GL11.glDisable(3008);
/* 415 */       int var32 = 25;
/* 416 */       int color = 5570560;
/* 417 */       if (this.d.g.b(mod_SCP.bloodStone).c() == 1) {
/* 418 */         color = 8521728;
/* 419 */         var32 = 50;
/*     */       } 
/* 421 */       if (this.d.g.b(mod_SCP.bloodStone).c() == 2) {
/* 422 */         color = 4981504;
/* 423 */         var32 = 100;
/*     */       } 
/* 425 */       float var33 = var32 / 100.0F;
/*     */       
/* 427 */       if (var33 > 1.0F)
/*     */       {
/* 429 */         var33 = 1.0F - (var32 - 100) / 10.0F;
/*     */       }
/*     */       
/* 432 */       int var12 = (int)(220.0F * var33) << 24 | color;
/* 433 */       a(0, 0, var6, var7, var12);
/* 434 */       GL11.glEnable(3008);
/* 435 */       GL11.glEnable(2929);
/* 436 */       this.d.I.b();
/*     */     } 
/* 438 */     if (this.d.g.a(mod_SCP.eaten)) {
/*     */       
/* 440 */       this.d.I.a("eat");
/* 441 */       GL11.glDisable(2929);
/* 442 */       GL11.glDisable(3008);
/* 443 */       int var32 = 3835 / (this.d.g.b(mod_SCP.eaten).b() + 1);
/* 444 */       float var33 = var32 / 100.0F;
/* 445 */       int var12 = var32 << 24 | 0x0;
/* 446 */       a(0, 0, var6, var7, var12);
/* 447 */       GL11.glEnable(3008);
/* 448 */       GL11.glEnable(2929);
/* 449 */       this.d.I.b();
/*     */     } 
/* 451 */     if (this.d.g.bY() > 0) {
/*     */       
/* 453 */       this.d.I.a("sleep");
/* 454 */       GL11.glDisable(2929);
/* 455 */       GL11.glDisable(3008);
/* 456 */       int var32 = this.d.g.bY();
/* 457 */       float var33 = var32 / 100.0F;
/*     */       
/* 459 */       if (var33 > 1.0F)
/*     */       {
/* 461 */         var33 = 1.0F - (var32 - 100) / 10.0F;
/*     */       }
/*     */       
/* 464 */       int var12 = (int)(220.0F * var33) << 24 | 0x101020;
/* 465 */       a(0, 0, var6, var7, var12);
/* 466 */       GL11.glEnable(3008);
/* 467 */       GL11.glEnable(2929);
/* 468 */       this.d.I.b();
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 474 */     if (this.d.b.f() && this.d.g.ce > 0) {
/*     */       
/* 476 */       this.d.I.a("expLevel");
/* 477 */       boolean var11 = false;
/* 478 */       int var12 = var11 ? 16777215 : 8453920;
/* 479 */       String var34 = "" + this.d.g.ce;
/* 480 */       int var38 = (var6 - var8.a(var34)) / 2;
/* 481 */       int var37 = var7 - 31 - 4;
/* 482 */       var8.b(var34, var38 + 1, var37, 0);
/* 483 */       var8.b(var34, var38 - 1, var37, 0);
/* 484 */       var8.b(var34, var38, var37 + 1, 0);
/* 485 */       var8.b(var34, var38, var37 - 1, 0);
/* 486 */       var8.b(var34, var38, var37, var12);
/* 487 */       this.d.I.b();
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 492 */     if (this.d.y.D) {
/*     */       
/* 494 */       this.d.I.a("toolHighlight");
/*     */       
/* 496 */       if (this.k > 0 && this.l != null) {
/*     */         
/* 498 */         String var35 = this.l.r();
/* 499 */         int var12 = (var6 - var8.a(var35)) / 2;
/* 500 */         int var13 = var7 - 59;
/*     */         
/* 502 */         if (!this.d.b.b())
/*     */         {
/* 504 */           var13 += 14;
/*     */         }
/*     */         
/* 507 */         int var38 = (int)(this.k * 256.0F / 10.0F);
/*     */         
/* 509 */         if (var38 > 255)
/*     */         {
/* 511 */           var38 = 255;
/*     */         }
/*     */         
/* 514 */         if (var38 > 0) {
/*     */           
/* 516 */           GL11.glPushMatrix();
/* 517 */           GL11.glEnable(3042);
/* 518 */           GL11.glBlendFunc(770, 771);
/* 519 */           var8.a(var35, var12, var13, 16777215 + (var38 << 24));
/* 520 */           GL11.glDisable(3042);
/* 521 */           GL11.glPopMatrix();
/*     */         } 
/*     */       } 
/*     */       
/* 525 */       this.d.I.b();
/*     */     } 
/*     */     
/* 528 */     if (this.d.q()) {
/*     */       
/* 530 */       this.d.I.a("demo");
/* 531 */       String var35 = "";
/*     */       
/* 533 */       if (this.d.e.F() >= 120500L) {
/*     */         
/* 535 */         var35 = bm.a("demo.demoExpired");
/*     */       }
/*     */       else {
/*     */         
/* 539 */         var35 = String.format(bm.a("demo.remainingTime"), new Object[] { km.a((int)(120500L - this.d.e.F())) });
/*     */       } 
/*     */       
/* 542 */       int var12 = var8.a(var35);
/* 543 */       var8.a(var35, var6 - var12 - 10, 5, 16777215);
/* 544 */       this.d.I.b();
/*     */     } 
/*     */     
/* 547 */     if (this.d.y.X) {
/*     */       
/* 549 */       this.d.I.a("debug");
/* 550 */       GL11.glPushMatrix();
/* 551 */       var8.a("Minecraft 1.4.6 (" + this.d.K + ")", 2, 2, 16777215);
/* 552 */       var8.a(this.d.m(), 2, 12, 16777215);
/* 553 */       var8.a(this.d.n(), 2, 22, 16777215);
/* 554 */       var8.a(this.d.p(), 2, 32, 16777215);
/* 555 */       var8.a(this.d.o(), 2, 42, 16777215);
/* 556 */       long var36 = Runtime.getRuntime().maxMemory();
/* 557 */       long var40 = Runtime.getRuntime().totalMemory();
/* 558 */       long var42 = Runtime.getRuntime().freeMemory();
/* 559 */       long var43 = var40 - var42;
/* 560 */       String var45 = "Used memory: " + (var43 * 100L / var36) + "% (" + (var43 / 1024L / 1024L) + "MB) of " + (var36 / 1024L / 1024L) + "MB";
/* 561 */       b(var8, var45, var6 - var8.a(var45) - 2, 2, 14737632);
/* 562 */       var45 = "Allocated memory: " + (var40 * 100L / var36) + "% (" + (var40 / 1024L / 1024L) + "MB)";
/* 563 */       b(var8, var45, var6 - var8.a(var45) - 2, 12, 14737632);
/* 564 */       int var47 = ke.c(this.d.g.t);
/* 565 */       int var22 = ke.c(this.d.g.u);
/* 566 */       int var23 = ke.c(this.d.g.v);
/* 567 */       b(var8, String.format("x: %.5f (%d) // c: %d (%d)", new Object[] { Double.valueOf(this.d.g.t), Integer.valueOf(var47), Integer.valueOf(var47 >> 4), Integer.valueOf(var47 & 0xF) }), 2, 64, 14737632);
/* 568 */       b(var8, String.format("y: %.3f (feet pos, %.3f eyes pos)", new Object[] { Double.valueOf(this.d.g.D.b), Double.valueOf(this.d.g.u) }), 2, 72, 14737632);
/* 569 */       b(var8, String.format("z: %.5f (%d) // c: %d (%d)", new Object[] { Double.valueOf(this.d.g.v), Integer.valueOf(var23), Integer.valueOf(var23 >> 4), Integer.valueOf(var23 & 0xF) }), 2, 80, 14737632);
/* 570 */       int var24 = ke.c((this.d.g.z * 4.0F / 360.0F) + 0.5D) & 0x3;
/* 571 */       b(var8, "f: " + var24 + " (" + q.c[var24] + ") / " + ke.g(this.d.g.z), 2, 88, 14737632);
/*     */       
/* 573 */       if (this.d.e != null && this.d.e.f(var47, var22, var23)) {
/*     */         
/* 575 */         zz var53 = this.d.e.d(var47, var23);
/* 576 */         b(var8, "lc: " + (var53.h() + 15) + " b: " + (var53.a(var47 & 0xF, var23 & 0xF, this.d.e.t())).y + " bl: " + var53.a(yo.b, var47 & 0xF, var22, var23 & 0xF) + " sl: " + var53.a(yo.a, var47 & 0xF, var22, var23 & 0xF) + " rl: " + var53.c(var47 & 0xF, var22, var23 & 0xF, 0), 2, 96, 14737632);
/*     */       } 
/*     */       
/* 579 */       b(var8, String.format("ws: %.3f, fs: %.3f, g: %b, fl: %d", new Object[] { Float.valueOf(this.d.g.cd.b()), Float.valueOf(this.d.g.cd.a()), Boolean.valueOf(this.d.g.E), Integer.valueOf(this.d.e.f(var47, var23)) }), 2, 104, 14737632);
/* 580 */       GL11.glPopMatrix();
/* 581 */       this.d.I.b();
/*     */     } 
/*     */     
/* 584 */     if (this.h > 0) {
/*     */       
/* 586 */       this.d.I.a("overlayMessage");
/* 587 */       float var33 = this.h - par1;
/* 588 */       int var12 = (int)(var33 * 256.0F / 20.0F);
/*     */       
/* 590 */       if (var12 > 255)
/*     */       {
/* 592 */         var12 = 255;
/*     */       }
/*     */       
/* 595 */       if (var12 > 0) {
/*     */         
/* 597 */         GL11.glPushMatrix();
/* 598 */         GL11.glTranslatef((var6 / 2), (var7 - 48), 0.0F);
/* 599 */         GL11.glEnable(3042);
/* 600 */         GL11.glBlendFunc(770, 771);
/* 601 */         int var13 = 16777215;
/*     */         
/* 603 */         if (this.i)
/*     */         {
/* 605 */           var13 = Color.HSBtoRGB(var33 / 50.0F, 0.7F, 0.6F) & 0xFFFFFF;
/*     */         }
/*     */ 
/*     */         
/* 609 */         if (this.g.contains("106")) this.g = "Now playing: GlennLeroi - 106"; 
/* 610 */         if (this.g.contains("173")) this.g = "Now playing: GlennLeroi - 173"; 
/* 611 */         if (this.g.contains("173E")) this.g = "Now playing: GlennLeroi - 173 - Extended"; 
/* 612 */         if (this.g.contains("914")) this.g = "Now playing: GlennLeroi - 914"; 
/* 613 */         if (this.g.contains("079")) this.g = "Now playing: GlennLeroi - 079"; 
/* 614 */         if (this.g.contains("789J")) this.g = "Now playing: GlennLeroi - 789-J"; 
/* 615 */         if (this.g.contains("087")) this.g = "Now playing: GlennLeroi - 087"; 
/* 616 */         if (this.g.contains("096")) this.g = "Now playing: GlennLeroi - 096"; 
/* 617 */         if (this.g.contains("420J")) this.g = "Now playing: GlennLeroi - 420-J"; 
/* 618 */         var8.b(this.g, -var8.a(this.g) / 2, -4, var13 + (var12 << 24));
/* 619 */         GL11.glDisable(3042);
/* 620 */         GL11.glPopMatrix();
/*     */       } 
/*     */       
/* 623 */       this.d.I.b();
/*     */     } 
/*     */     
/* 626 */     GL11.glEnable(3042);
/* 627 */     GL11.glBlendFunc(770, 771);
/* 628 */     GL11.glDisable(3008);
/* 629 */     GL11.glPushMatrix();
/* 630 */     GL11.glTranslatef(0.0F, (var7 - 48), 0.0F);
/* 631 */     this.d.I.a("chat");
/* 632 */     this.e.a(this.f);
/* 633 */     this.d.I.b();
/* 634 */     GL11.glPopMatrix();
/*     */     
/* 636 */     if (this.d.y.P.e && (!this.d.A() || this.d.g.a.c.size() > 1)) {
/*     */       
/* 638 */       this.d.I.a("playerList");
/* 639 */       ayh var41 = this.d.g.a;
/* 640 */       List<ayt> var39 = var41.c;
/* 641 */       int var13 = var41.d;
/* 642 */       int var38 = var13;
/*     */       int var37;
/* 644 */       for (var37 = 1; var38 > 20; var38 = (var13 + var37 - 1) / var37)
/*     */       {
/* 646 */         var37++;
/*     */       }
/*     */       
/* 649 */       int var16 = 300 / var37;
/*     */       
/* 651 */       if (var16 > 150)
/*     */       {
/* 653 */         var16 = 150;
/*     */       }
/*     */       
/* 656 */       int var17 = (var6 - var37 * var16) / 2;
/* 657 */       byte var44 = 10;
/* 658 */       a(var17 - 1, var44 - 1, var17 + var16 * var37, var44 + 9 * var38, -2147483648);
/*     */       
/* 660 */       for (int var19 = 0; var19 < var13; var19++) {
/*     */         
/* 662 */         int var20 = var17 + var19 % var37 * var16;
/* 663 */         int var47 = var44 + var19 / var37 * 9;
/* 664 */         a(var20, var47, var20 + var16 - 1, var47 + 8, 553648127);
/* 665 */         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 666 */         GL11.glEnable(3008);
/*     */         
/* 668 */         if (var19 < var39.size()) {
/*     */           byte var49;
/* 670 */           ayt var46 = var39.get(var19);
/* 671 */           var8.a(var46.a, var20, var47, 16777215);
/* 672 */           this.d.o.b(this.d.o.b("/gui/icons.png"));
/* 673 */           byte var50 = 0;
/* 674 */           boolean var48 = false;
/*     */ 
/*     */           
/* 677 */           if (var46.b < 0) {
/*     */             
/* 679 */             var49 = 5;
/*     */           }
/* 681 */           else if (var46.b < 150) {
/*     */             
/* 683 */             var49 = 0;
/*     */           }
/* 685 */           else if (var46.b < 300) {
/*     */             
/* 687 */             var49 = 1;
/*     */           }
/* 689 */           else if (var46.b < 600) {
/*     */             
/* 691 */             var49 = 2;
/*     */           }
/* 693 */           else if (var46.b < 1000) {
/*     */             
/* 695 */             var49 = 3;
/*     */           }
/*     */           else {
/*     */             
/* 699 */             var49 = 4;
/*     */           } 
/*     */           
/* 702 */           this.j += 100.0F;
/* 703 */           b(var20 + var16 - 12, var47, 0 + var50 * 10, 176 + var49 * 8, 10, 8);
/* 704 */           this.j -= 100.0F;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 709 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 710 */     GL11.glDisable(2896);
/* 711 */     GL11.glEnable(3008);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void renderSCP015BossHealth() {
/* 717 */     if (SCPRender015Boss.entityPipe != null) {
/*     */       
/* 719 */       SCPEntity015Boss var1 = SCPRender015Boss.entityPipe;
/* 720 */       SCPRender015Boss.entityPipe = null;
/* 721 */       atq var2 = this.d.p;
/* 722 */       aum var3 = new aum(this.d.y, this.d.c, this.d.d);
/* 723 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 724 */       GL11.glBindTexture(3553, this.d.o.b("/SCPCraft/textures/guis/SCPIcons.png"));
/* 725 */       int var4 = var3.a();
/* 726 */       short var5 = 182;
/* 727 */       int var6 = var4 / 2 - var5 / 2;
/* 728 */       int var7 = (int)(var1.getSCP015BossHealth() / var1.aT() * (var5 + 1));
/* 729 */       byte var8 = 12;
/* 730 */       b(var6, var8, 0, 30, var5, 5);
/* 731 */       b(var6, var8, 0, 30, var5, 5);
/*     */       
/* 733 */       if (var7 > 0)
/*     */       {
/* 735 */         b(var6, var8, 0, 35, var7, 5);
/*     */       }
/*     */       
/* 738 */       String var9 = "Nightmare Pipe Boss health";
/* 739 */       var2.a(var9, var4 / 2 - var2.a(var9) / 2, var8 - 10, 14496512);
/* 740 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 741 */       GL11.glBindTexture(3553, this.d.o.b("/gui/icons.png"));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void renderSCP682Health() {
/* 748 */     if (SCPRender682.entity682 != null) {
/*     */       
/* 750 */       SCPEntityReal682 var1 = SCPRender682.entity682;
/* 751 */       SCPRender682.entity682 = null;
/* 752 */       atq var2 = this.d.p;
/* 753 */       aum var3 = new aum(this.d.y, this.d.c, this.d.d);
/* 754 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 755 */       GL11.glBindTexture(3553, this.d.o.b("/SCPCraft/textures/guis/SCPIcons.png"));
/* 756 */       int var4 = var3.a();
/* 757 */       short var5 = 182;
/* 758 */       int var6 = var4 / 2 - var5 / 2;
/* 759 */       int var7 = (int)(var1.getSCP682Health() / var1.aT() * (var5 + 1));
/* 760 */       byte var8 = 12;
/* 761 */       b(var6, var8, 0, 41, var5, 5);
/* 762 */       b(var6, var8, 0, 41, var5, 5);
/*     */       
/* 764 */       if (var7 > 0)
/*     */       {
/* 766 */         b(var6, var8, 0, 46, var7, 5);
/*     */       }
/*     */       
/* 769 */       String var9 = "SCP-682 health";
/* 770 */       var2.a(var9, var4 / 2 - var2.a(var9) / 2, var8 - 10, 417792);
/* 771 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 772 */       GL11.glBindTexture(3553, this.d.o.b("/gui/icons.png"));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void d() {
/* 781 */     if (bai.c != null && bai.b > 0) {
/*     */       
/* 783 */       bai.b--;
/* 784 */       atq var1 = this.d.p;
/* 785 */       aum var2 = new aum(this.d.y, this.d.c, this.d.d);
/* 786 */       int var3 = var2.a();
/* 787 */       short var4 = 182;
/* 788 */       int var5 = var3 / 2 - var4 / 2;
/* 789 */       int var6 = (int)(bai.a * (var4 + 1));
/* 790 */       byte var7 = 12;
/* 791 */       b(var5, var7, 0, 74, var4, 5);
/* 792 */       b(var5, var7, 0, 74, var4, 5);
/*     */       
/* 794 */       if (var6 > 0)
/*     */       {
/* 796 */         b(var5, var7, 0, 79, var6, 5);
/*     */       }
/*     */       
/* 799 */       String var8 = bai.c;
/* 800 */       var1.a(var8, var3 / 2 - var1.a(var8) / 2, var7 - 10, 16777215);
/* 801 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 802 */       GL11.glBindTexture(3553, this.d.o.b("/gui/icons.png"));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(int par1, int par2) {
/* 808 */     GL11.glDisable(2929);
/* 809 */     GL11.glDepthMask(false);
/* 810 */     GL11.glBlendFunc(770, 771);
/* 811 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 812 */     GL11.glDisable(3008);
/* 813 */     GL11.glBindTexture(3553, this.d.o.b("%blur%/misc/pumpkinblur.png"));
/* 814 */     baz var3 = baz.a;
/* 815 */     var3.b();
/* 816 */     var3.a(0.0D, par2, -90.0D, 0.0D, 1.0D);
/* 817 */     var3.a(par1, par2, -90.0D, 1.0D, 1.0D);
/* 818 */     var3.a(par1, 0.0D, -90.0D, 1.0D, 0.0D);
/* 819 */     var3.a(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
/* 820 */     var3.a();
/* 821 */     GL11.glDepthMask(true);
/* 822 */     GL11.glEnable(2929);
/* 823 */     GL11.glEnable(3008);
/* 824 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(float par1, int par2, int par3) {
/* 832 */     par1 = 1.0F - par1;
/*     */     
/* 834 */     if (par1 < 0.0F)
/*     */     {
/* 836 */       par1 = 0.0F;
/*     */     }
/*     */     
/* 839 */     if (par1 > 1.0F)
/*     */     {
/* 841 */       par1 = 1.0F;
/*     */     }
/*     */     
/* 844 */     this.a = (float)(this.a + (par1 - this.a) * 0.01D);
/* 845 */     GL11.glDisable(2929);
/* 846 */     GL11.glDepthMask(false);
/* 847 */     GL11.glBlendFunc(0, 769);
/* 848 */     GL11.glColor4f(this.a, this.a, this.a, 1.0F);
/* 849 */     GL11.glBindTexture(3553, this.d.o.b("%blur%/misc/vignette.png"));
/* 850 */     baz var4 = baz.a;
/* 851 */     var4.b();
/* 852 */     var4.a(0.0D, par3, -90.0D, 0.0D, 1.0D);
/* 853 */     var4.a(par2, par3, -90.0D, 1.0D, 1.0D);
/* 854 */     var4.a(par2, 0.0D, -90.0D, 1.0D, 0.0D);
/* 855 */     var4.a(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
/* 856 */     var4.a();
/* 857 */     GL11.glDepthMask(true);
/* 858 */     GL11.glEnable(2929);
/* 859 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 860 */     GL11.glBlendFunc(770, 771);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void b(float par1, int par2, int par3) {
/* 868 */     if (par1 < 1.0F) {
/*     */       
/* 870 */       par1 *= par1;
/* 871 */       par1 *= par1;
/* 872 */       par1 = par1 * 0.8F + 0.2F;
/*     */     } 
/*     */     
/* 875 */     GL11.glDisable(3008);
/* 876 */     GL11.glDisable(2929);
/* 877 */     GL11.glDepthMask(false);
/* 878 */     GL11.glBlendFunc(770, 771);
/* 879 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, par1);
/* 880 */     GL11.glBindTexture(3553, this.d.o.b("/terrain.png"));
/* 881 */     float var4 = (amq.bh.cl % 16) / 16.0F;
/* 882 */     float var5 = (amq.bh.cl / 16) / 16.0F;
/* 883 */     float var6 = (amq.bh.cl % 16 + 1) / 16.0F;
/* 884 */     float var7 = (amq.bh.cl / 16 + 1) / 16.0F;
/* 885 */     baz var8 = baz.a;
/* 886 */     var8.b();
/* 887 */     var8.a(0.0D, par3, -90.0D, var4, var7);
/* 888 */     var8.a(par2, par3, -90.0D, var6, var7);
/* 889 */     var8.a(par2, 0.0D, -90.0D, var6, var5);
/* 890 */     var8.a(0.0D, 0.0D, -90.0D, var4, var5);
/* 891 */     var8.a();
/* 892 */     GL11.glDepthMask(true);
/* 893 */     GL11.glEnable(2929);
/* 894 */     GL11.glEnable(3008);
/* 895 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(int par1, int par2, int par3, float par4) {
/* 903 */     ur var5 = this.d.g.bJ.a[par1];
/*     */     
/* 905 */     if (var5 != null) {
/*     */       
/* 907 */       float var6 = var5.b - par4;
/*     */       
/* 909 */       if (var6 > 0.0F) {
/*     */         
/* 911 */         GL11.glPushMatrix();
/* 912 */         float var7 = 1.0F + var6 / 5.0F;
/* 913 */         GL11.glTranslatef((par2 + 8), (par3 + 12), 0.0F);
/* 914 */         GL11.glScalef(1.0F / var7, (var7 + 1.0F) / 2.0F, 1.0F);
/* 915 */         GL11.glTranslatef(-(par2 + 8), -(par3 + 12), 0.0F);
/*     */       } 
/*     */       
/* 918 */       b.b(this.d.p, this.d.o, var5, par2, par3);
/*     */       
/* 920 */       if (var6 > 0.0F)
/*     */       {
/* 922 */         GL11.glPopMatrix();
/*     */       }
/*     */       
/* 925 */       b.c(this.d.p, this.d.o, var5, par2, par3);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a() {
/* 934 */     if (this.h > 0)
/*     */     {
/* 936 */       this.h--;
/*     */     }
/*     */     
/* 939 */     this.f++;
/*     */     
/* 941 */     if (this.d.g != null) {
/*     */       
/* 943 */       ur var1 = this.d.g.bJ.g();
/*     */       
/* 945 */       if (var1 == null) {
/*     */         
/* 947 */         this.k = 0;
/*     */       }
/* 949 */       else if (this.l != null && var1.c == this.l.c && ur.a(var1, this.l) && (var1.f() || var1.j() == this.l.j())) {
/*     */         
/* 951 */         if (this.k > 0)
/*     */         {
/* 953 */           this.k--;
/*     */         }
/*     */       }
/*     */       else {
/*     */         
/* 958 */         this.k = 40;
/*     */       } 
/*     */       
/* 961 */       this.l = var1;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(String par1Str) {
/* 967 */     this.g = "Now playing: " + par1Str;
/* 968 */     this.h = 60;
/* 969 */     this.i = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public atc b() {
/* 977 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c() {
/* 982 */     return this.f;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/atr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */