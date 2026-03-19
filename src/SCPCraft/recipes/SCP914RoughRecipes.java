/*     */ package SCPCraft.recipes;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import amq;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import up;
/*     */ import ur;
/*     */ 
/*     */ 
/*     */ public class SCP914RoughRecipes
/*     */ {
/*  13 */   private static final SCP914RoughRecipes smeltingBase = new SCP914RoughRecipes();
/*     */ 
/*     */ 
/*     */   
/*     */   private Map smeltingList;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final SCP914RoughRecipes smelting() {
/*  23 */     return smeltingBase;
/*     */   }
/*     */ 
/*     */   
/*     */   private SCP914RoughRecipes() {
/*  28 */     this.smeltingList = new HashMap<Object, Object>();
/*  29 */     addSmelting(up.o.cj, new ur(up.bq, 2));
/*  30 */     addSmelting(amq.z.cm, new ur(up.ap));
/*  31 */     addSmelting(up.aL.cj, new ur(up.S));
/*  32 */     addSmelting(mod_SCP.Locker.cm, new ur(mod_SCP.BloodBlock));
/*  33 */     addSmelting(amq.aq.cm, new ur(amq.ba));
/*  34 */     addSmelting(amq.al.cm, new ur(up.o));
/*  35 */     addSmelting(mod_SCP.SCP217.cj, new ur(amq.K, 2));
/*  36 */     addSmelting(mod_SCP.Wrench.cj, new ur(amq.K, 3));
/*  37 */     addSmelting(amq.al.cm, new ur(amq.K));
/*  38 */     addSmelting(amq.ba.cm, new ur(up.aY, 2));
/*  39 */     addSmelting(up.aK.cj, new ur(up.M, 2));
/*  40 */     addSmelting(up.bd.cj, new ur(up.T, 3));
/*  41 */     addSmelting(mod_SCP.SCP143Planks.cm, new ur(amq.A, 2));
/*  42 */     addSmelting(mod_SCP.SCP420J.cj, new ur(up.M, 3));
/*  43 */     addSmelting(up.u.cj, new ur(up.S, 3));
/*  44 */     addSmelting(up.r.cj, new ur(up.S, 2));
/*  45 */     addSmelting(up.t.cj, new ur(up.S, 3));
/*  46 */     addSmelting(up.s.cj, new ur(up.S, 1));
/*  47 */     addSmelting(up.N.cj, new ur(up.S, 2));
/*  48 */     addSmelting(up.y.cj, new ur(amq.z));
/*  49 */     addSmelting(up.v.cj, new ur(amq.z));
/*  50 */     addSmelting(up.x.cj, new ur(amq.z));
/*  51 */     addSmelting(up.w.cj, new ur(amq.z));
/*  52 */     addSmelting(up.O.cj, new ur(amq.z));
/*  53 */     addSmelting(up.J.cj, new ur(up.o));
/*  54 */     addSmelting(up.G.cj, new ur(up.o));
/*  55 */     addSmelting(up.I.cj, new ur(up.o));
/*  56 */     addSmelting(up.H.cj, new ur(up.o));
/*  57 */     addSmelting(up.R.cj, new ur(up.o));
/*  58 */     addSmelting(up.C.cj, new ur(up.m, 2));
/*  59 */     addSmelting(up.z.cj, new ur(up.m, 2));
/*  60 */     addSmelting(up.B.cj, new ur(up.m, 2));
/*  61 */     addSmelting(up.A.cj, new ur(up.m, 2));
/*  62 */     addSmelting(up.Q.cj, new ur(up.m, 2));
/*  63 */     addSmelting(up.h.cj, new ur(amq.w, 3));
/*  64 */     addSmelting(up.q.cj, new ur(amq.w, 2));
/*  65 */     addSmelting(up.g.cj, new ur(amq.w, 3));
/*  66 */     addSmelting(up.f.cj, new ur(amq.w, 1));
/*  67 */     addSmelting(up.P.cj, new ur(amq.w, 2));
/*  68 */     addSmelting(up.n.cj, new ur(up.m));
/*  69 */     addSmelting(amq.as.cm, new ur(amq.z, 2));
/*  70 */     addSmelting(amq.bB.cm, new ur(amq.y, 2));
/*  71 */     addSmelting(amq.be.cm, new ur(amq.T, 2));
/*  72 */     addSmelting(amq.bD.cm, new ur(amq.bp, 2));
/*  73 */     addSmelting(amq.bP.cm, new ur(up.aT));
/*  74 */     addSmelting(amq.bO.cm, new ur(up.aT));
/*  75 */     addSmelting(amq.bx.cm, new ur(up.S));
/*  76 */     addSmelting(up.aT.cj, new ur(up.M, 2));
/*  77 */     addSmelting(amq.C.cm, new ur(amq.y, 8));
/*  78 */     addSmelting(up.k.cj, new ur(up.D));
/*  79 */     addSmelting(amq.V.cm, new ur(amq.ae));
/*  80 */     addSmelting(up.l.cj, new ur(up.ap));
/*  81 */     addSmelting(amq.bp.cm, new ur(amq.w));
/*  82 */     addSmelting(up.ba.cj, new ur(amq.ae));
/*  83 */     addSmelting(amq.bg.cm, new ur(up.aT, 2));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addSmelting(int par1, ur par2ItemStack) {
/*  91 */     this.smeltingList.put(Integer.valueOf(par1), par2ItemStack);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ur getSmeltingResult(int par1) {
/*  99 */     return (ur)this.smeltingList.get(Integer.valueOf(par1));
/*     */   }
/*     */ 
/*     */   
/*     */   public Map getSmeltingList() {
/* 104 */     return this.smeltingList;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/recipes/SCP914RoughRecipes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */