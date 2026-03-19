/*    */ package SCPCraft.entities;
/*    */ 
/*    */ import md;
/*    */ import mr;
/*    */ import mz;
/*    */ import nc;
/*    */ import nh;
/*    */ import qx;
/*    */ import yc;
/*    */ 
/*    */ public class SCPEntityClassDGuy extends SCPEntityD {
/*    */   public boolean isVerminGod;
/*    */   
/*    */   public SCPEntityClassDGuy(yc par1World) {
/* 15 */     super(par1World);
/* 16 */     a(0.9F, 1.3F);
/* 17 */     this.aG = "/SCPCraft/textures/mobs/ClassDGuy.png";
/* 18 */     az().a(true);
/* 19 */     this.bH = 0.4F;
/* 20 */     this.bn.a(0, (nc)new mz((md)this));
/* 21 */     this.bn.a(0, (nc)new nh((md)this, qx.class, 10.0F));
/* 22 */     this.bn.a(1, (nc)new nh((md)this, SCPEntityClassDGuy.class, 10.0F));
/* 23 */     this.bn.a(2, (nc)new nh((md)this, SCPEntity173.class, 10.0F));
/* 24 */     this.bn.a(3, (nc)new nh((md)this, SCPEntity111.class, 10.0F));
/* 25 */     this.bn.a(1, (nc)new mr(this, SCPEntity.class, 9.0F, 0.4F, 0.3F));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void bl() {
/* 30 */     super.bl();
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 35 */     super.c();
/*    */   }
/*    */ 
/*    */   
/*    */   public void j_() {
/* 40 */     super.j_();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean be() {
/* 45 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean bj() {
/* 50 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int aT() {
/* 55 */     return 30;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntityClassDGuy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */