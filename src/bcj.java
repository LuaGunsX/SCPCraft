/*     */ import SCPCraft.mod_SCP;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Random;
/*     */ import net.minecraft.client.Minecraft;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ @SideOnly(Side.CLIENT)
/*     */ public class bcj
/*     */   extends bbv
/*     */ {
/*     */   protected axa i;
/*     */   protected axa j;
/*     */   
/*     */   public bcj(axa par1ModelBase, float par2) {
/*  32 */     this.i = par1ModelBase;
/*  33 */     this.d = par2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(axa par1ModelBase) {
/*  42 */     this.j = par1ModelBase;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private float a(float par1, float par2, float par3) {
/*     */     float var4;
/*  54 */     for (var4 = par2 - par1; var4 < -180.0F; var4 += 360.0F);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  59 */     while (var4 >= 180.0F)
/*     */     {
/*  61 */       var4 -= 360.0F;
/*     */     }
/*     */     
/*  64 */     return par1 + par3 * var4;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
/*  69 */     GL11.glPushMatrix();
/*  70 */     GL11.glDisable(2884);
/*  71 */     this.i.p = d(par1EntityLiving, par9);
/*     */     
/*  73 */     if (this.j != null)
/*     */     {
/*  75 */       this.j.p = this.i.p;
/*     */     }
/*     */     
/*  78 */     this.i.q = par1EntityLiving.ag();
/*     */     
/*  80 */     if (this.j != null)
/*     */     {
/*  82 */       this.j.q = this.i.q;
/*     */     }
/*     */     
/*  85 */     this.i.s = par1EntityLiving.h_();
/*     */     
/*  87 */     if (this.j != null)
/*     */     {
/*  89 */       this.j.s = this.i.s;
/*     */     }
/*     */ 
/*     */     
/*     */     try {
/*  94 */       float var10 = a(par1EntityLiving.ay, par1EntityLiving.ax, par9);
/*  95 */       float var11 = a(par1EntityLiving.aA, par1EntityLiving.az, par9);
/*  96 */       float var12 = par1EntityLiving.C + (par1EntityLiving.A - par1EntityLiving.C) * par9;
/*  97 */       a(par1EntityLiving, par2, par4, par6);
/*  98 */       float var13 = b(par1EntityLiving, par9);
/*  99 */       a(par1EntityLiving, var13, var10, par9);
/* 100 */       float var14 = 0.0625F;
/* 101 */       GL11.glEnable(32826);
/* 102 */       GL11.glScalef(-1.0F, -1.0F, 1.0F);
/* 103 */       a(par1EntityLiving, par9);
/* 104 */       GL11.glTranslatef(0.0F, -24.0F * var14 - 0.0078125F, 0.0F);
/* 105 */       float var15 = par1EntityLiving.bg + (par1EntityLiving.bh - par1EntityLiving.bg) * par9;
/* 106 */       float var16 = par1EntityLiving.bi - par1EntityLiving.bh * (1.0F - par9);
/*     */       
/* 108 */       if (par1EntityLiving.h_())
/*     */       {
/* 110 */         var16 *= 3.0F;
/*     */       }
/*     */       
/* 113 */       if (var15 > 1.0F)
/*     */       {
/* 115 */         var15 = 1.0F;
/*     */       }
/*     */       
/* 118 */       GL11.glEnable(3008);
/* 119 */       this.i.a(par1EntityLiving, var16, var15, par9);
/* 120 */       a(par1EntityLiving, var16, var15, var13, var11 - var10, var12, var14);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 126 */       for (int var17 = 0; var17 < 4; var17++) {
/*     */         
/* 128 */         int i = a(par1EntityLiving, var17, par9);
/*     */         
/* 130 */         if (i > 0) {
/*     */           
/* 132 */           this.j.a(par1EntityLiving, var16, var15, par9);
/* 133 */           this.j.a(par1EntityLiving, var16, var15, var13, var11 - var10, var12, var14);
/*     */           
/* 135 */           if ((i & 0xF0) == 16) {
/*     */             
/* 137 */             c(par1EntityLiving, var17, par9);
/* 138 */             this.j.a(par1EntityLiving, var16, var15, var13, var11 - var10, var12, var14);
/*     */           } 
/*     */           
/* 141 */           if ((i & 0xF) == 15) {
/*     */             
/* 143 */             float var19 = par1EntityLiving.ab + par9;
/* 144 */             a("%blur%/misc/glint.png");
/* 145 */             GL11.glEnable(3042);
/* 146 */             float var20 = 0.5F;
/* 147 */             GL11.glColor4f(var20, var20, var20, 1.0F);
/* 148 */             GL11.glDepthFunc(514);
/* 149 */             GL11.glDepthMask(false);
/*     */             
/* 151 */             for (int var21 = 0; var21 < 2; var21++) {
/*     */               
/* 153 */               GL11.glDisable(2896);
/* 154 */               float var22 = 0.76F;
/* 155 */               GL11.glColor4f(0.5F * var22, 0.25F * var22, 0.8F * var22, 1.0F);
/* 156 */               GL11.glBlendFunc(768, 1);
/* 157 */               GL11.glMatrixMode(5890);
/* 158 */               GL11.glLoadIdentity();
/* 159 */               float var23 = var19 * (0.001F + var21 * 0.003F) * 20.0F;
/* 160 */               float var24 = 0.33333334F;
/* 161 */               GL11.glScalef(var24, var24, var24);
/* 162 */               GL11.glRotatef(30.0F - var21 * 60.0F, 0.0F, 0.0F, 1.0F);
/* 163 */               GL11.glTranslatef(0.0F, var23, 0.0F);
/* 164 */               GL11.glMatrixMode(5888);
/* 165 */               this.j.a(par1EntityLiving, var16, var15, var13, var11 - var10, var12, var14);
/*     */             } 
/*     */             
/* 168 */             GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 169 */             GL11.glMatrixMode(5890);
/* 170 */             GL11.glDepthMask(true);
/* 171 */             GL11.glLoadIdentity();
/* 172 */             GL11.glMatrixMode(5888);
/* 173 */             GL11.glEnable(2896);
/* 174 */             GL11.glDisable(3042);
/* 175 */             GL11.glDepthFunc(515);
/*     */           } 
/*     */           
/* 178 */           GL11.glDisable(3042);
/* 179 */           GL11.glEnable(3008);
/*     */         } 
/*     */       } 
/*     */       
/* 183 */       GL11.glDepthMask(true);
/* 184 */       c(par1EntityLiving, par9);
/* 185 */       float var26 = par1EntityLiving.c(par9);
/* 186 */       int var18 = a(par1EntityLiving, var26, par9);
/* 187 */       bfe.a(bfe.b);
/* 188 */       GL11.glDisable(3553);
/* 189 */       bfe.a(bfe.a);
/*     */       
/* 191 */       if ((var18 >> 24 & 0xFF) > 0 || par1EntityLiving.aV > 0 || par1EntityLiving.aY > 0) {
/*     */         
/* 193 */         GL11.glDisable(3553);
/* 194 */         GL11.glDisable(3008);
/* 195 */         GL11.glEnable(3042);
/* 196 */         GL11.glBlendFunc(770, 771);
/* 197 */         GL11.glDepthFunc(514);
/*     */         
/* 199 */         if ((par1EntityLiving.aV > 0 || par1EntityLiving.aY > 0) && !par1EntityLiving.m(mod_SCP.crystal.H)) {
/*     */           
/* 201 */           GL11.glColor4f(var26, 0.0F, 0.0F, 0.4F);
/* 202 */           this.i.a(par1EntityLiving, var16, var15, var13, var11 - var10, var12, var14);
/*     */           
/* 204 */           for (int var27 = 0; var27 < 4; var27++) {
/*     */             
/* 206 */             if (b(par1EntityLiving, var27, par9) >= 0) {
/*     */               
/* 208 */               GL11.glColor4f(var26, 0.0F, 0.0F, 0.4F);
/* 209 */               this.j.a(par1EntityLiving, var16, var15, var13, var11 - var10, var12, var14);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 214 */         if ((var18 >> 24 & 0xFF) > 0) {
/*     */           
/* 216 */           float var19 = (var18 >> 16 & 0xFF) / 255.0F;
/* 217 */           float var20 = (var18 >> 8 & 0xFF) / 255.0F;
/* 218 */           float var29 = (var18 & 0xFF) / 255.0F;
/* 219 */           float var22 = (var18 >> 24 & 0xFF) / 255.0F;
/* 220 */           GL11.glColor4f(var19, var20, var29, var22);
/* 221 */           this.i.a(par1EntityLiving, var16, var15, var13, var11 - var10, var12, var14);
/*     */           
/* 223 */           for (int var28 = 0; var28 < 4; var28++) {
/*     */             
/* 225 */             if (b(par1EntityLiving, var28, par9) >= 0) {
/*     */               
/* 227 */               GL11.glColor4f(var19, var20, var29, var22);
/* 228 */               this.j.a(par1EntityLiving, var16, var15, var13, var11 - var10, var12, var14);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 233 */         GL11.glDepthFunc(515);
/* 234 */         GL11.glDisable(3042);
/* 235 */         GL11.glEnable(3008);
/* 236 */         GL11.glEnable(3553);
/*     */       } 
/*     */       
/* 239 */       GL11.glDisable(32826);
/*     */     }
/* 241 */     catch (Exception var25) {
/*     */       
/* 243 */       var25.printStackTrace();
/*     */     } 
/*     */     
/* 246 */     bfe.a(bfe.b);
/* 247 */     GL11.glEnable(3553);
/* 248 */     bfe.a(bfe.a);
/* 249 */     GL11.glEnable(2884);
/* 250 */     GL11.glPopMatrix();
/* 251 */     b(par1EntityLiving, par2, par4, par6);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(md par1EntityLiving, float par2, float par3, float par4, float par5, float par6, float par7) {
/* 259 */     if (!par1EntityLiving.aj()) {
/*     */       
/* 261 */       a(par1EntityLiving.cu, par1EntityLiving.O());
/* 262 */       this.i.a(par1EntityLiving, par2, par3, par4, par5, par6, par7);
/*     */     }
/*     */     else {
/*     */       
/* 266 */       this.i.a(par2, par3, par4, par5, par6, par7, par1EntityLiving);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(md par1EntityLiving, double par2, double par4, double par6) {
/* 275 */     GL11.glTranslatef((float)par2, (float)par4, (float)par6);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md par1EntityLiving, float par2, float par3, float par4) {
/* 280 */     GL11.glRotatef(180.0F - par3, 0.0F, 1.0F, 0.0F);
/*     */     
/* 282 */     if (par1EntityLiving.aY > 0) {
/*     */       
/* 284 */       float var5 = (par1EntityLiving.aY + par4 - 1.0F) / 20.0F * 1.6F;
/* 285 */       var5 = ke.c(var5);
/*     */       
/* 287 */       if (var5 > 1.0F)
/*     */       {
/* 289 */         var5 = 1.0F;
/*     */       }
/*     */       
/* 292 */       GL11.glRotatef(var5 * a(par1EntityLiving), 0.0F, 0.0F, 1.0F);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected float d(md par1EntityLiving, float par2) {
/* 298 */     return par1EntityLiving.g(par2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float b(md par1EntityLiving, float par2) {
/* 306 */     return par1EntityLiving.ab + par2;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void c(md par1EntityLiving, float par2) {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected void e(md par1EntityLiving, float par2) {
/* 316 */     int var3 = par1EntityLiving.bJ();
/*     */     
/* 318 */     if (var3 > 0) {
/*     */       
/* 320 */       qz var4 = new qz(par1EntityLiving.p, par1EntityLiving.t, par1EntityLiving.u, par1EntityLiving.v);
/* 321 */       Random var5 = new Random(par1EntityLiving.k);
/* 322 */       arw.a();
/*     */       
/* 324 */       for (int var6 = 0; var6 < var3; var6++) {
/*     */         
/* 326 */         GL11.glPushMatrix();
/* 327 */         ayf var7 = this.i.a(var5);
/* 328 */         aya var8 = var7.l.get(var5.nextInt(var7.l.size()));
/* 329 */         var7.c(0.0625F);
/* 330 */         float var9 = var5.nextFloat();
/* 331 */         float var10 = var5.nextFloat();
/* 332 */         float var11 = var5.nextFloat();
/* 333 */         float var12 = (var8.a + (var8.d - var8.a) * var9) / 16.0F;
/* 334 */         float var13 = (var8.b + (var8.e - var8.b) * var10) / 16.0F;
/* 335 */         float var14 = (var8.c + (var8.f - var8.c) * var11) / 16.0F;
/* 336 */         GL11.glTranslatef(var12, var13, var14);
/* 337 */         var9 = var9 * 2.0F - 1.0F;
/* 338 */         var10 = var10 * 2.0F - 1.0F;
/* 339 */         var11 = var11 * 2.0F - 1.0F;
/* 340 */         var9 *= -1.0F;
/* 341 */         var10 *= -1.0F;
/* 342 */         var11 *= -1.0F;
/* 343 */         float var15 = ke.c(var9 * var9 + var11 * var11);
/* 344 */         var4.B = var4.z = (float)(Math.atan2(var9, var11) * 180.0D / Math.PI);
/* 345 */         var4.C = var4.A = (float)(Math.atan2(var10, var15) * 180.0D / Math.PI);
/* 346 */         double var16 = 0.0D;
/* 347 */         double var18 = 0.0D;
/* 348 */         double var20 = 0.0D;
/* 349 */         float var22 = 0.0F;
/* 350 */         this.b.a((lq)var4, var16, var18, var20, var22, par2);
/* 351 */         GL11.glPopMatrix();
/*     */       } 
/*     */       
/* 354 */       arw.b();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected int b(md par1EntityLiving, int par2, float par3) {
/* 360 */     return a(par1EntityLiving, par2, par3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int a(md par1EntityLiving, int par2, float par3) {
/* 369 */     if (par1EntityLiving.a(mod_SCP.crystal)) {
/*     */       
/* 371 */       GL11.glDepthMask(true);
/* 372 */       if (par2 == 1) {
/*     */         
/* 374 */         a("/SCPCraft/textures/SCP409Overlay.png");
/* 375 */         GL11.glMatrixMode(5890);
/* 376 */         GL11.glLoadIdentity();
/* 377 */         a(this.i);
/* 378 */         GL11.glMatrixMode(5888);
/* 379 */         return 1;
/*     */       } 
/*     */       
/* 382 */       if (par2 == 2) {
/*     */         
/* 384 */         GL11.glMatrixMode(5890);
/* 385 */         GL11.glLoadIdentity();
/* 386 */         GL11.glMatrixMode(5888);
/* 387 */         GL11.glEnable(2896);
/* 388 */         GL11.glDisable(3042);
/*     */       } 
/*     */     } 
/* 391 */     return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void c(md par1EntityLiving, int par2, float par3) {}
/*     */   
/*     */   protected float a(md par1EntityLiving) {
/* 398 */     return 90.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int a(md par1EntityLiving, float par2, float par3) {
/* 406 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(md par1EntityLiving, float par2) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void b(md par1EntityLiving, double par2, double par4, double par6) {
/* 420 */     if (Minecraft.v());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(md par1EntityLiving, String par2Str, double par3, double par5, double par7, int par9) {
/* 431 */     double var10 = par1EntityLiving.e(this.b.h);
/*     */     
/* 433 */     if (var10 <= (par9 * par9)) {
/*     */       
/* 435 */       atq var12 = a();
/* 436 */       float var13 = 1.6F;
/* 437 */       float var14 = 0.016666668F * var13;
/* 438 */       GL11.glPushMatrix();
/* 439 */       GL11.glTranslatef((float)par3 + 0.0F, (float)par5 + 2.3F, (float)par7);
/* 440 */       GL11.glNormal3f(0.0F, 1.0F, 0.0F);
/* 441 */       GL11.glRotatef(-this.b.i, 0.0F, 1.0F, 0.0F);
/* 442 */       GL11.glRotatef(this.b.j, 1.0F, 0.0F, 0.0F);
/* 443 */       GL11.glScalef(-var14, -var14, var14);
/* 444 */       GL11.glDisable(2896);
/* 445 */       GL11.glDepthMask(false);
/* 446 */       GL11.glDisable(2929);
/* 447 */       GL11.glEnable(3042);
/* 448 */       GL11.glBlendFunc(770, 771);
/* 449 */       baz var15 = baz.a;
/* 450 */       byte var16 = 0;
/*     */       
/* 452 */       if (par2Str.equals("deadmau5"))
/*     */       {
/* 454 */         var16 = -10;
/*     */       }
/*     */       
/* 457 */       GL11.glDisable(3553);
/* 458 */       var15.b();
/* 459 */       int var17 = var12.a(par2Str) / 2;
/* 460 */       var15.a(0.0F, 0.0F, 0.0F, 0.25F);
/* 461 */       var15.a((-var17 - 1), (-1 + var16), 0.0D);
/* 462 */       var15.a((-var17 - 1), (8 + var16), 0.0D);
/* 463 */       var15.a((var17 + 1), (8 + var16), 0.0D);
/* 464 */       var15.a((var17 + 1), (-1 + var16), 0.0D);
/* 465 */       var15.a();
/* 466 */       GL11.glEnable(3553);
/* 467 */       var12.b(par2Str, -var12.a(par2Str) / 2, var16, 553648127);
/* 468 */       GL11.glEnable(2929);
/* 469 */       GL11.glDepthMask(true);
/* 470 */       var12.b(par2Str, -var12.a(par2Str) / 2, var16, -1);
/* 471 */       GL11.glEnable(2896);
/* 472 */       GL11.glDisable(3042);
/* 473 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 474 */       GL11.glPopMatrix();
/*     */     } 
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
/* 486 */     a((md)par1Entity, par2, par4, par6, par8, par9);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/bcj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */