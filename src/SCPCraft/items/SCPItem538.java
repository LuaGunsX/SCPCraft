/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.entities.SCPEntity538;
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
/*     */ public class SCPItem538
/*     */   extends SCPItemDocument
/*     */ {
/*     */   public SCPItem538(int i) {
/*  19 */     super(i);
/*  20 */     this.ck = 1;
/*  21 */     e(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  26 */     list.add("§eSCP-538");
/*  27 */     list.add("§7Shadow Spiders");
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
/*     */     int height;
/*  62 */     for (height = -1; height <= 3; height++) {
/*  63 */       for (int length = -1; length <= 15; length++) {
/*  64 */         for (int width = -1; width <= 15; width++)
/*     */         {
/*  66 */           par3World.d(par4 + length, par5 + height, par6 + width, amq.ae.cm, 0); } 
/*     */       } 
/*  68 */     }  par3World.d(par4, par5 + 3, par6, amq.bg.cm, 0);
/*  69 */     par3World.d(par4 + 14, par5 + 3, par6, amq.bg.cm, 0);
/*  70 */     par3World.d(par4, par5 + 3, par6 + 14, amq.bg.cm, 0);
/*  71 */     par3World.d(par4 + 14, par5 + 3, par6 + 14, amq.bg.cm, 0);
/*  72 */     par3World.d(par4 + 7, par5 + 3, par6 + 7, amq.bg.cm, 0);
/*  73 */     par3World.d(par4 + 7, par5 + 3, par6 + 3, amq.bg.cm, 0);
/*  74 */     par3World.d(par4 + 7, par5 + 3, par6 + 11, amq.bg.cm, 0);
/*  75 */     par3World.d(par4 + 3, par5 + 3, par6 + 7, amq.bg.cm, 0);
/*  76 */     par3World.d(par4 + 11, par5 + 3, par6 + 7, amq.bg.cm, 0);
/*  77 */     par3World.d(par4 + 7, par5 + 3, par6, amq.bg.cm, 0);
/*  78 */     par3World.d(par4, par5 + 3, par6 + 7, amq.bg.cm, 0);
/*  79 */     par3World.d(par4 + 14, par5 + 3, par6 + 7, amq.bg.cm, 0);
/*  80 */     par3World.d(par4 + 7, par5 + 3, par6 + 14, amq.bg.cm, 0);
/*     */     
/*  82 */     for (height = 1; height <= 2; height++) {
/*  83 */       for (int length = 6; length <= 11; length++)
/*     */       {
/*  85 */         par3World.d(par4 + length, par5 + height, par6 - 1, amq.bt.cm, 0);
/*     */       }
/*     */     } 
/*  88 */     for (height = 0; height <= 2; height++) {
/*  89 */       for (int length = 0; length <= 14; length++) {
/*  90 */         for (int width = 0; width <= 14; width++)
/*     */         {
/*  92 */           par3World.d(par4 + length, par5 + height, par6 + width, 0, 0); } 
/*     */       } 
/*     */     } 
/*  95 */     par3World.d(par4 + 2, par5 + 1, par6 - 2, mod_SCP.KeycardSlotLv2.cm, 2);
/*  96 */     par3World.d(par4 + 4, par5 + 1, par6, mod_SCP.KeycardSlotLv2.cm, 0);
/*  97 */     tx.a(par3World, par4 + 3, par5, par6 - 1, 1, amq.aO);
/*     */     
/*  99 */     SCPEntity538 SCPEntity538 = new SCPEntity538(par3World);
/* 100 */     SCPEntity538 SCPEntity5381 = new SCPEntity538(par3World);
/* 101 */     SCPEntity538 SCPEntity5382 = new SCPEntity538(par3World);
/* 102 */     SCPEntity538 SCPEntity5383 = new SCPEntity538(par3World);
/* 103 */     SCPEntity538 SCPEntity5384 = new SCPEntity538(par3World);
/* 104 */     SCPEntity538 SCPEntity5385 = new SCPEntity538(par3World);
/* 105 */     SCPEntity538 SCPEntity5386 = new SCPEntity538(par3World);
/* 106 */     SCPEntity538 SCPEntity5387 = new SCPEntity538(par3World);
/*     */     
/* 108 */     SCPEntity538.b((par4 + 7), (par5 + 1), (par6 + 7));
/* 109 */     par3World.h((lq)SCPEntity538);
/*     */     
/* 111 */     SCPEntity5381.b((par4 + 7), (par5 + 1), (par6 + 6));
/* 112 */     par3World.h((lq)SCPEntity5381);
/*     */     
/* 114 */     SCPEntity5382.b((par4 + 7), (par5 + 1), (par6 + 5));
/* 115 */     par3World.h((lq)SCPEntity5382);
/*     */     
/* 117 */     SCPEntity5383.b((par4 + 7), (par5 + 1), (par6 + 4));
/* 118 */     par3World.h((lq)SCPEntity5383);
/*     */     
/* 120 */     SCPEntity5384.b((par4 + 6), (par5 + 1), (par6 + 7));
/* 121 */     par3World.h((lq)SCPEntity5384);
/*     */     
/* 123 */     SCPEntity5385.b((par4 + 5), (par5 + 1), (par6 + 7));
/* 124 */     par3World.h((lq)SCPEntity5385);
/*     */     
/* 126 */     SCPEntity5386.b((par4 + 4), (par5 + 1), (par6 + 7));
/* 127 */     par3World.h((lq)SCPEntity5386);
/*     */     
/* 129 */     SCPEntity5387.b((par4 + 3), (par5 + 1), (par6 + 7));
/* 130 */     par3World.h((lq)SCPEntity5387);
/*     */     
/* 132 */     par2EntityPlayer.b("SCP-538 Spawned. | [Type: §eEuclid§f]");
/*     */ 
/*     */ 
/*     */     
/* 136 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 142 */     SCPEntity538 SCPEntity538 = new SCPEntity538(par0World);
/* 143 */     SCPEntity538 SCPEntity5381 = new SCPEntity538(par0World);
/* 144 */     SCPEntity538 SCPEntity5382 = new SCPEntity538(par0World);
/* 145 */     SCPEntity538 SCPEntity5383 = new SCPEntity538(par0World);
/* 146 */     SCPEntity538 SCPEntity5384 = new SCPEntity538(par0World);
/* 147 */     SCPEntity538 SCPEntity5385 = new SCPEntity538(par0World);
/* 148 */     SCPEntity538 SCPEntity5386 = new SCPEntity538(par0World);
/* 149 */     SCPEntity538 SCPEntity5387 = new SCPEntity538(par0World);
/*     */     
/* 151 */     SCPEntity538.b(par2 + 7.0D, par4 + 1.0D, par6 + 7.0D);
/* 152 */     par0World.h((lq)SCPEntity538);
/*     */     
/* 154 */     SCPEntity5381.b(par2 + 7.0D, par4 + 1.0D, par6 + 6.0D);
/* 155 */     par0World.h((lq)SCPEntity5381);
/*     */     
/* 157 */     SCPEntity5382.b(par2 + 7.0D, par4 + 1.0D, par6 + 5.0D);
/* 158 */     par0World.h((lq)SCPEntity5382);
/*     */     
/* 160 */     SCPEntity5383.b(par2 + 7.0D, par4 + 1.0D, par6 + 4.0D);
/* 161 */     par0World.h((lq)SCPEntity5383);
/*     */     
/* 163 */     SCPEntity5384.b(par2 + 6.0D, par4 + 1.0D, par6 + 7.0D);
/* 164 */     par0World.h((lq)SCPEntity5384);
/*     */     
/* 166 */     SCPEntity5385.b(par2 + 5.0D, par4 + 1.0D, par6 + 7.0D);
/* 167 */     par0World.h((lq)SCPEntity5385);
/*     */     
/* 169 */     SCPEntity5386.b(par2 + 4.0D, par4 + 1.0D, par6 + 7.0D);
/* 170 */     par0World.h((lq)SCPEntity5386);
/*     */     
/* 172 */     SCPEntity5387.b(par2 + 3.0D, par4 + 1.0D, par6 + 7.0D);
/* 173 */     par0World.h((lq)SCPEntity5387);
/*     */     
/* 175 */     par0World.d((lq)SCPEntity538);
/* 176 */     SCPEntity538.aO();
/*     */     
/* 178 */     par0World.d((lq)SCPEntity5381);
/* 179 */     SCPEntity5381.aO();
/*     */     
/* 181 */     par0World.d((lq)SCPEntity5382);
/* 182 */     SCPEntity5382.aO();
/*     */     
/* 184 */     par0World.d((lq)SCPEntity5383);
/* 185 */     SCPEntity5383.aO();
/*     */     
/* 187 */     par0World.d((lq)SCPEntity5384);
/* 188 */     SCPEntity5384.aO();
/*     */     
/* 190 */     par0World.d((lq)SCPEntity5385);
/* 191 */     SCPEntity5385.aO();
/*     */     
/* 193 */     par0World.d((lq)SCPEntity5386);
/* 194 */     SCPEntity5386.aO();
/*     */     
/* 196 */     return (SCPEntity538 != null);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem538.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */