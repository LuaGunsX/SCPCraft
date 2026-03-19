/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import amq;
/*     */ import java.util.Random;
/*     */ import ke;
/*     */ import lh;
/*     */ import ln;
/*     */ import lq;
/*     */ import md;
/*     */ import mi;
/*     */ import mz;
/*     */ import nc;
/*     */ import nh;
/*     */ import nm;
/*     */ import nn;
/*     */ import nv;
/*     */ import nw;
/*     */ import ox;
/*     */ import qx;
/*     */ import up;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity1440 extends ox {
/*     */   public SCPEntity1440(yc par1World) {
/*  27 */     super(par1World);
/*  28 */     this.aG = "/SCPCraft/textures/mobs/1440.png";
/*  29 */     this.bH = 0.35F;
/*  30 */     this.af = true;
/*  31 */     this.bn.a(1, (nc)new mz((md)this));
/*  32 */     this.bn.a(2, (nc)new nn((mi)this, this.bH));
/*  33 */     this.bn.a(3, (nc)new nm((mi)this, this.bH, false));
/*  34 */     this.bn.a(4, (nc)new nw((mi)this, this.bH));
/*  35 */     this.bn.a(5, (nc)new nh((md)this, qx.class, 8.0F));
/*  36 */     this.bn.a(6, (nc)new nv((md)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  41 */     return 9001;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(lh par1DamageSource, int par2) {
/*  46 */     if (par1DamageSource == lh.h) {
/*     */       
/*  48 */       Random rand = new Random();
/*  49 */       int Teleport = rand.nextInt(10);
/*  50 */       boolean var2 = this.p.L().b("mobGriefing");
/*  51 */       this.p.a((lq)this, this.t, this.u, this.v, 3.0F, var2);
/*  52 */       if (Teleport == 0 || Teleport == 5)
/*     */       {
/*  54 */         b(this.t - 4.0D, this.u + 4.0D, this.v);
/*     */       }
/*  56 */       if (Teleport == 1 || Teleport == 6)
/*     */       {
/*  58 */         b(this.t + 4.0D, this.u + 4.0D, this.v);
/*     */       }
/*  60 */       if (Teleport == 2 || Teleport == 7)
/*     */       {
/*  62 */         b(this.t, this.u + 4.0D, this.v + 4.0D);
/*     */       }
/*  64 */       if (Teleport == 3 || Teleport == 8)
/*     */       {
/*  66 */         b(this.t, this.u + 4.0D, this.v - 4.0D);
/*     */       }
/*  68 */       if (Teleport == 4)
/*     */       {
/*  70 */         b(this.t, this.u + 2.0D, this.v);
/*     */       }
/*  72 */       if (Teleport == 9)
/*     */       {
/*  74 */         b(this.t, this.u + 4.0D, this.v - 4.0D);
/*     */       }
/*  76 */       return true;
/*     */     } 
/*  78 */     if (par1DamageSource.g() instanceof SCPEntity50AEJ) {
/*     */       
/*  80 */       x();
/*  81 */       this.p.a((lq)this, "random.hurt", aX(), ((this.aa.nextFloat() - this.aa.nextFloat()) * 0.2F + 1.0F) * 1.8F);
/*  82 */       this.p.a("largeexplode", this.t, this.u + (this.O / 2.0F), this.v, 0.0D, 0.0D, 0.0D);
/*  83 */       qx ep = this.p.b((lq)this, 16.0D);
/*  84 */       Random rand = new Random();
/*  85 */       if (ep != null) {
/*     */         
/*  87 */         int Chat = rand.nextInt(4);
/*  88 */         if (Chat == 0)
/*     */         {
/*  90 */           ep.b("§lSCP-50-AE-1: §rDIE YOU RUSSIAN");
/*     */         }
/*  92 */         if (Chat == 1)
/*     */         {
/*  94 */           ep.b("§lSCP-50-AE-1: §rPINKO PHUCKS");
/*     */         }
/*  96 */         if (Chat == 2)
/*     */         {
/*  98 */           ep.b("§lSCP-50-AE-1: §rUP YOUR LEBENSRAUM YOU UBERMENSCH F*CK");
/*     */         }
/* 100 */         if (Chat == 3)
/*     */         {
/* 102 */           ep.b("§lSCP-50-AE-1: §rCAN YOU HEAR ME NOW HUGO CHAVEZ");
/*     */         }
/*     */       } 
/* 105 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 109 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SCPEnumCreatureAttribute getSCPAttribute() {
/* 115 */     return SCPEnumCreatureAttribute.SCP;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean be() {
/* 123 */     if (!this.isAggro) return true; 
/* 124 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/* 133 */     int i = ke.c(this.t);
/* 134 */     int k = ke.c(this.u);
/* 135 */     int i1 = ke.c(this.v);
/*     */     
/* 137 */     amq[] ablock = { amq.ao, amq.H, amq.w, amq.z, amq.ar, amq.T, amq.y, amq.I, (amq)amq.x, amq.as, amq.M, amq.A, amq.P, amq.bt, amq.bs, amq.bc, amq.by, amq.aO, amq.aH, amq.ae, amq.aZ, amq.aX, amq.aW, amq.ak, amq.R, amq.ax, amq.z, amq.ar, amq.S, amq.bn, amq.aO, amq.aH, mod_SCP.Locker, mod_SCP.KeycardSlot, amq.V, amq.bp, amq.bH, amq.aE, amq.aF, mod_SCP.KeycardSlotLv2, mod_SCP.KeycardSlotLv3, mod_SCP.KeycardSlotOmni };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 145 */     for (int m = 1; m <= 2; m++) {
/*     */       
/* 147 */       for (int length = 0; length <= 41; length++) {
/*     */         
/* 149 */         if (this.p.a(i + 1, k + m, i1) == (ablock[length]).cm)
/* 150 */           this.p.e(i + 1, k + m, i1, 0); 
/* 151 */         if (this.p.a(i - 1, k + m, i1) == (ablock[length]).cm)
/* 152 */           this.p.e(i - 1, k + m, i1, 0); 
/* 153 */         if (this.p.a(i, k + m, i1 - 1) == (ablock[length]).cm)
/* 154 */           this.p.e(i, k + m, i1 - 1, 0); 
/* 155 */         if (this.p.a(i, k + m, i1 + 1) == (ablock[length]).cm) {
/* 156 */           this.p.e(i, k + m, i1 + 1, 0);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 161 */     super.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public void c_(qx par1EntityPlayer) {
/* 166 */     boolean var2 = this.p.L().b("mobGriefing");
/* 167 */     if (par1EntityPlayer != null) {
/*     */       
/* 169 */       this.p.a((lq)this, this.t, this.u, this.v, 2.0F, var2);
/* 170 */       b(this.t + 4.0D, this.u + 4.0D, this.v + 4.0D);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/* 179 */     return "mob.villager.default";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 187 */     return "mob.villager.default";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int bb() {
/* 195 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/* 200 */     ur itemstack = par1EntityPlayer.bJ.g();
/*     */     
/* 202 */     if (itemstack != null && up.e[itemstack.c] instanceof SCPCraft.items.SCPItem1023ARC) {
/*     */       
/* 204 */       x();
/* 205 */       this.p.a("largeexplode", this.t, this.u + (this.O / 2.0F), this.v, 0.0D, 0.0D, 0.0D);
/* 206 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 210 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/* 216 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public ox spawnBabyAnimal(ox entityanimal) {
/* 221 */     return new SCPEntity1440(this.p);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ln a(ln var1) {
/* 227 */     return null;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity1440.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */