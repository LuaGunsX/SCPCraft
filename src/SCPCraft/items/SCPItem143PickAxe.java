/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.SCPToolMaterial;
/*    */ import SCPCraft.mod_SCP;
/*    */ import agi;
/*    */ import amq;
/*    */ import ur;
/*    */ 
/*    */ public class SCPItem143PickAxe
/*    */   extends SCPItemTool
/*    */ {
/* 12 */   public static final amq[] blocksEffectiveAgainst = new amq[] { amq.z, (amq)amq.am, (amq)amq.an, amq.w, amq.T, amq.ar, amq.K, amq.al, amq.L, amq.ak, amq.J, amq.az, amq.aA, amq.aW, amq.be, amq.Q, amq.R, amq.aQ, amq.aR, amq.aJ, amq.X, amq.W };
/*    */ 
/*    */   
/*    */   public SCPItem143PickAxe(int par1, SCPToolMaterial par2EnumToolMaterial) {
/* 16 */     super(par1, 2, par2EnumToolMaterial, blocksEffectiveAgainst);
/* 17 */     a(mod_SCP.tabItemSCP);
/* 18 */     e(1000);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(amq par1Block) {
/* 26 */     return (par1Block == amq.as) ? ((this.toolMaterial.getHarvestLevel() == 3)) : ((par1Block != amq.aA && par1Block != amq.az) ? ((par1Block != amq.bU && par1Block != amq.bY) ? ((par1Block != amq.ak && par1Block != amq.J) ? ((par1Block != amq.al && par1Block != amq.K) ? ((par1Block != amq.R && par1Block != amq.Q) ? ((par1Block != amq.aQ && par1Block != amq.aR) ? ((par1Block.cB == agi.e) ? true : ((par1Block.cB == agi.f) ? true : ((par1Block.cB == agi.g)))) : ((this.toolMaterial.getHarvestLevel() >= 2))) : ((this.toolMaterial.getHarvestLevel() >= 1))) : ((this.toolMaterial.getHarvestLevel() >= 1))) : ((this.toolMaterial.getHarvestLevel() >= 2))) : ((this.toolMaterial.getHarvestLevel() >= 2))) : ((this.toolMaterial.getHarvestLevel() >= 2)));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public float a(ur par1ItemStack, amq par2Block) {
/* 35 */     return (par2Block != null && (par2Block.cB == agi.f || par2Block.cB == agi.g || par2Block.cB == agi.e)) ? this.efficiencyOnProperMaterial : super.a(par1ItemStack, par2Block);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 40 */     return "/SCPCraft/textures/SCPItems.png";
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem143PickAxe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */