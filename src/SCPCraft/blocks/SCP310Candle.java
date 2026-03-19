/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import SCPCraft.mod_Others;
/*     */ import SCPCraft.mod_SCP;
/*     */ import agi;
/*     */ import amq;
/*     */ import aoe;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import lq;
/*     */ import qx;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ public class SCP310Candle
/*     */   extends amq
/*     */ {
/*     */   public SCP310Candle(int par1, int j) {
/*  19 */     super(par1, j, agi.q);
/*  20 */     b(true);
/*  21 */     a(mod_SCP.tabBlockSCP);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTextureFile() {
/*  26 */     return "/SCPCraft/textures/SCPblox.png";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  31 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, aoe par5AxisAlignedBB, List par6ArrayList, lq par7Entity) {
/*  36 */     a(0.4F, 0.2F, 0.4F, 0.6F, 0.5F, 0.6F);
/*  37 */     super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*  38 */     a(0.3F, 0.0F, 0.3F, 0.7F, 0.2F, 0.7F);
/*  39 */     super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(yc par1World, int par2, int par3, int par4, Random par5Random) {
/*  44 */     int var6 = 0;
/*     */     
/*     */     int var7;
/*     */     
/*  48 */     for (var7 = 0; var7 < 7; var7++) {
/*     */       
/*  50 */       par2 += par5Random.nextInt(3) - 1;
/*  51 */       par3++;
/*  52 */       par4 += par5Random.nextInt(3) - 1;
/*  53 */       int var8 = par1World.a(par2, par3, par4);
/*     */       
/*  55 */       if (var8 == 0) {
/*     */         
/*  57 */         if (isFlammable(par1World, par2 - 1, par3, par4) || isFlammable(par1World, par2 + 1, par3, par4) || isFlammable(par1World, par2, par3, par4 - 1) || isFlammable(par1World, par2, par3, par4 + 1) || isFlammable(par1World, par2, par3 - 1, par4) || isFlammable(par1World, par2, par3 + 1, par4)) {
/*     */           
/*  59 */           par1World.e(par2, par3, par4, mod_SCP.SCP310Fire.cm);
/*     */           
/*     */           return;
/*     */         } 
/*  63 */       } else if ((amq.p[var8]).cB.c()) {
/*     */         return;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/*  69 */     if (var6 == 0) {
/*     */       
/*  71 */       var7 = par2;
/*  72 */       int var8 = par4;
/*     */       
/*  74 */       for (int var9 = 0; var9 < 3; var9++) {
/*     */         
/*  76 */         par2 = var7 + par5Random.nextInt(3) - 1;
/*  77 */         par4 = var8 + par5Random.nextInt(3) - 1;
/*     */         
/*  79 */         if (par1World.c(par2, par3 + 1, par4) && isFlammable(par1World, par2, par3, par4))
/*     */         {
/*  81 */           par1World.e(par2, par3 + 1, par4, mod_SCP.SCP310Fire.cm);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean isFlammable(yc par1World, int par2, int par3, int par4) {
/*  89 */     return par1World.g(par2, par3, par4).h();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  97 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean canPlaceCandleOn(yc par1World, int par2, int par3, int par4) {
/* 102 */     if (par1World.v(par2, par3, par4))
/*     */     {
/* 104 */       return true;
/*     */     }
/*     */ 
/*     */     
/* 108 */     int var5 = par1World.a(par2, par3, par4);
/* 109 */     return (var5 == amq.P.cm || var5 == amq.aP.cm || var5 == amq.aN.cm || var5 == this.cm);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(yc par1World, int par2, int par3, int par4) {
/* 115 */     return par1World.b(par2 - 1, par3, par4, true) ? true : (par1World.b(par2 + 1, par3, par4, true) ? true : (par1World.b(par2, par3, par4 - 1, true) ? true : (par1World.b(par2, par3, par4 + 1, true) ? true : canPlaceCandleOn(par1World, par2, par3 - 1, par4))));
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/* 120 */     return mod_Others.SCP310ID;
/*     */   }
/*     */ 
/*     */   
/*     */   public int r_() {
/* 125 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, Random par5Random) {
/* 130 */     double var7 = (par2 + 0.5F);
/* 131 */     double var9 = (par3 + 0.65F);
/* 132 */     double var11 = (par4 + 0.5F);
/* 133 */     par1World.a("smoke", var7, var9, var11, 0.0D, 0.0D, 0.0D);
/* 134 */     par1World.a("flame", var7, var9, var11, 0.0D, 0.0D, 0.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(yc var1, int var2, int var3, int var4, qx var5, int var6, float var7, float var8, float var9) {
/* 139 */     var1.b(var2 + 1, var3 - 1, var4, mod_SCP.SCP310Fire.cm);
/* 140 */     var1.b(var2 - 1, var3 - 1, var4, mod_SCP.SCP310Fire.cm);
/* 141 */     var1.b(var2, var3 - 1, var4 + 1, mod_SCP.SCP310Fire.cm);
/* 142 */     var1.b(var2, var3 - 1, var4 - 1, mod_SCP.SCP310Fire.cm);
/* 143 */     return true;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCP310Candle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */