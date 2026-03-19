/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import ModLoader;
/*     */ import SCPCraft.mod_SCP;
/*     */ import aoj;
/*     */ import bq;
/*     */ import ke;
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
/*     */ public class SCPEntity023
/*     */   extends SCPEntity {
/*     */   private int field_35185_e;
/*     */   public boolean isAttacking;
/*     */   private boolean isAngry;
/*     */   
/*     */   public SCPEntity023(yc par1World) {
/*  27 */     super(par1World);
/*  28 */     this.aG = "/SCPCraft/textures/mobs/023.png";
/*  29 */     a(1.0F, 1.0F);
/*  30 */     this.bH = 0.4F;
/*  31 */     this.X = 1.0F;
/*  32 */     this.attackStrength = 2;
/*  33 */     az().a(true);
/*  34 */     float var2 = 0.25F;
/*  35 */     this.isAngry = false;
/*  36 */     this.af = true;
/*  37 */     this.bn.a(0, (nc)new mz((md)this));
/*  38 */     this.bn.a(1, (nc)new nw(this, var2));
/*  39 */     this.bn.a(2, (nc)new nh((md)this, qx.class, 6.0F));
/*  40 */     this.bn.a(2, (nc)new nk((md)this, md.class, this.bH, true));
/*  41 */     this.bn.a(3, (nc)new nv((md)this));
/*  42 */     this.bn.a(4, (nc)new nk((md)this, qx.class, this.bH, false));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean be() {
/*  50 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  55 */     return 100;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/*  60 */     super.a();
/*  61 */     this.ag.a(16, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/*  69 */     super.b(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/*  77 */     super.a(par1NBTTagCompound);
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
/*     */   protected void a(float par1) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected lq j() {
/*  94 */     qx entityplayer = this.p.b((lq)this, 64.0D);
/*     */     
/*  96 */     if (entityplayer != null)
/*     */     {
/*  98 */       if (shouldAttackPlayer(entityplayer)) {
/*     */         
/* 100 */         if (this.field_35185_e++ == 5)
/*     */         {
/* 102 */           this.field_35185_e = 0;
/* 103 */           return (lq)entityplayer;
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 108 */         this.field_35185_e = 0;
/*     */       } 
/*     */     }
/*     */     
/* 112 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean shouldAttackPlayer(qx par1EntityPlayer) {
/* 117 */     if (par1EntityPlayer != null) {
/*     */       
/* 119 */       aoj vec3d = par1EntityPlayer.i(1.0F).a();
/* 120 */       aoj vec3d1 = aoj.a(this.t - par1EntityPlayer.t, this.D.b + (this.O / 2.0F) - par1EntityPlayer.u + par1EntityPlayer.e(), this.v - par1EntityPlayer.v);
/* 121 */       double d = vec3d1.b();
/* 122 */       vec3d1 = vec3d1.a();
/* 123 */       double d1 = vec3d.b(vec3d1);
/*     */       
/* 125 */       if (d1 > 1.0D - 0.025D / d)
/*     */       {
/* 127 */         return par1EntityPlayer.n((lq)this);
/*     */       }
/*     */ 
/*     */       
/* 131 */       return false;
/*     */     } 
/*     */     
/* 134 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/* 139 */     qx entityplayer = this.p.b((lq)this, 16.0D);
/* 140 */     this.w = 0.0D;
/* 141 */     this.y = 0.0D;
/* 142 */     this.isAttacking = (this.a_ != null);
/* 143 */     this.bH = (this.a_ == null) ? 0.3F : 6.5F;
/*     */     
/* 145 */     if (shouldAttackPlayer(entityplayer) == true)
/*     */     {
/* 147 */       if (!this.p.I) {
/*     */         
/* 149 */         Minecraft mc = ModLoader.getMinecraftInstance();
/* 150 */         if (entityplayer != null && !entityplayer.cd.d)
/*     */         {
/* 152 */           entityplayer.a(mod_SCP.SCP023, 6);
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 157 */     if (this.p.u() && !this.p.I) {
/*     */       
/* 159 */       float f = c(1.0F);
/*     */       
/* 161 */       if (f > 0.5F && this.p.k(ke.c(this.t), ke.c(this.u), ke.c(this.v)) && this.aa.nextFloat() * 30.0F < (f - 0.4F) * 2.0F)
/*     */       {
/* 163 */         this.a_ = null;
/*     */       }
/*     */     } 
/*     */     
/* 167 */     this.bF = false;
/*     */     
/* 169 */     if (this.a_ != null)
/*     */     {
/* 171 */       a(this.a_, 100.0F, 100.0F);
/*     */     }
/*     */     
/* 174 */     if (!this.p.I && S())
/*     */     {
/* 176 */       if (this.a_ != null)
/*     */       {
/* 178 */         if (this.a_ instanceof qx && shouldAttackPlayer((qx)this.a_)) {
/*     */           
/* 180 */           this.bC = this.bD = 0.0F;
/* 181 */           this.bH = 0.0F;
/*     */         } 
/*     */       }
/*     */     }
/*     */     
/* 186 */     super.c();
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity023.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */