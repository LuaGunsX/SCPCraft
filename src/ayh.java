/*      */ import cpw.mods.fml.common.network.FMLNetworkHandler;
/*      */ import cpw.mods.fml.relauncher.Side;
/*      */ import cpw.mods.fml.relauncher.SideOnly;
/*      */ import java.io.BufferedReader;
/*      */ import java.io.ByteArrayInputStream;
/*      */ import java.io.DataInputStream;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStreamReader;
/*      */ import java.math.BigInteger;
/*      */ import java.net.InetAddress;
/*      */ import java.net.Socket;
/*      */ import java.net.URL;
/*      */ import java.net.URLEncoder;
/*      */ import java.security.PublicKey;
/*      */ import java.util.ArrayList;
/*      */ import java.util.HashMap;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Random;
/*      */ import javax.crypto.SecretKey;
/*      */ import net.minecraft.client.Minecraft;
/*      */ import net.minecraft.server.MinecraftServer;
/*      */ import net.minecraftforge.client.event.ClientChatReceivedEvent;
/*      */ import net.minecraftforge.common.MinecraftForge;
/*      */ import net.minecraftforge.event.Event;
/*      */ import org.lwjgl.input.Keyboard;
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
/*      */ public class ayh
/*      */   extends eg
/*      */ {
/*      */   private boolean f = false;
/*      */   private ce g;
/*      */   public String a;
/*      */   private Minecraft h;
/*      */   private ayp i;
/*      */   private boolean j = false;
/*  187 */   public aiv b = new aiv((aih)null);
/*      */ 
/*      */   
/*  190 */   private Map k = new HashMap<Object, Object>();
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  195 */   public List c = new ArrayList();
/*  196 */   public int d = 20;
/*      */ 
/*      */   
/*  199 */   Random e = new Random();
/*      */   
/*      */   private static byte connectionCompatibilityLevel;
/*      */ 
/*      */   
/*      */   public ayh(Minecraft par1Minecraft, String par2Str, int par3) throws IOException {
/*  205 */     this.h = par1Minecraft;
/*  206 */     Socket var4 = new Socket(InetAddress.getByName(par2Str), par3);
/*  207 */     this.g = (ce)new cg(var4, "Client", this);
/*  208 */     FMLNetworkHandler.onClientConnectionToRemoteServer(this, par2Str, par3, this.g);
/*      */   }
/*      */ 
/*      */   
/*      */   public ayh(Minecraft par1Minecraft, bdz par2IntegratedServer) throws IOException {
/*  213 */     this.h = par1Minecraft;
/*  214 */     this.g = (ce)new cf(this);
/*  215 */     par2IntegratedServer.a().a((cf)this.g, par1Minecraft.j.b);
/*  216 */     FMLNetworkHandler.onClientConnectionToIntegratedServer(this, (MinecraftServer)par2IntegratedServer, this.g);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void c() {
/*  224 */     if (this.g != null)
/*      */     {
/*  226 */       this.g.a();
/*      */     }
/*      */     
/*  229 */     this.g = null;
/*  230 */     this.i = null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void d() {
/*  238 */     if (!this.f && this.g != null)
/*      */     {
/*  240 */       this.g.b();
/*      */     }
/*      */     
/*  243 */     if (this.g != null)
/*      */     {
/*  245 */       this.g.a();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(eq par1Packet253ServerAuthData) {
/*  251 */     String var2 = par1Packet253ServerAuthData.d().trim();
/*  252 */     PublicKey var3 = par1Packet253ServerAuthData.f();
/*  253 */     SecretKey var4 = jt.a();
/*      */     
/*  255 */     if (!"-".equals(var2)) {
/*      */       
/*  257 */       String var5 = (new BigInteger(jt.a(var2, var3, var4))).toString(16);
/*  258 */       String var6 = a(this.h.j.b, this.h.j.c, var5);
/*      */       
/*  260 */       if (!"ok".equalsIgnoreCase(var6)) {
/*      */         
/*  262 */         this.g.a("disconnect.loginFailedInfo", new Object[] { var6 });
/*      */         
/*      */         return;
/*      */       } 
/*      */     } 
/*  267 */     c((ef)new fb(var4, var3, par1Packet253ServerAuthData.g()));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private String a(String par1Str, String par2Str, String par3Str) {
/*      */     try {
/*  274 */       URL var4 = new URL("http://session.minecraft.net/game/joinserver.jsp?user=" + a(par1Str) + "&sessionId=" + a(par2Str) + "&serverId=" + a(par3Str));
/*  275 */       BufferedReader var5 = new BufferedReader(new InputStreamReader(var4.openStream()));
/*  276 */       String var6 = var5.readLine();
/*  277 */       var5.close();
/*  278 */       return var6;
/*      */     }
/*  280 */     catch (IOException var7) {
/*      */       
/*  282 */       return var7.toString();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static String a(String par0Str) throws IOException {
/*  291 */     return URLEncoder.encode(par0Str, "UTF-8");
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(fb par1Packet252SharedKey) {
/*  296 */     c((ef)FMLNetworkHandler.getFMLFakeLoginPacket());
/*  297 */     c((ef)new cw(0));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(dw par1Packet1Login) {
/*  302 */     this.h.b = new ayo(this.h, this);
/*  303 */     this.h.E.a(jq.i, 1);
/*  304 */     this.i = new ayp(this, new yk(0L, par1Packet1Login.d, false, par1Packet1Login.c, par1Packet1Login.b), par1Packet1Login.e, par1Packet1Login.f, this.h.I);
/*  305 */     this.i.I = true;
/*  306 */     this.h.a(this.i);
/*  307 */     this.h.g.aq = par1Packet1Login.e;
/*  308 */     this.h.a((aul)new ayu(this));
/*  309 */     this.h.g.k = par1Packet1Login.a;
/*  310 */     this.d = par1Packet1Login.h;
/*  311 */     this.h.b.a(par1Packet1Login.d);
/*  312 */     FMLNetworkHandler.onConnectionEstablishedToServer(this, this.g, par1Packet1Login);
/*  313 */     this.h.y.c();
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(cl par1Packet23VehicleSpawn) {
/*  318 */     double var2 = par1Packet23VehicleSpawn.b / 32.0D;
/*  319 */     double var4 = par1Packet23VehicleSpawn.c / 32.0D;
/*  320 */     double var6 = par1Packet23VehicleSpawn.d / 32.0D;
/*  321 */     Object var8 = null;
/*      */     
/*  323 */     if (par1Packet23VehicleSpawn.j == 10) {
/*      */       
/*  325 */       var8 = new py((yc)this.i, var2, var4, var6, 0);
/*      */     }
/*  327 */     else if (par1Packet23VehicleSpawn.j == 11) {
/*      */       
/*  329 */       var8 = new py((yc)this.i, var2, var4, var6, 1);
/*      */     }
/*  331 */     else if (par1Packet23VehicleSpawn.j == 12) {
/*      */       
/*  333 */       var8 = new py((yc)this.i, var2, var4, var6, 2);
/*      */     }
/*  335 */     else if (par1Packet23VehicleSpawn.j == 90) {
/*      */       
/*  337 */       lq var9 = a(par1Packet23VehicleSpawn.k);
/*      */       
/*  339 */       if (var9 instanceof qx)
/*      */       {
/*  341 */         var8 = new rd((yc)this.i, var2, var4, var6, (qx)var9);
/*      */       }
/*      */       
/*  344 */       par1Packet23VehicleSpawn.k = 0;
/*      */     }
/*  346 */     else if (par1Packet23VehicleSpawn.j == 60) {
/*      */       
/*  348 */       var8 = new qz((yc)this.i, var2, var4, var6);
/*      */     }
/*  350 */     else if (par1Packet23VehicleSpawn.j == 61) {
/*      */       
/*  352 */       var8 = new rh((yc)this.i, var2, var4, var6);
/*      */     }
/*  354 */     else if (par1Packet23VehicleSpawn.j == 71) {
/*      */       
/*  356 */       var8 = new mc((yc)this.i, (int)var2, (int)var4, (int)var6, par1Packet23VehicleSpawn.k);
/*  357 */       par1Packet23VehicleSpawn.k = 0;
/*      */     }
/*  359 */     else if (par1Packet23VehicleSpawn.j == 65) {
/*      */       
/*  361 */       var8 = new rk((yc)this.i, var2, var4, var6);
/*      */     }
/*  363 */     else if (par1Packet23VehicleSpawn.j == 72) {
/*      */       
/*  365 */       var8 = new ra((yc)this.i, var2, var4, var6);
/*      */     }
/*  367 */     else if (par1Packet23VehicleSpawn.j == 76) {
/*      */       
/*  369 */       var8 = new rc((yc)this.i, var2, var4, var6, (ur)null);
/*      */     }
/*  371 */     else if (par1Packet23VehicleSpawn.j == 63) {
/*      */       
/*  373 */       var8 = new re((yc)this.i, var2, var4, var6, par1Packet23VehicleSpawn.e / 8000.0D, par1Packet23VehicleSpawn.f / 8000.0D, par1Packet23VehicleSpawn.g / 8000.0D);
/*  374 */       par1Packet23VehicleSpawn.k = 0;
/*      */     }
/*  376 */     else if (par1Packet23VehicleSpawn.j == 64) {
/*      */       
/*  378 */       var8 = new rg((yc)this.i, var2, var4, var6, par1Packet23VehicleSpawn.e / 8000.0D, par1Packet23VehicleSpawn.f / 8000.0D, par1Packet23VehicleSpawn.g / 8000.0D);
/*  379 */       par1Packet23VehicleSpawn.k = 0;
/*      */     }
/*  381 */     else if (par1Packet23VehicleSpawn.j == 66) {
/*      */       
/*  383 */       var8 = new rn((yc)this.i, var2, var4, var6, par1Packet23VehicleSpawn.e / 8000.0D, par1Packet23VehicleSpawn.f / 8000.0D, par1Packet23VehicleSpawn.g / 8000.0D);
/*  384 */       par1Packet23VehicleSpawn.k = 0;
/*      */     }
/*  386 */     else if (par1Packet23VehicleSpawn.j == 62) {
/*      */       
/*  388 */       var8 = new rj((yc)this.i, var2, var4, var6);
/*      */     }
/*  390 */     else if (par1Packet23VehicleSpawn.j == 73) {
/*      */       
/*  392 */       var8 = new rm((yc)this.i, var2, var4, var6, par1Packet23VehicleSpawn.k);
/*  393 */       par1Packet23VehicleSpawn.k = 0;
/*      */     }
/*  395 */     else if (par1Packet23VehicleSpawn.j == 75) {
/*      */       
/*  397 */       var8 = new rl((yc)this.i, var2, var4, var6);
/*  398 */       par1Packet23VehicleSpawn.k = 0;
/*      */     }
/*  400 */     else if (par1Packet23VehicleSpawn.j == 1) {
/*      */       
/*  402 */       var8 = new pv((yc)this.i, var2, var4, var6);
/*      */     }
/*  404 */     else if (par1Packet23VehicleSpawn.j == 50) {
/*      */       
/*  406 */       var8 = new pz((yc)this.i, var2, var4, var6);
/*      */     }
/*  408 */     else if (par1Packet23VehicleSpawn.j == 51) {
/*      */       
/*  410 */       var8 = new po((yc)this.i, var2, var4, var6);
/*      */     }
/*  412 */     else if (par1Packet23VehicleSpawn.j == 2) {
/*      */       
/*  414 */       var8 = new px((yc)this.i, var2, var4, var6);
/*      */     }
/*  416 */     else if (par1Packet23VehicleSpawn.j == 70) {
/*      */       
/*  418 */       var8 = new pw((yc)this.i, var2, var4, var6, par1Packet23VehicleSpawn.k & 0xFFFF, par1Packet23VehicleSpawn.k >> 16);
/*  419 */       par1Packet23VehicleSpawn.k = 0;
/*      */     } 
/*      */     
/*  422 */     if (var8 != null) {
/*      */       
/*  424 */       ((lq)var8).cw = par1Packet23VehicleSpawn.b;
/*  425 */       ((lq)var8).cx = par1Packet23VehicleSpawn.c;
/*  426 */       ((lq)var8).cy = par1Packet23VehicleSpawn.d;
/*  427 */       ((lq)var8).A = (par1Packet23VehicleSpawn.h * 360) / 256.0F;
/*  428 */       ((lq)var8).z = (par1Packet23VehicleSpawn.i * 360) / 256.0F;
/*  429 */       lq[] var12 = ((lq)var8).ao();
/*      */       
/*  431 */       if (var12 != null) {
/*      */         
/*  433 */         int var10 = par1Packet23VehicleSpawn.a - ((lq)var8).k;
/*      */         
/*  435 */         for (int var11 = 0; var11 < var12.length; var11++)
/*      */         {
/*  437 */           (var12[var11]).k += var10;
/*      */         }
/*      */       } 
/*      */       
/*  441 */       ((lq)var8).k = par1Packet23VehicleSpawn.a;
/*  442 */       this.i.a(par1Packet23VehicleSpawn.a, (lq)var8);
/*      */       
/*  444 */       if (par1Packet23VehicleSpawn.k > 0) {
/*      */         
/*  446 */         if (par1Packet23VehicleSpawn.j == 60) {
/*      */           
/*  448 */           lq var13 = a(par1Packet23VehicleSpawn.k);
/*      */           
/*  450 */           if (var13 instanceof md) {
/*      */             
/*  452 */             qz var14 = (qz)var8;
/*  453 */             var14.c = var13;
/*      */           } 
/*      */         } 
/*      */         
/*  457 */         ((lq)var8).h(par1Packet23VehicleSpawn.e / 8000.0D, par1Packet23VehicleSpawn.f / 8000.0D, par1Packet23VehicleSpawn.g / 8000.0D);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(cm par1Packet26EntityExpOrb) {
/*  467 */     lz var2 = new lz((yc)this.i, par1Packet26EntityExpOrb.b, par1Packet26EntityExpOrb.c, par1Packet26EntityExpOrb.d, par1Packet26EntityExpOrb.e);
/*  468 */     var2.cw = par1Packet26EntityExpOrb.b;
/*  469 */     var2.cx = par1Packet26EntityExpOrb.c;
/*  470 */     var2.cy = par1Packet26EntityExpOrb.d;
/*  471 */     var2.z = 0.0F;
/*  472 */     var2.A = 0.0F;
/*  473 */     var2.k = par1Packet26EntityExpOrb.a;
/*  474 */     this.i.a(par1Packet26EntityExpOrb.a, (lq)var2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(cn par1Packet71Weather) {
/*  482 */     double var2 = par1Packet71Weather.b / 32.0D;
/*  483 */     double var4 = par1Packet71Weather.c / 32.0D;
/*  484 */     double var6 = par1Packet71Weather.d / 32.0D;
/*  485 */     pu var8 = null;
/*      */     
/*  487 */     if (par1Packet71Weather.e == 1)
/*      */     {
/*  489 */       var8 = new pu((yc)this.i, var2, var4, var6);
/*      */     }
/*      */     
/*  492 */     if (var8 != null) {
/*      */       
/*  494 */       var8.cw = par1Packet71Weather.b;
/*  495 */       var8.cx = par1Packet71Weather.c;
/*  496 */       var8.cy = par1Packet71Weather.d;
/*  497 */       var8.z = 0.0F;
/*  498 */       var8.A = 0.0F;
/*  499 */       var8.k = par1Packet71Weather.a;
/*  500 */       this.i.c((lq)var8);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(cp par1Packet25EntityPainting) {
/*  509 */     mg var2 = new mg((yc)this.i, par1Packet25EntityPainting.b, par1Packet25EntityPainting.c, par1Packet25EntityPainting.d, par1Packet25EntityPainting.e, par1Packet25EntityPainting.f);
/*  510 */     this.i.a(par1Packet25EntityPainting.a, (lq)var2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(eu par1Packet28EntityVelocity) {
/*  518 */     lq var2 = a(par1Packet28EntityVelocity.a);
/*      */     
/*  520 */     if (var2 != null)
/*      */     {
/*  522 */       var2.h(par1Packet28EntityVelocity.b / 8000.0D, par1Packet28EntityVelocity.c / 8000.0D, par1Packet28EntityVelocity.d / 8000.0D);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(et par1Packet40EntityMetadata) {
/*  531 */     lq var2 = a(par1Packet40EntityMetadata.a);
/*      */     
/*  533 */     if (var2 != null && par1Packet40EntityMetadata.d() != null)
/*      */     {
/*  535 */       var2.v().a(par1Packet40EntityMetadata.d());
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(cq par1Packet20NamedEntitySpawn) {
/*  541 */     double var2 = par1Packet20NamedEntitySpawn.c / 32.0D;
/*  542 */     double var4 = par1Packet20NamedEntitySpawn.d / 32.0D;
/*  543 */     double var6 = par1Packet20NamedEntitySpawn.e / 32.0D;
/*  544 */     float var8 = (par1Packet20NamedEntitySpawn.f * 360) / 256.0F;
/*  545 */     float var9 = (par1Packet20NamedEntitySpawn.g * 360) / 256.0F;
/*  546 */     bah var10 = new bah((yc)this.h.e, par1Packet20NamedEntitySpawn.b);
/*  547 */     var10.q = var10.T = (var10.cw = par1Packet20NamedEntitySpawn.c);
/*  548 */     var10.r = var10.U = (var10.cx = par1Packet20NamedEntitySpawn.d);
/*  549 */     var10.s = var10.V = (var10.cy = par1Packet20NamedEntitySpawn.e);
/*  550 */     int var11 = par1Packet20NamedEntitySpawn.h;
/*      */     
/*  552 */     if (var11 == 0) {
/*      */       
/*  554 */       var10.bJ.a[var10.bJ.c] = null;
/*      */     }
/*      */     else {
/*      */       
/*  558 */       var10.bJ.a[var10.bJ.c] = new ur(var11, 1, 0);
/*      */     } 
/*      */     
/*  561 */     var10.a(var2, var4, var6, var8, var9);
/*  562 */     this.i.a(par1Packet20NamedEntitySpawn.a, (lq)var10);
/*  563 */     List var12 = par1Packet20NamedEntitySpawn.c();
/*      */     
/*  565 */     if (var12 != null)
/*      */     {
/*  567 */       var10.v().a(var12);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(fe par1Packet34EntityTeleport) {
/*  573 */     lq var2 = a(par1Packet34EntityTeleport.a);
/*      */     
/*  575 */     if (var2 != null) {
/*      */       
/*  577 */       var2.cw = par1Packet34EntityTeleport.b;
/*  578 */       var2.cx = par1Packet34EntityTeleport.c;
/*  579 */       var2.cy = par1Packet34EntityTeleport.d;
/*  580 */       double var3 = var2.cw / 32.0D;
/*  581 */       double var5 = var2.cx / 32.0D + 0.015625D;
/*  582 */       double var7 = var2.cy / 32.0D;
/*  583 */       float var9 = (par1Packet34EntityTeleport.e * 360) / 256.0F;
/*  584 */       float var10 = (par1Packet34EntityTeleport.f * 360) / 256.0F;
/*  585 */       var2.a(var3, var5, var7, var9, var10, 3);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(er par1Packet16BlockItemSwitch) {
/*  591 */     if (par1Packet16BlockItemSwitch.a >= 0 && par1Packet16BlockItemSwitch.a < qw.h())
/*      */     {
/*  593 */       this.h.g.bJ.c = par1Packet16BlockItemSwitch.a;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(dx par1Packet30Entity) {
/*  599 */     lq var2 = a(par1Packet30Entity.a);
/*      */     
/*  601 */     if (var2 != null) {
/*      */       
/*  603 */       var2.cw += par1Packet30Entity.b;
/*  604 */       var2.cx += par1Packet30Entity.c;
/*  605 */       var2.cy += par1Packet30Entity.d;
/*  606 */       double var3 = var2.cw / 32.0D;
/*  607 */       double var5 = var2.cx / 32.0D;
/*  608 */       double var7 = var2.cy / 32.0D;
/*  609 */       float var9 = par1Packet30Entity.g ? ((par1Packet30Entity.e * 360) / 256.0F) : var2.z;
/*  610 */       float var10 = par1Packet30Entity.g ? ((par1Packet30Entity.f * 360) / 256.0F) : var2.A;
/*  611 */       var2.a(var3, var5, var7, var9, var10, 3);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ep par1Packet35EntityHeadRotation) {
/*  617 */     lq var2 = a(par1Packet35EntityHeadRotation.a);
/*      */     
/*  619 */     if (var2 != null) {
/*      */       
/*  621 */       float var3 = (par1Packet35EntityHeadRotation.b * 360) / 256.0F;
/*  622 */       var2.d(var3);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(em par1Packet29DestroyEntity) {
/*  628 */     for (int var2 = 0; var2 < par1Packet29DestroyEntity.a.length; var2++)
/*      */     {
/*  630 */       this.i.b(par1Packet29DestroyEntity.a[var2]);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(eb par1Packet10Flying) {
/*  636 */     ays var2 = this.h.g;
/*  637 */     double var3 = var2.t;
/*  638 */     double var5 = var2.u;
/*  639 */     double var7 = var2.v;
/*  640 */     float var9 = var2.z;
/*  641 */     float var10 = var2.A;
/*      */     
/*  643 */     if (par1Packet10Flying.h) {
/*      */       
/*  645 */       var3 = par1Packet10Flying.a;
/*  646 */       var5 = par1Packet10Flying.b;
/*  647 */       var7 = par1Packet10Flying.c;
/*      */     } 
/*      */     
/*  650 */     if (par1Packet10Flying.i) {
/*      */       
/*  652 */       var9 = par1Packet10Flying.e;
/*  653 */       var10 = par1Packet10Flying.f;
/*      */     } 
/*      */     
/*  656 */     var2.W = 0.0F;
/*  657 */     var2.w = var2.x = var2.y = 0.0D;
/*  658 */     var2.a(var3, var5, var7, var9, var10);
/*  659 */     par1Packet10Flying.a = var2.t;
/*  660 */     par1Packet10Flying.b = var2.D.b;
/*  661 */     par1Packet10Flying.c = var2.v;
/*  662 */     par1Packet10Flying.d = var2.u;
/*  663 */     this.g.a((ef)par1Packet10Flying);
/*      */     
/*  665 */     if (!this.j) {
/*      */       
/*  667 */       this.h.g.q = this.h.g.t;
/*  668 */       this.h.g.r = this.h.g.u;
/*  669 */       this.h.g.s = this.h.g.v;
/*  670 */       this.j = true;
/*  671 */       this.h.a((aul)null);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(cv par1Packet52MultiBlockChange) {
/*  677 */     int var2 = par1Packet52MultiBlockChange.a * 16;
/*  678 */     int var3 = par1Packet52MultiBlockChange.b * 16;
/*      */     
/*  680 */     if (par1Packet52MultiBlockChange.c != null) {
/*      */       
/*  682 */       DataInputStream var4 = new DataInputStream(new ByteArrayInputStream(par1Packet52MultiBlockChange.c));
/*      */ 
/*      */       
/*      */       try {
/*  686 */         for (int var5 = 0; var5 < par1Packet52MultiBlockChange.d; var5++)
/*      */         {
/*  688 */           short var6 = var4.readShort();
/*  689 */           short var7 = var4.readShort();
/*  690 */           int var8 = var7 >> 4 & 0xFFF;
/*  691 */           int var9 = var7 & 0xF;
/*  692 */           int var10 = var6 >> 12 & 0xF;
/*  693 */           int var11 = var6 >> 8 & 0xF;
/*  694 */           int var12 = var6 & 0xFF;
/*  695 */           this.i.h(var10 + var2, var12, var11 + var3, var8, var9);
/*      */         }
/*      */       
/*  698 */       } catch (IOException var13) {}
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
/*      */   public void a(dr par1Packet51MapChunk) {
/*  710 */     if (par1Packet51MapChunk.e) {
/*      */       
/*  712 */       if (par1Packet51MapChunk.c == 0) {
/*      */         
/*  714 */         this.i.a(par1Packet51MapChunk.a, par1Packet51MapChunk.b, false);
/*      */         
/*      */         return;
/*      */       } 
/*  718 */       this.i.a(par1Packet51MapChunk.a, par1Packet51MapChunk.b, true);
/*      */     } 
/*      */     
/*  721 */     this.i.b(par1Packet51MapChunk.a << 4, 0, par1Packet51MapChunk.b << 4, (par1Packet51MapChunk.a << 4) + 15, 256, (par1Packet51MapChunk.b << 4) + 15);
/*  722 */     zz var2 = this.i.e(par1Packet51MapChunk.a, par1Packet51MapChunk.b);
/*      */     
/*  724 */     if (par1Packet51MapChunk.e && var2 == null) {
/*      */       
/*  726 */       this.i.a(par1Packet51MapChunk.a, par1Packet51MapChunk.b, true);
/*  727 */       var2 = this.i.e(par1Packet51MapChunk.a, par1Packet51MapChunk.b);
/*      */     } 
/*      */     
/*  730 */     if (var2 != null) {
/*      */       
/*  732 */       var2.a(par1Packet51MapChunk.d(), par1Packet51MapChunk.c, par1Packet51MapChunk.d, par1Packet51MapChunk.e);
/*  733 */       this.i.e(par1Packet51MapChunk.a << 4, 0, par1Packet51MapChunk.b << 4, (par1Packet51MapChunk.a << 4) + 15, 256, (par1Packet51MapChunk.b << 4) + 15);
/*      */       
/*  735 */       if (!par1Packet51MapChunk.e || !(this.i.u instanceof aas))
/*      */       {
/*  737 */         var2.n();
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(fi par1Packet53BlockChange) {
/*  744 */     this.i.h(par1Packet53BlockChange.a, par1Packet53BlockChange.b, par1Packet53BlockChange.c, par1Packet53BlockChange.d, par1Packet53BlockChange.e);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(dj par1Packet255KickDisconnect) {
/*  749 */     this.g.a("disconnect.kicked", new Object[] { par1Packet255KickDisconnect.a });
/*  750 */     this.f = true;
/*  751 */     this.h.a((ayp)null);
/*  752 */     this.h.a((aul)new aym("disconnect.disconnected", "disconnect.genericReason", new Object[] { par1Packet255KickDisconnect.a }));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(String par1Str, Object[] par2ArrayOfObj) {
/*  757 */     if (!this.f) {
/*      */       
/*  759 */       this.f = true;
/*  760 */       this.h.a((ayp)null);
/*  761 */       this.h.a((aul)new aym("disconnect.lost", par1Str, par2ArrayOfObj));
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(ef par1Packet) {
/*  767 */     if (!this.f) {
/*      */       
/*  769 */       this.g.a(par1Packet);
/*  770 */       this.g.d();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void c(ef par1Packet) {
/*  779 */     if (!this.f)
/*      */     {
/*  781 */       this.g.a(par1Packet);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(fd par1Packet22Collect) {
/*  787 */     lq var2 = a(par1Packet22Collect.a);
/*  788 */     Object var3 = a(par1Packet22Collect.b);
/*      */     
/*  790 */     if (var3 == null)
/*      */     {
/*  792 */       var3 = this.h.g;
/*      */     }
/*      */     
/*  795 */     if (var2 != null) {
/*      */       
/*  797 */       if (var2 instanceof lz) {
/*      */         
/*  799 */         this.i.a(var2, "random.orb", 0.2F, ((this.e.nextFloat() - this.e.nextFloat()) * 0.7F + 1.0F) * 2.0F);
/*      */       }
/*      */       else {
/*      */         
/*  803 */         this.i.a(var2, "random.pop", 0.2F, ((this.e.nextFloat() - this.e.nextFloat()) * 0.7F + 1.0F) * 2.0F);
/*      */       } 
/*      */       
/*  806 */       this.h.i.a((azq)new bab((yc)this.h.e, var2, (lq)var3, -0.5F));
/*  807 */       this.i.b(par1Packet22Collect.a);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(cu par1Packet3Chat) {
/*  813 */     FMLNetworkHandler.onConnectionClosed(this.g, getPlayer());
/*  814 */     ClientChatReceivedEvent event = new ClientChatReceivedEvent(par1Packet3Chat.b);
/*  815 */     if (!MinecraftForge.EVENT_BUS.post((Event)event) && event.message != null)
/*      */     {
/*  817 */       this.h.v.b().a(par1Packet3Chat.b);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(cr par1Packet18Animation) {
/*  823 */     lq var2 = a(par1Packet18Animation.a);
/*      */     
/*  825 */     if (var2 != null)
/*      */     {
/*  827 */       if (par1Packet18Animation.b == 1) {
/*      */         
/*  829 */         md var3 = (md)var2;
/*  830 */         var3.bH();
/*      */       }
/*  832 */       else if (par1Packet18Animation.b == 2) {
/*      */         
/*  834 */         var2.ac();
/*      */       }
/*  836 */       else if (par1Packet18Animation.b == 3) {
/*      */         
/*  838 */         qx var4 = (qx)var2;
/*  839 */         var4.a(false, false, false);
/*      */       }
/*  841 */       else if (par1Packet18Animation.b != 4) {
/*      */         
/*  843 */         if (par1Packet18Animation.b == 6) {
/*      */           
/*  845 */           this.h.i.a((azq)new aza((yc)this.h.e, var2));
/*      */         }
/*  847 */         else if (par1Packet18Animation.b == 7) {
/*      */           
/*  849 */           aza var5 = new aza((yc)this.h.e, var2, "magicCrit");
/*  850 */           this.h.i.a((azq)var5);
/*      */         }
/*  852 */         else if (par1Packet18Animation.b != 5 || var2 instanceof bah) {
/*      */         
/*      */         } 
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(dk par1Packet17Sleep) {
/*  862 */     lq var2 = a(par1Packet17Sleep.a);
/*      */     
/*  864 */     if (var2 != null)
/*      */     {
/*  866 */       if (par1Packet17Sleep.e == 0) {
/*      */         
/*  868 */         qx var3 = (qx)var2;
/*  869 */         var3.a(par1Packet17Sleep.b, par1Packet17Sleep.c, par1Packet17Sleep.d);
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void e() {
/*  879 */     this.f = true;
/*  880 */     this.g.a();
/*  881 */     this.g.a("disconnect.closed", new Object[0]);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(co par1Packet24MobSpawn) {
/*  886 */     double var2 = par1Packet24MobSpawn.c / 32.0D;
/*  887 */     double var4 = par1Packet24MobSpawn.d / 32.0D;
/*  888 */     double var6 = par1Packet24MobSpawn.e / 32.0D;
/*  889 */     float var8 = (par1Packet24MobSpawn.i * 360) / 256.0F;
/*  890 */     float var9 = (par1Packet24MobSpawn.j * 360) / 256.0F;
/*  891 */     md var10 = (md)lv.a(par1Packet24MobSpawn.b, (yc)this.h.e);
/*  892 */     var10.cw = par1Packet24MobSpawn.c;
/*  893 */     var10.cx = par1Packet24MobSpawn.d;
/*  894 */     var10.cy = par1Packet24MobSpawn.e;
/*  895 */     var10.az = (par1Packet24MobSpawn.k * 360) / 256.0F;
/*  896 */     lq[] var11 = var10.ao();
/*      */     
/*  898 */     if (var11 != null) {
/*      */       
/*  900 */       int var12 = par1Packet24MobSpawn.a - var10.k;
/*      */       
/*  902 */       for (int var13 = 0; var13 < var11.length; var13++)
/*      */       {
/*  904 */         (var11[var13]).k += var12;
/*      */       }
/*      */     } 
/*      */     
/*  908 */     var10.k = par1Packet24MobSpawn.a;
/*  909 */     var10.a(var2, var4, var6, var8, var9);
/*  910 */     var10.w = (par1Packet24MobSpawn.f / 8000.0F);
/*  911 */     var10.x = (par1Packet24MobSpawn.g / 8000.0F);
/*  912 */     var10.y = (par1Packet24MobSpawn.h / 8000.0F);
/*  913 */     this.i.a(par1Packet24MobSpawn.a, var10);
/*  914 */     List var14 = par1Packet24MobSpawn.c();
/*      */     
/*  916 */     if (var14 != null)
/*      */     {
/*  918 */       var10.v().a(var14);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(fa par1Packet4UpdateTime) {
/*  924 */     this.h.e.a(par1Packet4UpdateTime.a);
/*  925 */     this.h.e.b(par1Packet4UpdateTime.b);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ez par1Packet6SpawnPosition) {
/*  930 */     this.h.g.a(new s(par1Packet6SpawnPosition.a, par1Packet6SpawnPosition.b, par1Packet6SpawnPosition.c), true);
/*  931 */     this.h.e.K().a(par1Packet6SpawnPosition.a, par1Packet6SpawnPosition.b, par1Packet6SpawnPosition.c);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ey par1Packet39AttachEntity) {
/*  939 */     Object var2 = a(par1Packet39AttachEntity.a);
/*  940 */     lq var3 = a(par1Packet39AttachEntity.b);
/*      */     
/*  942 */     if (par1Packet39AttachEntity.a == this.h.g.k) {
/*      */       
/*  944 */       var2 = this.h.g;
/*      */       
/*  946 */       if (var3 instanceof pv)
/*      */       {
/*  948 */         ((pv)var3).e(false);
/*      */       }
/*      */     }
/*  951 */     else if (var3 instanceof pv) {
/*      */       
/*  953 */       ((pv)var3).e(true);
/*      */     } 
/*      */     
/*  956 */     if (var2 != null)
/*      */     {
/*  958 */       ((lq)var2).a(var3);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(dl par1Packet38EntityStatus) {
/*  967 */     lq var2 = a(par1Packet38EntityStatus.a);
/*      */     
/*  969 */     if (var2 != null)
/*      */     {
/*  971 */       var2.a(par1Packet38EntityStatus.b);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   private lq a(int par1) {
/*  977 */     return (par1 == this.h.g.k) ? (lq)this.h.g : this.i.a(par1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ex par1Packet8UpdateHealth) {
/*  985 */     this.h.g.x(par1Packet8UpdateHealth.a);
/*  986 */     this.h.g.cc().a(par1Packet8UpdateHealth.b);
/*  987 */     this.h.g.cc().b(par1Packet8UpdateHealth.c);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ew par1Packet43Experience) {
/*  995 */     this.h.g.a(par1Packet43Experience.a, par1Packet43Experience.b, par1Packet43Experience.c);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(eo par1Packet9Respawn) {
/* 1003 */     if (par1Packet9Respawn.a != this.h.g.aq) {
/*      */       
/* 1005 */       this.j = false;
/* 1006 */       this.i = new ayp(this, new yk(0L, par1Packet9Respawn.d, false, this.h.e.K().t(), par1Packet9Respawn.e), par1Packet9Respawn.a, par1Packet9Respawn.b, this.h.I);
/* 1007 */       this.i.I = true;
/* 1008 */       this.h.a(this.i);
/* 1009 */       this.h.g.aq = par1Packet9Respawn.a;
/* 1010 */       this.h.a((aul)new ayu(this));
/*      */     } 
/*      */     
/* 1013 */     this.h.a(par1Packet9Respawn.a);
/* 1014 */     this.h.b.a(par1Packet9Respawn.d);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(dm par1Packet60Explosion) {
/* 1019 */     xx var2 = new xx((yc)this.h.e, (lq)null, par1Packet60Explosion.a, par1Packet60Explosion.b, par1Packet60Explosion.c, par1Packet60Explosion.d);
/* 1020 */     var2.h = par1Packet60Explosion.e;
/* 1021 */     var2.a(true);
/* 1022 */     this.h.g.w += par1Packet60Explosion.d();
/* 1023 */     this.h.g.x += par1Packet60Explosion.f();
/* 1024 */     this.h.g.y += par1Packet60Explosion.g();
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(de par1Packet100OpenWindow) {
/* 1029 */     ays var2 = this.h.g;
/*      */     
/* 1031 */     switch (par1Packet100OpenWindow.b) {
/*      */       
/*      */       case 0:
/* 1034 */         var2.a((la)new ld(par1Packet100OpenWindow.c, par1Packet100OpenWindow.d));
/* 1035 */         var2.bL.d = par1Packet100OpenWindow.a;
/*      */         break;
/*      */       case 1:
/* 1038 */         var2.b(ke.c(var2.t), ke.c(var2.u), ke.c(var2.v));
/* 1039 */         var2.bL.d = par1Packet100OpenWindow.a;
/*      */         break;
/*      */       case 2:
/* 1042 */         var2.a(new anr());
/* 1043 */         var2.bL.d = par1Packet100OpenWindow.a;
/*      */         break;
/*      */       case 3:
/* 1046 */         var2.a(new ano());
/* 1047 */         var2.bL.d = par1Packet100OpenWindow.a;
/*      */         break;
/*      */       case 4:
/* 1050 */         var2.c(ke.c(var2.t), ke.c(var2.u), ke.c(var2.v));
/* 1051 */         var2.bL.d = par1Packet100OpenWindow.a;
/*      */         break;
/*      */       case 5:
/* 1054 */         var2.a(new anl());
/* 1055 */         var2.bL.d = par1Packet100OpenWindow.a;
/*      */         break;
/*      */       case 6:
/* 1058 */         var2.a((xs)new qs((qx)var2));
/* 1059 */         var2.bL.d = par1Packet100OpenWindow.a;
/*      */         break;
/*      */       case 7:
/* 1062 */         var2.a(new ank());
/* 1063 */         var2.bL.d = par1Packet100OpenWindow.a;
/*      */         break;
/*      */       case 8:
/* 1066 */         var2.d(ke.c(var2.t), ke.c(var2.u), ke.c(var2.v));
/* 1067 */         var2.bL.d = par1Packet100OpenWindow.a;
/*      */         break;
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a(dh par1Packet103SetSlot) {
/* 1073 */     ays var2 = this.h.g;
/*      */     
/* 1075 */     if (par1Packet103SetSlot.a == -1) {
/*      */       
/* 1077 */       var2.bJ.b(par1Packet103SetSlot.c);
/*      */     }
/*      */     else {
/*      */       
/* 1081 */       boolean var3 = false;
/*      */       
/* 1083 */       if (this.h.r instanceof avs) {
/*      */         
/* 1085 */         avs var4 = (avs)this.h.r;
/* 1086 */         var3 = (var4.g() != tj.m.a());
/*      */       } 
/*      */       
/* 1089 */       if (par1Packet103SetSlot.a == 0 && par1Packet103SetSlot.b >= 36 && par1Packet103SetSlot.b < 45) {
/*      */         
/* 1091 */         ur var5 = var2.bK.a(par1Packet103SetSlot.b).c();
/*      */         
/* 1093 */         if (par1Packet103SetSlot.c != null && (var5 == null || var5.a < par1Packet103SetSlot.c.a))
/*      */         {
/* 1095 */           par1Packet103SetSlot.c.b = 5;
/*      */         }
/*      */         
/* 1098 */         var2.bK.a(par1Packet103SetSlot.b, par1Packet103SetSlot.c);
/*      */       }
/* 1100 */       else if (par1Packet103SetSlot.a == var2.bL.d && (par1Packet103SetSlot.a != 0 || !var3)) {
/*      */         
/* 1102 */         var2.bL.a(par1Packet103SetSlot.b, par1Packet103SetSlot.c);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(da par1Packet106Transaction) {
/* 1109 */     rq var2 = null;
/* 1110 */     ays var3 = this.h.g;
/*      */     
/* 1112 */     if (par1Packet106Transaction.a == 0) {
/*      */       
/* 1114 */       var2 = var3.bK;
/*      */     }
/* 1116 */     else if (par1Packet106Transaction.a == var3.bL.d) {
/*      */       
/* 1118 */       var2 = var3.bL;
/*      */     } 
/*      */     
/* 1121 */     if (var2 != null && !par1Packet106Transaction.c)
/*      */     {
/* 1123 */       c((ef)new da(par1Packet106Transaction.a, par1Packet106Transaction.b, true));
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(df par1Packet104WindowItems) {
/* 1129 */     ays var2 = this.h.g;
/*      */     
/* 1131 */     if (par1Packet104WindowItems.a == 0) {
/*      */       
/* 1133 */       var2.bK.a(par1Packet104WindowItems.b);
/*      */     }
/* 1135 */     else if (par1Packet104WindowItems.a == var2.bL.d) {
/*      */       
/* 1137 */       var2.bL.a(par1Packet104WindowItems.b);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(fc par1Packet130UpdateSign) {
/* 1146 */     boolean var2 = false;
/*      */     
/* 1148 */     if (this.h.e.f(par1Packet130UpdateSign.a, par1Packet130UpdateSign.b, par1Packet130UpdateSign.c)) {
/*      */       
/* 1150 */       any var3 = this.h.e.q(par1Packet130UpdateSign.a, par1Packet130UpdateSign.b, par1Packet130UpdateSign.c);
/*      */       
/* 1152 */       if (var3 instanceof anv) {
/*      */         
/* 1154 */         anv var4 = (anv)var3;
/*      */         
/* 1156 */         if (var4.a()) {
/*      */           
/* 1158 */           for (int var5 = 0; var5 < 4; var5++)
/*      */           {
/* 1160 */             var4.a[var5] = par1Packet130UpdateSign.d[var5];
/*      */           }
/*      */           
/* 1163 */           var4.d();
/*      */         } 
/*      */         
/* 1166 */         var2 = true;
/*      */       } 
/*      */     } 
/*      */     
/* 1170 */     if (!var2 && this.h.g != null)
/*      */     {
/* 1172 */       this.h.g.a("Unable to locate sign at " + par1Packet130UpdateSign.a + ", " + par1Packet130UpdateSign.b + ", " + par1Packet130UpdateSign.c);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(fg par1Packet132TileEntityData) {
/* 1178 */     if (this.h.e.f(par1Packet132TileEntityData.a, par1Packet132TileEntityData.b, par1Packet132TileEntityData.c)) {
/*      */       
/* 1180 */       any var2 = this.h.e.q(par1Packet132TileEntityData.a, par1Packet132TileEntityData.b, par1Packet132TileEntityData.c);
/*      */       
/* 1182 */       if (var2 != null)
/*      */       {
/* 1184 */         if (par1Packet132TileEntityData.d == 1 && var2 instanceof ans) {
/*      */           
/* 1186 */           var2.a(par1Packet132TileEntityData.e);
/*      */         }
/* 1188 */         else if (par1Packet132TileEntityData.d == 2 && var2 instanceof ann) {
/*      */           
/* 1190 */           var2.a(par1Packet132TileEntityData.e);
/*      */         }
/* 1192 */         else if (par1Packet132TileEntityData.d == 3 && var2 instanceof ank) {
/*      */           
/* 1194 */           var2.a(par1Packet132TileEntityData.e);
/*      */         }
/* 1196 */         else if (par1Packet132TileEntityData.d == 4 && var2 instanceof anw) {
/*      */           
/* 1198 */           var2.a(par1Packet132TileEntityData.e);
/*      */         }
/*      */         else {
/*      */           
/* 1202 */           var2.onDataPacket(this.g, par1Packet132TileEntityData);
/*      */         } 
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(dg par1Packet105UpdateProgressbar) {
/* 1210 */     ays var2 = this.h.g;
/* 1211 */     a((ef)par1Packet105UpdateProgressbar);
/*      */     
/* 1213 */     if (var2.bL != null && var2.bL.d == par1Packet105UpdateProgressbar.a)
/*      */     {
/* 1215 */       var2.bL.b(par1Packet105UpdateProgressbar.b, par1Packet105UpdateProgressbar.c);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ev par1Packet5PlayerInventory) {
/* 1221 */     lq var2 = a(par1Packet5PlayerInventory.a);
/*      */     
/* 1223 */     if (var2 != null)
/*      */     {
/* 1225 */       var2.b(par1Packet5PlayerInventory.b, par1Packet5PlayerInventory.d());
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(dd par1Packet101CloseWindow) {
/* 1231 */     this.h.g.f();
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(fh par1Packet54PlayNoteBlock) {
/* 1236 */     this.h.e.c(par1Packet54PlayNoteBlock.a, par1Packet54PlayNoteBlock.b, par1Packet54PlayNoteBlock.c, par1Packet54PlayNoteBlock.f, par1Packet54PlayNoteBlock.d, par1Packet54PlayNoteBlock.e);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ff par1Packet55BlockDestroy) {
/* 1241 */     this.h.e.g(par1Packet55BlockDestroy.d(), par1Packet55BlockDestroy.f(), par1Packet55BlockDestroy.g(), par1Packet55BlockDestroy.h(), par1Packet55BlockDestroy.i());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(dt par1Packet56MapChunks) {
/* 1246 */     for (int var2 = 0; var2 < par1Packet56MapChunks.d(); var2++) {
/*      */       
/* 1248 */       int var3 = par1Packet56MapChunks.a(var2);
/* 1249 */       int var4 = par1Packet56MapChunks.b(var2);
/* 1250 */       this.i.a(var3, var4, true);
/* 1251 */       this.i.b(var3 << 4, 0, var4 << 4, (var3 << 4) + 15, 256, (var4 << 4) + 15);
/* 1252 */       zz var5 = this.i.e(var3, var4);
/*      */       
/* 1254 */       if (var5 == null) {
/*      */         
/* 1256 */         this.i.a(var3, var4, true);
/* 1257 */         var5 = this.i.e(var3, var4);
/*      */       } 
/*      */       
/* 1260 */       if (var5 != null) {
/*      */         
/* 1262 */         var5.a(par1Packet56MapChunks.c(var2), par1Packet56MapChunks.a[var2], par1Packet56MapChunks.b[var2], true);
/* 1263 */         this.i.e(var3 << 4, 0, var4 << 4, (var3 << 4) + 15, 256, (var4 << 4) + 15);
/*      */         
/* 1265 */         if (!(this.i.u instanceof aas))
/*      */         {
/* 1267 */           var5.n();
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean b() {
/* 1278 */     return (this.h != null && this.h.e != null && this.h.g != null && this.i != null);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(dn par1Packet70GameEvent) {
/* 1283 */     ays var2 = this.h.g;
/* 1284 */     int var3 = par1Packet70GameEvent.b;
/* 1285 */     int var4 = par1Packet70GameEvent.c;
/*      */     
/* 1287 */     if (var3 >= 0 && var3 < dn.a.length && dn.a[var3] != null)
/*      */     {
/* 1289 */       var2.b(dn.a[var3]);
/*      */     }
/*      */     
/* 1292 */     if (var3 == 1) {
/*      */       
/* 1294 */       this.i.K().b(true);
/* 1295 */       this.i.k(0.0F);
/*      */     }
/* 1297 */     else if (var3 == 2) {
/*      */       
/* 1299 */       this.i.K().b(false);
/* 1300 */       this.i.k(1.0F);
/*      */     }
/* 1302 */     else if (var3 == 3) {
/*      */       
/* 1304 */       this.h.b.a(yl.a(var4));
/*      */     }
/* 1306 */     else if (var3 == 4) {
/*      */       
/* 1308 */       this.h.a((aul)new awh());
/*      */     }
/* 1310 */     else if (var3 == 5) {
/*      */       
/* 1312 */       ast var5 = this.h.y;
/*      */       
/* 1314 */       if (var4 == 0)
/*      */       {
/* 1316 */         this.h.a((aul)new atl());
/*      */       }
/* 1318 */       else if (var4 == 101)
/*      */       {
/* 1320 */         this.h.v.b().a("demo.help.movement", new Object[] { Keyboard.getKeyName(var5.E.d), Keyboard.getKeyName(var5.F.d), Keyboard.getKeyName(var5.G.d), Keyboard.getKeyName(var5.H.d) });
/*      */       }
/* 1322 */       else if (var4 == 102)
/*      */       {
/* 1324 */         this.h.v.b().a("demo.help.jump", new Object[] { Keyboard.getKeyName(var5.I.d) });
/*      */       }
/* 1326 */       else if (var4 == 103)
/*      */       {
/* 1328 */         this.h.v.b().a("demo.help.inventory", new Object[] { Keyboard.getKeyName(var5.J.d) });
/*      */       }
/*      */     
/* 1331 */     } else if (var3 == 6) {
/*      */       
/* 1333 */       this.i.a(var2.t, var2.u + var2.e(), var2.v, "random.successful_hit", 0.15F, 0.45F, false);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(cz par1Packet131MapData) {
/* 1342 */     FMLNetworkHandler.handlePacket131Packet(this, par1Packet131MapData);
/*      */   }
/*      */ 
/*      */   
/*      */   public void fmlPacket131Callback(cz par1Packet131MapData) {
/* 1347 */     if (par1Packet131MapData.a == up.bd.cj) {
/*      */       
/* 1349 */       ut.a(par1Packet131MapData.b, (yc)this.h.e).a(par1Packet131MapData.c);
/*      */     }
/*      */     else {
/*      */       
/* 1353 */       System.out.println("Unknown itemid: " + par1Packet131MapData.b);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(du par1Packet61DoorChange) {
/* 1359 */     if (par1Packet61DoorChange.d()) {
/*      */       
/* 1361 */       this.h.e.e(par1Packet61DoorChange.a, par1Packet61DoorChange.c, par1Packet61DoorChange.d, par1Packet61DoorChange.e, par1Packet61DoorChange.b);
/*      */     }
/*      */     else {
/*      */       
/* 1365 */       this.h.e.f(par1Packet61DoorChange.a, par1Packet61DoorChange.c, par1Packet61DoorChange.d, par1Packet61DoorChange.e, par1Packet61DoorChange.b);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(cs par1Packet200Statistic) {
/* 1374 */     this.h.g.b(jq.a(par1Packet200Statistic.a), par1Packet200Statistic.b);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(fj par1Packet41EntityEffect) {
/* 1382 */     lq var2 = a(par1Packet41EntityEffect.a);
/*      */     
/* 1384 */     if (var2 instanceof md)
/*      */     {
/* 1386 */       ((md)var2).d(new lm(par1Packet41EntityEffect.b, par1Packet41EntityEffect.d, par1Packet41EntityEffect.c));
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(en par1Packet42RemoveEntityEffect) {
/* 1395 */     lq var2 = a(par1Packet42RemoveEntityEffect.a);
/*      */     
/* 1397 */     if (var2 instanceof md)
/*      */     {
/* 1399 */       ((md)var2).n(par1Packet42RemoveEntityEffect.b);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a() {
/* 1408 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ek par1Packet201PlayerInfo) {
/* 1416 */     ayt var2 = (ayt)this.k.get(par1Packet201PlayerInfo.a);
/*      */     
/* 1418 */     if (var2 == null && par1Packet201PlayerInfo.b) {
/*      */       
/* 1420 */       var2 = new ayt(par1Packet201PlayerInfo.a);
/* 1421 */       this.k.put(par1Packet201PlayerInfo.a, var2);
/* 1422 */       this.c.add(var2);
/*      */     } 
/*      */     
/* 1425 */     if (var2 != null && !par1Packet201PlayerInfo.b) {
/*      */       
/* 1427 */       this.k.remove(par1Packet201PlayerInfo.a);
/* 1428 */       this.c.remove(var2);
/*      */     } 
/*      */     
/* 1431 */     if (par1Packet201PlayerInfo.b && var2 != null)
/*      */     {
/* 1433 */       var2.b = par1Packet201PlayerInfo.c;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(dq par1Packet0KeepAlive) {
/* 1442 */     c((ef)new dq(par1Packet0KeepAlive.a));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(eh par1Packet202PlayerAbilities) {
/* 1450 */     ays var2 = this.h.g;
/* 1451 */     var2.cd.b = par1Packet202PlayerAbilities.f();
/* 1452 */     var2.cd.d = par1Packet202PlayerAbilities.h();
/* 1453 */     var2.cd.a = par1Packet202PlayerAbilities.d();
/* 1454 */     var2.cd.c = par1Packet202PlayerAbilities.g();
/* 1455 */     var2.cd.a(par1Packet202PlayerAbilities.i());
/* 1456 */     var2.cd.b(par1Packet202PlayerAbilities.j());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ct par1Packet203AutoComplete) {
/* 1461 */     String[] var2 = par1Packet203AutoComplete.d().split("\000");
/*      */     
/* 1463 */     if (this.h.r instanceof ate) {
/*      */       
/* 1465 */       ate var3 = (ate)this.h.r;
/* 1466 */       var3.a(var2);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(dv par1Packet62LevelSound) {
/* 1472 */     this.h.e.a(par1Packet62LevelSound.f(), par1Packet62LevelSound.g(), par1Packet62LevelSound.h(), par1Packet62LevelSound.d(), par1Packet62LevelSound.i(), par1Packet62LevelSound.j(), false);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(di par1Packet250CustomPayload) {
/* 1477 */     FMLNetworkHandler.handlePacket250Packet(par1Packet250CustomPayload, this.g, this);
/*      */   }
/*      */ 
/*      */   
/*      */   public void handleVanilla250Packet(di par1Packet250CustomPayload) {
/* 1482 */     if ("MC|TPack".equals(par1Packet250CustomPayload.a)) {
/*      */       
/* 1484 */       String[] var2 = (new String(par1Packet250CustomPayload.c)).split("\000");
/* 1485 */       String var3 = var2[0];
/*      */       
/* 1487 */       if (var2[1].equals("16"))
/*      */       {
/* 1489 */         if (this.h.C.g())
/*      */         {
/* 1491 */           this.h.C.a(var3);
/*      */         }
/* 1493 */         else if (this.h.C.f())
/*      */         {
/* 1495 */           this.h.a((aul)new atf((aul)new ayi(this, var3), bn.a().b("multiplayer.texturePrompt.line1"), bn.a().b("multiplayer.texturePrompt.line2"), 0));
/*      */         }
/*      */       
/*      */       }
/* 1499 */     } else if ("MC|TrList".equals(par1Packet250CustomPayload.a)) {
/*      */       
/* 1501 */       DataInputStream var8 = new DataInputStream(new ByteArrayInputStream(par1Packet250CustomPayload.c));
/*      */ 
/*      */       
/*      */       try {
/* 1505 */         int var9 = var8.readInt();
/* 1506 */         aul var4 = this.h.r;
/*      */         
/* 1508 */         if (var4 != null && var4 instanceof awa && var9 == this.h.g.bL.d)
/*      */         {
/* 1510 */           xs var5 = ((awa)var4).g();
/* 1511 */           xu var6 = xu.a(var8);
/* 1512 */           var5.a(var6);
/*      */         }
/*      */       
/* 1515 */       } catch (IOException var7) {
/*      */         
/* 1517 */         var7.printStackTrace();
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ce f() {
/* 1527 */     return this.g;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public qx getPlayer() {
/* 1533 */     return (qx)this.h.g;
/*      */   }
/*      */ 
/*      */   
/*      */   public static void setConnectionCompatibilityLevel(byte connectionCompatibilityLevel) {
/* 1538 */     ayh.connectionCompatibilityLevel = connectionCompatibilityLevel;
/*      */   }
/*      */ 
/*      */   
/*      */   public static byte getConnectionCompatibilityLevel() {
/* 1543 */     return connectionCompatibilityLevel;
/*      */   }
/*      */ }


/* Location:              /home/luigi/Documents/JAR.jar!/ayh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */