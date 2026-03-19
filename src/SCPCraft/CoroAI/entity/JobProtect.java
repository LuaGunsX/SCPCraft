/*    */ package SCPCraft.CoroAI.entity;
/*    */ 
/*    */ import lq;
/*    */ import qx;
/*    */ 
/*    */ public class JobProtect extends JobBase {
/*  7 */   public String playerName = "";
/*  8 */   public float minDist = 2.0F;
/*  9 */   public float maxDist = 8.0F;
/*    */ 
/*    */   
/*    */   public JobProtect(JobManager jm) {
/* 13 */     super(jm);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean shouldExecute() {
/* 20 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean shouldContinue() {
/* 32 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void checkPlayer() {
/* 37 */     if (this.playerName == "") {
/* 38 */       qx entP = this.ent.p.a((lq)this.ent, 16.0D);
/* 39 */       if (entP != null) {
/* 40 */         this.playerName = entP.bR;
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void tick() {
/* 51 */     qx entP = this.ent.p.a(this.playerName);
/* 52 */     int pX = (int)(entP.t - 0.5D);
/* 53 */     int pY = (int)entP.u;
/* 54 */     int pZ = (int)(entP.v - 0.5D);
/*    */     
/* 56 */     if (this.state == EnumJobState.IDLE) {
/* 57 */       this.ent.walkTo((lq)this.ent, pX, pY, pZ, this.ent.maxPFRange, 600);
/* 58 */       setJobState(EnumJobState.W1);
/* 59 */     } else if (this.state == EnumJobState.W1) {
/* 60 */       if (this.ent.d((lq)entP) <= this.minDist) {
/*    */         
/* 62 */         this.ent.az().a(null, 0.0F);
/*    */ 
/*    */       
/*    */       }
/* 66 */       else if (this.walkingTimeout <= 0 || this.ent.az().d() == null || this.ent.az().d().b()) {
/*    */         
/* 68 */         this.ent.walkTo((lq)this.ent, pX, pY, pZ, this.ent.maxPFRange, 600);
/*    */       } 
/* 70 */     } else if (this.state == EnumJobState.W2) {
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/entity/JobProtect.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */