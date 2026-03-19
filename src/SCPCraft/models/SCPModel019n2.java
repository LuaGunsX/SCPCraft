/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import ke;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ public class SCPModel019n2
/*     */   extends axa
/*     */ {
/*     */   ayf Head;
/*     */   ayf Neck;
/*     */   ayf Breasts;
/*     */   ayf Belleh;
/*     */   ayf Leg1;
/*     */   ayf foot1;
/*     */   ayf Leg2;
/*     */   ayf foot2;
/*     */   ayf Backleg1;
/*     */   ayf backfoot1;
/*     */   ayf Backleg2;
/*     */   ayf backfoot2;
/*     */   
/*     */   public SCPModel019n2() {
/*  26 */     this.t = 32;
/*  27 */     this.u = 32;
/*     */     
/*  29 */     this.Head = new ayf(this, 9, 4);
/*  30 */     this.Head.a(-2.0F, -1.0F, -3.0F, 4, 3, 3);
/*  31 */     this.Head.a(0.0F, 20.0F, -4.0F);
/*  32 */     this.Head.b(32, 32);
/*  33 */     this.Head.i = true;
/*  34 */     setRotation(this.Head, 0.0F, 0.0F, 0.0F);
/*  35 */     this.Neck = new ayf(this, 13, 11);
/*  36 */     this.Neck.a(-1.0F, 0.0F, 0.0F, 2, 1, 1);
/*  37 */     this.Neck.a(0.0F, 20.0F, -4.0F);
/*  38 */     this.Neck.b(32, 32);
/*  39 */     this.Neck.i = true;
/*  40 */     setRotation(this.Neck, 0.0F, 0.0F, 0.0F);
/*  41 */     this.Breasts = new ayf(this, 10, 14);
/*  42 */     this.Breasts.a(-2.0F, 0.0F, -1.0F, 4, 1, 2);
/*  43 */     this.Breasts.a(0.0F, 20.0F, -2.0F);
/*  44 */     this.Breasts.b(32, 32);
/*  45 */     this.Breasts.i = true;
/*  46 */     setRotation(this.Breasts, -0.2617994F, 0.0F, 0.0F);
/*  47 */     this.Belleh = new ayf(this, 12, 18);
/*  48 */     this.Belleh.a(-1.0F, 0.0F, 1.0F, 2, 1, 2);
/*  49 */     this.Belleh.a(0.0F, 20.0F, -2.0F);
/*  50 */     this.Belleh.b(32, 32);
/*  51 */     this.Belleh.i = true;
/*  52 */     setRotation(this.Belleh, -0.2617994F, 0.0F, 0.0F);
/*  53 */     this.Leg1 = new ayf(this, 5, 13);
/*  54 */     this.Leg1.a(0.0F, -1.0F, -1.0F, 1, 3, 1);
/*  55 */     this.Leg1.a(2.0F, 21.0F, -2.0F);
/*  56 */     this.Leg1.b(32, 32);
/*  57 */     this.Leg1.i = true;
/*  58 */     setRotation(this.Leg1, 0.0F, 0.0F, -0.6981317F);
/*  59 */     this.foot1 = new ayf(this, 1, 18);
/*  60 */     this.foot1.a(1.0F, 1.0F, -1.0F, 1, 2, 1);
/*  61 */     this.foot1.a(2.0F, 21.0F, -2.0F);
/*  62 */     this.foot1.b(32, 32);
/*  63 */     this.foot1.i = true;
/*  64 */     setRotation(this.foot1, 0.0F, 0.0F, 0.0F);
/*  65 */     this.Leg2 = new ayf(this, 23, 13);
/*  66 */     this.Leg2.a(-1.0F, -1.0F, -1.0F, 1, 3, 1);
/*  67 */     this.Leg2.a(-2.0F, 21.0F, -2.0F);
/*  68 */     this.Leg2.b(32, 32);
/*  69 */     this.Leg2.i = true;
/*  70 */     setRotation(this.Leg2, 0.0F, 0.0F, 0.6981317F);
/*  71 */     this.foot2 = new ayf(this, 27, 18);
/*  72 */     this.foot2.a(-2.0F, 1.0F, -1.0F, 1, 2, 1);
/*  73 */     this.foot2.a(-2.0F, 21.0F, -2.0F);
/*  74 */     this.foot2.b(32, 32);
/*  75 */     this.foot2.i = true;
/*  76 */     setRotation(this.foot2, 0.0F, 0.0F, 0.0F);
/*  77 */     this.Backleg1 = new ayf(this, 8, 22);
/*  78 */     this.Backleg1.a(0.0F, -0.5F, 0.0F, 1, 1, 3);
/*  79 */     this.Backleg1.a(1.0F, 21.0F, 0.0F);
/*  80 */     this.Backleg1.b(32, 32);
/*  81 */     this.Backleg1.i = true;
/*  82 */     setRotation(this.Backleg1, -0.2094395F, 0.0F, 0.0F);
/*  83 */     this.backfoot1 = new ayf(this, 8, 27);
/*  84 */     this.backfoot1.a(0.0F, 0.0F, 2.0F, 1, 2, 1);
/*  85 */     this.backfoot1.a(1.0F, 21.0F, 0.0F);
/*  86 */     this.backfoot1.b(32, 32);
/*  87 */     this.backfoot1.i = true;
/*  88 */     setRotation(this.backfoot1, -0.3665191F, 0.0F, 0.0F);
/*  89 */     this.Backleg2 = new ayf(this, 17, 22);
/*  90 */     this.Backleg2.a(-1.0F, -0.5F, 0.0F, 1, 1, 3);
/*  91 */     this.Backleg2.a(-1.0F, 21.0F, 0.0F);
/*  92 */     this.Backleg2.b(32, 32);
/*  93 */     this.Backleg2.i = true;
/*  94 */     setRotation(this.Backleg2, -0.2094395F, 0.0F, 0.0F);
/*  95 */     this.backfoot2 = new ayf(this, 21, 27);
/*  96 */     this.backfoot2.a(-1.0F, 0.0F, 2.0F, 1, 2, 1);
/*  97 */     this.backfoot2.a(-1.0F, 21.0F, 0.0F);
/*  98 */     this.backfoot2.b(32, 32);
/*  99 */     this.backfoot2.i = true;
/* 100 */     setRotation(this.backfoot2, -0.3665191F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 105 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 106 */     setRotationAngles(f, f1, f2, f3, f4, f5);
/* 107 */     this.Head.a(f5);
/* 108 */     this.Neck.a(f5);
/* 109 */     this.Breasts.a(f5);
/* 110 */     this.Belleh.a(f5);
/* 111 */     this.Leg1.a(f5);
/* 112 */     this.foot1.a(f5);
/* 113 */     this.Leg2.a(f5);
/* 114 */     this.foot2.a(f5);
/* 115 */     this.Backleg1.a(f5);
/* 116 */     this.backfoot1.a(f5);
/* 117 */     this.Backleg2.a(f5);
/* 118 */     this.backfoot2.a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ayf model, float x, float y, float z) {
/* 123 */     model.f = x;
/* 124 */     model.g = y;
/* 125 */     model.h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6) {
/* 130 */     this.Head.g = par4 / 57.295776F;
/* 131 */     this.Head.f = par5 / 57.295776F;
/* 132 */     this.Leg1.f = ke.b(par1 * 0.6662F) * 1.4F * par2;
/* 133 */     this.Leg2.f = ke.b(par1 * 0.6662F + 3.1415927F) * 1.4F * par2;
/* 134 */     this.Leg1.g = 0.0F;
/* 135 */     this.Leg2.g = 0.0F;
/* 136 */     this.foot1.f = ke.b(par1 * 0.6662F) * 1.4F * par2;
/* 137 */     this.foot2.f = ke.b(par1 * 0.6662F + 3.1415927F) * 1.4F * par2;
/* 138 */     this.foot1.g = 0.0F;
/* 139 */     this.foot2.g = 0.0F;
/* 140 */     this.Backleg1.f = ke.b(par1 * 0.6662F) * 1.4F * par2;
/* 141 */     this.Backleg2.f = ke.b(par1 * 0.6662F + 3.1415927F) * 1.4F * par2;
/* 142 */     this.Backleg1.g = -0.2F;
/* 143 */     this.Backleg2.g = -0.2F;
/* 144 */     this.backfoot1.f = ke.b(par1 * 0.6662F) * 1.4F * par2;
/* 145 */     this.backfoot2.f = ke.b(par1 * 0.6662F + 3.1415927F) * 1.4F * par2;
/* 146 */     this.backfoot1.g = -0.2F;
/* 147 */     this.backfoot2.g = -0.2F;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel019n2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */