/*     */ package SCPCraft;
/*     */ 
/*     */ import SCPCraft.CoroAI.entity.c_EntityPlayerMPExt;
/*     */ import iq;
/*     */ import ir;
/*     */ import md;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import qj;
/*     */ import qw;
/*     */ import ri;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class c_EntInterface
/*     */   extends qj
/*     */ {
/*     */   public qw inventory;
/*     */   public c_EntityPlayerMPExt fakePlayer;
/*     */   
/*     */   public c_EntInterface(yc world) {
/*  24 */     super(world);
/*     */ 
/*     */     
/*     */     try {
/*  28 */       if (!world.I)
/*     */       {
/*  30 */         this.fakePlayer = newFakePlayer(world);
/*     */       }
/*     */     }
/*  33 */     catch (Exception ex) {
/*     */       
/*  35 */       ex.printStackTrace();
/*     */       return;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public c_EntityPlayerMPExt newFakePlayer(yc world) {
/*  42 */     MinecraftServer mc = MinecraftServer.D();
/*     */ 
/*     */ 
/*     */     
/*  46 */     if (mc == null)
/*     */     {
/*  48 */       return null;
/*     */     }
/*     */ 
/*     */     
/*  52 */     c_EntityPlayerMPExt player = null;
/*     */ 
/*     */ 
/*     */     
/*  56 */     if (this.p.c((int)(this.t / 16.0D), (int)(this.v / 16.0D))) {
/*  57 */       player = new c_EntityPlayerMPExt(mc, world, "fakePlayer_" + this.k, new ir(world));
/*  58 */       this.inventory = player.bJ;
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
/*  71 */     return player;
/*     */   }
/*     */ 
/*     */   
/*     */   public int aT() {
/*  76 */     return 20;
/*     */   }
/*     */ 
/*     */   
/*     */   public int aU() {
/*  81 */     return this.aR;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getPlHealth() {
/*  86 */     return this.fakePlayer.aR;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPlHealth(int h) {
/*     */     try {
/*  92 */       if (this.fakePlayer != null) this.fakePlayer.aR = h; 
/*  93 */     } catch (Exception ex) {
/*  94 */       ex.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean getSleeping() {
/* 100 */     return this.fakePlayer.bZ;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSleeping(boolean h) {
/* 105 */     this.fakePlayer.bZ = h;
/*     */   }
/*     */ 
/*     */   
/*     */   public void updateItemUse(ur is, int val) {
/* 110 */     this.fakePlayer.c(is, val);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onItemUseFinish() {
/* 115 */     if (this.fakePlayer instanceof iq && ((iq)this.fakePlayer).a != null)
/*     */     {
/* 117 */       this.fakePlayer.n();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void setThrower(ri prj, md ent) {
/* 123 */     c_CoroAIUtil.setPrivateValueBoth(ri.class, prj, c_CoroAIUtil.refl_thrower_obf, c_CoroAIUtil.refl_thrower_mcp, ent);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/c_EntInterface.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */