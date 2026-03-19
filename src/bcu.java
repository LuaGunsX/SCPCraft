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
/*     */ @SideOnly(Side.CLIENT)
/*     */ public class bcu
/*     */   extends bcj
/*     */ {
/*     */   public bcu() {
/*  17 */     super((axa)new axo(), 1.0F);
/*  18 */     a((axa)new axo());
/*     */   }
/*     */ 
/*     */   
/*     */   protected float a(qp par1EntitySpider) {
/*  23 */     return 180.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int a(qp par1EntitySpider, int par2, float par3) {
/*  32 */     if (par1EntitySpider.a(mod_SCP.crystal)) {
/*     */       
/*  34 */       GL11.glDepthMask(true);
/*  35 */       if (par2 == 1) {
/*     */         
/*  37 */         a("/SCPCraft/textures/SCP409Overlay.png");
/*  38 */         GL11.glMatrixMode(5890);
/*  39 */         GL11.glLoadIdentity();
/*  40 */         a(this.i);
/*  41 */         GL11.glMatrixMode(5888);
/*  42 */         return 1;
/*     */       } 
/*     */       
/*  45 */       if (par2 == 2) {
/*     */         
/*  47 */         GL11.glMatrixMode(5890);
/*  48 */         GL11.glLoadIdentity();
/*  49 */         GL11.glMatrixMode(5888);
/*  50 */         GL11.glEnable(2896);
/*  51 */         GL11.glDisable(3042);
/*     */       } 
/*     */     } 
/*  54 */     if (par2 != 0)
/*     */     {
/*  56 */       return -1;
/*     */     }
/*     */ 
/*     */     
/*  60 */     a("/mob/spider_eyes.png");
/*  61 */     float var4 = 1.0F;
/*  62 */     GL11.glEnable(3042);
/*  63 */     GL11.glDisable(3008);
/*  64 */     GL11.glBlendFunc(1, 1);
/*     */     
/*  66 */     if (par1EntitySpider.aj()) {
/*     */       
/*  68 */       GL11.glDepthMask(false);
/*     */     }
/*     */     else {
/*     */       
/*  72 */       GL11.glDepthMask(true);
/*     */     } 
/*     */     
/*  75 */     char var5 = '';
/*  76 */     int var6 = var5 % 65536;
/*  77 */     int var7 = var5 / 65536;
/*  78 */     bfe.a(bfe.b, var6 / 1.0F, var7 / 1.0F);
/*  79 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  80 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, var4);
/*  81 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(qp par1EntitySpider, float par2) {
/*  87 */     float var3 = par1EntitySpider.m();
/*  88 */     GL11.glScalef(var3, var3, var3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(md par1EntityLiving, float par2) {
/*  97 */     a((qp)par1EntityLiving, par2);
/*     */   }
/*     */ 
/*     */   
/*     */   protected float a(md par1EntityLiving) {
/* 102 */     return a((qp)par1EntityLiving);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int a(md par1EntityLiving, int par2, float par3) {
/* 110 */     return a((qp)par1EntityLiving, par2, par3);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/bcu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */