/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.entities.SCPEntity106;
/*    */ import SCPCraft.mod_SCP;
/*    */ import amq;
/*    */ import java.util.List;
/*    */ import lq;
/*    */ import qx;
/*    */ import r;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ 
/*    */ public class SCPItem106
/*    */   extends SCPItemDocument
/*    */ {
/*    */   public SCPItem106(int i) {
/* 18 */     super(i);
/* 19 */     this.ck = 1;
/* 20 */     e(1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/* 25 */     list.add("§4SCP-106");
/* 26 */     list.add("§7The Old Man");
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean n_() {
/* 31 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/* 36 */     if (par3World.I)
/*    */     {
/* 38 */       return true;
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 43 */     int var11 = par3World.a(par4, par5, par6);
/* 44 */     par4 += r.b[par7];
/* 45 */     par5 += r.c[par7];
/* 46 */     par6 += r.d[par7];
/* 47 */     double var12 = 0.0D;
/*    */     
/* 49 */     if ((par7 == 1 && var11 == amq.bc.cm) || var11 == amq.bE.cm)
/*    */     {
/* 51 */       var12 = 0.5D;
/*    */     }
/*    */     
/* 54 */     if (spawnCreature(par3World, par1ItemStack.j(), par4 + 0.5D, par5 + var12, par6 + 0.5D) && !par2EntityPlayer.cd.d)
/*    */     {
/* 56 */       par1ItemStack.a--;
/*    */     }
/*    */     int height;
/* 59 */     for (height = -1; height <= 3; height++) {
/* 60 */       for (int length = -1; length <= 6; length++) {
/* 61 */         for (int width = -1; width <= 6; width++)
/*    */         {
/* 63 */           par3World.d(par4 + length, par5 + height, par6 + width, mod_SCP.CorrodedIron.cm, 0); } 
/*    */       } 
/* 65 */     }  for (height = 0; height <= 2; height++) {
/* 66 */       for (int length = 0; length <= 5; length++) {
/* 67 */         for (int width = 0; width <= 5; width++)
/*    */         {
/* 69 */           par3World.d(par4 + length, par5 + height, par6 + width, 0, 0); } 
/*    */       } 
/* 71 */     }  par3World.d(par4 + 2, par5 + 1, par6 - 2, mod_SCP.KeycardSlotLv3.cm, 2);
/* 72 */     par3World.d(par4 + 4, par5 + 1, par6, mod_SCP.KeycardSlotLv3.cm, 0);
/* 73 */     SCPItemCorrodedDoor.placeDoorBlock(par3World, par4 + 3, par5, par6 - 1, 1, mod_SCP.CorrodedDoor);
/*    */     
/* 75 */     par2EntityPlayer.b("SCP-106 Spawned. | [Type: §4Keter§f]");
/*    */     
/* 77 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 83 */     SCPEntity106 var8 = new SCPEntity106(par0World);
/* 84 */     var8.b(par2 + 3.0D, par4 + 1.0D, par6 + 3.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 85 */     par0World.d((lq)var8);
/* 86 */     var8.aO();
/*    */     
/* 88 */     return (var8 != null);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem106.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */