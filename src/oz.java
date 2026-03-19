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
/*     */ public class oz
/*     */   extends ox
/*     */ {
/*     */   public oz(yc par1World) {
/*  21 */     super(par1World);
/*  22 */     this.aG = "/mob/cow.png";
/*  23 */     a(0.9F, 1.3F);
/*  24 */     az().a(true);
/*  25 */     this.bn.a(0, (nc)new mz((md)this));
/*  26 */     this.bn.a(1, (nc)new nt((mi)this, 0.38F));
/*  27 */     this.bn.a(2, (nc)new mu(this, 0.2F));
/*  28 */     this.bn.a(3, (nc)new od((mi)this, 0.25F, up.T.cj, false));
/*  29 */     this.bn.a(4, (nc)new nb(this, 0.25F));
/*  30 */     this.bn.a(5, (nc)new nw((mi)this, 0.2F));
/*  31 */     this.bn.a(6, (nc)new nh((md)this, qx.class, 6.0F));
/*  32 */     this.bn.a(7, (nc)new nv((md)this));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean be() {
/*  41 */     if (!this.isAggro) return true; 
/*  42 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  47 */     return 10;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/*  55 */     return "mob.cow.say";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/*  63 */     return "mob.cow.hurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/*  71 */     return "mob.cow.hurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(int par1, int par2, int par3, int par4) {
/*  79 */     a("mob.cow.step", 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float aX() {
/*  87 */     return 0.4F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int bb() {
/*  95 */     return up.aF.cj;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(boolean par1, int par2) {
/* 103 */     int var3 = this.aa.nextInt(3) + this.aa.nextInt(1 + par2);
/*     */     
/*     */     int var4;
/* 106 */     for (var4 = 0; var4 < var3; var4++)
/*     */     {
/* 108 */       b(up.aF.cj, 1);
/*     */     }
/*     */     
/* 111 */     var3 = this.aa.nextInt(3) + 1 + this.aa.nextInt(1 + par2);
/*     */     
/* 113 */     for (var4 = 0; var4 < var3; var4++) {
/*     */       
/* 115 */       if (af()) {
/*     */         
/* 117 */         b(up.bj.cj, 1);
/*     */       }
/*     */       else {
/*     */         
/* 121 */         b(up.bi.cj, 1);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/* 131 */     ur var2 = par1EntityPlayer.bJ.g();
/*     */     
/* 133 */     if (var2 != null && var2.c == up.aw.cj) {
/*     */       
/* 135 */       if (--var2.a <= 0) {
/*     */         
/* 137 */         par1EntityPlayer.bJ.a(par1EntityPlayer.bJ.c, new ur(up.aG));
/*     */       }
/* 139 */       else if (!par1EntityPlayer.bJ.a(new ur(up.aG))) {
/*     */         
/* 141 */         par1EntityPlayer.c(new ur(up.aG.cj, 1, 0));
/*     */       } 
/*     */       
/* 144 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 148 */     return super.a(par1EntityPlayer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public oz b(ln par1EntityAgeable) {
/* 157 */     return new oz(this.p);
/*     */   }
/*     */ 
/*     */   
/*     */   public ln a(ln par1EntityAgeable) {
/* 162 */     return b(par1EntityAgeable);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/oz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */