/*    */ package SCPCraft.worldgen;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import abm;
/*    */ import agi;
/*    */ import amq;
/*    */ import java.util.Random;
/*    */ import yc;
/*    */ 
/*    */ 
/*    */ public class SCPWorldGen006
/*    */   extends abm
/*    */ {
/*    */   private int blockIndex;
/*    */   
/*    */   public SCPWorldGen006(int par1) {
/* 17 */     this.blockIndex = par1;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(yc par1World, Random par2Random, int par3, int par4, int par5) {
/* 22 */     if (par1World.t(par3, par4 - 1, par5) && (par1World.g(par3, par4 - 1, par5) != agi.j || par1World.g(par3, par4 - 1, par5) != agi.k)) {
/* 23 */       par1World.e(par3, par4, par5, mod_SCP.SCP006Flowing.cm);
/* 24 */       par1World.e(par3, par4, par5 + 1, 0);
/* 25 */       par1World.e(par3 - 1, par4, par5 + 1, 0);
/* 26 */       par1World.e(par3, par4, par5 + 2, 0);
/* 27 */       par1World.e(par3 + 1, par4, par5 + 2, 0);
/* 28 */       par1World.e(par3 + 2, par4, par5 + 2, 0);
/* 29 */       par1World.e(par3 + 3, par4, par5 + 2, 0);
/* 30 */       par1World.e(par3 + 2, par4, par5 + 3, 0);
/*    */       
/* 32 */       for (int m = -5; m <= 5; m++) {
/* 33 */         for (int n = -5; n <= 5; n++) {
/*    */           
/* 35 */           if (par1World.a(par3 + m, par4, par5 + n) != 0 && par1World.a(par3 + m, par4 + 1, par5 + n) == 0 && par2Random.nextInt(3) == 0)
/* 36 */             par1World.d(par3 + m, par4 + 1, par5 + n, amq.aa.cm, 1); 
/*    */         } 
/*    */       } 
/* 39 */       return true;
/* 40 */     }  return false;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/worldgen/SCPWorldGen006.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */