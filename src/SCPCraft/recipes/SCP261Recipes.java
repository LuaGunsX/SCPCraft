/*    */ package SCPCraft.recipes;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.Random;
/*    */ import up;
/*    */ import ur;
/*    */ 
/*    */ 
/*    */ public class SCP261Recipes
/*    */ {
/* 12 */   Random rand = new Random();
/*    */   ur itemStack;
/* 14 */   private static final SCP261Recipes smeltingBase = new SCP261Recipes();
/*    */ 
/*    */ 
/*    */   
/*    */   private Map smeltingList;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final SCP261Recipes smelting() {
/* 24 */     return smeltingBase;
/*    */   }
/*    */ 
/*    */   
/*    */   private SCP261Recipes() {
/* 29 */     this.smeltingList = new HashMap<Object, Object>();
/* 30 */     addSmelting(up.o.cj, new ur(up.g));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void addSmelting(int par1, ur par2ItemStack) {
/* 39 */     par1 = up.o.cj;
/* 40 */     this.smeltingList.put(Integer.valueOf(par1), par2ItemStack);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ur getSmeltingResult(int par1) {
/* 48 */     return (ur)this.smeltingList.get(Integer.valueOf(par1));
/*    */   }
/*    */ 
/*    */   
/*    */   public Map getSmeltingList() {
/* 53 */     return this.smeltingList;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/recipes/SCP261Recipes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */