/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import ahl;
/*     */ import ke;
/*     */ import lq;
/*     */ import md;
/*     */ import nc;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPEntityAggressiveAI
/*     */   extends nc
/*     */ {
/*     */   yc worldObj;
/*     */   md attacker;
/*     */   md entityTarget;
/*     */   int attackTick;
/*     */   float field_75440_e;
/*     */   boolean field_75437_f;
/*     */   ahl entityPathEntity;
/*     */   Class classTarget;
/*     */   private int field_75445_i;
/*     */   
/*     */   public SCPEntityAggressiveAI(md par1EntityLiving, Class par2Class, float par3, boolean par4) {
/*  29 */     this(par1EntityLiving, par3, par4);
/*  30 */     this.classTarget = par2Class;
/*     */   }
/*     */ 
/*     */   
/*     */   public SCPEntityAggressiveAI(md par1EntityLiving, float par2, boolean par3) {
/*  35 */     this.attackTick = 0;
/*  36 */     this.attacker = par1EntityLiving;
/*  37 */     this.worldObj = par1EntityLiving.p;
/*  38 */     this.field_75440_e = par2;
/*  39 */     this.field_75437_f = par3;
/*  40 */     a(3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  48 */     md var1 = this.attacker.aG();
/*     */     
/*  50 */     if (var1 == null)
/*     */     {
/*  52 */       return false;
/*     */     }
/*  54 */     if (this.classTarget != null && !this.classTarget.isAssignableFrom(var1.getClass()))
/*     */     {
/*  56 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  60 */     this.entityTarget = var1;
/*  61 */     this.entityPathEntity = this.attacker.az().a(this.entityTarget);
/*  62 */     return (this.entityPathEntity != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  71 */     md var1 = this.attacker.aG();
/*  72 */     return (var1 == null) ? false : (!this.entityTarget.S() ? false : (!this.field_75437_f ? (!this.attacker.az().f()) : this.attacker.e(ke.c(this.entityTarget.t), ke.c(this.entityTarget.u), ke.c(this.entityTarget.v))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  80 */     this.attacker.az().a(this.entityPathEntity, this.field_75440_e);
/*  81 */     this.field_75445_i = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void d() {
/*  89 */     this.entityTarget = null;
/*  90 */     this.attacker.az().g();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void e() {
/*  98 */     this.attacker.aw().a((lq)this.entityTarget, 30.0F, 30.0F);
/*     */     
/* 100 */     if ((this.field_75437_f || this.attacker.aA().a((lq)this.entityTarget)) && --this.field_75445_i <= 0) {
/*     */       
/* 102 */       this.field_75445_i = 4 + this.attacker.aB().nextInt(7);
/* 103 */       this.attacker.az().a(this.entityTarget, this.field_75440_e);
/*     */     } 
/*     */     
/* 106 */     this.attackTick = Math.max(this.attackTick - 1, 0);
/* 107 */     double var1 = (this.attacker.N * 2.0F * this.attacker.N * 2.0F);
/*     */     
/* 109 */     if (this.attacker.e(this.entityTarget.t, this.entityTarget.D.b, this.entityTarget.v) <= var1)
/*     */     {
/* 111 */       if (this.attackTick <= 0)
/*     */       {
/* 113 */         this.attackTick = 20;
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntityAggressiveAI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */