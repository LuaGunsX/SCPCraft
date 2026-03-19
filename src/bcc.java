/*     */ import SCPCraft.mod_SCP;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
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
/*     */ @SideOnly(Side.CLIENT)
/*     */ public class bcc
/*     */   extends bcj
/*     */ {
/*     */   protected aww a;
/*     */   protected float f;
/*     */   protected aww g;
/*     */   protected aww h;
/*  34 */   public static String[] k = new String[] { "cloth", "chain", "iron", "diamond", "gold" };
/*     */ 
/*     */   
/*     */   public bcc(aww par1ModelBiped, float par2) {
/*  38 */     this(par1ModelBiped, par2, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public bcc(aww par1ModelBiped, float par2, float par3) {
/*  43 */     super((axa)par1ModelBiped, par2);
/*  44 */     this.a = par1ModelBiped;
/*  45 */     this.f = par3;
/*  46 */     b();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  51 */     this.g = new aww(1.0F);
/*  52 */     this.h = new aww(0.5F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int a(md par1EntityLiving, int par2, float par3) {
/*  60 */     ur var4 = par1EntityLiving.q(3 - par2);
/*     */     
/*  62 */     if (var4 != null) {
/*     */       
/*  64 */       up var5 = var4.b();
/*     */       
/*  66 */       if (var5 instanceof su) {
/*     */         
/*  68 */         su var6 = (su)var5;
/*  69 */         a(ForgeHooksClient.getArmorTexture(var4, "/armor/" + k[var6.c] + "_" + ((par2 == 2) ? 2 : 1) + ".png"));
/*  70 */         aww var7 = (par2 == 2) ? this.h : this.g;
/*  71 */         var7.c.j = (par2 == 0);
/*  72 */         var7.d.j = (par2 == 0);
/*  73 */         var7.e.j = (par2 == 1 || par2 == 2);
/*  74 */         var7.f.j = (par2 == 1);
/*  75 */         var7.g.j = (par2 == 1);
/*  76 */         var7.h.j = (par2 == 2 || par2 == 3);
/*  77 */         var7.i.j = (par2 == 2 || par2 == 3);
/*  78 */         a((axa)var7);
/*     */         
/*  80 */         if (var7 != null)
/*     */         {
/*  82 */           var7.p = this.i.p;
/*     */         }
/*     */         
/*  85 */         if (var7 != null)
/*     */         {
/*  87 */           var7.q = this.i.q;
/*     */         }
/*     */         
/*  90 */         if (var7 != null)
/*     */         {
/*  92 */           var7.s = this.i.s;
/*     */         }
/*     */         
/*  95 */         float var8 = 1.0F;
/*     */         
/*  97 */         if (var6.d() == sv.a) {
/*     */           
/*  99 */           int var9 = var6.b(var4);
/* 100 */           float var10 = (var9 >> 16 & 0xFF) / 255.0F;
/* 101 */           float var11 = (var9 >> 8 & 0xFF) / 255.0F;
/* 102 */           float var12 = (var9 & 0xFF) / 255.0F;
/* 103 */           GL11.glColor3f(var8 * var10, var8 * var11, var8 * var12);
/*     */           
/* 105 */           if (var4.w())
/*     */           {
/* 107 */             return 31;
/*     */           }
/*     */           
/* 110 */           return 16;
/*     */         } 
/*     */         
/* 113 */         GL11.glColor3f(var8, var8, var8);
/*     */         
/* 115 */         if (var4.w())
/*     */         {
/* 117 */           return 15;
/*     */         }
/*     */         
/* 120 */         return 1;
/*     */       } 
/*     */     } 
/*     */     
/* 124 */     return func_82417_a(par1EntityLiving, par2, par3);
/*     */   }
/*     */ 
/*     */   
/*     */   protected int func_82417_a(md entity, int par2, float par3) {
/* 129 */     if (entity.a(mod_SCP.crystal)) {
/*     */       
/* 131 */       GL11.glDepthMask(true);
/* 132 */       if (par2 == 1) {
/*     */         
/* 134 */         a("/SCPCraft/textures/SCP409Overlay.png");
/* 135 */         GL11.glMatrixMode(5890);
/* 136 */         GL11.glLoadIdentity();
/* 137 */         a(this.i);
/* 138 */         GL11.glMatrixMode(5888);
/* 139 */         return 1;
/*     */       } 
/*     */       
/* 142 */       if (par2 == 2) {
/*     */         
/* 144 */         GL11.glMatrixMode(5890);
/* 145 */         GL11.glLoadIdentity();
/* 146 */         GL11.glMatrixMode(5888);
/* 147 */         GL11.glEnable(2896);
/* 148 */         GL11.glDisable(3042);
/*     */       } 
/*     */     } 
/*     */     
/* 152 */     return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void c(md par1EntityLiving, int par2, float par3) {
/* 157 */     ur var4 = par1EntityLiving.q(3 - par2);
/*     */     
/* 159 */     if (var4 != null) {
/*     */       
/* 161 */       up var5 = var4.b();
/*     */       
/* 163 */       if (var5 instanceof su) {
/*     */         
/* 165 */         su var6 = (su)var5;
/* 166 */         a("/armor/" + k[var6.c] + "_" + ((par2 == 2) ? 2 : 1) + "_b.png");
/* 167 */         float var7 = 1.0F;
/* 168 */         GL11.glColor3f(var7, var7, var7);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
/* 175 */     float var10 = 1.0F;
/* 176 */     GL11.glColor3f(var10, var10, var10);
/* 177 */     ur var11 = par1EntityLiving.bD();
/* 178 */     a(par1EntityLiving, var11);
/* 179 */     double var12 = par4 - par1EntityLiving.M;
/*     */     
/* 181 */     if (par1EntityLiving.ah() && !(par1EntityLiving instanceof bag))
/*     */     {
/* 183 */       var12 -= 0.125D;
/*     */     }
/*     */     
/* 186 */     super.a(par1EntityLiving, par2, var12, par6, par8, par9);
/* 187 */     this.a.o = false;
/* 188 */     this.a.n = false;
/* 189 */     this.a.m = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md par1EntityLiving, ur par2ItemStack) {
/* 194 */     this.a.m = (par2ItemStack != null) ? 1 : 0;
/* 195 */     this.a.n = par1EntityLiving.ah();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void c(md par1EntityLiving, float par2) {
/* 200 */     float var3 = 1.0F;
/* 201 */     GL11.glColor3f(var3, var3, var3);
/* 202 */     super.c(par1EntityLiving, par2);
/* 203 */     ur var4 = par1EntityLiving.bD();
/* 204 */     ur var5 = par1EntityLiving.q(3);
/*     */ 
/*     */     
/* 207 */     if (var5 != null) {
/*     */       
/* 209 */       GL11.glPushMatrix();
/* 210 */       this.a.c.c(0.0625F);
/*     */       
/* 212 */       IItemRenderer customRenderer = MinecraftForgeClient.getItemRenderer(var5, IItemRenderer.ItemRenderType.EQUIPPED);
/* 213 */       boolean is3D = (customRenderer != null && customRenderer.shouldUseRenderHelper(IItemRenderer.ItemRenderType.EQUIPPED, var5, IItemRenderer.ItemRendererHelper.BLOCK_3D));
/*     */       
/* 215 */       if (var5.b() instanceof vq) {
/*     */         
/* 217 */         if (is3D || bbb.b(amq.p[var5.c].d())) {
/*     */           
/* 219 */           float var6 = 0.625F;
/* 220 */           GL11.glTranslatef(0.0F, -0.25F, 0.0F);
/* 221 */           GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
/* 222 */           GL11.glScalef(var6, -var6, -var6);
/*     */         } 
/*     */         
/* 225 */         this.b.f.a(par1EntityLiving, var5, 0);
/*     */       }
/* 227 */       else if ((var5.b()).cj == up.bQ.cj) {
/*     */         
/* 229 */         float var6 = 1.0625F;
/* 230 */         GL11.glScalef(var6, -var6, -var6);
/* 231 */         String var7 = "";
/*     */         
/* 233 */         if (var5.o() && var5.p().b("SkullOwner"))
/*     */         {
/* 235 */           var7 = var5.p().i("SkullOwner");
/*     */         }
/*     */         
/* 238 */         bdu.a.a(-0.5F, 0.0F, -0.5F, 1, 180.0F, var5.j(), var7);
/*     */       } 
/*     */       
/* 241 */       GL11.glPopMatrix();
/*     */     } 
/*     */     
/* 244 */     if (var4 != null) {
/*     */       
/* 246 */       GL11.glPushMatrix();
/*     */       
/* 248 */       if (this.i.s) {
/*     */         
/* 250 */         float var6 = 0.5F;
/* 251 */         GL11.glTranslatef(0.0F, 0.625F, 0.0F);
/* 252 */         GL11.glRotatef(-20.0F, -1.0F, 0.0F, 0.0F);
/* 253 */         GL11.glScalef(var6, var6, var6);
/*     */       } 
/*     */       
/* 256 */       this.a.f.c(0.0625F);
/* 257 */       GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
/*     */       
/* 259 */       IItemRenderer customRenderer = MinecraftForgeClient.getItemRenderer(var4, IItemRenderer.ItemRenderType.EQUIPPED);
/* 260 */       boolean is3D = (customRenderer != null && customRenderer.shouldUseRenderHelper(IItemRenderer.ItemRenderType.EQUIPPED, var4, IItemRenderer.ItemRendererHelper.BLOCK_3D));
/*     */       
/* 262 */       if (var4.b() instanceof vq && (is3D || bbb.b(amq.p[var4.c].d()))) {
/*     */         
/* 264 */         float var6 = 0.5F;
/* 265 */         GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
/* 266 */         var6 *= 0.75F;
/* 267 */         GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
/* 268 */         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/* 269 */         GL11.glScalef(-var6, -var6, var6);
/*     */       }
/* 271 */       else if (var4.c == up.k.cj) {
/*     */         
/* 273 */         float var6 = 0.625F;
/* 274 */         GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
/* 275 */         GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
/* 276 */         GL11.glScalef(var6, -var6, var6);
/* 277 */         GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
/* 278 */         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/*     */       }
/* 280 */       else if (up.e[var4.c].n_()) {
/*     */         
/* 282 */         float var6 = 0.625F;
/*     */         
/* 284 */         if (up.e[var4.c].o_()) {
/*     */           
/* 286 */           GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
/* 287 */           GL11.glTranslatef(0.0F, -0.125F, 0.0F);
/*     */         } 
/*     */         
/* 290 */         c();
/* 291 */         GL11.glScalef(var6, -var6, var6);
/* 292 */         GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
/* 293 */         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/*     */       }
/*     */       else {
/*     */         
/* 297 */         float var6 = 0.375F;
/* 298 */         GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
/* 299 */         GL11.glScalef(var6, var6, var6);
/* 300 */         GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
/* 301 */         GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
/* 302 */         GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
/*     */       } 
/*     */       
/* 305 */       this.b.f.a(par1EntityLiving, var4, 0);
/*     */       
/* 307 */       if (var4.b().b())
/*     */       {
/* 309 */         for (int x = 1; x < var4.b().getRenderPasses(var4.j()); x++)
/*     */         {
/* 311 */           this.b.f.a(par1EntityLiving, var4, x);
/*     */         }
/*     */       }
/*     */       
/* 315 */       GL11.glPopMatrix();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void c() {
/* 321 */     GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
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
/* 332 */     a((md)par1Entity, par2, par4, par6, par8, par9);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/bcc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */