/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import ke;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ public class SCPModel096Aggro
/*     */   extends axa
/*     */ {
/*     */   ayf head;
/*     */   ayf body;
/*     */   ayf rightarm;
/*     */   ayf leftarm;
/*     */   ayf rightleg;
/*     */   ayf leftleg;
/*     */   ayf neck;
/*     */   ayf mouth;
/*     */   
/*     */   public SCPModel096Aggro() {
/*  22 */     this.t = 64;
/*  23 */     this.u = 32;
/*     */     
/*  25 */     this.head = new ayf(this, 21, 1);
/*  26 */     this.head.a(-3.0F, -8.0F, -4.0F, 6, 6, 6);
/*  27 */     this.head.a(0.0F, -3.0F, 1.0F);
/*  28 */     this.head.b(64, 32);
/*  29 */     this.head.i = true;
/*  30 */     setRotation(this.head, 0.2094395F, 0.0F, 0.0F);
/*  31 */     this.body = new ayf(this, 36, 17);
/*  32 */     this.body.a(-3.0F, 0.0F, -1.0F, 6, 12, 2);
/*  33 */     this.body.a(0.0F, -3.0F, 1.0F);
/*  34 */     this.body.b(64, 32);
/*  35 */     this.body.i = true;
/*  36 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  37 */     this.rightarm = new ayf(this, 54, 1);
/*  38 */     this.rightarm.a(-2.0F, -2.0F, -1.0F, 2, 15, 2);
/*  39 */     this.rightarm.a(-3.0F, -1.0F, 1.0F);
/*  40 */     this.rightarm.b(64, 32);
/*  41 */     this.rightarm.i = true;
/*  42 */     setRotation(this.rightarm, -1.48353F, 0.0F, 0.0F);
/*  43 */     this.leftarm = new ayf(this, 54, 1);
/*  44 */     this.leftarm.a(0.0F, -2.0F, -1.0F, 2, 15, 2);
/*  45 */     this.leftarm.a(3.0F, -1.0F, 1.0F);
/*  46 */     this.leftarm.b(64, 32);
/*  47 */     this.leftarm.i = true;
/*  48 */     setRotation(this.leftarm, -1.518436F, 0.0F, 0.0F);
/*  49 */     this.rightleg = new ayf(this, 1, 4);
/*  50 */     this.rightleg.a(-1.0F, 0.0F, -1.0F, 2, 15, 2);
/*  51 */     this.rightleg.a(-2.0F, 9.0F, 1.0F);
/*  52 */     this.rightleg.b(64, 32);
/*  53 */     this.rightleg.i = true;
/*  54 */     setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
/*  55 */     this.leftleg = new ayf(this, 1, 4);
/*  56 */     this.leftleg.a(-1.0F, 0.0F, -1.0F, 2, 15, 2);
/*  57 */     this.leftleg.a(2.0F, 9.0F, 1.0F);
/*  58 */     this.leftleg.b(64, 32);
/*  59 */     this.leftleg.i = true;
/*  60 */     setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
/*  61 */     this.neck = new ayf(this, 10, 1);
/*  62 */     this.neck.a(-2.0F, -2.0F, 0.0F, 4, 2, 1);
/*  63 */     this.neck.a(0.0F, -3.0F, 1.0F);
/*  64 */     this.neck.b(64, 32);
/*  65 */     this.neck.i = true;
/*  66 */     setRotation(this.neck, 0.0F, 0.0F, 0.0F);
/*  67 */     this.mouth = new ayf(this, 15, 14);
/*  68 */     this.mouth.a(-3.0F, -2.0F, -4.0F, 6, 3, 2);
/*  69 */     this.mouth.a(0.0F, -3.0F, 1.0F);
/*  70 */     this.mouth.b(64, 32);
/*  71 */     this.mouth.i = true;
/*  72 */     setRotation(this.mouth, 0.2094395F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*  77 */     super.a(entity, f, f1, f2, f3, f4, f5);
/*  78 */     a(f, f1, f2, f3, f4, f5, entity);
/*  79 */     this.head.a(f5);
/*  80 */     this.body.a(f5);
/*  81 */     this.rightarm.a(f5);
/*  82 */     this.leftarm.a(f5);
/*  83 */     this.rightleg.a(f5);
/*  84 */     this.leftleg.a(f5);
/*  85 */     this.neck.a(f5);
/*  86 */     this.mouth.a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ayf model, float x, float y, float z) {
/*  91 */     model.f = x;
/*  92 */     model.g = y;
/*  93 */     model.h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float f, float f1, float f2, float f3, float f4, float f5, lq entity) {
/*  98 */     super.a(f, f1, f2, f3, f4, f5, entity);
/*  99 */     this.head.g = f3 / 57.295776F;
/* 100 */     this.head.f = f4 / 57.295776F;
/* 101 */     this.mouth.g = f3 / 57.295776F;
/* 102 */     this.mouth.f = f4 / 57.295776F;
/* 103 */     this.rightleg.f = ke.b(f * 0.6662F) * 1.4F * f1;
/* 104 */     this.leftleg.f = ke.b(f * 0.6662F + 3.1415927F) * 1.4F * f1;
/* 105 */     this.rightleg.g = 0.0F;
/* 106 */     this.leftleg.g = 0.0F;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel096Aggro.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */