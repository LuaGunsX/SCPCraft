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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class pk
/*     */   extends ml
/*     */ {
/*     */   private float e;
/*     */   private float f;
/*     */   private boolean g;
/*     */   private boolean h;
/*     */   private float i;
/*     */   private float j;
/*     */   
/*     */   public pk(yc par1World) {
/*  50 */     super(par1World);
/*  51 */     this.aG = "/mob/wolf.png";
/*  52 */     a(0.6F, 0.8F);
/*  53 */     this.bH = 0.3F;
/*  54 */     az().a(true);
/*  55 */     this.bn.a(1, (nc)new mz((md)this));
/*  56 */     this.bn.a(2, (nc)this.d);
/*  57 */     this.bn.a(3, (nc)new ng((md)this, 0.4F));
/*  58 */     this.bn.a(4, (nc)new nk((md)this, this.bH, true));
/*  59 */     this.bn.a(5, (nc)new na(this, this.bH, 10.0F, 2.0F));
/*  60 */     this.bn.a(6, (nc)new mu((ox)this, this.bH));
/*  61 */     this.bn.a(7, (nc)new nw((mi)this, this.bH));
/*  62 */     this.bn.a(8, (nc)new ms(this, 8.0F));
/*  63 */     this.bn.a(9, (nc)new nh((md)this, qx.class, 8.0F));
/*  64 */     this.bn.a(9, (nc)new nv((md)this));
/*  65 */     this.bo.a(1, (nc)new ok(this));
/*  66 */     this.bo.a(2, (nc)new ol(this));
/*  67 */     this.bo.a(3, (nc)new og((md)this, true));
/*  68 */     this.bo.a(4, (nc)new oj(this, pe.class, 16.0F, 200, false));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean be() {
/*  77 */     if (!this.isAggro) return true; 
/*  78 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(md par1EntityLiving) {
/*  86 */     super.b(par1EntityLiving);
/*     */     
/*  88 */     if (par1EntityLiving instanceof qx)
/*     */     {
/*  90 */       i(true);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void bm() {
/*  99 */     this.ag.b(18, Integer.valueOf(aU()));
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/* 104 */     return m() ? 20 : 8;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/* 109 */     super.a();
/* 110 */     this.ag.a(18, new Integer(aU()));
/* 111 */     this.ag.a(19, new Byte((byte)0));
/* 112 */     this.ag.a(20, new Byte((byte)ajm.e_(1)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(int par1, int par2, int par3, int par4) {
/* 120 */     a("mob.wolf.step", 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public String O() {
/* 130 */     return m() ? "/mob/wolf_tame.png" : (bK() ? "/mob/wolf_angry.png" : super.O());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/* 138 */     super.b(par1NBTTagCompound);
/* 139 */     par1NBTTagCompound.a("Angry", bK());
/* 140 */     par1NBTTagCompound.a("CollarColor", (byte)bL());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/* 148 */     super.a(par1NBTTagCompound);
/* 149 */     i(par1NBTTagCompound.n("Angry"));
/*     */     
/* 151 */     if (par1NBTTagCompound.b("CollarColor"))
/*     */     {
/* 153 */       s(par1NBTTagCompound.c("CollarColor"));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/* 162 */     return bK();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/* 170 */     return bK() ? "mob.wolf.growl" : ((this.aa.nextInt(3) == 0) ? ((m() && this.ag.c(18) < 10) ? "mob.wolf.whine" : "mob.wolf.panting") : "mob.wolf.bark");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/* 178 */     return "mob.wolf.hurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 186 */     return "mob.wolf.death";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float aX() {
/* 194 */     return 0.4F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int bb() {
/* 202 */     return -1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/* 211 */     super.c();
/*     */     
/* 213 */     if (!this.p.I && this.g && !this.h && !k() && this.E) {
/*     */       
/* 215 */       this.h = true;
/* 216 */       this.i = 0.0F;
/* 217 */       this.j = 0.0F;
/* 218 */       this.p.a((lq)this, (byte)8);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void j_() {
/* 227 */     super.j_();
/* 228 */     this.f = this.e;
/*     */     
/* 230 */     if (bM()) {
/*     */       
/* 232 */       this.e += (1.0F - this.e) * 0.4F;
/*     */     }
/*     */     else {
/*     */       
/* 236 */       this.e += (0.0F - this.e) * 0.4F;
/*     */     } 
/*     */     
/* 239 */     if (bM())
/*     */     {
/* 241 */       this.bI = 10;
/*     */     }
/*     */     
/* 244 */     if (G()) {
/*     */       
/* 246 */       this.g = true;
/* 247 */       this.h = false;
/* 248 */       this.i = 0.0F;
/* 249 */       this.j = 0.0F;
/*     */     }
/* 251 */     else if ((this.g || this.h) && this.h) {
/*     */       
/* 253 */       if (this.i == 0.0F)
/*     */       {
/* 255 */         a("mob.wolf.shake", aX(), (this.aa.nextFloat() - this.aa.nextFloat()) * 0.2F + 1.0F);
/*     */       }
/*     */       
/* 258 */       this.j = this.i;
/* 259 */       this.i += 0.05F;
/*     */       
/* 261 */       if (this.j >= 2.0F) {
/*     */         
/* 263 */         this.g = false;
/* 264 */         this.h = false;
/* 265 */         this.j = 0.0F;
/* 266 */         this.i = 0.0F;
/*     */       } 
/*     */       
/* 269 */       if (this.i > 0.4F) {
/*     */         
/* 271 */         float var1 = (float)this.D.b;
/* 272 */         int var2 = (int)(ke.a((this.i - 0.4F) * 3.1415927F) * 7.0F);
/*     */         
/* 274 */         for (int var3 = 0; var3 < var2; var3++) {
/*     */           
/* 276 */           float var4 = (this.aa.nextFloat() * 2.0F - 1.0F) * this.N * 0.5F;
/* 277 */           float var5 = (this.aa.nextFloat() * 2.0F - 1.0F) * this.N * 0.5F;
/* 278 */           this.p.a("splash", this.t + var4, (var1 + 0.8F), this.v + var5, this.w, this.x, this.y);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public boolean t() {
/* 287 */     return this.g;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public float j(float par1) {
/* 297 */     return 0.75F + (this.j + (this.i - this.j) * par1) / 2.0F * 0.25F;
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public float f(float par1, float par2) {
/* 303 */     float var3 = (this.j + (this.i - this.j) * par1 + par2) / 1.8F;
/*     */     
/* 305 */     if (var3 < 0.0F) {
/*     */       
/* 307 */       var3 = 0.0F;
/*     */     }
/* 309 */     else if (var3 > 1.0F) {
/*     */       
/* 311 */       var3 = 1.0F;
/*     */     } 
/*     */     
/* 314 */     return ke.a(var3 * 3.1415927F) * ke.a(var3 * 3.1415927F * 11.0F) * 0.15F * 3.1415927F;
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public float k(float par1) {
/* 320 */     return (this.f + (this.e - this.f) * par1) * 0.15F * 3.1415927F;
/*     */   }
/*     */ 
/*     */   
/*     */   public float e() {
/* 325 */     return this.O * 0.8F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int bp() {
/* 334 */     return n() ? 20 : super.bp();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(lh par1DamageSource, int par2) {
/* 342 */     if (ar())
/*     */     {
/* 344 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 348 */     lq var3 = par1DamageSource.g();
/* 349 */     this.d.a(false);
/*     */     
/* 351 */     if (var3 != null && !(var3 instanceof qx) && !(var3 instanceof qz))
/*     */     {
/* 353 */       par2 = (par2 + 1) / 2;
/*     */     }
/*     */     
/* 356 */     return super.a(par1DamageSource, par2);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean m(lq par1Entity) {
/* 362 */     int var2 = m() ? 4 : 2;
/* 363 */     return par1Entity.a(lh.a((md)this), var2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/* 371 */     ur var2 = par1EntityPlayer.bJ.g();
/*     */     
/* 373 */     if (m()) {
/*     */       
/* 375 */       if (var2 != null)
/*     */       {
/* 377 */         if (up.e[var2.c] instanceof uk) {
/*     */           
/* 379 */           uk var3 = (uk)up.e[var2.c];
/*     */           
/* 381 */           if (var3.i() && this.ag.c(18) < 20)
/*     */           {
/* 383 */             if (!par1EntityPlayer.cd.d)
/*     */             {
/* 385 */               var2.a--;
/*     */             }
/*     */             
/* 388 */             i(var3.g());
/*     */             
/* 390 */             if (var2.a <= 0)
/*     */             {
/* 392 */               par1EntityPlayer.bJ.a(par1EntityPlayer.bJ.c, (ur)null);
/*     */             }
/*     */             
/* 395 */             return true;
/*     */           }
/*     */         
/* 398 */         } else if (var2.c == up.aW.cj) {
/*     */           
/* 400 */           int var4 = ajm.e_(var2.j());
/*     */           
/* 402 */           if (var4 != bL()) {
/*     */             
/* 404 */             s(var4);
/*     */             
/* 406 */             if (!par1EntityPlayer.cd.d && --var2.a <= 0)
/*     */             {
/* 408 */               par1EntityPlayer.bJ.a(par1EntityPlayer.bJ.c, (ur)null);
/*     */             }
/*     */             
/* 411 */             return true;
/*     */           } 
/*     */         } 
/*     */       }
/*     */       
/* 416 */       if (par1EntityPlayer.bR.equalsIgnoreCase(o()) && !this.p.I && !c(var2))
/*     */       {
/* 418 */         this.d.a(!n());
/* 419 */         this.bF = false;
/* 420 */         a((ahl)null);
/*     */       }
/*     */     
/* 423 */     } else if (var2 != null && var2.c == up.aX.cj && !bK()) {
/*     */       
/* 425 */       if (!par1EntityPlayer.cd.d)
/*     */       {
/* 427 */         var2.a--;
/*     */       }
/*     */       
/* 430 */       if (var2.a <= 0)
/*     */       {
/* 432 */         par1EntityPlayer.bJ.a(par1EntityPlayer.bJ.c, (ur)null);
/*     */       }
/*     */       
/* 435 */       if (!this.p.I)
/*     */       {
/* 437 */         if (this.aa.nextInt(3) == 0) {
/*     */           
/* 439 */           g(true);
/* 440 */           a((ahl)null);
/* 441 */           b((md)null);
/* 442 */           this.d.a(true);
/* 443 */           j(20);
/* 444 */           a(par1EntityPlayer.bR);
/* 445 */           f(true);
/* 446 */           this.p.a((lq)this, (byte)7);
/*     */         }
/*     */         else {
/*     */           
/* 450 */           f(false);
/* 451 */           this.p.a((lq)this, (byte)6);
/*     */         } 
/*     */       }
/*     */       
/* 455 */       return true;
/*     */     } 
/*     */     
/* 458 */     return super.a(par1EntityPlayer);
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void a(byte par1) {
/* 464 */     if (par1 == 8) {
/*     */       
/* 466 */       this.h = true;
/* 467 */       this.i = 0.0F;
/* 468 */       this.j = 0.0F;
/*     */     }
/*     */     else {
/*     */       
/* 472 */       super.a(par1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public float u() {
/* 479 */     return bK() ? 1.5393804F : (m() ? ((0.55F - (20 - this.ag.c(18)) * 0.02F) * 3.1415927F) : 0.62831855F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c(ur par1ItemStack) {
/* 488 */     return (par1ItemStack == null) ? false : (!(up.e[par1ItemStack.c] instanceof uk) ? false : ((uk)up.e[par1ItemStack.c]).i());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int bv() {
/* 496 */     return 8;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean bK() {
/* 504 */     return ((this.ag.a(16) & 0x2) != 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void i(boolean par1) {
/* 512 */     byte var2 = this.ag.a(16);
/*     */     
/* 514 */     if (par1) {
/*     */       
/* 516 */       this.ag.b(16, Byte.valueOf((byte)(var2 | 0x2)));
/*     */     }
/*     */     else {
/*     */       
/* 520 */       this.ag.b(16, Byte.valueOf((byte)(var2 & 0xFFFFFFFD)));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int bL() {
/* 529 */     return this.ag.a(20) & 0xF;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void s(int par1) {
/* 537 */     this.ag.b(20, Byte.valueOf((byte)(par1 & 0xF)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public pk b(ln par1EntityAgeable) {
/* 545 */     pk var2 = new pk(this.p);
/* 546 */     String var3 = o();
/*     */     
/* 548 */     if (var3 != null && var3.trim().length() > 0) {
/*     */       
/* 550 */       var2.a(var3);
/* 551 */       var2.g(true);
/*     */     } 
/*     */     
/* 554 */     return var2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void j(boolean par1) {
/* 559 */     byte var2 = this.ag.a(19);
/*     */     
/* 561 */     if (par1) {
/*     */       
/* 563 */       this.ag.b(19, Byte.valueOf((byte)1));
/*     */     }
/*     */     else {
/*     */       
/* 567 */       this.ag.b(19, Byte.valueOf((byte)0));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(ox par1EntityAnimal) {
/* 576 */     if (par1EntityAnimal == this)
/*     */     {
/* 578 */       return false;
/*     */     }
/* 580 */     if (!m())
/*     */     {
/* 582 */       return false;
/*     */     }
/* 584 */     if (!(par1EntityAnimal instanceof pk))
/*     */     {
/* 586 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 590 */     pk var2 = (pk)par1EntityAnimal;
/* 591 */     return !var2.m() ? false : (var2.n() ? false : ((r() && var2.r())));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean bM() {
/* 597 */     return (this.ag.a(19) == 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public ln a(ln par1EntityAgeable) {
/* 602 */     return (ln)b(par1EntityAgeable);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/pk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */