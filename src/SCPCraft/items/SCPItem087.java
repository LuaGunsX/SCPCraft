/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.entities.SCPEntity087;
/*     */ import SCPCraft.mod_SCP;
/*     */ import amq;
/*     */ import anm;
/*     */ import any;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import jl;
/*     */ import lq;
/*     */ import md;
/*     */ import qx;
/*     */ import r;
/*     */ import tx;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public class SCPItem087 extends SCPItemDocument {
/*     */   public SCPItem087(int i) {
/*  21 */     super(i);
/*  22 */     this.ck = 1;
/*  23 */     e(1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  29 */     list.add("§eSCP-087");
/*  30 */     list.add("§7The Stairwell");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean n_() {
/*  35 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/*  40 */     if (par3World.I)
/*     */     {
/*  42 */       return true;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  47 */     par2EntityPlayer.a((jl)mod_SCP.challengeaccepted, 1);
/*  48 */     int var11 = par3World.a(par4, par5, par6);
/*  49 */     par4 += r.b[par7];
/*  50 */     par5 += r.c[par7];
/*  51 */     par6 += r.d[par7];
/*  52 */     double var12 = 0.0D;
/*     */     
/*  54 */     if ((par7 == 1 && var11 == amq.bc.cm) || var11 == amq.bE.cm)
/*     */     {
/*  56 */       var12 = 0.5D;
/*     */     }
/*     */     
/*  59 */     if (spawnCreature(par3World, par1ItemStack.j(), par4 + 0.5D, par5 + var12, par6 + 0.5D) && !par2EntityPlayer.cd.d)
/*     */     {
/*  61 */       par1ItemStack.a--;
/*     */     }
/*     */     
/*  64 */     int i = par3World.a(par4, par5, par6);
/*     */     
/*  66 */     if (i == 0) {
/*     */ 
/*     */       
/*  69 */       par3World.a(par4 + 0.5D, par5 + 0.5D, par6 + 0.5D, "fire.ignite", 1.0F, d.nextFloat() * 0.4F + 0.8F);
/*  70 */       generateChamber(par3World, par4, par5 - 50, par6, par2EntityPlayer);
/*  71 */       generateStairs(par3World, par4, par5 - 8, par6);
/*  72 */       generateStairs(par3World, par4, par5 - 20, par6);
/*  73 */       generateStairs(par3World, par4, par5 - 32, par6);
/*  74 */       generateStairs(par3World, par4, par5 - 44, par6);
/*     */       
/*  76 */       par3World.d(par4 + 3, par5 - 13, par6 + 2, amq.bA.cm, 0);
/*  77 */       par3World.d(par4 + 3, par5 - 25, par6 + 2, amq.bA.cm, 0);
/*  78 */       par3World.d(par4 + 3, par5 - 37, par6 + 2, amq.bA.cm, 0);
/*  79 */       par3World.d(par4 + 3, par5 - 49, par6 + 2, amq.bA.cm, 0);
/*     */       int m;
/*  81 */       for (m = -1; m <= 8; m++) {
/*  82 */         for (int n = -1; n <= 8; n++) {
/*  83 */           for (int b = -1; b <= 6; b++)
/*  84 */             par3World.e(par4 + m, par5 + b, par6 + n, amq.bp.cm); 
/*     */         } 
/*  86 */       }  for (m = 0; m <= 7; m++) {
/*  87 */         for (int n = 0; n <= 7; n++) {
/*  88 */           for (int b = 0; b <= 5; b++)
/*  89 */             par3World.e(par4 + m, par5 + b, par6 + n, 0); 
/*     */         } 
/*  91 */       }  par3World.e(par4 + 2, par5 - 1, par6 + 3, 0);
/*  92 */       par3World.e(par4 + 2, par5 - 1, par6 + 4, 0);
/*  93 */       par3World.e(par4 + 2, par5 - 1, par6 + 5, 0);
/*     */       
/*  95 */       par3World.e(par4 + 1, par5 - 47, par6 + 2, 0);
/*  96 */       par3World.e(par4 + 1, par5 - 48, par6 + 2, 0);
/*  97 */       par3World.e(par4 + 1, par5 - 49, par6 + 2, 0);
/*  98 */       par3World.e(par4 + 1, par5 - 47, par6 + 3, 0);
/*  99 */       par3World.e(par4 + 1, par5 - 48, par6 + 3, 0);
/* 100 */       par3World.e(par4 + 1, par5 - 49, par6 + 3, 0);
/*     */       
/* 102 */       tx.a(par3World, par4 + 3, par5, par6 - 1, 1, amq.aO);
/* 103 */       par3World.d(par4 + 2, par5 + 1, par6 - 2, mod_SCP.KeycardSlotLv2.cm, 2);
/* 104 */       par3World.d(par4 + 4, par5 + 1, par6, mod_SCP.KeycardSlotLv2.cm, 0);
/*     */       
/* 106 */       anm chest = new anm();
/* 107 */       par3World.b(par4 + 2, par5, par6, amq.ax.cm);
/*     */       
/* 109 */       par3World.a(par4 + 2, par5, par6, (any)chest);
/*     */       
/* 111 */       Random randI = new Random();
/* 112 */       for (int slot = 0; slot < chest.k_(); slot++)
/*     */       {
/* 114 */         chest.a(slot, new ur(mod_SCP.CupGlowstone));
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 120 */     par1ItemStack.a(2, (md)par2EntityPlayer);
/* 121 */     return true;
/*     */   }
/*     */   
/*     */   public void generateStairs(yc world, int i, int j, int k) {
/*     */     int m;
/* 126 */     for (m = 1; m <= 7; m++) {
/* 127 */       for (int n = 1; n <= 7; n++) {
/* 128 */         for (int b = -6; b <= 7; b++)
/* 129 */           world.e(i + m, j + b, k + n, amq.bp.cm); 
/*     */       } 
/* 131 */     }  for (m = 2; m <= 6; m++) {
/* 132 */       for (int n = 2; n <= 6; n++) {
/* 133 */         for (int b = -5; b <= 6; b++)
/* 134 */           world.e(i + m, j + b, k + n, 0); 
/*     */       } 
/* 136 */     }  for (m = 2; m <= 6; m++) {
/* 137 */       for (int n = 2; n <= 6; n++)
/* 138 */         world.e(i + m, j + 7, k + n, 0); 
/*     */     } 
/* 140 */     world.e(i + 2, j + 6, k + 2, amq.bp.cm);
/* 141 */     world.d(i + 2, j + 6, k + 3, amq.bA.cm, 3);
/* 142 */     world.d(i + 2, j + 5, k + 4, amq.bA.cm, 3);
/* 143 */     world.e(i + 2, j + 6, k + 5, amq.aT.cm);
/* 144 */     world.d(i + 2, j + 4, k + 5, amq.bA.cm, 3);
/*     */     
/* 146 */     world.e(i + 2, j + 3, k + 6, amq.bp.cm);
/* 147 */     world.d(i + 3, j + 3, k + 6, amq.bA.cm, 1);
/* 148 */     world.d(i + 4, j + 2, k + 6, amq.bA.cm, 1);
/* 149 */     world.e(i + 5, j + 3, k + 6, amq.aT.cm);
/* 150 */     world.d(i + 5, j + 1, k + 6, amq.bA.cm, 1);
/*     */     
/* 152 */     world.e(i + 6, j, k + 6, amq.bp.cm);
/* 153 */     world.d(i + 6, j, k + 5, amq.bA.cm, 2);
/* 154 */     world.d(i + 6, j - 1, k + 4, amq.bA.cm, 2);
/* 155 */     world.e(i + 6, j, k + 3, amq.aT.cm);
/* 156 */     world.d(i + 6, j - 2, k + 3, amq.bA.cm, 2);
/*     */     
/* 158 */     world.e(i + 6, j - 3, k + 2, amq.bp.cm);
/* 159 */     world.d(i + 5, j - 3, k + 2, amq.bA.cm, 0);
/* 160 */     world.d(i + 4, j - 4, k + 2, amq.bA.cm, 0);
/* 161 */     world.e(i + 3, j - 3, k + 2, amq.aT.cm);
/* 162 */     world.d(i + 3, j - 5, k + 2, amq.bA.cm, 0);
/* 163 */     world.e(i + 2, j - 6, k + 2, amq.bp.cm);
/*     */   }
/*     */ 
/*     */   
/*     */   public void generateChamber(yc world, int i, int j, int k, qx entityplayer) {
/*     */     int m;
/* 169 */     for (m = -3; m <= 11; m++) {
/* 170 */       for (int n = -3; n <= 11; n++) {
/* 171 */         for (int b = 0; b <= 7; b++)
/* 172 */           world.e(i + m, j + b, k + n, amq.bp.cm); 
/*     */       } 
/* 174 */     }  for (m = -2; m <= 10; m++) {
/* 175 */       for (int n = -2; n <= 10; n++) {
/* 176 */         for (int b = 1; b <= 6; b++) {
/* 177 */           world.e(i + m, j + b, k + n, 0);
/*     */         }
/*     */       } 
/*     */     } 
/* 181 */     entityplayer.b("SCP-087 Spawned. | [Type: §eEuclid§f]");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 188 */     SCPEntity087 var8 = new SCPEntity087(par0World);
/* 189 */     var8.b(par2 + 3.0D, par4 - 9.0D, par6 + 2.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 190 */     par0World.d((lq)var8);
/* 191 */     var8.aO();
/*     */     
/* 193 */     return (var8 != null);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem087.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */