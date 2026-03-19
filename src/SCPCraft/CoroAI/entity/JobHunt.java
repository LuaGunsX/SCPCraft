/*     */ package SCPCraft.CoroAI.entity;
/*     */ 
/*     */ import SCPCraft.CoroAI.PFQueue;
/*     */ import SCPCraft.c_CoroAIUtil;
/*     */ import java.util.List;
/*     */ import lh;
/*     */ import lq;
/*     */ import md;
/*     */ 
/*     */ public class JobHunt
/*     */   extends JobBase
/*     */ {
/*  13 */   public long huntRange = 24L;
/*     */   public boolean dontStray = true;
/*     */   public boolean xRay = false;
/*     */   
/*     */   public JobHunt(JobManager jm) {
/*  18 */     super(jm);
/*     */   }
/*     */ 
/*     */   
/*     */   public void tick() {
/*  23 */     super.tick();
/*  24 */     jobHunter();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean shouldExecute() {
/*  29 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean shouldContinue() {
/*  34 */     return (this.ent.a_ == null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onLowHealth() {
/*  44 */     if (this.hitAndRunDelay == 0 && this.ent.d(this.ent.lastFleeEnt) > 3.0F) {
/*  45 */       this.hitAndRunDelay = this.ent.cooldown_Ranged + 1;
/*  46 */       this.ent.a_ = this.ent.lastFleeEnt;
/*  47 */       if (this.ent.a_ != null) {
/*  48 */         this.ent.a(this.ent.a_, 180.0F, 180.0F);
/*  49 */         this.ent.rightClickItem();
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/*  54 */       this.ent.a_ = null;
/*     */     } 
/*     */     
/*  57 */     if (this.ent.E && this.ent.F && !this.ent.isBreaking()) {
/*  58 */       this.ent.bi();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void hitHook(lh ds, int damage) {
/*  64 */     if (this.ent.isEnemy(ds.g())) {
/*  65 */       this.ent.a_ = ds.g();
/*     */     }
/*     */     
/*  68 */     if (this.ent.aU() < this.ent.aT() / 2 && ds.g() == c_CoroAIUtil.getFirstPlayer()) {
/*  69 */       this.ent.dipl_hostilePlayer = true;
/*  70 */       this.ent.getGroupInfo(EnumInfo.DIPL_WARN);
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
/*     */   public void setJobItems() {
/*  83 */     c_CoroAIUtil.setItems_JobHunt(this.ent);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void jobHunter() {
/*  90 */     this.dontStray = false;
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
/* 104 */     this.ent.maxDistanceFromHome = 48.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 114 */     setJobState(EnumJobState.IDLE);
/*     */     
/* 116 */     if (this.ent.aU() > this.ent.aT() * 0.9F && (this.ent.a_ == null || this.ent.aa.nextInt(20) == 0)) {
/* 117 */       boolean found = false;
/* 118 */       lq clEnt = null;
/* 119 */       float closest = 9999.0F;
/* 120 */       List<lq> list = this.ent.p.b((lq)this.ent, this.ent.D.b(this.huntRange, (this.huntRange / 2L), this.huntRange));
/* 121 */       for (int j = 0; j < list.size(); j++) {
/*     */         
/* 123 */         lq entity1 = list.get(j);
/* 124 */         if (this.ent.isEnemy(entity1))
/*     */         {
/* 126 */           if ((this.xRay || ((md)entity1).n((lq)this.ent)) && 
/* 127 */             sanityCheck(entity1)) {
/* 128 */             float dist = this.ent.d(entity1);
/* 129 */             if (dist < closest) {
/* 130 */               closest = dist;
/* 131 */               clEnt = entity1;
/*     */             } 
/*     */           } 
/*     */         }
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 142 */       if (clEnt != null) {
/* 143 */         this.ent.huntTarget(clEnt);
/*     */ 
/*     */       
/*     */       }
/*     */ 
/*     */     
/*     */     }
/* 150 */     else if (this.ent.a_ != null && 
/* 151 */       this.ent.az().f() && this.ent.d(this.ent.a_) > 5.0F) {
/* 152 */       PFQueue.getPath((lq)this.ent, this.ent.a_, this.ent.maxPFRange);
/*     */     } 
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
/* 164 */     this.ent.aS = this.ent.aU();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void hunterHitHook(lh ds, int damage) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean sanityCheckHelp(lq caller, lq target) {
/* 182 */     if (this.ent.aU() < 10) {
/* 183 */       return false;
/*     */     }
/*     */     
/* 186 */     if (this.dontStray && 
/* 187 */       target.f(this.ent.homeX, this.ent.homeY, this.ent.homeZ) > this.ent.maxDistanceFromHome * 1.5D) {
/* 188 */       return false;
/*     */     }
/*     */     
/* 191 */     if (this.ent.aa.nextInt(2) == 0) {
/* 192 */       return true;
/*     */     }
/* 194 */     return false;
/*     */   }
/*     */   
/*     */   public boolean sanityCheck(lq target) {
/* 198 */     if (this.ent.aU() < 6) {
/* 199 */       return false;
/*     */     }
/*     */     
/* 202 */     if (this.dontStray && 
/* 203 */       target.f(this.ent.homeX, this.ent.homeY, this.ent.homeZ) > this.ent.maxDistanceFromHome) {
/* 204 */       return false;
/*     */     }
/*     */     
/* 207 */     return true;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/entity/JobHunt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */