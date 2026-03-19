/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import bq;
/*     */ import java.util.Random;
/*     */ import ke;
/*     */ import lm;
/*     */ import ln;
/*     */ import lq;
/*     */ import md;
/*     */ import mi;
/*     */ import mu;
/*     */ import mz;
/*     */ import nb;
/*     */ import nc;
/*     */ import nh;
/*     */ import nt;
/*     */ import nv;
/*     */ import nw;
/*     */ import od;
/*     */ import ox;
/*     */ import px;
/*     */ import qx;
/*     */ import up;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ public class SCPEntity594
/*     */   extends ox
/*     */ {
/*     */   private int sheepTimer;
/*     */   public boolean field_70885_d = false;
/*  34 */   public float field_70886_e = 0.0F;
/*  35 */   public float destPos = 0.0F;
/*     */   public float field_70884_g;
/*     */   public float field_70888_h;
/*  38 */   public float field_70889_i = 1.0F;
/*     */ 
/*     */ 
/*     */   
/*     */   public SCPEntity594(yc par1World) {
/*  43 */     super(par1World);
/*  44 */     this.aG = "/SCPCraft/textures/mobs/594Unsheered.png";
/*  45 */     a(1.0F, 1.3F);
/*  46 */     float var2 = 0.23F;
/*  47 */     az().a(true);
/*  48 */     this.bn.a(0, (nc)new mz((md)this));
/*  49 */     this.bn.a(1, (nc)new nt((mi)this, 0.38F));
/*  50 */     this.bn.a(2, (nc)new mu(this, var2));
/*  51 */     this.bn.a(3, (nc)new od((mi)this, 0.25F, up.T.cj, false));
/*  52 */     this.bn.a(4, (nc)new nb(this, 0.25F));
/*  53 */     this.bn.a(6, (nc)new nw((mi)this, var2));
/*  54 */     this.bn.a(7, (nc)new nh((md)this, qx.class, 6.0F));
/*  55 */     this.bn.a(8, (nc)new nv((md)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public SCPEnumCreatureAttribute getSCPAttribute() {
/*  60 */     return SCPEnumCreatureAttribute.SCP;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean be() {
/*  68 */     if (!this.isAggro) return true; 
/*  69 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bl() {
/*  74 */     super.bl();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  83 */     super.c();
/*  84 */     this.field_70888_h = this.field_70886_e;
/*  85 */     this.field_70884_g = this.destPos;
/*  86 */     this.destPos = (float)(this.destPos + (this.E ? -1 : 4) * 0.3D);
/*  87 */     for (int var3 = 0; var3 < 16; var3++) {
/*     */       
/*  89 */       float var1 = (float)this.D.b;
/*  90 */       float var4 = (this.aa.nextFloat() * 2.0F - 1.0F) * this.N * 0.5F;
/*  91 */       float var5 = (this.aa.nextFloat() * 2.0F - 1.0F) * this.N * 0.5F;
/*     */     } 
/*  93 */     if (this.destPos < 0.0F)
/*     */     {
/*  95 */       this.destPos = 0.0F;
/*     */     }
/*     */     
/*  98 */     if (this.destPos > 1.0F)
/*     */     {
/* 100 */       this.destPos = 1.0F;
/*     */     }
/*     */ 
/*     */     
/* 104 */     if (!this.E && this.field_70889_i < 1.0F)
/*     */     {
/* 106 */       this.field_70889_i = 1.0F;
/*     */     }
/*     */     
/* 109 */     this.field_70889_i = (float)(this.field_70889_i * 0.9D);
/*     */     
/* 111 */     if (!this.E && this.x < 0.0D)
/*     */     {
/* 113 */       this.x *= 0.6D;
/*     */     }
/*     */     
/* 116 */     this.field_70886_e += this.field_70889_i * 2.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int aT() {
/* 122 */     return 16;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c_(qx par1EntityPlayer) {
/* 127 */     byte var2 = 0;
/* 128 */     if (this.p.s == 1) { var2 = 3; }
/* 129 */     else if (this.p.s == 2) { var2 = 7; }
/* 130 */     else if (this.p.s == 3) { var2 = 15; }
/* 131 */     else if (this.p.s == 0) { var2 = 0; }
/*     */     
/* 133 */     if (var2 > 0)
/*     */     {
/* 135 */       par1EntityPlayer.d(new lm(mod_SCP.electricity.H, 10 * var2, 1));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/* 141 */     super.a();
/* 142 */     this.ag.a(16, new Byte((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(byte par1) {
/* 147 */     if (par1 == 10) {
/*     */       
/* 149 */       this.sheepTimer = 40;
/*     */     }
/*     */     else {
/*     */       
/* 153 */       super.a(par1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public float func_70894_j(float par1) {
/* 159 */     return (this.sheepTimer <= 0) ? 0.0F : ((this.sheepTimer >= 4 && this.sheepTimer <= 36) ? 1.0F : ((this.sheepTimer < 4) ? ((this.sheepTimer - par1) / 4.0F) : (-((this.sheepTimer - 40) - par1) / 4.0F)));
/*     */   }
/*     */ 
/*     */   
/*     */   public float func_70890_k(float par1) {
/* 164 */     if (this.sheepTimer > 4 && this.sheepTimer <= 36) {
/*     */       
/* 166 */       float var2 = ((this.sheepTimer - 4) - par1) / 32.0F;
/* 167 */       return 0.62831855F + 0.2199115F * ke.a(var2 * 28.7F);
/*     */     } 
/*     */ 
/*     */     
/* 171 */     return (this.sheepTimer > 0) ? 0.62831855F : (this.A / 57.295776F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(float par1) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/* 182 */     ur var2 = par1EntityPlayer.bJ.g();
/*     */     
/* 184 */     if (var2 != null && var2.c == up.be.cj && !getSheared() && !h_()) {
/*     */       
/* 186 */       if (!this.p.I) {
/*     */         
/* 188 */         x();
/* 189 */         int var3 = 1 + this.aa.nextInt(3);
/*     */         
/* 191 */         for (int var4 = 0; var4 < var3; var4++) {
/*     */           
/* 193 */           px var5 = a(new ur(mod_SCP.ElectricWool.cm, 1, getFleeceColor()), 1.0F);
/* 194 */           var5.x += (this.aa.nextFloat() * 0.05F);
/* 195 */           var5.w += ((this.aa.nextFloat() - this.aa.nextFloat()) * 0.1F);
/* 196 */           var5.y += ((this.aa.nextFloat() - this.aa.nextFloat()) * 0.1F);
/*     */         } 
/*     */         
/* 199 */         if (!this.p.I) {
/*     */           
/* 201 */           ur itemstack = par1EntityPlayer.bJ.b[2];
/* 202 */           if (itemstack != null && itemstack.c == mod_SCP.ClassDShirt.cj) {
/*     */             
/* 204 */             SCPEntity594Naked var10 = new SCPEntity594Naked(this.p);
/* 205 */             var10.b(this.t, this.u, this.v, this.z, this.A);
/* 206 */             var10.j(aU());
/* 207 */             var10.ax = this.ax;
/* 208 */             this.p.d((lq)var10);
/*     */           }
/*     */           else {
/*     */             
/* 212 */             SCPEntity594Naked var10 = new SCPEntity594Naked(this.p);
/* 213 */             var10.b(this.t, this.u, this.v, this.z, this.A);
/* 214 */             var10.j(aU());
/* 215 */             var10.ax = this.ax;
/* 216 */             this.p.d((lq)var10);
/* 217 */             par1EntityPlayer.d(new lm(mod_SCP.electricity.H, 35, 0));
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 222 */       var2.a(1, (md)par1EntityPlayer);
/*     */     } 
/*     */     
/* 225 */     return super.a(par1EntityPlayer);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/* 230 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/* 238 */     super.b(par1NBTTagCompound);
/* 239 */     par1NBTTagCompound.a("Sheared", getSheared());
/* 240 */     par1NBTTagCompound.a("Color", (byte)getFleeceColor());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/* 248 */     super.a(par1NBTTagCompound);
/* 249 */     setSheared(par1NBTTagCompound.n("Sheared"));
/* 250 */     setFleeceColor(par1NBTTagCompound.c("Color"));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/* 258 */     return "mob.sheep";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/* 266 */     return "mob.sheep";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 274 */     return "mob.sheep";
/*     */   }
/*     */ 
/*     */   
/*     */   public int getFleeceColor() {
/* 279 */     return this.ag.a(16) & 0xF;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFleeceColor(int par1) {
/* 284 */     byte var2 = this.ag.a(16);
/* 285 */     this.ag.b(16, Byte.valueOf((byte)(var2 & 0xF0 | par1 & 0xF)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getSheared() {
/* 293 */     return ((this.ag.a(16) & 0x10) != 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSheared(boolean par1) {
/* 301 */     byte var2 = this.ag.a(16);
/*     */     
/* 303 */     if (par1) {
/*     */       
/* 305 */       this.ag.b(16, Byte.valueOf((byte)(var2 | 0x10)));
/*     */     }
/*     */     else {
/*     */       
/* 309 */       this.ag.b(16, Byte.valueOf((byte)(var2 & 0xFFFFFFEF)));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getRandomFleeceColor(Random par0Random) {
/* 318 */     int var1 = par0Random.nextInt(100);
/* 319 */     return (var1 < 5) ? 15 : ((var1 < 10) ? 7 : ((var1 < 15) ? 8 : ((var1 < 18) ? 12 : ((par0Random.nextInt(500) == 0) ? 6 : 0))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ox spawnBabyAnimal(ox par1EntityAnimal) {
/* 327 */     SCPEntity594 var2 = (SCPEntity594)par1EntityAnimal;
/* 328 */     SCPEntity594 var3 = new SCPEntity594(this.p);
/*     */     
/* 330 */     if (this.aa.nextBoolean()) {
/*     */       
/* 332 */       var3.setFleeceColor(getFleeceColor());
/*     */     }
/*     */     else {
/*     */       
/* 336 */       var3.setFleeceColor(var2.getFleeceColor());
/*     */     } 
/*     */     
/* 339 */     return var3;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void aH() {
/* 348 */     setSheared(false);
/*     */     
/* 350 */     if (h_()) {
/*     */       
/* 352 */       int var1 = b() + 1200;
/*     */       
/* 354 */       if (var1 > 0)
/*     */       {
/* 356 */         var1 = 0;
/*     */       }
/*     */       
/* 359 */       a(var1);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ln a(ln var1) {
/* 366 */     return null;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity594.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */