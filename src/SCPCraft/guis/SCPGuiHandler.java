/*    */ package SCPCraft.guis;
/*    */ 
/*    */ import SCPCraft.containerslots.SCPContainer261;
/*    */ import SCPCraft.containerslots.SCPContainer294;
/*    */ import SCPCraft.containerslots.SCPContainer914;
/*    */ import SCPCraft.tileentities.SCPTileEntity261;
/*    */ import SCPCraft.tileentities.SCPTileEntity294;
/*    */ import SCPCraft.tileentities.SCPTileEntity914;
/*    */ import any;
/*    */ import cpw.mods.fml.common.network.IGuiHandler;
/*    */ import qx;
/*    */ import yc;
/*    */ 
/*    */ public class SCPGuiHandler
/*    */   implements IGuiHandler
/*    */ {
/*    */   public Object getServerGuiElement(int ID, qx player, yc world, int x, int y, int z) {
/* 18 */     any tileEntity = world.q(x, y, z);
/*    */     
/* 20 */     if (tileEntity instanceof SCPTileEntity914 && ID == 0)
/*    */     {
/* 22 */       return new SCPContainer914(player.bJ, (SCPTileEntity914)tileEntity);
/*    */     }
/* 24 */     if (tileEntity instanceof SCPTileEntity261 && ID == 1)
/*    */     {
/* 26 */       return new SCPContainer261(player.bJ, (SCPTileEntity261)tileEntity);
/*    */     }
/* 28 */     if (tileEntity instanceof SCPTileEntity294 && ID == 2)
/*    */     {
/* 30 */       return new SCPContainer294(player.bJ, (SCPTileEntity294)tileEntity);
/*    */     }
/* 32 */     if (ID == 3)
/*    */     {
/* 34 */       return new SCPGuiSCP294(player.bJ, (SCPTileEntity294)tileEntity);
/*    */     }
/*    */     
/* 37 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public Object getClientGuiElement(int ID, qx player, yc world, int x, int y, int z) {
/* 42 */     any tileEntity = world.q(x, y, z);
/*    */     
/* 44 */     if (tileEntity instanceof SCPTileEntity914 && ID == 0) {
/* 45 */       return new SCPGuiSCP914(player.bJ, (SCPTileEntity914)tileEntity);
/*    */     }
/* 47 */     if (tileEntity instanceof SCPTileEntity261 && ID == 1) {
/* 48 */       return new SCPGuiSCP261(player.bJ, (SCPTileEntity261)tileEntity);
/*    */     }
/* 50 */     if (tileEntity instanceof SCPTileEntity294 && ID == 2) {
/* 51 */       return new SCPGuiSCP294(player.bJ, (SCPTileEntity294)tileEntity);
/*    */     }
/* 53 */     if (ID == 3)
/*    */     {
/* 55 */       return new SCPGuiSCP294(player.bJ, (SCPTileEntity294)tileEntity);
/*    */     }
/*    */     
/* 58 */     return null;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/guis/SCPGuiHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */