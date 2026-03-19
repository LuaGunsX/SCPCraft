/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class pd
/*     */   extends ox
/*     */ {
/*     */   private final mv d;
/*     */   
/*     */   public pd(yc par1World) {
/*  29 */     super(par1World);
/*  30 */     this.aG = "/mob/pig.png";
/*  31 */     a(0.9F, 0.9F);
/*  32 */     az().a(true);
/*  33 */     float var2 = 0.25F;
/*  34 */     this.bn.a(0, (nc)new mz((md)this));
/*  35 */     this.bn.a(1, (nc)new nt((mi)this, 0.38F));
/*  36 */     this.bn.a(2, (nc)(this.d = new mv((md)this, 0.34F)));
/*  37 */     this.bn.a(3, (nc)new mu(this, var2));
/*  38 */     this.bn.a(4, (nc)new od((mi)this, 0.3F, up.bR.cj, false));
/*  39 */     this.bn.a(4, (nc)new od((mi)this, 0.3F, up.bK.cj, false));
/*  40 */     this.bn.a(5, (nc)new nb(this, 0.28F));
/*  41 */     this.bn.a(6, (nc)new nw((mi)this, var2));
/*  42 */     this.bn.a(7, (nc)new nh((md)this, qx.class, 6.0F));
/*  43 */     this.bn.a(8, (nc)new nv((md)this));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean be() {
/*  52 */     if (!this.isAggro) return true; 
/*  53 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  58 */     return 10;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bl() {
/*  63 */     super.bl();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean bI() {
/*  72 */     ur var1 = ((qx)this.n).bD();
/*  73 */     return (var1 != null && var1.c == up.bR.cj);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/*  78 */     super.a();
/*  79 */     this.ag.a(16, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/*  87 */     super.b(par1NBTTagCompound);
/*  88 */     par1NBTTagCompound.a("Saddle", m());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/*  96 */     super.a(par1NBTTagCompound);
/*  97 */     f(par1NBTTagCompound.n("Saddle"));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/* 105 */     return "mob.pig.say";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/* 113 */     return "mob.pig.say";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 121 */     return "mob.pig.death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(int par1, int par2, int par3, int par4) {
/* 129 */     a("mob.pig.step", 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/* 137 */     if (super.a(par1EntityPlayer))
/*     */     {
/* 139 */       return true;
/*     */     }
/* 141 */     if (m() && !this.p.I && (this.n == null || this.n == par1EntityPlayer)) {
/*     */       
/* 143 */       par1EntityPlayer.a((lq)this);
/* 144 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 148 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int bb() {
/* 157 */     return af() ? up.ar.cj : up.aq.cj;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(boolean par1, int par2) {
/* 165 */     int var3 = this.aa.nextInt(3) + 1 + this.aa.nextInt(1 + par2);
/*     */     
/* 167 */     for (int var4 = 0; var4 < var3; var4++) {
/*     */       
/* 169 */       if (af()) {
/*     */         
/* 171 */         b(up.ar.cj, 1);
/*     */       }
/*     */       else {
/*     */         
/* 175 */         b(up.aq.cj, 1);
/*     */       } 
/*     */     } 
/*     */     
/* 179 */     if (m())
/*     */     {
/* 181 */       b(up.aA.cj, 1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean m() {
/* 190 */     return ((this.ag.a(16) & 0x1) != 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void f(boolean par1) {
/* 198 */     if (par1) {
/*     */       
/* 200 */       this.ag.b(16, Byte.valueOf((byte)1));
/*     */     }
/*     */     else {
/*     */       
/* 204 */       this.ag.b(16, Byte.valueOf((byte)0));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(pu par1EntityLightningBolt) {
/* 213 */     if (!this.p.I) {
/*     */       
/* 215 */       qk var2 = new qk(this.p);
/* 216 */       var2.b(this.t, this.u, this.v, this.z, this.A);
/* 217 */       this.p.d((lq)var2);
/* 218 */       x();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(float par1) {
/* 227 */     super.a(par1);
/*     */     
/* 229 */     if (par1 > 5.0F && this.n instanceof qx)
/*     */     {
/* 231 */       ((qx)this.n).a((jl)jh.u);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public pd b(ln par1EntityAgeable) {
/* 240 */     return new pd(this.p);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c(ur par1ItemStack) {
/* 249 */     return (par1ItemStack != null && par1ItemStack.c == up.bK.cj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public mv n() {
/* 257 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public ln a(ln par1EntityAgeable) {
/* 262 */     return b(par1EntityAgeable);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/pd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */