/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.entities.SCPEntity073;
/*     */ import SCPCraft.mod_SCP;
/*     */ import amq;
/*     */ import java.util.List;
/*     */ import jl;
/*     */ import lq;
/*     */ import qx;
/*     */ import r;
/*     */ import tx;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public class SCPItem073
/*     */   extends SCPItemDocument
/*     */ {
/*     */   public SCPItem073(int i) {
/*  19 */     super(i);
/*  20 */     this.ck = 1;
/*  21 */     e(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  26 */     list.add("§eSCP-073");
/*  27 */     list.add("§7Cain");
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
/*     */     int height;
/*  60 */     for (height = -1; height <= 3; height++) {
/*  61 */       for (int length = -1; length <= 6; length++) {
/*  62 */         for (int width = -1; width <= 6; width++)
/*     */         {
/*  64 */           par3World.d(par4 + length, par5 + height, par6 + width, mod_SCP.Locker.cm, 0); } 
/*     */       } 
/*  66 */     }  for (height = 0; height <= 2; height++) {
/*  67 */       for (int length = 0; length <= 5; length++) {
/*  68 */         for (int width = 0; width <= 5; width++)
/*     */         {
/*  70 */           par3World.d(par4 + length, par5 + height, par6 + width, 0, 0); } 
/*     */       } 
/*  72 */     }  int heigth; for (heigth = -1; heigth <= 3; heigth++) {
/*  73 */       for (int length = -1; length <= 4; length++) {
/*  74 */         for (int width = -1; width <= 4; width++)
/*     */         {
/*  76 */           par3World.b(par4 + length - 5, par5 + heigth, par6 + width + 1, mod_SCP.Locker.cm); } 
/*     */       } 
/*  78 */     }  for (heigth = 0; heigth <= 2; heigth++) {
/*  79 */       for (int length = 0; length <= 3; length++) {
/*  80 */         for (int width = 0; width <= 3; width++)
/*     */         {
/*  82 */           par3World.d(par4 + length - 5, par5 + heigth, par6 + width + 1, 0, 0); } 
/*     */       } 
/*     */     } 
/*  85 */     par3World.d(par4 + 2, par5 + 1, par6 - 2, mod_SCP.KeycardSlotLv2.cm, 2);
/*  86 */     par3World.d(par4 + 4, par5 + 1, par6, mod_SCP.KeycardSlotLv2.cm, 0);
/*  87 */     tx.a(par3World, par4 + 3, par5, par6 - 1, 1, amq.aO);
/*  88 */     par3World.b(par4 - 1, par5, par6 + 2, 0);
/*  89 */     par3World.b(par4 - 1, par5 + 1, par6 + 2, 0);
/*  90 */     par3World.c(par4 - 5, par5, par6 + 3, mod_SCP.Toilet.cm, 2);
/*  91 */     par3World.b(par4 - 4, par5 + 3, par6 + 3, amq.bg.cm);
/*  92 */     par3World.b(par4 - 4, par5 + 3, par6 + 3, amq.bg.cm);
/*  93 */     par3World.b(par4 - 3, par5 + 3, par6 + 2, amq.bg.cm);
/*  94 */     par3World.b(par4 - 3, par5 + 3, par6 + 2, amq.bg.cm);
/*  95 */     par3World.b(par4 + 3, par5 + 3, par6 + 3, amq.bg.cm);
/*  96 */     par3World.b(par4 + 3, par5 + 3, par6 + 3, amq.bg.cm);
/*  97 */     par3World.b(par4 + 2, par5 + 3, par6 + 2, amq.bg.cm);
/*  98 */     par3World.b(par4 + 2, par5 + 3, par6 + 2, amq.bg.cm);
/*     */     
/* 100 */     par2EntityPlayer.b("SCP-073 Spawned. | [Type: §eEuclid§f]");
/*     */ 
/*     */ 
/*     */     
/* 104 */     par2EntityPlayer.a((jl)mod_SCP.CainWin, 1);
/* 105 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 111 */     SCPEntity073 var8 = new SCPEntity073(par0World);
/* 112 */     var8.b(par2 + 3.0D, par4 + 1.0D, par6 + 3.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 113 */     par0World.d((lq)var8);
/* 114 */     var8.aO();
/*     */     
/* 116 */     return (var8 != null);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem073.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */