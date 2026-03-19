/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import ke;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPModel538
/*     */   extends axa
/*     */ {
/*     */   public ayf spiderHead;
/*     */   public ayf spiderNeck;
/*     */   public ayf spiderBody;
/*     */   public ayf spiderLeg1;
/*     */   public ayf spiderLeg2;
/*     */   public ayf spiderLeg3;
/*     */   public ayf spiderLeg4;
/*     */   public ayf spiderLeg5;
/*     */   public ayf spiderLeg6;
/*     */   public ayf spiderLeg7;
/*     */   public ayf spiderLeg8;
/*     */   
/*     */   public SCPModel538() {
/*  45 */     float f = 0.0F;
/*  46 */     int i = 15;
/*  47 */     this.spiderHead = new ayf(this, 32, 4);
/*  48 */     this.spiderHead.a(-4.0F, -4.0F, -8.0F, 8, 8, 8, f);
/*  49 */     this.spiderHead.a(0.0F, i, -3.0F);
/*  50 */     this.spiderNeck = new ayf(this, 0, 0);
/*  51 */     this.spiderNeck.a(-3.0F, -3.0F, -3.0F, 6, 6, 6, f);
/*  52 */     this.spiderNeck.a(0.0F, i, 0.0F);
/*  53 */     this.spiderBody = new ayf(this, 0, 12);
/*  54 */     this.spiderBody.a(-5.0F, -4.0F, -6.0F, 10, 8, 12, f);
/*  55 */     this.spiderBody.a(0.0F, i, 9.0F);
/*  56 */     this.spiderLeg1 = new ayf(this, 18, 0);
/*  57 */     this.spiderLeg1.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, f);
/*  58 */     this.spiderLeg1.a(-4.0F, i, 2.0F);
/*  59 */     this.spiderLeg2 = new ayf(this, 18, 0);
/*  60 */     this.spiderLeg2.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, f);
/*  61 */     this.spiderLeg2.a(4.0F, i, 2.0F);
/*  62 */     this.spiderLeg3 = new ayf(this, 18, 0);
/*  63 */     this.spiderLeg3.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, f);
/*  64 */     this.spiderLeg3.a(-4.0F, i, 1.0F);
/*  65 */     this.spiderLeg4 = new ayf(this, 18, 0);
/*  66 */     this.spiderLeg4.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, f);
/*  67 */     this.spiderLeg4.a(4.0F, i, 1.0F);
/*  68 */     this.spiderLeg5 = new ayf(this, 18, 0);
/*  69 */     this.spiderLeg5.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, f);
/*  70 */     this.spiderLeg5.a(-4.0F, i, 0.0F);
/*  71 */     this.spiderLeg6 = new ayf(this, 18, 0);
/*  72 */     this.spiderLeg6.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, f);
/*  73 */     this.spiderLeg6.a(4.0F, i, 0.0F);
/*  74 */     this.spiderLeg7 = new ayf(this, 18, 0);
/*  75 */     this.spiderLeg7.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, f);
/*  76 */     this.spiderLeg7.a(-4.0F, i, -1.0F);
/*  77 */     this.spiderLeg8 = new ayf(this, 18, 0);
/*  78 */     this.spiderLeg8.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, f);
/*  79 */     this.spiderLeg8.a(4.0F, i, -1.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(lq par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
/*  87 */     setRotationAngles(par2, par3, par4, par5, par6, par7);
/*  88 */     this.spiderHead.a(par7);
/*  89 */     this.spiderNeck.a(par7);
/*  90 */     this.spiderBody.a(par7);
/*  91 */     this.spiderLeg1.a(par7);
/*  92 */     this.spiderLeg2.a(par7);
/*  93 */     this.spiderLeg3.a(par7);
/*  94 */     this.spiderLeg4.a(par7);
/*  95 */     this.spiderLeg5.a(par7);
/*  96 */     this.spiderLeg6.a(par7);
/*  97 */     this.spiderLeg7.a(par7);
/*  98 */     this.spiderLeg8.a(par7);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6) {
/* 106 */     this.spiderHead.g = par4 / 57.295776F;
/* 107 */     this.spiderHead.f = par5 / 57.295776F;
/* 108 */     float f = 0.7853982F;
/* 109 */     this.spiderLeg1.h = -f;
/* 110 */     this.spiderLeg2.h = f;
/* 111 */     this.spiderLeg3.h = -f * 0.74F;
/* 112 */     this.spiderLeg4.h = f * 0.74F;
/* 113 */     this.spiderLeg5.h = -f * 0.74F;
/* 114 */     this.spiderLeg6.h = f * 0.74F;
/* 115 */     this.spiderLeg7.h = -f;
/* 116 */     this.spiderLeg8.h = f;
/* 117 */     float f1 = -0.0F;
/* 118 */     float f2 = 0.3926991F;
/* 119 */     this.spiderLeg1.g = f2 * 2.0F + f1;
/* 120 */     this.spiderLeg2.g = -f2 * 2.0F - f1;
/* 121 */     this.spiderLeg3.g = f2 * 1.0F + f1;
/* 122 */     this.spiderLeg4.g = -f2 * 1.0F - f1;
/* 123 */     this.spiderLeg5.g = -f2 * 1.0F + f1;
/* 124 */     this.spiderLeg6.g = f2 * 1.0F - f1;
/* 125 */     this.spiderLeg7.g = -f2 * 2.0F + f1;
/* 126 */     this.spiderLeg8.g = f2 * 2.0F - f1;
/* 127 */     float f3 = -(ke.b(par1 * 0.6662F * 2.0F + 0.0F) * 0.4F) * par2;
/* 128 */     float f4 = -(ke.b(par1 * 0.6662F * 2.0F + 3.1415927F) * 0.4F) * par2;
/* 129 */     float f5 = -(ke.b(par1 * 0.6662F * 2.0F + 1.5707964F) * 0.4F) * par2;
/* 130 */     float f6 = -(ke.b(par1 * 0.6662F * 2.0F + 4.712389F) * 0.4F) * par2;
/* 131 */     float f7 = Math.abs(ke.a(par1 * 0.6662F + 0.0F) * 0.4F) * par2;
/* 132 */     float f8 = Math.abs(ke.a(par1 * 0.6662F + 3.1415927F) * 0.4F) * par2;
/* 133 */     float f9 = Math.abs(ke.a(par1 * 0.6662F + 1.5707964F) * 0.4F) * par2;
/* 134 */     float f10 = Math.abs(ke.a(par1 * 0.6662F + 4.712389F) * 0.4F) * par2;
/* 135 */     this.spiderLeg1.g += f3;
/* 136 */     this.spiderLeg2.g += -f3;
/* 137 */     this.spiderLeg3.g += f4;
/* 138 */     this.spiderLeg4.g += -f4;
/* 139 */     this.spiderLeg5.g += f5;
/* 140 */     this.spiderLeg6.g += -f5;
/* 141 */     this.spiderLeg7.g += f6;
/* 142 */     this.spiderLeg8.g += -f6;
/* 143 */     this.spiderLeg1.h += f7;
/* 144 */     this.spiderLeg2.h += -f7;
/* 145 */     this.spiderLeg3.h += f8;
/* 146 */     this.spiderLeg4.h += -f8;
/* 147 */     this.spiderLeg5.h += f9;
/* 148 */     this.spiderLeg6.h += -f9;
/* 149 */     this.spiderLeg7.h += f10;
/* 150 */     this.spiderLeg8.h += -f10;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel538.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */