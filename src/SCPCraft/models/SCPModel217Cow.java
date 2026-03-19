/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import ke;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ public class SCPModel217Cow
/*     */   extends axa
/*     */ {
/*     */   ayf head;
/*     */   ayf body;
/*     */   ayf leg1;
/*     */   ayf leg2;
/*     */   ayf leg3;
/*     */   ayf leg4;
/*     */   ayf horn1;
/*     */   ayf horn2;
/*     */   ayf udders;
/*     */   ayf pegleg;
/*     */   ayf thing1;
/*     */   ayf thing2;
/*     */   ayf thing3;
/*     */   ayf thing6;
/*     */   ayf udders1;
/*     */   ayf udders2;
/*     */   ayf udders3;
/*     */   ayf udders4;
/*     */   ayf udders5;
/*     */   ayf udders6;
/*     */   ayf thing4;
/*     */   ayf thing5;
/*     */   
/*     */   public SCPModel217Cow() {
/*  36 */     this.t = 64;
/*  37 */     this.u = 64;
/*     */     
/*  39 */     this.head = new ayf(this, 0, 0);
/*  40 */     this.head.a(-4.0F, -4.0F, -6.0F, 8, 8, 6);
/*  41 */     this.head.a(0.0F, 4.0F, -8.0F);
/*  42 */     this.head.b(64, 64);
/*  43 */     this.head.i = true;
/*  44 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  45 */     this.body = new ayf(this, 18, 4);
/*  46 */     this.body.a(-6.0F, -10.0F, -7.0F, 12, 18, 10);
/*  47 */     this.body.a(0.0F, 5.0F, 2.0F);
/*  48 */     this.body.b(64, 64);
/*  49 */     this.body.i = true;
/*  50 */     setRotation(this.body, 1.570796F, 0.0F, 0.0F);
/*  51 */     this.leg1 = new ayf(this, 0, 16);
/*  52 */     this.leg1.a(-3.0F, 0.0F, -2.0F, 4, 12, 4);
/*  53 */     this.leg1.a(-3.0F, 12.0F, 7.0F);
/*  54 */     this.leg1.b(64, 64);
/*  55 */     this.leg1.i = true;
/*  56 */     setRotation(this.leg1, 0.0F, 0.0F, 0.0F);
/*  57 */     this.leg2 = new ayf(this, 0, 16);
/*  58 */     this.leg2.a(-1.0F, 0.0F, -2.0F, 4, 12, 4);
/*  59 */     this.leg2.a(3.0F, 12.0F, 7.0F);
/*  60 */     this.leg2.b(64, 64);
/*  61 */     this.leg2.i = true;
/*  62 */     setRotation(this.leg2, 0.0F, 0.0F, 0.0F);
/*  63 */     this.leg3 = new ayf(this, 0, 16);
/*  64 */     this.leg3.a(-3.0F, 0.0F, -3.0F, 4, 2, 4);
/*  65 */     this.leg3.a(-3.0F, 12.0F, -5.0F);
/*  66 */     this.leg3.b(64, 64);
/*  67 */     this.leg3.i = true;
/*  68 */     setRotation(this.leg3, 0.0F, 0.0F, 0.0F);
/*  69 */     this.leg4 = new ayf(this, 0, 16);
/*  70 */     this.leg4.a(-1.0F, 0.0F, -3.0F, 4, 12, 4);
/*  71 */     this.leg4.a(3.0F, 12.0F, -5.0F);
/*  72 */     this.leg4.b(64, 64);
/*  73 */     this.leg4.i = true;
/*  74 */     setRotation(this.leg4, 0.0F, 0.0F, 0.0F);
/*  75 */     this.horn1 = new ayf(this, 22, 0);
/*  76 */     this.horn1.a(-4.0F, -5.0F, -4.0F, 1, 3, 1);
/*  77 */     this.horn1.a(0.0F, 3.0F, -7.0F);
/*  78 */     this.horn1.b(64, 64);
/*  79 */     this.horn1.i = true;
/*  80 */     setRotation(this.horn1, 0.0F, 0.0F, 0.0F);
/*  81 */     this.horn2 = new ayf(this, 22, 0);
/*  82 */     this.horn2.a(3.0F, -5.0F, -4.0F, 1, 3, 1);
/*  83 */     this.horn2.a(0.0F, 3.0F, -7.0F);
/*  84 */     this.horn2.b(64, 64);
/*  85 */     this.horn2.i = true;
/*  86 */     setRotation(this.horn2, 0.0F, 0.0F, 0.0F);
/*  87 */     this.udders = new ayf(this, 52, 0);
/*  88 */     this.udders.a(-2.0F, -3.0F, 0.0F, 4, 6, 2);
/*  89 */     this.udders.a(0.0F, 14.0F, 6.0F);
/*  90 */     this.udders.b(64, 64);
/*  91 */     this.udders.i = true;
/*  92 */     setRotation(this.udders, 1.570796F, 0.0F, 0.0F);
/*  93 */     this.pegleg = new ayf(this, 1, 34);
/*  94 */     this.pegleg.a(-2.0F, 2.0F, -2.0F, 2, 10, 2);
/*  95 */     this.pegleg.a(-3.0F, 12.0F, -5.0F);
/*  96 */     this.pegleg.b(64, 64);
/*  97 */     this.pegleg.i = true;
/*  98 */     setRotation(this.pegleg, 0.0F, 0.0F, 0.0F);
/*  99 */     this.thing1 = new ayf(this, 22, 0);
/* 100 */     this.thing1.a(-3.0F, -4.0F, -4.0F, 1, 1, 1);
/* 101 */     this.thing1.a(0.0F, 3.0F, -7.0F);
/* 102 */     this.thing1.b(64, 64);
/* 103 */     this.thing1.i = true;
/* 104 */     setRotation(this.thing1, 0.0F, 0.0F, 0.0F);
/* 105 */     this.thing2 = new ayf(this, 22, 0);
/* 106 */     this.thing2.a(2.0F, -4.0F, -4.0F, 1, 1, 1);
/* 107 */     this.thing2.a(0.0F, 3.0F, -7.0F);
/* 108 */     this.thing2.b(64, 64);
/* 109 */     this.thing2.i = true;
/* 110 */     setRotation(this.thing2, 0.0F, 0.0F, 0.0F);
/* 111 */     this.thing3 = new ayf(this, 22, 0);
/* 112 */     this.thing3.a(-5.0F, -4.0F, -4.0F, 1, 3, 1);
/* 113 */     this.thing3.a(0.0F, 3.0F, -7.0F);
/* 114 */     this.thing3.b(64, 64);
/* 115 */     this.thing3.i = true;
/* 116 */     setRotation(this.thing3, 0.0F, 0.0F, 0.0F);
/* 117 */     this.thing6 = new ayf(this, 22, 0);
/* 118 */     this.thing6.a(-6.0F, -3.0F, -4.0F, 1, 1, 1);
/* 119 */     this.thing6.a(0.0F, 3.0F, -7.0F);
/* 120 */     this.thing6.b(64, 64);
/* 121 */     this.thing6.i = true;
/* 122 */     setRotation(this.thing6, 0.0F, 0.0F, 0.0F);
/* 123 */     this.udders1 = new ayf(this, 52, 0);
/* 124 */     this.udders1.a(-3.0F, -3.0F, 0.0F, 1, 1, 2);
/* 125 */     this.udders1.a(0.0F, 14.0F, 6.0F);
/* 126 */     this.udders1.b(64, 64);
/* 127 */     this.udders1.i = true;
/* 128 */     setRotation(this.udders1, 1.570796F, 0.0F, 0.0F);
/* 129 */     this.udders2 = new ayf(this, 52, 0);
/* 130 */     this.udders2.a(-1.0F, -4.0F, 0.0F, 1, 1, 2);
/* 131 */     this.udders2.a(0.0F, 14.0F, 6.0F);
/* 132 */     this.udders2.b(64, 64);
/* 133 */     this.udders2.i = true;
/* 134 */     setRotation(this.udders2, 1.570796F, 0.0F, 0.0F);
/* 135 */     this.udders3 = new ayf(this, 52, 0);
/* 136 */     this.udders3.a(1.0F, -4.0F, 0.0F, 1, 1, 2);
/* 137 */     this.udders3.a(0.0F, 14.0F, 6.0F);
/* 138 */     this.udders3.b(64, 64);
/* 139 */     this.udders3.i = true;
/* 140 */     setRotation(this.udders3, 1.570796F, 0.0F, 0.0F);
/* 141 */     this.udders4 = new ayf(this, 52, 0);
/* 142 */     this.udders4.a(2.0F, -2.0F, 0.0F, 1, 1, 2);
/* 143 */     this.udders4.a(0.0F, 14.0F, 6.0F);
/* 144 */     this.udders4.b(64, 64);
/* 145 */     this.udders4.i = true;
/* 146 */     setRotation(this.udders4, 1.570796F, 0.0F, 0.0F);
/* 147 */     this.udders5 = new ayf(this, 52, 0);
/* 148 */     this.udders5.a(-2.0F, 3.0F, 0.0F, 1, 1, 2);
/* 149 */     this.udders5.a(0.0F, 14.0F, 6.0F);
/* 150 */     this.udders5.b(64, 64);
/* 151 */     this.udders5.i = true;
/* 152 */     setRotation(this.udders5, 1.570796F, 0.0F, 0.0F);
/* 153 */     this.udders6 = new ayf(this, 52, 0);
/* 154 */     this.udders6.a(0.0F, 3.0F, 0.0F, 1, 1, 2);
/* 155 */     this.udders6.a(0.0F, 14.0F, 6.0F);
/* 156 */     this.udders6.b(64, 64);
/* 157 */     this.udders6.i = true;
/* 158 */     setRotation(this.udders6, 1.570796F, 0.0F, 0.0F);
/* 159 */     this.thing4 = new ayf(this, 22, 0);
/* 160 */     this.thing4.a(4.0F, -4.0F, -4.0F, 1, 3, 1);
/* 161 */     this.thing4.a(0.0F, 3.0F, -7.0F);
/* 162 */     this.thing4.b(64, 64);
/* 163 */     this.thing4.i = true;
/* 164 */     setRotation(this.thing4, 0.0F, 0.0F, 0.0F);
/* 165 */     this.thing5 = new ayf(this, 22, 0);
/* 166 */     this.thing5.a(5.0F, -3.0F, -4.0F, 1, 1, 1);
/* 167 */     this.thing5.a(0.0F, 3.0F, -7.0F);
/* 168 */     this.thing5.b(64, 64);
/* 169 */     this.thing5.i = true;
/* 170 */     setRotation(this.thing5, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 175 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 176 */     a(f, f1, f2, f3, f4, f5, entity);
/* 177 */     this.head.a(f5);
/* 178 */     this.body.a(f5);
/* 179 */     this.leg1.a(f5);
/* 180 */     this.leg2.a(f5);
/* 181 */     this.leg3.a(f5);
/* 182 */     this.leg4.a(f5);
/* 183 */     this.horn1.a(f5);
/* 184 */     this.horn2.a(f5);
/* 185 */     this.udders.a(f5);
/* 186 */     this.pegleg.a(f5);
/* 187 */     this.thing1.a(f5);
/* 188 */     this.thing2.a(f5);
/* 189 */     this.thing3.a(f5);
/* 190 */     this.thing6.a(f5);
/* 191 */     this.udders1.a(f5);
/* 192 */     this.udders2.a(f5);
/* 193 */     this.udders3.a(f5);
/* 194 */     this.udders4.a(f5);
/* 195 */     this.udders5.a(f5);
/* 196 */     this.udders6.a(f5);
/* 197 */     this.thing4.a(f5);
/* 198 */     this.thing5.a(f5);
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
/* 211 */     this.head.f = f4 / 57.295776F;
/* 212 */     this.head.g = f3 / 57.295776F;
/* 213 */     this.horn1.f = f4 / 57.295776F;
/* 214 */     this.horn1.g = f3 / 57.295776F;
/* 215 */     this.horn2.f = f4 / 57.295776F;
/* 216 */     this.horn2.g = f3 / 57.295776F;
/* 217 */     this.thing1.f = f4 / 57.295776F;
/* 218 */     this.thing1.g = f3 / 57.295776F;
/* 219 */     this.thing2.f = f4 / 57.295776F;
/* 220 */     this.thing2.g = f3 / 57.295776F;
/* 221 */     this.thing3.f = f4 / 57.295776F;
/* 222 */     this.thing3.g = f3 / 57.295776F;
/* 223 */     this.thing4.f = f4 / 57.295776F;
/* 224 */     this.thing4.g = f3 / 57.295776F;
/* 225 */     this.thing5.f = f4 / 57.295776F;
/* 226 */     this.thing5.g = f3 / 57.295776F;
/* 227 */     this.thing6.f = f4 / 57.295776F;
/* 228 */     this.thing6.g = f3 / 57.295776F;
/* 229 */     this.leg1.f = ke.b(f * 0.6662F) * 1.4F * f1;
/* 230 */     this.leg2.f = ke.b(f * 0.6662F + 3.1415927F) * 1.4F * f1;
/* 231 */     this.leg3.f = ke.b(f * 0.6662F + 3.1415927F) * 1.4F * f1;
/* 232 */     this.leg4.f = ke.b(f * 0.6662F) * 1.4F * f1;
/* 233 */     this.pegleg.f = ke.b(f * 0.6662F + 3.1415927F) * 1.4F * f1;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel217Cow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */