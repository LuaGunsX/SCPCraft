/*      */ import SCPCraft.mod_SCP;
/*      */ import com.google.common.collect.ImmutableSetMultimap;
/*      */ import cpw.mods.fml.relauncher.Side;
/*      */ import cpw.mods.fml.relauncher.SideOnly;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Calendar;
/*      */ import java.util.Collection;
/*      */ import java.util.HashSet;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import java.util.Set;
/*      */ import java.util.concurrent.Callable;
/*      */ import net.minecraftforge.common.ForgeChunkManager;
/*      */ import net.minecraftforge.common.ForgeDirection;
/*      */ import net.minecraftforge.common.MinecraftForge;
/*      */ import net.minecraftforge.common.WorldSpecificSaveHandler;
/*      */ import net.minecraftforge.event.Event;
/*      */ import net.minecraftforge.event.entity.EntityEvent;
/*      */ import net.minecraftforge.event.entity.EntityJoinWorldEvent;
/*      */ import net.minecraftforge.event.entity.PlaySoundAtEntityEvent;
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
/*      */ public abstract class yc
/*      */   implements ym
/*      */ {
/*   68 */   public static double MAX_ENTITY_RADIUS = 2.0D;
/*      */ 
/*      */ 
/*      */   
/*      */   public final aiv perWorldStorage;
/*      */ 
/*      */   
/*      */   public boolean d = false;
/*      */ 
/*      */   
/*   78 */   public List e = new ArrayList();
/*   79 */   protected List f = new ArrayList();
/*      */ 
/*      */   
/*   82 */   public List g = new ArrayList();
/*   83 */   private List a = new ArrayList();
/*      */ 
/*      */   
/*   86 */   private List b = new ArrayList();
/*      */ 
/*      */   
/*   89 */   public List h = new ArrayList();
/*      */ 
/*      */   
/*   92 */   public List i = new ArrayList();
/*   93 */   private long c = 16777215L;
/*      */ 
/*      */   
/*   96 */   public int j = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  103 */   protected int k = (new Random()).nextInt();
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  108 */   protected final int l = 1013904223;
/*      */   
/*      */   protected float m;
/*      */   
/*      */   protected float n;
/*      */   
/*      */   protected float o;
/*      */   
/*      */   protected float p;
/*      */   
/*  118 */   public int q = 0;
/*      */ 
/*      */   
/*      */   public boolean r = false;
/*      */ 
/*      */   
/*      */   public int s;
/*      */ 
/*      */   
/*  127 */   public Random t = new Random();
/*      */   
/*      */   public final aaq u;
/*      */   
/*  131 */   protected List v = new ArrayList();
/*      */ 
/*      */   
/*      */   protected zw w;
/*      */   
/*      */   protected final aih x;
/*      */   
/*      */   protected ahx y;
/*      */   
/*      */   public boolean z;
/*      */   
/*      */   public aiv A;
/*      */   
/*      */   public ou B;
/*      */   
/*  146 */   protected final ot C = new ot(this);
/*      */   
/*      */   public final kh D;
/*      */   
/*  150 */   private final aok J = new aok(300, 2000);
/*  151 */   private final Calendar K = Calendar.getInstance();
/*  152 */   private ArrayList L = new ArrayList();
/*      */ 
/*      */   
/*      */   private boolean M;
/*      */ 
/*      */   
/*      */   protected boolean E = true;
/*      */   
/*      */   protected boolean F = true;
/*      */   
/*  162 */   public Set G = new HashSet();
/*      */ 
/*      */ 
/*      */   
/*      */   private int N;
/*      */ 
/*      */ 
/*      */   
/*      */   int[] H;
/*      */ 
/*      */ 
/*      */   
/*      */   private List O;
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean I;
/*      */ 
/*      */ 
/*      */   
/*      */   private static aiv s_mapStorage;
/*      */ 
/*      */ 
/*      */   
/*      */   private static aih s_savehandler;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public yy a(int par1, int par2) {
/*  192 */     return this.u.getBiomeGenForCoords(par1, par2);
/*      */   }
/*      */ 
/*      */   
/*      */   public yy getBiomeGenForCoordsBody(int par1, int par2) {
/*  197 */     if (f(par1, 0, par2)) {
/*      */       
/*  199 */       zz var3 = d(par1, par2);
/*      */       
/*  201 */       if (var3 != null)
/*      */       {
/*  203 */         return var3.a(par1 & 0xF, par2 & 0xF, this.u.d);
/*      */       }
/*      */     } 
/*      */     
/*  207 */     return this.u.d.a(par1, par2);
/*      */   }
/*      */ 
/*      */   
/*      */   public zd t() {
/*  212 */     return this.u.d;
/*      */   }
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public yc(aih par1ISaveHandler, String par2Str, aaq par3WorldProvider, yk par4WorldSettings, kh par5Profiler) {
/*  218 */     this.N = this.t.nextInt(12000);
/*  219 */     this.H = new int[32768];
/*  220 */     this.O = new ArrayList();
/*  221 */     this.I = false;
/*  222 */     this.x = par1ISaveHandler;
/*  223 */     this.D = par5Profiler;
/*  224 */     this.y = new ahx(par4WorldSettings, par2Str);
/*  225 */     this.u = par3WorldProvider;
/*  226 */     this.perWorldStorage = new aiv((aih)null);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   protected void finishSetup() {
/*  233 */     ou var6 = (ou)this.A.a(ou.class, "villages");
/*      */     
/*  235 */     if (var6 == null) {
/*      */       
/*  237 */       this.B = new ou(this);
/*  238 */       this.A.a("villages", (ahq)this.B);
/*      */     }
/*      */     else {
/*      */       
/*  242 */       this.B = var6;
/*  243 */       this.B.a(this);
/*      */     } 
/*      */     
/*  246 */     this.u.a(this);
/*  247 */     this.w = j();
/*  248 */     x();
/*  249 */     a();
/*      */   }
/*      */ 
/*      */   
/*      */   public yc(aih par1ISaveHandler, String par2Str, yk par3WorldSettings, aaq par4WorldProvider, kh par5Profiler) {
/*  254 */     this.N = this.t.nextInt(12000);
/*  255 */     this.H = new int[32768];
/*  256 */     this.O = new ArrayList();
/*  257 */     this.I = false;
/*  258 */     this.x = par1ISaveHandler;
/*  259 */     this.D = par5Profiler;
/*  260 */     this.A = getMapStorage(par1ISaveHandler);
/*  261 */     this.y = par1ISaveHandler.d();
/*      */     
/*  263 */     if (par4WorldProvider != null) {
/*      */       
/*  265 */       this.u = par4WorldProvider;
/*      */     }
/*  267 */     else if (this.y != null && this.y.j() != 0) {
/*      */       
/*  269 */       this.u = aaq.a(this.y.j());
/*      */     }
/*      */     else {
/*      */       
/*  273 */       this.u = aaq.a(0);
/*      */     } 
/*      */     
/*  276 */     if (this.y == null) {
/*      */       
/*  278 */       this.y = new ahx(par3WorldSettings, par2Str);
/*      */     }
/*      */     else {
/*      */       
/*  282 */       this.y.a(par2Str);
/*      */     } 
/*      */     
/*  285 */     this.u.a(this);
/*  286 */     this.w = j();
/*      */     
/*  288 */     if (!this.y.w()) {
/*      */ 
/*      */       
/*      */       try {
/*  292 */         a(par3WorldSettings);
/*      */       }
/*  294 */       catch (Throwable var10) {
/*      */         
/*  296 */         a var7 = a.a(var10, "Exception initializing level");
/*      */ 
/*      */         
/*      */         try {
/*  300 */           a(var7);
/*      */         }
/*  302 */         catch (Throwable var9) {}
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  307 */         throw new t(var7);
/*      */       } 
/*      */       
/*  310 */       this.y.d(true);
/*      */     } 
/*      */     
/*  313 */     if (this instanceof in) {
/*      */       
/*  315 */       this.perWorldStorage = new aiv((aih)new WorldSpecificSaveHandler((in)this, par1ISaveHandler));
/*      */     }
/*      */     else {
/*      */       
/*  319 */       this.perWorldStorage = new aiv((aih)null);
/*      */     } 
/*  321 */     ou var6 = (ou)this.perWorldStorage.a(ou.class, "villages");
/*      */     
/*  323 */     if (var6 == null) {
/*      */       
/*  325 */       this.B = new ou(this);
/*  326 */       this.perWorldStorage.a("villages", (ahq)this.B);
/*      */     }
/*      */     else {
/*      */       
/*  330 */       this.B = var6;
/*  331 */       this.B.a(this);
/*      */     } 
/*      */     
/*  334 */     x();
/*  335 */     a();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private aiv getMapStorage(aih savehandler) {
/*  344 */     if (s_savehandler != savehandler || s_mapStorage == null) {
/*  345 */       s_mapStorage = new aiv(savehandler);
/*  346 */       s_savehandler = savehandler;
/*      */     } 
/*  348 */     return s_mapStorage;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected abstract zw j();
/*      */ 
/*      */ 
/*      */   
/*      */   protected void a(yk par1WorldSettings) {
/*  358 */     this.y.d(true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public void f() {
/*  368 */     C(8, 64, 8);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int b(int par1, int par2) {
/*      */     int var3;
/*  379 */     for (var3 = 63; !c(par1, var3 + 1, par2); var3++);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  384 */     return a(par1, var3, par2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int a(int par1, int par2, int par3) {
/*  392 */     if (par1 >= -30000000 && par3 >= -30000000 && par1 < 30000000 && par3 < 30000000) {
/*      */       
/*  394 */       if (par2 < 0)
/*      */       {
/*  396 */         return 0;
/*      */       }
/*  398 */       if (par2 >= 256)
/*      */       {
/*  400 */         return 0;
/*      */       }
/*      */ 
/*      */       
/*  404 */       zz var4 = null;
/*      */ 
/*      */       
/*      */       try {
/*  408 */         var4 = e(par1 >> 4, par3 >> 4);
/*  409 */         return var4.a(par1 & 0xF, par2, par3 & 0xF);
/*      */       }
/*  411 */       catch (Throwable var8) {
/*      */         
/*  413 */         a var6 = a.a(var8, "Exception getting block type in world");
/*  414 */         l var7 = var6.a("Requested block coordinates");
/*  415 */         var7.a("Found chunk", Boolean.valueOf((var4 == null)));
/*  416 */         var7.a("Location", l.a(par1, par2, par3));
/*  417 */         throw new t(var6);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  423 */     return 0;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int b(int par1, int par2, int par3) {
/*  429 */     return (par1 >= -30000000 && par3 >= -30000000 && par1 < 30000000 && par3 < 30000000) ? ((par2 < 0) ? 0 : ((par2 >= 256) ? 0 : e(par1 >> 4, par3 >> 4).b(par1 & 0xF, par2, par3 & 0xF))) : 0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean c(int par1, int par2, int par3) {
/*  437 */     int id = a(par1, par2, par3);
/*  438 */     return (id == 0 || amq.p[id] == null || amq.p[id].isAirBlock(this, par1, par2, par3));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean d(int par1, int par2, int par3) {
/*  446 */     int var4 = a(par1, par2, par3);
/*  447 */     int meta = h(par1, par2, par3);
/*  448 */     return (amq.p[var4] != null && amq.p[var4].hasTileEntity(meta));
/*      */   }
/*      */ 
/*      */   
/*      */   public int e(int par1, int par2, int par3) {
/*  453 */     int var4 = a(par1, par2, par3);
/*  454 */     return (amq.p[var4] != null) ? amq.p[var4].d() : -1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean f(int par1, int par2, int par3) {
/*  462 */     return (par2 >= 0 && par2 < 256) ? c(par1 >> 4, par3 >> 4) : false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(int par1, int par2, int par3, int par4) {
/*  470 */     return d(par1 - par4, par2 - par4, par3 - par4, par1 + par4, par2 + par4, par3 + par4);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean d(int par1, int par2, int par3, int par4, int par5, int par6) {
/*  478 */     if (par5 >= 0 && par2 < 256) {
/*      */       
/*  480 */       par1 >>= 4;
/*  481 */       par3 >>= 4;
/*  482 */       par4 >>= 4;
/*  483 */       par6 >>= 4;
/*      */       
/*  485 */       for (int var7 = par1; var7 <= par4; var7++) {
/*      */         
/*  487 */         for (int var8 = par3; var8 <= par6; var8++) {
/*      */           
/*  489 */           if (!c(var7, var8))
/*      */           {
/*  491 */             return false;
/*      */           }
/*      */         } 
/*      */       } 
/*      */       
/*  496 */       return true;
/*      */     } 
/*      */ 
/*      */     
/*  500 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean c(int par1, int par2) {
/*  510 */     return this.w.a(par1, par2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public zz d(int par1, int par2) {
/*  518 */     return e(par1 >> 4, par2 >> 4);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public zz e(int par1, int par2) {
/*  526 */     return this.w.d(par1, par2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean c(int par1, int par2, int par3, int par4, int par5) {
/*  534 */     return a(par1, par2, par3, par4, par5, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(int par1, int par2, int par3, int par4, int par5, boolean par6) {
/*  543 */     if (par1 >= -30000000 && par3 >= -30000000 && par1 < 30000000 && par3 < 30000000) {
/*      */       
/*  545 */       if (par2 < 0)
/*      */       {
/*  547 */         return false;
/*      */       }
/*  549 */       if (par2 >= 256)
/*      */       {
/*  551 */         return false;
/*      */       }
/*      */ 
/*      */       
/*  555 */       zz var7 = e(par1 >> 4, par3 >> 4);
/*  556 */       boolean var8 = var7.a(par1 & 0xF, par2, par3 & 0xF, par4, par5);
/*  557 */       this.D.a("checkLight");
/*  558 */       z(par1, par2, par3);
/*  559 */       this.D.b();
/*      */       
/*  561 */       if (par6 && var8 && (this.I || var7.o))
/*      */       {
/*  563 */         i(par1, par2, par3);
/*      */       }
/*      */       
/*  566 */       return var8;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  571 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean b(int par1, int par2, int par3, int par4) {
/*  580 */     if (par1 >= -30000000 && par3 >= -30000000 && par1 < 30000000 && par3 < 30000000) {
/*      */       
/*  582 */       if (par2 < 0)
/*      */       {
/*  584 */         return false;
/*      */       }
/*  586 */       if (par2 >= 256)
/*      */       {
/*  588 */         return false;
/*      */       }
/*      */ 
/*      */       
/*  592 */       zz var5 = e(par1 >> 4, par3 >> 4);
/*  593 */       boolean var6 = var5.a(par1 & 0xF, par2, par3 & 0xF, par4);
/*  594 */       this.D.a("checkLight");
/*  595 */       z(par1, par2, par3);
/*  596 */       this.D.b();
/*      */       
/*  598 */       if (var6 && (this.I || var5.o))
/*      */       {
/*  600 */         i(par1, par2, par3);
/*      */       }
/*      */       
/*  603 */       return var6;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  608 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public agi g(int par1, int par2, int par3) {
/*  617 */     int var4 = a(par1, par2, par3);
/*  618 */     return (var4 == 0) ? agi.a : (amq.p[var4]).cB;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int h(int par1, int par2, int par3) {
/*  626 */     if (par1 >= -30000000 && par3 >= -30000000 && par1 < 30000000 && par3 < 30000000) {
/*      */       
/*  628 */       if (par2 < 0)
/*      */       {
/*  630 */         return 0;
/*      */       }
/*  632 */       if (par2 >= 256)
/*      */       {
/*  634 */         return 0;
/*      */       }
/*      */ 
/*      */       
/*  638 */       zz var4 = e(par1 >> 4, par3 >> 4);
/*  639 */       par1 &= 0xF;
/*  640 */       par3 &= 0xF;
/*  641 */       return var4.c(par1, par2, par3);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  646 */     return 0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void c(int par1, int par2, int par3, int par4) {
/*  655 */     if (d(par1, par2, par3, par4))
/*      */     {
/*  657 */       f(par1, par2, par3, a(par1, par2, par3));
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean d(int par1, int par2, int par3, int par4) {
/*  666 */     if (par1 >= -30000000 && par3 >= -30000000 && par1 < 30000000 && par3 < 30000000) {
/*      */       
/*  668 */       if (par2 < 0)
/*      */       {
/*  670 */         return false;
/*      */       }
/*  672 */       if (par2 >= 256)
/*      */       {
/*  674 */         return false;
/*      */       }
/*      */ 
/*      */       
/*  678 */       zz var5 = e(par1 >> 4, par3 >> 4);
/*  679 */       int var6 = par1 & 0xF;
/*  680 */       int var7 = par3 & 0xF;
/*  681 */       boolean var8 = var5.b(var6, par2, var7, par4);
/*      */       
/*  683 */       if (var8 && (this.I || (var5.o && amq.u[var5.a(var6, par2, var7) & 0xFFF])))
/*      */       {
/*  685 */         i(par1, par2, par3);
/*      */       }
/*      */       
/*  688 */       return var8;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  693 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean e(int par1, int par2, int par3, int par4) {
/*  702 */     if (b(par1, par2, par3, par4)) {
/*      */       
/*  704 */       f(par1, par2, par3, par4);
/*  705 */       return true;
/*      */     } 
/*      */ 
/*      */     
/*  709 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean d(int par1, int par2, int par3, int par4, int par5) {
/*  718 */     if (c(par1, par2, par3, par4, par5)) {
/*      */       
/*  720 */       f(par1, par2, par3, par4);
/*  721 */       return true;
/*      */     } 
/*      */ 
/*      */     
/*  725 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void i(int par1, int par2, int par3) {
/*  735 */     for (int var4 = 0; var4 < this.v.size(); var4++)
/*      */     {
/*  737 */       ((yi)this.v.get(var4)).a(par1, par2, par3);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void f(int par1, int par2, int par3, int par4) {
/*  746 */     h(par1, par2, par3, par4);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void g(int par1, int par2, int par3, int par4) {
/*  756 */     if (par3 > par4) {
/*      */       
/*  758 */       int var5 = par4;
/*  759 */       par4 = par3;
/*  760 */       par3 = var5;
/*      */     } 
/*      */     
/*  763 */     if (!this.u.f)
/*      */     {
/*  765 */       for (int var5 = par3; var5 <= par4; var5++)
/*      */       {
/*  767 */         c(yo.a, par1, var5, par2);
/*      */       }
/*      */     }
/*      */     
/*  771 */     e(par1, par3, par2, par1, par4, par2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void j(int par1, int par2, int par3) {
/*  779 */     for (int var4 = 0; var4 < this.v.size(); var4++)
/*      */     {
/*  781 */       ((yi)this.v.get(var4)).a(par1, par2, par3, par1, par2, par3);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void e(int par1, int par2, int par3, int par4, int par5, int par6) {
/*  791 */     for (int var7 = 0; var7 < this.v.size(); var7++)
/*      */     {
/*  793 */       ((yi)this.v.get(var7)).a(par1, par2, par3, par4, par5, par6);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void h(int par1, int par2, int par3, int par4) {
/*  802 */     m(par1 - 1, par2, par3, par4);
/*  803 */     m(par1 + 1, par2, par3, par4);
/*  804 */     m(par1, par2 - 1, par3, par4);
/*  805 */     m(par1, par2 + 1, par3, par4);
/*  806 */     m(par1, par2, par3 - 1, par4);
/*  807 */     m(par1, par2, par3 + 1, par4);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void m(int par1, int par2, int par3, int par4) {
/*  815 */     if (!this.r && !this.I) {
/*      */       
/*  817 */       int var5 = a(par1, par2, par3);
/*  818 */       amq var6 = amq.p[var5];
/*      */       
/*  820 */       if (var6 != null) {
/*      */         
/*      */         try {
/*      */           
/*  824 */           var6.a(this, par1, par2, par3, par4);
/*      */         }
/*  826 */         catch (Throwable var13) {
/*      */           byte b;
/*  828 */           a var8 = a.a(var13, "Exception while updating neighbours");
/*  829 */           l var9 = var8.a("Block being updated");
/*      */ 
/*      */ 
/*      */           
/*      */           try {
/*  834 */             b = h(par1, par2, par3);
/*      */           }
/*  836 */           catch (Throwable var12) {
/*      */             
/*  838 */             b = -1;
/*      */           } 
/*      */           
/*  841 */           var9.a("Source block type", (Callable)new yd(this, par4));
/*  842 */           l.a(var9, par1, par2, par3, var5, b);
/*  843 */           throw new t(var8);
/*      */         } 
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean k(int par1, int par2, int par3) {
/*  854 */     return e(par1 >> 4, par3 >> 4).d(par1 & 0xF, par2, par3 & 0xF);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int l(int par1, int par2, int par3) {
/*  862 */     if (par2 < 0)
/*      */     {
/*  864 */       return 0;
/*      */     }
/*      */ 
/*      */     
/*  868 */     if (par2 >= 256)
/*      */     {
/*  870 */       par2 = 255;
/*      */     }
/*      */     
/*  873 */     return e(par1 >> 4, par3 >> 4).c(par1 & 0xF, par2, par3 & 0xF, 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int m(int par1, int par2, int par3) {
/*  882 */     return a(par1, par2, par3, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int a(int par1, int par2, int par3, boolean par4) {
/*  892 */     if (par1 >= -30000000 && par3 >= -30000000 && par1 < 30000000 && par3 < 30000000) {
/*      */       
/*  894 */       if (par4) {
/*      */         
/*  896 */         int var5 = a(par1, par2, par3);
/*      */         
/*  898 */         if (var5 == amq.an.cm || var5 == amq.bR.cm || var5 == amq.aD.cm || var5 == amq.aK.cm || var5 == amq.aw.cm) {
/*      */           
/*  900 */           int var6 = a(par1, par2 + 1, par3, false);
/*  901 */           int var7 = a(par1 + 1, par2, par3, false);
/*  902 */           int var8 = a(par1 - 1, par2, par3, false);
/*  903 */           int var9 = a(par1, par2, par3 + 1, false);
/*  904 */           int var10 = a(par1, par2, par3 - 1, false);
/*      */           
/*  906 */           if (var7 > var6)
/*      */           {
/*  908 */             var6 = var7;
/*      */           }
/*      */           
/*  911 */           if (var8 > var6)
/*      */           {
/*  913 */             var6 = var8;
/*      */           }
/*      */           
/*  916 */           if (var9 > var6)
/*      */           {
/*  918 */             var6 = var9;
/*      */           }
/*      */           
/*  921 */           if (var10 > var6)
/*      */           {
/*  923 */             var6 = var10;
/*      */           }
/*      */           
/*  926 */           return var6;
/*      */         } 
/*      */       } 
/*      */       
/*  930 */       if (par2 < 0)
/*      */       {
/*  932 */         return 0;
/*      */       }
/*      */ 
/*      */       
/*  936 */       if (par2 >= 256)
/*      */       {
/*  938 */         par2 = 255;
/*      */       }
/*      */       
/*  941 */       zz var11 = e(par1 >> 4, par3 >> 4);
/*  942 */       par1 &= 0xF;
/*  943 */       par3 &= 0xF;
/*  944 */       return var11.c(par1, par2, par3, this.j);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  949 */     return 15;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int f(int par1, int par2) {
/*  958 */     if (par1 >= -30000000 && par2 >= -30000000 && par1 < 30000000 && par2 < 30000000) {
/*      */       
/*  960 */       if (!c(par1 >> 4, par2 >> 4))
/*      */       {
/*  962 */         return 0;
/*      */       }
/*      */ 
/*      */       
/*  966 */       zz var3 = e(par1 >> 4, par2 >> 4);
/*  967 */       return var3.b(par1 & 0xF, par2 & 0xF);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  972 */     return 0;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int g(int par1, int par2) {
/*  978 */     if (par1 >= -30000000 && par2 >= -30000000 && par1 < 30000000 && par2 < 30000000) {
/*      */       
/*  980 */       if (!c(par1 >> 4, par2 >> 4))
/*      */       {
/*  982 */         return 0;
/*      */       }
/*      */ 
/*      */       
/*  986 */       zz var3 = e(par1 >> 4, par2 >> 4);
/*  987 */       return var3.p;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  992 */     return 0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public int a(yo par1EnumSkyBlock, int par2, int par3, int par4) {
/* 1004 */     if (this.u.f && par1EnumSkyBlock == yo.a)
/*      */     {
/* 1006 */       return 0;
/*      */     }
/*      */ 
/*      */     
/* 1010 */     if (par3 < 0)
/*      */     {
/* 1012 */       par3 = 0;
/*      */     }
/*      */     
/* 1015 */     if (par3 >= 256)
/*      */     {
/* 1017 */       return par1EnumSkyBlock.c;
/*      */     }
/* 1019 */     if (par2 >= -30000000 && par4 >= -30000000 && par2 < 30000000 && par4 < 30000000) {
/*      */       
/* 1021 */       int var5 = par2 >> 4;
/* 1022 */       int var6 = par4 >> 4;
/*      */       
/* 1024 */       if (!c(var5, var6))
/*      */       {
/* 1026 */         return par1EnumSkyBlock.c;
/*      */       }
/* 1028 */       if (amq.v[a(par2, par3, par4)]) {
/*      */         
/* 1030 */         int var12 = b(par1EnumSkyBlock, par2, par3 + 1, par4);
/* 1031 */         int var8 = b(par1EnumSkyBlock, par2 + 1, par3, par4);
/* 1032 */         int var9 = b(par1EnumSkyBlock, par2 - 1, par3, par4);
/* 1033 */         int var10 = b(par1EnumSkyBlock, par2, par3, par4 + 1);
/* 1034 */         int var11 = b(par1EnumSkyBlock, par2, par3, par4 - 1);
/*      */         
/* 1036 */         if (var8 > var12)
/*      */         {
/* 1038 */           var12 = var8;
/*      */         }
/*      */         
/* 1041 */         if (var9 > var12)
/*      */         {
/* 1043 */           var12 = var9;
/*      */         }
/*      */         
/* 1046 */         if (var10 > var12)
/*      */         {
/* 1048 */           var12 = var10;
/*      */         }
/*      */         
/* 1051 */         if (var11 > var12)
/*      */         {
/* 1053 */           var12 = var11;
/*      */         }
/*      */         
/* 1056 */         return var12;
/*      */       } 
/*      */ 
/*      */       
/* 1060 */       zz var7 = e(var5, var6);
/* 1061 */       return var7.a(par1EnumSkyBlock, par2 & 0xF, par3, par4 & 0xF);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1066 */     return par1EnumSkyBlock.c;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int b(yo par1EnumSkyBlock, int par2, int par3, int par4) {
/* 1077 */     if (par3 < 0)
/*      */     {
/* 1079 */       par3 = 0;
/*      */     }
/*      */     
/* 1082 */     if (par3 >= 256)
/*      */     {
/* 1084 */       par3 = 255;
/*      */     }
/*      */     
/* 1087 */     if (par2 >= -30000000 && par4 >= -30000000 && par2 < 30000000 && par4 < 30000000) {
/*      */       
/* 1089 */       int var5 = par2 >> 4;
/* 1090 */       int var6 = par4 >> 4;
/*      */       
/* 1092 */       if (!c(var5, var6))
/*      */       {
/* 1094 */         return par1EnumSkyBlock.c;
/*      */       }
/*      */ 
/*      */       
/* 1098 */       zz var7 = e(var5, var6);
/* 1099 */       return var7.a(par1EnumSkyBlock, par2 & 0xF, par3, par4 & 0xF);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1104 */     return par1EnumSkyBlock.c;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(yo par1EnumSkyBlock, int par2, int par3, int par4, int par5) {
/* 1114 */     if (par2 >= -30000000 && par4 >= -30000000 && par2 < 30000000 && par4 < 30000000)
/*      */     {
/* 1116 */       if (par3 >= 0)
/*      */       {
/* 1118 */         if (par3 < 256)
/*      */         {
/* 1120 */           if (c(par2 >> 4, par4 >> 4)) {
/*      */             
/* 1122 */             zz var6 = e(par2 >> 4, par4 >> 4);
/* 1123 */             var6.a(par1EnumSkyBlock, par2 & 0xF, par3, par4 & 0xF, par5);
/*      */             
/* 1125 */             for (int var7 = 0; var7 < this.v.size(); var7++)
/*      */             {
/* 1127 */               ((yi)this.v.get(var7)).b(par2, par3, par4);
/*      */             }
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
/*      */   public void o(int par1, int par2, int par3) {
/* 1140 */     for (int var4 = 0; var4 < this.v.size(); var4++)
/*      */     {
/* 1142 */       ((yi)this.v.get(var4)).b(par1, par2, par3);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public int i(int par1, int par2, int par3, int par4) {
/* 1153 */     int var5 = a(yo.a, par1, par2, par3);
/* 1154 */     int var6 = a(yo.b, par1, par2, par3);
/*      */     
/* 1156 */     if (var6 < par4)
/*      */     {
/* 1158 */       var6 = par4;
/*      */     }
/*      */     
/* 1161 */     return var5 << 20 | var6 << 4;
/*      */   }
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public float j(int par1, int par2, int par3, int par4) {
/* 1167 */     int var5 = m(par1, par2, par3);
/*      */     
/* 1169 */     if (var5 < par4)
/*      */     {
/* 1171 */       var5 = par4;
/*      */     }
/*      */     
/* 1174 */     return this.u.g[var5];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float p(int par1, int par2, int par3) {
/* 1183 */     return this.u.g[m(par1, par2, par3)];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean u() {
/* 1191 */     return this.u.isDaytime();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public aoh a(aoj par1Vec3, aoj par2Vec3) {
/* 1199 */     return a(par1Vec3, par2Vec3, false, false);
/*      */   }
/*      */ 
/*      */   
/*      */   public aoh a(aoj par1Vec3, aoj par2Vec3, boolean par3) {
/* 1204 */     return a(par1Vec3, par2Vec3, par3, false);
/*      */   }
/*      */ 
/*      */   
/*      */   public aoh a(aoj par1Vec3, aoj par2Vec3, boolean par3, boolean par4) {
/* 1209 */     if (!Double.isNaN(par1Vec3.c) && !Double.isNaN(par1Vec3.d) && !Double.isNaN(par1Vec3.e)) {
/*      */       
/* 1211 */       if (!Double.isNaN(par2Vec3.c) && !Double.isNaN(par2Vec3.d) && !Double.isNaN(par2Vec3.e)) {
/*      */         
/* 1213 */         int var5 = ke.c(par2Vec3.c);
/* 1214 */         int var6 = ke.c(par2Vec3.d);
/* 1215 */         int var7 = ke.c(par2Vec3.e);
/* 1216 */         int var8 = ke.c(par1Vec3.c);
/* 1217 */         int var9 = ke.c(par1Vec3.d);
/* 1218 */         int var10 = ke.c(par1Vec3.e);
/* 1219 */         int var11 = a(var8, var9, var10);
/* 1220 */         int var12 = h(var8, var9, var10);
/* 1221 */         amq var13 = amq.p[var11];
/*      */         
/* 1223 */         if (var13 != null && (!par4 || var13 == null || var13.e(this, var8, var9, var10) != null) && var11 > 0 && var13.a(var12, par3)) {
/*      */           
/* 1225 */           aoh var14 = var13.a(this, var8, var9, var10, par1Vec3, par2Vec3);
/*      */           
/* 1227 */           if (var14 != null)
/*      */           {
/* 1229 */             return var14;
/*      */           }
/*      */         } 
/*      */         
/* 1233 */         var11 = 200;
/*      */         
/* 1235 */         while (var11-- >= 0) {
/*      */           byte var42;
/* 1237 */           if (Double.isNaN(par1Vec3.c) || Double.isNaN(par1Vec3.d) || Double.isNaN(par1Vec3.e))
/*      */           {
/* 1239 */             return null;
/*      */           }
/*      */           
/* 1242 */           if (var8 == var5 && var9 == var6 && var10 == var7)
/*      */           {
/* 1244 */             return null;
/*      */           }
/*      */           
/* 1247 */           boolean var39 = true;
/* 1248 */           boolean var40 = true;
/* 1249 */           boolean var41 = true;
/* 1250 */           double var15 = 999.0D;
/* 1251 */           double var17 = 999.0D;
/* 1252 */           double var19 = 999.0D;
/*      */           
/* 1254 */           if (var5 > var8) {
/*      */             
/* 1256 */             var15 = var8 + 1.0D;
/*      */           }
/* 1258 */           else if (var5 < var8) {
/*      */             
/* 1260 */             var15 = var8 + 0.0D;
/*      */           }
/*      */           else {
/*      */             
/* 1264 */             var39 = false;
/*      */           } 
/*      */           
/* 1267 */           if (var6 > var9) {
/*      */             
/* 1269 */             var17 = var9 + 1.0D;
/*      */           }
/* 1271 */           else if (var6 < var9) {
/*      */             
/* 1273 */             var17 = var9 + 0.0D;
/*      */           }
/*      */           else {
/*      */             
/* 1277 */             var40 = false;
/*      */           } 
/*      */           
/* 1280 */           if (var7 > var10) {
/*      */             
/* 1282 */             var19 = var10 + 1.0D;
/*      */           }
/* 1284 */           else if (var7 < var10) {
/*      */             
/* 1286 */             var19 = var10 + 0.0D;
/*      */           }
/*      */           else {
/*      */             
/* 1290 */             var41 = false;
/*      */           } 
/*      */           
/* 1293 */           double var21 = 999.0D;
/* 1294 */           double var23 = 999.0D;
/* 1295 */           double var25 = 999.0D;
/* 1296 */           double var27 = par2Vec3.c - par1Vec3.c;
/* 1297 */           double var29 = par2Vec3.d - par1Vec3.d;
/* 1298 */           double var31 = par2Vec3.e - par1Vec3.e;
/*      */           
/* 1300 */           if (var39)
/*      */           {
/* 1302 */             var21 = (var15 - par1Vec3.c) / var27;
/*      */           }
/*      */           
/* 1305 */           if (var40)
/*      */           {
/* 1307 */             var23 = (var17 - par1Vec3.d) / var29;
/*      */           }
/*      */           
/* 1310 */           if (var41)
/*      */           {
/* 1312 */             var25 = (var19 - par1Vec3.e) / var31;
/*      */           }
/*      */           
/* 1315 */           boolean var33 = false;
/*      */ 
/*      */           
/* 1318 */           if (var21 < var23 && var21 < var25) {
/*      */             
/* 1320 */             if (var5 > var8) {
/*      */               
/* 1322 */               var42 = 4;
/*      */             }
/*      */             else {
/*      */               
/* 1326 */               var42 = 5;
/*      */             } 
/*      */             
/* 1329 */             par1Vec3.c = var15;
/* 1330 */             par1Vec3.d += var29 * var21;
/* 1331 */             par1Vec3.e += var31 * var21;
/*      */           }
/* 1333 */           else if (var23 < var25) {
/*      */             
/* 1335 */             if (var6 > var9) {
/*      */               
/* 1337 */               var42 = 0;
/*      */             }
/*      */             else {
/*      */               
/* 1341 */               var42 = 1;
/*      */             } 
/*      */             
/* 1344 */             par1Vec3.c += var27 * var23;
/* 1345 */             par1Vec3.d = var17;
/* 1346 */             par1Vec3.e += var31 * var23;
/*      */           }
/*      */           else {
/*      */             
/* 1350 */             if (var7 > var10) {
/*      */               
/* 1352 */               var42 = 2;
/*      */             }
/*      */             else {
/*      */               
/* 1356 */               var42 = 3;
/*      */             } 
/*      */             
/* 1359 */             par1Vec3.c += var27 * var25;
/* 1360 */             par1Vec3.d += var29 * var25;
/* 1361 */             par1Vec3.e = var19;
/*      */           } 
/*      */           
/* 1364 */           aoj var34 = S().a(par1Vec3.c, par1Vec3.d, par1Vec3.e);
/* 1365 */           var8 = (int)(var34.c = ke.c(par1Vec3.c));
/*      */           
/* 1367 */           if (var42 == 5) {
/*      */             
/* 1369 */             var8--;
/* 1370 */             var34.c++;
/*      */           } 
/*      */           
/* 1373 */           var9 = (int)(var34.d = ke.c(par1Vec3.d));
/*      */           
/* 1375 */           if (var42 == 1) {
/*      */             
/* 1377 */             var9--;
/* 1378 */             var34.d++;
/*      */           } 
/*      */           
/* 1381 */           var10 = (int)(var34.e = ke.c(par1Vec3.e));
/*      */           
/* 1383 */           if (var42 == 3) {
/*      */             
/* 1385 */             var10--;
/* 1386 */             var34.e++;
/*      */           } 
/*      */           
/* 1389 */           int var35 = a(var8, var9, var10);
/* 1390 */           int var36 = h(var8, var9, var10);
/* 1391 */           amq var37 = amq.p[var35];
/*      */           
/* 1393 */           if ((!par4 || var37 == null || var37.e(this, var8, var9, var10) != null) && var35 > 0 && var37.a(var36, par3)) {
/*      */             
/* 1395 */             aoh var38 = var37.a(this, var8, var9, var10, par1Vec3, par2Vec3);
/*      */             
/* 1397 */             if (var38 != null)
/*      */             {
/* 1399 */               return var38;
/*      */             }
/*      */           } 
/*      */         } 
/*      */         
/* 1404 */         return null;
/*      */       } 
/*      */ 
/*      */       
/* 1408 */       return null;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1413 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(lq par1Entity, String par2Str, float par3, float par4) {
/* 1423 */     PlaySoundAtEntityEvent event = new PlaySoundAtEntityEvent(par1Entity, par2Str, par3, par4);
/* 1424 */     if (MinecraftForge.EVENT_BUS.post((Event)event)) {
/*      */       return;
/*      */     }
/*      */     
/* 1428 */     par2Str = event.name;
/* 1429 */     if (par1Entity != null && par2Str != null)
/*      */     {
/* 1431 */       for (int var5 = 0; var5 < this.v.size(); var5++)
/*      */       {
/* 1433 */         ((yi)this.v.get(var5)).a(par2Str, par1Entity.t, par1Entity.u - par1Entity.M, par1Entity.v, par3, par4);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(qx par1EntityPlayer, String par2Str, float par3, float par4) {
/* 1440 */     PlaySoundAtEntityEvent event = new PlaySoundAtEntityEvent(par1EntityPlayer, par2Str, par3, par4);
/* 1441 */     if (MinecraftForge.EVENT_BUS.post((Event)event)) {
/*      */       return;
/*      */     }
/*      */     
/* 1445 */     par2Str = event.name;
/* 1446 */     if (par1EntityPlayer != null && par2Str != null)
/*      */     {
/* 1448 */       for (int var5 = 0; var5 < this.v.size(); var5++)
/*      */       {
/* 1450 */         ((yi)this.v.get(var5)).a(par1EntityPlayer, par2Str, par1EntityPlayer.t, par1EntityPlayer.u - par1EntityPlayer.M, par1EntityPlayer.v, par3, par4);
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
/*      */   public void a(double par1, double par3, double par5, String par7Str, float par8, float par9) {
/* 1462 */     if (par7Str != null)
/*      */     {
/* 1464 */       for (int var10 = 0; var10 < this.v.size(); var10++)
/*      */       {
/* 1466 */         ((yi)this.v.get(var10)).a(par7Str, par1, par3, par5, par8, par9);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(double par1, double par3, double par5, String par7Str, float par8, float par9, boolean par10) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(String par1Str, int par2, int par3, int par4) {
/* 1481 */     for (int var5 = 0; var5 < this.v.size(); var5++)
/*      */     {
/* 1483 */       ((yi)this.v.get(var5)).a(par1Str, par2, par3, par4);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(String par1Str, double par2, double par4, double par6, double par8, double par10, double par12) {
/* 1492 */     for (int var14 = 0; var14 < this.v.size(); var14++)
/*      */     {
/* 1494 */       ((yi)this.v.get(var14)).a(par1Str, par2, par4, par6, par8, par10, par12);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean c(lq par1Entity) {
/* 1503 */     this.i.add(par1Entity);
/* 1504 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean d(lq par1Entity) {
/* 1512 */     int var2 = ke.c(par1Entity.t / 16.0D);
/* 1513 */     int var3 = ke.c(par1Entity.v / 16.0D);
/* 1514 */     boolean var4 = false;
/*      */     
/* 1516 */     if (par1Entity instanceof qx)
/*      */     {
/* 1518 */       var4 = true;
/*      */     }
/*      */     
/* 1521 */     if (!var4 && !c(var2, var3))
/*      */     {
/* 1523 */       return false;
/*      */     }
/*      */ 
/*      */     
/* 1527 */     if (par1Entity instanceof qx) {
/*      */       
/* 1529 */       qx var5 = (qx)par1Entity;
/* 1530 */       this.h.add(var5);
/* 1531 */       c();
/*      */     } 
/*      */     
/* 1534 */     if (!var4 && MinecraftForge.EVENT_BUS.post((Event)new EntityJoinWorldEvent(par1Entity, this)))
/*      */     {
/* 1536 */       return false;
/*      */     }
/*      */     
/* 1539 */     e(var2, var3).a(par1Entity);
/* 1540 */     this.e.add(par1Entity);
/* 1541 */     a(par1Entity);
/* 1542 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void a(lq par1Entity) {
/* 1551 */     for (int var2 = 0; var2 < this.v.size(); var2++)
/*      */     {
/* 1553 */       ((yi)this.v.get(var2)).a(par1Entity);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void b(lq par1Entity) {
/* 1562 */     for (int var2 = 0; var2 < this.v.size(); var2++)
/*      */     {
/* 1564 */       ((yi)this.v.get(var2)).b(par1Entity);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void e(lq par1Entity) {
/* 1574 */     if (par1Entity.n != null)
/*      */     {
/* 1576 */       par1Entity.n.a((lq)null);
/*      */     }
/*      */     
/* 1579 */     if (par1Entity.o != null)
/*      */     {
/* 1581 */       par1Entity.a((lq)null);
/*      */     }
/*      */     
/* 1584 */     par1Entity.x();
/*      */     
/* 1586 */     if (par1Entity instanceof qx) {
/*      */       
/* 1588 */       this.h.remove(par1Entity);
/* 1589 */       c();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void f(lq par1Entity) {
/* 1598 */     par1Entity.x();
/*      */     
/* 1600 */     if (par1Entity instanceof qx) {
/*      */       
/* 1602 */       this.h.remove(par1Entity);
/* 1603 */       c();
/*      */     } 
/*      */     
/* 1606 */     int var2 = par1Entity.ai;
/* 1607 */     int var3 = par1Entity.ak;
/*      */     
/* 1609 */     if (par1Entity.ah && c(var2, var3))
/*      */     {
/* 1611 */       e(var2, var3).b(par1Entity);
/*      */     }
/*      */     
/* 1614 */     this.e.remove(par1Entity);
/* 1615 */     b(par1Entity);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(yi par1IWorldAccess) {
/* 1623 */     this.v.add(par1IWorldAccess);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public List a(lq par1Entity, aoe par2AxisAlignedBB) {
/* 1632 */     this.L.clear();
/* 1633 */     int var3 = ke.c(par2AxisAlignedBB.a);
/* 1634 */     int var4 = ke.c(par2AxisAlignedBB.d + 1.0D);
/* 1635 */     int var5 = ke.c(par2AxisAlignedBB.b);
/* 1636 */     int var6 = ke.c(par2AxisAlignedBB.e + 1.0D);
/* 1637 */     int var7 = ke.c(par2AxisAlignedBB.c);
/* 1638 */     int var8 = ke.c(par2AxisAlignedBB.f + 1.0D);
/*      */     
/* 1640 */     for (int var9 = var3; var9 < var4; var9++) {
/*      */       
/* 1642 */       for (int var10 = var7; var10 < var8; var10++) {
/*      */         
/* 1644 */         if (f(var9, 64, var10))
/*      */         {
/* 1646 */           for (int var11 = var5 - 1; var11 < var6; var11++) {
/*      */             
/* 1648 */             amq var12 = amq.p[a(var9, var11, var10)];
/*      */             
/* 1650 */             if (var12 != null)
/*      */             {
/* 1652 */               var12.a(this, var9, var11, var10, par2AxisAlignedBB, this.L, par1Entity);
/*      */             }
/*      */           } 
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/* 1659 */     double var14 = 0.25D;
/* 1660 */     List<lq> var16 = b(par1Entity, par2AxisAlignedBB.b(var14, var14, var14));
/*      */     
/* 1662 */     for (int var15 = 0; var15 < var16.size(); var15++) {
/*      */       
/* 1664 */       aoe var13 = ((lq)var16.get(var15)).E();
/*      */       
/* 1666 */       if (var13 != null && var13.a(par2AxisAlignedBB))
/*      */       {
/* 1668 */         this.L.add(var13);
/*      */       }
/*      */       
/* 1671 */       var13 = par1Entity.g(var16.get(var15));
/*      */       
/* 1673 */       if (var13 != null && var13.a(par2AxisAlignedBB))
/*      */       {
/* 1675 */         this.L.add(var13);
/*      */       }
/*      */     } 
/*      */     
/* 1679 */     return this.L;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public List a(aoe par1AxisAlignedBB) {
/* 1687 */     this.L.clear();
/* 1688 */     int var2 = ke.c(par1AxisAlignedBB.a);
/* 1689 */     int var3 = ke.c(par1AxisAlignedBB.d + 1.0D);
/* 1690 */     int var4 = ke.c(par1AxisAlignedBB.b);
/* 1691 */     int var5 = ke.c(par1AxisAlignedBB.e + 1.0D);
/* 1692 */     int var6 = ke.c(par1AxisAlignedBB.c);
/* 1693 */     int var7 = ke.c(par1AxisAlignedBB.f + 1.0D);
/*      */     
/* 1695 */     for (int var8 = var2; var8 < var3; var8++) {
/*      */       
/* 1697 */       for (int var9 = var6; var9 < var7; var9++) {
/*      */         
/* 1699 */         if (f(var8, 64, var9))
/*      */         {
/* 1701 */           for (int var10 = var4 - 1; var10 < var5; var10++) {
/*      */             
/* 1703 */             amq var11 = amq.p[a(var8, var10, var9)];
/*      */             
/* 1705 */             if (var11 != null)
/*      */             {
/* 1707 */               var11.a(this, var8, var10, var9, par1AxisAlignedBB, this.L, (lq)null);
/*      */             }
/*      */           } 
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/* 1714 */     return this.L;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int a(float par1) {
/* 1722 */     float var2 = c(par1);
/* 1723 */     float var3 = 1.0F - ke.b(var2 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
/*      */     
/* 1725 */     if (var3 < 0.0F)
/*      */     {
/* 1727 */       var3 = 0.0F;
/*      */     }
/*      */     
/* 1730 */     if (var3 > 1.0F)
/*      */     {
/* 1732 */       var3 = 1.0F;
/*      */     }
/*      */     
/* 1735 */     var3 = 1.0F - var3;
/* 1736 */     var3 = (float)(var3 * (1.0D - (j(par1) * 5.0F) / 16.0D));
/* 1737 */     var3 = (float)(var3 * (1.0D - (i(par1) * 5.0F) / 16.0D));
/* 1738 */     var3 = 1.0F - var3;
/* 1739 */     return (int)(var3 * 11.0F);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public void b(yi par1IWorldAccess) {
/* 1749 */     this.v.remove(par1IWorldAccess);
/*      */   }
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public float b(float par1) {
/* 1755 */     float var2 = c(par1);
/* 1756 */     float var3 = 1.0F - ke.b(var2 * 3.1415927F * 2.0F) * 2.0F + 0.2F;
/*      */     
/* 1758 */     if (var3 < 0.0F)
/*      */     {
/* 1760 */       var3 = 0.0F;
/*      */     }
/*      */     
/* 1763 */     if (var3 > 1.0F)
/*      */     {
/* 1765 */       var3 = 1.0F;
/*      */     }
/*      */     
/* 1768 */     var3 = 1.0F - var3;
/* 1769 */     var3 = (float)(var3 * (1.0D - (j(par1) * 5.0F) / 16.0D));
/* 1770 */     var3 = (float)(var3 * (1.0D - (i(par1) * 5.0F) / 16.0D));
/* 1771 */     return var3 * 0.8F + 0.2F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public aoj a(lq par1Entity, float par2) {
/* 1781 */     return this.u.getSkyColor(par1Entity, par2);
/*      */   }
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public aoj getSkyColorBody(lq par1Entity, float par2) {
/* 1787 */     float var3 = c(par2);
/* 1788 */     float var4 = ke.b(var3 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
/*      */     
/* 1790 */     if (var4 < 0.0F)
/*      */     {
/* 1792 */       var4 = 0.0F;
/*      */     }
/*      */     
/* 1795 */     if (var4 > 1.0F)
/*      */     {
/* 1797 */       var4 = 1.0F;
/*      */     }
/*      */     
/* 1800 */     int var5 = ke.c(par1Entity.t);
/* 1801 */     int var6 = ke.c(par1Entity.v);
/* 1802 */     yy var7 = a(var5, var6);
/* 1803 */     float var8 = var7.j();
/* 1804 */     int var9 = var7.a(var8);
/* 1805 */     float var10 = (var9 >> 16 & 0xFF) / 255.0F;
/* 1806 */     float var11 = (var9 >> 8 & 0xFF) / 255.0F;
/* 1807 */     float var12 = (var9 & 0xFF) / 255.0F;
/* 1808 */     var10 *= var4;
/* 1809 */     var11 *= var4;
/* 1810 */     var12 *= var4;
/* 1811 */     float var13 = j(par2);
/*      */ 
/*      */ 
/*      */     
/* 1815 */     if (var13 > 0.0F) {
/*      */       
/* 1817 */       float f1 = (var10 * 0.3F + var11 * 0.59F + var12 * 0.11F) * 0.6F;
/* 1818 */       float var15 = 1.0F - var13 * 0.75F;
/* 1819 */       var10 = var10 * var15 + f1 * (1.0F - var15);
/* 1820 */       var11 = var11 * var15 + f1 * (1.0F - var15);
/* 1821 */       var12 = var12 * var15 + f1 * (1.0F - var15);
/*      */     } 
/*      */     
/* 1824 */     float var14 = i(par2);
/*      */     
/* 1826 */     if (var14 > 0.0F) {
/*      */       
/* 1828 */       float var15 = (var10 * 0.3F + var11 * 0.59F + var12 * 0.11F) * 0.2F;
/* 1829 */       float var16 = 1.0F - var14 * 0.75F;
/* 1830 */       var10 = var10 * var16 + var15 * (1.0F - var16);
/* 1831 */       var11 = var11 * var16 + var15 * (1.0F - var16);
/* 1832 */       var12 = var12 * var16 + var15 * (1.0F - var16);
/*      */     } 
/*      */     
/* 1835 */     if (this.q > 0) {
/*      */       
/* 1837 */       float var15 = this.q - par2;
/*      */       
/* 1839 */       if (var15 > 1.0F)
/*      */       {
/* 1841 */         var15 = 1.0F;
/*      */       }
/*      */       
/* 1844 */       var15 *= 0.45F;
/* 1845 */       var10 = var10 * (1.0F - var15) + 0.8F * var15;
/* 1846 */       var11 = var11 * (1.0F - var15) + 0.8F * var15;
/* 1847 */       var12 = var12 * (1.0F - var15) + 1.0F * var15;
/*      */     } 
/*      */     
/* 1850 */     return S().a(var10, var11, var12);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float c(float par1) {
/* 1858 */     return this.u.a(this.y.g(), par1);
/*      */   }
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public int d(float par1) {
/* 1864 */     return this.u.b(this.y.g(), par1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public float e(float par1) {
/* 1874 */     float var2 = c(par1);
/* 1875 */     return var2 * 3.1415927F * 2.0F;
/*      */   }
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public aoj f(float par1) {
/* 1881 */     return this.u.drawClouds(par1);
/*      */   }
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public aoj drawCloudsBody(float par1) {
/* 1887 */     float var2 = c(par1);
/* 1888 */     float var3 = ke.b(var2 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
/*      */     
/* 1890 */     if (var3 < 0.0F)
/*      */     {
/* 1892 */       var3 = 0.0F;
/*      */     }
/*      */     
/* 1895 */     if (var3 > 1.0F)
/*      */     {
/* 1897 */       var3 = 1.0F;
/*      */     }
/*      */     
/* 1900 */     float var4 = (float)(this.c >> 16L & 0xFFL) / 255.0F;
/* 1901 */     float var5 = (float)(this.c >> 8L & 0xFFL) / 255.0F;
/* 1902 */     float var6 = (float)(this.c & 0xFFL) / 255.0F;
/* 1903 */     float var7 = j(par1);
/*      */ 
/*      */ 
/*      */     
/* 1907 */     if (var7 > 0.0F) {
/*      */       
/* 1909 */       float f1 = (var4 * 0.3F + var5 * 0.59F + var6 * 0.11F) * 0.6F;
/* 1910 */       float var9 = 1.0F - var7 * 0.95F;
/* 1911 */       var4 = var4 * var9 + f1 * (1.0F - var9);
/* 1912 */       var5 = var5 * var9 + f1 * (1.0F - var9);
/* 1913 */       var6 = var6 * var9 + f1 * (1.0F - var9);
/*      */     } 
/*      */     
/* 1916 */     var4 *= var3 * 0.9F + 0.1F;
/* 1917 */     var5 *= var3 * 0.9F + 0.1F;
/* 1918 */     var6 *= var3 * 0.85F + 0.15F;
/* 1919 */     float var8 = i(par1);
/*      */     
/* 1921 */     if (var8 > 0.0F) {
/*      */       
/* 1923 */       float var9 = (var4 * 0.3F + var5 * 0.59F + var6 * 0.11F) * 0.2F;
/* 1924 */       float var10 = 1.0F - var8 * 0.95F;
/* 1925 */       var4 = var4 * var10 + var9 * (1.0F - var10);
/* 1926 */       var5 = var5 * var10 + var9 * (1.0F - var10);
/* 1927 */       var6 = var6 * var10 + var9 * (1.0F - var10);
/*      */     } 
/*      */     
/* 1930 */     return S().a(var4, var5, var6);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public aoj g(float par1) {
/* 1940 */     float var2 = c(par1);
/* 1941 */     return this.u.b(var2, par1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int h(int par1, int par2) {
/* 1949 */     return d(par1, par2).d(par1 & 0xF, par2 & 0xF);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int i(int par1, int par2) {
/* 1957 */     zz var3 = d(par1, par2);
/* 1958 */     int var4 = var3.h() + 15;
/* 1959 */     par1 &= 0xF;
/*      */     
/* 1961 */     for (par2 &= 0xF; var4 > 0; var4--) {
/*      */       
/* 1963 */       int var5 = var3.a(par1, var4, par2);
/*      */       
/* 1965 */       if (var5 != 0 && (amq.p[var5]).cB.c() && (amq.p[var5]).cB != agi.j && !amq.p[var5].isBlockFoliage(this, par1, var4, par2))
/*      */       {
/* 1967 */         return var4 + 1;
/*      */       }
/*      */     } 
/*      */     
/* 1971 */     return -1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public float h(float par1) {
/* 1981 */     return this.u.getStarBrightness(par1);
/*      */   }
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public float getStarBrightnessBody(float par1) {
/* 1987 */     float var2 = c(par1);
/* 1988 */     float var3 = 1.0F - ke.b(var2 * 3.1415927F * 2.0F) * 2.0F + 0.25F;
/*      */     
/* 1990 */     if (var3 < 0.0F)
/*      */     {
/* 1992 */       var3 = 0.0F;
/*      */     }
/*      */     
/* 1995 */     if (var3 > 1.0F)
/*      */     {
/* 1997 */       var3 = 1.0F;
/*      */     }
/*      */     
/* 2000 */     return var3 * var3 * 0.5F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(int par1, int par2, int par3, int par4, int par5) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(int par1, int par2, int par3, int par4, int par5, int par6) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(int par1, int par2, int par3, int par4, int par5) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public void h() {
/* 2020 */     this.D.a("entities");
/* 2021 */     this.D.a("global");
/*      */ 
/*      */     
/*      */     int var1;
/*      */ 
/*      */     
/* 2027 */     for (var1 = 0; var1 < this.i.size(); var1++) {
/*      */       
/* 2029 */       lq var2 = this.i.get(var1);
/*      */ 
/*      */       
/*      */       try {
/* 2033 */         var2.ab++;
/* 2034 */         var2.j_();
/*      */       }
/* 2036 */       catch (Throwable var7) {
/*      */         
/* 2038 */         a var4 = a.a(var7, "Ticking entity");
/* 2039 */         l var5 = var4.a("Entity being ticked");
/*      */         
/* 2041 */         if (var2 == null) {
/*      */           
/* 2043 */           var5.a("Entity", "~~NULL~~");
/*      */         }
/*      */         else {
/*      */           
/* 2047 */           var2.a(var5);
/*      */         } 
/*      */         
/* 2050 */         throw new t(var4);
/*      */       } 
/*      */       
/* 2053 */       if (var2.L)
/*      */       {
/* 2055 */         this.i.remove(var1--);
/*      */       }
/*      */     } 
/*      */     
/* 2059 */     this.D.c("remove");
/* 2060 */     this.e.removeAll(this.f);
/*      */ 
/*      */ 
/*      */     
/* 2064 */     for (var1 = 0; var1 < this.f.size(); var1++) {
/*      */       
/* 2066 */       lq var2 = this.f.get(var1);
/* 2067 */       int var3 = var2.ai;
/* 2068 */       int var13 = var2.ak;
/*      */       
/* 2070 */       if (var2.ah && c(var3, var13))
/*      */       {
/* 2072 */         e(var3, var13).b(var2);
/*      */       }
/*      */     } 
/*      */     
/* 2076 */     for (var1 = 0; var1 < this.f.size(); var1++)
/*      */     {
/* 2078 */       b(this.f.get(var1));
/*      */     }
/*      */     
/* 2081 */     this.f.clear();
/* 2082 */     this.D.c("regular");
/*      */     
/* 2084 */     for (var1 = 0; var1 < this.e.size(); var1++) {
/*      */       
/* 2086 */       lq var2 = this.e.get(var1);
/*      */       
/* 2088 */       if (var2.o != null) {
/*      */         
/* 2090 */         if (!var2.o.L && var2.o.n == var2) {
/*      */           continue;
/*      */         }
/*      */ 
/*      */         
/* 2095 */         var2.o.n = null;
/* 2096 */         var2.o = null;
/*      */       } 
/*      */       
/* 2099 */       this.D.a("tick");
/*      */       
/* 2101 */       if (!var2.L) {
/*      */         
/*      */         try {
/*      */           
/* 2105 */           g(var2);
/*      */         }
/* 2107 */         catch (Throwable var6) {
/*      */           
/* 2109 */           a var4 = a.a(var6, "Ticking entity");
/* 2110 */           l var5 = var4.a("Entity being ticked");
/*      */           
/* 2112 */           if (var2 == null) {
/*      */             
/* 2114 */             var5.a("Entity", "~~NULL~~");
/*      */           }
/*      */           else {
/*      */             
/* 2118 */             var2.a(var5);
/*      */           } 
/*      */           
/* 2121 */           throw new t(var4);
/*      */         } 
/*      */       }
/*      */       
/* 2125 */       this.D.b();
/* 2126 */       this.D.a("remove");
/*      */       
/* 2128 */       if (var2.L) {
/*      */         
/* 2130 */         int var3 = var2.ai;
/* 2131 */         int var13 = var2.ak;
/*      */         
/* 2133 */         if (var2.ah && c(var3, var13))
/*      */         {
/* 2135 */           e(var3, var13).b(var2);
/*      */         }
/*      */         
/* 2138 */         this.e.remove(var1--);
/* 2139 */         b(var2);
/*      */       } 
/*      */       
/* 2142 */       this.D.b();
/*      */       continue;
/*      */     } 
/* 2145 */     this.D.c("tileEntities");
/* 2146 */     this.M = true;
/* 2147 */     Iterator<any> var14 = this.g.iterator();
/*      */     
/* 2149 */     while (var14.hasNext()) {
/*      */       
/* 2151 */       any var9 = var14.next();
/*      */       
/* 2153 */       if (!var9.r() && var9.o() && f(var9.l, var9.m, var9.n)) {
/*      */         
/*      */         try {
/*      */           
/* 2157 */           var9.g();
/*      */         }
/* 2159 */         catch (Throwable var8) {
/*      */           
/* 2161 */           a var4 = a.a(var8, "Ticking tile entity");
/* 2162 */           l var5 = var4.a("Tile entity being ticked");
/*      */           
/* 2164 */           if (var9 == null) {
/*      */             
/* 2166 */             var5.a("Tile entity", "~~NULL~~");
/*      */           }
/*      */           else {
/*      */             
/* 2170 */             var9.a(var5);
/*      */           } 
/*      */           
/* 2173 */           throw new t(var4);
/*      */         } 
/*      */       }
/*      */       
/* 2177 */       if (var9.r()) {
/*      */         
/* 2179 */         var14.remove();
/*      */         
/* 2181 */         if (c(var9.l >> 4, var9.n >> 4)) {
/*      */           
/* 2183 */           zz var11 = e(var9.l >> 4, var9.n >> 4);
/*      */           
/* 2185 */           if (var11 != null)
/*      */           {
/* 2187 */             var11.cleanChunkBlockTileEntity(var9.l & 0xF, var9.m, var9.n & 0xF);
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 2194 */     if (!this.b.isEmpty()) {
/*      */       
/* 2196 */       for (Object tile : this.b)
/*      */       {
/* 2198 */         ((any)tile).onChunkUnload();
/*      */       }
/* 2200 */       this.g.removeAll(this.b);
/* 2201 */       this.b.clear();
/*      */     } 
/*      */     
/* 2204 */     this.M = false;
/*      */     
/* 2206 */     this.D.c("pendingTileEntities");
/*      */     
/* 2208 */     if (!this.a.isEmpty()) {
/*      */       
/* 2210 */       for (int var10 = 0; var10 < this.a.size(); var10++) {
/*      */         
/* 2212 */         any var12 = this.a.get(var10);
/*      */         
/* 2214 */         if (!var12.r()) {
/*      */           
/* 2216 */           if (!this.g.contains(var12))
/*      */           {
/* 2218 */             this.g.add(var12);
/*      */           
/*      */           }
/*      */         
/*      */         }
/* 2223 */         else if (c(var12.l >> 4, var12.n >> 4)) {
/*      */           
/* 2225 */           zz var15 = e(var12.l >> 4, var12.n >> 4);
/*      */           
/* 2227 */           if (var15 != null)
/*      */           {
/* 2229 */             var15.cleanChunkBlockTileEntity(var12.l & 0xF, var12.m, var12.n & 0xF);
/*      */           }
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 2235 */       this.a.clear();
/*      */     } 
/*      */     
/* 2238 */     this.D.b();
/* 2239 */     this.D.b();
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(Collection par1Collection) {
/* 2244 */     List<Object> dest = this.M ? this.a : this.g;
/* 2245 */     for (Object entity : par1Collection) {
/*      */       
/* 2247 */       if (((any)entity).canUpdate())
/*      */       {
/* 2249 */         dest.add(entity);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void g(lq par1Entity) {
/* 2259 */     a(par1Entity, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(lq par1Entity, boolean par2) {
/* 2268 */     int var3 = ke.c(par1Entity.t);
/* 2269 */     int var4 = ke.c(par1Entity.v);
/*      */     
/* 2271 */     boolean isForced = getPersistentChunks().containsKey(new xv(var3 >> 4, var4 >> 4));
/* 2272 */     byte var5 = isForced ? 0 : 32;
/* 2273 */     boolean canUpdate = (!par2 || d(var3 - var5, 0, var4 - var5, var3 + var5, 0, var4 + var5));
/* 2274 */     if (!canUpdate) {
/*      */       
/* 2276 */       EntityEvent.CanUpdate event = new EntityEvent.CanUpdate(par1Entity);
/* 2277 */       MinecraftForge.EVENT_BUS.post((Event)event);
/* 2278 */       canUpdate = event.canUpdate;
/*      */     } 
/* 2280 */     if (canUpdate) {
/*      */       
/* 2282 */       par1Entity.T = par1Entity.t;
/* 2283 */       par1Entity.U = par1Entity.u;
/* 2284 */       par1Entity.V = par1Entity.v;
/* 2285 */       par1Entity.B = par1Entity.z;
/* 2286 */       par1Entity.C = par1Entity.A;
/*      */       
/* 2288 */       if (par2 && par1Entity.ah)
/*      */       {
/* 2290 */         if (par1Entity.o != null) {
/*      */           
/* 2292 */           par1Entity.U();
/*      */         }
/*      */         else {
/*      */           
/* 2296 */           par1Entity.ab++;
/* 2297 */           par1Entity.j_();
/*      */         } 
/*      */       }
/*      */       
/* 2301 */       this.D.a("chunkCheck");
/*      */       
/* 2303 */       if (Double.isNaN(par1Entity.t) || Double.isInfinite(par1Entity.t))
/*      */       {
/* 2305 */         par1Entity.t = par1Entity.T;
/*      */       }
/*      */       
/* 2308 */       if (Double.isNaN(par1Entity.u) || Double.isInfinite(par1Entity.u))
/*      */       {
/* 2310 */         par1Entity.u = par1Entity.U;
/*      */       }
/*      */       
/* 2313 */       if (Double.isNaN(par1Entity.v) || Double.isInfinite(par1Entity.v))
/*      */       {
/* 2315 */         par1Entity.v = par1Entity.V;
/*      */       }
/*      */       
/* 2318 */       if (Double.isNaN(par1Entity.A) || Double.isInfinite(par1Entity.A))
/*      */       {
/* 2320 */         par1Entity.A = par1Entity.C;
/*      */       }
/*      */       
/* 2323 */       if (Double.isNaN(par1Entity.z) || Double.isInfinite(par1Entity.z))
/*      */       {
/* 2325 */         par1Entity.z = par1Entity.B;
/*      */       }
/*      */       
/* 2328 */       int var6 = ke.c(par1Entity.t / 16.0D);
/* 2329 */       int var7 = ke.c(par1Entity.u / 16.0D);
/* 2330 */       int var8 = ke.c(par1Entity.v / 16.0D);
/*      */       
/* 2332 */       if (!par1Entity.ah || par1Entity.ai != var6 || par1Entity.aj != var7 || par1Entity.ak != var8) {
/*      */         
/* 2334 */         if (par1Entity.ah && c(par1Entity.ai, par1Entity.ak))
/*      */         {
/* 2336 */           e(par1Entity.ai, par1Entity.ak).a(par1Entity, par1Entity.aj);
/*      */         }
/*      */         
/* 2339 */         if (c(var6, var8)) {
/*      */           
/* 2341 */           par1Entity.ah = true;
/* 2342 */           e(var6, var8).a(par1Entity);
/*      */         }
/*      */         else {
/*      */           
/* 2346 */           par1Entity.ah = false;
/*      */         } 
/*      */       } 
/*      */       
/* 2350 */       this.D.b();
/*      */       
/* 2352 */       if (par2 && par1Entity.ah && par1Entity.n != null)
/*      */       {
/* 2354 */         if (!par1Entity.n.L && par1Entity.n.o == par1Entity) {
/*      */           
/* 2356 */           g(par1Entity.n);
/*      */         }
/*      */         else {
/*      */           
/* 2360 */           par1Entity.n.o = null;
/* 2361 */           par1Entity.n = null;
/*      */         } 
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean b(aoe par1AxisAlignedBB) {
/* 2372 */     return a(par1AxisAlignedBB, (lq)null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(aoe par1AxisAlignedBB, lq par2Entity) {
/* 2380 */     List<lq> var3 = b((lq)null, par1AxisAlignedBB);
/*      */     
/* 2382 */     for (int var4 = 0; var4 < var3.size(); var4++) {
/*      */       
/* 2384 */       lq var5 = var3.get(var4);
/*      */       
/* 2386 */       if (!var5.L && var5.m && var5 != par2Entity)
/*      */       {
/* 2388 */         return false;
/*      */       }
/*      */     } 
/*      */     
/* 2392 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean c(aoe par1AxisAlignedBB) {
/* 2400 */     int var2 = ke.c(par1AxisAlignedBB.a);
/* 2401 */     int var3 = ke.c(par1AxisAlignedBB.d + 1.0D);
/* 2402 */     int var4 = ke.c(par1AxisAlignedBB.b);
/* 2403 */     int var5 = ke.c(par1AxisAlignedBB.e + 1.0D);
/* 2404 */     int var6 = ke.c(par1AxisAlignedBB.c);
/* 2405 */     int var7 = ke.c(par1AxisAlignedBB.f + 1.0D);
/*      */     
/* 2407 */     if (par1AxisAlignedBB.a < 0.0D)
/*      */     {
/* 2409 */       var2--;
/*      */     }
/*      */     
/* 2412 */     if (par1AxisAlignedBB.b < 0.0D)
/*      */     {
/* 2414 */       var4--;
/*      */     }
/*      */     
/* 2417 */     if (par1AxisAlignedBB.c < 0.0D)
/*      */     {
/* 2419 */       var6--;
/*      */     }
/*      */     
/* 2422 */     for (int var8 = var2; var8 < var3; var8++) {
/*      */       
/* 2424 */       for (int var9 = var4; var9 < var5; var9++) {
/*      */         
/* 2426 */         for (int var10 = var6; var10 < var7; var10++) {
/*      */           
/* 2428 */           amq var11 = amq.p[a(var8, var9, var10)];
/*      */           
/* 2430 */           if (var11 != null)
/*      */           {
/* 2432 */             return true;
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 2438 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean d(aoe par1AxisAlignedBB) {
/* 2446 */     int var2 = ke.c(par1AxisAlignedBB.a);
/* 2447 */     int var3 = ke.c(par1AxisAlignedBB.d + 1.0D);
/* 2448 */     int var4 = ke.c(par1AxisAlignedBB.b);
/* 2449 */     int var5 = ke.c(par1AxisAlignedBB.e + 1.0D);
/* 2450 */     int var6 = ke.c(par1AxisAlignedBB.c);
/* 2451 */     int var7 = ke.c(par1AxisAlignedBB.f + 1.0D);
/*      */     
/* 2453 */     if (par1AxisAlignedBB.a < 0.0D)
/*      */     {
/* 2455 */       var2--;
/*      */     }
/*      */     
/* 2458 */     if (par1AxisAlignedBB.b < 0.0D)
/*      */     {
/* 2460 */       var4--;
/*      */     }
/*      */     
/* 2463 */     if (par1AxisAlignedBB.c < 0.0D)
/*      */     {
/* 2465 */       var6--;
/*      */     }
/*      */     
/* 2468 */     for (int var8 = var2; var8 < var3; var8++) {
/*      */       
/* 2470 */       for (int var9 = var4; var9 < var5; var9++) {
/*      */         
/* 2472 */         for (int var10 = var6; var10 < var7; var10++) {
/*      */           
/* 2474 */           amq var11 = amq.p[a(var8, var9, var10)];
/*      */           
/* 2476 */           if (var11 != null && var11.cB.d())
/*      */           {
/* 2478 */             return true;
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 2484 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean e(aoe par1AxisAlignedBB) {
/* 2492 */     int var2 = ke.c(par1AxisAlignedBB.a);
/* 2493 */     int var3 = ke.c(par1AxisAlignedBB.d + 1.0D);
/* 2494 */     int var4 = ke.c(par1AxisAlignedBB.b);
/* 2495 */     int var5 = ke.c(par1AxisAlignedBB.e + 1.0D);
/* 2496 */     int var6 = ke.c(par1AxisAlignedBB.c);
/* 2497 */     int var7 = ke.c(par1AxisAlignedBB.f + 1.0D);
/*      */     
/* 2499 */     if (d(var2, var4, var6, var3, var5, var7))
/*      */     {
/* 2501 */       for (int var8 = var2; var8 < var3; var8++) {
/*      */         
/* 2503 */         for (int var9 = var4; var9 < var5; var9++) {
/*      */           
/* 2505 */           for (int var10 = var6; var10 < var7; var10++) {
/*      */             
/* 2507 */             int var11 = a(var8, var9, var10);
/*      */             
/* 2509 */             if (var11 == mod_SCP.SCP310Fire.cm || var11 == amq.au.cm || var11 == amq.F.cm || var11 == amq.G.cm)
/*      */             {
/* 2511 */               return true;
/*      */             }
/*      */ 
/*      */             
/* 2515 */             amq block = amq.p[var11];
/* 2516 */             if (block != null && block.isBlockBurning(this, var8, var9, var10))
/*      */             {
/* 2518 */               return true;
/*      */             }
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/* 2526 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(aoe par1AxisAlignedBB, agi par2Material, lq par3Entity) {
/* 2534 */     int var4 = ke.c(par1AxisAlignedBB.a);
/* 2535 */     int var5 = ke.c(par1AxisAlignedBB.d + 1.0D);
/* 2536 */     int var6 = ke.c(par1AxisAlignedBB.b);
/* 2537 */     int var7 = ke.c(par1AxisAlignedBB.e + 1.0D);
/* 2538 */     int var8 = ke.c(par1AxisAlignedBB.c);
/* 2539 */     int var9 = ke.c(par1AxisAlignedBB.f + 1.0D);
/*      */     
/* 2541 */     if (!d(var4, var6, var8, var5, var7, var9))
/*      */     {
/* 2543 */       return false;
/*      */     }
/*      */ 
/*      */     
/* 2547 */     boolean var10 = false;
/* 2548 */     aoj var11 = S().a(0.0D, 0.0D, 0.0D);
/*      */     
/* 2550 */     for (int var12 = var4; var12 < var5; var12++) {
/*      */       
/* 2552 */       for (int var13 = var6; var13 < var7; var13++) {
/*      */         
/* 2554 */         for (int var14 = var8; var14 < var9; var14++) {
/*      */           
/* 2556 */           amq var15 = amq.p[a(var12, var13, var14)];
/*      */           
/* 2558 */           if (var15 != null && var15.cB == par2Material) {
/*      */             
/* 2560 */             double var16 = ((var13 + 1) - akx.e(h(var12, var13, var14)));
/*      */             
/* 2562 */             if (var7 >= var16) {
/*      */               
/* 2564 */               var10 = true;
/* 2565 */               var15.a(this, var12, var13, var14, par3Entity, var11);
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 2572 */     if (var11.b() > 0.0D) {
/*      */       
/* 2574 */       var11 = var11.a();
/* 2575 */       double var18 = 0.014D;
/* 2576 */       par3Entity.w += var11.c * var18;
/* 2577 */       par3Entity.x += var11.d * var18;
/* 2578 */       par3Entity.y += var11.e * var18;
/*      */     } 
/*      */     
/* 2581 */     return var10;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(aoe par1AxisAlignedBB, agi par2Material) {
/* 2590 */     int var3 = ke.c(par1AxisAlignedBB.a);
/* 2591 */     int var4 = ke.c(par1AxisAlignedBB.d + 1.0D);
/* 2592 */     int var5 = ke.c(par1AxisAlignedBB.b);
/* 2593 */     int var6 = ke.c(par1AxisAlignedBB.e + 1.0D);
/* 2594 */     int var7 = ke.c(par1AxisAlignedBB.c);
/* 2595 */     int var8 = ke.c(par1AxisAlignedBB.f + 1.0D);
/*      */     
/* 2597 */     for (int var9 = var3; var9 < var4; var9++) {
/*      */       
/* 2599 */       for (int var10 = var5; var10 < var6; var10++) {
/*      */         
/* 2601 */         for (int var11 = var7; var11 < var8; var11++) {
/*      */           
/* 2603 */           amq var12 = amq.p[a(var9, var10, var11)];
/*      */           
/* 2605 */           if (var12 != null && var12.cB == par2Material)
/*      */           {
/* 2607 */             return true;
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 2613 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean b(aoe par1AxisAlignedBB, agi par2Material) {
/* 2621 */     int var3 = ke.c(par1AxisAlignedBB.a);
/* 2622 */     int var4 = ke.c(par1AxisAlignedBB.d + 1.0D);
/* 2623 */     int var5 = ke.c(par1AxisAlignedBB.b);
/* 2624 */     int var6 = ke.c(par1AxisAlignedBB.e + 1.0D);
/* 2625 */     int var7 = ke.c(par1AxisAlignedBB.c);
/* 2626 */     int var8 = ke.c(par1AxisAlignedBB.f + 1.0D);
/*      */     
/* 2628 */     for (int var9 = var3; var9 < var4; var9++) {
/*      */       
/* 2630 */       for (int var10 = var5; var10 < var6; var10++) {
/*      */         
/* 2632 */         for (int var11 = var7; var11 < var8; var11++) {
/*      */           
/* 2634 */           amq var12 = amq.p[a(var9, var10, var11)];
/*      */           
/* 2636 */           if (var12 != null && var12.cB == par2Material) {
/*      */             
/* 2638 */             int var13 = h(var9, var10, var11);
/* 2639 */             double var14 = (var10 + 1);
/*      */             
/* 2641 */             if (var13 < 8)
/*      */             {
/* 2643 */               var14 = (var10 + 1) - var13 / 8.0D;
/*      */             }
/*      */             
/* 2646 */             if (var14 >= par1AxisAlignedBB.b)
/*      */             {
/* 2648 */               return true;
/*      */             }
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 2655 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public xx a(lq par1Entity, double par2, double par4, double par6, float par8, boolean par9) {
/* 2663 */     return a(par1Entity, par2, par4, par6, par8, false, par9);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public xx a(lq par1Entity, double par2, double par4, double par6, float par8, boolean par9, boolean par10) {
/* 2671 */     xx var11 = new xx(this, par1Entity, par2, par4, par6, par8);
/* 2672 */     var11.a = par9;
/* 2673 */     var11.b = par10;
/* 2674 */     var11.a();
/* 2675 */     var11.a(true);
/* 2676 */     return var11;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float a(aoj par1Vec3, aoe par2AxisAlignedBB) {
/* 2684 */     double var3 = 1.0D / ((par2AxisAlignedBB.d - par2AxisAlignedBB.a) * 2.0D + 1.0D);
/* 2685 */     double var5 = 1.0D / ((par2AxisAlignedBB.e - par2AxisAlignedBB.b) * 2.0D + 1.0D);
/* 2686 */     double var7 = 1.0D / ((par2AxisAlignedBB.f - par2AxisAlignedBB.c) * 2.0D + 1.0D);
/* 2687 */     int var9 = 0;
/* 2688 */     int var10 = 0;
/*      */     float var11;
/* 2690 */     for (var11 = 0.0F; var11 <= 1.0F; var11 = (float)(var11 + var3)) {
/*      */       float var12;
/* 2692 */       for (var12 = 0.0F; var12 <= 1.0F; var12 = (float)(var12 + var5)) {
/*      */         float var13;
/* 2694 */         for (var13 = 0.0F; var13 <= 1.0F; var13 = (float)(var13 + var7)) {
/*      */           
/* 2696 */           double var14 = par2AxisAlignedBB.a + (par2AxisAlignedBB.d - par2AxisAlignedBB.a) * var11;
/* 2697 */           double var16 = par2AxisAlignedBB.b + (par2AxisAlignedBB.e - par2AxisAlignedBB.b) * var12;
/* 2698 */           double var18 = par2AxisAlignedBB.c + (par2AxisAlignedBB.f - par2AxisAlignedBB.c) * var13;
/*      */           
/* 2700 */           if (a(S().a(var14, var16, var18), par1Vec3) == null)
/*      */           {
/* 2702 */             var9++;
/*      */           }
/*      */           
/* 2705 */           var10++;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 2710 */     return var9 / var10;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(qx par1EntityPlayer, int par2, int par3, int par4, int par5) {
/* 2719 */     if (par5 == 0)
/*      */     {
/* 2721 */       par3--;
/*      */     }
/*      */     
/* 2724 */     if (par5 == 1)
/*      */     {
/* 2726 */       par3++;
/*      */     }
/*      */     
/* 2729 */     if (par5 == 2)
/*      */     {
/* 2731 */       par4--;
/*      */     }
/*      */     
/* 2734 */     if (par5 == 3)
/*      */     {
/* 2736 */       par4++;
/*      */     }
/*      */     
/* 2739 */     if (par5 == 4)
/*      */     {
/* 2741 */       par2--;
/*      */     }
/*      */     
/* 2744 */     if (par5 == 5)
/*      */     {
/* 2746 */       par2++;
/*      */     }
/*      */     
/* 2749 */     if (a(par2, par3, par4) == amq.au.cm) {
/*      */       
/* 2751 */       a(par1EntityPlayer, 1004, par2, par3, par4, 0);
/* 2752 */       e(par2, par3, par4, 0);
/* 2753 */       return true;
/*      */     } 
/*      */ 
/*      */     
/* 2757 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public String v() {
/* 2768 */     return "All: " + this.e.size();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public String w() {
/* 2778 */     return this.w.d();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public any q(int par1, int par2, int par3) {
/* 2786 */     if (par2 >= 256)
/*      */     {
/* 2788 */       return null;
/*      */     }
/*      */ 
/*      */     
/* 2792 */     zz var4 = e(par1 >> 4, par3 >> 4);
/*      */     
/* 2794 */     if (var4 == null)
/*      */     {
/* 2796 */       return null;
/*      */     }
/*      */ 
/*      */     
/* 2800 */     any var5 = var4.e(par1 & 0xF, par2, par3 & 0xF);
/*      */     
/* 2802 */     if (var5 == null)
/*      */     {
/* 2804 */       for (int var6 = 0; var6 < this.a.size(); var6++) {
/*      */         
/* 2806 */         any var7 = this.a.get(var6);
/*      */         
/* 2808 */         if (!var7.r() && var7.l == par1 && var7.m == par2 && var7.n == par3) {
/*      */           
/* 2810 */           var5 = var7;
/*      */           
/*      */           break;
/*      */         } 
/*      */       } 
/*      */     }
/* 2816 */     return var5;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(int par1, int par2, int par3, any par4TileEntity) {
/* 2826 */     if (par4TileEntity == null || par4TileEntity.r()) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/* 2831 */     if (par4TileEntity.canUpdate()) {
/*      */       
/* 2833 */       List<any> dest = this.M ? this.a : this.g;
/* 2834 */       dest.add(par4TileEntity);
/*      */     } 
/*      */     
/* 2837 */     zz chunk = e(par1 >> 4, par3 >> 4);
/* 2838 */     if (chunk != null)
/*      */     {
/* 2840 */       chunk.a(par1 & 0xF, par2, par3 & 0xF, par4TileEntity);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void r(int par1, int par2, int par3) {
/* 2849 */     zz chunk = e(par1 >> 4, par3 >> 4);
/* 2850 */     if (chunk != null)
/*      */     {
/* 2852 */       chunk.f(par1 & 0xF, par2, par3 & 0xF);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(any par1TileEntity) {
/* 2861 */     this.b.add(par1TileEntity);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean s(int par1, int par2, int par3) {
/* 2869 */     amq var4 = amq.p[a(par1, par2, par3)];
/* 2870 */     return (var4 == null) ? false : var4.c();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean t(int par1, int par2, int par3) {
/* 2878 */     amq block = amq.p[a(par1, par2, par3)];
/* 2879 */     return (block != null && block.isBlockNormalCube(this, par1, par2, par3));
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean u(int par1, int par2, int par3) {
/* 2884 */     int var4 = a(par1, par2, par3);
/*      */     
/* 2886 */     if (var4 != 0 && amq.p[var4] != null) {
/*      */       
/* 2888 */       aoe var5 = amq.p[var4].e(this, par1, par2, par3);
/* 2889 */       return (var5 != null && var5.b() >= 1.0D);
/*      */     } 
/*      */ 
/*      */     
/* 2893 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean v(int par1, int par2, int par3) {
/* 2902 */     return isBlockSolidOnSide(par1, par2, par3, ForgeDirection.UP);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean b(int par1, int par2, int par3, boolean par4) {
/* 2911 */     if (par1 >= -30000000 && par3 >= -30000000 && par1 < 30000000 && par3 < 30000000) {
/*      */       
/* 2913 */       zz var5 = this.w.d(par1 >> 4, par3 >> 4);
/*      */       
/* 2915 */       if (var5 != null && !var5.g()) {
/*      */         
/* 2917 */         amq var6 = amq.p[a(par1, par2, par3)];
/* 2918 */         return (var6 == null) ? false : t(par1, par2, par3);
/*      */       } 
/*      */ 
/*      */       
/* 2922 */       return par4;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 2927 */     return par4;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void x() {
/* 2936 */     int var1 = a(1.0F);
/*      */     
/* 2938 */     if (var1 != this.j)
/*      */     {
/* 2940 */       this.j = var1;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(boolean par1, boolean par2) {
/* 2949 */     this.u.setAllowedSpawnTypes(par1, par2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b() {
/* 2957 */     n();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void a() {
/* 2965 */     this.u.calculateInitialWeather();
/*      */   }
/*      */ 
/*      */   
/*      */   public void calculateInitialWeatherBody() {
/* 2970 */     if (this.y.p()) {
/*      */       
/* 2972 */       this.n = 1.0F;
/*      */       
/* 2974 */       if (this.y.n())
/*      */       {
/* 2976 */         this.p = 1.0F;
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void n() {
/* 2986 */     this.u.updateWeather();
/*      */   }
/*      */ 
/*      */   
/*      */   public void updateWeatherBody() {
/* 2991 */     if (!this.u.f) {
/*      */       
/* 2993 */       int var1 = this.y.o();
/*      */       
/* 2995 */       if (var1 <= 0) {
/*      */         
/* 2997 */         if (this.y.n())
/*      */         {
/* 2999 */           this.y.f(this.t.nextInt(12000) + 3600);
/*      */         }
/*      */         else
/*      */         {
/* 3003 */           this.y.f(this.t.nextInt(168000) + 12000);
/*      */         }
/*      */       
/*      */       } else {
/*      */         
/* 3008 */         var1--;
/* 3009 */         this.y.f(var1);
/*      */         
/* 3011 */         if (var1 <= 0)
/*      */         {
/* 3013 */           this.y.a(!this.y.n());
/*      */         }
/*      */       } 
/*      */       
/* 3017 */       int var2 = this.y.q();
/*      */       
/* 3019 */       if (var2 <= 0) {
/*      */         
/* 3021 */         if (this.y.p())
/*      */         {
/* 3023 */           this.y.g(this.t.nextInt(12000) + 12000);
/*      */         }
/*      */         else
/*      */         {
/* 3027 */           this.y.g(this.t.nextInt(168000) + 12000);
/*      */         }
/*      */       
/*      */       } else {
/*      */         
/* 3032 */         var2--;
/* 3033 */         this.y.g(var2);
/*      */         
/* 3035 */         if (var2 <= 0)
/*      */         {
/* 3037 */           this.y.b(!this.y.p());
/*      */         }
/*      */       } 
/*      */       
/* 3041 */       this.m = this.n;
/*      */       
/* 3043 */       if (this.y.p()) {
/*      */         
/* 3045 */         this.n = (float)(this.n + 0.01D);
/*      */       }
/*      */       else {
/*      */         
/* 3049 */         this.n = (float)(this.n - 0.01D);
/*      */       } 
/*      */       
/* 3052 */       if (this.n < 0.0F)
/*      */       {
/* 3054 */         this.n = 0.0F;
/*      */       }
/*      */       
/* 3057 */       if (this.n > 1.0F)
/*      */       {
/* 3059 */         this.n = 1.0F;
/*      */       }
/*      */       
/* 3062 */       this.o = this.p;
/*      */       
/* 3064 */       if (this.y.n()) {
/*      */         
/* 3066 */         this.p = (float)(this.p + 0.01D);
/*      */       }
/*      */       else {
/*      */         
/* 3070 */         this.p = (float)(this.p - 0.01D);
/*      */       } 
/*      */       
/* 3073 */       if (this.p < 0.0F)
/*      */       {
/* 3075 */         this.p = 0.0F;
/*      */       }
/*      */       
/* 3078 */       if (this.p > 1.0F)
/*      */       {
/* 3080 */         this.p = 1.0F;
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void y() {
/* 3087 */     this.u.toggleRain();
/*      */   }
/*      */ 
/*      */   
/*      */   protected void z() {
/* 3092 */     this.G.clear();
/* 3093 */     this.G.addAll((Collection)getPersistentChunks().keySet());
/*      */     
/* 3095 */     this.D.a("buildList");
/*      */ 
/*      */     
/*      */     int var1;
/*      */ 
/*      */     
/* 3101 */     for (var1 = 0; var1 < this.h.size(); var1++) {
/*      */       
/* 3103 */       qx var2 = this.h.get(var1);
/* 3104 */       int var3 = ke.c(var2.t / 16.0D);
/* 3105 */       int var4 = ke.c(var2.v / 16.0D);
/* 3106 */       byte var5 = 7;
/*      */       
/* 3108 */       for (int var6 = -var5; var6 <= var5; var6++) {
/*      */         
/* 3110 */         for (int var7 = -var5; var7 <= var5; var7++)
/*      */         {
/* 3112 */           this.G.add(new xv(var6 + var3, var7 + var4));
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/* 3117 */     this.D.b();
/*      */     
/* 3119 */     if (this.N > 0)
/*      */     {
/* 3121 */       this.N--;
/*      */     }
/*      */     
/* 3124 */     this.D.a("playerCheckLight");
/*      */     
/* 3126 */     if (!this.h.isEmpty()) {
/*      */       
/* 3128 */       var1 = this.t.nextInt(this.h.size());
/* 3129 */       qx var2 = this.h.get(var1);
/* 3130 */       int var3 = ke.c(var2.t) + this.t.nextInt(11) - 5;
/* 3131 */       int var4 = ke.c(var2.u) + this.t.nextInt(11) - 5;
/* 3132 */       int var8 = ke.c(var2.v) + this.t.nextInt(11) - 5;
/* 3133 */       z(var3, var4, var8);
/*      */     } 
/*      */     
/* 3136 */     this.D.b();
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(int par1, int par2, zz par3Chunk) {
/* 3141 */     this.D.c("moodSound");
/*      */     
/* 3143 */     if (this.N == 0 && !this.I) {
/*      */       
/* 3145 */       this.k = this.k * 3 + 1013904223;
/* 3146 */       int var4 = this.k >> 2;
/* 3147 */       int var5 = var4 & 0xF;
/* 3148 */       int var6 = var4 >> 8 & 0xF;
/* 3149 */       int var7 = var4 >> 16 & 0x7F;
/* 3150 */       int var8 = par3Chunk.a(var5, var7, var6);
/* 3151 */       var5 += par1;
/* 3152 */       var6 += par2;
/*      */       
/* 3154 */       if (var8 == 0 && l(var5, var7, var6) <= this.t.nextInt(8) && b(yo.a, var5, var7, var6) <= 0) {
/*      */         
/* 3156 */         qx var9 = a(var5 + 0.5D, var7 + 0.5D, var6 + 0.5D, 8.0D);
/*      */         
/* 3158 */         if (var9 != null && var9.e(var5 + 0.5D, var7 + 0.5D, var6 + 0.5D) > 4.0D) {
/*      */           
/* 3160 */           a(var5 + 0.5D, var7 + 0.5D, var6 + 0.5D, "ambient.cave.cave", 0.7F, 0.8F + this.t.nextFloat() * 0.2F);
/* 3161 */           this.N = this.t.nextInt(12000) + 6000;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 3166 */     this.D.c("checkLight");
/* 3167 */     par3Chunk.o();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void g() {
/* 3176 */     z();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean w(int par1, int par2, int par3) {
/* 3184 */     return c(par1, par2, par3, false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean x(int par1, int par2, int par3) {
/* 3192 */     return c(par1, par2, par3, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean c(int par1, int par2, int par3, boolean par4) {
/* 3201 */     return this.u.canBlockFreeze(par1, par2, par3, par4);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean canBlockFreezeBody(int par1, int par2, int par3, boolean par4) {
/* 3206 */     yy var5 = a(par1, par3);
/* 3207 */     float var6 = var5.j();
/*      */     
/* 3209 */     if (var6 > 0.15F)
/*      */     {
/* 3211 */       return false;
/*      */     }
/*      */ 
/*      */     
/* 3215 */     if (par2 >= 0 && par2 < 256 && b(yo.b, par1, par2, par3) < 10) {
/*      */       
/* 3217 */       int var7 = a(par1, par2, par3);
/*      */       
/* 3219 */       if ((var7 == amq.E.cm || var7 == amq.D.cm) && h(par1, par2, par3) == 0) {
/*      */         
/* 3221 */         if (!par4)
/*      */         {
/* 3223 */           return true;
/*      */         }
/*      */         
/* 3226 */         boolean var8 = true;
/*      */         
/* 3228 */         if (var8 && g(par1 - 1, par2, par3) != agi.h)
/*      */         {
/* 3230 */           var8 = false;
/*      */         }
/*      */         
/* 3233 */         if (var8 && g(par1 + 1, par2, par3) != agi.h)
/*      */         {
/* 3235 */           var8 = false;
/*      */         }
/*      */         
/* 3238 */         if (var8 && g(par1, par2, par3 - 1) != agi.h)
/*      */         {
/* 3240 */           var8 = false;
/*      */         }
/*      */         
/* 3243 */         if (var8 && g(par1, par2, par3 + 1) != agi.h)
/*      */         {
/* 3245 */           var8 = false;
/*      */         }
/*      */         
/* 3248 */         if (!var8)
/*      */         {
/* 3250 */           return true;
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/* 3255 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean y(int par1, int par2, int par3) {
/* 3264 */     return this.u.canSnowAt(par1, par2, par3);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean canSnowAtBody(int par1, int par2, int par3) {
/* 3269 */     yy var4 = a(par1, par3);
/* 3270 */     float var5 = var4.j();
/*      */     
/* 3272 */     if (var5 > 0.15F)
/*      */     {
/* 3274 */       return false;
/*      */     }
/*      */ 
/*      */     
/* 3278 */     if (par2 >= 0 && par2 < 256 && b(yo.b, par1, par2, par3) < 10) {
/*      */       
/* 3280 */       int var6 = a(par1, par2 - 1, par3);
/* 3281 */       int var7 = a(par1, par2, par3);
/*      */       
/* 3283 */       if (var7 == 0 && amq.aV.b(this, par1, par2, par3) && var6 != 0 && var6 != amq.aW.cm && (amq.p[var6]).cB.c())
/*      */       {
/* 3285 */         return true;
/*      */       }
/*      */     } 
/*      */     
/* 3289 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void z(int par1, int par2, int par3) {
/* 3295 */     if (!this.u.f)
/*      */     {
/* 3297 */       c(yo.a, par1, par2, par3);
/*      */     }
/*      */     
/* 3300 */     c(yo.b, par1, par2, par3);
/*      */   }
/*      */ 
/*      */   
/*      */   private int b(int par1, int par2, int par3, int par4, int par5, int par6) {
/* 3305 */     int var7 = 0;
/*      */     
/* 3307 */     if (k(par2, par3, par4)) {
/*      */       
/* 3309 */       var7 = 15;
/*      */     }
/*      */     else {
/*      */       
/* 3313 */       if (par6 == 0)
/*      */       {
/* 3315 */         par6 = 1;
/*      */       }
/*      */       
/* 3318 */       int var8 = b(yo.a, par2 - 1, par3, par4) - par6;
/* 3319 */       int var9 = b(yo.a, par2 + 1, par3, par4) - par6;
/* 3320 */       int var10 = b(yo.a, par2, par3 - 1, par4) - par6;
/* 3321 */       int var11 = b(yo.a, par2, par3 + 1, par4) - par6;
/* 3322 */       int var12 = b(yo.a, par2, par3, par4 - 1) - par6;
/* 3323 */       int var13 = b(yo.a, par2, par3, par4 + 1) - par6;
/*      */       
/* 3325 */       if (var8 > var7)
/*      */       {
/* 3327 */         var7 = var8;
/*      */       }
/*      */       
/* 3330 */       if (var9 > var7)
/*      */       {
/* 3332 */         var7 = var9;
/*      */       }
/*      */       
/* 3335 */       if (var10 > var7)
/*      */       {
/* 3337 */         var7 = var10;
/*      */       }
/*      */       
/* 3340 */       if (var11 > var7)
/*      */       {
/* 3342 */         var7 = var11;
/*      */       }
/*      */       
/* 3345 */       if (var12 > var7)
/*      */       {
/* 3347 */         var7 = var12;
/*      */       }
/*      */       
/* 3350 */       if (var13 > var7)
/*      */       {
/* 3352 */         var7 = var13;
/*      */       }
/*      */     } 
/*      */     
/* 3356 */     return var7;
/*      */   }
/*      */ 
/*      */   
/*      */   private int g(int par1, int par2, int par3, int par4, int par5, int par6) {
/* 3361 */     int var7 = (par5 == 0 || amq.p[par5] == null) ? 0 : amq.p[par5].getLightValue(this, par2, par3, par4);
/* 3362 */     int var8 = b(yo.b, par2 - 1, par3, par4) - par6;
/* 3363 */     int var9 = b(yo.b, par2 + 1, par3, par4) - par6;
/* 3364 */     int var10 = b(yo.b, par2, par3 - 1, par4) - par6;
/* 3365 */     int var11 = b(yo.b, par2, par3 + 1, par4) - par6;
/* 3366 */     int var12 = b(yo.b, par2, par3, par4 - 1) - par6;
/* 3367 */     int var13 = b(yo.b, par2, par3, par4 + 1) - par6;
/*      */     
/* 3369 */     if (var8 > var7)
/*      */     {
/* 3371 */       var7 = var8;
/*      */     }
/*      */     
/* 3374 */     if (var9 > var7)
/*      */     {
/* 3376 */       var7 = var9;
/*      */     }
/*      */     
/* 3379 */     if (var10 > var7)
/*      */     {
/* 3381 */       var7 = var10;
/*      */     }
/*      */     
/* 3384 */     if (var11 > var7)
/*      */     {
/* 3386 */       var7 = var11;
/*      */     }
/*      */     
/* 3389 */     if (var12 > var7)
/*      */     {
/* 3391 */       var7 = var12;
/*      */     }
/*      */     
/* 3394 */     if (var13 > var7)
/*      */     {
/* 3396 */       var7 = var13;
/*      */     }
/*      */     
/* 3399 */     return var7;
/*      */   }
/*      */ 
/*      */   
/*      */   public void c(yo par1EnumSkyBlock, int par2, int par3, int par4) {
/* 3404 */     if (a(par2, par3, par4, 17)) {
/*      */       
/* 3406 */       int var24, var5 = 0;
/* 3407 */       int var6 = 0;
/* 3408 */       this.D.a("getBrightness");
/* 3409 */       int var7 = b(par1EnumSkyBlock, par2, par3, par4);
/* 3410 */       boolean var8 = false;
/* 3411 */       int var9 = a(par2, par3, par4);
/* 3412 */       int var10 = b(par2, par3, par4);
/*      */       
/* 3414 */       if (var10 == 0)
/*      */       {
/* 3416 */         var10 = 1;
/*      */       }
/*      */       
/* 3419 */       boolean var11 = false;
/*      */ 
/*      */       
/* 3422 */       if (par1EnumSkyBlock == yo.a) {
/*      */         
/* 3424 */         var24 = b(var7, par2, par3, par4, var9, var10);
/*      */       }
/*      */       else {
/*      */         
/* 3428 */         var24 = g(var7, par2, par3, par4, var9, var10);
/*      */       } 
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
/* 3440 */       if (var24 > var7) {
/*      */         
/* 3442 */         this.H[var6++] = 133152;
/*      */       }
/* 3444 */       else if (var24 < var7) {
/*      */         
/* 3446 */         if (par1EnumSkyBlock != yo.b);
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 3451 */         this.H[var6++] = 133152 + (var7 << 18);
/*      */         
/* 3453 */         while (var5 < var6) {
/*      */           
/* 3455 */           var9 = this.H[var5++];
/* 3456 */           var10 = (var9 & 0x3F) - 32 + par2;
/* 3457 */           var24 = (var9 >> 6 & 0x3F) - 32 + par3;
/* 3458 */           int var12 = (var9 >> 12 & 0x3F) - 32 + par4;
/* 3459 */           int var13 = var9 >> 18 & 0xF;
/* 3460 */           int var14 = b(par1EnumSkyBlock, var10, var24, var12);
/*      */           
/* 3462 */           if (var14 == var13) {
/*      */             
/* 3464 */             b(par1EnumSkyBlock, var10, var24, var12, 0);
/*      */             
/* 3466 */             if (var13 > 0) {
/*      */               
/* 3468 */               int var15 = var10 - par2;
/* 3469 */               int var16 = var24 - par3;
/* 3470 */               int var17 = var12 - par4;
/*      */               
/* 3472 */               if (var15 < 0)
/*      */               {
/* 3474 */                 var15 = -var15;
/*      */               }
/*      */               
/* 3477 */               if (var16 < 0)
/*      */               {
/* 3479 */                 var16 = -var16;
/*      */               }
/*      */               
/* 3482 */               if (var17 < 0)
/*      */               {
/* 3484 */                 var17 = -var17;
/*      */               }
/*      */               
/* 3487 */               if (var15 + var16 + var17 < 17)
/*      */               {
/* 3489 */                 for (int var18 = 0; var18 < 6; var18++) {
/*      */                   
/* 3491 */                   int var19 = var18 % 2 * 2 - 1;
/* 3492 */                   int var20 = var10 + var18 / 2 % 3 / 2 * var19;
/* 3493 */                   int var21 = var24 + (var18 / 2 + 1) % 3 / 2 * var19;
/* 3494 */                   int var22 = var12 + (var18 / 2 + 2) % 3 / 2 * var19;
/* 3495 */                   var14 = b(par1EnumSkyBlock, var20, var21, var22);
/* 3496 */                   int var23 = b(var20, var21, var22);
/*      */                   
/* 3498 */                   if (var23 == 0)
/*      */                   {
/* 3500 */                     var23 = 1;
/*      */                   }
/*      */                   
/* 3503 */                   if (var14 == var13 - var23 && var6 < this.H.length)
/*      */                   {
/* 3505 */                     this.H[var6++] = var20 - par2 + 32 + (var21 - par3 + 32 << 6) + (var22 - par4 + 32 << 12) + (var13 - var23 << 18);
/*      */                   }
/*      */                 } 
/*      */               }
/*      */             } 
/*      */           } 
/*      */         } 
/*      */         
/* 3513 */         var5 = 0;
/*      */       } 
/*      */       
/* 3516 */       this.D.b();
/* 3517 */       this.D.a("checkedPosition < toCheckCount");
/*      */       
/* 3519 */       while (var5 < var6) {
/*      */         int var16;
/* 3521 */         var9 = this.H[var5++];
/* 3522 */         var10 = (var9 & 0x3F) - 32 + par2;
/* 3523 */         var24 = (var9 >> 6 & 0x3F) - 32 + par3;
/* 3524 */         int var12 = (var9 >> 12 & 0x3F) - 32 + par4;
/* 3525 */         int var13 = b(par1EnumSkyBlock, var10, var24, var12);
/* 3526 */         int var14 = a(var10, var24, var12);
/* 3527 */         int var15 = b(var10, var24, var12);
/*      */         
/* 3529 */         if (var15 == 0)
/*      */         {
/* 3531 */           var15 = 1;
/*      */         }
/*      */         
/* 3534 */         boolean var25 = false;
/*      */         
/* 3536 */         if (par1EnumSkyBlock == yo.a) {
/*      */           
/* 3538 */           var16 = b(var13, var10, var24, var12, var14, var15);
/*      */         }
/*      */         else {
/*      */           
/* 3542 */           var16 = g(var13, var10, var24, var12, var14, var15);
/*      */         } 
/*      */         
/* 3545 */         if (var16 != var13) {
/*      */           
/* 3547 */           b(par1EnumSkyBlock, var10, var24, var12, var16);
/*      */           
/* 3549 */           if (var16 > var13) {
/*      */             
/* 3551 */             int var17 = var10 - par2;
/* 3552 */             int var18 = var24 - par3;
/* 3553 */             int var19 = var12 - par4;
/*      */             
/* 3555 */             if (var17 < 0)
/*      */             {
/* 3557 */               var17 = -var17;
/*      */             }
/*      */             
/* 3560 */             if (var18 < 0)
/*      */             {
/* 3562 */               var18 = -var18;
/*      */             }
/*      */             
/* 3565 */             if (var19 < 0)
/*      */             {
/* 3567 */               var19 = -var19;
/*      */             }
/*      */             
/* 3570 */             if (var17 + var18 + var19 < 17 && var6 < this.H.length - 6) {
/*      */               
/* 3572 */               if (b(par1EnumSkyBlock, var10 - 1, var24, var12) < var16)
/*      */               {
/* 3574 */                 this.H[var6++] = var10 - 1 - par2 + 32 + (var24 - par3 + 32 << 6) + (var12 - par4 + 32 << 12);
/*      */               }
/*      */               
/* 3577 */               if (b(par1EnumSkyBlock, var10 + 1, var24, var12) < var16)
/*      */               {
/* 3579 */                 this.H[var6++] = var10 + 1 - par2 + 32 + (var24 - par3 + 32 << 6) + (var12 - par4 + 32 << 12);
/*      */               }
/*      */               
/* 3582 */               if (b(par1EnumSkyBlock, var10, var24 - 1, var12) < var16)
/*      */               {
/* 3584 */                 this.H[var6++] = var10 - par2 + 32 + (var24 - 1 - par3 + 32 << 6) + (var12 - par4 + 32 << 12);
/*      */               }
/*      */               
/* 3587 */               if (b(par1EnumSkyBlock, var10, var24 + 1, var12) < var16)
/*      */               {
/* 3589 */                 this.H[var6++] = var10 - par2 + 32 + (var24 + 1 - par3 + 32 << 6) + (var12 - par4 + 32 << 12);
/*      */               }
/*      */               
/* 3592 */               if (b(par1EnumSkyBlock, var10, var24, var12 - 1) < var16)
/*      */               {
/* 3594 */                 this.H[var6++] = var10 - par2 + 32 + (var24 - par3 + 32 << 6) + (var12 - 1 - par4 + 32 << 12);
/*      */               }
/*      */               
/* 3597 */               if (b(par1EnumSkyBlock, var10, var24, var12 + 1) < var16)
/*      */               {
/* 3599 */                 this.H[var6++] = var10 - par2 + 32 + (var24 - par3 + 32 << 6) + (var12 + 1 - par4 + 32 << 12);
/*      */               }
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/* 3606 */       this.D.b();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(boolean par1) {
/* 3615 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public List a(zz par1Chunk, boolean par2) {
/* 3620 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public List b(lq par1Entity, aoe par2AxisAlignedBB) {
/* 3628 */     this.O.clear();
/* 3629 */     int var3 = ke.c((par2AxisAlignedBB.a - MAX_ENTITY_RADIUS) / 16.0D);
/* 3630 */     int var4 = ke.c((par2AxisAlignedBB.d + MAX_ENTITY_RADIUS) / 16.0D);
/* 3631 */     int var5 = ke.c((par2AxisAlignedBB.c - MAX_ENTITY_RADIUS) / 16.0D);
/* 3632 */     int var6 = ke.c((par2AxisAlignedBB.f + MAX_ENTITY_RADIUS) / 16.0D);
/*      */     
/* 3634 */     for (int var7 = var3; var7 <= var4; var7++) {
/*      */       
/* 3636 */       for (int var8 = var5; var8 <= var6; var8++) {
/*      */         
/* 3638 */         if (c(var7, var8))
/*      */         {
/* 3640 */           e(var7, var8).a(par1Entity, par2AxisAlignedBB, this.O);
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/* 3645 */     return this.O;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public List a(Class par1Class, aoe par2AxisAlignedBB) {
/* 3653 */     return a(par1Class, par2AxisAlignedBB, (ly)null);
/*      */   }
/*      */ 
/*      */   
/*      */   public List a(Class par1Class, aoe par2AxisAlignedBB, ly par3IEntitySelector) {
/* 3658 */     int var4 = ke.c((par2AxisAlignedBB.a - MAX_ENTITY_RADIUS) / 16.0D);
/* 3659 */     int var5 = ke.c((par2AxisAlignedBB.d + MAX_ENTITY_RADIUS) / 16.0D);
/* 3660 */     int var6 = ke.c((par2AxisAlignedBB.c - MAX_ENTITY_RADIUS) / 16.0D);
/* 3661 */     int var7 = ke.c((par2AxisAlignedBB.f + MAX_ENTITY_RADIUS) / 16.0D);
/* 3662 */     ArrayList var8 = new ArrayList();
/*      */     
/* 3664 */     for (int var9 = var4; var9 <= var5; var9++) {
/*      */       
/* 3666 */       for (int var10 = var6; var10 <= var7; var10++) {
/*      */         
/* 3668 */         if (c(var9, var10))
/*      */         {
/* 3670 */           e(var9, var10).a(par1Class, par2AxisAlignedBB, var8, par3IEntitySelector);
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/* 3675 */     return var8;
/*      */   }
/*      */ 
/*      */   
/*      */   public lq a(Class par1Class, aoe par2AxisAlignedBB, lq par3Entity) {
/* 3680 */     List<lq> var4 = a(par1Class, par2AxisAlignedBB);
/* 3681 */     lq var5 = null;
/* 3682 */     double var6 = Double.MAX_VALUE;
/*      */     
/* 3684 */     for (int var8 = 0; var8 < var4.size(); var8++) {
/*      */       
/* 3686 */       lq var9 = var4.get(var8);
/*      */       
/* 3688 */       if (var9 != par3Entity) {
/*      */         
/* 3690 */         double var10 = par3Entity.e(var9);
/*      */         
/* 3692 */         if (var10 <= var6) {
/*      */           
/* 3694 */           var5 = var9;
/* 3695 */           var6 = var10;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 3700 */     return var5;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract lq a(int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public List A() {
/* 3715 */     return this.e;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(int par1, int par2, int par3, any par4TileEntity) {
/* 3723 */     if (f(par1, par2, par3))
/*      */     {
/* 3725 */       d(par1, par3).e();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int a(Class par1Class) {
/* 3734 */     int var2 = 0;
/*      */     
/* 3736 */     for (int var3 = 0; var3 < this.e.size(); var3++) {
/*      */       
/* 3738 */       lq var4 = this.e.get(var3);
/*      */       
/* 3740 */       if (par1Class.isAssignableFrom(var4.getClass()))
/*      */       {
/* 3742 */         var2++;
/*      */       }
/*      */     } 
/*      */     
/* 3746 */     return var2;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(List<lq> par1List) {
/* 3754 */     for (int var2 = 0; var2 < par1List.size(); var2++) {
/*      */       
/* 3756 */       lq entity = par1List.get(var2);
/* 3757 */       if (!MinecraftForge.EVENT_BUS.post((Event)new EntityJoinWorldEvent(entity, this))) {
/*      */         
/* 3759 */         this.e.add(entity);
/* 3760 */         a(entity);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(List par1List) {
/* 3770 */     this.f.addAll(par1List);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(int par1, int par2, int par3, int par4, boolean par5, int par6, lq par7Entity) {
/* 3778 */     int var8 = a(par2, par3, par4);
/* 3779 */     amq var9 = amq.p[var8];
/* 3780 */     amq var10 = amq.p[par1];
/* 3781 */     aoe var11 = var10.e(this, par2, par3, par4);
/*      */     
/* 3783 */     if (par5)
/*      */     {
/* 3785 */       var11 = null;
/*      */     }
/*      */     
/* 3788 */     if (var11 != null && !a(var11, par7Entity))
/*      */     {
/* 3790 */       return false;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 3795 */     if (var9 != null && (var9 == mod_SCP.SCP006Still || var9 == mod_SCP.SCP006Flowing || var9 == mod_SCP.SCP354Flowing || var9 == mod_SCP.SCP354Still || var9 == amq.D || var9 == amq.E || var9 == amq.F || var9 == amq.G || var9 == amq.au || var9.cB.j()))
/*      */     {
/*      */ 
/*      */       
/* 3799 */       var9 = null;
/*      */     }
/*      */     
/* 3802 */     if (var9 != null && var9.isBlockReplaceable(this, par2, par3, par4))
/*      */     {
/* 3804 */       var9 = null;
/*      */     }
/*      */     
/* 3807 */     return (var9 != null && var9.cB == agi.q && var10 == amq.ck) ? true : ((par1 > 0 && var9 == null && var10.b_(this, par2, par3, par4, par6)));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public ahl a(lq par1Entity, lq par2Entity, float par3, boolean par4, boolean par5, boolean par6, boolean par7) {
/* 3813 */     this.D.a("pathfind");
/* 3814 */     int var8 = ke.c(par1Entity.t);
/* 3815 */     int var9 = ke.c(par1Entity.u + 1.0D);
/* 3816 */     int var10 = ke.c(par1Entity.v);
/* 3817 */     int var11 = (int)(par3 + 16.0F);
/* 3818 */     int var12 = var8 - var11;
/* 3819 */     int var13 = var9 - var11;
/* 3820 */     int var14 = var10 - var11;
/* 3821 */     int var15 = var8 + var11;
/* 3822 */     int var16 = var9 + var11;
/* 3823 */     int var17 = var10 + var11;
/* 3824 */     ys var18 = new ys(this, var12, var13, var14, var15, var16, var17);
/* 3825 */     ahl var19 = (new ahm((ym)var18, par4, par5, par6, par7)).a(par1Entity, par2Entity, par3);
/* 3826 */     this.D.b();
/* 3827 */     return var19;
/*      */   }
/*      */ 
/*      */   
/*      */   public ahl a(lq par1Entity, int par2, int par3, int par4, float par5, boolean par6, boolean par7, boolean par8, boolean par9) {
/* 3832 */     this.D.a("pathfind");
/* 3833 */     int var10 = ke.c(par1Entity.t);
/* 3834 */     int var11 = ke.c(par1Entity.u);
/* 3835 */     int var12 = ke.c(par1Entity.v);
/* 3836 */     int var13 = (int)(par5 + 8.0F);
/* 3837 */     int var14 = var10 - var13;
/* 3838 */     int var15 = var11 - var13;
/* 3839 */     int var16 = var12 - var13;
/* 3840 */     int var17 = var10 + var13;
/* 3841 */     int var18 = var11 + var13;
/* 3842 */     int var19 = var12 + var13;
/* 3843 */     ys var20 = new ys(this, var14, var15, var16, var17, var18, var19);
/* 3844 */     ahl var21 = (new ahm((ym)var20, par6, par7, par8, par9)).a(par1Entity, par2, par3, par4, par5);
/* 3845 */     this.D.b();
/* 3846 */     return var21;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean k(int par1, int par2, int par3, int par4) {
/* 3854 */     int var5 = a(par1, par2, par3);
/* 3855 */     return (var5 == 0) ? false : amq.p[var5].c(this, par1, par2, par3, par4);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean A(int par1, int par2, int par3) {
/* 3863 */     return k(par1, par2 - 1, par3, 0) ? true : (k(par1, par2 + 1, par3, 1) ? true : (k(par1, par2, par3 - 1, 2) ? true : (k(par1, par2, par3 + 1, 3) ? true : (k(par1 - 1, par2, par3, 4) ? true : k(par1 + 1, par2, par3, 5)))));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean l(int par1, int par2, int par3, int par4) {
/* 3872 */     if (t(par1, par2, par3))
/*      */     {
/* 3874 */       return A(par1, par2, par3);
/*      */     }
/*      */ 
/*      */     
/* 3878 */     int var5 = a(par1, par2, par3);
/* 3879 */     return (var5 == 0) ? false : amq.p[var5].b(this, par1, par2, par3, par4);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean B(int par1, int par2, int par3) {
/* 3889 */     return l(par1, par2 - 1, par3, 0) ? true : (l(par1, par2 + 1, par3, 1) ? true : (l(par1, par2, par3 - 1, 2) ? true : (l(par1, par2, par3 + 1, 3) ? true : (l(par1 - 1, par2, par3, 4) ? true : l(par1 + 1, par2, par3, 5)))));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public qx a(lq par1Entity, double par2) {
/* 3898 */     return a(par1Entity.t, par1Entity.u, par1Entity.v, par2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public qx a(double par1, double par3, double par5, double par7) {
/* 3907 */     double var9 = -1.0D;
/* 3908 */     qx var11 = null;
/*      */     
/* 3910 */     for (int var12 = 0; var12 < this.h.size(); var12++) {
/*      */       
/* 3912 */       qx var13 = this.h.get(var12);
/* 3913 */       double var14 = var13.e(par1, par3, par5);
/*      */       
/* 3915 */       if ((par7 < 0.0D || var14 < par7 * par7) && (var9 == -1.0D || var14 < var9)) {
/*      */         
/* 3917 */         var9 = var14;
/* 3918 */         var11 = var13;
/*      */       } 
/*      */     } 
/*      */     
/* 3922 */     return var11;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public qx b(lq par1Entity, double par2) {
/* 3930 */     return b(par1Entity.t, par1Entity.u, par1Entity.v, par2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public qx b(double par1, double par3, double par5, double par7) {
/* 3938 */     double var9 = -1.0D;
/* 3939 */     qx var11 = null;
/*      */     
/* 3941 */     for (int var12 = 0; var12 < this.h.size(); var12++) {
/*      */       
/* 3943 */       qx var13 = this.h.get(var12);
/*      */       
/* 3945 */       if (!var13.cd.a && var13.S()) {
/*      */         
/* 3947 */         double var14 = var13.e(par1, par3, par5);
/* 3948 */         double var16 = par7;
/*      */         
/* 3950 */         if (var13.ah())
/*      */         {
/* 3952 */           var16 = par7 * 0.800000011920929D;
/*      */         }
/*      */         
/* 3955 */         if (var13.aj()) {
/*      */           
/* 3957 */           float var18 = var13.bR();
/*      */           
/* 3959 */           if (var18 < 0.1F)
/*      */           {
/* 3961 */             var18 = 0.1F;
/*      */           }
/*      */           
/* 3964 */           var16 *= (0.7F * var18);
/*      */         } 
/*      */         
/* 3967 */         if ((par7 < 0.0D || var14 < var16 * var16) && (var9 == -1.0D || var14 < var9)) {
/*      */           
/* 3969 */           var9 = var14;
/* 3970 */           var11 = var13;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 3975 */     return var11;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public qx a(String par1Str) {
/* 3983 */     for (int var2 = 0; var2 < this.h.size(); var2++) {
/*      */       
/* 3985 */       if (par1Str.equals(((qx)this.h.get(var2)).bR))
/*      */       {
/* 3987 */         return this.h.get(var2);
/*      */       }
/*      */     } 
/*      */     
/* 3991 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public void C() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void D() throws yh {
/* 4006 */     this.x.c();
/*      */   }
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public void a(long par1) {
/* 4012 */     this.y.b(par1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long E() {
/* 4020 */     return this.u.getSeed();
/*      */   }
/*      */ 
/*      */   
/*      */   public long F() {
/* 4025 */     return this.y.f();
/*      */   }
/*      */ 
/*      */   
/*      */   public long G() {
/* 4030 */     return this.u.getWorldTime();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(long par1) {
/* 4038 */     this.u.setWorldTime(par1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public s H() {
/* 4046 */     return this.u.getSpawnPoint();
/*      */   }
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public void C(int par1, int par2, int par3) {
/* 4052 */     this.u.setSpawnPoint(par1, par2, par3);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public void h(lq par1Entity) {
/* 4062 */     int var2 = ke.c(par1Entity.t / 16.0D);
/* 4063 */     int var3 = ke.c(par1Entity.v / 16.0D);
/* 4064 */     byte var4 = 2;
/*      */     
/* 4066 */     for (int var5 = var2 - var4; var5 <= var2 + var4; var5++) {
/*      */       
/* 4068 */       for (int var6 = var3 - var4; var6 <= var3 + var4; var6++)
/*      */       {
/* 4070 */         e(var5, var6);
/*      */       }
/*      */     } 
/*      */     
/* 4074 */     if (!this.e.contains(par1Entity))
/*      */     {
/* 4076 */       if (!MinecraftForge.EVENT_BUS.post((Event)new EntityJoinWorldEvent(par1Entity, this)))
/*      */       {
/* 4078 */         this.e.add(par1Entity);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(qx par1EntityPlayer, int par2, int par3, int par4) {
/* 4088 */     return this.u.canMineBlock(par1EntityPlayer, par2, par3, par4);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean canMineBlockBody(qx par1EntityPlayer, int par2, int par3, int par4) {
/* 4093 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(lq par1Entity, byte par2) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public zw I() {
/* 4106 */     return this.w;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void c(int par1, int par2, int par3, int par4, int par5, int par6) {
/* 4115 */     if (par4 > 0)
/*      */     {
/* 4117 */       amq.p[par4].b(this, par1, par2, par3, par5, par6);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public aih J() {
/* 4126 */     return this.x;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ahx K() {
/* 4134 */     return this.y;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public xz L() {
/* 4142 */     return this.y.x();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void c() {}
/*      */ 
/*      */ 
/*      */   
/*      */   public float i(float par1) {
/* 4152 */     return (this.o + (this.p - this.o) * par1) * j(par1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float j(float par1) {
/* 4160 */     return this.m + (this.n - this.m) * par1;
/*      */   }
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public void k(float par1) {
/* 4166 */     this.m = par1;
/* 4167 */     this.n = par1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean M() {
/* 4175 */     return (i(1.0F) > 0.9D);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean N() {
/* 4183 */     return (j(1.0F) > 0.2D);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean D(int par1, int par2, int par3) {
/* 4188 */     if (!N())
/*      */     {
/* 4190 */       return false;
/*      */     }
/* 4192 */     if (!k(par1, par2, par3))
/*      */     {
/* 4194 */       return false;
/*      */     }
/* 4196 */     if (h(par1, par3) > par2)
/*      */     {
/* 4198 */       return false;
/*      */     }
/*      */ 
/*      */     
/* 4202 */     yy var4 = a(par1, par3);
/* 4203 */     return var4.c() ? false : var4.d();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean E(int par1, int par2, int par3) {
/* 4212 */     return this.u.isBlockHighHumidity(par1, par2, par3);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(String par1Str, ahq par2WorldSavedData) {
/* 4221 */     this.A.a(par1Str, par2WorldSavedData);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ahq a(Class par1Class, String par2Str) {
/* 4230 */     return this.A.a(par1Class, par2Str);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int b(String par1Str) {
/* 4239 */     return this.A.a(par1Str);
/*      */   }
/*      */ 
/*      */   
/*      */   public void e(int par1, int par2, int par3, int par4, int par5) {
/* 4244 */     for (int var6 = 0; var6 < this.v.size(); var6++)
/*      */     {
/* 4246 */       ((yi)this.v.get(var6)).a(par1, par2, par3, par4, par5);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void f(int par1, int par2, int par3, int par4, int par5) {
/* 4255 */     a((qx)null, par1, par2, par3, par4, par5);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(qx par1EntityPlayer, int par2, int par3, int par4, int par5, int par6) {
/*      */     try {
/* 4265 */       for (int var7 = 0; var7 < this.v.size(); var7++)
/*      */       {
/* 4267 */         ((yi)this.v.get(var7)).a(par1EntityPlayer, par2, par3, par4, par5, par6);
/*      */       }
/*      */     }
/* 4270 */     catch (Throwable var10) {
/*      */       
/* 4272 */       a var8 = a.a(var10, "Playing level event");
/* 4273 */       l var9 = var8.a("Level event being played");
/* 4274 */       var9.a("Block coordinates", l.a(par3, par4, par5));
/* 4275 */       var9.a("Event source", par1EntityPlayer);
/* 4276 */       var9.a("Event type", Integer.valueOf(par2));
/* 4277 */       var9.a("Event data", Integer.valueOf(par6));
/* 4278 */       throw new t(var8);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int O() {
/* 4287 */     return this.u.getHeight();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int P() {
/* 4295 */     return this.u.getActualHeight();
/*      */   }
/*      */ 
/*      */   
/*      */   public gp a(py par1EntityMinecart) {
/* 4300 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Random F(int par1, int par2, int par3) {
/* 4308 */     long var4 = par1 * 341873128712L + par2 * 132897987541L + K().b() + par3;
/* 4309 */     this.t.setSeed(var4);
/* 4310 */     return this.t;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public yv b(String par1Str, int par2, int par3, int par4) {
/* 4318 */     return I().a(this, par1Str, par2, par3, par4);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public boolean Q() {
/* 4328 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public double R() {
/* 4338 */     return this.u.getHorizon();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public l a(a par1CrashReport) {
/* 4346 */     l var2 = par1CrashReport.a("Affected level", 1);
/* 4347 */     var2.a("Level name", (this.y == null) ? "????" : this.y.k());
/* 4348 */     var2.a("All players", (Callable)new ye(this));
/* 4349 */     var2.a("Chunk stats", (Callable)new yf(this));
/*      */ 
/*      */     
/*      */     try {
/* 4353 */       this.y.a(var2);
/*      */     }
/* 4355 */     catch (Throwable var4) {
/*      */       
/* 4357 */       var2.a("Level Data Unobtainable", var4);
/*      */     } 
/*      */     
/* 4360 */     return var2;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void g(int par1, int par2, int par3, int par4, int par5) {
/* 4369 */     for (int var6 = 0; var6 < this.v.size(); var6++) {
/*      */       
/* 4371 */       yi var7 = this.v.get(var6);
/* 4372 */       var7.b(par1, par2, par3, par4, par5);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public aok S() {
/* 4381 */     return this.J;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Calendar T() {
/* 4389 */     if (F() % 600L == 0L)
/*      */     {
/* 4391 */       this.K.setTimeInMillis(System.currentTimeMillis());
/*      */     }
/*      */     
/* 4394 */     return this.K;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public void a(double par1, double par3, double par5, double par7, double par9, double par11, bq par13NBTTagCompound) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public void addTileEntity(any entity) {
/* 4406 */     List<any> dest = this.M ? this.a : this.g;
/* 4407 */     if (entity.canUpdate())
/*      */     {
/* 4409 */       dest.add(entity);
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
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isBlockSolidOnSide(int x, int y, int z, ForgeDirection side) {
/* 4425 */     return isBlockSolidOnSide(x, y, z, side, false);
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
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isBlockSolidOnSide(int x, int y, int z, ForgeDirection side, boolean _default) {
/* 4441 */     if (x < -30000000 || z < -30000000 || x >= 30000000 || z >= 30000000)
/*      */     {
/* 4443 */       return _default;
/*      */     }
/*      */     
/* 4446 */     zz var5 = this.w.d(x >> 4, z >> 4);
/* 4447 */     if (var5 == null || var5.g())
/*      */     {
/* 4449 */       return _default;
/*      */     }
/*      */     
/* 4452 */     amq block = amq.p[a(x, y, z)];
/* 4453 */     if (block == null)
/*      */     {
/* 4455 */       return false;
/*      */     }
/*      */     
/* 4458 */     return block.isBlockSolidOnSide(this, x, y, z, side);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ImmutableSetMultimap getPersistentChunks() {
/* 4468 */     return ForgeChunkManager.getPersistentChunksFor(this);
/*      */   }
/*      */ }


/* Location:              /home/luigi/Documents/JAR.jar!/yc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */