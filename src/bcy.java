/*     */ import SCPCraft.mod_SCP;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @SideOnly(Side.CLIENT)
/*     */ public class bcy
/*     */   extends bcj
/*     */ {
/*     */   protected axs a;
/*     */   
/*     */   public bcy() {
/*  20 */     super((axa)new axs(0.0F), 0.5F);
/*  21 */     this.a = (axs)this.i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int a(qu par1EntityVillager, int par2, float par3) {
/*  30 */     if (par1EntityVillager.a(mod_SCP.crystal)) {
/*     */       
/*  32 */       GL11.glDepthMask(true);
/*  33 */       if (par2 == 1) {
/*     */         
/*  35 */         a("/SCPCraft/textures/SCP409Overlay.png");
/*  36 */         GL11.glMatrixMode(5890);
/*  37 */         GL11.glLoadIdentity();
/*  38 */         a(this.i);
/*  39 */         GL11.glMatrixMode(5888);
/*  40 */         return 1;
/*     */       } 
/*     */       
/*  43 */       if (par2 == 2) {
/*     */         
/*  45 */         GL11.glMatrixMode(5890);
/*  46 */         GL11.glLoadIdentity();
/*  47 */         GL11.glMatrixMode(5888);
/*  48 */         GL11.glEnable(2896);
/*  49 */         GL11.glDisable(3042);
/*     */       } 
/*     */     } 
/*  52 */     return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(qu par1EntityVillager, double par2, double par4, double par6, float par8, float par9) {
/*  57 */     super.a((md)par1EntityVillager, par2, par4, par6, par8, par9);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(qu par1EntityVillager, double par2, double par4, double par6) {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(qu par1EntityVillager, float par2) {
/*  67 */     super.c((md)par1EntityVillager, par2);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(qu par1EntityVillager, float par2) {
/*  72 */     float var3 = 0.9375F;
/*     */     
/*  74 */     if (par1EntityVillager.b() < 0) {
/*     */       
/*  76 */       var3 = (float)(var3 * 0.5D);
/*  77 */       this.d = 0.25F;
/*     */     }
/*     */     else {
/*     */       
/*  81 */       this.d = 0.5F;
/*     */     } 
/*     */     
/*  84 */     GL11.glScalef(var3, var3, var3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void b(md par1EntityLiving, double par2, double par4, double par6) {
/*  92 */     a((qu)par1EntityLiving, par2, par4, par6);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(md par1EntityLiving, float par2) {
/* 101 */     b((qu)par1EntityLiving, par2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int a(md par1EntityLiving, int par2, float par3) {
/* 109 */     return a((qu)par1EntityLiving, par2, par3);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void c(md par1EntityLiving, float par2) {
/* 114 */     a((qu)par1EntityLiving, par2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
/* 119 */     a((qu)par1EntityLiving, par2, par4, par6, par8, par9);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(lq par1Entity, double par2, double par4, double par6, float par8, float par9) {
/* 130 */     a((qu)par1Entity, par2, par4, par6, par8, par9);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/bcy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */