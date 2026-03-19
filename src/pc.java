/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class pc
/*     */   extends ml
/*     */ {
/*     */   private od e;
/*     */   
/*     */   public pc(yc par1World) {
/*  36 */     super(par1World);
/*  37 */     this.aG = "/mob/ozelot.png";
/*  38 */     a(0.6F, 0.8F);
/*  39 */     az().a(true);
/*  40 */     this.bn.a(1, (nc)new mz((md)this));
/*  41 */     this.bn.a(2, (nc)this.d);
/*  42 */     this.bn.a(3, (nc)(this.e = new od((mi)this, 0.18F, up.aU.cj, true)));
/*  43 */     this.bn.a(4, (nc)new mr((mi)this, qx.class, 16.0F, 0.23F, 0.4F));
/*  44 */     this.bn.a(5, (nc)new na(this, 0.3F, 10.0F, 5.0F));
/*  45 */     this.bn.a(6, (nc)new nq(this, 0.4F));
/*  46 */     this.bn.a(7, (nc)new ng((md)this, 0.3F));
/*  47 */     this.bn.a(8, (nc)new np((md)this));
/*  48 */     this.bn.a(9, (nc)new mu((ox)this, 0.23F));
/*  49 */     this.bn.a(10, (nc)new nw((mi)this, 0.23F));
/*  50 */     this.bn.a(11, (nc)new nh((md)this, qx.class, 10.0F));
/*  51 */     this.bo.a(1, (nc)new oj(this, oy.class, 14.0F, 750, false));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/*  56 */     super.a();
/*  57 */     this.ag.a(18, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void bm() {
/*  65 */     if (ax().a()) {
/*     */       
/*  67 */       float var1 = ax().b();
/*     */       
/*  69 */       if (var1 == 0.18F)
/*     */       {
/*  71 */         a(true);
/*  72 */         b(false);
/*     */       }
/*  74 */       else if (var1 == 0.4F)
/*     */       {
/*  76 */         a(false);
/*  77 */         b(true);
/*     */       }
/*     */       else
/*     */       {
/*  81 */         a(false);
/*  82 */         b(false);
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/*  87 */       a(false);
/*  88 */       b(false);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/*  97 */     return !m();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public String O() {
/* 107 */     switch (t()) {
/*     */       
/*     */       case 0:
/* 110 */         return "/mob/ozelot.png";
/*     */       case 1:
/* 112 */         return "/mob/cat_black.png";
/*     */       case 2:
/* 114 */         return "/mob/cat_red.png";
/*     */       case 3:
/* 116 */         return "/mob/cat_siamese.png";
/*     */     } 
/* 118 */     return super.O();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean be() {
/* 128 */     if (!this.isAggro) return true; 
/* 129 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/* 134 */     return 10;
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
/*     */   public void b(bq par1NBTTagCompound) {
/* 147 */     super.b(par1NBTTagCompound);
/* 148 */     par1NBTTagCompound.a("CatType", t());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/* 156 */     super.a(par1NBTTagCompound);
/* 157 */     s(par1NBTTagCompound.e("CatType"));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/* 165 */     return m() ? (r() ? "mob.cat.purr" : ((this.aa.nextInt(4) == 0) ? "mob.cat.purreow" : "mob.cat.meow")) : "";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/* 173 */     return "mob.cat.hitt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 181 */     return "mob.cat.hitt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float aX() {
/* 189 */     return 0.4F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int bb() {
/* 197 */     return up.aF.cj;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m(lq par1Entity) {
/* 202 */     return par1Entity.a(lh.a((md)this), 3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(lh par1DamageSource, int par2) {
/* 210 */     if (ar())
/*     */     {
/* 212 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 216 */     this.d.a(false);
/* 217 */     return super.a(par1DamageSource, par2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(boolean par1, int par2) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/* 231 */     ur var2 = par1EntityPlayer.bJ.g();
/*     */     
/* 233 */     if (m()) {
/*     */       
/* 235 */       if (par1EntityPlayer.bR.equalsIgnoreCase(o()) && !this.p.I && !c(var2))
/*     */       {
/* 237 */         this.d.a(!n());
/*     */       }
/*     */     }
/* 240 */     else if (this.e.f() && var2 != null && var2.c == up.aU.cj && par1EntityPlayer.e((lq)this) < 9.0D) {
/*     */       
/* 242 */       if (!par1EntityPlayer.cd.d)
/*     */       {
/* 244 */         var2.a--;
/*     */       }
/*     */       
/* 247 */       if (var2.a <= 0)
/*     */       {
/* 249 */         par1EntityPlayer.bJ.a(par1EntityPlayer.bJ.c, (ur)null);
/*     */       }
/*     */       
/* 252 */       if (!this.p.I)
/*     */       {
/* 254 */         if (this.aa.nextInt(3) == 0) {
/*     */           
/* 256 */           g(true);
/* 257 */           s(1 + this.p.t.nextInt(3));
/* 258 */           a(par1EntityPlayer.bR);
/* 259 */           f(true);
/* 260 */           this.d.a(true);
/* 261 */           this.p.a((lq)this, (byte)7);
/*     */         }
/*     */         else {
/*     */           
/* 265 */           f(false);
/* 266 */           this.p.a((lq)this, (byte)6);
/*     */         } 
/*     */       }
/*     */       
/* 270 */       return true;
/*     */     } 
/*     */     
/* 273 */     return super.a(par1EntityPlayer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public pc b(ln par1EntityAgeable) {
/* 281 */     pc var2 = new pc(this.p);
/*     */     
/* 283 */     if (m()) {
/*     */       
/* 285 */       var2.a(o());
/* 286 */       var2.g(true);
/* 287 */       var2.s(t());
/*     */     } 
/*     */     
/* 290 */     return var2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c(ur par1ItemStack) {
/* 299 */     return (par1ItemStack != null && par1ItemStack.c == up.aU.cj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(ox par1EntityAnimal) {
/* 307 */     if (par1EntityAnimal == this)
/*     */     {
/* 309 */       return false;
/*     */     }
/* 311 */     if (!m())
/*     */     {
/* 313 */       return false;
/*     */     }
/* 315 */     if (!(par1EntityAnimal instanceof pc))
/*     */     {
/* 317 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 321 */     pc var2 = (pc)par1EntityAnimal;
/* 322 */     return !var2.m() ? false : ((r() && var2.r()));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int t() {
/* 328 */     return this.ag.a(18);
/*     */   }
/*     */ 
/*     */   
/*     */   public void s(int par1) {
/* 333 */     this.ag.b(18, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean bs() {
/* 341 */     if (this.p.t.nextInt(3) == 0)
/*     */     {
/* 343 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 347 */     if (this.p.b(this.D) && this.p.a((lq)this, this.D).isEmpty() && !this.p.d(this.D)) {
/*     */       
/* 349 */       int var1 = ke.c(this.t);
/* 350 */       int var2 = ke.c(this.D.b);
/* 351 */       int var3 = ke.c(this.v);
/*     */       
/* 353 */       if (var2 < 63)
/*     */       {
/* 355 */         return false;
/*     */       }
/*     */       
/* 358 */       int var4 = this.p.a(var1, var2 - 1, var3);
/* 359 */       amq block = amq.p[var4];
/*     */       
/* 361 */       if (var4 == amq.x.cm || (block != null && block.isLeaves(this.p, var1, var2 - 1, var3)))
/*     */       {
/* 363 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 367 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String an() {
/* 376 */     return m() ? "entity.Cat.name" : super.an();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void bG() {
/* 384 */     if (this.p.t.nextInt(7) == 0)
/*     */     {
/* 386 */       for (int var1 = 0; var1 < 2; var1++) {
/*     */         
/* 388 */         pc var2 = new pc(this.p);
/* 389 */         var2.b(this.t, this.u, this.v, this.z, 0.0F);
/* 390 */         var2.a(-24000);
/* 391 */         this.p.d((lq)var2);
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public ln a(ln par1EntityAgeable) {
/* 398 */     return (ln)b(par1EntityAgeable);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/pc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */