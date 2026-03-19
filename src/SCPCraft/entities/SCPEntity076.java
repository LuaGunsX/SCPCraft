/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import ModLoader;
/*     */ import SCPCraft.mod_SCP;
/*     */ import ays;
/*     */ import java.util.Random;
/*     */ import jl;
/*     */ import ke;
/*     */ import lh;
/*     */ import lq;
/*     */ import md;
/*     */ import mt;
/*     */ import mz;
/*     */ import nc;
/*     */ import nh;
/*     */ import nk;
/*     */ import nm;
/*     */ import nn;
/*     */ import nv;
/*     */ import nw;
/*     */ import og;
/*     */ import oh;
/*     */ import qx;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity076 extends SCPEntity {
/*     */   public int Swordtick;
/*     */   public static boolean Death;
/*     */   public static boolean CainWin;
/*  31 */   Random aa = new Random();
/*     */ 
/*     */   
/*     */   public SCPEntity076(yc par1World) {
/*  35 */     super(par1World);
/*  36 */     this.aG = "/SCPCraft/textures/mobs/076.png";
/*  37 */     this.bH = 0.35F;
/*  38 */     this; CainWin = false;
/*  39 */     this.aR = 150;
/*  40 */     this.Swordtick = this.aa.nextInt(200);
/*  41 */     this.attackStrength = 6;
/*  42 */     this; Death = false;
/*  43 */     this.af = true;
/*  44 */     az().b(true);
/*  45 */     this.bn.a(0, (nc)new mz((md)this));
/*  46 */     this.bn.a(1, (nc)new mt((md)this));
/*  47 */     this.bn.a(2, (nc)new nk((md)this, SCPEntity073.class, this.bH, true));
/*  48 */     this.bn.a(2, (nc)new nk((md)this, qx.class, this.bH, true));
/*  49 */     this.bn.a(2, (nc)new nk((md)this, md.class, this.bH, true));
/*  50 */     this.bn.a(3, (nc)new nn(this, this.bH));
/*  51 */     this.bn.a(4, (nc)new nm(this, this.bH, false));
/*  52 */     this.bn.a(5, (nc)new nw(this, 0.3F));
/*  53 */     this.bn.a(6, (nc)new nh((md)this, qx.class, 8.0F));
/*  54 */     this.bn.a(6, (nc)new nv((md)this));
/*  55 */     this.bo.a(1, (nc)new og((md)this, false));
/*  56 */     this.bo.a(2, (nc)new oh((md)this, SCPEntity073.class, 16.0F, 0, false));
/*  57 */     this.bo.a(3, (nc)new oh((md)this, qx.class, 16.0F, 0, false));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(lh par1DamageSource, int par2) {
/*  62 */     ays ays = (ModLoader.getMinecraftInstance()).g;
/*     */     
/*  64 */     if (par1DamageSource.g() instanceof SCPEntity073) {
/*     */       
/*  66 */       this.aR--;
/*  67 */       if (this.aR <= 1 && par1DamageSource.g() instanceof SCPEntity073) {
/*     */         
/*  69 */         this; CainWin = true;
/*  70 */         ays.a((jl)mod_SCP.CainWin, 1);
/*  71 */         return super.a(par1DamageSource, par2);
/*     */       } 
/*  73 */       return super.a(par1DamageSource, par2);
/*     */     } 
/*  75 */     return super.a(par1DamageSource, par2);
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  80 */     return this.aR;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean be() {
/*  88 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  97 */     super.c();
/*     */     
/*  99 */     if (this.Swordtick > 0)
/*     */     {
/* 101 */       this.Swordtick--;
/*     */     }
/* 103 */     if (this.Swordtick == 0)
/*     */     {
/* 105 */       this.Swordtick = this.aa.nextInt(200);
/*     */     }
/*     */     
/* 108 */     if (this.Swordtick < 25)
/*     */     {
/* 110 */       b(0, new ur(mod_SCP.SCP143Sword, 1));
/*     */     }
/*     */   }
/*     */   
/*     */   public void j_() {
/* 115 */     qx ep = this.p.b((lq)this, 16.0D);
/* 116 */     super.j_();
/* 117 */     if (this.L) {
/*     */       
/* 119 */       this; Death = true;
/*     */     } 
/* 121 */     if (this.L) { this; if (CainWin)
/*     */       {
/* 123 */         ep.a((jl)mod_SCP.CainWin, 1);
/*     */       } }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/* 131 */     return "mob.blaze.breath";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 139 */     return "sounds.StoneDoorSlam";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int bb() {
/* 146 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/* 151 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public ur bD() {
/* 156 */     if (this.Swordtick <= 80)
/*     */     {
/* 158 */       return defaultHeldItem;
/*     */     }
/*     */ 
/*     */     
/* 162 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 168 */   private static final ur defaultHeldItem = new ur(mod_SCP.SCP143Sword, 1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(lq par1Entity, float par2) {
/* 178 */     if (par2 > 2.0F && par2 < 6.0F && this.aa.nextInt(10) == 0) {
/*     */       
/* 180 */       if (this.E)
/*     */       {
/* 182 */         double d = par1Entity.t - this.t;
/* 183 */         double d1 = par1Entity.v - this.v;
/* 184 */         float f1 = ke.a(d * d + d1 * d1);
/* 185 */         this.w = d / f1 * 0.5D * 0.800000011920929D + this.w * 0.20000000298023224D;
/* 186 */         this.y = d1 / f1 * 0.5D * 0.800000011920929D + this.y * 0.20000000298023224D;
/* 187 */         this.x = 0.4000000059604645D;
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/* 192 */       super.a(par1Entity, par2);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity076.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */