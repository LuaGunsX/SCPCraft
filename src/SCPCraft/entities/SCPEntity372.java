/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import ModLoader;
/*     */ import SCPCraft.mod_SCP;
/*     */ import amq;
/*     */ import aoh;
/*     */ import aoj;
/*     */ import bq;
/*     */ import ke;
/*     */ import lh;
/*     */ import ln;
/*     */ import lq;
/*     */ import md;
/*     */ import mf;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import ox;
/*     */ import qx;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPEntity372
/*     */   extends ox
/*     */ {
/*     */   public Minecraft mc;
/*     */   public int directionX;
/*     */   public int directionZ;
/*     */   public int seen;
/*     */   private int[] transparentBlocks;
/*     */   
/*     */   public SCPEntity372(yc world) {
/*  35 */     super(world); ModLoader.getMinecraftInstance(); this.mc = Minecraft.x(); this.directionX = 0; this.directionZ = 0; this.transparentBlocks = new int[] { 8, 9, 10, 11, 18, 27, 28, 30, 31, 32, 37, 38, 39, 40, 44, 50, 51, 52, 59, 64, 65, 66, 67, 69, 70, 72, 75, 76, 77, 78, 83, 85, 90, 92, 106, 71, 107, 108, 109, 111, 
/*  36 */         113, 114, 114, 117 }; this.aG = "/SCPCraft/textures/mobs/372.png";
/*  37 */     a(1.4F, 0.9F);
/*  38 */     this.bH = 1.25F;
/*  39 */     this.X = 1.0F;
/*  40 */     float f = 0.25F;
/*  41 */     this.seen = 0;
/*  42 */     az().a(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public SCPEnumCreatureAttribute getSCPAttribute() {
/*  47 */     return SCPEnumCreatureAttribute.SCP;
/*     */   }
/*     */ 
/*     */   
/*     */   public float R() {
/*  52 */     return 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean be() {
/*  57 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/*  62 */     super.a();
/*  63 */     this.ag.a(16, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/*  68 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  73 */     super.c();
/*  74 */     if (this.aa.nextInt(200) == 0) { for (int m = 0; m <= 1000; ) { this.aG = "/scp/372.png"; m++; }  }
/*  75 */     else { this.aG = "/scp/513B.png"; }
/*     */   
/*     */   }
/*     */   
/*     */   public boolean a(lh par1DamageSource, int par2) {
/*  80 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void j_() {
/*  85 */     super.j_();
/*  86 */     qx entityplayer = this.p.b((lq)this, 16.0D);
/*  87 */     if (entityplayer != null && canSCPBeSeen(entityplayer) && !this.p.I) {
/*     */       
/*  89 */       this.seen++;
/*  90 */       if (entityplayer.L) this.seen = 0; 
/*  91 */       az().a(entityplayer.t + this.directionX, entityplayer.u, entityplayer.v + this.directionZ, this.bH);
/*     */     } 
/*  93 */     if (this.seen >= 1500) this.isAggro = true; 
/*  94 */     if (!this.p.I)
/*     */     {
/*  96 */       func_40148_a(this.F);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canSCPBeSeen(qx entityplayer) {
/* 102 */     if (this.p.l(ke.c(this.t), ke.c(this.u), ke.c(this.v)) < 1)
/*     */     {
/* 104 */       return false;
/*     */     }
/* 106 */     if (this.p.b((lq)this, 16.0D) != null && this.p.b((lq)this, 16.0D).getBlink() >= 0 && this.p.b((lq)this, 16.0D).getBlink() <= 10) return false;
/*     */     
/* 108 */     if (entityplayer.n((lq)this) || LineOfSightCheck((md)entityplayer))
/*     */     {
/* 110 */       return isInFieldOfVision(this, (md)entityplayer, 100.0F, 100.0F);
/*     */     }
/*     */ 
/*     */     
/* 114 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean LineOfSightCheck(md entityliving) {
/* 120 */     return (rayTraceBlocks(aoj.a(this.t, this.u + e(), this.v), aoj.a(entityliving.t, entityliving.u + entityliving.e(), entityliving.v)) == null || rayTraceBlocks(aoj.a(this.t, this.u + this.O, this.v), aoj.a(entityliving.t, entityliving.u + entityliving.e(), entityliving.v)) == null || rayTraceBlocks(aoj.a(this.t, this.u + this.O * 0.1D, this.v), aoj.a(entityliving.t, entityliving.u + entityliving.e(), entityliving.v)) == null || rayTraceBlocks(aoj.a(this.t + 0.7D, this.u + e(), this.v), aoj.a(entityliving.t, entityliving.u + entityliving.e(), entityliving.v)) == null || rayTraceBlocks(aoj.a(this.t - 0.7D, this.u + e(), this.v), aoj.a(entityliving.t, entityliving.u + entityliving.e(), entityliving.v)) == null || rayTraceBlocks(aoj.a(this.t, this.u + e(), this.v + 0.7D), aoj.a(entityliving.t, entityliving.u + entityliving.e(), entityliving.v)) == null || rayTraceBlocks(aoj.a(this.t, this.u + e(), this.v - 0.7D), aoj.a(entityliving.t, entityliving.u + entityliving.e(), entityliving.v)) == null || rayTraceBlocks(aoj.a(this.t, this.u + this.O * 1.2D, this.v - 0.7D), aoj.a(entityliving.t, entityliving.u + entityliving.e(), entityliving.v)) == null || rayTraceBlocks(aoj.a(this.t, this.u + this.O * 1.2D + 1.0D, this.v), aoj.a(entityliving.t, entityliving.u + entityliving.e(), entityliving.v)) == null);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/* 125 */     ur var2 = par1EntityPlayer.bJ.g();
/*     */     
/* 127 */     if (var2 != null && var2.c == mod_SCP.SCP1023ARC.cj) {
/*     */       
/* 129 */       x();
/* 130 */       this.p.a("largeexplode", this.t, this.u + (this.O / 2.0F), this.v, 0.0D, 0.0D, 0.0D);
/* 131 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 135 */     return super.a(par1EntityPlayer);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private aoh rayTraceBlocks(aoj Vec3, aoj Vec31) {
/* 141 */     boolean flag = false;
/* 142 */     boolean flag1 = false;
/*     */     
/* 144 */     if (Double.isNaN(Vec3.c) || Double.isNaN(Vec3.d) || Double.isNaN(Vec3.e))
/*     */     {
/* 146 */       return null;
/*     */     }
/*     */     
/* 149 */     if (Double.isNaN(Vec31.c) || Double.isNaN(Vec31.d) || Double.isNaN(Vec31.e))
/*     */     {
/* 151 */       return null;
/*     */     }
/*     */     
/* 154 */     int i = ke.c(Vec31.c);
/* 155 */     int j = ke.c(Vec31.d);
/* 156 */     int k = ke.c(Vec31.e);
/* 157 */     int l = ke.c(Vec3.c);
/* 158 */     int i1 = ke.c(Vec3.d);
/* 159 */     int j1 = ke.c(Vec3.e);
/* 160 */     int k1 = this.p.a(l, i1, j1);
/* 161 */     int l1 = this.p.h(l, i1, j1);
/* 162 */     amq block = amq.p[k1];
/*     */     
/* 164 */     if ((!flag1 || block == null || block.e(this.p, l, i1, j1) != null) && k1 > 0 && block.a(l1, flag)) {
/*     */       
/* 166 */       aoh movingobjectposition = block.a(this.p, l, i1, j1, Vec3, Vec31);
/*     */       
/* 168 */       if (movingobjectposition != null)
/*     */       {
/* 170 */         return movingobjectposition;
/*     */       }
/*     */     } 
/*     */     
/* 174 */     for (int i2 = 200; i2-- >= 0; ) {
/*     */       
/* 176 */       if (Double.isNaN(Vec3.c) || Double.isNaN(Vec3.d) || Double.isNaN(Vec3.e))
/*     */       {
/* 178 */         return null;
/*     */       }
/*     */       
/* 181 */       if (l == i && i1 == j && j1 == k)
/*     */       {
/* 183 */         return null;
/*     */       }
/*     */       
/* 186 */       boolean flag2 = true;
/* 187 */       boolean flag3 = true;
/* 188 */       boolean flag4 = true;
/* 189 */       double d = 999.0D;
/* 190 */       double d1 = 999.0D;
/* 191 */       double d2 = 999.0D;
/*     */       
/* 193 */       if (i > l) {
/*     */         
/* 195 */         d = l + 1.0D;
/*     */       }
/* 197 */       else if (i < l) {
/*     */         
/* 199 */         d = l + 0.0D;
/*     */       }
/*     */       else {
/*     */         
/* 203 */         flag2 = false;
/*     */       } 
/*     */       
/* 206 */       if (j > i1) {
/*     */         
/* 208 */         d1 = i1 + 1.0D;
/*     */       }
/* 210 */       else if (j < i1) {
/*     */         
/* 212 */         d1 = i1 + 0.0D;
/*     */       }
/*     */       else {
/*     */         
/* 216 */         flag3 = false;
/*     */       } 
/*     */       
/* 219 */       if (k > j1) {
/*     */         
/* 221 */         d2 = j1 + 1.0D;
/*     */       }
/* 223 */       else if (k < j1) {
/*     */         
/* 225 */         d2 = j1 + 0.0D;
/*     */       }
/*     */       else {
/*     */         
/* 229 */         flag4 = false;
/*     */       } 
/*     */       
/* 232 */       double d3 = 999.0D;
/* 233 */       double d4 = 999.0D;
/* 234 */       double d5 = 999.0D;
/* 235 */       double d6 = Vec31.c - Vec3.c;
/* 236 */       double d7 = Vec31.d - Vec3.d;
/* 237 */       double d8 = Vec31.e - Vec3.e;
/*     */       
/* 239 */       if (flag2)
/*     */       {
/* 241 */         d3 = (d - Vec3.c) / d6;
/*     */       }
/*     */       
/* 244 */       if (flag3)
/*     */       {
/* 246 */         d4 = (d1 - Vec3.d) / d7;
/*     */       }
/*     */       
/* 249 */       if (flag4)
/*     */       {
/* 251 */         d5 = (d2 - Vec3.e) / d8;
/*     */       }
/*     */       
/* 254 */       byte byte0 = 0;
/*     */       
/* 256 */       if (d3 < d4 && d3 < d5) {
/*     */         
/* 258 */         if (i > l) {
/*     */           
/* 260 */           byte0 = 4;
/*     */         }
/*     */         else {
/*     */           
/* 264 */           byte0 = 5;
/*     */         } 
/*     */         
/* 267 */         Vec3.c = d;
/* 268 */         Vec3.d += d7 * d3;
/* 269 */         Vec3.e += d8 * d3;
/*     */       }
/* 271 */       else if (d4 < d5) {
/*     */         
/* 273 */         if (j > i1) {
/*     */           
/* 275 */           byte0 = 0;
/*     */         }
/*     */         else {
/*     */           
/* 279 */           byte0 = 1;
/*     */         } 
/*     */         
/* 282 */         Vec3.c += d6 * d4;
/* 283 */         Vec3.d = d1;
/* 284 */         Vec3.e += d8 * d4;
/*     */       }
/*     */       else {
/*     */         
/* 288 */         if (k > j1) {
/*     */           
/* 290 */           byte0 = 2;
/*     */         }
/*     */         else {
/*     */           
/* 294 */           byte0 = 3;
/*     */         } 
/*     */         
/* 297 */         Vec3.c += d6 * d5;
/* 298 */         Vec3.d += d7 * d5;
/* 299 */         Vec3.e = d2;
/*     */       } 
/*     */       
/* 302 */       aoj Vec32 = aoj.a(Vec3.c, Vec3.d, Vec3.e);
/* 303 */       l = (int)(Vec32.c = ke.c(Vec3.c));
/*     */       
/* 305 */       if (byte0 == 5) {
/*     */         
/* 307 */         l--;
/* 308 */         Vec32.c++;
/*     */       } 
/*     */       
/* 311 */       i1 = (int)(Vec32.d = ke.c(Vec3.d));
/*     */       
/* 313 */       if (byte0 == 1) {
/*     */         
/* 315 */         i1--;
/* 316 */         Vec32.d++;
/*     */       } 
/*     */       
/* 319 */       j1 = (int)(Vec32.e = ke.c(Vec3.e));
/*     */       
/* 321 */       if (byte0 == 3) {
/*     */         
/* 323 */         j1--;
/* 324 */         Vec32.e++;
/*     */       } 
/*     */       
/* 327 */       int j2 = this.p.a(l, i1, j1);
/* 328 */       int k2 = this.p.h(l, i1, j1);
/* 329 */       amq block1 = amq.p[j2];
/*     */       
/* 331 */       if ((!flag1 || block1 == null || block1.e(this.p, l, i1, j1) != null) && j2 > 0 && block1.a(k2, flag) && !isBlockTransparent(j2)) {
/*     */         
/* 333 */         aoh movingobjectposition1 = block1.a(this.p, l, i1, j1, Vec3, Vec31);
/*     */         
/* 335 */         if (movingobjectposition1 != null)
/*     */         {
/* 337 */           return movingobjectposition1;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 342 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean isBlockTransparent(int i) {
/* 347 */     for (int j = 0; j < this.transparentBlocks.length; j++) {
/*     */       
/* 349 */       if (i == this.transparentBlocks[j])
/*     */       {
/* 351 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 355 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean SCPDirectLook(qx entityplayer) {
/* 360 */     if (this.p.l(ke.c(this.t), ke.c(this.u), ke.c(this.v)) < 1)
/*     */     {
/* 362 */       return false;
/*     */     }
/*     */     
/* 365 */     aoj Vec3 = entityplayer.i(1.0F).a();
/* 366 */     aoj Vec31 = aoj.a(this.t - entityplayer.t, this.D.b + this.O - entityplayer.u + entityplayer.e(), this.v - entityplayer.v);
/* 367 */     double d = Vec31.b();
/* 368 */     Vec31 = Vec31.a();
/* 369 */     double d1 = Vec3.b(Vec31);
/*     */     
/* 371 */     if (d1 > 1.0D - 0.025D / d)
/*     */     {
/* 373 */       return entityplayer.n((lq)this);
/*     */     }
/*     */ 
/*     */     
/* 377 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public double getDistance(int i, int j, int k, int l, int i1, int j1) {
/* 383 */     int k1 = l - i;
/* 384 */     int l1 = i1 - j;
/* 385 */     int i2 = j1 - k;
/* 386 */     return Math.sqrt((k1 * k1 + l1 * l1 + i2 * i2));
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean isInFieldOfVision(SCPEntity372 entityscp, md entityliving, float f, float f1) {
/* 391 */     float f2 = entityliving.z;
/* 392 */     float f3 = entityliving.A;
/* 393 */     entityliving.a((lq)entityscp, 360.0F, 360.0F);
/* 394 */     float f4 = entityliving.z;
/* 395 */     float f5 = entityliving.A;
/* 396 */     entityliving.z = f2;
/* 397 */     entityliving.A = f3;
/* 398 */     f2 = f4;
/* 399 */     f3 = f5;
/* 400 */     float f6 = f;
/* 401 */     float f7 = f1;
/* 402 */     float f8 = entityliving.z - f6;
/* 403 */     float f9 = entityliving.z + f6;
/* 404 */     float f10 = entityliving.A - f7;
/* 405 */     float f11 = entityliving.A + f7;
/* 406 */     boolean flag = GetFlag(f8, f9, f2, 0.0F, 360.0F);
/* 407 */     boolean flag1 = GetFlag(f10, f11, f3, -180.0F, 180.0F);
/* 408 */     boolean flag2 = GetFlag(f9, f8, f2, 0.0F, 360.0F);
/* 409 */     boolean flag3 = GetFlag(f11, f10, f3, -180.0F, 180.0F);
/* 410 */     if (flag) this.directionZ = 2; 
/* 411 */     if (flag1) this.directionX = -2; 
/* 412 */     if (flag2) this.directionZ = -2; 
/* 413 */     if (flag3) this.directionX = 2; 
/* 414 */     return (flag && flag1 && (entityliving.n((lq)entityscp) || LineOfSightCheck(entityliving)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean GetFlag(float f, float f1, float f2, float f3, float f4) {
/* 419 */     if (f < f3) {
/*     */       
/* 421 */       if (f2 >= f + f4)
/*     */       {
/* 423 */         return true;
/*     */       }
/*     */       
/* 426 */       if (f2 <= f1)
/*     */       {
/* 428 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 432 */     if (f1 >= f4) {
/*     */       
/* 434 */       if (f2 <= f1 - f4)
/*     */       {
/* 436 */         return true;
/*     */       }
/*     */       
/* 439 */       if (f2 >= f)
/*     */       {
/* 441 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 445 */     if (f1 < f4 && f >= f3)
/*     */     {
/* 447 */       return (f2 <= f1 && f2 > f);
/*     */     }
/*     */ 
/*     */     
/* 451 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int aT() {
/* 457 */     return 40;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double X() {
/* 465 */     return this.O * 0.9D - 0.5D;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean f_() {
/* 474 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq nbttagcompound) {
/* 482 */     super.b(nbttagcompound);
/* 483 */     nbttagcompound.a("Seen", this.seen);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq nbttagcompound) {
/* 491 */     super.a(nbttagcompound);
/* 492 */     this.seen = nbttagcompound.e("Seen");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_40149_l_() {
/* 497 */     return ((this.ag.a(16) & 0x1) != 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_40148_a(boolean flag) {
/* 502 */     byte byte0 = this.ag.a(16);
/*     */     
/* 504 */     if (flag) {
/*     */       
/* 506 */       byte0 = (byte)(byte0 | 0x1);
/*     */     }
/*     */     else {
/*     */       
/* 510 */       byte0 = (byte)(byte0 & 0xFE);
/*     */     } 
/*     */     
/* 513 */     this.ag.b(16, Byte.valueOf(byte0));
/*     */   }
/*     */ 
/*     */   
/*     */   protected String aY() {
/* 518 */     return "scp.rustle";
/*     */   }
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 523 */     return "mob.spiderdeath";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean g_() {
/* 531 */     return func_40149_l_();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void am() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public mf bC() {
/* 546 */     return mf.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public ox spawnBabyAnimal(ox par1EntityAnimal) {
/* 551 */     return new SCPEntity372(this.p);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ln a(ln var1) {
/* 557 */     return null;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity372.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */