/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import amq;
/*    */ import java.util.List;
/*    */ import qx;
/*    */ import r;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ 
/*    */ public class SCPItem143
/*    */   extends SCPItemDocument
/*    */ {
/*    */   public SCPItem143(int i) {
/* 16 */     super(i);
/* 17 */     this.ck = 1;
/* 18 */     e(1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/* 23 */     list.add("§eSCP-143");
/* 24 */     list.add("§7The Bladewood Grove");
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean n_() {
/* 29 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/* 34 */     if (par3World.I)
/*    */     {
/* 36 */       return true;
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 41 */     int var11 = par3World.a(par4, par5, par6);
/* 42 */     par4 += r.b[par7];
/* 43 */     par5 += r.c[par7];
/* 44 */     par6 += r.d[par7];
/* 45 */     double var12 = 0.0D;
/*    */     
/* 47 */     if ((par7 == 1 && var11 == amq.bc.cm) || var11 == amq.bE.cm)
/*    */     {
/* 49 */       var12 = 0.5D;
/*    */     }
/*    */     
/* 52 */     if (spawnCreature(par3World, par1ItemStack.j(), par4 + 0.5D, par5 + var12, par6 + 0.5D) && !par2EntityPlayer.cd.d)
/*    */     {
/* 54 */       par1ItemStack.a--;
/*    */     }
/*    */ 
/*    */     
/* 58 */     par3World.a(par4 + 0.5D, par5 + 0.5D, par6 + 0.5D, "fire.ignite", 1.0F, d.nextFloat() * 0.4F + 0.8F);
/*    */     
/* 60 */     for (int j = -3; j <= 3; j++) {
/* 61 */       for (int k = 0; k <= 7; k++) {
/* 62 */         for (int n = 0; n <= 4; n++)
/* 63 */           par3World.e(par4 + j, par5 + n, par6 + k, amq.P.cm); 
/*    */       } 
/* 65 */     }  for (int m = -2; m <= 2; m++) {
/* 66 */       for (int n = 1; n <= 6; n++) {
/* 67 */         for (int b = 0; b <= 4; b++)
/* 68 */           par3World.e(par4 + m, par5 + b, par6 + n, 0); 
/*    */       } 
/* 70 */     }  par3World.e(par4 - 2, par5 + 2, par6, amq.al.cm);
/* 71 */     par3World.e(par4 - 2, par5 + 2, par6 + 1, amq.at.cm);
/*    */     
/* 73 */     for (int i = -3; i <= 3; i++) {
/* 74 */       for (int k = 0; k <= 7; k++)
/* 75 */         par3World.e(par4 + i, par5 - 1, par6 + k, amq.x.cm); 
/* 76 */     }  par3World.e(par4, par5, par6 + 4, mod_SCP.SCP143Sapling.cm);
/*    */     
/* 78 */     par2EntityPlayer.b("SCP-143 Spawned. | [Type: §eEuclid§f]");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 85 */     par1ItemStack.a--;
/* 86 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 93 */     return false;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem143.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */