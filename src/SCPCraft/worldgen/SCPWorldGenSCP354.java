/*     */ package SCPCraft.worldgen;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import abm;
/*     */ import agi;
/*     */ import amq;
/*     */ import java.util.Random;
/*     */ import yc;
/*     */ import yo;
/*     */ import yy;
/*     */ 
/*     */ 
/*     */ public class SCPWorldGenSCP354
/*     */   extends abm
/*     */ {
/*     */   private int blockIndex;
/*     */   
/*     */   public SCPWorldGenSCP354(int par1) {
/*  19 */     this.blockIndex = par1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(yc par1World, Random par2Random, int par3, int par4, int par5) {
/*  24 */     par3 -= 8;
/*  25 */     par4 -= 4;
/*  26 */     boolean[] aflag = new boolean[4096];
/*  27 */     int i = par2Random.nextInt(4) + 4;
/*     */     
/*  29 */     for (int j = 0; j < i; j++) {
/*     */       
/*  31 */       double d = par2Random.nextDouble() * 6.0D + 3.0D;
/*  32 */       double d1 = par2Random.nextDouble() * 4.0D + 2.0D;
/*  33 */       double d2 = par2Random.nextDouble() * 6.0D + 3.0D;
/*  34 */       double d3 = par2Random.nextDouble() * (16.0D - d - 2.0D) + 1.0D + d / 2.0D;
/*  35 */       double d4 = par2Random.nextDouble() * (8.0D - d1 - 4.0D) + 2.0D + d1 / 2.0D;
/*  36 */       double d5 = par2Random.nextDouble() * (16.0D - d2 - 2.0D) + 1.0D + d2 / 2.0D;
/*     */       
/*  38 */       for (int i4 = 1; i4 < 15; i4++) {
/*     */         
/*  40 */         for (int j4 = 1; j4 < 15; j4++) {
/*     */           
/*  42 */           for (int k4 = 1; k4 < 7; k4++) {
/*     */             
/*  44 */             double d6 = (i4 - d3) / d / 2.0D;
/*  45 */             double d7 = (k4 - d4) / d1 / 2.0D;
/*  46 */             double d8 = (j4 - d5) / d2 / 2.0D;
/*  47 */             double d9 = d6 * d6 + d7 * d7 + d8 * d8;
/*     */             
/*  49 */             if (d9 < 1.0D)
/*     */             {
/*  51 */               aflag[(i4 * 16 + j4) * 8 + k4] = true;
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  58 */     for (int k = 0; k < 16; k++) {
/*     */       
/*  60 */       for (int l1 = 0; l1 < 16; l1++) {
/*     */         
/*  62 */         for (int i3 = 0; i3 < 8; i3++) {
/*     */           
/*  64 */           boolean flag = (!aflag[(k * 16 + l1) * 8 + i3] && ((k < 15 && aflag[((k + 1) * 16 + l1) * 8 + i3]) || (k > 0 && aflag[((k - 1) * 16 + l1) * 8 + i3]) || (l1 < 15 && aflag[(k * 16 + l1 + 1) * 8 + i3]) || (l1 > 0 && aflag[(k * 16 + l1 - 1) * 8 + i3]) || (i3 < 7 && aflag[(k * 16 + l1) * 8 + i3 + 1]) || (i3 > 0 && aflag[(k * 16 + l1) * 8 + i3 - 1])));
/*     */           
/*  66 */           if (flag) {
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  71 */             agi material = par1World.g(par3 + k, par4 + i3, par5 + l1);
/*     */             
/*  73 */             if (i3 < 4 && !material.a() && par1World.a(par3 + k, par4 + i3, par5 + l1) != this.blockIndex)
/*     */             {
/*  75 */               return false;
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*  81 */     for (int l = 0; l < 16; l++) {
/*     */       
/*  83 */       for (int i2 = 0; i2 < 16; i2++) {
/*     */         
/*  85 */         for (int j3 = 0; j3 < 8; j3++) {
/*     */           
/*  87 */           if (aflag[(l * 16 + i2) * 8 + j3])
/*     */           {
/*  89 */             par1World.b(par3 + l, par4 + j3, par5 + i2, (j3 < 4) ? this.blockIndex : 0);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  95 */     for (int i1 = 0; i1 < 16; i1++) {
/*     */       
/*  97 */       for (int j2 = 0; j2 < 16; j2++) {
/*     */         
/*  99 */         for (int k3 = 4; k3 < 8; k3++) {
/*     */           
/* 101 */           if (aflag[(i1 * 16 + j2) * 8 + k3] && par1World.a(par3 + i1, par4 + k3 - 1, par5 + j2) == amq.y.cm && par1World.b(yo.a, par3 + i1, par4 + k3, par5 + j2) > 0) {
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 106 */             yy biomegenbase = par1World.a(par3 + i1, par5 + j2);
/*     */             
/* 108 */             if (biomegenbase.A == amq.bB.cm) {
/*     */               
/* 110 */               par1World.b(par3 + i1, par4 + k3 - 1, par5 + j2, amq.bB.cm);
/*     */             }
/*     */             else {
/*     */               
/* 114 */               par1World.b(par3 + i1, par4 + k3 - 1, par5 + j2, amq.x.cm);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 120 */     if ((amq.p[this.blockIndex]).cB == mod_SCP.SCP354)
/*     */     {
/* 122 */       for (int j1 = 0; j1 < 16; j1++) {
/*     */         
/* 124 */         for (int k2 = 0; k2 < 16; k2++) {
/*     */           
/* 126 */           for (int l3 = 0; l3 < 8; l3++) {
/*     */             
/* 128 */             boolean flag1 = (!aflag[(j1 * 16 + k2) * 8 + l3] && ((j1 < 15 && aflag[((j1 + 1) * 16 + k2) * 8 + l3]) || (j1 > 0 && aflag[((j1 - 1) * 16 + k2) * 8 + l3]) || (k2 < 15 && aflag[(j1 * 16 + k2 + 1) * 8 + l3]) || (k2 > 0 && aflag[(j1 * 16 + k2 - 1) * 8 + l3]) || (l3 < 7 && aflag[(j1 * 16 + k2) * 8 + l3 + 1]) || (l3 > 0 && aflag[(j1 * 16 + k2) * 8 + l3 - 1])));
/*     */             
/* 130 */             if (flag1 && (l3 < 4 || par2Random.nextInt(2) != 0) && par1World.g(par3 + j1, par4 + l3, par5 + k2).a())
/*     */             {
/* 132 */               par1World.b(par3 + j1, par4 + l3, par5 + k2, mod_SCP.BloodBlock.cm);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 139 */     return true;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/worldgen/SCPWorldGenSCP354.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */