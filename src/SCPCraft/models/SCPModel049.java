/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import ke;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ public class SCPModel049
/*     */   extends axa
/*     */ {
/*     */   ayf Thing;
/*     */   ayf MaskTop;
/*     */   ayf MaskSide;
/*     */   ayf MaskBottom;
/*     */   ayf MaskSideleft;
/*     */   ayf head;
/*     */   ayf body;
/*     */   ayf rightarm;
/*     */   ayf leftarm;
/*     */   ayf rightleg;
/*     */   ayf leftleg;
/*     */   ayf Nose;
/*     */   ayf NoseTop;
/*     */   
/*     */   public SCPModel049() {
/*  27 */     this.t = 64;
/*  28 */     this.u = 64;
/*     */ 
/*     */     
/*  31 */     this.Thing = new ayf(this, 18, 19);
/*  32 */     this.Thing.a(-4.0F, 4.5F, 0.0F, 8, 4, 4);
/*  33 */     this.Thing.a(0.0F, 0.0F, 0.0F);
/*  34 */     this.Thing.b(64, 32);
/*  35 */     this.Thing.i = true;
/*  36 */     setRotation(this.Thing, -0.7679449F, 0.0F, 0.0F);
/*  37 */     this.Thing.i = false;
/*  38 */     this.MaskTop = new ayf(this, 2, 7);
/*  39 */     this.MaskTop.a(-4.0F, -10.0F, -5.0F, 8, 1, 1);
/*  40 */     this.MaskTop.a(0.0F, 0.0F, 0.0F);
/*  41 */     this.MaskTop.b(64, 32);
/*  42 */     this.MaskTop.i = true;
/*  43 */     setRotation(this.MaskTop, 0.0F, 0.0F, 0.0F);
/*  44 */     this.MaskSide = new ayf(this, 1, 10);
/*  45 */     this.MaskSide.a(-4.0F, -9.0F, -5.0F, 1, 9, 1);
/*  46 */     this.MaskSide.a(0.0F, 0.0F, 0.0F);
/*  47 */     this.MaskSide.b(64, 32);
/*  48 */     this.MaskSide.i = true;
/*  49 */     setRotation(this.MaskSide, 0.0F, 0.0F, 0.0F);
/*  50 */     this.MaskBottom = new ayf(this, 3, 4);
/*  51 */     this.MaskBottom.a(-3.0F, -1.0F, -5.0F, 7, 1, 1);
/*  52 */     this.MaskBottom.a(0.0F, 0.0F, 0.0F);
/*  53 */     this.MaskBottom.b(64, 32);
/*  54 */     this.MaskBottom.i = true;
/*  55 */     setRotation(this.MaskBottom, 0.0F, 0.0F, 0.0F);
/*  56 */     this.MaskSideleft = new ayf(this, 6, 11);
/*  57 */     this.MaskSideleft.a(3.0F, -9.0F, -5.0F, 1, 8, 1);
/*  58 */     this.MaskSideleft.a(0.0F, 0.0F, 0.0F);
/*  59 */     this.MaskSideleft.b(64, 32);
/*  60 */     this.MaskSideleft.i = true;
/*  61 */     setRotation(this.MaskSideleft, 0.0F, 0.0F, 0.0F);
/*  62 */     this.head = new ayf(this, 31, 0);
/*  63 */     this.head.a(-4.0F, -10.0F, -4.0F, 8, 10, 8);
/*  64 */     this.head.a(0.0F, 0.0F, 0.0F);
/*  65 */     this.head.b(64, 32);
/*  66 */     this.head.i = true;
/*  67 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  68 */     this.body = new ayf(this, 16, 28);
/*  69 */     this.body.a(-4.0F, 0.0F, -3.0F, 8, 19, 6);
/*  70 */     this.body.a(0.0F, 0.0F, 0.0F);
/*  71 */     this.body.b(64, 32);
/*  72 */     this.body.i = true;
/*  73 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  74 */     this.rightarm = new ayf(this, 0, 21);
/*  75 */     this.rightarm.a(-3.0F, -1.0F, -1.0F, 4, 8, 4);
/*  76 */     this.rightarm.a(-5.0F, 2.0F, 0.0F);
/*  77 */     this.rightarm.b(64, 32);
/*  78 */     this.rightarm.i = true;
/*  79 */     setRotation(this.rightarm, -0.8203047F, 0.0F, 0.0F);
/*  80 */     this.leftarm = new ayf(this, 46, 25);
/*  81 */     this.leftarm.a(-1.0F, -1.0F, -1.0F, 4, 8, 4);
/*  82 */     this.leftarm.a(5.0F, 2.0F, 0.0F);
/*  83 */     this.leftarm.b(64, 32);
/*  84 */     this.leftarm.i = true;
/*  85 */     setRotation(this.leftarm, -0.8203047F, 0.0F, 0.0F);
/*  86 */     this.rightleg = new ayf(this, 13, 54);
/*  87 */     this.rightleg.a(-2.0F, 0.0F, -2.0F, 4, 5, 4);
/*  88 */     this.rightleg.a(-2.0F, 19.0F, 0.0F);
/*  89 */     this.rightleg.b(64, 32);
/*  90 */     this.rightleg.i = true;
/*  91 */     setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
/*  92 */     this.leftleg = new ayf(this, 30, 54);
/*  93 */     this.leftleg.a(-2.0F, 0.0F, -2.0F, 4, 5, 4);
/*  94 */     this.leftleg.a(2.0F, 19.0F, 0.0F);
/*  95 */     this.leftleg.b(64, 32);
/*  96 */     this.leftleg.i = true;
/*  97 */     setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
/*  98 */     this.Nose = new ayf(this, 1, 40);
/*  99 */     this.Nose.a(-1.0F, -5.0F, -6.0F, 2, 5, 1);
/* 100 */     this.Nose.a(0.0F, 0.0F, 0.0F);
/* 101 */     this.Nose.b(64, 32);
/* 102 */     this.Nose.i = true;
/* 103 */     setRotation(this.Nose, 0.0F, 0.0F, 0.0F);
/* 104 */     this.NoseTop = new ayf(this, 1, 47);
/* 105 */     this.NoseTop.a(-1.0F, 0.0F, -6.0F, 2, 2, 1);
/* 106 */     this.NoseTop.a(0.0F, 0.0F, 0.0F);
/* 107 */     this.NoseTop.b(64, 32);
/* 108 */     this.NoseTop.i = true;
/* 109 */     setRotation(this.NoseTop, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 114 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 115 */     a(f, f1, f2, f3, f4, f5, entity);
/* 116 */     this.Thing.a(f5);
/* 117 */     this.MaskTop.a(f5);
/* 118 */     this.MaskSide.a(f5);
/* 119 */     this.MaskBottom.a(f5);
/* 120 */     this.MaskSideleft.a(f5);
/* 121 */     this.head.a(f5);
/* 122 */     this.body.a(f5);
/* 123 */     this.rightarm.a(f5);
/* 124 */     this.leftarm.a(f5);
/* 125 */     this.rightleg.a(f5);
/* 126 */     this.leftleg.a(f5);
/* 127 */     this.Nose.a(f5);
/* 128 */     this.NoseTop.a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ayf model, float x, float y, float z) {
/* 133 */     model.f = x;
/* 134 */     model.g = y;
/* 135 */     model.h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float par1, float par2, float par3, float par4, float par5, float par6, lq entity) {
/* 140 */     super.a(par1, par2, par3, par4, par5, par6, entity);
/* 141 */     this.head.g = par4 / 57.295776F;
/* 142 */     this.head.f = par5 / 57.295776F;
/* 143 */     this.MaskTop.g = par4 / 57.295776F;
/* 144 */     this.MaskTop.f = par5 / 57.295776F;
/* 145 */     this.MaskSide.g = par4 / 57.295776F;
/* 146 */     this.MaskSide.f = par5 / 57.295776F;
/* 147 */     this.MaskBottom.g = par4 / 57.295776F;
/* 148 */     this.MaskBottom.f = par5 / 57.295776F;
/* 149 */     this.MaskSideleft.g = par4 / 57.295776F;
/* 150 */     this.MaskSideleft.f = par5 / 57.295776F;
/* 151 */     this.Nose.g = par4 / 57.295776F;
/* 152 */     this.Nose.f = par5 / 57.295776F;
/* 153 */     this.NoseTop.g = par4 / 57.295776F;
/* 154 */     this.NoseTop.f = par5 / 57.295776F;
/* 155 */     this.rightleg.f = ke.b(par1 * 0.6662F) * 1.4F * par2 * 0.5F;
/* 156 */     this.leftleg.f = ke.b(par1 * 0.6662F + 3.1415927F) * 1.4F * par2 * 0.5F;
/* 157 */     this.rightleg.g = 0.0F;
/* 158 */     this.leftleg.g = 0.0F;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel049.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */