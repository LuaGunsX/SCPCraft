/*    */ package SCPCraft.renders;
/*    */ 
/*    */ import SCPCraft.entities.SCPEntity015Boss;
/*    */ import awn;
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
/*    */ public class SCPRender015Boss
/*    */   extends bcj
/*    */ {
/*    */   private int field_77068_a;
/*    */   private float scale;
/*    */   public static SCPEntity015Boss entityPipe;
/*    */   
/*    */   public SCPRender015Boss(awn modelBlaze, float f) {
/* 23 */     super((axa)new awn(), 0.5F);
/* 24 */     this.field_77068_a = ((awn)this.i).a();
/* 25 */     this.scale = f;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void preRenderScale(SCPEntity015Boss par1EntityGiantZombie, float par2) {
/* 33 */     GL11.glScalef(this.scale, this.scale, this.scale);
/*    */   }
/*    */ 
/*    */   
/*    */   public void renderBlaze(SCPEntity015Boss entity, double par2, double par4, double par6, float par8, float par9) {
/* 38 */     entityPipe = entity;
/* 39 */     int var10 = ((awn)this.i).a();
/*    */     
/* 41 */     if (var10 != this.field_77068_a) {
/*    */       
/* 43 */       this.field_77068_a = var10;
/* 44 */       this.i = (axa)new awn();
/*    */     } 
/* 46 */     super.a((md)entity, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void renderDragonModel(SCPEntity015Boss par1SCPEntity015Boss, float par2, float par3, float par4, float par5, float par6, float par7) {
/* 51 */     if (par1SCPEntity015Boss.deathTicks > 0) {
/*    */       
/* 53 */       float var8 = par1SCPEntity015Boss.deathTicks / 200.0F;
/* 54 */       GL11.glDepthFunc(515);
/* 55 */       GL11.glEnable(3008);
/* 56 */       GL11.glAlphaFunc(516, var8);
/* 57 */       a(par1SCPEntity015Boss.cu, "/SCPCraft/textures/mobs/Bosses/015/015BossShuffle.png");
/* 58 */       this.i.a((lq)par1SCPEntity015Boss, par2, par3, par4, par5, par6, par7);
/* 59 */       GL11.glAlphaFunc(516, 0.1F);
/* 60 */       GL11.glDepthFunc(514);
/*    */     } 
/* 62 */     a(par1SCPEntity015Boss.cu, par1SCPEntity015Boss.O());
/* 63 */     this.i.a((lq)par1SCPEntity015Boss, par2, par3, par4, par5, par6, par7);
/* 64 */     GL11.glDepthFunc(515);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(md par1EntityLiving, float par2, float par3, float par4, float par5, float par6, float par7) {
/* 69 */     renderDragonModel((SCPEntity015Boss)par1EntityLiving, par2, par3, par4, par5, par6, par7);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(md par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
/* 74 */     renderBlaze((SCPEntity015Boss)par1EntityLiving, par2, par4, par6, par8, par9);
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
/* 85 */     renderBlaze((SCPEntity015Boss)par1Entity, par2, par4, par6, par8, par9);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(md par1EntityLiving, float par2) {
/* 94 */     preRenderScale((SCPEntity015Boss)par1EntityLiving, par2);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/renders/SCPRender015Boss.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */