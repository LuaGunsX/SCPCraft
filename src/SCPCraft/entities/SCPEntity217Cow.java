/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import bq;
/*     */ import lh;
/*     */ import ln;
/*     */ import lq;
/*     */ import md;
/*     */ import mi;
/*     */ import mu;
/*     */ import mv;
/*     */ import mz;
/*     */ import nb;
/*     */ import nc;
/*     */ import nh;
/*     */ import nt;
/*     */ import nv;
/*     */ import nw;
/*     */ import od;
/*     */ import ox;
/*     */ import qx;
/*     */ import up;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity217Cow extends ox {
/*     */   public SCPEntity217Cow(yc par1World) {
/*  27 */     super(par1World);
/*  28 */     this.aG = "/SCPCraft/textures/mobs/SCP217/SCPCow.png";
/*  29 */     a(0.9F, 1.3F);
/*  30 */     az().a(true);
/*  31 */     this.bn.a(0, (nc)new mz((md)this));
/*  32 */     this.bn.a(1, (nc)new nt((mi)this, 0.38F));
/*  33 */     this.bn.a(2, (nc)(this.field_82184_d = new mv((md)this, 0.7F)));
/*  34 */     this.bn.a(2, (nc)new mu(this, 0.2F));
/*  35 */     this.bn.a(3, (nc)new od((mi)this, 0.25F, up.o.cj, false));
/*  36 */     this.bn.a(4, (nc)new nb(this, 0.25F));
/*  37 */     this.bn.a(5, (nc)new nw((mi)this, 0.2F));
/*  38 */     this.bn.a(6, (nc)new nh((md)this, qx.class, 6.0F));
/*  39 */     this.bn.a(7, (nc)new nv((md)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public SCPEnumCreatureAttribute getSCPAttribute() {
/*  44 */     return SCPEnumCreatureAttribute.SCP;
/*     */   }
/*     */   private final mv field_82184_d;
/*     */   
/*     */   public boolean bI() {
/*  49 */     ur var1 = ((qx)this.n).bD();
/*  50 */     return (var1 == null || var1 != null);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bl() {
/*  55 */     super.bl();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean be() {
/*  63 */     if (!this.isAggro) return true; 
/*  64 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  69 */     return 20;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean attackEntityFrom(lh par1DamageSource, int par2, qx entityplayer) {
/*  74 */     if (this.n != null || this.n == entityplayer)
/*     */     {
/*  76 */       return false;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  81 */     return a(par1DamageSource, par2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/*  90 */     super.b(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/*  98 */     super.a(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/* 106 */     return "mob.cow";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/* 114 */     return "mob.cowhurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 122 */     return "mob.cowhurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float aX() {
/* 130 */     return 0.4F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int bb() {
/* 138 */     return up.o.cj;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double X() {
/* 146 */     return this.O * 1.3499999999999999D - 0.5D;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean f_() {
/* 155 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/* 163 */     if (super.a(par1EntityPlayer))
/*     */     {
/* 165 */       return true;
/*     */     }
/* 167 */     if (!this.p.I && (this.n == null || this.n == par1EntityPlayer)) {
/*     */       
/* 169 */       par1EntityPlayer.a((lq)this);
/* 170 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 174 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SCPEntity217Cow spawnBabyAnimal(ln par1EntityAnimal) {
/* 183 */     return new SCPEntity217Cow(this.p);
/*     */   }
/*     */ 
/*     */   
/*     */   public mv getAIControlledByPlayer() {
/* 188 */     return this.field_82184_d;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ln a(ln var1) {
/* 194 */     return (ln)spawnBabyAnimal(var1);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity217Cow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */