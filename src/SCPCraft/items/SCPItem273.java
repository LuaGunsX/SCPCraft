/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.entities.SCPEntity273;
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
/*     */ public class SCPItem273
/*     */   extends SCPItemDocument
/*     */ {
/*     */   public SCPItem273(int i) {
/*  20 */     super(i);
/*  21 */     this.ck = 1;
/*  22 */     e(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  27 */     list.add("§eSCP-273");
/*  28 */     list.add("§7Human Phoenix");
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
/*     */ 
/*     */     
/*  62 */     par3World.a(par4 + 0.5D, par5 + 0.5D, par6 + 0.5D, "fire.ignite", 1.0F, d.nextFloat() * 0.4F + 0.8F);
/*     */     int width;
/*  64 */     for (width = -1; width <= 5; width++) {
/*     */       
/*  66 */       for (int length = -1; length <= 11; length++) {
/*     */         
/*  68 */         for (int height = -1; height <= 4; height++)
/*     */         {
/*  70 */           par3World.b(par4 + width, par5 + height, par6 + length, mod_SCP.Granite.cm);
/*     */         }
/*     */       } 
/*     */     } 
/*  74 */     for (width = 0; width <= 4; width++) {
/*     */       
/*  76 */       for (int length = 0; length <= 10; length++) {
/*     */         
/*  78 */         for (int height = 0; height <= 3; height++)
/*     */         {
/*  80 */           par3World.b(par4 + width, par5 + height, par6 + length, 0);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  85 */     for (width = -1; width <= 5; width++) {
/*     */       
/*  87 */       for (int height = -1; height <= 4; height++)
/*     */       {
/*  89 */         par3World.b(par4 + width, par5 + height, par6 + 5, mod_SCP.Granite.cm);
/*     */       }
/*     */     } 
/*  92 */     for (width = 0; width <= 4; width++) {
/*     */       
/*  94 */       for (int height = 0; height <= 3; height++)
/*     */       {
/*  96 */         par3World.b(par4 + width, par5 + height, par6 + 5, amq.bt.cm);
/*     */       }
/*     */     } 
/*     */     
/* 100 */     tx.a(par3World, par4 + 2, par5, par6 - 1, 1, amq.aO);
/*     */     
/* 102 */     par3World.d(par4 + 3, par5 + 1, par6 - 2, mod_SCP.KeycardSlotLv2.cm, 2);
/* 103 */     par3World.d(par4 + 1, par5 + 1, par6, mod_SCP.KeycardSlotLv2.cm, 0);
/*     */     
/* 105 */     par2EntityPlayer.b("SCP-273 Spawned. | [Type: §eEuclid§f]");
/*     */ 
/*     */ 
/*     */     
/* 109 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ur itemstack, yc world, lq entity, int i, boolean flag) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 119 */     SCPEntity273 var8 = new SCPEntity273(par0World);
/* 120 */     var8.b(par2 + 2.0D, par4, par6 + 7.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 121 */     par0World.d((lq)var8);
/* 122 */     var8.aO();
/*     */     
/* 124 */     return (var8 != null);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem273.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */