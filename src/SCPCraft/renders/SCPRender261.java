/*    */ package SCPCraft.renders;
/*    */ 
/*    */ import SCPCraft.models.SCPModel261;
/*    */ import SCPCraft.tileentities.SCPTileEntity261;
/*    */ import any;
/*    */ import bdx;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SCPRender261
/*    */   extends bdx
/*    */ {
/* 16 */   private SCPModel261 aModel = new SCPModel261();
/*    */ 
/*    */ 
/*    */   
/*    */   public void renderAModelAt(SCPTileEntity261 tileentity1, double d, double d1, double d2, float f) {
/* 21 */     GL11.glPushMatrix();
/* 22 */     GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
/* 23 */     int var11 = tileentity1.p();
/* 24 */     if (var11 == 2) GL11.glRotatef(180.0F, 0.0F, 0.0F, 90.0F); 
/* 25 */     if (var11 == 0) GL11.glRotatef(180.0F, 360.0F, 0.0F, 0.0F); 
/* 26 */     if (var11 == 1) GL11.glRotatef(180.0F, 90.0F, 0.0F, 90.0F); 
/* 27 */     if (var11 == 3) GL11.glRotatef(180.0F, -90.0F, 0.0F, 90.0F); 
/* 28 */     a("/SCPCraft/textures/mobs/261.png");
/* 29 */     GL11.glPushMatrix();
/* 30 */     this.aModel.renderModel(0.0625F);
/* 31 */     GL11.glPopMatrix();
/* 32 */     GL11.glPopMatrix();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(any tileentity, double d, double d1, double d2, float f) {
/* 38 */     renderAModelAt((SCPTileEntity261)tileentity, d, d1, d2, f);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/renders/SCPRender261.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */