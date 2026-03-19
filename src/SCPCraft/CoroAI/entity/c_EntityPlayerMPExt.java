/*    */ package SCPCraft.CoroAI.entity;
/*    */ 
/*    */ import SCPCraft.c_CoroAIUtil;
/*    */ import bq;
/*    */ import iq;
/*    */ import ir;
/*    */ import java.lang.reflect.Field;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class c_EntityPlayerMPExt
/*    */   extends iq
/*    */ {
/*    */   public Field itemInUse;
/*    */   public ur itemInUse_val;
/*    */   public Field itemInUseCount;
/*    */   public int itemInUseCount_val;
/*    */   public Field foodLevel;
/*    */   
/*    */   public c_EntityPlayerMPExt(MinecraftServer par1MinecraftServer, yc par2World, String par3Str, ir par4ItemInWorldManager) {
/* 25 */     super(par1MinecraftServer, par2World, par3Str, par4ItemInWorldManager);
/*    */     try {
/* 27 */       this.itemInUse = c_CoroAIUtil.s_getItemInUse();
/* 28 */       if (this.itemInUse != null) this.itemInUse_val = (ur)this.itemInUse.get(this);
/*    */       
/* 30 */       this.itemInUseCount = c_CoroAIUtil.s_getItemInUseCount();
/* 31 */       if (this.itemInUseCount != null) this.itemInUseCount_val = ((Integer)this.itemInUseCount.get(this)).intValue();
/*    */       
/* 33 */       this.foodLevel = c_CoroAIUtil.s_getFoodLevel();
/* 34 */     } catch (Exception ex) {
/* 35 */       ex.printStackTrace();
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int bL() {
/*    */     try {
/* 44 */       this.itemInUseCount_val = ((Integer)this.itemInUseCount.get(this)).intValue();
/* 45 */       return this.itemInUseCount_val;
/* 46 */     } catch (Exception ex) {
/* 47 */       ex.printStackTrace();
/* 48 */       return 0;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public ur bK() {
/*    */     try {
/* 55 */       this.itemInUse_val = (ur)this.itemInUse.get(this);
/* 56 */       return this.itemInUse_val;
/* 57 */     } catch (Exception ex) {
/* 58 */       ex.printStackTrace();
/* 59 */       return null;
/*    */     } 
/*    */   }
/*    */   
/*    */   public void setFoodLevel(int level) {
/*    */     try {
/* 65 */       this.foodLevel.set(this.bM, Integer.valueOf(level));
/* 66 */     } catch (Exception ex) {
/* 67 */       ex.printStackTrace();
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(bq par1NBTTagCompound) {
/* 76 */     super.a(par1NBTTagCompound);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void b(bq par1NBTTagCompound) {
/* 86 */     super.b(par1NBTTagCompound);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/entity/c_EntityPlayerMPExt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */