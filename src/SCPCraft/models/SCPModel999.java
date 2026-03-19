/*    */ package SCPCraft.models;
/*    */ 
/*    */ import axa;
/*    */ import ayf;
/*    */ import lq;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SCPModel999
/*    */   extends axa
/*    */ {
/*    */   ayf slimeBodies;
/*    */   ayf slimeRightEye;
/*    */   ayf slimeLeftEye;
/*    */   ayf slimeMouth;
/*    */   
/*    */   public SCPModel999(int par1) {
/* 23 */     this.slimeBodies = new ayf(this, 0, par1);
/* 24 */     this.slimeBodies.a(-4.0F, 16.0F, -4.0F, 8, 8, 8);
/*    */     
/* 26 */     if (par1 > 0) {
/*    */       
/* 28 */       this.slimeBodies = new ayf(this, 0, par1);
/* 29 */       this.slimeBodies.a(-3.0F, 17.0F, -3.0F, 6, 6, 6);
/* 30 */       this.slimeRightEye = new ayf(this, 32, 0);
/* 31 */       this.slimeRightEye.a(-3.25F, 18.0F, -3.5F, 2, 2, 2);
/* 32 */       this.slimeLeftEye = new ayf(this, 32, 4);
/* 33 */       this.slimeLeftEye.a(1.25F, 18.0F, -3.5F, 2, 2, 2);
/* 34 */       this.slimeMouth = new ayf(this, 32, 8);
/* 35 */       this.slimeMouth.a(0.0F, 21.0F, -3.5F, 1, 1, 1);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(lq par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
/* 51 */     setRotationAngles(par2, par3, par4, par5, par6, par7);
/* 52 */     this.slimeBodies.a(par7);
/*    */     
/* 54 */     if (this.slimeRightEye != null) {
/*    */       
/* 56 */       this.slimeRightEye.a(par7);
/* 57 */       this.slimeLeftEye.a(par7);
/* 58 */       this.slimeMouth.a(par7);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel999.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */