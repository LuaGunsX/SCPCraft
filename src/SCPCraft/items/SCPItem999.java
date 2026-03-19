/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.entities.SCPEntity999;
/*    */ import amq;
/*    */ import java.util.List;
/*    */ import lq;
/*    */ import qx;
/*    */ import r;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ 
/*    */ public class SCPItem999
/*    */   extends SCPItemDocument
/*    */ {
/*    */   public SCPItem999(int i) {
/* 17 */     super(i);
/* 18 */     this.ck = 1;
/* 19 */     e(1);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/* 25 */     list.add("§2SCP-999");
/* 26 */     list.add("§7The Tickle Monster");
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean n_() {
/* 31 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/* 36 */     if (par3World.I)
/*    */     {
/* 38 */       return true;
/*    */     }
/*    */ 
/*    */     
/* 42 */     int var11 = par3World.a(par4, par5, par6);
/* 43 */     par4 += r.b[par7];
/* 44 */     par5 += r.c[par7];
/* 45 */     par6 += r.d[par7];
/* 46 */     double var12 = 0.0D;
/*    */     
/* 48 */     if ((par7 == 1 && var11 == amq.bc.cm) || var11 == amq.bE.cm)
/*    */     {
/* 50 */       var12 = 0.5D;
/*    */     }
/*    */     
/* 53 */     if (spawnCreature(par3World, par1ItemStack.j(), par4 + 0.5D, par5 + var12, par6 + 0.5D) && !par2EntityPlayer.cd.d)
/*    */     {
/* 55 */       par1ItemStack.a--;
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 60 */     par2EntityPlayer.b("SCP-999 Spawned. | [Type: §2Safe§f]");
/*    */ 
/*    */ 
/*    */     
/* 64 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 70 */     SCPEntity999 var8 = new SCPEntity999(par0World);
/* 71 */     var8.b(par2, par4, par6, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 72 */     par0World.d((lq)var8);
/* 73 */     var8.aO();
/*    */     
/* 75 */     return (var8 != null);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem999.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */