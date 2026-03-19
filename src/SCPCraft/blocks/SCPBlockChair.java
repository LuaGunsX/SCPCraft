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
/*     */ public class SCPBlockChair
/*     */   extends amq
/*     */ {
/*     */   public SCPBlockChair(int par1, int par2, agi mat) {
/*  22 */     super(par1, par2, mat);
/*  23 */     a(mod_SCP.tabBlockSCP);
/*     */   }
/*     */ 
/*     */   
/*     */   public final boolean canThisPaneConnectToThisBlockID(int i) {
/*  28 */     return p[i] instanceof SCPBlockChair;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ym par1IBlockAccess, int par2, int par3, int par4) {
/*  33 */     a(0.1F, 0.0F, 0.1F, 0.9F, 1.5F, 0.9F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, md par5EntityLiving) {
/*  39 */     int i = ke.c((par5EntityLiving.z * 4.0F / 360.0F) + 0.5D) & 0x3;
/*  40 */     int j = par1World.h(par2, par3, par4) & 0xC;
/*     */     
/*  42 */     if (i == 0) {
/*     */       
/*  44 */       par1World.c(par2, par3, par4, 0x1 | j);
/*     */     }
/*  46 */     else if (i == 1) {
/*     */       
/*  48 */       par1World.c(par2, par3, par4, 0x0 | j);
/*     */     }
/*  50 */     else if (i == 2) {
/*     */       
/*  52 */       par1World.c(par2, par3, par4, 0x3 | j);
/*     */     }
/*  54 */     else if (i == 3) {
/*     */       
/*  56 */       par1World.c(par2, par3, par4, 0x2 | j);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, aoe par5AxisAlignedBB, List par6ArrayList, lq par7Entity) {
/*  63 */     int j = par1World.h(par2, par3, par4) & 0x3;
/*     */     
/*  65 */     a(0.1F, 0.5F, 0.1F, 0.9F, 0.6F, 0.9F);
/*  66 */     super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*  67 */     if (j == 0) {
/*  68 */       a(0.1F, 0.6F, 0.1F, 0.2F, 1.5F, 0.9F);
/*  69 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */     } 
/*  71 */     if (j == 1) {
/*  72 */       a(0.1F, 0.6F, 0.7F, 0.9F, 1.5F, 0.9F);
/*  73 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */     } 
/*  75 */     if (j == 3) {
/*  76 */       a(0.1F, 0.6F, 0.1F, 0.9F, 1.5F, 0.2F);
/*  77 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */     } 
/*  79 */     if (j == 2) {
/*  80 */       a(0.7F, 0.6F, 0.1F, 0.9F, 1.5F, 0.9F);
/*  81 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(yc world, int i, int j, int k, qx entityplayer, int par6, float par7, float par8, float par9) {
/*  88 */     return onBlockActivated(world, i, j, k, entityplayer, 0.5F, 0.5F, 0.5F, 0, 0, 0, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean onBlockActivated(yc world, int i, int j, int k, qx entityplayer, float y) {
/*  94 */     return onBlockActivated(world, i, j, k, entityplayer, 0.5F, y, 0.5F, 0, 0, 0, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean onBlockActivated(yc world, int i, int j, int k, qx entityplayer, float x, float y, float z, int north, int south, int east, int west) {
/* 100 */     if (!world.I) {
/*     */ 
/*     */       
/* 103 */       List listEMB = world.a(SCPEntityMountableBlock.class, aoe.a(i, j, k, i + 1.0D, j + 1.0D, k + 1.0D).b(1.0D, 1.0D, 1.0D));
/* 104 */       for (SCPEntityMountableBlock entitytocheck : listEMB) {
/*     */ 
/*     */         
/* 107 */         if (entitytocheck.getOrgBlockPosX() == i && entitytocheck.getOrgBlockPosY() == j && entitytocheck.getOrgBlockPosZ() == k) {
/*     */           
/* 109 */           entitytocheck.a(entityplayer);
/* 110 */           return true;
/*     */         } 
/*     */       } 
/*     */       
/* 114 */       float mountingX = i + x;
/* 115 */       float mountingY = j + y;
/* 116 */       float mountingZ = k + z;
/*     */       
/* 118 */       if (north != south) {
/*     */         
/* 120 */         int md = world.h(i, j, k);
/* 121 */         if (md == east) {
/*     */           
/* 123 */           mountingX = (i + 1) - z;
/* 124 */           mountingZ = k + x;
/*     */         }
/* 126 */         else if (md == south) {
/*     */           
/* 128 */           mountingX = (i + 1) - x;
/* 129 */           mountingZ = (k + 1) - z;
/*     */         }
/* 131 */         else if (md == west) {
/*     */           
/* 133 */           mountingX = i + z;
/* 134 */           mountingZ = (k + 1) - x;
/*     */         } 
/*     */       } 
/*     */       
/* 138 */       SCPEntityMountableBlock nemb = new SCPEntityMountableBlock(world, entityplayer, i, j, k, mountingX, mountingY, mountingZ);
/* 139 */       world.d((lq)nemb);
/* 140 */       nemb.a(entityplayer);
/* 141 */       return true;
/*     */     } 
/* 143 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ym par1IBlockAccess, int par2, int par3, int par4, int par5) {
/* 148 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 153 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int n() {
/* 158 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 163 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/* 168 */     return mod_Others.ChairID;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlockChair.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */