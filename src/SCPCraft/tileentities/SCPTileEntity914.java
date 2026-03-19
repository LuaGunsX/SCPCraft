/*     */ package SCPCraft.tileentities;
/*     */ 
/*     */ import ModLoader;
/*     */ import SCPCraft.recipes.SCP9141_1Recipes;
/*     */ import SCPCraft.recipes.SCP914CoarseRecipes;
/*     */ import SCPCraft.recipes.SCP914FineRecipes;
/*     */ import SCPCraft.recipes.SCP914RoughRecipes;
/*     */ import SCPCraft.recipes.SCP914VeryFineRecipes;
/*     */ import any;
/*     */ import bq;
/*     */ import by;
/*     */ import cd;
/*     */ import java.util.Random;
/*     */ import la;
/*     */ import lv;
/*     */ import paulscode.sound.SoundSystem;
/*     */ import qx;
/*     */ import up;
/*     */ import ur;
/*     */ 
/*     */ public class SCPTileEntity914
/*     */   extends any implements la {
/*  23 */   private ur[] SCP914ItemStacks = new ur[7];
/*  24 */   public int SCP914BurnTime = 0;
/*  25 */   public int currentItemBurnTime = 0;
/*  26 */   public int SCP914CookTime = 0;
/*     */   
/*     */   public static SoundSystem sndSystem;
/*     */   
/*     */   public int k_() {
/*  31 */     return this.SCP914ItemStacks.length;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ur a(int par1) {
/*  39 */     return this.SCP914ItemStacks[par1];
/*     */   }
/*     */ 
/*     */   
/*     */   public ur a(int var1, int var2) {
/*  44 */     if (this.SCP914ItemStacks[var1] != null) {
/*     */ 
/*     */ 
/*     */       
/*  48 */       if ((this.SCP914ItemStacks[var1]).a <= var2) {
/*     */         
/*  50 */         ur ur1 = this.SCP914ItemStacks[var1];
/*  51 */         this.SCP914ItemStacks[var1] = null;
/*  52 */         d();
/*  53 */         return ur1;
/*     */       } 
/*     */ 
/*     */       
/*  57 */       ur var3 = this.SCP914ItemStacks[var1].a(var2);
/*     */       
/*  59 */       if ((this.SCP914ItemStacks[var1]).a == 0)
/*     */       {
/*  61 */         this.SCP914ItemStacks[var1] = null;
/*     */       }
/*     */       
/*  64 */       d();
/*  65 */       return var3;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  70 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ur a_(int var1) {
/*  80 */     if (this.SCP914ItemStacks[var1] != null) {
/*     */       
/*  82 */       ur var2 = this.SCP914ItemStacks[var1];
/*  83 */       this.SCP914ItemStacks[var1] = null;
/*  84 */       return var2;
/*     */     } 
/*     */ 
/*     */     
/*  88 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int var1, ur var2) {
/*  97 */     this.SCP914ItemStacks[var1] = var2;
/*     */     
/*  99 */     if (var2 != null && var2.a > c())
/*     */     {
/* 101 */       var2.a = c();
/*     */     }
/*     */     
/* 104 */     d();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String b() {
/* 112 */     return "container.SCP914";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/* 120 */     super.a(par1NBTTagCompound);
/* 121 */     by nbttaglist = par1NBTTagCompound.m("Items");
/* 122 */     this.SCP914ItemStacks = new ur[k_()];
/*     */     
/* 124 */     for (int i = 0; i < nbttaglist.c(); i++) {
/*     */       
/* 126 */       bq nbttagcompound = (bq)nbttaglist.b(i);
/* 127 */       byte byte0 = nbttagcompound.c("Slot");
/*     */       
/* 129 */       if (byte0 >= 0 && byte0 < this.SCP914ItemStacks.length)
/*     */       {
/* 131 */         this.SCP914ItemStacks[byte0] = ur.a(nbttagcompound);
/*     */       }
/*     */     } 
/*     */     
/* 135 */     this.SCP914CookTime = par1NBTTagCompound.d("CookTime");
/* 136 */     this.currentItemBurnTime = getItemBurnTime(this.SCP914ItemStacks[6]);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/* 144 */     super.b(par1NBTTagCompound);
/* 145 */     par1NBTTagCompound.a("BurnTime", (short)this.SCP914BurnTime);
/* 146 */     par1NBTTagCompound.a("CookTime", (short)this.SCP914CookTime);
/* 147 */     by nbttaglist = new by();
/*     */     
/* 149 */     for (int i = 0; i < this.SCP914ItemStacks.length; i++) {
/*     */       
/* 151 */       if (this.SCP914ItemStacks[i] != null) {
/*     */         
/* 153 */         bq nbttagcompound = new bq();
/* 154 */         nbttagcompound.a("Slot", (byte)i);
/* 155 */         this.SCP914ItemStacks[i].b(nbttagcompound);
/* 156 */         nbttaglist.a((cd)nbttagcompound);
/*     */       } 
/*     */     } 
/*     */     
/* 160 */     par1NBTTagCompound.a("Items", (cd)nbttaglist);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c() {
/* 169 */     return 32;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getCookProgressScaled(int par1) {
/* 178 */     return this.SCP914CookTime * par1 / 250;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getBurnTimeRemainingScaled(int par1) {
/* 187 */     if (this.currentItemBurnTime == 0)
/*     */     {
/* 189 */       this.currentItemBurnTime = 250;
/*     */     }
/*     */     
/* 192 */     return this.SCP914BurnTime * par1 / this.currentItemBurnTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isBurning() {
/* 200 */     return (this.SCP914BurnTime > 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void g() {
/* 209 */     boolean var1 = (this.SCP914BurnTime > 0);
/* 210 */     boolean var2 = false;
/*     */     
/* 212 */     if (this.SCP914BurnTime > 0)
/*     */     {
/* 214 */       this.SCP914BurnTime--;
/*     */     }
/*     */     
/* 217 */     if (!this.k.I) {
/*     */       
/* 219 */       if (this.SCP914BurnTime == 0 && (canSmeltRough() || canSmeltCoarse() || canSmelt1_1() || canSmeltFine() || canSmeltVeryFine())) {
/*     */         
/* 221 */         this.currentItemBurnTime = this.SCP914BurnTime = getItemBurnTime(this.SCP914ItemStacks[6]);
/*     */         
/* 223 */         if (this.SCP914BurnTime > 0) {
/*     */           
/* 225 */           var2 = true;
/*     */           
/* 227 */           if (this.SCP914ItemStacks[6] != null) {
/*     */             
/* 229 */             (this.SCP914ItemStacks[6]).a--;
/*     */             
/* 231 */             if ((this.SCP914ItemStacks[6]).a == 0) {
/*     */               
/* 233 */               up var3 = this.SCP914ItemStacks[6].b().r();
/* 234 */               this.SCP914ItemStacks[6] = (var3 == null) ? null : new ur(var3);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 240 */       if (isBurning() && (canSmeltRough() || canSmeltCoarse() || canSmelt1_1() || canSmeltFine() || canSmeltVeryFine())) {
/*     */         
/* 242 */         if (this.SCP914CookTime == 0)
/* 243 */           this.k.a((this.l + 0.5F), (this.m + 0.5F), (this.n + 0.5F), "sounds.914use", 0.5F, 1.0F); 
/* 244 */         this.SCP914CookTime++;
/* 245 */         if (this.SCP914CookTime == 250)
/*     */         {
/* 247 */           this.SCP914CookTime = 0;
/* 248 */           smeltItem();
/* 249 */           var2 = true;
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 254 */         this.SCP914CookTime = 0;
/*     */       } 
/*     */     } 
/*     */     
/* 258 */     if (var2)
/*     */     {
/* 260 */       d();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean canSmeltRough() {
/* 269 */     if (this.SCP914ItemStacks[0] == null)
/*     */     {
/* 271 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 275 */     ur var1 = SCP914RoughRecipes.smelting().getSmeltingResult((this.SCP914ItemStacks[0].b()).cj);
/* 276 */     return (var1 == null) ? false : ((this.SCP914ItemStacks[5] == null) ? true : (!this.SCP914ItemStacks[5].a(var1) ? false : (((this.SCP914ItemStacks[5]).a < c() && (this.SCP914ItemStacks[5]).a < this.SCP914ItemStacks[5].d()) ? true : (((this.SCP914ItemStacks[5]).a < var1.d())))));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean canSmeltCoarse() {
/* 282 */     if (this.SCP914ItemStacks[1] == null)
/*     */     {
/* 284 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 288 */     ur var1 = SCP914CoarseRecipes.smelting().getSmeltingResult((this.SCP914ItemStacks[1].b()).cj);
/* 289 */     return (var1 == null) ? false : ((this.SCP914ItemStacks[5] == null) ? true : (!this.SCP914ItemStacks[5].a(var1) ? false : (((this.SCP914ItemStacks[5]).a < c() && (this.SCP914ItemStacks[5]).a < this.SCP914ItemStacks[5].d()) ? true : (((this.SCP914ItemStacks[5]).a < var1.d())))));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean canSmelt1_1() {
/* 295 */     if (this.SCP914ItemStacks[2] == null)
/*     */     {
/* 297 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 301 */     ur var1 = SCP9141_1Recipes.smelting().getSmeltingResult((this.SCP914ItemStacks[2].b()).cj);
/* 302 */     return (var1 == null) ? false : ((this.SCP914ItemStacks[5] == null) ? true : (!this.SCP914ItemStacks[5].a(var1) ? false : (((this.SCP914ItemStacks[5]).a < c() && (this.SCP914ItemStacks[5]).a < this.SCP914ItemStacks[5].d()) ? true : (((this.SCP914ItemStacks[5]).a < var1.d())))));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean canSmeltFine() {
/* 308 */     if (this.SCP914ItemStacks[3] == null)
/*     */     {
/* 310 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 314 */     ur var1 = SCP914FineRecipes.smelting().getSmeltingResult((this.SCP914ItemStacks[3].b()).cj);
/* 315 */     return (var1 == null) ? false : ((this.SCP914ItemStacks[5] == null) ? true : (!this.SCP914ItemStacks[5].a(var1) ? false : (((this.SCP914ItemStacks[5]).a < c() && (this.SCP914ItemStacks[5]).a < this.SCP914ItemStacks[5].d()) ? true : (((this.SCP914ItemStacks[5]).a < var1.d())))));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean canSmeltVeryFine() {
/* 321 */     if (this.SCP914ItemStacks[4] == null)
/*     */     {
/* 323 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 327 */     ur var1 = SCP914VeryFineRecipes.smelting().getSmeltingResult((this.SCP914ItemStacks[4].b()).cj);
/* 328 */     return (var1 == null) ? false : ((this.SCP914ItemStacks[5] == null) ? true : (!this.SCP914ItemStacks[5].a(var1) ? false : (((this.SCP914ItemStacks[5]).a < c() && (this.SCP914ItemStacks[5]).a < this.SCP914ItemStacks[5].d()) ? true : (((this.SCP914ItemStacks[5]).a < var1.d())))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 335 */   public Random rand = new Random();
/*     */   
/*     */   public void smeltItem() {
/* 338 */     if (canSmeltRough()) {
/*     */       
/* 340 */       ur var1 = SCP914RoughRecipes.smelting().getSmeltingResult((this.SCP914ItemStacks[0].b()).cj);
/*     */       
/* 342 */       if (this.SCP914ItemStacks[5] == null) {
/*     */         
/* 344 */         this.SCP914ItemStacks[5] = var1.l();
/* 345 */         (this.SCP914ItemStacks[0]).a *= var1.a;
/*     */       }
/* 347 */       else if ((this.SCP914ItemStacks[5]).c == var1.c) {
/*     */         
/* 349 */         (this.SCP914ItemStacks[5]).a += (this.SCP914ItemStacks[0]).a * var1.a;
/*     */       } 
/* 351 */       (this.SCP914ItemStacks[0]).a = 0;
/*     */       
/* 353 */       if ((this.SCP914ItemStacks[0]).a <= 0)
/*     */       {
/* 355 */         this.SCP914ItemStacks[0] = null;
/*     */       }
/*     */     } 
/* 358 */     if (canSmeltCoarse()) {
/*     */       
/* 360 */       ur var1 = SCP914CoarseRecipes.smelting().getSmeltingResult((this.SCP914ItemStacks[1].b()).cj);
/*     */       
/* 362 */       if (this.SCP914ItemStacks[5] == null) {
/*     */         
/* 364 */         this.SCP914ItemStacks[5] = var1.l();
/* 365 */         (this.SCP914ItemStacks[1]).a *= var1.a;
/*     */       }
/* 367 */       else if ((this.SCP914ItemStacks[5]).c == var1.c) {
/*     */         
/* 369 */         (this.SCP914ItemStacks[5]).a += (this.SCP914ItemStacks[1]).a * var1.a;
/*     */       } 
/*     */       
/* 372 */       (this.SCP914ItemStacks[1]).a = 0;
/*     */       
/* 374 */       if ((this.SCP914ItemStacks[1]).a <= 0)
/*     */       {
/* 376 */         this.SCP914ItemStacks[1] = null;
/*     */       }
/*     */     } 
/* 379 */     if (canSmelt1_1()) {
/*     */       
/* 381 */       ur var1 = SCP9141_1Recipes.smelting().getSmeltingResult((this.SCP914ItemStacks[2].b()).cj);
/* 382 */       if (this.SCP914ItemStacks[2].b() == up.bs) var1 = new ur((up)up.bs, 1, this.rand.nextInt(16472)); 
/* 383 */       if (this.SCP914ItemStacks[2].b() == up.aW) var1 = new ur(up.aW, 1, this.rand.nextInt(16)); 
/* 384 */       int maxMobs = 50 + this.rand.nextInt(49);
/* 385 */       if (this.SCP914ItemStacks[2].b() == up.bC)
/* 386 */         if (lv.a.containsKey(Integer.valueOf(maxMobs))) { var1 = new ur(up.bC, 1, maxMobs); }
/* 387 */         else { var1 = new ur(up.bC, 1, 120); }
/* 388 */           if (this.SCP914ItemStacks[5] == null) {
/*     */         
/* 390 */         this.SCP914ItemStacks[5] = var1.l();
/* 391 */         (this.SCP914ItemStacks[2]).a *= var1.a;
/*     */       }
/* 393 */       else if ((this.SCP914ItemStacks[5]).c == var1.c) {
/*     */         
/* 395 */         (this.SCP914ItemStacks[5]).a += (this.SCP914ItemStacks[2]).a * var1.a;
/*     */       } 
/*     */       
/* 398 */       (this.SCP914ItemStacks[2]).a = 0;
/*     */       
/* 400 */       if ((this.SCP914ItemStacks[2]).a <= 0)
/*     */       {
/* 402 */         this.SCP914ItemStacks[2] = null;
/*     */       }
/*     */     } 
/* 405 */     if (canSmeltFine()) {
/*     */       
/* 407 */       ur var1 = SCP914FineRecipes.smelting().getSmeltingResult((this.SCP914ItemStacks[3].b()).cj);
/* 408 */       if (this.SCP914ItemStacks[3].b() == up.aP) {
/*     */         
/* 410 */         int maxMobs1 = 50 + this.rand.nextInt(49);
/* 411 */         if (lv.a.containsKey(Integer.valueOf(maxMobs1))) { var1 = new ur(up.bC, 1, maxMobs1); }
/* 412 */         else { var1 = new ur(up.bC, 1, 120); }
/*     */       
/* 414 */       }  if (this.SCP914ItemStacks[5] == null) {
/*     */         
/* 416 */         this.SCP914ItemStacks[5] = var1.l();
/* 417 */         (this.SCP914ItemStacks[3]).a *= var1.a;
/*     */       }
/* 419 */       else if ((this.SCP914ItemStacks[5]).c == var1.c) {
/*     */         
/* 421 */         (this.SCP914ItemStacks[5]).a += (this.SCP914ItemStacks[3]).a * var1.a;
/*     */       } 
/*     */       
/* 424 */       (this.SCP914ItemStacks[3]).a = 0;
/*     */       
/* 426 */       if ((this.SCP914ItemStacks[3]).a <= 0)
/*     */       {
/* 428 */         this.SCP914ItemStacks[3] = null;
/*     */       }
/*     */     } 
/* 431 */     if (canSmeltVeryFine()) {
/*     */       
/* 433 */       ur var1 = SCP914VeryFineRecipes.smelting().getSmeltingResult((this.SCP914ItemStacks[4].b()).cj);
/*     */       
/* 435 */       if (this.SCP914ItemStacks[5] == null) {
/*     */         
/* 437 */         this.SCP914ItemStacks[5] = var1.l();
/* 438 */         (this.SCP914ItemStacks[4]).a *= var1.a;
/*     */       }
/* 440 */       else if ((this.SCP914ItemStacks[5]).c == var1.c) {
/*     */         
/* 442 */         (this.SCP914ItemStacks[5]).a += (this.SCP914ItemStacks[4]).a * var1.a;
/*     */       } 
/*     */       
/* 445 */       (this.SCP914ItemStacks[4]).a = 0;
/*     */       
/* 447 */       if ((this.SCP914ItemStacks[4]).a <= 0)
/*     */       {
/* 449 */         this.SCP914ItemStacks[4] = null;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getItemBurnTime(ur par1ItemStack) {
/* 460 */     if (par1ItemStack == null)
/*     */     {
/* 462 */       return 1;
/*     */     }
/*     */     
/* 465 */     int i = (par1ItemStack.b()).cj;
/*     */ 
/*     */     
/* 468 */     return ModLoader.addAllFuel(par1ItemStack.c, par1ItemStack.j());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isItemFuel(ur par0ItemStack) {
/* 474 */     return (getItemBurnTime(par0ItemStack) > 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a_(qx var1) {
/* 482 */     return (this.k.q(this.l, this.m, this.n) != this) ? false : ((var1.e(this.l + 0.5D, this.m + 0.5D, this.n + 0.5D) <= 64.0D));
/*     */   }
/*     */   
/*     */   public void l_() {}
/*     */   
/*     */   public void f() {}
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/tileentities/SCPTileEntity914.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */