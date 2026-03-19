/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import ke;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ public class SCPModelClassDGuy
/*     */   extends axa
/*     */ {
/*     */   ayf head;
/*     */   ayf body;
/*     */   ayf rightarm;
/*     */   ayf leftarm;
/*     */   ayf rightleg;
/*     */   ayf leftleg;
/*     */   ayf righteye;
/*     */   ayf lefteye;
/*     */   ayf Gasmask;
/*     */   ayf BreathPipe;
/*     */   ayf GasThing;
/*     */   
/*     */   public SCPModelClassDGuy() {
/*  25 */     this.t = 64;
/*  26 */     this.u = 32;
/*     */     
/*  28 */     this.head = new ayf(this, 0, 0);
/*  29 */     this.head.a(-4.0F, -8.0F, -4.0F, 8, 8, 8);
/*  30 */     this.head.a(0.0F, 0.0F, 0.0F);
/*  31 */     this.head.b(64, 32);
/*  32 */     this.head.i = true;
/*  33 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  34 */     this.body = new ayf(this, 16, 16);
/*  35 */     this.body.a(-4.0F, 0.0F, -2.0F, 8, 12, 4);
/*  36 */     this.body.a(0.0F, 0.0F, 0.0F);
/*  37 */     this.body.b(64, 32);
/*  38 */     this.body.i = true;
/*  39 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  40 */     this.rightarm = new ayf(this, 40, 16);
/*  41 */     this.rightarm.a(-3.0F, -2.0F, -2.0F, 4, 12, 4);
/*  42 */     this.rightarm.a(-5.0F, 2.0F, 0.0F);
/*  43 */     this.rightarm.b(64, 32);
/*  44 */     this.rightarm.i = true;
/*  45 */     setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
/*  46 */     this.leftarm = new ayf(this, 40, 16);
/*  47 */     this.leftarm.a(-1.0F, -2.0F, -2.0F, 4, 12, 4);
/*  48 */     this.leftarm.a(5.0F, 2.0F, 0.0F);
/*  49 */     this.leftarm.b(64, 32);
/*  50 */     this.leftarm.i = true;
/*  51 */     setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
/*  52 */     this.rightleg = new ayf(this, 0, 16);
/*  53 */     this.rightleg.a(-2.0F, 0.0F, -2.0F, 4, 12, 4);
/*  54 */     this.rightleg.a(-2.0F, 12.0F, 0.0F);
/*  55 */     this.rightleg.b(64, 32);
/*  56 */     this.rightleg.i = true;
/*  57 */     setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
/*  58 */     this.leftleg = new ayf(this, 0, 16);
/*  59 */     this.leftleg.a(-2.0F, 0.0F, -2.0F, 4, 12, 4);
/*  60 */     this.leftleg.a(2.0F, 12.0F, 0.0F);
/*  61 */     this.leftleg.b(64, 32);
/*  62 */     this.leftleg.i = true;
/*  63 */     setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
/*  64 */     this.righteye = new ayf(this, 40, 1);
/*  65 */     this.righteye.a(1.0F, -7.0F, -5.0F, 2, 2, 1);
/*  66 */     this.righteye.a(0.0F, 0.0F, 0.0F);
/*  67 */     this.righteye.b(64, 32);
/*  68 */     this.righteye.i = true;
/*  69 */     setRotation(this.righteye, 0.0F, 0.0F, 0.0F);
/*  70 */     this.lefteye = new ayf(this, 33, 1);
/*  71 */     this.lefteye.a(-3.0F, -7.0F, -5.0F, 2, 2, 1);
/*  72 */     this.lefteye.a(0.0F, 0.0F, 0.0F);
/*  73 */     this.lefteye.b(64, 32);
/*  74 */     this.lefteye.i = true;
/*  75 */     setRotation(this.lefteye, 0.0F, 0.0F, 0.0F);
/*  76 */     this.Gasmask = new ayf(this, 33, 5);
/*  77 */     this.Gasmask.a(-2.0F, -3.0F, -6.0F, 3, 3, 2);
/*  78 */     this.Gasmask.a(0.0F, 0.0F, 0.0F);
/*  79 */     this.Gasmask.b(64, 32);
/*  80 */     this.Gasmask.i = true;
/*  81 */     setRotation(this.Gasmask, 0.0F, 0.0F, 0.0F);
/*  82 */     this.BreathPipe = new ayf(this, 44, 8);
/*  83 */     this.BreathPipe.a(1.0F, -2.0F, -6.0F, 2, 1, 1);
/*  84 */     this.BreathPipe.a(0.0F, 0.0F, 0.0F);
/*  85 */     this.BreathPipe.b(64, 32);
/*  86 */     this.BreathPipe.i = true;
/*  87 */     setRotation(this.BreathPipe, 0.0F, 0.0F, 0.0F);
/*  88 */     this.GasThing = new ayf(this, 51, 5);
/*  89 */     this.GasThing.a(3.0F, -3.0F, -7.0F, 2, 3, 3);
/*  90 */     this.GasThing.a(0.0F, 0.0F, 0.0F);
/*  91 */     this.GasThing.b(64, 32);
/*  92 */     this.GasThing.i = true;
/*  93 */     setRotation(this.GasThing, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*  98 */     super.a(entity, f, f1, f2, f3, f4, f5);
/*  99 */     a(f, f1, f2, f3, f4, f5, entity);
/* 100 */     this.head.a(f5);
/* 101 */     this.body.a(f5);
/* 102 */     this.rightarm.a(f5);
/* 103 */     this.leftarm.a(f5);
/* 104 */     this.rightleg.a(f5);
/* 105 */     this.leftleg.a(f5);
/* 106 */     this.righteye.a(f5);
/* 107 */     this.lefteye.a(f5);
/* 108 */     this.Gasmask.a(f5);
/* 109 */     this.BreathPipe.a(f5);
/* 110 */     this.GasThing.a(f5);
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
/*     */   public void a(float f, float f1, float f2, float f3, float f4, float f5, lq entity) {
/* 122 */     super.a(f, f1, f2, f3, f4, f5, entity);
/* 123 */     this.head.g = f3 / 57.295776F;
/* 124 */     this.head.f = f4 / 57.295776F;
/* 125 */     this.Gasmask.g = f3 / 57.295776F;
/* 126 */     this.Gasmask.f = f4 / 57.295776F;
/* 127 */     this.BreathPipe.g = f3 / 57.295776F;
/* 128 */     this.BreathPipe.f = f4 / 57.295776F;
/* 129 */     this.GasThing.g = f3 / 57.295776F;
/* 130 */     this.GasThing.f = f4 / 57.295776F;
/* 131 */     this.righteye.g = f3 / 57.295776F;
/* 132 */     this.righteye.f = f4 / 57.295776F;
/* 133 */     this.lefteye.g = f3 / 57.295776F;
/* 134 */     this.lefteye.f = f4 / 57.295776F;
/* 135 */     this.rightleg.f = ke.b(f * 0.6662F) * 1.4F * f1;
/* 136 */     this.leftleg.f = ke.b(f * 0.6662F + 3.1415927F) * 1.4F * f1;
/* 137 */     this.rightleg.g = 0.0F;
/* 138 */     this.leftleg.g = 0.0F;
/* 139 */     this.rightarm.f = ke.b(f * 0.6662F + 3.1415927F) * 2.0F * f1 * 0.5F;
/* 140 */     this.leftarm.f = ke.b(f * 0.6662F) * 2.0F * f1 * 0.5F;
/* 141 */     this.rightarm.h = 0.0F;
/* 142 */     this.leftarm.h = 0.0F;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModelClassDGuy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */