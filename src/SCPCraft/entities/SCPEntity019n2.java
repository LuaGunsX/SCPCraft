/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import ke;
/*     */ import lq;
/*     */ import md;
/*     */ import mz;
/*     */ import nc;
/*     */ import ng;
/*     */ import nh;
/*     */ import nk;
/*     */ import nv;
/*     */ import nw;
/*     */ import og;
/*     */ import oh;
/*     */ import qx;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity019n2 extends SCPEntity {
/*     */   public SCPEntity019n2(yc par1World) {
/*  20 */     super(par1World);
/*  21 */     this.aG = "/SCPCraft/textures/mobs/019-2.png";
/*  22 */     this.bH = 0.3F;
/*  23 */     this.attackStrength = 4;
/*  24 */     a(0.2F, 0.2F);
/*  25 */     this.bn.a(0, (nc)new mz((md)this));
/*  26 */     this.bn.a(1, (nc)new nk((md)this, qx.class, this.bH, false));
/*  27 */     this.bn.a(2, (nc)new nk((md)this, md.class, this.bH, true));
/*  28 */     this.bn.a(2, (nc)new nw(this, this.bH));
/*  29 */     this.bn.a(3, (nc)new nh((md)this, qx.class, 8.0F));
/*  30 */     this.bn.a(4, (nc)new nv((md)this));
/*  31 */     this.bn.a(5, (nc)new ng((md)this, 0.4F));
/*  32 */     this.bo.a(1, (nc)new og((md)this, false));
/*  33 */     this.bo.a(2, (nc)new oh((md)this, qx.class, 16.0F, 0, true));
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  38 */     return 20;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean be() {
/*  46 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  55 */     super.c();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(lq par1Entity, float par2) {
/*  61 */     if (par2 > 2.0F && par2 < 6.0F && this.aa.nextInt(10) == 0) {
/*     */       
/*  63 */       if (this.E)
/*     */       {
/*  65 */         double d = par1Entity.t - this.t;
/*  66 */         double d1 = par1Entity.v - this.v;
/*  67 */         float f1 = ke.a(d * d + d1 * d1);
/*  68 */         this.w = d / f1 * 0.5D * 0.800000011920929D + this.w * 0.20000000298023224D;
/*  69 */         this.y = d1 / f1 * 0.5D * 0.800000011920929D + this.y * 0.20000000298023224D;
/*  70 */         this.x = 0.4000000059604645D;
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/*  75 */       super.a(par1Entity, par2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/*  84 */     return "mob.silverfish.say";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/*  92 */     return "mob.silverfish.hit";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 100 */     return "mob.silverfish.kill";
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity019n2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */