/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class lh
/*     */ {
/*  11 */   public static lh a = (new lh("inFire")).j();
/*  12 */   public static lh b = (new lh("onFire")).h().j();
/*  13 */   public static lh c = (new lh("lava")).j();
/*  14 */   public static lh d = (new lh("inWall")).h();
/*  15 */   public static lh e = (new lh("drown")).h();
/*  16 */   public static lh f = (new lh("starve")).h();
/*  17 */   public static lh g = new lh("cactus");
/*  18 */   public static lh h = (new lh("fall")).h();
/*  19 */   public static lh i = (new lh("outOfWorld")).h().i();
/*  20 */   public static lh j = (new lh("generic")).h();
/*  21 */   public static lh k = (new lh("explosion")).m();
/*  22 */   public static lh l = new lh("explosion");
/*  23 */   public static lh m = (new lh("magic")).h().p();
/*  24 */   public static lh n = (new lh("wither")).h();
/*  25 */   public static lh o = new lh("anvil");
/*  26 */   public static lh p = new lh("fallingBlock");
/*     */   
/*     */   private boolean r = false;
/*     */   
/*     */   private boolean s = false;
/*  31 */   private float t = 0.3F;
/*     */   
/*     */   private boolean u;
/*     */   
/*     */   private boolean v;
/*     */   
/*     */   private boolean w;
/*     */   
/*     */   private boolean x = false;
/*     */   
/*     */   public String q;
/*     */   
/*     */   public static lh a(md par0EntityLiving) {
/*  44 */     return (lh)new li("mob", par0EntityLiving);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static lh a(qx par0EntityPlayer) {
/*  52 */     return (lh)new li("player", par0EntityPlayer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static lh a(qz par0EntityArrow, lq par1Entity) {
/*  60 */     return (new lj("arrow", (lq)par0EntityArrow, par1Entity)).b();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static lh a(rb par0EntityFireball, lq par1Entity) {
/*  68 */     return (par1Entity == null) ? (new lj("onFire", (lq)par0EntityFireball, (lq)par0EntityFireball)).j().b() : (new lj("fireball", (lq)par0EntityFireball, par1Entity)).j().b();
/*     */   }
/*     */ 
/*     */   
/*     */   public static lh a(lq par0Entity, lq par1Entity) {
/*  73 */     return (new lj("thrown", par0Entity, par1Entity)).b();
/*     */   }
/*     */ 
/*     */   
/*     */   public static lh b(lq par0Entity, lq par1Entity) {
/*  78 */     return (new lj("indirectMagic", par0Entity, par1Entity)).h().p();
/*     */   }
/*     */ 
/*     */   
/*     */   public static lh a(lq par0Entity) {
/*  83 */     return (new li("thorns", par0Entity)).p();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  91 */     return this.v;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public lh b() {
/*  99 */     this.v = true;
/* 100 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 105 */     return this.r;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float d() {
/* 113 */     return this.t;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean e() {
/* 118 */     return this.s;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public lh(String par1Str) {
/* 124 */     this.q = par1Str;
/*     */   }
/*     */ 
/*     */   
/*     */   public lq f() {
/* 129 */     return g();
/*     */   }
/*     */ 
/*     */   
/*     */   public lq g() {
/* 134 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public lh h() {
/* 140 */     this.r = true;
/* 141 */     this.t = 0.0F;
/* 142 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected lh i() {
/* 147 */     this.s = true;
/* 148 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected lh j() {
/* 156 */     this.u = true;
/* 157 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String b(qx par1EntityPlayer) {
/* 165 */     return bm.a("death." + this.q, new Object[] { par1EntityPlayer.bR });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean k() {
/* 173 */     return this.u;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String l() {
/* 181 */     return this.q;
/*     */   }
/*     */ 
/*     */   
/*     */   public lh m() {
/* 186 */     this.w = true;
/* 187 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean n() {
/* 192 */     return this.w;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean o() {
/* 200 */     return this.x;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public lh p() {
/* 208 */     this.x = true;
/* 209 */     return this;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/lh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */