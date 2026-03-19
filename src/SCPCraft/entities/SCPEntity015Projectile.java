/*     */ package SCPCraft.entities;
/*     */ 
/*     */ import ModLoader;
/*     */ import SCPCraft.mod_SCP;
/*     */ import aoh;
/*     */ import lh;
/*     */ import ll;
/*     */ import lm;
/*     */ import lq;
/*     */ import md;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import qx;
/*     */ import rb;
/*     */ import up;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ public class SCPEntity015Projectile
/*     */   extends rb
/*     */ {
/*     */   public int xCoord;
/*  23 */   private int xTile = -1;
/*  24 */   private int yTile = -1;
/*  25 */   private int zTile = -1;
/*  26 */   private int inTile = 0;
/*     */   private boolean inGround = false;
/*     */   public md a;
/*     */   private int ticksAlive;
/*  30 */   private int ticksInAir = 0;
/*     */   
/*     */   public double b;
/*     */   
/*     */   public double c;
/*     */   
/*     */   public double d;
/*     */   
/*     */   public int yCoord;
/*     */   public int zCoord;
/*     */   
/*     */   public SCPEntity015Projectile(yc par1World) {
/*  42 */     super(par1World);
/*  43 */     a(0.2125F, 0.2125F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SCPEntity015Projectile(yc par1World, md par2EntityLiving, double par3, double par5, double par7) {
/*  48 */     super(par1World, par2EntityLiving, par3, par5, par7);
/*  49 */     a(0.2125F, 0.2125F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SCPEntity015Projectile(yc par1World, double par2, double par4, double par6, double par8, double par10, double par12) {
/*  54 */     super(par1World, par2, par4, par6, par8, par10, par12);
/*  55 */     a(0.2125F, 0.2125F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void targetLivings() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(aoh par1MovingObjectPosition) {
/*  67 */     int[] Potions = { ll.q.H, ll.s.H, ll.k.H, ll.f.H, ll.d.H, ll.t.H, ll.u.H, mod_SCP.shake.H, ll.i.H };
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  72 */     int[] Tools = { up.g.cj, up.t.cj, up.I.cj, up.B.cj, up.x.cj, up.q.cj, up.G.cj, up.z.cj, up.v.cj, mod_SCP.SCP143Pickaxe.cj, mod_SCP.SCP143Sword.cj, mod_SCP.Wrench.cj, up.k.cj, up.r.cj };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  79 */     if (!this.p.I && par1MovingObjectPosition.g != null) {
/*     */       
/*  81 */       Minecraft minecraft = ModLoader.getMinecraftInstance();
/*  82 */       qx ep = (qx)par1MovingObjectPosition.g;
/*     */       
/*  84 */       if (ep != null) {
/*     */         
/*  86 */         ur boots = ep.bJ.b[0];
/*  87 */         ur legs = ep.bJ.b[1];
/*  88 */         ur chest = ep.bJ.b[2];
/*  89 */         ur helm = ep.bJ.b[3];
/*  90 */         if (chest != null && legs != null && boots != null && helm != null) {
/*     */           
/*  92 */           if (chest.c == mod_SCP.SCP912Shirt.cj || legs.c == mod_SCP.SCP912Pants.cj || boots.c == mod_SCP.SCP912Shoes.cj || helm.c == mod_SCP.SCP912Head.cj)
/*     */           {
/*  94 */             par1MovingObjectPosition.g.a(mod_SCP.pipe, 2 * this.p.s);
/*  95 */             this.p.a((lq)null, this.t, this.u, this.v, 2.0F, true, true);
/*     */           }
/*  97 */           else if (chest.c == mod_SCP.ClassDShirt.cj || legs.c == mod_SCP.ClassDPants.cj || boots.c == mod_SCP.ClassDShoes.cj || helm.c == mod_SCP.GasMask.cj)
/*     */           {
/*  99 */             par1MovingObjectPosition.g.a(mod_SCP.pipe, 2 * this.p.s + 2);
/*     */           }
/*     */           else
/*     */           {
/* 103 */             par1MovingObjectPosition.g.a(mod_SCP.pipe, 2 * this.p.s);
/*     */           }
/*     */         
/* 106 */         } else if (chest != null && legs != null && boots != null && helm != null) {
/*     */           
/* 108 */           if (chest.c == mod_SCP.ClassDShirt.cj || legs.c == mod_SCP.ClassDPants.cj || boots.c == mod_SCP.ClassDShoes.cj || helm.c == mod_SCP.GasMask.cj)
/*     */           {
/* 110 */             par1MovingObjectPosition.g.a(mod_SCP.pipe, 2 * this.p.s + 2);
/*     */           }
/*     */         }
/*     */         else {
/*     */           
/* 115 */           par1MovingObjectPosition.g.a(mod_SCP.pipe, 2 * this.p.s + 2);
/*     */         } 
/*     */       } 
/*     */       
/* 119 */       for (int var3 = 0; var3 < 50; var3++) {
/*     */         
/* 121 */         this.p.a("smoke", this.xCoord + 0.5D, this.yCoord + 0.5D, this.zCoord + 0.5D, 4.0D, this.xCoord + 0.5D, this.yCoord + 0.5D);
/* 122 */         this.p.a("splash", this.xCoord + 0.5D, this.yCoord + 0.5D, this.zCoord + 0.5D, 4.0D, this.xCoord + 0.5D, this.yCoord + 0.5D);
/* 123 */         this.p.a("smoke", this.xCoord + 0.5D, this.yCoord + 0.5D, this.zCoord + 0.5D, 4.0D, this.xCoord + 0.5D, this.yCoord + 0.5D);
/*     */       } 
/* 125 */       for (int tools = 0; tools <= Tools.length - 1; tools++) {
/*     */         
/* 127 */         if (ep.bJ.e(Tools[tools]) && minecraft.b.g())
/*     */         {
/* 129 */           ep.d(new lm(Potions[this.aa.nextInt(Potions.length)], 200, 1));
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 134 */     x();
/*     */   }
/*     */ 
/*     */   
/*     */   public void j_() {
/* 139 */     c(-1);
/* 140 */     super.j_();
/* 141 */     c(-1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean L() {
/* 149 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(lh par1DamageSource, int par2) {
/* 154 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public float R() {
/* 159 */     return 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public float c(float par1) {
/* 164 */     return 1.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(float par1) {
/* 169 */     return 14496512;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity015Projectile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */