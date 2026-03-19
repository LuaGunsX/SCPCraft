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
/*    */ public class SCP914FineRecipes
/*    */ {
/* 13 */   private static final SCP914FineRecipes smeltingBase = new SCP914FineRecipes();
/*    */ 
/*    */ 
/*    */   
/*    */   private Map smeltingList;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final SCP914FineRecipes smelting() {
/* 23 */     return smeltingBase;
/*    */   }
/*    */ 
/*    */   
/*    */   private SCP914FineRecipes() {
/* 28 */     this.smeltingList = new HashMap<Object, Object>();
/* 29 */     addSmelting(amq.H.cm, new ur(amq.T));
/* 30 */     addSmelting(amq.T.cm, new ur(amq.T, 1, 2));
/* 31 */     addSmelting(up.ap.cj, new ur(up.i));
/* 32 */     addSmelting(mod_SCP.SCP500G.cj, new ur(mod_SCP.SCP427));
/* 33 */     addSmelting(mod_SCP.L2Keycard.cj, new ur(mod_SCP.L3Keycard));
/* 34 */     addSmelting(mod_SCP.Locker.cm, new ur(up.o, 10));
/* 35 */     addSmelting(mod_SCP.Wrench.cj, new ur(mod_SCP.GodlyWrench));
/* 36 */     addSmelting(up.aS.cj, new ur(up.p, 12));
/* 37 */     addSmelting(up.aQ.cj, new ur(up.aS));
/* 38 */     addSmelting(amq.bg.cm, new ur(amq.bO));
/* 39 */     addSmelting(mod_SCP.Pearl914.cj, new ur(mod_SCP.Pearl261));
/* 40 */     addSmelting(amq.be.cm, new ur(amq.bD, 2));
/* 41 */     addSmelting(amq.bc.cm, new ur(amq.bE, 2));
/* 42 */     addSmelting(up.S.cj, new ur(up.br));
/* 43 */     addSmelting(up.aM.cj, new ur(up.bx));
/* 44 */     addSmelting(mod_SCP.BloodBlock.cm, new ur(amq.be));
/* 45 */     addSmelting(up.bo.cj, new ur(up.bw, 5));
/* 46 */     addSmelting(up.aX.cj, new ur(up.aW, 5, 15));
/* 47 */     addSmelting(up.bS.cj, new ur(amq.cd));
/* 48 */     addSmelting(amq.C.cm, new ur(up.n, 2));
/* 49 */     addSmelting(up.l.cj, new ur(up.ap, 2));
/* 50 */     addSmelting(amq.V.cm, new ur(amq.ae, 2, 14));
/* 51 */     addSmelting(up.ba.cj, new ur(amq.ae, 2, 14));
/* 52 */     addSmelting(up.k.cj, new ur(up.K, 5));
/* 53 */     addSmelting(up.aH.cj, new ur(up.bJ));
/* 54 */     addSmelting(up.bt.cj, new ur((up)up.bs, 1, 0));
/* 55 */     addSmelting(up.av.cj, new ur(up.aB));
/* 56 */     addSmelting(amq.ah.cm, new ur(up.aW, 4, 1));
/* 57 */     addSmelting(amq.ag.cm, new ur(up.aW, 4, 11));
/* 58 */     addSmelting(up.aP.cj, new ur(up.bC));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void addSmelting(int par1, ur par2ItemStack) {
/* 66 */     this.smeltingList.put(Integer.valueOf(par1), par2ItemStack);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ur getSmeltingResult(int par1) {
/* 74 */     return (ur)this.smeltingList.get(Integer.valueOf(par1));
/*    */   }
/*    */ 
/*    */   
/*    */   public Map getSmeltingList() {
/* 79 */     return this.smeltingList;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/recipes/SCP914FineRecipes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */