/*    */ package SCPCraft.items;
/*    */ 
/*    */ import ModLoader;
/*    */ import SCPCraft.guis.SCPGui1025;
/*    */ import SCPCraft.mod_SCP;
/*    */ import aul;
/*    */ import java.util.Random;
/*    */ import qx;
/*    */ import up;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ public class SCPItem1025
/*    */   extends up {
/*    */   public static String Illness;
/*    */   public static int Disease;
/* 17 */   Random rand = new Random();
/*    */ 
/*    */   
/*    */   public SCPItem1025(int i) {
/* 21 */     super(i);
/* 22 */     d(1);
/* 23 */     a(mod_SCP.tabSCP);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 28 */     return "/SCPCraft/textures/SCPItems.png";
/*    */   }
/*    */ 
/*    */   
/*    */   public ur a(ur par1ItemStack, yc var2, qx var3) {
/* 33 */     ModLoader.openGUI(var3, (aul)new SCPGui1025(this, var3));
/* 34 */     return par1ItemStack;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem1025.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */