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
/*     */ public class bbp
/*     */   extends bcj
/*     */ {
/*  17 */   private axa a = (axa)new awt(2.0F);
/*     */ 
/*     */   
/*     */   public bbp() {
/*  21 */     super((axa)new awt(), 0.5F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(qc par1EntityCreeper, float par2) {
/*  29 */     float var4 = par1EntityCreeper.j(par2);
/*  30 */     float var5 = 1.0F + ke.a(var4 * 100.0F) * var4 * 0.01F;
/*     */     
/*  32 */     if (var4 < 0.0F)
/*     */     {
/*  34 */       var4 = 0.0F;
/*     */     }
/*     */     
/*  37 */     if (var4 > 1.0F)
/*     */     {
/*  39 */       var4 = 1.0F;
/*     */     }
/*     */     
/*  42 */     var4 *= var4;
/*  43 */     var4 *= var4;
/*  44 */     float var6 = (1.0F + var4 * 0.4F) * var5;
/*  45 */     float var7 = (1.0F + var4 * 0.1F) / var5;
/*  46 */     GL11.glScalef(var6, var7, var6);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int a(qc par1EntityCreeper, float par2, float par3) {
/*  54 */     float var5 = par1EntityCreeper.j(par3);
/*     */     
/*  56 */     if ((int)(var5 * 10.0F) % 2 == 0)
/*     */     {
/*  58 */       return 0;
/*     */     }
/*     */ 
/*     */     
/*  62 */     int var6 = (int)(var5 * 0.2F * 255.0F);
/*     */     
/*  64 */     if (var6 < 0)
/*     */     {
/*  66 */       var6 = 0;
/*     */     }
/*     */     
/*  69 */     if (var6 > 255)
/*     */     {
/*  71 */       var6 = 255;
/*     */     }
/*     */     
/*  74 */     short var7 = 255;
/*  75 */     short var8 = 255;
/*  76 */     short var9 = 255;
/*  77 */     return var6 << 24 | var7 << 16 | var8 << 8 | var9;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int a(qc par1EntityCreeper, int par2, float par3) {
/*  86 */     if (par1EntityCreeper.m()) {
/*     */       
/*  88 */       if (par1EntityCreeper.aj()) {
/*     */         
/*  90 */         GL11.glDepthMask(false);
/*     */       }
/*     */       else {
/*     */         
/*  94 */         GL11.glDepthMask(true);
/*     */       } 
/*     */       
/*  97 */       if (par2 == 1) {
/*     */         
/*  99 */         float var4 = par1EntityCreeper.ab + par3;
/* 100 */         a("/armor/power.png");
/* 101 */         GL11.glMatrixMode(5890);
/* 102 */         GL11.glLoadIdentity();
/* 103 */         float var5 = var4 * 0.01F;
/* 104 */         float var6 = var4 * 0.01F;
/* 105 */         GL11.glTranslatef(var5, var6, 0.0F);
/* 106 */         a(this.a);
/* 107 */         GL11.glMatrixMode(5888);
/* 108 */         GL11.glEnable(3042);
/* 109 */         float var7 = 0.5F;
/* 110 */         GL11.glColor4f(var7, var7, var7, 1.0F);
/* 111 */         GL11.glDisable(2896);
/* 112 */         GL11.glBlendFunc(1, 1);
/* 113 */         return 1;
/*     */       } 
/*     */       
/* 116 */       if (par2 == 2) {
/*     */         
/* 118 */         GL11.glMatrixMode(5890);
/* 119 */         GL11.glLoadIdentity();
/* 120 */         GL11.glMatrixMode(5888);
/* 121 */         GL11.glEnable(2896);
/* 122 */         GL11.glDisable(3042);
/*     */       } 
/*     */     } 
/*     */     
/* 126 */     if (par1EntityCreeper.a(mod_SCP.crystal)) {
/*     */       
/* 128 */       GL11.glDepthMask(true);
/* 129 */       if (par2 == 1) {
/*     */         
/* 131 */         a("/SCPCraft/textures/SCP409Overlay.png");
/* 132 */         GL11.glMatrixMode(5890);
/* 133 */         GL11.glLoadIdentity();
/* 134 */         a(this.i);
/* 135 */         GL11.glMatrixMode(5888);
/* 136 */         return 1;
/*     */       } 
/*     */       
/* 139 */       if (par2 == 2) {
/*     */         
/* 141 */         GL11.glMatrixMode(5890);
/* 142 */         GL11.glLoadIdentity();
/* 143 */         GL11.glMatrixMode(5888);
/* 144 */         GL11.glEnable(2896);
/* 145 */         GL11.glDisable(3042);
/*     */       } 
/*     */     } 
/*     */     
/* 149 */     return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int b(qc par1EntityCreeper, int par2, float par3) {
/* 154 */     return -1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(md par1EntityLiving, float par2) {
/* 163 */     a((qc)par1EntityLiving, par2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int a(md par1EntityLiving, float par2, float par3) {
/* 171 */     return a((qc)par1EntityLiving, par2, par3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int a(md par1EntityLiving, int par2, float par3) {
/* 179 */     return a((qc)par1EntityLiving, par2, par3);
/*     */   }
/*     */ 
/*     */   
/*     */   protected int b(md par1EntityLiving, int par2, float par3) {
/* 184 */     return b((qc)par1EntityLiving, par2, par3);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/bbp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */