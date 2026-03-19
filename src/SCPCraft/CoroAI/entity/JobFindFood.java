/*    */ package SCPCraft.CoroAI.entity;
/*    */ 
/*    */ import lq;
/*    */ 
/*    */ public class JobFindFood extends JobBase {
/*    */   public JobFindFood(JobManager jm) {
/*  7 */     super(jm);
/*    */   }
/*    */ 
/*    */   
/*    */   public void tick() {
/* 12 */     jobFindHealth();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean shouldExecute() {
/* 17 */     return (this.ent.getFoodLevel() <= 17);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean shouldContinue() {
/* 22 */     return (this.ent.getFoodLevel() > 17);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void jobFindHealth() {
/* 27 */     if (this.state != EnumJobState.IDLE) this.ent.setEntityToAttack((lq)null);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 32 */     if (this.state == EnumJobState.IDLE) {
/* 33 */       this.ent.walkTo((lq)this.ent, this.ent.homeX, this.ent.homeY, this.ent.homeZ, this.ent.maxPFRange, 600);
/* 34 */       setJobState(EnumJobState.W1);
/* 35 */     } else if (this.state == EnumJobState.W1) {
/*    */       
/* 37 */       if (this.ent.f(this.ent.homeX, this.ent.homeY, this.ent.homeZ) < 2.0D) {
/* 38 */         this.ent.faceCoord((int)(this.ent.homeX - 0.5F), this.ent.homeY, (int)(this.ent.homeZ - 0.5F), 180.0F, 180.0F);
/* 39 */         this.ent.takeItems(this.ent.homeX, this.ent.homeY, this.ent.homeZ, -1, true);
/* 40 */         this.ent.eat();
/*    */       }
/* 42 */       else if (this.walkingTimeout <= 0 || !this.ent.k()) {
/*    */         
/* 44 */         this.ent.walkTo((lq)this.ent, this.ent.homeX, this.ent.homeY, this.ent.homeZ, this.ent.maxPFRange, 600);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/entity/JobFindFood.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */