/*    */ package SCPCraft.tileentities;
/*    */ 
/*    */ import ModLoader;
/*    */ import any;
/*    */ import bq;
/*    */ import java.util.Random;
/*    */ import net.minecraft.client.Minecraft;
/*    */ 
/*    */ public class SCPTileEntity079
/*    */   extends any
/*    */ {
/* 12 */   public Random rand = new Random();
/* 13 */   private Minecraft minecraft = ModLoader.getMinecraftInstance();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean anyPlayerInRange() {
/* 20 */     return (this.k.a(this.l + 0.5D, this.m + 0.5D, this.n + 0.5D, 9.0D) != null);
/*    */   }
/*    */ 
/*    */   
/*    */   public void g() {
/* 25 */     super.g();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bq par1NBTTagCompound) {
/* 30 */     super.a(par1NBTTagCompound);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(bq par1NBTTagCompound) {
/* 35 */     super.b(par1NBTTagCompound);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/tileentities/SCPTileEntity079.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */