/*    */ package SCPCraft.blocks;
/*    */ 
/*    */ import ModLoader;
/*    */ import SCPCraft.containerslots.SCPContainerDocument;
/*    */ import SCPCraft.mod_SCP;
/*    */ import agi;
/*    */ import amq;
/*    */ import iq;
/*    */ import qx;
/*    */ import rq;
/*    */ import yc;
/*    */ 
/*    */ public class SCPBlockDocument
/*    */   extends amq {
/*    */   public SCPBlockDocument(int par1, boolean par2) {
/* 16 */     super(par1, agi.f);
/* 17 */     a(mod_SCP.tabBlockSCP);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 22 */     return "/SCPCraft/textures/SCPblox.png";
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(yc var1, int var2, int var3, int var4, qx var5, int var6, float var7, float var8, float var9) {
/* 27 */     if (var5 instanceof iq) {
/*    */       
/* 29 */       if (var1.I)
/*    */       {
/* 31 */         return true;
/*    */       }
/*    */ 
/*    */       
/* 35 */       SCPContainerDocument var11 = new SCPContainerDocument(var5.bJ, var1, var2, var3, var4);
/* 36 */       ModLoader.serverOpenWindow((iq)var5, (rq)var11, 6079, var2, var3, var4);
/* 37 */       return true;
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 42 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int a(int i, int j) {
/* 49 */     if (i == 0)
/*    */     {
/* 51 */       return 10;
/*    */     }
/* 53 */     if (i == 1)
/*    */     {
/* 55 */       return 12;
/*    */     }
/* 57 */     if (i == 2)
/*    */     {
/* 59 */       return 11;
/*    */     }
/* 61 */     if (i == 3)
/*    */     {
/* 63 */       return 11;
/*    */     }
/* 65 */     if (i == 4)
/*    */     {
/* 67 */       return 11;
/*    */     }
/* 69 */     if (i == 5)
/*    */     {
/* 71 */       return 11;
/*    */     }
/* 73 */     if (j == 1)
/*    */     {
/* 75 */       return 166;
/*    */     }
/*    */     
/* 78 */     return (j != 2) ? 20 : 177;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlockDocument.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */