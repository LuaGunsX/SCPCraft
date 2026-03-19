/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.entities.SCPEntity015Boss;
/*     */ import SCPCraft.mod_SCP;
/*     */ import amq;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import jl;
/*     */ import lq;
/*     */ import qx;
/*     */ import r;
/*     */ import tx;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public class SCPItem015
/*     */   extends SCPItemDocument {
/*  18 */   public Random rand = new Random();
/*  19 */   public int[] pipes = new int[] { 1, 0, 1, 1, 1, 0, 1, 1, 2, 0, 1, 0, 0, 2, 1, 1, 2, 1, 0, 0, 0, 0, 2, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 2, 0, 0, 1, 1, 0, 1, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 2, 0, 1, 2, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 2, 0, 1, 1, 2, 1, 2, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 2, 0, 0, 1, 0, 0, 0, 0, 2, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 2, 1, 1, 0, 0, 1, 2, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 2, 1, 1, 0, 1, 2, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 2, 1, 1, 1, 0, 1, 1, 0, 0, 0, 2, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 2, 0, 0, 0, 1, 2, 1, 0, 1, 2, 0, 0, 2, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 2, 1, 1, 0, 0, 1, 1, 0, 1, 2, 1, 0, 0 };
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
/*  36 */   public int[] pipes1 = new int[] { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1 };
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
/*  53 */   public int[] pipes2 = new int[] { 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0 };
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
/*     */   public SCPItem015(int i) {
/*  72 */     super(i);
/*  73 */     this.ck = 1;
/*  74 */     e(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  79 */     list.add("§eSCP-015");
/*  80 */     list.add("§7Pipe Nightmare");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean n_() {
/*  85 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/*  90 */     par1ItemStack.a--;
/*  91 */     if (par3World.I) {
/*     */       
/*  93 */       par1ItemStack.a--;
/*  94 */       return true;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  99 */     int var11 = par3World.a(par4, par5, par6);
/* 100 */     par4 += r.b[par7];
/* 101 */     par5 += r.c[par7];
/* 102 */     par6 += r.d[par7];
/* 103 */     double var12 = 0.0D;
/*     */     
/* 105 */     if ((par7 == 1 && var11 == amq.bc.cm) || var11 == amq.bE.cm)
/*     */     {
/* 107 */       var12 = 0.5D;
/*     */     }
/*     */     
/* 110 */     if (spawnCreature(par3World, par1ItemStack.j(), par4 + 0.5D, par5 + var12, par6 + 0.5D) && !par2EntityPlayer.cd.d)
/*     */     {
/* 112 */       par1ItemStack.a = 0;
/*     */     }
/* 114 */     int i = par3World.a(par4, par5, par6);
/*     */     int height;
/* 116 */     for (height = -1; height <= 5; height++) {
/* 117 */       for (int length = -1; length <= 15; length++) {
/* 118 */         for (int j = -1; j <= 15; j++)
/*     */         {
/* 120 */           par3World.d(par4 + length, par5 + height, par6 + j, amq.w.cm, 0); } 
/*     */       } 
/*     */     } 
/* 123 */     for (height = 0; height <= 4; height++) {
/* 124 */       for (int length = 0; length <= 14; length++) {
/* 125 */         for (int j = 0; j <= 14; j++)
/*     */         {
/* 127 */           par3World.d(par4 + length, par5 + height, par6 + j, 0, 0); } 
/*     */       } 
/*     */     } 
/*     */     int width;
/* 131 */     for (width = 0; width <= 224; width++) {
/*     */       
/* 133 */       if (this.pipes[width] == 1)
/* 134 */         if (width <= 14) { par3World.e(par4 + width, par5, par6 + 14, mod_SCP.SCP015.cm); }
/* 135 */         else if (width >= 15 && width <= 29) { par3World.e(par4 + width - 14 - 1, par5, par6 + 13, mod_SCP.SCP015.cm); }
/* 136 */         else if (width >= 30 && width <= 44) { par3World.e(par4 + width - 28 - 2, par5, par6 + 12, mod_SCP.SCP015.cm); }
/* 137 */         else if (width >= 45 && width <= 59) { par3World.e(par4 + width - 42 - 3, par5, par6 + 11, mod_SCP.SCP015.cm); }
/* 138 */         else if (width >= 60 && width <= 74) { par3World.e(par4 + width - 56 - 4, par5, par6 + 10, mod_SCP.SCP015.cm); }
/* 139 */         else if (width >= 75 && width <= 89) { par3World.e(par4 + width - 70 - 5, par5, par6 + 9, mod_SCP.SCP015.cm); }
/* 140 */         else if (width >= 90 && width <= 104) { par3World.e(par4 + width - 84 - 6, par5, par6 + 8, mod_SCP.SCP015.cm); }
/* 141 */         else if (width >= 105 && width <= 119) { par3World.e(par4 + width - 98 - 7, par5, par6 + 7, mod_SCP.SCP015.cm); }
/* 142 */         else if (width >= 120 && width <= 134) { par3World.e(par4 + width - 112 - 8, par5, par6 + 6, mod_SCP.SCP015.cm); }
/* 143 */         else if (width >= 135 && width <= 149) { par3World.e(par4 + width - 126 - 9, par5, par6 + 5, mod_SCP.SCP015.cm); }
/* 144 */         else if (width >= 150 && width <= 164) { par3World.e(par4 + width - 140 - 10, par5, par6 + 4, mod_SCP.SCP015.cm); }
/* 145 */         else if (width >= 165 && width <= 179) { par3World.e(par4 + width - 154 - 11, par5, par6 + 3, mod_SCP.SCP015.cm); }
/* 146 */         else if (width >= 180 && width <= 194) { par3World.e(par4 + width - 168 - 12, par5, par6 + 2, mod_SCP.SCP015.cm); }
/* 147 */         else if (width >= 195 && width <= 209) { par3World.e(par4 + width - 182 - 13, par5, par6 + 1, mod_SCP.SCP015.cm); }
/* 148 */         else if (width >= 210 && width <= 224) { par3World.e(par4 + width - 196 - 14, par5, par6, mod_SCP.SCP015.cm); }
/*     */          
/* 150 */       if (this.pipes[width] == 2)
/*     */       {
/* 152 */         if (width <= 14) { par3World.e(par4 + width, par5, par6 + 14, mod_SCP.Machinery.cm); }
/* 153 */         else if (width >= 15 && width <= 29) { par3World.e(par4 + width - 14 - 1, par5, par6 + 13, mod_SCP.Machinery.cm); }
/* 154 */         else if (width >= 30 && width <= 44) { par3World.e(par4 + width - 28 - 2, par5, par6 + 12, mod_SCP.Machinery.cm); }
/* 155 */         else if (width >= 45 && width <= 59) { par3World.e(par4 + width - 42 - 3, par5, par6 + 11, mod_SCP.Machinery.cm); }
/* 156 */         else if (width >= 60 && width <= 74) { par3World.e(par4 + width - 56 - 4, par5, par6 + 10, mod_SCP.Machinery.cm); }
/* 157 */         else if (width >= 75 && width <= 89) { par3World.e(par4 + width - 70 - 5, par5, par6 + 9, mod_SCP.Machinery.cm); }
/* 158 */         else if (width >= 90 && width <= 104) { par3World.e(par4 + width - 84 - 6, par5, par6 + 8, mod_SCP.Machinery.cm); }
/* 159 */         else if (width >= 105 && width <= 119) { par3World.e(par4 + width - 98 - 7, par5, par6 + 7, mod_SCP.Machinery.cm); }
/* 160 */         else if (width >= 120 && width <= 134) { par3World.e(par4 + width - 112 - 8, par5, par6 + 6, mod_SCP.Machinery.cm); }
/* 161 */         else if (width >= 135 && width <= 149) { par3World.e(par4 + width - 126 - 9, par5, par6 + 5, mod_SCP.Machinery.cm); }
/* 162 */         else if (width >= 150 && width <= 164) { par3World.e(par4 + width - 140 - 10, par5, par6 + 4, mod_SCP.Machinery.cm); }
/* 163 */         else if (width >= 165 && width <= 179) { par3World.e(par4 + width - 154 - 11, par5, par6 + 3, mod_SCP.Machinery.cm); }
/* 164 */         else if (width >= 180 && width <= 194) { par3World.e(par4 + width - 168 - 12, par5, par6 + 2, mod_SCP.Machinery.cm); }
/* 165 */         else if (width >= 195 && width <= 209) { par3World.e(par4 + width - 182 - 13, par5, par6 + 1, mod_SCP.Machinery.cm); }
/* 166 */         else if (width >= 210 && width <= 224) { par3World.e(par4 + width - 196 - 14, par5, par6, mod_SCP.Machinery.cm); }
/*     */       
/*     */       }
/*     */     } 
/*     */     
/* 171 */     for (width = 0; width <= 224; width++) {
/*     */       
/* 173 */       if (this.pipes2[width] == 1) {
/* 174 */         if (width <= 14) { par3World.e(par4 + width, par5, par6 + 14, mod_SCP.SCP015.cm); }
/* 175 */         else if (width >= 15 && width <= 29) { par3World.e(par4 + width - 14 - 1, par5 + 1, par6 + 13, mod_SCP.SCP015.cm); }
/* 176 */         else if (width >= 30 && width <= 44) { par3World.e(par4 + width - 28 - 2, par5 + 1, par6 + 12, mod_SCP.SCP015.cm); }
/* 177 */         else if (width >= 45 && width <= 59) { par3World.e(par4 + width - 42 - 3, par5 + 1, par6 + 11, mod_SCP.SCP015.cm); }
/* 178 */         else if (width >= 60 && width <= 74) { par3World.e(par4 + width - 56 - 4, par5 + 1, par6 + 10, mod_SCP.SCP015.cm); }
/* 179 */         else if (width >= 75 && width <= 89) { par3World.e(par4 + width - 70 - 5, par5 + 1, par6 + 9, mod_SCP.SCP015.cm); }
/* 180 */         else if (width >= 90 && width <= 104) { par3World.e(par4 + width - 84 - 6, par5 + 1, par6 + 8, mod_SCP.SCP015.cm); }
/* 181 */         else if (width >= 105 && width <= 119) { par3World.e(par4 + width - 98 - 7, par5 + 1, par6 + 7, mod_SCP.SCP015.cm); }
/* 182 */         else if (width >= 120 && width <= 134) { par3World.e(par4 + width - 112 - 8, par5 + 1, par6 + 6, mod_SCP.SCP015.cm); }
/* 183 */         else if (width >= 135 && width <= 149) { par3World.e(par4 + width - 126 - 9, par5 + 1, par6 + 5, mod_SCP.SCP015.cm); }
/* 184 */         else if (width >= 150 && width <= 164) { par3World.e(par4 + width - 140 - 10, par5 + 1, par6 + 4, mod_SCP.SCP015.cm); }
/* 185 */         else if (width >= 165 && width <= 179) { par3World.e(par4 + width - 154 - 11, par5 + 1, par6 + 3, mod_SCP.SCP015.cm); }
/* 186 */         else if (width >= 180 && width <= 194) { par3World.e(par4 + width - 168 - 12, par5 + 1, par6 + 2, mod_SCP.SCP015.cm); }
/* 187 */         else if (width >= 195 && width <= 209) { par3World.e(par4 + width - 182 - 13, par5 + 1, par6 + 1, mod_SCP.SCP015.cm); }
/* 188 */         else if (width >= 210 && width <= 224) { par3World.e(par4 + width - 196 - 14, par5 + 1, par6, mod_SCP.SCP015.cm); }
/*     */       
/*     */       }
/*     */     } 
/*     */     
/* 193 */     for (width = 0; width <= 224; width++) {
/*     */       
/* 195 */       if (this.pipes1[width] == 1) {
/* 196 */         if (width <= 14) { par3World.e(par4 + width, par5 + 2, par6 + 14, mod_SCP.SCP015.cm); }
/* 197 */         else if (width >= 15 && width <= 29) { par3World.e(par4 + width - 14 - 1, par5 + 2, par6 + 13, mod_SCP.SCP015.cm); }
/* 198 */         else if (width >= 30 && width <= 44) { par3World.e(par4 + width - 28 - 2, par5 + 2, par6 + 12, mod_SCP.SCP015.cm); }
/* 199 */         else if (width >= 45 && width <= 59) { par3World.e(par4 + width - 42 - 3, par5 + 2, par6 + 11, mod_SCP.SCP015.cm); }
/* 200 */         else if (width >= 60 && width <= 74) { par3World.e(par4 + width - 56 - 4, par5 + 2, par6 + 10, mod_SCP.SCP015.cm); }
/* 201 */         else if (width >= 75 && width <= 89) { par3World.e(par4 + width - 70 - 5, par5 + 2, par6 + 9, mod_SCP.SCP015.cm); }
/* 202 */         else if (width >= 90 && width <= 104) { par3World.e(par4 + width - 84 - 6, par5 + 2, par6 + 8, mod_SCP.SCP015.cm); }
/* 203 */         else if (width >= 105 && width <= 119) { par3World.e(par4 + width - 98 - 7, par5 + 2, par6 + 7, mod_SCP.SCP015.cm); }
/* 204 */         else if (width >= 120 && width <= 134) { par3World.e(par4 + width - 112 - 8, par5 + 2, par6 + 6, mod_SCP.SCP015.cm); }
/* 205 */         else if (width >= 135 && width <= 149) { par3World.e(par4 + width - 126 - 9, par5 + 2, par6 + 5, mod_SCP.SCP015.cm); }
/* 206 */         else if (width >= 150 && width <= 164) { par3World.e(par4 + width - 140 - 10, par5 + 2, par6 + 4, mod_SCP.SCP015.cm); }
/* 207 */         else if (width >= 165 && width <= 179) { par3World.e(par4 + width - 154 - 11, par5 + 2, par6 + 3, mod_SCP.SCP015.cm); }
/* 208 */         else if (width >= 180 && width <= 194) { par3World.e(par4 + width - 168 - 12, par5 + 2, par6 + 2, mod_SCP.SCP015.cm); }
/* 209 */         else if (width >= 195 && width <= 209) { par3World.e(par4 + width - 182 - 13, par5 + 2, par6 + 1, mod_SCP.SCP015.cm); }
/* 210 */         else if (width >= 210 && width <= 224) { par3World.e(par4 + width - 196 - 14, par5 + 2, par6, mod_SCP.SCP015.cm); }
/*     */       
/*     */       }
/*     */     } 
/*     */     
/* 215 */     for (width = 0; width <= 224; width++) {
/*     */       
/* 217 */       if (this.pipes[width] == 1) {
/* 218 */         if (width <= 14) { par3World.e(par4 + width, par5, par6 + 14, mod_SCP.SCP015.cm); }
/* 219 */         else if (width >= 15 && width <= 29) { par3World.e(par4 + width - 14 - 1, par5 + 3, par6 + 13, mod_SCP.SCP015.cm); }
/* 220 */         else if (width >= 30 && width <= 44) { par3World.e(par4 + width - 28 - 2, par5 + 3, par6 + 12, mod_SCP.SCP015.cm); }
/* 221 */         else if (width >= 45 && width <= 59) { par3World.e(par4 + width - 42 - 3, par5 + 3, par6 + 11, mod_SCP.SCP015.cm); }
/* 222 */         else if (width >= 60 && width <= 74) { par3World.e(par4 + width - 56 - 4, par5 + 3, par6 + 10, mod_SCP.SCP015.cm); }
/* 223 */         else if (width >= 75 && width <= 89) { par3World.e(par4 + width - 70 - 5, par5 + 3, par6 + 9, mod_SCP.SCP015.cm); }
/* 224 */         else if (width >= 90 && width <= 104) { par3World.e(par4 + width - 84 - 6, par5 + 3, par6 + 8, mod_SCP.SCP015.cm); }
/* 225 */         else if (width >= 105 && width <= 119) { par3World.e(par4 + width - 98 - 7, par5 + 3, par6 + 7, mod_SCP.SCP015.cm); }
/* 226 */         else if (width >= 120 && width <= 134) { par3World.e(par4 + width - 112 - 8, par5 + 3, par6 + 6, mod_SCP.SCP015.cm); }
/* 227 */         else if (width >= 135 && width <= 149) { par3World.e(par4 + width - 126 - 9, par5 + 3, par6 + 5, mod_SCP.SCP015.cm); }
/* 228 */         else if (width >= 150 && width <= 164) { par3World.e(par4 + width - 140 - 10, par5 + 3, par6 + 4, mod_SCP.SCP015.cm); }
/* 229 */         else if (width >= 165 && width <= 179) { par3World.e(par4 + width - 154 - 11, par5 + 3, par6 + 3, mod_SCP.SCP015.cm); }
/* 230 */         else if (width >= 180 && width <= 194) { par3World.e(par4 + width - 168 - 12, par5 + 3, par6 + 2, mod_SCP.SCP015.cm); }
/* 231 */         else if (width >= 195 && width <= 209) { par3World.e(par4 + width - 182 - 13, par5 + 3, par6 + 1, mod_SCP.SCP015.cm); }
/* 232 */         else if (width >= 210 && width <= 224) { par3World.e(par4 + width - 196 - 14, par5 + 3, par6, mod_SCP.SCP015.cm); }
/*     */       
/*     */       }
/*     */     } 
/*     */     
/* 237 */     for (width = 0; width <= 224; width++) {
/*     */       
/* 239 */       if (this.pipes2[width] == 1)
/* 240 */         if (width <= 14) { par3World.e(par4 + width, par5, par6 + 14, mod_SCP.SCP015.cm); }
/* 241 */         else if (width >= 15 && width <= 29) { par3World.e(par4 + width - 14 - 1, par5 + 4, par6 + 13, mod_SCP.SCP015.cm); }
/* 242 */         else if (width >= 30 && width <= 44) { par3World.e(par4 + width - 28 - 2, par5 + 4, par6 + 12, mod_SCP.SCP015.cm); }
/* 243 */         else if (width >= 45 && width <= 59) { par3World.e(par4 + width - 42 - 3, par5 + 4, par6 + 11, mod_SCP.SCP015.cm); }
/* 244 */         else if (width >= 60 && width <= 74) { par3World.e(par4 + width - 56 - 4, par5 + 4, par6 + 10, mod_SCP.SCP015.cm); }
/* 245 */         else if (width >= 75 && width <= 89) { par3World.e(par4 + width - 70 - 5, par5 + 4, par6 + 9, mod_SCP.SCP015.cm); }
/* 246 */         else if (width >= 90 && width <= 104) { par3World.e(par4 + width - 84 - 6, par5 + 4, par6 + 8, mod_SCP.SCP015.cm); }
/* 247 */         else if (width >= 105 && width <= 119) { par3World.e(par4 + width - 98 - 7, par5 + 4, par6 + 7, mod_SCP.SCP015.cm); }
/* 248 */         else if (width >= 120 && width <= 134) { par3World.e(par4 + width - 112 - 8, par5 + 4, par6 + 6, mod_SCP.SCP015.cm); }
/* 249 */         else if (width >= 135 && width <= 149) { par3World.e(par4 + width - 126 - 9, par5 + 4, par6 + 5, mod_SCP.SCP015.cm); }
/* 250 */         else if (width >= 150 && width <= 164) { par3World.e(par4 + width - 140 - 10, par5 + 4, par6 + 4, mod_SCP.SCP015.cm); }
/* 251 */         else if (width >= 165 && width <= 179) { par3World.e(par4 + width - 154 - 11, par5 + 4, par6 + 3, mod_SCP.SCP015.cm); }
/* 252 */         else if (width >= 180 && width <= 194) { par3World.e(par4 + width - 168 - 12, par5 + 4, par6 + 2, mod_SCP.SCP015.cm); }
/* 253 */         else if (width >= 195 && width <= 209) { par3World.e(par4 + width - 182 - 13, par5 + 4, par6 + 1, mod_SCP.SCP015.cm); }
/* 254 */         else if (width >= 210 && width <= 224) { par3World.e(par4 + width - 196 - 14, par5 + 4, par6, mod_SCP.SCP015.cm); }
/*     */          
/*     */     } 
/* 257 */     for (width = 0; width <= 3; width++) {
/*     */       
/* 259 */       for (int length = 0; length <= 3; length++) {
/*     */         
/* 261 */         for (int j = 0; j <= 2; j++) {
/*     */           
/* 263 */           par3World.b(par4 + width + 5, par5 + j, par6 + length + 5, 0);
/* 264 */           par1ItemStack.a--;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 269 */     par3World.d(par4 + 2, par5 + 1, par6 - 2, mod_SCP.KeycardSlotLv2.cm, 2);
/* 270 */     par3World.d(par4 + 4, par5 + 1, par6, mod_SCP.KeycardSlotLv2.cm, 0);
/* 271 */     tx.a(par3World, par4 + 3, par5, par6 - 1, 1, amq.aO);
/* 272 */     par2EntityPlayer.b("SCP-015 Spawned. | [Type: §eEuclid§f]");
/* 273 */     par2EntityPlayer.a((jl)mod_SCP.summonSCP015Boss, 1);
/*     */     
/* 275 */     par1ItemStack.a = 0;
/* 276 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 282 */     SCPEntity015Boss var8 = new SCPEntity015Boss(par0World);
/* 283 */     var8.b(par2 + 7.0D, par4, par6 + 7.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 284 */     par0World.d((lq)var8);
/* 285 */     var8.aO();
/*     */     
/* 287 */     return (var8 != null);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem015.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */