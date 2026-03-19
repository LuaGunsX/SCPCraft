/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import amq;
/*     */ import aoj;
/*     */ import bq;
/*     */ import ke;
/*     */ import lh;
/*     */ import ll;
/*     */ import lm;
/*     */ import lq;
/*     */ import md;
/*     */ import my;
/*     */ import mz;
/*     */ import nc;
/*     */ import nh;
/*     */ import nk;
/*     */ import nv;
/*     */ import nw;
/*     */ import nz;
/*     */ import og;
/*     */ import oh;
/*     */ import qx;
/*     */ import yc;
/*     */ import yo;
/*     */ 
/*     */ public class SCPEntity080
/*     */   extends SCPEntity {
/*     */   private int teleportDelay;
/*     */   
/*     */   public SCPEntity080(yc par1World) {
/*  31 */     super(par1World);
/*  32 */     a(0.3F, 0.7F);
/*  33 */     this.aG = "/SCPCraft/textures/mobs/080.png";
/*  34 */     this.bH = 0.3F;
/*  35 */     this.teleportDelay = 10;
/*  36 */     this.attackStrength = 10;
/*  37 */     az().a(true);
/*  38 */     this.af = true;
/*  39 */     this.bn.a(0, (nc)new mz((md)this));
/*  40 */     this.bn.a(1, (nc)new nk((md)this, qx.class, this.bH, false));
/*  41 */     this.bn.a(2, (nc)new nk((md)this, md.class, this.bH, true));
/*  42 */     this.bn.a(2, (nc)new nw(this, 0.2F));
/*  43 */     this.bn.a(3, (nc)new nz(this));
/*  44 */     this.bn.a(4, (nc)new my(this, this.bH));
/*  45 */     this.bn.a(5, (nc)new nh((md)this, qx.class, 4.0F));
/*  46 */     this.bn.a(6, (nc)new nv((md)this));
/*  47 */     this.bo.a(1, (nc)new og((md)this, false));
/*  48 */     this.bo.a(2, (nc)new oh((md)this, qx.class, 16.0F, 0, true));
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  53 */     return 9001;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean be() {
/*  58 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(lh par1DamageSource, int par2) {
/*  63 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m(lq par1Entity) {
/*  68 */     int dmg = 1;
/*  69 */     if (this.p.s == 1) {
/*  70 */       dmg = 2;
/*     */     }
/*  72 */     else if (this.p.s == 2) {
/*  73 */       dmg = 3;
/*     */     }
/*  75 */     else if (this.p.s == 3) {
/*  76 */       dmg = 4;
/*     */     } 
/*  78 */     par1Entity.a(lh.a((md)this), dmg);
/*     */     
/*  80 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void aO() {
/*  85 */     String s = aY();
/*     */     
/*  87 */     if (s != null)
/*     */     {
/*  89 */       this.p.a((lq)this, s, 0.5F, 2.0F);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/*  95 */     super.a();
/*  96 */     this.ag.a(16, new Byte((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(float par1) {
/* 101 */     return 15728880;
/*     */   }
/*     */ 
/*     */   
/*     */   public float c(float par1) {
/* 106 */     return 10.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/* 115 */     int i = ke.c(this.t);
/* 116 */     int j = ke.c(this.u);
/* 117 */     int i1 = ke.c(this.v);
/*     */     
/* 119 */     if (this.p.u() && !this.p.I) {
/*     */       
/* 121 */       float f = c(1.0F);
/*     */       
/* 123 */       if ((f > 0.5F && this.p.k(ke.c(this.t), ke.c(this.u), ke.c(this.v)) && this.aa.nextFloat() * 30.0F < (f - 0.4F) * 2.0F) || this.p.b(yo.b, i, j, i1) > 7)
/*     */       {
/* 125 */         x();
/*     */       }
/*     */     } 
/*     */     
/* 129 */     for (int k = 0; k < 1; k++) {
/*     */       
/* 131 */       this.p.a("SCP080", this.t, this.u + 0.2D, this.v, 0.0D, 0.0D, 0.0D);
/* 132 */       this.p.a("SCP080", this.t + 0.2D, this.u + 0.2D, this.v, 0.0D, 0.0D, 0.0D);
/* 133 */       this.p.a("SCP080", this.t, this.u + 0.2D, this.v + 0.2D, 0.0D, 0.0D, 0.0D);
/* 134 */       this.p.a("SCP080", this.t - 0.2D, this.u + 0.2D, this.v, 0.0D, 0.0D, 0.0D);
/* 135 */       this.p.a("SCP080", this.t, this.u + 0.2D, this.v - 0.2D, 0.0D, 0.0D, 0.0D);
/*     */       
/* 137 */       this.p.a("SCP080", this.t, this.u + 0.6D, this.v, 0.0D, 0.0D, 0.0D);
/* 138 */       this.p.a("SCP080", this.t + 0.2D, this.u + 0.6D, this.v, 0.0D, 0.0D, 0.0D);
/* 139 */       this.p.a("SCP080", this.t, this.u + 0.6D, this.v + 0.2D, 0.0D, 0.0D, 0.0D);
/* 140 */       this.p.a("SCP080", this.t - 0.2D, this.u + 0.6D, this.v, 0.0D, 0.0D, 0.0D);
/* 141 */       this.p.a("SCP080", this.t, this.u + 0.6D, this.v - 0.2D, 0.0D, 0.0D, 0.0D);
/*     */       
/* 143 */       this.p.a("SCP080", this.t, this.u + 0.8D, this.v, 0.0D, 0.0D, 0.0D);
/* 144 */       this.p.a("SCP080", this.t + 0.2D, this.u + 0.8D, this.v, 0.0D, 0.0D, 0.0D);
/* 145 */       this.p.a("SCP080", this.t, this.u + 0.8D, this.v + 0.2D, 0.0D, 0.0D, 0.0D);
/* 146 */       this.p.a("SCP080", this.t + 0.2D, this.u + 0.8D, this.v + 0.2D, 0.0D, 0.0D, 0.0D);
/* 147 */       this.p.a("SCP080", this.t - 0.2D, this.u + 0.8D, this.v, 0.0D, 0.0D, 0.0D);
/* 148 */       this.p.a("SCP080", this.t, this.u + 0.8D, this.v - 0.2D, 0.0D, 0.0D, 0.0D);
/* 149 */       this.p.a("SCP080", this.t - 0.2D, this.u + 0.8D, this.v - 0.2D, 0.0D, 0.0D, 0.0D);
/* 150 */       this.p.a("SCP080", this.t - 0.2D, this.u + 0.8D, this.v + 0.2D, 0.0D, 0.0D, 0.0D);
/* 151 */       this.p.a("SCP080", this.t + 0.2D, this.u + 0.8D, this.v - 0.2D, 0.0D, 0.0D, 0.0D);
/*     */       
/* 153 */       this.p.a("SCP080", this.t, this.u + 1.0D, this.v, 0.0D, 0.0D, 0.0D);
/* 154 */       this.p.a("SCP080", this.t + 0.2D, this.u + 1.0D, this.v, 0.0D, 0.0D, 0.0D);
/* 155 */       this.p.a("SCP080", this.t, this.u + 1.0D, this.v + 0.2D, 0.0D, 0.0D, 0.0D);
/* 156 */       this.p.a("SCP080", this.t + 0.2D, this.u + 1.0D, this.v + 0.2D, 0.0D, 0.0D, 0.0D);
/* 157 */       this.p.a("SCP080", this.t - 0.2D, this.u + 1.0D, this.v, 0.0D, 0.0D, 0.0D);
/* 158 */       this.p.a("SCP080", this.t, this.u + 1.0D, this.v - 0.2D, 0.0D, 0.0D, 0.0D);
/* 159 */       this.p.a("SCP080", this.t - 0.2D, this.u + 1.0D, this.v - 0.2D, 0.0D, 0.0D, 0.0D);
/* 160 */       this.p.a("SCP080", this.t - 0.2D, this.u + 1.0D, this.v + 0.2D, 0.0D, 0.0D, 0.0D);
/* 161 */       this.p.a("SCP080", this.t + 0.2D, this.u + 1.0D, this.v - 0.2D, 0.0D, 0.0D, 0.0D);
/*     */       
/* 163 */       this.p.a("SCP080", this.t, this.u + 1.2D, this.v, 0.0D, 0.0D, 0.0D);
/* 164 */       this.p.a("SCP080", this.t + 0.2D, this.u + 1.2D, this.v, 0.0D, 0.0D, 0.0D);
/* 165 */       this.p.a("SCP080", this.t, this.u + 1.2D, this.v + 0.2D, 0.0D, 0.0D, 0.0D);
/* 166 */       this.p.a("SCP080", this.t + 0.2D, this.u + 1.2D, this.v + 0.2D, 0.0D, 0.0D, 0.0D);
/* 167 */       this.p.a("SCP080", this.t - 0.2D, this.u + 1.2D, this.v, 0.0D, 0.0D, 0.0D);
/* 168 */       this.p.a("SCP080", this.t, this.u + 1.2D, this.v - 0.2D, 0.0D, 0.0D, 0.0D);
/* 169 */       this.p.a("SCP080", this.t - 0.2D, this.u + 1.2D, this.v - 0.2D, 0.0D, 0.0D, 0.0D);
/* 170 */       this.p.a("SCP080", this.t - 0.2D, this.u + 1.2D, this.v + 0.2D, 0.0D, 0.0D, 0.0D);
/* 171 */       this.p.a("SCP080", this.t + 0.2D, this.u + 1.2D, this.v - 0.2D, 0.0D, 0.0D, 0.0D);
/*     */       
/* 173 */       this.p.a("SCP080", this.t, this.u + 1.5D, this.v, 0.0D, 0.0D, 0.0D);
/* 174 */       this.p.a("SCP080", this.t + 0.2D, this.u + 1.5D, this.v, 0.0D, 0.0D, 0.0D);
/* 175 */       this.p.a("SCP080", this.t, this.u + 1.5D, this.v + 0.2D, 0.0D, 0.0D, 0.0D);
/* 176 */       this.p.a("SCP080", this.t - 0.2D, this.u + 1.5D, this.v, 0.0D, 0.0D, 0.0D);
/* 177 */       this.p.a("SCP080", this.t, this.u + 1.5D, this.v - 0.2D, 0.0D, 0.0D, 0.0D);
/*     */       
/* 179 */       this.p.a("SCP080", this.t, this.u + 1.8D, this.v, 0.0D, 0.0D, 0.0D);
/* 180 */       this.p.a("SCP080", this.t + 0.2D, this.u + 1.8D, this.v, 0.0D, 0.0D, 0.0D);
/* 181 */       this.p.a("SCP080", this.t, this.u + 1.8D, this.v + 0.2D, 0.0D, 0.0D, 0.0D);
/* 182 */       this.p.a("SCP080", this.t + 0.2D, this.u + 1.8D, this.v + 0.2D, 0.0D, 0.0D, 0.0D);
/* 183 */       this.p.a("SCP080", this.t - 0.2D, this.u + 1.8D, this.v, 0.0D, 0.0D, 0.0D);
/* 184 */       this.p.a("SCP080", this.t, this.u + 1.8D, this.v - 0.2D, 0.0D, 0.0D, 0.0D);
/* 185 */       this.p.a("SCP080", this.t - 0.2D, this.u + 1.8D, this.v - 0.2D, 0.0D, 0.0D, 0.0D);
/* 186 */       this.p.a("SCP080", this.t - 0.2D, this.u + 1.8D, this.v + 0.2D, 0.0D, 0.0D, 0.0D);
/* 187 */       this.p.a("SCP080", this.t + 0.2D, this.u + 1.8D, this.v - 0.2D, 0.0D, 0.0D, 0.0D);
/*     */     } 
/*     */     
/* 190 */     if (this.a_ != null && d(this.a_) >= 0.0F && d(this.a_) <= 5.0F)
/*     */     {
/* 192 */       if (this.a_ instanceof qx) {
/*     */         
/* 194 */         if (!((qx)this.a_).cd.d)
/*     */         {
/* 196 */           ((md)this.a_).d(new lm(ll.q.H, 40, 0));
/*     */         }
/*     */       }
/*     */       else {
/*     */         
/* 201 */         ((md)this.a_).d(new lm(ll.q.H, 40, 0));
/*     */       } 
/*     */     }
/* 204 */     if (this.p.u() && !this.p.I) {
/*     */       
/* 206 */       float f = c(1.0F);
/*     */       
/* 208 */       if (f > 0.5F && this.p.k(ke.c(this.t), ke.c(this.u), ke.c(this.v)) && this.aa.nextFloat() * 30.0F < (f - 0.4F) * 2.0F)
/*     */       {
/* 210 */         this.a_ = null;
/*     */       }
/*     */     } 
/* 213 */     qx entityplayer = this.p.b((lq)this, 16.0D);
/*     */     
/* 215 */     if (this.teleportDelay <= 1 && this.a_ != null)
/*     */     {
/* 217 */       teleportToEntity((lq)entityplayer);
/*     */     }
/*     */     
/* 220 */     super.c();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void j_() {
/* 228 */     super.j_();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean f_() {
/* 237 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected lq j() {
/* 246 */     double d = 16.0D;
/* 247 */     return (lq)this.p.b((lq)this, d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/* 255 */     return "sounds.stairs";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/* 263 */     return "mob.villager.default";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 271 */     return "mob.blaze.breath";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/* 279 */     super.b(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/* 287 */     super.a(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/* 292 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean isValidLightLevel() {
/* 300 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean bs() {
/* 308 */     if (super.bs()) {
/*     */       
/* 310 */       qx entityplayer = this.p.a((lq)this, 5.0D);
/* 311 */       return (entityplayer == null);
/*     */     } 
/*     */ 
/*     */     
/* 315 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean teleportRandomly() {
/* 324 */     double d = this.t + (this.aa.nextDouble() - 0.5D) * 64.0D;
/* 325 */     double d1 = this.u + (this.aa.nextInt(64) - 32);
/* 326 */     double d2 = this.v + (this.aa.nextDouble() - 0.5D) * 64.0D;
/* 327 */     return teleportTo(d, d1, d2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean teleportToEntity(lq par1Entity) {
/* 335 */     aoj vec3d = aoj.a(this.t - par1Entity.t, this.D.b + (this.O / 2.0F) - par1Entity.u + par1Entity.e(), this.v - par1Entity.v);
/* 336 */     vec3d = vec3d.a();
/* 337 */     double d = 16.0D;
/* 338 */     double d1 = this.t + (this.aa.nextDouble() - 0.5D) * 8.0D - vec3d.c * d;
/* 339 */     double d2 = this.u + (this.aa.nextInt(16) - 8) - vec3d.d * d;
/* 340 */     double d3 = this.v + (this.aa.nextDouble() - 0.5D) * 8.0D - vec3d.e * d;
/* 341 */     return teleportTo(d1, d2, d3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean teleportTo(double par1, double par3, double par5) {
/* 349 */     double d = this.t;
/* 350 */     double d1 = this.u;
/* 351 */     double d2 = this.v;
/* 352 */     this.t = par1;
/* 353 */     this.u = par3;
/* 354 */     this.v = par5;
/* 355 */     boolean flag = false;
/* 356 */     int i = ke.c(this.t);
/* 357 */     int j = ke.c(this.u);
/* 358 */     int k = ke.c(this.v);
/*     */     
/* 360 */     if (this.p.f(i, j, k)) {
/*     */       boolean flag1;
/*     */ 
/*     */       
/* 364 */       for (flag1 = false; !flag1 && j > 0; ) {
/*     */         
/* 366 */         int i1 = this.p.a(i, j - 1, k);
/*     */         
/* 368 */         if (i1 == 0 || !(amq.p[i1]).cB.c()) {
/*     */           
/* 370 */           this.u--;
/* 371 */           j--;
/*     */           
/*     */           continue;
/*     */         } 
/* 375 */         flag1 = true;
/*     */       } 
/*     */ 
/*     */       
/* 379 */       if (flag1) {
/*     */         
/* 381 */         b(this.t, this.u, this.v);
/*     */         
/* 383 */         if (this.p.a((lq)this, this.D).size() == 0 && !this.p.d(this.D))
/*     */         {
/* 385 */           flag = true;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 390 */     if (!flag) {
/*     */       
/* 392 */       b(d, d1, d2);
/* 393 */       return false;
/*     */     } 
/*     */     
/* 396 */     int l = 128;
/*     */     
/* 398 */     for (int j1 = 0; j1 < l; j1++) {
/*     */       
/* 400 */       double d3 = j1 / (l - 1.0D);
/* 401 */       float f = (this.aa.nextFloat() - 0.5F) * 0.2F;
/* 402 */       float f1 = (this.aa.nextFloat() - 0.5F) * 0.2F;
/* 403 */       float f2 = (this.aa.nextFloat() - 0.5F) * 0.2F;
/* 404 */       double d4 = d + (this.t - d) * d3 + (this.aa.nextDouble() - 0.5D) * this.N * 2.0D;
/* 405 */       double d5 = d1 + (this.u - d1) * d3 + this.aa.nextDouble() * this.O;
/* 406 */       double d6 = d2 + (this.v - d2) * d3 + (this.aa.nextDouble() - 0.5D) * this.N * 2.0D;
/*     */     } 
/* 408 */     return true;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity080.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */