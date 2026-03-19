/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import ke;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ public class SCPModel217Zombie
/*     */   extends axa
/*     */ {
/*     */   ayf head;
/*     */   ayf body;
/*     */   ayf rightarm;
/*     */   ayf leftarm;
/*     */   ayf rightleg;
/*     */   ayf leftleg;
/*     */   ayf head2;
/*     */   ayf head3;
/*     */   ayf pegleg;
/*     */   ayf headmini;
/*     */   ayf Clockwork1;
/*     */   ayf Clockworkmini1;
/*     */   ayf Clockworkmini2;
/*     */   ayf Clockworkmini3;
/*     */   ayf Clockworkmini4;
/*     */   ayf Clockworkmini5;
/*     */   ayf Clockworkbig1;
/*     */   ayf Clockworklil1;
/*     */   ayf Clockworklil2;
/*     */   ayf Clockworklil3;
/*     */   ayf Clockworklil4;
/*     */   ayf Clockworklil6;
/*     */   ayf Clockworklil5;
/*     */   ayf Clockworklil7;
/*     */   ayf Clockworklil8;
/*     */   
/*     */   public SCPModel217Zombie() {
/*  39 */     this.t = 64;
/*  40 */     this.u = 64;
/*     */     
/*  42 */     this.head = new ayf(this, 1, 10);
/*  43 */     this.head.a(-4.0F, -8.0F, -4.0F, 4, 8, 8);
/*  44 */     this.head.a(0.0F, 0.0F, 0.0F);
/*  45 */     this.head.b(64, 64);
/*  46 */     this.head.i = true;
/*  47 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  48 */     this.body = new ayf(this, 1, 27);
/*  49 */     this.body.a(-4.0F, 0.0F, -2.0F, 8, 12, 4);
/*  50 */     this.body.a(0.0F, 0.0F, 0.0F);
/*  51 */     this.body.b(64, 64);
/*  52 */     this.body.i = true;
/*  53 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  54 */     this.rightarm = new ayf(this, 47, 30);
/*  55 */     this.rightarm.a(-3.0F, -2.0F, -2.0F, 4, 12, 4);
/*  56 */     this.rightarm.a(-5.0F, 2.0F, 0.0F);
/*  57 */     this.rightarm.b(64, 64);
/*  58 */     this.rightarm.i = true;
/*  59 */     setRotation(this.rightarm, -1.570796F, 0.0F, 0.0F);
/*  60 */     this.leftarm = new ayf(this, 47, 30);
/*  61 */     this.leftarm.a(-1.0F, -2.0F, -2.0F, 4, 12, 4);
/*  62 */     this.leftarm.a(5.0F, 2.0F, 0.0F);
/*  63 */     this.leftarm.b(64, 64);
/*  64 */     this.leftarm.i = true;
/*  65 */     setRotation(this.leftarm, -1.570796F, 0.0F, 0.0F);
/*  66 */     this.rightleg = new ayf(this, 0, 44);
/*  67 */     this.rightleg.a(-2.0F, 0.0F, -2.0F, 4, 9, 4);
/*  68 */     this.rightleg.a(-2.0F, 12.0F, 0.0F);
/*  69 */     this.rightleg.b(64, 64);
/*  70 */     this.rightleg.i = true;
/*  71 */     setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
/*  72 */     this.leftleg = new ayf(this, 17, 47);
/*  73 */     this.leftleg.a(-2.0F, 0.0F, -2.0F, 4, 12, 4);
/*  74 */     this.leftleg.a(2.0F, 12.0F, 0.0F);
/*  75 */     this.leftleg.b(64, 64);
/*  76 */     this.leftleg.i = true;
/*  77 */     setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
/*  78 */     this.head2 = new ayf(this, 39, 6);
/*  79 */     this.head2.a(0.0F, -8.0F, 0.0F, 4, 8, 4);
/*  80 */     this.head2.a(0.0F, 0.0F, 0.0F);
/*  81 */     this.head2.b(64, 64);
/*  82 */     this.head2.i = true;
/*  83 */     setRotation(this.head2, 0.0F, 0.0F, 0.0F);
/*  84 */     this.head3 = new ayf(this, 26, 19);
/*  85 */     this.head3.a(0.0F, -3.0F, -4.0F, 4, 3, 4);
/*  86 */     this.head3.a(0.0F, 0.0F, 0.0F);
/*  87 */     this.head3.b(64, 64);
/*  88 */     this.head3.i = true;
/*  89 */     setRotation(this.head3, 0.0F, 0.0F, 0.0F);
/*  90 */     this.pegleg = new ayf(this, 1, 58);
/*  91 */     this.pegleg.a(-1.0F, 9.0F, -1.0F, 2, 3, 2);
/*  92 */     this.pegleg.a(-2.0F, 12.0F, 0.0F);
/*  93 */     this.pegleg.b(64, 64);
/*  94 */     this.pegleg.i = true;
/*  95 */     setRotation(this.pegleg, 0.0F, 0.0F, 0.0F);
/*  96 */     this.headmini = new ayf(this, 26, 11);
/*  97 */     this.headmini.a(0.0F, -7.0F, -3.0F, 3, 4, 3);
/*  98 */     this.headmini.a(0.0F, 0.0F, 0.0F);
/*  99 */     this.headmini.b(64, 64);
/* 100 */     this.headmini.i = true;
/* 101 */     setRotation(this.headmini, 0.0F, 0.0F, 0.0F);
/* 102 */     this.Clockwork1 = new ayf(this, 55, 25);
/* 103 */     this.Clockwork1.a(-9.0F, -1.0F, -4.0F, 3, 3, 1);
/* 104 */     this.Clockwork1.a(0.0F, 0.0F, 0.0F);
/* 105 */     this.Clockwork1.b(64, 64);
/* 106 */     this.Clockwork1.i = true;
/* 107 */     setRotation(this.Clockwork1, 0.0F, 0.0F, 0.0F);
/* 108 */     this.Clockworkmini1 = new ayf(this, 0, 0);
/* 109 */     this.Clockworkmini1.a(-7.0F, -2.0F, -4.0F, 1, 1, 1);
/* 110 */     this.Clockworkmini1.a(0.0F, 0.0F, 0.0F);
/* 111 */     this.Clockworkmini1.b(64, 64);
/* 112 */     this.Clockworkmini1.i = true;
/* 113 */     setRotation(this.Clockworkmini1, 0.0F, 0.0F, 0.0F);
/* 114 */     this.Clockworkmini2 = new ayf(this, 0, 0);
/* 115 */     this.Clockworkmini2.a(-9.0F, -2.0F, -4.0F, 1, 1, 1);
/* 116 */     this.Clockworkmini2.a(0.0F, 0.0F, 0.0F);
/* 117 */     this.Clockworkmini2.b(64, 64);
/* 118 */     this.Clockworkmini2.i = true;
/* 119 */     setRotation(this.Clockworkmini2, 0.0F, 0.0F, 0.0F);
/* 120 */     this.Clockworkmini3 = new ayf(this, 0, 0);
/* 121 */     this.Clockworkmini3.a(-10.0F, -1.0F, -4.0F, 1, 1, 1);
/* 122 */     this.Clockworkmini3.a(0.0F, 0.0F, 0.0F);
/* 123 */     this.Clockworkmini3.b(64, 64);
/* 124 */     this.Clockworkmini3.i = true;
/* 125 */     setRotation(this.Clockworkmini3, 0.0F, 0.0F, 0.0F);
/* 126 */     this.Clockworkmini4 = new ayf(this, 0, 0);
/* 127 */     this.Clockworkmini4.a(-10.0F, 1.0F, -4.0F, 1, 1, 1);
/* 128 */     this.Clockworkmini4.a(0.0F, 0.0F, 0.0F);
/* 129 */     this.Clockworkmini4.b(64, 64);
/* 130 */     this.Clockworkmini4.i = true;
/* 131 */     setRotation(this.Clockworkmini4, 0.0F, 0.0F, 0.0F);
/* 132 */     this.Clockworkmini5 = new ayf(this, 0, 0);
/* 133 */     this.Clockworkmini5.a(-9.0F, 2.0F, -4.0F, 1, 1, 1);
/* 134 */     this.Clockworkmini5.a(0.0F, 0.0F, 0.0F);
/* 135 */     this.Clockworkmini5.b(64, 64);
/* 136 */     this.Clockworkmini5.i = true;
/* 137 */     setRotation(this.Clockworkmini5, 0.0F, 0.0F, 0.0F);
/* 138 */     this.Clockworkbig1 = new ayf(this, 45, 47);
/* 139 */     this.Clockworkbig1.a(4.0F, 4.0F, -6.0F, 1, 8, 8);
/* 140 */     this.Clockworkbig1.a(0.0F, 0.0F, 0.0F);
/* 141 */     this.Clockworkbig1.b(64, 64);
/* 142 */     this.Clockworkbig1.i = true;
/* 143 */     setRotation(this.Clockworkbig1, 0.0F, 0.0F, 0.0F);
/* 144 */     this.Clockworklil1 = new ayf(this, 0, 0);
/* 145 */     this.Clockworklil1.a(4.0F, 4.0F, -7.0F, 1, 1, 1);
/* 146 */     this.Clockworklil1.a(0.0F, 0.0F, 0.0F);
/* 147 */     this.Clockworklil1.b(64, 64);
/* 148 */     this.Clockworklil1.i = true;
/* 149 */     setRotation(this.Clockworklil1, 0.0F, 0.0F, 0.0F);
/* 150 */     this.Clockworklil2 = new ayf(this, 0, 0);
/* 151 */     this.Clockworklil2.a(4.0F, 6.0F, -7.0F, 1, 1, 1);
/* 152 */     this.Clockworklil2.a(0.0F, 0.0F, 0.0F);
/* 153 */     this.Clockworklil2.b(64, 64);
/* 154 */     this.Clockworklil2.i = true;
/* 155 */     setRotation(this.Clockworklil2, 0.0F, 0.0F, 0.0F);
/* 156 */     this.Clockworklil3 = new ayf(this, 0, 0);
/* 157 */     this.Clockworklil3.a(4.0F, 8.0F, -7.0F, 1, 1, 1);
/* 158 */     this.Clockworklil3.a(0.0F, 0.0F, 0.0F);
/* 159 */     this.Clockworklil3.b(64, 64);
/* 160 */     this.Clockworklil3.i = true;
/* 161 */     setRotation(this.Clockworklil3, 0.0F, 0.0F, 0.0F);
/* 162 */     this.Clockworklil4 = new ayf(this, 0, 0);
/* 163 */     this.Clockworklil4.a(4.0F, 10.0F, -7.0F, 1, 1, 1);
/* 164 */     this.Clockworklil4.a(0.0F, 0.0F, 0.0F);
/* 165 */     this.Clockworklil4.b(64, 64);
/* 166 */     this.Clockworklil4.i = true;
/* 167 */     setRotation(this.Clockworklil4, 0.0F, 0.0F, 0.0F);
/* 168 */     this.Clockworklil6 = new ayf(this, 0, 0);
/* 169 */     this.Clockworklil6.a(4.0F, 12.0F, -3.0F, 1, 1, 1);
/* 170 */     this.Clockworklil6.a(0.0F, 0.0F, 0.0F);
/* 171 */     this.Clockworklil6.b(64, 64);
/* 172 */     this.Clockworklil6.i = true;
/* 173 */     setRotation(this.Clockworklil6, 0.0F, 0.0F, 0.0F);
/* 174 */     this.Clockworklil5 = new ayf(this, 0, 0);
/* 175 */     this.Clockworklil5.a(4.0F, 12.0F, -5.0F, 1, 1, 1);
/* 176 */     this.Clockworklil5.a(0.0F, 0.0F, 0.0F);
/* 177 */     this.Clockworklil5.b(64, 64);
/* 178 */     this.Clockworklil5.i = true;
/* 179 */     setRotation(this.Clockworklil5, 0.0F, 0.0F, 0.0F);
/* 180 */     this.Clockworklil7 = new ayf(this, 0, 0);
/* 181 */     this.Clockworklil7.a(4.0F, 12.0F, -1.0F, 1, 1, 1);
/* 182 */     this.Clockworklil7.a(0.0F, 0.0F, 0.0F);
/* 183 */     this.Clockworklil7.b(64, 64);
/* 184 */     this.Clockworklil7.i = true;
/* 185 */     setRotation(this.Clockworklil7, 0.0F, 0.0F, 0.0F);
/* 186 */     this.Clockworklil8 = new ayf(this, 0, 0);
/* 187 */     this.Clockworklil8.a(4.0F, 12.0F, 1.0F, 1, 1, 1);
/* 188 */     this.Clockworklil8.a(0.0F, 0.0F, 0.0F);
/* 189 */     this.Clockworklil8.b(64, 64);
/* 190 */     this.Clockworklil8.i = true;
/* 191 */     setRotation(this.Clockworklil8, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 196 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 197 */     a(f, f1, f2, f3, f4, f5, entity);
/* 198 */     this.head.a(f5);
/* 199 */     this.body.a(f5);
/* 200 */     this.rightarm.a(f5);
/* 201 */     this.leftarm.a(f5);
/* 202 */     this.rightleg.a(f5);
/* 203 */     this.leftleg.a(f5);
/* 204 */     this.head2.a(f5);
/* 205 */     this.head3.a(f5);
/* 206 */     this.pegleg.a(f5);
/* 207 */     this.headmini.a(f5);
/* 208 */     this.Clockwork1.a(f5);
/* 209 */     this.Clockworkmini1.a(f5);
/* 210 */     this.Clockworkmini2.a(f5);
/* 211 */     this.Clockworkmini3.a(f5);
/* 212 */     this.Clockworkmini4.a(f5);
/* 213 */     this.Clockworkmini5.a(f5);
/* 214 */     this.Clockworkbig1.a(f5);
/* 215 */     this.Clockworklil1.a(f5);
/* 216 */     this.Clockworklil2.a(f5);
/* 217 */     this.Clockworklil3.a(f5);
/* 218 */     this.Clockworklil4.a(f5);
/* 219 */     this.Clockworklil6.a(f5);
/* 220 */     this.Clockworklil5.a(f5);
/* 221 */     this.Clockworklil7.a(f5);
/* 222 */     this.Clockworklil8.a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ayf model, float x, float y, float z) {
/* 227 */     model.f = x;
/* 228 */     model.g = y;
/* 229 */     model.h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float f, float f1, float f2, float f3, float f4, float f5, lq entity) {
/* 234 */     super.a(f, f1, f2, f3, f4, f5, entity);
/* 235 */     this.head.g = f3 / 57.295776F;
/* 236 */     this.head.f = f4 / 57.295776F;
/* 237 */     this.head2.g = f3 / 57.295776F;
/* 238 */     this.head2.f = f4 / 57.295776F;
/* 239 */     this.head3.g = f3 / 57.295776F;
/* 240 */     this.head3.f = f4 / 57.295776F;
/* 241 */     this.headmini.g = f3 / 57.295776F;
/* 242 */     this.headmini.f = f4 / 57.295776F;
/* 243 */     this.rightleg.f = ke.b(f * 0.6662F) * 1.4F * f1;
/* 244 */     this.leftleg.f = ke.b(f * 0.6662F + 3.1415927F) * 1.4F * f1;
/* 245 */     this.rightleg.g = 0.0F;
/* 246 */     this.leftleg.g = 0.0F;
/* 247 */     this.pegleg.f = ke.b(f * 0.6662F) * 1.4F * f1;
/* 248 */     this.pegleg.g = 0.0F;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel217Zombie.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */