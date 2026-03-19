/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.SCPToolMaterial;
/*    */ import amq;
/*    */ import lq;
/*    */ import md;
/*    */ import up;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ 
/*    */ public class SCPItemTool
/*    */   extends up
/*    */ {
/*    */   private amq[] blocksEffectiveAgainst;
/*    */   public float efficiencyOnProperMaterial;
/*    */   public int damageVsEntity;
/*    */   protected SCPToolMaterial toolMaterial;
/*    */   
/*    */   protected SCPItemTool(int i, int j, SCPToolMaterial enumtoolmaterial, amq[] ablock) {
/* 21 */     super(i);
/* 22 */     this.efficiencyOnProperMaterial = 4.0F;
/* 23 */     this.toolMaterial = enumtoolmaterial;
/* 24 */     this.blocksEffectiveAgainst = ablock;
/* 25 */     this.ck = 1;
/* 26 */     e(enumtoolmaterial.getMaxUses());
/* 27 */     this.efficiencyOnProperMaterial = enumtoolmaterial.getEfficiencyOnProperMaterial();
/* 28 */     this.damageVsEntity = j + enumtoolmaterial.getDamageVsEntity();
/*    */   }
/*    */ 
/*    */   
/*    */   public float a(ur itemstack, amq block) {
/* 33 */     for (int i = 0; i < this.blocksEffectiveAgainst.length; i++) {
/*    */       
/* 35 */       if (this.blocksEffectiveAgainst[i] == block)
/*    */       {
/* 37 */         return this.efficiencyOnProperMaterial;
/*    */       }
/*    */     } 
/*    */     
/* 41 */     return 1.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ur par1ItemStack, md par2EntityLiving, md par3EntityLiving) {
/* 46 */     par1ItemStack.a(2, par3EntityLiving);
/* 47 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ur par1ItemStack, yc par2World, int par3, int par4, int par5, int par6, md par7EntityLiving) {
/* 52 */     if (amq.p[par3].m(par2World, par4, par5, par6) != 0.0D)
/*    */     {
/* 54 */       par1ItemStack.a(1, par7EntityLiving);
/*    */     }
/*    */     
/* 57 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(lq entity) {
/* 62 */     return this.damageVsEntity;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean n_() {
/* 67 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public int c() {
/* 72 */     return 200;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItemTool.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */