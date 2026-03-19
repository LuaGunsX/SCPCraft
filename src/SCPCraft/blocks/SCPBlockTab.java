/*    */ package SCPCraft.blocks;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import tj;
/*    */ 
/*    */ public final class SCPBlockTab
/*    */   extends tj
/*    */ {
/*    */   public SCPBlockTab(int par1, String par2Str) {
/* 10 */     super(par1, par2Str);
/*    */   }
/*    */ 
/*    */   
/*    */   public int e() {
/* 15 */     return mod_SCP.Locker.cm;
/*    */   }
/*    */ 
/*    */   
/*    */   public String b() {
/* 20 */     return "SCPBlocks";
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlockTab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */