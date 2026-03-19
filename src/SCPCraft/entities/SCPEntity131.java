/*     */ package SCPCraft.entities;
/*     */ import bq;
/*     */ import ln;
/*     */ import lq;
/*     */ import md;
/*     */ import mi;
/*     */ import mu;
/*     */ import na;
/*     */ import nc;
/*     */ import nh;
/*     */ import nk;
/*     */ import nw;
/*     */ import od;
/*     */ import og;
/*     */ import oh;
/*     */ import ok;
/*     */ import ox;
/*     */ import qx;
/*     */ import up;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity131 extends ml {
/*     */   public lq o;
/*     */   
/*     */   public SCPEntity131(yc par1World) {
/*  27 */     super(par1World);
/*  28 */     a(0.9F, 1.3F);
/*  29 */     this.aG = "/SCPCraft/textures/mobs/131A.png";
/*  30 */     az().a(true);
/*  31 */     this.bn.a(2, (nc)this.d);
/*  32 */     this.bH = 0.4F;
/*  33 */     this.bn.a(5, (nc)new na(this, this.bH, 10.0F, 2.0F));
/*  34 */     this.bn.a(6, (nc)new mu((ox)this, 0.23F));
/*  35 */     this.bn.a(7, (nc)new nk((md)this, SCPEntity173.class, this.bH, false));
/*  36 */     this.bn.a(8, (nc)new nw((mi)this, 0.23F));
/*  37 */     this.bn.a(9, (nc)new nh((md)this, qx.class, 10.0F));
/*  38 */     this.bn.a(10, (nc)new nh((md)this, SCPEntityClassDGuy.class, 10.0F));
/*  39 */     this.bn.a(11, (nc)new nh((md)this, SCPEntity173.class, 10.0F));
/*  40 */     this.bo.a(1, (nc)new ok(this));
/*  41 */     this.bo.a(2, (nc)new ol(this));
/*  42 */     this.bo.a(3, (nc)new og((md)this, true));
/*  43 */     this.bn.a(0, (nc)new od((mi)this, 0.25F, up.p.cj, false));
/*  44 */     this.bo.a(4, (nc)new oh((md)this, SCPEntity173.class, 16.0F, 0, true));
/*     */   }
/*     */   public int foodNum; public int tamedNum;
/*     */   private boolean Head;
/*     */   
/*     */   public SCPEnumCreatureAttribute getSCPAttribute() {
/*  50 */     return SCPEnumCreatureAttribute.SCP;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/*  55 */     super.a();
/*  56 */     this.ag.a(18, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void j_() {
/*  61 */     super.j_();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean be() {
/*  66 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/*  71 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(float f) {}
/*     */ 
/*     */   
/*     */   public int aT() {
/*  80 */     return 20;
/*     */   }
/*     */ 
/*     */   
/*     */   public String O() {
/*  85 */     if (!m())
/*     */     {
/*     */       
/*  88 */       return "/SCPCraft/textures/mobs/131A.png";
/*     */     }
/*     */ 
/*     */     
/*  92 */     return "/SCPCraft/textures/mobs/131B.png";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq nbt) {
/* 103 */     super.b(nbt);
/* 104 */     nbt.a("foodnum", this.foodNum);
/* 105 */     nbt.a("tamednum", this.tamedNum);
/*     */   }
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
/*     */   public double X() {
/* 124 */     return this.O - 0.82D;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bq nbt) {
/* 129 */     super.a(nbt);
/* 130 */     this.tamedNum = nbt.e("tamednum");
/* 131 */     this.foodNum = nbt.e("foodnum");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/* 138 */     ur itemstack = par1EntityPlayer.bJ.g();
/*     */     
/* 140 */     if (this.tamedNum == 0)
/*     */     {
/* 142 */       this.tamedNum = this.aa.nextInt(3) + 1;
/*     */     }
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
/* 158 */     if (!m()) {
/*     */ 
/*     */       
/* 161 */       if (itemstack != null && itemstack.c == up.p.cj && par1EntityPlayer.e((lq)this) < 9.0D) {
/*     */         
/* 163 */         itemstack.a--;
/* 164 */         this.foodNum++;
/* 165 */         if (itemstack.a <= 0)
/*     */         {
/* 167 */           par1EntityPlayer.bJ.a(par1EntityPlayer.bJ.c, null);
/*     */         }
/*     */         
/* 170 */         if (!this.p.I && this.foodNum >= this.tamedNum) {
/*     */           
/* 172 */           g(true);
/* 173 */           a(par1EntityPlayer.bR);
/* 174 */           this.d.a(true);
/* 175 */           this.p.a((lq)this, (byte)7);
/* 176 */           this.p.b((lq)this, 16.0D).b("You have an EyePod now!");
/*     */         }
/*     */         else {
/*     */           
/* 180 */           this.p.b((lq)this, 16.0D).b(Integer.toString(this.tamedNum - this.foodNum));
/*     */         } 
/*     */       } 
/*     */       
/* 184 */       return true;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 191 */     return super.a(par1EntityPlayer);
/*     */   }
/*     */ 
/*     */   
/*     */   public ox spawnBabyAnimal(ox par1EntityAnimal) {
/* 196 */     return (ox)new SCPEntity131(this.p);
/*     */   }
/*     */ 
/*     */   
/*     */   public int func_48148_ad() {
/* 201 */     return this.ag.a(18);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isWheat(ur par1ItemStack) {
/* 206 */     return (par1ItemStack.c == up.o.cj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ln a(ln var1) {
/* 212 */     return null;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity131.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */