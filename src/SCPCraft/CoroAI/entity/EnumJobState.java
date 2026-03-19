/*    */ package SCPCraft.CoroAI.entity;
/*    */ 
/*    */ import java.util.EnumSet;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ public enum EnumJobState
/*    */ {
/*  9 */   IDLE, W1, W2, W3, W4, W5;
/*    */   private static final Map lookup;
/* 11 */   static { lookup = new HashMap<Object, Object>();
/* 12 */     for (EnumJobState e : EnumSet.<EnumJobState>allOf(EnumJobState.class)) lookup.put(Integer.valueOf(e.ordinal()), e);  } public static EnumJobState get(int intValue) {
/* 13 */     return (EnumJobState)lookup.get(Integer.valueOf(intValue));
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/entity/EnumJobState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */