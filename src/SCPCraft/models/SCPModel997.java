/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ public class SCPModel997
/*     */   extends axa
/*     */ {
/*     */   ayf plate;
/*     */   ayf foot1;
/*     */   ayf foot2;
/*     */   ayf foot3;
/*     */   ayf foot4;
/*     */   ayf underthing;
/*     */   ayf thing;
/*     */   ayf pipe;
/*     */   ayf ring;
/*     */   ayf neck;
/*     */   ayf top;
/*     */   ayf toprim;
/*     */   ayf spalk1;
/*     */   ayf spalk2;
/*     */   ayf rim1;
/*     */   ayf rim2;
/*     */   ayf rim3;
/*     */   ayf rim4;
/*     */   ayf rim5;
/*     */   ayf rim6;
/*     */   
/*     */   public SCPModel997() {
/*  33 */     this.t = 64;
/*  34 */     this.u = 64;
/*     */     
/*  36 */     this.plate = new ayf(this, 4, 48);
/*  37 */     this.plate.a(0.0F, 0.0F, 0.0F, 14, 1, 14);
/*  38 */     this.plate.a(-7.0F, 21.0F, -7.0F);
/*  39 */     this.plate.b(64, 64);
/*  40 */     this.plate.i = true;
/*  41 */     setRotation(this.plate, 0.0F, 0.0F, 0.0F);
/*  42 */     this.foot1 = new ayf(this, 0, 0);
/*  43 */     this.foot1.a(0.0F, 0.0F, 0.0F, 2, 2, 2);
/*  44 */     this.foot1.a(-7.0F, 22.0F, -7.0F);
/*  45 */     this.foot1.b(64, 64);
/*  46 */     this.foot1.i = true;
/*  47 */     setRotation(this.foot1, 0.0F, 0.0F, 0.0F);
/*  48 */     this.foot2 = new ayf(this, 0, 0);
/*  49 */     this.foot2.a(0.0F, 0.0F, 0.0F, 2, 2, 2);
/*  50 */     this.foot2.a(5.0F, 22.0F, -7.0F);
/*  51 */     this.foot2.b(64, 64);
/*  52 */     this.foot2.i = true;
/*  53 */     setRotation(this.foot2, 0.0F, 0.0F, 0.0F);
/*  54 */     this.foot3 = new ayf(this, 0, 0);
/*  55 */     this.foot3.a(0.0F, 0.0F, 0.0F, 2, 2, 2);
/*  56 */     this.foot3.a(-7.0F, 22.0F, 5.0F);
/*  57 */     this.foot3.b(64, 64);
/*  58 */     this.foot3.i = true;
/*  59 */     setRotation(this.foot3, 0.0F, 0.0F, 0.0F);
/*  60 */     this.foot4 = new ayf(this, 0, 0);
/*  61 */     this.foot4.a(0.0F, 0.0F, 0.0F, 2, 2, 2);
/*  62 */     this.foot4.a(5.0F, 22.0F, 5.0F);
/*  63 */     this.foot4.b(64, 64);
/*  64 */     this.foot4.i = true;
/*  65 */     setRotation(this.foot4, 0.0F, 0.0F, 0.0F);
/*  66 */     this.underthing = new ayf(this, 24, 41);
/*  67 */     this.underthing.a(0.0F, 0.0F, 0.0F, 4, 2, 4);
/*  68 */     this.underthing.a(-2.0F, 19.0F, -2.0F);
/*  69 */     this.underthing.b(64, 64);
/*  70 */     this.underthing.i = true;
/*  71 */     setRotation(this.underthing, 0.0F, 0.0F, 0.0F);
/*  72 */     this.thing = new ayf(this, 20, 30);
/*  73 */     this.thing.a(0.0F, 0.0F, 0.0F, 6, 4, 6);
/*  74 */     this.thing.a(-3.0F, 15.0F, -3.0F);
/*  75 */     this.thing.b(64, 64);
/*  76 */     this.thing.i = true;
/*  77 */     setRotation(this.thing, 0.0F, 0.0F, 0.0F);
/*  78 */     this.pipe = new ayf(this, 28, 20);
/*  79 */     this.pipe.a(0.0F, 0.0F, 0.0F, 2, 7, 2);
/*  80 */     this.pipe.a(-1.0F, 8.0F, -1.0F);
/*  81 */     this.pipe.b(64, 64);
/*  82 */     this.pipe.i = true;
/*  83 */     setRotation(this.pipe, 0.0F, 0.0F, 0.0F);
/*  84 */     this.ring = new ayf(this, 24, 12);
/*  85 */     this.ring.a(0.0F, 0.0F, 0.0F, 4, 3, 4);
/*  86 */     this.ring.a(-2.0F, 5.0F, -2.0F);
/*  87 */     this.ring.b(64, 64);
/*  88 */     this.ring.i = true;
/*  89 */     setRotation(this.ring, 0.0F, 0.0F, 0.0F);
/*  90 */     this.neck = new ayf(this, 28, 5);
/*  91 */     this.neck.a(0.0F, 0.0F, 0.0F, 2, 4, 2);
/*  92 */     this.neck.a(-1.0F, 1.0F, -1.0F);
/*  93 */     this.neck.b(64, 64);
/*  94 */     this.neck.i = true;
/*  95 */     setRotation(this.neck, 0.0F, 0.0F, 0.0F);
/*  96 */     this.top = new ayf(this, 9, 5);
/*  97 */     this.top.a(0.0F, 0.0F, 0.0F, 4, 1, 4);
/*  98 */     this.top.a(-2.0F, 0.0F, -2.0F);
/*  99 */     this.top.b(64, 64);
/* 100 */     this.top.i = true;
/* 101 */     setRotation(this.top, 0.0F, 0.0F, 0.0F);
/* 102 */     this.toprim = new ayf(this, 27, 2);
/* 103 */     this.toprim.a(0.0F, 0.0F, 0.0F, 4, 1, 1);
/* 104 */     this.toprim.a(-2.0F, -4.0F, 0.0F);
/* 105 */     this.toprim.b(64, 64);
/* 106 */     this.toprim.i = true;
/* 107 */     setRotation(this.toprim, 0.0F, 0.0F, 0.0F);
/* 108 */     this.spalk1 = new ayf(this, 0, 13);
/* 109 */     this.spalk1.a(0.0F, 0.0F, 0.0F, 1, 5, 1);
/* 110 */     this.spalk1.a(-3.0F, -4.0F, 0.0F);
/* 111 */     this.spalk1.b(64, 64);
/* 112 */     this.spalk1.i = true;
/* 113 */     setRotation(this.spalk1, 0.0F, 0.0F, 0.0F);
/* 114 */     this.spalk2 = new ayf(this, 0, 13);
/* 115 */     this.spalk2.a(0.0F, 0.0F, 0.0F, 1, 5, 1);
/* 116 */     this.spalk2.a(2.0F, -4.0F, 0.0F);
/* 117 */     this.spalk2.b(64, 64);
/* 118 */     this.spalk2.i = true;
/* 119 */     setRotation(this.spalk2, 0.0F, 0.0F, 0.0F);
/* 120 */     this.rim1 = new ayf(this, 8, 11);
/* 121 */     this.rim1.a(0.0F, 0.0F, 0.0F, 6, 1, 1);
/* 122 */     this.rim1.a(-9.0F, -4.0F, 0.0F);
/* 123 */     this.rim1.b(64, 64);
/* 124 */     this.rim1.i = true;
/* 125 */     setRotation(this.rim1, 0.0F, 0.0F, 0.0F);
/* 126 */     this.rim2 = new ayf(this, 8, 11);
/* 127 */     this.rim2.a(0.0F, 0.0F, 0.0F, 6, 1, 1);
/* 128 */     this.rim2.a(3.0F, -4.0F, 0.0F);
/* 129 */     this.rim2.b(64, 64);
/* 130 */     this.rim2.i = true;
/* 131 */     setRotation(this.rim2, 0.0F, 0.0F, 0.0F);
/* 132 */     this.rim3 = new ayf(this, 1, 20);
/* 133 */     this.rim3.a(0.0F, 0.0F, 0.0F, 1, 11, 1);
/* 134 */     this.rim3.a(-9.0F, -3.0F, 0.0F);
/* 135 */     this.rim3.b(64, 64);
/* 136 */     this.rim3.i = true;
/* 137 */     setRotation(this.rim3, 0.0F, 0.0F, 0.0F);
/* 138 */     this.rim4 = new ayf(this, 1, 20);
/* 139 */     this.rim4.a(0.0F, 0.0F, 0.0F, 1, 11, 1);
/* 140 */     this.rim4.a(8.0F, -3.0F, 0.0F);
/* 141 */     this.rim4.b(64, 64);
/* 142 */     this.rim4.i = true;
/* 143 */     setRotation(this.rim4, 0.0F, 0.0F, 0.0F);
/* 144 */     this.rim5 = new ayf(this, 39, 1);
/* 145 */     this.rim5.a(0.0F, 0.0F, 0.0F, 10, 1, 1);
/* 146 */     this.rim5.a(-9.0F, 8.0F, 0.0F);
/* 147 */     this.rim5.b(64, 64);
/* 148 */     this.rim5.i = true;
/* 149 */     setRotation(this.rim5, 0.0F, 0.0F, -0.9075712F);
/* 150 */     this.rim6 = new ayf(this, 39, 1);
/* 151 */     this.rim6.a(0.0F, 0.0F, 0.0F, 9, 1, 1);
/* 152 */     this.rim6.a(3.0F, 0.0F, 0.0F);
/* 153 */     this.rim6.b(64, 64);
/* 154 */     this.rim6.i = true;
/* 155 */     setRotation(this.rim6, 0.0F, 0.0F, 0.9075712F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 160 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 161 */     a(f, f1, f2, f3, f4, f5, entity);
/* 162 */     this.plate.a(f5);
/* 163 */     this.foot1.a(f5);
/* 164 */     this.foot2.a(f5);
/* 165 */     this.foot3.a(f5);
/* 166 */     this.foot4.a(f5);
/* 167 */     this.underthing.a(f5);
/* 168 */     this.thing.a(f5);
/* 169 */     this.pipe.a(f5);
/* 170 */     this.ring.a(f5);
/* 171 */     this.neck.a(f5);
/* 172 */     this.top.a(f5);
/* 173 */     this.toprim.a(f5);
/* 174 */     this.spalk1.a(f5);
/* 175 */     this.spalk2.a(f5);
/* 176 */     this.rim1.a(f5);
/* 177 */     this.rim2.a(f5);
/* 178 */     this.rim3.a(f5);
/* 179 */     this.rim4.a(f5);
/* 180 */     this.rim5.a(f5);
/* 181 */     this.rim6.a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ayf model, float x, float y, float z) {
/* 186 */     model.f = x;
/* 187 */     model.g = y;
/* 188 */     model.h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float f, float f1, float f2, float f3, float f4, float f5, lq entity) {
/* 193 */     super.a(f, f1, f2, f3, f4, f5, entity);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel997.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */