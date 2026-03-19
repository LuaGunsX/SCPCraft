/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.entities.SCPEntity053;
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
/*     */ 
/*     */ public class SCPItem053
/*     */   extends SCPItemDocument
/*     */ {
/*     */   public SCPItem053(int i) {
/*  20 */     super(i);
/*  21 */     this.ck = 1;
/*  22 */     e(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  27 */     list.add("§eSCP-053");
/*  28 */     list.add("§7Young Girl");
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
/*     */     int width;
/*  61 */     for (width = -1; width <= 6; width++) {
/*     */       
/*  63 */       for (int height = -1; height <= 6; height++) {
/*     */         
/*  65 */         for (int length = -1; length <= 6; length++)
/*     */         {
/*  67 */           par3World.d(par4 + length, par5 + height, par6 + width, amq.ae.cm, 0);
/*     */         }
/*     */       } 
/*     */     } 
/*  71 */     for (width = 0; width <= 5; width++) {
/*     */       
/*  73 */       for (int height = 0; height <= 5; height++) {
/*     */         
/*  75 */         for (int length = 0; length <= 5; length++)
/*     */         {
/*  77 */           par3World.d(par4 + length, par5 + height, par6 + width, 0, 0);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  82 */     par3World.d(par4 + 3, par5 + 1, par6 - 2, mod_SCP.KeycardSlotLv2.cm, 2);
/*  83 */     par3World.d(par4 + 5, par5 + 1, par6, mod_SCP.KeycardSlotLv2.cm, 0);
/*  84 */     tx.a(par3World, par4 + 4, par5, par6 - 1, 1, amq.aO);
/*  85 */     par3World.b(par4 + 2, par5 + 1, par6 - 1, amq.bt.cm);
/*  86 */     par3World.b(par4 + 1, par5 + 1, par6 - 1, amq.bt.cm);
/*  87 */     par3World.b(par4, par5 + 1, par6 - 1, amq.bt.cm);
/*  88 */     par3World.b(par4 + 2, par5 + 2, par6 - 1, amq.bt.cm);
/*  89 */     par3World.b(par4 + 1, par5 + 2, par6 - 1, amq.bt.cm);
/*  90 */     par3World.b(par4, par5 + 2, par6 - 1, amq.bt.cm);
/*     */     
/*  92 */     par2EntityPlayer.b("SCP-053 Spawned. | [Type: §eEuclid§f]");
/*     */ 
/*     */     
/*  95 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ur itemstack, yc world, lq entity, int i, boolean flag) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 105 */     SCPEntity053 var8 = new SCPEntity053(par0World);
/* 106 */     var8.b(par2 + 2.0D, par4, par6 + 2.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 107 */     par0World.d((lq)var8);
/* 108 */     var8.aO();
/*     */     
/* 110 */     return (var8 != null);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem053.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */