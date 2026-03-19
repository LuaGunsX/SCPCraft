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
/*     */ import yc;
/*     */ import ym;
/*     */ 
/*     */ 
/*     */ public class SCPSmokeBlock
/*     */   extends amq
/*     */ {
/*     */   public SCPSmokeBlock(int par1, int j) {
/*  19 */     super(par1, j, agi.f);
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
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(int i, int j) {
/*  34 */     if (j == 0) {
/*  35 */       if (i == 0) return 25; 
/*  36 */       if (i == 1) return 30; 
/*  37 */       if (i == 2) return 26; 
/*  38 */       if (i == 3) return 26; 
/*  39 */       if (i == 4) return 26; 
/*  40 */       if (i == 5) return 26; 
/*     */     } 
/*  42 */     if (j == 2) {
/*  43 */       if (i == 5) return 30; 
/*  44 */       if (i == 4) return 25; 
/*  45 */       if (i == 0) return 28; 
/*  46 */       if (i == 1) return 28; 
/*  47 */       if (i == 2) return 44; 
/*  48 */       if (i == 3) return 28; 
/*     */     } 
/*  50 */     if (j == 1) {
/*  51 */       if (i == 0) return 30; 
/*  52 */       if (i == 1) return 25; 
/*  53 */       if (i == 2) return 27; 
/*  54 */       if (i == 3) return 27; 
/*  55 */       if (i == 4) return 27; 
/*  56 */       if (i == 5) return 27; 
/*     */     } 
/*  58 */     if (j == 4) {
/*  59 */       if (i == 4) return 30; 
/*  60 */       if (i == 5) return 25; 
/*  61 */       if (i == 2) return 45; 
/*  62 */       if (i == 3) return 29; 
/*  63 */       if (i == 0) return 29; 
/*  64 */       if (i == 1) return 29; 
/*     */     } 
/*  66 */     if (j == 3) {
/*  67 */       if (i == 3) return 30; 
/*  68 */       if (i == 2) return 25; 
/*  69 */       if (i == 1) return 27; 
/*  70 */       if (i == 0) return 27; 
/*  71 */       if (i == 4) return 28; 
/*  72 */       if (i == 5) return 44; 
/*     */     } 
/*  74 */     if (j == 5) {
/*  75 */       if (i == 2) return 30; 
/*  76 */       if (i == 3) return 25; 
/*  77 */       if (i == 4) return 29; 
/*  78 */       if (i == 5) return 45; 
/*  79 */       if (i == 1) return 26; 
/*  80 */       if (i == 0) return 26;
/*     */     
/*     */     } 
/*  83 */     return (j != 2) ? 20 : 177;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  92 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int d() {
/* 100 */     return mod_Others.SmokeBlockID;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(yc par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9) {
/* 105 */     int var10 = par9 & 0x3;
/* 106 */     byte var11 = 0;
/*     */     
/* 108 */     switch (par5) {
/*     */       
/*     */       case 0:
/* 111 */         var11 = 1;
/*     */         break;
/*     */       case 1:
/* 114 */         var11 = 0;
/*     */         break;
/*     */       case 2:
/* 117 */         var11 = 5;
/*     */         break;
/*     */       case 3:
/* 120 */         var11 = 3;
/*     */         break;
/*     */       case 4:
/* 123 */         var11 = 4;
/*     */         break;
/*     */       case 5:
/* 126 */         var11 = 2;
/*     */         break;
/*     */     } 
/* 129 */     return var10 | var11;
/*     */   }
/*     */ 
/*     */   
/*     */   public aoe getSelectedBoundingBoxFromPool_do(yc world, int i, int j, int k) {
/* 134 */     int l = world.h(i, j, k);
/* 135 */     if (l == 0) a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F); 
/* 136 */     if (l == 1) a(0.0F, 0.1875F, 0.0F, 1.0F, 1.0F, 1.0F); 
/* 137 */     if (l == 2) a(0.0F, 0.0F, 0.0F, 0.8125F, 1.0F, 1.0F); 
/* 138 */     if (l == 3) a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.8125F); 
/* 139 */     if (l == 4) a(0.1875F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F); 
/* 140 */     if (l == 5) a(0.0F, 0.0F, 0.1875F, 1.0F, 1.0F, 1.0F); 
/* 141 */     return b_(world, i, j, k);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ym world, int i, int j, int k) {
/* 147 */     int l = world.h(i, j, k);
/* 148 */     if (l == 0) a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F); 
/* 149 */     if (l == 1) a(0.0F, 0.1875F, 0.0F, 1.0F, 1.0F, 1.0F); 
/* 150 */     if (l == 2) a(0.0F, 0.0F, 0.0F, 0.8125F, 1.0F, 1.0F); 
/* 151 */     if (l == 3) a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.8125F); 
/* 152 */     if (l == 4) a(0.1875F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F); 
/* 153 */     if (l == 5) a(0.0F, 0.0F, 0.1875F, 1.0F, 1.0F, 1.0F);
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, aoe par5AxisAlignedBB, List par6ArrayList, lq par7Entity) {
/* 162 */     int i = par1World.h(par2, par3, par4);
/* 163 */     if (i == 0) a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F); 
/* 164 */     if (i == 1) a(0.0F, 0.1875F, 0.0F, 1.0F, 1.0F, 1.0F); 
/* 165 */     if (i == 2) a(0.0F, 0.0F, 0.0F, 0.8125F, 1.0F, 1.0F); 
/* 166 */     if (i == 3) a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.8125F); 
/* 167 */     if (i == 4) a(0.1875F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F); 
/* 168 */     if (i == 5) a(0.0F, 0.0F, 0.1875F, 1.0F, 1.0F, 1.0F); 
/* 169 */     super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public int r_() {
/* 174 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, Random par5Random) {
/* 179 */     int i = par1World.h(par2, par3, par4);
/* 180 */     double d = (par2 + 0.5F);
/* 181 */     double d1 = (par3 + 0.7F);
/* 182 */     double d2 = (par4 + 0.5F);
/* 183 */     double d3 = 0.004D;
/* 184 */     double d4 = 0.004D;
/* 185 */     double d5 = 0.8125D;
/* 186 */     if (i == 0 && par1World.a(par2, par3 + 1, par4) == 0) {
/* 187 */       par1World.a("SCPsmoke", d - d4, d1 + d5, d2 + d3, 0.0D, 0.0D, 0.0D);
/* 188 */       par1World.a("SCPsmoke", d + d4, d1 + d5, d2 + d3, 0.0D, 0.0D, 0.0D);
/* 189 */       par1World.a("SCPsmoke", d + d4, d1 + d5, d2 - d3, 0.0D, 0.0D, 0.0D);
/* 190 */       par1World.a("SCPsmoke", d - d4, d1 + d5, d2 - d3, 0.0D, 0.0D, 0.0D);
/*     */     } 
/* 192 */     if (i == 1 && par1World.a(par2, par3 - 1, par4) == 0) {
/* 193 */       par1World.a("SCPsmoke2", d - d4, d1 - d5, d2 + d3, 0.0D, 0.0D, 0.0D);
/* 194 */       par1World.a("SCPsmoke2", d + d4, d1 - d5, d2 + d3, 0.0D, 0.0D, 0.0D);
/* 195 */       par1World.a("SCPsmoke2", d + d4, d1 - d5, d2 - d3, 0.0D, 0.0D, 0.0D);
/* 196 */       par1World.a("SCPsmoke2", d - d4, d1 - d5, d2 - d3, 0.0D, 0.0D, 0.0D);
/*     */     } 
/* 198 */     if (i == 2 && par1World.a(par2 + 1, par3, par4) == 0) {
/* 199 */       par1World.a("SCPsmoke3", d + d5, d1 - d3, d2 + d3, 0.0D, 0.0D, 0.0D);
/* 200 */       par1World.a("SCPsmoke3", d + d5, d1 + d3, d2 + d3, 0.0D, 0.0D, 0.0D);
/* 201 */       par1World.a("SCPsmoke3", d + d5, d1 + d3, d2 - d3, 0.0D, 0.0D, 0.0D);
/* 202 */       par1World.a("SCPsmoke3", d + d5, d1 - d3, d2 - d3, 0.0D, 0.0D, 0.0D);
/*     */     } 
/* 204 */     if (i == 3 && par1World.a(par2, par3, par4 + 1) == 0) {
/* 205 */       par1World.a("SCPsmoke4", d - d4, d1 + d3, d2 + d5, 0.0D, 0.0D, 0.0D);
/* 206 */       par1World.a("SCPsmoke4", d + d4, d1 + d3, d2 + d5, 0.0D, 0.0D, 0.0D);
/* 207 */       par1World.a("SCPsmoke4", d + d4, d1 - d3, d2 + d5, 0.0D, 0.0D, 0.0D);
/* 208 */       par1World.a("SCPsmoke4", d - d4, d1 - d3, d2 + d5, 0.0D, 0.0D, 0.0D);
/*     */     } 
/* 210 */     if (i == 4 && par1World.a(par2 - 1, par3, par4) == 0) {
/* 211 */       par1World.a("SCPsmoke5", d - d5, d1 - d3, d2 + d3, 0.0D, 0.0D, 0.0D);
/* 212 */       par1World.a("SCPsmoke5", d - d5, d1 + d3, d2 + d3, 0.0D, 0.0D, 0.0D);
/* 213 */       par1World.a("SCPsmoke5", d - d5, d1 + d3, d2 - d3, 0.0D, 0.0D, 0.0D);
/* 214 */       par1World.a("SCPsmoke5", d - d5, d1 - d3, d2 - d3, 0.0D, 0.0D, 0.0D);
/*     */     } 
/* 216 */     if (i == 5 && par1World.a(par2, par3, par4 - 1) == 0) {
/* 217 */       par1World.a("SCPsmoke6", d - d4, d1 + d3, d2 - d5, 0.0D, 0.0D, 0.0D);
/* 218 */       par1World.a("SCPsmoke6", d + d4, d1 + d3, d2 - d5, 0.0D, 0.0D, 0.0D);
/* 219 */       par1World.a("SCPsmoke6", d + d4, d1 - d3, d2 - d5, 0.0D, 0.0D, 0.0D);
/* 220 */       par1World.a("SCPsmoke6", d - d4, d1 - d3, d2 - d5, 0.0D, 0.0D, 0.0D);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(yc par1World, int par2, int par3, int par4, Random par5Random) {
/* 226 */     super.b(par1World, par2, par3, par4, par5Random);
/*     */     
/* 228 */     if (par1World.h(par2, par3, par4) == 0)
/*     */     {
/* 230 */       g(par1World, par2, par3, par4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPSmokeBlock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */