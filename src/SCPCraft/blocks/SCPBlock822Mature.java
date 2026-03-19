/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import SCPCraft.mod_Others;
/*     */ import SCPCraft.mod_SCP;
/*     */ import agi;
/*     */ import amq;
/*     */ import aoe;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Random;
/*     */ import lq;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraftforge.common.EnumPlantType;
/*     */ import net.minecraftforge.common.ForgeDirection;
/*     */ import net.minecraftforge.common.IPlantable;
/*     */ import pz;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPBlock822Mature
/*     */   extends amq
/*     */   implements IPlantable
/*     */ {
/*     */   public SCPBlock822Mature(int par1, int par2) {
/*  26 */     super(par1, par2, agi.y);
/*  27 */     b(true);
/*  28 */     a(mod_SCP.tabBlockSCP);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTextureFile() {
/*  33 */     return "/SCPCraft/textures/SCPblox.png";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(yc par1World, int par2, int par3, int par4, Random par5Random) {
/*  41 */     if (par1World.c(par2, par3 + 1, par4)) {
/*     */       int var6;
/*     */ 
/*     */       
/*  45 */       for (var6 = 1; par1World.a(par2, par3 - var6, par4) == this.cm; var6++);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  50 */       if (var6 < 3) {
/*     */         
/*  52 */         int var7 = par1World.h(par2, par3, par4);
/*     */         
/*  54 */         if (var7 == 15) {
/*     */           
/*  56 */           par1World.e(par2, par3 + 1, par4, this.cm);
/*  57 */           par1World.c(par2, par3, par4, 0);
/*     */         }
/*     */         else {
/*     */           
/*  61 */           par1World.c(par2, par3, par4, var7 + 1);
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
/*  73 */     float var5 = 0.0625F;
/*  74 */     return aoe.a().a((par2 + var5), par3, (par4 + var5), ((par2 + 1) - var5), ((par3 + 1) - var5), ((par4 + 1) - var5));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public aoe b_(yc par1World, int par2, int par3, int par4) {
/*  84 */     float var5 = 0.0625F;
/*  85 */     return aoe.a().a((par2 + var5), par3, (par4 + var5), ((par2 + 1) - var5), (par3 + 1), ((par4 + 1) - var5));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(int par1) {
/*  93 */     return (par1 == 1) ? (this.cl - 1) : ((par1 == 0) ? (this.cl + 1) : this.cl);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 101 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 110 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int d() {
/* 118 */     return mod_Others.SCP822ID;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(yc par1World, int par2, int par3, int par4) {
/* 126 */     return !super.b(par1World, par2, par3, par4) ? false : d(par1World, par2, par3, par4);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, int par5) {
/* 135 */     if (!d(par1World, par2, par3, par4)) {
/*     */       
/* 137 */       c(par1World, par2, par3, par4, par1World.h(par2, par3, par4), 0);
/* 138 */       par1World.e(par2, par3, par4, 0);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean d(yc par1World, int par2, int par3, int par4) {
/* 147 */     if (par1World.g(par2 - 1, par3, par4).a())
/*     */     {
/* 149 */       return false;
/*     */     }
/* 151 */     if (par1World.g(par2 + 1, par3, par4).a())
/*     */     {
/* 153 */       return false;
/*     */     }
/* 155 */     if (par1World.g(par2, par3, par4 - 1).a())
/*     */     {
/* 157 */       return false;
/*     */     }
/* 159 */     if (par1World.g(par2, par3, par4 + 1).a())
/*     */     {
/* 161 */       return false;
/*     */     }
/* 163 */     if (par1World.a(par2, par3 - 1, par4) == mod_SCP.SCP822.cm)
/*     */     {
/* 165 */       return true;
/*     */     }
/*     */ 
/*     */     
/* 169 */     int var5 = par1World.a(par2, par3 - 1, par4);
/* 170 */     return (p[var5] != null && p[var5].canSustainPlant(par1World, par2, par3 - 1, par4, ForgeDirection.UP, this));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, lq par5Entity) {
/* 179 */     Minecraft mc = Minecraft.x();
/* 180 */     if (par5Entity != null && par5Entity instanceof qx) {
/*     */       
/* 182 */       if (mc.b.g())
/*     */       {
/* 184 */         if (!par1World.I)
/*     */         {
/* 186 */           par1World.b(par2, par3, par4, 0);
/* 187 */           pz var5 = new pz(par1World, (par2 + 0.5F), (par3 + 0.5F), (par4 + 0.5F));
/* 188 */           var5.a = 0;
/* 189 */           par1World.d((lq)var5);
/*     */         
/*     */         }
/*     */       
/*     */       }
/*     */     }
/* 195 */     else if (!par1World.I) {
/*     */       
/* 197 */       par1World.b(par2, par3, par4, 0);
/* 198 */       pz var5 = new pz(par1World, (par2 + 0.5F), (par3 + 0.5F), (par4 + 0.5F));
/* 199 */       var5.a = 0;
/* 200 */       par1World.d((lq)var5);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EnumPlantType getPlantType(yc world, int x, int y, int z) {
/* 208 */     return EnumPlantType.Desert;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPlantID(yc world, int x, int y, int z) {
/* 214 */     return amq.aY.cm;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPlantMetadata(yc world, int x, int y, int z) {
/* 220 */     return -1;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlock822Mature.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */