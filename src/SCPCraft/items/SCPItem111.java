/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.entities.SCPEntity111;
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
/*     */ public class SCPItem111
/*     */   extends SCPItemDocument
/*     */ {
/*     */   public SCPItem111(int i) {
/*  18 */     super(i);
/*  19 */     this.ck = 1;
/*  20 */     e(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  25 */     list.add("§2SCP-111");
/*  26 */     list.add("§7Dragon Snail");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean n_() {
/*  31 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/*  36 */     if (par3World.I)
/*     */     {
/*  38 */       return true;
/*     */     }
/*     */ 
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
/*     */ 
/*     */     
/*  60 */     par3World.a(par4 + 0.5D, par5 + 0.5D, par6 + 0.5D, "fire.ignite", 1.0F, d.nextFloat() * 0.4F + 0.8F);
/*     */     
/*  62 */     for (int j = -3; j <= 3; j++) {
/*  63 */       for (int k = 0; k <= 7; k++) {
/*  64 */         for (int n = 0; n <= 4; n++)
/*  65 */           par3World.e(par4 + j, par5 + n, par6 + k, amq.P.cm); 
/*     */       } 
/*  67 */     }  for (int m = -2; m <= 2; m++) {
/*  68 */       for (int n = 1; n <= 6; n++) {
/*  69 */         for (int b = 0; b <= 3; b++)
/*  70 */           par3World.e(par4 + m, par5 + b, par6 + n, 0); 
/*     */       } 
/*  72 */     }  par3World.e(par4 - 2, par5 + 2, par6, amq.al.cm);
/*  73 */     par3World.e(par4 - 2, par5 + 2, par6 + 1, amq.at.cm);
/*     */     
/*  75 */     for (int i = -3; i <= 3; i++) {
/*  76 */       for (int k = 0; k <= 7; k++)
/*  77 */         par3World.e(par4 + i, par5 - 1, par6 + k, amq.x.cm); 
/*     */     } 
/*  79 */     tx.a(par3World, par4 - 2, par5, par6, 1, amq.aH);
/*     */     
/*  81 */     par2EntityPlayer.b("SCP-111 Spawned. | [Type: §2Safe§f]");
/*     */ 
/*     */ 
/*     */ 
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
/*  95 */     SCPEntity111 var8 = new SCPEntity111(par0World);
/*  96 */     var8.b(par2 + 2.0D, par4, par6 + 3.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/*  97 */     par0World.d((lq)var8);
/*  98 */     var8.aO();
/*     */     
/* 100 */     return (var8 != null);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem111.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */