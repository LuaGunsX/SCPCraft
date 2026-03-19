/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import SCPCraft.mod_Others;
/*     */ import aoe;
/*     */ import java.util.List;
/*     */ import lq;
/*     */ import qx;
/*     */ import yc;
/*     */ 
/*     */ public class SCPBlock079 extends akb {
/*     */   public Random rand;
/*     */   
/*     */   public int r_() {
/*     */     return 0;
/*     */   }
/*     */   
/*     */   public String getTextureFile() {
/*     */     return "/SCPCraft/textures/SCPblox.png";
/*     */   }
/*     */   
/*     */   public aoe getSelectedBoundingBoxFromPool_do(yc world, int i, int j, int k) {
/*     */     a(-0.7F, 0.0F, -0.65F, 1.8F, 1.2F, 1.0F);
/*     */     return b_(world, i, j, k);
/*     */   }
/*     */   
/*  26 */   public SCPBlock079(int par1, int j) { super(par1, j, agi.f);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 176 */     this.rand = new Random(); b(true); a(mod_SCP.tabBlockSCP); }
/*     */   public void a(ym world, int i, int j, int k) { a(-0.7F, 0.0F, -0.65F, 1.8F, 1.2F, 1.0F); }
/*     */   public boolean a(yc par1World, int par2, int par3, int par4, qx par5EntityPlayer, int par6, float par7, float par8, float par9) { if (!mod_Others.wantsToTalk) return false;  ModLoader.openGUI(par5EntityPlayer, (aul)new SCPGui079(par1World, null, par5EntityPlayer, "")); par5EntityPlayer.a((jl)mod_SCP.hacker, 1); return true; }
/* 179 */   public void a(yc par1World, int par2, int par3, int par4, md par5EntityLiving) { int i = ke.c((par5EntityLiving.z * 4.0F / 360.0F) + 0.5D) & 0x3; int j = par1World.h(par2, par3, par4) & 0xC; if (i == 0) { par1World.c(par2, par3, par4, 0x3 | j); } else if (i == 1) { par1World.c(par2, par3, par4, 0x2 | j); } else if (i == 2) { par1World.c(par2, par3, par4, 0x1 | j); } else if (i == 3) { par1World.c(par2, par3, par4, 0x0 | j); }  } public int a(int par1, int par2) { if (par1 == 2 && mod_Others.wantsToTalk && this.rand.nextInt(10) == 0) { this.cl = 52; }
/* 180 */     else if (par1 == 2 && mod_Others.wantsToTalk) { this.cl = 50; }
/* 181 */      if (par1 == 2 && !mod_Others.wantsToTalk) this.cl = 51; 
/* 182 */     if (par1 != 2) this.cl = 54; 
/* 183 */     return this.cl; } public void a(yc par1World, int par2, int par3, int par4, aoe par5AxisAlignedBB, List par6ArrayList, lq par7Entity) { a(0.0F, 0.0F, 0.13F, 1.0F, 1.2F, 1.0F); super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity); a(0.0F, 0.0F, -0.65F, 1.0F, 0.3F, 0.07F); super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity); a(-0.7F, 0.0F, -0.2F, -0.2F, 0.2F, 0.6F); super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity); a(1.2F, 0.0F, 0.1F, 1.8F, 0.3F, 1.0F); super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity); a(1.67F, 0.1F, -0.05F, 1.77F, 0.25F, 0.1F); super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity); a(1.52F, 0.1F, -0.05F, 1.62F, 0.25F, 0.1F); super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity); a(1.37F, 0.1F, -0.05F, 1.47F, 0.25F, 0.1F); super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity); a(1.22F, 0.1F, -0.05F, 1.32F, 0.25F, 0.1F); super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity); a(0.46F, 0.0F, 0.07F, 0.52F, 0.15F, 0.2F); super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity); a(-0.2F, 0.0F, 0.25F, 0.0F, 0.15F, 0.4F); super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity); a(1.0F, 0.0F, 0.35F, 1.2F, 0.05F, 0.4F); super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity); a(1.0F, 0.0F, 0.45F, 1.2F, 0.05F, 0.5F); super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity); a(1.0F, 0.0F, 0.55F, 1.2F, 0.05F, 0.6F); super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity); a(1.0F, 0.0F, 0.65F, 1.2F, 0.05F, 0.7F); super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */     a(1.0F, 0.1F, 0.4F, 1.2F, 0.15F, 0.45F);
/*     */     super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity); }
/*     */   public boolean c() { return false; }
/*     */   public int n() { return 0; }
/* 188 */   public boolean b() { return false; } public boolean canRenderInPass(int pass) { return true; }
/*     */   public boolean a(ym par1IBlockAccess, int par2, int par3, int par4, int par5) { return true; }
/*     */   private static int determineOrientation(yc par0World, int par1, int par2, int par3, qx par4EntityPlayer) { if (ke.e((float)par4EntityPlayer.t - par1) < 2.0F && ke.e((float)par4EntityPlayer.v - par3) < 2.0F) { double d = par4EntityPlayer.u + 1.82D - par4EntityPlayer.M; if (d - par2 > 2.0D) return 1;  if (par2 - d > 0.0D) return 0;  }  int i = ke.c((par4EntityPlayer.z * 4.0F / 360.0F) + 0.5D) & 0x3; if (i == 0) return 2;  if (i == 1)
/*     */       return 5;  if (i == 2)
/*     */       return 3;  return (i != 3) ? 0 : 4; }
/* 193 */   public int d() { return mod_Others.SCP079ID; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public any a(yc var1) {
/* 199 */     return (any)new SCPTileEntity079();
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlock079.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */