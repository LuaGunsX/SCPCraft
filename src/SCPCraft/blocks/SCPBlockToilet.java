/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import SCPCraft.entities.SCPEntityMountableBlock;
/*     */ import SCPCraft.mod_Others;
/*     */ import SCPCraft.mod_SCP;
/*     */ import agi;
/*     */ import amq;
/*     */ import aoe;
/*     */ import java.util.List;
/*     */ import ke;
/*     */ import lq;
/*     */ import md;
/*     */ import qx;
/*     */ import yc;
/*     */ import ym;
/*     */ 
/*     */ 
/*     */ public class SCPBlockToilet
/*     */   extends amq
/*     */ {
/*     */   public SCPBlockToilet(int par1, int j) {
/*  22 */     super(par1, j, agi.q);
/*  23 */     a(mod_SCP.tabBlockSCP);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTextureFile() {
/*  28 */     return "/SCPCraft/textures/SCPblox.png";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  33 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int n() {
/*  38 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canRenderInPass(int pass) {
/*  43 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ym par1IBlockAccess, int par2, int par3, int par4, int par5) {
/*  48 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(yc world, int i, int j, int k, qx entityplayer, int par6, float par7, float par8, float par9) {
/*  54 */     return onBlockActivated(world, i, j, k, entityplayer, 0.5F, 0.5F, 0.5F, 0, 0, 0, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean onBlockActivated(yc world, int i, int j, int k, qx entityplayer, float y) {
/*  60 */     return onBlockActivated(world, i, j, k, entityplayer, 0.5F, y, 0.5F, 0, 0, 0, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean onBlockActivated(yc world, int i, int j, int k, qx entityplayer, float x, float y, float z, int north, int south, int east, int west) {
/*  66 */     if (!world.I) {
/*     */ 
/*     */       
/*  69 */       List listEMB = world.a(SCPEntityMountableBlock.class, aoe.a(i, j, k, i + 1.0D, j + 1.0D, k + 1.0D).b(1.0D, 1.0D, 1.0D));
/*  70 */       for (SCPEntityMountableBlock entitytocheck : listEMB) {
/*     */ 
/*     */         
/*  73 */         if (entitytocheck.getOrgBlockPosX() == i && entitytocheck.getOrgBlockPosY() == j && entitytocheck.getOrgBlockPosZ() == k) {
/*     */           
/*  75 */           entitytocheck.a(entityplayer);
/*  76 */           return true;
/*     */         } 
/*     */       } 
/*     */       
/*  80 */       float mountingX = i + x;
/*  81 */       float mountingY = j + y;
/*  82 */       float mountingZ = k + z;
/*     */       
/*  84 */       if (north != south) {
/*     */         
/*  86 */         int md = world.h(i, j, k);
/*  87 */         if (md == east) {
/*     */           
/*  89 */           mountingX = (i + 1) - z;
/*  90 */           mountingZ = k + x;
/*     */         }
/*  92 */         else if (md == south) {
/*     */           
/*  94 */           mountingX = (i + 1) - x;
/*  95 */           mountingZ = (k + 1) - z;
/*     */         }
/*  97 */         else if (md == west) {
/*     */           
/*  99 */           mountingX = i + z;
/* 100 */           mountingZ = (k + 1) - x;
/*     */         } 
/*     */       } 
/*     */       
/* 104 */       SCPEntityMountableBlock nemb = new SCPEntityMountableBlock(world, entityplayer, i, j, k, mountingX, mountingY, mountingZ);
/* 105 */       world.d((lq)nemb);
/* 106 */       nemb.a(entityplayer);
/* 107 */       return true;
/*     */     } 
/* 109 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private static int determineOrientation(yc par0World, int par1, int par2, int par3, qx par4EntityPlayer) {
/* 114 */     if (ke.e((float)par4EntityPlayer.t - par1) < 2.0F && ke.e((float)par4EntityPlayer.v - par3) < 2.0F) {
/*     */       
/* 116 */       double d = par4EntityPlayer.u + 1.82D - par4EntityPlayer.M;
/*     */       
/* 118 */       if (d - par2 > 2.0D)
/*     */       {
/* 120 */         return 1;
/*     */       }
/*     */       
/* 123 */       if (par2 - d > 0.0D)
/*     */       {
/* 125 */         return 0;
/*     */       }
/*     */     } 
/*     */     
/* 129 */     int i = ke.c((par4EntityPlayer.z * 4.0F / 360.0F) + 0.5D) & 0x3;
/*     */     
/* 131 */     if (i == 0)
/*     */     {
/* 133 */       return 2;
/*     */     }
/*     */     
/* 136 */     if (i == 1)
/*     */     {
/* 138 */       return 5;
/*     */     }
/*     */     
/* 141 */     if (i == 2)
/*     */     {
/* 143 */       return 3;
/*     */     }
/*     */     
/* 146 */     return (i != 3) ? 0 : 4;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yc world, int i, int j, int k, md entityliving) {
/* 151 */     int l = determineOrientation(world, i, j, k, (qx)entityliving);
/* 152 */     if (l == 3) world.c(i, j, k, 0); 
/* 153 */     if (l == 2) world.c(i, j, k, 1); 
/* 154 */     if (l == 5) world.c(i, j, k, 2); 
/* 155 */     if (l == 4) world.c(i, j, k, 3);
/*     */   
/*     */   }
/*     */   
/*     */   public aoe getSelectedBoundingBoxFromPool_do(yc world, int i, int j, int k) {
/* 160 */     int l = world.h(i, j, k);
/* 161 */     if (l == 0) a(0.2F, 0.0F, 0.0F, 0.8F, 1.3F, 0.85F); 
/* 162 */     if (l == 1) a(0.2F, 0.0F, 0.15F, 0.8F, 1.3F, 1.0F); 
/* 163 */     if (l == 2) a(0.0F, 0.0F, 0.2F, 0.85F, 1.3F, 0.8F); 
/* 164 */     if (l == 3) a(0.15F, 0.0F, 0.2F, 1.0F, 1.3F, 0.8F); 
/* 165 */     return b_(world, i, j, k);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ym world, int i, int j, int k) {
/* 171 */     int l = world.h(i, j, k);
/* 172 */     if (l == 0) a(0.2F, 0.0F, 0.0F, 0.8F, 1.3F, 0.85F); 
/* 173 */     if (l == 1) a(0.2F, 0.0F, 0.15F, 0.8F, 1.3F, 1.0F); 
/* 174 */     if (l == 2) a(0.0F, 0.0F, 0.2F, 0.85F, 1.3F, 0.8F); 
/* 175 */     if (l == 3) a(0.15F, 0.0F, 0.2F, 1.0F, 1.3F, 0.8F);
/*     */   
/*     */   }
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, aoe par5AxisAlignedBB, List par6ArrayList, lq par7Entity) {
/* 180 */     int i = par1World.h(par2, par3, par4);
/* 181 */     if (i == 0) {
/*     */       
/* 183 */       a(0.33F, 0.0F, 0.33F, 0.66F, 0.4F, 0.66F);
/* 184 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       
/* 186 */       a(0.2F, 0.4F, 0.185F, 0.8F, 0.6F, 0.85F);
/* 187 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       
/* 189 */       a(0.2F, 0.4F, 0.0F, 0.8F, 1.3F, 0.25F);
/* 190 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       
/* 192 */       a(0.2F, 0.6F, 0.3F, 0.8F, 1.3F, 0.37F);
/* 193 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */     } 
/* 195 */     if (i == 1) {
/*     */       
/* 197 */       a(0.33F, 0.0F, 0.33F, 0.66F, 0.4F, 0.66F);
/* 198 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       
/* 200 */       a(0.2F, 0.4F, 0.15F, 0.8F, 0.6F, 0.85F);
/* 201 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       
/* 203 */       a(0.2F, 0.4F, 0.75F, 0.8F, 1.3F, 1.0F);
/* 204 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       
/* 206 */       a(0.2F, 0.6F, 0.63F, 0.8F, 1.3F, 0.7F);
/* 207 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */     } 
/* 209 */     if (i == 2) {
/*     */       
/* 211 */       a(0.33F, 0.0F, 0.33F, 0.66F, 0.4F, 0.66F);
/* 212 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       
/* 214 */       a(0.15F, 0.4F, 0.2F, 0.85F, 0.6F, 0.8F);
/* 215 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       
/* 217 */       a(0.0F, 0.4F, 0.2F, 0.25F, 1.3F, 0.8F);
/* 218 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       
/* 220 */       a(0.3F, 0.6F, 0.2F, 0.37F, 1.3F, 0.8F);
/* 221 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */     } 
/* 223 */     if (i == 3) {
/*     */       
/* 225 */       a(0.33F, 0.0F, 0.33F, 0.66F, 0.4F, 0.66F);
/* 226 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       
/* 228 */       a(0.15F, 0.4F, 0.2F, 0.85F, 0.6F, 0.8F);
/* 229 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       
/* 231 */       a(0.75F, 0.4F, 0.2F, 1.0F, 1.3F, 0.8F);
/* 232 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       
/* 234 */       a(0.63F, 0.6F, 0.2F, 0.7F, 1.3F, 0.8F);
/* 235 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 244 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean canPlaceCandleOn(yc par1World, int par2, int par3, int par4) {
/* 249 */     if (par1World.v(par2, par3, par4))
/*     */     {
/* 251 */       return true;
/*     */     }
/*     */ 
/*     */     
/* 255 */     int var5 = par1World.a(par2, par3, par4);
/* 256 */     return (var5 == amq.P.cm || var5 == amq.aP.cm || var5 == amq.aN.cm || var5 == this.cm);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(yc par1World, int par2, int par3, int par4) {
/* 262 */     return par1World.b(par2 - 1, par3, par4, true) ? true : (par1World.b(par2 + 1, par3, par4, true) ? true : (par1World.b(par2, par3, par4 - 1, true) ? true : (par1World.b(par2, par3, par4 + 1, true) ? true : canPlaceCandleOn(par1World, par2, par3 - 1, par4))));
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/* 267 */     return mod_Others.ToiletID;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlockToilet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */