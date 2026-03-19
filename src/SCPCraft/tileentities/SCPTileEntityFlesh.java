/*    */ package SCPCraft.tileentities;
/*    */ 
/*    */ import ModLoader;
/*    */ import SCPCraft.mod_SCP;
/*    */ import any;
/*    */ import bq;
/*    */ import java.util.Random;
/*    */ import lm;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import qx;
/*    */ 
/*    */ public class SCPTileEntityFlesh
/*    */   extends any
/*    */ {
/* 15 */   public Random rand = new Random();
/*    */   public boolean hasStepped;
/*    */   public int time;
/* 18 */   private Minecraft minecraft = ModLoader.getMinecraftInstance();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean setStep(boolean par) {
/* 25 */     return this.hasStepped = par;
/*    */   }
/*    */ 
/*    */   
/*    */   public void g() {
/* 30 */     qx player = this.k.a(this.l + 0.5D, this.m + 0.5D, this.n + 0.5D, 4.0D);
/* 31 */     if (this.hasStepped == true && player != null) this.time++; 
/* 32 */     if (player != null && this.time == 500) player.d(new lm(mod_SCP.eaten.H, 240, 1)); 
/* 33 */     if (player != null && player.a(mod_SCP.eaten) && this.time >= 500 && this.time % 50 == 0) this.k.a((this.l + 0.5F), (this.m + 0.5F), (this.n + 0.5F), "sounds.Munch", 1.0F, 1.0F); 
/* 34 */     super.g();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bq par1NBTTagCompound) {
/* 39 */     super.a(par1NBTTagCompound);
/* 40 */     this.time = par1NBTTagCompound.d("Time");
/* 41 */     this.hasStepped = par1NBTTagCompound.n("Step");
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(bq par1NBTTagCompound) {
/* 46 */     super.b(par1NBTTagCompound);
/* 47 */     par1NBTTagCompound.a("Time", (short)this.time);
/* 48 */     par1NBTTagCompound.a("Step", this.hasStepped);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/tileentities/SCPTileEntityFlesh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */