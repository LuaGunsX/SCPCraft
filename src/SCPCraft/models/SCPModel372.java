/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import ke;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ public class SCPModel372
/*     */   extends axa
/*     */ {
/*     */   ayf Head;
/*     */   ayf neck;
/*     */   ayf body;
/*     */   ayf Leg8;
/*     */   ayf Leg6;
/*     */   ayf Leg4;
/*     */   ayf Leg2;
/*     */   ayf Leg7;
/*     */   ayf Leg5;
/*     */   ayf Leg3;
/*     */   ayf Leg1;
/*     */   ayf eye1;
/*     */   ayf tail;
/*     */   ayf eye2;
/*     */   
/*     */   public SCPModel372() {
/*  28 */     this.t = 64;
/*  29 */     this.u = 64;
/*     */     
/*  31 */     this.Head = new ayf(this, 16, 9);
/*  32 */     this.Head.a(-2.0F, -1.0F, -8.0F, 4, 2, 5);
/*  33 */     this.Head.a(0.0F, 21.0F, -12.0F);
/*  34 */     this.Head.b(64, 64);
/*  35 */     this.Head.i = true;
/*  36 */     setRotation(this.Head, 0.0F, 0.0F, 0.0F);
/*  37 */     this.neck = new ayf(this, 1, 9);
/*  38 */     this.neck.a(-2.0F, -3.0F, -3.0F, 4, 4, 3);
/*  39 */     this.neck.a(0.0F, 21.0F, -12.0F);
/*  40 */     this.neck.b(64, 64);
/*  41 */     this.neck.i = true;
/*  42 */     setRotation(this.neck, 0.0F, 0.0F, 0.0F);
/*  43 */     this.body = new ayf(this, 1, 24);
/*  44 */     this.body.a(0.0F, 0.0F, 0.0F, 2, 2, 18);
/*  45 */     this.body.a(-1.0F, 20.0F, -12.0F);
/*  46 */     this.body.b(64, 64);
/*  47 */     this.body.i = true;
/*  48 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  49 */     this.Leg8 = new ayf(this, 18, 0);
/*  50 */     this.Leg8.a(-1.0F, -1.0F, -1.0F, 16, 1, 1);
/*  51 */     this.Leg8.a(2.0F, 21.0F, -7.0F);
/*  52 */     this.Leg8.b(64, 64);
/*  53 */     this.Leg8.i = true;
/*  54 */     setRotation(this.Leg8, 0.0F, 0.5759587F, 0.1919862F);
/*  55 */     this.Leg6 = new ayf(this, 18, 0);
/*  56 */     this.Leg6.a(-1.0F, -1.0F, -1.0F, 16, 1, 1);
/*  57 */     this.Leg6.a(2.0F, 21.0F, -3.0F);
/*  58 */     this.Leg6.b(64, 64);
/*  59 */     this.Leg6.i = true;
/*  60 */     setRotation(this.Leg6, 0.0F, 0.2792527F, 0.1919862F);
/*  61 */     this.Leg4 = new ayf(this, 18, 0);
/*  62 */     this.Leg4.a(-1.0F, -1.0F, -1.0F, 16, 1, 1);
/*  63 */     this.Leg4.a(1.5F, 21.0F, -1.0F);
/*  64 */     this.Leg4.b(64, 64);
/*  65 */     this.Leg4.i = true;
/*  66 */     setRotation(this.Leg4, 0.0F, -0.2792527F, 0.1919862F);
/*  67 */     this.Leg2 = new ayf(this, 18, 0);
/*  68 */     this.Leg2.a(-1.0F, -1.0F, -1.0F, 16, 1, 1);
/*  69 */     this.Leg2.a(1.0F, 21.0F, 2.0F);
/*  70 */     this.Leg2.b(64, 64);
/*  71 */     this.Leg2.i = true;
/*  72 */     setRotation(this.Leg2, 0.0F, -0.5759587F, 0.1919862F);
/*  73 */     this.Leg7 = new ayf(this, 18, 0);
/*  74 */     this.Leg7.a(-15.0F, -1.0F, -1.0F, 16, 1, 1);
/*  75 */     this.Leg7.a(-2.0F, 21.0F, -7.0F);
/*  76 */     this.Leg7.b(64, 64);
/*  77 */     this.Leg7.i = true;
/*  78 */     setRotation(this.Leg7, 0.0F, -0.5759587F, -0.1919862F);
/*  79 */     this.Leg5 = new ayf(this, 18, 0);
/*  80 */     this.Leg5.a(-15.0F, -1.0F, -1.0F, 16, 1, 1);
/*  81 */     this.Leg5.a(-2.0F, 21.0F, -3.0F);
/*  82 */     this.Leg5.b(64, 64);
/*  83 */     this.Leg5.i = true;
/*  84 */     setRotation(this.Leg5, 0.0F, -0.2792527F, -0.1919862F);
/*  85 */     this.Leg3 = new ayf(this, 18, 0);
/*  86 */     this.Leg3.a(-15.0F, -1.0F, -1.0F, 16, 1, 1);
/*  87 */     this.Leg3.a(-1.5F, 21.0F, -1.0F);
/*  88 */     this.Leg3.b(64, 64);
/*  89 */     this.Leg3.i = true;
/*  90 */     setRotation(this.Leg3, 0.0F, 0.2792527F, -0.1919862F);
/*  91 */     this.Leg1 = new ayf(this, 18, 0);
/*  92 */     this.Leg1.a(-15.0F, -1.0F, -1.0F, 16, 1, 1);
/*  93 */     this.Leg1.a(-1.0F, 21.0F, 2.0F);
/*  94 */     this.Leg1.b(64, 64);
/*  95 */     this.Leg1.i = true;
/*  96 */     setRotation(this.Leg1, 0.0F, 0.5759587F, -0.1919862F);
/*  97 */     this.eye1 = new ayf(this, 1, 17);
/*  98 */     this.eye1.a(-3.5F, -4.0F, -4.0F, 3, 3, 3);
/*  99 */     this.eye1.a(0.0F, 21.0F, -12.0F);
/* 100 */     this.eye1.b(64, 64);
/* 101 */     this.eye1.i = true;
/* 102 */     setRotation(this.eye1, 0.0F, 0.0F, 0.0F);
/* 103 */     this.tail = new ayf(this, 1, 45);
/* 104 */     this.tail.a(0.0F, 0.0F, 0.0F, 2, 2, 16);
/* 105 */     this.tail.a(-1.0F, 20.0F, 5.0F);
/* 106 */     this.tail.b(64, 64);
/* 107 */     this.tail.i = true;
/* 108 */     setRotation(this.tail, 0.3839724F, 0.0F, 0.0F);
/* 109 */     this.eye2 = new ayf(this, 14, 17);
/* 110 */     this.eye2.a(0.5F, -4.0F, -4.0F, 3, 3, 3);
/* 111 */     this.eye2.a(0.0F, 21.0F, -12.0F);
/* 112 */     this.eye2.b(64, 64);
/* 113 */     this.eye2.i = true;
/* 114 */     setRotation(this.eye2, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 119 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 120 */     setRotationAngles(f, f1, f2, f3, f4, f5);
/* 121 */     this.Head.a(f5);
/* 122 */     this.neck.a(f5);
/* 123 */     this.body.a(f5);
/* 124 */     this.Leg8.a(f5);
/* 125 */     this.Leg6.a(f5);
/* 126 */     this.Leg4.a(f5);
/* 127 */     this.Leg2.a(f5);
/* 128 */     this.Leg7.a(f5);
/* 129 */     this.Leg5.a(f5);
/* 130 */     this.Leg3.a(f5);
/* 131 */     this.Leg1.a(f5);
/* 132 */     this.eye1.a(f5);
/* 133 */     this.tail.a(f5);
/* 134 */     this.eye2.a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ayf model, float x, float y, float z) {
/* 139 */     model.f = x;
/* 140 */     model.g = y;
/* 141 */     model.h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6) {
/* 146 */     this.Head.g = par4 / 57.295776F;
/* 147 */     this.Head.f = par5 / 57.295776F;
/* 148 */     this.eye2.g = par4 / 57.295776F;
/* 149 */     this.eye2.f = par5 / 57.295776F;
/* 150 */     this.eye1.g = par4 / 57.295776F;
/* 151 */     this.eye1.f = par5 / 57.295776F;
/* 152 */     this.neck.g = par4 / 57.295776F;
/* 153 */     this.neck.f = par5 / 57.295776F;
/* 154 */     float f = 0.7853982F;
/* 155 */     this.Leg1.h = -f;
/* 156 */     this.Leg2.h = f;
/* 157 */     this.Leg3.h = -f * 0.74F;
/* 158 */     this.Leg4.h = f * 0.74F;
/* 159 */     this.Leg5.h = -f * 0.74F;
/* 160 */     this.Leg6.h = f * 0.74F;
/* 161 */     this.Leg7.h = -f;
/* 162 */     this.Leg8.h = f;
/* 163 */     float f1 = -0.0F;
/* 164 */     float f2 = 0.3926991F;
/* 165 */     this.Leg1.g = f2 * 2.0F + f1;
/* 166 */     this.Leg2.g = -f2 * 2.0F - f1;
/* 167 */     this.Leg3.g = f2 * 1.0F + f1;
/* 168 */     this.Leg4.g = -f2 * 1.0F - f1;
/* 169 */     this.Leg5.g = -f2 * 1.0F + f1;
/* 170 */     this.Leg6.g = f2 * 1.0F - f1;
/* 171 */     this.Leg7.g = -f2 * 2.0F + f1;
/* 172 */     this.Leg8.g = f2 * 2.0F - f1;
/* 173 */     float f3 = -(ke.b(par1 * 0.6662F * 2.0F + 0.0F) * 0.4F) * par2;
/* 174 */     float f4 = -(ke.b(par1 * 0.6662F * 2.0F + 3.1415927F) * 0.4F) * par2;
/* 175 */     float f5 = -(ke.b(par1 * 0.6662F * 2.0F + 1.5707964F) * 0.4F) * par2;
/* 176 */     float f6 = -(ke.b(par1 * 0.6662F * 2.0F + 4.712389F) * 0.4F) * par2;
/* 177 */     float f7 = Math.abs(ke.a(par1 * 0.6662F + 0.0F) * 0.4F) * par2;
/* 178 */     float f8 = Math.abs(ke.a(par1 * 0.6662F + 3.1415927F) * 0.4F) * par2;
/* 179 */     float f9 = Math.abs(ke.a(par1 * 0.6662F + 1.5707964F) * 0.4F) * par2;
/* 180 */     float f10 = Math.abs(ke.a(par1 * 0.6662F + 4.712389F) * 0.4F) * par2;
/* 181 */     this.Leg1.g += f3;
/* 182 */     this.Leg2.g += -f3;
/* 183 */     this.Leg3.g += f4;
/* 184 */     this.Leg4.g += -f4;
/* 185 */     this.Leg5.g += f5;
/* 186 */     this.Leg6.g += -f5;
/* 187 */     this.Leg7.g += f6;
/* 188 */     this.Leg8.g += -f6;
/* 189 */     this.Leg1.h += f7;
/* 190 */     this.Leg2.h += -f7;
/* 191 */     this.Leg3.h += f8;
/* 192 */     this.Leg4.h += -f8;
/* 193 */     this.Leg5.h += f9;
/* 194 */     this.Leg6.h += -f9;
/* 195 */     this.Leg7.h += f10;
/* 196 */     this.Leg8.h += -f10;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel372.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */