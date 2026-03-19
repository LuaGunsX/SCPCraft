/*     */ package SCPCraft.containerslots;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import SCPCraft.recipes.SCPDocumentManager;
/*     */ import la;
/*     */ import qw;
/*     */ import qx;
/*     */ import rq;
/*     */ import ry;
/*     */ import sp;
/*     */ import sq;
/*     */ import sr;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public class SCPContainerDocument
/*     */   extends rq
/*     */ {
/*     */   public ry craftMatrix;
/*     */   public la craftResult;
/*     */   private yc worldObj;
/*     */   private int posX;
/*     */   private int posY;
/*     */   private int posZ;
/*     */   
/*     */   public SCPContainerDocument(qw inventoryplayer, yc world, int i, int j, int k) {
/*  27 */     this.craftMatrix = new ry(this, 2, 2);
/*  28 */     this.craftResult = (la)new sp();
/*  29 */     this.worldObj = world;
/*  30 */     this.posX = i;
/*  31 */     this.posY = j;
/*  32 */     this.posZ = k;
/*  33 */     a((sr)new sq(inventoryplayer.d, (la)this.craftMatrix, this.craftResult, 0, 99, 36));
/*  34 */     a(new sr((la)this.craftMatrix, 1, 63, 18));
/*  35 */     a(new sr((la)this.craftMatrix, 2, 63, 54));
/*     */     
/*  37 */     for (int l = 0; l < 3; l++) {
/*     */       
/*  39 */       for (int j1 = 0; j1 < 9; j1++)
/*     */       {
/*  41 */         a(new sr((la)inventoryplayer, j1 + l * 9 + 9, 8 + j1 * 18, 84 + l * 18));
/*     */       }
/*     */     } 
/*     */     
/*  45 */     for (int i1 = 0; i1 < 9; i1++)
/*     */     {
/*  47 */       a(new sr((la)inventoryplayer, i1, 8 + i1 * 18, 142));
/*     */     }
/*     */     
/*  50 */     a((la)this.craftMatrix);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(la iinventory) {
/*  58 */     this.craftResult.a(0, SCPDocumentManager.getInstance().func_82787_a(this.craftMatrix, this.worldObj));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(qx par1EntityPlayer) {
/*  66 */     super.b(par1EntityPlayer);
/*  67 */     for (int var2 = 0; var2 < 3; var2++) {
/*     */       
/*  69 */       ur var3 = this.craftMatrix.a_(var2);
/*     */       
/*  71 */       if (var3 != null)
/*     */       {
/*  73 */         par1EntityPlayer.c(var3);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/*  80 */     return (this.worldObj.a(this.posX, this.posY, this.posZ) != mod_SCP.DocumentTable.cm) ? false : ((par1EntityPlayer.e(this.posX + 0.5D, this.posY + 0.5D, this.posZ + 0.5D) <= 64.0D));
/*     */   }
/*     */ 
/*     */   
/*     */   public ur func_82846_b(qx par1EntityPlayer, int par2) {
/*  85 */     ur var3 = null;
/*  86 */     sr var4 = this.c.get(par2);
/*     */     
/*  88 */     if (var4 != null && var4.d()) {
/*     */       
/*  90 */       ur var5 = var4.c();
/*  91 */       var3 = var5.l();
/*     */       
/*  93 */       if (par2 == 0 || par2 == 1 || par2 == 2) {
/*     */         
/*  95 */         if (!a(var5, 6, this.c.size(), false))
/*     */         {
/*  97 */           return null;
/*     */         }
/*     */         
/* 100 */         var4.a(var5, var3);
/*     */       }
/* 102 */       else if (par2 != 1 && par2 != 2) {
/*     */         
/* 104 */         if (!a(var5, 1, 2, false) && !a(var5, 2, 3, false))
/*     */         {
/* 106 */           return null;
/*     */         }
/*     */       } 
/*     */       
/* 110 */       if (var5.a == 0) {
/*     */         
/* 112 */         var4.c((ur)null);
/*     */       }
/*     */       else {
/*     */         
/* 116 */         var4.e();
/*     */       } 
/*     */       
/* 119 */       if (var5.a == var3.a)
/*     */       {
/* 121 */         return null;
/*     */       }
/*     */       
/* 124 */       var4.a(par1EntityPlayer, var5);
/*     */     } 
/*     */     
/* 127 */     return var3;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/containerslots/SCPContainerDocument.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */