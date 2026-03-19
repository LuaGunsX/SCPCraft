/*    */ package SCPCraft;
/*    */ 
/*    */ public enum SCPToolMaterial
/*    */ {
/*  5 */   SCP143("SCP-143", 0, 500, 10, 17.0F, 4, 12);
/*    */   
/*    */   private static final SCPToolMaterial[] allToolMaterials;
/*    */   private final int enchantability;
/*    */   private final int damageVsEntity;
/*    */   private final float efficiencyOnProperMaterial;
/*    */   private final int maxUses;
/*    */   private final int harvestLevel;
/*    */   
/*    */   SCPToolMaterial(String s, int i, int j, int k, float f, int l, int i1) {
/* 15 */     this.harvestLevel = j;
/* 16 */     this.maxUses = k;
/* 17 */     this.efficiencyOnProperMaterial = f;
/* 18 */     this.damageVsEntity = l;
/* 19 */     this.enchantability = i1;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getMaxUses() {
/* 24 */     return this.maxUses;
/*    */   }
/*    */ 
/*    */   
/*    */   public float getEfficiencyOnProperMaterial() {
/* 29 */     return this.efficiencyOnProperMaterial;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getDamageVsEntity() {
/* 34 */     return this.damageVsEntity;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getHarvestLevel() {
/* 39 */     return this.harvestLevel;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getEnchantability() {
/* 44 */     return this.enchantability;
/*    */   }
/*    */ 
/*    */   
/*    */   static {
/* 49 */     allToolMaterials = new SCPToolMaterial[] { SCP143 };
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/SCPToolMaterial.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */