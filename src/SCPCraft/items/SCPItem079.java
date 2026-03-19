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
/*     */ public class SCPItem079
/*     */   extends SCPItemDocument
/*     */ {
/*     */   public SCPItem079(int i) {
/*  17 */     super(i);
/*  18 */     this.ck = 1;
/*  19 */     e(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  24 */     list.add("§eSCP-079");
/*  25 */     list.add("§7Old AI");
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
/*     */     int height;
/*  58 */     for (height = -1; height <= 5; height++) {
/*  59 */       for (int length = -1; length <= 9; length++) {
/*  60 */         for (int width = -1; width <= 9; width++)
/*     */         {
/*  62 */           par3World.d(par4 + length, par5 + height, par6 + width, amq.al.cm, 0); } 
/*     */       } 
/*  64 */     }  for (height = 0; height <= 4; height++) {
/*  65 */       for (int length = 0; length <= 8; length++) {
/*  66 */         for (int width = 0; width <= 8; width++)
/*     */         {
/*  68 */           par3World.d(par4 + length, par5 + height, par6 + width, 0, 0); } 
/*     */       } 
/*     */     } 
/*     */     int heigth;
/*  72 */     for (heigth = 0; heigth <= 4; heigth++) {
/*     */       
/*  74 */       for (int length = -2; length <= 3; length++) {
/*     */         
/*  76 */         for (int width = -1; width <= 3; width++)
/*     */         {
/*  78 */           par3World.d(par4 + length + 5, par5 + heigth, par6 + width + 5, amq.bs.cm, 0);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  83 */     for (heigth = 0; heigth <= 4; heigth++) {
/*     */       
/*  85 */       for (int length = -1; length <= 3; length++) {
/*     */         
/*  87 */         for (int width = 0; width <= 3; width++)
/*     */         {
/*  89 */           par3World.d(par4 + length + 5, par5 + heigth, par6 + width + 5, 0, 0);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  94 */     par3World.d(par4 + 6, par5 + 1, par6 + 7, mod_SCP.SCP079.cm, 0);
/*  95 */     tx.a(par3World, par4 + 4, par5, par6 - 1, 1, amq.aO);
/*  96 */     par3World.d(par4 + 3, par5 + 1, par6 - 2, mod_SCP.KeycardSlotLv2.cm, 2);
/*  97 */     par3World.d(par4 + 5, par5 + 1, par6, mod_SCP.KeycardSlotLv2.cm, 0);
/*     */     
/*  99 */     SCPItemSlideDoor.placeDoorBlock(par3World, par4 + 6, par5, par6 + 4, 3);
/* 100 */     par3World.b(par4 + 5, par5, par6 + 4, amq.al.cm);
/* 101 */     par3World.b(par4 + 5, par5 + 1, par6 + 4, amq.al.cm);
/* 102 */     par3World.d(par4 + 5, par5 + 1, par6 + 3, amq.aU.cm, 4);
/* 103 */     par3World.b(par4 + 4, par5 + 1, par6 + 4, amq.bs.cm);
/*     */     
/* 105 */     par3World.b(par4 + 6, par5, par6 + 7, amq.al.cm);
/* 106 */     par3World.b(par4 + 7, par5, par6 + 7, amq.al.cm);
/* 107 */     par3World.b(par4 + 5, par5, par6 + 7, amq.al.cm);
/* 108 */     par3World.b(par4 + 6, par5, par6 + 6, amq.al.cm);
/* 109 */     par3World.b(par4 + 7, par5, par6 + 6, amq.al.cm);
/* 110 */     par3World.b(par4 + 5, par5, par6 + 6, amq.al.cm);
/*     */     
/* 112 */     int i = par3World.a(par4, par5, par6);
/* 113 */     par1ItemStack.a--;
/* 114 */     par2EntityPlayer.b("SCP-079 Spawned. | [Type: §eEuclid§f]");
/*     */     
/* 116 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 122 */     return false;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem079.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */