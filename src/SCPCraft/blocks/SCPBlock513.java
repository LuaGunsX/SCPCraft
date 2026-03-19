/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import SCPCraft.entities.SCPEntity513;
/*     */ import SCPCraft.mod_Others;
/*     */ import SCPCraft.mod_SCP;
/*     */ import agi;
/*     */ import amq;
/*     */ import aoe;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import lq;
/*     */ import qx;
/*     */ import ur;
/*     */ import yc;
/*     */ import ym;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPBlock513
/*     */   extends amq
/*     */ {
/*     */   public SCPBlock513(int par1, int par2) {
/*  23 */     super(par1, par2, agi.g);
/*  24 */     a(mod_SCP.tabBlockSCP);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int par1, Random par2Random, int par3) {
/*  29 */     return mod_SCP.SCP513.cm;
/*     */   }
/*     */ 
/*     */   
/*     */   public aoe getSelectedBoundingBoxFromPool_do(yc world, int i, int j, int k) {
/*  34 */     a(0.25F, 0.0F, 0.35F, 0.75F, 0.6F, 0.66F);
/*  35 */     return b_(world, i, j, k);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ym world, int i, int j, int k) {
/*  41 */     a(0.25F, 0.0F, 0.35F, 0.75F, 0.6F, 0.66F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, aoe par5AxisAlignedBB, List par6ArrayList, lq par7Entity) {
/*  46 */     a(0.25F, 0.0F, 0.65F, 0.75F, 0.5F, 0.66F);
/*  47 */     super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*  48 */     a(0.25F, 0.0F, 0.35F, 0.75F, 0.5F, 0.36F);
/*  49 */     super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*  50 */     a(0.25F, 0.0F, 0.35F, 0.26F, 0.5F, 0.65F);
/*  51 */     super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*  52 */     a(0.74F, 0.0F, 0.35F, 0.75F, 0.5F, 0.65F);
/*  53 */     super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*  54 */     a(0.25F, 0.5F, 0.35F, 0.75F, 0.51F, 0.66F);
/*  55 */     super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*  56 */     a(0.42F, 0.51F, 0.49F, 0.58F, 0.6F, 0.52F);
/*  57 */     super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*  58 */     a(0.49F, 0.2F, 0.49F, 0.52F, 0.5F, 0.52F);
/*  59 */     super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*  60 */     a(0.47F, 0.1F, 0.47F, 0.54F, 0.2F, 0.54F);
/*  61 */     super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTextureFile() {
/*  66 */     return "/SCPCraft/textures/SCPblox.png";
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/*  71 */     return mod_Others.SCP513ID;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  76 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  81 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(yc par1World, int par2, int par3, int par4, qx par5EntityPlayer, int par6, float par7, float par8, float par9) {
/*  86 */     ur var1 = par5EntityPlayer.bJ.g();
/*     */     
/*  88 */     if (par5EntityPlayer != null && var1 == null) {
/*     */       
/*  90 */       par1World.a((lq)par5EntityPlayer, "sounds.cowbell", 1.0F, 1.0F);
/*     */       
/*  92 */       if (par5EntityPlayer instanceof iq) {
/*     */         
/*  94 */         SCPEntity513 dude = new SCPEntity513(par1World);
/*  95 */         dude.b(par2, par3, par4, 1.0F, 1.0F);
/*  96 */         par1World.d((lq)dude);
/*     */       } 
/*     */       
/*  99 */       return super.a(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9);
/*     */     } 
/*     */     
/* 102 */     if (par5EntityPlayer != null && var1 != null)
/*     */     {
/* 104 */       return super.a(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9);
/*     */     }
/* 106 */     return true;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlock513.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */