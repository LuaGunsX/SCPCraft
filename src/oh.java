/*    */ import SCPCraft.mod_SCP;
/*    */ import java.util.Collections;
/*    */ import java.util.Comparator;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class oh
/*    */   extends om
/*    */ {
/*    */   md a;
/*    */   Class b;
/*    */   int c;
/*    */   private final ly g;
/*    */   private oi h;
/*    */   
/*    */   public oh(md par1EntityLiving, Class par2Class, float par3, int par4, boolean par5) {
/* 26 */     this(par1EntityLiving, par2Class, par3, par4, par5, false);
/*    */   }
/*    */ 
/*    */   
/*    */   public oh(md par1EntityLiving, Class par2Class, float par3, int par4, boolean par5, boolean par6) {
/* 31 */     this(par1EntityLiving, par2Class, par3, par4, par5, par6, (ly)null);
/*    */   }
/*    */ 
/*    */   
/*    */   public oh(md par1, Class par2, float par3, int par4, boolean par5, boolean par6, ly par7IEntitySelector) {
/* 36 */     super(par1, par3, par5, par6);
/* 37 */     this.b = par2;
/* 38 */     this.e = par3;
/* 39 */     this.c = par4;
/* 40 */     this.h = new oi(this, par1);
/* 41 */     this.g = par7IEntitySelector;
/* 42 */     a(1);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 51 */     qx var12 = this.d.p.b(this.d, this.e);
/* 52 */     if (var12 != null && var12.a(mod_SCP.skeleton) && this.d instanceof qn) { this.a = var12.aD(); return true; }
/*    */     
/* 54 */     if (this.c > 0 && this.d.aB().nextInt(this.c) != 0)
/*    */     {
/* 56 */       return false;
/*    */     }
/*    */ 
/*    */     
/* 60 */     if (this.b == qx.class) {
/*    */       
/* 62 */       qx var1 = this.d.p.b(this.d, this.e);
/*    */       
/* 64 */       if (a(var1, false))
/*    */       {
/* 66 */         this.a = var1;
/* 67 */         return true;
/*    */       }
/*    */     
/*    */     } else {
/*    */       
/* 72 */       List<?> var5 = this.d.p.a(this.b, this.d.D.b(this.e, 4.0D, this.e), this.g);
/* 73 */       Collections.sort(var5, (Comparator<?>)this.h);
/* 74 */       Iterator<?> var2 = var5.iterator();
/*    */       
/* 76 */       while (var2.hasNext()) {
/*    */         
/* 78 */         lq var3 = (lq)var2.next();
/* 79 */         md var4 = (md)var3;
/*    */         
/* 81 */         if (a(var4, false)) {
/*    */           
/* 83 */           this.a = var4;
/* 84 */           return true;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 89 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void c() {
/* 98 */     this.d.b(this.a);
/* 99 */     super.c();
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/oh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */