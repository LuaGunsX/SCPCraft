/*    */ package SCPCraft.CoroAI.entity;
/*    */ 
/*    */ import lq;
/*    */ import qx;
/*    */ import up;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ public class ItemTropicraftLeafball
/*    */   extends up {
/*    */   public ItemTropicraftLeafball(int i) {
/* 12 */     super(i);
/* 13 */     this.ck = 16;
/*    */   }
/*    */ 
/*    */   
/*    */   public ur a(ur itemstack, yc world, qx entityplayer) {
/* 18 */     if (!entityplayer.cd.d)
/*    */     {
/* 20 */       itemstack.a--;
/*    */     }
/* 22 */     world.a((lq)entityplayer, "random.bow", 0.5F, 0.4F / (d.nextFloat() * 0.4F + 0.8F));
/* 23 */     if (!world.I);
/*    */ 
/*    */ 
/*    */     
/* 27 */     return itemstack;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/entity/ItemTropicraftLeafball.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */