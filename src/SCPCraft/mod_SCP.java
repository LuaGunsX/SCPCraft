/*     */ package SCPCraft;
/*     */ 
/*     */ import ModLoader;
/*     */ import SCPCraft.blocks.SCP310Candle;
/*     */ import SCPCraft.blocks.SCP310Fire;
/*     */ import SCPCraft.blocks.SCPBlock;
/*     */ import SCPCraft.blocks.SCPBlock009;
/*     */ import SCPCraft.blocks.SCPBlock015;
/*     */ import SCPCraft.blocks.SCPBlock019;
/*     */ import SCPCraft.blocks.SCPBlock076;
/*     */ import SCPCraft.blocks.SCPBlock079;
/*     */ import SCPCraft.blocks.SCPBlock143Leaves;
/*     */ import SCPCraft.blocks.SCPBlock143Log;
/*     */ import SCPCraft.blocks.SCPBlock143Planks;
/*     */ import SCPCraft.blocks.SCPBlock143Sapling;
/*     */ import SCPCraft.blocks.SCPBlock151;
/*     */ import SCPCraft.blocks.SCPBlock261;
/*     */ import SCPCraft.blocks.SCPBlock273Pillar;
/*     */ import SCPCraft.blocks.SCPBlock294;
/*     */ import SCPCraft.blocks.SCPBlock409;
/*     */ import SCPCraft.blocks.SCPBlock513;
/*     */ import SCPCraft.blocks.SCPBlock789J;
/*     */ import SCPCraft.blocks.SCPBlock822Immature;
/*     */ import SCPCraft.blocks.SCPBlock822Mature;
/*     */ import SCPCraft.blocks.SCPBlock914;
/*     */ import SCPCraft.blocks.SCPBlockAlarm;
/*     */ import SCPCraft.blocks.SCPBlockBone;
/*     */ import SCPCraft.blocks.SCPBlockChair;
/*     */ import SCPCraft.blocks.SCPBlockCorrodedDoor;
/*     */ import SCPCraft.blocks.SCPBlockCorrodedIron;
/*     */ import SCPCraft.blocks.SCPBlockCustomWater;
/*     */ import SCPCraft.blocks.SCPBlockDesk;
/*     */ import SCPCraft.blocks.SCPBlockDocument;
/*     */ import SCPCraft.blocks.SCPBlockElectricWool;
/*     */ import SCPCraft.blocks.SCPBlockFlesh;
/*     */ import SCPCraft.blocks.SCPBlockGrate;
/*     */ import SCPCraft.blocks.SCPBlockItem;
/*     */ import SCPCraft.blocks.SCPBlockKeycardSlot;
/*     */ import SCPCraft.blocks.SCPBlockKeycardSlotLv2;
/*     */ import SCPCraft.blocks.SCPBlockKeycardSlotLv3;
/*     */ import SCPCraft.blocks.SCPBlockKeycardSlotOmni;
/*     */ import SCPCraft.blocks.SCPBlockMachine;
/*     */ import SCPCraft.blocks.SCPBlockPoster;
/*     */ import SCPCraft.blocks.SCPBlockRemoteDoorComputer;
/*     */ import SCPCraft.blocks.SCPBlockShelf;
/*     */ import SCPCraft.blocks.SCPBlockSlideDoor;
/*     */ import SCPCraft.blocks.SCPBlockSpawner;
/*     */ import SCPCraft.blocks.SCPBlockTab;
/*     */ import SCPCraft.blocks.SCPBlockToilet;
/*     */ import SCPCraft.blocks.SCPBloodBlock;
/*     */ import SCPCraft.blocks.SCPLockerBlock;
/*     */ import SCPCraft.blocks.SCPPosters;
/*     */ import SCPCraft.blocks.SCPSmokeBlock;
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
/*     */ import SCPCraft.entities.SCPEntity131;
/*     */ import SCPCraft.entities.SCPEntity173;
/*     */ import SCPCraft.entities.SCPEntity217Cow;
/*     */ import SCPCraft.entities.SCPEntity217Creeper;
/*     */ import SCPCraft.entities.SCPEntity217Pig;
/*     */ import SCPCraft.entities.SCPEntity217Spider;
/*     */ import SCPCraft.entities.SCPEntity217Testificate;
/*     */ import SCPCraft.entities.SCPEntity217Zombie;
/*     */ import SCPCraft.entities.SCPEntity273;
/*     */ import SCPCraft.entities.SCPEntity280;
/*     */ import SCPCraft.entities.SCPEntity372;
/*     */ import SCPCraft.entities.SCPEntity457;
/*     */ import SCPCraft.entities.SCPEntity472;
/*     */ import SCPCraft.entities.SCPEntity50AEJ;
/*     */ import SCPCraft.entities.SCPEntity513;
/*     */ import SCPCraft.entities.SCPEntity538;
/*     */ import SCPCraft.entities.SCPEntity594;
/*     */ import SCPCraft.entities.SCPEntity594Naked;
/*     */ import SCPCraft.entities.SCPEntity629;
/*     */ import SCPCraft.entities.SCPEntity682;
/*     */ import SCPCraft.entities.SCPEntity872;
/*     */ import SCPCraft.entities.SCPEntity966;
/*     */ import SCPCraft.entities.SCPEntity997;
/*     */ import SCPCraft.entities.SCPEntity999;
/*     */ import SCPCraft.entities.SCPEntityClassD027;
/*     */ import SCPCraft.entities.SCPEntityClassDGuy;
/*     */ import SCPCraft.entities.SCPEntityMountableBlock;
/*     */ import SCPCraft.entities.SCPEntityRat;
/*     */ import SCPCraft.entities.SCPEntityReal682;
/*     */ import SCPCraft.guis.SCPGuiHandler;
/*     */ import SCPCraft.items.SCP143Bucket;
/*     */ import SCPCraft.items.SCPDocumentItems;
/*     */ import SCPCraft.items.SCPItem000J;
/*     */ import SCPCraft.items.SCPItem002;
/*     */ import SCPCraft.items.SCPItem006;
/*     */ import SCPCraft.items.SCPItem009;
/*     */ import SCPCraft.items.SCPItem015;
/*     */ import SCPCraft.items.SCPItem019;
/*     */ import SCPCraft.items.SCPItem023;
/*     */ import SCPCraft.items.SCPItem027;
/*     */ import SCPCraft.items.SCPItem049;
/*     */ import SCPCraft.items.SCPItem053;
/*     */ import SCPCraft.items.SCPItem058;
/*     */ import SCPCraft.items.SCPItem073;
/*     */ import SCPCraft.items.SCPItem076;
/*     */ import SCPCraft.items.SCPItem079;
/*     */ import SCPCraft.items.SCPItem080;
/*     */ import SCPCraft.items.SCPItem087;
/*     */ import SCPCraft.items.SCPItem096;
/*     */ import SCPCraft.items.SCPItem1000;
/*     */ import SCPCraft.items.SCPItem1023ARC;
/*     */ import SCPCraft.items.SCPItem1025;
/*     */ import SCPCraft.items.SCPItem106;
/*     */ import SCPCraft.items.SCPItem109;
/*     */ import SCPCraft.items.SCPItem111;
/*     */ import SCPCraft.items.SCPItem131;
/*     */ import SCPCraft.items.SCPItem143;
/*     */ import SCPCraft.items.SCPItem143Axe;
/*     */ import SCPCraft.items.SCPItem143PickAxe;
/*     */ import SCPCraft.items.SCPItem143Spade;
/*     */ import SCPCraft.items.SCPItem143Sword;
/*     */ import SCPCraft.items.SCPItem151;
/*     */ import SCPCraft.items.SCPItem173;
/*     */ import SCPCraft.items.SCPItem217;
/*     */ import SCPCraft.items.SCPItem261;
/*     */ import SCPCraft.items.SCPItem273;
/*     */ import SCPCraft.items.SCPItem280;
/*     */ import SCPCraft.items.SCPItem294;
/*     */ import SCPCraft.items.SCPItem310;
/*     */ import SCPCraft.items.SCPItem354;
/*     */ import SCPCraft.items.SCPItem372;
/*     */ import SCPCraft.items.SCPItem409;
/*     */ import SCPCraft.items.SCPItem420J;
/*     */ import SCPCraft.items.SCPItem427;
/*     */ import SCPCraft.items.SCPItem457;
/*     */ import SCPCraft.items.SCPItem458;
/*     */ import SCPCraft.items.SCPItem472;
/*     */ import SCPCraft.items.SCPItem500;
/*     */ import SCPCraft.items.SCPItem50AEJ;
/*     */ import SCPCraft.items.SCPItem513;
/*     */ import SCPCraft.items.SCPItem538;
/*     */ import SCPCraft.items.SCPItem594;
/*     */ import SCPCraft.items.SCPItem629;
/*     */ import SCPCraft.items.SCPItem682;
/*     */ import SCPCraft.items.SCPItem789J;
/*     */ import SCPCraft.items.SCPItem822;
/*     */ import SCPCraft.items.SCPItem872;
/*     */ import SCPCraft.items.SCPItem914;
/*     */ import SCPCraft.items.SCPItem966;
/*     */ import SCPCraft.items.SCPItem997;
/*     */ import SCPCraft.items.SCPItem999;
/*     */ import SCPCraft.items.SCPItemArmorSpawns;
/*     */ import SCPCraft.items.SCPItemCorrodedDoor;
/*     */ import SCPCraft.items.SCPItemCup;
/*     */ import SCPCraft.items.SCPItemCupFilled;
/*     */ import SCPCraft.items.SCPItemDescription;
/*     */ import SCPCraft.items.SCPItemInfraRedGlasses;
/*     */ import SCPCraft.items.SCPItemL1Keycard;
/*     */ import SCPCraft.items.SCPItemObject;
/*     */ import SCPCraft.items.SCPItemPearl;
/*     */ import SCPCraft.items.SCPItemPoster;
/*     */ import SCPCraft.items.SCPItemRecord;
/*     */ import SCPCraft.items.SCPItemSlideDoor;
/*     */ import SCPCraft.items.SCPItemTothBrush;
/*     */ import SCPCraft.items.SCPItemVCow;
/*     */ import SCPCraft.items.SCPItemVCreeper;
/*     */ import SCPCraft.items.SCPItemVPig;
/*     */ import SCPCraft.items.SCPItemVSpider;
/*     */ import SCPCraft.items.SCPItemVTestificate;
/*     */ import SCPCraft.items.SCPItemVZombie;
/*     */ import SCPCraft.items.SCPItemWrench;
/*     */ import SCPCraft.items.SCPItemsTab;
/*     */ import SCPCraft.recipes.SCPDocumentManager;
/*     */ import SCPCraft.recipes.SCPRecipes;
/*     */ import SCPCraft.recipes.SCPRecipes000J;
/*     */ import SCPCraft.renders.SCPRender019;
/*     */ import SCPCraft.renders.SCPRender261;
/*     */ import SCPCraft.renders.SCPRender294;
/*     */ import SCPCraft.renders.SCPRenderRemoteDoorComp;
/*     */ import SCPCraft.renders.SCPRenderShelf;
/*     */ import SCPCraft.tileentities.SCPTileEntity015;
/*     */ import SCPCraft.tileentities.SCPTileEntity019;
/*     */ import SCPCraft.tileentities.SCPTileEntity076;
/*     */ import SCPCraft.tileentities.SCPTileEntity079;
/*     */ import SCPCraft.tileentities.SCPTileEntity151;
/*     */ import SCPCraft.tileentities.SCPTileEntity261;
/*     */ import SCPCraft.tileentities.SCPTileEntity294;
/*     */ import SCPCraft.tileentities.SCPTileEntity914;
/*     */ import SCPCraft.tileentities.SCPTileEntityAlarm;
/*     */ import SCPCraft.tileentities.SCPTileEntityFlesh;
/*     */ import SCPCraft.tileentities.SCPTileEntityRemoteDoorComp;
/*     */ import SCPCraft.tileentities.SCPTileEntityShelf;
/*     */ import agh;
/*     */ import agi;
/*     */ import agk;
/*     */ import amq;
/*     */ import baz;
/*     */ import bdx;
/*     */ import cpw.mods.fml.common.Mod;
/*     */ import cpw.mods.fml.common.Mod.Init;
/*     */ import cpw.mods.fml.common.Mod.Instance;
/*     */ import cpw.mods.fml.common.Mod.PostInit;
/*     */ import cpw.mods.fml.common.Mod.PreInit;
/*     */ import cpw.mods.fml.common.event.FMLInitializationEvent;
/*     */ import cpw.mods.fml.common.event.FMLPostInitializationEvent;
/*     */ import cpw.mods.fml.common.event.FMLPreInitializationEvent;
/*     */ import cpw.mods.fml.common.network.IGuiHandler;
/*     */ import cpw.mods.fml.common.network.NetworkMod;
/*     */ import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
/*     */ import cpw.mods.fml.common.network.NetworkRegistry;
/*     */ import cpw.mods.fml.common.registry.EntityRegistry;
/*     */ import cpw.mods.fml.common.registry.GameRegistry;
/*     */ import cpw.mods.fml.common.registry.LanguageRegistry;
/*     */ import cpw.mods.fml.common.registry.TickRegistry;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import jg;
/*     */ import lh;
/*     */ import ll;
/*     */ import net.minecraftforge.client.MinecraftForgeClient;
/*     */ import net.minecraftforge.common.AchievementPage;
/*     */ import net.minecraftforge.common.MinecraftForge;
/*     */ import tj;
/*     */ import up;
/*     */ import uq;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Mod(modid = "SCP", name = "SCPCraft", version = "1.2")
/*     */ @NetworkMod(clientSideRequired = true, serverSideRequired = false, clientPacketHandlerSpec = @SidedPacketHandler(channels = {"SCPCraft"}, packetHandler = SCPClientPacketHandler.class), serverPacketHandlerSpec = @SidedPacketHandler(channels = {"SCPCraft"}, packetHandler = SCPServerPacketHandler.class))
/*     */ public class mod_SCP
/*     */ {
/* 249 */   public static String SCPCraftVersion = "SCPCraft v1.2 [1.4.6]";
/*     */ 
/*     */   
/* 252 */   public static int SlotFront = 14;
/* 253 */   public static int SlotTop = 61;
/* 254 */   public static int SlotTop1 = 17;
/* 255 */   public static int SlotTop2 = 18;
/* 256 */   public static int SlotTop3 = 19;
/* 257 */   public static int SlotSides = 20;
/* 258 */   public static int Safe = 253;
/* 259 */   public static int Euclid = 254;
/* 260 */   public static int Keter = 255;
/*     */ 
/*     */   
/* 263 */   public static final ll electricity = (new ll(21, true, 14994699)).b("potion.electric").b(1, 0).a(0.25D);
/* 264 */   public static final ll shake = (new ll(22, true, 6513507)).b("potion.shake").b(2, 0).a(0.25D);
/* 265 */   public static final ll control = (new ll(23, true, 986895)).b("potion.control").b(0, 0).a(0.25D);
/* 266 */   public static final ll verminGod = (new ll(24, true, 8350208)).b("potion.vermin").b(4, 0).a(0.25D);
/* 267 */   public static final ll bloodStone = (new ll(25, true, 1615855616)).b("potion.bloodstone").b(3, 0).a(0.25D);
/* 268 */   public static final ll crystal = (new ll(26, true, 14804975)).b("potion.crystal").b(0, 0).a(0.25D);
/* 269 */   public static final ll sticky = (new ll(27, false, 3211033)).b("potion.sticky").b(5, 0).a(0.25D);
/* 270 */   public static final ll skeleton = (new ll(28, false, 9896114)).b("potion.skeleton").b(6, 0).a(0.25D);
/* 271 */   public static final ll eaten = (new ll(29, false, 9896114)).b("potion.eat").b(6, 0).a(0.25D);
/*     */ 
/*     */   
/* 274 */   public static final agi SCP354 = (new agh(agk.f)).n();
/*     */ 
/*     */   
/* 277 */   public static lh crystalDamage = (new lh("crystal")).h();
/* 278 */   public static lh electricDamage = (new lh("electricity")).h();
/* 279 */   public static lh ghostButt = new lh("ghost");
/* 280 */   public static lh bloodstone = (new lh("bloodstone")).h();
/* 281 */   public static lh pipe = new lh("pipeBoss");
/* 282 */   public static lh SCP143 = new lh("143");
/* 283 */   public static lh SCP106 = (new lh("106")).h();
/* 284 */   public static lh SCP023 = (new lh("023")).h();
/* 285 */   public static lh SCP682 = new lh("682");
/* 286 */   public static lh SCP073 = new lh("073");
/* 287 */   public static lh SCP002 = new lh("002");
/*     */   
/*     */   public static boolean isActive = true;
/*     */   
/*     */   public yc worldObj;
/* 292 */   private SCPGuiHandler guiHandler = new SCPGuiHandler();
/* 293 */   public static final tj tabBlockSCP = (tj)new SCPBlockTab(12, "scp");
/* 294 */   public static final tj tabItemSCP = (tj)new SCPItemsTab(13, "scp");
/* 295 */   public static final tj tabSCP = new SCPCreativeTab(14, "scp");
/* 296 */   public static final tj tabCupsSCP = new SCPCupsTab(15, "scp");
/*     */ 
/*     */   
/* 299 */   public static final SCPStepSoundPocketDimension soundPDFootstep = new SCPStepSoundPocketDimension("pocketDimension", 1.0F, 1.0F);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 305 */   public static final amq BloodBlock = (new SCPBloodBlock(190, 7)).c(1.0F).b("Blood Block").a(amq.h).b(2.0F);
/* 306 */   public static final amq Locker = (new SCPLockerBlock(191, 23)).c(3.0F).b("Reinforced Iron").a(amq.i).b(20.0F);
/* 307 */   public static final amq SCP914 = (new SCPBlock914(192, false)).s().c(20.0F).b("SCP-914").a(amq.i).b(20.0F);
/* 308 */   public static final amq DocumentTable = (new SCPBlockDocument(193, false)).c(2.5F).b(1.0F).a(amq.i).b("SCP Document Crafter");
/* 309 */   public static final amq Machinery = (new SCPBlockMachine(194, 21)).c(10.0F).b("Mchine Block").a(amq.i).b(18.0F);
/* 310 */   public static final amq SCP019 = (new SCPBlock019(195, SCPTileEntity019.class)).c(100.0F).a(amq.i).b(100.0F).b("SCP-019");
/* 311 */   public static final amq SCP294 = (new SCPBlock294(196)).c(2.0F).a(amq.i).b(100.0F).b("SCP-294");
/* 312 */   public static final amq SCP261 = (new SCPBlock261(197)).c(10.0F).a(amq.i).b("SCP-261").b(20.0F).r();
/* 313 */   public static final amq SCP354Still = (new SCPBlockCustomWater.SCP354Still(198)).c(100.0F).h(255).b("SCP-354 Still").D().r();
/* 314 */   public static final amq SCP354Flowing = (new SCPBlockCustomWater.SCP354Flowing(199)).c(0.0F).h(255).b("SCP-354 Flowing").D().r();
/* 315 */   public static final amq KeycardSlot = (new SCPBlockKeycardSlot(200, 34)).c(5.0F).b(10.0F).a(amq.i).r().b("Keycard Slot");
/* 316 */   public static final amq KeycardSlotLv2 = (new SCPBlockKeycardSlotLv2(201, 34)).c(5.0F).b(10.0F).a(amq.i).r().b("Keycard Slot Lv2");
/* 317 */   public static final amq KeycardSlotLv3 = (new SCPBlockKeycardSlotLv3(202, 34)).c(5.0F).b(10.0F).a(amq.i).r().b("Keycard Slot Lv3");
/* 318 */   public static final amq KeycardSlotOmni = (new SCPBlockKeycardSlotOmni(203, 34)).c(5.0F).b(10.0F).a(amq.i).r().b("Omni Keycard Slot");
/* 319 */   public static final amq SmokeBlock = (new SCPSmokeBlock(204, 31)).h(255).a(0.0F).c(2.0F).b(20.0F).a(amq.i).r().b("Smoke Block");
/* 320 */   public static final amq CorrodedIron = (new SCPBlockCorrodedIron(205, 22)).c(10.0F).a(amq.i).b(100.0F).b("Corroded Iron Block");
/* 321 */   public static final amq SCPspawner = (new SCPBlockSpawner(206, 48)).c(5.0F).a(soundPDFootstep).s().b(5000.0F).b("Pocket Dimension Rock");
/* 322 */   public static final amq Granite = (new SCPBlock(207, 13, agi.e)).c(3.0F).b(10.0F).a(amq.h).b("Granite");
/* 323 */   public static final amq SCP409 = (new SCPBlock409(208, 5)).c(6.0F).b(20.0F).a(amq.j).r().b("§7SCP-409");
/* 324 */   public static final amq SCP310 = (new SCP310Candle(209, 37)).c(0.0F).a(0.9375F).a(amq.e).r().b("SCP-310");
/* 325 */   public static final amq SCP310Fire = (new SCP310Fire(210, 31)).c(0.0F).a(1.0F).a(amq.e).b("SCP-310 Fire").D();
/* 326 */   public static final amq ElectricWool = (new SCPBlockElectricWool(211, 64, true)).c(3.0F).a(amq.k).b(1.0F).b("Electric Wool");
/* 327 */   public static final amq SCP143Leaves = (new SCPBlock143Leaves(212)).c(0.2F).a(amq.g).h(1).b("SCP-143 leaves").r();
/* 328 */   public static final amq SCP143Log = (new SCPBlock143Log(213)).c(36.0F).b(5.0F).a(amq.e).b("SCP-143 Log");
/* 329 */   public static final amq SCP143Sapling = (new SCPBlock143Sapling(214, 4)).c(0.1F).a(amq.g).b("SCP-143 Sapling");
/* 330 */   public static final amq SCP143Planks = (new SCPBlock143Planks(215, 2)).c(2.0F).a(amq.e).b(1.0F).b("SCP-143 Plank");
/* 331 */   public static final amq CorrodedDoor = (new SCPBlockCorrodedDoor(216, agi.f)).c(10.0F).b(100.0F).a(amq.i).r().b("Corroded Iron Door");
/* 332 */   public static final amq SCP006Still = (new SCPBlockCustomWater.SCP006Still(217)).c(100.0F).h(1).b("SCP-006 Still").D().r();
/* 333 */   public static final amq SCP006Flowing = (new SCPBlockCustomWater.SCP006Flowing(218)).c(100.0F).h(1).b("SCP-006 Flowing").D().r();
/* 334 */   public static final amq SCP789J = (new SCPBlock789J(219, 38)).c(2.0F).a(amq.h).b(0.5F).b("SCP-789-J").D().r();
/* 335 */   public static final amq SCP015 = (new SCPBlock015(220, 41)).c(5.0F).b(10.0F).a(amq.i).b("SCP-015");
/* 336 */   public static final amq SlidingDoor = (new SCPBlockSlideDoor(221, agi.f)).c(5.0F).b(100.0F).r().b("Sliding Door");
/* 337 */   public static final amq GrateBlock = (new SCPBlockGrate(222, 42)).c(5.0F).b(8.0F).a(amq.i).b("Grate Block");
/* 338 */   public static final amq SCP079 = (new SCPBlock079(223, 54)).c(5.0F).b(8.0F).a(amq.i).b("SCP-§k079").D().r();
/* 339 */   public static final amq SCP076 = (new SCPBlock076(224, 43, SCPTileEntity076.class)).c(10.0F).b(10.0F).a(amq.h).b("SCP-076 Spawner");
/* 340 */   public static final amq Shelf = (new SCPBlockShelf(225, 60, agi.f)).c(2.0F).setTextureFile("/SCPCraft/textures/SCPblox.png").a(amq.i).b("Iron Shelf");
/*     */   
/* 342 */   public static final amq Poster = (new SCPBlockPoster(226)).c(2.0F).b(5.0F).a(amq.e).b("Poster").D().r();
/* 343 */   public static final amq Poster106 = (new SCPPosters(227, 2, 0)).c(2.0F).b(5.0F).a(amq.e).b("Poster106").D().r();
/* 344 */   public static final amq Poster173 = (new SCPPosters(228, 0, 1)).c(2.0F).b(5.0F).a(amq.e).b("Poster173").D().r();
/* 345 */   public static final amq Poster079 = (new SCPPosters(229, 4, 2)).c(2.0F).b(5.0F).a(amq.e).b("Poster079").D().r();
/* 346 */   public static final amq Poster914 = (new SCPPosters(230, 6, 3)).c(2.0F).b(5.0F).a(amq.e).b("Poster914").D().r();
/* 347 */   public static final amq SCP151 = (new SCPBlock151(231)).c(2.0F).b(5.0F).a(amq.e).b("SCP-151").D().r();
/* 348 */   public static final amq Poster372 = (new SCPPosters(232, 10, 4)).c(2.0F).b(5.0F).a(amq.e).b("Poster372").D().r();
/* 349 */   public static final amq RemoteDoorComputer = (new SCPBlockRemoteDoorComputer(233, 1)).c(2.0F).b(3.0F).a(amq.i).b("Remote Door Computer");
/* 350 */   public static final amq SCP273 = (new SCPBlock273Pillar(234, 156)).c(1.0F).a(amq.h).b("SCP-273 Pillar").r();
/* 351 */   public static final amq Flesh = (new SCPBlockFlesh(235, 62)).c(1.0F).a(amq.h).b("Flesh");
/* 352 */   public static final amq Bone = (new SCPBlockBone(236, 63)).c(3.0F).a(amq.h).b("Bone");
/* 353 */   public static final amq SCP822 = (new SCPBlock822Immature(237, 67)).c(1.0F).a(amq.k).b("SCP-822");
/* 354 */   public static final amq SCP822Grown = (new SCPBlock822Mature(238, 67)).c(1.0F).a(amq.k).b("SCP-822");
/* 355 */   public static final amq SCP009 = (new SCPBlock009(239, 71)).c(1.5F).b(0.2F).a(amq.j).b("SCP-009");
/* 356 */   public static final amq Toilet = (new SCPBlockToilet(240, 38)).c(2.0F).a(amq.h).b(0.5F).b("Toilet");
/* 357 */   public static final amq Alarm = (new SCPBlockAlarm(241)).c(5.0F).b(20.0F).a(amq.i).b("Alarm Block");
/* 358 */   public static final amq stoneDesk = (new SCPBlockDesk(242, 1, agi.e)).setTextureFile("/terrain.png").c(1.5F).b(10.0F).a(amq.h).b("Stone Table");
/* 359 */   public static final amq woodDesk = (new SCPBlockDesk(243, 4, agi.d)).setTextureFile("/terrain.png").c(2.0F).b(5.0F).a(amq.e).b("Wooden Table");
/* 360 */   public static final amq graniteDesk = (new SCPBlockDesk(244, 13, agi.e)).setTextureFile("/SCPCraft/textures/SCPblox.png").c(3.0F).b(10.0F).a(amq.h).b("Granite Table");
/* 361 */   public static final amq marbleDesk = (new SCPBlockDesk(245, 38, agi.e)).setTextureFile("/SCPCraft/textures/SCPblox.png").c(3.0F).b(10.0F).a(amq.h).b("Marble Table");
/* 362 */   public static final amq Marble = (new SCPBlock(246, 38, agi.e)).c(1.5F).b(5.0F).a(amq.h).b("Marble");
/* 363 */   public static final amq marbleChair = (new SCPBlockChair(247, 38, agi.e)).setTextureFile("/SCPCraft/textures/SCPblox.png").c(3.0F).b(10.0F).a(amq.h).b("Marble Chair");
/* 364 */   public static final amq woodenChair = (new SCPBlockChair(248, 4, agi.d)).setTextureFile("/terrain.png").c(2.0F).b(5.0F).a(amq.e).b("Wooden Chair");
/* 365 */   public static final amq stoneChair = (new SCPBlockChair(249, 1, agi.e)).setTextureFile("/terrain.png").c(1.5F).b(10.0F).a(amq.h).b("Stone Chair");
/* 366 */   public static final amq SCP513 = (new SCPBlock513(250, 15)).c(2.0F).b(2.0F).a(amq.o).b("SCP-513");
/* 367 */   public static final amq OakShelf = (new SCPBlockShelf(251, 4, agi.d)).c(2.0F).b(5.0F).setTextureFile("/terrain.png").a(amq.e).b("Oak Wood Shelf");
/* 368 */   public static final amq SpruceShelf = (new SCPBlockShelf(252, 198, agi.d)).c(2.0F).b(5.0F).setTextureFile("/terrain.png").a(amq.e).b("Spruce Wood Shelf");
/* 369 */   public static final amq BirchShelf = (new SCPBlockShelf(253, 214, agi.d)).c(2.0F).b(5.0F).setTextureFile("/terrain.png").a(amq.e).b("Birch Wood Shelf");
/* 370 */   public static final amq JungleShelf = (new SCPBlockShelf(254, 199, agi.d)).c(2.0F).b(5.0F).setTextureFile("/terrain.png").a(amq.e).b("Jungle Wood Shelf");
/*     */ 
/*     */   
/* 373 */   public static final up GasMask = (new SCPClassDItemArmor(8000, SCPArmorMaterial.ClassD, ModLoader.addArmor("classd"), 0, tabItemSCP)).c(0).b("Gas Mask");
/* 374 */   public static final up ClassDShirt = (new SCPClassDItemArmor(8001, SCPArmorMaterial.ClassD, ModLoader.addArmor("classd"), 1, tabItemSCP)).c(16).b("Class-D Shirt");
/* 375 */   public static final up ClassDPants = (new SCPClassDItemArmor(8002, SCPArmorMaterial.ClassD, ModLoader.addArmor("classd"), 2, tabItemSCP)).c(32).b("Class-D Panties");
/* 376 */   public static final up ClassDShoes = (new SCPClassDItemArmor(8003, SCPArmorMaterial.ClassD, ModLoader.addArmor("classd"), 3, tabItemSCP)).c(48).b("Class-D Shoes");
/* 377 */   public static final up Item019 = (new SCPBlockItem(8004, SCP019)).c(32).b("SCP-019 Spawner");
/* 378 */   public static final up Item294 = (new SCPBlockItem(8005, SCP294)).c(35).b("SCP-294");
/* 379 */   public static final up SCP458 = (new SCPItem458(8006, 0, 0.0F, false)).setAlwaysEdible().c(18).b("SCP-458");
/* 380 */   public static final up SCP912Head = (new SCPClassDItemArmor(8007, SCPArmorMaterial.SCP912, ModLoader.addArmor("912"), 0, tabSCP)).c(1).b("SCP-912 Helmet");
/* 381 */   public static final up SCP912Shirt = (new SCPClassDItemArmor(8008, SCPArmorMaterial.SCP912, ModLoader.addArmor("912"), 1, tabSCP)).c(17).b("SCP-912 Shirt");
/* 382 */   public static final up SCP912Pants = (new SCPClassDItemArmor(8009, SCPArmorMaterial.SCP912, ModLoader.addArmor("912"), 2, tabSCP)).c(33).b("SCP-912 Pants");
/* 383 */   public static final up SCP912Shoes = (new SCPClassDItemArmor(8010, SCPArmorMaterial.SCP912, ModLoader.addArmor("912"), 3, tabSCP)).c(49).b("SCP-912 Shoes");
/* 384 */   public static final up SCP217 = (new SCPItem217(8011)).c(50).b("SCP-217");
/* 385 */   public static final up VirusPig = (new SCPItemVPig(8012)).c(8).b("Pig DNA With Clockwork Virus");
/* 386 */   public static final up VirusSpider = (new SCPItemVSpider(8013)).c(7).b("Spider DNA With Clockwork Virus");
/* 387 */   public static final up VirusZombie = (new SCPItemVZombie(8014)).c(6).b("Zombie DNA With Clockwork Virus");
/* 388 */   public static final up Item261 = (new SCPBlockItem(8015, SCP261)).c(36).b("SCP-261");
/* 389 */   public static final up Wrench = (new SCPItemWrench(8016, 0)).c(18).b("Wrench");
/* 390 */   public static final up VirusCow = (new SCPItemVCow(8017)).c(9).b("Cow DNA With Clockwork Virus");
/* 391 */   public static final up L1Keycard = (new SCPItemL1Keycard(8018)).c(22).b("§eKeycard Lv1");
/* 392 */   public static final up L2Keycard = (new SCPItemL1Keycard(8019)).c(23).b("§6Keycard Lv2");
/* 393 */   public static final up L3Keycard = (new SCPItemL1Keycard(8020)).c(24).b("§4Keycard Lv3");
/* 394 */   public static final up OmniKeycard = (new SCPItemL1Keycard(8021)).c(25).b("§9Omni Keycard");
/* 395 */   public static final up SCP500G = (new SCPItem500(8022, 0, 20)).c(37).b("SCP-500").d(16);
/* 396 */   public static final up SCP500B = (new SCPItem500(8023, 1, 0)).c(37).b("SCP-500").d(1);
/* 397 */   public static final up GodlyWrench = (new SCPItemWrench(8024, 1)).c(19).b("Wrench");
/* 398 */   public static final up SCP420J = (new SCPItem420J(8025)).c(20).b("SCP-420-J");
/* 399 */   public static final up TothBrush = (new SCPItemTothBrush(8026, uq.d)).c(38).b("The World's Best TothBrush");
/* 400 */   public static final up SCP427 = (new SCPItem427(8027)).c(34).b("SCP-427");
/* 401 */   public static final up SCP143Pickaxe = (new SCPItem143PickAxe(8028, SCPToolMaterial.SCP143)).c(5).b("SCP-143 Pickaxe");
/* 402 */   public static final up SCP143Spade = (new SCPItem143Spade(8029, SCPToolMaterial.SCP143)).c(3).b("SCP-143 Spade");
/* 403 */   public static final up SCP143Sword = (new SCPItem143Sword(8030, SCPToolMaterial.SCP143)).c(2).b("SCP-143 Sword");
/* 404 */   public static final up SCP143Axe = (new SCPItem143Axe(8031, SCPToolMaterial.SCP143)).c(4).b("SCP-143 Axe");
/* 405 */   public static final up SCP1023ARC = (new SCPItem1023ARC(8032)).c(39).b("SCP-1023-ARC");
/* 406 */   public static final up CorrodedDoorItem = (new SCPItemCorrodedDoor(8033, agi.f)).c(33).b("Corroded Iron Door");
/* 407 */   public static final up InfraRedGlasses = (new SCPItemInfraRedGlasses(8034, SCPArmorMaterial.ClassD, ModLoader.addArmor("infrared"), 0)).c(52).b("Infrared Glasses");
/* 408 */   public static final up SCP50AEJ = (new SCPItem50AEJ(8035)).c(53).b("SCP-50-AE-J");
/* 409 */   public static final up VirusCreeper = (new SCPItemVCreeper(8036)).c(54).b("Creeper DNA With Clockwork Virus");
/* 410 */   public static final up SCP1025 = (new SCPItem1025(8037)).c(55).b("SCP-1025");
/* 411 */   public static final up SlideDoorItem = (new SCPItemSlideDoor(8038, agi.f)).c(46).b("Sliding Door");
/* 412 */   public static final up SCP109 = (new SCPItem109(8039)).c(56).b("SCP-109");
/* 413 */   public static final up ItemSCPPoster = (new SCPItemPoster(8040)).c(51).b("SCP Poster");
/* 414 */   public static final up Circuit = (new SCPItemObject(8041)).c(57).b("§2Circuit");
/*     */   
/* 416 */   public static final up VirusTestificate = (new SCPItemVTestificate(8043)).c(9).b("Testificate DNA With Clockwork Virus");
/* 417 */   public static final up Record106 = (new SCPItemRecord(8044, "106", "GlennLeroi")).c(26).b("SCP Record");
/* 418 */   public static final up Record173 = (new SCPItemRecord(8045, "173", "GlennLeroi")).c(42).b("SCP Record");
/* 419 */   public static final up SCP000J = (new SCPItem000J(8046)).c(27).b("SCP-000-J");
/* 420 */   public static final up SCP143Bucket = (new SCP143Bucket(8047, 0, 6576458, false)).c(14).b("SCP-143 Bucket").d(20);
/* 421 */   public static final up Bucket006 = (new SCP143Bucket(8048, SCP006Flowing.cm, 9983, true)).c(14).b("SCP-143 SCP-006 Bucket");
/* 422 */   public static final up Bucket354 = (new SCP143Bucket(8049, SCP354Flowing.cm, 7602181, true)).c(14).b("SCP-143 SCP-354 Bucket");
/* 423 */   public static final up BucketWater = (new SCP143Bucket(8050, amq.D.cm, 5017087, true)).c(14).b("SCP-143 Water Bucket");
/* 424 */   public static final up Record914 = (new SCPItemRecord(8051, "914", "GlennLeroi")).c(28).b("SCP Record");
/* 425 */   public static final up Record173E = (new SCPItemRecord(8052, "173E", "GlennLeroi")).c(42).b("SCP Record");
/* 426 */   public static final up Record789J = (new SCPItemRecord(8053, "789J", "GlennLeroi")).c(43).b("SCP Record");
/* 427 */   public static final up Record079 = (new SCPItemRecord(8054, "079", "GlennLeroi")).c(59).b("SCP Record");
/*     */ 
/*     */ 
/*     */   
/* 431 */   public static final up SCP173S = (new SCPItem173(5000)).c(Euclid).b("SCP173S");
/* 432 */   public static final up SCP111S = (new SCPItem111(5001)).c(Safe).b("SCP111S");
/* 433 */   public static final up SCP914S = (new SCPItem914(5002)).c(Safe).b("SCP914S");
/* 434 */   public static final up SCP019S = (new SCPItem019(5003)).c(Keter).b("SCP019S");
/* 435 */   public static final up SCP457S = (new SCPItem457(5004)).c(Keter).b("SCP457S");
/* 436 */   public static final up SCP294S = (new SCPItem294(5005)).c(Euclid).b("SCP294S");
/* 437 */   public static final up SCP513S = (new SCPItem513(5006)).c(Euclid).b("SCP513S");
/* 438 */   public static final up SCP049S = (new SCPItem049(5007)).c(Euclid).b("SCP049S");
/* 439 */   public static final up SCP087S = (new SCPItem087(5008)).c(Euclid).b("SCP087S");
/* 440 */   public static final up SCP1000S = (new SCPItem1000(5009)).c(Keter).b("SCP1000S");
/* 441 */   public static final up SCP131S = (new SCPItem131(5010)).c(Safe).b("SCP131S");
/* 442 */   public static final up SCP999S = (new SCPItem999(5011)).c(Safe).b("SCP999S");
/* 443 */   public static final up SCP261S = (new SCPItem261(5012)).c(Safe).b("SCP261S");
/* 444 */   public static final up SCP629S = (new SCPItem629(5013)).c(Safe).b("SCP629S");
/* 445 */   public static final up SCP354S = (new SCPItem354(5014)).c(Keter).b("SCP354S");
/* 446 */   public static final up SCP096S = (new SCPItem096(5015)).c(Euclid).b("SCP096S");
/* 447 */   public static final up SCP538S = (new SCPItem538(5016)).c(Euclid).b("SCP538S");
/* 448 */   public static final up SCP106S = (new SCPItem106(5017)).c(Keter).b("SCP106S");
/* 449 */   public static final up SCP080S = (new SCPItem080(5018)).c(Euclid).b("SCP080S");
/* 450 */   public static final up SCP280S = (new SCPItem280(5019)).c(Keter).b("SCP280S");
/* 451 */   public static final up SCP409S = (new SCPItem409(5020)).c(Keter).b("SCP409S");
/* 452 */   public static final up SCP310S = (new SCPItem310(5021)).c(Euclid).b("SCP310S");
/* 453 */   public static final up SCP594S = (new SCPItem594(5022)).c(Euclid).b("SCP594S");
/* 454 */   public static final up SCP143S = (new SCPItem143(5023)).c(Euclid).b("SCP143S");
/* 455 */   public static final up SCP058S = (new SCPItem058(5024)).c(Keter).b("SCP058S");
/* 456 */   public static final up SCP966S = (new SCPItem966(5025)).c(Euclid).b("SCP966S");
/* 457 */   public static final up SCP872S = (new SCPItem872(5026)).c(Safe).b("SCP872S");
/* 458 */   public static final up SCP006S = (new SCPItem006(5027)).c(Safe).b("SCP006S");
/*     */   
/* 460 */   public static final up SCP789JS = (new SCPItem789J(5029)).c(Safe).b("SCP789JS");
/* 461 */   public static final up SCP015S = (new SCPItem015(5030)).c(Euclid).b("SCP015S");
/* 462 */   public static final up SCP053S = (new SCPItem053(5031)).c(Euclid).b("SCP053S");
/* 463 */   public static final up SCP073S = (new SCPItem073(5032)).c(Euclid).b("SCP073S");
/* 464 */   public static final up SCP027S = (new SCPItem027(5033)).c(Euclid).b("SCP027S");
/* 465 */   public static final up SCP076S = (new SCPItem076(5034)).c(Keter).b("SCP076S");
/* 466 */   public static final up SCP997S = (new SCPItem997(5035)).c(Safe).b("SCP997S");
/* 467 */   public static final up SCP079S = (new SCPItem079(5036)).c(Euclid).b("SCP079S");
/* 468 */   public static final up SCP372S = (new SCPItem372(5037)).c(Euclid).b("SCP372S");
/* 469 */   public static final up SCP151S = (new SCPItem151(5038)).c(Euclid).b("SCP151S");
/* 470 */   public static final up SCP472S = (new SCPItem472(5039)).c(Euclid).b("SCP472S");
/*     */   
/* 472 */   public static final up SCP273S = (new SCPItem273(5041)).c(Euclid).b("SCP273S");
/* 473 */   public static final up SCP002S = (new SCPItem002(5042)).c(Euclid).b("SCP002S");
/* 474 */   public static final up SCP822S = (new SCPItem822(5043)).c(Euclid).b("SCP822S");
/* 475 */   public static final up SCP023S = (new SCPItem023(5044)).c(Euclid).b("SCP023S");
/* 476 */   public static final up SCP009S = (new SCPItem009(5045)).c(Euclid).b("SCP009S");
/* 477 */   public static final up SCP682S = (new SCPItem682(5046)).c(Keter).b("SCP682S");
/* 478 */   public static final up SCP500S = (new SCPDocumentItems(5047, "SCP-500", "Panacea", "§2", 1, SCP500G, 16)).c(Safe).b("SCP500S");
/* 479 */   public static final up SCP063S = (new SCPDocumentItems(5048, "SCP-063", "The World's Best TothBrush", "§2", 1, TothBrush, 1)).c(Safe).b("SCP063S");
/* 480 */   public static final up SCP1025S = (new SCPDocumentItems(5049, "SCP-1025", "Encyclopedia of Diseases", "§2", 1, SCP1025, 1)).c(Safe).b("SCP1025S");
/* 481 */   public static final up SCP109S = (new SCPDocumentItems(5050, "SCP-109", "Infinite Canteen", "§e", 2, SCP109, 1)).c(Euclid).b("SCP109S");
/* 482 */   public static final up SCP000JS = (new SCPDocumentItems(5051, "SCP-000-J", "The Official SCP Sales Catalogue", "§2", 1, SCP000J, 1)).c(Safe).b("SCP000JS");
/* 483 */   public static final up SCP50AEJS = (new SCPDocumentItems(5052, "SCP-50-AE-J", "The Deagle", "§e", 2, SCP50AEJ, 1)).c(Euclid).b("SCP50AEJS");
/* 484 */   public static final up SCP420JS = (new SCPDocumentItems(5053, "SCP-420-J", "The Best §kShit §7in the World", "§2", 1, SCP420J, 2)).c(Safe).b("SCP420JS");
/* 485 */   public static final up SCP458S = (new SCPDocumentItems(5054, "SCP-458", "The Never-Ending Pizza Box", "§2", 1, SCP458, 1)).c(Safe).b("SCP458S");
/* 486 */   public static final up SCP217S = (new SCPDocumentItems(5055, "SCP-217", "The Clockwork Virus", "§2", 3, SCP217, 1)).c(Keter).b("SCP217S");
/* 487 */   public static final up SCP912S = (new SCPItemArmorSpawns(5056, "SCP-912", "Autonomous SWAT Armor", "§2", 1, SCP912Head, SCP912Shirt, SCP912Pants, SCP912Shoes, 1)).c(Safe).b("SCP912HS");
/*     */ 
/*     */   
/* 490 */   public static final up Pearl354 = (new SCPItemPearl(6000, "SCP-354")).c(15).b("SCP-354");
/* 491 */   public static final up Pearl096 = (new SCPItemPearl(6001, "SCP-096")).c(4).b("SCP-096");
/* 492 */   public static final up Pearl261 = (new SCPItemPearl(6002, "SCP-261")).c(11).b("SCP-261");
/* 493 */   public static final up Pearl629 = (new SCPItemPearl(6003, "SCP-629")).c(22).b("SCP-629");
/* 494 */   public static final up Pearl1000 = (new SCPItemPearl(6004, "SCP-1000")).c(25).b("SCP-1000");
/* 495 */   public static final up Pearl131 = (new SCPItemPearl(6005, "SCP-131")).c(7).b("SCP-131");
/* 496 */   public static final up Pearl999 = (new SCPItemPearl(6006, "SCP-999")).c(24).b("SCP-999");
/* 497 */   public static final up Pearl049 = (new SCPItemPearl(6007, "SCP-049")).c(0).b("SCP-049");
/* 498 */   public static final up Pearl087 = (new SCPItemPearl(6008, "SCP-087")).c(3).b("SCP-087");
/* 499 */   public static final up Pearl173 = (new SCPItemPearl(6009, "SCP-173")).c(10).b("SCP-173");
/* 500 */   public static final up Pearl111 = (new SCPItemPearl(6010, "SCP-111")).c(6).b("SCP-111");
/* 501 */   public static final up Pearl294 = (new SCPItemPearl(6011, "SCP-294")).c(13).b("SCP-294");
/* 502 */   public static final up Pearl019 = (new SCPItemPearl(6012, "SCP-019")).c(8).b("SCP-019");
/* 503 */   public static final up Pearl457 = (new SCPItemPearl(6013, "SCP-457")).c(17).b("SCP-457");
/* 504 */   public static final up Pearl513 = (new SCPItemPearl(6014, "SCP-513")).c(19).b("Cowbell");
/* 505 */   public static final up Pearl914 = (new SCPItemPearl(6015, "SCP-914")).c(23).b("SCP-914");
/* 506 */   public static final up Pearl106 = (new SCPItemPearl(6016, "SCP-106")).c(5).b("SCP-106");
/* 507 */   public static final up Pearl538 = (new SCPItemPearl(6017, "SCP-538")).c(20).b("SCP-538");
/* 508 */   public static final up Pearl280 = (new SCPItemPearl(6018, "SCP-280")).c(12).b("SCP-280");
/* 509 */   public static final up Pearl080 = (new SCPItemPearl(6019, "SCP-080")).c(2).b("SCP-080");
/* 510 */   public static final up Pearl409 = (new SCPItemPearl(6020, "SCP-409")).c(16).b("SCP-409");
/* 511 */   public static final up Pearl310 = (new SCPItemPearl(6021, "SCP-310")).c(14).b("SCP-310");
/* 512 */   public static final up Pearl594 = (new SCPItemPearl(6022, "SCP-594")).c(21).b("SCP-594");
/* 513 */   public static final up Pearl143 = (new SCPItemPearl(6023, "SCP-143")).c(9).b("SCP-143");
/* 514 */   public static final up Pearl058 = (new SCPItemPearl(6024, "SCP-058")).c(1).b("SCP-058");
/*     */   
/* 516 */   public static final up Pearl006 = (new SCPItemPearl(6026, "SCP-006")).c(28).b("SCP-006");
/* 517 */   public static final up Pearl966 = (new SCPItemPearl(6027, "SCP-966")).c(36).b("SCP-966");
/* 518 */   public static final up Pearl872 = (new SCPItemPearl(6028, "SCP-872")).c(35).b("SCP-872");
/* 519 */   public static final up Pearl789J = (new SCPItemPearl(6029, "SCP-789-J")).c(34).b("SCP-789-J");
/* 520 */   public static final up Pearl015 = (new SCPItemPearl(6030, "SCP-015")).c(29).b("SCP-015");
/* 521 */   public static final up Pearl053 = (new SCPItemPearl(6031, "SCP-053")).c(31).b("SCP-053");
/* 522 */   public static final up Pearl073 = (new SCPItemPearl(6032, "SCP-073")).c(32).b("SCP-073");
/* 523 */   public static final up Pearl027 = (new SCPItemPearl(6033, "SCP-027")).c(30).b("SCP-027");
/* 524 */   public static final up Pearl076 = (new SCPItemPearl(6034, "SCP-076")).c(33).b("SCP-076");
/* 525 */   public static final up Pearl997 = (new SCPItemPearl(6035, "SCP-997")).c(37).b("SCP-997");
/* 526 */   public static final up Pearl079 = (new SCPItemPearl(6036, "SCP-079")).c(38).b("SCP-079");
/* 527 */   public static final up Pearl372 = (new SCPItemPearl(6037, "SCP-372")).c(39).b("SCP-372");
/* 528 */   public static final up Pearl151 = (new SCPItemPearl(6038, "SCP-151")).c(41).b("SCP-151");
/* 529 */   public static final up Pearl472 = (new SCPItemPearl(6039, "SCP-472")).c(40).b("SCP-472");
/*     */   
/* 531 */   public static final up Pearl273 = (new SCPItemPearl(6041, "SCP-273")).c(43).b("SCP-273");
/* 532 */   public static final up Pearl822 = (new SCPItemPearl(6042, "SCP-822")).c(45).b("SCP-822");
/* 533 */   public static final up Pearl023 = (new SCPItemPearl(6043, "SCP-023")).c(44).b("SCP-023");
/* 534 */   public static final up Pearl009 = (new SCPItemPearl(6044, "SCP-009")).c(46).b("SCP-009");
/* 535 */   public static final up Pearl002 = (new SCPItemPearl(6045, "SCP-002")).c(47).b("SCP-002");
/* 536 */   public static final up SCPItems = (new SCPItemDescription(6046)).c(29).b("SCPItems");
/*     */ 
/*     */   
/* 539 */   public static final up CupEmpty = (new SCPItemCup(7000)).b("Empty Cup");
/* 540 */   public static final up CupMycelium = (new SCPItemCupFilled(7001, 10124161, false, 0)).setPotionEffect(ll.k.H, 30, 2, 1.0F).b("Cup with Mycelium");
/* 541 */   public static final up CupNetherrack = (new SCPItemCupFilled(7002, 5975598, true, 6817800)).setPotionEffect(ll.n.H, 30, 2, 1.0F).b("Cup with Netherrack");
/* 542 */   public static final up CupCoal = (new SCPItemCupFilled(7003, 1776411, false, 0)).setPotionEffect(ll.t.H, 30, 2, 1.0F).b("Cup with Coal");
/* 543 */   public static final up CupGlowstone = (new SCPItemCupFilled(7004, 16759902, true, 7499593)).setPotionEffect(ll.q.H, 30, 2, 1.0F).b("Cup with Glowstone");
/* 544 */   public static final up CupGold = (new SCPItemCupFilled(7005, 14605824, false, 0)).setPotionEffect(ll.c.H, 10, 1, 1.0F).b("Cup with Gold");
/* 545 */   public static final up CupAppleGold = (new SCPItemCupFilled(7006, 15396439, false, 0)).setPotionEffect(ll.h.H, 30, 2, 1.0F).b("Cup with Golden Apple");
/* 546 */   public static final up CupCactus = (new SCPItemCupFilled(7007, 1346852, false, 0)).setPotionEffect(ll.i.H, 30, 2, 1.0F).b("Cup with Cactus");
/* 547 */   public static final up CupSlowSand = (new SCPItemCupFilled(7008, 4206115, true, 4206115)).setPotionEffect(ll.d.H, 30, 2, 1.0F).b("Cup with Soul Sand");
/* 548 */   public static final up CupObsidian = (new SCPItemCupFilled(7009, 1052697, true, 3812948)).setPotionEffect(ll.m.H, 30, 5, 1.0F).b("Cup with Obsidian");
/* 549 */   public static final up CupFeather = (new SCPItemCupFilled(7010, 16777215, false, 0)).setPotionEffect(ll.j.H, 30, 2, 1.0F).b("Cup with Feathers");
/* 550 */   public static final up CupSpiderEye = (new SCPItemCupFilled(7011, 6620715, false, 0)).setPotionEffect(ll.u.H, 30, 2, 1.0F).b("Cup with Spider Eyes");
/* 551 */   public static final up CupGlass = (new SCPItemCupFilled(7012, 11785947, false, 0)).setPotionEffect(ll.o.H, 30, 2, 1.0F).b("Cup with Glass");
/* 552 */   public static final up CupPumpkin = (new SCPItemCupFilled(7013, 14913565, false, 0)).setPotionEffect(shake.H, 5, 1, 1.0F).b("Cup with Moldy Pumpkin");
/* 553 */   public static final up CupApple = (new SCPItemCupFilled(7014, 16718891, false, 0)).setPotionEffect(ll.l.H, 30, 2, 1.0F).b("Apple Juice");
/* 554 */   public static final up CupStone = (new SCPItemCupFilled(7015, 4473924, false, 0)).setPotionEffect(crystal.H, 3, 0, 1.0F).b("Cup with Stone");
/* 555 */   public static final up CupClay = (new SCPItemCupFilled(7016, 10791096, false, 0)).setPotionEffect(ll.u.H, 17, 1, 1.0F).b("Cup with Clay");
/* 556 */   public static final up CupSugar = (new SCPItemCupFilled(7017, 16777215, true, 16777215)).setPotionEffect(ll.c.H, 30, 3, 1.0F).b("Cup with Redbull");
/* 557 */   public static final up CupRottenFlesh = (new SCPItemCupFilled(7018, 7298075, true, 9130787)).setPotionEffect(ll.s.H, 50, 2, 1.0F).b("Cup with Rotten Stuff (yuck)");
/* 558 */   public static final up CupIron = (new SCPItemCupFilled(7019, 14211288, false, 0)).setPotionEffect(ll.g.H, 30, 2, 1.0F).b("Cup with Iron");
/* 559 */   public static final up CupDiamond = (new SCPItemCupFilled(7020, 4910545, false, 0)).setPotionEffect(ll.e.H, 50, 5, 1.0F).b("Cup with Diamond");
/* 560 */   public static final up CupRedstone = (new SCPItemCupFilled(7021, 7471104, true, 16711680)).setPotionEffect(electricity.H, 5, 1, 1.0F).b("Cup with Redstone");
/* 561 */   public static final up CupCobweb = (new SCPItemCupFilled(7022, 11382197, false, 0)).setPotionEffect(ll.d.H, 8, 1, 1.0F).b("Cup with Web");
/* 562 */   public static final up CupBone = (new SCPItemCupFilled(7023, 16777215, false, 0)).setPotionEffect(skeleton.H, 30, 0, 1.0F).b("Cup with Bone Fragments");
/* 563 */   public static final up CupSlimeBall = (new SCPItemCupFilled(7024, 3211033, false, 0)).setPotionEffect(sticky.H, 30, 0, 1.0F).b("Cup with Slime");
/* 564 */   public static final up CupBlood = (new SCPItemCupFilled(7025, 8323072, false, 0)).setPotionEffect(bloodStone.H, 600, 0, 1.0F).b("Cup with Blood");
/*     */ 
/*     */ 
/*     */   
/* 568 */   public static final jg reinforcedIron = (new jg(1000, "reinforcedIron", 0, 0, Locker, null)).a().c();
/* 569 */   public static final jg craftCrafter = (new jg(1001, "craftCrafter", 0, -1, DocumentTable, reinforcedIron)).c();
/* 570 */   public static final jg breakSCP019 = (new jg(1002, "breakSCP019", 1, 1, Item019, craftCrafter)).c();
/* 571 */   public static final jg classD = (new jg(1003, "classD", 1, 2, GasMask, craftCrafter)).c();
/* 572 */   public static final jg pizzaBreak = (new jg(1004, "pizzaBreak", -1, 1, SCP458, craftCrafter)).c();
/* 573 */   public static final jg classDshirt = (new jg(1005, "classDShirt", -1, 2, ClassDShirt, reinforcedIron)).c();
/* 574 */   public static final jg classDpants = (new jg(1006, "classDPants", -2, 2, ClassDPants, classDshirt)).c();
/* 575 */   public static final jg classDboots = (new jg(1007, "classDBoots", -3, 2, ClassDShoes, classDpants)).c();
/* 576 */   public static final jg SCP629 = (new jg(1008, "ArmJob", -1, -1, Pearl629, craftCrafter)).c();
/* 577 */   public static final jg SCP457 = (new jg(1009, "Hothead", -1, -2, Pearl457, craftCrafter)).c();
/* 578 */   public static final jg Healer = (new jg(1010, "Healer", -1, -3, Pearl049, craftCrafter)).c();
/* 579 */   public static final jg hacker = (new jg(1011, "hacker", 1, -1, Pearl079, craftCrafter)).c();
/* 580 */   public static final jg brushYourToths = (new jg(1012, "BrushYourToths", -1, 3, TothBrush, craftCrafter)).c();
/* 581 */   public static final jg noSmoking = (new jg(1013, "noSmoking", 1, 3, SmokeBlock, craftCrafter)).c();
/* 582 */   public static final jg painKiller = (new jg(1014, "painKiller", -1, 4, SCP500G, craftCrafter)).c();
/* 583 */   public static final jg bestShit = (new jg(1015, "bestShit", 1, 4, SCP420J, craftCrafter)).c();
/* 584 */   public static final jg challengeaccepted = (new jg(1016, "challengeaccepted", 1, -2, Pearl087, craftCrafter)).c();
/* 585 */   public static final jg ClassDNoob = (new jg(1017, "ClassDNoob", 1, 5, L1Keycard, craftCrafter)).c();
/* 586 */   public static final jg CainWin = (new jg(1018, "cainwin", 1, -3, Pearl073, craftCrafter)).c();
/* 587 */   public static final jg AbleWin = (new jg(1019, "ablewin", 1, -4, Pearl076, craftCrafter)).c();
/* 588 */   public static final jg summonSCP015Boss = (new jg(1020, "KillSCP015Boss", -1, -4, Pearl015, craftCrafter)).c();
/* 589 */   public static final jg pocketD = (new jg(1021, "pocketD", -2, -4, Pearl106, craftCrafter)).c();
/*     */ 
/*     */   
/* 592 */   public static AchievementPage scpAchievement = new AchievementPage("SCP Craft", new jg[] { reinforcedIron, craftCrafter, breakSCP019, classD, pizzaBreak, classDpants, classDshirt, classDboots, SCP629, SCP457, Healer, hacker, brushYourToths, noSmoking, painKiller, bestShit, challengeaccepted, ClassDNoob, AbleWin, CainWin, summonSCP015Boss, pocketD });
/*     */ 
/*     */ 
/*     */   
/*     */   @Instance
/* 597 */   public static mod_SCP instance = new mod_SCP();
/*     */   
/*     */   public static CommonProxy proxy;
/*     */   
/*     */   private static float zLevel;
/*     */ 
/*     */   
/*     */   @Init
/*     */   public void load(FMLInitializationEvent event) {
/* 606 */     zLevel = -90.0F;
/*     */     
/* 608 */     MinecraftForge.EVENT_BUS.register(new SCPCraft_EventSounds());
/*     */     
/* 610 */     NetworkRegistry.instance().registerGuiHandler(this, (IGuiHandler)this.guiHandler);
/* 611 */     MinecraftForgeClient.preloadTexture("/SCPCraft/textures/SCPblox.png");
/* 612 */     MinecraftForgeClient.preloadTexture("/SCPCraft/textures/SCPPearls.png");
/* 613 */     MinecraftForgeClient.preloadTexture("/SCPCraft/textures/SCPItems.png");
/* 614 */     MinecraftForgeClient.preloadTexture("/SCPCraft/textures/SCPPosters.png");
/*     */     
/* 616 */     registerSCP(SCPEntity111.class, "SCP-111", EntityRegistry.findGlobalUniqueEntityId(), 52224, 7864137);
/* 617 */     registerSCP(SCPEntityClassDGuy.class, "Class-D Guy", EntityRegistry.findGlobalUniqueEntityId(), 16737792, 0);
/* 618 */     registerSCP(SCPEntity019n2.class, "SCP-019-2", EntityRegistry.findGlobalUniqueEntityId(), 16767633, 16776444);
/* 619 */     registerSCP(SCPEntity457.class, "SCP-457", EntityRegistry.findGlobalUniqueEntityId(), 16711680, 16737792);
/* 620 */     registerSCP(SCPEntity513.class, "SCP-513", EntityRegistry.findGlobalUniqueEntityId(), 0, 16713989);
/* 621 */     registerSCP(SCPEntity087.class, "SCP-087", EntityRegistry.findGlobalUniqueEntityId(), 16777215, 14737632);
/* 622 */     registerSCP(SCPEntity049.class, "SCP-049", EntityRegistry.findGlobalUniqueEntityId(), 5570560, 16777215);
/* 623 */     registerSCP(SCPEntity217Zombie.class, "Zomborg", EntityRegistry.findGlobalUniqueEntityId(), 0, 52224);
/* 624 */     registerSCP(SCPEntity217Creeper.class, "CreeperDrone", EntityRegistry.findGlobalUniqueEntityId(), 0, 52224);
/* 625 */     registerSCP(SCPEntity131.class, "SCP-131", EntityRegistry.findGlobalUniqueEntityId(), 16711680, 16776960);
/* 626 */     registerSCP(SCPEntity999.class, "SCP-999", EntityRegistry.findGlobalUniqueEntityId(), 16737792, 16742410);
/* 627 */     registerSCP(SCPEntity629.class, "SCP-629", EntityRegistry.findGlobalUniqueEntityId(), 9132544, 9139456);
/* 628 */     registerSCP(SCPEntity096Docile.class, "SCP-096 Docile", EntityRegistry.findGlobalUniqueEntityId(), 16762060, 10082815);
/* 629 */     registerSCP(SCPEntity096Cry.class, "SCP-096 Crying", EntityRegistry.findGlobalUniqueEntityId(), -1, -1);
/* 630 */     registerSCP(SCPEntity096Mad.class, "SCP-096", EntityRegistry.findGlobalUniqueEntityId(), -1, -1);
/* 631 */     registerSCP(SCPEntity217Cow.class, "Cowborg", EntityRegistry.findGlobalUniqueEntityId(), 0, 10066329);
/* 632 */     registerSCP(SCPEntity538.class, "SCP-538", EntityRegistry.findGlobalUniqueEntityId(), 0, 4803656);
/* 633 */     registerSCP(SCPEntity106.class, "SCP-106", EntityRegistry.findGlobalUniqueEntityId(), 0, 4468511);
/* 634 */     registerSCP(SCPEntity080.class, "SCP-080", EntityRegistry.findGlobalUniqueEntityId(), 0, 5592662);
/* 635 */     registerSCP(SCPEntity280.class, "SCP-280", EntityRegistry.findGlobalUniqueEntityId(), 0, 9342347);
/* 636 */     registerSCP(SCPEntity594.class, "SCP-594", EntityRegistry.findGlobalUniqueEntityId(), 4132363, 16773090);
/* 637 */     registerSCP(SCPEntity594Naked.class, "SCP-594Naked", EntityRegistry.findGlobalUniqueEntityId(), -1, -1);
/* 638 */     registerSCP(SCPEntity058.class, "SCP-058", EntityRegistry.findGlobalUniqueEntityId(), 10027008, 3342336);
/* 639 */     registerSCP(SCPEntity966.class, "SCP-966", EntityRegistry.findGlobalUniqueEntityId(), 16767633, 16776444);
/* 640 */     registerSCP(SCPEntity872.class, "SCP-872", EntityRegistry.findGlobalUniqueEntityId(), 5592662, 6183245);
/*     */     
/* 642 */     registerSCP(SCPEntity50AEJ.class, "SCP-50-AE-J", EntityRegistry.findGlobalUniqueEntityId(), -1, -1);
/* 643 */     registerSCP(SCPEntity1000.class, "SCP-1000", EntityRegistry.findGlobalUniqueEntityId(), 5570560, 16767633);
/* 644 */     registerSCP(SCPEntity053.class, "SCP-053", EntityRegistry.findGlobalUniqueEntityId(), 16771862, 11078399);
/* 645 */     registerSCP(SCPEntityClassD027.class, "Class-D Guy 027", EntityRegistry.findGlobalUniqueEntityId(), -1, -1);
/* 646 */     registerSCP(SCPEntity997.class, "SCP-997", EntityRegistry.findGlobalUniqueEntityId(), 9132544, 9139456);
/*     */     
/* 648 */     registerSCP(SCPEntity217Testificate.class, "Testifinator", EntityRegistry.findGlobalUniqueEntityId(), 0, 10066329);
/* 649 */     registerSCP(SCPEntity372.class, "SCP-372", EntityRegistry.findGlobalUniqueEntityId(), 52224, 52224);
/*     */     
/* 651 */     registerSCP(SCPEntity472.class, "SCP-472", EntityRegistry.findGlobalUniqueEntityId(), 16711680, 8523267);
/* 652 */     registerSCP(SCPEntity273.class, "SCP-273", EntityRegistry.findGlobalUniqueEntityId(), 0, 16777215);
/* 653 */     registerSCP(SCPEntity015Boss.class, "The Pipe Boss", EntityRegistry.findGlobalUniqueEntityId(), 0, 0);
/* 654 */     registerSCP(SCPEntity015Projectile.class, "SCP-015projectile", EntityRegistry.findGlobalUniqueEntityId(), -1, -1);
/* 655 */     registerSCP(SCPEntity217Pig.class, "Pigbot", EntityRegistry.findGlobalUniqueEntityId(), 16751001, 10066329);
/* 656 */     registerSCP(SCPEntity217Spider.class, "Spitron", EntityRegistry.findGlobalUniqueEntityId(), 0, 10066329);
/* 657 */     registerSCP(SCPEntity073.class, "SCP-073", EntityRegistry.findGlobalUniqueEntityId(), 0, 16777215);
/* 658 */     registerSCP(SCPEntity076.class, "SCP-076", EntityRegistry.findGlobalUniqueEntityId(), 0, 16777215);
/* 659 */     registerSCP(SCPEntityRat.class, "Rat", EntityRegistry.findGlobalUniqueEntityId(), 0, 16767633);
/* 660 */     registerSCP(SCPEntity173.class, "SCP-173", EntityRegistry.findGlobalUniqueEntityId(), 16708287, 2868736);
/* 661 */     registerSCP(SCPEntity023.class, "SCP-023", EntityRegistry.findGlobalUniqueEntityId(), 0, 0);
/* 662 */     registerSCP(SCPEntity682.class, "SCP-682", EntityRegistry.findGlobalUniqueEntityId(), 0, 0);
/* 663 */     registerSCP(SCPEntityReal682.class, "SCP-682Real", EntityRegistry.findGlobalUniqueEntityId(), -1, -1);
/*     */ 
/*     */ 
/*     */     
/* 667 */     EntityRegistry.registerModEntity(SCPEntityMountableBlock.class, "SCPEntityMountableBlock", EntityRegistry.findGlobalUniqueEntityId(), this, 250, 5, false);
/*     */     
/* 669 */     RegisterItemDocumentNames(new String[] { "SCP-500", "SCP-063", "SCP-1025", "SCP-109", "SCP-000-J", "SCP-50-AE-J", "SCP-420-J", "SCP-458", "SCP-217", "SCP-912" });
/*     */ 
/*     */ 
/*     */     
/* 673 */     RegisterPearl(new up[] { Pearl273, Pearl372, Pearl151, Pearl472, Pearl079, Pearl997, Pearl076, Pearl027, Pearl073, Pearl053, Pearl015, Pearl789J, Pearl872, Pearl966, Pearl058, Pearl310, Pearl409, Pearl594, Pearl143, Pearl280, Pearl080, Pearl106, Pearl538, Pearl079, Pearl629, Pearl087, Pearl173, Pearl111, Pearl914, Pearl294, Pearl261, Pearl131, Pearl457, Pearl019, Pearl1000, Pearl006, Pearl096, Pearl354, Pearl999, Pearl049, Pearl023, Pearl822, Pearl002, Pearl009 });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 679 */     RegisterItemNames(new up[] { BucketWater, Bucket354, Bucket006, SCP143Bucket, CupSlimeBall, CupBone, SCP000J, Record173, Record106, VirusTestificate, GasMask, ClassDShirt, ClassDPants, ClassDShoes, Item019, Item294, Item261, SCP458, SCP912Head, SCP912Pants, SCP912Shoes, SCP912Shirt, SCP217, VirusPig, VirusZombie, VirusSpider, VirusTestificate, VirusCreeper, Wrench, VirusCow, L1Keycard, L2Keycard, L3Keycard, OmniKeycard, SCP500G, SCP500B, SCP427, GodlyWrench, SCP420J, TothBrush, SCP143Pickaxe, SCP143Spade, SCP143Sword, SCP143Axe, CorrodedDoorItem, InfraRedGlasses, SCP50AEJ, SCP1025, SCP109, SlideDoorItem, ItemSCPPoster, Circuit, CupEmpty, CupMycelium, CupNetherrack, CupGlowstone, CupCoal, CupAppleGold, CupGold, CupSlowSand, CupCactus, CupObsidian, CupSpiderEye, CupFeather, CupGlass, CupPumpkin, CupApple, CupStone, CupClay, CupSugar, CupRottenFlesh, CupIron, CupDiamond, CupRedstone, CupCobweb, CupBone, CupBlood, SCP1023ARC, Pearl513, Record789J, Record173E, Record914, Record079 });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 689 */     RegisterDocumentNames(new up[] { SCP822S, SCP002S, SCP273S, SCP151S, SCP076S, SCP079S, SCP372S, SCP472S, SCP997S, SCP027S, SCP015S, SCP073S, SCP053S, SCP789JS, SCP1000S, SCP006S, SCP058S, SCP966S, SCP143S, SCP106S, SCP280S, SCP080S, SCP173S, SCP914S, SCP872S, SCP409S, SCP310S, SCP087S, SCP049S, SCP019S, SCP294S, SCP261S, SCP111S, SCP457S, SCP131S, SCP513S, SCP999S, SCP096S, SCP629S, SCP538S, SCP594S, SCP354S, SCP023S, SCP009S, SCP682S, SCP500S, SCP109S, SCP063S, SCP458S, SCP50AEJS, SCP420JS, SCP217S, SCP000JS, SCP1025S, SCP912S });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 696 */     RegisterBlocks(new amq[] { BloodBlock, Locker, SCP914, DocumentTable, Machinery, SCP019, SCP294, SCP261, SCP354Still, SCP354Flowing, KeycardSlot, KeycardSlotLv2, KeycardSlotLv3, KeycardSlotOmni, SmokeBlock, CorrodedIron, SCPspawner, Granite, SCP409, SCP310, SCP310Fire, ElectricWool, SCP143Leaves, SCP143Log, SCP143Sapling, SCP143Planks, CorrodedDoor, SCP006Still, SCP006Flowing, SCP789J, SCP015, SlidingDoor, GrateBlock, SCP079, SCP076, Shelf, Poster, SCP151, RemoteDoorComputer, SCP273, Flesh, Bone, SCP822, SCP822Grown, SCP009, Toilet, Alarm, stoneDesk, woodDesk, graniteDesk, marbleDesk, Marble, marbleChair, woodenChair, stoneChair, SCP513, OakShelf, SpruceShelf, BirchShelf, JungleShelf });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 704 */     RegisterPosters(new amq[] { Poster173, Poster106, Poster914, Poster372, Poster079 });
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 709 */     ModLoader.addLocalization("potion.crystal", "SCP-409");
/* 710 */     ModLoader.addLocalization("potion.electric", "Electricity");
/* 711 */     ModLoader.addLocalization("potion.shake", "Scare");
/* 712 */     ModLoader.addLocalization("potion.bloodstone", "Bloodstone");
/* 713 */     ModLoader.addLocalization("potion.control", "SCP-872");
/* 714 */     ModLoader.addLocalization("potion.vermin", "Vermin God");
/* 715 */     ModLoader.addLocalization("potion.sticky", "Sticky");
/* 716 */     ModLoader.addLocalization("potion.skeleton", "Skeleton King");
/* 717 */     ModLoader.addLocalization("potion.eat", "SCP-002");
/* 718 */     ModLoader.addLocalization("death.crystal", "%1$s got crystalized by SCP-409");
/* 719 */     ModLoader.addLocalization("death.bloodstone", "%1$s has gone mad");
/* 720 */     ModLoader.addLocalization("death.pipeBoss", "%1$ss got piped");
/* 721 */     ModLoader.addLocalization("death.ghost", "%1$ss butt got eaten");
/* 722 */     ModLoader.addLocalization("death.electricity", "%1$s got electrocuted");
/* 723 */     ModLoader.addLocalization("death.143", "%1$s got cut in SCP-143");
/* 724 */     ModLoader.addLocalization("death.106", "%1$s rotted away from SCP-106");
/* 725 */     ModLoader.addLocalization("death.023", "%1$s got stared to death by SCP-023");
/* 726 */     ModLoader.addLocalization("death.682", "%1$s got squashed by SCP-682");
/* 727 */     ModLoader.addLocalization("death.073", "%1$s got countered by SCP-073");
/* 728 */     ModLoader.addLocalization("death.002", "%1$s got eaten by SCP-002");
/* 729 */     ModLoader.addLocalization("key.blink", "Blink");
/* 730 */     ModLoader.addLocalization("key.Activate", "Blink Activation");
/* 731 */     ModLoader.addLocalization("key.doors", "Remote Doors");
/* 732 */     ModLoader.addLocalization("itemGroup.SCPBlocks", "SCP Blocks");
/* 733 */     ModLoader.addLocalization("itemGroup.SCPs", "SCPs");
/* 734 */     ModLoader.addLocalization("itemGroup.SCPCups", "SCP Cups");
/* 735 */     ModLoader.addLocalization("itemGroup.SCPItems", "SCP Items");
/* 736 */     ModLoader.addLocalization("gui.scpachievements", "SCPCraft");
/*     */ 
/*     */ 
/*     */     
/* 740 */     ModLoader.addAchievementDesc(reinforcedIron, "It's Iron...But Better!", "Craft Reinforced Iron");
/* 741 */     ModLoader.addAchievementDesc(craftCrafter, "Let The Adventure Begin...", "Craft the Document Table.");
/* 742 */     ModLoader.addAchievementDesc(breakSCP019, "Break The Unbreakable.", "Acquire SCP-019");
/* 743 */     ModLoader.addAchievementDesc(classD, "I CAN'T SEE!!!", "Craft A Gas Mask.");
/* 744 */     ModLoader.addAchievementDesc(pizzaBreak, "Pizza Break", "Prepare Your Lunch");
/* 745 */     ModLoader.addAchievementDesc(SCP629, "ArmJob", "Give SCP-629 his arms");
/* 746 */     ModLoader.addAchievementDesc(SCP457, "Fight Fire With Water", "Use The Burning Man's Document");
/* 747 */     ModLoader.addAchievementDesc(Healer, "Heal The Healer", "Give the special item to Mr. Plague Doctor");
/* 748 */     ModLoader.addAchievementDesc(hacker, "Hacker", "Communicate With SCP-079");
/* 749 */     ModLoader.addAchievementDesc(classDpants, "Then Pants...", "Craft The Class-D Panties");
/* 750 */     ModLoader.addAchievementDesc(classDshirt, "First The Shirt...", "Craft The Class-D Shirt");
/* 751 */     ModLoader.addAchievementDesc(classDboots, "...Then Booties", "Craft The Class-D Shoes");
/* 752 */     ModLoader.addAchievementDesc(brushYourToths, "Brush Your Toths", "Craft The World's Best Tothbrush");
/* 753 */     ModLoader.addAchievementDesc(noSmoking, "NO SMOKING", "Craft A Smoke Block");
/* 754 */     ModLoader.addAchievementDesc(painKiller, "Painkiller", "Craft An SCP-500 Pill");
/* 755 */     ModLoader.addAchievementDesc(bestShit, "Best [REDACTED] In The World", "Craft The Best Shit In The World");
/* 756 */     ModLoader.addAchievementDesc(challengeaccepted, "Challenge Accepted", "Spawn SCP-087's Chamber");
/* 757 */     ModLoader.addAchievementDesc(ClassDNoob, "Class-D Noob", "Craft A Level 1 Keycard");
/* 758 */     ModLoader.addAchievementDesc(AbleWin, "Are You Able To Do This?", "Spawn Able's Document");
/* 759 */     ModLoader.addAchievementDesc(CainWin, "Candy Cain", "Use Cain's Document");
/* 760 */     ModLoader.addAchievementDesc(summonSCP015Boss, "The Pied Piper", "Summon The Pipe Monster");
/* 761 */     ModLoader.addAchievementDesc(pocketD, "Check Your Pockets", "Succesfully Escape the Pocket Dimension.");
/*     */     
/* 763 */     AchievementPage.registerAchievementPage(scpAchievement);
/*     */ 
/*     */     
/* 766 */     ModLoader.registerTileEntity(SCPTileEntity914.class, "SCP-914");
/* 767 */     ModLoader.registerTileEntity(SCPTileEntity294.class, "SCP-294", (bdx)new SCPRender294());
/* 768 */     ModLoader.registerTileEntity(SCPTileEntity019.class, "SCP-019", (bdx)new SCPRender019());
/* 769 */     ModLoader.registerTileEntity(SCPTileEntity261.class, "SCP-261", (bdx)new SCPRender261());
/* 770 */     ModLoader.registerTileEntity(SCPTileEntity076.class, "SCP-076-1");
/* 771 */     ModLoader.registerTileEntity(SCPTileEntityShelf.class, "Shelf", (bdx)new SCPRenderShelf());
/* 772 */     ModLoader.registerTileEntity(SCPTileEntity151.class, "SCP-151");
/* 773 */     ModLoader.registerTileEntity(SCPTileEntity015.class, "SCP-015");
/* 774 */     ModLoader.registerTileEntity(SCPTileEntityRemoteDoorComp.class, "RemoteDoorComp", (bdx)new SCPRenderRemoteDoorComp());
/* 775 */     ModLoader.registerTileEntity(SCPTileEntity079.class, "SCP-079");
/* 776 */     ModLoader.registerTileEntity(SCPTileEntityAlarm.class, "Alarm");
/* 777 */     ModLoader.registerTileEntity(SCPTileEntityFlesh.class, "Flesh");
/*     */     
/* 779 */     SCP914.cl = 6;
/*     */     
/* 781 */     SCPRecipes000J.getInstance();
/* 782 */     SCPDocumentManager.getInstance();
/* 783 */     SCPRecipes.recipes();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getVersion() {
/* 789 */     return SCPCraftVersion;
/*     */   }
/*     */ 
/*     */   
/*     */   @PreInit
/*     */   public void PreInit(FMLPreInitializationEvent event) {
/* 795 */     MinecraftForge.EVENT_BUS.register(new SCPCraft_EventSounds());
/* 796 */     NetworkRegistry.instance().registerGuiHandler(this, (IGuiHandler)this.guiHandler);
/* 797 */     TickRegistry.registerTickHandler(new SCPClientTickHandler(), Side.CLIENT);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @PostInit
/*     */   public void PostInit(FMLPostInitializationEvent event) {
/* 804 */     NetworkRegistry.instance().registerGuiHandler(this, (IGuiHandler)this.guiHandler);
/*     */   }
/*     */ 
/*     */   
/*     */   private void registerSCP(Class cl, String name, int id, int background, int foreground) {
/* 809 */     if (background != -1 && foreground != -1) { EntityRegistry.registerGlobalEntityID(cl, name, id, background, foreground); }
/* 810 */     else { EntityRegistry.registerGlobalEntityID(cl, name, id); }
/* 811 */      EntityRegistry.registerModEntity(cl, name, id, this, 80, 3, true);
/* 812 */     ModLoader.addLocalization("entity." + name + ".name", name);
/*     */   }
/*     */ 
/*     */   
/*     */   private void RegisterBlocks(amq[] ablock) {
/* 817 */     amq[] ablock1 = ablock;
/* 818 */     int i = ablock1.length;
/* 819 */     for (int j = 0; j < i; j++) {
/*     */       
/* 821 */       amq block = ablock1[j];
/* 822 */       GameRegistry.registerBlock(block);
/* 823 */       amq item = ablock1[j];
/* 824 */       String name = ablock[j].a();
/* 825 */       LanguageRegistry.addName(item, name.substring(5));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void RegisterItemDocumentNames(String[] name) {
/* 831 */     int i = name.length;
/* 832 */     for (int j = 0; j < i; j++)
/*     */     {
/* 834 */       LanguageRegistry.addName(new ur(SCPItems, 1, j), name[j] + " Item Description");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private void RegisterItemNames(up[] aitem) {
/* 840 */     up[] aitem1 = aitem;
/* 841 */     int i = aitem1.length;
/* 842 */     for (int j = 0; j < i; j++) {
/*     */       
/* 844 */       up item = aitem1[j];
/* 845 */       String name = aitem[j].a();
/* 846 */       LanguageRegistry.addName(item, name.substring(5));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void RegisterPosters(amq[] ablock) {
/* 852 */     amq[] ablock1 = ablock;
/* 853 */     int i = ablock1.length;
/* 854 */     for (int j = 0; j < i; j++) {
/*     */       
/* 856 */       amq block = ablock1[j];
/* 857 */       LanguageRegistry.addName(block, "SCP Poster");
/* 858 */       GameRegistry.registerBlock(block);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void RegisterPearl(up[] aitem) {
/* 864 */     up[] aitem1 = aitem;
/* 865 */     int i = aitem1.length;
/* 866 */     for (int j = 0; j < i; j++) {
/*     */       
/* 868 */       String name = aitem[j].a();
/* 869 */       up item = aitem1[j];
/* 870 */       LanguageRegistry.addName(item, name.substring(5) + " Pearl");
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void RegisterDocumentNames(up[] aitem) {
/* 876 */     up[] aitem1 = aitem;
/* 877 */     int i = aitem1.length;
/* 878 */     for (int j = 0; j < i; j++) {
/*     */       
/* 880 */       up item = aitem1[j];
/* 881 */       LanguageRegistry.addName(item, "SCP Document");
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static void drawTexturedModalRect(int par1, int par2, int par3, int par4, int par5, int par6) {
/* 887 */     float var7 = 0.00390625F;
/* 888 */     float var8 = 0.00390625F;
/* 889 */     baz var9 = baz.a;
/* 890 */     var9.b();
/* 891 */     var9.a((par1 + 0), (par2 + par6), zLevel, ((par3 + 0) * var7), ((par4 + par6) * var8));
/* 892 */     var9.a((par1 + par5), (par2 + par6), zLevel, ((par3 + par5) * var7), ((par4 + par6) * var8));
/* 893 */     var9.a((par1 + par5), (par2 + 0), zLevel, ((par3 + par5) * var7), ((par4 + 0) * var8));
/* 894 */     var9.a((par1 + 0), (par2 + 0), zLevel, ((par3 + 0) * var7), ((par4 + 0) * var8));
/* 895 */     var9.a();
/*     */   }
/*     */   
/*     */   public void baseFilesEdited() {}
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/mod_SCP.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */