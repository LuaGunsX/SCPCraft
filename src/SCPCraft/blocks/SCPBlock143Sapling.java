/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import SCPCraft.worldgen.SCPWorldGen143;
/*     */ import abm;
/*     */ import aje;
/*     */ import amq;
/*     */ import java.util.Random;
/*     */ import qx;
/*     */ import up;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPBlock143Sapling
/*     */   extends aje
/*     */ {
/*     */   public SCPBlock143Sapling(int i, int j) {
/*  24 */     super(i, j);
/*  25 */     float f = 0.4F;
/*  26 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
/*  27 */     a(mod_SCP.tabBlockSCP);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTextureFile() {
/*  32 */     return "/SCPCraft/textures/SCPblox.png";
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean d_(int i) {
/*  37 */     return (i == amq.x.cm);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(yc world, int i, int j, int k, Random random) {
/*  43 */     if (world.I) {
/*     */       return;
/*     */     }
/*     */     
/*  47 */     super.b(world, i, j, k, random);
/*     */     
/*  49 */     if (world.m(i, j + 1, k) >= 9 && random.nextInt(7) == 0) {
/*     */       
/*  51 */       int l = world.h(i, j, k);
/*  52 */       if ((l & 0x8) == 0) {
/*     */         
/*  54 */         world.c(i, j, k, l | 0x8);
/*     */       } else {
/*     */         
/*  57 */         growTree(world, i, j, k, random);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int i, int j) {
/*  64 */     j &= 0x3;
/*  65 */     if (j == 1)
/*     */     {
/*  67 */       return this.cl;
/*     */     }
/*  69 */     if (j == 2)
/*     */     {
/*  71 */       return this.cl;
/*     */     }
/*     */ 
/*     */     
/*  75 */     return this.cl;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void growTree(yc world, int i, int j, int k, Random random) {
/*  81 */     int l = world.h(i, j, k) & 0x3;
/*  82 */     world.b(i, j, k, 0);
/*  83 */     Object obj = null;
/*  84 */     obj = new SCPWorldGen143();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 100 */     if (!((abm)obj).a(world, random, i, j, k))
/*     */     {
/* 102 */       world.c(i, j, k, this.cm, l);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(int i) {
/* 108 */     return i & 0x3;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(yc par1World, int par2, int par3, int par4, qx par5EntityPlayer, int par6, float par7, float par8, float par9) {
/* 113 */     ur itemstack = par5EntityPlayer.bJ.g();
/* 114 */     int i = par1World.h(par2, par3, par4);
/* 115 */     int j = i & 0x7;
/* 116 */     if (par1World.I)
/*     */     {
/* 118 */       return true;
/*     */     }
/*     */ 
/*     */     
/* 122 */     if (itemstack != null && itemstack.c == up.aW.cj)
/*     */     {
/*     */       
/* 125 */       if (itemstack.j() == 15)
/*     */       {
/* 127 */         ((SCPBlock143Sapling)mod_SCP.SCP143Sapling).growTree(par1World, par2, par3, par4, par1World.t);
/*     */       }
/*     */     }
/*     */     
/* 131 */     return true;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlock143Sapling.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */