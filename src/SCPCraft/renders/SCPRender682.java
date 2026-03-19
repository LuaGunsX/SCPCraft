/*    */ package SCPCraft.renders;
/*    */ 
/*    */ import SCPCraft.entities.SCPEntityReal682;
/*    */ import SCPCraft.models.SCPModelReal682;
/*    */ import axa;
/*    */ import bcj;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import lq;
/*    */ import md;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ @SideOnly(Side.CLIENT)
/*    */ public class SCPRender682
/*    */   extends bcj
/*    */ {
/*    */   private int field_77068_a;
/*    */   public static float scale;
/*    */   public static SCPEntityReal682 entity682;
/*    */   
/*    */   public SCPRender682(SCPModelReal682 scpModelReal682, float f) {
/* 23 */     super((axa)new SCPModelReal682(), 0.5F);
/* 24 */     this.field_77068_a = ((SCPModelReal682)this.i).func_78104_a();
/* 25 */     this; scale = f;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void preRenderScale(SCPEntityReal682 par1EntityGiantZombie, float par2) {
/* 33 */     this; this; this; GL11.glScalef(scale, scale, scale);
/*    */   }
/*    */ 
/*    */   
/*    */   public void renderSCP682(SCPEntityReal682 entity, double par2, double par4, double par6, float par8, float par9) {
/* 38 */     entity682 = entity;
/* 39 */     int var10 = ((SCPModelReal682)this.i).func_78104_a();
/*    */     
/* 41 */     if (var10 != this.field_77068_a) {
/*    */       
/* 43 */       this.field_77068_a = var10;
/* 44 */       this.i = (axa)new SCPModelReal682();
/*    */     } 
/* 46 */     super.a((md)entity, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void renderDragonModel(SCPEntityReal682 par1SCPEntityReal682, float par2, float par3, float par4, float par5, float par6, float par7) {
/* 51 */     if (par1SCPEntityReal682.deathTicks > 0) {
/*    */       
/* 53 */       float var8 = par1SCPEntityReal682.deathTicks / 200.0F;
/* 54 */       GL11.glDepthFunc(515);
/* 55 */       GL11.glEnable(3008);
/* 56 */       GL11.glAlphaFunc(516, var8);
/* 57 */       a(par1SCPEntityReal682.cu, "/SCPCraft/textures/mobs/Bosses/682/682Shuffle.png");
/* 58 */       this.i.a((lq)par1SCPEntityReal682, par2, par3, par4, par5, par6, par7);
/* 59 */       GL11.glAlphaFunc(516, 0.1F);
/* 60 */       GL11.glDepthFunc(514);
/*    */     } 
/* 62 */     a(par1SCPEntityReal682.cu, par1SCPEntityReal682.O());
/* 63 */     this.i.a((lq)par1SCPEntityReal682, par2, par3, par4, par5, par6, par7);
/* 64 */     GL11.glDepthFunc(515);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(md par1EntityLiving, float par2, float par3, float par4, float par5, float par6, float par7) {
/* 69 */     renderDragonModel((SCPEntityReal682)par1EntityLiving, par2, par3, par4, par5, par6, par7);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(md par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
/* 74 */     renderSCP682((SCPEntityReal682)par1EntityLiving, par2, par4, par6, par8, par9);
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
/* 85 */     renderSCP682((SCPEntityReal682)par1Entity, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(md par1EntityLiving, float par2) {
/* 94 */     preRenderScale((SCPEntityReal682)par1EntityLiving, par2);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/renders/SCPRender682.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */