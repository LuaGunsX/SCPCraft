/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import lq;
/*    */ import qx;
/*    */ import uk;
/*    */ import ur;
/*    */ import vs;
/*    */ import yc;
/*    */ 
/*    */ public class SCPItem458 extends uk {
/*    */   private static boolean alwaysEdible;
/*    */   private final float saturationModifier;
/*    */   private final int healAmount;
/*    */   
/*    */   public SCPItem458(int par1, int par2, float par3, boolean par4) {
/* 17 */     super(par1, par2, par3, par4);
/* 18 */     this.healAmount = 2;
/* 19 */     this.saturationModifier = 3.0F;
/* 20 */     a(mod_SCP.tabSCP);
/*    */   }
/*    */ 
/*    */   
/*    */   public int c_(ur par1ItemStack) {
/* 25 */     return 50;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 30 */     return "/SCPCraft/textures/SCPPearls.png";
/*    */   }
/*    */ 
/*    */   
/*    */   public ur a(ur itemstack, yc world, qx entityplayer) {
/* 35 */     if (entityplayer.g(alwaysEdible))
/*    */     {
/* 37 */       entityplayer.a(itemstack, c_(itemstack));
/*    */     }
/*    */     
/* 40 */     return itemstack;
/*    */   }
/*    */ 
/*    */   
/*    */   public int g() {
/* 45 */     return 1;
/*    */   }
/*    */ 
/*    */   
/*    */   public ur b(ur par1ItemStack, yc par2World, qx par3EntityPlayer) {
/* 50 */     par2World.a((lq)par3EntityPlayer, "random.burp", 0.5F, par2World.t.nextFloat() * 0.1F + 0.9F);
/* 51 */     par3EntityPlayer.cc().a(this.healAmount, this.saturationModifier);
/* 52 */     return par1ItemStack;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public float h() {
/* 60 */     return 1.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public vs b_(ur par1ItemStack) {
/* 65 */     return vs.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public SCPItem458 setAlwaysEdible() {
/* 70 */     alwaysEdible = true;
/* 71 */     return this;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem458.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */