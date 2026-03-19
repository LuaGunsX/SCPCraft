/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import amq;
/*     */ import aoh;
/*     */ import aoi;
/*     */ import net.minecraftforge.common.MinecraftForge;
/*     */ import net.minecraftforge.event.Event;
/*     */ import net.minecraftforge.event.entity.player.FillBucketEvent;
/*     */ import qx;
/*     */ import up;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ public class SCP143Bucket
/*     */   extends up
/*     */ {
/*     */   private int isFull;
/*     */   private int color;
/*     */   private boolean hasColor;
/*     */   
/*     */   public SCP143Bucket(int par1, int par2, int col, boolean hasCol) {
/*  24 */     super(par1);
/*  25 */     this.ck = 1;
/*  26 */     this.isFull = par2;
/*  27 */     this.color = col;
/*  28 */     this.hasColor = hasCol;
/*  29 */     a(mod_SCP.tabItemSCP);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int par1, int par2) {
/*  34 */     if (this.hasColor) {
/*  35 */       if (par2 == 0) return 14; 
/*  36 */       return 15;
/*     */     } 
/*  38 */     return 14;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ur par1ItemStack, int par2) {
/*  43 */     if (par2 == 0) return 6576458; 
/*  44 */     return this.color;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  49 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getRenderPasses(int metadata) {
/*  54 */     return 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTextureFile() {
/*  59 */     return "/SCPCraft/textures/SCPItems.png";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ur a(ur par1ItemStack, yc par2World, qx par3EntityPlayer) {
/*  67 */     float var4 = 1.0F;
/*  68 */     double var5 = par3EntityPlayer.q + (par3EntityPlayer.t - par3EntityPlayer.q) * var4;
/*  69 */     double var7 = par3EntityPlayer.r + (par3EntityPlayer.u - par3EntityPlayer.r) * var4 + 1.62D - par3EntityPlayer.M;
/*  70 */     double var9 = par3EntityPlayer.s + (par3EntityPlayer.v - par3EntityPlayer.s) * var4;
/*  71 */     boolean var11 = (this.isFull == 0);
/*  72 */     aoh var12 = a(par2World, par3EntityPlayer, var11);
/*     */     
/*  74 */     if (var12 == null)
/*     */     {
/*  76 */       return par1ItemStack;
/*     */     }
/*     */ 
/*     */     
/*  80 */     FillBucketEvent event = new FillBucketEvent(par3EntityPlayer, par1ItemStack, par2World, var12);
/*  81 */     if (MinecraftForge.EVENT_BUS.post((Event)event))
/*     */     {
/*  83 */       return par1ItemStack;
/*     */     }
/*     */     
/*  86 */     if (event.getResult() == Event.Result.ALLOW) {
/*     */       
/*  88 */       if (par3EntityPlayer.cd.d)
/*     */       {
/*  90 */         return par1ItemStack;
/*     */       }
/*     */       
/*  93 */       if (--par1ItemStack.a <= 0)
/*     */       {
/*  95 */         return event.result;
/*     */       }
/*     */       
/*  98 */       if (!par3EntityPlayer.bJ.a(event.result))
/*     */       {
/* 100 */         par3EntityPlayer.c(event.result);
/*     */       }
/*     */       
/* 103 */       return par1ItemStack;
/*     */     } 
/*     */     
/* 106 */     if (var12.a == aoi.a) {
/*     */       
/* 108 */       int var13 = var12.b;
/* 109 */       int var14 = var12.c;
/* 110 */       int var15 = var12.d;
/*     */       
/* 112 */       if (!par2World.a(par3EntityPlayer, var13, var14, var15))
/*     */       {
/* 114 */         return par1ItemStack;
/*     */       }
/*     */       
/* 117 */       if (this.isFull == 0) {
/*     */         
/* 119 */         if (!par3EntityPlayer.a(var13, var14, var15, var12.e, par1ItemStack))
/*     */         {
/* 121 */           return par1ItemStack;
/*     */         }
/*     */         
/* 124 */         if (par2World.a(var13, var14, var15) == mod_SCP.SCP354Still.cm && par2World.h(var13, var14, var15) == 0) {
/*     */           
/* 126 */           par2World.e(var13, var14, var15, 0);
/*     */           
/* 128 */           if (par3EntityPlayer.cd.d)
/*     */           {
/* 130 */             return par1ItemStack;
/*     */           }
/*     */           
/* 133 */           if (--par1ItemStack.a <= 0)
/*     */           {
/* 135 */             return new ur(mod_SCP.Bucket354);
/*     */           }
/*     */           
/* 138 */           if (!par3EntityPlayer.bJ.a(new ur(mod_SCP.Bucket354)))
/*     */           {
/* 140 */             par3EntityPlayer.c(new ur(mod_SCP.Bucket354.cj, 1, 0));
/*     */           }
/*     */           
/* 143 */           return par1ItemStack;
/*     */         } 
/*     */         
/* 146 */         if (par2World.a(var13, var14, var15) == mod_SCP.SCP006Still.cm) {
/*     */           
/* 148 */           par2World.e(var13, var14, var15, 0);
/*     */           
/* 150 */           if (par3EntityPlayer.cd.d)
/*     */           {
/* 152 */             return par1ItemStack;
/*     */           }
/*     */           
/* 155 */           if (--par1ItemStack.a <= 0)
/*     */           {
/* 157 */             return new ur(mod_SCP.Bucket006);
/*     */           }
/*     */           
/* 160 */           if (!par3EntityPlayer.bJ.a(new ur(mod_SCP.Bucket006)))
/*     */           {
/* 162 */             par3EntityPlayer.c(new ur(mod_SCP.Bucket006.cj, 1, 0));
/*     */           }
/*     */           
/* 165 */           return par1ItemStack;
/*     */         } 
/*     */         
/* 168 */         if (par2World.a(var13, var14, var15) == amq.E.cm)
/*     */         {
/* 170 */           par2World.e(var13, var14, var15, 0);
/*     */           
/* 172 */           if (par3EntityPlayer.cd.d)
/*     */           {
/* 174 */             return par1ItemStack;
/*     */           }
/*     */           
/* 177 */           if (--par1ItemStack.a <= 0)
/*     */           {
/* 179 */             return new ur(mod_SCP.BucketWater);
/*     */           }
/*     */           
/* 182 */           if (!par3EntityPlayer.bJ.a(new ur(mod_SCP.BucketWater)))
/*     */           {
/* 184 */             par3EntityPlayer.c(new ur(mod_SCP.BucketWater.cj, 1, 0));
/*     */           }
/*     */           
/* 187 */           return par1ItemStack;
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 192 */         if (this.isFull < 0)
/*     */         {
/* 194 */           return new ur(mod_SCP.SCP143Bucket);
/*     */         }
/*     */         
/* 197 */         if (var12.e == 0)
/*     */         {
/* 199 */           var14--;
/*     */         }
/*     */         
/* 202 */         if (var12.e == 1)
/*     */         {
/* 204 */           var14++;
/*     */         }
/*     */         
/* 207 */         if (var12.e == 2)
/*     */         {
/* 209 */           var15--;
/*     */         }
/*     */         
/* 212 */         if (var12.e == 3)
/*     */         {
/* 214 */           var15++;
/*     */         }
/*     */         
/* 217 */         if (var12.e == 4)
/*     */         {
/* 219 */           var13--;
/*     */         }
/*     */         
/* 222 */         if (var12.e == 5)
/*     */         {
/* 224 */           var13++;
/*     */         }
/*     */         
/* 227 */         if (!par3EntityPlayer.a(var13, var14, var15, var12.e, par1ItemStack))
/*     */         {
/* 229 */           return par1ItemStack;
/*     */         }
/*     */         
/* 232 */         if (tryPlaceContainedLiquid(par2World, var5, var7, var9, var13, var14, var15) && !par3EntityPlayer.cd.d)
/*     */         {
/* 234 */           return new ur(mod_SCP.SCP143Bucket);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 239 */     return par1ItemStack;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean tryPlaceContainedLiquid(yc par1World, double par2, double par4, double par6, int par8, int par9, int par10) {
/* 248 */     if (this.isFull <= 0)
/*     */     {
/* 250 */       return false;
/*     */     }
/* 252 */     if (!par1World.c(par8, par9, par10) && par1World.g(par8, par9, par10).a())
/*     */     {
/* 254 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 258 */     if (par1World.u.e && this.isFull == mod_SCP.SCP006Flowing.cm) {
/*     */       
/* 260 */       par1World.a(par2 + 0.5D, par4 + 0.5D, par6 + 0.5D, "random.fizz", 0.5F, 2.6F + (par1World.t.nextFloat() - par1World.t.nextFloat()) * 0.8F);
/*     */       
/* 262 */       for (int var11 = 0; var11 < 8; var11++)
/*     */       {
/* 264 */         par1World.a("largesmoke", par8 + Math.random(), par9 + Math.random(), par10 + Math.random(), 0.0D, 0.0D, 0.0D);
/*     */       }
/*     */     }
/*     */     else {
/*     */       
/* 269 */       par1World.d(par8, par9, par10, this.isFull, 0);
/*     */     } 
/*     */     
/* 272 */     return true;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCP143Bucket.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */