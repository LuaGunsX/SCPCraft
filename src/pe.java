/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Random;
/*     */ import net.minecraftforge.common.IShearable;
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
/*     */ public class pe
/*     */   extends ox
/*     */   implements IShearable
/*     */ {
/*  33 */   private final ry e = new ry((rq)new pf(this), 2, 1);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  38 */   public static final float[][] d = new float[][] { { 1.0F, 1.0F, 1.0F }, { 0.85F, 0.5F, 0.2F }, { 0.7F, 0.3F, 0.85F }, { 0.4F, 0.6F, 0.85F }, { 0.9F, 0.9F, 0.2F }, { 0.5F, 0.8F, 0.1F }, { 0.95F, 0.5F, 0.65F }, { 0.3F, 0.3F, 0.3F }, { 0.6F, 0.6F, 0.6F }, { 0.3F, 0.5F, 0.6F }, { 0.5F, 0.25F, 0.7F }, { 0.2F, 0.3F, 0.7F }, { 0.4F, 0.3F, 0.2F }, { 0.4F, 0.5F, 0.2F }, { 0.6F, 0.2F, 0.2F }, { 0.1F, 0.1F, 0.1F } };
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int f;
/*     */ 
/*     */ 
/*     */   
/*  47 */   private mx g = new mx((md)this);
/*     */ 
/*     */   
/*     */   public pe(yc par1World) {
/*  51 */     super(par1World);
/*  52 */     this.aG = "/mob/sheep.png";
/*  53 */     a(0.9F, 1.3F);
/*  54 */     float var2 = 0.23F;
/*  55 */     az().a(true);
/*  56 */     this.bn.a(0, (nc)new mz((md)this));
/*  57 */     this.bn.a(1, (nc)new nt((mi)this, 0.38F));
/*  58 */     this.bn.a(2, (nc)new mu(this, var2));
/*  59 */     this.bn.a(3, (nc)new od((mi)this, 0.25F, up.T.cj, false));
/*  60 */     this.bn.a(4, (nc)new nb(this, 0.25F));
/*  61 */     this.bn.a(5, (nc)this.g);
/*  62 */     this.bn.a(6, (nc)new nw((mi)this, var2));
/*  63 */     this.bn.a(7, (nc)new nh((md)this, qx.class, 6.0F));
/*  64 */     this.bn.a(8, (nc)new nv((md)this));
/*  65 */     this.e.a(0, new ur(up.aW, 1, 0));
/*  66 */     this.e.a(1, new ur(up.aW, 1, 0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean be() {
/*  75 */     if (!this.isAggro) return true; 
/*  76 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bl() {
/*  81 */     this.f = this.g.f();
/*  82 */     super.bl();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  91 */     if (this.p.I)
/*     */     {
/*  93 */       this.f = Math.max(0, this.f - 1);
/*     */     }
/*     */     
/*  96 */     super.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/* 101 */     return 8;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/* 106 */     super.a();
/* 107 */     this.ag.a(16, new Byte((byte)0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(boolean par1, int par2) {
/* 115 */     if (!n())
/*     */     {
/* 117 */       a(new ur(amq.ae.cm, 1, m()), 0.0F);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int bb() {
/* 126 */     return amq.ae.cm;
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void a(byte par1) {
/* 132 */     if (par1 == 10) {
/*     */       
/* 134 */       this.f = 40;
/*     */     }
/*     */     else {
/*     */       
/* 138 */       super.a(par1);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/* 147 */     return super.a(par1EntityPlayer);
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public float j(float par1) {
/* 153 */     return (this.f <= 0) ? 0.0F : ((this.f >= 4 && this.f <= 36) ? 1.0F : ((this.f < 4) ? ((this.f - par1) / 4.0F) : (-((this.f - 40) - par1) / 4.0F)));
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public float k(float par1) {
/* 159 */     if (this.f > 4 && this.f <= 36) {
/*     */       
/* 161 */       float var2 = ((this.f - 4) - par1) / 32.0F;
/* 162 */       return 0.62831855F + 0.2199115F * ke.a(var2 * 28.7F);
/*     */     } 
/*     */ 
/*     */     
/* 166 */     return (this.f > 0) ? 0.62831855F : (this.A / 57.295776F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/* 175 */     super.b(par1NBTTagCompound);
/* 176 */     par1NBTTagCompound.a("Sheared", n());
/* 177 */     par1NBTTagCompound.a("Color", (byte)m());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/* 185 */     super.a(par1NBTTagCompound);
/* 186 */     f(par1NBTTagCompound.n("Sheared"));
/* 187 */     s(par1NBTTagCompound.c("Color"));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/* 195 */     return "mob.sheep.say";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/* 203 */     return "mob.sheep.say";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 211 */     return "mob.sheep.say";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(int par1, int par2, int par3, int par4) {
/* 219 */     a("mob.sheep.step", 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public int m() {
/* 224 */     return this.ag.a(16) & 0xF;
/*     */   }
/*     */ 
/*     */   
/*     */   public void s(int par1) {
/* 229 */     byte var2 = this.ag.a(16);
/* 230 */     this.ag.b(16, Byte.valueOf((byte)(var2 & 0xF0 | par1 & 0xF)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean n() {
/* 238 */     return ((this.ag.a(16) & 0x10) != 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void f(boolean par1) {
/* 246 */     byte var2 = this.ag.a(16);
/*     */     
/* 248 */     if (par1) {
/*     */       
/* 250 */       this.ag.b(16, Byte.valueOf((byte)(var2 | 0x10)));
/*     */     }
/*     */     else {
/*     */       
/* 254 */       this.ag.b(16, Byte.valueOf((byte)(var2 & 0xFFFFFFEF)));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int a(Random par0Random) {
/* 263 */     int var1 = par0Random.nextInt(100);
/* 264 */     return (var1 < 5) ? 15 : ((var1 < 10) ? 7 : ((var1 < 15) ? 8 : ((var1 < 18) ? 12 : ((par0Random.nextInt(500) == 0) ? 6 : 0))));
/*     */   }
/*     */ 
/*     */   
/*     */   public pe b(ln par1EntityAgeable) {
/* 269 */     pe var2 = (pe)par1EntityAgeable;
/* 270 */     pe var3 = new pe(this.p);
/* 271 */     int var4 = a(this, var2);
/* 272 */     var3.s(15 - var4);
/* 273 */     return var3;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void aH() {
/* 282 */     f(false);
/*     */     
/* 284 */     if (h_()) {
/*     */       
/* 286 */       int var1 = b() + 1200;
/*     */       
/* 288 */       if (var1 > 0)
/*     */       {
/* 290 */         var1 = 0;
/*     */       }
/*     */       
/* 293 */       a(var1);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void bG() {
/* 302 */     s(a(this.p.t));
/*     */   }
/*     */ 
/*     */   
/*     */   private int a(ox par1EntityAnimal, ox par2EntityAnimal) {
/* 307 */     int var6, var3 = b(par1EntityAnimal);
/* 308 */     int var4 = b(par2EntityAnimal);
/* 309 */     this.e.a(0).b(var3);
/* 310 */     this.e.a(1).b(var4);
/* 311 */     ur var5 = wn.a().a(this.e, ((pe)par1EntityAnimal).p);
/*     */ 
/*     */     
/* 314 */     if (var5 != null && (var5.b()).cj == up.aW.cj) {
/*     */       
/* 316 */       var6 = var5.j();
/*     */     }
/*     */     else {
/*     */       
/* 320 */       var6 = this.p.t.nextBoolean() ? var3 : var4;
/*     */     } 
/*     */     
/* 323 */     return var6;
/*     */   }
/*     */ 
/*     */   
/*     */   private int b(ox par1EntityAnimal) {
/* 328 */     return 15 - ((pe)par1EntityAnimal).m();
/*     */   }
/*     */ 
/*     */   
/*     */   public ln a(ln par1EntityAgeable) {
/* 333 */     return b(par1EntityAgeable);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isShearable(ur item, yc world, int X, int Y, int Z) {
/* 339 */     return (!n() && !h_());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ArrayList onSheared(ur item, yc world, int X, int Y, int Z, int fortune) {
/* 345 */     ArrayList<ur> ret = new ArrayList();
/* 346 */     f(true);
/* 347 */     int i = 1 + this.aa.nextInt(3);
/* 348 */     for (int j = 0; j < i; j++)
/*     */     {
/* 350 */       ret.add(new ur(amq.ae.cm, 1, m()));
/*     */     }
/* 352 */     this.p.a((lq)this, "mob.sheep.shear", 1.0F, 1.0F);
/* 353 */     return ret;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/pe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */