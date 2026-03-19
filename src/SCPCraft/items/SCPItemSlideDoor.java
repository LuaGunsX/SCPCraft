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
/*     */ public class SCPItemSlideDoor
/*     */   extends up
/*     */ {
/*     */   private agi doorMaterial;
/*     */   
/*     */   public SCPItemSlideDoor(int par1, agi par2Material) {
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
/*  40 */     amq var11 = mod_SCP.SlidingDoor;
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
/*  51 */       if (var12 == 3) {
/*     */         
/*  53 */         par3World.d(par4, par5, par6, mod_SCP.SlidingDoor.cm, 0);
/*  54 */         par3World.d(par4, par5 + 1, par6, mod_SCP.SlidingDoor.cm, 2);
/*     */       } 
/*  56 */       if (var12 == 0) {
/*     */         
/*  58 */         par3World.d(par4, par5, par6, mod_SCP.SlidingDoor.cm, 1);
/*  59 */         par3World.d(par4, par5 + 1, par6, mod_SCP.SlidingDoor.cm, 3);
/*     */       } 
/*  61 */       if (var12 == 1) {
/*     */         
/*  63 */         par3World.d(par4, par5, par6, mod_SCP.SlidingDoor.cm, 8);
/*  64 */         par3World.d(par4, par5 + 1, par6, mod_SCP.SlidingDoor.cm, 10);
/*     */       } 
/*  66 */       if (var12 == 2) {
/*     */         
/*  68 */         par3World.d(par4, par5, par6, mod_SCP.SlidingDoor.cm, 9);
/*  69 */         par3World.d(par4, par5 + 1, par6, mod_SCP.SlidingDoor.cm, 11);
/*     */       } 
/*  71 */       par1ItemStack.a--;
/*  72 */       return true;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  77 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void placeDoorBlock(yc par3World, int par4, int par5, int par6, int par7) {
/*  84 */     if (par7 == 3) {
/*     */       
/*  86 */       par3World.d(par4, par5, par6, mod_SCP.SlidingDoor.cm, 0);
/*  87 */       par3World.d(par4, par5 + 1, par6, mod_SCP.SlidingDoor.cm, 2);
/*     */     } 
/*  89 */     if (par7 == 0) {
/*     */       
/*  91 */       par3World.d(par4, par5, par6, mod_SCP.SlidingDoor.cm, 1);
/*  92 */       par3World.d(par4, par5 + 1, par6, mod_SCP.SlidingDoor.cm, 3);
/*     */     } 
/*  94 */     if (par7 == 1) {
/*     */       
/*  96 */       par3World.d(par4, par5, par6, mod_SCP.SlidingDoor.cm, 8);
/*  97 */       par3World.d(par4, par5 + 1, par6, mod_SCP.SlidingDoor.cm, 10);
/*     */     } 
/*  99 */     if (par7 == 2) {
/*     */       
/* 101 */       par3World.d(par4, par5, par6, mod_SCP.SlidingDoor.cm, 9);
/* 102 */       par3World.d(par4, par5 + 1, par6, mod_SCP.SlidingDoor.cm, 11);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItemSlideDoor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */