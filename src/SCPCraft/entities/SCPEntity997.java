/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import bq;
/*     */ import lh;
/*     */ import lq;
/*     */ import qx;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity997
/*     */   extends SCPEntity
/*     */ {
/*     */   public SCPEntity997(yc par1World) {
/*  13 */     super(par1World);
/*  14 */     a(0.3F, 0.7F);
/*  15 */     this.aG = "/SCPCraft/textures/mobs/997.png";
/*  16 */     this.bH = 0.0F;
/*  17 */     this.attackStrength = 0;
/*  18 */     az().a(true);
/*  19 */     this.af = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  24 */     return 9001;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void targetLivings() {}
/*     */ 
/*     */   
/*     */   public SCPEnumCreatureAttribute getSCPAttribute() {
/*  33 */     return SCPEnumCreatureAttribute.SCPObject;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean be() {
/*  38 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected lq j() {
/*  43 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void c_(qx par1EntityPlayer) {}
/*     */ 
/*     */   
/*     */   public boolean a(lh par1DamageSource, int par2) {
/*  52 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m(lq par1Entity) {
/*  57 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void aO() {}
/*     */ 
/*     */   
/*     */   protected void a() {
/*  66 */     super.a();
/*  67 */     this.ag.a(16, new Byte((byte)0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  76 */     this.w = 0.0D;
/*  77 */     this.y = 0.0D;
/*  78 */     super.c();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void j_() {
/*  86 */     this.A = 0.0F;
/*  87 */     this.z = 0.0F;
/*  88 */     super.j_();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean f_() {
/*  97 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/* 105 */     super.b(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/* 113 */     super.a(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/* 118 */     return false;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity997.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */