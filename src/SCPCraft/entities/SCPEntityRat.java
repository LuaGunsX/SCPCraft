/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import ModLoader;
/*     */ import SCPCraft.mod_SCP;
/*     */ import bq;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import ke;
/*     */ import lh;
/*     */ import ll;
/*     */ import lm;
/*     */ import lq;
/*     */ import ly;
/*     */ import md;
/*     */ import mz;
/*     */ import nc;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import nw;
/*     */ import og;
/*     */ import oh;
/*     */ import qx;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntityRat
/*     */   extends SCPEntity {
/*  26 */   private int angerLevel = 0;
/*  27 */   Minecraft minecraft = ModLoader.getMinecraftInstance();
/*  28 */   private static final ly field_82219_bJ = new SCPFilterRatAttack();
/*     */   private lq closestLivingEntity;
/*     */   
/*     */   public SCPEntityRat(yc par1World) {
/*  32 */     super(par1World);
/*  33 */     this.aG = "/SCPCraft/textures/mobs/Rat.png";
/*  34 */     this.bH = 0.35F;
/*  35 */     this.attackStrength = 2;
/*  36 */     this.l = 10.0D;
/*  37 */     a(0.1F, 0.1F);
/*  38 */     this.bn.a(0, (nc)new mz((md)this));
/*  39 */     this.bn.a(1, new SCPEntityAggressiveAI((md)this, SCPEntityClassD027.class, this.bH, true));
/*  40 */     this.bn.a(2, (nc)new nw(this, this.bH));
/*  41 */     this.bo.a(1, (nc)new og((md)this, false));
/*  42 */     this.bo.a(2, (nc)new oh((md)this, SCPEntityClassD027.class, 16.0F, 0, false));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m(lq par1Entity) {
/*  47 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  52 */     return 10;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c_(qx par1EntityPlayer) {
/*  57 */     if (!par1EntityPlayer.isVermin) par1EntityPlayer.a(lh.a((md)this), this.attackStrength);
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   public void targetLivings() {
/*  63 */     List var5 = this.p.a(md.class, this.D.b(16.0D, 4.0D, 16.0D), field_82219_bJ);
/*  64 */     Iterator<lq> var2 = var5.iterator();
/*     */     
/*  66 */     while (var2.hasNext()) {
/*     */       
/*  68 */       lq var3 = var2.next();
/*  69 */       md var4 = (md)var3;
/*     */       
/*  71 */       if (var4 != null && var4.a(mod_SCP.verminGod))
/*     */       {
/*  73 */         this.a_ = (lq)var4;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean be() {
/*  83 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/*  88 */     super.b(par1NBTTagCompound);
/*  89 */     par1NBTTagCompound.a("isVermin", this.isVermin);
/*  90 */     par1NBTTagCompound.a("Anger", (short)this.angerLevel);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/*  98 */     super.a(par1NBTTagCompound);
/*  99 */     this.isVermin = par1NBTTagCompound.n("isVermin");
/* 100 */     this.angerLevel = par1NBTTagCompound.d("Anger");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected lq j() {
/* 109 */     qx ep = this.p.b((lq)this, 16.0D);
/* 110 */     if (ep != null)
/*     */     {
/* 112 */       if (ep.b(mod_SCP.verminGod) != null) {
/*     */         
/* 114 */         this.angerLevel = 0;
/* 115 */         this.isVermin = true;
/* 116 */         return super.j();
/*     */       } 
/*     */     }
/*     */     
/* 120 */     return (this.angerLevel == 0) ? null : super.j();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/* 130 */     super.c();
/* 131 */     List<lq> var1 = this.p.a(SCPEntity997.class, this.D.b(16.0D, 5.0D, 16.0D));
/* 132 */     if (var1.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/* 136 */     this.closestLivingEntity = var1.get(0);
/* 137 */     if (this.closestLivingEntity != null) d(new lm(ll.p.H, 20, 1)); 
/* 138 */     this.bF = false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(lq par1Entity, float par2) {
/* 143 */     if (par2 > 2.0F && par2 < 6.0F && this.aa.nextInt(10) == 0) {
/*     */       
/* 145 */       if (this.E)
/*     */       {
/* 147 */         double d = par1Entity.t - this.t;
/* 148 */         double d1 = par1Entity.v - this.v;
/* 149 */         float f1 = ke.a(d * d + d1 * d1);
/* 150 */         this.w = d / f1 * 0.5D * 0.800000011920929D + this.w * 0.20000000298023224D;
/* 151 */         this.y = d1 / f1 * 0.5D * 0.800000011920929D + this.y * 0.20000000298023224D;
/* 152 */         this.x = 0.4000000059604645D;
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/* 157 */       super.a(par1Entity, par2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/* 166 */     return "mob.silverfish.say";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/* 174 */     return "mob.silverfish.hit";
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean f_() {
/* 179 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 187 */     return "mob.silverfish.kill";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(lh par1DamageSource, int par2) {
/* 192 */     lq var3 = par1DamageSource.g();
/*     */     
/* 194 */     if (var3 instanceof qx) {
/*     */       
/* 196 */       List var4 = this.p.b((lq)this, this.D.b(32.0D, 32.0D, 32.0D));
/* 197 */       Iterator<lq> var5 = var4.iterator();
/*     */       
/* 199 */       while (var5.hasNext()) {
/*     */         
/* 201 */         lq var6 = var5.next();
/*     */         
/* 203 */         if (var6 instanceof SCPEntityRat) {
/*     */           
/* 205 */           SCPEntityRat var7 = (SCPEntityRat)var6;
/* 206 */           var7.becomeAngryAt(var3);
/*     */         } 
/*     */       } 
/*     */       
/* 210 */       becomeAngryAt(var3);
/*     */     } 
/*     */     
/* 213 */     return super.a(par1DamageSource, par2);
/*     */   }
/*     */ 
/*     */   
/*     */   private void becomeAngryAt(lq par1Entity) {
/* 218 */     this.a_ = par1Entity;
/* 219 */     this.angerLevel = 400 + this.aa.nextInt(400);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntityRat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */