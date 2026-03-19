/*    */ package SCPCraft.particles;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import azq;
/*    */ import baz;
/*    */ import ll;
/*    */ import lm;
/*    */ import lq;
/*    */ import qx;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ public class SCPSmokeFX
/*    */   extends azq {
/*    */   float smokeParticleScale;
/*    */   public int getMetadata;
/*    */   
/*    */   public SCPSmokeFX(yc par1World, double par2, double par4, double par6, double par8, double par10, double par12) {
/* 19 */     this(par1World, par2, par4, par6, par8, par10, par12, 1.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public SCPSmokeFX(yc par1World, double par2, double par4, double par6, double par8, double par10, double par12, float par14) {
/* 24 */     super(par1World, par2, par4, par6, 0.0D, 0.0D, 0.0D);
/* 25 */     this.w *= 0.10000000149011612D;
/* 26 */     this.x *= 0.10000000149011612D;
/* 27 */     this.y *= 0.10000000149011612D;
/* 28 */     this.w += par8;
/* 29 */     this.x += par10;
/* 30 */     this.y += par12;
/* 31 */     this.h = this.i = this.j = 0.0F;
/* 32 */     this.f *= 0.75F;
/* 33 */     this.f *= par14;
/* 34 */     this.smokeParticleScale = this.f;
/* 35 */     this.e = 32;
/* 36 */     this.e = (int)(this.e * par14);
/* 37 */     this.Y = false;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(baz par1Tessellator, float par2, float par3, float par4, float par5, float par6, float par7) {
/* 42 */     float f = (this.d + par2) / this.e * 32.0F;
/*    */     
/* 44 */     if (f < 0.0F)
/*    */     {
/* 46 */       f = 0.0F;
/*    */     }
/*    */     
/* 49 */     if (f > 1.0F)
/*    */     {
/* 51 */       f = 1.0F;
/*    */     }
/*    */     
/* 54 */     this.f = this.smokeParticleScale * f;
/* 55 */     super.a(par1Tessellator, par2, par3, par4, par5, par6, par7);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void j_() {
/* 63 */     qx player = this.p.b((lq)this, 16.0D);
/* 64 */     if (player != null) {
/* 65 */       ur var9 = player.bJ.f(3);
/* 66 */       if (var9 != null)
/* 67 */       { if (var9.c != mod_SCP.GasMask.cj && d((lq)player) < 1.0D) {
/* 68 */           player.d(new lm(ll.q.H, 140, 1));
/*    */         } }
/* 70 */       else if (d((lq)player) < 1.0D) { player.d(new lm(ll.q.H, 140, 1)); }
/*    */     
/* 72 */     }  this.q = this.t;
/* 73 */     this.r = this.u;
/* 74 */     this.s = this.v;
/* 75 */     if (this.d++ >= this.e)
/*    */     {
/* 77 */       x();
/*    */     }
/*    */     
/* 80 */     i(7 - this.d * 8 / this.e);
/* 81 */     this.x += 0.004D;
/* 82 */     d(this.w, this.x, this.y);
/*    */     
/* 84 */     if (this.u == this.r) {
/*    */       
/* 86 */       this.w *= 1.1D;
/* 87 */       this.y *= 1.1D;
/*    */     } 
/*    */     
/* 90 */     this.w *= 0.9599999785423279D;
/* 91 */     this.x *= 0.9599999785423279D;
/* 92 */     this.y *= 0.9599999785423279D;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/particles/SCPSmokeFX.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */