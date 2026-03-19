/*    */ package SCPCraft.entities;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import lq;
/*    */ import ly;
/*    */ import md;
/*    */ 
/*    */ final class SCPFilterRatAttack
/*    */   implements ly
/*    */ {
/*    */   public boolean a(lq par1Entity) {
/* 12 */     return (par1Entity instanceof md && ((md)par1Entity).a(mod_SCP.verminGod));
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPFilterRatAttack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */