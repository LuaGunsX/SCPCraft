/*    */ package SCPCraft.CoroAI.entity;
/*    */ 
/*    */ import amq;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ public class GroupInfo
/*    */ {
/* 10 */   public static GroupInfo i = new GroupInfo();
/*    */   
/*    */   public static List resources;
/*    */   
/*    */   public GroupInfo() {
/* 15 */     i = this;
/* 16 */     resources = new ArrayList();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static InfoResource addResource(int x, int y, int z, EnumResource parType) {
/* 22 */     int id = 0;
/* 23 */     if (parType == EnumResource.WOOD) id = amq.M.cm;
/*    */     
/* 25 */     InfoResource ia = new InfoResource(x, y, z, id, parType);
/* 26 */     resources.add(ia);
/* 27 */     return ia;
/*    */   }
/*    */   
/*    */   public static InfoArea getFirstResource(EnumResource type) {
/* 31 */     for (int i = 0; i < resources.size(); i++) {
/* 32 */       if (((InfoResource)resources.get(i)).type == type) {
/* 33 */         return resources.get(i);
/*    */       }
/*    */     } 
/* 36 */     return null;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/entity/GroupInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */