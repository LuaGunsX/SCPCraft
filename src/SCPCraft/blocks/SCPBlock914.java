/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import SCPCraft.tileentities.SCPTileEntity914;
/*     */ import agi;
/*     */ import akb;
/*     */ import any;
/*     */ import bq;
/*     */ import java.util.Random;
/*     */ import lq;
/*     */ import px;
/*     */ import qx;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public class SCPBlock914 extends akb {
/*     */   private Random furnaceRand;
/*     */   
/*     */   public SCPBlock914(int par1, boolean par2) {
/*  20 */     super(par1, agi.e);
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
/*  36 */     this.furnaceRand = new Random();
/*     */     a(mod_SCP.tabBlockSCP);
/*     */   } public void a(yc par1World, int par2, int par3, int par4, int par5, int par6) {
/*  39 */     SCPTileEntity914 var7 = (SCPTileEntity914)par1World.q(par2, par3, par4);
/*  40 */     if (var7 != null)
/*     */     {
/*  42 */       for (int var8 = 0; var8 < var7.k_(); var8++) {
/*     */         
/*  44 */         ur var9 = var7.a(var8);
/*     */         
/*  46 */         if (var9 != null) {
/*     */           
/*  48 */           float var10 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
/*  49 */           float var11 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
/*  50 */           float var12 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
/*     */           
/*  52 */           while (var9.a > 0) {
/*     */             
/*  54 */             int var13 = this.furnaceRand.nextInt(21) + 10;
/*     */             
/*  56 */             if (var13 > var9.a)
/*     */             {
/*  58 */               var13 = var9.a;
/*     */             }
/*     */             
/*  61 */             var9.a -= var13;
/*  62 */             px var14 = new px(par1World, (par2 + var10), (par3 + var11), (par4 + var12), new ur(var9.c, var13, var9.j()));
/*     */             
/*  64 */             if (var9.o())
/*     */             {
/*  66 */               var14.d().d((bq)var9.p().b());
/*     */             }
/*     */             
/*  69 */             float var15 = 0.05F;
/*  70 */             var14.w = ((float)this.furnaceRand.nextGaussian() * var15);
/*  71 */             var14.x = ((float)this.furnaceRand.nextGaussian() * var15 + 0.2F);
/*  72 */             var14.y = ((float)this.furnaceRand.nextGaussian() * var15);
/*  73 */             par1World.d((lq)var14);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*  79 */     super.a(par1World, par2, par3, par4, par5, par6);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTextureFile() {
/*     */     return "/SCPCraft/textures/SCPblox.png";
/*     */   }
/*     */   
/*     */   public boolean a(yc var1, int var2, int var3, int var4, qx var5, int var6, float var7, float var8, float var9) {
/*  88 */     any tileEntity = var1.q(var2, var3, var4);
/*     */     
/*  90 */     if (tileEntity == null || var5.ah())
/*     */     {
/*  92 */       return false;
/*     */     }
/*     */     
/*  95 */     var5.openGui(mod_SCP.instance, 0, var1, var2, var3, var4);
/*  96 */     return true;
/*     */   }
/*     */   
/*     */   public int a(int par1, Random par2Random, int par3) {
/*     */     return 0;
/*     */   }
/*     */   
/*     */   public any a(yc var1) {
/* 104 */     return (any)new SCPTileEntity914();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(int i, int j) {
/* 110 */     if (i == 0)
/*     */     {
/* 112 */       return 21;
/*     */     }
/* 114 */     if (i == 1)
/*     */     {
/* 116 */       return 21;
/*     */     }
/* 118 */     if (i == 2)
/*     */     {
/* 120 */       return 6;
/*     */     }
/* 122 */     if (i == 3)
/*     */     {
/* 124 */       return 6;
/*     */     }
/* 126 */     if (i == 4)
/*     */     {
/* 128 */       return 6;
/*     */     }
/* 130 */     if (i == 5)
/*     */     {
/* 132 */       return 6;
/*     */     }
/* 134 */     if (j == 1)
/*     */     {
/* 136 */       return 166;
/*     */     }
/*     */     
/* 139 */     return (j != 2) ? 20 : 177;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlock914.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */