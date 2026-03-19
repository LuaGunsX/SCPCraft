/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import ke;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPModel594Naked
/*     */   extends axa
/*     */ {
/*     */   private float field_78152_i;
/*     */   ayf head;
/*     */   ayf body;
/*     */   ayf leg1;
/*     */   ayf leg2;
/*     */   ayf leg3;
/*     */   ayf leg4;
/*     */   ayf horn1;
/*     */   ayf horn2;
/*     */   ayf horn3;
/*     */   ayf horn4;
/*     */   ayf horn5;
/*     */   ayf horn6;
/*     */   
/*     */   public SCPModel594Naked() {
/*  28 */     this.t = 64;
/*  29 */     this.u = 64;
/*     */     
/*  31 */     this.head = new ayf(this, 18, 13);
/*  32 */     this.head.a(-4.0F, -4.0F, -6.0F, 8, 8, 6);
/*  33 */     this.head.a(0.0F, 4.0F, -9.0F);
/*  34 */     this.head.b(64, 64);
/*  35 */     this.head.i = true;
/*  36 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  37 */     this.body = new ayf(this, 6, 33);
/*  38 */     this.body.a(-6.0F, -10.0F, -7.0F, 12, 16, 11);
/*  39 */     this.body.a(0.0F, 7.0F, 1.0F);
/*  40 */     this.body.b(64, 64);
/*  41 */     this.body.i = true;
/*  42 */     setRotation(this.body, 1.570796F, 0.0F, 0.0F);
/*  43 */     this.leg1 = new ayf(this, 1, 16);
/*  44 */     this.leg1.a(-2.0F, 0.0F, -2.0F, 3, 10, 3);
/*  45 */     this.leg1.a(-4.0F, 14.0F, 7.0F);
/*  46 */     this.leg1.b(64, 64);
/*  47 */     this.leg1.i = true;
/*  48 */     setRotation(this.leg1, 0.0F, 0.0F, 0.0F);
/*  49 */     this.leg2 = new ayf(this, 1, 16);
/*  50 */     this.leg2.a(-1.0F, 0.0F, -2.0F, 3, 10, 3);
/*  51 */     this.leg2.a(4.0F, 14.0F, 7.0F);
/*  52 */     this.leg2.b(64, 64);
/*  53 */     this.leg2.i = true;
/*  54 */     setRotation(this.leg2, 0.0F, 0.0F, 0.0F);
/*  55 */     this.leg3 = new ayf(this, 1, 16);
/*  56 */     this.leg3.a(-2.0F, 0.0F, -2.0F, 3, 10, 3);
/*  57 */     this.leg3.a(-4.0F, 14.0F, -5.0F);
/*  58 */     this.leg3.b(64, 64);
/*  59 */     this.leg3.i = true;
/*  60 */     setRotation(this.leg3, 0.0F, 0.0F, 0.0F);
/*  61 */     this.leg4 = new ayf(this, 1, 16);
/*  62 */     this.leg4.a(-1.0F, 0.0F, -2.0F, 3, 10, 3);
/*  63 */     this.leg4.a(4.0F, 14.0F, -5.0F);
/*  64 */     this.leg4.b(64, 64);
/*  65 */     this.leg4.i = true;
/*  66 */     setRotation(this.leg4, 0.0F, 0.0F, 0.0F);
/*  67 */     this.horn1 = new ayf(this, 1, 1);
/*  68 */     this.horn1.a(-8.0F, -4.0F, -3.0F, 4, 2, 2);
/*  69 */     this.horn1.a(0.0F, 4.0F, -9.0F);
/*  70 */     this.horn1.b(64, 64);
/*  71 */     this.horn1.i = true;
/*  72 */     setRotation(this.horn1, 0.0F, 0.0F, 0.0F);
/*  73 */     this.horn2 = new ayf(this, 50, 1);
/*  74 */     this.horn2.a(4.0F, -4.0F, -3.0F, 4, 2, 2);
/*  75 */     this.horn2.a(0.0F, 4.0F, -9.0F);
/*  76 */     this.horn2.b(64, 64);
/*  77 */     this.horn2.i = true;
/*  78 */     setRotation(this.horn2, 0.0F, 0.0F, 0.0F);
/*  79 */     this.horn3 = new ayf(this, 1, 6);
/*  80 */     this.horn3.a(-8.0F, -2.0F, -3.0F, 2, 4, 2);
/*  81 */     this.horn3.a(0.0F, 4.0F, -9.0F);
/*  82 */     this.horn3.b(64, 64);
/*  83 */     this.horn3.i = true;
/*  84 */     setRotation(this.horn3, 0.0F, 0.0F, 0.0F);
/*  85 */     this.horn4 = new ayf(this, 54, 6);
/*  86 */     this.horn4.a(6.0F, -2.0F, -3.0F, 2, 4, 2);
/*  87 */     this.horn4.a(0.0F, 4.0F, -9.0F);
/*  88 */     this.horn4.b(64, 64);
/*  89 */     this.horn4.i = true;
/*  90 */     setRotation(this.horn4, 0.0F, 0.0F, 0.0F);
/*  91 */     this.horn5 = new ayf(this, 10, 9);
/*  92 */     this.horn5.a(-8.0F, 0.0F, -4.0F, 2, 2, 1);
/*  93 */     this.horn5.a(0.0F, 4.0F, -9.0F);
/*  94 */     this.horn5.b(64, 64);
/*  95 */     this.horn5.i = true;
/*  96 */     setRotation(this.horn5, 0.0F, 0.0F, 0.0F);
/*  97 */     this.horn6 = new ayf(this, 47, 9);
/*  98 */     this.horn6.a(6.0F, 0.0F, -4.0F, 2, 2, 1);
/*  99 */     this.horn6.a(0.0F, 4.0F, -9.0F);
/* 100 */     this.horn6.b(64, 64);
/* 101 */     this.horn6.i = true;
/* 102 */     setRotation(this.horn6, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 107 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 108 */     a(f, f1, f2, f3, f4, f5, entity);
/* 109 */     this.head.a(f5);
/* 110 */     this.body.a(f5);
/* 111 */     this.leg1.a(f5);
/* 112 */     this.leg2.a(f5);
/* 113 */     this.leg3.a(f5);
/* 114 */     this.leg4.a(f5);
/* 115 */     this.horn1.a(f5);
/* 116 */     this.horn2.a(f5);
/* 117 */     this.horn3.a(f5);
/* 118 */     this.horn4.a(f5);
/* 119 */     this.horn5.a(f5);
/* 120 */     this.horn6.a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ayf model, float x, float y, float z) {
/* 125 */     model.f = x;
/* 126 */     model.g = y;
/* 127 */     model.h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float par1, float par2, float par3, float par4, float par5, float par6, lq entity) {
/* 132 */     super.a(par1, par2, par3, par4, par5, par6, entity);
/* 133 */     this.head.f = this.field_78152_i;
/* 134 */     this.head.f = par5 / 57.295776F;
/* 135 */     this.head.g = par4 / 57.295776F;
/* 136 */     this.horn1.f = par5 / 57.295776F;
/* 137 */     this.horn1.g = par4 / 57.295776F;
/* 138 */     this.horn2.f = par5 / 57.295776F;
/* 139 */     this.horn2.g = par4 / 57.295776F;
/* 140 */     this.horn3.f = par5 / 57.295776F;
/* 141 */     this.horn3.g = par4 / 57.295776F;
/* 142 */     this.horn4.f = par5 / 57.295776F;
/* 143 */     this.horn4.g = par4 / 57.295776F;
/* 144 */     this.horn5.f = par5 / 57.295776F;
/* 145 */     this.horn5.g = par4 / 57.295776F;
/* 146 */     this.horn6.f = par5 / 57.295776F;
/* 147 */     this.horn6.g = par4 / 57.295776F;
/* 148 */     this.body.f = 1.5707964F;
/* 149 */     this.leg1.f = ke.b(par1 * 0.6662F) * 1.4F * par2;
/* 150 */     this.leg2.f = ke.b(par1 * 0.6662F + 3.1415927F) * 1.4F * par2;
/* 151 */     this.leg3.f = ke.b(par1 * 0.6662F + 3.1415927F) * 1.4F * par2;
/* 152 */     this.leg4.f = ke.b(par1 * 0.6662F) * 1.4F * par2;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel594Naked.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */