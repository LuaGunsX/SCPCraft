/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ public class SCPModel872
/*     */   extends axa
/*     */ {
/*     */   ayf foot;
/*     */   ayf waist;
/*     */   ayf body;
/*     */   ayf shoulderleft;
/*     */   ayf shoulderright;
/*     */   ayf armleft;
/*     */   ayf armleft1;
/*     */   ayf armleft2;
/*     */   ayf armright;
/*     */   ayf armright1;
/*     */   ayf armright2;
/*     */   ayf head;
/*     */   ayf hat;
/*     */   ayf hatrim;
/*     */   
/*     */   public SCPModel872() {
/*  27 */     this.t = 128;
/*  28 */     this.u = 64;
/*     */     
/*  30 */     this.foot = new ayf(this, 38, 51);
/*  31 */     this.foot.a(0.0F, 0.0F, 0.0F, 2, 10, 2);
/*  32 */     this.foot.a(-1.0F, 14.0F, -1.0F);
/*  33 */     this.foot.b(128, 64);
/*  34 */     this.foot.i = true;
/*  35 */     setRotation(this.foot, 0.0F, 0.0F, 0.0F);
/*  36 */     this.waist = new ayf(this, 50, 49);
/*  37 */     this.waist.a(0.0F, 0.0F, 0.0F, 8, 6, 8);
/*  38 */     this.waist.a(-4.0F, 8.0F, -4.0F);
/*  39 */     this.waist.b(128, 64);
/*  40 */     this.waist.i = true;
/*  41 */     setRotation(this.waist, 0.0F, 0.0F, 0.0F);
/*  42 */     this.body = new ayf(this, 43, 30);
/*  43 */     this.body.a(0.0F, 0.0F, 0.0F, 14, 10, 8);
/*  44 */     this.body.a(-7.0F, -2.0F, -4.0F);
/*  45 */     this.body.b(128, 64);
/*  46 */     this.body.i = true;
/*  47 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  48 */     this.shoulderleft = new ayf(this, 28, 41);
/*  49 */     this.shoulderleft.a(0.0F, 0.0F, 0.0F, 2, 3, 4);
/*  50 */     this.shoulderleft.a(-9.0F, -2.0F, -2.0F);
/*  51 */     this.shoulderleft.b(128, 64);
/*  52 */     this.shoulderleft.i = true;
/*  53 */     setRotation(this.shoulderleft, 0.0F, 0.0F, 0.0F);
/*  54 */     this.shoulderright = new ayf(this, 90, 40);
/*  55 */     this.shoulderright.a(0.0F, 0.0F, 0.0F, 2, 3, 4);
/*  56 */     this.shoulderright.a(7.0F, -2.0F, -2.0F);
/*  57 */     this.shoulderright.b(128, 64);
/*  58 */     this.shoulderright.i = true;
/*  59 */     setRotation(this.shoulderright, 0.0F, 0.0F, 0.0F);
/*  60 */     this.armleft = new ayf(this, 0, 0);
/*  61 */     this.armleft.a(0.0F, 0.0F, 0.0F, 17, 1, 2);
/*  62 */     this.armleft.a(-25.0F, 5.0F, -1.0F);
/*  63 */     this.armleft.b(128, 64);
/*  64 */     this.armleft.i = true;
/*  65 */     setRotation(this.armleft, 0.0F, 0.0F, -0.3665191F);
/*  66 */     this.armleft1 = new ayf(this, 0, 5);
/*  67 */     this.armleft1.a(0.0F, 0.0F, 0.0F, 7, 1, 2);
/*  68 */     this.armleft1.a(-23.0F, 7.0F, -1.0F);
/*  69 */     this.armleft1.b(128, 64);
/*  70 */     this.armleft1.i = true;
/*  71 */     setRotation(this.armleft1, 0.0F, 0.0F, -0.715585F);
/*  72 */     this.armleft2 = new ayf(this, 0, 5);
/*  73 */     this.armleft2.a(0.0F, 0.0F, 0.0F, 7, 1, 2);
/*  74 */     this.armleft2.a(-24.0F, 2.0F, -1.0F);
/*  75 */     this.armleft2.b(128, 64);
/*  76 */     this.armleft2.i = true;
/*  77 */     setRotation(this.armleft2, 0.0F, 0.0F, 0.0F);
/*  78 */     this.armright = new ayf(this, 0, 0);
/*  79 */     this.armright.a(0.0F, 0.0F, 0.0F, 19, 1, 2);
/*  80 */     this.armright.a(8.0F, -1.0F, -1.0F);
/*  81 */     this.armright.b(128, 64);
/*  82 */     this.armright.i = true;
/*  83 */     setRotation(this.armright, 0.0F, 0.0F, 0.2617994F);
/*  84 */     this.armright1 = new ayf(this, 0, 9);
/*  85 */     this.armright1.a(0.0F, 0.0F, 0.0F, 9, 1, 2);
/*  86 */     this.armright1.a(19.0F, 2.0F, -1.0F);
/*  87 */     this.armright1.b(128, 64);
/*  88 */     this.armright1.i = true;
/*  89 */     setRotation(this.armright1, 0.0F, 0.0F, 0.6632251F);
/*  90 */     this.armright2 = new ayf(this, 0, 13);
/*  91 */     this.armright2.a(0.0F, 0.0F, 0.0F, 8, 1, 2);
/*  92 */     this.armright2.a(19.0F, 2.0F, -1.0F);
/*  93 */     this.armright2.b(128, 64);
/*  94 */     this.armright2.i = true;
/*  95 */     setRotation(this.armright2, 0.0F, 0.0F, -0.1047198F);
/*  96 */     this.head = new ayf(this, 1, 21);
/*  97 */     this.head.a(0.0F, 0.0F, -1.0F, 8, 8, 8);
/*  98 */     this.head.a(-4.0F, -8.0F, -6.0F);
/*  99 */     this.head.b(128, 64);
/* 100 */     this.head.i = true;
/* 101 */     setRotation(this.head, 0.3839724F, 0.0F, 0.0F);
/* 102 */     this.hat = new ayf(this, 3, 49);
/* 103 */     this.hat.a(0.0F, 0.0F, -1.0F, 8, 6, 8);
/* 104 */     this.hat.a(-4.0F, -12.0F, -7.0F);
/* 105 */     this.hat.b(128, 64);
/* 106 */     this.hat.i = true;
/* 107 */     setRotation(this.hat, 0.3839724F, 0.0F, 0.0F);
/* 108 */     this.hatrim = new ayf(this, 49, 1);
/* 109 */     this.hatrim.a(0.0F, 0.0F, -1.0F, 18, 1, 18);
/* 110 */     this.hatrim.a(-9.0F, -6.0F, -10.0F);
/* 111 */     this.hatrim.b(128, 64);
/* 112 */     this.hatrim.i = true;
/* 113 */     setRotation(this.hatrim, 0.3839724F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 118 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 119 */     a(f, f1, f2, f3, f4, f5, entity);
/* 120 */     this.foot.a(f5);
/* 121 */     this.waist.a(f5);
/* 122 */     this.body.a(f5);
/* 123 */     this.shoulderleft.a(f5);
/* 124 */     this.shoulderright.a(f5);
/* 125 */     this.armleft.a(f5);
/* 126 */     this.armleft1.a(f5);
/* 127 */     this.armleft2.a(f5);
/* 128 */     this.armright.a(f5);
/* 129 */     this.armright1.a(f5);
/* 130 */     this.armright2.a(f5);
/* 131 */     this.head.a(f5);
/* 132 */     this.hat.a(f5);
/* 133 */     this.hatrim.a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ayf model, float x, float y, float z) {
/* 138 */     model.f = x;
/* 139 */     model.g = y;
/* 140 */     model.h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float f, float f1, float f2, float f3, float f4, float f5, lq entity) {
/* 145 */     super.a(f, f1, f2, f3, f4, f5, entity);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel872.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */