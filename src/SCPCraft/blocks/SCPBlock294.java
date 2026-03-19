/*     */ package SCPCraft.blocks;
/*     */ public class SCPBlock294 extends akb { private Class SCPEntity294Class; private Random furnaceRand; public String getTextureFile() {
/*     */     return "/SCPCraft/textures/SCPblox.png";
/*     */   } public int a(int par1, Random par2Random, int par3) {
/*     */     return mod_SCP.Item294.cj;
/*     */   } public int a(yc par1World, int par2, int par3, int par4) {
/*     */     return mod_SCP.Item294.cj;
/*     */   } public aoe getSelectedBoundingBoxFromPool_do(yc world, int i, int j, int k) {
/*     */     int l = world.h(i, j, k);
/*     */     if (l == 0)
/*     */       a(0.1F, 0.0F, 0.1F, 0.9F, 1.6F, 0.85F); 
/*     */     if (l == 1)
/*     */       a(0.1F, 0.0F, 0.1F, 0.85F, 1.6F, 0.9F); 
/*     */     if (l == 2)
/*     */       a(0.1F, 0.0F, 0.1F, 0.9F, 1.6F, 0.85F); 
/*     */     if (l == 3)
/*     */       a(0.1F, 0.0F, 0.1F, 0.85F, 1.6F, 0.9F); 
/*     */     return b_(world, i, j, k);
/*     */   } public void a(ym world, int i, int j, int k) {
/*     */     int l = world.h(i, j, k);
/*     */     if (l == 0)
/*     */       a(0.1F, 0.0F, 0.1F, 0.9F, 1.6F, 0.85F); 
/*     */     if (l == 1)
/*     */       a(0.1F, 0.0F, 0.1F, 0.85F, 1.6F, 0.9F); 
/*     */     if (l == 2)
/*     */       a(0.1F, 0.0F, 0.1F, 0.9F, 1.6F, 0.85F); 
/*     */     if (l == 3)
/*     */       a(0.1F, 0.0F, 0.1F, 0.85F, 1.6F, 0.9F); 
/*  29 */   } public SCPBlock294(int par1) { super(par1, agi.e);
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
/* 155 */     this.furnaceRand = new Random(); this.cl = 21; }
/*     */   public void a(yc par1World, int par2, int par3, int par4, aoe par5AxisAlignedBB, List par6ArrayList, lq par7Entity) { int i = par1World.h(par2, par3, par4); if (i == 0) a(0.1F, 0.0F, 0.1F, 0.9F, 1.6F, 0.85F);  if (i == 1) a(0.1F, 0.0F, 0.1F, 0.85F, 1.6F, 0.9F);  if (i == 2)
/*     */       a(0.1F, 0.0F, 0.1F, 0.9F, 1.6F, 0.85F);  if (i == 3)
/* 158 */       a(0.1F, 0.0F, 0.1F, 0.85F, 1.6F, 0.9F);  super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity); } public void a(yc par1World, int par2, int par3, int par4, int par5, int par6) { SCPTileEntity294 var7 = (SCPTileEntity294)par1World.q(par2, par3, par4);
/* 159 */     if (var7 != null)
/*     */     {
/* 161 */       for (int var8 = 0; var8 < var7.k_(); var8++) {
/*     */         
/* 163 */         ur var9 = var7.a(var8);
/*     */         
/* 165 */         if (var9 != null) {
/*     */           
/* 167 */           float var10 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
/* 168 */           float var11 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
/* 169 */           float var12 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
/*     */           
/* 171 */           while (var9.a > 0) {
/*     */             
/* 173 */             int var13 = this.furnaceRand.nextInt(21) + 10;
/*     */             
/* 175 */             if (var13 > var9.a)
/*     */             {
/* 177 */               var13 = var9.a;
/*     */             }
/*     */             
/* 180 */             var9.a -= var13;
/* 181 */             px var14 = new px(par1World, (par2 + var10), (par3 + var11), (par4 + var12), new ur(var9.c, var13, var9.j()));
/*     */             
/* 183 */             if (var9.o())
/*     */             {
/* 185 */               var14.d().d((bq)var9.p().b());
/*     */             }
/*     */             
/* 188 */             float var15 = 0.05F;
/* 189 */             var14.w = ((float)this.furnaceRand.nextGaussian() * var15);
/* 190 */             var14.x = ((float)this.furnaceRand.nextGaussian() * var15 + 0.2F);
/* 191 */             var14.y = ((float)this.furnaceRand.nextGaussian() * var15);
/* 192 */             par1World.d((lq)var14);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 198 */     super.a(par1World, par2, par3, par4, par5, par6); } public int quanityDropped(Random random) { return 1; }
/*     */   public int d() { return -1; }
/*     */   public boolean c() { return false; }
/*     */   public boolean b() { return false; }
/*     */   public void g(yc par1World, int par2, int par3, int par4) { super.g(par1World, par2, par3, par4); setDefaultDirection(par1World, par2, par3, par4); }
/*     */   public void a(yc par1World, int par2, int par3, int par4, md par5EntityLiving) { int var6 = ke.c((par5EntityLiving.z * 4.0F / 360.0F) + 2.5D) & 0x3; par1World.c(par2, par3, par4, var6); }
/*     */   private void setDefaultDirection(yc par1World, int par2, int par3, int par4) { if (par1World.I) return;  int i = par1World.a(par2, par3, par4 - 1); int j = par1World.a(par2, par3, par4 + 1); int k = par1World.a(par2 - 1, par3, par4); int l = par1World.a(par2 + 1, par3, par4); byte byte0 = 3; if (amq.q[i] && !amq.q[j]) byte0 = 3;  if (amq.q[j] && !amq.q[i]) byte0 = 2;  if (amq.q[k] && !amq.q[l])
/*     */       byte0 = 5;  if (amq.q[l] && !amq.q[k])
/*     */       byte0 = 4;  par1World.c(par2, par3, par4, byte0); }
/* 207 */   public boolean a(yc var1, int var2, int var3, int var4, qx var5, int var6, float var7, float var8, float var9) { any tileEntity = var1.q(var2, var3, var4);
/*     */     
/* 209 */     if (tileEntity == null || var5.ah()) {
/* 210 */       return false;
/*     */     }
/*     */     
/* 213 */     var5.openGui(mod_SCP.instance, 2, var1, var2, var3, var4);
/* 214 */     return true; }
/*     */ 
/*     */ 
/*     */   
/*     */   public any a(yc var1) {
/* 219 */     return (any)new SCPTileEntity294();
/*     */   } }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlock294.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */