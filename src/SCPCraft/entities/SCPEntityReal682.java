/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import SCPCraft.models.SCPModelReal682;
/*     */ import SCPCraft.renders.SCPRender682;
/*     */ import bq;
/*     */ import ke;
/*     */ import lh;
/*     */ import lm;
/*     */ import lq;
/*     */ import lz;
/*     */ import md;
/*     */ import mz;
/*     */ import nc;
/*     */ import nh;
/*     */ import nk;
/*     */ import nv;
/*     */ import nw;
/*     */ import qx;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntityReal682 extends SCPEntity {
/*     */   public SCPModelReal682 model;
/*  24 */   public float animTime = 0.0F; public SCPRender682 render;
/*     */   public boolean isGrowling;
/*  26 */   public int deathTicks = 0;
/*  27 */   protected int maxHealth = 60;
/*     */ 
/*     */   
/*     */   public SCPEntityReal682(yc world) {
/*  31 */     super(world);
/*  32 */     this.aG = "/SCPCraft/textures/mobs/Bosses/682/682.png";
/*  33 */     this.bH = 0.6F;
/*  34 */     this.maxHealth = 1200;
/*  35 */     this.aR = this.maxHealth;
/*  36 */     this.X = 1.0F;
/*  37 */     SCPRender682.scale = 1.7F;
/*  38 */     az().a(true);
/*  39 */     float f = 0.25F;
/*  40 */     this.af = true;
/*  41 */     this.isGrowling = false;
/*  42 */     SCPModelReal682.isGrowling = false;
/*  43 */     this.M *= 6.0F;
/*  44 */     a(4.0F, 2.0F);
/*  45 */     this.bn.a(0, (nc)new mz((md)this));
/*  46 */     this.bn.a(1, (nc)new nw(this, f));
/*  47 */     this.bn.a(2, (nc)new nk((md)this, md.class, this.bH, true));
/*  48 */     this.bn.a(3, (nc)new nh((md)this, qx.class, 6.0F));
/*  49 */     this.bn.a(4, (nc)new nh((md)this, md.class, 18.0F));
/*  50 */     this.bn.a(5, (nc)new nh((md)this, SCPEntityClassDGuy.class, 18.0F));
/*  51 */     this.bn.a(6, (nc)new nv((md)this));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bl() {
/*  56 */     super.bl();
/*  57 */     if (this.ab % 20 == 0)
/*     */     {
/*  59 */       i(10);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  65 */     return this.maxHealth;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/*  70 */     super.a();
/*  71 */     this.ag.a(16, new Integer(0));
/*  72 */     this.ag.a(17, new Integer(this.maxHealth));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean be() {
/*  77 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/*  82 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  91 */     super.c();
/*  92 */     qx player = this.p.b((lq)this, 9.0D);
/*  93 */     float var1 = ke.b(this.animTime * 3.1415927F * 2.0F);
/*  94 */     if (var1 >= 0.5F && var1 <= 0.6F) { this.isGrowling = true; }
/*  95 */     else { this.isGrowling = false; }
/*  96 */      if (this.isGrowling) {
/*     */       
/*  98 */       if (player != null && !player.cd.d) player.d(new lm(mod_SCP.shake.H, 20, 1)); 
/*  99 */       this.p.a(this.t, this.u, this.v, "sounds.Roar", 5.0F, 1.0F);
/*     */     } 
/* 101 */     if (this.aR > 0)
/*     */     {
/* 103 */       this.animTime += 0.002F;
/*     */     }
/*     */     
/* 106 */     if (!this.p.I)
/*     */     {
/* 108 */       this.ag.b(16, Integer.valueOf(this.aR));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 114 */     if (this.aR <= 0) {
/*     */       
/* 116 */       for (int times = 0; times <= 3; times++)
/*     */       {
/* 118 */         this.p.a(this.t + 0.5D, this.u + 0.5D, this.v + 0.5D, "sounds.Roar", 1.0F + this.aa.nextFloat(), this.aa.nextFloat() * 0.7F + 0.3F);
/*     */       }
/* 120 */       float par1 = (this.aa.nextFloat() - 0.5F) * 8.0F;
/* 121 */       float var26 = (this.aa.nextFloat() - 0.5F) * 4.0F;
/* 122 */       float var3 = (this.aa.nextFloat() - 0.5F) * 8.0F;
/* 123 */       this.p.a("largeexplode", this.t + par1, this.u + 2.0D + var26, this.v + var3, 0.0D, 0.0D, 0.0D);
/*     */     } 
/*     */     
/* 126 */     this.bF = false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean attackEntityFrom(lh par1DamageSource, int par2, qx entityplayer) {
/* 132 */     return a(par1DamageSource, par2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void j_() {
/* 140 */     super.j_();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double X() {
/* 148 */     return this.O * 1.65D - 0.5D;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean f_() {
/* 157 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/* 165 */     return super.a(par1EntityPlayer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq nbttagcompound) {
/* 174 */     super.b(nbttagcompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq nbttagcompound) {
/* 182 */     super.a(nbttagcompound);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_48150_h(boolean flag) {
/* 187 */     this.bF = flag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_40149_l_() {
/* 197 */     return ((this.ag.a(16) & 0x1) != 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_40148_a(boolean flag) {
/* 202 */     byte byte0 = this.ag.a(16);
/*     */     
/* 204 */     if (flag) {
/*     */       
/* 206 */       byte0 = (byte)(byte0 | 0x1);
/*     */     }
/*     */     else {
/*     */       
/* 210 */       byte0 = (byte)(byte0 & 0xFE);
/*     */     } 
/*     */     
/* 213 */     this.ag.b(16, Byte.valueOf(byte0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void aP() {
/* 221 */     SCPRender682.scale = (float)(SCPRender682.scale - 0.004D);
/* 222 */     this.deathTicks++;
/* 223 */     qx ep = this.p.b((lq)this, 16.0D);
/*     */     
/* 225 */     if (this.deathTicks >= 180 && this.deathTicks <= 200) {
/*     */       
/* 227 */       float var1 = (this.aa.nextFloat() - 0.5F) * 8.0F;
/* 228 */       float var2 = (this.aa.nextFloat() - 0.5F) * 4.0F;
/* 229 */       float var3 = (this.aa.nextFloat() - 0.5F) * 8.0F;
/*     */       
/* 231 */       this.p.a("hugeexplosion", this.t + var1, this.u + 2.0D + var2, this.v + var3, 0.0D, 0.0D, 0.0D);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 237 */     if (!this.p.I && this.deathTicks > 150 && this.deathTicks % 5 == 0) {
/*     */       
/* 239 */       int var4 = 500;
/*     */       
/* 241 */       while (var4 > 0) {
/*     */         
/* 243 */         int var5 = lz.a(var4);
/* 244 */         var4 -= var5;
/* 245 */         this.p.d((lq)new lz(this.p, this.t, this.u, this.v, var5));
/*     */       } 
/*     */     } 
/*     */     
/* 249 */     d(0.0D, 0.10000000149011612D, 0.0D);
/* 250 */     this.ax = this.z += 20.0F;
/*     */     
/* 252 */     if (this.deathTicks == 200 && !this.p.I) {
/*     */       
/* 254 */       int var4 = 500;
/*     */       
/* 256 */       while (var4 > 0) {
/*     */         
/* 258 */         int var5 = lz.a(var4);
/* 259 */         var4 -= var5;
/* 260 */         this.p.d((lq)new lz(this.p, this.t, this.u, this.v, var5));
/*     */       } 
/* 262 */       x();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_70845_n() {
/* 268 */     return ((this.ag.a(16) & 0x1) != 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSCP682Health() {
/* 276 */     return this.ag.c(16);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntityReal682.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */