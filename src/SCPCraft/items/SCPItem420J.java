/*    */ package SCPCraft.items;
/*    */ 
/*    */ import ModLoader;
/*    */ import SCPCraft.mod_SCP;
/*    */ import ll;
/*    */ import lm;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import qx;
/*    */ import up;
/*    */ import ur;
/*    */ import vs;
/*    */ import yc;
/*    */ 
/*    */ public class SCPItem420J
/*    */   extends up
/*    */ {
/*    */   public SCPItem420J(int par1) {
/* 18 */     super(par1);
/* 19 */     d(1);
/* 20 */     a(mod_SCP.tabSCP);
/*    */   }
/*    */ 
/*    */   
/*    */   public ur b(ur par1ItemStack, yc par2World, qx par3EntityPlayer) {
/* 25 */     par1ItemStack.a--;
/* 26 */     par3EntityPlayer.d(new lm(ll.k.H, 600, 1));
/* 27 */     return par1ItemStack;
/*    */   }
/*    */ 
/*    */   
/*    */   public vs b_(ur par1ItemStack) {
/* 32 */     return vs.e;
/*    */   }
/*    */ 
/*    */   
/*    */   public ur a(ur par1ItemStack, yc par2World, qx par3EntityPlayer) {
/* 37 */     Minecraft mc = ModLoader.getMinecraftInstance();
/* 38 */     par3EntityPlayer.a(par1ItemStack, c_(par1ItemStack));
/* 39 */     return par1ItemStack;
/*    */   }
/*    */ 
/*    */   
/*    */   public int c_(ur par1ItemStack) {
/* 44 */     return 32;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 49 */     return "/SCPCraft/textures/SCPItems.png";
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem420J.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */