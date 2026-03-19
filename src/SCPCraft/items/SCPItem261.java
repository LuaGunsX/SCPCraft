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
/*     */ public class SCPItem261
/*     */   extends SCPItemDocument {
/*  14 */   int spawnID = mod_SCP.SCP261.cm;
/*     */   
/*     */   public SCPItem261(int i) {
/*  17 */     super(i);
/*  18 */     this.ck = 1;
/*  19 */     e(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  24 */     list.add("§2SCP-261");
/*  25 */     list.add("§7Pan Dimensional Vending");
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
/*  47 */       if (par7 == 1)
/*     */       {
/*  49 */         par5++;
/*     */       }
/*  51 */       if (par7 == 2)
/*     */       {
/*  53 */         par6--;
/*     */       }
/*  55 */       if (par7 == 3)
/*     */       {
/*  57 */         par6++;
/*     */       }
/*  59 */       if (par7 == 4)
/*     */       {
/*  61 */         par4--;
/*     */       }
/*  63 */       if (par7 == 5)
/*     */       {
/*  65 */         par4++;
/*     */       }
/*     */     } 
/*     */     
/*  69 */     if (par1ItemStack.a == 0)
/*     */     {
/*  71 */       return false;
/*     */     }
/*  73 */     if (!par2EntityPlayer.a(par4, par5, par6, par7, par1ItemStack))
/*     */     {
/*  75 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  79 */     if (par3World.a(this.spawnID, par4, par5, par6, false, par7, (lq)null)) {
/*     */       
/*  81 */       amq var12 = amq.p[this.spawnID];
/*  82 */       int var13 = a(par1ItemStack.j());
/*  83 */       int var14 = amq.p[this.spawnID].a(par3World, par4, par5, par6, par7, par8, par9, par10, var13);
/*     */       
/*  85 */       if (placeBlockAt(par1ItemStack, par2EntityPlayer, par3World, par4, par5, par6, par7, par8, par9, par10, var14)) {
/*     */         
/*  87 */         par3World.a(par4 + 0.5D, par5 + 0.5D, par6 + 0.5D, "fire.ignite", 1.0F, d.nextFloat() * 0.4F + 0.8F);
/*  88 */         par1ItemStack.a--;
/*  89 */         par2EntityPlayer.b("SCP-261 Spawned. | [Type: §2Safe§f]");
/*     */       } 
/*     */     } 
/*     */     
/*  93 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean placeBlockAt(ur stack, qx player, yc world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int metadata) {
/*  99 */     if (!world.d(x, y, z, this.spawnID, metadata))
/*     */     {
/* 101 */       return false;
/*     */     }
/*     */     
/* 104 */     if (world.a(x, y, z) == this.spawnID) {
/*     */       
/* 106 */       amq.p[this.spawnID].a(world, x, y, z, (md)player);
/* 107 */       amq.p[this.spawnID].g(world, x, y, z, metadata);
/*     */     } 
/*     */     
/* 110 */     return true;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItem261.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */