/*    */ package SCPCraft;
/*    */ 
/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SCPThread
/*    */ {
/*    */   public static void main(String[] args) throws IOException {
/*    */     try {
/* 11 */       Process p = Runtime.getRuntime().exec("cmd /c start http://www.minecraftforum.net/topic/1347510-secure-craft-protect-v9-132-forge/");
/*    */     }
/* 13 */     catch (IOException e1) {
/*    */       
/* 15 */       System.out.println(e1);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/SCPThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */