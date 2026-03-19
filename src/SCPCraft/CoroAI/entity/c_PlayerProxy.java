/*      */ package SCPCraft.CoroAI.entity;
/*      */ 
/*      */ import SCPCraft.CoroAI.Behaviors;
/*      */ import SCPCraft.CoroAI.PFQueue;
/*      */ import SCPCraft.CoroAI.PathEntityEx;
/*      */ import SCPCraft.CoroAI.c_IEnhPF;
/*      */ import SCPCraft.c_CoroAIUtil;
/*      */ import SCPCraft.c_EntInterface;
/*      */ import agi;
/*      */ import ahk;
/*      */ import ahl;
/*      */ import amq;
/*      */ import aoh;
/*      */ import aoi;
/*      */ import aoj;
/*      */ import bq;
/*      */ import by;
/*      */ import cd;
/*      */ import di;
/*      */ import ef;
/*      */ import iq;
/*      */ import java.io.ByteArrayOutputStream;
/*      */ import java.io.DataOutputStream;
/*      */ import java.util.LinkedList;
/*      */ import java.util.List;
/*      */ import ke;
/*      */ import lh;
/*      */ import lq;
/*      */ import md;
/*      */ import mi;
/*      */ import net.minecraft.server.MinecraftServer;
/*      */ import ox;
/*      */ import oz;
/*      */ import px;
/*      */ import qw;
/*      */ import qx;
/*      */ import qz;
/*      */ import rh;
/*      */ import ri;
/*      */ import rp;
/*      */ import s;
/*      */ import uk;
/*      */ import up;
/*      */ import ur;
/*      */ import yc;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class c_PlayerProxy
/*      */   extends c_EntInterface
/*      */   implements c_IEnhPF
/*      */ {
/*   57 */   public int entID = -1;
/*      */   
/*   59 */   public aoh aimHit = null;
/*   60 */   public int blockID = amq.aI.cm;
/*      */   
/*      */   public boolean forcejump;
/*      */   
/*      */   public boolean mining;
/*      */   
/*      */   public int mineDelay;
/*      */   
/*      */   public int noMoveTicks;
/*      */   
/*      */   public int curCooldown_Melee;
/*      */   
/*      */   public int curCooldown_Ranged;
/*      */   
/*      */   public int pfTimeout;
/*      */   
/*      */   public PathEntityEx pathToEntity;
/*      */   
/*      */   public lq a_;
/*      */   
/*      */   public boolean b;
/*      */   public int cooldown_Melee;
/*      */   public int cooldown_Ranged;
/*      */   public int slot_Melee;
/*      */   public int slot_Ranged;
/*      */   public float maxReach_Melee;
/*      */   public float maxReach_Ranged;
/*      */   public int itemSearchRange;
/*      */   public List wantedItems;
/*      */   public int curCooldown_FireGun;
/*      */   public int curCooldown_Reload;
/*      */   public int curClipAmount;
/*      */   public int slot_Trade;
/*   93 */   public int tradeItemCount = 3;
/*      */ 
/*      */   
/*      */   public int activeTradeItemSlot;
/*      */   
/*      */   public List uniqueTradeItems;
/*      */   
/*  100 */   public int maxPFRange = 64;
/*      */   
/*      */   public EntityTropicalFishHook fishEntity;
/*      */   
/*  104 */   public float castingStrength = 1.0F;
/*      */   
/*      */   public boolean swingArm;
/*      */   
/*      */   public int swingTick;
/*      */   
/*      */   public boolean isCharging;
/*      */   public boolean grabXP = false;
/*      */   public boolean grabItems = false;
/*      */   public boolean serverMode = false;
/*      */   lq currentTarget;
/*      */   
/*      */   public c_PlayerProxy(yc world) {
/*  117 */     super(world);
/*  118 */     this.swingArm = false;
/*  119 */     this.swingTick = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  129 */     if (this.fakePlayer != null) ((qx)this.fakePlayer).bR = "fakePlayer_" + this.k;
/*      */     
/*  131 */     if (this.fakePlayer != null) {
/*  132 */       this.inventory = this.fakePlayer.bJ;
/*  133 */       sync();
/*      */     } else {
/*  135 */       this.inventory = new qw(null);
/*      */     } 
/*      */     
/*  138 */     this.wantedItems = new LinkedList();
/*  139 */     this.slot_Melee = 0;
/*  140 */     this.slot_Ranged = 1;
/*  141 */     if (this.fakePlayer != null) this.slot_Trade = this.activeTradeItemSlot = this.inventory.a.length - 1; 
/*  142 */     this.cooldown_Melee = 10;
/*  143 */     this.cooldown_Ranged = 40;
/*  144 */     this.maxReach_Melee = 2.5F;
/*  145 */     this.maxReach_Ranged = 12.0F;
/*  146 */     this.itemSearchRange = 5;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void a() {
/*  162 */     super.a();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected ox spawnBabyAnimal(ox entityanimal) {
/*  168 */     return (ox)new oz(this.p);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(qx var1) {
/*  173 */     return false;
/*      */   }
/*      */   
/*      */   protected void a(lq var1, float var2) {
/*  177 */     sync();
/*      */     
/*  179 */     if (isAimedAtTarget(var1)) {
/*  180 */       if (var2 < this.maxReach_Melee && var1.D.e > this.D.b && var1.D.b < this.D.e) {
/*      */         
/*  182 */         if (this.curCooldown_Melee <= 0) {
/*  183 */           aimAtEnt(var1);
/*  184 */           setCurrentSlot(this.slot_Melee);
/*  185 */           leftClickItem(var1);
/*  186 */           this.curCooldown_Melee = this.cooldown_Melee;
/*      */         } 
/*  188 */       } else if (var2 < this.maxReach_Ranged) {
/*      */ 
/*      */ 
/*      */         
/*  192 */         if (this.curCooldown_Ranged <= 0) {
/*  193 */           setCurrentSlot(this.slot_Ranged);
/*  194 */           a(var1, 180.0F, 180.0F);
/*  195 */           sync();
/*  196 */           rightClickItem();
/*  197 */           this.curCooldown_Ranged = this.cooldown_Ranged;
/*      */         } 
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   public void leftClickItem(lq var1) {
/*      */     try {
/*  205 */       if (getCurrentEquippedItem() == null) {
/*  206 */         attackEntityWithNothing(var1);
/*      */       } else {
/*  208 */         this.fakePlayer.q(var1);
/*      */       } 
/*  210 */     } catch (Exception ex) {}
/*      */ 
/*      */     
/*  213 */     bH();
/*      */   }
/*      */   
/*      */   public void attackEntityWithNothing(lq var1) {
/*  217 */     this.fakePlayer.q(var1);
/*      */   }
/*      */   
/*      */   public boolean customRightClick(yc world, ur stack, qx player) {
/*  221 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public void rightClickItem() {
/*  226 */     boolean wasFired = true;
/*      */     
/*  228 */     ur itemToUse = this.inventory.a[this.inventory.c];
/*  229 */     if (itemToUse != null) {
/*  230 */       up ii = itemToUse.b();
/*  231 */       if (ii != null) {
/*      */         
/*  233 */         if (itemToUse.b() instanceof ItemTropicalFishingRod) {
/*  234 */           ((ItemTropicalFishingRod)itemToUse.b()).onItemRightClick2(itemToUse, this.p, this, this.castingStrength);
/*      */         } else {
/*      */           
/*  237 */           if (itemToUse.b() instanceof ItemTropicraftLeafball) {
/*  238 */             this.A -= 2.0F;
/*  239 */             sync();
/*      */           } 
/*      */           
/*  242 */           if (!customRightClick(this.p, itemToUse, (qx)this.fakePlayer)) {
/*      */             
/*      */             try {
/*      */               
/*  246 */               itemToUse.a(this.p, (qx)this.fakePlayer);
/*  247 */               bH();
/*  248 */             } catch (Exception ex) {
/*  249 */               ex.printStackTrace();
/*      */             } 
/*      */           }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  257 */           if (itemToUse.b() instanceof tb || itemToUse.b() instanceof uk) {
/*      */             
/*  259 */             ur itemstack = this.inventory.a[this.inventory.c];
/*      */             
/*  261 */             this.isCharging = true;
/*  262 */             this.fakePlayer.a(itemstack, up.e[itemstack.c].c_(itemstack));
/*      */ 
/*      */             
/*  265 */             int inUseCount = 1;
/*      */             
/*  267 */             uk food = (uk)itemToUse.b();
/*      */ 
/*      */             
/*  270 */             this.fakePlayer.cc().a(food);
/*      */             
/*  272 */             c_CoroAIUtil.setPrivateValueBoth(qx.class, this.fakePlayer, "f", "itemInUseCount", Integer.valueOf(inUseCount));
/*      */             
/*  274 */             this.isCharging = false;
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/*  279 */         setPrjOwner(1);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void switchItem(int id) {
/*  293 */     if (up.z.cj == id) {
/*  294 */       this.curCooldown_Melee = 0;
/*  295 */     } else if (up.k.cj == id) {
/*      */     
/*      */     } 
/*      */     
/*  299 */     setCurrentItem(id);
/*      */   }
/*      */   
/*      */   public boolean eat() {
/*  303 */     for (int j = 0; j < this.inventory.a.length; j++) {
/*      */       
/*  305 */       if (this.inventory.a[j] != null && isFood(this.inventory.a[j])) {
/*      */ 
/*      */ 
/*      */         
/*  309 */         setCurrentSlot(j);
/*  310 */         rightClickItem();
/*      */         
/*  312 */         return true;
/*      */       } 
/*      */     } 
/*  315 */     return false;
/*      */   }
/*      */   
/*      */   public boolean isFood(ur itemstack) {
/*  319 */     if (itemstack != null) {
/*  320 */       up item = itemstack.b();
/*  321 */       if (item instanceof uk) {
/*  322 */         return true;
/*      */       }
/*      */     } 
/*  325 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public void dropCurrentItem() {
/*  330 */     dropPlayerItemWithRandomChoice(this.inventory.a(this.inventory.c, 1), false);
/*      */   }
/*      */ 
/*      */   
/*      */   public void dropPlayerItem(ur itemstack) {
/*  335 */     dropPlayerItemWithRandomChoice(itemstack, false);
/*      */   }
/*      */ 
/*      */   
/*      */   public void dropPlayerItemWithRandomChoice(ur itemstack, boolean flag) {
/*  340 */     if (itemstack == null) {
/*      */       return;
/*      */     }
/*      */     
/*  344 */     px entityitem = new px(this.p, this.t, this.u - 0.30000001192092896D + e(), this.v, itemstack);
/*  345 */     entityitem.b = 40;
/*  346 */     float f = 0.1F;
/*  347 */     if (flag) {
/*      */       
/*  349 */       float f2 = this.aa.nextFloat() * 0.5F;
/*  350 */       float f4 = this.aa.nextFloat() * 3.141593F * 2.0F;
/*  351 */       entityitem.w = (-ke.a(f4) * f2);
/*  352 */       entityitem.y = (ke.b(f4) * f2);
/*  353 */       entityitem.x = 0.20000000298023224D;
/*      */     } else {
/*      */       
/*  356 */       float f1 = 0.3F;
/*  357 */       entityitem.w = (-ke.a(this.z / 180.0F * 3.141593F) * ke.b(this.A / 180.0F * 3.141593F) * f1);
/*  358 */       entityitem.y = (ke.b(this.z / 180.0F * 3.141593F) * ke.b(this.A / 180.0F * 3.141593F) * f1);
/*  359 */       entityitem.x = (-ke.a(this.A / 180.0F * 3.141593F) * f1 + 0.1F);
/*  360 */       f1 = 0.02F;
/*  361 */       float f3 = this.aa.nextFloat() * 3.141593F * 2.0F;
/*  362 */       f1 *= this.aa.nextFloat();
/*  363 */       entityitem.w += Math.cos(f3) * f1;
/*  364 */       entityitem.x += ((this.aa.nextFloat() - this.aa.nextFloat()) * 0.1F);
/*  365 */       entityitem.y += Math.sin(f3) * f1;
/*      */     } 
/*  367 */     this.p.d((lq)entityitem);
/*      */   }
/*      */   
/*      */   public void aimAtEnt(lq ent) {
/*  371 */     a(ent, 30.0F, 30.0F);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isAimedAtTarget(lq ent) {
/*  376 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public void faceCoord(int x, int y, int z, float f, float f1) {
/*  381 */     double d = x - this.t;
/*  382 */     double d2 = z - this.v;
/*      */     
/*  384 */     double d1 = y - this.u + e();
/*      */     
/*  386 */     double d3 = ke.a(d * d + d2 * d2);
/*  387 */     float f2 = (float)(Math.atan2(d2, d) * 180.0D / 3.1415927410125732D) - 90.0F;
/*  388 */     float f3 = (float)-(Math.atan2(d1, d3) * 180.0D / 3.1415927410125732D);
/*  389 */     this.A = -updateRotation(this.A, f3, f1);
/*  390 */     this.z = updateRotation(this.z, f2, f);
/*      */   }
/*      */ 
/*      */   
/*      */   private float updateRotation(float f, float f1, float f2) {
/*      */     float f3;
/*  396 */     for (f3 = f1 - f; f3 < -180.0F; f3 += 360.0F);
/*  397 */     for (; f3 >= 180.0F; f3 -= 360.0F);
/*  398 */     if (f3 > f2)
/*      */     {
/*  400 */       f3 = f2;
/*      */     }
/*  402 */     if (f3 < -f2)
/*      */     {
/*  404 */       f3 = -f2;
/*      */     }
/*  406 */     return f + f3;
/*      */   }
/*      */ 
/*      */   
/*      */   public void bH() {
/*  411 */     this.swingArm = true;
/*  412 */     if (!this.p.I) {
/*  413 */       this.ag.b(21, Integer.valueOf(1));
/*      */     }
/*  415 */     this.fakePlayer.j(0.14F);
/*      */   }
/*      */   
/*      */   public boolean canClimb() {
/*  419 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   protected lq j() {
/*  424 */     qx entityplayer = this.p.a((lq)this, 16.0D);
/*  425 */     if (entityplayer != null && n((lq)entityplayer))
/*      */     {
/*      */       
/*  428 */       return null;
/*      */     }
/*      */     
/*  431 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void getPathOrWalkableBlock(lq entity, float f) {
/*  437 */     ahl pathentity = null;
/*  438 */     if (pathentity == null && f > 12.0F) {
/*      */       
/*  440 */       int i = ke.c(entity.t) - 2;
/*  441 */       int j = ke.c(entity.v) - 2;
/*  442 */       int k = ke.c(entity.D.b);
/*  443 */       for (int l = 0; l <= 4; l++) {
/*      */         
/*  445 */         for (int i1 = 0; i1 <= 4; i1++) {
/*      */           
/*  447 */           if ((l < 1 || i1 < 1 || l > 3 || i1 > 3) && this.p.t(i + l, k - 1, j + i1) && !this.p.t(i + l, k, j + i1) && !this.p.t(i + l, k + 1, j + i1)) {
/*      */             
/*  449 */             b(((i + l) + 0.5F), k, ((j + i1) + 0.5F), this.z, this.A);
/*      */ 
/*      */ 
/*      */             
/*      */             return;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } else {
/*  458 */       a(pathentity);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void updateSwing() {
/*  463 */     if (this.swingArm) {
/*  464 */       this.swingTick++;
/*      */ 
/*      */       
/*  467 */       if (this.swingTick == 8) {
/*  468 */         this.swingTick = 0;
/*  469 */         this.swingArm = false;
/*      */       } 
/*      */     } else {
/*  472 */       this.swingTick = 0;
/*      */     } 
/*      */     
/*  475 */     this.aQ = this.swingTick / 8.0F;
/*      */   }
/*      */ 
/*      */   
/*      */   public void c() {
/*  480 */     if (this.fakePlayer != null) {
/*  481 */       this.inventory.j();
/*      */     }
/*      */     
/*  484 */     updateSwing();
/*      */     
/*  486 */     if (this.p.I || this.fakePlayer == null) {
/*  487 */       super.c();
/*      */       
/*      */       return;
/*      */     } 
/*  491 */     this.aimHit = a(1.0D, 1.0F);
/*      */     
/*  493 */     if (!I()) {
/*  494 */       this.forcejump = false;
/*  495 */       this.mineDelay--;
/*      */       
/*  497 */       if (this.mineDelay < 1 && this.noMoveTicks > 10) {
/*  498 */         this.mineDelay = 3;
/*  499 */         this.mining = true;
/*  500 */         if (this.a_ instanceof md) {
/*  501 */           ur itemToUse = this.inventory.a[0];
/*      */ 
/*      */           
/*  504 */           if (this.aimHit == null || this.aimHit.a != aoi.a || 
/*  505 */             this.p.a(this.aimHit.b, this.aimHit.c, this.aimHit.d) == 0 || this.p.a(this.aimHit.b, this.aimHit.c, this.aimHit.d) != amq.aI.cm);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  526 */     else if (this.F) {
/*      */     
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  538 */     if (this.curCooldown_Melee > 0) this.curCooldown_Melee--; 
/*  539 */     if (this.curCooldown_Ranged > 0) this.curCooldown_Ranged--; 
/*  540 */     if (this.curCooldown_FireGun > 0) this.curCooldown_FireGun--; 
/*  541 */     if (this.curCooldown_Reload > 0) this.curCooldown_Reload--;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  551 */     if (this.fakePlayer.bK() != null) {
/*      */       
/*  553 */       ur itemstack = this.inventory.a[this.inventory.c];
/*  554 */       if (itemstack != this.fakePlayer.bK()) {
/*      */         
/*  556 */         this.fakePlayer.bP();
/*      */       
/*      */       }
/*      */       else {
/*      */ 
/*      */         
/*  562 */         if (this.fakePlayer.bL() <= 25 && this.fakePlayer.bL() % 4 == 0)
/*      */         {
/*  564 */           updateItemUse(itemstack, 5);
/*      */         }
/*  566 */         c_CoroAIUtil.setPrivateValueBoth(qx.class, this.fakePlayer, "f", "itemInUseCount", Integer.valueOf(this.fakePlayer.bL() - 1));
/*  567 */         if (this.fakePlayer.bL() == 0 && !this.p.I)
/*      */         {
/*  569 */           onItemUseFinish();
/*      */         }
/*      */       } 
/*      */     } 
/*  573 */     if (this.fakePlayer.bS > 0) {
/*  574 */       this.fakePlayer.bS--;
/*      */     }
/*  576 */     this.fakePlayer.cc().a((qx)this.fakePlayer);
/*      */     
/*  578 */     int healthDiff = getPlHealth() - this.aR;
/*  579 */     if (healthDiff > 0)
/*      */     {
/*  581 */       this.fakePlayer.j(0.18F * healthDiff);
/*      */     }
/*      */     
/*  584 */     this.aR = getPlHealth();
/*      */ 
/*      */     
/*  587 */     if (this.bD > 0.0F) {
/*  588 */       float werwrwer = this.bD;
/*  589 */       werwrwer = this.bD;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  594 */     super.c();
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/*  599 */       if (this.aR > 0) {
/*  600 */         List<lq> var3 = this.p.b((lq)this, this.D.b(2.0D, 1.0D, 2.0D));
/*      */         
/*  602 */         if (var3 != null) {
/*  603 */           for (int var4 = 0; var4 < var3.size(); var4++) {
/*  604 */             lq var5 = var3.get(var4);
/*      */             
/*  606 */             if (!var5.L) {
/*  607 */               if (var5 instanceof mi && isEnemy(var5) && this instanceof c_EnhAI && !(var5 instanceof c_EnhAI)) Behaviors.enhanceMonsterAIClose((mi)this, (mi)var5); 
/*  608 */               if ((this.grabXP || !(var5 instanceof lz)) && (this.grabItems || !(var5 instanceof px))) {
/*  609 */                 var5.c_((qx)this.fakePlayer);
/*      */               }
/*      */             }
/*      */           
/*      */           } 
/*      */         }
/*      */       } 
/*  616 */     } catch (Exception ex) {
/*      */       
/*  618 */       ex.printStackTrace();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isEnemy(lq entity1) {
/*  625 */     if (entity1 instanceof md && !(entity1 instanceof qc) && !(entity1 instanceof qd) && !(entity1 instanceof qx) && entity1 != this && (entity1 instanceof ox || entity1 instanceof qj) && !(entity1 instanceof c_EnhAI)) {
/*  626 */       return true;
/*      */     }
/*  628 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void useInvItem(ur itemstack) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public float e() {
/*  638 */     return 1.62F;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void resetHeight() {
/*  643 */     this.M = 1.62F;
/*      */   }
/*      */   
/*      */   public void setPrjOwner(int offset) {
/*  647 */     lq ent = this.p.e.get(this.p.e.size() - offset);
/*  648 */     if (ent instanceof ri) {
/*  649 */       ((ri)ent).u += 1.5D;
/*  650 */       setThrower((ri)ent, (md)this);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  663 */     else if (ent instanceof rh) {
/*      */       
/*      */       try {
/*  666 */         c_CoroAIUtil.setPrivateValue(rh.class, ent, "i have no idea", this);
/*  667 */       } catch (Exception ex) {
/*      */         try {
/*  669 */           c_CoroAIUtil.setPrivateValue(rh.class, ent, "shootingEntity", this);
/*  670 */         } catch (Exception ex2) {}
/*      */       }
/*      */     
/*      */     }
/*  674 */     else if (ent instanceof qz) {
/*  675 */       ((qz)ent).u++;
/*  676 */       ((qz)ent).c = (lq)this;
/*      */     }
/*  678 */     else if (ent instanceof EntityTropicalFishHook) {
/*  679 */       ((EntityTropicalFishHook)ent).angler = (md)this;
/*      */     } else {
/*  681 */       c_CoroAIUtil.setPrjOwnerHook(this, ent);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void sync() {
/*  688 */     if (this.fakePlayer == null)
/*  689 */       return;  this.fakePlayer.t = this.t;
/*  690 */     this.fakePlayer.u = this.u;
/*  691 */     this.fakePlayer.v = this.v;
/*  692 */     this.fakePlayer.q = this.q;
/*  693 */     this.fakePlayer.r = this.r;
/*  694 */     this.fakePlayer.s = this.s;
/*  695 */     this.fakePlayer.A = this.A;
/*  696 */     this.fakePlayer.z = this.z;
/*  697 */     this.fakePlayer.C = this.C;
/*  698 */     this.fakePlayer.B = this.B;
/*      */     
/*  700 */     setPlHealth(this.aR);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(lh par1DamageSource, int par2) {
/*  705 */     boolean blah = super.a(par1DamageSource, par2);
/*  706 */     sync();
/*  707 */     return blah;
/*      */   }
/*      */   
/*      */   public int getAimID(int yOffset) {
/*  711 */     aoh aim = getAimBlock(yOffset);
/*  712 */     if (aim != null && aim.a == aoi.a) {
/*  713 */       return this.p.a(aim.b, aim.c, aim.d);
/*      */     }
/*  715 */     return 0;
/*      */   }
/*      */   
/*      */   public boolean isBlockWater(int id) {
/*  719 */     return (amq.p[id] != null && (amq.p[id]).cB == agi.h);
/*      */   }
/*      */   
/*      */   public boolean getAimIsWater(int yOffset) {
/*  723 */     aoh aim = getAimBlock(yOffset);
/*  724 */     if (aim != null && aim.a == aoi.a && 
/*  725 */       amq.p[this.p.a(aim.b, aim.c, aim.d)] != null && (amq.p[this.p.a(aim.b, aim.c, aim.d)]).cB == agi.h) {
/*  726 */       return true;
/*      */     }
/*      */     
/*  729 */     return false;
/*      */   }
/*      */   
/*      */   public aoh getAimBlock(int yOffset) {
/*  733 */     return getAimBlock(yOffset, false);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public aoh getAimBlock(int yOffset, boolean noYaw) {
/*      */     try {
/*  740 */       c_PlayerProxy c_PlayerProxy1 = this;
/*  741 */       float f = 1.0F;
/*  742 */       float f1 = ((md)c_PlayerProxy1).C + (((md)c_PlayerProxy1).A - ((md)c_PlayerProxy1).C) * f;
/*  743 */       float f3 = ((md)c_PlayerProxy1).B + (((md)c_PlayerProxy1).z - ((md)c_PlayerProxy1).B) * f;
/*  744 */       if (noYaw) f3 = 1.0E-5F;
/*      */ 
/*      */       
/*  747 */       double d = ((md)c_PlayerProxy1).q + (((md)c_PlayerProxy1).t - ((md)c_PlayerProxy1).q) * f;
/*  748 */       double d1 = ((md)c_PlayerProxy1).r + (((md)c_PlayerProxy1).u - ((md)c_PlayerProxy1).r) * f + 1.62D - ((md)c_PlayerProxy1).M + yOffset;
/*  749 */       double d2 = ((md)c_PlayerProxy1).s + (((md)c_PlayerProxy1).v - ((md)c_PlayerProxy1).s) * f;
/*  750 */       aoj vec3d = aoj.a(d, d1, d2);
/*  751 */       float f4 = ke.b(-f3 * 0.01745329F - 3.141593F);
/*  752 */       float f5 = ke.a(-f3 * 0.01745329F - 3.141593F);
/*  753 */       float f6 = -ke.b(-f1 * 0.01745329F - 0.7853982F);
/*  754 */       float f7 = ke.a(-f1 * 0.01745329F - 0.7853982F);
/*  755 */       float f8 = f5 * f6;
/*  756 */       float f9 = f7;
/*  757 */       float f10 = f4 * f6;
/*      */       
/*  759 */       double d3 = 2.0D;
/*  760 */       aoj vec3d1 = vec3d.c(f8 * d3, f9 * d3, f10 * d3);
/*  761 */       aoh movingobjectposition = ((md)c_PlayerProxy1).p.a(vec3d, vec3d1, true);
/*      */       
/*  763 */       int id = -1;
/*      */       
/*  765 */       if (movingobjectposition == null) {
/*  766 */         return null;
/*      */       }
/*      */       
/*  769 */       if (movingobjectposition.a == aoi.a);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  774 */       return movingobjectposition;
/*  775 */     } catch (Exception ex) {
/*  776 */       ex.printStackTrace();
/*  777 */       return null;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void tryPlace(mi entityliving) {
/*  783 */     float f = 2.0F;
/*  784 */     float f1 = entityliving.C + (entityliving.A - entityliving.C) * f;
/*  785 */     float f2 = entityliving.C + (entityliving.A - entityliving.C) * f;
/*  786 */     f1 = 0.0F;
/*  787 */     float f3 = entityliving.B + (entityliving.z - entityliving.B) * f;
/*  788 */     int i = (int)Math.floor((f3 / 90.0F) + 0.5D);
/*  789 */     f3 = i * 90.0F;
/*  790 */     double d = entityliving.q + (entityliving.t - entityliving.q) * f;
/*  791 */     double d1 = entityliving.r + (entityliving.u - entityliving.r) * f + 1.62D - entityliving.M;
/*  792 */     double d2 = entityliving.s + (entityliving.v - entityliving.s) * f;
/*  793 */     aoj vec3d = aoj.a(d, d1, d2);
/*  794 */     float f4 = ke.b(-f3 * 0.01745329F - 3.141593F);
/*  795 */     float f5 = ke.a(-f3 * 0.01745329F - 3.141593F);
/*  796 */     float f6 = -ke.b(-f1 * 0.01745329F - 0.7853982F);
/*  797 */     float f7 = ke.a(-f1 * 0.01745329F - 0.7853982F);
/*  798 */     float f8 = f5 * f6;
/*  799 */     float f9 = f7;
/*  800 */     float f10 = f4 * f6;
/*      */     
/*  802 */     double d3 = 1.0D;
/*  803 */     double d4 = 1.8D;
/*  804 */     double d5 = 0.05D;
/*  805 */     aoj vec3d1 = vec3d.c(f8 * d3, f9 * d3, f10 * d3);
/*  806 */     aoh movingobjectposition = entityliving.p.a(vec3d, vec3d1, true);
/*      */     
/*  808 */     if (movingobjectposition == null) {
/*      */       return;
/*      */     }
/*      */     
/*  812 */     boolean flag = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  827 */     if (movingobjectposition.a == aoi.a || flag) {
/*  828 */       int i1, j1, k1, i2 = (f2 >= -20.0F) ? 0 : 1;
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  833 */       if (flag) {
/*  834 */         i1 = (int)entityliving.t;
/*  835 */         j1 = (int)entityliving.v - 1;
/*  836 */         k1 = (int)entityliving.v;
/*      */       
/*      */       }
/*      */       else {
/*      */         
/*  841 */         i1 = movingobjectposition.b;
/*  842 */         j1 = movingobjectposition.c + i2;
/*  843 */         k1 = movingobjectposition.d;
/*      */       } 
/*      */       
/*  846 */       int l1 = entityliving.p.a(i1, j1, k1);
/*      */       
/*  848 */       if (l1 == 0 && (i2 == 1 || flag)) {
/*  849 */         j1--;
/*  850 */         l1 = entityliving.p.a(i1, j1, k1);
/*      */         
/*  852 */         if (l1 == 0 && i2 == 1) {
/*  853 */           j1--;
/*  854 */           l1 = entityliving.p.a(i1, j1, k1);
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  864 */       amq block = amq.p[l1];
/*      */ 
/*      */       
/*  867 */       if (block != null && 
/*  868 */         entityliving instanceof c_PlayerProxy) {
/*  869 */         ((c_PlayerProxy)entityliving).swingArm = true;
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean onItemUse(ur var1, md var2, yc var3, int var4, int var5, int var6, int var7) {
/*  880 */     int var8 = var3.a(var4, var5, var6);
/*  881 */     if (var8 == amq.aV.cm) {
/*  882 */       var7 = 0;
/*  883 */     } else if (var8 != amq.bx.cm) {
/*  884 */       if (var7 == 0) {
/*  885 */         var5--;
/*      */       }
/*      */       
/*  888 */       if (var7 == 1) {
/*  889 */         var5++;
/*      */       }
/*      */       
/*  892 */       if (var7 == 2) {
/*  893 */         var6--;
/*      */       }
/*      */       
/*  896 */       if (var7 == 3) {
/*  897 */         var6++;
/*      */       }
/*      */       
/*  900 */       if (var7 == 4) {
/*  901 */         var4--;
/*      */       }
/*      */       
/*  904 */       if (var7 == 5) {
/*  905 */         var4++;
/*      */       }
/*      */     } 
/*      */     
/*  909 */     int id = var3.a(var4, var5, var6);
/*      */     
/*  911 */     if (var1.a == 0) {
/*  912 */       return false;
/*      */     }
/*  914 */     var3.getClass();
/*  915 */     if (var5 == 127 && (amq.p[this.blockID]).cB.a())
/*  916 */       return false; 
/*  917 */     if (id != amq.aI.cm) {
/*  918 */       amq var9 = amq.p[this.blockID];
/*  919 */       if (var3.d(var4, var5, var6, this.blockID, 5)) {
/*  920 */         if (var3.a(var4, var5, var6) == this.blockID)
/*      */         {
/*  922 */           amq.p[this.blockID].a(var3, var4, var5, var6, var2);
/*      */         }
/*      */ 
/*      */         
/*  926 */         var1.a--;
/*      */       } 
/*      */       
/*  929 */       return true;
/*      */     } 
/*  931 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected String aY() {
/*  937 */     return "mob.zombie";
/*      */   }
/*      */   
/*      */   protected String aZ() {
/*  941 */     return "mob.zombiehurt";
/*      */   }
/*      */   
/*      */   protected String ba() {
/*  945 */     return "mob.zombiedeath";
/*      */   }
/*      */   
/*      */   protected int bb() {
/*  949 */     return 0;
/*      */   }
/*      */   
/*      */   public ur bD() {
/*  953 */     return (getCurrentEquippedItem() != null) ? getCurrentEquippedItem() : null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public ur getCurrentEquippedItem() {
/*  959 */     if (this.inventory == null) return null; 
/*  960 */     return this.inventory.a[this.inventory.c];
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCurrentItem(int id) {
/*  965 */     int k = -1;
/*  966 */     k = getInventorySlotContainItem(id);
/*      */     
/*  968 */     if (k >= 0)
/*      */     {
/*  970 */       this.inventory.c = k;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  979 */     syncClientItems();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void syncClientItems() {
/*  986 */     if (!this.p.I) {
/*  987 */       ByteArrayOutputStream bos = new ByteArrayOutputStream(140);
/*  988 */       DataOutputStream dos = new DataOutputStream(bos);
/*      */       
/*  990 */       ur is = getCurrentEquippedItem();
/*      */       
/*      */       try {
/*  993 */         dos.writeInt(this.k);
/*  994 */         ef.a(is, dos);
/*  995 */       } catch (Exception ex) {
/*  996 */         ex.printStackTrace();
/*      */       } 
/*  998 */       di pkt = new di();
/*  999 */       pkt.a = "CoroAI_Inv";
/* 1000 */       pkt.c = bos.toByteArray();
/* 1001 */       pkt.b = bos.size();
/*      */       
/* 1003 */       MinecraftServer.D().ad().a(this.t, this.u, this.v, 64.0D, this.fakePlayer.aq, (ef)pkt);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int getInventorySlotContainItem(int i) {
/* 1010 */     for (int j = 0; j < this.inventory.a.length; j++) {
/*      */       
/* 1012 */       if (this.inventory.a[j] != null && (this.inventory.a[j]).c == i)
/*      */       {
/* 1014 */         return j;
/*      */       }
/*      */     } 
/*      */     
/* 1018 */     return -1;
/*      */   }
/*      */   
/*      */   public rp getFoodStats() {
/* 1022 */     return this.fakePlayer.cc();
/*      */   }
/*      */   
/*      */   public int getFoodLevel() {
/* 1026 */     return getFoodStats().a();
/*      */   }
/*      */   
/*      */   public void setCurrentSlot(int slot) {
/* 1030 */     if (this.inventory == null)
/* 1031 */       return;  this.inventory.c = slot;
/* 1032 */     syncClientItems();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void walkTo(lq var1, int x, int y, int z, float var2, int timeout) {
/* 1054 */     System.out.println("this should never happen");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void i() {
/* 1060 */     boolean flag = false;
/* 1061 */     int i = -1;
/* 1062 */     int j = -1;
/* 1063 */     int k = -1;
/* 1064 */     float f = -99999.0F;
/* 1065 */     for (int l = 0; l < 10; l++) {
/*      */       
/* 1067 */       int i1 = ke.c(this.t + this.aa.nextInt(13) - 6.0D);
/* 1068 */       int j1 = ke.c(this.u + this.aa.nextInt(7) - 3.0D);
/* 1069 */       int k1 = ke.c(this.v + this.aa.nextInt(13) - 6.0D);
/* 1070 */       float f1 = a(i1, j1, k1);
/* 1071 */       if (f1 > f) {
/*      */         
/* 1073 */         f = f1;
/* 1074 */         i = i1;
/* 1075 */         j = j1;
/* 1076 */         k = k1;
/* 1077 */         flag = true;
/*      */       } 
/*      */     } 
/*      */     
/* 1081 */     if (flag)
/*      */     {
/* 1083 */       walkTo((lq)this, i, j, k, this.maxPFRange, 600);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void bn() {
/* 1092 */     this.c = 0;
/* 1093 */     if (this.c > 0)
/*      */     {
/* 1095 */       this.c--;
/*      */     }
/* 1097 */     this.b = h();
/* 1098 */     float f = 16.0F;
/* 1099 */     if (this.a_ == null) {
/*      */       
/* 1101 */       this.a_ = j();
/* 1102 */       if (this.a_ != null)
/*      */       {
/* 1104 */         PFQueue.getPath((lq)this, this.a_, f);
/*      */       
/*      */       }
/*      */     
/*      */     }
/* 1109 */     else if (!this.a_.S()) {
/*      */       
/* 1111 */       this.a_ = null;
/*      */     } else {
/*      */       
/* 1114 */       float f1 = this.a_.d((lq)this);
/* 1115 */       if (n(this.a_))
/*      */       {
/* 1117 */         a(this.a_, f1);
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1123 */     if (!this.b && this.a_ != null && this.pathToEntity == null)
/*      */     {
/* 1125 */       PFQueue.getPath((lq)this, this.a_, f);
/*      */     }
/*      */ 
/*      */     
/* 1129 */     int i = ke.c(this.D.b + 0.5D);
/* 1130 */     boolean flag = H();
/* 1131 */     boolean flag1 = J();
/* 1132 */     this.A = 0.0F;
/* 1133 */     if (this.pathToEntity == null) {
/*      */ 
/*      */ 
/*      */       
/* 1137 */       livingAIUpdate();
/* 1138 */       this.pathToEntity = null;
/*      */       return;
/*      */     } 
/* 1141 */     aoj vec3d = this.pathToEntity.getPosition((lq)this);
/* 1142 */     for (double d = (this.N * 1.2F); vec3d != null && vec3d.d(this.t, vec3d.d, this.v) < d * d; ) {
/*      */       
/* 1144 */       this.pathToEntity.incrementPathIndex();
/* 1145 */       if (this.pathToEntity.isFinished()) {
/*      */         
/* 1147 */         vec3d = null;
/* 1148 */         this.pathToEntity = null;
/*      */         continue;
/*      */       } 
/* 1151 */       vec3d = this.pathToEntity.getPosition((lq)this);
/*      */     } 
/*      */ 
/*      */     
/* 1155 */     this.bF = false;
/* 1156 */     if (vec3d != null) {
/*      */       
/* 1158 */       double d1 = vec3d.c - this.t;
/* 1159 */       double d2 = vec3d.e - this.v;
/* 1160 */       double d3 = vec3d.d - i;
/* 1161 */       float f2 = (float)(Math.atan2(d2, d1) * 180.0D / 3.1415927410125732D) - 90.0F;
/* 1162 */       float f3 = f2 - this.z;
/* 1163 */       this.bD = this.bH;
/* 1164 */       for (; f3 < -180.0F; f3 += 360.0F);
/* 1165 */       for (; f3 >= 180.0F; f3 -= 360.0F);
/* 1166 */       if (f3 > 30.0F)
/*      */       {
/* 1168 */         f3 = 30.0F;
/*      */       }
/* 1170 */       if (f3 < -30.0F)
/*      */       {
/* 1172 */         f3 = -30.0F;
/*      */       }
/* 1174 */       this.z += f3;
/* 1175 */       if (this.b && this.a_ != null) {
/*      */         
/* 1177 */         double d4 = this.a_.t - this.t;
/* 1178 */         double d5 = this.a_.v - this.v;
/* 1179 */         float f5 = this.z;
/* 1180 */         this.z = (float)(Math.atan2(d5, d4) * 180.0D / 3.1415927410125732D) - 90.0F;
/* 1181 */         float f4 = (f5 - this.z + 90.0F) * 3.141593F / 180.0F;
/* 1182 */         this.bC = -ke.a(f4) * this.bD * 1.0F;
/* 1183 */         this.bD = ke.b(f4) * this.bD * 1.0F;
/*      */       } 
/* 1185 */       if (d3 > 0.0D)
/*      */       {
/* 1187 */         this.bF = true;
/*      */       }
/* 1189 */       if (shouldFaceTarget())
/*      */       {
/* 1191 */         a(this.a_, 60.0F, 60.0F);
/*      */       }
/*      */     }
/* 1194 */     else if (shouldFaceTarget()) {
/* 1195 */       this.bD = this.bH;
/* 1196 */       a(this.a_, 60.0F, 60.0F);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1202 */     if (this.F && k())
/*      */     {
/* 1204 */       this.bF = true;
/*      */     }
/* 1206 */     if (this.aa.nextFloat() < 0.8F && (flag || flag1))
/*      */     {
/* 1208 */       this.bF = true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean shouldFaceTarget() {
/* 1218 */     if (this.F);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1224 */     if (l() != null) {
/*      */       
/* 1226 */       if (l() != null && (isSolidPath(l()) || getPath() == null)) {
/* 1227 */         this.bD = this.bH;
/* 1228 */         a(l(), 30.0F, 30.0F);
/*      */         
/* 1230 */         return true;
/*      */       } 
/*      */       
/* 1233 */       return false;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1245 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isSolidPath(lq var1) {
/* 1253 */     return (n(var1) && d(var1) < 3.0F && Math.abs(this.u - this.M - var1.u - var1.M) <= 2.5D);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void y() {
/* 1263 */     if (!this.p.I) {
/*      */ 
/*      */       
/* 1266 */       if (this.fakePlayer == null) {
/* 1267 */         this.fakePlayer = newFakePlayer(this.p);
/*      */       }
/*      */       
/* 1270 */       if (this.fakePlayer != null && this.fakePlayer.a == null) {
/*      */         
/*      */         try {
/*      */           
/* 1274 */           if (this.p.h.size() > 0)
/*      */           {
/* 1276 */             if (this.p.h.get(0) instanceof iq) {
/*      */               
/* 1278 */               this.fakePlayer.a = ((iq)this.p.h.get(0)).a;
/* 1279 */               this.fakePlayer.aq = ((iq)this.p.h.get(0)).aq;
/*      */             } 
/*      */           }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1289 */           ((qx)this.fakePlayer).bR = "fakePlayer_" + this.k;
/*      */ 
/*      */           
/* 1292 */           this.inventory = this.fakePlayer.bJ;
/* 1293 */           sync();
/*      */           
/* 1295 */           c_CoroAIUtil.playerToAILookup.put(this.fakePlayer.bR, this);
/*      */         
/*      */         }
/* 1298 */         catch (Exception ex) {
/* 1299 */           ex.printStackTrace();
/*      */           
/*      */           return;
/*      */         } 
/*      */       }
/*      */     } 
/* 1305 */     if (this.fakePlayer != null) {
/* 1306 */       if (this.fakePlayer.L) {
/* 1307 */         this.aR = 0;
/*      */       }
/* 1309 */       else if (getPlHealth() > 0) {
/* 1310 */         this.aY = 0;
/* 1311 */         sync();
/*      */       } 
/*      */     }
/*      */     
/* 1315 */     super.y();
/*      */   }
/*      */   
/*      */   public int aU() {
/* 1319 */     return this.aR;
/*      */   }
/*      */   
/*      */   public void setHealth(int val) {
/* 1323 */     this.aR = val;
/* 1324 */     if (this.fakePlayer != null) setPlHealth(val); 
/*      */   }
/*      */   
/*      */   public int getExp() {
/* 1328 */     return this.bd;
/*      */   }
/*      */   
/*      */   public void setExp(int val) {
/* 1332 */     this.bd = val;
/*      */   }
/*      */ 
/*      */   
/*      */   public void x() {
/* 1337 */     if (this.fakePlayer != null) this.fakePlayer.x(); 
/* 1338 */     super.x();
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(lh var1) {
/* 1343 */     super.a(var1);
/*      */     
/* 1345 */     if (!this.p.I && this.fakePlayer != null && this.inventory != null) {
/* 1346 */       this.inventory.a[0] = null;
/* 1347 */       this.inventory.a[1] = null;
/*      */ 
/*      */       
/* 1350 */       for (int i = 0; i < this.tradeItemCount; i++) {
/* 1351 */         if (this.slot_Trade - i != this.activeTradeItemSlot);
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1357 */       this.inventory.l();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void livingAIUpdate() {
/* 1363 */     this.bB++;
/* 1364 */     qx entityplayer = this.p.a((lq)this, -1.0D);
/* 1365 */     bk();
/* 1366 */     this.bC = 0.0F;
/* 1367 */     this.bD = 0.0F;
/*      */     
/* 1369 */     boolean flag = H();
/* 1370 */     boolean flag1 = J();
/* 1371 */     if (flag || flag1)
/*      */     {
/* 1373 */       this.bF = (this.aa.nextFloat() < 0.8F);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 1378 */     float f = 8.0F;
/* 1379 */     if (this.aa.nextFloat() < 0.02F)
/*      */     {
/*      */       
/* 1382 */       if (this.fishEntity != null) {
/* 1383 */         this.currentTarget = this.fishEntity;
/* 1384 */         c_CoroAIUtil.setPrivateValueBoth(md.class, this, "bF", "currentTarget", this.currentTarget);
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1396 */     if (this.currentTarget != null) {
/*      */       
/* 1398 */       a(this.currentTarget, 10.0F, bp());
/* 1399 */       if (this.bI-- <= 0 || this.currentTarget.L)
/*      */       {
/* 1401 */         this.currentTarget = null;
/*      */       }
/*      */     } else {
/*      */       
/* 1405 */       if (this.aa.nextFloat() < 0.05F)
/*      */       {
/* 1407 */         this.bE = (this.aa.nextFloat() - 0.5F) * 20.0F;
/*      */       }
/* 1409 */       this.z += this.bE;
/* 1410 */       this.A = this.bG;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean bs() {
/* 1416 */     int i = ke.c(this.t);
/* 1417 */     int j = ke.c(this.D.b);
/* 1418 */     int k = ke.c(this.v);
/* 1419 */     return super.bs();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean k() {
/* 1424 */     return (this.pathToEntity != null && !this.pathToEntity.isFinished());
/*      */   }
/*      */ 
/*      */   
/*      */   public PathEntityEx getPath() {
/* 1429 */     return this.pathToEntity;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPathToEntity(PathEntityEx pathentity) {
/* 1434 */     this.pathToEntity = pathentity;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPathExToEntity(PathEntityEx pathentity) {
/* 1439 */     this.pathToEntity = pathentity;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ahl getEndPoint(lq var1) {
/* 1480 */     ahk[] points = new ahk[1];
/* 1481 */     points[0] = new ahk((int)(var1.t - 0.5D), (int)(var1.u + 0.0D), (int)(var1.v - 0.5D));
/* 1482 */     return new ahl(points);
/*      */   }
/*      */   
/*      */   public ahl getEndPoint(int x, int y, int z) {
/* 1486 */     ahk[] points = new ahk[1];
/* 1487 */     points[0] = new ahk(x, y, z);
/* 1488 */     return new ahl(points);
/*      */   }
/*      */ 
/*      */   
/*      */   public lq l() {
/* 1493 */     return this.a_;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setEntityToAttack(lq entity) {
/* 1498 */     this.a_ = entity;
/*      */   }
/*      */ 
/*      */   
/*      */   public float bB() {
/* 1503 */     float f = super.bB();
/* 1504 */     if (this.c > 0)
/*      */     {
/* 1506 */       f *= 2.0F;
/*      */     }
/* 1508 */     return f;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean canCoordBeSeen(int x, int y, int z) {
/* 1513 */     return (this.p.a(aoj.a(this.t, this.u + e(), this.v), aoj.a(x, y, z)) == null);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean canCoordBeSeenFromFeet(int x, int y, int z) {
/* 1518 */     return (this.p.a(aoj.a(this.t, this.D.b + 0.15D, this.v), aoj.a(x, y, z)) == null);
/*      */   }
/*      */ 
/*      */   
/*      */   public int aT() {
/* 1523 */     return 20;
/*      */   }
/*      */   
/*      */   public void a(bq var1) {
/* 1527 */     super.a(var1);
/*      */     
/* 1529 */     try { if (this.fakePlayer != null) {
/* 1530 */         by var2 = var1.m("Inventory");
/* 1531 */         this.inventory.b(var2);
/* 1532 */         this.fakePlayer.aq = var1.e("Dimension");
/* 1533 */         setSleeping(var1.n("Sleeping"));
/*      */         
/* 1535 */         this.fakePlayer.cg = var1.g("XpP");
/* 1536 */         this.fakePlayer.ce = var1.e("XpLevel");
/* 1537 */         this.fakePlayer.cf = var1.e("XpTotal");
/*      */         
/* 1539 */         if (getSleeping()) {
/* 1540 */           this.fakePlayer.ca = new s(ke.c(this.t), ke.c(this.u), ke.c(this.v));
/* 1541 */           this.fakePlayer.a(true, true, false);
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1548 */         getFoodStats().a(var1);
/* 1549 */         this.fakePlayer.cd.b(var1);
/*      */       }  }
/* 1551 */     catch (Exception ex) { ex.printStackTrace(); }
/*      */   
/*      */   }
/*      */   public void b(bq var1) {
/* 1555 */     super.b(var1);
/*      */     
/* 1557 */     try { if (this.fakePlayer != null) {
/* 1558 */         var1.a("Inventory", (cd)this.inventory.a(new by()));
/* 1559 */         var1.a("Dimension", this.fakePlayer.aq);
/* 1560 */         var1.a("Sleeping", getSleeping());
/*      */         
/* 1562 */         var1.a("XpP", this.fakePlayer.cg);
/* 1563 */         var1.a("XpLevel", this.fakePlayer.ce);
/* 1564 */         var1.a("XpTotal", this.fakePlayer.cf);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1572 */         getFoodStats().b(var1);
/* 1573 */         this.fakePlayer.cd.a(var1);
/*      */       }  }
/* 1575 */     catch (Exception ex) { ex.printStackTrace(); }
/*      */   
/*      */   }
/*      */   public void noMoveTriggerCallback() {
/* 1579 */     setPathExToEntity((PathEntityEx)null);
/* 1580 */     setEntityToAttack((lq)null);
/*      */   }
/*      */ 
/*      */   
/*      */   public float updateRotation2(float f, float f1, float f2) {
/*      */     float f3;
/* 1586 */     for (f3 = f1 - f; f3 < -180.0F; f3 += 360.0F);
/* 1587 */     for (; f3 >= 180.0F; f3 -= 360.0F);
/* 1588 */     if (f3 > f2)
/*      */     {
/* 1590 */       f3 = f2;
/*      */     }
/* 1592 */     if (f3 < -f2)
/*      */     {
/* 1594 */       f3 = -f2;
/*      */     }
/* 1596 */     return f + f3;
/*      */   }
/*      */ 
/*      */   
/*      */   public aoh a(double par1, float par3) {
/* 1601 */     aoj var4 = h(par3);
/* 1602 */     aoj var5 = i(par3);
/* 1603 */     aoj var6 = var4.c(var5.c * par1, var5.d * par1, var5.e * par1);
/* 1604 */     return this.p.a(var4, var6);
/*      */   }
/*      */ 
/*      */   
/*      */   public aoj h(float par1) {
/* 1609 */     if (par1 == 1.0F)
/*      */     {
/* 1611 */       return aoj.a(this.t, this.u, this.v);
/*      */     }
/*      */ 
/*      */     
/* 1615 */     double var2 = this.q + (this.t - this.q) * par1;
/* 1616 */     double var4 = this.r + (this.u - this.r) * par1;
/* 1617 */     double var6 = this.s + (this.v - this.s) * par1;
/* 1618 */     return aoj.a(var2, var4, var6);
/*      */   }
/*      */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/entity/c_PlayerProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */