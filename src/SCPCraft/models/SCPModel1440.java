/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import ke;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ public class SCPModel1440
/*     */   extends axa
/*     */ {
/*     */   ayf head;
/*     */   ayf body;
/*     */   ayf rightarm;
/*     */   ayf leftarm;
/*     */   ayf rightleg;
/*     */   ayf leftleg;
/*     */   ayf epicbeard;
/*     */   ayf hat;
/*     */   ayf sideburn1;
/*     */   ayf sideburn2;
/*     */   
/*     */   public SCPModel1440() {
/*  24 */     this.t = 64;
/*  25 */     this.u = 64;
/*     */     
/*  27 */     this.head = new ayf(this, 0, 48);
/*  28 */     this.head.a(-4.0F, -7.0F, -5.0F, 8, 7, 8);
/*  29 */     this.head.a(0.0F, 0.0F, 0.0F);
/*  30 */     this.head.b(64, 64);
/*  31 */     this.head.i = true;
/*  32 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  33 */     this.body = new ayf(this, 37, 46);
/*  34 */     this.body.a(-4.0F, 0.0F, -3.0F, 8, 12, 5);
/*  35 */     this.body.a(0.0F, 0.0F, 0.0F);
/*  36 */     this.body.b(64, 64);
/*  37 */     this.body.i = true;
/*  38 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  39 */     this.rightarm = new ayf(this, 40, 23);
/*  40 */     this.rightarm.a(-3.0F, -2.0F, -2.0F, 4, 12, 4);
/*  41 */     this.rightarm.a(-5.0F, 2.0F, 0.0F);
/*  42 */     this.rightarm.b(64, 64);
/*  43 */     this.rightarm.i = true;
/*  44 */     setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
/*  45 */     this.leftarm = new ayf(this, 40, 23);
/*  46 */     this.leftarm.a(-1.0F, -2.0F, -2.0F, 4, 12, 4);
/*  47 */     this.leftarm.a(5.0F, 2.0F, 0.0F);
/*  48 */     this.leftarm.b(64, 64);
/*  49 */     this.leftarm.i = true;
/*  50 */     setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
/*  51 */     this.rightleg = new ayf(this, 0, 30);
/*  52 */     this.rightleg.a(-2.0F, 0.0F, -4.0F, 4, 12, 5);
/*  53 */     this.rightleg.a(-2.0F, 12.0F, 1.0F);
/*  54 */     this.rightleg.b(64, 64);
/*  55 */     this.rightleg.i = true;
/*  56 */     setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
/*  57 */     this.leftleg = new ayf(this, 0, 30);
/*  58 */     this.leftleg.a(-2.0F, 0.0F, -3.0F, 4, 12, 5);
/*  59 */     this.leftleg.a(2.0F, 12.0F, 0.0F);
/*  60 */     this.leftleg.b(64, 64);
/*  61 */     this.leftleg.i = true;
/*  62 */     setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
/*  63 */     this.epicbeard = new ayf(this, 1, 23);
/*  64 */     this.epicbeard.a(-5.0F, -1.0F, -5.0F, 10, 4, 2);
/*  65 */     this.epicbeard.a(0.0F, 0.0F, 0.0F);
/*  66 */     this.epicbeard.b(64, 64);
/*  67 */     this.epicbeard.i = true;
/*  68 */     setRotation(this.epicbeard, 0.0F, 0.0F, 0.0F);
/*  69 */     this.hat = new ayf(this, 12, 0);
/*  70 */     this.hat.a(-5.0F, -14.0F, -6.0F, 10, 7, 10);
/*  71 */     this.hat.a(0.0F, 0.0F, 0.0F);
/*  72 */     this.hat.b(64, 64);
/*  73 */     this.hat.i = true;
/*  74 */     setRotation(this.hat, 0.0F, 0.0F, 0.0F);
/*  75 */     this.sideburn1 = new ayf(this, 0, 0);
/*  76 */     this.sideburn1.a(-5.0F, -7.0F, -5.0F, 1, 6, 2);
/*  77 */     this.sideburn1.a(0.0F, 0.0F, 0.0F);
/*  78 */     this.sideburn1.b(64, 64);
/*  79 */     this.sideburn1.i = true;
/*  80 */     setRotation(this.sideburn1, 0.0F, 0.0F, 0.0F);
/*  81 */     this.sideburn2 = new ayf(this, 0, 0);
/*  82 */     this.sideburn2.a(4.0F, -7.0F, -5.0F, 1, 6, 2);
/*  83 */     this.sideburn2.a(0.0F, 0.0F, 0.0F);
/*  84 */     this.sideburn2.b(64, 64);
/*  85 */     this.sideburn2.i = true;
/*  86 */     setRotation(this.sideburn2, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*  91 */     super.a(entity, f, f1, f2, f3, f4, f5);
/*  92 */     a(f, f1, f2, f3, f4, f5, entity);
/*  93 */     this.head.a(f5);
/*  94 */     this.body.a(f5);
/*  95 */     this.rightarm.a(f5);
/*  96 */     this.leftarm.a(f5);
/*  97 */     this.rightleg.a(f5);
/*  98 */     this.leftleg.a(f5);
/*  99 */     this.epicbeard.a(f5);
/* 100 */     this.hat.a(f5);
/* 101 */     this.sideburn1.a(f5);
/* 102 */     this.sideburn2.a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ayf model, float x, float y, float z) {
/* 107 */     model.f = x;
/* 108 */     model.g = y;
/* 109 */     model.h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float f, float f1, float f2, float f3, float f4, float f5, lq entity) {
/* 114 */     super.a(f, f1, f2, f3, f4, f5, entity);
/* 115 */     this.head.g = f3 / 57.295776F;
/* 116 */     this.head.f = f4 / 57.295776F;
/* 117 */     this.sideburn1.g = f3 / 57.295776F;
/* 118 */     this.sideburn1.f = f4 / 57.295776F;
/* 119 */     this.sideburn2.g = f3 / 57.295776F;
/* 120 */     this.sideburn2.f = f4 / 57.295776F;
/* 121 */     this.epicbeard.g = f3 / 57.295776F;
/* 122 */     this.epicbeard.f = f4 / 57.295776F;
/* 123 */     this.hat.g = f3 / 57.295776F;
/* 124 */     this.hat.f = f4 / 57.295776F;
/* 125 */     this.rightleg.f = ke.b(f * 0.6662F) * 1.4F * f1;
/* 126 */     this.leftleg.f = ke.b(f * 0.6662F + 3.1415927F) * 1.4F * f1;
/* 127 */     this.rightleg.g = 0.0F;
/* 128 */     this.leftleg.g = 0.0F;
/* 129 */     this.rightarm.f = ke.b(f * 0.6662F + 3.1415927F) * 2.0F * f1 * 0.5F;
/* 130 */     this.leftarm.f = ke.b(f * 0.6662F) * 2.0F * f1 * 0.5F;
/* 131 */     this.rightarm.h = 0.0F;
/* 132 */     this.leftarm.h = 0.0F;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel1440.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */