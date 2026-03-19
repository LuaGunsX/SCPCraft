/*    */ package SCPCraft.models;
/*    */ 
/*    */ import aww;
/*    */ import axa;
/*    */ import ayf;
/*    */ import lq;
/*    */ 
/*    */ public class SCPModel513
/*    */   extends aww {
/*    */   public SCPModel513() {
/* 11 */     float f = 0.0F;
/* 12 */     this.f = new ayf((axa)this, 40, 16);
/* 13 */     this.f.a(-1.0F, -2.0F, -1.0F, 2, 12, 2, f);
/* 14 */     this.f.a(-5.0F, 2.0F, 0.0F);
/* 15 */     this.g = new ayf((axa)this, 40, 16);
/* 16 */     this.g.i = true;
/* 17 */     this.g.a(-1.0F, -2.0F, -1.0F, 2, 12, 2, f);
/* 18 */     this.g.a(5.0F, 2.0F, 15.0F);
/* 19 */     this.h = new ayf((axa)this, 0, 16);
/* 20 */     this.h.a(-1.0F, 0.0F, -1.0F, 2, 12, 2, f);
/* 21 */     this.h.a(-2.0F, 12.0F, 0.0F);
/* 22 */     this.i = new ayf((axa)this, 0, 16);
/* 23 */     this.i.i = true;
/* 24 */     this.i.a(-1.0F, 0.0F, -1.0F, 2, 12, 2, f);
/* 25 */     this.i.a(2.0F, 12.0F, 0.0F);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(float par1, float par2, float par3, float par4, float par5, float par6, lq entity) {
/* 33 */     super.a(par1, par2, par3, par4, par5, par6, entity);
/*    */   }
/*    */ 
/*    */   
/*    */   private void setRotation(ayf model, float x, float y, float z) {
/* 38 */     model.f = x;
/* 39 */     model.g = y;
/* 40 */     model.h = z;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/models/SCPModel513.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */