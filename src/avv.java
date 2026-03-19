/*     */ import SCPCraft.mod_SCP;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @SideOnly(Side.CLIENT)
/*     */ public abstract class avv
/*     */   extends avf
/*     */ {
/*     */   private boolean p;
/*     */   
/*     */   public avv(rq par1Container) {
/*  22 */     super(par1Container);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void A_() {
/*  30 */     super.A_();
/*     */     
/*  32 */     if (!this.f.g.bz().isEmpty()) {
/*     */       
/*  34 */       this.n = 160 + (this.g - this.b - 200) / 2;
/*  35 */       this.p = true;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int par1, int par2, float par3) {
/*  44 */     super.a(par1, par2, par3);
/*     */     
/*  46 */     if (this.p)
/*     */     {
/*  48 */       g();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void g() {
/*  57 */     int var1 = this.n - 124;
/*  58 */     int var2 = this.o;
/*  59 */     Collection var4 = this.f.g.bz();
/*     */     
/*  61 */     if (!var4.isEmpty()) {
/*     */       
/*  63 */       int var5 = this.f.o.b("/gui/inventory.png");
/*  64 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  65 */       GL11.glDisable(2896);
/*  66 */       int var6 = 33;
/*     */       
/*  68 */       if (var4.size() > 5)
/*     */       {
/*  70 */         var6 = 132 / (var4.size() - 1);
/*     */       }
/*     */       
/*  73 */       for (Iterator<lm> var7 = this.f.g.bz().iterator(); var7.hasNext(); var2 += var6) {
/*     */         
/*  75 */         lm var8 = var7.next();
/*  76 */         ll var9 = ll.a[var8.a()];
/*  77 */         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */         
/*  79 */         if (var9 == mod_SCP.bloodStone || var9 == mod_SCP.crystal || var9 == mod_SCP.electricity || var9 == mod_SCP.shake || var9 == mod_SCP.verminGod || var9 == mod_SCP.skeleton || var9 == mod_SCP.sticky) {
/*     */           
/*  81 */           int var52 = this.f.o.b("/SCPCraft/textures/guis/SCPInventory.png");
/*  82 */           GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  83 */           GL11.glDisable(2896);
/*  84 */           this.f.o.b(var52);
/*     */         } else {
/*     */           
/*  87 */           GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  88 */           this.f.o.b(var5);
/*     */         } 
/*  90 */         b(var1, var2, 0, 166, 140, 32);
/*     */         
/*  92 */         if (var9.d()) {
/*     */           
/*  94 */           int var10 = var9.e();
/*  95 */           b(var1 + 6, var2 + 7, 0 + var10 % 8 * 18, 198 + var10 / 8 * 18, 18, 18);
/*     */         } 
/*     */         
/*  98 */         String var12 = bm.a(var9.a());
/*     */         
/* 100 */         if (var8.c() == 1) {
/*     */           
/* 102 */           var12 = var12 + " II";
/*     */         }
/* 104 */         else if (var8.c() == 2) {
/*     */           
/* 106 */           var12 = var12 + " III";
/*     */         }
/* 108 */         else if (var8.c() == 3) {
/*     */           
/* 110 */           var12 = var12 + " IV";
/*     */         } 
/*     */         
/* 113 */         this.l.a(var12, var1 + 10 + 18, var2 + 6, 16777215);
/* 114 */         String var11 = ll.a(var8);
/* 115 */         this.l.a(var11, var1 + 10 + 18, var2 + 6 + 10, 8355711);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/avv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */