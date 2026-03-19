/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import up;
/*    */ import ur;
/*    */ import vb;
/*    */ 
/*    */ public class SCPItemWrench
/*    */   extends up {
/*    */   public int type;
/*    */   
/*    */   public SCPItemWrench(int i, int Type) {
/* 13 */     super(i);
/* 14 */     d(1);
/* 15 */     a(mod_SCP.tabItemSCP);
/* 16 */     this.type = Type;
/* 17 */     if (Type == 0) { e(100); }
/* 18 */     else { e(0); }
/* 19 */      a(true);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean e(ur par1ItemStack) {
/* 24 */     if (this.type == 1) return true; 
/* 25 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public vb f(ur par1ItemStack) {
/* 30 */     if (this.type == 1)
/*    */     {
/* 32 */       return (par1ItemStack.j() == 0) ? vb.c : vb.d;
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 37 */     return (par1ItemStack.j() == 0) ? vb.b : vb.a;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean n_() {
/* 43 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 48 */     return "/SCPCraft/textures/SCPItems.png";
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItemWrench.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */