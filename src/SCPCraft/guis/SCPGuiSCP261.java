/*    */ package SCPCraft.guis;
/*    */ 
/*    */ import SCPCraft.containerslots.SCPContainer261;
/*    */ import SCPCraft.tileentities.SCPTileEntity261;
/*    */ import avf;
/*    */ import bm;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import qw;
/*    */ import rq;
/*    */ 
/*    */ 
/*    */ public class SCPGuiSCP261
/*    */   extends avf
/*    */ {
/*    */   private SCPTileEntity261 furnaceInventory;
/*    */   
/*    */   public SCPGuiSCP261(qw par1InventoryPlayer, SCPTileEntity261 par2TileEntity261) {
/* 18 */     super((rq)new SCPContainer261(par1InventoryPlayer, par2TileEntity261));
/* 19 */     this.furnaceInventory = par2TileEntity261;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void drawGuiContainerForegroundLayer() {
/* 27 */     this.l.b(bm.a(""), 60, 6, 4210752);
/* 28 */     this.l.b(bm.a("container.inventory"), 8, this.c - 96 + 2, 4210752);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(float par1, int par2, int par3) {
/* 36 */     int i = this.f.o.b("/SCPCraft/textures/guis/261GUI.png");
/* 37 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 38 */     this.f.o.b(i);
/* 39 */     int j = (this.g - this.b) / 2;
/* 40 */     int k = (this.h - this.c) / 2;
/* 41 */     b(j, k, 0, 0, this.b, this.c);
/*    */     
/* 43 */     if (this.furnaceInventory.isBurning()) {
/*    */       
/* 45 */       int l = this.furnaceInventory.getBurnTimeRemainingScaled(12);
/* 46 */       b(j + 56, k + 36 + 12 - l, 176, 12 - l, 14, l + 2);
/*    */     } 
/*    */     
/* 49 */     int i1 = this.furnaceInventory.getCookProgressScaled(24);
/* 50 */     b(j + 79, k + 34, 176, 14, i1 + 1, 16);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/guis/SCPGuiSCP261.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */