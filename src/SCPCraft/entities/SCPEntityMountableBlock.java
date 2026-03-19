/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import bq;
/*     */ import lq;
/*     */ import qx;
/*     */ import yc;
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
/*     */ public class SCPEntityMountableBlock
/*     */   extends lq
/*     */ {
/*     */   private int orgBlockPosX;
/*     */   private int orgBlockPosY;
/*     */   private int orgBlockPosZ;
/*     */   protected int orgBlockID;
/*     */   
/*     */   public SCPEntityMountableBlock(yc world) {
/*  26 */     super(world);
/*  27 */     this.Y = true;
/*  28 */     this.m = true;
/*  29 */     this.N = 0.0F;
/*  30 */     this.O = 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public SCPEntityMountableBlock(yc world, double d, double d1, double d2) {
/*  35 */     super(world);
/*  36 */     this.Y = true;
/*  37 */     this.m = true;
/*  38 */     this.N = 0.0F;
/*  39 */     this.O = 0.0F;
/*  40 */     b(d, d1, d2);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SCPEntityMountableBlock(yc world, qx entityplayer, int i, int j, int k, float mountingX, float mountingY, float mountingZ) {
/*  46 */     super(world);
/*  47 */     this.Y = true;
/*  48 */     this.m = true;
/*  49 */     this.N = 0.0F;
/*  50 */     this.O = 0.0F;
/*     */     
/*  52 */     setOrgBlockPosX(i);
/*  53 */     setOrgBlockPosY(j);
/*  54 */     setOrgBlockPosZ(k);
/*  55 */     this.orgBlockID = world.a(i, j, k);
/*     */     
/*  57 */     b(mountingX, mountingY, mountingZ);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(qx entityplayer) {
/*  64 */     if (this.n != null && this.n instanceof qx && this.n != entityplayer)
/*     */     {
/*  66 */       return true;
/*     */     }
/*     */ 
/*     */     
/*  70 */     if (!this.p.I)
/*     */     {
/*  72 */       entityplayer.a(this);
/*     */     }
/*  74 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void y() {
/*  82 */     this.p.D.a("entityBaseTick");
/*  83 */     if (this.n == null || this.n.L) {
/*     */       
/*  85 */       x();
/*     */     }
/*  87 */     else if (this.p.a(getOrgBlockPosX(), getOrgBlockPosY(), getOrgBlockPosZ()) != this.orgBlockID) {
/*     */       
/*  89 */       a((qx)this.n);
/*     */     } 
/*  91 */     this.ab++;
/*  92 */     this.p.D.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {}
/*     */ 
/*     */   
/*     */   public void a(bq nbttagcompound) {}
/*     */   
/*     */   public void b(bq nbttagcompound) {}
/*     */   
/*     */   public int getOrgBlockPosX() {
/* 104 */     return this.orgBlockPosX;
/*     */   }
/*     */   
/*     */   public void setOrgBlockPosX(int orgBlockPosX) {
/* 108 */     this.orgBlockPosX = orgBlockPosX;
/*     */   }
/*     */   
/*     */   public int getOrgBlockPosY() {
/* 112 */     return this.orgBlockPosY;
/*     */   }
/*     */   
/*     */   public void setOrgBlockPosY(int orgBlockPosY) {
/* 116 */     this.orgBlockPosY = orgBlockPosY;
/*     */   }
/*     */   
/*     */   public int getOrgBlockPosZ() {
/* 120 */     return this.orgBlockPosZ;
/*     */   }
/*     */   
/*     */   public void setOrgBlockPosZ(int orgBlockPosZ) {
/* 124 */     this.orgBlockPosZ = orgBlockPosZ;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntityMountableBlock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */