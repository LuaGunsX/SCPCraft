/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import java.util.List;
/*    */ import ke;
/*    */ import tj;
/*    */ import up;
/*    */ import ur;
/*    */ 
/*    */ public class SCPItemDescription
/*    */   extends up
/*    */ {
/* 13 */   public static final String[] scpNames = new String[] { "SCP-500", "SCP-063", "SCP-1025", "SCP-109", "SCP-000-J", "SCP-50-AE-J", "SCP-420-J", "SCP-458", "SCP-217", "SCP-912" };
/*    */   
/*    */   public SCPItemDescription(int i) {
/* 16 */     super(i);
/* 17 */     a(true);
/* 18 */     a(mod_SCP.tabItemSCP);
/*    */   }
/*    */ 
/*    */   
/*    */   public String d(ur par1ItemStack) {
/* 23 */     int var2 = ke.a(par1ItemStack.j(), 0, scpNames.length - 1);
/* 24 */     return a() + "." + scpNames[var2];
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(int par1, tj par2CreativeTabs, List<ur> par3List) {
/* 29 */     for (int var4 = 0; var4 < scpNames.length; var4++)
/*    */     {
/* 31 */       par3List.add(new ur(par1, 1, var4));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 37 */     return "/SCPCraft/textures/SCPItems.png";
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItemDescription.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */