/*    */ package SCPCraft.containerslots;
/*    */ 
/*    */ import ModLoader;
/*    */ import la;
/*    */ import qx;
/*    */ import sr;
/*    */ import ur;
/*    */ 
/*    */ 
/*    */ public class SCPSlot914
/*    */   extends sr
/*    */ {
/*    */   private qx thePlayer;
/*    */   private int field_48437_f;
/*    */   
/*    */   public SCPSlot914(qx par1EntityPlayer, la par2IInventory, int par3, int par4, int par5) {
/* 17 */     super(par2IInventory, par3, par4, par5);
/* 18 */     this.thePlayer = par1EntityPlayer;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(ur par1ItemStack) {
/* 26 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ur a(int par1) {
/* 35 */     if (d())
/*    */     {
/* 37 */       this.field_48437_f += Math.min(par1, (c()).a);
/*    */     }
/*    */     
/* 40 */     return super.a(par1);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void b(ur par1ItemStack) {
/* 48 */     func_48434_c(par1ItemStack);
/* 49 */     super.b(par1ItemStack);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void func_48435_a(ur par1ItemStack, int par2) {
/* 54 */     this.field_48437_f += par2;
/* 55 */     func_48434_c(par1ItemStack);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void func_48434_c(ur par1ItemStack) {
/* 60 */     par1ItemStack.a(this.thePlayer.p, this.thePlayer, this.field_48437_f);
/* 61 */     this.field_48437_f = 0;
/* 62 */     ModLoader.takenFromFurnace(this.thePlayer, par1ItemStack);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/containerslots/SCPSlot914.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */