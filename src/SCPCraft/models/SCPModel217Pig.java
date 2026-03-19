/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import ke;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ public class SCPModel217Pig
/*     */   extends axa
/*     */ {
/*     */   ayf head;
/*     */   ayf body;
/*     */   ayf leg1;
/*     */   ayf leg2;
/*     */   ayf leg3;
/*     */   ayf leg4;
/*     */   ayf Leg4Extension;
/*     */   ayf Leg4Foot;
/*     */   ayf Nose;
/*     */   ayf Noserim1;
/*     */   ayf Noserim2;
/*     */   ayf Noserim3;
/*     */   ayf Noserim4;
/*     */   ayf Noserim5;
/*     */   ayf Noserim6;
/*     */   ayf BigRim1;
/*     */   ayf LittleRim;
/*     */   ayf LittleRim1;
/*     */   ayf LittleRim2;
/*     */   ayf LittleRim3;
/*     */   ayf Leg4Pipe;
/*     */   ayf bodypart1;
/*     */   ayf bodypart2;
/*     */   ayf Flesh1;
/*     */   ayf Flesh2;
/*     */   ayf Pipe;
/*     */   
/*     */   public SCPModel217Pig() {
/*  40 */     this.t = 64;
/*  41 */     this.u = 64;
/*     */     
/*  43 */     this.head = new ayf(this, 0, 0);
/*  44 */     this.head.a(-4.0F, -4.0F, -8.0F, 8, 8, 8);
/*  45 */     this.head.a(0.0F, 12.0F, -6.0F);
/*  46 */     this.head.b(64, 64);
/*  47 */     this.head.i = true;
/*  48 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  49 */     this.body = new ayf(this, 28, 8);
/*  50 */     this.body.a(-2.0F, -10.0F, -7.0F, 7, 16, 8);
/*  51 */     this.body.a(0.0F, 11.0F, 3.0F);
/*  52 */     this.body.b(64, 64);
/*  53 */     this.body.i = true;
/*  54 */     setRotation(this.body, 1.570796F, 0.0F, 0.0F);
/*  55 */     this.leg1 = new ayf(this, 0, 16);
/*  56 */     this.leg1.a(-2.0F, 0.0F, -2.0F, 4, 6, 4);
/*  57 */     this.leg1.a(-3.0F, 18.0F, 7.0F);
/*  58 */     this.leg1.b(64, 64);
/*  59 */     this.leg1.i = true;
/*  60 */     setRotation(this.leg1, 0.0F, 0.0F, 0.0F);
/*  61 */     this.leg2 = new ayf(this, 0, 16);
/*  62 */     this.leg2.a(-2.0F, 0.0F, -2.0F, 4, 6, 4);
/*  63 */     this.leg2.a(3.0F, 18.0F, 7.0F);
/*  64 */     this.leg2.b(64, 64);
/*  65 */     this.leg2.i = true;
/*  66 */     setRotation(this.leg2, 0.0F, 0.0F, 0.0F);
/*  67 */     this.leg3 = new ayf(this, 0, 16);
/*  68 */     this.leg3.a(-2.0F, 0.0F, -2.0F, 4, 6, 4);
/*  69 */     this.leg3.a(-3.0F, 18.0F, -5.0F);
/*  70 */     this.leg3.b(64, 64);
/*  71 */     this.leg3.i = true;
/*  72 */     setRotation(this.leg3, 0.0F, 0.0F, 0.0F);
/*  73 */     this.leg4 = new ayf(this, 1, 57);
/*  74 */     this.leg4.a(-2.0F, 0.0F, -2.0F, 4, 2, 4);
/*  75 */     this.leg4.a(3.0F, 18.0F, -5.0F);
/*  76 */     this.leg4.b(64, 64);
/*  77 */     this.leg4.i = true;
/*  78 */     setRotation(this.leg4, 0.0F, 0.0F, 0.0F);
/*  79 */     this.Leg4Extension = new ayf(this, 18, 55);
/*  80 */     this.Leg4Extension.a(1.0F, 2.0F, -2.0F, 1, 4, 4);
/*  81 */     this.Leg4Extension.a(3.0F, 18.0F, -5.0F);
/*  82 */     this.Leg4Extension.b(64, 64);
/*  83 */     this.Leg4Extension.i = true;
/*  84 */     setRotation(this.Leg4Extension, 0.0F, 0.0F, 0.0F);
/*  85 */     this.Leg4Foot = new ayf(this, 29, 58);
/*  86 */     this.Leg4Foot.a(-2.0F, 5.0F, -2.0F, 3, 1, 4);
/*  87 */     this.Leg4Foot.a(3.0F, 18.0F, -5.0F);
/*  88 */     this.Leg4Foot.b(64, 64);
/*  89 */     this.Leg4Foot.i = true;
/*  90 */     setRotation(this.Leg4Foot, 0.0F, 0.0F, 0.0F);
/*  91 */     this.Nose = new ayf(this, 2, 37);
/*  92 */     this.Nose.a(-2.0F, 0.0F, -9.0F, 4, 3, 1);
/*  93 */     this.Nose.a(0.0F, 12.0F, -6.0F);
/*  94 */     this.Nose.b(64, 64);
/*  95 */     this.Nose.i = true;
/*  96 */     setRotation(this.Nose, 0.0F, 0.0F, 0.0F);
/*  97 */     this.Noserim1 = new ayf(this, 5, 34);
/*  98 */     this.Noserim1.a(2.0F, 1.0F, -9.0F, 1, 1, 1);
/*  99 */     this.Noserim1.a(0.0F, 12.0F, -6.0F);
/* 100 */     this.Noserim1.b(64, 64);
/* 101 */     this.Noserim1.i = true;
/* 102 */     setRotation(this.Noserim1, 0.0F, 0.0F, 0.0F);
/* 103 */     this.Noserim2 = new ayf(this, 5, 34);
/* 104 */     this.Noserim2.a(-3.0F, 1.0F, -9.0F, 1, 1, 1);
/* 105 */     this.Noserim2.a(0.0F, 12.0F, -6.0F);
/* 106 */     this.Noserim2.b(64, 64);
/* 107 */     this.Noserim2.i = true;
/* 108 */     setRotation(this.Noserim2, 0.0F, 0.0F, 0.0F);
/* 109 */     this.Noserim3 = new ayf(this, 5, 34);
/* 110 */     this.Noserim3.a(-1.0F, 3.0F, -9.0F, 1, 1, 1);
/* 111 */     this.Noserim3.a(0.0F, 12.0F, -6.0F);
/* 112 */     this.Noserim3.b(64, 64);
/* 113 */     this.Noserim3.i = true;
/* 114 */     setRotation(this.Noserim3, 0.0F, 0.0F, 0.0F);
/* 115 */     this.Noserim4 = new ayf(this, 5, 34);
/* 116 */     this.Noserim4.a(0.0F, 3.0F, -9.0F, 1, 1, 1);
/* 117 */     this.Noserim4.a(0.0F, 12.0F, -6.0F);
/* 118 */     this.Noserim4.b(64, 64);
/* 119 */     this.Noserim4.i = true;
/* 120 */     setRotation(this.Noserim4, 0.0F, 0.0F, 0.0F);
/* 121 */     this.Noserim5 = new ayf(this, 5, 34);
/* 122 */     this.Noserim5.a(0.0F, -1.0F, -9.0F, 1, 1, 1);
/* 123 */     this.Noserim5.a(0.0F, 12.0F, -6.0F);
/* 124 */     this.Noserim5.b(64, 64);
/* 125 */     this.Noserim5.i = true;
/* 126 */     setRotation(this.Noserim5, 0.0F, 0.0F, 0.0F);
/* 127 */     this.Noserim6 = new ayf(this, 5, 34);
/* 128 */     this.Noserim6.a(-1.0F, -1.0F, -9.0F, 1, 1, 1);
/* 129 */     this.Noserim6.a(0.0F, 12.0F, -6.0F);
/* 130 */     this.Noserim6.b(64, 64);
/* 131 */     this.Noserim6.i = true;
/* 132 */     setRotation(this.Noserim6, 0.0F, 0.0F, 0.0F);
/* 133 */     this.BigRim1 = new ayf(this, 17, 27);
/* 134 */     this.BigRim1.a(3.0F, -2.0F, 1.0F, 4, 4, 1);
/* 135 */     this.BigRim1.a(0.0F, 11.0F, 3.0F);
/* 136 */     this.BigRim1.b(64, 64);
/* 137 */     this.BigRim1.i = true;
/* 138 */     setRotation(this.BigRim1, 0.0F, 0.0F, 0.0F);
/* 139 */     this.LittleRim = new ayf(this, 5, 34);
/* 140 */     this.LittleRim.a(4.0F, -3.0F, 1.0F, 1, 1, 1);
/* 141 */     this.LittleRim.a(0.0F, 11.0F, 3.0F);
/* 142 */     this.LittleRim.b(64, 64);
/* 143 */     this.LittleRim.i = true;
/* 144 */     setRotation(this.LittleRim, 0.0F, 0.0F, 0.0F);
/* 145 */     this.LittleRim1 = new ayf(this, 5, 34);
/* 146 */     this.LittleRim1.a(6.0F, -3.0F, 1.0F, 1, 1, 1);
/* 147 */     this.LittleRim1.a(0.0F, 11.0F, 3.0F);
/* 148 */     this.LittleRim1.b(64, 64);
/* 149 */     this.LittleRim1.i = true;
/* 150 */     setRotation(this.LittleRim1, 0.0F, 0.0F, 0.0F);
/* 151 */     this.LittleRim2 = new ayf(this, 5, 34);
/* 152 */     this.LittleRim2.a(7.0F, -2.0F, 1.0F, 1, 1, 1);
/* 153 */     this.LittleRim2.a(0.0F, 11.0F, 3.0F);
/* 154 */     this.LittleRim2.b(64, 64);
/* 155 */     this.LittleRim2.i = true;
/* 156 */     setRotation(this.LittleRim2, 0.0F, 0.0F, 0.0F);
/* 157 */     this.LittleRim3 = new ayf(this, 5, 34);
/* 158 */     this.LittleRim3.a(7.0F, 0.0F, 1.0F, 1, 1, 1);
/* 159 */     this.LittleRim3.a(0.0F, 11.0F, 3.0F);
/* 160 */     this.LittleRim3.b(64, 64);
/* 161 */     this.LittleRim3.i = true;
/* 162 */     setRotation(this.LittleRim3, 0.0F, 0.0F, 0.0F);
/* 163 */     this.Leg4Pipe = new ayf(this, 2, 51);
/* 164 */     this.Leg4Pipe.a(-1.0F, 2.0F, -1.0F, 1, 3, 2);
/* 165 */     this.Leg4Pipe.a(3.0F, 18.0F, -5.0F);
/* 166 */     this.Leg4Pipe.b(64, 64);
/* 167 */     this.Leg4Pipe.i = true;
/* 168 */     setRotation(this.Leg4Pipe, 0.0F, 0.0F, 0.0F);
/* 169 */     this.bodypart1 = new ayf(this, 13, 40);
/* 170 */     this.bodypart1.a(-5.0F, -1.0F, 0.0F, 3, 8, 6);
/* 171 */     this.bodypart1.a(0.0F, 11.0F, 3.0F);
/* 172 */     this.bodypart1.b(64, 64);
/* 173 */     this.bodypart1.i = true;
/* 174 */     setRotation(this.bodypart1, 0.0F, 0.0F, 0.0F);
/* 175 */     this.bodypart2 = new ayf(this, 47, 50);
/* 176 */     this.bodypart2.a(-5.0F, -1.0F, -10.0F, 3, 8, 5);
/* 177 */     this.bodypart2.a(0.0F, 11.0F, 3.0F);
/* 178 */     this.bodypart2.b(64, 64);
/* 179 */     this.bodypart2.i = true;
/* 180 */     setRotation(this.bodypart2, 0.0F, 0.0F, 0.0F);
/* 181 */     this.Flesh1 = new ayf(this, 32, 33);
/* 182 */     this.Flesh1.a(-5.0F, -1.0F, -5.0F, 3, 3, 5);
/* 183 */     this.Flesh1.a(0.0F, 11.0F, 3.0F);
/* 184 */     this.Flesh1.b(64, 64);
/* 185 */     this.Flesh1.i = true;
/* 186 */     setRotation(this.Flesh1, 0.0F, 0.0F, 0.0F);
/* 187 */     this.Flesh2 = new ayf(this, 47, 42);
/* 188 */     this.Flesh2.a(-5.0F, 5.0F, -5.0F, 3, 2, 5);
/* 189 */     this.Flesh2.a(0.0F, 11.0F, 3.0F);
/* 190 */     this.Flesh2.b(64, 64);
/* 191 */     this.Flesh2.i = true;
/* 192 */     setRotation(this.Flesh2, 0.0F, 0.0F, 0.0F);
/* 193 */     this.Pipe = new ayf(this, 15, 33);
/* 194 */     this.Pipe.a(-4.0F, 3.0F, -5.0F, 1, 1, 5);
/* 195 */     this.Pipe.a(0.0F, 11.0F, 3.0F);
/* 196 */     this.Pipe.b(64, 64);
/* 197 */     this.Pipe.i = true;
/* 198 */     setRotation(this.Pipe, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 203 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 204 */     a(f, f1, f2, f3, f4, f5, entity);
/* 205 */     this.head.a(f5);
/* 206 */     this.body.a(f5);
/* 207 */     this.leg1.a(f5);
/* 208 */     this.leg2.a(f5);
/* 209 */     this.leg3.a(f5);
/* 210 */     this.leg4.a(f5);
/* 211 */     this.Leg4Extension.a(f5);
/* 212 */     this.Leg4Foot.a(f5);
/* 213 */     this.Nose.a(f5);
/* 214 */     this.Noserim1.a(f5);
/* 215 */     this.Noserim2.a(f5);
/* 216 */     this.Noserim3.a(f5);
/* 217 */     this.Noserim4.a(f5);
/* 218 */     this.Noserim5.a(f5);
/* 219 */     this.Noserim6.a(f5);
/* 220 */     this.BigRim1.a(f5);
/* 221 */     this.LittleRim.a(f5);
/* 222 */     this.LittleRim1.a(f5);
/* 223 */     this.LittleRim2.a(f5);
/* 224 */     this.LittleRim3.a(f5);
/* 225 */     this.Leg4Pipe.a(f5);
/* 226 */     this.bodypart1.a(f5);
/* 227 */     this.bodypart2.a(f5);
/* 228 */     this.Flesh1.a(f5);
/* 229 */     this.Flesh2.a(f5);
/* 230 */     this.Pipe.a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ayf model, float x, float y, float z) {
/* 235 */     model.f = x;
/* 236 */     model.g = y;
/* 237 */     model.h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float f, float f1, float f2, float f3, float f4, float f5, lq entity) {
/* 242 */     super.a(f, f1, f2, f3, f4, f5, entity);
/* 243 */     this.head.f = f4 / 57.295776F;
/* 244 */     this.head.g = f3 / 57.295776F;
/* 245 */     this.body.f = 1.5707964F;
/* 246 */     this.leg1.f = ke.b(f * 0.6662F) * 1.4F * f1;
/* 247 */     this.leg2.f = ke.b(f * 0.6662F + 3.1415927F) * 1.4F * f1;
/* 248 */     this.leg3.f = ke.b(f * 0.6662F + 3.1415927F) * 1.4F * f1;
/* 249 */     this.leg4.f = ke.b(f * 0.6662F) * 1.4F * f1;
/* 250 */     this.Leg4Extension.f = ke.b(f * 0.6662F) * 1.4F * f1;
/* 251 */     this.Leg4Foot.f = ke.b(f * 0.6662F) * 1.4F * f1;
/* 252 */     this.Noserim1.f = f4 / 57.295776F;
/* 253 */     this.Noserim2.f = f4 / 57.295776F;
/* 254 */     this.Noserim3.f = f4 / 57.295776F;
/* 255 */     this.Noserim4.f = f4 / 57.295776F;
/* 256 */     this.Noserim5.f = f4 / 57.295776F;
/* 257 */     this.Noserim6.f = f4 / 57.295776F;
/* 258 */     this.Noserim1.g = f3 / 57.295776F;
/* 259 */     this.Noserim2.g = f3 / 57.295776F;
/* 260 */     this.Noserim3.g = f3 / 57.295776F;
/* 261 */     this.Noserim4.g = f3 / 57.295776F;
/* 262 */     this.Noserim5.g = f3 / 57.295776F;
/* 263 */     this.Noserim6.g = f3 / 57.295776F;
/* 264 */     this.Nose.f = f4 / 57.295776F;
/* 265 */     this.Nose.g = f3 / 57.295776F;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel217Pig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */