/*     */ package SCPCraft.CoroAI;
/*     */ 
/*     */ import SCPCraft.CoroAI.entity.c_EnhAI;
/*     */ import SCPCraft.c_CoroAIUtil;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import lq;
/*     */ import md;
/*     */ import mi;
/*     */ import nc;
/*     */ import nd;
/*     */ import nk;
/*     */ import oh;
/*     */ import qx;
/*     */ import up;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Behaviors
/*     */ {
/*     */   public static Behaviors instance;
/*     */   public static HashMap entFields;
/*  25 */   public static HashMap aiEnhanced = new HashMap<Object, Object>();
/*     */   
/*  27 */   public static float followTriggerDist = 32.0F;
/*     */ 
/*     */ 
/*     */   
/*     */   Behaviors() {
/*  32 */     if (instance == null) {
/*  33 */       instance = this;
/*  34 */       entFields = new HashMap<Object, Object>();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void check(lq me) {
/*  39 */     if (instance == null) new Behaviors(); 
/*  40 */     if (!entFields.containsKey(Integer.valueOf(me.k))) {
/*  41 */       entFields.put(Integer.valueOf(me.k), new DataLatcher());
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void AI(mi me) {
/*  49 */     check((lq)me);
/*     */ 
/*     */     
/*  52 */     int ticks = ((Integer)getData((lq)me, DataTypes.noMoveTicks)).intValue();
/*     */     
/*  54 */     if ((me.H() && notMoving((md)me, 0.05F)) || (!me.H() && notMoving((md)me, 0.1F))) {
/*  55 */       ticks++;
/*  56 */       if (me.H()) {
/*  57 */         double var2 = me.q - me.t;
/*  58 */         double var4 = me.s - me.v;
/*  59 */         float var6 = (float)Math.sqrt(var2 * var2 + var4 * var4);
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  66 */       if (ticks > 150 && 
/*  67 */         me.p.t.nextInt(10) == 0) {
/*     */ 
/*     */         
/*  70 */         if (me instanceof c_IEnhPF) {
/*  71 */           ((c_IEnhPF)me).noMoveTriggerCallback();
/*     */         } else {
/*  73 */           me.b(null);
/*  74 */           me.a(null);
/*     */         } 
/*  76 */         ticks = 0;
/*     */       } 
/*     */     } else {
/*     */       
/*  80 */       ticks = 0;
/*     */     } 
/*     */     
/*  83 */     if (me instanceof qc);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  88 */     setData((lq)me, DataTypes.noMoveTicks, Integer.valueOf(ticks));
/*     */   }
/*     */ 
/*     */   
/*     */   public static void enhanceMonsterAIClose(mi koa, mi entHit) {
/*  93 */     entHit.b((md)koa);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void enhanceMonsterAI(md ent) {
/*  98 */     c_EnhAI koa = null;
/*  99 */     if (ent instanceof c_EnhAI) {
/* 100 */       koa = (c_EnhAI)ent;
/*     */     } else {
/*     */       return;
/*     */     } 
/*     */ 
/*     */     
/* 106 */     int huntRange = 32;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 111 */     List<lq> list = ent.p.a(mi.class, ent.D.b(huntRange, (huntRange / 2), huntRange));
/* 112 */     for (int j = 0; j < list.size(); j++) {
/*     */       
/* 114 */       lq entity1 = list.get(j);
/* 115 */       if (entity1 instanceof mi) {
/* 116 */         mi entC = (mi)entity1;
/*     */         
/* 118 */         if (entC.l() instanceof qx) {
/* 119 */           entC.b(null);
/*     */         }
/*     */ 
/*     */         
/* 123 */         if (koa.isEnemy(entity1) && (
/* 124 */           (md)entity1).n((lq)ent)) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 132 */           float dist = entC.d((lq)ent);
/*     */           
/* 134 */           if (dist <= 16.0F)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 140 */             if (entC.aG() == null || (entC.aG() != null && dist < entC.aG().d((lq)ent))) {
/* 141 */               entC.b(ent);
/* 142 */               entC.b((lq)ent);
/*     */ 
/*     */               
/* 145 */               PFQueue.getPath((lq)entC, (lq)ent, 16.0F);
/* 146 */               if (!aiEnhanced.containsKey(entC)) {
/* 147 */                 entC.bn.a(3, (nc)new nk((md)entC, c_EnhAI.class, 0.23F, true));
/* 148 */                 nd targetTasks = (nd)c_CoroAIUtil.getPrivateValueBoth(md.class, entC, "bn", "targetTasks");
/* 149 */                 if (targetTasks != null)
/* 150 */                 { targetTasks.a(2, (nc)new oh((md)entC, c_EnhAI.class, 16.0F, 0, true)); }
/* 151 */                 else { System.out.println("update targetTasks reflection"); }
/* 152 */                  aiEnhanced.put(entC, Boolean.valueOf(true));
/*     */               } 
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setData(lq ent, DataTypes dtEnum, Object obj) {
/* 187 */     ((DataLatcher)entFields.get(Integer.valueOf(ent.k))).values.put(dtEnum, obj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Object getData(lq ent, DataTypes dtEnum) {
/* 194 */     return ((DataLatcher)entFields.get(Integer.valueOf(ent.k))).values.get(dtEnum);
/*     */   }
/*     */   
/*     */   public static void wheatFollow(mi me) {
/* 198 */     boolean found = false;
/*     */ 
/*     */     
/* 201 */     List<qx> ents = me.p.a(qx.class, me.D.a(followTriggerDist, followTriggerDist, followTriggerDist));
/* 202 */     for (int var3 = 0; var3 < ents.size(); var3++) {
/* 203 */       qx var5 = ents.get(var3);
/* 204 */       if (me.d((lq)var5) > 3.0F && 
/* 205 */         var5.bS() != null && (var5.bS()).c == up.T.cj) {
/* 206 */         found = true;
/* 207 */         setTarget(me, (lq)var5);
/*     */ 
/*     */         
/* 210 */         setData((lq)me, DataTypes.shouldDespawn, Boolean.valueOf(false));
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 216 */     if (!found) {
/*     */       
/* 218 */       lq target = (lq)getData((lq)me, DataTypes.followTarg);
/* 219 */       if (target instanceof qx) {
/* 220 */         qx var5 = (qx)target;
/* 221 */         if (var5.bS() == null || (var5.bS() != null && (var5.bS()).c != up.T.cj)) {
/* 222 */           setTarget(me, null);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setTarget(mi me, lq targ) {
/* 232 */     if (instance == null) new Behaviors();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 239 */     if ((lq)getData((lq)me, DataTypes.followTarg) != targ)
/*     */     {
/* 241 */       setData((lq)me, DataTypes.followTarg, targ);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 250 */     if (targ instanceof md) {
/* 251 */       me.b((md)targ);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void follow(mi me, lq targ, float dist) {
/* 256 */     if (instance == null) new Behaviors();
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean notMoving(md var0, float var1) {
/* 263 */     double var2 = var0.q - var0.t;
/* 264 */     double var4 = var0.s - var0.v;
/* 265 */     float var6 = (float)Math.sqrt(var2 * var2 + var4 * var4);
/*     */     
/* 267 */     return (var6 < var1);
/*     */   }
/*     */   
/*     */   public float getXZDistanceToEntity(lq me, lq var1) {
/* 271 */     float var2 = (float)(me.t - me.t);
/* 272 */     float var3 = (float)(me.v - me.v);
/* 273 */     return (float)Math.sqrt((var2 * var2 + var3 * var3));
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/Behaviors.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */