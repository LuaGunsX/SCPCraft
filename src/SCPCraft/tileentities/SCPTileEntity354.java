/*     */ package SCPCraft.tileentities;
/*     */ 
/*     */ import any;
/*     */ import aoe;
/*     */ import bq;
/*     */ import lq;
/*     */ import lv;
/*     */ import md;
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
/*     */ public class SCPTileEntity354
/*     */   extends any
/*     */ {
/*  23 */   public double yaw2 = 0.0D;
/*  24 */   private String mobID = "Enderman"; public double yaw;
/*  25 */   public int delay = -1;
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMobID() {
/*  30 */     return this.mobID;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setMobID(String par1Str) {
/*  35 */     this.mobID = par1Str;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean anyPlayerInRange() {
/*  43 */     return (this.k.a(this.l + 0.5D, this.m + 0.5D, this.n + 0.5D, 16.0D) != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void g() {
/*  52 */     this.yaw2 = this.yaw;
/*     */     
/*  54 */     if (!anyPlayerInRange()) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  59 */     double d = (this.l + this.k.t.nextFloat());
/*  60 */     double d1 = (this.m + this.k.t.nextFloat());
/*  61 */     double d2 = (this.n + this.k.t.nextFloat());
/*     */     
/*  63 */     for (this.yaw += (1000.0F / (this.delay + 200.0F)); this.yaw > 360.0D; ) {
/*     */       
/*  65 */       this.yaw -= 360.0D;
/*  66 */       this.yaw2 -= 360.0D;
/*     */     } 
/*     */     
/*  69 */     if (!this.k.I) {
/*     */       
/*  71 */       if (this.delay == -1)
/*     */       {
/*  73 */         updateDelay();
/*     */       }
/*     */       
/*  76 */       if (this.delay > 0) {
/*     */         
/*  78 */         this.delay--;
/*     */         
/*     */         return;
/*     */       } 
/*  82 */       byte byte0 = 4;
/*     */       
/*  84 */       for (int i = 0; i < byte0; i++) {
/*     */         
/*  86 */         md entityliving = (md)lv.a(this.mobID, this.k);
/*     */         
/*  88 */         if (entityliving == null) {
/*     */           return;
/*     */         }
/*     */ 
/*     */         
/*  93 */         int j = this.k.a(entityliving.getClass(), aoe.a(this.l, this.m, this.n, (this.l + 1), (this.m + 1), (this.n + 1)).b(8.0D, 4.0D, 8.0D)).size();
/*     */         
/*  95 */         if (j >= 6) {
/*     */           
/*  97 */           updateDelay();
/*     */           
/*     */           return;
/*     */         } 
/* 101 */         double d3 = this.l + (this.k.t.nextDouble() - this.k.t.nextDouble()) * 4.0D;
/* 102 */         double d4 = (this.m + this.k.t.nextInt(3) - 1);
/* 103 */         double d5 = this.n + (this.k.t.nextDouble() - this.k.t.nextDouble()) * 4.0D;
/* 104 */         entityliving.b(d3, d4, d5, this.k.t.nextFloat() * 360.0F, 0.0F);
/*     */         
/* 106 */         if (entityliving.bs()) {
/*     */           
/* 108 */           this.k.d((lq)entityliving);
/* 109 */           updateDelay();
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 114 */     super.g();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void updateDelay() {
/* 122 */     this.delay = 200 + this.k.t.nextInt(600);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/* 130 */     super.a(par1NBTTagCompound);
/* 131 */     this.mobID = par1NBTTagCompound.i("EntityId");
/* 132 */     this.delay = par1NBTTagCompound.d("Delay");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/* 140 */     super.b(par1NBTTagCompound);
/* 141 */     par1NBTTagCompound.a("EntityId", this.mobID);
/* 142 */     par1NBTTagCompound.a("Delay", (short)this.delay);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/tileentities/SCPTileEntity354.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */