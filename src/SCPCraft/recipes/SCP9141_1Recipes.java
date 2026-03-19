/*    */ package SCPCraft.recipes;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import amq;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import up;
/*    */ import ur;
/*    */ 
/*    */ 
/*    */ public class SCP9141_1Recipes
/*    */ {
/* 13 */   private static final SCP9141_1Recipes smeltingBase = new SCP9141_1Recipes();
/*    */ 
/*    */ 
/*    */   
/*    */   private Map smeltingList;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final SCP9141_1Recipes smelting() {
/* 23 */     return smeltingBase;
/*    */   }
/*    */ 
/*    */   
/*    */   private SCP9141_1Recipes() {
/* 28 */     this.smeltingList = new HashMap<Object, Object>();
/* 29 */     addSmelting(amq.z.cm, new ur(amq.w));
/* 30 */     addSmelting(amq.y.cm, new ur((amq)amq.x));
/* 31 */     addSmelting(mod_SCP.L1Keycard.cj, new ur(mod_SCP.L2Keycard));
/* 32 */     addSmelting(amq.K.cm, new ur(up.o));
/* 33 */     addSmelting(amq.aT.cm, new ur(amq.at));
/* 34 */     addSmelting(up.m.cj, new ur(up.m, 1, 1));
/* 35 */     addSmelting(up.bs.cj, new ur((up)up.bs));
/* 36 */     addSmelting(up.ax.cj, new ur(amq.aW, 3));
/* 37 */     addSmelting(up.aW.cj, new ur(up.aW));
/* 38 */     addSmelting(up.bC.cj, new ur(up.bC));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void addSmelting(int par1, ur par2ItemStack) {
/* 47 */     this.smeltingList.put(Integer.valueOf(par1), par2ItemStack);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ur getSmeltingResult(int par1) {
/* 55 */     return (ur)this.smeltingList.get(Integer.valueOf(par1));
/*    */   }
/*    */ 
/*    */   
/*    */   public Map getSmeltingList() {
/* 60 */     return this.smeltingList;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/recipes/SCP9141_1Recipes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */