/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import SCPCraft.worldgen.SCPWorldGenPocketDimension;
/*     */ import aoe;
/*     */ import asv;
/*     */ import bq;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import jl;
/*     */ import lh;
/*     */ import ll;
/*     */ import lm;
/*     */ import lq;
/*     */ import md;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import qx;
/*     */ import up;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity106
/*     */   extends SCPEntity {
/*  24 */   qx entityplayer = this.p.b((lq)this, 16.0D);
/*     */   
/*     */   public boolean isAttacking;
/*     */   
/*     */   private int heightOffsetUpdateTime;
/*     */   
/*     */   private float heightOffset;
/*     */   
/*     */   public static int PDDuration;
/*     */   
/*     */   public static boolean didPlayerWin;
/*     */   public static double OverworldX;
/*     */   public static double OverworldY;
/*     */   public static double OverworldZ;
/*     */   public static boolean PocketDimension = false;
/*     */   
/*     */   public SCPEntity106(yc par1World) {
/*  41 */     super(par1World);
/*  42 */     this.aG = "/SCPCraft/textures/mobs/106.png";
/*  43 */     this.bH = 0.3F;
/*  44 */     this.attackStrength = 6;
/*  45 */     this.isAttacking = true;
/*  46 */     this; PDDuration = 0;
/*  47 */     a(0.8F, 1.8F);
/*  48 */     this.af = true;
/*  49 */     this.X = 2.0F;
/*  50 */     this; didPlayerWin = false;
/*  51 */     az().a(true);
/*  52 */     az().g();
/*  53 */     az().a((md)this.a_);
/*  54 */     az().a((md)this.a_, 1.0F);
/*  55 */     az().c(true);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean be() {
/*  60 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected String aY() {
/*  65 */     return "sounds.oldman";
/*     */   }
/*     */ 
/*     */   
/*     */   public void d(double par1, double par3, double par5) {
/*  70 */     this.p.D.a("move");
/*  71 */     this.D.d(par1, 0.0D, par5);
/*  72 */     this.W *= 0.4F;
/*  73 */     double d = this.t;
/*  74 */     double d1 = this.v;
/*  75 */     double d2 = par1;
/*  76 */     double d3 = par3;
/*  77 */     double d4 = par5;
/*  78 */     aoe axisalignedbb = this.D.c();
/*     */     
/*  80 */     List<aoe> list = this.p.a((lq)this, this.D.a(par1, par3, par5));
/*     */     
/*  82 */     for (int i = 0; i < list.size(); i++)
/*     */     {
/*  84 */       par3 = ((aoe)list.get(i)).b(this.D, par3);
/*     */     }
/*     */     
/*  87 */     this.D.d(0.0D, par3, 0.0D);
/*     */     
/*  89 */     if (!this.K && d3 != par3)
/*     */     {
/*  91 */       par1 = par3 = par5 = 0.0D;
/*     */     }
/*     */     
/*  94 */     boolean flag1 = (this.E || (d3 != par3 && d3 < 0.0D));
/*     */     
/*  96 */     for (int j = 0; j < list.size(); j++)
/*     */     {
/*  98 */       par1 = ((aoe)list.get(j)).a(this.D, par1);
/*     */     }
/*     */     
/* 101 */     this.D.d(par1, 0.0D, 0.0D);
/*     */     
/* 103 */     if (!this.K && d2 != par1)
/*     */     {
/* 105 */       par1 = par3 = par5 = 0.0D;
/*     */     }
/*     */     
/* 108 */     for (int k = 0; k < list.size(); k++)
/*     */     {
/* 110 */       par5 = ((aoe)list.get(k)).c(this.D, par5);
/*     */     }
/*     */     
/* 113 */     this.D.d(0.0D, 0.0D, par5);
/*     */     
/* 115 */     if (!this.K && d4 != par5)
/*     */     {
/* 117 */       par1 = par3 = par5 = 0.0D;
/*     */     }
/*     */     
/* 120 */     if (this.X > 0.0F && flag1 && this.W < 0.05F && (d2 != par1 || d4 != par5)) {
/*     */       
/* 122 */       double d6 = par1;
/* 123 */       double d8 = par3;
/* 124 */       double d10 = par5;
/* 125 */       par1 = d2;
/* 126 */       par3 = this.X;
/* 127 */       par5 = d4;
/* 128 */       aoe axisalignedbb1 = this.D.c();
/* 129 */       this.D.c(axisalignedbb);
/* 130 */       List<aoe> list1 = this.p.a((lq)this, this.D.a(par1, par3, par5));
/*     */       
/* 132 */       for (int j2 = 0; j2 < list1.size(); j2++)
/*     */       {
/* 134 */         par3 = ((aoe)list1.get(j2)).b(this.D, par3);
/*     */       }
/*     */       
/* 137 */       this.D.d(0.0D, par3, 0.0D);
/*     */       
/* 139 */       if (!this.K && d3 != par3)
/*     */       {
/* 141 */         par1 = par3 = par5 = 0.0D;
/*     */       }
/*     */       
/* 144 */       for (int k2 = 0; k2 < list1.size(); k2++)
/*     */       {
/* 146 */         par1 = ((aoe)list1.get(k2)).a(this.D, par1);
/*     */       }
/*     */       
/* 149 */       this.D.d(par1, 0.0D, 0.0D);
/*     */       
/* 151 */       if (!this.K && d2 != par1)
/*     */       {
/* 153 */         par1 = par3 = par5 = 0.0D;
/*     */       }
/*     */       
/* 156 */       for (int l2 = 0; l2 < list1.size(); l2++)
/*     */       {
/* 158 */         par5 = ((aoe)list1.get(l2)).c(this.D, par5);
/*     */       }
/*     */       
/* 161 */       this.D.d(0.0D, 0.0D, par5);
/*     */       
/* 163 */       if (!this.K && d4 != par5)
/*     */       {
/* 165 */         par1 = par3 = par5 = 0.0D;
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 170 */       par1 = par3 = par5 = 0.0D;
/*     */ 
/*     */ 
/*     */       
/* 174 */       par3 = -this.X;
/*     */       
/* 176 */       for (int i3 = 0; i3 < list1.size(); i3++)
/*     */       {
/* 178 */         par3 = ((aoe)list1.get(i3)).b(this.D, par3);
/*     */       }
/*     */       
/* 181 */       this.D.d(0.0D, par3, 0.0D);
/*     */ 
/*     */       
/* 184 */       if (d6 * d6 + d10 * d10 >= par1 * par1 + par5 * par5) {
/*     */         
/* 186 */         par1 = d6;
/* 187 */         par3 = d8;
/* 188 */         par5 = d10;
/* 189 */         this.D.c(axisalignedbb1);
/*     */       }
/*     */       else {
/*     */         
/* 193 */         double d11 = this.D.b - (int)this.D.b;
/*     */         
/* 195 */         if (d11 > 0.0D)
/*     */         {
/* 197 */           this.W = (float)(this.W + d11 + 0.01D);
/*     */         }
/*     */       } 
/*     */     } 
/* 201 */     this.t = (this.D.a + this.D.d) / 2.0D;
/* 202 */     this.u = this.D.b + this.M - this.W;
/* 203 */     this.v = (this.D.c + this.D.f) / 2.0D;
/* 204 */     this.E = (d3 != par3 && d3 < 0.0D);
/* 205 */     a(par3, this.E);
/* 206 */     this.p.D.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/* 211 */     return 9001;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/* 216 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq nbt) {
/* 224 */     super.b(nbt);
/* 225 */     this; nbt.a("playerX", OverworldX);
/* 226 */     this; nbt.a("playerY", OverworldY);
/* 227 */     this; nbt.a("playerZ", OverworldZ);
/* 228 */     this; nbt.a("pocketDimensionWin", didPlayerWin);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq nbt) {
/* 236 */     super.a(nbt);
/* 237 */     this; OverworldX = nbt.h("playerX");
/* 238 */     this; OverworldY = nbt.h("playerY");
/* 239 */     this; OverworldZ = nbt.h("playerZ");
/*     */     
/* 241 */     this; didPlayerWin = nbt.n("pocketDimensionWin");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(lh par1DamageSource, int par2) {
/* 246 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/* 251 */     super.c();
/*     */     
/* 253 */     qx player = this.p.b((lq)this, 256.0D);
/*     */     
/* 255 */     if (player != null) {
/*     */       
/* 257 */       this; if (PDDuration > 0) {
/*     */         
/* 259 */         this; PDDuration--;
/*     */       } 
/*     */       
/* 262 */       this; if (PDDuration == 1 && player.S()) {
/*     */         
/* 264 */         player.a(OverworldX, OverworldY + 2.0D, OverworldZ);
/* 265 */         player.a((jl)mod_SCP.pocketD, 1);
/* 266 */         player.a((jl)mod_SCP.pocketD);
/* 267 */         Random rand = new Random();
/* 268 */         int chance = rand.nextInt(4);
/*     */         
/* 270 */         switch (chance) {
/*     */           
/*     */           case 0:
/* 273 */             player.bJ.a(new ur(mod_SCP.Record079));
/*     */             break;
/*     */           case 1:
/* 276 */             player.bJ.a(new ur(mod_SCP.Record789J));
/*     */             break;
/*     */           case 2:
/* 279 */             player.bJ.a(new ur(mod_SCP.Record914));
/*     */             break;
/*     */           case 3:
/* 282 */             player.bJ.a(new ur(mod_SCP.Record173E));
/*     */             break;
/*     */         } 
/*     */         
/* 286 */         player.by();
/*     */         
/* 288 */         this; didPlayerWin = true;
/* 289 */         C();
/*     */       } 
/*     */       
/* 292 */       if (player.L && !player.S()) {
/*     */         
/* 294 */         this; PDDuration = 0;
/* 295 */         a(OverworldX + 2.0D, OverworldY + 2.0D, OverworldZ + 2.0D);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void c_(qx player) {
/* 303 */     if (this.u != 5.0D) {
/*     */       
/* 305 */       this; OverworldX = player.t;
/* 306 */       this; OverworldY = player.u;
/* 307 */       this; OverworldZ = player.v;
/*     */       
/* 309 */       Minecraft mc = Minecraft.x();
/*     */       
/* 311 */       if (mc.b.g()) {
/*     */         
/* 313 */         player.bJ.d(up.aG.cj);
/* 314 */         player.bJ.d(mod_SCP.SCP500G.cj);
/* 315 */         player.a(player.t, 5.0D, player.v - 1.0D);
/* 316 */         player.d(new lm(ll.d.H, 12000, 2));
/* 317 */         SCPWorldGenPocketDimension.generate(this.p, (int)this.t, (int)this.u, (int)this.v);
/* 318 */         mc.y.a(asv.g, 3);
/*     */         
/* 320 */         a(this.t + 10.0D, 5.0D, this.v - 2.0D);
/*     */         
/* 322 */         this; PDDuration = this.aa.nextInt(4000);
/*     */       } 
/*     */     } else {
/* 325 */       player.a(mod_SCP.SCP106, 6);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity106.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */