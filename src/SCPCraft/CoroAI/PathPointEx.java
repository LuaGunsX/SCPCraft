/*    */ package SCPCraft.CoroAI;
/*    */ 
/*    */ import ke;
/*    */ 
/*    */ 
/*    */ public class PathPointEx
/*    */ {
/*    */   public final int xCoord;
/*    */   public final int yCoord;
/*    */   public final int zCoord;
/*    */   public final int hash;
/*    */   public int index;
/*    */   public float totalPathDistance;
/*    */   public float distanceToNext;
/*    */   public float distanceToTarget;
/*    */   public PathPointEx previous;
/*    */   public boolean isFirst;
/*    */   
/*    */   public PathPointEx(int i, int j, int k) {
/* 20 */     this.index = -1;
/* 21 */     this.isFirst = false;
/* 22 */     this.xCoord = i;
/* 23 */     this.yCoord = j;
/* 24 */     this.zCoord = k;
/* 25 */     this.hash = makeHash(i, j, k);
/*    */   }
/*    */ 
/*    */   
/*    */   public static int makeHash(int i, int j, int k) {
/* 30 */     return j & 0xFF | (i & 0x7FFF) << 8 | (k & 0x7FFF) << 24 | ((i >= 0) ? 0 : Integer.MIN_VALUE) | ((k >= 0) ? 0 : 32768);
/*    */   }
/*    */ 
/*    */   
/*    */   public float distanceTo(PathPointEx pathpoint) {
/* 35 */     float f = (pathpoint.xCoord - this.xCoord);
/* 36 */     float f1 = (pathpoint.yCoord - this.yCoord);
/* 37 */     float f2 = (pathpoint.zCoord - this.zCoord);
/* 38 */     return ke.c(f * f + f1 * f1 + f2 * f2);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object obj) {
/* 43 */     if (obj instanceof PathPointEx) {
/*    */       
/* 45 */       PathPointEx pathpoint = (PathPointEx)obj;
/* 46 */       return (this.hash == pathpoint.hash && this.xCoord == pathpoint.xCoord && this.yCoord == pathpoint.yCoord && this.zCoord == pathpoint.zCoord);
/*    */     } 
/*    */ 
/*    */     
/* 50 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 56 */     return this.hash;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isAssigned() {
/* 61 */     return (this.index >= 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 66 */     return this.xCoord + ", " + this.yCoord + ", " + this.zCoord;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/PathPointEx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */