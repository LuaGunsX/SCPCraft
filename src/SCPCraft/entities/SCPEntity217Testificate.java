/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import amq;
/*     */ import bq;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import ke;
/*     */ import kt;
/*     */ import lh;
/*     */ import ll;
/*     */ import lm;
/*     */ import ln;
/*     */ import lq;
/*     */ import md;
/*     */ import mi;
/*     */ import mr;
/*     */ import mz;
/*     */ import nc;
/*     */ import nf;
/*     */ import nh;
/*     */ import nl;
/*     */ import nn;
/*     */ import ns;
/*     */ import nw;
/*     */ import ny;
/*     */ import or;
/*     */ import qr;
/*     */ import qt;
/*     */ import qu;
/*     */ import qx;
/*     */ import s;
/*     */ import up;
/*     */ import ur;
/*     */ import xe;
/*     */ import xs;
/*     */ import xt;
/*     */ import xu;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPEntity217Testificate
/*     */   extends ln
/*     */   implements qt, xs
/*     */ {
/*     */   private int randomTickDivider;
/*     */   private boolean isMating;
/*     */   private boolean isPlaying;
/*     */   or villageObj;
/*     */   private qx buyingPlayer;
/*     */   private xu buyingList;
/*     */   private int timeUntilReset;
/*     */   private boolean needsInitilization;
/*     */   private int wealth;
/*     */   private String field_82189_bL;
/*     */   private boolean field_82190_bM;
/*     */   private float field_82191_bN;
/*  71 */   public static final Map villagerStockList = new HashMap<Object, Object>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  77 */   public static final Map blacksmithSellingList = new HashMap<Object, Object>();
/*     */ 
/*     */   
/*     */   public SCPEntity217Testificate(yc par1World) {
/*  81 */     this(par1World, 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public SCPEnumCreatureAttribute getSCPAttribute() {
/*  86 */     return SCPEnumCreatureAttribute.SCP;
/*     */   }
/*     */ 
/*     */   
/*     */   public SCPEntity217Testificate(yc par1World, int par2) {
/*  91 */     super(par1World);
/*  92 */     this.randomTickDivider = 0;
/*  93 */     this.isMating = false;
/*  94 */     this.isPlaying = false;
/*  95 */     this.villageObj = null;
/*  96 */     setProfession(par2);
/*  97 */     this.aG = "/SCPCraft/textures/mobs/SCP217/SCPTestificate.png";
/*  98 */     this.bH = 0.4F;
/*  99 */     az().b(true);
/* 100 */     az().a(true);
/* 101 */     this.bn.a(0, (nc)new mz((md)this));
/* 102 */     this.bn.a(1, (nc)new mr((mi)this, SCPEntity217Zombie.class, 8.0F, 0.3F, 0.35F));
/* 103 */     this.bn.a(1, (nc)new mr((mi)this, qr.class, 8.0F, 0.3F, 0.35F));
/* 104 */     this.bn.a(1, new SCPEntityAITradePlayer(this));
/* 105 */     this.bn.a(1, (nc)new SCPEntityAILookAtTradePlayer(this));
/* 106 */     this.bn.a(2, (nc)new nl((mi)this));
/* 107 */     this.bn.a(3, (nc)new ny((mi)this));
/* 108 */     this.bn.a(4, (nc)new ns((md)this, true));
/* 109 */     this.bn.a(5, (nc)new nn((mi)this, 0.3F));
/* 110 */     this.bn.a(6, (nc)new nf((md)this, qx.class, 3.0F, 1.0F));
/* 111 */     this.bn.a(6, (nc)new nf((md)this, SCPEntity217Testificate.class, 5.0F, 0.02F));
/* 112 */     this.bn.a(6, (nc)new nw((mi)this, 0.3F));
/* 113 */     this.bn.a(7, (nc)new nh((md)this, md.class, 8.0F));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean be() {
/* 121 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void bm() {
/* 129 */     if (--this.randomTickDivider <= 0) {
/*     */       
/* 131 */       this.p.B.a(ke.c(this.t), ke.c(this.u), ke.c(this.v));
/* 132 */       this.randomTickDivider = 70 + this.aa.nextInt(50);
/* 133 */       this.villageObj = this.p.B.a(ke.c(this.t), ke.c(this.u), ke.c(this.v), 32);
/*     */       
/* 135 */       if (this.villageObj == null) {
/*     */         
/* 137 */         aL();
/*     */       }
/*     */       else {
/*     */         
/* 141 */         s var1 = this.villageObj.a();
/* 142 */         b(var1.a, var1.b, var1.c, (int)(this.villageObj.b() * 0.6F));
/*     */         
/* 144 */         if (this.field_82190_bM) {
/*     */           
/* 146 */           this.field_82190_bM = false;
/* 147 */           this.villageObj.b(5);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 152 */     if (!isTrading() && this.timeUntilReset > 0) {
/*     */       
/* 154 */       this.timeUntilReset--;
/*     */       
/* 156 */       if (this.timeUntilReset <= 0) {
/*     */         
/* 158 */         if (this.needsInitilization) {
/*     */           
/* 160 */           if (this.buyingList.size() > 1) {
/*     */             
/* 162 */             Iterator<xt> var3 = this.buyingList.iterator();
/*     */             
/* 164 */             while (var3.hasNext()) {
/*     */               
/* 166 */               xt var2 = var3.next();
/*     */               
/* 168 */               if (var2.g())
/*     */               {
/* 170 */                 var2.a(this.aa.nextInt(6) + this.aa.nextInt(6) + 2);
/*     */               }
/*     */             } 
/*     */           } 
/*     */           
/* 175 */           addDefaultEquipmentAndRecipies(1);
/* 176 */           this.needsInitilization = false;
/*     */           
/* 178 */           if (this.villageObj != null && this.field_82189_bL != null) {
/*     */             
/* 180 */             this.p.a((lq)this, (byte)14);
/* 181 */             this.villageObj.a(this.field_82189_bL, 1);
/*     */           } 
/*     */         } 
/*     */         
/* 185 */         d(new lm(ll.l.H, 200, 0));
/*     */       } 
/*     */     } 
/*     */     
/* 189 */     super.bm();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/* 197 */     if (S() && !isTrading() && !h_()) {
/*     */       
/* 199 */       if (!this.p.I) {
/*     */         
/* 201 */         b_(par1EntityPlayer);
/* 202 */         par1EntityPlayer.a(this);
/*     */       } 
/*     */       
/* 205 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 209 */     return super.a(par1EntityPlayer);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a() {
/* 215 */     super.a();
/* 216 */     this.ag.a(16, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/* 221 */     return 20;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/* 229 */     super.b(par1NBTTagCompound);
/* 230 */     par1NBTTagCompound.a("Profession", getProfession());
/* 231 */     par1NBTTagCompound.a("Riches", this.wealth);
/*     */     
/* 233 */     if (this.buyingList != null)
/*     */     {
/* 235 */       par1NBTTagCompound.a("Offers", this.buyingList.a());
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/* 244 */     super.a(par1NBTTagCompound);
/* 245 */     setProfession(par1NBTTagCompound.e("Profession"));
/* 246 */     this.wealth = par1NBTTagCompound.e("Riches");
/*     */     
/* 248 */     if (par1NBTTagCompound.b("Offers")) {
/*     */       
/* 250 */       bq var2 = par1NBTTagCompound.l("Offers");
/* 251 */       this.buyingList = new xu(var2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/* 260 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/* 268 */     return "mob.villager.default";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/* 276 */     return "mob.villager.defaulthurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 284 */     return "mob.villager.defaultdeath";
/*     */   }
/*     */ 
/*     */   
/*     */   public void setProfession(int par1) {
/* 289 */     this.ag.b(16, Integer.valueOf(par1));
/*     */   }
/*     */ 
/*     */   
/*     */   public int getProfession() {
/* 294 */     return this.ag.c(16);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isMating() {
/* 299 */     return this.isMating;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setMating(boolean par1) {
/* 304 */     this.isMating = par1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPlaying(boolean par1) {
/* 309 */     this.isPlaying = par1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isPlaying() {
/* 314 */     return this.isPlaying;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(md par1EntityLiving) {
/* 319 */     super.c(par1EntityLiving);
/*     */     
/* 321 */     if (this.villageObj != null && par1EntityLiving != null) {
/*     */       
/* 323 */       this.villageObj.a(par1EntityLiving);
/*     */       
/* 325 */       if (par1EntityLiving instanceof qx) {
/*     */         
/* 327 */         byte var2 = -1;
/*     */         
/* 329 */         if (h_())
/*     */         {
/* 331 */           var2 = -3;
/*     */         }
/*     */         
/* 334 */         this.villageObj.a(((qx)par1EntityLiving).c_(), var2);
/*     */         
/* 336 */         if (S())
/*     */         {
/* 338 */           this.p.a((lq)this, (byte)13);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(lh par1DamageSource) {
/* 349 */     if (this.villageObj != null) {
/*     */       
/* 351 */       lq var2 = par1DamageSource.g();
/*     */       
/* 353 */       if (var2 != null) {
/*     */         
/* 355 */         if (var2 instanceof qx)
/*     */         {
/* 357 */           this.villageObj.a(((qx)var2).c_(), -2);
/*     */         }
/* 359 */         else if (var2 instanceof qe)
/*     */         {
/* 361 */           this.villageObj.h();
/*     */         }
/*     */       
/* 364 */       } else if (var2 == null) {
/*     */         
/* 366 */         qx var3 = this.p.a((lq)this, 16.0D);
/*     */         
/* 368 */         if (var3 != null)
/*     */         {
/* 370 */           this.villageObj.h();
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 375 */     super.a(par1DamageSource);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b_(qx par1EntityPlayer) {
/* 380 */     this.buyingPlayer = par1EntityPlayer;
/*     */   }
/*     */ 
/*     */   
/*     */   public qx m_() {
/* 385 */     return this.buyingPlayer;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isTrading() {
/* 390 */     return (this.buyingPlayer != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(xt par1MerchantRecipe) {
/* 395 */     par1MerchantRecipe.f();
/*     */     
/* 397 */     if (par1MerchantRecipe.a((xt)this.buyingList.get(this.buyingList.size() - 1))) {
/*     */       
/* 399 */       this.timeUntilReset = 40;
/* 400 */       this.needsInitilization = true;
/*     */       
/* 402 */       if (this.buyingPlayer != null) {
/*     */         
/* 404 */         this.field_82189_bL = this.buyingPlayer.c_();
/*     */       }
/*     */       else {
/*     */         
/* 408 */         this.field_82189_bL = null;
/*     */       } 
/*     */     } 
/*     */     
/* 412 */     if ((par1MerchantRecipe.a()).c == up.bH.cj)
/*     */     {
/* 414 */       this.wealth += (par1MerchantRecipe.a()).a;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public xu b(qx par1EntityPlayer) {
/* 420 */     if (this.buyingList == null)
/*     */     {
/* 422 */       addDefaultEquipmentAndRecipies(1);
/*     */     }
/*     */     
/* 425 */     return this.buyingList;
/*     */   }
/*     */ 
/*     */   
/*     */   private float func_82188_j(float par1) {
/* 430 */     float var2 = par1 + this.field_82191_bN;
/* 431 */     return (var2 > 0.9F) ? (0.9F - var2 - 0.9F) : var2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void addDefaultEquipmentAndRecipies(int par1) {
/* 440 */     if (this.buyingList != null) {
/*     */       
/* 442 */       this.field_82191_bN = ke.c(this.buyingList.size()) * 0.2F;
/*     */     }
/*     */     else {
/*     */       
/* 446 */       this.field_82191_bN = 0.0F;
/*     */     } 
/*     */ 
/*     */     
/* 450 */     xu var2 = new xu();
/* 451 */     SCPVillagerRegistry.manageVillagerTrades(var2, this, getProfession(), this.aa);
/*     */ 
/*     */ 
/*     */     
/* 455 */     addMerchantItem(var2, mod_SCP.Circuit.cj, this.aa, func_82188_j(0.5F));
/* 456 */     addMerchantItem(var2, mod_SCP.ElectricWool.cm, this.aa, func_82188_j(0.3F));
/*     */ 
/*     */     
/* 459 */     var2.add(new xt(new ur(mod_SCP.Circuit, 1 + this.aa.nextInt(3)), null, new ur(up.bH.cj, 1 + this.aa.nextInt(3), 0)));
/* 460 */     var2.add(new xt(new ur(up.aK, 3 + this.aa.nextInt(4)), null, new ur(up.bH.cj, 1 + this.aa.nextInt(2), 0)));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 465 */     addBlacksmithItem(var2, up.bf.cj, this.aa, func_82188_j(0.45F));
/* 466 */     addBlacksmithItem(var2, up.bn.cj, this.aa, func_82188_j(0.3F));
/* 467 */     addBlacksmithItem(var2, mod_SCP.Pearl006.cj, this.aa, func_82188_j(0.3F));
/* 468 */     addBlacksmithItem(var2, mod_SCP.Pearl015.cj, this.aa, func_82188_j(0.35F));
/* 469 */     addBlacksmithItem(var2, mod_SCP.Pearl019.cj, this.aa, func_82188_j(0.4005F));
/*     */ 
/*     */     
/* 472 */     var2.add(new xt(new ur(up.bH, 2 + this.aa.nextInt(5)), null, new ur(mod_SCP.L2Keycard.cj, 1, 0)));
/* 473 */     var2.add(new xt(new ur(up.n, 4 + this.aa.nextInt(6)), null, new ur(mod_SCP.OmniKeycard.cj, 1, 0)));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 478 */     var2.add(new xt(new ur(amq.al, this.aa.nextInt(2)), new ur(up.n), new ur(mod_SCP.DocumentTable)));
/* 479 */     var2.add(new xt(new ur(up.aK, 1 + this.aa.nextInt(3)), new ur(up.bn), new ur(up.o.cj, 1 + this.aa.nextInt(2), 0)));
/*     */     
/* 481 */     int[] var3 = { mod_SCP.SCP143Axe.cj, mod_SCP.SCP143Pickaxe.cj, mod_SCP.SCP143Spade.cj, mod_SCP.SCP143Sword.cj };
/* 482 */     int[] var4 = var3;
/* 483 */     int var5 = var3.length;
/* 484 */     int var6 = 0;
/*     */ 
/*     */ 
/*     */     
/* 488 */     while (var6 < var5) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 493 */       int var7 = var4[var6];
/*     */       
/* 495 */       if (this.aa.nextFloat() < func_82188_j(0.05F))
/*     */       {
/* 497 */         var2.add(new xt(new ur(var7, 1, 0), new ur(up.bH, 2 + this.aa.nextInt(3), 0), xe.a(this.aa, new ur(var7, 1, 0), 5 + this.aa.nextInt(15))));
/*     */       }
/*     */       
/* 500 */       var6++;
/*     */     } 
/* 502 */     Collections.shuffle((List<?>)var2);
/*     */     
/* 504 */     if (this.buyingList == null)
/*     */     {
/* 506 */       this.buyingList = new xu();
/*     */     }
/*     */     
/* 509 */     for (int var8 = 0; var8 < par1 && var8 < var2.size(); var8++)
/*     */     {
/* 511 */       this.buyingList.a((xt)var2.get(var8));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void a(xu par1MerchantRecipeList) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public static void addMerchantItem(xu par0MerchantRecipeList, int par1, Random par2Random, float par3) {
/* 523 */     if (par2Random.nextFloat() < par3)
/*     */     {
/* 525 */       par0MerchantRecipeList.add(new xt(getRandomSizedStack(par1, par2Random), up.bH));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static ur getRandomSizedStack(int par0, Random par1Random) {
/* 531 */     return new ur(par0, getRandomCountForItem(par0, par1Random), 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int getRandomCountForItem(int par0, Random par1Random) {
/* 539 */     kt var2 = (kt)villagerStockList.get(Integer.valueOf(par0));
/* 540 */     return (var2 == null) ? 1 : ((((Integer)var2.a()).intValue() >= ((Integer)var2.b()).intValue()) ? ((Integer)var2.a()).intValue() : (((Integer)var2.a()).intValue() + par1Random.nextInt(((Integer)var2.b()).intValue() - ((Integer)var2.a()).intValue())));
/*     */   }
/*     */ 
/*     */   
/*     */   public static void addBlacksmithItem(xu par0MerchantRecipeList, int par1, Random par2Random, float par3) {
/* 545 */     if (par2Random.nextFloat() < par3) {
/*     */       ur var5, var6;
/* 547 */       int var4 = getRandomCountForBlacksmithItem(par1, par2Random);
/*     */ 
/*     */ 
/*     */       
/* 551 */       if (var4 < 0) {
/*     */         
/* 553 */         var5 = new ur(up.bH.cj, 1, 0);
/* 554 */         var6 = new ur(par1, -var4, 0);
/*     */       }
/*     */       else {
/*     */         
/* 558 */         var5 = new ur(up.bH.cj, var4, 0);
/* 559 */         var6 = new ur(par1, 1, 0);
/*     */       } 
/*     */       
/* 562 */       par0MerchantRecipeList.add(new xt(var5, var6));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static int getRandomCountForBlacksmithItem(int par0, Random par1Random) {
/* 568 */     kt var2 = (kt)blacksmithSellingList.get(Integer.valueOf(par0));
/* 569 */     return (var2 == null) ? 1 : ((((Integer)var2.a()).intValue() >= ((Integer)var2.b()).intValue()) ? ((Integer)var2.a()).intValue() : (((Integer)var2.a()).intValue() + par1Random.nextInt(((Integer)var2.b()).intValue() - ((Integer)var2.a()).intValue())));
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void a(byte par1) {
/* 575 */     if (par1 == 12) {
/*     */       
/* 577 */       generateRandomParticles("heart");
/*     */     }
/* 579 */     else if (par1 == 13) {
/*     */       
/* 581 */       generateRandomParticles("angryVillager");
/*     */     }
/* 583 */     else if (par1 == 14) {
/*     */       
/* 585 */       generateRandomParticles("happyVillager");
/*     */     }
/*     */     else {
/*     */       
/* 589 */       super.a(par1);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   private void generateRandomParticles(String par1Str) {
/* 600 */     for (int var2 = 0; var2 < 5; var2++) {
/*     */       
/* 602 */       double var3 = this.aa.nextGaussian() * 0.02D;
/* 603 */       double var5 = this.aa.nextGaussian() * 0.02D;
/* 604 */       double var7 = this.aa.nextGaussian() * 0.02D;
/* 605 */       this.p.a(par1Str, this.t + (this.aa.nextFloat() * this.N * 2.0F) - this.N, this.u + 1.0D + (this.aa.nextFloat() * this.O), this.v + (this.aa.nextFloat() * this.N * 2.0F) - this.N, var3, var5, var7);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_82163_bD() {
/* 611 */     SCPVillagerRegistry.applyRandomTrade(this, this.p.t);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_82187_q() {
/* 616 */     this.field_82190_bM = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public qu func_90012_b(ln par1EntityAgeable) {
/* 621 */     qu var2 = new qu(this.p);
/* 622 */     var2.bG();
/* 623 */     return var2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static {
/* 630 */     villagerStockList.put(Integer.valueOf(mod_SCP.Circuit.cj), new kt(Integer.valueOf(2), Integer.valueOf(8)));
/* 631 */     villagerStockList.put(Integer.valueOf(mod_SCP.ElectricWool.cm), new kt(Integer.valueOf(1), Integer.valueOf(12)));
/* 632 */     blacksmithSellingList.put(Integer.valueOf(up.bf.cj), new kt(Integer.valueOf(4), Integer.valueOf(8)));
/* 633 */     blacksmithSellingList.put(Integer.valueOf(up.bn.cj), new kt(Integer.valueOf(2), Integer.valueOf(5)));
/* 634 */     blacksmithSellingList.put(Integer.valueOf(mod_SCP.Pearl006.cj), new kt(Integer.valueOf(3), Integer.valueOf(9)));
/* 635 */     blacksmithSellingList.put(Integer.valueOf(mod_SCP.Pearl015.cj), new kt(Integer.valueOf(2), Integer.valueOf(10)));
/* 636 */     blacksmithSellingList.put(Integer.valueOf(mod_SCP.Pearl019.cj), new kt(Integer.valueOf(1), Integer.valueOf(6)));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ln a(ln var1) {
/* 642 */     return (ln)func_90012_b(var1);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity217Testificate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */