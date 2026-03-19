/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import ModLoader;
/*     */ import SCPCraft.CoroAI.PFQueue;
/*     */ import SCPCraft.mod_SCP;
/*     */ import ayp;
/*     */ import bq;
/*     */ import jl;
/*     */ import lh;
/*     */ import ll;
/*     */ import lm;
/*     */ import lq;
/*     */ import md;
/*     */ import qu;
/*     */ import qx;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity049 extends SCPEntity {
/*     */   public boolean isAggro = false;
/*     */   
/*     */   public SCPEntity049(yc par1World) {
/*  23 */     super(par1World);
/*  24 */     PFQueue.canUseLadder = true;
/*  25 */     this.aG = "/SCPCraft/textures/mobs/049.png";
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  30 */     return 30;
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
/*  44 */     if (this.isAggro)
/*     */     {
/*  46 */       if (par1EntityPlayer instanceof md) {
/*     */         
/*  48 */         byte var2 = 0;
/*  49 */         if (this.p.s == 1) { var2 = 3; }
/*  50 */         else if (this.p.s == 2) { var2 = 7; }
/*  51 */         else if (this.p.s == 3) { var2 = 15; }
/*     */         
/*  53 */         if (var2 > 0)
/*     */         {
/*  55 */           par1EntityPlayer.d(new lm(ll.u.H, var2 * 20, 0));
/*     */         }
/*  57 */         par1EntityPlayer.a(lh.a((md)this), 1);
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m(lq par1Entity) {
/*  64 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean canDamagePlayer() {
/*  69 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(lh par1DamageSource, int par2) {
/*  74 */     lq var3 = par1DamageSource.g();
/*  75 */     if (var3 instanceof qx) {
/*     */       
/*  77 */       this.isAggro = true;
/*  78 */       this.a_ = var3;
/*     */     } 
/*  80 */     return super.a(par1DamageSource, par2);
/*     */   }
/*     */ 
/*     */   
/*     */   protected lq j() {
/*  85 */     return this.a_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(qx entityplayer) {
/*  90 */     ur var2 = entityplayer.bJ.g();
/*     */     
/*  92 */     if (var2 != null && var2.c == mod_SCP.SCP427.cj) {
/*     */       
/*  94 */       entityplayer.a((jl)mod_SCP.Healer);
/*  95 */       if (!this.p.I)
/*     */       {
/*  97 */         this.p.b((lq)this, 16.0D).b("§lVillager: §rDamn You.");
/*     */       }
/*  99 */       x();
/* 100 */       this.p.a("largeexplode", this.t, this.u + (this.O / 2.0F), this.v, 0.0D, 0.0D, 0.0D);
/* 101 */       if (--var2.a <= 0)
/*     */       {
/* 103 */         entityplayer.bJ.a(entityplayer.bJ.c, null);
/*     */       }
/* 105 */       if (!this.p.I) {
/*     */         
/* 107 */         qu var3 = new qu(this.p);
/* 108 */         var3.b(this.t, this.u, this.v, this.z, this.A);
/* 109 */         var3.j(aU());
/* 110 */         var3.ax = this.ax;
/* 111 */         this.p.d((lq)var3);
/*     */       } 
/*     */       
/* 114 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 118 */     return super.a(entityplayer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/* 128 */     qx entityplayer = this.p.b((lq)this, 16.0D);
/* 129 */     int q = this.aa.nextInt(8);
/* 130 */     for (int j = 0; j < 1.0E-27D; j++) {
/*     */       
/* 132 */       if (entityplayer != null && this.aa.nextInt(400) == 0 && d((lq)entityplayer) < 3.0F) {
/*     */         
/* 134 */         ayp ayp = (ModLoader.getMinecraftInstance()).e;
/* 135 */         if (q == 1) entityplayer.b("§lSCP-049: §rWhat is this place?"); 
/* 136 */         if (q == 2) entityplayer.b("§lSCP-049: §rHello you marvelous sir!"); 
/* 137 */         if (q == 3) entityplayer.b("§lSCP-049: §rMy cure is the most effective, doctor!"); 
/* 138 */         if (q == 4) entityplayer.b("§lSCP-049: §rThe Pestilence is here, and I can sense it."); 
/* 139 */         if (q == 5) entityplayer.b("§lSCP-049: §rIt is my duty in life to rid the world of the Great Pestilence."); 
/* 140 */         if (q == 6) entityplayer.b("§lSCP-049: §rI assume you are also a doctor?"); 
/* 141 */         if (q == 7) entityplayer.b("§lSCP-049: §rIs this a laboratory? It is quite marvelous."); 
/*     */       } 
/*     */     } 
/* 144 */     super.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/* 149 */     super.b(par1NBTTagCompound);
/* 150 */     par1NBTTagCompound.a("Anger", this.isAggro);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/* 155 */     super.a(par1NBTTagCompound);
/* 156 */     this.isAggro = par1NBTTagCompound.n("Anger");
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity049.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */