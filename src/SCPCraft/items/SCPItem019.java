/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.entities.SCPEntity019n2;
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
/*     */ public class SCPItem019
/*     */   extends SCPItemDocument
/*     */ {
/*     */   public SCPItem019(int i) {
/*  19 */     super(i);
/*  20 */     this.ck = 1;
/*  21 */     e(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  26 */     list.add("§4SCP-019");
/*  27 */     list.add("§7The Monster Pot");
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
/*  55 */     if (spawnCreature(par3World, par1ItemStack.j(), par4 + 0.5D, par5 + var12, par6 + 2.5D) && !par2EntityPlayer.cd.d)
/*     */     {
/*  57 */       par1ItemStack.a--;
/*     */     }
/*     */ 
/*     */     
/*  61 */     par3World.a(par4 + 0.5D, par5 + 0.5D, par6 + 0.5D, "fire.ignite", 1.0F, d.nextFloat() * 0.4F + 0.8F);
/*  62 */     spawnRoom(par3World, par4, par5, par6 + 4);
/*  63 */     par3World.e(par4, par5, par6 + 4, mod_SCP.SCP019.cm);
/*     */     
/*  65 */     par2EntityPlayer.b("SCP-019 Spawned. | [Type: §4Keter§f]");
/*     */ 
/*     */ 
/*     */     
/*  69 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void spawnRoom(yc par3World, int par4, int par5, int par6) {
/*     */     int m;
/*  75 */     for (m = -3; m <= 3; m++) {
/*  76 */       for (int n = -3; n <= 3; n++)
/*  77 */         par3World.e(par4 + m, par5 - 1, par6 + n, amq.w.cm); 
/*     */     } 
/*  79 */     for (m = -3; m <= 3; m++) {
/*  80 */       for (int n = -3; n <= 3; n++) {
/*  81 */         for (int b = 0; b <= 3; b++)
/*  82 */           par3World.e(par4 + m, par5 + b, par6 + n, amq.w.cm); 
/*     */       } 
/*  84 */     }  for (m = -2; m <= 2; m++) {
/*  85 */       for (int n = -2; n <= 2; n++) {
/*  86 */         for (int b = 0; b <= 2; b++)
/*  87 */           par3World.e(par4 + m, par5 + b, par6 + n, 0); 
/*     */       } 
/*  89 */     }  par3World.d(par4 - 2, par5 + 1, par6 - 4, mod_SCP.KeycardSlotLv3.cm, 2);
/*  90 */     par3World.d(par4, par5 + 1, par6 - 2, mod_SCP.KeycardSlotLv3.cm, 0);
/*  91 */     tx.a(par3World, par4 - 1, par5, par6 - 3, 1, amq.aO);
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/*  96 */     SCPEntity019n2 var8 = new SCPEntity019n2(par0World);
/*  97 */     var8.b(par2, par4, par6, par0World.t.nextFloat() * 360.0F, 0.0F);
/*  98 */     par0World.d((lq)var8);
/*  99 */     var8.aO();
/*     */     
/* 101 */     return (var8 != null);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem019.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */