/*    */ package SCPCraft.entities;
/*    */ 
/*    */ import java.util.List;
/*    */ import lm;
/*    */ import lq;
/*    */ import mi;
/*    */ import nc;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SCPEntity872AI
/*    */   extends nc
/*    */ {
/*    */   private mi theEntity;
/*    */   private lq closestLivingEntity;
/*    */   private float distanceFromEntity;
/*    */   private double distance;
/*    */   private int potionID;
/*    */   private int potionDuration;
/*    */   private int potionAmplifier;
/*    */   private Class targetEntityClass;
/*    */   
/*    */   public SCPEntity872AI(mi par1EntityCreature, Class par2Class, float par3, double dist, int id, int duration, int amplifier) {
/* 26 */     this.theEntity = par1EntityCreature;
/* 27 */     this.targetEntityClass = par2Class;
/* 28 */     this.distanceFromEntity = par3;
/* 29 */     this.distance = dist;
/* 30 */     this.potionID = id;
/* 31 */     this.potionDuration = duration;
/* 32 */     this.potionAmplifier = amplifier;
/* 33 */     a(1);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 41 */     if (this.distanceFromEntity < 16.0D)
/*    */     {
/* 43 */       return false;
/*    */     }
/*    */ 
/*    */     
/* 47 */     List<lq> var1 = this.theEntity.p.a(this.targetEntityClass, this.theEntity.D.b(this.distanceFromEntity, 5.0D, this.distanceFromEntity));
/*    */     
/* 49 */     if (var1.isEmpty())
/*    */     {
/* 51 */       return false;
/*    */     }
/*    */     
/* 54 */     this.closestLivingEntity = var1.get(0);
/*    */     
/* 56 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void c() {}
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void d() {
/* 68 */     this.closestLivingEntity = null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void e() {
/* 76 */     if (this.theEntity.e(this.closestLivingEntity) < this.distance)
/*    */     {
/* 78 */       this.theEntity.d(new lm(this.potionID, this.potionDuration, this.potionAmplifier));
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity872AI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */