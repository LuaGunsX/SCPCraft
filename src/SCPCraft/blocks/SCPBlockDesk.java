/*    */ package SCPCraft.blocks;
/*    */ 
/*    */ import SCPCraft.mod_Others;
/*    */ import SCPCraft.mod_SCP;
/*    */ import agi;
/*    */ import amq;
/*    */ import net.minecraftforge.common.ForgeDirection;
/*    */ import yc;
/*    */ import ym;
/*    */ 
/*    */ 
/*    */ public class SCPBlockDesk
/*    */   extends amq
/*    */ {
/*    */   public SCPBlockDesk(int par1, int par2, agi mat) {
/* 16 */     super(par1, par2, mat);
/* 17 */     a(mod_SCP.tabBlockSCP);
/*    */   }
/*    */ 
/*    */   
/*    */   public final boolean canThisPaneConnectToThisBlockID(int i) {
/* 22 */     return p[i] instanceof SCPBlockDesk;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canPlaceTorchOnTop(yc world, int x, int y, int z) {
/* 27 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ym par1IBlockAccess, int par2, int par3, int par4, int par5) {
/* 32 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean c() {
/* 37 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int n() {
/* 42 */     return 0;
/*    */   }
/*    */   
/*    */   public boolean isBlockSolidOnSide(yc world, int x, int y, int z, ForgeDirection side) {
/* 46 */     return (side == ForgeDirection.UP || c());
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 51 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int d() {
/* 56 */     return mod_Others.DeskID;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlockDesk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */