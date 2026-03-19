/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.entities.SCPEntity1440;
/*    */ import amq;
/*    */ import java.util.List;
/*    */ import lq;
/*    */ import qx;
/*    */ import r;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ 
/*    */ public class SCPItem1440
/*    */   extends SCPItemDocument
/*    */ {
/*    */   public SCPItem1440(int i) {
/* 17 */     super(i);
/* 18 */     this.ck = 1;
/* 19 */     e(1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/* 24 */     list.add("§4SCP-1440");
/* 25 */     list.add("§7The Old Man from Nowhere");
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean n_() {
/* 30 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/* 35 */     if (par3World.I)
/*    */     {
/* 37 */       return true;
/*    */     }
/*    */ 
/*    */     
/* 41 */     int var11 = par3World.a(par4, par5, par6);
/* 42 */     par4 += r.b[par7];
/* 43 */     par5 += r.c[par7];
/* 44 */     par6 += r.d[par7];
/* 45 */     double var12 = 0.0D;
/*    */     
/* 47 */     if ((par7 == 1 && var11 == amq.bc.cm) || var11 == amq.bE.cm)
/*    */     {
/* 49 */       var12 = 0.5D;
/*    */     }
/*    */     
/* 52 */     if (spawnCreature(par3World, par1ItemStack.j(), par4 + 0.5D, par5 + var12, par6 + 0.5D) && !par2EntityPlayer.cd.d)
/*    */     {
/* 54 */       par1ItemStack.a--;
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 59 */     par2EntityPlayer.b("SCP-1440 Spawned. | [Type: §4Keter§f]");
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 64 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 70 */     SCPEntity1440 var8 = new SCPEntity1440(par0World);
/* 71 */     var8.b(par2, par4, par6, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 72 */     par0World.d((lq)var8);
/* 73 */     var8.aO();
/*    */     
/* 75 */     return (var8 != null);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem1440.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */