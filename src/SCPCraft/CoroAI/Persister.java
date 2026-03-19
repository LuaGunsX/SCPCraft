/*    */ package SCPCraft.CoroAI;
/*    */ 
/*    */ import SCPCraft.c_CoroAIUtil;
/*    */ import java.util.List;
/*    */ import ke;
/*    */ import lq;
/*    */ import yc;
/*    */ import yi;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Persister
/*    */ {
/*    */   public static Persister instance;
/*    */   public static yc worldRef;
/* 16 */   public static int loadInRange = 128;
/* 17 */   public static int loadOutRange = 128;
/*    */   
/* 19 */   public static int monitorDelayAmount = 60;
/* 20 */   public static int monitorDelay = 60;
/*    */   
/*    */   public Persister() {
/* 23 */     instance = this;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void tick(yc parWorld) {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void watchChunklessEntities() {
/* 45 */     for (int i = 0; i < worldRef.i.size(); i++) {
/* 46 */       lq ent = worldRef.i.get(i);
/*    */       
/* 48 */       if (ent instanceof c_IEnhAI && 
/* 49 */         worldRef.a(ent, loadInRange) != null) {
/* 50 */         worldRef.i.remove(ent);
/*    */ 
/*    */         
/* 53 */         worldRef.e(ke.c(ent.t / 16.0D), ke.c(ent.v / 16.0D)).a(ent);
/*    */         
/* 55 */         worldRef.e.add(ent);
/* 56 */         System.out.println("weather ent -> world ent");
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public static void watchEntities() {
/* 63 */     for (int i = 0; i < worldRef.e.size(); i++) {
/* 64 */       lq ent = worldRef.e.get(i);
/*    */       
/* 66 */       if (ent instanceof c_IEnhAI && 
/* 67 */         worldRef.a(ent, loadOutRange) == null) {
/*    */ 
/*    */         
/* 70 */         int var3 = ent.ai;
/* 71 */         int var4 = ent.ak;
/*    */         
/* 73 */         if (ent.ah)
/*    */         {
/* 75 */           worldRef.e(var3, var4).b(ent);
/*    */         }
/* 77 */         List<yi> list = null;
/*    */         try {
/* 79 */           list = (List)c_CoroAIUtil.getPrivateValueBoth(yc.class, worldRef, "worldAccesses", "u");
/* 80 */         } catch (Exception ex) {
/* 81 */           ex.printStackTrace();
/*    */         } 
/* 83 */         for (int var2 = 0; var2 < list.size(); var2++)
/*    */         {
/* 85 */           ((yi)list.get(var2)).b(ent);
/*    */         }
/*    */         
/* 88 */         worldRef.e.remove(ent);
/* 89 */         worldRef.c(ent);
/* 90 */         System.out.println("world ent -> weather ent");
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/Persister.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */