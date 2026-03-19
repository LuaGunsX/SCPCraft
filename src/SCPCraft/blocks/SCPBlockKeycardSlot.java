/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import SCPCraft.mod_Others;
/*     */ import SCPCraft.mod_SCP;
/*     */ import agi;
/*     */ import amq;
/*     */ import aoe;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import ke;
/*     */ import lq;
/*     */ import md;
/*     */ import qx;
/*     */ import ur;
/*     */ import yc;
/*     */ import ym;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPBlockKeycardSlot
/*     */   extends amq
/*     */ {
/*     */   public SCPBlockKeycardSlot(int i, int j) {
/*  24 */     super(i, j, agi.q);
/*  25 */     b(true);
/*  26 */     a(mod_SCP.tabBlockSCP);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTextureFile() {
/*  31 */     return "/SCPCraft/textures/SCPblox.png";
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/*  36 */     return mod_Others.KeycardSlotID;
/*     */   }
/*     */ 
/*     */   
/*     */   public int r_() {
/*  41 */     return 55;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, qx par5EntityPlayer) {
/*  46 */     a(par1World, par2, par3, par4, par5EntityPlayer, 0, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void updateBlockMetadata(yc par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8) {
/*  51 */     int var9 = par1World.h(par2, par3, par4);
/*  52 */     int var10 = var9 & 0x8;
/*  53 */     var9 &= 0x7;
/*  54 */     var9 = -1;
/*     */     
/*  56 */     if (par5 == 0 && par1World.t(par2, par3 + 1, par4))
/*     */     {
/*  58 */       var9 = par1World.t.nextBoolean() ? 0 : 7;
/*     */     }
/*     */     
/*  61 */     if (par5 == 1 && par1World.v(par2, par3 - 1, par4))
/*     */     {
/*  63 */       var9 = 5 + par1World.t.nextInt(2);
/*     */     }
/*     */     
/*  66 */     if (par5 == 2 && par1World.t(par2, par3, par4 + 1))
/*     */     {
/*  68 */       var9 = 4;
/*     */     }
/*     */     
/*  71 */     if (par5 == 3 && par1World.t(par2, par3, par4 - 1))
/*     */     {
/*  73 */       var9 = 3;
/*     */     }
/*     */     
/*  76 */     if (par5 == 4 && par1World.t(par2 + 1, par3, par4))
/*     */     {
/*  78 */       var9 = 2;
/*     */     }
/*     */     
/*  81 */     if (par5 == 5 && par1World.t(par2 - 1, par3, par4))
/*     */     {
/*  83 */       var9 = 1;
/*     */     }
/*     */     
/*  86 */     if (var9 == -1) {
/*     */       
/*  88 */       c(par1World, par2, par3, par4, par1World.h(par2, par3, par4), 0);
/*  89 */       par1World.e(par2, par3, par4, 0);
/*     */     }
/*     */     else {
/*     */       
/*  93 */       par1World.c(par2, par3, par4, var9 + var10);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, int par5) {
/*  99 */     if (redundantCanPlaceBlockAt(par1World, par2, par3, par4)) {
/*     */       
/* 101 */       int var6 = par1World.h(par2, par3, par4);
/* 102 */       boolean var7 = false;
/*     */       
/* 104 */       if (!par1World.t(par2, par3, par4 - 1) && var6 == 0)
/*     */       {
/* 106 */         var7 = true;
/*     */       }
/*     */       
/* 109 */       if (!par1World.t(par2 + 1, par3, par4) && var6 == 1)
/*     */       {
/* 111 */         var7 = true;
/*     */       }
/*     */       
/* 114 */       if (!par1World.t(par2, par3, par4 + 1) && var6 == 2)
/*     */       {
/* 116 */         var7 = true;
/*     */       }
/*     */       
/* 119 */       if (!par1World.t(par2 - 1, par3, par4) && var6 == 3)
/*     */       {
/* 121 */         var7 = true;
/*     */       }
/*     */       
/* 124 */       if (var7) {
/*     */         
/* 126 */         c(par1World, par2, par3, par4, par1World.h(par2, par3, par4), 0);
/* 127 */         par1World.e(par2, par3, par4, 0);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean redundantCanPlaceBlockAt(yc par1World, int par2, int par3, int par4) {
/* 134 */     if (!b(par1World, par2, par3, par4)) {
/*     */       
/* 136 */       c(par1World, par2, par3, par4, par1World.h(par2, par3, par4), 0);
/* 137 */       par1World.e(par2, par3, par4, 0);
/* 138 */       return false;
/*     */     } 
/*     */ 
/*     */     
/* 142 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(yc par1World, int par2, int par3, int par4) {
/* 151 */     return par1World.t(par2, par3, par4 - 1) ? true : (par1World.t(par2 + 1, par3, par4) ? true : (par1World.t(par2, par3, par4 + 1) ? true : par1World.t(par2 - 1, par3, par4)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yc world, int i, int j, int k, md entityliving) {
/* 156 */     int l = ke.c((entityliving.z * 4.0F / 360.0F) + 0.5D) & 0x3;
/*     */     
/* 158 */     if (l == 2)
/*     */     {
/* 160 */       world.c(i, j, k, 0);
/*     */     }
/*     */     
/* 163 */     if (l == 3)
/*     */     {
/* 165 */       world.c(i, j, k, 1);
/*     */     }
/*     */     
/* 168 */     if (l == 0)
/*     */     {
/* 170 */       world.c(i, j, k, 2);
/*     */     }
/*     */     
/* 173 */     if (l == 1)
/*     */     {
/* 175 */       world.c(i, j, k, 3);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(yc par1World, int par2, int par3, int par4, qx par5EntityPlayer, int par6, float par7, float par8, float par9) {
/* 181 */     ur itemstack = par5EntityPlayer.bJ.g();
/* 182 */     int i = par1World.h(par2, par3, par4);
/* 183 */     int j = i & 0x7;
/* 184 */     if (par1World.I)
/*     */     {
/* 186 */       return true;
/*     */     }
/*     */     
/* 189 */     if (itemstack != null && (itemstack.c == mod_SCP.L1Keycard.cj || itemstack.c == mod_SCP.L2Keycard.cj || itemstack.c == mod_SCP.L3Keycard.cj || itemstack.c == mod_SCP.OmniKeycard.cj)) {
/*     */       
/* 191 */       int k = 8 - (i & 0x8);
/* 192 */       par1World.c(par2, par3, par4, j + k);
/* 193 */       par1World.a(par2 + 0.5D, par3 + 0.5D, par4 + 0.5D, "random.click", 0.3F, 0.6F);
/* 194 */       func_82536_d(par1World, par2, par3, par4, j);
/* 195 */       par1World.a(par2, par3, par4, this.cm, r_());
/*     */ 
/*     */     
/*     */     }
/* 199 */     else if (itemstack != null && (itemstack.c == mod_SCP.Wrench.cj || itemstack.c == mod_SCP.GodlyWrench.cj)) {
/* 200 */       par1World.d(par2, par3, par4, mod_SCP.KeycardSlotLv2.cm, j);
/* 201 */       itemstack.a(1, (md)par5EntityPlayer);
/* 202 */       if (par1World.I)
/*     */       {
/* 204 */         par5EntityPlayer.b("Keycard Level: 2");
/*     */       }
/*     */       
/* 207 */       if (!par1World.I)
/*     */       {
/* 209 */         par5EntityPlayer.b("Keycard Level: 2");
/*     */       }
/*     */     }
/*     */     else {
/*     */       
/* 214 */       if (par1World.I)
/*     */       {
/* 216 */         par5EntityPlayer.b("You need a Level 1 or higher Keycard to activate.");
/*     */       }
/* 218 */       if (!par1World.I)
/*     */       {
/* 220 */         par5EntityPlayer.b("You need a Level 1 or higher Keycard to activate.");
/*     */       }
/*     */     } 
/*     */     
/* 224 */     par1World.a(par2, par3, par4, this.cm, r_());
/*     */     
/* 226 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c(ym par1IBlockAccess, int par2, int par3, int par4, int par5) {
/* 234 */     int var6 = par1IBlockAccess.h(par2, par3, par4);
/*     */     
/* 236 */     if ((var6 & 0x8) == 0)
/*     */     {
/* 238 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 242 */     int var7 = var6 & 0x7;
/* 243 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean i() {
/* 252 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 257 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 262 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public aoe getSelectedBoundingBoxFromPool_do(yc world, int i, int j, int k) {
/* 267 */     int l = world.h(i, j, k);
/* 268 */     int m = l & 0x7;
/* 269 */     if (m == 0 || m == 4)
/*     */     {
/* 271 */       a(0.33F, 0.2F, 0.0F, 0.66F, 0.8F, 0.25F);
/*     */     }
/* 273 */     if (m == 1 || m == 5)
/*     */     {
/* 275 */       a(0.75F, 0.2F, 0.3F, 1.0F, 0.8F, 0.6F);
/*     */     }
/* 277 */     if (m == 2 || m == 6)
/*     */     {
/* 279 */       a(0.33F, 0.2F, 0.75F, 0.66F, 0.8F, 1.0F);
/*     */     }
/* 281 */     if (m == 3 || m == 7)
/*     */     {
/* 283 */       a(0.0F, 0.2F, 0.33F, 0.25F, 0.8F, 0.66F);
/*     */     }
/* 285 */     return b_(world, i, j, k);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ym world, int i, int j, int k) {
/* 291 */     int l = world.h(i, j, k);
/* 292 */     int m = l & 0x7;
/* 293 */     if (m == 0 || m == 4)
/*     */     {
/* 295 */       a(0.33F, 0.2F, 0.0F, 0.66F, 0.8F, 0.25F);
/*     */     }
/* 297 */     if (m == 1 || m == 5)
/*     */     {
/* 299 */       a(0.75F, 0.2F, 0.33F, 1.0F, 0.8F, 0.66F);
/*     */     }
/* 301 */     if (m == 2 || m == 6)
/*     */     {
/* 303 */       a(0.33F, 0.2F, 0.75F, 0.66F, 0.8F, 1.0F);
/*     */     }
/* 305 */     if (m == 3 || m == 7)
/*     */     {
/* 307 */       a(0.0F, 0.2F, 0.33F, 0.25F, 0.8F, 0.66F);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(int par1, int par2) {
/* 314 */     int par3 = par2 & 0x7;
/* 315 */     if (par3 == 0 || par3 == 4)
/*     */     {
/*     */       
/* 318 */       if (par1 == 3) { this.cl = mod_SCP.SlotFront; }
/* 319 */       else if (par1 == 1) { this.cl = mod_SCP.SlotTop1; }
/* 320 */       else { this.cl = mod_SCP.SlotSides; }
/*     */        } 
/* 322 */     if (par3 == 1 || par3 == 5)
/*     */     {
/* 324 */       if (par1 == 4) { this.cl = mod_SCP.SlotFront; }
/* 325 */       else if (par1 == 1) { this.cl = mod_SCP.SlotTop3; }
/* 326 */       else { this.cl = mod_SCP.SlotSides; }
/*     */        } 
/* 328 */     if (par3 == 2 || par3 == 6)
/*     */     {
/* 330 */       if (par1 == 2) { this.cl = mod_SCP.SlotFront; }
/* 331 */       else if (par1 == 1) { this.cl = mod_SCP.SlotTop; }
/* 332 */       else { this.cl = mod_SCP.SlotSides; }
/*     */        } 
/* 334 */     if (par3 == 3 || par3 == 7)
/*     */     {
/* 336 */       if (par1 == 5) { this.cl = mod_SCP.SlotFront; }
/* 337 */       else if (par1 == 1) { this.cl = mod_SCP.SlotTop2; }
/* 338 */       else { this.cl = mod_SCP.SlotSides; }
/*     */     
/*     */     }
/* 341 */     return this.cl;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, aoe par5AxisAlignedBB, List arraylist, lq par7Entity) {
/* 346 */     int l = par1World.h(par2, par3, par4);
/* 347 */     int m = l & 0x7;
/* 348 */     if (m == 0 || m == 4) {
/*     */       
/* 350 */       a(0.33F, 0.2F, 0.0F, 0.66F, 0.8F, 0.18F);
/* 351 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, arraylist, par7Entity);
/*     */       
/* 353 */       a(0.33F, 0.2F, 0.18F, 0.66F, 0.4F, 0.25F);
/* 354 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, arraylist, par7Entity);
/*     */     } 
/* 356 */     if (m == 1 || m == 5) {
/*     */       
/* 358 */       a(0.82F, 0.2F, 0.33F, 1.0F, 0.8F, 0.66F);
/* 359 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, arraylist, par7Entity);
/*     */       
/* 361 */       a(0.75F, 0.2F, 0.33F, 0.82F, 0.4F, 0.66F);
/* 362 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, arraylist, par7Entity);
/*     */     } 
/* 364 */     if (m == 2 || m == 6) {
/*     */       
/* 366 */       a(0.33F, 0.2F, 0.82F, 0.66F, 0.8F, 1.0F);
/* 367 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, arraylist, par7Entity);
/*     */       
/* 369 */       a(0.33F, 0.2F, 0.75F, 0.66F, 0.4F, 0.82F);
/* 370 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, arraylist, par7Entity);
/*     */     } 
/* 372 */     if (m == 3 || m == 7) {
/*     */       
/* 374 */       a(0.0F, 0.2F, 0.33F, 0.18F, 0.8F, 0.66F);
/* 375 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, arraylist, par7Entity);
/*     */       
/* 377 */       a(0.18F, 0.2F, 0.33F, 0.25F, 0.4F, 0.66F);
/* 378 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, arraylist, par7Entity);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(Random random) {
/* 384 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(int i) {
/* 389 */     return i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, int par5, int par6) {
/* 398 */     if ((par6 & 0x8) > 0) {
/*     */       
/* 400 */       int var7 = par6 & 0x7;
/* 401 */       func_82536_d(par1World, par2, par3, par4, var7);
/*     */     } 
/*     */     
/* 404 */     super.a(par1World, par2, par3, par4, par5, par6);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(ym par1IBlockAccess, int par2, int par3, int par4, int par5) {
/* 412 */     return ((par1IBlockAccess.h(par2, par3, par4) & 0x8) > 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(yc par1World, int par2, int par3, int par4, Random par5Random) {
/* 420 */     if (!par1World.I) {
/*     */       
/* 422 */       int var6 = par1World.h(par2, par3, par4);
/* 423 */       par1World.c(par2, par3, par4, var6 & 0x7);
/* 424 */       int var7 = var6 & 0x7;
/* 425 */       func_82536_d(par1World, par2, par3, par4, var7);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_82536_d(yc par1World, int par2, int par3, int par4, int par5) {
/* 431 */     par1World.h(par2, par3, par4, this.cm);
/*     */     
/* 433 */     if (par5 == 0 || par5 == 4) {
/*     */       
/* 435 */       par1World.h(par2, par3, par4 - 1, this.cm);
/*     */     }
/* 437 */     else if (par5 == 1 || par5 == 5) {
/*     */       
/* 439 */       par1World.h(par2 + 1, par3, par4, this.cm);
/*     */     }
/* 441 */     else if (par5 == 2 || par5 == 6) {
/*     */       
/* 443 */       par1World.h(par2, par3, par4 + 1, this.cm);
/*     */     }
/* 445 */     else if (par5 == 3 || par5 == 7) {
/*     */       
/* 447 */       par1World.h(par2 - 1, par3, par4, this.cm);
/*     */     }
/*     */     else {
/*     */       
/* 451 */       par1World.h(par2, par3 - 1, par4, this.cm);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlockKeycardSlot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */