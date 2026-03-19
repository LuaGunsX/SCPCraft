/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import amq;
/*     */ import bq;
/*     */ import lh;
/*     */ import ln;
/*     */ import lq;
/*     */ import md;
/*     */ import mi;
/*     */ import mv;
/*     */ import mz;
/*     */ import nc;
/*     */ import nh;
/*     */ import nt;
/*     */ import nv;
/*     */ import nw;
/*     */ import od;
/*     */ import ox;
/*     */ import qx;
/*     */ import up;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity217Pig extends ox {
/*     */   public SCPEntity217Pig(yc world) {
/*  26 */     super(world);
/*  27 */     this.aG = "/SCPCraft/textures/mobs/SCP217/SCPPig.png";
/*  28 */     this.bH = 0.6F;
/*  29 */     a(0.9F, 0.9F);
/*  30 */     this.X = 1.0F;
/*  31 */     az().a(true);
/*  32 */     float f = 0.25F;
/*  33 */     this.bn.a(0, (nc)new mz((md)this));
/*  34 */     this.bn.a(1, (nc)new nw((mi)this, f));
/*  35 */     this.bn.a(2, (nc)(this.field_82184_d = new mv((md)this, 0.7F)));
/*  36 */     this.bn.a(3, (nc)new nh((md)this, qx.class, 6.0F));
/*  37 */     this.bn.a(4, (nc)new nh((md)this, md.class, 18.0F));
/*  38 */     this.bn.a(5, (nc)new nh((md)this, SCPEntityClassDGuy.class, 18.0F));
/*  39 */     this.bn.a(6, (nc)new nv((md)this));
/*  40 */     this.bn.a(7, (nc)new nt((mi)this, 0.38F));
/*  41 */     this.bn.a(8, (nc)new od((mi)this, 0.3F, up.o.cj, false));
/*  42 */     this.bn.a(8, (nc)new od((mi)this, 0.3F, up.o.cj, false));
/*     */   }
/*     */ 
/*     */   
/*     */   public SCPEnumCreatureAttribute getSCPAttribute() {
/*  47 */     return SCPEnumCreatureAttribute.SCP;
/*     */   }
/*     */   private final mv field_82184_d;
/*     */   
/*     */   protected void a() {
/*  52 */     super.a();
/*  53 */     this.ag.a(16, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean be() {
/*  58 */     if (!this.isAggro) return true; 
/*  59 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/*  64 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  73 */     super.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean attackEntityFrom(lh par1DamageSource, int par2, qx entityplayer) {
/*  78 */     if (this.n != null || this.n == entityplayer)
/*     */     {
/*  80 */       return false;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  85 */     return a(par1DamageSource, par2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void j_() {
/*  94 */     super.j_();
/*     */     
/*  96 */     if (!this.p.I)
/*     */     {
/*  98 */       func_40148_a(this.F);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/* 104 */     return 20;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bl() {
/* 109 */     super.bl();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bI() {
/* 114 */     ur var1 = ((qx)this.n).bD();
/* 115 */     return (var1 == null || var1 != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double X() {
/* 123 */     return this.O * 1.3499999999999999D - 0.5D;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean f_() {
/* 132 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/* 140 */     if (super.a(par1EntityPlayer))
/*     */     {
/* 142 */       return true;
/*     */     }
/* 144 */     if (!this.p.I && (this.n == null || this.n == par1EntityPlayer)) {
/*     */       
/* 146 */       par1EntityPlayer.a((lq)this);
/* 147 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 151 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq nbttagcompound) {
/* 161 */     super.b(nbttagcompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq nbttagcompound) {
/* 169 */     super.a(nbttagcompound);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_48150_h(boolean flag) {
/* 174 */     this.bF = flag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int bb() {
/* 182 */     if (af())
/*     */     {
/* 184 */       return up.o.cj;
/*     */     }
/*     */ 
/*     */     
/* 188 */     return amq.K.cm;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/* 197 */     return "mob.pig";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/* 205 */     return "mob.pig";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 213 */     return "mob.pigdeath";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_40149_l_() {
/* 218 */     return ((this.ag.a(16) & 0x1) != 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_40148_a(boolean flag) {
/* 223 */     byte byte0 = this.ag.a(16);
/*     */     
/* 225 */     if (flag) {
/*     */       
/* 227 */       byte0 = (byte)(byte0 | 0x1);
/*     */     }
/*     */     else {
/*     */       
/* 231 */       byte0 = (byte)(byte0 & 0xFE);
/*     */     } 
/*     */     
/* 234 */     this.ag.b(16, Byte.valueOf(byte0));
/*     */   }
/*     */ 
/*     */   
/*     */   public SCPEntity217Pig spawnBabyAnimal(ln par1EntityAnimal) {
/* 239 */     return new SCPEntity217Pig(this.p);
/*     */   }
/*     */ 
/*     */   
/*     */   public mv getAIControlledByPlayer() {
/* 244 */     return this.field_82184_d;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ln a(ln var1) {
/* 250 */     return (ln)spawnBabyAnimal(var1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isWheat(ur par1ItemStack) {
/* 255 */     return (par1ItemStack.c == up.o.cj);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity217Pig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */