/*    */ package SCPCraft;
/*    */ 
/*    */ import su;
/*    */ import sv;
/*    */ import tj;
/*    */ 
/*    */ public class SCPClassDItemArmor
/*    */   extends su
/*    */ {
/*    */   public String getTextureFile() {
/* 11 */     return "/SCPCraft/textures/SCPItems.png";
/*    */   }
/*    */   
/* 14 */   private static final int[] maxDamageArray = new int[] { 11, 16, 15, 13 };
/*    */   
/*    */   public final int armorType;
/*    */   
/*    */   public final int damageReduceAmount;
/*    */   
/*    */   public final int renderIndex;
/*    */   private final SCPArmorMaterial material;
/*    */   
/*    */   public SCPClassDItemArmor(int i, SCPArmorMaterial enumarmormaterial, int j, int k, tj tab) {
/* 24 */     super(i, sv.e, j, k);
/* 25 */     this.material = enumarmormaterial;
/* 26 */     this.armorType = k;
/* 27 */     this.renderIndex = j;
/* 28 */     this.damageReduceAmount = enumarmormaterial.getDamageReductionAmount(k);
/* 29 */     e(enumarmormaterial.getDurability(k));
/* 30 */     this.ck = 1;
/* 31 */     a(tab);
/*    */   }
/*    */ 
/*    */   
/*    */   public int c() {
/* 36 */     return this.material.getEnchantability();
/*    */   }
/*    */ 
/*    */   
/*    */   public static int[] getMaxDamageArray() {
/* 41 */     return maxDamageArray;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/SCPClassDItemArmor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */