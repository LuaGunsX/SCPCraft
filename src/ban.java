/*      */ import SCPCraft.mod_SCP;
/*      */ import cpw.mods.fml.relauncher.Side;
/*      */ import cpw.mods.fml.relauncher.SideOnly;
/*      */ import java.awt.image.BufferedImage;
/*      */ import java.nio.FloatBuffer;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import java.util.concurrent.Callable;
/*      */ import net.minecraft.client.Minecraft;
/*      */ import net.minecraftforge.client.ForgeHooksClient;
/*      */ import org.lwjgl.input.Mouse;
/*      */ import org.lwjgl.opengl.Display;
/*      */ import org.lwjgl.opengl.GL11;
/*      */ import org.lwjgl.opengl.GLContext;
/*      */ import org.lwjgl.util.glu.GLU;
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
/*      */ public class ban
/*      */ {
/*      */   public static boolean a = false;
/*      */   public static int b;
/*      */   private Minecraft r;
/*   56 */   private float s = 0.0F;
/*      */ 
/*      */   
/*      */   public bau c;
/*      */   
/*      */   private int t;
/*      */   
/*   63 */   private lq u = null;
/*   64 */   private kl v = new kl();
/*   65 */   private kl w = new kl();
/*      */ 
/*      */   
/*   68 */   private kl x = new kl();
/*      */ 
/*      */   
/*   71 */   private kl y = new kl();
/*      */ 
/*      */   
/*   74 */   private kl z = new kl();
/*      */ 
/*      */   
/*   77 */   private kl A = new kl();
/*   78 */   private float B = 4.0F;
/*      */ 
/*      */   
/*   81 */   private float C = 4.0F;
/*   82 */   private float D = 0.0F;
/*   83 */   private float E = 0.0F;
/*   84 */   private float F = 0.0F;
/*   85 */   private float G = 0.0F;
/*      */ 
/*      */   
/*      */   private float H;
/*      */ 
/*      */   
/*      */   private float I;
/*      */ 
/*      */   
/*      */   private float J;
/*      */ 
/*      */   
/*      */   private float K;
/*      */   
/*      */   private float L;
/*      */   
/*  101 */   private float M = 0.0F;
/*  102 */   private float N = 0.0F;
/*  103 */   private float O = 0.0F;
/*  104 */   private float P = 0.0F;
/*      */ 
/*      */   
/*      */   public int d;
/*      */ 
/*      */   
/*      */   private int[] Q;
/*      */ 
/*      */   
/*      */   private float R;
/*      */ 
/*      */   
/*      */   private float S;
/*      */ 
/*      */   
/*      */   private float T;
/*      */ 
/*      */   
/*      */   private float U;
/*      */ 
/*      */   
/*      */   private float V;
/*      */   
/*      */   private boolean W = false;
/*      */   
/*  129 */   private double X = 1.0D;
/*  130 */   private double Y = 0.0D;
/*  131 */   private double Z = 0.0D;
/*      */ 
/*      */   
/*  134 */   private long aa = Minecraft.F();
/*      */ 
/*      */   
/*  137 */   private long ab = 0L;
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ac = false;
/*      */ 
/*      */ 
/*      */   
/*  145 */   float e = 0.0F;
/*      */ 
/*      */   
/*  148 */   float f = 0.0F;
/*      */ 
/*      */   
/*  151 */   float g = 0.0F;
/*      */ 
/*      */   
/*  154 */   float h = 0.0F;
/*  155 */   private Random ad = new Random();
/*      */ 
/*      */   
/*  158 */   private int ae = 0;
/*      */ 
/*      */   
/*      */   float[] i;
/*      */   
/*      */   float[] j;
/*      */   
/*  165 */   volatile int k = 0;
/*  166 */   volatile int l = 0;
/*      */ 
/*      */   
/*  169 */   FloatBuffer m = arx.h(16);
/*      */ 
/*      */ 
/*      */   
/*      */   float n;
/*      */ 
/*      */   
/*      */   float o;
/*      */ 
/*      */   
/*      */   float p;
/*      */ 
/*      */   
/*      */   private float af;
/*      */ 
/*      */   
/*      */   private float ag;
/*      */ 
/*      */   
/*      */   public int q;
/*      */ 
/*      */ 
/*      */   
/*      */   public ban(Minecraft par1Minecraft) {
/*  193 */     this.r = par1Minecraft;
/*  194 */     this.c = new bau(par1Minecraft);
/*  195 */     this.d = par1Minecraft.o.a(new BufferedImage(16, 16, 1));
/*  196 */     this.Q = new int[256];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a() {
/*  204 */     e();
/*  205 */     f();
/*  206 */     this.af = this.ag;
/*  207 */     this.C = this.B;
/*  208 */     this.E = this.D;
/*  209 */     this.G = this.F;
/*  210 */     this.N = this.M;
/*  211 */     this.P = this.O;
/*      */ 
/*      */ 
/*      */     
/*  215 */     if (this.r.y.ab) {
/*      */       
/*  217 */       float f1 = this.r.y.c * 0.6F + 0.2F;
/*  218 */       float f2 = f1 * f1 * f1 * 8.0F;
/*  219 */       this.J = this.v.a(this.H, 0.05F * f2);
/*  220 */       this.K = this.w.a(this.I, 0.05F * f2);
/*  221 */       this.L = 0.0F;
/*  222 */       this.H = 0.0F;
/*  223 */       this.I = 0.0F;
/*      */     } 
/*      */     
/*  226 */     if (this.r.h == null)
/*      */     {
/*  228 */       this.r.h = (md)this.r.g;
/*      */     }
/*      */     
/*  231 */     float var1 = this.r.e.p(ke.c(this.r.h.t), ke.c(this.r.h.u), ke.c(this.r.h.v));
/*  232 */     float var2 = (3 - this.r.y.e) / 3.0F;
/*  233 */     float var3 = var1 * (1.0F - var2) + var2;
/*  234 */     this.ag += (var3 - this.ag) * 0.1F;
/*  235 */     this.t++;
/*  236 */     this.c.a();
/*  237 */     g();
/*  238 */     this.V = this.U;
/*      */     
/*  240 */     if (bai.d) {
/*      */       
/*  242 */       this.U += 0.05F;
/*      */       
/*  244 */       if (this.U > 1.0F)
/*      */       {
/*  246 */         this.U = 1.0F;
/*      */       }
/*      */       
/*  249 */       bai.d = false;
/*      */     }
/*  251 */     else if (this.U > 0.0F) {
/*      */       
/*  253 */       this.U -= 0.0125F;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(float par1) {
/*  262 */     if (this.r.h != null)
/*      */     {
/*  264 */       if (this.r.e != null) {
/*      */         
/*  266 */         double var2 = this.r.b.d();
/*  267 */         this.r.x = this.r.h.a(var2, par1);
/*  268 */         double var4 = var2;
/*  269 */         aoj var6 = this.r.h.h(par1);
/*      */         
/*  271 */         if (this.r.b.i()) {
/*      */           
/*  273 */           var2 = 6.0D;
/*  274 */           var4 = 6.0D;
/*      */         }
/*      */         else {
/*      */           
/*  278 */           if (var2 > 3.0D)
/*      */           {
/*  280 */             var4 = 3.0D;
/*      */           }
/*      */           
/*  283 */           var2 = var4;
/*      */         } 
/*      */         
/*  286 */         if (this.r.x != null)
/*      */         {
/*  288 */           var4 = this.r.x.f.d(var6);
/*      */         }
/*      */         
/*  291 */         aoj var7 = this.r.h.i(par1);
/*  292 */         aoj var8 = var6.c(var7.c * var2, var7.d * var2, var7.e * var2);
/*  293 */         this.u = null;
/*  294 */         float var9 = 1.0F;
/*  295 */         List<lq> var10 = this.r.e.b(this.r.h, this.r.h.D.a(var7.c * var2, var7.d * var2, var7.e * var2).b(var9, var9, var9));
/*  296 */         double var11 = var4;
/*      */         
/*  298 */         for (int var13 = 0; var13 < var10.size(); var13++) {
/*      */           
/*  300 */           lq var14 = var10.get(var13);
/*      */           
/*  302 */           if (var14.L()) {
/*      */             
/*  304 */             float var15 = var14.Y();
/*  305 */             aoe var16 = var14.D.b(var15, var15, var15);
/*  306 */             aoh var17 = var16.a(var6, var8);
/*      */             
/*  308 */             if (var16.a(var6)) {
/*      */               
/*  310 */               if (0.0D < var11 || var11 == 0.0D)
/*      */               {
/*  312 */                 this.u = var14;
/*  313 */                 var11 = 0.0D;
/*      */               }
/*      */             
/*  316 */             } else if (var17 != null) {
/*      */               
/*  318 */               double var18 = var6.d(var17.f);
/*      */               
/*  320 */               if (var18 < var11 || var11 == 0.0D) {
/*      */                 
/*  322 */                 this.u = var14;
/*  323 */                 var11 = var18;
/*      */               } 
/*      */             } 
/*      */           } 
/*      */         } 
/*      */         
/*  329 */         if (this.u != null && (var11 < var4 || this.r.x == null))
/*      */         {
/*  331 */           this.r.x = new aoh(this.u);
/*      */         }
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void e() {
/*  342 */     if (this.r.h instanceof bag) {
/*      */       
/*  344 */       bag var1 = (bag)this.r.h;
/*  345 */       this.T = var1.g();
/*      */     }
/*      */     else {
/*      */       
/*  349 */       this.T = this.r.g.g();
/*      */     } 
/*  351 */     this.S = this.R;
/*  352 */     this.R += (this.T - this.R) * 0.5F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private float a(float par1, boolean par2) {
/*  360 */     if (this.q > 0)
/*      */     {
/*  362 */       return 90.0F;
/*      */     }
/*      */ 
/*      */     
/*  366 */     md var3 = this.r.h;
/*  367 */     float var4 = 70.0F;
/*      */     
/*  369 */     if (par2) {
/*      */       
/*  371 */       var4 += this.r.y.af * 40.0F;
/*  372 */       var4 *= this.S + (this.R - this.S) * par1;
/*      */     } 
/*      */     
/*  375 */     if (var3.aU() <= 0) {
/*      */       
/*  377 */       float var5 = var3.aY + par1;
/*  378 */       var4 /= (1.0F - 500.0F / (var5 + 500.0F)) * 2.0F + 1.0F;
/*      */     } 
/*      */     
/*  381 */     int var6 = aro.a((yc)this.r.e, var3, par1);
/*      */     
/*  383 */     if (var6 != 0 && (amq.p[var6]).cB == agi.h)
/*      */     {
/*  385 */       var4 = var4 * 60.0F / 70.0F;
/*      */     }
/*      */     
/*  388 */     return var4 + this.N + (this.M - this.N) * par1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void e(float par1) {
/*  394 */     md var2 = this.r.h;
/*  395 */     float var3 = var2.aV - par1;
/*      */ 
/*      */     
/*  398 */     if (var2.aU() <= 0) {
/*      */       
/*  400 */       float var4 = var2.aY + par1;
/*  401 */       GL11.glRotatef(40.0F - 8000.0F / (var4 + 200.0F), 0.0F, 0.0F, 1.0F);
/*      */     } 
/*      */     
/*  404 */     if (var3 >= 0.0F) {
/*      */       
/*  406 */       var3 /= var2.aW;
/*  407 */       var3 = ke.a(var3 * var3 * var3 * var3 * 3.1415927F);
/*  408 */       float var4 = var2.aX;
/*  409 */       GL11.glRotatef(-var4, 0.0F, 1.0F, 0.0F);
/*  410 */       GL11.glRotatef(-var3 * 14.0F, 0.0F, 0.0F, 1.0F);
/*  411 */       GL11.glRotatef(var4, 0.0F, 1.0F, 0.0F);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void f(float par1) {
/*  420 */     if (this.r.h instanceof qx) {
/*      */       
/*  422 */       qx var2 = (qx)this.r.h;
/*  423 */       float var3 = var2.Q - var2.P;
/*  424 */       float var4 = -(var2.Q + var3 * par1);
/*  425 */       float var5 = var2.bP + (var2.bQ - var2.bP) * par1;
/*  426 */       float var6 = var2.ba + (var2.bb - var2.ba) * par1;
/*  427 */       GL11.glTranslatef(ke.a(var4 * 3.1415927F) * var5 * 0.5F, -Math.abs(ke.b(var4 * 3.1415927F) * var5), 0.0F);
/*  428 */       GL11.glRotatef(ke.a(var4 * 3.1415927F) * var5 * 3.0F, 0.0F, 0.0F, 1.0F);
/*  429 */       GL11.glRotatef(Math.abs(ke.b(var4 * 3.1415927F - 0.2F) * var5) * 5.0F, 1.0F, 0.0F, 0.0F);
/*  430 */       GL11.glRotatef(var6, 1.0F, 0.0F, 0.0F);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void g(float par1) {
/*  439 */     md var2 = this.r.h;
/*  440 */     float var3 = var2.M - 1.62F;
/*  441 */     double var4 = var2.q + (var2.t - var2.q) * par1;
/*  442 */     double var6 = var2.r + (var2.u - var2.r) * par1 - var3;
/*  443 */     double var8 = var2.s + (var2.v - var2.s) * par1;
/*  444 */     GL11.glRotatef(this.P + (this.O - this.P) * par1, 0.0F, 0.0F, 1.0F);
/*      */     
/*  446 */     if (var2.bw()) {
/*      */       
/*  448 */       var3 = (float)(var3 + 1.0D);
/*  449 */       GL11.glTranslatef(0.0F, 0.3F, 0.0F);
/*      */       
/*  451 */       if (!this.r.y.ac)
/*      */       {
/*  453 */         ForgeHooksClient.orientBedCamera(this.r, var2);
/*  454 */         GL11.glRotatef(var2.B + (var2.z - var2.B) * par1 + 180.0F, 0.0F, -1.0F, 0.0F);
/*  455 */         GL11.glRotatef(var2.C + (var2.A - var2.C) * par1, -1.0F, 0.0F, 0.0F);
/*      */       }
/*      */     
/*  458 */     } else if (this.r.y.W > 0) {
/*      */       
/*  460 */       double var27 = (this.C + (this.B - this.C) * par1);
/*      */ 
/*      */ 
/*      */       
/*  464 */       if (this.r.y.ac)
/*      */       {
/*  466 */         float var28 = this.E + (this.D - this.E) * par1;
/*  467 */         float var13 = this.G + (this.F - this.G) * par1;
/*  468 */         GL11.glTranslatef(0.0F, 0.0F, (float)-var27);
/*  469 */         GL11.glRotatef(var13, 1.0F, 0.0F, 0.0F);
/*  470 */         GL11.glRotatef(var28, 0.0F, 1.0F, 0.0F);
/*      */       }
/*      */       else
/*      */       {
/*  474 */         float var28 = var2.z;
/*  475 */         float var13 = var2.A;
/*      */         
/*  477 */         if (this.r.y.W == 2)
/*      */         {
/*  479 */           var13 += 180.0F;
/*      */         }
/*      */         
/*  482 */         double var14 = (-ke.a(var28 / 180.0F * 3.1415927F) * ke.b(var13 / 180.0F * 3.1415927F)) * var27;
/*  483 */         double var16 = (ke.b(var28 / 180.0F * 3.1415927F) * ke.b(var13 / 180.0F * 3.1415927F)) * var27;
/*  484 */         double var18 = -ke.a(var13 / 180.0F * 3.1415927F) * var27;
/*      */         
/*  486 */         for (int var20 = 0; var20 < 8; var20++) {
/*      */           
/*  488 */           float var21 = ((var20 & 0x1) * 2 - 1);
/*  489 */           float var22 = ((var20 >> 1 & 0x1) * 2 - 1);
/*  490 */           float var23 = ((var20 >> 2 & 0x1) * 2 - 1);
/*  491 */           var21 *= 0.1F;
/*  492 */           var22 *= 0.1F;
/*  493 */           var23 *= 0.1F;
/*  494 */           aoh var24 = this.r.e.a(this.r.e.S().a(var4 + var21, var6 + var22, var8 + var23), this.r.e.S().a(var4 - var14 + var21 + var23, var6 - var18 + var22, var8 - var16 + var23));
/*      */           
/*  496 */           if (var24 != null) {
/*      */             
/*  498 */             double var25 = var24.f.d(this.r.e.S().a(var4, var6, var8));
/*      */             
/*  500 */             if (var25 < var27)
/*      */             {
/*  502 */               var27 = var25;
/*      */             }
/*      */           } 
/*      */         } 
/*      */         
/*  507 */         if (this.r.y.W == 2)
/*      */         {
/*  509 */           GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
/*      */         }
/*      */         
/*  512 */         GL11.glRotatef(var2.A - var13, 1.0F, 0.0F, 0.0F);
/*  513 */         GL11.glRotatef(var2.z - var28, 0.0F, 1.0F, 0.0F);
/*  514 */         GL11.glTranslatef(0.0F, 0.0F, (float)-var27);
/*  515 */         GL11.glRotatef(var28 - var2.z, 0.0F, 1.0F, 0.0F);
/*  516 */         GL11.glRotatef(var13 - var2.A, 1.0F, 0.0F, 0.0F);
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/*  521 */       GL11.glTranslatef(0.0F, 0.0F, -0.1F);
/*      */     } 
/*      */     
/*  524 */     if (!this.r.y.ac) {
/*      */       
/*  526 */       GL11.glRotatef(var2.C + (var2.A - var2.C) * par1, 1.0F, 0.0F, 0.0F);
/*  527 */       GL11.glRotatef(var2.B + (var2.z - var2.B) * par1 + 180.0F, 0.0F, 1.0F, 0.0F);
/*      */     } 
/*      */     
/*  530 */     GL11.glTranslatef(0.0F, var3, 0.0F);
/*  531 */     var4 = var2.q + (var2.t - var2.q) * par1;
/*  532 */     var6 = var2.r + (var2.u - var2.r) * par1 - var3;
/*  533 */     var8 = var2.s + (var2.v - var2.s) * par1;
/*  534 */     this.W = this.r.f.a(var4, var6, var8, par1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void a(float par1, int par2) {
/*  542 */     this.s = (256 >> this.r.y.e);
/*  543 */     GL11.glMatrixMode(5889);
/*  544 */     GL11.glLoadIdentity();
/*  545 */     float var3 = 0.07F;
/*      */     
/*  547 */     if (this.r.y.g)
/*      */     {
/*  549 */       GL11.glTranslatef(-(par2 * 2 - 1) * var3, 0.0F, 0.0F);
/*      */     }
/*      */     
/*  552 */     if (this.X != 1.0D) {
/*      */       
/*  554 */       GL11.glTranslatef((float)this.Y, (float)-this.Z, 0.0F);
/*  555 */       GL11.glScaled(this.X, this.X, 1.0D);
/*      */     } 
/*      */     
/*  558 */     GLU.gluPerspective(a(par1, true), this.r.c / this.r.d, 0.05F, this.s * 2.0F);
/*      */ 
/*      */     
/*  561 */     if (this.r.b.a()) {
/*      */       
/*  563 */       float f = 0.6666667F;
/*  564 */       GL11.glScalef(1.0F, f, 1.0F);
/*      */     } 
/*      */     
/*  567 */     GL11.glMatrixMode(5888);
/*  568 */     GL11.glLoadIdentity();
/*      */     
/*  570 */     if (this.r.y.g)
/*      */     {
/*  572 */       GL11.glTranslatef((par2 * 2 - 1) * 0.1F, 0.0F, 0.0F);
/*      */     }
/*      */     
/*  575 */     e(par1);
/*      */     
/*  577 */     if (this.r.y.f)
/*      */     {
/*  579 */       f(par1);
/*      */     }
/*      */     
/*  582 */     float var4 = this.r.g.ck + (this.r.g.j - this.r.g.ck) * par1;
/*      */     
/*  584 */     if (var4 > 0.0F) {
/*      */       
/*  586 */       byte var5 = 20;
/*      */       
/*  588 */       if (this.r.g.a(ll.k))
/*      */       {
/*  590 */         var5 = 7;
/*      */       }
/*      */       
/*  593 */       float var6 = 5.0F / (var4 * var4 + 5.0F) - var4 * 0.04F;
/*  594 */       var6 *= var6;
/*  595 */       GL11.glRotatef((this.t + par1) * var5, 0.0F, 1.0F, 1.0F);
/*  596 */       GL11.glScalef(1.0F / var6, 1.0F, 1.0F);
/*  597 */       GL11.glRotatef(-(this.t + par1) * var5, 0.0F, 1.0F, 1.0F);
/*      */     } 
/*      */ 
/*      */     
/*  601 */     if (this.r.g.a(mod_SCP.shake))
/*      */     {
/*  603 */       if (this.r.g.b(mod_SCP.shake).c() != 0 && this.r.g.b(mod_SCP.shake).b() != 0)
/*  604 */       { GL11.glTranslatef(0.3F * par1 * this.r.g.b(mod_SCP.shake).c(), 0.0F, 0.0F); }
/*  605 */       else { GL11.glTranslatef(0.3F * par1, 0.0F, 0.0F); }
/*      */     
/*      */     }
/*  608 */     g(par1);
/*      */     
/*  610 */     if (this.q > 0) {
/*      */       
/*  612 */       int var7 = this.q - 1;
/*      */       
/*  614 */       if (var7 == 1)
/*      */       {
/*  616 */         GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
/*      */       }
/*      */       
/*  619 */       if (var7 == 2)
/*      */       {
/*  621 */         GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
/*      */       }
/*      */       
/*  624 */       if (var7 == 3)
/*      */       {
/*  626 */         GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
/*      */       }
/*      */       
/*  629 */       if (var7 == 4)
/*      */       {
/*  631 */         GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
/*      */       }
/*      */       
/*  634 */       if (var7 == 5)
/*      */       {
/*  636 */         GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void b(float par1, int par2) {
/*  646 */     if (this.q <= 0) {
/*      */       
/*  648 */       GL11.glMatrixMode(5889);
/*  649 */       GL11.glLoadIdentity();
/*  650 */       float var3 = 0.07F;
/*      */       
/*  652 */       if (this.r.y.g)
/*      */       {
/*  654 */         GL11.glTranslatef(-(par2 * 2 - 1) * var3, 0.0F, 0.0F);
/*      */       }
/*      */       
/*  657 */       if (this.X != 1.0D) {
/*      */         
/*  659 */         GL11.glTranslatef((float)this.Y, (float)-this.Z, 0.0F);
/*  660 */         GL11.glScaled(this.X, this.X, 1.0D);
/*      */       } 
/*      */       
/*  663 */       GLU.gluPerspective(a(par1, false), this.r.c / this.r.d, 0.05F, this.s * 2.0F);
/*      */       
/*  665 */       if (this.r.b.a()) {
/*      */         
/*  667 */         float var4 = 0.6666667F;
/*  668 */         GL11.glScalef(1.0F, var4, 1.0F);
/*      */       } 
/*      */       
/*  671 */       GL11.glMatrixMode(5888);
/*  672 */       GL11.glLoadIdentity();
/*      */       
/*  674 */       if (this.r.y.g)
/*      */       {
/*  676 */         GL11.glTranslatef((par2 * 2 - 1) * 0.1F, 0.0F, 0.0F);
/*      */       }
/*      */       
/*  679 */       GL11.glPushMatrix();
/*  680 */       e(par1);
/*      */       
/*  682 */       if (this.r.y.f)
/*      */       {
/*  684 */         f(par1);
/*      */       }
/*      */       
/*  687 */       if (this.r.y.W == 0 && !this.r.h.bw() && !this.r.y.V && !this.r.b.a()) {
/*      */         
/*  689 */         b(par1);
/*  690 */         this.c.a(par1);
/*  691 */         a(par1);
/*      */       } 
/*      */       
/*  694 */       GL11.glPopMatrix();
/*      */       
/*  696 */       if (this.r.y.W == 0 && !this.r.h.bw()) {
/*      */         
/*  698 */         this.c.b(par1);
/*  699 */         e(par1);
/*      */       } 
/*      */       
/*  702 */       if (this.r.y.f)
/*      */       {
/*  704 */         f(par1);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(double par1) {
/*  714 */     bfe.a(bfe.b);
/*  715 */     GL11.glDisable(3553);
/*  716 */     bfe.a(bfe.a);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(double par1) {
/*  724 */     bfe.a(bfe.b);
/*  725 */     GL11.glMatrixMode(5890);
/*  726 */     GL11.glLoadIdentity();
/*  727 */     float var3 = 0.00390625F;
/*  728 */     GL11.glScalef(var3, var3, var3);
/*  729 */     GL11.glTranslatef(8.0F, 8.0F, 8.0F);
/*  730 */     GL11.glMatrixMode(5888);
/*  731 */     this.r.o.b(this.d);
/*  732 */     GL11.glTexParameteri(3553, 10241, 9729);
/*  733 */     GL11.glTexParameteri(3553, 10240, 9729);
/*  734 */     GL11.glTexParameteri(3553, 10241, 9729);
/*  735 */     GL11.glTexParameteri(3553, 10240, 9729);
/*  736 */     GL11.glTexParameteri(3553, 10242, 10496);
/*  737 */     GL11.glTexParameteri(3553, 10243, 10496);
/*  738 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  739 */     GL11.glEnable(3553);
/*  740 */     bfe.a(bfe.a);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void f() {
/*  748 */     this.f = (float)(this.f + (Math.random() - Math.random()) * Math.random() * Math.random());
/*  749 */     this.h = (float)(this.h + (Math.random() - Math.random()) * Math.random() * Math.random());
/*  750 */     this.f = (float)(this.f * 0.9D);
/*  751 */     this.h = (float)(this.h * 0.9D);
/*  752 */     this.e += (this.f - this.e) * 1.0F;
/*  753 */     this.g += (this.h - this.g) * 1.0F;
/*  754 */     this.ac = true;
/*      */   }
/*      */ 
/*      */   
/*      */   private void h(float par1) {
/*  759 */     ayp var2 = this.r.e;
/*      */     
/*  761 */     if (var2 != null) {
/*      */       
/*  763 */       for (int var3 = 0; var3 < 256; var3++) {
/*      */         
/*  765 */         float var4 = var2.b(1.0F) * 0.95F + 0.05F;
/*  766 */         float var5 = var2.u.g[var3 / 16] * var4;
/*  767 */         float var6 = var2.u.g[var3 % 16] * (this.e * 0.1F + 1.5F);
/*      */         
/*  769 */         if (var2.q > 0)
/*      */         {
/*  771 */           var5 = var2.u.g[var3 / 16];
/*      */         }
/*      */         
/*  774 */         float var7 = var5 * (var2.b(1.0F) * 0.65F + 0.35F);
/*  775 */         float var8 = var5 * (var2.b(1.0F) * 0.65F + 0.35F);
/*  776 */         float var11 = var6 * ((var6 * 0.6F + 0.4F) * 0.6F + 0.4F);
/*  777 */         float var12 = var6 * (var6 * var6 * 0.6F + 0.4F);
/*  778 */         float var13 = var7 + var6;
/*  779 */         float var14 = var8 + var11;
/*  780 */         float var15 = var5 + var12;
/*  781 */         var13 = var13 * 0.96F + 0.03F;
/*  782 */         var14 = var14 * 0.96F + 0.03F;
/*  783 */         var15 = var15 * 0.96F + 0.03F;
/*      */ 
/*      */         
/*  786 */         if (this.U > 0.0F) {
/*      */           
/*  788 */           float f = this.V + (this.U - this.V) * par1;
/*  789 */           var13 = var13 * (1.0F - f) + var13 * 0.7F * f;
/*  790 */           var14 = var14 * (1.0F - f) + var14 * 0.6F * f;
/*  791 */           var15 = var15 * (1.0F - f) + var15 * 0.6F * f;
/*      */         } 
/*      */         
/*  794 */         if (var2.u.h == 1) {
/*      */           
/*  796 */           var13 = 0.22F + var6 * 0.75F;
/*  797 */           var14 = 0.28F + var11 * 0.75F;
/*  798 */           var15 = 0.25F + var12 * 0.75F;
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/*  803 */         if (this.r.g.a(ll.r)) {
/*      */           
/*  805 */           float f1 = a((qx)this.r.g, par1);
/*  806 */           float f2 = 1.0F / var13;
/*      */           
/*  808 */           if (f2 > 1.0F / var14)
/*      */           {
/*  810 */             f2 = 1.0F / var14;
/*      */           }
/*      */           
/*  813 */           if (f2 > 1.0F / var15)
/*      */           {
/*  815 */             f2 = 1.0F / var15;
/*      */           }
/*      */           
/*  818 */           var13 = var13 * (1.0F - f1) + var13 * f2 * f1;
/*  819 */           var14 = var14 * (1.0F - f1) + var14 * f2 * f1;
/*  820 */           var15 = var15 * (1.0F - f1) + var15 * f2 * f1;
/*      */         } 
/*      */         
/*  823 */         if (var13 > 1.0F)
/*      */         {
/*  825 */           var13 = 1.0F;
/*      */         }
/*      */         
/*  828 */         if (var14 > 1.0F)
/*      */         {
/*  830 */           var14 = 1.0F;
/*      */         }
/*      */         
/*  833 */         if (var15 > 1.0F)
/*      */         {
/*  835 */           var15 = 1.0F;
/*      */         }
/*      */         
/*  838 */         float var16 = this.r.y.ag;
/*  839 */         float var17 = 1.0F - var13;
/*  840 */         float var18 = 1.0F - var14;
/*  841 */         float var19 = 1.0F - var15;
/*  842 */         var17 = 1.0F - var17 * var17 * var17 * var17;
/*  843 */         var18 = 1.0F - var18 * var18 * var18 * var18;
/*  844 */         var19 = 1.0F - var19 * var19 * var19 * var19;
/*  845 */         var13 = var13 * (1.0F - var16) + var17 * var16;
/*  846 */         var14 = var14 * (1.0F - var16) + var18 * var16;
/*  847 */         var15 = var15 * (1.0F - var16) + var19 * var16;
/*  848 */         var13 = var13 * 0.96F + 0.03F;
/*  849 */         var14 = var14 * 0.96F + 0.03F;
/*  850 */         var15 = var15 * 0.96F + 0.03F;
/*      */         
/*  852 */         if (var13 > 1.0F)
/*      */         {
/*  854 */           var13 = 1.0F;
/*      */         }
/*      */         
/*  857 */         if (var14 > 1.0F)
/*      */         {
/*  859 */           var14 = 1.0F;
/*      */         }
/*      */         
/*  862 */         if (var15 > 1.0F)
/*      */         {
/*  864 */           var15 = 1.0F;
/*      */         }
/*      */         
/*  867 */         if (var13 < 0.0F)
/*      */         {
/*  869 */           var13 = 0.0F;
/*      */         }
/*      */         
/*  872 */         if (var14 < 0.0F)
/*      */         {
/*  874 */           var14 = 0.0F;
/*      */         }
/*      */         
/*  877 */         if (var15 < 0.0F)
/*      */         {
/*  879 */           var15 = 0.0F;
/*      */         }
/*      */         
/*  882 */         short var20 = 255;
/*  883 */         int var21 = (int)(var13 * 255.0F);
/*  884 */         int var22 = (int)(var14 * 255.0F);
/*  885 */         int var23 = (int)(var15 * 255.0F);
/*  886 */         this.Q[var3] = var20 << 24 | var21 << 16 | var22 << 8 | var23;
/*      */       } 
/*      */       
/*  889 */       this.r.o.a(this.Q, 16, 16, this.d);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private float a(qx par1EntityPlayer, float par2) {
/*  898 */     int var3 = par1EntityPlayer.b(ll.r).b();
/*  899 */     return (var3 > 200) ? 1.0F : (0.7F + ke.a((var3 - par2) * 3.1415927F * 0.2F) * 0.3F);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(float par1) {
/*  907 */     this.r.I.a("lightTex");
/*      */     
/*  909 */     if (this.ac)
/*      */     {
/*  911 */       h(par1);
/*      */     }
/*      */     
/*  914 */     this.r.I.b();
/*  915 */     boolean var2 = Display.isActive();
/*      */     
/*  917 */     if (!var2 && this.r.y.y && (!this.r.y.A || !Mouse.isButtonDown(1))) {
/*      */       
/*  919 */       if (Minecraft.F() - this.aa > 500L)
/*      */       {
/*  921 */         this.r.j();
/*      */       }
/*      */     }
/*      */     else {
/*      */       
/*  926 */       this.aa = Minecraft.F();
/*      */     } 
/*      */     
/*  929 */     this.r.I.a("mouse");
/*      */     
/*  931 */     if (this.r.G && var2) {
/*      */       
/*  933 */       this.r.B.c();
/*  934 */       float var3 = this.r.y.c * 0.6F + 0.2F;
/*  935 */       float var4 = var3 * var3 * var3 * 8.0F;
/*  936 */       float var5 = this.r.B.a * var4;
/*  937 */       float var6 = this.r.B.b * var4;
/*  938 */       byte var7 = 1;
/*      */       
/*  940 */       if (this.r.y.d)
/*      */       {
/*  942 */         var7 = -1;
/*      */       }
/*      */       
/*  945 */       if (this.r.y.ab) {
/*      */         
/*  947 */         this.H += var5;
/*  948 */         this.I += var6;
/*  949 */         float var8 = par1 - this.L;
/*  950 */         this.L = par1;
/*  951 */         var5 = this.J * var8;
/*  952 */         var6 = this.K * var8;
/*  953 */         this.r.g.c(var5, var6 * var7);
/*      */       }
/*      */       else {
/*      */         
/*  957 */         this.r.g.c(var5, var6 * var7);
/*      */       } 
/*      */     } 
/*      */     
/*  961 */     this.r.I.b();
/*      */     
/*  963 */     if (!this.r.w) {
/*      */       
/*  965 */       a = this.r.y.g;
/*  966 */       aum var13 = new aum(this.r.y, this.r.c, this.r.d);
/*  967 */       int var14 = var13.a();
/*  968 */       int var15 = var13.b();
/*  969 */       int var16 = Mouse.getX() * var14 / this.r.c;
/*  970 */       int var17 = var15 - Mouse.getY() * var15 / this.r.d - 1;
/*  971 */       int var18 = a(this.r.y.i);
/*      */       
/*  973 */       if (this.r.e != null) {
/*      */         
/*  975 */         this.r.I.a("level");
/*      */         
/*  977 */         if (this.r.y.i == 0) {
/*      */           
/*  979 */           a(par1, 0L);
/*      */         }
/*      */         else {
/*      */           
/*  983 */           a(par1, this.ab + (1000000000 / var18));
/*      */         } 
/*      */         
/*  986 */         this.ab = System.nanoTime();
/*  987 */         this.r.I.c("gui");
/*      */         
/*  989 */         if (!this.r.y.V || this.r.r != null)
/*      */         {
/*  991 */           this.r.v.a(par1, (this.r.r != null), var16, var17);
/*      */         }
/*      */         
/*  994 */         this.r.I.b();
/*      */       }
/*      */       else {
/*      */         
/*  998 */         GL11.glViewport(0, 0, this.r.c, this.r.d);
/*  999 */         GL11.glMatrixMode(5889);
/* 1000 */         GL11.glLoadIdentity();
/* 1001 */         GL11.glMatrixMode(5888);
/* 1002 */         GL11.glLoadIdentity();
/* 1003 */         c();
/* 1004 */         this.ab = System.nanoTime();
/*      */       } 
/*      */       
/* 1007 */       if (this.r.r != null) {
/*      */         
/* 1009 */         GL11.glClear(256);
/*      */ 
/*      */         
/*      */         try {
/* 1013 */           this.r.r.a(var16, var17, par1);
/*      */         }
/* 1015 */         catch (Throwable var12) {
/*      */           
/* 1017 */           a var10 = a.a(var12, "Rendering screen");
/* 1018 */           l var11 = var10.a("Screen render details");
/* 1019 */           var11.a("Screen name", (Callable)new bao(this));
/* 1020 */           var11.a("Mouse location", (Callable)new bap(this, var16, var17));
/* 1021 */           var11.a("Screen size", (Callable)new baq(this, var13));
/* 1022 */           throw new t(var10);
/*      */         } 
/*      */         
/* 1025 */         if (this.r.r != null && this.r.r.m != null)
/*      */         {
/* 1027 */           this.r.r.m.a(par1);
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(float par1, long par2) {
/* 1035 */     this.r.I.a("lightTex");
/*      */     
/* 1037 */     if (this.ac)
/*      */     {
/* 1039 */       h(par1);
/*      */     }
/*      */     
/* 1042 */     GL11.glEnable(2884);
/* 1043 */     GL11.glEnable(2929);
/*      */     
/* 1045 */     if (this.r.h == null)
/*      */     {
/* 1047 */       this.r.h = (md)this.r.g;
/*      */     }
/*      */     
/* 1050 */     this.r.I.c("pick");
/* 1051 */     a(par1);
/* 1052 */     md var4 = this.r.h;
/* 1053 */     bav var5 = this.r.f;
/* 1054 */     azr var6 = this.r.i;
/* 1055 */     double var7 = var4.T + (var4.t - var4.T) * par1;
/* 1056 */     double var9 = var4.U + (var4.u - var4.U) * par1;
/* 1057 */     double var11 = var4.V + (var4.v - var4.V) * par1;
/* 1058 */     this.r.I.c("center");
/*      */     
/* 1060 */     for (int var13 = 0; var13 < 2; var13++) {
/*      */       
/* 1062 */       if (this.r.y.g) {
/*      */         
/* 1064 */         b = var13;
/*      */         
/* 1066 */         if (b == 0) {
/*      */           
/* 1068 */           GL11.glColorMask(false, true, true, false);
/*      */         }
/*      */         else {
/*      */           
/* 1072 */           GL11.glColorMask(true, false, false, false);
/*      */         } 
/*      */       } 
/*      */       
/* 1076 */       this.r.I.c("clear");
/* 1077 */       GL11.glViewport(0, 0, this.r.c, this.r.d);
/* 1078 */       i(par1);
/* 1079 */       GL11.glClear(16640);
/* 1080 */       GL11.glEnable(2884);
/* 1081 */       this.r.I.c("camera");
/* 1082 */       a(par1, var13);
/* 1083 */       aro.a((qx)this.r.g, (this.r.y.W == 2));
/* 1084 */       this.r.I.c("frustrum");
/* 1085 */       bbe.a();
/*      */       
/* 1087 */       if (this.r.y.e < 2) {
/*      */         
/* 1089 */         a(-1, par1);
/* 1090 */         this.r.I.c("sky");
/* 1091 */         var5.a(par1);
/*      */       } 
/*      */       
/* 1094 */       GL11.glEnable(2912);
/* 1095 */       a(1, par1);
/*      */       
/* 1097 */       if (this.r.y.k)
/*      */       {
/* 1099 */         GL11.glShadeModel(7425);
/*      */       }
/*      */       
/* 1102 */       this.r.I.c("culling");
/* 1103 */       bbf var14 = new bbf();
/* 1104 */       var14.a(var7, var9, var11);
/* 1105 */       this.r.f.a((bbd)var14, par1);
/*      */       
/* 1107 */       if (var13 == 0) {
/*      */         
/* 1109 */         this.r.I.c("updatechunks");
/*      */         
/* 1111 */         while (!this.r.f.a(var4, false) && par2 != 0L) {
/*      */           
/* 1113 */           long var15 = par2 - System.nanoTime();
/*      */           
/* 1115 */           if (var15 < 0L || var15 > 1000000000L) {
/*      */             break;
/*      */           }
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 1122 */       if (var4.u < 128.0D)
/*      */       {
/* 1124 */         a(var5, par1);
/*      */       }
/*      */       
/* 1127 */       a(0, par1);
/* 1128 */       GL11.glEnable(2912);
/* 1129 */       GL11.glBindTexture(3553, this.r.o.b("/terrain.png"));
/* 1130 */       arw.a();
/* 1131 */       this.r.I.c("terrain");
/* 1132 */       var5.a(var4, 0, par1);
/* 1133 */       GL11.glShadeModel(7424);
/*      */ 
/*      */       
/* 1136 */       if (this.q == 0) {
/*      */         
/* 1138 */         arw.b();
/* 1139 */         this.r.I.c("entities");
/* 1140 */         var5.a(var4.h(par1), (bbd)var14, par1);
/* 1141 */         b(par1);
/* 1142 */         this.r.I.c("litParticles");
/* 1143 */         var6.b(var4, par1);
/* 1144 */         arw.a();
/* 1145 */         a(0, par1);
/* 1146 */         this.r.I.c("particles");
/* 1147 */         var6.a(var4, par1);
/* 1148 */         a(par1);
/*      */         
/* 1150 */         if (this.r.x != null && var4.a(agi.h) && var4 instanceof qx && !this.r.y.V) {
/*      */           
/* 1152 */           qx var17 = (qx)var4;
/* 1153 */           GL11.glDisable(3008);
/* 1154 */           this.r.I.c("outline");
/* 1155 */           if (!ForgeHooksClient.onDrawBlockHighlight(var5, var17, this.r.x, 0, var17.bJ.g(), par1)) {
/*      */             
/* 1157 */             var5.a(var17, this.r.x, 0, var17.bJ.g(), par1);
/* 1158 */             var5.b(var17, this.r.x, 0, var17.bJ.g(), par1);
/*      */           } 
/* 1160 */           GL11.glEnable(3008);
/*      */         } 
/*      */       } 
/*      */       
/* 1164 */       GL11.glDisable(3042);
/* 1165 */       GL11.glEnable(2884);
/* 1166 */       GL11.glBlendFunc(770, 771);
/* 1167 */       GL11.glDepthMask(true);
/* 1168 */       a(0, par1);
/* 1169 */       GL11.glEnable(3042);
/* 1170 */       GL11.glDisable(2884);
/* 1171 */       GL11.glBindTexture(3553, this.r.o.b("/terrain.png"));
/*      */       
/* 1173 */       if (this.r.y.j) {
/*      */         
/* 1175 */         this.r.I.c("water");
/*      */         
/* 1177 */         if (this.r.y.k)
/*      */         {
/* 1179 */           GL11.glShadeModel(7425);
/*      */         }
/*      */         
/* 1182 */         GL11.glColorMask(false, false, false, false);
/* 1183 */         int var18 = var5.a(var4, 1, par1);
/*      */         
/* 1185 */         if (this.r.y.g) {
/*      */           
/* 1187 */           if (b == 0)
/*      */           {
/* 1189 */             GL11.glColorMask(false, true, true, true);
/*      */           }
/*      */           else
/*      */           {
/* 1193 */             GL11.glColorMask(true, false, false, true);
/*      */           }
/*      */         
/*      */         } else {
/*      */           
/* 1198 */           GL11.glColorMask(true, true, true, true);
/*      */         } 
/*      */         
/* 1201 */         if (var18 > 0)
/*      */         {
/* 1203 */           var5.a(1, par1);
/*      */         }
/*      */         
/* 1206 */         GL11.glShadeModel(7424);
/*      */       }
/*      */       else {
/*      */         
/* 1210 */         this.r.I.c("water");
/* 1211 */         var5.a(var4, 1, par1);
/*      */       } 
/*      */       
/* 1214 */       GL11.glDepthMask(true);
/* 1215 */       GL11.glEnable(2884);
/* 1216 */       GL11.glDisable(3042);
/*      */       
/* 1218 */       if (this.X == 1.0D && var4 instanceof qx && !this.r.y.V && this.r.x != null && !var4.a(agi.h)) {
/*      */         
/* 1220 */         qx var17 = (qx)var4;
/* 1221 */         GL11.glDisable(3008);
/* 1222 */         this.r.I.c("outline");
/* 1223 */         if (!ForgeHooksClient.onDrawBlockHighlight(var5, var17, this.r.x, 0, var17.bJ.g(), par1)) {
/*      */           
/* 1225 */           var5.a(var17, this.r.x, 0, var17.bJ.g(), par1);
/* 1226 */           var5.b(var17, this.r.x, 0, var17.bJ.g(), par1);
/*      */         } 
/* 1228 */         GL11.glEnable(3008);
/*      */       } 
/*      */       
/* 1231 */       this.r.I.c("destroyProgress");
/* 1232 */       GL11.glEnable(3042);
/* 1233 */       GL11.glBlendFunc(770, 1);
/* 1234 */       var5.drawBlockDamageTexture(baz.a, var4, par1);
/* 1235 */       GL11.glDisable(3042);
/* 1236 */       this.r.I.c("weather");
/* 1237 */       d(par1);
/* 1238 */       GL11.glDisable(2912);
/*      */       
/* 1240 */       if (var4.u >= 128.0D)
/*      */       {
/* 1242 */         a(var5, par1);
/*      */       }
/*      */       
/* 1245 */       this.r.I.c("FRenderLast");
/* 1246 */       ForgeHooksClient.dispatchRenderLast(var5, par1);
/*      */       
/* 1248 */       this.r.I.c("hand");
/*      */       
/* 1250 */       if (this.X == 1.0D) {
/*      */         
/* 1252 */         GL11.glClear(256);
/* 1253 */         b(par1, var13);
/*      */       } 
/*      */       
/* 1256 */       if (!this.r.y.g) {
/*      */         
/* 1258 */         this.r.I.b();
/*      */         
/*      */         return;
/*      */       } 
/*      */     } 
/* 1263 */     GL11.glColorMask(true, true, true, false);
/* 1264 */     this.r.I.b();
/*      */   }
/*      */ 
/*      */   
/*      */   private void a(bav par1RenderGlobal, float par2) {
/* 1269 */     if (this.r.y.d()) {
/*      */       
/* 1271 */       this.r.I.c("clouds");
/* 1272 */       GL11.glPushMatrix();
/* 1273 */       a(0, par2);
/* 1274 */       GL11.glEnable(2912);
/* 1275 */       par1RenderGlobal.b(par2);
/* 1276 */       GL11.glDisable(2912);
/* 1277 */       a(1, par2);
/* 1278 */       GL11.glPopMatrix();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private void g() {
/* 1284 */     float var1 = this.r.e.j(1.0F);
/*      */     
/* 1286 */     if (!this.r.y.j)
/*      */     {
/* 1288 */       var1 /= 2.0F;
/*      */     }
/*      */     
/* 1291 */     if (var1 != 0.0F) {
/*      */       
/* 1293 */       this.ad.setSeed(this.t * 312987231L);
/* 1294 */       md var2 = this.r.h;
/* 1295 */       ayp var3 = this.r.e;
/* 1296 */       int var4 = ke.c(var2.t);
/* 1297 */       int var5 = ke.c(var2.u);
/* 1298 */       int var6 = ke.c(var2.v);
/* 1299 */       byte var7 = 10;
/* 1300 */       double var8 = 0.0D;
/* 1301 */       double var10 = 0.0D;
/* 1302 */       double var12 = 0.0D;
/* 1303 */       int var14 = 0;
/* 1304 */       int var15 = (int)(100.0F * var1 * var1);
/*      */       
/* 1306 */       if (this.r.y.ai == 1) {
/*      */         
/* 1308 */         var15 >>= 1;
/*      */       }
/* 1310 */       else if (this.r.y.ai == 2) {
/*      */         
/* 1312 */         var15 = 0;
/*      */       } 
/*      */       
/* 1315 */       for (int var16 = 0; var16 < var15; var16++) {
/*      */         
/* 1317 */         int var17 = var4 + this.ad.nextInt(var7) - this.ad.nextInt(var7);
/* 1318 */         int var18 = var6 + this.ad.nextInt(var7) - this.ad.nextInt(var7);
/* 1319 */         int var19 = var3.h(var17, var18);
/* 1320 */         int var20 = var3.a(var17, var19 - 1, var18);
/* 1321 */         yy var21 = var3.a(var17, var18);
/*      */         
/* 1323 */         if (var19 <= var5 + var7 && var19 >= var5 - var7 && var21.d() && var21.j() >= 0.2F) {
/*      */           
/* 1325 */           float var22 = this.ad.nextFloat();
/* 1326 */           float var23 = this.ad.nextFloat();
/*      */           
/* 1328 */           if (var20 > 0)
/*      */           {
/* 1330 */             if ((amq.p[var20]).cB == agi.i) {
/*      */               
/* 1332 */               this.r.i.a((azq)new azv((yc)var3, (var17 + var22), (var19 + 0.1F) - amq.p[var20].x(), (var18 + var23), 0.0D, 0.0D, 0.0D));
/*      */             }
/*      */             else {
/*      */               
/* 1336 */               var14++;
/*      */               
/* 1338 */               if (this.ad.nextInt(var14) == 0) {
/*      */                 
/* 1340 */                 var8 = (var17 + var22);
/* 1341 */                 var10 = (var19 + 0.1F) - amq.p[var20].x();
/* 1342 */                 var12 = (var18 + var23);
/*      */               } 
/*      */               
/* 1345 */               this.r.i.a((azq)new bad((yc)var3, (var17 + var22), (var19 + 0.1F) - amq.p[var20].x(), (var18 + var23)));
/*      */             } 
/*      */           }
/*      */         } 
/*      */       } 
/*      */       
/* 1351 */       if (var14 > 0 && this.ad.nextInt(3) < this.ae++) {
/*      */         
/* 1353 */         this.ae = 0;
/*      */         
/* 1355 */         if (var10 > var2.u + 1.0D && var3.h(ke.c(var2.t), ke.c(var2.v)) > ke.c(var2.u)) {
/*      */           
/* 1357 */           this.r.e.a(var8, var10, var12, "ambient.weather.rain", 0.1F, 0.5F, false);
/*      */         }
/*      */         else {
/*      */           
/* 1361 */           this.r.e.a(var8, var10, var12, "ambient.weather.rain", 0.2F, 1.0F, false);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void d(float par1) {
/* 1372 */     float var2 = this.r.e.j(par1);
/*      */     
/* 1374 */     if (var2 > 0.0F) {
/*      */       
/* 1376 */       b(par1);
/*      */       
/* 1378 */       if (this.i == null) {
/*      */         
/* 1380 */         this.i = new float[1024];
/* 1381 */         this.j = new float[1024];
/*      */         
/* 1383 */         for (int var3 = 0; var3 < 32; var3++) {
/*      */           
/* 1385 */           for (int var4 = 0; var4 < 32; var4++) {
/*      */             
/* 1387 */             float var5 = (var4 - 16);
/* 1388 */             float var6 = (var3 - 16);
/* 1389 */             float var7 = ke.c(var5 * var5 + var6 * var6);
/* 1390 */             this.i[var3 << 5 | var4] = -var6 / var7;
/* 1391 */             this.j[var3 << 5 | var4] = var5 / var7;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/* 1396 */       md var41 = this.r.h;
/* 1397 */       ayp var42 = this.r.e;
/* 1398 */       int var43 = ke.c(var41.t);
/* 1399 */       int var44 = ke.c(var41.u);
/* 1400 */       int var45 = ke.c(var41.v);
/* 1401 */       baz var8 = baz.a;
/* 1402 */       GL11.glDisable(2884);
/* 1403 */       GL11.glNormal3f(0.0F, 1.0F, 0.0F);
/* 1404 */       GL11.glEnable(3042);
/* 1405 */       GL11.glBlendFunc(770, 771);
/* 1406 */       GL11.glAlphaFunc(516, 0.01F);
/* 1407 */       GL11.glBindTexture(3553, this.r.o.b("/environment/snow.png"));
/* 1408 */       double var9 = var41.T + (var41.t - var41.T) * par1;
/* 1409 */       double var11 = var41.U + (var41.u - var41.U) * par1;
/* 1410 */       double var13 = var41.V + (var41.v - var41.V) * par1;
/* 1411 */       int var15 = ke.c(var11);
/* 1412 */       byte var16 = 5;
/*      */       
/* 1414 */       if (this.r.y.j)
/*      */       {
/* 1416 */         var16 = 10;
/*      */       }
/*      */       
/* 1419 */       boolean var17 = false;
/* 1420 */       byte var18 = -1;
/* 1421 */       float var19 = this.t + par1;
/*      */       
/* 1423 */       if (this.r.y.j)
/*      */       {
/* 1425 */         var16 = 10;
/*      */       }
/*      */       
/* 1428 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 1429 */       var17 = false;
/*      */       
/* 1431 */       for (int var20 = var45 - var16; var20 <= var45 + var16; var20++) {
/*      */         
/* 1433 */         for (int var21 = var43 - var16; var21 <= var43 + var16; var21++) {
/*      */           
/* 1435 */           int var22 = (var20 - var45 + 16) * 32 + var21 - var43 + 16;
/* 1436 */           float var23 = this.i[var22] * 0.5F;
/* 1437 */           float var24 = this.j[var22] * 0.5F;
/* 1438 */           yy var25 = var42.a(var21, var20);
/*      */           
/* 1440 */           if (var25.d() || var25.c()) {
/*      */             
/* 1442 */             int var26 = var42.h(var21, var20);
/* 1443 */             int var27 = var44 - var16;
/* 1444 */             int var28 = var44 + var16;
/*      */             
/* 1446 */             if (var27 < var26)
/*      */             {
/* 1448 */               var27 = var26;
/*      */             }
/*      */             
/* 1451 */             if (var28 < var26)
/*      */             {
/* 1453 */               var28 = var26;
/*      */             }
/*      */             
/* 1456 */             float var29 = 1.0F;
/* 1457 */             int var30 = var26;
/*      */             
/* 1459 */             if (var26 < var15)
/*      */             {
/* 1461 */               var30 = var15;
/*      */             }
/*      */             
/* 1464 */             if (var27 != var28) {
/*      */               
/* 1466 */               this.ad.setSeed((var21 * var21 * 3121 + var21 * 45238971 ^ var20 * var20 * 418711 + var20 * 13761));
/* 1467 */               float var31 = var25.j();
/*      */ 
/*      */ 
/*      */               
/* 1471 */               if (var42.t().a(var31, var26) >= 0.15F) {
/*      */                 
/* 1473 */                 if (var18 != 0) {
/*      */                   
/* 1475 */                   if (var18 >= 0)
/*      */                   {
/* 1477 */                     var8.a();
/*      */                   }
/*      */                   
/* 1480 */                   var18 = 0;
/* 1481 */                   GL11.glBindTexture(3553, this.r.o.b("/environment/rain.png"));
/* 1482 */                   var8.b();
/*      */                 } 
/*      */                 
/* 1485 */                 float var32 = ((this.t + var21 * var21 * 3121 + var21 * 45238971 + var20 * var20 * 418711 + var20 * 13761 & 0x1F) + par1) / 32.0F * (3.0F + this.ad.nextFloat());
/* 1486 */                 double var33 = (var21 + 0.5F) - var41.t;
/* 1487 */                 double var35 = (var20 + 0.5F) - var41.v;
/* 1488 */                 float var37 = ke.a(var33 * var33 + var35 * var35) / var16;
/* 1489 */                 float var38 = 1.0F;
/* 1490 */                 var8.c(var42.i(var21, var30, var20, 0));
/* 1491 */                 var8.a(var38, var38, var38, ((1.0F - var37 * var37) * 0.5F + 0.5F) * var2);
/* 1492 */                 var8.b(-var9 * 1.0D, -var11 * 1.0D, -var13 * 1.0D);
/* 1493 */                 var8.a((var21 - var23) + 0.5D, var27, (var20 - var24) + 0.5D, (0.0F * var29), (var27 * var29 / 4.0F + var32 * var29));
/* 1494 */                 var8.a((var21 + var23) + 0.5D, var27, (var20 + var24) + 0.5D, (1.0F * var29), (var27 * var29 / 4.0F + var32 * var29));
/* 1495 */                 var8.a((var21 + var23) + 0.5D, var28, (var20 + var24) + 0.5D, (1.0F * var29), (var28 * var29 / 4.0F + var32 * var29));
/* 1496 */                 var8.a((var21 - var23) + 0.5D, var28, (var20 - var24) + 0.5D, (0.0F * var29), (var28 * var29 / 4.0F + var32 * var29));
/* 1497 */                 var8.b(0.0D, 0.0D, 0.0D);
/*      */               }
/*      */               else {
/*      */                 
/* 1501 */                 if (var18 != 1) {
/*      */                   
/* 1503 */                   if (var18 >= 0)
/*      */                   {
/* 1505 */                     var8.a();
/*      */                   }
/*      */                   
/* 1508 */                   var18 = 1;
/* 1509 */                   GL11.glBindTexture(3553, this.r.o.b("/environment/snow.png"));
/* 1510 */                   var8.b();
/*      */                 } 
/*      */                 
/* 1513 */                 float var32 = ((this.t & 0x1FF) + par1) / 512.0F;
/* 1514 */                 float var46 = this.ad.nextFloat() + var19 * 0.01F * (float)this.ad.nextGaussian();
/* 1515 */                 float var34 = this.ad.nextFloat() + var19 * (float)this.ad.nextGaussian() * 0.001F;
/* 1516 */                 double var35 = (var21 + 0.5F) - var41.t;
/* 1517 */                 double var47 = (var20 + 0.5F) - var41.v;
/* 1518 */                 float var39 = ke.a(var35 * var35 + var47 * var47) / var16;
/* 1519 */                 float var40 = 1.0F;
/* 1520 */                 var8.c((var42.i(var21, var30, var20, 0) * 3 + 15728880) / 4);
/* 1521 */                 var8.a(var40, var40, var40, ((1.0F - var39 * var39) * 0.3F + 0.5F) * var2);
/* 1522 */                 var8.b(-var9 * 1.0D, -var11 * 1.0D, -var13 * 1.0D);
/* 1523 */                 var8.a((var21 - var23) + 0.5D, var27, (var20 - var24) + 0.5D, (0.0F * var29 + var46), (var27 * var29 / 4.0F + var32 * var29 + var34));
/* 1524 */                 var8.a((var21 + var23) + 0.5D, var27, (var20 + var24) + 0.5D, (1.0F * var29 + var46), (var27 * var29 / 4.0F + var32 * var29 + var34));
/* 1525 */                 var8.a((var21 + var23) + 0.5D, var28, (var20 + var24) + 0.5D, (1.0F * var29 + var46), (var28 * var29 / 4.0F + var32 * var29 + var34));
/* 1526 */                 var8.a((var21 - var23) + 0.5D, var28, (var20 - var24) + 0.5D, (0.0F * var29 + var46), (var28 * var29 / 4.0F + var32 * var29 + var34));
/* 1527 */                 var8.b(0.0D, 0.0D, 0.0D);
/*      */               } 
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/* 1534 */       if (var18 >= 0)
/*      */       {
/* 1536 */         var8.a();
/*      */       }
/*      */       
/* 1539 */       GL11.glEnable(2884);
/* 1540 */       GL11.glDisable(3042);
/* 1541 */       GL11.glAlphaFunc(516, 0.1F);
/* 1542 */       a(par1);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void c() {
/* 1551 */     aum var1 = new aum(this.r.y, this.r.c, this.r.d);
/* 1552 */     GL11.glClear(256);
/* 1553 */     GL11.glMatrixMode(5889);
/* 1554 */     GL11.glLoadIdentity();
/* 1555 */     GL11.glOrtho(0.0D, var1.c(), var1.d(), 0.0D, 1000.0D, 3000.0D);
/* 1556 */     GL11.glMatrixMode(5888);
/* 1557 */     GL11.glLoadIdentity();
/* 1558 */     GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void i(float par1) {
/* 1566 */     ayp var2 = this.r.e;
/* 1567 */     md var3 = this.r.h;
/* 1568 */     float var4 = 1.0F / (4 - this.r.y.e);
/* 1569 */     var4 = 1.0F - (float)Math.pow(var4, 0.25D);
/* 1570 */     aoj var5 = var2.a(this.r.h, par1);
/* 1571 */     float var6 = (float)var5.c;
/* 1572 */     float var7 = (float)var5.d;
/* 1573 */     float var8 = (float)var5.e;
/* 1574 */     aoj var9 = var2.g(par1);
/* 1575 */     this.n = (float)var9.c;
/* 1576 */     this.o = (float)var9.d;
/* 1577 */     this.p = (float)var9.e;
/*      */ 
/*      */     
/* 1580 */     if (this.r.y.e < 2) {
/*      */       
/* 1582 */       aoj var10 = (ke.a(var2.e(par1)) > 0.0F) ? var2.S().a(-1.0D, 0.0D, 0.0D) : var2.S().a(1.0D, 0.0D, 0.0D);
/* 1583 */       float f = (float)var3.i(par1).b(var10);
/*      */       
/* 1585 */       if (f < 0.0F)
/*      */       {
/* 1587 */         f = 0.0F;
/*      */       }
/*      */       
/* 1590 */       if (f > 0.0F) {
/*      */         
/* 1592 */         float[] var12 = var2.u.a(var2.c(par1), par1);
/*      */         
/* 1594 */         if (var12 != null) {
/*      */           
/* 1596 */           f *= var12[3];
/* 1597 */           this.n = this.n * (1.0F - f) + var12[0] * f;
/* 1598 */           this.o = this.o * (1.0F - f) + var12[1] * f;
/* 1599 */           this.p = this.p * (1.0F - f) + var12[2] * f;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 1604 */     this.n += (var6 - this.n) * var4;
/* 1605 */     this.o += (var7 - this.o) * var4;
/* 1606 */     this.p += (var8 - this.p) * var4;
/* 1607 */     float var19 = var2.j(par1);
/*      */ 
/*      */     
/* 1610 */     if (var19 > 0.0F) {
/*      */       
/* 1612 */       float f1 = 1.0F - var19 * 0.5F;
/* 1613 */       float var20 = 1.0F - var19 * 0.4F;
/* 1614 */       this.n *= f1;
/* 1615 */       this.o *= f1;
/* 1616 */       this.p *= var20;
/*      */     } 
/*      */     
/* 1619 */     float var11 = var2.i(par1);
/*      */     
/* 1621 */     if (var11 > 0.0F) {
/*      */       
/* 1623 */       float var20 = 1.0F - var11 * 0.5F;
/* 1624 */       this.n *= var20;
/* 1625 */       this.o *= var20;
/* 1626 */       this.p *= var20;
/*      */     } 
/*      */     
/* 1629 */     int var21 = aro.a((yc)this.r.e, var3, par1);
/*      */     
/* 1631 */     if (this.W) {
/*      */       
/* 1633 */       aoj var13 = var2.f(par1);
/* 1634 */       this.n = (float)var13.c;
/* 1635 */       this.o = (float)var13.d;
/* 1636 */       this.p = (float)var13.e;
/*      */     }
/* 1638 */     else if (var21 != 0 && (amq.p[var21]).cB == agi.h) {
/*      */       
/* 1640 */       this.n = 0.02F;
/* 1641 */       this.o = 0.02F;
/* 1642 */       this.p = 0.2F;
/*      */     }
/* 1644 */     else if (var21 != 0 && (amq.p[var21]).cB == agi.i) {
/*      */       
/* 1646 */       this.n = 0.6F;
/* 1647 */       this.o = 0.1F;
/* 1648 */       this.p = 0.0F;
/*      */     }
/* 1650 */     else if (var21 != 0 && (amq.p[var21]).cB == mod_SCP.SCP354) {
/*      */ 
/*      */       
/* 1653 */       this.n = 0.75F;
/* 1654 */       this.o = 0.1F;
/* 1655 */       this.p = 0.0F;
/*      */     } 
/*      */     
/* 1658 */     float var22 = this.af + (this.ag - this.af) * par1;
/* 1659 */     this.n *= var22;
/* 1660 */     this.o *= var22;
/* 1661 */     this.p *= var22;
/* 1662 */     double var14 = (var3.U + (var3.u - var3.U) * par1) * var2.u.k();
/*      */     
/* 1664 */     if (var3.a(ll.q)) {
/*      */       
/* 1666 */       int var16 = var3.b(ll.q).b();
/*      */       
/* 1668 */       if (var16 < 20) {
/*      */         
/* 1670 */         var14 *= (1.0F - var16 / 20.0F);
/*      */       }
/*      */       else {
/*      */         
/* 1674 */         var14 = 0.0D;
/*      */       } 
/*      */     } 
/*      */     
/* 1678 */     if (var14 < 1.0D) {
/*      */       
/* 1680 */       if (var14 < 0.0D)
/*      */       {
/* 1682 */         var14 = 0.0D;
/*      */       }
/*      */       
/* 1685 */       var14 *= var14;
/* 1686 */       this.n = (float)(this.n * var14);
/* 1687 */       this.o = (float)(this.o * var14);
/* 1688 */       this.p = (float)(this.p * var14);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1693 */     if (this.U > 0.0F) {
/*      */       
/* 1695 */       float var23 = this.V + (this.U - this.V) * par1;
/* 1696 */       this.n = this.n * (1.0F - var23) + this.n * 0.7F * var23;
/* 1697 */       this.o = this.o * (1.0F - var23) + this.o * 0.6F * var23;
/* 1698 */       this.p = this.p * (1.0F - var23) + this.p * 0.6F * var23;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1703 */     if (var3.a(ll.r)) {
/*      */       
/* 1705 */       float var23 = a((qx)this.r.g, par1);
/* 1706 */       float var17 = 1.0F / this.n;
/*      */       
/* 1708 */       if (var17 > 1.0F / this.o)
/*      */       {
/* 1710 */         var17 = 1.0F / this.o;
/*      */       }
/*      */       
/* 1713 */       if (var17 > 1.0F / this.p)
/*      */       {
/* 1715 */         var17 = 1.0F / this.p;
/*      */       }
/*      */       
/* 1718 */       this.n = this.n * (1.0F - var23) + this.n * var17 * var23;
/* 1719 */       this.o = this.o * (1.0F - var23) + this.o * var17 * var23;
/* 1720 */       this.p = this.p * (1.0F - var23) + this.p * var17 * var23;
/*      */     } 
/*      */     
/* 1723 */     if (this.r.y.g) {
/*      */       
/* 1725 */       float var23 = (this.n * 30.0F + this.o * 59.0F + this.p * 11.0F) / 100.0F;
/* 1726 */       float var17 = (this.n * 30.0F + this.o * 70.0F) / 100.0F;
/* 1727 */       float var18 = (this.n * 30.0F + this.p * 70.0F) / 100.0F;
/* 1728 */       this.n = var23;
/* 1729 */       this.o = var17;
/* 1730 */       this.p = var18;
/*      */     } 
/*      */     
/* 1733 */     GL11.glClearColor(this.n, this.o, this.p, 0.0F);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void a(int par1, float par2) {
/* 1742 */     md var3 = this.r.h;
/* 1743 */     boolean var4 = false;
/*      */     
/* 1745 */     if (var3 instanceof qx)
/*      */     {
/* 1747 */       var4 = ((qx)var3).cd.d;
/*      */     }
/*      */     
/* 1750 */     if (par1 == 999) {
/*      */       
/* 1752 */       GL11.glFog(2918, a(0.0F, 0.0F, 0.0F, 1.0F));
/* 1753 */       GL11.glFogi(2917, 9729);
/* 1754 */       GL11.glFogf(2915, 0.0F);
/* 1755 */       GL11.glFogf(2916, 8.0F);
/*      */       
/* 1757 */       if ((GLContext.getCapabilities()).GL_NV_fog_distance)
/*      */       {
/* 1759 */         GL11.glFogi(34138, 34139);
/*      */       }
/*      */       
/* 1762 */       GL11.glFogf(2915, 0.0F);
/*      */     }
/*      */     else {
/*      */       
/* 1766 */       GL11.glFog(2918, a(this.n, this.o, this.p, 1.0F));
/* 1767 */       GL11.glNormal3f(0.0F, -1.0F, 0.0F);
/* 1768 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 1769 */       int var5 = aro.a((yc)this.r.e, var3, par2);
/*      */ 
/*      */       
/* 1772 */       if (var3.a(ll.q)) {
/*      */         
/* 1774 */         float var6 = 5.0F;
/* 1775 */         int var7 = var3.b(ll.q).b();
/*      */         
/* 1777 */         if (var7 < 20)
/*      */         {
/* 1779 */           var6 = 5.0F + (this.s - 5.0F) * (1.0F - var7 / 20.0F);
/*      */         }
/*      */         
/* 1782 */         GL11.glFogi(2917, 9729);
/*      */         
/* 1784 */         if (par1 < 0) {
/*      */           
/* 1786 */           GL11.glFogf(2915, 0.0F);
/* 1787 */           GL11.glFogf(2916, var6 * 0.8F);
/*      */         }
/*      */         else {
/*      */           
/* 1791 */           GL11.glFogf(2915, var6 * 0.25F);
/* 1792 */           GL11.glFogf(2916, var6);
/*      */         } 
/*      */         
/* 1795 */         if ((GLContext.getCapabilities()).GL_NV_fog_distance)
/*      */         {
/* 1797 */           GL11.glFogi(34138, 34139);
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/* 1808 */       else if (this.W) {
/*      */         
/* 1810 */         GL11.glFogi(2917, 2048);
/* 1811 */         GL11.glFogf(2914, 0.1F);
/* 1812 */         float var6 = 1.0F;
/* 1813 */         float var12 = 1.0F;
/* 1814 */         float var8 = 1.0F;
/*      */         
/* 1816 */         if (this.r.y.g)
/*      */         {
/* 1818 */           float var9 = (var6 * 30.0F + var12 * 59.0F + var8 * 11.0F) / 100.0F;
/* 1819 */           float var10 = (var6 * 30.0F + var12 * 70.0F) / 100.0F;
/* 1820 */           float var11 = (var6 * 30.0F + var8 * 70.0F) / 100.0F;
/*      */         }
/*      */       
/* 1823 */       } else if (var5 > 0 && (amq.p[var5]).cB == agi.h) {
/*      */         
/* 1825 */         GL11.glFogi(2917, 2048);
/*      */         
/* 1827 */         if (var3.a(ll.o)) {
/*      */           
/* 1829 */           GL11.glFogf(2914, 0.05F);
/*      */         }
/*      */         else {
/*      */           
/* 1833 */           GL11.glFogf(2914, 0.1F);
/*      */         } 
/*      */         
/* 1836 */         float var6 = 0.4F;
/* 1837 */         float var12 = 0.4F;
/* 1838 */         float var8 = 0.9F;
/*      */         
/* 1840 */         if (this.r.y.g)
/*      */         {
/* 1842 */           float var9 = (var6 * 30.0F + var12 * 59.0F + var8 * 11.0F) / 100.0F;
/* 1843 */           float var10 = (var6 * 30.0F + var12 * 70.0F) / 100.0F;
/* 1844 */           float var11 = (var6 * 30.0F + var8 * 70.0F) / 100.0F;
/*      */         }
/*      */       
/* 1847 */       } else if (var5 > 0 && (amq.p[var5]).cB == agi.i) {
/*      */         
/* 1849 */         GL11.glFogi(2917, 2048);
/* 1850 */         GL11.glFogf(2914, 2.0F);
/* 1851 */         float var6 = 0.4F;
/* 1852 */         float var12 = 0.3F;
/* 1853 */         float var8 = 0.3F;
/*      */         
/* 1855 */         if (this.r.y.g)
/*      */         {
/* 1857 */           float var9 = (var6 * 30.0F + var12 * 59.0F + var8 * 11.0F) / 100.0F;
/* 1858 */           float var10 = (var6 * 30.0F + var12 * 70.0F) / 100.0F;
/* 1859 */           float var11 = (var6 * 30.0F + var8 * 70.0F) / 100.0F;
/*      */         }
/*      */       
/* 1862 */       } else if (var5 > 0 && (amq.p[var5]).cB == mod_SCP.SCP354) {
/*      */ 
/*      */         
/* 1865 */         GL11.glFogi(2917, 2048);
/* 1866 */         GL11.glFogf(2914, 2.0F);
/* 1867 */         float var6 = 0.4F;
/* 1868 */         float var12 = 0.3F;
/* 1869 */         float var8 = 0.3F;
/*      */         
/* 1871 */         if (this.r.y.g)
/*      */         {
/* 1873 */           float var9 = (var6 * 30.0F + var12 * 59.0F + var8 * 11.0F) / 100.0F;
/* 1874 */           float var10 = (var6 * 30.0F + var12 * 70.0F) / 100.0F;
/* 1875 */           float var11 = (var6 * 30.0F + var8 * 70.0F) / 100.0F;
/*      */         }
/*      */       
/*      */       } else {
/*      */         
/* 1880 */         float var6 = this.s;
/*      */         
/* 1882 */         if (this.r.e.u.j() && !var4) {
/*      */           
/* 1884 */           double var13 = ((var3.b(par2) & 0xF00000) >> 20) / 16.0D + (var3.U + (var3.u - var3.U) * par2 + 4.0D) / 32.0D;
/*      */           
/* 1886 */           if (var13 < 1.0D) {
/*      */             
/* 1888 */             if (var13 < 0.0D)
/*      */             {
/* 1890 */               var13 = 0.0D;
/*      */             }
/*      */             
/* 1893 */             var13 *= var13;
/* 1894 */             float var9 = 100.0F * (float)var13;
/*      */             
/* 1896 */             if (var9 < 5.0F)
/*      */             {
/* 1898 */               var9 = 5.0F;
/*      */             }
/*      */             
/* 1901 */             if (var6 > var9)
/*      */             {
/* 1903 */               var6 = var9;
/*      */             }
/*      */           } 
/*      */         } 
/*      */         
/* 1908 */         GL11.glFogi(2917, 9729);
/*      */         
/* 1910 */         if (par1 < 0) {
/*      */           
/* 1912 */           GL11.glFogf(2915, 0.0F);
/* 1913 */           GL11.glFogf(2916, var6 * 0.8F);
/*      */         }
/*      */         else {
/*      */           
/* 1917 */           GL11.glFogf(2915, var6 * 0.25F);
/* 1918 */           GL11.glFogf(2916, var6);
/*      */         } 
/*      */         
/* 1921 */         if ((GLContext.getCapabilities()).GL_NV_fog_distance)
/*      */         {
/* 1923 */           GL11.glFogi(34138, 34139);
/*      */         }
/*      */         
/* 1926 */         if (this.r.e.u.b((int)var3.t, (int)var3.v)) {
/*      */           
/* 1928 */           GL11.glFogf(2915, var6 * 0.05F);
/* 1929 */           GL11.glFogf(2916, Math.min(var6, 192.0F) * 0.5F);
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 1934 */       GL11.glEnable(2903);
/* 1935 */       GL11.glColorMaterial(1028, 4608);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private FloatBuffer a(float par1, float par2, float par3, float par4) {
/* 1944 */     this.m.clear();
/* 1945 */     this.m.put(par1).put(par2).put(par3).put(par4);
/* 1946 */     this.m.flip();
/* 1947 */     return this.m;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int a(int par0) {
/* 1955 */     short var1 = 200;
/*      */     
/* 1957 */     if (par0 == 1)
/*      */     {
/* 1959 */       var1 = 120;
/*      */     }
/*      */     
/* 1962 */     if (par0 == 2)
/*      */     {
/* 1964 */       var1 = 35;
/*      */     }
/*      */     
/* 1967 */     return var1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static Minecraft a(ban par0EntityRenderer) {
/* 1975 */     return par0EntityRenderer.r;
/*      */   }
/*      */ }


/* Location:              /home/luigi/Documents/JAR.jar!/ban.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */