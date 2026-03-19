/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import ModLoader;
/*     */ import SCPCraft.mod_Others;
/*     */ import SCPCraft.mod_SCP;
/*     */ import SCPCraft.tileentities.SCPTileEntityRemoteDoorComp;
/*     */ import agi;
/*     */ import akb;
/*     */ import amq;
/*     */ import any;
/*     */ import aoe;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import ke;
/*     */ import lq;
/*     */ import md;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import qx;
/*     */ import yc;
/*     */ import ym;
/*     */ 
/*     */ 
/*     */ public class SCPBlockRemoteDoorComputer
/*     */   extends akb
/*     */ {
/*     */   private Class SCPEntityRemoteDoorClass;
/*     */   
/*     */   public SCPBlockRemoteDoorComputer(int i, int j) {
/*  29 */     super(i, j, agi.f);
/*  30 */     a(mod_SCP.tabBlockSCP);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(yc par1World, int par2, int par3, int par4, qx par5EntityPlayer, int par6, float par7, float par8, float par9) {
/*  39 */     Minecraft mc = ModLoader.getMinecraftInstance();
/*  40 */     if (!par1World.I) {
/*     */       
/*  42 */       int var10 = par1World.h(par2, par3, par4);
/*  43 */       int var11 = var10 & 0x7;
/*  44 */       int var12 = 8 - (var10 & 0x8);
/*     */       
/*  46 */       if (mod_Others.remoteDoorActivate) {
/*     */         
/*  48 */         mod_Others.remoteDoorActivate = false;
/*  49 */         par1World.a(par2 + 0.5D, par3 + 0.5D, par4 + 0.5D, "random.click", 0.3F, (var12 > 0) ? 0.6F : 0.5F);
/*  50 */         mc.g.b("Remote doors have been deactivated!");
/*     */       }
/*     */       else {
/*     */         
/*  54 */         mod_Others.remoteDoorActivate = true;
/*  55 */         par1World.a(par2 + 0.5D, par3 + 0.5D, par4 + 0.5D, "random.click", 0.3F, (var12 > 0) ? 0.6F : 0.5F);
/*  56 */         mc.g.b("Remote doors have been reactivated!");
/*     */       } 
/*     */     } 
/*  59 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int par1, Random par2Random, int par3) {
/*  64 */     return mod_SCP.RemoteDoorComputer.cm;
/*     */   }
/*     */ 
/*     */   
/*     */   public aoe getSelectedBoundingBoxFromPool_do(yc world, int i, int j, int k) {
/*  69 */     int l = world.h(i, j, k);
/*     */     
/*  71 */     if (l == 0) a(0.0F, 0.0F, 0.1F, 1.0F, 2.2F, 1.0F);
/*     */     
/*  73 */     if (l == 1) a(0.0F, 0.0F, 0.0F, 1.0F, 2.2F, 1.0F);
/*     */     
/*  75 */     if (l == 2) a(0.0F, 0.0F, 0.1F, 1.0F, 2.2F, 1.0F); 
/*  76 */     if (l == 3) a(0.0F, 0.0F, 0.0F, 1.0F, 2.2F, 1.0F); 
/*  77 */     return b_(world, i, j, k);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ym world, int i, int j, int k) {
/*  83 */     int l = world.h(i, j, k);
/*  84 */     if (l == 0) a(0.0F, 0.0F, 0.1F, 1.0F, 2.2F, 1.0F); 
/*  85 */     if (l == 1) a(0.0F, 0.0F, 0.0F, 1.0F, 2.2F, 1.0F); 
/*  86 */     if (l == 2) a(0.0F, 0.0F, 0.1F, 1.0F, 2.2F, 1.0F); 
/*  87 */     if (l == 3) a(0.0F, 0.0F, 0.0F, 1.0F, 2.2F, 1.0F);
/*     */   
/*     */   }
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, aoe par5AxisAlignedBB, List par6ArrayList, lq par7Entity) {
/*  92 */     int i = par1World.h(par2, par3, par4);
/*  93 */     if (i == 0) a(0.0F, 0.0F, 0.1F, 1.0F, 2.2F, 1.0F); 
/*  94 */     if (i == 1) a(0.0F, 0.0F, 0.0F, 1.0F, 2.2F, 1.0F); 
/*  95 */     if (i == 2) a(0.0F, 0.0F, 0.1F, 1.0F, 2.2F, 1.0F); 
/*  96 */     if (i == 3) a(0.0F, 0.0F, 0.0F, 1.0F, 2.2F, 1.0F); 
/*  97 */     super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public int quanityDropped(Random random) {
/* 102 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/* 107 */     return mod_Others.RemoteDoorCompID;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 112 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 117 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void g(yc par1World, int par2, int par3, int par4) {
/* 125 */     super.g(par1World, par2, par3, par4);
/* 126 */     setDefaultDirection(par1World, par2, par3, par4);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, md par5EntityLiving) {
/* 131 */     int var6 = ke.c((par5EntityLiving.z * 4.0F / 360.0F) + 2.5D) & 0x3;
/* 132 */     par1World.c(par2, par3, par4, var6);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void setDefaultDirection(yc par1World, int par2, int par3, int par4) {
/* 140 */     if (par1World.I) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 145 */     int i = par1World.a(par2, par3, par4 - 1);
/* 146 */     int j = par1World.a(par2, par3, par4 + 1);
/* 147 */     int k = par1World.a(par2 - 1, par3, par4);
/* 148 */     int l = par1World.a(par2 + 1, par3, par4);
/* 149 */     byte byte0 = 3;
/*     */     
/* 151 */     if (amq.q[i] && !amq.q[j])
/*     */     {
/* 153 */       byte0 = 3;
/*     */     }
/*     */     
/* 156 */     if (amq.q[j] && !amq.q[i])
/*     */     {
/* 158 */       byte0 = 2;
/*     */     }
/*     */     
/* 161 */     if (amq.q[k] && !amq.q[l])
/*     */     {
/* 163 */       byte0 = 5;
/*     */     }
/*     */     
/* 166 */     if (amq.q[l] && !amq.q[k])
/*     */     {
/* 168 */       byte0 = 4;
/*     */     }
/*     */     
/* 171 */     par1World.c(par2, par3, par4, byte0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(yc var1, int var2, int var3, int var4, int var5, int var6) {
/* 180 */     ModLoader.genericContainerRemoval(var1, var2, var3, var4);
/* 181 */     super.a(var1, var2, var3, var4, var5, var6);
/*     */   }
/*     */ 
/*     */   
/*     */   public any a(yc var1) {
/* 186 */     return (any)new SCPTileEntityRemoteDoorComp();
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlockRemoteDoorComputer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */