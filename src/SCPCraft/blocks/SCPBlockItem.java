/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import amq;
/*     */ import lq;
/*     */ import md;
/*     */ import qx;
/*     */ import up;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public class SCPBlockItem
/*     */   extends up {
/*     */   private int spawnID;
/*     */   
/*     */   public SCPBlockItem(int par1, amq par2Block) {
/*  17 */     super(par1);
/*  18 */     this.spawnID = par2Block.cm;
/*  19 */     a(mod_SCP.tabItemSCP);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTextureFile() {
/*  24 */     return "/SCPCraft/textures/SCPblox.png";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/*  29 */     int var11 = par3World.a(par4, par5, par6);
/*     */     
/*  31 */     if (var11 == amq.aV.cm) {
/*     */       
/*  33 */       par7 = 1;
/*     */     }
/*  35 */     else if (var11 != amq.bx.cm && var11 != amq.aa.cm && var11 != amq.ab.cm) {
/*     */       
/*  37 */       if (par7 == 0)
/*     */       {
/*  39 */         par5--;
/*     */       }
/*     */       
/*  42 */       if (par7 == 1)
/*     */       {
/*  44 */         par5++;
/*     */       }
/*     */       
/*  47 */       if (par7 == 2)
/*     */       {
/*  49 */         par6--;
/*     */       }
/*     */       
/*  52 */       if (par7 == 3)
/*     */       {
/*  54 */         par6++;
/*     */       }
/*     */       
/*  57 */       if (par7 == 4)
/*     */       {
/*  59 */         par4--;
/*     */       }
/*     */       
/*  62 */       if (par7 == 5)
/*     */       {
/*  64 */         par4++;
/*     */       }
/*     */     } 
/*  67 */     if (par1ItemStack.a == 0)
/*     */     {
/*  69 */       return false;
/*     */     }
/*  71 */     if (!par2EntityPlayer.a(par4, par5, par6, par7, par1ItemStack))
/*     */     {
/*  73 */       return false;
/*     */     }
/*  75 */     if (par3World.a(this.spawnID, par4, par5, par6, false, par7, (lq)par2EntityPlayer)) {
/*     */       
/*  77 */       amq var12 = amq.p[this.spawnID];
/*  78 */       int var13 = a(par1ItemStack.j());
/*  79 */       int var14 = amq.p[this.spawnID].a(par3World, par4, par5, par6, par7, par8, par9, par10, var13);
/*     */       
/*  81 */       if (placeBlockAt(par1ItemStack, par2EntityPlayer, par3World, par4, par5, par6, par7, par8, par9, par10, var14)) {
/*     */         
/*  83 */         par3World.a((par4 + 0.5F), (par5 + 0.5F), (par6 + 0.5F), var12.cz.b(), (var12.cz.c() + 1.0F) / 2.0F, var12.cz.d() * 0.8F);
/*  84 */         par1ItemStack.a--;
/*     */       } 
/*     */       
/*  87 */       return true;
/*     */     } 
/*     */ 
/*     */     
/*  91 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean placeBlockAt(ur stack, qx player, yc world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int metadata) {
/* 105 */     if (!world.d(x, y, z, this.spawnID, metadata))
/*     */     {
/* 107 */       return false;
/*     */     }
/*     */     
/* 110 */     if (world.a(x, y, z) == this.spawnID) {
/*     */       
/* 112 */       amq.p[this.spawnID].a(world, x, y, z, (md)player);
/* 113 */       amq.p[this.spawnID].g(world, x, y, z, metadata);
/*     */     } 
/*     */     
/* 116 */     return true;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlockItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */