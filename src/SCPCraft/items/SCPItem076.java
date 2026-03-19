/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import amq;
/*    */ import java.util.List;
/*    */ import jl;
/*    */ import qx;
/*    */ import r;
/*    */ import tx;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ public class SCPItem076
/*    */   extends SCPItemDocument
/*    */ {
/*    */   public SCPItem076(int i) {
/* 17 */     super(i);
/* 18 */     this.ck = 1;
/* 19 */     e(1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/* 24 */     list.add("§4SCP-076");
/* 25 */     list.add("§7Able");
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean n_() {
/* 30 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/* 35 */     if (par3World.I)
/*    */     {
/* 37 */       return true;
/*    */     }
/*    */ 
/*    */     
/* 41 */     int var11 = par3World.a(par4, par5, par6);
/* 42 */     par4 += r.b[par7];
/* 43 */     par5 += r.c[par7];
/* 44 */     par6 += r.d[par7];
/* 45 */     double var12 = 0.0D;
/*    */     
/* 47 */     if ((par7 == 1 && var11 == amq.bc.cm) || var11 == amq.bE.cm)
/*    */     {
/* 49 */       var12 = 0.5D;
/*    */     }
/* 51 */     if (spawnCreature(par3World, par1ItemStack.j(), par4 + 0.5D, par5 + var12, par6 + 2.5D) && !par2EntityPlayer.cd.d)
/*    */     {
/* 53 */       par1ItemStack.a--;
/*    */     }
/*    */     int Width;
/* 56 */     for (Width = -1; Width <= 6; Width++) {
/*    */       
/* 58 */       for (int Length = -1; Length <= 7; Length++) {
/*    */         
/* 60 */         for (int Heigth = -1; Heigth <= 4; Heigth++)
/*    */         {
/* 62 */           par3World.b(par4 + Width, par5 + Heigth, par6 + Length, amq.C.cm);
/*    */         }
/*    */       } 
/*    */     } 
/* 66 */     for (Width = 0; Width <= 5; Width++) {
/*    */       
/* 68 */       for (int Length = 0; Length <= 4; Length++) {
/*    */         
/* 70 */         for (int Heigth = 0; Heigth <= 3; Heigth++)
/*    */         {
/* 72 */           par3World.b(par4 + Width, par5 + Heigth, par6 + Length, 0);
/*    */         }
/*    */       } 
/*    */     } 
/* 76 */     par1ItemStack.a--;
/* 77 */     par3World.d(par4 + 2, par5 + 1, par6 - 2, mod_SCP.KeycardSlotLv3.cm, 2);
/* 78 */     par3World.d(par4 + 4, par5 + 1, par6, mod_SCP.KeycardSlotLv3.cm, 0);
/* 79 */     tx.a(par3World, par4 + 3, par5, par6 - 1, 1, amq.aO);
/*    */     
/* 81 */     par3World.b(par4 + 2, par5, par6 + 3, mod_SCP.SCP076.cm);
/*    */     
/* 83 */     par2EntityPlayer.b("SCP-076 Spawned. | [Type: §4Keter§f]");
/*    */ 
/*    */     
/* 86 */     par2EntityPlayer.a((jl)mod_SCP.AbleWin, 1);
/*    */     
/* 88 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean spawnCreature(yc par0World, int par1, double par2, double par4, double par6) {
/* 94 */     return false;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem076.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */