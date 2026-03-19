/*      */ import cpw.mods.fml.common.FMLCommonHandler;
/*      */ import cpw.mods.fml.common.network.FMLNetworkHandler;
/*      */ import cpw.mods.fml.relauncher.Side;
/*      */ import cpw.mods.fml.relauncher.SideOnly;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import net.minecraftforge.common.ForgeHooks;
/*      */ import net.minecraftforge.common.ISpecialArmor;
/*      */ import net.minecraftforge.common.MinecraftForge;
/*      */ import net.minecraftforge.event.Event;
/*      */ import net.minecraftforge.event.ForgeEventFactory;
/*      */ import net.minecraftforge.event.entity.player.AttackEntityEvent;
/*      */ import net.minecraftforge.event.entity.player.EntityInteractEvent;
/*      */ import net.minecraftforge.event.entity.player.PlayerDestroyItemEvent;
/*      */ import net.minecraftforge.event.entity.player.PlayerDropsEvent;
/*      */ import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public abstract class qx
/*      */   extends md
/*      */   implements aa
/*      */ {
/*      */   public static final String PERSISTED_NBT_TAG = "PlayerPersisted";
/*   74 */   public qw bJ = new qw(this);
/*   75 */   private sl a = new sl();
/*      */ 
/*      */ 
/*      */   
/*      */   public rq bK;
/*      */ 
/*      */ 
/*      */   
/*      */   public rq bL;
/*      */ 
/*      */   
/*   86 */   protected rp bM = new rp();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*   92 */   protected int bN = 0;
/*   93 */   public byte bO = 0;
/*      */   
/*      */   public float bP;
/*      */   
/*      */   public float bQ;
/*      */   
/*      */   public String bR;
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public String cz;
/*  103 */   public int bS = 0;
/*      */ 
/*      */   
/*      */   public double bT;
/*      */ 
/*      */   
/*      */   public double bU;
/*      */ 
/*      */   
/*      */   public double bV;
/*      */   
/*      */   public double bW;
/*      */   
/*      */   public double bX;
/*      */   
/*      */   public double bY;
/*      */   
/*      */   public boolean bZ;
/*      */   
/*      */   public s ca;
/*      */   
/*      */   private int b;
/*      */   
/*      */   public float cb;
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public float cA;
/*      */   
/*      */   public float cc;
/*      */   
/*      */   private s c;
/*      */   
/*      */   private boolean d;
/*      */   
/*      */   private s e;
/*      */   
/*  139 */   public qv cd = new qv();
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int ce;
/*      */ 
/*      */ 
/*      */   
/*      */   public int cf;
/*      */ 
/*      */ 
/*      */   
/*      */   public float cg;
/*      */ 
/*      */ 
/*      */   
/*      */   private ur f;
/*      */ 
/*      */ 
/*      */   
/*      */   private int g;
/*      */ 
/*      */ 
/*      */   
/*  164 */   protected float ch = 0.1F;
/*  165 */   protected float ci = 0.02F;
/*  166 */   private int h = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  171 */   public rd cj = null;
/*      */   
/*      */   public boolean is096Target;
/*      */   
/*      */   public int time;
/*      */ 
/*      */   
/*      */   public qx(yc par1World) {
/*  179 */     super(par1World);
/*  180 */     this.bK = (rq)new sf(this.bJ, !par1World.I, this);
/*  181 */     this.bL = this.bK;
/*  182 */     this.M = 1.62F;
/*  183 */     s var2 = par1World.H();
/*  184 */     b(var2.a + 0.5D, (var2.b + 1), var2.c + 0.5D, 0.0F, 0.0F);
/*  185 */     this.aJ = "humanoid";
/*  186 */     this.aI = 180.0F;
/*  187 */     this.ac = 20;
/*  188 */     this.aG = "/mob/char.png";
/*      */     
/*  190 */     this.time = 0;
/*      */   }
/*      */ 
/*      */   
/*      */   public int aT() {
/*  195 */     return 20;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a() {
/*  200 */     super.a();
/*  201 */     this.ag.a(16, Byte.valueOf((byte)0));
/*  202 */     this.ag.a(17, Byte.valueOf((byte)0));
/*  203 */     this.ag.a(18, Integer.valueOf(0));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public ur bK() {
/*  213 */     return this.f;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public int bL() {
/*  223 */     return this.g;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean bM() {
/*  231 */     return (this.f != null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public int bN() {
/*  241 */     return bM() ? (this.f.m() - this.g) : 0;
/*      */   }
/*      */ 
/*      */   
/*      */   public void bO() {
/*  246 */     if (this.f != null)
/*      */     {
/*  248 */       this.f.b(this.p, this, this.g);
/*      */     }
/*      */     
/*  251 */     bP();
/*      */   }
/*      */ 
/*      */   
/*      */   public void bP() {
/*  256 */     this.f = null;
/*  257 */     this.g = 0;
/*      */     
/*  259 */     if (!this.p.I)
/*      */     {
/*  261 */       d(false);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean bh() {
/*  267 */     return (bM() && up.e[this.f.c].b_(this.f) == vs.d);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void j_() {
/*  275 */     FMLCommonHandler.instance().onPlayerPreTick(this);
/*  276 */     if (this.f != null) {
/*      */       
/*  278 */       ur var1 = this.bJ.g();
/*      */       
/*  280 */       if (var1 == this.f) {
/*      */         
/*  282 */         this.f.b().onUsingItemTick(this.f, this, this.g);
/*  283 */         if (this.g <= 25 && this.g % 4 == 0)
/*      */         {
/*  285 */           c(var1, 5);
/*      */         }
/*      */         
/*  288 */         if (--this.g == 0 && !this.p.I)
/*      */         {
/*  290 */           n();
/*      */         }
/*      */       }
/*      */       else {
/*      */         
/*  295 */         bP();
/*      */       } 
/*      */     } 
/*      */     
/*  299 */     if (this.bS > 0)
/*      */     {
/*  301 */       this.bS--;
/*      */     }
/*      */     
/*  304 */     if (bw()) {
/*      */       
/*  306 */       this.b++;
/*      */       
/*  308 */       if (this.b > 100)
/*      */       {
/*  310 */         this.b = 100;
/*      */       }
/*      */       
/*  313 */       if (!this.p.I)
/*      */       {
/*  315 */         if (!j())
/*      */         {
/*  317 */           a(true, true, false);
/*      */         }
/*  319 */         else if (this.p.u())
/*      */         {
/*  321 */           a(false, true, true);
/*      */         }
/*      */       
/*      */       }
/*  325 */     } else if (this.b > 0) {
/*      */       
/*  327 */       this.b++;
/*      */       
/*  329 */       if (this.b >= 110)
/*      */       {
/*  331 */         this.b = 0;
/*      */       }
/*      */     } 
/*      */     
/*  335 */     super.j_();
/*      */     
/*  337 */     if (!this.p.I && this.bL != null && !this.bL.a(this)) {
/*      */       
/*  339 */       i();
/*  340 */       this.bL = this.bK;
/*      */     } 
/*      */     
/*  343 */     if (af() && this.cd.a)
/*      */     {
/*  345 */       B();
/*      */     }
/*      */     
/*  348 */     this.bT = this.bW;
/*  349 */     this.bU = this.bX;
/*  350 */     this.bV = this.bY;
/*  351 */     double var9 = this.t - this.bW;
/*  352 */     double var3 = this.u - this.bX;
/*  353 */     double var5 = this.v - this.bY;
/*  354 */     double var7 = 10.0D;
/*      */     
/*  356 */     if (var9 > var7)
/*      */     {
/*  358 */       this.bT = this.bW = this.t;
/*      */     }
/*      */     
/*  361 */     if (var5 > var7)
/*      */     {
/*  363 */       this.bV = this.bY = this.v;
/*      */     }
/*      */     
/*  366 */     if (var3 > var7)
/*      */     {
/*  368 */       this.bU = this.bX = this.u;
/*      */     }
/*      */     
/*  371 */     if (var9 < -var7)
/*      */     {
/*  373 */       this.bT = this.bW = this.t;
/*      */     }
/*      */     
/*  376 */     if (var5 < -var7)
/*      */     {
/*  378 */       this.bV = this.bY = this.v;
/*      */     }
/*      */     
/*  381 */     if (var3 < -var7)
/*      */     {
/*  383 */       this.bU = this.bX = this.u;
/*      */     }
/*      */     
/*  386 */     this.bW += var9 * 0.25D;
/*  387 */     this.bY += var5 * 0.25D;
/*  388 */     this.bX += var3 * 0.25D;
/*  389 */     a(jq.k, 1);
/*      */     
/*  391 */     if (this.o == null)
/*      */     {
/*  393 */       this.e = null;
/*      */     }
/*      */     
/*  396 */     if (!this.p.I)
/*      */     {
/*  398 */       this.bM.a(this);
/*      */     }
/*  400 */     FMLCommonHandler.instance().onPlayerPostTick(this);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int z() {
/*  408 */     return this.cd.a ? 0 : 80;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int ab() {
/*  416 */     return 10;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(String par1Str, float par2, float par3) {
/*  421 */     this.p.a(this, par1Str, par2, par3);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void c(ur par1ItemStack, int par2) {
/*  430 */     if (par1ItemStack.n() == vs.c)
/*      */     {
/*  432 */       a("random.drink", 0.5F, this.p.t.nextFloat() * 0.1F + 0.9F);
/*      */     }
/*      */     
/*  435 */     if (par1ItemStack.n() == vs.b) {
/*      */       
/*  437 */       for (int var3 = 0; var3 < par2; var3++) {
/*      */         
/*  439 */         aoj var4 = this.p.S().a((this.aa.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
/*  440 */         var4.a(-this.A * 3.1415927F / 180.0F);
/*  441 */         var4.b(-this.z * 3.1415927F / 180.0F);
/*  442 */         aoj var5 = this.p.S().a((this.aa.nextFloat() - 0.5D) * 0.3D, -this.aa.nextFloat() * 0.6D - 0.3D, 0.6D);
/*  443 */         var5.a(-this.A * 3.1415927F / 180.0F);
/*  444 */         var5.b(-this.z * 3.1415927F / 180.0F);
/*  445 */         var5 = var5.c(this.t, this.u + e(), this.v);
/*  446 */         this.p.a("iconcrack_" + (par1ItemStack.b()).cj, var5.c, var5.d, var5.e, var4.c, var4.d + 0.05D, var4.e);
/*      */       } 
/*      */       
/*  449 */       a("random.eat", 0.5F + 0.5F * this.aa.nextInt(2), (this.aa.nextFloat() - this.aa.nextFloat()) * 0.2F + 1.0F);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void set096TargetState(boolean par1) {
/*  456 */     this.is096Target = par1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void n() {
/*  464 */     if (this.f != null) {
/*      */       
/*  466 */       c(this.f, 16);
/*  467 */       int var1 = this.f.a;
/*  468 */       ur var2 = this.f.b(this.p, this);
/*      */       
/*  470 */       if (var2 != this.f || (var2 != null && var2.a != var1)) {
/*      */         
/*  472 */         this.bJ.a[this.bJ.c] = var2;
/*      */         
/*  474 */         if (var2.a == 0)
/*      */         {
/*  476 */           this.bJ.a[this.bJ.c] = null;
/*      */         }
/*      */       } 
/*      */       
/*  480 */       bP();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public void a(byte par1) {
/*  487 */     if (par1 == 9) {
/*      */       
/*  489 */       n();
/*      */     }
/*      */     else {
/*      */       
/*  493 */       super.a(par1);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean bg() {
/*  502 */     return (aU() <= 0 || bw());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void i() {
/*  510 */     this.bL = this.bK;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void U() {
/*  518 */     double var1 = this.t;
/*  519 */     double var3 = this.u;
/*  520 */     double var5 = this.v;
/*  521 */     float var7 = this.z;
/*  522 */     float var8 = this.A;
/*  523 */     super.U();
/*  524 */     this.bP = this.bQ;
/*  525 */     this.bQ = 0.0F;
/*  526 */     k(this.t - var1, this.u - var3, this.v - var5);
/*      */     
/*  528 */     if (this.o instanceof md && ((md)this.o).shouldRiderFaceForward(this)) {
/*      */       
/*  530 */       this.A = var8;
/*  531 */       this.z = var7;
/*  532 */       this.ax = ((md)this.o).ax;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public void w() {
/*  544 */     this.M = 1.62F;
/*  545 */     a(0.6F, 1.8F);
/*  546 */     super.w();
/*  547 */     j(aT());
/*  548 */     this.aY = 0;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void bn() {
/*  553 */     bo();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void c() {
/*  562 */     if (this.bN > 0)
/*      */     {
/*  564 */       this.bN--;
/*      */     }
/*      */ 
/*      */     
/*  568 */     this.time++;
/*      */     
/*  570 */     if (this.p.s == 0 && aU() < aT() && this.ab % 20 * 12 == 0)
/*      */     {
/*  572 */       i(1);
/*      */     }
/*      */     
/*  575 */     this.bJ.j();
/*  576 */     this.bP = this.bQ;
/*  577 */     super.c();
/*  578 */     this.aN = this.cd.b();
/*  579 */     this.aO = this.ci;
/*      */     
/*  581 */     if (ai()) {
/*      */       
/*  583 */       this.aN = (float)(this.aN + this.cd.b() * 0.3D);
/*  584 */       this.aO = (float)(this.aO + this.ci * 0.3D);
/*      */     } 
/*      */     
/*  587 */     float var1 = ke.a(this.w * this.w + this.y * this.y);
/*  588 */     float var2 = (float)Math.atan(-this.x * 0.20000000298023224D) * 15.0F;
/*      */     
/*  590 */     if (var1 > 0.1F)
/*      */     {
/*  592 */       var1 = 0.1F;
/*      */     }
/*      */     
/*  595 */     if (!this.E || aU() <= 0)
/*      */     {
/*  597 */       var1 = 0.0F;
/*      */     }
/*      */     
/*  600 */     if (this.E || aU() <= 0)
/*      */     {
/*  602 */       var2 = 0.0F;
/*      */     }
/*      */     
/*  605 */     this.bQ += (var1 - this.bQ) * 0.4F;
/*  606 */     this.bb += (var2 - this.bb) * 0.8F;
/*      */     
/*  608 */     if (aU() > 0) {
/*      */       
/*  610 */       List<lq> var3 = this.p.b(this, this.D.b(1.0D, 0.5D, 1.0D));
/*      */       
/*  612 */       if (var3 != null)
/*      */       {
/*  614 */         for (int var4 = 0; var4 < var3.size(); var4++) {
/*      */           
/*  616 */           lq var5 = var3.get(var4);
/*      */           
/*  618 */           if (!var5.L)
/*      */           {
/*  620 */             r(var5);
/*      */           }
/*      */         } 
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private void r(lq par1Entity) {
/*  629 */     par1Entity.c_(this);
/*      */   }
/*      */ 
/*      */   
/*      */   public int bQ() {
/*  634 */     return this.ag.c(18);
/*      */   }
/*      */ 
/*      */   
/*      */   public void s(int par1) {
/*  639 */     this.ag.b(18, Integer.valueOf(par1));
/*      */   }
/*      */ 
/*      */   
/*      */   public void t(int par1) {
/*  644 */     int var2 = bQ();
/*  645 */     this.ag.b(18, Integer.valueOf(var2 + par1));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(lh par1DamageSource) {
/*  653 */     super.a(par1DamageSource);
/*  654 */     a(0.2F, 0.2F);
/*  655 */     b(this.t, this.u, this.v);
/*  656 */     this.x = 0.10000000149011612D;
/*      */     
/*  658 */     this.captureDrops = true;
/*  659 */     this.capturedDrops.clear();
/*      */     
/*  661 */     set096TargetState(false);
/*      */     
/*  663 */     if (this.bR.equals("Notch"))
/*      */     {
/*  665 */       a(new ur(up.j, 1), true);
/*      */     }
/*      */     
/*  668 */     if (!this.p.L().b("keepInventory"))
/*      */     {
/*  670 */       this.bJ.l();
/*      */     }
/*      */     
/*  673 */     this.captureDrops = false;
/*      */     
/*  675 */     if (!this.p.I) {
/*      */       
/*  677 */       PlayerDropsEvent event = new PlayerDropsEvent(this, par1DamageSource, this.capturedDrops, (this.bk > 0));
/*  678 */       if (!MinecraftForge.EVENT_BUS.post((Event)event))
/*      */       {
/*  680 */         for (px item : this.capturedDrops)
/*      */         {
/*  682 */           a(item);
/*      */         }
/*      */       }
/*      */     } 
/*      */     
/*  687 */     if (par1DamageSource != null) {
/*      */       
/*  689 */       this.w = (-ke.b((this.aX + this.z) * 3.1415927F / 180.0F) * 0.1F);
/*  690 */       this.y = (-ke.a((this.aX + this.z) * 3.1415927F / 180.0F) * 0.1F);
/*      */     }
/*      */     else {
/*      */       
/*  694 */       this.w = this.y = 0.0D;
/*      */     } 
/*      */     
/*  697 */     this.M = 0.1F;
/*  698 */     a(jq.y, 1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void c(lq par1Entity, int par2) {
/*  707 */     t(par2);
/*      */     
/*  709 */     if (par1Entity instanceof qx) {
/*      */       
/*  711 */       a(jq.A, 1);
/*      */     }
/*      */     else {
/*      */       
/*  715 */       a(jq.z, 1);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public px f(boolean par1) {
/*  724 */     ur stack = this.bJ.g();
/*      */     
/*  726 */     if (stack == null)
/*      */     {
/*  728 */       return null;
/*      */     }
/*      */     
/*  731 */     if (stack.b().onDroppedByPlayer(stack, this)) {
/*      */       
/*  733 */       int count = (par1 && this.bJ.g() != null) ? (this.bJ.g()).a : 1;
/*  734 */       return ForgeHooks.onPlayerTossEvent(this, this.bJ.a(this.bJ.c, count));
/*      */     } 
/*      */     
/*  737 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public px c(ur par1ItemStack) {
/*  746 */     return ForgeHooks.onPlayerTossEvent(this, par1ItemStack);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public px a(ur par1ItemStack, boolean par2) {
/*  754 */     if (par1ItemStack == null)
/*      */     {
/*  756 */       return null;
/*      */     }
/*      */ 
/*      */     
/*  760 */     px var3 = new px(this.p, this.t, this.u - 0.30000001192092896D + e(), this.v, par1ItemStack);
/*  761 */     var3.b = 40;
/*  762 */     float var4 = 0.1F;
/*      */ 
/*      */     
/*  765 */     if (par2) {
/*      */       
/*  767 */       float var5 = this.aa.nextFloat() * 0.5F;
/*  768 */       float var6 = this.aa.nextFloat() * 3.1415927F * 2.0F;
/*  769 */       var3.w = (-ke.a(var6) * var5);
/*  770 */       var3.y = (ke.b(var6) * var5);
/*  771 */       var3.x = 0.20000000298023224D;
/*      */     }
/*      */     else {
/*      */       
/*  775 */       var4 = 0.3F;
/*  776 */       var3.w = (-ke.a(this.z / 180.0F * 3.1415927F) * ke.b(this.A / 180.0F * 3.1415927F) * var4);
/*  777 */       var3.y = (ke.b(this.z / 180.0F * 3.1415927F) * ke.b(this.A / 180.0F * 3.1415927F) * var4);
/*  778 */       var3.x = (-ke.a(this.A / 180.0F * 3.1415927F) * var4 + 0.1F);
/*  779 */       var4 = 0.02F;
/*  780 */       float var5 = this.aa.nextFloat() * 3.1415927F * 2.0F;
/*  781 */       var4 *= this.aa.nextFloat();
/*  782 */       var3.w += Math.cos(var5) * var4;
/*  783 */       var3.x += ((this.aa.nextFloat() - this.aa.nextFloat()) * 0.1F);
/*  784 */       var3.y += Math.sin(var5) * var4;
/*      */     } 
/*      */     
/*  787 */     a(var3);
/*  788 */     a(jq.v, 1);
/*  789 */     return var3;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(px par1EntityItem) {
/*  798 */     if (this.captureDrops) {
/*      */       
/*  800 */       this.capturedDrops.add(par1EntityItem);
/*      */     }
/*      */     else {
/*      */       
/*  804 */       this.p.d((lq)par1EntityItem);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public float a(amq par1Block) {
/*  815 */     return getCurrentPlayerStrVsBlock(par1Block, 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public float getCurrentPlayerStrVsBlock(amq par1Block, int meta) {
/*  820 */     ur stack = this.bJ.g();
/*  821 */     float var2 = (stack == null) ? 1.0F : stack.b().getStrVsBlock(stack, par1Block, meta);
/*  822 */     int var3 = xe.c(this);
/*  823 */     ur var4 = this.bJ.g();
/*      */     
/*  825 */     if (var3 > 0 && var4 != null) {
/*      */       
/*  827 */       float var5 = (var3 * var3 + 1);
/*  828 */       boolean canHarvest = ForgeHooks.canHarvestBlock(par1Block, this, meta);
/*      */       
/*  830 */       if (!canHarvest && var2 <= 1.0F) {
/*      */         
/*  832 */         var2 += var5 * 0.08F;
/*      */       }
/*      */       else {
/*      */         
/*  836 */         var2 += var5;
/*      */       } 
/*      */     } 
/*      */     
/*  840 */     if (a(ll.e))
/*      */     {
/*  842 */       var2 *= 1.0F + (b(ll.e).c() + 1) * 0.2F;
/*      */     }
/*      */     
/*  845 */     if (a(ll.f))
/*      */     {
/*  847 */       var2 *= 1.0F - (b(ll.f).c() + 1) * 0.2F;
/*      */     }
/*      */     
/*  850 */     if (a(agi.h) && !xe.h(this))
/*      */     {
/*  852 */       var2 /= 5.0F;
/*      */     }
/*      */     
/*  855 */     if (!this.E)
/*      */     {
/*  857 */       var2 /= 5.0F;
/*      */     }
/*      */     
/*  860 */     var2 = ForgeEventFactory.getBreakSpeed(this, par1Block, meta, var2);
/*  861 */     return (var2 < 0.0F) ? 0.0F : var2;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean b(amq par1Block) {
/*  869 */     return ForgeEventFactory.doPlayerHarvestCheck(this, par1Block, this.bJ.b(par1Block));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(bq par1NBTTagCompound) {
/*  877 */     super.a(par1NBTTagCompound);
/*  878 */     by var2 = par1NBTTagCompound.m("Inventory");
/*  879 */     this.bJ.b(var2);
/*  880 */     this.bJ.c = par1NBTTagCompound.e("SelectedItemSlot");
/*  881 */     this.bZ = par1NBTTagCompound.n("Sleeping");
/*  882 */     this.b = par1NBTTagCompound.d("SleepTimer");
/*  883 */     this.cg = par1NBTTagCompound.g("XpP");
/*  884 */     this.ce = par1NBTTagCompound.e("XpLevel");
/*  885 */     this.cf = par1NBTTagCompound.e("XpTotal");
/*  886 */     s(par1NBTTagCompound.e("Score"));
/*      */     
/*  888 */     set096TargetState(par1NBTTagCompound.n("096Target"));
/*      */     
/*  890 */     if (this.bZ) {
/*      */       
/*  892 */       this.ca = new s(ke.c(this.t), ke.c(this.u), ke.c(this.v));
/*  893 */       a(true, true, false);
/*      */     } 
/*      */     
/*  896 */     if (par1NBTTagCompound.b("SpawnX") && par1NBTTagCompound.b("SpawnY") && par1NBTTagCompound.b("SpawnZ")) {
/*      */       
/*  898 */       this.c = new s(par1NBTTagCompound.e("SpawnX"), par1NBTTagCompound.e("SpawnY"), par1NBTTagCompound.e("SpawnZ"));
/*  899 */       this.d = par1NBTTagCompound.n("SpawnForced");
/*      */     } 
/*      */     
/*  902 */     this.bM.a(par1NBTTagCompound);
/*  903 */     this.cd.b(par1NBTTagCompound);
/*      */     
/*  905 */     if (par1NBTTagCompound.b("EnderItems")) {
/*      */       
/*  907 */       by var3 = par1NBTTagCompound.m("EnderItems");
/*  908 */       this.a.a(var3);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(bq par1NBTTagCompound) {
/*  917 */     super.b(par1NBTTagCompound);
/*  918 */     par1NBTTagCompound.a("Inventory", (cd)this.bJ.a(new by()));
/*  919 */     par1NBTTagCompound.a("SelectedItemSlot", this.bJ.c);
/*  920 */     par1NBTTagCompound.a("Sleeping", this.bZ);
/*  921 */     par1NBTTagCompound.a("SleepTimer", (short)this.b);
/*  922 */     par1NBTTagCompound.a("XpP", this.cg);
/*  923 */     par1NBTTagCompound.a("XpLevel", this.ce);
/*  924 */     par1NBTTagCompound.a("XpTotal", this.cf);
/*  925 */     par1NBTTagCompound.a("Score", bQ());
/*      */     
/*  927 */     par1NBTTagCompound.a("096Target", this.is096Target);
/*      */     
/*  929 */     if (this.c != null) {
/*      */       
/*  931 */       par1NBTTagCompound.a("SpawnX", this.c.a);
/*  932 */       par1NBTTagCompound.a("SpawnY", this.c.b);
/*  933 */       par1NBTTagCompound.a("SpawnZ", this.c.c);
/*  934 */       par1NBTTagCompound.a("SpawnForced", this.d);
/*      */     } 
/*      */     
/*  937 */     this.bM.b(par1NBTTagCompound);
/*  938 */     this.cd.a(par1NBTTagCompound);
/*  939 */     par1NBTTagCompound.a("EnderItems", (cd)this.a.g());
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(la par1IInventory) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public void c(int par1, int par2, int par3) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public void d(int par1, int par2, int par3) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(int par1, int par2, int par3) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public float e() {
/*  961 */     return 0.12F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void e_() {
/*  969 */     this.M = 1.62F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(lh par1DamageSource, int par2) {
/*  977 */     if (ar())
/*      */     {
/*  979 */       return false;
/*      */     }
/*  981 */     if (this.cd.a && !par1DamageSource.e())
/*      */     {
/*  983 */       return false;
/*      */     }
/*      */ 
/*      */     
/*  987 */     this.bB = 0;
/*      */     
/*  989 */     if (aU() <= 0)
/*      */     {
/*  991 */       return false;
/*      */     }
/*      */ 
/*      */     
/*  995 */     if (bw() && !this.p.I)
/*      */     {
/*  997 */       a(true, true, false);
/*      */     }
/*      */     
/* 1000 */     if (par1DamageSource.n()) {
/*      */       
/* 1002 */       if (this.p.s == 0)
/*      */       {
/* 1004 */         par2 = 0;
/*      */       }
/*      */       
/* 1007 */       if (this.p.s == 1)
/*      */       {
/* 1009 */         par2 = par2 / 2 + 1;
/*      */       }
/*      */       
/* 1012 */       if (this.p.s == 3)
/*      */       {
/* 1014 */         par2 = par2 * 3 / 2;
/*      */       }
/*      */     } 
/*      */     
/* 1018 */     if (par2 == 0)
/*      */     {
/* 1020 */       return false;
/*      */     }
/*      */ 
/*      */     
/* 1024 */     lq var3 = par1DamageSource.g();
/*      */     
/* 1026 */     if (var3 instanceof qz && ((qz)var3).c != null)
/*      */     {
/* 1028 */       var3 = ((qz)var3).c;
/*      */     }
/*      */     
/* 1031 */     if (var3 instanceof md)
/*      */     {
/* 1033 */       a((md)var3, false);
/*      */     }
/*      */     
/* 1036 */     a(jq.x, par2);
/* 1037 */     return super.a(par1DamageSource, par2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected int c(lh par1DamageSource, int par2) {
/* 1048 */     int var3 = super.c(par1DamageSource, par2);
/*      */     
/* 1050 */     if (var3 <= 0)
/*      */     {
/* 1052 */       return 0;
/*      */     }
/*      */ 
/*      */     
/* 1056 */     int var4 = xe.a(this.bJ.b, par1DamageSource);
/*      */     
/* 1058 */     if (var4 > 20)
/*      */     {
/* 1060 */       var4 = 20;
/*      */     }
/*      */     
/* 1063 */     if (var4 > 0 && var4 <= 20) {
/*      */       
/* 1065 */       int var5 = 25 - var4;
/* 1066 */       int var6 = var3 * var5 + this.aT;
/* 1067 */       var3 = var6 / 25;
/* 1068 */       this.aT = var6 % 25;
/*      */     } 
/*      */     
/* 1071 */     return var3;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean h() {
/* 1080 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void a(md par1EntityLiving, boolean par2) {
/* 1089 */     if (!(par1EntityLiving instanceof qc) && !(par1EntityLiving instanceof qg)) {
/*      */       
/* 1091 */       if (par1EntityLiving instanceof pk) {
/*      */         
/* 1093 */         pk var3 = (pk)par1EntityLiving;
/*      */         
/* 1095 */         if (var3.m() && this.bR.equals(var3.o())) {
/*      */           return;
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/* 1101 */       if (!(par1EntityLiving instanceof qx) || h()) {
/*      */         
/* 1103 */         List var6 = this.p.a(pk.class, aoe.a().a(this.t, this.u, this.v, this.t + 1.0D, this.u + 1.0D, this.v + 1.0D).b(16.0D, 4.0D, 16.0D));
/* 1104 */         Iterator<pk> var4 = var6.iterator();
/*      */         
/* 1106 */         while (var4.hasNext()) {
/*      */           
/* 1108 */           pk var5 = var4.next();
/*      */           
/* 1110 */           if (var5.m() && var5.l() == null && this.bR.equals(var5.o()) && (!par2 || !var5.n())) {
/*      */             
/* 1112 */             var5.h(false);
/* 1113 */             var5.b(par1EntityLiving);
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void k(int par1) {
/* 1122 */     this.bJ.g(par1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int aW() {
/* 1130 */     return this.bJ.k();
/*      */   }
/*      */ 
/*      */   
/*      */   public float bR() {
/* 1135 */     int var1 = 0;
/* 1136 */     ur[] var2 = this.bJ.b;
/* 1137 */     int var3 = var2.length;
/*      */     
/* 1139 */     for (int var4 = 0; var4 < var3; var4++) {
/*      */       
/* 1141 */       ur var5 = var2[var4];
/*      */       
/* 1143 */       if (var5 != null)
/*      */       {
/* 1145 */         var1++;
/*      */       }
/*      */     } 
/*      */     
/* 1149 */     return var1 / this.bJ.b.length;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void d(lh par1DamageSource, int par2) {
/* 1158 */     if (!ar()) {
/*      */       
/* 1160 */       par2 = ForgeHooks.onLivingHurt(this, par1DamageSource, par2);
/* 1161 */       if (par2 <= 0) {
/*      */         return;
/*      */       }
/*      */ 
/*      */       
/* 1166 */       if (!par1DamageSource.c() && bh())
/*      */       {
/* 1168 */         par2 = 1 + par2 >> 1;
/*      */       }
/*      */       
/* 1171 */       par2 = ISpecialArmor.ArmorProperties.ApplyArmor(this, this.bJ.b, par1DamageSource, par2);
/* 1172 */       if (par2 <= 0) {
/*      */         return;
/*      */       }
/*      */       
/* 1176 */       par2 = c(par1DamageSource, par2);
/* 1177 */       j(par1DamageSource.d());
/* 1178 */       this.aR -= par2;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(anr par1TileEntityFurnace) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ano par1TileEntityDispenser) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(any par1TileEntity) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(anl par1TileEntityBrewingStand) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ank par1TileEntityBeacon) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(xs par1IMerchant) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public void d(ur par1ItemStack) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean p(lq par1Entity) {
/* 1216 */     if (MinecraftForge.EVENT_BUS.post((Event)new EntityInteractEvent(this, par1Entity)))
/*      */     {
/* 1218 */       return false;
/*      */     }
/* 1220 */     if (par1Entity.a(this))
/*      */     {
/* 1222 */       return true;
/*      */     }
/*      */ 
/*      */     
/* 1226 */     ur var2 = bS();
/*      */     
/* 1228 */     if (var2 != null && par1Entity instanceof md) {
/*      */       
/* 1230 */       if (this.cd.d)
/*      */       {
/* 1232 */         var2 = var2.l();
/*      */       }
/*      */       
/* 1235 */       if (var2.a((md)par1Entity)) {
/*      */         
/* 1237 */         if (var2.a <= 0 && !this.cd.d)
/*      */         {
/* 1239 */           bT();
/*      */         }
/*      */         
/* 1242 */         return true;
/*      */       } 
/*      */     } 
/*      */     
/* 1246 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ur bS() {
/* 1255 */     return this.bJ.g();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void bT() {
/* 1263 */     ur orig = bS();
/* 1264 */     this.bJ.a(this.bJ.c, (ur)null);
/* 1265 */     MinecraftForge.EVENT_BUS.post((Event)new PlayerDestroyItemEvent(this, orig));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public double W() {
/* 1273 */     return (this.M - 0.5F);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void q(lq par1Entity) {
/* 1282 */     if (MinecraftForge.EVENT_BUS.post((Event)new AttackEntityEvent(this, par1Entity))) {
/*      */       return;
/*      */     }
/*      */     
/* 1286 */     ur stack = bS();
/* 1287 */     if (stack != null && stack.b().onLeftClickEntity(stack, this, par1Entity)) {
/*      */       return;
/*      */     }
/*      */     
/* 1291 */     if (par1Entity.aq())
/*      */     {
/* 1293 */       if (!par1Entity.j(this)) {
/*      */         
/* 1295 */         int var2 = this.bJ.a(par1Entity);
/*      */         
/* 1297 */         if (a(ll.g))
/*      */         {
/* 1299 */           var2 += 3 << b(ll.g).c();
/*      */         }
/*      */         
/* 1302 */         if (a(ll.t))
/*      */         {
/* 1304 */           var2 -= 2 << b(ll.t).c();
/*      */         }
/*      */         
/* 1307 */         int var3 = 0;
/* 1308 */         int var4 = 0;
/*      */         
/* 1310 */         if (par1Entity instanceof md) {
/*      */           
/* 1312 */           var4 = xe.a(this, (md)par1Entity);
/* 1313 */           var3 += xe.b(this, (md)par1Entity);
/*      */         } 
/*      */         
/* 1316 */         if (ai())
/*      */         {
/* 1318 */           var3++;
/*      */         }
/*      */         
/* 1321 */         if (var2 > 0 || var4 > 0) {
/*      */           
/* 1323 */           boolean var5 = (this.S > 0.0F && !this.E && !g_() && !H() && !a(ll.q) && this.o == null && par1Entity instanceof md);
/*      */           
/* 1325 */           if (var5)
/*      */           {
/* 1327 */             var2 += this.aa.nextInt(var2 / 2 + 2);
/*      */           }
/*      */           
/* 1330 */           var2 += var4;
/* 1331 */           boolean var6 = false;
/* 1332 */           int var7 = xe.a(this);
/*      */           
/* 1334 */           if (par1Entity instanceof md && var7 > 0 && !par1Entity.af()) {
/*      */             
/* 1336 */             var6 = true;
/* 1337 */             par1Entity.c(1);
/*      */           } 
/*      */           
/* 1340 */           boolean var8 = par1Entity.a(lh.a(this), var2);
/*      */           
/* 1342 */           if (var8) {
/*      */             
/* 1344 */             if (var3 > 0) {
/*      */               
/* 1346 */               par1Entity.g((-ke.a(this.z * 3.1415927F / 180.0F) * var3 * 0.5F), 0.1D, (ke.b(this.z * 3.1415927F / 180.0F) * var3 * 0.5F));
/* 1347 */               this.w *= 0.6D;
/* 1348 */               this.y *= 0.6D;
/* 1349 */               b(false);
/*      */             } 
/*      */             
/* 1352 */             if (var5)
/*      */             {
/* 1354 */               b(par1Entity);
/*      */             }
/*      */             
/* 1357 */             if (var4 > 0)
/*      */             {
/* 1359 */               c(par1Entity);
/*      */             }
/*      */             
/* 1362 */             if (var2 >= 18)
/*      */             {
/* 1364 */               a((jl)jh.E);
/*      */             }
/*      */             
/* 1367 */             l(par1Entity);
/*      */             
/* 1369 */             if (par1Entity instanceof md)
/*      */             {
/* 1371 */               xp.a(this, (md)par1Entity, this.aa);
/*      */             }
/*      */           } 
/*      */           
/* 1375 */           ur var9 = bS();
/*      */           
/* 1377 */           if (var9 != null && par1Entity instanceof md) {
/*      */             
/* 1379 */             var9.a((md)par1Entity, this);
/*      */             
/* 1381 */             if (var9.a <= 0)
/*      */             {
/* 1383 */               bT();
/*      */             }
/*      */           } 
/*      */           
/* 1387 */           if (par1Entity instanceof md) {
/*      */             
/* 1389 */             if (par1Entity.S())
/*      */             {
/* 1391 */               a((md)par1Entity, true);
/*      */             }
/*      */             
/* 1394 */             a(jq.w, var2);
/*      */             
/* 1396 */             if (var7 > 0 && var8) {
/*      */               
/* 1398 */               par1Entity.c(var7 * 4);
/*      */             }
/* 1400 */             else if (var6) {
/*      */               
/* 1402 */               par1Entity.B();
/*      */             } 
/*      */           } 
/*      */           
/* 1406 */           j(0.3F);
/*      */         } 
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(lq par1Entity) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public void c(lq par1Entity) {}
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public void bU() {}
/*      */ 
/*      */   
/*      */   public void x() {
/* 1427 */     super.x();
/* 1428 */     this.bK.b(this);
/*      */     
/* 1430 */     if (this.bL != null)
/*      */     {
/* 1432 */       this.bL.b(this);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean T() {
/* 1441 */     return (!this.bZ && super.T());
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean bV() {
/* 1446 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public qy a(int par1, int par2, int par3) {
/* 1454 */     PlayerSleepInBedEvent event = new PlayerSleepInBedEvent(this, par1, par2, par3);
/* 1455 */     MinecraftForge.EVENT_BUS.post((Event)event);
/* 1456 */     if (event.result != null)
/*      */     {
/* 1458 */       return event.result;
/*      */     }
/* 1460 */     if (!this.p.I) {
/*      */       
/* 1462 */       if (bw() || !S())
/*      */       {
/* 1464 */         return qy.e;
/*      */       }
/*      */       
/* 1467 */       if (!this.p.u.d())
/*      */       {
/* 1469 */         return qy.b;
/*      */       }
/*      */       
/* 1472 */       if (this.p.u())
/*      */       {
/* 1474 */         return qy.c;
/*      */       }
/*      */       
/* 1477 */       if (Math.abs(this.t - par1) > 3.0D || Math.abs(this.u - par2) > 2.0D || Math.abs(this.v - par3) > 3.0D)
/*      */       {
/* 1479 */         return qy.d;
/*      */       }
/*      */       
/* 1482 */       double var4 = 8.0D;
/* 1483 */       double var6 = 5.0D;
/* 1484 */       List var8 = this.p.a(qj.class, aoe.a().a(par1 - var4, par2 - var6, par3 - var4, par1 + var4, par2 + var6, par3 + var4));
/*      */       
/* 1486 */       if (!var8.isEmpty())
/*      */       {
/* 1488 */         return qy.f;
/*      */       }
/*      */     } 
/*      */     
/* 1492 */     a(0.2F, 0.2F);
/* 1493 */     this.M = 0.2F;
/*      */     
/* 1495 */     if (this.p.f(par1, par2, par3)) {
/*      */       
/* 1497 */       int var9 = this.p.h(par1, par2, par3);
/* 1498 */       int var5 = ajb.e(var9);
/* 1499 */       amq block = amq.p[this.p.a(par1, par2, par3)];
/* 1500 */       if (block != null)
/*      */       {
/* 1502 */         var5 = block.getBedDirection(this.p, par1, par2, par3);
/*      */       }
/* 1504 */       float var10 = 0.5F;
/* 1505 */       float var7 = 0.5F;
/*      */       
/* 1507 */       switch (var5) {
/*      */         
/*      */         case 0:
/* 1510 */           var7 = 0.9F;
/*      */           break;
/*      */         case 1:
/* 1513 */           var10 = 0.1F;
/*      */           break;
/*      */         case 2:
/* 1516 */           var7 = 0.1F;
/*      */           break;
/*      */         case 3:
/* 1519 */           var10 = 0.9F;
/*      */           break;
/*      */       } 
/* 1522 */       x(var5);
/* 1523 */       b((par1 + var10), (par2 + 0.9375F), (par3 + var7));
/*      */     }
/*      */     else {
/*      */       
/* 1527 */       b((par1 + 0.5F), (par2 + 0.9375F), (par3 + 0.5F));
/*      */     } 
/*      */     
/* 1530 */     this.bZ = true;
/* 1531 */     this.b = 0;
/* 1532 */     this.ca = new s(par1, par2, par3);
/* 1533 */     this.w = this.y = this.x = 0.0D;
/*      */     
/* 1535 */     if (!this.p.I)
/*      */     {
/* 1537 */       this.p.c();
/*      */     }
/*      */     
/* 1540 */     return qy.a;
/*      */   }
/*      */ 
/*      */   
/*      */   private void x(int par1) {
/* 1545 */     this.cb = 0.0F;
/* 1546 */     this.cc = 0.0F;
/*      */     
/* 1548 */     switch (par1) {
/*      */       
/*      */       case 0:
/* 1551 */         this.cc = -1.8F;
/*      */         break;
/*      */       case 1:
/* 1554 */         this.cb = 1.8F;
/*      */         break;
/*      */       case 2:
/* 1557 */         this.cc = 1.8F;
/*      */         break;
/*      */       case 3:
/* 1560 */         this.cb = -1.8F;
/*      */         break;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(boolean par1, boolean par2, boolean par3) {
/* 1569 */     a(0.6F, 1.8F);
/* 1570 */     e_();
/* 1571 */     s var4 = this.ca;
/* 1572 */     s var5 = this.ca;
/*      */     
/* 1574 */     amq block = (var4 == null) ? null : amq.p[this.p.a(var4.a, var4.b, var4.c)];
/*      */     
/* 1576 */     if (var4 != null && block != null && block.isBed(this.p, var4.a, var4.b, var4.c, this)) {
/*      */       
/* 1578 */       block.setBedOccupied(this.p, var4.a, var4.b, var4.c, this, false);
/* 1579 */       var5 = block.getBedSpawnPosition(this.p, var4.a, var4.b, var4.c, this);
/*      */       
/* 1581 */       if (var5 == null)
/*      */       {
/* 1583 */         var5 = new s(var4.a, var4.b + 1, var4.c);
/*      */       }
/*      */       
/* 1586 */       b((var5.a + 0.5F), (var5.b + this.M + 0.1F), (var5.c + 0.5F));
/*      */     } 
/*      */     
/* 1589 */     this.bZ = false;
/*      */     
/* 1591 */     if (!this.p.I && par2)
/*      */     {
/* 1593 */       this.p.c();
/*      */     }
/*      */     
/* 1596 */     if (par1) {
/*      */       
/* 1598 */       this.b = 0;
/*      */     }
/*      */     else {
/*      */       
/* 1602 */       this.b = 100;
/*      */     } 
/*      */     
/* 1605 */     if (par3)
/*      */     {
/* 1607 */       a(this.ca, false);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean j() {
/* 1616 */     s c = this.ca;
/* 1617 */     int blockID = this.p.a(c.a, c.b, c.c);
/* 1618 */     return (amq.p[blockID] != null && amq.p[blockID].isBed(this.p, c.a, c.b, c.c, this));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static s a(yc par0World, s par1ChunkCoordinates, boolean par2) {
/* 1627 */     zw var3 = par0World.I();
/* 1628 */     var3.c(par1ChunkCoordinates.a - 3 >> 4, par1ChunkCoordinates.c - 3 >> 4);
/* 1629 */     var3.c(par1ChunkCoordinates.a + 3 >> 4, par1ChunkCoordinates.c - 3 >> 4);
/* 1630 */     var3.c(par1ChunkCoordinates.a - 3 >> 4, par1ChunkCoordinates.c + 3 >> 4);
/* 1631 */     var3.c(par1ChunkCoordinates.a + 3 >> 4, par1ChunkCoordinates.c + 3 >> 4);
/*      */     
/* 1633 */     s c = par1ChunkCoordinates;
/* 1634 */     amq block = amq.p[par0World.a(c.a, c.b, c.c)];
/*      */     
/* 1636 */     if (block != null && block.isBed(par0World, c.a, c.b, c.c, null)) {
/*      */       
/* 1638 */       s var8 = block.getBedSpawnPosition(par0World, c.a, c.b, c.c, null);
/* 1639 */       return var8;
/*      */     } 
/*      */ 
/*      */     
/* 1643 */     agi var4 = par0World.g(par1ChunkCoordinates.a, par1ChunkCoordinates.b, par1ChunkCoordinates.c);
/* 1644 */     agi var5 = par0World.g(par1ChunkCoordinates.a, par1ChunkCoordinates.b + 1, par1ChunkCoordinates.c);
/* 1645 */     boolean var6 = (!var4.a() && !var4.d());
/* 1646 */     boolean var7 = (!var5.a() && !var5.d());
/* 1647 */     return (par2 && var6 && var7) ? par1ChunkCoordinates : null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public float bW() {
/* 1658 */     if (this.ca != null) {
/*      */       
/* 1660 */       int x = this.ca.a;
/* 1661 */       int y = this.ca.b;
/* 1662 */       int z = this.ca.c;
/* 1663 */       amq block = amq.p[this.p.a(x, y, z)];
/* 1664 */       int var2 = (block == null) ? 0 : block.getBedDirection(this.p, x, y, z);
/*      */       
/* 1666 */       switch (var2) {
/*      */         
/*      */         case 0:
/* 1669 */           return 90.0F;
/*      */         case 1:
/* 1671 */           return 0.0F;
/*      */         case 2:
/* 1673 */           return 270.0F;
/*      */         case 3:
/* 1675 */           return 180.0F;
/*      */       } 
/*      */     
/*      */     } 
/* 1679 */     return 0.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean bw() {
/* 1687 */     return this.bZ;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean bX() {
/* 1695 */     return (this.bZ && this.b >= 100);
/*      */   }
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public int bY() {
/* 1701 */     return this.b;
/*      */   }
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   protected boolean v(int par1) {
/* 1707 */     return ((this.ag.a(16) & 1 << par1) != 0);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void b(int par1, boolean par2) {
/* 1712 */     byte var3 = this.ag.a(16);
/*      */     
/* 1714 */     if (par2) {
/*      */       
/* 1716 */       this.ag.b(16, Byte.valueOf((byte)(var3 | 1 << par1)));
/*      */     }
/*      */     else {
/*      */       
/* 1720 */       this.ag.b(16, Byte.valueOf((byte)(var3 & (1 << par1 ^ 0xFFFFFFFF))));
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(String par1Str) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public s bZ() {
/* 1734 */     return this.c;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean ca() {
/* 1739 */     return this.d;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(s par1ChunkCoordinates, boolean par2) {
/* 1747 */     if (par1ChunkCoordinates != null) {
/*      */       
/* 1749 */       this.c = new s(par1ChunkCoordinates);
/* 1750 */       this.d = par2;
/*      */     }
/*      */     else {
/*      */       
/* 1754 */       this.c = null;
/* 1755 */       this.d = false;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(jl par1StatBase) {
/* 1764 */     a(par1StatBase, 1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(jl par1StatBase, int par2) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void bi() {
/* 1777 */     super.bi();
/* 1778 */     a(jq.u, 1);
/*      */     
/* 1780 */     if (ai()) {
/*      */       
/* 1782 */       j(0.8F);
/*      */     }
/*      */     else {
/*      */       
/* 1786 */       j(0.2F);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void e(float par1, float par2) {
/* 1795 */     double var3 = this.t;
/* 1796 */     double var5 = this.u;
/* 1797 */     double var7 = this.v;
/*      */     
/* 1799 */     if (this.cd.b && this.o == null) {
/*      */       
/* 1801 */       double var9 = this.x;
/* 1802 */       float var11 = this.aO;
/* 1803 */       this.aO = this.cd.a();
/* 1804 */       super.e(par1, par2);
/* 1805 */       this.x = var9 * 0.6D;
/* 1806 */       this.aO = var11;
/*      */     }
/*      */     else {
/*      */       
/* 1810 */       super.e(par1, par2);
/*      */     } 
/*      */     
/* 1813 */     j(this.t - var3, this.u - var5, this.v - var7);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void j(double par1, double par3, double par5) {
/* 1821 */     if (this.o == null)
/*      */     {
/*      */ 
/*      */       
/* 1825 */       if (a(agi.h)) {
/*      */         
/* 1827 */         int var7 = Math.round(ke.a(par1 * par1 + par3 * par3 + par5 * par5) * 100.0F);
/*      */         
/* 1829 */         if (var7 > 0)
/*      */         {
/* 1831 */           a(jq.q, var7);
/* 1832 */           j(0.015F * var7 * 0.01F);
/*      */         }
/*      */       
/* 1835 */       } else if (H()) {
/*      */         
/* 1837 */         int var7 = Math.round(ke.a(par1 * par1 + par5 * par5) * 100.0F);
/*      */         
/* 1839 */         if (var7 > 0)
/*      */         {
/* 1841 */           a(jq.m, var7);
/* 1842 */           j(0.015F * var7 * 0.01F);
/*      */         }
/*      */       
/* 1845 */       } else if (g_()) {
/*      */         
/* 1847 */         if (par3 > 0.0D)
/*      */         {
/* 1849 */           a(jq.o, (int)Math.round(par3 * 100.0D));
/*      */         }
/*      */       }
/* 1852 */       else if (this.E) {
/*      */         
/* 1854 */         int var7 = Math.round(ke.a(par1 * par1 + par5 * par5) * 100.0F);
/*      */         
/* 1856 */         if (var7 > 0) {
/*      */           
/* 1858 */           a(jq.l, var7);
/*      */           
/* 1860 */           if (ai())
/*      */           {
/* 1862 */             j(0.099999994F * var7 * 0.01F);
/*      */           }
/*      */           else
/*      */           {
/* 1866 */             j(0.01F * var7 * 0.01F);
/*      */           }
/*      */         
/*      */         } 
/*      */       } else {
/*      */         
/* 1872 */         int var7 = Math.round(ke.a(par1 * par1 + par5 * par5) * 100.0F);
/*      */         
/* 1874 */         if (var7 > 25)
/*      */         {
/* 1876 */           a(jq.p, var7);
/*      */         }
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void k(double par1, double par3, double par5) {
/* 1887 */     if (this.o != null) {
/*      */       
/* 1889 */       int var7 = Math.round(ke.a(par1 * par1 + par3 * par3 + par5 * par5) * 100.0F);
/*      */       
/* 1891 */       if (var7 > 0)
/*      */       {
/* 1893 */         if (this.o instanceof py) {
/*      */           
/* 1895 */           a(jq.r, var7);
/*      */           
/* 1897 */           if (this.e == null)
/*      */           {
/* 1899 */             this.e = new s(ke.c(this.t), ke.c(this.u), ke.c(this.v));
/*      */           }
/* 1901 */           else if (this.e.e(ke.c(this.t), ke.c(this.u), ke.c(this.v)) >= 1000000.0D)
/*      */           {
/* 1903 */             a((jl)jh.q, 1);
/*      */           }
/*      */         
/* 1906 */         } else if (this.o instanceof pv) {
/*      */           
/* 1908 */           a(jq.s, var7);
/*      */         }
/* 1910 */         else if (this.o instanceof pd) {
/*      */           
/* 1912 */           a(jq.t, var7);
/*      */         } 
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void a(float par1) {
/* 1923 */     if (!this.cd.c) {
/*      */       
/* 1925 */       if (par1 >= 2.0F)
/*      */       {
/* 1927 */         a(jq.n, (int)Math.round(par1 * 100.0D));
/*      */       }
/*      */       
/* 1930 */       super.a(par1);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(md par1EntityLiving) {
/* 1939 */     if (par1EntityLiving instanceof qe)
/*      */     {
/* 1941 */       a((jl)jh.s);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void am() {
/* 1950 */     if (!this.cd.b)
/*      */     {
/* 1952 */       super.am();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public int b(ur par1ItemStack, int par2) {
/* 1963 */     int var3 = super.b(par1ItemStack, par2);
/*      */     
/* 1965 */     if (par1ItemStack.c == up.aR.cj && this.cj != null) {
/*      */       
/* 1967 */       var3 = par1ItemStack.c() + 16;
/*      */     }
/*      */     else {
/*      */       
/* 1971 */       if (par1ItemStack.b().b())
/*      */       {
/* 1973 */         return par1ItemStack.b().getIconIndex(par1ItemStack, par2);
/*      */       }
/*      */       
/* 1976 */       if (this.f != null && par1ItemStack.c == up.k.cj) {
/*      */         
/* 1978 */         int var4 = par1ItemStack.m() - this.g;
/*      */         
/* 1980 */         if (var4 >= 18)
/*      */         {
/* 1982 */           return 133;
/*      */         }
/*      */         
/* 1985 */         if (var4 > 13)
/*      */         {
/* 1987 */           return 117;
/*      */         }
/*      */         
/* 1990 */         if (var4 > 0)
/*      */         {
/* 1992 */           return 101;
/*      */         }
/*      */       } 
/* 1995 */       var3 = par1ItemStack.b().getIconIndex(par1ItemStack, par2, this, this.f, this.g);
/*      */     } 
/*      */     
/* 1998 */     return var3;
/*      */   }
/*      */ 
/*      */   
/*      */   public ur q(int par1) {
/* 2003 */     return this.bJ.f(par1);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void bE() {}
/*      */ 
/*      */   
/*      */   protected void bF() {}
/*      */ 
/*      */   
/*      */   public void w(int par1) {
/* 2015 */     t(par1);
/* 2016 */     int var2 = Integer.MAX_VALUE - this.cf;
/*      */     
/* 2018 */     if (par1 > var2)
/*      */     {
/* 2020 */       par1 = var2;
/*      */     }
/*      */     
/* 2023 */     this.cg += par1 / cb();
/*      */     
/* 2025 */     for (this.cf += par1; this.cg >= 1.0F; this.cg /= cb()) {
/*      */       
/* 2027 */       this.cg = (this.cg - 1.0F) * cb();
/* 2028 */       a(1);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(int par1) {
/* 2037 */     this.ce += par1;
/*      */     
/* 2039 */     if (this.ce < 0) {
/*      */       
/* 2041 */       this.ce = 0;
/* 2042 */       this.cg = 0.0F;
/* 2043 */       this.cf = 0;
/*      */     } 
/*      */     
/* 2046 */     if (par1 > 0 && this.ce % 5 == 0 && this.h < this.ab - 100.0F) {
/*      */       
/* 2048 */       float var2 = (this.ce > 30) ? 1.0F : (this.ce / 30.0F);
/* 2049 */       this.p.a(this, "random.levelup", var2 * 0.75F, 1.0F);
/* 2050 */       this.h = this.ab;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int cb() {
/* 2060 */     return (this.ce >= 30) ? (62 + (this.ce - 30) * 7) : ((this.ce >= 15) ? (17 + (this.ce - 15) * 3) : 17);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void j(float par1) {
/* 2068 */     if (!this.cd.a)
/*      */     {
/* 2070 */       if (!this.p.I)
/*      */       {
/* 2072 */         this.bM.a(par1);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public rp cc() {
/* 2082 */     return this.bM;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean g(boolean par1) {
/* 2087 */     return ((par1 || this.bM.c()) && !this.cd.a);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean cd() {
/* 2095 */     return (aU() > 0 && aU() < aT());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ur par1ItemStack, int par2) {
/* 2103 */     if (par1ItemStack != this.f) {
/*      */       
/* 2105 */       this.f = par1ItemStack;
/* 2106 */       this.g = par2;
/*      */       
/* 2108 */       if (!this.p.I)
/*      */       {
/* 2110 */         d(true);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean f(int par1, int par2, int par3) {
/* 2120 */     if (this.cd.e)
/*      */     {
/* 2122 */       return true;
/*      */     }
/*      */ 
/*      */     
/* 2126 */     int var4 = this.p.a(par1, par2, par3);
/*      */     
/* 2128 */     if (var4 > 0) {
/*      */       
/* 2130 */       amq var5 = amq.p[var4];
/*      */       
/* 2132 */       if (var5.cB.q())
/*      */       {
/* 2134 */         return true;
/*      */       }
/*      */       
/* 2137 */       if (bS() != null) {
/*      */         
/* 2139 */         ur var6 = bS();
/*      */         
/* 2141 */         if (var6.b(var5) || var6.a(var5) > 1.0F)
/*      */         {
/* 2143 */           return true;
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/* 2148 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(int par1, int par2, int par3, int par4, ur par5ItemStack) {
/* 2154 */     return this.cd.e ? true : ((par5ItemStack != null) ? par5ItemStack.x() : false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected int c(qx par1EntityPlayer) {
/* 2162 */     if (this.p.L().b("keepInventory"))
/*      */     {
/* 2164 */       return 0;
/*      */     }
/*      */ 
/*      */     
/* 2168 */     int var2 = this.ce * 7;
/* 2169 */     return (var2 > 100) ? 100 : var2;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean aQ() {
/* 2178 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String an() {
/* 2186 */     return this.bR;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(qx par1EntityPlayer, boolean par2) {
/* 2195 */     if (par2) {
/*      */       
/* 2197 */       this.bJ.b(par1EntityPlayer.bJ);
/* 2198 */       this.aR = par1EntityPlayer.aR;
/* 2199 */       this.bM = par1EntityPlayer.bM;
/* 2200 */       this.ce = par1EntityPlayer.ce;
/* 2201 */       this.cf = par1EntityPlayer.cf;
/* 2202 */       this.cg = par1EntityPlayer.cg;
/* 2203 */       s(par1EntityPlayer.bQ());
/* 2204 */       this.ar = par1EntityPlayer.ar;
/*      */     }
/* 2206 */     else if (this.p.L().b("keepInventory")) {
/*      */       
/* 2208 */       this.bJ.b(par1EntityPlayer.bJ);
/* 2209 */       this.ce = par1EntityPlayer.ce;
/* 2210 */       this.cf = par1EntityPlayer.cf;
/* 2211 */       this.cg = par1EntityPlayer.cg;
/* 2212 */       s(par1EntityPlayer.bQ());
/*      */     } 
/*      */     
/* 2215 */     this.a = par1EntityPlayer.a;
/*      */ 
/*      */ 
/*      */     
/* 2219 */     bq old = par1EntityPlayer.getEntityData();
/* 2220 */     if (old.b("PlayerPersisted"))
/*      */     {
/* 2222 */       getEntityData().a("PlayerPersisted", old.l("PlayerPersisted"));
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean f_() {
/* 2232 */     return !this.cd.b;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void o() {}
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(yl par1EnumGameType) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public String c_() {
/* 2247 */     return this.bR;
/*      */   }
/*      */ 
/*      */   
/*      */   public bn s() {
/* 2252 */     return bn.a();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String a(String par1Str, Object... par2ArrayOfObj) {
/* 2260 */     return s().a(par1Str, par2ArrayOfObj);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public sl ce() {
/* 2268 */     return this.a;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ur p(int par1) {
/* 2276 */     return (par1 == 0) ? this.bJ.g() : this.bJ.b[par1 - 1];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ur bD() {
/* 2284 */     return this.bJ.g();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(int par1, ur par2ItemStack) {
/* 2292 */     this.bJ.b[par1] = par2ItemStack;
/*      */   }
/*      */ 
/*      */   
/*      */   public ur[] ae() {
/* 2297 */     return this.bJ.b;
/*      */   }
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public boolean cf() {
/* 2303 */     return v(1);
/*      */   }
/*      */ 
/*      */   
/*      */   public void openGui(Object mod, int modGuiId, yc world, int x, int y, int z) {
/* 2308 */     FMLNetworkHandler.openGui(this, mod, modGuiId, world, x, y, z);
/*      */   }
/*      */ }


/* Location:              /home/luigi/Documents/JAR.jar!/qx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */