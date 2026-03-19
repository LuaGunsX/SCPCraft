/*     */ package SCPCraft.entities;
/*     */ import ModLoader;
/*     */ import SCPCraft.guis.SCPGuiName;
/*     */ import SCPCraft.items.SCPItemWrench;
/*     */ import SCPCraft.mod_SCP;
/*     */ import ahl;
/*     */ import aul;
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
/*     */ import na;
/*     */ import nc;
/*     */ import nh;
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
/*     */ public class SCPEntity629 extends ml {
/*     */   public boolean Armed;
/*     */   
/*     */   public SCPEntity629(yc par1World) {
/*  37 */     super(par1World);
/*  38 */     a(0.9F, 1.3F);
/*  39 */     this.aG = "/SCPCraft/textures/mobs/629.png";
/*  40 */     az().a(true);
/*  41 */     this.bn.a(2, (nc)this.d);
/*  42 */     this.bH = 0.24F;
/*  43 */     this.Name = "SCP-629";
/*  44 */     this.Armed = false;
/*  45 */     this.bn.a(1, (nc)new mz((md)this));
/*  46 */     this.bn.a(2, (nc)this.d);
/*  47 */     this.bn.a(3, (nc)new nk((md)this, this.bH, true));
/*  48 */     this.bn.a(4, (nc)new na(this, this.bH, 10.0F, 2.0F));
/*  49 */     this.bn.a(5, (nc)new mu((ox)this, this.bH));
/*  50 */     this.bn.a(6, (nc)new nw((mi)this, this.bH));
/*  51 */     this.bn.a(7, (nc)new nh((md)this, qx.class, 8.0F));
/*  52 */     this.bn.a(7, (nc)new nv((md)this));
/*  53 */     this.bo.a(1, (nc)new ok(this));
/*  54 */     this.bo.a(2, (nc)new ol(this));
/*  55 */     this.bo.a(3, (nc)new og((md)this, true));
/*     */   }
/*     */   public String Name; public lq o; public int foodNum; public int tamedNum;
/*     */   private boolean Head;
/*     */   
/*     */   public SCPEnumCreatureAttribute getSCPAttribute() {
/*  61 */     return SCPEnumCreatureAttribute.SCP;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  66 */     if (!this.p.I && !k() && this.E)
/*     */     {
/*  68 */       this.p.a((lq)this, (byte)8);
/*     */     }
/*  70 */     super.c();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/*  75 */     super.a();
/*  76 */     this.ag.a(18, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void j_() {
/*  81 */     super.j_();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean be() {
/*  86 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/*  91 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void bm() {
/*  99 */     this.ag.b(18, Integer.valueOf(aU()));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String O() {
/* 105 */     if (this.Armed || m())
/*     */     {
/*     */       
/* 108 */       return "/SCPCraft/textures/mobs/629Armed.png";
/*     */     }
/* 110 */     if (!this.Armed || !m())
/*     */     {
/* 112 */       return "/SCPCraft/textures/mobs/629UnArmed.png";
/*     */     }
/*     */ 
/*     */     
/* 116 */     return "/SCPCraft/textures/mobs/629UnArmed.png";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(float f) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public int aT() {
/* 126 */     return 30;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq nbt) {
/* 136 */     super.b(nbt);
/* 137 */     nbt.a("foodnum", this.foodNum);
/* 138 */     nbt.a("tamednum", this.tamedNum);
/* 139 */     nbt.a("Armed", this.Armed);
/*     */     
/* 141 */     if (o() == null) {
/*     */       
/* 143 */       nbt.a("Owner", "");
/*     */     }
/*     */     else {
/*     */       
/* 147 */       nbt.a("Owner", o());
/*     */     } 
/*     */     
/* 150 */     if (this.Name != null)
/*     */     {
/* 152 */       nbt.a("Name", this.Name);
/*     */     }
/*     */     
/* 155 */     nbt.a("Sitting", n());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bq nbt) {
/* 160 */     super.a(nbt);
/* 161 */     this.tamedNum = nbt.e("tamednum");
/* 162 */     this.foodNum = nbt.e("foodnum");
/* 163 */     this.Armed = nbt.n("Armed");
/* 164 */     String var2 = nbt.i("Owner");
/* 165 */     this.Name = nbt.i("Name");
/*     */     
/* 167 */     if (var2.length() > 0) {
/*     */       
/* 169 */       a(var2);
/* 170 */       g(true);
/*     */     } 
/*     */     
/* 173 */     this.d.a(nbt.n("Sitting"));
/*     */   }
/*     */ 
/*     */   
/*     */   public int aN() {
/* 178 */     return 1000;
/*     */   }
/*     */ 
/*     */   
/*     */   protected String aY() {
/* 183 */     return "sounds.MrBrass";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/* 188 */     ur var2 = par1EntityPlayer.bJ.g();
/*     */     
/* 190 */     if (m()) {
/*     */       
/* 192 */       if (var2 == null) {
/*     */         
/* 194 */         if (!n()) {
/*     */           
/* 196 */           this.d.a(!n());
/* 197 */           this.bF = false;
/* 198 */           a((ahl)null);
/*     */         } 
/* 200 */         if (n());
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 205 */       if (var2 != null && up.e[var2.c] instanceof SCPItemWrench) {
/*     */         
/* 207 */         SCPItemWrench var3 = (SCPItemWrench)up.e[var2.c];
/*     */         
/* 209 */         if (this.ag.c(18) < 20) {
/*     */           
/* 211 */           if (!par1EntityPlayer.cd.d)
/*     */           {
/* 213 */             var2.a--;
/*     */           }
/*     */           
/* 216 */           i(10);
/*     */           
/* 218 */           if (var2.a <= 0)
/*     */           {
/* 220 */             par1EntityPlayer.bJ.a(par1EntityPlayer.bJ.c, (ur)null);
/*     */           }
/*     */           
/* 223 */           return true;
/*     */         } 
/* 225 */         var2.a(5, (md)par1EntityPlayer);
/* 226 */         ModLoader.openGUI(par1EntityPlayer, (aul)new SCPGuiName(this));
/*     */       } 
/*     */       
/* 229 */       if (par1EntityPlayer.bR.equalsIgnoreCase(o()) && !this.p.I) {
/*     */         
/* 231 */         this.d.a(!n());
/* 232 */         this.bF = false;
/* 233 */         a((ahl)null);
/* 234 */         ModLoader.openGUI(par1EntityPlayer, (aul)new SCPGuiName(this));
/*     */       } 
/*     */     } else {
/* 237 */       if (var2 != null && var2.c == mod_SCP.Wrench.cj) {
/*     */         
/* 239 */         if (!par1EntityPlayer.cd.d)
/*     */         {
/* 241 */           var2.a--;
/*     */         }
/*     */         
/* 244 */         if (var2.a <= 0)
/*     */         {
/* 246 */           par1EntityPlayer.bJ.a(par1EntityPlayer.bJ.c, (ur)null);
/*     */         }
/*     */         
/* 249 */         if (!this.p.I)
/*     */         {
/* 251 */           if (this.aa.nextInt(3) == 0) {
/*     */             
/* 253 */             g(true);
/* 254 */             a((ahl)null);
/* 255 */             b((md)null);
/* 256 */             j(30);
/* 257 */             a(par1EntityPlayer.bR);
/* 258 */             f(true);
/* 259 */             par1EntityPlayer.a((jl)mod_SCP.SCP629);
/*     */             
/* 261 */             int i = ke.c(this.t);
/* 262 */             int j = ke.c(this.u);
/* 263 */             int k = ke.c(this.v);
/*     */             
/* 265 */             int k1 = lz.a(i);
/* 266 */             i -= k1;
/* 267 */             this.p.d((lq)new lz(this.p, this.t, this.u, this.v, 100));
/* 268 */             this.p.a((lq)this, (byte)7);
/* 269 */             if (this.p.b((lq)this, 16.0D) != null) this.p.b((lq)this, 16.0D).b("Thank you so much sir!"); 
/* 270 */             this.p.a((lq)this, "random.click", aX(), ((this.aa.nextFloat() - this.aa.nextFloat()) * 0.2F + 1.0F) * 1.8F);
/* 271 */             par1EntityPlayer.a((jl)mod_SCP.SCP629);
/* 272 */             for (int l = 0; l < 8; l++)
/*     */             {
/* 274 */               this.p.a("largesmoke", i + Math.random(), j + 0.75D, k + Math.random(), 0.0D, 0.0D, 0.0D);
/*     */             }
/* 276 */             ModLoader.openGUI(par1EntityPlayer, (aul)new SCPGuiName(this));
/* 277 */             var2.a(5, (md)par1EntityPlayer);
/*     */           }
/*     */           else {
/*     */             
/* 281 */             f(false);
/* 282 */             this.p.a((lq)this, (byte)6);
/* 283 */             var2.a(5, (md)par1EntityPlayer);
/* 284 */             ModLoader.openGUI(par1EntityPlayer, (aul)new SCPGuiName(this));
/*     */           } 
/*     */         }
/*     */         
/* 288 */         return true;
/*     */       } 
/*     */       
/* 291 */       if (var2 == null) {
/*     */         
/* 293 */         if (!m())
/*     */         {
/* 295 */           return super.a(par1EntityPlayer);
/*     */         }
/* 297 */         if (m()) {
/*     */           
/* 299 */           i(30);
/* 300 */           j(30);
/* 301 */           return super.a(par1EntityPlayer);
/*     */         } 
/*     */       } 
/*     */     } 
/* 305 */     return super.a(par1EntityPlayer);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ox spawnBabyAnimal(ox par1EntityAnimal) {
/* 311 */     return (ox)new SCPEntity629(this.p);
/*     */   }
/*     */ 
/*     */   
/*     */   public int func_48148_ad() {
/* 316 */     return this.ag.a(18);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aZ() {
/* 324 */     return "mob.irongolem.hit";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String ba() {
/* 332 */     return "mob.irongolem.hit";
/*     */   }
/*     */ 
/*     */   
/*     */   public ln a(ln var1) {
/* 337 */     return var1;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/entities/SCPEntity629.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */