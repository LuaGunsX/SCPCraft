/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import bq;
/*     */ import ln;
/*     */ import md;
/*     */ import ml;
/*     */ import mz;
/*     */ import nc;
/*     */ import nh;
/*     */ import nk;
/*     */ import nv;
/*     */ import ox;
/*     */ import qx;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity846 extends ml {
/*     */   public SCPEntity846(yc par1World) {
/*  19 */     super(par1World);
/*  20 */     a(1.0F, 1.8F);
/*  21 */     this.aG = "/SCPCraft/textures/mobs/846.png";
/*  22 */     az().a(true);
/*  23 */     this.bH = 0.3F;
/*  24 */     this.bn.a(1, (nc)new mz((md)this));
/*  25 */     this.bn.a(3, (nc)new nk((md)this, this.bH, true));
/*     */     
/*  27 */     this.bn.a(7, (nc)new nh((md)this, qx.class, 8.0F));
/*  28 */     this.bn.a(7, (nc)new nv((md)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public SCPEnumCreatureAttribute getSCPAttribute() {
/*  33 */     return SCPEnumCreatureAttribute.SCP;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  38 */     super.c();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/*  43 */     super.a();
/*  44 */     this.ag.a(18, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void j_() {
/*  49 */     super.j_();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean be() {
/*  54 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/*  59 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void bm() {
/*  67 */     this.ag.b(18, Integer.valueOf(aU()));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(float f) {}
/*     */ 
/*     */   
/*     */   public int aT() {
/*  76 */     return 40;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(bq nbt) {
/*  81 */     super.b(nbt);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bq nbt) {
/*  86 */     super.a(nbt);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/*  91 */     ur var2 = par1EntityPlayer.bJ.g();
/*     */     
/*  93 */     return super.a(par1EntityPlayer);
/*     */   }
/*     */ 
/*     */   
/*     */   public ox spawnBabyAnimal(ox par1EntityAnimal) {
/*  98 */     return (ox)new SCPEntity846(this.p);
/*     */   }
/*     */ 
/*     */   
/*     */   public int func_48148_ad() {
/* 103 */     return this.ag.a(18);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/* 111 */     return "mob.irongolem.hit";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 119 */     return "mob.irongolem.hit";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ln a(ln var1) {
/* 125 */     return null;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity846.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */