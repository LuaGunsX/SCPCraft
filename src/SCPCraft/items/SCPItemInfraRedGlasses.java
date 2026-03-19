/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.SCPArmorMaterial;
/*    */ import SCPCraft.mod_SCP;
/*    */ import su;
/*    */ import sv;
/*    */ 
/*    */ public class SCPItemInfraRedGlasses
/*    */   extends su
/*    */ {
/*    */   public String getTextureFile() {
/* 12 */     return "/SCPCraft/textures/SCPItems.png";
/*    */   }
/*    */   
/* 15 */   private static final int[] maxDamageArray = new int[] { 11, 16, 15, 13 };
/*    */   
/*    */   public final int armorType;
/*    */   
/*    */   public final int damageReduceAmount;
/*    */   
/*    */   public final int renderIndex;
/*    */   private final SCPArmorMaterial material;
/*    */   
/*    */   public SCPItemInfraRedGlasses(int i, SCPArmorMaterial enumarmormaterial, int j, int k) {
/* 25 */     super(i, sv.c, j, k);
/* 26 */     this.material = enumarmormaterial;
/* 27 */     this.armorType = k;
/* 28 */     this.renderIndex = j;
/* 29 */     this.damageReduceAmount = enumarmormaterial.getDamageReductionAmount(k);
/* 30 */     e(enumarmormaterial.getDurability(k));
/* 31 */     this.ck = 1;
/* 32 */     a(mod_SCP.tabItemSCP);
/*    */   }
/*    */ 
/*    */   
/*    */   public int c() {
/* 37 */     return this.material.getEnchantability();
/*    */   }
/*    */ 
/*    */   
/*    */   public static int[] getMaxDamageArray() {
/* 42 */     return maxDamageArray;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItemInfraRedGlasses.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */