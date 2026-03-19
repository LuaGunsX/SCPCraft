/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import amq;
/*     */ import java.util.List;
/*     */ import qx;
/*     */ import r;
/*     */ import tx;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ public class SCPItem002
/*     */   extends SCPItemDocument
/*     */ {
/*     */   public SCPItem002(int i) {
/*  17 */     super(i);
/*  18 */     this.ck = 1;
/*  19 */     e(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  24 */     list.add("§eSCP-002");
/*  25 */     list.add("§7The Living Room");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean n_() {
/*  30 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/*  35 */     if (par3World.I)
/*     */     {
/*  37 */       return true;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  42 */     int var11 = par3World.a(par4, par5, par6);
/*  43 */     par4 += r.b[par7];
/*  44 */     par5 += r.c[par7];
/*  45 */     par6 += r.d[par7];
/*  46 */     double var12 = 0.0D;
/*     */     
/*  48 */     if ((par7 == 1 && var11 == amq.bc.cm) || var11 == amq.bE.cm)
/*     */     {
/*  50 */       var12 = 0.5D;
/*     */     }
/*     */     
/*  53 */     if (spawnCreature(par3World, par1ItemStack.j(), par4 + 0.5D, par5 + var12, par6 + 0.5D) && !par2EntityPlayer.cd.d)
/*     */     {
/*  55 */       par1ItemStack.a--;
/*     */     }
/*     */     
/*  58 */     sphere(par3World, par4, par5 - 1, par6, 7, mod_SCP.Locker.cm);
/*  59 */     sphere(par3World, par4, par5, par6, 6, mod_SCP.Flesh.cm);
/*     */     
/*  61 */     for (int width = -1; width <= 7; width++) {
/*     */       
/*  63 */       for (int length = 0; length <= 6; length++)
/*     */       {
/*  65 */         par3World.e(par4 + width - 2, par5 + 5, par6 + length - 2, mod_SCP.Bone.cm);
/*     */       }
/*     */     } 
/*  68 */     for (int w = 1; w <= 21; w++) {
/*     */       
/*  70 */       if (par3World.a(par4 + 1, par5 - w + 7, par6 - 5 - w) == 0) par3World.d(par4 + 1, par5 - w + 7, par6 - 5 - w, amq.bA.cm, 2); 
/*     */     } 
/*  72 */     par3World.b(par4 + 1, par5 + 5, par6 - 6, amq.bp.cm);
/*  73 */     tx.a(par3World, par4 + 1, par5 + 6, par6 - 5, 1, amq.aO);
/*     */     
/*  75 */     par3World.e(par4 + 1, par5 + 6, par6 - 6, 0);
/*  76 */     par3World.e(par4 + 1, par5 + 7, par6 - 6, 0);
/*  77 */     par3World.e(par4 + 2, par5 + 6, par6 - 6, 0);
/*  78 */     par3World.e(par4 + 2, par5 + 7, par6 - 6, 0);
/*  79 */     par3World.e(par4, par5 + 6, par6 - 6, 0);
/*  80 */     par3World.e(par4, par5 + 7, par6 - 6, 0);
/*  81 */     par3World.e(par4 + 1, par5 + 6, par6 - 4, 0);
/*  82 */     par3World.e(par4 + 1, par5 + 7, par6 - 4, 0);
/*  83 */     par3World.d(par4, par5 + 7, par6 - 6, mod_SCP.KeycardSlotLv2.cm, 2);
/*  84 */     par3World.d(par4 + 2, par5 + 7, par6 - 4, mod_SCP.KeycardSlotLv2.cm, 0);
/*  85 */     par3World.e(par4 + 2, par5 + 7, par6 - 5, mod_SCP.Locker.cm);
/*  86 */     par3World.e(par4 + 2, par5 + 6, par6 - 5, mod_SCP.Locker.cm);
/*  87 */     par3World.e(par4, par5 + 7, par6 - 5, mod_SCP.Locker.cm);
/*  88 */     par3World.e(par4, par5 + 6, par6 - 5, mod_SCP.Locker.cm);
/*     */     
/*  90 */     par3World.e(par4 + 5, par5 + 6, par6, mod_SCP.woodDesk.cm);
/*  91 */     par3World.e(par4 + 5, par5 + 6, par6 + 1, mod_SCP.woodDesk.cm);
/*  92 */     par3World.e(par4 + 5, par5 + 6, par6 + 2, mod_SCP.woodDesk.cm);
/*  93 */     par3World.e(par4 + 5, par5 + 7, par6 + 2, amq.aT.cm);
/*  94 */     par3World.d(par4 + 5, par5 + 7, par6, amq.cf.cm, 2);
/*  95 */     par3World.d(par4 + 4, par5 + 6, par6 + 1, mod_SCP.woodenChair.cm, 0);
/*  96 */     par3World.e(par4 + 2, par5 + 6, par6 + 5, amq.ax.cm);
/*  97 */     par3World.e(par4 + 1, par5 + 6, par6 + 5, amq.ax.cm);
/*  98 */     par3World.d(par4, par5 + 6, par6 + 5, amq.bV.cm, 2);
/*     */     
/* 100 */     par2EntityPlayer.b("SCP-002 Spawned. | [Type: §eEuclid§f]");
/*     */     
/* 102 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void sphere(yc par1World, int par3, int par4, int par5, int var7, int b) {
/* 109 */     int n = var7;
/* 110 */     int midX = (int)Math.floor(Math.IEEEremainder(1.0D, 10.0D));
/* 111 */     int midZ = (int)Math.floor(Math.IEEEremainder(1.0D, 10.0D)); int m;
/* 112 */     for (m = 1; m <= var7; ) { circle(par1World, par3 + midX, par4 + m, par5 + midZ, m, b); m++; }
/* 113 */      for (m = var7 + 1; m <= var7 * 2; ) { circle(par1World, par3 + midX, par4 + m, par5 + midZ, n, b); n--; m++; }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void circle(yc par1World, int par3, int par4, int par5, int var7, int block) {
/*     */     int var8;
/* 123 */     for (var8 = par4; var8 < par4 + 1 && var8 < 128; var8++) {
/*     */       
/* 125 */       for (int var9 = par3 - var7; var9 <= par3 + var7; var9++) {
/*     */         
/* 127 */         for (int var10 = par5 - var7; var10 <= par5 + var7; var10++) {
/*     */           
/* 129 */           int var11 = var9 - par3;
/* 130 */           int var12 = var10 - par5;
/*     */           
/* 132 */           if (var11 * var11 + var12 * var12 <= var7 * var7 + 1)
/*     */           {
/* 134 */             par1World.e(var9, var8, var10, block);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 140 */     for (var8 = par4; var8 < par4 + 1 && var8 < 128; var8++) {
/*     */       
/* 142 */       for (int var9 = par3 - var7 - 1; var9 <= par3 + var7 - 1; var9++) {
/*     */         
/* 144 */         for (int var10 = par5 - var7 - 1; var10 <= par5 + var7 - 1; var10++) {
/*     */           
/* 146 */           int var11 = var9 - par3;
/* 147 */           int var12 = var10 - par5;
/*     */           
/* 149 */           if (var11 * var11 + var12 * var12 <= var7 * var7 - 2 * var7)
/*     */           {
/* 151 */             par1World.e(var9, var8, var10, 0);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 160 */     return false;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem002.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */