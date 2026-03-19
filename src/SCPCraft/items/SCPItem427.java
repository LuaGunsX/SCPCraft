/*    */ package SCPCraft.items;
/*    */ 
/*    */ import ModLoader;
/*    */ import SCPCraft.mod_SCP;
/*    */ import lq;
/*    */ import md;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import qx;
/*    */ import up;
/*    */ import ur;
/*    */ import vb;
/*    */ import yc;
/*    */ 
/*    */ public class SCPItem427
/*    */   extends up
/*    */ {
/*    */   public SCPItem427(int i) {
/* 18 */     super(i);
/* 19 */     this.ck = 1;
/* 20 */     e(500);
/* 21 */     a(mod_SCP.tabSCP);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean n_() {
/* 26 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean e(ur par1ItemStack) {
/* 31 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public vb f(ur par1ItemStack) {
/* 36 */     return (par1ItemStack.j() == 0) ? vb.c : vb.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public ur a(ur itemstack, yc world, qx entityplayer) {
/* 41 */     Minecraft mc = ModLoader.getMinecraftInstance();
/* 42 */     if (mc.b.g())
/*    */     {
/* 44 */       if (itemstack.j() == 0) {
/*    */         
/* 46 */         itemstack.b(500);
/* 47 */         entityplayer.i(20);
/*    */       } 
/*    */     }
/*    */     
/* 51 */     return itemstack;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ur itemstack, yc world, lq entity, int i, boolean flag) {
/* 56 */     if (itemstack.j() > 0)
/*    */     {
/* 58 */       itemstack.a(-1, (md)entity);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 64 */     return "/SCPCraft/textures/SCPItems.png";
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem427.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */