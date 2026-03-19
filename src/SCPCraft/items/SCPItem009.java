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
/*    */ public class SCPItem009
/*    */   extends SCPItemDocument
/*    */ {
/*    */   public SCPItem009(int i) {
/* 16 */     super(i);
/* 17 */     this.ck = 1;
/* 18 */     e(1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/* 23 */     list.add("§eSCP-009");
/* 24 */     list.add("§7Red Ice");
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
/*    */     int width;
/* 57 */     for (width = -1; width <= 5; width++) {
/*    */       
/* 59 */       for (int length = -1; length <= 3; length++) {
/*    */         
/* 61 */         for (int height = -1; height <= 3; height++)
/*    */         {
/* 63 */           par3World.b(par4 + width, par5 + height, par6 + length, mod_SCP.Locker.cm);
/*    */         }
/*    */       } 
/*    */     } 
/* 67 */     for (width = 0; width <= 4; width++) {
/*    */       
/* 69 */       for (int length = 0; length <= 2; length++) {
/*    */         
/* 71 */         for (int height = 0; height <= 2; height++)
/*    */         {
/* 73 */           par3World.b(par4 + width, par5 + height, par6 + length, mod_SCP.SCP009.cm);
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 78 */     par2EntityPlayer.b("SCP-009 Spawned. | [Type: §eEuclid§f]");
/*    */     
/* 80 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 86 */     return false;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem009.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */