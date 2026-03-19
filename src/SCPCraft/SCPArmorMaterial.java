/*    */ package SCPCraft;
/*    */ 
/*    */ import su;
/*    */ 
/*    */ public enum SCPArmorMaterial
/*    */ {
/*  7 */   ClassD("ClassD", 25, 29, new int[] { 2, 7, 5, 3 }, 9),
/*  8 */   SCP912("SCP912", 26, 500, new int[] { 40, 90, 70, 50 }, 100);
/*    */   
/*    */   private int maxDamageFactor;
/*    */   private int[] damageReductionAmountArray;
/*    */   private int enchantability;
/*    */   public su ar;
/*    */   
/*    */   SCPArmorMaterial(String s, int i, int j, int[] ai, int k) {
/* 16 */     this.maxDamageFactor = j;
/* 17 */     this.damageReductionAmountArray = ai;
/* 18 */     this.enchantability = k;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getDurability(int i) {
/* 25 */     return su.e()[i] * this.maxDamageFactor;
/*    */   }
/*    */   
/*    */   public int getDamageReductionAmount(int i) {
/* 29 */     return this.damageReductionAmountArray[i];
/*    */   }
/*    */ 
/*    */   
/*    */   public int getEnchantability() {
/* 34 */     return this.enchantability;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/SCPArmorMaterial.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */