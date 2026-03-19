/*     */ package SCPCraft.worldgen;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import anv;
/*     */ import java.util.Random;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPWorldGenPocketDimension
/*     */ {
/*     */   public static String mob;
/*     */   public static anv tempSign;
/*     */   
/*     */   public static boolean generate(yc world, int i, int j, int k) {
/*  19 */     Random random = new Random();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  35 */     genCorridor(world, i, 5, k, "lenght");
/*  36 */     genCorridor(world, i + 9, 5, k, "lenght");
/*  37 */     genCorridor(world, i - 9, 5, k, "lenght");
/*  38 */     genCorridor(world, i - 18, 5, k, "lenght");
/*  39 */     genCorridor(world, i + 18, 5, k, "lenght");
/*  40 */     genCorridor(world, i - 27, 5, k, "lenght");
/*  41 */     genCorridor(world, i + 27, 5, k, "corner1");
/*  42 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private static void genCorridor(yc world, int i, int j, int k, String type) {
/*  47 */     if (type == "lenght") {
/*     */       int length;
/*  49 */       for (length = -4; length <= 0; length++) {
/*  50 */         for (int width = 0; width <= 9; width++) {
/*  51 */           for (int height = 0; height <= 1; height++)
/*     */           {
/*  53 */             world.d(i + width, j + height, k + length, 0, 0); } 
/*     */         } 
/*  55 */       }  for (length = -4; length <= 0; length++) {
/*  56 */         for (int width = 0; width <= 9; width++) {
/*  57 */           for (int height = 0; height <= 1; height++)
/*     */           
/*  59 */           { world.d(i + width, j + height, k, mod_SCP.SCPspawner.cm, 0);
/*  60 */             world.d(i + width, j + height, k - 4, mod_SCP.SCPspawner.cm, 0);
/*  61 */             world.d(i + width, j - 1, k + length, mod_SCP.SCPspawner.cm, 0);
/*  62 */             world.d(i + width, j + 2, k + length, mod_SCP.SCPspawner.cm, 0); } 
/*     */         } 
/*     */       } 
/*  65 */     }  if (type == "corner1") {
/*     */       int length;
/*  67 */       for (length = -4; length <= 0; length++) {
/*  68 */         for (int width = 0; width <= 2; width++) {
/*  69 */           for (int height = 0; height <= 1; height++)
/*     */           {
/*  71 */             world.d(i + width, j + height, k + length, 0, 0); } 
/*     */         } 
/*  73 */       }  for (length = -4; length <= 0; length++) {
/*  74 */         for (int width = 0; width <= 2; width++) {
/*  75 */           for (int height = 0; height <= 1; height++)
/*     */           
/*  77 */           { world.d(i + width, j + height, k, mod_SCP.SCPspawner.cm, 0);
/*  78 */             world.d(i + width, j + height, k - 4, mod_SCP.SCPspawner.cm, 0);
/*  79 */             world.d(i + width, j - 1, k + length, mod_SCP.SCPspawner.cm, 0);
/*  80 */             world.d(i + width, j + 2, k + length, mod_SCP.SCPspawner.cm, 0); } 
/*     */         } 
/*  82 */       }  for (length = 0; length <= 4; length++) {
/*  83 */         for (int width = 0; width <= 3; width++) {
/*  84 */           for (int height = 0; height <= 1; height++)
/*     */           
/*  86 */           { world.d(i + width, j + height, k, mod_SCP.SCPspawner.cm, 0);
/*  87 */             world.d(i - 1, j + height, k + length, mod_SCP.SCPspawner.cm, 0);
/*  88 */             world.d(i + width, j - 1, k + length, mod_SCP.SCPspawner.cm, 0);
/*  89 */             world.d(i + width, j + 2, k + length, mod_SCP.SCPspawner.cm, 0); } 
/*     */         } 
/*  91 */       }  for (length = -3; length <= 4; length++) {
/*  92 */         for (int width = 0; width <= 3; width++) {
/*  93 */           for (int height = 0; height <= 1; height++)
/*     */           {
/*  95 */             world.d(i + 3, j + height, k + length, mod_SCP.SCPspawner.cm, 0); } 
/*     */         } 
/*     */       } 
/*  98 */       for (length = -1; length <= 4; length++) {
/*  99 */         for (int width = 0; width <= 2; width++) {
/* 100 */           for (int height = 0; height <= 1; height++)
/*     */           {
/* 102 */             world.d(i + width, j + height, k + length, 0, 0);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/worldgen/SCPWorldGenPocketDimension.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */