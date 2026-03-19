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
/*     */ public abstract class bbv
/*     */ {
/*     */   protected bbu b;
/*  27 */   private axa a = (axa)new aww();
/*  28 */   protected bbb c = new bbb();
/*  29 */   protected float d = 0.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  34 */   protected float e = 1.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract void a(lq paramlq, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(String par1Str) {
/*  49 */     bba var2 = this.b.e;
/*  50 */     var2.b(var2.b(par1Str));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean a(String par1Str, String par2Str) {
/*  58 */     bba var3 = this.b.e;
/*  59 */     int var4 = var3.a(par1Str, par2Str);
/*     */     
/*  61 */     if (var4 >= 0) {
/*     */       
/*  63 */       var3.b(var4);
/*  64 */       return true;
/*     */     } 
/*     */ 
/*     */     
/*  68 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(lq par1Entity, double par2, double par4, double par6, float par8) {
/*  77 */     GL11.glDisable(2896);
/*  78 */     int var9 = amq.au.cl;
/*  79 */     int var10 = (var9 & 0xF) << 4;
/*  80 */     int var11 = var9 & 0xF0;
/*  81 */     float var12 = var10 / 256.0F;
/*  82 */     float var13 = (var10 + 15.99F) / 256.0F;
/*  83 */     float var14 = var11 / 256.0F;
/*  84 */     float var15 = (var11 + 15.99F) / 256.0F;
/*  85 */     GL11.glPushMatrix();
/*  86 */     GL11.glTranslatef((float)par2, (float)par4, (float)par6);
/*  87 */     float var16 = par1Entity.N * 1.4F;
/*  88 */     GL11.glScalef(var16, var16, var16);
/*  89 */     a("/terrain.png");
/*  90 */     baz var17 = baz.a;
/*  91 */     float var18 = 0.5F;
/*  92 */     float var19 = 0.0F;
/*  93 */     float var20 = par1Entity.O / var16;
/*  94 */     float var21 = (float)(par1Entity.u - par1Entity.D.b);
/*  95 */     GL11.glRotatef(-this.b.i, 0.0F, 1.0F, 0.0F);
/*  96 */     GL11.glTranslatef(0.0F, 0.0F, -0.3F + (int)var20 * 0.02F);
/*  97 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  98 */     float var22 = 0.0F;
/*  99 */     int var23 = 0;
/* 100 */     var17.b();
/*     */     
/* 102 */     while (var20 > 0.0F) {
/*     */       
/* 104 */       if (var23 % 2 == 0) {
/*     */         
/* 106 */         var12 = var10 / 256.0F;
/* 107 */         var13 = (var10 + 15.99F) / 256.0F;
/* 108 */         var14 = var11 / 256.0F;
/* 109 */         var15 = (var11 + 15.99F) / 256.0F;
/*     */       }
/*     */       else {
/*     */         
/* 113 */         var12 = var10 / 256.0F;
/* 114 */         var13 = (var10 + 15.99F) / 256.0F;
/* 115 */         var14 = (var11 + 16) / 256.0F;
/* 116 */         var15 = ((var11 + 16) + 15.99F) / 256.0F;
/*     */       } 
/*     */       
/* 119 */       if (var23 / 2 % 2 == 0) {
/*     */         
/* 121 */         float var24 = var13;
/* 122 */         var13 = var12;
/* 123 */         var12 = var24;
/*     */       } 
/*     */       
/* 126 */       var17.a((var18 - var19), (0.0F - var21), var22, var13, var15);
/* 127 */       var17.a((-var18 - var19), (0.0F - var21), var22, var12, var15);
/* 128 */       var17.a((-var18 - var19), (1.4F - var21), var22, var12, var14);
/* 129 */       var17.a((var18 - var19), (1.4F - var21), var22, var13, var14);
/* 130 */       var20 -= 0.45F;
/* 131 */       var21 -= 0.45F;
/* 132 */       var18 *= 0.9F;
/* 133 */       var22 += 0.03F;
/* 134 */       var23++;
/*     */     } 
/*     */     
/* 137 */     var17.a();
/* 138 */     GL11.glPopMatrix();
/* 139 */     GL11.glEnable(2896);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void c(lq par1Entity, double par2, double par4, double par6, float par8, float par9) {
/* 148 */     GL11.glEnable(3042);
/* 149 */     GL11.glBlendFunc(770, 771);
/* 150 */     bba var10 = this.b.e;
/*     */     
/* 152 */     if (!(par1Entity instanceof SCPCraft.entities.SCPEntity538)) { var10.b(var10.b("%clamp%/misc/shadow.png")); }
/* 153 */     else { var10.b(var10.b("%clamp%/SCPCraft/textures/mobs/shadowSpider.png")); }
/* 154 */      yc var11 = b();
/* 155 */     GL11.glDepthMask(false);
/* 156 */     float var12 = this.d;
/*     */     
/* 158 */     if (par1Entity instanceof md) {
/*     */       
/* 160 */       md var13 = (md)par1Entity;
/* 161 */       var12 *= var13.bt();
/*     */       
/* 163 */       if (var13.h_())
/*     */       {
/* 165 */         var12 *= 0.5F;
/*     */       }
/*     */     } 
/*     */     
/* 169 */     double var36 = par1Entity.T + (par1Entity.t - par1Entity.T) * par9;
/* 170 */     double var15 = par1Entity.U + (par1Entity.u - par1Entity.U) * par9 + par1Entity.R();
/* 171 */     double var17 = par1Entity.V + (par1Entity.v - par1Entity.V) * par9;
/* 172 */     int var19 = ke.c(var36 - var12);
/* 173 */     int var20 = ke.c(var36 + var12);
/* 174 */     int var21 = ke.c(var15 - var12);
/* 175 */     int var22 = ke.c(var15);
/* 176 */     int var23 = ke.c(var17 - var12);
/* 177 */     int var24 = ke.c(var17 + var12);
/* 178 */     double var25 = par2 - var36;
/* 179 */     double var27 = par4 - var15;
/* 180 */     double var29 = par6 - var17;
/* 181 */     baz var31 = baz.a;
/* 182 */     var31.b();
/*     */     
/* 184 */     for (int var32 = var19; var32 <= var20; var32++) {
/*     */       
/* 186 */       for (int var33 = var21; var33 <= var22; var33++) {
/*     */         
/* 188 */         for (int var34 = var23; var34 <= var24; var34++) {
/*     */           
/* 190 */           int var35 = var11.a(var32, var33 - 1, var34);
/*     */           
/* 192 */           if (var35 > 0 && var11.m(var32, var33, var34) > 3)
/*     */           {
/* 194 */             a(amq.p[var35], par2, par4 + par1Entity.R(), par6, var32, var33, var34, par8, var12, var25, var27 + par1Entity.R(), var29);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 200 */     var31.a();
/* 201 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 202 */     GL11.glDisable(3042);
/* 203 */     GL11.glDepthMask(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private yc b() {
/* 211 */     return this.b.g;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(amq par1Block, double par2, double par4, double par6, int par8, int par9, int par10, float par11, float par12, double par13, double par15, double par17) {
/* 221 */     baz var19 = baz.a;
/*     */     
/* 223 */     if (par1Block.b()) {
/*     */       
/* 225 */       double var20 = (par11 - (par4 - par9 + par15) / 2.0D) * 0.5D * b().p(par8, par9, par10);
/*     */       
/* 227 */       if (var20 >= 0.0D) {
/*     */         
/* 229 */         if (var20 > 1.0D)
/*     */         {
/* 231 */           var20 = 1.0D;
/*     */         }
/*     */         
/* 234 */         var19.a(1.0F, 1.0F, 1.0F, (float)var20);
/* 235 */         double var22 = par8 + par1Block.v() + par13;
/* 236 */         double var24 = par8 + par1Block.w() + par13;
/* 237 */         double var26 = par9 + par1Block.x() + par15 + 0.015625D;
/* 238 */         double var28 = par10 + par1Block.z() + par17;
/* 239 */         double var30 = par10 + par1Block.A() + par17;
/* 240 */         float var32 = (float)((par2 - var22) / 2.0D / par12 + 0.5D);
/* 241 */         float var33 = (float)((par2 - var24) / 2.0D / par12 + 0.5D);
/* 242 */         float var34 = (float)((par6 - var28) / 2.0D / par12 + 0.5D);
/* 243 */         float var35 = (float)((par6 - var30) / 2.0D / par12 + 0.5D);
/* 244 */         var19.a(var22, var26, var28, var32, var34);
/* 245 */         var19.a(var22, var26, var30, var32, var35);
/* 246 */         var19.a(var24, var26, var30, var33, var35);
/* 247 */         var19.a(var24, var26, var28, var33, var34);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(aoe par0AxisAlignedBB, double par1, double par3, double par5) {
/* 257 */     GL11.glDisable(3553);
/* 258 */     baz var7 = baz.a;
/* 259 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 260 */     var7.b();
/* 261 */     var7.b(par1, par3, par5);
/* 262 */     var7.b(0.0F, 0.0F, -1.0F);
/* 263 */     var7.a(par0AxisAlignedBB.a, par0AxisAlignedBB.e, par0AxisAlignedBB.c);
/* 264 */     var7.a(par0AxisAlignedBB.d, par0AxisAlignedBB.e, par0AxisAlignedBB.c);
/* 265 */     var7.a(par0AxisAlignedBB.d, par0AxisAlignedBB.b, par0AxisAlignedBB.c);
/* 266 */     var7.a(par0AxisAlignedBB.a, par0AxisAlignedBB.b, par0AxisAlignedBB.c);
/* 267 */     var7.b(0.0F, 0.0F, 1.0F);
/* 268 */     var7.a(par0AxisAlignedBB.a, par0AxisAlignedBB.b, par0AxisAlignedBB.f);
/* 269 */     var7.a(par0AxisAlignedBB.d, par0AxisAlignedBB.b, par0AxisAlignedBB.f);
/* 270 */     var7.a(par0AxisAlignedBB.d, par0AxisAlignedBB.e, par0AxisAlignedBB.f);
/* 271 */     var7.a(par0AxisAlignedBB.a, par0AxisAlignedBB.e, par0AxisAlignedBB.f);
/* 272 */     var7.b(0.0F, -1.0F, 0.0F);
/* 273 */     var7.a(par0AxisAlignedBB.a, par0AxisAlignedBB.b, par0AxisAlignedBB.c);
/* 274 */     var7.a(par0AxisAlignedBB.d, par0AxisAlignedBB.b, par0AxisAlignedBB.c);
/* 275 */     var7.a(par0AxisAlignedBB.d, par0AxisAlignedBB.b, par0AxisAlignedBB.f);
/* 276 */     var7.a(par0AxisAlignedBB.a, par0AxisAlignedBB.b, par0AxisAlignedBB.f);
/* 277 */     var7.b(0.0F, 1.0F, 0.0F);
/* 278 */     var7.a(par0AxisAlignedBB.a, par0AxisAlignedBB.e, par0AxisAlignedBB.f);
/* 279 */     var7.a(par0AxisAlignedBB.d, par0AxisAlignedBB.e, par0AxisAlignedBB.f);
/* 280 */     var7.a(par0AxisAlignedBB.d, par0AxisAlignedBB.e, par0AxisAlignedBB.c);
/* 281 */     var7.a(par0AxisAlignedBB.a, par0AxisAlignedBB.e, par0AxisAlignedBB.c);
/* 282 */     var7.b(-1.0F, 0.0F, 0.0F);
/* 283 */     var7.a(par0AxisAlignedBB.a, par0AxisAlignedBB.b, par0AxisAlignedBB.f);
/* 284 */     var7.a(par0AxisAlignedBB.a, par0AxisAlignedBB.e, par0AxisAlignedBB.f);
/* 285 */     var7.a(par0AxisAlignedBB.a, par0AxisAlignedBB.e, par0AxisAlignedBB.c);
/* 286 */     var7.a(par0AxisAlignedBB.a, par0AxisAlignedBB.b, par0AxisAlignedBB.c);
/* 287 */     var7.b(1.0F, 0.0F, 0.0F);
/* 288 */     var7.a(par0AxisAlignedBB.d, par0AxisAlignedBB.b, par0AxisAlignedBB.c);
/* 289 */     var7.a(par0AxisAlignedBB.d, par0AxisAlignedBB.e, par0AxisAlignedBB.c);
/* 290 */     var7.a(par0AxisAlignedBB.d, par0AxisAlignedBB.e, par0AxisAlignedBB.f);
/* 291 */     var7.a(par0AxisAlignedBB.d, par0AxisAlignedBB.b, par0AxisAlignedBB.f);
/* 292 */     var7.b(0.0D, 0.0D, 0.0D);
/* 293 */     var7.a();
/* 294 */     GL11.glEnable(3553);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(aoe par0AxisAlignedBB) {
/* 302 */     baz var1 = baz.a;
/* 303 */     var1.b();
/* 304 */     var1.a(par0AxisAlignedBB.a, par0AxisAlignedBB.e, par0AxisAlignedBB.c);
/* 305 */     var1.a(par0AxisAlignedBB.d, par0AxisAlignedBB.e, par0AxisAlignedBB.c);
/* 306 */     var1.a(par0AxisAlignedBB.d, par0AxisAlignedBB.b, par0AxisAlignedBB.c);
/* 307 */     var1.a(par0AxisAlignedBB.a, par0AxisAlignedBB.b, par0AxisAlignedBB.c);
/* 308 */     var1.a(par0AxisAlignedBB.a, par0AxisAlignedBB.b, par0AxisAlignedBB.f);
/* 309 */     var1.a(par0AxisAlignedBB.d, par0AxisAlignedBB.b, par0AxisAlignedBB.f);
/* 310 */     var1.a(par0AxisAlignedBB.d, par0AxisAlignedBB.e, par0AxisAlignedBB.f);
/* 311 */     var1.a(par0AxisAlignedBB.a, par0AxisAlignedBB.e, par0AxisAlignedBB.f);
/* 312 */     var1.a(par0AxisAlignedBB.a, par0AxisAlignedBB.b, par0AxisAlignedBB.c);
/* 313 */     var1.a(par0AxisAlignedBB.d, par0AxisAlignedBB.b, par0AxisAlignedBB.c);
/* 314 */     var1.a(par0AxisAlignedBB.d, par0AxisAlignedBB.b, par0AxisAlignedBB.f);
/* 315 */     var1.a(par0AxisAlignedBB.a, par0AxisAlignedBB.b, par0AxisAlignedBB.f);
/* 316 */     var1.a(par0AxisAlignedBB.a, par0AxisAlignedBB.e, par0AxisAlignedBB.f);
/* 317 */     var1.a(par0AxisAlignedBB.d, par0AxisAlignedBB.e, par0AxisAlignedBB.f);
/* 318 */     var1.a(par0AxisAlignedBB.d, par0AxisAlignedBB.e, par0AxisAlignedBB.c);
/* 319 */     var1.a(par0AxisAlignedBB.a, par0AxisAlignedBB.e, par0AxisAlignedBB.c);
/* 320 */     var1.a(par0AxisAlignedBB.a, par0AxisAlignedBB.b, par0AxisAlignedBB.f);
/* 321 */     var1.a(par0AxisAlignedBB.a, par0AxisAlignedBB.e, par0AxisAlignedBB.f);
/* 322 */     var1.a(par0AxisAlignedBB.a, par0AxisAlignedBB.e, par0AxisAlignedBB.c);
/* 323 */     var1.a(par0AxisAlignedBB.a, par0AxisAlignedBB.b, par0AxisAlignedBB.c);
/* 324 */     var1.a(par0AxisAlignedBB.d, par0AxisAlignedBB.b, par0AxisAlignedBB.c);
/* 325 */     var1.a(par0AxisAlignedBB.d, par0AxisAlignedBB.e, par0AxisAlignedBB.c);
/* 326 */     var1.a(par0AxisAlignedBB.d, par0AxisAlignedBB.e, par0AxisAlignedBB.f);
/* 327 */     var1.a(par0AxisAlignedBB.d, par0AxisAlignedBB.b, par0AxisAlignedBB.f);
/* 328 */     var1.a();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bbu par1RenderManager) {
/* 336 */     this.b = par1RenderManager;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(lq par1Entity, double par2, double par4, double par6, float par8, float par9) {
/* 344 */     if (this.b.k.j && this.d > 0.0F && !par1Entity.aj()) {
/*     */       
/* 346 */       double var10 = this.b.a(par1Entity.t, par1Entity.u, par1Entity.v);
/* 347 */       float var12 = (float)((1.0D - var10 / 256.0D) * this.e);
/*     */       
/* 349 */       if (var12 > 0.0F)
/*     */       {
/* 351 */         c(par1Entity, par2, par4, par6, var12, par9);
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 356 */     if (par1Entity instanceof SCPCraft.entities.SCPEntity538) {
/*     */       
/* 358 */       double var10 = this.b.a(par1Entity.t, par1Entity.u, par1Entity.v);
/* 359 */       float var12 = (float)((1.0D - var10 / 256.0D) * this.e);
/* 360 */       if (var12 > 0.0F)
/*     */       {
/* 362 */         c(par1Entity, par2, par4, par6, var12, par9);
/*     */       }
/*     */     } 
/*     */     
/* 366 */     if (par1Entity.av())
/*     */     {
/* 368 */       a(par1Entity, par2, par4, par6, par9);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public atq a() {
/* 377 */     return this.b.a();
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/bbv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */