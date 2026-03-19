/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import ModLoader;
/*     */ import SCPCraft.mod_SCP;
/*     */ import agi;
/*     */ import amq;
/*     */ import aoe;
/*     */ import ays;
/*     */ import java.util.Random;
/*     */ import lm;
/*     */ import lq;
/*     */ import md;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import qx;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public class SCPBlock409
/*     */   extends amq
/*     */ {
/*     */   public SCPBlock409(int par1, int par2) {
/*  22 */     super(par1, par2, agi.r);
/*  23 */     a(mod_SCP.tabBlockSCP);
/*  24 */     b(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int par1, Random par2Random, int par3) {
/*  29 */     return mod_SCP.SCP409.cm;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTextureFile() {
/*  34 */     return "/SCPCraft/textures/SCPblox.png";
/*     */   }
/*     */ 
/*     */   
/*     */   public int r_() {
/*  39 */     return 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public aoe e(yc par1World, int par2, int par3, int par4) {
/*  44 */     float var5 = 0.125F;
/*  45 */     return aoe.a().a((par2 + var5), (par3 + var5), (par4 + var5), ((par2 + 1) - var5), ((par3 + 1) - var5), ((par4 + 1) - var5));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, qx par5EntityPlayer) {
/*  50 */     ur var2 = par5EntityPlayer.bJ.g();
/*     */     
/*  52 */     Minecraft minecraft = ModLoader.getMinecraftInstance();
/*     */     
/*  54 */     ur boots = minecraft.g.bJ.b[0];
/*  55 */     ur legs = minecraft.g.bJ.b[1];
/*  56 */     ur chest = minecraft.g.bJ.b[2];
/*  57 */     ur helm = minecraft.g.bJ.b[3];
/*     */     
/*  59 */     if (var2 != null) {
/*     */       
/*  61 */       if (chest != null && legs != null && boots != null && helm != null)
/*     */       {
/*  63 */         if (chest.c == mod_SCP.SCP912Shirt.cj || legs.c == mod_SCP.SCP912Pants.cj || boots.c == mod_SCP.SCP912Shoes.cj || helm.c == mod_SCP.SCP912Head.cj) {
/*     */           
/*  65 */           super.b(par1World, par2, par3, par4, (lq)par5EntityPlayer);
/*     */ 
/*     */           
/*     */           return;
/*     */         } 
/*     */         
/*  71 */         par5EntityPlayer.d(new lm(mod_SCP.crystal.H, 160, 0));
/*     */       
/*     */       }
/*     */       else
/*     */       {
/*  76 */         par5EntityPlayer.d(new lm(mod_SCP.crystal.H, 160, 0));
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/*  81 */       par5EntityPlayer.d(new lm(mod_SCP.crystal.H, 160, 0));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, lq par5Entity) {
/*  87 */     if (par5Entity instanceof md) ((md)par5Entity).d(new lm(mod_SCP.crystal.H, 160, 0));
/*     */   
/*     */   }
/*     */   
/*     */   public void b(yc par1World, int par2, int par3, int par4, lq par5Entity) {
/*  92 */     ays ays = (ModLoader.getMinecraftInstance()).g;
/*  93 */     ur var2 = ((qx)ays).bJ.g();
/*  94 */     Minecraft minecraft = ModLoader.getMinecraftInstance();
/*     */     
/*  96 */     ur boots = minecraft.g.bJ.b[0];
/*  97 */     ur legs = minecraft.g.bJ.b[1];
/*  98 */     ur chest = minecraft.g.bJ.b[2];
/*  99 */     ur helm = minecraft.g.bJ.b[3];
/*     */     
/* 101 */     if (var2 != null) {
/*     */       
/* 103 */       if (chest != null && legs != null && boots != null && helm != null)
/*     */       {
/* 105 */         if (chest.c == mod_SCP.SCP912Shirt.cj || legs.c == mod_SCP.SCP912Pants.cj || boots.c == mod_SCP.SCP912Shoes.cj || helm.c == mod_SCP.SCP912Head.cj) {
/*     */           
/* 107 */           super.b(par1World, par2, par3, par4, par5Entity);
/*     */ 
/*     */           
/*     */           return;
/*     */         } 
/*     */         
/* 113 */         ((md)par5Entity).d(new lm(mod_SCP.crystal.H, 160, 0));
/*     */       
/*     */       }
/*     */       else
/*     */       {
/* 118 */         ((md)par5Entity).d(new lm(mod_SCP.crystal.H, 160, 0));
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/* 123 */       ((md)par5Entity).d(new lm(mod_SCP.crystal.H, 160, 0));
/*     */     } 
/* 125 */     super.b(par1World, par2, par3, par4, par5Entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(yc par1World, int par2, int par3, int par4, qx par5EntityPlayer, int par6, float par7, float par8, float par9) {
/* 130 */     ur var2 = par5EntityPlayer.bJ.g();
/* 131 */     Minecraft minecraft = ModLoader.getMinecraftInstance();
/*     */     
/* 133 */     ur boots = minecraft.g.bJ.b[0];
/* 134 */     ur legs = minecraft.g.bJ.b[1];
/* 135 */     ur chest = minecraft.g.bJ.b[2];
/* 136 */     ur helm = minecraft.g.bJ.b[3];
/*     */     
/* 138 */     if (var2 != null) {
/*     */       
/* 140 */       if (chest != null && legs != null && boots != null && helm != null)
/*     */       {
/* 142 */         if (chest.c == mod_SCP.SCP912Shirt.cj || legs.c == mod_SCP.SCP912Pants.cj || boots.c == mod_SCP.SCP912Shoes.cj || helm.c == mod_SCP.SCP912Head.cj) {
/*     */           
/* 144 */           super.b(par1World, par2, par3, par4, (lq)par5EntityPlayer);
/* 145 */           return false;
/*     */         } 
/*     */ 
/*     */ 
/*     */         
/* 150 */         par5EntityPlayer.d(new lm(mod_SCP.crystal.H, 160, 0));
/*     */       
/*     */       }
/*     */       else
/*     */       {
/* 155 */         par5EntityPlayer.d(new lm(mod_SCP.crystal.H, 160, 0));
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/* 160 */       par5EntityPlayer.d(new lm(mod_SCP.crystal.H, 160, 0));
/*     */     } 
/* 162 */     return super.a(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(yc par1World, int par2, int par3, int par4, Random par5Random) {
/* 167 */     if (!par1World.I)
/*     */     {
/* 169 */       for (int var6 = 0; var6 < 100; var6++) {
/*     */         
/* 171 */         int var7 = par2 + par5Random.nextInt(3) - 1;
/* 172 */         int var8 = par3 + par5Random.nextInt(5) - 3;
/* 173 */         int var9 = par4 + par5Random.nextInt(3) - 1;
/* 174 */         int var10 = par1World.a(var7, var8 + 1, var9);
/*     */         
/* 176 */         if (par1World.a(var7, var8, var9) != 0 && par1World.a(var7, var8, var9) != mod_SCP.Granite.cm && par1World.a(var7, var8, var9) != amq.C.cm && par1World.a(var7, var8, var9) != amq.ax.cm)
/*     */         {
/* 178 */           par1World.e(var7, var8, var9, mod_SCP.SCP409.cm);
/*     */         }
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlock409.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */