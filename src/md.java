/*      */ import SCPCraft.entities.SCPEntityRat;
/*      */ import SCPCraft.entities.SCPEnumCreatureAttribute;
/*      */ import SCPCraft.mod_Others;
/*      */ import SCPCraft.mod_SCP;
/*      */ import SCPCraft.worldgen.SCPWorldGenStart;
/*      */ import cpw.mods.fml.relauncher.Side;
/*      */ import cpw.mods.fml.relauncher.SideOnly;
/*      */ import java.util.Collection;
/*      */ import java.util.HashMap;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import net.minecraftforge.common.ForgeHooks;
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
/*      */ public abstract class md
/*      */   extends lq
/*      */ {
/*   63 */   private static final float[] b = new float[] { 0.0F, 0.0F, 0.05F, 0.1F };
/*      */ 
/*      */   
/*   66 */   private static final float[] c = new float[] { 0.0F, 0.0F, 0.05F, 0.2F };
/*      */ 
/*      */   
/*   69 */   private static final float[] d = new float[] { 0.0F, 0.0F, 0.05F, 0.02F };
/*      */ 
/*      */   
/*   72 */   public static final float[] at = new float[] { 0.0F, 0.1F, 0.15F, 0.45F };
/*   73 */   public int au = 20;
/*      */   public float av;
/*      */   public float aw;
/*   76 */   public float ax = 0.0F;
/*   77 */   public float ay = 0.0F;
/*      */ 
/*      */   
/*   80 */   public float az = 0.0F;
/*      */ 
/*      */   
/*   83 */   public float aA = 0.0F;
/*      */   
/*      */   protected float aB;
/*      */   
/*      */   protected float aC;
/*      */   protected float aD;
/*      */   protected float aE;
/*      */   protected boolean aF = true;
/*   91 */   protected String aG = "/mob/char.png";
/*      */   protected boolean aH = true;
/*   93 */   protected float aI = 0.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*   98 */   protected String aJ = null;
/*   99 */   protected float aK = 1.0F;
/*      */ 
/*      */   
/*  102 */   protected int aL = 0;
/*  103 */   protected float aM = 0.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  109 */   public float aN = 0.1F;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  114 */   public float aO = 0.02F;
/*      */   
/*      */   public float aP;
/*      */   public float aQ;
/*  118 */   public int aR = aT();
/*      */ 
/*      */ 
/*      */   
/*      */   public int aS;
/*      */ 
/*      */ 
/*      */   
/*      */   public int aT;
/*      */ 
/*      */ 
/*      */   
/*      */   public int aU;
/*      */ 
/*      */   
/*      */   public int aV;
/*      */ 
/*      */   
/*      */   public int aW;
/*      */ 
/*      */   
/*  139 */   public float aX = 0.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  144 */   public int aY = 0;
/*  145 */   public int aZ = 0;
/*      */ 
/*      */   
/*      */   public float ba;
/*      */   
/*      */   public float bb;
/*      */   
/*      */   protected boolean bc = false;
/*      */   
/*      */   public int bd;
/*      */   
/*  156 */   public int be = -1;
/*  157 */   public float bf = (float)(Math.random() * 0.8999999761581421D + 0.10000000149011612D);
/*      */ 
/*      */   
/*      */   public float bg;
/*      */ 
/*      */   
/*      */   public float bh;
/*      */ 
/*      */   
/*      */   public float bi;
/*      */   
/*  168 */   protected qx bj = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  174 */   protected int bk = 0;
/*      */ 
/*      */   
/*  177 */   private md e = null;
/*  178 */   private int f = 0;
/*  179 */   private md g = null;
/*  180 */   public int bl = 0;
/*  181 */   protected HashMap bm = new HashMap<Object, Object>();
/*      */   
/*      */   private boolean h = true;
/*      */   
/*      */   private int i;
/*      */   
/*      */   private mp j;
/*      */   
/*      */   private mq bJ;
/*      */   
/*      */   private mo bK;
/*      */   
/*      */   private mm bL;
/*      */   private on bM;
/*      */   public final nd bn;
/*      */   protected final nd bo;
/*      */   private md bN;
/*      */   private oo bO;
/*      */   private float bP;
/*  200 */   private s bQ = new s(0, 0, 0);
/*      */ 
/*      */   
/*  203 */   private float bR = -1.0F;
/*      */ 
/*      */   
/*  206 */   private ur[] bS = new ur[5];
/*      */ 
/*      */   
/*  209 */   protected float[] bp = new float[5];
/*  210 */   private ur[] bT = new ur[5];
/*      */   
/*      */   public boolean bq = false;
/*      */   
/*  214 */   public int br = 0;
/*      */ 
/*      */   
/*      */   protected boolean bs = false;
/*      */ 
/*      */   
/*      */   private boolean bU = false;
/*      */ 
/*      */   
/*      */   protected int bt;
/*      */ 
/*      */   
/*      */   protected double bu;
/*      */ 
/*      */   
/*      */   protected double bv;
/*      */ 
/*      */   
/*      */   protected double bw;
/*      */ 
/*      */   
/*      */   protected double bx;
/*      */ 
/*      */   
/*      */   protected double by;
/*      */ 
/*      */   
/*  241 */   float bz = 0.0F;
/*      */ 
/*      */   
/*  244 */   protected int bA = 0;
/*      */ 
/*      */   
/*  247 */   protected int bB = 0;
/*      */   
/*      */   protected float bC;
/*      */   
/*      */   protected float bD;
/*      */   protected float bE;
/*      */   public boolean bF = false;
/*  254 */   protected float bG = 0.0F;
/*  255 */   protected float bH = 0.7F;
/*      */ 
/*      */   
/*  258 */   private int bV = 0;
/*      */ 
/*      */   
/*      */   private lq bW;
/*      */ 
/*      */   
/*  264 */   protected int bI = 0;
/*      */   
/*      */   private int create;
/*      */   
/*      */   public boolean isVermin;
/*      */   
/*      */   private int exposure;
/*      */   private boolean hasHeard513;
/*      */   public int blink;
/*      */   public int angry;
/*      */   
/*      */   public md(yc par1World) {
/*  276 */     super(par1World);
/*  277 */     this.m = true;
/*  278 */     this.bn = new nd((par1World != null && par1World.D != null) ? par1World.D : null);
/*  279 */     this.bo = new nd((par1World != null && par1World.D != null) ? par1World.D : null);
/*  280 */     this.j = new mp(this);
/*  281 */     this.bJ = new mq(this);
/*  282 */     this.bK = new mo(this);
/*  283 */     this.bL = new mm(this);
/*  284 */     this.bM = new on(this, par1World, 16.0F);
/*  285 */     this.bO = new oo(this);
/*  286 */     this.aw = (float)(Math.random() + 1.0D) * 0.01F;
/*  287 */     b(this.t, this.u, this.v);
/*  288 */     this.av = (float)Math.random() * 12398.0F;
/*  289 */     this.z = (float)(Math.random() * Math.PI * 2.0D);
/*  290 */     this.az = this.z;
/*      */     
/*  292 */     this.hasHeard513 = false;
/*  293 */     this.isVermin = false;
/*  294 */     this.exposure = 0;
/*  295 */     this.blink = 300;
/*  296 */     this.angry = 3000;
/*      */ 
/*      */     
/*  299 */     for (int var2 = 0; var2 < this.bp.length; var2++)
/*      */     {
/*  301 */       this.bp[var2] = 0.05F;
/*      */     }
/*      */     
/*  304 */     this.X = 0.5F;
/*      */   }
/*      */ 
/*      */   
/*      */   public mp aw() {
/*  309 */     return this.j;
/*      */   }
/*      */ 
/*      */   
/*      */   public mq ax() {
/*  314 */     return this.bJ;
/*      */   }
/*      */ 
/*      */   
/*      */   public mo ay() {
/*  319 */     return this.bK;
/*      */   }
/*      */ 
/*      */   
/*      */   public on az() {
/*  324 */     return this.bM;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public oo aA() {
/*  332 */     return this.bO;
/*      */   }
/*      */ 
/*      */   
/*      */   public Random aB() {
/*  337 */     return this.aa;
/*      */   }
/*      */ 
/*      */   
/*      */   public md aC() {
/*  342 */     return this.e;
/*      */   }
/*      */ 
/*      */   
/*      */   public md aD() {
/*  347 */     return this.g;
/*      */   }
/*      */ 
/*      */   
/*      */   public void l(lq par1Entity) {
/*  352 */     if (par1Entity instanceof md)
/*      */     {
/*  354 */       this.g = (md)par1Entity;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public int aE() {
/*  360 */     return this.bB;
/*      */   }
/*      */ 
/*      */   
/*      */   public float ap() {
/*  365 */     return this.az;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public void d(float par1) {
/*  375 */     this.az = par1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float aF() {
/*  383 */     return this.bP;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void e(float par1) {
/*  391 */     this.bP = par1;
/*  392 */     f(par1);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean m(lq par1Entity) {
/*  397 */     l(par1Entity);
/*  398 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public md aG() {
/*  406 */     return this.bN;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(md par1EntityLiving) {
/*  414 */     this.bN = par1EntityLiving;
/*  415 */     ForgeHooks.onLivingSetAttackTarget(this, par1EntityLiving);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(Class<qc> par1Class) {
/*  423 */     return (qc.class != par1Class && qg.class != par1Class);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void aH() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void a(double par1, boolean par3) {
/*  438 */     if (!H())
/*      */     {
/*  440 */       I();
/*      */     }
/*      */     
/*  443 */     if (par3 && this.S > 0.0F) {
/*      */       
/*  445 */       int var4 = ke.c(this.t);
/*  446 */       int var5 = ke.c(this.u - 0.20000000298023224D - this.M);
/*  447 */       int var6 = ke.c(this.v);
/*  448 */       int var7 = this.p.a(var4, var5, var6);
/*      */       
/*  450 */       if (var7 == 0) {
/*      */         
/*  452 */         int var8 = this.p.e(var4, var5 - 1, var6);
/*      */         
/*  454 */         if (var8 == 11 || var8 == 32 || var8 == 21)
/*      */         {
/*  456 */           var7 = this.p.a(var4, var5 - 1, var6);
/*      */         }
/*      */       } 
/*      */       
/*  460 */       if (var7 > 0)
/*      */       {
/*  462 */         amq.p[var7].a(this.p, var4, var5, var6, this, this.S);
/*      */       }
/*      */     } 
/*      */     
/*  466 */     super.a(par1, par3);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean aI() {
/*  474 */     return e(ke.c(this.t), ke.c(this.u), ke.c(this.v));
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean e(int par1, int par2, int par3) {
/*  479 */     return (this.bR == -1.0F) ? true : ((this.bQ.e(par1, par2, par3) < this.bR * this.bR));
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(int par1, int par2, int par3, int par4) {
/*  484 */     this.bQ.b(par1, par2, par3);
/*  485 */     this.bR = par4;
/*      */   }
/*      */ 
/*      */   
/*      */   public s aJ() {
/*  490 */     return this.bQ;
/*      */   }
/*      */ 
/*      */   
/*      */   public float aK() {
/*  495 */     return this.bR;
/*      */   }
/*      */ 
/*      */   
/*      */   public void aL() {
/*  500 */     this.bR = -1.0F;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean aM() {
/*  505 */     return (this.bR != -1.0F);
/*      */   }
/*      */ 
/*      */   
/*      */   public void c(md par1EntityLiving) {
/*  510 */     this.e = par1EntityLiving;
/*  511 */     this.f = (this.e != null) ? 60 : 0;
/*  512 */     ForgeHooks.onLivingSetAttackTarget(this, par1EntityLiving);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a() {
/*  517 */     this.ag.a(8, Integer.valueOf(this.i));
/*  518 */     this.ag.a(9, Byte.valueOf((byte)0));
/*  519 */     this.ag.a(10, Byte.valueOf((byte)0));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean n(lq par1Entity) {
/*  527 */     return (this.p.a(this.p.S().a(this.t, this.u + e(), this.v), this.p.S().a(par1Entity.t, par1Entity.u + par1Entity.e(), par1Entity.v)) == null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public String O() {
/*  537 */     return this.aG;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean L() {
/*  545 */     return !this.L;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean M() {
/*  553 */     return !this.L;
/*      */   }
/*      */ 
/*      */   
/*      */   public float e() {
/*  558 */     return this.O * 0.85F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int aN() {
/*  566 */     return 80;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void aO() {
/*  574 */     String var1 = aY();
/*      */     
/*  576 */     if (var1 != null)
/*      */     {
/*  578 */       a(var1, aX(), aV());
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*  583 */   public static int blinkSpeed = 2;
/*      */   
/*      */   public int setBlinkSpeed(int m) {
/*  586 */     return blinkSpeed = m;
/*      */   }
/*      */   
/*      */   public boolean hasEntityHeard513() {
/*  590 */     return this.hasHeard513;
/*      */   }
/*      */   
/*      */   public void setHeard513(boolean par1) {
/*  594 */     this.hasHeard513 = par1;
/*      */   }
/*      */   
/*      */   public int getBlink() {
/*  598 */     return this.blink;
/*      */   }
/*      */   
/*      */   public void setBlink(int par1) {
/*  602 */     this.blink = par1;
/*      */   }
/*      */   
/*      */   public int getAnger() {
/*  606 */     return this.angry;
/*      */   }
/*      */   
/*      */   public void setAnger(int par1) {
/*  610 */     this.angry = par1;
/*      */   }
/*      */   
/*      */   public boolean handleSCP354Movement() {
/*  614 */     return this.p.a(this.D.b(-0.10000000149011612D, -0.4000000059604645D, -0.10000000149011612D), mod_SCP.SCP354);
/*      */   }
/*      */   
/*      */   public int decreaseBlinkSupply(int par1) {
/*  618 */     return this.blink -= par1;
/*      */   }
/*      */   
/*      */   public int decreaseAngrySupply(int par1) {
/*  622 */     return this.angry -= par1;
/*      */   }
/*      */   
/*      */   public int increaseExposure(int par1) {
/*  626 */     return this.exposure += par1;
/*      */   }
/*      */   
/*      */   public int getExposure() {
/*  630 */     return this.exposure;
/*      */   }
/*      */   
/*      */   public void setExposure(int par1) {
/*  634 */     this.exposure = par1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void y() {
/*  643 */     this.aP = this.aQ;
/*  644 */     super.y();
/*  645 */     this.p.D.a("mobBaseTick");
/*      */     
/*  647 */     if (S() && this.aa.nextInt(1000) < this.aU++) {
/*      */       
/*  649 */       this.aU = -aN();
/*  650 */       aO();
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  655 */     if (a(mod_SCP.crystal)) {
/*      */       
/*  657 */       a(mod_SCP.crystalDamage, 1 + b(mod_SCP.crystal).c() + this.p.s);
/*  658 */       this.x = -1.0D;
/*  659 */       this.w = 0.0D;
/*  660 */       this.y = 0.0D;
/*  661 */       this.A *= 0.0F;
/*  662 */       this.z *= 0.0F;
/*  663 */       this.az *= 0.0F;
/*  664 */       this.bP *= 0.0F;
/*  665 */       this.bH *= 0.0F;
/*  666 */       this.aN *= 0.0F;
/*  667 */       this.bC *= 0.0F;
/*  668 */       this.bD *= 0.0F;
/*      */     } 
/*  670 */     if (a(mod_SCP.verminGod)) {
/*      */       
/*  672 */       this.isVermin = true;
/*  673 */       SCPEntityRat rat = new SCPEntityRat(this.p);
/*  674 */       rat.b(this.t, this.u, this.v);
/*  675 */       if (this.aa.nextInt(60) == 0) this.p.d((lq)rat); 
/*      */     } 
/*  677 */     if (a(mod_SCP.eaten))
/*      */     {
/*  679 */       a(mod_SCP.SCP002, 1);
/*      */     }
/*  681 */     if (a(mod_SCP.shake) && b(mod_SCP.shake).c() >= 3) {
/*      */       
/*  683 */       this.w = 0.0D;
/*  684 */       this.y = 0.0D;
/*      */     } 
/*  686 */     if (a(mod_SCP.electricity)) {
/*      */       
/*  688 */       a(mod_SCP.electricDamage, 0 + b(mod_SCP.electricity).c());
/*  689 */       this.x = (0.01F * b(mod_SCP.electricity).c());
/*  690 */       this.y = (-0.1F * b(mod_SCP.electricity).c());
/*      */     } 
/*      */     
/*  693 */     if (S() && mod_SCP.isActive) {
/*      */       
/*  695 */       setBlink(decreaseBlinkSupply(blinkSpeed));
/*  696 */       if (getBlink() <= 0)
/*      */       {
/*  698 */         setBlink(300);
/*      */       }
/*      */     } 
/*  701 */     if (S() && !mod_Others.wantsToTalk) {
/*      */       
/*  703 */       setAnger(decreaseAngrySupply(1));
/*  704 */       if (getAnger() <= 0)
/*      */       {
/*  706 */         mod_Others.wantsToTalk = true;
/*      */       }
/*      */     } else {
/*  709 */       setAnger(3000);
/*      */     } 
/*      */     
/*  712 */     if (S() && T())
/*      */     {
/*  714 */       a(lh.d, 1);
/*      */     }
/*      */     
/*  717 */     if (F() || this.p.I)
/*      */     {
/*  719 */       B();
/*      */     }
/*      */     
/*  722 */     boolean var1 = (this instanceof qx && ((qx)this).cd.a);
/*      */     
/*  724 */     if (S() && a(agi.h) && !bc() && !this.bm.containsKey(Integer.valueOf(ll.o.H)) && !var1) {
/*      */       
/*  726 */       f(g(al()));
/*      */       
/*  728 */       if (al() == -20) {
/*      */         
/*  730 */         f(0);
/*      */         
/*  732 */         for (int var2 = 0; var2 < 8; var2++) {
/*      */           
/*  734 */           float var3 = this.aa.nextFloat() - this.aa.nextFloat();
/*  735 */           float var4 = this.aa.nextFloat() - this.aa.nextFloat();
/*  736 */           float var5 = this.aa.nextFloat() - this.aa.nextFloat();
/*  737 */           this.p.a("bubble", this.t + var3, this.u + var4, this.v + var5, this.w, this.x, this.y);
/*      */         } 
/*      */         
/*  740 */         a(lh.e, 2);
/*      */       } 
/*      */       
/*  743 */       B();
/*      */     }
/*      */     else {
/*      */       
/*  747 */       f(300);
/*      */     } 
/*      */     
/*  750 */     this.ba = this.bb;
/*      */     
/*  752 */     if (this.aZ > 0)
/*      */     {
/*  754 */       this.aZ--;
/*      */     }
/*      */     
/*  757 */     if (this.aV > 0)
/*      */     {
/*  759 */       this.aV--;
/*      */     }
/*      */     
/*  762 */     if (this.ae > 0)
/*      */     {
/*  764 */       this.ae--;
/*      */     }
/*      */     
/*  767 */     if (this.aR <= 0)
/*      */     {
/*  769 */       aP();
/*      */     }
/*      */     
/*  772 */     if (this.bk > 0) {
/*      */       
/*  774 */       this.bk--;
/*      */     }
/*      */     else {
/*      */       
/*  778 */       this.bj = null;
/*      */     } 
/*      */     
/*  781 */     if (this.g != null && !this.g.S())
/*      */     {
/*  783 */       this.g = null;
/*      */     }
/*      */     
/*  786 */     if (this.e != null)
/*      */     {
/*  788 */       if (!this.e.S()) {
/*      */         
/*  790 */         c((md)null);
/*      */       }
/*  792 */       else if (this.f > 0) {
/*      */         
/*  794 */         this.f--;
/*      */       }
/*      */       else {
/*      */         
/*  798 */         c((md)null);
/*      */       } 
/*      */     }
/*      */     
/*  802 */     bx();
/*  803 */     this.aE = this.aD;
/*  804 */     this.ay = this.ax;
/*  805 */     this.aA = this.az;
/*  806 */     this.B = this.z;
/*  807 */     this.C = this.A;
/*  808 */     this.p.D.b();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void aP() {
/*  816 */     this.aY++;
/*      */     
/*  818 */     if (this.aY == 20) {
/*      */ 
/*      */ 
/*      */       
/*  822 */       if (!this.p.I && (this.bk > 0 || aQ()) && !h_()) {
/*      */         
/*  824 */         int i = c(this.bj);
/*      */         
/*  826 */         while (i > 0) {
/*      */           
/*  828 */           int var2 = lz.a(i);
/*  829 */           i -= var2;
/*  830 */           this.p.d((lq)new lz(this.p, this.t, this.u, this.v, var2));
/*      */         } 
/*      */       } 
/*      */       
/*  834 */       x();
/*      */       
/*  836 */       for (int var1 = 0; var1 < 20; var1++) {
/*      */         
/*  838 */         double var8 = this.aa.nextGaussian() * 0.02D;
/*  839 */         double var4 = this.aa.nextGaussian() * 0.02D;
/*  840 */         double var6 = this.aa.nextGaussian() * 0.02D;
/*  841 */         this.p.a("explode", this.t + (this.aa.nextFloat() * this.N * 2.0F) - this.N, this.u + (this.aa.nextFloat() * this.O), this.v + (this.aa.nextFloat() * this.N * 2.0F) - this.N, var8, var4, var6);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected int g(int par1) {
/*  851 */     int var2 = xe.b(this);
/*  852 */     return (var2 > 0 && this.aa.nextInt(var2 + 1) > 0) ? par1 : (par1 - 1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected int c(qx par1EntityPlayer) {
/*  860 */     if (this.bd > 0) {
/*      */       
/*  862 */       int var2 = this.bd;
/*  863 */       ur[] var3 = ae();
/*      */       
/*  865 */       for (int var4 = 0; var4 < var3.length; var4++) {
/*      */         
/*  867 */         if (var3[var4] != null && this.bp[var4] <= 1.0F)
/*      */         {
/*  869 */           var2 += 1 + this.aa.nextInt(3);
/*      */         }
/*      */       } 
/*      */       
/*  873 */       return var2;
/*      */     } 
/*      */ 
/*      */     
/*  877 */     return this.bd;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean aQ() {
/*  886 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void aR() {
/*  894 */     for (int var1 = 0; var1 < 20; var1++) {
/*      */       
/*  896 */       double var2 = this.aa.nextGaussian() * 0.02D;
/*  897 */       double var4 = this.aa.nextGaussian() * 0.02D;
/*  898 */       double var6 = this.aa.nextGaussian() * 0.02D;
/*  899 */       double var8 = 10.0D;
/*  900 */       this.p.a("explode", this.t + (this.aa.nextFloat() * this.N * 2.0F) - this.N - var2 * var8, this.u + (this.aa.nextFloat() * this.O) - var4 * var8, this.v + (this.aa.nextFloat() * this.N * 2.0F) - this.N - var6 * var8, var2, var4, var6);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void U() {
/*  909 */     super.U();
/*  910 */     this.aB = this.aC;
/*  911 */     this.aC = 0.0F;
/*  912 */     this.S = 0.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public void a(double par1, double par3, double par5, float par7, float par8, int par9) {
/*  923 */     this.M = 0.0F;
/*  924 */     this.bu = par1;
/*  925 */     this.bv = par3;
/*  926 */     this.bw = par5;
/*  927 */     this.bx = par7;
/*  928 */     this.by = par8;
/*  929 */     this.bt = par9;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void j_() {
/*  937 */     if (ForgeHooks.onLivingUpdate(this)) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/*  942 */     super.j_();
/*      */     
/*  944 */     if (!this.p.I) {
/*      */       int var1;
/*      */ 
/*      */       
/*  948 */       for (var1 = 0; var1 < 5; var1++) {
/*      */         
/*  950 */         ur var2 = p(var1);
/*      */         
/*  952 */         if (!ur.b(var2, this.bT[var1])) {
/*      */           
/*  954 */           ((in)this.p).p().a(this, (ef)new ev(this.k, var1, var2));
/*  955 */           this.bT[var1] = (var2 == null) ? null : var2.l();
/*      */         } 
/*      */       } 
/*      */       
/*  959 */       var1 = bJ();
/*      */       
/*  961 */       if (var1 > 0) {
/*      */         
/*  963 */         if (this.bl <= 0)
/*      */         {
/*  965 */           this.bl = 20 * (30 - var1);
/*      */         }
/*      */         
/*  968 */         this.bl--;
/*      */         
/*  970 */         if (this.bl <= 0)
/*      */         {
/*  972 */           r(var1 - 1);
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/*  977 */     c();
/*  978 */     double var12 = this.t - this.q;
/*  979 */     double var3 = this.v - this.s;
/*  980 */     float var5 = (float)(var12 * var12 + var3 * var3);
/*  981 */     float var6 = this.ax;
/*  982 */     float var7 = 0.0F;
/*  983 */     this.aB = this.aC;
/*  984 */     float var8 = 0.0F;
/*      */     
/*  986 */     if (var5 > 0.0025000002F) {
/*      */       
/*  988 */       var8 = 1.0F;
/*  989 */       var7 = (float)Math.sqrt(var5) * 3.0F;
/*  990 */       var6 = (float)Math.atan2(var3, var12) * 180.0F / 3.1415927F - 90.0F;
/*      */     } 
/*      */     
/*  993 */     if (this.aQ > 0.0F)
/*      */     {
/*  995 */       var6 = this.z;
/*      */     }
/*      */     
/*  998 */     if (!this.E)
/*      */     {
/* 1000 */       var8 = 0.0F;
/*      */     }
/*      */     
/* 1003 */     this.aC += (var8 - this.aC) * 0.3F;
/* 1004 */     this.p.D.a("headTurn");
/*      */     
/* 1006 */     if (be()) {
/*      */       
/* 1008 */       this.bL.a();
/*      */     }
/*      */     else {
/*      */       
/* 1012 */       float var9 = ke.g(var6 - this.ax);
/* 1013 */       this.ax += var9 * 0.3F;
/* 1014 */       float var10 = ke.g(this.z - this.ax);
/* 1015 */       boolean var11 = (var10 < -90.0F || var10 >= 90.0F);
/*      */       
/* 1017 */       if (var10 < -75.0F)
/*      */       {
/* 1019 */         var10 = -75.0F;
/*      */       }
/*      */       
/* 1022 */       if (var10 >= 75.0F)
/*      */       {
/* 1024 */         var10 = 75.0F;
/*      */       }
/*      */       
/* 1027 */       this.ax = this.z - var10;
/*      */       
/* 1029 */       if (var10 * var10 > 2500.0F)
/*      */       {
/* 1031 */         this.ax += var10 * 0.2F;
/*      */       }
/*      */       
/* 1034 */       if (var11)
/*      */       {
/* 1036 */         var7 *= -1.0F;
/*      */       }
/*      */     } 
/*      */     
/* 1040 */     this.p.D.b();
/* 1041 */     this.p.D.a("rangeChecks");
/*      */     
/* 1043 */     while (this.z - this.B < -180.0F)
/*      */     {
/* 1045 */       this.B -= 360.0F;
/*      */     }
/*      */     
/* 1048 */     while (this.z - this.B >= 180.0F)
/*      */     {
/* 1050 */       this.B += 360.0F;
/*      */     }
/*      */     
/* 1053 */     while (this.ax - this.ay < -180.0F)
/*      */     {
/* 1055 */       this.ay -= 360.0F;
/*      */     }
/*      */     
/* 1058 */     while (this.ax - this.ay >= 180.0F)
/*      */     {
/* 1060 */       this.ay += 360.0F;
/*      */     }
/*      */     
/* 1063 */     while (this.A - this.C < -180.0F)
/*      */     {
/* 1065 */       this.C -= 360.0F;
/*      */     }
/*      */     
/* 1068 */     while (this.A - this.C >= 180.0F)
/*      */     {
/* 1070 */       this.C += 360.0F;
/*      */     }
/*      */     
/* 1073 */     while (this.az - this.aA < -180.0F)
/*      */     {
/* 1075 */       this.aA -= 360.0F;
/*      */     }
/*      */     
/* 1078 */     while (this.az - this.aA >= 180.0F)
/*      */     {
/* 1080 */       this.aA += 360.0F;
/*      */     }
/*      */     
/* 1083 */     this.p.D.b();
/* 1084 */     this.aD += var7;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void i(int par1) {
/* 1092 */     if (this.aR > 0) {
/*      */       
/* 1094 */       this.aR += par1;
/*      */       
/* 1096 */       if (this.aR > aT())
/*      */       {
/* 1098 */         this.aR = aT();
/*      */       }
/*      */       
/* 1101 */       this.ae = this.au / 2;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public abstract int aT();
/*      */   
/*      */   public int aU() {
/* 1109 */     return this.aR;
/*      */   }
/*      */ 
/*      */   
/*      */   public void j(int par1) {
/* 1114 */     this.aR = par1;
/*      */     
/* 1116 */     if (par1 > aT())
/*      */     {
/* 1118 */       par1 = aT();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(lh par1DamageSource, int par2) {
/* 1127 */     if (ForgeHooks.onLivingAttack(this, par1DamageSource, par2))
/*      */     {
/* 1129 */       return false;
/*      */     }
/*      */     
/* 1132 */     if (ar())
/*      */     {
/* 1134 */       return false;
/*      */     }
/* 1136 */     if (this.p.I)
/*      */     {
/* 1138 */       return false;
/*      */     }
/*      */ 
/*      */     
/* 1142 */     this.bB = 0;
/*      */     
/* 1144 */     if (this.aR <= 0)
/*      */     {
/* 1146 */       return false;
/*      */     }
/* 1148 */     if (par1DamageSource.k() && a(ll.n))
/*      */     {
/* 1150 */       return false;
/*      */     }
/*      */ 
/*      */     
/* 1154 */     if ((par1DamageSource == lh.o || par1DamageSource == lh.p) && p(4) != null) {
/*      */       
/* 1156 */       p(4).a(par2 * 4 + this.aa.nextInt(par2 * 2), this);
/* 1157 */       par2 = (int)(par2 * 0.75F);
/*      */     } 
/*      */     
/* 1160 */     this.bh = 1.5F;
/* 1161 */     boolean var3 = true;
/*      */     
/* 1163 */     if (this.ae > this.au / 2.0F) {
/*      */       
/* 1165 */       if (par2 <= this.bA)
/*      */       {
/* 1167 */         return false;
/*      */       }
/*      */       
/* 1170 */       d(par1DamageSource, par2 - this.bA);
/* 1171 */       this.bA = par2;
/* 1172 */       var3 = false;
/*      */     }
/*      */     else {
/*      */       
/* 1176 */       this.bA = par2;
/* 1177 */       this.aS = this.aR;
/* 1178 */       this.ae = this.au;
/* 1179 */       d(par1DamageSource, par2);
/* 1180 */       this.aV = this.aW = 10;
/*      */     } 
/*      */     
/* 1183 */     this.aX = 0.0F;
/* 1184 */     lq var4 = par1DamageSource.g();
/*      */     
/* 1186 */     if (var4 != null) {
/*      */       
/* 1188 */       if (var4 instanceof md)
/*      */       {
/* 1190 */         c((md)var4);
/*      */       }
/*      */       
/* 1193 */       if (var4 instanceof qx) {
/*      */         
/* 1195 */         this.bk = 60;
/* 1196 */         this.bj = (qx)var4;
/*      */       }
/* 1198 */       else if (var4 instanceof pk) {
/*      */         
/* 1200 */         pk var5 = (pk)var4;
/*      */         
/* 1202 */         if (var5.m()) {
/*      */           
/* 1204 */           this.bk = 60;
/* 1205 */           this.bj = null;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 1210 */     if (var3) {
/*      */       
/* 1212 */       this.p.a(this, (byte)2);
/*      */       
/* 1214 */       if (par1DamageSource != lh.e && par1DamageSource != lh.l)
/*      */       {
/* 1216 */         K();
/*      */       }
/*      */       
/* 1219 */       if (var4 != null) {
/*      */         
/* 1221 */         double var9 = var4.t - this.t;
/*      */         
/*      */         double var7;
/* 1224 */         for (var7 = var4.v - this.v; var9 * var9 + var7 * var7 < 1.0E-4D; var7 = (Math.random() - Math.random()) * 0.01D)
/*      */         {
/* 1226 */           var9 = (Math.random() - Math.random()) * 0.01D;
/*      */         }
/*      */         
/* 1229 */         this.aX = (float)(Math.atan2(var7, var9) * 180.0D / Math.PI) - this.z;
/* 1230 */         a(var4, par2, var9, var7);
/*      */       }
/*      */       else {
/*      */         
/* 1234 */         this.aX = ((int)(Math.random() * 2.0D) * 180);
/*      */       } 
/*      */     } 
/*      */     
/* 1238 */     if (this.aR <= 0) {
/*      */       
/* 1240 */       if (var3)
/*      */       {
/* 1242 */         a(ba(), aX(), aV());
/*      */       }
/*      */       
/* 1245 */       a(par1DamageSource);
/*      */     }
/* 1247 */     else if (var3) {
/*      */       
/* 1249 */       a(aZ(), aX(), aV());
/*      */     } 
/*      */     
/* 1252 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float aV() {
/* 1262 */     return h_() ? ((this.aa.nextFloat() - this.aa.nextFloat()) * 0.2F + 1.5F) : ((this.aa.nextFloat() - this.aa.nextFloat()) * 0.2F + 1.0F);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public void ac() {
/* 1272 */     this.aV = this.aW = 10;
/* 1273 */     this.aX = 0.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int aW() {
/* 1281 */     int var1 = 0;
/* 1282 */     ur[] var2 = ae();
/* 1283 */     int var3 = var2.length;
/*      */     
/* 1285 */     for (int var4 = 0; var4 < var3; var4++) {
/*      */       
/* 1287 */       ur var5 = var2[var4];
/*      */       
/* 1289 */       if (var5 != null && var5.b() instanceof su) {
/*      */         
/* 1291 */         int var6 = ((su)var5.b()).b;
/* 1292 */         var1 += var6;
/*      */       } 
/*      */     } 
/*      */     
/* 1296 */     return var1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void k(int par1) {}
/*      */ 
/*      */ 
/*      */   
/*      */   protected int b(lh par1DamageSource, int par2) {
/* 1306 */     if (!par1DamageSource.c()) {
/*      */       
/* 1308 */       int var3 = 25 - aW();
/* 1309 */       int var4 = par2 * var3 + this.aT;
/* 1310 */       k(par2);
/* 1311 */       par2 = var4 / 25;
/* 1312 */       this.aT = var4 % 25;
/*      */     } 
/*      */     
/* 1315 */     return par2;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected int c(lh par1DamageSource, int par2) {
/* 1323 */     if (a(ll.m)) {
/*      */       
/* 1325 */       int var3 = (b(ll.m).c() + 1) * 5;
/* 1326 */       int var4 = 25 - var3;
/* 1327 */       int var5 = par2 * var4 + this.aT;
/* 1328 */       par2 = var5 / 25;
/* 1329 */       this.aT = var5 % 25;
/*      */     } 
/*      */     
/* 1332 */     return par2;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void d(lh par1DamageSource, int par2) {
/* 1341 */     if (!ar()) {
/*      */       
/* 1343 */       par2 = ForgeHooks.onLivingHurt(this, par1DamageSource, par2);
/* 1344 */       if (par2 <= 0) {
/*      */         return;
/*      */       }
/*      */       
/* 1348 */       par2 = b(par1DamageSource, par2);
/* 1349 */       par2 = c(par1DamageSource, par2);
/* 1350 */       this.aR -= par2;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float aX() {
/* 1359 */     return 1.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String aY() {
/* 1367 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String aZ() {
/* 1375 */     return "damage.hit";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String ba() {
/* 1383 */     return "damage.hit";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(lq par1Entity, int par2, double par3, double par5) {
/* 1391 */     this.am = true;
/* 1392 */     float var7 = ke.a(par3 * par3 + par5 * par5);
/* 1393 */     float var8 = 0.4F;
/* 1394 */     this.w /= 2.0D;
/* 1395 */     this.x /= 2.0D;
/* 1396 */     this.y /= 2.0D;
/* 1397 */     this.w -= par3 / var7 * var8;
/* 1398 */     this.x += var8;
/* 1399 */     this.y -= par5 / var7 * var8;
/*      */     
/* 1401 */     if (this.x > 0.4000000059604645D)
/*      */     {
/* 1403 */       this.x = 0.4000000059604645D;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(lh par1DamageSource) {
/* 1412 */     if (ForgeHooks.onLivingDeath(this, par1DamageSource)) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/* 1417 */     lq var2 = par1DamageSource.g();
/* 1418 */     lq var5 = par1DamageSource.f();
/*      */ 
/*      */     
/* 1421 */     if (var5 != null && a(mod_SCP.verminGod)) ((md)var5).d(new lm(mod_SCP.verminGod.H, 10000, 1)); 
/* 1422 */     if (var2 instanceof qx && ((md)var2).a(mod_SCP.verminGod)) d(new lm(mod_SCP.verminGod.H, 10000, 1));
/*      */     
/* 1424 */     if (this.aL >= 0 && var2 != null)
/*      */     {
/* 1426 */       var2.c(this, this.aL);
/*      */     }
/*      */     
/* 1429 */     if (var2 != null)
/*      */     {
/* 1431 */       var2.a(this);
/*      */     }
/*      */     
/* 1434 */     this.bc = true;
/*      */     
/* 1436 */     if (!this.p.I) {
/*      */       
/* 1438 */       int var3 = 0;
/*      */       
/* 1440 */       if (var2 instanceof qx)
/*      */       {
/* 1442 */         var3 = xe.g((md)var2);
/*      */       }
/*      */       
/* 1445 */       this.captureDrops = true;
/* 1446 */       this.capturedDrops.clear();
/* 1447 */       int var4 = 0;
/*      */       
/* 1449 */       if (!h_() && this.p.L().b("doMobLoot")) {
/*      */         
/* 1451 */         a((this.bk > 0), var3);
/* 1452 */         b((this.bk > 0), var3);
/*      */         
/* 1454 */         if (this.bk > 0) {
/*      */           
/* 1456 */           var4 = this.aa.nextInt(200) - var3;
/*      */           
/* 1458 */           if (var4 < 5)
/*      */           {
/* 1460 */             l((var4 <= 0) ? 1 : 0);
/*      */           }
/*      */         } 
/*      */       } 
/*      */       
/* 1465 */       this.captureDrops = false;
/*      */       
/* 1467 */       if (!ForgeHooks.onLivingDrops(this, par1DamageSource, this.capturedDrops, var3, (this.bk > 0), var4))
/*      */       {
/* 1469 */         for (px item : this.capturedDrops)
/*      */         {
/* 1471 */           this.p.d((lq)item);
/*      */         }
/*      */       }
/*      */     } 
/*      */     
/* 1476 */     this.p.a(this, (byte)3);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void l(int par1) {}
/*      */ 
/*      */ 
/*      */   
/*      */   protected void a(boolean par1, int par2) {
/* 1486 */     int var3 = bb();
/*      */     
/* 1488 */     if (var3 > 0) {
/*      */       
/* 1490 */       int var4 = this.aa.nextInt(3);
/*      */       
/* 1492 */       if (par2 > 0)
/*      */       {
/* 1494 */         var4 += this.aa.nextInt(par2 + 1);
/*      */       }
/*      */       
/* 1497 */       for (int var5 = 0; var5 < var4; var5++)
/*      */       {
/* 1499 */         b(var3, 1);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected int bb() {
/* 1509 */     return 0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void a(float par1) {
/* 1517 */     par1 = ForgeHooks.onLivingFall(this, par1);
/* 1518 */     if (par1 <= 0.0F) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/* 1523 */     super.a(par1);
/* 1524 */     int var2 = ke.f(par1 - 3.0F);
/*      */     
/* 1526 */     if (var2 > 0) {
/*      */       
/* 1528 */       if (var2 > 4) {
/*      */         
/* 1530 */         a("damage.fallbig", 1.0F, 1.0F);
/*      */       }
/*      */       else {
/*      */         
/* 1534 */         a("damage.fallsmall", 1.0F, 1.0F);
/*      */       } 
/*      */       
/* 1537 */       a(lh.h, var2);
/* 1538 */       int var3 = this.p.a(ke.c(this.t), ke.c(this.u - 0.20000000298023224D - this.M), ke.c(this.v));
/*      */       
/* 1540 */       if (var3 > 0) {
/*      */         
/* 1542 */         amu var4 = (amq.p[var3]).cz;
/* 1543 */         a(var4.e(), var4.c() * 0.5F, var4.d() * 0.75F);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void e(float par1, float par2) {
/* 1555 */     if (H() && (!(this instanceof qx) || !((qx)this).cd.b)) {
/*      */       
/* 1557 */       double d = this.u;
/* 1558 */       a(par1, par2, be() ? 0.04F : 0.02F);
/* 1559 */       d(this.w, this.x, this.y);
/* 1560 */       this.w *= 0.800000011920929D;
/* 1561 */       this.x *= 0.800000011920929D;
/* 1562 */       this.y *= 0.800000011920929D;
/* 1563 */       this.x -= 0.02D;
/*      */       
/* 1565 */       if (this.F && c(this.w, this.x + 0.6000000238418579D - this.u + d, this.y))
/*      */       {
/* 1567 */         this.x = 0.30000001192092896D;
/*      */       }
/*      */     }
/* 1570 */     else if (J() && (!(this instanceof qx) || !((qx)this).cd.b)) {
/*      */       
/* 1572 */       double d = this.u;
/* 1573 */       a(par1, par2, 0.02F);
/* 1574 */       d(this.w, this.x, this.y);
/* 1575 */       this.w *= 0.5D;
/* 1576 */       this.x *= 0.5D;
/* 1577 */       this.y *= 0.5D;
/* 1578 */       this.x -= 0.02D;
/*      */       
/* 1580 */       if (this.F && c(this.w, this.x + 0.6000000238418579D - this.u + d, this.y))
/*      */       {
/* 1582 */         this.x = 0.30000001192092896D;
/*      */       
/*      */       }
/*      */     }
/* 1586 */     else if (handleSCP354Movement() && (!(this instanceof qx) || !((qx)this).cd.b)) {
/*      */       
/* 1588 */       double d = this.u;
/* 1589 */       a(par1, par2, 0.02F);
/* 1590 */       d(this.w, this.x, this.y);
/* 1591 */       this.w *= 0.5D;
/* 1592 */       this.x *= 0.5D;
/* 1593 */       this.y *= 0.5D;
/* 1594 */       this.x -= 0.02D;
/* 1595 */       if (this.F && c(this.w, this.x + 0.6000000238418579D - this.u + d, this.y))
/*      */       {
/* 1597 */         this.x = 0.30000001192092896D;
/*      */       }
/*      */     }
/*      */     else {
/*      */       
/* 1602 */       float var5, var3 = 0.91F;
/*      */       
/* 1604 */       if (this.E) {
/*      */         
/* 1606 */         var3 = 0.54600006F;
/* 1607 */         int var4 = this.p.a(ke.c(this.t), ke.c(this.D.b) - 1, ke.c(this.v));
/*      */         
/* 1609 */         if (var4 > 0)
/*      */         {
/* 1611 */           var3 = (amq.p[var4]).cC * 0.91F;
/*      */         }
/*      */       } 
/*      */       
/* 1615 */       float var8 = 0.16277136F / var3 * var3 * var3;
/*      */ 
/*      */       
/* 1618 */       if (this.E) {
/*      */         
/* 1620 */         if (be()) {
/*      */           
/* 1622 */           var5 = aF();
/*      */         }
/*      */         else {
/*      */           
/* 1626 */           var5 = this.aN;
/*      */         } 
/*      */         
/* 1629 */         var5 *= var8;
/*      */       }
/*      */       else {
/*      */         
/* 1633 */         var5 = this.aO;
/*      */       } 
/*      */       
/* 1636 */       a(par1, par2, var5);
/* 1637 */       var3 = 0.91F;
/*      */       
/* 1639 */       if (this.E) {
/*      */         
/* 1641 */         var3 = 0.54600006F;
/* 1642 */         int var6 = this.p.a(ke.c(this.t), ke.c(this.D.b) - 1, ke.c(this.v));
/*      */         
/* 1644 */         if (var6 > 0)
/*      */         {
/* 1646 */           var3 = (amq.p[var6]).cC * 0.91F;
/*      */         }
/*      */       } 
/*      */       
/* 1650 */       if (g_()) {
/*      */         
/* 1652 */         float var10 = 0.15F;
/*      */         
/* 1654 */         if (this.w < -var10)
/*      */         {
/* 1656 */           this.w = -var10;
/*      */         }
/*      */         
/* 1659 */         if (this.w > var10)
/*      */         {
/* 1661 */           this.w = var10;
/*      */         }
/*      */         
/* 1664 */         if (this.y < -var10)
/*      */         {
/* 1666 */           this.y = -var10;
/*      */         }
/*      */         
/* 1669 */         if (this.y > var10)
/*      */         {
/* 1671 */           this.y = var10;
/*      */         }
/*      */         
/* 1674 */         this.S = 0.0F;
/*      */         
/* 1676 */         if (this.x < -0.15D)
/*      */         {
/* 1678 */           this.x = -0.15D;
/*      */         }
/*      */         
/* 1681 */         boolean var7 = (ah() && this instanceof qx);
/*      */         
/* 1683 */         if (var7 && this.x < 0.0D)
/*      */         {
/* 1685 */           this.x = 0.0D;
/*      */         }
/*      */       } 
/*      */       
/* 1689 */       d(this.w, this.x, this.y);
/*      */       
/* 1691 */       if (this.F && g_())
/*      */       {
/* 1693 */         this.x = 0.2D;
/*      */       }
/*      */       
/* 1696 */       if (this.p.I && (!this.p.f((int)this.t, 0, (int)this.v) || !(this.p.d((int)this.t, (int)this.v)).d)) {
/*      */         
/* 1698 */         if (this.u > 0.0D)
/*      */         {
/* 1700 */           this.x = -0.1D;
/*      */         }
/*      */         else
/*      */         {
/* 1704 */           this.x = 0.0D;
/*      */         }
/*      */       
/*      */       } else {
/*      */         
/* 1709 */         this.x -= 0.08D;
/*      */       } 
/*      */       
/* 1712 */       this.x *= 0.9800000190734863D;
/* 1713 */       this.w *= var3;
/* 1714 */       this.y *= var3;
/*      */     } 
/*      */     
/* 1717 */     this.bg = this.bh;
/* 1718 */     double var9 = this.t - this.q;
/* 1719 */     double var12 = this.v - this.s;
/* 1720 */     float var11 = ke.a(var9 * var9 + var12 * var12) * 4.0F;
/*      */     
/* 1722 */     if (var11 > 1.0F)
/*      */     {
/* 1724 */       var11 = 1.0F;
/*      */     }
/*      */     
/* 1727 */     this.bh += (var11 - this.bh) * 0.4F;
/* 1728 */     this.bi += this.bh;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean g_() {
/* 1737 */     if (a(mod_SCP.sticky) && this.F) return true; 
/* 1738 */     int var1 = ke.c(this.t);
/* 1739 */     int var2 = ke.c(this.D.b);
/* 1740 */     int var3 = ke.c(this.v);
/* 1741 */     int var4 = this.p.a(var1, var2, var3);
/* 1742 */     return ForgeHooks.isLivingOnLadder(amq.p[var4], this.p, var1, var2, var3);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(bq par1NBTTagCompound) {
/* 1750 */     if (this.aR < -32768)
/*      */     {
/* 1752 */       this.aR = -32768;
/*      */     }
/*      */     
/* 1755 */     par1NBTTagCompound.a("Health", (short)this.aR);
/* 1756 */     par1NBTTagCompound.a("HurtTime", (short)this.aV);
/* 1757 */     par1NBTTagCompound.a("DeathTime", (short)this.aY);
/* 1758 */     par1NBTTagCompound.a("AttackTime", (short)this.aZ);
/* 1759 */     par1NBTTagCompound.a("CanPickUpLoot", this.bs);
/* 1760 */     par1NBTTagCompound.a("PersistenceRequired", this.bU);
/* 1761 */     by var2 = new by();
/*      */ 
/*      */     
/* 1764 */     par1NBTTagCompound.a("blinkingActive", mod_SCP.isActive);
/* 1765 */     par1NBTTagCompound.a("remoteDoor", mod_Others.remoteDoorActivate);
/* 1766 */     par1NBTTagCompound.a("wantsToTalk", mod_Others.wantsToTalk);
/* 1767 */     par1NBTTagCompound.a("heard513", this.hasHeard513);
/* 1768 */     par1NBTTagCompound.a("Create", (short)this.create);
/* 1769 */     par1NBTTagCompound.a("Expose", (short)this.exposure);
/* 1770 */     par1NBTTagCompound.a("Blink", (short)this.blink);
/* 1771 */     par1NBTTagCompound.a("079Mad", (short)getAnger());
/*      */     
/* 1773 */     for (int var3 = 0; var3 < this.bS.length; var3++) {
/*      */       
/* 1775 */       bq var4 = new bq();
/*      */       
/* 1777 */       if (this.bS[var3] != null)
/*      */       {
/* 1779 */         this.bS[var3].b(var4);
/*      */       }
/*      */       
/* 1782 */       var2.a((cd)var4);
/*      */     } 
/*      */     
/* 1785 */     par1NBTTagCompound.a("Equipment", (cd)var2);
/*      */ 
/*      */     
/* 1788 */     if (!this.bm.isEmpty()) {
/*      */       
/* 1790 */       by by = new by();
/* 1791 */       Iterator<lm> var7 = this.bm.values().iterator();
/*      */       
/* 1793 */       while (var7.hasNext()) {
/*      */         
/* 1795 */         lm var5 = var7.next();
/* 1796 */         by.a((cd)var5.a(new bq()));
/*      */       } 
/*      */       
/* 1799 */       par1NBTTagCompound.a("ActiveEffects", (cd)by);
/*      */     } 
/*      */     
/* 1802 */     by var6 = new by();
/*      */     
/* 1804 */     for (int var8 = 0; var8 < this.bp.length; var8++)
/*      */     {
/* 1806 */       var6.a((cd)new bv(var8 + "", this.bp[var8]));
/*      */     }
/*      */     
/* 1809 */     par1NBTTagCompound.a("DropChances", (cd)var6);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(bq par1NBTTagCompound) {
/* 1817 */     this.aR = par1NBTTagCompound.d("Health");
/*      */     
/* 1819 */     if (!par1NBTTagCompound.b("Health"))
/*      */     {
/* 1821 */       this.aR = aT();
/*      */     }
/*      */ 
/*      */     
/* 1825 */     mod_SCP.isActive = par1NBTTagCompound.n("blinkingActive");
/* 1826 */     mod_Others.remoteDoorActivate = par1NBTTagCompound.n("remoteDoor");
/* 1827 */     mod_Others.wantsToTalk = par1NBTTagCompound.n("wantsToTalk");
/* 1828 */     this.hasHeard513 = par1NBTTagCompound.n("heard513");
/* 1829 */     this.create = par1NBTTagCompound.d("Create");
/* 1830 */     this.exposure = par1NBTTagCompound.d("Expose");
/* 1831 */     this.blink = par1NBTTagCompound.d("Blink");
/* 1832 */     setAnger(par1NBTTagCompound.e("079Mad"));
/*      */     
/* 1834 */     this.aV = par1NBTTagCompound.d("HurtTime");
/* 1835 */     this.aY = par1NBTTagCompound.d("DeathTime");
/* 1836 */     this.aZ = par1NBTTagCompound.d("AttackTime");
/* 1837 */     this.bs = par1NBTTagCompound.n("CanPickUpLoot");
/* 1838 */     this.bU = par1NBTTagCompound.n("PersistenceRequired");
/*      */ 
/*      */ 
/*      */     
/* 1842 */     if (par1NBTTagCompound.b("Equipment")) {
/*      */       
/* 1844 */       by var2 = par1NBTTagCompound.m("Equipment");
/*      */       
/* 1846 */       for (int var3 = 0; var3 < this.bS.length; var3++)
/*      */       {
/* 1848 */         this.bS[var3] = ur.a((bq)var2.b(var3));
/*      */       }
/*      */     } 
/*      */     
/* 1852 */     if (par1NBTTagCompound.b("ActiveEffects")) {
/*      */       
/* 1854 */       by var2 = par1NBTTagCompound.m("ActiveEffects");
/*      */       
/* 1856 */       for (int var3 = 0; var3 < var2.c(); var3++) {
/*      */         
/* 1858 */         bq var4 = (bq)var2.b(var3);
/* 1859 */         lm var5 = lm.b(var4);
/* 1860 */         this.bm.put(Integer.valueOf(var5.a()), var5);
/*      */       } 
/*      */     } 
/*      */     
/* 1864 */     if (par1NBTTagCompound.b("DropChances")) {
/*      */       
/* 1866 */       by var2 = par1NBTTagCompound.m("DropChances");
/*      */       
/* 1868 */       for (int var3 = 0; var3 < var2.c(); var3++)
/*      */       {
/* 1870 */         this.bp[var3] = ((bv)var2.b(var3)).a;
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean S() {
/* 1880 */     return (!this.L && this.aR > 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean bc() {
/* 1885 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public void f(float par1) {
/* 1890 */     this.bD = par1;
/*      */   }
/*      */ 
/*      */   
/*      */   public void e(boolean par1) {
/* 1895 */     this.bF = par1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void c() {
/* 1904 */     if (this.bV > 0)
/*      */     {
/* 1906 */       this.bV--;
/*      */     }
/*      */     
/* 1909 */     SCPWorldGenStart scpGenStart = new SCPWorldGenStart();
/* 1910 */     ays ays = (ModLoader.getMinecraftInstance()).g;
/* 1911 */     int i = this.p.K().c();
/* 1912 */     int j = this.p.K().d();
/* 1913 */     int k = this.p.K().e();
/* 1914 */     if (i((lq)ays) && this != null && this.p.K().j() == 0 && this.create == 0)
/*      */     {
/*      */       
/* 1917 */       this.create++;
/*      */     }
/*      */     
/* 1920 */     if (this.bt > 0) {
/*      */       
/* 1922 */       double var1 = this.t + (this.bu - this.t) / this.bt;
/* 1923 */       double var3 = this.u + (this.bv - this.u) / this.bt;
/* 1924 */       double var5 = this.v + (this.bw - this.v) / this.bt;
/* 1925 */       double var7 = ke.g(this.bx - this.z);
/* 1926 */       this.z = (float)(this.z + var7 / this.bt);
/* 1927 */       this.A = (float)(this.A + (this.by - this.A) / this.bt);
/* 1928 */       this.bt--;
/* 1929 */       b(var1, var3, var5);
/* 1930 */       b(this.z, this.A);
/*      */     }
/* 1932 */     else if (!bf()) {
/*      */       
/* 1934 */       this.w *= 0.98D;
/* 1935 */       this.x *= 0.98D;
/* 1936 */       this.y *= 0.98D;
/*      */     } 
/*      */     
/* 1939 */     if (Math.abs(this.w) < 0.005D)
/*      */     {
/* 1941 */       this.w = 0.0D;
/*      */     }
/*      */     
/* 1944 */     if (Math.abs(this.x) < 0.005D)
/*      */     {
/* 1946 */       this.x = 0.0D;
/*      */     }
/*      */     
/* 1949 */     if (Math.abs(this.y) < 0.005D)
/*      */     {
/* 1951 */       this.y = 0.0D;
/*      */     }
/*      */     
/* 1954 */     this.p.D.a("ai");
/*      */     
/* 1956 */     if (bg()) {
/*      */       
/* 1958 */       this.bF = false;
/* 1959 */       this.bC = 0.0F;
/* 1960 */       this.bD = 0.0F;
/* 1961 */       this.bE = 0.0F;
/*      */     }
/* 1963 */     else if (bf()) {
/*      */       
/* 1965 */       if (be()) {
/*      */         
/* 1967 */         this.p.D.a("newAi");
/* 1968 */         bl();
/* 1969 */         this.p.D.b();
/*      */       }
/*      */       else {
/*      */         
/* 1973 */         this.p.D.a("oldAi");
/* 1974 */         bn();
/* 1975 */         this.p.D.b();
/* 1976 */         this.az = this.z;
/*      */       } 
/*      */     } 
/*      */     
/* 1980 */     this.p.D.b();
/* 1981 */     this.p.D.a("jump");
/*      */     
/* 1983 */     if (this.bF) {
/*      */ 
/*      */       
/* 1986 */       if (!H() && (!J() || !handleSCP354Movement())) {
/*      */         
/* 1988 */         if (this.E && this.bV == 0)
/*      */         {
/* 1990 */           bi();
/* 1991 */           this.bV = 10;
/*      */         }
/*      */       
/*      */       } else {
/*      */         
/* 1996 */         this.x += 0.03999999910593033D;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 2001 */       this.bV = 0;
/*      */     } 
/*      */     
/* 2004 */     this.p.D.b();
/* 2005 */     this.p.D.a("travel");
/* 2006 */     this.bC *= 0.98F;
/* 2007 */     this.bD *= 0.98F;
/* 2008 */     this.bE *= 0.9F;
/* 2009 */     float var11 = this.aN;
/* 2010 */     this.aN *= bB();
/* 2011 */     e(this.bC, this.bD);
/* 2012 */     this.aN = var11;
/* 2013 */     this.p.D.b();
/* 2014 */     this.p.D.a("push");
/*      */     
/* 2016 */     if (!this.p.I)
/*      */     {
/* 2018 */       bd();
/*      */     }
/*      */     
/* 2021 */     this.p.D.b();
/* 2022 */     this.p.D.a("looting");
/*      */     
/* 2024 */     if (!this.p.I && this.bs && !this.bc && this.p.L().b("mobGriefing")) {
/*      */       
/* 2026 */       List var2 = this.p.a(px.class, this.D.b(1.0D, 0.0D, 1.0D));
/* 2027 */       Iterator<px> var12 = var2.iterator();
/*      */       
/* 2029 */       while (var12.hasNext()) {
/*      */         
/* 2031 */         px var4 = var12.next();
/*      */         
/* 2033 */         if (!var4.L && var4.d() != null) {
/*      */           
/* 2035 */           ur var13 = var4.d();
/* 2036 */           int var6 = b(var13);
/*      */           
/* 2038 */           if (var6 > -1) {
/*      */             
/* 2040 */             boolean var14 = true;
/* 2041 */             ur var8 = p(var6);
/*      */             
/* 2043 */             if (var8 != null)
/*      */             {
/* 2045 */               if (var6 == 0) {
/*      */                 
/* 2047 */                 if (var13.b() instanceof vu && !(var8.b() instanceof vu)) {
/*      */                   
/* 2049 */                   var14 = true;
/*      */                 }
/* 2051 */                 else if (var13.b() instanceof vu && var8.b() instanceof vu) {
/*      */                   
/* 2053 */                   vu var9 = (vu)var13.b();
/* 2054 */                   vu var10 = (vu)var8.b();
/*      */                   
/* 2056 */                   if (var9.g() == var10.g())
/*      */                   {
/* 2058 */                     var14 = (var13.j() > var8.j() || (var13.o() && !var8.o()));
/*      */                   }
/*      */                   else
/*      */                   {
/* 2062 */                     var14 = (var9.g() > var10.g());
/*      */                   }
/*      */                 
/*      */                 } else {
/*      */                   
/* 2067 */                   var14 = false;
/*      */                 }
/*      */               
/* 2070 */               } else if (var13.b() instanceof su && !(var8.b() instanceof su)) {
/*      */                 
/* 2072 */                 var14 = true;
/*      */               }
/* 2074 */               else if (var13.b() instanceof su && var8.b() instanceof su) {
/*      */                 
/* 2076 */                 su var15 = (su)var13.b();
/* 2077 */                 su var16 = (su)var8.b();
/*      */                 
/* 2079 */                 if (var15.b == var16.b)
/*      */                 {
/* 2081 */                   var14 = (var13.j() > var8.j() || (var13.o() && !var8.o()));
/*      */                 }
/*      */                 else
/*      */                 {
/* 2085 */                   var14 = (var15.b > var16.b);
/*      */                 }
/*      */               
/*      */               } else {
/*      */                 
/* 2090 */                 var14 = false;
/*      */               } 
/*      */             }
/*      */             
/* 2094 */             if (var14) {
/*      */               
/* 2096 */               if (var8 != null && this.aa.nextFloat() - 0.1F < this.bp[var6])
/*      */               {
/* 2098 */                 a(var8, 0.0F);
/*      */               }
/*      */               
/* 2101 */               b(var6, var13);
/* 2102 */               this.bp[var6] = 2.0F;
/* 2103 */               this.bU = true;
/* 2104 */               a((lq)var4, 1);
/* 2105 */               var4.x();
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 2112 */     this.p.D.b();
/*      */   }
/*      */ 
/*      */   
/*      */   protected void bd() {
/* 2117 */     List<lq> var1 = this.p.b(this, this.D.b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
/*      */     
/* 2119 */     if (var1 != null && !var1.isEmpty())
/*      */     {
/* 2121 */       for (int var2 = 0; var2 < var1.size(); var2++) {
/*      */         
/* 2123 */         lq var3 = var1.get(var2);
/*      */         
/* 2125 */         if (var3.M())
/*      */         {
/* 2127 */           o(var3);
/*      */         }
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   protected void o(lq par1Entity) {
/* 2135 */     par1Entity.f(this);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean be() {
/* 2143 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean bf() {
/* 2151 */     return !this.p.I;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean bg() {
/* 2159 */     return (this.aR <= 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean bh() {
/* 2164 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void bi() {
/* 2172 */     this.x = 0.41999998688697815D;
/*      */     
/* 2174 */     if (a(ll.j))
/*      */     {
/* 2176 */       this.x += ((b(ll.j).c() + 1) * 0.1F);
/*      */     }
/*      */     
/* 2179 */     if (ai()) {
/*      */       
/* 2181 */       float var1 = this.z * 0.017453292F;
/* 2182 */       this.w -= (ke.a(var1) * 0.2F);
/* 2183 */       this.y += (ke.b(var1) * 0.2F);
/*      */     } 
/*      */     
/* 2186 */     this.am = true;
/* 2187 */     ForgeHooks.onLivingJump(this);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean bj() {
/* 2195 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void bk() {
/* 2203 */     if (!this.bU) {
/*      */       
/* 2205 */       qx var1 = this.p.a(this, -1.0D);
/*      */       
/* 2207 */       if (var1 != null) {
/*      */         
/* 2209 */         double var2 = var1.t - this.t;
/* 2210 */         double var4 = var1.u - this.u;
/* 2211 */         double var6 = var1.v - this.v;
/* 2212 */         double var8 = var2 * var2 + var4 * var4 + var6 * var6;
/*      */         
/* 2214 */         if (bj() && var8 > 16384.0D)
/*      */         {
/* 2216 */           x();
/*      */         }
/*      */         
/* 2219 */         if (this.bB > 600 && this.aa.nextInt(800) == 0 && var8 > 1024.0D && bj()) {
/*      */           
/* 2221 */           x();
/*      */         }
/* 2223 */         else if (var8 < 1024.0D) {
/*      */           
/* 2225 */           this.bB = 0;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void bl() {
/* 2233 */     this.bB++;
/* 2234 */     this.p.D.a("checkDespawn");
/* 2235 */     bk();
/* 2236 */     this.p.D.b();
/* 2237 */     this.p.D.a("sensing");
/* 2238 */     this.bO.a();
/* 2239 */     this.p.D.b();
/* 2240 */     this.p.D.a("targetSelector");
/* 2241 */     this.bo.a();
/* 2242 */     this.p.D.b();
/* 2243 */     this.p.D.a("goalSelector");
/* 2244 */     this.bn.a();
/* 2245 */     this.p.D.b();
/* 2246 */     this.p.D.a("navigation");
/* 2247 */     this.bM.e();
/* 2248 */     this.p.D.b();
/* 2249 */     this.p.D.a("mob tick");
/* 2250 */     bm();
/* 2251 */     this.p.D.b();
/* 2252 */     this.p.D.a("controls");
/* 2253 */     this.p.D.a("move");
/* 2254 */     this.bJ.c();
/* 2255 */     this.p.D.c("look");
/* 2256 */     this.j.a();
/* 2257 */     this.p.D.c("jump");
/* 2258 */     this.bK.b();
/* 2259 */     this.p.D.b();
/* 2260 */     this.p.D.b();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void bm() {}
/*      */ 
/*      */ 
/*      */   
/*      */   protected void bn() {
/* 2270 */     this.bB++;
/* 2271 */     bk();
/* 2272 */     this.bC = 0.0F;
/* 2273 */     this.bD = 0.0F;
/* 2274 */     float var1 = 8.0F;
/*      */     
/* 2276 */     if (this.aa.nextFloat() < 0.02F) {
/*      */       
/* 2278 */       qx var2 = this.p.a(this, var1);
/*      */       
/* 2280 */       if (var2 != null) {
/*      */         
/* 2282 */         this.bW = var2;
/* 2283 */         this.bI = 10 + this.aa.nextInt(20);
/*      */       }
/*      */       else {
/*      */         
/* 2287 */         this.bE = (this.aa.nextFloat() - 0.5F) * 20.0F;
/*      */       } 
/*      */     } 
/*      */     
/* 2291 */     if (this.bW != null) {
/*      */       
/* 2293 */       a(this.bW, 10.0F, bp());
/*      */       
/* 2295 */       if (this.bI-- <= 0 || this.bW.L || this.bW.e(this) > (var1 * var1))
/*      */       {
/* 2297 */         this.bW = null;
/*      */       }
/*      */     }
/*      */     else {
/*      */       
/* 2302 */       if (this.aa.nextFloat() < 0.05F)
/*      */       {
/* 2304 */         this.bE = (this.aa.nextFloat() - 0.5F) * 20.0F;
/*      */       }
/*      */       
/* 2307 */       this.z += this.bE;
/* 2308 */       this.A = this.bG;
/*      */     } 
/*      */     
/* 2311 */     boolean var4 = H();
/* 2312 */     boolean var3 = J();
/* 2313 */     boolean var31 = handleSCP354Movement();
/*      */ 
/*      */     
/* 2316 */     if (var4 || var3 || var31)
/*      */     {
/* 2318 */       this.bF = (this.aa.nextFloat() < 0.8F);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public SCPEnumCreatureAttribute getSCPAttribute() {
/* 2325 */     return SCPEnumCreatureAttribute.UNIDENTIFIED;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void bo() {
/* 2333 */     int var1 = h();
/*      */     
/* 2335 */     if (this.bq) {
/*      */       
/* 2337 */       this.br++;
/*      */       
/* 2339 */       if (this.br >= var1)
/*      */       {
/* 2341 */         this.br = 0;
/* 2342 */         this.bq = false;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 2347 */       this.br = 0;
/*      */     } 
/*      */     
/* 2350 */     this.aQ = this.br / var1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int bp() {
/* 2359 */     return 40;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(lq par1Entity, float par2, float par3) {
/* 2367 */     double var6, var4 = par1Entity.t - this.t;
/* 2368 */     double var8 = par1Entity.v - this.v;
/*      */ 
/*      */     
/* 2371 */     if (par1Entity instanceof md) {
/*      */       
/* 2373 */       md var10 = (md)par1Entity;
/* 2374 */       var6 = this.u + e() - var10.u + var10.e();
/*      */     }
/*      */     else {
/*      */       
/* 2378 */       var6 = (par1Entity.D.b + par1Entity.D.e) / 2.0D - this.u + e();
/*      */     } 
/*      */     
/* 2381 */     double var14 = ke.a(var4 * var4 + var8 * var8);
/* 2382 */     float var12 = (float)(Math.atan2(var8, var4) * 180.0D / Math.PI) - 90.0F;
/* 2383 */     float var13 = (float)-(Math.atan2(var6, var14) * 180.0D / Math.PI);
/* 2384 */     this.A = -b(this.A, var13, par3);
/* 2385 */     this.z = b(this.z, var12, par2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private float b(float par1, float par2, float par3) {
/* 2393 */     float var4 = ke.g(par2 - par1);
/*      */     
/* 2395 */     if (var4 > par3)
/*      */     {
/* 2397 */       var4 = par3;
/*      */     }
/*      */     
/* 2400 */     if (var4 < -par3)
/*      */     {
/* 2402 */       var4 = -par3;
/*      */     }
/*      */     
/* 2405 */     return par1 + var4;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean bs() {
/* 2413 */     return (this.p.b(this.D) && this.p.a(this, this.D).isEmpty() && !this.p.d(this.D));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void C() {
/* 2421 */     a(lh.i, 4);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public float g(float par1) {
/* 2431 */     float var2 = this.aQ - this.aP;
/*      */     
/* 2433 */     if (var2 < 0.0F)
/*      */     {
/* 2435 */       var2++;
/*      */     }
/*      */     
/* 2438 */     return this.aP + var2 * par1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public aoj h(float par1) {
/* 2448 */     if (par1 == 1.0F)
/*      */     {
/* 2450 */       return this.p.S().a(this.t, this.u, this.v);
/*      */     }
/*      */ 
/*      */     
/* 2454 */     double var2 = this.q + (this.t - this.q) * par1;
/* 2455 */     double var4 = this.r + (this.u - this.r) * par1;
/* 2456 */     double var6 = this.s + (this.v - this.s) * par1;
/* 2457 */     return this.p.S().a(var2, var4, var6);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public aoj Z() {
/* 2466 */     return i(1.0F);
/*      */   }
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
/*      */   public aoj i(float par1) {
/* 2479 */     if (par1 == 1.0F) {
/*      */       
/* 2481 */       float f1 = ke.b(-this.z * 0.017453292F - 3.1415927F);
/* 2482 */       float f2 = ke.a(-this.z * 0.017453292F - 3.1415927F);
/* 2483 */       float f3 = -ke.b(-this.A * 0.017453292F);
/* 2484 */       float f4 = ke.a(-this.A * 0.017453292F);
/* 2485 */       return this.p.S().a((f2 * f3), f4, (f1 * f3));
/*      */     } 
/*      */ 
/*      */     
/* 2489 */     float var2 = this.C + (this.A - this.C) * par1;
/* 2490 */     float var3 = this.B + (this.z - this.B) * par1;
/* 2491 */     float var4 = ke.b(-var3 * 0.017453292F - 3.1415927F);
/* 2492 */     float var5 = ke.a(-var3 * 0.017453292F - 3.1415927F);
/* 2493 */     float var6 = -ke.b(-var2 * 0.017453292F);
/* 2494 */     float var7 = ke.a(-var2 * 0.017453292F);
/* 2495 */     return this.p.S().a((var5 * var6), var7, (var4 * var6));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public float bt() {
/* 2506 */     return 1.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public aoh a(double par1, float par3) {
/* 2516 */     aoj var4 = h(par3);
/* 2517 */     aoj var5 = i(par3);
/* 2518 */     aoj var6 = var4.c(var5.c * par1, var5.d * par1, var5.e * par1);
/* 2519 */     return this.p.a(var4, var6);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int bv() {
/* 2527 */     return 4;
/*      */   }
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public void a(byte par1) {
/* 2533 */     if (par1 == 2) {
/*      */       
/* 2535 */       this.bh = 1.5F;
/* 2536 */       this.ae = this.au;
/* 2537 */       this.aV = this.aW = 10;
/* 2538 */       this.aX = 0.0F;
/* 2539 */       a(aZ(), aX(), (this.aa.nextFloat() - this.aa.nextFloat()) * 0.2F + 1.0F);
/* 2540 */       a(lh.j, 0);
/*      */     }
/* 2542 */     else if (par1 == 3) {
/*      */       
/* 2544 */       a(ba(), aX(), (this.aa.nextFloat() - this.aa.nextFloat()) * 0.2F + 1.0F);
/* 2545 */       this.aR = 0;
/* 2546 */       a(lh.j);
/*      */     }
/*      */     else {
/*      */       
/* 2550 */       super.a(par1);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean bw() {
/* 2559 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public int b(ur par1ItemStack, int par2) {
/* 2569 */     return par1ItemStack.c();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void bx() {
/* 2575 */     Iterator<Integer> var1 = this.bm.keySet().iterator();
/*      */     
/* 2577 */     while (var1.hasNext()) {
/*      */       
/* 2579 */       Integer var2 = var1.next();
/* 2580 */       lm var3 = (lm)this.bm.get(var2);
/*      */       
/* 2582 */       if (!var3.a(this)) {
/*      */         
/* 2584 */         if (!this.p.I) {
/*      */           
/* 2586 */           var1.remove();
/* 2587 */           c(var3);
/*      */         }  continue;
/*      */       } 
/* 2590 */       if (var3.b() % 600 == 0)
/*      */       {
/* 2592 */         b(var3);
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 2598 */     if (this.h) {
/*      */       
/* 2600 */       if (!this.p.I)
/*      */       {
/* 2602 */         if (this.bm.isEmpty()) {
/*      */           
/* 2604 */           this.ag.b(9, Byte.valueOf((byte)0));
/* 2605 */           this.ag.b(8, Integer.valueOf(0));
/* 2606 */           c(false);
/*      */         }
/*      */         else {
/*      */           
/* 2610 */           int i = vx.a(this.bm.values());
/* 2611 */           this.ag.b(9, Byte.valueOf((byte)(vx.b(this.bm.values()) ? 1 : 0)));
/* 2612 */           this.ag.b(8, Integer.valueOf(i));
/* 2613 */           c(m(ll.p.H));
/*      */         } 
/*      */       }
/*      */       
/* 2617 */       this.h = false;
/*      */     } 
/*      */     
/* 2620 */     int var11 = this.ag.c(8);
/* 2621 */     boolean var12 = (this.ag.a(9) > 0);
/*      */     
/* 2623 */     if (var11 > 0) {
/*      */       int i;
/* 2625 */       boolean var4 = false;
/*      */       
/* 2627 */       if (!aj()) {
/*      */         
/* 2629 */         var4 = this.aa.nextBoolean();
/*      */       }
/*      */       else {
/*      */         
/* 2633 */         var4 = (this.aa.nextInt(15) == 0);
/*      */       } 
/*      */       
/* 2636 */       if (var12)
/*      */       {
/* 2638 */         i = var4 & ((this.aa.nextInt(5) == 0) ? 1 : 0);
/*      */       }
/*      */       
/* 2641 */       if (i != 0 && var11 > 0) {
/*      */         
/* 2643 */         double var5 = (var11 >> 16 & 0xFF) / 255.0D;
/* 2644 */         double var7 = (var11 >> 8 & 0xFF) / 255.0D;
/* 2645 */         double var9 = (var11 >> 0 & 0xFF) / 255.0D;
/* 2646 */         this.p.a(var12 ? "mobSpellAmbient" : "mobSpell", this.t + (this.aa.nextDouble() - 0.5D) * this.N, this.u + this.aa.nextDouble() * this.O - this.M, this.v + (this.aa.nextDouble() - 0.5D) * this.N, var5, var7, var9);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void by() {
/* 2653 */     Iterator<Integer> var1 = this.bm.keySet().iterator();
/*      */     
/* 2655 */     while (var1.hasNext()) {
/*      */       
/* 2657 */       Integer var2 = var1.next();
/* 2658 */       lm var3 = (lm)this.bm.get(var2);
/*      */       
/* 2660 */       if (!this.p.I) {
/*      */         
/* 2662 */         var1.remove();
/* 2663 */         c(var3);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public Collection bz() {
/* 2670 */     return this.bm.values();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean m(int par1) {
/* 2675 */     return this.bm.containsKey(Integer.valueOf(par1));
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(ll par1Potion) {
/* 2680 */     return this.bm.containsKey(Integer.valueOf(par1Potion.H));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public lm b(ll par1Potion) {
/* 2688 */     return (lm)this.bm.get(Integer.valueOf(par1Potion.H));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void d(lm par1PotionEffect) {
/* 2696 */     if (e(par1PotionEffect))
/*      */     {
/* 2698 */       if (this.bm.containsKey(Integer.valueOf(par1PotionEffect.a()))) {
/*      */         
/* 2700 */         ((lm)this.bm.get(Integer.valueOf(par1PotionEffect.a()))).a(par1PotionEffect);
/* 2701 */         b((lm)this.bm.get(Integer.valueOf(par1PotionEffect.a())));
/*      */       }
/*      */       else {
/*      */         
/* 2705 */         this.bm.put(Integer.valueOf(par1PotionEffect.a()), par1PotionEffect);
/* 2706 */         a(par1PotionEffect);
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean e(lm par1PotionEffect) {
/* 2713 */     if (bC() == mf.b) {
/*      */       
/* 2715 */       int var2 = par1PotionEffect.a();
/*      */       
/* 2717 */       if (var2 == ll.l.H || var2 == ll.u.H)
/*      */       {
/* 2719 */         return false;
/*      */       }
/*      */     } 
/*      */     
/* 2723 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean bA() {
/* 2731 */     return (bC() == mf.b);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void n(int par1) {
/* 2739 */     this.bm.remove(Integer.valueOf(par1));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void o(int par1) {
/* 2747 */     lm var2 = (lm)this.bm.remove(Integer.valueOf(par1));
/*      */     
/* 2749 */     if (var2 != null)
/*      */     {
/* 2751 */       c(var2);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(lm par1PotionEffect) {
/* 2757 */     this.h = true;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void b(lm par1PotionEffect) {
/* 2762 */     this.h = true;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void c(lm par1PotionEffect) {
/* 2767 */     this.h = true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float bB() {
/* 2776 */     float var1 = 1.0F;
/*      */     
/* 2778 */     if (a(mod_SCP.crystal)) {
/*      */       
/* 2780 */       var1 *= 0.0F;
/*      */     } else {
/* 2782 */       var1 = 1.0F;
/*      */     } 
/* 2784 */     if (a(ll.c))
/*      */     {
/* 2786 */       var1 *= 1.0F + 0.2F * (b(ll.c).c() + 1);
/*      */     }
/*      */     
/* 2789 */     if (a(ll.d))
/*      */     {
/* 2791 */       var1 *= 1.0F - 0.15F * (b(ll.d).c() + 1);
/*      */     }
/*      */     
/* 2794 */     return var1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(double par1, double par3, double par5) {
/* 2802 */     b(par1, par3, par5, this.z, this.A);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean h_() {
/* 2810 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public mf bC() {
/* 2818 */     return mf.a;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ur par1ItemStack) {
/* 2826 */     a("random.break", 0.8F, 0.8F + this.p.t.nextFloat() * 0.4F);
/*      */     
/* 2828 */     for (int var2 = 0; var2 < 5; var2++) {
/*      */       
/* 2830 */       aoj var3 = this.p.S().a((this.aa.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
/* 2831 */       var3.a(-this.A * 3.1415927F / 180.0F);
/* 2832 */       var3.b(-this.z * 3.1415927F / 180.0F);
/* 2833 */       aoj var4 = this.p.S().a((this.aa.nextFloat() - 0.5D) * 0.3D, -this.aa.nextFloat() * 0.6D - 0.3D, 0.6D);
/* 2834 */       var4.a(-this.A * 3.1415927F / 180.0F);
/* 2835 */       var4.b(-this.z * 3.1415927F / 180.0F);
/* 2836 */       var4 = var4.c(this.t, this.u + e(), this.v);
/* 2837 */       this.p.a("iconcrack_" + (par1ItemStack.b()).cj, var4.c, var4.d, var4.e, var3.c, var3.d + 0.05D, var3.e);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public int as() {
/* 2843 */     if (aG() == null)
/*      */     {
/* 2845 */       return 3;
/*      */     }
/*      */ 
/*      */     
/* 2849 */     int var1 = (int)(this.aR - aT() * 0.33F);
/* 2850 */     var1 -= (3 - this.p.s) * 4;
/*      */     
/* 2852 */     if (var1 < 0)
/*      */     {
/* 2854 */       var1 = 0;
/*      */     }
/*      */     
/* 2857 */     return var1 + 3;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ur bD() {
/* 2866 */     return this.bS[0];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ur p(int par1) {
/* 2874 */     return this.bS[par1];
/*      */   }
/*      */ 
/*      */   
/*      */   public ur q(int par1) {
/* 2879 */     return this.bS[par1 + 1];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(int par1, ur par2ItemStack) {
/* 2887 */     this.bS[par1] = par2ItemStack;
/*      */   }
/*      */ 
/*      */   
/*      */   public ur[] ae() {
/* 2892 */     return this.bS;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void b(boolean par1, int par2) {
/* 2900 */     for (int var3 = 0; var3 < (ae()).length; var3++) {
/*      */       
/* 2902 */       ur var4 = p(var3);
/* 2903 */       boolean var5 = (this.bp[var3] > 1.0F);
/*      */       
/* 2905 */       if (var4 != null && (par1 || var5) && this.aa.nextFloat() - par2 * 0.01F < this.bp[var3]) {
/*      */         
/* 2907 */         if (!var5 && var4.f()) {
/*      */           
/* 2909 */           int var6 = Math.max(var4.k() - 25, 1);
/* 2910 */           int var7 = var4.k() - this.aa.nextInt(this.aa.nextInt(var6) + 1);
/*      */           
/* 2912 */           if (var7 > var6)
/*      */           {
/* 2914 */             var7 = var6;
/*      */           }
/*      */           
/* 2917 */           if (var7 < 1)
/*      */           {
/* 2919 */             var7 = 1;
/*      */           }
/*      */           
/* 2922 */           var4.b(var7);
/*      */         } 
/*      */         
/* 2925 */         a(var4, 0.0F);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void bE() {
/* 2932 */     if (this.aa.nextFloat() < d[this.p.s]) {
/*      */       
/* 2934 */       int var1 = this.aa.nextInt(2);
/* 2935 */       float var2 = (this.p.s == 3) ? 0.1F : 0.25F;
/*      */       
/* 2937 */       if (this.aa.nextFloat() < 0.1F)
/*      */       {
/* 2939 */         var1++;
/*      */       }
/*      */       
/* 2942 */       if (this.aa.nextFloat() < 0.1F)
/*      */       {
/* 2944 */         var1++;
/*      */       }
/*      */       
/* 2947 */       if (this.aa.nextFloat() < 0.1F)
/*      */       {
/* 2949 */         var1++;
/*      */       }
/*      */       
/* 2952 */       for (int var3 = 3; var3 >= 0; var3--) {
/*      */         
/* 2954 */         ur var4 = q(var3);
/*      */         
/* 2956 */         if (var3 < 3 && this.aa.nextFloat() < var2) {
/*      */           break;
/*      */         }
/*      */ 
/*      */         
/* 2961 */         if (var4 == null) {
/*      */           
/* 2963 */           up var5 = a(var3 + 1, var1);
/*      */           
/* 2965 */           if (var5 != null)
/*      */           {
/* 2967 */             b(var3 + 1, new ur(var5));
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(lq par1Entity, int par2) {
/* 2979 */     if (!par1Entity.L && !this.p.I) {
/*      */       
/* 2981 */       ii var3 = ((in)this.p).p();
/*      */       
/* 2983 */       if (par1Entity instanceof px)
/*      */       {
/* 2985 */         var3.a(par1Entity, (ef)new fd(par1Entity.k, this.k));
/*      */       }
/*      */       
/* 2988 */       if (par1Entity instanceof qz)
/*      */       {
/* 2990 */         var3.a(par1Entity, (ef)new fd(par1Entity.k, this.k));
/*      */       }
/*      */       
/* 2993 */       if (par1Entity instanceof lz)
/*      */       {
/* 2995 */         var3.a(par1Entity, (ef)new fd(par1Entity.k, this.k));
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public static int b(ur par0ItemStack) {
/* 3002 */     if (par0ItemStack.c != amq.bd.cm && par0ItemStack.c != up.bQ.cj) {
/*      */       
/* 3004 */       if (par0ItemStack.b() instanceof su)
/*      */       {
/* 3006 */         switch (((su)par0ItemStack.b()).a) {
/*      */           
/*      */           case 0:
/* 3009 */             return 4;
/*      */           case 1:
/* 3011 */             return 3;
/*      */           case 2:
/* 3013 */             return 2;
/*      */           case 3:
/* 3015 */             return 1;
/*      */         } 
/*      */       
/*      */       }
/* 3019 */       return 0;
/*      */     } 
/*      */ 
/*      */     
/* 3023 */     return 4;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static up a(int par0, int par1) {
/* 3032 */     switch (par0) {
/*      */       
/*      */       case 4:
/* 3035 */         if (par1 == 0)
/*      */         {
/* 3037 */           return up.V;
/*      */         }
/* 3039 */         if (par1 == 1)
/*      */         {
/* 3041 */           return up.al;
/*      */         }
/* 3043 */         if (par1 == 2)
/*      */         {
/* 3045 */           return up.Z;
/*      */         }
/* 3047 */         if (par1 == 3)
/*      */         {
/* 3049 */           return up.ad;
/*      */         }
/* 3051 */         if (par1 == 4)
/*      */         {
/* 3053 */           return up.ah;
/*      */         }
/*      */       case 3:
/* 3056 */         if (par1 == 0)
/*      */         {
/* 3058 */           return up.W;
/*      */         }
/* 3060 */         if (par1 == 1)
/*      */         {
/* 3062 */           return up.am;
/*      */         }
/* 3064 */         if (par1 == 2)
/*      */         {
/* 3066 */           return up.aa;
/*      */         }
/* 3068 */         if (par1 == 3)
/*      */         {
/* 3070 */           return up.ae;
/*      */         }
/* 3072 */         if (par1 == 4)
/*      */         {
/* 3074 */           return up.ai;
/*      */         }
/*      */       case 2:
/* 3077 */         if (par1 == 0)
/*      */         {
/* 3079 */           return up.X;
/*      */         }
/* 3081 */         if (par1 == 1)
/*      */         {
/* 3083 */           return up.an;
/*      */         }
/* 3085 */         if (par1 == 2)
/*      */         {
/* 3087 */           return up.ab;
/*      */         }
/* 3089 */         if (par1 == 3)
/*      */         {
/* 3091 */           return up.af;
/*      */         }
/* 3093 */         if (par1 == 4)
/*      */         {
/* 3095 */           return up.aj;
/*      */         }
/*      */       case 1:
/* 3098 */         if (par1 == 0)
/*      */         {
/* 3100 */           return up.Y;
/*      */         }
/* 3102 */         if (par1 == 1)
/*      */         {
/* 3104 */           return up.ao;
/*      */         }
/* 3106 */         if (par1 == 2)
/*      */         {
/* 3108 */           return up.ac;
/*      */         }
/* 3110 */         if (par1 == 3)
/*      */         {
/* 3112 */           return up.ag;
/*      */         }
/* 3114 */         if (par1 == 4)
/*      */         {
/* 3116 */           return up.ak; } 
/*      */         break;
/*      */     } 
/* 3119 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void bF() {
/* 3125 */     if (bD() != null && this.aa.nextFloat() < b[this.p.s])
/*      */     {
/* 3127 */       xe.a(this.aa, bD(), 5 + this.p.s * this.aa.nextInt(6));
/*      */     }
/*      */     
/* 3130 */     for (int var1 = 0; var1 < 4; var1++) {
/*      */       
/* 3132 */       ur var2 = q(var1);
/*      */       
/* 3134 */       if (var2 != null && this.aa.nextFloat() < c[this.p.s])
/*      */       {
/* 3136 */         xe.a(this.aa, var2, 5 + this.p.s * this.aa.nextInt(6));
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void bG() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private int h() {
/* 3152 */     return a(ll.e) ? (6 - (1 + b(ll.e).c()) * 1) : (a(ll.f) ? (6 + (1 + b(ll.f).c()) * 2) : 6);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void bH() {
/* 3160 */     if (!this.bq || this.br >= h() / 2 || this.br < 0) {
/*      */       
/* 3162 */       this.br = -1;
/* 3163 */       this.bq = true;
/*      */       
/* 3165 */       if (this.p instanceof in)
/*      */       {
/* 3167 */         ((in)this.p).p().a(this, (ef)new cr(this, 1));
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean bI() {
/* 3178 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final int bJ() {
/* 3186 */     return this.ag.a(10);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void r(int par1) {
/* 3194 */     this.ag.b(10, Byte.valueOf((byte)par1));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void curePotionEffects(ur curativeItem) {
/* 3203 */     Iterator<Integer> potionKey = this.bm.keySet().iterator();
/*      */     
/* 3205 */     if (this.p.I) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/* 3210 */     while (potionKey.hasNext()) {
/*      */       
/* 3212 */       Integer key = potionKey.next();
/* 3213 */       lm effect = (lm)this.bm.get(key);
/*      */       
/* 3215 */       if (effect.isCurativeItem(curativeItem)) {
/*      */         
/* 3217 */         potionKey.remove();
/* 3218 */         c(effect);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean shouldRiderFaceForward(qx player) {
/* 3232 */     return this instanceof pd;
/*      */   }
/*      */ }


/* Location:              /home/luigi/Documents/JAR.jar!/md.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */