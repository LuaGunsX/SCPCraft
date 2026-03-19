/*    */ package SCPCraft.blocks;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import agi;
/*    */ import amq;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Random;
/*    */ import ur;
/*    */ 
/*    */ public class SCPBlock143Planks
/*    */   extends amq
/*    */ {
/*    */   public SCPBlock143Planks(int par1, int par2) {
/* 14 */     super(par1, par2, agi.d);
/* 15 */     a(mod_SCP.tabBlockSCP);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int a(int par1, Random par2Random, int par3) {
/* 23 */     return mod_SCP.SCP143Planks.cm;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 28 */     return "/SCPCraft/textures/SCPblox.png";
/*    */   }
/*    */   public void addCreativeItems(ArrayList<ur> list) {
/* 31 */     list.add(new ur(this));
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlock143Planks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */