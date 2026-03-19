/*    */ package SCPCraft.items;
/*    */ 
/*    */ import ModLoader;
/*    */ import SCPCraft.SCPInventory000J;
/*    */ import SCPCraft.guis.SCPGui000J;
/*    */ import SCPCraft.mod_SCP;
/*    */ import aul;
/*    */ import ays;
/*    */ import java.util.Random;
/*    */ import qx;
/*    */ import up;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ public class SCPItem000J extends up {
/*    */   public static String Illness;
/*    */   public static int Disease;
/* 18 */   Random rand = new Random();
/*    */ 
/*    */   
/*    */   public SCPItem000J(int i) {
/* 22 */     super(i);
/* 23 */     d(1);
/* 24 */     a(mod_SCP.tabSCP);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 29 */     return "/SCPCraft/textures/SCPItems.png";
/*    */   }
/*    */ 
/*    */   
/*    */   public ur a(ur var1, yc var2, qx var3) {
/* 34 */     ays ays = (ModLoader.getMinecraftInstance()).g;
/* 35 */     ModLoader.openGUI(var3, (aul)new SCPGui000J(new SCPInventory000J(var1), var3));
/* 36 */     return var1;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem000J.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */