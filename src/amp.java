/*     */ import SCPCraft.mod_SCP;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class amp
/*     */   extends amq
/*     */ {
/*     */   private int a;
/*     */   private final boolean b;
/*     */   
/*     */   protected amp(int par1, int par2, int par3, agi par4Material, boolean par5) {
/*  31 */     super(par1, par2, par4Material);
/*  32 */     this.a = par3;
/*  33 */     this.b = par5;
/*  34 */     a(tj.c);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(int par1, Random par2Random, int par3) {
/*  42 */     return !this.b ? 0 : super.a(par1, par2Random, par3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  51 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  59 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int d() {
/*  67 */     return 18;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public boolean a(ym par1IBlockAccess, int par2, int par3, int par4, int par5) {
/*  78 */     int var6 = par1IBlockAccess.a(par2, par3, par4);
/*  79 */     return (var6 == this.cm) ? false : super.a(par1IBlockAccess, par2, par3, par4, par5);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(yc par1World, int par2, int par3, int par4, aoe par5AxisAlignedBB, List par6List, lq par7Entity) {
/*  87 */     boolean var8 = e(par1World.a(par2, par3, par4 - 1));
/*  88 */     boolean var9 = e(par1World.a(par2, par3, par4 + 1));
/*  89 */     boolean var10 = e(par1World.a(par2 - 1, par3, par4));
/*  90 */     boolean var11 = e(par1World.a(par2 + 1, par3, par4));
/*     */     
/*  92 */     if ((!var10 || !var11) && (var10 || var11 || var8 || var9)) {
/*     */       
/*  94 */       if (var10 && !var11)
/*     */       {
/*  96 */         a(0.0F, 0.0F, 0.4375F, 0.5F, 1.0F, 0.5625F);
/*  97 */         super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
/*     */       }
/*  99 */       else if (!var10 && var11)
/*     */       {
/* 101 */         a(0.5F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
/* 102 */         super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/* 107 */       a(0.0F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
/* 108 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
/*     */     } 
/*     */     
/* 111 */     if ((!var8 || !var9) && (var10 || var11 || var8 || var9)) {
/*     */       
/* 113 */       if (var8 && !var9)
/*     */       {
/* 115 */         a(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 0.5F);
/* 116 */         super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
/*     */       }
/* 118 */       else if (!var8 && var9)
/*     */       {
/* 120 */         a(0.4375F, 0.0F, 0.5F, 0.5625F, 1.0F, 1.0F);
/* 121 */         super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/* 126 */       a(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 1.0F);
/* 127 */       super.a(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void f() {
/* 136 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ym par1IBlockAccess, int par2, int par3, int par4) {
/* 144 */     float var5 = 0.4375F;
/* 145 */     float var6 = 0.5625F;
/* 146 */     float var7 = 0.4375F;
/* 147 */     float var8 = 0.5625F;
/* 148 */     boolean var9 = e(par1IBlockAccess.a(par2, par3, par4 - 1));
/* 149 */     boolean var10 = e(par1IBlockAccess.a(par2, par3, par4 + 1));
/* 150 */     boolean var11 = e(par1IBlockAccess.a(par2 - 1, par3, par4));
/* 151 */     boolean var12 = e(par1IBlockAccess.a(par2 + 1, par3, par4));
/*     */     
/* 153 */     if ((!var11 || !var12) && (var11 || var12 || var9 || var10)) {
/*     */       
/* 155 */       if (var11 && !var12)
/*     */       {
/* 157 */         var5 = 0.0F;
/*     */       }
/* 159 */       else if (!var11 && var12)
/*     */       {
/* 161 */         var6 = 1.0F;
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/* 166 */       var5 = 0.0F;
/* 167 */       var6 = 1.0F;
/*     */     } 
/*     */     
/* 170 */     if ((!var9 || !var10) && (var11 || var12 || var9 || var10)) {
/*     */       
/* 172 */       if (var9 && !var10)
/*     */       {
/* 174 */         var7 = 0.0F;
/*     */       }
/* 176 */       else if (!var9 && var10)
/*     */       {
/* 178 */         var8 = 1.0F;
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/* 183 */       var7 = 0.0F;
/* 184 */       var8 = 1.0F;
/*     */     } 
/*     */     
/* 187 */     a(var5, 0.0F, var7, var6, 1.0F, var8);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int p() {
/* 197 */     return this.a;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean e(int par1) {
/* 207 */     return (amq.q[par1] || par1 == this.cm || par1 == amq.P.cm || par1 == mod_SCP.SlidingDoor.cm);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean s_() {
/* 215 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected ur f_(int par1) {
/* 224 */     return new ur(this.cm, 1, par1);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/amp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */