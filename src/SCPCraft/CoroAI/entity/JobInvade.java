/*     */ package SCPCraft.CoroAI.entity;
/*     */ 
/*     */ import SCPCraft.CoroAI.PFQueue;
/*     */ import java.util.List;
/*     */ import lh;
/*     */ import lq;
/*     */ import md;
/*     */ import qx;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class JobInvade
/*     */   extends JobBase
/*     */ {
/*  17 */   public long huntRange = 32L;
/*     */   
/*     */   public boolean omnipotent = true;
/*  20 */   public int retargetDelayCount = 0;
/*  21 */   public int retargetDelay = 20;
/*  22 */   public int retargetDist = 10;
/*     */   
/*     */   public JobInvade(JobManager jm) {
/*  25 */     super(jm);
/*     */ 
/*     */     
/*  28 */     this.retargetDelayCount = this.retargetDelay;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void tick() {
/*  34 */     if (this.retargetDelayCount > 0) this.retargetDelayCount--;
/*     */     
/*  36 */     jobHunter();
/*     */   }
/*     */ 
/*     */   
/*     */   public void onLowHealth() {
/*  41 */     super.onLowHealth();
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
/*     */   public void hitHook(lh ds, int damage) {
/*  53 */     if (this.ent.isEnemy(ds.g())) {
/*  54 */       this.ent.a_ = ds.g();
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
/*     */   public void setJobItems() {
/*  70 */     int choice = this.ent.aa.nextInt(2);
/*  71 */     if (choice != 0)
/*     */     {
/*     */       
/*  74 */       if (choice == 1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean avoid(boolean actOnTrue) {
/*  82 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean checkHunger() {
/*  88 */     return false;
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
/*     */ 
/*     */   
/*     */   protected void jobHunter() {
/* 119 */     lq clEnt = null;
/*     */ 
/*     */     
/* 122 */     if (this.ent.a_ == null || this.ent.aa.nextInt(20) == 0) {
/* 123 */       boolean found = false;
/*     */       
/* 125 */       float closest = 9999.0F;
/* 126 */       List<lq> list = this.ent.p.b((lq)this.ent, this.ent.D.b(this.huntRange, (this.huntRange / 2L), this.huntRange));
/* 127 */       for (int j = 0; j < list.size(); j++) {
/*     */         
/* 129 */         lq entity1 = list.get(j);
/* 130 */         if (this.ent.isEnemy(entity1))
/*     */         {
/*     */           
/* 133 */           if (sanityCheck(entity1) && entity1 instanceof md && ((md)entity1).aU() > 0) {
/* 134 */             float dist = this.ent.d(entity1);
/* 135 */             if (dist < closest) {
/* 136 */               closest = dist;
/* 137 */               clEnt = entity1;
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
/* 148 */       if (clEnt != null)
/*     */       {
/*     */         
/* 151 */         if (this.ent.isSolidPath(clEnt)) {
/*     */           
/* 153 */           if (!this.ent.isBreaking()) {
/* 154 */             this.ent.huntTarget(clEnt, -1);
/*     */           }
/*     */         } else {
/*     */           
/* 158 */           float dist = clEnt.d((lq)this.ent);
/* 159 */           if (this.retargetDelayCount == 0 && ((dist < this.retargetDist && dist > 2.0F) || this.ent.a_ == null))
/*     */           {
/*     */             
/* 162 */             if (this.ent.az().f() || ((md)clEnt).n((lq)this.ent)) {
/* 163 */               this.retargetDelayCount = this.retargetDelay;
/* 164 */               if (!this.ent.isBreaking()) {
/* 165 */                 this.ent.huntTarget(clEnt);
/*     */               
/*     */               }
/*     */             
/*     */             }
/*     */ 
/*     */           
/*     */           }
/*     */         
/*     */         }
/*     */ 
/*     */       
/*     */       }
/*     */     }
/* 179 */     else if (this.ent.a_ != null) {
/*     */       
/* 181 */       float dist = this.ent.d(this.ent.a_);
/*     */ 
/*     */       
/* 184 */       if (this.ent.az().f() && this.retargetDelayCount == 0 && dist > 2.0F) {
/* 185 */         this.retargetDelayCount = this.retargetDelay;
/* 186 */         if (this.ent.isBreaking() || 
/* 187 */           PFQueue.getPath((lq)this.ent, this.ent.a_, this.ent.maxPFRange));
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 196 */     if (clEnt == null && this.ent.a_ == null) {
/*     */       
/* 198 */       qx entP = getClosestPlayerToEntity((lq)this.ent, -1.0D, false);
/* 199 */       if (entP != null && entP.aU() > 0 && 
/* 200 */         this.ent.az().f())
/*     */       {
/* 202 */         this.ent.huntTarget((lq)entP);
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 213 */     this.ent.aS = this.ent.aU();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean sanityCheck(lq target) {
/* 220 */     return true;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/entity/JobInvade.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */