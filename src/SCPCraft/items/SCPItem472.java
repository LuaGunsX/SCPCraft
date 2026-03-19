/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.entities.SCPEntity472;
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
/*     */ public class SCPItem472
/*     */   extends SCPItemDocument
/*     */ {
/*     */   public SCPItem472(int i) {
/*  19 */     super(i);
/*  20 */     this.ck = 1;
/*  21 */     e(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  26 */     list.add("§eSCP-472");
/*  27 */     list.add("§7The Bloodstone");
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
/*     */     
/*  61 */     par3World.a(par4 + 0.5D, par5 + 0.5D, par6 + 0.5D, "fire.ignite", 1.0F, d.nextFloat() * 0.4F + 0.8F);
/*     */     int width;
/*  63 */     for (width = -1; width <= 15; width++) {
/*     */       
/*  65 */       for (int length = -1; length <= 15; length++) {
/*     */         
/*  67 */         for (int height = -1; height <= 4; height++)
/*     */         {
/*  69 */           par3World.b(par4 + width, par5 + height, par6 + length, amq.bp.cm);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  74 */     for (width = 0; width <= 14; width++) {
/*     */       
/*  76 */       for (int length = 0; length <= 14; length++) {
/*     */         
/*  78 */         for (int height = 0; height <= 3; height++)
/*     */         {
/*  80 */           par3World.b(par4 + width, par5 + height, par6 + length, 0);
/*     */         }
/*     */       } 
/*     */     } 
/*  84 */     for (width = -1; width <= 13; width++) {
/*     */       
/*  86 */       for (int length = -1; length <= 13; length++)
/*     */       {
/*  88 */         par3World.b(par4 + width + 1, par5 + 4, par6 + length + 1, amq.bg.cm);
/*     */       }
/*     */     } 
/*     */     
/*  92 */     par3World.d(par4 + 5, par5 + 1, par6 - 2, mod_SCP.KeycardSlotLv2.cm, 2);
/*  93 */     par3World.d(par4 + 7, par5 + 1, par6, mod_SCP.KeycardSlotLv2.cm, 0);
/*     */     
/*  95 */     tx.a(par3World, par4 + 6, par5, par6 - 1, 1, amq.aO);
/*     */     
/*  97 */     par2EntityPlayer.b("SCP-472 Spawned. | [Type: §eEuclid§f]");
/*     */ 
/*     */ 
/*     */     
/* 101 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 107 */     SCPEntity472 var8 = new SCPEntity472(par0World);
/* 108 */     var8.b(par2 + 7.0D, par4, par6 + 8.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 109 */     par0World.d((lq)var8);
/* 110 */     var8.aO();
/*     */     
/* 112 */     return (var8 != null);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem472.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */