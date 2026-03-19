/*    */ package SCPCraft.models;
/*    */ 
/*    */ import axa;
/*    */ import ayf;
/*    */ import ke;
/*    */ import lq;
/*    */ 
/*    */ 
/*    */ public class SCPModel106
/*    */   extends axa
/*    */ {
/*    */   ayf head;
/*    */   ayf body;
/*    */   ayf rightarm;
/*    */   ayf leftarm;
/*    */   ayf rightleg;
/*    */   ayf leftleg;
/*    */   
/*    */   public SCPModel106() {
/* 20 */     this.t = 64;
/* 21 */     this.u = 32;
/*    */     
/* 23 */     this.head = new ayf(this, 0, 0);
/* 24 */     this.head.a(-4.0F, -8.0F, -4.0F, 8, 8, 8);
/* 25 */     this.head.a(0.0F, 0.0F, 0.0F);
/* 26 */     this.head.b(64, 32);
/* 27 */     this.head.i = true;
/* 28 */     setRotation(this.head, 0.0F, 0.0F, 0.0F);
/* 29 */     this.body = new ayf(this, 16, 16);
/* 30 */     this.body.a(-4.0F, 0.0F, -2.0F, 8, 12, 4);
/* 31 */     this.body.a(0.0F, 0.0F, 0.0F);
/* 32 */     this.body.b(64, 32);
/* 33 */     this.body.i = true;
/* 34 */     setRotation(this.body, 0.0F, 0.0F, 0.0F);
/* 35 */     this.rightarm = new ayf(this, 40, 16);
/* 36 */     this.rightarm.a(-3.0F, -2.0F, -2.0F, 4, 12, 4);
/* 37 */     this.rightarm.a(-5.0F, 2.0F, 0.0F);
/* 38 */     this.rightarm.b(64, 32);
/* 39 */     this.rightarm.i = true;
/* 40 */     setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
/* 41 */     this.leftarm = new ayf(this, 40, 16);
/* 42 */     this.leftarm.a(-1.0F, -2.0F, -2.0F, 4, 12, 4);
/* 43 */     this.leftarm.a(5.0F, 2.0F, 0.0F);
/* 44 */     this.leftarm.b(64, 32);
/* 45 */     this.leftarm.i = true;
/* 46 */     setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
/* 47 */     this.rightleg = new ayf(this, 0, 16);
/* 48 */     this.rightleg.a(-2.0F, 0.0F, -2.0F, 4, 12, 4);
/* 49 */     this.rightleg.a(-2.0F, 12.0F, 0.0F);
/* 50 */     this.rightleg.b(64, 32);
/* 51 */     this.rightleg.i = true;
/* 52 */     setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
/* 53 */     this.leftleg = new ayf(this, 0, 16);
/* 54 */     this.leftleg.a(-2.0F, 0.0F, -2.0F, 4, 12, 4);
/* 55 */     this.leftleg.a(2.0F, 12.0F, 0.0F);
/* 56 */     this.leftleg.b(64, 32);
/* 57 */     this.leftleg.i = true;
/* 58 */     setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 63 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 64 */     a(f, f1, f2, f3, f4, f5, entity);
/* 65 */     this.head.a(f5);
/* 66 */     this.body.a(f5);
/* 67 */     this.rightarm.a(f5);
/* 68 */     this.leftarm.a(f5);
/* 69 */     this.rightleg.a(f5);
/* 70 */     this.leftleg.a(f5);
/*    */   }
/*    */ 
/*    */   
/*    */   private void setRotation(ayf model, float x, float y, float z) {
/* 75 */     model.f = x;
/* 76 */     model.g = y;
/* 77 */     model.h = z;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(float f, float f1, float f2, float f3, float f4, float f5, lq entity) {
/* 82 */     super.a(f, f1, f2, f3, f4, f5, entity);
/* 83 */     this.head.g = f3 / 57.295776F;
/* 84 */     this.head.f = f4 / 57.295776F;
/* 85 */     this.rightleg.f = ke.b(f * 0.6662F) * 1.4F * f1;
/* 86 */     this.leftleg.f = ke.b(f * 0.6662F + 3.1415927F) * 1.4F * f1;
/* 87 */     this.rightleg.g = 0.0F;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel106.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */