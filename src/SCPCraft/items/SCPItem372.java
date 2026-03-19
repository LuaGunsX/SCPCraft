/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.entities.SCPEntity372;
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
/*     */ public class SCPItem372
/*     */   extends SCPItemDocument
/*     */ {
/*     */   public SCPItem372(int i) {
/*  20 */     super(i);
/*  21 */     this.ck = 1;
/*  22 */     e(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  27 */     list.add("§eSCP-372");
/*  28 */     list.add("§7Peripheral Jumper");
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
/*  64 */     for (width = -1; width <= 8; width++) {
/*     */       
/*  66 */       for (int length = -1; length <= 8; length++) {
/*     */         
/*  68 */         for (int height = -1; height <= 4; height++) {
/*     */           
/*  70 */           par3World.b(par4 + width, par5 + height, par6 + length, amq.P.cm);
/*  71 */           par3World.b(par4 + width, par5 + 5, par6 + length, amq.al.cm);
/*  72 */           par3World.b(par4 + width, par5 + 2, par6 + length, amq.al.cm);
/*  73 */           par3World.b(par4 - 1, par5 + height, par6 - 1, amq.al.cm);
/*  74 */           par3World.b(par4 - 1, par5 + height, par6 + 8, amq.al.cm);
/*  75 */           par3World.b(par4 + 8, par5 + height, par6 + 8, amq.al.cm);
/*  76 */           par3World.b(par4 + 8, par5 + height, par6 - 1, amq.al.cm);
/*  77 */           par3World.b(par4 + 3, par5 + height, par6 - 1, amq.al.cm);
/*  78 */           par3World.b(par4 + 4, par5 + height, par6 - 1, amq.al.cm);
/*  79 */           par3World.b(par4 + 3, par5 + height, par6 + 8, amq.al.cm);
/*  80 */           par3World.b(par4 + 4, par5 + height, par6 + 8, amq.al.cm);
/*  81 */           par3World.b(par4 - 1, par5 + height, par6 + 3, amq.al.cm);
/*  82 */           par3World.b(par4 - 1, par5 + height, par6 + 4, amq.al.cm);
/*  83 */           par3World.b(par4 + 8, par5 + height, par6 + 3, amq.al.cm);
/*  84 */           par3World.b(par4 + 8, par5 + height, par6 + 4, amq.al.cm);
/*     */         } 
/*     */       } 
/*     */     } 
/*  88 */     for (width = 0; width <= 7; width++) {
/*     */       
/*  90 */       for (int length = 0; length <= 7; length++) {
/*     */         
/*  92 */         for (int height = 0; height <= 4; height++)
/*     */         {
/*  94 */           par3World.b(par4 + width, par5 + height, par6 + length, 0);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  99 */     par3World.d(par4 + 4, par5 + 1, par6 - 2, mod_SCP.KeycardSlotLv2.cm, 2);
/* 100 */     par3World.d(par4 + 4, par5 + 1, par6, mod_SCP.KeycardSlotLv2.cm, 0);
/*     */     
/* 102 */     for (width = -1; width <= 8; width++) {
/*     */       
/* 104 */       for (int length = -1; length <= 8; length++)
/*     */       {
/* 106 */         par3World.b(par4 + width, par5 - 1, par6 + length, amq.w.cm);
/*     */       }
/*     */     } 
/*     */     
/* 110 */     tx.a(par3World, par4 + 3, par5, par6 - 1, 1, amq.aO);
/*     */     
/* 112 */     par2EntityPlayer.b("SCP-372 Spawned. | [Type: §eEuclid§f]");
/*     */ 
/*     */ 
/*     */     
/* 116 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ur itemstack, yc world, lq entity, int i, boolean flag) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 126 */     SCPEntity372 var8 = new SCPEntity372(par0World);
/* 127 */     var8.b(par2 + 2.0D, par4, par6 + 3.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 128 */     par0World.d((lq)var8);
/* 129 */     var8.aO();
/*     */     
/* 131 */     return (var8 != null);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem372.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */