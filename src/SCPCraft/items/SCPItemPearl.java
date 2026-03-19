/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import up;
/*    */ 
/*    */ public class SCPItemPearl
/*    */   extends up {
/*    */   public static String SCP;
/*    */   
/*    */   public SCPItemPearl(int i, String SCPID) {
/* 11 */     super(i);
/* 12 */     getSCPName();
/* 13 */     this; SCP = SCPID;
/* 14 */     a(mod_SCP.tabSCP);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 19 */     return "/SCPCraft/textures/SCPPearls.png";
/*    */   }
/*    */ 
/*    */   
/*    */   public static String getSCPName() {
/* 24 */     return SCP;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItemPearl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */