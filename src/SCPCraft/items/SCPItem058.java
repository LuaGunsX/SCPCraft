/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.entities.SCPEntity058;
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
/*    */ public class SCPItem058
/*    */   extends SCPItemDocument
/*    */ {
/*    */   public SCPItem058(int i) {
/* 19 */     super(i);
/* 20 */     this.ck = 1;
/* 21 */     e(1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/* 26 */     list.add("§4SCP-058");
/* 27 */     list.add("§7The Heart of Darkness");
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean n_() {
/* 32 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/* 37 */     if (par3World.I)
/*    */     {
/* 39 */       return true;
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 44 */     int var11 = par3World.a(par4, par5, par6);
/* 45 */     par4 += r.b[par7];
/* 46 */     par5 += r.c[par7];
/* 47 */     par6 += r.d[par7];
/* 48 */     double var12 = 0.0D;
/*    */     
/* 50 */     if ((par7 == 1 && var11 == amq.bc.cm) || var11 == amq.bE.cm)
/*    */     {
/* 52 */       var12 = 0.5D;
/*    */     }
/*    */     
/* 55 */     if (spawnCreature(par3World, par1ItemStack.j(), par4 + 0.5D, par5 + var12, par6 + 0.5D) && !par2EntityPlayer.cd.d)
/*    */     {
/* 57 */       par1ItemStack.a--;
/*    */     }
/*    */     int height;
/* 60 */     for (height = -1; height <= 3; height++) {
/* 61 */       for (int length = -1; length <= 6; length++) {
/* 62 */         for (int width = -1; width <= 6; width++)
/*    */         {
/* 64 */           par3World.d(par4 + length, par5 + height, par6 + width, mod_SCP.Locker.cm, 0); } 
/*    */       } 
/* 66 */     }  for (height = 0; height <= 2; height++) {
/* 67 */       for (int length = 0; length <= 5; length++) {
/* 68 */         for (int width = 0; width <= 5; width++)
/*    */         {
/* 70 */           par3World.d(par4 + length, par5 + height, par6 + width, 0, 0); } 
/*    */       } 
/* 72 */     }  par3World.d(par4 + 2, par5 + 1, par6 - 2, mod_SCP.KeycardSlotLv3.cm, 2);
/* 73 */     par3World.d(par4 + 4, par5 + 1, par6, mod_SCP.KeycardSlotLv3.cm, 0);
/* 74 */     tx.a(par3World, par4 + 3, par5, par6 - 1, 1, amq.aO);
/*    */     
/* 76 */     par2EntityPlayer.b("SCP-058 Spawned. | [Type: §4Keter§f]");
/*    */     
/* 78 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 84 */     SCPEntity058 var8 = new SCPEntity058(par0World);
/* 85 */     var8.b(par2 + 3.0D, par4 + 1.0D, par6 + 3.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 86 */     par0World.d((lq)var8);
/* 87 */     var8.aO();
/*    */     
/* 89 */     return (var8 != null);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem058.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */