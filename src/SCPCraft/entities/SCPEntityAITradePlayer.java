/*    */ package SCPCraft.entities;
/*    */ 
/*    */ import lq;
/*    */ import nc;
/*    */ import qx;
/*    */ 
/*    */ public class SCPEntityAITradePlayer
/*    */   extends nc
/*    */ {
/*    */   private SCPEntity217Testificate villager;
/*    */   
/*    */   public SCPEntityAITradePlayer(SCPEntity217Testificate par1SCPEntity217Testificate) {
/* 13 */     this.villager = par1SCPEntity217Testificate;
/* 14 */     a(5);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 22 */     if (!this.villager.S())
/*    */     {
/* 24 */       return false;
/*    */     }
/* 26 */     if (this.villager.H())
/*    */     {
/* 28 */       return false;
/*    */     }
/* 30 */     if (!this.villager.E)
/*    */     {
/* 32 */       return false;
/*    */     }
/* 34 */     if (this.villager.I)
/*    */     {
/* 36 */       return false;
/*    */     }
/*    */ 
/*    */     
/* 40 */     qx var1 = this.villager.m_();
/* 41 */     return (var1 == null) ? false : ((this.villager.e((lq)var1) > 16.0D) ? false : (var1.bL instanceof rq));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void c() {
/* 50 */     this.villager.az().g();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void d() {
/* 58 */     this.villager.b_((qx)null);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntityAITradePlayer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */