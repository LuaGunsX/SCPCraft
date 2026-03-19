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
/*     */ public class SCPTileEntity019
/*     */   extends any
/*     */ {
/*     */   public int delay;
/*     */   private String mobID;
/*     */   public double yaw;
/*     */   public double yaw2;
/*     */   
/*     */   public SCPTileEntity019() {
/*  23 */     this.delay = -1;
/*  24 */     this.yaw2 = 0.0D;
/*  25 */     this.mobID = "SCP-019-2";
/*  26 */     this.delay = 20;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getMobID() {
/*  31 */     return this.mobID;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setMobID(String par1Str) {
/*  36 */     this.mobID = par1Str;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean anyPlayerInRange() {
/*  44 */     return (this.k.a(this.l + 0.5D, this.m + 0.5D, this.n + 0.5D, 16.0D) != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void g() {
/*  53 */     this.yaw2 = this.yaw;
/*     */     
/*  55 */     if (!anyPlayerInRange()) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  60 */     double d = (this.l + this.k.t.nextFloat());
/*  61 */     double d1 = (this.m + this.k.t.nextFloat());
/*  62 */     double d2 = (this.n + this.k.t.nextFloat());
/*  63 */     this.k.a("portal", d, d1, d2, 0.0D, 0.0D, 0.0D);
/*  64 */     this.k.a("portal", d, d1, d2, 0.0D, 0.0D, 0.0D);
/*     */     
/*  66 */     for (this.yaw += (1000.0F / (this.delay + 200.0F)); this.yaw > 360.0D; ) {
/*     */       
/*  68 */       this.yaw -= 360.0D;
/*  69 */       this.yaw2 -= 360.0D;
/*     */     } 
/*     */     
/*  72 */     if (!this.k.I) {
/*     */       
/*  74 */       if (this.delay == -1)
/*     */       {
/*  76 */         updateDelay();
/*     */       }
/*     */       
/*  79 */       if (this.delay > 0) {
/*     */         
/*  81 */         this.delay--;
/*     */         
/*     */         return;
/*     */       } 
/*  85 */       byte byte0 = 4;
/*     */       
/*  87 */       for (int i = 0; i < byte0; i++) {
/*     */         
/*  89 */         md entityliving = (md)lv.a(this.mobID, this.k);
/*     */         
/*  91 */         if (entityliving == null) {
/*     */           return;
/*     */         }
/*     */ 
/*     */         
/*  96 */         int j = this.k.a(entityliving.getClass(), aoe.a(this.l, this.m, this.n, (this.l + 1), (this.m + 1), (this.n + 1)).b(8.0D, 4.0D, 8.0D)).size();
/*     */         
/*  98 */         if (j >= 6) {
/*     */           
/* 100 */           updateDelay();
/*     */           
/*     */           return;
/*     */         } 
/* 104 */         double d3 = this.l + (this.k.t.nextDouble() - this.k.t.nextDouble()) * 4.0D;
/* 105 */         double d4 = (this.m + this.k.t.nextInt(3) - 1);
/* 106 */         double d5 = this.n + (this.k.t.nextDouble() - this.k.t.nextDouble()) * 4.0D;
/* 107 */         entityliving.b(d3, d4, d5, this.k.t.nextFloat() * 360.0F, 0.0F);
/*     */         
/* 109 */         if (entityliving.bs()) {
/*     */           
/* 111 */           this.k.d((lq)entityliving);
/* 112 */           this.k.f(2004, this.l, this.m, this.n, 0);
/* 113 */           entityliving.aR();
/* 114 */           updateDelay();
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 119 */     super.g();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void updateDelay() {
/* 127 */     this.delay = 200 + this.k.t.nextInt(600);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/* 135 */     super.a(par1NBTTagCompound);
/* 136 */     this.mobID = par1NBTTagCompound.i("EntityId");
/* 137 */     this.delay = par1NBTTagCompound.d("Delay");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/* 145 */     super.b(par1NBTTagCompound);
/* 146 */     par1NBTTagCompound.a("EntityId", this.mobID);
/* 147 */     par1NBTTagCompound.a("Delay", (short)this.delay);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/tileentities/SCPTileEntity019.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */