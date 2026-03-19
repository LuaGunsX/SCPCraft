/*    */ package SCPCraft.CoroAI;
/*    */ 
/*    */ import aoj;
/*    */ import lq;
/*    */ 
/*    */ 
/*    */ public class PathEntityEx
/*    */ {
/*    */   public final PathPointEx[] points;
/*    */   public final int pathLength;
/*    */   public int pathIndex;
/*    */   
/*    */   public PathEntityEx(PathPointEx[] apathpoint) {
/* 14 */     this.points = apathpoint;
/* 15 */     this.pathLength = apathpoint.length;
/*    */   }
/*    */ 
/*    */   
/*    */   public void incrementPathIndex() {
/* 20 */     this.pathIndex++;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isFinished() {
/* 25 */     return (this.pathIndex >= this.points.length);
/*    */   }
/*    */ 
/*    */   
/*    */   public aoj getPosition(lq entity) {
/*    */     try {
/* 31 */       double d = (this.points[this.pathIndex]).xCoord + (int)(entity.N + 1.0F) * 0.5D;
/* 32 */       double d1 = (this.points[this.pathIndex]).yCoord;
/* 33 */       double d2 = (this.points[this.pathIndex]).zCoord + (int)(entity.N + 1.0F) * 0.5D;
/* 34 */       return aoj.a(d, d1, d2);
/* 35 */     } catch (Exception ex) {
/* 36 */       return null;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/PathEntityEx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */