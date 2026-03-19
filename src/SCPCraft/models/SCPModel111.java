/*     */ package SCPCraft.models;
/*     */ 
/*     */ import axa;
/*     */ import ayf;
/*     */ import lq;
/*     */ 
/*     */ 
/*     */ public class SCPModel111
/*     */   extends axa
/*     */ {
/*     */   ayf Tail;
/*     */   ayf End;
/*     */   ayf Neck;
/*     */   ayf NeckPiece;
/*     */   ayf Head;
/*     */   ayf Snout;
/*     */   ayf Spikeythingleft;
/*     */   ayf Spikeythingright;
/*     */   ayf Swirlleft;
/*     */   ayf Swirlright;
/*     */   ayf SwirlEndleft;
/*     */   ayf SwirlEndright;
/*     */   
/*     */   public SCPModel111() {
/*  25 */     this.t = 64;
/*  26 */     this.u = 64;
/*     */     
/*  28 */     this.Tail = new ayf(this, 19, 43);
/*  29 */     this.Tail.a(-3.0F, -2.0F, -13.0F, 6, 4, 16);
/*  30 */     this.Tail.a(0.0F, 22.0F, 5.0F);
/*  31 */     this.Tail.b(64, 64);
/*  32 */     this.Tail.i = true;
/*  33 */     setRotation(this.Tail, 0.0F, 0.0F, 0.0F);
/*  34 */     this.End = new ayf(this, 0, 33);
/*  35 */     this.End.a(-3.0F, -1.0F, 0.0F, 6, 3, 6);
/*  36 */     this.End.a(0.0F, 22.0F, 8.0F);
/*  37 */     this.End.b(64, 64);
/*  38 */     this.End.i = true;
/*  39 */     setRotation(this.End, 0.0F, 0.0F, 0.0F);
/*  40 */     this.Neck = new ayf(this, 46, 24);
/*  41 */     this.Neck.a(-2.0F, -8.0F, -2.0F, 4, 8, 4);
/*  42 */     this.Neck.a(0.0F, 20.0F, -7.0F);
/*  43 */     this.Neck.b(64, 64);
/*  44 */     this.Neck.i = true;
/*  45 */     setRotation(this.Neck, 0.0F, 0.0F, 0.0F);
/*  46 */     this.NeckPiece = new ayf(this, 52, 37);
/*  47 */     this.NeckPiece.a(-2.0F, 0.0F, -2.0F, 4, 2, 1);
/*  48 */     this.NeckPiece.a(0.0F, 20.0F, -7.0F);
/*  49 */     this.NeckPiece.b(64, 64);
/*  50 */     this.NeckPiece.i = true;
/*  51 */     setRotation(this.NeckPiece, 0.0F, 0.0F, 0.0F);
/*  52 */     this.Head = new ayf(this, 28, 5);
/*  53 */     this.Head.a(-2.0F, -4.0F, -3.0F, 4, 4, 6);
/*  54 */     this.Head.a(0.0F, 12.0F, -7.0F);
/*  55 */     this.Head.b(64, 64);
/*  56 */     this.Head.i = true;
/*  57 */     setRotation(this.Head, 0.0F, 0.0F, 0.0F);
/*  58 */     this.Snout = new ayf(this, 49, 9);
/*  59 */     this.Snout.a(-2.0F, -3.0F, -6.0F, 4, 3, 3);
/*  60 */     this.Snout.a(0.0F, 12.0F, -7.0F);
/*  61 */     this.Snout.b(64, 64);
/*  62 */     this.Snout.i = true;
/*  63 */     setRotation(this.Snout, 0.0F, 0.0F, 0.0F);
/*  64 */     this.Spikeythingleft = new ayf(this, 1, 20);
/*  65 */     this.Spikeythingleft.a(-3.0F, -4.0F, 1.0F, 1, 1, 5);
/*  66 */     this.Spikeythingleft.a(0.0F, 12.0F, -7.0F);
/*  67 */     this.Spikeythingleft.b(64, 64);
/*  68 */     this.Spikeythingleft.i = true;
/*  69 */     setRotation(this.Spikeythingleft, 0.0F, 0.0F, 0.0F);
/*  70 */     this.Spikeythingright = new ayf(this, 1, 1);
/*  71 */     this.Spikeythingright.a(2.0F, -4.0F, 1.0F, 1, 1, 5);
/*  72 */     this.Spikeythingright.a(0.0F, 12.0F, -7.0F);
/*  73 */     this.Spikeythingright.b(64, 64);
/*  74 */     this.Spikeythingright.i = true;
/*  75 */     setRotation(this.Spikeythingright, 0.0F, 0.0F, 0.0F);
/*  76 */     this.Swirlleft = new ayf(this, 1, 27);
/*  77 */     this.Swirlleft.a(-3.0F, -3.0F, 5.0F, 1, 4, 1);
/*  78 */     this.Swirlleft.a(0.0F, 12.0F, -7.0F);
/*  79 */     this.Swirlleft.b(64, 64);
/*  80 */     this.Swirlleft.i = true;
/*  81 */     setRotation(this.Swirlleft, 0.0F, 0.0F, 0.0F);
/*  82 */     this.Swirlright = new ayf(this, 1, 8);
/*  83 */     this.Swirlright.a(2.0F, -3.0F, 5.0F, 1, 4, 1);
/*  84 */     this.Swirlright.a(0.0F, 12.0F, -7.0F);
/*  85 */     this.Swirlright.b(64, 64);
/*  86 */     this.Swirlright.i = true;
/*  87 */     setRotation(this.Swirlright, 0.0F, 0.0F, 0.0F);
/*  88 */     this.SwirlEndleft = new ayf(this, 6, 30);
/*  89 */     this.SwirlEndleft.a(-3.0F, 0.0F, 4.0F, 1, 1, 1);
/*  90 */     this.SwirlEndleft.a(0.0F, 12.0F, -7.0F);
/*  91 */     this.SwirlEndleft.b(64, 64);
/*  92 */     this.SwirlEndleft.i = true;
/*  93 */     setRotation(this.SwirlEndleft, 0.0F, 0.0F, 0.0F);
/*  94 */     this.SwirlEndright = new ayf(this, 6, 11);
/*  95 */     this.SwirlEndright.a(2.0F, 0.0F, 4.0F, 1, 1, 1);
/*  96 */     this.SwirlEndright.a(0.0F, 12.0F, -7.0F);
/*  97 */     this.SwirlEndright.b(64, 64);
/*  98 */     this.SwirlEndright.i = true;
/*  99 */     setRotation(this.SwirlEndright, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 104 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 105 */     a(f, f1, f2, f3, f4, f5, entity);
/* 106 */     this.Tail.a(f5);
/* 107 */     this.End.a(f5);
/* 108 */     this.Neck.a(f5);
/* 109 */     this.NeckPiece.a(f5);
/* 110 */     this.Head.a(f5);
/* 111 */     this.Snout.a(f5);
/* 112 */     this.Spikeythingleft.a(f5);
/* 113 */     this.Spikeythingright.a(f5);
/* 114 */     this.Swirlleft.a(f5);
/* 115 */     this.Swirlright.a(f5);
/* 116 */     this.SwirlEndleft.a(f5);
/* 117 */     this.SwirlEndright.a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ayf model, float x, float y, float z) {
/* 122 */     model.f = x;
/* 123 */     model.g = y;
/* 124 */     model.h = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float f, float f1, float f2, float f3, float f4, float f5, lq entity) {
/* 129 */     super.a(f, f1, f2, f3, f4, f5, entity);
/* 130 */     this.Head.g = f3 / 57.295776F;
/* 131 */     this.Head.f = f4 / 57.295776F;
/* 132 */     this.Snout.g = f3 / 57.295776F;
/* 133 */     this.Snout.f = f4 / 57.295776F;
/* 134 */     this.Spikeythingleft.g = f3 / 57.295776F;
/* 135 */     this.Spikeythingleft.f = f4 / 57.295776F;
/* 136 */     this.Spikeythingright.g = f3 / 57.295776F;
/* 137 */     this.Spikeythingright.f = f4 / 57.295776F;
/* 138 */     this.Swirlleft.g = f3 / 57.295776F;
/* 139 */     this.Swirlleft.f = f4 / 57.295776F;
/* 140 */     this.Swirlright.g = f3 / 57.295776F;
/* 141 */     this.Swirlright.f = f4 / 57.295776F;
/* 142 */     this.SwirlEndleft.g = f3 / 57.295776F;
/* 143 */     this.SwirlEndleft.f = f4 / 57.295776F;
/* 144 */     this.SwirlEndright.g = f3 / 57.295776F;
/* 145 */     this.SwirlEndright.f = f4 / 57.295776F;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel111.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */