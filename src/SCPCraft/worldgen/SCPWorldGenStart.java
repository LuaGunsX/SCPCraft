/*    */ package SCPCraft.worldgen;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import abm;
/*    */ import amq;
/*    */ import anv;
/*    */ import anw;
/*    */ import any;
/*    */ import java.util.Random;
/*    */ import yc;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SCPWorldGenStart
/*    */   extends abm
/*    */ {
/*    */   public void create(yc par1World, int par3, int par4, int par5) {
/* 21 */     par1World.d(par3 - 1, par4, par5, amq.cj.cm, 0);
/* 22 */     par1World.d(par3 + 1, par4, par5, amq.cj.cm, 0);
/*    */     
/* 24 */     par1World.d(par3 + 1, par4 + 1, par5, amq.cj.cm, 1);
/* 25 */     par1World.d(par3 - 1, par4 + 1, par5, amq.cj.cm, 1);
/*    */     
/* 27 */     for (int m = -1; m <= 1; m++) {
/* 28 */       for (int n = 0; n <= 1; n++)
/* 29 */         par1World.d(par3 + m, par4 + n, par5 + 1, amq.A.cm, 2); 
/*    */     } 
/* 31 */     par1World.d(par3 - 1, par4, par5 - 1, amq.aL.cm, 2);
/* 32 */     anv te1 = (anv)par1World.q(par3 - 1, par4, par5 - 1);
/* 33 */     te1.a[1] = "Phuck_Yu_Too";
/* 34 */     te1.a[2] = "[coder]";
/*    */     
/* 36 */     par1World.d(par3 + 1, par4, par5 - 1, amq.aL.cm, 2);
/* 37 */     anv te2 = (anv)par1World.q(par3 + 1, par4, par5 - 1);
/* 38 */     te2.a[1] = "TheDarkKnight";
/* 39 */     te2.a[2] = "[coder]";
/*    */     
/* 41 */     par1World.d(par3, par4 + 1, par5, amq.aL.cm, 2);
/* 42 */     anv te3 = (anv)par1World.q(par3, par4 + 1, par5);
/* 43 */     te3.a[0] = "Thank you for installing";
/* 44 */     te3.a[1] = "§l" + mod_SCP.SCPCraftVersion;
/* 45 */     te3.a[2] = "Hope you'll enjoy the mod";
/* 46 */     te3.a[3] = ":)";
/*    */     
/* 48 */     any var12 = par1World.q(par3 + 1, par4 + 1, par5);
/* 49 */     ((anw)var12).a(3, "sor1n");
/* 50 */     any var13 = par1World.q(par3 - 1, par4 + 1, par5);
/* 51 */     ((anw)var13).a(3, "_xXMasterBaitXx_");
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(yc par1World, Random par2Random, int par3, int par4, int par5) {
/* 56 */     return true;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/worldgen/SCPWorldGenStart.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */