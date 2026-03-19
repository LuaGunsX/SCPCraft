/*    */ package SCPCraft.CoroAI.entity;
/*    */ 
/*    */ import lq;
/*    */ import md;
/*    */ import qx;
/*    */ import up;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ public class ItemTropicalFishingRod extends up {
/*    */   public ItemTropicalFishingRod(int var1) {
/* 12 */     super(var1);
/* 13 */     e(64);
/* 14 */     d(1);
/*    */   }
/*    */   
/*    */   public boolean n_() {
/* 18 */     return true;
/*    */   }
/*    */   
/*    */   public boolean o_() {
/* 22 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public ur onItemRightClick2(ur var1, yc var2, c_PlayerProxy var3, float speed) {
/* 27 */     if (var3.fishEntity != null) {
/* 28 */       int var4 = var3.fishEntity.catchFish();
/*    */       
/* 30 */       var3.bH();
/*    */     } else {
/* 32 */       var2.a((lq)var3, "random.bow", 0.5F, 0.4F / (d.nextFloat() * 0.4F + 0.8F));
/*    */       
/* 34 */       if (!var2.I) {
/* 35 */         var2.d(new EntityTropicalFishHook(var2, (md)var3, speed));
/*    */       }
/*    */       
/* 38 */       var3.bH();
/*    */     } 
/*    */     
/* 41 */     return var1;
/*    */   }
/*    */   
/*    */   public ur a(ur var1, yc var2, qx var3) {
/* 45 */     if (var3.cj != null) {
/* 46 */       int var4 = var3.cj.c();
/* 47 */       var1.a(var4, (md)var3);
/* 48 */       var3.bH();
/*    */     } else {
/* 50 */       var2.a((lq)var3, "random.bow", 0.5F, 0.4F / (d.nextFloat() * 0.4F + 0.8F));
/*    */       
/* 52 */       if (!var2.I) {
/* 53 */         var2.d(new EntityTropicalFishHook(var2, (md)var3, 2.0F));
/*    */       }
/*    */       
/* 56 */       var3.bH();
/*    */     } 
/*    */     
/* 59 */     return var1;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/entity/ItemTropicalFishingRod.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */