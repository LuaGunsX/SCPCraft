/*      */ import SCPCraft.entities.SCPEntityElectricityFX;
/*      */ import SCPCraft.particles.SCP080FX;
/*      */ import SCPCraft.particles.SCPCryFX;
/*      */ import SCPCraft.particles.SCPSmokeFX;
/*      */ import SCPCraft.particles.SCPSmokeFX2;
/*      */ import SCPCraft.particles.SCPSmokeFX3;
/*      */ import SCPCraft.particles.SCPSmokeFX4;
/*      */ import SCPCraft.particles.SCPSmokeFX5;
/*      */ import SCPCraft.particles.SCPSmokeFX6;
/*      */ import cpw.mods.fml.relauncher.Side;
/*      */ import cpw.mods.fml.relauncher.SideOnly;
/*      */ import java.nio.IntBuffer;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Arrays;
/*      */ import java.util.Collections;
/*      */ import java.util.Comparator;
/*      */ import java.util.HashMap;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Random;
/*      */ import java.util.concurrent.Callable;
/*      */ import net.minecraft.client.Minecraft;
/*      */ import net.minecraftforge.client.IRenderHandler;
/*      */ import org.lwjgl.opengl.ARBOcclusionQuery;
/*      */ import org.lwjgl.opengl.GL11;
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
/*      */ @SideOnly(Side.CLIENT)
/*      */ public class bav
/*      */   implements yi
/*      */ {
/*   81 */   public List a = new ArrayList();
/*      */   
/*      */   public ayp h;
/*      */   
/*      */   public final bba i;
/*   86 */   private List j = new ArrayList();
/*      */ 
/*      */   
/*      */   private baj[] k;
/*      */ 
/*      */   
/*      */   private baj[] l;
/*      */ 
/*      */   
/*      */   private int m;
/*      */   
/*      */   private int n;
/*      */   
/*      */   private int o;
/*      */   
/*      */   private int p;
/*      */   
/*      */   public Minecraft q;
/*      */   
/*      */   public bbb r;
/*      */   
/*      */   private IntBuffer s;
/*      */   
/*      */   private boolean t = false;
/*      */   
/*  111 */   private int u = 0;
/*      */ 
/*      */ 
/*      */   
/*      */   private int v;
/*      */ 
/*      */ 
/*      */   
/*      */   private int w;
/*      */ 
/*      */ 
/*      */   
/*      */   private int x;
/*      */ 
/*      */   
/*      */   private int y;
/*      */ 
/*      */   
/*      */   private int z;
/*      */ 
/*      */   
/*      */   private int A;
/*      */ 
/*      */   
/*      */   private int B;
/*      */ 
/*      */   
/*      */   private int C;
/*      */ 
/*      */   
/*      */   private int D;
/*      */ 
/*      */   
/*  144 */   public Map E = new HashMap<Object, Object>();
/*  145 */   private int F = -1;
/*      */ 
/*      */   
/*  148 */   private int G = 2;
/*      */ 
/*      */   
/*      */   private int H;
/*      */ 
/*      */   
/*      */   private int I;
/*      */ 
/*      */   
/*      */   private int J;
/*      */ 
/*      */   
/*  160 */   int[] b = new int[50000];
/*      */ 
/*      */   
/*  163 */   IntBuffer c = arx.f(64);
/*      */ 
/*      */ 
/*      */   
/*      */   private int K;
/*      */ 
/*      */ 
/*      */   
/*      */   private int L;
/*      */ 
/*      */   
/*      */   private int M;
/*      */ 
/*      */   
/*      */   private int N;
/*      */ 
/*      */   
/*      */   private int O;
/*      */ 
/*      */   
/*      */   private int P;
/*      */ 
/*      */   
/*      */   private int Q;
/*      */ 
/*      */   
/*  189 */   private List R = new ArrayList();
/*      */ 
/*      */   
/*  192 */   private bay[] S = new bay[] { new bay(), new bay(), new bay(), new bay() };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  198 */   double d = -9999.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  204 */   double e = -9999.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  210 */   double f = -9999.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  215 */   int g = 0;
/*      */ 
/*      */   
/*      */   public bav(Minecraft par1Minecraft, bba par2RenderEngine) {
/*  219 */     this.q = par1Minecraft;
/*  220 */     this.i = par2RenderEngine;
/*  221 */     byte var3 = 34;
/*  222 */     byte var4 = 32;
/*  223 */     this.p = arx.a(var3 * var3 * var4 * 3);
/*  224 */     this.t = ass.a();
/*      */     
/*  226 */     if (this.t) {
/*      */       
/*  228 */       this.c.clear();
/*  229 */       this.s = arx.f(var3 * var3 * var4);
/*  230 */       this.s.clear();
/*  231 */       this.s.position(0);
/*  232 */       this.s.limit(var3 * var3 * var4);
/*  233 */       ARBOcclusionQuery.glGenQueriesARB(this.s);
/*      */     } 
/*      */     
/*  236 */     this.v = arx.a(3);
/*  237 */     GL11.glPushMatrix();
/*  238 */     GL11.glNewList(this.v, 4864);
/*  239 */     g();
/*  240 */     GL11.glEndList();
/*  241 */     GL11.glPopMatrix();
/*  242 */     baz var5 = baz.a;
/*  243 */     this.w = this.v + 1;
/*  244 */     GL11.glNewList(this.w, 4864);
/*  245 */     byte var7 = 64;
/*  246 */     int var8 = 256 / var7 + 2;
/*  247 */     float var6 = 16.0F;
/*      */     
/*      */     int var9;
/*      */     
/*  251 */     for (var9 = -var7 * var8; var9 <= var7 * var8; var9 += var7) {
/*      */       int var10;
/*  253 */       for (var10 = -var7 * var8; var10 <= var7 * var8; var10 += var7) {
/*      */         
/*  255 */         var5.b();
/*  256 */         var5.a((var9 + 0), var6, (var10 + 0));
/*  257 */         var5.a((var9 + var7), var6, (var10 + 0));
/*  258 */         var5.a((var9 + var7), var6, (var10 + var7));
/*  259 */         var5.a((var9 + 0), var6, (var10 + var7));
/*  260 */         var5.a();
/*      */       } 
/*      */     } 
/*      */     
/*  264 */     GL11.glEndList();
/*  265 */     this.x = this.v + 2;
/*  266 */     GL11.glNewList(this.x, 4864);
/*  267 */     var6 = -16.0F;
/*  268 */     var5.b();
/*      */     
/*  270 */     for (var9 = -var7 * var8; var9 <= var7 * var8; var9 += var7) {
/*      */       int var10;
/*  272 */       for (var10 = -var7 * var8; var10 <= var7 * var8; var10 += var7) {
/*      */         
/*  274 */         var5.a((var9 + var7), var6, (var10 + 0));
/*  275 */         var5.a((var9 + 0), var6, (var10 + 0));
/*  276 */         var5.a((var9 + 0), var6, (var10 + var7));
/*  277 */         var5.a((var9 + var7), var6, (var10 + var7));
/*      */       } 
/*      */     } 
/*      */     
/*  281 */     var5.a();
/*  282 */     GL11.glEndList();
/*      */   }
/*      */ 
/*      */   
/*      */   private void g() {
/*  287 */     Random var1 = new Random(10842L);
/*  288 */     baz var2 = baz.a;
/*  289 */     var2.b();
/*      */     
/*  291 */     for (int var3 = 0; var3 < 1500; var3++) {
/*      */       
/*  293 */       double var4 = (var1.nextFloat() * 2.0F - 1.0F);
/*  294 */       double var6 = (var1.nextFloat() * 2.0F - 1.0F);
/*  295 */       double var8 = (var1.nextFloat() * 2.0F - 1.0F);
/*  296 */       double var10 = (0.15F + var1.nextFloat() * 0.1F);
/*  297 */       double var12 = var4 * var4 + var6 * var6 + var8 * var8;
/*      */       
/*  299 */       if (var12 < 1.0D && var12 > 0.01D) {
/*      */         
/*  301 */         var12 = 1.0D / Math.sqrt(var12);
/*  302 */         var4 *= var12;
/*  303 */         var6 *= var12;
/*  304 */         var8 *= var12;
/*  305 */         double var14 = var4 * 100.0D;
/*  306 */         double var16 = var6 * 100.0D;
/*  307 */         double var18 = var8 * 100.0D;
/*  308 */         double var20 = Math.atan2(var4, var8);
/*  309 */         double var22 = Math.sin(var20);
/*  310 */         double var24 = Math.cos(var20);
/*  311 */         double var26 = Math.atan2(Math.sqrt(var4 * var4 + var8 * var8), var6);
/*  312 */         double var28 = Math.sin(var26);
/*  313 */         double var30 = Math.cos(var26);
/*  314 */         double var32 = var1.nextDouble() * Math.PI * 2.0D;
/*  315 */         double var34 = Math.sin(var32);
/*  316 */         double var36 = Math.cos(var32);
/*      */         
/*  318 */         for (int var38 = 0; var38 < 4; var38++) {
/*      */           
/*  320 */           double var39 = 0.0D;
/*  321 */           double var41 = ((var38 & 0x2) - 1) * var10;
/*  322 */           double var43 = ((var38 + 1 & 0x2) - 1) * var10;
/*  323 */           double var47 = var41 * var36 - var43 * var34;
/*  324 */           double var49 = var43 * var36 + var41 * var34;
/*  325 */           double var53 = var47 * var28 + var39 * var30;
/*  326 */           double var55 = var39 * var28 - var47 * var30;
/*  327 */           double var57 = var55 * var22 - var49 * var24;
/*  328 */           double var61 = var49 * var22 + var55 * var24;
/*  329 */           var2.a(var14 + var57, var16 + var53, var18 + var61);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  334 */     var2.a();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ayp par1WorldClient) {
/*  342 */     if (this.h != null)
/*      */     {
/*  344 */       this.h.b(this);
/*      */     }
/*      */     
/*  347 */     this.d = -9999.0D;
/*  348 */     this.e = -9999.0D;
/*  349 */     this.f = -9999.0D;
/*  350 */     bbu.a.a((yc)par1WorldClient);
/*  351 */     this.h = par1WorldClient;
/*  352 */     this.r = new bbb((ym)par1WorldClient);
/*      */     
/*  354 */     if (par1WorldClient != null) {
/*      */       
/*  356 */       par1WorldClient.a(this);
/*  357 */       a();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a() {
/*  366 */     if (this.h != null) {
/*      */       
/*  368 */       amq.N.a(this.q.y.j);
/*  369 */       this.F = this.q.y.e;
/*      */ 
/*      */       
/*  372 */       if (this.l != null)
/*      */       {
/*  374 */         for (int i = 0; i < this.l.length; i++)
/*      */         {
/*  376 */           this.l[i].c();
/*      */         }
/*      */       }
/*      */       
/*  380 */       int var1 = 64 << 3 - this.F;
/*      */       
/*  382 */       if (var1 > 400)
/*      */       {
/*  384 */         var1 = 400;
/*      */       }
/*      */       
/*  387 */       this.m = var1 / 16 + 1;
/*  388 */       this.n = 16;
/*  389 */       this.o = var1 / 16 + 1;
/*  390 */       this.l = new baj[this.m * this.n * this.o];
/*  391 */       this.k = new baj[this.m * this.n * this.o];
/*  392 */       int var2 = 0;
/*  393 */       int var3 = 0;
/*  394 */       this.y = 0;
/*  395 */       this.z = 0;
/*  396 */       this.A = 0;
/*  397 */       this.B = this.m;
/*  398 */       this.C = this.n;
/*  399 */       this.D = this.o;
/*      */       
/*      */       int var4;
/*  402 */       for (var4 = 0; var4 < this.j.size(); var4++)
/*      */       {
/*  404 */         ((baj)this.j.get(var4)).q = false;
/*      */       }
/*      */       
/*  407 */       this.j.clear();
/*  408 */       this.a.clear();
/*      */       
/*  410 */       for (var4 = 0; var4 < this.m; var4++) {
/*      */         
/*  412 */         for (int var5 = 0; var5 < this.n; var5++) {
/*      */           
/*  414 */           for (int var6 = 0; var6 < this.o; var6++) {
/*      */             
/*  416 */             this.l[(var6 * this.n + var5) * this.m + var4] = new baj((yc)this.h, this.a, var4 * 16, var5 * 16, var6 * 16, this.p + var2);
/*      */             
/*  418 */             if (this.t)
/*      */             {
/*  420 */               (this.l[(var6 * this.n + var5) * this.m + var4]).v = this.s.get(var3);
/*      */             }
/*      */             
/*  423 */             (this.l[(var6 * this.n + var5) * this.m + var4]).u = false;
/*  424 */             (this.l[(var6 * this.n + var5) * this.m + var4]).t = true;
/*  425 */             (this.l[(var6 * this.n + var5) * this.m + var4]).l = true;
/*  426 */             (this.l[(var6 * this.n + var5) * this.m + var4]).s = var3++;
/*  427 */             this.l[(var6 * this.n + var5) * this.m + var4].f();
/*  428 */             this.k[(var6 * this.n + var5) * this.m + var4] = this.l[(var6 * this.n + var5) * this.m + var4];
/*  429 */             this.j.add(this.l[(var6 * this.n + var5) * this.m + var4]);
/*  430 */             var2 += 3;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/*  435 */       if (this.h != null) {
/*      */         
/*  437 */         md var7 = this.q.h;
/*      */         
/*  439 */         if (var7 != null) {
/*      */           
/*  441 */           c(ke.c(var7.t), ke.c(var7.u), ke.c(var7.v));
/*  442 */           Arrays.sort(this.k, (Comparator<? super baj>)new bal(var7));
/*      */         } 
/*      */       } 
/*      */       
/*  446 */       this.G = 2;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(aoj par1Vec3, bbd par2ICamera, float par3) {
/*  455 */     if (this.G > 0) {
/*      */       
/*  457 */       this.G--;
/*      */     }
/*      */     else {
/*      */       
/*  461 */       this.h.D.a("prepare");
/*  462 */       bdw.a.a((yc)this.h, this.i, this.q.p, this.q.h, par3);
/*  463 */       bbu.a.a((yc)this.h, this.i, this.q.p, this.q.h, this.q.y, par3);
/*  464 */       this.H = 0;
/*  465 */       this.I = 0;
/*  466 */       this.J = 0;
/*  467 */       md var4 = this.q.h;
/*  468 */       bbu.b = var4.T + (var4.t - var4.T) * par3;
/*  469 */       bbu.c = var4.U + (var4.u - var4.U) * par3;
/*  470 */       bbu.d = var4.V + (var4.v - var4.V) * par3;
/*  471 */       bdw.b = var4.T + (var4.t - var4.T) * par3;
/*  472 */       bdw.c = var4.U + (var4.u - var4.U) * par3;
/*  473 */       bdw.d = var4.V + (var4.v - var4.V) * par3;
/*  474 */       this.q.t.b(par3);
/*  475 */       this.h.D.c("global");
/*  476 */       List<lq> var5 = this.h.A();
/*  477 */       this.H = var5.size();
/*      */       
/*      */       int var6;
/*      */       
/*  481 */       for (var6 = 0; var6 < this.h.i.size(); var6++) {
/*      */         
/*  483 */         lq var7 = this.h.i.get(var6);
/*  484 */         this.I++;
/*      */         
/*  486 */         if (var7.a(par1Vec3))
/*      */         {
/*  488 */           bbu.a.a(var7, par3);
/*      */         }
/*      */       } 
/*      */       
/*  492 */       this.h.D.c("entities");
/*      */       
/*  494 */       for (var6 = 0; var6 < var5.size(); var6++) {
/*      */         
/*  496 */         lq var7 = var5.get(var6);
/*      */         
/*  498 */         if (var7.a(par1Vec3) && (var7.al || par2ICamera.a(var7.D) || var7.n == this.q.g) && (var7 != this.q.h || this.q.y.W != 0 || this.q.h.bw()) && this.h.f(ke.c(var7.t), 0, ke.c(var7.v))) {
/*      */           
/*  500 */           this.I++;
/*  501 */           bbu.a.a(var7, par3);
/*      */         } 
/*      */       } 
/*      */       
/*  505 */       this.h.D.c("tileentities");
/*  506 */       arw.b();
/*      */       
/*  508 */       for (var6 = 0; var6 < this.a.size(); var6++)
/*      */       {
/*  510 */         bdw.a.a(this.a.get(var6), par3);
/*      */       }
/*      */       
/*  513 */       this.q.t.a(par3);
/*  514 */       this.h.D.b();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String c() {
/*  523 */     return "C: " + this.N + "/" + this.K + ". F: " + this.L + ", O: " + this.M + ", E: " + this.O;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String d() {
/*  531 */     return "E: " + this.I + "/" + this.H + ". B: " + this.J + ", I: " + (this.H - this.J - this.I);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void c(int par1, int par2, int par3) {
/*  540 */     par1 -= 8;
/*  541 */     par2 -= 8;
/*  542 */     par3 -= 8;
/*  543 */     this.y = Integer.MAX_VALUE;
/*  544 */     this.z = Integer.MAX_VALUE;
/*  545 */     this.A = Integer.MAX_VALUE;
/*  546 */     this.B = Integer.MIN_VALUE;
/*  547 */     this.C = Integer.MIN_VALUE;
/*  548 */     this.D = Integer.MIN_VALUE;
/*  549 */     int var4 = this.m * 16;
/*  550 */     int var5 = var4 / 2;
/*      */     
/*  552 */     for (int var6 = 0; var6 < this.m; var6++) {
/*      */       
/*  554 */       int var7 = var6 * 16;
/*  555 */       int var8 = var7 + var5 - par1;
/*      */       
/*  557 */       if (var8 < 0)
/*      */       {
/*  559 */         var8 -= var4 - 1;
/*      */       }
/*      */       
/*  562 */       var8 /= var4;
/*  563 */       var7 -= var8 * var4;
/*      */       
/*  565 */       if (var7 < this.y)
/*      */       {
/*  567 */         this.y = var7;
/*      */       }
/*      */       
/*  570 */       if (var7 > this.B)
/*      */       {
/*  572 */         this.B = var7;
/*      */       }
/*      */       
/*  575 */       for (int var9 = 0; var9 < this.o; var9++) {
/*      */         
/*  577 */         int var10 = var9 * 16;
/*  578 */         int var11 = var10 + var5 - par3;
/*      */         
/*  580 */         if (var11 < 0)
/*      */         {
/*  582 */           var11 -= var4 - 1;
/*      */         }
/*      */         
/*  585 */         var11 /= var4;
/*  586 */         var10 -= var11 * var4;
/*      */         
/*  588 */         if (var10 < this.A)
/*      */         {
/*  590 */           this.A = var10;
/*      */         }
/*      */         
/*  593 */         if (var10 > this.D)
/*      */         {
/*  595 */           this.D = var10;
/*      */         }
/*      */         
/*  598 */         for (int var12 = 0; var12 < this.n; var12++) {
/*      */           
/*  600 */           int var13 = var12 * 16;
/*      */           
/*  602 */           if (var13 < this.z)
/*      */           {
/*  604 */             this.z = var13;
/*      */           }
/*      */           
/*  607 */           if (var13 > this.C)
/*      */           {
/*  609 */             this.C = var13;
/*      */           }
/*      */           
/*  612 */           baj var14 = this.l[(var9 * this.n + var12) * this.m + var6];
/*  613 */           boolean var15 = var14.q;
/*  614 */           var14.a(var7, var13, var10);
/*      */           
/*  616 */           if (!var15 && var14.q)
/*      */           {
/*  618 */             this.j.add(var14);
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int a(md par1EntityLiving, int par2, double par3) {
/*      */     int var34;
/*  630 */     this.h.D.a("sortchunks");
/*      */     
/*  632 */     for (int var5 = 0; var5 < 10; var5++) {
/*      */       
/*  634 */       this.Q = (this.Q + 1) % this.l.length;
/*  635 */       baj var6 = this.l[this.Q];
/*      */       
/*  637 */       if (var6.q && !this.j.contains(var6))
/*      */       {
/*  639 */         this.j.add(var6);
/*      */       }
/*      */     } 
/*      */     
/*  643 */     if (this.q.y.e != this.F)
/*      */     {
/*  645 */       a();
/*      */     }
/*      */     
/*  648 */     if (par2 == 0) {
/*      */       
/*  650 */       this.K = 0;
/*  651 */       this.P = 0;
/*  652 */       this.L = 0;
/*  653 */       this.M = 0;
/*  654 */       this.N = 0;
/*  655 */       this.O = 0;
/*      */     } 
/*      */     
/*  658 */     double var33 = par1EntityLiving.T + (par1EntityLiving.t - par1EntityLiving.T) * par3;
/*  659 */     double var7 = par1EntityLiving.U + (par1EntityLiving.u - par1EntityLiving.U) * par3;
/*  660 */     double var9 = par1EntityLiving.V + (par1EntityLiving.v - par1EntityLiving.V) * par3;
/*  661 */     double var11 = par1EntityLiving.t - this.d;
/*  662 */     double var13 = par1EntityLiving.u - this.e;
/*  663 */     double var15 = par1EntityLiving.v - this.f;
/*      */     
/*  665 */     if (var11 * var11 + var13 * var13 + var15 * var15 > 16.0D) {
/*      */       
/*  667 */       this.d = par1EntityLiving.t;
/*  668 */       this.e = par1EntityLiving.u;
/*  669 */       this.f = par1EntityLiving.v;
/*  670 */       c(ke.c(par1EntityLiving.t), ke.c(par1EntityLiving.u), ke.c(par1EntityLiving.v));
/*  671 */       Arrays.sort(this.k, (Comparator<? super baj>)new bal(par1EntityLiving));
/*      */     } 
/*      */     
/*  674 */     arw.a();
/*  675 */     byte var17 = 0;
/*      */ 
/*      */     
/*  678 */     if (this.t && this.q.y.h && !this.q.y.g && par2 == 0) {
/*      */       
/*  680 */       byte var18 = 0;
/*  681 */       int var19 = 16;
/*  682 */       a(var18, var19);
/*      */       
/*  684 */       for (int var20 = var18; var20 < var19; var20++)
/*      */       {
/*  686 */         (this.k[var20]).t = true;
/*      */       }
/*      */       
/*  689 */       this.h.D.c("render");
/*  690 */       var34 = var17 + a(var18, var19, par2, par3);
/*      */ 
/*      */       
/*      */       do {
/*  694 */         this.h.D.c("occ");
/*  695 */         int var35 = var19;
/*  696 */         var19 *= 2;
/*      */         
/*  698 */         if (var19 > this.k.length)
/*      */         {
/*  700 */           var19 = this.k.length;
/*      */         }
/*      */         
/*  703 */         GL11.glDisable(3553);
/*  704 */         GL11.glDisable(2896);
/*  705 */         GL11.glDisable(3008);
/*  706 */         GL11.glDisable(2912);
/*  707 */         GL11.glColorMask(false, false, false, false);
/*  708 */         GL11.glDepthMask(false);
/*  709 */         this.h.D.a("check");
/*  710 */         a(var35, var19);
/*  711 */         this.h.D.b();
/*  712 */         GL11.glPushMatrix();
/*  713 */         float var36 = 0.0F;
/*  714 */         float var21 = 0.0F;
/*  715 */         float var22 = 0.0F;
/*      */         
/*  717 */         for (int var23 = var35; var23 < var19; var23++) {
/*      */           
/*  719 */           if (this.k[var23].e()) {
/*      */             
/*  721 */             (this.k[var23]).l = false;
/*      */           }
/*      */           else {
/*      */             
/*  725 */             if (!(this.k[var23]).l)
/*      */             {
/*  727 */               (this.k[var23]).t = true;
/*      */             }
/*      */             
/*  730 */             if ((this.k[var23]).l && !(this.k[var23]).u) {
/*      */               
/*  732 */               float var24 = ke.c(this.k[var23].a(par1EntityLiving));
/*  733 */               int var25 = (int)(1.0F + var24 / 128.0F);
/*      */               
/*  735 */               if (this.u % var25 == var23 % var25) {
/*      */                 
/*  737 */                 baj var26 = this.k[var23];
/*  738 */                 float var27 = (float)(var26.f - var33);
/*  739 */                 float var28 = (float)(var26.g - var7);
/*  740 */                 float var29 = (float)(var26.h - var9);
/*  741 */                 float var30 = var27 - var36;
/*  742 */                 float var31 = var28 - var21;
/*  743 */                 float var32 = var29 - var22;
/*      */                 
/*  745 */                 if (var30 != 0.0F || var31 != 0.0F || var32 != 0.0F) {
/*      */                   
/*  747 */                   GL11.glTranslatef(var30, var31, var32);
/*  748 */                   var36 += var30;
/*  749 */                   var21 += var31;
/*  750 */                   var22 += var32;
/*      */                 } 
/*      */                 
/*  753 */                 this.h.D.a("bb");
/*  754 */                 ARBOcclusionQuery.glBeginQueryARB(35092, (this.k[var23]).v);
/*  755 */                 this.k[var23].d();
/*  756 */                 ARBOcclusionQuery.glEndQueryARB(35092);
/*  757 */                 this.h.D.b();
/*  758 */                 (this.k[var23]).u = true;
/*      */               } 
/*      */             } 
/*      */           } 
/*      */         } 
/*      */         
/*  764 */         GL11.glPopMatrix();
/*      */         
/*  766 */         if (this.q.y.g) {
/*      */           
/*  768 */           if (ban.b == 0)
/*      */           {
/*  770 */             GL11.glColorMask(false, true, true, true);
/*      */           }
/*      */           else
/*      */           {
/*  774 */             GL11.glColorMask(true, false, false, true);
/*      */           }
/*      */         
/*      */         } else {
/*      */           
/*  779 */           GL11.glColorMask(true, true, true, true);
/*      */         } 
/*      */         
/*  782 */         GL11.glDepthMask(true);
/*  783 */         GL11.glEnable(3553);
/*  784 */         GL11.glEnable(3008);
/*  785 */         GL11.glEnable(2912);
/*  786 */         this.h.D.c("render");
/*  787 */         var34 += a(var35, var19, par2, par3);
/*      */       }
/*  789 */       while (var19 < this.k.length);
/*      */     }
/*      */     else {
/*      */       
/*  793 */       this.h.D.c("render");
/*  794 */       var34 = var17 + a(0, this.k.length, par2, par3);
/*      */     } 
/*      */     
/*  797 */     this.h.D.b();
/*  798 */     return var34;
/*      */   }
/*      */ 
/*      */   
/*      */   private void a(int par1, int par2) {
/*  803 */     for (int var3 = par1; var3 < par2; var3++) {
/*      */       
/*  805 */       if ((this.k[var3]).u) {
/*      */         
/*  807 */         this.c.clear();
/*  808 */         ARBOcclusionQuery.glGetQueryObjectuARB((this.k[var3]).v, 34919, this.c);
/*      */         
/*  810 */         if (this.c.get(0) != 0) {
/*      */           
/*  812 */           (this.k[var3]).u = false;
/*  813 */           this.c.clear();
/*  814 */           ARBOcclusionQuery.glGetQueryObjectuARB((this.k[var3]).v, 34918, this.c);
/*  815 */           (this.k[var3]).t = (this.c.get(0) != 0);
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
/*      */   private int a(int par1, int par2, int par3, double par4) {
/*  827 */     this.R.clear();
/*  828 */     int var6 = 0;
/*      */     
/*  830 */     for (int var7 = par1; var7 < par2; var7++) {
/*      */       
/*  832 */       if (par3 == 0) {
/*      */         
/*  834 */         this.K++;
/*      */         
/*  836 */         if ((this.k[var7]).m[par3]) {
/*      */           
/*  838 */           this.O++;
/*      */         }
/*  840 */         else if (!(this.k[var7]).l) {
/*      */           
/*  842 */           this.L++;
/*      */         }
/*  844 */         else if (this.t && !(this.k[var7]).t) {
/*      */           
/*  846 */           this.M++;
/*      */         }
/*      */         else {
/*      */           
/*  850 */           this.N++;
/*      */         } 
/*      */       } 
/*      */       
/*  854 */       if (!(this.k[var7]).m[par3] && (this.k[var7]).l && (!this.t || (this.k[var7]).t)) {
/*      */         
/*  856 */         int var8 = this.k[var7].a(par3);
/*      */         
/*  858 */         if (var8 >= 0) {
/*      */           
/*  860 */           this.R.add(this.k[var7]);
/*  861 */           var6++;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  866 */     md var19 = this.q.h;
/*  867 */     double var20 = var19.T + (var19.t - var19.T) * par4;
/*  868 */     double var10 = var19.U + (var19.u - var19.U) * par4;
/*  869 */     double var12 = var19.V + (var19.v - var19.V) * par4;
/*  870 */     int var14 = 0;
/*      */     
/*      */     int var15;
/*  873 */     for (var15 = 0; var15 < this.S.length; var15++)
/*      */     {
/*  875 */       this.S[var15].b();
/*      */     }
/*      */     
/*  878 */     for (var15 = 0; var15 < this.R.size(); var15++) {
/*      */       
/*  880 */       baj var16 = this.R.get(var15);
/*  881 */       int var17 = -1;
/*      */       
/*  883 */       for (int var18 = 0; var18 < var14; var18++) {
/*      */         
/*  885 */         if (this.S[var18].a(var16.f, var16.g, var16.h))
/*      */         {
/*  887 */           var17 = var18;
/*      */         }
/*      */       } 
/*      */       
/*  891 */       if (var17 < 0) {
/*      */         
/*  893 */         var17 = var14++;
/*  894 */         this.S[var17].a(var16.f, var16.g, var16.h, var20, var10, var12);
/*      */       } 
/*      */       
/*  897 */       this.S[var17].a(var16.a(par3));
/*      */     } 
/*      */     
/*  900 */     a(par3, par4);
/*  901 */     return var6;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(int par1, double par2) {
/*  909 */     this.q.t.b(par2);
/*      */     
/*  911 */     for (int var4 = 0; var4 < this.S.length; var4++)
/*      */     {
/*  913 */       this.S[var4].a();
/*      */     }
/*      */     
/*  916 */     this.q.t.a(par2);
/*      */   }
/*      */ 
/*      */   
/*      */   public void e() {
/*  921 */     this.u++;
/*      */     
/*  923 */     if (this.u % 20 == 0) {
/*      */       
/*  925 */       Iterator<ie> var1 = this.E.values().iterator();
/*      */       
/*  927 */       while (var1.hasNext()) {
/*      */         
/*  929 */         ie var2 = var1.next();
/*  930 */         int var3 = var2.f();
/*      */         
/*  932 */         if (this.u - var3 > 400)
/*      */         {
/*  934 */           var1.remove();
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(float par1) {
/*  945 */     IRenderHandler skyProvider = null;
/*  946 */     if ((skyProvider = this.q.e.u.getSkyRenderer()) != null) {
/*      */       
/*  948 */       skyProvider.render(par1, this.h, this.q);
/*      */       return;
/*      */     } 
/*  951 */     if (this.q.e.u.h == 1) {
/*      */       
/*  953 */       GL11.glDisable(2912);
/*  954 */       GL11.glDisable(3008);
/*  955 */       GL11.glEnable(3042);
/*  956 */       GL11.glBlendFunc(770, 771);
/*  957 */       arw.a();
/*  958 */       GL11.glDepthMask(false);
/*  959 */       this.i.b(this.i.b("/misc/tunnel.png"));
/*  960 */       baz var21 = baz.a;
/*      */       
/*  962 */       for (int var22 = 0; var22 < 6; var22++) {
/*      */         
/*  964 */         GL11.glPushMatrix();
/*      */         
/*  966 */         if (var22 == 1)
/*      */         {
/*  968 */           GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
/*      */         }
/*      */         
/*  971 */         if (var22 == 2)
/*      */         {
/*  973 */           GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
/*      */         }
/*      */         
/*  976 */         if (var22 == 3)
/*      */         {
/*  978 */           GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
/*      */         }
/*      */         
/*  981 */         if (var22 == 4)
/*      */         {
/*  983 */           GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
/*      */         }
/*      */         
/*  986 */         if (var22 == 5)
/*      */         {
/*  988 */           GL11.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
/*      */         }
/*      */         
/*  991 */         var21.b();
/*  992 */         var21.d(2631720);
/*  993 */         var21.a(-100.0D, -100.0D, -100.0D, 0.0D, 0.0D);
/*  994 */         var21.a(-100.0D, -100.0D, 100.0D, 0.0D, 16.0D);
/*  995 */         var21.a(100.0D, -100.0D, 100.0D, 16.0D, 16.0D);
/*  996 */         var21.a(100.0D, -100.0D, -100.0D, 16.0D, 0.0D);
/*  997 */         var21.a();
/*  998 */         GL11.glPopMatrix();
/*      */       } 
/*      */       
/* 1001 */       GL11.glDepthMask(true);
/* 1002 */       GL11.glEnable(3553);
/* 1003 */       GL11.glEnable(3008);
/*      */     }
/* 1005 */     else if (this.q.e.u.d()) {
/*      */       
/* 1007 */       GL11.glDisable(3553);
/* 1008 */       aoj var2 = this.h.a(this.q.h, par1);
/* 1009 */       float var3 = (float)var2.c;
/* 1010 */       float var4 = (float)var2.d;
/* 1011 */       float var5 = (float)var2.e;
/*      */ 
/*      */       
/* 1014 */       if (this.q.y.g) {
/*      */         
/* 1016 */         float var6 = (var3 * 30.0F + var4 * 59.0F + var5 * 11.0F) / 100.0F;
/* 1017 */         float var7 = (var3 * 30.0F + var4 * 70.0F) / 100.0F;
/* 1018 */         float f1 = (var3 * 30.0F + var5 * 70.0F) / 100.0F;
/* 1019 */         var3 = var6;
/* 1020 */         var4 = var7;
/* 1021 */         var5 = f1;
/*      */       } 
/*      */       
/* 1024 */       GL11.glColor3f(var3, var4, var5);
/* 1025 */       baz var23 = baz.a;
/* 1026 */       GL11.glDepthMask(false);
/* 1027 */       GL11.glEnable(2912);
/* 1028 */       GL11.glColor3f(var3, var4, var5);
/* 1029 */       GL11.glCallList(this.w);
/* 1030 */       GL11.glDisable(2912);
/* 1031 */       GL11.glDisable(3008);
/* 1032 */       GL11.glEnable(3042);
/* 1033 */       GL11.glBlendFunc(770, 771);
/* 1034 */       arw.a();
/* 1035 */       float[] var24 = this.h.u.a(this.h.c(par1), par1);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1041 */       if (var24 != null) {
/*      */         
/* 1043 */         GL11.glDisable(3553);
/* 1044 */         GL11.glShadeModel(7425);
/* 1045 */         GL11.glPushMatrix();
/* 1046 */         GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
/* 1047 */         GL11.glRotatef((ke.a(this.h.e(par1)) < 0.0F) ? 180.0F : 0.0F, 0.0F, 0.0F, 1.0F);
/* 1048 */         GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
/* 1049 */         float f1 = var24[0];
/* 1050 */         float f2 = var24[1];
/* 1051 */         float f3 = var24[2];
/*      */ 
/*      */         
/* 1054 */         if (this.q.y.g) {
/*      */           
/* 1056 */           float f4 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
/* 1057 */           float f5 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
/* 1058 */           float var13 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
/* 1059 */           f1 = f4;
/* 1060 */           f2 = f5;
/* 1061 */           f3 = var13;
/*      */         } 
/*      */         
/* 1064 */         var23.b(6);
/* 1065 */         var23.a(f1, f2, f3, var24[3]);
/* 1066 */         var23.a(0.0D, 100.0D, 0.0D);
/* 1067 */         byte var26 = 16;
/* 1068 */         var23.a(var24[0], var24[1], var24[2], 0.0F);
/*      */         
/* 1070 */         for (int var27 = 0; var27 <= var26; var27++) {
/*      */           
/* 1072 */           float var13 = var27 * 3.1415927F * 2.0F / var26;
/* 1073 */           float var14 = ke.a(var13);
/* 1074 */           float var15 = ke.b(var13);
/* 1075 */           var23.a((var14 * 120.0F), (var15 * 120.0F), (-var15 * 40.0F * var24[3]));
/*      */         } 
/*      */         
/* 1078 */         var23.a();
/* 1079 */         GL11.glPopMatrix();
/* 1080 */         GL11.glShadeModel(7424);
/*      */       } 
/*      */       
/* 1083 */       GL11.glEnable(3553);
/* 1084 */       GL11.glBlendFunc(770, 1);
/* 1085 */       GL11.glPushMatrix();
/* 1086 */       float var8 = 1.0F - this.h.j(par1);
/* 1087 */       float var9 = 0.0F;
/* 1088 */       float var10 = 0.0F;
/* 1089 */       float var11 = 0.0F;
/* 1090 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, var8);
/* 1091 */       GL11.glTranslatef(var9, var10, var11);
/* 1092 */       GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
/* 1093 */       GL11.glRotatef(this.h.c(par1) * 360.0F, 1.0F, 0.0F, 0.0F);
/* 1094 */       float var12 = 30.0F;
/* 1095 */       GL11.glBindTexture(3553, this.i.b("/terrain/sun.png"));
/* 1096 */       var23.b();
/* 1097 */       var23.a(-var12, 100.0D, -var12, 0.0D, 0.0D);
/* 1098 */       var23.a(var12, 100.0D, -var12, 1.0D, 0.0D);
/* 1099 */       var23.a(var12, 100.0D, var12, 1.0D, 1.0D);
/* 1100 */       var23.a(-var12, 100.0D, var12, 0.0D, 1.0D);
/* 1101 */       var23.a();
/* 1102 */       var12 = 20.0F;
/* 1103 */       GL11.glBindTexture(3553, this.i.b("/terrain/moon_phases.png"));
/* 1104 */       int var28 = this.h.d(par1);
/* 1105 */       int var30 = var28 % 4;
/* 1106 */       int var29 = var28 / 4 % 2;
/* 1107 */       float var16 = (var30 + 0) / 4.0F;
/* 1108 */       float var17 = (var29 + 0) / 2.0F;
/* 1109 */       float var18 = (var30 + 1) / 4.0F;
/* 1110 */       float var19 = (var29 + 1) / 2.0F;
/* 1111 */       var23.b();
/* 1112 */       var23.a(-var12, -100.0D, var12, var18, var19);
/* 1113 */       var23.a(var12, -100.0D, var12, var16, var19);
/* 1114 */       var23.a(var12, -100.0D, -var12, var16, var17);
/* 1115 */       var23.a(-var12, -100.0D, -var12, var18, var17);
/* 1116 */       var23.a();
/* 1117 */       GL11.glDisable(3553);
/* 1118 */       float var20 = this.h.h(par1) * var8;
/*      */       
/* 1120 */       if (var20 > 0.0F) {
/*      */         
/* 1122 */         GL11.glColor4f(var20, var20, var20, var20);
/* 1123 */         GL11.glCallList(this.v);
/*      */       } 
/*      */       
/* 1126 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 1127 */       GL11.glDisable(3042);
/* 1128 */       GL11.glEnable(3008);
/* 1129 */       GL11.glEnable(2912);
/* 1130 */       GL11.glPopMatrix();
/* 1131 */       GL11.glDisable(3553);
/* 1132 */       GL11.glColor3f(0.0F, 0.0F, 0.0F);
/* 1133 */       double var25 = (this.q.g.h(par1)).d - this.h.R();
/*      */       
/* 1135 */       if (var25 < 0.0D) {
/*      */         
/* 1137 */         GL11.glPushMatrix();
/* 1138 */         GL11.glTranslatef(0.0F, 12.0F, 0.0F);
/* 1139 */         GL11.glCallList(this.x);
/* 1140 */         GL11.glPopMatrix();
/* 1141 */         var10 = 1.0F;
/* 1142 */         var11 = -((float)(var25 + 65.0D));
/* 1143 */         var12 = -var10;
/* 1144 */         var23.b();
/* 1145 */         var23.a(0, 255);
/* 1146 */         var23.a(-var10, var11, var10);
/* 1147 */         var23.a(var10, var11, var10);
/* 1148 */         var23.a(var10, var12, var10);
/* 1149 */         var23.a(-var10, var12, var10);
/* 1150 */         var23.a(-var10, var12, -var10);
/* 1151 */         var23.a(var10, var12, -var10);
/* 1152 */         var23.a(var10, var11, -var10);
/* 1153 */         var23.a(-var10, var11, -var10);
/* 1154 */         var23.a(var10, var12, -var10);
/* 1155 */         var23.a(var10, var12, var10);
/* 1156 */         var23.a(var10, var11, var10);
/* 1157 */         var23.a(var10, var11, -var10);
/* 1158 */         var23.a(-var10, var11, -var10);
/* 1159 */         var23.a(-var10, var11, var10);
/* 1160 */         var23.a(-var10, var12, var10);
/* 1161 */         var23.a(-var10, var12, -var10);
/* 1162 */         var23.a(-var10, var12, -var10);
/* 1163 */         var23.a(-var10, var12, var10);
/* 1164 */         var23.a(var10, var12, var10);
/* 1165 */         var23.a(var10, var12, -var10);
/* 1166 */         var23.a();
/*      */       } 
/*      */       
/* 1169 */       if (this.h.u.g()) {
/*      */         
/* 1171 */         GL11.glColor3f(var3 * 0.2F + 0.04F, var4 * 0.2F + 0.04F, var5 * 0.6F + 0.1F);
/*      */       }
/*      */       else {
/*      */         
/* 1175 */         GL11.glColor3f(var3, var4, var5);
/*      */       } 
/*      */       
/* 1178 */       GL11.glPushMatrix();
/* 1179 */       GL11.glTranslatef(0.0F, -((float)(var25 - 16.0D)), 0.0F);
/* 1180 */       GL11.glCallList(this.x);
/* 1181 */       GL11.glPopMatrix();
/* 1182 */       GL11.glEnable(3553);
/* 1183 */       GL11.glDepthMask(true);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(float par1) {
/* 1189 */     IRenderHandler renderer = null;
/* 1190 */     if ((renderer = this.h.u.getCloudRenderer()) != null) {
/*      */       
/* 1192 */       renderer.render(par1, this.h, this.q);
/*      */       
/*      */       return;
/*      */     } 
/* 1196 */     if (this.q.e.u.d())
/*      */     {
/* 1198 */       if (this.q.y.j) {
/*      */         
/* 1200 */         c(par1);
/*      */       }
/*      */       else {
/*      */         
/* 1204 */         GL11.glDisable(2884);
/* 1205 */         float var2 = (float)(this.q.h.U + (this.q.h.u - this.q.h.U) * par1);
/* 1206 */         byte var3 = 32;
/* 1207 */         int var4 = 256 / var3;
/* 1208 */         baz var5 = baz.a;
/* 1209 */         GL11.glBindTexture(3553, this.i.b("/environment/clouds.png"));
/* 1210 */         GL11.glEnable(3042);
/* 1211 */         GL11.glBlendFunc(770, 771);
/* 1212 */         aoj var6 = this.h.f(par1);
/* 1213 */         float var7 = (float)var6.c;
/* 1214 */         float var8 = (float)var6.d;
/* 1215 */         float var9 = (float)var6.e;
/*      */ 
/*      */         
/* 1218 */         if (this.q.y.g) {
/*      */           
/* 1220 */           float f1 = (var7 * 30.0F + var8 * 59.0F + var9 * 11.0F) / 100.0F;
/* 1221 */           float var11 = (var7 * 30.0F + var8 * 70.0F) / 100.0F;
/* 1222 */           float var12 = (var7 * 30.0F + var9 * 70.0F) / 100.0F;
/* 1223 */           var7 = f1;
/* 1224 */           var8 = var11;
/* 1225 */           var9 = var12;
/*      */         } 
/*      */         
/* 1228 */         float var10 = 4.8828125E-4F;
/* 1229 */         double var24 = (this.u + par1);
/* 1230 */         double var13 = this.q.h.q + (this.q.h.t - this.q.h.q) * par1 + var24 * 0.029999999329447746D;
/* 1231 */         double var15 = this.q.h.s + (this.q.h.v - this.q.h.s) * par1;
/* 1232 */         int var17 = ke.c(var13 / 2048.0D);
/* 1233 */         int var18 = ke.c(var15 / 2048.0D);
/* 1234 */         var13 -= (var17 * 2048);
/* 1235 */         var15 -= (var18 * 2048);
/* 1236 */         float var19 = this.h.u.f() - var2 + 0.33F;
/* 1237 */         float var20 = (float)(var13 * var10);
/* 1238 */         float var21 = (float)(var15 * var10);
/* 1239 */         var5.b();
/* 1240 */         var5.a(var7, var8, var9, 0.8F);
/*      */         int var22;
/* 1242 */         for (var22 = -var3 * var4; var22 < var3 * var4; var22 += var3) {
/*      */           int var23;
/* 1244 */           for (var23 = -var3 * var4; var23 < var3 * var4; var23 += var3) {
/*      */             
/* 1246 */             var5.a((var22 + 0), var19, (var23 + var3), ((var22 + 0) * var10 + var20), ((var23 + var3) * var10 + var21));
/* 1247 */             var5.a((var22 + var3), var19, (var23 + var3), ((var22 + var3) * var10 + var20), ((var23 + var3) * var10 + var21));
/* 1248 */             var5.a((var22 + var3), var19, (var23 + 0), ((var22 + var3) * var10 + var20), ((var23 + 0) * var10 + var21));
/* 1249 */             var5.a((var22 + 0), var19, (var23 + 0), ((var22 + 0) * var10 + var20), ((var23 + 0) * var10 + var21));
/*      */           } 
/*      */         } 
/*      */         
/* 1253 */         var5.a();
/* 1254 */         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 1255 */         GL11.glDisable(3042);
/* 1256 */         GL11.glEnable(2884);
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(double par1, double par3, double par5, float par7) {
/* 1266 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void c(float par1) {
/* 1274 */     GL11.glDisable(2884);
/* 1275 */     float var2 = (float)(this.q.h.U + (this.q.h.u - this.q.h.U) * par1);
/* 1276 */     baz var3 = baz.a;
/* 1277 */     float var4 = 12.0F;
/* 1278 */     float var5 = 4.0F;
/* 1279 */     double var6 = (this.u + par1);
/* 1280 */     double var8 = (this.q.h.q + (this.q.h.t - this.q.h.q) * par1 + var6 * 0.029999999329447746D) / var4;
/* 1281 */     double var10 = (this.q.h.s + (this.q.h.v - this.q.h.s) * par1) / var4 + 0.33000001311302185D;
/* 1282 */     float var12 = this.h.u.f() - var2 + 0.33F;
/* 1283 */     int var13 = ke.c(var8 / 2048.0D);
/* 1284 */     int var14 = ke.c(var10 / 2048.0D);
/* 1285 */     var8 -= (var13 * 2048);
/* 1286 */     var10 -= (var14 * 2048);
/* 1287 */     GL11.glBindTexture(3553, this.i.b("/environment/clouds.png"));
/* 1288 */     GL11.glEnable(3042);
/* 1289 */     GL11.glBlendFunc(770, 771);
/* 1290 */     aoj var15 = this.h.f(par1);
/* 1291 */     float var16 = (float)var15.c;
/* 1292 */     float var17 = (float)var15.d;
/* 1293 */     float var18 = (float)var15.e;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1298 */     if (this.q.y.g) {
/*      */       
/* 1300 */       float f1 = (var16 * 30.0F + var17 * 59.0F + var18 * 11.0F) / 100.0F;
/* 1301 */       float f3 = (var16 * 30.0F + var17 * 70.0F) / 100.0F;
/* 1302 */       float f2 = (var16 * 30.0F + var18 * 70.0F) / 100.0F;
/* 1303 */       var16 = f1;
/* 1304 */       var17 = f3;
/* 1305 */       var18 = f2;
/*      */     } 
/*      */     
/* 1308 */     float var19 = (float)(var8 * 0.0D);
/* 1309 */     float var20 = (float)(var10 * 0.0D);
/* 1310 */     float var21 = 0.00390625F;
/* 1311 */     var19 = ke.c(var8) * var21;
/* 1312 */     var20 = ke.c(var10) * var21;
/* 1313 */     float var22 = (float)(var8 - ke.c(var8));
/* 1314 */     float var23 = (float)(var10 - ke.c(var10));
/* 1315 */     byte var24 = 8;
/* 1316 */     byte var25 = 4;
/* 1317 */     float var26 = 9.765625E-4F;
/* 1318 */     GL11.glScalef(var4, 1.0F, var4);
/*      */     
/* 1320 */     for (int var27 = 0; var27 < 2; var27++) {
/*      */       
/* 1322 */       if (var27 == 0) {
/*      */         
/* 1324 */         GL11.glColorMask(false, false, false, false);
/*      */       }
/* 1326 */       else if (this.q.y.g) {
/*      */         
/* 1328 */         if (ban.b == 0)
/*      */         {
/* 1330 */           GL11.glColorMask(false, true, true, true);
/*      */         }
/*      */         else
/*      */         {
/* 1334 */           GL11.glColorMask(true, false, false, true);
/*      */         }
/*      */       
/*      */       } else {
/*      */         
/* 1339 */         GL11.glColorMask(true, true, true, true);
/*      */       } 
/*      */       
/* 1342 */       for (int var28 = -var25 + 1; var28 <= var25; var28++) {
/*      */         
/* 1344 */         for (int var29 = -var25 + 1; var29 <= var25; var29++) {
/*      */           
/* 1346 */           var3.b();
/* 1347 */           float var30 = (var28 * var24);
/* 1348 */           float var31 = (var29 * var24);
/* 1349 */           float var32 = var30 - var22;
/* 1350 */           float var33 = var31 - var23;
/*      */           
/* 1352 */           if (var12 > -var5 - 1.0F) {
/*      */             
/* 1354 */             var3.a(var16 * 0.7F, var17 * 0.7F, var18 * 0.7F, 0.8F);
/* 1355 */             var3.b(0.0F, -1.0F, 0.0F);
/* 1356 */             var3.a((var32 + 0.0F), (var12 + 0.0F), (var33 + var24), ((var30 + 0.0F) * var21 + var19), ((var31 + var24) * var21 + var20));
/* 1357 */             var3.a((var32 + var24), (var12 + 0.0F), (var33 + var24), ((var30 + var24) * var21 + var19), ((var31 + var24) * var21 + var20));
/* 1358 */             var3.a((var32 + var24), (var12 + 0.0F), (var33 + 0.0F), ((var30 + var24) * var21 + var19), ((var31 + 0.0F) * var21 + var20));
/* 1359 */             var3.a((var32 + 0.0F), (var12 + 0.0F), (var33 + 0.0F), ((var30 + 0.0F) * var21 + var19), ((var31 + 0.0F) * var21 + var20));
/*      */           } 
/*      */           
/* 1362 */           if (var12 <= var5 + 1.0F) {
/*      */             
/* 1364 */             var3.a(var16, var17, var18, 0.8F);
/* 1365 */             var3.b(0.0F, 1.0F, 0.0F);
/* 1366 */             var3.a((var32 + 0.0F), (var12 + var5 - var26), (var33 + var24), ((var30 + 0.0F) * var21 + var19), ((var31 + var24) * var21 + var20));
/* 1367 */             var3.a((var32 + var24), (var12 + var5 - var26), (var33 + var24), ((var30 + var24) * var21 + var19), ((var31 + var24) * var21 + var20));
/* 1368 */             var3.a((var32 + var24), (var12 + var5 - var26), (var33 + 0.0F), ((var30 + var24) * var21 + var19), ((var31 + 0.0F) * var21 + var20));
/* 1369 */             var3.a((var32 + 0.0F), (var12 + var5 - var26), (var33 + 0.0F), ((var30 + 0.0F) * var21 + var19), ((var31 + 0.0F) * var21 + var20));
/*      */           } 
/*      */           
/* 1372 */           var3.a(var16 * 0.9F, var17 * 0.9F, var18 * 0.9F, 0.8F);
/*      */ 
/*      */           
/* 1375 */           if (var28 > -1) {
/*      */             
/* 1377 */             var3.b(-1.0F, 0.0F, 0.0F);
/*      */             
/* 1379 */             for (int var34 = 0; var34 < var24; var34++) {
/*      */               
/* 1381 */               var3.a((var32 + var34 + 0.0F), (var12 + 0.0F), (var33 + var24), ((var30 + var34 + 0.5F) * var21 + var19), ((var31 + var24) * var21 + var20));
/* 1382 */               var3.a((var32 + var34 + 0.0F), (var12 + var5), (var33 + var24), ((var30 + var34 + 0.5F) * var21 + var19), ((var31 + var24) * var21 + var20));
/* 1383 */               var3.a((var32 + var34 + 0.0F), (var12 + var5), (var33 + 0.0F), ((var30 + var34 + 0.5F) * var21 + var19), ((var31 + 0.0F) * var21 + var20));
/* 1384 */               var3.a((var32 + var34 + 0.0F), (var12 + 0.0F), (var33 + 0.0F), ((var30 + var34 + 0.5F) * var21 + var19), ((var31 + 0.0F) * var21 + var20));
/*      */             } 
/*      */           } 
/*      */           
/* 1388 */           if (var28 <= 1) {
/*      */             
/* 1390 */             var3.b(1.0F, 0.0F, 0.0F);
/*      */             
/* 1392 */             for (int var34 = 0; var34 < var24; var34++) {
/*      */               
/* 1394 */               var3.a((var32 + var34 + 1.0F - var26), (var12 + 0.0F), (var33 + var24), ((var30 + var34 + 0.5F) * var21 + var19), ((var31 + var24) * var21 + var20));
/* 1395 */               var3.a((var32 + var34 + 1.0F - var26), (var12 + var5), (var33 + var24), ((var30 + var34 + 0.5F) * var21 + var19), ((var31 + var24) * var21 + var20));
/* 1396 */               var3.a((var32 + var34 + 1.0F - var26), (var12 + var5), (var33 + 0.0F), ((var30 + var34 + 0.5F) * var21 + var19), ((var31 + 0.0F) * var21 + var20));
/* 1397 */               var3.a((var32 + var34 + 1.0F - var26), (var12 + 0.0F), (var33 + 0.0F), ((var30 + var34 + 0.5F) * var21 + var19), ((var31 + 0.0F) * var21 + var20));
/*      */             } 
/*      */           } 
/*      */           
/* 1401 */           var3.a(var16 * 0.8F, var17 * 0.8F, var18 * 0.8F, 0.8F);
/*      */           
/* 1403 */           if (var29 > -1) {
/*      */             
/* 1405 */             var3.b(0.0F, 0.0F, -1.0F);
/*      */             
/* 1407 */             for (int var34 = 0; var34 < var24; var34++) {
/*      */               
/* 1409 */               var3.a((var32 + 0.0F), (var12 + var5), (var33 + var34 + 0.0F), ((var30 + 0.0F) * var21 + var19), ((var31 + var34 + 0.5F) * var21 + var20));
/* 1410 */               var3.a((var32 + var24), (var12 + var5), (var33 + var34 + 0.0F), ((var30 + var24) * var21 + var19), ((var31 + var34 + 0.5F) * var21 + var20));
/* 1411 */               var3.a((var32 + var24), (var12 + 0.0F), (var33 + var34 + 0.0F), ((var30 + var24) * var21 + var19), ((var31 + var34 + 0.5F) * var21 + var20));
/* 1412 */               var3.a((var32 + 0.0F), (var12 + 0.0F), (var33 + var34 + 0.0F), ((var30 + 0.0F) * var21 + var19), ((var31 + var34 + 0.5F) * var21 + var20));
/*      */             } 
/*      */           } 
/*      */           
/* 1416 */           if (var29 <= 1) {
/*      */             
/* 1418 */             var3.b(0.0F, 0.0F, 1.0F);
/*      */             
/* 1420 */             for (int var34 = 0; var34 < var24; var34++) {
/*      */               
/* 1422 */               var3.a((var32 + 0.0F), (var12 + var5), (var33 + var34 + 1.0F - var26), ((var30 + 0.0F) * var21 + var19), ((var31 + var34 + 0.5F) * var21 + var20));
/* 1423 */               var3.a((var32 + var24), (var12 + var5), (var33 + var34 + 1.0F - var26), ((var30 + var24) * var21 + var19), ((var31 + var34 + 0.5F) * var21 + var20));
/* 1424 */               var3.a((var32 + var24), (var12 + 0.0F), (var33 + var34 + 1.0F - var26), ((var30 + var24) * var21 + var19), ((var31 + var34 + 0.5F) * var21 + var20));
/* 1425 */               var3.a((var32 + 0.0F), (var12 + 0.0F), (var33 + var34 + 1.0F - var26), ((var30 + 0.0F) * var21 + var19), ((var31 + var34 + 0.5F) * var21 + var20));
/*      */             } 
/*      */           } 
/*      */           
/* 1429 */           var3.a();
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 1434 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 1435 */     GL11.glDisable(3042);
/* 1436 */     GL11.glEnable(2884);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(md par1EntityLiving, boolean par2) {
/* 1444 */     byte var3 = 2;
/* 1445 */     bak var4 = new bak(par1EntityLiving);
/* 1446 */     baj[] var5 = new baj[var3];
/* 1447 */     ArrayList<baj> var6 = null;
/* 1448 */     int var7 = this.j.size();
/* 1449 */     int var8 = 0;
/* 1450 */     this.h.D.a("nearChunksSearch");
/*      */ 
/*      */ 
/*      */     
/*      */     int var9;
/*      */ 
/*      */     
/* 1457 */     for (var9 = 0; var9 < var7; var9++) {
/*      */       
/* 1459 */       baj var10 = this.j.get(var9);
/*      */       
/* 1461 */       if (var10 != null) {
/*      */         
/* 1463 */         if (!par2) {
/*      */           
/* 1465 */           if (var10.a(par1EntityLiving) > 256.0F) {
/*      */             int i;
/* 1467 */             for (i = 0; i < var3 && (var5[i] == null || var4.a(var5[i], var10) <= 0); i++);
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 1472 */             i--;
/*      */             
/* 1474 */             if (i > 0) {
/*      */               
/* 1476 */               int j = i;
/*      */ 
/*      */               
/*      */               while (true) {
/* 1480 */                 j--;
/*      */                 
/* 1482 */                 if (j == 0) {
/*      */                   
/* 1484 */                   var5[i] = var10;
/*      */                   
/*      */                   break;
/*      */                 } 
/* 1488 */                 var5[j - 1] = var5[j];
/*      */               } 
/*      */             } 
/*      */ 
/*      */             
/*      */             continue;
/*      */           } 
/* 1495 */         } else if (!var10.l) {
/*      */           continue;
/*      */         } 
/*      */ 
/*      */         
/* 1500 */         if (var6 == null)
/*      */         {
/* 1502 */           var6 = new ArrayList();
/*      */         }
/*      */         
/* 1505 */         var8++;
/* 1506 */         var6.add(var10);
/* 1507 */         this.j.set(var9, null);
/*      */       } 
/*      */       continue;
/*      */     } 
/* 1511 */     this.h.D.b();
/* 1512 */     this.h.D.a("sort");
/*      */     
/* 1514 */     if (var6 != null) {
/*      */       
/* 1516 */       if (var6.size() > 1)
/*      */       {
/* 1518 */         Collections.sort(var6, (Comparator<? super baj>)var4);
/*      */       }
/*      */       
/* 1521 */       for (var9 = var6.size() - 1; var9 >= 0; var9--) {
/*      */         
/* 1523 */         baj var10 = var6.get(var9);
/* 1524 */         var10.a();
/* 1525 */         var10.q = false;
/*      */       } 
/*      */     } 
/*      */     
/* 1529 */     this.h.D.b();
/* 1530 */     var9 = 0;
/* 1531 */     this.h.D.a("rebuild");
/*      */     
/*      */     int var16;
/* 1534 */     for (var16 = var3 - 1; var16 >= 0; var16--) {
/*      */       
/* 1536 */       baj var17 = var5[var16];
/*      */       
/* 1538 */       if (var17 != null) {
/*      */         
/* 1540 */         if (!var17.l && var16 != var3 - 1) {
/*      */           
/* 1542 */           var5[var16] = null;
/* 1543 */           var5[0] = null;
/*      */           
/*      */           break;
/*      */         } 
/* 1547 */         var5[var16].a();
/* 1548 */         (var5[var16]).q = false;
/* 1549 */         var9++;
/*      */       } 
/*      */     } 
/*      */     
/* 1553 */     this.h.D.b();
/* 1554 */     this.h.D.a("cleanup");
/* 1555 */     var16 = 0;
/* 1556 */     int var11 = 0;
/*      */     
/* 1558 */     for (int var12 = this.j.size(); var16 != var12; var16++) {
/*      */       
/* 1560 */       baj var13 = this.j.get(var16);
/*      */       
/* 1562 */       if (var13 != null) {
/*      */         
/* 1564 */         boolean var14 = false;
/*      */         
/* 1566 */         for (int var15 = 0; var15 < var3 && !var14; var15++) {
/*      */           
/* 1568 */           if (var13 == var5[var15])
/*      */           {
/* 1570 */             var14 = true;
/*      */           }
/*      */         } 
/*      */         
/* 1574 */         if (!var14) {
/*      */           
/* 1576 */           if (var11 != var16)
/*      */           {
/* 1578 */             this.j.set(var11, var13);
/*      */           }
/*      */           
/* 1581 */           var11++;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 1586 */     this.h.D.b();
/* 1587 */     this.h.D.a("trim");
/*      */ 
/*      */     
/*      */     while (true) {
/* 1591 */       var16--;
/*      */       
/* 1593 */       if (var16 < var11) {
/*      */         
/* 1595 */         this.h.D.b();
/* 1596 */         return (var7 == var8 + var9);
/*      */       } 
/*      */       
/* 1599 */       this.j.remove(var16);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(qx par1EntityPlayer, aoh par2MovingObjectPosition, int par3, ur par4ItemStack, float par5) {
/* 1605 */     baz var6 = baz.a;
/* 1606 */     GL11.glEnable(3042);
/* 1607 */     GL11.glEnable(3008);
/* 1608 */     GL11.glBlendFunc(770, 1);
/* 1609 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, (ke.a((float)Minecraft.F() / 100.0F) * 0.2F + 0.4F) * 0.5F);
/*      */     
/* 1611 */     if (par3 != 0 && par4ItemStack != null) {
/*      */       
/* 1613 */       GL11.glBlendFunc(770, 771);
/* 1614 */       float var7 = ke.a((float)Minecraft.F() / 100.0F) * 0.2F + 0.8F;
/* 1615 */       GL11.glColor4f(var7, var7, var7, ke.a((float)Minecraft.F() / 200.0F) * 0.2F + 0.5F);
/* 1616 */       int var8 = this.i.b("/terrain.png");
/* 1617 */       GL11.glBindTexture(3553, var8);
/*      */     } 
/*      */     
/* 1620 */     GL11.glDisable(3042);
/* 1621 */     GL11.glDisable(3008);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(baz par1Tessellator, qx par2EntityPlayer, float par3) {
/* 1626 */     drawBlockDamageTexture(par1Tessellator, par2EntityPlayer, par3);
/*      */   }
/*      */ 
/*      */   
/*      */   public void drawBlockDamageTexture(baz par1Tessellator, md par2EntityPlayer, float par3) {
/* 1631 */     double var4 = par2EntityPlayer.T + (par2EntityPlayer.t - par2EntityPlayer.T) * par3;
/* 1632 */     double var6 = par2EntityPlayer.U + (par2EntityPlayer.u - par2EntityPlayer.U) * par3;
/* 1633 */     double var8 = par2EntityPlayer.V + (par2EntityPlayer.v - par2EntityPlayer.V) * par3;
/*      */     
/* 1635 */     if (!this.E.isEmpty()) {
/*      */       
/* 1637 */       GL11.glBlendFunc(774, 768);
/* 1638 */       int var10 = this.i.b("/terrain.png");
/* 1639 */       GL11.glBindTexture(3553, var10);
/* 1640 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
/* 1641 */       GL11.glPushMatrix();
/* 1642 */       GL11.glDisable(3008);
/* 1643 */       GL11.glPolygonOffset(-3.0F, -3.0F);
/* 1644 */       GL11.glEnable(32823);
/* 1645 */       GL11.glEnable(3008);
/* 1646 */       par1Tessellator.b();
/* 1647 */       par1Tessellator.b(-var4, -var6, -var8);
/* 1648 */       par1Tessellator.c();
/* 1649 */       Iterator<ie> var11 = this.E.values().iterator();
/*      */       
/* 1651 */       while (var11.hasNext()) {
/*      */         
/* 1653 */         ie var12 = var11.next();
/* 1654 */         double var13 = var12.b() - var4;
/* 1655 */         double var15 = var12.c() - var6;
/* 1656 */         double var17 = var12.d() - var8;
/*      */         
/* 1658 */         if (var13 * var13 + var15 * var15 + var17 * var17 > 1024.0D) {
/*      */           
/* 1660 */           var11.remove();
/*      */           
/*      */           continue;
/*      */         } 
/* 1664 */         int var19 = this.h.a(var12.b(), var12.c(), var12.d());
/* 1665 */         amq var20 = (var19 > 0) ? amq.p[var19] : null;
/*      */         
/* 1667 */         if (var20 == null)
/*      */         {
/* 1669 */           var20 = amq.w;
/*      */         }
/*      */         
/* 1672 */         this.r.a(var20, var12.b(), var12.c(), var12.d(), 240 + var12.e());
/*      */       } 
/*      */ 
/*      */       
/* 1676 */       par1Tessellator.a();
/* 1677 */       par1Tessellator.b(0.0D, 0.0D, 0.0D);
/* 1678 */       GL11.glDisable(3008);
/* 1679 */       GL11.glPolygonOffset(0.0F, 0.0F);
/* 1680 */       GL11.glDisable(32823);
/* 1681 */       GL11.glEnable(3008);
/* 1682 */       GL11.glDepthMask(true);
/* 1683 */       GL11.glPopMatrix();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(qx par1EntityPlayer, aoh par2MovingObjectPosition, int par3, ur par4ItemStack, float par5) {
/* 1692 */     if (par3 == 0 && par2MovingObjectPosition.a == aoi.a) {
/*      */       
/* 1694 */       GL11.glEnable(3042);
/* 1695 */       GL11.glBlendFunc(770, 771);
/* 1696 */       GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.4F);
/* 1697 */       GL11.glLineWidth(2.0F);
/* 1698 */       GL11.glDisable(3553);
/* 1699 */       GL11.glDepthMask(false);
/* 1700 */       float var6 = 0.002F;
/* 1701 */       int var7 = this.h.a(par2MovingObjectPosition.b, par2MovingObjectPosition.c, par2MovingObjectPosition.d);
/*      */       
/* 1703 */       if (var7 > 0) {
/*      */         
/* 1705 */         amq.p[var7].a((ym)this.h, par2MovingObjectPosition.b, par2MovingObjectPosition.c, par2MovingObjectPosition.d);
/* 1706 */         double var8 = par1EntityPlayer.T + (par1EntityPlayer.t - par1EntityPlayer.T) * par5;
/* 1707 */         double var10 = par1EntityPlayer.U + (par1EntityPlayer.u - par1EntityPlayer.U) * par5;
/* 1708 */         double var12 = par1EntityPlayer.V + (par1EntityPlayer.v - par1EntityPlayer.V) * par5;
/* 1709 */         a(amq.p[var7].b_((yc)this.h, par2MovingObjectPosition.b, par2MovingObjectPosition.c, par2MovingObjectPosition.d).b(var6, var6, var6).c(-var8, -var10, -var12));
/*      */       } 
/*      */       
/* 1712 */       GL11.glDepthMask(true);
/* 1713 */       GL11.glEnable(3553);
/* 1714 */       GL11.glDisable(3042);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void a(aoe par1AxisAlignedBB) {
/* 1723 */     baz var2 = baz.a;
/* 1724 */     var2.b(3);
/* 1725 */     var2.a(par1AxisAlignedBB.a, par1AxisAlignedBB.b, par1AxisAlignedBB.c);
/* 1726 */     var2.a(par1AxisAlignedBB.d, par1AxisAlignedBB.b, par1AxisAlignedBB.c);
/* 1727 */     var2.a(par1AxisAlignedBB.d, par1AxisAlignedBB.b, par1AxisAlignedBB.f);
/* 1728 */     var2.a(par1AxisAlignedBB.a, par1AxisAlignedBB.b, par1AxisAlignedBB.f);
/* 1729 */     var2.a(par1AxisAlignedBB.a, par1AxisAlignedBB.b, par1AxisAlignedBB.c);
/* 1730 */     var2.a();
/* 1731 */     var2.b(3);
/* 1732 */     var2.a(par1AxisAlignedBB.a, par1AxisAlignedBB.e, par1AxisAlignedBB.c);
/* 1733 */     var2.a(par1AxisAlignedBB.d, par1AxisAlignedBB.e, par1AxisAlignedBB.c);
/* 1734 */     var2.a(par1AxisAlignedBB.d, par1AxisAlignedBB.e, par1AxisAlignedBB.f);
/* 1735 */     var2.a(par1AxisAlignedBB.a, par1AxisAlignedBB.e, par1AxisAlignedBB.f);
/* 1736 */     var2.a(par1AxisAlignedBB.a, par1AxisAlignedBB.e, par1AxisAlignedBB.c);
/* 1737 */     var2.a();
/* 1738 */     var2.b(1);
/* 1739 */     var2.a(par1AxisAlignedBB.a, par1AxisAlignedBB.b, par1AxisAlignedBB.c);
/* 1740 */     var2.a(par1AxisAlignedBB.a, par1AxisAlignedBB.e, par1AxisAlignedBB.c);
/* 1741 */     var2.a(par1AxisAlignedBB.d, par1AxisAlignedBB.b, par1AxisAlignedBB.c);
/* 1742 */     var2.a(par1AxisAlignedBB.d, par1AxisAlignedBB.e, par1AxisAlignedBB.c);
/* 1743 */     var2.a(par1AxisAlignedBB.d, par1AxisAlignedBB.b, par1AxisAlignedBB.f);
/* 1744 */     var2.a(par1AxisAlignedBB.d, par1AxisAlignedBB.e, par1AxisAlignedBB.f);
/* 1745 */     var2.a(par1AxisAlignedBB.a, par1AxisAlignedBB.b, par1AxisAlignedBB.f);
/* 1746 */     var2.a(par1AxisAlignedBB.a, par1AxisAlignedBB.e, par1AxisAlignedBB.f);
/* 1747 */     var2.a();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(int par1, int par2, int par3, int par4, int par5, int par6) {
/* 1755 */     int var7 = ke.a(par1, 16);
/* 1756 */     int var8 = ke.a(par2, 16);
/* 1757 */     int var9 = ke.a(par3, 16);
/* 1758 */     int var10 = ke.a(par4, 16);
/* 1759 */     int var11 = ke.a(par5, 16);
/* 1760 */     int var12 = ke.a(par6, 16);
/*      */     
/* 1762 */     for (int var13 = var7; var13 <= var10; var13++) {
/*      */       
/* 1764 */       int var14 = var13 % this.m;
/*      */       
/* 1766 */       if (var14 < 0)
/*      */       {
/* 1768 */         var14 += this.m;
/*      */       }
/*      */       
/* 1771 */       for (int var15 = var8; var15 <= var11; var15++) {
/*      */         
/* 1773 */         int var16 = var15 % this.n;
/*      */         
/* 1775 */         if (var16 < 0)
/*      */         {
/* 1777 */           var16 += this.n;
/*      */         }
/*      */         
/* 1780 */         for (int var17 = var9; var17 <= var12; var17++) {
/*      */           
/* 1782 */           int var18 = var17 % this.o;
/*      */           
/* 1784 */           if (var18 < 0)
/*      */           {
/* 1786 */             var18 += this.o;
/*      */           }
/*      */           
/* 1789 */           int var19 = (var18 * this.n + var16) * this.m + var14;
/* 1790 */           baj var20 = this.l[var19];
/*      */           
/* 1792 */           if (var20 != null && !var20.q) {
/*      */             
/* 1794 */             this.j.add(var20);
/* 1795 */             var20.f();
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
/*      */   
/*      */   public void a(int par1, int par2, int par3) {
/* 1808 */     b(par1 - 1, par2 - 1, par3 - 1, par1 + 1, par2 + 1, par3 + 1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(int par1, int par2, int par3) {
/* 1816 */     b(par1 - 1, par2 - 1, par3 - 1, par1 + 1, par2 + 1, par3 + 1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(int par1, int par2, int par3, int par4, int par5, int par6) {
/* 1825 */     b(par1 - 1, par2 - 1, par3 - 1, par4 + 1, par5 + 1, par6 + 1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(bbd par1ICamera, float par2) {
/* 1834 */     for (int var3 = 0; var3 < this.l.length; var3++) {
/*      */       
/* 1836 */       if (!this.l[var3].e() && (!(this.l[var3]).l || (var3 + this.g & 0xF) == 0))
/*      */       {
/* 1838 */         this.l[var3].a(par1ICamera);
/*      */       }
/*      */     } 
/*      */     
/* 1842 */     this.g++;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(String par1Str, int par2, int par3, int par4) {
/* 1850 */     vc var5 = vc.d(par1Str);
/*      */     
/* 1852 */     if (par1Str != null && var5 != null)
/*      */     {
/* 1854 */       this.q.v.a(var5.g());
/*      */     }
/*      */     
/* 1857 */     this.q.A.a(par1Str, par2, par3, par4);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(String par1Str, double par2, double par4, double par6, float par8, float par9) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(qx par1EntityPlayer, String par2Str, double par3, double par5, double par7, float par9, float par10) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(String par1Str, double par2, double par4, double par6, double par8, double par10, double par12) {
/*      */     try {
/* 1874 */       b(par1Str, par2, par4, par6, par8, par10, par12);
/*      */     }
/* 1876 */     catch (Throwable var17) {
/*      */       
/* 1878 */       a var15 = a.a(var17, "Exception while adding particle");
/* 1879 */       l var16 = var15.a("Particle being added");
/* 1880 */       var16.a("Name", par1Str);
/* 1881 */       var16.a("Position", (Callable)new baw(this, par2, par4, par6));
/* 1882 */       throw new t(var15);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public azq b(String par1Str, double par2, double par4, double par6, double par8, double par10, double par12) {
/* 1891 */     if (this.q != null && this.q.h != null && this.q.i != null) {
/*      */       azh azh; bac bac;
/* 1893 */       int var14 = this.q.y.ai;
/*      */       
/* 1895 */       boolean isSCP = false;
/* 1896 */       if (var14 == 1 && this.h.t.nextInt(3) == 0 && !isSCP)
/*      */       {
/* 1898 */         var14 = 2;
/*      */       }
/*      */       
/* 1901 */       double var15 = this.q.h.t - par2;
/* 1902 */       double var17 = this.q.h.u - par4;
/* 1903 */       double var19 = this.q.h.v - par6;
/* 1904 */       azq var21 = null;
/* 1905 */       Object effectObject = null;
/*      */       
/* 1907 */       if (par1Str.equals("hugeexplosion")) {
/*      */         azn azn;
/* 1909 */         this.q.i.a((azq)(azn = new azn((yc)this.h, par2, par4, par6, par8, par10, par12)));
/*      */       }
/* 1911 */       else if (par1Str.equals("largeexplode")) {
/*      */         azm azm;
/* 1913 */         this.q.i.a((azq)(azm = new azm(this.i, (yc)this.h, par2, par4, par6, par8, par10, par12)));
/*      */       }
/* 1915 */       else if (par1Str.equals("fireworksSpark")) {
/*      */         
/* 1917 */         this.q.i.a((azq)(azh = new azh((yc)this.h, par2, par4, par6, par8, par10, par12, this.q.i)));
/*      */       } 
/*      */       
/* 1920 */       if (azh != null)
/*      */       {
/* 1922 */         return (azq)azh;
/*      */       }
/*      */ 
/*      */       
/* 1926 */       double var22 = 16.0D;
/*      */       
/* 1928 */       if (par1Str.equals("SCPsmoke")) {
/*      */         
/* 1930 */         SCPSmokeFX sCPSmokeFX = new SCPSmokeFX((yc)this.h, par2, par4, par6, par8, par10, par12, 4.5F);
/* 1931 */         isSCP = true;
/*      */       }
/* 1933 */       else if (par1Str.equals("SCPsmoke2")) {
/*      */         
/* 1935 */         SCPSmokeFX2 sCPSmokeFX2 = new SCPSmokeFX2((yc)this.h, par2, par4, par6, par8, par10, par12, 4.5F);
/* 1936 */         isSCP = true;
/*      */       }
/* 1938 */       else if (par1Str.equals("SCPsmoke3")) {
/*      */         
/* 1940 */         SCPSmokeFX3 sCPSmokeFX3 = new SCPSmokeFX3((yc)this.h, par2, par4, par6, par8, par10, par12, 4.5F);
/* 1941 */         isSCP = true;
/*      */       }
/* 1943 */       else if (par1Str.equals("SCPsmoke4")) {
/*      */         
/* 1945 */         SCPSmokeFX4 sCPSmokeFX4 = new SCPSmokeFX4((yc)this.h, par2, par4, par6, par8, par10, par12, 4.5F);
/* 1946 */         isSCP = true;
/*      */       }
/* 1948 */       else if (par1Str.equals("SCPsmoke5")) {
/*      */         
/* 1950 */         SCPSmokeFX5 sCPSmokeFX5 = new SCPSmokeFX5((yc)this.h, par2, par4, par6, par8, par10, par12, 4.5F);
/* 1951 */         isSCP = true;
/*      */       }
/* 1953 */       else if (par1Str.equals("SCPsmoke6")) {
/*      */         
/* 1955 */         SCPSmokeFX6 sCPSmokeFX6 = new SCPSmokeFX6((yc)this.h, par2, par4, par6, par8, par10, par12, 4.5F);
/* 1956 */         isSCP = true;
/*      */       }
/* 1958 */       else if (par1Str.equals("SCP080")) {
/*      */         
/* 1960 */         SCP080FX sCP080FX = new SCP080FX((yc)this.h, par2, par4, par6, par8, par10, par12, 2.0F);
/* 1961 */         isSCP = true;
/*      */       }
/* 1963 */       else if (par1Str.equals("electricity")) {
/*      */         
/* 1965 */         SCPEntityElectricityFX sCPEntityElectricityFX = new SCPEntityElectricityFX((yc)this.h, par2, par4, par6, par8, par10, par12);
/* 1966 */         isSCP = true;
/*      */       }
/* 1968 */       else if (par1Str.equals("orange")) {
/*      */         
/* 1970 */         ayy ayy = new ayy((yc)this.h, par2, par4, par6, up.bw);
/* 1971 */         isSCP = true;
/*      */       }
/* 1973 */       else if (par1Str.equals("cry")) {
/*      */         
/* 1975 */         SCPCryFX sCPCryFX = new SCPCryFX((yc)this.h, par2, par4, par6, par8, par10, par12);
/* 1976 */         isSCP = true;
/*      */       } 
/*      */       
/* 1979 */       if (var15 * var15 + var17 * var17 + var19 * var19 > var22 * var22)
/*      */       {
/* 1981 */         return null;
/*      */       }
/*      */       
/* 1984 */       if (var14 > 1 && !isSCP)
/*      */       {
/* 1986 */         return null;
/*      */       }
/*      */ 
/*      */       
/* 1990 */       if (par1Str.equals("bubble")) {
/*      */         
/* 1992 */         ayz ayz = new ayz((yc)this.h, par2, par4, par6, par8, par10, par12);
/*      */       }
/* 1994 */       else if (par1Str.equals("suspended")) {
/*      */         
/* 1996 */         azz azz = new azz((yc)this.h, par2, par4, par6, par8, par10, par12);
/*      */       }
/* 1998 */       else if (par1Str.equals("depthsuspend")) {
/*      */         
/* 2000 */         baa baa = new baa((yc)this.h, par2, par4, par6, par8, par10, par12);
/*      */       }
/* 2002 */       else if (par1Str.equals("townaura")) {
/*      */         
/* 2004 */         baa baa = new baa((yc)this.h, par2, par4, par6, par8, par10, par12);
/*      */       }
/* 2006 */       else if (par1Str.equals("crit")) {
/*      */         
/* 2008 */         azb azb = new azb((yc)this.h, par2, par4, par6, par8, par10, par12);
/*      */       }
/* 2010 */       else if (par1Str.equals("magicCrit")) {
/*      */         
/* 2012 */         azb azb = new azb((yc)this.h, par2, par4, par6, par8, par10, par12);
/* 2013 */         azb.b(azb.c() * 0.3F, azb.d() * 0.8F, azb.f());
/* 2014 */         azb.i(azb.h() + 1);
/*      */       }
/* 2016 */       else if (par1Str.equals("smoke")) {
/*      */         
/* 2018 */         azv azv = new azv((yc)this.h, par2, par4, par6, par8, par10, par12);
/*      */       }
/* 2020 */       else if (par1Str.equals("mobSpell")) {
/*      */         
/* 2022 */         azx azx = new azx((yc)this.h, par2, par4, par6, 0.0D, 0.0D, 0.0D);
/* 2023 */         azx.b((float)par8, (float)par10, (float)par12);
/*      */       }
/* 2025 */       else if (par1Str.equals("mobSpellAmbient")) {
/*      */         
/* 2027 */         azx azx = new azx((yc)this.h, par2, par4, par6, 0.0D, 0.0D, 0.0D);
/* 2028 */         azx.g(0.15F);
/* 2029 */         azx.b((float)par8, (float)par10, (float)par12);
/*      */       }
/* 2031 */       else if (par1Str.equals("spell")) {
/*      */         
/* 2033 */         azx azx = new azx((yc)this.h, par2, par4, par6, par8, par10, par12);
/*      */       }
/* 2035 */       else if (par1Str.equals("instantSpell")) {
/*      */         
/* 2037 */         azx azx = new azx((yc)this.h, par2, par4, par6, par8, par10, par12);
/* 2038 */         azx.a(144);
/*      */       }
/* 2040 */       else if (par1Str.equals("witchMagic")) {
/*      */         
/* 2042 */         azx azx = new azx((yc)this.h, par2, par4, par6, par8, par10, par12);
/* 2043 */         azx.a(144);
/* 2044 */         float var24 = this.h.t.nextFloat() * 0.5F + 0.35F;
/* 2045 */         azx.b(1.0F * var24, 0.0F * var24, 1.0F * var24);
/*      */       }
/* 2047 */       else if (par1Str.equals("note")) {
/*      */         
/* 2049 */         azp azp = new azp((yc)this.h, par2, par4, par6, par8, par10, par12);
/*      */       }
/* 2051 */       else if (par1Str.equals("portal")) {
/*      */         
/* 2053 */         azt azt = new azt((yc)this.h, par2, par4, par6, par8, par10, par12);
/*      */       }
/* 2055 */       else if (par1Str.equals("enchantmenttable")) {
/*      */         
/* 2057 */         azd azd = new azd((yc)this.h, par2, par4, par6, par8, par10, par12);
/*      */       }
/* 2059 */       else if (par1Str.equals("explode")) {
/*      */         
/* 2061 */         aze aze = new aze((yc)this.h, par2, par4, par6, par8, par10, par12);
/*      */       }
/* 2063 */       else if (par1Str.equals("flame")) {
/*      */         
/* 2065 */         azj azj = new azj((yc)this.h, par2, par4, par6, par8, par10, par12);
/*      */       }
/* 2067 */       else if (par1Str.equals("lava")) {
/*      */         
/* 2069 */         azo azo = new azo((yc)this.h, par2, par4, par6);
/*      */       }
/* 2071 */       else if (par1Str.equals("footstep")) {
/*      */         
/* 2073 */         azk azk = new azk(this.i, (yc)this.h, par2, par4, par6);
/*      */       }
/* 2075 */       else if (par1Str.equals("splash")) {
/*      */         
/* 2077 */         azy azy = new azy((yc)this.h, par2, par4, par6, par8, par10, par12);
/*      */       }
/* 2079 */       else if (par1Str.equals("largesmoke")) {
/*      */         
/* 2081 */         azv azv = new azv((yc)this.h, par2, par4, par6, par8, par10, par12, 2.5F);
/*      */       }
/* 2083 */       else if (par1Str.equals("cloud")) {
/*      */         
/* 2085 */         azs azs = new azs((yc)this.h, par2, par4, par6, par8, par10, par12);
/*      */       }
/* 2087 */       else if (par1Str.equals("reddust")) {
/*      */         
/* 2089 */         azu azu = new azu((yc)this.h, par2, par4, par6, (float)par8, (float)par10, (float)par12);
/*      */       }
/* 2091 */       else if (par1Str.equals("snowballpoof")) {
/*      */         
/* 2093 */         ayy ayy = new ayy((yc)this.h, par2, par4, par6, up.aD);
/* 2094 */         effectObject = up.aD;
/*      */       }
/* 2096 */       else if (par1Str.equals("dripWater")) {
/*      */         
/* 2098 */         azc azc = new azc((yc)this.h, par2, par4, par6, agi.h);
/*      */       }
/* 2100 */       else if (par1Str.equals("dripLava")) {
/*      */         
/* 2102 */         azc azc = new azc((yc)this.h, par2, par4, par6, agi.i);
/*      */       }
/* 2104 */       else if (par1Str.equals("snowshovel")) {
/*      */         
/* 2106 */         azw azw = new azw((yc)this.h, par2, par4, par6, par8, par10, par12);
/*      */       }
/* 2108 */       else if (par1Str.equals("slime")) {
/*      */         
/* 2110 */         ayy ayy = new ayy((yc)this.h, par2, par4, par6, up.aM);
/* 2111 */         effectObject = up.aM;
/*      */       }
/* 2113 */       else if (par1Str.equals("heart")) {
/*      */         
/* 2115 */         azl azl = new azl((yc)this.h, par2, par4, par6, par8, par10, par12);
/*      */       }
/* 2117 */       else if (par1Str.equals("angryVillager")) {
/*      */         
/* 2119 */         azl azl = new azl((yc)this.h, par2, par4 + 0.5D, par6, par8, par10, par12);
/* 2120 */         azl.i(81);
/* 2121 */         azl.b(1.0F, 1.0F, 1.0F);
/*      */       }
/* 2123 */       else if (par1Str.equals("happyVillager")) {
/*      */         
/* 2125 */         baa baa = new baa((yc)this.h, par2, par4, par6, par8, par10, par12);
/* 2126 */         baa.i(82);
/* 2127 */         baa.b(1.0F, 1.0F, 1.0F);
/*      */       }
/* 2129 */       else if (par1Str.startsWith("iconcrack_")) {
/*      */         
/* 2131 */         int var27 = Integer.parseInt(par1Str.substring(par1Str.indexOf("_") + 1));
/* 2132 */         ayy ayy = new ayy((yc)this.h, par2, par4, par6, par8, par10, par12, up.e[var27]);
/* 2133 */         effectObject = up.e[var27];
/*      */       }
/* 2135 */       else if (par1Str.startsWith("tilecrack_")) {
/*      */         
/* 2137 */         String[] var28 = par1Str.split("_", 3);
/* 2138 */         int var25 = Integer.parseInt(var28[1]);
/* 2139 */         int var26 = Integer.parseInt(var28[2]);
/* 2140 */         bac = (new bac((yc)this.h, par2, par4, par6, par8, par10, par12, amq.p[var25], 0, var26)).a(var26);
/* 2141 */         effectObject = amq.p[var25];
/*      */       } 
/*      */       
/* 2144 */       if (bac != null)
/*      */       {
/* 2146 */         this.q.i.addEffect((azq)bac, effectObject);
/*      */       }
/*      */       
/* 2149 */       return (azq)bac;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2155 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(lq par1Entity) {
/* 2164 */     par1Entity.ad();
/*      */     
/* 2166 */     if (par1Entity.cu != null)
/*      */     {
/* 2168 */       this.i.a(par1Entity.cu, (bat)new bax());
/*      */     }
/*      */     
/* 2171 */     if (par1Entity.cv != null)
/*      */     {
/* 2173 */       this.i.a(par1Entity.cv, (bat)new bax());
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(lq par1Entity) {
/* 2182 */     if (par1Entity.cu != null)
/*      */     {
/* 2184 */       this.i.d(par1Entity.cu);
/*      */     }
/*      */     
/* 2187 */     if (par1Entity.cv != null)
/*      */     {
/* 2189 */       this.i.d(par1Entity.cv);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void f() {
/* 2195 */     arx.b(this.p);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(int par1, int par2, int par3, int par4, int par5) {
/* 2200 */     Random var6 = this.h.t;
/*      */     
/* 2202 */     switch (par1) {
/*      */       
/*      */       case 1013:
/*      */       case 1018:
/* 2206 */         if (this.q.h != null) {
/*      */           
/* 2208 */           double var7 = par2 - this.q.h.t;
/* 2209 */           double var9 = par3 - this.q.h.u;
/* 2210 */           double var11 = par4 - this.q.h.v;
/* 2211 */           double var13 = Math.sqrt(var7 * var7 + var9 * var9 + var11 * var11);
/* 2212 */           double var15 = this.q.h.t;
/* 2213 */           double var17 = this.q.h.u;
/* 2214 */           double var19 = this.q.h.v;
/*      */           
/* 2216 */           if (var13 > 0.0D) {
/*      */             
/* 2218 */             var15 += var7 / var13 * 2.0D;
/* 2219 */             var17 += var9 / var13 * 2.0D;
/* 2220 */             var19 += var11 / var13 * 2.0D;
/*      */           } 
/*      */           
/* 2223 */           if (par1 == 1013) {
/*      */             
/* 2225 */             this.h.a(var15, var17, var19, "mob.wither.spawn", 1.0F, 1.0F, false); break;
/*      */           } 
/* 2227 */           if (par1 == 1018)
/*      */           {
/* 2229 */             this.h.a(var15, var17, var19, "mob.enderdragon.end", 5.0F, 1.0F, false); } 
/*      */         } 
/*      */         break;
/*      */     }  } public void a(qx par1EntityPlayer, int par2, int par3, int par4, int par5, int par6) { double var8, var10, var12;
/*      */     String var14;
/*      */     int var15, var20, var33, var9;
/*      */     double var34;
/*      */     int var35;
/*      */     float var16, var17, var18;
/*      */     String var19;
/*      */     double var36;
/*      */     int var21;
/* 2241 */     Random var7 = this.h.t;
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
/* 2254 */     switch (par2) {
/*      */       
/*      */       case 1000:
/* 2257 */         this.h.a(par3, par4, par5, "random.click", 1.0F, 1.0F, false);
/*      */         break;
/*      */       case 1001:
/* 2260 */         this.h.a(par3, par4, par5, "random.click", 1.0F, 1.2F, false);
/*      */         break;
/*      */       case 1002:
/* 2263 */         this.h.a(par3, par4, par5, "random.bow", 1.0F, 1.2F, false);
/*      */         break;
/*      */       case 1003:
/* 2266 */         if (Math.random() < 0.5D) {
/*      */           
/* 2268 */           this.h.a(par3 + 0.5D, par4 + 0.5D, par5 + 0.5D, "random.door_open", 1.0F, this.h.t.nextFloat() * 0.1F + 0.9F, false);
/*      */           
/*      */           break;
/*      */         } 
/* 2272 */         this.h.a(par3 + 0.5D, par4 + 0.5D, par5 + 0.5D, "random.door_close", 1.0F, this.h.t.nextFloat() * 0.1F + 0.9F, false);
/*      */         break;
/*      */ 
/*      */       
/*      */       case 1004:
/* 2277 */         this.h.a((par3 + 0.5F), (par4 + 0.5F), (par5 + 0.5F), "random.fizz", 0.5F, 2.6F + (var7.nextFloat() - var7.nextFloat()) * 0.8F, false);
/*      */         break;
/*      */       case 1005:
/* 2280 */         if (up.e[par6] instanceof vc) {
/*      */           
/* 2282 */           this.h.a(((vc)up.e[par6]).a, par3, par4, par5);
/*      */           
/*      */           break;
/*      */         } 
/* 2286 */         this.h.a((String)null, par3, par4, par5);
/*      */         break;
/*      */ 
/*      */       
/*      */       case 1007:
/* 2291 */         this.h.a(par3 + 0.5D, par4 + 0.5D, par5 + 0.5D, "mob.ghast.charge", 10.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
/*      */         break;
/*      */       case 1008:
/* 2294 */         this.h.a(par3 + 0.5D, par4 + 0.5D, par5 + 0.5D, "mob.ghast.fireball", 10.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
/*      */         break;
/*      */       case 1009:
/* 2297 */         this.h.a(par3 + 0.5D, par4 + 0.5D, par5 + 0.5D, "mob.ghast.fireball", 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
/*      */         break;
/*      */       case 1010:
/* 2300 */         this.h.a(par3 + 0.5D, par4 + 0.5D, par5 + 0.5D, "mob.zombie.wood", 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
/*      */         break;
/*      */       case 1011:
/* 2303 */         this.h.a(par3 + 0.5D, par4 + 0.5D, par5 + 0.5D, "mob.zombie.metal", 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
/*      */         break;
/*      */       case 1012:
/* 2306 */         this.h.a(par3 + 0.5D, par4 + 0.5D, par5 + 0.5D, "mob.zombie.woodbreak", 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
/*      */         break;
/*      */       case 1014:
/* 2309 */         this.h.a(par3 + 0.5D, par4 + 0.5D, par5 + 0.5D, "mob.wither.shoot", 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
/*      */         break;
/*      */       case 1015:
/* 2312 */         this.h.a(par3 + 0.5D, par4 + 0.5D, par5 + 0.5D, "mob.bat.takeoff", 0.05F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
/*      */         break;
/*      */       case 1016:
/* 2315 */         this.h.a(par3 + 0.5D, par4 + 0.5D, par5 + 0.5D, "mob.zombie.infect", 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
/*      */         break;
/*      */       case 1017:
/* 2318 */         this.h.a(par3 + 0.5D, par4 + 0.5D, par5 + 0.5D, "mob.zombie.unfect", 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
/*      */         break;
/*      */       case 1020:
/* 2321 */         this.h.a((par3 + 0.5F), (par4 + 0.5F), (par5 + 0.5F), "random.anvil_break", 1.0F, this.h.t.nextFloat() * 0.1F + 0.9F, false);
/*      */         break;
/*      */       case 1021:
/* 2324 */         this.h.a((par3 + 0.5F), (par4 + 0.5F), (par5 + 0.5F), "random.anvil_use", 1.0F, this.h.t.nextFloat() * 0.1F + 0.9F, false);
/*      */         break;
/*      */       case 1022:
/* 2327 */         this.h.a((par3 + 0.5F), (par4 + 0.5F), (par5 + 0.5F), "random.anvil_land", 0.3F, this.h.t.nextFloat() * 0.1F + 0.9F, false);
/*      */         break;
/*      */       case 2000:
/* 2330 */         var33 = par6 % 3 - 1;
/* 2331 */         var9 = par6 / 3 % 3 - 1;
/* 2332 */         var10 = par3 + var33 * 0.6D + 0.5D;
/* 2333 */         var12 = par4 + 0.5D;
/* 2334 */         var34 = par5 + var9 * 0.6D + 0.5D;
/*      */         
/* 2336 */         for (var35 = 0; var35 < 10; var35++) {
/*      */           
/* 2338 */           double var37 = var7.nextDouble() * 0.2D + 0.01D;
/* 2339 */           double var38 = var10 + var33 * 0.01D + (var7.nextDouble() - 0.5D) * var9 * 0.5D;
/* 2340 */           double var39 = var12 + (var7.nextDouble() - 0.5D) * 0.5D;
/* 2341 */           double var23 = var34 + var9 * 0.01D + (var7.nextDouble() - 0.5D) * var33 * 0.5D;
/* 2342 */           double var25 = var33 * var37 + var7.nextGaussian() * 0.01D;
/* 2343 */           double var27 = -0.03D + var7.nextGaussian() * 0.01D;
/* 2344 */           double var29 = var9 * var37 + var7.nextGaussian() * 0.01D;
/* 2345 */           a("smoke", var38, var39, var23, var25, var27, var29);
/*      */         } 
/*      */         return;
/*      */       
/*      */       case 2001:
/* 2350 */         var20 = par6 & 0xFFF;
/*      */         
/* 2352 */         if (var20 > 0) {
/*      */           
/* 2354 */           amq var40 = amq.p[var20];
/* 2355 */           this.q.A.a(var40.cz.a(), par3 + 0.5F, par4 + 0.5F, par5 + 0.5F, (var40.cz.c() + 1.0F) / 2.0F, var40.cz.d() * 0.8F);
/*      */         } 
/*      */         
/* 2358 */         this.q.i.a(par3, par4, par5, par6 & 0xFFF, par6 >> 12 & 0xFF);
/*      */         break;
/*      */       case 2002:
/* 2361 */         var8 = par3;
/* 2362 */         var10 = par4;
/* 2363 */         var12 = par5;
/* 2364 */         var14 = "iconcrack_" + up.bs.cj;
/*      */         
/* 2366 */         for (var15 = 0; var15 < 8; var15++)
/*      */         {
/* 2368 */           a(var14, var8, var10, var12, var7.nextGaussian() * 0.15D, var7.nextDouble() * 0.2D, var7.nextGaussian() * 0.15D);
/*      */         }
/*      */         
/* 2371 */         var15 = up.bs.h(par6);
/* 2372 */         var16 = (var15 >> 16 & 0xFF) / 255.0F;
/* 2373 */         var17 = (var15 >> 8 & 0xFF) / 255.0F;
/* 2374 */         var18 = (var15 >> 0 & 0xFF) / 255.0F;
/* 2375 */         var19 = "spell";
/*      */         
/* 2377 */         if (up.bs.i(par6))
/*      */         {
/* 2379 */           var19 = "instantSpell";
/*      */         }
/*      */         
/* 2382 */         for (var20 = 0; var20 < 100; var20++) {
/*      */           
/* 2384 */           double var39 = var7.nextDouble() * 4.0D;
/* 2385 */           double var23 = var7.nextDouble() * Math.PI * 2.0D;
/* 2386 */           double var25 = Math.cos(var23) * var39;
/* 2387 */           double var27 = 0.01D + var7.nextDouble() * 0.5D;
/* 2388 */           double var29 = Math.sin(var23) * var39;
/* 2389 */           azq var31 = b(var19, var8 + var25 * 0.1D, var10 + 0.3D, var12 + var29 * 0.1D, var25, var27, var29);
/*      */           
/* 2391 */           if (var31 != null) {
/*      */             
/* 2393 */             float var32 = 0.75F + var7.nextFloat() * 0.25F;
/* 2394 */             var31.b(var16 * var32, var17 * var32, var18 * var32);
/* 2395 */             var31.e((float)var39);
/*      */           } 
/*      */         } 
/*      */         
/* 2399 */         this.h.a(par3 + 0.5D, par4 + 0.5D, par5 + 0.5D, "random.glass", 1.0F, this.h.t.nextFloat() * 0.1F + 0.9F, false);
/*      */         break;
/*      */       case 2003:
/* 2402 */         var8 = par3 + 0.5D;
/* 2403 */         var10 = par4;
/* 2404 */         var12 = par5 + 0.5D;
/* 2405 */         var14 = "iconcrack_" + up.bA.cj;
/*      */         
/* 2407 */         for (var15 = 0; var15 < 8; var15++)
/*      */         {
/* 2409 */           a(var14, var8, var10, var12, var7.nextGaussian() * 0.15D, var7.nextDouble() * 0.2D, var7.nextGaussian() * 0.15D);
/*      */         }
/*      */         
/* 2412 */         for (var36 = 0.0D; var36 < 6.283185307179586D; var36 += 0.15707963267948966D) {
/*      */           
/* 2414 */           a("portal", var8 + Math.cos(var36) * 5.0D, var10 - 0.4D, var12 + Math.sin(var36) * 5.0D, Math.cos(var36) * -5.0D, 0.0D, Math.sin(var36) * -5.0D);
/* 2415 */           a("portal", var8 + Math.cos(var36) * 5.0D, var10 - 0.4D, var12 + Math.sin(var36) * 5.0D, Math.cos(var36) * -7.0D, 0.0D, Math.sin(var36) * -7.0D);
/*      */         } 
/*      */         return;
/*      */       
/*      */       case 2004:
/* 2420 */         for (var21 = 0; var21 < 20; var21++) {
/*      */           
/* 2422 */           double var22 = par3 + 0.5D + (this.h.t.nextFloat() - 0.5D) * 2.0D;
/* 2423 */           double var24 = par4 + 0.5D + (this.h.t.nextFloat() - 0.5D) * 2.0D;
/* 2424 */           double var26 = par5 + 0.5D + (this.h.t.nextFloat() - 0.5D) * 2.0D;
/* 2425 */           this.h.a("smoke", var22, var24, var26, 0.0D, 0.0D, 0.0D);
/* 2426 */           this.h.a("flame", var22, var24, var26, 0.0D, 0.0D, 0.0D);
/*      */         } 
/*      */         break;
/*      */     }  }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(int par1, int par2, int par3, int par4, int par5) {
/* 2437 */     if (par5 >= 0 && par5 < 10) {
/*      */       
/* 2439 */       ie var6 = (ie)this.E.get(Integer.valueOf(par1));
/*      */       
/* 2441 */       if (var6 == null || var6.b() != par2 || var6.c() != par3 || var6.d() != par4) {
/*      */         
/* 2443 */         var6 = new ie(par1, par2, par3, par4);
/* 2444 */         this.E.put(Integer.valueOf(par1), var6);
/*      */       } 
/*      */       
/* 2447 */       var6.a(par5);
/* 2448 */       var6.b(this.u);
/*      */     }
/*      */     else {
/*      */       
/* 2452 */       this.E.remove(Integer.valueOf(par1));
/*      */     } 
/*      */   }
/*      */ }


/* Location:              /home/luigi/Documents/JAR.jar!/bav.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */