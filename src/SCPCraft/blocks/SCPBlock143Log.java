/*    */ package SCPCraft.blocks;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import agi;
/*    */ import amq;
/*    */ import java.util.Random;
/*    */ import qx;
/*    */ import yc;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SCPBlock143Log
/*    */   extends amq
/*    */ {
/*    */   public SCPBlock143Log(int i) {
/* 16 */     super(i, agi.d);
/*    */     
/* 18 */     a(mod_SCP.tabBlockSCP);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 23 */     return "/SCPCraft/textures/SCPblox.png";
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(Random random) {
/* 28 */     return 1;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int i, Random random, int j) {
/* 33 */     return mod_SCP.SCP143Log.cm;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(yc world, qx entityplayer, int i, int j, int k, int l) {
/* 38 */     super.a(world, entityplayer, i, j, k, l);
/*    */   }
/*    */ 
/*    */   
/*    */   public void onBlockRemoval(yc world, int i, int j, int k) {
/* 43 */     byte byte0 = 4;
/* 44 */     int l = byte0 + 1;
/* 45 */     if (world.d(i - l, j - l, k - l, i + l, j + l, k + l))
/*    */     {
/* 47 */       for (int i1 = -byte0; i1 <= byte0; i1++) {
/*    */         
/* 49 */         for (int j1 = -byte0; j1 <= byte0; j1++) {
/*    */           
/* 51 */           for (int k1 = -byte0; k1 <= byte0; k1++) {
/*    */             
/* 53 */             int l1 = world.a(i + i1, j + j1, k + k1);
/* 54 */             if (l1 == mod_SCP.SCP143Leaves.cm) {
/*    */ 
/*    */ 
/*    */               
/* 58 */               int i2 = world.h(i + i1, j + j1, k + k1);
/* 59 */               if ((i2 & 0x8) == 0)
/*    */               {
/* 61 */                 world.d(i + i1, j + j1, k + k1, i2 | 0x8);
/*    */               }
/*    */             } 
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int a(int i, int j) {
/* 74 */     if (i == 0)
/* 75 */       return 0; 
/* 76 */     if (i == 1)
/* 77 */       return 0; 
/* 78 */     if (i == 2)
/* 79 */       return 3; 
/* 80 */     if (i == 3)
/* 81 */       return 3; 
/* 82 */     if (i == 4)
/* 83 */       return 3; 
/* 84 */     if (i == 5) {
/* 85 */       return 3;
/*    */     }
/* 87 */     if (j == 1)
/*    */     {
/* 89 */       return 116;
/*    */     }
/* 91 */     return (j != 2) ? 20 : 117;
/*    */   }
/*    */ 
/*    */   
/*    */   public int b(int i) {
/* 96 */     return i;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlock143Log.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */