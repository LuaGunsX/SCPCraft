/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import agi;
/*     */ import akb;
/*     */ import amq;
/*     */ import any;
/*     */ import aoe;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import ke;
/*     */ import lq;
/*     */ import md;
/*     */ import yc;
/*     */ import ym;
/*     */ 
/*     */ 
/*     */ public class SCPBlock019
/*     */   extends akb
/*     */ {
/*     */   private Class SCPEntity019Class;
/*     */   
/*     */   public SCPBlock019(int i, Class tClass) {
/*  24 */     super(i, agi.e);
/*  25 */     this.cl = 21;
/*  26 */     a(-0.06F, 0.0F, 0.26F, 1.05F, 1.62F, 0.75F);
/*  27 */     this.SCPEntity019Class = tClass;
/*     */   }
/*     */ 
/*     */   
/*     */   public aoe getSelectedBoundingBoxFromPool_do(yc world, int i, int j, int k) {
/*  32 */     int l = world.h(i, j, k);
/*  33 */     if (l == 0 || l == 2) a(-0.06F, 0.0F, 0.26F, 1.05F, 1.62F, 0.75F); 
/*  34 */     if (l == 1 || l == 3) a(0.26F, 0.0F, -0.06F, 0.75F, 1.62F, 1.05F); 
/*  35 */     return b_(world, i, j, k);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ym world, int i, int j, int k) {
/*  41 */     int l = world.h(i, j, k);
/*  42 */     if (l == 0 || l == 2) a(-0.06F, 0.0F, 0.26F, 1.05F, 1.62F, 0.75F); 
/*  43 */     if (l == 1 || l == 3) a(0.26F, 0.0F, -0.06F, 0.75F, 1.62F, 1.05F);
/*     */   
/*     */   }
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, aoe par5AxisAlignedBB, List par6ArrayList, lq par7Entity) {
/*  48 */     int i = par1World.h(par2, par3, par4);
/*  49 */     if (i == 0 || i == 2) a(-0.06F, 0.0F, 0.26F, 1.05F, 1.62F, 0.75F); 
/*  50 */     if (i == 1 || i == 3) a(0.26F, 0.0F, -0.06F, 0.75F, 1.62F, 1.05F); 
/*  51 */     super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void g(yc par1World, int par2, int par3, int par4) {
/*  56 */     super.g(par1World, par2, par3, par4);
/*  57 */     setDefaultDirection(par1World, par2, par3, par4);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, md par5EntityLiving) {
/*  62 */     int var6 = ke.c((par5EntityLiving.z * 4.0F / 360.0F) + 2.5D) & 0x3;
/*  63 */     par1World.c(par2, par3, par4, var6);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setDefaultDirection(yc par1World, int par2, int par3, int par4) {
/*  68 */     if (par1World.I) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  73 */     int i = par1World.a(par2, par3, par4 - 1);
/*  74 */     int j = par1World.a(par2, par3, par4 + 1);
/*  75 */     int k = par1World.a(par2 - 1, par3, par4);
/*  76 */     int l = par1World.a(par2 + 1, par3, par4);
/*  77 */     byte byte0 = 3;
/*     */     
/*  79 */     if (amq.q[i] && !amq.q[j])
/*     */     {
/*  81 */       byte0 = 3;
/*     */     }
/*     */     
/*  84 */     if (amq.q[j] && !amq.q[i])
/*     */     {
/*  86 */       byte0 = 2;
/*     */     }
/*     */     
/*  89 */     if (amq.q[k] && !amq.q[l])
/*     */     {
/*  91 */       byte0 = 5;
/*     */     }
/*     */     
/*  94 */     if (amq.q[l] && !amq.q[k])
/*     */     {
/*  96 */       byte0 = 4;
/*     */     }
/*     */     
/*  99 */     par1World.c(par2, par3, par4, byte0);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int i, Random random, int j) {
/* 104 */     return mod_SCP.Item019.cj;
/*     */   }
/*     */ 
/*     */   
/*     */   public int quanityDropped(Random random) {
/* 109 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/* 114 */     return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 119 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTextureFile() {
/* 124 */     return "/SCPCraft/textures/SCPblox.png";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 129 */     return false;
/*     */   }
/*     */   
/*     */   public int a(yc par1World, int par2, int par3, int par4) {
/* 133 */     return mod_SCP.Item019.cj;
/*     */   }
/*     */ 
/*     */   
/*     */   public any a(yc var1) {
/*     */     try {
/* 139 */       return this.SCPEntity019Class.newInstance();
/*     */     }
/* 141 */     catch (Exception exception) {
/* 142 */       throw new RuntimeException(exception);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlock019.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */