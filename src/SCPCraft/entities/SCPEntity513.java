/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import lh;
/*     */ import lq;
/*     */ import ly;
/*     */ import md;
/*     */ import qx;
/*     */ import s;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity513
/*     */   extends SCPEntity
/*     */ {
/*  18 */   private static final ly field_82219_bJ = new SCPFilterAttack();
/*     */   
/*     */   public SCPEntity513(yc par1World) {
/*  21 */     super(par1World);
/*  22 */     a(0.6F, 2.0F);
/*  23 */     this.af = true;
/*  24 */     this.attackStrength = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  29 */     return 9001;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void c_(qx par1EntityPlayer) {}
/*     */ 
/*     */   
/*     */   public void targetLivings() {
/*  38 */     List var5 = this.p.a(md.class, this.D.b(16.0D, 4.0D, 16.0D), field_82219_bJ);
/*  39 */     Iterator<lq> var2 = var5.iterator();
/*     */     
/*  41 */     while (var2.hasNext()) {
/*     */       
/*  43 */       lq var3 = var2.next();
/*  44 */       md var4 = (md)var3;
/*     */       
/*  46 */       if (var4 != null && var4.hasEntityHeard513() == true)
/*     */       {
/*  48 */         this.a_ = (lq)var4;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/*  55 */     ur var2 = par1EntityPlayer.bJ.g();
/*     */     
/*  57 */     if (var2 != null && var2.c == mod_SCP.SCP1023ARC.cj) {
/*     */       
/*  59 */       x();
/*  60 */       this.p.a("largeexplode", this.t, this.u + (this.O / 2.0F), this.v, 0.0D, 0.0D, 0.0D);
/*  61 */       return true;
/*     */     } 
/*     */ 
/*     */     
/*  65 */     return super.a(par1EntityPlayer);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean m(lq par1Entity) {
/*  71 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float aX() {
/*  76 */     return 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/*  81 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean canDamagePlayer() {
/*  86 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(int par1, int par2, int par3, int par4) {}
/*     */ 
/*     */   
/*     */   public void c() {
/*  95 */     s var2 = this.p.H();
/*  96 */     if (this.aa.nextInt(200) == 0) { this.aG = "/SCPCraft/textures/mobs/513.png"; }
/*  97 */     else { this.aG = "/SCPCraft/textures/mobs/513B.png"; }
/*  98 */      if (this.a_ != null)
/*     */     {
/* 100 */       a(this.a_, 10.0F, 20.0F);
/*     */     }
/* 102 */     if (this.a_ != null && d(this.a_) > 15.0D)
/*     */     {
/* 104 */       b(this.a_.t, this.a_.u, this.a_.v);
/*     */     }
/* 106 */     if (this.a_ != null && ((md)this.a_).getBlink() >= 0 && ((md)this.a_).getBlink() <= 5)
/*     */     {
/* 108 */       b(this.a_.t, this.a_.u, this.a_.v);
/*     */     }
/* 110 */     if (this.a_ != null)
/*     */     {
/* 112 */       if (this.a_.L && this.a_ instanceof qx) b(var2.a, var2.b, var2.c);  } 
/* 113 */     bk();
/* 114 */     super.c();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(lq par1Entity, float par2) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean L() {
/* 124 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(lh par1DamageSource, int par2) {
/* 129 */     return false;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity513.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */