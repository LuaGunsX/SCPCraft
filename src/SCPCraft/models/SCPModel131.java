/*    */ package SCPCraft.models;
/*    */ 
/*    */ import axa;
/*    */ import ayf;
/*    */ import lq;
/*    */ 
/*    */ 
/*    */ public class SCPModel131
/*    */   extends axa
/*    */ {
/*    */   ayf body;
/*    */   ayf Tail;
/*    */   ayf tail2;
/*    */   ayf rim1;
/*    */   ayf rim2;
/*    */   ayf rim3;
/*    */   ayf rim4;
/*    */   ayf eye;
/*    */   
/*    */   public SCPModel131() {
/* 21 */     this.t = 64;
/* 22 */     this.u = 32;
/*    */     
/* 24 */     this.body = new ayf(this, 12, 1);
/* 25 */     this.body.a(-3.0F, 0.0F, -3.0F, 7, 6, 8);
/* 26 */     this.body.a(0.0F, 19.0F, 2.0F);
/* 27 */     this.body.b(64, 32);
/* 28 */     this.body.i = true;
/* 29 */     setRotation(this.body, -1.570796F, 0.0F, 0.0F);
/* 30 */     this.Tail = new ayf(this, 49, 7);
/* 31 */     this.Tail.a(-1.0F, -3.0F, -4.0F, 3, 3, 4);
/* 32 */     this.Tail.a(0.0F, 19.0F, 2.0F);
/* 33 */     this.Tail.b(64, 32);
/* 34 */     this.Tail.i = true;
/* 35 */     setRotation(this.Tail, -0.7853982F, 0.0F, 0.0F);
/* 36 */     this.tail2 = new ayf(this, 53, 1);
/* 37 */     this.tail2.a(0.0F, -6.0F, -3.0F, 1, 3, 2);
/* 38 */     this.tail2.a(0.0F, 19.0F, 2.0F);
/* 39 */     this.tail2.b(64, 32);
/* 40 */     this.tail2.i = true;
/* 41 */     setRotation(this.tail2, -0.7853982F, 0.0F, 0.0F);
/* 42 */     this.rim1 = new ayf(this, 18, 16);
/* 43 */     this.rim1.a(-3.0F, 6.0F, -3.0F, 7, 1, 2);
/* 44 */     this.rim1.a(0.0F, 19.0F, 2.0F);
/* 45 */     this.rim1.b(64, 32);
/* 46 */     this.rim1.i = true;
/* 47 */     setRotation(this.rim1, -1.570796F, 0.0F, 0.0F);
/* 48 */     this.rim2 = new ayf(this, 1, 16);
/* 49 */     this.rim2.a(-3.0F, 6.0F, -2.0F, 1, 1, 7);
/* 50 */     this.rim2.a(0.0F, 19.0F, 2.0F);
/* 51 */     this.rim2.b(64, 32);
/* 52 */     this.rim2.i = true;
/* 53 */     setRotation(this.rim2, -1.570796F, 0.0F, 0.0F);
/* 54 */     this.rim3 = new ayf(this, 19, 21);
/* 55 */     this.rim3.a(-2.0F, 6.0F, 3.0F, 6, 1, 2);
/* 56 */     this.rim3.a(0.0F, 19.0F, 2.0F);
/* 57 */     this.rim3.b(64, 32);
/* 58 */     this.rim3.i = true;
/* 59 */     setRotation(this.rim3, -1.570796F, 0.0F, 0.0F);
/* 60 */     this.rim4 = new ayf(this, 37, 17);
/* 61 */     this.rim4.a(3.0F, 6.0F, -2.0F, 1, 1, 6);
/* 62 */     this.rim4.a(0.0F, 19.0F, 2.0F);
/* 63 */     this.rim4.b(64, 32);
/* 64 */     this.rim4.i = true;
/* 65 */     setRotation(this.rim4, -1.570796F, 0.0F, 0.0F);
/* 66 */     this.eye = new ayf(this, 22, 27);
/* 67 */     this.eye.a(-1.0F, 6.0F, 0.0F, 3, 1, 2);
/* 68 */     this.eye.a(0.0F, 19.0F, 2.0F);
/* 69 */     this.eye.b(64, 32);
/* 70 */     this.eye.i = true;
/* 71 */     setRotation(this.eye, -1.570796F, 0.0F, 0.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 76 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 77 */     a(f, f1, f2, f3, f4, f5, entity);
/* 78 */     this.body.a(f5);
/* 79 */     this.Tail.a(f5);
/* 80 */     this.tail2.a(f5);
/* 81 */     this.rim1.a(f5);
/* 82 */     this.rim2.a(f5);
/* 83 */     this.rim3.a(f5);
/* 84 */     this.rim4.a(f5);
/* 85 */     this.eye.a(f5);
/*    */   }
/*    */ 
/*    */   
/*    */   private void setRotation(ayf model, float x, float y, float z) {
/* 90 */     model.f = x;
/* 91 */     model.g = y;
/* 92 */     model.h = z;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(float f, float f1, float f2, float f3, float f4, float f5, lq entity) {
/* 97 */     super.a(f, f1, f2, f3, f4, f5, entity);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel131.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */