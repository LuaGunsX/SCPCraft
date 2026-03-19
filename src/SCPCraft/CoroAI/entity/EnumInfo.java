/*    */ package SCPCraft.CoroAI.entity;
/*    */ 
/*    */ import java.util.EnumSet;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ public enum EnumInfo
/*    */ {
/*  9 */   HOME_COORD, FOOD_COORD, FOOD_ENTITY, DIPL_WARN;
/*    */   private static final Map lookup;
/* 11 */   static { lookup = new HashMap<Object, Object>();
/* 12 */     for (EnumInfo e : EnumSet.<EnumInfo>allOf(EnumInfo.class)) lookup.put(Integer.valueOf(e.ordinal()), e);  } public static EnumInfo get(int intValue) {
/* 13 */     return (EnumInfo)lookup.get(Integer.valueOf(intValue));
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/entity/EnumInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */