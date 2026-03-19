/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import SCPCraft.entities.SCPEntityMountableBlock;
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
/*     */ import yc;
/*     */ import ym;
/*     */ 
/*     */ 
/*     */ public class SCPBlock789J
/*     */   extends amq
/*     */ {
/*     */   public SCPBlock789J(int par1, int j) {
/*  23 */     super(par1, j, agi.q);
/*  24 */     b(true);
/*  25 */     a(mod_SCP.tabBlockSCP);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTextureFile() {
/*  30 */     return "/SCPCraft/textures/SCPblox.png";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  35 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int n() {
/*  40 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canRenderInPass(int pass) {
/*  45 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ym par1IBlockAccess, int par2, int par3, int par4, int par5) {
/*  50 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(yc world, int i, int j, int k, qx entityplayer, int par6, float par7, float par8, float par9) {
/*  56 */     return onBlockActivated(world, i, j, k, entityplayer, 0.5F, 0.5F, 0.5F, 0, 0, 0, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean onBlockActivated(yc world, int i, int j, int k, qx entityplayer, float y) {
/*  62 */     return onBlockActivated(world, i, j, k, entityplayer, 0.5F, y, 0.5F, 0, 0, 0, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean onBlockActivated(yc world, int i, int j, int k, qx entityplayer, float x, float y, float z, int north, int south, int east, int west) {
/*  68 */     if (!world.I) {
/*     */ 
/*     */       
/*  71 */       List listEMB = world.a(SCPEntityMountableBlock.class, aoe.a(i, j, k, i + 1.0D, j + 1.0D, k + 1.0D).b(1.0D, 1.0D, 1.0D));
/*  72 */       for (SCPEntityMountableBlock entitytocheck : listEMB) {
/*     */ 
/*     */         
/*  75 */         if (entitytocheck.getOrgBlockPosX() == i && entitytocheck.getOrgBlockPosY() == j && entitytocheck.getOrgBlockPosZ() == k) {
/*     */           
/*  77 */           entitytocheck.a(entityplayer);
/*  78 */           return true;
/*     */         } 
/*     */       } 
/*     */       
/*  82 */       float mountingX = i + x;
/*  83 */       float mountingY = j + y;
/*  84 */       float mountingZ = k + z;
/*     */       
/*  86 */       if (north != south) {
/*     */         
/*  88 */         int md = world.h(i, j, k);
/*  89 */         if (md == east) {
/*     */           
/*  91 */           mountingX = (i + 1) - z;
/*  92 */           mountingZ = k + x;
/*     */         }
/*  94 */         else if (md == south) {
/*     */           
/*  96 */           mountingX = (i + 1) - x;
/*  97 */           mountingZ = (k + 1) - z;
/*     */         }
/*  99 */         else if (md == west) {
/*     */           
/* 101 */           mountingX = i + z;
/* 102 */           mountingZ = (k + 1) - x;
/*     */         } 
/*     */       } 
/*     */       
/* 106 */       SCPEntityMountableBlock nemb = new SCPEntityMountableBlock(world, entityplayer, i, j, k, mountingX, mountingY, mountingZ);
/* 107 */       world.d((lq)nemb);
/* 108 */       nemb.a(entityplayer);
/*     */       
/* 110 */       entityplayer.a(mod_SCP.ghostButt, 5);
/* 111 */       return true;
/*     */     } 
/* 113 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private static int determineOrientation(yc par0World, int par1, int par2, int par3, qx par4EntityPlayer) {
/* 118 */     if (ke.e((float)par4EntityPlayer.t - par1) < 2.0F && ke.e((float)par4EntityPlayer.v - par3) < 2.0F) {
/*     */       
/* 120 */       double d = par4EntityPlayer.u + 1.82D - par4EntityPlayer.M;
/*     */       
/* 122 */       if (d - par2 > 2.0D)
/*     */       {
/* 124 */         return 1;
/*     */       }
/*     */       
/* 127 */       if (par2 - d > 0.0D)
/*     */       {
/* 129 */         return 0;
/*     */       }
/*     */     } 
/*     */     
/* 133 */     int i = ke.c((par4EntityPlayer.z * 4.0F / 360.0F) + 0.5D) & 0x3;
/*     */     
/* 135 */     if (i == 0)
/*     */     {
/* 137 */       return 2;
/*     */     }
/*     */     
/* 140 */     if (i == 1)
/*     */     {
/* 142 */       return 5;
/*     */     }
/*     */     
/* 145 */     if (i == 2)
/*     */     {
/* 147 */       return 3;
/*     */     }
/*     */     
/* 150 */     return (i != 3) ? 0 : 4;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yc world, int i, int j, int k, md entityliving) {
/* 155 */     int l = determineOrientation(world, i, j, k, (qx)entityliving);
/* 156 */     if (l == 3) world.c(i, j, k, 0); 
/* 157 */     if (l == 2) world.c(i, j, k, 1); 
/* 158 */     if (l == 5) world.c(i, j, k, 2); 
/* 159 */     if (l == 4) world.c(i, j, k, 3);
/*     */   
/*     */   }
/*     */   
/*     */   public aoe getSelectedBoundingBoxFromPool_do(yc world, int i, int j, int k) {
/* 164 */     int l = world.h(i, j, k);
/* 165 */     if (l == 0) a(0.2F, 0.0F, 0.0F, 0.8F, 1.3F, 0.85F); 
/* 166 */     if (l == 1) a(0.2F, 0.0F, 0.15F, 0.8F, 1.3F, 1.0F); 
/* 167 */     if (l == 2) a(0.0F, 0.0F, 0.2F, 0.85F, 1.3F, 0.8F); 
/* 168 */     if (l == 3) a(0.15F, 0.0F, 0.2F, 1.0F, 1.3F, 0.8F); 
/* 169 */     return b_(world, i, j, k);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ym world, int i, int j, int k) {
/* 175 */     int l = world.h(i, j, k);
/* 176 */     if (l == 0) a(0.2F, 0.0F, 0.0F, 0.8F, 1.3F, 0.85F); 
/* 177 */     if (l == 1) a(0.2F, 0.0F, 0.15F, 0.8F, 1.3F, 1.0F); 
/* 178 */     if (l == 2) a(0.0F, 0.0F, 0.2F, 0.85F, 1.3F, 0.8F); 
/* 179 */     if (l == 3) a(0.15F, 0.0F, 0.2F, 1.0F, 1.3F, 0.8F);
/*     */   
/*     */   }
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, aoe par5AxisAlignedBB, List par6ArrayList, lq par7Entity) {
/* 184 */     int i = par1World.h(par2, par3, par4);
/* 185 */     if (i == 0) {
/*     */       
/* 187 */       a(0.33F, 0.0F, 0.33F, 0.66F, 0.4F, 0.66F);
/* 188 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       
/* 190 */       a(0.2F, 0.4F, 0.185F, 0.8F, 0.6F, 0.85F);
/* 191 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       
/* 193 */       a(0.2F, 0.4F, 0.0F, 0.8F, 1.3F, 0.25F);
/* 194 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       
/* 196 */       a(0.2F, 0.6F, 0.3F, 0.8F, 1.3F, 0.37F);
/* 197 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */     } 
/* 199 */     if (i == 1) {
/*     */       
/* 201 */       a(0.33F, 0.0F, 0.33F, 0.66F, 0.4F, 0.66F);
/* 202 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       
/* 204 */       a(0.2F, 0.4F, 0.15F, 0.8F, 0.6F, 0.85F);
/* 205 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       
/* 207 */       a(0.2F, 0.4F, 0.75F, 0.8F, 1.3F, 1.0F);
/* 208 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       
/* 210 */       a(0.2F, 0.6F, 0.63F, 0.8F, 1.3F, 0.7F);
/* 211 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */     } 
/* 213 */     if (i == 2) {
/*     */       
/* 215 */       a(0.33F, 0.0F, 0.33F, 0.66F, 0.4F, 0.66F);
/* 216 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       
/* 218 */       a(0.15F, 0.4F, 0.2F, 0.85F, 0.6F, 0.8F);
/* 219 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       
/* 221 */       a(0.0F, 0.4F, 0.2F, 0.25F, 1.3F, 0.8F);
/* 222 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       
/* 224 */       a(0.3F, 0.6F, 0.2F, 0.37F, 1.3F, 0.8F);
/* 225 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */     } 
/* 227 */     if (i == 3) {
/*     */       
/* 229 */       a(0.33F, 0.0F, 0.33F, 0.66F, 0.4F, 0.66F);
/* 230 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       
/* 232 */       a(0.15F, 0.4F, 0.2F, 0.85F, 0.6F, 0.8F);
/* 233 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       
/* 235 */       a(0.75F, 0.4F, 0.2F, 1.0F, 1.3F, 0.8F);
/* 236 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       
/* 238 */       a(0.63F, 0.6F, 0.2F, 0.7F, 1.3F, 0.8F);
/* 239 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(yc par1World, int par2, int par3, int par4, Random par5Random) {
/* 245 */     par1World.a((par2 + 0.5F), (par3 + 0.5F), (par4 + 0.5F), "sounds.SCP789J", 2.0F, 1.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 253 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean canPlaceCandleOn(yc par1World, int par2, int par3, int par4) {
/* 258 */     if (par1World.v(par2, par3, par4))
/*     */     {
/* 260 */       return true;
/*     */     }
/*     */ 
/*     */     
/* 264 */     int var5 = par1World.a(par2, par3, par4);
/* 265 */     return (var5 == amq.P.cm || var5 == amq.aP.cm || var5 == amq.aN.cm || var5 == this.cm);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(yc par1World, int par2, int par3, int par4) {
/* 271 */     return par1World.b(par2 - 1, par3, par4, true) ? true : (par1World.b(par2 + 1, par3, par4, true) ? true : (par1World.b(par2, par3, par4 - 1, true) ? true : (par1World.b(par2, par3, par4 + 1, true) ? true : canPlaceCandleOn(par1World, par2, par3 - 1, par4))));
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/* 276 */     return mod_Others.SCP789JID;
/*     */   }
/*     */ 
/*     */   
/*     */   public int r_() {
/* 281 */     return 1;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlock789J.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */