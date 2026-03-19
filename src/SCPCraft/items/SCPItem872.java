/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.entities.SCPEntity872;
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
/*     */ public class SCPItem872
/*     */   extends SCPItemDocument
/*     */ {
/*     */   public SCPItem872(int i) {
/*  18 */     super(i);
/*  19 */     this.ck = 1;
/*  20 */     e(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  25 */     list.add("§2SCP-872");
/*  26 */     list.add("§7The Tattered Farmer");
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
/*  58 */     for (length = 0; length <= 30; length++) {
/*     */       
/*  60 */       for (int width = 0; width <= 30; width++)
/*     */       {
/*  62 */         par3World.b(par4 + width, par5, par6 + length, amq.bc.cm);
/*     */       }
/*     */     } 
/*     */     
/*  66 */     for (length = 1; length <= 29; length++) {
/*     */       
/*  68 */       for (int width = 1; width <= 29; width++) {
/*     */         
/*  70 */         for (int height = 0; height <= 3; height++) {
/*  71 */           par3World.b(par4 + width, par5 + height, par6 + length, 0);
/*     */         }
/*  73 */         Random rand = new Random();
/*  74 */         if (rand.nextInt(3) == 0)
/*     */         {
/*  76 */           par3World.c(par4 + width, par5, par6 + length, amq.aa.cm, 3);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  81 */     for (length = 0; length <= 30; length++) {
/*     */       
/*  83 */       for (int width = 0; width <= 30; width++)
/*     */       {
/*  85 */         par3World.b(par4 + width, par5 - 1, par6 + length, amq.x.cm);
/*     */       }
/*     */     } 
/*     */     
/*  89 */     par3World.e(par4 + 3, par5, par6, amq.by.cm);
/*     */     
/*  91 */     par2EntityPlayer.b("SCP-872 Spawned. | [Type: §2Safe§f]");
/*     */ 
/*     */ 
/*     */     
/*  95 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 101 */     SCPEntity872 var8 = new SCPEntity872(par0World);
/* 102 */     var8.b(par2 + 15.0D, par4, par6 + 15.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 103 */     par0World.d((lq)var8);
/* 104 */     var8.aO();
/*     */     
/* 106 */     return (var8 != null);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem872.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */