/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import ke;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ public class SCPModel1000
/*     */   extends axa
/*     */ {
/*     */   ayf head;
/*     */   ayf body;
/*     */   ayf rightarm;
/*     */   ayf leftarm;
/*     */   ayf rightleg;
/*     */   ayf leftleg;
/*     */   ayf jawup;
/*     */   ayf jawdown;
/*     */   ayf leftfoot;
/*     */   ayf rightfoot;
/*     */   public boolean isAttacking;
/*     */   
/*     */   public SCPModel1000() {
/*  25 */     this.t = 64;
/*  26 */     this.u = 64;
/*     */     
/*  28 */     this.head = new ayf(this, 1, 1);
/*  29 */     this.head.a(-4.0F, -8.0F, -4.0F, 8, 8, 7);
/*  30 */     this.head.a(0.0F, -2.0F, 0.0F);
/*  31 */     this.head.b(64, 64);
/*  32 */     this.head.i = true;
/*  33 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  34 */     this.body = new ayf(this, 1, 32);
/*  35 */     this.body.a(-5.0F, 0.0F, -2.0F, 10, 15, 4);
/*  36 */     this.body.a(0.0F, -2.0F, 0.0F);
/*  37 */     this.body.b(64, 64);
/*  38 */     this.body.i = true;
/*  39 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  40 */     this.rightarm = new ayf(this, 40, 16);
/*  41 */     this.rightarm.a(-3.0F, -2.0F, -2.0F, 4, 16, 4);
/*  42 */     this.rightarm.a(-6.0F, 0.0F, 0.0F);
/*  43 */     this.rightarm.b(64, 64);
/*  44 */     this.rightarm.i = true;
/*  45 */     setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
/*  46 */     this.leftarm = new ayf(this, 40, 16);
/*  47 */     this.leftarm.a(-1.0F, -2.0F, -2.0F, 4, 16, 4);
/*  48 */     this.leftarm.a(6.0F, 0.0F, 0.0F);
/*  49 */     this.leftarm.b(64, 64);
/*  50 */     this.leftarm.i = true;
/*  51 */     setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
/*  52 */     this.rightleg = new ayf(this, 40, 39);
/*  53 */     this.rightleg.a(-2.0F, 0.0F, -2.0F, 4, 6, 4);
/*  54 */     this.rightleg.a(-2.0F, 13.0F, 0.0F);
/*  55 */     this.rightleg.b(64, 64);
/*  56 */     this.rightleg.i = true;
/*  57 */     setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
/*  58 */     this.leftleg = new ayf(this, 40, 39);
/*  59 */     this.leftleg.a(-2.0F, 0.0F, -2.0F, 4, 6, 4);
/*  60 */     this.leftleg.a(2.0F, 13.0F, 0.0F);
/*  61 */     this.leftleg.b(64, 64);
/*  62 */     this.leftleg.i = true;
/*  63 */     setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
/*  64 */     this.jawup = new ayf(this, 1, 17);
/*  65 */     this.jawup.a(-5.0F, -4.0F, -5.0F, 10, 2, 4);
/*  66 */     this.jawup.a(0.0F, -2.0F, 0.0F);
/*  67 */     this.jawup.b(64, 64);
/*  68 */     this.jawup.i = true;
/*  69 */     setRotation(this.jawup, 0.0F, 0.0F, 0.0F);
/*  70 */     this.jawdown = new ayf(this, 1, 24);
/*  71 */     this.jawdown.a(-5.0F, -2.0F, -5.0F, 10, 2, 4);
/*  72 */     this.jawdown.a(0.0F, -2.0F, 0.0F);
/*  73 */     this.jawdown.b(64, 64);
/*  74 */     this.jawdown.i = true;
/*  75 */     setRotation(this.jawdown, 0.0F, 0.0F, 0.0F);
/*  76 */     this.leftfoot = new ayf(this, 38, 3);
/*  77 */     this.leftfoot.a(-2.0F, 6.0F, -3.0F, 5, 5, 5);
/*  78 */     this.leftfoot.a(2.0F, 13.0F, 0.0F);
/*  79 */     this.leftfoot.b(64, 64);
/*  80 */     this.leftfoot.i = true;
/*  81 */     setRotation(this.leftfoot, 0.0F, 0.0F, 0.0F);
/*  82 */     this.rightfoot = new ayf(this, 38, 3);
/*  83 */     this.rightfoot.a(-3.0F, 6.0F, -3.0F, 5, 5, 5);
/*  84 */     this.rightfoot.a(-2.0F, 13.0F, 0.0F);
/*  85 */     this.rightfoot.b(64, 64);
/*  86 */     this.rightfoot.i = true;
/*  87 */     setRotation(this.rightfoot, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*  92 */     super.a(entity, f, f1, f2, f3, f4, f5);
/*  93 */     a(f, f1, f2, f3, f4, f5, entity);
/*  94 */     this.head.a(f5);
/*  95 */     this.body.a(f5);
/*  96 */     this.rightarm.a(f5);
/*  97 */     this.leftarm.a(f5);
/*  98 */     this.rightleg.a(f5);
/*  99 */     this.leftleg.a(f5);
/* 100 */     this.jawup.a(f5);
/* 101 */     this.jawdown.a(f5);
/* 102 */     this.leftfoot.a(f5);
/* 103 */     this.rightfoot.a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ayf model, float x, float y, float z) {
/* 108 */     model.f = x;
/* 109 */     model.g = y;
/* 110 */     model.h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float f, float f1, float f2, float f3, float f4, float f5, lq entity) {
/* 115 */     super.a(f, f1, f2, f3, f4, f5, entity);
/* 116 */     this.head.g = f3 / 57.295776F;
/* 117 */     this.head.f = f4 / 57.295776F;
/* 118 */     this.rightleg.f = ke.b(f * 0.6662F) * 1.4F * f1;
/* 119 */     this.leftleg.f = ke.b(f * 0.6662F + 3.1415927F) * 1.4F * f1;
/* 120 */     this.rightleg.g = 0.0F;
/* 121 */     this.leftleg.g = 0.0F;
/* 122 */     this.jawup.g = f3 / 57.295776F;
/* 123 */     this.jawup.f = f4 / 57.295776F;
/* 124 */     this.jawdown.g = f3 / 57.295776F;
/* 125 */     this.jawdown.f = f4 / 57.295776F;
/* 126 */     this.rightfoot.f = ke.b(f * 0.6662F) * 1.4F * f1;
/* 127 */     this.leftfoot.f = ke.b(f * 0.6662F + 3.1415927F) * 1.4F * f1;
/* 128 */     this.rightfoot.g = 0.0F;
/* 129 */     this.leftfoot.g = 0.0F;
/* 130 */     this.rightarm.f = ke.b(f * 0.6662F + 3.1415927F) * 2.0F * f1 * 0.5F;
/* 131 */     this.leftarm.f = ke.b(f * 0.6662F) * 2.0F * f1 * 0.5F;
/* 132 */     this.rightarm.h = 0.0F;
/* 133 */     this.leftarm.h = 0.0F;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel1000.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */