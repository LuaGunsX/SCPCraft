/*     */ package SCPCraft;
/*     */ import BaseMod;
/*     */ import ModLoader;
/*     */ import SCPCraft.blocks.SCPBlock015;
/*     */ import SCPCraft.blocks.SCPBlockDesk;
/*     */ import SCPCraft.blocks.SCPBlockSlideDoor;
/*     */ import SCPCraft.blocks.SCPBlockStoneCoffin;
/*     */ import SCPCraft.entities.SCPEntity015Boss;
/*     */ import SCPCraft.entities.SCPEntity015Projectile;
/*     */ import SCPCraft.entities.SCPEntity019n2;
/*     */ import SCPCraft.entities.SCPEntity023;
/*     */ import SCPCraft.entities.SCPEntity049;
/*     */ import SCPCraft.entities.SCPEntity053;
/*     */ import SCPCraft.entities.SCPEntity058;
/*     */ import SCPCraft.entities.SCPEntity073;
/*     */ import SCPCraft.entities.SCPEntity076;
/*     */ import SCPCraft.entities.SCPEntity080;
/*     */ import SCPCraft.entities.SCPEntity087;
/*     */ import SCPCraft.entities.SCPEntity096Cry;
/*     */ import SCPCraft.entities.SCPEntity096Docile;
/*     */ import SCPCraft.entities.SCPEntity096Mad;
/*     */ import SCPCraft.entities.SCPEntity1000;
/*     */ import SCPCraft.entities.SCPEntity106;
/*     */ import SCPCraft.entities.SCPEntity111;
/*     */ import SCPCraft.entities.SCPEntity1440;
/*     */ import SCPCraft.entities.SCPEntity173;
/*     */ import SCPCraft.entities.SCPEntity217Cow;
/*     */ import SCPCraft.entities.SCPEntity217Creeper;
/*     */ import SCPCraft.entities.SCPEntity217Pig;
/*     */ import SCPCraft.entities.SCPEntity217Spider;
/*     */ import SCPCraft.entities.SCPEntity217Testificate;
/*     */ import SCPCraft.entities.SCPEntity217Zombie;
/*     */ import SCPCraft.entities.SCPEntity222Clone;
/*     */ import SCPCraft.entities.SCPEntity273;
/*     */ import SCPCraft.entities.SCPEntity280;
/*     */ import SCPCraft.entities.SCPEntity457;
/*     */ import SCPCraft.entities.SCPEntity472;
/*     */ import SCPCraft.entities.SCPEntity50AEJ;
/*     */ import SCPCraft.entities.SCPEntity513;
/*     */ import SCPCraft.entities.SCPEntity538;
/*     */ import SCPCraft.entities.SCPEntity594;
/*     */ import SCPCraft.entities.SCPEntity594Naked;
/*     */ import SCPCraft.entities.SCPEntity629;
/*     */ import SCPCraft.entities.SCPEntity682;
/*     */ import SCPCraft.entities.SCPEntity846;
/*     */ import SCPCraft.entities.SCPEntity872;
/*     */ import SCPCraft.entities.SCPEntity966;
/*     */ import SCPCraft.entities.SCPEntity997;
/*     */ import SCPCraft.entities.SCPEntity999;
/*     */ import SCPCraft.entities.SCPEntityAtomicGrenade;
/*     */ import SCPCraft.entities.SCPEntityClassD027;
/*     */ import SCPCraft.entities.SCPEntityRat;
/*     */ import SCPCraft.entities.SCPEntityReal682;
/*     */ import SCPCraft.guis.SCPGuiDocument;
/*     */ import SCPCraft.models.SCPModel019n2;
/*     */ import SCPCraft.models.SCPModel023;
/*     */ import SCPCraft.models.SCPModel049;
/*     */ import SCPCraft.models.SCPModel053;
/*     */ import SCPCraft.models.SCPModel058;
/*     */ import SCPCraft.models.SCPModel087;
/*     */ import SCPCraft.models.SCPModel096Aggro;
/*     */ import SCPCraft.models.SCPModel096Cry;
/*     */ import SCPCraft.models.SCPModel096Docile;
/*     */ import SCPCraft.models.SCPModel1000;
/*     */ import SCPCraft.models.SCPModel106;
/*     */ import SCPCraft.models.SCPModel111;
/*     */ import SCPCraft.models.SCPModel1440;
/*     */ import SCPCraft.models.SCPModel173;
/*     */ import SCPCraft.models.SCPModel217Cow;
/*     */ import SCPCraft.models.SCPModel217Creeper;
/*     */ import SCPCraft.models.SCPModel217Pig;
/*     */ import SCPCraft.models.SCPModel217Spider;
/*     */ import SCPCraft.models.SCPModel217Testificate;
/*     */ import SCPCraft.models.SCPModel280;
/*     */ import SCPCraft.models.SCPModel372;
/*     */ import SCPCraft.models.SCPModel457;
/*     */ import SCPCraft.models.SCPModel472;
/*     */ import SCPCraft.models.SCPModel50AEJ;
/*     */ import SCPCraft.models.SCPModel513;
/*     */ import SCPCraft.models.SCPModel594Naked;
/*     */ import SCPCraft.models.SCPModel594UnSheered;
/*     */ import SCPCraft.models.SCPModel629;
/*     */ import SCPCraft.models.SCPModel682;
/*     */ import SCPCraft.models.SCPModel846;
/*     */ import SCPCraft.models.SCPModel872;
/*     */ import SCPCraft.models.SCPModel966;
/*     */ import SCPCraft.models.SCPModel997;
/*     */ import SCPCraft.models.SCPModel999;
/*     */ import SCPCraft.models.SCPModelClassDGuy;
/*     */ import SCPCraft.models.SCPModelRat;
/*     */ import SCPCraft.models.SCPModelReal682;
/*     */ import SCPCraft.renders.SCPBlockRenders;
/*     */ import SCPCraft.renders.SCPRender015Boss;
/*     */ import SCPCraft.renders.SCPRender058;
/*     */ import SCPCraft.renders.SCPRender629;
/*     */ import SCPCraft.renders.SCPRender682;
/*     */ import SCPCraft.renders.SCPRender999;
/*     */ import SCPCraft.renders.SCPRenderGrenade;
/*     */ import SCPCraft.renders.SCPRenderInventory;
/*     */ import SCPCraft.renders.SCPRenderProjectile;
/*     */ import SCPCraft.worldgen.SCPWorldGen006;
/*     */ import SCPCraft.worldgen.SCPWorldGen143;
/*     */ import SCPCraft.worldgen.SCPWorldGenCustomMinable;
/*     */ import SCPCraft.worldgen.SCPWorldGenSCP354;
/*     */ import amq;
/*     */ import any;
/*     */ import arv;
/*     */ import avf;
/*     */ import aww;
/*     */ import axa;
/*     */ import ays;
/*     */ import baz;
/*     */ import bbb;
/*     */ import bcc;
/*     */ import bcj;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import jl;
/*     */ import la;
/*     */ import me;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import qx;
/*     */ import ur;
/*     */ import yc;
/*     */ import ym;
/*     */ import yy;
/*     */ 
/*     */ public class mod_Others extends BaseMod {
/*     */   int create;
/*     */   Random rand;
/*     */   public SCPWorldGenSCP354 worldgenlakes;
/*     */   public SCPWorldGen006 scp006Gen;
/*     */   public SCPWorldGen143 scp143Gen;
/*     */   public static arv keyActivate = new arv("key.Activate", 49);
/*     */   public static arv keyBlink = new arv("key.blink", 48);
/*     */   public static arv remoteDoors = new arv("key.doors", 47);
/*     */   public static int KeycardSlotID;
/*     */   public static int ToiletID;
/*     */   public static int SmokeBlockID;
/*     */   public static int SCP310ID;
/*     */   
/*     */   public mod_Others() {
/* 143 */     this.create = 0;
/* 144 */     this.rand = new Random();
/*     */ 
/*     */     
/* 147 */     this.worldgenlakes = new SCPWorldGenSCP354(mod_SCP.SCP354Still.cm);
/* 148 */     this.scp006Gen = new SCPWorldGen006(mod_SCP.SCP006Still.cm);
/* 149 */     this.scp143Gen = new SCPWorldGen143();
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
/* 160 */     this.renderBlocks = new SCPBlockRenders();
/* 161 */     this.renderInv = new SCPRenderInventory();
/*     */ 
/*     */ 
/*     */     
/* 165 */     ModLoader.getMinecraftInstance(); this.mc = Minecraft.x();
/*     */   }
/*     */   public static int CorrodedDoorID; public static int SCP789JID; public static int SCP015ID; public static int SlidingDoorID;
/*     */   public static int SCP079ID;
/*     */   public static int SCP076ID;
/*     */   public static int ShelfID;
/*     */   
/*     */   public String getVersion() {
/* 173 */     return "";
/*     */   }
/*     */   public static int StoneCoffinID; public static int PosterID; public static int RemoteDoorCompID; public static int SCP273ID; public static int SCP822ID; public static int DeskID;
/*     */   public static int ChairID;
/*     */   
/*     */   public void load() {
/* 179 */     this; if (!isRightForgeVersion())
/*     */     {
/* 181 */       for (int times = 0; times <= 9; times++)
/*     */       {
/* 183 */         System.out.println("You are using the wrong Forge Version for SCPCraft.");
/*     */       }
/*     */     }
/* 186 */     ModLoader.registerKey(this, keyBlink, true);
/* 187 */     ModLoader.registerKey(this, keyActivate, false);
/* 188 */     ModLoader.registerKey(this, remoteDoors, false);
/* 189 */     ModLoader.registerContainerID(this, 6079);
/* 190 */     KeycardSlotID = ModLoader.getUniqueBlockModelID(this, true);
/* 191 */     SmokeBlockID = ModLoader.getUniqueBlockModelID(this, true);
/* 192 */     SCP310ID = ModLoader.getUniqueBlockModelID(this, true);
/* 193 */     CorrodedDoorID = ModLoader.getUniqueBlockModelID(this, false);
/* 194 */     SCP789JID = ModLoader.getUniqueBlockModelID(this, true);
/* 195 */     SCP015ID = ModLoader.getUniqueBlockModelID(this, true);
/* 196 */     SlidingDoorID = ModLoader.getUniqueBlockModelID(this, false);
/* 197 */     SCP079ID = ModLoader.getUniqueBlockModelID(this, true);
/* 198 */     SCP076ID = ModLoader.getUniqueBlockModelID(this, true);
/* 199 */     ShelfID = ModLoader.getUniqueBlockModelID(this, true);
/* 200 */     StoneCoffinID = ModLoader.getUniqueBlockModelID(this, true);
/* 201 */     PosterID = ModLoader.getUniqueBlockModelID(this, true);
/* 202 */     RemoteDoorCompID = ModLoader.getUniqueBlockModelID(this, true);
/* 203 */     SCP273ID = ModLoader.getUniqueBlockModelID(this, true);
/* 204 */     SCP822ID = ModLoader.getUniqueBlockModelID(this, true);
/* 205 */     ToiletID = ModLoader.getUniqueBlockModelID(this, true);
/* 206 */     DeskID = ModLoader.getUniqueBlockModelID(this, true);
/* 207 */     ChairID = ModLoader.getUniqueBlockModelID(this, true);
/* 208 */     AlarmID = ModLoader.getUniqueBlockModelID(this, true);
/* 209 */     SCP513ID = ModLoader.getUniqueBlockModelID(this, true);
/* 210 */     ModLoader.addSpawn(SCPEntity1000.class, 4, 1, 1, me.b, new yy[] { yy.f, yy.w, yy.x });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 216 */     ModLoader.setInGameHook(this, true, false);
/*     */   }
/*     */   public static int AlarmID; public static int SCP513ID; public SCPBlockRenders renderBlocks; public SCPRenderInventory renderInv; public yc worldObj; public Minecraft mc; public static boolean remoteDoorActivate;
/*     */   public static boolean wantsToTalk = true;
/*     */   
/*     */   public void takenFromCrafting(qx entityplayer, ur itemstack, la iinventory) {
/* 222 */     boolean flag = false;
/* 223 */     if (itemstack.c == mod_SCP.DocumentTable.cm) {
/*     */       
/* 225 */       entityplayer.a((jl)mod_SCP.craftCrafter, 1);
/* 226 */       flag = true;
/*     */     } 
/*     */     
/* 229 */     if (itemstack.c == mod_SCP.GasMask.cj) {
/*     */       
/* 231 */       entityplayer.a((jl)mod_SCP.classD, 1);
/* 232 */       flag = true;
/*     */     } 
/*     */     
/* 235 */     if (itemstack.c == mod_SCP.SCP458.cj) {
/*     */       
/* 237 */       entityplayer.a((jl)mod_SCP.pizzaBreak, 1);
/* 238 */       flag = true;
/*     */     } 
/*     */     
/* 241 */     if (itemstack.c == mod_SCP.ClassDPants.cj) {
/*     */       
/* 243 */       entityplayer.a((jl)mod_SCP.classDpants, 1);
/* 244 */       flag = true;
/*     */     } 
/*     */     
/* 247 */     if (itemstack.c == mod_SCP.ClassDShoes.cj) {
/*     */       
/* 249 */       entityplayer.a((jl)mod_SCP.classDboots, 1);
/* 250 */       flag = true;
/*     */     } 
/*     */     
/* 253 */     if (itemstack.c == mod_SCP.ClassDShirt.cj) {
/*     */       
/* 255 */       entityplayer.a((jl)mod_SCP.classDshirt, 1);
/* 256 */       flag = true;
/*     */     } 
/*     */     
/* 259 */     if (itemstack.c == mod_SCP.Locker.cm) {
/*     */       
/* 261 */       entityplayer.a((jl)mod_SCP.reinforcedIron, 1);
/* 262 */       flag = true;
/*     */     } 
/*     */     
/* 265 */     if (itemstack.c == mod_SCP.TothBrush.cj) {
/*     */       
/* 267 */       entityplayer.a((jl)mod_SCP.brushYourToths, 1);
/* 268 */       flag = true;
/*     */     } 
/*     */     
/* 271 */     if (itemstack.c == mod_SCP.SmokeBlock.cm) {
/*     */       
/* 273 */       entityplayer.a((jl)mod_SCP.noSmoking, 1);
/* 274 */       flag = true;
/*     */     } 
/*     */     
/* 277 */     if (itemstack.c == mod_SCP.SCP500G.cj) {
/*     */       
/* 279 */       entityplayer.a((jl)mod_SCP.painKiller, 1);
/* 280 */       flag = true;
/*     */     } 
/*     */     
/* 283 */     if (itemstack.c == mod_SCP.SCP420J.cj) {
/*     */       
/* 285 */       entityplayer.a((jl)mod_SCP.bestShit, 1);
/* 286 */       flag = true;
/*     */     } 
/*     */     
/* 289 */     if (itemstack.c == mod_SCP.L1Keycard.cj) {
/*     */       
/* 291 */       entityplayer.a((jl)mod_SCP.ClassDNoob, 1);
/* 292 */       flag = true;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void onItemPickup(qx entityplayer, ur itemstack) {
/* 298 */     if (itemstack.c == mod_SCP.Item019.cj)
/*     */     {
/* 300 */       entityplayer.a((jl)mod_SCP.breakSCP019, 1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void addRenderer(Map<Class<SCPEntity173>, bcj> map) {
/* 307 */     map.put(SCPEntity173.class, new bcj((axa)new SCPModel173(), 0.5F));
/* 308 */     map.put(SCPEntity111.class, new bcj((axa)new SCPModel111(), 0.5F));
/* 309 */     map.put(SCPEntityClassDGuy.class, new bcj((axa)new SCPModelClassDGuy(), 0.5F));
/* 310 */     map.put(SCPEntity019n2.class, new bcj((axa)new SCPModel019n2(), 0.1F));
/* 311 */     map.put(SCPEntity457.class, new bcj((axa)new SCPModel457(), 0.5F));
/* 312 */     map.put(SCPEntity513.class, new bcj((axa)new SCPModel513(), 0.0F));
/* 313 */     map.put(SCPEntity217Pig.class, new bcj((axa)new SCPModel217Pig(), 0.5F));
/* 314 */     map.put(SCPEntity217Spider.class, new bcj((axa)new SCPModel217Spider(), 0.5F));
/* 315 */     map.put(SCPEntity087.class, new bcj((axa)new SCPModel087(), 0.5F));
/* 316 */     map.put(SCPEntity049.class, new bcj((axa)new SCPModel049(), 0.5F));
/* 317 */     map.put(SCPEntity217Zombie.class, new bcj((axa)new SCPModel217Zombie(), 0.5F));
/* 318 */     map.put(SCPEntity1000.class, new bcj((axa)new SCPModel1000(), 0.5F));
/* 319 */     map.put(SCPEntity131.class, new bcj((axa)new SCPModel131(), 0.4F));
/* 320 */     map.put(SCPEntity999.class, new SCPRender999((axa)new SCPModel999(3), (axa)new SCPModel999(3), 0.5F));
/* 321 */     map.put(SCPEntity629.class, new SCPRender629((axa)new SCPModel629(), 0.5F));
/* 322 */     map.put(SCPEntity096Docile.class, new bcj((axa)new SCPModel096Docile(), 0.5F));
/* 323 */     map.put(SCPEntity096Cry.class, new bcj((axa)new SCPModel096Cry(), 0.5F));
/* 324 */     map.put(SCPEntity096Mad.class, new bcj((axa)new SCPModel096Aggro(), 0.5F));
/* 325 */     map.put(SCPEntity217Cow.class, new bcj((axa)new SCPModel217Cow(), 0.5F));
/* 326 */     map.put(SCPEntity538.class, new bcj((axa)new SCPModel538(), 0.5F));
/* 327 */     map.put(SCPEntity106.class, new bcj((axa)new SCPModel106(), 0.5F));
/* 328 */     map.put(SCPEntity080.class, new bcj((axa)new aww(), 0.5F));
/* 329 */     map.put(SCPEntity280.class, new bcj((axa)new SCPModel280(), 0.5F));
/* 330 */     map.put(SCPEntity594.class, new bcj((axa)new SCPModel594UnSheered(), 0.5F));
/* 331 */     map.put(SCPEntity594Naked.class, new bcj((axa)new SCPModel594Naked(), 0.5F));
/* 332 */     map.put(SCPEntity058.class, new SCPRender058(new SCPModel058(), 0.4F));
/* 333 */     map.put(SCPEntity966.class, new bcj((axa)new SCPModel966(), 0.0F));
/* 334 */     map.put(SCPEntity872.class, new bcj((axa)new SCPModel872(), 0.5F));
/* 335 */     map.put(SCPEntity1440.class, new bcj((axa)new SCPModel1440(), 0.5F));
/* 336 */     map.put(SCPEntity50AEJ.class, new bcj((axa)new SCPModel50AEJ(), 0.0F));
/* 337 */     map.put(SCPEntity217Creeper.class, new bcj((axa)new SCPModel217Creeper(), 0.5F));
/* 338 */     map.put(SCPEntity053.class, new bcj((axa)new SCPModel053(), 0.5F));
/* 339 */     map.put(SCPEntity073.class, new bcj((axa)new aww(), 0.5F));
/* 340 */     map.put(SCPEntity076.class, new bcc(new aww(), 0.5F));
/* 341 */     map.put(SCPEntityRat.class, new bcj((axa)new SCPModelRat(), 0.1F));
/* 342 */     map.put(SCPEntityClassD027.class, new bcj((axa)new SCPModelClassDGuy(), 0.5F));
/* 343 */     map.put(SCPEntity997.class, new bcj((axa)new SCPModel997(), 0.5F));
/* 344 */     map.put(SCPEntity222Clone.class, new bcj((axa)new aww(), 0.5F));
/* 345 */     map.put(SCPEntity217Testificate.class, new bcj((axa)new SCPModel217Testificate(), 0.5F));
/* 346 */     map.put(SCPEntity372.class, new bcj((axa)new SCPModel372(), 0.0F));
/* 347 */     map.put(SCPEntity846.class, new bcj((axa)new SCPModel846(), 0.5F));
/* 348 */     map.put(SCPEntityAtomicGrenade.class, new SCPRenderGrenade(10));
/* 349 */     map.put(SCPEntity472.class, new bcj((axa)new SCPModel472(), 0.0F));
/* 350 */     map.put(SCPEntity273.class, new bcj((axa)new aww(), 0.5F));
/* 351 */     map.put(SCPEntity015Boss.class, new SCPRender015Boss(new awn(), 1.4F));
/* 352 */     map.put(SCPEntity015Projectile.class, new SCPRenderProjectile(1.0F));
/* 353 */     map.put(SCPEntity023.class, new bcj((axa)new SCPModel023(), 0.5F));
/* 354 */     map.put(SCPEntity682.class, new bcj((axa)new SCPModel682(), 0.5F));
/* 355 */     map.put(SCPEntityReal682.class, new SCPRender682(new SCPModelReal682(), 1.7F));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public avf getContainerGUI(ays var1, int var2, int var3, int var4, int var5) {
/* 361 */     any var6 = var1.p.q(var3, var4, var5);
/* 362 */     if (var2 == 6079)
/*     */     {
/* 364 */       return (avf)new SCPGuiDocument(var1.bJ, this.worldObj, var2, var3, var4);
/*     */     }
/* 366 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void generateSurface(yc world, Random rand, int chunkX, int chunkZ) {
/* 372 */     yy biomegenbase = world.t().a(chunkX, chunkZ);
/*     */     
/* 374 */     if (biomegenbase instanceof zr)
/*     */     {
/* 376 */       if (rand.nextInt(100) == 0) {
/*     */         
/* 378 */         int randPosX = chunkX + rand.nextInt(16);
/* 379 */         int randPosZ = chunkZ + rand.nextInt(16);
/* 380 */         int randPosY = world.f(randPosX, randPosZ);
/* 381 */         int par4 = randPosX;
/* 382 */         int par5 = randPosY;
/* 383 */         int par6 = randPosZ;
/* 384 */         this.worldgenlakes.a(world, rand, randPosX, randPosY, randPosZ);
/* 385 */         this.worldgenlakes.a(world, rand, par4 - 8, par5, par6);
/* 386 */         this.worldgenlakes.a(world, rand, par4, par5, par6 + 8);
/* 387 */         this.worldgenlakes.a(world, rand, par4 + 8, par5, par6);
/* 388 */         this.worldgenlakes.a(world, rand, par4, par5, par6 - 8);
/* 389 */         this.worldgenlakes.a(world, rand, par4 - 8, par5, par6 - 8);
/* 390 */         this.worldgenlakes.a(world, rand, par4 + 8, par5, par6 + 8);
/* 391 */         this.worldgenlakes.a(world, rand, par4 + 8, par5, par6 - 8);
/* 392 */         this.worldgenlakes.a(world, rand, par4 - 8, par5, par6 + 8);
/* 393 */         this.worldgenlakes.a(world, rand, par4 - 16, par5, par6);
/* 394 */         this.worldgenlakes.a(world, rand, par4, par5, par6 + 16);
/* 395 */         this.worldgenlakes.a(world, rand, par4 + 16, par5, par6);
/* 396 */         this.worldgenlakes.a(world, rand, par4, par5, par6 - 16);
/*     */       } 
/*     */     }
/* 399 */     if (biomegenbase instanceof zh) {
/*     */       
/* 401 */       if (rand.nextInt(200) == 0) {
/*     */         
/* 403 */         int randPosX = chunkX + rand.nextInt(16);
/* 404 */         int randPosZ = chunkZ + rand.nextInt(16);
/* 405 */         int randPosY = world.f(randPosX, randPosZ);
/* 406 */         int par4 = randPosX;
/* 407 */         int par5 = randPosY;
/* 408 */         int par6 = randPosZ;
/* 409 */         this.scp006Gen.a(world, rand, randPosX, randPosY, randPosZ);
/*     */       } 
/* 411 */       if (rand.nextInt(2) == 0) {
/*     */         
/* 413 */         int randPosX = chunkX + rand.nextInt(16);
/* 414 */         int randPosZ = chunkZ + rand.nextInt(16);
/* 415 */         int randPosY = world.f(randPosX, randPosZ);
/* 416 */         int par4 = randPosX;
/* 417 */         int par5 = randPosY;
/* 418 */         int par6 = randPosZ;
/* 419 */         this.scp143Gen.a(world, rand, randPosX, randPosY, randPosZ);
/*     */       } 
/*     */     } 
/*     */     
/* 423 */     for (int i = 0; i < 10; i++) {
/*     */       
/* 425 */       int randPosX = chunkX + rand.nextInt(16);
/* 426 */       int randPosY = rand.nextInt(60);
/* 427 */       int randPosZ = chunkZ + rand.nextInt(16);
/* 428 */       (new SCPWorldGenCustomMinable(mod_SCP.Marble.cm, 50, amq.w.cm)).a(world, rand, randPosX, randPosY, randPosZ);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean renderWorldBlock(bbb renderblocks, ym iblockaccess, int i, int j, int k, amq block, int l) {
/* 435 */     if (l == KeycardSlotID) return this.renderBlocks.RenderKeycardSlot(block, i, j, k, renderblocks); 
/* 436 */     if (l == SmokeBlockID) return this.renderBlocks.renderSmokeBlock(block, i, j, k, renderblocks); 
/* 437 */     if (l == SCP310ID) return this.renderBlocks.renderSCP310(block, i, j, k, renderblocks); 
/* 438 */     if (l == CorrodedDoorID) return this.renderBlocks.CorrodedDoor(block, i, j, k, renderblocks); 
/* 439 */     if (l == SCP789JID) return this.renderBlocks.renderSCP789J(block, i, j, k, renderblocks); 
/* 440 */     if (l == SCP015ID) return this.renderBlocks.renderSCP015((SCPBlock015)block, i, j, k, renderblocks); 
/* 441 */     if (l == SlidingDoorID) return this.renderBlocks.renderSlideDoor((SCPBlockSlideDoor)block, i, j, k, renderblocks); 
/* 442 */     if (l == SCP079ID) return this.renderBlocks.renderSCP079(block, i, j, k, renderblocks); 
/* 443 */     if (l == SCP076ID) return this.renderBlocks.renderSCP076(block, i, j, k, renderblocks); 
/* 444 */     if (l == ShelfID) return this.renderBlocks.renderShelf(block, i, j, k, renderblocks); 
/* 445 */     if (l == StoneCoffinID) return this.renderBlocks.renderStoneCoffin((SCPBlockStoneCoffin)block, i, j, k, renderblocks); 
/* 446 */     if (l == PosterID) return this.renderBlocks.renderPaintings(block, i, j, k, renderblocks); 
/* 447 */     if (l == SCP273ID) return this.renderBlocks.renderPillar(block, i, j, k, renderblocks); 
/* 448 */     if (l == SCP822ID) return this.renderBlocks.renderSCP822(block, i, j, k, renderblocks); 
/* 449 */     if (l == ToiletID) return this.renderBlocks.renderToilet(block, i, j, k, renderblocks); 
/* 450 */     if (l == DeskID) return this.renderBlocks.renderDesk((SCPBlockDesk)block, i, j, k, renderblocks); 
/* 451 */     if (l == ChairID) return this.renderBlocks.renderBlockChairInWorld(renderblocks, iblockaccess, i, j, k, block); 
/* 452 */     if (l == AlarmID) return this.renderBlocks.renderAlarmBlock(block, i, j, k, renderblocks); 
/* 453 */     if (l == SCP513ID) return this.renderBlocks.renderSCP513(block, i, j, k, renderblocks); 
/* 454 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderInvBlock(bbb renderer, amq block, int metadata, int modelID) {
/* 460 */     baz tessellator = baz.a;
/* 461 */     if (modelID == ShelfID) this.renderInv.renderInvShelf(renderer, block, metadata); 
/* 462 */     if (modelID == KeycardSlotID) this.renderInv.renderInvKeySlot(renderer, block, metadata); 
/* 463 */     if (modelID == SmokeBlockID) this.renderInv.renderInvSmokeBlock(renderer, block, metadata); 
/* 464 */     if (modelID == SCP310ID) this.renderInv.renderInvSCP310(renderer, block, metadata); 
/* 465 */     if (modelID == SCP789JID) this.renderInv.renderInvSCP789J(renderer, block, metadata); 
/* 466 */     if (modelID == SCP015ID) this.renderInv.renderInvSCP015(renderer, block, metadata); 
/* 467 */     if (modelID == SCP076ID) this.renderInv.renderInvBlock(renderer, block, metadata); 
/* 468 */     if (modelID == StoneCoffinID) this.renderInv.renderInvStoneCoffin(renderer, block, metadata); 
/* 469 */     if (modelID == PosterID) this.renderInv.renderInvPoster(renderer, block, metadata); 
/* 470 */     if (modelID == SCP079ID) this.renderInv.renderInv079(renderer, block, metadata); 
/* 471 */     if (modelID == RemoteDoorCompID) SCPRenderInventory.renderInvRemoteDoorComp(renderer, block, metadata); 
/* 472 */     if (modelID == SCP273ID) this.renderInv.renderInvPillar(renderer, block, metadata); 
/* 473 */     if (modelID == SCP822ID) this.renderInv.renderInvSCP822(renderer, block, metadata); 
/* 474 */     if (modelID == ToiletID) this.renderInv.renderInvSCP789J(renderer, block, metadata); 
/* 475 */     if (modelID == DeskID) SCPRenderInventory.renderInvDesk(renderer, block, metadata); 
/* 476 */     if (modelID == ChairID) SCPRenderInventory.renderInvChair(renderer, block, metadata); 
/* 477 */     if (modelID == AlarmID) this.renderInv.renderInvAlarm(renderer, block, metadata); 
/* 478 */     if (modelID == SCP513ID) this.renderInv.renderSCP513(renderer, block, metadata);
/*     */   
/*     */   }
/*     */   
/*     */   public void keyboardEvent(arv keybinding) {
/* 483 */     if (this.mc.e != null && keybinding == keyBlink && mod_SCP.isActive && this.mc.r == null)
/*     */     {
/* 485 */       this.mc.g.setBlink(5);
/*     */     }
/* 487 */     if (this.mc.e != null && keybinding == keyActivate && this.mc.r == null)
/*     */     {
/* 489 */       if (mod_SCP.isActive) {
/*     */         
/* 491 */         mod_SCP.isActive = false;
/* 492 */         this.mc.g.b("Blinking has been deactivated!");
/* 493 */         this.mc.g.setBlink(300);
/*     */       }
/*     */       else {
/*     */         
/* 497 */         mod_SCP.isActive = true;
/* 498 */         this.mc.g.b("Blinking has been reactivated!");
/*     */       } 
/*     */     }
/* 501 */     if (this.mc.e != null && keybinding == remoteDoors && this.mc.r == null && this.mc.g.cd.d) {
/*     */       
/* 503 */       this; if (remoteDoorActivate) {
/*     */         
/* 505 */         this; remoteDoorActivate = false;
/* 506 */         this.mc.g.b("Remote doors have been deactivated!");
/*     */       }
/*     */       else {
/*     */         
/* 510 */         this; remoteDoorActivate = true;
/* 511 */         this.mc.g.b("Remote doors have been reactivated!");
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isRightForgeVersion() {
/* 525 */     return true;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/mod_Others.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */