/*     */ package SCPCraft.guis;
/*     */ 
/*     */ import ModLoader;
/*     */ import SCPCraft.mod_SCP;
/*     */ import atb;
/*     */ import aul;
/*     */ import ayp;
/*     */ import ays;
/*     */ import bey;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ import java.nio.charset.Charset;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Random;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPGuiChangelog
/*     */   extends aul
/*     */ {
/*     */   public static boolean isClosed = false;
/*  25 */   private static final Random rand = new Random();
/*  26 */   private float updateCounter = 0.0F;
/*  27 */   private String Change = "Where is Changelog.txt?";
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
/*     */ 
/*     */   
/*     */   public int esc;
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
/*     */ 
/*     */ 
/*     */   
/*     */   public void A_() {
/*  79 */     this.i.clear();
/*  80 */     if (!isClosed)
/*     */     {
/*  82 */       this.i.add(new atb(1, this.g / 2 - 37, this.h / 2 + 48, 70, 20, "Continue"));
/*     */     }
/*     */   }
/*     */   
/*  86 */   public SCPGuiChangelog() { this.esc = 1; BufferedReader var1 = null; try { ArrayList<String> var2 = new ArrayList(); var1 = new BufferedReader(new InputStreamReader(SCPGuiChangelog.class.getResourceAsStream("/SCPCraft/changelog.txt"), Charset.forName("UTF-8"))); String var3; while ((var3 = var1.readLine()) != null) { var3 = var3.trim(); if (var3.length() > 0)
/*     */           var2.add(var3);  }  do { this.Change = var2.get(rand.nextInt(var2.size())); } while (this.Change.hashCode() == 125780783); } catch (IOException var12) {  } finally { if (var1 != null)
/*     */         try { var1.close(); } catch (IOException var11) {}  }
/*  89 */      this.updateCounter = rand.nextFloat(); } public void a(atb button) { if (button.f == 1) {
/*     */       
/*  91 */       ays ays = (ModLoader.getMinecraftInstance()).g;
/*  92 */       ayp ayp = (ModLoader.getMinecraftInstance()).e;
/*  93 */       this.f.a((aul)new bey());
/*  94 */       this; isClosed = true;
/*     */     } 
/*  96 */     if (Keyboard.isKeyDown(this.esc)) {
/*     */       
/*  98 */       ays ays = (ModLoader.getMinecraftInstance()).g;
/*  99 */       ayp ayp = (ModLoader.getMinecraftInstance()).e;
/* 100 */       this.f.a((aul)new bey());
/* 101 */       this; isClosed = true;
/*     */     }  }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int i, int j, float f) {
/* 107 */     if (!isClosed) {
/*     */       
/* 109 */       int k = this.g / 2 - 130;
/* 110 */       int l = this.h / 2 - 100;
/* 111 */       e();
/* 112 */       int tempvar = this.f.o.b("/SCPCraft/textures/guis/Changelog.png");
/* 113 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 114 */       this.f.o.b(tempvar);
/* 115 */       b(k, l, 0, 0, 256, 166);
/* 116 */       b(this.l, this.Change, this.g / 2 - 110, this.h / 2 - 20, 16777215);
/* 117 */       a(this.l, mod_SCP.SCPCraftVersion + " Changelog", this.g / 2 - 1, this.h / 2 - 88, 16777215);
/*     */     } 
/* 119 */     super.a(i, j, f);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/guis/SCPGuiChangelog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */