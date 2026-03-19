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
/*    */ public class SCP914VeryFineRecipes
/*    */ {
/* 13 */   private static final SCP914VeryFineRecipes smeltingBase = new SCP914VeryFineRecipes();
/*    */ 
/*    */ 
/*    */   
/*    */   private Map smeltingList;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final SCP914VeryFineRecipes smelting() {
/* 23 */     return smeltingBase;
/*    */   }
/*    */ 
/*    */   
/*    */   private SCP914VeryFineRecipes() {
/* 28 */     this.smeltingList = new HashMap<Object, Object>();
/* 29 */     addSmelting(up.bq.cj, new ur(up.p));
/* 30 */     addSmelting(amq.al.cm, new ur(mod_SCP.Locker));
/* 31 */     addSmelting(mod_SCP.SCP500G.cj, new ur(mod_SCP.SCP500B));
/* 32 */     addSmelting(mod_SCP.L2Keycard.cj, new ur(up.p));
/* 33 */     addSmelting(amq.K.cm, new ur(amq.al));
/* 34 */     addSmelting(amq.bg.cm, new ur(up.aT, 6));
/* 35 */     addSmelting(mod_SCP.Item019.cj, new ur(amq.aA));
/* 36 */     addSmelting(up.p.cj, new ur(amq.ak));
/* 37 */     addSmelting(amq.H.cm, new ur(amq.P, 3));
/* 38 */     addSmelting(amq.w.cm, new ur(mod_SCP.Granite));
/* 39 */     addSmelting(up.V.cj, new ur(mod_SCP.GasMask));
/* 40 */     addSmelting(up.ae.cj, new ur(mod_SCP.SCP912Shirt));
/* 41 */     addSmelting(up.t.cj, new ur(up.g));
/* 42 */     addSmelting(up.T.cj, new ur(mod_SCP.SCP420J));
/* 43 */     addSmelting(up.L.cj, new ur(up.aP));
/* 44 */     addSmelting(up.U.cj, new ur(amq.bj));
/* 45 */     addSmelting(up.ax.cj, new ur(up.ay));
/* 46 */     addSmelting(mod_SCP.Locker.cm, new ur(amq.ck));
/* 47 */     addSmelting(up.aK.cj, new ur((up)up.bd));
/* 48 */     addSmelting(up.bs.cj, new ur(up.bD));
/* 49 */     addSmelting(up.K.cj, new ur(amq.ae));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void addSmelting(int par1, ur par2ItemStack) {
/* 57 */     this.smeltingList.put(Integer.valueOf(par1), par2ItemStack);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ur getSmeltingResult(int par1) {
/* 65 */     return (ur)this.smeltingList.get(Integer.valueOf(par1));
/*    */   }
/*    */ 
/*    */   
/*    */   public Map getSmeltingList() {
/* 70 */     return this.smeltingList;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/recipes/SCP914VeryFineRecipes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */