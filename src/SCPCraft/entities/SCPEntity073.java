/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import amq;
/*     */ import java.util.Random;
/*     */ import ke;
/*     */ import lh;
/*     */ import lq;
/*     */ import md;
/*     */ import mt;
/*     */ import mz;
/*     */ import nc;
/*     */ import nh;
/*     */ import nk;
/*     */ import nm;
/*     */ import nn;
/*     */ import nv;
/*     */ import nw;
/*     */ import og;
/*     */ import oh;
/*     */ import qx;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity073 extends SCPEntity {
/*  25 */   Random aa = new Random();
/*     */ 
/*     */   
/*     */   public SCPEntity073(yc par1World) {
/*  29 */     super(par1World);
/*  30 */     this.aG = "/SCPCraft/textures/mobs/073.png";
/*  31 */     this.bH = 0.35F;
/*  32 */     this.aR = 150;
/*  33 */     this.attackStrength = 6;
/*  34 */     this.af = true;
/*  35 */     az().b(true);
/*  36 */     this.bn.a(0, (nc)new mz((md)this));
/*  37 */     this.bn.a(1, (nc)new mt((md)this));
/*  38 */     this.bn.a(2, (nc)new nk((md)this, SCPEntity076.class, this.bH, true));
/*  39 */     this.bn.a(3, (nc)new nn(this, this.bH));
/*  40 */     this.bn.a(4, (nc)new nm(this, this.bH, false));
/*  41 */     this.bn.a(5, (nc)new nw(this, 0.3F));
/*  42 */     this.bn.a(6, (nc)new nh((md)this, qx.class, 8.0F));
/*  43 */     this.bn.a(6, (nc)new nv((md)this));
/*  44 */     this.bo.a(1, (nc)new og((md)this, false));
/*  45 */     this.bo.a(2, (nc)new oh((md)this, SCPEntity076.class, 16.0F, 0, false));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void targetLivings() {}
/*     */ 
/*     */   
/*     */   public boolean a(lh par1DamageSource, int par2) {
/*  54 */     qx ep = this.p.b((lq)this, 16.0D);
/*  55 */     md entity = (md)par1DamageSource.g();
/*  56 */     if (entity != null) {
/*  57 */       entity.a(mod_SCP.SCP073, par2);
/*  58 */       i(par2);
/*     */     } 
/*  60 */     if (ep != null && !this.p.I) ep.b("§lSCP-073: §rPlease don't do that again. It hurts :c"); 
/*  61 */     return super.a(par1DamageSource, par2);
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  66 */     return this.aR;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean be() {
/*  74 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  83 */     super.c();
/*     */     
/*  85 */     int var1 = ke.c(this.t);
/*  86 */     int var2 = ke.c(this.v);
/*  87 */     for (var1 = 0; var1 < 4; var1++) {
/*     */       
/*  89 */       var2 = ke.c(this.t + ((var1 % 2 * 2 - 1) * 0.25F));
/*  90 */       int var3 = ke.c(this.u);
/*  91 */       int var4 = ke.c(this.v + ((var1 / 2 % 2 * 2 - 1) * 0.25F));
/*     */       
/*  93 */       if (this.p.a(var2, var3 - 1, var4) == amq.x.cm)
/*     */       {
/*  95 */         this.p.e(var2, var3 - 1, var4, amq.y.cm);
/*     */       }
/*     */       
/*  98 */       if (this.p.a(var2, var3, var4) == amq.aa.cm)
/*     */       {
/* 100 */         this.p.e(var2, var3, var4, 0);
/*     */       }
/*     */       
/* 103 */       if (this.p.a(var2, var3, var4) == amq.ah.cm || this.p.a(var2, var3, var4) == amq.ag.cm)
/*     */       {
/* 105 */         this.p.e(var2, var3, var4, 0);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/* 115 */     return "mob.villager.default";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 123 */     return "mob.blaze.breath";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int bb() {
/* 131 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/* 136 */     return false;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity073.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */