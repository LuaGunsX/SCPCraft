/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import SCPCraft.mod_Others;
/*     */ import SCPCraft.mod_SCP;
/*     */ import SCPCraft.tileentities.SCPTileEntity151;
/*     */ import agi;
/*     */ import akb;
/*     */ import any;
/*     */ import aoe;
/*     */ import java.util.Random;
/*     */ import ke;
/*     */ import md;
/*     */ import net.minecraftforge.common.ForgeDirection;
/*     */ import qx;
/*     */ import yc;
/*     */ import ym;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPBlock151
/*     */   extends akb
/*     */ {
/*     */   public SCPBlock151(int par1) {
/*  27 */     super(par1, agi.d);
/*  28 */     this.cl = 8;
/*  29 */     a(mod_SCP.tabBlockSCP);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTextureFile() {
/*  34 */     return "/SCPCraft/textures/SCPPosters.png";
/*     */   }
/*     */ 
/*     */   
/*     */   public any a(yc var1) {
/*     */     try {
/*  40 */       return (any)SCPTileEntity151.class.newInstance();
/*     */     }
/*  42 */     catch (Exception exception) {
/*  43 */       throw new RuntimeException(exception);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  49 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(yc par1World, int par2, int par3, int par4) {
/*  54 */     return (par1World.isBlockSolidOnSide(par2 - 1, par3, par4, ForgeDirection.EAST) || par1World.isBlockSolidOnSide(par2 + 1, par3, par4, ForgeDirection.WEST) || par1World.isBlockSolidOnSide(par2, par3, par4 - 1, ForgeDirection.SOUTH) || par1World.isBlockSolidOnSide(par2, par3, par4 + 1, ForgeDirection.NORTH));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(yc par1World, int par2, int par3, int par4) {
/*  62 */     return mod_SCP.ItemSCPPoster.cj;
/*     */   }
/*     */ 
/*     */   
/*     */   private static int determineOrientation(yc par0World, int par1, int par2, int par3, qx par4EntityPlayer) {
/*  67 */     if (ke.e((float)par4EntityPlayer.t - par1) < 2.0F && ke.e((float)par4EntityPlayer.v - par3) < 2.0F) {
/*     */       
/*  69 */       double d = par4EntityPlayer.u + 1.82D - par4EntityPlayer.M;
/*     */       
/*  71 */       if (d - par2 > 2.0D)
/*     */       {
/*  73 */         return 1;
/*     */       }
/*     */       
/*  76 */       if (par2 - d > 0.0D)
/*     */       {
/*  78 */         return 0;
/*     */       }
/*     */     } 
/*     */     
/*  82 */     int i = ke.c((par4EntityPlayer.z * 4.0F / 360.0F) + 0.5D) & 0x3;
/*     */     
/*  84 */     if (i == 0)
/*     */     {
/*  86 */       return 2;
/*     */     }
/*     */     
/*  89 */     if (i == 1)
/*     */     {
/*  91 */       return 5;
/*     */     }
/*     */     
/*  94 */     if (i == 2)
/*     */     {
/*  96 */       return 3;
/*     */     }
/*     */     
/*  99 */     return (i != 3) ? 0 : 4;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(yc par1World, int par2, int par3, int par4) {
/* 104 */     int l = par1World.h(par2, par3, par4);
/* 105 */     if (par1World.a(par2, par3, par4 + 1) == 0 && l == 0) return false; 
/* 106 */     if (par1World.a(par2, par3, par4 - 1) == 0 && l == 1) return false; 
/* 107 */     if (par1World.a(par2 + 1, par3, par4) == 0 && l == 2) return false; 
/* 108 */     if (par1World.a(par2 - 1, par3, par4) == 0 && l == 3) return false; 
/* 109 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yc world, int i, int j, int k, md entityliving) {
/* 114 */     int l = determineOrientation(world, i, j, k, (qx)entityliving);
/* 115 */     if (l == 5) world.c(i, j, k, 0); 
/* 116 */     if (l == 4) world.c(i, j, k, 1); 
/* 117 */     if (l == 3) world.c(i, j, k, 2); 
/* 118 */     if (l == 2) world.c(i, j, k, 3);
/*     */   
/*     */   }
/*     */   
/*     */   public aoe b_(yc world, int i, int j, int k) {
/* 123 */     int l = world.h(i, j, k);
/* 124 */     if (l == 0) a(0.0F, 0.0F, -1.0F, 0.2F, 2.0F, 1.0F); 
/* 125 */     if (l == 1) a(0.8F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F); 
/* 126 */     if (l == 2) a(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.2F); 
/* 127 */     if (l == 3) a(-1.0F, 0.0F, 0.8F, 1.0F, 2.0F, 1.0F); 
/* 128 */     return super.b_(world, i, j, k);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ym world, int i, int j, int k) {
/* 134 */     int l = world.h(i, j, k);
/* 135 */     if (l == 0) a(0.0F, 0.0F, -1.0F, 0.2F, 2.0F, 1.0F); 
/* 136 */     if (l == 1) a(0.8F, 0.0F, 1.0F, 1.0F, 2.0F, 2.0F); 
/* 137 */     if (l == 2) a(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.2F); 
/* 138 */     if (l == 3) a(-1.0F, 0.0F, 0.8F, 1.0F, 2.0F, 1.0F);
/*     */   
/*     */   }
/*     */   
/*     */   public aoe e(yc world, int i, int j, int k) {
/* 143 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 148 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int i, Random random, int j) {
/* 153 */     return mod_SCP.SCP151.cm;
/*     */   }
/*     */ 
/*     */   
/*     */   public int quanityDropped(Random random) {
/* 158 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/* 163 */     return mod_Others.PosterID;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlock151.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */