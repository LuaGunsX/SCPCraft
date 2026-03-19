/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import ModLoader;
/*     */ import amq;
/*     */ import aoh;
/*     */ import aoj;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import ke;
/*     */ import lh;
/*     */ import lq;
/*     */ import md;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import qx;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPEntity173
/*     */   extends SCPEntity
/*     */ {
/*     */   public Minecraft mc;
/*     */   private boolean breakOnePerTick;
/*     */   private boolean canSeeSkyAndDay;
/*     */   private int slowPeriod;
/*     */   private int timeTillNextTeleport;
/*     */   private boolean timeLocked;
/*     */   private int fire;
/*     */   private int[] transparentBlocks;
/*     */   
/*     */   public SCPEntity173(yc world) {
/*  38 */     super(world); ModLoader.getMinecraftInstance(); this.mc = Minecraft.x(); this.transparentBlocks = new int[] { 8, 9, 10, 11, 18, 27, 28, 30, 31, 32, 37, 38, 39, 40, 44, 50, 51, 52, 59, 64, 65, 66, 67, 69, 70, 72, 75, 76, 77, 78, 83, 85, 90, 92, 106, 71, 107, 108, 109, 111, 
/*  39 */         113, 114, 114, 117 }; this.aG = "/SCPCraft/textures/mobs/173.png";
/*  40 */     this.attackStrength = 200;
/*  41 */     this.X = 4.0F;
/*  42 */     a(0.6F, 1.6F);
/*  43 */     this.aR = 9001;
/*  44 */     this.fire = 0;
/*  45 */     this.af = true;
/*  46 */     az().c(true);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(int par1, int par2, int par3, int par4) {
/*  51 */     a("sounds.173sound", 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void targetLivings() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public int aT() {
/*  61 */     return 9001;
/*     */   }
/*     */ 
/*     */   
/*     */   public float bB() {
/*  66 */     return super.bB() * 3.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean M() {
/*  71 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean be() {
/*  76 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_48150_h(boolean flag) {
/*  81 */     this.bF = flag;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/*  86 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int aN() {
/*  91 */     return 220;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected lq j() {
/* 100 */     qx entityplayer = this.p.a((lq)this, 16.0D);
/*     */     
/* 102 */     if (entityplayer != null && canSCPBeSeen(entityplayer))
/*     */     {
/* 104 */       return (lq)entityplayer;
/*     */     }
/*     */ 
/*     */     
/* 108 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(lq entity, float f) {
/* 117 */     if (this.a_ != null && this.a_ instanceof qx && !canSCPBeSeen((qx)this.a_)) {
/*     */       
/* 119 */       qx entityplayer = (qx)this.a_;
/*     */       
/* 121 */       if (this.aa.nextInt(20) != 0)
/*     */       {
/* 123 */         super.a(entity, f);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void bn() {
/* 131 */     if (this.a_ != null) {
/*     */       
/* 133 */       if (!canSCPBeSeen((qx)this.a_))
/*     */       {
/* 135 */         super.bn();
/*     */       }
/*     */     }
/*     */     else {
/*     */       
/* 140 */       super.bn();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void c_(qx par1EntityPlayer) {}
/*     */ 
/*     */   
/*     */   public boolean a(lh par1DamageSource, int par2) {
/* 150 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/* 155 */     this.bH = 80.0F;
/* 156 */     az().a(this.bH);
/* 157 */     this.bF = false;
/* 158 */     super.c();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void j_() {
/* 166 */     this.breakOnePerTick = false;
/* 167 */     this.bF = false;
/*     */     
/* 169 */     if (this.p.u()) {
/*     */       
/* 171 */       float f = c(1.0F);
/*     */       
/* 173 */       if (f > 0.5F && this.p.k(ke.c(this.t), ke.c(this.u), ke.c(this.v)) && this.aa.nextFloat() * 30.0F < (f - 0.4F) * 2.0F) {
/*     */         
/* 175 */         this.canSeeSkyAndDay = true;
/*     */       }
/*     */       else {
/*     */         
/* 179 */         this.canSeeSkyAndDay = false;
/*     */       } 
/*     */     } 
/*     */     
/* 183 */     if (this.a_ != null && this.a_ instanceof qx) {
/*     */       
/* 185 */       if (!canSCPBeSeen((qx)this.a_)) {
/*     */         
/* 187 */         if (getDistancetoEntityToAttack() > 15.0D && this.timeTillNextTeleport-- < 0)
/*     */         {
/* 189 */           this.timeTillNextTeleport = this.aa.nextInt(60) + 20;
/*     */         }
/*     */         
/* 192 */         if (this.a_ instanceof qx && getDistancetoEntityToAttack() <= 5.0D) {
/*     */           
/* 194 */           this.aG = "/SCPCraft/textures/mobs/173.png";
/*     */         
/*     */         }
/*     */         else {
/*     */           
/* 199 */           this.aG = "/SCPCraft/textures/mobs/173.png";
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 204 */       if (this.slowPeriod > 0) {
/*     */         
/* 206 */         this.slowPeriod--;
/* 207 */         this.a_.w *= 0.01D;
/* 208 */         this.a_.y *= 0.01D;
/*     */       } 
/*     */       
/* 211 */       if (this.a_ instanceof qx && (canSCPBeSeen((qx)this.a_) || this.timeLocked)) {
/*     */         
/* 213 */         SCPDirectLook((qx)this.a_);
/* 214 */         this.bC = this.bD = 0.0F;
/* 215 */         this.bH = 0.0F;
/*     */       
/*     */       }
/*     */       else {
/*     */         
/* 220 */         a(this.a_, 100.0F, 100.0F);
/*     */       } 
/*     */     } 
/*     */     
/* 224 */     super.j_();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canSCPBeSeen(qx entityplayer) {
/* 229 */     List var5 = this.p.a(SCPEntity131.class, this.D.b(4.0D, 2.0D, 4.0D));
/* 230 */     Iterator var2 = var5.iterator();
/* 231 */     if (var2.hasNext()) return true;
/*     */     
/* 233 */     if (this.p.l(ke.c(this.t), ke.c(this.u), ke.c(this.v)) < 1)
/*     */     {
/* 235 */       return false;
/*     */     }
/* 237 */     if (this.mc.g != null && this.mc.g.getBlink() >= 0 && this.mc.g.getBlink() <= 10) return false; 
/* 238 */     if (entityplayer.n((lq)this) || LineOfSightCheck((md)entityplayer))
/*     */     {
/* 240 */       return isInFieldOfVision(this, (md)entityplayer, 100.0F, 100.0F);
/*     */     }
/*     */ 
/*     */     
/* 244 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean LineOfSightCheck(md entityliving) {
/* 250 */     return (rayTraceBlocks(aoj.a(this.t, this.u + e(), this.v), aoj.a(entityliving.t, entityliving.u + entityliving.e(), entityliving.v)) == null || rayTraceBlocks(aoj.a(this.t, this.u + this.O, this.v), aoj.a(entityliving.t, entityliving.u + entityliving.e(), entityliving.v)) == null || rayTraceBlocks(aoj.a(this.t, this.u + this.O * 0.1D, this.v), aoj.a(entityliving.t, entityliving.u + entityliving.e(), entityliving.v)) == null || rayTraceBlocks(aoj.a(this.t + 0.7D, this.u + e(), this.v), aoj.a(entityliving.t, entityliving.u + entityliving.e(), entityliving.v)) == null || rayTraceBlocks(aoj.a(this.t - 0.7D, this.u + e(), this.v), aoj.a(entityliving.t, entityliving.u + entityliving.e(), entityliving.v)) == null || rayTraceBlocks(aoj.a(this.t, this.u + e(), this.v + 0.7D), aoj.a(entityliving.t, entityliving.u + entityliving.e(), entityliving.v)) == null || rayTraceBlocks(aoj.a(this.t, this.u + e(), this.v - 0.7D), aoj.a(entityliving.t, entityliving.u + entityliving.e(), entityliving.v)) == null || rayTraceBlocks(aoj.a(this.t, this.u + this.O * 1.2D, this.v - 0.7D), aoj.a(entityliving.t, entityliving.u + entityliving.e(), entityliving.v)) == null || rayTraceBlocks(aoj.a(this.t, this.u + this.O * 1.2D + 1.0D, this.v), aoj.a(entityliving.t, entityliving.u + entityliving.e(), entityliving.v)) == null);
/*     */   }
/*     */ 
/*     */   
/*     */   private aoh rayTraceBlocks(aoj Vec3, aoj Vec31) {
/* 255 */     boolean flag = false;
/* 256 */     boolean flag1 = false;
/*     */     
/* 258 */     if (Double.isNaN(Vec3.c) || Double.isNaN(Vec3.d) || Double.isNaN(Vec3.e))
/*     */     {
/* 260 */       return null;
/*     */     }
/*     */     
/* 263 */     if (Double.isNaN(Vec31.c) || Double.isNaN(Vec31.d) || Double.isNaN(Vec31.e))
/*     */     {
/* 265 */       return null;
/*     */     }
/*     */     
/* 268 */     int i = ke.c(Vec31.c);
/* 269 */     int j = ke.c(Vec31.d);
/* 270 */     int k = ke.c(Vec31.e);
/* 271 */     int l = ke.c(Vec3.c);
/* 272 */     int i1 = ke.c(Vec3.d);
/* 273 */     int j1 = ke.c(Vec3.e);
/* 274 */     int k1 = this.p.a(l, i1, j1);
/* 275 */     int l1 = this.p.h(l, i1, j1);
/* 276 */     amq block = amq.p[k1];
/*     */     
/* 278 */     if ((!flag1 || block == null || block.e(this.p, l, i1, j1) != null) && k1 > 0 && block.a(l1, flag)) {
/*     */       
/* 280 */       aoh movingobjectposition = block.a(this.p, l, i1, j1, Vec3, Vec31);
/*     */       
/* 282 */       if (movingobjectposition != null)
/*     */       {
/* 284 */         return movingobjectposition;
/*     */       }
/*     */     } 
/*     */     
/* 288 */     for (int i2 = 200; i2-- >= 0; ) {
/*     */       
/* 290 */       if (Double.isNaN(Vec3.c) || Double.isNaN(Vec3.d) || Double.isNaN(Vec3.e))
/*     */       {
/* 292 */         return null;
/*     */       }
/*     */       
/* 295 */       if (l == i && i1 == j && j1 == k)
/*     */       {
/* 297 */         return null;
/*     */       }
/*     */       
/* 300 */       boolean flag2 = true;
/* 301 */       boolean flag3 = true;
/* 302 */       boolean flag4 = true;
/* 303 */       double d = 999.0D;
/* 304 */       double d1 = 999.0D;
/* 305 */       double d2 = 999.0D;
/*     */       
/* 307 */       if (i > l) {
/*     */         
/* 309 */         d = l + 1.0D;
/*     */       }
/* 311 */       else if (i < l) {
/*     */         
/* 313 */         d = l + 0.0D;
/*     */       }
/*     */       else {
/*     */         
/* 317 */         flag2 = false;
/*     */       } 
/*     */       
/* 320 */       if (j > i1) {
/*     */         
/* 322 */         d1 = i1 + 1.0D;
/*     */       }
/* 324 */       else if (j < i1) {
/*     */         
/* 326 */         d1 = i1 + 0.0D;
/*     */       }
/*     */       else {
/*     */         
/* 330 */         flag3 = false;
/*     */       } 
/*     */       
/* 333 */       if (k > j1) {
/*     */         
/* 335 */         d2 = j1 + 1.0D;
/*     */       }
/* 337 */       else if (k < j1) {
/*     */         
/* 339 */         d2 = j1 + 0.0D;
/*     */       }
/*     */       else {
/*     */         
/* 343 */         flag4 = false;
/*     */       } 
/*     */       
/* 346 */       double d3 = 999.0D;
/* 347 */       double d4 = 999.0D;
/* 348 */       double d5 = 999.0D;
/* 349 */       double d6 = Vec31.c - Vec3.c;
/* 350 */       double d7 = Vec31.d - Vec3.d;
/* 351 */       double d8 = Vec31.e - Vec3.e;
/*     */       
/* 353 */       if (flag2)
/*     */       {
/* 355 */         d3 = (d - Vec3.c) / d6;
/*     */       }
/*     */       
/* 358 */       if (flag3)
/*     */       {
/* 360 */         d4 = (d1 - Vec3.d) / d7;
/*     */       }
/*     */       
/* 363 */       if (flag4)
/*     */       {
/* 365 */         d5 = (d2 - Vec3.e) / d8;
/*     */       }
/*     */       
/* 368 */       byte byte0 = 0;
/*     */       
/* 370 */       if (d3 < d4 && d3 < d5) {
/*     */         
/* 372 */         if (i > l) {
/*     */           
/* 374 */           byte0 = 4;
/*     */         }
/*     */         else {
/*     */           
/* 378 */           byte0 = 5;
/*     */         } 
/*     */         
/* 381 */         Vec3.c = d;
/* 382 */         Vec3.d += d7 * d3;
/* 383 */         Vec3.e += d8 * d3;
/*     */       }
/* 385 */       else if (d4 < d5) {
/*     */         
/* 387 */         if (j > i1) {
/*     */           
/* 389 */           byte0 = 0;
/*     */         }
/*     */         else {
/*     */           
/* 393 */           byte0 = 1;
/*     */         } 
/*     */         
/* 396 */         Vec3.c += d6 * d4;
/* 397 */         Vec3.d = d1;
/* 398 */         Vec3.e += d8 * d4;
/*     */       }
/*     */       else {
/*     */         
/* 402 */         if (k > j1) {
/*     */           
/* 404 */           byte0 = 2;
/*     */         }
/*     */         else {
/*     */           
/* 408 */           byte0 = 3;
/*     */         } 
/*     */         
/* 411 */         Vec3.c += d6 * d5;
/* 412 */         Vec3.d += d7 * d5;
/* 413 */         Vec3.e = d2;
/*     */       } 
/*     */       
/* 416 */       aoj Vec32 = aoj.a(Vec3.c, Vec3.d, Vec3.e);
/* 417 */       l = (int)(Vec32.c = ke.c(Vec3.c));
/*     */       
/* 419 */       if (byte0 == 5) {
/*     */         
/* 421 */         l--;
/* 422 */         Vec32.c++;
/*     */       } 
/*     */       
/* 425 */       i1 = (int)(Vec32.d = ke.c(Vec3.d));
/*     */       
/* 427 */       if (byte0 == 1) {
/*     */         
/* 429 */         i1--;
/* 430 */         Vec32.d++;
/*     */       } 
/*     */       
/* 433 */       j1 = (int)(Vec32.e = ke.c(Vec3.e));
/*     */       
/* 435 */       if (byte0 == 3) {
/*     */         
/* 437 */         j1--;
/* 438 */         Vec32.e++;
/*     */       } 
/*     */       
/* 441 */       int j2 = this.p.a(l, i1, j1);
/* 442 */       int k2 = this.p.h(l, i1, j1);
/* 443 */       amq block1 = amq.p[j2];
/*     */       
/* 445 */       if ((!flag1 || block1 == null || block1.e(this.p, l, i1, j1) != null) && j2 > 0 && block1.a(k2, flag) && !isBlockTransparent(j2)) {
/*     */         
/* 447 */         aoh movingobjectposition1 = block1.a(this.p, l, i1, j1, Vec3, Vec31);
/*     */         
/* 449 */         if (movingobjectposition1 != null)
/*     */         {
/* 451 */           return movingobjectposition1;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 456 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean isBlockTransparent(int i) {
/* 461 */     for (int j = 0; j < this.transparentBlocks.length; j++) {
/*     */       
/* 463 */       if (i == this.transparentBlocks[j])
/*     */       {
/* 465 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 469 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean checkForOtherSCPs() {
/* 474 */     int i = 0;
/* 475 */     List<lq> list = this.p.b((lq)this, this.D.b(20.0D, 20.0D, 20.0D));
/*     */     
/* 477 */     for (int j = 0; j < list.size(); j++) {
/*     */       
/* 479 */       lq entity = list.get(j);
/*     */       
/* 481 */       if (entity instanceof SCPEntity173) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 486 */         SCPEntity173 entityscp = (SCPEntity173)entity;
/*     */         
/* 488 */         if (entityscp.SCPSeeSCP(this))
/*     */         {
/* 490 */           i++;
/*     */         }
/*     */       } 
/*     */     } 
/* 494 */     if (i > 0) {
/*     */       
/* 496 */       this.timeLocked = true;
/*     */     }
/*     */     else {
/*     */       
/* 500 */       this.timeLocked = false;
/*     */     } 
/*     */     
/* 503 */     return (i > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean SCPDirectLook(qx entityplayer) {
/* 508 */     if (this.p.l(ke.c(this.t), ke.c(this.u), ke.c(this.v)) < 1)
/*     */     {
/* 510 */       return false;
/*     */     }
/*     */     
/* 513 */     aoj Vec3 = entityplayer.i(1.0F).a();
/* 514 */     aoj Vec31 = aoj.a(this.t - entityplayer.t, this.D.b + this.O - entityplayer.u + entityplayer.e(), this.v - entityplayer.v);
/* 515 */     double d = Vec31.b();
/* 516 */     Vec31 = Vec31.a();
/* 517 */     double d1 = Vec3.b(Vec31);
/*     */     
/* 519 */     if (d1 > 1.0D - 0.025D / d)
/*     */     {
/*     */ 
/*     */       
/* 523 */       return entityplayer.n((lq)this);
/*     */     }
/*     */ 
/*     */     
/* 527 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean SCPSeeSCP(SCPEntity173 entityscp) {
/* 533 */     if (this.p.l(ke.c(this.t), ke.c(this.u), ke.c(this.v)) < 1)
/*     */     {
/* 535 */       return false;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 541 */     return isInFieldOfVision(entityscp, (md)this, 40.0F, 65.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public double getDistance(int i, int j, int k, int l, int i1, int j1) {
/* 547 */     int k1 = l - i;
/* 548 */     int l1 = i1 - j;
/* 549 */     int i2 = j1 - k;
/* 550 */     return Math.sqrt((k1 * k1 + l1 * l1 + i2 * i2));
/*     */   }
/*     */ 
/*     */   
/*     */   public double getDistancetoEntityToAttack() {
/* 555 */     if (this.a_ instanceof qx) {
/*     */       
/* 557 */       double d = this.a_.t - this.t;
/* 558 */       double d2 = this.a_.u - this.u;
/* 559 */       double d4 = this.a_.v - this.v;
/* 560 */       return ke.a(d * d + d2 * d2 + d4 * d4);
/*     */     } 
/*     */     
/* 563 */     qx entityplayer = this.p.a((lq)this, 64.0D);
/*     */     
/* 565 */     if (entityplayer != null) {
/*     */       
/* 567 */       double d1 = entityplayer.t - this.t;
/* 568 */       double d3 = entityplayer.u - this.u;
/* 569 */       double d5 = entityplayer.v - this.v;
/* 570 */       return ke.a(d1 * d1 + d3 * d3 + d5 * d5);
/*     */     } 
/*     */ 
/*     */     
/* 574 */     return 40000.0D;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isInFieldOfVision(SCPEntity173 entityscp, md entityliving, float f, float f1) {
/* 580 */     float f2 = entityliving.z;
/* 581 */     float f3 = entityliving.A;
/* 582 */     entityliving.a((lq)entityscp, 360.0F, 360.0F);
/* 583 */     float f4 = entityliving.z;
/* 584 */     float f5 = entityliving.A;
/* 585 */     entityliving.z = f2;
/* 586 */     entityliving.A = f3;
/* 587 */     f2 = f4;
/* 588 */     f3 = f5;
/* 589 */     float f6 = f;
/* 590 */     float f7 = f1;
/* 591 */     float f8 = entityliving.z - f6;
/* 592 */     float f9 = entityliving.z + f6;
/* 593 */     float f10 = entityliving.A - f7;
/* 594 */     float f11 = entityliving.A + f7;
/* 595 */     boolean flag = GetFlag(f8, f9, f2, 0.0F, 360.0F);
/* 596 */     boolean flag1 = GetFlag(f10, f11, f3, -180.0F, 180.0F);
/* 597 */     return (flag && flag1 && (entityliving.n((lq)entityscp) || LineOfSightCheck(entityliving)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean GetFlag(float f, float f1, float f2, float f3, float f4) {
/* 602 */     if (f < f3) {
/*     */       
/* 604 */       if (f2 >= f + f4)
/*     */       {
/* 606 */         return true;
/*     */       }
/*     */       
/* 609 */       if (f2 <= f1)
/*     */       {
/* 611 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 615 */     if (f1 >= f4) {
/*     */       
/* 617 */       if (f2 <= f1 - f4)
/*     */       {
/* 619 */         return true;
/*     */       }
/*     */       
/* 622 */       if (f2 >= f)
/*     */       {
/* 624 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 628 */     if (f1 < f4 && f >= f3)
/*     */     {
/* 630 */       return (f2 <= f1 && f2 > f);
/*     */     }
/*     */ 
/*     */     
/* 634 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setYaw(float f) {
/* 640 */     this.z = f;
/*     */   }
/*     */ 
/*     */   
/*     */   protected String aY() {
/* 645 */     return "sounds.sculpture";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean L() {
/* 650 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int bv() {
/* 655 */     return 0;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity173.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */