/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import amq;
/*     */ import ke;
/*     */ import qx;
/*     */ import up;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public class SCPItemPoster
/*     */   extends up
/*     */ {
/*     */   public SCPItemPoster(int par1) {
/*  15 */     super(par1);
/*  16 */     a(mod_SCP.tabItemSCP);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/*  25 */     int l = determineOrientation(par3World, par4, par5, par6, par2EntityPlayer);
/*  26 */     if (par3World.a(par4, par5, par6) != amq.aV.cm) {
/*     */       
/*  28 */       if (par7 == 0)
/*     */       {
/*  30 */         par5--;
/*     */       }
/*     */       
/*  33 */       if (par7 == 1)
/*     */       {
/*  35 */         par5++;
/*     */       }
/*     */       
/*  38 */       if (par7 == 2)
/*     */       {
/*  40 */         par6--;
/*     */       }
/*     */       
/*  43 */       if (par7 == 3)
/*     */       {
/*  45 */         par6++;
/*     */       }
/*     */       
/*  48 */       if (par7 == 4)
/*     */       {
/*  50 */         par4--;
/*     */       }
/*     */       
/*  53 */       if (par7 == 5)
/*     */       {
/*  55 */         par4++;
/*     */       }
/*     */       
/*  58 */       if (!par3World.c(par4, par5, par6))
/*     */       {
/*  60 */         return false;
/*     */       }
/*     */     } 
/*     */     
/*  64 */     if (!par2EntityPlayer.a(par4, par5, par6, par7, par1ItemStack))
/*     */     {
/*  66 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  70 */     if (mod_SCP.Poster.b(par3World, par4, par5, par6) && l == 5) {
/*     */       
/*  72 */       par1ItemStack.a--;
/*  73 */       par3World.d(par4, par5, par6, mod_SCP.Poster.cm, 0);
/*     */     }
/*  75 */     else if (mod_SCP.Poster.b(par3World, par4, par5, par6) && l == 4) {
/*     */       
/*  77 */       par1ItemStack.a--;
/*  78 */       par3World.d(par4, par5, par6, mod_SCP.Poster.cm, 1);
/*     */     }
/*  80 */     else if (mod_SCP.Poster.b(par3World, par4, par5, par6) && l == 3) {
/*     */       
/*  82 */       par1ItemStack.a--;
/*  83 */       par3World.d(par4, par5, par6, mod_SCP.Poster.cm, 2);
/*     */     }
/*  85 */     else if (mod_SCP.Poster.b(par3World, par4, par5, par6) && l == 2) {
/*     */       
/*  87 */       par1ItemStack.a--;
/*  88 */       par3World.d(par4, par5, par6, mod_SCP.Poster.cm, 3);
/*     */     } 
/*  90 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static int determineOrientation(yc par0World, int par1, int par2, int par3, qx par4EntityPlayer) {
/*  96 */     if (ke.e((float)par4EntityPlayer.t - par1) < 2.0F && ke.e((float)par4EntityPlayer.v - par3) < 2.0F) {
/*     */       
/*  98 */       double d = par4EntityPlayer.u + 1.82D - par4EntityPlayer.M;
/*     */       
/* 100 */       if (d - par2 > 2.0D)
/*     */       {
/* 102 */         return 1;
/*     */       }
/*     */       
/* 105 */       if (par2 - d > 0.0D)
/*     */       {
/* 107 */         return 0;
/*     */       }
/*     */     } 
/*     */     
/* 111 */     int i = ke.c((par4EntityPlayer.z * 4.0F / 360.0F) + 0.5D) & 0x3;
/*     */     
/* 113 */     if (i == 0)
/*     */     {
/* 115 */       return 2;
/*     */     }
/*     */     
/* 118 */     if (i == 1)
/*     */     {
/* 120 */       return 5;
/*     */     }
/*     */     
/* 123 */     if (i == 2)
/*     */     {
/* 125 */       return 3;
/*     */     }
/*     */     
/* 128 */     return (i != 3) ? 0 : 4;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTextureFile() {
/* 133 */     return "/SCPCraft/textures/SCPItems.png";
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItemPoster.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */