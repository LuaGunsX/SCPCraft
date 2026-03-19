/*     */ import SCPCraft.entities.SCPEntity872;
/*     */ import SCPCraft.entities.SCPEntity872AI;
/*     */ import SCPCraft.mod_SCP;
/*     */ import java.util.List;
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
/*     */ public abstract class ox
/*     */   extends ln
/*     */   implements lo
/*     */ {
/*     */   public int d;
/*  27 */   private int e = 0;
/*     */   public boolean isAggro;
/*     */   
/*     */   public ox(yc par1World) {
/*  31 */     super(par1World);
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
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  54 */     this.isAggro = false;
/*     */     this.bn.a(9, (nc)new SCPEntity872AI((mi)this, SCPEntity872.class, 16.0F, 256.0D, mod_SCP.control.H, 40, 1));
/*     */   } public void c() {
/*  57 */     super.c();
/*     */     
/*  59 */     if (b() != 0)
/*     */     {
/*  61 */       this.d = 0;
/*     */     }
/*     */     
/*  64 */     if (this.d > 0) {
/*     */       
/*  66 */       this.d--;
/*  67 */       String var1 = "heart";
/*     */       
/*  69 */       if (this.d % 10 == 0)
/*     */       {
/*  71 */         double var2 = this.aa.nextGaussian() * 0.02D;
/*  72 */         double var4 = this.aa.nextGaussian() * 0.02D;
/*  73 */         double var6 = this.aa.nextGaussian() * 0.02D;
/*  74 */         this.p.a(var1, this.t + (this.aa.nextFloat() * this.N * 2.0F) - this.N, this.u + 0.5D + (this.aa.nextFloat() * this.O), this.v + (this.aa.nextFloat() * this.N * 2.0F) - this.N, var2, var4, var6);
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/*  79 */       this.e = 0;
/*     */     } 
/*     */ 
/*     */     
/*  83 */     if (a(mod_SCP.control)) { this.isAggro = true; }
/*  84 */     else { this.isAggro = false; }
/*     */   
/*     */   }
/*     */   protected void bm() {
/*     */     if (b() != 0)
/*     */       this.d = 0; 
/*     */     super.bm();
/*     */   }
/*     */   protected void a(lq par1Entity, float par2) {
/*  93 */     if (!this.isAggro) {
/*  94 */       if (par1Entity instanceof qx) {
/*     */         
/*  96 */         if (par2 < 3.0F) {
/*     */           
/*  98 */           double var3 = par1Entity.t - this.t;
/*  99 */           double var5 = par1Entity.v - this.v;
/* 100 */           this.z = (float)(Math.atan2(var5, var3) * 180.0D / Math.PI) - 90.0F;
/* 101 */           this.b = true;
/*     */         } 
/*     */         
/* 104 */         qx var7 = (qx)par1Entity;
/*     */         
/* 106 */         if (var7.bS() == null || !c(var7.bS()))
/*     */         {
/* 108 */           this.a_ = null;
/*     */         }
/*     */       }
/* 111 */       else if (par1Entity instanceof ox) {
/*     */         
/* 113 */         ox var8 = (ox)par1Entity;
/*     */         
/* 115 */         if (b() > 0 && var8.b() < 0) {
/*     */           
/* 117 */           if (par2 < 2.5D)
/*     */           {
/* 119 */             this.b = true;
/*     */           }
/*     */         }
/* 122 */         else if (this.d > 0 && var8.d > 0) {
/*     */           
/* 124 */           if (var8.a_ == null)
/*     */           {
/* 126 */             var8.a_ = (lq)this;
/*     */           }
/*     */           
/* 129 */           if (var8.a_ == this && par2 < 3.5D)
/*     */           {
/* 131 */             var8.d++;
/* 132 */             this.d++;
/* 133 */             this.e++;
/*     */             
/* 135 */             if (this.e % 4 == 0)
/*     */             {
/* 137 */               this.p.a("heart", this.t + (this.aa.nextFloat() * this.N * 2.0F) - this.N, this.u + 0.5D + (this.aa.nextFloat() * this.O), this.v + (this.aa.nextFloat() * this.N * 2.0F) - this.N, 0.0D, 0.0D, 0.0D);
/*     */             }
/*     */             
/* 140 */             if (this.e == 60)
/*     */             {
/* 142 */               b((ox)par1Entity);
/*     */             }
/*     */           }
/*     */           else
/*     */           {
/* 147 */             this.e = 0;
/*     */           }
/*     */         
/*     */         } else {
/*     */           
/* 152 */           this.e = 0;
/* 153 */           this.a_ = null;
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void b(ox par1EntityAnimal) {
/* 165 */     ln var2 = a(par1EntityAnimal);
/*     */     
/* 167 */     if (var2 != null) {
/*     */       
/* 169 */       a(6000);
/* 170 */       par1EntityAnimal.a(6000);
/* 171 */       this.d = 0;
/* 172 */       this.e = 0;
/* 173 */       this.a_ = null;
/* 174 */       par1EntityAnimal.a_ = null;
/* 175 */       par1EntityAnimal.e = 0;
/* 176 */       par1EntityAnimal.d = 0;
/* 177 */       var2.a(-24000);
/* 178 */       var2.b(this.t, this.u, this.v, this.z, this.A);
/*     */       
/* 180 */       for (int var3 = 0; var3 < 7; var3++) {
/*     */         
/* 182 */         double var4 = this.aa.nextGaussian() * 0.02D;
/* 183 */         double var6 = this.aa.nextGaussian() * 0.02D;
/* 184 */         double var8 = this.aa.nextGaussian() * 0.02D;
/* 185 */         this.p.a("heart", this.t + (this.aa.nextFloat() * this.N * 2.0F) - this.N, this.u + 0.5D + (this.aa.nextFloat() * this.O), this.v + (this.aa.nextFloat() * this.N * 2.0F) - this.N, var4, var6, var8);
/*     */       } 
/*     */       
/* 188 */       this.p.d((lq)var2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(lh par1DamageSource, int par2) {
/* 198 */     if (ar())
/*     */     {
/* 200 */       return false;
/*     */     }
/* 202 */     if (!this.isAggro) {
/*     */       
/* 204 */       this.c = 60;
/* 205 */       this.a_ = null;
/* 206 */       this.d = 0;
/* 207 */       return super.a(par1DamageSource, par2);
/*     */     } 
/* 209 */     return super.a(par1DamageSource, par2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float a(int par1, int par2, int par3) {
/* 218 */     return (this.p.a(par1, par2 - 1, par3) == amq.x.cm) ? 10.0F : (this.p.p(par1, par2, par3) - 0.5F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/* 226 */     super.b(par1NBTTagCompound);
/* 227 */     par1NBTTagCompound.a("InLove", this.d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/* 235 */     super.a(par1NBTTagCompound);
/* 236 */     this.d = par1NBTTagCompound.e("InLove");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected lq j() {
/* 245 */     if (this.c > 0)
/*     */     {
/* 247 */       return null;
/*     */     }
/*     */ 
/*     */     
/* 251 */     float var1 = 8.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 256 */     if (this.d > 0) {
/*     */       
/* 258 */       List<ox> var2 = this.p.a(getClass(), this.D.b(var1, var1, var1));
/*     */       
/* 260 */       for (int var3 = 0; var3 < var2.size(); var3++)
/*     */       {
/* 262 */         ox var4 = var2.get(var3);
/*     */         
/* 264 */         if (var4 != this && var4.d > 0)
/*     */         {
/* 266 */           return (lq)var4;
/*     */         }
/*     */       }
/*     */     
/* 270 */     } else if (b() == 0) {
/*     */       
/* 272 */       List<qx> var2 = this.p.a(qx.class, this.D.b(var1, var1, var1));
/*     */       
/* 274 */       for (int var3 = 0; var3 < var2.size(); var3++)
/*     */       {
/* 276 */         qx var5 = var2.get(var3);
/*     */         
/* 278 */         if (var5.bS() != null && c(var5.bS()))
/*     */         {
/* 280 */           return var5;
/*     */         }
/*     */       }
/*     */     
/* 284 */     } else if (b() > 0) {
/*     */       
/* 286 */       List<ox> var2 = this.p.a(getClass(), this.D.b(var1, var1, var1));
/*     */       
/* 288 */       for (int var3 = 0; var3 < var2.size(); var3++) {
/*     */         
/* 290 */         ox var4 = var2.get(var3);
/*     */         
/* 292 */         if (var4 != this && var4.b() < 0)
/*     */         {
/* 294 */           return (lq)var4;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 299 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean bs() {
/* 308 */     int var1 = ke.c(this.t);
/* 309 */     int var2 = ke.c(this.D.b);
/* 310 */     int var3 = ke.c(this.v);
/* 311 */     return (this.p.a(var1, var2 - 1, var3) == amq.x.cm && this.p.l(var1, var2, var3) > 8 && super.bs());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int aN() {
/* 319 */     return 120;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean bj() {
/* 327 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int c(qx par1EntityPlayer) {
/* 335 */     return 1 + this.p.t.nextInt(3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c(ur par1ItemStack) {
/* 344 */     return (par1ItemStack.c == up.T.cj);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(qx par1EntityPlayer) {
/* 352 */     ur var2 = par1EntityPlayer.bJ.g();
/*     */     
/* 354 */     if (var2 != null && c(var2) && b() == 0) {
/*     */       
/* 356 */       if (!par1EntityPlayer.cd.d) {
/*     */         
/* 358 */         var2.a--;
/*     */         
/* 360 */         if (var2.a <= 0)
/*     */         {
/* 362 */           par1EntityPlayer.bJ.a(par1EntityPlayer.bJ.c, (ur)null);
/*     */         }
/*     */       } 
/*     */       
/* 366 */       this.d = 600;
/* 367 */       this.a_ = null;
/*     */       
/* 369 */       for (int var3 = 0; var3 < 7; var3++) {
/*     */         
/* 371 */         double var4 = this.aa.nextGaussian() * 0.02D;
/* 372 */         double var6 = this.aa.nextGaussian() * 0.02D;
/* 373 */         double var8 = this.aa.nextGaussian() * 0.02D;
/* 374 */         this.p.a("heart", this.t + (this.aa.nextFloat() * this.N * 2.0F) - this.N, this.u + 0.5D + (this.aa.nextFloat() * this.O), this.v + (this.aa.nextFloat() * this.N * 2.0F) - this.N, var4, var6, var8);
/*     */       } 
/*     */       
/* 377 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 381 */     return super.a(par1EntityPlayer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean r() {
/* 390 */     return (this.d > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void s() {
/* 395 */     this.d = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(ox par1EntityAnimal) {
/* 403 */     return (par1EntityAnimal == this) ? false : ((par1EntityAnimal.getClass() != getClass()) ? false : ((r() && par1EntityAnimal.r())));
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/ox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */