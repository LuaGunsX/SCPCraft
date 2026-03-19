/*     */ package SCPCraft.worldgen;
/*     */ 
/*     */ import abm;
/*     */ import java.util.Random;
/*     */ import ke;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPWorldGenCustomMinable
/*     */   extends abm
/*     */ {
/*     */   private int minableBlockId;
/*     */   private int numberOfBlocks;
/*     */   private int baseBlock;
/*     */   
/*     */   public SCPWorldGenCustomMinable(int i, int j, int k) {
/*  21 */     this.minableBlockId = i;
/*  22 */     this.numberOfBlocks = j;
/*  23 */     this.baseBlock = k;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(yc world, Random random, int i, int j, int k) {
/*  28 */     float f = random.nextFloat() * 3.141593F;
/*  29 */     double d = ((i + 8) + ke.a(f) * this.numberOfBlocks / 8.0F);
/*  30 */     double d1 = ((i + 8) - ke.a(f) * this.numberOfBlocks / 8.0F);
/*  31 */     double d2 = ((k + 8) + ke.b(f) * this.numberOfBlocks / 8.0F);
/*  32 */     double d3 = ((k + 8) - ke.b(f) * this.numberOfBlocks / 8.0F);
/*  33 */     double d4 = (j + random.nextInt(3) + 2);
/*  34 */     double d5 = (j + random.nextInt(3) + 2);
/*  35 */     for (int l = 0; l <= this.numberOfBlocks; l++) {
/*     */       
/*  37 */       double d6 = d + (d1 - d) * l / this.numberOfBlocks;
/*  38 */       double d7 = d4 + (d5 - d4) * l / this.numberOfBlocks;
/*  39 */       double d8 = d2 + (d3 - d2) * l / this.numberOfBlocks;
/*  40 */       double d9 = random.nextDouble() * this.numberOfBlocks / 16.0D;
/*  41 */       double d10 = (ke.a(l * 3.141593F / this.numberOfBlocks) + 1.0F) * d9 + 1.0D;
/*  42 */       double d11 = (ke.a(l * 3.141593F / this.numberOfBlocks) + 1.0F) * d9 + 1.0D;
/*  43 */       int i1 = ke.c(d6 - d10 / 2.0D);
/*  44 */       int j1 = ke.c(d7 - d11 / 2.0D);
/*  45 */       int k1 = ke.c(d8 - d10 / 2.0D);
/*  46 */       int l1 = ke.c(d6 + d10 / 2.0D);
/*  47 */       int i2 = ke.c(d7 + d11 / 2.0D);
/*  48 */       int j2 = ke.c(d8 + d10 / 2.0D);
/*  49 */       for (int k2 = i1; k2 <= l1; k2++) {
/*     */         
/*  51 */         double d12 = (k2 + 0.5D - d6) / d10 / 2.0D;
/*  52 */         if (d12 * d12 < 1.0D)
/*     */         {
/*     */ 
/*     */           
/*  56 */           for (int l2 = j1; l2 <= i2; l2++) {
/*     */             
/*  58 */             double d13 = (l2 + 0.5D - d7) / d11 / 2.0D;
/*  59 */             if (d12 * d12 + d13 * d13 < 1.0D)
/*     */             {
/*     */ 
/*     */               
/*  63 */               for (int i3 = k1; i3 <= j2; i3++) {
/*     */                 
/*  65 */                 double d14 = (i3 + 0.5D - d8) / d10 / 2.0D;
/*  66 */                 if (d12 * d12 + d13 * d13 + d14 * d14 < 1.0D && world.a(k2, l2, i3) == this.baseBlock)
/*     */                 {
/*  68 */                   world.b(k2, l2, i3, this.minableBlockId);
/*     */                 }
/*     */               } 
/*     */             }
/*     */           } 
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/*  78 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean generate(yc world, Random random, int i, int j, int k, int m) {
/*  83 */     float f = random.nextFloat() * 3.141593F;
/*  84 */     double d = ((i + 8) + ke.a(f) * this.numberOfBlocks / 8.0F);
/*  85 */     double d1 = ((i + 8) - ke.a(f) * this.numberOfBlocks / 8.0F);
/*  86 */     double d2 = ((k + 8) + ke.b(f) * this.numberOfBlocks / 8.0F);
/*  87 */     double d3 = ((k + 8) - ke.b(f) * this.numberOfBlocks / 8.0F);
/*  88 */     double d4 = (j + random.nextInt(3) + 2);
/*  89 */     double d5 = (j + random.nextInt(3) + 2);
/*  90 */     for (int l = 0; l <= this.numberOfBlocks; l++) {
/*     */       
/*  92 */       double d6 = d + (d1 - d) * l / this.numberOfBlocks;
/*  93 */       double d7 = d4 + (d5 - d4) * l / this.numberOfBlocks;
/*  94 */       double d8 = d2 + (d3 - d2) * l / this.numberOfBlocks;
/*  95 */       double d9 = random.nextDouble() * this.numberOfBlocks / 16.0D;
/*  96 */       double d10 = (ke.a(l * 3.141593F / this.numberOfBlocks) + 1.0F) * d9 + 1.0D;
/*  97 */       double d11 = (ke.a(l * 3.141593F / this.numberOfBlocks) + 1.0F) * d9 + 1.0D;
/*  98 */       int i1 = ke.c(d6 - d10 / 2.0D);
/*  99 */       int j1 = ke.c(d7 - d11 / 2.0D);
/* 100 */       int k1 = ke.c(d8 - d10 / 2.0D);
/* 101 */       int l1 = ke.c(d6 + d10 / 2.0D);
/* 102 */       int i2 = ke.c(d7 + d11 / 2.0D);
/* 103 */       int j2 = ke.c(d8 + d10 / 2.0D);
/* 104 */       for (int k2 = i1; k2 <= l1; k2++) {
/*     */         
/* 106 */         double d12 = (k2 + 0.5D - d6) / d10 / 2.0D;
/* 107 */         if (d12 * d12 < 1.0D)
/*     */         {
/*     */ 
/*     */           
/* 111 */           for (int l2 = j1; l2 <= i2; l2++) {
/*     */             
/* 113 */             double d13 = (l2 + 0.5D - d7) / d11 / 2.0D;
/* 114 */             if (d12 * d12 + d13 * d13 < 1.0D)
/*     */             {
/*     */ 
/*     */               
/* 118 */               for (int i3 = k1; i3 <= j2; i3++) {
/*     */                 
/* 120 */                 double d14 = (i3 + 0.5D - d8) / d10 / 2.0D;
/* 121 */                 if (d12 * d12 + d13 * d13 + d14 * d14 < 1.0D && world.a(k2, l2, i3) == this.baseBlock && world.a(k2, l2, i3) == m)
/*     */                 {
/* 123 */                   world.b(k2, l2, i3, this.minableBlockId);
/*     */                 }
/*     */               } 
/*     */             }
/*     */           } 
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 133 */     return true;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/worldgen/SCPWorldGenCustomMinable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */