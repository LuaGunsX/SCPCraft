/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import SCPCraft.worldgen.SCPWorldGenSCP354;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import md;
/*    */ import qx;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ public class SCPItem354
/*    */   extends SCPItemDocument {
/* 14 */   public SCPWorldGenSCP354 worldgenlakes = new SCPWorldGenSCP354(mod_SCP.SCP354Still.cm);
/* 15 */   public Random rand = new Random();
/*    */ 
/*    */   
/*    */   public SCPItem354(int i) {
/* 19 */     super(i);
/* 20 */     this.ck = 1;
/* 21 */     e(1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/* 26 */     list.add("§4SCP-354");
/* 27 */     list.add("§7The Red Pool");
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
/* 38 */     this.worldgenlakes.a(par3World, this.rand, par4 - 8, par5, par6);
/* 39 */     this.worldgenlakes.a(par3World, this.rand, par4, par5, par6 + 8);
/* 40 */     this.worldgenlakes.a(par3World, this.rand, par4 + 8, par5, par6);
/* 41 */     this.worldgenlakes.a(par3World, this.rand, par4, par5, par6 - 8);
/* 42 */     this.worldgenlakes.a(par3World, this.rand, par4 - 8, par5, par6 - 8);
/* 43 */     this.worldgenlakes.a(par3World, this.rand, par4 + 8, par5, par6 + 8);
/* 44 */     this.worldgenlakes.a(par3World, this.rand, par4 + 8, par5, par6 - 8);
/* 45 */     this.worldgenlakes.a(par3World, this.rand, par4 - 8, par5, par6 + 8);
/* 46 */     this.worldgenlakes.a(par3World, this.rand, par4 - 16, par5, par6);
/* 47 */     this.worldgenlakes.a(par3World, this.rand, par4, par5, par6 + 16);
/* 48 */     this.worldgenlakes.a(par3World, this.rand, par4 + 16, par5, par6);
/* 49 */     this.worldgenlakes.a(par3World, this.rand, par4, par5, par6 - 16);
/*    */     
/* 51 */     par2EntityPlayer.b("SCP-354 Spawned. | [Type: §4Keter§f]");
/* 52 */     par1ItemStack.a(2, (md)par2EntityPlayer);
/* 53 */     return true;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem354.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */