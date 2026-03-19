/*    */ package SCPCraft.CoroAI.entity;
/*    */ 
/*    */ import java.util.EnumSet;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ public enum EnumResource
/*    */ {
/*  9 */   WOOD, STONE, COAL;
/*    */   private static final Map lookup;
/* 11 */   static { lookup = new HashMap<Object, Object>();
/* 12 */     for (EnumJob e : EnumSet.<EnumJob>allOf(EnumJob.class)) lookup.put(Integer.valueOf(e.ordinal()), e);  } public static EnumJob get(int intValue) {
/* 13 */     return (EnumJob)lookup.get(Integer.valueOf(intValue));
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/entity/EnumResource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */