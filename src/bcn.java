/*    */ import SCPCraft.mod_SCP;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @SideOnly(Side.CLIENT)
/*    */ public class bcn
/*    */   extends bcj
/*    */ {
/*    */   public bcn(axa par1ModelBase, axa par2ModelBase, float par3) {
/* 19 */     super(par1ModelBase, par3);
/* 20 */     a(par2ModelBase);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected int a(pd par1EntityPig, int par2, float par3) {
/* 26 */     if (par1EntityPig.a(mod_SCP.crystal)) {
/*    */       
/* 28 */       GL11.glDepthMask(true);
/* 29 */       if (par2 == 1) {
/*    */         
/* 31 */         a("/SCPCraft/textures/SCP409Overlay.png");
/* 32 */         GL11.glMatrixMode(5890);
/* 33 */         GL11.glLoadIdentity();
/* 34 */         a(this.i);
/* 35 */         GL11.glMatrixMode(5888);
/* 36 */         return 1;
/*    */       } 
/*    */       
/* 39 */       if (par2 == 2) {
/*    */         
/* 41 */         GL11.glMatrixMode(5890);
/* 42 */         GL11.glLoadIdentity();
/* 43 */         GL11.glMatrixMode(5888);
/* 44 */         GL11.glEnable(2896);
/* 45 */         GL11.glDisable(3042);
/*    */       } 
/*    */     } 
/* 48 */     a("/mob/saddle.png");
/* 49 */     return (par2 == 0 && par1EntityPig.m()) ? 1 : -1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(pd par1EntityPig, double par2, double par4, double par6, float par8, float par9) {
/* 54 */     super.a((md)par1EntityPig, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected int a(md par1EntityLiving, int par2, float par3) {
/* 62 */     return a((pd)par1EntityLiving, par2, par3);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(md par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
/* 67 */     a((pd)par1EntityLiving, par2, par4, par6, par8, par9);
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
/* 78 */     a((pd)par1Entity, par2, par4, par6, par8, par9);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/bcn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */