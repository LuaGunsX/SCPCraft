/*     */ package SCPCraft.recipes;
/*     */ 
/*     */ import ModLoader;
/*     */ import SCPCraft.mod_SCP;
/*     */ import amq;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import ry;
/*     */ import up;
/*     */ import ur;
/*     */ import wp;
/*     */ import wq;
/*     */ import wr;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPDocumentManager
/*     */ {
/*  22 */   private static final SCPDocumentManager instance = new SCPDocumentManager();
/*  23 */   private yc worldObj = (yc)(ModLoader.getMinecraftInstance()).e;
/*     */   
/*     */   private List recipes;
/*     */   
/*     */   public static final SCPDocumentManager getInstance() {
/*  28 */     return instance;
/*     */   }
/*     */ 
/*     */   
/*     */   private SCPDocumentManager() {
/*  33 */     this.recipes = new ArrayList();
/*     */     
/*  35 */     addShapelessRecipe(new ur(mod_SCP.SCP173S, 1), new Object[] { mod_SCP.Pearl173, up.aK });
/*  36 */     addShapelessRecipe(new ur(mod_SCP.SCP111S, 1), new Object[] { mod_SCP.Pearl111, up.aK });
/*  37 */     addShapelessRecipe(new ur(mod_SCP.SCP914S, 1), new Object[] { mod_SCP.Pearl914, up.aK });
/*  38 */     addShapelessRecipe(new ur(mod_SCP.SCP019S, 1), new Object[] { mod_SCP.Pearl019, up.aK });
/*  39 */     addShapelessRecipe(new ur(mod_SCP.SCP457S, 1), new Object[] { mod_SCP.Pearl457, up.aK });
/*  40 */     addShapelessRecipe(new ur(mod_SCP.SCP294S, 1), new Object[] { mod_SCP.Pearl294, up.aK });
/*  41 */     addShapelessRecipe(new ur(mod_SCP.SCP513S, 1), new Object[] { mod_SCP.Pearl513, up.aK });
/*  42 */     addShapelessRecipe(new ur(mod_SCP.SCP049S, 1), new Object[] { mod_SCP.Pearl049, up.aK });
/*  43 */     addShapelessRecipe(new ur(mod_SCP.SCP087S, 1), new Object[] { mod_SCP.Pearl087, up.aK });
/*  44 */     addShapelessRecipe(new ur(mod_SCP.SCP1000S, 1), new Object[] { mod_SCP.Pearl1000, up.aK });
/*  45 */     addShapelessRecipe(new ur(mod_SCP.SCP131S, 1), new Object[] { mod_SCP.Pearl131, up.aK });
/*  46 */     addShapelessRecipe(new ur(mod_SCP.SCP999S, 1), new Object[] { mod_SCP.Pearl999, up.aK });
/*  47 */     addShapelessRecipe(new ur(mod_SCP.SCP629S, 1), new Object[] { mod_SCP.Pearl629, up.aK });
/*  48 */     addShapelessRecipe(new ur(mod_SCP.SCP354S, 1), new Object[] { mod_SCP.Pearl354, up.aK });
/*  49 */     addShapelessRecipe(new ur(mod_SCP.SCP096S, 1), new Object[] { mod_SCP.Pearl096, up.aK });
/*  50 */     addShapelessRecipe(new ur(mod_SCP.SCP261S, 1), new Object[] { mod_SCP.Pearl261, up.aK });
/*  51 */     addShapelessRecipe(new ur(mod_SCP.SCP106S, 1), new Object[] { mod_SCP.Pearl106, up.aK });
/*  52 */     addShapelessRecipe(new ur(mod_SCP.SCP538S, 1), new Object[] { mod_SCP.Pearl538, up.aK });
/*  53 */     addShapelessRecipe(new ur(mod_SCP.SCP280S, 1), new Object[] { mod_SCP.Pearl280, up.aK });
/*  54 */     addShapelessRecipe(new ur(mod_SCP.SCP080S, 1), new Object[] { mod_SCP.Pearl080, up.aK });
/*  55 */     addShapelessRecipe(new ur(mod_SCP.SCP143S, 1), new Object[] { mod_SCP.Pearl143, up.aK });
/*  56 */     addShapelessRecipe(new ur(mod_SCP.SCP409S, 1), new Object[] { mod_SCP.Pearl409, up.aK });
/*  57 */     addShapelessRecipe(new ur(mod_SCP.SCP310S, 1), new Object[] { mod_SCP.Pearl310, up.aK });
/*  58 */     addShapelessRecipe(new ur(mod_SCP.SCP594S, 1), new Object[] { mod_SCP.Pearl594, up.aK });
/*  59 */     addShapelessRecipe(new ur(mod_SCP.SCP058S, 1), new Object[] { mod_SCP.Pearl058, up.aK });
/*     */     
/*  61 */     addShapelessRecipe(new ur(mod_SCP.SCP006S, 1), new Object[] { mod_SCP.Pearl006, up.aK });
/*  62 */     addShapelessRecipe(new ur(mod_SCP.SCP966S, 1), new Object[] { mod_SCP.Pearl966, up.aK });
/*  63 */     addShapelessRecipe(new ur(mod_SCP.SCP872S, 1), new Object[] { mod_SCP.Pearl872, up.aK });
/*  64 */     addShapelessRecipe(new ur(mod_SCP.SCP079S, 1), new Object[] { mod_SCP.Pearl079, up.aK });
/*  65 */     addShapelessRecipe(new ur(mod_SCP.SCP073S, 1), new Object[] { mod_SCP.Pearl073, up.aK });
/*  66 */     addShapelessRecipe(new ur(mod_SCP.SCP076S, 1), new Object[] { mod_SCP.Pearl076, up.aK });
/*  67 */     addShapelessRecipe(new ur(mod_SCP.SCP015S, 1), new Object[] { mod_SCP.Pearl015, up.aK });
/*  68 */     addShapelessRecipe(new ur(mod_SCP.SCP053S, 1), new Object[] { mod_SCP.Pearl053, up.aK });
/*  69 */     addShapelessRecipe(new ur(mod_SCP.SCP997S, 1), new Object[] { mod_SCP.Pearl997, up.aK });
/*  70 */     addShapelessRecipe(new ur(mod_SCP.SCP027S, 1), new Object[] { mod_SCP.Pearl027, up.aK });
/*  71 */     addShapelessRecipe(new ur(mod_SCP.SCP789JS, 1), new Object[] { mod_SCP.Pearl789J, up.aK });
/*  72 */     addShapelessRecipe(new ur(mod_SCP.SCP079S, 1), new Object[] { mod_SCP.Pearl079, up.aK });
/*  73 */     addShapelessRecipe(new ur(mod_SCP.SCP151S, 1), new Object[] { mod_SCP.Pearl151, up.aK });
/*  74 */     addShapelessRecipe(new ur(mod_SCP.SCP372S, 1), new Object[] { mod_SCP.Pearl372, up.aK });
/*  75 */     addShapelessRecipe(new ur(mod_SCP.SCP472S, 1), new Object[] { mod_SCP.Pearl472, up.aK });
/*     */     
/*  77 */     addShapelessRecipe(new ur(mod_SCP.SCP273S, 1), new Object[] { mod_SCP.Pearl273, up.aK });
/*  78 */     addShapelessRecipe(new ur(mod_SCP.SCP822S, 1), new Object[] { mod_SCP.Pearl822, up.aK });
/*  79 */     addShapelessRecipe(new ur(mod_SCP.SCP023S, 1), new Object[] { mod_SCP.Pearl023, up.aK });
/*  80 */     addShapelessRecipe(new ur(mod_SCP.SCP002S, 1), new Object[] { mod_SCP.Pearl002, up.aK });
/*  81 */     addShapelessRecipe(new ur(mod_SCP.SCP009S, 1), new Object[] { mod_SCP.Pearl009, up.aK });
/*  82 */     addShapelessRecipe(new ur(mod_SCP.SCP500S, 1), new Object[] { new ur(mod_SCP.SCPItems, 1, 0), up.aK });
/*  83 */     addShapelessRecipe(new ur(mod_SCP.SCP063S, 1), new Object[] { new ur(mod_SCP.SCPItems, 1, 1), up.aK });
/*  84 */     addShapelessRecipe(new ur(mod_SCP.SCP1025S, 1), new Object[] { new ur(mod_SCP.SCPItems, 1, 2), up.aK });
/*  85 */     addShapelessRecipe(new ur(mod_SCP.SCP109S, 1), new Object[] { new ur(mod_SCP.SCPItems, 1, 3), up.aK });
/*  86 */     addShapelessRecipe(new ur(mod_SCP.SCP000JS, 1), new Object[] { new ur(mod_SCP.SCPItems, 1, 4), up.aK });
/*  87 */     addShapelessRecipe(new ur(mod_SCP.SCP50AEJS, 1), new Object[] { new ur(mod_SCP.SCPItems, 1, 5), up.aK });
/*  88 */     addShapelessRecipe(new ur(mod_SCP.SCP420JS, 1), new Object[] { new ur(mod_SCP.SCPItems, 1, 6), up.aK });
/*  89 */     addShapelessRecipe(new ur(mod_SCP.SCP458S, 1), new Object[] { new ur(mod_SCP.SCPItems, 1, 7), up.aK });
/*  90 */     addShapelessRecipe(new ur(mod_SCP.SCP217S, 1), new Object[] { new ur(mod_SCP.SCPItems, 1, 8), up.aK });
/*  91 */     addShapelessRecipe(new ur(mod_SCP.SCP912S, 1), new Object[] { new ur(mod_SCP.SCPItems, 1, 10), up.aK });
/*  92 */     System.out.println(this.recipes.size() + " documents");
/*     */   }
/*     */ 
/*     */   
/*     */   void addRecipe(ur itemstack, Object[] aobj) {
/*  97 */     String s = "";
/*  98 */     int i = 0;
/*  99 */     int j = 0;
/* 100 */     int k = 0;
/*     */     
/* 102 */     if (aobj[i] instanceof String[]) {
/*     */       
/* 104 */       String[] as = (String[])aobj[i++];
/*     */       
/* 106 */       for (int l = 0; l < as.length; l++)
/*     */       {
/* 108 */         String s2 = as[l];
/* 109 */         k++;
/* 110 */         j = s2.length();
/* 111 */         s = s + s2;
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/* 116 */       while (aobj[i] instanceof String) {
/*     */         
/* 118 */         String s1 = (String)aobj[i++];
/* 119 */         k++;
/* 120 */         j = s1.length();
/* 121 */         s = s + s1;
/*     */       } 
/*     */     } 
/*     */     
/* 125 */     HashMap<Object, Object> hashmap = new HashMap<Object, Object>();
/*     */     
/* 127 */     for (; i < aobj.length; i += 2) {
/*     */       
/* 129 */       Character character = (Character)aobj[i];
/* 130 */       ur itemstack1 = null;
/*     */       
/* 132 */       if (aobj[i + 1] instanceof up) {
/*     */         
/* 134 */         itemstack1 = new ur((up)aobj[i + 1]);
/*     */       }
/* 136 */       else if (aobj[i + 1] instanceof amq) {
/*     */         
/* 138 */         itemstack1 = new ur((amq)aobj[i + 1], 1, -1);
/*     */       }
/* 140 */       else if (aobj[i + 1] instanceof ur) {
/*     */         
/* 142 */         itemstack1 = (ur)aobj[i + 1];
/*     */       } 
/*     */       
/* 145 */       hashmap.put(character, itemstack1);
/*     */     } 
/*     */     
/* 148 */     ur[] aitemstack = new ur[j * k];
/*     */     
/* 150 */     for (int i1 = 0; i1 < j * k; i1++) {
/*     */       
/* 152 */       char c = s.charAt(i1);
/*     */       
/* 154 */       if (hashmap.containsKey(Character.valueOf(c))) {
/*     */         
/* 156 */         aitemstack[i1] = ((ur)hashmap.get(Character.valueOf(c))).l();
/*     */       }
/*     */       else {
/*     */         
/* 160 */         aitemstack[i1] = null;
/*     */       } 
/*     */     } 
/*     */     
/* 164 */     this.recipes.add(new wq(j, k, aitemstack, itemstack));
/*     */   }
/*     */ 
/*     */   
/*     */   void addShapelessRecipe(ur itemstack, Object[] aobj) {
/* 169 */     ArrayList<ur> arraylist = new ArrayList();
/* 170 */     Object[] aobj1 = aobj;
/* 171 */     int i = aobj1.length;
/*     */     
/* 173 */     for (int j = 0; j < i; j++) {
/*     */       
/* 175 */       Object obj = aobj1[j];
/*     */       
/* 177 */       if (obj instanceof ur) {
/*     */         
/* 179 */         arraylist.add(((ur)obj).l());
/*     */ 
/*     */       
/*     */       }
/* 183 */       else if (obj instanceof up) {
/*     */         
/* 185 */         arraylist.add(new ur((up)obj));
/*     */ 
/*     */       
/*     */       }
/* 189 */       else if (obj instanceof amq) {
/*     */         
/* 191 */         arraylist.add(new ur((amq)obj));
/*     */       }
/*     */       else {
/*     */         
/* 195 */         throw new RuntimeException("Invalid shapeless recipy!");
/*     */       } 
/*     */     } 
/*     */     
/* 199 */     this.recipes.add(new wr(itemstack, arraylist));
/*     */   }
/*     */   
/*     */   public ur func_82787_a(ry par1InventoryCrafting, yc par2World) {
/*     */     wp var12;
/* 204 */     int var3 = 0;
/* 205 */     ur var4 = null;
/* 206 */     ur var5 = null;
/*     */     
/* 208 */     for (int var6 = 0; var6 < par1InventoryCrafting.k_(); var6++) {
/*     */       
/* 210 */       ur var7 = par1InventoryCrafting.a(var6);
/*     */       
/* 212 */       if (var7 != null) {
/*     */         
/* 214 */         if (var3 == 0)
/*     */         {
/* 216 */           var4 = var7;
/*     */         }
/*     */         
/* 219 */         if (var3 == 1)
/*     */         {
/* 221 */           var5 = var7;
/*     */         }
/*     */         
/* 224 */         var3++;
/*     */       } 
/*     */     } 
/*     */     
/* 228 */     if (var3 == 2 && var4.c == var5.c && var4.a == 1 && var5.a == 1 && up.e[var4.c].isRepairable()) {
/*     */       
/* 230 */       up var13 = up.e[var4.c];
/* 231 */       int var14 = var13.m() - var4.i();
/* 232 */       int var8 = var13.m() - var5.i();
/* 233 */       int var9 = var14 + var8 + var13.m() * 5 / 100;
/* 234 */       int var10 = var13.m() - var9;
/*     */       
/* 236 */       if (var10 < 0)
/*     */       {
/* 238 */         var10 = 0;
/*     */       }
/*     */       
/* 241 */       return new ur(var4.c, 1, var10);
/*     */     } 
/*     */ 
/*     */     
/* 245 */     Iterator<wp> var11 = this.recipes.iterator();
/*     */ 
/*     */ 
/*     */     
/*     */     do {
/* 250 */       if (!var11.hasNext())
/*     */       {
/* 252 */         return null;
/*     */       }
/*     */       
/* 255 */       var12 = var11.next();
/*     */     }
/* 257 */     while (!var12.a(par1InventoryCrafting, par2World));
/*     */     
/* 259 */     return var12.a(par1InventoryCrafting);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List getRecipeList() {
/* 265 */     return this.recipes;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/recipes/SCPDocumentManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */