/*    */ package SCPCraft.models;
/*    */ 
/*    */ import axa;
/*    */ import ayf;
/*    */ import lq;
/*    */ 
/*    */ 
/*    */ public class SCPModel294
/*    */   extends axa
/*    */ {
/*    */   ayf Main;
/*    */   ayf Keyboard;
/*    */   ayf Plate;
/*    */   
/*    */   public SCPModel294() {
/* 16 */     this.t = 64;
/* 17 */     this.u = 64;
/*    */     
/* 19 */     this.Main = new ayf(this, 0, 0);
/* 20 */     this.Main.a(0.0F, 0.0F, 0.0F, 12, 25, 8);
/* 21 */     this.Main.a(-6.0F, -1.0F, -3.0F);
/* 22 */     this.Main.b(64, 64);
/* 23 */     this.Main.i = true;
/* 24 */     setRotation(this.Main, 0.0F, 0.0F, 0.0F);
/* 25 */     this.Keyboard = new ayf(this, 2, 35);
/* 26 */     this.Keyboard.a(0.0F, 0.0F, 0.0F, 8, 5, 3);
/* 27 */     this.Keyboard.a(-4.0F, 8.0F, -3.0F);
/* 28 */     this.Keyboard.b(64, 64);
/* 29 */     this.Keyboard.i = true;
/* 30 */     setRotation(this.Keyboard, -0.418879F, 0.0F, 0.0F);
/* 31 */     this.Plate = new ayf(this, 2, 44);
/* 32 */     this.Plate.a(0.0F, 0.0F, 0.0F, 8, 11, 2);
/* 33 */     this.Plate.a(-4.0F, 13.0F, -5.0F);
/* 34 */     this.Plate.b(64, 64);
/* 35 */     this.Plate.i = true;
/* 36 */     setRotation(this.Plate, 0.0F, 0.0F, 0.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 41 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 42 */     a(f, f1, f2, f3, f4, f5, entity);
/* 43 */     this.Main.a(f5);
/* 44 */     this.Keyboard.a(f5);
/* 45 */     this.Plate.a(f5);
/*    */   }
/*    */ 
/*    */   
/*    */   public void renderModel(float f1) {
/* 50 */     this.Main.a(f1);
/* 51 */     this.Keyboard.a(f1);
/* 52 */     this.Plate.a(f1);
/*    */   }
/*    */ 
/*    */   
/*    */   private void setRotation(ayf model, float x, float y, float z) {
/* 57 */     model.f = x;
/* 58 */     model.g = y;
/* 59 */     model.h = z;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(float f, float f1, float f2, float f3, float f4, float f5, lq entity) {
/* 64 */     super.a(f, f1, f2, f3, f4, f5, entity);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel294.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */