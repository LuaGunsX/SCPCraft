/*     */ package SCPCraft.CoroAI.entity;
/*     */ import SCPCraft.CoroAI.PFQueue;
/*     */ import SCPCraft.CoroAI.PathEntityEx;
/*     */ import SCPCraft.c_CoroAIUtil;
/*     */ import amq;
/*     */ import anm;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import la;
/*     */ import lq;
/*     */ import qx;
/*     */ import up;
/*     */ 
/*     */ public class JobGather extends JobBase {
/*  15 */   public float maxCastStr = 1.0F;
/*     */   
/*     */   public int fishingTimeout;
/*     */   
/*     */   public int dryCastX;
/*     */   
/*     */   public int dryCastY;
/*     */   public int dryCastZ;
/*     */   public int miningTimeout;
/*     */   public List gatherables;
/*     */   InfoResource ir;
/*     */   public int closeTryCount;
/*     */   
/*     */   public JobGather(JobManager jm) {
/*  29 */     super(jm);
/*  30 */     this.gatherables = new ArrayList();
/*  31 */     this.gatherables.add(Integer.valueOf(amq.M.cm));
/*  32 */     this.closeTryCount = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void onJobRemove() {
/*  37 */     if (this.ent.fishEntity != null) {
/*  38 */       this.ent.fishEntity.catchFish();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void tick() {
/*  44 */     jobFisherman();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean shouldExecute() {
/*  49 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean shouldContinue() {
/*  54 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onLowHealth() {
/*  60 */     super.onLowHealth();
/*  61 */     if (this.ent.fishEntity != null) this.ent.fishEntity.catchFish(); 
/*  62 */     if (this.ent.aa.nextInt(5) == 0) {
/*  63 */       this.ent.a_ = null;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onIdleTick() {
/*  71 */     super.onIdleTick();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void jobFisherman() {
/*  81 */     if (this.state == EnumJobState.IDLE) {
/*     */ 
/*     */       
/*  84 */       if (!findResources(10, 45)) {
/*  85 */         if (findResources(120, 45)) {
/*  86 */           setJobState(EnumJobState.W1);
/*     */         }
/*  88 */         else if (this.ent.aa.nextInt(150) != 0 || !this.ent.k()) {
/*     */ 
/*     */         
/*     */         } 
/*     */       } else {
/*  93 */         setJobState(EnumJobState.W1);
/*     */       }
/*     */     
/*  96 */     } else if (this.state == EnumJobState.W1) {
/*     */       
/*  98 */       this.ent.setState(EnumActState.WALKING);
/*     */ 
/*     */       
/* 101 */       if (this.walkingTimeout <= 0 || this.ent.az().d() == null) {
/* 102 */         float tdist = (float)this.ent.f(this.ent.targX, this.ent.targY, this.ent.targZ);
/*     */ 
/*     */ 
/*     */         
/* 106 */         findResources(10, 45);
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 115 */       if (this.ent.getDistanceXZ(this.ent.targX, this.ent.targZ) < 3.0D)
/*     */       {
/*     */ 
/*     */ 
/*     */         
/* 120 */         this.ent.setState(EnumActState.IDLE);
/* 121 */         setJobState(EnumJobState.W2);
/* 122 */         this.ent.setPathExToEntity((PathEntityEx)null);
/* 123 */         this.ent.az().g();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 137 */     else if (this.state == EnumJobState.W2) {
/* 138 */       this.ent.setPathToEntity((PathEntityEx)null);
/* 139 */       this.ent.az().g();
/* 140 */       this.ent.faceCoord(this.ent.targX, this.ent.targY, this.ent.targZ, 90.0F, 90.0F);
/* 141 */       if (this.miningTimeout <= 0) {
/* 142 */         harvestBlockInstant();
/* 143 */         this.ent.rightClickItem();
/*     */         
/* 145 */         if (getWoodCount() > 10 || (this.ent.aa.nextInt(1) == 0 && getWoodCount() >= 8)) {
/*     */           
/* 147 */           this.ent.walkTo((lq)this.ent, this.ent.homeX, this.ent.homeY, this.ent.homeZ, this.ent.maxPFRange, 600);
/* 148 */           setJobState(EnumJobState.W3);
/*     */         } else {
/* 150 */           if (findResources(5, 10));
/*     */ 
/*     */           
/* 153 */           this.ent.walkTo((lq)this.ent, this.ent.targX, this.ent.targY, this.ent.targZ, this.ent.maxPFRange, 600);
/* 154 */           setJobState(EnumJobState.W4);
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 159 */         this.miningTimeout--;
/*     */       }
/*     */     
/*     */     }
/* 163 */     else if (this.state == EnumJobState.W3) {
/*     */       
/* 165 */       if (this.walkingTimeout <= 0 || this.ent.az().d() == null)
/*     */       {
/* 167 */         this.ent.walkTo((lq)this.ent, this.ent.homeX, this.ent.homeY, this.ent.homeZ, this.ent.maxPFRange, 600);
/*     */       }
/* 169 */       if (this.ent.f(this.ent.homeX, this.ent.homeY, this.ent.homeZ) < 2.0D)
/*     */       {
/*     */         
/* 172 */         this.ent.faceCoord((int)(this.ent.homeX - 0.5F), this.ent.homeY, (int)(this.ent.homeZ - 0.5F), 180.0F, 180.0F);
/* 173 */         transferJobItems(this.ent.homeX, this.ent.homeY, this.ent.homeZ);
/*     */ 
/*     */         
/* 176 */         setJobState(EnumJobState.IDLE);
/*     */       }
/*     */     
/* 179 */     } else if (this.state == EnumJobState.W4) {
/*     */       
/* 181 */       if (this.ent.f(this.ent.targX, this.ent.targY, this.ent.targZ) <= 1.5D) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 186 */         this.ent.setState(EnumActState.IDLE);
/* 187 */         setJobState(EnumJobState.IDLE);
/* 188 */         this.ent.setPathExToEntity((PathEntityEx)null);
/* 189 */         this.ent.az().g();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 200 */       else if (this.walkingTimeout <= 0 || this.ent.az().d() == null) {
/* 201 */         setJobState(EnumJobState.IDLE);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean findLandClose() {
/* 208 */     if (this.ent.f(this.dryCastX, this.dryCastY, this.dryCastZ) < 16.0D) {
/*     */ 
/*     */ 
/*     */       
/* 212 */       this.ent.walkTo((lq)this.ent, this.dryCastX, this.dryCastY, this.dryCastZ, 32.0F, 100);
/* 213 */       setJobState(EnumJobState.W4);
/* 214 */       return true;
/* 215 */     }  if (findLand()) {
/* 216 */       return true;
/*     */     }
/* 218 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void harvestBlockInstant() {
/* 224 */     int id = this.ent.p.a(this.ent.targX, this.ent.targY, this.ent.targZ);
/* 225 */     int meta = this.ent.p.h(this.ent.targX, this.ent.targY, this.ent.targZ);
/*     */     
/* 227 */     if (id != 0) {
/* 228 */       amq.p[id].a(this.ent.p, (qx)this.ent.fakePlayer, this.ent.targX, this.ent.targY, this.ent.targZ, meta);
/* 229 */       this.ir.mine();
/* 230 */       this.ent.p.d(this.ent.targX, this.ent.targY, this.ent.targZ, 0, 0);
/* 231 */       this.miningTimeout = 10;
/*     */     } else {
/* 233 */       this.ir.mine();
/* 234 */       System.out.println("nnnnnnnnnaaaaaaayyyyyyyyyy");
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void castLine() {
/* 240 */     if (!this.ent.H()) {
/* 241 */       this.dryCastX = (int)Math.floor(this.ent.t + 0.5D);
/* 242 */       this.dryCastY = (int)this.ent.D.b;
/* 243 */       this.dryCastZ = (int)Math.floor(this.ent.v + 0.5D);
/*     */     } 
/* 245 */     double dist = this.ent.f(this.ent.targX, this.ent.targY, this.ent.targZ);
/*     */     
/* 247 */     this.ent.faceCoord(this.ent.targX, this.ent.targY, this.ent.targZ, 180.0F, 180.0F);
/*     */     
/* 249 */     this.ent.castingStrength = (float)dist / 17.0F;
/* 250 */     if (this.ent.castingStrength < 0.25D) this.ent.castingStrength = 0.25F; 
/* 251 */     if (this.ent.castingStrength > this.maxCastStr) {
/* 252 */       this.ent.castingStrength = this.maxCastStr;
/*     */     }
/* 254 */     this.ent.A -= 25.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 259 */     c_CoroAIUtil.equipFishingRod(this.ent);
/*     */ 
/*     */     
/* 262 */     this.fishingTimeout = 400;
/* 263 */     if (this.ent.fishEntity != null) {
/* 264 */       this.ent.fishEntity.catchFish();
/*     */     }
/* 266 */     if (this.ent.fishEntity != null) {
/* 267 */       this.ent.fishEntity.x();
/*     */     }
/* 269 */     this.ent.fishEntity = null;
/* 270 */     this.ent.rightClickItem();
/*     */   }
/*     */ 
/*     */   
/*     */   protected int getWoodCount() {
/* 275 */     return this.ent.getItemCount(amq.M.cm);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean isFish(int id) {
/* 280 */     return (id == up.aU.cj);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void transferJobItems(int x, int y, int z) {
/* 285 */     if (this.ent.isChest(this.ent.p.a(x, y - 1, z))) {
/* 286 */       y--;
/*     */     }
/* 288 */     boolean transferred = false;
/* 289 */     if (this.ent.isChest(this.ent.p.a(x, y, z))) {
/* 290 */       anm chest = (anm)this.ent.p.q(x, y, z);
/* 291 */       if (chest != null) {
/* 292 */         this.ent.openHomeChest();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 329 */         transferItems((la)this.ent.inventory, (la)chest, -1, -1, true);
/*     */       } 
/*     */     } else {
/*     */       
/* 333 */       tossItems();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void tossItems() {
/* 338 */     for (int j = 0; j < this.ent.inventory.a.length; j++) {
/*     */       
/* 340 */       if (this.ent.inventory.a[j] != null && isFish((this.ent.inventory.a[j]).c))
/*     */       {
/* 342 */         this.ent.dropPlayerItemWithRandomChoice(this.ent.inventory.a(j, (this.ent.inventory.a[j]).a), false);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setJobItems() {
/* 350 */     c_CoroAIUtil.setItems_JobGather(this.ent);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean findResources(int size, int tries) {
/* 355 */     return findResources(size, tries, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean findResources(int size, int tries, boolean forceNew) {
/* 360 */     if (this.ir == null || this.ir.mined) {
/* 361 */       this.ir = (InfoResource)GroupInfo.getFirstResource(EnumResource.WOOD);
/*     */     }
/*     */     
/* 364 */     if (!forceNew && this.ir != null && !this.ir.mined) {
/* 365 */       this.ent.setState(EnumActState.WALKING);
/* 366 */       this.walkingTimeout = 300;
/* 367 */       this.ent.targX = this.ir.x;
/* 368 */       this.ent.targY = this.ir.y;
/* 369 */       this.ent.targZ = this.ir.z;
/* 370 */       PFQueue.getPath((lq)this.ent, this.ent.targX, this.ent.targY - 1, this.ent.targZ, 64.0F);
/*     */ 
/*     */       
/* 373 */       return true;
/*     */     } 
/* 375 */     int scanSize = this.ent.maxPFRange;
/* 376 */     int scanSizeY = size;
/*     */ 
/*     */     
/* 379 */     int tryY = (int)this.ent.u - 1;
/*     */ 
/*     */     
/* 382 */     int i = tryY + this.ent.aa.nextInt(scanSizeY) - scanSizeY / 2;
/*     */ 
/*     */     
/* 385 */     for (int ii = 0; ii <= tries; ii++) {
/* 386 */       int tryX = (int)this.ent.t + this.ent.aa.nextInt(scanSize) - scanSize / 2;
/* 387 */       i = tryY + this.ent.aa.nextInt(scanSizeY) - scanSizeY / 2;
/* 388 */       int tryZ = (int)this.ent.v + this.ent.aa.nextInt(scanSize) - scanSize / 2;
/* 389 */       int id = this.ent.p.a(tryX, i, tryZ);
/*     */       
/* 391 */       if (isResourceBlock(id)) {
/*     */ 
/*     */         
/* 394 */         int newY = i;
/*     */         
/* 396 */         this.ir = GroupInfo.addResource(tryX, i, tryZ, EnumResource.WOOD);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 402 */         PFQueue.getPath((lq)this.ent, tryX, newY - 1, tryZ, (scanSize / 2 + 6));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 411 */         this.ent.setState(EnumActState.WALKING);
/* 412 */         this.walkingTimeout = 300;
/* 413 */         this.ent.targX = tryX;
/* 414 */         this.ent.targY = newY;
/* 415 */         this.ent.targZ = tryZ;
/*     */ 
/*     */         
/* 418 */         return true;
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 426 */     return false;
/*     */   }
/*     */   
/*     */   public boolean isResourceBlock(int id) {
/* 430 */     for (int i = 0; i < this.gatherables.size(); i++) {
/* 431 */       if (((Integer)this.gatherables.get(i)).intValue() == id) {
/* 432 */         return true;
/*     */       }
/*     */     } 
/* 435 */     return false;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/entity/JobGather.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */