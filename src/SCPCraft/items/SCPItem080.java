/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.entities.SCPEntity080;
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
/*     */ public class SCPItem080
/*     */   extends SCPItemDocument
/*     */ {
/*     */   public SCPItem080(int i) {
/*  19 */     super(i);
/*  20 */     this.ck = 1;
/*  21 */     e(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  26 */     list.add("§eSCP-080");
/*  27 */     list.add("§7The Boogieman");
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
/*     */     int height;
/*  62 */     for (height = -1; height <= 3; height++) {
/*  63 */       for (int length = -1; length <= 4; length++) {
/*  64 */         for (int width = -1; width <= 4; width++)
/*     */         {
/*  66 */           par3World.d(par4 + length, par5 + height, par6 + width, amq.al.cm, 0); } 
/*     */       } 
/*     */     } 
/*  69 */     for (height = 0; height <= 2; height++) {
/*  70 */       for (int length = 0; length <= 3; length++) {
/*  71 */         for (int width = 0; width <= 3; width++)
/*     */         {
/*  73 */           par3World.d(par4 + length, par5 + height, par6 + width, 0, 0); } 
/*     */       } 
/*     */     } 
/*  76 */     par3World.e(par4 + 2, par5, par6 + 2, amq.aT.cm);
/*     */     
/*  78 */     par3World.d(par4 + 1, par5 + 1, par6 - 2, mod_SCP.KeycardSlotLv2.cm, 2);
/*  79 */     par3World.d(par4 + 3, par5 + 1, par6, mod_SCP.KeycardSlotLv2.cm, 0);
/*  80 */     tx.a(par3World, par4 + 2, par5, par6 - 1, 1, amq.aO);
/*     */ 
/*     */ 
/*     */     
/*  84 */     par2EntityPlayer.b("SCP-080 Spawned. | [Type: §eEuclid§f]");
/*     */ 
/*     */ 
/*     */     
/*  88 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/*  95 */     SCPEntity080 var8 = new SCPEntity080(par0World);
/*  96 */     var8.b(par2 + 3.0D, par4 + 1.0D, par6 + 2.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/*  97 */     par0World.d((lq)var8);
/*  98 */     var8.aO();
/*     */     
/* 100 */     return (var8 != null);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem080.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */