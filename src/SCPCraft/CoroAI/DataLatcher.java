/*    */ package SCPCraft.CoroAI;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ 
/*    */ public class DataLatcher
/*    */ {
/*    */   public HashMap values;
/*    */   
/*    */   DataLatcher() {
/* 10 */     this.values = new HashMap<Object, Object>();
/*    */ 
/*    */     
/* 13 */     this.values.put(DataTypes.followTarg, null);
/* 14 */     this.values.put(DataTypes.noMoveTicks, Integer.valueOf(0));
/* 15 */     this.values.put(DataTypes.noSeeTicks, Integer.valueOf(0));
/* 16 */     this.values.put(DataTypes.shouldDespawn, Boolean.valueOf(true));
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/DataLatcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */