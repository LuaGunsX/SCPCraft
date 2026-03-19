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
/*    */ public class SCPItem143Sword
/*    */   extends SCPItemTool
/*    */ {
/*    */   public SCPItem143Sword(int i, SCPToolMaterial enumtoolmaterial) {
/* 16 */     super(i, 3, enumtoolmaterial, blocksEffectiveAgainst);
/* 17 */     a(mod_SCP.tabItemSCP);
/* 18 */     e(1000);
/*    */   }
/*    */ 
/*    */   
/*    */   public int c() {
/* 23 */     return this.toolMaterial.getEnchantability();
/*    */   }
/*    */ 
/*    */   
/*    */   public float a(ur itemstack, amq block) {
/* 28 */     if (block != null && block.cB == agi.d)
/*    */     {
/* 30 */       return this.efficiencyOnProperMaterial;
/*    */     }
/*    */     
/* 33 */     return super.a(itemstack, block);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 39 */   private static amq[] blocksEffectiveAgainst = new amq[] { amq.A, amq.aq, amq.M, amq.ax, amq.ca, amq.bd, amq.bi, amq.bZ, amq.cb, amq.ca };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 49 */     return "/SCPCraft/textures/SCPItems.png";
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem143Sword.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */