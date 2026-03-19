/*    */ package SCPCraft.entities;
/*    */ 
/*    */ import ModLoader;
/*    */ import lq;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import qx;
/*    */ import yc;
/*    */ 
/*    */ public class SCPEntity096Cry
/*    */   extends SCPEntity
/*    */ {
/*    */   private int field_35185_e;
/*    */   public boolean isAttacking;
/*    */   int time;
/*    */   
/*    */   public SCPEntity096Cry(yc par1World) {
/* 17 */     super(par1World);
/* 18 */     this.aG = "/SCPCraft/textures/mobs/096Mad.png";
/* 19 */     this.bH = 0.0F;
/* 20 */     this.attackStrength = 0;
/* 21 */     this.time = 0;
/* 22 */     this.isAttacking = false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int aT() {
/* 27 */     return 9001;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean be() {
/* 35 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   protected lq j() {
/* 40 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void c_(qx par1EntityPlayer) {}
/*    */ 
/*    */   
/*    */   public void c() {
/* 49 */     qx entityplayer = this.p.b((lq)this, 64.0D);
/* 50 */     this.w = 0.0D;
/* 51 */     this.y = 0.0D;
/* 52 */     this.isAttacking = (this.a_ != null);
/* 53 */     if (this.time == 0) this.p.a((lq)this, "sounds.096Seen", 5.0F, 1.0F); 
/* 54 */     this.time++;
/* 55 */     Minecraft mc = ModLoader.getMinecraftInstance();
/* 56 */     if (!this.p.I && this.time == 620) {
/*    */       
/* 58 */       x();
/* 59 */       SCPEntity096Mad silver = new SCPEntity096Mad(this.p);
/* 60 */       silver.b(this.t, this.u, this.v, 0.0F, 0.0F);
/* 61 */       this.p.d((lq)silver);
/* 62 */       silver.aO();
/*    */     } 
/* 64 */     for (int k = 0; k < 2; k++) {
/*    */       
/* 66 */       this.p.a("cry", this.t + 0.1D, this.u + 2.0D, this.v + 0.25D, this.aa.nextDouble() - 0.5D, -1.5D, this.aa.nextDouble() - 0.5D);
/* 67 */       this.p.a("cry", this.t - 0.1D, this.u + 2.0D, this.v + 0.25D, this.aa.nextDouble() - 0.5D, -1.5D, this.aa.nextDouble() - 0.5D);
/*    */     } 
/* 69 */     this.bF = false;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected String aY() {
/* 76 */     return "mob.villager.default";
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected String aZ() {
/* 84 */     return "mob.ghast.scream";
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected String ba() {
/* 92 */     return "mob.villager.default";
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean bj() {
/* 97 */     return false;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity096Cry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */