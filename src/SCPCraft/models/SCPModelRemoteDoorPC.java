/*    */ package SCPCraft.models;
/*    */ 
/*    */ import SCPCraft.mod_Others;
/*    */ import axa;
/*    */ import ayf;
/*    */ import lq;
/*    */ 
/*    */ 
/*    */ public class SCPModelRemoteDoorPC
/*    */   extends axa
/*    */ {
/*    */   ayf Shape3;
/*    */   ayf Shape1;
/*    */   ayf Shape2;
/*    */   
/*    */   public SCPModelRemoteDoorPC() {
/* 17 */     this.t = 64;
/* 18 */     this.u = 64;
/*    */     
/* 20 */     this.Shape3 = new ayf(this, 0, 0);
/* 21 */     this.Shape3.a(0.0F, 0.0F, 0.0F, 14, 18, 12);
/* 22 */     this.Shape3.a(-7.0F, 6.0F, -6.0F);
/* 23 */     this.Shape3.b(64, 64);
/* 24 */     this.Shape3.i = true;
/* 25 */     setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
/* 26 */     this.Shape1 = new ayf(this, 1, 32);
/* 27 */     this.Shape1.a(0.0F, 0.0F, 0.0F, 14, 16, 6);
/* 28 */     this.Shape1.a(-7.0F, -10.0F, 0.0F);
/* 29 */     this.Shape1.b(64, 64);
/* 30 */     this.Shape1.i = true;
/* 31 */     setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
/* 32 */     this.Shape2 = new ayf(this, 1, 1);
/* 33 */     this.Shape2.a(0.0F, 0.0F, 0.0F, 1, 2, 1);
/* 34 */     this.Shape2.b(64, 64);
/* 35 */     this.Shape2.i = true;
/*    */     
/* 37 */     if (mod_Others.remoteDoorActivate) {
/*    */       
/* 39 */       this.Shape2.a(3.0F, 4.0F, -4.0F);
/*    */     }
/* 41 */     else if (!mod_Others.remoteDoorActivate) {
/*    */       
/* 43 */       this.Shape2.a(5.0F, 4.0F, -4.0F);
/*    */     } 
/* 45 */     setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(lq entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 50 */     super.a(entity, f, f1, f2, f3, f4, f5);
/* 51 */     a(f, f1, f2, f3, f4, f5, entity);
/* 52 */     this.Shape3.a(f5);
/* 53 */     this.Shape1.a(f5);
/* 54 */     this.Shape2.a(f5);
/*    */     
/* 56 */     if (mod_Others.remoteDoorActivate) {
/*    */       
/* 58 */       this.Shape2.a(3.0F, 4.0F, -4.0F);
/*    */     }
/* 60 */     else if (!mod_Others.remoteDoorActivate) {
/*    */       
/* 62 */       this.Shape2.a(5.0F, 4.0F, -4.0F);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void renderModel(float f1) {
/* 68 */     this.Shape3.a(f1);
/* 69 */     this.Shape1.a(f1);
/* 70 */     this.Shape2.a(f1);
/*    */     
/* 72 */     if (mod_Others.remoteDoorActivate) {
/*    */       
/* 74 */       this.Shape2.a(3.0F, 4.0F, -4.0F);
/*    */     }
/* 76 */     else if (!mod_Others.remoteDoorActivate) {
/*    */       
/* 78 */       this.Shape2.a(5.0F, 4.0F, -4.0F);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   private void setRotation(ayf model, float x, float y, float z) {
/* 84 */     model.f = x;
/* 85 */     model.g = y;
/* 86 */     model.h = z;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(float f, float f1, float f2, float f3, float f4, float f5, lq entity) {
/* 91 */     super.a(f, f1, f2, f3, f4, f5, entity);
/*    */     
/* 93 */     if (mod_Others.remoteDoorActivate) {
/*    */       
/* 95 */       this.Shape2.a(3.0F, 4.0F, -4.0F);
/*    */     }
/* 97 */     else if (!mod_Others.remoteDoorActivate) {
/*    */       
/* 99 */       this.Shape2.a(5.0F, 4.0F, -4.0F);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModelRemoteDoorPC.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */