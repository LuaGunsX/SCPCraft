/*    */ package SCPCraft;
/*    */ 
/*    */ import ce;
/*    */ import cpw.mods.fml.common.network.IPacketHandler;
/*    */ import cpw.mods.fml.common.network.Player;
/*    */ import di;
/*    */ import java.io.ByteArrayInputStream;
/*    */ import java.io.DataInputStream;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class SCPClientPacketHandler
/*    */   implements IPacketHandler
/*    */ {
/*    */   private void handleRandom(di packet) {
/*    */     int randomInt1, randomInt2;
/* 16 */     DataInputStream inputStream = new DataInputStream(new ByteArrayInputStream(packet.c));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     try {
/* 23 */       randomInt1 = inputStream.readInt();
/* 24 */       randomInt2 = inputStream.readInt();
/* 25 */     } catch (IOException e) {
/*    */       
/* 27 */       e.printStackTrace();
/*    */       
/*    */       return;
/*    */     } 
/* 31 */     System.out.println(randomInt1 + " " + randomInt2);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void onPacketData(ce manager, di packet, Player player) {
/* 37 */     if (packet.a.equals("SCPCraft"))
/*    */     {
/* 39 */       handleRandom(packet);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/SCPClientPacketHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */