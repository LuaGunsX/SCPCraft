/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import md;
/*     */ import mt;
/*     */ import mz;
/*     */ import nc;
/*     */ import nh;
/*     */ import nk;
/*     */ import nm;
/*     */ import nn;
/*     */ import nv;
/*     */ import nw;
/*     */ import og;
/*     */ import oh;
/*     */ import qx;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity1000
/*     */   extends SCPEntity {
/*     */   public SCPEntity1000(yc par1World) {
/*  21 */     super(par1World);
/*  22 */     this.aG = "/SCPCraft/textures/mobs/1000.png";
/*  23 */     this.bH = 0.4F;
/*  24 */     this.attackStrength = 5;
/*  25 */     az().b(true);
/*  26 */     this.bn.a(0, (nc)new mz((md)this));
/*  27 */     this.bn.a(1, (nc)new mt((md)this));
/*  28 */     this.bn.a(2, (nc)new nk((md)this, qx.class, this.bH, false));
/*  29 */     this.bn.a(2, (nc)new nk((md)this, md.class, this.bH, true));
/*  30 */     this.bn.a(4, (nc)new nn(this, this.bH));
/*  31 */     this.bn.a(5, (nc)new nm(this, this.bH, false));
/*  32 */     this.bn.a(6, (nc)new nw(this, this.bH));
/*  33 */     this.bn.a(7, (nc)new nh((md)this, qx.class, 8.0F));
/*  34 */     this.bn.a(7, (nc)new nv((md)this));
/*  35 */     this.bo.a(1, (nc)new og((md)this, false));
/*  36 */     this.bo.a(2, (nc)new oh((md)this, qx.class, 16.0F, 0, true));
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  41 */     return 50;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int aW() {
/*  49 */     return 2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean be() {
/*  57 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  66 */     super.c();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aY() {
/*  74 */     return "mob.villager.default";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/*  82 */     return "mob.villager.default";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/*  90 */     return "mob.villager.default";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int bb() {
/*  98 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/* 103 */     return false;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity1000.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */