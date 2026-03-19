/*    */ package SCPCraft.blocks;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import java.util.ArrayList;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ public class SCPPosters
/*    */   extends SCPBlockPoster
/*    */ {
/*    */   private int ID;
/*    */   
/*    */   public SCPPosters(int par1, int texture, int id) {
/* 14 */     super(par1);
/* 15 */     this.ID = id;
/* 16 */     this.cl = texture;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ArrayList getBlockDropped(yc world, int x, int y, int z, int metadata, int fortune) {
/* 22 */     ArrayList<ur> ret = new ArrayList();
/* 23 */     if (this.ID == 0) ret.add(new ur(mod_SCP.Pearl106)); 
/* 24 */     if (this.ID == 1) ret.add(new ur(mod_SCP.Pearl173)); 
/* 25 */     if (this.ID == 2) ret.add(new ur(mod_SCP.Pearl079)); 
/* 26 */     if (this.ID == 3) ret.add(new ur(mod_SCP.Pearl914)); 
/* 27 */     if (this.ID == 4) ret.add(new ur(mod_SCP.Pearl372)); 
/* 28 */     ret.add(new ur(mod_SCP.ItemSCPPoster));
/* 29 */     return ret;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPPosters.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */