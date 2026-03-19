/*     */ package SCPCraft.blocks;
/*     */ 
/*     */ import SCPCraft.mod_Others;
/*     */ import SCPCraft.mod_SCP;
/*     */ import SCPCraft.tileentities.SCPTileEntityAlarm;
/*     */ import agi;
/*     */ import akb;
/*     */ import any;
/*     */ import aoe;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import lq;
/*     */ import md;
/*     */ import qx;
/*     */ import ur;
/*     */ import yc;
/*     */ import ym;
/*     */ 
/*     */ public class SCPBlockAlarm
/*     */   extends akb
/*     */ {
/*     */   public SCPBlockAlarm(int par1) {
/*  25 */     super(par1, 211, agi.f);
/*  26 */     a(mod_SCP.tabBlockSCP);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(yc par1World, int par2, int par3, int par4, qx par5EntityPlayer, int par6, float par7, float par8, float par9) {
/*  31 */     ur itemstack = par5EntityPlayer.bJ.g();
/*  32 */     SCPTileEntityAlarm var7 = (SCPTileEntityAlarm)par1World.q(par2, par3, par4);
/*  33 */     if (itemstack != null && (itemstack.c == mod_SCP.Wrench.cj || itemstack.c == mod_SCP.GodlyWrench.cj)) {
/*     */       
/*  35 */       itemstack.a(1, (md)par5EntityPlayer);
/*  36 */       if (var7.alarmType != 3) { var7.alarmType++; }
/*  37 */       else { var7.alarmType = 0; }
/*  38 */        if (!par1World.I) par5EntityPlayer.b("AlarmType: " + var7.alarmType); 
/*     */     } 
/*  40 */     par1World.a(par2, par3, par4, this.cm, r_());
/*  41 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(yc par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9) {
/*  46 */     int var10 = par9 & 0x3;
/*  47 */     byte var11 = 0;
/*     */     
/*  49 */     switch (par5) {
/*     */       
/*     */       case 0:
/*  52 */         var11 = 1;
/*     */         break;
/*     */       case 1:
/*  55 */         var11 = 0;
/*     */         break;
/*     */       case 2:
/*  58 */         var11 = 5;
/*     */         break;
/*     */       case 3:
/*  61 */         var11 = 3;
/*     */         break;
/*     */       case 4:
/*  64 */         var11 = 4;
/*     */         break;
/*     */       case 5:
/*  67 */         var11 = 2;
/*     */         break;
/*     */     } 
/*  70 */     return var10 | var11;
/*     */   }
/*     */ 
/*     */   
/*     */   public aoe getSelectedBoundingBoxFromPool_do(yc world, int i, int j, int k) {
/*  75 */     int l = world.h(i, j, k);
/*  76 */     if (l == 0) a(0.0F, 0.0F, 0.0F, 1.0F, 0.35F, 1.0F); 
/*  77 */     if (l == 1) a(0.0F, 0.65F, 0.0F, 1.0F, 1.0F, 1.0F); 
/*  78 */     if (l == 2) a(0.0F, 0.0F, 0.0F, 0.35F, 1.0F, 1.0F); 
/*  79 */     if (l == 3) a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.35F); 
/*  80 */     if (l == 4) a(0.65F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F); 
/*  81 */     if (l == 5) a(0.0F, 0.0F, 0.65F, 1.0F, 1.0F, 1.0F); 
/*  82 */     return b_(world, i, j, k);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ym world, int i, int j, int k) {
/*  88 */     int l = world.h(i, j, k);
/*  89 */     if (l == 0) a(0.0F, 0.0F, 0.0F, 1.0F, 0.35F, 1.0F); 
/*  90 */     if (l == 1) a(0.0F, 0.65F, 0.0F, 1.0F, 1.0F, 1.0F); 
/*  91 */     if (l == 2) a(0.0F, 0.0F, 0.0F, 0.35F, 1.0F, 1.0F); 
/*  92 */     if (l == 3) a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.35F); 
/*  93 */     if (l == 4) a(0.65F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F); 
/*  94 */     if (l == 5) a(0.0F, 0.0F, 0.65F, 1.0F, 1.0F, 1.0F);
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, aoe par5AxisAlignedBB, List par6ArrayList, lq par7Entity) {
/* 103 */     int i = par1World.h(par2, par3, par4);
/* 104 */     if (i == 0) a(0.0F, 0.0F, 0.0F, 1.0F, 0.35F, 1.0F); 
/* 105 */     if (i == 1) a(0.0F, 0.65F, 0.0F, 1.0F, 1.0F, 1.0F); 
/* 106 */     if (i == 2) a(0.0F, 0.0F, 0.0F, 0.35F, 1.0F, 1.0F); 
/* 107 */     if (i == 3) a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.35F); 
/* 108 */     if (i == 4) a(0.65F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F); 
/* 109 */     if (i == 5) a(0.0F, 0.0F, 0.65F, 1.0F, 1.0F, 1.0F); 
/* 110 */     super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList, par7Entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int par1, int par2) {
/* 115 */     if (par2 == 0 && par1 == 1) { this.cl = 73; }
/* 116 */     else if (par2 == 1 && par1 == 0) { this.cl = 73; }
/* 117 */     else if (par2 == 2 && par1 == 5) { this.cl = 73; }
/* 118 */     else if (par2 == 3 && par1 == 3) { this.cl = 73; }
/* 119 */     else if (par2 == 4 && par1 == 4) { this.cl = 73; }
/* 120 */     else if (par2 == 5 && par1 == 2) { this.cl = 73; }
/* 121 */     else { this.cl = 72; }
/* 122 */      return this.cl;
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/* 127 */     return mod_Others.AlarmID;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, int par5) {
/* 132 */     if (par5 > 0) {
/*     */       
/* 134 */       boolean var6 = par1World.B(par2, par3, par4);
/* 135 */       SCPTileEntityAlarm var7 = (SCPTileEntityAlarm)par1World.q(par2, par3, par4);
/* 136 */       if (var6)
/*     */       {
/* 138 */         var7.triggerNote(par1World, par2, par3, par4);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTextureFile() {
/* 145 */     return "/SCPCraft/textures/SCPblox.png";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 150 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 155 */     return false;
/*     */   }
/*     */   
/*     */   public boolean canConnectRedstone(ym world, int x, int y, int z, int side) {
/* 159 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public any a(yc var1) {
/* 165 */     return (any)new SCPTileEntityAlarm();
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int par1, Random par2Random, int par3) {
/* 170 */     return mod_SCP.Alarm.cm;
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int a(yc par1World, int par2, int par3, int par4) {
/* 176 */     return mod_SCP.Alarm.cm;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/blocks/SCPBlockAlarm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */