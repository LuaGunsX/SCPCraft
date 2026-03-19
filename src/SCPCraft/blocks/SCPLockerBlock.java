/*    */ package SCPCraft.blocks;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import agi;
/*    */ import amq;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ public class SCPLockerBlock
/*    */   extends amq
/*    */ {
/*    */   public SCPLockerBlock(int par1, int par2) {
/* 13 */     super(par1, par2, agi.e);
/* 14 */     a(mod_SCP.tabBlockSCP);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int a(int par1, Random par2Random, int par3) {
/* 22 */     return mod_SCP.Locker.cm;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 27 */     return "/SCPCraft/textures/SCPblox.png";
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPLockerBlock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */