/*    */ package SCPCraft.guis;
/*    */ 
/*    */ import SCPCraft.containerslots.SCPContainer914;
/*    */ import SCPCraft.tileentities.SCPTileEntity914;
/*    */ import avf;
/*    */ import bm;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import qw;
/*    */ import rq;
/*    */ 
/*    */ 
/*    */ public class SCPGuiSCP914
/*    */   extends avf
/*    */ {
/*    */   private SCPTileEntity914 SCP914Inventory;
/*    */   
/*    */   public SCPGuiSCP914(qw par1InventoryPlayer, SCPTileEntity914 par2TileEntity914) {
/* 18 */     super((rq)new SCPContainer914(par1InventoryPlayer, par2TileEntity914));
/* 19 */     this.SCP914Inventory = par2TileEntity914;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void drawGuiContainerForegroundLayer() {
/* 27 */     this.l.b(bm.a(""), 60, 6, 4210752);
/* 28 */     this.l.b(bm.a(""), 8, this.c - 96 + 2, 4210752);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(float par1, int par2, int par3) {
/* 36 */     int i = this.f.o.b("/SCPCraft/textures/guis/914GUI.png");
/* 37 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 38 */     this.f.o.b(i);
/* 39 */     int j = (this.g - this.b) / 2;
/* 40 */     int k = (this.h - this.c) / 2;
/* 41 */     b(j, k, 0, 0, this.b, this.c);
/*    */     
/* 43 */     int i1 = this.SCP914Inventory.getCookProgressScaled(24);
/* 44 */     b(j + 76, k + 40, 176, 14, i1 + 1, 16);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/guis/SCPGuiSCP914.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */