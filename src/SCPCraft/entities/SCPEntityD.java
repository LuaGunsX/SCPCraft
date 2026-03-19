/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import lh;
/*     */ import lq;
/*     */ import md;
/*     */ import mi;
/*     */ import qe;
/*     */ import qx;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public abstract class SCPEntityD
/*     */   extends mi
/*     */   implements qe {
/*  16 */   protected int attackStrength = 0;
/*     */ 
/*     */   
/*     */   public SCPEntityD(yc par1World) {
/*  20 */     super(par1World);
/*  21 */     this.bd = 0;
/*  22 */     az().a(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public SCPEnumCreatureAttribute getSCPAttribute() {
/*  27 */     return SCPEnumCreatureAttribute.CLASSD;
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  32 */     return 30;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/*  37 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md par1EntityLiving) {
/*  42 */     super.b(par1EntityLiving);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  51 */     super.c();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void j_() {
/*  59 */     super.j_();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(lh par1DamageSource, int par2) {
/*  67 */     if (super.a(par1DamageSource, par2)) {
/*     */       
/*  69 */       lq var3 = par1DamageSource.g();
/*     */       
/*  71 */       if (this.n != var3 && this.o != var3) {
/*     */         
/*  73 */         if (var3 != this)
/*     */         {
/*  75 */           this.a_ = var3;
/*     */         }
/*     */         
/*  78 */         return true;
/*     */       } 
/*     */ 
/*     */       
/*  82 */       return true;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  87 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c_(qx par1EntityPlayer) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float a(int par1, int par2, int par3) {
/* 101 */     return 0.5F - this.p.p(par1, par2, par3);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/* 106 */     ur var2 = par1EntityPlayer.bJ.g();
/*     */     
/* 108 */     if (var2 != null && var2.c == mod_SCP.SCP1023ARC.cj) {
/*     */       
/* 110 */       x();
/* 111 */       this.p.a("largeexplode", this.t, this.u + (this.O / 2.0F), this.v, 0.0D, 0.0D, 0.0D);
/* 112 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 116 */     return super.a(par1EntityPlayer);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntityD.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */