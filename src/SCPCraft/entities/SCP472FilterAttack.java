/*    */ package SCPCraft.entities;
/*    */ 
/*    */ import lq;
/*    */ import ly;
/*    */ import md;
/*    */ 
/*    */ final class SCP472FilterAttack
/*    */   implements ly
/*    */ {
/*    */   public boolean a(lq par1Entity) {
/* 11 */     return (par1Entity instanceof md && ((md)par1Entity).getSCPAttribute() != SCPEnumCreatureAttribute.SCPObject);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCP472FilterAttack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */