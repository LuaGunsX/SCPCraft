/*    */ package SCPCraft.models;
/*    */ 
/*    */ import axa;
/*    */ import ayf;
/*    */ import lq;
/*    */ 
/*    */ 
/*    */ public class SCPModel096Docile
/*    */   extends axa
/*    */ {
/*    */   ayf head;
/*    */   ayf body;
/*    */   ayf rightarm;
/*    */   ayf leftarm;
/*    */   ayf rightleg;
/*    */   ayf leftleg;
/*    */   ayf neck;
/*    */   ayf mouth;
/*    */   
/*    */   public SCPModel096Docile() {
/* 21 */     this.t = 64;
/* 22 */     this.u = 32;
/*    */     
/* 24 */     this.head = new ayf(this, 21, 1);
/* 25 */     this.head.a(-3.0F, -8.0F, -4.0F, 6, 6, 6);
/* 26 */     this.head.a(0.0F, 10.0F, -1.0F);
/* 27 */     this.head.b(64, 32);
/* 28 */     this.head.i = true;
/* 29 */     setRotation(this.head, 0.296706F, 0.0F, 0.0F);
/* 30 */     this.body = new ayf(this, 36, 17);
/* 31 */     this.body.a(-3.0F, 0.0F, -1.0F, 6, 12, 2);
/* 32 */     this.body.a(0.0F, 10.0F, -1.0F);
/* 33 */     this.body.b(64, 32);
/* 34 */     this.body.i = true;
/* 35 */     setRotation(this.body, 0.1919862F, 0.0F, 0.0F);
/* 36 */     this.rightarm = new ayf(this, 54, 1);
/* 37 */     this.rightarm.a(-2.0F, -2.0F, -1.0F, 2, 15, 2);
/* 38 */     this.rightarm.a(-3.0F, 12.0F, -1.0F);
/* 39 */     this.rightarm.b(64, 32);
/* 40 */     this.rightarm.i = true;
/* 41 */     setRotation(this.rightarm, -0.4537856F, 0.0F, 0.1047198F);
/* 42 */     this.leftarm = new ayf(this, 54, 1);
/* 43 */     this.leftarm.a(0.0F, -2.0F, -1.0F, 2, 15, 2);
/* 44 */     this.leftarm.a(3.0F, 12.0F, -1.0F);
/* 45 */     this.leftarm.b(64, 32);
/* 46 */     this.leftarm.i = true;
/* 47 */     setRotation(this.leftarm, -0.296706F, -0.1396263F, 0.0F);
/* 48 */     this.rightleg = new ayf(this, 1, 4);
/* 49 */     this.rightleg.a(-1.0F, 0.0F, -1.0F, 2, 15, 2);
/* 50 */     this.rightleg.a(-2.0F, 22.0F, 2.0F);
/* 51 */     this.rightleg.b(64, 32);
/* 52 */     this.rightleg.i = true;
/* 53 */     setRotation(this.rightleg, -1.43117F, 0.0F, 0.0F);
/* 54 */     this.leftleg = new ayf(this, 1, 4);
/* 55 */     this.leftleg.a(-1.0F, 0.0F, -1.0F, 2, 15, 2);
/* 56 */     this.leftleg.a(2.0F, 22.0F, 2.0F);
/* 57 */     this.leftleg.b(64, 32);
/* 58 */     this.leftleg.i = true;
/* 59 */     setRotation(this.leftleg, -1.466077F, 0.0F, 0.0F);
/* 60 */     this.neck = new ayf(this, 10, 1);
/* 61 */     this.neck.a(-2.0F, -2.0F, 0.0F, 4, 2, 1);
/* 62 */     this.neck.a(0.0F, 10.0F, -1.0F);
/* 63 */     this.neck.b(64, 32);
/* 64 */     this.neck.i = true;
/* 65 */     setRotation(this.neck, 0.1919862F, 0.0F, 0.0F);
/* 66 */     this.mouth = new ayf(this, 15, 14);
/* 67 */     this.mouth.a(-3.0F, -2.0F, -4.0F, 6, 3, 2);
/* 68 */     this.mouth.a(0.0F, 10.0F, -1.0F);
/* 69 */     this.mouth.b(64, 32);
/* 70 */     this.mouth.i = true;
/* 71 */     setRotation(this.mouth, 0.296706F, 0.0F, 0.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 76 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 77 */     a(f, f1, f2, f3, f4, f5, entity);
/* 78 */     this.head.a(f5);
/* 79 */     this.body.a(f5);
/* 80 */     this.rightarm.a(f5);
/* 81 */     this.leftarm.a(f5);
/* 82 */     this.rightleg.a(f5);
/* 83 */     this.leftleg.a(f5);
/* 84 */     this.neck.a(f5);
/* 85 */     this.mouth.a(f5);
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


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel096Docile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */