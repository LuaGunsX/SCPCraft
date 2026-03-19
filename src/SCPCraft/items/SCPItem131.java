/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.entities.SCPEntity131;
/*    */ import amq;
/*    */ import java.util.List;
/*    */ import lq;
/*    */ import qx;
/*    */ import r;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ 
/*    */ public class SCPItem131
/*    */   extends SCPItemDocument
/*    */ {
/*    */   public SCPItem131(int i) {
/* 17 */     super(i);
/* 18 */     this.ck = 1;
/* 19 */     e(1);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 24 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/* 29 */     list.add("§2SCP-131");
/* 30 */     list.add("§7Eyepods");
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean n_() {
/* 35 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/* 40 */     if (par3World.I)
/*    */     {
/* 42 */       return true;
/*    */     }
/*    */ 
/*    */     
/* 46 */     int var11 = par3World.a(par4, par5, par6);
/* 47 */     par4 += r.b[par7];
/* 48 */     par5 += r.c[par7];
/* 49 */     par6 += r.d[par7];
/* 50 */     double var12 = 0.0D;
/*    */     
/* 52 */     if ((par7 == 1 && var11 == amq.bc.cm) || var11 == amq.bE.cm)
/*    */     {
/* 54 */       var12 = 0.5D;
/*    */     }
/*    */     
/* 57 */     if (spawnCreature(par3World, par1ItemStack.j(), par4 + 0.5D, par5 + var12, par6 + 0.5D) && !par2EntityPlayer.cd.d)
/*    */     {
/* 59 */       par1ItemStack.a--;
/*    */     }
/*    */     
/* 62 */     par2EntityPlayer.b("SCP-131 Spawned. | [Type: §2Safe§f]");
/*    */ 
/*    */ 
/*    */     
/* 66 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 74 */     SCPEntity131 var8 = new SCPEntity131(par0World);
/* 75 */     var8.b(par2, par4, par6, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 76 */     par0World.d((lq)var8);
/* 77 */     var8.aO();
/*    */     
/* 79 */     return (var8 != null);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem131.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */