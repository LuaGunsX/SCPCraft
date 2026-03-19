/*    */ package SCPCraft.renders;
/*    */ 
/*    */ import SCPCraft.entities.SCPEntity629;
/*    */ import axa;
/*    */ import bcj;
/*    */ import lq;
/*    */ import md;
/*    */ 
/*    */ public class SCPRender629
/*    */   extends bcj
/*    */ {
/*    */   public SCPRender629(axa modelbase, float f) {
/* 13 */     super(modelbase, f);
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_177_a(SCPEntity629 entity, double d, double d1, double d2, float f, float f1) {
/* 18 */     super.a((md)entity, d, d1, d2, f, f1);
/* 19 */     if (entity.Name.length() > 0 && entity.Name != "")
/*    */     {
/* 21 */       a((md)entity, entity.Name, d, d1, d2, 64);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(md entityliving, double d, double d1, double d2, float f, float f1) {
/* 27 */     func_177_a((SCPEntity629)entityliving, d, d1, d2, f, f1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(lq entity, double d, double d1, double d2, float f, float f1) {
/* 32 */     func_177_a((SCPEntity629)entity, d, d1, d2, f, f1);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/renders/SCPRender629.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */