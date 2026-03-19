/*    */ package SCPCraft.models;
/*    */ 
/*    */ import axa;
/*    */ import ayf;
/*    */ import lq;
/*    */ 
/*    */ 
/*    */ public class SCPModel261
/*    */   extends axa
/*    */ {
/*    */   ayf BoxHead;
/*    */   
/*    */   public SCPModel261() {
/* 14 */     this.t = 64;
/* 15 */     this.u = 64;
/*    */     
/* 17 */     this.BoxHead = new ayf(this, 0, 0);
/* 18 */     this.BoxHead.a(0.0F, 0.0F, 0.0F, 12, 24, 10);
/* 19 */     this.BoxHead.a(-6.0F, 0.0F, -5.0F);
/* 20 */     this.BoxHead.b(64, 64);
/* 21 */     this.BoxHead.i = true;
/* 22 */     setRotation(this.BoxHead, 0.0F, 0.0F, 0.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 27 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 28 */     a(f, f1, f2, f3, f4, f5, entity);
/* 29 */     this.BoxHead.a(f5);
/*    */   }
/*    */ 
/*    */   
/*    */   public void renderModel(float f1) {
/* 34 */     this.BoxHead.a(f1);
/*    */   }
/*    */ 
/*    */   
/*    */   private void setRotation(ayf model, float x, float y, float z) {
/* 39 */     model.f = x;
/* 40 */     model.g = y;
/* 41 */     model.h = z;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(float f, float f1, float f2, float f3, float f4, float f5, lq entity) {
/* 46 */     super.a(f, f1, f2, f3, f4, f5, entity);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel261.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */