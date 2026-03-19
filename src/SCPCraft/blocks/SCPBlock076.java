/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import SCPCraft.mod_Others;
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
/*     */ public class SCPBlock076
/*     */   extends akb
/*     */ {
/*     */   private Class SCPEntity076Class;
/*     */   
/*     */   public SCPBlock076(int i, int j, Class tClass) {
/*  25 */     super(i, agi.e);
/*  26 */     this.cl = 43;
/*  27 */     this.SCPEntity076Class = tClass;
/*  28 */     a(mod_SCP.tabBlockSCP);
/*  29 */     a(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  34 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int n() {
/*  39 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canRenderInPass(int pass) {
/*  44 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ym par1IBlockAccess, int par2, int par3, int par4, int par5) {
/*  49 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ym world, int i, int j, int k) {
/*  55 */     a(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, aoe par5AxisAlignedBB, List par6ArrayList, lq par7Entity) {
/*  60 */     a(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F);
/*  61 */     super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTextureFile() {
/*  66 */     return "/SCPCraft/textures/SCPblox.png";
/*     */   }
/*     */ 
/*     */   
/*     */   public void g(yc par1World, int par2, int par3, int par4) {
/*  71 */     super.g(par1World, par2, par3, par4);
/*  72 */     setDefaultDirection(par1World, par2, par3, par4);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, md par5EntityLiving) {
/*  77 */     int var6 = ke.c((par5EntityLiving.z * 4.0F / 360.0F) + 2.5D) & 0x3;
/*  78 */     par1World.c(par2, par3, par4, var6);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setDefaultDirection(yc par1World, int par2, int par3, int par4) {
/*  83 */     if (par1World.I) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  88 */     int i = par1World.a(par2, par3, par4 - 1);
/*  89 */     int j = par1World.a(par2, par3, par4 + 1);
/*  90 */     int k = par1World.a(par2 - 1, par3, par4);
/*  91 */     int l = par1World.a(par2 + 1, par3, par4);
/*  92 */     byte byte0 = 3;
/*     */     
/*  94 */     if (amq.q[i] && !amq.q[j])
/*     */     {
/*  96 */       byte0 = 3;
/*     */     }
/*     */     
/*  99 */     if (amq.q[j] && !amq.q[i])
/*     */     {
/* 101 */       byte0 = 2;
/*     */     }
/*     */     
/* 104 */     if (amq.q[k] && !amq.q[l])
/*     */     {
/* 106 */       byte0 = 5;
/*     */     }
/*     */     
/* 109 */     if (amq.q[l] && !amq.q[k])
/*     */     {
/* 111 */       byte0 = 4;
/*     */     }
/*     */     
/* 114 */     par1World.c(par2, par3, par4, byte0);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int i, Random random, int j) {
/* 119 */     return mod_SCP.SCP076.cm;
/*     */   }
/*     */ 
/*     */   
/*     */   public int quanityDropped(Random random) {
/* 124 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/* 129 */     return mod_Others.SCP076ID;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 134 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public any a(yc var1) {
/*     */     try {
/* 141 */       return this.SCPEntity076Class.newInstance();
/*     */     }
/* 143 */     catch (Exception exception) {
/*     */       
/* 145 */       throw new RuntimeException(exception);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlock076.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */