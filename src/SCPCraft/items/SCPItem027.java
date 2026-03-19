/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.entities.SCPEntityClassD027;
/*     */ import SCPCraft.entities.SCPEntityRat;
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
/*     */ public class SCPItem027
/*     */   extends SCPItemDocument
/*     */ {
/*     */   public SCPItem027(int i) {
/*  20 */     super(i);
/*  21 */     this.ck = 1;
/*  22 */     e(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  27 */     list.add("§eSCP-027");
/*  28 */     list.add("§7The Vermin God");
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
/*     */     int length;
/*  61 */     for (length = -1; length <= 5; length++) {
/*     */       
/*  63 */       for (int i = -1; i <= 5; i++) {
/*     */         
/*  65 */         for (int heigth = -1; heigth <= 5; heigth++)
/*     */         {
/*  67 */           par3World.b(par4 + i, par5 + heigth, par6 + length, amq.w.cm);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  72 */     for (length = 0; length <= 4; length++) {
/*     */       
/*  74 */       for (int i = 0; i <= 4; i++) {
/*     */         
/*  76 */         for (int heigth = 0; heigth <= 4; heigth++)
/*     */         {
/*  78 */           par3World.b(par4 + i, par5 + heigth, par6 + length, 0);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  83 */     for (int floorWidth = 0; floorWidth <= 4; floorWidth++) {
/*     */       
/*  85 */       for (int floorLength = 0; floorLength <= 5; floorLength++)
/*     */       {
/*  87 */         par3World.b(par4 + floorWidth, par5 - 1, par6 + floorLength, mod_SCP.GrateBlock.cm);
/*     */       }
/*     */     } 
/*  90 */     for (int width = 0; width <= 4; width++) {
/*     */       
/*  92 */       for (int i = 0; i <= 4; i++) {
/*     */         
/*  94 */         for (int heigth = 1; heigth <= 2; heigth++)
/*     */         {
/*  96 */           par3World.b(par4 + width, par5 - heigth - 1, par6 + i, 0);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 101 */     tx.a(par3World, par4 + 2, par5, par6 - 1, 1, amq.aO);
/* 102 */     par3World.d(par4 + 1, par5 + 1, par6 - 2, mod_SCP.KeycardSlotLv2.cm, 2);
/* 103 */     par3World.d(par4 + 3, par5 + 1, par6, mod_SCP.KeycardSlotLv2.cm, 0);
/*     */     
/* 105 */     par3World.c(par4 + 5, par5, par6 + 2, amq.an.cm, 8);
/* 106 */     par3World.c(par4 + 5, par5, par6 + 3, amq.an.cm, 8);
/* 107 */     par3World.c(par4 + 5, par5, par6 + 1, amq.an.cm, 8);
/* 108 */     par3World.c(par4 - 1, par5, par6 + 2, amq.an.cm, 8);
/* 109 */     par3World.c(par4 - 1, par5, par6 + 3, amq.an.cm, 8);
/* 110 */     par3World.c(par4 - 1, par5, par6 + 1, amq.an.cm, 8);
/*     */     
/* 112 */     par2EntityPlayer.b("SCP-027 Spawned. | [Type: §eEuclid§f]");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 119 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 125 */     SCPEntityRat var8 = new SCPEntityRat(par0World);
/* 126 */     var8.b(par2 + 2.0D, par4 - 2.0D, par6 + 3.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 127 */     par0World.d((lq)var8);
/* 128 */     var8.aO();
/*     */     
/* 130 */     SCPEntityRat var9 = new SCPEntityRat(par0World);
/* 131 */     var9.b(par2 + 3.0D, par4 - 2.0D, par6 + 2.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 132 */     par0World.d((lq)var9);
/* 133 */     var9.aO();
/*     */     
/* 135 */     SCPEntityRat var10 = new SCPEntityRat(par0World);
/* 136 */     var10.b(par2 + 1.0D, par4 - 2.0D, par6 + 1.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 137 */     par0World.d((lq)var10);
/* 138 */     var10.aO();
/*     */     
/* 140 */     SCPEntityRat var11 = new SCPEntityRat(par0World);
/* 141 */     var11.b(par2 + 1.0D, par4 - 2.0D, par6 + 1.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 142 */     par0World.d((lq)var11);
/* 143 */     var11.aO();
/*     */     
/* 145 */     SCPEntityClassD027 classd = new SCPEntityClassD027(par0World);
/* 146 */     classd.b(par2 + 2.0D, par4, par6 + 2.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 147 */     par0World.d((lq)classd);
/* 148 */     classd.aO();
/*     */     
/* 150 */     SCPEntityRat top1 = new SCPEntityRat(par0World);
/* 151 */     top1.b(par2 + 2.0D, par4, par6 + 3.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 152 */     par0World.d((lq)top1);
/* 153 */     top1.aO();
/*     */     
/* 155 */     SCPEntityRat top2 = new SCPEntityRat(par0World);
/* 156 */     top2.b(par2 + 3.0D, par4, par6 + 2.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 157 */     par0World.d((lq)top2);
/* 158 */     top2.aO();
/*     */     
/* 160 */     SCPEntityRat top3 = new SCPEntityRat(par0World);
/* 161 */     top3.b(par2 + 1.0D, par4, par6 + 1.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 162 */     par0World.d((lq)top3);
/* 163 */     top3.aO();
/*     */     
/* 165 */     SCPEntityRat top4 = new SCPEntityRat(par0World);
/* 166 */     top4.b(par2 + 1.0D, par4, par6 + 1.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 167 */     par0World.d((lq)top4);
/* 168 */     top4.aO();
/*     */     
/* 170 */     SCPEntityRat bottom1 = new SCPEntityRat(par0World);
/* 171 */     bottom1.b(par2 + 2.0D, par4 - 2.0D, par6 + 3.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 172 */     par0World.d((lq)bottom1);
/* 173 */     bottom1.aO();
/*     */     
/* 175 */     SCPEntityRat bottom2 = new SCPEntityRat(par0World);
/* 176 */     bottom2.b(par2 + 3.0D, par4 - 2.0D, par6 + 2.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 177 */     par0World.d((lq)bottom2);
/* 178 */     bottom2.aO();
/*     */     
/* 180 */     SCPEntityRat bottom3 = new SCPEntityRat(par0World);
/* 181 */     bottom3.b(par2 + 1.0D, par4 - 2.0D, par6 + 1.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 182 */     par0World.d((lq)bottom3);
/* 183 */     bottom3.aO();
/*     */     
/* 185 */     SCPEntityRat bottom4 = new SCPEntityRat(par0World);
/* 186 */     bottom4.b(par2 + 1.0D, par4 - 2.0D, par6 + 1.0D, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 187 */     par0World.d((lq)bottom4);
/* 188 */     bottom4.aO();
/*     */     
/* 190 */     return (var8 != null);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem027.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */