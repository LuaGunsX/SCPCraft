/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import ke;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ public class SCPModel457
/*     */   extends axa
/*     */ {
/*     */   ayf head;
/*     */   ayf body;
/*     */   ayf rightarm;
/*     */   ayf leftarm;
/*     */   ayf rightleg;
/*     */   ayf leftleg;
/*     */   
/*     */   public SCPModel457() {
/*  20 */     this.t = 64;
/*  21 */     this.u = 32;
/*     */     
/*  23 */     this.head = new ayf(this, 0, 0);
/*  24 */     this.head.a(-3.0F, -6.0F, -3.0F, 6, 6, 5);
/*  25 */     this.head.a(0.0F, 2.0F, 0.0F);
/*  26 */     this.head.b(64, 32);
/*  27 */     this.head.i = true;
/*  28 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  29 */     this.body = new ayf(this, 16, 16);
/*  30 */     this.body.a(-3.0F, 0.0F, -2.0F, 6, 12, 3);
/*  31 */     this.body.a(0.0F, 2.0F, 0.0F);
/*  32 */     this.body.b(64, 32);
/*  33 */     this.body.i = true;
/*  34 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  35 */     this.rightarm = new ayf(this, 40, 16);
/*  36 */     this.rightarm.a(-3.0F, -2.0F, -2.0F, 3, 12, 3);
/*  37 */     this.rightarm.a(-3.0F, 4.0F, 0.0F);
/*  38 */     this.rightarm.b(64, 32);
/*  39 */     this.rightarm.i = true;
/*  40 */     setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
/*  41 */     this.leftarm = new ayf(this, 40, 16);
/*  42 */     this.leftarm.a(-1.0F, -2.0F, -2.0F, 3, 12, 3);
/*  43 */     this.leftarm.a(4.0F, 4.0F, 0.0F);
/*  44 */     this.leftarm.b(64, 32);
/*  45 */     this.leftarm.i = true;
/*  46 */     setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
/*  47 */     this.rightleg = new ayf(this, 0, 16);
/*  48 */     this.rightleg.a(-2.0F, 0.0F, -2.0F, 3, 10, 3);
/*  49 */     this.rightleg.a(-1.0F, 14.0F, 0.0F);
/*  50 */     this.rightleg.b(64, 32);
/*  51 */     this.rightleg.i = true;
/*  52 */     setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
/*  53 */     this.leftleg = new ayf(this, 0, 16);
/*  54 */     this.leftleg.a(-1.0F, 0.0F, -2.0F, 3, 10, 3);
/*  55 */     this.leftleg.a(1.0F, 14.0F, 0.0F);
/*  56 */     this.leftleg.b(64, 32);
/*  57 */     this.leftleg.i = true;
/*  58 */     setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*  63 */     super.a(entity, f, f1, f2, f3, f4, f5);
/*  64 */     setRotationAngles(f, f1, f2, f3, f4, f5);
/*  65 */     this.head.a(f5);
/*  66 */     this.body.a(f5);
/*  67 */     this.rightarm.a(f5);
/*  68 */     this.leftarm.a(f5);
/*  69 */     this.rightleg.a(f5);
/*  70 */     this.leftleg.a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ayf model, float x, float y, float z) {
/*  75 */     model.f = x;
/*  76 */     model.g = y;
/*  77 */     model.h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6) {
/*  82 */     this.head.g = par4 / 57.295776F;
/*  83 */     this.head.f = par5 / 57.295776F;
/*  84 */     this.rightleg.f = ke.b(par1 * 0.6662F) * 1.4F * par2;
/*  85 */     this.leftleg.f = ke.b(par1 * 0.6662F + 3.1415927F) * 1.4F * par2;
/*  86 */     this.rightleg.g = 0.0F;
/*  87 */     this.leftleg.g = 0.0F;
/*     */     
/*  89 */     if (this.q) {
/*     */       
/*  91 */       this.rightleg.f = -1.2566371F;
/*  92 */       this.leftleg.f = -1.2566371F;
/*  93 */       this.rightleg.g = 0.31415927F;
/*  94 */       this.leftleg.g = -0.31415927F;
/*     */     } 
/*     */     
/*  97 */     if (this.p > -9990.0F) {
/*     */       
/*  99 */       float f = this.p;
/* 100 */       this.body.g = ke.a(ke.c(f) * 3.1415927F * 2.0F) * 0.2F;
/* 101 */       f = 1.0F - this.p;
/* 102 */       f *= f;
/* 103 */       f *= f;
/* 104 */       f = 1.0F - f;
/* 105 */       float f2 = ke.a(f * 3.1415927F);
/* 106 */       float f4 = ke.a(this.p * 3.1415927F) * -(this.head.f - 0.7F) * 0.75F;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel457.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */