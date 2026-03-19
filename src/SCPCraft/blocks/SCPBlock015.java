/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import SCPCraft.mod_Others;
/*     */ import SCPCraft.mod_SCP;
/*     */ import SCPCraft.tileentities.SCPTileEntity015;
/*     */ import agi;
/*     */ import akb;
/*     */ import any;
/*     */ import aoe;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import ll;
/*     */ import lm;
/*     */ import lq;
/*     */ import qx;
/*     */ import yc;
/*     */ import ym;
/*     */ 
/*     */ public class SCPBlock015
/*     */   extends akb
/*     */ {
/*  22 */   public Random rand = new Random();
/*     */   
/*     */   public SCPBlock015(int par1, int par2) {
/*  25 */     super(par1, par2, agi.f);
/*  26 */     a(mod_SCP.tabBlockSCP);
/*     */   }
/*     */ 
/*     */   
/*     */   public final boolean canThisPaneConnectToThisBlockID(int i) {
/*  31 */     return (p[i] instanceof SCPBlock015 || i == mod_SCP.Machinery.cm || i == mod_SCP.Toilet.cm);
/*     */   }
/*     */ 
/*     */   
/*     */   public any a(yc var1) {
/*     */     try {
/*  37 */       return (any)SCPTileEntity015.class.newInstance();
/*     */     }
/*  39 */     catch (Exception exception) {
/*  40 */       throw new RuntimeException(exception);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, qx par5EntityPlayer) {
/*  46 */     int[] Potions = { ll.q.H, ll.s.H, ll.k.H, ll.f.H, ll.d.H, ll.t.H, ll.u.H, mod_SCP.shake.H };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  52 */     double d = par2;
/*  53 */     double d1 = par3;
/*  54 */     double d2 = par4;
/*     */     
/*  56 */     if (par5EntityPlayer != null) {
/*     */       
/*  58 */       for (int var3 = 0; var3 < 50; var3++) {
/*  59 */         par1World.a("splash", par5EntityPlayer.t, par5EntityPlayer.u, par5EntityPlayer.v, 0.0D, -0.1D, 0.0D);
/*  60 */         par1World.a("splash", par5EntityPlayer.t, par5EntityPlayer.u, par5EntityPlayer.v, 0.0D, -0.1D, 0.0D);
/*  61 */         par1World.a("splash", par5EntityPlayer.t, par5EntityPlayer.u, par5EntityPlayer.v, 0.0D, -0.1D, 0.0D);
/*     */       } 
/*  63 */       par5EntityPlayer.d(new lm(Potions[this.rand.nextInt(8)], 200, 1));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  69 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int n() {
/*  74 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public aoe getSelectedBoundingBoxFromPool_do(yc world, int i, int j, int k) {
/*  79 */     boolean flag = canThisPaneConnectToThisBlockID(world.a(i, j, k - 1));
/*  80 */     boolean flag1 = canThisPaneConnectToThisBlockID(world.a(i - 1, j, k));
/*  81 */     boolean flag2 = canThisPaneConnectToThisBlockID(world.a(i + 1, j, k));
/*  82 */     boolean flag3 = canThisPaneConnectToThisBlockID(world.a(i, j, k + 1));
/*  83 */     boolean flag4 = canThisPaneConnectToThisBlockID(world.a(i, j + 1, k));
/*  84 */     boolean flag5 = canThisPaneConnectToThisBlockID(world.a(i, j - 1, k));
/*  85 */     a(0.33F, 0.33F, 0.33F, 0.66F, 0.66F, 0.66F);
/*  86 */     if (flag1) a(0.0F, 0.33F, 0.33F, 0.66F, 0.66F, 0.66F); 
/*  87 */     if (flag) a(0.33F, 0.33F, 0.0F, 0.66F, 0.66F, 0.66F); 
/*  88 */     if (flag3) a(0.33F, 0.33F, 0.33F, 0.66F, 0.66F, 1.0F); 
/*  89 */     if (flag2) a(0.33F, 0.33F, 0.33F, 1.0F, 0.66F, 0.66F); 
/*  90 */     if (flag4) a(0.33F, 0.33F, 0.33F, 0.66F, 1.0F, 0.66F); 
/*  91 */     if (flag5) a(0.33F, 0.0F, 0.33F, 0.66F, 0.66F, 0.66F); 
/*  92 */     return b_(world, i, j, k);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ym world, int i, int j, int k) {
/*  98 */     boolean flag = canThisPaneConnectToThisBlockID(world.a(i, j, k - 1));
/*  99 */     boolean flag1 = canThisPaneConnectToThisBlockID(world.a(i - 1, j, k));
/* 100 */     boolean flag2 = canThisPaneConnectToThisBlockID(world.a(i + 1, j, k));
/* 101 */     boolean flag3 = canThisPaneConnectToThisBlockID(world.a(i, j, k + 1));
/* 102 */     boolean flag4 = canThisPaneConnectToThisBlockID(world.a(i, j + 1, k));
/* 103 */     boolean flag5 = canThisPaneConnectToThisBlockID(world.a(i, j - 1, k));
/* 104 */     a(0.33F, 0.33F, 0.33F, 0.66F, 0.66F, 0.66F);
/* 105 */     if (flag1) a(0.0F, 0.33F, 0.33F, 0.66F, 0.66F, 0.66F); 
/* 106 */     if (flag) a(0.33F, 0.33F, 0.0F, 0.66F, 0.66F, 0.66F); 
/* 107 */     if (flag3) a(0.33F, 0.33F, 0.33F, 0.66F, 0.66F, 1.0F); 
/* 108 */     if (flag2) a(0.33F, 0.33F, 0.33F, 1.0F, 0.66F, 0.66F); 
/* 109 */     if (flag4) a(0.33F, 0.33F, 0.33F, 0.66F, 1.0F, 0.66F); 
/* 110 */     if (flag5) a(0.33F, 0.0F, 0.33F, 0.66F, 0.66F, 0.66F);
/*     */   
/*     */   }
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, aoe par5AxisAlignedBB, List par6ArrayList, lq par7Entity) {
/* 115 */     boolean flag = canThisPaneConnectToThisBlockID(par1World.a(par2, par3, par4 - 1));
/* 116 */     boolean flag1 = canThisPaneConnectToThisBlockID(par1World.a(par2 - 1, par3, par4));
/* 117 */     boolean flag2 = canThisPaneConnectToThisBlockID(par1World.a(par2 + 1, par3, par4));
/* 118 */     boolean flag3 = canThisPaneConnectToThisBlockID(par1World.a(par2, par3, par4 + 1));
/* 119 */     boolean flag4 = canThisPaneConnectToThisBlockID(par1World.a(par2, par3 + 1, par4));
/* 120 */     boolean flag5 = canThisPaneConnectToThisBlockID(par1World.a(par2, par3 - 1, par4));
/*     */     
/* 122 */     a(0.33F, 0.33F, 0.33F, 0.66F, 0.66F, 0.66F);
/* 123 */     super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */     
/* 125 */     if (flag1) {
/*     */       
/* 127 */       a(0.0F, 0.33F, 0.33F, 0.33F, 0.66F, 0.66F);
/* 128 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */     } 
/* 130 */     if (flag) {
/*     */       
/* 132 */       a(0.33F, 0.33F, 0.0F, 0.66F, 0.66F, 0.33F);
/* 133 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */     } 
/* 135 */     if (flag3) {
/*     */       
/* 137 */       a(0.33F, 0.33F, 0.66F, 0.66F, 0.66F, 1.0F);
/* 138 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */     } 
/* 140 */     if (flag2) {
/*     */       
/* 142 */       a(0.66F, 0.33F, 0.33F, 1.0F, 0.66F, 0.66F);
/* 143 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */     } 
/* 145 */     if (flag4) {
/*     */       
/* 147 */       a(0.33F, 0.66F, 0.33F, 0.66F, 1.0F, 0.66F);
/* 148 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */     } 
/* 150 */     if (flag5) {
/*     */       
/* 152 */       a(0.33F, 0.0F, 0.33F, 0.66F, 0.33F, 0.66F);
/* 153 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canRenderInPass(int pass) {
/* 159 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 164 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/* 169 */     return mod_Others.SCP015ID;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTextureFile() {
/* 174 */     return "/SCPCraft/textures/SCPblox.png";
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlock015.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */