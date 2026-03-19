/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import bq;
/*     */ import ke;
/*     */ import ll;
/*     */ import lm;
/*     */ import lq;
/*     */ import md;
/*     */ import qe;
/*     */ import qx;
/*     */ import up;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity999
/*     */   extends md
/*     */   implements qe {
/*     */   public float field_70813_a;
/*     */   public float field_70811_b;
/*     */   public float field_70812_c;
/*  20 */   private int slimeJumpDelay = 0;
/*     */ 
/*     */   
/*     */   public SCPEntity999(yc par1World) {
/*  24 */     super(par1World);
/*  25 */     this.aG = "/SCPCraft/textures/mobs/999.png";
/*  26 */     this.M = 0.0F;
/*  27 */     this.slimeJumpDelay = this.aa.nextInt(20) + 10;
/*  28 */     setSlimeSize(3);
/*     */   }
/*     */ 
/*     */   
/*     */   public SCPEnumCreatureAttribute getSCPAttribute() {
/*  33 */     return SCPEnumCreatureAttribute.SCP;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/*  38 */     super.a();
/*  39 */     this.ag.a(16, new Byte((byte)1));
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSlimeSize(int par1) {
/*  44 */     this.ag.b(16, new Byte((byte)par1));
/*  45 */     a(0.6F * par1, 0.6F * par1);
/*  46 */     b(this.t, this.u, this.v);
/*  47 */     j(aT());
/*  48 */     this.bd = par1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  53 */     int var1 = getSlimeSize();
/*  54 */     return var1 * var1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSlimeSize() {
/*  62 */     return this.ag.a(16);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/*  70 */     super.b(par1NBTTagCompound);
/*  71 */     par1NBTTagCompound.a("Size", getSlimeSize() - 1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/*  79 */     super.a(par1NBTTagCompound);
/*  80 */     setSlimeSize(par1NBTTagCompound.e("Size") + 1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String getSlimeParticle() {
/*  88 */     return "orange";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String getJumpSound() {
/*  96 */     return "mob.slime";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void j_() {
/* 104 */     this.field_70811_b += (this.field_70813_a - this.field_70811_b) * 0.5F;
/* 105 */     this.field_70812_c = this.field_70811_b;
/* 106 */     boolean var1 = this.E;
/* 107 */     super.j_();
/*     */     
/* 109 */     if (this.E && !var1) {
/*     */       
/* 111 */       int var2 = getSlimeSize();
/*     */       
/* 113 */       for (int var3 = 0; var3 < var2 * 8; var3++) {
/*     */         
/* 115 */         float var4 = this.aa.nextFloat() * 3.1415927F * 2.0F;
/* 116 */         float var5 = this.aa.nextFloat() * 0.5F + 0.5F;
/* 117 */         float var6 = ke.a(var4) * var2 * 0.5F * var5;
/* 118 */         float var7 = ke.b(var4) * var2 * 0.5F * var5;
/* 119 */         this.p.a(getSlimeParticle(), this.t + var6, this.D.b, this.v + var7, 0.0D, 0.0D, 0.0D);
/*     */       } 
/*     */       
/* 122 */       if (makesSoundOnLand())
/*     */       {
/* 124 */         this.p.a((lq)this, getJumpSound(), aX(), ((this.aa.nextFloat() - this.aa.nextFloat()) * 0.2F + 1.0F) / 0.8F);
/*     */       }
/*     */       
/* 127 */       this.field_70813_a = -0.5F;
/*     */     }
/* 129 */     else if (!this.E && var1) {
/*     */       
/* 131 */       this.field_70813_a = 1.0F;
/*     */     } 
/*     */     
/* 134 */     func_70808_l();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bn() {
/* 139 */     qx var1 = this.p.b((lq)this, 16.0D);
/*     */     
/* 141 */     if (var1 != null)
/*     */     {
/* 143 */       a((lq)var1, 10.0F, 20.0F);
/*     */     }
/*     */     
/* 146 */     if (this.E && this.slimeJumpDelay-- <= 0) {
/*     */       
/* 148 */       this.slimeJumpDelay = getJumpDelay();
/*     */       
/* 150 */       if (var1 != null)
/*     */       {
/* 152 */         this.slimeJumpDelay /= 3;
/*     */       }
/*     */       
/* 155 */       this.bF = true;
/*     */       
/* 157 */       if (makesSoundOnJump())
/*     */       {
/* 159 */         this.p.a((lq)this, getJumpSound(), aX(), ((this.aa.nextFloat() - this.aa.nextFloat()) * 0.2F + 1.0F) * 0.8F);
/*     */       }
/*     */       
/* 162 */       this.bC = 1.0F - this.aa.nextFloat() * 2.0F;
/* 163 */       this.bD = (1 * getSlimeSize());
/*     */     }
/*     */     else {
/*     */       
/* 167 */       this.bF = false;
/*     */       
/* 169 */       if (this.E)
/*     */       {
/* 171 */         this.bC = this.bD = 0.0F;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70808_l() {
/* 178 */     this.field_70813_a *= 0.6F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int getJumpDelay() {
/* 186 */     return this.aa.nextInt(20) + 10;
/*     */   }
/*     */ 
/*     */   
/*     */   protected SCPEntity999 createInstance() {
/* 191 */     return new SCPEntity999(this.p);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void x() {
/* 199 */     int var1 = getSlimeSize();
/*     */     
/* 201 */     if (!this.p.I && var1 > 1 && aU() <= 0) {
/*     */       
/* 203 */       int var2 = 2 + this.aa.nextInt(3);
/*     */       
/* 205 */       for (int var3 = 0; var3 < var2; var3++) {
/*     */         
/* 207 */         float var4 = ((var3 % 2) - 0.5F) * var1 / 4.0F;
/* 208 */         float var5 = ((var3 / 2) - 0.5F) * var1 / 4.0F;
/* 209 */         SCPEntity999 var6 = createInstance();
/* 210 */         var6.setSlimeSize(var1 / 2);
/* 211 */         var6.b(this.t + var4, this.u + 0.5D, this.v + var5, this.aa.nextFloat() * 360.0F, 0.0F);
/* 212 */         this.p.d((lq)var6);
/*     */       } 
/*     */     } 
/*     */     
/* 216 */     super.x();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c_(qx par1EntityPlayer) {
/* 224 */     par1EntityPlayer.d(new lm(ll.h.H, 10, 0));
/* 225 */     par1EntityPlayer.d(new lm(ll.k.H, 80, 1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean canDamagePlayer() {
/* 233 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int getAttackStrength() {
/* 241 */     return getSlimeSize();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/* 249 */     return "mob.slime";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 257 */     return "mob.slime";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int bb() {
/* 265 */     return (getSlimeSize() == 1) ? up.bx.cj : 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float aX() {
/* 273 */     return 0.4F * getSlimeSize();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int bp() {
/* 282 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean makesSoundOnJump() {
/* 290 */     return (getSlimeSize() > 1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean makesSoundOnLand() {
/* 298 */     return (getSlimeSize() > 2);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity999.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */