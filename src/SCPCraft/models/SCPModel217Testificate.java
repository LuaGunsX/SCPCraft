/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import ke;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ public class SCPModel217Testificate
/*     */   extends axa
/*     */ {
/*     */   ayf body;
/*     */   ayf rightarm;
/*     */   ayf leftarm;
/*     */   ayf rightleg;
/*     */   ayf leftleg;
/*     */   ayf Thing;
/*     */   ayf head;
/*     */   ayf nose;
/*     */   ayf CW1;
/*     */   ayf CW11;
/*     */   ayf CW12;
/*     */   ayf CW13;
/*     */   ayf CW14;
/*     */   ayf CW15;
/*     */   ayf CW16;
/*     */   ayf CW17;
/*     */   ayf CW18;
/*     */   
/*     */   public SCPModel217Testificate() {
/*  31 */     this.t = 64;
/*  32 */     this.u = 64;
/*     */     
/*  34 */     this.body = new ayf(this, 16, 38);
/*  35 */     this.body.a(-4.0F, 0.0F, -3.0F, 8, 19, 6);
/*  36 */     this.body.a(0.0F, 0.0F, 0.0F);
/*  37 */     this.body.b(64, 64);
/*  38 */     this.body.i = true;
/*  39 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/*  40 */     this.rightarm = new ayf(this, 40, 16);
/*  41 */     this.rightarm.a(-3.0F, -1.0F, -1.0F, 4, 8, 4);
/*  42 */     this.rightarm.a(-5.0F, 2.0F, 0.0F);
/*  43 */     this.rightarm.b(64, 64);
/*  44 */     this.rightarm.i = true;
/*  45 */     setRotation(this.rightarm, -0.8203047F, 0.0F, 0.0F);
/*  46 */     this.leftarm = new ayf(this, 40, 16);
/*  47 */     this.leftarm.a(-1.0F, -1.0F, -1.0F, 4, 8, 4);
/*  48 */     this.leftarm.a(5.0F, 2.0F, 0.0F);
/*  49 */     this.leftarm.b(64, 64);
/*  50 */     this.leftarm.i = true;
/*  51 */     setRotation(this.leftarm, -0.8203047F, 0.0F, 0.0F);
/*  52 */     this.rightleg = new ayf(this, 0, 24);
/*  53 */     this.rightleg.a(-2.0F, 0.0F, -2.0F, 4, 5, 4);
/*  54 */     this.rightleg.a(-2.0F, 19.0F, 0.0F);
/*  55 */     this.rightleg.b(64, 64);
/*  56 */     this.rightleg.i = true;
/*  57 */     setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
/*  58 */     this.leftleg = new ayf(this, 0, 34);
/*  59 */     this.leftleg.a(-1.0F, 0.0F, -1.0F, 2, 5, 2);
/*  60 */     this.leftleg.a(2.0F, 19.0F, 0.0F);
/*  61 */     this.leftleg.b(64, 64);
/*  62 */     this.leftleg.i = true;
/*  63 */     setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
/*  64 */     this.Thing = new ayf(this, 39, 29);
/*  65 */     this.Thing.a(-4.0F, 4.5F, 0.0F, 8, 4, 4);
/*  66 */     this.Thing.a(0.0F, 0.0F, 0.0F);
/*  67 */     this.Thing.b(64, 64);
/*  68 */     this.Thing.i = true;
/*  69 */     setRotation(this.Thing, -0.7679449F, 0.0F, 0.0F);
/*  70 */     this.head = new ayf(this, 1, 1);
/*  71 */     this.head.a(-4.0F, -10.0F, -4.0F, 8, 10, 8);
/*  72 */     this.head.a(0.0F, 0.0F, 0.0F);
/*  73 */     this.head.b(64, 64);
/*  74 */     this.head.i = true;
/*  75 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  76 */     this.nose = new ayf(this, 19, 20);
/*  77 */     this.nose.a(-1.0F, -3.0F, -6.0F, 2, 4, 2);
/*  78 */     this.nose.a(0.0F, 0.0F, 0.0F);
/*  79 */     this.nose.b(64, 64);
/*  80 */     this.nose.i = true;
/*  81 */     setRotation(this.nose, 0.0F, 0.0F, 0.0F);
/*  82 */     this.CW1 = new ayf(this, 26, 1);
/*  83 */     this.CW1.a(-5.0F, -11.0F, -1.0F, 3, 3, 2);
/*  84 */     this.CW1.a(0.0F, 0.0F, 0.0F);
/*  85 */     this.CW1.b(64, 64);
/*  86 */     this.CW1.i = true;
/*  87 */     setRotation(this.CW1, 0.0F, 0.0F, 0.0F);
/*  88 */     this.CW11 = new ayf(this, 37, 1);
/*  89 */     this.CW11.a(-6.0F, -9.0F, -1.0F, 1, 1, 1);
/*  90 */     this.CW11.a(0.0F, 0.0F, 0.0F);
/*  91 */     this.CW11.b(64, 64);
/*  92 */     this.CW11.i = true;
/*  93 */     setRotation(this.CW11, 0.0F, 0.0F, 0.0F);
/*  94 */     this.CW12 = new ayf(this, 37, 1);
/*  95 */     this.CW12.a(-6.0F, -10.0F, 0.0F, 1, 1, 1);
/*  96 */     this.CW12.a(0.0F, 0.0F, 0.0F);
/*  97 */     this.CW12.b(64, 64);
/*  98 */     this.CW12.i = true;
/*  99 */     setRotation(this.CW12, 0.0F, 0.0F, 0.0F);
/* 100 */     this.CW13 = new ayf(this, 37, 1);
/* 101 */     this.CW13.a(-6.0F, -11.0F, -1.0F, 1, 1, 1);
/* 102 */     this.CW13.a(0.0F, 0.0F, 0.0F);
/* 103 */     this.CW13.b(64, 64);
/* 104 */     this.CW13.i = true;
/* 105 */     setRotation(this.CW13, 0.0F, 0.0F, 0.0F);
/* 106 */     this.CW14 = new ayf(this, 37, 1);
/* 107 */     this.CW14.a(-5.0F, -12.0F, 0.0F, 1, 1, 1);
/* 108 */     this.CW14.a(0.0F, 0.0F, 0.0F);
/* 109 */     this.CW14.b(64, 64);
/* 110 */     this.CW14.i = true;
/* 111 */     setRotation(this.CW14, 0.0F, 0.0F, 0.0F);
/* 112 */     this.CW15 = new ayf(this, 37, 1);
/* 113 */     this.CW15.a(-4.0F, -12.0F, -1.0F, 1, 1, 1);
/* 114 */     this.CW15.a(0.0F, 0.0F, 0.0F);
/* 115 */     this.CW15.b(64, 64);
/* 116 */     this.CW15.i = true;
/* 117 */     setRotation(this.CW15, 0.0F, 0.0F, 0.0F);
/* 118 */     this.CW16 = new ayf(this, 37, 1);
/* 119 */     this.CW16.a(-3.0F, -12.0F, 0.0F, 1, 1, 1);
/* 120 */     this.CW16.a(0.0F, 0.0F, 0.0F);
/* 121 */     this.CW16.b(64, 64);
/* 122 */     this.CW16.i = true;
/* 123 */     setRotation(this.CW16, 0.0F, 0.0F, 0.0F);
/* 124 */     this.CW17 = new ayf(this, 37, 1);
/* 125 */     this.CW17.a(-5.0F, -8.0F, 0.0F, 1, 1, 1);
/* 126 */     this.CW17.a(0.0F, 0.0F, 0.0F);
/* 127 */     this.CW17.b(64, 64);
/* 128 */     this.CW17.i = true;
/* 129 */     setRotation(this.CW17, 0.0F, 0.0F, 0.0F);
/* 130 */     this.CW18 = new ayf(this, 37, 1);
/* 131 */     this.CW18.a(-2.0F, -11.0F, -1.0F, 1, 1, 1);
/* 132 */     this.CW18.a(0.0F, 0.0F, 0.0F);
/* 133 */     this.CW18.b(64, 64);
/* 134 */     this.CW18.i = true;
/* 135 */     setRotation(this.CW18, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 140 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 141 */     a(f, f1, f2, f3, f4, f5, entity);
/* 142 */     this.body.a(f5);
/* 143 */     this.rightarm.a(f5);
/* 144 */     this.leftarm.a(f5);
/* 145 */     this.rightleg.a(f5);
/* 146 */     this.leftleg.a(f5);
/* 147 */     this.Thing.a(f5);
/* 148 */     this.head.a(f5);
/* 149 */     this.nose.a(f5);
/* 150 */     this.CW1.a(f5);
/* 151 */     this.CW11.a(f5);
/* 152 */     this.CW12.a(f5);
/* 153 */     this.CW13.a(f5);
/* 154 */     this.CW14.a(f5);
/* 155 */     this.CW15.a(f5);
/* 156 */     this.CW16.a(f5);
/* 157 */     this.CW17.a(f5);
/* 158 */     this.CW18.a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ayf model, float x, float y, float z) {
/* 163 */     model.f = x;
/* 164 */     model.g = y;
/* 165 */     model.h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float par1, float par2, float par3, float par4, float par5, float par6, lq entity) {
/* 170 */     super.a(par1, par2, par3, par4, par5, par6, entity);
/* 171 */     this.head.g = par4 / 57.295776F;
/* 172 */     this.head.f = par5 / 57.295776F;
/* 173 */     this.CW1.g = par4 / 57.295776F;
/* 174 */     this.CW1.f = par5 / 57.295776F;
/* 175 */     this.CW11.g = par4 / 57.295776F;
/* 176 */     this.CW11.f = par5 / 57.295776F;
/* 177 */     this.CW12.g = par4 / 57.295776F;
/* 178 */     this.CW12.f = par5 / 57.295776F;
/* 179 */     this.CW13.g = par4 / 57.295776F;
/* 180 */     this.CW13.f = par5 / 57.295776F;
/* 181 */     this.CW14.g = par4 / 57.295776F;
/* 182 */     this.CW14.f = par5 / 57.295776F;
/* 183 */     this.CW15.g = par4 / 57.295776F;
/* 184 */     this.CW15.f = par5 / 57.295776F;
/* 185 */     this.CW16.g = par4 / 57.295776F;
/* 186 */     this.CW16.f = par5 / 57.295776F;
/* 187 */     this.CW17.g = par4 / 57.295776F;
/* 188 */     this.CW17.f = par5 / 57.295776F;
/* 189 */     this.CW18.g = par4 / 57.295776F;
/* 190 */     this.CW18.f = par5 / 57.295776F;
/* 191 */     this.nose.g = par4 / 57.295776F;
/* 192 */     this.nose.f = par5 / 57.295776F;
/* 193 */     this.rightleg.f = ke.b(par1 * 0.6662F) * 1.4F * par2 * 0.5F;
/* 194 */     this.leftleg.f = ke.b(par1 * 0.6662F + 3.1415927F) * 1.4F * par2 * 0.5F;
/* 195 */     this.rightleg.g = 0.0F;
/* 196 */     this.leftleg.g = 0.0F;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel217Testificate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */