/*    */ package SCPCraft.renders;
/*    */ 
/*    */ import baz;
/*    */ import bbv;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import lq;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import rb;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @SideOnly(Side.CLIENT)
/*    */ public class SCPRenderProjectile
/*    */   extends bbv
/*    */ {
/*    */   private float field_77002_a;
/*    */   
/*    */   public SCPRenderProjectile(float par1) {
/* 22 */     this.field_77002_a = par1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void doRenderFireball(rb par1EntityFireball, double par2, double par4, double par6, float par8, float par9) {
/* 27 */     GL11.glPushMatrix();
/* 28 */     GL11.glTranslatef((float)par2, (float)par4, (float)par6);
/* 29 */     GL11.glEnable(32826);
/* 30 */     float var10 = this.field_77002_a;
/* 31 */     GL11.glScalef(var10 / 1.0F, var10 / 1.0F, var10 / 1.0F);
/* 32 */     byte var11 = 1;
/* 33 */     a("/SCPCraft/textures/SCPItems.png");
/* 34 */     baz var12 = baz.a;
/* 35 */     float var13 = (var11 % 16 * 16 + 0) / 256.0F;
/* 36 */     float var14 = (var11 % 16 * 16 + 16) / 256.0F;
/* 37 */     float var15 = (var11 / 16 * 16 + 0) / 256.0F;
/* 38 */     float var16 = (var11 / 16 * 16 + 16) / 256.0F;
/* 39 */     float var17 = 1.0F;
/* 40 */     float var18 = 0.5F;
/* 41 */     float var19 = 0.25F;
/* 42 */     GL11.glRotatef(180.0F - this.b.i, 0.0F, 1.0F, 0.0F);
/* 43 */     GL11.glRotatef(-this.b.j, 1.0F, 0.0F, 0.0F);
/* 44 */     var12.b();
/* 45 */     var12.b(0.0F, 1.0F, 0.0F);
/* 46 */     var12.a((0.0F - var18), (0.0F - var19), 0.0D, var13, var16);
/* 47 */     var12.a((var17 - var18), (0.0F - var19), 0.0D, var14, var16);
/* 48 */     var12.a((var17 - var18), (1.0F - var19), 0.0D, var14, var15);
/* 49 */     var12.a((0.0F - var18), (1.0F - var19), 0.0D, var13, var15);
/* 50 */     var12.a();
/* 51 */     GL11.glDisable(32826);
/* 52 */     GL11.glPopMatrix();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(lq par1Entity, double par2, double par4, double par6, float par8, float par9) {
/* 63 */     doRenderFireball((rb)par1Entity, par2, par4, par6, par8, par9);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/renders/SCPRenderProjectile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */