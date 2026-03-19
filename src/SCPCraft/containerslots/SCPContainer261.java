/*     */ package SCPCraft.containerslots;
/*     */ 
/*     */ import SCPCraft.tileentities.SCPTileEntity261;
/*     */ import la;
/*     */ import qw;
/*     */ import qx;
/*     */ import rq;
/*     */ import rw;
/*     */ import sr;
/*     */ import ur;
/*     */ 
/*     */ public class SCPContainer261
/*     */   extends rq {
/*     */   private SCPTileEntity261 SCP261;
/*     */   private int lastCookTime;
/*     */   private int lastBurnTime;
/*     */   private int lastItemBurnTime;
/*     */   
/*     */   public SCPContainer261(qw par1InventoryPlayer, SCPTileEntity261 par2SCPTileEntity261) {
/*  20 */     this.lastCookTime = 0;
/*  21 */     this.lastBurnTime = 0;
/*  22 */     this.lastItemBurnTime = 0;
/*  23 */     this.SCP261 = par2SCPTileEntity261;
/*  24 */     a(new sr((la)par2SCPTileEntity261, 0, 56, 34));
/*  25 */     a(new SCPSlot261(par1InventoryPlayer.d, (la)par2SCPTileEntity261, 2, 116, 35));
/*     */     
/*  27 */     for (int i = 0; i < 3; i++) {
/*     */       
/*  29 */       for (int k = 0; k < 9; k++)
/*     */       {
/*  31 */         a(new sr((la)par1InventoryPlayer, k + i * 9 + 9, 8 + k * 18, 84 + i * 18));
/*     */       }
/*     */     } 
/*     */     
/*  35 */     for (int j = 0; j < 9; j++)
/*     */     {
/*  37 */       a(new sr((la)par1InventoryPlayer, j, 8 + j * 18, 142));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() {
/*  46 */     super.b();
/*     */     
/*  48 */     for (int i = 0; i < this.e.size(); i++) {
/*     */       
/*  50 */       rw icrafting = this.e.get(i);
/*     */       
/*  52 */       if (this.lastCookTime != this.SCP261.SCP261CookTime)
/*     */       {
/*  54 */         icrafting.a(this, 0, this.SCP261.SCP261CookTime);
/*     */       }
/*     */       
/*  57 */       if (this.lastBurnTime != this.SCP261.SCP261BurnTime)
/*     */       {
/*  59 */         icrafting.a(this, 1, this.SCP261.SCP261BurnTime);
/*     */       }
/*     */       
/*  62 */       if (this.lastItemBurnTime != this.SCP261.currentItemBurnTime)
/*     */       {
/*  64 */         icrafting.a(this, 2, this.SCP261.currentItemBurnTime);
/*     */       }
/*     */     } 
/*     */     
/*  68 */     this.lastCookTime = this.SCP261.SCP261CookTime;
/*  69 */     this.lastBurnTime = this.SCP261.SCP261BurnTime;
/*  70 */     this.lastItemBurnTime = this.SCP261.currentItemBurnTime;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(int par1, int par2) {
/*  75 */     if (par1 == 0)
/*     */     {
/*  77 */       this.SCP261.SCP261CookTime = par2;
/*     */     }
/*     */     
/*  80 */     if (par1 == 1)
/*     */     {
/*  82 */       this.SCP261.SCP261BurnTime = par2;
/*     */     }
/*     */     
/*  85 */     if (par1 == 2)
/*     */     {
/*  87 */       this.SCP261.currentItemBurnTime = par2;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/*  93 */     return this.SCP261.a_(par1EntityPlayer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ur b(qx par1EntityPlayer, int slot_index) {
/* 102 */     ur stack = null;
/* 103 */     sr slot_object = this.c.get(slot_index);
/*     */     
/* 105 */     if (slot_object != null && slot_object.d()) {
/*     */       
/* 107 */       ur stack_in_slot = slot_object.c();
/* 108 */       stack = stack_in_slot.l();
/*     */       
/* 110 */       if (slot_index == 0 || slot_index == 1) {
/*     */         
/* 112 */         if (!a(stack_in_slot, 2, this.c.size(), false))
/*     */         {
/* 114 */           return null;
/*     */         }
/*     */       }
/*     */       else {
/*     */         
/* 119 */         if (((sr)this.c.get(0)).d() || !((sr)this.c.get(0)).a(stack_in_slot))
/*     */         {
/* 121 */           return null;
/*     */         }
/*     */         
/* 124 */         if (stack_in_slot.a >= 16) {
/*     */           
/* 126 */           ((sr)this.c.get(0)).c(new ur(stack_in_slot.c, 16, stack_in_slot.j()));
/* 127 */           stack_in_slot.a -= 16;
/*     */         }
/*     */         else {
/*     */           
/* 131 */           ((sr)this.c.get(0)).c(new ur(stack_in_slot.c, stack_in_slot.a, stack_in_slot.j()));
/* 132 */           stack_in_slot.a -= stack_in_slot.a;
/*     */         } 
/*     */       } 
/*     */       
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


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/containerslots/SCPContainer261.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */