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
/*    */ public class SCPItem513
/*    */   extends SCPItemDocument
/*    */ {
/*    */   public SCPItem513(int i) {
/* 17 */     super(i);
/* 18 */     this.ck = 1;
/* 19 */     e(1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/* 24 */     list.add("§eSCP-513");
/* 25 */     list.add("§7The Cowbell");
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
/*    */     int height;
/* 52 */     for (height = -1; height <= 4; height++) {
/* 53 */       for (int length = -1; length <= 7; length++) {
/* 54 */         for (int width = -1; width <= 7; width++)
/*    */         {
/* 56 */           par3World.d(par4 + length, par5 + height, par6 + width, amq.al.cm, 0); } 
/*    */       } 
/* 58 */     }  for (height = 0; height <= 3; height++) {
/* 59 */       for (int length = 0; length <= 6; length++) {
/* 60 */         for (int width = 0; width <= 6; width++)
/*    */         {
/* 62 */           par3World.d(par4 + length, par5 + height, par6 + width, 0, 0); } 
/*    */       } 
/* 64 */     }  par3World.d(par4 + 3, par5 + 1, par6 + 3, mod_SCP.SCP513.cm, 0);
/* 65 */     par3World.d(par4 + 3, par5, par6 + 3, amq.al.cm, 0);
/* 66 */     tx.a(par3World, par4 + 3, par5, par6 - 1, 1, amq.aO);
/* 67 */     par3World.d(par4 + 3, par5 + 1, par6, 0, 0);
/* 68 */     par3World.d(par4 + 3, par5, par6, 0, 0);
/* 69 */     par3World.d(par4 + 2, par5 + 1, par6 - 2, mod_SCP.KeycardSlotLv2.cm, 2);
/* 70 */     par3World.d(par4 + 4, par5 + 1, par6, mod_SCP.KeycardSlotLv2.cm, 4);
/* 71 */     par1ItemStack.a--;
/* 72 */     par2EntityPlayer.b("SCP-513 Spawned. | [Type: §eEuclid§f]");
/*    */     
/* 74 */     return true;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem513.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */