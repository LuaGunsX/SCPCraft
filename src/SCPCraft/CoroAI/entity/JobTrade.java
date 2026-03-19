/*     */ package SCPCraft.CoroAI.entity;
/*     */ import SCPCraft.CoroAI.PathEntityEx;
/*     */ import lq;
/*     */ import qx;
/*     */ import up;
/*     */ import ur;
/*     */ 
/*     */ public class JobTrade extends JobBase {
/*   9 */   public float tradeDistTrigger = 3.0F;
/*     */   
/*     */   public int tradeLastItemOffer;
/*     */   
/*     */   public JobTrade(JobManager jm) {
/*  14 */     super(jm);
/*     */   }
/*     */   
/*     */   public void tick() {
/*  18 */     jobTrading();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void jobTrading() {
/*  25 */     qx entP = this.ent.p.a((lq)this.ent, 16.0D);
/*  26 */     int pX = (int)(entP.t - 0.5D);
/*  27 */     int pY = (int)entP.u;
/*  28 */     int pZ = (int)(entP.v - 0.5D);
/*     */ 
/*     */     
/*  31 */     if (this.ent.d((lq)entP) > this.tradeDistTrigger) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  36 */       this.tradeTimeout = 600;
/*  37 */       this.ent.swapJob(this.jm.priJob);
/*     */     } 
/*     */     
/*  40 */     if (this.state == EnumJobState.IDLE) {
/*  41 */       this.ent.walkTo((lq)this.ent, pX, pY, pZ, this.ent.maxPFRange, 600);
/*  42 */       setJobState(EnumJobState.W1);
/*  43 */     } else if (this.state == EnumJobState.W1) {
/*  44 */       if (this.ent.d((lq)entP) <= 2.0F) {
/*  45 */         this.ent.setPathExToEntity((PathEntityEx)null);
/*  46 */         this.ent.a((lq)entP, 30.0F, 30.0F);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  53 */         int itemSlot = getRandomTradeItemSlot();
/*  54 */         this.ent.setCurrentSlot(itemSlot);
/*     */         
/*  56 */         setJobState(EnumJobState.W2);
/*  57 */       } else if (this.walkingTimeout <= 0 || !this.ent.k()) {
/*     */ 
/*     */       
/*     */       }
/*     */     
/*  62 */     } else if (this.state == EnumJobState.W2) {
/*     */ 
/*     */       
/*  65 */       if (this.ent.inventory.c == 0) {
/*  66 */         this.ent.setCurrentSlot(getRandomTradeItemSlot());
/*     */       }
/*     */       
/*  69 */       if (entP.bS() != null && this.tradeLastItemOffer != (entP.bS()).c) {
/*  70 */         up tryItem = entP.bS().b();
/*  71 */         this.tradeLastItemOffer = (entP.bS()).c;
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  82 */       this.ent.a((lq)entP, 10.0F, 10.0F);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int getRandomTradeItemSlot() {
/*  92 */     this.ent.activeTradeItemSlot = this.ent.slot_Trade - this.ent.aa.nextInt(3);
/*     */     
/*  94 */     return this.ent.activeTradeItemSlot;
/*     */   }
/*     */   
/*     */   public void koaTrade(qx ep) {
/*  98 */     ur itemPlayer = ep.bS();
/*  99 */     ur itemKoa = this.ent.getCurrentEquippedItem();
/*     */     
/* 101 */     if (itemKoa == null || itemPlayer == null) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 106 */     if (itemPlayer.e() && itemPlayer.a > 0) itemPlayer.a--; 
/* 107 */     if (itemPlayer.a <= 0 || !itemPlayer.e()) {
/* 108 */       ep.bJ.a[ep.bJ.c] = null;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 116 */     ep.bJ.a(itemKoa);
/* 117 */     this.ent.inventory.a(itemPlayer);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 124 */     this.ent.swapJob(this.ent.job.priJob);
/*     */ 
/*     */     
/* 127 */     this.tradeTimeout = 12000;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/entity/JobTrade.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */