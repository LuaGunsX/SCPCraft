/*    */ package SCPCraft.blocks;
/*    */ 
/*    */ import SCPCraft.entities.SCPEntity273;
/*    */ import SCPCraft.mod_Others;
/*    */ import SCPCraft.mod_SCP;
/*    */ import agi;
/*    */ import amq;
/*    */ import aoe;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import lq;
/*    */ import yc;
/*    */ import ym;
/*    */ 
/*    */ public class SCPBlock273Pillar
/*    */   extends amq
/*    */ {
/* 18 */   public int nr = 0;
/*    */   
/*    */   public SCPBlock273Pillar(int par1, int j) {
/* 21 */     super(par1, j, agi.f);
/* 22 */     b(true);
/* 23 */     a(mod_SCP.tabBlockSCP);
/*    */   }
/*    */ 
/*    */   
/*    */   public aoe getSelectedBoundingBoxFromPool_do(yc world, int i, int j, int k) {
/* 28 */     a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
/* 29 */     return b_(world, i, j, k);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(ym world, int i, int j, int k) {
/* 35 */     a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(yc par1World, int par2, int par3, int par4, aoe par5AxisAlignedBB, List par6ArrayList, lq par7Entity) {
/* 40 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.2F, 1.0F);
/* 41 */     super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/* 42 */     a(0.25F, 0.2F, 0.25F, 0.75F, 1.8F, 0.75F);
/* 43 */     super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/* 44 */     a(0.0F, 1.8F, 0.0F, 1.0F, 2.0F, 1.0F);
/* 45 */     super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean c() {
/* 50 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int n() {
/* 55 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canRenderInPass(int pass) {
/* 60 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ym par1IBlockAccess, int par2, int par3, int par4, int par5) {
/* 65 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(yc par1World, int par2, int par3, int par4, Random par5Random) {
/* 70 */     this.nr++;
/* 71 */     if (this.nr == 3) {
/*    */       
/* 73 */       SCPEntity273 var8 = new SCPEntity273(par1World);
/* 74 */       var8.b(par2, par3, par4, par1World.t.nextFloat() * 360.0F, 0.0F);
/* 75 */       par1World.d((lq)var8);
/* 76 */       this.nr = 0;
/* 77 */       par1World.e(par2, par3, par4, 0);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 83 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int d() {
/* 88 */     return mod_Others.SCP273ID;
/*    */   }
/*    */ 
/*    */   
/*    */   public int r_() {
/* 93 */     return 0;
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlock273Pillar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */