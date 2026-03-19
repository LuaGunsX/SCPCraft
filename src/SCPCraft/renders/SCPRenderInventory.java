/*     */ package SCPCraft.renders;
/*     */ 
/*     */ import amq;
/*     */ import baz;
/*     */ import bbb;
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
/*     */ public class SCPRenderInventory
/*     */ {
/*     */   public void renderInvKeySlot(bbb renderblocks, amq block, int i) {
/*  19 */     baz tessellator = baz.a;
/*  20 */     renderblocks.a(0.33000001311302185D, 0.20000000298023224D, 0.0D, 0.6600000262260437D, 0.800000011920929D, 0.1850000023841858D);
/*  21 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/*     */     
/*  23 */     renderblocks.a(0.33000001311302185D, 0.20000000298023224D, 0.1850000023841858D, 0.6600000262260437D, 0.4000000059604645D, 0.25D);
/*  24 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void renderInvSCP015(bbb renderblocks, amq block, int i) {
/*  29 */     baz tessellator = baz.a;
/*  30 */     renderblocks.a(0.33000001311302185D, 0.33000001311302185D, 0.33000001311302185D, 0.6600000262260437D, 0.6600000262260437D, 0.6600000262260437D);
/*  31 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void renderInvSCP789J(bbb renderblocks, amq block, int i) {
/*  36 */     baz tessellator = baz.a;
/*     */     
/*  38 */     renderblocks.a(0.33000001311302185D, -0.30000001192092896D, 0.33000001311302185D, 0.6600000262260437D, 0.10000000149011612D, 0.6600000262260437D);
/*  39 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/*     */ 
/*     */     
/*  42 */     renderblocks.a(0.20000000298023224D, 0.10000000149011612D, 0.25D, 0.800000011920929D, 0.30000001192092896D, 0.8500000238418579D);
/*  43 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/*     */ 
/*     */     
/*  46 */     renderblocks.a(0.20000000298023224D, 0.10000000149011612D, 0.0D, 0.800000011920929D, 1.0D, 0.25D);
/*  47 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/*     */ 
/*     */     
/*  50 */     renderblocks.a(0.20000000298023224D, 0.30000001192092896D, 0.30000001192092896D, 0.800000011920929D, 1.0D, 0.3700000047683716D);
/*  51 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void renderInvSmokeBlock(bbb renderblocks, amq block, int i) {
/*  56 */     baz tessellator = baz.a;
/*  57 */     renderblocks.a(0.0D, 0.0D, 0.0D, 1.0D, 0.8125D, 1.0D);
/*  58 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void renderInvSCP310(bbb renderblocks, amq block, int i) {
/*  63 */     baz tessellator = baz.a;
/*  64 */     renderblocks.a(0.4000000059604645D, 0.20000000298023224D, 0.4000000059604645D, 0.6000000238418579D, 0.5D, 0.6000000238418579D);
/*  65 */     block.cl = 37;
/*  66 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/*     */     
/*  68 */     renderblocks.a(0.30000001192092896D, 0.0D, 0.30000001192092896D, 0.699999988079071D, 0.20000000298023224D, 0.699999988079071D);
/*  69 */     block.cl = 2;
/*  70 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void renderInvShelf(bbb renderblocks, amq block, int i) {
/*  75 */     baz tessellator = baz.a;
/*  76 */     renderblocks.a(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D);
/*  77 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void renderInvBlock(bbb renderblocks, amq block, int i) {
/*  82 */     baz tessellator = baz.a;
/*  83 */     renderblocks.a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
/*  84 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void renderInvStoneCoffin(bbb renderblocks, amq block, int i) {
/*  89 */     baz tessellator = baz.a;
/*  90 */     renderblocks.a(0.0D, 0.0D, 0.0D, 1.0D, 0.15000000596046448D, 1.0D);
/*  91 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/*  92 */     renderblocks.a(0.0D, 0.15000000596046448D, 0.15000000596046448D, 0.15000000596046448D, 1.0D, 0.8500000238418579D);
/*  93 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/*  94 */     renderblocks.a(0.8500000238418579D, 0.15000000596046448D, 0.15000000596046448D, 1.0D, 1.0D, 0.8500000238418579D);
/*  95 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/*  96 */     renderblocks.a(0.0D, 0.15000000596046448D, 0.0D, 1.0D, 1.0D, 0.15000000596046448D);
/*  97 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/*  98 */     renderblocks.a(0.0D, 0.15000000596046448D, 0.8500000238418579D, 1.0D, 1.0D, 1.0D);
/*  99 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void renderInvPoster(bbb renderblocks, amq block, int i) {
/* 104 */     baz tessellator = baz.a;
/* 105 */     renderblocks.a(-0.5D, -0.4000000059604645D, 0.0D, 0.5D, 0.6000000238418579D, 0.20000000298023224D);
/* 106 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void renderInv079(bbb renderblocks, amq block, int i) {
/* 111 */     baz tessellator = baz.a;
/* 112 */     renderblocks.a(0.10000000149011612D, 0.0D, 0.12999999523162842D, 1.100000023841858D, 1.0D, 1.0D);
/* 113 */     GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
/* 114 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/*     */   }
/*     */   
/*     */   public static void renderStandardInvBlock(bbb renderblocks, baz tessellator, amq block, int i) {
/* 118 */     GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
/* 119 */     tessellator.b();
/* 120 */     tessellator.b(0.0F, -1.0F, 0.0F);
/* 121 */     renderblocks.a(block, 0.0D, 0.0D, 0.0D, block.a(0, i));
/* 122 */     tessellator.a();
/* 123 */     tessellator.b();
/* 124 */     tessellator.b(0.0F, 1.0F, 0.0F);
/* 125 */     renderblocks.b(block, 0.0D, 0.0D, 0.0D, block.a(1, i));
/* 126 */     tessellator.a();
/* 127 */     tessellator.b();
/* 128 */     tessellator.b(0.0F, 0.0F, -1.0F);
/* 129 */     renderblocks.c(block, 0.0D, 0.0D, 0.0D, block.a(2, i));
/* 130 */     tessellator.a();
/* 131 */     tessellator.b();
/* 132 */     tessellator.b(0.0F, 0.0F, 1.0F);
/* 133 */     renderblocks.d(block, 0.0D, 0.0D, 0.0D, block.a(3, i));
/* 134 */     tessellator.a();
/* 135 */     tessellator.b();
/* 136 */     tessellator.b(-1.0F, 0.0F, 0.0F);
/* 137 */     renderblocks.e(block, 0.0D, 0.0D, 0.0D, block.a(4, i));
/* 138 */     tessellator.a();
/* 139 */     tessellator.b();
/* 140 */     tessellator.b(1.0F, 0.0F, 0.0F);
/* 141 */     renderblocks.f(block, 0.0D, 0.0D, 0.0D, block.a(5, i));
/* 142 */     tessellator.a();
/* 143 */     GL11.glTranslatef(0.5F, 0.5F, 0.5F);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void renderInvRemoteDoorComp(bbb renderblocks, amq block, int i) {
/* 148 */     baz tessellator = baz.a;
/* 149 */     renderblocks.a(0.12999999523162842D, 0.0D, 0.12999999523162842D, 1.0D, 1.0D, 1.0D);
/* 150 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void renderInvDesk(bbb renderblocks, amq block, int i) {
/* 155 */     baz tessellator = baz.a;
/* 156 */     renderblocks.a(0.0D, 0.800000011920929D, 0.0D, 1.0D, 1.0D, 1.0D);
/* 157 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/* 158 */     renderblocks.a(0.0D, 0.0D, 0.0D, 0.10000000149011612D, 0.800000011920929D, 0.10000000149011612D);
/* 159 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/* 160 */     renderblocks.a(0.0D, 0.0D, 0.8999999761581421D, 0.10000000149011612D, 0.800000011920929D, 1.0D);
/* 161 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/* 162 */     renderblocks.a(0.8999999761581421D, 0.0D, 0.0D, 1.0D, 0.800000011920929D, 0.10000000149011612D);
/* 163 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/* 164 */     renderblocks.a(0.8999999761581421D, 0.0D, 0.8999999761581421D, 1.0D, 0.800000011920929D, 1.0D);
/* 165 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void renderInvChair(bbb renderblocks, amq block, int i) {
/* 170 */     baz tessellator = baz.a;
/* 171 */     renderblocks.a(0.10000000149011612D, 0.0D, 0.10000000149011612D, 0.20000000298023224D, 0.20000000298023224D, 0.20000000298023224D);
/* 172 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/* 173 */     renderblocks.a(0.10000000149011612D, 0.0D, 0.800000011920929D, 0.20000000298023224D, 0.20000000298023224D, 0.8999999761581421D);
/* 174 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/* 175 */     renderblocks.a(0.800000011920929D, 0.0D, 0.800000011920929D, 0.8999999761581421D, 0.20000000298023224D, 0.8999999761581421D);
/* 176 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/* 177 */     renderblocks.a(0.800000011920929D, 0.0D, 0.10000000149011612D, 0.8999999761581421D, 0.20000000298023224D, 0.20000000298023224D);
/* 178 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/* 179 */     renderblocks.a(0.10000000149011612D, 0.20000000298023224D, 0.10000000149011612D, 0.8999999761581421D, 0.30000001192092896D, 0.8999999761581421D);
/* 180 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/* 181 */     renderblocks.a(0.10000000149011612D, 0.30000001192092896D, 0.10000000149011612D, 0.8999999761581421D, 1.0D, 0.20000000298023224D);
/* 182 */     renderStandardInvBlock(renderblocks, tessellator, block, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void renderInvPillar(bbb renderer, amq block, int metadata) {
/* 187 */     baz tessellator = baz.a;
/*     */     
/* 189 */     renderer.a(0.25D, 0.0D, 0.25D, 0.75D, 0.15000000596046448D, 0.75D);
/* 190 */     renderStandardInvBlock(renderer, tessellator, block, metadata);
/*     */     
/* 192 */     renderer.a(0.3499999940395355D, 0.15000000596046448D, 0.3499999940395355D, 0.6499999761581421D, 0.8500000238418579D, 0.6499999761581421D);
/* 193 */     renderStandardInvBlock(renderer, tessellator, block, metadata);
/*     */     
/* 195 */     renderer.a(0.25D, 0.8500000238418579D, 0.25D, 0.75D, 1.0D, 0.75D);
/* 196 */     renderStandardInvBlock(renderer, tessellator, block, metadata);
/*     */   }
/*     */ 
/*     */   
/*     */   public void renderInvSCP822(bbb renderblocks, amq block, int metadata) {
/* 201 */     baz var8 = baz.a;
/*     */     
/* 203 */     renderblocks.a(0.10000000149011612D, 0.10000000149011612D, 0.0D, 0.8999999761581421D, 1.0D, 0.8999999761581421D);
/* 204 */     renderStandardInvBlock(renderblocks, var8, block, metadata);
/* 205 */     block.cl = 70;
/*     */     
/* 207 */     renderblocks.a(0.30000001192092896D, 1.0D, 0.30000001192092896D, 0.699999988079071D, 1.2000000476837158D, 0.699999988079071D);
/* 208 */     renderStandardInvBlock(renderblocks, var8, block, metadata);
/* 209 */     block.cl = 67;
/*     */   }
/*     */ 
/*     */   
/*     */   public void renderInvAlarm(bbb renderer, amq block, int metadata) {
/* 214 */     baz tessellator = baz.a;
/* 215 */     renderer.a(0.0D, 0.0D, 0.0D, 1.0D, 0.3499999940395355D, 1.0D);
/* 216 */     renderStandardInvBlock(renderer, tessellator, block, metadata);
/*     */   }
/*     */ 
/*     */   
/*     */   public void renderSCP513(bbb renderblocks, amq block, int i) {
/* 221 */     baz var8 = baz.a;
/* 222 */     renderblocks.a(0.25D, 0.0D, 0.6499999761581421D, 0.75D, 0.5D, 0.6600000262260437D);
/* 223 */     renderStandardInvBlock(renderblocks, var8, block, i);
/*     */     
/* 225 */     renderblocks.a(0.25D, 0.0D, 0.3499999940395355D, 0.75D, 0.5D, 0.36000001430511475D);
/* 226 */     renderStandardInvBlock(renderblocks, var8, block, i);
/*     */     
/* 228 */     renderblocks.a(0.25D, 0.0D, 0.3499999940395355D, 0.25999999046325684D, 0.5D, 0.6499999761581421D);
/* 229 */     renderStandardInvBlock(renderblocks, var8, block, i);
/*     */     
/* 231 */     renderblocks.a(0.7400000095367432D, 0.0D, 0.3499999940395355D, 0.75D, 0.5D, 0.6499999761581421D);
/* 232 */     renderStandardInvBlock(renderblocks, var8, block, i);
/*     */     
/* 234 */     renderblocks.a(0.25D, 0.5D, 0.3499999940395355D, 0.75D, 0.5099999904632568D, 0.6600000262260437D);
/* 235 */     renderStandardInvBlock(renderblocks, var8, block, i);
/*     */ 
/*     */     
/* 238 */     renderblocks.a(0.41999998688697815D, 0.5099999904632568D, 0.49000000953674316D, 0.5799999833106995D, 0.6000000238418579D, 0.5199999809265137D);
/* 239 */     renderStandardInvBlock(renderblocks, var8, block, i);
/*     */ 
/*     */     
/* 242 */     renderblocks.a(0.49000000953674316D, 0.20000000298023224D, 0.49000000953674316D, 0.5199999809265137D, 0.5D, 0.5199999809265137D);
/* 243 */     renderStandardInvBlock(renderblocks, var8, block, i);
/*     */     
/* 245 */     renderblocks.a(0.4699999988079071D, 0.10000000149011612D, 0.4699999988079071D, 0.5400000214576721D, 0.20000000298023224D, 0.5400000214576721D);
/* 246 */     renderStandardInvBlock(renderblocks, var8, block, i);
/* 247 */     block.cl = 15;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/renders/SCPRenderInventory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */