/*     */ import SCPCraft.mod_SCP;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Random;
/*     */ import net.minecraftforge.common.ForgeDirection;
/*     */ import net.minecraftforge.common.IPlantable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ajq
/*     */   extends aje
/*     */ {
/*     */   protected ajq(int par1, int par2) {
/*  20 */     super(par1, par2);
/*  21 */     this.cl = par2;
/*  22 */     b(true);
/*  23 */     float var3 = 0.5F;
/*  24 */     a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.25F, 0.5F + var3);
/*  25 */     a((tj)null);
/*  26 */     c(0.0F);
/*  27 */     a(g);
/*  28 */     D();
/*  29 */     r();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean d_(int par1) {
/*  38 */     return (par1 == amq.aD.cm);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(yc par1World, int par2, int par3, int par4, Random par5Random) {
/*  46 */     super.b(par1World, par2, par3, par4, par5Random);
/*     */     
/*  48 */     if (par1World.m(par2, par3 + 1, par4) >= 9) {
/*     */       
/*  50 */       int var6 = par1World.h(par2, par3, par4);
/*     */       
/*  52 */       if (var6 < 7) {
/*     */         
/*  54 */         float var7 = l(par1World, par2, par3, par4);
/*     */         
/*  56 */         if (par5Random.nextInt((int)(25.0F / var7) + 1) == 0) {
/*     */           
/*  58 */           var6++;
/*  59 */           par1World.c(par2, par3, par4, var6);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c_(yc par1World, int par2, int par3, int par4) {
/*  70 */     par1World.c(par2, par3, par4, 7);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isWaterNearby(yc par1World, int par2, int par3, int par4) {
/*  76 */     for (int var5 = par2 - 4; var5 <= par2 + 4; var5++) {
/*     */       
/*  78 */       for (int var6 = par3 - 1; var6 <= par3; var6++) {
/*     */         
/*  80 */         for (int var7 = par4 - 4; var7 <= par4 + 4; var7++) {
/*     */           
/*  82 */           if (par1World.a(var5, var6, var7) == mod_SCP.SCP006Still.cm)
/*     */           {
/*  84 */             return true;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  90 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private float l(yc par1World, int par2, int par3, int par4) {
/* 101 */     float var5 = 1.0F;
/* 102 */     int var6 = par1World.a(par2, par3, par4 - 1);
/* 103 */     int var7 = par1World.a(par2, par3, par4 + 1);
/* 104 */     int var8 = par1World.a(par2 - 1, par3, par4);
/* 105 */     int var9 = par1World.a(par2 + 1, par3, par4);
/* 106 */     int var10 = par1World.a(par2 - 1, par3, par4 - 1);
/* 107 */     int var11 = par1World.a(par2 + 1, par3, par4 - 1);
/* 108 */     int var12 = par1World.a(par2 + 1, par3, par4 + 1);
/* 109 */     int var13 = par1World.a(par2 - 1, par3, par4 + 1);
/* 110 */     boolean var14 = (var8 == this.cm || var9 == this.cm);
/* 111 */     boolean var15 = (var6 == this.cm || var7 == this.cm);
/* 112 */     boolean var16 = (var10 == this.cm || var11 == this.cm || var12 == this.cm || var13 == this.cm);
/*     */     
/* 114 */     for (int var17 = par2 - 1; var17 <= par2 + 1; var17++) {
/*     */       
/* 116 */       for (int var18 = par4 - 1; var18 <= par4 + 1; var18++) {
/*     */         
/* 118 */         int var19 = par1World.a(var17, par3 - 1, var18);
/* 119 */         float var20 = 0.0F;
/*     */         
/* 121 */         if (p[var19] != null && p[var19].canSustainPlant(par1World, var17, par3 - 1, var18, ForgeDirection.UP, (IPlantable)this)) {
/*     */           
/* 123 */           var20 = 1.0F;
/*     */           
/* 125 */           if (p[var19].isFertile(par1World, var17, par3 - 1, var18))
/*     */           {
/* 127 */             var20 = 3.0F;
/*     */           }
/*     */           
/* 130 */           if (isWaterNearby(par1World, par2, par3, par4))
/*     */           {
/* 132 */             var20 = 30.0F;
/*     */           }
/*     */         } 
/*     */         
/* 136 */         if (var17 != par2 || var18 != par4)
/*     */         {
/* 138 */           var20 /= 4.0F;
/*     */         }
/*     */         
/* 141 */         var5 += var20;
/*     */       } 
/*     */     } 
/*     */     
/* 145 */     if (var16 || (var14 && var15))
/*     */     {
/* 147 */       var5 /= 2.0F;
/*     */     }
/*     */     
/* 150 */     return var5;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(int par1, int par2) {
/* 158 */     if (par2 < 0)
/*     */     {
/* 160 */       par2 = 7;
/*     */     }
/*     */     
/* 163 */     return this.cl + par2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int d() {
/* 171 */     return 6;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int h() {
/* 179 */     return up.S.cj;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int j() {
/* 187 */     return up.T.cj;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, int par5, float par6, int par7) {
/* 195 */     super.a(par1World, par2, par3, par4, par5, par6, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ArrayList getBlockDropped(yc world, int x, int y, int z, int metadata, int fortune) {
/* 201 */     ArrayList<ur> ret = super.getBlockDropped(world, x, y, z, metadata, fortune);
/*     */     
/* 203 */     if (metadata >= 7)
/*     */     {
/* 205 */       for (int n = 0; n < 3 + fortune; n++) {
/*     */         
/* 207 */         if (world.t.nextInt(15) <= metadata)
/*     */         {
/* 209 */           ret.add(new ur(h(), 1, 0));
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 214 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(int par1, Random par2Random, int par3) {
/* 222 */     return (par1 == 7) ? j() : h();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(Random par1Random) {
/* 230 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int a(yc par1World, int par2, int par3, int par4) {
/* 240 */     return h();
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/ajq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */