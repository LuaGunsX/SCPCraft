/*      */ package net.minecraft.client;
/*      */ import ModLoader;
/*      */ import SCPCraft.guis.SCPGuiChangelog;
/*      */ import SCPCraft.guis.SCPGuiWrongVersion;
/*      */ import SCPCraft.mod_Others;
/*      */ import a;
/*      */ import ahs;
/*      */ import ahx;
/*      */ import aih;
/*      */ import aij;
/*      */ import aoe;
/*      */ import aoi;
/*      */ import arn;
/*      */ import arv;
/*      */ import arx;
/*      */ import ary;
/*      */ import arz;
/*      */ import asa;
/*      */ import asb;
/*      */ import asc;
/*      */ import asd;
/*      */ import ase;
/*      */ import asf;
/*      */ import asg;
/*      */ import ash;
/*      */ import asi;
/*      */ import asj;
/*      */ import ask;
/*      */ import asl;
/*      */ import asm;
/*      */ import asn;
/*      */ import aso;
/*      */ import asr;
/*      */ import ast;
/*      */ import asv;
/*      */ import asw;
/*      */ import asx;
/*      */ import asy;
/*      */ import asz;
/*      */ import ata;
/*      */ import ate;
/*      */ import atk;
/*      */ import atq;
/*      */ import atr;
/*      */ import aul;
/*      */ import aum;
/*      */ import auw;
/*      */ import ayh;
/*      */ import ayk;
/*      */ import ayo;
/*      */ import ayp;
/*      */ import ays;
/*      */ import ayw;
/*      */ import azr;
/*      */ import bae;
/*      */ import baf;
/*      */ import baj;
/*      */ import ban;
/*      */ import bau;
/*      */ import bav;
/*      */ import baz;
/*      */ import bba;
/*      */ import bbb;
/*      */ import bbu;
/*      */ import bde;
/*      */ import bdf;
/*      */ import bdg;
/*      */ import bdh;
/*      */ import bdi;
/*      */ import bdj;
/*      */ import bdk;
/*      */ import bdl;
/*      */ import bdm;
/*      */ import bdz;
/*      */ import ben;
/*      */ import bev;
/*      */ import bey;
/*      */ import bez;
/*      */ import bfe;
/*      */ import bm;
/*      */ import bn;
/*      */ import ce;
/*      */ import cf;
/*      */ import com.google.common.collect.MapDifference;
/*      */ import cpw.mods.fml.client.FMLClientHandler;
/*      */ import cpw.mods.fml.common.FMLCommonHandler;
/*      */ import cpw.mods.fml.common.registry.GameData;
/*      */ import cpw.mods.fml.relauncher.ArgsWrapper;
/*      */ import cpw.mods.fml.relauncher.Side;
/*      */ import cu;
/*      */ import java.applet.AppletStub;
/*      */ import java.awt.BorderLayout;
/*      */ import java.awt.Canvas;
/*      */ import java.awt.Color;
/*      */ import java.awt.Component;
/*      */ import java.awt.Dimension;
/*      */ import java.awt.Frame;
/*      */ import java.awt.Graphics;
/*      */ import java.io.File;
/*      */ import java.io.IOException;
/*      */ import java.text.DecimalFormat;
/*      */ import java.util.HashMap;
/*      */ import java.util.List;
/*      */ import java.util.concurrent.Callable;
/*      */ import javax.swing.JPanel;
/*      */ import jh;
/*      */ import ji;
/*      */ import jq;
/*      */ import jv;
/*      */ import ke;
/*      */ import kh;
/*      */ import ki;
/*      */ import l;
/*      */ import le;
/*      */ import lg;
/*      */ import lq;
/*      */ import md;
/*      */ import net.minecraftforge.common.ForgeHooks;
/*      */ import net.minecraftforge.event.ForgeEventFactory;
/*      */ import net.minecraftforge.event.entity.player.PlayerInteractEvent;
/*      */ import org.lwjgl.LWJGLException;
/*      */ import org.lwjgl.Sys;
/*      */ import org.lwjgl.input.Keyboard;
/*      */ import org.lwjgl.input.Mouse;
/*      */ import org.lwjgl.opengl.ContextCapabilities;
/*      */ import org.lwjgl.opengl.Display;
/*      */ import org.lwjgl.opengl.DisplayMode;
/*      */ import org.lwjgl.opengl.GL11;
/*      */ import org.lwjgl.opengl.GLContext;
/*      */ import org.lwjgl.util.glu.GLU;
/*      */ import qx;
/*      */ import t;
/*      */ import ur;
/*      */ import xy;
/*      */ import yb;
/*      */ import yc;
/*      */ import yk;
/*      */ import yw;
/*      */ 
/*      */ @SideOnly(Side.CLIENT)
/*      */ public abstract class Minecraft implements Runnable, lg {
/*  142 */   public static byte[] a = new byte[10485760];
/*      */   
/*      */   private ayw O;
/*      */   
/*      */   private static Minecraft P;
/*      */   
/*      */   public ayo b;
/*      */   
/*      */   private boolean Q = false;
/*      */   
/*      */   private boolean R = false;
/*      */   
/*      */   private a S;
/*      */   public int c;
/*      */   public int d;
/*  157 */   private asz T = new asz(20.0F);
/*      */ 
/*      */   
/*  160 */   private le U = new le("client", this);
/*      */ 
/*      */   
/*      */   public ayp e;
/*      */   
/*      */   public bav f;
/*      */   
/*      */   public ays g;
/*      */   
/*      */   public md h;
/*      */   
/*      */   public azr i;
/*      */   
/*  173 */   public ata j = null;
/*      */   
/*      */   public String k;
/*      */   
/*      */   public Canvas l;
/*      */   
/*      */   public boolean m = false;
/*      */   
/*      */   public volatile boolean n = false;
/*      */   
/*      */   public bba o;
/*      */   
/*      */   public atq p;
/*      */   
/*      */   public atq q;
/*      */   
/*  189 */   public aul r = null;
/*      */   
/*      */   public asw s;
/*      */   
/*      */   public ban t;
/*      */   
/*      */   private arn V;
/*      */   
/*  197 */   private int W = 0;
/*      */ 
/*      */   
/*      */   private int X;
/*      */ 
/*      */   
/*      */   private int Y;
/*      */ 
/*      */   
/*      */   private bdz Z;
/*      */ 
/*      */   
/*  209 */   public auw u = new auw(this);
/*      */ 
/*      */   
/*      */   public atr v;
/*      */   
/*      */   public boolean w = false;
/*      */   
/*  216 */   public aoh x = null;
/*      */   
/*      */   public ast y;
/*      */   
/*      */   protected MinecraftApplet z;
/*  221 */   public bev A = new bev();
/*      */ 
/*      */ 
/*      */   
/*      */   public asr B;
/*      */ 
/*      */   
/*      */   public ben C;
/*      */ 
/*      */   
/*      */   public File D;
/*      */ 
/*      */   
/*      */   private aij aa;
/*      */ 
/*      */   
/*      */   private static int ab;
/*      */ 
/*      */   
/*  240 */   private int ac = 0;
/*      */ 
/*      */   
/*      */   private boolean ad;
/*      */   
/*      */   public bez E;
/*      */   
/*      */   private String ae;
/*      */   
/*      */   private int af;
/*      */   
/*  251 */   private bdm ag = new bdm();
/*  252 */   private bdj ah = new bdj();
/*      */ 
/*      */ 
/*      */   
/*      */   boolean F = false;
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean G = false;
/*      */ 
/*      */   
/*  263 */   long H = F();
/*      */ 
/*      */   
/*  266 */   private int ai = 0;
/*      */   
/*      */   private boolean aj;
/*      */   
/*      */   private ce ak;
/*      */   private boolean al;
/*  272 */   public final kh I = new kh();
/*  273 */   private long am = -1L;
/*      */ 
/*      */   
/*  276 */   private static File an = null;
/*      */ 
/*      */ 
/*      */   
/*      */   public volatile boolean J = true;
/*      */ 
/*      */ 
/*      */   
/*  284 */   public String K = "";
/*      */ 
/*      */   
/*  287 */   long L = F();
/*      */ 
/*      */   
/*  290 */   int M = 0;
/*  291 */   long N = -1L;
/*      */ 
/*      */   
/*  294 */   private String ao = "root";
/*      */ 
/*      */   
/*      */   public Minecraft(Canvas par1Canvas, MinecraftApplet par2MinecraftApplet, int par3, int par4, boolean par5) {
/*  298 */     jq.a();
/*  299 */     this.Y = par4;
/*  300 */     this.Q = par5;
/*  301 */     this.z = par2MinecraftApplet;
/*  302 */     cu.a = 32767;
/*  303 */     H();
/*  304 */     this.l = par1Canvas;
/*  305 */     this.c = par3;
/*  306 */     this.d = par4;
/*  307 */     this.Q = par5;
/*  308 */     P = this;
/*      */   }
/*      */ 
/*      */   
/*      */   private void H() {
/*  313 */     ary var1 = new ary(this, "Timer hack thread");
/*  314 */     var1.setDaemon(true);
/*  315 */     var1.start();
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(a par1CrashReport) {
/*  320 */     this.R = true;
/*  321 */     this.S = par1CrashReport;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void c(a par1CrashReport) {
/*  329 */     this.R = true;
/*  330 */     d(par1CrashReport);
/*      */   }
/*      */ 
/*      */   
/*      */   public abstract void d(a parama);
/*      */   
/*      */   public void a(String par1Str, int par2) {
/*  337 */     this.ae = par1Str;
/*  338 */     this.af = par2;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a() throws LWJGLException {
/*  346 */     if (this.l != null) {
/*      */       
/*  348 */       Graphics var1 = this.l.getGraphics();
/*      */       
/*  350 */       if (var1 != null) {
/*      */         
/*  352 */         var1.setColor(Color.BLACK);
/*  353 */         var1.fillRect(0, 0, this.c, this.d);
/*  354 */         var1.dispose();
/*      */       } 
/*      */       
/*  357 */       Display.setParent(this.l);
/*      */     }
/*  359 */     else if (this.Q) {
/*      */       
/*  361 */       Display.setFullscreen(true);
/*  362 */       this.c = Display.getDisplayMode().getWidth();
/*  363 */       this.d = Display.getDisplayMode().getHeight();
/*      */       
/*  365 */       if (this.c <= 0)
/*      */       {
/*  367 */         this.c = 1;
/*      */       }
/*      */       
/*  370 */       if (this.d <= 0)
/*      */       {
/*  372 */         this.d = 1;
/*      */       }
/*      */     }
/*      */     else {
/*      */       
/*  377 */       Display.setDisplayMode(new DisplayMode(this.c, this.d));
/*      */     } 
/*      */     
/*  380 */     Display.setTitle("Minecraft Minecraft 1.4.6");
/*  381 */     System.out.println("LWJGL Version: " + Sys.getVersion());
/*      */ 
/*      */     
/*      */     try {
/*  385 */       Display.create((new PixelFormat()).withDepthBits(24));
/*      */     }
/*  387 */     catch (LWJGLException var5) {
/*      */       
/*  389 */       var5.printStackTrace();
/*      */ 
/*      */       
/*      */       try {
/*  393 */         Thread.sleep(1000L);
/*      */       }
/*  395 */       catch (InterruptedException var4) {}
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  400 */       Display.create();
/*      */     } 
/*      */     
/*  403 */     bfe.a();
/*  404 */     this.D = b();
/*  405 */     this.aa = (aij)new ahs(new File(this.D, "saves"));
/*  406 */     this.y = new ast(this, this.D);
/*  407 */     this.C = new ben(this.D, this);
/*  408 */     this.o = new bba(this.C, this.y);
/*  409 */     I();
/*  410 */     this.p = new atq(this.y, "/font/default.png", this.o, false);
/*  411 */     this.q = new atq(this.y, "/font/alternate.png", this.o, false);
/*      */     
/*  413 */     FMLClientHandler.instance().beginMinecraftLoading(this);
/*      */     
/*  415 */     if (this.y.aj != null) {
/*      */       
/*  417 */       bn.a().a(this.y.aj);
/*  418 */       this.p.a(bn.a().d());
/*  419 */       this.p.b(bn.e(this.y.aj));
/*      */     } 
/*      */     
/*  422 */     yw.a(this.o.a("/misc/watercolor.png"));
/*  423 */     yb.a(this.o.a("/misc/grasscolor.png"));
/*  424 */     xy.a(this.o.a("/misc/foliagecolor.png"));
/*  425 */     this.t = new ban(this);
/*  426 */     bbu.a.f = new bau(this);
/*  427 */     this.E = new bez(this.j, this.D);
/*  428 */     jh.f.a((ji)new asg(this));
/*  429 */     I();
/*  430 */     Mouse.create();
/*  431 */     this.B = new asr(this.l, this.y);
/*  432 */     d("Pre startup");
/*  433 */     GL11.glEnable(3553);
/*  434 */     GL11.glShadeModel(7425);
/*  435 */     GL11.glClearDepth(1.0D);
/*  436 */     GL11.glEnable(2929);
/*  437 */     GL11.glDepthFunc(515);
/*  438 */     GL11.glEnable(3008);
/*  439 */     GL11.glAlphaFunc(516, 0.1F);
/*  440 */     GL11.glCullFace(1029);
/*  441 */     GL11.glMatrixMode(5889);
/*  442 */     GL11.glLoadIdentity();
/*  443 */     GL11.glMatrixMode(5888);
/*  444 */     d("Startup");
/*  445 */     this.A.a(this.y);
/*  446 */     this.o.a((bdg)this.ah);
/*  447 */     this.o.a((bdg)this.ag);
/*  448 */     this.o.a((bdg)new bdk());
/*  449 */     this.o.a((bdg)new bdf(this));
/*  450 */     this.o.a((bdg)new bde(this));
/*  451 */     this.o.a((bdg)new bdl());
/*  452 */     this.o.a((bdg)new bdi());
/*  453 */     this.o.a((bdg)new bdh(0));
/*  454 */     this.o.a((bdg)new bdh(1));
/*  455 */     this.f = new bav(this, this.o);
/*  456 */     GL11.glViewport(0, 0, this.c, this.d);
/*  457 */     this.i = new azr((yc)this.e, this.o);
/*      */     
/*  459 */     FMLClientHandler.instance().finishMinecraftLoading();
/*      */ 
/*      */     
/*      */     try {
/*  463 */       this.V = new arn(this.D, this);
/*  464 */       this.V.start();
/*      */     }
/*  466 */     catch (Exception var3) {}
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  471 */     d("Post startup");
/*  472 */     this.v = new atr(this);
/*      */     
/*  474 */     if (this.ae != null) {
/*      */       
/*  476 */       a((aul)new ayk(this, this.ae, this.af));
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  481 */     else if (!mod_Others.isRightForgeVersion()) {
/*      */       
/*  483 */       ays ays1 = (ModLoader.getMinecraftInstance()).g;
/*  484 */       ayp ayp1 = (ModLoader.getMinecraftInstance()).e;
/*  485 */       ModLoader.openGUI((qx)ays1, (aul)new SCPGuiWrongVersion((yc)ayp1, null, (qx)ays1, ""));
/*  486 */       SCPGuiWrongVersion.isRightVersion = false;
/*      */     }
/*      */     else {
/*      */       
/*  490 */       ays ays1 = (ModLoader.getMinecraftInstance()).g;
/*  491 */       ayp ayp1 = (ModLoader.getMinecraftInstance()).e;
/*  492 */       ModLoader.openGUI((qx)ays1, (aul)new SCPGuiChangelog());
/*  493 */       SCPGuiWrongVersion.isRightVersion = true;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  498 */     this.s = new asw(this);
/*      */     
/*  500 */     if (this.y.u && !this.Q)
/*      */     {
/*  502 */       k();
/*      */     }
/*      */     
/*  505 */     FMLClientHandler.instance().onInitializationComplete();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void I() throws LWJGLException {
/*  513 */     aum var1 = new aum(this.y, this.c, this.d);
/*  514 */     GL11.glClear(16640);
/*  515 */     GL11.glMatrixMode(5889);
/*  516 */     GL11.glLoadIdentity();
/*  517 */     GL11.glOrtho(0.0D, var1.c(), var1.d(), 0.0D, 1000.0D, 3000.0D);
/*  518 */     GL11.glMatrixMode(5888);
/*  519 */     GL11.glLoadIdentity();
/*  520 */     GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
/*  521 */     GL11.glViewport(0, 0, this.c, this.d);
/*  522 */     GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
/*  523 */     GL11.glDisable(2896);
/*  524 */     GL11.glEnable(3553);
/*  525 */     GL11.glDisable(2912);
/*  526 */     baz var2 = baz.a;
/*  527 */     GL11.glBindTexture(3553, this.o.b("/title/mojang.png"));
/*  528 */     var2.b();
/*  529 */     var2.d(16777215);
/*  530 */     var2.a(0.0D, this.d, 0.0D, 0.0D, 0.0D);
/*  531 */     var2.a(this.c, this.d, 0.0D, 0.0D, 0.0D);
/*  532 */     var2.a(this.c, 0.0D, 0.0D, 0.0D, 0.0D);
/*  533 */     var2.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
/*  534 */     var2.a();
/*  535 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  536 */     var2.d(16777215);
/*  537 */     short var3 = 256;
/*  538 */     short var4 = 256;
/*  539 */     a((var1.a() - var3) / 2, (var1.b() - var4) / 2, 0, 0, var3, var4);
/*  540 */     GL11.glDisable(2896);
/*  541 */     GL11.glDisable(2912);
/*  542 */     GL11.glEnable(3008);
/*  543 */     GL11.glAlphaFunc(516, 0.1F);
/*  544 */     Display.swapBuffers();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(int par1, int par2, int par3, int par4, int par5, int par6) {
/*  552 */     float var7 = 0.00390625F;
/*  553 */     float var8 = 0.00390625F;
/*  554 */     baz var9 = baz.a;
/*  555 */     var9.b();
/*  556 */     var9.a((par1 + 0), (par2 + par6), 0.0D, ((par3 + 0) * var7), ((par4 + par6) * var8));
/*  557 */     var9.a((par1 + par5), (par2 + par6), 0.0D, ((par3 + par5) * var7), ((par4 + par6) * var8));
/*  558 */     var9.a((par1 + par5), (par2 + 0), 0.0D, ((par3 + par5) * var7), ((par4 + 0) * var8));
/*  559 */     var9.a((par1 + 0), (par2 + 0), 0.0D, ((par3 + 0) * var7), ((par4 + 0) * var8));
/*  560 */     var9.a();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static File b() {
/*  568 */     if (an == null)
/*      */     {
/*  570 */       an = a("minecraft");
/*      */     }
/*      */     
/*  573 */     return an;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static File a(String par0Str) {
/*      */     File var2;
/*  581 */     String var3, var1 = System.getProperty("user.home", ".");
/*      */ 
/*      */     
/*  584 */     switch (ase.a[c().ordinal()]) {
/*      */       
/*      */       case 1:
/*      */       case 2:
/*  588 */         var2 = new File(var1, '.' + par0Str + '/');
/*      */         break;
/*      */       case 3:
/*  591 */         var3 = System.getenv("APPDATA");
/*      */         
/*  593 */         if (var3 != null) {
/*      */           
/*  595 */           var2 = new File(var3, "." + par0Str + '/');
/*      */           
/*      */           break;
/*      */         } 
/*  599 */         var2 = new File(var1, '.' + par0Str + '/');
/*      */         break;
/*      */ 
/*      */       
/*      */       case 4:
/*  604 */         var2 = new File(var1, "Library/Application Support/" + par0Str);
/*      */         break;
/*      */       default:
/*  607 */         var2 = new File(var1, par0Str + '/');
/*      */         break;
/*      */     } 
/*  610 */     if (!var2.exists() && !var2.mkdirs())
/*      */     {
/*  612 */       throw new RuntimeException("The working directory could not be created: " + var2);
/*      */     }
/*      */ 
/*      */     
/*  616 */     return var2;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static aso c() {
/*  622 */     String var0 = System.getProperty("os.name").toLowerCase();
/*  623 */     return var0.contains("win") ? aso.c : (var0.contains("mac") ? aso.d : (var0.contains("solaris") ? aso.b : (var0.contains("sunos") ? aso.b : (var0.contains("linux") ? aso.a : (var0.contains("unix") ? aso.a : aso.e)))));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public aij d() {
/*  631 */     return this.aa;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(aul par1GuiScreen) {
/*  639 */     if (!(this.r instanceof atp)) {
/*      */       bey bey; atk atk;
/*  641 */       if (this.r != null)
/*      */       {
/*  643 */         this.r.b();
/*      */       }
/*      */       
/*  646 */       this.E.d();
/*      */       
/*  648 */       if (par1GuiScreen == null && this.e == null) {
/*      */         
/*  650 */         bey = new bey();
/*      */       }
/*  652 */       else if (bey == null && this.g.aU() <= 0) {
/*      */         
/*  654 */         atk = new atk();
/*      */       } 
/*      */       
/*  657 */       if (atk instanceof bey) {
/*      */         
/*  659 */         this.y.X = false;
/*  660 */         this.v.b().a();
/*      */       } 
/*      */       
/*  663 */       this.r = (aul)atk;
/*      */       
/*  665 */       if (atk != null) {
/*      */         
/*  667 */         i();
/*  668 */         aum var2 = new aum(this.y, this.c, this.d);
/*  669 */         int var3 = var2.a();
/*  670 */         int var4 = var2.b();
/*  671 */         atk.a(this, var3, var4);
/*  672 */         this.w = false;
/*      */       }
/*      */       else {
/*      */         
/*  676 */         h();
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void d(String par1Str) {
/*  686 */     int var2 = GL11.glGetError();
/*      */     
/*  688 */     if (var2 != 0) {
/*      */       
/*  690 */       String var3 = GLU.gluErrorString(var2);
/*  691 */       System.out.println("########## GL ERROR ##########");
/*  692 */       System.out.println("@ " + par1Str);
/*  693 */       System.out.println(var2 + ": " + var3);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void e() {
/*      */     try {
/*  705 */       this.E.d();
/*      */ 
/*      */       
/*      */       try {
/*  709 */         if (this.V != null)
/*      */         {
/*  711 */           this.V.b();
/*      */         }
/*      */       }
/*  714 */       catch (Exception var9) {}
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  719 */       System.out.println("Stopping!");
/*      */ 
/*      */       
/*      */       try {
/*  723 */         a((ayp)null);
/*      */       }
/*  725 */       catch (Throwable var8) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       try {
/*  732 */         arx.a();
/*      */       }
/*  734 */       catch (Throwable var7) {}
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  739 */       this.A.b();
/*  740 */       Mouse.destroy();
/*  741 */       Keyboard.destroy();
/*      */     }
/*      */     finally {
/*      */       
/*  745 */       Display.destroy();
/*      */       
/*  747 */       if (!this.R)
/*      */       {
/*  749 */         System.exit(0);
/*      */       }
/*      */     } 
/*      */     
/*  753 */     System.gc();
/*      */   }
/*      */ 
/*      */   
/*      */   public void run() {
/*  758 */     this.J = true;
/*      */ 
/*      */     
/*      */     try {
/*  762 */       a();
/*      */     }
/*  764 */     catch (Exception var11) {
/*      */       
/*  766 */       var11.printStackTrace();
/*  767 */       c(b(new a("Failed to start game", var11)));
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/*      */     try {
/*  773 */       while (this.J) {
/*      */         
/*  775 */         if (this.R && this.S != null) {
/*      */           
/*  777 */           c(this.S);
/*      */           
/*      */           return;
/*      */         } 
/*  781 */         if (this.ad) {
/*      */           
/*  783 */           this.ad = false;
/*  784 */           this.o.b();
/*      */         } 
/*      */ 
/*      */         
/*      */         try {
/*  789 */           J();
/*      */         }
/*  791 */         catch (OutOfMemoryError var10) {
/*      */           
/*  793 */           f();
/*  794 */           a((aul)new aue());
/*  795 */           System.gc();
/*      */         }
/*      */       
/*      */       } 
/*  799 */     } catch (asy var12) {
/*      */ 
/*      */     
/*      */     }
/*  803 */     catch (t var13) {
/*      */       
/*  805 */       b(var13.a());
/*  806 */       f();
/*  807 */       var13.printStackTrace();
/*  808 */       c(var13.a());
/*      */     }
/*  810 */     catch (Throwable var14) {
/*      */       
/*  812 */       a var2 = b(new a("Unexpected error", var14));
/*  813 */       f();
/*  814 */       var14.printStackTrace();
/*  815 */       c(var2);
/*      */     }
/*      */     finally {
/*      */       
/*  819 */       e();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void J() {
/*  828 */     if (this.z != null && !this.z.isActive()) {
/*      */       
/*  830 */       this.J = false;
/*      */     }
/*      */     else {
/*      */       
/*  834 */       aoe.a().a();
/*      */       
/*  836 */       if (this.e != null)
/*      */       {
/*  838 */         this.e.S().a();
/*      */       }
/*      */       
/*  841 */       this.I.a("root");
/*      */       
/*  843 */       if (this.l == null && Display.isCloseRequested())
/*      */       {
/*  845 */         g();
/*      */       }
/*      */       
/*  848 */       if (this.n && this.e != null) {
/*      */         
/*  850 */         float var1 = this.T.c;
/*  851 */         this.T.a();
/*  852 */         this.T.c = var1;
/*      */       }
/*      */       else {
/*      */         
/*  856 */         this.T.a();
/*      */       } 
/*      */       
/*  859 */       long var6 = System.nanoTime();
/*  860 */       this.I.a("tick");
/*      */       
/*  862 */       for (int var3 = 0; var3 < this.T.b; var3++)
/*      */       {
/*  864 */         l();
/*      */       }
/*      */       
/*  867 */       this.I.c("preRenderErrors");
/*  868 */       long var7 = System.nanoTime() - var6;
/*  869 */       d("Pre render");
/*  870 */       bbb.b = this.y.j;
/*  871 */       this.I.c("sound");
/*  872 */       this.A.a((md)this.g, this.T.c);
/*      */       
/*  874 */       if (!this.n)
/*      */       {
/*  876 */         this.A.g();
/*      */       }
/*      */       
/*  879 */       this.I.b();
/*  880 */       this.I.a("render");
/*  881 */       this.I.a("display");
/*  882 */       GL11.glEnable(3553);
/*      */       
/*  884 */       if (!Keyboard.isKeyDown(65))
/*      */       {
/*  886 */         Display.update();
/*      */       }
/*      */       
/*  889 */       if (this.g != null && this.g.T())
/*      */       {
/*  891 */         this.y.W = 0;
/*      */       }
/*      */       
/*  894 */       this.I.b();
/*      */       
/*  896 */       if (!this.w) {
/*      */         
/*  898 */         FMLCommonHandler.instance().onRenderTickStart(this.T.c);
/*  899 */         this.I.c("gameRenderer");
/*  900 */         this.t.b(this.T.c);
/*  901 */         this.I.b();
/*  902 */         FMLCommonHandler.instance().onRenderTickEnd(this.T.c);
/*      */       } 
/*      */       
/*  905 */       GL11.glFlush();
/*  906 */       this.I.b();
/*      */       
/*  908 */       if (!Display.isActive() && this.Q)
/*      */       {
/*  910 */         k();
/*      */       }
/*      */       
/*  913 */       if (this.y.X && this.y.Y) {
/*      */         
/*  915 */         if (!this.I.a)
/*      */         {
/*  917 */           this.I.a();
/*      */         }
/*      */         
/*  920 */         this.I.a = true;
/*  921 */         a(var7);
/*      */       }
/*      */       else {
/*      */         
/*  925 */         this.I.a = false;
/*  926 */         this.N = System.nanoTime();
/*      */       } 
/*      */       
/*  929 */       this.u.a();
/*  930 */       this.I.a("root");
/*  931 */       Thread.yield();
/*      */       
/*  933 */       if (Keyboard.isKeyDown(65))
/*      */       {
/*  935 */         Display.update();
/*      */       }
/*      */       
/*  938 */       L();
/*      */       
/*  940 */       if (this.l != null && !this.Q && (this.l.getWidth() != this.c || this.l.getHeight() != this.d)) {
/*      */         
/*  942 */         this.c = this.l.getWidth();
/*  943 */         this.d = this.l.getHeight();
/*      */         
/*  945 */         if (this.c <= 0)
/*      */         {
/*  947 */           this.c = 1;
/*      */         }
/*      */         
/*  950 */         if (this.d <= 0)
/*      */         {
/*  952 */           this.d = 1;
/*      */         }
/*      */         
/*  955 */         a(this.c, this.d);
/*      */       } 
/*      */       
/*  958 */       d("Post render");
/*  959 */       this.M++;
/*  960 */       boolean var5 = this.n;
/*  961 */       this.n = (B() && this.r != null && this.r.f() && !this.Z.al());
/*      */       
/*  963 */       if (A() && this.g != null && this.g.a != null && this.n != var5)
/*      */       {
/*  965 */         ((cf)this.g.a.f()).a(this.n);
/*      */       }
/*      */       
/*  968 */       while (F() >= this.L + 1000L) {
/*      */         
/*  970 */         ab = this.M;
/*  971 */         this.K = ab + " fps, " + baj.b + " chunk updates";
/*  972 */         baj.b = 0;
/*  973 */         this.L += 1000L;
/*  974 */         this.M = 0;
/*  975 */         this.U.b();
/*      */         
/*  977 */         if (!this.U.d())
/*      */         {
/*  979 */           this.U.a();
/*      */         }
/*      */       } 
/*      */       
/*  983 */       this.I.b();
/*      */       
/*  985 */       if (K() > 0)
/*      */       {
/*  987 */         Display.sync(ban.a(K()));
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private int K() {
/*  994 */     return (this.r != null && this.r instanceof bey) ? 2 : this.y.i;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void f() {
/*      */     try {
/* 1001 */       a = new byte[0];
/* 1002 */       this.f.f();
/*      */     }
/* 1004 */     catch (Throwable var4) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/* 1011 */       System.gc();
/* 1012 */       aoe.a().b();
/* 1013 */       this.e.S().b();
/*      */     }
/* 1015 */     catch (Throwable var3) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/* 1022 */       System.gc();
/* 1023 */       a((ayp)null);
/*      */     }
/* 1025 */     catch (Throwable var2) {}
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1030 */     System.gc();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void L() {
/* 1038 */     if (Keyboard.isKeyDown(60)) {
/*      */       
/* 1040 */       if (!this.F)
/*      */       {
/* 1042 */         this.F = true;
/* 1043 */         this.v.b().a(asx.a(an, this.c, this.d));
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 1048 */       this.F = false;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void b(int par1) {
/* 1057 */     List<ki> var2 = this.I.b(this.ao);
/*      */     
/* 1059 */     if (var2 != null && !var2.isEmpty()) {
/*      */       
/* 1061 */       ki var3 = var2.remove(0);
/*      */       
/* 1063 */       if (par1 == 0) {
/*      */         
/* 1065 */         if (var3.c.length() > 0)
/*      */         {
/* 1067 */           int var4 = this.ao.lastIndexOf(".");
/*      */           
/* 1069 */           if (var4 >= 0)
/*      */           {
/* 1071 */             this.ao = this.ao.substring(0, var4);
/*      */           }
/*      */         }
/*      */       
/*      */       } else {
/*      */         
/* 1077 */         par1--;
/*      */         
/* 1079 */         if (par1 < var2.size() && !((ki)var2.get(par1)).c.equals("unspecified")) {
/*      */           
/* 1081 */           if (this.ao.length() > 0)
/*      */           {
/* 1083 */             this.ao += ".";
/*      */           }
/*      */           
/* 1086 */           this.ao += ((ki)var2.get(par1)).c;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private void a(long par1) {
/* 1094 */     if (this.I.a) {
/*      */       
/* 1096 */       List<ki> var3 = this.I.b(this.ao);
/* 1097 */       ki var4 = var3.remove(0);
/* 1098 */       GL11.glClear(256);
/* 1099 */       GL11.glMatrixMode(5889);
/* 1100 */       GL11.glEnable(2903);
/* 1101 */       GL11.glLoadIdentity();
/* 1102 */       GL11.glOrtho(0.0D, this.c, this.d, 0.0D, 1000.0D, 3000.0D);
/* 1103 */       GL11.glMatrixMode(5888);
/* 1104 */       GL11.glLoadIdentity();
/* 1105 */       GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
/* 1106 */       GL11.glLineWidth(1.0F);
/* 1107 */       GL11.glDisable(3553);
/* 1108 */       baz var5 = baz.a;
/* 1109 */       short var6 = 160;
/* 1110 */       int var7 = this.c - var6 - 10;
/* 1111 */       int var8 = this.d - var6 * 2;
/* 1112 */       GL11.glEnable(3042);
/* 1113 */       var5.b();
/* 1114 */       var5.a(0, 200);
/* 1115 */       var5.a((var7 - var6 * 1.1F), (var8 - var6 * 0.6F - 16.0F), 0.0D);
/* 1116 */       var5.a((var7 - var6 * 1.1F), (var8 + var6 * 2), 0.0D);
/* 1117 */       var5.a((var7 + var6 * 1.1F), (var8 + var6 * 2), 0.0D);
/* 1118 */       var5.a((var7 + var6 * 1.1F), (var8 - var6 * 0.6F - 16.0F), 0.0D);
/* 1119 */       var5.a();
/* 1120 */       GL11.glDisable(3042);
/* 1121 */       double var9 = 0.0D;
/*      */ 
/*      */       
/* 1124 */       for (int var11 = 0; var11 < var3.size(); var11++) {
/*      */         
/* 1126 */         ki var12 = var3.get(var11);
/* 1127 */         int i = ke.c(var12.a / 4.0D) + 1;
/* 1128 */         var5.b(6);
/* 1129 */         var5.d(var12.a());
/* 1130 */         var5.a(var7, var8, 0.0D);
/*      */ 
/*      */         
/*      */         int var14;
/*      */ 
/*      */         
/* 1136 */         for (var14 = i; var14 >= 0; var14--) {
/*      */           
/* 1138 */           float var15 = (float)((var9 + var12.a * var14 / i) * Math.PI * 2.0D / 100.0D);
/* 1139 */           float var16 = ke.a(var15) * var6;
/* 1140 */           float var17 = ke.b(var15) * var6 * 0.5F;
/* 1141 */           var5.a((var7 + var16), (var8 - var17), 0.0D);
/*      */         } 
/*      */         
/* 1144 */         var5.a();
/* 1145 */         var5.b(5);
/* 1146 */         var5.d((var12.a() & 0xFEFEFE) >> 1);
/*      */         
/* 1148 */         for (var14 = i; var14 >= 0; var14--) {
/*      */           
/* 1150 */           float var15 = (float)((var9 + var12.a * var14 / i) * Math.PI * 2.0D / 100.0D);
/* 1151 */           float var16 = ke.a(var15) * var6;
/* 1152 */           float var17 = ke.b(var15) * var6 * 0.5F;
/* 1153 */           var5.a((var7 + var16), (var8 - var17), 0.0D);
/* 1154 */           var5.a((var7 + var16), (var8 - var17 + 10.0F), 0.0D);
/*      */         } 
/*      */         
/* 1157 */         var5.a();
/* 1158 */         var9 += var12.a;
/*      */       } 
/*      */       
/* 1161 */       DecimalFormat var19 = new DecimalFormat("##0.00");
/* 1162 */       GL11.glEnable(3553);
/* 1163 */       String var18 = "";
/*      */       
/* 1165 */       if (!var4.c.equals("unspecified"))
/*      */       {
/* 1167 */         var18 = var18 + "[0] ";
/*      */       }
/*      */       
/* 1170 */       if (var4.c.length() == 0) {
/*      */         
/* 1172 */         var18 = var18 + "ROOT ";
/*      */       }
/*      */       else {
/*      */         
/* 1176 */         var18 = var18 + var4.c + " ";
/*      */       } 
/*      */       
/* 1179 */       int var13 = 16777215;
/* 1180 */       this.p.a(var18, var7 - var6, var8 - var6 / 2 - 16, var13);
/* 1181 */       this.p.a(var18 = var19.format(var4.b) + "%", var7 + var6 - this.p.a(var18), var8 - var6 / 2 - 16, var13);
/*      */       
/* 1183 */       for (int var21 = 0; var21 < var3.size(); var21++) {
/*      */         
/* 1185 */         ki var20 = var3.get(var21);
/* 1186 */         String var22 = "";
/*      */         
/* 1188 */         if (var20.c.equals("unspecified")) {
/*      */           
/* 1190 */           var22 = var22 + "[?] ";
/*      */         }
/*      */         else {
/*      */           
/* 1194 */           var22 = var22 + "[" + (var21 + 1) + "] ";
/*      */         } 
/*      */         
/* 1197 */         var22 = var22 + var20.c;
/* 1198 */         this.p.a(var22, var7 - var6, var8 + var6 / 2 + var21 * 8 + 20, var20.a());
/* 1199 */         this.p.a(var22 = var19.format(var20.a) + "%", var7 + var6 - 50 - this.p.a(var22), var8 + var6 / 2 + var21 * 8 + 20, var20.a());
/* 1200 */         this.p.a(var22 = var19.format(var20.b) + "%", var7 + var6 - this.p.a(var22), var8 + var6 / 2 + var21 * 8 + 20, var20.a());
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void g() {
/* 1210 */     this.J = false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void h() {
/* 1219 */     if (Display.isActive())
/*      */     {
/* 1221 */       if (!this.G) {
/*      */         
/* 1223 */         this.G = true;
/* 1224 */         this.B.a();
/* 1225 */         a((aul)null);
/* 1226 */         this.W = 10000;
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void i() {
/* 1236 */     if (this.G) {
/*      */       
/* 1238 */       arv.a();
/* 1239 */       this.G = false;
/* 1240 */       this.B.b();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void j() {
/* 1249 */     if (this.r == null) {
/*      */       
/* 1251 */       a((aul)new auf());
/*      */       
/* 1253 */       if (B() && !this.Z.al())
/*      */       {
/* 1255 */         this.A.e();
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private void a(int par1, boolean par2) {
/* 1262 */     if (!par2)
/*      */     {
/* 1264 */       this.W = 0;
/*      */     }
/*      */     
/* 1267 */     if (par1 != 0 || this.W <= 0)
/*      */     {
/* 1269 */       if (par2 && this.x != null && this.x.a == aoi.a && par1 == 0) {
/*      */         
/* 1271 */         int var3 = this.x.b;
/* 1272 */         int var4 = this.x.c;
/* 1273 */         int var5 = this.x.d;
/* 1274 */         this.b.c(var3, var4, var5, this.x.e);
/*      */         
/* 1276 */         if (this.g.f(var3, var4, var5))
/*      */         {
/* 1278 */           this.i.addBlockHitEffects(var3, var4, var5, this.x);
/* 1279 */           this.g.bH();
/*      */         }
/*      */       
/*      */       } else {
/*      */         
/* 1284 */         this.b.c();
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void c(int par1) {
/* 1295 */     if (par1 != 0 || this.W <= 0) {
/*      */       
/* 1297 */       if (par1 == 0)
/*      */       {
/* 1299 */         this.g.bH();
/*      */       }
/*      */       
/* 1302 */       if (par1 == 1)
/*      */       {
/* 1304 */         this.ac = 4;
/*      */       }
/*      */       
/* 1307 */       boolean var2 = true;
/* 1308 */       ur var3 = this.g.bJ.g();
/*      */       
/* 1310 */       if (this.x == null) {
/*      */         
/* 1312 */         if (par1 == 0 && this.b.g())
/*      */         {
/* 1314 */           this.W = 10;
/*      */         }
/*      */       }
/* 1317 */       else if (this.x.a == aoi.b) {
/*      */         
/* 1319 */         if (par1 == 0)
/*      */         {
/* 1321 */           this.b.a((qx)this.g, this.x.g);
/*      */         }
/*      */         
/* 1324 */         if (par1 == 1 && this.b.b((qx)this.g, this.x.g))
/*      */         {
/* 1326 */           var2 = false;
/*      */         }
/*      */       }
/* 1329 */       else if (this.x.a == aoi.a) {
/*      */         
/* 1331 */         int var4 = this.x.b;
/* 1332 */         int var5 = this.x.c;
/* 1333 */         int var6 = this.x.d;
/* 1334 */         int var7 = this.x.e;
/*      */         
/* 1336 */         if (par1 == 0) {
/*      */           
/* 1338 */           this.b.b(var4, var5, var6, this.x.e);
/*      */         }
/*      */         else {
/*      */           
/* 1342 */           int var8 = (var3 != null) ? var3.a : 0;
/*      */           
/* 1344 */           boolean result = !ForgeEventFactory.onPlayerInteract((qx)this.g, PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK, var4, var5, var6, var7).isCanceled();
/* 1345 */           if (result && this.b.a((qx)this.g, (yc)this.e, var3, var4, var5, var6, var7, this.x.f)) {
/*      */             
/* 1347 */             var2 = false;
/* 1348 */             this.g.bH();
/*      */           } 
/*      */           
/* 1351 */           if (var3 == null) {
/*      */             return;
/*      */           }
/*      */ 
/*      */           
/* 1356 */           if (var3.a == 0) {
/*      */             
/* 1358 */             this.g.bJ.a[this.g.bJ.c] = null;
/*      */           }
/* 1360 */           else if (var3.a != var8 || this.b.h()) {
/*      */             
/* 1362 */             this.t.c.b();
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/* 1367 */       if (var2 && par1 == 1) {
/*      */         
/* 1369 */         ur var9 = this.g.bJ.g();
/*      */         
/* 1371 */         boolean result = !ForgeEventFactory.onPlayerInteract((qx)this.g, PlayerInteractEvent.Action.RIGHT_CLICK_AIR, 0, 0, 0, -1).isCanceled();
/* 1372 */         if (result && var9 != null && this.b.a((qx)this.g, (yc)this.e, var9))
/*      */         {
/* 1374 */           this.t.c.c();
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void k() {
/*      */     try {
/* 1387 */       this.Q = !this.Q;
/*      */       
/* 1389 */       if (this.Q) {
/*      */         
/* 1391 */         Display.setDisplayMode(Display.getDesktopDisplayMode());
/* 1392 */         this.c = Display.getDisplayMode().getWidth();
/* 1393 */         this.d = Display.getDisplayMode().getHeight();
/*      */         
/* 1395 */         if (this.c <= 0)
/*      */         {
/* 1397 */           this.c = 1;
/*      */         }
/*      */         
/* 1400 */         if (this.d <= 0)
/*      */         {
/* 1402 */           this.d = 1;
/*      */         }
/*      */       }
/*      */       else {
/*      */         
/* 1407 */         if (this.l != null) {
/*      */           
/* 1409 */           this.c = this.l.getWidth();
/* 1410 */           this.d = this.l.getHeight();
/*      */         }
/*      */         else {
/*      */           
/* 1414 */           this.c = this.X;
/* 1415 */           this.d = this.Y;
/*      */         } 
/*      */         
/* 1418 */         if (this.c <= 0)
/*      */         {
/* 1420 */           this.c = 1;
/*      */         }
/*      */         
/* 1423 */         if (this.d <= 0)
/*      */         {
/* 1425 */           this.d = 1;
/*      */         }
/*      */       } 
/*      */       
/* 1429 */       if (this.r != null)
/*      */       {
/* 1431 */         a(this.c, this.d);
/*      */       }
/*      */       
/* 1434 */       Display.setFullscreen(this.Q);
/* 1435 */       Display.setVSyncEnabled(this.y.v);
/* 1436 */       Display.update();
/*      */     }
/* 1438 */     catch (Exception var2) {
/*      */       
/* 1440 */       var2.printStackTrace();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void a(int par1, int par2) {
/* 1449 */     this.c = (par1 <= 0) ? 1 : par1;
/* 1450 */     this.d = (par2 <= 0) ? 1 : par2;
/*      */     
/* 1452 */     if (this.r != null) {
/*      */       
/* 1454 */       aum var3 = new aum(this.y, par1, par2);
/* 1455 */       int var4 = var3.a();
/* 1456 */       int var5 = var3.b();
/* 1457 */       this.r.a(this, var4, var5);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void l() {
/* 1466 */     FMLCommonHandler.instance().rescheduleTicks(Side.CLIENT);
/*      */     
/* 1468 */     if (this.ac > 0)
/*      */     {
/* 1470 */       this.ac--;
/*      */     }
/*      */     
/* 1473 */     FMLCommonHandler.instance().onPreClientTick();
/*      */     
/* 1475 */     this.I.a("stats");
/* 1476 */     this.E.e();
/* 1477 */     this.I.c("gui");
/*      */     
/* 1479 */     if (!this.n)
/*      */     {
/* 1481 */       this.v.a();
/*      */     }
/*      */     
/* 1484 */     this.I.c("pick");
/* 1485 */     this.t.a(1.0F);
/* 1486 */     this.I.c("gameMode");
/*      */     
/* 1488 */     if (!this.n && this.e != null)
/*      */     {
/* 1490 */       this.b.e();
/*      */     }
/*      */     
/* 1493 */     GL11.glBindTexture(3553, this.o.b("/terrain.png"));
/* 1494 */     this.I.c("textures");
/*      */     
/* 1496 */     if (!this.n)
/*      */     {
/* 1498 */       this.o.a();
/*      */     }
/*      */     
/* 1501 */     if (this.r == null && this.g != null) {
/*      */       
/* 1503 */       if (this.g.aU() <= 0)
/*      */       {
/* 1505 */         a((aul)null);
/*      */       }
/* 1507 */       else if (this.g.bw() && this.e != null)
/*      */       {
/* 1509 */         a((aul)new atu());
/*      */       }
/*      */     
/* 1512 */     } else if (this.r != null && this.r instanceof atu && !this.g.bw()) {
/*      */       
/* 1514 */       a((aul)null);
/*      */     } 
/*      */     
/* 1517 */     if (this.r != null)
/*      */     {
/* 1519 */       this.W = 10000;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1525 */     if (this.r != null) {
/*      */ 
/*      */       
/*      */       try {
/* 1529 */         this.r.m();
/*      */       }
/* 1531 */       catch (Throwable var6) {
/*      */         
/* 1533 */         a var2 = a.a(var6, "Updating screen events");
/* 1534 */         l var3 = var2.a("Affected screen");
/* 1535 */         var3.a("Screen name", (Callable)new ash(this));
/* 1536 */         throw new t(var2);
/*      */       } 
/*      */       
/* 1539 */       if (this.r != null) {
/*      */ 
/*      */         
/*      */         try {
/* 1543 */           this.r.m.a();
/*      */         }
/* 1545 */         catch (Throwable var5) {
/*      */           
/* 1547 */           a var2 = a.a(var5, "Ticking screen particles");
/* 1548 */           l var3 = var2.a("Affected screen");
/* 1549 */           var3.a("Screen name", (Callable)new asi(this));
/* 1550 */           throw new t(var2);
/*      */         } 
/*      */ 
/*      */         
/*      */         try {
/* 1555 */           this.r.c();
/*      */         }
/* 1557 */         catch (Throwable var4) {
/*      */           
/* 1559 */           a var2 = a.a(var4, "Ticking screen");
/* 1560 */           l var3 = var2.a("Affected screen");
/* 1561 */           var3.a("Screen name", (Callable)new asj(this));
/* 1562 */           throw new t(var2);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 1567 */     if (this.r == null || this.r.k) {
/*      */       
/* 1569 */       this.I.c("mouse");
/*      */       
/* 1571 */       while (Mouse.next()) {
/*      */         
/* 1573 */         arv.a(Mouse.getEventButton() - 100, Mouse.getEventButtonState());
/*      */         
/* 1575 */         if (Mouse.getEventButtonState())
/*      */         {
/* 1577 */           arv.a(Mouse.getEventButton() - 100);
/*      */         }
/*      */         
/* 1580 */         long var1 = F() - this.H;
/*      */         
/* 1582 */         if (var1 <= 200L) {
/*      */           
/* 1584 */           int var10 = Mouse.getEventDWheel();
/*      */           
/* 1586 */           if (var10 != 0) {
/*      */             
/* 1588 */             this.g.bJ.c(var10);
/*      */             
/* 1590 */             if (this.y.aa) {
/*      */               
/* 1592 */               if (var10 > 0)
/*      */               {
/* 1594 */                 var10 = 1;
/*      */               }
/*      */               
/* 1597 */               if (var10 < 0)
/*      */               {
/* 1599 */                 var10 = -1;
/*      */               }
/*      */               
/* 1602 */               this.y.ad += var10 * 0.25F;
/*      */             } 
/*      */           } 
/*      */           
/* 1606 */           if (this.r == null) {
/*      */             
/* 1608 */             if (!this.G && Mouse.getEventButtonState())
/*      */             {
/* 1610 */               h(); } 
/*      */             continue;
/*      */           } 
/* 1613 */           if (this.r != null)
/*      */           {
/* 1615 */             this.r.d();
/*      */           }
/*      */         } 
/*      */       } 
/*      */       
/* 1620 */       if (this.W > 0)
/*      */       {
/* 1622 */         this.W--;
/*      */       }
/*      */       
/* 1625 */       this.I.c("keyboard");
/*      */ 
/*      */       
/* 1628 */       while (Keyboard.next()) {
/*      */         
/* 1630 */         arv.a(Keyboard.getEventKey(), Keyboard.getEventKeyState());
/*      */         
/* 1632 */         if (Keyboard.getEventKeyState())
/*      */         {
/* 1634 */           arv.a(Keyboard.getEventKey());
/*      */         }
/*      */         
/* 1637 */         if (this.am > 0L) {
/*      */           
/* 1639 */           if (F() - this.am >= 6000L)
/*      */           {
/* 1641 */             throw new t(new a("Manually triggered debug crash", new Throwable()));
/*      */           }
/*      */           
/* 1644 */           if (!Keyboard.isKeyDown(46) || !Keyboard.isKeyDown(61))
/*      */           {
/* 1646 */             this.am = -1L;
/*      */           }
/*      */         }
/* 1649 */         else if (Keyboard.isKeyDown(46) && Keyboard.isKeyDown(61)) {
/*      */           
/* 1651 */           this.am = F();
/*      */         } 
/*      */         
/* 1654 */         if (Keyboard.getEventKeyState()) {
/*      */           
/* 1656 */           if (Keyboard.getEventKey() == 87) {
/*      */             
/* 1658 */             k();
/*      */             
/*      */             continue;
/*      */           } 
/* 1662 */           if (this.r != null) {
/*      */             
/* 1664 */             this.r.n();
/*      */           }
/*      */           else {
/*      */             
/* 1668 */             if (Keyboard.getEventKey() == 1)
/*      */             {
/* 1670 */               j();
/*      */             }
/*      */             
/* 1673 */             if (Keyboard.getEventKey() == 31 && Keyboard.isKeyDown(61))
/*      */             {
/* 1675 */               M();
/*      */             }
/*      */             
/* 1678 */             if (Keyboard.getEventKey() == 20 && Keyboard.isKeyDown(61))
/*      */             {
/* 1680 */               this.o.b();
/*      */             }
/*      */             
/* 1683 */             if (Keyboard.getEventKey() == 33 && Keyboard.isKeyDown(61)) {
/*      */               
/* 1685 */               int i = Keyboard.isKeyDown(42) | Keyboard.isKeyDown(54);
/* 1686 */               this.y.a(asv.g, (i != 0) ? -1 : 1);
/*      */             } 
/*      */             
/* 1689 */             if (Keyboard.getEventKey() == 30 && Keyboard.isKeyDown(61))
/*      */             {
/* 1691 */               this.f.a();
/*      */             }
/*      */             
/* 1694 */             if (Keyboard.getEventKey() == 35 && Keyboard.isKeyDown(61)) {
/*      */               
/* 1696 */               this.y.x = !this.y.x;
/* 1697 */               this.y.b();
/*      */             } 
/*      */             
/* 1700 */             if (Keyboard.getEventKey() == 48 && Keyboard.isKeyDown(61))
/*      */             {
/* 1702 */               bbu.o = !bbu.o;
/*      */             }
/*      */             
/* 1705 */             if (Keyboard.getEventKey() == 25 && Keyboard.isKeyDown(61)) {
/*      */               
/* 1707 */               this.y.y = !this.y.y;
/* 1708 */               this.y.b();
/*      */             } 
/*      */             
/* 1711 */             if (Keyboard.getEventKey() == 59)
/*      */             {
/* 1713 */               this.y.V = !this.y.V;
/*      */             }
/*      */             
/* 1716 */             if (Keyboard.getEventKey() == 61) {
/*      */               
/* 1718 */               this.y.X = !this.y.X;
/* 1719 */               this.y.Y = aul.p();
/*      */             } 
/*      */             
/* 1722 */             if (Keyboard.getEventKey() == 63) {
/*      */               
/* 1724 */               this.y.W++;
/*      */               
/* 1726 */               if (this.y.W > 2)
/*      */               {
/* 1728 */                 this.y.W = 0;
/*      */               }
/*      */             } 
/*      */             
/* 1732 */             if (Keyboard.getEventKey() == 66)
/*      */             {
/* 1734 */               this.y.ab = !this.y.ab;
/*      */             }
/*      */           } 
/*      */           
/*      */           int var9;
/*      */           
/* 1740 */           for (var9 = 0; var9 < 9; var9++) {
/*      */             
/* 1742 */             if (Keyboard.getEventKey() == 2 + var9)
/*      */             {
/* 1744 */               this.g.bJ.c = var9;
/*      */             }
/*      */           } 
/*      */           
/* 1748 */           if (this.y.X && this.y.Y) {
/*      */             
/* 1750 */             if (Keyboard.getEventKey() == 11)
/*      */             {
/* 1752 */               b(0);
/*      */             }
/*      */             
/* 1755 */             for (var9 = 0; var9 < 9; var9++) {
/*      */               
/* 1757 */               if (Keyboard.getEventKey() == 2 + var9)
/*      */               {
/* 1759 */                 b(var9 + 1);
/*      */               }
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 1767 */       boolean var8 = (this.y.n != 2);
/*      */       
/* 1769 */       while (this.y.J.c())
/*      */       {
/* 1771 */         a((aul)new avz((qx)this.g));
/*      */       }
/*      */       
/* 1774 */       while (this.y.K.c())
/*      */       {
/* 1776 */         this.g.f(aul.o());
/*      */       }
/*      */       
/* 1779 */       while (this.y.L.c() && var8)
/*      */       {
/* 1781 */         a((aul)new ate());
/*      */       }
/*      */       
/* 1784 */       if (this.r == null && this.y.R.c() && var8)
/*      */       {
/* 1786 */         a((aul)new ate("/"));
/*      */       }
/*      */       
/* 1789 */       if (this.g.bM()) {
/*      */         
/* 1791 */         if (!this.y.O.e)
/*      */         {
/* 1793 */           this.b.c((qx)this.g);
/*      */         }
/*      */ 
/*      */ 
/*      */         
/*      */         do {
/*      */         
/* 1800 */         } while (this.y.N.c());
/*      */         
/* 1802 */         while (this.y.O.c());
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1809 */         while (this.y.Q.c());
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*      */       else {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1821 */         while (this.y.N.c())
/*      */         {
/* 1823 */           c(0);
/*      */         }
/*      */         
/* 1826 */         while (this.y.O.c())
/*      */         {
/* 1828 */           c(1);
/*      */         }
/*      */         
/* 1831 */         while (this.y.Q.c())
/*      */         {
/* 1833 */           N();
/*      */         }
/*      */       } 
/*      */       
/* 1837 */       if (this.y.O.e && this.ac == 0 && !this.g.bM())
/*      */       {
/* 1839 */         c(1);
/*      */       }
/*      */       
/* 1842 */       a(0, (this.r == null && this.y.N.e && this.G));
/*      */     } 
/*      */     
/* 1845 */     if (this.e != null) {
/*      */       
/* 1847 */       if (this.g != null) {
/*      */         
/* 1849 */         this.ai++;
/*      */         
/* 1851 */         if (this.ai == 30) {
/*      */           
/* 1853 */           this.ai = 0;
/* 1854 */           this.e.h((lq)this.g);
/*      */         } 
/*      */       } 
/*      */       
/* 1858 */       this.I.c("gameRenderer");
/*      */       
/* 1860 */       if (!this.n)
/*      */       {
/* 1862 */         this.t.a();
/*      */       }
/*      */       
/* 1865 */       this.I.c("levelRenderer");
/*      */       
/* 1867 */       if (!this.n)
/*      */       {
/* 1869 */         this.f.e();
/*      */       }
/*      */       
/* 1872 */       this.I.c("level");
/*      */       
/* 1874 */       if (!this.n) {
/*      */         
/* 1876 */         if (this.e.q > 0)
/*      */         {
/* 1878 */           this.e.q--;
/*      */         }
/*      */         
/* 1881 */         this.e.h();
/*      */       } 
/*      */       
/* 1884 */       if (!this.n) {
/*      */         
/* 1886 */         this.e.a((this.e.s > 0), true);
/*      */ 
/*      */         
/*      */         try {
/* 1890 */           this.e.b();
/*      */         }
/* 1892 */         catch (Throwable var7) {
/*      */           
/* 1894 */           a var2 = a.a(var7, "Exception in world tick");
/*      */           
/* 1896 */           if (this.e == null) {
/*      */             
/* 1898 */             l var3 = var2.a("Affected level");
/* 1899 */             var3.a("Problem", "Level is null!");
/*      */           }
/*      */           else {
/*      */             
/* 1903 */             this.e.a(var2);
/*      */           } 
/*      */           
/* 1906 */           throw new t(var2);
/*      */         } 
/*      */       } 
/*      */       
/* 1910 */       this.I.c("animateTick");
/*      */       
/* 1912 */       if (!this.n && this.e != null)
/*      */       {
/* 1914 */         this.e.G(ke.c(this.g.t), ke.c(this.g.u), ke.c(this.g.v));
/*      */       }
/*      */       
/* 1917 */       this.I.c("particles");
/*      */       
/* 1919 */       if (!this.n)
/*      */       {
/* 1921 */         this.i.a();
/*      */       }
/*      */     }
/* 1924 */     else if (this.ak != null) {
/*      */       
/* 1926 */       this.I.c("pendingConnection");
/* 1927 */       this.ak.b();
/*      */     } 
/*      */     
/* 1930 */     FMLCommonHandler.instance().onPostClientTick();
/*      */     
/* 1932 */     this.I.b();
/* 1933 */     this.H = F();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void M() {
/* 1941 */     System.out.println("FORCING RELOAD!");
/*      */     
/* 1943 */     if (this.A != null)
/*      */     {
/* 1945 */       this.A.d();
/*      */     }
/*      */     
/* 1948 */     this.A = new bev();
/* 1949 */     this.A.a(this.y);
/* 1950 */     this.V.a();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(String par1Str, String par2Str, yk par3WorldSettings) {
/* 1958 */     a((ayp)null);
/* 1959 */     System.gc();
/* 1960 */     aih var4 = this.aa.a(par1Str, false);
/* 1961 */     ahx var5 = var4.d();
/*      */     
/* 1963 */     if (var5 == null && par3WorldSettings != null) {
/*      */       
/* 1965 */       this.E.a(jq.g, 1);
/* 1966 */       var5 = new ahx(par3WorldSettings, par1Str);
/* 1967 */       var4.a(var5);
/*      */     } 
/*      */     
/* 1970 */     if (par3WorldSettings == null)
/*      */     {
/* 1972 */       par3WorldSettings = new yk(var5);
/*      */     }
/*      */     
/* 1975 */     this.E.a(jq.f, 1);
/*      */     
/* 1977 */     GameData.initializeServerGate(2);
/*      */     
/* 1979 */     this.Z = new bdz(this, par1Str, par2Str, par3WorldSettings);
/* 1980 */     this.Z.t();
/*      */     
/* 1982 */     MapDifference idDifferences = GameData.gateWorldLoadingForValidation();
/* 1983 */     if (idDifferences != null) {
/*      */       
/* 1985 */       FMLClientHandler.instance().warnIDMismatch(idDifferences, true);
/*      */     }
/*      */     else {
/*      */       
/* 1989 */       GameData.releaseGate(true);
/* 1990 */       continueWorldLoading();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void continueWorldLoading() {
/* 1997 */     this.al = true;
/* 1998 */     this.s.a(bm.a("menu.loadingLevel"));
/*      */     
/* 2000 */     while (!this.Z.af()) {
/*      */       
/* 2002 */       String var6 = this.Z.d();
/*      */       
/* 2004 */       if (var6 != null) {
/*      */         
/* 2006 */         this.s.c(bm.a(var6));
/*      */       }
/*      */       else {
/*      */         
/* 2010 */         this.s.c("");
/*      */       } 
/*      */ 
/*      */       
/*      */       try {
/* 2015 */         Thread.sleep(200L);
/*      */       }
/* 2017 */       catch (InterruptedException var9) {}
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2023 */     a((aul)null);
/*      */ 
/*      */     
/*      */     try {
/* 2027 */       ayh var10 = new ayh(this, this.Z);
/* 2028 */       this.ak = var10.f();
/*      */     }
/* 2030 */     catch (IOException var8) {
/*      */       
/* 2032 */       c(b(new a("Connecting to integrated server", var8)));
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ayp par1WorldClient) {
/* 2041 */     a(par1WorldClient, "");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ayp par1WorldClient, String par2Str) {
/* 2049 */     this.E.d();
/*      */     
/* 2051 */     if (par1WorldClient == null) {
/*      */       
/* 2053 */       ayh var3 = r();
/*      */       
/* 2055 */       if (var3 != null)
/*      */       {
/* 2057 */         var3.c();
/*      */       }
/*      */       
/* 2060 */       if (this.ak != null)
/*      */       {
/* 2062 */         this.ak.f();
/*      */       }
/*      */       
/* 2065 */       if (this.Z != null) {
/*      */         
/* 2067 */         this.Z.n();
/* 2068 */         if (this.s != null)
/*      */         {
/* 2070 */           this.s.c("Shutting down internal server...");
/*      */         }
/* 2072 */         while (!this.Z.ac()) {
/*      */ 
/*      */           
/*      */           try {
/* 2076 */             Thread.sleep(10L);
/*      */           }
/* 2078 */           catch (InterruptedException ie) {}
/*      */         } 
/*      */       } 
/*      */       
/* 2082 */       this.Z = null;
/*      */     } 
/*      */     
/* 2085 */     this.h = null;
/* 2086 */     this.ak = null;
/*      */     
/* 2088 */     if (this.s != null) {
/*      */       
/* 2090 */       this.s.b(par2Str);
/* 2091 */       this.s.c("");
/*      */     } 
/*      */     
/* 2094 */     if (par1WorldClient == null && this.e != null) {
/*      */       
/* 2096 */       if (this.C.a())
/*      */       {
/* 2098 */         this.C.b();
/*      */       }
/*      */       
/* 2101 */       a((ayw)null);
/* 2102 */       this.al = false;
/*      */     } 
/*      */     
/* 2105 */     this.A.a((String)null, 0.0F, 0.0F, 0.0F);
/* 2106 */     this.A.d();
/* 2107 */     this.e = par1WorldClient;
/*      */     
/* 2109 */     if (par1WorldClient != null) {
/*      */       
/* 2111 */       if (this.f != null)
/*      */       {
/* 2113 */         this.f.a(par1WorldClient);
/*      */       }
/*      */       
/* 2116 */       if (this.i != null)
/*      */       {
/* 2118 */         this.i.a((yc)par1WorldClient);
/*      */       }
/*      */       
/* 2121 */       if (this.g == null) {
/*      */         
/* 2123 */         this.g = this.b.a((yc)par1WorldClient);
/* 2124 */         this.b.b((qx)this.g);
/*      */       } 
/*      */       
/* 2127 */       this.g.w();
/* 2128 */       par1WorldClient.d((lq)this.g);
/* 2129 */       this.g.b = (bae)new baf(this.y);
/* 2130 */       this.b.a((qx)this.g);
/* 2131 */       this.h = (md)this.g;
/*      */     }
/*      */     else {
/*      */       
/* 2135 */       this.aa.d();
/* 2136 */       this.g = null;
/*      */     } 
/*      */     
/* 2139 */     System.gc();
/* 2140 */     this.H = 0L;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(String par1Str, File par2File) {
/* 2148 */     int var3 = par1Str.indexOf("/");
/* 2149 */     String var4 = par1Str.substring(0, var3);
/* 2150 */     par1Str = par1Str.substring(var3 + 1);
/*      */     
/* 2152 */     if (var4.equalsIgnoreCase("sound3")) {
/*      */       
/* 2154 */       this.A.a(par1Str, par2File);
/*      */     }
/* 2156 */     else if (var4.equalsIgnoreCase("streaming")) {
/*      */       
/* 2158 */       this.A.b(par1Str, par2File);
/*      */     }
/* 2160 */     else if (var4.equalsIgnoreCase("music") || var4.equalsIgnoreCase("newmusic")) {
/*      */       
/* 2162 */       this.A.c(par1Str, par2File);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String m() {
/* 2171 */     return this.f.c();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String n() {
/* 2179 */     return this.f.d();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String o() {
/* 2187 */     return this.e.w();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String p() {
/* 2195 */     return "P: " + this.i.b() + ". T: " + this.e.v();
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(int par1) {
/* 2200 */     this.e.f();
/* 2201 */     this.e.a();
/* 2202 */     int var2 = 0;
/*      */     
/* 2204 */     if (this.g != null) {
/*      */       
/* 2206 */       var2 = this.g.k;
/* 2207 */       this.e.e((lq)this.g);
/*      */     } 
/*      */     
/* 2210 */     this.h = null;
/* 2211 */     this.g = this.b.a((yc)this.e);
/* 2212 */     this.g.aq = par1;
/* 2213 */     this.h = (md)this.g;
/* 2214 */     this.g.w();
/* 2215 */     this.e.d((lq)this.g);
/* 2216 */     this.b.b((qx)this.g);
/* 2217 */     this.g.b = (bae)new baf(this.y);
/* 2218 */     this.g.k = var2;
/* 2219 */     this.b.a((qx)this.g);
/*      */     
/* 2221 */     if (this.r instanceof atk)
/*      */     {
/* 2223 */       a((aul)null);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   void a(boolean par1) {
/* 2232 */     this.aj = par1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean q() {
/* 2240 */     return this.aj;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ayh r() {
/* 2248 */     return (this.g != null) ? this.g.a : null;
/*      */   }
/*      */ 
/*      */   
/*      */   public static void main(String[] par0ArrayOfStr) {
/* 2253 */     FMLRelauncher.handleClientRelaunch(new ArgsWrapper(par0ArrayOfStr));
/*      */   }
/*      */ 
/*      */   
/*      */   public static void fmlReentry(ArgsWrapper wrapper) {
/* 2258 */     String[] par0ArrayOfStr = wrapper.args;
/* 2259 */     HashMap<Object, Object> var1 = new HashMap<Object, Object>();
/* 2260 */     boolean var2 = false;
/* 2261 */     boolean var3 = true;
/* 2262 */     boolean var4 = false;
/* 2263 */     String var5 = "Player" + (F() % 1000L);
/*      */     
/* 2265 */     if (par0ArrayOfStr.length > 0)
/*      */     {
/* 2267 */       var5 = par0ArrayOfStr[0];
/*      */     }
/*      */     
/* 2270 */     String var6 = "-";
/*      */     
/* 2272 */     if (par0ArrayOfStr.length > 1)
/*      */     {
/* 2274 */       var6 = par0ArrayOfStr[1];
/*      */     }
/*      */     
/* 2277 */     for (int var7 = 2; var7 < par0ArrayOfStr.length; var7++) {
/*      */       
/* 2279 */       String var8 = par0ArrayOfStr[var7];
/* 2280 */       String var9 = (var7 == par0ArrayOfStr.length - 1) ? null : par0ArrayOfStr[var7 + 1];
/* 2281 */       boolean var10 = false;
/*      */       
/* 2283 */       if (!var8.equals("-demo") && !var8.equals("--demo")) {
/*      */         
/* 2285 */         if (var8.equals("--applet"))
/*      */         {
/* 2287 */           var3 = false;
/*      */         }
/* 2289 */         else if (var8.equals("--password") && var9 != null)
/*      */         {
/* 2291 */           String[] var11 = jv.a(var5, var9);
/*      */           
/* 2293 */           if (var11 != null) {
/*      */             
/* 2295 */             var5 = var11[0];
/* 2296 */             var6 = var11[1];
/* 2297 */             System.out.println("Logged in insecurely as " + var5 + " - sessionId is " + var6);
/*      */           }
/*      */           else {
/*      */             
/* 2301 */             System.out.println("Could not log in as " + var5 + " with given password");
/*      */           } 
/*      */           
/* 2304 */           var10 = true;
/*      */         }
/*      */       
/*      */       } else {
/*      */         
/* 2309 */         var2 = true;
/*      */       } 
/*      */       
/* 2312 */       if (var10)
/*      */       {
/* 2314 */         var7++;
/*      */       }
/*      */     } 
/*      */     
/* 2318 */     var1.put("demo", "" + var2);
/* 2319 */     var1.put("stand-alone", "" + var3);
/* 2320 */     var1.put("username", var5);
/* 2321 */     var1.put("fullscreen", "" + var4);
/* 2322 */     var1.put("sessionid", var6);
/* 2323 */     Frame var13 = new Frame();
/* 2324 */     var13.setTitle("Minecraft");
/* 2325 */     var13.setBackground(Color.BLACK);
/* 2326 */     JPanel var12 = new JPanel();
/* 2327 */     var13.setLayout(new BorderLayout());
/* 2328 */     var12.setPreferredSize(new Dimension(854, 480));
/* 2329 */     var13.add(var12, "Center");
/* 2330 */     var13.pack();
/* 2331 */     var13.setLocationRelativeTo((Component)null);
/* 2332 */     var13.setVisible(true);
/* 2333 */     var13.addWindowListener((WindowListener)new ask());
/* 2334 */     asf var14 = new asf(var1);
/* 2335 */     MinecraftApplet var15 = new MinecraftApplet();
/* 2336 */     var15.setStub((AppletStub)var14);
/* 2337 */     var14.setLayout(new BorderLayout());
/* 2338 */     var14.add((Component)var15, "Center");
/* 2339 */     var14.validate();
/* 2340 */     var13.removeAll();
/* 2341 */     var13.setLayout(new BorderLayout());
/* 2342 */     var13.add((Component)var14, "Center");
/* 2343 */     var13.validate();
/* 2344 */     var15.init();
/* 2345 */     var15.start();
/* 2346 */     Runtime.getRuntime().addShutdownHook((Thread)new asl());
/*      */   }
/*      */ 
/*      */   
/*      */   public static boolean s() {
/* 2351 */     return (P == null || !P.y.V);
/*      */   }
/*      */ 
/*      */   
/*      */   public static boolean t() {
/* 2356 */     return (P != null && P.y.j);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean u() {
/* 2364 */     return (P != null && P.y.k);
/*      */   }
/*      */ 
/*      */   
/*      */   public static boolean v() {
/* 2369 */     return (P != null && P.y.X);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean c(String par1Str) {
/* 2378 */     return !par1Str.startsWith("/") ? false : false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void N() {
/* 2386 */     if (this.x != null) {
/*      */       
/* 2388 */       boolean var1 = this.g.cd.d;
/*      */ 
/*      */       
/* 2391 */       if (!ForgeHooks.onPickBlock(this.x, (qx)this.g, (yc)this.e)) {
/*      */         return;
/*      */       }
/*      */ 
/*      */       
/* 2396 */       if (var1) {
/*      */         
/* 2398 */         int var5 = this.g.bK.c.size() - 9 + this.g.bJ.c;
/* 2399 */         this.b.a(this.g.bJ.a(this.g.bJ.c), var5);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public a b(a par1CrashReport) {
/* 2409 */     par1CrashReport.g().a("LWJGL", (Callable)new asm(this));
/* 2410 */     par1CrashReport.g().a("OpenGL", (Callable)new asn(this));
/* 2411 */     par1CrashReport.g().a("Is Modded", (Callable)new arz(this));
/* 2412 */     par1CrashReport.g().a("Type", (Callable)new asa(this));
/* 2413 */     par1CrashReport.g().a("Texture Pack", (Callable)new asb(this));
/* 2414 */     par1CrashReport.g().a("Profiler Position", (Callable)new asc(this));
/* 2415 */     par1CrashReport.g().a("Vec3 Pool Size", (Callable)new asd(this));
/*      */     
/* 2417 */     if (this.e != null)
/*      */     {
/* 2419 */       this.e.a(par1CrashReport);
/*      */     }
/*      */     
/* 2422 */     return par1CrashReport;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Minecraft x() {
/* 2430 */     return P;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void y() {
/* 2439 */     this.ad = true;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(le par1PlayerUsageSnooper) {
/* 2444 */     par1PlayerUsageSnooper.a("fps", Integer.valueOf(ab));
/* 2445 */     par1PlayerUsageSnooper.a("texpack_name", this.C.e().c());
/* 2446 */     par1PlayerUsageSnooper.a("texpack_resolution", Integer.valueOf(this.C.e().f()));
/* 2447 */     par1PlayerUsageSnooper.a("vsync_enabled", Boolean.valueOf(this.y.v));
/* 2448 */     par1PlayerUsageSnooper.a("display_frequency", Integer.valueOf(Display.getDisplayMode().getFrequency()));
/* 2449 */     par1PlayerUsageSnooper.a("display_type", this.Q ? "fullscreen" : "windowed");
/*      */     
/* 2451 */     if (this.Z != null && this.Z.aj() != null)
/*      */     {
/* 2453 */       par1PlayerUsageSnooper.a("snooper_partner", this.Z.aj().f());
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(le par1PlayerUsageSnooper) {
/* 2459 */     par1PlayerUsageSnooper.a("opengl_version", GL11.glGetString(7938));
/* 2460 */     par1PlayerUsageSnooper.a("opengl_vendor", GL11.glGetString(7936));
/* 2461 */     par1PlayerUsageSnooper.a("client_brand", ClientBrandRetriever.getClientModName());
/* 2462 */     par1PlayerUsageSnooper.a("applet", Boolean.valueOf(this.m));
/* 2463 */     ContextCapabilities var2 = GLContext.getCapabilities();
/* 2464 */     par1PlayerUsageSnooper.a("gl_caps[ARB_multitexture]", Boolean.valueOf(var2.GL_ARB_multitexture));
/* 2465 */     par1PlayerUsageSnooper.a("gl_caps[ARB_multisample]", Boolean.valueOf(var2.GL_ARB_multisample));
/* 2466 */     par1PlayerUsageSnooper.a("gl_caps[ARB_texture_cube_map]", Boolean.valueOf(var2.GL_ARB_texture_cube_map));
/* 2467 */     par1PlayerUsageSnooper.a("gl_caps[ARB_vertex_blend]", Boolean.valueOf(var2.GL_ARB_vertex_blend));
/* 2468 */     par1PlayerUsageSnooper.a("gl_caps[ARB_matrix_palette]", Boolean.valueOf(var2.GL_ARB_matrix_palette));
/* 2469 */     par1PlayerUsageSnooper.a("gl_caps[ARB_vertex_program]", Boolean.valueOf(var2.GL_ARB_vertex_program));
/* 2470 */     par1PlayerUsageSnooper.a("gl_caps[ARB_vertex_shader]", Boolean.valueOf(var2.GL_ARB_vertex_shader));
/* 2471 */     par1PlayerUsageSnooper.a("gl_caps[ARB_fragment_program]", Boolean.valueOf(var2.GL_ARB_fragment_program));
/* 2472 */     par1PlayerUsageSnooper.a("gl_caps[ARB_fragment_shader]", Boolean.valueOf(var2.GL_ARB_fragment_shader));
/* 2473 */     par1PlayerUsageSnooper.a("gl_caps[ARB_shader_objects]", Boolean.valueOf(var2.GL_ARB_shader_objects));
/* 2474 */     par1PlayerUsageSnooper.a("gl_caps[ARB_vertex_buffer_object]", Boolean.valueOf(var2.GL_ARB_vertex_buffer_object));
/* 2475 */     par1PlayerUsageSnooper.a("gl_caps[ARB_framebuffer_object]", Boolean.valueOf(var2.GL_ARB_framebuffer_object));
/* 2476 */     par1PlayerUsageSnooper.a("gl_caps[ARB_pixel_buffer_object]", Boolean.valueOf(var2.GL_ARB_pixel_buffer_object));
/* 2477 */     par1PlayerUsageSnooper.a("gl_caps[ARB_uniform_buffer_object]", Boolean.valueOf(var2.GL_ARB_uniform_buffer_object));
/* 2478 */     par1PlayerUsageSnooper.a("gl_caps[ARB_texture_non_power_of_two]", Boolean.valueOf(var2.GL_ARB_texture_non_power_of_two));
/* 2479 */     par1PlayerUsageSnooper.a("gl_caps[gl_max_vertex_uniforms]", Integer.valueOf(GL11.glGetInteger(35658)));
/* 2480 */     par1PlayerUsageSnooper.a("gl_caps[gl_max_fragment_uniforms]", Integer.valueOf(GL11.glGetInteger(35657)));
/* 2481 */     par1PlayerUsageSnooper.a("gl_max_texture_size", Integer.valueOf(O()));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static int O() {
/* 2489 */     for (int var0 = 16384; var0 > 0; var0 >>= 1) {
/*      */       
/* 2491 */       GL11.glTexImage2D(32868, 0, 6408, var0, var0, 0, 6408, 5121, (ByteBuffer)null);
/* 2492 */       int var1 = GL11.glGetTexLevelParameteri(32868, 0, 4096);
/*      */       
/* 2494 */       if (var1 != 0)
/*      */       {
/* 2496 */         return var0;
/*      */       }
/*      */     } 
/*      */     
/* 2500 */     return -1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean R() {
/* 2508 */     return this.y.t;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ayw par1ServerData) {
/* 2516 */     this.O = par1ServerData;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ayw z() {
/* 2524 */     return this.O;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean A() {
/* 2529 */     return this.al;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean B() {
/* 2537 */     return (this.al && this.Z != null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public bdz C() {
/* 2545 */     return this.Z;
/*      */   }
/*      */ 
/*      */   
/*      */   public static void D() {
/* 2550 */     if (P != null) {
/*      */       
/* 2552 */       bdz var0 = P.C();
/*      */       
/* 2554 */       if (var0 != null)
/*      */       {
/* 2556 */         var0.k();
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public le E() {
/* 2566 */     return this.U;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static long F() {
/* 2574 */     return Sys.getTime() * 1000L / Sys.getTimerResolution();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean G() {
/* 2582 */     return this.Q;
/*      */   }
/*      */ }


/* Location:              /home/luigi/Documents/JAR.jar!/net/minecraft/client/Minecraft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */