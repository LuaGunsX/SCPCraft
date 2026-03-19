/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import SCPCraft.entities.SCPEntityMountableBlock;
/*     */ import SCPCraft.mod_Others;
/*     */ import SCPCraft.mod_SCP;
/*     */ import agi;
/*     */ import amq;
/*     */ import aoe;
/*     */ import java.util.List;
/*     */ import lq;
/*     */ import qx;
/*     */ import yc;
/*     */ import ym;
/*     */ 
/*     */ 
/*     */ public class SCPBlockStoneCoffin
/*     */   extends amq
/*     */ {
/*     */   public SCPBlockStoneCoffin(int par1, int par2) {
/*  20 */     super(par1, par2, agi.e);
/*  21 */     a(mod_SCP.tabBlockSCP);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(yc world, int i, int j, int k, qx entityplayer, int par6, float par7, float par8, float par9) {
/*  32 */     return onBlockActivated(world, i, j, k, entityplayer, 0.5F, 0.15F, 0.5F, 0, 0, 0, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean onBlockActivated(yc world, int i, int j, int k, qx entityplayer, float y) {
/*  38 */     return onBlockActivated(world, i, j, k, entityplayer, 0.5F, y, 0.5F, 0, 0, 0, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean onBlockActivated(yc world, int i, int j, int k, qx entityplayer, float x, float y, float z, int north, int south, int east, int west) {
/*  44 */     if (!world.I) {
/*     */ 
/*     */       
/*  47 */       List listEMB = world.a(SCPEntityMountableBlock.class, aoe.a(i, j, k, i + 1.0D, j + 1.0D, k + 1.0D).b(1.0D, 1.0D, 1.0D));
/*  48 */       for (SCPEntityMountableBlock entitytocheck : listEMB) {
/*     */ 
/*     */         
/*  51 */         if (entitytocheck.getOrgBlockPosX() == i && entitytocheck.getOrgBlockPosY() == j && entitytocheck.getOrgBlockPosZ() == k) {
/*     */           
/*  53 */           entitytocheck.a(entityplayer);
/*  54 */           return true;
/*     */         } 
/*     */       } 
/*     */       
/*  58 */       float mountingX = i + x;
/*  59 */       float mountingY = j + y;
/*  60 */       float mountingZ = k + z;
/*     */       
/*  62 */       if (north != south) {
/*     */         
/*  64 */         int md = world.h(i, j, k);
/*  65 */         if (md == east) {
/*     */           
/*  67 */           mountingX = (i + 1) - z;
/*  68 */           mountingZ = k + x;
/*     */         }
/*  70 */         else if (md == south) {
/*     */           
/*  72 */           mountingX = (i + 1) - x;
/*  73 */           mountingZ = (k + 1) - z;
/*     */         }
/*  75 */         else if (md == west) {
/*     */           
/*  77 */           mountingX = i + z;
/*  78 */           mountingZ = (k + 1) - x;
/*     */         } 
/*     */       } 
/*     */       
/*  82 */       SCPEntityMountableBlock nemb = new SCPEntityMountableBlock(world, entityplayer, i, j, k, mountingX, mountingY, mountingZ);
/*  83 */       world.d((lq)nemb);
/*  84 */       nemb.a(entityplayer);
/*  85 */       return true;
/*     */     } 
/*  87 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/*  92 */     return mod_Others.StoneCoffinID;
/*     */   }
/*     */ 
/*     */   
/*     */   public final boolean canThisPaneConnectToThisBlockID(int i) {
/*  97 */     return p[i] instanceof SCPBlockStoneCoffin;
/*     */   }
/*     */ 
/*     */   
/*     */   public aoe b_(yc world, int i, int j, int k) {
/* 102 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 103 */     return super.b_(world, i, j, k);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canRenderInPass(int pass) {
/* 108 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 113 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 118 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int n() {
/* 123 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ym par1World, int i, int j, int k) {
/* 129 */     boolean flag = canThisPaneConnectToThisBlockID(par1World.a(i, j, k - 1));
/* 130 */     boolean flag1 = canThisPaneConnectToThisBlockID(par1World.a(i - 1, j, k));
/* 131 */     boolean flag2 = canThisPaneConnectToThisBlockID(par1World.a(i + 1, j, k));
/* 132 */     boolean flag3 = canThisPaneConnectToThisBlockID(par1World.a(i, j, k + 1));
/*     */     
/* 134 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.15F, 1.0F);
/*     */     
/* 136 */     if (!flag1)
/* 137 */       if (!flag && !flag3) { a(0.0F, 0.15F, 0.15F, 0.15F, 1.0F, 0.85F); }
/* 138 */       else if (flag) { a(0.0F, 0.15F, 0.0F, 0.15F, 1.0F, 0.85F); }
/* 139 */       else if (flag3) { a(0.0F, 0.15F, 0.15F, 0.15F, 1.0F, 1.0F); }
/*     */        
/* 141 */     if (!flag2)
/* 142 */       if (!flag && !flag3) { a(0.85F, 0.15F, 0.15F, 1.0F, 1.0F, 0.85F); }
/* 143 */       else if (flag) { a(0.85F, 0.15F, 0.0F, 1.0F, 1.0F, 0.85F); }
/* 144 */       else if (flag3) { a(0.85F, 0.15F, 0.15F, 1.0F, 1.0F, 1.0F); }
/*     */        
/* 146 */     if (!flag) a(0.0F, 0.15F, 0.0F, 1.0F, 1.0F, 0.15F); 
/* 147 */     if (!flag3) a(0.0F, 0.15F, 0.85F, 1.0F, 1.0F, 1.0F);
/*     */   
/*     */   }
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, aoe par5AxisAlignedBB, List par6ArrayList, lq par7Entity) {
/* 152 */     boolean flag = canThisPaneConnectToThisBlockID(par1World.a(par2, par3, par4 - 1));
/* 153 */     boolean flag1 = canThisPaneConnectToThisBlockID(par1World.a(par2 - 1, par3, par4));
/* 154 */     boolean flag2 = canThisPaneConnectToThisBlockID(par1World.a(par2 + 1, par3, par4));
/* 155 */     boolean flag3 = canThisPaneConnectToThisBlockID(par1World.a(par2, par3, par4 + 1));
/*     */     
/* 157 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.15F, 1.0F);
/* 158 */     super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */ 
/*     */     
/* 161 */     if (!flag1) {
/* 162 */       if (!flag && !flag3) {
/* 163 */         a(0.0F, 0.15F, 0.15F, 0.15F, 1.0F, 0.85F);
/* 164 */         super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       }
/* 166 */       else if (flag) {
/* 167 */         a(0.0F, 0.15F, 0.0F, 0.15F, 1.0F, 0.85F);
/* 168 */         super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       }
/* 170 */       else if (flag3) {
/* 171 */         a(0.0F, 0.15F, 0.15F, 0.15F, 1.0F, 1.0F);
/* 172 */         super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       } 
/*     */     }
/* 175 */     if (!flag2) {
/* 176 */       if (!flag && !flag3) {
/* 177 */         a(0.85F, 0.15F, 0.15F, 1.0F, 1.0F, 0.85F);
/* 178 */         super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       }
/* 180 */       else if (flag) {
/* 181 */         a(0.85F, 0.15F, 0.0F, 1.0F, 1.0F, 0.85F);
/* 182 */         super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       }
/* 184 */       else if (flag3) {
/* 185 */         a(0.85F, 0.15F, 0.15F, 1.0F, 1.0F, 1.0F);
/* 186 */         super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */       } 
/*     */     }
/* 189 */     if (!flag) {
/* 190 */       a(0.0F, 0.15F, 0.0F, 1.0F, 1.0F, 0.15F);
/* 191 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */     } 
/* 193 */     if (!flag3) {
/* 194 */       a(0.0F, 0.15F, 0.85F, 1.0F, 1.0F, 1.0F);
/* 195 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlockStoneCoffin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */