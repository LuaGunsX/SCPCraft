/*    */ package SCPCraft.models;
/*    */ 
/*    */ import axa;
/*    */ import ayf;
/*    */ import lq;
/*    */ 
/*    */ 
/*    */ public class SCPModel217Creeper
/*    */   extends axa
/*    */ {
/*    */   ayf head;
/*    */   ayf body;
/*    */   ayf leg3;
/*    */   ayf thing;
/*    */   
/*    */   public SCPModel217Creeper() {
/* 17 */     this.t = 64;
/* 18 */     this.u = 32;
/*    */     
/* 20 */     this.head = new ayf(this, 0, 0);
/* 21 */     this.head.a(-4.0F, -8.0F, -4.0F, 8, 8, 8);
/* 22 */     this.head.a(0.0F, 6.0F, 0.0F);
/* 23 */     this.head.b(64, 32);
/* 24 */     this.head.i = true;
/* 25 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/* 26 */     this.body = new ayf(this, 38, 1);
/* 27 */     this.body.a(-4.0F, 0.0F, -2.0F, 8, 12, 4);
/* 28 */     this.body.a(0.0F, 6.0F, 0.0F);
/* 29 */     this.body.b(64, 32);
/* 30 */     this.body.i = true;
/* 31 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/* 32 */     this.leg3 = new ayf(this, 1, 16);
/* 33 */     this.leg3.a(-2.0F, 0.0F, -1.0F, 8, 6, 10);
/* 34 */     this.leg3.a(-2.0F, 18.0F, -4.0F);
/* 35 */     this.leg3.b(64, 32);
/* 36 */     this.leg3.i = true;
/* 37 */     setRotation(this.leg3, 0.0F, 0.0F, 0.0F);
/* 38 */     this.thing = new ayf(this, 48, 19);
/* 39 */     this.thing.a(-3.0F, 1.0F, -3.0F, 6, 9, 1);
/* 40 */     this.thing.a(0.0F, 6.0F, 0.0F);
/* 41 */     this.thing.b(64, 32);
/* 42 */     this.thing.i = true;
/* 43 */     setRotation(this.thing, 0.0F, 0.0F, 0.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 48 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 49 */     a(f, f1, f2, f3, f4, f5, entity);
/* 50 */     this.head.a(f5);
/* 51 */     this.body.a(f5);
/* 52 */     this.leg3.a(f5);
/* 53 */     this.thing.a(f5);
/*    */   }
/*    */ 
/*    */   
/*    */   private void setRotation(ayf model, float x, float y, float z) {
/* 58 */     model.f = x;
/* 59 */     model.g = y;
/* 60 */     model.h = z;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(float f, float f1, float f2, float f3, float f4, float f5, lq entity) {
/* 65 */     super.a(f, f1, f2, f3, f4, f5, entity);
/* 66 */     this.head.g = f3 / 57.295776F;
/* 67 */     this.head.f = f4 / 57.295776F;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel217Creeper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */