/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.SCPToolMaterial;
/*    */ import SCPCraft.mod_SCP;
/*    */ import amq;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SCPItem143Spade
/*    */   extends SCPItemTool
/*    */ {
/*    */   public SCPItem143Spade(int i, SCPToolMaterial enumtoolmaterial) {
/* 14 */     super(i, 1, enumtoolmaterial, blocksEffectiveAgainst);
/* 15 */     a(mod_SCP.tabItemSCP);
/* 16 */     e(1000);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(amq block) {
/* 21 */     if (block == amq.aV)
/*    */     {
/* 23 */       return true;
/*    */     }
/* 25 */     return (block == amq.aX);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/* 30 */   private static amq[] blocksEffectiveAgainst = new amq[] { (amq)amq.x, amq.y, amq.H, amq.I, amq.aV, amq.aX, amq.aZ, amq.aD, amq.bf, (amq)amq.bB };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 37 */     return "/SCPCraft/textures/SCPItems.png";
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem143Spade.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */