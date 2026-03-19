/*     */ package SCPCraft.containerslots;
/*     */ 
/*     */ import SCPCraft.tileentities.SCPTileEntity294;
/*     */ import la;
/*     */ import qw;
/*     */ import qx;
/*     */ import rq;
/*     */ import rw;
/*     */ import sr;
/*     */ import ur;
/*     */ 
/*     */ public class SCPContainer294
/*     */   extends rq {
/*     */   private SCPTileEntity294 SCP294;
/*     */   private int lastCookTime;
/*     */   private int lastBurnTime;
/*     */   private int lastItemBurnTime;
/*     */   
/*     */   public SCPContainer294(qw par1InventoryPlayer, SCPTileEntity294 par2SCPTileEntity294) {
/*  20 */     this.lastCookTime = 0;
/*  21 */     this.lastBurnTime = 0;
/*  22 */     this.lastItemBurnTime = 0;
/*  23 */     this.SCP294 = par2SCPTileEntity294;
/*  24 */     a(new sr((la)par2SCPTileEntity294, 0, 56, 34));
/*  25 */     a(new SCPSlot294(par1InventoryPlayer.d, (la)par2SCPTileEntity294, 2, 116, 35));
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
/*  52 */       if (this.lastCookTime != this.SCP294.SCP294CookTime)
/*     */       {
/*  54 */         icrafting.a(this, 0, this.SCP294.SCP294CookTime);
/*     */       }
/*     */       
/*  57 */       if (this.lastBurnTime != this.SCP294.SCP294BurnTime)
/*     */       {
/*  59 */         icrafting.a(this, 1, this.SCP294.SCP294BurnTime);
/*     */       }
/*     */       
/*  62 */       if (this.lastItemBurnTime != this.SCP294.currentItemBurnTime)
/*     */       {
/*  64 */         icrafting.a(this, 2, this.SCP294.currentItemBurnTime);
/*     */       }
/*     */     } 
/*     */     
/*  68 */     this.lastCookTime = this.SCP294.SCP294CookTime;
/*  69 */     this.lastBurnTime = this.SCP294.SCP294BurnTime;
/*  70 */     this.lastItemBurnTime = this.SCP294.currentItemBurnTime;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(int par1, int par2) {
/*  75 */     if (par1 == 0)
/*     */     {
/*  77 */       this.SCP294.SCP294CookTime = par2;
/*     */     }
/*     */     
/*  80 */     if (par1 == 1)
/*     */     {
/*  82 */       this.SCP294.SCP294BurnTime = par2;
/*     */     }
/*     */     
/*  85 */     if (par1 == 2)
/*     */     {
/*  87 */       this.SCP294.currentItemBurnTime = par2;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(qx var1) {
/*  93 */     return this.SCP294.a_(var1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ur b(qx par1EntityPlayer, int slot_index) {
/* 101 */     ur stack = null;
/* 102 */     sr slot_object = this.c.get(slot_index);
/*     */     
/* 104 */     if (slot_object != null && slot_object.d()) {
/*     */       
/* 106 */       ur stack_in_slot = slot_object.c();
/* 107 */       stack = stack_in_slot.l();
/*     */       
/* 109 */       if (slot_index == 0 || slot_index == 1) {
/*     */         
/* 111 */         if (!a(stack_in_slot, 2, this.c.size(), false))
/*     */         {
/* 113 */           return null;
/*     */         }
/*     */       }
/*     */       else {
/*     */         
/* 118 */         if (((sr)this.c.get(0)).d() || !((sr)this.c.get(0)).a(stack_in_slot))
/*     */         {
/* 120 */           return null;
/*     */         }
/*     */         
/* 123 */         if (stack_in_slot.a >= 8) {
/*     */           
/* 125 */           ((sr)this.c.get(0)).c(new ur(stack_in_slot.c, 8, stack_in_slot.j()));
/* 126 */           stack_in_slot.a -= 8;
/*     */         }
/*     */         else {
/*     */           
/* 130 */           ((sr)this.c.get(0)).c(new ur(stack_in_slot.c, stack_in_slot.a, stack_in_slot.j()));
/* 131 */           stack_in_slot.a -= stack_in_slot.a;
/*     */         } 
/*     */       } 
/*     */       
/* 135 */       if (stack_in_slot.a == 0) {
/*     */         
/* 137 */         slot_object.c(null);
/*     */       }
/*     */       else {
/*     */         
/* 141 */         slot_object.e();
/*     */       } 
/*     */     } 
/* 144 */     return stack;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/containerslots/SCPContainer294.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */