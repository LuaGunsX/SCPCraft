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
/*     */ public class oy
/*     */   extends ox
/*     */ {
/*     */   public boolean d = false;
/*  21 */   public float e = 0.0F;
/*  22 */   public float f = 0.0F;
/*     */   public float g;
/*     */   public float h;
/*  25 */   public float i = 1.0F;
/*     */ 
/*     */   
/*     */   public int j;
/*     */ 
/*     */   
/*     */   public oy(yc par1World) {
/*  32 */     super(par1World);
/*  33 */     this.aG = "/mob/chicken.png";
/*  34 */     a(0.3F, 0.7F);
/*  35 */     this.j = this.aa.nextInt(6000) + 6000;
/*  36 */     float var2 = 0.25F;
/*  37 */     this.bn.a(0, (nc)new mz((md)this));
/*  38 */     this.bn.a(1, (nc)new nt((mi)this, 0.38F));
/*  39 */     this.bn.a(2, (nc)new mu(this, var2));
/*  40 */     this.bn.a(3, (nc)new od((mi)this, 0.25F, up.S.cj, false));
/*  41 */     this.bn.a(4, (nc)new nb(this, 0.28F));
/*  42 */     this.bn.a(5, (nc)new nw((mi)this, var2));
/*  43 */     this.bn.a(6, (nc)new nh((md)this, qx.class, 6.0F));
/*  44 */     this.bn.a(7, (nc)new nv((md)this));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean be() {
/*  53 */     if (!this.isAggro) return true; 
/*  54 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  59 */     return 4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  68 */     super.c();
/*  69 */     this.h = this.e;
/*  70 */     this.g = this.f;
/*  71 */     this.f = (float)(this.f + (this.E ? -1 : 4) * 0.3D);
/*     */     
/*  73 */     if (this.f < 0.0F)
/*     */     {
/*  75 */       this.f = 0.0F;
/*     */     }
/*     */     
/*  78 */     if (this.f > 1.0F)
/*     */     {
/*  80 */       this.f = 1.0F;
/*     */     }
/*     */     
/*  83 */     if (!this.E && this.i < 1.0F)
/*     */     {
/*  85 */       this.i = 1.0F;
/*     */     }
/*     */     
/*  88 */     this.i = (float)(this.i * 0.9D);
/*     */     
/*  90 */     if (!this.E && this.x < 0.0D)
/*     */     {
/*  92 */       this.x *= 0.6D;
/*     */     }
/*     */     
/*  95 */     this.e += this.i * 2.0F;
/*     */     
/*  97 */     if (!h_() && !this.p.I && --this.j <= 0) {
/*     */       
/*  99 */       a("mob.chicken.plop", 1.0F, (this.aa.nextFloat() - this.aa.nextFloat()) * 0.2F + 1.0F);
/* 100 */       b(up.aP.cj, 1);
/* 101 */       this.j = this.aa.nextInt(6000) + 6000;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(float par1) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/* 115 */     return "mob.chicken.say";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/* 123 */     return "mob.chicken.hurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 131 */     return "mob.chicken.hurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(int par1, int par2, int par3, int par4) {
/* 139 */     a("mob.chicken.step", 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int bb() {
/* 147 */     return up.L.cj;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(boolean par1, int par2) {
/* 155 */     int var3 = this.aa.nextInt(3) + this.aa.nextInt(1 + par2);
/*     */     
/* 157 */     for (int var4 = 0; var4 < var3; var4++)
/*     */     {
/* 159 */       b(up.L.cj, 1);
/*     */     }
/*     */     
/* 162 */     if (af()) {
/*     */       
/* 164 */       b(up.bl.cj, 1);
/*     */     }
/*     */     else {
/*     */       
/* 168 */       b(up.bk.cj, 1);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public oy b(ln par1EntityAgeable) {
/* 177 */     return new oy(this.p);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c(ur par1ItemStack) {
/* 186 */     return (par1ItemStack != null && par1ItemStack.b() instanceof vh);
/*     */   }
/*     */ 
/*     */   
/*     */   public ln a(ln par1EntityAgeable) {
/* 191 */     return b(par1EntityAgeable);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/oy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */