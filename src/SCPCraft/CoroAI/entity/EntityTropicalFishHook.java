/*     */ package SCPCraft.CoroAI.entity;
/*     */ 
/*     */ import agi;
/*     */ import aoe;
/*     */ import aoh;
/*     */ import aoj;
/*     */ import bq;
/*     */ import com.google.common.io.ByteArrayDataInput;
/*     */ import com.google.common.io.ByteArrayDataOutput;
/*     */ import cpw.mods.fml.client.FMLClientHandler;
/*     */ import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.List;
/*     */ import ke;
/*     */ import lh;
/*     */ import lq;
/*     */ import md;
/*     */ import px;
/*     */ import up;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ public class EntityTropicalFishHook
/*     */   extends lq
/*     */   implements IEntityAdditionalSpawnData
/*     */ {
/*  29 */   private int xTile = -1;
/*  30 */   private int yTile = -1;
/*  31 */   private int zTile = -1;
/*  32 */   private int inTile = 0;
/*     */   public boolean inGround = false;
/*  34 */   public int shake = 0;
/*     */   public md angler;
/*     */   private int ticksInGround;
/*  37 */   private int ticksInAir = 0;
/*  38 */   public int ticksCatchable = 0;
/*  39 */   public lq bobber = null;
/*     */   
/*     */   private int field_6149_an;
/*     */   private double field_6148_ao;
/*     */   private double field_6147_ap;
/*     */   private double field_6146_aq;
/*     */   private double field_6145_ar;
/*     */   private double field_6144_as;
/*     */   
/*     */   public EntityTropicalFishHook(yc var1) {
/*  49 */     super(var1);
/*  50 */     a(0.25F, 0.25F);
/*  51 */     this.al = true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(aoj asd) {
/*  57 */     return (asd.d(aoj.a(this.t, this.u, this.v)) < 80.0D);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void x() {
/*  64 */     if (!this.inGround) {
/*  65 */       aoe var18 = aoe.a(this.D.a, this.D.b, this.D.c, this.D.d, this.D.e, this.D.f);
/*  66 */       if (!this.p.b(var18, agi.h)) {
/*  67 */         int sdfsdf = 0;
/*     */       }
/*     */     } 
/*     */     
/*  71 */     this.L = true;
/*     */   }
/*     */   
/*     */   public EntityTropicalFishHook(yc var1, md var2, float speed) {
/*  75 */     super(var1);
/*  76 */     this.l = 10.0D;
/*  77 */     this.al = true;
/*  78 */     this.angler = var2;
/*  79 */     if (var2 instanceof c_PlayerProxy) {
/*  80 */       ((c_PlayerProxy)this.angler).fishEntity = this;
/*     */     }
/*  82 */     a(0.25F, 0.25F);
/*  83 */     b(var2.t, var2.u + 1.62D - var2.M, var2.v, var2.z, var2.A);
/*  84 */     this.t -= (ke.b(this.z / 180.0F * 3.1415927F) * 0.16F);
/*  85 */     this.u -= 0.10000000149011612D;
/*  86 */     this.v -= (ke.a(this.z / 180.0F * 3.1415927F) * 0.16F);
/*  87 */     b(this.t, this.u, this.v);
/*  88 */     this.M = 0.0F;
/*  89 */     float var3 = 0.4F;
/*  90 */     this.w = (-ke.a(this.z / 180.0F * 3.1415927F) * ke.b(this.A / 180.0F * 3.1415927F) * var3);
/*  91 */     this.y = (ke.b(this.z / 180.0F * 3.1415927F) * ke.b(this.A / 180.0F * 3.1415927F) * var3);
/*  92 */     this.x = (-ke.a(this.A / 180.0F * 3.1415927F) * var3);
/*  93 */     calculateVelocity(this.w, this.x, this.y, 1.5F, 1.0F);
/*  94 */     this.w *= speed;
/*  95 */     this.x *= speed;
/*  96 */     this.y *= speed;
/*     */   }
/*     */   
/*     */   protected void a() {}
/*     */   
/*     */   public void calculateVelocity(double var1, double var3, double var5, float var7, float var8) {
/* 102 */     float var9 = ke.a(var1 * var1 + var3 * var3 + var5 * var5);
/* 103 */     var1 /= var9;
/* 104 */     var3 /= var9;
/* 105 */     var5 /= var9;
/* 106 */     var1 += this.aa.nextGaussian() * 0.007499999832361937D * var8;
/* 107 */     var3 += this.aa.nextGaussian() * 0.007499999832361937D * var8;
/* 108 */     var5 += this.aa.nextGaussian() * 0.007499999832361937D * var8;
/* 109 */     var1 *= var7;
/* 110 */     var3 *= var7;
/* 111 */     var5 *= var7;
/* 112 */     this.w = var1;
/* 113 */     this.x = var3;
/* 114 */     this.y = var5;
/* 115 */     float var10 = ke.a(var1 * var1 + var5 * var5);
/* 116 */     this.B = this.z = (float)(Math.atan2(var1, var5) * 180.0D / 3.1415927410125732D);
/* 117 */     this.C = this.A = (float)(Math.atan2(var3, var10) * 180.0D / 3.1415927410125732D);
/* 118 */     this.ticksInGround = 0;
/*     */   }
/*     */   
/*     */   public void j_() {
/* 122 */     super.j_();
/*     */     
/* 124 */     if (this.angler == null) { x(); return; }
/*     */     
/* 126 */     if (this.angler instanceof c_PlayerProxy) {
/* 127 */       if (this.angler.L) {
/* 128 */         x();
/*     */       }
/* 130 */       if (((c_PlayerProxy)this.angler).fishEntity != this)
/*     */       {
/* 132 */         x();
/*     */       }
/*     */     } 
/*     */     
/* 136 */     if (this.field_6149_an > 0) {
/* 137 */       double var21 = this.t + (this.field_6148_ao - this.t) / this.field_6149_an;
/* 138 */       double var22 = this.u + (this.field_6147_ap - this.u) / this.field_6149_an;
/* 139 */       double var23 = this.v + (this.field_6146_aq - this.v) / this.field_6149_an;
/*     */       
/*     */       double var7;
/* 142 */       for (var7 = this.field_6145_ar - this.z; var7 < -180.0D; var7 += 360.0D);
/*     */ 
/*     */ 
/*     */       
/* 146 */       while (var7 >= 180.0D) {
/* 147 */         var7 -= 360.0D;
/*     */       }
/*     */       
/* 150 */       this.z = (float)(this.z + var7 / this.field_6149_an);
/* 151 */       this.A = (float)(this.A + (this.field_6144_as - this.A) / this.field_6149_an);
/* 152 */       this.field_6149_an--;
/* 153 */       b(var21, var22, var23);
/* 154 */       b(this.z, this.A);
/*     */     } else {
/* 156 */       if (this.p.I) {
/*     */         
/* 158 */         ur var1 = null;
/* 159 */         if (this.angler instanceof c_PlayerProxy) {
/* 160 */           var1 = ((c_PlayerProxy)this.angler).getCurrentEquippedItem();
/*     */         }
/* 162 */         if (this.angler.L || !this.angler.S() || var1 == null || e((lq)this.angler) > 1024.0D) {
/* 163 */           x();
/* 164 */           if (this.angler instanceof c_PlayerProxy) {
/* 165 */             ((c_PlayerProxy)this.angler).fishEntity = null;
/*     */           }
/*     */           
/*     */           return;
/*     */         } 
/*     */         
/* 171 */         if (this.bobber != null) {
/* 172 */           if (!this.bobber.L) {
/* 173 */             this.t = this.bobber.t;
/* 174 */             this.u = this.bobber.D.b + this.bobber.O * 0.8D;
/* 175 */             this.v = this.bobber.v;
/*     */             
/*     */             return;
/*     */           } 
/* 179 */           this.bobber = null;
/*     */         } 
/*     */       } 
/*     */       
/* 183 */       if (this.shake > 0) {
/* 184 */         this.shake--;
/*     */       }
/*     */       
/* 187 */       if (this.inGround) {
/* 188 */         int var19 = this.p.a(this.xTile, this.yTile, this.zTile);
/* 189 */         if (var19 == this.inTile) {
/* 190 */           this.ticksInGround++;
/* 191 */           if (this.ticksInGround == 1200) {
/* 192 */             x();
/*     */           }
/*     */           
/*     */           return;
/*     */         } 
/*     */         
/* 198 */         this.inGround = false;
/* 199 */         this.w *= (this.aa.nextFloat() * 0.2F);
/* 200 */         this.x *= (this.aa.nextFloat() * 0.2F);
/* 201 */         this.y *= (this.aa.nextFloat() * 0.2F);
/* 202 */         this.ticksInGround = 0;
/* 203 */         this.ticksInAir = 0;
/*     */       } else {
/* 205 */         this.ticksInAir++;
/*     */       } 
/*     */       
/* 208 */       aoj var20 = aoj.a(this.t, this.u, this.v);
/* 209 */       aoj var2 = aoj.a(this.t + this.w, this.u + this.x, this.v + this.y);
/* 210 */       aoh var3 = this.p.a(var20, var2);
/* 211 */       var20 = aoj.a(this.t, this.u, this.v);
/* 212 */       var2 = aoj.a(this.t + this.w, this.u + this.x, this.v + this.y);
/* 213 */       if (var3 != null) {
/* 214 */         var2 = aoj.a(var3.f.c, var3.f.d, var3.f.e);
/*     */       }
/*     */       
/* 217 */       lq var4 = null;
/* 218 */       List<lq> var5 = this.p.b(this, this.D.a(this.w, this.x, this.y).b(1.0D, 1.0D, 1.0D));
/* 219 */       double var6 = 0.0D;
/*     */ 
/*     */       
/* 222 */       for (int var8 = 0; var8 < var5.size(); var8++) {
/* 223 */         lq var9 = var5.get(var8);
/* 224 */         if (var9.L() && !(var9 instanceof c_PlayerProxy) && (var9 != this.angler || this.ticksInAir >= 10)) {
/* 225 */           float var10 = 0.3F;
/* 226 */           aoe var11 = var9.D.b(var10, var10, var10);
/* 227 */           aoh var12 = var11.a(var20, var2);
/* 228 */           if (var12 != null) {
/* 229 */             double var13 = var20.d(var12.f);
/* 230 */             if (var13 < var6 || var6 == 0.0D) {
/* 231 */               var4 = var9;
/* 232 */               var6 = var13;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 238 */       if (var4 != null) {
/* 239 */         var3 = new aoh(var4);
/*     */       }
/*     */       
/* 242 */       if (var3 != null) {
/* 243 */         if (var3.g != null) {
/*     */           
/* 245 */           if (var3.g.a(lh.a(this, (lq)this.angler), 0)) {
/* 246 */             this.bobber = var3.g;
/*     */           }
/*     */         } else {
/* 249 */           this.inGround = true;
/*     */         } 
/*     */       }
/*     */       
/* 253 */       if (!this.inGround) {
/* 254 */         d(this.w, this.x, this.y);
/* 255 */         float var24 = ke.a(this.w * this.w + this.y * this.y);
/* 256 */         this.z = (float)(Math.atan2(this.w, this.y) * 180.0D / 3.1415927410125732D);
/*     */         
/* 258 */         for (this.A = (float)(Math.atan2(this.x, var24) * 180.0D / 3.1415927410125732D); this.A - this.C < -180.0F; this.C -= 360.0F);
/*     */ 
/*     */ 
/*     */         
/* 262 */         while (this.A - this.C >= 180.0F) {
/* 263 */           this.C += 360.0F;
/*     */         }
/*     */         
/* 266 */         while (this.z - this.B < -180.0F) {
/* 267 */           this.B -= 360.0F;
/*     */         }
/*     */         
/* 270 */         while (this.z - this.B >= 180.0F) {
/* 271 */           this.B += 360.0F;
/*     */         }
/*     */         
/* 274 */         this.A = this.C + (this.A - this.C) * 0.2F;
/* 275 */         this.z = this.B + (this.z - this.B) * 0.2F;
/* 276 */         float var25 = 0.92F;
/* 277 */         if (this.E || this.F) {
/* 278 */           var25 = 0.5F;
/*     */         }
/*     */         
/* 281 */         byte var27 = 5;
/* 282 */         double var26 = 0.0D;
/*     */         
/* 284 */         for (int var29 = 0; var29 < var27; var29++) {
/* 285 */           double var14 = this.D.b + (this.D.e - this.D.b) * (var29 + 0) / var27 - 0.125D + 0.125D;
/* 286 */           double var16 = this.D.b + (this.D.e - this.D.b) * (var29 + 1) / var27 - 0.125D + 0.125D;
/* 287 */           aoe var18 = aoe.a(this.D.a, var14, this.D.c, this.D.d, var16, this.D.f);
/* 288 */           if (this.p.b(var18, agi.h)) {
/* 289 */             var26 += 1.0D / var27;
/*     */           }
/*     */         } 
/*     */         
/* 293 */         if (var26 > 0.0D) {
/* 294 */           if (this.ticksCatchable > 0) {
/* 295 */             this.ticksCatchable--;
/*     */           } else {
/* 297 */             short var28 = 500;
/* 298 */             if (this.p.D(ke.c(this.t), ke.c(this.u) + 1, ke.c(this.v))) {
/* 299 */               var28 = 300;
/*     */             }
/*     */             
/* 302 */             if (this.aa.nextInt(var28) == 0) {
/* 303 */               this.ticksCatchable = this.aa.nextInt(30) + 10;
/* 304 */               this.x -= 0.20000000298023224D;
/* 305 */               this.p.a(this, "random.splash", 0.25F, 1.0F + (this.aa.nextFloat() - this.aa.nextFloat()) * 0.4F);
/* 306 */               float var30 = ke.c(this.D.b);
/*     */ 
/*     */               
/*     */               int var15;
/*     */               
/* 311 */               for (var15 = 0; var15 < 1.0F + this.N * 20.0F; var15++) {
/* 312 */                 float var31 = (this.aa.nextFloat() * 2.0F - 1.0F) * this.N;
/* 313 */                 float var17 = (this.aa.nextFloat() * 2.0F - 1.0F) * this.N;
/* 314 */                 this.p.a("bubble", this.t + var31, (var30 + 1.0F), this.v + var17, this.w, this.x - (this.aa.nextFloat() * 0.2F), this.y);
/*     */               } 
/*     */               
/* 317 */               for (var15 = 0; var15 < 1.0F + this.N * 20.0F; var15++) {
/* 318 */                 float var31 = (this.aa.nextFloat() * 2.0F - 1.0F) * this.N;
/* 319 */                 float var17 = (this.aa.nextFloat() * 2.0F - 1.0F) * this.N;
/* 320 */                 this.p.a("splash", this.t + var31, (var30 + 1.0F), this.v + var17, this.w, this.x, this.y);
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         }
/*     */         
/* 326 */         if (this.ticksCatchable > 0) {
/* 327 */           this.x -= (this.aa.nextFloat() * this.aa.nextFloat() * this.aa.nextFloat()) * 0.2D;
/*     */         }
/*     */         
/* 330 */         double var13 = var26 * 2.0D - 1.0D;
/* 331 */         this.x += 0.03999999910593033D * var13;
/* 332 */         if (var26 > 0.0D) {
/* 333 */           var25 = (float)(var25 * 0.9D);
/* 334 */           this.x *= 0.8D;
/*     */         } 
/*     */         
/* 337 */         this.w *= var25;
/* 338 */         this.x *= var25;
/* 339 */         this.y *= var25;
/* 340 */         b(this.t, this.u, this.v);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(bq var1) {
/* 346 */     var1.a("xTile", (short)this.xTile);
/* 347 */     var1.a("yTile", (short)this.yTile);
/* 348 */     var1.a("zTile", (short)this.zTile);
/* 349 */     var1.a("inTile", (byte)this.inTile);
/* 350 */     var1.a("shake", (byte)this.shake);
/* 351 */     var1.a("inGround", (byte)(this.inGround ? 1 : 0));
/*     */   }
/*     */   
/*     */   public void a(bq var1) {
/* 355 */     this.xTile = var1.d("xTile");
/* 356 */     this.yTile = var1.d("yTile");
/* 357 */     this.zTile = var1.d("zTile");
/* 358 */     this.inTile = var1.c("inTile") & 0xFF;
/* 359 */     this.shake = var1.c("shake") & 0xFF;
/* 360 */     this.inGround = (var1.c("inGround") == 1);
/*     */   }
/*     */   
/*     */   public int catchFish() {
/* 364 */     byte var1 = 0;
/* 365 */     if (this.bobber != null) {
/* 366 */       double var2 = this.angler.t - this.t;
/* 367 */       double var4 = this.angler.u - this.u;
/* 368 */       double var6 = this.angler.v - this.v;
/* 369 */       double var8 = ke.a(var2 * var2 + var4 * var4 + var6 * var6);
/* 370 */       double var10 = 0.1D;
/* 371 */       this.bobber.w += var2 * var10;
/* 372 */       this.bobber.x += var4 * var10 + ke.a(var8) * 0.08D;
/* 373 */       this.bobber.y += var6 * var10;
/* 374 */       var1 = 3;
/* 375 */     } else if (this.ticksCatchable > 0) {
/* 376 */       px var13 = new px(this.p, this.t, this.u, this.v, new ur(up.aU));
/* 377 */       double var3 = this.angler.t - this.t;
/* 378 */       double var5 = this.angler.u - this.u;
/* 379 */       double var7 = this.angler.v - this.v;
/* 380 */       double var9 = ke.a(var3 * var3 + var5 * var5 + var7 * var7);
/* 381 */       double var11 = 0.1D;
/* 382 */       var13.w = var3 * var11;
/* 383 */       var13.x = var5 * var11 + ke.a(var9) * 0.08D;
/* 384 */       var13.y = var7 * var11;
/* 385 */       this.p.d((lq)var13);
/*     */       
/* 387 */       var1 = 1;
/*     */     } 
/*     */     
/* 390 */     if (this.inGround) {
/* 391 */       var1 = 2;
/*     */     }
/*     */     
/* 394 */     x();
/* 395 */     if (this.angler instanceof c_PlayerProxy) {
/* 396 */       ((c_PlayerProxy)this.angler).fishEntity = null;
/*     */     }
/* 398 */     return var1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void writeSpawnData(ByteArrayDataOutput data) {
/* 403 */     int id = 0;
/* 404 */     if (this.angler != null) {
/* 405 */       id = this.angler.k;
/*     */     }
/* 407 */     data.writeInt(id);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void readSpawnData(ByteArrayDataInput data) {
/* 414 */     lq ent = getEntByID(data.readInt());
/* 415 */     if (ent instanceof md) {
/* 416 */       this.angler = (md)ent;
/* 417 */       if (this.angler instanceof c_PlayerProxy) {
/* 418 */         ((c_PlayerProxy)this.angler).fishEntity = this;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public lq getEntByID(int id) {
/* 427 */     return (FMLClientHandler.instance().getClient()).e.a(id);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/entity/EntityTropicalFishHook.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */