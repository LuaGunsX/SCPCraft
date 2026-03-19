/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import bq;
/*     */ import java.util.Random;
/*     */ import lh;
/*     */ import ln;
/*     */ import lq;
/*     */ import md;
/*     */ import mi;
/*     */ import mv;
/*     */ import nc;
/*     */ import nh;
/*     */ import od;
/*     */ import ox;
/*     */ import qx;
/*     */ import up;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity682 extends ox {
/*     */   private final mv field_82184_d;
/*     */   Random aa;
/*     */   
/*     */   public SCPEnumCreatureAttribute getSCPAttribute() {
/*     */     return SCPEnumCreatureAttribute.SCP;
/*     */   }
/*     */   
/*  28 */   public SCPEntity682(yc world) { super(world);
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
/*  69 */     this.aa = new Random(); this.aG = "/SCPCraft/textures/mobs/Bosses/682/682.png"; this.bH = 0.6F; a(0.9F, 0.9F); this.X = 1.0F; az().a(true); float f = 0.25F; this.bn.a(0, (nc)new mz((md)this)); this.bn.a(1, (nc)new nw((mi)this, f)); this.bn.a(2, (nc)(this.field_82184_d = new mv((md)this, 0.7F))); this.bn.a(3, (nc)new nh((md)this, qx.class, 6.0F));
/*     */     this.bn.a(4, (nc)new nh((md)this, md.class, 18.0F));
/*     */     this.bn.a(5, (nc)new nh((md)this, SCPEntityClassDGuy.class, 18.0F));
/*     */     this.bn.a(6, (nc)new nv((md)this));
/*     */     this.bn.a(7, (nc)new nt((mi)this, 0.38F));
/*     */     this.bn.a(8, (nc)new od((mi)this, 0.3F, up.o.cj, false));
/*     */     this.bn.a(8, (nc)new od((mi)this, 0.3F, up.o.cj, false)); }
/*     */   protected void a() { super.a();
/*  77 */     this.ag.a(16, Byte.valueOf((byte)0)); } public void c() { super.c(); } public boolean be() { if (!this.isAggro)
/*     */       return true; 
/*     */     return false; }
/*     */   protected boolean bj() { return false; }
/*     */   public boolean attackEntityFrom(lh par1DamageSource, int par2, qx entityplayer) {
/*  82 */     if (this.n != null || this.n == entityplayer)
/*     */     {
/*  84 */       return false;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  89 */     return a(par1DamageSource, par2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void j_() {
/*  98 */     super.j_();
/*     */     
/* 100 */     if (!this.p.I)
/*     */     {
/* 102 */       func_40148_a(this.F);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/* 108 */     return 9001;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bl() {
/* 113 */     super.bl();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bI() {
/* 118 */     ur var1 = ((qx)this.n).bD();
/* 119 */     return (var1 == null || var1 != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double X() {
/* 127 */     return this.O * 1.65D - 0.5D;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean f_() {
/* 136 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/* 144 */     if (super.a(par1EntityPlayer))
/*     */     {
/* 146 */       return true;
/*     */     }
/* 148 */     if (!this.p.I && (this.n == null || this.n == par1EntityPlayer)) {
/*     */       
/* 150 */       par1EntityPlayer.a((lq)this);
/* 151 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 155 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq nbttagcompound) {
/* 165 */     super.b(nbttagcompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq nbttagcompound) {
/* 173 */     super.a(nbttagcompound);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_48150_h(boolean flag) {
/* 178 */     this.bF = flag;
/*     */   }
/*     */ 
/*     */   
/*     */   public mv func_82183_n() {
/* 183 */     return this.field_82184_d;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ox spawnBabyAnimal(ox entityanimal) {
/* 214 */     return new SCPEntity682(this.p);
/*     */   }
/*     */ 
/*     */   
/*     */   public ln a(ln var1) {
/* 219 */     return (ln)this;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity682.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */