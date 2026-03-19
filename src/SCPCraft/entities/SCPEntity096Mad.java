/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import SCPCraft.CoroAI.PFQueue;
/*     */ import SCPCraft.mod_SCP;
/*     */ import amq;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import ke;
/*     */ import lh;
/*     */ import lq;
/*     */ import ly;
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
/*     */ public class SCPEntity096Mad
/*     */   extends SCPEntity {
/*     */   public boolean isAttacking;
/*  30 */   private static final ly field_82219_bJ = new SCPFilterAttack();
/*     */   
/*     */   int time;
/*     */   
/*     */   public SCPEntity096Mad(yc par1World) {
/*  35 */     super(par1World);
/*  36 */     this.aG = "/SCPCraft/textures/mobs/096Mad.png";
/*  37 */     this.bH = 0.7F;
/*  38 */     this.attackStrength = 200;
/*  39 */     this.time = 0;
/*  40 */     az().a(true);
/*  41 */     this.isAttacking = false;
/*  42 */     this.af = true;
/*  43 */     a(0.8F, 1.8F);
/*  44 */     qx entityplayer = this.p.b((lq)this, 256.0D);
/*  45 */     PFQueue.getPath((lq)this, this.a_, 256.0F);
/*  46 */     az().b(true);
/*  47 */     this.bn.a(0, (nc)new mz((md)this));
/*  48 */     this.bn.a(1, (nc)new mt((md)this));
/*  49 */     this.bn.a(2, (nc)new nk((md)this, qx.class, this.bH, false));
/*  50 */     this.bn.a(2, (nc)new nk((md)this, md.class, this.bH, true));
/*  51 */     this.bn.a(3, (nc)new nn(this, this.bH));
/*  52 */     this.bn.a(4, (nc)new nm(this, this.bH, false));
/*  53 */     this.bn.a(5, (nc)new nw(this, this.bH));
/*  54 */     this.bn.a(6, (nc)new nh((md)this, qx.class, 8.0F));
/*  55 */     this.bn.a(6, (nc)new nv((md)this));
/*  56 */     this.bo.a(1, (nc)new og((md)this, false));
/*  57 */     this.bo.a(2, (nc)new oh((md)this, qx.class, 48.0F, 0, true));
/*  58 */     this.bo.a(2, (nc)new oh((md)this, md.class, 48.0F, 0, false, false, field_82219_bJ));
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  63 */     return 9001;
/*     */   }
/*     */ 
/*     */   
/*     */   public void targetLivings() {
/*  68 */     List var5 = this.p.a(md.class, this.D.b(64.0D, 40.0D, 64.0D), field_82219_bJ);
/*  69 */     Iterator<lq> var2 = var5.iterator();
/*     */     
/*  71 */     while (var2.hasNext()) {
/*     */       
/*  73 */       lq var3 = var2.next();
/*  74 */       md var4 = (md)var3;
/*     */       
/*  76 */       if (var4 != null)
/*     */       {
/*  78 */         this.a_ = (lq)var4;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(lh par1DamageSource, int par2) {
/*  85 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean be() {
/*  93 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected lq j() {
/*  98 */     qx entityplayer = this.p.b((lq)this, 256.0D);
/*     */     
/* 100 */     if (entityplayer != null)
/*     */     {
/* 102 */       this.isAttacking = true;
/*     */     }
/*     */     
/* 105 */     return (lq)entityplayer;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/* 110 */     int min, i = ke.c(this.t);
/* 111 */     int k = ke.c(this.u);
/* 112 */     int i1 = ke.c(this.v);
/* 113 */     this.isAttacking = (this.a_ != null);
/*     */     
/* 115 */     PFQueue.getPath((lq)this, this.a_, 256.0F);
/*     */     
/* 117 */     if (this.a_ != null && this.a_ instanceof qx && ((qx)this.a_).is096Target == true && !this.a_.S())
/*     */     {
/* 119 */       if (!this.p.I) {
/*     */         
/* 121 */         x();
/* 122 */         this; spawnCreature(this.p, this.t, this.u, this.v);
/*     */       } 
/*     */     }
/* 125 */     if (this.time % 90 == 0) this.p.a((lq)this, "sounds.096Scream", 5.0F, 1.0F); 
/* 126 */     this.time++;
/*     */     
/* 128 */     amq[] ablock = { amq.ao, amq.H, amq.w, amq.z, amq.ar, amq.T, amq.y, amq.I, (amq)amq.x, amq.as, amq.M, amq.A, amq.P, amq.bt, amq.bs, amq.bc, amq.by, amq.aO, amq.aH, amq.ae, amq.aZ, amq.aX, amq.aW, amq.ak, amq.R, amq.ax, amq.z, amq.ar, amq.S, amq.bn, amq.aO, amq.aH, mod_SCP.KeycardSlot, amq.V, amq.bp, amq.bH, amq.aE, amq.aF, mod_SCP.KeycardSlotLv2, mod_SCP.KeycardSlotLv3, mod_SCP.KeycardSlotOmni, (amq)amq.N, amq.aI, amq.cd, amq.ck, amq.cf, amq.cg, amq.cj, amq.ch, amq.ci, amq.ce, amq.cc, amq.aq, amq.bI, amq.bY, amq.bb, amq.aY, amq.bj, amq.bo, amq.B, amq.al, amq.aV, mod_SCP.Machinery, mod_SCP.BloodBlock, mod_SCP.Bone, mod_SCP.Granite, mod_SCP.Flesh, mod_SCP.CorrodedIron, mod_SCP.CorrodedDoor, mod_SCP.SlidingDoor, mod_SCP.ElectricWool, mod_SCP.GrateBlock, mod_SCP.SCP015, mod_SCP.SCP143Leaves, amq.bg, (amq)amq.ag, (amq)amq.ah, amq.aU, amq.aC, amq.bS, amq.aA, amq.bZ, amq.cb, amq.ca, amq.bA, amq.bT, amq.bF, amq.aw, amq.bz, amq.aK, mod_SCP.SCP143Log, mod_SCP.SCP143Planks, mod_SCP.SCP143Sapling, amq.at, mod_SCP.Marble, amq.L, amq.K, amq.az, amq.aQ, amq.J, amq.bU, amq.bx, (amq)amq.aa, amq.bi, amq.bd, amq.aP, (amq)amq.bR, (amq)amq.bQ, (amq)amq.an, (amq)amq.am, amq.aN, mod_SCP.SCP015, amq.ba };
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
/* 143 */     if (this.a_ != null && this.u == this.a_.u) { min = 0; }
/* 144 */     else { min = 1; }
/*     */     
/* 146 */     for (int m = min; m <= 3; m++) {
/*     */       
/* 148 */       for (int length = 0; length <= ablock.length - 1; length++) {
/* 149 */         int met1 = this.p.h(i + 1, k + m, i1);
/* 150 */         int id1 = this.p.a(i + 1, k + m, i1);
/* 151 */         int met2 = this.p.h(i - 1, k + m, i1);
/* 152 */         int id2 = this.p.a(i - 1, k + m, i1);
/* 153 */         int met3 = this.p.h(i, k + m, i1 - 1);
/* 154 */         int id3 = this.p.a(i, k + m, i1 - 1);
/* 155 */         int met4 = this.p.h(i, k + m, i1 + 1);
/* 156 */         int id4 = this.p.a(i, k + m, i1 + 1);
/* 157 */         if (this.p.a(i + 1, k + m, i1) == (ablock[length]).cm) {
/* 158 */           this.p.a((qx)null, 1012, (int)this.t, (int)this.u, (int)this.v, 0);
/* 159 */           this.p.f(2001, i + 1, k + m, i1, id1 + (met1 << 12));
/* 160 */           this.p.e(i + 1, k + m, i1, 0);
/* 161 */         }  if (this.p.a(i - 1, k + m, i1) == (ablock[length]).cm) {
/* 162 */           this.p.a((qx)null, 1012, (int)this.t, (int)this.u, (int)this.v, 0);
/* 163 */           this.p.f(2001, i - 1, k + m, i1, id2 + (met2 << 12));
/* 164 */           this.p.e(i - 1, k + m, i1, 0);
/* 165 */         }  if (this.p.a(i, k + m, i1 - 1) == (ablock[length]).cm) {
/* 166 */           this.p.a((qx)null, 1012, (int)this.t, (int)this.u, (int)this.v, 0);
/* 167 */           this.p.f(2001, i, k + m, i1 - 1, id3 + (met3 << 12));
/* 168 */           this.p.e(i, k + m, i1 - 1, 0);
/* 169 */         }  if (this.p.a(i, k + m, i1 + 1) == (ablock[length]).cm) {
/* 170 */           this.p.a((qx)null, 1012, (int)this.t, (int)this.u, (int)this.v, 0);
/* 171 */           this.p.f(2001, i, k + m, i1 + 1, id4 + (met4 << 12));
/* 172 */           this.p.e(i, k + m, i1 + 1, 0);
/*     */         } 
/*     */       } 
/*     */     } 
/* 176 */     if (this.p.u() && !this.p.I) {
/*     */       
/* 178 */       float f = c(1.0F);
/*     */       
/* 180 */       if (f > 0.5F && this.p.k(ke.c(this.t), ke.c(this.u), ke.c(this.v)) && this.aa.nextFloat() * 30.0F < (f - 0.4F) * 2.0F)
/*     */       {
/* 182 */         this.a_ = null;
/*     */       }
/*     */     } 
/*     */     
/* 186 */     this.bF = false;
/*     */     
/* 188 */     super.c();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/* 195 */     return "mob.villager.default";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/* 203 */     return "mob.villager.default";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 211 */     return "mob.villager.default";
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/* 216 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean spawnCreature(yc par0World, double par2, double par4, double par6) {
/* 221 */     SCPEntity096Docile var8 = new SCPEntity096Docile(par0World);
/* 222 */     var8.b(par2, par4, par6, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 223 */     par0World.d((lq)var8);
/* 224 */     var8.aO();
/*     */     
/* 226 */     return (var8 != null);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity096Mad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */