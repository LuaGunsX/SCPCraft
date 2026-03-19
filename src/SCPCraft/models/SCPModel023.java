/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import ke;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ public class SCPModel023
/*     */   extends axa
/*     */ {
/*     */   ayf WolfHead;
/*     */   ayf Body;
/*     */   ayf Mane;
/*     */   ayf Leg1;
/*     */   ayf Leg2;
/*     */   ayf Leg3;
/*     */   ayf Leg4;
/*     */   ayf Tail;
/*     */   ayf Ear1;
/*     */   ayf Ear2;
/*     */   ayf Nose;
/*     */   
/*     */   public SCPModel023() {
/*  25 */     this.t = 64;
/*  26 */     this.u = 32;
/*     */     
/*  28 */     this.WolfHead = new ayf(this, 0, 0);
/*  29 */     this.WolfHead.a(-3.0F, -3.0F, -2.0F, 6, 6, 4);
/*  30 */     this.WolfHead.a(-1.0F, 13.5F, -7.0F);
/*  31 */     this.WolfHead.b(64, 32);
/*  32 */     this.WolfHead.i = true;
/*  33 */     setRotation(this.WolfHead, 0.0F, 0.0F, 0.0F);
/*  34 */     this.Body = new ayf(this, 18, 14);
/*  35 */     this.Body.a(-4.0F, -2.0F, -3.0F, 6, 9, 6);
/*  36 */     this.Body.a(0.0F, 14.0F, 2.0F);
/*  37 */     this.Body.b(64, 32);
/*  38 */     this.Body.i = true;
/*  39 */     setRotation(this.Body, 1.570796F, 0.0F, 0.0F);
/*  40 */     this.Mane = new ayf(this, 21, 0);
/*  41 */     this.Mane.a(-4.0F, -3.0F, -3.0F, 8, 6, 7);
/*  42 */     this.Mane.a(-1.0F, 14.0F, -3.0F);
/*  43 */     this.Mane.b(64, 32);
/*  44 */     this.Mane.i = true;
/*  45 */     setRotation(this.Mane, 1.570796F, 0.0F, 0.0F);
/*  46 */     this.Leg1 = new ayf(this, 0, 18);
/*  47 */     this.Leg1.a(-1.0F, 0.0F, -1.0F, 2, 8, 2);
/*  48 */     this.Leg1.a(-2.5F, 16.0F, 7.0F);
/*  49 */     this.Leg1.b(64, 32);
/*  50 */     this.Leg1.i = true;
/*  51 */     setRotation(this.Leg1, 0.0F, 0.0F, 0.0F);
/*  52 */     this.Leg2 = new ayf(this, 0, 18);
/*  53 */     this.Leg2.a(-1.0F, 0.0F, -1.0F, 2, 8, 2);
/*  54 */     this.Leg2.a(0.5F, 16.0F, 7.0F);
/*  55 */     this.Leg2.b(64, 32);
/*  56 */     this.Leg2.i = true;
/*  57 */     setRotation(this.Leg2, 0.0F, 0.0F, 0.0F);
/*  58 */     this.Leg3 = new ayf(this, 0, 18);
/*  59 */     this.Leg3.a(-1.0F, 0.0F, -1.0F, 2, 8, 2);
/*  60 */     this.Leg3.a(-2.5F, 16.0F, -4.0F);
/*  61 */     this.Leg3.b(64, 32);
/*  62 */     this.Leg3.i = true;
/*  63 */     setRotation(this.Leg3, 0.0F, 0.0F, 0.0F);
/*  64 */     this.Leg4 = new ayf(this, 0, 18);
/*  65 */     this.Leg4.a(-1.0F, 0.0F, -1.0F, 2, 8, 2);
/*  66 */     this.Leg4.a(0.5F, 16.0F, -4.0F);
/*  67 */     this.Leg4.b(64, 32);
/*  68 */     this.Leg4.i = true;
/*  69 */     setRotation(this.Leg4, 0.0F, 0.0F, 0.0F);
/*  70 */     this.Tail = new ayf(this, 9, 18);
/*  71 */     this.Tail.a(-1.0F, 0.0F, -1.0F, 2, 8, 2);
/*  72 */     this.Tail.a(-1.0F, 12.0F, 8.0F);
/*  73 */     this.Tail.b(64, 32);
/*  74 */     this.Tail.i = true;
/*  75 */     setRotation(this.Tail, 1.130069F, 0.0F, 0.0F);
/*  76 */     this.Ear1 = new ayf(this, 16, 14);
/*  77 */     this.Ear1.a(-3.0F, -5.0F, 0.0F, 2, 2, 1);
/*  78 */     this.Ear1.a(-1.0F, 13.5F, -7.0F);
/*  79 */     this.Ear1.b(64, 32);
/*  80 */     this.Ear1.i = true;
/*  81 */     setRotation(this.Ear1, 0.0F, 0.0F, 0.0F);
/*  82 */     this.Ear2 = new ayf(this, 16, 14);
/*  83 */     this.Ear2.a(1.0F, -5.0F, 0.0F, 2, 2, 1);
/*  84 */     this.Ear2.a(-1.0F, 13.5F, -7.0F);
/*  85 */     this.Ear2.b(64, 32);
/*  86 */     this.Ear2.i = true;
/*  87 */     setRotation(this.Ear2, 0.0F, 0.0F, 0.0F);
/*  88 */     this.Nose = new ayf(this, 0, 10);
/*  89 */     this.Nose.a(-2.0F, 0.0F, -5.0F, 3, 3, 4);
/*  90 */     this.Nose.a(-0.5F, 13.5F, -7.0F);
/*  91 */     this.Nose.b(64, 32);
/*  92 */     this.Nose.i = true;
/*  93 */     setRotation(this.Nose, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*  98 */     super.a(entity, f, f1, f2, f3, f4, f5);
/*  99 */     setRotationAngles(f, f1, f2, f3, f4, f5);
/* 100 */     this.WolfHead.a(f5);
/* 101 */     this.Body.a(f5);
/* 102 */     this.Mane.a(f5);
/* 103 */     this.Leg1.a(f5);
/* 104 */     this.Leg2.a(f5);
/* 105 */     this.Leg3.a(f5);
/* 106 */     this.Leg4.a(f5);
/* 107 */     this.Tail.a(f5);
/* 108 */     this.Ear1.a(f5);
/* 109 */     this.Ear2.a(f5);
/* 110 */     this.Nose.a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ayf model, float x, float y, float z) {
/* 115 */     model.f = x;
/* 116 */     model.g = y;
/* 117 */     model.h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6) {
/* 122 */     this.WolfHead.f = par5 / 57.295776F;
/* 123 */     this.WolfHead.g = par4 / 57.295776F;
/* 124 */     this.Ear1.f = par5 / 57.295776F;
/* 125 */     this.Ear1.g = par4 / 57.295776F;
/* 126 */     this.Ear2.f = par5 / 57.295776F;
/* 127 */     this.Ear2.g = par4 / 57.295776F;
/* 128 */     this.Nose.f = par5 / 57.295776F;
/* 129 */     this.Nose.g = par4 / 57.295776F;
/* 130 */     this.Body.f = 1.5707964F;
/* 131 */     this.Leg1.f = ke.b(par1 * 0.6662F) * 1.4F * par2;
/* 132 */     this.Leg2.f = ke.b(par1 * 0.6662F + 3.1415927F) * 1.4F * par2;
/* 133 */     this.Leg3.f = ke.b(par1 * 0.6662F + 3.1415927F) * 1.4F * par2;
/* 134 */     this.Leg4.f = ke.b(par1 * 0.6662F) * 1.4F * par2;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel023.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */