/*    */ package SCPCraft.blocks;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import SCPCraft.tileentities.SCPTileEntityFlesh;
/*    */ import agi;
/*    */ import akb;
/*    */ import any;
/*    */ import java.util.Random;
/*    */ import lq;
/*    */ import yc;
/*    */ 
/*    */ 
/*    */ public class SCPBlockFlesh
/*    */   extends akb
/*    */ {
/*    */   public SCPBlockFlesh(int par1, int par2) {
/* 17 */     super(par1, par2, agi.z);
/* 18 */     a(mod_SCP.tabBlockSCP);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(yc par1World, int par2, int par3, int par4, lq par5Entity) {
/* 23 */     SCPTileEntityFlesh tileEntity = (SCPTileEntityFlesh)par1World.q(par2, par3, par4);
/* 24 */     tileEntity.setStep(true);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int a(int par1, Random par2Random, int par3) {
/* 32 */     return mod_SCP.Flesh.cm;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 37 */     return "/SCPCraft/textures/SCPblox.png";
/*    */   }
/*    */ 
/*    */   
/*    */   public any a(yc var1) {
/* 42 */     return (any)new SCPTileEntityFlesh();
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlockFlesh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */