/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import SCPCraft.mod_Others;
/*     */ import SCPCraft.mod_SCP;
/*     */ import agi;
/*     */ import amq;
/*     */ import aoe;
/*     */ import java.util.Random;
/*     */ import ke;
/*     */ import md;
/*     */ import net.minecraftforge.common.ForgeDirection;
/*     */ import qx;
/*     */ import ur;
/*     */ import yc;
/*     */ import ym;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPBlockPoster
/*     */   extends amq
/*     */ {
/*     */   public SCPBlockPoster(int par1) {
/*  27 */     super(par1, agi.d);
/*  28 */     this.cl = 14;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTextureFile() {
/*  33 */     return "/SCPCraft/textures/SCPPosters.png";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  38 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(yc par1World, int par2, int par3, int par4) {
/*  43 */     return (par1World.isBlockSolidOnSide(par2 - 1, par3, par4, ForgeDirection.EAST) || par1World.isBlockSolidOnSide(par2 + 1, par3, par4, ForgeDirection.WEST) || par1World.isBlockSolidOnSide(par2, par3, par4 - 1, ForgeDirection.SOUTH) || par1World.isBlockSolidOnSide(par2, par3, par4 + 1, ForgeDirection.NORTH));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(yc par1World, int par2, int par3, int par4, qx par5EntityPlayer, int par6, float par7, float par8, float par9) {
/*  51 */     ur var2 = par5EntityPlayer.bJ.g();
/*     */     
/*  53 */     if (par5EntityPlayer != null && !par1World.I) {
/*     */       
/*  55 */       if (var2 != null && var2.c == mod_SCP.Pearl106.cj && this != mod_SCP.Poster106) {
/*     */         
/*  57 */         if (!par5EntityPlayer.cd.d) var2.a--; 
/*  58 */         par1World.d(par2, par3, par4, mod_SCP.Poster106.cm, par1World.h(par2, par3, par4));
/*     */       } 
/*  60 */       if (var2 != null && var2.c == mod_SCP.Pearl173.cj && this != mod_SCP.Poster173) {
/*     */         
/*  62 */         if (!par5EntityPlayer.cd.d) var2.a--; 
/*  63 */         par1World.d(par2, par3, par4, mod_SCP.Poster173.cm, par1World.h(par2, par3, par4));
/*     */       } 
/*  65 */       if (var2 != null && var2.c == mod_SCP.Pearl079.cj && this != mod_SCP.Poster079) {
/*     */         
/*  67 */         if (!par5EntityPlayer.cd.d) var2.a--; 
/*  68 */         par1World.d(par2, par3, par4, mod_SCP.Poster079.cm, par1World.h(par2, par3, par4));
/*     */       } 
/*  70 */       if (var2 != null && var2.c == mod_SCP.Pearl914.cj && this != mod_SCP.Poster914) {
/*     */         
/*  72 */         if (!par5EntityPlayer.cd.d) var2.a--; 
/*  73 */         par1World.d(par2, par3, par4, mod_SCP.Poster914.cm, par1World.h(par2, par3, par4));
/*     */       } 
/*  75 */       if (var2 != null && var2.c == mod_SCP.Pearl372.cj && this != mod_SCP.Poster372) {
/*     */         
/*  77 */         if (!par5EntityPlayer.cd.d) var2.a--; 
/*  78 */         par1World.d(par2, par3, par4, mod_SCP.Poster372.cm, par1World.h(par2, par3, par4));
/*     */       } 
/*     */     } 
/*  81 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(yc par1World, int par2, int par3, int par4) {
/*  86 */     return mod_SCP.ItemSCPPoster.cj;
/*     */   }
/*     */ 
/*     */   
/*     */   private static int determineOrientation(yc par0World, int par1, int par2, int par3, qx par4EntityPlayer) {
/*  91 */     if (ke.e((float)par4EntityPlayer.t - par1) < 2.0F && ke.e((float)par4EntityPlayer.v - par3) < 2.0F) {
/*     */       
/*  93 */       double d = par4EntityPlayer.u + 1.82D - par4EntityPlayer.M;
/*     */       
/*  95 */       if (d - par2 > 2.0D)
/*     */       {
/*  97 */         return 1;
/*     */       }
/*     */       
/* 100 */       if (par2 - d > 0.0D)
/*     */       {
/* 102 */         return 0;
/*     */       }
/*     */     } 
/*     */     
/* 106 */     int i = ke.c((par4EntityPlayer.z * 4.0F / 360.0F) + 0.5D) & 0x3;
/*     */     
/* 108 */     if (i == 0)
/*     */     {
/* 110 */       return 2;
/*     */     }
/*     */     
/* 113 */     if (i == 1)
/*     */     {
/* 115 */       return 5;
/*     */     }
/*     */     
/* 118 */     if (i == 2)
/*     */     {
/* 120 */       return 3;
/*     */     }
/*     */     
/* 123 */     return (i != 3) ? 0 : 4;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(yc par1World, int par2, int par3, int par4) {
/* 128 */     int l = par1World.h(par2, par3, par4);
/* 129 */     if (par1World.a(par2, par3, par4 + 1) == 0 && l == 0) return false; 
/* 130 */     if (par1World.a(par2, par3, par4 - 1) == 0 && l == 1) return false; 
/* 131 */     if (par1World.a(par2 + 1, par3, par4) == 0 && l == 2) return false; 
/* 132 */     if (par1World.a(par2 - 1, par3, par4) == 0 && l == 3) return false; 
/* 133 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yc world, int i, int j, int k, md entityliving) {
/* 138 */     int l = determineOrientation(world, i, j, k, (qx)entityliving);
/* 139 */     if (l == 5) world.c(i, j, k, 0); 
/* 140 */     if (l == 4) world.c(i, j, k, 1); 
/* 141 */     if (l == 3) world.c(i, j, k, 2); 
/* 142 */     if (l == 2) world.c(i, j, k, 3);
/*     */   
/*     */   }
/*     */   
/*     */   public aoe b_(yc world, int i, int j, int k) {
/* 147 */     int l = world.h(i, j, k);
/* 148 */     if (l == 0) a(0.0F, 0.0F, -1.0F, 0.2F, 2.0F, 1.0F); 
/* 149 */     if (l == 1) a(0.8F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F); 
/* 150 */     if (l == 2) a(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.2F); 
/* 151 */     if (l == 3) a(-1.0F, 0.0F, 0.8F, 1.0F, 2.0F, 1.0F); 
/* 152 */     return super.b_(world, i, j, k);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ym world, int i, int j, int k) {
/* 158 */     int l = world.h(i, j, k);
/* 159 */     if (l == 0) a(0.0F, 0.0F, -1.0F, 0.2F, 2.0F, 1.0F); 
/* 160 */     if (l == 1) a(0.8F, 0.0F, 1.0F, 1.0F, 2.0F, 2.0F); 
/* 161 */     if (l == 2) a(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.2F); 
/* 162 */     if (l == 3) a(-1.0F, 0.0F, 0.8F, 1.0F, 2.0F, 1.0F);
/*     */   
/*     */   }
/*     */   
/*     */   public aoe e(yc world, int i, int j, int k) {
/* 167 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 172 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int i, Random random, int j) {
/* 177 */     return mod_SCP.ItemSCPPoster.cj;
/*     */   }
/*     */ 
/*     */   
/*     */   public int quanityDropped(Random random) {
/* 182 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/* 187 */     return mod_Others.PosterID;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlockPoster.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */