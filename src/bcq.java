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
/*    */ public class bcq
/*    */   extends bcj
/*    */ {
/*    */   public bcq() {
/* 19 */     super((axa)new axi(), 0.3F);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected float a(qm par1EntitySilverfish) {
/* 27 */     return 180.0F;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(qm par1EntitySilverfish, double par2, double par4, double par6, float par8, float par9) {
/* 35 */     super.a((md)par1EntitySilverfish, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected int a(qm par1EntitySilverfish, int par2, float par3) {
/* 44 */     if (par1EntitySilverfish.a(mod_SCP.crystal)) {
/*    */       
/* 46 */       GL11.glDepthMask(true);
/* 47 */       if (par2 == 1) {
/*    */         
/* 49 */         a("/SCPCraft/textures/SCP409Overlay.png");
/* 50 */         GL11.glMatrixMode(5890);
/* 51 */         GL11.glLoadIdentity();
/* 52 */         a(this.i);
/* 53 */         GL11.glMatrixMode(5888);
/* 54 */         return 1;
/*    */       } 
/*    */       
/* 57 */       if (par2 == 2) {
/*    */         
/* 59 */         GL11.glMatrixMode(5890);
/* 60 */         GL11.glLoadIdentity();
/* 61 */         GL11.glMatrixMode(5888);
/* 62 */         GL11.glEnable(2896);
/* 63 */         GL11.glDisable(3042);
/*    */       } 
/*    */     } 
/* 66 */     return -1;
/*    */   }
/*    */ 
/*    */   
/*    */   protected float a(md par1EntityLiving) {
/* 71 */     return a((qm)par1EntityLiving);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected int a(md par1EntityLiving, int par2, float par3) {
/* 79 */     return a((qm)par1EntityLiving, par2, par3);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(md par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
/* 84 */     a((qm)par1EntityLiving, par2, par4, par6, par8, par9);
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
/* 95 */     a((qm)par1Entity, par2, par4, par6, par8, par9);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/bcq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */