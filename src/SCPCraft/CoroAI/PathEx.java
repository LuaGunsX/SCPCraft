/*     */ package SCPCraft.CoroAI;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class PathEx
/*     */ {
/*  10 */   private PathPointEx[] pathPoints = new PathPointEx[1024];
/*  11 */   private int count = 0;
/*     */ 
/*     */ 
/*     */   
/*     */   public PathPointEx addPoint(PathPointEx pathpoint) {
/*  16 */     if (pathpoint.index >= 0);
/*     */ 
/*     */ 
/*     */     
/*  20 */     if (this.count == this.pathPoints.length) {
/*     */       
/*  22 */       PathPointEx[] apathpoint = new PathPointEx[this.count << 1];
/*  23 */       System.arraycopy(this.pathPoints, 0, apathpoint, 0, this.count);
/*  24 */       this.pathPoints = apathpoint;
/*     */     } 
/*  26 */     this.pathPoints[this.count] = pathpoint;
/*  27 */     pathpoint.index = this.count;
/*  28 */     sortBack(this.count++);
/*  29 */     return pathpoint;
/*     */   }
/*     */ 
/*     */   
/*     */   public void clearPath() {
/*  34 */     this.count = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public PathPointEx dequeue() {
/*  39 */     PathPointEx pathpoint = this.pathPoints[0];
/*  40 */     this.pathPoints[0] = this.pathPoints[--this.count];
/*  41 */     this.pathPoints[this.count] = null;
/*  42 */     if (this.count > 0)
/*     */     {
/*  44 */       sortForward(0);
/*     */     }
/*  46 */     pathpoint.index = -1;
/*  47 */     return pathpoint;
/*     */   }
/*     */ 
/*     */   
/*     */   public void changeDistance(PathPointEx pathpoint, float f) {
/*  52 */     float f1 = pathpoint.distanceToTarget;
/*  53 */     pathpoint.distanceToTarget = f;
/*  54 */     if (f < f1) {
/*     */       
/*  56 */       sortBack(pathpoint.index);
/*     */     }
/*     */     else {
/*     */       
/*  60 */       sortForward(pathpoint.index);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void sortBack(int i) {
/*  66 */     PathPointEx pathpoint = this.pathPoints[i];
/*  67 */     float f = pathpoint.distanceToTarget;
/*     */ 
/*     */     
/*  70 */     while (i > 0) {
/*     */ 
/*     */ 
/*     */       
/*  74 */       int j = i - 1 >> 1;
/*  75 */       PathPointEx pathpoint1 = this.pathPoints[j];
/*  76 */       if (f >= pathpoint1.distanceToTarget) {
/*     */         break;
/*     */       }
/*     */       
/*  80 */       this.pathPoints[i] = pathpoint1;
/*  81 */       pathpoint1.index = i;
/*  82 */       i = j;
/*     */     } 
/*     */     
/*  85 */     this.pathPoints[i] = pathpoint;
/*  86 */     pathpoint.index = i;
/*     */   }
/*     */ 
/*     */   
/*     */   private void sortForward(int i) {
/*  91 */     PathPointEx pathpoint = this.pathPoints[i];
/*  92 */     float f = pathpoint.distanceToTarget; while (true) {
/*     */       PathPointEx pathpoint2;
/*     */       float f2;
/*  95 */       int j = 1 + (i << 1);
/*  96 */       int k = j + 1;
/*  97 */       if (j >= this.count) {
/*     */         break;
/*     */       }
/*     */       
/* 101 */       PathPointEx pathpoint1 = this.pathPoints[j];
/* 102 */       float f1 = pathpoint1.distanceToTarget;
/*     */ 
/*     */       
/* 105 */       if (k >= this.count) {
/*     */         
/* 107 */         pathpoint2 = null;
/* 108 */         f2 = Float.POSITIVE_INFINITY;
/*     */       }
/*     */       else {
/*     */         
/* 112 */         pathpoint2 = this.pathPoints[k];
/* 113 */         f2 = pathpoint2.distanceToTarget;
/*     */       } 
/* 115 */       if (f1 < f2) {
/*     */         
/* 117 */         if (f1 >= f) {
/*     */           break;
/*     */         }
/*     */         
/* 121 */         this.pathPoints[i] = pathpoint1;
/* 122 */         pathpoint1.index = i;
/* 123 */         i = j;
/*     */         continue;
/*     */       } 
/* 126 */       if (f2 >= f) {
/*     */         break;
/*     */       }
/*     */       
/* 130 */       this.pathPoints[i] = pathpoint2;
/* 131 */       pathpoint2.index = i;
/* 132 */       i = k;
/*     */     } 
/*     */     
/* 135 */     this.pathPoints[i] = pathpoint;
/* 136 */     pathpoint.index = i;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isPathEmpty() {
/* 141 */     return (this.count == 0);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/PathEx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */