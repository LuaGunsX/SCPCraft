/*    */ package SCPCraft;
/*    */ 
/*    */ import ce;
/*    */ import cpw.mods.fml.common.network.IPacketHandler;
/*    */ import cpw.mods.fml.common.network.Player;
/*    */ import di;
/*    */ import java.io.ByteArrayInputStream;
/*    */ import java.io.DataInputStream;
/*    */ import qx;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SCPServerPacketHandler
/*    */   implements IPacketHandler
/*    */ {
/*    */   public void onPacketData(ce manager, di packet, Player player) {
/* 22 */     DataInputStream data = new DataInputStream(new ByteArrayInputStream(packet.c));
/* 23 */     qx sender = (qx)player;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/SCPServerPacketHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */