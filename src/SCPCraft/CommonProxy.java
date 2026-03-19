/*    */ package SCPCraft;
/*    */ 
/*    */ import cpw.mods.fml.common.network.IGuiHandler;
/*    */ import qx;
/*    */ import yc;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CommonProxy
/*    */   implements IGuiHandler
/*    */ {
/*    */   public void registerRenderInformation() {}
/*    */   
/*    */   public Object getServerGuiElement(int ID, qx player, yc world, int x, int y, int z) {
/* 16 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public Object getClientGuiElement(int ID, qx player, yc world, int x, int y, int z) {
/* 21 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public yc getClientWorld() {
/* 26 */     return null;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CommonProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */