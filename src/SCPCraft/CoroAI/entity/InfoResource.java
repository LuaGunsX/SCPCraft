/*    */ package SCPCraft.CoroAI.entity;
/*    */ 
/*    */ public class InfoResource
/*    */   extends InfoArea
/*    */ {
/*    */   public boolean mined;
/*    */   public EnumResource type;
/*    */   
/*    */   public InfoResource(int x, int y, int z, int id, EnumResource parType) {
/* 10 */     super(x, y, z, id);
/* 11 */     this.type = parType;
/*    */   }
/*    */   
/*    */   public void mine() {
/* 15 */     this.mined = true;
/* 16 */     this.blockID = 0;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/entity/InfoResource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */