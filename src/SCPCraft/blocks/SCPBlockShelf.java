/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import SCPCraft.mod_Others;
/*     */ import SCPCraft.mod_SCP;
/*     */ import SCPCraft.tileentities.SCPTileEntityShelf;
/*     */ import agi;
/*     */ import akb;
/*     */ import amq;
/*     */ import any;
/*     */ import ke;
/*     */ import lq;
/*     */ import px;
/*     */ import qx;
/*     */ import ur;
/*     */ import yc;
/*     */ import ym;
/*     */ 
/*     */ public class SCPBlockShelf
/*     */   extends akb {
/*     */   public SCPBlockShelf(int par1, int par2, agi mat) {
/*  21 */     super(par1, par2, mat);
/*  22 */     a(mod_SCP.tabBlockSCP);
/*  23 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  28 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  33 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(yc world, int var2, int var3, int var4, qx entityplayer, int var6, float var7, float var8, float var9) {
/*  38 */     SCPTileEntityShelf te = (SCPTileEntityShelf)world.q(var2, var3, var4);
/*  39 */     ur stack = entityplayer.bJ.g();
/*  40 */     if (entityplayer.ah()) return false; 
/*  41 */     if (te != null) {
/*     */       
/*  43 */       if (te.getItem() != null) {
/*     */         
/*  45 */         if (!world.I) {
/*  46 */           px entityitem = new px(world, var2 + 0.5D, var3 + 0.5D, var4 + 0.5D, te.item);
/*  47 */           world.d((lq)entityitem);
/*     */         } 
/*  49 */         te.setItem(null);
/*     */       } 
/*  51 */       if (stack != null && stack.a > 0) {
/*     */         
/*  53 */         te.setItem(stack.l());
/*  54 */         (te.getItem()).a = stack.a;
/*  55 */         stack.a = 0;
/*  56 */         world.c(var2, var3, var4, ke.c((entityplayer.z * 4.0F / 360.0F) + 2.5D) & 0x3);
/*     */       } 
/*     */       
/*  59 */       world.a(var2, var3, var4, (any)te);
/*  60 */       world.z(var2, var3, var4);
/*  61 */       world.b(var2, var3, var4, (any)te);
/*     */     } 
/*  63 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, int par5) {
/*  68 */     SCPTileEntityShelf te = (SCPTileEntityShelf)par1World.q(par2, par3, par4);
/*  69 */     if (!par1World.I) {
/*     */       
/*  71 */       par1World.b(par2, par3, par4, (any)te);
/*  72 */       super.a(par1World, par2, par3, par4, par5);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public float f(ym par1iBlockAccess, int par2, int par3, int par4) {
/*  78 */     SCPTileEntityShelf te = (SCPTileEntityShelf)par1iBlockAccess.q(par2, par3, par4);
/*  79 */     if (te != null && te.getItem() != null)
/*     */     {
/*  81 */       if ((te.getItem()).c < 4096 && (te.getItem()).c > 0)
/*     */       {
/*  83 */         return amq.p[(te.getItem()).c].f(par1iBlockAccess, par2, par3, par4);
/*     */       }
/*     */     }
/*  86 */     return 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(yc var1, int var2, int var3, int var4, int var5, int var6) {
/*  94 */     SCPTileEntityShelf te = (SCPTileEntityShelf)var1.q(var2, var3, var4);
/*  95 */     if (te != null)
/*     */     {
/*  97 */       if (te.getItem() != null) {
/*     */         
/*  99 */         px entityitem = new px(var1, var2 + 0.5D, var3 + 0.5D, var4 + 0.5D, te.getItem());
/* 100 */         var1.d((lq)entityitem);
/* 101 */         te.setItem(null);
/*     */       } 
/*     */     }
/* 104 */     super.a(var1, var2, var3, var4, var5, var6);
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/* 109 */     return mod_Others.ShelfID;
/*     */   }
/*     */ 
/*     */   
/*     */   public any a(yc var1) {
/* 114 */     return (any)new SCPTileEntityShelf();
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlockShelf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */