/*     */ package SCPCraft.containerslots;
/*     */ 
/*     */ import SCPCraft.entities.SCPEntityButler;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import la;
/*     */ import qw;
/*     */ import qx;
/*     */ import rq;
/*     */ import rw;
/*     */ import si;
/*     */ import sr;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPContainerButler
/*     */   extends rq
/*     */ {
/*     */   private SCPEntityButler theMerchant;
/*     */   private si merchantInventory;
/*     */   private final yc theWorld;
/*     */   
/*     */   public SCPContainerButler(qw par1InventoryPlayer, SCPEntityButler par2iMerchant, yc par3World) {
/*  27 */     this.theMerchant = par2iMerchant;
/*  28 */     this.theWorld = par3World;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public si getMerchantInventory() {
/*  49 */     return this.merchantInventory;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(rw par1ICrafting) {
/*  54 */     super.a(par1ICrafting);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() {
/*  62 */     super.b();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(la par1IInventory) {
/*  70 */     this.merchantInventory.g();
/*  71 */     super.a(par1IInventory);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCurrentRecipeIndex(int par1) {
/*  76 */     this.merchantInventory.c(par1);
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void b(int par1, int par2) {}
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/*  84 */     return (par1EntityPlayer != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public ur func_82846_b(qx par1EntityPlayer, int par2) {
/*  89 */     ur var3 = null;
/*  90 */     sr var4 = this.c.get(par2);
/*     */     
/*  92 */     if (var4 != null && var4.d()) {
/*     */       
/*  94 */       ur var5 = var4.c();
/*  95 */       var3 = var5.l();
/*     */       
/*  97 */       if (par2 == 2) {
/*     */         
/*  99 */         if (!a(var5, 3, 39, true))
/*     */         {
/* 101 */           return null;
/*     */         }
/*     */         
/* 104 */         var4.a(var5, var3);
/*     */       }
/* 106 */       else if (par2 != 0 && par2 != 1) {
/*     */         
/* 108 */         if (par2 >= 3 && par2 < 30)
/*     */         {
/* 110 */           if (!a(var5, 30, 39, false))
/*     */           {
/* 112 */             return null;
/*     */           }
/*     */         }
/* 115 */         else if (par2 >= 30 && par2 < 39 && !a(var5, 3, 30, false))
/*     */         {
/* 117 */           return null;
/*     */         }
/*     */       
/* 120 */       } else if (!a(var5, 3, 39, false)) {
/*     */         
/* 122 */         return null;
/*     */       } 
/*     */       
/* 125 */       if (var5.a == 0) {
/*     */         
/* 127 */         var4.c((ur)null);
/*     */       }
/*     */       else {
/*     */         
/* 131 */         var4.e();
/*     */       } 
/*     */       
/* 134 */       if (var5.a == var3.a)
/*     */       {
/* 136 */         return null;
/*     */       }
/*     */       
/* 139 */       var4.a(par1EntityPlayer, var5);
/*     */     } 
/*     */     
/* 142 */     return var3;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/containerslots/SCPContainerButler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */