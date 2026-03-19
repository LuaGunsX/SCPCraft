/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import amq;
/*    */ import java.util.List;
/*    */ import qx;
/*    */ import r;
/*    */ import tx;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ 
/*    */ public class SCPItem822
/*    */   extends SCPItemDocument
/*    */ {
/*    */   public SCPItem822(int i) {
/* 17 */     super(i);
/* 18 */     this.ck = 1;
/* 19 */     e(1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/* 24 */     list.add("§eSCP-822");
/* 25 */     list.add("§7Landmine Cacti");
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean n_() {
/* 30 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/* 35 */     if (par3World.I)
/*    */     {
/* 37 */       return true;
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 42 */     int var11 = par3World.a(par4, par5, par6);
/* 43 */     par4 += r.b[par7];
/* 44 */     par5 += r.c[par7];
/* 45 */     par6 += r.d[par7];
/* 46 */     double var12 = 0.0D;
/*    */     
/* 48 */     if ((par7 == 1 && var11 == amq.bc.cm) || var11 == amq.bE.cm)
/*    */     {
/* 50 */       var12 = 0.5D;
/*    */     }
/*    */     
/* 53 */     if (spawnCreature(par3World, par1ItemStack.j(), par4 + 0.5D, par5 + var12, par6 + 0.5D) && !par2EntityPlayer.cd.d)
/*    */     {
/* 55 */       par1ItemStack.a--;
/*    */     }
/*    */ 
/*    */     
/* 59 */     par3World.a(par4 + 0.5D, par5 + 0.5D, par6 + 0.5D, "fire.ignite", 1.0F, d.nextFloat() * 0.4F + 0.8F);
/*    */     
/* 61 */     for (int j = -3; j <= 3; j++) {
/* 62 */       for (int k = 0; k <= 7; k++) {
/* 63 */         for (int n = 0; n <= 4; n++)
/* 64 */           par3World.e(par4 + j, par5 + n, par6 + k, amq.P.cm); 
/*    */       } 
/* 66 */     }  for (int m = -2; m <= 2; m++) {
/* 67 */       for (int n = 1; n <= 6; n++)
/* 68 */       { for (int b = 0; b <= 4; b++)
/* 69 */           par3World.e(par4 + m, par5 + b, par6 + n, 0);  } 
/* 70 */     }  par3World.e(par4 - 2, par5 + 2, par6, amq.al.cm);
/* 71 */     par3World.e(par4 - 2, par5 + 2, par6 + 1, amq.at.cm);
/*    */     
/* 73 */     for (int i = -3; i <= 3; i++) {
/* 74 */       for (int k = 0; k <= 7; k++) {
/* 75 */         par3World.e(par4 + i, par5 - 1, par6 + k, amq.H.cm);
/* 76 */         par3World.e(par4 + i, par5 - 2, par6 + k, amq.T.cm);
/*    */       } 
/*    */     } 
/* 79 */     tx.a(par3World, par4 - 2, par5, par6, 1, amq.aH);
/* 80 */     par3World.a(par4, par5, par6 + 4, mod_SCP.SCP822.cm, 0, true);
/*    */     
/* 82 */     par2EntityPlayer.b("SCP-822 Spawned. | [Type: §eEuclid§f]");
/*    */ 
/*    */ 
/*    */     
/* 86 */     par1ItemStack.a--;
/* 87 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 94 */     return false;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem822.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */