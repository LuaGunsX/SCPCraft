/*    */ package SCPCraft.renders;
/*    */ 
/*    */ import SCPCraft.mod_Others;
/*    */ import SCPCraft.models.SCPModelRemoteDoorPC;
/*    */ import SCPCraft.tileentities.SCPTileEntityRemoteDoorComp;
/*    */ import any;
/*    */ import bdx;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SCPRenderRemoteDoorComp
/*    */   extends bdx
/*    */ {
/* 17 */   private SCPModelRemoteDoorPC aModel = new SCPModelRemoteDoorPC();
/*    */ 
/*    */ 
/*    */   
/*    */   public void renderAModelAt(SCPTileEntityRemoteDoorComp tileentity1, double d, double d1, double d2, float f) {
/* 22 */     GL11.glPushMatrix();
/* 23 */     GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
/* 24 */     int var11 = tileentity1.p();
/* 25 */     if (var11 == 2) GL11.glRotatef(180.0F, 0.0F, 0.0F, 90.0F); 
/* 26 */     if (var11 == 0) GL11.glRotatef(180.0F, 360.0F, 0.0F, 0.0F); 
/* 27 */     if (var11 == 1) GL11.glRotatef(180.0F, 90.0F, 0.0F, 90.0F); 
/* 28 */     if (var11 == 3) GL11.glRotatef(180.0F, -90.0F, 0.0F, 90.0F);
/*    */     
/* 30 */     if (mod_Others.remoteDoorActivate) {
/*    */       
/* 32 */       a("/SCPCraft/textures/RemoteDoorPCOn.png");
/*    */     }
/* 34 */     else if (!mod_Others.remoteDoorActivate) {
/*    */       
/* 36 */       a("/SCPCraft/textures/RemoteDoorPCOff.png");
/*    */     } 
/*    */     
/* 39 */     GL11.glPushMatrix();
/* 40 */     this.aModel.renderModel(0.0625F);
/* 41 */     GL11.glPopMatrix();
/* 42 */     GL11.glPopMatrix();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(any tileentity, double d, double d1, double d2, float f) {
/* 47 */     renderAModelAt((SCPTileEntityRemoteDoorComp)tileentity, d, d1, d2, f);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/renders/SCPRenderRemoteDoorComp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */