/*     */ package SCPCraft.CoroAI.entity;
/*     */ 
/*     */ import SCPCraft.CoroAI.PathEntityEx;
/*     */ import SCPCraft.c_CoroAIUtil;
/*     */ import lq;
/*     */ import up;
/*     */ 
/*     */ public class JobFish extends JobBase {
/*   9 */   public float maxCastStr = 1.0F;
/*     */   
/*     */   public int fishingTimeout;
/*     */   
/*     */   public int dryCastX;
/*     */   public int dryCastY;
/*     */   public int dryCastZ;
/*     */   
/*     */   public JobFish(JobManager jm) {
/*  18 */     super(jm);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onJobRemove() {
/*  23 */     if (this.ent.fishEntity != null) {
/*  24 */       this.ent.fishEntity.catchFish();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void tick() {
/*  30 */     super.tick();
/*  31 */     jobFisherman();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean shouldExecute() {
/*  36 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean shouldContinue() {
/*  41 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onLowHealth() {
/*  47 */     super.onLowHealth();
/*  48 */     if (this.ent.fishEntity != null) this.ent.fishEntity.catchFish(); 
/*  49 */     if (this.ent.aa.nextInt(5) == 0) {
/*  50 */       this.ent.a_ = null;
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
/*     */   protected void jobFisherman() {
/*  62 */     this.ent.maxDistanceFromHome = 16.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  67 */     if (this.state == EnumJobState.IDLE) {
/*     */ 
/*     */       
/*  70 */       if (findWater()) {
/*  71 */         setJobState(EnumJobState.W1);
/*     */       }
/*  73 */       else if (this.ent.aa.nextInt(150) == 0 && this.ent.az().f()) {
/*  74 */         this.ent.i();
/*     */       }
/*     */     
/*     */     }
/*  78 */     else if (this.state == EnumJobState.W1) {
/*     */ 
/*     */ 
/*     */       
/*  82 */       if (!this.ent.H()) {
/*  83 */         if (this.walkingTimeout <= 0 || this.ent.az().f()) {
/*  84 */           float tdist = (float)this.ent.f(this.ent.targX, this.ent.targY, this.ent.targZ);
/*     */ 
/*     */ 
/*     */           
/*  88 */           this.ent.walkTo((lq)this.ent, this.ent.targX, this.ent.targY, this.ent.targZ, this.ent.maxPFRange, 600);
/*     */         }
/*     */       
/*  91 */       } else if (findLandClose()) {
/*  92 */         setJobState(EnumJobState.W4);
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  98 */       if (this.ent.f(this.ent.targX, this.ent.targY, this.ent.targZ) < 8.0D || this.ent.H() || this.ent.facingWater || nextNodeWater())
/*     */       {
/*     */         
/* 101 */         if (this.ent.canCoordBeSeenFromFeet(this.ent.targX, this.ent.targY, this.ent.targZ))
/*     */         {
/* 103 */           this.ent.setState(EnumActState.IDLE);
/* 104 */           setJobState(EnumJobState.W2);
/* 105 */           this.ent.setPathExToEntity((PathEntityEx)null);
/* 106 */           this.ent.az().g();
/* 107 */           castLine();
/*     */         
/*     */         }
/*     */         else
/*     */         {
/* 112 */           setJobState(EnumJobState.IDLE);
/*     */         
/*     */         }
/*     */ 
/*     */       
/*     */       }
/*     */     }
/* 119 */     else if (this.state == EnumJobState.W2) {
/*     */       
/* 121 */       if (!this.ent.H()) {
/* 122 */         this.ent.setPathToEntity((PathEntityEx)null);
/* 123 */         this.ent.az().g();
/* 124 */         this.ent.faceCoord(this.ent.targX, this.ent.targY, this.ent.targZ, 90.0F, 90.0F);
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
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 139 */       if (this.ent.fishEntity == null);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 144 */       if (this.ent.fishEntity == null || this.fishingTimeout <= 0 || (this.ent.fishEntity != null && (this.ent.fishEntity.inGround || (this.ent.fishEntity.ticksCatchable > 0 && this.ent.fishEntity.ticksCatchable < 10)))) {
/* 145 */         if (this.ent.fishEntity != null) {
/* 146 */           this.ent.fishEntity.catchFish();
/*     */         }
/*     */ 
/*     */ 
/*     */         
/* 151 */         if (getFishCount() > 4 || (this.ent.aa.nextInt(1) == 0 && getFishCount() >= 2)) {
/*     */           
/* 153 */           this.ent.walkTo((lq)this.ent, this.ent.homeX, this.ent.homeY, this.ent.homeZ, this.ent.maxPFRange, 600);
/* 154 */           setJobState(EnumJobState.W3);
/*     */         }
/* 156 */         else if (this.ent.aa.nextInt(2) == 0) {
/*     */           
/* 158 */           setJobState(EnumJobState.IDLE);
/*     */         }
/*     */         else {
/*     */           
/* 162 */           castLine();
/*     */         } 
/*     */ 
/*     */         
/* 166 */         this.ent.setState(EnumActState.IDLE);
/*     */       } else {
/*     */         
/* 169 */         this.fishingTimeout--;
/*     */       }
/*     */     
/*     */     }
/* 173 */     else if (this.state == EnumJobState.W3) {
/* 174 */       if (this.ent.fishEntity != null) {
/* 175 */         this.ent.fishEntity.catchFish();
/*     */       }
/*     */       
/* 178 */       if (this.walkingTimeout <= 0 || this.ent.az().f())
/*     */       {
/* 180 */         this.ent.walkTo((lq)this.ent, this.ent.homeX, this.ent.homeY, this.ent.homeZ, this.ent.maxPFRange, 600);
/*     */       }
/* 182 */       if (this.ent.f(this.ent.homeX, this.ent.homeY, this.ent.homeZ) < 2.0D)
/*     */       {
/*     */         
/* 185 */         this.ent.faceCoord((int)(this.ent.homeX - 0.5F), this.ent.homeY, (int)(this.ent.homeZ - 0.5F), 180.0F, 180.0F);
/* 186 */         transferJobItems(this.ent.homeX, this.ent.homeY, this.ent.homeZ);
/*     */ 
/*     */         
/* 189 */         setJobState(EnumJobState.IDLE);
/*     */       }
/*     */     
/* 192 */     } else if (this.state == EnumJobState.W4) {
/*     */       
/* 194 */       if (this.walkingTimeout <= 0 || this.ent.az().f()) {
/*     */         
/* 196 */         if (this.ent.f(this.dryCastX, this.dryCastY, this.dryCastZ) < 10.0D) {
/* 197 */           this.ent.walkTo((lq)this.ent, this.dryCastX, this.dryCastY, this.dryCastZ, this.ent.maxPFRange, 600);
/*     */         } else {
/* 199 */           this.ent.walkTo((lq)this.ent, this.ent.targX, this.ent.targY, this.ent.targZ, this.ent.maxPFRange, 600);
/*     */         }
/*     */       
/*     */       }
/* 203 */       else if (this.ent.f(this.dryCastX, this.dryCastY, this.dryCastZ) < 1.0D) {
/* 204 */         this.ent.setState(EnumActState.IDLE);
/* 205 */         this.ent.setPathExToEntity((PathEntityEx)null);
/* 206 */         this.ent.az().g();
/* 207 */         castLine();
/* 208 */         setJobState(EnumJobState.W2);
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
/*     */   protected boolean findLandClose() {
/* 232 */     if (this.ent.f(this.dryCastX, this.dryCastY, this.dryCastZ) < 16.0D) {
/*     */ 
/*     */ 
/*     */       
/* 236 */       this.ent.walkTo((lq)this.ent, this.dryCastX, this.dryCastY, this.dryCastZ, 32.0F, 100);
/* 237 */       setJobState(EnumJobState.W4);
/* 238 */       return true;
/* 239 */     }  if (findLand()) {
/* 240 */       return true;
/*     */     }
/* 242 */     return false;
/*     */   }
/*     */   
/*     */   protected void castLine() {
/* 246 */     if (!this.ent.H()) {
/* 247 */       this.dryCastX = (int)Math.floor(this.ent.t + 0.5D);
/* 248 */       this.dryCastY = (int)this.ent.D.b;
/* 249 */       this.dryCastZ = (int)Math.floor(this.ent.v + 0.5D);
/*     */     } 
/* 251 */     double dist = this.ent.f(this.ent.targX, this.ent.targY, this.ent.targZ);
/*     */     
/* 253 */     this.ent.faceCoord(this.ent.targX, this.ent.targY, this.ent.targZ, 180.0F, 180.0F);
/*     */     
/* 255 */     this.ent.castingStrength = (float)dist / 17.0F;
/* 256 */     if (this.ent.castingStrength < 0.25D) this.ent.castingStrength = 0.25F; 
/* 257 */     if (this.ent.castingStrength > this.maxCastStr) {
/* 258 */       this.ent.castingStrength = this.maxCastStr;
/*     */     }
/* 260 */     this.ent.A -= 25.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 265 */     c_CoroAIUtil.equipFishingRod(this.ent);
/*     */ 
/*     */     
/* 268 */     this.fishingTimeout = 400;
/* 269 */     if (this.ent.fishEntity != null) {
/* 270 */       this.ent.fishEntity.catchFish();
/*     */     }
/* 272 */     if (this.ent.fishEntity != null) {
/* 273 */       this.ent.fishEntity.x();
/*     */     }
/* 275 */     this.ent.fishEntity = null;
/* 276 */     this.ent.rightClickItem();
/*     */   }
/*     */ 
/*     */   
/*     */   protected int getFishCount() {
/* 281 */     return this.ent.getItemCount(up.aU.cj);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean isFish(int id) {
/* 286 */     return (id == up.aU.cj);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void transferJobItems(int x, int y, int z) {
/* 291 */     if (this.ent.isChest(this.ent.p.a(x, y - 1, z))) {
/* 292 */       y--;
/*     */     }
/* 294 */     boolean transferred = false;
/* 295 */     if (!c_CoroAIUtil.tryTransferToChest(this.ent, x, y, z))
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 301 */       tossItems();
/*     */     }
/*     */   }
/*     */   
/*     */   public void tossItems() {
/* 306 */     for (int j = 0; j < this.ent.inventory.a.length; j++) {
/*     */       
/* 308 */       if (this.ent.inventory.a[j] != null && isFish((this.ent.inventory.a[j]).c))
/*     */       {
/* 310 */         this.ent.dropPlayerItemWithRandomChoice(this.ent.inventory.a(j, (this.ent.inventory.a[j]).a), false);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setJobItems() {
/* 318 */     c_CoroAIUtil.setItems_JobFish(this.ent);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/entity/JobFish.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */