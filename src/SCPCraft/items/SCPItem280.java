/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.entities.SCPEntity280;
/*    */ import SCPCraft.mod_SCP;
/*    */ import amq;
/*    */ import java.util.List;
/*    */ import lq;
/*    */ import qx;
/*    */ import r;
/*    */ import tx;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ 
/*    */ public class SCPItem280
/*    */   extends SCPItemDocument
/*    */ {
/*    */   public SCPItem280(int i) {
/* 19 */     super(i);
/* 20 */     this.ck = 1;
/* 21 */     e(1);
/* 22 */     a(mod_SCP.tabSCP);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/* 27 */     list.add("§4SCP-280");
/* 28 */     list.add("§7The Eyes in the Dark");
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean n_() {
/* 33 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/* 38 */     if (par3World.I)
/*    */     {
/* 40 */       return true;
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 45 */     int var11 = par3World.a(par4, par5, par6);
/* 46 */     par4 += r.b[par7];
/* 47 */     par5 += r.c[par7];
/* 48 */     par6 += r.d[par7];
/* 49 */     double var12 = 0.0D;
/*    */     
/* 51 */     if ((par7 == 1 && var11 == amq.bc.cm) || var11 == amq.bE.cm)
/*    */     {
/* 53 */       var12 = 0.5D;
/*    */     }
/*    */     
/* 56 */     if (spawnCreature(par3World, par1ItemStack.j(), par4 + 0.5D, par5 + var12, par6 + 0.5D) && !par2EntityPlayer.cd.d)
/*    */     {
/* 58 */       par1ItemStack.a--;
/*    */     }
/*    */     int height;
/* 61 */     for (height = -1; height <= 3; height++) {
/* 62 */       for (int length = -1; length <= 5; length++) {
/* 63 */         for (int width = -1; width <= 5; width++)
/*    */         {
/* 65 */           par3World.d(par4 + length, par5 + height, par6 + width, amq.al.cm, 0); } 
/*    */       } 
/* 67 */     }  for (height = 0; height <= 2; height++) {
/* 68 */       for (int length = 0; length <= 4; length++) {
/* 69 */         for (int width = 0; width <= 4; width++)
/*    */         {
/* 71 */           par3World.d(par4 + length, par5 + height, par6 + width, 0, 0); } 
/*    */       } 
/* 73 */     }  par3World.d(par4 + 2, par5 + 1, par6 - 2, mod_SCP.KeycardSlotLv3.cm, 2);
/* 74 */     par3World.d(par4 + 4, par5 + 1, par6, mod_SCP.KeycardSlotLv3.cm, 0);
/* 75 */     tx.a(par3World, par4 + 3, par5, par6 - 1, 1, amq.aO);
/*    */     
/* 77 */     par2EntityPlayer.b("SCP-280 Spawned. | [Type: §4Keter§f]");
/*    */ 
/*    */ 
/*    */     
/* 81 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 87 */     SCPEntity280 var8 = new SCPEntity280(par0World);
/* 88 */     var8.b(par2 + 3.0D, par4 + 1.0D, par6 + 2.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 89 */     par0World.d((lq)var8);
/* 90 */     var8.aO();
/*    */     
/* 92 */     return (var8 != null);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem280.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */