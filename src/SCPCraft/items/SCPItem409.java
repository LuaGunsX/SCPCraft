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
/*    */ public class SCPItem409
/*    */   extends SCPItemDocument
/*    */ {
/*    */   public SCPItem409(int i) {
/* 17 */     super(i);
/* 18 */     this.ck = 1;
/* 19 */     e(1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/* 24 */     list.add("§4SCP-409");
/* 25 */     list.add("§7Contagious Crystal");
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
/*    */     int height;
/* 58 */     for (height = -2; height <= 4; height++) {
/* 59 */       for (int length = -2; length <= 7; length++) {
/* 60 */         for (int width = -2; width <= 7; width++)
/*    */         {
/* 62 */           par3World.d(par4 + length, par5 + height, par6 + width, mod_SCP.Granite.cm, 0); } 
/*    */       } 
/* 64 */     }  for (height = 0; height <= 2; height++) {
/* 65 */       for (int length = 0; length <= 5; length++) {
/* 66 */         for (int width = 0; width <= 5; width++)
/*    */         {
/* 68 */           par3World.d(par4 + length, par5 + height, par6 + width, 0, 0); } 
/*    */       } 
/* 70 */     }  par3World.d(par4 + 3, par5 + 1, par6 + 3, mod_SCP.SCP409.cm, 0);
/* 71 */     par3World.d(par4 + 3, par5, par6 + 3, mod_SCP.Granite.cm, 0);
/* 72 */     tx.a(par3World, par4 + 3, par5, par6 - 2, 1, amq.aO);
/* 73 */     par3World.d(par4 + 3, par5 + 1, par6 - 1, 0, 0);
/* 74 */     par3World.d(par4 + 3, par5, par6 - 1, 0, 0);
/* 75 */     par3World.d(par4 + 2, par5 + 1, par6 - 3, mod_SCP.KeycardSlotLv3.cm, 2);
/* 76 */     par3World.d(par4 + 3, par5 + 1, par6 - 1, mod_SCP.KeycardSlotLv3.cm, 1);
/*    */     
/* 78 */     int i = par3World.a(par4, par5, par6);
/* 79 */     par1ItemStack.a--;
/* 80 */     par2EntityPlayer.b("SCP-409 Spawned. | [Type: §4Keter§f]");
/*    */ 
/*    */ 
/*    */     
/* 84 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 90 */     return false;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem409.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */