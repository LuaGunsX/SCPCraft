/*    */ package SCPCraft.models;
/*    */ 
/*    */ import axa;
/*    */ import ayf;
/*    */ import lq;
/*    */ 
/*    */ 
/*    */ public class SCPModel173
/*    */   extends axa
/*    */ {
/*    */   ayf Head;
/*    */   ayf Body;
/*    */   ayf RightArm;
/*    */   ayf LeftArm;
/*    */   ayf RightLeg;
/*    */   ayf LeftLeg;
/*    */   
/*    */   public SCPModel173() {
/* 19 */     this.t = 128;
/* 20 */     this.u = 32;
/*    */     
/* 22 */     this.Head = new ayf(this, 0, 6);
/* 23 */     this.Head.a(-4.0F, -8.0F, -4.0F, 8, 8, 8);
/* 24 */     this.Head.a(0.0F, -10.0F, 0.0F);
/* 25 */     this.Head.b(128, 32);
/* 26 */     this.Head.i = true;
/* 27 */     setRotation(this.Head, 0.0F, 0.0F, 0.0F);
/* 28 */     this.Body = new ayf(this, 32, 0);
/* 29 */     this.Body.a(-4.0F, 0.0F, -2.0F, 8, 22, 4);
/* 30 */     this.Body.a(0.0F, -10.0F, 0.0F);
/* 31 */     this.Body.b(128, 32);
/* 32 */     this.Body.i = true;
/* 33 */     setRotation(this.Body, 0.0F, 0.0F, 0.0F);
/* 34 */     this.RightArm = new ayf(this, 70, 0);
/* 35 */     this.RightArm.a(-1.0F, -2.0F, -1.0F, 2, 13, 2);
/* 36 */     this.RightArm.a(-5.0F, -4.0F, 0.0F);
/* 37 */     this.RightArm.b(128, 32);
/* 38 */     this.RightArm.i = true;
/* 39 */     setRotation(this.RightArm, -1.623156F, 0.0F, 0.0F);
/* 40 */     this.LeftArm = new ayf(this, 70, 0);
/* 41 */     this.LeftArm.a(-1.0F, -2.0F, -1.0F, 2, 13, 2);
/* 42 */     this.LeftArm.a(5.0F, -4.0F, 0.0F);
/* 43 */     this.LeftArm.b(128, 32);
/* 44 */     this.LeftArm.i = true;
/* 45 */     setRotation(this.LeftArm, -1.570796F, 0.0F, 0.0F);
/* 46 */     this.RightLeg = new ayf(this, 57, 0);
/* 47 */     this.RightLeg.a(-1.0F, 0.0F, -1.0F, 2, 12, 2);
/* 48 */     this.RightLeg.a(-2.0F, 12.0F, 0.0F);
/* 49 */     this.RightLeg.b(128, 32);
/* 50 */     this.RightLeg.i = true;
/* 51 */     setRotation(this.RightLeg, 0.0F, 0.0F, 0.0F);
/* 52 */     this.LeftLeg = new ayf(this, 57, 0);
/* 53 */     this.LeftLeg.a(-1.0F, 0.0F, -1.0F, 2, 12, 2);
/* 54 */     this.LeftLeg.a(2.0F, 12.0F, 0.0F);
/* 55 */     this.LeftLeg.b(128, 32);
/* 56 */     this.LeftLeg.i = true;
/* 57 */     setRotation(this.LeftLeg, 0.0F, 0.0F, 0.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 62 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 63 */     a(f, f1, f2, f3, f4, f5, entity);
/* 64 */     this.Head.a(f5);
/* 65 */     this.Body.a(f5);
/* 66 */     this.RightArm.a(f5);
/* 67 */     this.LeftArm.a(f5);
/* 68 */     this.RightLeg.a(f5);
/* 69 */     this.LeftLeg.a(f5);
/*    */   }
/*    */ 
/*    */   
/*    */   private void setRotation(ayf model, float x, float y, float z) {
/* 74 */     model.f = x;
/* 75 */     model.g = y;
/* 76 */     model.h = z;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(float f, float f1, float f2, float f3, float f4, float f5, lq entity) {
/* 81 */     super.a(f, f1, f2, f3, f4, f5, entity);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel173.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */