/*    */ package SCPCraft.models;
/*    */ 
/*    */ import axa;
/*    */ import ayf;
/*    */ import lq;
/*    */ 
/*    */ 
/*    */ public class SCPModel472
/*    */   extends axa
/*    */ {
/*    */   ayf Shape1;
/*    */   ayf Shape2;
/*    */   ayf Shape3;
/*    */   ayf Shape4;
/*    */   ayf Shape5;
/*    */   
/*    */   public SCPModel472() {
/* 18 */     this.t = 64;
/* 19 */     this.u = 64;
/*    */     
/* 21 */     this.Shape1 = new ayf(this, 0, 0);
/* 22 */     this.Shape1.a(1.0F, 0.0F, 1.0F, 8, 4, 8);
/* 23 */     this.Shape1.a(-5.0F, 19.0F, -5.0F);
/* 24 */     this.Shape1.b(64, 64);
/* 25 */     this.Shape1.i = true;
/* 26 */     setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
/* 27 */     this.Shape2 = new ayf(this, 0, 24);
/* 28 */     this.Shape2.a(2.0F, -1.0F, 1.0F, 7, 1, 8);
/* 29 */     this.Shape2.a(-5.0F, 19.0F, -5.0F);
/* 30 */     this.Shape2.b(64, 64);
/* 31 */     this.Shape2.i = true;
/* 32 */     setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
/* 33 */     this.Shape3 = new ayf(this, 19, 13);
/* 34 */     this.Shape3.a(1.0F, 0.0F, 1.0F, 7, 1, 8);
/* 35 */     this.Shape3.a(-5.0F, 23.0F, -5.0F);
/* 36 */     this.Shape3.b(64, 64);
/* 37 */     this.Shape3.i = true;
/* 38 */     setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
/* 39 */     this.Shape4 = new ayf(this, 0, 14);
/* 40 */     this.Shape4.a(2.0F, 0.0F, 1.0F, 7, 4, 1);
/* 41 */     this.Shape4.a(-5.0F, 19.0F, -6.0F);
/* 42 */     this.Shape4.b(64, 64);
/* 43 */     this.Shape4.i = true;
/* 44 */     setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
/* 45 */     this.Shape5 = new ayf(this, 0, 35);
/* 46 */     this.Shape5.a(2.0F, 0.0F, 1.0F, 7, 4, 1);
/* 47 */     this.Shape5.a(-6.0F, 19.0F, 3.0F);
/* 48 */     this.Shape5.b(64, 64);
/* 49 */     this.Shape5.i = true;
/* 50 */     setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 55 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 56 */     a(f, f1, f2, f3, f4, f5, entity);
/* 57 */     this.Shape1.a(f5);
/* 58 */     this.Shape2.a(f5);
/* 59 */     this.Shape3.a(f5);
/* 60 */     this.Shape4.a(f5);
/* 61 */     this.Shape5.a(f5);
/*    */   }
/*    */ 
/*    */   
/*    */   private void setRotation(ayf model, float x, float y, float z) {
/* 66 */     model.f = x;
/* 67 */     model.g = y;
/* 68 */     model.h = z;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(float f, float f1, float f2, float f3, float f4, float f5, lq entity) {
/* 73 */     super.a(f, f1, f2, f3, f4, f5, entity);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel472.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */