/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import amq;
/*     */ import bq;
/*     */ import ke;
/*     */ import lh;
/*     */ import yc;
/*     */ import yo;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPEntity087
/*     */   extends SCPEntity
/*     */ {
/*     */   private float heightOffset;
/*     */   private int heightOffsetUpdateTime;
/*     */   private int field_40152_d;
/*     */   private int breakLight;
/*     */   private int breakNextLight;
/*     */   private boolean canSeeSkyAndDay;
/*     */   private boolean destroyPerGo;
/*     */   
/*     */   public SCPEntity087(yc par1World) {
/*  26 */     super(par1World);
/*  27 */     this.heightOffset = 0.5F;
/*  28 */     this.aG = "/SCPCraft/textures/mobs/087.png";
/*  29 */     this.af = true;
/*  30 */     this.attackStrength = 200;
/*  31 */     this.X = 0.0F;
/*  32 */     this.bH = 0.25F;
/*  33 */     a(1.0F, 2.0F);
/*  34 */     this.bd = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  39 */     return 20;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/*  44 */     super.a();
/*  45 */     this.ag.a(16, new Byte((byte)0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/*  53 */     return "sounds.stairs";
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/*  58 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(lh par1DamageSource, int par2) {
/*  66 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(float par1) {
/*  71 */     return 15728880;
/*     */   }
/*     */ 
/*     */   
/*     */   public double getDistance(int i, int j, int k, int l, int i1, int j1) {
/*  76 */     int k1 = l - i;
/*  77 */     int l1 = i1 - j;
/*  78 */     int i2 = j1 - k;
/*  79 */     return Math.sqrt((k1 * k1 + l1 * l1 + i2 * i2));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float c(float par1) {
/*  88 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  97 */     if (!this.p.I) {
/*     */ 
/*     */       
/* 100 */       this.heightOffsetUpdateTime--;
/*     */       
/* 102 */       if (this.heightOffsetUpdateTime <= 0) {
/*     */         
/* 104 */         this.heightOffsetUpdateTime = 100;
/* 105 */         this.heightOffset = 0.5F + (float)this.aa.nextGaussian() * 3.0F;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 110 */     super.c();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(float f) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/* 125 */     super.b(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/* 133 */     super.a(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int bb() {
/* 141 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_40151_ac() {
/* 147 */     return ((this.ag.a(16) & 0x1) != 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_40150_a(boolean par1) {
/* 152 */     byte byte0 = this.ag.a(16);
/*     */     
/* 154 */     if (par1) {
/*     */       
/* 156 */       byte0 = (byte)(byte0 | 0x1);
/*     */     }
/*     */     else {
/*     */       
/* 160 */       byte0 = (byte)(byte0 & 0xFE);
/*     */     } 
/*     */     
/* 163 */     this.ag.b(16, Byte.valueOf(byte0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean isValidLightLevel() {
/* 171 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void j_() {
/* 178 */     this.destroyPerGo = false;
/* 179 */     this.bH = (this.a_ != null) ? 7.0F : 0.3F;
/* 180 */     this.bF = false;
/* 181 */     int i = ke.c(this.t);
/* 182 */     int k = ke.c(this.u);
/* 183 */     int i1 = ke.c(this.v);
/*     */     
/* 185 */     if (this.p.u()) {
/*     */       
/* 187 */       float f = c(1.0F);
/*     */       
/* 189 */       if (f > 0.5F && this.p.k(ke.c(this.t), ke.c(this.u), ke.c(this.v)) && this.aa.nextFloat() * 30.0F < (f - 0.4F) * 2.0F) {
/*     */         
/* 191 */         this.canSeeSkyAndDay = true;
/*     */       }
/*     */       else {
/*     */         
/* 195 */         this.canSeeSkyAndDay = false;
/*     */       } 
/*     */     } 
/*     */     
/* 199 */     for (int m = -2; m <= 2; m++) {
/* 200 */       for (int z = -2; z <= 3; z++) {
/* 201 */         for (int n = -2; n <= 2; n++) {
/*     */           
/* 203 */           int met1 = this.p.h(i + m, k + z, i1 + n);
/* 204 */           int var11 = this.p.a(i + m, k + z, i1 + n);
/* 205 */           if (var11 > 0 && this.p.b(yo.b, i + m, k + z, i1 + n) >= 1) {
/* 206 */             int var12 = this.p.h(i + m, k + z, i1 + n);
/* 207 */             this.p.f(2001, i + m, k + z, i1 + n, var11 + (met1 << 12));
/* 208 */             amq.p[var11].c(this.p, i + m, k + z, i1 + n, var12, 0);
/* 209 */             this.p.d(i + m, k + z, i1 + n, 0, 0);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 214 */     if (this.a_ != null && this.a_ instanceof qx)
/*     */     {
/* 216 */       a(this.a_, 100.0F, 100.0F);
/*     */     }
/*     */     
/* 219 */     super.j_();
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity087.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */