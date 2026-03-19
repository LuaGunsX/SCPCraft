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
/*    */ public class SCP294Recipes
/*    */ {
/* 13 */   private static final SCP294Recipes smeltingBase = new SCP294Recipes();
/*    */ 
/*    */ 
/*    */   
/*    */   private Map smeltingList;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final SCP294Recipes smelting() {
/* 23 */     return smeltingBase;
/*    */   }
/*    */ 
/*    */   
/*    */   private SCP294Recipes() {
/* 28 */     this.smeltingList = new HashMap<Object, Object>();
/* 29 */     addSmelting(mod_SCP.BloodBlock.cm, new ur(mod_SCP.CupBlood));
/* 30 */     addSmelting(amq.bB.cm, new ur(mod_SCP.CupMycelium));
/* 31 */     addSmelting(amq.be.cm, new ur(mod_SCP.CupNetherrack));
/* 32 */     addSmelting(up.m.cj, new ur(mod_SCP.CupCoal));
/* 33 */     addSmelting(amq.aY.cm, new ur(mod_SCP.CupCactus));
/* 34 */     addSmelting(up.L.cj, new ur(mod_SCP.CupFeather));
/* 35 */     addSmelting(amq.ak.cm, new ur(mod_SCP.CupGold));
/* 36 */     addSmelting(up.at.cj, new ur(mod_SCP.CupAppleGold));
/* 37 */     addSmelting(up.j.cj, new ur(mod_SCP.CupApple));
/* 38 */     addSmelting(amq.as.cm, new ur(mod_SCP.CupObsidian));
/* 39 */     addSmelting(amq.bf.cm, new ur(mod_SCP.CupSlowSand));
/* 40 */     addSmelting(amq.bg.cm, new ur(mod_SCP.CupGlowstone));
/* 41 */     addSmelting(up.aT.cj, new ur(mod_SCP.CupGlowstone));
/* 42 */     addSmelting(amq.P.cm, new ur(mod_SCP.CupGlass));
/* 43 */     addSmelting(amq.bt.cm, new ur(mod_SCP.CupGlass));
/* 44 */     addSmelting(amq.bd.cm, new ur(mod_SCP.CupPumpkin));
/* 45 */     addSmelting(amq.bi.cm, new ur(mod_SCP.CupPumpkin));
/* 46 */     addSmelting(up.bu.cj, new ur(mod_SCP.CupSpiderEye));
/* 47 */     addSmelting(up.aY.cj, new ur(mod_SCP.CupSugar));
/* 48 */     addSmelting(amq.w.cm, new ur(mod_SCP.CupStone));
/* 49 */     addSmelting(up.aI.cj, new ur(mod_SCP.CupClay));
/* 50 */     addSmelting(amq.ba.cm, new ur(mod_SCP.CupSugar));
/* 51 */     addSmelting(amq.aZ.cm, new ur(mod_SCP.CupClay));
/* 52 */     addSmelting(amq.ao.cm, new ur(mod_SCP.CupClay));
/* 53 */     addSmelting(up.aH.cj, new ur(mod_SCP.CupClay));
/* 54 */     addSmelting(amq.bp.cm, new ur(mod_SCP.CupStone));
/* 55 */     addSmelting(up.bm.cj, new ur(mod_SCP.CupRottenFlesh));
/* 56 */     addSmelting(amq.az.cm, new ur(mod_SCP.CupDiamond));
/* 57 */     addSmelting(up.n.cj, new ur(mod_SCP.CupDiamond));
/* 58 */     addSmelting(amq.K.cm, new ur(mod_SCP.CupIron));
/* 59 */     addSmelting(up.o.cj, new ur(mod_SCP.CupIron));
/* 60 */     addSmelting(mod_SCP.Locker.cm, new ur(mod_SCP.CupIron));
/* 61 */     addSmelting(up.aC.cj, new ur(mod_SCP.CupRedstone));
/* 62 */     addSmelting(up.bb.cj, new ur(mod_SCP.CupRedstone));
/* 63 */     addSmelting(amq.aT.cm, new ur(mod_SCP.CupRedstone));
/* 64 */     addSmelting(amq.aS.cm, new ur(mod_SCP.CupRedstone));
/* 65 */     addSmelting(amq.bl.cm, new ur(mod_SCP.CupRedstone));
/* 66 */     addSmelting(amq.bk.cm, new ur(mod_SCP.CupRedstone));
/* 67 */     addSmelting(amq.aQ.cm, new ur(mod_SCP.CupRedstone));
/* 68 */     addSmelting(mod_SCP.ElectricWool.cm, new ur(mod_SCP.CupRedstone));
/* 69 */     addSmelting(mod_SCP.GrateBlock.cm, new ur(mod_SCP.CupIron));
/* 70 */     addSmelting(mod_SCP.Machinery.cm, new ur(mod_SCP.CupCoal));
/* 71 */     addSmelting(mod_SCP.Granite.cm, new ur(mod_SCP.CupObsidian));
/* 72 */     addSmelting(up.K.cj, new ur(mod_SCP.CupCobweb));
/* 73 */     addSmelting(amq.Z.cm, new ur(mod_SCP.CupCobweb));
/* 74 */     addSmelting(mod_SCP.DocumentTable.cm, new ur(mod_SCP.CupIron));
/* 75 */     addSmelting(up.aX.cj, new ur(mod_SCP.CupBone));
/* 76 */     addSmelting(up.aM.cj, new ur(mod_SCP.CupSlimeBall));
/* 77 */     addSmelting(mod_SCP.Bone.cm, new ur(mod_SCP.CupBone));
/* 78 */     addSmelting(mod_SCP.Flesh.cm, new ur(mod_SCP.CupRottenFlesh));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void addSmelting(int par1, ur par2ItemStack) {
/* 86 */     this.smeltingList.put(Integer.valueOf(par1), par2ItemStack);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ur getSmeltingResult(int par1) {
/* 94 */     return (ur)this.smeltingList.get(Integer.valueOf(par1));
/*    */   }
/*    */ 
/*    */   
/*    */   public Map getSmeltingList() {
/* 99 */     return this.smeltingList;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/recipes/SCP294Recipes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */