/*    */ package SCPCraft.guis;
/*    */ 
/*    */ import ModLoader;
/*    */ import SCPCraft.entities.SCPEntity629;
/*    */ import atb;
/*    */ import atn;
/*    */ import aul;
/*    */ import java.awt.image.BufferedImage;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SCPGuiName
/*    */   extends aul
/*    */ {
/*    */   private BufferedImage img;
/* 17 */   private int imgID = 1000;
/*    */   
/*    */   public SCPGuiName(SCPEntity629 entity) {
/* 20 */     this.mob = entity;
/*    */   }
/*    */ 
/*    */   
/*    */   private atn textfield;
/*    */   
/*    */   public SCPEntity629 mob;
/*    */   
/*    */   public void A_() {
/*    */     try {
/* 30 */       this.img = ModLoader.loadImage(this.f.o, "/SCPCraft/textures/guis/Naming.png");
/* 31 */       this.f.o.a(this.img, this.imgID);
/*    */     }
/* 33 */     catch (Exception e) {
/*    */       
/* 35 */       e.printStackTrace();
/*    */     } 
/* 37 */     this.i.clear();
/* 38 */     this.i.add(new atb(1, this.g / 2 - 49, this.h / 2 + 20, 70, 20, "Enter"));
/* 39 */     this.textfield = new atn(this.l, this.g / 2 - 87, this.h / 2 - 10, 150, 20);
/* 40 */     this.textfield.b(false);
/* 41 */     this.textfield.f(16);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(atb guibutton) {
/* 46 */     if (guibutton.f == 1) {
/*    */       
/* 48 */       this.mob.Name = this.textfield.b();
/* 49 */       this.f.a(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   protected void a(char c, int i) {
/* 54 */     super.a(c, i);
/* 55 */     this.textfield.a(c, i);
/*    */   }
/*    */   
/*    */   protected void a(int i, int j, int k) {
/* 59 */     super.a(i, j, k);
/* 60 */     this.textfield.a(i, j, k);
/*    */   }
/*    */   
/*    */   public boolean f() {
/* 64 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b() {}
/*    */   
/*    */   public void a(int i, int j, float f) {
/* 71 */     e();
/* 72 */     int k = this.g / 2 - 100;
/* 73 */     int l = this.h / 2 - 40;
/*    */     
/*    */     try {
/* 76 */       int tempvar = this.f.o.b("/blox/Naming.png");
/* 77 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 78 */       this.f.o.b(tempvar);
/* 79 */       b(k, l, 0, 0, 176, 166);
/*    */     } finally {}
/*    */ 
/*    */ 
/*    */     
/* 84 */     this.textfield.f();
/* 85 */     a(this.l, "Enter the Name of your Mob", this.g / 2 - 10, this.h / 2 - 35, 16777215);
/* 86 */     super.a(i, j, f);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/guis/SCPGuiName.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */