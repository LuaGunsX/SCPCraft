/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import lh;
/*     */ import lq;
/*     */ import md;
/*     */ import mf;
/*     */ import mt;
/*     */ import mv;
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
/*     */ import qu;
/*     */ import qx;
/*     */ import up;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity217Zombie
/*     */   extends SCPEntity {
/*     */   private final mv field_82184_d;
/*     */   
/*     */   public SCPEntity217Zombie(yc par1World) {
/*  31 */     super(par1World);
/*  32 */     this.aG = "/SCPCraft/textures/mobs/SCP217/SCPZombie.png";
/*  33 */     this.bH = 0.25F;
/*  34 */     this.attackStrength = 3;
/*  35 */     az().b(true);
/*  36 */     this.bn.a(0, (nc)new mz((md)this));
/*  37 */     this.bn.a(1, (nc)new mt((md)this));
/*  38 */     this.bn.a(2, (nc)(this.field_82184_d = new mv((md)this, 0.7F)));
/*  39 */     this.bn.a(3, (nc)new nk((md)this, SCPEntity217Testificate.class, this.bH, true));
/*  40 */     this.bn.a(3, (nc)new nk((md)this, qu.class, this.bH, true));
/*  41 */     this.bn.a(4, (nc)new nn(this, this.bH));
/*  42 */     this.bn.a(5, (nc)new nm(this, this.bH, false));
/*  43 */     this.bn.a(6, (nc)new nw(this, this.bH));
/*  44 */     this.bn.a(7, (nc)new nh((md)this, qx.class, 8.0F));
/*  45 */     this.bn.a(7, (nc)new nv((md)this));
/*  46 */     this.bo.a(1, (nc)new og((md)this, false));
/*  47 */     this.bo.a(1, (nc)new oh((md)this, SCPEntity217Testificate.class, 16.0F, 0, false));
/*  48 */     this.bo.a(1, (nc)new oh((md)this, qu.class, 16.0F, 0, false));
/*     */   }
/*     */ 
/*     */   
/*     */   public SCPEnumCreatureAttribute getSCPAttribute() {
/*  53 */     return SCPEnumCreatureAttribute.SCP;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bI() {
/*  58 */     ur var1 = ((qx)this.n).bD();
/*  59 */     return (var1 == null || var1 != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public mv func_82183_n() {
/*  64 */     return this.field_82184_d;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void bl() {
/*  69 */     super.bl();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md par1EntityLiving) {
/*  74 */     super.a(par1EntityLiving);
/*     */     
/*  76 */     if (this.p.s >= 1) {
/*     */       
/*  78 */       if (par1EntityLiving instanceof SCPEntity217Testificate && this.aa.nextBoolean()) {
/*     */         
/*  80 */         SCPEntity217Zombie var2 = new SCPEntity217Zombie(this.p);
/*  81 */         var2.k((lq)par1EntityLiving);
/*  82 */         this.p.e((lq)par1EntityLiving);
/*  83 */         var2.bG();
/*  84 */         this.p.d((lq)var2);
/*  85 */         this.p.a((qx)null, 1016, (int)this.t, (int)this.u, (int)this.v, 0);
/*     */       } 
/*  87 */       if (par1EntityLiving instanceof qu && this.aa.nextBoolean()) {
/*     */         
/*  89 */         SCPEntity217Zombie var2 = new SCPEntity217Zombie(this.p);
/*  90 */         var2.k((lq)par1EntityLiving);
/*  91 */         this.p.e((lq)par1EntityLiving);
/*  92 */         var2.bG();
/*     */         
/*  94 */         this.p.d((lq)var2);
/*  95 */         this.p.a((qx)null, 1016, (int)this.t, (int)this.u, (int)this.v, 0);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/* 102 */     return 40;
/*     */   }
/*     */ 
/*     */   
/*     */   protected lq j() {
/* 107 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void c_(qx par1EntityPlayer) {}
/*     */ 
/*     */   
/*     */   public boolean m(lq par1Entity) {
/* 116 */     int var2 = this.attackStrength;
/* 117 */     if (!(par1Entity instanceof qx)) return par1Entity.a(lh.a((md)this), var2); 
/* 118 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int aW() {
/* 126 */     return 3;
/*     */   }
/*     */ 
/*     */   
/*     */   public double X() {
/* 131 */     return this.O * 1.3199999999999998D - 0.5D;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean be() {
/* 139 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/* 144 */     if (super.a(par1EntityPlayer))
/*     */     {
/* 146 */       return true;
/*     */     }
/* 148 */     if (!this.p.I && (this.n == null || this.n == par1EntityPlayer)) {
/*     */       
/* 150 */       par1EntityPlayer.a((lq)this);
/* 151 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 155 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/* 164 */     return "mob.zombie";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/* 172 */     return "mob.zombiehurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 180 */     return "mob.zombiedeath";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int bb() {
/* 188 */     return up.o.cj;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public mf bC() {
/* 196 */     return mf.b;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void l(int par1) {
/* 201 */     switch (this.aa.nextInt(2)) {
/*     */       
/*     */       case 0:
/* 204 */         b(mod_SCP.Wrench.cj, 1);
/*     */         break;
/*     */       
/*     */       case 1:
/* 208 */         b(up.o.cj, 1);
/*     */         break;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity217Zombie.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */