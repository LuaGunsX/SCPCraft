/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ public class SCPModel087
/*     */   extends axa
/*     */ {
/*     */   ayf fingerright4;
/*     */   ayf fingerright5;
/*     */   ayf fingerleft1;
/*     */   ayf fingerleft2;
/*     */   ayf fingerleft3;
/*     */   ayf fingerleft4;
/*     */   ayf fingerleft5;
/*     */   ayf head;
/*     */   ayf body;
/*     */   ayf rightarm;
/*     */   ayf leftarm;
/*     */   ayf Shoulder1;
/*     */   ayf Shoulder2;
/*     */   ayf underbody;
/*     */   ayf rightarmunder;
/*     */   ayf leftarmunder;
/*     */   ayf fingerright1;
/*     */   ayf fingerright2;
/*     */   ayf fingerright3;
/*     */   
/*     */   public SCPModel087() {
/*  32 */     this.t = 64;
/*  33 */     this.u = 64;
/*     */     
/*  35 */     this.fingerright4 = new ayf(this, 2, 50);
/*  36 */     this.fingerright4.a(0.0F, 19.0F, 0.0F, 1, 5, 1);
/*  37 */     this.fingerright4.a(-4.0F, -9.0F, 0.0F);
/*  38 */     this.fingerright4.b(64, 64);
/*  39 */     this.fingerright4.i = true;
/*  40 */     setRotation(this.fingerright4, 0.0F, 0.0F, 0.3665191F);
/*  41 */     this.fingerright5 = new ayf(this, 2, 59);
/*  42 */     this.fingerright5.a(-6.0F, 18.0F, 0.0F, 1, 3, 1);
/*  43 */     this.fingerright5.a(-4.0F, -9.0F, 0.0F);
/*  44 */     this.fingerright5.b(64, 64);
/*  45 */     this.fingerright5.i = true;
/*  46 */     setRotation(this.fingerright5, 0.0F, 0.0F, -0.1396263F);
/*  47 */     this.fingerleft1 = new ayf(this, 57, 50);
/*  48 */     this.fingerleft1.a(3.0F, 20.0F, -2.0F, 1, 9, 1);
/*  49 */     this.fingerleft1.a(4.0F, -9.0F, 0.0F);
/*  50 */     this.fingerleft1.b(64, 64);
/*  51 */     this.fingerleft1.i = true;
/*  52 */     setRotation(this.fingerleft1, 0.0F, 0.0F, -0.1396263F);
/*  53 */     this.fingerleft2 = new ayf(this, 47, 50);
/*  54 */     this.fingerleft2.a(1.0F, 20.0F, -2.0F, 1, 9, 1);
/*  55 */     this.fingerleft2.a(4.0F, -9.0F, 0.0F);
/*  56 */     this.fingerleft2.b(64, 64);
/*  57 */     this.fingerleft2.i = true;
/*  58 */     setRotation(this.fingerleft2, 0.0F, 0.0F, -0.0872665F);
/*  59 */     this.fingerleft3 = new ayf(this, 52, 50);
/*  60 */     this.fingerleft3.a(1.0F, 20.0F, 0.0F, 1, 10, 1);
/*  61 */     this.fingerleft3.a(4.0F, -9.0F, 0.0F);
/*  62 */     this.fingerleft3.b(64, 64);
/*  63 */     this.fingerleft3.i = true;
/*  64 */     setRotation(this.fingerleft3, 0.0F, 0.0F, -0.1396263F);
/*  65 */     this.fingerleft4 = new ayf(this, 42, 55);
/*  66 */     this.fingerleft4.a(-1.0F, 19.0F, 0.0F, 1, 5, 1);
/*  67 */     this.fingerleft4.a(4.0F, -9.0F, 0.0F);
/*  68 */     this.fingerleft4.b(64, 64);
/*  69 */     this.fingerleft4.i = true;
/*  70 */     setRotation(this.fingerleft4, 0.0F, 0.0F, -0.3665191F);
/*  71 */     this.fingerleft5 = new ayf(this, 42, 50);
/*  72 */     this.fingerleft5.a(5.0F, 18.0F, 0.0F, 1, 3, 1);
/*  73 */     this.fingerleft5.a(4.0F, -9.0F, 0.0F);
/*  74 */     this.fingerleft5.b(64, 64);
/*  75 */     this.fingerleft5.i = true;
/*  76 */     setRotation(this.fingerleft5, 0.0F, 0.0F, 0.1396263F);
/*  77 */     this.head = new ayf(this, 20, 0);
/*  78 */     this.head.a(-3.0F, -5.0F, -3.0F, 6, 5, 6);
/*  79 */     this.head.a(0.0F, -11.0F, 0.0F);
/*  80 */     this.head.b(64, 64);
/*  81 */     this.head.i = true;
/*  82 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  83 */     this.body = new ayf(this, 19, 12);
/*  84 */     this.body.a(-4.0F, 0.0F, -2.0F, 8, 10, 4);
/*  85 */     this.body.a(0.0F, -11.0F, 0.0F);
/*  86 */     this.body.b(64, 64);
/*  87 */     this.body.i = true;
/*  88 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  89 */     this.rightarm = new ayf(this, 2, 19);
/*  90 */     this.rightarm.a(-6.0F, -1.0F, -2.0F, 4, 12, 4);
/*  91 */     this.rightarm.a(-4.0F, -9.0F, 0.0F);
/*  92 */     this.rightarm.b(64, 64);
/*  93 */     this.rightarm.i = true;
/*  94 */     setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
/*  95 */     this.leftarm = new ayf(this, 44, 19);
/*  96 */     this.leftarm.a(2.0F, -1.0F, -2.0F, 4, 12, 4);
/*  97 */     this.leftarm.a(4.0F, -9.0F, 0.0F);
/*  98 */     this.leftarm.b(64, 64);
/*  99 */     this.leftarm.i = true;
/* 100 */     setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
/* 101 */     this.Shoulder1 = new ayf(this, 4, 11);
/* 102 */     this.Shoulder1.a(-3.0F, -2.0F, -2.0F, 3, 3, 4);
/* 103 */     this.Shoulder1.a(-4.0F, -9.0F, 0.0F);
/* 104 */     this.Shoulder1.b(64, 64);
/* 105 */     this.Shoulder1.i = true;
/* 106 */     setRotation(this.Shoulder1, 0.0F, 0.0F, 0.0F);
/* 107 */     this.Shoulder2 = new ayf(this, 44, 11);
/* 108 */     this.Shoulder2.a(0.0F, -2.0F, -2.0F, 3, 3, 4);
/* 109 */     this.Shoulder2.a(4.0F, -9.0F, 0.0F);
/* 110 */     this.Shoulder2.b(64, 64);
/* 111 */     this.Shoulder2.i = true;
/* 112 */     setRotation(this.Shoulder2, 0.0F, 0.0F, 0.0F);
/* 113 */     this.underbody = new ayf(this, 20, 27);
/* 114 */     this.underbody.a(-3.0F, 10.0F, -3.0F, 6, 10, 4);
/* 115 */     this.underbody.a(0.0F, -11.0F, 0.0F);
/* 116 */     this.underbody.b(64, 64);
/* 117 */     this.underbody.i = true;
/* 118 */     setRotation(this.underbody, 0.1396263F, 0.0F, 0.0F);
/* 119 */     this.rightarmunder = new ayf(this, 2, 36);
/* 120 */     this.rightarmunder.a(-4.0F, 11.0F, -2.0F, 4, 9, 4);
/* 121 */     this.rightarmunder.a(-4.0F, -9.0F, 0.0F);
/* 122 */     this.rightarmunder.b(64, 64);
/* 123 */     this.rightarmunder.i = true;
/* 124 */     setRotation(this.rightarmunder, 0.0F, 0.0F, 0.1396263F);
/* 125 */     this.leftarmunder = new ayf(this, 42, 36);
/* 126 */     this.leftarmunder.a(0.0F, 11.0F, -2.0F, 4, 9, 4);
/* 127 */     this.leftarmunder.a(4.0F, -9.0F, 0.0F);
/* 128 */     this.leftarmunder.b(64, 64);
/* 129 */     this.leftarmunder.i = true;
/* 130 */     setRotation(this.leftarmunder, 0.0F, 0.0F, -0.1396263F);
/* 131 */     this.fingerright1 = new ayf(this, 7, 50);
/* 132 */     this.fingerright1.a(-4.0F, 20.0F, -2.0F, 1, 9, 1);
/* 133 */     this.fingerright1.a(-4.0F, -9.0F, 0.0F);
/* 134 */     this.fingerright1.b(64, 64);
/* 135 */     this.fingerright1.i = true;
/* 136 */     setRotation(this.fingerright1, 0.0F, 0.0F, 0.1396263F);
/* 137 */     this.fingerright2 = new ayf(this, 17, 50);
/* 138 */     this.fingerright2.a(-2.0F, 20.0F, -2.0F, 1, 9, 1);
/* 139 */     this.fingerright2.a(-4.0F, -9.0F, 0.0F);
/* 140 */     this.fingerright2.b(64, 64);
/* 141 */     this.fingerright2.i = true;
/* 142 */     setRotation(this.fingerright2, 0.0F, 0.0F, 0.0872665F);
/* 143 */     this.fingerright3 = new ayf(this, 12, 50);
/* 144 */     this.fingerright3.a(-2.0F, 20.0F, 0.0F, 1, 10, 1);
/* 145 */     this.fingerright3.a(-4.0F, -9.0F, 0.0F);
/* 146 */     this.fingerright3.b(64, 64);
/* 147 */     this.fingerright3.i = true;
/* 148 */     setRotation(this.fingerright3, 0.0F, 0.0F, 0.1396263F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 153 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 154 */     a(f, f1, f2, f3, f4, f5, entity);
/* 155 */     this.fingerright4.a(f5);
/* 156 */     this.fingerright5.a(f5);
/* 157 */     this.fingerleft1.a(f5);
/* 158 */     this.fingerleft2.a(f5);
/* 159 */     this.fingerleft3.a(f5);
/* 160 */     this.fingerleft4.a(f5);
/* 161 */     this.fingerleft5.a(f5);
/* 162 */     this.head.a(f5);
/* 163 */     this.body.a(f5);
/* 164 */     this.rightarm.a(f5);
/* 165 */     this.leftarm.a(f5);
/* 166 */     this.Shoulder1.a(f5);
/* 167 */     this.Shoulder2.a(f5);
/* 168 */     this.underbody.a(f5);
/* 169 */     this.rightarmunder.a(f5);
/* 170 */     this.leftarmunder.a(f5);
/* 171 */     this.fingerright1.a(f5);
/* 172 */     this.fingerright2.a(f5);
/* 173 */     this.fingerright3.a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ayf model, float x, float y, float z) {
/* 178 */     model.f = x;
/* 179 */     model.g = y;
/* 180 */     model.h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float f, float f1, float f2, float f3, float f4, float f5, lq entity) {
/* 185 */     super.a(f, f1, f2, f3, f4, f5, entity);
/* 186 */     this.head.g = f3 / 57.295776F;
/* 187 */     this.head.f = f4 / 57.295776F;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel087.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */