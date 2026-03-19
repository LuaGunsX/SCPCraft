/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import amq;
/*     */ import java.util.List;
/*     */ import ke;
/*     */ import qx;
/*     */ import r;
/*     */ import tx;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ public class SCPItem151
/*     */   extends SCPItemDocument
/*     */ {
/*     */   public SCPItem151(int i) {
/*  18 */     super(i);
/*  19 */     this.ck = 1;
/*  20 */     e(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  25 */     list.add("§eSCP-151");
/*  26 */     list.add("§7The Painting");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean n_() {
/*  31 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/*  36 */     int v = determineOrientation(par3World, par4, par5, par6, par2EntityPlayer);
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
/*  54 */     par1ItemStack.a--;
/*     */ 
/*     */     
/*  57 */     par3World.a(par4 + 0.5D, par5 + 0.5D, par6 + 0.5D, "fire.ignite", 1.0F, d.nextFloat() * 0.4F + 0.8F);
/*     */     int width;
/*  59 */     for (width = -1; width <= 6; width++) {
/*     */       
/*  61 */       for (int length = -1; length <= 5; length++) {
/*     */         
/*  63 */         for (int height = -1; height <= 4; height++)
/*     */         {
/*  65 */           par3World.b(par4 + width, par5 + height, par6 + length, amq.ae.cm);
/*     */         }
/*     */       } 
/*     */     } 
/*  69 */     for (width = 0; width <= 5; width++) {
/*     */       
/*  71 */       for (int length = 0; length <= 4; length++) {
/*     */         
/*  73 */         for (int height = 0; height <= 3; height++)
/*     */         {
/*  75 */           par3World.b(par4 + width, par5 + height, par6 + length, 0);
/*     */         }
/*     */       } 
/*     */     } 
/*  79 */     par3World.d(par4 + 1, par5 + 1, par6 - 2, mod_SCP.KeycardSlotLv2.cm, 2);
/*  80 */     par3World.d(par4 + 3, par5 + 1, par6, mod_SCP.KeycardSlotLv2.cm, 0);
/*     */     
/*  82 */     tx.a(par3World, par4 + 2, par5, par6 - 1, 1, amq.aO);
/*     */     
/*  84 */     par3World.c(par4 + 3, par5, par6 + 4, mod_SCP.SCP151.cm, 3);
/*     */     
/*  86 */     par2EntityPlayer.b("SCP-151 Spawned. | [Type: §eEuclid§f]");
/*     */ 
/*     */ 
/*     */     
/*  90 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static int determineOrientation(yc par0World, int par1, int par2, int par3, qx par4EntityPlayer) {
/*  96 */     if (ke.e((float)par4EntityPlayer.t - par1) < 2.0F && ke.e((float)par4EntityPlayer.v - par3) < 2.0F) {
/*     */       
/*  98 */       double var5 = par4EntityPlayer.u + 1.82D - par4EntityPlayer.M;
/*     */       
/* 100 */       if (var5 - par2 > 2.0D)
/*     */       {
/* 102 */         return 1;
/*     */       }
/*     */       
/* 105 */       if (par2 - var5 > 0.0D)
/*     */       {
/* 107 */         return 0;
/*     */       }
/*     */     } 
/*     */     
/* 111 */     int var7 = ke.c((par4EntityPlayer.z * 4.0F / 360.0F) + 0.5D) & 0x3;
/* 112 */     return (var7 == 0) ? 2 : ((var7 == 1) ? 5 : ((var7 == 2) ? 3 : ((var7 == 3) ? 4 : 0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 117 */     return false;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem151.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */