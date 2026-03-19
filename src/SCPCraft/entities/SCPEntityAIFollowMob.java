/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import lq;
/*     */ import md;
/*     */ import nc;
/*     */ 
/*     */ public class SCPEntityAIFollowMob
/*     */   extends nc
/*     */ {
/*     */   private md theEntity;
/*     */   private md theMob;
/*     */   private md choosenMob;
/*     */   private int field_48402_c;
/*     */   private boolean field_48400_d;
/*     */   
/*     */   public SCPEntityAIFollowMob(md entityliving, md entitymob) {
/*  19 */     this.field_48400_d = false;
/*  20 */     this.theEntity = entityliving;
/*  21 */     this.choosenMob = entitymob;
/*  22 */     a(3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  30 */     if (!this.theEntity.p.u())
/*     */     {
/*  32 */       return false;
/*     */     }
/*     */     
/*  35 */     List list = this.theEntity.p.a(md.class, this.theEntity.D.b(6.0D, 2.0D, 6.0D));
/*     */     
/*  37 */     if (list.size() == 0)
/*     */     {
/*  39 */       return false;
/*     */     }
/*     */     
/*  42 */     Iterator iterator = list.iterator();
/*     */ 
/*     */ 
/*     */     
/*  46 */     if (iterator.hasNext())
/*     */     {
/*     */ 
/*     */ 
/*     */       
/*  51 */       this.theMob = this.choosenMob;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  56 */     return (this.theMob != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  64 */     return (this.theMob.aU() > 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  72 */     this.field_48402_c = this.theEntity.aB().nextInt(320);
/*  73 */     this.field_48400_d = false;
/*  74 */     this.theMob.az().g();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void d() {
/*  82 */     this.theMob = null;
/*  83 */     this.theEntity.az().g();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void e() {
/*  91 */     this.theEntity.aw().a((lq)this.theMob, 30.0F, 30.0F);
/*     */     
/*  93 */     if (this.theMob.aU() == this.field_48402_c) {
/*     */       
/*  95 */       this.theEntity.az().a(this.theMob, 0.15F);
/*  96 */       this.field_48400_d = true;
/*     */     } 
/*     */     
/*  99 */     if (this.field_48400_d && this.theEntity.e((lq)this.theMob) < 4.0D)
/*     */     {
/* 101 */       this.theEntity.az().g();
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntityAIFollowMob.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */