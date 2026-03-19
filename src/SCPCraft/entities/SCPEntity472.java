/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import bq;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import lh;
/*     */ import ll;
/*     */ import lm;
/*     */ import lq;
/*     */ import ly;
/*     */ import md;
/*     */ import qx;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity472
/*     */   extends SCPEntity
/*     */ {
/*  19 */   private static final ly field_82219_bJ = new SCP472FilterAttack();
/*     */   int time;
/*     */   
/*     */   public SCPEntity472(yc par1World) {
/*  23 */     super(par1World);
/*  24 */     a(0.3F, 0.3F);
/*  25 */     this.aG = "/SCPCraft/textures/mobs/472.png";
/*  26 */     this.bH = 0.0F;
/*  27 */     this.attackStrength = 0;
/*  28 */     this.af = true;
/*  29 */     this.time = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public SCPEnumCreatureAttribute getSCPAttribute() {
/*  34 */     return SCPEnumCreatureAttribute.SCPObject;
/*     */   }
/*     */ 
/*     */   
/*     */   protected String aY() {
/*  39 */     return "mob.villager.default";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void targetLivings() {}
/*     */ 
/*     */   
/*     */   public int aN() {
/*  48 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   protected lq j() {
/*  53 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void c_(qx par1Entityvar4) {}
/*     */ 
/*     */   
/*     */   protected float aX() {
/*  62 */     return 1.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  67 */     return 9001;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean be() {
/*  72 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(lh par1DamageSource, int par2) {
/*  77 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m(lq par1Entity) {
/*  82 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/*  87 */     super.a();
/*  88 */     this.ag.a(16, new Byte((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  93 */     this.A = 0.0F;
/*  94 */     this.z = 0.0F;
/*  95 */     if (this.time % 50 == 0) this.p.a((lq)this, "sounds.heartbeat", 1.0F, 1.0F); 
/*  96 */     this.time++;
/*  97 */     List var5 = this.p.a(md.class, this.D.b(9.0D, 4.0D, 9.0D), field_82219_bJ);
/*  98 */     qx player = this.p.a((lq)this, 256.0D);
/*  99 */     Iterator<lq> var2 = var5.iterator();
/* 100 */     while (var2.hasNext()) {
/*     */       
/* 102 */       lq var3 = var2.next();
/* 103 */       md var4 = (md)var3;
/* 104 */       if (var4 != null) {
/*     */         
/* 106 */         if (this.aU == 0) var4.increaseExposure(1); 
/* 107 */         if (var4.getExposure() >= 0 && var4.getExposure() <= 15) var4.d(new lm(ll.d.H, 40, 0)); 
/* 108 */         if (var4.getExposure() >= 16 && var4.getExposure() <= 30) {
/* 109 */           var4.d(new lm(ll.d.H, 300, 0));
/* 110 */           var4.d(new lm(mod_SCP.shake.H, 300, 0));
/* 111 */           var4.d(new lm(mod_SCP.bloodStone.H, 300, 0));
/* 112 */           this.p.g((lq)var4);
/*     */         } 
/* 114 */         if (var4.getExposure() >= 31 && var4.getExposure() <= 50) {
/* 115 */           var4.d(new lm(ll.d.H, 3600, 0));
/* 116 */           var4.d(new lm(ll.k.H, 3600, 0));
/* 117 */           var4.d(new lm(mod_SCP.bloodStone.H, 3600, 1));
/* 118 */           this.p.g((lq)var4);
/*     */         } 
/* 120 */         if (var4.getExposure() >= 51 && var4.getExposure() <= 68) {
/* 121 */           var4.o(ll.d.H);
/* 122 */           var4.d(new lm(ll.k.H, 10800, 0));
/* 123 */           var4.d(new lm(ll.q.H, 10800, 1));
/* 124 */           var4.d(new lm(mod_SCP.bloodStone.H, 10800, 2));
/* 125 */           this.p.g((lq)var4);
/*     */         } 
/* 127 */         if (var4.getExposure() >= 69 && var4.getExposure() <= 79) {
/* 128 */           var4.o(ll.q.H);
/* 129 */           var4.d(new lm(ll.k.H, 86400, 1));
/* 130 */           var4.d(new lm(ll.q.H, 86400, 0));
/* 131 */           var4.d(new lm(mod_SCP.bloodStone.H, 86400, 2));
/* 132 */           if (this.aa.nextInt(20) == 0) this.p.a(((float)var4.t + 0.5F), ((float)var4.u + 0.5F), ((float)var4.v + 0.5F), "sounds.whispers", 0.5F, 1.0F); 
/* 133 */           this.p.g((lq)var4);
/*     */         } 
/* 135 */         if (var4.getExposure() >= 80) {
/* 136 */           var4.o(ll.q.H);
/* 137 */           var4.d(new lm(ll.k.H, 86400, 1));
/* 138 */           var4.d(new lm(ll.q.H, 86400, 0));
/* 139 */           var4.d(new lm(mod_SCP.bloodStone.H, 86400, 2));
/* 140 */           if (this.aa.nextInt(20) == 0) this.p.a(((float)var4.t + 0.5F), ((float)var4.u + 0.5F), ((float)var4.v + 0.5F), "sounds.whispers", 0.5F, 1.0F); 
/* 141 */           var4.a(mod_SCP.bloodstone, 1);
/* 142 */           this.p.g((lq)var4);
/*     */         } 
/*     */       } 
/* 145 */       if (var4.L) var4.setExposure(0); 
/*     */     } 
/* 147 */     if (player != null && e((lq)player) > 81.0D && player.getExposure() > 0 && this.aa.nextInt(20) == 0) player.increaseExposure(-1); 
/* 148 */     this.w = 0.0D;
/* 149 */     this.y = 0.0D;
/* 150 */     super.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public void j_() {
/* 155 */     super.j_();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean f_() {
/* 164 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/* 172 */     super.b(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/* 180 */     super.a(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/* 185 */     return false;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity472.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */