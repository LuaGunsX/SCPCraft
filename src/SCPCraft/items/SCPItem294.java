/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import amq;
/*     */ import java.util.List;
/*     */ import lq;
/*     */ import md;
/*     */ import qx;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public class SCPItem294
/*     */   extends SCPItemDocument {
/*  14 */   int spawnID = mod_SCP.SCP294.cm;
/*     */   
/*     */   public SCPItem294(int i) {
/*  17 */     super(i);
/*  18 */     this.ck = 1;
/*  19 */     e(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  24 */     list.add("§eSCP-294");
/*  25 */     list.add("§7The Coffee Machine");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean n_() {
/*  30 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/*  35 */     int var11 = par3World.a(par4, par5, par6);
/*     */     
/*  37 */     if (var11 == amq.aV.cm) {
/*     */       
/*  39 */       par7 = 1;
/*     */     }
/*  41 */     else if (var11 != amq.bx.cm && var11 != amq.aa.cm && var11 != amq.ab.cm) {
/*     */       
/*  43 */       if (par7 == 0)
/*     */       {
/*  45 */         par5--;
/*     */       }
/*     */       
/*  48 */       if (par7 == 1)
/*     */       {
/*  50 */         par5++;
/*     */       }
/*     */       
/*  53 */       if (par7 == 2)
/*     */       {
/*  55 */         par6--;
/*     */       }
/*     */       
/*  58 */       if (par7 == 3)
/*     */       {
/*  60 */         par6++;
/*     */       }
/*     */       
/*  63 */       if (par7 == 4)
/*     */       {
/*  65 */         par4--;
/*     */       }
/*     */       
/*  68 */       if (par7 == 5)
/*     */       {
/*  70 */         par4++;
/*     */       }
/*     */     } 
/*     */     
/*  74 */     if (par1ItemStack.a == 0)
/*     */     {
/*  76 */       return false;
/*     */     }
/*  78 */     if (!par2EntityPlayer.a(par4, par5, par6, par7, par1ItemStack))
/*     */     {
/*  80 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  84 */     if (par3World.a(this.spawnID, par4, par5, par6, false, par7, (lq)null)) {
/*     */       
/*  86 */       amq var12 = amq.p[this.spawnID];
/*  87 */       int var13 = a(par1ItemStack.j());
/*  88 */       int var14 = amq.p[this.spawnID].a(par3World, par4, par5, par6, par7, par8, par9, par10, var13);
/*     */       
/*  90 */       if (placeBlockAt(par1ItemStack, par2EntityPlayer, par3World, par4, par5, par6, par7, par8, par9, par10, var14)) {
/*     */         
/*  92 */         par3World.a(par4 + 0.5D, par5 + 0.5D, par6 + 0.5D, "fire.ignite", 1.0F, d.nextFloat() * 0.4F + 0.8F);
/*  93 */         par1ItemStack.a--;
/*  94 */         par2EntityPlayer.b("SCP-294 Spawned. | [Type: §eEuclid§f]");
/*     */       } 
/*     */     } 
/*     */     
/*  98 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean placeBlockAt(ur stack, qx player, yc world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int metadata) {
/* 104 */     if (!world.d(x, y, z, this.spawnID, metadata))
/*     */     {
/* 106 */       return false;
/*     */     }
/*     */     
/* 109 */     if (world.a(x, y, z) == this.spawnID) {
/*     */       
/* 111 */       amq.p[this.spawnID].a(world, x, y, z, (md)player);
/* 112 */       amq.p[this.spawnID].g(world, x, y, z, metadata);
/*     */     } 
/*     */     
/* 115 */     return true;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem294.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */