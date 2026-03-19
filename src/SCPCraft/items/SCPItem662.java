/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.entities.SCPEntityButler;
/*    */ import SCPCraft.mod_SCP;
/*    */ import lq;
/*    */ import qx;
/*    */ import up;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ public class SCPItem662
/*    */   extends up
/*    */ {
/*    */   public SCPItem662(int i) {
/* 15 */     super(i);
/* 16 */     d(1);
/* 17 */     a(mod_SCP.tabSCP);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 22 */     return "/SCPCraft/textures/SCPItems.png";
/*    */   }
/*    */ 
/*    */   
/*    */   public ur a(ur itemstack, yc world, qx entityplayer) {
/* 27 */     if (!world.I) {
/*    */       
/* 29 */       spawnCreature(world, entityplayer.t, entityplayer.u, entityplayer.v);
/*    */       
/* 31 */       if (!entityplayer.cd.d)
/*    */       {
/* 33 */         itemstack.a--;
/*    */       }
/*    */     } 
/*    */     
/* 37 */     return itemstack;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean spawnCreature(yc par0World, double par2, double par4, double par6) {
/* 43 */     SCPEntityButler var8 = new SCPEntityButler(par0World);
/* 44 */     var8.b(par2, par4, par6, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 45 */     par0World.d((lq)var8);
/* 46 */     var8.aO();
/*    */     
/* 48 */     return (var8 != null);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem662.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */