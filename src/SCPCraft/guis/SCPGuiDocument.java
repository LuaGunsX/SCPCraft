/*    */ package SCPCraft.guis;
/*    */ 
/*    */ import SCPCraft.containerslots.SCPContainerDocument;
/*    */ import avf;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import qw;
/*    */ import rq;
/*    */ import yc;
/*    */ 
/*    */ 
/*    */ public class SCPGuiDocument
/*    */   extends avf
/*    */ {
/*    */   public SCPGuiDocument(qw inventoryplayer, yc world, int i, int j, int k) {
/* 15 */     super((rq)new SCPContainerDocument(inventoryplayer, world, i, j, k));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void drawGuiContainerForegroundLayer() {
/* 20 */     this.l.b("", 62, 6, 4210752);
/* 21 */     this.l.b("Inventory", 8, this.c - 96 + 2, 4210752);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(float f, int i, int j) {
/* 26 */     i = this.f.o.b("/SCPCraft/textures/guis/DocumentGUI.png");
/* 27 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 28 */     this.f.o.b(i);
/* 29 */     j = (this.g - this.b) / 2;
/* 30 */     int k = (this.h - this.c) / 2;
/* 31 */     b(j, k, 0, 0, this.b, this.c);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/guis/SCPGuiDocument.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */