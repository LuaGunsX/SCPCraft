/*     */ package SCPCraft.tileentities;
/*     */ 
/*     */ import SCPCraft.recipes.SCP294Recipes;
/*     */ import any;
/*     */ import bq;
/*     */ import by;
/*     */ import cd;
/*     */ import la;
/*     */ import qx;
/*     */ import ur;
/*     */ 
/*     */ public class SCPTileEntity294 extends any implements la {
/*  13 */   private ur[] SCP294ItemStacks = new ur[3];
/*  14 */   public int SCP294BurnTime = 0;
/*  15 */   public int currentItemBurnTime = 0;
/*  16 */   public int SCP294CookTime = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int k_() {
/*  22 */     return this.SCP294ItemStacks.length;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ur a(int var1) {
/*  30 */     return this.SCP294ItemStacks[var1];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ur a(int var1, int var2) {
/*  39 */     if (this.SCP294ItemStacks[var1] != null) {
/*     */ 
/*     */ 
/*     */       
/*  43 */       if ((this.SCP294ItemStacks[var1]).a <= var2) {
/*     */         
/*  45 */         ur ur1 = this.SCP294ItemStacks[var1];
/*  46 */         this.SCP294ItemStacks[var1] = null;
/*  47 */         d();
/*  48 */         return ur1;
/*     */       } 
/*     */ 
/*     */       
/*  52 */       ur var3 = this.SCP294ItemStacks[var1].a(var2);
/*     */       
/*  54 */       if ((this.SCP294ItemStacks[var1]).a == 0)
/*     */       {
/*  56 */         this.SCP294ItemStacks[var1] = null;
/*     */       }
/*     */       
/*  59 */       d();
/*  60 */       return var3;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  65 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ur a_(int var1) {
/*  75 */     if (this.SCP294ItemStacks[var1] != null) {
/*     */       
/*  77 */       ur var2 = this.SCP294ItemStacks[var1];
/*  78 */       this.SCP294ItemStacks[var1] = null;
/*  79 */       return var2;
/*     */     } 
/*     */ 
/*     */     
/*  83 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int var1, ur var2) {
/*  92 */     this.SCP294ItemStacks[var1] = var2;
/*     */     
/*  94 */     if (var2 != null && var2.a > c())
/*     */     {
/*  96 */       var2.a = c();
/*     */     }
/*     */     
/*  99 */     d();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String b() {
/* 107 */     return "container.SCP294";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/* 115 */     super.a(par1NBTTagCompound);
/* 116 */     by nbttaglist = par1NBTTagCompound.m("Items");
/* 117 */     this.SCP294ItemStacks = new ur[k_()];
/*     */     
/* 119 */     for (int i = 0; i < nbttaglist.c(); i++) {
/*     */       
/* 121 */       bq nbttagcompound = (bq)nbttaglist.b(i);
/* 122 */       byte byte0 = nbttagcompound.c("Slot");
/*     */       
/* 124 */       if (byte0 >= 0 && byte0 < this.SCP294ItemStacks.length)
/*     */       {
/* 126 */         this.SCP294ItemStacks[byte0] = ur.a(nbttagcompound);
/*     */       }
/*     */     } 
/*     */     
/* 130 */     this.SCP294BurnTime = par1NBTTagCompound.d("BurnTime");
/* 131 */     this.SCP294CookTime = par1NBTTagCompound.d("CookTime");
/* 132 */     this.currentItemBurnTime = getItemBurnTime(this.SCP294ItemStacks[1]);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/* 140 */     super.b(par1NBTTagCompound);
/* 141 */     par1NBTTagCompound.a("BurnTime", (short)this.SCP294BurnTime);
/* 142 */     par1NBTTagCompound.a("CookTime", (short)this.SCP294CookTime);
/* 143 */     by nbttaglist = new by();
/*     */     
/* 145 */     for (int i = 0; i < this.SCP294ItemStacks.length; i++) {
/*     */       
/* 147 */       if (this.SCP294ItemStacks[i] != null) {
/*     */         
/* 149 */         bq nbttagcompound = new bq();
/* 150 */         nbttagcompound.a("Slot", (byte)i);
/* 151 */         this.SCP294ItemStacks[i].b(nbttagcompound);
/* 152 */         nbttaglist.a((cd)nbttagcompound);
/*     */       } 
/*     */     } 
/*     */     
/* 156 */     par1NBTTagCompound.a("Items", (cd)nbttaglist);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c() {
/* 165 */     return 8;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getCookProgressScaled(int par1) {
/* 174 */     return this.SCP294CookTime * par1 / 200;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getBurnTimeRemainingScaled(int par1) {
/* 183 */     if (this.currentItemBurnTime == 0)
/*     */     {
/* 185 */       this.currentItemBurnTime = 200;
/*     */     }
/*     */     
/* 188 */     return this.SCP294BurnTime * par1 / this.currentItemBurnTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isBurning() {
/* 196 */     return (this.SCP294BurnTime > 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void g() {
/* 205 */     boolean flag = (this.SCP294BurnTime > 0);
/* 206 */     boolean flag1 = false;
/*     */     
/* 208 */     if (this.SCP294BurnTime > 0)
/*     */     {
/* 210 */       this.SCP294BurnTime--;
/*     */     }
/*     */     
/* 213 */     if (!this.k.I) {
/*     */       
/* 215 */       if (this.SCP294BurnTime == 0 && canSmelt()) {
/*     */         
/* 217 */         this.currentItemBurnTime = this.SCP294BurnTime = getItemBurnTime(this.SCP294ItemStacks[1]);
/*     */         
/* 219 */         if (this.SCP294BurnTime > 0) {
/*     */           
/* 221 */           flag1 = true;
/*     */           
/* 223 */           if (this.SCP294ItemStacks[1] != null) {
/*     */             
/* 225 */             if (this.SCP294ItemStacks[1].b().s()) {
/*     */               
/* 227 */               this.SCP294ItemStacks[1] = new ur(this.SCP294ItemStacks[1].b().o());
/*     */             }
/*     */             else {
/*     */               
/* 231 */               (this.SCP294ItemStacks[1]).a--;
/*     */             } 
/*     */             
/* 234 */             if ((this.SCP294ItemStacks[1]).a == 0)
/*     */             {
/* 236 */               this.SCP294ItemStacks[1] = null;
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 242 */       if (isBurning() && canSmelt()) {
/*     */         
/* 244 */         if (this.SCP294CookTime == 0) {
/* 245 */           this.k.a((this.l + 0.5F), (this.m + 0.5F), (this.n + 0.5F), "sounds.294use", 0.5F, 1.0F);
/*     */         }
/* 247 */         this.SCP294CookTime++;
/*     */         
/* 249 */         if (this.SCP294CookTime == 200)
/*     */         {
/* 251 */           this.SCP294CookTime = 0;
/* 252 */           smeltItem();
/* 253 */           flag1 = true;
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 258 */         this.SCP294CookTime = 0;
/*     */       } 
/*     */       
/* 261 */       if (flag != ((this.SCP294BurnTime > 0)))
/*     */       {
/* 263 */         flag1 = true;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 268 */     if (flag1)
/*     */     {
/* 270 */       d();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean canSmelt() {
/* 279 */     if (this.SCP294ItemStacks[0] == null)
/*     */     {
/* 281 */       return false;
/*     */     }
/*     */     
/* 284 */     ur itemstack = SCP294Recipes.smelting().getSmeltingResult((this.SCP294ItemStacks[0].b()).cj);
/*     */     
/* 286 */     if (itemstack == null)
/*     */     {
/* 288 */       return false;
/*     */     }
/*     */     
/* 291 */     if (this.SCP294ItemStacks[2] == null)
/*     */     {
/* 293 */       return true;
/*     */     }
/*     */     
/* 296 */     if (!this.SCP294ItemStacks[2].a(itemstack))
/*     */     {
/* 298 */       return false;
/*     */     }
/*     */     
/* 301 */     if ((this.SCP294ItemStacks[2]).a < c() && (this.SCP294ItemStacks[2]).a < this.SCP294ItemStacks[2].d())
/*     */     {
/* 303 */       return true;
/*     */     }
/*     */     
/* 306 */     return ((this.SCP294ItemStacks[2]).a < itemstack.d());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void smeltItem() {
/* 314 */     if (!canSmelt()) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 319 */     ur itemstack = SCP294Recipes.smelting().getSmeltingResult((this.SCP294ItemStacks[0].b()).cj);
/*     */     
/* 321 */     if (this.SCP294ItemStacks[2] == null) {
/*     */       
/* 323 */       this.SCP294ItemStacks[2] = itemstack.l();
/*     */     }
/* 325 */     else if ((this.SCP294ItemStacks[2]).c == itemstack.c) {
/*     */       
/* 327 */       (this.SCP294ItemStacks[2]).a += itemstack.a;
/*     */     } 
/*     */     
/* 330 */     if (this.SCP294ItemStacks[0].b().s()) {
/*     */       
/* 332 */       this.SCP294ItemStacks[0] = new ur(this.SCP294ItemStacks[0].b().o());
/*     */     }
/*     */     else {
/*     */       
/* 336 */       (this.SCP294ItemStacks[0]).a--;
/*     */     } 
/*     */     
/* 339 */     if ((this.SCP294ItemStacks[0]).a <= 0)
/*     */     {
/* 341 */       this.SCP294ItemStacks[0] = null;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getItemBurnTime(ur par1ItemStack) {
/* 351 */     if (par1ItemStack == null)
/*     */     {
/* 353 */       return 1;
/*     */     }
/* 355 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean func_52005_b(ur par0ItemStack) {
/* 360 */     return (getItemBurnTime(par0ItemStack) > 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a_(qx var1) {
/* 368 */     return (this.k.q(this.l, this.m, this.n) != this) ? false : ((var1.e(this.l + 0.5D, this.m + 0.5D, this.n + 0.5D) <= 64.0D));
/*     */   }
/*     */   
/*     */   public void l_() {}
/*     */   
/*     */   public void f() {}
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/tileentities/SCPTileEntity294.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */