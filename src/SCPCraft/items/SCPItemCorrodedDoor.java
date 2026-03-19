/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import agi;
/*     */ import amq;
/*     */ import ke;
/*     */ import qx;
/*     */ import up;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public class SCPItemCorrodedDoor
/*     */   extends up
/*     */ {
/*     */   private agi doorMaterial;
/*     */   
/*     */   public SCPItemCorrodedDoor(int par1, agi par2Material) {
/*  18 */     super(par1);
/*  19 */     this.doorMaterial = agi.f;
/*  20 */     this.ck = 1;
/*  21 */     a(mod_SCP.tabItemSCP);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTextureFile() {
/*  26 */     return "/SCPCraft/textures/SCPblox.png";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/*  31 */     if (par7 != 1)
/*     */     {
/*  33 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  37 */     par5++;
/*     */ 
/*     */     
/*  40 */     amq var11 = mod_SCP.CorrodedDoor;
/*     */     
/*  42 */     if (par2EntityPlayer.a(par4, par5, par6, par7, par1ItemStack) && par2EntityPlayer.a(par4, par5 + 1, par6, par7, par1ItemStack)) {
/*     */       
/*  44 */       if (!var11.b(par3World, par4, par5, par6))
/*     */       {
/*  46 */         return false;
/*     */       }
/*     */ 
/*     */       
/*  50 */       int var12 = ke.c(((par2EntityPlayer.z + 180.0F) * 4.0F / 360.0F) - 0.5D) & 0x3;
/*  51 */       placeDoorBlock(par3World, par4, par5, par6, var12, var11);
/*  52 */       par1ItemStack.a--;
/*  53 */       return true;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  58 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void placeDoorBlock(yc par0World, int par1, int par2, int par3, int par4, amq par5Block) {
/*  65 */     byte var6 = 0;
/*  66 */     byte var7 = 0;
/*     */     
/*  68 */     if (par4 == 0)
/*     */     {
/*  70 */       var7 = 1;
/*     */     }
/*     */     
/*  73 */     if (par4 == 1)
/*     */     {
/*  75 */       var6 = -1;
/*     */     }
/*     */     
/*  78 */     if (par4 == 2)
/*     */     {
/*  80 */       var7 = -1;
/*     */     }
/*     */     
/*  83 */     if (par4 == 3)
/*     */     {
/*  85 */       var6 = 1;
/*     */     }
/*     */     
/*  88 */     int var8 = (par0World.t(par1 - var6, par2, par3 - var7) ? 1 : 0) + (par0World.t(par1 - var6, par2 + 1, par3 - var7) ? 1 : 0);
/*  89 */     int var9 = (par0World.t(par1 + var6, par2, par3 + var7) ? 1 : 0) + (par0World.t(par1 + var6, par2 + 1, par3 + var7) ? 1 : 0);
/*  90 */     boolean var10 = (par0World.a(par1 - var6, par2, par3 - var7) == par5Block.cm || par0World.a(par1 - var6, par2 + 1, par3 - var7) == par5Block.cm);
/*  91 */     boolean var11 = (par0World.a(par1 + var6, par2, par3 + var7) == par5Block.cm || par0World.a(par1 + var6, par2 + 1, par3 + var7) == par5Block.cm);
/*  92 */     boolean var12 = false;
/*     */     
/*  94 */     if (var10 && !var11) {
/*     */       
/*  96 */       var12 = true;
/*     */     }
/*  98 */     else if (var9 > var8) {
/*     */       
/* 100 */       var12 = true;
/*     */     } 
/*     */     
/* 103 */     par0World.r = true;
/* 104 */     par0World.d(par1, par2, par3, par5Block.cm, par4);
/* 105 */     par0World.d(par1, par2 + 1, par3, par5Block.cm, 0x8 | (var12 ? 1 : 0));
/* 106 */     par0World.r = false;
/* 107 */     par0World.h(par1, par2, par3, par5Block.cm);
/* 108 */     par0World.h(par1, par2 + 1, par3, par5Block.cm);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItemCorrodedDoor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */