/*      */ package SCPCraft.renders;
/*      */ 
/*      */ import SCPCraft.blocks.SCPBlock015;
/*      */ import SCPCraft.blocks.SCPBlockCorrodedDoor;
/*      */ import SCPCraft.blocks.SCPBlockDesk;
/*      */ import SCPCraft.blocks.SCPBlockSlideDoor;
/*      */ import SCPCraft.blocks.SCPBlockStoneCoffin;
/*      */ import amq;
/*      */ import ban;
/*      */ import baz;
/*      */ import bbb;
/*      */ import java.util.Random;
/*      */ import ym;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class SCPBlockRenders
/*      */ {
/*      */   public boolean RenderKeycardSlot(amq block, int i, int j, int k, bbb renderblocks) {
/*   25 */     int l = renderblocks.a.h(i, j, k);
/*   26 */     int m = l & 0x7;
/*   27 */     int n = block.d(renderblocks.a, i, j, k, 3);
/*   28 */     int n1 = block.d(renderblocks.a, i, j, k, 4);
/*   29 */     int n2 = block.d(renderblocks.a, i, j, k, 5);
/*      */     
/*   31 */     if (m == 0 || m == 4) {
/*      */       
/*   33 */       renderblocks.a(0.33000001311302185D, 0.20000000298023224D, 0.0D, 0.6600000262260437D, 0.800000011920929D, 0.1850000023841858D);
/*   34 */       renderblocks.q(block, i, j, k);
/*      */       
/*   36 */       renderblocks.a(0.33000001311302185D, 0.20000000298023224D, 0.1850000023841858D, 0.6600000262260437D, 0.4000000059604645D, 0.25D);
/*   37 */       renderblocks.q(block, i, j, k);
/*      */       
/*   39 */       renderblocks.a(0.33000001311302185D, 0.20000000298023224D, 0.0D, 0.6600000262260437D, 0.800000011920929D, 0.25D);
/*      */     } 
/*   41 */     if (m == 1 || m == 5) {
/*      */       
/*   43 */       renderblocks.a(0.8149999976158142D, 0.20000000298023224D, 0.33000001311302185D, 1.0D, 0.800000011920929D, 0.6600000262260437D);
/*   44 */       renderblocks.q(block, i, j, k);
/*      */       
/*   46 */       renderblocks.a(0.75D, 0.20000000298023224D, 0.33000001311302185D, 0.8149999976158142D, 0.4000000059604645D, 0.6600000262260437D);
/*   47 */       renderblocks.q(block, i, j, k);
/*      */       
/*   49 */       renderblocks.a(0.75D, 0.20000000298023224D, 0.33000001311302185D, 1.0D, 0.800000011920929D, 0.6600000262260437D);
/*      */     } 
/*   51 */     if (m == 2 || m == 6) {
/*      */       
/*   53 */       renderblocks.a(0.33000001311302185D, 0.20000000298023224D, 0.8149999976158142D, 0.6600000262260437D, 0.800000011920929D, 1.0D);
/*   54 */       renderblocks.q(block, i, j, k);
/*      */       
/*   56 */       renderblocks.a(0.33000001311302185D, 0.20000000298023224D, 0.75D, 0.6600000262260437D, 0.4000000059604645D, 0.8149999976158142D);
/*   57 */       renderblocks.q(block, i, j, k);
/*      */       
/*   59 */       renderblocks.a(0.33000001311302185D, 0.20000000298023224D, 0.75D, 0.6600000262260437D, 0.800000011920929D, 1.0D);
/*      */     } 
/*   61 */     if (m == 3 || m == 7) {
/*      */       
/*   63 */       renderblocks.a(0.0D, 0.20000000298023224D, 0.33000001311302185D, 0.1850000023841858D, 0.800000011920929D, 0.6600000262260437D);
/*   64 */       renderblocks.q(block, i, j, k);
/*      */       
/*   66 */       renderblocks.a(0.1850000023841858D, 0.20000000298023224D, 0.33000001311302185D, 0.25D, 0.4000000059604645D, 0.6600000262260437D);
/*   67 */       renderblocks.q(block, i, j, k);
/*      */       
/*   69 */       renderblocks.a(0.0D, 0.20000000298023224D, 0.30000001192092896D, 0.25D, 0.800000011920929D, 0.6000000238418579D);
/*      */     } 
/*   71 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public void colorFix(amq par1Block, bbb renderblocks, int par2, int par3, int par4) {
/*   76 */     baz var6 = baz.a;
/*   77 */     var6.c(par1Block.e(renderblocks.a, par2, par3, par4));
/*   78 */     float var7 = 1.0F;
/*   79 */     int var8 = par1Block.b(renderblocks.a, par2, par3, par4);
/*   80 */     float var9 = (var8 >> 16 & 0xFF) / 255.0F;
/*   81 */     float var10 = (var8 >> 8 & 0xFF) / 255.0F;
/*   82 */     float var11 = (var8 & 0xFF) / 255.0F;
/*      */     
/*   84 */     if (ban.a) {
/*      */       
/*   86 */       float var12 = (var9 * 30.0F + var10 * 59.0F + var11 * 11.0F) / 100.0F;
/*   87 */       float var13 = (var9 * 30.0F + var10 * 70.0F) / 100.0F;
/*   88 */       float var14 = (var9 * 30.0F + var11 * 70.0F) / 100.0F;
/*   89 */       var9 = var12;
/*   90 */       var10 = var13;
/*   91 */       var11 = var14;
/*      */     } 
/*      */     
/*   94 */     var6.a(var7 * var9, var7 * var10, var7 * var11);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean renderSmokeBlock(amq par1Block, int par2, int par3, int par4, bbb renderblocks) {
/*   99 */     int i = renderblocks.a.h(par2, par3, par4);
/*  100 */     int var15 = par1Block.d(renderblocks.a, par2, par3, par4, 4);
/*  101 */     colorFix(par1Block, renderblocks, par2, par3, par4);
/*      */     
/*  103 */     if (i == 0) {
/*      */       
/*  105 */       renderblocks.a(0.0D, 0.0D, 0.0D, 1.0D, 0.8125D, 1.0D);
/*  106 */       renderblocks.q(par1Block, par2, par3, par4);
/*  107 */       colorFix(par1Block, renderblocks, par2, par3, par4);
/*      */     } 
/*  109 */     if (i == 1) {
/*      */       
/*  111 */       renderblocks.a(0.0D, 0.1875D, 0.0D, 1.0D, 1.0D, 1.0D);
/*  112 */       renderblocks.q(par1Block, par2, par3, par4);
/*  113 */       colorFix(par1Block, renderblocks, par2, par3, par4);
/*      */     } 
/*  115 */     if (i == 2) {
/*      */       
/*  117 */       renderblocks.a(0.0D, 0.0D, 0.0D, 0.8125D, 1.0D, 1.0D);
/*  118 */       renderblocks.q(par1Block, par2, par3, par4);
/*  119 */       colorFix(par1Block, renderblocks, par2, par3, par4);
/*      */     } 
/*  121 */     if (i == 3) {
/*      */       
/*  123 */       renderblocks.a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.8125D);
/*  124 */       renderblocks.q(par1Block, par2, par3, par4);
/*  125 */       colorFix(par1Block, renderblocks, par2, par3, par4);
/*      */     } 
/*  127 */     if (i == 4) {
/*      */       
/*  129 */       renderblocks.a(0.1875D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
/*  130 */       renderblocks.q(par1Block, par2, par3, par4);
/*  131 */       colorFix(par1Block, renderblocks, par2, par3, par4);
/*      */     } 
/*  133 */     if (i == 5) {
/*      */       
/*  135 */       renderblocks.a(0.0D, 0.0D, 0.1875D, 1.0D, 1.0D, 1.0D);
/*  136 */       renderblocks.q(par1Block, par2, par3, par4);
/*  137 */       colorFix(par1Block, renderblocks, par2, par3, par4);
/*      */     } 
/*  139 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean renderSCP310(amq par1Block, int par2, int par3, int par4, bbb renderblocks) {
/*  144 */     renderblocks.a(0.4000000059604645D, 0.20000000298023224D, 0.4000000059604645D, 0.6000000238418579D, 0.5D, 0.6000000238418579D);
/*  145 */     renderblocks.q(par1Block, par2, par3, par4);
/*  146 */     renderblocks.b(par1Block, par2, par3, par4, 8);
/*  147 */     renderblocks.e(par1Block, par2, par3, par4, 9);
/*  148 */     renderblocks.f(par1Block, par2, par3, par4, 9);
/*  149 */     renderblocks.c(par1Block, par2, par3, par4, 9);
/*  150 */     renderblocks.d(par1Block, par2, par3, par4, 9);
/*      */     
/*  152 */     renderblocks.a(0.30000001192092896D, 0.0D, 0.30000001192092896D, 0.699999988079071D, 0.20000000298023224D, 0.699999988079071D);
/*  153 */     par1Block.cl = 2;
/*  154 */     renderblocks.q(par1Block, par2, par3, par4);
/*      */     
/*  156 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getTextureFile() {
/*  161 */     return "/SCPCraft/textures/SCPblox.png";
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean CorrodedDoor(amq par1Block, int par2, int par3, int par4, bbb renderblocks) {
/*  166 */     baz var5 = baz.a;
/*  167 */     SCPBlockCorrodedDoor var6 = (SCPBlockCorrodedDoor)par1Block;
/*  168 */     boolean var7 = false;
/*  169 */     float var8 = 0.5F;
/*  170 */     float var9 = 1.0F;
/*  171 */     float var10 = 0.8F;
/*  172 */     float var11 = 0.6F;
/*  173 */     int var12 = par1Block.e(renderblocks.a, par2, par3, par4);
/*  174 */     colorFix(par1Block, renderblocks, par2, par3, par4);
/*  175 */     var5.a(var8, var8, var8);
/*  176 */     renderblocks.a(par1Block, par2, par3, par4, par1Block.d(renderblocks.a, par2, par3, par4, 0));
/*  177 */     var7 = true;
/*  178 */     colorFix(par1Block, renderblocks, par2, par3, par4);
/*  179 */     var5.a(var9, var9, var9);
/*  180 */     renderblocks.b(par1Block, par2, par3, par4, par1Block.d(renderblocks.a, par2, par3, par4, 1));
/*  181 */     var7 = true;
/*  182 */     colorFix(par1Block, renderblocks, par2, par3, par4);
/*  183 */     var5.a(var10, var10, var10);
/*  184 */     int var14 = par1Block.d(renderblocks.a, par2, par3, par4, 2);
/*      */     
/*  186 */     if (var14 < 0) {
/*      */       
/*  188 */       renderblocks.e = true;
/*  189 */       var14 = -var14;
/*      */     } 
/*      */     
/*  192 */     renderblocks.c(par1Block, par2, par3, par4, var14);
/*  193 */     var7 = true;
/*  194 */     renderblocks.e = false;
/*  195 */     colorFix(par1Block, renderblocks, par2, par3, par4);
/*  196 */     var5.a(var10, var10, var10);
/*  197 */     var14 = par1Block.d(renderblocks.a, par2, par3, par4, 3);
/*      */     
/*  199 */     if (var14 < 0) {
/*      */       
/*  201 */       renderblocks.e = true;
/*  202 */       var14 = -var14;
/*      */     } 
/*      */     
/*  205 */     renderblocks.d(par1Block, par2, par3, par4, var14);
/*  206 */     var7 = true;
/*  207 */     renderblocks.e = false;
/*  208 */     colorFix(par1Block, renderblocks, par2, par3, par4);
/*  209 */     var5.a(var11, var11, var11);
/*  210 */     var14 = par1Block.d(renderblocks.a, par2, par3, par4, 4);
/*      */     
/*  212 */     if (var14 < 0) {
/*      */       
/*  214 */       renderblocks.e = true;
/*  215 */       var14 = -var14;
/*      */     } 
/*      */     
/*  218 */     renderblocks.e(par1Block, par2, par3, par4, var14);
/*  219 */     var7 = true;
/*  220 */     renderblocks.e = false;
/*  221 */     colorFix(par1Block, renderblocks, par2, par3, par4);
/*  222 */     var5.a(var11, var11, var11);
/*  223 */     var14 = par1Block.d(renderblocks.a, par2, par3, par4, 5);
/*      */     
/*  225 */     if (var14 < 0) {
/*      */       
/*  227 */       renderblocks.e = true;
/*  228 */       var14 = -var14;
/*      */     } 
/*      */     
/*  231 */     renderblocks.f(par1Block, par2, par3, par4, var14);
/*  232 */     var7 = true;
/*  233 */     renderblocks.e = false;
/*  234 */     return var7;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean renderToilet(amq block, int i, int j, int k, bbb renderblocks) {
/*  239 */     int l = renderblocks.a.h(i, j, k);
/*  240 */     if (l == 0) {
/*  241 */       renderblocks.a(0.33000001311302185D, 0.0D, 0.33000001311302185D, 0.6600000262260437D, 0.4000000059604645D, 0.6600000262260437D);
/*  242 */       renderblocks.q(block, i, j, k);
/*  243 */       renderblocks.a(0.20000000298023224D, 0.4000000059604645D, 0.25D, 0.800000011920929D, 0.6000000238418579D, 0.8500000238418579D);
/*  244 */       renderblocks.q(block, i, j, k);
/*  245 */       renderblocks.a(0.20000000298023224D, 0.4000000059604645D, 0.0D, 0.800000011920929D, 1.2999999523162842D, 0.25D);
/*  246 */       renderblocks.q(block, i, j, k);
/*  247 */       renderblocks.a(0.20000000298023224D, 0.6000000238418579D, 0.30000001192092896D, 0.800000011920929D, 1.2999999523162842D, 0.3700000047683716D);
/*  248 */       renderblocks.q(block, i, j, k);
/*      */     } 
/*  250 */     if (l == 1) {
/*  251 */       renderblocks.a(0.33000001311302185D, 0.0D, 0.33000001311302185D, 0.6600000262260437D, 0.4000000059604645D, 0.6600000262260437D);
/*  252 */       renderblocks.q(block, i, j, k);
/*  253 */       renderblocks.a(0.20000000298023224D, 0.4000000059604645D, 0.25D, 0.800000011920929D, 0.6000000238418579D, 0.75D);
/*  254 */       renderblocks.q(block, i, j, k);
/*  255 */       renderblocks.a(0.20000000298023224D, 0.4000000059604645D, 0.75D, 0.800000011920929D, 1.2999999523162842D, 1.0D);
/*  256 */       renderblocks.q(block, i, j, k);
/*  257 */       renderblocks.a(0.20000000298023224D, 0.6000000238418579D, 0.6299999952316284D, 0.800000011920929D, 1.2999999523162842D, 0.699999988079071D);
/*  258 */       renderblocks.q(block, i, j, k);
/*      */     } 
/*  260 */     if (l == 2) {
/*  261 */       renderblocks.a(0.33000001311302185D, 0.0D, 0.33000001311302185D, 0.6600000262260437D, 0.4000000059604645D, 0.6600000262260437D);
/*  262 */       renderblocks.q(block, i, j, k);
/*  263 */       renderblocks.a(0.25D, 0.4000000059604645D, 0.20000000298023224D, 0.8500000238418579D, 0.6000000238418579D, 0.800000011920929D);
/*  264 */       renderblocks.q(block, i, j, k);
/*  265 */       renderblocks.a(0.0D, 0.4000000059604645D, 0.20000000298023224D, 0.25D, 1.2999999523162842D, 0.800000011920929D);
/*  266 */       renderblocks.q(block, i, j, k);
/*  267 */       renderblocks.a(0.30000001192092896D, 0.6000000238418579D, 0.20000000298023224D, 0.3700000047683716D, 1.2999999523162842D, 0.800000011920929D);
/*  268 */       renderblocks.q(block, i, j, k);
/*      */     } 
/*  270 */     if (l == 3) {
/*  271 */       renderblocks.a(0.33000001311302185D, 0.0D, 0.33000001311302185D, 0.6600000262260437D, 0.4000000059604645D, 0.6600000262260437D);
/*  272 */       renderblocks.q(block, i, j, k);
/*  273 */       renderblocks.a(0.15000000596046448D, 0.4000000059604645D, 0.20000000298023224D, 0.75D, 0.6000000238418579D, 0.800000011920929D);
/*  274 */       renderblocks.q(block, i, j, k);
/*  275 */       renderblocks.a(0.75D, 0.4000000059604645D, 0.20000000298023224D, 1.0D, 1.2999999523162842D, 0.800000011920929D);
/*  276 */       renderblocks.q(block, i, j, k);
/*  277 */       renderblocks.a(0.6299999952316284D, 0.6000000238418579D, 0.20000000298023224D, 0.699999988079071D, 1.2999999523162842D, 0.800000011920929D);
/*  278 */       renderblocks.q(block, i, j, k);
/*      */     } 
/*  280 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean renderSCP789J(amq block, int i, int j, int k, bbb renderblocks) {
/*  285 */     int l = renderblocks.a.h(i, j, k);
/*      */     
/*  287 */     if (l == 0) {
/*      */ 
/*      */       
/*  290 */       renderblocks.a(0.33000001311302185D, 0.0D, 0.33000001311302185D, 0.6600000262260437D, 0.4000000059604645D, 0.6600000262260437D);
/*  291 */       renderblocks.q(block, i, j, k);
/*      */ 
/*      */       
/*  294 */       renderblocks.a(0.20000000298023224D, 0.4000000059604645D, 0.25D, 0.800000011920929D, 0.6000000238418579D, 0.8500000238418579D);
/*  295 */       renderblocks.q(block, i, j, k);
/*  296 */       renderblocks.b(block, i, j, k, 39);
/*      */ 
/*      */       
/*  299 */       renderblocks.a(0.20000000298023224D, 0.4000000059604645D, 0.0D, 0.800000011920929D, 1.2999999523162842D, 0.25D);
/*  300 */       renderblocks.q(block, i, j, k);
/*      */ 
/*      */       
/*  303 */       renderblocks.a(0.20000000298023224D, 0.6000000238418579D, 0.30000001192092896D, 0.800000011920929D, 1.2999999523162842D, 0.3700000047683716D);
/*  304 */       renderblocks.q(block, i, j, k);
/*  305 */       renderblocks.d(block, i, j, k, 40);
/*      */     } 
/*      */     
/*  308 */     if (l == 1) {
/*      */       
/*  310 */       renderblocks.a(0.33000001311302185D, 0.0D, 0.33000001311302185D, 0.6600000262260437D, 0.4000000059604645D, 0.6600000262260437D);
/*  311 */       renderblocks.q(block, i, j, k);
/*      */       
/*  313 */       renderblocks.a(0.20000000298023224D, 0.4000000059604645D, 0.25D, 0.800000011920929D, 0.6000000238418579D, 0.75D);
/*  314 */       renderblocks.q(block, i, j, k);
/*  315 */       renderblocks.b(block, i, j, k, 39);
/*      */       
/*  317 */       renderblocks.a(0.20000000298023224D, 0.4000000059604645D, 0.75D, 0.800000011920929D, 1.2999999523162842D, 1.0D);
/*  318 */       renderblocks.q(block, i, j, k);
/*      */       
/*  320 */       renderblocks.a(0.20000000298023224D, 0.6000000238418579D, 0.6299999952316284D, 0.800000011920929D, 1.2999999523162842D, 0.699999988079071D);
/*  321 */       renderblocks.q(block, i, j, k);
/*  322 */       renderblocks.c(block, i, j, k, 40);
/*      */     } 
/*  324 */     if (l == 2) {
/*      */       
/*  326 */       renderblocks.a(0.33000001311302185D, 0.0D, 0.33000001311302185D, 0.6600000262260437D, 0.4000000059604645D, 0.6600000262260437D);
/*  327 */       renderblocks.q(block, i, j, k);
/*      */       
/*  329 */       renderblocks.a(0.25D, 0.4000000059604645D, 0.20000000298023224D, 0.8500000238418579D, 0.6000000238418579D, 0.800000011920929D);
/*  330 */       renderblocks.q(block, i, j, k);
/*  331 */       renderblocks.b(block, i, j, k, 39);
/*      */       
/*  333 */       renderblocks.a(0.0D, 0.4000000059604645D, 0.20000000298023224D, 0.25D, 1.2999999523162842D, 0.800000011920929D);
/*  334 */       renderblocks.q(block, i, j, k);
/*      */       
/*  336 */       renderblocks.a(0.30000001192092896D, 0.6000000238418579D, 0.20000000298023224D, 0.3700000047683716D, 1.2999999523162842D, 0.800000011920929D);
/*  337 */       renderblocks.q(block, i, j, k);
/*  338 */       renderblocks.f(block, i, j, k, 40);
/*      */     } 
/*  340 */     if (l == 3) {
/*      */       
/*  342 */       renderblocks.a(0.33000001311302185D, 0.0D, 0.33000001311302185D, 0.6600000262260437D, 0.4000000059604645D, 0.6600000262260437D);
/*  343 */       renderblocks.q(block, i, j, k);
/*      */       
/*  345 */       renderblocks.a(0.15000000596046448D, 0.4000000059604645D, 0.20000000298023224D, 0.75D, 0.6000000238418579D, 0.800000011920929D);
/*  346 */       renderblocks.q(block, i, j, k);
/*  347 */       renderblocks.b(block, i, j, k, 39);
/*      */       
/*  349 */       renderblocks.a(0.75D, 0.4000000059604645D, 0.20000000298023224D, 1.0D, 1.2999999523162842D, 0.800000011920929D);
/*  350 */       renderblocks.q(block, i, j, k);
/*      */       
/*  352 */       renderblocks.a(0.6299999952316284D, 0.6000000238418579D, 0.20000000298023224D, 0.699999988079071D, 1.2999999523162842D, 0.800000011920929D);
/*  353 */       renderblocks.q(block, i, j, k);
/*  354 */       renderblocks.e(block, i, j, k, 40);
/*      */     } 
/*  356 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean renderSCP015(SCPBlock015 block, int i, int j, int k, bbb renderblocks) {
/*  361 */     boolean flag = block.canThisPaneConnectToThisBlockID(renderblocks.a.a(i, j, k - 1));
/*  362 */     boolean flag1 = block.canThisPaneConnectToThisBlockID(renderblocks.a.a(i - 1, j, k));
/*  363 */     boolean flag2 = block.canThisPaneConnectToThisBlockID(renderblocks.a.a(i + 1, j, k));
/*  364 */     boolean flag3 = block.canThisPaneConnectToThisBlockID(renderblocks.a.a(i, j, k + 1));
/*  365 */     boolean flag4 = block.canThisPaneConnectToThisBlockID(renderblocks.a.a(i, j + 1, k));
/*  366 */     boolean flag5 = block.canThisPaneConnectToThisBlockID(renderblocks.a.a(i, j - 1, k));
/*      */     
/*  368 */     renderblocks.a(0.33000001311302185D, 0.33000001311302185D, 0.33000001311302185D, 0.6600000262260437D, 0.6600000262260437D, 0.6600000262260437D);
/*  369 */     renderblocks.q((amq)block, i, j, k);
/*  370 */     colorFix((amq)block, renderblocks, i, j, k);
/*      */     
/*  372 */     if (flag1) {
/*      */       
/*  374 */       renderblocks.a(0.0D, 0.33000001311302185D, 0.33000001311302185D, 0.33000001311302185D, 0.6600000262260437D, 0.6600000262260437D);
/*  375 */       renderblocks.q((amq)block, i, j, k);
/*  376 */       colorFix((amq)block, renderblocks, i, j, k);
/*      */     } 
/*  378 */     if (flag) {
/*      */       
/*  380 */       renderblocks.a(0.33000001311302185D, 0.33000001311302185D, 0.0D, 0.6600000262260437D, 0.6600000262260437D, 0.33000001311302185D);
/*  381 */       renderblocks.q((amq)block, i, j, k);
/*  382 */       colorFix((amq)block, renderblocks, i, j, k);
/*      */     } 
/*  384 */     if (flag3) {
/*      */       
/*  386 */       renderblocks.a(0.33000001311302185D, 0.33000001311302185D, 0.6600000262260437D, 0.6600000262260437D, 0.6600000262260437D, 1.0D);
/*  387 */       renderblocks.q((amq)block, i, j, k);
/*  388 */       colorFix((amq)block, renderblocks, i, j, k);
/*      */     } 
/*  390 */     if (flag2) {
/*      */       
/*  392 */       renderblocks.a(0.6600000262260437D, 0.33000001311302185D, 0.33000001311302185D, 1.0D, 0.6600000262260437D, 0.6600000262260437D);
/*  393 */       renderblocks.q((amq)block, i, j, k);
/*  394 */       colorFix((amq)block, renderblocks, i, j, k);
/*      */     } 
/*  396 */     if (flag4) {
/*      */       
/*  398 */       renderblocks.a(0.33000001311302185D, 0.6600000262260437D, 0.33000001311302185D, 0.6600000262260437D, 1.0D, 0.6600000262260437D);
/*  399 */       renderblocks.q((amq)block, i, j, k);
/*  400 */       colorFix((amq)block, renderblocks, i, j, k);
/*      */     } 
/*  402 */     if (flag5) {
/*      */       
/*  404 */       renderblocks.a(0.33000001311302185D, 0.0D, 0.33000001311302185D, 0.6600000262260437D, 0.33000001311302185D, 0.6600000262260437D);
/*  405 */       renderblocks.q((amq)block, i, j, k);
/*  406 */       colorFix((amq)block, renderblocks, i, j, k);
/*      */     } 
/*  408 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean renderSlideDoor(SCPBlockSlideDoor block, int i, int j, int k, bbb renderblocks) {
/*  413 */     int l = renderblocks.a.h(i, j, k);
/*  414 */     colorFix((amq)block, renderblocks, i, j, k);
/*      */     
/*  416 */     if (l == 0) {
/*      */       
/*  418 */       renderblocks.a(0.0D, 0.0D, 0.33000001311302185D, 1.0D, 1.0D, 0.6600000262260437D);
/*  419 */       renderblocks.q((amq)block, i, j, k);
/*  420 */       colorFix((amq)block, renderblocks, i, j, k);
/*  421 */       renderblocks.c((amq)block, i, j, k, 65);
/*  422 */       renderblocks.d((amq)block, i, j, k, 65);
/*      */     } 
/*  424 */     if (l == 1) {
/*      */       
/*  426 */       renderblocks.a(0.33000001311302185D, 0.0D, 0.0D, 0.6600000262260437D, 1.0D, 1.0D);
/*  427 */       renderblocks.q((amq)block, i, j, k);
/*  428 */       colorFix((amq)block, renderblocks, i, j, k);
/*  429 */       renderblocks.f((amq)block, i, j, k, 65);
/*  430 */       renderblocks.e((amq)block, i, j, k, 65);
/*      */     } 
/*      */     
/*  433 */     if (l == 2) {
/*      */       
/*  435 */       renderblocks.a(0.0D, 0.0D, 0.33000001311302185D, 1.0D, 1.0D, 0.6600000262260437D);
/*  436 */       renderblocks.q((amq)block, i, j, k);
/*  437 */       colorFix((amq)block, renderblocks, i, j, k);
/*  438 */       renderblocks.c((amq)block, i, j, k, 49);
/*  439 */       renderblocks.d((amq)block, i, j, k, 49);
/*      */     } 
/*  441 */     if (l == 3) {
/*      */       
/*  443 */       renderblocks.a(0.33000001311302185D, 0.0D, 0.0D, 0.6600000262260437D, 1.0D, 1.0D);
/*  444 */       renderblocks.q((amq)block, i, j, k);
/*  445 */       colorFix((amq)block, renderblocks, i, j, k);
/*  446 */       renderblocks.f((amq)block, i, j, k, 49);
/*  447 */       renderblocks.e((amq)block, i, j, k, 49);
/*      */     } 
/*      */     
/*  450 */     if (l == 4) {
/*      */       
/*  452 */       renderblocks.a(1.100000023841858D, 0.0D, 0.33000001311302185D, 1.899999976158142D, 1.0D, 0.6600000262260437D);
/*  453 */       renderblocks.q((amq)block, i, j, k);
/*  454 */       renderblocks.c((amq)block, i, j, k, 65);
/*  455 */       renderblocks.d((amq)block, i, j, k, 65);
/*      */     } 
/*  457 */     if (l == 5) {
/*      */       
/*  459 */       renderblocks.a(0.33000001311302185D, 0.0D, 1.100000023841858D, 0.6600000262260437D, 1.0D, 1.899999976158142D);
/*  460 */       renderblocks.q((amq)block, i, j, k);
/*  461 */       renderblocks.f((amq)block, i, j, k, 65);
/*  462 */       renderblocks.e((amq)block, i, j, k, 65);
/*      */     } 
/*      */     
/*  465 */     if (l == 6) {
/*      */       
/*  467 */       renderblocks.a(1.100000023841858D, 0.0D, 0.33000001311302185D, 1.899999976158142D, 1.0D, 0.6600000262260437D);
/*  468 */       renderblocks.q((amq)block, i, j, k);
/*  469 */       renderblocks.c((amq)block, i, j, k, 49);
/*  470 */       renderblocks.d((amq)block, i, j, k, 49);
/*      */     } 
/*  472 */     if (l == 7) {
/*      */       
/*  474 */       renderblocks.a(0.33000001311302185D, 0.0D, 1.100000023841858D, 0.6600000262260437D, 1.0D, 1.899999976158142D);
/*  475 */       renderblocks.q((amq)block, i, j, k);
/*  476 */       renderblocks.f((amq)block, i, j, k, 49);
/*  477 */       renderblocks.e((amq)block, i, j, k, 49);
/*      */     } 
/*      */ 
/*      */     
/*  481 */     if (l == 8) {
/*      */       
/*  483 */       renderblocks.a(0.0D, 0.0D, 0.33000001311302185D, 1.0D, 1.0D, 0.6600000262260437D);
/*  484 */       renderblocks.q((amq)block, i, j, k);
/*  485 */       colorFix((amq)block, renderblocks, i, j, k);
/*  486 */       renderblocks.c((amq)block, i, j, k, 65);
/*  487 */       renderblocks.d((amq)block, i, j, k, 65);
/*      */     } 
/*  489 */     if (l == 9) {
/*      */       
/*  491 */       renderblocks.a(0.33000001311302185D, 0.0D, 0.0D, 0.6600000262260437D, 1.0D, 1.0D);
/*  492 */       renderblocks.q((amq)block, i, j, k);
/*  493 */       colorFix((amq)block, renderblocks, i, j, k);
/*  494 */       renderblocks.f((amq)block, i, j, k, 65);
/*  495 */       renderblocks.e((amq)block, i, j, k, 65);
/*      */     } 
/*      */     
/*  498 */     if (l == 10) {
/*      */       
/*  500 */       renderblocks.a(0.0D, 0.0D, 0.33000001311302185D, 1.0D, 1.0D, 0.6600000262260437D);
/*  501 */       renderblocks.q((amq)block, i, j, k);
/*  502 */       colorFix((amq)block, renderblocks, i, j, k);
/*  503 */       renderblocks.c((amq)block, i, j, k, 49);
/*  504 */       renderblocks.d((amq)block, i, j, k, 49);
/*      */     } 
/*  506 */     if (l == 11) {
/*      */       
/*  508 */       renderblocks.a(0.33000001311302185D, 0.0D, 0.0D, 0.6600000262260437D, 1.0D, 1.0D);
/*  509 */       renderblocks.q((amq)block, i, j, k);
/*  510 */       colorFix((amq)block, renderblocks, i, j, k);
/*  511 */       renderblocks.f((amq)block, i, j, k, 49);
/*  512 */       renderblocks.e((amq)block, i, j, k, 49);
/*      */     } 
/*      */     
/*  515 */     if (l == 12) {
/*      */       
/*  517 */       renderblocks.a(-0.8999999761581421D, 0.0D, 0.33000001311302185D, -0.10000000149011612D, 1.0D, 0.6600000262260437D);
/*  518 */       renderblocks.q((amq)block, i, j, k);
/*  519 */       renderblocks.c((amq)block, i, j, k, 65);
/*  520 */       renderblocks.d((amq)block, i, j, k, 65);
/*      */     } 
/*  522 */     if (l == 13) {
/*      */       
/*  524 */       renderblocks.a(0.33000001311302185D, 0.0D, -0.8999999761581421D, 0.6600000262260437D, 1.0D, -0.10000000149011612D);
/*  525 */       renderblocks.q((amq)block, i, j, k);
/*  526 */       renderblocks.f((amq)block, i, j, k, 65);
/*  527 */       renderblocks.e((amq)block, i, j, k, 65);
/*      */     } 
/*      */     
/*  530 */     if (l == 14) {
/*      */       
/*  532 */       renderblocks.a(-0.8999999761581421D, 0.0D, 0.33000001311302185D, -0.10000000149011612D, 1.0D, 0.6600000262260437D);
/*  533 */       renderblocks.q((amq)block, i, j, k);
/*  534 */       renderblocks.c((amq)block, i, j, k, 49);
/*  535 */       renderblocks.d((amq)block, i, j, k, 49);
/*      */     } 
/*  537 */     if (l == 15) {
/*      */       
/*  539 */       renderblocks.a(0.33000001311302185D, 0.0D, -0.8999999761581421D, 0.6600000262260437D, 1.0D, -0.10000000149011612D);
/*  540 */       renderblocks.q((amq)block, i, j, k);
/*  541 */       renderblocks.f((amq)block, i, j, k, 49);
/*  542 */       renderblocks.e((amq)block, i, j, k, 49);
/*      */     } 
/*  544 */     return true;
/*      */   }
/*      */   
/*  547 */   public Random rand = new Random();
/*      */   
/*      */   public boolean renderSCP079(amq block, int i, int j, int k, bbb renderblocks) {
/*  550 */     int screen = this.rand.nextInt(2);
/*  551 */     baz var4 = baz.a;
/*      */     
/*  553 */     renderblocks.a(0.0D, 0.0D, 0.12999999523162842D, 1.0D, 1.2000000476837158D, 1.0D);
/*  554 */     renderblocks.q(block, i, j, k);
/*      */ 
/*      */     
/*  557 */     renderblocks.a(0.0D, 0.0D, -0.6499999761581421D, 1.0D, 0.30000001192092896D, 0.07000000029802322D);
/*  558 */     renderblocks.q(block, i, j, k);
/*  559 */     renderblocks.b(block, i, j, k, 55);
/*  560 */     renderblocks.e = false;
/*  561 */     renderblocks.a(block, i, j, k, 56);
/*  562 */     renderblocks.c(block, i, j, k, 56);
/*  563 */     renderblocks.d(block, i, j, k, 56);
/*  564 */     renderblocks.e(block, i, j, k, 56);
/*  565 */     renderblocks.f(block, i, j, k, 56);
/*      */ 
/*      */     
/*  568 */     renderblocks.a(-0.699999988079071D, 0.0D, -0.20000000298023224D, -0.20000000298023224D, 0.20000000298023224D, 0.6000000238418579D);
/*  569 */     renderblocks.q(block, i, j, k);
/*  570 */     renderblocks.c(block, i, j, k, 57);
/*      */ 
/*      */     
/*  573 */     renderblocks.a(1.2000000476837158D, 0.0D, 0.10000000149011612D, 1.7999999523162842D, 0.30000001192092896D, 1.0D);
/*  574 */     renderblocks.q(block, i, j, k);
/*  575 */     renderblocks.c(block, i, j, k, 54);
/*  576 */     renderblocks.b(block, i, j, k, 58);
/*  577 */     renderblocks.a(1.6699999570846558D, 0.10000000149011612D, -0.05000000074505806D, 1.7699999809265137D, 0.25D, 0.10000000149011612D);
/*  578 */     renderblocks.q(block, i, j, k);
/*  579 */     renderblocks.c(block, i, j, k, 59);
/*  580 */     renderblocks.a(1.5199999809265137D, 0.10000000149011612D, -0.05000000074505806D, 1.6200000047683716D, 0.25D, 0.10000000149011612D);
/*  581 */     renderblocks.q(block, i, j, k);
/*  582 */     renderblocks.c(block, i, j, k, 59);
/*  583 */     renderblocks.a(1.3700000047683716D, 0.10000000149011612D, -0.05000000074505806D, 1.4700000286102295D, 0.25D, 0.10000000149011612D);
/*  584 */     renderblocks.q(block, i, j, k);
/*  585 */     renderblocks.c(block, i, j, k, 59);
/*  586 */     renderblocks.a(1.2200000286102295D, 0.10000000149011612D, -0.05000000074505806D, 1.3200000524520874D, 0.25D, 0.10000000149011612D);
/*  587 */     renderblocks.q(block, i, j, k);
/*  588 */     renderblocks.c(block, i, j, k, 59);
/*      */ 
/*      */     
/*  591 */     renderblocks.a(0.46000000834465027D, 0.0D, 0.07000000029802322D, 0.5199999809265137D, 0.15000000596046448D, 0.20000000298023224D);
/*  592 */     renderblocks.q(block, i, j, k);
/*  593 */     renderblocks.c(block, i, j, k, 54);
/*  594 */     renderblocks.a(-0.20000000298023224D, 0.0D, 0.25D, 0.0D, 0.15000000596046448D, 0.4000000059604645D);
/*  595 */     renderblocks.q(block, i, j, k);
/*  596 */     renderblocks.c(block, i, j, k, 53);
/*  597 */     renderblocks.d(block, i, j, k, 53);
/*  598 */     renderblocks.e(block, i, j, k, 53);
/*  599 */     renderblocks.f(block, i, j, k, 53);
/*  600 */     renderblocks.b(block, i, j, k, 53);
/*  601 */     renderblocks.a(block, i, j, k, 53);
/*  602 */     renderblocks.a(1.0D, 0.0D, 0.3499999940395355D, 1.2000000476837158D, 0.05000000074505806D, 0.4000000059604645D);
/*  603 */     renderblocks.q(block, i, j, k);
/*  604 */     renderblocks.c(block, i, j, k, 54);
/*  605 */     renderblocks.a(1.0D, 0.0D, 0.44999998807907104D, 1.2000000476837158D, 0.05000000074505806D, 0.5D);
/*  606 */     renderblocks.q(block, i, j, k);
/*  607 */     renderblocks.c(block, i, j, k, 54);
/*  608 */     renderblocks.a(1.0D, 0.0D, 0.550000011920929D, 1.2000000476837158D, 0.05000000074505806D, 0.6000000238418579D);
/*  609 */     renderblocks.q(block, i, j, k);
/*  610 */     renderblocks.c(block, i, j, k, 54);
/*  611 */     renderblocks.a(1.0D, 0.0D, 0.6499999761581421D, 1.2000000476837158D, 0.05000000074505806D, 0.699999988079071D);
/*  612 */     renderblocks.q(block, i, j, k);
/*  613 */     renderblocks.c(block, i, j, k, 54);
/*  614 */     renderblocks.a(1.0D, 0.10000000149011612D, 0.4000000059604645D, 1.2000000476837158D, 0.15000000596046448D, 0.44999998807907104D);
/*  615 */     renderblocks.q(block, i, j, k);
/*  616 */     renderblocks.c(block, i, j, k, 54);
/*      */     
/*  618 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean renderSCP076(amq block, int i, int j, int k, bbb renderblocks) {
/*  623 */     renderblocks.a(0.0D, 0.0D, 0.0D, 2.0D, 2.0D, 2.0D);
/*  624 */     renderblocks.q(block, i, j, k);
/*  625 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean renderShelf(amq block, int i, int j, int k, bbb renderblocks) {
/*  630 */     renderblocks.a(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D);
/*  631 */     renderblocks.q(block, i, j, k);
/*  632 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean renderPillar(amq block, int i, int j, int k, bbb renderblocks) {
/*  637 */     renderblocks.a(0.0D, 0.0D, 0.0D, 1.0D, 0.20000000298023224D, 1.0D);
/*  638 */     renderblocks.q(block, i, j, k);
/*      */     
/*  640 */     renderblocks.a(0.25D, 0.20000000298023224D, 0.25D, 0.75D, 1.7999999523162842D, 0.75D);
/*  641 */     renderblocks.q(block, i, j, k);
/*      */     
/*  643 */     renderblocks.a(0.0D, 1.7999999523162842D, 0.0D, 1.0D, 2.0D, 1.0D);
/*  644 */     renderblocks.q(block, i, j, k);
/*  645 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean renderStoneCoffin(SCPBlockStoneCoffin block, int i, int j, int k, bbb renderblocks) {
/*  650 */     boolean flag = block.canThisPaneConnectToThisBlockID(renderblocks.a.a(i, j, k - 1));
/*  651 */     boolean flag1 = block.canThisPaneConnectToThisBlockID(renderblocks.a.a(i - 1, j, k));
/*  652 */     boolean flag2 = block.canThisPaneConnectToThisBlockID(renderblocks.a.a(i + 1, j, k));
/*  653 */     boolean flag3 = block.canThisPaneConnectToThisBlockID(renderblocks.a.a(i, j, k + 1));
/*      */     
/*  655 */     renderblocks.a(0.0D, 0.0D, 0.0D, 1.0D, 0.15000000596046448D, 1.0D);
/*  656 */     renderblocks.q((amq)block, i, j, k);
/*      */ 
/*      */     
/*  659 */     if (!flag1) {
/*  660 */       if (!flag && !flag3) {
/*  661 */         renderblocks.a(0.0D, 0.15000000596046448D, 0.15000000596046448D, 0.15000000596046448D, 1.0D, 0.8500000238418579D);
/*  662 */         renderblocks.q((amq)block, i, j, k);
/*      */       }
/*  664 */       else if (flag && !flag3) {
/*  665 */         renderblocks.a(0.0D, 0.15000000596046448D, 0.0D, 0.15000000596046448D, 1.0D, 0.8500000238418579D);
/*  666 */         renderblocks.q((amq)block, i, j, k);
/*      */       }
/*  668 */       else if (flag3 && !flag) {
/*  669 */         renderblocks.a(0.0D, 0.15000000596046448D, 0.15000000596046448D, 0.15000000596046448D, 1.0D, 1.0D);
/*  670 */         renderblocks.q((amq)block, i, j, k);
/*      */       }
/*  672 */       else if (flag && flag3) {
/*      */         
/*  674 */         renderblocks.a(0.0D, 0.15000000596046448D, 0.0D, 0.15000000596046448D, 1.0D, 1.0D);
/*  675 */         renderblocks.q((amq)block, i, j, k);
/*      */       } 
/*      */     }
/*  678 */     if (!flag2) {
/*  679 */       if (!flag && !flag3) {
/*  680 */         renderblocks.a(0.8500000238418579D, 0.15000000596046448D, 0.15000000596046448D, 1.0D, 1.0D, 0.8500000238418579D);
/*  681 */         renderblocks.q((amq)block, i, j, k);
/*      */       }
/*  683 */       else if (flag && !flag3) {
/*  684 */         renderblocks.a(0.8500000238418579D, 0.15000000596046448D, 0.0D, 1.0D, 1.0D, 0.8500000238418579D);
/*  685 */         renderblocks.q((amq)block, i, j, k);
/*      */       }
/*  687 */       else if (flag3 && !flag) {
/*  688 */         renderblocks.a(0.8500000238418579D, 0.15000000596046448D, 0.15000000596046448D, 1.0D, 1.0D, 1.0D);
/*  689 */         renderblocks.q((amq)block, i, j, k);
/*      */       }
/*  691 */       else if (flag && flag3) {
/*      */         
/*  693 */         renderblocks.a(0.8500000238418579D, 0.15000000596046448D, 0.0D, 1.0D, 1.0D, 1.0D);
/*  694 */         renderblocks.q((amq)block, i, j, k);
/*      */       } 
/*      */     }
/*  697 */     if (!flag) {
/*  698 */       renderblocks.a(0.0D, 0.15000000596046448D, 0.0D, 1.0D, 1.0D, 0.15000000596046448D);
/*  699 */       renderblocks.q((amq)block, i, j, k);
/*      */     } 
/*  701 */     if (!flag3) {
/*  702 */       renderblocks.a(0.0D, 0.15000000596046448D, 0.8500000238418579D, 1.0D, 1.0D, 1.0D);
/*  703 */       renderblocks.q((amq)block, i, j, k);
/*      */     } 
/*  705 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean renderPaintings(amq block, int i, int j, int k, bbb renderblocks) {
/*  710 */     int l = renderblocks.a.h(i, j, k);
/*  711 */     baz var5 = baz.a;
/*  712 */     if (l == 0) {
/*      */       
/*  714 */       renderblocks.a(0.0D, 0.0D, 0.0D, 0.20000000298023224D, 1.0D, 1.0D);
/*  715 */       renderblocks.q(block, i, j, k);
/*  716 */       colorFix(block, renderblocks, i, j, k);
/*  717 */       renderblocks.f(block, i, j, k, block.cl + 16);
/*  718 */       renderblocks.c(block, i, j, k, 31);
/*  719 */       renderblocks.d(block, i, j, k, 31);
/*  720 */       renderblocks.e(block, i, j, k, 31);
/*  721 */       renderblocks.b(block, i, j, k, 31);
/*  722 */       renderblocks.a(block, i, j, k, 31);
/*      */       
/*  724 */       renderblocks.a(0.0D, 1.0D, 0.0D, 0.20000000298023224D, 2.0D, 1.0D);
/*  725 */       renderblocks.q(block, i, j, k);
/*  726 */       colorFix(block, renderblocks, i, j, k);
/*  727 */       renderblocks.f(block, i, j, k, block.cl);
/*  728 */       renderblocks.c(block, i, j, k, 31);
/*  729 */       renderblocks.d(block, i, j, k, 31);
/*  730 */       renderblocks.e(block, i, j, k, 15);
/*  731 */       renderblocks.b(block, i, j, k, 31);
/*  732 */       renderblocks.a(block, i, j, k, 31);
/*      */       
/*  734 */       renderblocks.a(0.0D, 0.0D, -1.0D, 0.20000000298023224D, 1.0D, 0.0D);
/*  735 */       renderblocks.q(block, i, j, k);
/*  736 */       colorFix(block, renderblocks, i, j, k);
/*  737 */       renderblocks.f(block, i, j, k, block.cl + 17);
/*  738 */       renderblocks.c(block, i, j, k, 31);
/*  739 */       renderblocks.d(block, i, j, k, 31);
/*  740 */       renderblocks.e(block, i, j, k, 30);
/*  741 */       renderblocks.b(block, i, j, k, 31);
/*  742 */       renderblocks.a(block, i, j, k, 31);
/*      */       
/*  744 */       renderblocks.a(0.0D, 1.0D, -1.0D, 0.20000000298023224D, 2.0D, 0.0D);
/*  745 */       renderblocks.q(block, i, j, k);
/*  746 */       colorFix(block, renderblocks, i, j, k);
/*  747 */       renderblocks.f(block, i, j, k, block.cl + 1);
/*  748 */       renderblocks.c(block, i, j, k, 31);
/*  749 */       renderblocks.d(block, i, j, k, 31);
/*  750 */       renderblocks.e(block, i, j, k, 14);
/*  751 */       renderblocks.b(block, i, j, k, 31);
/*  752 */       renderblocks.a(block, i, j, k, 31);
/*      */     } 
/*  754 */     if (l == 1) {
/*      */       
/*  756 */       renderblocks.a(0.800000011920929D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
/*  757 */       renderblocks.q(block, i, j, k);
/*  758 */       colorFix(block, renderblocks, i, j, k);
/*  759 */       renderblocks.e(block, i, j, k, block.cl + 16);
/*  760 */       renderblocks.c(block, i, j, k, 31);
/*  761 */       renderblocks.d(block, i, j, k, 31);
/*  762 */       renderblocks.f(block, i, j, k, 31);
/*  763 */       renderblocks.b(block, i, j, k, 31);
/*  764 */       renderblocks.a(block, i, j, k, 31);
/*      */       
/*  766 */       renderblocks.a(0.800000011920929D, 1.0D, 0.0D, 1.0D, 2.0D, 1.0D);
/*  767 */       renderblocks.q(block, i, j, k);
/*  768 */       colorFix(block, renderblocks, i, j, k);
/*  769 */       renderblocks.e(block, i, j, k, block.cl);
/*  770 */       renderblocks.c(block, i, j, k, 31);
/*  771 */       renderblocks.d(block, i, j, k, 31);
/*  772 */       renderblocks.f(block, i, j, k, 15);
/*  773 */       renderblocks.b(block, i, j, k, 31);
/*  774 */       renderblocks.a(block, i, j, k, 31);
/*      */       
/*  776 */       renderblocks.a(0.800000011920929D, 0.0D, 1.0D, 1.0D, 1.0D, 2.0D);
/*  777 */       renderblocks.q(block, i, j, k);
/*  778 */       colorFix(block, renderblocks, i, j, k);
/*  779 */       renderblocks.e(block, i, j, k, block.cl + 17);
/*  780 */       renderblocks.c(block, i, j, k, 31);
/*  781 */       renderblocks.d(block, i, j, k, 31);
/*  782 */       renderblocks.f(block, i, j, k, 30);
/*  783 */       renderblocks.b(block, i, j, k, 31);
/*  784 */       renderblocks.a(block, i, j, k, 31);
/*      */       
/*  786 */       renderblocks.a(0.800000011920929D, 1.0D, 1.0D, 1.0D, 2.0D, 2.0D);
/*  787 */       renderblocks.q(block, i, j, k);
/*  788 */       colorFix(block, renderblocks, i, j, k);
/*  789 */       renderblocks.e(block, i, j, k, block.cl + 1);
/*  790 */       renderblocks.c(block, i, j, k, 31);
/*  791 */       renderblocks.d(block, i, j, k, 31);
/*  792 */       renderblocks.f(block, i, j, k, 14);
/*  793 */       renderblocks.b(block, i, j, k, 31);
/*  794 */       renderblocks.a(block, i, j, k, 31);
/*      */     } 
/*  796 */     if (l == 2) {
/*      */       
/*  798 */       renderblocks.a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.20000000298023224D);
/*  799 */       renderblocks.q(block, i, j, k);
/*  800 */       colorFix(block, renderblocks, i, j, k);
/*  801 */       renderblocks.d(block, i, j, k, block.cl + 16);
/*  802 */       renderblocks.f(block, i, j, k, 31);
/*  803 */       renderblocks.c(block, i, j, k, 31);
/*  804 */       renderblocks.e(block, i, j, k, 31);
/*  805 */       renderblocks.b(block, i, j, k, 31);
/*  806 */       renderblocks.a(block, i, j, k, 31);
/*      */       
/*  808 */       renderblocks.a(0.0D, 1.0D, 0.0D, 1.0D, 2.0D, 0.20000000298023224D);
/*  809 */       renderblocks.q(block, i, j, k);
/*  810 */       colorFix(block, renderblocks, i, j, k);
/*  811 */       renderblocks.d(block, i, j, k, block.cl);
/*  812 */       renderblocks.f(block, i, j, k, 31);
/*  813 */       renderblocks.c(block, i, j, k, 15);
/*  814 */       renderblocks.e(block, i, j, k, 31);
/*  815 */       renderblocks.b(block, i, j, k, 31);
/*  816 */       renderblocks.a(block, i, j, k, 31);
/*      */       
/*  818 */       renderblocks.a(1.0D, 0.0D, 0.0D, 2.0D, 1.0D, 0.20000000298023224D);
/*  819 */       renderblocks.q(block, i, j, k);
/*  820 */       colorFix(block, renderblocks, i, j, k);
/*  821 */       renderblocks.d(block, i, j, k, block.cl + 17);
/*  822 */       renderblocks.f(block, i, j, k, 31);
/*  823 */       renderblocks.c(block, i, j, k, 30);
/*  824 */       renderblocks.e(block, i, j, k, 31);
/*  825 */       renderblocks.b(block, i, j, k, 31);
/*  826 */       renderblocks.a(block, i, j, k, 31);
/*      */       
/*  828 */       renderblocks.a(1.0D, 1.0D, 0.0D, 2.0D, 2.0D, 0.20000000298023224D);
/*  829 */       renderblocks.q(block, i, j, k);
/*  830 */       colorFix(block, renderblocks, i, j, k);
/*  831 */       renderblocks.d(block, i, j, k, block.cl + 1);
/*  832 */       renderblocks.f(block, i, j, k, 31);
/*  833 */       renderblocks.c(block, i, j, k, 14);
/*  834 */       renderblocks.e(block, i, j, k, 31);
/*  835 */       renderblocks.b(block, i, j, k, 31);
/*  836 */       renderblocks.a(block, i, j, k, 31);
/*      */     } 
/*  838 */     if (l == 3) {
/*      */       
/*  840 */       renderblocks.a(0.0D, 0.0D, 0.800000011920929D, 1.0D, 1.0D, 1.0D);
/*  841 */       renderblocks.q(block, i, j, k);
/*  842 */       colorFix(block, renderblocks, i, j, k);
/*  843 */       renderblocks.c(block, i, j, k, block.cl + 16);
/*  844 */       renderblocks.f(block, i, j, k, 31);
/*  845 */       renderblocks.d(block, i, j, k, 31);
/*  846 */       renderblocks.e(block, i, j, k, 31);
/*  847 */       renderblocks.b(block, i, j, k, 31);
/*  848 */       renderblocks.a(block, i, j, k, 31);
/*      */       
/*  850 */       renderblocks.a(0.0D, 1.0D, 0.800000011920929D, 1.0D, 2.0D, 1.0D);
/*  851 */       renderblocks.q(block, i, j, k);
/*  852 */       colorFix(block, renderblocks, i, j, k);
/*  853 */       renderblocks.c(block, i, j, k, block.cl);
/*  854 */       renderblocks.f(block, i, j, k, 30);
/*  855 */       renderblocks.d(block, i, j, k, 15);
/*  856 */       renderblocks.e(block, i, j, k, 30);
/*  857 */       renderblocks.b(block, i, j, k, 30);
/*  858 */       renderblocks.a(block, i, j, k, 30);
/*      */       
/*  860 */       renderblocks.a(-1.0D, 0.0D, 0.800000011920929D, 0.0D, 1.0D, 1.0D);
/*  861 */       renderblocks.q(block, i, j, k);
/*  862 */       colorFix(block, renderblocks, i, j, k);
/*  863 */       renderblocks.c(block, i, j, k, block.cl + 17);
/*  864 */       renderblocks.f(block, i, j, k, 31);
/*  865 */       renderblocks.d(block, i, j, k, 30);
/*  866 */       renderblocks.e(block, i, j, k, 31);
/*  867 */       renderblocks.b(block, i, j, k, 31);
/*  868 */       renderblocks.a(block, i, j, k, 31);
/*      */       
/*  870 */       renderblocks.a(-1.0D, 1.0D, 0.800000011920929D, 0.0D, 2.0D, 1.0D);
/*  871 */       renderblocks.q(block, i, j, k);
/*  872 */       colorFix(block, renderblocks, i, j, k);
/*  873 */       renderblocks.c(block, i, j, k, block.cl + 1);
/*  874 */       renderblocks.f(block, i, j, k, 30);
/*  875 */       renderblocks.d(block, i, j, k, 14);
/*  876 */       renderblocks.e(block, i, j, k, 30);
/*  877 */       renderblocks.b(block, i, j, k, 30);
/*  878 */       renderblocks.a(block, i, j, k, 30);
/*      */     } 
/*  880 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean renderSCP822(amq block, int i, int j, int k, bbb renderblocks) {
/*  885 */     baz var8 = baz.a;
/*  886 */     boolean var9 = false;
/*  887 */     float var10 = 0.5F;
/*  888 */     float var11 = 1.0F;
/*  889 */     float var12 = 0.8F;
/*  890 */     float var13 = 0.6F;
/*  891 */     float var14 = var10 * i;
/*  892 */     float var15 = var11 * i;
/*  893 */     float var16 = var12 * i;
/*  894 */     float var17 = var13 * i;
/*  895 */     float var18 = var10 * j;
/*  896 */     float var19 = var11 * j;
/*  897 */     float var20 = var12 * j;
/*  898 */     float var21 = var13 * j;
/*  899 */     float var22 = var10 * k;
/*  900 */     float var23 = var11 * k;
/*  901 */     float var24 = var12 * k;
/*  902 */     float var25 = var13 * k;
/*  903 */     float var26 = 0.0625F;
/*  904 */     int var28 = block.e(renderblocks.a, i, j, k);
/*      */     
/*  906 */     int l = renderblocks.a.h(i, j, k);
/*      */     
/*  908 */     if (block.a(renderblocks.a, i, j - 1, k, 0)) {
/*      */       
/*  910 */       renderblocks.a(block, i, j, k, block.d(renderblocks.a, i, j, k, 0));
/*  911 */       var9 = true;
/*      */     } 
/*      */     
/*  914 */     if (block.a(renderblocks.a, i, j + 1, k, 1)) {
/*      */       
/*  916 */       renderblocks.b(block, i, j, k, block.d(renderblocks.a, i, j, k, 1));
/*  917 */       var9 = true;
/*      */     } 
/*      */     
/*  920 */     if (block.a(renderblocks.a, i, j, k - 1, 2)) {
/*      */       
/*  922 */       var8.c(0.0F, 0.0F, var26);
/*  923 */       renderblocks.c(block, i, j, k, block.d(renderblocks.a, i, j, k, 2));
/*  924 */       var8.c(0.0F, 0.0F, -var26);
/*  925 */       var9 = true;
/*      */     } 
/*      */     
/*  928 */     if (block.a(renderblocks.a, i, j, k + 1, 3)) {
/*      */       
/*  930 */       var8.c(0.0F, 0.0F, -var26);
/*  931 */       renderblocks.d(block, i, j, k, block.d(renderblocks.a, i, j, k, 3));
/*  932 */       var8.c(0.0F, 0.0F, var26);
/*  933 */       var9 = true;
/*      */     } 
/*      */     
/*  936 */     if (block.a(renderblocks.a, i - 1, j, k, 4)) {
/*      */       
/*  938 */       var8.c(var26, 0.0F, 0.0F);
/*  939 */       renderblocks.e(block, i, j, k, block.d(renderblocks.a, i, j, k, 4));
/*  940 */       var8.c(-var26, 0.0F, 0.0F);
/*  941 */       var9 = true;
/*      */     } 
/*      */     
/*  944 */     if (block.a(renderblocks.a, i + 1, j, k, 5)) {
/*      */       
/*  946 */       var8.c(-var26, 0.0F, 0.0F);
/*  947 */       renderblocks.f(block, i, j, k, block.d(renderblocks.a, i, j, k, 5));
/*  948 */       var8.c(var26, 0.0F, 0.0F);
/*  949 */       var9 = true;
/*      */     } 
/*      */     
/*  952 */     renderblocks.a(0.30000001192092896D, 1.0D, 0.30000001192092896D, 0.699999988079071D, 1.2000000476837158D, 0.699999988079071D);
/*  953 */     renderblocks.q(block, i, j, k);
/*  954 */     renderblocks.c(block, i, j, k, 70);
/*  955 */     renderblocks.d(block, i, j, k, 70);
/*  956 */     renderblocks.f(block, i, j, k, 70);
/*  957 */     renderblocks.e(block, i, j, k, 70);
/*  958 */     renderblocks.b(block, i, j, k, 69);
/*  959 */     renderblocks.a(block, i, j, k, 69);
/*  960 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean renderDesk(SCPBlockDesk block, int i, int j, int k, bbb renderblocks) {
/*  965 */     boolean flag = block.canThisPaneConnectToThisBlockID(renderblocks.a.a(i, j, k - 1));
/*  966 */     boolean flag1 = block.canThisPaneConnectToThisBlockID(renderblocks.a.a(i - 1, j, k));
/*  967 */     boolean flag2 = block.canThisPaneConnectToThisBlockID(renderblocks.a.a(i + 1, j, k));
/*  968 */     boolean flag3 = block.canThisPaneConnectToThisBlockID(renderblocks.a.a(i, j, k + 1));
/*      */     
/*  970 */     renderblocks.a(0.0D, 0.800000011920929D, 0.0D, 1.0D, 1.0D, 1.0D);
/*  971 */     renderblocks.q((amq)block, i, j, k);
/*      */     
/*  973 */     if (!flag && !flag1 && !flag2 && !flag3) {
/*      */       
/*  975 */       renderblocks.a(0.0D, 0.0D, 0.0D, 0.10000000149011612D, 0.800000011920929D, 0.10000000149011612D);
/*  976 */       renderblocks.q((amq)block, i, j, k);
/*  977 */       renderblocks.a(0.0D, 0.0D, 0.8999999761581421D, 0.10000000149011612D, 0.800000011920929D, 1.0D);
/*  978 */       renderblocks.q((amq)block, i, j, k);
/*  979 */       renderblocks.a(0.8999999761581421D, 0.0D, 0.0D, 1.0D, 0.800000011920929D, 0.10000000149011612D);
/*  980 */       renderblocks.q((amq)block, i, j, k);
/*  981 */       renderblocks.a(0.8999999761581421D, 0.0D, 0.8999999761581421D, 1.0D, 0.800000011920929D, 1.0D);
/*  982 */       renderblocks.q((amq)block, i, j, k);
/*      */     }
/*  984 */     else if (!flag || !flag1 || !flag2 || !flag3) {
/*      */       
/*  986 */       if (flag)
/*      */       {
/*  988 */         if (!flag3 && !flag1 && !flag2) {
/*      */           
/*  990 */           renderblocks.a(0.0D, 0.0D, 0.8999999761581421D, 0.10000000149011612D, 0.800000011920929D, 1.0D);
/*  991 */           renderblocks.q((amq)block, i, j, k);
/*  992 */           renderblocks.a(0.8999999761581421D, 0.0D, 0.8999999761581421D, 1.0D, 0.800000011920929D, 1.0D);
/*  993 */           renderblocks.q((amq)block, i, j, k);
/*      */         }
/*  995 */         else if (flag1) {
/*      */           
/*  997 */           renderblocks.a(0.8999999761581421D, 0.0D, 0.8999999761581421D, 1.0D, 0.800000011920929D, 1.0D);
/*  998 */           renderblocks.q((amq)block, i, j, k);
/*      */         }
/* 1000 */         else if (flag2) {
/*      */           
/* 1002 */           renderblocks.a(0.0D, 0.0D, 0.8999999761581421D, 0.10000000149011612D, 0.800000011920929D, 1.0D);
/* 1003 */           renderblocks.q((amq)block, i, j, k);
/*      */         } 
/*      */       }
/* 1006 */       if (flag1)
/*      */       {
/* 1008 */         if (!flag2 && !flag3 && !flag) {
/*      */           
/* 1010 */           renderblocks.a(0.8999999761581421D, 0.0D, 0.0D, 1.0D, 0.800000011920929D, 0.10000000149011612D);
/* 1011 */           renderblocks.q((amq)block, i, j, k);
/* 1012 */           renderblocks.a(0.8999999761581421D, 0.0D, 0.8999999761581421D, 1.0D, 0.800000011920929D, 1.0D);
/* 1013 */           renderblocks.q((amq)block, i, j, k);
/*      */         }
/* 1015 */         else if (flag) {
/*      */           
/* 1017 */           renderblocks.a(0.8999999761581421D, 0.0D, 0.8999999761581421D, 1.0D, 0.800000011920929D, 1.0D);
/* 1018 */           renderblocks.q((amq)block, i, j, k);
/*      */         }
/* 1020 */         else if (flag3) {
/*      */           
/* 1022 */           renderblocks.a(0.8999999761581421D, 0.0D, 0.0D, 1.0D, 0.800000011920929D, 0.10000000149011612D);
/* 1023 */           renderblocks.q((amq)block, i, j, k);
/*      */         } 
/*      */       }
/* 1026 */       if (flag2)
/*      */       {
/* 1028 */         if (!flag1 && !flag3 && !flag) {
/*      */           
/* 1030 */           renderblocks.a(0.0D, 0.0D, 0.0D, 0.10000000149011612D, 0.800000011920929D, 0.10000000149011612D);
/* 1031 */           renderblocks.q((amq)block, i, j, k);
/* 1032 */           renderblocks.a(0.0D, 0.0D, 0.8999999761581421D, 0.10000000149011612D, 0.800000011920929D, 1.0D);
/* 1033 */           renderblocks.q((amq)block, i, j, k);
/*      */         }
/* 1035 */         else if (flag) {
/*      */           
/* 1037 */           renderblocks.a(0.0D, 0.0D, 0.8999999761581421D, 0.10000000149011612D, 0.800000011920929D, 1.0D);
/* 1038 */           renderblocks.q((amq)block, i, j, k);
/*      */         }
/* 1040 */         else if (flag3) {
/*      */           
/* 1042 */           renderblocks.a(0.0D, 0.0D, 0.0D, 0.10000000149011612D, 0.800000011920929D, 0.10000000149011612D);
/* 1043 */           renderblocks.q((amq)block, i, j, k);
/*      */         } 
/*      */       }
/* 1046 */       if (flag3)
/*      */       {
/* 1048 */         if (!flag && !flag1 && !flag2) {
/*      */           
/* 1050 */           renderblocks.a(0.0D, 0.0D, 0.0D, 0.10000000149011612D, 0.800000011920929D, 0.10000000149011612D);
/* 1051 */           renderblocks.q((amq)block, i, j, k);
/* 1052 */           renderblocks.a(0.8999999761581421D, 0.0D, 0.0D, 1.0D, 0.800000011920929D, 0.10000000149011612D);
/* 1053 */           renderblocks.q((amq)block, i, j, k);
/*      */         }
/* 1055 */         else if (flag2) {
/*      */           
/* 1057 */           renderblocks.a(0.0D, 0.0D, 0.0D, 0.10000000149011612D, 0.800000011920929D, 0.10000000149011612D);
/* 1058 */           renderblocks.q((amq)block, i, j, k);
/*      */         }
/* 1060 */         else if (flag1) {
/*      */           
/* 1062 */           renderblocks.a(0.8999999761581421D, 0.0D, 0.0D, 1.0D, 0.800000011920929D, 0.10000000149011612D);
/* 1063 */           renderblocks.q((amq)block, i, j, k);
/*      */         } 
/*      */       }
/*      */     } 
/* 1067 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean renderAlarmBlock(amq par1Block, int par2, int par3, int par4, bbb renderblocks) {
/* 1072 */     int i = renderblocks.a.h(par2, par3, par4);
/* 1073 */     int var15 = par1Block.d(renderblocks.a, par2, par3, par4, 4);
/* 1074 */     colorFix(par1Block, renderblocks, par2, par3, par4);
/*      */     
/* 1076 */     if (i == 0) {
/*      */       
/* 1078 */       renderblocks.a(0.0D, 0.0D, 0.0D, 1.0D, 0.3499999940395355D, 1.0D);
/* 1079 */       renderblocks.q(par1Block, par2, par3, par4);
/* 1080 */       colorFix(par1Block, renderblocks, par2, par3, par4);
/*      */     } 
/* 1082 */     if (i == 1) {
/*      */       
/* 1084 */       renderblocks.a(0.0D, 0.6499999761581421D, 0.0D, 1.0D, 1.0D, 1.0D);
/* 1085 */       renderblocks.q(par1Block, par2, par3, par4);
/* 1086 */       colorFix(par1Block, renderblocks, par2, par3, par4);
/*      */     } 
/* 1088 */     if (i == 2) {
/*      */       
/* 1090 */       renderblocks.a(0.0D, 0.0D, 0.0D, 0.3499999940395355D, 1.0D, 1.0D);
/* 1091 */       renderblocks.q(par1Block, par2, par3, par4);
/* 1092 */       colorFix(par1Block, renderblocks, par2, par3, par4);
/*      */     } 
/* 1094 */     if (i == 3) {
/*      */       
/* 1096 */       renderblocks.a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.3499999940395355D);
/* 1097 */       renderblocks.q(par1Block, par2, par3, par4);
/* 1098 */       colorFix(par1Block, renderblocks, par2, par3, par4);
/*      */     } 
/* 1100 */     if (i == 4) {
/*      */       
/* 1102 */       renderblocks.a(0.6499999761581421D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
/* 1103 */       renderblocks.q(par1Block, par2, par3, par4);
/* 1104 */       colorFix(par1Block, renderblocks, par2, par3, par4);
/*      */     } 
/* 1106 */     if (i == 5) {
/*      */       
/* 1108 */       renderblocks.a(0.0D, 0.0D, 0.6499999761581421D, 1.0D, 1.0D, 1.0D);
/* 1109 */       renderblocks.q(par1Block, par2, par3, par4);
/* 1110 */       colorFix(par1Block, renderblocks, par2, par3, par4);
/*      */     } 
/* 1112 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean renderBlockChairInWorld(bbb renderblocks, ym iblockaccess, int i, int j, int k, amq block) {
/* 1117 */     int side = iblockaccess.h(i, j, k) & 0x3;
/* 1118 */     setBlockBoundsWithRotation(renderblocks, block, 0.1F, 0.0F, 0.1F, 0.2F, 0.5F, 0.2F, side);
/* 1119 */     renderblocks.q(block, i, j, k);
/* 1120 */     setBlockBoundsWithRotation(renderblocks, block, 0.1F, 0.0F, 0.8F, 0.2F, 0.5F, 0.9F, side);
/* 1121 */     renderblocks.q(block, i, j, k);
/* 1122 */     setBlockBoundsWithRotation(renderblocks, block, 0.8F, 0.0F, 0.8F, 0.9F, 0.5F, 0.9F, side);
/* 1123 */     renderblocks.q(block, i, j, k);
/* 1124 */     setBlockBoundsWithRotation(renderblocks, block, 0.8F, 0.0F, 0.1F, 0.9F, 0.5F, 0.2F, side);
/* 1125 */     renderblocks.q(block, i, j, k);
/* 1126 */     setBlockBoundsWithRotation(renderblocks, block, 0.1F, 0.5F, 0.1F, 0.9F, 0.6F, 0.9F, side);
/* 1127 */     renderblocks.q(block, i, j, k);
/* 1128 */     setBlockBoundsWithRotation(renderblocks, block, 0.1F, 0.6F, 0.1F, 0.2F, 1.5F, 0.9F, side);
/* 1129 */     renderblocks.q(block, i, j, k);
/* 1130 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public static void setBlockBoundsWithRotation(bbb renderblocks, amq block, float minx, float miny, float minz, float maxx, float maxy, float maxz, int rotationType) {
/* 1135 */     if (rotationType == 1) {
/*      */       
/* 1137 */       float tempminx = minx;
/* 1138 */       float tempmaxx = maxx;
/* 1139 */       minx = minz;
/* 1140 */       minz = -tempminx + 1.0F;
/* 1141 */       maxx = maxz;
/* 1142 */       maxz = -tempmaxx + 1.0F;
/*      */       
/* 1144 */       float tempminz = minz;
/* 1145 */       minz = maxz;
/* 1146 */       maxz = tempminz;
/*      */     }
/* 1148 */     else if (rotationType == 2) {
/*      */       
/* 1150 */       minx = -minx + 1.0F;
/* 1151 */       minz = -minz + 1.0F;
/* 1152 */       maxx = -maxx + 1.0F;
/* 1153 */       maxz = -maxz + 1.0F;
/*      */     }
/* 1155 */     else if (rotationType == 3) {
/*      */       
/* 1157 */       float tempminx = minx;
/* 1158 */       float tempmaxx = maxx;
/* 1159 */       minx = -minz + 1.0F;
/* 1160 */       minz = tempminx;
/* 1161 */       maxx = -maxz + 1.0F;
/* 1162 */       maxz = tempmaxx;
/*      */       
/* 1164 */       tempminx = minx;
/* 1165 */       minx = maxx;
/* 1166 */       maxx = tempminx;
/*      */     } 
/* 1168 */     renderblocks.a(minx, miny, minz, maxx, maxy, maxz);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void setBlockBoundsWithRotation(amq block, float minx, float miny, float minz, float maxx, float maxy, float maxz, int rotationType) {
/* 1173 */     if (rotationType == 1) {
/*      */       
/* 1175 */       float tempminx = minx;
/* 1176 */       float tempmaxx = maxx;
/* 1177 */       minx = minz;
/* 1178 */       minz = -tempminx + 1.0F;
/* 1179 */       maxx = maxz;
/* 1180 */       maxz = -tempmaxx + 1.0F;
/*      */       
/* 1182 */       float tempminz = minz;
/* 1183 */       minz = maxz;
/* 1184 */       maxz = tempminz;
/*      */     }
/* 1186 */     else if (rotationType == 2) {
/*      */       
/* 1188 */       minx = -minx + 1.0F;
/* 1189 */       minz = -minz + 1.0F;
/* 1190 */       maxx = -maxx + 1.0F;
/* 1191 */       maxz = -maxz + 1.0F;
/*      */     }
/* 1193 */     else if (rotationType == 3) {
/*      */       
/* 1195 */       float tempminx = minx;
/* 1196 */       float tempmaxx = maxx;
/* 1197 */       minx = -minz + 1.0F;
/* 1198 */       minz = tempminx;
/* 1199 */       maxx = -maxz + 1.0F;
/* 1200 */       maxz = tempmaxx;
/*      */       
/* 1202 */       tempminx = minx;
/* 1203 */       minx = maxx;
/* 1204 */       maxx = tempminx;
/*      */     } 
/* 1206 */     block.a(minx, miny, minz, maxx, maxy, maxz);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean renderSCP513(amq par1Block, int i, int j, int k, bbb renderblocks) {
/* 1211 */     renderblocks.a(0.25D, 0.0D, 0.6499999761581421D, 0.75D, 0.5D, 0.6600000262260437D);
/* 1212 */     renderblocks.q(par1Block, i, j, k);
/*      */     
/* 1214 */     renderblocks.a(0.25D, 0.0D, 0.3499999940395355D, 0.75D, 0.5D, 0.36000001430511475D);
/* 1215 */     renderblocks.q(par1Block, i, j, k);
/*      */     
/* 1217 */     renderblocks.a(0.25D, 0.0D, 0.3499999940395355D, 0.25999999046325684D, 0.5D, 0.6499999761581421D);
/* 1218 */     renderblocks.q(par1Block, i, j, k);
/*      */     
/* 1220 */     renderblocks.a(0.7400000095367432D, 0.0D, 0.3499999940395355D, 0.75D, 0.5D, 0.6499999761581421D);
/* 1221 */     renderblocks.q(par1Block, i, j, k);
/*      */     
/* 1223 */     renderblocks.a(0.25D, 0.5D, 0.3499999940395355D, 0.75D, 0.5099999904632568D, 0.6600000262260437D);
/* 1224 */     renderblocks.q(par1Block, i, j, k);
/*      */ 
/*      */     
/* 1227 */     renderblocks.a(0.41999998688697815D, 0.5099999904632568D, 0.49000000953674316D, 0.5799999833106995D, 0.6000000238418579D, 0.5199999809265137D);
/* 1228 */     renderblocks.q(par1Block, i, j, k);
/*      */ 
/*      */     
/* 1231 */     renderblocks.a(0.49000000953674316D, 0.20000000298023224D, 0.49000000953674316D, 0.5199999809265137D, 0.5D, 0.5199999809265137D);
/* 1232 */     renderblocks.q(par1Block, i, j, k);
/*      */     
/* 1234 */     renderblocks.a(0.4699999988079071D, 0.10000000149011612D, 0.4699999988079071D, 0.5400000214576721D, 0.20000000298023224D, 0.5400000214576721D);
/* 1235 */     renderblocks.q(par1Block, i, j, k);
/* 1236 */     return true;
/*      */   }
/*      */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/renders/SCPBlockRenders.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */