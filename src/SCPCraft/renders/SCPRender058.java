/*    */ package SCPCraft.renders;
/*    */ 
/*    */ import SCPCraft.entities.SCPEntity058;
/*    */ import SCPCraft.models.SCPModel058;
/*    */ import axa;
/*    */ import bcj;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import lq;
/*    */ import md;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ @SideOnly(Side.CLIENT)
/*    */ public class SCPRender058
/*    */   extends bcj
/*    */ {
/*    */   private int field_77068_a;
/* 18 */   public static float scale = 0.6F;
/*    */   
/*    */   public static SCPEntity058 entity682;
/*    */   public SCPEntity058 entity;
/*    */   
/*    */   public SCPRender058(SCPModel058 scpModel058, float f) {
/* 24 */     super((axa)new SCPModel058(), 0.5F);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void preRenderScale(SCPEntity058 par1EntityGiantZombie, float par2) {
/* 32 */     this; this; this; GL11.glScalef(scale, scale, scale);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void renderSCP058(SCPEntity058 entity, double par2, double par4, double par6, float par8, float par9) {
/* 39 */     if (SCPEntity058.beat > 0) {
/*    */       
/* 41 */       this; scale += 0.002F;
/*    */     } 
/*    */     
/* 44 */     if (SCPEntity058.beat <= 20) {
/*    */       
/* 46 */       this; scale = 0.6F;
/*    */     } 
/*    */     
/* 49 */     super.a((md)entity, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(md par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
/* 54 */     renderSCP058((SCPEntity058)par1EntityLiving, par2, par4, par6, par8, par9);
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
/* 65 */     renderSCP058((SCPEntity058)par1Entity, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(md par1EntityLiving, float par2) {
/* 74 */     preRenderScale((SCPEntity058)par1EntityLiving, par2);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/renders/SCPRender058.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */