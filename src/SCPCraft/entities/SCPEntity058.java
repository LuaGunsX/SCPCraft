/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import SCPCraft.renders.SCPRender058;
/*     */ import ke;
/*     */ import ll;
/*     */ import lm;
/*     */ import lq;
/*     */ import md;
/*     */ import qx;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity058
/*     */   extends SCPEntity
/*     */ {
/*     */   private boolean hasSaid;
/*     */   private boolean isSaying;
/*     */   private boolean Said;
/*     */   public boolean isAttacking;
/*     */   public static int beat;
/*     */   public SCPRender058 render;
/*     */   
/*     */   public SCPEntity058(yc par1World) {
/*  23 */     super(par1World);
/*  24 */     this.aG = "/SCPCraft/textures/mobs/058.png";
/*  25 */     a(0.8F, 0.9F);
/*  26 */     this.bH = 1.0F;
/*  27 */     this; beat = 25;
/*  28 */     this.hasSaid = false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/*  33 */     super.a();
/*  34 */     this.ag.a(16, new Byte((byte)0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  41 */     this; if (beat > 0) {
/*     */       
/*  43 */       this; beat--;
/*     */       
/*  45 */       this; if (beat <= 10) { this; if (beat > 9)
/*     */         {
/*  47 */           this.p.a((lq)this, "sounds.heartbeat", 1.0F, 1.0F);
/*     */         } }
/*     */     
/*     */     } 
/*  51 */     this; if (beat <= 0) {
/*     */       
/*  53 */       this; beat = 55;
/*     */     } 
/*     */     
/*  56 */     int i = ke.c(this.t);
/*  57 */     int k = ke.c(this.u);
/*  58 */     int i1 = ke.c(this.v);
/*  59 */     this.isAttacking = (this.a_ != null);
/*     */     
/*  61 */     if (!this.p.I);
/*     */ 
/*     */ 
/*     */     
/*  65 */     qx entityplayer = this.p.b((lq)this, 16.0D);
/*     */     
/*  67 */     if (entityplayer != null && entityplayer.L == true && !this.Said) {
/*     */       
/*  69 */       if (!this.p.I)
/*     */       {
/*  71 */         this.hasSaid = true;
/*     */       }
/*  73 */       if (this.hasSaid == true && !this.isSaying && !this.Said) {
/*     */         
/*  75 */         this.p.b((lq)this, 16.0D).b("§lSCP-058: §rThe sensual violence of lust is all the assurance you will ever need to know the worth of life.");
/*  76 */         this.hasSaid = false;
/*  77 */         this.isSaying = true;
/*  78 */         this.Said = true;
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  84 */     super.c();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(md par1EntityLiving) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void j_() {
/*  94 */     super.j_();
/*     */     
/*  96 */     if (!this.p.I)
/*     */     {
/*  98 */       setBesideClimbableBlock(this.F);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/* 104 */     return 100;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double X() {
/* 112 */     return this.O * 0.75D - 0.5D;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean f_() {
/* 121 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected lq j() {
/* 130 */     float var1 = c(1.0F);
/*     */     
/* 132 */     if (var1 < 0.5F) {
/*     */       
/* 134 */       double d = 16.0D;
/* 135 */       return (lq)this.p.b((lq)this, d);
/*     */     } 
/*     */ 
/*     */     
/* 139 */     double var2 = 16.0D;
/* 140 */     return (lq)this.p.b((lq)this, var2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/* 149 */     return "mob.spider";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/* 157 */     return "mob.spider";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 165 */     return "mob.spiderdeath";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(lq par1Entity, float par2) {
/* 173 */     float var3 = c(1.0F);
/*     */     
/* 175 */     if (var3 > 0.5F && this.aa.nextInt(100) == 0) {
/*     */       
/* 177 */       this.a_ = null;
/*     */ 
/*     */     
/*     */     }
/* 181 */     else if (par2 > 2.0F && par2 < 6.0F && this.aa.nextInt(10) == 0) {
/*     */       
/* 183 */       if (this.E)
/*     */       {
/* 185 */         double var4 = par1Entity.t - this.t;
/* 186 */         double var6 = par1Entity.v - this.v;
/* 187 */         float var8 = ke.a(var4 * var4 + var6 * var6);
/* 188 */         this.w = var4 / var8 * 0.5D * 0.800000011920929D + this.w * 0.20000000298023224D;
/* 189 */         this.y = var6 / var8 * 0.5D * 0.800000011920929D + this.y * 0.20000000298023224D;
/* 190 */         this.x = 0.4000000059604645D;
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/* 195 */       super.a(par1Entity, par2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean g_() {
/* 205 */     return isBesideClimbableBlock();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void am() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float spiderScaleAmount() {
/* 218 */     return 0.9F;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean e(lm par1PotionEffect) {
/* 223 */     return (par1PotionEffect.a() == ll.u.H) ? false : super.e(par1PotionEffect);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isBesideClimbableBlock() {
/* 232 */     return ((this.ag.a(16) & 0x1) != 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBesideClimbableBlock(boolean par1) {
/* 241 */     byte var2 = this.ag.a(16);
/*     */     
/* 243 */     if (par1) {
/*     */       
/* 245 */       var2 = (byte)(var2 | 0x1);
/*     */     }
/*     */     else {
/*     */       
/* 249 */       var2 = (byte)(var2 & 0xFFFFFFFE);
/*     */     } 
/*     */     
/* 252 */     this.ag.b(16, Byte.valueOf(var2));
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity058.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */