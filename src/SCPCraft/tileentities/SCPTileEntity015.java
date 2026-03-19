/*    */ package SCPCraft.tileentities;
/*    */ 
/*    */ import ModLoader;
/*    */ import SCPCraft.mod_SCP;
/*    */ import any;
/*    */ import bq;
/*    */ import java.util.Random;
/*    */ import ll;
/*    */ import lm;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import up;
/*    */ 
/*    */ public class SCPTileEntity015
/*    */   extends any
/*    */ {
/* 16 */   public Random rand = new Random();
/* 17 */   private Minecraft minecraft = ModLoader.getMinecraftInstance();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean anyPlayerInRange() {
/* 24 */     return (this.k.a(this.l + 0.5D, this.m + 0.5D, this.n + 0.5D, 4.0D) != null);
/*    */   }
/*    */ 
/*    */   
/*    */   public void g() {
/* 29 */     int[] Potions = { ll.q.H, ll.s.H, ll.k.H, ll.f.H, ll.d.H, ll.t.H, ll.u.H, mod_SCP.shake.H };
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 34 */     int[] Tools = { up.g.cj, up.t.cj, up.I.cj, up.B.cj, up.x.cj, up.q.cj, up.G.cj, up.z.cj, up.v.cj, mod_SCP.SCP143Pickaxe.cj, mod_SCP.SCP143Sword.cj, mod_SCP.Wrench.cj };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 41 */     if (!anyPlayerInRange()) {
/*    */       return;
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 47 */     for (int tools = 0; tools <= 11; tools++) {
/*    */       
/* 49 */       if (this.rand.nextInt(1000) == 0 && this.minecraft.b.g() && (this.k.a(this.l + 0.5D, this.m + 0.5D, this.n + 0.5D, 4.0D)).bJ.e(Tools[tools])) {
/*    */         
/* 51 */         double d = this.l;
/* 52 */         double d1 = this.m;
/* 53 */         double d2 = this.n;
/* 54 */         for (int var3 = 0; var3 < 50; var3++) {
/* 55 */           this.k.a("splash", (this.k.a(this.l + 0.5D, this.m + 0.5D, this.n + 0.5D, 4.0D)).t, (this.k.a(this.l + 0.5D, this.m + 0.5D, this.n + 0.5D, 4.0D)).u, (this.k.a(this.l + 0.5D, this.m + 0.5D, this.n + 0.5D, 4.0D)).v, 0.0D, -0.1D, 0.0D);
/* 56 */           this.k.a("splash", (this.k.a(this.l + 0.5D, this.m + 0.5D, this.n + 0.5D, 4.0D)).t, (this.k.a(this.l + 0.5D, this.m + 0.5D, this.n + 0.5D, 4.0D)).u, (this.k.a(this.l + 0.5D, this.m + 0.5D, this.n + 0.5D, 4.0D)).v, 0.0D, -0.1D, 0.0D);
/* 57 */           this.k.a("splash", (this.k.a(this.l + 0.5D, this.m + 0.5D, this.n + 0.5D, 4.0D)).t, (this.k.a(this.l + 0.5D, this.m + 0.5D, this.n + 0.5D, 4.0D)).u, (this.k.a(this.l + 0.5D, this.m + 0.5D, this.n + 0.5D, 4.0D)).v, 0.0D, -0.1D, 0.0D);
/*    */         } 
/* 59 */         this.k.a(this.l + 0.5D, this.m + 0.5D, this.n + 0.5D, 4.0D).d(new lm(Potions[this.rand.nextInt(8)], 200, 1));
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 64 */     super.g();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bq par1NBTTagCompound) {
/* 69 */     super.a(par1NBTTagCompound);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(bq par1NBTTagCompound) {
/* 74 */     super.b(par1NBTTagCompound);
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/tileentities/SCPTileEntity015.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */