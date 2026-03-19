/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.entities.SCPEntityClassDGuy;
/*     */ import SCPCraft.mod_SCP;
/*     */ import amq;
/*     */ import java.util.List;
/*     */ import lq;
/*     */ import qx;
/*     */ import r;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ public class SCPItem914
/*     */   extends SCPItemDocument
/*     */ {
/*     */   public SCPItem914(int i) {
/*  18 */     super(i);
/*  19 */     this.ck = 1;
/*  20 */     e(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  25 */     list.add("§2SCP-914");
/*  26 */     list.add("§7The Clockworks");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean n_() {
/*  31 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/*  36 */     if (par3World.I)
/*     */     {
/*  38 */       return true;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  43 */     int var11 = par3World.a(par4, par5, par6);
/*  44 */     par4 += r.b[par7];
/*  45 */     par5 += r.c[par7];
/*  46 */     par6 += r.d[par7];
/*  47 */     double var12 = 0.0D;
/*     */     
/*  49 */     if ((par7 == 1 && var11 == amq.bc.cm) || var11 == amq.bE.cm)
/*     */     {
/*  51 */       var12 = 0.5D;
/*     */     }
/*     */     
/*  54 */     if (spawnCreature(par3World, par1ItemStack.j(), par4 + 0.5D, par5 + var12, par6 + 0.5D) && !par2EntityPlayer.cd.d)
/*     */     {
/*  56 */       par1ItemStack.a--;
/*     */     }
/*     */     
/*  59 */     int i = par3World.a(par4, par5, par6);
/*     */     
/*  61 */     if (i == 0) {
/*     */ 
/*     */       
/*  64 */       par3World.a(par4 + 0.5D, par5 + 0.5D, par6 + 0.5D, "fire.ignite", 1.0F, d.nextFloat() * 0.4F + 0.8F);
/*  65 */       for (int width = -5; width <= 5; width++) {
/*  66 */         for (int length = 0; length <= 7; length++)
/*  67 */         { for (int height = 0; height <= 5; height++)
/*  68 */             par3World.e(par4 + width, par5 + height, par6 + length, 0);  } 
/*  69 */       }  par3World.e(par4 - 4, par5, par6 + 1, amq.al.cm);
/*  70 */       par3World.e(par4 - 4, par5, par6 + 2, amq.at.cm);
/*  71 */       par3World.e(par4 - 4, par5 + 1, par6 + 1, amq.al.cm);
/*  72 */       par3World.e(par4 - 4, par5 - 1, par6 + 2, amq.al.cm);
/*  73 */       par3World.e(par4 - 4, par5 - 1, par6 + 3, amq.al.cm);
/*  74 */       par3World.e(par4 - 4, par5 - 1, par6 + 4, amq.al.cm);
/*  75 */       par3World.e(par4 - 4, par5 + 2, par6 + 2, amq.al.cm);
/*  76 */       par3World.e(par4 - 4, par5 + 2, par6 + 3, amq.al.cm);
/*  77 */       par3World.e(par4 - 4, par5 + 2, par6 + 4, amq.al.cm);
/*  78 */       par3World.e(par4 - 4, par5 + 1, par6 + 5, amq.al.cm);
/*  79 */       par3World.e(par4 - 4, par5, par6 + 5, amq.al.cm);
/*  80 */       par3World.e(par4 - 5, par5, par6 + 2, amq.al.cm);
/*  81 */       par3World.e(par4 - 5, par5 + 1, par6 + 2, amq.al.cm);
/*  82 */       par3World.e(par4 - 5, par5, par6 + 3, amq.al.cm);
/*  83 */       par3World.e(par4 - 5, par5 + 1, par6 + 3, amq.al.cm);
/*  84 */       par3World.e(par4 - 5, par5, par6 + 4, amq.al.cm);
/*  85 */       par3World.e(par4 - 5, par5 + 1, par6 + 4, amq.al.cm);
/*  86 */       par3World.e(par4 + 4, par5, par6 + 1, amq.al.cm);
/*  87 */       par3World.e(par4 + 4, par5, par6 + 2, amq.at.cm);
/*  88 */       par3World.e(par4 + 4, par5 + 1, par6 + 1, amq.al.cm);
/*  89 */       par3World.e(par4 + 4, par5 - 1, par6 + 2, amq.al.cm);
/*  90 */       par3World.e(par4 + 4, par5 - 1, par6 + 3, amq.al.cm);
/*  91 */       par3World.e(par4 + 4, par5 - 1, par6 + 4, amq.al.cm);
/*  92 */       par3World.e(par4 + 4, par5 + 2, par6 + 2, amq.al.cm);
/*  93 */       par3World.e(par4 + 4, par5 + 2, par6 + 3, amq.al.cm);
/*  94 */       par3World.e(par4 + 4, par5 + 2, par6 + 4, amq.al.cm);
/*  95 */       par3World.e(par4 + 4, par5 + 1, par6 + 5, amq.al.cm);
/*  96 */       par3World.e(par4 + 4, par5, par6 + 5, amq.al.cm);
/*  97 */       par3World.e(par4 + 5, par5, par6 + 2, amq.al.cm);
/*  98 */       par3World.e(par4 + 5, par5 + 1, par6 + 2, amq.al.cm);
/*  99 */       par3World.e(par4 + 5, par5, par6 + 3, amq.al.cm);
/* 100 */       par3World.e(par4 + 5, par5 + 1, par6 + 3, amq.al.cm);
/* 101 */       par3World.e(par4 + 5, par5, par6 + 4, amq.al.cm);
/* 102 */       par3World.e(par4 + 5, par5 + 1, par6 + 4, amq.al.cm);
/* 103 */       par3World.e(par4 + 2, par5, par6, amq.w.cm);
/* 104 */       par3World.e(par4 + 3, par5, par6, amq.w.cm);
/* 105 */       par3World.e(par4 - 3, par5, par6, amq.w.cm);
/* 106 */       par3World.e(par4 - 3, par5, par6 + 1, amq.w.cm);
/* 107 */       par3World.e(par4 - 3, par5, par6 + 2, amq.w.cm);
/* 108 */       par3World.e(par4 - 3, par5, par6 + 3, amq.w.cm);
/* 109 */       par3World.e(par4 - 3, par5, par6 + 4, amq.w.cm);
/* 110 */       par3World.e(par4 - 3, par5, par6 + 5, amq.w.cm);
/* 111 */       par3World.e(par4 - 3, par5, par6 + 6, amq.w.cm);
/* 112 */       par3World.e(par4 - 3, par5, par6 + 7, amq.w.cm);
/* 113 */       par3World.e(par4 + 3, par5, par6 + 7, amq.w.cm);
/* 114 */       par3World.e(par4 + 3, par5, par6 + 1, amq.w.cm);
/* 115 */       par3World.e(par4 + 3, par5, par6 + 2, amq.w.cm);
/* 116 */       par3World.e(par4 + 3, par5, par6 + 3, amq.w.cm);
/* 117 */       par3World.e(par4 + 3, par5, par6 + 4, amq.w.cm);
/* 118 */       par3World.e(par4 + 3, par5, par6 + 5, amq.w.cm);
/* 119 */       par3World.e(par4 + 3, par5, par6 + 6, amq.w.cm);
/*     */ 
/*     */       
/* 122 */       par3World.e(par4, par5 - 1, par6, amq.w.cm);
/* 123 */       par3World.e(par4 - 1, par5 - 1, par6, amq.w.cm);
/* 124 */       par3World.e(par4 + 1, par5 - 1, par6, amq.w.cm);
/* 125 */       par3World.e(par4 + 2, par5 - 1, par6, amq.w.cm);
/* 126 */       par3World.e(par4 + 3, par5 - 1, par6, amq.w.cm);
/* 127 */       par3World.e(par4 + 3, par5 - 1, par6 + 1, amq.w.cm);
/* 128 */       par3World.e(par4 + 3, par5 - 1, par6 + 2, amq.w.cm);
/* 129 */       par3World.e(par4 + 3, par5 - 1, par6 + 3, amq.w.cm);
/* 130 */       par3World.e(par4 + 3, par5 - 1, par6 + 4, amq.w.cm);
/* 131 */       par3World.e(par4 + 3, par5 - 1, par6 + 5, amq.w.cm);
/* 132 */       par3World.e(par4 + 3, par5 - 1, par6 + 6, amq.w.cm);
/* 133 */       par3World.e(par4 + 3, par5 - 1, par6 + 7, amq.w.cm);
/* 134 */       par3World.e(par4 - 3, par5 - 1, par6, amq.w.cm);
/* 135 */       par3World.e(par4 - 2, par5 - 1, par6, amq.w.cm);
/* 136 */       par3World.e(par4 - 3, par5 - 1, par6 + 1, amq.w.cm);
/* 137 */       par3World.e(par4 - 3, par5 - 1, par6 + 2, amq.w.cm);
/* 138 */       par3World.e(par4 - 3, par5 - 1, par6 + 3, amq.w.cm);
/* 139 */       par3World.e(par4 - 3, par5 - 1, par6 + 4, amq.w.cm);
/* 140 */       par3World.e(par4 - 3, par5 - 1, par6 + 5, amq.w.cm);
/* 141 */       par3World.e(par4 - 3, par5 - 1, par6 + 6, amq.w.cm);
/* 142 */       par3World.e(par4 - 3, par5 - 1, par6 + 7, amq.w.cm);
/* 143 */       par3World.e(par4, par5 - 1, par6 + 7, amq.w.cm);
/* 144 */       par3World.e(par4 - 1, par5 - 1, par6 + 7, amq.w.cm);
/* 145 */       par3World.e(par4 - 2, par5 - 1, par6 + 7, amq.w.cm);
/* 146 */       par3World.e(par4 + 1, par5 - 1, par6 + 7, amq.w.cm);
/* 147 */       par3World.e(par4 + 2, par5 - 1, par6 + 7, amq.w.cm);
/* 148 */       par3World.e(par4 + 3, par5 - 1, par6 + 7, amq.w.cm);
/* 149 */       par3World.e(par4, par5 - 1, par6 + 1, amq.bp.cm);
/* 150 */       par3World.e(par4 + 1, par5 - 1, par6 + 1, amq.bp.cm);
/* 151 */       par3World.e(par4 + 2, par5 - 1, par6 + 1, amq.bp.cm);
/* 152 */       par3World.e(par4 - 1, par5 - 1, par6 + 1, amq.bp.cm);
/* 153 */       par3World.e(par4 - 2, par5 - 1, par6 + 1, amq.bp.cm);
/* 154 */       par3World.e(par4, par5 - 1, par6 + 2, amq.bp.cm);
/* 155 */       par3World.e(par4 + 1, par5 - 1, par6 + 2, amq.bp.cm);
/* 156 */       par3World.e(par4 + 2, par5 - 1, par6 + 2, amq.bp.cm);
/* 157 */       par3World.e(par4 - 1, par5 - 1, par6 + 2, amq.bp.cm);
/* 158 */       par3World.e(par4 - 2, par5 - 1, par6 + 2, amq.bp.cm);
/* 159 */       par3World.e(par4, par5 - 1, par6 + 3, amq.bp.cm);
/* 160 */       par3World.e(par4 + 1, par5 - 1, par6 + 3, amq.bp.cm);
/* 161 */       par3World.e(par4 + 2, par5 - 1, par6 + 3, amq.bp.cm);
/* 162 */       par3World.e(par4 - 1, par5 - 1, par6 + 3, amq.bp.cm);
/* 163 */       par3World.e(par4 - 2, par5 - 1, par6 + 3, amq.bp.cm);
/* 164 */       par3World.e(par4, par5 - 1, par6 + 4, amq.bp.cm);
/* 165 */       par3World.e(par4 + 1, par5 - 1, par6 + 4, amq.bp.cm);
/* 166 */       par3World.e(par4 + 2, par5 - 1, par6 + 4, amq.bp.cm);
/* 167 */       par3World.e(par4 - 1, par5 - 1, par6 + 4, amq.bp.cm);
/* 168 */       par3World.e(par4 - 2, par5 - 1, par6 + 4, amq.bp.cm);
/* 169 */       par3World.e(par4, par5 - 1, par6 + 5, amq.bp.cm);
/* 170 */       par3World.e(par4 + 1, par5 - 1, par6 + 5, amq.bp.cm);
/* 171 */       par3World.e(par4 + 2, par5 - 1, par6 + 5, amq.bp.cm);
/* 172 */       par3World.e(par4 - 1, par5 - 1, par6 + 5, amq.bp.cm);
/* 173 */       par3World.e(par4 - 2, par5 - 1, par6 + 5, amq.bp.cm);
/* 174 */       par3World.e(par4, par5 - 1, par6 + 6, amq.bp.cm);
/* 175 */       par3World.e(par4 + 1, par5 - 1, par6 + 6, amq.bp.cm);
/* 176 */       par3World.e(par4 + 2, par5 - 1, par6 + 6, amq.bp.cm);
/* 177 */       par3World.e(par4 - 1, par5 - 1, par6 + 6, amq.bp.cm);
/* 178 */       par3World.e(par4 - 2, par5 - 1, par6 + 6, amq.bp.cm);
/* 179 */       par3World.e(par4, par5, par6 + 7, amq.w.cm);
/* 180 */       par3World.e(par4 - 1, par5, par6 + 7, amq.w.cm);
/* 181 */       par3World.e(par4 + 1, par5, par6 + 7, amq.w.cm);
/* 182 */       par3World.e(par4 + 2, par5, par6 + 7, amq.w.cm);
/* 183 */       par3World.e(par4 + 3, par5, par6 + 7, amq.w.cm);
/* 184 */       par3World.e(par4 - 2, par5, par6 + 7, amq.w.cm);
/*     */ 
/*     */       
/* 187 */       par3World.e(par4, par5 + 1, par6 + 7, amq.w.cm);
/* 188 */       par3World.e(par4 - 1, par5 + 1, par6 + 7, amq.w.cm);
/* 189 */       par3World.e(par4 + 1, par5 + 1, par6 + 7, amq.w.cm);
/* 190 */       par3World.e(par4 + 2, par5 + 1, par6 + 7, amq.w.cm);
/* 191 */       par3World.e(par4 + 3, par5 + 1, par6 + 7, amq.w.cm);
/* 192 */       par3World.e(par4 - 2, par5 + 1, par6 + 7, amq.w.cm);
/* 193 */       par3World.e(par4 + 2, par5 + 1, par6, amq.w.cm);
/* 194 */       par3World.e(par4 + 3, par5 + 1, par6, amq.w.cm);
/* 195 */       par3World.e(par4 - 3, par5 + 1, par6, amq.w.cm);
/* 196 */       par3World.e(par4 - 3, par5 + 1, par6 + 1, amq.w.cm);
/* 197 */       par3World.e(par4 - 3, par5 + 1, par6 + 2, amq.bt.cm);
/* 198 */       par3World.e(par4 - 3, par5 + 1, par6 + 3, amq.bt.cm);
/* 199 */       par3World.e(par4 - 3, par5 + 1, par6 + 4, amq.bt.cm);
/* 200 */       par3World.e(par4 - 3, par5 + 1, par6 + 5, amq.w.cm);
/* 201 */       par3World.e(par4 - 3, par5 + 1, par6 + 6, amq.w.cm);
/* 202 */       par3World.e(par4 - 3, par5 + 1, par6 + 7, amq.w.cm);
/* 203 */       par3World.e(par4 + 3, par5 + 1, par6 + 7, amq.w.cm);
/* 204 */       par3World.e(par4 + 3, par5 + 1, par6 + 1, amq.w.cm);
/* 205 */       par3World.e(par4 + 3, par5 + 1, par6 + 2, amq.bt.cm);
/* 206 */       par3World.e(par4 + 3, par5 + 1, par6 + 3, amq.bt.cm);
/* 207 */       par3World.e(par4 + 3, par5 + 1, par6 + 4, amq.bt.cm);
/* 208 */       par3World.e(par4 + 3, par5 + 1, par6 + 5, amq.w.cm);
/* 209 */       par3World.e(par4 + 3, par5 + 1, par6 + 6, amq.w.cm);
/*     */ 
/*     */       
/* 212 */       par3World.e(par4, par5 + 2, par6 + 7, amq.w.cm);
/* 213 */       par3World.e(par4 - 1, par5 + 2, par6 + 7, amq.w.cm);
/* 214 */       par3World.e(par4 + 1, par5 + 2, par6 + 7, amq.w.cm);
/* 215 */       par3World.e(par4 + 2, par5 + 2, par6 + 7, amq.w.cm);
/* 216 */       par3World.e(par4 + 3, par5 + 2, par6 + 7, amq.w.cm);
/* 217 */       par3World.e(par4 - 2, par5 + 2, par6 + 7, amq.w.cm);
/* 218 */       par3World.e(par4 + 2, par5 + 2, par6, amq.w.cm);
/* 219 */       par3World.e(par4 + 3, par5 + 2, par6, amq.w.cm);
/* 220 */       par3World.e(par4 - 3, par5 + 2, par6, amq.w.cm);
/* 221 */       par3World.e(par4 - 3, par5 + 2, par6 + 1, amq.w.cm);
/* 222 */       par3World.e(par4 - 3, par5 + 2, par6 + 2, amq.w.cm);
/* 223 */       par3World.e(par4 - 3, par5 + 2, par6 + 3, amq.w.cm);
/* 224 */       par3World.e(par4 - 3, par5 + 2, par6 + 4, amq.w.cm);
/* 225 */       par3World.e(par4 - 3, par5 + 2, par6 + 5, amq.w.cm);
/* 226 */       par3World.e(par4 - 3, par5 + 2, par6 + 6, amq.w.cm);
/* 227 */       par3World.e(par4 - 3, par5 + 2, par6 + 7, amq.w.cm);
/* 228 */       par3World.e(par4 + 3, par5 + 2, par6 + 7, amq.w.cm);
/* 229 */       par3World.e(par4 + 3, par5 + 2, par6 + 1, amq.w.cm);
/* 230 */       par3World.e(par4 + 3, par5 + 2, par6 + 2, amq.w.cm);
/* 231 */       par3World.e(par4 + 3, par5 + 2, par6 + 3, amq.w.cm);
/* 232 */       par3World.e(par4 + 3, par5 + 2, par6 + 4, amq.w.cm);
/* 233 */       par3World.e(par4 + 3, par5 + 2, par6 + 5, amq.w.cm);
/* 234 */       par3World.e(par4 + 3, par5 + 2, par6 + 6, amq.w.cm);
/* 235 */       par3World.e(par4 - 2, par5 + 2, par6, amq.w.cm);
/*     */ 
/*     */       
/* 238 */       par3World.e(par4, par5 + 3, par6 + 7, amq.w.cm);
/* 239 */       par3World.e(par4 - 1, par5 + 3, par6 + 7, amq.w.cm);
/* 240 */       par3World.e(par4 + 1, par5 + 3, par6 + 7, amq.w.cm);
/* 241 */       par3World.e(par4 + 2, par5 + 3, par6 + 7, amq.w.cm);
/* 242 */       par3World.e(par4 + 3, par5 + 3, par6 + 7, amq.w.cm);
/* 243 */       par3World.e(par4 - 2, par5 + 3, par6 + 7, amq.w.cm);
/* 244 */       par3World.e(par4, par5 + 3, par6, amq.w.cm);
/* 245 */       par3World.e(par4 - 1, par5 + 3, par6, amq.w.cm);
/* 246 */       par3World.e(par4 + 1, par5 + 3, par6, amq.w.cm);
/* 247 */       par3World.e(par4 + 2, par5 + 3, par6, amq.w.cm);
/* 248 */       par3World.e(par4 + 3, par5 + 3, par6, amq.w.cm);
/* 249 */       par3World.e(par4 - 3, par5 + 3, par6, amq.w.cm);
/* 250 */       par3World.e(par4 - 3, par5 + 3, par6 + 1, amq.w.cm);
/* 251 */       par3World.e(par4 - 3, par5 + 3, par6 + 2, amq.w.cm);
/* 252 */       par3World.e(par4 - 3, par5 + 3, par6 + 3, amq.w.cm);
/* 253 */       par3World.e(par4 - 3, par5 + 3, par6 + 4, amq.w.cm);
/* 254 */       par3World.e(par4 - 3, par5 + 3, par6 + 5, amq.w.cm);
/* 255 */       par3World.e(par4 - 3, par5 + 3, par6 + 6, amq.w.cm);
/* 256 */       par3World.e(par4 - 3, par5 + 3, par6 + 7, amq.w.cm);
/* 257 */       par3World.e(par4 + 3, par5 + 3, par6 + 7, amq.w.cm);
/* 258 */       par3World.e(par4 + 3, par5 + 3, par6 + 1, amq.w.cm);
/* 259 */       par3World.e(par4 + 3, par5 + 3, par6 + 2, amq.w.cm);
/* 260 */       par3World.e(par4 + 3, par5 + 3, par6 + 3, amq.w.cm);
/* 261 */       par3World.e(par4 + 3, par5 + 3, par6 + 4, amq.w.cm);
/* 262 */       par3World.e(par4 + 3, par5 + 3, par6 + 5, amq.w.cm);
/* 263 */       par3World.e(par4 + 3, par5 + 3, par6 + 6, amq.w.cm);
/* 264 */       par3World.e(par4 - 2, par5 + 3, par6, amq.w.cm);
/*     */ 
/*     */       
/* 267 */       par3World.e(par4, par5 + 4, par6, amq.al.cm);
/* 268 */       par3World.e(par4 - 1, par5 + 4, par6, amq.al.cm);
/* 269 */       par3World.e(par4 + 1, par5 + 4, par6, amq.al.cm);
/* 270 */       par3World.e(par4 + 2, par5 + 4, par6, amq.al.cm);
/* 271 */       par3World.e(par4 + 3, par5 + 4, par6, amq.al.cm);
/* 272 */       par3World.e(par4 + 3, par5 + 4, par6 + 1, amq.al.cm);
/* 273 */       par3World.e(par4 + 3, par5 + 4, par6 + 2, amq.al.cm);
/* 274 */       par3World.e(par4 + 3, par5 + 4, par6 + 3, amq.al.cm);
/* 275 */       par3World.e(par4 + 3, par5 + 4, par6 + 4, amq.al.cm);
/* 276 */       par3World.e(par4 + 3, par5 + 4, par6 + 5, amq.al.cm);
/* 277 */       par3World.e(par4 + 3, par5 + 4, par6 + 6, amq.al.cm);
/* 278 */       par3World.e(par4 + 3, par5 + 4, par6 + 7, amq.al.cm);
/* 279 */       par3World.e(par4 - 3, par5 + 4, par6, amq.al.cm);
/* 280 */       par3World.e(par4 - 2, par5 + 4, par6, amq.al.cm);
/* 281 */       par3World.e(par4 - 3, par5 + 4, par6 + 1, amq.al.cm);
/* 282 */       par3World.e(par4 - 3, par5 + 4, par6 + 2, amq.al.cm);
/* 283 */       par3World.e(par4 - 3, par5 + 4, par6 + 3, amq.al.cm);
/* 284 */       par3World.e(par4 - 3, par5 + 4, par6 + 4, amq.al.cm);
/* 285 */       par3World.e(par4 - 3, par5 + 4, par6 + 5, amq.al.cm);
/* 286 */       par3World.e(par4 - 3, par5 + 4, par6 + 6, amq.al.cm);
/* 287 */       par3World.e(par4 - 3, par5 + 4, par6 + 7, amq.al.cm);
/* 288 */       par3World.e(par4, par5 + 4, par6 + 7, amq.al.cm);
/* 289 */       par3World.e(par4 - 1, par5 + 4, par6 + 7, amq.al.cm);
/* 290 */       par3World.e(par4 - 2, par5 + 4, par6 + 7, amq.al.cm);
/* 291 */       par3World.e(par4 + 1, par5 + 4, par6 + 7, amq.al.cm);
/* 292 */       par3World.e(par4 + 2, par5 + 4, par6 + 7, amq.al.cm);
/* 293 */       par3World.e(par4 + 3, par5 + 4, par6 + 7, amq.al.cm);
/* 294 */       par3World.e(par4, par5 + 4, par6 + 1, amq.al.cm);
/* 295 */       par3World.e(par4 + 1, par5 + 4, par6 + 1, amq.al.cm);
/* 296 */       par3World.e(par4 + 2, par5 + 4, par6 + 1, amq.al.cm);
/* 297 */       par3World.e(par4 - 1, par5 + 4, par6 + 1, amq.al.cm);
/* 298 */       par3World.e(par4 - 2, par5 + 4, par6 + 1, amq.al.cm);
/* 299 */       par3World.e(par4, par5 + 4, par6 + 2, amq.al.cm);
/* 300 */       par3World.e(par4 + 1, par5 + 4, par6 + 2, amq.al.cm);
/* 301 */       par3World.e(par4 + 2, par5 + 4, par6 + 2, amq.al.cm);
/* 302 */       par3World.e(par4 - 1, par5 + 4, par6 + 2, amq.al.cm);
/* 303 */       par3World.e(par4 - 2, par5 + 4, par6 + 2, amq.al.cm);
/* 304 */       par3World.e(par4, par5 + 4, par6 + 3, amq.al.cm);
/* 305 */       par3World.e(par4 + 1, par5 + 4, par6 + 3, amq.al.cm);
/* 306 */       par3World.e(par4 + 2, par5 + 4, par6 + 3, amq.al.cm);
/* 307 */       par3World.e(par4 - 1, par5 + 4, par6 + 3, amq.al.cm);
/* 308 */       par3World.e(par4 - 2, par5 + 4, par6 + 3, amq.al.cm);
/* 309 */       par3World.e(par4, par5 + 4, par6 + 4, amq.al.cm);
/* 310 */       par3World.e(par4 + 1, par5 + 4, par6 + 4, amq.al.cm);
/* 311 */       par3World.e(par4 + 2, par5 + 4, par6 + 4, amq.al.cm);
/* 312 */       par3World.e(par4 - 1, par5 + 4, par6 + 4, amq.al.cm);
/* 313 */       par3World.e(par4 - 2, par5 + 4, par6 + 4, amq.al.cm);
/* 314 */       par3World.e(par4, par5 + 4, par6 + 5, amq.al.cm);
/* 315 */       par3World.e(par4 + 1, par5 + 4, par6 + 5, amq.al.cm);
/* 316 */       par3World.e(par4 + 2, par5 + 4, par6 + 5, amq.al.cm);
/* 317 */       par3World.e(par4 - 1, par5 + 4, par6 + 5, amq.al.cm);
/* 318 */       par3World.e(par4 - 2, par5 + 4, par6 + 5, amq.al.cm);
/* 319 */       par3World.e(par4, par5 + 4, par6 + 6, amq.al.cm);
/* 320 */       par3World.e(par4 + 1, par5 + 4, par6 + 6, amq.al.cm);
/* 321 */       par3World.e(par4 + 2, par5 + 4, par6 + 6, amq.al.cm);
/* 322 */       par3World.e(par4 - 1, par5 + 4, par6 + 6, amq.al.cm);
/* 323 */       par3World.e(par4 - 2, par5 + 4, par6 + 6, amq.al.cm);
/* 324 */       par3World.e(par4, par5 + 4, par6 + 7, amq.al.cm);
/* 325 */       par3World.e(par4 - 1, par5 + 4, par6 + 7, amq.al.cm);
/* 326 */       par3World.e(par4 + 1, par5 + 4, par6 + 7, amq.al.cm);
/* 327 */       par3World.e(par4 + 2, par5 + 4, par6 + 7, amq.al.cm);
/* 328 */       par3World.e(par4 + 3, par5 + 4, par6 + 7, amq.al.cm);
/* 329 */       par3World.e(par4 - 2, par5 + 4, par6 + 7, amq.al.cm);
/* 330 */       par3World.e(par4 - 2, par5, par6, amq.w.cm);
/* 331 */       par3World.e(par4 - 2, par5 + 1, par6, amq.w.cm);
/* 332 */       par3World.e(par4, par5 + 1, par6 + 6, mod_SCP.SCP914.cm);
/* 333 */       par3World.e(par4, par5 + 2, par6 + 6, amq.at.cm);
/* 334 */       par3World.e(par4 - 1, par5 + 1, par6 + 6, mod_SCP.Machinery.cm);
/* 335 */       par3World.e(par4 - 2, par5 + 1, par6 + 6, mod_SCP.Machinery.cm);
/* 336 */       par3World.e(par4 + 1, par5 + 1, par6 + 6, mod_SCP.Machinery.cm);
/* 337 */       par3World.e(par4 + 2, par5 + 1, par6 + 6, mod_SCP.Machinery.cm);
/* 338 */       par3World.e(par4, par5, par6 + 6, mod_SCP.Machinery.cm);
/* 339 */       par3World.e(par4 + 2, par5, par6 + 6, mod_SCP.Machinery.cm);
/* 340 */       par3World.e(par4 - 2, par5, par6 + 6, mod_SCP.Machinery.cm);
/* 341 */       par3World.e(par4 - 1, par5, par6 + 6, amq.bE.cm);
/* 342 */       par3World.e(par4 + 1, par5, par6 + 6, amq.bE.cm);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 349 */       par2EntityPlayer.b("SCP-914 Spawned. | [Type: §2Safe§f]");
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 355 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 362 */     SCPEntityClassDGuy var8 = new SCPEntityClassDGuy(par0World);
/* 363 */     var8.b(par2 + 3.8D, par4, par6 + 3.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 364 */     par0World.d((lq)var8);
/* 365 */     var8.aO();
/*     */     
/* 367 */     SCPEntityClassDGuy var9 = new SCPEntityClassDGuy(par0World);
/* 368 */     var9.b(par2 - 3.8D, par4, par6 + 3.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 369 */     par0World.d((lq)var9);
/* 370 */     var9.aO();
/*     */     
/* 372 */     return (var8 != null);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem914.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */