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
/*     */ public class SCP914CoarseRecipes
/*     */ {
/*  13 */   private static final SCP914CoarseRecipes smeltingBase = new SCP914CoarseRecipes();
/*     */ 
/*     */ 
/*     */   
/*     */   private Map smeltingList;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final SCP914CoarseRecipes smelting() {
/*  23 */     return smeltingBase;
/*     */   }
/*     */ 
/*     */   
/*     */   private SCP914CoarseRecipes() {
/*  28 */     this.smeltingList = new HashMap<Object, Object>();
/*  29 */     addSmelting(amq.T.cm, new ur(amq.H));
/*  30 */     addSmelting(amq.z.cm, new ur(amq.I));
/*  31 */     addSmelting(amq.I.cm, new ur(up.ap));
/*  32 */     addSmelting(amq.al.cm, new ur(up.o));
/*  33 */     addSmelting(up.p.cj, new ur(amq.J));
/*  34 */     addSmelting(up.aL.cj, new ur(up.aK));
/*  35 */     addSmelting(up.aK.cj, new ur(up.aJ));
/*  36 */     addSmelting(amq.ak.cm, new ur(up.p));
/*  37 */     addSmelting(amq.aX.cm, new ur(up.aD));
/*  38 */     addSmelting(up.o.cj, new ur(amq.K));
/*  39 */     addSmelting(up.n.cj, new ur(amq.az));
/*  40 */     addSmelting(amq.aA.cm, new ur(up.n));
/*  41 */     addSmelting(amq.aq.cm, new ur(up.aL));
/*  42 */     addSmelting(amq.x.cm, new ur(up.S));
/*  43 */     addSmelting(up.h.cj, new ur(up.o, 3));
/*  44 */     addSmelting(up.q.cj, new ur(up.o, 2));
/*  45 */     addSmelting(up.g.cj, new ur(up.o, 3));
/*  46 */     addSmelting(up.f.cj, new ur(up.o, 1));
/*  47 */     addSmelting(up.P.cj, new ur(up.o, 2));
/*  48 */     addSmelting(mod_SCP.SCP427.cj, new ur(mod_SCP.SCP500G));
/*  49 */     addSmelting(up.y.cj, new ur(amq.z, 3));
/*  50 */     addSmelting(up.v.cj, new ur(amq.z, 2));
/*  51 */     addSmelting(up.x.cj, new ur(amq.z, 3));
/*  52 */     addSmelting(up.w.cj, new ur(amq.z, 1));
/*  53 */     addSmelting(up.O.cj, new ur(amq.z, 2));
/*  54 */     addSmelting(up.J.cj, new ur(up.p, 3));
/*  55 */     addSmelting(up.G.cj, new ur(up.p, 2));
/*  56 */     addSmelting(up.I.cj, new ur(up.p, 3));
/*  57 */     addSmelting(up.H.cj, new ur(up.p, 1));
/*  58 */     addSmelting(up.R.cj, new ur(up.p, 2));
/*  59 */     addSmelting(up.C.cj, new ur(up.n, 3));
/*  60 */     addSmelting(up.z.cj, new ur(up.n, 2));
/*  61 */     addSmelting(up.B.cj, new ur(up.n, 3));
/*  62 */     addSmelting(up.A.cj, new ur(up.n, 1));
/*  63 */     addSmelting(up.Q.cj, new ur(up.n, 2));
/*  64 */     addSmelting(up.bb.cj, new ur(amq.aT));
/*  65 */     addSmelting(mod_SCP.SCP217.cj, new ur(up.o, 2));
/*  66 */     addSmelting(mod_SCP.Wrench.cj, new ur(up.o, 3));
/*  67 */     addSmelting(mod_SCP.Locker.cm, new ur(amq.al));
/*  68 */     addSmelting(up.bd.cj, new ur(up.aK, 3));
/*  69 */     addSmelting(mod_SCP.SCP143Planks.cm, new ur(amq.M));
/*  70 */     addSmelting(mod_SCP.SCP420J.cj, new ur(up.T, 2));
/*  71 */     addSmelting(up.u.cj, new ur(amq.A, 3));
/*  72 */     addSmelting(up.r.cj, new ur(amq.A, 2));
/*  73 */     addSmelting(up.t.cj, new ur(amq.A, 3));
/*  74 */     addSmelting(up.s.cj, new ur(amq.A, 1));
/*  75 */     addSmelting(up.N.cj, new ur(amq.A, 2));
/*  76 */     addSmelting(amq.x.cm, new ur((amq)amq.aa));
/*  77 */     addSmelting(amq.bB.cm, new ur((amq)amq.ai));
/*  78 */     addSmelting(amq.be.cm, new ur(amq.as));
/*  79 */     addSmelting(amq.bD.cm, new ur(amq.be, 4));
/*  80 */     addSmelting(amq.bx.cm, new ur((amq)amq.N, 2));
/*  81 */     addSmelting(up.aT.cj, new ur(up.aY));
/*  82 */     addSmelting(amq.V.cm, new ur(amq.A, 2));
/*  83 */     addSmelting(amq.C.cm, new ur(amq.w, 6));
/*  84 */     addSmelting(up.k.cj, new ur(up.K, 2));
/*  85 */     addSmelting(up.l.cj, new ur(up.ap, 2));
/*  86 */     addSmelting(up.ba.cj, new ur(amq.A, 2));
/*  87 */     addSmelting(mod_SCP.CupEmpty.cj, new ur(up.aK, 3));
/*  88 */     addSmelting(up.bA.cj, new ur(up.bn, 1));
/*  89 */     addSmelting(amq.H.cm, new ur(amq.bf, 1));
/*  90 */     addSmelting(amq.bp.cm, new ur(amq.z));
/*  91 */     addSmelting(mod_SCP.SCP079.cm, new ur(mod_SCP.Circuit, 5));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addSmelting(int par1, ur par2ItemStack) {
/*  99 */     this.smeltingList.put(Integer.valueOf(par1), par2ItemStack);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ur getSmeltingResult(int par1) {
/* 107 */     return (ur)this.smeltingList.get(Integer.valueOf(par1));
/*     */   }
/*     */ 
/*     */   
/*     */   public Map getSmeltingList() {
/* 112 */     return this.smeltingList;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/recipes/SCP914CoarseRecipes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */