/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.SCPToolMaterial;
/*    */ import SCPCraft.mod_SCP;
/*    */ import agi;
/*    */ import amq;
/*    */ import ur;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SCPItem143Axe
/*    */   extends SCPItemTool
/*    */ {
/*    */   public SCPItem143Axe(int i, SCPToolMaterial enumtoolmaterial) {
/* 16 */     super(i, 3, enumtoolmaterial, blocksEffectiveAgainst);
/* 17 */     a(mod_SCP.tabItemSCP);
/* 18 */     e(1000);
/*    */   }
/*    */ 
/*    */   
/*    */   public float a(ur itemstack, amq block) {
/* 23 */     if (block != null && block.cB == agi.f)
/*    */     {
/* 25 */       return this.efficiencyOnProperMaterial;
/*    */     }
/*    */ 
/*    */     
/* 29 */     return super.a(itemstack, block);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 35 */   private static amq[] blocksEffectiveAgainst = new amq[] { amq.A, amq.aq, amq.M, amq.ax, amq.ca, amq.cb, amq.bZ, amq.aw, amq.bd, amq.bi, mod_SCP.SCP143Log };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 42 */     return "/SCPCraft/textures/SCPItems.png";
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem143Axe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */