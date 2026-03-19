/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import bq;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import lh;
/*     */ import lq;
/*     */ import md;
/*     */ import mz;
/*     */ import nc;
/*     */ import nh;
/*     */ import nk;
/*     */ import nv;
/*     */ import nw;
/*     */ import og;
/*     */ import oh;
/*     */ import pu;
/*     */ import qx;
/*     */ import up;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPEntity217Creeper
/*     */   extends SCPEntity
/*     */ {
/*     */   int timeSinceIgnited;
/*     */   int lastActiveTime;
/*     */   
/*     */   public SCPEntity217Creeper(yc par1World) {
/*  37 */     super(par1World);
/*  38 */     this.aG = "/SCPCraft/textures/mobs/SCP217/SCPCreeper.png";
/*  39 */     this.bn.a(1, (nc)new mz((md)this));
/*  40 */     this.bn.a(2, new SCPEntityAICreeperSwell(this));
/*  41 */     this.bn.a(4, (nc)new nk((md)this, 0.25F, false));
/*  42 */     this.bn.a(5, (nc)new nw(this, 0.2F));
/*  43 */     this.bn.a(6, (nc)new nh((md)this, qx.class, 8.0F));
/*  44 */     this.bn.a(6, (nc)new nv((md)this));
/*  45 */     this.bo.a(1, (nc)new oh((md)this, qx.class, 16.0F, 0, true));
/*  46 */     this.bo.a(2, (nc)new og((md)this, false));
/*     */   }
/*     */ 
/*     */   
/*     */   public SCPEnumCreatureAttribute getSCPAttribute() {
/*  51 */     return SCPEnumCreatureAttribute.SCP;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean be() {
/*  59 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  64 */     return 25;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/*  69 */     super.a();
/*  70 */     this.ag.a(16, Byte.valueOf((byte)-1));
/*  71 */     this.ag.a(17, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/*  79 */     super.b(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/*  87 */     super.a(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void j_() {
/*  95 */     if (S()) {
/*     */       
/*  97 */       this.lastActiveTime = this.timeSinceIgnited;
/*  98 */       int var1 = getCreeperState();
/*     */       
/* 100 */       if (var1 > 0 && this.timeSinceIgnited == 0)
/*     */       {
/* 102 */         this.p.a((lq)this, "random.fuse", 1.0F, 0.5F);
/*     */       }
/*     */       
/* 105 */       this.timeSinceIgnited += var1;
/*     */       
/* 107 */       if (this.timeSinceIgnited < 0)
/*     */       {
/* 109 */         this.timeSinceIgnited = 0;
/*     */       }
/*     */       
/* 112 */       if (this.timeSinceIgnited >= 30) {
/*     */         
/* 114 */         this.timeSinceIgnited = 30;
/*     */         
/* 116 */         if (!this.p.I) {
/*     */           
/* 118 */           this.p.a((lq)this, this.t, this.u, this.v, 1.0F, false);
/* 119 */           x();
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 124 */     super.j_();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/* 132 */     return "mob.creeper";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 140 */     return "mob.creeperdeath";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(lh par1DamageSource) {
/* 148 */     super.a(par1DamageSource);
/*     */     
/* 150 */     if (par1DamageSource.g() instanceof qn)
/*     */     {
/* 152 */       b(mod_SCP.Locker.cm + this.aa.nextInt(10), 1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m(lq par1Entity) {
/* 158 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getPowered() {
/* 166 */     return (this.ag.a(17) == 1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public float setCreeperFlashTime(float par1) {
/* 176 */     return (this.lastActiveTime + (this.timeSinceIgnited - this.lastActiveTime) * par1) / 28.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int bb() {
/* 184 */     return up.o.cj;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getCreeperState() {
/* 192 */     return this.ag.a(16);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCreeperState(int par1) {
/* 200 */     this.ag.b(16, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(pu par1EntityLightningBolt) {
/* 208 */     super.a(par1EntityLightningBolt);
/* 209 */     this.ag.b(17, Byte.valueOf((byte)1));
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity217Creeper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */