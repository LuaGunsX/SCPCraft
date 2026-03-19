/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ll
/*     */ {
/*  13 */   public static final ll[] a = new ll[32];
/*  14 */   public static final ll b = null;
/*  15 */   public static final ll c = (new ll(1, false, 8171462)).b("potion.moveSpeed").b(0, 0);
/*  16 */   public static final ll d = (new ll(2, true, 5926017)).b("potion.moveSlowdown").b(1, 0);
/*  17 */   public static final ll e = (new ll(3, false, 14270531)).b("potion.digSpeed").b(2, 0).a(1.5D);
/*  18 */   public static final ll f = (new ll(4, true, 4866583)).b("potion.digSlowDown").b(3, 0);
/*  19 */   public static final ll g = (new ll(5, false, 9643043)).b("potion.damageBoost").b(4, 0);
/*  20 */   public static final ll h = (new lk(6, false, 16262179)).b("potion.heal");
/*  21 */   public static final ll i = (new lk(7, true, 4393481)).b("potion.harm");
/*  22 */   public static final ll j = (new ll(8, false, 7889559)).b("potion.jump").b(2, 1);
/*  23 */   public static final ll k = (new ll(9, true, 5578058)).b("potion.confusion").b(3, 1).a(0.25D);
/*     */ 
/*     */   
/*  26 */   public static final ll l = (new ll(10, false, 13458603)).b("potion.regeneration").b(7, 0).a(0.25D);
/*  27 */   public static final ll m = (new ll(11, false, 10044730)).b("potion.resistance").b(6, 1);
/*     */ 
/*     */   
/*  30 */   public static final ll n = (new ll(12, false, 14981690)).b("potion.fireResistance").b(7, 1);
/*     */ 
/*     */   
/*  33 */   public static final ll o = (new ll(13, false, 3035801)).b("potion.waterBreathing").b(0, 2);
/*     */ 
/*     */   
/*  36 */   public static final ll p = (new ll(14, false, 8356754)).b("potion.invisibility").b(0, 1);
/*     */ 
/*     */   
/*  39 */   public static final ll q = (new ll(15, true, 2039587)).b("potion.blindness").b(5, 1).a(0.25D);
/*     */ 
/*     */   
/*  42 */   public static final ll r = (new ll(16, false, 2039713)).b("potion.nightVision").b(4, 1);
/*     */ 
/*     */   
/*  45 */   public static final ll s = (new ll(17, true, 5797459)).b("potion.hunger").b(1, 1);
/*     */ 
/*     */   
/*  48 */   public static final ll t = (new ll(18, true, 4738376)).b("potion.weakness").b(5, 0);
/*     */ 
/*     */   
/*  51 */   public static final ll u = (new ll(19, true, 5149489)).b("potion.poison").b(6, 0).a(0.25D);
/*     */ 
/*     */   
/*  54 */   public static final ll v = (new ll(20, true, 3484199)).b("potion.wither").b(1, 2).a(0.25D);
/*  55 */   public static final ll w = null;
/*  56 */   public static final ll x = null;
/*  57 */   public static final ll y = null;
/*  58 */   public static final ll z = null;
/*  59 */   public static final ll A = null;
/*  60 */   public static final ll B = null;
/*  61 */   public static final ll C = null;
/*  62 */   public static final ll D = null;
/*  63 */   public static final ll E = null;
/*  64 */   public static final ll F = null;
/*  65 */   public static final ll G = null;
/*     */ 
/*     */   
/*     */   public final int H;
/*     */ 
/*     */   
/*  71 */   private String I = "";
/*     */ 
/*     */   
/*  74 */   private int J = -1;
/*     */ 
/*     */   
/*     */   private final boolean K;
/*     */ 
/*     */   
/*     */   private double L;
/*     */ 
/*     */   
/*     */   private boolean M;
/*     */   
/*     */   private final int N;
/*     */ 
/*     */   
/*     */   public ll(int par1, boolean par2, int par3) {
/*  89 */     this.H = par1;
/*  90 */     a[par1] = this;
/*  91 */     this.K = par2;
/*     */     
/*  93 */     if (par2) {
/*     */       
/*  95 */       this.L = 0.5D;
/*     */     }
/*     */     else {
/*     */       
/*  99 */       this.L = 1.0D;
/*     */     } 
/*     */     
/* 102 */     this.N = par3;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ll b(int par1, int par2) {
/* 111 */     this.J = par1 + par2 * 8;
/* 112 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c() {
/* 120 */     return this.H;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md par1EntityLiving, int par2) {
/* 125 */     if (this.H == l.H) {
/*     */       
/* 127 */       if (par1EntityLiving.aU() < par1EntityLiving.aT())
/*     */       {
/* 129 */         par1EntityLiving.i(1);
/*     */       }
/*     */     }
/* 132 */     else if (this.H == u.H) {
/*     */       
/* 134 */       if (par1EntityLiving.aU() > 1)
/*     */       {
/* 136 */         par1EntityLiving.a(lh.m, 1);
/*     */       }
/*     */     }
/* 139 */     else if (this.H == v.H) {
/*     */       
/* 141 */       par1EntityLiving.a(lh.n, 1);
/*     */     }
/* 143 */     else if (this.H == s.H && par1EntityLiving instanceof qx) {
/*     */       
/* 145 */       ((qx)par1EntityLiving).j(0.025F * (par2 + 1));
/*     */     }
/* 147 */     else if ((this.H != h.H || par1EntityLiving.bA()) && (this.H != i.H || !par1EntityLiving.bA())) {
/*     */       
/* 149 */       if ((this.H == i.H && !par1EntityLiving.bA()) || (this.H == h.H && par1EntityLiving.bA()))
/*     */       {
/* 151 */         par1EntityLiving.a(lh.m, 6 << par2);
/*     */       }
/*     */     }
/*     */     else {
/*     */       
/* 156 */       par1EntityLiving.i(6 << par2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(md par1EntityLiving, md par2EntityLiving, int par3, double par4) {
/* 167 */     if ((this.H != h.H || par2EntityLiving.bA()) && (this.H != i.H || !par2EntityLiving.bA())) {
/*     */       
/* 169 */       if ((this.H == i.H && !par2EntityLiving.bA()) || (this.H == h.H && par2EntityLiving.bA())) {
/*     */         
/* 171 */         int var6 = (int)(par4 * (6 << par3) + 0.5D);
/*     */         
/* 173 */         if (par1EntityLiving == null)
/*     */         {
/* 175 */           par2EntityLiving.a(lh.m, var6);
/*     */         }
/*     */         else
/*     */         {
/* 179 */           par2EntityLiving.a(lh.b(par2EntityLiving, par1EntityLiving), var6);
/*     */         }
/*     */       
/*     */       } 
/*     */     } else {
/*     */       
/* 185 */       int var6 = (int)(par4 * (6 << par3) + 0.5D);
/* 186 */       par2EntityLiving.i(var6);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 195 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(int par1, int par2) {
/* 205 */     if (this.H != l.H && this.H != u.H) {
/*     */       
/* 207 */       if (this.H == v.H) {
/*     */         
/* 209 */         int i = 40 >> par2;
/* 210 */         return (i > 0) ? ((par1 % i == 0)) : true;
/*     */       } 
/*     */ 
/*     */       
/* 214 */       return (this.H == s.H);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 219 */     int var3 = 25 >> par2;
/* 220 */     return (var3 > 0) ? ((par1 % var3 == 0)) : true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ll b(String par1Str) {
/* 229 */     this.I = par1Str;
/* 230 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String a() {
/* 238 */     return this.I;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ll a(double par1) {
/* 244 */     this.L = par1;
/* 245 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public boolean d() {
/* 255 */     return (this.J >= 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int e() {
/* 265 */     return this.J;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public boolean f() {
/* 275 */     return this.K;
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public static String a(lm par0PotionEffect) {
/* 281 */     int var1 = par0PotionEffect.b();
/* 282 */     return km.a(var1);
/*     */   }
/*     */ 
/*     */   
/*     */   public double g() {
/* 287 */     return this.L;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i() {
/* 292 */     return this.M;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int j() {
/* 300 */     return this.N;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/ll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */