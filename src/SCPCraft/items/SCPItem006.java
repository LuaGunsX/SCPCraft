/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import SCPCraft.worldgen.SCPWorldGen006;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import md;
/*    */ import qx;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ public class SCPItem006
/*    */   extends SCPItemDocument {
/* 14 */   public SCPWorldGen006 worldgenlakes = new SCPWorldGen006(mod_SCP.SCP006Still.cm);
/* 15 */   public Random rand = new Random();
/*    */ 
/*    */   
/*    */   public SCPItem006(int i) {
/* 19 */     super(i);
/* 20 */     this.ck = 1;
/* 21 */     e(1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/* 26 */     list.add("§2SCP-006");
/* 27 */     list.add("§7Fountain of Youth");
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean n_() {
/* 32 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/* 37 */     this.worldgenlakes.a(par3World, this.rand, par4, par5, par6);
/*    */     
/* 39 */     par2EntityPlayer.b("SCP-006 Spawned. | [Type: §2Safe§f]");
/* 40 */     par1ItemStack.a(2, (md)par2EntityPlayer);
/* 41 */     return true;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem006.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */