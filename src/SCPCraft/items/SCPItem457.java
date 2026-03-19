/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.entities.SCPEntity457;
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
/*     */ public class SCPItem457
/*     */   extends SCPItemDocument
/*     */ {
/*     */   public SCPItem457(int i) {
/*  19 */     super(i);
/*  20 */     this.ck = 1;
/*  21 */     e(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  26 */     list.add("§4SCP-457");
/*  27 */     list.add("§7The Burning Man");
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
/*  65 */       par3World.a(par4 + 0.5D, par5 + 0.5D, par6 + 0.5D, "fire.ignite", 1.0F, d.nextFloat() * 0.4F + 0.8F); int m;
/*  66 */       for (m = -4; m <= 4; m++) {
/*  67 */         for (int n = 0; n <= 8; n++)
/*  68 */         { for (int b = -1; b <= 3; b++)
/*  69 */             par3World.e(par4 + m, par5 + b, par6 + n, amq.w.cm);  } 
/*  70 */       }  for (m = -3; m <= 3; m++) {
/*  71 */         for (int n = 1; n <= 7; n++)
/*  72 */         { for (int b = 0; b <= 2; b++)
/*  73 */             par3World.e(par4 + m, par5 + b, par6 + n, 0);  } 
/*  74 */       }  for (m = 1; m <= 3; m++) {
/*  75 */         for (int b = 1; b <= 2; b++)
/*  76 */           par3World.e(par4 + m, par5 + b, par6, amq.bt.cm); 
/*     */       } 
/*  78 */       for (m = 1; m <= 3; m++) {
/*  79 */         for (int n = -3; n <= 0; n++) {
/*  80 */           for (int k = 0; k <= 2; k++)
/*  81 */             par3World.e(par4 + n, par5 + k, par6 + m, amq.w.cm); 
/*     */         } 
/*  83 */       }  for (m = 1; m < 3; m++) {
/*  84 */         for (int n = -2; n < -1; n++) {
/*  85 */           for (int k = 0; k <= 1; k++)
/*  86 */             par3World.e(par4 + n, par5 + k, par6 + m, 0); 
/*     */         } 
/*  88 */       }  tx.a(par3World, par4 - 2, par5, par6, 1, amq.aO);
/*  89 */       tx.a(par3World, par4 - 2, par5, par6 + 3, 3, amq.aO);
/*  90 */       par3World.d(par4 - 1, par5 + 1, par6 + 2, mod_SCP.KeycardSlotLv3.cm, 2);
/*  91 */       par3World.e(par4, par5 + 1, par6 + 2, amq.w.cm);
/*     */       
/*  93 */       par3World.d(par4 - 3, par5 + 1, par6 - 1, mod_SCP.KeycardSlotLv3.cm, 2);
/*  94 */       par3World.d(par4 - 3, par5 + 1, par6 + 1, mod_SCP.KeycardSlotLv3.cm, 0);
/*  95 */       par3World.d(par4 - 1, par5 + 1, par6 + 4, mod_SCP.KeycardSlotLv3.cm, 0);
/*     */       
/*  97 */       par2EntityPlayer.b("SCP-457 Spawned. | [Type: §4Keter§f]");
/*     */     } 
/*     */     
/* 100 */     par2EntityPlayer.a((jl)mod_SCP.SCP457, 1);
/* 101 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 107 */     SCPEntity457 var8 = new SCPEntity457(par0World);
/* 108 */     var8.b(par2 + 2.0D, par4, par6 + 3.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 109 */     par0World.d((lq)var8);
/* 110 */     var8.aO();
/*     */     
/* 112 */     return (var8 != null);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem457.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */