/*     */ package SCPCraft.CoroAI.entity;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.LinkedList;
/*     */ 
/*     */ public class JobManager
/*     */ {
/*   8 */   public HashMap jobTypes = new HashMap<Object, Object>();
/*     */ 
/*     */   
/*  11 */   public c_EnhAI ent = null;
/*     */ 
/*     */   
/*  14 */   public LinkedList curJobs = new LinkedList();
/*     */   
/*     */   public EnumJob priJob;
/*     */   
/*     */   public EnumJob lastJobRun;
/*     */   
/*     */   public int lastJobRunID;
/*     */   
/*  22 */   public String debug = "";
/*     */ 
/*     */   
/*     */   public JobManager(c_EnhAI entRef) {
/*  26 */     this.ent = entRef;
/*     */     
/*  28 */     this.jobTypes.put(EnumJob.UNEMPLOYED, new JobIdle(this));
/*  29 */     this.jobTypes.put(EnumJob.FISHERMAN, new JobFish(this));
/*  30 */     this.jobTypes.put(EnumJob.HUNTER, new JobHunt(this));
/*  31 */     this.jobTypes.put(EnumJob.FINDFOOD, new JobFindFood(this));
/*  32 */     this.jobTypes.put(EnumJob.INVADER, new JobInvade(this));
/*  33 */     this.jobTypes.put(EnumJob.PROTECT, new JobProtect(this));
/*  34 */     this.jobTypes.put(EnumJob.GATHERER, new JobGather(this));
/*     */ 
/*     */     
/*  37 */     setPrimaryJob(EnumJob.UNEMPLOYED);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void tick() {
/*  43 */     this.debug = "";
/*  44 */     for (int i = 0; i < this.curJobs.size(); i++) {
/*  45 */       JobBase job = enumToJob(this.curJobs.get(i));
/*  46 */       if (job.shouldExecute()) {
/*  47 */         this.debug += job.toString() + " | ";
/*  48 */         job.tick();
/*  49 */         this.lastJobRun = this.curJobs.get(i);
/*  50 */         this.lastJobRunID = i;
/*     */       } 
/*  52 */       if (!job.shouldContinue()) {
/*     */         break;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrimaryJob(EnumJob job) {
/*  63 */     this.priJob = job;
/*     */   }
/*     */   
/*     */   public EnumJob getJob() {
/*  67 */     if (this.curJobs.size() > 0) return this.curJobs.getFirst(); 
/*  68 */     return null;
/*     */   }
/*     */   
/*     */   public JobBase getJobClass() {
/*  72 */     if (this.curJobs.size() > 0) return enumToJob(this.priJob); 
/*  73 */     return null;
/*     */   }
/*     */   
/*     */   public JobBase getPrimaryJobClass() {
/*  77 */     return getJobClass();
/*     */   }
/*     */   
/*     */   public EnumJobState getJobState() {
/*  81 */     return (getJobClass()).state;
/*     */   }
/*     */ 
/*     */   
/*     */   public void swapJob(EnumJob newJob) {
/*  86 */     for (int i = 0; i < this.curJobs.size(); i++) {
/*  87 */       enumToJob(this.curJobs.get(i)).onJobRemove();
/*     */     }
/*  89 */     clearJobs();
/*  90 */     addJob(newJob);
/*     */   }
/*     */   
/*     */   public void addJob(EnumJob newJob) {
/*  94 */     addJob(newJob, -1);
/*     */   }
/*     */   
/*     */   public void addJob(EnumJob newJob, int priority) {
/*  98 */     if (priority != -1) {
/*  99 */       this.curJobs.add(priority, newJob);
/*     */     } else {
/* 101 */       this.curJobs.add(newJob);
/*     */     } 
/*     */   }
/*     */   
/*     */   public JobBase enumToJob(EnumJob job) {
/* 106 */     JobBase temp = (JobBase)this.jobTypes.get(job);
/* 107 */     if (temp != null) {
/* 108 */       return temp;
/*     */     }
/* 110 */     return (JobBase)this.jobTypes.get(EnumJob.UNEMPLOYED);
/*     */   }
/*     */ 
/*     */   
/*     */   public void clearJobs() {
/* 115 */     this.curJobs.clear();
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/entity/JobManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */