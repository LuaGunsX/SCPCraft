/*    */ package SCPCraft.entities;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import lh;
/*    */ import lm;
/*    */ import md;
/*    */ import mr;
/*    */ import nc;
/*    */ import nh;
/*    */ import qx;
/*    */ import yc;
/*    */ 
/*    */ public class SCPEntityClassD027 extends SCPEntityD {
/*    */   public boolean isVerminGod;
/*    */   public static boolean L;
/*    */   
/*    */   public SCPEntityClassD027(yc par1World) {
/* 18 */     super(par1World);
/* 19 */     a(0.9F, 1.3F);
/* 20 */     this.aG = "/SCPCraft/textures/mobs/ClassDGuy.png";
/* 21 */     az().a(true);
/* 22 */     this.bH = 0.4F;
/* 23 */     this.bn.a(0, (nc)new mr(this, SCPEntityRat.class, 6.0F, 0.25F, 0.3F));
/* 24 */     this.bn.a(0, (nc)new nh((md)this, qx.class, 10.0F));
/* 25 */     this.bn.a(1, (nc)new nh((md)this, SCPEntityClassD027.class, 10.0F));
/* 26 */     this.bn.a(2, (nc)new nh((md)this, SCPEntity173.class, 10.0F));
/* 27 */     this.bn.a(3, (nc)new nh((md)this, SCPEntity111.class, 10.0F));
/*    */   }
/*    */   
/*    */   protected void bl() {
/* 31 */     super.bl();
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 36 */     d(new lm(mod_SCP.verminGod.H, 10000, 1));
/* 37 */     super.c();
/*    */   }
/*    */ 
/*    */   
/*    */   public void j_() {
/* 42 */     super.j_();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean be() {
/* 47 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(lh par1DamageSource) {
/* 52 */     super.a(par1DamageSource);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean bj() {
/* 57 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int aT() {
/* 62 */     return 30;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntityClassD027.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */