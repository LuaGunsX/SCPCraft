/*     */ package SCPCraft.blocks;
/*     */ public class SCPBlock261 extends akb { private Random furnaceRand;
/*     */   public String getTextureFile() {
/*     */     return "/SCPCraft/textures/SCPblox.png";
/*     */   }
/*     */   public int a(int par1, Random par2Random, int par3) {
/*     */     return mod_SCP.Item261.cj;
/*     */   }
/*     */   public int a(yc par1World, int par2, int par3, int par4) {
/*     */     return mod_SCP.Item261.cj;
/*     */   }
/*     */   public aoe getSelectedBoundingBoxFromPool_do(yc world, int i, int j, int k) {
/*     */     int l = world.h(i, j, k);
/*     */     if (l == 0 || l == 2)
/*     */       a(0.1F, 0.0F, 0.201F, 0.9F, 1.52F, 0.82F); 
/*     */     if (l == 1 || l == 3)
/*     */       a(0.201F, 0.0F, 0.1F, 0.82F, 1.52F, 0.9F); 
/*     */     return b_(world, i, j, k);
/*     */   }
/*     */   public void a(ym world, int i, int j, int k) {
/*     */     int l = world.h(i, j, k);
/*     */     if (l == 0 || l == 2)
/*     */       a(0.1F, 0.0F, 0.201F, 0.9F, 1.52F, 0.82F); 
/*     */     if (l == 1 || l == 3)
/*     */       a(0.201F, 0.0F, 0.1F, 0.82F, 1.52F, 0.9F); 
/*     */   }
/*     */   
/*  28 */   public SCPBlock261(int par1) { super(par1, agi.e);
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
/* 144 */     this.furnaceRand = new Random(); this.cl = 21; }
/*     */   public void a(yc par1World, int par2, int par3, int par4, aoe par5AxisAlignedBB, List par6ArrayList, lq par7Entity) { int i = par1World.h(par2, par3, par4); if (i == 0 || i == 2)
/*     */       a(0.1F, 0.0F, 0.201F, 0.9F, 1.52F, 0.82F);  if (i == 1 || i == 3)
/* 147 */       a(0.201F, 0.0F, 0.1F, 0.82F, 1.52F, 0.9F);  super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity); } public void a(yc par1World, int par2, int par3, int par4, int par5, int par6) { SCPTileEntity261 var7 = (SCPTileEntity261)par1World.q(par2, par3, par4);
/* 148 */     if (var7 != null)
/*     */     {
/* 150 */       for (int var8 = 0; var8 < var7.k_(); var8++) {
/*     */         
/* 152 */         ur var9 = var7.a(var8);
/*     */         
/* 154 */         if (var9 != null) {
/*     */           
/* 156 */           float var10 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
/* 157 */           float var11 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
/* 158 */           float var12 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
/*     */           
/* 160 */           while (var9.a > 0) {
/*     */             
/* 162 */             int var13 = this.furnaceRand.nextInt(21) + 10;
/*     */             
/* 164 */             if (var13 > var9.a)
/*     */             {
/* 166 */               var13 = var9.a;
/*     */             }
/*     */             
/* 169 */             var9.a -= var13;
/* 170 */             px var14 = new px(par1World, (par2 + var10), (par3 + var11), (par4 + var12), new ur(var9.c, var13, var9.j()));
/*     */             
/* 172 */             if (var9.o())
/*     */             {
/* 174 */               var14.d().d((bq)var9.p().b());
/*     */             }
/*     */             
/* 177 */             float var15 = 0.05F;
/* 178 */             var14.w = ((float)this.furnaceRand.nextGaussian() * var15);
/* 179 */             var14.x = ((float)this.furnaceRand.nextGaussian() * var15 + 0.2F);
/* 180 */             var14.y = ((float)this.furnaceRand.nextGaussian() * var15);
/* 181 */             par1World.d((lq)var14);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 187 */     super.a(par1World, par2, par3, par4, par5, par6); } public int quanityDropped(Random random) { return 1; }
/*     */   public int d() { return -1; }
/*     */   public boolean c() {
/*     */     return false;
/*     */   }
/* 192 */   public boolean a(yc var1, int var2, int var3, int var4, qx var5, int var6, float var7, float var8, float var9) { any tileEntity = var1.q(var2, var3, var4);
/*     */     
/* 194 */     if (tileEntity == null || var5.ah()) {
/* 195 */       return false;
/*     */     }
/*     */     
/* 198 */     var5.openGui(mod_SCP.instance, 1, var1, var2, var3, var4);
/* 199 */     return true; } public boolean b() { return false; } public void g(yc par1World, int par2, int par3, int par4) {
/*     */     super.g(par1World, par2, par3, par4);
/*     */     setDefaultDirection(par1World, par2, par3, par4);
/*     */   }
/*     */   public any a(yc var1) {
/* 204 */     return (any)new SCPTileEntity261();
/*     */   }
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, md par5EntityLiving) {
/*     */     int var6 = ke.c((par5EntityLiving.z * 4.0F / 360.0F) + 2.5D) & 0x3;
/*     */     par1World.c(par2, par3, par4, var6);
/*     */   }
/*     */   
/*     */   private void setDefaultDirection(yc par1World, int par2, int par3, int par4) {
/*     */     if (par1World.I)
/*     */       return; 
/*     */     int i = par1World.a(par2, par3, par4 - 1);
/*     */     int j = par1World.a(par2, par3, par4 + 1);
/*     */     int k = par1World.a(par2 - 1, par3, par4);
/*     */     int l = par1World.a(par2 + 1, par3, par4);
/*     */     byte byte0 = 3;
/*     */     if (amq.q[i] && !amq.q[j])
/*     */       byte0 = 3; 
/*     */     if (amq.q[j] && !amq.q[i])
/*     */       byte0 = 2; 
/*     */     if (amq.q[k] && !amq.q[l])
/*     */       byte0 = 5; 
/*     */     if (amq.q[l] && !amq.q[k])
/*     */       byte0 = 4; 
/*     */     par1World.c(par2, par3, par4, byte0);
/*     */   } }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlock261.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */