/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ public class SCPModel50AEJ
/*     */   extends axa
/*     */ {
/*     */   ayf head;
/*     */   ayf pointthing;
/*     */   ayf pointthing2;
/*     */   ayf bodeh;
/*     */   ayf wing1;
/*     */   ayf underbody;
/*     */   ayf wing2;
/*     */   ayf leg1;
/*     */   ayf feet1;
/*     */   ayf finger1;
/*     */   ayf finger2;
/*     */   ayf finger3;
/*     */   ayf leg2;
/*     */   ayf feet2;
/*     */   ayf finger4;
/*     */   ayf finger5;
/*     */   ayf finger6;
/*     */   
/*     */   public SCPModel50AEJ() {
/*  30 */     this.t = 64;
/*  31 */     this.u = 64;
/*     */     
/*  33 */     this.head = new ayf(this, 34, 19);
/*  34 */     this.head.a(-2.0F, -4.0F, -2.0F, 4, 4, 4);
/*  35 */     this.head.a(0.0F, 0.0F, -4.0F);
/*  36 */     this.head.b(64, 64);
/*  37 */     this.head.i = true;
/*  38 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/*  39 */     this.pointthing = new ayf(this, 51, 19);
/*  40 */     this.pointthing.a(-1.0F, -2.0F, -5.0F, 2, 1, 3);
/*  41 */     this.pointthing.a(0.0F, 0.0F, -4.0F);
/*  42 */     this.pointthing.b(64, 64);
/*  43 */     this.pointthing.i = true;
/*  44 */     setRotation(this.pointthing, -0.1745329F, 0.0F, 0.0F);
/*  45 */     this.pointthing2 = new ayf(this, 51, 24);
/*  46 */     this.pointthing2.a(-1.0F, -2.0F, -4.0F, 2, 1, 3);
/*  47 */     this.pointthing2.a(0.0F, 0.0F, -4.0F);
/*  48 */     this.pointthing2.b(64, 64);
/*  49 */     this.pointthing2.i = true;
/*  50 */     setRotation(this.pointthing2, 0.1745329F, 0.0F, 0.0F);
/*  51 */     this.bodeh = new ayf(this, 9, 17);
/*  52 */     this.bodeh.a(-3.0F, -3.0F, 0.0F, 6, 6, 6);
/*  53 */     this.bodeh.a(0.0F, -2.0F, -2.0F);
/*  54 */     this.bodeh.b(64, 64);
/*  55 */     this.bodeh.i = true;
/*  56 */     setRotation(this.bodeh, 0.0F, 0.0F, 0.0F);
/*  57 */     this.wing1 = new ayf(this, 27, 7);
/*  58 */     this.wing1.a(-6.0F, -2.0F, 1.0F, 4, 1, 8);
/*  59 */     this.wing1.a(0.0F, -2.0F, -2.0F);
/*  60 */     this.wing1.b(64, 64);
/*  61 */     this.wing1.i = true;
/*  62 */     setRotation(this.wing1, -0.0872665F, -0.1745329F, -0.296706F);
/*  63 */     this.underbody = new ayf(this, 1, 30);
/*  64 */     this.underbody.a(-2.0F, -2.0F, 6.0F, 4, 4, 1);
/*  65 */     this.underbody.a(0.0F, -2.0F, -2.0F);
/*  66 */     this.underbody.b(64, 64);
/*  67 */     this.underbody.i = true;
/*  68 */     setRotation(this.underbody, 0.0F, 0.0F, 0.0F);
/*  69 */     this.wing2 = new ayf(this, 0, 7);
/*  70 */     this.wing2.a(2.0F, -2.0F, 1.0F, 4, 1, 8);
/*  71 */     this.wing2.a(0.0F, -2.0F, -2.0F);
/*  72 */     this.wing2.b(64, 64);
/*  73 */     this.wing2.i = true;
/*  74 */     setRotation(this.wing2, -0.0872665F, 0.1745329F, 0.296706F);
/*  75 */     this.leg1 = new ayf(this, 1, 48);
/*  76 */     this.leg1.a(1.0F, -1.0F, 7.0F, 1, 1, 5);
/*  77 */     this.leg1.a(0.0F, -2.0F, -2.0F);
/*  78 */     this.leg1.b(64, 64);
/*  79 */     this.leg1.i = true;
/*  80 */     setRotation(this.leg1, -0.0698132F, 0.0349066F, 0.0F);
/*  81 */     this.feet1 = new ayf(this, 7, 0);
/*  82 */     this.feet1.a(0.0F, -1.0F, 12.0F, 2, 2, 1);
/*  83 */     this.feet1.a(0.0F, -2.0F, -2.0F);
/*  84 */     this.feet1.b(64, 64);
/*  85 */     this.feet1.i = true;
/*  86 */     setRotation(this.feet1, -0.0698132F, 0.0349066F, 0.0F);
/*  87 */     this.finger1 = new ayf(this, 0, 0);
/*  88 */     this.finger1.a(2.0F, 0.0F, 12.0F, 1, 1, 2);
/*  89 */     this.finger1.a(0.0F, -2.0F, -2.0F);
/*  90 */     this.finger1.b(64, 64);
/*  91 */     this.finger1.i = true;
/*  92 */     setRotation(this.finger1, -0.0698132F, 0.0349066F, 0.0F);
/*  93 */     this.finger2 = new ayf(this, 0, 0);
/*  94 */     this.finger2.a(1.0F, -2.0F, 12.0F, 1, 1, 2);
/*  95 */     this.finger2.a(0.0F, -2.0F, -2.0F);
/*  96 */     this.finger2.b(64, 64);
/*  97 */     this.finger2.i = true;
/*  98 */     setRotation(this.finger2, -0.0698132F, 0.0349066F, 0.0F);
/*  99 */     this.finger3 = new ayf(this, 14, 0);
/* 100 */     this.finger3.a(0.0F, 0.0F, 13.0F, 1, 1, 1);
/* 101 */     this.finger3.a(0.0F, -2.0F, -2.0F);
/* 102 */     this.finger3.b(64, 64);
/* 103 */     this.finger3.i = true;
/* 104 */     setRotation(this.finger3, -0.0698132F, 0.0349066F, 0.0F);
/* 105 */     this.leg2 = new ayf(this, 1, 48);
/* 106 */     this.leg2.a(-1.0F, -1.0F, 7.0F, 1, 1, 5);
/* 107 */     this.leg2.a(0.0F, -2.0F, -2.0F);
/* 108 */     this.leg2.b(64, 64);
/* 109 */     this.leg2.i = true;
/* 110 */     setRotation(this.leg2, -0.0698132F, -0.1047198F, 0.0F);
/* 111 */     this.feet2 = new ayf(this, 7, 0);
/* 112 */     this.feet2.a(-1.0F, -1.0F, 12.0F, 2, 2, 1);
/* 113 */     this.feet2.a(0.0F, -2.0F, -2.0F);
/* 114 */     this.feet2.b(64, 64);
/* 115 */     this.feet2.i = true;
/* 116 */     setRotation(this.feet2, -0.0698132F, -0.1047198F, 0.0F);
/* 117 */     this.finger4 = new ayf(this, 0, 0);
/* 118 */     this.finger4.a(-1.0F, -2.0F, 12.0F, 1, 1, 2);
/* 119 */     this.finger4.a(0.0F, -2.0F, -2.0F);
/* 120 */     this.finger4.b(64, 64);
/* 121 */     this.finger4.i = true;
/* 122 */     setRotation(this.finger4, -0.0698132F, -0.1047198F, 0.0F);
/* 123 */     this.finger5 = new ayf(this, 14, 0);
/* 124 */     this.finger5.a(0.0F, 0.0F, 13.0F, 1, 1, 1);
/* 125 */     this.finger5.a(0.0F, -2.0F, -2.0F);
/* 126 */     this.finger5.b(64, 64);
/* 127 */     this.finger5.i = true;
/* 128 */     setRotation(this.finger5, -0.0698132F, -0.1047198F, 0.0F);
/* 129 */     this.finger6 = new ayf(this, 0, 0);
/* 130 */     this.finger6.a(-2.0F, 0.0F, 12.0F, 1, 1, 2);
/* 131 */     this.finger6.a(0.0F, -2.0F, -2.0F);
/* 132 */     this.finger6.b(64, 64);
/* 133 */     this.finger6.i = true;
/* 134 */     setRotation(this.finger6, -0.0698132F, -0.1047198F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 139 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 140 */     a(f, f1, f2, f3, f4, f5, entity);
/* 141 */     this.head.a(f5);
/* 142 */     this.pointthing.a(f5);
/* 143 */     this.pointthing2.a(f5);
/* 144 */     this.bodeh.a(f5);
/* 145 */     this.wing1.a(f5);
/* 146 */     this.underbody.a(f5);
/* 147 */     this.wing2.a(f5);
/* 148 */     this.leg1.a(f5);
/* 149 */     this.feet1.a(f5);
/* 150 */     this.finger1.a(f5);
/* 151 */     this.finger2.a(f5);
/* 152 */     this.finger3.a(f5);
/* 153 */     this.leg2.a(f5);
/* 154 */     this.feet2.a(f5);
/* 155 */     this.finger4.a(f5);
/* 156 */     this.finger5.a(f5);
/* 157 */     this.finger6.a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ayf model, float x, float y, float z) {
/* 162 */     model.f = x;
/* 163 */     model.g = y;
/* 164 */     model.h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float f, float f1, float f2, float f3, float f4, float f5, lq entity) {
/* 169 */     super.a(f, f1, f2, f3, f4, f5, entity);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel50AEJ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */