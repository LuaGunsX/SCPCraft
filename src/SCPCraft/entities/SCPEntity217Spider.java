/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import bq;
/*     */ import lh;
/*     */ import ll;
/*     */ import lm;
/*     */ import ln;
/*     */ import lq;
/*     */ import md;
/*     */ import mf;
/*     */ import mi;
/*     */ import mv;
/*     */ import mz;
/*     */ import nc;
/*     */ import nh;
/*     */ import nv;
/*     */ import nw;
/*     */ import od;
/*     */ import ox;
/*     */ import qx;
/*     */ import up;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity217Spider
/*     */   extends ox {
/*     */   public SCPEntity217Spider(yc world) {
/*  28 */     super(world);
/*  29 */     this.aG = "/SCPCraft/textures/mobs/SCP217/SCPSpider.png";
/*  30 */     a(1.4F, 0.9F);
/*  31 */     this.bH = 0.8F;
/*  32 */     this.X = 1.0F;
/*  33 */     az().a(true);
/*  34 */     float f = 0.25F;
/*  35 */     this.bn.a(0, (nc)new mz((md)this));
/*  36 */     this.bn.a(1, (nc)new nw((mi)this, f));
/*  37 */     this.bn.a(2, (nc)(this.field_82184_d = new mv((md)this, 0.7F)));
/*  38 */     this.bn.a(3, (nc)new nh((md)this, qx.class, 18.0F));
/*  39 */     this.bn.a(4, (nc)new nh((md)this, md.class, 18.0F));
/*  40 */     this.bn.a(5, (nc)new nh((md)this, SCPEntityClassDGuy.class, 18.0F));
/*  41 */     this.bn.a(6, (nc)new nv((md)this));
/*  42 */     this.bn.a(7, (nc)new od((mi)this, 0.3F, up.o.cj, false));
/*  43 */     this.bn.a(7, (nc)new od((mi)this, 0.3F, up.o.cj, false));
/*     */   }
/*     */   private final mv field_82184_d;
/*     */   
/*     */   public SCPEnumCreatureAttribute getSCPAttribute() {
/*  48 */     return SCPEnumCreatureAttribute.SCP;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bI() {
/*  53 */     ur var1 = ((qx)this.n).bD();
/*  54 */     return (var1 == null || var1 != null);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bl() {
/*  59 */     super.bl();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/*  64 */     super.a();
/*  65 */     this.ag.a(16, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean be() {
/*  70 */     if (!this.isAggro) return true; 
/*  71 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/*  76 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  85 */     super.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean attackEntityFrom(lh par1DamageSource, int par2, qx entityplayer) {
/*  90 */     if (this.n != null || this.n == entityplayer)
/*     */     {
/*  92 */       return false;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  97 */     return a(par1DamageSource, par2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void j_() {
/* 106 */     super.j_();
/*     */     
/* 108 */     if (!this.p.I)
/*     */     {
/* 110 */       func_40148_a(this.F);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/* 116 */     return 20;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double X() {
/* 124 */     return this.O * 0.9D - 0.5D;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean f_() {
/* 133 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/* 141 */     if (super.a(par1EntityPlayer))
/*     */     {
/* 143 */       return true;
/*     */     }
/* 145 */     if (!this.p.I && (this.n == null || this.n == par1EntityPlayer)) {
/*     */       
/* 147 */       par1EntityPlayer.a((lq)this);
/* 148 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 152 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq nbttagcompound) {
/* 162 */     super.b(nbttagcompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq nbttagcompound) {
/* 170 */     super.a(nbttagcompound);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_48150_h(boolean flag) {
/* 175 */     this.bF = flag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int bb() {
/* 183 */     return up.o.cj;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_40149_l_() {
/* 188 */     return ((this.ag.a(16) & 0x1) != 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_40148_a(boolean flag) {
/* 193 */     byte byte0 = this.ag.a(16);
/*     */     
/* 195 */     if (flag) {
/*     */       
/* 197 */       byte0 = (byte)(byte0 | 0x1);
/*     */     }
/*     */     else {
/*     */       
/* 201 */       byte0 = (byte)(byte0 & 0xFE);
/*     */     } 
/*     */     
/* 204 */     this.ag.b(16, Byte.valueOf(byte0));
/*     */   }
/*     */ 
/*     */   
/*     */   public SCPEntity217Spider spawnBabyAnimal(ln par1EntityAnimal) {
/* 209 */     return new SCPEntity217Spider(this.p);
/*     */   }
/*     */ 
/*     */   
/*     */   public mv getAIControlledByPlayer() {
/* 214 */     return this.field_82184_d;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ln a(ln var1) {
/* 220 */     return (ln)spawnBabyAnimal(var1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isWheat(ur par1ItemStack) {
/* 225 */     return (par1ItemStack.c == up.o.cj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/* 233 */     return "mob.spider";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/* 241 */     return "mob.spider";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 249 */     return "mob.spiderdeath";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean g_() {
/* 257 */     return func_40149_l_();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void am() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float spiderScaleAmount() {
/* 272 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public mf bC() {
/* 280 */     return mf.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean e(lm par1PotionEffect) {
/* 285 */     if (par1PotionEffect.a() == ll.u.H)
/*     */     {
/* 287 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 291 */     return super.e(par1PotionEffect);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity217Spider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */