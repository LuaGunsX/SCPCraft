/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ public class SCPModel280
/*     */   extends axa
/*     */ {
/*     */   ayf head;
/*     */   ayf body;
/*     */   ayf leftarm;
/*     */   ayf underbody;
/*     */   ayf underbody1;
/*     */   ayf rightfinger1;
/*     */   ayf rightpalm;
/*     */   ayf rightarm;
/*     */   ayf rightfinger2;
/*     */   ayf rightfinger3;
/*     */   ayf leftpalm;
/*     */   ayf leftfinger1;
/*     */   ayf leftfinger2;
/*     */   ayf leftfinger3;
/*     */   
/*     */   public SCPModel280() {
/*  27 */     this.t = 64;
/*  28 */     this.u = 64;
/*     */     
/*  30 */     this.head = new ayf(this, 13, 4);
/*  31 */     this.head.a(-3.0F, -5.0F, -3.0F, 6, 5, 5);
/*  32 */     this.head.a(0.0F, 0.0F, 0.0F);
/*  33 */     this.head.b(64, 64);
/*  34 */     this.head.i = true;
/*  35 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  36 */     this.body = new ayf(this, 16, 16);
/*  37 */     this.body.a(-2.0F, 0.0F, -2.0F, 4, 10, 4);
/*  38 */     this.body.a(0.0F, 0.0F, 0.0F);
/*  39 */     this.body.b(64, 64);
/*  40 */     this.body.i = true;
/*  41 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  42 */     this.leftarm = new ayf(this, 40, 21);
/*  43 */     this.leftarm.a(0.0F, -2.0F, -1.0F, 2, 10, 2);
/*  44 */     this.leftarm.a(2.0F, 2.0F, 0.0F);
/*  45 */     this.leftarm.b(64, 64);
/*  46 */     this.leftarm.i = true;
/*  47 */     setRotation(this.leftarm, -1.500983F, 0.0F, 0.0F);
/*  48 */     this.underbody = new ayf(this, 16, 31);
/*  49 */     this.underbody.a(-2.0F, 9.0F, -4.0F, 4, 3, 4);
/*  50 */     this.underbody.a(0.0F, 0.0F, 0.0F);
/*  51 */     this.underbody.b(64, 64);
/*  52 */     this.underbody.i = true;
/*  53 */     setRotation(this.underbody, 0.2268928F, 0.0F, 0.0F);
/*  54 */     this.underbody1 = new ayf(this, 16, 39);
/*  55 */     this.underbody1.a(-2.0F, 11.0F, -5.8F, 4, 2, 4);
/*  56 */     this.underbody1.a(0.0F, 0.0F, 0.0F);
/*  57 */     this.underbody1.b(64, 64);
/*  58 */     this.underbody1.i = true;
/*  59 */     setRotation(this.underbody1, 0.3839724F, 0.0F, 0.0F);
/*  60 */     this.rightfinger1 = new ayf(this, 40, 16);
/*  61 */     this.rightfinger1.a(0.0F, 8.0F, -1.0F, 1, 3, 1);
/*  62 */     this.rightfinger1.a(-2.0F, 2.0F, 0.0F);
/*  63 */     this.rightfinger1.b(64, 64);
/*  64 */     this.rightfinger1.i = true;
/*  65 */     setRotation(this.rightfinger1, -1.500983F, 0.0F, 0.0F);
/*  66 */     this.rightpalm = new ayf(this, 40, 34);
/*  67 */     this.rightpalm.a(-3.0F, 8.0F, -2.0F, 3, 1, 3);
/*  68 */     this.rightpalm.a(-2.0F, 2.0F, 0.0F);
/*  69 */     this.rightpalm.b(64, 64);
/*  70 */     this.rightpalm.i = true;
/*  71 */     setRotation(this.rightpalm, -1.500983F, 0.0F, 0.0F);
/*  72 */     this.rightarm = new ayf(this, 40, 21);
/*  73 */     this.rightarm.a(-2.0F, -2.0F, -1.0F, 2, 10, 2);
/*  74 */     this.rightarm.a(-2.0F, 2.0F, 0.0F);
/*  75 */     this.rightarm.b(64, 64);
/*  76 */     this.rightarm.i = true;
/*  77 */     setRotation(this.rightarm, -1.500983F, 0.0F, 0.0F);
/*  78 */     this.rightfinger2 = new ayf(this, 40, 16);
/*  79 */     this.rightfinger2.a(-1.0F, 8.0F, -3.0F, 1, 3, 1);
/*  80 */     this.rightfinger2.a(-2.0F, 2.0F, 0.0F);
/*  81 */     this.rightfinger2.b(64, 64);
/*  82 */     this.rightfinger2.i = true;
/*  83 */     setRotation(this.rightfinger2, -1.500983F, 0.0F, 0.0F);
/*  84 */     this.rightfinger3 = new ayf(this, 40, 16);
/*  85 */     this.rightfinger3.a(-3.0F, 8.0F, -3.0F, 1, 3, 1);
/*  86 */     this.rightfinger3.a(-2.0F, 2.0F, 0.0F);
/*  87 */     this.rightfinger3.b(64, 64);
/*  88 */     this.rightfinger3.i = true;
/*  89 */     setRotation(this.rightfinger3, -1.500983F, 0.0F, 0.0F);
/*  90 */     this.leftpalm = new ayf(this, 40, 34);
/*  91 */     this.leftpalm.a(0.0F, 8.0F, -2.0F, 3, 1, 3);
/*  92 */     this.leftpalm.a(2.0F, 2.0F, 0.0F);
/*  93 */     this.leftpalm.b(64, 64);
/*  94 */     this.leftpalm.i = true;
/*  95 */     setRotation(this.leftpalm, -1.500983F, 0.0F, 0.0F);
/*  96 */     this.leftfinger1 = new ayf(this, 40, 16);
/*  97 */     this.leftfinger1.a(-1.0F, 8.0F, -1.0F, 1, 3, 1);
/*  98 */     this.leftfinger1.a(2.0F, 2.0F, 0.0F);
/*  99 */     this.leftfinger1.b(64, 64);
/* 100 */     this.leftfinger1.i = true;
/* 101 */     setRotation(this.leftfinger1, -1.500983F, 0.0F, 0.0F);
/* 102 */     this.leftfinger2 = new ayf(this, 40, 16);
/* 103 */     this.leftfinger2.a(0.0F, 8.0F, -3.0F, 1, 3, 1);
/* 104 */     this.leftfinger2.a(2.0F, 2.0F, 0.0F);
/* 105 */     this.leftfinger2.b(64, 64);
/* 106 */     this.leftfinger2.i = true;
/* 107 */     setRotation(this.leftfinger2, -1.500983F, 0.0F, 0.0F);
/* 108 */     this.leftfinger3 = new ayf(this, 40, 16);
/* 109 */     this.leftfinger3.a(2.0F, 8.0F, -3.0F, 1, 3, 1);
/* 110 */     this.leftfinger3.a(2.0F, 2.0F, 0.0F);
/* 111 */     this.leftfinger3.b(64, 64);
/* 112 */     this.leftfinger3.i = true;
/* 113 */     setRotation(this.leftfinger3, -1.500983F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 118 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 119 */     a(f, f1, f2, f3, f4, f5, entity);
/* 120 */     this.head.a(f5);
/* 121 */     this.body.a(f5);
/* 122 */     this.leftarm.a(f5);
/* 123 */     this.underbody.a(f5);
/* 124 */     this.underbody.a(f5);
/* 125 */     this.rightfinger1.a(f5);
/* 126 */     this.rightpalm.a(f5);
/* 127 */     this.rightarm.a(f5);
/* 128 */     this.rightfinger2.a(f5);
/* 129 */     this.rightfinger3.a(f5);
/* 130 */     this.leftpalm.a(f5);
/* 131 */     this.leftfinger1.a(f5);
/* 132 */     this.leftfinger2.a(f5);
/* 133 */     this.leftfinger3.a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ayf model, float x, float y, float z) {
/* 138 */     model.f = x;
/* 139 */     model.g = y;
/* 140 */     model.h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float f, float f1, float f2, float f3, float f4, float f5, lq entity) {
/* 145 */     super.a(f, f1, f2, f3, f4, f5, entity);
/* 146 */     this.head.g = f3 / 57.295776F;
/* 147 */     this.head.f = f4 / 57.295776F;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel280.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */