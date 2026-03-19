/*    */ package SCPCraft.blocks;
/*    */ 
/*    */ import ModLoader;
/*    */ import SCPCraft.mod_SCP;
/*    */ import agi;
/*    */ import amq;
/*    */ import ays;
/*    */ import java.util.Random;
/*    */ import lq;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import qx;
/*    */ import ur;
/*    */ import yc;
/*    */ 
/*    */ public class SCPBlock009
/*    */   extends amq
/*    */ {
/*    */   public SCPBlock009(int par1, int par2) {
/* 19 */     super(par1, par2, agi.v);
/* 20 */     a(mod_SCP.tabBlockSCP);
/* 21 */     b(true);
/* 22 */     this.cC = 1.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int par1, Random par2Random, int par3) {
/* 27 */     return mod_SCP.SCP009.cm;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTextureFile() {
/* 32 */     return "/SCPCraft/textures/SCPblox.png";
/*    */   }
/*    */ 
/*    */   
/*    */   public int r_() {
/* 37 */     return 4;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(yc par1World, int par2, int par3, int par4, qx par5EntityPlayer) {
/* 42 */     ur var2 = par5EntityPlayer.bJ.g();
/*    */     
/* 44 */     Minecraft minecraft = ModLoader.getMinecraftInstance();
/*    */     
/* 46 */     ur boots = minecraft.g.bJ.b[0];
/* 47 */     ur legs = minecraft.g.bJ.b[1];
/* 48 */     ur chest = minecraft.g.bJ.b[2];
/* 49 */     ur helm = minecraft.g.bJ.b[3];
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(yc par1World, int par2, int par3, int par4, lq par5Entity) {
/* 54 */     ays ays = (ModLoader.getMinecraftInstance()).g;
/* 55 */     ur var2 = ((qx)ays).bJ.g();
/* 56 */     Minecraft minecraft = ModLoader.getMinecraftInstance();
/*    */     
/* 58 */     ur boots = minecraft.g.bJ.b[0];
/* 59 */     ur legs = minecraft.g.bJ.b[1];
/* 60 */     ur chest = minecraft.g.bJ.b[2];
/* 61 */     ur helm = minecraft.g.bJ.b[3];
/* 62 */     super.b(par1World, par2, par3, par4, par5Entity);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(yc par1World, int par2, int par3, int par4, qx par5EntityPlayer, int par6, float par7, float par8, float par9) {
/* 67 */     ur var2 = par5EntityPlayer.bJ.g();
/* 68 */     Minecraft minecraft = ModLoader.getMinecraftInstance();
/*    */     
/* 70 */     ur boots = minecraft.g.bJ.b[0];
/* 71 */     ur legs = minecraft.g.bJ.b[1];
/* 72 */     ur chest = minecraft.g.bJ.b[2];
/* 73 */     ur helm = minecraft.g.bJ.b[3];
/* 74 */     return super.a(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(yc par1World, int par2, int par3, int par4, Random par5Random) {
/* 79 */     if (!par1World.I)
/*    */     {
/* 81 */       for (int var6 = 0; var6 < 100; var6++) {
/*    */         
/* 83 */         int var7 = par2 + par5Random.nextInt(3) - 1;
/* 84 */         int var8 = par3 + par5Random.nextInt(5) - 3;
/* 85 */         int var9 = par4 + par5Random.nextInt(3) - 1;
/* 86 */         int var10 = par1World.a(var7, var8 + 1, var9);
/*    */         
/* 88 */         if (par1World.a(var7, var8, var9) == 0)
/*    */         {
/* 90 */           par1World.e(var7, var8, var9, mod_SCP.SCP009.cm);
/*    */         }
/*    */       } 
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlock009.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */