/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import bq;
/*     */ import lh;
/*     */ import ll;
/*     */ import lm;
/*     */ import lq;
/*     */ import md;
/*     */ import mf;
/*     */ import mz;
/*     */ import nc;
/*     */ import nh;
/*     */ import nk;
/*     */ import nv;
/*     */ import nw;
/*     */ import og;
/*     */ import oh;
/*     */ import qx;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity538
/*     */   extends SCPEntity {
/*     */   public SCPEntity538(yc par1World) {
/*  25 */     super(par1World);
/*  26 */     a(0.6F, 0.4F);
/*  27 */     this.aG = "/SCPCraft/textures/mobs/SCP538.png";
/*  28 */     this.bH = 0.8F;
/*  29 */     this.bn.a(0, (nc)new mz((md)this));
/*  30 */     this.bn.a(1, (nc)new nk((md)this, 0.25F, false));
/*  31 */     this.bn.a(2, (nc)new nw(this, 0.2F));
/*  32 */     this.bn.a(3, (nc)new nh((md)this, qx.class, 4.0F));
/*  33 */     this.bn.a(2, (nc)new nk((md)this, md.class, this.bH, true));
/*  34 */     this.bn.a(4, (nc)new nv((md)this));
/*  35 */     this.bo.a(1, (nc)new og((md)this, false));
/*  36 */     this.bo.a(2, (nc)new oh((md)this, qx.class, 16.0F, 0, true));
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  41 */     return 16;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean be() {
/*  46 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public float spiderScaleAmount() {
/*  51 */     return 0.4F;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m(lq par1Entity) {
/*  56 */     int dmg = 1;
/*  57 */     if (this.p.s == 1) {
/*  58 */       dmg = 2;
/*     */     }
/*  60 */     else if (this.p.s == 2) {
/*  61 */       dmg = 4;
/*     */     }
/*  63 */     else if (this.p.s == 3) {
/*  64 */       dmg = 6;
/*     */     } 
/*  66 */     par1Entity.a(lh.a((md)this), dmg);
/*     */     
/*  68 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void aO() {
/*  73 */     String s = aY();
/*     */     
/*  75 */     if (s != null)
/*     */     {
/*  77 */       this.p.a((lq)this, s, 0.5F, 2.0F);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/*  83 */     super.a();
/*  84 */     this.ag.a(16, new Byte((byte)0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  93 */     super.c();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void j_() {
/* 101 */     super.j_();
/*     */     
/* 103 */     if (!this.p.I)
/*     */     {
/* 105 */       func_40148_a(this.F);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double X() {
/* 114 */     return this.O * 0.75D - 0.5D;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean f_() {
/* 123 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected lq j() {
/* 132 */     double d = 16.0D;
/* 133 */     return (lq)this.p.b((lq)this, d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/* 141 */     return "mob.spider";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/* 149 */     return "mob.spider";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 157 */     return "mob.spiderdeath";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/* 165 */     super.b(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/* 173 */     super.a(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean g_() {
/* 181 */     return func_40149_l_();
/*     */   }
/*     */ 
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
/*     */   
/*     */   public mf bC() {
/* 196 */     return mf.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean e(lm par1PotionEffect) {
/* 201 */     if (par1PotionEffect.a() == ll.u.H)
/*     */     {
/* 203 */       return false;
/*     */     }
/* 205 */     if (par1PotionEffect.a() == mod_SCP.crystal.H)
/*     */     {
/* 207 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 211 */     return super.e(par1PotionEffect);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/* 217 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_40149_l_() {
/* 222 */     return ((this.ag.a(16) & 0x1) != 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_40148_a(boolean par1) {
/* 227 */     byte byte0 = this.ag.a(16);
/*     */     
/* 229 */     if (par1) {
/*     */       
/* 231 */       byte0 = (byte)(byte0 | 0x1);
/*     */     }
/*     */     else {
/*     */       
/* 235 */       byte0 = (byte)(byte0 & 0xFE);
/*     */     } 
/*     */     
/* 238 */     this.ag.b(16, Byte.valueOf(byte0));
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity538.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */