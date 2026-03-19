/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import ke;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ public class SCPModel629
/*     */   extends axa
/*     */ {
/*     */   ayf backhead;
/*     */   ayf body;
/*     */   ayf shoulderleft;
/*     */   ayf shoulderright;
/*     */   ayf brassdick;
/*     */   ayf neck;
/*     */   ayf skeleton;
/*     */   ayf brasspipe;
/*     */   ayf leftleg;
/*     */   ayf rightleg;
/*     */   ayf leftfoot;
/*     */   ayf rightfoot;
/*     */   ayf eye1;
/*     */   ayf eye2;
/*     */   ayf armleft;
/*     */   ayf armright;
/*     */   ayf wrenchleft;
/*     */   ayf wrenchleft2;
/*     */   ayf wrenchright;
/*     */   ayf wrenchright2;
/*     */   ayf nose;
/*     */   ayf mouthpipe;
/*     */   ayf mouth;
/*     */   ayf eyepipe1;
/*     */   ayf eyepipe2;
/*     */   ayf plate1;
/*     */   public boolean Armed;
/*     */   
/*     */   public SCPModel629() {
/*  41 */     this.Armed = false;
/*  42 */     this.t = 64;
/*  43 */     this.u = 64;
/*     */     
/*  45 */     this.backhead = new ayf(this, 25, 5);
/*  46 */     this.backhead.a(-3.0F, -6.0F, 2.0F, 6, 6, 1);
/*  47 */     this.backhead.a(0.0F, 3.0F, 0.0F);
/*  48 */     this.backhead.b(64, 64);
/*  49 */     this.backhead.i = true;
/*  50 */     setRotation(this.backhead, 0.122173F, 0.0F, 0.0F);
/*  51 */     this.body = new ayf(this, 21, 21);
/*  52 */     this.body.a(-2.0F, 4.0F, -3.0F, 4, 7, 6);
/*  53 */     this.body.a(0.0F, 3.0F, 0.0F);
/*  54 */     this.body.b(64, 64);
/*  55 */     this.body.i = true;
/*  56 */     setRotation(this.body, 0.0349066F, 0.0F, 0.0F);
/*  57 */     this.shoulderleft = new ayf(this, 14, 21);
/*  58 */     this.shoulderleft.a(-1.0F, -1.0F, -1.0F, 1, 2, 2);
/*  59 */     this.shoulderleft.a(-2.0F, 10.0F, 0.0F);
/*  60 */     this.shoulderleft.b(64, 64);
/*  61 */     this.shoulderleft.i = true;
/*  62 */     setRotation(this.shoulderleft, 0.0F, 0.0F, 0.0F);
/*  63 */     this.shoulderright = new ayf(this, 42, 21);
/*  64 */     this.shoulderright.a(0.0F, -1.0F, -1.0F, 1, 2, 2);
/*  65 */     this.shoulderright.a(2.0F, 10.0F, 0.0F);
/*  66 */     this.shoulderright.b(64, 64);
/*  67 */     this.shoulderright.i = true;
/*  68 */     setRotation(this.shoulderright, 0.0F, 0.0F, 0.0F);
/*  69 */     this.brassdick = new ayf(this, 25, 35);
/*  70 */     this.brassdick.a(-1.0F, 11.0F, -2.0F, 2, 1, 4);
/*  71 */     this.brassdick.a(0.0F, 3.0F, 0.0F);
/*  72 */     this.brassdick.b(64, 64);
/*  73 */     this.brassdick.i = true;
/*  74 */     setRotation(this.brassdick, 0.0F, 0.0F, 0.0F);
/*  75 */     this.neck = new ayf(this, 29, 13);
/*  76 */     this.neck.a(-1.0F, -2.0F, 1.0F, 2, 6, 1);
/*  77 */     this.neck.a(0.0F, 3.0F, 0.0F);
/*  78 */     this.neck.b(64, 64);
/*  79 */     this.neck.i = true;
/*  80 */     setRotation(this.neck, 0.0F, 0.0F, 0.0F);
/*  81 */     this.skeleton = new ayf(this, 23, 0);
/*  82 */     this.skeleton.a(-3.0F, -6.0F, -1.0F, 6, 1, 3);
/*  83 */     this.skeleton.a(0.0F, 3.0F, 0.0F);
/*  84 */     this.skeleton.b(64, 64);
/*  85 */     this.skeleton.i = true;
/*  86 */     setRotation(this.skeleton, 0.122173F, 0.0F, 0.0F);
/*  87 */     this.brasspipe = new ayf(this, 27, 41);
/*  88 */     this.brasspipe.a(-1.0F, 12.0F, -1.0F, 2, 3, 2);
/*  89 */     this.brasspipe.a(0.0F, 3.0F, 0.0F);
/*  90 */     this.brasspipe.b(64, 64);
/*  91 */     this.brasspipe.i = true;
/*  92 */     setRotation(this.brasspipe, 0.0F, 0.0F, 0.0F);
/*  93 */     this.leftleg = new ayf(this, 18, 44);
/*  94 */     this.leftleg.a(-2.0F, 0.0F, -1.0F, 2, 2, 2);
/*  95 */     this.leftleg.a(-1.0F, 17.0F, 0.0F);
/*  96 */     this.leftleg.b(64, 64);
/*  97 */     this.leftleg.i = true;
/*  98 */     setRotation(this.leftleg, -0.715585F, 0.0F, 0.0F);
/*  99 */     this.rightleg = new ayf(this, 36, 44);
/* 100 */     this.rightleg.a(0.0F, 0.0F, -1.0F, 2, 2, 2);
/* 101 */     this.rightleg.a(1.0F, 17.0F, 0.0F);
/* 102 */     this.rightleg.b(64, 64);
/* 103 */     this.rightleg.i = true;
/* 104 */     setRotation(this.rightleg, -0.715585F, 0.0F, 0.0F);
/* 105 */     this.leftfoot = new ayf(this, 18, 49);
/* 106 */     this.leftfoot.a(-2.0F, 2.0F, -2.5F, 2, 5, 2);
/* 107 */     this.leftfoot.a(-1.0F, 17.0F, 0.0F);
/* 108 */     this.leftfoot.b(64, 64);
/* 109 */     this.leftfoot.i = true;
/* 110 */     setRotation(this.leftfoot, 0.0F, 0.0F, 0.0F);
/* 111 */     this.rightfoot = new ayf(this, 36, 49);
/* 112 */     this.rightfoot.a(0.0F, 2.0F, -2.5F, 2, 5, 2);
/* 113 */     this.rightfoot.a(1.0F, 17.0F, 0.0F);
/* 114 */     this.rightfoot.b(64, 64);
/* 115 */     this.rightfoot.i = true;
/* 116 */     setRotation(this.rightfoot, 0.0F, 0.0F, 0.0F);
/* 117 */     this.eye1 = new ayf(this, 10, 46);
/* 118 */     this.eye1.a(-3.0F, -4.0F, -3.0F, 2, 2, 1);
/* 119 */     this.eye1.a(0.0F, 3.0F, 0.0F);
/* 120 */     this.eye1.b(64, 64);
/* 121 */     this.eye1.i = true;
/* 122 */     setRotation(this.eye1, 0.0F, 0.0F, 0.0F);
/* 123 */     this.eye2 = new ayf(this, 47, 45);
/* 124 */     this.eye2.a(1.0F, -4.0F, -3.0F, 2, 2, 1);
/* 125 */     this.eye2.a(0.0F, 3.0F, 0.0F);
/* 126 */     this.eye2.b(64, 64);
/* 127 */     this.eye2.i = true;
/* 128 */     setRotation(this.eye2, 0.0F, 0.0F, 0.0F);
/* 129 */     this.armleft = new ayf(this, 14, 26);
/* 130 */     this.armleft.a(-2.0F, 0.0F, -1.0F, 1, 6, 2);
/* 131 */     this.armleft.a(-2.0F, 10.0F, 0.0F);
/* 132 */     this.armleft.b(64, 64);
/* 133 */     this.armleft.i = true;
/* 134 */     setRotation(this.armleft, 0.0F, 0.0F, 0.0F);
/* 135 */     this.armright = new ayf(this, 42, 26);
/* 136 */     this.armright.a(1.0F, 0.0F, -1.0F, 1, 6, 2);
/* 137 */     this.armright.a(2.0F, 10.0F, 0.0F);
/* 138 */     this.armright.b(64, 64);
/* 139 */     this.armright.i = true;
/* 140 */     setRotation(this.armright, 0.0F, 0.0F, 0.0F);
/* 141 */     this.wrenchleft = new ayf(this, 9, 28);
/* 142 */     this.wrenchleft.a(-2.0F, 5.0F, -2.0F, 1, 2, 1);
/* 143 */     this.wrenchleft.a(-2.0F, 10.0F, 0.0F);
/* 144 */     this.wrenchleft.b(64, 64);
/* 145 */     this.wrenchleft.i = true;
/* 146 */     setRotation(this.wrenchleft, 0.0F, 0.0F, 0.0F);
/* 147 */     this.wrenchleft2 = new ayf(this, 9, 28);
/* 148 */     this.wrenchleft2.a(-2.0F, 5.0F, 1.0F, 1, 2, 1);
/* 149 */     this.wrenchleft2.a(-2.0F, 10.0F, 0.0F);
/* 150 */     this.wrenchleft2.b(64, 64);
/* 151 */     this.wrenchleft2.i = true;
/* 152 */     setRotation(this.wrenchleft2, 0.0F, 0.0F, 0.0F);
/* 153 */     this.wrenchright = new ayf(this, 9, 28);
/* 154 */     this.wrenchright.a(1.0F, 5.0F, -2.0F, 1, 2, 1);
/* 155 */     this.wrenchright.a(2.0F, 10.0F, 0.0F);
/* 156 */     this.wrenchright.b(64, 64);
/* 157 */     this.wrenchright.i = true;
/* 158 */     setRotation(this.wrenchright, 0.0F, 0.0F, 0.0F);
/* 159 */     this.wrenchright2 = new ayf(this, 9, 28);
/* 160 */     this.wrenchright2.a(1.0F, 5.0F, 1.0F, 1, 2, 1);
/* 161 */     this.wrenchright2.a(2.0F, 10.0F, 0.0F);
/* 162 */     this.wrenchright2.b(64, 64);
/* 163 */     this.wrenchright2.i = true;
/* 164 */     setRotation(this.wrenchright2, 0.0F, 0.0F, 0.0F);
/* 165 */     this.nose = new ayf(this, 1, 50);
/* 166 */     this.nose.a(-1.0F, -2.0F, -3.0F, 2, 1, 4);
/* 167 */     this.nose.a(0.0F, 3.0F, 0.0F);
/* 168 */     this.nose.b(64, 64);
/* 169 */     this.nose.i = true;
/* 170 */     setRotation(this.nose, 0.0F, 0.0F, 0.0F);
/* 171 */     this.mouthpipe = new ayf(this, 1, 14);
/* 172 */     this.mouthpipe.a(-1.0F, 0.0F, -2.0F, 2, 1, 3);
/* 173 */     this.mouthpipe.a(0.0F, 3.0F, 0.0F);
/* 174 */     this.mouthpipe.b(64, 64);
/* 175 */     this.mouthpipe.i = true;
/* 176 */     setRotation(this.mouthpipe, 0.0F, 0.0F, 0.0F);
/* 177 */     this.mouth = new ayf(this, 1, 56);
/* 178 */     this.mouth.a(-1.0F, 0.0F, -3.0F, 2, 2, 1);
/* 179 */     this.mouth.a(0.0F, 3.0F, 0.0F);
/* 180 */     this.mouth.b(64, 64);
/* 181 */     this.mouth.i = true;
/* 182 */     setRotation(this.mouth, 0.0F, 0.0F, 0.0F);
/* 183 */     this.eyepipe1 = new ayf(this, 1, 45);
/* 184 */     this.eyepipe1.a(-2.0F, -3.0F, -2.0F, 1, 1, 3);
/* 185 */     this.eyepipe1.a(0.0F, 3.0F, 0.0F);
/* 186 */     this.eyepipe1.b(64, 64);
/* 187 */     this.eyepipe1.i = true;
/* 188 */     setRotation(this.eyepipe1, 0.0F, 0.0F, 0.0F);
/* 189 */     this.eyepipe2 = new ayf(this, 54, 44);
/* 190 */     this.eyepipe2.a(1.0F, -3.0F, -2.0F, 1, 1, 3);
/* 191 */     this.eyepipe2.a(0.0F, 3.0F, 0.0F);
/* 192 */     this.eyepipe2.b(64, 64);
/* 193 */     this.eyepipe2.i = true;
/* 194 */     setRotation(this.eyepipe2, 0.0F, 0.0F, 0.0F);
/* 195 */     this.plate1 = new ayf(this, 1, 9);
/* 196 */     this.plate1.a(-1.0F, -1.0F, -2.0F, 2, 1, 3);
/* 197 */     this.plate1.a(0.0F, 3.0F, 0.0F);
/* 198 */     this.plate1.b(64, 64);
/* 199 */     this.plate1.i = true;
/* 200 */     setRotation(this.plate1, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 205 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 206 */     a(f, f1, f2, f3, f4, f5, entity);
/* 207 */     this.backhead.a(f5);
/* 208 */     this.body.a(f5);
/* 209 */     this.shoulderleft.a(f5);
/* 210 */     this.shoulderright.a(f5);
/* 211 */     this.brassdick.a(f5);
/* 212 */     this.neck.a(f5);
/* 213 */     this.skeleton.a(f5);
/* 214 */     this.brasspipe.a(f5);
/* 215 */     this.leftleg.a(f5);
/* 216 */     this.rightleg.a(f5);
/* 217 */     this.leftfoot.a(f5);
/* 218 */     this.rightfoot.a(f5);
/* 219 */     this.eye1.a(f5);
/* 220 */     this.eye2.a(f5);
/* 221 */     this.armleft.a(f5);
/* 222 */     this.armright.a(f5);
/* 223 */     this.wrenchleft.a(f5);
/* 224 */     this.wrenchleft2.a(f5);
/* 225 */     this.wrenchright.a(f5);
/* 226 */     this.wrenchright2.a(f5);
/* 227 */     this.nose.a(f5);
/* 228 */     this.mouthpipe.a(f5);
/* 229 */     this.mouth.a(f5);
/* 230 */     this.eyepipe1.a(f5);
/* 231 */     this.eyepipe2.a(f5);
/* 232 */     this.plate1.a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ayf model, float x, float y, float z) {
/* 237 */     model.f = x;
/* 238 */     model.g = y;
/* 239 */     model.h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float f, float f1, float f2, float f3, float f4, float f5, lq entity) {
/* 244 */     super.a(f, f1, f2, f3, f4, f5, entity);
/*     */     
/* 246 */     this.backhead.g = f3 / 57.295776F;
/* 247 */     this.backhead.f = f4 / 57.295776F;
/* 248 */     this.mouth.g = f3 / 57.295776F;
/* 249 */     this.mouth.f = f4 / 57.295776F;
/* 250 */     this.eyepipe1.g = f3 / 57.295776F;
/* 251 */     this.eyepipe1.f = f4 / 57.295776F;
/* 252 */     this.eyepipe2.g = f3 / 57.295776F;
/* 253 */     this.eyepipe2.f = f4 / 57.295776F;
/* 254 */     this.plate1.g = f3 / 57.295776F;
/* 255 */     this.plate1.f = f4 / 57.295776F;
/* 256 */     this.nose.g = f3 / 57.295776F;
/* 257 */     this.nose.f = f4 / 57.295776F;
/* 258 */     this.mouthpipe.g = f3 / 57.295776F;
/* 259 */     this.mouthpipe.f = f4 / 57.295776F;
/* 260 */     this.eye1.g = f3 / 57.295776F;
/* 261 */     this.eye1.f = f4 / 57.295776F;
/* 262 */     this.eye2.g = f3 / 57.295776F;
/* 263 */     this.eye2.f = f4 / 57.295776F;
/* 264 */     this.skeleton.g = f3 / 57.295776F;
/* 265 */     this.skeleton.f = f4 / 57.295776F;
/*     */     
/* 267 */     this.rightleg.f = ke.b(f * 0.6662F) * 1.4F * f1;
/* 268 */     this.leftleg.f = ke.b(f * 0.6662F + 3.1415927F) * 1.4F * f1;
/* 269 */     this.rightleg.g = 0.0F;
/* 270 */     this.leftleg.g = 0.0F;
/* 271 */     this.rightfoot.f = ke.b(f * 0.6662F) * 1.4F * f1;
/* 272 */     this.leftfoot.f = ke.b(f * 0.6662F + 3.1415927F) * 1.4F * f1;
/* 273 */     this.rightfoot.g = 0.0F;
/* 274 */     this.leftfoot.g = 0.0F;
/*     */     
/* 276 */     this.armright.f = ke.b(f * 0.6662F + 3.1415927F) * 2.0F * f1 * 0.5F;
/* 277 */     this.armleft.f = ke.b(f * 0.6662F) * 2.0F * f1 * 0.5F;
/* 278 */     this.armright.h = 0.0F;
/* 279 */     this.armleft.h = 0.0F;
/* 280 */     this.wrenchright.f = ke.b(f * 0.6662F + 3.1415927F) * 2.0F * f1 * 0.5F;
/* 281 */     this.wrenchleft.f = ke.b(f * 0.6662F) * 2.0F * f1 * 0.5F;
/* 282 */     this.wrenchright.h = 0.0F;
/* 283 */     this.wrenchleft.h = 0.0F;
/* 284 */     this.wrenchright2.f = ke.b(f * 0.6662F + 3.1415927F) * 2.0F * f1 * 0.5F;
/* 285 */     this.wrenchleft2.f = ke.b(f * 0.6662F) * 2.0F * f1 * 0.5F;
/* 286 */     this.wrenchright2.h = 0.0F;
/* 287 */     this.wrenchleft2.h = 0.0F;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel629.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */