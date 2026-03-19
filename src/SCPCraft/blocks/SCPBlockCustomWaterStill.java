/*    */ package SCPCraft.blocks;
/*    */ 
/*    */ import agi;
/*    */ import akx;
/*    */ import java.util.Random;
/*    */ import yc;
/*    */ import ym;
/*    */ 
/*    */ public abstract class SCPBlockCustomWaterStill
/*    */   extends akx
/*    */ {
/* 12 */   double red = 0.0D;
/* 13 */   double green = 0.0D;
/* 14 */   double blue = 0.0D;
/*    */   
/*    */   protected SCPBlockCustomWaterStill(int par1, agi par2Material) {
/* 17 */     super(par1, par2Material);
/* 18 */     b(false);
/*    */   }
/*    */   
/*    */   public abstract int b(ym paramym, int paramInt1, int paramInt2, int paramInt3);
/*    */   
/*    */   public void a(yc world, int i, int j, int k, int l) {
/* 24 */     super.a(world, i, j, k, l);
/* 25 */     if (world.a(i, j, k) == this.cm) {
/* 26 */       setNotStationary(world, i, j, k);
/*    */     }
/*    */   }
/*    */   
/*    */   private void setNotStationary(yc world, int i, int j, int k) {
/* 31 */     int l = world.h(i, j, k);
/* 32 */     world.r = true;
/* 33 */     world.c(i, j, k, this.cm + 1, l);
/* 34 */     world.e(i, j, k, i, j, k);
/* 35 */     world.a(i, j, k, this.cm + 1, r_());
/* 36 */     world.r = false;
/*    */   }
/*    */   
/*    */   public void b(yc world, int i, int j, int k, Random random) {
/* 40 */     super.b(world, i, j, k, random);
/*    */   }
/*    */ 
/*    */   
/*    */   public void bubbleColor(double par1, double par2, double par3) {
/* 45 */     this.red = par1;
/* 46 */     this.green = par2;
/* 47 */     this.blue = par3;
/*    */   }
/*    */   
/*    */   public void a(yc par1World, int par2, int par3, int par4, Random par5Random) {
/* 51 */     super.a(par1World, par2, par3, par4, par5Random);
/* 52 */     if (par5Random.nextInt(10) == 0) {
/* 53 */       int i = par1World.h(par2, par3, par4);
/*    */       
/* 55 */       if (i <= 0 || i >= 8) {
/* 56 */         par1World.a("mobSpell", (par2 + par5Random.nextFloat()), (par3 + par5Random.nextFloat()), (par4 + par5Random.nextFloat()), this.red, this.green, this.blue);
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   private boolean isFlammable(yc world, int i, int j, int k) {
/* 62 */     return world.g(i, j, k).h();
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlockCustomWaterStill.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */