/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.entities.SCPEntity217Creeper;
/*    */ import SCPCraft.mod_SCP;
/*    */ import amq;
/*    */ import lq;
/*    */ import qx;
/*    */ import r;
/*    */ import up;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ public class SCPItemVCreeper
/*    */   extends up
/*    */ {
/*    */   public SCPItemVCreeper(int i) {
/* 17 */     super(i);
/* 18 */     this.ck = 1;
/* 19 */     a(mod_SCP.tabItemSCP);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 24 */     return "/SCPCraft/textures/SCPItems.png";
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/* 29 */     if (par3World.I)
/*    */     {
/* 31 */       return true;
/*    */     }
/*    */ 
/*    */     
/* 35 */     int var11 = par3World.a(par4, par5, par6);
/* 36 */     par4 += r.b[par7];
/* 37 */     par5 += r.c[par7];
/* 38 */     par6 += r.d[par7];
/* 39 */     double var12 = 0.0D;
/*    */     
/* 41 */     if ((par7 == 1 && var11 == amq.bc.cm) || var11 == amq.bE.cm)
/*    */     {
/* 43 */       var12 = 0.5D;
/*    */     }
/*    */     
/* 46 */     if (spawnCreature(par3World, par1ItemStack.j(), par4 + 0.5D, par5 + var12, par6 + 0.5D) && !par2EntityPlayer.cd.d)
/*    */     {
/* 48 */       par1ItemStack.a--;
/*    */     }
/*    */     
/* 51 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 57 */     SCPEntity217Creeper var8 = new SCPEntity217Creeper(par0World);
/* 58 */     var8.b(par2, par4, par6, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 59 */     par0World.d((lq)var8);
/* 60 */     var8.aO();
/*    */     
/* 62 */     return (var8 != null);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItemVCreeper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */