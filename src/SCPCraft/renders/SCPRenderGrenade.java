/*    */ package SCPCraft.renders;
/*    */ 
/*    */ import baz;
/*    */ import bbv;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import lq;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import rm;
/*    */ import vx;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @SideOnly(Side.CLIENT)
/*    */ public class SCPRenderGrenade
/*    */   extends bbv
/*    */ {
/*    */   private int itemIconIndex;
/*    */   
/*    */   public SCPRenderGrenade(int par1) {
/* 26 */     this.itemIconIndex = par1;
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
/* 37 */     GL11.glPushMatrix();
/* 38 */     GL11.glTranslatef((float)par2, (float)par4, (float)par6);
/* 39 */     GL11.glEnable(32826);
/* 40 */     GL11.glScalef(0.5F, 0.5F, 0.5F);
/* 41 */     a("/SCPCraft/textures/SCPItems.png");
/* 42 */     baz var10 = baz.a;
/*    */     
/* 44 */     if (this.itemIconIndex == 154) {
/*    */       
/* 46 */       int var11 = vx.a(((rm)par1Entity).i(), false);
/* 47 */       float var12 = (var11 >> 16 & 0xFF) / 255.0F;
/* 48 */       float var13 = (var11 >> 8 & 0xFF) / 255.0F;
/* 49 */       float var14 = (var11 & 0xFF) / 255.0F;
/* 50 */       GL11.glColor3f(var12, var13, var14);
/* 51 */       GL11.glPushMatrix();
/* 52 */       func_77026_a(var10, 141);
/* 53 */       GL11.glPopMatrix();
/* 54 */       GL11.glColor3f(1.0F, 1.0F, 1.0F);
/*    */     } 
/*    */     
/* 57 */     func_77026_a(var10, this.itemIconIndex);
/* 58 */     GL11.glDisable(32826);
/* 59 */     GL11.glPopMatrix();
/*    */   }
/*    */ 
/*    */   
/*    */   private void func_77026_a(baz par1Tessellator, int par2) {
/* 64 */     float var3 = (par2 % 16 * 16 + 0) / 256.0F;
/* 65 */     float var4 = (par2 % 16 * 16 + 16) / 256.0F;
/* 66 */     float var5 = (par2 / 16 * 16 + 0) / 256.0F;
/* 67 */     float var6 = (par2 / 16 * 16 + 16) / 256.0F;
/* 68 */     float var7 = 1.0F;
/* 69 */     float var8 = 0.5F;
/* 70 */     float var9 = 0.25F;
/* 71 */     GL11.glRotatef(180.0F - this.b.i, 0.0F, 1.0F, 0.0F);
/* 72 */     GL11.glRotatef(-this.b.j, 1.0F, 0.0F, 0.0F);
/* 73 */     par1Tessellator.b();
/* 74 */     par1Tessellator.b(0.0F, 1.0F, 0.0F);
/* 75 */     par1Tessellator.a((0.0F - var8), (0.0F - var9), 0.0D, var3, var6);
/* 76 */     par1Tessellator.a((var7 - var8), (0.0F - var9), 0.0D, var4, var6);
/* 77 */     par1Tessellator.a((var7 - var8), (var7 - var9), 0.0D, var4, var5);
/* 78 */     par1Tessellator.a((0.0F - var8), (var7 - var9), 0.0D, var3, var5);
/* 79 */     par1Tessellator.a();
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/renders/SCPRenderGrenade.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */