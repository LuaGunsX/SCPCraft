/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import agi;
/*     */ import java.util.Random;
/*     */ import ll;
/*     */ import lm;
/*     */ import lq;
/*     */ import md;
/*     */ import qd;
/*     */ import qk;
/*     */ import qn;
/*     */ import qr;
/*     */ import yc;
/*     */ import ym;
/*     */ import yy;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPBlockCustomWater
/*     */ {
/*     */   public static class SCP354Flowing
/*     */     extends SCPBlockCustomWaterFlowing
/*     */   {
/*     */     public SCP354Flowing(int i) {
/*  27 */       super(i, mod_SCP.SCP354);
/*  28 */       this.cl = 237;
/*  29 */       a(mod_SCP.tabBlockSCP);
/*  30 */       bubbleColor(136.0D, 0.0D, 0.0D);
/*     */     }
/*     */ 
/*     */     
/*     */     public int b(ym par1iBlockAccess, int par2, int par3, int par4) {
/*  35 */       return 8523267;
/*     */     }
/*     */ 
/*     */     
/*     */     public int r_() {
/*  40 */       return 30;
/*     */     }
/*     */ 
/*     */     
/*     */     private boolean isFlammable(yc world, int i, int j, int k) {
/*  45 */       return false;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class SCP354Still
/*     */     extends SCPBlockCustomWaterStill
/*     */   {
/*     */     public SCP354Still(int i) {
/*  53 */       super(i, mod_SCP.SCP354);
/*  54 */       this.cl = 237;
/*  55 */       b(true);
/*  56 */       a(mod_SCP.tabBlockSCP);
/*  57 */       bubbleColor(136.0D, 0.0D, 0.0D);
/*     */     }
/*     */     
/*     */     public int b(ym par1iBlockAccess, int par2, int par3, int par4) {
/*  61 */       return 8523267;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(yc world, int i, int j, int k, lq entity) {
/*  66 */       if (entity instanceof qx) {
/*     */         
/*  68 */         ((md)entity).d(new lm(ll.q.H, 200, 1));
/*  69 */         ((md)entity).d(new lm(ll.s.H, 200, 0));
/*  70 */         ((md)entity).d(new lm(mod_SCP.shake.H, 100, 1));
/*  71 */         ((md)entity).d(new lm(ll.u.H, 200, 0));
/*  72 */         ((md)entity).d(new lm(ll.d.H, 200, 2));
/*  73 */         ((md)entity).d(new lm(ll.t.H, 200, 3));
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public int r_() {
/*  79 */       return 30;
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(yc world, int i, int j, int k, Random random) {
/*  84 */       yy biomegenbase = world.t().a(i, k);
/*  85 */       super.b(world, i, j, k, random);
/*  86 */       if (!world.I) {
/*     */         
/*  88 */         if (random.nextInt(600) == 0) {
/*     */           
/*  90 */           qd pigz = new qd(world);
/*  91 */           pigz.b(i, j, k, 0.0F, 0.0F);
/*  92 */           world.d((lq)pigz);
/*     */         } 
/*  94 */         if (random.nextInt(600) == 0) {
/*     */           
/*  96 */           qn pigz = new qn(world);
/*  97 */           pigz.b(i, j, k, 0.0F, 0.0F);
/*  98 */           world.d((lq)pigz);
/*     */         } 
/* 100 */         if (random.nextInt(600) == 0) {
/*     */           
/* 102 */           qk pigz = new qk(world);
/* 103 */           pigz.b(i, j, k, 0.0F, 0.0F);
/* 104 */           world.d((lq)pigz);
/*     */         } 
/* 106 */         if (random.nextInt(600) == 0) {
/*     */           
/* 108 */           qr pigz = new qr(world);
/* 109 */           pigz.b(i, j, k, 0.0F, 0.0F);
/* 110 */           world.d((lq)pigz);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     private boolean isFlammable(yc world, int i, int j, int k) {
/* 118 */       return false;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class SCP006Flowing
/*     */     extends SCPBlockCustomWaterFlowing
/*     */   {
/*     */     public SCP006Flowing(int i) {
/* 126 */       super(i, agi.h);
/* 127 */       a(mod_SCP.tabBlockSCP);
/* 128 */       bubbleColor(63.0D, 205.0D, 255.0D);
/*     */     }
/*     */ 
/*     */     
/*     */     public int b(ym par1iBlockAccess, int par2, int par3, int par4) {
/* 133 */       return 32767;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class SCP006Still
/*     */     extends SCPBlockCustomWaterStill
/*     */   {
/*     */     public SCP006Still(int i) {
/* 141 */       super(i, agi.h);
/* 142 */       a(mod_SCP.tabBlockSCP);
/* 143 */       bubbleColor(63.0D, 205.0D, 255.0D);
/*     */     }
/*     */     
/*     */     public int b(ym par1iBlockAccess, int par2, int par3, int par4) {
/* 147 */       return 32767;
/*     */     }
/*     */     
/*     */     public void a(yc world, int i, int j, int k, lq entity) {
/* 151 */       if (entity instanceof md)
/*     */       {
/* 153 */         ((md)entity).d(new lm(ll.l.H, 40, 1));
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlockCustomWater.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */