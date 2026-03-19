/*    */ package SCPCraft.models;
/*    */ 
/*    */ import axa;
/*    */ import ayf;
/*    */ import lq;
/*    */ 
/*    */ 
/*    */ public class SCPModelRat
/*    */   extends axa
/*    */ {
/*    */   ayf Head;
/*    */   ayf Body;
/*    */   ayf Tail;
/*    */   public boolean Armed;
/*    */   
/*    */   public SCPModelRat() {
/* 17 */     this.Armed = false;
/* 18 */     this.t = 64;
/* 19 */     this.u = 32;
/*    */ 
/*    */ 
/*    */     
/* 23 */     this.Body = new ayf(this, 0, 5);
/* 24 */     this.Body.a(-1.5F, -1.5F, -2.0F, 3, 3, 4);
/* 25 */     this.Body.a(0.0F, 22.5F, 0.0F);
/* 26 */     this.Body.b(64, 32);
/* 27 */     this.Body.i = true;
/* 28 */     setRotation(this.Body, 0.0F, 0.0F, 0.0F);
/* 29 */     this.Head = new ayf(this, 0, 0);
/* 30 */     this.Head.a(-1.5F, -1.0F, -2.0F, 3, 2, 2);
/* 31 */     this.Head.a(0.0F, 23.0F, -2.0F);
/* 32 */     this.Head.b(64, 32);
/* 33 */     this.Head.i = true;
/* 34 */     setRotation(this.Head, 0.0F, 0.0F, 0.0F);
/* 35 */     this.Tail = new ayf(this, 10, 0);
/* 36 */     this.Tail.a(-0.5F, 0.0F, 0.0F, 1, 1, 4);
/* 37 */     this.Tail.a(0.0F, 23.0F, 2.0F);
/* 38 */     this.Tail.b(64, 32);
/* 39 */     this.Tail.i = true;
/* 40 */     setRotation(this.Tail, 0.0F, 0.0F, 0.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 45 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 46 */     a(f, f1, f2, f3, f4, f5, entity);
/* 47 */     this.Head.a(f5);
/* 48 */     this.Body.a(f5);
/* 49 */     this.Tail.a(f5);
/*    */   }
/*    */ 
/*    */   
/*    */   private void setRotation(ayf model, float x, float y, float z) {
/* 54 */     model.f = x;
/* 55 */     model.g = y;
/* 56 */     model.h = z;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(float f, float f1, float f2, float f3, float f4, float f5, lq entity) {
/* 61 */     super.a(f, f1, f2, f3, f4, f5, entity);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModelRat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */