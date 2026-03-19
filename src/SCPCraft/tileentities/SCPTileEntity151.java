/*    */ package SCPCraft.tileentities;
/*    */ 
/*    */ import any;
/*    */ import aoj;
/*    */ import bq;
/*    */ import lh;
/*    */ import qx;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SCPTileEntity151
/*    */   extends any
/*    */ {
/*    */   public boolean anyPlayerInRange() {
/* 17 */     return (this.k.a(this.l + 0.5D, this.m + 0.5D, this.n + 0.5D, 16.0D) != null);
/*    */   }
/*    */ 
/*    */   
/*    */   public void g() {
/* 22 */     qx entityplayer = this.k.a(this.l + 0.5D, this.m + 0.5D, this.n + 0.5D, 16.0D);
/* 23 */     if (!anyPlayerInRange()) {
/*    */       return;
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 29 */     if (entityplayer != null && !entityplayer.cd.d && shouldAttackPlayer(entityplayer))
/*    */     {
/* 31 */       entityplayer.a(lh.e, 2);
/*    */     }
/*    */     
/* 34 */     super.g();
/*    */   }
/*    */ 
/*    */   
/*    */   private boolean shouldAttackPlayer(qx par1EntityPlayer) {
/* 39 */     if (par1EntityPlayer != null) {
/*    */       
/* 41 */       aoj vec3d = par1EntityPlayer.i(1.0F).a();
/* 42 */       aoj vec3d1 = aoj.a(this.l - par1EntityPlayer.t, this.m + 1.0D - par1EntityPlayer.u + par1EntityPlayer.e(), this.n - par1EntityPlayer.v);
/* 43 */       double d = vec3d1.b();
/* 44 */       vec3d1 = vec3d1.a();
/* 45 */       double d1 = vec3d.b(vec3d1);
/*    */       
/* 47 */       if (d1 > 0.5D - 0.025D / d)
/*    */       {
/* 49 */         return canTileEntityBeSeen(this);
/*    */       }
/*    */ 
/*    */       
/* 53 */       return false;
/*    */     } 
/*    */     
/* 56 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canTileEntityBeSeen(any par1Entity) {
/* 61 */     qx entityplayer = this.k.a(this.l + 0.5D, this.m + 0.5D, this.n + 0.5D, 16.0D);
/* 62 */     return (this.k.a(this.k.S().a(entityplayer.t, entityplayer.u + entityplayer.e(), entityplayer.v), this.k.S().a(par1Entity.l, par1Entity.m + entityplayer.e(), par1Entity.n)) == null);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bq par1NBTTagCompound) {
/* 67 */     super.a(par1NBTTagCompound);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(bq par1NBTTagCompound) {
/* 72 */     super.b(par1NBTTagCompound);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/tileentities/SCPTileEntity151.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */