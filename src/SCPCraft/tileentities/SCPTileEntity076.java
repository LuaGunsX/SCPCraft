/*     */ package SCPCraft.tileentities;
/*     */ 
/*     */ import any;
/*     */ import aoe;
/*     */ import bq;
/*     */ import cd;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import ef;
/*     */ import fg;
/*     */ import java.util.Iterator;
/*     */ import lq;
/*     */ import lv;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ public class SCPTileEntity076
/*     */   extends any
/*     */ {
/*  20 */   public int delay = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  25 */   private String mobID = "SCP-076";
/*     */ 
/*     */   
/*  28 */   private bq spawnerTags = null;
/*     */   public double yaw;
/*  30 */   public double yaw2 = 0.0D;
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   private lq spawnedMob;
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public String getMobID() {
/*  41 */     return this.mobID;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setMobID(String par1Str) {
/*  46 */     this.mobID = par1Str;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void g() {
/*  55 */     if (this.k.I) {
/*     */       
/*  57 */       double var1 = (this.l + this.k.t.nextFloat());
/*  58 */       double var3 = (this.m + this.k.t.nextFloat());
/*  59 */       double var5 = (this.n + this.k.t.nextFloat());
/*  60 */       this.k.a("smoke", var1, var3, var5, 0.0D, 0.0D, 0.0D);
/*  61 */       this.k.a("flame", var1, var3, var5, 0.0D, 0.0D, 0.0D);
/*  62 */       this.k.a("smoke", var1 + 1.0D, var3, var5, 0.0D, 0.0D, 0.0D);
/*  63 */       this.k.a("flame", var1 + 1.0D, var3, var5, 0.0D, 0.0D, 0.0D);
/*  64 */       this.k.a("smoke", var1, var3, var5 + 1.0D, 0.0D, 0.0D, 0.0D);
/*  65 */       this.k.a("flame", var1, var3, var5 + 1.0D, 0.0D, 0.0D, 0.0D);
/*  66 */       this.k.a("smoke", var1, var3 + 1.0D, var5, 0.0D, 0.0D, 0.0D);
/*  67 */       this.k.a("flame", var1, var3 + 1.0D, var5, 0.0D, 0.0D, 0.0D);
/*  68 */       this.k.a("smoke", var1 + 1.0D, var3 + 1.0D, var5, 0.0D, 0.0D, 0.0D);
/*  69 */       this.k.a("flame", var1 + 1.0D, var3 + 1.0D, var5, 0.0D, 0.0D, 0.0D);
/*  70 */       this.k.a("smoke", var1, var3 + 1.0D, var5 + 1.0D, 0.0D, 0.0D, 0.0D);
/*  71 */       this.k.a("flame", var1, var3 + 1.0D, var5 + 1.0D, 0.0D, 0.0D, 0.0D);
/*  72 */       this.yaw2 = this.yaw % 360.0D;
/*  73 */       this.yaw += 4.545454502105713D;
/*     */     }
/*     */     else {
/*     */       
/*  77 */       if (this.delay == -1)
/*     */       {
/*  79 */         updateDelay();
/*     */       }
/*     */       
/*  82 */       if (this.delay == 90) this.k.a((this.l + 0.5F), (this.m + 0.5F), (this.n + 0.5F), "sounds.StoneDoorOpen", 0.5F, 1.0F); 
/*  83 */       for (int var11 = 0; var11 < 1; var11++) {
/*     */         
/*  85 */         lq var2 = lv.a(this.mobID, this.k);
/*     */         
/*  87 */         if (var2 == null) {
/*     */           return;
/*     */         }
/*     */         
/*  91 */         int var12 = this.k.a(var2.getClass(), aoe.a().a(this.l, this.m, this.n, (this.l + 256), (this.m + 256), (this.n + 256)).b(256.0D, 40.0D, 256.0D)).size();
/*     */         
/*  93 */         if (var12 >= 1) {
/*     */           
/*  95 */           updateDelay();
/*     */           
/*     */           return;
/*     */         } 
/*  99 */         if (var2 != null) {
/*     */           
/* 101 */           if (this.delay > 0) {
/*     */             
/* 103 */             this.delay--;
/* 104 */             System.out.println(this.delay);
/*     */             return;
/*     */           } 
/* 107 */           double var4 = this.l + 0.5D;
/* 108 */           double var6 = this.m + 1.0D;
/* 109 */           double var8 = this.n + 0.5D;
/* 110 */           var2.b(var4, var6, var8, this.k.t.nextFloat() * 360.0F, 0.0F);
/* 111 */           writeNBTTagsTo(var2);
/* 112 */           this.k.d(var2);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 117 */     super.g();
/*     */   }
/*     */ 
/*     */   
/*     */   public void writeNBTTagsTo(lq par1Entity) {
/* 122 */     if (this.spawnerTags != null) {
/*     */       
/* 124 */       bq var2 = new bq();
/* 125 */       par1Entity.c(var2);
/* 126 */       Iterator<cd> var3 = this.spawnerTags.c().iterator();
/*     */       
/* 128 */       while (var3.hasNext()) {
/*     */         
/* 130 */         cd var4 = var3.next();
/* 131 */         var2.a(var4.e(), var4.b());
/*     */       } 
/*     */       
/* 134 */       par1Entity.e(var2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void updateDelay() {
/* 143 */     this.delay = 200 + this.k.t.nextInt(5000);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bq par1NBTTagCompound) {
/* 151 */     super.a(par1NBTTagCompound);
/* 152 */     this.mobID = par1NBTTagCompound.i("EntityId");
/* 153 */     this.delay = par1NBTTagCompound.d("Delay");
/*     */     
/* 155 */     if (par1NBTTagCompound.b("SpawnData")) {
/*     */       
/* 157 */       this.spawnerTags = par1NBTTagCompound.l("SpawnData");
/*     */     }
/*     */     else {
/*     */       
/* 161 */       this.spawnerTags = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(bq par1NBTTagCompound) {
/* 170 */     super.b(par1NBTTagCompound);
/* 171 */     par1NBTTagCompound.a("EntityId", this.mobID);
/* 172 */     par1NBTTagCompound.a("Delay", (short)this.delay);
/*     */     
/* 174 */     if (this.spawnerTags != null)
/*     */     {
/* 176 */       par1NBTTagCompound.a("SpawnData", this.spawnerTags);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public lq getMobEntity() {
/* 187 */     if (this.spawnedMob == null) {
/*     */       
/* 189 */       lq var1 = lv.a(getMobID(), (yc)null);
/* 190 */       writeNBTTagsTo(var1);
/* 191 */       this.spawnedMob = var1;
/*     */     } 
/*     */     
/* 194 */     return this.spawnedMob;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ef l() {
/* 202 */     bq var1 = new bq();
/* 203 */     b(var1);
/* 204 */     return (ef)new fg(this.l, this.m, this.n, 1, var1);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/tileentities/SCPTileEntity076.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */