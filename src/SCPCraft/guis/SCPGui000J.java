/*     */ package SCPCraft.guis;
/*     */ 
/*     */ import SCPCraft.SCPInventory000J;
/*     */ import SCPCraft.containerslots.SCPCraftingInventoryRecipeBookCB;
/*     */ import atb;
/*     */ import avf;
/*     */ import la;
/*     */ import org.lwjgl.input.Mouse;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import qx;
/*     */ import rq;
/*     */ 
/*     */ public class SCPGui000J
/*     */   extends avf
/*     */ {
/*     */   private SCPInventory000J recipes;
/*     */   private qx player;
/*     */   public static final int BORDER = 4;
/*     */   public static final int ROWS = 4;
/*     */   public static final int COLUMNS = 3;
/*     */   public static final int ENTRIES = 12;
/*     */   public static final int GRIDX = 5;
/*     */   public static final int GRIDY = 6;
/*     */   public static final int CRAFTX = 99;
/*     */   public static final int CRAFTY = 24;
/*     */   public static final int IMGWIDTH = 176;
/*     */   public static final int IMGHEIGHT = 166;
/*     */   public static final int IMGMIDX = 29;
/*     */   public static final int IMGMIDY = 15;
/*     */   public static final int MIDWIDTH = 117;
/*     */   public static final int MIDHEIGHT = 55;
/*     */   private final SCPInventory000J inv;
/*     */   
/*     */   public SCPGui000J(SCPInventory000J var1, qx pl) {
/*  35 */     super((rq)new SCPCraftingInventoryRecipeBookCB((la)var1));
/*  36 */     this.player = pl;
/*  37 */     this.inv = var1;
/*  38 */     this.b = 359;
/*  39 */     this.c = 228;
/*  40 */     this.recipes = this.inv;
/*     */   }
/*     */   
/*     */   public void A_() {
/*  44 */     int h = (this.h - 166) / 2;
/*  45 */     int w = (this.g - 176) / 2;
/*  46 */     this.i.clear();
/*  47 */     this.i.add(new atb(1, w + 210, h - 35, 30, 20, "Quit"));
/*  48 */     this.i.add(new atb(2, w + 265, h + 75, 30, 20, "--->"));
/*  49 */     this.i.add(new atb(3, w - 120, h + 75, 30, 20, "<---"));
/*  50 */     super.A_();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void drawGuiContainerForegroundLayer() {
/*  55 */     String var1 = this.inv.b();
/*  56 */     this.l.b(var1, this.b - this.l.a(var1) - 3, 6, 4210752);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(int par1, int par2, int par3) {
/*  64 */     if (par3 == 0)
/*     */     {
/*  66 */       for (int var4 = 0; var4 < this.i.size(); var4++) {
/*     */         
/*  68 */         atb var5 = this.i.get(var4);
/*     */         
/*  70 */         if (var5.c(this.f, par1, par2)) {
/*     */           
/*  72 */           this.f.A.a("random.click", 1.0F, 1.0F);
/*  73 */           a(var5);
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(atb button) {
/*  81 */     if (button.f == 1)
/*     */     {
/*  83 */       this.player.i();
/*     */     }
/*  85 */     if (button.f == 2)
/*     */     {
/*  87 */       if (this.recipes.getIndex() / 12 + 1 != this.recipes.totalPages) this.recipes.incIndex(); 
/*     */     }
/*  89 */     if (button.f == 3)
/*     */     {
/*  91 */       if (this.recipes.getIndex() / 12 + 1 != 1) this.recipes.decIndex();
/*     */     
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(float var1, int var2, int var3) {
/* 100 */     int var4 = this.f.o.b("/SCPCraft/textures/guis/SCP000J.png");
/* 101 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 102 */     this.f.o.b(var4);
/* 103 */     int var5 = this.g - this.b >> 1;
/* 104 */     int var6 = this.h - this.c >> 1;
/* 105 */     int var7 = Mouse.getDWheel();
/* 106 */     int h = (this.h - 166) / 2;
/* 107 */     int w = (this.g - 176) / 2;
/*     */     
/* 109 */     if (var7 < 0 && this.recipes.getIndex() / 12 + 1 != 1) this.recipes.decIndex(); 
/* 110 */     if (var7 > 0 && this.recipes.getIndex() / 12 + 1 != this.recipes.totalPages) this.recipes.incIndex();
/*     */     
/* 112 */     int var8 = (this.b - 8) / 3;
/*     */     
/*     */     int var9;
/* 115 */     for (var9 = 0; var9 < 3; var9++) {
/*     */       
/* 117 */       b(var5 + 4 + var9 * var8, var6, 4, 0, var8, 4);
/* 118 */       b(var5 + 4 + var9 * var8, var6 + this.c - 4, 4, 162, var8, 4);
/*     */     } 
/*     */     
/* 121 */     var9 = (this.c - 8) / 4;
/*     */     
/*     */     int var10;
/* 124 */     for (var10 = 0; var10 < 4; var10++) {
/*     */       
/* 126 */       b(var5, var6 + 4 + var10 * var9, 0, 4, 4, var9);
/* 127 */       b(var5 + this.b - 4, var6 + 4 + var10 * var9, 172, 4, 4, var9);
/*     */     } 
/*     */     
/* 130 */     b(var5, var6, 0, 0, 4, 4);
/* 131 */     b(var5 + 4 + 351, var6, 172, 0, 4, 4);
/* 132 */     b(var5, var6 + this.c - 4, 0, 162, 4, 4);
/* 133 */     b(var5 + this.b - 4, var6 + this.c - 4, 172, 162, 4, 4);
/*     */     
/* 135 */     for (var10 = 0; var10 < 3; var10++) {
/*     */       
/* 137 */       for (int var11 = 0; var11 < 4; var11++)
/*     */       {
/* 139 */         b(var5 + 4 + var10 * 117, var6 + 4 + var11 * 55, 29, 15, 117, 55);
/*     */       }
/*     */     } 
/* 142 */     a(this.l, "SCP-000J", this.g / 2 + 20, h - 25, 16777215);
/* 143 */     a(this.l, Integer.toString(this.recipes.getIndex() / 12 + 1) + "/" + Integer.toString(this.recipes.totalPages), this.g / 2 + 20, h + 185, 16777215);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean f() {
/* 151 */     return true;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/guis/SCPGui000J.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */