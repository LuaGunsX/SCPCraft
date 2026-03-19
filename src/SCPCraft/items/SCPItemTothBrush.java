/*    */ package SCPCraft.items;
/*    */ 
/*    */ import SCPCraft.mod_SCP;
/*    */ import amq;
/*    */ import lq;
/*    */ import md;
/*    */ import tw;
/*    */ import uq;
/*    */ import ur;
/*    */ 
/*    */ public class SCPItemTothBrush
/*    */   extends tw
/*    */ {
/* 14 */   private static amq[] blocksEffectiveAgainst = new amq[] { amq.z, (amq)amq.am, (amq)amq.an, amq.w, amq.T, amq.ar, amq.K, amq.al, amq.L, amq.ak, amq.J, amq.az, amq.aA, amq.aW, amq.as, amq.be, amq.Q, amq.R, amq.aQ, amq.aR, amq.aJ, amq.X, amq.W, (amq)amq.x, amq.y, amq.H, amq.I, amq.aV, amq.aX, amq.aZ, amq.aD, amq.bf, (amq)amq.bB, amq.A, amq.aq, amq.M, amq.ax, (amq)amq.am, (amq)amq.an, amq.bd, amq.bi, mod_SCP.BloodBlock, mod_SCP.SCP409, mod_SCP.CorrodedIron, mod_SCP.Granite, amq.C, mod_SCP.SCPspawner, mod_SCP.KeycardSlot, mod_SCP.KeycardSlotLv2, mod_SCP.KeycardSlotLv3, mod_SCP.KeycardSlotOmni, mod_SCP.SmokeBlock, amq.bL, amq.av, mod_SCP.SCP019 };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public SCPItemTothBrush(int par1, uq par2EnumToolMaterial) {
/* 24 */     super(par1, 2, par2EnumToolMaterial, blocksEffectiveAgainst);
/* 25 */     a(mod_SCP.tabSCP);
/* 26 */     e(-99);
/*    */   }
/*    */ 
/*    */   
/*    */   public int c() {
/* 31 */     return 20;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ur par1ItemStack, md par2EntityLiving, md par3EntityLiving) {
/* 36 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(amq par1Block) {
/* 41 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(lq par1Entity) {
/* 46 */     return 4;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public float a(ur par1ItemStack, amq par2Block) {
/* 55 */     return 100.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 60 */     return "/SCPCraft/textures/SCPItems.png";
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItemTothBrush.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */