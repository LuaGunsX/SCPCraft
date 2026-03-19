/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ public class SCPModel019
/*     */   extends axa
/*     */ {
/*     */   ayf base;
/*     */   ayf head;
/*     */   ayf armleft;
/*     */   ayf armright;
/*     */   ayf rimback;
/*     */   ayf rimleft;
/*     */   ayf rimfront;
/*     */   ayf rimright;
/*     */   ayf thingyleft;
/*     */   ayf thingyright;
/*     */   
/*     */   public SCPModel019() {
/*  23 */     this.t = 64;
/*  24 */     this.u = 64;
/*     */     
/*  26 */     this.base = new ayf(this, 9, 39);
/*  27 */     this.base.a(0.0F, 0.0F, 0.0F, 14, 16, 8);
/*  28 */     this.base.a(-7.0F, 8.0F, -4.0F);
/*  29 */     this.base.b(64, 64);
/*  30 */     this.base.i = true;
/*  31 */     setRotation(this.base, 0.0F, 0.0F, 0.0F);
/*  32 */     this.head = new ayf(this, 13, 25);
/*  33 */     this.head.a(0.0F, 0.0F, 0.0F, 12, 7, 6);
/*  34 */     this.head.a(-6.0F, 1.0F, -3.0F);
/*  35 */     this.head.b(64, 64);
/*  36 */     this.head.i = true;
/*  37 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  38 */     this.armleft = new ayf(this, 38, 14);
/*  39 */     this.armleft.a(0.0F, 0.0F, 0.0F, 1, 9, 1);
/*  40 */     this.armleft.a(-8.0F, 0.0F, 0.0F);
/*  41 */     this.armleft.b(64, 64);
/*  42 */     this.armleft.i = true;
/*  43 */     setRotation(this.armleft, 0.0F, 0.0F, 0.0F);
/*  44 */     this.armright = new ayf(this, 43, 14);
/*  45 */     this.armright.a(0.0F, 0.0F, 0.0F, 1, 9, 1);
/*  46 */     this.armright.a(7.0F, 0.0F, 0.0F);
/*  47 */     this.armright.b(64, 64);
/*  48 */     this.armright.i = true;
/*  49 */     setRotation(this.armright, 0.0F, 0.0F, 0.0F);
/*  50 */     this.rimback = new ayf(this, 1, 7);
/*  51 */     this.rimback.a(0.0F, 0.0F, 0.0F, 14, 2, 1);
/*  52 */     this.rimback.a(-7.0F, -1.0F, 3.0F);
/*  53 */     this.rimback.b(64, 64);
/*  54 */     this.rimback.i = true;
/*  55 */     setRotation(this.rimback, 0.0F, 0.0F, 0.0F);
/*  56 */     this.rimleft = new ayf(this, 1, 11);
/*  57 */     this.rimleft.a(0.0F, 0.0F, 0.0F, 1, 2, 7);
/*  58 */     this.rimleft.a(-7.0F, -1.0F, -4.0F);
/*  59 */     this.rimleft.b(64, 64);
/*  60 */     this.rimleft.i = true;
/*  61 */     setRotation(this.rimleft, 0.0F, 0.0F, 0.0F);
/*  62 */     this.rimfront = new ayf(this, 1, 21);
/*  63 */     this.rimfront.a(0.0F, 0.0F, 0.0F, 13, 2, 1);
/*  64 */     this.rimfront.a(-6.0F, -1.0F, -4.0F);
/*  65 */     this.rimfront.b(64, 64);
/*  66 */     this.rimfront.i = true;
/*  67 */     setRotation(this.rimfront, 0.0F, 0.0F, 0.0F);
/*  68 */     this.rimright = new ayf(this, 18, 12);
/*  69 */     this.rimright.a(0.0F, 0.0F, 0.0F, 1, 2, 6);
/*  70 */     this.rimright.a(6.0F, -1.0F, -3.0F);
/*  71 */     this.rimright.b(64, 64);
/*  72 */     this.rimright.i = true;
/*  73 */     setRotation(this.rimright, 0.0F, 0.0F, 0.0F);
/*  74 */     this.thingyleft = new ayf(this, 36, 10);
/*  75 */     this.thingyleft.a(0.0F, 0.0F, 0.0F, 2, 2, 1);
/*  76 */     this.thingyleft.a(-9.0F, -2.0F, 0.0F);
/*  77 */     this.thingyleft.b(64, 64);
/*  78 */     this.thingyleft.i = true;
/*  79 */     setRotation(this.thingyleft, 0.0F, 0.0F, 0.0F);
/*  80 */     this.thingyright = new ayf(this, 43, 10);
/*  81 */     this.thingyright.a(0.0F, 0.0F, 0.0F, 2, 2, 1);
/*  82 */     this.thingyright.a(7.0F, -2.0F, 0.0F);
/*  83 */     this.thingyright.b(64, 64);
/*  84 */     this.thingyright.i = true;
/*  85 */     setRotation(this.thingyright, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*  90 */     super.a(entity, f, f1, f2, f3, f4, f5);
/*  91 */     a(f, f1, f2, f3, f4, f5, entity);
/*  92 */     this.base.a(f5);
/*  93 */     this.head.a(f5);
/*  94 */     this.armleft.a(f5);
/*  95 */     this.armright.a(f5);
/*  96 */     this.rimback.a(f5);
/*  97 */     this.rimleft.a(f5);
/*  98 */     this.rimfront.a(f5);
/*  99 */     this.rimright.a(f5);
/* 100 */     this.thingyleft.a(f5);
/* 101 */     this.thingyright.a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   public void renderModel(float f1) {
/* 106 */     this.base.a(f1);
/* 107 */     this.head.a(f1);
/* 108 */     this.armleft.a(f1);
/* 109 */     this.armright.a(f1);
/* 110 */     this.rimback.a(f1);
/* 111 */     this.rimfront.a(f1);
/* 112 */     this.rimleft.a(f1);
/* 113 */     this.rimright.a(f1);
/* 114 */     this.thingyleft.a(f1);
/* 115 */     this.thingyright.a(f1);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ayf model, float x, float y, float z) {
/* 120 */     model.f = x;
/* 121 */     model.g = y;
/* 122 */     model.h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float f1, float f2, float f3, float f4, float f5, float f6, lq par7Entity) {
/* 127 */     super.a(f1, f2, f3, f4, f5, f6, par7Entity);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel019.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */