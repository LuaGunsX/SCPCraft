/*     */ package SCPCraft.entities;
/*     */ import ModLoader;
/*     */ import SCPCraft.items.SCPItemWrench;
/*     */ import SCPCraft.mod_SCP;
/*     */ import ahl;
/*     */ import ayp;
/*     */ import ays;
/*     */ import bq;
/*     */ import jl;
/*     */ import ke;
/*     */ import ln;
/*     */ import lq;
/*     */ import lz;
/*     */ import md;
/*     */ import mi;
/*     */ import ml;
/*     */ import mu;
/*     */ import mz;
/*     */ import nc;
/*     */ import nv;
/*     */ import nw;
/*     */ import og;
/*     */ import ok;
/*     */ import ol;
/*     */ import ox;
/*     */ import qx;
/*     */ import up;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ public class SCPEntity222Clone extends ml {
/*     */   public lq o;
/*     */   
/*     */   public SCPEntity222Clone(yc par1World) {
/*  35 */     super(par1World);
/*  36 */     ays ays = (ModLoader.getMinecraftInstance()).g;
/*  37 */     a(0.8F, 1.8F);
/*  38 */     az().a(true);
/*  39 */     this.bn.a(2, (nc)this.d);
/*  40 */     this.bH = 0.35F;
/*  41 */     this.aG = ((qx)ays).cu;
/*  42 */     this.bn.a(1, (nc)new mz((md)this));
/*  43 */     this.bn.a(2, (nc)this.d);
/*  44 */     this.bn.a(3, (nc)new nk((md)this, this.bH, true));
/*  45 */     this.bn.a(4, (nc)new na(this, 0.35F, 10.0F, 2.0F));
/*  46 */     this.bn.a(5, (nc)new mu((ox)this, this.bH));
/*  47 */     this.bn.a(6, (nc)new nw((mi)this, 0.35F));
/*  48 */     this.bn.a(7, (nc)new nh((md)this, qx.class, 8.0F));
/*  49 */     this.bn.a(7, (nc)new nv((md)this));
/*  50 */     this.bo.a(1, (nc)new ok(this));
/*  51 */     this.bo.a(2, (nc)new ol(this));
/*  52 */     this.bo.a(3, (nc)new og((md)this, true));
/*     */   }
/*     */   public int foodNum; public int tamedNum;
/*     */   private boolean Head;
/*     */   
/*     */   public SCPEnumCreatureAttribute getSCPAttribute() {
/*  58 */     return SCPEnumCreatureAttribute.SCP;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  63 */     if (!this.p.I && !k() && this.E)
/*     */     {
/*  65 */       this.p.a((lq)this, (byte)8);
/*     */     }
/*     */     
/*  68 */     ays ays = (ModLoader.getMinecraftInstance()).g;
/*     */     
/*  70 */     if (ays != null)
/*     */     {
/*  72 */       this.aG = ((qx)ays).cu;
/*     */     }
/*     */     
/*  75 */     super.c();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/*  80 */     super.a();
/*  81 */     this.ag.a(18, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void j_() {
/*  88 */     super.j_();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean be() {
/*  93 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/*  98 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void bm() {
/* 106 */     this.ag.b(18, Integer.valueOf(aU()));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String O() {
/* 112 */     ays ays = (ModLoader.getMinecraftInstance()).g;
/* 113 */     String playerSkin = ((qx)ays).cu;
/* 114 */     ayp ayp = (ModLoader.getMinecraftInstance()).e;
/*     */     
/* 116 */     if (!((yc)ayp).I)
/*     */     {
/* 118 */       return this.aG = playerSkin;
/*     */     }
/*     */ 
/*     */     
/* 122 */     return this.aG = playerSkin;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(float f) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public int aT() {
/* 132 */     return 30;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq nbt) {
/* 142 */     super.b(nbt);
/* 143 */     nbt.a("foodnum", this.foodNum);
/* 144 */     nbt.a("tamednum", this.tamedNum);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bq nbt) {
/* 149 */     super.a(nbt);
/* 150 */     this.tamedNum = nbt.e("tamednum");
/* 151 */     this.foodNum = nbt.e("foodnum");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/* 156 */     ur var2 = par1EntityPlayer.bJ.g();
/*     */     
/* 158 */     if (m()) {
/*     */       
/* 160 */       if (var2 != null && up.e[var2.c] instanceof SCPItemWrench) {
/*     */         
/* 162 */         SCPItemWrench var3 = (SCPItemWrench)up.e[var2.c];
/*     */         
/* 164 */         if (this.ag.c(18) < 20) {
/*     */           
/* 166 */           if (!par1EntityPlayer.cd.d)
/*     */           {
/* 168 */             var2.a--;
/*     */           }
/*     */           
/* 171 */           i(10);
/*     */           
/* 173 */           if (var2.a <= 0)
/*     */           {
/* 175 */             par1EntityPlayer.bJ.a(par1EntityPlayer.bJ.c, (ur)null);
/*     */           }
/*     */           
/* 178 */           return true;
/*     */         } 
/*     */       } 
/*     */       
/* 182 */       if (par1EntityPlayer.bR.equalsIgnoreCase(o()) && !this.p.I && !isWheat(var2))
/*     */       {
/* 184 */         this.d.a(!n());
/* 185 */         this.bF = false;
/* 186 */         a((ahl)null);
/*     */       }
/*     */     
/* 189 */     } else if (var2 != null && var2.c == mod_SCP.Wrench.cj) {
/*     */       
/* 191 */       if (!par1EntityPlayer.cd.d)
/*     */       {
/* 193 */         var2.a--;
/*     */       }
/*     */       
/* 196 */       if (var2.a <= 0)
/*     */       {
/* 198 */         par1EntityPlayer.bJ.a(par1EntityPlayer.bJ.c, (ur)null);
/*     */       }
/*     */       
/* 201 */       if (!this.p.I)
/*     */       {
/* 203 */         if (this.aa.nextInt(3) == 0) {
/*     */           
/* 205 */           g(true);
/* 206 */           a((ahl)null);
/* 207 */           b((md)null);
/* 208 */           j(20);
/* 209 */           a(par1EntityPlayer.bR);
/* 210 */           f(true);
/* 211 */           par1EntityPlayer.a((jl)mod_SCP.SCP629);
/*     */           
/* 213 */           int i = ke.c(this.t);
/* 214 */           int j = ke.c(this.u);
/* 215 */           int k = ke.c(this.v);
/*     */           
/* 217 */           int k1 = lz.a(i);
/* 218 */           i -= k1;
/* 219 */           this.p.d((lq)new lz(this.p, this.t, this.u, this.v, 100));
/* 220 */           this.p.a((lq)this, (byte)7);
/* 221 */           (ModLoader.getMinecraftInstance()).g.b("Thank you so much sir!");
/* 222 */           this.p.a((lq)this, "random.click", aX(), ((this.aa.nextFloat() - this.aa.nextFloat()) * 0.2F + 1.0F) * 1.8F);
/* 223 */           par1EntityPlayer.a((jl)mod_SCP.SCP629);
/* 224 */           for (int l = 0; l < 8; l++)
/*     */           {
/* 226 */             this.p.a("largesmoke", i + Math.random(), j + 0.75D, k + Math.random(), 0.0D, 0.0D, 0.0D);
/*     */           
/*     */           }
/*     */         }
/*     */         else {
/*     */           
/* 232 */           f(false);
/* 233 */           this.p.a((lq)this, (byte)6);
/*     */         } 
/*     */       }
/*     */       
/* 237 */       return true;
/*     */     } 
/*     */     
/* 240 */     if (var2 == null)
/*     */     {
/* 242 */       return false;
/*     */     }
/*     */     
/* 245 */     return super.a(par1EntityPlayer);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ox spawnBabyAnimal(ox par1EntityAnimal) {
/* 251 */     return (ox)new SCPEntity222Clone(this.p);
/*     */   }
/*     */ 
/*     */   
/*     */   public int func_48148_ad() {
/* 256 */     return this.ag.a(18);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isWheat(ur par1ItemStack) {
/* 261 */     return (par1ItemStack.c == up.o.cj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ln a(ln var1) {
/* 267 */     return null;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity222Clone.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */