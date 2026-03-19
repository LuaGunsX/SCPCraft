/*     */ package SCPCraft;
/*     */ 
/*     */ import ModLoader;
/*     */ import SCPCraft.recipes.SCPRecipes000J;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import la;
/*     */ import qx;
/*     */ import ur;
/*     */ import wp;
/*     */ import wq;
/*     */ import wr;
/*     */ 
/*     */ 
/*     */ public class SCPInventory000J
/*     */   implements la
/*     */ {
/*  18 */   private static List recipes = null;
/*     */   private final ur book;
/*  20 */   private int index = -1;
/*     */   
/*     */   public int totalPages;
/*     */   public ur[][] items;
/*     */   
/*     */   public SCPInventory000J(ur var1) {
/*  26 */     this.items = new ur[12][];
/*  27 */     recipes = Collections.unmodifiableList(SCPRecipes000J.getInstance().getRecipeList());
/*  28 */     this.book = var1;
/*  29 */     int var2 = 0;
/*     */     
/*  31 */     if (this.book != null)
/*     */     {
/*  33 */       var2 = this.book.j();
/*     */     }
/*     */     
/*  36 */     update();
/*  37 */     this.index = setIndex(var2);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void update() {
/*     */     try {
/*  44 */       this.index = setIndex(0);
/*  45 */       this; this.totalPages = (recipes.size() - 1) / 12 + 1;
/*     */     }
/*  47 */     catch (Throwable var5) {
/*     */       
/*  49 */       ModLoader.getLogger().throwing("RecipeInventory", "update", var5);
/*  50 */       ModLoader.throwException("Exception in RecipeInventory", var5);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void decIndex() {
/*  56 */     this.index = setIndex(this.index - 12);
/*     */   }
/*     */ 
/*     */   
/*     */   public void incIndex() {
/*  61 */     this.index = setIndex(this.index + 12);
/*     */   }
/*     */ 
/*     */   
/*     */   public int getIndex() {
/*  66 */     return this.index;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int setIndex(int var1) {
/*     */     try {
/*  73 */       if (this.totalPages == 1) {
/*     */         
/*  75 */         var1 = 0;
/*     */       }
/*  77 */       else if (var1 < 0) {
/*     */         
/*  79 */         this; this; var1 = recipes.size() - recipes.size() % 12;
/*     */       } else {
/*  81 */         this; if (var1 >= recipes.size())
/*     */         {
/*  83 */           var1 = 0;
/*     */         }
/*     */       } 
/*  86 */       this.items = new ur[12][];
/*     */       
/*  88 */       for (int var2 = 0; var2 < 12; var2++) {
/*     */         
/*  90 */         int var3 = var1 + var2;
/*     */         
/*  92 */         this; if (var3 < recipes.size()) {
/*     */           
/*  94 */           this; wp var4 = recipes.get(var3);
/*  95 */           ur[] var5 = getRecipeArray(var4);
/*     */           
/*  97 */           if (var5 == null) {
/*     */             
/*  99 */             var1++;
/* 100 */             var2--;
/*     */           }
/*     */           else {
/*     */             
/* 104 */             this.items[var2] = var5;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 109 */       if (this.book != null)
/*     */       {
/* 111 */         this.book.b(var1);
/*     */       }
/*     */       
/* 114 */       return var1;
/*     */     }
/* 116 */     catch (Throwable var6) {
/*     */       
/* 118 */       ModLoader.getLogger().throwing("RecipeInventory", "setIndex", var6);
/* 119 */       ModLoader.throwException("Exception in RecipeInventory", var6);
/* 120 */       return 0;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int k_() {
/* 129 */     return 120;
/*     */   }
/*     */ 
/*     */   
/*     */   private ur[] getRecipeArray(wp var1) throws IllegalArgumentException, SecurityException, NoSuchFieldException {
/* 134 */     if (var1.a() > 9)
/*     */     {
/* 136 */       return null;
/*     */     }
/*     */ 
/*     */     
/* 140 */     ur[] var2 = new ur[10];
/* 141 */     var2[0] = var1.b();
/*     */ 
/*     */     
/* 144 */     if (var1 instanceof wq) {
/*     */       
/* 146 */       int var3 = ((Integer)ModLoader.getPrivateValue(wq.class, var1, 0)).intValue();
/* 147 */       int var4 = ((Integer)ModLoader.getPrivateValue(wq.class, var1, 1)).intValue();
/* 148 */       ur[] var5 = (ur[])ModLoader.getPrivateValue(wq.class, var1, 2);
/*     */       
/* 150 */       for (int var6 = 0; var6 < var5.length; var6++)
/*     */       {
/* 152 */         int var7 = var6 % var3;
/* 153 */         int var8 = var6 / var3;
/* 154 */         var2[var7 + var8 * 3 + 1] = var5[var6];
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/* 159 */       if (!(var1 instanceof wr))
/*     */       {
/* 161 */         return null;
/*     */       }
/*     */       
/* 164 */       List<ur> var9 = (List)ModLoader.getPrivateValue(wr.class, var1, 1);
/*     */       
/* 166 */       for (int var4 = 0; var4 < var9.size(); var4++)
/*     */       {
/* 168 */         var2[var4 + 1] = var9.get(var4);
/*     */       }
/*     */     } 
/*     */     
/* 172 */     return var2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ur a(int var1, int var2) {
/* 182 */     if (this.book != null)
/*     */     {
/* 184 */       this.book.d = null;
/*     */     }
/* 186 */     update();
/* 187 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int var1, ur var2) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a_(qx var1) {
/* 200 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String b() {
/* 208 */     StringBuilder var1 = new StringBuilder();
/* 209 */     var1.append(this.index / 12 + 1);
/* 210 */     var1.append('/');
/* 211 */     var1.append(this.totalPages);
/* 212 */     return var1.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ur a(int var1) {
/* 220 */     ur[] var2 = this.items[var1 / 10];
/* 221 */     if (var2 == null)
/*     */     {
/* 223 */       var2 = this.items[var1 / 10] = new ur[10];
/*     */     }
/* 225 */     return var2[var1 % 10];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c() {
/* 234 */     return 64;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void d() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ur a_(int var1) {
/* 248 */     return null;
/*     */   }
/*     */   
/*     */   public void f() {}
/*     */   
/*     */   public void l_() {}
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/SCPInventory000J.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */