/*     */ package SCPCraft.guis;
/*     */ 
/*     */ import SCPCraft.items.SCPItem1025;
/*     */ import SCPCraft.mod_SCP;
/*     */ import atb;
/*     */ import aul;
/*     */ import java.util.Random;
/*     */ import ll;
/*     */ import lm;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ import qx;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPGui1025
/*     */   extends aul
/*     */ {
/*  20 */   Random rand = new Random();
/*     */   qx player;
/*  22 */   int Disease = this.rand.nextInt(8);
/*     */   
/*     */   protected int xSize;
/*     */   
/*     */   protected int ySize;
/*     */ 
/*     */   
/*     */   public void A_() {
/*  30 */     this.i.clear();
/*  31 */     this.i.add(new atb(1, this.g - 110, this.h / 30, 50, 20, "Close"));
/*  32 */     Keyboard.enableRepeatEvents(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(atb button) {
/*  37 */     if (button.f == 1) {
/*     */       
/*  39 */       getDisease();
/*  40 */       this.player.i();
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(char par1, int par2) {
/*  45 */     if (par2 == 1) {
/*     */       
/*  47 */       getDisease();
/*  48 */       this.f.a((aul)null);
/*  49 */       this.f.h();
/*     */     } 
/*     */   }
/*  52 */   public SCPGui1025(yc world, Minecraft minecraft, qx player) { this.xSize = 176;
/*  53 */     this.ySize = 166; } public SCPGui1025(SCPItem1025 scpItem1025, qx pl) { this.xSize = 176; this.ySize = 166;
/*     */     this.player = pl; }
/*     */ 
/*     */   
/*     */   public void a(int i, int j, float f) {
/*  58 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/*  59 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/*  60 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/*  61 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/*  62 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/*  63 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/*  64 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/*  65 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/*  66 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/*  67 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/*  68 */     a(45, 25, this.g - 45, this.h - 45, -1072689136, -804253680);
/*  69 */     a(45, 25, this.g - 45, this.h - 45, -1072689136, -804253680);
/*  70 */     a(45, 25, this.g - 45, this.h - 45, -1072689136, -804253680);
/*  71 */     a(45, 25, this.g - 45, this.h - 45, -1072689136, -804253680);
/*  72 */     a(45, 25, this.g - 45, this.h - 45, -1072689136, -804253680);
/*  73 */     a(45, 25, this.g - 45, this.h - 45, -1072689136, -804253680);
/*  74 */     a(45, 25, this.g - 45, this.h - 45, -1072689136, -804253680);
/*  75 */     a(45, 25, this.g - 45, this.h - 45, -1072689136, -804253680);
/*  76 */     a(this.l, "SCP-1025", this.g / 2, 15, 16777215);
/*  77 */     if (this.Disease == 0) a(this.l, "Blindness", this.g / 2, 50, 16777215); 
/*  78 */     if (this.Disease == 1) a(this.l, "Nausea", this.g / 2, 50, 16777215); 
/*  79 */     if (this.Disease == 2) a(this.l, "Food Poisoning", this.g / 2, 50, 16777215); 
/*  80 */     if (this.Disease == 3) a(this.l, "Headache", this.g / 2, 50, 16777215); 
/*  81 */     if (this.Disease == 4) a(this.l, "Gonorrhea", this.g / 2, 50, 16777215); 
/*  82 */     if (this.Disease == 5) a(this.l, "Anorexia Nervosa", this.g / 2, 50, 16777215); 
/*  83 */     if (this.Disease == 6) a(this.l, "Common Cold", this.g / 2, 50, 16777215); 
/*  84 */     if (this.Disease == 7) a(this.l, "Stomach Pain", this.g / 2, 50, 16777215); 
/*  85 */     super.a(i, j, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public void getDisease() {
/*  90 */     if (this.player != null) {
/*  91 */       if (this.Disease == 0)
/*     */       {
/*  93 */         this.player.d(new lm(ll.q.H, 200, 2));
/*     */       }
/*  95 */       if (this.Disease == 1)
/*     */       {
/*  97 */         this.player.d(new lm(ll.k.H, 200, 2));
/*     */       }
/*  99 */       if (this.Disease == 2) {
/*     */         
/* 101 */         this.player.d(new lm(ll.s.H, 200, 2));
/* 102 */         this.player.d(new lm(ll.u.H, 200, 2));
/*     */       } 
/* 104 */       if (this.Disease == 3)
/*     */       {
/* 106 */         this.player.d(new lm(ll.t.H, 200, 2));
/*     */       }
/* 108 */       if (this.Disease == 4)
/*     */       {
/* 110 */         this.player.c(10);
/*     */       }
/* 112 */       if (this.Disease == 5) {
/*     */         
/* 114 */         this.player.j(20.0F);
/* 115 */         this.player.d(new lm(ll.s.H, 200, 2));
/*     */       } 
/* 117 */       if (this.Disease == 6)
/*     */       {
/* 119 */         this.player.d(new lm(mod_SCP.shake.H, 100, 1));
/*     */       }
/* 121 */       if (this.Disease == 7) {
/*     */         
/* 123 */         this.player.d(new lm(ll.s.H, 100, 1));
/* 124 */         this.player.d(new lm(ll.i.H, 60, 1));
/*     */       } 
/* 126 */       this.player.bx();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/guis/SCPGui1025.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */