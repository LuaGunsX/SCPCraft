/*     */ package SCPCraft.containerslots;
/*     */ 
/*     */ import SCPCraft.tileentities.SCPTileEntity914;
/*     */ import la;
/*     */ import qw;
/*     */ import qx;
/*     */ import rq;
/*     */ import rw;
/*     */ import sr;
/*     */ import ur;
/*     */ 
/*     */ public class SCPContainer914
/*     */   extends rq {
/*     */   private SCPTileEntity914 SCP914;
/*     */   private int lastCookTime;
/*     */   private int lastBurnTime;
/*     */   private int lastItemBurnTime;
/*     */   
/*     */   public SCPContainer914(qw par1InventoryPlayer, SCPTileEntity914 par2SCPTileEntity914) {
/*  20 */     this.lastCookTime = 0;
/*  21 */     this.lastBurnTime = 0;
/*  22 */     this.lastItemBurnTime = 0;
/*  23 */     this.SCP914 = par2SCPTileEntity914;
/*  24 */     a(new sr((la)par2SCPTileEntity914, 0, 8, 22));
/*  25 */     a(new sr((la)par2SCPTileEntity914, 1, 44, 22));
/*  26 */     a(new sr((la)par2SCPTileEntity914, 2, 80, 22));
/*  27 */     a(new sr((la)par2SCPTileEntity914, 3, 117, 22));
/*  28 */     a(new sr((la)par2SCPTileEntity914, 4, 153, 22));
/*  29 */     a(new SCPSlot914(par1InventoryPlayer.d, (la)par2SCPTileEntity914, 5, 80, 59));
/*     */     
/*     */     int var3;
/*  32 */     for (var3 = 0; var3 < 3; var3++) {
/*     */       
/*  34 */       for (int var4 = 0; var4 < 9; var4++)
/*     */       {
/*  36 */         a(new sr((la)par1InventoryPlayer, var4 + var3 * 9 + 9, 8 + var4 * 18, 84 + var3 * 18));
/*     */       }
/*     */     } 
/*     */     
/*  40 */     for (var3 = 0; var3 < 9; var3++)
/*     */     {
/*  42 */       a(new sr((la)par1InventoryPlayer, var3, 8 + var3 * 18, 142));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(rw par1ICrafting) {
/*  48 */     super.a(par1ICrafting);
/*  49 */     par1ICrafting.a(this, 0, this.SCP914.SCP914CookTime);
/*  50 */     par1ICrafting.a(this, 1, this.SCP914.SCP914CookTime);
/*  51 */     par1ICrafting.a(this, 2, this.SCP914.SCP914CookTime);
/*  52 */     par1ICrafting.a(this, 3, this.SCP914.SCP914CookTime);
/*  53 */     par1ICrafting.a(this, 4, this.SCP914.SCP914CookTime);
/*  54 */     par1ICrafting.a(this, 5, this.SCP914.currentItemBurnTime);
/*  55 */     par1ICrafting.a(this, 6, this.SCP914.SCP914BurnTime);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() {
/*  63 */     super.b();
/*     */     
/*  65 */     for (int i = 0; i < this.e.size(); i++) {
/*     */       
/*  67 */       rw icrafting = this.e.get(i);
/*     */       
/*  69 */       if (this.lastCookTime != this.SCP914.SCP914CookTime) {
/*     */         
/*  71 */         icrafting.a(this, 0, this.SCP914.SCP914CookTime);
/*  72 */         icrafting.a(this, 1, this.SCP914.SCP914CookTime);
/*  73 */         icrafting.a(this, 2, this.SCP914.SCP914CookTime);
/*  74 */         icrafting.a(this, 3, this.SCP914.SCP914CookTime);
/*  75 */         icrafting.a(this, 4, this.SCP914.SCP914CookTime);
/*     */       } 
/*     */       
/*  78 */       if (this.lastBurnTime != this.SCP914.SCP914BurnTime)
/*     */       {
/*  80 */         icrafting.a(this, 6, this.SCP914.SCP914BurnTime);
/*     */       }
/*     */       
/*  83 */       if (this.lastItemBurnTime != this.SCP914.currentItemBurnTime)
/*     */       {
/*  85 */         icrafting.a(this, 5, this.SCP914.currentItemBurnTime);
/*     */       }
/*     */     } 
/*     */     
/*  89 */     this.lastCookTime = this.SCP914.SCP914CookTime;
/*  90 */     this.lastBurnTime = this.SCP914.SCP914BurnTime;
/*  91 */     this.lastItemBurnTime = this.SCP914.currentItemBurnTime;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(int par1, int par2) {
/*  96 */     if (par1 == 0 || par1 == 1 || par1 == 2 || par1 == 3 || par1 == 4)
/*     */     {
/*  98 */       this.SCP914.SCP914CookTime = par2;
/*     */     }
/*     */     
/* 101 */     if (par1 == 6)
/*     */     {
/* 103 */       this.SCP914.SCP914BurnTime = par2;
/*     */     }
/*     */     
/* 106 */     if (par1 == 5)
/*     */     {
/* 108 */       this.SCP914.currentItemBurnTime = par2;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(qx var1) {
/* 114 */     return this.SCP914.a_(var1);
/*     */   }
/*     */ 
/*     */   
/*     */   public ur b(qx par1EntityPlayer, int slot_index) {
/* 119 */     ur stack = null;
/* 120 */     sr slot_object = this.c.get(slot_index);
/*     */     
/* 122 */     if (slot_object != null && slot_object.d()) {
/*     */       
/* 124 */       ur stack_in_slot = slot_object.c();
/* 125 */       stack = stack_in_slot.l();
/*     */       
/* 127 */       if (slot_index == 0 || slot_index == 1 || slot_index == 2 || slot_index == 3 || slot_index == 4 || slot_index == 5) {
/*     */         
/* 129 */         if (!a(stack_in_slot, 6, this.c.size(), false))
/*     */         {
/* 131 */           return null;
/*     */         }
/*     */       } else {
/* 134 */         return null;
/*     */       } 
/* 136 */       if (stack_in_slot.a == 0) {
/*     */         
/* 138 */         slot_object.c(null);
/*     */       }
/*     */       else {
/*     */         
/* 142 */         slot_object.e();
/*     */       } 
/*     */     } 
/* 145 */     return stack;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/containerslots/SCPContainer914.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */