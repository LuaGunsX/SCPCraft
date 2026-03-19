/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import aoh;
/*    */ import qx;
/*    */ import up;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ public class SCPItemCup
/*    */   extends up
/*    */ {
/*    */   public SCPItemCup(int par1) {
/* 14 */     super(par1);
/* 15 */     a(mod_SCP.tabCupsSCP);
/* 16 */     c(11);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ur a(ur par1ItemStack, yc par2World, qx par3EntityPlayer) {
/* 24 */     aoh movingobjectposition = a(par2World, par3EntityPlayer, true);
/*    */     
/* 26 */     if (movingobjectposition == null)
/*    */     {
/* 28 */       return par1ItemStack;
/*    */     }
/*    */     
/* 31 */     return par1ItemStack;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 36 */     return "/SCPCraft/textures/SCPItems.png";
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItemCup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */