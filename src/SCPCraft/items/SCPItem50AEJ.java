/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.entities.SCPEntity50AEJ;
/*    */ import SCPCraft.mod_SCP;
/*    */ import lq;
/*    */ import qx;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ public class SCPItem50AEJ
/*    */   extends SCPItem
/*    */ {
/*    */   public SCPItem50AEJ(int i) {
/* 14 */     super(i);
/* 15 */     d(1);
/* 16 */     a(mod_SCP.tabSCP);
/* 17 */     e(300);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 22 */     return "/SCPCraft/textures/SCPItems.png";
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean n_() {
/* 27 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public ur a(ur par1ItemStack, yc var2, qx var3) {
/* 32 */     if (!var2.I) {
/* 33 */       SCPEntity50AEJ var8 = new SCPEntity50AEJ(var2);
/* 34 */       var8.b(var3.t, var3.u, var3.v, var2.t.nextFloat() * 360.0F, 0.0F);
/* 35 */       var2.d((lq)var8);
/* 36 */       var8.aO();
/*    */     } 
/* 38 */     return par1ItemStack;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem50AEJ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */