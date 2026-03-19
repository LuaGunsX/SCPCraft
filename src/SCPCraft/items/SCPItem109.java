/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import amq;
/*    */ import qx;
/*    */ import r;
/*    */ import up;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ public class SCPItem109
/*    */   extends up
/*    */ {
/*    */   public SCPItem109(int i) {
/* 15 */     super(i);
/* 16 */     d(1);
/* 17 */     a(mod_SCP.tabSCP);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/* 22 */     if (par3World.I)
/*    */     {
/* 24 */       return true;
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 29 */     int var11 = par3World.a(par4, par5, par6);
/* 30 */     par4 += r.b[par7];
/* 31 */     par5 += r.c[par7];
/* 32 */     par6 += r.d[par7];
/* 33 */     double var12 = 0.0D;
/*    */     
/* 35 */     if ((par7 == 1 && var11 == amq.bc.cm) || var11 == amq.bE.cm)
/*    */     {
/* 37 */       var12 = 0.5D;
/*    */     }
/*    */     
/* 40 */     int i = par3World.a(par4, par5, par6);
/*    */     
/* 42 */     if (i == 0) {
/*    */       
/* 44 */       par3World.a(par4, par5, par6, amq.D.cm, 0, true);
/* 45 */       par3World.a(par4 + 0.5D, par5 + 0.5D, par6 + 0.5D, "fire.ignite", 1.0F, d.nextFloat() * 0.4F + 0.8F);
/*    */     } 
/*    */     
/* 48 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 54 */     return "/SCPCraft/textures/SCPItems.png";
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem109.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */