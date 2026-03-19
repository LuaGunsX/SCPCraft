/*     */ import SCPCraft.mod_SCP;
/*     */ import cpw.mods.fml.client.TextureFXManager;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraftforge.client.ForgeHooksClient;
/*     */ import net.minecraftforge.client.IItemRenderer;
/*     */ import net.minecraftforge.client.MinecraftForgeClient;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @SideOnly(Side.CLIENT)
/*     */ public class bco
/*     */   extends bcj
/*     */ {
/*     */   private aww a;
/*     */   private aww f;
/*     */   private aww g;
/*  41 */   public static String[] h = new String[] { "cloth", "chain", "iron", "diamond", "gold" };
/*  42 */   public static float NAME_TAG_RANGE = 64.0F;
/*  43 */   public static float NAME_TAG_RANGE_SNEAK = 32.0F;
/*     */ 
/*     */   
/*     */   public bco() {
/*  47 */     super((axa)new aww(0.0F), 0.5F);
/*  48 */     this.a = (aww)this.i;
/*  49 */     this.f = new aww(1.0F);
/*  50 */     this.g = new aww(0.5F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int a(qx par1EntityPlayer, int par2, float par3) {
/*  58 */     ur var4 = par1EntityPlayer.bJ.f(3 - par2);
/*     */     
/*  60 */     if (var4 != null) {
/*     */       
/*  62 */       up var5 = var4.b();
/*     */       
/*  64 */       if (var5 instanceof su) {
/*     */         
/*  66 */         su var6 = (su)var5;
/*  67 */         a(ForgeHooksClient.getArmorTexture(var4, "/armor/" + h[var6.c] + "_" + ((par2 == 2) ? 2 : 1) + ".png"));
/*     */         
/*  69 */         if (h[var6.c] == "classd" || h[var6.c] == "912" || h[var6.c] == "infrared") { a(ForgeHooksClient.getArmorTexture(var4, "/SCPCraft/textures/" + h[var6.c] + "_" + ((par2 == 2) ? 2 : 1) + ".png")); }
/*  70 */         else { a(ForgeHooksClient.getArmorTexture(var4, "/armor/" + h[var6.c] + "_" + ((par2 == 2) ? 2 : 1) + ".png")); }
/*  71 */          aww var7 = (par2 == 2) ? this.g : this.f;
/*  72 */         var7.c.j = (par2 == 0);
/*  73 */         var7.d.j = (par2 == 0);
/*  74 */         var7.e.j = (par2 == 1 || par2 == 2);
/*  75 */         var7.f.j = (par2 == 1);
/*  76 */         var7.g.j = (par2 == 1);
/*  77 */         var7.h.j = (par2 == 2 || par2 == 3);
/*  78 */         var7.i.j = (par2 == 2 || par2 == 3);
/*  79 */         a((axa)var7);
/*     */         
/*  81 */         if (var7 != null)
/*     */         {
/*  83 */           var7.p = this.i.p;
/*     */         }
/*     */         
/*  86 */         if (var7 != null)
/*     */         {
/*  88 */           var7.q = this.i.q;
/*     */         }
/*     */         
/*  91 */         if (var7 != null)
/*     */         {
/*  93 */           var7.s = this.i.s;
/*     */         }
/*     */         
/*  96 */         float var8 = 1.0F;
/*     */         
/*  98 */         if (var6.d() == sv.a) {
/*     */           
/* 100 */           int var9 = var6.b(var4);
/* 101 */           float var10 = (var9 >> 16 & 0xFF) / 255.0F;
/* 102 */           float var11 = (var9 >> 8 & 0xFF) / 255.0F;
/* 103 */           float var12 = (var9 & 0xFF) / 255.0F;
/* 104 */           GL11.glColor3f(var8 * var10, var8 * var11, var8 * var12);
/*     */           
/* 106 */           if (var4.w())
/*     */           {
/* 108 */             return 31;
/*     */           }
/*     */           
/* 111 */           return 16;
/*     */         } 
/*     */         
/* 114 */         GL11.glColor3f(var8, var8, var8);
/*     */         
/* 116 */         if (var4.w())
/*     */         {
/* 118 */           return 15;
/*     */         }
/*     */         
/* 121 */         return 1;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 126 */     if (par1EntityPlayer.a(mod_SCP.crystal)) {
/*     */       
/* 128 */       a("/SCPCraft/textures/SCP409Overlay.png");
/* 129 */       aww var7 = (par2 == 2) ? this.g : this.f;
/* 130 */       var7.c.j = (par2 == 0);
/* 131 */       var7.d.j = (par2 == 0);
/* 132 */       var7.e.j = (par2 == 1 || par2 == 2);
/* 133 */       var7.f.j = (par2 == 1);
/* 134 */       var7.g.j = (par2 == 1);
/* 135 */       var7.h.j = (par2 == 2 || par2 == 3);
/* 136 */       var7.i.j = (par2 == 2 || par2 == 3);
/* 137 */       a((axa)var7);
/* 138 */       return 1;
/*     */     } 
/*     */     
/* 141 */     return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(qx par1EntityPlayer, int par2, float par3) {
/* 146 */     ur var4 = par1EntityPlayer.bJ.f(3 - par2);
/*     */     
/* 148 */     if (var4 != null) {
/*     */       
/* 150 */       up var5 = var4.b();
/*     */       
/* 152 */       if (var5 instanceof su) {
/*     */         
/* 154 */         su var6 = (su)var5;
/* 155 */         a(ForgeHooksClient.getArmorTexture(var4, "/armor/" + h[var6.c] + "_" + ((par2 == 2) ? 2 : 1) + "_b.png"));
/* 156 */         float var7 = 1.0F;
/* 157 */         GL11.glColor3f(var7, var7, var7);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(qx par1EntityPlayer, double par2, double par4, double par6, float par8, float par9) {
/* 164 */     float var10 = 1.0F;
/* 165 */     GL11.glColor3f(var10, var10, var10);
/* 166 */     ur var11 = par1EntityPlayer.bJ.g();
/* 167 */     this.a.m = (var11 != null) ? 1 : 0;
/*     */     
/* 169 */     if (var11 != null && par1EntityPlayer.bL() > 0) {
/*     */       
/* 171 */       vs var12 = var11.n();
/*     */       
/* 173 */       if (var12 == vs.d) {
/*     */         
/* 175 */         this.a.m = 3;
/*     */       }
/* 177 */       else if (var12 == vs.e) {
/*     */         
/* 179 */         this.a.o = true;
/*     */       } 
/*     */     } 
/*     */     
/* 183 */     this.a.n = par1EntityPlayer.ah();
/* 184 */     double var14 = par4 - par1EntityPlayer.M;
/*     */     
/* 186 */     if (par1EntityPlayer.ah() && !(par1EntityPlayer instanceof bag))
/*     */     {
/* 188 */       var14 -= 0.125D;
/*     */     }
/*     */     
/* 191 */     super.a(par1EntityPlayer, par2, var14, par6, par8, par9);
/* 192 */     this.a.o = false;
/* 193 */     this.a.n = false;
/* 194 */     this.a.m = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void render096Target(qx par1EntityPlayer, double par2, double par4, double par6) {
/* 200 */     if (par1EntityPlayer.is096Target) {
/* 201 */       float var16 = par1EntityPlayer.time % 62.0F / 10.0F * 57.295776F;
/* 202 */       GL11.glPushMatrix();
/* 203 */       GL11.glBindTexture(3553, this.b.e.b("/SCPCraft/textures/SCPPearls.png"));
/* 204 */       baz var5 = baz.a;
/* 205 */       int var6 = par1EntityPlayer.b(new ur(mod_SCP.Pearl096), 0);
/* 206 */       float var7 = ((var6 % 16 * 16) + 0.0F) / 256.0F;
/* 207 */       float var8 = ((var6 % 16 * 16) + 15.99F) / 256.0F;
/* 208 */       float var9 = ((var6 / 16 * 16) + 0.0F) / 256.0F;
/* 209 */       float var10 = ((var6 / 16 * 16) + 15.99F) / 256.0F;
/* 210 */       GL11.glRotatef(var16, 0.0F, 1.0F, 0.0F);
/* 211 */       GL11.glEnable(32826);
/* 212 */       GL11.glScalef(0.5F, 0.5F, 0.5F);
/* 213 */       GL11.glTranslatef(-0.5F, 1.0F, 0.0F);
/* 214 */       renderItemIn2D(var5, var8, var9, var7, var10);
/* 215 */       GL11.glPopMatrix();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void renderItemIn2D(baz par1Tessellator, float par2, float par3, float par4, float par5) {
/* 221 */     float var6 = 1.0F;
/* 222 */     float var7 = 0.0625F;
/* 223 */     par1Tessellator.b();
/* 224 */     par1Tessellator.b(0.0F, 0.0F, 1.0F);
/* 225 */     par1Tessellator.a(0.0D, 0.0D, 0.0D, par2, par5);
/* 226 */     par1Tessellator.a(var6, 0.0D, 0.0D, par4, par5);
/* 227 */     par1Tessellator.a(var6, 1.0D, 0.0D, par4, par3);
/* 228 */     par1Tessellator.a(0.0D, 1.0D, 0.0D, par2, par3);
/* 229 */     par1Tessellator.a();
/* 230 */     par1Tessellator.b();
/* 231 */     par1Tessellator.b(0.0F, 0.0F, -1.0F);
/* 232 */     par1Tessellator.a(0.0D, 1.0D, (0.0F - var7), par2, par3);
/* 233 */     par1Tessellator.a(var6, 1.0D, (0.0F - var7), par4, par3);
/* 234 */     par1Tessellator.a(var6, 0.0D, (0.0F - var7), par4, par5);
/* 235 */     par1Tessellator.a(0.0D, 0.0D, (0.0F - var7), par2, par5);
/* 236 */     par1Tessellator.a();
/* 237 */     par1Tessellator.b();
/* 238 */     par1Tessellator.b(-1.0F, 0.0F, 0.0F);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 246 */     int tileSize = (TextureFXManager.instance().getTextureDimensions(GL11.glGetInteger(32873))).width / 16;
/*     */     
/* 248 */     float tx = 1.0F / (32 * tileSize);
/* 249 */     float tz = 1.0F / tileSize;
/*     */     int var8;
/* 251 */     for (var8 = 0; var8 < tileSize; var8++) {
/*     */       
/* 253 */       float var9 = var8 / tileSize;
/* 254 */       float var10 = par2 + (par4 - par2) * var9 - tx;
/* 255 */       float var11 = var6 * var9;
/* 256 */       par1Tessellator.a(var11, 0.0D, (0.0F - var7), var10, par5);
/* 257 */       par1Tessellator.a(var11, 0.0D, 0.0D, var10, par5);
/* 258 */       par1Tessellator.a(var11, 1.0D, 0.0D, var10, par3);
/* 259 */       par1Tessellator.a(var11, 1.0D, (0.0F - var7), var10, par3);
/*     */     } 
/*     */     
/* 262 */     par1Tessellator.a();
/* 263 */     par1Tessellator.b();
/* 264 */     par1Tessellator.b(1.0F, 0.0F, 0.0F);
/*     */     
/* 266 */     for (var8 = 0; var8 < tileSize; var8++) {
/*     */       
/* 268 */       float var9 = var8 / tileSize;
/* 269 */       float var10 = par2 + (par4 - par2) * var9 - tx;
/* 270 */       float var11 = var6 * var9 + tz;
/* 271 */       par1Tessellator.a(var11, 1.0D, (0.0F - var7), var10, par3);
/* 272 */       par1Tessellator.a(var11, 1.0D, 0.0D, var10, par3);
/* 273 */       par1Tessellator.a(var11, 0.0D, 0.0D, var10, par5);
/* 274 */       par1Tessellator.a(var11, 0.0D, (0.0F - var7), var10, par5);
/*     */     } 
/*     */     
/* 277 */     par1Tessellator.a();
/* 278 */     par1Tessellator.b();
/* 279 */     par1Tessellator.b(0.0F, 1.0F, 0.0F);
/*     */     
/* 281 */     for (var8 = 0; var8 < tileSize; var8++) {
/*     */       
/* 283 */       float var9 = var8 / tileSize;
/* 284 */       float var10 = par5 + (par3 - par5) * var9 - tx;
/* 285 */       float var11 = var6 * var9 + tz;
/* 286 */       par1Tessellator.a(0.0D, var11, 0.0D, par2, var10);
/* 287 */       par1Tessellator.a(var6, var11, 0.0D, par4, var10);
/* 288 */       par1Tessellator.a(var6, var11, (0.0F - var7), par4, var10);
/* 289 */       par1Tessellator.a(0.0D, var11, (0.0F - var7), par2, var10);
/*     */     } 
/*     */     
/* 292 */     par1Tessellator.a();
/* 293 */     par1Tessellator.b();
/* 294 */     par1Tessellator.b(0.0F, -1.0F, 0.0F);
/*     */     
/* 296 */     for (var8 = 0; var8 < tileSize; var8++) {
/*     */       
/* 298 */       float var9 = var8 / tileSize;
/* 299 */       float var10 = par5 + (par3 - par5) * var9 - tx;
/* 300 */       float var11 = var6 * var9;
/* 301 */       par1Tessellator.a(var6, var11, 0.0D, par4, var10);
/* 302 */       par1Tessellator.a(0.0D, var11, 0.0D, par2, var10);
/* 303 */       par1Tessellator.a(0.0D, var11, (0.0F - var7), par2, var10);
/* 304 */       par1Tessellator.a(var6, var11, (0.0F - var7), par4, var10);
/*     */     } 
/*     */     
/* 307 */     par1Tessellator.a();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(qx par1EntityPlayer, double par2, double par4, double par6) {
/* 315 */     if (Minecraft.s() && par1EntityPlayer != this.b.h && !par1EntityPlayer.aj()) {
/*     */       
/* 317 */       float var8 = 1.6F;
/* 318 */       float var9 = 0.016666668F * var8;
/* 319 */       double var10 = par1EntityPlayer.e(this.b.h);
/* 320 */       float var12 = par1EntityPlayer.ah() ? NAME_TAG_RANGE_SNEAK : NAME_TAG_RANGE;
/*     */       
/* 322 */       if (var10 < (var12 * var12)) {
/*     */         
/* 324 */         String var13 = par1EntityPlayer.bR;
/*     */         
/* 326 */         if (par1EntityPlayer.ah()) {
/*     */           
/* 328 */           atq var14 = a();
/* 329 */           GL11.glPushMatrix();
/* 330 */           GL11.glTranslatef((float)par2 + 0.0F, (float)par4 + 2.3F, (float)par6);
/* 331 */           GL11.glNormal3f(0.0F, 1.0F, 0.0F);
/* 332 */           GL11.glRotatef(-this.b.i, 0.0F, 1.0F, 0.0F);
/* 333 */           GL11.glRotatef(this.b.j, 1.0F, 0.0F, 0.0F);
/* 334 */           GL11.glScalef(-var9, -var9, var9);
/* 335 */           GL11.glDisable(2896);
/* 336 */           GL11.glTranslatef(0.0F, 0.25F / var9, 0.0F);
/* 337 */           GL11.glDepthMask(false);
/* 338 */           GL11.glEnable(3042);
/* 339 */           GL11.glBlendFunc(770, 771);
/* 340 */           baz var15 = baz.a;
/* 341 */           GL11.glDisable(3553);
/* 342 */           var15.b();
/* 343 */           int var16 = var14.a(var13) / 2;
/* 344 */           var15.a(0.0F, 0.0F, 0.0F, 0.25F);
/* 345 */           var15.a((-var16 - 1), -1.0D, 0.0D);
/* 346 */           var15.a((-var16 - 1), 8.0D, 0.0D);
/* 347 */           var15.a((var16 + 1), 8.0D, 0.0D);
/* 348 */           var15.a((var16 + 1), -1.0D, 0.0D);
/* 349 */           var15.a();
/* 350 */           GL11.glEnable(3553);
/* 351 */           GL11.glDepthMask(true);
/* 352 */           var14.b(var13, -var14.a(var13) / 2, 0, 553648127);
/* 353 */           GL11.glEnable(2896);
/* 354 */           GL11.glDisable(3042);
/* 355 */           GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 356 */           GL11.glPopMatrix();
/*     */         }
/* 358 */         else if (par1EntityPlayer.bw()) {
/*     */           
/* 360 */           a(par1EntityPlayer, var13, par2, par4 - 1.5D, par6, 64);
/*     */         }
/*     */         else {
/*     */           
/* 364 */           a(par1EntityPlayer, var13, par2, par4, par6, 64);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(qx par1EntityPlayer, float par2) {
/* 375 */     float var3 = 1.0F;
/* 376 */     GL11.glColor3f(var3, var3, var3);
/* 377 */     super.c(par1EntityPlayer, par2);
/* 378 */     e(par1EntityPlayer, par2);
/* 379 */     ur var4 = par1EntityPlayer.bJ.f(3);
/*     */     
/* 381 */     if (var4 != null) {
/*     */       
/* 383 */       GL11.glPushMatrix();
/* 384 */       this.a.c.c(0.0625F);
/*     */ 
/*     */       
/* 387 */       if (var4 != null && var4.b() instanceof vq) {
/*     */         
/* 389 */         IItemRenderer customRenderer = MinecraftForgeClient.getItemRenderer(var4, IItemRenderer.ItemRenderType.EQUIPPED);
/* 390 */         boolean is3D = (customRenderer != null && customRenderer.shouldUseRenderHelper(IItemRenderer.ItemRenderType.EQUIPPED, var4, IItemRenderer.ItemRendererHelper.BLOCK_3D));
/*     */         
/* 392 */         if (is3D || bbb.b(amq.p[var4.c].d())) {
/*     */           
/* 394 */           float var5 = 0.625F;
/* 395 */           GL11.glTranslatef(0.0F, -0.25F, 0.0F);
/* 396 */           GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
/* 397 */           GL11.glScalef(var5, -var5, -var5);
/*     */         } 
/*     */         
/* 400 */         this.b.f.a(par1EntityPlayer, var4, 0);
/*     */       }
/* 402 */       else if ((var4.b()).cj == up.bQ.cj) {
/*     */         
/* 404 */         float var5 = 1.0625F;
/* 405 */         GL11.glScalef(var5, -var5, -var5);
/* 406 */         String var6 = "";
/*     */         
/* 408 */         if (var4.o() && var4.p().b("SkullOwner"))
/*     */         {
/* 410 */           var6 = var4.p().i("SkullOwner");
/*     */         }
/*     */         
/* 413 */         bdu.a.a(-0.5F, 0.0F, -0.5F, 1, 180.0F, var4.j(), var6);
/*     */       } 
/*     */       
/* 416 */       GL11.glPopMatrix();
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 422 */     if (par1EntityPlayer.bR.equals("deadmau5") && a(par1EntityPlayer.cu, (String)null))
/*     */     {
/* 424 */       for (int var20 = 0; var20 < 2; var20++) {
/*     */         
/* 426 */         float var25 = par1EntityPlayer.B + (par1EntityPlayer.z - par1EntityPlayer.B) * par2 - par1EntityPlayer.ay + (par1EntityPlayer.ax - par1EntityPlayer.ay) * par2;
/* 427 */         float var7 = par1EntityPlayer.C + (par1EntityPlayer.A - par1EntityPlayer.C) * par2;
/* 428 */         GL11.glPushMatrix();
/* 429 */         GL11.glRotatef(var25, 0.0F, 1.0F, 0.0F);
/* 430 */         GL11.glRotatef(var7, 1.0F, 0.0F, 0.0F);
/* 431 */         GL11.glTranslatef(0.375F * (var20 * 2 - 1), 0.0F, 0.0F);
/* 432 */         GL11.glTranslatef(0.0F, -0.375F, 0.0F);
/* 433 */         GL11.glRotatef(-var7, 1.0F, 0.0F, 0.0F);
/* 434 */         GL11.glRotatef(-var25, 0.0F, 1.0F, 0.0F);
/* 435 */         float var8 = 1.3333334F;
/* 436 */         GL11.glScalef(var8, var8, var8);
/* 437 */         this.a.b(0.0625F);
/* 438 */         GL11.glPopMatrix();
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 444 */     if (a(par1EntityPlayer.cz, "/SCPCraft/textures/SCPCape.png") && !par1EntityPlayer.aj() && !par1EntityPlayer.cf()) {
/*     */       
/* 446 */       GL11.glPushMatrix();
/* 447 */       GL11.glTranslatef(0.0F, 0.0F, 0.125F);
/* 448 */       double var22 = par1EntityPlayer.bT + (par1EntityPlayer.bW - par1EntityPlayer.bT) * par2 - par1EntityPlayer.q + (par1EntityPlayer.t - par1EntityPlayer.q) * par2;
/* 449 */       double var24 = par1EntityPlayer.bU + (par1EntityPlayer.bX - par1EntityPlayer.bU) * par2 - par1EntityPlayer.r + (par1EntityPlayer.u - par1EntityPlayer.r) * par2;
/* 450 */       double var9 = par1EntityPlayer.bV + (par1EntityPlayer.bY - par1EntityPlayer.bV) * par2 - par1EntityPlayer.s + (par1EntityPlayer.v - par1EntityPlayer.s) * par2;
/* 451 */       float var11 = par1EntityPlayer.ay + (par1EntityPlayer.ax - par1EntityPlayer.ay) * par2;
/* 452 */       double var12 = ke.a(var11 * 3.1415927F / 180.0F);
/* 453 */       double var14 = -ke.b(var11 * 3.1415927F / 180.0F);
/* 454 */       float var16 = (float)var24 * 10.0F;
/*     */       
/* 456 */       if (var16 < -6.0F)
/*     */       {
/* 458 */         var16 = -6.0F;
/*     */       }
/*     */       
/* 461 */       if (var16 > 32.0F)
/*     */       {
/* 463 */         var16 = 32.0F;
/*     */       }
/*     */       
/* 466 */       float var17 = (float)(var22 * var12 + var9 * var14) * 100.0F;
/* 467 */       float var18 = (float)(var22 * var14 - var9 * var12) * 100.0F;
/*     */       
/* 469 */       if (var17 < 0.0F)
/*     */       {
/* 471 */         var17 = 0.0F;
/*     */       }
/*     */       
/* 474 */       float var19 = par1EntityPlayer.bP + (par1EntityPlayer.bQ - par1EntityPlayer.bP) * par2;
/* 475 */       var16 += ke.a((par1EntityPlayer.P + (par1EntityPlayer.Q - par1EntityPlayer.P) * par2) * 6.0F) * 32.0F * var19;
/*     */       
/* 477 */       if (par1EntityPlayer.ah())
/*     */       {
/* 479 */         var16 += 25.0F;
/*     */       }
/*     */       
/* 482 */       GL11.glRotatef(6.0F + var17 / 2.0F + var16, 1.0F, 0.0F, 0.0F);
/* 483 */       GL11.glRotatef(var18 / 2.0F, 0.0F, 0.0F, 1.0F);
/* 484 */       GL11.glRotatef(-var18 / 2.0F, 0.0F, 1.0F, 0.0F);
/* 485 */       GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
/* 486 */       this.a.c(0.0625F);
/* 487 */       GL11.glPopMatrix();
/*     */     } 
/*     */     
/* 490 */     ur var21 = par1EntityPlayer.bJ.g();
/*     */     
/* 492 */     if (var21 != null) {
/*     */       
/* 494 */       GL11.glPushMatrix();
/* 495 */       this.a.f.c(0.0625F);
/* 496 */       GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
/*     */       
/* 498 */       if (par1EntityPlayer.cj != null)
/*     */       {
/* 500 */         var21 = new ur(up.D);
/*     */       }
/*     */       
/* 503 */       vs var23 = null;
/*     */       
/* 505 */       if (par1EntityPlayer.bL() > 0)
/*     */       {
/* 507 */         var23 = var21.n();
/*     */       }
/*     */       
/* 510 */       IItemRenderer customRenderer = MinecraftForgeClient.getItemRenderer(var21, IItemRenderer.ItemRenderType.EQUIPPED);
/* 511 */       boolean is3D = (customRenderer != null && customRenderer.shouldUseRenderHelper(IItemRenderer.ItemRenderType.EQUIPPED, var21, IItemRenderer.ItemRendererHelper.BLOCK_3D));
/*     */       
/* 513 */       if (var21.b() instanceof vq && (is3D || bbb.b(amq.p[var21.c].d()))) {
/*     */         
/* 515 */         float var7 = 0.5F;
/* 516 */         GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
/* 517 */         var7 *= 0.75F;
/* 518 */         GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
/* 519 */         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/* 520 */         GL11.glScalef(-var7, -var7, var7);
/*     */       }
/* 522 */       else if (var21.c == up.k.cj) {
/*     */         
/* 524 */         float var7 = 0.625F;
/* 525 */         GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
/* 526 */         GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
/* 527 */         GL11.glScalef(var7, -var7, var7);
/* 528 */         GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
/* 529 */         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/*     */       }
/* 531 */       else if (up.e[var21.c].n_()) {
/*     */         
/* 533 */         float var7 = 0.625F;
/*     */         
/* 535 */         if (up.e[var21.c].o_()) {
/*     */           
/* 537 */           GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
/* 538 */           GL11.glTranslatef(0.0F, -0.125F, 0.0F);
/*     */         } 
/*     */         
/* 541 */         if (par1EntityPlayer.bL() > 0 && var23 == vs.d) {
/*     */           
/* 543 */           GL11.glTranslatef(0.05F, 0.0F, -0.1F);
/* 544 */           GL11.glRotatef(-50.0F, 0.0F, 1.0F, 0.0F);
/* 545 */           GL11.glRotatef(-10.0F, 1.0F, 0.0F, 0.0F);
/* 546 */           GL11.glRotatef(-60.0F, 0.0F, 0.0F, 1.0F);
/*     */         } 
/*     */         
/* 549 */         GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
/* 550 */         GL11.glScalef(var7, -var7, var7);
/* 551 */         GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
/* 552 */         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/*     */       }
/*     */       else {
/*     */         
/* 556 */         float var7 = 0.375F;
/* 557 */         GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
/* 558 */         GL11.glScalef(var7, var7, var7);
/* 559 */         GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
/* 560 */         GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
/* 561 */         GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 568 */       if (var21.b().b()) {
/*     */         
/* 570 */         for (int var27 = 0; var27 < var21.b().getRenderPasses(var21.j()); var27++)
/*     */         {
/* 572 */           int var26 = var21.b().a(var21, var27);
/* 573 */           float var28 = (var26 >> 16 & 0xFF) / 255.0F;
/* 574 */           float var10 = (var26 >> 8 & 0xFF) / 255.0F;
/* 575 */           float var11 = (var26 & 0xFF) / 255.0F;
/* 576 */           GL11.glColor4f(var28, var10, var11, 1.0F);
/* 577 */           this.b.f.a(par1EntityPlayer, var21, var27);
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 582 */         int var27 = var21.b().a(var21, 0);
/* 583 */         float var8 = (var27 >> 16 & 0xFF) / 255.0F;
/* 584 */         float var28 = (var27 >> 8 & 0xFF) / 255.0F;
/* 585 */         float var10 = (var27 & 0xFF) / 255.0F;
/* 586 */         GL11.glColor4f(var8, var28, var10, 1.0F);
/* 587 */         this.b.f.a(par1EntityPlayer, var21, 0);
/*     */       } 
/*     */       
/* 590 */       GL11.glPopMatrix();
/*     */     } 
/*     */     
/* 593 */     GL11.glTranslatef(0.0F, -0.25F, 0.0F);
/* 594 */     GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
/* 595 */     GL11.glColor3f(255.0F, 255.0F, 255.0F);
/* 596 */     render096Target(par1EntityPlayer, 0.0D, 1.0D, 0.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(qx par1EntityPlayer, float par2) {
/* 601 */     float var3 = 0.9375F;
/* 602 */     GL11.glScalef(var3, var3, var3);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(qx par1EntityPlayer) {
/* 607 */     float var2 = 1.0F;
/* 608 */     GL11.glColor3f(var2, var2, var2);
/* 609 */     this.a.p = 0.0F;
/* 610 */     this.a.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, par1EntityPlayer);
/* 611 */     this.a.f.a(0.0625F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void b(qx par1EntityPlayer, double par2, double par4, double par6) {
/* 619 */     if (par1EntityPlayer.S() && par1EntityPlayer.bw()) {
/*     */       
/* 621 */       super.a(par1EntityPlayer, par2 + par1EntityPlayer.cb, par4 + par1EntityPlayer.cA, par6 + par1EntityPlayer.cc);
/*     */     }
/*     */     else {
/*     */       
/* 625 */       super.a(par1EntityPlayer, par2, par4, par6);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(qx par1EntityPlayer, float par2, float par3, float par4) {
/* 634 */     if (par1EntityPlayer.S() && par1EntityPlayer.bw()) {
/*     */       
/* 636 */       GL11.glRotatef(par1EntityPlayer.bW(), 0.0F, 1.0F, 0.0F);
/* 637 */       GL11.glRotatef(a(par1EntityPlayer), 0.0F, 0.0F, 1.0F);
/* 638 */       GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
/*     */     }
/*     */     else {
/*     */       
/* 642 */       super.a(par1EntityPlayer, par2, par3, par4);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void b(md par1EntityLiving, double par2, double par4, double par6) {
/* 651 */     a((qx)par1EntityLiving, par2, par4, par6);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(md par1EntityLiving, float par2) {
/* 660 */     b((qx)par1EntityLiving, par2);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void c(md par1EntityLiving, int par2, float par3) {
/* 665 */     b((qx)par1EntityLiving, par2, par3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int a(md par1EntityLiving, int par2, float par3) {
/* 673 */     return a((qx)par1EntityLiving, par2, par3);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void c(md par1EntityLiving, float par2) {
/* 678 */     a((qx)par1EntityLiving, par2);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md par1EntityLiving, float par2, float par3, float par4) {
/* 683 */     a((qx)par1EntityLiving, par2, par3, par4);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(md par1EntityLiving, double par2, double par4, double par6) {
/* 691 */     b((qx)par1EntityLiving, par2, par4, par6);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
/* 696 */     a((qx)par1EntityLiving, par2, par4, par6, par8, par9);
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
/* 707 */     a((qx)par1Entity, par2, par4, par6, par8, par9);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/bco.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */