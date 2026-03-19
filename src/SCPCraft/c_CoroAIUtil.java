/*     */ package SCPCraft;
/*     */ 
/*     */ import ModLoader;
/*     */ import SCPCraft.CoroAI.PFQueue;
/*     */ import SCPCraft.CoroAI.PathEntityEx;
/*     */ import SCPCraft.CoroAI.entity.c_EnhAI;
/*     */ import SCPCraft.CoroAI.entity.c_PlayerProxy;
/*     */ import akd;
/*     */ import amq;
/*     */ import anm;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.lang.reflect.Field;
/*     */ import java.util.HashMap;
/*     */ import la;
/*     */ import lq;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import qx;
/*     */ import rp;
/*     */ import up;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class c_CoroAIUtil
/*     */ {
/*  32 */   public static String refl_mcp_Item_maxStackSize = "maxStackSize";
/*  33 */   public static String refl_c_Item_maxStackSize = "ch";
/*  34 */   public static String refl_s_Item_maxStackSize = "ch";
/*  35 */   public static String refl_mcp_Item_navigator = "navigator";
/*  36 */   public static String refl_c_Item_navigator = "bL";
/*  37 */   public static String refl_s_Item_navigator = "bL";
/*     */   
/*  39 */   public static String refl_mcp_EntityPlayer_itemInUse = "itemInUse";
/*  40 */   public static String refl_c_EntityPlayer_itemInUse = "f";
/*  41 */   public static String refl_s_EntityPlayer_itemInUse = "f";
/*  42 */   public static String refl_mcp_EntityPlayer_itemInUseCount = "itemInUseCount";
/*  43 */   public static String refl_c_EntityPlayer_itemInUseCount = "g";
/*  44 */   public static String refl_s_EntityPlayer_itemInUseCount = "g";
/*  45 */   public static String refl_mcp_FoodStats_foodLevel = "foodLevel";
/*  46 */   public static String refl_c_FoodStats_foodLevel = "a";
/*  47 */   public static String refl_s_FoodStats_foodLevel = "a";
/*     */   
/*  49 */   public static String refl_thrower_mcp = "thrower";
/*  50 */   public static String refl_thrower_obf = "g";
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public static Minecraft mc;
/*     */   
/*     */   public static boolean hasTropicraft = true;
/*     */   
/*  57 */   public static String tcE = "net.tropicraft.entities.";
/*  58 */   public static String[] koaEnemyWhitelist = new String[] { "EntityVMonkey", "EntityTropicalFish", "EntityEIH", "EntityTropicraftWaterMob", "EntityTropiCreeper", "EntityAmphibian" };
/*     */   
/*     */   public static up fishingRodTropical;
/*     */   public static up swordZircon;
/*     */   public static up leafBall;
/*  63 */   public static HashMap playerToAILookup = new HashMap<Object, Object>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean koaEnemy(lq ent) {
/*     */     try {
/*  71 */       if (hasTropicraft) {
/*  72 */         for (String entStr : koaEnemyWhitelist) {
/*  73 */           if (Class.forName(tcE + entStr).isInstance(ent)) {
/*  74 */             return false;
/*     */           }
/*     */         } 
/*     */       }
/*  78 */     } catch (Exception ex) {
/*  79 */       hasTropicraft = false;
/*     */     } 
/*     */     
/*  82 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean isEnemy(c_PlayerProxy ent, lq enemy) {
/*  86 */     if (enemy instanceof md && enemy != ent && !(enemy instanceof qc) && !(enemy instanceof pj) && !(enemy instanceof qd) && !(enemy instanceof qx) && koaEnemy(enemy))
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  92 */       return true;
/*     */     }
/*  94 */     return false;
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public static void watchWorldObj() {
/*  99 */     if (mc != null)
/* 100 */     { if (mc.e != PFQueue.worldMap) {
/* 101 */         System.out.print("PFQueue detecting new world, updating...");
/* 102 */         PFQueue.worldMap = (yc)mc.e;
/*     */       }  }
/* 104 */     else { mc = ModLoader.getMinecraftInstance(); }
/*     */   
/*     */   }
/*     */   public static boolean isNoPathBlock(lq ent, int id, int meta) {
/* 108 */     if (ent instanceof qx) {
/*     */       
/* 110 */       if (id >= 192 && id <= 197) {
/* 111 */         return true;
/*     */       }
/*     */       
/* 114 */       amq block = amq.p[id];
/*     */       
/* 116 */       if (block != null && block instanceof ake) {
/* 117 */         return true;
/*     */       }
/*     */       
/* 120 */       if (block != null && block instanceof ane) {
/* 121 */         return true;
/*     */       }
/*     */       
/* 124 */       if (block != null && block instanceof akd) {
/* 125 */         return !akd.c(meta);
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 134 */     return false;
/*     */   }
/*     */   
/*     */   public static Field s_getItemInUse() {
/* 138 */     return tryGetField(qx.class, refl_s_EntityPlayer_itemInUse, refl_mcp_EntityPlayer_itemInUse);
/*     */   }
/*     */   
/*     */   public static Field s_getItemInUseCount() {
/* 142 */     return tryGetField(qx.class, refl_s_EntityPlayer_itemInUseCount, refl_mcp_EntityPlayer_itemInUseCount);
/*     */   }
/*     */   
/*     */   public static Field s_getFoodLevel() {
/* 146 */     return tryGetField(rp.class, refl_s_FoodStats_foodLevel, refl_mcp_FoodStats_foodLevel);
/*     */   }
/*     */   
/*     */   public static Field tryGetField(Class theClass, String obf, String mcp) {
/* 150 */     Field field = null;
/*     */     try {
/* 152 */       field = theClass.getDeclaredField(obf);
/* 153 */       field.setAccessible(true);
/* 154 */     } catch (Exception ex) {
/*     */       
/* 156 */       try { field = theClass.getDeclaredField(mcp);
/* 157 */         field.setAccessible(true); }
/* 158 */       catch (Exception ex2) { ex2.printStackTrace(); }
/*     */     
/* 160 */     }  return field;
/*     */   }
/*     */   
/*     */   public static void setPrivateValueBoth(Class var0, Object var1, String obf, String mcp, Object var3) {
/*     */     try {
/*     */       try {
/* 166 */         setPrivateValue(var0, var1, obf, var3);
/* 167 */       } catch (NoSuchFieldException ex) {
/* 168 */         setPrivateValue(var0, var1, mcp, var3);
/*     */       } 
/* 170 */     } catch (Exception ex) {
/* 171 */       ex.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static Object getPrivateValueBoth(Class var0, Object var1, String obf, String mcp) {
/*     */     try {
/* 178 */       return getPrivateValue(var0, var1, obf);
/* 179 */     } catch (NoSuchFieldException ex) {
/* 180 */       return getPrivateValue(var0, var1, mcp);
/*     */     }
/* 182 */     catch (Exception ex) {
/* 183 */       ex.printStackTrace();
/*     */       
/* 185 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static Object getPrivateValue(Class var0, Object var1, String var2) throws IllegalArgumentException, SecurityException, NoSuchFieldException {
/*     */     try {
/* 192 */       Field var3 = var0.getDeclaredField(var2);
/* 193 */       var3.setAccessible(true);
/* 194 */       return var3.get(var1);
/*     */     }
/* 196 */     catch (IllegalAccessException var4) {
/*     */       
/* 198 */       ModLoader.throwException("An impossible error has occured!", var4);
/* 199 */       return null;
/*     */     } 
/*     */   }
/*     */   
/* 203 */   static Field field_modifiers = null;
/*     */   
/*     */   public static PathEntityEx pathToEntity;
/*     */   
/*     */   public static void setPrivateValue(Class var0, Object var1, int var2, Object var3) throws IllegalArgumentException, SecurityException, NoSuchFieldException {
/*     */     try {
/* 209 */       Field var4 = var0.getDeclaredFields()[var2];
/* 210 */       var4.setAccessible(true);
/* 211 */       int var5 = field_modifiers.getInt(var4);
/*     */       
/* 213 */       if ((var5 & 0x10) != 0)
/*     */       {
/* 215 */         field_modifiers.setInt(var4, var5 & 0xFFFFFFEF);
/*     */       }
/*     */       
/* 218 */       var4.set(var1, var3);
/*     */     }
/* 220 */     catch (IllegalAccessException var6) {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setPrivateValue(Class var0, Object var1, String var2, Object var3) throws IllegalArgumentException, SecurityException, NoSuchFieldException {
/*     */     try {
/* 231 */       if (field_modifiers == null) {
/* 232 */         field_modifiers = Field.class.getDeclaredField("modifiers");
/* 233 */         field_modifiers.setAccessible(true);
/*     */       } 
/*     */       
/* 236 */       Field var4 = var0.getDeclaredField(var2);
/* 237 */       int var5 = field_modifiers.getInt(var4);
/*     */       
/* 239 */       if ((var5 & 0x10) != 0)
/*     */       {
/* 241 */         field_modifiers.setInt(var4, var5 & 0xFFFFFFEF);
/*     */       }
/*     */       
/* 244 */       var4.setAccessible(true);
/* 245 */       var4.set(var1, var3);
/*     */     }
/* 247 */     catch (IllegalAccessException var6) {}
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
/*     */   public static boolean AIRightClickHook(c_PlayerProxy ent, ur itemToUse) {
/* 303 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setPrjOwnerHook(c_PlayerProxy ent, lq lastEnt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setItems_JobHunt(c_PlayerProxy ent) {
/* 316 */     getTropiItemRefl("swordZircon", swordZircon);
/* 317 */     if (swordZircon != null) ent.inventory.a(new ur(swordZircon, 1));
/*     */     
/* 319 */     getTropiItemRefl("leafBall", leafBall);
/* 320 */     if (leafBall != null) ent.inventory.a(new ur(leafBall, 1));
/*     */     
/* 322 */     ent.wantedItems.add(Integer.valueOf(up.aU.cj));
/* 323 */     ent.wantedItems.add(Integer.valueOf(up.aV.cj));
/* 324 */     ent.wantedItems.add(Integer.valueOf(up.aq.cj));
/* 325 */     ent.wantedItems.add(Integer.valueOf(up.ar.cj));
/* 326 */     ent.wantedItems.add(Integer.valueOf(up.bk.cj));
/* 327 */     ent.wantedItems.add(Integer.valueOf(up.bl.cj));
/*     */   }
/*     */ 
/*     */   
/*     */   public static up getTropiItemRefl(String fieldName, up cache) {
/*     */     try {
/* 333 */       if (hasTropicraft && 
/* 334 */         cache == null) {
/* 335 */         Class<?> clazz = Class.forName("net.tropicraft.mods.TropicraftMod");
/*     */         
/* 337 */         if (clazz != null) {
/* 338 */           cache = (up)getPrivateValue(clazz, clazz, fieldName);
/* 339 */           if (cache == null) {
/* 340 */             hasTropicraft = false;
/*     */           } else {
/* 342 */             setPrivateValue(c_CoroAIUtil.class, c_CoroAIUtil.class, fieldName, cache);
/*     */           } 
/*     */         } else {
/* 345 */           hasTropicraft = false;
/*     */         }
/*     */       
/*     */       }
/*     */     
/*     */     }
/* 351 */     catch (Exception ex) {
/* 352 */       hasTropicraft = false;
/* 353 */       System.out.println("this really shouldnt ever happen unless fishing job is used outside tropicraft");
/*     */     } 
/*     */     
/* 356 */     return cache;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void equipFishingRod(c_EnhAI ent) {
/* 362 */     getTropiItemRefl("fishingRodTropical", fishingRodTropical);
/* 363 */     if (fishingRodTropical != null) ent.setCurrentItem(fishingRodTropical.cj);
/*     */   
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
/*     */   public static boolean tryTransferToChest(c_EnhAI ent, int x, int y, int z) {
/* 395 */     anm chest = (anm)ent.p.q(x, y, z);
/* 396 */     if (chest != null) {
/* 397 */       ent.openHomeChest();
/* 398 */       ent.job.getPrimaryJobClass().transferItems((la)ent.inventory, (la)chest, -1, -1, true);
/* 399 */       return true;
/*     */     } 
/* 401 */     return false;
/*     */   }
/*     */   
/*     */   public static void setItems_JobGather(c_PlayerProxy ent) {
/* 405 */     ent.wantedItems.add(Integer.valueOf(amq.M.cm));
/*     */   }
/*     */   
/*     */   public static void setItems_JobFish(c_PlayerProxy ent) {
/* 409 */     getTropiItemRefl("swordZircon", swordZircon);
/* 410 */     if (swordZircon != null) ent.inventory.a(new ur(swordZircon, 1));
/*     */     
/* 412 */     getTropiItemRefl("fishingRodTropical", fishingRodTropical);
/* 413 */     if (fishingRodTropical != null) ent.inventory.a(new ur(fishingRodTropical, 1));
/*     */     
/* 415 */     ent.wantedItems.add(Integer.valueOf(up.aU.cj));
/* 416 */     ent.wantedItems.add(Integer.valueOf(up.aV.cj));
/*     */   }
/*     */   
/*     */   public static boolean isServer() {
/* 420 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static qx getFirstPlayer() {
/* 426 */     return null;
/*     */   }
/*     */   
/*     */   public static boolean isChest(int id) {
/* 430 */     if (id == 0) return false; 
/* 431 */     amq block = amq.p[id];
/* 432 */     if (block != null && 
/* 433 */       block instanceof ajk) return true;
/*     */     
/* 435 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean newPath = false;
/*     */   
/*     */   public static void playerPathfindCallback(PathEntityEx pathEx) {
/* 442 */     pathToEntity = pathEx;
/* 443 */     newPath = true;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/c_CoroAIUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */