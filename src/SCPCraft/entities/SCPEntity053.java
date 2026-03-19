/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import ModLoader;
/*     */ import aoj;
/*     */ import bq;
/*     */ import ke;
/*     */ import lh;
/*     */ import ll;
/*     */ import lm;
/*     */ import lq;
/*     */ import md;
/*     */ import mz;
/*     */ import nc;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import nh;
/*     */ import nk;
/*     */ import nv;
/*     */ import nw;
/*     */ import qx;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity053
/*     */   extends SCPEntity {
/*     */   private int field_35185_e;
/*     */   public boolean isAttacking;
/*     */   private boolean isAngry;
/*     */   
/*     */   public SCPEntity053(yc par1World) {
/*  29 */     super(par1World);
/*  30 */     this.aG = "/SCPCraft/textures/mobs/053.png";
/*  31 */     a(1.0F, 2.0F);
/*  32 */     this.bH = 0.4F;
/*  33 */     this.X = 1.0F;
/*  34 */     this.attackStrength = 0;
/*  35 */     az().a(true);
/*  36 */     float var2 = 0.25F;
/*  37 */     this.isAngry = false;
/*  38 */     this.af = true;
/*  39 */     this.bn.a(0, (nc)new mz((md)this));
/*  40 */     this.bn.a(1, (nc)new nw(this, var2));
/*  41 */     this.bn.a(2, (nc)new nh((md)this, qx.class, 6.0F));
/*  42 */     this.bn.a(3, (nc)new nv((md)this));
/*  43 */     this.bn.a(4, (nc)new nk((md)this, qx.class, this.bH, false));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean be() {
/*  51 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void targetLivings() {}
/*     */ 
/*     */   
/*     */   public boolean a(lh par1DamageSource, int par2) {
/*  60 */     qx ep = this.p.b((lq)this, 16.0D);
/*  61 */     if (ep != null) ep.d(new lm(ll.u.H, 400, 2)); 
/*  62 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  67 */     return 9001;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/*  72 */     super.a();
/*  73 */     this.ag.a(16, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/*  81 */     super.b(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/*  89 */     super.a(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/*  94 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(float par1) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected lq j() {
/* 106 */     qx entityplayer = this.p.b((lq)this, 64.0D);
/*     */     
/* 108 */     if (entityplayer != null)
/*     */     {
/* 110 */       if (shouldAttackPlayer(entityplayer)) {
/*     */         
/* 112 */         if (this.field_35185_e++ == 5)
/*     */         {
/* 114 */           this.field_35185_e = 0;
/* 115 */           return (lq)entityplayer;
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 120 */         this.field_35185_e = 0;
/*     */       } 
/*     */     }
/*     */     
/* 124 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean shouldAttackPlayer(qx par1EntityPlayer) {
/* 129 */     if (par1EntityPlayer != null) {
/*     */       
/* 131 */       aoj vec3d = par1EntityPlayer.i(1.0F).a();
/* 132 */       aoj vec3d1 = aoj.a(this.t - par1EntityPlayer.t, this.D.b + (this.O / 2.0F) - par1EntityPlayer.u + par1EntityPlayer.e(), this.v - par1EntityPlayer.v);
/* 133 */       double d = vec3d1.b();
/* 134 */       vec3d1 = vec3d1.a();
/* 135 */       double d1 = vec3d.b(vec3d1);
/*     */       
/* 137 */       if (d1 > 1.0D - 0.025D / d)
/*     */       {
/* 139 */         return par1EntityPlayer.n((lq)this);
/*     */       }
/*     */ 
/*     */       
/* 143 */       return false;
/*     */     } 
/*     */     
/* 146 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/* 151 */     qx entityplayer = this.p.b((lq)this, 16.0D);
/* 152 */     this.w = 0.0D;
/* 153 */     this.y = 0.0D;
/* 154 */     this.isAttacking = (this.a_ != null);
/* 155 */     this.bH = (this.a_ == null) ? 0.3F : 6.5F;
/*     */     
/* 157 */     if (shouldAttackPlayer(entityplayer) == true)
/*     */     {
/* 159 */       if (!this.p.I) {
/*     */         
/* 161 */         Minecraft mc = ModLoader.getMinecraftInstance();
/* 162 */         if (entityplayer != null && mc.b.g())
/*     */         {
/* 164 */           entityplayer.d(new lm(ll.k.H, 144, 2));
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 169 */     if (this.p.u() && !this.p.I) {
/*     */       
/* 171 */       float f = c(1.0F);
/*     */       
/* 173 */       if (f > 0.5F && this.p.k(ke.c(this.t), ke.c(this.u), ke.c(this.v)) && this.aa.nextFloat() * 30.0F < (f - 0.4F) * 2.0F)
/*     */       {
/* 175 */         this.a_ = null;
/*     */       }
/*     */     } 
/*     */     
/* 179 */     this.bF = false;
/*     */     
/* 181 */     if (this.a_ != null)
/*     */     {
/* 183 */       a(this.a_, 100.0F, 100.0F);
/*     */     }
/*     */     
/* 186 */     if (!this.p.I && S())
/*     */     {
/* 188 */       if (this.a_ != null)
/*     */       {
/* 190 */         if (this.a_ instanceof qx && shouldAttackPlayer((qx)this.a_)) {
/*     */           
/* 192 */           this.bC = this.bD = 0.0F;
/* 193 */           this.bH = 0.0F;
/*     */         } 
/*     */       }
/*     */     }
/*     */     
/* 198 */     super.c();
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity053.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */