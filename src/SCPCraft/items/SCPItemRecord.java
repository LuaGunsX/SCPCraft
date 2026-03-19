/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import alt;
/*    */ import amq;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import qx;
/*    */ import ur;
/*    */ import vb;
/*    */ import vc;
/*    */ import yc;
/*    */ 
/*    */ 
/*    */ public class SCPItemRecord
/*    */   extends vc
/*    */ {
/*    */   public final String recordName;
/*    */   public final String author;
/* 23 */   private static final Map field_90044_b = new HashMap<Object, Object>();
/*    */ 
/*    */   
/*    */   public SCPItemRecord(int par1, String par2Str, String aut) {
/* 27 */     super(par1, par2Str);
/* 28 */     this.recordName = par2Str;
/* 29 */     this.ck = 1;
/* 30 */     this.author = aut;
/* 31 */     a(mod_SCP.tabItemSCP);
/* 32 */     field_90044_b.put(par2Str, this);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 37 */     return "/SCPCraft/textures/SCPItems.png";
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/* 42 */     if (par3World.a(par4, par5, par6) == amq.bb.cm && par3World.h(par4, par5, par6) == 0) {
/*    */       
/* 44 */       if (par3World.I)
/*    */       {
/* 46 */         return true;
/*    */       }
/*    */ 
/*    */       
/* 50 */       ((alt)amq.bb).a(par3World, par4, par5, par6, par1ItemStack);
/* 51 */       par3World.a((qx)null, 1005, par4, par5, par6, this.cj);
/* 52 */       par1ItemStack.a--;
/* 53 */       return true;
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 58 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> par3List, boolean par4) {
/* 64 */     par3List.add(this.author + " - " + this.recordName);
/*    */   }
/*    */ 
/*    */   
/*    */   public vb f(ur par1ItemStack) {
/* 69 */     return vb.c;
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public static SCPItemRecord func_90042_d(String par0Str) {
/* 75 */     return (SCPItemRecord)field_90044_b.get(par0Str);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItemRecord.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */