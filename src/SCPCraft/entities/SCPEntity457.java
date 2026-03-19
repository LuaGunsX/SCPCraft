/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import amq;
/*     */ import bq;
/*     */ import jl;
/*     */ import ke;
/*     */ import lh;
/*     */ import lq;
/*     */ import md;
/*     */ import nc;
/*     */ import nh;
/*     */ import nk;
/*     */ import nv;
/*     */ import nw;
/*     */ import og;
/*     */ import oh;
/*     */ import qx;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity457
/*     */   extends SCPEntity {
/*     */   private int heightOffsetUpdateTime;
/*     */   private int field_40152_d;
/*     */   private boolean Dead;
/*     */   
/*     */   public SCPEntity457(yc par1World) {
/*  28 */     super(par1World);
/*  29 */     this.aG = "/SCPCraft/textures/mobs/457.png";
/*  30 */     this.af = true;
/*  31 */     this.attackStrength = 5;
/*  32 */     this.bd = 0;
/*  33 */     this.bH = 0.3F;
/*  34 */     az().a(true);
/*  35 */     this.bn.a(0, (nc)new nk((md)this, qx.class, this.bH, false));
/*  36 */     this.bn.a(1, (nc)new nw(this, this.bH));
/*  37 */     this.bn.a(2, (nc)new nk((md)this, md.class, this.bH, true));
/*  38 */     this.bn.a(2, (nc)new nh((md)this, qx.class, 6.0F));
/*  39 */     this.bn.a(3, (nc)new nv((md)this));
/*  40 */     this.bo.a(1, (nc)new oh((md)this, qx.class, 16.0F, 0, true));
/*  41 */     this.bo.a(2, (nc)new og((md)this, false));
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean be() {
/*  46 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  51 */     return 20;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/*  56 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/*  61 */     super.a();
/*  62 */     this.ag.a(16, new Byte((byte)0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/*  70 */     return "fire.fire";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/*  78 */     return "fire.ignite";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/*  86 */     return "mob.blaze.death";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(lh par1DamageSource, int par2) {
/*  92 */     qx entityplayer = this.p.b((lq)this, 16.0D);
/*  93 */     if (G()) {
/*     */       
/*  95 */       x();
/*  96 */       this.Dead = true;
/*     */     } 
/*  98 */     if (this.Dead == true) {
/*     */       
/* 100 */       entityplayer.a((jl)mod_SCP.SCP457, 1);
/*     */     }
/*     */     else {
/*     */       
/* 104 */       this.Dead = false;
/*     */     } 
/*     */     
/* 107 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onDeath(lh par1DamageSource, qx entityplayer) {
/* 114 */     a(par1DamageSource);
/* 115 */     this.p.e(this.ai, this.aj, this.ak, amq.au.cm);
/* 116 */     entityplayer.a((jl)mod_SCP.SCP457, 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(float par1) {
/* 121 */     return 15728880;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float c(float par1) {
/* 129 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/* 139 */     if (!this.p.I)
/*     */     {
/* 141 */       if (G()) {
/*     */         
/* 143 */         x();
/* 144 */         this.Dead = true;
/*     */       
/*     */       }
/*     */       else {
/*     */         
/* 149 */         this.Dead = false;
/*     */       } 
/*     */     }
/*     */     
/* 153 */     for (int j = 0; j < 4; j++) {
/*     */       
/* 155 */       int l = ke.c(this.t + ((j % 2 * 2 - 1) * 0.25F));
/* 156 */       int i1 = ke.c(this.u);
/* 157 */       int j1 = ke.c(this.v + ((j / 2 % 2 * 2 - 1) * 0.25F));
/*     */       
/* 159 */       if (this.p.a(l, i1, j1) == 0)
/*     */       {
/* 161 */         this.p.e(l, i1, j1, amq.au.cm);
/*     */       }
/*     */     } 
/*     */     
/* 165 */     if (this.aR <= 0) {
/*     */       
/* 167 */       float f = (this.aa.nextFloat() - 0.5F) * 8.0F;
/* 168 */       float f2 = (this.aa.nextFloat() - 0.5F) * 4.0F;
/* 169 */       float f4 = (this.aa.nextFloat() - 0.5F) * 8.0F;
/* 170 */       this.p.a("flame", this.t + f, this.u + 2.0D + f2, this.v + f4, 0.0D, 0.0D, 0.0D);
/*     */       
/*     */       return;
/*     */     } 
/* 174 */     if (this.aa.nextInt(24) == 0)
/*     */     {
/* 176 */       this.p.a(this.t + 0.5D, this.u + 0.5D, this.v + 0.5D, "fire.fire", 1.0F + this.aa.nextFloat(), this.aa.nextFloat() * 0.7F + 0.3F);
/*     */     }
/*     */     
/* 179 */     for (int i = 0; i < 2; i++) {
/*     */       
/* 181 */       this.p.a("flame", this.t + (this.aa.nextDouble() - 0.5D) * this.N, this.u + this.aa.nextDouble() * this.O, this.v + (this.aa.nextDouble() - 0.5D) * this.N, 0.0D, 0.0D, 0.0D);
/* 182 */       this.p.a("largesmoke", this.t + (this.aa.nextDouble() - 0.5D) * this.N, this.u + this.aa.nextDouble() * this.O, this.v + (this.aa.nextDouble() - 0.5D) * this.N, 0.0D, 0.0D, 0.0D);
/*     */     } 
/*     */     
/* 185 */     super.c();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void attackEntity(lq par1Entity, qx entityplayer, float par2) {
/* 191 */     a(par1Entity, par2);
/* 192 */     entityplayer.c(8);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(float f) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/* 206 */     super.b(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/* 214 */     super.a(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int bb() {
/* 222 */     return amq.au.cm;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean af() {
/* 230 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_40151_ac() {
/* 235 */     return ((this.ag.a(16) & 0x1) != 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_40150_a(boolean par1) {
/* 240 */     byte byte0 = this.ag.a(16);
/*     */     
/* 242 */     if (par1) {
/*     */       
/* 244 */       byte0 = (byte)(byte0 | 0x1);
/*     */     }
/*     */     else {
/*     */       
/* 248 */       byte0 = (byte)(byte0 & 0xFE);
/*     */     } 
/*     */     
/* 251 */     this.ag.b(16, Byte.valueOf(byte0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean isValidLightLevel() {
/* 259 */     return true;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity457.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */