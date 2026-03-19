/*     */ package SCPCraft.guis;
/*     */ 
/*     */ import ModLoader;
/*     */ import SCPCraft.SCPThread;
/*     */ import atb;
/*     */ import aul;
/*     */ import ayp;
/*     */ import ays;
/*     */ import bey;
/*     */ import java.io.IOException;
/*     */ import java.util.Random;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ import qx;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ public class SCPGuiWrongVersion
/*     */   extends aul
/*     */ {
/*     */   public static boolean isRightVersion;
/*  22 */   Random rand = new Random();
/*     */   
/*     */   public int esc;
/*     */   
/*     */   protected int xSize;
/*     */   protected int ySize;
/*     */   
/*     */   public void A_() {
/*  30 */     Minecraft mc = ModLoader.getMinecraftInstance();
/*  31 */     this.i.clear();
/*  32 */     this.i.add(new atb(1, this.g - 110, this.h / 30, 80, 20, "Continue"));
/*  33 */     Keyboard.enableRepeatEvents(true);
/*  34 */     this.i.add(new atb(2, this.g / 2 - 22, this.h / 2 + 40, 50, 20, "Link"));
/*     */   }
/*     */   
/*  37 */   public SCPGuiWrongVersion(yc world, Minecraft minecraft, qx player, String par1Str) { this.esc = 1;
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
/*  73 */     this.xSize = 700;
/*  74 */     this.ySize = 460; }
/*     */ 
/*     */   
/*     */   public void a(int i, int j, float f) {
/*  78 */     e();
/*  79 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/*  80 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/*  81 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/*  82 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/*  83 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/*  84 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/*  85 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/*  86 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/*  87 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/*  88 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/*  89 */     a(45, 25, this.g - 45, this.h - 45, -1072689136, -804253680);
/*  90 */     a(45, 25, this.g - 45, this.h - 45, -1072689136, -804253680);
/*  91 */     a(45, 25, this.g - 45, this.h - 45, -1072689136, -804253680);
/*  92 */     a(45, 25, this.g - 45, this.h - 45, -1072689136, -804253680);
/*  93 */     a(45, 25, this.g - 45, this.h - 45, -1072689136, -804253680);
/*  94 */     a(45, 25, this.g - 45, this.h - 45, -1072689136, -804253680);
/*  95 */     a(45, 25, this.g - 45, this.h - 45, -1072689136, -804253680);
/*  96 */     a(45, 25, this.g - 45, this.h - 45, -1072689136, -804253680);
/*     */     
/*  98 */     this; if (!isRightVersion) {
/*     */       
/* 100 */       a(this.l, "You are using the wrong Forge version for SCPCraft.", this.g / 2, 60, 16777215);
/* 101 */       a(this.l, "Go to the forum to see which version is needed.", this.g / 2, 100, 16777215);
/*     */     } 
/* 103 */     super.a(i, j, f);
/*     */   }
/*     */   
/*     */   public void a(atb button) {
/*     */     if (button.f == 1) {
/*     */       ays ays = (ModLoader.getMinecraftInstance()).g;
/*     */       ayp ayp = (ModLoader.getMinecraftInstance()).e;
/*     */       this.f.a((aul)new bey());
/*     */     } 
/*     */     if (button.f == 2)
/*     */       try {
/*     */         SCPThread.main(null);
/*     */       } catch (IOException e) {
/*     */         e.printStackTrace();
/*     */       }  
/*     */     if (Keyboard.isKeyDown(this.esc)) {
/*     */       this;
/*     */       if (isRightVersion) {
/*     */         this.f.g.i();
/*     */       } else {
/*     */         this;
/*     */         if (!isRightVersion) {
/*     */           ays ays = (ModLoader.getMinecraftInstance()).g;
/*     */           ayp ayp = (ModLoader.getMinecraftInstance()).e;
/*     */           this.f.a((aul)new bey());
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/guis/SCPGuiWrongVersion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */