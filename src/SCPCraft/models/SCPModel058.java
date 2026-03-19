/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import ke;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ public class SCPModel058
/*     */   extends axa
/*     */ {
/*     */   ayf Body;
/*     */   ayf RearEnd;
/*     */   ayf Tentacle2;
/*     */   ayf Leg6;
/*     */   ayf Leg4;
/*     */   ayf Tentacle1;
/*     */   ayf Leg5;
/*     */   ayf Leg3;
/*     */   ayf Claw2;
/*     */   ayf Claw1;
/*     */   ayf tent1;
/*     */   ayf tent2;
/*     */   ayf RearerEnd;
/*     */   ayf Sting;
/*     */   ayf Stingend;
/*     */   ayf Stingendthing;
/*     */   
/*     */   public SCPModel058() {
/*  30 */     this.t = 64;
/*  31 */     this.u = 32;
/*     */     
/*  33 */     this.Body = new ayf(this, 0, 0);
/*  34 */     this.Body.a(-3.0F, -3.0F, -3.0F, 6, 6, 6);
/*  35 */     this.Body.a(0.0F, 20.0F, 0.0F);
/*  36 */     this.Body.b(64, 32);
/*  37 */     this.Body.i = true;
/*  38 */     setRotation(this.Body, 0.0F, 0.0F, 0.0F);
/*  39 */     this.RearEnd = new ayf(this, 0, 12);
/*  40 */     this.RearEnd.a(-4.0F, -6.0F, 0.0F, 8, 8, 6);
/*  41 */     this.RearEnd.a(0.0F, 20.0F, 0.0F);
/*  42 */     this.RearEnd.b(64, 32);
/*  43 */     this.RearEnd.i = true;
/*  44 */     setRotation(this.RearEnd, 0.0F, 0.0F, 0.0F);
/*  45 */     this.Tentacle2 = new ayf(this, 43, 0);
/*  46 */     this.Tentacle2.a(-1.0F, -1.0F, -1.0F, 9, 2, 1);
/*  47 */     this.Tentacle2.a(4.0F, 20.0F, -3.0F);
/*  48 */     this.Tentacle2.b(64, 32);
/*  49 */     this.Tentacle2.i = true;
/*  50 */     setRotation(this.Tentacle2, 0.0F, 0.5759587F, 0.1396263F);
/*  51 */     this.Leg6 = new ayf(this, 19, 0);
/*  52 */     this.Leg6.a(-1.0F, -1.0F, -1.0F, 10, 1, 1);
/*  53 */     this.Leg6.a(4.0F, 20.0F, 1.0F);
/*  54 */     this.Leg6.b(64, 32);
/*  55 */     this.Leg6.i = true;
/*  56 */     setRotation(this.Leg6, 0.0F, 0.2792527F, 0.2617994F);
/*  57 */     this.Leg4 = new ayf(this, 19, 0);
/*  58 */     this.Leg4.a(-1.0F, -1.0F, -1.0F, 8, 1, 1);
/*  59 */     this.Leg4.a(4.0F, 20.0F, 4.0F);
/*  60 */     this.Leg4.b(64, 32);
/*  61 */     this.Leg4.i = true;
/*  62 */     setRotation(this.Leg4, 0.0F, -0.2792527F, 0.2617994F);
/*  63 */     this.Tentacle1 = new ayf(this, 43, 0);
/*  64 */     this.Tentacle1.a(-8.0F, -1.0F, -1.0F, 9, 2, 1);
/*  65 */     this.Tentacle1.a(-4.0F, 20.0F, -3.0F);
/*  66 */     this.Tentacle1.b(64, 32);
/*  67 */     this.Tentacle1.i = true;
/*  68 */     setRotation(this.Tentacle1, 0.0F, -0.5759587F, -0.1396263F);
/*  69 */     this.Leg5 = new ayf(this, 19, 0);
/*  70 */     this.Leg5.a(-10.0F, -1.0F, -1.0F, 10, 1, 1);
/*  71 */     this.Leg5.a(-3.0F, 20.0F, 2.0F);
/*  72 */     this.Leg5.b(64, 32);
/*  73 */     this.Leg5.i = true;
/*  74 */     setRotation(this.Leg5, 0.0F, -0.2792527F, -0.2617994F);
/*  75 */     this.Leg3 = new ayf(this, 19, 0);
/*  76 */     this.Leg3.a(-8.0F, -1.0F, 0.0F, 8, 1, 1);
/*  77 */     this.Leg3.a(-4.0F, 20.0F, 4.0F);
/*  78 */     this.Leg3.b(64, 32);
/*  79 */     this.Leg3.i = true;
/*  80 */     setRotation(this.Leg3, 0.0F, 0.2792527F, -0.2617994F);
/*  81 */     this.Claw2 = new ayf(this, 51, 4);
/*  82 */     this.Claw2.a(1.0F, 0.0F, 7.0F, 5, 2, 1);
/*  83 */     this.Claw2.a(4.0F, 20.0F, -3.0F);
/*  84 */     this.Claw2.b(64, 32);
/*  85 */     this.Claw2.i = true;
/*  86 */     setRotation(this.Claw2, 0.0F, 2.094395F, 0.0349066F);
/*  87 */     this.Claw1 = new ayf(this, 51, 4);
/*  88 */     this.Claw1.a(-6.0F, 0.0F, 7.0F, 5, 2, 1);
/*  89 */     this.Claw1.a(-4.0F, 20.0F, -3.0F);
/*  90 */     this.Claw1.b(64, 32);
/*  91 */     this.Claw1.i = true;
/*  92 */     setRotation(this.Claw1, 0.0F, -2.094395F, -0.0349066F);
/*  93 */     this.tent1 = new ayf(this, 25, 7);
/*  94 */     this.tent1.a(-2.0F, -1.0F, -6.0F, 1, 1, 3);
/*  95 */     this.tent1.a(0.0F, 20.0F, 0.0F);
/*  96 */     this.tent1.b(64, 32);
/*  97 */     this.tent1.i = true;
/*  98 */     setRotation(this.tent1, 0.0872665F, 0.1047198F, 0.0F);
/*  99 */     this.tent2 = new ayf(this, 25, 7);
/* 100 */     this.tent2.a(1.0F, -1.0F, -6.0F, 1, 1, 3);
/* 101 */     this.tent2.a(0.0F, 20.0F, 0.0F);
/* 102 */     this.tent2.b(64, 32);
/* 103 */     this.tent2.i = true;
/* 104 */     setRotation(this.tent2, 0.0872665F, -0.1047198F, 0.0F);
/* 105 */     this.RearerEnd = new ayf(this, 29, 18);
/* 106 */     this.RearerEnd.a(-4.0F, -5.0F, 6.0F, 8, 7, 1);
/* 107 */     this.RearerEnd.a(0.0F, 20.0F, 0.0F);
/* 108 */     this.RearerEnd.b(64, 32);
/* 109 */     this.RearerEnd.i = true;
/* 110 */     setRotation(this.RearerEnd, 0.0F, 0.0F, 0.0F);
/* 111 */     this.Sting = new ayf(this, 57, 21);
/* 112 */     this.Sting.a(-1.0F, -14.0F, 4.0F, 2, 9, 1);
/* 113 */     this.Sting.a(0.0F, 20.0F, 0.0F);
/* 114 */     this.Sting.b(64, 32);
/* 115 */     this.Sting.i = true;
/* 116 */     setRotation(this.Sting, -0.2443461F, 0.0F, 0.0F);
/* 117 */     this.Stingend = new ayf(this, 51, 15);
/* 118 */     this.Stingend.a(-2.0F, -15.0F, 2.0F, 4, 3, 2);
/* 119 */     this.Stingend.a(0.0F, 20.0F, 0.0F);
/* 120 */     this.Stingend.b(64, 32);
/* 121 */     this.Stingend.i = true;
/* 122 */     setRotation(this.Stingend, -0.2443461F, 0.0F, 0.0F);
/* 123 */     this.Stingendthing = new ayf(this, 55, 11);
/* 124 */     this.Stingendthing.a(-1.0F, -14.0F, 0.0F, 2, 1, 2);
/* 125 */     this.Stingendthing.a(0.0F, 20.0F, 0.0F);
/* 126 */     this.Stingendthing.b(64, 32);
/* 127 */     this.Stingendthing.i = true;
/* 128 */     setRotation(this.Stingendthing, -0.2443461F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 133 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 134 */     setRotationAngles(f, f1, f2, f3, f4, f5);
/* 135 */     this.Body.a(f5);
/* 136 */     this.RearEnd.a(f5);
/* 137 */     this.Tentacle2.a(f5);
/* 138 */     this.Leg6.a(f5);
/* 139 */     this.Leg4.a(f5);
/* 140 */     this.Tentacle1.a(f5);
/* 141 */     this.Leg5.a(f5);
/* 142 */     this.Leg3.a(f5);
/* 143 */     this.Claw2.a(f5);
/* 144 */     this.Claw1.a(f5);
/* 145 */     this.tent1.a(f5);
/* 146 */     this.tent2.a(f5);
/* 147 */     this.RearerEnd.a(f5);
/* 148 */     this.Sting.a(f5);
/* 149 */     this.Stingend.a(f5);
/* 150 */     this.Stingendthing.a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ayf model, float x, float y, float z) {
/* 155 */     model.f = x;
/* 156 */     model.g = y;
/* 157 */     model.h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6) {
/* 162 */     float var7 = 0.7853982F;
/* 163 */     this.Leg3.h = -var7 * 0.74F;
/* 164 */     this.Leg4.h = var7 * 0.74F;
/* 165 */     this.Leg5.h = -var7 * 0.74F;
/* 166 */     this.Leg6.h = var7 * 0.74F;
/* 167 */     float var8 = -0.0F;
/* 168 */     float var9 = 0.3926991F;
/* 169 */     this.Leg3.g = var9 * 1.0F + var8;
/* 170 */     this.Leg4.g = -var9 * 1.0F - var8;
/* 171 */     this.Leg5.g = -var9 * 1.0F + var8;
/* 172 */     this.Leg6.g = var9 * 1.0F - var8;
/* 173 */     float var10 = -(ke.b(par1 * 0.6662F * 2.0F + 0.0F) * 0.4F) * par2;
/* 174 */     float var11 = -(ke.b(par1 * 0.6662F * 2.0F + 3.1415927F) * 0.4F) * par2;
/* 175 */     float var12 = -(ke.b(par1 * 0.6662F * 2.0F + 1.5707964F) * 0.4F) * par2;
/* 176 */     float var13 = -(ke.b(par1 * 0.6662F * 2.0F + 4.712389F) * 0.4F) * par2;
/* 177 */     float var14 = Math.abs(ke.a(par1 * 0.6662F + 0.0F) * 0.4F) * par2;
/* 178 */     float var15 = Math.abs(ke.a(par1 * 0.6662F + 3.1415927F) * 0.4F) * par2;
/* 179 */     float var16 = Math.abs(ke.a(par1 * 0.6662F + 1.5707964F) * 0.4F) * par2;
/* 180 */     float var17 = Math.abs(ke.a(par1 * 0.6662F + 4.712389F) * 0.4F) * par2;
/* 181 */     this.Leg3.g += var11;
/* 182 */     this.Leg4.g += -var11;
/* 183 */     this.Leg5.g += var12;
/* 184 */     this.Leg6.g += -var12;
/* 185 */     this.Leg3.h += var15;
/* 186 */     this.Leg4.h += -var15;
/* 187 */     this.Leg5.h += var16;
/* 188 */     this.Leg6.h += -var16;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel058.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */