/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import java.util.Random;
/*     */ import ke;
/*     */ import lq;
/*     */ import lz;
/*     */ import md;
/*     */ import qx;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity015Boss
/*     */   extends SCPEntity
/*     */ {
/*  15 */   private float heightOffset = 0.5F;
/*  16 */   protected int maxHealth = 60;
/*     */   
/*     */   public static boolean isHalfWay;
/*     */   
/*  20 */   private static String Phase1 = "/SCPCraft/textures/mobs/Bosses/015/015BossPhase1.png";
/*  21 */   private static String Phase2 = "/SCPCraft/textures/mobs/Bosses/015/015BossPhaseDead.png";
/*     */   
/*  23 */   private static String Middle = "/SCPCraft/textures/mobs/Bosses/015/015BossPhaseHalf.png";
/*     */   
/*     */   private int heightOffsetUpdateTime;
/*     */   
/*     */   private int field_70846_g;
/*  28 */   public int deathTicks = 0;
/*     */ 
/*     */   
/*     */   public SCPEntity015Boss(yc par1World) {
/*  32 */     super(par1World);
/*  33 */     qx ep = this.p.b((lq)this, 16.0D);
/*  34 */     this.aG = "/SCPCraft/textures/mobs/Bosses/015/015BossPhase1.png";
/*  35 */     this.af = true;
/*  36 */     this.maxHealth = 1200;
/*  37 */     this; isHalfWay = false;
/*  38 */     j(this.maxHealth);
/*  39 */     this.attackStrength = 6;
/*  40 */     this.bd = 15;
/*  41 */     this.M *= 6.0F;
/*  42 */     a(this.N * 1.0F, this.O * 1.6F);
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  47 */     return this.maxHealth;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/*  52 */     super.a();
/*  53 */     this.ag.a(16, new Integer(0));
/*  54 */     this.ag.a(17, new Integer(this.maxHealth));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String O() {
/*  61 */     if (this.aR >= 600) return Phase1; 
/*  62 */     if (isHalfWay)
/*     */     {
/*  64 */       return Phase2;
/*     */     }
/*  66 */     if (this.aR < 8)
/*     */     {
/*  68 */       return Phase2;
/*     */     }
/*     */ 
/*     */     
/*  72 */     return Phase1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/*  82 */     return "mob.blaze.breathe";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/*  90 */     return "mob.blaze.hit";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/*  98 */     return "mob.blaze.death";
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(float par1) {
/* 103 */     return 15728880;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float c(float par1) {
/* 111 */     return 0.4F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void targetLivings() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/* 124 */     if (this.aR <= 600 && this.aR > 300) isHalfWay = true;
/*     */     
/* 126 */     if (isHalfWay)
/*     */     {
/* 128 */       for (int var10 = 0; var10 <= 7; var10++)
/*     */       {
/* 130 */         this.p.a("smoke", this.t + (this.aa.nextDouble() - 0.5D) * this.N, this.u + this.aa.nextDouble() * this.O, this.v + (this.aa.nextDouble() - 0.5D) * this.N, 0.0D, 0.0D, 0.0D);
/*     */       }
/*     */     }
/*     */     
/* 134 */     if (!this.p.I)
/*     */     {
/* 136 */       this.ag.b(16, Integer.valueOf(this.aR));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 142 */     if (this.aR <= 0) {
/*     */ 
/*     */       
/* 145 */       for (int times = 0; times <= 3; times++) {
/*     */         
/* 147 */         this.p.a(this.t + 0.5D, this.u + 0.5D, this.v + 0.5D, "mob.blaze.breathe", 1.0F + this.aa.nextFloat(), this.aa.nextFloat() * 0.7F + 0.3F);
/* 148 */         this.p.a(this.t + 0.5D, this.u + 0.5D, this.v + 0.5D, "random.click", 1.0F + this.aa.nextFloat(), this.aa.nextFloat() * 0.7F + 0.3F);
/*     */       } 
/* 150 */       float var1 = (this.aa.nextFloat() - 0.5F) * 8.0F;
/* 151 */       float var26 = (this.aa.nextFloat() - 0.5F) * 4.0F;
/* 152 */       float var3 = (this.aa.nextFloat() - 0.5F) * 8.0F;
/* 153 */       this.p.a("largeexplode", this.t + var1, this.u + 2.0D + var26, this.v + var3, 0.0D, 0.0D, 0.0D);
/*     */     } 
/*     */     
/* 156 */     this.bF = false;
/* 157 */     if (!this.p.I) {
/*     */ 
/*     */       
/* 160 */       this.heightOffsetUpdateTime--;
/*     */       
/* 162 */       if (this.heightOffsetUpdateTime <= 0) {
/*     */         
/* 164 */         this.heightOffsetUpdateTime = 100;
/* 165 */         this.heightOffset = 0.5F + (float)this.aa.nextGaussian() * 3.0F;
/*     */       } 
/*     */       
/* 168 */       if (l() != null && (l()).u + l().e() > this.u + e() + this.heightOffset)
/*     */       {
/* 170 */         this.x += (0.30000001192092896D - this.x) * 0.30000001192092896D;
/*     */       }
/*     */     } 
/*     */     
/* 174 */     if (this.aa.nextInt(24) == 0 && this.aR > 0)
/*     */     {
/* 176 */       this.p.a(this.t + 0.5D, this.u + 0.5D, this.v + 0.5D, "random.break", 1.0F + this.aa.nextFloat(), this.aa.nextFloat() * 0.7F + 0.3F);
/*     */     }
/*     */     
/* 179 */     if (!this.E && this.x < 0.0D)
/*     */     {
/* 181 */       this.x *= 0.6D;
/*     */     }
/*     */     
/* 184 */     if (this.aR < 1200)
/*     */     {
/* 186 */       for (int var10 = 0; var10 <= 7; var10++)
/*     */       {
/* 188 */         this.p.a("largesmoke", this.t + (this.aa.nextDouble() - 0.5D) * this.N, this.u + this.aa.nextDouble() * this.O + 1.0D, this.v + (this.aa.nextDouble() - 0.5D) * this.N, 0.0D, 0.0D, 0.0D);
/*     */       }
/*     */     }
/*     */     
/* 192 */     for (int var2 = 0; var2 < 2; var2++) {
/*     */       
/* 194 */       Random rand = new Random();
/* 195 */       int particle = rand.nextInt(5);
/*     */       
/* 197 */       if (particle == 0)
/*     */       {
/* 199 */         this.p.a("townaura", this.t + (this.aa.nextDouble() - 0.5D) * this.N, this.u + this.aa.nextDouble() * this.O, this.v + (this.aa.nextDouble() - 0.5D) * this.N, 0.0D, 0.0D, 0.0D);
/*     */       }
/* 201 */       if (particle == 1)
/*     */       {
/* 203 */         this.p.a("splash", this.t + (this.aa.nextDouble() - 0.5D) * this.N, this.u + this.aa.nextDouble() * this.O, this.v + (this.aa.nextDouble() - 0.5D) * this.N, 0.0D, 0.0D, 0.0D);
/*     */       }
/* 205 */       if (particle == 2)
/*     */       {
/* 207 */         this.p.a("smoke", this.t + (this.aa.nextDouble() - 0.5D) * this.N, this.u + this.aa.nextDouble() * this.O, this.v + (this.aa.nextDouble() - 0.5D) * this.N, 0.0D, 0.0D, 0.0D);
/*     */       }
/* 209 */       if (particle == 3)
/*     */       {
/* 211 */         this.p.a("suspended", this.t + (this.aa.nextDouble() - 0.5D) * this.N, this.u + this.aa.nextDouble() * this.O, this.v + (this.aa.nextDouble() - 0.5D) * this.N, 0.0D, 0.0D, 0.0D);
/*     */       }
/* 213 */       if (particle == 4) {
/*     */         
/* 215 */         this.p.a("depthsuspend", this.t + (this.aa.nextDouble() - 0.5D) * this.N, this.u + this.aa.nextDouble() * this.O, this.v + (this.aa.nextDouble() - 0.5D) * this.N, 0.0D, 0.0D, 0.0D);
/* 216 */         this.p.a("depthsuspend", this.t + (this.aa.nextDouble() - 0.5D) * this.N, this.u + this.aa.nextDouble() * this.O, this.v + (this.aa.nextDouble() - 0.5D) * this.N, 0.0D, 0.0D, 0.0D);
/* 217 */         this.p.a("depthsuspend", this.t + (this.aa.nextDouble() - 0.5D) * this.N, this.u + this.aa.nextDouble() * this.O, this.v + (this.aa.nextDouble() - 0.5D) * this.N, 0.0D, 0.0D, 0.0D);
/*     */       } 
/*     */     } 
/*     */     
/* 221 */     super.c();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void aP() {
/* 229 */     this.deathTicks++;
/*     */     
/* 231 */     if (this.deathTicks >= 180 && this.deathTicks <= 200) {
/*     */       
/* 233 */       float var1 = (this.aa.nextFloat() - 0.5F) * 8.0F;
/* 234 */       float var2 = (this.aa.nextFloat() - 0.5F) * 4.0F;
/* 235 */       float var3 = (this.aa.nextFloat() - 0.5F) * 8.0F;
/*     */       
/* 237 */       this.p.a("hugeexplosion", this.t + var1, this.u + 2.0D + var2, this.v + var3, 0.0D, 0.0D, 0.0D);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 243 */     if (!this.p.I) {
/*     */       
/* 245 */       if (this.deathTicks > 150 && this.deathTicks % 5 == 0) {
/*     */         
/* 247 */         int var4 = 500;
/*     */         
/* 249 */         while (var4 > 0) {
/*     */           
/* 251 */           int var5 = lz.a(var4);
/* 252 */           var4 -= var5;
/* 253 */           this.p.d((lq)new lz(this.p, this.t, this.u, this.v, var5));
/*     */         } 
/*     */       } 
/*     */       
/* 257 */       if (this.deathTicks == 1)
/*     */       {
/* 259 */         this.p.e(1018, (int)this.t, (int)this.u, (int)this.v, 0);
/*     */       }
/*     */     } 
/*     */     
/* 263 */     d(0.0D, 0.10000000149011612D, 0.0D);
/* 264 */     this.ax = this.z += 20.0F;
/*     */     
/* 266 */     if (this.deathTicks == 200 && !this.p.I) {
/*     */       
/* 268 */       int var4 = 500;
/*     */       
/* 270 */       while (var4 > 0) {
/*     */         
/* 272 */         int var5 = lz.a(var4);
/* 273 */         var4 -= var5;
/* 274 */         this.p.d((lq)new lz(this.p, this.t, this.u, this.v, var5));
/*     */       } 
/* 276 */       x();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(lq par1Entity, float par2) {
/* 285 */     if (this.aZ <= 0 && par2 < 2.0F && par1Entity.D.e > this.D.b && par1Entity.D.b < this.D.e) {
/*     */       
/* 287 */       this.aZ = 20;
/* 288 */       m(par1Entity);
/*     */     }
/* 290 */     else if (par2 < 30.0F) {
/*     */       
/* 292 */       double var3 = par1Entity.t - this.t;
/* 293 */       double var5 = par1Entity.D.b + (par1Entity.O / 2.0F) - this.u + (this.O / 2.0F);
/* 294 */       double var7 = par1Entity.v - this.v;
/*     */       
/* 296 */       if (this.aZ == 0) {
/*     */         
/* 298 */         this.field_70846_g++;
/*     */         
/* 300 */         if (this.field_70846_g == 1) {
/*     */           
/* 302 */           this.aZ = 60;
/*     */         }
/* 304 */         else if (this.field_70846_g <= 4) {
/*     */           
/* 306 */           this.aZ = 6;
/*     */         }
/*     */         else {
/*     */           
/* 310 */           this.aZ = 100;
/* 311 */           this.field_70846_g = 0;
/*     */         } 
/*     */         
/* 314 */         if (this.field_70846_g > 1) {
/*     */           
/* 316 */           float var9 = ke.c(par2) * 0.5F;
/* 317 */           this.p.a((qx)null, 1009, (int)this.t, (int)this.u, (int)this.v, 0);
/*     */           
/* 319 */           for (int var10 = 0; var10 < 1; var10++) {
/*     */             
/* 321 */             SCPEntity015Projectile var11 = new SCPEntity015Projectile(this.p, (md)this, var3 + this.aa.nextGaussian() * var9, var5, var7 + this.aa.nextGaussian() * var9);
/* 322 */             var11.u = this.u + (this.O / 2.0F) + 0.5D;
/* 323 */             this.p.d((lq)var11);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 328 */       this.z = (float)(Math.atan2(var7, var3) * 180.0D / Math.PI) - 90.0F;
/* 329 */       this.b = true;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(float par1) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int bb() {
/* 343 */     return mod_SCP.SCP015.cm;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(boolean par1, int par2) {
/* 351 */     int var3 = this.aa.nextInt(2 + par2);
/*     */     
/* 353 */     for (int var4 = 0; var4 < var3; var4++)
/*     */     {
/* 355 */       b(mod_SCP.SCP015.cm, 1);
/*     */     }
/*     */     
/* 358 */     int j = this.aa.nextInt(2);
/* 359 */     if (j == 0) b(mod_SCP.Record106.cj, 1); 
/* 360 */     if (j == 1) b(mod_SCP.Record173.cj, 1);
/*     */   
/*     */   }
/*     */   
/*     */   public boolean func_70845_n() {
/* 365 */     return ((this.ag.a(16) & 0x1) != 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean isValidLightLevel() {
/* 373 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSCP015BossHealth() {
/* 381 */     return this.ag.c(16);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity015Boss.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */