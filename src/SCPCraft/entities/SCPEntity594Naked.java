/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import bq;
/*     */ import ke;
/*     */ import ln;
/*     */ import lq;
/*     */ import md;
/*     */ import mi;
/*     */ import mu;
/*     */ import mx;
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
/*     */ public class SCPEntity594Naked extends ox {
/*  26 */   public static final float[][] fleeceColorTable = new float[][] { { 1.0F, 1.0F, 1.0F }, { 0.95F, 0.7F, 0.2F }, { 0.9F, 0.5F, 0.85F }, { 0.6F, 0.7F, 0.95F }, { 0.9F, 0.9F, 0.2F }, { 0.5F, 0.8F, 0.1F }, { 0.95F, 0.7F, 0.8F }, { 0.3F, 0.3F, 0.3F }, { 0.6F, 0.6F, 0.6F }, { 0.3F, 0.6F, 0.7F }, { 0.7F, 0.4F, 0.9F }, { 0.2F, 0.4F, 0.8F }, { 0.5F, 0.4F, 0.3F }, { 0.4F, 0.5F, 0.2F }, { 0.8F, 0.3F, 0.3F }, { 0.1F, 0.1F, 0.1F } };
/*     */ 
/*     */   
/*     */   private int sheepTimer;
/*     */ 
/*     */   
/*     */   public boolean field_70885_d = false;
/*     */   
/*  34 */   public float field_70886_e = 0.0F;
/*  35 */   public float destPos = 0.0F;
/*     */   public float field_70884_g;
/*     */   public float field_70888_h;
/*  38 */   public float field_70889_i = 1.0F;
/*     */ 
/*     */   
/*     */   public int timeUntilNextWool;
/*     */ 
/*     */   
/*  44 */   private mx aiEatGrass = new mx((md)this);
/*     */ 
/*     */   
/*     */   public SCPEntity594Naked(yc par1World) {
/*  48 */     super(par1World);
/*  49 */     this.aG = "/SCPCraft/textures/mobs/594Naked.png";
/*  50 */     a(0.8F, 1.3F);
/*  51 */     float var2 = 0.23F;
/*  52 */     this.timeUntilNextWool = this.aa.nextInt(1000);
/*  53 */     az().a(true);
/*  54 */     this.bn.a(0, (nc)new mz((md)this));
/*  55 */     this.bn.a(1, (nc)new nt((mi)this, 0.38F));
/*  56 */     this.bn.a(2, (nc)new mu(this, var2));
/*  57 */     this.bn.a(3, (nc)new od((mi)this, 0.25F, up.T.cj, false));
/*  58 */     this.bn.a(4, (nc)new nb(this, 0.25F));
/*  59 */     this.bn.a(5, (nc)this.aiEatGrass);
/*  60 */     this.bn.a(6, (nc)new nw((mi)this, var2));
/*  61 */     this.bn.a(7, (nc)new nh((md)this, qx.class, 6.0F));
/*  62 */     this.bn.a(8, (nc)new nv((md)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public SCPEnumCreatureAttribute getSCPAttribute() {
/*  67 */     return SCPEnumCreatureAttribute.SCP;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean be() {
/*  75 */     if (!this.isAggro) return true; 
/*  76 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bl() {
/*  81 */     this.sheepTimer = this.aiEatGrass.f();
/*  82 */     super.bl();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(float par1) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  93 */     super.c();
/*  94 */     this.field_70888_h = this.field_70886_e;
/*  95 */     this.field_70884_g = this.destPos;
/*  96 */     this.destPos = (float)(this.destPos + (this.E ? -1 : 4) * 0.3D);
/*     */     
/*  98 */     if (this.destPos < 0.0F)
/*     */     {
/* 100 */       this.destPos = 0.0F;
/*     */     }
/*     */     
/* 103 */     if (this.destPos > 1.0F)
/*     */     {
/* 105 */       this.destPos = 1.0F;
/*     */     }
/*     */ 
/*     */     
/* 109 */     if (!this.E && this.field_70889_i < 1.0F)
/*     */     {
/* 111 */       this.field_70889_i = 1.0F;
/*     */     }
/*     */     
/* 114 */     this.field_70889_i = (float)(this.field_70889_i * 0.9D);
/*     */     
/* 116 */     if (!this.E && this.x < 0.0D)
/*     */     {
/* 118 */       this.x *= 0.6D;
/*     */     }
/*     */     
/* 121 */     this.field_70886_e += this.field_70889_i * 2.0F;
/*     */     
/* 123 */     if (!h_() && --this.timeUntilNextWool <= 0) {
/*     */ 
/*     */       
/* 126 */       if (!this.p.I) {
/*     */         
/* 128 */         x();
/* 129 */         SCPEntity594 var10 = new SCPEntity594(this.p);
/* 130 */         var10.b(this.t, this.u, this.v, this.z, this.A);
/* 131 */         var10.j(aU());
/* 132 */         var10.ax = this.ax;
/* 133 */         this.p.d((lq)var10);
/* 134 */         this.p.a((lq)this, "mob.chickenplop", 1.0F, (this.aa.nextFloat() - this.aa.nextFloat()) * 0.2F + 1.0F);
/*     */       } 
/* 136 */       this.timeUntilNextWool = this.aa.nextInt(1000);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/* 142 */     return 16;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/* 147 */     super.a();
/* 148 */     this.ag.a(16, new Byte((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(byte par1) {
/* 153 */     if (par1 == 10) {
/*     */       
/* 155 */       this.sheepTimer = 40;
/*     */     }
/*     */     else {
/*     */       
/* 159 */       super.a(par1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public float func_70894_j(float par1) {
/* 165 */     return (this.sheepTimer <= 0) ? 0.0F : ((this.sheepTimer >= 4 && this.sheepTimer <= 36) ? 1.0F : ((this.sheepTimer < 4) ? ((this.sheepTimer - par1) / 4.0F) : (-((this.sheepTimer - 40) - par1) / 4.0F)));
/*     */   }
/*     */ 
/*     */   
/*     */   public float func_70890_k(float par1) {
/* 170 */     if (this.sheepTimer > 4 && this.sheepTimer <= 36) {
/*     */       
/* 172 */       float var2 = ((this.sheepTimer - 4) - par1) / 32.0F;
/* 173 */       return 0.62831855F + 0.2199115F * ke.a(var2 * 28.7F);
/*     */     } 
/*     */ 
/*     */     
/* 177 */     return (this.sheepTimer > 0) ? 0.62831855F : (this.A / 57.295776F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/* 186 */     ur var2 = par1EntityPlayer.bJ.g();
/*     */     
/* 188 */     return super.a(par1EntityPlayer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/* 196 */     super.b(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/* 205 */     super.a(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/* 211 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/* 219 */     return "mob.sheep";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/* 227 */     return "mob.sheep";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 235 */     return "mob.sheep";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ox spawnBabyAnimal(ox par1EntityAnimal) {
/* 243 */     SCPEntity594Naked var2 = (SCPEntity594Naked)par1EntityAnimal;
/* 244 */     SCPEntity594Naked var3 = new SCPEntity594Naked(this.p);
/* 245 */     return var3;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ln a(ln var1) {
/* 251 */     return null;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity594Naked.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */