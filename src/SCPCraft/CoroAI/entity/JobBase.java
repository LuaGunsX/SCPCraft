/*     */ package SCPCraft.CoroAI.entity;
/*     */ 
/*     */ import SCPCraft.CoroAI.PFQueue;
/*     */ import agi;
/*     */ import ahl;
/*     */ import amq;
/*     */ import aoh;
/*     */ import aoi;
/*     */ import aoj;
/*     */ import java.util.List;
/*     */ import ke;
/*     */ import la;
/*     */ import lh;
/*     */ import lq;
/*     */ import md;
/*     */ import qx;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class JobBase
/*     */ {
/*  24 */   public JobManager jm = null;
/*  25 */   public c_EnhAI ent = null;
/*     */ 
/*     */   
/*     */   public EnumJobState state;
/*     */   
/*  30 */   public int hitAndRunDelay = 0;
/*  31 */   public int tradeTimeout = 0;
/*     */   
/*     */   public int walkingTimeout;
/*  34 */   public int fleeDelay = 0;
/*     */ 
/*     */   
/*     */   public JobBase() {}
/*     */ 
/*     */   
/*     */   public JobBase(JobManager jm) {
/*  41 */     this.jm = jm;
/*  42 */     this.ent = jm.ent;
/*  43 */     setJobState(EnumJobState.IDLE);
/*     */   }
/*     */   
/*     */   public void setJobState(EnumJobState ekos) {
/*  47 */     this.state = ekos;
/*     */   }
/*     */ 
/*     */   
/*     */   public void tick() {
/*  52 */     if (this.hitAndRunDelay > 0) this.hitAndRunDelay--; 
/*  53 */     if (this.tradeTimeout > 0) this.tradeTimeout--; 
/*     */   }
/*     */   
/*     */   public boolean shouldExecute() {
/*  57 */     return true;
/*     */   }
/*     */   
/*     */   public boolean shouldContinue() {
/*  61 */     return true;
/*     */   }
/*     */   
/*     */   public void onLowHealth() {
/*  65 */     ahl pe = this.ent.az().d();
/*     */     
/*  67 */     if (pe != null && !pe.b())
/*     */     {
/*  69 */       if (this.ent.p.a(pe.a((lq)this.ent), aoj.a(this.ent.t, this.ent.u + this.ent.e(), this.ent.v)) == null) {
/*  70 */         pe.a();
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
/*     */     
/*  82 */     if (this.ent.E && this.ent.F && !this.ent.isBreaking()) {
/*  83 */       this.ent.bi();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onIdleTick() {
/*  90 */     if (this.ent.az().f() && this.ent.aa.nextInt(5) == 0) {
/*     */ 
/*     */ 
/*     */       
/*  94 */       if (this.ent.f(this.ent.homeX, this.ent.homeY, this.ent.homeZ) < this.ent.maxDistanceFromHome) {
/*  95 */         if (this.ent.aa.nextInt(5) == 0) {
/*  96 */           int randsize = 8;
/*  97 */           this.ent.walkTo((lq)this.ent, this.ent.homeX + this.ent.aa.nextInt(randsize) - randsize / 2, this.ent.homeY + 1, this.ent.homeZ + this.ent.aa.nextInt(randsize) - randsize / 2, this.ent.maxPFRange, 600);
/*     */         } else {
/*  99 */           this.ent.i();
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 104 */         int randsize = 8;
/* 105 */         this.ent.walkTo((lq)this.ent, this.ent.homeX + this.ent.aa.nextInt(randsize) - randsize / 2, this.ent.homeY + 1, this.ent.homeZ + this.ent.aa.nextInt(randsize) - randsize / 2, this.ent.maxPFRange, 600);
/*     */       }
/*     */     
/* 108 */     } else if (this.ent.az().f()) {
/* 109 */       this.ent.lookForItems();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onJobRemove() {
/* 118 */     this.ent.setCurrentSlot(0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setJobItems() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean sanityCheck(lq target) {
/* 128 */     return false;
/*     */   }
/*     */   
/*     */   public boolean sanityCheckHelp(lq caller, lq target) {
/* 132 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void koaTrade(qx ep) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void hitHook(lh ds, int damage) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean checkHunger() {
/* 148 */     if (this.ent.getFoodLevel() <= 16)
/*     */     {
/* 150 */       if (!this.ent.eat())
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 156 */         return true;
/*     */       }
/*     */     }
/*     */ 
/*     */     
/* 161 */     return false;
/*     */   }
/*     */   
/*     */   public boolean avoid(boolean actOnTrue) {
/* 165 */     lq clEnt = null;
/* 166 */     float closest = 9999.0F;
/*     */     
/* 168 */     if (this.ent.lastFleeEnt != null && this.ent.lastFleeEnt.L) this.ent.lastFleeEnt = null; 
/* 169 */     if (this.fleeDelay > 0) this.fleeDelay--;
/*     */     
/* 171 */     float range = 15.0F;
/*     */     
/* 173 */     List<lq> list = this.ent.p.b((lq)this.ent, this.ent.D.b(range, (range / 2.0F), range));
/* 174 */     for (int j = 0; j < list.size(); j++) {
/*     */       
/* 176 */       lq entity1 = list.get(j);
/* 177 */       if (!entity1.L && this.ent.isEnemy(entity1))
/*     */       {
/* 179 */         if (((md)entity1).n((lq)this.ent)) {
/*     */           
/* 181 */           float dist = this.ent.d(entity1);
/* 182 */           if (dist < closest) {
/* 183 */             closest = dist;
/* 184 */             clEnt = entity1;
/*     */           } 
/*     */         } 
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 195 */     ahl path = this.ent.az().d();
/*     */     
/* 197 */     if (clEnt != null)
/* 198 */     { if (clEnt != this.ent.lastFleeEnt || this.ent.az().f()) {
/* 199 */         this.ent.lastFleeEnt = clEnt;
/* 200 */         if (actOnTrue && this.fleeDelay <= 0) fleeFrom(clEnt); 
/*     */       }  }
/* 202 */     else if (this.ent.lastFleeEnt != null && 
/* 203 */       actOnTrue && this.fleeDelay <= 0) { fleeFrom(this.ent.lastFleeEnt); }
/*     */ 
/*     */ 
/*     */     
/* 207 */     if (this.ent.lastFleeEnt != null) {
/* 208 */       if (this.ent.lastFleeEnt.L) this.ent.lastFleeEnt = null; 
/* 209 */       setJobState(EnumJobState.W1);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 214 */     if (clEnt != null) return true; 
/* 215 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void fleeFrom(lq fleeFrom) {
/* 220 */     this.fleeDelay = 10;
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
/* 231 */     double d = fleeFrom.t - this.ent.t;
/*     */     double d1;
/* 233 */     for (d1 = fleeFrom.v - this.ent.v; d * d + d1 * d1 < 1.0E-4D; d1 = (Math.random() - Math.random()) * 0.01D)
/*     */     {
/* 235 */       d = (Math.random() - Math.random()) * 0.01D;
/*     */     }
/* 237 */     float f = ke.a(d * d + d1 * d1);
/*     */ 
/*     */ 
/*     */     
/* 241 */     float yaw = (float)(Math.atan2(d1, d) * 180.0D / 3.1415927410125732D) - this.ent.z;
/*     */     
/* 243 */     float look = (this.ent.aa.nextInt(8) - 4);
/*     */     
/* 245 */     double dist = (this.ent.aa.nextInt(8) + 8);
/* 246 */     int gatherX = (int)(this.ent.t + -Math.sin(((yaw + look) / 180.0F * 3.1415927F)) * Math.cos((this.ent.A / 180.0F * 3.1415927F)) * dist);
/* 247 */     int gatherY = (int)(this.ent.u - 0.5D + -ke.a(this.ent.A / 180.0F * 3.1415927F) * dist - 0.0D);
/* 248 */     int gatherZ = (int)(this.ent.v + Math.cos(((yaw + look) / 180.0F * 3.1415927F)) * Math.cos((this.ent.A / 180.0F * 3.1415927F)) * dist);
/*     */     
/* 250 */     gatherX = (int)(this.ent.t - d / f * dist);
/* 251 */     gatherZ = (int)(this.ent.v - d1 / f * dist);
/*     */     
/* 253 */     int id = this.ent.p.a(gatherX, gatherY, gatherZ);
/*     */     
/* 255 */     int offset = -10;
/*     */     
/* 257 */     while (offset < 10 && 
/* 258 */       id != 0)
/*     */     {
/*     */ 
/*     */       
/* 262 */       id = this.ent.p.a(gatherX, gatherY + offset++, gatherZ);
/*     */     }
/*     */     
/* 265 */     double homeDist = this.ent.f(this.ent.homeX, this.ent.homeY, this.ent.homeZ);
/*     */     
/* 267 */     if (this.ent.job.getJobClass() instanceof JobHunt && homeDist > this.ent.maxDistanceFromHome / 2.0D) {
/* 268 */       this.ent.walkTo((lq)this.ent, this.ent.homeX, this.ent.homeY, this.ent.homeZ, (float)homeDist, 600);
/*     */     }
/* 270 */     else if (offset < 10) {
/* 271 */       this.ent.walkTo((lq)this.ent, gatherX, gatherY, gatherZ, this.ent.maxPFRange, 600, -1);
/*     */     } else {
/*     */       
/* 274 */       this.ent.walkTo((lq)this.ent, this.ent.homeX, this.ent.homeY, this.ent.homeZ, (float)homeDist, 600);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean findWater() {
/* 281 */     int scanSize = this.ent.maxPFRange;
/* 282 */     int scanSizeY = 60;
/*     */ 
/*     */     
/* 285 */     int tryY = (int)this.ent.u - 1;
/*     */ 
/*     */     
/* 288 */     int i = tryY + this.ent.aa.nextInt(scanSizeY) - scanSizeY / 2;
/*     */ 
/*     */     
/* 291 */     for (int ii = 0; ii <= 5; ii++) {
/* 292 */       int tryX = (int)this.ent.t + this.ent.aa.nextInt(scanSize) - scanSize / 2;
/* 293 */       i = tryY + this.ent.aa.nextInt(scanSizeY) - scanSizeY / 2;
/* 294 */       int tryZ = (int)this.ent.v + this.ent.aa.nextInt(scanSize) - scanSize / 2;
/* 295 */       if (this.ent.p.a(tryX, i, tryZ) == amq.E.cm || (amq.p[this.ent.p.a(tryX, i, tryZ)] != null && (amq.p[this.ent.p.a(tryX, i, tryZ)]).cB == agi.h)) {
/*     */ 
/*     */         
/* 298 */         int newY = i;
/*     */         
/* 300 */         while (this.ent.p.a(tryX, newY, tryZ) != 0) {
/* 301 */           newY++;
/*     */         }
/*     */         
/* 304 */         PFQueue.getPath((lq)this.ent, tryX, newY - 1, tryZ, (scanSize / 2 + 6));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 313 */         this.ent.setState(EnumActState.WALKING);
/* 314 */         this.walkingTimeout = 300;
/* 315 */         this.ent.targX = tryX;
/* 316 */         this.ent.targY = tryY;
/* 317 */         this.ent.targZ = tryZ;
/*     */         
/* 319 */         return true;
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 326 */     return false;
/*     */   }
/*     */   
/*     */   public boolean nextNodeWater() {
/* 330 */     if (this.ent.pathToEntity != null && this.ent.pathToEntity.points.length > 2) {
/* 331 */       int index = this.ent.pathToEntity.pathIndex + 1;
/* 332 */       if (index >= this.ent.pathToEntity.points.length) index = this.ent.pathToEntity.points.length - 1; 
/* 333 */       int x = (this.ent.pathToEntity.points[index]).xCoord;
/* 334 */       int y = (this.ent.pathToEntity.points[index]).yCoord;
/* 335 */       int z = (this.ent.pathToEntity.points[index]).zCoord;
/* 336 */       int id = this.ent.p.a(x, y - 1, z);
/*     */ 
/*     */       
/* 339 */       if (id == 0) {
/* 340 */         y = (this.ent.pathToEntity.points[index]).yCoord - 5;
/* 341 */         id = this.ent.p.a(x, y, z);
/*     */       } 
/*     */       
/* 344 */       if (amq.p[id] != null && (amq.p[id]).cB == agi.h) {
/* 345 */         return true;
/*     */       }
/*     */     } 
/* 348 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean findLand() {
/* 353 */     int scanSize = 64;
/*     */     
/* 355 */     int tryX = (int)this.ent.t + this.ent.aa.nextInt(scanSize) - scanSize / 2;
/* 356 */     int tryY = (int)this.ent.u - 1;
/* 357 */     int tryZ = (int)this.ent.v + this.ent.aa.nextInt(scanSize) - scanSize / 2;
/*     */ 
/*     */     
/* 360 */     for (int i = tryY; i > tryY - 10; i--) {
/* 361 */       if (this.ent.p.a(tryX, i, tryZ) != 0 && (amq.p[this.ent.p.a(tryX, i, tryZ)] == null || (amq.p[this.ent.p.a(tryX, i, tryZ)]).cB != agi.h)) {
/*     */ 
/*     */         
/* 364 */         PFQueue.getPath((lq)this.ent, tryX, tryY, tryZ, (scanSize / 2 + 6));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 371 */         this.ent.setState(EnumActState.WALKING);
/* 372 */         this.walkingTimeout = 300;
/* 373 */         this.ent.targX = tryX;
/* 374 */         this.ent.targY = tryY;
/* 375 */         this.ent.targZ = tryZ;
/*     */         
/* 377 */         return true;
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 384 */     return false;
/*     */   }
/*     */   
/*     */   public qx getClosestVulnerablePlayerToEntity(lq par1Entity, double par2) {
/* 388 */     return getClosestPlayerToEntity(par1Entity, par2, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public qx getClosestPlayerToEntity(lq par1Entity, double par2, boolean survivalOnly) {
/* 393 */     return getClosestPlayer(par1Entity.p, par1Entity.t, par1Entity.u, par1Entity.v, par2, survivalOnly);
/*     */   }
/*     */ 
/*     */   
/*     */   public qx getClosestPlayer(yc world, double par1, double par3, double par5, double par7, boolean survivalOnly) {
/* 398 */     double var9 = -1.0D;
/* 399 */     qx var11 = null;
/*     */     
/* 401 */     for (int var12 = 0; var12 < world.h.size(); var12++) {
/*     */       
/* 403 */       qx var13 = world.h.get(var12);
/*     */       
/* 405 */       if ((!var13.cd.a || !survivalOnly) && var13.aU() > 0) {
/*     */         
/* 407 */         double var14 = var13.e(par1, par3, par5);
/*     */         
/* 409 */         if ((par7 < 0.0D || var14 < par7 * par7) && (var9 == -1.0D || var14 < var9)) {
/*     */           
/* 411 */           var9 = var14;
/* 412 */           var11 = var13;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 417 */     return var11;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void transferItems(la invFrom, la invTo, int id, int transferCount, boolean foodOverride) {
/* 423 */     int count = 0;
/* 424 */     for (int j = 0; j < invFrom.k_(); j++) {
/*     */ 
/*     */       
/* 427 */       ur ourStack = invFrom.a(j);
/* 428 */       if (ourStack != null && ((id == -1 && !foodOverride) || ourStack.c == id || (ourStack.b() instanceof uk && foodOverride)))
/*     */       {
/* 430 */         for (int k = 0; k < invTo.k_(); k++) {
/* 431 */           ur theirStack = invTo.a(k);
/*     */ 
/*     */ 
/*     */           
/* 435 */           if (theirStack == null) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 441 */             int space = 64;
/*     */             
/* 443 */             int addCount = ourStack.a;
/*     */             
/* 445 */             if (ourStack.a < 0) {
/* 446 */               System.out.println("!! ourStack.stackSize < 0");
/*     */             }
/*     */ 
/*     */             
/* 450 */             if (transferCount < addCount && transferCount != -1) addCount = transferCount;
/*     */ 
/*     */             
/* 453 */             ourStack.a -= addCount;
/*     */             
/* 455 */             invTo.a(k, new ur(ourStack.c, addCount, ourStack.j()));
/* 456 */             if (transferCount != -1) transferCount -= addCount;
/*     */             
/* 458 */             if (ourStack.a == 0) {
/* 459 */               invFrom.a(j, null); break;
/*     */             } 
/* 461 */             if (ourStack.a < 0) {
/* 462 */               System.out.println("ourStack.stackSize < 0");
/*     */             }
/*     */             
/* 465 */             if (transferCount == 0)
/*     */             {
/*     */               return;
/*     */             
/*     */             }
/*     */           }
/* 471 */           else if (ourStack.c == theirStack.c && theirStack.a < theirStack.d()) {
/* 472 */             int space = theirStack.d() - theirStack.a;
/*     */             
/* 474 */             int addCount = ourStack.a;
/*     */             
/* 476 */             if (space < ourStack.a) addCount = space; 
/* 477 */             if (transferCount < addCount && transferCount != -1) addCount = transferCount;
/*     */ 
/*     */             
/* 480 */             ourStack.a -= addCount;
/* 481 */             theirStack.a += addCount;
/* 482 */             if (transferCount != -1) transferCount -= addCount;
/*     */             
/* 484 */             if (ourStack.a == 0) {
/* 485 */               invFrom.a(j, null);
/*     */               
/*     */               break;
/*     */             } 
/* 489 */             if (transferCount == 0) {
/*     */               return;
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
/*     */   public void onCloseCombatTick() {
/* 503 */     if (this.ent.isBreaking()) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 512 */     float closeFactor = 1.0F;
/*     */     
/* 514 */     if (this.ent.d(this.ent.a_) < 1.1F) {
/* 515 */       closeFactor = 0.5F;
/*     */     }
/*     */     
/* 518 */     if (!this.ent.E) {
/* 519 */       closeFactor = 0.1F;
/*     */     }
/*     */     
/* 522 */     float speed = this.ent.getMoveSpeed() * this.ent.lungeFactor * closeFactor;
/* 523 */     this.ent.ax().a(this.ent.a_.t, this.ent.a_.u, this.ent.a_.v, speed);
/*     */ 
/*     */     
/* 526 */     this.ent.v().b(20, Integer.valueOf(1));
/*     */ 
/*     */     
/* 529 */     aoh aim = this.ent.getAimBlock(-2, true);
/* 530 */     if (aim != null) {
/* 531 */       if (aim.a == aoi.a);
/*     */ 
/*     */     
/*     */     }
/* 535 */     else if (this.ent.E) {
/* 536 */       this.ent.bi();
/*     */     } 
/*     */ 
/*     */     
/* 540 */     if (this.ent.E && this.ent.F && !this.ent.isBreaking())
/* 541 */       this.ent.bi(); 
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/entity/JobBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */