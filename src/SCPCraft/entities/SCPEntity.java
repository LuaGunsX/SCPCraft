/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import lh;
/*     */ import lq;
/*     */ import ly;
/*     */ import md;
/*     */ import mi;
/*     */ import nc;
/*     */ import oh;
/*     */ import qx;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public abstract class SCPEntity
/*     */   extends mi
/*     */ {
/*  20 */   protected int attackStrength = 0;
/*  21 */   private static final ly field_82219_bJ = new SCPFilterAttack();
/*     */ 
/*     */   
/*     */   public SCPEntity(yc par1World) {
/*  25 */     super(par1World);
/*  26 */     this.bd = 5;
/*  27 */     this.l = 10.0D;
/*  28 */     this.attackStrength = 6;
/*  29 */     this.bo.a(2, (nc)new oh((md)this, md.class, 16.0F, 0, false, false, field_82219_bJ));
/*     */   }
/*     */ 
/*     */   
/*     */   public void targetLivings() {
/*  34 */     List var5 = this.p.a(md.class, this.D.b(16.0D, 4.0D, 16.0D), field_82219_bJ);
/*  35 */     Iterator<lq> var2 = var5.iterator();
/*     */     
/*  37 */     while (var2.hasNext()) {
/*     */       
/*  39 */       lq var3 = var2.next();
/*  40 */       md var4 = (md)var3;
/*     */       
/*  42 */       if (var4 != null)
/*     */       {
/*  44 */         this.a_ = (lq)var4;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/*  51 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md par1EntityLiving) {
/*  56 */     super.b(par1EntityLiving);
/*     */   }
/*     */ 
/*     */   
/*     */   public SCPEnumCreatureAttribute getSCPAttribute() {
/*  61 */     return SCPEnumCreatureAttribute.SCP;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  70 */     super.c();
/*  71 */     targetLivings();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void j_() {
/*  79 */     super.j_();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected lq j() {
/*  88 */     qx var1 = this.p.b((lq)this, 16.0D);
/*  89 */     return (var1 != null && n((lq)var1)) ? (lq)var1 : null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(lh par1DamageSource, int par2) {
/*  97 */     if (super.a(par1DamageSource, par2)) {
/*     */       
/*  99 */       lq var3 = par1DamageSource.g();
/*     */       
/* 101 */       if (this.n != var3 && this.o != var3) {
/*     */         
/* 103 */         if (var3 != this)
/*     */         {
/* 105 */           this.a_ = var3;
/*     */         }
/*     */         
/* 108 */         return true;
/*     */       } 
/*     */ 
/*     */       
/* 112 */       return true;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 117 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void c_(qx par1EntityPlayer) {
/* 123 */     if (getSCPAttribute() != SCPEnumCreatureAttribute.SCPObject) par1EntityPlayer.a(lh.a((md)this), this.attackStrength);
/*     */   
/*     */   }
/*     */   
/*     */   public boolean m(lq par1Entity) {
/* 128 */     int var2 = this.attackStrength;
/* 129 */     return par1Entity.a(lh.a((md)this), var2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(lq par1Entity, float par2) {
/* 137 */     if (this.aZ <= 0 && par2 < 2.0F && par1Entity.D.e > this.D.b && par1Entity.D.b < this.D.e) {
/*     */       
/* 139 */       this.aZ = 20;
/* 140 */       m(par1Entity);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float a(int par1, int par2, int par3) {
/* 150 */     return 0.5F - this.p.p(par1, par2, par3);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/* 155 */     ur var2 = par1EntityPlayer.bJ.g();
/*     */     
/* 157 */     if (var2 != null && var2.c == mod_SCP.SCP1023ARC.cj) {
/*     */       
/* 159 */       x();
/* 160 */       this.p.a("largeexplode", this.t, this.u + (this.O / 2.0F), this.v, 0.0D, 0.0D, 0.0D);
/* 161 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 165 */     return super.a(par1EntityPlayer);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */