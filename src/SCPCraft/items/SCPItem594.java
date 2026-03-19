/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.entities.SCPEntity594;
/*     */ import amq;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import lq;
/*     */ import qx;
/*     */ import r;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ public class SCPItem594
/*     */   extends SCPItemDocument
/*     */ {
/*     */   public SCPItem594(int i) {
/*  18 */     super(i);
/*  19 */     this.ck = 1;
/*  20 */     e(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  25 */     list.add("§eSCP-594");
/*  26 */     list.add("§7Electric Sheep");
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
/*     */     int length;
/*  58 */     for (length = 0; length <= 6; length++) {
/*     */       
/*  60 */       for (int width = 0; width <= 6; width++)
/*     */       {
/*  62 */         par3World.b(par4 + width, par5, par6 + length, amq.bc.cm);
/*     */       }
/*     */     } 
/*     */     
/*  66 */     for (length = 1; length <= 5; length++) {
/*     */       
/*  68 */       for (int width = 1; width <= 5; width++) {
/*     */         
/*  70 */         par3World.b(par4 + width, par5, par6 + length, 0);
/*     */         
/*  72 */         Random rand = new Random();
/*  73 */         if (rand.nextInt(3) == 0)
/*     */         {
/*  75 */           par3World.c(par4 + width, par5, par6 + length, amq.aa.cm, 3);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  80 */     for (length = 0; length <= 6; length++) {
/*     */       
/*  82 */       for (int width = 0; width <= 6; width++)
/*     */       {
/*  84 */         par3World.b(par4 + width, par5 - 1, par6 + length, amq.x.cm);
/*     */       }
/*     */     } 
/*     */     
/*  88 */     par3World.e(par4 + 3, par5, par6, amq.by.cm);
/*     */     
/*  90 */     par2EntityPlayer.b("SCP-594 Spawned. | [Type: §eEuclid§f]");
/*     */ 
/*     */ 
/*     */     
/*  94 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 100 */     SCPEntity594 SCPEntity594 = new SCPEntity594(par0World);
/* 101 */     SCPEntity594 var9 = new SCPEntity594(par0World);
/*     */     
/* 103 */     SCPEntity594.b(par2 + 2.0D, par4 + 1.0D, par6 + 2.0D);
/* 104 */     par0World.h((lq)SCPEntity594);
/*     */     
/* 106 */     var9.b(par2 + 4.0D, par4 + 1.0D, par6 + 4.0D);
/* 107 */     par0World.h((lq)var9);
/*     */     
/* 109 */     par0World.d((lq)var9);
/* 110 */     var9.aO();
/*     */     
/* 112 */     par0World.d((lq)SCPEntity594);
/* 113 */     SCPEntity594.aO();
/*     */     
/* 115 */     return (SCPEntity594 != null);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem594.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */