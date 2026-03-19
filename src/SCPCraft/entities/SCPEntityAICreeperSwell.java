/*    */ package SCPCraft.entities;
/*    */ 
/*    */ import lq;
/*    */ import md;
/*    */ import nc;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SCPEntityAICreeperSwell
/*    */   extends nc
/*    */ {
/*    */   SCPEntity217Creeper swellingCreeper;
/*    */   md creeperAttackTarget;
/*    */   
/*    */   public SCPEntityAICreeperSwell(SCPEntity217Creeper par1SCPEntity217Creeper) {
/* 18 */     this.swellingCreeper = par1SCPEntity217Creeper;
/* 19 */     a(1);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 27 */     md var1 = this.swellingCreeper.aG();
/* 28 */     return (this.swellingCreeper.getCreeperState() > 0 || (var1 != null && this.swellingCreeper.e((lq)var1) < 9.0D));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void c() {
/* 36 */     this.swellingCreeper.az().g();
/* 37 */     this.creeperAttackTarget = this.swellingCreeper.aG();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void d() {
/* 45 */     this.creeperAttackTarget = null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void e() {
/* 53 */     if (this.creeperAttackTarget == null) {
/*    */       
/* 55 */       this.swellingCreeper.setCreeperState(-1);
/*    */     }
/* 57 */     else if (this.swellingCreeper.e((lq)this.creeperAttackTarget) > 49.0D) {
/*    */       
/* 59 */       this.swellingCreeper.setCreeperState(-1);
/*    */     }
/* 61 */     else if (!this.swellingCreeper.aA().a((lq)this.creeperAttackTarget)) {
/*    */       
/* 63 */       this.swellingCreeper.setCreeperState(-1);
/*    */     }
/*    */     else {
/*    */       
/* 67 */       this.swellingCreeper.setCreeperState(1);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntityAICreeperSwell.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */