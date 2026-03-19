/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import SCPCraft.mod_Others;
/*     */ import SCPCraft.mod_SCP;
/*     */ import agi;
/*     */ import amq;
/*     */ import aoe;
/*     */ import aoh;
/*     */ import aoj;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Random;
/*     */ import qx;
/*     */ import yc;
/*     */ import ym;
/*     */ 
/*     */ 
/*     */ public class SCPBlockCorrodedDoor
/*     */   extends amq
/*     */ {
/*     */   public SCPBlockCorrodedDoor(int par1, agi par2Material) {
/*  22 */     super(par1, par2Material);
/*  23 */     this.cl = 64;
/*     */     
/*  25 */     float var3 = 0.5F;
/*  26 */     float var4 = 1.0F;
/*  27 */     a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var4, 0.5F + var3);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTextureFile() {
/*  32 */     return "/SCPCraft/textures/SCPblox.png";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int d(ym par1IBlockAccess, int par2, int par3, int par4, int par5) {
/*  42 */     if (par5 != 0 && par5 != 1) {
/*     */       
/*  44 */       int var6 = getFullMetadata(par1IBlockAccess, par2, par3, par4);
/*  45 */       int var7 = this.cl;
/*     */       
/*  47 */       if ((var6 & 0x8) != 0)
/*     */       {
/*  49 */         var7 -= 16;
/*     */       }
/*     */       
/*  52 */       int var8 = var6 & 0x3;
/*  53 */       boolean var9 = ((var6 & 0x4) != 0);
/*     */       
/*  55 */       if (var9) {
/*     */         
/*  57 */         if (var8 == 0 && par5 == 2)
/*     */         {
/*  59 */           var7 = -var7;
/*     */         }
/*  61 */         else if (var8 == 1 && par5 == 5)
/*     */         {
/*  63 */           var7 = -var7;
/*     */         }
/*  65 */         else if (var8 == 2 && par5 == 3)
/*     */         {
/*  67 */           var7 = -var7;
/*     */         }
/*  69 */         else if (var8 == 3 && par5 == 4)
/*     */         {
/*  71 */           var7 = -var7;
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/*  76 */         if (var8 == 0 && par5 == 5) {
/*     */           
/*  78 */           var7 = -var7;
/*     */         }
/*  80 */         else if (var8 == 1 && par5 == 3) {
/*     */           
/*  82 */           var7 = -var7;
/*     */         }
/*  84 */         else if (var8 == 2 && par5 == 4) {
/*     */           
/*  86 */           var7 = -var7;
/*     */         }
/*  88 */         else if (var8 == 3 && par5 == 2) {
/*     */           
/*  90 */           var7 = -var7;
/*     */         } 
/*     */         
/*  93 */         if ((var6 & 0x10) != 0)
/*     */         {
/*  95 */           var7 = -var7;
/*     */         }
/*     */       } 
/*     */       
/*  99 */       return var7;
/*     */     } 
/*     */ 
/*     */     
/* 103 */     return this.cl;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 113 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(ym par1IBlockAccess, int par2, int par3, int par4) {
/* 118 */     int var5 = getFullMetadata(par1IBlockAccess, par2, par3, par4);
/* 119 */     return ((var5 & 0x4) != 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 127 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int d() {
/* 135 */     return mod_Others.CorrodedDoorID;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public aoe b_(yc par1World, int par2, int par3, int par4) {
/* 145 */     a((ym)par1World, par2, par3, par4);
/* 146 */     return super.b_(par1World, par2, par3, par4);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public aoe e(yc par1World, int par2, int par3, int par4) {
/* 155 */     a((ym)par1World, par2, par3, par4);
/* 156 */     return super.e(par1World, par2, par3, par4);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ym par1IBlockAccess, int par2, int par3, int par4) {
/* 164 */     setDoorRotation(getFullMetadata(par1IBlockAccess, par2, par3, par4));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDoorOrientation(ym par1IBlockAccess, int par2, int par3, int par4) {
/* 172 */     return getFullMetadata(par1IBlockAccess, par2, par3, par4) & 0x3;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isDoorOpen(ym par1IBlockAccess, int par2, int par3, int par4) {
/* 177 */     return ((getFullMetadata(par1IBlockAccess, par2, par3, par4) & 0x4) != 0);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setDoorRotation(int par1) {
/* 182 */     float var2 = 0.1875F;
/* 183 */     a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
/* 184 */     int var3 = par1 & 0x3;
/* 185 */     boolean var4 = ((par1 & 0x4) != 0);
/* 186 */     boolean var5 = ((par1 & 0x10) != 0);
/*     */     
/* 188 */     if (var3 == 0) {
/*     */       
/* 190 */       if (var4) {
/*     */         
/* 192 */         if (!var5)
/*     */         {
/* 194 */           a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var2);
/*     */         }
/*     */         else
/*     */         {
/* 198 */           a(0.0F, 0.0F, 1.0F - var2, 1.0F, 1.0F, 1.0F);
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 203 */         a(0.0F, 0.0F, 0.0F, var2, 1.0F, 1.0F);
/*     */       }
/*     */     
/* 206 */     } else if (var3 == 1) {
/*     */       
/* 208 */       if (var4) {
/*     */         
/* 210 */         if (!var5)
/*     */         {
/* 212 */           a(1.0F - var2, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */         }
/*     */         else
/*     */         {
/* 216 */           a(0.0F, 0.0F, 0.0F, var2, 1.0F, 1.0F);
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 221 */         a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var2);
/*     */       }
/*     */     
/* 224 */     } else if (var3 == 2) {
/*     */       
/* 226 */       if (var4) {
/*     */         
/* 228 */         if (!var5)
/*     */         {
/* 230 */           a(0.0F, 0.0F, 1.0F - var2, 1.0F, 1.0F, 1.0F);
/*     */         }
/*     */         else
/*     */         {
/* 234 */           a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var2);
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 239 */         a(1.0F - var2, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */       }
/*     */     
/* 242 */     } else if (var3 == 3) {
/*     */       
/* 244 */       if (var4) {
/*     */         
/* 246 */         if (!var5)
/*     */         {
/* 248 */           a(0.0F, 0.0F, 0.0F, var2, 1.0F, 1.0F);
/*     */         }
/*     */         else
/*     */         {
/* 252 */           a(1.0F - var2, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 257 */         a(0.0F, 0.0F, 1.0F - var2, 1.0F, 1.0F, 1.0F);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, qx par5EntityPlayer) {
/* 267 */     a(par1World, par2, par3, par4, par5EntityPlayer, 0, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(yc par1World, int par2, int par3, int par4, qx par5EntityPlayer, int par6, float par7, float par8, float par9) {
/* 275 */     if (this.cB == agi.f)
/*     */     {
/* 277 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 281 */     int var10 = getFullMetadata((ym)par1World, par2, par3, par4);
/* 282 */     int var11 = var10 & 0x7;
/* 283 */     var11 ^= 0x4;
/*     */     
/* 285 */     if ((var10 & 0x8) == 0) {
/*     */       
/* 287 */       par1World.c(par2, par3, par4, var11);
/* 288 */       par1World.e(par2, par3, par4, par2, par3, par4);
/*     */     }
/*     */     else {
/*     */       
/* 292 */       par1World.c(par2, par3 - 1, par4, var11);
/* 293 */       par1World.e(par2, par3 - 1, par4, par2, par3, par4);
/*     */     } 
/*     */     
/* 296 */     par1World.a(par5EntityPlayer, 1003, par2, par3, par4, 0);
/* 297 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onPoweredBlockChange(yc par1World, int par2, int par3, int par4, boolean par5) {
/* 306 */     int var6 = getFullMetadata((ym)par1World, par2, par3, par4);
/* 307 */     boolean var7 = ((var6 & 0x4) != 0);
/*     */     
/* 309 */     if (var7 != par5) {
/*     */       
/* 311 */       int var8 = var6 & 0x7;
/* 312 */       var8 ^= 0x4;
/*     */       
/* 314 */       if ((var6 & 0x8) == 0) {
/*     */         
/* 316 */         par1World.c(par2, par3, par4, var8);
/* 317 */         par1World.e(par2, par3, par4, par2, par3, par4);
/*     */       }
/*     */       else {
/*     */         
/* 321 */         par1World.c(par2, par3 - 1, par4, var8);
/* 322 */         par1World.e(par2, par3 - 1, par4, par2, par3, par4);
/*     */       } 
/*     */       
/* 325 */       par1World.a((qx)null, 1003, par2, par3, par4, 0);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, int par5) {
/* 335 */     int var6 = par1World.h(par2, par3, par4);
/*     */     
/* 337 */     if ((var6 & 0x8) == 0) {
/*     */       
/* 339 */       boolean var7 = false;
/*     */       
/* 341 */       if (par1World.a(par2, par3 + 1, par4) != this.cm) {
/*     */         
/* 343 */         par1World.e(par2, par3, par4, 0);
/* 344 */         var7 = true;
/*     */       } 
/*     */       
/* 347 */       if (!par1World.v(par2, par3 - 1, par4)) {
/*     */         
/* 349 */         par1World.e(par2, par3, par4, 0);
/* 350 */         var7 = true;
/*     */         
/* 352 */         if (par1World.a(par2, par3 + 1, par4) == this.cm)
/*     */         {
/* 354 */           par1World.e(par2, par3 + 1, par4, 0);
/*     */         }
/*     */       } 
/*     */       
/* 358 */       if (var7)
/*     */       {
/* 360 */         if (!par1World.I)
/*     */         {
/* 362 */           c(par1World, par2, par3, par4, var6, 0);
/*     */         }
/*     */       }
/*     */       else
/*     */       {
/* 367 */         boolean var8 = (par1World.B(par2, par3, par4) || par1World.B(par2, par3 + 1, par4));
/*     */         
/* 369 */         if ((var8 || (par5 > 0 && amq.p[par5].i()) || par5 == 0) && par5 != this.cm)
/*     */         {
/* 371 */           onPoweredBlockChange(par1World, par2, par3, par4, var8);
/*     */         }
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/* 377 */       if (par1World.a(par2, par3 - 1, par4) != this.cm)
/*     */       {
/* 379 */         par1World.e(par2, par3, par4, 0);
/*     */       }
/*     */       
/* 382 */       if (par5 > 0 && par5 != this.cm)
/*     */       {
/* 384 */         a(par1World, par2, par3 - 1, par4, par5);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(int par1, Random par2Random, int par3) {
/* 394 */     return mod_SCP.CorrodedDoorItem.cj;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public aoh a(yc par1World, int par2, int par3, int par4, aoj par5Vec3, aoj par6Vec3) {
/* 403 */     a((ym)par1World, par2, par3, par4);
/* 404 */     return super.a(par1World, par2, par3, par4, par5Vec3, par6Vec3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(yc par1World, int par2, int par3, int par4) {
/* 412 */     return (par3 >= 255) ? false : ((par1World.v(par2, par3 - 1, par4) && super.b(par1World, par2, par3, par4) && super.b(par1World, par2, par3 + 1, par4)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int q_() {
/* 421 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getFullMetadata(ym par1IBlockAccess, int par2, int par3, int par4) {
/* 429 */     int var7, var8, var5 = par1IBlockAccess.h(par2, par3, par4);
/* 430 */     boolean var6 = ((var5 & 0x8) != 0);
/*     */ 
/*     */ 
/*     */     
/* 434 */     if (var6) {
/*     */       
/* 436 */       var7 = par1IBlockAccess.h(par2, par3 - 1, par4);
/* 437 */       var8 = var5;
/*     */     }
/*     */     else {
/*     */       
/* 441 */       var7 = var5;
/* 442 */       var8 = par1IBlockAccess.h(par2, par3 + 1, par4);
/*     */     } 
/*     */     
/* 445 */     boolean var9 = ((var8 & 0x1) != 0);
/* 446 */     return var7 & 0x7 | (var6 ? 8 : 0) | (var9 ? 16 : 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int a(yc par1World, int par2, int par3, int par4) {
/* 456 */     return mod_SCP.CorrodedDoorItem.cj;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlockCorrodedDoor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */