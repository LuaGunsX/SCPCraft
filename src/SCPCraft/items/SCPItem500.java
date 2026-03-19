/*    */ package SCPCraft.items;
/*    */ 
/*    */ import ModLoader;
/*    */ import SCPCraft.mod_SCP;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import qx;
/*    */ import up;
/*    */ import ur;
/*    */ import vs;
/*    */ import yc;
/*    */ 
/*    */ public class SCPItem500 extends up {
/*    */   private int healAmount;
/*    */   private int id;
/*    */   private boolean alwaysEdible;
/*    */   
/*    */   public SCPItem500(int par1, int i, int heal) {
/* 18 */     super(par1);
/* 19 */     this.healAmount = heal;
/* 20 */     this.id = i;
/* 21 */     a(mod_SCP.tabSCP);
/*    */   }
/*    */ 
/*    */   
/*    */   public int getHealAmount() {
/* 26 */     return this.healAmount;
/*    */   }
/*    */ 
/*    */   
/*    */   public vs b_(ur par1ItemStack) {
/* 31 */     return vs.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public ur a(ur par1ItemStack, yc par2World, qx par3EntityPlayer) {
/* 36 */     Minecraft mc = ModLoader.getMinecraftInstance();
/* 37 */     if (mc.b.g()) {
/*    */       
/* 39 */       par1ItemStack.a--;
/* 40 */       if (this.id == 0) par3EntityPlayer.i(this.healAmount); 
/* 41 */       if (this.id == 1) par3EntityPlayer.aR = 0; 
/* 42 */       par3EntityPlayer.a(par1ItemStack, c_(par1ItemStack));
/*    */     } 
/* 44 */     return par1ItemStack;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean e(ur par1ItemStack) {
/* 49 */     if (this.id == 0) return false; 
/* 50 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public int c_(ur par1ItemStack) {
/* 55 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 60 */     return "/SCPCraft/textures/SCPItems.png";
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem500.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */