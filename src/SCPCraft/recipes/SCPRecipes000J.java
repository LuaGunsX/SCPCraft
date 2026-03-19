/*     */ package SCPCraft.recipes;
/*     */ 
/*     */ import ModLoader;
/*     */ import SCPCraft.mod_SCP;
/*     */ import amq;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import ry;
/*     */ import up;
/*     */ import ur;
/*     */ import wp;
/*     */ import wq;
/*     */ import wr;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPRecipes000J
/*     */ {
/*  22 */   private static final SCPRecipes000J instance = new SCPRecipes000J();
/*  23 */   private yc worldObj = (yc)(ModLoader.getMinecraftInstance()).e;
/*     */   
/*     */   private List recipes;
/*     */   
/*     */   public static final SCPRecipes000J getInstance() {
/*  28 */     return instance;
/*     */   }
/*     */ 
/*     */   
/*     */   private SCPRecipes000J() {
/*  33 */     this.recipes = new ArrayList();
/*  34 */     addRecipe(new ur(mod_SCP.Locker, 1), new Object[] { " B ", "BAB", " B ", Character.valueOf('B'), up.o, Character.valueOf('A'), amq.al });
/*  35 */     addRecipe(new ur(mod_SCP.DocumentTable, 1), new Object[] { " W ", "WCW", " W ", Character.valueOf('C'), amq.aB, Character.valueOf('W'), mod_SCP.Locker });
/*  36 */     addRecipe(new ur(mod_SCP.Pearl173, 1), new Object[] { "YAY", "AXA", "YAY", Character.valueOf('X'), up.bn, Character.valueOf('A'), up.bm, Character.valueOf('Y'), amq.w });
/*  37 */     addRecipe(new ur(mod_SCP.Pearl111, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), amq.y, Character.valueOf('B'), up.j });
/*  38 */     addRecipe(new ur(mod_SCP.GasMask, 1), new Object[] { "AAA", "A A", Character.valueOf('A'), mod_SCP.Locker });
/*  39 */     addRecipe(new ur(mod_SCP.ClassDShirt, 1), new Object[] { "A A", "AAA", "AAA", Character.valueOf('A'), mod_SCP.Locker });
/*  40 */     addRecipe(new ur(mod_SCP.ClassDPants, 1), new Object[] { "AAA", "A A", "A A", Character.valueOf('A'), mod_SCP.Locker });
/*  41 */     addRecipe(new ur(mod_SCP.ClassDShoes, 1), new Object[] { "A A", "A A", Character.valueOf('A'), mod_SCP.Locker });
/*  42 */     addRecipe(new ur(mod_SCP.Pearl914, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), amq.ak, Character.valueOf('B'), up.n });
/*  43 */     addRecipe(new ur(mod_SCP.Pearl019, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), amq.aZ, Character.valueOf('B'), up.m });
/*  44 */     addRecipe(new ur(mod_SCP.Pearl457, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), up.i, Character.valueOf('B'), amq.be });
/*  45 */     addRecipe(new ur(mod_SCP.Pearl294, 1), new Object[] { "XBX", "BAB", "XBX", Character.valueOf('A'), up.bn, Character.valueOf('B'), up.ax, Character.valueOf('X'), amq.as });
/*  46 */     addRecipe(new ur(mod_SCP.Pearl513, 1), new Object[] { " X ", "XXX", "XBX", Character.valueOf('B'), up.bn, Character.valueOf('X'), up.o });
/*  47 */     addRecipe(new ur(mod_SCP.SCPItems, 1, 7), new Object[] { "XAX", "ABA", "XAX", Character.valueOf('X'), up.at, Character.valueOf('A'), up.n, Character.valueOf('B'), up.aK });
/*  48 */     addRecipe(new ur(mod_SCP.SCPItems, 1, 10), new Object[] { "AXB", "XYX", "DXC", Character.valueOf('X'), mod_SCP.Locker, Character.valueOf('A'), up.ad, Character.valueOf('B'), up.ae, Character.valueOf('C'), up.af, Character.valueOf('D'), up.ag, Character.valueOf('Y'), up.aK });
/*  49 */     addRecipe(new ur(mod_SCP.SCPItems, 1, 8), new Object[] { "BAB", "AZA", "BAB", Character.valueOf('B'), up.o, Character.valueOf('A'), amq.bt, Character.valueOf('Z'), up.aK });
/*  50 */     addRecipe(new ur(mod_SCP.Pearl049, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), up.j, Character.valueOf('B'), up.bu });
/*  51 */     addShapelessRecipe(new ur(mod_SCP.VirusPig, 1), new Object[] { mod_SCP.SCP217, up.aq });
/*  52 */     addShapelessRecipe(new ur(mod_SCP.VirusCreeper, 1), new Object[] { mod_SCP.SCP217, up.M });
/*  53 */     addShapelessRecipe(new ur(mod_SCP.VirusPig, 1), new Object[] { mod_SCP.SCP217, up.ar });
/*  54 */     addShapelessRecipe(new ur(mod_SCP.VirusCow, 1), new Object[] { mod_SCP.SCP217, up.bi });
/*  55 */     addShapelessRecipe(new ur(mod_SCP.VirusCow, 1), new Object[] { mod_SCP.SCP217, up.bj });
/*  56 */     addShapelessRecipe(new ur(mod_SCP.VirusSpider, 1), new Object[] { mod_SCP.SCP217, up.K });
/*  57 */     addShapelessRecipe(new ur(mod_SCP.VirusSpider, 1), new Object[] { mod_SCP.SCP217, up.bu });
/*  58 */     addShapelessRecipe(new ur(mod_SCP.VirusZombie, 1), new Object[] { mod_SCP.SCP217, up.bm });
/*  59 */     addShapelessRecipe(new ur(mod_SCP.VirusTestificate, 1), new Object[] { mod_SCP.SCP217, up.bH });
/*  60 */     addRecipe(new ur(mod_SCP.Pearl087, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), amq.aK, Character.valueOf('B'), up.bA });
/*  61 */     addRecipe(new ur(mod_SCP.Pearl1000, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), amq.y, Character.valueOf('B'), amq.aa });
/*  62 */     addRecipe(new ur(mod_SCP.Pearl131, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), up.bA, Character.valueOf('B'), up.aC });
/*  63 */     addRecipe(new ur(mod_SCP.Pearl999, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), up.aM, Character.valueOf('B'), up.bw });
/*  64 */     addRecipe(new ur(mod_SCP.Pearl261, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), amq.as, Character.valueOf('B'), up.n });
/*  65 */     addRecipe(new ur(mod_SCP.Pearl629, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), up.o, Character.valueOf('B'), up.p });
/*  66 */     addRecipe(new ur(mod_SCP.Wrench, 1), new Object[] { "B B", "AAA", " A ", Character.valueOf('A'), up.o, Character.valueOf('B'), up.p });
/*  67 */     addRecipe(new ur(mod_SCP.Pearl354, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), up.aD, Character.valueOf('B'), up.ay });
/*  68 */     addRecipe(new ur(mod_SCP.Pearl096, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), up.bp, Character.valueOf('B'), up.M });
/*  69 */     addRecipe(new ur(mod_SCP.SmokeBlock, 2), new Object[] { "B B", "BXB", "BBB", Character.valueOf('X'), up.i, Character.valueOf('B'), amq.z });
/*  70 */     addRecipe(new ur(mod_SCP.L1Keycard, 1), new Object[] { "AAA", "BBB", Character.valueOf('A'), up.aK, Character.valueOf('B'), up.o });
/*  71 */     addRecipe(new ur(mod_SCP.L1Keycard, 1), new Object[] { "AAA", "BBB", "   ", Character.valueOf('A'), up.aK, Character.valueOf('B'), up.o });
/*  72 */     addRecipe(new ur(mod_SCP.SCPItems, 1, 0), new Object[] { "XBX", "BAB", "XBX", Character.valueOf('A'), up.aK, Character.valueOf('B'), up.at, Character.valueOf('X'), up.aC });
/*  73 */     addRecipe(new ur(mod_SCP.KeycardSlot, 4), new Object[] { "CCC", "ABA", "AAA", Character.valueOf('A'), up.o, Character.valueOf('B'), up.aC, Character.valueOf('C'), amq.aU });
/*  74 */     addRecipe(new ur(mod_SCP.Pearl106, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), amq.as, Character.valueOf('B'), amq.ar });
/*  75 */     addRecipe(new ur(mod_SCP.Pearl538, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), up.bu, Character.valueOf('B'), up.K });
/*  76 */     addRecipe(new ur(mod_SCP.SCPItems, 1, 6), new Object[] { "XAX", "ABA", "XAX", Character.valueOf('X'), up.i, Character.valueOf('A'), up.T, Character.valueOf('B'), up.aK });
/*  77 */     addRecipe(new ur(mod_SCP.Pearl280, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), amq.bM, Character.valueOf('B'), amq.as });
/*  78 */     addRecipe(new ur(mod_SCP.Pearl080, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), amq.at, Character.valueOf('B'), up.m });
/*  79 */     addRecipe(new ur(mod_SCP.Pearl409, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), up.n, Character.valueOf('B'), mod_SCP.Granite });
/*  80 */     addRecipe(new ur(mod_SCP.Pearl310, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), up.i, Character.valueOf('B'), up.K });
/*  81 */     addRecipe(new ur(mod_SCP.Pearl594, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), amq.ae, Character.valueOf('B'), up.aC });
/*  82 */     addRecipe(new ur(mod_SCP.Pearl058, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), mod_SCP.BloodBlock, Character.valueOf('B'), up.bu });
/*  83 */     addRecipe(new ur(mod_SCP.Pearl143, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), amq.M, Character.valueOf('B'), amq.B });
/*  84 */     addRecipe(new ur(mod_SCP.Granite, 4), new Object[] { "AAA", "AXA", "AAA", Character.valueOf('X'), amq.as, Character.valueOf('A'), amq.w });
/*  85 */     addRecipe(new ur(mod_SCP.SCP143Sword, 1), new Object[] { "A", "A", "X", Character.valueOf('X'), up.D, Character.valueOf('A'), mod_SCP.SCP143Planks });
/*  86 */     addRecipe(new ur(mod_SCP.SCP143Axe, 1), new Object[] { "AA", "AX", " X", Character.valueOf('X'), up.D, Character.valueOf('A'), mod_SCP.SCP143Planks });
/*  87 */     addRecipe(new ur(mod_SCP.SCP143Pickaxe, 1), new Object[] { "AAA", " X ", " X ", Character.valueOf('X'), up.D, Character.valueOf('A'), mod_SCP.SCP143Planks });
/*  88 */     addRecipe(new ur(mod_SCP.SCP143Spade, 1), new Object[] { "A", "X", "X", Character.valueOf('X'), up.D, Character.valueOf('A'), mod_SCP.SCP143Planks });
/*  89 */     addRecipe(new ur(up.D, 4), new Object[] { "A", "A", Character.valueOf('A'), mod_SCP.SCP143Planks });
/*  90 */     addRecipe(new ur(mod_SCP.SCPItems, 1, 1), new Object[] { "BXB", "XAX", "BXB", Character.valueOf('X'), amq.as, Character.valueOf('B'), up.bH, Character.valueOf('A'), up.aK });
/*  91 */     addShapelessRecipe(new ur(mod_SCP.SCP143Planks, 4), new Object[] { mod_SCP.SCP143Log });
/*  92 */     addRecipe(new ur(amq.aB, 1), new Object[] { "XX", "XX", Character.valueOf('X'), mod_SCP.SCP143Planks });
/*  93 */     addRecipe(new ur(mod_SCP.CorrodedDoorItem, 1), new Object[] { "XX ", "XX ", "XX ", Character.valueOf('X'), mod_SCP.CorrodedIron });
/*  94 */     addRecipe(new ur(mod_SCP.SCPItems, 1, 5), new Object[] { "XBX", "BPB", "XBX", Character.valueOf('X'), mod_SCP.CorrodedIron, Character.valueOf('B'), amq.aM, Character.valueOf('P'), up.aK });
/*     */     
/*  96 */     addRecipe(new ur(mod_SCP.Pearl006, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), up.ax, Character.valueOf('B'), amq.x });
/*  97 */     addRecipe(new ur(mod_SCP.SCPItems, 1, 3), new Object[] { "XAX", "ABA", "XAX", Character.valueOf('X'), up.ax, Character.valueOf('A'), up.aF, Character.valueOf('B'), up.aK });
/*  98 */     addRecipe(new ur(mod_SCP.GrateBlock, 6), new Object[] { "AAA", "AAA", "AAA", Character.valueOf('A'), amq.bs });
/*  99 */     addRecipe(new ur(mod_SCP.Pearl966, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), up.ba, Character.valueOf('B'), up.aC });
/* 100 */     addRecipe(new ur(mod_SCP.Pearl015, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), amq.al, Character.valueOf('B'), mod_SCP.Machinery });
/* 101 */     addRecipe(new ur(mod_SCP.Pearl053, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), amq.ah, Character.valueOf('B'), amq.ag });
/* 102 */     addRecipe(new ur(mod_SCP.Pearl076, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), amq.bD, Character.valueOf('B'), amq.w });
/* 103 */     addRecipe(new ur(mod_SCP.Pearl073, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), amq.as, Character.valueOf('B'), up.aX });
/* 104 */     addRecipe(new ur(mod_SCP.Pearl997, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), up.p, Character.valueOf('B'), up.by });
/* 105 */     addRecipe(new ur(mod_SCP.Pearl027, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), mod_SCP.GrateBlock, Character.valueOf('B'), up.m });
/* 106 */     addRecipe(new ur(mod_SCP.Pearl079, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), up.bb, Character.valueOf('B'), mod_SCP.Circuit });
/* 107 */     addRecipe(new ur(mod_SCP.Pearl872, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), up.T, Character.valueOf('B'), up.D });
/* 108 */     addRecipe(new ur(mod_SCP.Pearl789J, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), up.ax, Character.valueOf('B'), amq.bf });
/* 109 */     addRecipe(new ur(mod_SCP.InfraRedGlasses, 1), new Object[] { "B B", "AAA", " Z ", Character.valueOf('B'), amq.aS, Character.valueOf('A'), up.o, Character.valueOf('Z'), up.bb });
/* 110 */     addRecipe(new ur(mod_SCP.InfraRedGlasses, 1), new Object[] { "B B", "AAA", " Z ", Character.valueOf('B'), amq.aT, Character.valueOf('A'), up.o, Character.valueOf('Z'), up.bb });
/* 111 */     addRecipe(new ur(mod_SCP.SlideDoorItem, 4), new Object[] { " O ", "APA", "XXX", Character.valueOf('X'), amq.aJ, Character.valueOf('P'), up.aB, Character.valueOf('A'), up.bb, Character.valueOf('O'), up.m });
/* 112 */     addRecipe(new ur(mod_SCP.Circuit, 2), new Object[] { "AAA", "BIB", "AAA", Character.valueOf('A'), up.o, Character.valueOf('B'), up.aC, Character.valueOf('I'), amq.aS });
/* 113 */     addRecipe(new ur(mod_SCP.Circuit, 1), new Object[] { "AAA", "BIB", "AAA", Character.valueOf('A'), up.o, Character.valueOf('B'), up.aC, Character.valueOf('I'), amq.aT });
/* 114 */     addRecipe(new ur(mod_SCP.SCPItems, 1, 2), new Object[] { "ABA", "BCB", "ABA", Character.valueOf('A'), up.aL, Character.valueOf('B'), up.bm, Character.valueOf('C'), up.aK });
/* 115 */     addRecipe(new ur(mod_SCP.ItemSCPPoster, 3), new Object[] { "AAA", "BBB", "AAA", Character.valueOf('A'), amq.A, Character.valueOf('B'), up.aK });
/* 116 */     addRecipe(new ur(mod_SCP.ItemSCPPoster, 6), new Object[] { "AAA", "BBB", "AAA", Character.valueOf('A'), mod_SCP.SCP143Planks, Character.valueOf('B'), up.aK });
/* 117 */     addRecipe(new ur(mod_SCP.Pearl151, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), new ur(up.aW, 1, 4), Character.valueOf('B'), up.ax });
/* 118 */     addRecipe(new ur(mod_SCP.Pearl472, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), up.aC, Character.valueOf('B'), mod_SCP.BloodBlock });
/* 119 */     addRecipe(new ur(mod_SCP.Pearl372, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), amq.bx, Character.valueOf('B'), amq.N });
/* 120 */     addRecipe(new ur(mod_SCP.RemoteDoorComputer, 1), new Object[] { "BXB", " Z ", "BXB", Character.valueOf('B'), up.o, Character.valueOf('X'), mod_SCP.Circuit, Character.valueOf('Z'), mod_SCP.SlideDoorItem });
/* 121 */     addRecipe(new ur(mod_SCP.Pearl273, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), up.M, Character.valueOf('B'), up.bw });
/* 122 */     addRecipe(new ur(mod_SCP.Shelf, 3), new Object[] { "AAA", Character.valueOf('A'), up.o });
/* 123 */     addRecipe(new ur(mod_SCP.SCPItems, 1, 4), new Object[] { "ABA", "BBB", "ABA", Character.valueOf('A'), up.aL, Character.valueOf('B'), up.aK });
/* 124 */     addRecipe(new ur(mod_SCP.SCP143Bucket, 1), new Object[] { "B B", " B ", Character.valueOf('B'), mod_SCP.SCP143Planks });
/* 125 */     addRecipe(new ur(mod_SCP.Pearl023, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), amq.as, Character.valueOf('B'), up.aq });
/* 126 */     addRecipe(new ur(mod_SCP.Pearl822, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), amq.aY, Character.valueOf('B'), amq.ap });
/* 127 */     addRecipe(new ur(mod_SCP.Toilet, 1), new Object[] { "  B", "BBB", " B ", Character.valueOf('B'), mod_SCP.Marble });
/* 128 */     addRecipe(new ur(mod_SCP.marbleDesk, 1), new Object[] { "BBB", "B B", Character.valueOf('B'), mod_SCP.Marble });
/* 129 */     addRecipe(new ur(mod_SCP.woodDesk, 1), new Object[] { "BBB", "B B", Character.valueOf('B'), amq.A });
/* 130 */     addRecipe(new ur(mod_SCP.stoneDesk, 1), new Object[] { "BBB", "B B", Character.valueOf('B'), amq.w });
/* 131 */     addRecipe(new ur(mod_SCP.graniteDesk, 1), new Object[] { "BBB", "B B", Character.valueOf('B'), mod_SCP.Granite });
/* 132 */     addRecipe(new ur(mod_SCP.marbleChair, 1), new Object[] { "  B", "BBB", "B B", Character.valueOf('B'), mod_SCP.Marble });
/* 133 */     addRecipe(new ur(mod_SCP.woodenChair, 1), new Object[] { "  B", "BBB", "B B", Character.valueOf('B'), amq.A });
/* 134 */     addRecipe(new ur(mod_SCP.stoneChair, 1), new Object[] { "  B", "BBB", "B B", Character.valueOf('B'), amq.w });
/* 135 */     addRecipe(new ur(mod_SCP.Pearl002, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), amq.al, Character.valueOf('B'), up.bm });
/* 136 */     addRecipe(new ur(mod_SCP.Pearl009, 1), new Object[] { "BAB", "AXA", "BAB", Character.valueOf('X'), up.bn, Character.valueOf('A'), amq.aW, Character.valueOf('B'), new ur(up.aW, 1, 1) });
/* 137 */     addRecipe(new ur(mod_SCP.Flesh, 4), new Object[] { "BBB", "BBB", "BBB", Character.valueOf('B'), up.bm });
/* 138 */     addRecipe(new ur(mod_SCP.Flesh, 4), new Object[] { "BBB", "BBB", "BBB", Character.valueOf('B'), up.aq });
/* 139 */     addRecipe(new ur(mod_SCP.Flesh, 4), new Object[] { "BBB", "BBB", "BBB", Character.valueOf('B'), up.bi });
/* 140 */     addRecipe(new ur(mod_SCP.Bone, 4), new Object[] { "BBB", "BBB", "BBB", Character.valueOf('B'), up.aX });
/* 141 */     addRecipe(new ur(mod_SCP.OakShelf, 3), new Object[] { "AAA", Character.valueOf('A'), new ur((amq)amq.bR, 1, 0) });
/* 142 */     addRecipe(new ur(mod_SCP.SpruceShelf, 3), new Object[] { "AAA", Character.valueOf('A'), new ur((amq)amq.bR, 1, 1) });
/* 143 */     addRecipe(new ur(mod_SCP.BirchShelf, 3), new Object[] { "AAA", Character.valueOf('A'), new ur((amq)amq.bR, 1, 2) });
/* 144 */     addRecipe(new ur(mod_SCP.JungleShelf, 3), new Object[] { "AAA", Character.valueOf('A'), new ur((amq)amq.bR, 1, 3) });
/*     */   }
/*     */ 
/*     */   
/*     */   void addRecipe(ur itemstack, Object[] aobj) {
/* 149 */     String s = "";
/* 150 */     int i = 0;
/* 151 */     int j = 0;
/* 152 */     int k = 0;
/*     */     
/* 154 */     if (aobj[i] instanceof String[]) {
/*     */       
/* 156 */       String[] as = (String[])aobj[i++];
/*     */       
/* 158 */       for (int l = 0; l < as.length; l++)
/*     */       {
/* 160 */         String s2 = as[l];
/* 161 */         k++;
/* 162 */         j = s2.length();
/* 163 */         s = s + s2;
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/* 168 */       while (aobj[i] instanceof String) {
/*     */         
/* 170 */         String s1 = (String)aobj[i++];
/* 171 */         k++;
/* 172 */         j = s1.length();
/* 173 */         s = s + s1;
/*     */       } 
/*     */     } 
/*     */     
/* 177 */     HashMap<Object, Object> hashmap = new HashMap<Object, Object>();
/*     */     
/* 179 */     for (; i < aobj.length; i += 2) {
/*     */       
/* 181 */       Character character = (Character)aobj[i];
/* 182 */       ur itemstack1 = null;
/*     */       
/* 184 */       if (aobj[i + 1] instanceof up) {
/*     */         
/* 186 */         itemstack1 = new ur((up)aobj[i + 1]);
/*     */       }
/* 188 */       else if (aobj[i + 1] instanceof amq) {
/*     */         
/* 190 */         itemstack1 = new ur((amq)aobj[i + 1], 1, -1);
/*     */       }
/* 192 */       else if (aobj[i + 1] instanceof ur) {
/*     */         
/* 194 */         itemstack1 = (ur)aobj[i + 1];
/*     */       } 
/*     */       
/* 197 */       hashmap.put(character, itemstack1);
/*     */     } 
/*     */     
/* 200 */     ur[] aitemstack = new ur[j * k];
/*     */     
/* 202 */     for (int i1 = 0; i1 < j * k; i1++) {
/*     */       
/* 204 */       char c = s.charAt(i1);
/*     */       
/* 206 */       if (hashmap.containsKey(Character.valueOf(c))) {
/*     */         
/* 208 */         aitemstack[i1] = ((ur)hashmap.get(Character.valueOf(c))).l();
/*     */       }
/*     */       else {
/*     */         
/* 212 */         aitemstack[i1] = null;
/*     */       } 
/*     */     } 
/*     */     
/* 216 */     this.recipes.add(new wq(j, k, aitemstack, itemstack));
/*     */   }
/*     */ 
/*     */   
/*     */   void addShapelessRecipe(ur itemstack, Object[] aobj) {
/* 221 */     ArrayList<ur> arraylist = new ArrayList();
/* 222 */     Object[] aobj1 = aobj;
/* 223 */     int i = aobj1.length;
/*     */     
/* 225 */     for (int j = 0; j < i; j++) {
/*     */       
/* 227 */       Object obj = aobj1[j];
/*     */       
/* 229 */       if (obj instanceof ur) {
/*     */         
/* 231 */         arraylist.add(((ur)obj).l());
/*     */ 
/*     */       
/*     */       }
/* 235 */       else if (obj instanceof up) {
/*     */         
/* 237 */         arraylist.add(new ur((up)obj));
/*     */ 
/*     */       
/*     */       }
/* 241 */       else if (obj instanceof amq) {
/*     */         
/* 243 */         arraylist.add(new ur((amq)obj));
/*     */       }
/*     */       else {
/*     */         
/* 247 */         throw new RuntimeException("Invalid shapeless recipy!");
/*     */       } 
/*     */     } 
/*     */     
/* 251 */     this.recipes.add(new wr(itemstack, arraylist));
/*     */   }
/*     */   
/*     */   public ur func_82787_a(ry par1InventoryCrafting, yc par2World) {
/*     */     wp var12;
/* 256 */     int var3 = 0;
/* 257 */     ur var4 = null;
/* 258 */     ur var5 = null;
/*     */     
/* 260 */     for (int var6 = 0; var6 < par1InventoryCrafting.k_(); var6++) {
/*     */       
/* 262 */       ur var7 = par1InventoryCrafting.a(var6);
/*     */       
/* 264 */       if (var7 != null) {
/*     */         
/* 266 */         if (var3 == 0)
/*     */         {
/* 268 */           var4 = var7;
/*     */         }
/*     */         
/* 271 */         if (var3 == 1)
/*     */         {
/* 273 */           var5 = var7;
/*     */         }
/*     */         
/* 276 */         var3++;
/*     */       } 
/*     */     } 
/*     */     
/* 280 */     if (var3 == 2 && var4.c == var5.c && var4.a == 1 && var5.a == 1 && up.e[var4.c].isRepairable()) {
/*     */       
/* 282 */       up var13 = up.e[var4.c];
/* 283 */       int var14 = var13.m() - var4.i();
/* 284 */       int var8 = var13.m() - var5.i();
/* 285 */       int var9 = var14 + var8 + var13.m() * 5 / 100;
/* 286 */       int var10 = var13.m() - var9;
/*     */       
/* 288 */       if (var10 < 0)
/*     */       {
/* 290 */         var10 = 0;
/*     */       }
/*     */       
/* 293 */       return new ur(var4.c, 1, var10);
/*     */     } 
/*     */ 
/*     */     
/* 297 */     Iterator<wp> var11 = this.recipes.iterator();
/*     */ 
/*     */ 
/*     */     
/*     */     do {
/* 302 */       if (!var11.hasNext())
/*     */       {
/* 304 */         return null;
/*     */       }
/*     */       
/* 307 */       var12 = var11.next();
/*     */     }
/* 309 */     while (!var12.a(par1InventoryCrafting, par2World));
/*     */     
/* 311 */     return var12.a(par1InventoryCrafting);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List getRecipeList() {
/* 317 */     return this.recipes;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/recipes/SCPRecipes000J.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */