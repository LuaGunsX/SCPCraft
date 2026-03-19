/*    */ package SCPCraft.blocks;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import md;
/*    */ import qx;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ public class SCPBlockKeycardSlotOmni
/*    */   extends SCPBlockKeycardSlot
/*    */ {
/*    */   public SCPBlockKeycardSlotOmni(int i, int j) {
/* 13 */     super(i, j);
/* 14 */     b(true);
/* 15 */     a(mod_SCP.tabBlockSCP);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(yc par1World, int par2, int par3, int par4, qx par5EntityPlayer, int par6, float par7, float par8, float par9) {
/* 20 */     ur itemstack = par5EntityPlayer.bJ.g();
/* 21 */     int i = par1World.h(par2, par3, par4);
/* 22 */     int j = i & 0x7;
/* 23 */     if (par1World.I)
/*    */     {
/* 25 */       return true;
/*    */     }
/* 27 */     if (itemstack != null && itemstack.c == mod_SCP.OmniKeycard.cj) {
/*    */       
/* 29 */       int k = 8 - (i & 0x8);
/* 30 */       par1World.c(par2, par3, par4, j + k);
/* 31 */       par1World.a(par2 + 0.5D, par3 + 0.5D, par4 + 0.5D, "random.click", 0.3F, 0.6F);
/* 32 */       func_82536_d(par1World, par2, par3, par4, j);
/* 33 */       par1World.a(par2, par3, par4, this.cm, r_());
/*    */ 
/*    */     
/*    */     }
/* 37 */     else if (itemstack != null && (itemstack.c == mod_SCP.Wrench.cj || itemstack.c == mod_SCP.GodlyWrench.cj)) {
/* 38 */       par1World.d(par2, par3, par4, mod_SCP.KeycardSlot.cm, j);
/* 39 */       itemstack.a(1, (md)par5EntityPlayer);
/* 40 */       if (par1World.I)
/*    */       {
/* 42 */         par5EntityPlayer.b("Keycard Level: 1");
/*    */       }
/* 44 */       if (!par1World.I)
/*    */       {
/* 46 */         par5EntityPlayer.b("Keycard Level: 1");
/*    */       }
/*    */     }
/*    */     else {
/*    */       
/* 51 */       if (par1World.I)
/*    */       {
/* 53 */         par5EntityPlayer.b("You need an Omni Keycard to activate.");
/*    */       }
/* 55 */       if (!par1World.I)
/*    */       {
/* 57 */         par5EntityPlayer.b("You need an Omni Keycard to activate.");
/*    */       }
/*    */     } 
/*    */     
/* 61 */     par1World.a(par2, par3, par4, this.cm, r_());
/*    */     
/* 63 */     return true;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlockKeycardSlotOmni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */