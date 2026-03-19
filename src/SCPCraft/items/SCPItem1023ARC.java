/*    */ package SCPCraft.items;
/*    */ 
/*    */ import ModLoader;
/*    */ import SCPCraft.mod_SCP;
/*    */ import ayp;
/*    */ import ays;
/*    */ import lq;
/*    */ import md;
/*    */ import qx;
/*    */ import up;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ public class SCPItem1023ARC extends up {
/*    */   public SCPItem1023ARC(int i) {
/* 16 */     super(i);
/* 17 */     a(mod_SCP.tabSCP);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ur itemstack, md entityliving, md entityliving1) {
/* 22 */     ayp ayp = (ModLoader.getMinecraftInstance()).e;
/* 23 */     ays ays = (ModLoader.getMinecraftInstance()).g;
/*    */     
/* 25 */     a(itemstack, (yc)ayp, (qx)ays);
/* 26 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean n_() {
/* 31 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public ur a(ur par1ItemStack, yc par2World, qx par3EntityPlayer) {
/* 36 */     return par1ItemStack;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(lq par1Entity) {
/* 41 */     return 9999999;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 46 */     return "/SCPCraft/textures/SCPItems.png";
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem1023ARC.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */