/*    */ package SCPCraft.containerslots;
/*    */ 
/*    */ import la;
/*    */ import qx;
/*    */ import rq;
/*    */ import sr;
/*    */ import ur;
/*    */ 
/*    */ 
/*    */ public class SCPCraftingInventoryRecipeBookCB
/*    */   extends rq
/*    */ {
/*    */   private la inv;
/*    */   
/*    */   public SCPCraftingInventoryRecipeBookCB(la var1) {
/* 16 */     this.inv = var1;
/* 17 */     int var2 = 0;
/*    */     
/* 19 */     for (int var3 = 0; var3 < 4; var3++) {
/*    */       
/* 21 */       for (int var4 = 0; var4 < 3; var4++) {
/*    */         
/* 23 */         a(new sr(var1, var2++, 99 + var4 * 117, 24 + var3 * 55));
/*    */         
/* 25 */         for (int var5 = 0; var5 < 3; var5++) {
/*    */           
/* 27 */           for (int var6 = 0; var6 < 3; var6++)
/*    */           {
/* 29 */             a(new sr(var1, var2++, 5 + var6 * 18 + var4 * 117, 6 + var5 * 18 + var3 * 55));
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(qx var1) {
/* 38 */     return this.inv.a_(var1);
/*    */   }
/*    */ 
/*    */   
/*    */   public ur transferStackInSlot(int var1) {
/* 43 */     return null;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/containerslots/SCPCraftingInventoryRecipeBookCB.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */