/*     */ package SCPCraft.guis;
/*     */ 
/*     */ import ModLoader;
/*     */ import SCPCraft.containerslots.SCPContainerButler;
/*     */ import SCPCraft.entities.SCPEntity106;
/*     */ import SCPCraft.entities.SCPEntityButler;
/*     */ import atb;
/*     */ import atn;
/*     */ import avf;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.awt.image.BufferedImage;
/*     */ import lq;
/*     */ import md;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import pz;
/*     */ import qw;
/*     */ import qx;
/*     */ import rq;
/*     */ import up;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @SideOnly(Side.CLIENT)
/*     */ public class SCPGuiButler
/*     */   extends avf
/*     */ {
/*     */   private atn textfield;
/*  32 */   public up[] aitem = new up[] { up.o, up.l, up.ap, up.aZ, up.at, up.j, up.bz, up.C, (up)up.be, up.T, up.bT, up.r, up.A, up.bu, up.bB, up.aD, up.aX, up.K, up.i, up.z };
/*     */ 
/*     */ 
/*     */   
/*     */   private BufferedImage img;
/*     */ 
/*     */ 
/*     */   
/*  40 */   private int imgID = 1000;
/*     */   
/*     */   public String order;
/*     */   public SCPEntityButler mob;
/*     */   private yc world;
/*     */   public SCPEntityButler butler;
/*     */   
/*     */   public SCPGuiButler(qw par1InventoryPlayer, SCPEntityButler par2IMerchant, yc par3World) {
/*  48 */     super((rq)new SCPContainerButler(par1InventoryPlayer, par2IMerchant, par3World));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void b(int par1, int par2) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  64 */     super.c();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(float par1, int par2, int par3) {
/*  72 */     int var4 = this.f.o.b("/gui/trading.png");
/*  73 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  74 */     this.f.o.b(var4);
/*  75 */     int var5 = (this.g - this.b) / 2;
/*  76 */     int var6 = (this.h - this.c) / 2;
/*  77 */     b(var5, var6, 0, 0, this.b, this.c);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void A_() {
/*     */     try {
/*  84 */       this.img = ModLoader.loadImage(this.f.o, "/blox/Naming.png");
/*  85 */       this.f.o.a(this.img, this.imgID);
/*     */     }
/*  87 */     catch (Exception e) {
/*     */       
/*  89 */       e.printStackTrace();
/*     */     } 
/*  91 */     this.i.clear();
/*  92 */     this.i.add(new atb(1, this.g / 2 - 49, this.h / 2 + 20, 70, 20, "Enter"));
/*  93 */     this.textfield = new atn(this.l, this.g / 2 - 87, this.h / 2 - 10, 150, 20);
/*  94 */     this.textfield.b(false);
/*  95 */     this.textfield.f(16);
/*  96 */     super.A_();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(atb guibutton) {
/* 104 */     up[] aitem1 = this.aitem;
/* 105 */     int i = aitem1.length;
/*     */     
/* 107 */     qx player = this.world.a((lq)this.butler, 16.0D);
/*     */     
/* 109 */     if (guibutton.f == 1) {
/*     */       
/* 111 */       this.order = this.textfield.b();
/* 112 */       for (int j = 0; j < i; j++) {
/*     */         
/* 114 */         up item = aitem1[j];
/* 115 */         String name = this.aitem[j].a();
/* 116 */         if (this.order.contains(name.substring(5)))
/*     */         {
/* 118 */           player.bJ.a(new ur(item));
/*     */         }
/*     */       } 
/* 121 */       if (this.order.contains("iron"))
/*     */       {
/* 123 */         player.bJ.a(new ur(up.o));
/*     */       }
/* 125 */       if (this.order.contains("TNT"))
/*     */       {
/* 127 */         this.world.d((lq)new pz(this.world, this.mob.t, this.mob.u + 4.0D, this.mob.v));
/*     */       }
/* 129 */       if (this.order.contains("SCP-106")) {
/*     */         
/* 131 */         SCPEntity106 SCP106 = new SCPEntity106(this.world);
/* 132 */         spawnCreature(this.world, (lq)SCP106, this.mob.t, this.mob.u + 4.0D, this.mob.v);
/*     */       } 
/*     */       
/* 135 */       this.f.a(null);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(char c, int i) {
/* 141 */     super.a(c, i);
/* 142 */     this.textfield.a(c, i);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(int i, int j, int k) {
/* 147 */     super.a(i, j, k);
/* 148 */     this.textfield.a(i, j, k);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f() {
/* 153 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/* 158 */     super.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int i, int j, float f) {
/* 163 */     e();
/* 164 */     int k = this.g / 2 - 100;
/* 165 */     int l = this.h / 2 - 40;
/*     */     
/*     */     try {
/* 168 */       int tempvar = this.f.o.b("/blox/Naming.png");
/* 169 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 170 */       this.f.o.b(tempvar);
/* 171 */       b(k, l, 0, 0, 176, 166);
/*     */     }
/* 173 */     catch (Exception e) {
/*     */       
/* 175 */       e.printStackTrace();
/*     */     } 
/* 177 */     this.textfield.f();
/* 178 */     a(this.l, "§lMr. Deeds: §rWhat would you like?", this.g / 2 - 10, this.h / 2 - 35, 16777215);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean spawnCreature(yc par0World, lq entity, double par2, double par4, double par6) {
/* 184 */     entity.b(par2, par4, par6, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 185 */     entity.a(par2, par4, par6, par0World.t.nextFloat() * 360.0F, 0.0F);
/* 186 */     entity.j_();
/* 187 */     par0World.d(entity);
/* 188 */     ((md)entity).aO();
/*     */     
/* 190 */     return (entity != null);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/guis/SCPGuiButler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */