/*    */ package SCPCraft.particles;
/*    */ 
/*    */ import azq;
/*    */ import baz;
/*    */ import yc;
/*    */ 
/*    */ public class SCP080FX
/*    */   extends azq
/*    */ {
/*    */   float smokeParticleScale;
/*    */   
/*    */   public SCP080FX(yc par1World, double par2, double par4, double par6, double par8, double par10, double par12) {
/* 13 */     this(par1World, par2, par4, par6, par8, par10, par12, 1.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public SCP080FX(yc par1World, double par2, double par4, double par6, double par8, double par10, double par12, float par14) {
/* 18 */     super(par1World, par2, par4, par6, 0.0D, 0.0D, 0.0D);
/* 19 */     this.w *= 0.0D;
/* 20 */     this.x *= 0.0D;
/* 21 */     this.y *= 0.0D;
/* 22 */     this.x = 0.0D;
/* 23 */     this.h = this.i = this.j = (float)(Math.random() * 0.10000001192092896D);
/* 24 */     this.f *= 0.75F;
/* 25 */     this.f *= par14;
/* 26 */     this.smokeParticleScale = this.f;
/* 27 */     this.e = (int)(8.0D / (Math.random() * 0.9D + 0.4D));
/* 28 */     this.e = (int)(this.e * par14);
/* 29 */     this.Y = false;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(baz par1Tessellator, float par2, float par3, float par4, float par5, float par6, float par7) {
/* 34 */     float f = (this.d + par2) / this.e * 32.0F;
/*    */     
/* 36 */     if (f < 0.0F)
/*    */     {
/* 38 */       f = 0.0F;
/*    */     }
/*    */     
/* 41 */     if (f > 1.0F)
/*    */     {
/* 43 */       f = 1.0F;
/*    */     }
/*    */     
/* 46 */     this.f = this.smokeParticleScale * f;
/* 47 */     super.a(par1Tessellator, par2, par3, par4, par5, par6, par7);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void j_() {
/* 55 */     this.q = this.t;
/* 56 */     this.r = this.u;
/* 57 */     this.s = this.v;
/*    */     
/* 59 */     if (this.d++ >= this.e)
/*    */     {
/* 61 */       x();
/*    */     }
/*    */     
/* 64 */     i(7 - this.d * 8 / this.e);
/* 65 */     this.x += 0.004D;
/* 66 */     d(this.w, this.x, this.y);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/particles/SCP080FX.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */