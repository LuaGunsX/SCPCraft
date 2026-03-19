/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import afj;
/*     */ import afp;
/*     */ import com.google.common.collect.ArrayListMultimap;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Multimap;
/*     */ import cpw.mods.fml.common.FMLLog;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import kt;
/*     */ import up;
/*     */ import xu;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPVillagerRegistry
/*     */ {
/*  31 */   private static final SCPVillagerRegistry INSTANCE = new SCPVillagerRegistry();
/*     */   
/*  33 */   private Multimap tradeHandlers = (Multimap)ArrayListMultimap.create();
/*  34 */   private Map villageCreationHandlers = Maps.newHashMap();
/*  35 */   private Map newVillagers = Maps.newHashMap();
/*  36 */   private List newVillagerIds = Lists.newArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static SCPVillagerRegistry instance() {
/*  97 */     return INSTANCE;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void registerVillagerType(int villagerId, String villagerSkin) {
/* 108 */     if (this.newVillagers.containsKey(Integer.valueOf(villagerId))) {
/*     */       
/* 110 */       FMLLog.severe("Attempt to register duplicate villager id %d", new Object[] { Integer.valueOf(villagerId) });
/* 111 */       throw new RuntimeException();
/*     */     } 
/* 113 */     this.newVillagers.put(Integer.valueOf(villagerId), villagerSkin);
/* 114 */     this.newVillagerIds.add(Integer.valueOf(villagerId));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void registerVillageCreationHandler(IVillageCreationHandler handler) {
/* 124 */     this.villageCreationHandlers.put(handler.getComponentClass(), handler);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void registerVillageTradeHandler(int villagerId, IVillageTradeHandler handler) {
/* 135 */     this.tradeHandlers.put(Integer.valueOf(villagerId), handler);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getVillagerSkin(int villagerType, String defaultSkin) {
/* 146 */     if ((instance()).newVillagers.containsKey(Integer.valueOf(villagerType)))
/*     */     {
/* 148 */       return (String)(instance()).newVillagers.get(Integer.valueOf(villagerType));
/*     */     }
/* 150 */     return defaultSkin;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void manageVillagerTrades(xu recipeList, SCPEntity217Testificate villager, int villagerType, Random random) {
/* 163 */     for (IVillageTradeHandler handler : (instance()).tradeHandlers.get(Integer.valueOf(villagerType)))
/*     */     {
/* 165 */       handler.manipulateTradesForVillager(villager, recipeList, random);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static void addExtraVillageComponents(ArrayList<afj> components, Random random, int i) {
/* 171 */     List<afj> parts = components;
/* 172 */     for (IVillageCreationHandler handler : (instance()).villageCreationHandlers.values())
/*     */     {
/* 174 */       parts.add(handler.getVillagePieceWeight(random, i));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static Object getVillageComponent(afj villagePiece, afp startPiece, List pieces, Random random, int p1, int p2, int p3, int p4, int p5) {
/* 181 */     return ((IVillageCreationHandler)(instance()).villageCreationHandlers.get(villagePiece.a)).buildComponent(villagePiece, startPiece, pieces, random, p1, p2, p3, p4, p5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void addEmeraldBuyRecipe(SCPEntity217Testificate villager, xu list, Random random, up item, float chance, int min, int max) {
/* 187 */     if (min > 0 && max > 0)
/*     */     {
/* 189 */       SCPEntity217Testificate.villagerStockList.put(Integer.valueOf(item.cj), new kt(Integer.valueOf(min), Integer.valueOf(max)));
/*     */     }
/* 191 */     SCPEntity217Testificate.addMerchantItem(list, item.m(), random, chance);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void addEmeraldSellRecipe(SCPEntity217Testificate villager, xu list, Random random, up item, float chance, int min, int max) {
/* 196 */     if (min > 0 && max > 0)
/*     */     {
/* 198 */       SCPEntity217Testificate.blacksmithSellingList.put(Integer.valueOf(item.cj), new kt(Integer.valueOf(min), Integer.valueOf(max)));
/*     */     }
/* 200 */     SCPEntity217Testificate.addBlacksmithItem(list, item.m(), random, chance);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void applyRandomTrade(SCPEntity217Testificate villager, Random rand) {
/* 205 */     int extra = (instance()).newVillagerIds.size();
/* 206 */     int trade = rand.nextInt(5 + extra);
/* 207 */     villager.setProfession((trade < 5) ? trade : ((Integer)(instance()).newVillagerIds.get(trade - 5)).intValue());
/*     */   }
/*     */   
/*     */   public static interface IVillageTradeHandler {
/*     */     void manipulateTradesForVillager(SCPEntity217Testificate param1SCPEntity217Testificate, xu param1xu, Random param1Random);
/*     */   }
/*     */   
/*     */   public static interface IVillageCreationHandler {
/*     */     afj getVillagePieceWeight(Random param1Random, int param1Int);
/*     */     
/*     */     Class getComponentClass();
/*     */     
/*     */     Object buildComponent(afj param1afj, afp param1afp, List param1List, Random param1Random, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPVillagerRegistry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */