/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import lm;
/*     */ import qx;
/*     */ import up;
/*     */ import ur;
/*     */ import vs;
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
/*     */ public class SCPItemCupFilled
/*     */   extends up
/*     */ {
/*     */   private int potionId;
/*     */   private int potionDuration;
/*     */   private int potionAmplifier;
/*     */   private float potionEffectProbability;
/*     */   private int color;
/*     */   private int color2;
/*     */   private boolean hasSprinkles;
/*     */   
/*     */   public SCPItemCupFilled(int par1, int col, boolean sprinkles, int col2) {
/*  31 */     super(par1);
/*  32 */     this.color = col;
/*  33 */     this.color2 = col2;
/*  34 */     this.hasSprinkles = sprinkles;
/*  35 */     d(1);
/*  36 */     a(true);
/*  37 */     a(mod_SCP.tabCupsSCP);
/*  38 */     c(11);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean e(ur par1ItemStack) {
/*  43 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int par1, int par2) {
/*  48 */     if (par2 == 0) return 11; 
/*  49 */     if (par2 == 1) return 12; 
/*  50 */     if (this.hasSprinkles) return 13; 
/*  51 */     return 12;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ur par1ItemStack, int par2) {
/*  56 */     if (par2 == 0) return 16777215; 
/*  57 */     if (par2 == 1) return this.color; 
/*  58 */     if (this.hasSprinkles) return this.color2; 
/*  59 */     return this.color;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  64 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getRenderPasses(int metadata) {
/*  69 */     return 3;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTextureFile() {
/*  74 */     return "/SCPCraft/textures/SCPItems.png";
/*     */   }
/*     */ 
/*     */   
/*     */   public ur b(ur par1ItemStack, yc par2World, qx par3EntityPlayer) {
/*  79 */     par1ItemStack.a--;
/*     */     
/*  81 */     if (!par2World.I && this.potionId > 0 && par2World.t.nextFloat() < this.potionEffectProbability)
/*     */     {
/*  83 */       par3EntityPlayer.d(new lm(this.potionId, this.potionDuration * 20, this.potionAmplifier));
/*     */     }
/*     */ 
/*     */     
/*  87 */     return new ur(mod_SCP.CupEmpty);
/*     */   }
/*     */ 
/*     */   
/*     */   public int c_(ur par1ItemStack) {
/*  92 */     return 40;
/*     */   }
/*     */ 
/*     */   
/*     */   public vs b_(ur par1ItemStack) {
/*  97 */     return vs.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public ur a(ur par1ItemStack, yc par2World, qx par3EntityPlayer) {
/* 102 */     par3EntityPlayer.a(par1ItemStack, c_(par1ItemStack));
/* 103 */     return par1ItemStack;
/*     */   }
/*     */ 
/*     */   
/*     */   public SCPItemCupFilled setPotionEffect(int par1, int par2, int par3, float par4) {
/* 108 */     this.potionId = par1;
/* 109 */     this.potionDuration = par2;
/* 110 */     this.potionAmplifier = par3;
/* 111 */     this.potionEffectProbability = par4;
/* 112 */     return this;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItemCupFilled.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */