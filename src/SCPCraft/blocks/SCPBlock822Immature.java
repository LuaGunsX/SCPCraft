/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import agi;
/*     */ import amq;
/*     */ import aoe;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Random;
/*     */ import lh;
/*     */ import lq;
/*     */ import net.minecraftforge.common.EnumPlantType;
/*     */ import net.minecraftforge.common.ForgeDirection;
/*     */ import net.minecraftforge.common.IPlantable;
/*     */ import yc;
/*     */ 
/*     */ public class SCPBlock822Immature
/*     */   extends amq
/*     */   implements IPlantable
/*     */ {
/*     */   public SCPBlock822Immature(int par1, int par2) {
/*  22 */     super(par1, par2, agi.y);
/*  23 */     b(true);
/*  24 */     a(mod_SCP.tabBlockSCP);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTextureFile() {
/*  29 */     return "/SCPCraft/textures/SCPblox.png";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(yc par1World, int par2, int par3, int par4, Random par5Random) {
/*  37 */     if (par1World.c(par2, par3 + 1, par4)) {
/*     */       int var6;
/*     */ 
/*     */       
/*  41 */       for (var6 = 1; par1World.a(par2, par3 - var6, par4) == this.cm; var6++);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  46 */       if (var6 < 3) {
/*     */         
/*  48 */         int var7 = par1World.h(par2, par3, par4);
/*     */         
/*  50 */         if (var7 == 15) {
/*     */           
/*  52 */           Random rand = new Random();
/*  53 */           int hur = rand.nextInt(2);
/*  54 */           if (hur == 0) {
/*     */             
/*  56 */             par1World.e(par2, par3 + 1, par4, mod_SCP.SCP822Grown.cm);
/*  57 */             par1World.c(par2, par3, par4, 0);
/*     */           } 
/*  59 */           if (hur == 1)
/*     */           {
/*  61 */             par1World.e(par2, par3 + 1, par4, this.cm);
/*  62 */             par1World.c(par2, par3, par4, 0);
/*     */           }
/*     */         
/*     */         } else {
/*     */           
/*  67 */           par1World.c(par2, par3, par4, var7 + 1);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public aoe e(yc par1World, int par2, int par3, int par4) {
/*  79 */     float var5 = 0.0625F;
/*  80 */     return aoe.a().a((par2 + var5), par3, (par4 + var5), ((par2 + 1) - var5), ((par3 + 1) - var5), ((par4 + 1) - var5));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public aoe b_(yc par1World, int par2, int par3, int par4) {
/*  90 */     float var5 = 0.0625F;
/*  91 */     return aoe.a().a((par2 + var5), par3, (par4 + var5), ((par2 + 1) - var5), (par3 + 1), ((par4 + 1) - var5));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(int par1) {
/*  99 */     return (par1 == 1) ? (this.cl - 1) : ((par1 == 0) ? (this.cl + 1) : this.cl);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 107 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 116 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int d() {
/* 124 */     return 13;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(yc par1World, int par2, int par3, int par4) {
/* 132 */     return !super.b(par1World, par2, par3, par4) ? false : d(par1World, par2, par3, par4);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, int par5) {
/* 141 */     if (!d(par1World, par2, par3, par4)) {
/*     */       
/* 143 */       c(par1World, par2, par3, par4, par1World.h(par2, par3, par4), 0);
/* 144 */       par1World.e(par2, par3, par4, 0);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean d(yc par1World, int par2, int par3, int par4) {
/* 153 */     if (par1World.g(par2 - 1, par3, par4).a())
/*     */     {
/* 155 */       return false;
/*     */     }
/* 157 */     if (par1World.g(par2 + 1, par3, par4).a())
/*     */     {
/* 159 */       return false;
/*     */     }
/* 161 */     if (par1World.g(par2, par3, par4 - 1).a())
/*     */     {
/* 163 */       return false;
/*     */     }
/* 165 */     if (par1World.g(par2, par3, par4 + 1).a())
/*     */     {
/* 167 */       return false;
/*     */     }
/* 169 */     if (par1World.a(par2, par3 - 1, par4) == mod_SCP.SCP822.cm)
/*     */     {
/* 171 */       return true;
/*     */     }
/*     */ 
/*     */     
/* 175 */     int var5 = par1World.a(par2, par3 - 1, par4);
/* 176 */     return (p[var5] != null && p[var5].canSustainPlant(par1World, par2, par3 - 1, par4, ForgeDirection.UP, this));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, lq par5Entity) {
/* 185 */     par5Entity.a(lh.g, 1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public EnumPlantType getPlantType(yc world, int x, int y, int z) {
/* 191 */     return EnumPlantType.Desert;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPlantID(yc world, int x, int y, int z) {
/* 197 */     return amq.aY.cm;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPlantMetadata(yc world, int x, int y, int z) {
/* 203 */     return -1;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlock822Immature.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */