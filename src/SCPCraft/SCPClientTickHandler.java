/*     */ package SCPCraft;
/*     */ 
/*     */ import ModLoader;
/*     */ import aul;
/*     */ import aum;
/*     */ import baz;
/*     */ import cpw.mods.fml.client.FMLClientHandler;
/*     */ import cpw.mods.fml.common.ITickHandler;
/*     */ import cpw.mods.fml.common.TickType;
/*     */ import java.util.EnumSet;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import qx;
/*     */ import ur;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPClientTickHandler
/*     */   implements ITickHandler
/*     */ {
/*  22 */   Minecraft mc = FMLClientHandler.instance().getClient();
/*     */   
/*     */   qx player;
/*     */   private boolean[] keyStates;
/*     */   
/*     */   public void tickStart(EnumSet type, Object... tickData) {
/*  28 */     if (type.equals(EnumSet.of(TickType.RENDER))) {
/*     */       
/*  30 */       float ticks = ((Float)tickData[0]).floatValue();
/*  31 */       onRenderTickStart(ticks);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void tickEnd(EnumSet type, Object... tickData) {
/*  38 */     if (type.equals(EnumSet.of(TickType.PLAYER))) {
/*     */       
/*  40 */       this.player = (qx)tickData[0];
/*     */     }
/*  42 */     else if (type.equals(EnumSet.of(TickType.RENDER))) {
/*     */       
/*  44 */       float ticks = ((Float)tickData[0]).floatValue();
/*  45 */       onRenderTickEnd(ticks);
/*  46 */       aul guiscreen = (Minecraft.x()).r;
/*  47 */       if (guiscreen != null && (ModLoader.getMinecraftInstance()).g != null)
/*     */       {
/*  49 */         onTickInGUI(guiscreen);
/*     */       }
/*     */     }
/*  52 */     else if (type.equals(EnumSet.of(TickType.CLIENT))) {
/*     */       
/*  54 */       if ((ModLoader.getMinecraftInstance()).g != null) onTickInGame();
/*     */     
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public EnumSet ticks() {
/*  61 */     return EnumSet.of(TickType.RENDER, TickType.CLIENT, TickType.PLAYER, TickType.GUI);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getLabel() {
/*  67 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean checkKey(int i) {
/*  74 */     this.keyStates = new boolean[256];
/*  75 */     if ((ModLoader.getMinecraftInstance()).r != null)
/*     */     {
/*  77 */       return false;
/*     */     }
/*  79 */     if (Keyboard.isKeyDown(i) != this.keyStates[i]) {
/*     */       
/*  81 */       this.keyStates[i] = !this.keyStates[i]; return !this.keyStates[i];
/*     */     } 
/*     */     
/*  84 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onRenderTickStart(float ticks) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void onRenderTickEnd(float ticks) {
/*  95 */     aum var5 = new aum(this.mc.y, this.mc.c, this.mc.d);
/*  96 */     int var6 = var5.a();
/*  97 */     int var7 = var5.b();
/*     */     
/*  99 */     if (this.mc.r == null) {
/*     */       
/* 101 */       ur var9 = this.mc.g.bJ.f(3);
/*     */       
/* 103 */       if (this.mc.y.W == 0 && var9 != null && var9.c == mod_SCP.GasMask.cj)
/*     */       {
/* 105 */         renderGasMaskBlur(var6, var7);
/*     */       }
/*     */       
/* 108 */       if (this.mc.g.getBlink() >= 0 && this.mc.g.getBlink() <= 10 && mod_SCP.isActive)
/*     */       {
/* 110 */         renderBlink(var6, var7);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onTickInGUI(aul gui) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void onTickInGame() {}
/*     */ 
/*     */ 
/*     */   
/*     */   private void renderBlink(int par1, int par2) {
/* 127 */     GL11.glDisable(2929);
/* 128 */     GL11.glDepthMask(false);
/* 129 */     GL11.glBlendFunc(770, 771);
/* 130 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 131 */     GL11.glDisable(3008);
/* 132 */     GL11.glBindTexture(3553, this.mc.o.b("%blur%/SCPCraft/textures/Blink.png"));
/* 133 */     baz tessellator = baz.a;
/* 134 */     tessellator.b();
/* 135 */     tessellator.a(0.0D, par2, -90.0D, 0.0D, 1.0D);
/* 136 */     tessellator.a(par1, par2, -90.0D, 1.0D, 1.0D);
/* 137 */     tessellator.a(par1, 0.0D, -90.0D, 1.0D, 0.0D);
/* 138 */     tessellator.a(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
/* 139 */     tessellator.a();
/* 140 */     GL11.glDepthMask(true);
/* 141 */     GL11.glEnable(2929);
/* 142 */     GL11.glEnable(3008);
/* 143 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   private void renderGasMaskBlur(int par1, int par2) {
/* 148 */     GL11.glDisable(2929);
/* 149 */     GL11.glDepthMask(false);
/* 150 */     GL11.glBlendFunc(770, 771);
/* 151 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 152 */     GL11.glDisable(3008);
/* 153 */     GL11.glBindTexture(3553, this.mc.o.b("%blur%/SCPCraft/textures/GasmaskOverlay.png"));
/* 154 */     baz tessellator = baz.a;
/* 155 */     tessellator.b();
/* 156 */     tessellator.a(0.0D, par2, -90.0D, 0.0D, 1.0D);
/* 157 */     tessellator.a(par1, par2, -90.0D, 1.0D, 1.0D);
/* 158 */     tessellator.a(par1, 0.0D, -90.0D, 1.0D, 0.0D);
/* 159 */     tessellator.a(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
/* 160 */     tessellator.a();
/* 161 */     GL11.glDepthMask(true);
/* 162 */     GL11.glEnable(2929);
/* 163 */     GL11.glEnable(3008);
/* 164 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void drawRect(int par0, int par1, int par2, int par3, int par4) {
/* 171 */     if (par0 < par2) {
/*     */       
/* 173 */       int var5 = par0;
/* 174 */       par0 = par2;
/* 175 */       par2 = var5;
/*     */     } 
/*     */     
/* 178 */     if (par1 < par3) {
/*     */       
/* 180 */       int var5 = par1;
/* 181 */       par1 = par3;
/* 182 */       par3 = var5;
/*     */     } 
/*     */     
/* 185 */     float var10 = (par4 >> 24 & 0xFF) / 255.0F;
/* 186 */     float var6 = (par4 >> 16 & 0xFF) / 255.0F;
/* 187 */     float var7 = (par4 >> 8 & 0xFF) / 255.0F;
/* 188 */     float var8 = (par4 & 0xFF) / 255.0F;
/* 189 */     baz var9 = baz.a;
/* 190 */     GL11.glEnable(3042);
/* 191 */     GL11.glDisable(3553);
/* 192 */     GL11.glBlendFunc(770, 771);
/* 193 */     GL11.glColor4f(var6, var7, var8, var10);
/* 194 */     var9.b();
/* 195 */     var9.a(par0, par3, 0.0D);
/* 196 */     var9.a(par2, par3, 0.0D);
/* 197 */     var9.a(par2, par1, 0.0D);
/* 198 */     var9.a(par0, par1, 0.0D);
/* 199 */     var9.a();
/* 200 */     GL11.glEnable(3553);
/* 201 */     GL11.glDisable(3042);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/SCPClientTickHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */