/*      */ import SCPCraft.mod_SCP;
/*      */ import cpw.mods.fml.relauncher.Side;
/*      */ import cpw.mods.fml.relauncher.SideOnly;
/*      */ import java.util.ArrayList;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import net.minecraftforge.common.EnumPlantType;
/*      */ import net.minecraftforge.common.ForgeDirection;
/*      */ import net.minecraftforge.common.ForgeHooks;
/*      */ import net.minecraftforge.common.IPlantable;
/*      */ import net.minecraftforge.common.MinecraftForge;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class amq
/*      */ {
/*   49 */   protected static int[] blockFireSpreadSpeed = new int[4096];
/*   50 */   protected static int[] blockFlammability = new int[4096];
/*   51 */   protected String currentTexture = "/terrain.png";
/*      */   
/*      */   public boolean isDefaultTexture = true;
/*      */   
/*      */   private tj a;
/*      */   
/*   57 */   public static final amu d = new amu("stone", 1.0F, 1.0F);
/*   58 */   public static final amu e = new amu("wood", 1.0F, 1.0F);
/*   59 */   public static final amu f = new amu("gravel", 1.0F, 1.0F);
/*   60 */   public static final amu g = new amu("grass", 1.0F, 1.0F);
/*   61 */   public static final amu h = new amu("stone", 1.0F, 1.0F);
/*   62 */   public static final amu i = new amu("stone", 1.0F, 1.5F);
/*   63 */   public static final amu j = (amu)new amr("stone", 1.0F, 1.0F);
/*   64 */   public static final amu k = new amu("cloth", 1.0F, 1.0F);
/*   65 */   public static final amu l = new amu("sand", 1.0F, 1.0F);
/*   66 */   public static final amu m = new amu("snow", 1.0F, 1.0F);
/*   67 */   public static final amu n = (amu)new ams("ladder", 1.0F, 1.0F);
/*   68 */   public static final amu o = (amu)new amt("anvil", 0.3F, 1.0F);
/*      */ 
/*      */   
/*   71 */   public static final amq[] p = new amq[4096];
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*   76 */   public static final boolean[] q = new boolean[4096];
/*      */ 
/*      */   
/*   79 */   public static final int[] r = new int[4096];
/*      */ 
/*      */   
/*   82 */   public static final boolean[] s = new boolean[4096];
/*      */ 
/*      */   
/*   85 */   public static final int[] t = new int[4096];
/*   86 */   public static final boolean[] u = new boolean[4096];
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*   91 */   public static boolean[] v = new boolean[4096];
/*   92 */   public static final amq w = (new aml(1, 1)).c(1.5F).b(10.0F).a(h).b("stone");
/*   93 */   public static final akj x = (akj)(new akj(2)).c(0.6F).a(g).b("grass");
/*   94 */   public static final amq y = (new ajv(3, 2)).c(0.5F).a(f).b("dirt");
/*   95 */   public static final amq z = (new amq(4, 16, agi.e)).c(2.0F).b(10.0F).a(h).b("stonebrick").a(tj.b);
/*   96 */   public static final amq A = (new ani(5)).c(2.0F).b(5.0F).a(e).b("wood").r();
/*   97 */   public static final amq B = (new ama(6, 15)).c(0.0F).a(g).b("sapling").r();
/*   98 */   public static final amq C = (new amq(7, 17, agi.e)).s().b(6000000.0F).a(h).b("bedrock").D().a(tj.b);
/*   99 */   public static final amq D = (new aky(8, agi.h)).c(100.0F).h(3).b("water").D().r();
/*  100 */   public static final amq E = (new akz(9, agi.h)).c(100.0F).h(3).b("water").D().r();
/*  101 */   public static final amq F = (new aky(10, agi.i)).c(0.0F).a(1.0F).h(255).b("lava").D().r();
/*      */ 
/*      */   
/*  104 */   public static final amq G = (new akz(11, agi.i)).c(100.0F).a(1.0F).h(255).b("lava").D().r();
/*  105 */   public static final amq H = (new akn(12, 18)).c(0.5F).a(l).b("sand");
/*  106 */   public static final amq I = (new akk(13, 19)).c(0.6F).a(f).b("gravel");
/*  107 */   public static final amq J = (new all(14, 32)).c(3.0F).b(5.0F).a(h).b("oreGold");
/*  108 */   public static final amq K = (new all(15, 33)).c(3.0F).b(5.0F).a(h).b("oreIron");
/*  109 */   public static final amq L = (new all(16, 34)).c(3.0F).b(5.0F).a(h).b("oreCoal");
/*  110 */   public static final amq M = (new ana(17)).c(2.0F).a(e).b("log").r();
/*  111 */   public static final akt N = (akt)(new akt(18, 52)).c(0.2F).h(1).a(g).b("leaves").r();
/*  112 */   public static final amq O = (new amf(19)).c(0.6F).a(g).b("sponge");
/*  113 */   public static final amq P = (new aki(20, 49, agi.r, false)).c(0.3F).a(j).b("glass");
/*  114 */   public static final amq Q = (new all(21, 160)).c(3.0F).b(5.0F).a(h).b("oreLapis");
/*  115 */   public static final amq R = (new amq(22, 144, agi.e)).c(3.0F).b(5.0F).a(h).b("blockLapis").a(tj.b);
/*  116 */   public static final amq S = (new ajw(23)).c(3.5F).a(h).b("dispenser").r();
/*  117 */   public static final amq T = (new alz(24)).a(h).c(0.8F).b("sandStone").r();
/*  118 */   public static final amq U = (new alf(25)).c(0.8F).b("musicBlock").r();
/*  119 */   public static final amq V = (new ajb(26)).c(0.2F).b("bed").D().r();
/*  120 */   public static final amq W = (new alr(27, 179, true)).c(0.7F).a(i).b("goldenRail").r();
/*  121 */   public static final amq X = (new ajs(28, 195)).c(0.7F).a(i).b("detectorRail").r();
/*  122 */   public static final amq Y = (new aoa(29, 106, true)).b("pistonStickyBase").r();
/*  123 */   public static final amq Z = (new ang(30, 11)).h(1).c(4.0F).b("web");
/*  124 */   public static final amm aa = (amm)(new amm(31, 39)).c(0.0F).a(g).b("tallgrass");
/*  125 */   public static final ajr ab = (ajr)(new ajr(32, 55)).c(0.0F).a(g).b("deadbush");
/*  126 */   public static final amq ac = (new aoa(33, 107, false)).b("pistonBase").r();
/*  127 */   public static final aob ad = (aob)(new aob(34, 107)).r();
/*  128 */   public static final amq ae = (new ajm()).c(0.8F).a(k).b("cloth").r();
/*  129 */   public static final aoc af = new aoc(36);
/*  130 */   public static final aje ag = (aje)(new aje(37, 13)).c(0.0F).a(g).b("flower");
/*  131 */   public static final aje ah = (aje)(new aje(38, 12)).c(0.0F).a(g).b("rose");
/*  132 */   public static final aje ai = (aje)(new ale(39, 29)).c(0.0F).a(g).a(0.125F).b("mushroom");
/*  133 */   public static final aje aj = (aje)(new ale(40, 28)).c(0.0F).a(g).b("mushroom");
/*  134 */   public static final amq ak = (new alc(41, 23)).c(3.0F).b(10.0F).a(i).b("blockGold");
/*  135 */   public static final amq al = (new alc(42, 22)).c(5.0F).b(10.0F).a(i).b("blockIron");
/*      */ 
/*      */   
/*  138 */   public static final akl am = (akl)(new amk(43, true)).c(2.0F).b(10.0F).a(h).b("stoneSlab");
/*      */ 
/*      */   
/*  141 */   public static final akl an = (akl)(new amk(44, false)).c(2.0F).b(10.0F).a(h).b("stoneSlab");
/*  142 */   public static final amq ao = (new amq(45, 7, agi.e)).c(2.0F).b(10.0F).a(h).b("brick").a(tj.b);
/*  143 */   public static final amq ap = (new amv(46, 8)).c(0.0F).a(g).b("tnt");
/*  144 */   public static final amq aq = (new ajc(47, 35)).c(1.5F).a(e).b("bookshelf");
/*  145 */   public static final amq ar = (new amq(48, 36, agi.e)).c(2.0F).b(10.0F).a(h).b("stoneMoss").a(tj.b);
/*  146 */   public static final amq as = (new alk(49, 37)).c(50.0F).b(2000.0F).a(h).b("obsidian");
/*  147 */   public static final amq at = (new amx(50, 80)).c(0.0F).a(0.9375F).a(e).b("torch").r();
/*  148 */   public static final akf au = (akf)(new akf(51, 31)).c(0.0F).a(1.0F).a(e).b("fire").D();
/*  149 */   public static final amq av = (new ald(52, 65)).c(5.0F).a(i).b("mobSpawner").D();
/*  150 */   public static final amq aw = (new amh(53, A, 0)).b("stairsWood").r();
/*  151 */   public static final amq ax = (new ajk(54)).c(2.5F).a(e).b("chest").r();
/*  152 */   public static final amq ay = (new alv(55, 164)).c(0.0F).a(d).b("redstoneDust").D().r();
/*  153 */   public static final amq az = (new all(56, 50)).c(3.0F).b(5.0F).a(h).b("oreDiamond");
/*  154 */   public static final amq aA = (new alc(57, 24)).c(5.0F).b(10.0F).a(i).b("blockDiamond");
/*  155 */   public static final amq aB = (new anj(58)).c(2.5F).a(e).b("workbench");
/*  156 */   public static final amq aC = (new ajq(59, 88)).b("crops");
/*  157 */   public static final amq aD = (new akc(60)).c(0.6F).a(f).b("farmland").r();
/*  158 */   public static final amq aE = (new akh(61, false)).c(3.5F).a(h).b("furnace").r().a(tj.c);
/*  159 */   public static final amq aF = (new akh(62, true)).c(3.5F).a(h).a(0.875F).b("furnace").r();
/*  160 */   public static final amq aG = (new amb(63, anv.class, true)).c(1.0F).a(e).b("sign").D().r();
/*  161 */   public static final amq aH = (new ajx(64, agi.d)).c(3.0F).a(e).b("doorWood").D().r();
/*  162 */   public static final amq aI = (new aks(65, 83)).c(0.4F).a(n).b("ladder").r();
/*  163 */   public static final amq aJ = (new alr(66, 128, false)).c(0.7F).a(i).b("rail").r();
/*  164 */   public static final amq aK = (new amh(67, z, 0)).b("stairsStone").r();
/*  165 */   public static final amq aL = (new amb(68, anv.class, false)).c(1.0F).a(e).b("sign").D().r();
/*  166 */   public static final amq aM = (new akv(69, 96)).c(0.5F).a(e).b("lever").r();
/*  167 */   public static final amq aN = (new alo(70, w.cl, alp.b, agi.e)).c(0.5F).a(h).b("pressurePlate").r();
/*  168 */   public static final amq aO = (new ajx(71, agi.f)).c(5.0F).a(i).b("doorIron").D().r();
/*  169 */   public static final amq aP = (new alo(72, A.cl, alp.a, agi.d)).c(0.5F).a(e).b("pressurePlate").r();
/*  170 */   public static final amq aQ = (new alw(73, 51, false)).c(3.0F).b(5.0F).a(h).b("oreRedstone").r().a(tj.b);
/*  171 */   public static final amq aR = (new alw(74, 51, true)).a(0.625F).c(3.0F).b(5.0F).a(h).b("oreRedstone").r();
/*  172 */   public static final amq aS = (new ali(75, 115, false)).c(0.0F).a(e).b("notGate").r();
/*  173 */   public static final amq aT = (new ali(76, 99, true)).c(0.0F).a(0.5F).a(e).b("notGate").r().a(tj.d);
/*  174 */   public static final amq aU = (new ajf(77, w.cl, false)).c(0.5F).a(h).b("button").r();
/*  175 */   public static final amq aV = (new amw(78, 66)).c(0.1F).a(m).b("snow").r().h(0);
/*  176 */   public static final amq aW = (new akr(79, 67)).c(0.5F).h(3).a(j).b("ice");
/*  177 */   public static final amq aX = (new ame(80, 66)).c(0.2F).a(m).b("snow");
/*  178 */   public static final amq aY = (new ajg(81, 70)).c(0.4F).a(k).b("cactus");
/*  179 */   public static final amq aZ = (new ajl(82, 72)).c(0.6F).a(f).b("clay");
/*  180 */   public static final amq ba = (new aly(83, 73)).c(0.0F).a(g).b("reeds").D();
/*  181 */   public static final amq bb = (new alt(84, 74)).c(2.0F).b(10.0F).a(h).b("jukebox").r();
/*  182 */   public static final amq bc = (new ake(85, 4)).c(2.0F).b(5.0F).a(e).b("fence");
/*  183 */   public static final amq bd = (new alq(86, 102, false)).c(1.0F).a(e).b("pumpkin").r();
/*  184 */   public static final amq be = (new akp(87, 103)).c(0.4F).a(h).b("hellrock");
/*  185 */   public static final amq bf = (new ako(88, 104)).c(0.5F).a(l).b("hellsand");
/*  186 */   public static final amq bg = (new akw(89, 105, agi.r)).c(0.3F).a(j).a(1.0F).b("lightgem");
/*      */ 
/*      */   
/*  189 */   public static final alm bh = (alm)(new alm(90, 14)).c(-1.0F).a(j).a(0.75F).b("portal");
/*  190 */   public static final amq bi = (new alq(91, 102, true)).c(1.0F).a(e).a(1.0F).b("litpumpkin").r();
/*  191 */   public static final amq bj = (new ajh(92, 121)).c(0.5F).a(k).b("cake").D().r();
/*  192 */   public static final amq bk = (new ajt(93, false)).c(0.0F).a(e).b("diode").D().r();
/*  193 */   public static final amq bl = (new ajt(94, true)).c(0.0F).a(0.625F).a(e).b("diode").D().r();
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  198 */   public static final amq bm = (new ala(95)).c(0.0F).a(1.0F).a(e).b("lockedchest").b(true).r();
/*  199 */   public static final amq bn = (new amz(96, agi.d)).c(3.0F).a(e).b("trapdoor").D().r();
/*  200 */   public static final amq bo = (new amj(97)).c(0.75F).b("monsterStoneEgg");
/*  201 */   public static final amq bp = (new amd(98)).c(1.5F).b(10.0F).a(h).b("stonebricksmooth");
/*  202 */   public static final amq bq = (new akq(99, agi.d, 142, 0)).c(0.2F).a(e).b("mushroom").r();
/*  203 */   public static final amq br = (new akq(100, agi.d, 142, 1)).c(0.2F).a(e).b("mushroom").r();
/*  204 */   public static final amq bs = (new amp(101, 85, 85, agi.f, true)).c(5.0F).b(10.0F).a(i).b("fenceIron");
/*  205 */   public static final amq bt = (new amp(102, 49, 148, agi.r, false)).c(0.3F).a(j).b("thinGlass");
/*  206 */   public static final amq bu = (new alb(103)).c(1.0F).a(e).b("melon");
/*  207 */   public static final amq bv = (new ami(104, bd)).c(0.0F).a(e).b("pumpkinStem").r();
/*  208 */   public static final amq bw = (new ami(105, bu)).c(0.0F).a(e).b("pumpkinStem").r();
/*  209 */   public static final amq bx = (new and(106)).c(0.2F).a(g).b("vine").r();
/*  210 */   public static final amq by = (new akd(107, 4)).c(2.0F).b(5.0F).a(e).b("fenceGate").r();
/*  211 */   public static final amq bz = (new amh(108, ao, 0)).b("stairsBrick").r();
/*  212 */   public static final amq bA = (new amh(109, bp, 0)).b("stairsStoneBrickSmooth").r();
/*  213 */   public static final alg bB = (alg)(new alg(110)).c(0.6F).a(g).b("mycel");
/*  214 */   public static final amq bC = (new anf(111, 76)).c(0.0F).a(g).b("waterlily");
/*  215 */   public static final amq bD = (new amq(112, 224, agi.e)).c(2.0F).b(10.0F).a(h).b("netherBrick").a(tj.b);
/*  216 */   public static final amq bE = (new ake(113, 224, agi.e)).c(2.0F).b(10.0F).a(h).b("netherFence");
/*  217 */   public static final amq bF = (new amh(114, bD, 0)).b("stairsNetherBrick").r();
/*  218 */   public static final amq bG = (new alh(115)).b("netherStalk").r();
/*  219 */   public static final amq bH = (new ajz(116)).c(5.0F).b(2000.0F).b("enchantmentTable");
/*  220 */   public static final amq bI = (new ajd(117)).c(0.5F).a(0.125F).b("brewingStand").r();
/*  221 */   public static final amq bJ = (new ajj(118)).c(2.0F).b("cauldron").r();
/*  222 */   public static final amq bK = (new amn(119, agi.C)).c(-1.0F).b(6000000.0F);
/*  223 */   public static final amq bL = (new amo(120)).a(j).a(0.125F).c(-1.0F).b("endPortalFrame").r().b(6000000.0F).a(tj.c);
/*  224 */   public static final amq bM = (new amq(121, 175, agi.e)).c(3.0F).b(15.0F).a(h).b("whiteStone").a(tj.b);
/*  225 */   public static final amq bN = (new ajy(122, 167)).c(3.0F).b(15.0F).a(h).a(0.125F).b("dragonEgg");
/*  226 */   public static final amq bO = (new alx(123, false)).c(0.3F).a(j).b("redstoneLight").a(tj.d);
/*  227 */   public static final amq bP = (new alx(124, true)).c(0.3F).a(j).b("redstoneLight");
/*  228 */   public static final akl bQ = (akl)(new anh(125, true)).c(2.0F).b(5.0F).a(e).b("woodSlab");
/*  229 */   public static final akl bR = (akl)(new anh(126, false)).c(2.0F).b(5.0F).a(e).b("woodSlab");
/*  230 */   public static final amq bS = (new ajn(127)).c(0.2F).b(5.0F).a(e).b("cocoa").r();
/*  231 */   public static final amq bT = (new amh(128, T, 0)).b("stairsSandStone").r();
/*  232 */   public static final amq bU = (new all(129, 171)).c(3.0F).b(5.0F).a(h).b("oreEmerald");
/*  233 */   public static final amq bV = (new aka(130)).c(22.5F).b(1000.0F).a(h).b("enderChest").r().a(0.5F);
/*  234 */   public static final anb bW = (anb)(new anb(131)).b("tripWireSource").r();
/*  235 */   public static final amq bX = (new anc(132)).b("tripWire").r();
/*  236 */   public static final amq bY = (new alc(133, 25)).c(5.0F).b(10.0F).a(i).b("blockEmerald");
/*  237 */   public static final amq bZ = (new amh(134, A, 1)).b("stairsWoodSpruce").r();
/*  238 */   public static final amq ca = (new amh(135, A, 2)).b("stairsWoodBirch").r();
/*  239 */   public static final amq cb = (new amh(136, A, 3)).b("stairsWoodJungle").r();
/*  240 */   public static final amq cc = (new ajo(137)).b("commandBlock");
/*  241 */   public static final amq cd = (new aja(138)).b("beacon").a(1.0F);
/*  242 */   public static final amq ce = (new ane(139, z)).b("cobbleWall");
/*  243 */   public static final amq cf = (new akg(140)).c(0.0F).a(d).b("flowerPot");
/*  244 */   public static final amq cg = (new aji(141)).b("carrots");
/*  245 */   public static final amq ch = (new aln(142)).b("potatoes");
/*  246 */   public static final amq ci = (new ajf(143, A.cl, true)).c(0.5F).a(e).b("button").r();
/*  247 */   public static final amq cj = (new amc(144)).c(1.0F).a(h).b("skull").r();
/*  248 */   public static final amq ck = (new aiz(145)).c(5.0F).a(o).b(2000.0F).b("anvil").r();
/*      */ 
/*      */ 
/*      */   
/*      */   public int cl;
/*      */ 
/*      */ 
/*      */   
/*      */   public final int cm;
/*      */ 
/*      */ 
/*      */   
/*      */   protected float cn;
/*      */ 
/*      */ 
/*      */   
/*      */   protected float co;
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean cp;
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean cq;
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean cr;
/*      */ 
/*      */   
/*      */   protected boolean cs;
/*      */ 
/*      */   
/*      */   protected double ct;
/*      */ 
/*      */   
/*      */   protected double cu;
/*      */ 
/*      */   
/*      */   protected double cv;
/*      */ 
/*      */   
/*      */   protected double cw;
/*      */ 
/*      */   
/*      */   protected double cx;
/*      */ 
/*      */   
/*      */   protected double cy;
/*      */ 
/*      */   
/*      */   public amu cz;
/*      */ 
/*      */   
/*      */   public float cA;
/*      */ 
/*      */   
/*      */   public final agi cB;
/*      */ 
/*      */   
/*      */   public float cC;
/*      */ 
/*      */   
/*      */   private String b;
/*      */ 
/*      */ 
/*      */   
/*      */   public amq(int par1, agi par2Material) {
/*  317 */     this.cp = true;
/*  318 */     this.cq = true;
/*  319 */     this.cz = d;
/*  320 */     this.cA = 1.0F;
/*  321 */     this.cC = 0.6F;
/*      */     
/*  323 */     if (p[par1] != null)
/*      */     {
/*  325 */       throw new IllegalArgumentException("Slot " + par1 + " is already occupied by " + p[par1] + " when adding " + this);
/*      */     }
/*      */ 
/*      */     
/*  329 */     this.cB = par2Material;
/*  330 */     p[par1] = this;
/*  331 */     this.cm = par1;
/*  332 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  333 */     q[par1] = c();
/*  334 */     r[par1] = c() ? 255 : 0;
/*  335 */     s[par1] = !par2Material.b();
/*      */     
/*  337 */     this.isDefaultTexture = (getTextureFile() != null && getTextureFile().equalsIgnoreCase("/terrain.png"));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public amq r() {
/*  346 */     u[this.cm] = true;
/*  347 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void t_() {}
/*      */ 
/*      */ 
/*      */   
/*      */   public amq(int par1, int par2, agi par3Material) {
/*  358 */     this(par1, par3Material);
/*  359 */     this.cl = par2;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public amq a(amu par1StepSound) {
/*  367 */     this.cz = par1StepSound;
/*  368 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public amq h(int par1) {
/*  376 */     r[this.cm] = par1;
/*  377 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public amq a(float par1) {
/*  386 */     t[this.cm] = (int)(15.0F * par1);
/*  387 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public amq b(float par1) {
/*  395 */     this.co = par1 * 3.0F;
/*  396 */     return this;
/*      */   }
/*      */ 
/*      */   
/*      */   public static boolean i(int par0) {
/*  401 */     amq var1 = p[par0];
/*  402 */     return (var1 == null) ? false : ((var1.cB.k() && var1.b()));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean b() {
/*  410 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean c(ym par1IBlockAccess, int par2, int par3, int par4) {
/*  415 */     return !this.cB.c();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int d() {
/*  423 */     return 0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public amq c(float par1) {
/*  431 */     this.cn = par1;
/*      */     
/*  433 */     if (this.co < par1 * 5.0F)
/*      */     {
/*  435 */       this.co = par1 * 5.0F;
/*      */     }
/*      */     
/*  438 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public amq s() {
/*  446 */     c(-1.0F);
/*  447 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float m(yc par1World, int par2, int par3, int par4) {
/*  455 */     return this.cn;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public amq b(boolean par1) {
/*  463 */     this.cr = par1;
/*  464 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean t() {
/*  473 */     return this.cr;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean u() {
/*  479 */     return hasTileEntity(0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void a(float par1, float par2, float par3, float par4, float par5, float par6) {
/*  487 */     this.ct = par1;
/*  488 */     this.cu = par2;
/*  489 */     this.cv = par3;
/*  490 */     this.cw = par4;
/*  491 */     this.cx = par5;
/*  492 */     this.cy = par6;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public float f(ym par1IBlockAccess, int par2, int par3, int par4) {
/*  502 */     return par1IBlockAccess.j(par2, par3, par4, getLightValue(par1IBlockAccess, par2, par3, par4));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public int e(ym par1IBlockAccess, int par2, int par3, int par4) {
/*  512 */     return par1IBlockAccess.i(par2, par3, par4, getLightValue(par1IBlockAccess, par2, par3, par4));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public boolean a(ym par1IBlockAccess, int par2, int par3, int par4, int par5) {
/*  523 */     return (par5 == 0 && this.cu > 0.0D) ? true : ((par5 == 1 && this.cx < 1.0D) ? true : ((par5 == 2 && this.cv > 0.0D) ? true : ((par5 == 3 && this.cy < 1.0D) ? true : ((par5 == 4 && this.ct > 0.0D) ? true : ((par5 == 5 && this.cw < 1.0D) ? true : (!par1IBlockAccess.s(par2, par3, par4)))))));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a_(ym par1IBlockAccess, int par2, int par3, int par4, int par5) {
/*  532 */     return par1IBlockAccess.g(par2, par3, par4).a();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public int d(ym par1IBlockAccess, int par2, int par3, int par4, int par5) {
/*  542 */     return a(par5, par1IBlockAccess.h(par2, par3, par4));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int a(int par1, int par2) {
/*  550 */     return a(par1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int a(int par1) {
/*  558 */     return this.cl;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(yc par1World, int par2, int par3, int par4, aoe par5AxisAlignedBB, List<aoe> par6List, lq par7Entity) {
/*  566 */     aoe var8 = e(par1World, par2, par3, par4);
/*      */     
/*  568 */     if (var8 != null && par5AxisAlignedBB.a(var8))
/*      */     {
/*  570 */       par6List.add(var8);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public aoe b_(yc par1World, int par2, int par3, int par4) {
/*  581 */     return aoe.a().a(par2 + this.ct, par3 + this.cu, par4 + this.cv, par2 + this.cw, par3 + this.cx, par4 + this.cy);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public aoe e(yc par1World, int par2, int par3, int par4) {
/*  590 */     return aoe.a().a(par2 + this.ct, par3 + this.cu, par4 + this.cv, par2 + this.cw, par3 + this.cx, par4 + this.cy);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean c() {
/*  599 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(int par1, boolean par2) {
/*  607 */     return m();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean m() {
/*  615 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(yc par1World, int par2, int par3, int par4, Random par5Random) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public void a(yc par1World, int par2, int par3, int par4, Random par5Random) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void c(yc par1World, int par2, int par3, int par4, int par5) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(yc par1World, int par2, int par3, int par4, int par5) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int r_() {
/*  646 */     return 10;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void g(yc par1World, int par2, int par3, int par4) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(yc par1World, int par2, int par3, int par4, int par5, int par6) {
/*  659 */     if (hasTileEntity(par6) && !(this instanceof akb))
/*      */     {
/*  661 */       par1World.r(par2, par3, par4);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int a(Random par1Random) {
/*  670 */     return 1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int a(int par1, Random par2Random, int par3) {
/*  678 */     return this.cm;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float a(qx par1EntityPlayer, yc par2World, int par3, int par4, int par5) {
/*  687 */     return ForgeHooks.blockStrength(this, par1EntityPlayer, par2World, par3, par4, par5);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void c(yc par1World, int par2, int par3, int par4, int par5, int par6) {
/*  695 */     a(par1World, par2, par3, par4, par5, 1.0F, par6);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(yc par1World, int par2, int par3, int par4, int par5, float par6, int par7) {
/*  703 */     if (!par1World.I) {
/*      */       
/*  705 */       ArrayList items = getBlockDropped(par1World, par2, par3, par4, par5, par7);
/*      */       
/*  707 */       for (ur item : items) {
/*      */         
/*  709 */         if (par1World.t.nextFloat() <= par6)
/*      */         {
/*  711 */           b(par1World, par2, par3, par4, item);
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void b(yc par1World, int par2, int par3, int par4, ur par5ItemStack) {
/*  722 */     if (!par1World.I && par1World.L().b("doTileDrops")) {
/*      */       
/*  724 */       float var6 = 0.7F;
/*  725 */       double var7 = (par1World.t.nextFloat() * var6) + (1.0F - var6) * 0.5D;
/*  726 */       double var9 = (par1World.t.nextFloat() * var6) + (1.0F - var6) * 0.5D;
/*  727 */       double var11 = (par1World.t.nextFloat() * var6) + (1.0F - var6) * 0.5D;
/*  728 */       px var13 = new px(par1World, par2 + var7, par3 + var9, par4 + var11, par5ItemStack);
/*  729 */       var13.b = 10;
/*  730 */       par1World.d((lq)var13);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void f(yc par1World, int par2, int par3, int par4, int par5) {
/*  739 */     if (!par1World.I)
/*      */     {
/*  741 */       while (par5 > 0) {
/*      */         
/*  743 */         int var6 = lz.a(par5);
/*  744 */         par5 -= var6;
/*  745 */         par1World.d((lq)new lz(par1World, par2 + 0.5D, par3 + 0.5D, par4 + 0.5D, var6));
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int b(int par1) {
/*  755 */     return 0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float a(lq par1Entity) {
/*  763 */     return this.co / 5.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public aoh a(yc par1World, int par2, int par3, int par4, aoj par5Vec3, aoj par6Vec3) {
/*  772 */     a(par1World, par2, par3, par4);
/*  773 */     par5Vec3 = par5Vec3.c(-par2, -par3, -par4);
/*  774 */     par6Vec3 = par6Vec3.c(-par2, -par3, -par4);
/*  775 */     aoj var7 = par5Vec3.b(par6Vec3, this.ct);
/*  776 */     aoj var8 = par5Vec3.b(par6Vec3, this.cw);
/*  777 */     aoj var9 = par5Vec3.c(par6Vec3, this.cu);
/*  778 */     aoj var10 = par5Vec3.c(par6Vec3, this.cx);
/*  779 */     aoj var11 = par5Vec3.d(par6Vec3, this.cv);
/*  780 */     aoj var12 = par5Vec3.d(par6Vec3, this.cy);
/*      */     
/*  782 */     if (!a(var7))
/*      */     {
/*  784 */       var7 = null;
/*      */     }
/*      */     
/*  787 */     if (!a(var8))
/*      */     {
/*  789 */       var8 = null;
/*      */     }
/*      */     
/*  792 */     if (!b(var9))
/*      */     {
/*  794 */       var9 = null;
/*      */     }
/*      */     
/*  797 */     if (!b(var10))
/*      */     {
/*  799 */       var10 = null;
/*      */     }
/*      */     
/*  802 */     if (!c(var11))
/*      */     {
/*  804 */       var11 = null;
/*      */     }
/*      */     
/*  807 */     if (!c(var12))
/*      */     {
/*  809 */       var12 = null;
/*      */     }
/*      */     
/*  812 */     aoj var13 = null;
/*      */     
/*  814 */     if (var7 != null && (var13 == null || par5Vec3.e(var7) < par5Vec3.e(var13)))
/*      */     {
/*  816 */       var13 = var7;
/*      */     }
/*      */     
/*  819 */     if (var8 != null && (var13 == null || par5Vec3.e(var8) < par5Vec3.e(var13)))
/*      */     {
/*  821 */       var13 = var8;
/*      */     }
/*      */     
/*  824 */     if (var9 != null && (var13 == null || par5Vec3.e(var9) < par5Vec3.e(var13)))
/*      */     {
/*  826 */       var13 = var9;
/*      */     }
/*      */     
/*  829 */     if (var10 != null && (var13 == null || par5Vec3.e(var10) < par5Vec3.e(var13)))
/*      */     {
/*  831 */       var13 = var10;
/*      */     }
/*      */     
/*  834 */     if (var11 != null && (var13 == null || par5Vec3.e(var11) < par5Vec3.e(var13)))
/*      */     {
/*  836 */       var13 = var11;
/*      */     }
/*      */     
/*  839 */     if (var12 != null && (var13 == null || par5Vec3.e(var12) < par5Vec3.e(var13)))
/*      */     {
/*  841 */       var13 = var12;
/*      */     }
/*      */     
/*  844 */     if (var13 == null)
/*      */     {
/*  846 */       return null;
/*      */     }
/*      */ 
/*      */     
/*  850 */     byte var14 = -1;
/*      */     
/*  852 */     if (var13 == var7)
/*      */     {
/*  854 */       var14 = 4;
/*      */     }
/*      */     
/*  857 */     if (var13 == var8)
/*      */     {
/*  859 */       var14 = 5;
/*      */     }
/*      */     
/*  862 */     if (var13 == var9)
/*      */     {
/*  864 */       var14 = 0;
/*      */     }
/*      */     
/*  867 */     if (var13 == var10)
/*      */     {
/*  869 */       var14 = 1;
/*      */     }
/*      */     
/*  872 */     if (var13 == var11)
/*      */     {
/*  874 */       var14 = 2;
/*      */     }
/*      */     
/*  877 */     if (var13 == var12)
/*      */     {
/*  879 */       var14 = 3;
/*      */     }
/*      */     
/*  882 */     return new aoh(par2, par3, par4, var14, var13.c(par2, par3, par4));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean a(aoj par1Vec3) {
/*  891 */     return (par1Vec3 == null) ? false : ((par1Vec3.d >= this.cu && par1Vec3.d <= this.cx && par1Vec3.e >= this.cv && par1Vec3.e <= this.cy));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean b(aoj par1Vec3) {
/*  899 */     return (par1Vec3 == null) ? false : ((par1Vec3.c >= this.ct && par1Vec3.c <= this.cw && par1Vec3.e >= this.cv && par1Vec3.e <= this.cy));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean c(aoj par1Vec3) {
/*  907 */     return (par1Vec3 == null) ? false : ((par1Vec3.c >= this.ct && par1Vec3.c <= this.cw && par1Vec3.d >= this.cu && par1Vec3.d <= this.cx));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void k(yc par1World, int par2, int par3, int par4) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public int n() {
/*  922 */     return 0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean b_(yc par1World, int par2, int par3, int par4, int par5) {
/*  930 */     return b(par1World, par2, par3, par4);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean b(yc par1World, int par2, int par3, int par4) {
/*  938 */     int var5 = par1World.a(par2, par3, par4);
/*  939 */     return (var5 == 0 || (p[var5]).cB.j());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(yc par1World, int par2, int par3, int par4, qx par5EntityPlayer, int par6, float par7, float par8, float par9) {
/*  947 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(yc par1World, int par2, int par3, int par4, lq par5Entity) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public int a(yc par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9) {
/*  957 */     return par9;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(yc par1World, int par2, int par3, int par4, qx par5EntityPlayer) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(yc par1World, int par2, int par3, int par4, lq par5Entity, aoj par6Vec3) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ym par1IBlockAccess, int par2, int par3, int par4) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final double v() {
/*  980 */     return this.ct;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final double w() {
/*  988 */     return this.cw;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final double x() {
/*  996 */     return this.cu;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final double y() {
/* 1004 */     return this.cx;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final double z() {
/* 1012 */     return this.cv;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final double A() {
/* 1020 */     return this.cy;
/*      */   }
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public int o() {
/* 1026 */     return 16777215;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public int g_(int par1) {
/* 1036 */     return 16777215;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public int b(ym par1IBlockAccess, int par2, int par3, int par4) {
/* 1047 */     return 16777215;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean b(ym par1IBlockAccess, int par2, int par3, int par4, int par5) {
/* 1057 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean i() {
/* 1065 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(yc par1World, int par2, int par3, int par4, lq par5Entity) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean c(ym par1IBlockAccess, int par2, int par3, int par4, int par5) {
/* 1079 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void f() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(yc par1World, qx par2EntityPlayer, int par3, int par4, int par5, int par6) {
/* 1093 */     par2EntityPlayer.a(jq.C[this.cm], 1);
/* 1094 */     par2EntityPlayer.j(0.025F);
/*      */     
/* 1096 */     if (canSilkHarvest(par1World, par2EntityPlayer, par3, par4, par5, par6) && xe.e(par2EntityPlayer)) {
/*      */       
/* 1098 */       ur var8 = f_(par6);
/*      */       
/* 1100 */       if (var8 != null)
/*      */       {
/* 1102 */         b(par1World, par3, par4, par5, var8);
/*      */       }
/*      */     }
/*      */     else {
/*      */       
/* 1107 */       int var7 = xe.f(par2EntityPlayer);
/* 1108 */       if (par2EntityPlayer.bK() == new ur(mod_SCP.TothBrush)) {
/*      */         
/* 1110 */         c(par1World, par3, par4, par5, par6, 100);
/*      */       } else {
/* 1112 */         c(par1World, par3, par4, par5, par6, var7);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean s_() {
/* 1121 */     return (b() && !this.cs);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected ur f_(int par1) {
/* 1130 */     int var2 = 0;
/*      */     
/* 1132 */     if (this.cm >= 0 && this.cm < up.e.length && up.e[this.cm].l())
/*      */     {
/* 1134 */       var2 = par1;
/*      */     }
/*      */     
/* 1137 */     return new ur(this.cm, 1, var2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int a(int par1, Random par2Random) {
/* 1145 */     return a(par2Random);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean d(yc par1World, int par2, int par3, int par4) {
/* 1153 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(yc par1World, int par2, int par3, int par4, md par5EntityLiving) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public void g(yc par1World, int par2, int par3, int par4, int par5) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public amq b(String par1Str) {
/* 1168 */     this.b = "tile." + par1Str;
/* 1169 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String B() {
/* 1178 */     return bm.a(a() + ".name");
/*      */   }
/*      */ 
/*      */   
/*      */   public String a() {
/* 1183 */     return this.b;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(yc par1World, int par2, int par3, int par4, int par5, int par6) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean C() {
/* 1197 */     return this.cq;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public amq D() {
/* 1206 */     this.cq = false;
/* 1207 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int q_() {
/* 1216 */     return this.cB.m();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public float j(ym par1IBlockAccess, int par2, int par3, int par4) {
/* 1226 */     return par1IBlockAccess.t(par2, par3, par4) ? 0.2F : 1.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(yc par1World, int par2, int par3, int par4, lq par5Entity, float par6) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public int a(yc par1World, int par2, int par3, int par4) {
/* 1241 */     return this.cm;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int h(yc par1World, int par2, int par3, int par4) {
/* 1249 */     return b(par1World.h(par2, par3, par4));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public void a(int par1, tj par2CreativeTabs, List<ur> par3List) {
/* 1259 */     par3List.add(new ur(par1, 1, 0));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public amq a(tj par1CreativeTabs) {
/* 1267 */     this.a = par1CreativeTabs;
/* 1268 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(yc par1World, int par2, int par3, int par4, int par5, qx par6EntityPlayer) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public tj E() {
/* 1283 */     return this.a;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void h(yc par1World, int par2, int par3, int par4, int par5) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public void f(yc par1World, int par2, int par3, int par4) {}
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public boolean u_() {
/* 1299 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean l() {
/* 1304 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(xx par1Explosion) {
/* 1312 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   static {
/* 1317 */     up.e[ae.cm] = (new tf(ae.cm - 256)).b("cloth");
/* 1318 */     up.e[M.cm] = (new ux(M.cm - 256, M, ana.a)).b("log");
/* 1319 */     up.e[A.cm] = (new ux(A.cm - 256, A, ani.a)).b("wood");
/* 1320 */     up.e[bo.cm] = (new ux(bo.cm - 256, bo, amj.a)).b("monsterStoneEgg");
/* 1321 */     up.e[bp.cm] = (new ux(bp.cm - 256, bp, amd.a)).b("stonebricksmooth");
/* 1322 */     up.e[T.cm] = (new ux(T.cm - 256, T, alz.a)).b("sandStone");
/* 1323 */     up.e[an.cm] = (new vp(an.cm - 256, an, am, false)).b("stoneSlab");
/* 1324 */     up.e[am.cm] = (new vp(am.cm - 256, an, am, true)).b("stoneSlab");
/* 1325 */     up.e[bR.cm] = (new vp(bR.cm - 256, bR, bQ, false)).b("woodSlab");
/* 1326 */     up.e[bQ.cm] = (new vp(bQ.cm - 256, bR, bQ, true)).b("woodSlab");
/* 1327 */     up.e[B.cm] = (new ux(B.cm - 256, B, ama.a)).b("sapling");
/* 1328 */     up.e[N.cm] = (new us(N.cm - 256)).b("leaves");
/* 1329 */     up.e[bx.cm] = (up)new th(bx.cm - 256, false);
/* 1330 */     up.e[aa.cm] = (up)(new th(aa.cm - 256, true)).a(new String[] { "shrub", "grass", "fern" });
/* 1331 */     up.e[bC.cm] = (up)new vt(bC.cm - 256);
/* 1332 */     up.e[ac.cm] = (up)new uz(ac.cm - 256);
/* 1333 */     up.e[Y.cm] = (up)new uz(Y.cm - 256);
/* 1334 */     up.e[ce.cm] = (new ux(ce.cm - 256, ce, ane.a)).b("cobbleWall");
/* 1335 */     up.e[ck.cm] = (new st(ck)).b("anvil");
/*      */     
/* 1337 */     for (int var0 = 0; var0 < 256; var0++) {
/*      */       
/* 1339 */       if (p[var0] != null) {
/*      */         
/* 1341 */         if (up.e[var0] == null) {
/*      */           
/* 1343 */           up.e[var0] = (up)new vq(var0 - 256);
/* 1344 */           p[var0].t_();
/*      */         } 
/*      */         
/* 1347 */         boolean var1 = false;
/*      */         
/* 1349 */         if (var0 > 0 && p[var0].d() == 10)
/*      */         {
/* 1351 */           var1 = true;
/*      */         }
/*      */         
/* 1354 */         if (var0 > 0 && p[var0] instanceof akl)
/*      */         {
/* 1356 */           var1 = true;
/*      */         }
/*      */         
/* 1359 */         if (var0 == aD.cm)
/*      */         {
/* 1361 */           var1 = true;
/*      */         }
/*      */         
/* 1364 */         if (s[var0])
/*      */         {
/* 1366 */           var1 = true;
/*      */         }
/*      */         
/* 1369 */         if (r[var0] == 0)
/*      */         {
/* 1371 */           var1 = true;
/*      */         }
/*      */         
/* 1374 */         v[var0] = var1;
/*      */       } 
/*      */     } 
/*      */     
/* 1378 */     s[0] = true;
/* 1379 */     jq.b();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getLightValue(ym world, int x, int y, int z) {
/* 1394 */     return t[this.cm];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isLadder(yc world, int x, int y, int z) {
/* 1408 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isBlockNormalCube(yc world, int x, int y, int z) {
/* 1424 */     return (this.cB.k() && b());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isBlockSolidOnSide(yc world, int x, int y, int z, ForgeDirection side) {
/* 1439 */     int meta = world.h(x, y, z);
/* 1440 */     if (this instanceof akl)
/*      */     {
/* 1442 */       return (((meta & 0x8) == 8 && side == ForgeDirection.UP) || c());
/*      */     }
/* 1444 */     if (this instanceof akc)
/*      */     {
/* 1446 */       return (side != ForgeDirection.DOWN && side != ForgeDirection.UP);
/*      */     }
/* 1448 */     if (this instanceof amh) {
/*      */       
/* 1450 */       boolean flipped = ((meta & 0x4) != 0);
/* 1451 */       return ((meta & 0x3) + side.ordinal() == 5 || (side == ForgeDirection.UP && flipped));
/*      */     } 
/* 1453 */     return isBlockNormalCube(world, x, y, z);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isBlockReplaceable(yc world, int x, int y, int z) {
/* 1468 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isBlockBurning(yc world, int x, int y, int z) {
/* 1483 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isAirBlock(yc world, int x, int y, int z) {
/* 1500 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean canHarvestBlock(qx player, int meta) {
/* 1512 */     return ForgeHooks.canHarvestBlock(this, player, meta);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean removeBlockByPlayer(yc world, qx player, int x, int y, int z) {
/* 1535 */     return world.e(x, y, z, 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void addCreativeItems(ArrayList itemList) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getFlammability(ym world, int x, int y, int z, int metadata, ForgeDirection face) {
/* 1563 */     return blockFlammability[this.cm];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isFlammable(ym world, int x, int y, int z, int metadata, ForgeDirection face) {
/* 1580 */     return (getFlammability(world, x, y, z, metadata, face) > 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getFireSpreadSpeed(yc world, int x, int y, int z, int metadata, ForgeDirection face) {
/* 1597 */     return blockFireSpreadSpeed[this.cm];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isFireSource(yc world, int x, int y, int z, int metadata, ForgeDirection side) {
/* 1615 */     if (this.cm == be.cm && side == ForgeDirection.UP)
/*      */     {
/* 1617 */       return true;
/*      */     }
/* 1619 */     if (world.u instanceof aat && this.cm == C.cm && side == ForgeDirection.UP)
/*      */     {
/* 1621 */       return true;
/*      */     }
/* 1623 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void setBurnProperties(int id, int encouragement, int flammability) {
/* 1634 */     blockFireSpreadSpeed[id] = encouragement;
/* 1635 */     blockFlammability[id] = flammability;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean hasTileEntity(int metadata) {
/* 1650 */     return this.cs;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public any createTileEntity(yc world, int metadata) {
/* 1663 */     if (this instanceof akb)
/*      */     {
/* 1665 */       return ((akb)this).createNewTileEntity(world, metadata);
/*      */     }
/* 1667 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int quantityDropped(int meta, int fortune, Random random) {
/* 1681 */     return a(fortune, random);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ArrayList getBlockDropped(yc world, int x, int y, int z, int metadata, int fortune) {
/* 1697 */     ArrayList<ur> ret = new ArrayList();
/*      */     
/* 1699 */     int count = quantityDropped(metadata, fortune, world.t);
/* 1700 */     for (int i = 0; i < count; i++) {
/*      */       
/* 1702 */       int id = a(metadata, world.t, 0);
/* 1703 */       if (id > 0)
/*      */       {
/* 1705 */         ret.add(new ur(id, 1, b(metadata)));
/*      */       }
/*      */     } 
/* 1708 */     return ret;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean canSilkHarvest(yc world, qx player, int x, int y, int z, int metadata) {
/* 1724 */     if (this instanceof aki || this instanceof aka)
/*      */     {
/* 1726 */       return true;
/*      */     }
/* 1728 */     return (b() && !hasTileEntity(metadata));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean canCreatureSpawn(me type, yc world, int x, int y, int z) {
/* 1744 */     int meta = world.h(x, y, z);
/* 1745 */     if (this instanceof amk) {
/*      */       
/* 1747 */       if (MinecraftForge.SPAWNER_ALLOW_ON_INVERTED)
/*      */       {
/* 1749 */         return ((meta & 0x8) == 8 || c());
/*      */       }
/*      */ 
/*      */       
/* 1753 */       return i(this.cm);
/*      */     } 
/*      */     
/* 1756 */     if (this instanceof amh) {
/*      */       
/* 1758 */       if (MinecraftForge.SPAWNER_ALLOW_ON_INVERTED)
/*      */       {
/* 1760 */         return ((meta & 0x4) != 0);
/*      */       }
/*      */ 
/*      */       
/* 1764 */       return i(this.cm);
/*      */     } 
/*      */     
/* 1767 */     return isBlockSolidOnSide(world, x, y, z, ForgeDirection.UP);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isBed(yc world, int x, int y, int z, md player) {
/* 1784 */     return (this.cm == V.cm);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public s getBedSpawnPosition(yc world, int x, int y, int z, qx player) {
/* 1800 */     return ajb.b(world, x, y, z, 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setBedOccupied(yc world, int x, int y, int z, qx player, boolean occupied) {
/* 1815 */     ajb.a(world, x, y, z, occupied);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getBedDirection(ym world, int x, int y, int z) {
/* 1830 */     return ajb.e(world.h(x, y, z));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isBedFoot(ym world, int x, int y, int z) {
/* 1844 */     return ajb.b_(world.h(x, y, z));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void beginLeavesDecay(yc world, int x, int y, int z) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean canSustainLeaves(yc world, int x, int y, int z) {
/* 1868 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isLeaves(yc world, int x, int y, int z) {
/* 1882 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean canBeReplacedByLeaves(yc world, int x, int y, int z) {
/* 1896 */     return !q[this.cm];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isWood(yc world, int x, int y, int z) {
/* 1909 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isGenMineableReplaceable(yc world, int x, int y, int z) {
/* 1923 */     return (this.cm == w.cm);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getTextureFile() {
/* 1931 */     return this.currentTexture;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public amq setTextureFile(String texture) {
/* 1942 */     this.currentTexture = texture;
/* 1943 */     this.isDefaultTexture = false;
/* 1944 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getExplosionResistance(lq par1Entity, yc world, int x, int y, int z, double explosionX, double explosionY, double explosionZ) {
/* 1963 */     return a(par1Entity);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean canConnectRedstone(ym world, int x, int y, int z, int side) {
/* 1986 */     return (p[this.cm].i() && side != -1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean canPlaceTorchOnTop(yc world, int x, int y, int z) {
/* 2001 */     if (world.v(x, y, z))
/*      */     {
/* 2003 */       return true;
/*      */     }
/*      */ 
/*      */     
/* 2007 */     int id = world.a(x, y, z);
/* 2008 */     return (id == bc.cm || id == bE.cm || id == P.cm || id == ce.cm);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean canRenderInPass(int pass) {
/* 2021 */     return (pass == n());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ur getPickBlock(aoh target, yc world, int x, int y, int z) {
/* 2032 */     int id = a(world, x, y, z);
/*      */     
/* 2034 */     if (id == 0)
/*      */     {
/* 2036 */       return null;
/*      */     }
/*      */     
/* 2039 */     up item = up.e[id];
/* 2040 */     if (item == null)
/*      */     {
/* 2042 */       return null;
/*      */     }
/*      */     
/* 2045 */     return new ur(id, 1, h(world, x, y, z));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isBlockFoliage(yc world, int x, int y, int z) {
/* 2056 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public boolean addBlockHitEffects(yc worldObj, aoh target, azr effectRenderer) {
/* 2073 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @SideOnly(Side.CLIENT)
/*      */   public boolean addBlockDestroyEffects(yc world, int x, int y, int z, int meta, azr effectRenderer) {
/* 2093 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean canSustainPlant(yc world, int x, int y, int z, ForgeDirection direction, IPlantable plant) {
/*      */     boolean isBeach, hasWater;
/* 2117 */     int plantID = plant.getPlantID(world, x, y + 1, z);
/* 2118 */     EnumPlantType plantType = plant.getPlantType(world, x, y + 1, z);
/*      */     
/* 2120 */     if (plantID == aY.cm && this.cm == aY.cm)
/*      */     {
/* 2122 */       return true;
/*      */     }
/*      */     
/* 2125 */     if (plantID == ba.cm && this.cm == ba.cm)
/*      */     {
/* 2127 */       return true;
/*      */     }
/*      */     
/* 2130 */     if (plant instanceof aje && ((aje)plant).d_(this.cm))
/*      */     {
/* 2132 */       return true;
/*      */     }
/*      */     
/* 2135 */     switch (plantType) {
/*      */       case Desert:
/* 2137 */         return (this.cm == H.cm);
/* 2138 */       case Nether: return (this.cm == bf.cm);
/* 2139 */       case Crop: return (this.cm == aD.cm);
/* 2140 */       case Cave: return isBlockSolidOnSide(world, x, y, z, ForgeDirection.UP);
/* 2141 */       case Plains: return (this.cm == amq.x.cm || this.cm == amq.y.cm);
/* 2142 */       case Water: return (world.g(x, y, z) == agi.h && world.h(x, y, z) == 0);
/*      */       case Beach:
/* 2144 */         isBeach = (this.cm == amq.x.cm || this.cm == amq.y.cm || this.cm == H.cm);
/* 2145 */         hasWater = (world.g(x - 1, y, z) == agi.h || world.g(x + 1, y, z) == agi.h || world.g(x, y, z - 1) == agi.h || world.g(x, y, z + 1) == agi.h);
/*      */ 
/*      */ 
/*      */         
/* 2149 */         return (isBeach && hasWater);
/*      */     } 
/*      */     
/* 2152 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isFertile(yc world, int x, int y, int z) {
/* 2168 */     if (this.cm == aD.cm)
/*      */     {
/* 2170 */       return (world.h(x, y, z) > 0);
/*      */     }
/*      */     
/* 2173 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getLightOpacity(yc world, int x, int y, int z) {
/* 2192 */     return r[this.cm];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean canDragonDestroy(yc world, int x, int y, int z) {
/* 2207 */     return (this.cm != as.cm && this.cm != bM.cm && this.cm != C.cm);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isBeaconBase(yc worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
/* 2224 */     return (this.cm == bY.cm || this.cm == ak.cm || this.cm == aA.cm || this.cm == al.cm);
/*      */   }
/*      */ }


/* Location:              /home/luigi/Documents/JAR.jar!/amq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */