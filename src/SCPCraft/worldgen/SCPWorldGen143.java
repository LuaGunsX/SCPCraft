/*    */ package SCPCraft.worldgen;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import abm;
/*    */ import amq;
/*    */ import java.util.Random;
/*    */ import yc;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SCPWorldGen143
/*    */   extends abm
/*    */ {
/*    */   public boolean a(yc world, Random random, int i, int j, int k) {
/* 18 */     int l = random.nextInt(1) + 4;
/* 19 */     boolean flag = true;
/* 20 */     if (j < 1 || j + l + 1 > 256)
/*    */     {
/* 22 */       return false;
/*    */     }
/* 24 */     for (int i1 = j; i1 <= j + 1 + l; i1++) {
/*    */       
/* 26 */       byte byte0 = 1;
/* 27 */       if (i1 == j)
/*    */       {
/* 29 */         byte0 = 0;
/*    */       }
/* 31 */       if (i1 >= j + 1 + l - 2)
/*    */       {
/* 33 */         byte0 = 2;
/*    */       }
/* 35 */       for (int i2 = i - byte0; i2 <= i + byte0 && flag; i2++) {
/*    */         
/* 37 */         for (int l2 = k - byte0; l2 <= k + byte0 && flag; l2++) {
/*    */           
/* 39 */           if (i1 >= 0 && i1 < 256) {
/*    */             
/* 41 */             int j3 = world.a(i2, i1, l2);
/* 42 */             if (j3 != 0 && j3 != mod_SCP.SCP143Leaves.cm)
/*    */             {
/* 44 */               flag = false;
/*    */             }
/*    */           } else {
/*    */             
/* 48 */             flag = false;
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 56 */     if (!flag)
/*    */     {
/* 58 */       return false;
/*    */     }
/* 60 */     int j1 = world.a(i, j - 1, k);
/* 61 */     if ((j1 != amq.x.cm && j1 != amq.y.cm) || j >= 256 - l - 1)
/*    */     {
/*    */       
/* 64 */       return false;
/*    */     }
/* 66 */     world.b(i, j - 1, k, amq.y.cm);
/* 67 */     for (int k1 = j - 3 + l; k1 <= j + l; k1++) {
/*    */       
/* 69 */       int j2 = k1 - j + l;
/* 70 */       int i3 = 1 - j2 / 2;
/* 71 */       for (int k3 = i - i3; k3 <= i + i3; k3++) {
/*    */         
/* 73 */         int l3 = k3 - i;
/* 74 */         for (int i4 = k - i3; i4 <= k + i3; i4++) {
/*    */           
/* 76 */           int j4 = i4 - k;
/* 77 */           if ((Math.abs(l3) != i3 || Math.abs(j4) != i3 || (random.nextInt(2) != 0 && j2 != 0)) && !amq.q[world.a(k3, k1, i4)])
/*    */           {
/* 79 */             a(world, k3, k1, i4, mod_SCP.SCP143Leaves.cm, 0);
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 87 */     for (int l1 = 0; l1 < l; l1++) {
/*    */       
/* 89 */       int k2 = world.a(i, j + l1, k);
/* 90 */       if (k2 == 0 || k2 == mod_SCP.SCP143Leaves.cm)
/*    */       {
/* 92 */         a(world, i, j + l1, k, mod_SCP.SCP143Log.cm, 0);
/*    */       }
/*    */     } 
/*    */     
/* 96 */     return true;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/worldgen/SCPWorldGen143.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */