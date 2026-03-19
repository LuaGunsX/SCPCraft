/*    */ package SCPCraft.tileentities;
/*    */ 
/*    */ import any;
/*    */ import bq;
/*    */ import ce;
/*    */ import ef;
/*    */ import fg;
/*    */ import ur;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SCPTileEntityShelf
/*    */   extends any
/*    */ {
/*    */   public ur item;
/*    */   public float rot;
/*    */   
/*    */   public ur getItem() {
/* 19 */     return this.item;
/*    */   }
/*    */ 
/*    */   
/*    */   public ur setItem(ur it) {
/* 24 */     return this.item = it;
/*    */   }
/*    */ 
/*    */   
/*    */   public float setRotation(float rotation) {
/* 29 */     return this.rot = rotation;
/*    */   }
/*    */ 
/*    */   
/*    */   public float getRotation() {
/* 34 */     return this.rot;
/*    */   }
/*    */ 
/*    */   
/*    */   public void onDataPacket(ce net, fg pkt) {
/* 39 */     a(pkt.e);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ef l() {
/* 45 */     bq var1 = new bq();
/* 46 */     b(var1);
/* 47 */     return (ef)new fg(this.l, this.m, this.n, 0, var1);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(bq par1NBTTagCompound) {
/* 53 */     super.a(par1NBTTagCompound);
/* 54 */     if (par1NBTTagCompound.b("item")) this.item = ur.a(par1NBTTagCompound.l("item"));
/*    */   
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(bq par1NBTTagCompound) {
/* 60 */     super.b(par1NBTTagCompound);
/* 61 */     bq compound = new bq();
/* 62 */     par1NBTTagCompound.a("item", compound);
/* 63 */     if (this.item != null) this.item.b(compound); 
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/tileentities/SCPTileEntityShelf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */