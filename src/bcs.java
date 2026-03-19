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
/*    */ @SideOnly(Side.CLIENT)
/*    */ public class bcs
/*    */   extends bcj
/*    */ {
/*    */   private axa a;
/*    */   
/*    */   public bcs(axa par1ModelBase, axa par2ModelBase, float par3) {
/* 18 */     super(par1ModelBase, par3);
/* 19 */     this.a = par2ModelBase;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected int a(qo par1EntitySlime, int par2, float par3) {
/* 28 */     if (par1EntitySlime.a(mod_SCP.crystal)) {
/*    */       
/* 30 */       GL11.glDepthMask(true);
/* 31 */       if (par2 == 0) {
/*    */         
/* 33 */         a("/SCPCraft/textures/SCP409Overlay.png");
/* 34 */         GL11.glMatrixMode(5890);
/* 35 */         GL11.glLoadIdentity();
/* 36 */         a(this.i);
/* 37 */         GL11.glMatrixMode(5888);
/* 38 */         return 1;
/*    */       } 
/*    */       
/* 41 */       if (par2 == 2) {
/*    */         
/* 43 */         GL11.glMatrixMode(5890);
/* 44 */         GL11.glLoadIdentity();
/* 45 */         GL11.glMatrixMode(5888);
/* 46 */         GL11.glEnable(2896);
/* 47 */         GL11.glDisable(3042);
/*    */       } 
/*    */     } 
/* 50 */     if (par1EntitySlime.aj())
/*    */     {
/* 52 */       return 0;
/*    */     }
/* 54 */     if (par2 == 0) {
/*    */       
/* 56 */       a(this.a);
/* 57 */       GL11.glEnable(2977);
/* 58 */       GL11.glEnable(3042);
/* 59 */       GL11.glBlendFunc(770, 771);
/* 60 */       return 1;
/*    */     } 
/*    */ 
/*    */     
/* 64 */     if (par2 == 1) {
/*    */       
/* 66 */       GL11.glDisable(3042);
/* 67 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*    */     } 
/*    */     
/* 70 */     return -1;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(qo par1EntitySlime, float par2) {
/* 79 */     float var3 = par1EntitySlime.p();
/* 80 */     float var4 = (par1EntitySlime.d + (par1EntitySlime.c - par1EntitySlime.d) * par2) / (var3 * 0.5F + 1.0F);
/* 81 */     float var5 = 1.0F / (var4 + 1.0F);
/* 82 */     GL11.glScalef(var5 * var3, 1.0F / var5 * var3, var5 * var3);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(md par1EntityLiving, float par2) {
/* 91 */     a((qo)par1EntityLiving, par2);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected int a(md par1EntityLiving, int par2, float par3) {
/* 99 */     return a((qo)par1EntityLiving, par2, par3);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/bcs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */