/*    */ package SCPCraft.renders;
/*    */ 
/*    */ import SCPCraft.entities.SCPEntity999;
/*    */ import SCPCraft.mod_SCP;
/*    */ import axa;
/*    */ import bcj;
/*    */ import md;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SCPRender999
/*    */   extends bcj
/*    */ {
/*    */   private axa scaleAmount;
/*    */   
/*    */   public SCPRender999(axa par1ModelBase, axa par2ModelBase, float par3) {
/* 18 */     super(par1ModelBase, par3);
/* 19 */     this.scaleAmount = par2ModelBase;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected int func_77090_a(SCPEntity999 par1EntitySlime, int par2, float par3) {
/* 25 */     if (par1EntitySlime.a(mod_SCP.crystal)) {
/*    */       
/* 27 */       GL11.glDepthMask(true);
/* 28 */       if (par2 == 0) {
/*    */         
/* 30 */         a("/SCPCraft/textures/SCP409Overlay.png");
/* 31 */         GL11.glMatrixMode(5890);
/* 32 */         GL11.glLoadIdentity();
/* 33 */         a(this.i);
/* 34 */         GL11.glMatrixMode(5888);
/* 35 */         return 1;
/*    */       } 
/*    */       
/* 38 */       if (par2 == 2) {
/*    */         
/* 40 */         GL11.glMatrixMode(5890);
/* 41 */         GL11.glLoadIdentity();
/* 42 */         GL11.glMatrixMode(5888);
/* 43 */         GL11.glEnable(2896);
/* 44 */         GL11.glDisable(3042);
/*    */       } 
/*    */     } 
/* 47 */     if (par2 == 0) {
/*    */       
/* 49 */       a(this.scaleAmount);
/* 50 */       GL11.glEnable(2977);
/* 51 */       GL11.glEnable(3042);
/* 52 */       GL11.glBlendFunc(770, 771);
/* 53 */       GL11.glColor4f(0.8F, 0.2F, 0.0F, 1.0F);
/* 54 */       return 1;
/*    */     } 
/*    */ 
/*    */     
/* 58 */     if (par2 == 1) {
/*    */       
/* 60 */       GL11.glDisable(3042);
/* 61 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*    */     } 
/*    */     
/* 64 */     return -1;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void scaleSlime(SCPEntity999 par1EntitySlime, float par2) {
/* 73 */     float var3 = par1EntitySlime.getSlimeSize();
/* 74 */     float var4 = (par1EntitySlime.field_70812_c + (par1EntitySlime.field_70811_b - par1EntitySlime.field_70812_c) * par2) / (var3 * 0.5F + 1.0F);
/* 75 */     float var5 = 1.0F / (var4 + 1.0F);
/* 76 */     GL11.glScalef(var5 * var3, 1.0F / var5 * var3, var5 * var3);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(md par1EntityLiving, float par2) {
/* 85 */     scaleSlime((SCPEntity999)par1EntityLiving, par2);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected int a(md par1EntityLiving, int par2, float par3) {
/* 93 */     return func_77090_a((SCPEntity999)par1EntityLiving, par2, par3);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/renders/SCPRender999.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */