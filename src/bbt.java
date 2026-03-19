/*     */ import SCPCraft.mod_SCP;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Random;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @SideOnly(Side.CLIENT)
/*     */ public class bbt
/*     */   extends bcj
/*     */ {
/*     */   private awu a;
/*  25 */   private Random f = new Random();
/*     */ 
/*     */   
/*     */   public bbt() {
/*  29 */     super((axa)new awu(), 0.5F);
/*  30 */     this.a = (awu)this.i;
/*  31 */     a((axa)this.a);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(qd par1EntityEnderman, double par2, double par4, double par6, float par8, float par9) {
/*  39 */     this.a.a = (par1EntityEnderman.o() > 0);
/*  40 */     this.a.b = par1EntityEnderman.q();
/*     */     
/*  42 */     if (par1EntityEnderman.q()) {
/*     */       
/*  44 */       double var10 = 0.02D;
/*  45 */       par2 += this.f.nextGaussian() * var10;
/*  46 */       par6 += this.f.nextGaussian() * var10;
/*     */     } 
/*     */     
/*  49 */     super.a((md)par1EntityEnderman, par2, par4, par6, par8, par9);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(qd par1EntityEnderman, float par2) {
/*  57 */     super.c((md)par1EntityEnderman, par2);
/*     */     
/*  59 */     if (par1EntityEnderman.o() > 0) {
/*     */       
/*  61 */       GL11.glEnable(32826);
/*  62 */       GL11.glPushMatrix();
/*  63 */       float var3 = 0.5F;
/*  64 */       GL11.glTranslatef(0.0F, 0.6875F, -0.75F);
/*  65 */       var3 *= 1.0F;
/*  66 */       GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
/*  67 */       GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/*  68 */       GL11.glScalef(-var3, -var3, var3);
/*  69 */       int var4 = par1EntityEnderman.b(par2);
/*  70 */       int var5 = var4 % 65536;
/*  71 */       int var6 = var4 / 65536;
/*  72 */       bfe.a(bfe.b, var5 / 1.0F, var6 / 1.0F);
/*  73 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  74 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  75 */       a("/terrain.png");
/*  76 */       this.c.a(amq.p[par1EntityEnderman.o()], par1EntityEnderman.p(), 1.0F);
/*  77 */       GL11.glPopMatrix();
/*  78 */       GL11.glDisable(32826);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int a(qd par1EntityEnderman, int par2, float par3) {
/*  88 */     if (par1EntityEnderman.a(mod_SCP.crystal)) {
/*     */       
/*  90 */       GL11.glDepthMask(true);
/*  91 */       if (par2 == 1) {
/*     */         
/*  93 */         a("/SCPCraft/textures/SCP409Overlay.png");
/*  94 */         GL11.glMatrixMode(5890);
/*  95 */         GL11.glLoadIdentity();
/*  96 */         a(this.i);
/*  97 */         GL11.glMatrixMode(5888);
/*  98 */         return 1;
/*     */       } 
/*     */       
/* 101 */       if (par2 == 2) {
/*     */         
/* 103 */         GL11.glMatrixMode(5890);
/* 104 */         GL11.glLoadIdentity();
/* 105 */         GL11.glMatrixMode(5888);
/* 106 */         GL11.glEnable(2896);
/* 107 */         GL11.glDisable(3042);
/*     */       } 
/*     */     } 
/* 110 */     if (par2 != 0)
/*     */     {
/* 112 */       return -1;
/*     */     }
/*     */ 
/*     */     
/* 116 */     a("/mob/enderman_eyes.png");
/* 117 */     float var4 = 1.0F;
/* 118 */     GL11.glEnable(3042);
/* 119 */     GL11.glDisable(3008);
/* 120 */     GL11.glBlendFunc(1, 1);
/* 121 */     GL11.glDisable(2896);
/*     */     
/* 123 */     if (par1EntityEnderman.aj()) {
/*     */       
/* 125 */       GL11.glDepthMask(false);
/*     */     }
/*     */     else {
/*     */       
/* 129 */       GL11.glDepthMask(true);
/*     */     } 
/*     */     
/* 132 */     char var5 = '';
/* 133 */     int var6 = var5 % 65536;
/* 134 */     int var7 = var5 / 65536;
/* 135 */     bfe.a(bfe.b, var6 / 1.0F, var7 / 1.0F);
/* 136 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 137 */     GL11.glEnable(2896);
/* 138 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, var4);
/* 139 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int a(md par1EntityLiving, int par2, float par3) {
/* 148 */     return a((qd)par1EntityLiving, par2, par3);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void c(md par1EntityLiving, float par2) {
/* 153 */     a((qd)par1EntityLiving, par2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
/* 158 */     a((qd)par1EntityLiving, par2, par4, par6, par8, par9);
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
/* 169 */     a((qd)par1Entity, par2, par4, par6, par8, par9);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/bbt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */