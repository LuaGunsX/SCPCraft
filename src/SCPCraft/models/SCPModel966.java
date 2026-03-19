/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import ke;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ public class SCPModel966
/*     */   extends axa
/*     */ {
/*     */   ayf head;
/*     */   ayf body;
/*     */   ayf rightarm;
/*     */   ayf leftarm;
/*     */   ayf rightleg;
/*     */   ayf leftleg;
/*     */   ayf neck;
/*     */   ayf rightarmthing;
/*     */   ayf righthand;
/*     */   ayf rightfinger1;
/*     */   ayf rightfinger2;
/*     */   ayf rightfinger3;
/*     */   ayf rightfinger4;
/*     */   ayf rightfinger5;
/*     */   ayf leftarmthing;
/*     */   ayf lefthand;
/*     */   ayf leftfinger1;
/*     */   ayf leftfinger2;
/*     */   ayf jaw;
/*     */   ayf leftfinger3;
/*     */   ayf leftfinger4;
/*     */   ayf leftfinger5;
/*     */   
/*     */   public SCPModel966() {
/*  36 */     this.t = 64;
/*  37 */     this.u = 64;
/*     */     
/*  39 */     this.head = new ayf(this, 0, 0);
/*  40 */     this.head.a(-4.0F, -11.0F, -5.0F, 8, 7, 6);
/*  41 */     this.head.a(0.0F, -6.0F, 0.0F);
/*  42 */     this.head.b(64, 64);
/*  43 */     this.head.i = true;
/*  44 */     setRotation(this.head, 0.2094395F, 0.0F, 0.0F);
/*  45 */     this.body = new ayf(this, 16, 24);
/*  46 */     this.body.a(-4.0F, 0.0F, -2.0F, 8, 14, 3);
/*  47 */     this.body.a(0.0F, -3.0F, 0.0F);
/*  48 */     this.body.b(64, 64);
/*  49 */     this.body.i = true;
/*  50 */     setRotation(this.body, 0.2443461F, 0.0F, 0.0F);
/*  51 */     this.rightarm = new ayf(this, 45, 16);
/*  52 */     this.rightarm.a(-3.0F, -2.0F, -2.0F, 3, 11, 3);
/*  53 */     this.rightarm.a(-4.0F, 0.0F, 0.0F);
/*  54 */     this.rightarm.b(64, 64);
/*  55 */     this.rightarm.i = true;
/*  56 */     setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
/*  57 */     this.leftarm = new ayf(this, 45, 16);
/*  58 */     this.leftarm.a(-1.0F, -2.0F, -2.0F, 3, 11, 3);
/*  59 */     this.leftarm.a(5.0F, 0.0F, 0.0F);
/*  60 */     this.leftarm.b(64, 64);
/*  61 */     this.leftarm.i = true;
/*  62 */     setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
/*  63 */     this.rightleg = new ayf(this, 0, 16);
/*  64 */     this.rightleg.a(-2.0F, 0.0F, -2.0F, 3, 13, 3);
/*  65 */     this.rightleg.a(-2.0F, 11.0F, 3.0F);
/*  66 */     this.rightleg.b(64, 64);
/*  67 */     this.rightleg.i = true;
/*  68 */     setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
/*  69 */     this.leftleg = new ayf(this, 0, 16);
/*  70 */     this.leftleg.a(-1.0F, 0.0F, -2.0F, 3, 13, 3);
/*  71 */     this.leftleg.a(2.0F, 11.0F, 3.0F);
/*  72 */     this.leftleg.b(64, 64);
/*  73 */     this.leftleg.i = true;
/*  74 */     setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
/*  75 */     this.neck = new ayf(this, 16, 16);
/*  76 */     this.neck.a(-2.0F, -3.0F, -2.0F, 4, 4, 3);
/*  77 */     this.neck.a(0.0F, -3.0F, 0.0F);
/*  78 */     this.neck.b(64, 64);
/*  79 */     this.neck.i = true;
/*  80 */     setRotation(this.neck, 0.0F, 0.0F, 0.0F);
/*  81 */     this.rightarmthing = new ayf(this, 40, 31);
/*  82 */     this.rightarmthing.a(-3.0F, 6.1F, -7.0F, 3, 3, 7);
/*  83 */     this.rightarmthing.a(-4.0F, 0.0F, 0.0F);
/*  84 */     this.rightarmthing.b(64, 64);
/*  85 */     this.rightarmthing.i = true;
/*  86 */     setRotation(this.rightarmthing, -0.1919862F, 0.0F, 0.0F);
/*  87 */     this.righthand = new ayf(this, 40, 42);
/*  88 */     this.righthand.a(-3.0F, 7.1F, -10.0F, 3, 3, 3);
/*  89 */     this.righthand.a(-4.0F, 0.0F, 0.0F);
/*  90 */     this.righthand.b(64, 64);
/*  91 */     this.righthand.i = true;
/*  92 */     setRotation(this.righthand, -0.1919862F, 0.0F, 0.0F);
/*  93 */     this.rightfinger1 = new ayf(this, 40, 16);
/*  94 */     this.rightfinger1.a(-3.0F, 12.1F, -6.0F, 1, 3, 1);
/*  95 */     this.rightfinger1.a(-4.0F, 0.0F, 0.0F);
/*  96 */     this.rightfinger1.b(64, 64);
/*  97 */     this.rightfinger1.i = true;
/*  98 */     setRotation(this.rightfinger1, -0.5585054F, 0.0F, 0.0F);
/*  99 */     this.rightfinger2 = new ayf(this, 40, 16);
/* 100 */     this.rightfinger2.a(-1.0F, 12.1F, -6.0F, 1, 4, 1);
/* 101 */     this.rightfinger2.a(-4.0F, 0.0F, 0.0F);
/* 102 */     this.rightfinger2.b(64, 64);
/* 103 */     this.rightfinger2.i = true;
/* 104 */     setRotation(this.rightfinger2, -0.5585054F, 0.0F, 0.0F);
/* 105 */     this.rightfinger3 = new ayf(this, 40, 16);
/* 106 */     this.rightfinger3.a(-10.0F, 6.1F, 3.6F, 1, 4, 1);
/* 107 */     this.rightfinger3.a(-4.0F, 0.0F, 0.0F);
/* 108 */     this.rightfinger3.b(64, 64);
/* 109 */     this.rightfinger3.i = true;
/* 110 */     setRotation(this.rightfinger3, -0.5585054F, -1.570796F, 0.0F);
/* 111 */     this.rightfinger4 = new ayf(this, 40, 16);
/* 112 */     this.rightfinger4.a(-10.0F, 7.1F, -2.4F, 1, 3, 1);
/* 113 */     this.rightfinger4.a(-4.0F, 0.0F, 0.0F);
/* 114 */     this.rightfinger4.b(64, 64);
/* 115 */     this.rightfinger4.i = true;
/* 116 */     setRotation(this.rightfinger4, 0.5585054F, -1.570796F, 0.0F);
/* 117 */     this.rightfinger5 = new ayf(this, 40, 16);
/* 118 */     this.rightfinger5.a(-10.0F, 9.1F, 0.6F, 1, 4, 1);
/* 119 */     this.rightfinger5.a(-4.0F, 0.0F, 0.0F);
/* 120 */     this.rightfinger5.b(64, 64);
/* 121 */     this.rightfinger5.i = true;
/* 122 */     setRotation(this.rightfinger5, 0.5585054F, -1.919862F, 0.0F);
/* 123 */     this.leftarmthing = new ayf(this, 40, 31);
/* 124 */     this.leftarmthing.a(-1.0F, 6.0F, -7.0F, 3, 3, 7);
/* 125 */     this.leftarmthing.a(5.0F, 0.0F, 0.0F);
/* 126 */     this.leftarmthing.b(64, 64);
/* 127 */     this.leftarmthing.i = true;
/* 128 */     setRotation(this.leftarmthing, -0.0349066F, 0.0F, 0.0F);
/* 129 */     this.lefthand = new ayf(this, 40, 42);
/* 130 */     this.lefthand.a(-1.0F, 7.0F, -10.0F, 3, 3, 3);
/* 131 */     this.lefthand.a(5.0F, 0.0F, 0.0F);
/* 132 */     this.lefthand.b(64, 64);
/* 133 */     this.lefthand.i = true;
/* 134 */     setRotation(this.lefthand, -0.0349066F, 0.0F, 0.0F);
/* 135 */     this.leftfinger1 = new ayf(this, 40, 16);
/* 136 */     this.leftfinger1.a(-1.0F, 12.0F, -6.4F, 1, 4, 1);
/* 137 */     this.leftfinger1.a(5.0F, 0.0F, 0.0F);
/* 138 */     this.leftfinger1.b(64, 64);
/* 139 */     this.leftfinger1.i = true;
/* 140 */     setRotation(this.leftfinger1, -0.3839724F, 0.0F, 0.0F);
/* 141 */     this.leftfinger2 = new ayf(this, 40, 16);
/* 142 */     this.leftfinger2.a(1.0F, 12.0F, -6.4F, 1, 3, 1);
/* 143 */     this.leftfinger2.a(5.0F, 0.0F, 0.0F);
/* 144 */     this.leftfinger2.b(64, 64);
/* 145 */     this.leftfinger2.i = true;
/* 146 */     setRotation(this.leftfinger2, -0.3839724F, 0.0F, 0.0F);
/* 147 */     this.jaw = new ayf(this, 29, 0);
/* 148 */     this.jaw.a(-3.0F, -4.0F, -5.0F, 6, 4, 6);
/* 149 */     this.jaw.a(0.0F, -6.0F, 0.0F);
/* 150 */     this.jaw.b(64, 64);
/* 151 */     this.jaw.i = true;
/* 152 */     setRotation(this.jaw, 0.2094395F, 0.0F, 0.0F);
/* 153 */     this.leftfinger3 = new ayf(this, 40, 16);
/* 154 */     this.leftfinger3.a(8.0F, 8.0F, 2.0F, 1, 5, 1);
/* 155 */     this.leftfinger3.a(5.0F, 0.0F, 0.0F);
/* 156 */     this.leftfinger3.b(64, 64);
/* 157 */     this.leftfinger3.i = true;
/* 158 */     setRotation(this.leftfinger3, -0.3839724F, 1.570796F, 0.0F);
/* 159 */     this.leftfinger4 = new ayf(this, 40, 16);
/* 160 */     this.leftfinger4.a(8.0F, 8.0F, -2.0F, 1, 4, 1);
/* 161 */     this.leftfinger4.a(5.0F, 0.0F, 0.0F);
/* 162 */     this.leftfinger4.b(64, 64);
/* 163 */     this.leftfinger4.i = true;
/* 164 */     setRotation(this.leftfinger4, 0.3839724F, 1.570796F, 0.0F);
/* 165 */     this.leftfinger5 = new ayf(this, 40, 16);
/* 166 */     this.leftfinger5.a(9.0F, 9.0F, -2.0F, 1, 3, 1);
/* 167 */     this.leftfinger5.a(5.0F, 0.0F, 0.0F);
/* 168 */     this.leftfinger5.b(64, 64);
/* 169 */     this.leftfinger5.i = true;
/* 170 */     setRotation(this.leftfinger5, 0.3839724F, 1.64061F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 175 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 176 */     a(f, f1, f2, f3, f4, f5, entity);
/* 177 */     this.head.a(f5);
/* 178 */     this.body.a(f5);
/* 179 */     this.rightarm.a(f5);
/* 180 */     this.leftarm.a(f5);
/* 181 */     this.rightleg.a(f5);
/* 182 */     this.leftleg.a(f5);
/* 183 */     this.neck.a(f5);
/* 184 */     this.rightarmthing.a(f5);
/* 185 */     this.righthand.a(f5);
/* 186 */     this.rightfinger1.a(f5);
/* 187 */     this.rightfinger2.a(f5);
/* 188 */     this.rightfinger3.a(f5);
/* 189 */     this.rightfinger4.a(f5);
/* 190 */     this.rightfinger5.a(f5);
/* 191 */     this.leftarmthing.a(f5);
/* 192 */     this.lefthand.a(f5);
/* 193 */     this.leftfinger1.a(f5);
/* 194 */     this.leftfinger2.a(f5);
/* 195 */     this.jaw.a(f5);
/* 196 */     this.leftfinger3.a(f5);
/* 197 */     this.leftfinger4.a(f5);
/* 198 */     this.leftfinger5.a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ayf model, float x, float y, float z) {
/* 203 */     model.f = x;
/* 204 */     model.g = y;
/* 205 */     model.h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float f, float f1, float f2, float f3, float f4, float f5, lq entity) {
/* 210 */     super.a(f, f1, f2, f3, f4, f5, entity);
/* 211 */     this.head.g = f3 / 57.295776F;
/* 212 */     this.head.f = f4 / 57.295776F;
/* 213 */     this.jaw.g = f3 / 57.295776F;
/* 214 */     this.jaw.f = f4 / 57.295776F;
/* 215 */     this.rightleg.f = ke.b(f * 0.6662F) * 1.4F * f1;
/* 216 */     this.leftleg.f = ke.b(f * 0.6662F + 3.1415927F) * 1.4F * f1;
/* 217 */     this.rightleg.g = 0.0F;
/* 218 */     this.leftleg.g = 0.0F;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel966.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */