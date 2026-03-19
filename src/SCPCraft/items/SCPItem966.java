/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.entities.SCPEntity966;
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
/*     */ public class SCPItem966
/*     */   extends SCPItemDocument
/*     */ {
/*     */   public SCPItem966(int i) {
/*  19 */     super(i);
/*  20 */     this.ck = 1;
/*  21 */     e(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  26 */     list.add("§eSCP-966");
/*  27 */     list.add("§7Sleep Killer");
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
/*  43 */     int var11 = par3World.a(par4, par5, par6);
/*  44 */     par4 += r.b[par7];
/*  45 */     par5 += r.c[par7];
/*  46 */     par6 += r.d[par7];
/*  47 */     double var12 = 0.0D;
/*     */     
/*  49 */     if ((par7 == 1 && var11 == amq.bc.cm) || var11 == amq.bE.cm)
/*     */     {
/*  51 */       var12 = 0.5D;
/*     */     }
/*     */     
/*  54 */     if (spawnCreature(par3World, par1ItemStack.j(), par4 + 0.5D, par5 + var12, par6 + 0.5D) && !par2EntityPlayer.cd.d)
/*     */     {
/*  56 */       par1ItemStack.a--;
/*     */     }
/*     */     int length;
/*  59 */     for (length = 0; length <= 9; length++) {
/*     */       
/*  61 */       for (int width = 0; width <= 9; width++) {
/*     */         
/*  63 */         for (int heigth = -1; heigth <= 6; heigth++)
/*     */         {
/*  65 */           par3World.b(par4 + width, par5 + heigth, par6 + length, mod_SCP.Locker.cm);
/*     */         }
/*     */       } 
/*     */     } 
/*  69 */     for (length = 1; length <= 8; length++) {
/*     */       
/*  71 */       for (int width = 1; width <= 8; width++) {
/*     */         
/*  73 */         for (int heigth = 0; heigth <= 5; heigth++)
/*     */         {
/*  75 */           par3World.b(par4 + width, par5 + heigth, par6 + length, 0);
/*     */         }
/*     */       } 
/*     */     } 
/*  79 */     tx.a(par3World, par4 + 4, par5, par6, 1, amq.aO);
/*  80 */     par3World.d(par4 + 3, par5 + 1, par6 - 1, mod_SCP.KeycardSlotLv2.cm, 2);
/*  81 */     par3World.d(par4 + 5, par5 + 1, par6 + 1, mod_SCP.KeycardSlotLv2.cm, 0);
/*     */     
/*  83 */     par2EntityPlayer.b("SCP-966 Spawned. | [Type: §eEuclid§f]");
/*     */ 
/*     */     
/*  86 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/*  92 */     SCPEntity966 var8 = new SCPEntity966(par0World);
/*  93 */     var8.b(par2 + 3.0D, par4, par6 + 3.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/*  94 */     par0World.d((lq)var8);
/*  95 */     var8.aO();
/*     */     
/*  97 */     SCPEntity966 var9 = new SCPEntity966(par0World);
/*  98 */     var9.b(par2 + 4.0D, par4, par6 + 4.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/*  99 */     par0World.d((lq)var9);
/* 100 */     var9.aO();
/*     */     
/* 102 */     SCPEntity966 var10 = new SCPEntity966(par0World);
/* 103 */     var10.b(par2 + 5.0D, par4, par6 + 5.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 104 */     par0World.d((lq)var10);
/* 105 */     var10.aO();
/*     */     
/* 107 */     SCPEntity966 var11 = new SCPEntity966(par0World);
/* 108 */     var11.b(par2 + 6.0D, par4, par6 + 6.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 109 */     par0World.d((lq)var11);
/* 110 */     var11.aO();
/*     */     
/* 112 */     return (var8 != null);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem966.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */