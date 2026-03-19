/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.entities.SCPEntity049;
/*     */ import SCPCraft.mod_SCP;
/*     */ import amq;
/*     */ import java.util.List;
/*     */ import lq;
/*     */ import qx;
/*     */ import r;
/*     */ import tx;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ public class SCPItem049
/*     */   extends SCPItemDocument
/*     */ {
/*     */   public SCPItem049(int i) {
/*  19 */     super(i);
/*  20 */     this.ck = 1;
/*  21 */     e(1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  27 */     list.add("§eSCP-049");
/*  28 */     list.add("§7The Plague Doctor");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean n_() {
/*  33 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/*  38 */     if (par3World.I)
/*     */     {
/*  40 */       return true;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  45 */     int var11 = par3World.a(par4, par5, par6);
/*  46 */     par4 += r.b[par7];
/*  47 */     par5 += r.c[par7];
/*  48 */     par6 += r.d[par7];
/*  49 */     double var12 = 0.0D;
/*     */     
/*  51 */     if ((par7 == 1 && var11 == amq.bc.cm) || var11 == amq.bE.cm)
/*     */     {
/*  53 */       var12 = 0.5D;
/*     */     }
/*     */     
/*  56 */     if (spawnCreature(par3World, par1ItemStack.j(), par4 + 0.5D, par5 + var12, par6 + 0.5D) && !par2EntityPlayer.cd.d)
/*     */     {
/*  58 */       par1ItemStack.a--;
/*     */     }
/*     */     
/*  61 */     for (int m = -3; m <= 3; m++) {
/*  62 */       for (int n = 0; n <= 7; n++) {
/*  63 */         for (int b = 0; b <= 4; b++)
/*  64 */           par3World.e(par4 + m, par5 + b, par6 + n, 0); 
/*     */       } 
/*     */     } 
/*  67 */     par3World.a(par4 + 0.5D, par5 + 0.5D, par6 + 0.5D, "fire.ignite", 1.0F, d.nextFloat() * 0.4F + 0.8F);
/*  68 */     par3World.e(par4, par5, par6, amq.al.cm);
/*  69 */     par3World.e(par4 - 1, par5, par6, amq.al.cm);
/*  70 */     par3World.e(par4 + 1, par5, par6, amq.al.cm);
/*  71 */     par3World.e(par4 + 2, par5, par6, amq.al.cm);
/*  72 */     par3World.e(par4 + 3, par5, par6, amq.al.cm);
/*  73 */     par3World.e(par4 - 3, par5, par6, amq.al.cm);
/*  74 */     par3World.e(par4 - 3, par5, par6 + 1, amq.al.cm);
/*  75 */     par3World.e(par4 - 3, par5, par6 + 2, amq.al.cm);
/*  76 */     par3World.e(par4 - 3, par5, par6 + 3, amq.al.cm);
/*  77 */     par3World.e(par4 - 3, par5, par6 + 4, amq.al.cm);
/*  78 */     par3World.e(par4 - 3, par5, par6 + 5, amq.al.cm);
/*  79 */     par3World.e(par4 - 3, par5, par6 + 6, amq.al.cm);
/*  80 */     par3World.e(par4 - 3, par5, par6 + 7, amq.al.cm);
/*  81 */     par3World.e(par4 + 3, par5, par6 + 7, amq.al.cm);
/*  82 */     par3World.e(par4 + 3, par5, par6 + 1, mod_SCP.Locker.cm);
/*  83 */     par3World.e(par4 + 3, par5, par6 + 2, mod_SCP.Locker.cm);
/*  84 */     par3World.e(par4 + 3, par5, par6 + 3, mod_SCP.Locker.cm);
/*  85 */     par3World.e(par4 + 3, par5, par6 + 4, mod_SCP.Locker.cm);
/*  86 */     par3World.e(par4 + 3, par5, par6 + 5, mod_SCP.Locker.cm);
/*  87 */     par3World.e(par4 + 3, par5, par6 + 6, mod_SCP.Locker.cm);
/*     */     
/*  89 */     par3World.e(par4, par5 - 1, par6, mod_SCP.Locker.cm);
/*  90 */     par3World.e(par4 - 1, par5 - 1, par6, mod_SCP.Locker.cm);
/*  91 */     par3World.e(par4 + 1, par5 - 1, par6, mod_SCP.Locker.cm);
/*  92 */     par3World.e(par4 + 2, par5 - 1, par6, mod_SCP.Locker.cm);
/*  93 */     par3World.e(par4 + 3, par5 - 1, par6, mod_SCP.Locker.cm);
/*  94 */     par3World.e(par4 + 3, par5 - 1, par6 + 1, mod_SCP.Locker.cm);
/*  95 */     par3World.e(par4 + 3, par5 - 1, par6 + 2, mod_SCP.Locker.cm);
/*  96 */     par3World.e(par4 + 3, par5 - 1, par6 + 3, mod_SCP.Locker.cm);
/*  97 */     par3World.e(par4 + 3, par5 - 1, par6 + 4, mod_SCP.Locker.cm);
/*  98 */     par3World.e(par4 + 3, par5 - 1, par6 + 5, mod_SCP.Locker.cm);
/*  99 */     par3World.e(par4 + 3, par5 - 1, par6 + 6, mod_SCP.Locker.cm);
/* 100 */     par3World.e(par4 + 3, par5 - 1, par6 + 7, mod_SCP.Locker.cm);
/* 101 */     par3World.e(par4 - 3, par5 - 1, par6, mod_SCP.Locker.cm);
/* 102 */     par3World.e(par4 - 2, par5 - 1, par6, mod_SCP.Locker.cm);
/* 103 */     par3World.e(par4 - 3, par5 - 1, par6 + 1, mod_SCP.Locker.cm);
/* 104 */     par3World.e(par4 - 3, par5 - 1, par6 + 2, mod_SCP.Locker.cm);
/* 105 */     par3World.e(par4 - 3, par5 - 1, par6 + 3, mod_SCP.Locker.cm);
/* 106 */     par3World.e(par4 - 3, par5 - 1, par6 + 4, mod_SCP.Locker.cm);
/* 107 */     par3World.e(par4 - 3, par5 - 1, par6 + 5, mod_SCP.Locker.cm);
/* 108 */     par3World.e(par4 - 3, par5 - 1, par6 + 6, mod_SCP.Locker.cm);
/* 109 */     par3World.e(par4 - 3, par5 - 1, par6 + 7, mod_SCP.Locker.cm);
/* 110 */     par3World.e(par4, par5 - 1, par6 + 7, mod_SCP.Locker.cm);
/* 111 */     par3World.e(par4 - 1, par5 - 1, par6 + 7, mod_SCP.Locker.cm);
/* 112 */     par3World.e(par4 - 2, par5 - 1, par6 + 7, mod_SCP.Locker.cm);
/* 113 */     par3World.e(par4 + 1, par5 - 1, par6 + 7, mod_SCP.Locker.cm);
/* 114 */     par3World.e(par4 + 2, par5 - 1, par6 + 7, mod_SCP.Locker.cm);
/* 115 */     par3World.e(par4 + 3, par5 - 1, par6 + 7, mod_SCP.Locker.cm);
/* 116 */     par3World.e(par4, par5 - 1, par6 + 1, amq.w.cm);
/* 117 */     par3World.e(par4 + 1, par5 - 1, par6 + 1, amq.w.cm);
/* 118 */     par3World.e(par4 + 2, par5 - 1, par6 + 1, amq.w.cm);
/* 119 */     par3World.e(par4 - 1, par5 - 1, par6 + 1, amq.w.cm);
/* 120 */     par3World.e(par4 - 2, par5 - 1, par6 + 1, amq.al.cm);
/* 121 */     par3World.e(par4, par5 - 1, par6 + 2, amq.w.cm);
/* 122 */     par3World.e(par4 + 1, par5 - 1, par6 + 2, amq.w.cm);
/* 123 */     par3World.e(par4 + 2, par5 - 1, par6 + 2, amq.w.cm);
/* 124 */     par3World.e(par4 - 1, par5 - 1, par6 + 2, amq.w.cm);
/* 125 */     par3World.e(par4 - 2, par5 - 1, par6 + 2, amq.w.cm);
/* 126 */     par3World.e(par4, par5 - 1, par6 + 3, amq.w.cm);
/* 127 */     par3World.e(par4 + 1, par5 - 1, par6 + 3, amq.w.cm);
/* 128 */     par3World.e(par4 + 2, par5 - 1, par6 + 3, amq.w.cm);
/* 129 */     par3World.e(par4 - 1, par5 - 1, par6 + 3, amq.w.cm);
/* 130 */     par3World.e(par4 - 2, par5 - 1, par6 + 3, amq.w.cm);
/* 131 */     par3World.e(par4, par5 - 1, par6 + 4, amq.w.cm);
/* 132 */     par3World.e(par4 + 1, par5 - 1, par6 + 4, amq.w.cm);
/* 133 */     par3World.e(par4 + 2, par5 - 1, par6 + 4, amq.w.cm);
/* 134 */     par3World.e(par4 - 1, par5 - 1, par6 + 4, amq.w.cm);
/* 135 */     par3World.e(par4 - 2, par5 - 1, par6 + 4, amq.w.cm);
/* 136 */     par3World.e(par4, par5 - 1, par6 + 5, amq.w.cm);
/* 137 */     par3World.e(par4 + 1, par5 - 1, par6 + 5, amq.w.cm);
/* 138 */     par3World.e(par4 + 2, par5 - 1, par6 + 5, amq.w.cm);
/* 139 */     par3World.e(par4 - 1, par5 - 1, par6 + 5, amq.w.cm);
/* 140 */     par3World.e(par4 - 2, par5 - 1, par6 + 5, amq.w.cm);
/* 141 */     par3World.e(par4, par5 - 1, par6 + 6, amq.w.cm);
/* 142 */     par3World.e(par4 + 1, par5 - 1, par6 + 6, amq.w.cm);
/* 143 */     par3World.e(par4 + 2, par5 - 1, par6 + 6, amq.w.cm);
/* 144 */     par3World.e(par4 - 1, par5 - 1, par6 + 6, amq.w.cm);
/* 145 */     par3World.e(par4 - 2, par5 - 1, par6 + 6, amq.w.cm);
/* 146 */     par3World.e(par4, par5, par6 + 7, amq.al.cm);
/* 147 */     par3World.e(par4 - 1, par5, par6 + 7, amq.al.cm);
/* 148 */     par3World.e(par4 + 1, par5, par6 + 7, amq.al.cm);
/* 149 */     par3World.e(par4 + 2, par5, par6 + 7, amq.al.cm);
/* 150 */     par3World.e(par4 + 3, par5, par6 + 7, amq.al.cm);
/* 151 */     par3World.e(par4 - 2, par5, par6 + 7, amq.al.cm);
/*     */ 
/*     */     
/* 154 */     par3World.e(par4, par5 + 1, par6 + 7, amq.al.cm);
/* 155 */     par3World.e(par4 - 1, par5 + 1, par6 + 7, amq.al.cm);
/* 156 */     par3World.e(par4 + 1, par5 + 1, par6 + 7, amq.al.cm);
/* 157 */     par3World.e(par4 + 2, par5 + 1, par6 + 7, amq.al.cm);
/* 158 */     par3World.e(par4 + 3, par5 + 1, par6 + 7, amq.al.cm);
/* 159 */     par3World.e(par4 - 2, par5 + 1, par6 + 7, amq.al.cm);
/* 160 */     par3World.e(par4, par5 + 1, par6, amq.bt.cm);
/* 161 */     par3World.e(par4 - 1, par5 + 1, par6, amq.al.cm);
/* 162 */     par3World.e(par4 + 1, par5 + 1, par6, amq.bt.cm);
/* 163 */     par3World.e(par4 + 2, par5 + 1, par6, amq.al.cm);
/* 164 */     par3World.e(par4 + 3, par5 + 1, par6, amq.al.cm);
/* 165 */     par3World.e(par4 - 3, par5 + 1, par6, amq.al.cm);
/* 166 */     par3World.e(par4 - 3, par5 + 1, par6 + 1, amq.al.cm);
/* 167 */     par3World.e(par4 - 3, par5 + 1, par6 + 2, amq.al.cm);
/* 168 */     par3World.e(par4 - 3, par5 + 1, par6 + 3, amq.al.cm);
/* 169 */     par3World.e(par4 - 3, par5 + 1, par6 + 4, amq.al.cm);
/* 170 */     par3World.e(par4 - 3, par5 + 1, par6 + 5, amq.al.cm);
/* 171 */     par3World.e(par4 - 3, par5 + 1, par6 + 6, amq.al.cm);
/* 172 */     par3World.e(par4 - 3, par5 + 1, par6 + 7, amq.al.cm);
/* 173 */     par3World.e(par4 + 3, par5 + 1, par6 + 7, amq.al.cm);
/* 174 */     par3World.e(par4 + 3, par5 + 1, par6 + 1, mod_SCP.Locker.cm);
/* 175 */     par3World.e(par4 + 3, par5 + 1, par6 + 2, mod_SCP.Locker.cm);
/* 176 */     par3World.e(par4 + 3, par5 + 1, par6 + 3, mod_SCP.Locker.cm);
/* 177 */     par3World.e(par4 + 3, par5 + 1, par6 + 4, mod_SCP.Locker.cm);
/* 178 */     par3World.e(par4 + 3, par5 + 1, par6 + 5, mod_SCP.Locker.cm);
/* 179 */     par3World.e(par4 + 3, par5 + 1, par6 + 6, mod_SCP.Locker.cm);
/*     */ 
/*     */     
/* 182 */     par3World.e(par4, par5 + 2, par6 + 7, amq.bt.cm);
/* 183 */     par3World.e(par4 - 1, par5 + 2, par6 + 7, amq.bt.cm);
/* 184 */     par3World.e(par4 + 1, par5 + 2, par6 + 7, amq.bt.cm);
/* 185 */     par3World.e(par4 + 2, par5 + 2, par6 + 7, amq.al.cm);
/* 186 */     par3World.e(par4 + 3, par5 + 2, par6 + 7, amq.al.cm);
/* 187 */     par3World.e(par4 - 2, par5 + 2, par6 + 7, amq.al.cm);
/* 188 */     par3World.e(par4, par5 + 2, par6, amq.bt.cm);
/* 189 */     par3World.e(par4 - 1, par5 + 2, par6, amq.al.cm);
/* 190 */     par3World.e(par4 + 1, par5 + 2, par6, amq.bt.cm);
/* 191 */     par3World.e(par4 + 2, par5 + 2, par6, amq.al.cm);
/* 192 */     par3World.e(par4 + 3, par5 + 2, par6, amq.al.cm);
/* 193 */     par3World.e(par4 - 3, par5 + 2, par6, amq.al.cm);
/* 194 */     par3World.e(par4 - 3, par5 + 2, par6 + 1, amq.al.cm);
/* 195 */     par3World.e(par4 - 3, par5 + 2, par6 + 2, amq.al.cm);
/* 196 */     par3World.e(par4 - 3, par5 + 2, par6 + 3, amq.al.cm);
/* 197 */     par3World.e(par4 - 3, par5 + 2, par6 + 4, amq.al.cm);
/* 198 */     par3World.e(par4 - 3, par5 + 2, par6 + 5, amq.al.cm);
/* 199 */     par3World.e(par4 - 3, par5 + 2, par6 + 6, amq.al.cm);
/* 200 */     par3World.e(par4 - 3, par5 + 2, par6 + 7, amq.al.cm);
/* 201 */     par3World.e(par4 + 3, par5 + 2, par6 + 7, amq.al.cm);
/* 202 */     par3World.e(par4 + 3, par5 + 2, par6 + 1, mod_SCP.Locker.cm);
/* 203 */     par3World.e(par4 + 3, par5 + 2, par6 + 2, mod_SCP.Locker.cm);
/* 204 */     par3World.e(par4 + 3, par5 + 2, par6 + 3, mod_SCP.Locker.cm);
/* 205 */     par3World.e(par4 + 3, par5 + 2, par6 + 4, mod_SCP.Locker.cm);
/* 206 */     par3World.e(par4 + 3, par5 + 2, par6 + 5, mod_SCP.Locker.cm);
/* 207 */     par3World.e(par4 + 3, par5 + 2, par6 + 6, mod_SCP.Locker.cm);
/* 208 */     par3World.e(par4 - 2, par5 + 2, par6, amq.al.cm);
/*     */ 
/*     */     
/* 211 */     par3World.e(par4, par5 + 3, par6 + 7, amq.al.cm);
/* 212 */     par3World.e(par4 - 1, par5 + 3, par6 + 7, amq.al.cm);
/* 213 */     par3World.e(par4 + 1, par5 + 3, par6 + 7, amq.al.cm);
/* 214 */     par3World.e(par4 + 2, par5 + 3, par6 + 7, amq.al.cm);
/* 215 */     par3World.e(par4 + 3, par5 + 3, par6 + 7, amq.al.cm);
/* 216 */     par3World.e(par4 - 2, par5 + 3, par6 + 7, amq.al.cm);
/* 217 */     par3World.e(par4, par5 + 3, par6, amq.al.cm);
/* 218 */     par3World.e(par4, par5 + 3, par6 + 1, amq.at.cm);
/* 219 */     par3World.e(par4 - 1, par5 + 3, par6, amq.al.cm);
/* 220 */     par3World.e(par4 + 1, par5 + 3, par6, amq.al.cm);
/* 221 */     par3World.e(par4 + 2, par5 + 3, par6, amq.al.cm);
/* 222 */     par3World.e(par4 + 3, par5 + 3, par6, amq.al.cm);
/* 223 */     par3World.e(par4 - 3, par5 + 3, par6, amq.al.cm);
/* 224 */     par3World.e(par4 - 3, par5 + 3, par6 + 1, amq.al.cm);
/* 225 */     par3World.e(par4 - 3, par5 + 3, par6 + 2, amq.al.cm);
/* 226 */     par3World.e(par4 - 3, par5 + 3, par6 + 3, amq.al.cm);
/* 227 */     par3World.e(par4 - 3, par5 + 3, par6 + 4, amq.al.cm);
/* 228 */     par3World.e(par4 - 3, par5 + 3, par6 + 5, amq.al.cm);
/* 229 */     par3World.e(par4 - 3, par5 + 3, par6 + 6, amq.al.cm);
/* 230 */     par3World.e(par4 - 3, par5 + 3, par6 + 7, amq.al.cm);
/* 231 */     par3World.e(par4 + 3, par5 + 3, par6 + 7, amq.al.cm);
/* 232 */     par3World.e(par4 + 3, par5 + 3, par6 + 1, mod_SCP.Locker.cm);
/* 233 */     par3World.e(par4 + 3, par5 + 3, par6 + 2, mod_SCP.Locker.cm);
/* 234 */     par3World.e(par4 + 3, par5 + 3, par6 + 3, mod_SCP.Locker.cm);
/* 235 */     par3World.e(par4 + 3, par5 + 3, par6 + 4, mod_SCP.Locker.cm);
/* 236 */     par3World.e(par4 + 3, par5 + 3, par6 + 5, mod_SCP.Locker.cm);
/* 237 */     par3World.e(par4 + 3, par5 + 3, par6 + 6, mod_SCP.Locker.cm);
/* 238 */     par3World.e(par4 - 2, par5 + 3, par6, amq.al.cm);
/*     */ 
/*     */     
/* 241 */     par3World.e(par4, par5 + 4, par6, amq.al.cm);
/* 242 */     par3World.e(par4 - 1, par5 + 4, par6, amq.al.cm);
/* 243 */     par3World.e(par4 + 1, par5 + 4, par6, amq.al.cm);
/* 244 */     par3World.e(par4 + 2, par5 + 4, par6, amq.al.cm);
/* 245 */     par3World.e(par4 + 3, par5 + 4, par6, amq.al.cm);
/* 246 */     par3World.e(par4 + 3, par5 + 4, par6 + 1, amq.al.cm);
/* 247 */     par3World.e(par4 + 3, par5 + 4, par6 + 2, amq.al.cm);
/* 248 */     par3World.e(par4 + 3, par5 + 4, par6 + 3, amq.al.cm);
/* 249 */     par3World.e(par4 + 3, par5 + 4, par6 + 4, amq.al.cm);
/* 250 */     par3World.e(par4 + 3, par5 + 4, par6 + 5, amq.al.cm);
/* 251 */     par3World.e(par4 + 3, par5 + 4, par6 + 6, amq.al.cm);
/* 252 */     par3World.e(par4 + 3, par5 + 4, par6 + 7, amq.al.cm);
/* 253 */     par3World.e(par4 - 3, par5 + 4, par6, amq.al.cm);
/* 254 */     par3World.e(par4 - 2, par5 + 4, par6, amq.al.cm);
/* 255 */     par3World.e(par4 - 3, par5 + 4, par6 + 1, amq.al.cm);
/* 256 */     par3World.e(par4 - 3, par5 + 4, par6 + 2, amq.al.cm);
/* 257 */     par3World.e(par4 - 3, par5 + 4, par6 + 3, amq.al.cm);
/* 258 */     par3World.e(par4 - 3, par5 + 4, par6 + 4, amq.al.cm);
/* 259 */     par3World.e(par4 - 3, par5 + 4, par6 + 5, amq.al.cm);
/* 260 */     par3World.e(par4 - 3, par5 + 4, par6 + 6, amq.al.cm);
/* 261 */     par3World.e(par4 - 3, par5 + 4, par6 + 7, amq.al.cm);
/* 262 */     par3World.e(par4, par5 + 4, par6 + 7, amq.al.cm);
/* 263 */     par3World.e(par4 - 1, par5 + 4, par6 + 7, amq.al.cm);
/* 264 */     par3World.e(par4 - 2, par5 + 4, par6 + 7, amq.al.cm);
/* 265 */     par3World.e(par4 + 1, par5 + 4, par6 + 7, amq.al.cm);
/* 266 */     par3World.e(par4 + 2, par5 + 4, par6 + 7, amq.al.cm);
/* 267 */     par3World.e(par4 + 3, par5 + 4, par6 + 7, amq.al.cm);
/* 268 */     par3World.e(par4, par5 + 4, par6 + 1, amq.al.cm);
/* 269 */     par3World.e(par4 + 1, par5 + 4, par6 + 1, amq.al.cm);
/* 270 */     par3World.e(par4 + 2, par5 + 4, par6 + 1, amq.al.cm);
/* 271 */     par3World.e(par4 - 1, par5 + 4, par6 + 1, amq.al.cm);
/* 272 */     par3World.e(par4 - 2, par5 + 4, par6 + 1, amq.al.cm);
/* 273 */     par3World.e(par4, par5 + 4, par6 + 2, amq.al.cm);
/* 274 */     par3World.e(par4 + 1, par5 + 4, par6 + 2, amq.al.cm);
/* 275 */     par3World.e(par4 + 2, par5 + 4, par6 + 2, amq.al.cm);
/* 276 */     par3World.e(par4 - 1, par5 + 4, par6 + 2, amq.al.cm);
/* 277 */     par3World.e(par4 - 2, par5 + 4, par6 + 2, amq.al.cm);
/* 278 */     par3World.e(par4, par5 + 4, par6 + 3, amq.al.cm);
/* 279 */     par3World.e(par4 + 1, par5 + 4, par6 + 3, amq.al.cm);
/* 280 */     par3World.e(par4 + 2, par5 + 4, par6 + 3, amq.al.cm);
/* 281 */     par3World.e(par4 - 1, par5 + 4, par6 + 3, amq.al.cm);
/* 282 */     par3World.e(par4 - 2, par5 + 4, par6 + 3, amq.al.cm);
/* 283 */     par3World.e(par4, par5 + 4, par6 + 4, amq.al.cm);
/* 284 */     par3World.e(par4 + 1, par5 + 4, par6 + 4, amq.al.cm);
/* 285 */     par3World.e(par4 + 2, par5 + 4, par6 + 4, amq.al.cm);
/* 286 */     par3World.e(par4 - 1, par5 + 4, par6 + 4, amq.al.cm);
/* 287 */     par3World.e(par4 - 2, par5 + 4, par6 + 4, amq.al.cm);
/* 288 */     par3World.e(par4, par5 + 4, par6 + 5, amq.al.cm);
/* 289 */     par3World.e(par4 + 1, par5 + 4, par6 + 5, amq.al.cm);
/* 290 */     par3World.e(par4 + 2, par5 + 4, par6 + 5, amq.al.cm);
/* 291 */     par3World.e(par4 - 1, par5 + 4, par6 + 5, amq.al.cm);
/* 292 */     par3World.e(par4 - 2, par5 + 4, par6 + 5, amq.al.cm);
/* 293 */     par3World.e(par4, par5 + 4, par6 + 6, amq.al.cm);
/* 294 */     par3World.e(par4 + 1, par5 + 4, par6 + 6, amq.al.cm);
/* 295 */     par3World.e(par4 + 2, par5 + 4, par6 + 6, amq.al.cm);
/* 296 */     par3World.e(par4 - 1, par5 + 4, par6 + 6, amq.al.cm);
/* 297 */     par3World.e(par4 - 2, par5 + 4, par6 + 6, amq.al.cm);
/* 298 */     par3World.e(par4, par5 + 4, par6 + 7, amq.al.cm);
/* 299 */     par3World.e(par4 - 1, par5 + 4, par6 + 7, amq.al.cm);
/* 300 */     par3World.e(par4 + 1, par5 + 4, par6 + 7, amq.al.cm);
/* 301 */     par3World.e(par4 + 2, par5 + 4, par6 + 7, amq.al.cm);
/* 302 */     par3World.e(par4 + 3, par5 + 4, par6 + 7, amq.al.cm);
/* 303 */     par3World.e(par4 - 2, par5 + 4, par6 + 7, amq.al.cm);
/* 304 */     tx.a(par3World, par4 - 2, par5, par6, 1, amq.aO);
/* 305 */     par3World.e(par4 + 1, par5 + 1, par6 + 6, amq.bs.cm);
/* 306 */     par3World.e(par4 + 1, par5, par6 + 6, amq.bs.cm);
/* 307 */     par3World.e(par4 + 1, par5 + 1, par6 + 5, amq.bs.cm);
/* 308 */     par3World.e(par4 + 1, par5, par6 + 5, amq.bs.cm);
/* 309 */     par3World.e(par4, par5 + 1, par6 + 5, amq.bs.cm);
/* 310 */     par3World.e(par4, par5, par6 + 5, amq.bs.cm);
/* 311 */     par3World.e(par4 - 1, par5 + 1, par6 + 5, amq.bs.cm);
/* 312 */     par3World.e(par4 - 1, par5, par6 + 5, amq.bs.cm);
/* 313 */     par3World.e(par4 - 1, par5 + 1, par6 + 6, amq.bs.cm);
/* 314 */     par3World.e(par4 - 1, par5, par6 + 6, amq.bs.cm);
/*     */     
/* 316 */     par3World.d(par4 - 3, par5 + 1, par6 - 1, mod_SCP.KeycardSlotLv2.cm, 2);
/* 317 */     par3World.d(par4 - 1, par5 + 1, par6 + 1, mod_SCP.KeycardSlotLv2.cm, 0);
/*     */     
/* 319 */     par2EntityPlayer.b("SCP-049 Spawned. | [Type: §eEuclid§f]");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 325 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 331 */     SCPEntity049 var8 = new SCPEntity049(par0World);
/* 332 */     var8.b(par2, par4, par6 + 6.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 333 */     par0World.d((lq)var8);
/* 334 */     var8.aO();
/*     */     
/* 336 */     return (var8 != null);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem049.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */