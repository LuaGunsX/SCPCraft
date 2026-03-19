/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import amq;
/*    */ import qx;
/*    */ import up;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ public class SCPItemDocument
/*    */   extends up
/*    */ {
/*    */   public SCPItemDocument(int i) {
/* 14 */     super(i);
/* 15 */     this.ck = 1;
/* 16 */     e(1);
/* 17 */     a(mod_SCP.tabSCP);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 22 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 27 */     return "/SCPCraft/textures/SCPItems.png";
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/* 32 */     int var11 = par3World.a(par4, par5, par6);
/* 33 */     if (var11 == amq.aV.cm) {
/*    */       
/* 35 */       par7 = 1;
/*    */     }
/* 37 */     else if (var11 != amq.bx.cm && var11 != amq.aa.cm && var11 != amq.ab.cm && (amq.p[var11] == null || !amq.p[var11].isBlockReplaceable(par3World, par4, par5, par6))) {
/* 38 */       par5++;
/* 39 */     }  return true;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItemDocument.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */