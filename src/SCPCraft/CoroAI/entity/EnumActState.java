/*    */ package SCPCraft.CoroAI.entity;
/*    */ 
/*    */ import java.util.EnumSet;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ public enum EnumActState
/*    */ {
/*  9 */   IDLE, WALKING, FOLLOWING, FIGHTING, DANCING, SLEEPING;
/*    */   private static final Map lookup;
/* 11 */   static { lookup = new HashMap<Object, Object>();
/* 12 */     for (EnumActState e : EnumSet.<EnumActState>allOf(EnumActState.class)) lookup.put(Integer.valueOf(e.ordinal()), e);  } public static EnumActState get(int intValue) {
/* 13 */     return (EnumActState)lookup.get(Integer.valueOf(intValue));
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/entity/EnumActState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */