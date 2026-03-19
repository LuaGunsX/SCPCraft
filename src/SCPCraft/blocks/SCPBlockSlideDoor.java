/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import SCPCraft.mod_Others;
/*     */ import SCPCraft.mod_SCP;
/*     */ import agi;
/*     */ import amq;
/*     */ import aoe;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import lq;
/*     */ import yc;
/*     */ import ym;
/*     */ 
/*     */ public class SCPBlockSlideDoor
/*     */   extends amq {
/*     */   public boolean isActivated = false;
/*     */   Random rand;
/*     */   
/*     */   public SCPBlockSlideDoor(int par1, agi par2Material) {
/*  22 */     super(par1, par2Material);
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
/* 345 */     this.rand = new Random(); this.cl = 20; b(true); } public String getTextureFile() { return "/SCPCraft/textures/SCPblox.png"; } public boolean c() { return false; } public int n() { return 0; }
/*     */   public boolean canRenderInPass(int pass) { return true; }
/*     */   public boolean a(ym par1IBlockAccess, int par2, int par3, int par4, int par5) { return true; }
/* 348 */   public void b(yc par1World, int par2, int par3, int par4, Random par5Random) { int var6 = par1World.h(par2, par3, par4);
/* 349 */     if (mod_Others.remoteDoorActivate && this.rand.nextInt(40) == 0) {
/*     */       
/* 351 */       if (var6 == 0) {
/*     */         
/* 353 */         par1World.d(par2, par3 + 1, par4, this.cm, 6);
/* 354 */         par1World.d(par2, par3, par4, this.cm, 4);
/* 355 */         par1World.a(par2, par3 + 0.5D, par4, "sounds.doorOpen", 0.5F, par1World.t.nextFloat() * 0.1F + 0.9F);
/*     */       } 
/* 357 */       if (var6 == 4) {
/*     */         
/* 359 */         par1World.d(par2, par3 + 1, par4, this.cm, 2);
/* 360 */         par1World.d(par2, par3, par4, this.cm, 0);
/* 361 */         par1World.a(par2, par3 + 0.5D, par4, "sounds.doorClose", 0.5F, par1World.t.nextFloat() * 0.1F + 0.9F);
/*     */       } 
/* 363 */       if (var6 == 1) {
/*     */         
/* 365 */         par1World.d(par2, par3 + 1, par4, this.cm, 7);
/* 366 */         par1World.d(par2, par3, par4, this.cm, 5);
/* 367 */         par1World.a(par2, par3 + 0.5D, par4, "sounds.doorOpen", 0.5F, par1World.t.nextFloat() * 0.1F + 0.9F);
/*     */       } 
/* 369 */       if (var6 == 5) {
/*     */         
/* 371 */         par1World.d(par2, par3 + 1, par4, this.cm, 3);
/* 372 */         par1World.d(par2, par3, par4, this.cm, 1);
/* 373 */         par1World.a(par2, par3 + 0.5D, par4, "sounds.doorClose", 0.5F, par1World.t.nextFloat() * 0.1F + 0.9F);
/*     */       } 
/* 375 */       if (var6 == 8) {
/*     */         
/* 377 */         par1World.d(par2, par3 + 1, par4, this.cm, 14);
/* 378 */         par1World.d(par2, par3, par4, this.cm, 12);
/* 379 */         par1World.a(par2, par3 + 0.5D, par4, "sounds.doorOpen", 0.5F, par1World.t.nextFloat() * 0.1F + 0.9F);
/*     */       } 
/* 381 */       if (var6 == 12) {
/*     */         
/* 383 */         par1World.d(par2, par3 + 1, par4, this.cm, 10);
/* 384 */         par1World.d(par2, par3, par4, this.cm, 8);
/* 385 */         par1World.a(par2, par3 + 0.5D, par4, "sounds.doorClose", 0.5F, par1World.t.nextFloat() * 0.1F + 0.9F);
/*     */       } 
/* 387 */       if (var6 == 9) {
/*     */         
/* 389 */         par1World.d(par2, par3 + 1, par4, this.cm, 15);
/* 390 */         par1World.d(par2, par3, par4, this.cm, 13);
/* 391 */         par1World.a(par2, par3 + 0.5D, par4, "sounds.doorOpen", 0.5F, par1World.t.nextFloat() * 0.1F + 0.9F);
/*     */       } 
/* 393 */       if (var6 == 13) {
/*     */         
/* 395 */         par1World.d(par2, par3 + 1, par4, this.cm, 11);
/* 396 */         par1World.d(par2, par3, par4, this.cm, 9);
/* 397 */         par1World.a(par2, par3 + 0.5D, par4, "sounds.doorClose", 0.5F, par1World.t.nextFloat() * 0.1F + 0.9F);
/*     */       } 
/*     */     }  } public boolean b() { return false; }
/*     */   public int d() { return mod_Others.SlidingDoorID; }
/*     */   public aoe b_(yc world, int i, int j, int k) { int l = world.h(i, j, k); float var1 = 0.33F, var2 = 0.33F, var3 = 0.66F, var4 = 0.66F, var5 = 1.0F; if (l == 0 || l == 8) { var1 = 0.0F; var3 = 1.0F; }
/*     */      if (l == 1 || l == 9) { var2 = 0.0F; var4 = 1.0F; }
/*     */      if (l == 2 || l == 10) { var1 = 0.0F; var3 = 1.0F; }
/*     */      if (l == 3 || l == 11) { var2 = 0.0F; var4 = 1.0F; }
/*     */      if (l == 4 || l == 5 || l == 6 || l == 7 || l == 12 || l == 13 || l == 14 || l == 15) { var1 = 0.0F; var2 = 0.0F; var3 = 0.0F; var4 = 0.0F; var5 = 0.0F; }
/*     */      return aoe.a().a((i + var1), j, (k + var2), (i + var3), (j + var5), (k + var4)); }
/* 407 */   public int a(int par1, Random par2Random, int par3) { if (par1 == 2 || par1 == 3 || par1 == 6 || par1 == 7 || par1 == 14 || par1 == 15 || par1 == 10 || par1 == 11) return 0; 
/* 408 */     return mod_SCP.SlideDoorItem.cj; } public void a(ym world, int i, int j, int k) { int l = world.h(i, j, k); if (l == 0 || l == 8) a(0.0F, 0.0F, 0.33F, 1.0F, 1.0F, 0.66F);  if (l == 1 || l == 9)
/*     */       a(0.33F, 0.0F, 0.0F, 0.66F, 1.0F, 1.0F);  if (l == 2 || l == 10)
/*     */       a(0.0F, 0.0F, 0.33F, 1.0F, 1.0F, 0.66F);  if (l == 3 || l == 11)
/*     */       a(0.33F, 0.0F, 0.0F, 0.66F, 1.0F, 1.0F);  if (l == 4 || l == 5 || l == 6 || l == 7 || l == 12 || l == 13 || l == 14 || l == 15)
/*     */       a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);  }
/* 413 */   public boolean b(yc par1World, int par2, int par3, int par4) { if (par1World.a(par2, par3 - 1, par4) == 0) return false; 
/* 414 */     return true; } public void a(yc par1World, int par2, int par3, int par4, aoe par5AxisAlignedBB, List par6ArrayList, lq par7Entity) { int i = par1World.h(par2, par3, par4); if (i == 0 || i == 8) { a(0.0F, 0.0F, 0.33F, 1.0F, 1.0F, 0.66F); super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity); }  if (i == 1 || i == 9) { a(0.33F, 0.0F, 0.0F, 0.66F, 1.0F, 1.0F); super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity); }
/*     */      if (i == 2 || i == 10) { a(0.0F, 0.0F, 0.33F, 1.0F, 1.0F, 0.66F); super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity); }
/*     */      if (i == 3 || i == 11) { a(0.33F, 0.0F, 0.0F, 0.66F, 1.0F, 1.0F); super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity); }
/*     */      if (i == 4 || i == 5 || i == 6 || i == 7 || i == 12 || i == 13 || i == 14 || i == 15)
/*     */       return;  }
/* 419 */   public int r_() { return 0; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int q_() {
/* 428 */     return 2;
/*     */   } public void a(yc par1World, int par2, int par3, int par4, int par5) { int var6 = par1World.h(par2, par3, par4); boolean var8 = (par1World.B(par2, par3, par4) || par1World.B(par2, par3 + 1, par4) || par1World.B(par2, par3 - 1, par4)); if (!b(par1World, par2, par3, par4)) { c(par1World, par2, par3, par4, par1World.h(par2, par3, par4), 0); par1World.e(par2, par3, par4, 0); }  if (par5 > 0 && amq.p[par5].i() && var6 == 0 && var8) { par1World.d(par2, par3 + 1, par4, this.cm, 6); par1World.d(par2, par3, par4, this.cm, 4); par1World.e(par2, par3, par4, par2, par3, par4); par1World.e(par2, par3 + 1, par4, par2, par3, par4); par1World.a(par2, par3 + 0.5D, par4, "sounds.doorOpen", 0.5F, par1World.t.nextFloat() * 0.1F + 0.9F); }  if (par5 > 0 && amq.p[par5].i() && var6 == 4 && var8) { par1World.d(par2, par3 + 1, par4, this.cm, 2); par1World.d(par2, par3, par4, this.cm, 0); par1World.e(par2, par3, par4, par2, par3, par4); par1World.e(par2, par3 + 1, par4, par2, par3, par4); par1World.a(par2, par3 + 0.5D, par4, "sounds.doorClose", 0.5F, par1World.t.nextFloat() * 0.1F + 0.9F); }  if (par5 > 0 && amq.p[par5].i() && var6 == 1 && var8) { par1World.d(par2, par3 + 1, par4, this.cm, 7); par1World.d(par2, par3, par4, this.cm, 5); par1World.e(par2, par3, par4, par2, par3, par4); par1World.e(par2, par3 + 1, par4, par2, par3, par4); par1World.a(par2, par3 + 0.5D, par4, "sounds.doorOpen", 0.5F, par1World.t.nextFloat() * 0.1F + 0.9F); }  if (par5 > 0 && amq.p[par5].i() && var6 == 5 && var8) { par1World.d(par2, par3 + 1, par4, this.cm, 3); par1World.d(par2, par3, par4, this.cm, 1); par1World.e(par2, par3, par4, par2, par3, par4); par1World.e(par2, par3 + 1, par4, par2, par3, par4); par1World.a(par2, par3 + 0.5D, par4, "sounds.doorClose", 0.5F, par1World.t.nextFloat() * 0.1F + 0.9F); }  if (par5 > 0 && amq.p[par5].i() && var6 == 2 && var8) { par1World.d(par2, par3 - 1, par4, this.cm, 4); par1World.d(par2, par3, par4, this.cm, 6); par1World.e(par2, par3, par4, par2, par3, par4); par1World.e(par2, par3 - 1, par4, par2, par3, par4); par1World.a(par2, par3 + 0.5D, par4, "sounds.doorOpen", 0.5F, par1World.t.nextFloat() * 0.1F + 0.9F); }  if (par5 > 0 && amq.p[par5].i() && var6 == 6 && var8) { par1World.d(par2, par3 - 1, par4, this.cm, 0); par1World.d(par2, par3, par4, this.cm, 2); par1World.e(par2, par3, par4, par2, par3, par4); par1World.e(par2, par3 - 1, par4, par2, par3, par4); par1World.a(par2, par3 + 0.5D, par4, "sounds.doorClose", 0.5F, par1World.t.nextFloat() * 0.1F + 0.9F); }  if (par5 > 0 && amq.p[par5].i() && var6 == 3 && var8) { par1World.d(par2, par3 - 1, par4, this.cm, 5); par1World.d(par2, par3, par4, this.cm, 7); par1World.e(par2, par3, par4, par2, par3, par4); par1World.e(par2, par3 - 1, par4, par2, par3, par4); par1World.a(par2, par3 + 0.5D, par4, "sounds.doorOpen", 0.5F, par1World.t.nextFloat() * 0.1F + 0.9F); }  if (par5 > 0 && amq.p[par5].i() && var6 == 7 && var8) { par1World.d(par2, par3 - 1, par4, this.cm, 1); par1World.d(par2, par3, par4, this.cm, 3); par1World.e(par2, par3, par4, par2, par3, par4); par1World.e(par2, par3 - 1, par4, par2, par3, par4); par1World.a(par2, par3 + 0.5D, par4, "sounds.doorClose", 0.5F, par1World.t.nextFloat() * 0.1F + 0.9F); }  if (par5 > 0 && amq.p[par5].i() && var6 == 8 && var8) { par1World.d(par2, par3 + 1, par4, this.cm, 14); par1World.d(par2, par3, par4, this.cm, 12); par1World.e(par2, par3, par4, par2, par3, par4); par1World.e(par2, par3 + 1, par4, par2, par3, par4); par1World.a(par2, par3 + 0.5D, par4, "sounds.doorOpen", 0.5F, par1World.t.nextFloat() * 0.1F + 0.9F); }  if (par5 > 0 && amq.p[par5].i() && var6 == 12 && var8) { par1World.d(par2, par3 + 1, par4, this.cm, 10); par1World.d(par2, par3, par4, this.cm, 8); par1World.e(par2, par3, par4, par2, par3, par4); par1World.e(par2, par3 + 1, par4, par2, par3, par4); par1World.a(par2, par3 + 0.5D, par4, "sounds.doorClose", 0.5F, par1World.t.nextFloat() * 0.1F + 0.9F); }  if (par5 > 0 && amq.p[par5].i() && var6 == 9 && var8) { par1World.d(par2, par3 + 1, par4, this.cm, 15); par1World.d(par2, par3, par4, this.cm, 13); par1World.e(par2, par3, par4, par2, par3, par4); par1World.e(par2, par3 + 1, par4, par2, par3, par4); par1World.a(par2, par3 + 0.5D, par4, "sounds.doorOpen", 0.5F, par1World.t.nextFloat() * 0.1F + 0.9F); }  if (par5 > 0 && amq.p[par5].i() && var6 == 13 && var8) { par1World.d(par2, par3 + 1, par4, this.cm, 11); par1World.d(par2, par3, par4, this.cm, 9); par1World.e(par2, par3, par4, par2, par3, par4); par1World.e(par2, par3 + 1, par4, par2, par3, par4); par1World.a(par2, par3 + 0.5D, par4, "sounds.doorClose", 0.5F, par1World.t.nextFloat() * 0.1F + 0.9F); }  if (par5 > 0 && amq.p[par5].i() && var6 == 10 && var8) { par1World.d(par2, par3 - 1, par4, this.cm, 12); par1World.d(par2, par3, par4, this.cm, 14); par1World.e(par2, par3, par4, par2, par3, par4); par1World.e(par2, par3 - 1, par4, par2, par3, par4); par1World.a(par2, par3 + 0.5D, par4, "sounds.doorOpen", 0.5F, par1World.t.nextFloat() * 0.1F + 0.9F); }  if (par5 > 0 && amq.p[par5].i() && var6 == 14 && var8) { par1World.d(par2, par3 - 1, par4, this.cm, 8); par1World.d(par2, par3, par4, this.cm, 10); par1World.e(par2, par3, par4, par2, par3, par4); par1World.e(par2, par3 - 1, par4, par2, par3, par4); par1World.a(par2, par3 + 0.5D, par4, "sounds.doorClose", 0.5F, par1World.t.nextFloat() * 0.1F + 0.9F); }  if (par5 > 0 && amq.p[par5].i() && var6 == 11 && var8) { par1World.d(par2, par3 - 1, par4, this.cm, 13); par1World.d(par2, par3, par4, this.cm, 15); par1World.e(par2, par3, par4, par2, par3, par4); par1World.e(par2, par3 - 1, par4, par2, par3, par4); par1World.a(par2, par3 + 0.5D, par4, "sounds.doorOpen", 0.5F, par1World.t.nextFloat() * 0.1F + 0.9F); }  if (par5 > 0 && amq.p[par5].i() && var6 == 15 && var8) { par1World.d(par2, par3 - 1, par4, this.cm, 9); par1World.d(par2, par3, par4, this.cm, 11); par1World.e(par2, par3, par4, par2, par3, par4); par1World.e(par2, par3 - 1, par4, par2, par3, par4); par1World.a(par2, par3 + 0.5D, par4, "sounds.doorClose", 0.5F, par1World.t.nextFloat() * 0.1F + 0.9F); }  if (var6 == 0 && par1World.a(par2, par3, par4) == this.cm && par1World.a(par2, par3 + 1, par4) != this.cm) { c(par1World, par2, par3, par4, par1World.h(par2, par3, par4), 0); par1World.d(par2, par3, par4, 0, 0); }  if (var6 == 2 && par1World.a(par2, par3, par4) == this.cm && par1World.a(par2, par3 - 1, par4) != this.cm) { c(par1World, par2, par3, par4, par1World.h(par2, par3, par4), 0); par1World.d(par2, par3, par4, 0, 0); }  if (var6 == 1 && par1World.a(par2, par3, par4) == this.cm && par1World.a(par2, par3 + 1, par4) != this.cm) { c(par1World, par2, par3, par4, par1World.h(par2, par3, par4), 0); par1World.d(par2, par3, par4, 0, 0); }  if (var6 == 3 && par1World.a(par2, par3, par4) == this.cm && par1World.a(par2, par3 - 1, par4) != this.cm) { c(par1World, par2, par3, par4, par1World.h(par2, par3, par4), 0); par1World.d(par2, par3, par4, 0, 0); }  if (var6 == 4 && par1World.a(par2, par3, par4) == this.cm && par1World.a(par2, par3 + 1, par4) != this.cm) { c(par1World, par2, par3, par4, par1World.h(par2, par3, par4), 0); par1World.d(par2, par3, par4, 0, 0); }  if (var6 == 5 && par1World.a(par2, par3, par4) == this.cm && par1World.a(par2, par3 + 1, par4) != this.cm) { c(par1World, par2, par3, par4, par1World.h(par2, par3, par4), 0); par1World.d(par2, par3, par4, 0, 0); }  if (var6 == 6 && par1World.a(par2, par3, par4) == this.cm && par1World.a(par2, par3 - 1, par4) != this.cm) { c(par1World, par2, par3, par4, par1World.h(par2, par3, par4), 0); par1World.d(par2, par3, par4, 0, 0); }  if (var6 == 7 && par1World.a(par2, par3, par4) == this.cm && par1World.a(par2, par3 - 1, par4) != this.cm) { c(par1World, par2, par3, par4, par1World.h(par2, par3, par4), 0); par1World.d(par2, par3, par4, 0, 0); }
/*     */      if (var6 == 8 && par1World.a(par2, par3, par4) == this.cm && par1World.a(par2, par3 + 1, par4) != this.cm) { c(par1World, par2, par3, par4, par1World.h(par2, par3, par4), 0); par1World.d(par2, par3, par4, 0, 0); }
/*     */      if (var6 == 10 && par1World.a(par2, par3, par4) == this.cm && par1World.a(par2, par3 - 1, par4) != this.cm) { c(par1World, par2, par3, par4, par1World.h(par2, par3, par4), 0); par1World.d(par2, par3, par4, 0, 0); }
/*     */      if (var6 == 9 && par1World.a(par2, par3, par4) == this.cm && par1World.a(par2, par3 + 1, par4) != this.cm) { c(par1World, par2, par3, par4, par1World.h(par2, par3, par4), 0); par1World.d(par2, par3, par4, 0, 0); }
/*     */      if (var6 == 11 && par1World.a(par2, par3, par4) == this.cm && par1World.a(par2, par3 - 1, par4) != this.cm) { c(par1World, par2, par3, par4, par1World.h(par2, par3, par4), 0); par1World.d(par2, par3, par4, 0, 0); }
/*     */      if (var6 == 12 && par1World.a(par2, par3, par4) == this.cm && par1World.a(par2, par3 + 1, par4) != this.cm) { c(par1World, par2, par3, par4, par1World.h(par2, par3, par4), 0); par1World.d(par2, par3, par4, 0, 0); }
/*     */      if (var6 == 13 && par1World.a(par2, par3, par4) == this.cm && par1World.a(par2, par3 + 1, par4) != this.cm) { c(par1World, par2, par3, par4, par1World.h(par2, par3, par4), 0); par1World.d(par2, par3, par4, 0, 0); }
/*     */      if (var6 == 14 && par1World.a(par2, par3, par4) == this.cm && par1World.a(par2, par3 - 1, par4) != this.cm) { c(par1World, par2, par3, par4, par1World.h(par2, par3, par4), 0); par1World.d(par2, par3, par4, 0, 0); }
/*     */      if (var6 == 15 && par1World.a(par2, par3, par4) == this.cm && par1World.a(par2, par3 - 1, par4) != this.cm) { c(par1World, par2, par3, par4, par1World.h(par2, par3, par4), 0); par1World.d(par2, par3, par4, 0, 0); }
/* 438 */      } @SideOnly(Side.CLIENT) public int a(yc par1World, int par2, int par3, int par4) { return mod_SCP.SlideDoorItem.cj; }
/*     */ 
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlockSlideDoor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */