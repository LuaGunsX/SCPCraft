/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.entities.SCPEntityAtomicGrenade;
/*    */ import SCPCraft.mod_SCP;
/*    */ import lq;
/*    */ import qx;
/*    */ import up;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ public class SCPItemAtomicGrenade
/*    */   extends up {
/*    */   public SCPItemAtomicGrenade(int par1) {
/* 14 */     super(par1);
/* 15 */     this.ck = 2;
/* 16 */     a(mod_SCP.tabItemSCP);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 21 */     return "/SCPCraft/textures/SCPItems.png";
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ur a(ur par1ItemStack, yc par2World, qx par3EntityPlayer) {
/* 29 */     if (!par3EntityPlayer.cd.d)
/*    */     {
/* 31 */       par1ItemStack.a--;
/*    */     }
/*    */     
/* 34 */     par2World.a((lq)par3EntityPlayer, "random.bow", 0.5F, 0.4F / (d.nextFloat() * 0.4F + 0.8F));
/*    */     
/* 36 */     if (!par2World.I)
/*    */     {
/* 38 */       par2World.d((lq)new SCPEntityAtomicGrenade(par2World, (lq)par3EntityPlayer));
/*    */     }
/*    */     
/* 41 */     return par1ItemStack;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItemAtomicGrenade.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */