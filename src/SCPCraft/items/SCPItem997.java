/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.entities.SCPEntity997;
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
/*     */ public class SCPItem997
/*     */   extends SCPItemDocument
/*     */ {
/*     */   public SCPItem997(int i) {
/*  19 */     super(i);
/*  20 */     this.ck = 1;
/*  21 */     e(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  26 */     list.add("§2SCP-997");
/*  27 */     list.add("§7Vermin Supressor");
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
/*  57 */       par1ItemStack.a = 0;
/*     */     }
/*  59 */     par1ItemStack.a = 0;
/*     */     
/*  61 */     par3World.a(par4 + 0.5D, par5 + 0.5D, par6 + 0.5D, "fire.ignite", 1.0F, d.nextFloat() * 0.4F + 0.8F);
/*     */     int length;
/*  63 */     for (length = -1; length <= 5; length++) {
/*     */       
/*  65 */       for (int width = -1; width <= 5; width++) {
/*     */         
/*  67 */         for (int heigth = -1; heigth <= 4; heigth++)
/*     */         {
/*  69 */           par3World.b(par4 + width, par5 + heigth, par6 + length, mod_SCP.GrateBlock.cm);
/*     */         }
/*     */       } 
/*     */     } 
/*  73 */     for (length = 0; length <= 4; length++) {
/*     */       
/*  75 */       for (int width = 0; width <= 4; width++) {
/*     */         
/*  77 */         for (int heigth = 0; heigth <= 3; heigth++)
/*     */         {
/*  79 */           par3World.b(par4 + width, par5 + heigth, par6 + length, 0);
/*     */         }
/*     */       } 
/*     */     } 
/*  83 */     tx.a(par3World, par4 + 2, par5, par6 - 1, 1, amq.aO);
/*  84 */     par3World.d(par4 + 1, par5 + 1, par6 - 2, mod_SCP.KeycardSlot.cm, 2);
/*  85 */     par3World.d(par4 + 3, par5 + 1, par6, mod_SCP.KeycardSlot.cm, 0);
/*     */     
/*  87 */     par3World.b(par4 + 2, par5, par6 + 2, amq.w.cm);
/*  88 */     par2EntityPlayer.b("SCP-997 Spawned. | [Type: §2Safe§f]");
/*     */ 
/*     */ 
/*     */     
/*  92 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/*  99 */     SCPEntity997 var8 = new SCPEntity997(par0World);
/* 100 */     var8.b(par2 + 2.0D, par4 + 1.0D, par6 + 2.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 101 */     par0World.d((lq)var8);
/* 102 */     var8.aO();
/*     */     
/* 104 */     return (var8 != null);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem997.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */