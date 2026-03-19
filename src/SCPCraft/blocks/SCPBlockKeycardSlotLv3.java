/*    */ package SCPCraft.blocks;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import md;
/*    */ import qx;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ public class SCPBlockKeycardSlotLv3
/*    */   extends SCPBlockKeycardSlot {
/*    */   public SCPBlockKeycardSlotLv3(int i, int j) {
/* 12 */     super(i, j);
/* 13 */     b(true);
/* 14 */     a(mod_SCP.tabBlockSCP);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(yc par1World, int par2, int par3, int par4, qx par5EntityPlayer, int par6, float par7, float par8, float par9) {
/* 19 */     ur itemstack = par5EntityPlayer.bJ.g();
/* 20 */     int i = par1World.h(par2, par3, par4);
/* 21 */     int j = i & 0x7;
/* 22 */     if (par1World.I)
/*    */     {
/* 24 */       return true;
/*    */     }
/* 26 */     if (itemstack != null && (itemstack.c == mod_SCP.L3Keycard.cj || itemstack.c == mod_SCP.OmniKeycard.cj)) {
/*    */       
/* 28 */       int k = 8 - (i & 0x8);
/* 29 */       par1World.c(par2, par3, par4, j + k);
/* 30 */       par1World.a(par2 + 0.5D, par3 + 0.5D, par4 + 0.5D, "random.click", 0.3F, 0.6F);
/* 31 */       func_82536_d(par1World, par2, par3, par4, j);
/* 32 */       par1World.a(par2, par3, par4, this.cm, r_());
/*    */ 
/*    */     
/*    */     }
/* 36 */     else if (itemstack != null && (itemstack.c == mod_SCP.Wrench.cj || itemstack.c == mod_SCP.GodlyWrench.cj)) {
/* 37 */       par1World.d(par2, par3, par4, mod_SCP.KeycardSlotOmni.cm, j);
/* 38 */       itemstack.a(1, (md)par5EntityPlayer);
/* 39 */       if (par1World.I)
/*    */       {
/* 41 */         par5EntityPlayer.b("Keycard Level: Omni");
/*    */       }
/* 43 */       if (!par1World.I)
/*    */       {
/* 45 */         par5EntityPlayer.b("Keycard Level: Omni");
/*    */       }
/*    */     }
/*    */     else {
/*    */       
/* 50 */       if (par1World.I)
/*    */       {
/* 52 */         par5EntityPlayer.b("You need a Level 3 or higher Keycard to activate.");
/*    */       }
/*    */       
/* 55 */       if (!par1World.I)
/*    */       {
/* 57 */         par5EntityPlayer.b("You need a Level 3 or higher Keycard to activate.");
/*    */       }
/*    */     } 
/*    */     
/* 61 */     par1World.a(par2, par3, par4, this.cm, r_());
/*    */     
/* 63 */     return true;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlockKeycardSlotLv3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */