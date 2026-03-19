/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import bq;
/*     */ import lh;
/*     */ import lq;
/*     */ import qx;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity872
/*     */   extends SCPEntity
/*     */ {
/*     */   public SCPEntity872(yc par1World) {
/*  13 */     super(par1World);
/*  14 */     a(0.3F, 0.7F);
/*  15 */     this.aG = "/SCPCraft/textures/mobs/872.png";
/*  16 */     this.bH = 0.0F;
/*  17 */     this.attackStrength = 0;
/*  18 */     this.af = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  23 */     return 9001;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void targetLivings() {}
/*     */ 
/*     */   
/*     */   public SCPEnumCreatureAttribute getSCPAttribute() {
/*  32 */     return SCPEnumCreatureAttribute.SCPObject;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean be() {
/*  37 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected lq j() {
/*  42 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void c_(qx par1EntityPlayer) {}
/*     */ 
/*     */   
/*     */   public boolean a(lh par1DamageSource, int par2) {
/*  51 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m(lq par1Entity) {
/*  56 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void aO() {}
/*     */ 
/*     */   
/*     */   protected void a() {
/*  65 */     super.a();
/*  66 */     this.ag.a(16, new Byte((byte)0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  75 */     this.w = 0.0D;
/*  76 */     this.y = 0.0D;
/*  77 */     this.A = 0.0F;
/*  78 */     this.z = 0.0F;
/*  79 */     super.c();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void j_() {
/*  87 */     super.j_();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean f_() {
/*  96 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/* 104 */     super.b(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/* 112 */     super.a(par1NBTTagCompound);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/* 117 */     return false;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity872.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */