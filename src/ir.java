/*     */ import net.minecraftforge.common.MinecraftForge;
/*     */ import net.minecraftforge.event.Event;
/*     */ import net.minecraftforge.event.ForgeEventFactory;
/*     */ import net.minecraftforge.event.entity.player.PlayerDestroyItemEvent;
/*     */ import net.minecraftforge.event.entity.player.PlayerInteractEvent;
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
/*     */ public class ir
/*     */ {
/*  22 */   private double blockReachDistance = 5.0D;
/*     */   
/*     */   public yc a;
/*     */   
/*     */   public iq b;
/*     */   
/*     */   private yl c;
/*     */   
/*     */   private boolean d;
/*     */   
/*     */   private int e;
/*     */   
/*     */   private int f;
/*     */   
/*     */   private int g;
/*     */   
/*     */   private int h;
/*     */   
/*     */   private int i;
/*     */   
/*     */   private boolean j;
/*     */   
/*     */   private int k;
/*     */   
/*     */   private int l;
/*     */   private int m;
/*     */   private int n;
/*     */   private int o;
/*     */   
/*     */   public ir(yc par1World) {
/*  52 */     this.c = yl.a;
/*  53 */     this.o = -1;
/*  54 */     this.a = par1World;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yl par1EnumGameType) {
/*  59 */     this.c = par1EnumGameType;
/*  60 */     par1EnumGameType.a(this.b.cd);
/*  61 */     this.b.o();
/*     */   }
/*     */ 
/*     */   
/*     */   public yl b() {
/*  66 */     return this.c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  74 */     return this.c.d();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(yl par1EnumGameType) {
/*  82 */     if (this.c == yl.a)
/*     */     {
/*  84 */       this.c = par1EnumGameType;
/*     */     }
/*     */     
/*  87 */     a(this.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/*  92 */     this.i++;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  97 */     if (this.j) {
/*     */       
/*  99 */       int var1 = this.i - this.n;
/* 100 */       int var2 = this.a.a(this.k, this.l, this.m);
/*     */       
/* 102 */       if (var2 == 0) {
/*     */         
/* 104 */         this.j = false;
/*     */       }
/*     */       else {
/*     */         
/* 108 */         amq var3 = amq.p[var2];
/* 109 */         float var4 = var3.a(this.b, this.b.p, this.k, this.l, this.m) * (var1 + 1);
/* 110 */         int var5 = (int)(var4 * 10.0F);
/*     */         
/* 112 */         if (var5 != this.o) {
/*     */           
/* 114 */           this.a.g(this.b.k, this.k, this.l, this.m, var5);
/* 115 */           this.o = var5;
/*     */         } 
/*     */         
/* 118 */         if (var4 >= 1.0F)
/*     */         {
/* 120 */           this.j = false;
/* 121 */           b(this.k, this.l, this.m);
/*     */         }
/*     */       
/*     */       } 
/* 125 */     } else if (this.d) {
/*     */       
/* 127 */       int var1 = this.a.a(this.f, this.g, this.h);
/* 128 */       amq var6 = amq.p[var1];
/*     */       
/* 130 */       if (var6 == null) {
/*     */         
/* 132 */         this.a.g(this.b.k, this.f, this.g, this.h, -1);
/* 133 */         this.o = -1;
/* 134 */         this.d = false;
/*     */       }
/*     */       else {
/*     */         
/* 138 */         int var7 = this.i - this.e;
/* 139 */         float var4 = var6.a(this.b, this.b.p, this.f, this.g, this.h) * (var7 + 1);
/* 140 */         int var5 = (int)(var4 * 10.0F);
/*     */         
/* 142 */         if (var5 != this.o) {
/*     */           
/* 144 */           this.a.g(this.b.k, this.f, this.g, this.h, var5);
/* 145 */           this.o = var5;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int par1, int par2, int par3, int par4) {
/* 157 */     if (!this.c.c() || this.b.f(par1, par2, par3)) {
/*     */       
/* 159 */       PlayerInteractEvent event = ForgeEventFactory.onPlayerInteract(this.b, PlayerInteractEvent.Action.LEFT_CLICK_BLOCK, par1, par2, par3, par4);
/* 160 */       if (event.isCanceled()) {
/*     */         
/* 162 */         this.b.a.b((ef)new fi(par1, par2, par3, this.a));
/*     */         
/*     */         return;
/*     */       } 
/* 166 */       if (d()) {
/*     */         
/* 168 */         if (!this.a.a((qx)null, par1, par2, par3, par4))
/*     */         {
/* 170 */           b(par1, par2, par3);
/*     */         }
/*     */       }
/*     */       else {
/*     */         
/* 175 */         this.e = this.i;
/* 176 */         float var5 = 1.0F;
/* 177 */         int var6 = this.a.a(par1, par2, par3);
/* 178 */         amq block = amq.p[var6];
/*     */         
/* 180 */         if (block != null) {
/*     */           
/* 182 */           if (event.useBlock != Event.Result.DENY) {
/*     */             
/* 184 */             block.a(this.a, par1, par2, par3, this.b);
/* 185 */             this.a.a(this.b, par1, par2, par3, par4);
/*     */           }
/*     */           else {
/*     */             
/* 189 */             this.b.a.b((ef)new fi(par1, par2, par3, this.a));
/*     */           } 
/* 191 */           var5 = block.a(this.b, this.b.p, par1, par2, par3);
/*     */         } 
/*     */         
/* 194 */         if (event.useItem == Event.Result.DENY) {
/*     */           
/* 196 */           if (var5 >= 1.0F)
/*     */           {
/* 198 */             this.b.a.b((ef)new fi(par1, par2, par3, this.a));
/*     */           }
/*     */           
/*     */           return;
/*     */         } 
/* 203 */         if (var6 > 0 && var5 >= 1.0F) {
/*     */           
/* 205 */           b(par1, par2, par3);
/*     */         }
/*     */         else {
/*     */           
/* 209 */           this.d = true;
/* 210 */           this.f = par1;
/* 211 */           this.g = par2;
/* 212 */           this.h = par3;
/* 213 */           int var7 = (int)(var5 * 10.0F);
/* 214 */           this.a.g(this.b.k, par1, par2, par3, var7);
/* 215 */           this.o = var7;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int par1, int par2, int par3) {
/* 223 */     if (par1 == this.f && par2 == this.g && par3 == this.h) {
/*     */       
/* 225 */       int var4 = this.i - this.e;
/* 226 */       int var5 = this.a.a(par1, par2, par3);
/*     */       
/* 228 */       if (var5 != 0) {
/*     */         
/* 230 */         amq var6 = amq.p[var5];
/* 231 */         float var7 = var6.a(this.b, this.b.p, par1, par2, par3) * (var4 + 1);
/*     */         
/* 233 */         if (var7 >= 0.7F) {
/*     */           
/* 235 */           this.d = false;
/* 236 */           this.a.g(this.b.k, par1, par2, par3, -1);
/* 237 */           b(par1, par2, par3);
/*     */         }
/* 239 */         else if (!this.j) {
/*     */           
/* 241 */           this.d = false;
/* 242 */           this.j = true;
/* 243 */           this.k = par1;
/* 244 */           this.l = par2;
/* 245 */           this.m = par3;
/* 246 */           this.n = this.e;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(int par1, int par2, int par3) {
/* 257 */     this.d = false;
/* 258 */     this.a.g(this.b.k, this.f, this.g, this.h, -1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean d(int par1, int par2, int par3) {
/* 266 */     amq var4 = amq.p[this.a.a(par1, par2, par3)];
/* 267 */     int var5 = this.a.h(par1, par2, par3);
/*     */     
/* 269 */     if (var4 != null)
/*     */     {
/* 271 */       var4.a(this.a, par1, par2, par3, var5, this.b);
/*     */     }
/*     */     
/* 274 */     boolean var6 = (var4 != null && var4.removeBlockByPlayer(this.a, this.b, par1, par2, par3));
/*     */     
/* 276 */     if (var4 != null && var6)
/*     */     {
/* 278 */       var4.c(this.a, par1, par2, par3, var5);
/*     */     }
/*     */     
/* 281 */     return var6;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(int par1, int par2, int par3) {
/* 289 */     if (this.c.c() && !this.b.f(par1, par2, par3))
/*     */     {
/* 291 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 295 */     ur stack = this.b.bS();
/* 296 */     if (stack != null && stack.b().onBlockStartBreak(stack, par1, par2, par3, this.b))
/*     */     {
/* 298 */       return false;
/*     */     }
/* 300 */     int var4 = this.a.a(par1, par2, par3);
/* 301 */     int var5 = this.a.h(par1, par2, par3);
/* 302 */     this.a.a(this.b, 2001, par1, par2, par3, var4 + (this.a.h(par1, par2, par3) << 12));
/* 303 */     boolean var6 = false;
/*     */     
/* 305 */     if (d()) {
/*     */       
/* 307 */       var6 = d(par1, par2, par3);
/* 308 */       this.b.a.b((ef)new fi(par1, par2, par3, this.a));
/*     */     }
/*     */     else {
/*     */       
/* 312 */       ur var7 = this.b.bS();
/* 313 */       boolean var8 = false;
/* 314 */       amq block = amq.p[var4];
/* 315 */       if (block != null)
/*     */       {
/* 317 */         var8 = block.canHarvestBlock(this.b, var5);
/*     */       }
/*     */       
/* 320 */       if (var7 != null) {
/*     */         
/* 322 */         var7.a(this.a, var4, par1, par2, par3, this.b);
/*     */         
/* 324 */         if (var7.a == 0)
/*     */         {
/* 326 */           this.b.bT();
/*     */         }
/*     */       } 
/*     */       
/* 330 */       var6 = d(par1, par2, par3);
/* 331 */       if (var6 && var8)
/*     */       {
/* 333 */         amq.p[var4].a(this.a, this.b, par1, par2, par3, var5);
/*     */       }
/*     */     } 
/*     */     
/* 337 */     return var6;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer, yc par2World, ur par3ItemStack) {
/* 346 */     int var4 = par3ItemStack.a;
/* 347 */     int var5 = par3ItemStack.j();
/* 348 */     ur var6 = par3ItemStack.a(par2World, par1EntityPlayer);
/*     */     
/* 350 */     if (var6 == par3ItemStack && (var6 == null || (var6.a == var4 && var6.m() <= 0 && var6.j() == var5)))
/*     */     {
/* 352 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 356 */     par1EntityPlayer.bJ.a[par1EntityPlayer.bJ.c] = var6;
/*     */     
/* 358 */     if (d()) {
/*     */       
/* 360 */       var6.a = var4;
/*     */       
/* 362 */       if (var6.f())
/*     */       {
/* 364 */         var6.b(var5);
/*     */       }
/*     */     } 
/*     */     
/* 368 */     if (var6.a == 0) {
/*     */       
/* 370 */       par1EntityPlayer.bJ.a[par1EntityPlayer.bJ.c] = null;
/* 371 */       MinecraftForge.EVENT_BUS.post((Event)new PlayerDestroyItemEvent(this.b, var6));
/*     */     } 
/*     */     
/* 374 */     if (!par1EntityPlayer.bM())
/*     */     {
/* 376 */       ((iq)par1EntityPlayer).a(par1EntityPlayer.bK);
/*     */     }
/*     */     
/* 379 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer, yc par2World, ur par3ItemStack, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/* 389 */     PlayerInteractEvent event = ForgeEventFactory.onPlayerInteract(par1EntityPlayer, PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK, par4, par5, par6, par7);
/* 390 */     if (event.isCanceled()) {
/*     */       
/* 392 */       this.b.a.b((ef)new fi(par4, par5, par6, this.a));
/* 393 */       return false;
/*     */     } 
/*     */     
/* 396 */     int var11 = par2World.a(par4, par5, par6);
/*     */     
/* 398 */     if (!par1EntityPlayer.ah() || par1EntityPlayer.bD() == null)
/*     */     {
/* 400 */       if (var11 > 0 && amq.p[var11].a(par2World, par4, par5, par6, par1EntityPlayer, par7, par8, par9, par10))
/*     */       {
/* 402 */         return true;
/*     */       }
/*     */     }
/*     */     
/* 406 */     up item = (par3ItemStack != null) ? par3ItemStack.b() : null;
/* 407 */     if (item != null && item.onItemUseFirst(par3ItemStack, par1EntityPlayer, par2World, par4, par5, par6, par7, par8, par9, par10)) {
/*     */       
/* 409 */       if (par3ItemStack.a <= 0) ForgeEventFactory.onPlayerDestroyItem(this.b, par3ItemStack); 
/* 410 */       return true;
/*     */     } 
/*     */     
/* 413 */     amq block = amq.p[var11];
/* 414 */     boolean result = false;
/*     */     
/* 416 */     if (block != null)
/*     */     {
/* 418 */       if (event.useBlock != Event.Result.DENY) {
/*     */         
/* 420 */         result = block.a(par2World, par4, par5, par6, par1EntityPlayer, par7, par8, par9, par10);
/*     */       }
/*     */       else {
/*     */         
/* 424 */         this.b.a.b((ef)new fi(par4, par5, par6, this.a));
/* 425 */         result = (event.useItem != Event.Result.ALLOW);
/*     */       } 
/*     */     }
/*     */     
/* 429 */     if (par3ItemStack != null && !result) {
/*     */       
/* 431 */       int meta = par3ItemStack.j();
/* 432 */       int size = par3ItemStack.a;
/* 433 */       result = par3ItemStack.a(par1EntityPlayer, par2World, par4, par5, par6, par7, par8, par9, par10);
/* 434 */       if (d()) {
/*     */         
/* 436 */         par3ItemStack.b(meta);
/* 437 */         par3ItemStack.a = size;
/*     */       } 
/* 439 */       if (par3ItemStack.a <= 0) ForgeEventFactory.onPlayerDestroyItem(this.b, par3ItemStack);
/*     */     
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 447 */     return result;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(in par1WorldServer) {
/* 455 */     this.a = (yc)par1WorldServer;
/*     */   }
/*     */ 
/*     */   
/*     */   public double getBlockReachDistance() {
/* 460 */     return this.blockReachDistance;
/*     */   }
/*     */   
/*     */   public void setBlockReachDistance(double distance) {
/* 464 */     this.blockReachDistance = distance;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/ir.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */