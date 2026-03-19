/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import java.util.Random;
/*     */ import ke;
/*     */ import lq;
/*     */ import md;
/*     */ import mz;
/*     */ import nc;
/*     */ import ng;
/*     */ import nh;
/*     */ import nk;
/*     */ import nw;
/*     */ import oh;
/*     */ import qx;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity50AEJ
/*     */   extends SCPEntity
/*     */ {
/*     */   public SCPEntity50AEJ(yc par1World) {
/*  21 */     super(par1World);
/*  22 */     this.aG = "/SCPCraft/textures/mobs/50AEJ.png";
/*  23 */     this.bH = 0.4F;
/*  24 */     this.attackStrength = 9002;
/*  25 */     this.bn.a(0, (nc)new mz((md)this));
/*  26 */     this.bn.a(1, (nc)new nk((md)this, SCPEntity1440.class, this.bH, false));
/*  27 */     this.bn.a(2, (nc)new nk((md)this, md.class, this.bH, true));
/*  28 */     this.bn.a(2, (nc)new nw(this, this.bH));
/*  29 */     this.bn.a(3, (nc)new nh((md)this, SCPEntity1440.class, 8.0F));
/*  30 */     this.bn.a(4, (nc)new ng((md)this, 0.4F));
/*  31 */     this.bo.a(2, (nc)new oh((md)this, SCPEntity1440.class, 16.0F, 0, true));
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  36 */     return 9001;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean be() {
/*  44 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  53 */     super.c();
/*     */     
/*  55 */     Random rand = new Random();
/*  56 */     int Delay = rand.nextInt(250);
/*     */     
/*  58 */     if (Delay <= 2)
/*     */     {
/*  60 */       x();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md par1EntityLiving) {
/*  66 */     qx ep = this.p.b((lq)this, 16.0D);
/*  67 */     if (ep != null) {
/*     */       
/*  69 */       int Chat = this.aa.nextInt(4);
/*  70 */       if (Chat == 0)
/*     */       {
/*  72 */         ep.b("§lSCP-50-AE-1: §rDIE YOU RUSSIAN");
/*     */       }
/*  74 */       if (Chat == 1)
/*     */       {
/*  76 */         ep.b("§lSCP-50-AE-1: §rPINKO PHUCKS");
/*     */       }
/*  78 */       if (Chat == 2)
/*     */       {
/*  80 */         ep.b("§lSCP-50-AE-1: §rUP YOUR LEBENSRAUM YOU UBERMENSCH F*CK");
/*     */       }
/*  82 */       if (Chat == 3)
/*     */       {
/*  84 */         ep.b("§lSCP-50-AE-1: §rCAN YOU HEAR ME NOW HUGO CHAVEZ");
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public float R() {
/*  91 */     return 0.0F;
/*     */   }
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
/*     */   protected void a(lq par1Entity, float par2) {
/* 150 */     if (par2 > 2.0F && par2 < 6.0F && this.aa.nextInt(10) == 0) {
/*     */       
/* 152 */       if (this.E)
/*     */       {
/* 154 */         double d = par1Entity.t - this.t;
/* 155 */         double d1 = par1Entity.v - this.v;
/* 156 */         float f1 = ke.a(d * d + d1 * d1);
/* 157 */         this.w = d / f1 * 0.5D * 0.800000011920929D + this.w * 0.20000000298023224D;
/* 158 */         this.y = d1 / f1 * 0.5D * 0.800000011920929D + this.y * 0.20000000298023224D;
/* 159 */         this.x = 0.4000000059604645D;
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/* 164 */       super.a(par1Entity, par2);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity50AEJ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */