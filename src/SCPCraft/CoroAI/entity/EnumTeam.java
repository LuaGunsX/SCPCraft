/*    */ package SCPCraft.CoroAI.entity;
/*    */ 
/*    */ import java.util.EnumSet;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ public enum EnumTeam
/*    */ {
/*  9 */   PLAYER, KOA, HOSTILES, COMRADE;
/*    */   private static final Map lookup;
/* 11 */   static { lookup = new HashMap<Object, Object>();
/* 12 */     for (EnumTeam e : EnumSet.<EnumTeam>allOf(EnumTeam.class)) lookup.put(Integer.valueOf(e.ordinal()), e);  } public static EnumTeam get(int intValue) {
/* 13 */     return (EnumTeam)lookup.get(Integer.valueOf(intValue));
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/entity/EnumTeam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */