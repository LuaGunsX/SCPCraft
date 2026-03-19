/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.entities.SCPEntity096Docile;
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
/*    */ public class SCPItem096
/*    */   extends SCPItemDocument
/*    */ {
/*    */   public SCPItem096(int i) {
/* 19 */     super(i);
/* 20 */     this.ck = 1;
/* 21 */     e(1);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/* 27 */     list.add("§eSCP-096");
/* 28 */     list.add("§7Shy Guy");
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
/*    */     
/* 61 */     int i = par3World.a(par4, par5, par6);
/*    */     int height;
/* 63 */     for (height = -1; height <= 5; height++) {
/* 64 */       for (int length = -1; length <= 6; length++) {
/* 65 */         for (int width = -1; width <= 6; width++)
/*    */         {
/* 67 */           par3World.d(par4 + length, par5 + height, par6 + width, mod_SCP.Locker.cm, 0); } 
/*    */       } 
/* 69 */     }  par3World.d(par4 + 1, par5 + 1, par6 + 7, 0, 0);
/* 70 */     par3World.d(par4 + 1, par5, par6 + 7, 0, 0);
/*    */     
/* 72 */     for (height = 0; height <= 4; height++) {
/* 73 */       for (int length = 0; length <= 5; length++) {
/* 74 */         for (int width = 0; width <= 5; width++)
/*    */         {
/* 76 */           par3World.d(par4 + length, par5 + height, par6 + width, 0, 0); } 
/*    */       } 
/*    */     } 
/* 79 */     par3World.d(par4 + 2, par5 + 1, par6 - 2, mod_SCP.KeycardSlotLv2.cm, 2);
/* 80 */     par3World.d(par4 + 4, par5 + 1, par6, mod_SCP.KeycardSlotLv2.cm, 0);
/* 81 */     tx.a(par3World, par4 + 3, par5, par6 - 1, 1, amq.aO);
/*    */     
/* 83 */     par2EntityPlayer.b("SCP-096 Spawned. | [Type: §eEuclid§f]");
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 88 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 94 */     SCPEntity096Docile var8 = new SCPEntity096Docile(par0World);
/* 95 */     var8.b(par2 + 3.0D, par4, par6 + 3.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 96 */     par0World.d((lq)var8);
/* 97 */     var8.aO();
/*    */     
/* 99 */     return (var8 != null);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem096.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */