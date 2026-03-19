/*    */ package SCPCraft.entities;
/*    */ 
/*    */ import lq;
/*    */ import ly;
/*    */ import md;
/*    */ 
/*    */ 
/*    */ 
/*    */ final class SCPFilterAttack
/*    */   implements ly
/*    */ {
/*    */   public boolean a(lq par1Entity) {
/* 13 */     return (par1Entity instanceof md && !(par1Entity instanceof ow) && !(par1Entity instanceof ph) && ((md)par1Entity).getSCPAttribute() != SCPEnumCreatureAttribute.SCP && ((md)par1Entity).getSCPAttribute() != SCPEnumCreatureAttribute.SCPObject);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPFilterAttack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */