/*     */ package SCPCraft.renders;
/*     */ 
/*     */ import ModLoader;
/*     */ import SCPCraft.mod_SCP;
/*     */ import SCPCraft.tileentities.SCPTileEntityShelf;
/*     */ import amq;
/*     */ import any;
/*     */ import atq;
/*     */ import baz;
/*     */ import bbb;
/*     */ import bdx;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import up;
/*     */ import ur;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPRenderShelf
/*     */   extends bdx
/*     */ {
/*  23 */   public bbb renderBlocksInstance = new bbb();
/*  24 */   private Minecraft minecraft = ModLoader.getMinecraftInstance();
/*     */   
/*  26 */   public up[] items = new up[] { up.at, up.j, up.l, up.C, up.J, up.h, up.y, up.u, up.ba, up.bj, up.bi, up.bw, up.bo, up.aE, up.aX, up.aL, up.ac, up.ak, up.Y, up.ag, up.ao, up.k, up.E, up.F, up.U, up.by, up.aH, up.aw, up.ax, up.ay, up.aG, up.m, up.aI, up.aZ, up.aQ, up.f, up.g, up.bz, up.bl, up.i, up.n, up.o, up.p, up.bk, up.bc, up.aB, up.av, up.q, up.r, up.s, up.aW, up.aP, up.bH, up.bn, up.bD, up.t, up.bA, up.L, up.u, up.v, up.w, up.x, up.bv, up.bE, up.z, up.A, up.aV, up.aR, up.aU, up.ap, up.B, up.D, up.G, up.bp, up.bt, up.bq, up.M, up.H, up.I, up.K, up.N, up.O, up.R, up.P, up.Q, up.Z, up.ah, up.al, up.V, up.ad, up.S, up.T, up.aF, up.ab, up.aj, up.X, up.af, up.an, up.aT, up.bx, up.bf, up.bh, up.aN, up.az, up.aO, up.W, up.bC, (up)up.bd, up.aa, up.ae, up.am, up.ai, up.aq, up.br, up.as, up.ar, up.au, up.aA, up.aC, up.aD, up.aJ, up.aS, up.bg, (up)up.bs, up.aM, up.aY, (up)up.be, up.bm, up.bu, up.ch, up.bX, up.bZ, up.bB, up.bF, up.bG, up.ca, up.bY, up.cb, up.cc, up.cd, up.ce, up.cf, up.cg, up.bb, up.aK, (up)up.bO, up.bI, up.bJ, (up)up.bW, up.bV, up.bU, up.bK, up.bL, up.bM, up.bN, up.bP, up.bQ, up.bS, up.bR, up.bT };
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
/*     */   public void a(any tileentity, double d, double d1, double d2, float f) {
/*  48 */     renderShelfAt((SCPTileEntityShelf)tileentity, d, d1, d2, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isItem(SCPTileEntityShelf tileentity) {
/*  53 */     int id = tileentity.item.c;
/*  54 */     if (id == (new ur(this.items[0])).c || id == (new ur(this.items[1])).c || id == (new ur(this.items[2])).c || id == (new ur(this.items[3])).c || id == (new ur(this.items[4])).c || id == (new ur(this.items[5])).c || id == (new ur(this.items[6])).c || id == (new ur(this.items[7])).c || id == (new ur(this.items[8])).c || id == (new ur(this.items[9])).c || id == (new ur(this.items[10])).c || id == (new ur(this.items[11])).c || id == (new ur(this.items[12])).c || id == (new ur(this.items[13])).c || id == (new ur(this.items[14])).c || id == (new ur(this.items[15])).c || id == (new ur(this.items[16])).c || id == (new ur(this.items[17])).c || id == (new ur(this.items[18])).c || id == (new ur(this.items[19])).c || id == (new ur(this.items[20])).c || id == (new ur(this.items[21])).c || id == (new ur(this.items[22])).c || id == (new ur(this.items[23])).c || id == (new ur(this.items[24])).c || id == (new ur(this.items[25])).c || id == (new ur(this.items[26])).c || id == (new ur(this.items[27])).c || id == (new ur(this.items[28])).c || id == (new ur(this.items[29])).c || id == (new ur(this.items[30])).c || id == (new ur(this.items[31])).c || id == (new ur(this.items[32])).c || id == (new ur(this.items[33])).c || id == (new ur(this.items[34])).c || id == (new ur(this.items[35])).c || id == (new ur(this.items[36])).c || id == (new ur(this.items[37])).c || id == (new ur(this.items[38])).c || id == (new ur(this.items[39])).c || id == (new ur(this.items[40])).c || id == (new ur(this.items[41])).c || id == (new ur(this.items[42])).c || id == (new ur(this.items[43])).c || id == (new ur(this.items[44])).c || id == (new ur(this.items[45])).c || id == (new ur(this.items[46])).c || id == (new ur(this.items[47])).c || id == (new ur(this.items[48])).c || id == (new ur(this.items[49])).c || id == (new ur(this.items[50])).c || id == (new ur(this.items[51])).c || id == (new ur(this.items[52])).c || id == (new ur(this.items[53])).c || id == (new ur(this.items[54])).c || id == (new ur(this.items[55])).c || id == (new ur(this.items[56])).c || id == (new ur(this.items[57])).c || id == (new ur(this.items[58])).c || id == (new ur(this.items[59])).c || id == (new ur(this.items[60])).c || id == (new ur(this.items[61])).c || id == (new ur(this.items[62])).c || id == (new ur(this.items[63])).c || id == (new ur(this.items[64])).c || id == (new ur(this.items[65])).c || id == (new ur(this.items[66])).c || id == (new ur(this.items[67])).c || id == (new ur(this.items[68])).c || id == (new ur(this.items[69])).c || id == (new ur(this.items[70])).c || id == (new ur(this.items[71])).c || id == (new ur(this.items[72])).c || id == (new ur(this.items[73])).c || id == (new ur(this.items[74])).c || id == (new ur(this.items[75])).c || id == (new ur(this.items[76])).c || id == (new ur(this.items[77])).c || id == (new ur(this.items[78])).c || id == (new ur(this.items[79])).c || id == (new ur(this.items[80])).c || id == (new ur(this.items[81])).c || id == (new ur(this.items[82])).c || id == (new ur(this.items[83])).c || id == (new ur(this.items[84])).c || id == (new ur(this.items[85])).c || id == (new ur(this.items[86])).c || id == (new ur(this.items[87])).c || id == (new ur(this.items[88])).c || id == (new ur(this.items[89])).c || id == (new ur(this.items[90])).c || id == (new ur(this.items[91])).c || id == (new ur(this.items[92])).c || id == (new ur(this.items[93])).c || id == (new ur(this.items[94])).c || id == (new ur(this.items[95])).c || id == (new ur(this.items[96])).c || id == (new ur(this.items[97])).c || id == (new ur(this.items[98])).c || id == (new ur(this.items[99])).c || id == (new ur(this.items[100])).c || id == (new ur(this.items[101])).c || id == (new ur(this.items[102])).c || id == (new ur(this.items[103])).c || id == (new ur(this.items[104])).c || id == (new ur(this.items[105])).c || id == (new ur(this.items[106])).c || id == (new ur(this.items[107])).c || id == (new ur(this.items[108])).c || id == (new ur(this.items[109])).c || id == (new ur(this.items[110])).c || id == (new ur(this.items[111])).c || id == (new ur(this.items[112])).c || id == (new ur(this.items[113])).c || id == (new ur(this.items[114])).c || id == (new ur(this.items[115])).c || id == (new ur(this.items[116])).c || id == (new ur(this.items[117])).c || id == (new ur(this.items[118])).c || id == (new ur(this.items[119])).c || id == (new ur(this.items[120])).c || id == (new ur(this.items[121])).c || id == (new ur(this.items[122])).c || id == (new ur(this.items[123])).c || id == (new ur(this.items[124])).c || id == (new ur(this.items[125])).c || id == (new ur(this.items[126])).c || id == (new ur(this.items[127])).c || id == (new ur(this.items[128])).c || id == (new ur(this.items[129])).c || id == (new ur(this.items[130])).c || id == (new ur(this.items[131])).c || id == (new ur(this.items[132])).c || id == (new ur(this.items[133])).c || id == (new ur(this.items[134])).c || id == (new ur(this.items[135])).c || id == (new ur(this.items[136])).c || id == (new ur(this.items[137])).c || id == (new ur(this.items[138])).c || id == (new ur(this.items[139])).c || id == (new ur(this.items[140])).c || id == (new ur(this.items[141])).c || id == (new ur(this.items[142])).c || id == (new ur(this.items[143])).c || id == (new ur(this.items[144])).c || id == (new ur(this.items[145])).c || id == (new ur(this.items[146])).c || id == (new ur(this.items[147])).c || id == (new ur(this.items[148])).c || id == (new ur(this.items[149])).c || id == (new ur(this.items[150])).c || id == (new ur(this.items[151])).c || id == (new ur(this.items[152])).c || id == (new ur(this.items[153])).c || id == (new ur(this.items[154])).c || id == (new ur(this.items[155])).c || id == (new ur(this.items[156])).c) return true; 
/*  55 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private void renderShelfAt(SCPTileEntityShelf tileentity, double d, double d1, double d2, float f) {
/*  60 */     if (tileentity.item == null)
/*  61 */       return;  GL11.glPushMatrix();
/*  62 */     int facing1 = this.b.f.h(tileentity.l, tileentity.m, tileentity.n) & 0x3;
/*  63 */     float pos = 0.0F;
/*  64 */     double x = 0.0D, z = 0.0D;
/*  65 */     if (facing1 == 0) { pos = 180.0F; }
/*  66 */     else if (facing1 == 1) { pos = 90.0F; }
/*  67 */     else if (facing1 == 2) { pos = 0.0F; }
/*  68 */     else if (facing1 == 3) { pos = 270.0F; }
/*  69 */      if (tileentity.item.k() > 1)
/*  70 */     { renderLivingLabel(tileentity.item.r(), d + 0.5D, d1 + 0.95D, d2 + 0.5D, pos);
/*  71 */       renderLivingLabel((tileentity.item.k() - tileentity.item.j()) + "/" + tileentity.item.k(), d + 0.5D, d1 + 0.85D, d2 + 0.5D, pos); }
/*     */     
/*  73 */     else if (tileentity.item.e()) { renderLivingLabel(tileentity.item.r() + " (" + tileentity.item.a + ")", d + 0.5D, d1 + 0.85D, d2 + 0.5D, pos); }
/*  74 */     else { renderLivingLabel(tileentity.item.r(), d + 0.5D, d1 + 0.85D, d2 + 0.5D, pos); }
/*  75 */      if (tileentity.item.c < 4096 && !isItem(tileentity) && bbb.b(amq.p[tileentity.item.c].d())) {
/*     */       
/*  77 */       float blockScale = 0.35F;
/*  78 */       float offset = 0.5F;
/*  79 */       int s = 0;
/*  80 */       int facing = this.b.f.h(tileentity.l, tileentity.m, tileentity.n) & 0x3;
/*  81 */       if (facing == 0) { facing = 2; }
/*  82 */       else if (facing == 2) { facing = 0; }
/*  83 */        facing = (facing + 2) % 4;
/*  84 */       if (facing == 1 || facing == 3) s = 1;
/*     */       
/*  86 */       if (tileentity.item.c != mod_SCP.SCP151.cm) { GL11.glTranslatef((float)d + offset, (float)d1 + offset, (float)d2 + offset); }
/*  87 */       else if (s == 1) { GL11.glTranslatef((float)d + 0.66F, (float)d1 + 0.6F, (float)d2 + 0.33F); }
/*  88 */       else { GL11.glTranslatef((float)d + 0.33F, (float)d1 + 0.6F, (float)d2 + 0.33F); }
/*     */       
/*  90 */       if (tileentity.item.c != mod_SCP.SCP151.cm) { GL11.glRotatef(90.0F * facing, 0.0F, 1.0F, 0.0F); }
/*  91 */       else if (s == 1) { GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F); }
/*  92 */       else { GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F); }
/*     */       
/*  94 */       GL11.glScalef(blockScale, blockScale, blockScale);
/*  95 */       if (tileentity.item.c < 190) {
/*     */         
/*  97 */         GL11.glBindTexture(3553, this.b.e.b("/terrain.png"));
/*     */       }
/*  99 */       else if (tileentity.item.c >= 190 && tileentity.item.c < 4096) {
/*     */         
/* 101 */         GL11.glBindTexture(3553, this.b.e.b(tileentity.item.b().getTextureFile()));
/*     */       } 
/*     */       
/* 104 */       this.renderBlocksInstance.a(amq.p[tileentity.item.c], tileentity.item.j(), 1.0F);
/*     */     }
/*     */     else {
/*     */       
/* 108 */       GL11.glBindTexture(3553, this.b.e.b(tileentity.item.b().getTextureFile()));
/*     */       
/* 110 */       baz tessellator = baz.a;
/* 111 */       int i = tileentity.item.c();
/* 112 */       float f0 = ((i % 16 * 16) + 0.0F) / 256.0F;
/* 113 */       float f1 = ((i % 16 * 16) + 15.99F) / 256.0F;
/* 114 */       float f2 = ((i / 16 * 16) + 0.0F) / 256.0F;
/* 115 */       float f3 = ((i / 16 * 16) + 15.99F) / 256.0F;
/*     */       
/* 117 */       GL11.glEnable(32826);
/* 118 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 119 */       GL11.glTranslatef((float)d, (float)d1, (float)d2);
/* 120 */       GL11.glTranslatef(0.5F, 0.25F, 0.5F);
/*     */ 
/*     */       
/* 123 */       int facing = this.b.f.h(tileentity.l, tileentity.m, tileentity.n) & 0x3;
/* 124 */       if (facing == 0) { facing = 2; }
/* 125 */       else if (facing == 2) { facing = 0; }
/* 126 */        GL11.glRotatef(90.0F * facing, 0.0F, 1.0F, 0.0F);
/*     */       
/* 128 */       GL11.glTranslatef(-0.2F, 0.0F, 0.0F);
/* 129 */       GL11.glScalef(0.4F, 0.4F, 1.0F);
/*     */       
/* 131 */       renderItem(tessellator, f1, f2, f0, f3);
/*     */       
/* 133 */       if (tileentity.item.b().b())
/*     */       {
/* 135 */         for (int var15 = 0; var15 < tileentity.item.b().getRenderPasses(tileentity.item.j()); var15++) {
/*     */           
/* 137 */           int var16 = tileentity.item.b().a(tileentity.item.c, var15);
/* 138 */           f0 = ((var16 % 16 * 16) + 0.0F) / 256.0F;
/* 139 */           f1 = ((var16 % 16 * 16) + 15.99F) / 256.0F;
/* 140 */           f2 = ((var16 / 16 * 16) + 0.0F) / 256.0F;
/* 141 */           f3 = ((var16 / 16 * 16) + 15.99F) / 256.0F;
/* 142 */           float var17 = 1.0F;
/* 143 */           int var18 = up.e[tileentity.item.c].a(tileentity.item, var15);
/* 144 */           float var19 = (var18 >> 16 & 0xFF) / 255.0F;
/* 145 */           float var20 = (var18 >> 8 & 0xFF) / 255.0F;
/* 146 */           float var21 = (var18 & 0xFF) / 255.0F;
/* 147 */           GL11.glColor4f(var19 * var17, var20 * var17, var21 * var17, 1.0F);
/* 148 */           renderItem(tessellator, f1, f2, f0, f3);
/*     */         } 
/*     */       }
/*     */       
/* 152 */       if (tileentity.item.t()) {
/*     */         
/* 154 */         GL11.glDepthFunc(514);
/* 155 */         GL11.glDisable(2896);
/* 156 */         this.b.e.b(this.b.e.b("%blur%/misc/glint.png"));
/* 157 */         GL11.glEnable(3042);
/* 158 */         GL11.glColor4f(0.5F, 0.25F, 0.8F, 0.175F);
/* 159 */         GL11.glMatrixMode(5890);
/* 160 */         GL11.glPushMatrix();
/* 161 */         float f8 = 0.325F;
/* 162 */         GL11.glScalef(f8, f8, f8);
/* 163 */         float f9 = (float)(System.currentTimeMillis() % 3000L) / 3000.0F * 4.0F;
/* 164 */         GL11.glTranslatef(f9, 0.0F, 0.0F);
/* 165 */         GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
/* 166 */         renderItem(tessellator, 0.0F, 0.0F, 1.0F, 1.0F);
/* 167 */         GL11.glPopMatrix();
/* 168 */         GL11.glPushMatrix();
/* 169 */         GL11.glScalef(f8, f8, f8);
/* 170 */         f9 = (float)(System.currentTimeMillis() % 4873L) / 4873.0F * 4.0F;
/* 171 */         GL11.glTranslatef(-f9, 0.0F, 0.0F);
/* 172 */         GL11.glRotatef(10.0F, 0.0F, 0.0F, 1.0F);
/* 173 */         renderItem(tessellator, 0.0F, 0.0F, 1.0F, 1.0F);
/* 174 */         GL11.glPopMatrix();
/* 175 */         GL11.glMatrixMode(5888);
/* 176 */         GL11.glDisable(3042);
/* 177 */         GL11.glEnable(2896);
/* 178 */         GL11.glDepthFunc(515);
/*     */       } 
/*     */     } 
/*     */     
/* 182 */     GL11.glPopMatrix();
/*     */   }
/*     */   
/*     */   protected void renderLivingLabel(String par2Str, double par3, double par5, double par7, float position) {
/* 186 */     atq var12 = this.minecraft.p;
/* 187 */     float var13 = 0.75F;
/* 188 */     float var14 = 0.012666668F * var13;
/* 189 */     float var17 = 0.0F;
/* 190 */     if (var12.a(par2Str) > 70) { var17 = 0.9F / var12.a(par2Str); }
/* 191 */     else { var17 = var14; }
/* 192 */      GL11.glPushMatrix();
/* 193 */     GL11.glTranslatef((float)par3, (float)par5, (float)par7);
/* 194 */     GL11.glNormal3f(0.0F, 0.0F, 0.0F);
/* 195 */     GL11.glRotatef(position, 0.0F, 1.0F, 0.0F);
/* 196 */     GL11.glScalef(-var17, -var14, var17);
/* 197 */     GL11.glDisable(2896);
/* 198 */     GL11.glDepthMask(false);
/* 199 */     byte var16 = 0;
/* 200 */     var12.b(par2Str, -var12.a(par2Str) / 2, var16, 553648127);
/* 201 */     GL11.glDepthMask(true);
/* 202 */     GL11.glEnable(2896);
/* 203 */     GL11.glPopMatrix();
/*     */   }
/*     */ 
/*     */   
/*     */   public void renderItem(baz par1Tessellator, float par2, float par3, float par4, float par5) {
/* 208 */     float f = 1.0F;
/* 209 */     float f1 = 0.0625F;
/* 210 */     par1Tessellator.b();
/* 211 */     par1Tessellator.b(0.0F, 0.0F, 1.0F);
/* 212 */     par1Tessellator.a(0.0D, 0.0D, 0.0D, par2, par5);
/* 213 */     par1Tessellator.a(f, 0.0D, 0.0D, par4, par5);
/* 214 */     par1Tessellator.a(f, 1.0D, 0.0D, par4, par3);
/* 215 */     par1Tessellator.a(0.0D, 1.0D, 0.0D, par2, par3);
/* 216 */     par1Tessellator.a();
/* 217 */     par1Tessellator.b();
/* 218 */     par1Tessellator.b(0.0F, 0.0F, -1.0F);
/* 219 */     par1Tessellator.a(0.0D, 1.0D, (0.0F - f1), par2, par3);
/* 220 */     par1Tessellator.a(f, 1.0D, (0.0F - f1), par4, par3);
/* 221 */     par1Tessellator.a(f, 0.0D, (0.0F - f1), par4, par5);
/* 222 */     par1Tessellator.a(0.0D, 0.0D, (0.0F - f1), par2, par5);
/* 223 */     par1Tessellator.a();
/* 224 */     par1Tessellator.b();
/* 225 */     par1Tessellator.b(-1.0F, 0.0F, 0.0F);
/*     */     
/* 227 */     for (int i = 0; i < 16; i++) {
/*     */       
/* 229 */       float f2 = i / 16.0F;
/* 230 */       float f6 = par2 + (par4 - par2) * f2 - 0.001953125F;
/* 231 */       float f10 = f * f2;
/* 232 */       par1Tessellator.a(f10, 0.0D, (0.0F - f1), f6, par5);
/* 233 */       par1Tessellator.a(f10, 0.0D, 0.0D, f6, par5);
/* 234 */       par1Tessellator.a(f10, 1.0D, 0.0D, f6, par3);
/* 235 */       par1Tessellator.a(f10, 1.0D, (0.0F - f1), f6, par3);
/*     */     } 
/*     */     
/* 238 */     par1Tessellator.a();
/* 239 */     par1Tessellator.b();
/* 240 */     par1Tessellator.b(1.0F, 0.0F, 0.0F);
/*     */     
/* 242 */     for (int j = 0; j < 16; j++) {
/*     */       
/* 244 */       float f3 = j / 16.0F;
/* 245 */       float f7 = par2 + (par4 - par2) * f3 - 0.001953125F;
/* 246 */       float f11 = f * f3 + 0.0625F;
/* 247 */       par1Tessellator.a(f11, 1.0D, (0.0F - f1), f7, par3);
/* 248 */       par1Tessellator.a(f11, 1.0D, 0.0D, f7, par3);
/* 249 */       par1Tessellator.a(f11, 0.0D, 0.0D, f7, par5);
/* 250 */       par1Tessellator.a(f11, 0.0D, (0.0F - f1), f7, par5);
/*     */     } 
/*     */     
/* 253 */     par1Tessellator.a();
/* 254 */     par1Tessellator.b();
/* 255 */     par1Tessellator.b(0.0F, 1.0F, 0.0F);
/*     */     
/* 257 */     for (int k = 0; k < 16; k++) {
/*     */       
/* 259 */       float f4 = k / 16.0F;
/* 260 */       float f8 = par5 + (par3 - par5) * f4 - 0.001953125F;
/* 261 */       float f12 = f * f4 + 0.0625F;
/* 262 */       par1Tessellator.a(0.0D, f12, 0.0D, par2, f8);
/* 263 */       par1Tessellator.a(f, f12, 0.0D, par4, f8);
/* 264 */       par1Tessellator.a(f, f12, (0.0F - f1), par4, f8);
/* 265 */       par1Tessellator.a(0.0D, f12, (0.0F - f1), par2, f8);
/*     */     } 
/*     */     
/* 268 */     par1Tessellator.a();
/* 269 */     par1Tessellator.b();
/* 270 */     par1Tessellator.b(0.0F, -1.0F, 0.0F);
/*     */     
/* 272 */     for (int l = 0; l < 16; l++) {
/*     */       
/* 274 */       float f5 = l / 16.0F;
/* 275 */       float f9 = par5 + (par3 - par5) * f5 - 0.001953125F;
/* 276 */       float f13 = f * f5;
/* 277 */       par1Tessellator.a(f, f13, 0.0D, par4, f9);
/* 278 */       par1Tessellator.a(0.0D, f13, 0.0D, par2, f9);
/* 279 */       par1Tessellator.a(0.0D, f13, (0.0F - f1), par2, f9);
/* 280 */       par1Tessellator.a(f, f13, (0.0F - f1), par4, f9);
/*     */     } 
/*     */     
/* 283 */     par1Tessellator.a();
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/renders/SCPRenderShelf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */