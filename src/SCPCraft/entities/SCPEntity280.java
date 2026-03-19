/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import amq;
/*     */ import aoj;
/*     */ import bq;
/*     */ import java.util.Random;
/*     */ import ke;
/*     */ import lh;
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
/*     */ public class SCPEntity280
/*     */   extends SCPEntity
/*     */ {
/*     */   private int teleportDelay;
/*     */   
/*     */   public SCPEntity280(yc par1World) {
/*  31 */     super(par1World);
/*  32 */     a(0.9F, 0.9F);
/*  33 */     this.aG = "/SCPCraft/textures/mobs/280.png";
/*  34 */     this.bH = 0.2F;
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
/*     */       
/*  71 */       dmg = 2;
/*     */     }
/*  73 */     else if (this.p.s == 2) {
/*     */       
/*  75 */       dmg = 3;
/*     */     }
/*  77 */     else if (this.p.s == 3) {
/*     */       
/*  79 */       dmg = 4;
/*     */     } 
/*  81 */     par1Entity.a(lh.a((md)this), dmg);
/*     */     
/*  83 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void aO() {
/*  88 */     String s = aY();
/*     */     
/*  90 */     if (s != null)
/*     */     {
/*  92 */       this.p.a((lq)this, s, 0.5F, 2.0F);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/*  98 */     super.a();
/*  99 */     this.ag.a(16, new Byte((byte)0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/* 108 */     int i = ke.c(this.t);
/* 109 */     int j = ke.c(this.u);
/* 110 */     int i1 = ke.c(this.v);
/*     */     
/* 112 */     if (!this.p.I)
/*     */     {
/* 114 */       if ((this.p.u() && this.p.k(i, j, i1)) || this.p.b(yo.b, i, j, i1) > 6) {
/*     */         
/* 116 */         teleportRandomly();
/* 117 */         this.a_ = null;
/*     */       } 
/*     */     }
/*     */     
/* 121 */     qx entityplayer = this.p.b((lq)this, 16.0D);
/*     */     
/* 123 */     if (this.teleportDelay <= 1 && this.a_ != null)
/*     */     {
/* 125 */       teleportToEntity((lq)entityplayer);
/*     */     }
/*     */     
/* 128 */     super.c();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void j_() {
/* 136 */     super.j_();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean f_() {
/* 145 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected lq j() {
/* 154 */     double d = 16.0D;
/* 155 */     return (lq)this.p.b((lq)this, d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/* 163 */     return "sounds.stairs";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/* 171 */     return "mob.villager.default";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 179 */     return "mob.blaze.breath";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/* 187 */     super.b(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/* 195 */     super.a(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/* 200 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean isValidLightLevel() {
/* 208 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean bs() {
/* 216 */     if (super.bs()) {
/*     */       
/* 218 */       qx entityplayer = this.p.a((lq)this, 5.0D);
/* 219 */       return (entityplayer == null);
/*     */     } 
/*     */ 
/*     */     
/* 223 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean teleportRandomly() {
/* 232 */     double d = this.t + (this.aa.nextDouble() - 0.5D) * 64.0D;
/* 233 */     double d1 = this.u + (this.aa.nextInt(64) - 32);
/* 234 */     double d2 = this.v + (this.aa.nextDouble() - 0.5D) * 64.0D;
/* 235 */     Random var1 = aB();
/*     */     
/* 237 */     for (int var2 = 0; var2 < 10; var2++) {
/*     */       
/* 239 */       int var3 = ke.c(this.t + var1.nextInt(20) - 10.0D);
/* 240 */       int var4 = ke.c(this.D.b + var1.nextInt(6) - 3.0D);
/* 241 */       int var5 = ke.c(this.v + var1.nextInt(20) - 10.0D);
/*     */       
/* 243 */       if (this.p.b(yo.b, var3, var4, var5) < 6)
/*     */       {
/* 245 */         return teleportTo(var3, var4, var5);
/*     */       }
/*     */     } 
/* 248 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean teleportToEntity(lq par1Entity) {
/* 256 */     aoj vec3d = aoj.a(this.t - par1Entity.t, this.D.b + (this.O / 2.0F) - par1Entity.u + par1Entity.e(), this.v - par1Entity.v);
/* 257 */     vec3d = vec3d.a();
/* 258 */     double d = 16.0D;
/* 259 */     double d1 = this.t + (this.aa.nextDouble() - 0.5D) * 8.0D - vec3d.c * d;
/* 260 */     double d2 = this.u + (this.aa.nextInt(16) - 8) - vec3d.d * d;
/* 261 */     double d3 = this.v + (this.aa.nextDouble() - 0.5D) * 8.0D - vec3d.e * d;
/* 262 */     return teleportTo(d1, d2, d3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean teleportTo(double par1, double par3, double par5) {
/* 270 */     double d = this.t;
/* 271 */     double d1 = this.u;
/* 272 */     double d2 = this.v;
/* 273 */     this.t = par1;
/* 274 */     this.u = par3;
/* 275 */     this.v = par5;
/* 276 */     boolean flag = false;
/* 277 */     int i = ke.c(this.t);
/* 278 */     int j = ke.c(this.u);
/* 279 */     int k = ke.c(this.v);
/*     */     
/* 281 */     if (this.p.f(i, j, k)) {
/*     */       boolean flag1;
/*     */ 
/*     */       
/* 285 */       for (flag1 = false; !flag1 && j > 0; ) {
/*     */         
/* 287 */         int i1 = this.p.a(i, j - 1, k);
/*     */         
/* 289 */         if (i1 == 0 || !(amq.p[i1]).cB.c()) {
/*     */           
/* 291 */           this.u--;
/* 292 */           j--;
/*     */           
/*     */           continue;
/*     */         } 
/* 296 */         flag1 = true;
/*     */       } 
/*     */ 
/*     */       
/* 300 */       if (flag1) {
/*     */         
/* 302 */         b(this.t, this.u, this.v);
/*     */         
/* 304 */         if (this.p.a((lq)this, this.D).size() == 0 && !this.p.d(this.D))
/*     */         {
/* 306 */           flag = true;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 311 */     if (!flag) {
/*     */       
/* 313 */       b(d, d1, d2);
/* 314 */       return false;
/*     */     } 
/*     */     
/* 317 */     int l = 128;
/*     */     
/* 319 */     for (int j1 = 0; j1 < l; j1++) {
/*     */       
/* 321 */       double d3 = j1 / (l - 1.0D);
/* 322 */       float f = (this.aa.nextFloat() - 0.5F) * 0.2F;
/* 323 */       float f1 = (this.aa.nextFloat() - 0.5F) * 0.2F;
/* 324 */       float f2 = (this.aa.nextFloat() - 0.5F) * 0.2F;
/* 325 */       double d4 = d + (this.t - d) * d3 + (this.aa.nextDouble() - 0.5D) * this.N * 2.0D;
/* 326 */       double d5 = d1 + (this.u - d1) * d3 + this.aa.nextDouble() * this.O;
/* 327 */       double d6 = d2 + (this.v - d2) * d3 + (this.aa.nextDouble() - 0.5D) * this.N * 2.0D;
/*     */     } 
/* 329 */     return true;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity280.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */