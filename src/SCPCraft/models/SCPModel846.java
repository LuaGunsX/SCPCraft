/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import ke;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ public class SCPModel846
/*     */   extends axa
/*     */ {
/*     */   ayf head;
/*     */   ayf body;
/*     */   ayf rightarm;
/*     */   ayf leftarm;
/*     */   ayf rightleg;
/*     */   ayf leftleg;
/*     */   ayf leftfoot;
/*     */   ayf rightfoot;
/*     */   ayf topthingy;
/*     */   
/*     */   public SCPModel846() {
/*  23 */     this.t = 64;
/*  24 */     this.u = 64;
/*     */     
/*  26 */     this.head = new ayf(this, 17, 0);
/*  27 */     this.head.a(-4.0F, -8.0F, -2.0F, 8, 8, 4);
/*  28 */     this.head.a(0.0F, 2.0F, 0.0F);
/*  29 */     this.head.b(64, 64);
/*  30 */     this.head.i = true;
/*  31 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  32 */     this.body = new ayf(this, 16, 26);
/*  33 */     this.body.a(-5.0F, 0.0F, -3.0F, 10, 12, 6);
/*  34 */     this.body.a(0.0F, 2.0F, 0.0F);
/*  35 */     this.body.b(64, 64);
/*  36 */     this.body.i = true;
/*  37 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  38 */     this.rightarm = new ayf(this, 50, 16);
/*  39 */     this.rightarm.a(-3.0F, -2.0F, -1.0F, 3, 12, 3);
/*  40 */     this.rightarm.a(-5.0F, 4.0F, 0.0F);
/*  41 */     this.rightarm.b(64, 64);
/*  42 */     this.rightarm.i = true;
/*  43 */     setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
/*  44 */     this.leftarm = new ayf(this, 50, 16);
/*  45 */     this.leftarm.a(-1.0F, -2.0F, -1.0F, 3, 12, 3);
/*  46 */     this.leftarm.a(6.0F, 4.0F, 0.0F);
/*  47 */     this.leftarm.b(64, 64);
/*  48 */     this.leftarm.i = true;
/*  49 */     setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
/*  50 */     this.rightleg = new ayf(this, 0, 30);
/*  51 */     this.rightleg.a(-2.0F, 0.0F, -2.0F, 3, 8, 4);
/*  52 */     this.rightleg.a(-2.0F, 14.0F, 0.0F);
/*  53 */     this.rightleg.b(64, 64);
/*  54 */     this.rightleg.i = true;
/*  55 */     setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
/*  56 */     this.leftleg = new ayf(this, 0, 30);
/*  57 */     this.leftleg.a(-1.0F, 0.0F, -2.0F, 3, 8, 4);
/*  58 */     this.leftleg.a(2.0F, 14.0F, 0.0F);
/*  59 */     this.leftleg.b(64, 64);
/*  60 */     this.leftleg.i = true;
/*  61 */     setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
/*  62 */     this.leftfoot = new ayf(this, 0, 16);
/*  63 */     this.leftfoot.a(-1.0F, 8.0F, -3.0F, 3, 2, 6);
/*  64 */     this.leftfoot.a(2.0F, 14.0F, 0.0F);
/*  65 */     this.leftfoot.b(64, 64);
/*  66 */     this.leftfoot.i = true;
/*  67 */     setRotation(this.leftfoot, 0.0F, 0.0F, 0.0F);
/*  68 */     this.rightfoot = new ayf(this, 0, 16);
/*  69 */     this.rightfoot.a(-2.0F, 8.0F, -3.0F, 3, 2, 6);
/*  70 */     this.rightfoot.a(-2.0F, 14.0F, 0.0F);
/*  71 */     this.rightfoot.b(64, 64);
/*  72 */     this.rightfoot.i = true;
/*  73 */     setRotation(this.rightfoot, 0.0F, 0.0F, 0.0F);
/*  74 */     this.topthingy = new ayf(this, 0, 0);
/*  75 */     this.topthingy.a(-3.0F, -12.0F, -1.0F, 6, 4, 2);
/*  76 */     this.topthingy.a(0.0F, 2.0F, 0.0F);
/*  77 */     this.topthingy.b(64, 64);
/*  78 */     this.topthingy.i = true;
/*  79 */     setRotation(this.topthingy, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*  84 */     super.a(entity, f, f1, f2, f3, f4, f5);
/*  85 */     a(f, f1, f2, f3, f4, f5, entity);
/*  86 */     this.head.a(f5);
/*  87 */     this.body.a(f5);
/*  88 */     this.rightarm.a(f5);
/*  89 */     this.leftarm.a(f5);
/*  90 */     this.rightleg.a(f5);
/*  91 */     this.leftleg.a(f5);
/*  92 */     this.leftfoot.a(f5);
/*  93 */     this.rightfoot.a(f5);
/*  94 */     this.topthingy.a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ayf model, float x, float y, float z) {
/*  99 */     model.f = x;
/* 100 */     model.g = y;
/* 101 */     model.h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float f, float f1, float f2, float f3, float f4, float f5, lq entity) {
/* 106 */     super.a(f, f1, f2, f3, f4, f5, entity);
/* 107 */     this.head.g = f3 / 57.295776F;
/* 108 */     this.head.f = f4 / 57.295776F;
/* 109 */     this.topthingy.g = f3 / 57.295776F;
/* 110 */     this.topthingy.f = f4 / 57.295776F;
/* 111 */     this.rightleg.f = ke.b(f * 0.6662F) * 1.4F * f1;
/* 112 */     this.leftleg.f = ke.b(f * 0.6662F + 3.1415927F) * 1.4F * f1;
/* 113 */     this.rightleg.g = 0.0F;
/* 114 */     this.leftleg.g = 0.0F;
/* 115 */     this.rightfoot.f = ke.b(f * 0.6662F) * 1.4F * f1;
/* 116 */     this.leftfoot.f = ke.b(f * 0.6662F + 3.1415927F) * 1.4F * f1;
/* 117 */     this.rightfoot.g = 0.0F;
/* 118 */     this.leftfoot.g = 0.0F;
/* 119 */     this.rightarm.f = ke.b(f * 0.6662F + 3.1415927F) * 2.0F * f1 * 0.5F;
/* 120 */     this.leftarm.f = ke.b(f * 0.6662F) * 2.0F * f1 * 0.5F;
/* 121 */     this.rightarm.h = 0.0F;
/* 122 */     this.leftarm.h = 0.0F;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel846.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */