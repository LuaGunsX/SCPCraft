/*    */ package SCPCraft.tileentities;
/*    */ 
/*    */ import any;
/*    */ import bq;
/*    */ import yc;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SCPTileEntityAlarm
/*    */   extends any
/*    */ {
/* 12 */   public int alarmType = 0;
/*    */ 
/*    */   
/*    */   public void triggerNote(yc par1World, int par2, int par3, int par4) {
/* 16 */     if (this.alarmType == 0) { par1World.a(par2 + 0.5D, par3 + 0.5D, par4 + 0.5D, "sounds.AlarmClassic", 30.0F, 1.0F); }
/* 17 */     else if (this.alarmType == 1) { par1World.a(par2 + 0.5D, par3 + 0.5D, par4 + 0.5D, "sounds.AlarmSpeaker", 30.0F, 1.0F); }
/* 18 */     else if (this.alarmType == 2) { par1World.a(par2 + 0.5D, par3 + 0.5D, par4 + 0.5D, "sounds.AlarmRetro", 30.0F, 1.0F); }
/* 19 */     else if (this.alarmType == 3) { par1World.a(par2 + 0.5D, par3 + 0.5D, par4 + 0.5D, "sounds.AlarmScary", 30.0F, 1.0F); }
/*    */   
/*    */   }
/*    */   
/*    */   public boolean anyPlayerInRange() {
/* 24 */     return (this.k.a(this.l + 0.5D, this.m + 0.5D, this.n + 0.5D, 9.0D) != null);
/*    */   }
/*    */ 
/*    */   
/*    */   public void g() {
/* 29 */     super.g();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bq par1NBTTagCompound) {
/* 34 */     super.a(par1NBTTagCompound);
/* 35 */     this.alarmType = par1NBTTagCompound.d("Alarm");
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(bq par1NBTTagCompound) {
/* 40 */     super.b(par1NBTTagCompound);
/* 41 */     par1NBTTagCompound.a("Alarm", (short)this.alarmType);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/tileentities/SCPTileEntityAlarm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */