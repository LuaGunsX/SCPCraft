/*    */ package SCPCraft.blocks;
/*    */ 
/*    */ import SCPCraft.entities.SCPEntity019n2;
/*    */ import SCPCraft.mod_SCP;
/*    */ import agi;
/*    */ import amq;
/*    */ import java.util.Random;
/*    */ import lq;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ public class SCPBlockSpawner
/*    */   extends amq {
/* 14 */   public static final String[] field_72155_a = new String[] { "moss stone" };
/*    */ 
/*    */   
/*    */   public SCPBlockSpawner(int par1, int par2) {
/* 18 */     super(par1, 1, agi.e);
/* 19 */     c(3.0F);
/* 20 */     a(mod_SCP.tabBlockSCP);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int a(int par1, int par2) {
/* 28 */     return (par2 == 1) ? amq.ar.cl : ((par2 == 2) ? amq.ar.cl : amq.ar.cl);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void c(yc par1World, int par2, int par3, int par4, int par5) {
/* 36 */     if (!par1World.I) {
/*    */       
/* 38 */       SCPEntity019n2 var6 = new SCPEntity019n2(par1World);
/* 39 */       var6.b(par2 + 0.5D, par3, par4 + 0.5D, 0.0F, 0.0F);
/* 40 */       par1World.d((lq)var6);
/* 41 */       var6.aR();
/*    */     } 
/*    */     
/* 44 */     super.c(par1World, par2, par3, par4, par5);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int a(Random par1Random) {
/* 52 */     return 0;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean getPosingIdByMetadata(int par0) {
/* 60 */     return (par0 == amq.ar.cm || par0 == amq.ar.cm || par0 == amq.ar.cm);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static int getMetadataForBlockType(int par0) {
/* 69 */     return (par0 == amq.ar.cm) ? 1 : ((par0 == amq.ar.cm) ? 2 : 0);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected ur f_(int par1) {
/* 78 */     amq var2 = amq.ar;
/*    */     
/* 80 */     if (par1 == 1)
/*    */     {
/* 82 */       var2 = amq.ar;
/*    */     }
/*    */     
/* 85 */     if (par1 == 2)
/*    */     {
/* 87 */       var2 = amq.ar;
/*    */     }
/*    */     
/* 90 */     return new ur(var2);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlockSpawner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */