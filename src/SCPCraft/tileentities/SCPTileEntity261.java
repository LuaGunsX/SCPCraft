/*     */ package SCPCraft.tileentities;
/*     */ 
/*     */ import ModLoader;
/*     */ import SCPCraft.mod_SCP;
/*     */ import SCPCraft.recipes.SCP261Recipes;
/*     */ import amq;
/*     */ import any;
/*     */ import bq;
/*     */ import by;
/*     */ import cd;
/*     */ import java.util.Random;
/*     */ import la;
/*     */ import qx;
/*     */ import up;
/*     */ import ur;
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
/*     */ public class SCPTileEntity261
/*     */   extends any
/*     */   implements la
/*     */ {
/*  34 */   private ur[] SCP261ItemStacks = new ur[3];
/*  35 */   public int SCP261BurnTime = 0;
/*  36 */   public int currentItemBurnTime = 0;
/*  37 */   public int SCP261CookTime = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int k_() {
/*  45 */     return this.SCP261ItemStacks.length;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ur a(int par1) {
/*  53 */     return this.SCP261ItemStacks[par1];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ur a(int par1, int par2) {
/*  62 */     if (this.SCP261ItemStacks[par1] != null) {
/*     */       
/*  64 */       if ((this.SCP261ItemStacks[par1]).a <= par2) {
/*     */         
/*  66 */         ur itemstack = this.SCP261ItemStacks[par1];
/*  67 */         this.SCP261ItemStacks[par1] = null;
/*  68 */         return itemstack;
/*     */       } 
/*     */       
/*  71 */       ur itemstack1 = this.SCP261ItemStacks[par1].a(par2);
/*     */       
/*  73 */       if ((this.SCP261ItemStacks[par1]).a == 0)
/*     */       {
/*  75 */         this.SCP261ItemStacks[par1] = null;
/*     */       }
/*     */       
/*  78 */       return itemstack1;
/*     */     } 
/*     */ 
/*     */     
/*  82 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ur a_(int par1) {
/*  92 */     if (this.SCP261ItemStacks[par1] != null) {
/*     */       
/*  94 */       ur itemstack = this.SCP261ItemStacks[par1];
/*  95 */       this.SCP261ItemStacks[par1] = null;
/*  96 */       return itemstack;
/*     */     } 
/*     */ 
/*     */     
/* 100 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int par1, ur par2ItemStack) {
/* 109 */     this.SCP261ItemStacks[par1] = par2ItemStack;
/*     */     
/* 111 */     if (par2ItemStack != null && par2ItemStack.a > c())
/*     */     {
/* 113 */       par2ItemStack.a = c();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String b() {
/* 122 */     return "container.SCP261";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/* 130 */     super.a(par1NBTTagCompound);
/* 131 */     by nbttaglist = par1NBTTagCompound.m("Items");
/* 132 */     this.SCP261ItemStacks = new ur[k_()];
/*     */     
/* 134 */     for (int i = 0; i < nbttaglist.c(); i++) {
/*     */       
/* 136 */       bq nbttagcompound = (bq)nbttaglist.b(i);
/* 137 */       byte byte0 = nbttagcompound.c("Slot");
/*     */       
/* 139 */       if (byte0 >= 0 && byte0 < this.SCP261ItemStacks.length)
/*     */       {
/* 141 */         this.SCP261ItemStacks[byte0] = ur.a(nbttagcompound);
/*     */       }
/*     */     } 
/*     */     
/* 145 */     this.SCP261BurnTime = par1NBTTagCompound.d("BurnTime");
/* 146 */     this.SCP261CookTime = par1NBTTagCompound.d("CookTime");
/* 147 */     this.currentItemBurnTime = getItemBurnTime(this.SCP261ItemStacks[1]);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/* 155 */     super.b(par1NBTTagCompound);
/* 156 */     par1NBTTagCompound.a("BurnTime", (short)this.SCP261BurnTime);
/* 157 */     par1NBTTagCompound.a("CookTime", (short)this.SCP261CookTime);
/* 158 */     by nbttaglist = new by();
/*     */     
/* 160 */     for (int i = 0; i < this.SCP261ItemStacks.length; i++) {
/*     */       
/* 162 */       if (this.SCP261ItemStacks[i] != null) {
/*     */         
/* 164 */         bq nbttagcompound = new bq();
/* 165 */         nbttagcompound.a("Slot", (byte)i);
/* 166 */         this.SCP261ItemStacks[i].b(nbttagcompound);
/* 167 */         nbttaglist.a((cd)nbttagcompound);
/*     */       } 
/*     */     } 
/*     */     
/* 171 */     par1NBTTagCompound.a("Items", (cd)nbttaglist);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c() {
/* 180 */     return 16;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getCookProgressScaled(int par1) {
/* 189 */     return this.SCP261CookTime * par1 / 50;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getBurnTimeRemainingScaled(int par1) {
/* 198 */     if (this.currentItemBurnTime == 0)
/*     */     {
/* 200 */       this.currentItemBurnTime = 50;
/*     */     }
/*     */     
/* 203 */     return this.SCP261BurnTime * par1 / this.currentItemBurnTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isBurning() {
/* 211 */     return (this.SCP261BurnTime > 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void g() {
/* 220 */     boolean flag = (this.SCP261BurnTime > 0);
/* 221 */     boolean flag1 = false;
/*     */     
/* 223 */     if (this.SCP261BurnTime > 0)
/*     */     {
/* 225 */       this.SCP261BurnTime--;
/*     */     }
/*     */     
/* 228 */     if (!this.k.I) {
/*     */       
/* 230 */       if (this.SCP261BurnTime == 0 && canSmelt()) {
/*     */         
/* 232 */         this.currentItemBurnTime = this.SCP261BurnTime = getItemBurnTime(this.SCP261ItemStacks[1]);
/*     */         
/* 234 */         if (this.SCP261BurnTime > 0) {
/*     */           
/* 236 */           flag1 = true;
/*     */           
/* 238 */           if (this.SCP261ItemStacks[1] != null) {
/*     */             
/* 240 */             if (this.SCP261ItemStacks[1].b().s()) {
/*     */               
/* 242 */               this.SCP261ItemStacks[1] = new ur(this.SCP261ItemStacks[1].b().o());
/*     */             }
/*     */             else {
/*     */               
/* 246 */               (this.SCP261ItemStacks[1]).a--;
/*     */             } 
/*     */             
/* 249 */             if ((this.SCP261ItemStacks[1]).a == 0)
/*     */             {
/* 251 */               this.SCP261ItemStacks[1] = null;
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 257 */       if (isBurning() && canSmelt()) {
/*     */         
/* 259 */         this.SCP261CookTime++;
/*     */         
/* 261 */         if (this.SCP261CookTime == 50)
/*     */         {
/* 263 */           this.k.a((this.l + 0.5F), (this.m + 0.5F), (this.n + 0.5F), "sounds.drop", 0.5F, 1.0F);
/* 264 */           this.SCP261CookTime = 0;
/* 265 */           smeltItem();
/* 266 */           flag1 = true;
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 271 */         this.SCP261CookTime = 0;
/*     */       } 
/*     */       
/* 274 */       if (flag != ((this.SCP261BurnTime > 0)))
/*     */       {
/* 276 */         flag1 = true;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 281 */     if (flag1)
/*     */     {
/* 283 */       d();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean canSmelt() {
/* 292 */     if (this.SCP261ItemStacks[0] == null)
/*     */     {
/* 294 */       return false;
/*     */     }
/*     */     
/* 297 */     ur itemstack = SCP261Recipes.smelting().getSmeltingResult((this.SCP261ItemStacks[0].b()).cj);
/*     */     
/* 299 */     if (itemstack == null)
/*     */     {
/* 301 */       return false;
/*     */     }
/*     */     
/* 304 */     if (this.SCP261ItemStacks[2] == null)
/*     */     {
/* 306 */       return true;
/*     */     }
/*     */     
/* 309 */     if (!this.SCP261ItemStacks[2].a(itemstack))
/*     */     {
/* 311 */       return false;
/*     */     }
/*     */     
/* 314 */     if ((this.SCP261ItemStacks[2]).a < c() && (this.SCP261ItemStacks[2]).a < this.SCP261ItemStacks[2].d())
/*     */     {
/* 316 */       return true;
/*     */     }
/*     */     
/* 319 */     return ((this.SCP261ItemStacks[2]).a < itemstack.d());
/*     */   }
/* 321 */   public Random rand = new Random();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void smeltItem() {
/* 328 */     if (!canSmelt()) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 333 */     ur itemstack = SCP261Recipes.smelting().getSmeltingResult((this.SCP261ItemStacks[0].b()).cj);
/*     */     
/* 335 */     amq[] ablock = { amq.ao, amq.H, amq.aX, amq.bD, amq.bg, amq.P, amq.I, amq.K, amq.Z, amq.ae, amq.z, (amq)amq.ai, (amq)amq.aj, (amq)amq.bB, amq.bY, (amq)amq.ah, amq.X, (amq)amq.N, amq.O, amq.S, amq.ak, amq.R, amq.aZ, amq.aA, mod_SCP.BloodBlock, amq.al, amq.aq, amq.bI, amq.y, amq.L, amq.J, amq.Q, amq.A, amq.W, amq.aU, amq.aY, amq.bJ, amq.ax, amq.T, amq.B, amq.ac, amq.Y, amq.w, amq.M, (amq)amq.ab, (amq)amq.x, (amq)amq.ag, (amq)amq.an, (amq)amq.bR, amq.aB, amq.bx, amq.bC, amq.bM, amq.bn, amq.aS, amq.at, amq.bt, amq.aD, amq.ap, amq.aE, amq.bZ, amq.bp, amq.cb, amq.ca, amq.bA, amq.bT, amq.bF, amq.bz, amq.aw, amq.aK, amq.aV, amq.bo, amq.bf, amq.bO, amq.aJ, amq.bi, amq.bd, amq.aN, amq.aP, amq.aQ, amq.az, amq.as, amq.be, amq.bE, amq.br, amq.bq, amq.av, amq.bu, amq.aM, amq.aI, amq.bb, amq.aW, amq.ck, amq.cd, amq.ce, amq.ci, amq.bs, amq.by, amq.bc, amq.bL, amq.ar, amq.bV, amq.bN, amq.bH, (amq)amq.aa, mod_SCP.CorrodedIron, mod_SCP.DocumentTable, mod_SCP.ElectricWool, mod_SCP.Granite, mod_SCP.GrateBlock, mod_SCP.KeycardSlot, mod_SCP.Locker, mod_SCP.Machinery, mod_SCP.RemoteDoorComputer, mod_SCP.SCP143Leaves, mod_SCP.SCP143Log, mod_SCP.SCP143Planks, mod_SCP.SCP143Sapling, mod_SCP.Shelf, mod_SCP.SmokeBlock, mod_SCP.Alarm, mod_SCP.Toilet, mod_SCP.SCP151, mod_SCP.Flesh, mod_SCP.Bone, mod_SCP.Marble, mod_SCP.stoneChair, mod_SCP.stoneDesk, mod_SCP.woodDesk, mod_SCP.woodenChair, mod_SCP.graniteDesk, mod_SCP.marbleChair, mod_SCP.marbleDesk, mod_SCP.SCP513 };
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
/* 357 */     up[] pearls = { mod_SCP.Pearl111, mod_SCP.Pearl173, mod_SCP.Pearl1000, mod_SCP.Pearl087, mod_SCP.Pearl049, mod_SCP.Pearl914, mod_SCP.Pearl096, mod_SCP.Pearl629, mod_SCP.Pearl354, mod_SCP.Pearl513, mod_SCP.Pearl294, mod_SCP.Pearl019, mod_SCP.Pearl131, mod_SCP.Pearl457, mod_SCP.SCP458, mod_SCP.Pearl999, mod_SCP.Pearl058, mod_SCP.Pearl080, mod_SCP.Pearl106, mod_SCP.Pearl143, mod_SCP.Pearl280, mod_SCP.Pearl310, mod_SCP.Pearl409, mod_SCP.Pearl538, mod_SCP.Pearl594, mod_SCP.Pearl006, mod_SCP.Pearl966, mod_SCP.Pearl872, mod_SCP.Pearl789J, mod_SCP.Pearl015, mod_SCP.Pearl053, mod_SCP.Pearl073, mod_SCP.Pearl076, mod_SCP.Pearl027, mod_SCP.Pearl079, mod_SCP.Pearl997, mod_SCP.Pearl023, mod_SCP.Pearl822, mod_SCP.Pearl273, mod_SCP.Pearl472, mod_SCP.Pearl151, mod_SCP.Pearl372, mod_SCP.Pearl002, mod_SCP.Pearl006 };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 367 */     up[] items = { up.at, up.j, up.l, up.C, up.J, up.h, up.y, up.u, up.ba, up.bj, up.bi, up.bw, up.bo, up.aE, up.aX, up.aL, up.ac, up.ak, up.Y, up.ag, up.ao, up.k, up.E, up.F, up.U, up.by, up.aH, up.aw, up.ax, up.ay, up.aG, up.m, up.aI, up.aZ, up.aQ, up.f, up.g, up.bz, up.bl, up.i, up.n, up.o, up.p, up.bk, up.bc, up.aB, up.av, up.q, up.r, up.s, up.aW, up.aP, up.bH, up.bn, up.bD, up.t, up.bA, up.L, up.u, up.v, up.w, up.x, up.bv, up.bE, up.z, up.A, up.aV, up.aR, up.aU, up.ap, up.B, up.D, up.G, up.bp, up.bt, up.bq, up.M, up.H, up.I, up.K, up.N, up.O, up.R, up.P, up.Q, up.Z, up.ah, up.al, up.V, up.ad, up.S, up.T, up.aF, up.ab, up.aj, up.X, up.af, up.an, up.aT, up.bx, up.bf, up.bh, up.aN, up.az, up.aO, up.W, up.bC, (up)up.bd, up.aa, up.ae, up.am, up.ai, up.aq, up.br, up.as, up.ar, up.au, up.aA, up.aC, up.aD, up.aJ, up.aS, up.bg, (up)up.bs, up.aM, up.aY, (up)up.be, up.bm, up.bu, up.ch, up.bX, up.bZ, up.bB, up.bF, up.bG, up.ca, up.bY, up.cb, up.cc, up.cd, up.ce, up.cf, up.cg, up.bb, up.aK, (up)up.bO, up.bI, up.bJ, up.bK, up.bL, up.bM, up.bN, up.bP, up.bQ, up.bS, up.bR, up.bT, mod_SCP.Circuit, mod_SCP.ClassDPants, mod_SCP.ClassDShirt, mod_SCP.ClassDShoes, mod_SCP.CorrodedDoorItem, mod_SCP.GasMask, mod_SCP.InfraRedGlasses, mod_SCP.ItemSCPPoster, mod_SCP.L1Keycard, mod_SCP.SCP912Head, mod_SCP.SCP912Pants, mod_SCP.SCP912Shirt, mod_SCP.SCP912Shoes, mod_SCP.SlideDoorItem, mod_SCP.Wrench, mod_SCP.SCP000J, mod_SCP.SCP143Bucket, mod_SCP.Bucket006, mod_SCP.Bucket354, mod_SCP.BucketWater, (up)up.bW, up.bV, up.bU };
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
/* 393 */     int q = this.rand.nextInt(3);
/* 394 */     int maxPearls = this.rand.nextInt(pearls.length);
/* 395 */     int maxBlocks = this.rand.nextInt(ablock.length);
/* 396 */     int maxItems = this.rand.nextInt(items.length);
/* 397 */     if (q == 0) itemstack = new ur(pearls[maxPearls], 1, this.rand.nextInt(pearls[maxPearls].m() + 1)); 
/* 398 */     if (q == 1) itemstack = new ur(ablock[maxBlocks], 1, this.rand.nextInt(17)); 
/* 399 */     if (q == 2)
/*     */     {
/* 401 */       if (items[maxItems] == up.bW) { itemstack = up.bW.a(this.rand); }
/* 402 */       else { itemstack = new ur(items[maxItems], 1, this.rand.nextInt(items[maxItems].m() + 1)); }
/*     */     
/*     */     }
/* 405 */     if (this.SCP261ItemStacks[2] == null) {
/*     */       
/* 407 */       this.SCP261ItemStacks[2] = itemstack.l();
/*     */     }
/* 409 */     else if ((this.SCP261ItemStacks[2]).c == itemstack.c) {
/*     */       
/* 411 */       (this.SCP261ItemStacks[2]).a += itemstack.a;
/*     */     } 
/*     */     
/* 414 */     if (this.SCP261ItemStacks[0].b().s()) {
/*     */       
/* 416 */       this.SCP261ItemStacks[0] = new ur(this.SCP261ItemStacks[0].b().o());
/*     */     }
/*     */     else {
/*     */       
/* 420 */       (this.SCP261ItemStacks[0]).a--;
/*     */     } 
/*     */     
/* 423 */     if ((this.SCP261ItemStacks[0]).a <= 0)
/*     */     {
/* 425 */       this.SCP261ItemStacks[0] = null;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getItemBurnTime(ur par1ItemStack) {
/* 435 */     if (par1ItemStack == null)
/*     */     {
/* 437 */       return 1;
/*     */     }
/*     */     
/* 440 */     int i = (par1ItemStack.b()).cj;
/*     */ 
/*     */     
/* 443 */     return ModLoader.addAllFuel(par1ItemStack.c, par1ItemStack.j());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean func_52005_b(ur par0ItemStack) {
/* 449 */     return (getItemBurnTime(par0ItemStack) > 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a_(qx par1EntityPlayer) {
/* 457 */     if (this.k.q(this.l, this.m, this.n) != this)
/*     */     {
/* 459 */       return false;
/*     */     }
/*     */     
/* 462 */     return (par1EntityPlayer.e(this.l + 0.5D, this.m + 0.5D, this.n + 0.5D) <= 64.0D);
/*     */   }
/*     */   
/*     */   public void l_() {}
/*     */   
/*     */   public void f() {}
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/tileentities/SCPTileEntity261.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */