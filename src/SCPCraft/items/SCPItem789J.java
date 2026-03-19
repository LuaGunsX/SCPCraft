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
/*    */ public class SCPItem789J
/*    */   extends SCPItemDocument
/*    */ {
/*    */   public SCPItem789J(int i) {
/* 17 */     super(i);
/* 18 */     this.ck = 1;
/* 19 */     e(1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/* 24 */     list.add("§2SCP-789-J");
/* 25 */     list.add("§7The Butt Ghost");
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
/* 52 */     par1ItemStack.a--;
/*    */     int i;
/* 54 */     for (i = -1; i <= 3; i++) {
/* 55 */       for (int j = 0; j <= 6; j++) {
/* 56 */         for (int width = 0; width <= 6; width++)
/*    */         {
/* 58 */           par3World.d(par4 + j, par5 + i, par6 + width, amq.w.cm, 0); } 
/*    */       } 
/*    */     } 
/* 61 */     for (i = 0; i <= 2; i++) {
/* 62 */       for (int j = 1; j <= 5; j++) {
/* 63 */         for (int width = 1; width <= 5; width++)
/*    */         {
/* 65 */           par3World.d(par4 + j, par5 + i, par6 + width, 0, 0); } 
/*    */       } 
/*    */     } 
/* 68 */     for (int length = 2; length <= 3; length++)
/*    */     {
/* 70 */       par3World.d(par4 + length, par5 + 2, par6 + 6, amq.bt.cm, 0);
/*    */     }
/*    */     
/* 73 */     par3World.d(par4 + 5, par5, par6 + 1, mod_SCP.Toilet.cm, 3);
/* 74 */     par3World.d(par4 + 5, par5, par6 + 3, mod_SCP.SCP789J.cm, 3);
/* 75 */     par3World.d(par4 + 5, par5, par6 + 5, mod_SCP.Toilet.cm, 3);
/* 76 */     tx.a(par3World, par4 + 1, par5, par6, 1, amq.aH);
/*    */     
/* 78 */     tx.a(par3World, par4 + 4, par5, par6 + 1, 0, amq.aH);
/* 79 */     tx.a(par3World, par4 + 4, par5, par6 + 3, 0, amq.aH);
/* 80 */     tx.a(par3World, par4 + 4, par5, par6 + 5, 0, amq.aH);
/*    */     
/* 82 */     for (int height = 0; height <= 2; height++) {
/*    */       
/* 84 */       par3World.d(par4 + 5, par5 + height, par6 + 2, amq.w.cm, 0);
/* 85 */       par3World.d(par4 + 5, par5 + height, par6 + 4, amq.w.cm, 0);
/* 86 */       par3World.d(par4 + 4, par5 + height, par6 + 2, amq.w.cm, 0);
/* 87 */       par3World.d(par4 + 4, par5 + height, par6 + 4, amq.w.cm, 0);
/*    */     } 
/*    */     
/* 90 */     par2EntityPlayer.b("SCP-789-J Spawned. | [Type: §2Safe§f]");
/*    */     
/* 92 */     return true;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem789J.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */