/*    */ package SCPCraft.CoroAI.entity;
/*    */ 
/*    */ import java.util.EnumSet;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ public enum EnumJob
/*    */ {
/*  9 */   INVADER,
/*    */   
/* 11 */   SHAMAN, WEATHERGURU, CHIEF, FISHERMAN, HUNTER, GATHERER, COOK,
/* 12 */   UNEMPLOYED, FINDFOOD, TRADING, PROTECT,
/*    */   
/* 14 */   PLAYER_SURVIVE, PLAYER_HUNT, PLAYER_FOLLOW;
/*    */   private static final Map lookup;
/*    */   
/* 17 */   static { lookup = new HashMap<Object, Object>();
/* 18 */     for (EnumJob e : EnumSet.<EnumJob>allOf(EnumJob.class)) lookup.put(Integer.valueOf(e.ordinal()), e);  } public static EnumJob get(int intValue) {
/* 19 */     return (EnumJob)lookup.get(Integer.valueOf(intValue));
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/entity/EnumJob.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */