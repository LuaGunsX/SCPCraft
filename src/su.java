/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class su
/*     */   extends up
/*     */ {
/*  11 */   private static final int[] co = new int[] { 11, 16, 15, 13 };
/*     */ 
/*     */ 
/*     */   
/*     */   public final int a;
/*     */ 
/*     */ 
/*     */   
/*     */   public final int b;
/*     */ 
/*     */ 
/*     */   
/*     */   public final int c;
/*     */ 
/*     */ 
/*     */   
/*     */   private final sv cp;
/*     */ 
/*     */ 
/*     */   
/*     */   public su(int par1, sv par2EnumArmorMaterial, int par3, int par4) {
/*  32 */     super(par1);
/*  33 */     this.cp = par2EnumArmorMaterial;
/*  34 */     this.a = par4;
/*  35 */     this.c = par3;
/*  36 */     this.b = par2EnumArmorMaterial.b(par4);
/*  37 */     e(par2EnumArmorMaterial.a(par4));
/*  38 */     this.ck = 1;
/*  39 */     a(tj.j);
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int a(ur par1ItemStack, int par2) {
/*  45 */     if (par2 > 0)
/*     */     {
/*  47 */       return 16777215;
/*     */     }
/*     */ 
/*     */     
/*  51 */     int var3 = b(par1ItemStack);
/*     */     
/*  53 */     if (var3 < 0)
/*     */     {
/*  55 */       var3 = 16777215;
/*     */     }
/*     */     
/*  58 */     return var3;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public boolean b() {
/*  65 */     return (this.cp == sv.a);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c() {
/*  73 */     return this.cp.a();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public sv d() {
/*  81 */     return this.cp;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(ur par1ItemStack) {
/*  89 */     return (this.cp != sv.a) ? false : (!par1ItemStack.o() ? false : (!par1ItemStack.p().b("display") ? false : par1ItemStack.p().l("display").b("color")));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int b(ur par1ItemStack) {
/*  97 */     if (this.cp != sv.a)
/*     */     {
/*  99 */       return -1;
/*     */     }
/*     */ 
/*     */     
/* 103 */     bq var2 = par1ItemStack.p();
/*     */     
/* 105 */     if (var2 == null)
/*     */     {
/* 107 */       return 10511680;
/*     */     }
/*     */ 
/*     */     
/* 111 */     bq var3 = var2.l("display");
/* 112 */     return (var3 == null) ? 10511680 : (var3.b("color") ? var3.e("color") : 10511680);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int a(int par1, int par2) {
/* 124 */     return (par2 == 1) ? (this.cl + 144) : super.a(par1, par2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(ur par1ItemStack) {
/* 132 */     if (this.cp == sv.a) {
/*     */       
/* 134 */       bq var2 = par1ItemStack.p();
/*     */       
/* 136 */       if (var2 != null) {
/*     */         
/* 138 */         bq var3 = var2.l("display");
/*     */         
/* 140 */         if (var3.b("color"))
/*     */         {
/* 142 */           var3.o("color");
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ur par1ItemStack, int par2) {
/* 150 */     if (this.cp != sv.a)
/*     */     {
/* 152 */       throw new UnsupportedOperationException("Can't dye non-leather!");
/*     */     }
/*     */ 
/*     */     
/* 156 */     bq var3 = par1ItemStack.p();
/*     */     
/* 158 */     if (var3 == null) {
/*     */       
/* 160 */       var3 = new bq();
/* 161 */       par1ItemStack.d(var3);
/*     */     } 
/*     */     
/* 164 */     bq var4 = var3.l("display");
/*     */     
/* 166 */     if (!var3.b("display"))
/*     */     {
/* 168 */       var3.a("display", var4);
/*     */     }
/*     */     
/* 171 */     var4.a("color", par2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(ur par1ItemStack, ur par2ItemStack) {
/* 180 */     return (this.cp.b() == par2ItemStack.c) ? true : super.a(par1ItemStack, par2ItemStack);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int[] e() {
/* 190 */     return co;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/su.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */