/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import net.minecraftforge.common.ForgeHooks;
/*     */ import net.minecraftforge.common.MinecraftForge;
/*     */ import net.minecraftforge.event.Event;
/*     */ import net.minecraftforge.event.entity.player.PlayerDropsEvent;
/*     */ import net.minecraftforge.event.world.ChunkWatchEvent;
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
/*     */ public class iq
/*     */   extends qx
/*     */   implements rw
/*     */ {
/*  85 */   private bn ck = new bn("en_US");
/*     */ 
/*     */ 
/*     */   
/*     */   public iv a;
/*     */ 
/*     */ 
/*     */   
/*     */   public MinecraftServer b;
/*     */ 
/*     */   
/*     */   public ir c;
/*     */ 
/*     */   
/*     */   public double d;
/*     */ 
/*     */   
/*     */   public double e;
/*     */ 
/*     */   
/* 105 */   public final List f = new LinkedList();
/*     */ 
/*     */   
/* 108 */   public final List g = new LinkedList();
/*     */ 
/*     */   
/* 111 */   private int cl = -99999999;
/*     */ 
/*     */   
/* 114 */   private int cm = -99999999;
/*     */ 
/*     */   
/*     */   private boolean cn = true;
/*     */ 
/*     */   
/* 120 */   private int co = -99999999;
/*     */ 
/*     */   
/* 123 */   private int cp = 60;
/*     */ 
/*     */   
/* 126 */   private int cq = 0;
/* 127 */   private int cr = 0;
/*     */ 
/*     */   
/*     */   private boolean cs = true;
/*     */ 
/*     */   
/* 133 */   public int ct = 0;
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean h;
/*     */ 
/*     */ 
/*     */   
/*     */   public int i;
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean j = false;
/*     */ 
/*     */ 
/*     */   
/*     */   public iq(MinecraftServer par1MinecraftServer, yc par2World, String par3Str, ir par4ItemInWorldManager) {
/* 150 */     super(par2World);
/* 151 */     par4ItemInWorldManager.b = this;
/* 152 */     this.c = par4ItemInWorldManager;
/* 153 */     this.cq = par1MinecraftServer.ad().o();
/* 154 */     s var5 = par2World.u.getRandomizedSpawnPoint();
/* 155 */     int var6 = var5.a;
/* 156 */     int var7 = var5.c;
/* 157 */     int var8 = var5.b;
/*     */     
/* 159 */     b(var6 + 0.5D, var8, var7 + 0.5D, 0.0F, 0.0F);
/* 160 */     this.b = par1MinecraftServer;
/* 161 */     this.X = 0.0F;
/* 162 */     this.bR = par3Str;
/* 163 */     this.M = 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/* 171 */     super.a(par1NBTTagCompound);
/*     */     
/* 173 */     if (par1NBTTagCompound.b("playerGameType"))
/*     */     {
/* 175 */       this.c.a(yl.a(par1NBTTagCompound.e("playerGameType")));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/* 184 */     super.b(par1NBTTagCompound);
/* 185 */     par1NBTTagCompound.a("playerGameType", this.c.b().a());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int par1) {
/* 193 */     super.a(par1);
/* 194 */     this.co = -1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d_() {
/* 199 */     this.bL.a(this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void e_() {
/* 207 */     this.M = 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public float e() {
/* 212 */     return 1.62F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void j_() {
/* 220 */     this.c.a();
/* 221 */     this.cp--;
/* 222 */     this.bL.b();
/*     */     
/* 224 */     while (!this.g.isEmpty()) {
/*     */       
/* 226 */       int var1 = Math.min(this.g.size(), 127);
/* 227 */       int[] var2 = new int[var1];
/* 228 */       Iterator var3 = this.g.iterator();
/* 229 */       int var4 = 0;
/*     */       
/* 231 */       while (var3.hasNext() && var4 < var1) {
/*     */         
/* 233 */         var2[var4++] = ((Integer)var3.next()).intValue();
/* 234 */         var3.remove();
/*     */       } 
/*     */       
/* 237 */       this.a.b((ef)new em(var2));
/*     */     } 
/*     */     
/* 240 */     if (!this.f.isEmpty()) {
/*     */       
/* 242 */       ArrayList<zz> var6 = new ArrayList();
/* 243 */       Iterator<xv> var7 = this.f.iterator();
/* 244 */       ArrayList var8 = new ArrayList();
/*     */       
/* 246 */       while (var7.hasNext() && var6.size() < 5) {
/*     */         
/* 248 */         xv var9 = var7.next();
/* 249 */         var7.remove();
/*     */         
/* 251 */         if (var9 != null && this.p.f(var9.a << 4, 0, var9.b << 4)) {
/*     */           
/* 253 */           var6.add(this.p.e(var9.a, var9.b));
/*     */ 
/*     */ 
/*     */           
/* 257 */           var8.addAll(((in)this.p).b(var9.a * 16, 0, var9.b * 16, var9.a * 16 + 15, 256, var9.b * 16 + 15));
/*     */         } 
/*     */       } 
/*     */       
/* 261 */       if (!var6.isEmpty()) {
/*     */         
/* 263 */         this.a.b((ef)new dt(var6));
/* 264 */         Iterator<any> var11 = var8.iterator();
/*     */         
/* 266 */         while (var11.hasNext()) {
/*     */           
/* 268 */           any var5 = var11.next();
/* 269 */           b(var5);
/*     */         } 
/*     */         
/* 272 */         var11 = (Iterator)var6.iterator();
/*     */         
/* 274 */         while (var11.hasNext()) {
/*     */           
/* 276 */           zz var10 = (zz)var11.next();
/* 277 */           p().p().a(this, var10);
/* 278 */           MinecraftForge.EVENT_BUS.post((Event)new ChunkWatchEvent.Watch(var10.l(), this));
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void g() {
/* 286 */     super.j_();
/*     */     
/* 288 */     for (int var1 = 0; var1 < this.bJ.k_(); var1++) {
/*     */       
/* 290 */       ur var2 = this.bJ.a(var1);
/*     */       
/* 292 */       if (var2 != null && up.e[var2.c].f() && this.a.e() <= 5) {
/*     */         
/* 294 */         ef var3 = ((ti)up.e[var2.c]).c(var2, this.p, this);
/*     */         
/* 296 */         if (var3 != null)
/*     */         {
/* 298 */           this.a.b(var3);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 303 */     if (aU() != this.cl || this.cm != this.bM.a() || ((this.bM.e() == 0.0F)) != this.cn) {
/*     */       
/* 305 */       this.a.b((ef)new ex(aU(), this.bM.a(), this.bM.e()));
/* 306 */       this.cl = aU();
/* 307 */       this.cm = this.bM.a();
/* 308 */       this.cn = (this.bM.e() == 0.0F);
/*     */     } 
/*     */     
/* 311 */     if (this.cf != this.co) {
/*     */       
/* 313 */       this.co = this.cf;
/* 314 */       this.a.b((ef)new ew(this.cg, this.cf, this.ce));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(lh par1DamageSource) {
/* 323 */     if (ForgeHooks.onLivingDeath(this, par1DamageSource)) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 328 */     this.b.ad().k(par1DamageSource.b(this));
/*     */     
/* 330 */     if (!this.p.L().b("keepInventory")) {
/*     */       
/* 332 */       this.captureDrops = true;
/* 333 */       this.capturedDrops.clear();
/*     */       
/* 335 */       this.bJ.l();
/*     */       
/* 337 */       this.captureDrops = false;
/* 338 */       PlayerDropsEvent event = new PlayerDropsEvent(this, par1DamageSource, this.capturedDrops, (this.bk > 0));
/* 339 */       if (!MinecraftForge.EVENT_BUS.post((Event)event))
/*     */       {
/* 341 */         for (px item : this.capturedDrops)
/*     */         {
/* 343 */           a(item);
/*     */         }
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(lh par1DamageSource, int par2) {
/* 354 */     if (ar())
/*     */     {
/* 356 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 360 */     boolean var3 = (this.b.T() && this.b.X() && "fall".equals(par1DamageSource.q));
/*     */     
/* 362 */     if (!var3 && this.cp > 0 && par1DamageSource != lh.i)
/*     */     {
/* 364 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 368 */     if (!this.b.X() && par1DamageSource instanceof li) {
/*     */       
/* 370 */       lq var4 = par1DamageSource.g();
/*     */       
/* 372 */       if (var4 instanceof qx)
/*     */       {
/* 374 */         return false;
/*     */       }
/*     */       
/* 377 */       if (var4 instanceof qz) {
/*     */         
/* 379 */         qz var5 = (qz)var4;
/*     */         
/* 381 */         if (var5.c instanceof qx)
/*     */         {
/* 383 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 388 */     return super.a(par1DamageSource, par2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean h() {
/* 398 */     return this.b.X();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(int par1) {
/* 406 */     if (this.aq == 1 && par1 == 1) {
/*     */       
/* 408 */       a((jl)jh.C);
/* 409 */       this.p.e(this);
/* 410 */       this.j = true;
/* 411 */       this.a.b((ef)new dn(4, 0));
/*     */     }
/*     */     else {
/*     */       
/* 415 */       if (this.aq == 1 && par1 == 0) {
/*     */         
/* 417 */         a((jl)jh.B);
/* 418 */         s var2 = this.b.a(par1).l();
/*     */         
/* 420 */         if (var2 != null)
/*     */         {
/* 422 */           this.a.a(var2.a, var2.b, var2.c, 0.0F, 0.0F);
/*     */         }
/*     */         
/* 425 */         par1 = 1;
/*     */       }
/*     */       else {
/*     */         
/* 429 */         a((jl)jh.x);
/*     */       } 
/*     */       
/* 432 */       this.b.ad().a(this, par1);
/* 433 */       this.co = -1;
/* 434 */       this.cl = -1;
/* 435 */       this.cm = -1;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void b(any par1TileEntity) {
/* 444 */     if (par1TileEntity != null) {
/*     */       
/* 446 */       ef var2 = par1TileEntity.l();
/*     */       
/* 448 */       if (var2 != null)
/*     */       {
/* 450 */         this.a.b(var2);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(lq par1Entity, int par2) {
/* 460 */     super.a(par1Entity, par2);
/* 461 */     this.bL.b();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public qy a(int par1, int par2, int par3) {
/* 469 */     qy var4 = super.a(par1, par2, par3);
/*     */     
/* 471 */     if (var4 == qy.a) {
/*     */       
/* 473 */       dk var5 = new dk(this, 0, par1, par2, par3);
/* 474 */       p().p().a(this, (ef)var5);
/* 475 */       this.a.a(this.t, this.u, this.v, this.z, this.A);
/* 476 */       this.a.b((ef)var5);
/*     */     } 
/*     */     
/* 479 */     return var4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(boolean par1, boolean par2, boolean par3) {
/* 487 */     if (bw())
/*     */     {
/* 489 */       p().p().b(this, (ef)new cr(this, 3));
/*     */     }
/*     */     
/* 492 */     super.a(par1, par2, par3);
/*     */     
/* 494 */     if (this.a != null)
/*     */     {
/* 496 */       this.a.a(this.t, this.u, this.v, this.z, this.A);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(lq par1Entity) {
/* 505 */     super.a(par1Entity);
/* 506 */     this.a.b((ef)new ey(this, this.o));
/* 507 */     this.a.a(this.t, this.u, this.v, this.z, this.A);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(double par1, boolean par3) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(double par1, boolean par3) {
/* 521 */     super.a(par1, par3);
/*     */   }
/*     */ 
/*     */   
/*     */   public void cg() {
/* 526 */     this.ct = this.ct % 100 + 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(int par1, int par2, int par3) {
/* 534 */     cg();
/* 535 */     this.a.b((ef)new de(this.ct, 1, "Crafting", 9));
/* 536 */     this.bL = (rq)new rz(this.bJ, this.p, par1, par2, par3);
/* 537 */     this.bL.d = this.ct;
/* 538 */     this.bL.a(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(int par1, int par2, int par3) {
/* 543 */     cg();
/* 544 */     this.a.b((ef)new de(this.ct, 4, "Enchanting", 9));
/* 545 */     this.bL = (rq)new sa(this.bJ, this.p, par1, par2, par3);
/* 546 */     this.bL.d = this.ct;
/* 547 */     this.bL.a(this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void d(int par1, int par2, int par3) {
/* 555 */     cg();
/* 556 */     this.a.b((ef)new de(this.ct, 8, "Repairing", 9));
/* 557 */     this.bL = (rq)new sm(this.bJ, this.p, par1, par2, par3, this);
/* 558 */     this.bL.d = this.ct;
/* 559 */     this.bL.a(this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(la par1IInventory) {
/* 567 */     if (this.bL != this.bK)
/*     */     {
/* 569 */       i();
/*     */     }
/*     */     
/* 572 */     cg();
/* 573 */     this.a.b((ef)new de(this.ct, 0, par1IInventory.b(), par1IInventory.k_()));
/* 574 */     this.bL = (rq)new rx((la)this.bJ, par1IInventory);
/* 575 */     this.bL.d = this.ct;
/* 576 */     this.bL.a(this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(anr par1TileEntityFurnace) {
/* 584 */     cg();
/* 585 */     this.a.b((ef)new de(this.ct, 2, par1TileEntityFurnace.b(), par1TileEntityFurnace.k_()));
/* 586 */     this.bL = (rq)new sd(this.bJ, par1TileEntityFurnace);
/* 587 */     this.bL.d = this.ct;
/* 588 */     this.bL.a(this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ano par1TileEntityDispenser) {
/* 596 */     cg();
/* 597 */     this.a.b((ef)new de(this.ct, 3, par1TileEntityDispenser.b(), par1TileEntityDispenser.k_()));
/* 598 */     this.bL = (rq)new ss((la)this.bJ, par1TileEntityDispenser);
/* 599 */     this.bL.d = this.ct;
/* 600 */     this.bL.a(this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(anl par1TileEntityBrewingStand) {
/* 608 */     cg();
/* 609 */     this.a.b((ef)new de(this.ct, 5, par1TileEntityBrewingStand.b(), par1TileEntityBrewingStand.k_()));
/* 610 */     this.bL = (rq)new rt(this.bJ, par1TileEntityBrewingStand);
/* 611 */     this.bL.d = this.ct;
/* 612 */     this.bL.a(this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ank par1TileEntityBeacon) {
/* 620 */     cg();
/* 621 */     this.a.b((ef)new de(this.ct, 7, par1TileEntityBeacon.b(), par1TileEntityBeacon.k_()));
/* 622 */     this.bL = (rq)new rr(this.bJ, par1TileEntityBeacon);
/* 623 */     this.bL.d = this.ct;
/* 624 */     this.bL.a(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(xs par1IMerchant) {
/* 629 */     cg();
/* 630 */     this.bL = (rq)new sj(this.bJ, par1IMerchant, this.p);
/* 631 */     this.bL.d = this.ct;
/* 632 */     this.bL.a(this);
/* 633 */     si var2 = ((sj)this.bL).d();
/* 634 */     this.a.b((ef)new de(this.ct, 6, var2.b(), var2.k_()));
/* 635 */     xu var3 = par1IMerchant.b(this);
/*     */     
/* 637 */     if (var3 != null) {
/*     */       
/*     */       try {
/*     */         
/* 641 */         ByteArrayOutputStream var4 = new ByteArrayOutputStream();
/* 642 */         DataOutputStream var5 = new DataOutputStream(var4);
/* 643 */         var5.writeInt(this.ct);
/* 644 */         var3.a(var5);
/* 645 */         this.a.b((ef)new di("MC|TrList", var4.toByteArray()));
/*     */       }
/* 647 */       catch (IOException var6) {
/*     */         
/* 649 */         var6.printStackTrace();
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(rq par1Container, int par2, ur par3ItemStack) {
/* 660 */     if (!(par1Container.a(par2) instanceof sq))
/*     */     {
/* 662 */       if (!this.h)
/*     */       {
/* 664 */         this.a.b((ef)new dh(par1Container.d, par2, par3ItemStack));
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(rq par1Container) {
/* 671 */     a(par1Container, par1Container.a());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(rq par1Container, List par2List) {
/* 676 */     this.a.b((ef)new df(par1Container.d, par2List));
/* 677 */     this.a.b((ef)new dh(-1, -1, this.bJ.n()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(rq par1Container, int par2, int par3) {
/* 687 */     this.a.b((ef)new dg(par1Container.d, par2, par3));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void i() {
/* 695 */     this.a.b((ef)new dd(this.bL.d));
/* 696 */     k();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void j() {
/* 704 */     if (!this.h)
/*     */     {
/* 706 */       this.a.b((ef)new dh(-1, -1, this.bJ.n()));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 712 */     this.bL.b(this);
/* 713 */     this.bL = this.bK;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(jl par1StatBase, int par2) {
/* 721 */     if (par1StatBase != null)
/*     */     {
/* 723 */       if (!par1StatBase.f) {
/*     */         
/* 725 */         while (par2 > 100) {
/*     */           
/* 727 */           this.a.b((ef)new cs(par1StatBase.e, 100));
/* 728 */           par2 -= 100;
/*     */         } 
/*     */         
/* 731 */         this.a.b((ef)new cs(par1StatBase.e, par2));
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void l() {
/* 738 */     if (this.o != null)
/*     */     {
/* 740 */       a(this.o);
/*     */     }
/*     */     
/* 743 */     if (this.n != null)
/*     */     {
/* 745 */       this.n.a(this);
/*     */     }
/*     */     
/* 748 */     if (this.bZ)
/*     */     {
/* 750 */       a(true, false, false);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void m() {
/* 760 */     this.cl = -99999999;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(String par1Str) {
/* 768 */     bn var2 = bn.a();
/* 769 */     String var3 = var2.b(par1Str);
/* 770 */     this.a.b((ef)new cu(var3));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void n() {
/* 779 */     this.a.b((ef)new dl(this.k, (byte)9));
/* 780 */     super.n();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, int par2) {
/* 788 */     super.a(par1ItemStack, par2);
/*     */     
/* 790 */     if (par1ItemStack != null && par1ItemStack.b() != null && par1ItemStack.b().b_(par1ItemStack) == vs.b)
/*     */     {
/* 792 */       p().p().b(this, (ef)new cr(this, 5));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(qx par1EntityPlayer, boolean par2) {
/* 802 */     super.a(par1EntityPlayer, par2);
/* 803 */     this.co = -1;
/* 804 */     this.cl = -1;
/* 805 */     this.cm = -1;
/* 806 */     this.g.addAll(((iq)par1EntityPlayer).g);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(lm par1PotionEffect) {
/* 811 */     super.a(par1PotionEffect);
/* 812 */     this.a.b((ef)new fj(this.k, par1PotionEffect));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(lm par1PotionEffect) {
/* 817 */     super.b(par1PotionEffect);
/* 818 */     this.a.b((ef)new fj(this.k, par1PotionEffect));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void c(lm par1PotionEffect) {
/* 823 */     super.c(par1PotionEffect);
/* 824 */     this.a.b((ef)new en(this.k, par1PotionEffect));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(double par1, double par3, double par5) {
/* 832 */     this.a.a(par1, par3, par5, this.z, this.A);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(lq par1Entity) {
/* 840 */     p().p().b(this, (ef)new cr(par1Entity, 6));
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(lq par1Entity) {
/* 845 */     p().p().b(this, (ef)new cr(par1Entity, 7));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void o() {
/* 853 */     if (this.a != null)
/*     */     {
/* 855 */       this.a.b((ef)new eh(this.cd));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public in p() {
/* 861 */     return (in)this.p;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yl par1EnumGameType) {
/* 866 */     this.c.a(par1EnumGameType);
/* 867 */     this.a.b((ef)new dn(3, par1EnumGameType.a()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(String par1Str) {
/* 872 */     this.a.b((ef)new cu(par1Str));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(int par1, String par2Str) {
/* 880 */     return ("seed".equals(par2Str) && !this.b.T()) ? true : ((!"tell".equals(par2Str) && !"help".equals(par2Str) && !"me".equals(par2Str)) ? this.b.ad().e(this.bR) : true);
/*     */   }
/*     */ 
/*     */   
/*     */   public String q() {
/* 885 */     String var1 = this.a.b.c().toString();
/* 886 */     var1 = var1.substring(var1.indexOf("/") + 1);
/* 887 */     var1 = var1.substring(0, var1.indexOf(":"));
/* 888 */     return var1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(cx par1Packet204ClientInfo) {
/* 893 */     if (this.ck.b().containsKey(par1Packet204ClientInfo.d()))
/*     */     {
/* 895 */       this.ck.a(par1Packet204ClientInfo.d());
/*     */     }
/*     */     
/* 898 */     int var2 = 256 >> par1Packet204ClientInfo.f();
/*     */     
/* 900 */     if (var2 > 3 && var2 < 15)
/*     */     {
/* 902 */       this.cq = var2;
/*     */     }
/*     */     
/* 905 */     this.cr = par1Packet204ClientInfo.g();
/* 906 */     this.cs = par1Packet204ClientInfo.h();
/*     */     
/* 908 */     if (this.b.I() && this.b.H().equals(this.bR))
/*     */     {
/* 910 */       this.b.c(par1Packet204ClientInfo.i());
/*     */     }
/*     */     
/* 913 */     b(1, !par1Packet204ClientInfo.j());
/*     */   }
/*     */ 
/*     */   
/*     */   public bn s() {
/* 918 */     return this.ck;
/*     */   }
/*     */ 
/*     */   
/*     */   public int u() {
/* 923 */     return this.cr;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(String par1Str, int par2) {
/* 931 */     String var3 = par1Str + "\000" + par2;
/* 932 */     this.a.b((ef)new di("MC|TPack", var3.getBytes()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public s b() {
/* 940 */     return new s(ke.c(this.t), ke.c(this.u + 0.5D), ke.c(this.v));
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/iq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */