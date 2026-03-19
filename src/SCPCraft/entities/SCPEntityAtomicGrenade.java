/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import aoh;
/*     */ import bq;
/*     */ import ke;
/*     */ import lh;
/*     */ import lq;
/*     */ import qx;
/*     */ import ri;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntityAtomicGrenade extends ri {
/*     */   double bounceFactor;
/*     */   
/*     */   public SCPEntityAtomicGrenade(yc world) {
/*  16 */     super(world);
/*  17 */     a(0.5F, 0.5F);
/*  18 */     this.M = this.O / 2.0F;
/*  19 */     this.bounceFactor = 0.75D;
/*  20 */     this.exploded = false;
/*  21 */     this.fuse = 0;
/*     */   }
/*     */   int fuse; boolean exploded;
/*     */   
/*     */   public SCPEntityAtomicGrenade(yc world, lq entity) {
/*  26 */     this(world);
/*  27 */     b(entity.z, 0.0F);
/*     */     
/*  29 */     double xHeading = -ke.a(entity.z * 3.141593F / 180.0F);
/*  30 */     double zHeading = ke.b(entity.z * 3.141593F / 180.0F);
/*  31 */     this.w = 0.5D * xHeading * ke.b(entity.A / 180.0F * 3.141593F);
/*  32 */     this.x = -0.5D * ke.a(entity.A / 180.0F * 3.141593F);
/*  33 */     this.y = 0.5D * zHeading * ke.b(entity.A / 180.0F * 3.141593F);
/*     */ 
/*     */     
/*  36 */     b(entity.t + xHeading * 0.8D, entity.u, entity.v + zHeading * 0.8D);
/*  37 */     this.q = this.t;
/*  38 */     this.r = this.u;
/*  39 */     this.s = this.v;
/*     */     
/*  41 */     this.fuse = 50;
/*     */   }
/*     */   
/*     */   protected boolean f_() {
/*  45 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void j_() {
/*  50 */     if (!this.exploded)
/*     */     {
/*  52 */       for (int var21 = 0; var21 < 4; var21++)
/*     */       {
/*  54 */         this.p.a("crit", this.t + this.w * var21 / 4.0D, this.u + this.x * var21 / 4.0D, this.v + this.y * var21 / 4.0D, -this.w, -this.x + 0.2D, -this.y);
/*     */       }
/*     */     }
/*     */     
/*  58 */     double prevVelX = this.w;
/*  59 */     double prevVelY = this.x;
/*  60 */     double prevVelZ = this.y;
/*  61 */     this.q = this.t;
/*  62 */     this.r = this.u;
/*  63 */     this.s = this.v;
/*  64 */     d(this.w, this.x, this.y);
/*     */ 
/*     */     
/*  67 */     if (this.w != prevVelX)
/*     */     {
/*  69 */       this.w = -this.bounceFactor * prevVelX;
/*     */     }
/*     */     
/*  72 */     if (this.x != prevVelY) {
/*     */       
/*  74 */       this.x = -this.bounceFactor * prevVelY;
/*     */     }
/*     */     else {
/*     */       
/*  78 */       this.x -= 0.04D;
/*     */     } 
/*     */     
/*  81 */     if (this.y != prevVelZ)
/*     */     {
/*  83 */       this.y = -this.bounceFactor * prevVelZ;
/*     */     }
/*     */ 
/*     */     
/*  87 */     this.w *= 0.99D;
/*  88 */     this.x *= 0.99D;
/*  89 */     this.y *= 0.99D;
/*     */ 
/*     */     
/*  92 */     if (this.fuse-- <= 0)
/*     */     {
/*  94 */       explode();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private void explode() {
/* 100 */     if (!this.exploded) {
/*     */       
/* 102 */       this.exploded = true;
/* 103 */       this.p.a(null, this.t, this.u, this.v, 4.0F, true);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(lh entity, int i) {
/* 109 */     super.a(entity, i);
/* 110 */     explode();
/* 111 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq nbttagcompound) {
/* 117 */     super.b(nbttagcompound);
/* 118 */     nbttagcompound.a("Fuse", (byte)this.fuse);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bq nbttagcompound) {
/* 123 */     super.a(nbttagcompound);
/* 124 */     this.fuse = nbttagcompound.c("Fuse");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c_(qx entityplayer) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(aoh var1) {
/* 138 */     explode();
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntityAtomicGrenade.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */