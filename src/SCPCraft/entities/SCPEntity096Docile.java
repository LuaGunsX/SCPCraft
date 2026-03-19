/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import ModLoader;
/*     */ import aoj;
/*     */ import ays;
/*     */ import lq;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import qx;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity096Docile
/*     */   extends SCPEntity {
/*     */   private int field_35185_e;
/*     */   public boolean isAttacking;
/*     */   int time;
/*     */   
/*     */   public SCPEntity096Docile(yc par1World) {
/*  18 */     super(par1World);
/*  19 */     this.aG = "/SCPCraft/textures/mobs/096Mad.png";
/*  20 */     this.bH = 0.0F;
/*  21 */     this.attackStrength = 0;
/*  22 */     this.time = 0;
/*  23 */     this.isAttacking = false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void targetLivings() {}
/*     */ 
/*     */   
/*     */   public int aT() {
/*  32 */     return 9001;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean be() {
/*  40 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected lq j() {
/*  45 */     qx entityplayer = this.p.b((lq)this, 64.0D);
/*     */     
/*  47 */     if (entityplayer != null)
/*     */     {
/*  49 */       if (shouldAttackPlayer(entityplayer)) {
/*     */         
/*  51 */         if (this.field_35185_e++ == 5)
/*     */         {
/*  53 */           this.field_35185_e = 0;
/*  54 */           return (lq)entityplayer;
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/*  59 */         this.field_35185_e = 0;
/*     */       } 
/*     */     }
/*     */     
/*  63 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void c_(qx par1EntityPlayer) {}
/*     */ 
/*     */   
/*     */   private boolean shouldAttackPlayer(qx par1EntityPlayer) {
/*  72 */     ays ays = (ModLoader.getMinecraftInstance()).g;
/*  73 */     if (par1EntityPlayer != null && ays != null && (ays.getBlink() < 0 || ays.getBlink() > 10)) {
/*     */       
/*  75 */       aoj var3 = par1EntityPlayer.i(1.0F).a();
/*  76 */       aoj var4 = this.p.S().a(this.t - par1EntityPlayer.t + 1.0D, this.D.b + (this.O / 2.0F) - par1EntityPlayer.u + par1EntityPlayer.e(), this.v - par1EntityPlayer.v + 1.0D);
/*  77 */       double var5 = var4.b();
/*  78 */       var4 = var4.a();
/*  79 */       double var7 = var3.b(var4);
/*  80 */       return (var7 > 0.6D - 0.025D / var5) ? par1EntityPlayer.n((lq)this) : false;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  87 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  92 */     qx entityplayer = this.p.b((lq)this, 64.0D);
/*  93 */     this.w = 0.0D;
/*  94 */     this.y = 0.0D;
/*  95 */     this.z = 0.0F;
/*  96 */     this.ax = 0.0F;
/*  97 */     this.bC = 0.0F;
/*  98 */     this.bD = 0.0F;
/*  99 */     this.bE = 0.0F;
/* 100 */     this.isAttacking = (this.a_ != null);
/* 101 */     if (this.time % 340 == 0) this.p.a((lq)this, "sounds.096Cry", 5.0F, 1.0F); 
/* 102 */     this.time++;
/* 103 */     Minecraft mc = ModLoader.getMinecraftInstance();
/*     */     
/* 105 */     if (shouldAttackPlayer(entityplayer) == true && entityplayer.S()) {
/*     */       
/* 107 */       entityplayer.set096TargetState(true);
/* 108 */       if (!this.p.I) {
/*     */         
/* 110 */         x();
/* 111 */         SCPEntity096Cry silver = new SCPEntity096Cry(this.p);
/* 112 */         silver.b(this.t, this.u, this.v, 0.0F, 0.0F);
/* 113 */         this.p.d((lq)silver);
/* 114 */         silver.aO();
/*     */       } 
/*     */     } 
/*     */     
/* 118 */     if (Math.abs(this.x) < 0.005D)
/*     */     {
/* 120 */       this.x = 0.0D;
/*     */     }
/* 122 */     this.bF = false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/* 129 */     return "mob.villager.default";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/* 137 */     return "mob.ghast.scream";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 145 */     return "mob.villager.default";
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/* 150 */     return false;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity096Docile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */