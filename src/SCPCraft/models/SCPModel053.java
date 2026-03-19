/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import ke;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ public class SCPModel053
/*     */   extends axa
/*     */ {
/*     */   ayf head;
/*     */   ayf body;
/*     */   ayf rightarm;
/*     */   ayf leftarm;
/*     */   ayf rightleg;
/*     */   ayf leftleg;
/*     */   ayf waist;
/*     */   
/*     */   public SCPModel053() {
/*  21 */     this.t = 64;
/*  22 */     this.u = 64;
/*     */     
/*  24 */     this.head = new ayf(this, 0, 0);
/*  25 */     this.head.a(-4.0F, -8.0F, -4.0F, 8, 8, 8);
/*  26 */     this.head.a(0.0F, 5.0F, 0.0F);
/*  27 */     this.head.b(64, 64);
/*  28 */     this.head.i = true;
/*  29 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  30 */     this.body = new ayf(this, 17, 17);
/*  31 */     this.body.a(-3.0F, 0.0F, -2.0F, 6, 10, 4);
/*  32 */     this.body.a(0.0F, 5.0F, 0.0F);
/*  33 */     this.body.b(64, 64);
/*  34 */     this.body.i = true;
/*  35 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  36 */     this.rightarm = new ayf(this, 40, 16);
/*  37 */     this.rightarm.a(-3.0F, -2.0F, -2.0F, 3, 9, 3);
/*  38 */     this.rightarm.a(-3.0F, 7.0F, 1.0F);
/*  39 */     this.rightarm.b(64, 64);
/*  40 */     this.rightarm.i = true;
/*  41 */     setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
/*  42 */     this.leftarm = new ayf(this, 40, 16);
/*  43 */     this.leftarm.a(-1.0F, -2.0F, -1.0F, 3, 9, 3);
/*  44 */     this.leftarm.a(4.0F, 7.0F, 0.0F);
/*  45 */     this.leftarm.b(64, 64);
/*  46 */     this.leftarm.i = true;
/*  47 */     setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
/*  48 */     this.rightleg = new ayf(this, 0, 16);
/*  49 */     this.rightleg.a(-1.0F, 0.0F, -2.0F, 3, 4, 4);
/*  50 */     this.rightleg.a(-2.0F, 20.0F, 0.0F);
/*  51 */     this.rightleg.b(64, 64);
/*  52 */     this.rightleg.i = true;
/*  53 */     setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
/*  54 */     this.leftleg = new ayf(this, 0, 16);
/*  55 */     this.leftleg.a(-2.0F, 0.0F, -2.0F, 3, 4, 4);
/*  56 */     this.leftleg.a(2.0F, 20.0F, 0.0F);
/*  57 */     this.leftleg.b(64, 64);
/*  58 */     this.leftleg.i = true;
/*  59 */     setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
/*  60 */     this.waist = new ayf(this, 13, 35);
/*  61 */     this.waist.a(-4.0F, 13.0F, -3.0F, 8, 5, 6);
/*  62 */     this.waist.a(0.0F, 2.0F, 0.0F);
/*  63 */     this.waist.b(64, 64);
/*  64 */     this.waist.i = true;
/*  65 */     setRotation(this.waist, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*  70 */     super.a(entity, f, f1, f2, f3, f4, f5);
/*  71 */     a(f, f1, f2, f3, f4, f5, entity);
/*  72 */     this.head.a(f5);
/*  73 */     this.body.a(f5);
/*  74 */     this.rightarm.a(f5);
/*  75 */     this.leftarm.a(f5);
/*  76 */     this.rightleg.a(f5);
/*  77 */     this.leftleg.a(f5);
/*  78 */     this.waist.a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ayf model, float x, float y, float z) {
/*  83 */     model.f = x;
/*  84 */     model.g = y;
/*  85 */     model.h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float f, float f1, float f2, float f3, float f4, float f5, lq entity) {
/*  90 */     super.a(f, f1, f2, f3, f4, f5, entity);
/*  91 */     this.head.g = f3 / 57.295776F;
/*  92 */     this.head.f = f4 / 57.295776F;
/*  93 */     this.rightleg.f = ke.b(f * 0.6662F) * 1.4F * f1;
/*  94 */     this.leftleg.f = ke.b(f * 0.6662F + 3.1415927F) * 1.4F * f1;
/*  95 */     this.rightleg.g = 0.0F;
/*  96 */     this.leftleg.g = 0.0F;
/*  97 */     this.rightarm.f = ke.b(f * 0.6662F + 3.1415927F) * 2.0F * f1 * 0.5F;
/*  98 */     this.leftarm.f = ke.b(f * 0.6662F) * 2.0F * f1 * 0.5F;
/*  99 */     this.rightarm.h = 0.0F;
/* 100 */     this.leftarm.h = 0.0F;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel053.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */