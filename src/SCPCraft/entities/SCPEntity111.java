/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import bq;
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
/*     */ public class SCPEntity111 extends ox {
/*     */   public SCPEntity111(yc par1World) {
/*  26 */     super(par1World);
/*  27 */     this.aG = "/SCPCraft/textures/mobs/111.png";
/*  28 */     a(0.75F, 0.75F);
/*  29 */     az().a(true);
/*  30 */     float var2 = 0.25F;
/*  31 */     this.bn.a(0, (nc)new mz((md)this));
/*  32 */     this.bn.a(1, (nc)new nt((mi)this, 0.38F));
/*  33 */     this.bn.a(2, (nc)(this.field_82184_d = new mv((md)this, 0.7F)));
/*  34 */     this.bn.a(3, (nc)new mu(this, var2));
/*  35 */     this.bn.a(4, (nc)new od((mi)this, 0.3F, up.j.cj, false));
/*  36 */     this.bn.a(5, (nc)new nb(this, 0.28F));
/*  37 */     this.bn.a(6, (nc)new nw((mi)this, var2));
/*  38 */     this.bn.a(7, (nc)new nh((md)this, qx.class, 6.0F));
/*  39 */     this.bn.a(8, (nc)new nv((md)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public SCPEnumCreatureAttribute getSCPAttribute() {
/*  44 */     return SCPEnumCreatureAttribute.SCP;
/*     */   }
/*     */ 
/*     */   
/*     */   private final mv field_82184_d;
/*     */ 
/*     */   
/*     */   public boolean be() {
/*  52 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double X() {
/*  60 */     return this.O * 0.7499999999999999D - 0.5D;
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  65 */     return 40;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bl() {
/*  70 */     super.bl();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bI() {
/*  75 */     ur var1 = ((qx)this.n).bD();
/*  76 */     return (var1 == null || var1 != null);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/*  81 */     super.a();
/*  82 */     this.ag.a(16, Byte.valueOf((byte)0));
/*     */   }
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
/* 106 */     return "mob.villager.default";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/* 114 */     return "mob.villager.default";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 122 */     return "mob.villager.default";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/* 130 */     if (super.a(par1EntityPlayer))
/*     */     {
/* 132 */       return true;
/*     */     }
/* 134 */     if (!this.p.I && (this.n == null || this.n == par1EntityPlayer)) {
/*     */       
/* 136 */       par1EntityPlayer.a((lq)this);
/* 137 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 141 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int bb() {
/* 150 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SCPEntity111 spawnBabyAnimal(ln par1EntityAgeable) {
/* 158 */     return new SCPEntity111(this.p);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isWheat(ur par1ItemStack) {
/* 166 */     return (par1ItemStack != null && par1ItemStack.c == up.j.cj);
/*     */   }
/*     */ 
/*     */   
/*     */   public mv getAIControlledByPlayer() {
/* 171 */     return this.field_82184_d;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ln a(ln var1) {
/* 177 */     return (ln)spawnBabyAnimal(var1);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity111.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */