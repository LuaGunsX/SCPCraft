/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import bq;
/*     */ import lh;
/*     */ import lq;
/*     */ import md;
/*     */ import mz;
/*     */ import nc;
/*     */ import nh;
/*     */ import nk;
/*     */ import nv;
/*     */ import nw;
/*     */ import oh;
/*     */ import qx;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPEntity966
/*     */   extends SCPEntity
/*     */ {
/*     */   private int freezeTimer;
/*     */   public boolean field_70885_d = false;
/*  26 */   public float field_70886_e = 0.0F;
/*  27 */   public float destPos = 0.0F;
/*     */   public float field_70884_g;
/*     */   public float field_70888_h;
/*  30 */   public float field_70889_i = 1.0F;
/*     */   
/*     */   public int timeUntilFreeze;
/*     */   
/*     */   public SCPEntity966(yc par1World) {
/*  35 */     super(par1World);
/*  36 */     this.aG = "/SCPCraft/textures/mobs/966Infrared.png";
/*  37 */     a(1.0F, 2.0F);
/*  38 */     float var2 = 0.23F;
/*  39 */     this.bH = 0.3F;
/*  40 */     this.timeUntilFreeze = this.aa.nextInt(800);
/*  41 */     az().a(true);
/*  42 */     this.bn.a(0, (nc)new mz((md)this));
/*  43 */     this.bn.a(4, (nc)new nw(this, var2));
/*  44 */     this.bn.a(2, (nc)new nh((md)this, qx.class, 6.0F));
/*  45 */     this.bn.a(2, (nc)new nk((md)this, md.class, this.bH, true));
/*  46 */     this.bn.a(3, (nc)new nv((md)this));
/*  47 */     this.bn.a(1, (nc)new nk((md)this, qx.class, this.bH, false));
/*  48 */     this.bo.a(1, (nc)new oh((md)this, qx.class, 16.0F, 0, true));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(lh par1DamageSource, int par2) {
/*  53 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public String O() {
/*  58 */     qx entityplayer = this.p.b((lq)this, 16.0D);
/*  59 */     if (entityplayer != null) {
/*     */       
/*  61 */       ur var2 = entityplayer.bJ.b[3];
/*     */       
/*  63 */       if (var2 != null && var2.c == mod_SCP.InfraRedGlasses.cj)
/*     */       {
/*  65 */         return "/SCPCraft/textures/mobs/966Infrared.png";
/*     */       }
/*     */ 
/*     */       
/*  69 */       return "/SCPCraft/textures/mobs/966Invis.png";
/*     */     } 
/*     */     
/*  72 */     return "/SCPCraft/textures/mobs/966Invis.png";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean be() {
/*  80 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bl() {
/*  85 */     super.bl();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  94 */     super.c();
/*  95 */     this.field_70888_h = this.field_70886_e;
/*  96 */     this.field_70884_g = this.destPos;
/*  97 */     this.destPos = (float)(this.destPos + (this.E ? -1 : 4) * 0.3D);
/*     */     
/*  99 */     if (this.destPos < 0.0F)
/*     */     {
/* 101 */       this.destPos = 0.0F;
/*     */     }
/*     */     
/* 104 */     if (this.destPos > 1.0F)
/*     */     {
/* 106 */       this.destPos = 1.0F;
/*     */     }
/*     */ 
/*     */     
/* 110 */     if (!this.E && this.field_70889_i < 1.0F)
/*     */     {
/* 112 */       this.field_70889_i = 1.0F;
/*     */     }
/*     */     
/* 115 */     this.field_70889_i = (float)(this.field_70889_i * 0.9D);
/*     */     
/* 117 */     if (!this.E && this.x < 0.0D)
/*     */     {
/* 119 */       this.x *= 0.6D;
/*     */     }
/*     */     
/* 122 */     this.field_70886_e += this.field_70889_i * 2.0F;
/*     */     
/* 124 */     if (!h_() && --this.timeUntilFreeze <= 0) {
/*     */ 
/*     */       
/* 127 */       if (!this.p.I) {
/*     */         
/* 129 */         this.bH = 0.0F;
/* 130 */         this.a_ = null;
/* 131 */         this.p.a((lq)this, "mob.blaze.breath", 1.0F, (this.aa.nextFloat() - this.aa.nextFloat()) * 0.2F + 1.0F);
/*     */       } 
/* 133 */       this.timeUntilFreeze = this.aa.nextInt(1200);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int aT() {
/* 140 */     return 9001;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m(lq par1Entity) {
/* 145 */     return super.m(par1Entity);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/* 150 */     super.a();
/* 151 */     this.ag.a(16, new Byte((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/* 156 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/* 164 */     super.b(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/* 172 */     super.a(par1NBTTagCompound);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity966.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */