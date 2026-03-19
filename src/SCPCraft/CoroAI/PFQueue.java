/*      */ package SCPCraft.CoroAI;
/*      */ 
/*      */ import SCPCraft.c_CoroAIUtil;
/*      */ import agi;
/*      */ import ahk;
/*      */ import ahl;
/*      */ import ajx;
/*      */ import amq;
/*      */ import java.util.HashMap;
/*      */ import java.util.Iterator;
/*      */ import java.util.LinkedList;
/*      */ import java.util.Map;
/*      */ import jz;
/*      */ import ke;
/*      */ import lq;
/*      */ import md;
/*      */ import mi;
/*      */ import yc;
/*      */ import ym;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class PFQueue
/*      */   implements Runnable
/*      */ {
/*      */   public static PFQueue instance;
/*      */   public static LinkedList queue;
/*      */   public static HashMap pfDelays;
/*      */   public static boolean renderLine = true;
/*   32 */   public static long maxRequestAge = 8000L;
/*      */ 
/*      */   
/*      */   public static long maxNodeIterations;
/*      */ 
/*      */   
/*      */   public static yc worldMap;
/*      */   
/*   40 */   private PathEx path = new PathEx();
/*   41 */   private jz pointMap = new jz();
/*   42 */   private PathPointEx[] pathOptions = new PathPointEx[32];
/*      */   
/*      */   public boolean foundEnd;
/*      */   public boolean canClimb = false;
/*      */   public static boolean canUseLadder = false;
/*   47 */   public static long dropSize = 4L;
/*      */ 
/*      */   
/*   50 */   public mi entH = null;
/*      */ 
/*      */   
/*      */   private static class PFQueueItem
/*      */   {
/*      */     public int x;
/*      */     
/*      */     public int y;
/*      */     
/*      */     public int z;
/*      */     
/*      */     public float dist;
/*      */     
/*      */     public lq entSourceRef;
/*      */     
/*      */     public lq entTargRef;
/*      */     
/*      */     public int priority;
/*      */     
/*      */     public long timeCreated;
/*      */     
/*      */     public int retryState;
/*      */     
/*      */     public int maxNodeIterations;
/*      */     public boolean canClimb = false;
/*      */     public boolean canUseLadder = false;
/*      */     
/*      */     PFQueueItem(lq ent, int xx, int yy, int zz, float var2, int pri) {
/*   78 */       this.x = xx;
/*   79 */       this.y = yy;
/*   80 */       this.z = zz;
/*   81 */       this.dist = var2;
/*   82 */       this.entSourceRef = ent;
/*   83 */       this.priority = pri;
/*   84 */       this.timeCreated = System.currentTimeMillis();
/*   85 */       this.retryState = 0;
/*   86 */       this.maxNodeIterations = 15000;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public PFQueue(yc var1) {
/*   92 */     if (instance == null) {
/*   93 */       instance = this;
/*   94 */       queue = new LinkedList();
/*   95 */       pfDelays = new HashMap<Object, Object>();
/*   96 */       worldMap = var1;
/*      */ 
/*      */       
/*   99 */       (new Thread(this, "Pathfinder Thread")).start();
/*      */     } else {
/*      */       
/*  102 */       System.out.println("duplicate creation PFQueue!");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void run() {
/*      */     while (true) {
/*  110 */       manageQueue();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void manageQueue() {
/*  120 */     maxRequestAge = 2000L;
/*      */ 
/*      */     
/*      */     try {
/*  124 */       Iterator<Map.Entry> it = pfDelays.entrySet().iterator();
/*  125 */       while (it.hasNext()) {
/*  126 */         Map.Entry pairs = it.next();
/*      */         
/*  128 */         long time = ((Long)pairs.getValue()).longValue();
/*  129 */         if (time < System.currentTimeMillis() - 30000L) {
/*  130 */           pfDelays.remove(pairs.getKey());
/*      */         }
/*      */       }
/*      */     
/*      */     }
/*  135 */     catch (Exception ex) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  143 */     boolean processed = false;
/*  144 */     while (!processed && queue.size() > 0) {
/*  145 */       if (queue.size() > 0) {
/*      */         
/*  147 */         if (queue.size() > 10);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  153 */         try { this; if (((PFQueueItem)queue.get(0)).timeCreated + maxRequestAge > System.currentTimeMillis()) {
/*  154 */             processed = true;
/*  155 */             this.path.clearPath();
/*  156 */             this.pointMap.c();
/*  157 */             this.foundEnd = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*      */             try {
/*  165 */               if (((PFQueueItem)queue.get(0)).entSourceRef instanceof mi) {
/*  166 */                 this.entH = (mi)((PFQueueItem)queue.get(0)).entSourceRef;
/*      */               }
/*      */ 
/*      */               
/*  170 */               if (((PFQueueItem)queue.get(0)).entSourceRef instanceof c_IEnhAI && ((c_IEnhAI)((PFQueueItem)queue.get(0)).entSourceRef).canUseLadders()) {
/*      */                 
/*  172 */                 dropSize = 2L;
/*  173 */                 canUseLadder = true;
/*      */               }
/*      */               else {
/*      */                 
/*  177 */                 dropSize = 4L;
/*  178 */                 canUseLadder = true;
/*      */               } 
/*      */               
/*  181 */               cleanup(((PFQueueItem)queue.get(0)).entSourceRef);
/*      */ 
/*      */               
/*  184 */               maxNodeIterations = ((PFQueueItem)queue.get(0)).maxNodeIterations;
/*      */               
/*  186 */               worldMap = ((PFQueueItem)queue.get(0)).entSourceRef.p;
/*  187 */               PathEntityEx pathEnt = createEntityPathTo(((PFQueueItem)queue.get(0)).entSourceRef, ((PFQueueItem)queue.get(0)).x, ((PFQueueItem)queue.get(0)).y, ((PFQueueItem)queue.get(0)).z, ((PFQueueItem)queue.get(0)).dist);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*  194 */               if (pathEnt != null) {
/*      */                 
/*  196 */                 if (((PFQueueItem)queue.get(0)).entSourceRef instanceof c_IEnhPF) {
/*      */ 
/*      */                   
/*  199 */                   ((c_IEnhPF)((PFQueueItem)queue.get(0)).entSourceRef).setPathExToEntity(pathEnt);
/*      */                 }
/*  201 */                 else if (((PFQueueItem)queue.get(0)).entSourceRef instanceof qx) {
/*  202 */                   c_CoroAIUtil.playerPathfindCallback(pathEnt);
/*  203 */                 } else if (((PFQueueItem)queue.get(0)).entSourceRef instanceof md) {
/*  204 */                   ((md)((PFQueueItem)queue.get(0)).entSourceRef).az().a(convertToPathEntity(pathEnt), ((Float)c_CoroAIUtil.getPrivateValueBoth(md.class, ((PFQueueItem)queue.get(0)).entSourceRef, "bG", "moveSpeed")).floatValue());
/*      */                 
/*      */                 }
/*      */ 
/*      */               
/*      */               }
/*  210 */               else if (((PFQueueItem)queue.get(0)).retryState < 4) {
/*      */                 
/*  212 */                 PathPointEx[] points = new PathPointEx[1];
/*  213 */                 points[0] = new PathPointEx(((PFQueueItem)queue.get(0)).x, ((PFQueueItem)queue.get(0)).y, ((PFQueueItem)queue.get(0)).z);
/*  214 */                 ((c_IEnhPF)((PFQueueItem)queue.get(0)).entSourceRef).setPathExToEntity(new PathEntityEx(points));
/*  215 */                 ((c_IEnhPF)((PFQueueItem)queue.get(0)).entSourceRef).faceCoord(((PFQueueItem)queue.get(0)).x, ((PFQueueItem)queue.get(0)).y, ((PFQueueItem)queue.get(0)).z, 180.0F, 180.0F);
/*      */                 
/*  217 */                 md center = (md)((PFQueueItem)queue.get(0)).entSourceRef;
/*      */ 
/*      */ 
/*      */                 
/*  221 */                 float look = (worldMap.t.nextInt(90) - 45);
/*      */                 
/*  223 */                 double dist = (worldMap.t.nextInt(26) + ((PFQueueItem)queue.get(0)).retryState * 6);
/*  224 */                 int gatherX = (int)(center.t + -Math.sin(((center.z + look) / 180.0F * 3.1415927F)) * Math.cos((center.A / 180.0F * 3.1415927F)) * dist);
/*  225 */                 int gatherY = (int)(center.u - 0.5D + -ke.a(center.A / 180.0F * 3.1415927F) * dist - 0.0D);
/*  226 */                 int gatherZ = (int)(center.v + Math.cos(((center.z + look) / 180.0F * 3.1415927F)) * Math.cos((center.A / 180.0F * 3.1415927F)) * dist);
/*      */                 
/*  228 */                 int id = getBlockId(gatherX, gatherY, gatherZ);
/*      */                 
/*  230 */                 int offset = -5;
/*      */                 
/*  232 */                 while (offset < 5 && 
/*  233 */                   id != 0)
/*      */                 {
/*      */ 
/*      */                   
/*  237 */                   id = getBlockId(gatherX, gatherY + offset++, gatherZ);
/*      */                 }
/*      */                 
/*  240 */                 if (offset < 5)
/*      */                 {
/*  242 */                   PFQueueItem job = new PFQueueItem(((PFQueueItem)queue.get(0)).entSourceRef, gatherX, gatherY, gatherZ, ((PFQueueItem)queue.get(0)).dist, 0);
/*  243 */                   job.maxNodeIterations = 1000;
/*  244 */                   ((PFQueueItem)queue.get(0)).retryState++;
/*  245 */                   queue.add(job);
/*      */                 
/*      */                 }
/*      */                 else
/*      */                 {
/*  250 */                   PFQueueItem job = new PFQueueItem(((PFQueueItem)queue.get(0)).entSourceRef, gatherX, worldMap.f(gatherX, gatherZ) + 1, gatherZ, ((PFQueueItem)queue.get(0)).dist, 0);
/*  251 */                   job.maxNodeIterations = 1500;
/*  252 */                   ((PFQueueItem)queue.get(0)).retryState++;
/*  253 */                   queue.add(job);
/*      */                 }
/*      */               
/*  256 */               } else if (((PFQueueItem)queue.get(0)).entSourceRef instanceof c_IEnhPF) {
/*  257 */                 PathPointEx[] points = new PathPointEx[1];
/*  258 */                 points[0] = new PathPointEx(((PFQueueItem)queue.get(0)).x, ((PFQueueItem)queue.get(0)).y, ((PFQueueItem)queue.get(0)).z);
/*  259 */                 ((c_IEnhPF)((PFQueueItem)queue.get(0)).entSourceRef).setPathExToEntity(new PathEntityEx(points));
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*      */               }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*      */             }
/*  271 */             catch (Exception ex) {}
/*      */ 
/*      */           
/*      */           }
/*      */           else {
/*      */ 
/*      */ 
/*      */             
/*  279 */             PathPointEx[] points = new PathPointEx[1];
/*  280 */             points[0] = new PathPointEx(((PFQueueItem)queue.get(0)).x, ((PFQueueItem)queue.get(0)).y, ((PFQueueItem)queue.get(0)).z);
/*      */             
/*  282 */             if (((PFQueueItem)queue.get(0)).entSourceRef instanceof c_IEnhPF) {
/*      */               
/*  284 */               ((c_IEnhPF)((PFQueueItem)queue.get(0)).entSourceRef).setPathExToEntity(new PathEntityEx(points));
/*  285 */             } else if (((PFQueueItem)queue.get(0)).entSourceRef instanceof qx) {
/*  286 */               c_CoroAIUtil.playerPathfindCallback(new PathEntityEx(points));
/*  287 */             } else if (((PFQueueItem)queue.get(0)).entSourceRef instanceof md) {
/*  288 */               ((md)((PFQueueItem)queue.get(0)).entSourceRef).az().a(convertToPathEntity(new PathEntityEx(points)), 0.23F);
/*      */             } 
/*      */             
/*  291 */             queue.remove();
/*      */           
/*      */           }
/*      */           
/*      */            }
/*      */         
/*  297 */         catch (Exception ex)
/*      */         
/*      */         { 
/*      */           try {
/*  301 */             queue.remove();
/*  302 */           } catch (Exception ex2) {} } finally { try { queue.remove(); } catch (Exception ex2) {} }
/*      */       
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  311 */     if (processed || queue.size() == 0) {
/*      */       
/*  313 */       try { int sleep = 50 - queue.size();
/*  314 */         if (sleep < 1) sleep = 1; 
/*  315 */         Thread.sleep(sleep); } catch (Exception ex) {}
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void cleanup(lq ent) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean getPath(lq var1, lq var2, float var3) {
/*  327 */     return getPath(var1, var2, var3, 0);
/*      */   }
/*      */   
/*      */   public static boolean getPath(lq var1, lq var2, float var3, int priority) {
/*  331 */     if (var1 != null && var2 != null)
/*      */     {
/*  333 */       return tryPath(var1, ke.c(var2.t - 0.5D), (int)var2.D.b, (int)(var2.v - 1.5D), var3, priority);
/*      */     }
/*      */     
/*  336 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public static boolean getPath(lq var1, int x, int y, int z, float var2) {
/*  341 */     return getPath(var1, x, y, z, var2, 0);
/*      */   }
/*      */   
/*      */   public static boolean getPath(lq var1, int x, int y, int z, float var2, int priority) {
/*  345 */     return tryPath(var1, x, y, z, var2, priority);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean tryPath(lq var1, int x, int y, int z, float var2, int priority) {
/*  378 */     if (instance == null) {
/*  379 */       new PFQueue(var1.p);
/*      */     }
/*      */ 
/*      */     
/*  383 */     int delay = 3000 + queue.size() * 20;
/*  384 */     boolean tryPath = true;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  389 */     if (pfDelays.containsKey(var1)) {
/*  390 */       long time = ((Long)pfDelays.get(var1)).longValue();
/*      */       
/*  392 */       if (time < System.currentTimeMillis()) {
/*  393 */         pfDelays.put(var1, Long.valueOf(System.currentTimeMillis() + delay));
/*      */       } else {
/*  395 */         tryPath = false;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/*  400 */       pfDelays.put(var1, Long.valueOf(System.currentTimeMillis() + delay));
/*      */     } 
/*      */     
/*  403 */     if (tryPath || priority == -1) {
/*      */       
/*  405 */       if (priority == -1) {
/*  406 */         int hwta = 0;
/*      */       }
/*  408 */       PFQueueItem job = new PFQueueItem(var1, x, y, z, var2, priority);
/*      */       
/*      */       try {
/*  411 */         if (priority == 0) { queue.add(job); }
/*  412 */         else if (priority == -1) { queue.addFirst(job);
/*      */            }
/*      */         
/*      */         else
/*      */         
/*      */         { 
/*  418 */           int pos = 0;
/*  419 */           while (queue.size() > 0 && priority < ((PFQueueItem)queue.get(pos++)).priority); queue.add(pos, job); }
/*      */       
/*  421 */       } catch (Exception ex) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  434 */       if (var1 instanceof c_IEnhPF) {
/*  435 */         c_IEnhPF entC = (c_IEnhPF)var1;
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*  440 */       else if (var1 instanceof md) {
/*      */       
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  453 */       return true;
/*      */     } 
/*  455 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static ahl convertToPathEntity(PathEntityEx pathEx) {
/*  461 */     if (pathEx != null) {
/*  462 */       ahk[] points = new ahk[pathEx.pathLength];
/*  463 */       for (int i = 0; i < points.length; i++) {
/*  464 */         int y = (pathEx.points[i]).yCoord;
/*  465 */         int id = worldMap.a((pathEx.points[i]).xCoord, y, (pathEx.points[i]).zCoord);
/*      */ 
/*      */         
/*  468 */         if (i != 0 || id == 0 || amq.p[id] == null || (amq.p[id]).cB == agi.h);
/*      */ 
/*      */ 
/*      */         
/*  472 */         if (i == 0 || id == 0 || amq.p[id] == null || (amq.p[id]).cB == agi.h);
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  477 */         id = worldMap.a((pathEx.points[i]).xCoord, y - 1, (pathEx.points[i]).zCoord);
/*      */ 
/*      */         
/*  480 */         if (i != 0 || id == 0 || amq.p[id] == null || (amq.p[id]).cB == agi.h);
/*      */ 
/*      */ 
/*      */         
/*  484 */         if (i == 0 || id == 0 || amq.p[id] == null || (amq.p[id]).cB == agi.h);
/*      */ 
/*      */ 
/*      */         
/*  488 */         points[i] = new ahk((pathEx.points[i]).xCoord, y, (pathEx.points[i]).zCoord);
/*      */       } 
/*  490 */       return new ahl(points);
/*      */     } 
/*  492 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PathEntityEx createEntityPathTo(lq var1, lq var2, float var3) {
/*  532 */     return createEntityPathTo(var1, var2.t, var2.D.b, var2.v, var3);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PathEntityEx createEntityPathTo(lq var1, int var2, int var3, int var4, float var5) {
/*  554 */     int y = 0;
/*      */     
/*  556 */     if (getBlockId(ke.c(var1.D.a), ke.c(var1.D.b - 1.0D), ke.c(var1.D.c)) == 0);
/*      */ 
/*      */ 
/*      */     
/*  560 */     int id = getBlockId(ke.c(var1.D.a), ke.c(var1.D.b), ke.c(var1.D.c));
/*      */     
/*  562 */     if (id == amq.an.cm || id == amq.bR.cm) {
/*  563 */       y++;
/*      */     }
/*      */     
/*  566 */     return createEntityPathTo(var1, (var2 + 0.5F), (var3 + 0.5F), (var4 + 0.5F), var5, y);
/*      */   }
/*      */   
/*      */   public PathEntityEx createEntityPathTo(lq var1, double var2, double var4, double var6, float var8) {
/*  570 */     return createEntityPathTo(var1, var2, var4, var6, var8, 0);
/*      */   }
/*      */   
/*      */   public PathEntityEx createEntityPathTo(lq var1, double var2, double var4, double var6, float var8, int yOffset) {
/*  574 */     PathPointEx var9 = openPoint(ke.c(var1.D.a), ke.c(var1.D.b) + yOffset, ke.c(var1.D.c));
/*  575 */     PathPointEx var10 = openPoint(ke.c(var2 - (var1.N / 2.0F)), ke.c(var4), ke.c(var6 - (var1.N / 2.0F)));
/*  576 */     PathPointEx var11 = new PathPointEx(ke.d(var1.N + 1.0F), ke.d(var1.O + 1.0F), ke.d(var1.N + 1.0F));
/*  577 */     PathEntityEx var12 = addToPath(var1, var9, var10, var11, var8);
/*      */     
/*  579 */     if (var12 != null);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  588 */     var12 = simplifyPath(var12, var11);
/*      */     
/*  590 */     return var12;
/*      */   }
/*      */   
/*      */   private PathEntityEx addToPath(lq var1, PathPointEx var2, PathPointEx var3, PathPointEx var4, float var5) {
/*  594 */     var2.totalPathDistance = 0.0F;
/*  595 */     var2.distanceToNext = var2.distanceTo(var3);
/*  596 */     var2.distanceToTarget = var2.distanceToNext;
/*  597 */     this.path.clearPath();
/*  598 */     this.path.addPoint(var2);
/*  599 */     PathPointEx var6 = var2;
/*      */     
/*  601 */     int lookCount = 0;
/*  602 */     int sleepCount = 0;
/*      */     
/*  604 */     while (!this.path.isPathEmpty() && lookCount++ < maxNodeIterations) {
/*      */       try {
/*  606 */         if (sleepCount++ > 100) {
/*  607 */           Thread.sleep(1L);
/*      */           
/*  609 */           sleepCount = 0;
/*      */         } 
/*  611 */       } catch (Exception ex) {
/*  612 */         ex.printStackTrace();
/*      */       } 
/*  614 */       PathPointEx var7 = this.path.dequeue();
/*      */       
/*  616 */       if (var7.equals(var3)) {
/*  617 */         return createEntityPath(var2, var3);
/*      */       }
/*      */       
/*  620 */       if (var7.distanceTo(var3) < var6.distanceTo(var3)) {
/*  621 */         var6 = var7;
/*      */       }
/*      */       
/*  624 */       var7.isFirst = true;
/*  625 */       int var8 = findPathOptions(var1, var7, var4, var3, var5);
/*      */       
/*  627 */       for (int var9 = 0; var9 < var8; var9++) {
/*  628 */         PathPointEx var10 = this.pathOptions[var9];
/*  629 */         float var11 = var7.totalPathDistance + var7.distanceTo(var10);
/*      */         
/*  631 */         if (!var10.isAssigned() || var11 < var10.totalPathDistance) {
/*  632 */           var10.previous = var7;
/*  633 */           var10.totalPathDistance = var11;
/*  634 */           var10.distanceToNext = var10.distanceTo(var3);
/*      */           
/*  636 */           if (var10.isAssigned()) {
/*  637 */             this.path.changeDistance(var10, var10.totalPathDistance + var10.distanceToNext);
/*      */           } else {
/*  639 */             var10.distanceToTarget = var10.totalPathDistance + var10.distanceToNext;
/*  640 */             this.path.addPoint(var10);
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  646 */     if (Math.abs(var3.xCoord - var6.xCoord) < 2 && Math.abs(var3.yCoord - var6.yCoord) < 2 && Math.abs(var3.zCoord - var6.zCoord) < 2) {
/*  647 */       this.foundEnd = true;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  652 */     if (var6 == var2) {
/*  653 */       return null;
/*      */     }
/*  655 */     return createEntityPath(var2, var6);
/*      */   }
/*      */ 
/*      */   
/*      */   private int findPathOptions(lq var1, PathPointEx var2, PathPointEx var3, PathPointEx var4, float var5) {
/*  660 */     int var6 = 0;
/*  661 */     byte var7 = 0;
/*      */     
/*  663 */     if (getVerticalOffset(var1, var2.xCoord, var2.yCoord + 1, var2.zCoord, var3) == 1) {
/*  664 */       var7 = 1;
/*      */     }
/*      */     
/*  667 */     PathPointEx var8 = getSafePoint(var1, var2.xCoord, var2.yCoord, var2.zCoord + 1, var3, var7);
/*  668 */     PathPointEx var9 = getSafePoint(var1, var2.xCoord - 1, var2.yCoord, var2.zCoord, var3, var7);
/*  669 */     PathPointEx var10 = getSafePoint(var1, var2.xCoord + 1, var2.yCoord, var2.zCoord, var3, var7);
/*  670 */     PathPointEx var11 = getSafePoint(var1, var2.xCoord, var2.yCoord, var2.zCoord - 1, var3, var7);
/*      */     
/*  672 */     if (var8 != null && !var8.isFirst && var8.distanceTo(var4) < var5) {
/*  673 */       this.pathOptions[var6++] = var8;
/*      */     }
/*      */     
/*  676 */     if (var9 != null && !var9.isFirst && var9.distanceTo(var4) < var5) {
/*  677 */       this.pathOptions[var6++] = var9;
/*      */     }
/*      */     
/*  680 */     if (var10 != null && !var10.isFirst && var10.distanceTo(var4) < var5) {
/*  681 */       this.pathOptions[var6++] = var10;
/*      */     }
/*      */     
/*  684 */     if (var11 != null && !var11.isFirst && var11.distanceTo(var4) < var5) {
/*  685 */       this.pathOptions[var6++] = var11;
/*      */     }
/*      */ 
/*      */     
/*  689 */     if (this.canClimb) {
/*  690 */       PathPointEx vvar8 = getClimbPoint(var1, var2.xCoord, var2.yCoord, var2.zCoord + 1, var3, var7, var2.xCoord, var2.zCoord);
/*  691 */       PathPointEx vvar9 = getClimbPoint(var1, var2.xCoord - 1, var2.yCoord, var2.zCoord, var3, var7, var2.xCoord, var2.zCoord);
/*  692 */       PathPointEx vvar10 = getClimbPoint(var1, var2.xCoord + 1, var2.yCoord, var2.zCoord, var3, var7, var2.xCoord, var2.zCoord);
/*  693 */       PathPointEx vvar11 = getClimbPoint(var1, var2.xCoord, var2.yCoord, var2.zCoord - 1, var3, var7, var2.xCoord, var2.zCoord);
/*      */       
/*  695 */       if (vvar8 != null && !vvar8.isFirst && vvar8.distanceTo(var4) < var5) {
/*  696 */         this.pathOptions[var6++] = vvar8;
/*      */       }
/*      */       
/*  699 */       if (vvar9 != null && !vvar9.isFirst && vvar9.distanceTo(var4) < var5) {
/*  700 */         this.pathOptions[var6++] = vvar9;
/*      */       }
/*      */       
/*  703 */       if (vvar10 != null && !vvar10.isFirst && vvar10.distanceTo(var4) < var5) {
/*  704 */         this.pathOptions[var6++] = vvar10;
/*      */       }
/*      */       
/*  707 */       if (vvar11 != null && !vvar11.isFirst && vvar11.distanceTo(var4) < var5) {
/*  708 */         this.pathOptions[var6++] = vvar11;
/*      */       }
/*      */     } 
/*      */     
/*  712 */     if (canUseLadder && 
/*  713 */       getBlockId(var2.xCoord, var2.yCoord, var2.zCoord) == amq.aI.cm) {
/*  714 */       PathPointEx vvar8 = getLadderPoint(var1, var2.xCoord, var2.yCoord, var2.zCoord + 1, var3, var7, var2.xCoord, var2.zCoord);
/*  715 */       PathPointEx vvar9 = getLadderPoint(var1, var2.xCoord - 1, var2.yCoord, var2.zCoord, var3, var7, var2.xCoord, var2.zCoord);
/*  716 */       PathPointEx vvar10 = getLadderPoint(var1, var2.xCoord + 1, var2.yCoord, var2.zCoord, var3, var7, var2.xCoord, var2.zCoord);
/*  717 */       PathPointEx vvar11 = getLadderPoint(var1, var2.xCoord, var2.yCoord, var2.zCoord - 1, var3, var7, var2.xCoord, var2.zCoord);
/*      */       
/*  719 */       if (vvar8 != null && !vvar8.isFirst && vvar8.distanceTo(var4) < var5) {
/*  720 */         this.pathOptions[var6++] = vvar8;
/*      */       }
/*      */       
/*  723 */       if (vvar9 != null && !vvar9.isFirst && vvar9.distanceTo(var4) < var5) {
/*  724 */         this.pathOptions[var6++] = vvar9;
/*      */       }
/*      */       
/*  727 */       if (vvar10 != null && !vvar10.isFirst && vvar10.distanceTo(var4) < var5) {
/*  728 */         this.pathOptions[var6++] = vvar10;
/*      */       }
/*      */       
/*  731 */       if (vvar11 != null && !vvar11.isFirst && vvar11.distanceTo(var4) < var5) {
/*  732 */         this.pathOptions[var6++] = vvar11;
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/*  737 */     return var6;
/*      */   }
/*      */   
/*      */   private PathPointEx getLadderPoint(lq var1, int x, int y, int z, PathPointEx var5, int var6, int origX, int origZ) {
/*  741 */     PathPointEx var7 = null;
/*      */     
/*  743 */     if (getVerticalOffset(var1, x, y, z, var5) == 1) {
/*  744 */       var7 = openPoint(x, y, z);
/*      */     }
/*      */     
/*  747 */     if (var7 == null && var6 > 0 && getVerticalOffset(var1, x, y + var6, z, var5) == 1) {
/*  748 */       var7 = openPoint(x, y + var6, z);
/*  749 */       y += var6;
/*      */     } 
/*      */     
/*  752 */     if (var7 == null) {
/*  753 */       int var8 = 0;
/*  754 */       int var9 = 0;
/*  755 */       int var10 = 0;
/*      */ 
/*      */       
/*  758 */       while (y > 0 && y < 128 && (var9 = getVerticalOffset(var1, x, y + 1, z, var5)) == 0 && getBlockId(origX, y + 1, origZ) == amq.aI.cm) {
/*  759 */         var10 = getVerticalOffset(var1, origX, y + 1, origZ, var5);
/*  760 */         var8++;
/*      */ 
/*      */ 
/*      */         
/*  764 */         y++;
/*      */         
/*  766 */         if (y > 0 && y < 128) {
/*  767 */           var7 = openPoint(x, y, z);
/*      */         }
/*      */       } 
/*      */       
/*  771 */       if (var10 != 1) {
/*  772 */         return null;
/*      */       }
/*      */       
/*  775 */       if (var9 == -2) {
/*  776 */         return null;
/*      */       }
/*      */     } 
/*      */     
/*  780 */     return var7;
/*      */   }
/*      */   
/*      */   private PathPointEx getClimbPoint(lq var1, int x, int y, int z, PathPointEx var5, int var6, int origX, int origZ) {
/*  784 */     PathPointEx var7 = null;
/*      */     
/*  786 */     if (getVerticalOffset(var1, x, y, z, var5) == 1) {
/*  787 */       var7 = openPoint(x, y, z);
/*      */     }
/*      */     
/*  790 */     if (var7 == null && var6 > 0 && getVerticalOffset(var1, x, y + var6, z, var5) == 1) {
/*  791 */       var7 = openPoint(x, y + var6, z);
/*  792 */       y += var6;
/*      */     } 
/*      */     
/*  795 */     if (var7 == null) {
/*  796 */       int var8 = 0;
/*  797 */       int var9 = 0;
/*  798 */       int var10 = 0;
/*      */ 
/*      */       
/*  801 */       while (y > 0 && y < 128 && (var9 = getVerticalOffset(var1, x, y, z, var5)) == 0 && (var10 = getVerticalOffset(var1, origX, y, origZ, var5)) == 1) {
/*      */         
/*  803 */         var8++;
/*      */         
/*  805 */         if (var8 >= 30) {
/*  806 */           return null;
/*      */         }
/*      */         
/*  809 */         y++;
/*      */         
/*  811 */         if (y > 0 && y < 128) {
/*  812 */           var7 = openPoint(x, y, z);
/*      */         }
/*      */       } 
/*      */       
/*  816 */       if (var10 != 1) {
/*  817 */         return null;
/*      */       }
/*      */       
/*  820 */       if (var9 == -2) {
/*  821 */         return null;
/*      */       }
/*      */     } 
/*      */     
/*  825 */     return var7;
/*      */   }
/*      */   
/*      */   private PathPointEx getSafePoint(lq var1, int var2, int var3, int var4, PathPointEx var5, int var6) {
/*  829 */     PathPointEx var7 = null;
/*      */     
/*  831 */     if (getVerticalOffset(var1, var2, var3, var4, var5) == 1) {
/*  832 */       var7 = openPoint(var2, var3, var4);
/*      */     }
/*      */     
/*  835 */     if (var7 == null && var6 > 0 && getVerticalOffset(var1, var2, var3 + var6, var4, var5) == 1) {
/*  836 */       var7 = openPoint(var2, var3 + var6, var4);
/*  837 */       var3 += var6;
/*      */     } 
/*      */     
/*  840 */     if (var7 != null) {
/*  841 */       int var8 = 0;
/*  842 */       int var9 = 0;
/*      */       
/*  844 */       while (var3 > 0 && (var9 = getVerticalOffset(var1, var2, var3 - 1, var4, var5)) == 1) {
/*  845 */         var8++;
/*      */         
/*  847 */         if (var8 >= dropSize) {
/*  848 */           return null;
/*      */         }
/*      */         
/*  851 */         var3--;
/*      */         
/*  853 */         if (var3 > 0) {
/*  854 */           var7 = openPoint(var2, var3, var4);
/*      */         }
/*      */       } 
/*      */       
/*  858 */       if (var9 == -2) {
/*  859 */         return null;
/*      */       }
/*      */     } 
/*      */     
/*  863 */     return var7;
/*      */   }
/*      */   
/*      */   private final PathPointEx openPoint(int var1, int var2, int var3) {
/*  867 */     int var4 = PathPointEx.makeHash(var1, var2, var3);
/*  868 */     PathPointEx var5 = (PathPointEx)this.pointMap.a(var4);
/*      */     
/*  870 */     if (var5 == null) {
/*  871 */       var5 = new PathPointEx(var1, var2, var3);
/*  872 */       this.pointMap.a(var4, var5);
/*      */     } 
/*      */     
/*  875 */     return var5;
/*      */   }
/*      */   
/*      */   private int getVerticalOffset(lq var1, int var2, int var3, int var4, PathPointEx var5) {
/*  879 */     for (int var6 = var2; var6 < var2 + var5.xCoord; var6++) {
/*  880 */       for (int var7 = var3; var7 < var3 + var5.yCoord; var7++) {
/*  881 */         for (int var8 = var4; var8 < var4 + var5.zCoord; var8++) {
/*  882 */           int var9 = getBlockId(var6, var7, var8);
/*      */           
/*  884 */           if (var9 > 0) {
/*  885 */             if (var9 != amq.aO.cm && var9 != amq.aH.cm) {
/*  886 */               if (var9 == amq.bc.cm || var9 == amq.bE.cm || var9 == amq.ce.cm) {
/*  887 */                 return -2;
/*      */               }
/*      */               
/*  890 */               agi var11 = (amq.p[var9]).cB;
/*  891 */               amq block = amq.p[var9];
/*  892 */               int meta = worldMap.h(var2, var3, var4);
/*      */ 
/*      */               
/*  895 */               int noOverrideID = -66;
/*      */               
/*  897 */               if (var1 instanceof c_IEnhAI) {
/*  898 */                 int override = ((c_IEnhAI)var1).overrideBlockPathOffset((c_IEnhAI)var1, var9, meta, var2, var3, var4);
/*      */                 
/*  900 */                 if (override != noOverrideID) {
/*  901 */                   return override;
/*      */                 }
/*      */               }
/*  904 */               else if (c_CoroAIUtil.isNoPathBlock(var1, var9, meta)) {
/*  905 */                 return 2;
/*      */               } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*  917 */               if (var11 == agi.q) {
/*  918 */                 return 1;
/*      */               }
/*      */               
/*  921 */               if (var9 == amq.aP.cm || var9 == amq.aN.cm) {
/*  922 */                 return 1;
/*      */               }
/*      */ 
/*      */ 
/*      */               
/*  927 */               if (var11.a()) {
/*  928 */                 return 0;
/*      */               }
/*      */               
/*  931 */               if (block != null && block instanceof aky) {
/*  932 */                 return -2;
/*      */               }
/*      */               
/*  935 */               if (var11 == agi.h) {
/*  936 */                 return -1;
/*      */               }
/*      */               
/*  939 */               if (var11 == agi.i || var11 == agi.y) {
/*  940 */                 return -2;
/*      */               
/*      */               }
/*      */             
/*      */             }
/*  945 */             else if (!((ajx)amq.aH).a_((ym)var1.p, var6, var7, var8)) {
/*  946 */               return -2;
/*      */             } 
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  954 */     return 1;
/*      */   }
/*      */   
/*      */   private PathEntityEx createEntityPath(PathPointEx var1, PathPointEx var2) {
/*  958 */     int var3 = 1;
/*      */     
/*      */     PathPointEx var4;
/*  961 */     for (var4 = var2; var4.previous != null; var4 = var4.previous) {
/*  962 */       var3++;
/*      */     }
/*      */     
/*  965 */     PathPointEx[] var5 = new PathPointEx[var3];
/*  966 */     var4 = var2;
/*  967 */     var3--;
/*      */     
/*  969 */     for (var5[var3] = var2; var4.previous != null; var5[var3] = var4) {
/*  970 */       var4 = var4.previous;
/*  971 */       var3--;
/*      */     } 
/*      */     
/*  974 */     return new PathEntityEx(var5);
/*      */   }
/*      */ 
/*      */   
/*      */   public PathEntityEx simplifyPath(PathEntityEx pathentity, PathPointEx pathpoint) {
/*  979 */     if (pathentity == null)
/*      */     {
/*  981 */       return pathentity;
/*      */     }
/*  983 */     LinkedList<PathPointEx> linkedlist = new LinkedList();
/*  984 */     PathPointEx pathpoint1 = null;
/*  985 */     PathPointEx pathpoint2 = null;
/*  986 */     PathPointEx pathpoint3 = null;
/*      */     
/*  988 */     PathPointEx[] apathpoint = pathentity.points;
/*  989 */     int j = apathpoint.length;
/*      */     
/*  991 */     int sleepCount = 0;
/*      */     
/*  993 */     for (int k = 0; k < j; k++) {
/*      */       
/*      */       try {
/*  996 */         if (sleepCount++ > 10) {
/*  997 */           Thread.sleep(1L);
/*  998 */           sleepCount = 0;
/*      */         } 
/* 1000 */       } catch (Exception ex) {
/* 1001 */         ex.printStackTrace();
/*      */       } 
/* 1003 */       PathPointEx pathpoint4 = apathpoint[k];
/* 1004 */       if (pathpoint1 == null) {
/*      */         
/* 1006 */         pathpoint1 = pathpoint4;
/* 1007 */         linkedlist.add(pathpoint4);
/*      */       
/*      */       }
/* 1010 */       else if (pathpoint2 == null) {
/*      */         
/* 1012 */         if (pathpoint1.yCoord != pathpoint4.yCoord) {
/*      */           
/* 1014 */           pathpoint1 = pathpoint4;
/* 1015 */           linkedlist.add(pathpoint4);
/*      */         } else {
/*      */           
/* 1018 */           pathpoint2 = pathpoint4;
/*      */         }
/*      */       
/*      */       }
/* 1022 */       else if (pathpoint2.yCoord != pathpoint4.yCoord) {
/*      */         
/* 1024 */         linkedlist.add(pathpoint2);
/* 1025 */         linkedlist.add(pathpoint4);
/* 1026 */         pathpoint1 = pathpoint4;
/* 1027 */         pathpoint2 = null;
/*      */       } else {
/*      */         
/* 1030 */         int l = pathpoint4.xCoord - pathpoint1.xCoord;
/* 1031 */         int i1 = pathpoint4.zCoord - pathpoint1.zCoord;
/* 1032 */         if (Math.abs(l) < Math.abs(i1)) {
/*      */           
/* 1034 */           float f = 0.0F;
/* 1035 */           float f2 = l / Math.abs(i1);
/* 1036 */           byte byte0 = 1;
/* 1037 */           if (i1 < 0)
/*      */           {
/* 1039 */             byte0 = -1;
/*      */           }
/* 1041 */           for (int j1 = 1; j1 < Math.abs(i1); j1++) {
/*      */             
/* 1043 */             if (getVerticalOffset(null, pathpoint1.xCoord + (int)f, pathpoint1.yCoord, pathpoint1.zCoord + j1 * byte0, pathpoint) != 1 || getVerticalOffset(null, pathpoint1.xCoord + (int)f, pathpoint1.yCoord - 1, pathpoint1.zCoord + j1 * byte0, pathpoint) == 1 || getVerticalOffset(null, pathpoint1.xCoord + (int)f + 1, pathpoint1.yCoord, pathpoint1.zCoord + j1 * byte0, pathpoint) != 1 || getVerticalOffset(null, pathpoint1.xCoord + (int)f + 1, pathpoint1.yCoord - 1, pathpoint1.zCoord + j1 * byte0, pathpoint) == 1 || getVerticalOffset(null, pathpoint1.xCoord + (int)f - 1, pathpoint1.yCoord, pathpoint1.zCoord + j1 * byte0, pathpoint) != 1 || getVerticalOffset(null, pathpoint1.xCoord + (int)f - 1, pathpoint1.yCoord - 1, pathpoint1.zCoord + j1 * byte0, pathpoint) == 1) {
/*      */               
/* 1045 */               pathpoint1 = pathpoint2;
/* 1046 */               linkedlist.add(pathpoint2);
/* 1047 */               pathpoint2 = pathpoint4;
/*      */             } else {
/*      */               
/* 1050 */               f += f2;
/*      */             }
/*      */           
/*      */           } 
/*      */         } else {
/*      */           
/* 1056 */           float f1 = 0.0F;
/* 1057 */           float f3 = i1 / Math.abs(l);
/* 1058 */           byte byte1 = 1;
/* 1059 */           if (l < 0)
/*      */           {
/* 1061 */             byte1 = -1;
/*      */           }
/* 1063 */           for (int k1 = 1; k1 < Math.abs(l); k1++) {
/*      */             
/* 1065 */             if (getVerticalOffset(null, pathpoint1.xCoord + k1 * byte1, pathpoint1.yCoord, pathpoint1.zCoord + (int)f1, pathpoint) != 1 || getVerticalOffset(null, pathpoint1.xCoord + k1 * byte1, pathpoint1.yCoord - 1, pathpoint1.zCoord + (int)f1, pathpoint) == 1 || getVerticalOffset(null, pathpoint1.xCoord + k1 * byte1, pathpoint1.yCoord, pathpoint1.zCoord + (int)f1 + 1, pathpoint) != 1 || getVerticalOffset(null, pathpoint1.xCoord + k1 * byte1, pathpoint1.yCoord - 1, pathpoint1.zCoord + (int)f1 + 1, pathpoint) == 1 || getVerticalOffset(null, pathpoint1.xCoord + k1 * byte1, pathpoint1.yCoord, pathpoint1.zCoord + (int)f1 - 1, pathpoint) != 1 || getVerticalOffset(null, pathpoint1.xCoord + k1 * byte1, pathpoint1.yCoord - 1, pathpoint1.zCoord + (int)f1 - 1, pathpoint) == 1) {
/*      */               
/* 1067 */               pathpoint1 = pathpoint2;
/* 1068 */               linkedlist.add(pathpoint2);
/* 1069 */               pathpoint2 = pathpoint4;
/*      */             } else {
/*      */               
/* 1072 */               f1 += f3;
/*      */             } 
/*      */           } 
/*      */         } 
/*      */         
/* 1077 */         pathpoint3 = pathpoint4;
/*      */       } 
/*      */     } 
/* 1080 */     if (pathpoint3 != null) {
/*      */       
/* 1082 */       linkedlist.add(pathpoint3);
/*      */     }
/* 1084 */     else if (pathpoint2 != null) {
/*      */       
/* 1086 */       linkedlist.add(pathpoint2);
/*      */     } 
/* 1088 */     int i = 0;
/* 1089 */     PathPointEx[] apathpoint1 = new PathPointEx[linkedlist.size()];
/* 1090 */     for (Iterator<PathPointEx> iterator = linkedlist.iterator(); iterator.hasNext(); ) {
/*      */       
/* 1092 */       PathPointEx pathpoint5 = iterator.next();
/* 1093 */       apathpoint1[i++] = pathpoint5;
/*      */     } 
/* 1095 */     return new PathEntityEx(apathpoint1);
/*      */   }
/*      */   
/*      */   private int getBlockId(int x, int y, int z) {
/* 1099 */     if (!worldMap.d(x, 0, z, x, 128, z)) return 10; 
/* 1100 */     return worldMap.a(x, y, z);
/*      */   }
/*      */   
/*      */   private int getBlockMetadata(int x, int y, int z) {
/* 1104 */     if (!worldMap.d(x, 0, z, x, 128, z)) return 0; 
/* 1105 */     return worldMap.h(x, y, z);
/*      */   }
/*      */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/CoroAI/PFQueue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */