/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.entities.SCPEntity629;
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
/*     */ public class SCPItem629
/*     */   extends SCPItemDocument
/*     */ {
/*     */   public SCPItem629(int i) {
/*  19 */     super(i);
/*  20 */     this.ck = 1;
/*  21 */     e(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  26 */     list.add("§2SCP-629");
/*  27 */     list.add("§7Mr. Brass");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean n_() {
/*  32 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/*  37 */     if (par3World.I)
/*     */     {
/*  39 */       return true;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  44 */     int var11 = par3World.a(par4, par5, par6);
/*  45 */     par4 += r.b[par7];
/*  46 */     par5 += r.c[par7];
/*  47 */     par6 += r.d[par7];
/*  48 */     double var12 = 0.0D;
/*     */     
/*  50 */     if ((par7 == 1 && var11 == amq.bc.cm) || var11 == amq.bE.cm)
/*     */     {
/*  52 */       var12 = 0.5D;
/*     */     }
/*     */     
/*  55 */     if (spawnCreature(par3World, par1ItemStack.j(), par4 + 0.5D, par5 + var12, par6 + 0.5D) && !par2EntityPlayer.cd.d)
/*     */     {
/*  57 */       par1ItemStack.a--;
/*     */     }
/*     */     
/*  60 */     int i = par3World.a(par4, par5, par6);
/*     */     
/*  62 */     if (i == 0) {
/*     */ 
/*     */       
/*  65 */       par3World.a(par4 + 0.5D, par5 + 0.5D, par6 + 0.5D, "fire.ignite", 1.0F, d.nextFloat() * 0.4F + 0.8F);
/*  66 */       spawnRoom(par3World, par4, par5, par6 + 4);
/*     */       
/*  68 */       par2EntityPlayer.b("SCP-629 Spawned. | [Type: §2Safe§f]");
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  75 */     par2EntityPlayer.b("§lSCP-629: §rI want arms! Give me my arms please, sir!");
/*  76 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void spawnRoom(yc par3World, int par4, int par5, int par6) {
/*     */     int m;
/*  82 */     for (m = -3; m <= 4; m++) {
/*  83 */       for (int n = -3; n <= 4; n++)
/*  84 */         par3World.e(par4 + m, par5 - 1, par6 + n, amq.w.cm); 
/*     */     } 
/*  86 */     for (m = -3; m <= 4; m++) {
/*  87 */       for (int n = -3; n <= 4; n++) {
/*  88 */         for (int b = 0; b <= 3; b++)
/*  89 */           par3World.e(par4 + m, par5 + b, par6 + n, mod_SCP.Locker.cm); 
/*     */       } 
/*  91 */     }  for (m = 1; m <= 3; m++) {
/*  92 */       for (int b = 1; b <= 2; b++)
/*  93 */         par3World.e(par4 + m, par5 + b, par6 - 3, amq.bt.cm); 
/*     */     } 
/*  95 */     for (m = -1; m <= 2; m++) {
/*  96 */       par3World.e(par4 + m, par5 + 2, par6 + 4, amq.bt.cm);
/*     */     }
/*  98 */     for (m = -2; m <= 3; m++) {
/*  99 */       for (int n = -2; n <= 3; n++) {
/* 100 */         for (int b = 0; b <= 2; b++)
/* 101 */           par3World.e(par4 + m, par5 + b, par6 + n, 0); 
/*     */       } 
/* 103 */     }  par3World.d(par4 - 2, par5 + 1, par6 - 4, mod_SCP.KeycardSlot.cm, 2);
/* 104 */     par3World.d(par4, par5 + 1, par6 - 2, mod_SCP.KeycardSlot.cm, 0);
/*     */     
/* 106 */     par3World.e(par4 - 1, par5 + 3, par6 + 2, amq.bP.cm);
/* 107 */     par3World.e(par4 + 2, par5 + 3, par6 + 2, amq.bP.cm);
/*     */     
/* 109 */     par3World.e(par4 - 1, par5 + 3, par6 - 1, amq.bP.cm);
/* 110 */     par3World.e(par4 + 2, par5 + 3, par6 - 1, amq.bP.cm);
/*     */     
/* 112 */     par3World.e(par4 + 1, par5 + 4, par6, amq.aT.cm);
/* 113 */     par3World.e(par4 + 1, par5 + 4, par6 - 1, amq.ay.cm);
/* 114 */     par3World.e(par4, par5 + 4, par6 - 1, amq.ay.cm);
/*     */     
/* 116 */     par3World.e(par4 + 1, par5 + 4, par6 + 1, amq.ay.cm);
/* 117 */     par3World.e(par4 + 1, par5 + 4, par6 + 2, amq.ay.cm);
/* 118 */     par3World.e(par4, par5 + 4, par6 + 2, amq.ay.cm);
/* 119 */     tx.a(par3World, par4 - 1, par5, par6 - 3, 1, amq.aO);
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 124 */     SCPEntity629 var8 = new SCPEntity629(par0World);
/* 125 */     var8.b(par2 + 2.0D, par4, par6 + 3.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 126 */     par0World.d((lq)var8);
/* 127 */     var8.aO();
/*     */     
/* 129 */     return (var8 != null);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem629.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */