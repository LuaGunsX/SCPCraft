/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import amq;
/*     */ import bq;
/*     */ import java.util.Random;
/*     */ import lh;
/*     */ import ll;
/*     */ import lm;
/*     */ import lq;
/*     */ import md;
/*     */ import qx;
/*     */ import up;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity273
/*     */   extends SCPEntity {
/*     */   public static int starvingTime;
/*     */   public boolean isAggro = false;
/*  21 */   protected static Random Rand = new Random();
/*     */ 
/*     */   
/*     */   public SCPEntity273(yc par1World) {
/*  25 */     super(par1World);
/*  26 */     this.aG = "/SCPCraft/textures/mobs/273.png";
/*  27 */     this.af = true;
/*  28 */     this.bd = 0;
/*  29 */     this; starvingTime = 7000;
/*  30 */     this.bH = 0.7F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean be() {
/*  35 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(lq par1Entity, float par2) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void targetLivings() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void c_(qx par1EntityPlayer) {
/*  49 */     if (this.isAggro) {
/*     */       
/*  51 */       byte var2 = 0;
/*  52 */       if (this.p.s == 1) { var2 = 2; }
/*  53 */       else if (this.p.s == 2) { var2 = 4; }
/*  54 */       else if (this.p.s == 3) { var2 = 6; }
/*  55 */        par1EntityPlayer.a(lh.a((md)this), var2);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m(lq par1Entity) {
/*  61 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean canDamagePlayer() {
/*  66 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(lh par1DamageSource, int par2) {
/*  71 */     lq var3 = par1DamageSource.g();
/*  72 */     if (var3 instanceof qx) {
/*     */       
/*  74 */       this.isAggro = true;
/*  75 */       this.a_ = var3;
/*     */     } 
/*  77 */     return super.a(par1DamageSource, par2);
/*     */   }
/*     */ 
/*     */   
/*     */   protected lq j() {
/*  82 */     return this.a_;
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  87 */     return 30;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/*  92 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected String aY() {
/*  97 */     return "mob.villager.default";
/*     */   }
/*     */ 
/*     */   
/*     */   protected String aZ() {
/* 102 */     return "mob.villager.default";
/*     */   }
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 107 */     return "fire.ignite";
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lh par1DamageSource) {
/* 112 */     super.a(par1DamageSource);
/* 113 */     float f = (this.aa.nextFloat() - 0.5F) * 8.0F;
/* 114 */     float f2 = (this.aa.nextFloat() - 0.5F) * 4.0F;
/* 115 */     float f4 = (this.aa.nextFloat() - 0.5F) * 8.0F;
/*     */     
/* 117 */     for (int times = 0; times <= 800; times++)
/*     */     {
/* 119 */       this.p.a("flame", this.t + f, this.u + 2.0D + f2, this.v + f4, 0.0D, 0.0D, 0.0D);
/*     */     }
/* 121 */     this.p.b((int)this.t, (int)this.u, (int)this.v, mod_SCP.SCP273.cm);
/* 122 */     this.p.b((int)this.t, (int)this.u + 1, (int)this.v, 0);
/*     */     
/* 124 */     for (int i = -2; i <= 2; i++) {
/* 125 */       for (int j = -2; j <= 2; j++) {
/* 126 */         if (this.aa.nextInt(5) == 0 && this.p.a((int)this.t + i, (int)this.u, (int)this.v + j) == 0)
/* 127 */           this.p.e((int)this.t + i, (int)this.u, (int)this.v + j, amq.au.cm); 
/*     */       } 
/* 129 */     }  this.p.a(this.t + 0.5D, this.u + 0.5D, this.v + 0.5D, "fire.ignite", 1.0F, Rand.nextFloat() * 0.4F + 0.8F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/* 134 */     ur var2 = par1EntityPlayer.bJ.g();
/* 135 */     if (var2 != null) {
/*     */       
/* 137 */       if (var2.c == up.F.cj || var2.c == up.j.cj || var2.c == up.U.cj || var2.c == up.bK.cj || var2.c == up.bL.cj || var2.c == up.bM.cj) {
/*     */ 
/*     */         
/* 140 */         par1EntityPlayer.b("§lSCP-273: §rThank you kind sir");
/* 141 */         par1EntityPlayer.d(new lm(ll.n.H, 600, 0));
/* 142 */         decreaseHunger(-7000);
/* 143 */         var2.a--;
/*     */         
/* 145 */         if (var2.a <= 0)
/*     */         {
/* 147 */           par1EntityPlayer.bJ.a(par1EntityPlayer.bJ.c, (ur)null);
/*     */         }
/*     */       } 
/* 150 */       if (var2.c == up.at.cj || var2.c == up.aZ.cj || var2.c == up.bP.cj || var2.c == up.bT.cj) {
/*     */         
/* 152 */         par1EntityPlayer.b("§lSCP-273: §rThat was amazing *o*! Thank you so much :3");
/* 153 */         par1EntityPlayer.d(new lm(ll.n.H, 1200, 2));
/* 154 */         decreaseHunger(-15000);
/* 155 */         var2.a--;
/*     */         
/* 157 */         if (var2.a <= 0)
/*     */         {
/* 159 */           par1EntityPlayer.bJ.a(par1EntityPlayer.bJ.c, (ur)null);
/*     */         }
/*     */       } 
/* 162 */       if (var2.c == up.ar.cj || var2.c == up.bj.cj || var2.c == up.bl.cj || var2.c == up.aV.cj) {
/*     */         
/* 164 */         par1EntityPlayer.b("§lSCP-273: §rThat was delicious :D");
/* 165 */         par1EntityPlayer.d(new lm(ll.n.H, 600, 1));
/* 166 */         decreaseHunger(-7000);
/* 167 */         var2.a--;
/*     */         
/* 169 */         if (var2.a <= 0)
/*     */         {
/* 171 */           par1EntityPlayer.bJ.a(par1EntityPlayer.bJ.c, (ur)null);
/*     */         }
/*     */       } 
/* 174 */       if (var2.c == up.aq.cj || var2.c == up.bi.cj || var2.c == up.bk.cj || var2.c == up.aU.cj) {
/*     */         
/* 176 */         par1EntityPlayer.b("§lSCP-273: §rYuck! Cheap bastard! >:(");
/* 177 */         par1EntityPlayer.d(new lm(ll.n.H, 200, 0));
/* 178 */         decreaseHunger(-2000);
/* 179 */         var2.a--;
/*     */         
/* 181 */         if (var2.a <= 0)
/*     */         {
/* 183 */           par1EntityPlayer.bJ.a(par1EntityPlayer.bJ.c, (ur)null);
/*     */         }
/*     */       } 
/* 186 */       if (var2.c == up.bm.cj || var2.c == up.bu.cj || var2.c == up.bN.cj) {
/* 187 */         par1EntityPlayer.b("§lSCP-273: §rBlugh!");
/* 188 */         par1EntityPlayer.c(20);
/* 189 */         decreaseHunger(2000);
/* 190 */         var2.a--;
/*     */         
/* 192 */         if (var2.a <= 0)
/*     */         {
/* 194 */           par1EntityPlayer.bJ.a(par1EntityPlayer.bJ.c, (ur)null);
/*     */         }
/*     */       } 
/* 197 */       if (var2.c == up.bc.cj || var2.c == up.bf.cj) {
/* 198 */         par1EntityPlayer.b("§lSCP-273: §rOmnomnomnomnom");
/* 199 */         par1EntityPlayer.d(new lm(ll.n.H, 400, 0));
/* 200 */         decreaseHunger(-2000);
/* 201 */         var2.a--;
/*     */         
/* 203 */         if (var2.a <= 0)
/*     */         {
/* 205 */           par1EntityPlayer.bJ.a(par1EntityPlayer.bJ.c, (ur)null);
/*     */         }
/*     */       } 
/* 208 */       if (var2.c == mod_SCP.SCP458.cj) {
/* 209 */         par1EntityPlayer.b("§lSCP-273: §rI hope I won't get fat :)");
/* 210 */         par1EntityPlayer.d(new lm(ll.n.H, 2400, 1));
/* 211 */         decreaseHunger(-45000);
/* 212 */         var2.a--;
/*     */         
/* 214 */         if (var2.a <= 0)
/*     */         {
/* 216 */           par1EntityPlayer.bJ.a(par1EntityPlayer.bJ.c, (ur)null);
/*     */         }
/*     */       } 
/*     */     } 
/* 220 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/* 225 */     this.bH = 0.7F;
/* 226 */     qx player = this.p.b((lq)this, 16.0D);
/* 227 */     if (player != null && player.L) this.isAggro = false; 
/* 228 */     if (getHunger() != 0) decreaseHunger(1); 
/* 229 */     if (player != null && getHunger() == 600) player.b("§lSCP-273: §rI am hungry"); 
/* 230 */     if (getHunger() < 300) this.isAggro = true; 
/* 231 */     if (getHunger() <= 0) a(lh.f, 1); 
/* 232 */     super.c();
/*     */   }
/*     */ 
/*     */   
/*     */   protected int decreaseHunger(int par1) {
/* 237 */     return starvingTime -= par1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getHunger() {
/* 242 */     return starvingTime;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setHunger(int par1) {
/* 247 */     this; starvingTime = par1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/* 252 */     super.b(par1NBTTagCompound);
/* 253 */     par1NBTTagCompound.a("Hunger", (short)getHunger());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/* 258 */     super.a(par1NBTTagCompound);
/* 259 */     setHunger(par1NBTTagCompound.d("Hunger"));
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity273.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */