/*    */ package SCPCraft.entities;
/*    */ 
/*    */ import lq;
/*    */ import md;
/*    */ import nh;
/*    */ import qx;
/*    */ 
/*    */ public class SCPEntityAILookAtTradePlayer extends nh {
/*    */   private final SCPEntity217Testificate theMerchant;
/*    */   
/*    */   public SCPEntityAILookAtTradePlayer(SCPEntity217Testificate par1SCPEntity217Testificate) {
/* 12 */     super((md)par1SCPEntity217Testificate, qx.class, 8.0F);
/* 13 */     this.theMerchant = par1SCPEntity217Testificate;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 21 */     if (this.theMerchant.isTrading()) {
/*    */       
/* 23 */       this.a = (lq)this.theMerchant.m_();
/* 24 */       return true;
/*    */     } 
/*    */ 
/*    */     
/* 28 */     return false;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntityAILookAtTradePlayer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */