/*    */ package SCPCraft.entities;
/*    */ 
/*    */ import ModLoader;
/*    */ import SCPCraft.guis.SCPGuiButler;
/*    */ import aul;
/*    */ import md;
/*    */ import mz;
/*    */ import nc;
/*    */ import nh;
/*    */ import nw;
/*    */ import qx;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ public class SCPEntityButler
/*    */   extends SCPEntityD {
/*    */   public SCPEntityButler(yc par1World) {
/* 18 */     super(par1World);
/* 19 */     a(1.0F, 2.0F);
/* 20 */     this.aG = "/SCPCraft/textures/mobs/MrDeeds.png";
/* 21 */     az().a(true);
/* 22 */     this.bH = 0.35F;
/* 23 */     this.bn.a(0, (nc)new mz((md)this));
/* 24 */     this.bn.a(1, (nc)new nw(this, this.bH));
/* 25 */     this.bn.a(2, (nc)new nh((md)this, qx.class, 10.0F));
/* 26 */     this.bn.a(3, (nc)new nh((md)this, SCPEntity173.class, 10.0F));
/* 27 */     this.bn.a(4, (nc)new nh((md)this, SCPEntity111.class, 10.0F));
/*    */   }
/*    */   public SCPGuiButler gui;
/*    */   
/*    */   public void c() {
/* 32 */     super.c();
/*    */   }
/*    */ 
/*    */   
/*    */   public void j_() {
/* 37 */     super.j_();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean be() {
/* 42 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean bj() {
/* 47 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int aT() {
/* 52 */     return 50;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(qx par1EntityPlayer) {
/* 57 */     ur var2 = par1EntityPlayer.bJ.g();
/* 58 */     if (var2 == null) {
/*    */       
/* 60 */       ModLoader.openGUI(par1EntityPlayer, (aul)new SCPGuiButler(par1EntityPlayer.bJ, this, this.p));
/* 61 */       return super.a(par1EntityPlayer);
/*    */     } 
/*    */ 
/*    */     
/* 65 */     return super.a(par1EntityPlayer);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntityButler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */