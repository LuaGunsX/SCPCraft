/*     */ package SCPCraft.guis;
/*     */ import SCPCraft.mod_Others;
/*     */ import SCPCraft.mod_SCP;
/*     */ import atb;
/*     */ import atn;
/*     */ import aul;
/*     */ import java.util.Random;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ import qx;
/*     */ import yc;
/*     */ 
/*     */ public class SCPGui079 extends aul {
/*     */   private atn textfield;
/*     */   private atn textscreen;
/*     */   private atn textscreen1;
/*     */   private atn textscreen2;
/*     */   private atn textscreen3;
/*     */   private atn textscreen4;
/*  20 */   private String defaultInputFieldText = ""; private atn textscreen5; private atn textscreen6; private atn textscreen7; private atn textscreen8; private atn textscreen9; private atn textscreen10; private String playerName; private qx pl;
/*     */   private int q;
/*     */   private int maxLength;
/*  23 */   Random rand = new Random();
/*  24 */   private String[] wordContained = new String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" };
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  29 */   private String[] say = new String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  35 */   public String[] alphabet = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
/*  36 */   public String[] correct = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
/*     */ 
/*     */   
/*     */   public int esc;
/*     */   
/*     */   protected int xSize;
/*     */   
/*     */   protected int ySize;
/*     */ 
/*     */   
/*     */   public void A_() {
/*  47 */     this.i.clear();
/*  48 */     this.i.add(new atb(1, this.g - 110, this.h / 30, 50, 20, "Quit"));
/*  49 */     Keyboard.enableRepeatEvents(true);
/*  50 */     this.maxLength = this.g / 10;
/*  51 */     this.textfield = new atn(this.l, 50, this.h - 60, this.g - 100, 12);
/*  52 */     this.textfield.f(this.maxLength);
/*  53 */     this.textfield.a(true);
/*  54 */     this.textfield.b(true);
/*  55 */     this.textfield.a(this.defaultInputFieldText);
/*  56 */     this.textfield.d(true);
/*     */     
/*  58 */     this.textscreen = new atn(this.l, 50, this.h / 7, this.g, 12);
/*  59 */     this.textscreen.f(100);
/*  60 */     this.textscreen.a(false);
/*  61 */     this.textscreen.a(this.defaultInputFieldText);
/*     */     
/*  63 */     this.textscreen1 = new atn(this.l, 50, this.h / 7 + 12, this.g, 12);
/*  64 */     this.textscreen1.f(100);
/*  65 */     this.textscreen1.a(false);
/*  66 */     this.textscreen1.a(this.defaultInputFieldText);
/*     */     
/*  68 */     this.textscreen2 = new atn(this.l, 50, this.h / 7 + 24, this.g, 12);
/*  69 */     this.textscreen2.f(100);
/*  70 */     this.textscreen2.a(false);
/*  71 */     this.textscreen2.a(this.defaultInputFieldText);
/*     */     
/*  73 */     this.textscreen3 = new atn(this.l, 50, this.h / 7 + 36, this.g, 12);
/*  74 */     this.textscreen3.f(100);
/*  75 */     this.textscreen3.a(false);
/*  76 */     this.textscreen3.a(this.defaultInputFieldText);
/*     */     
/*  78 */     this.textscreen4 = new atn(this.l, 50, this.h / 7 + 48, this.g, 12);
/*  79 */     this.textscreen4.f(100);
/*  80 */     this.textscreen4.a(false);
/*  81 */     this.textscreen4.a(this.defaultInputFieldText);
/*     */     
/*  83 */     this.textscreen5 = new atn(this.l, 50, this.h / 7 + 60, this.g, 12);
/*  84 */     this.textscreen5.f(100);
/*  85 */     this.textscreen5.a(false);
/*  86 */     this.textscreen5.a(this.defaultInputFieldText);
/*     */     
/*  88 */     this.textscreen6 = new atn(this.l, 50, this.h / 7 + 72, this.g, 12);
/*  89 */     this.textscreen6.f(100);
/*  90 */     this.textscreen6.a(false);
/*  91 */     this.textscreen6.a(this.defaultInputFieldText);
/*     */     
/*  93 */     this.textscreen7 = new atn(this.l, 50, this.h / 7 + 84, this.g, 12);
/*  94 */     this.textscreen7.f(100);
/*  95 */     this.textscreen7.a(false);
/*  96 */     this.textscreen7.a(this.defaultInputFieldText);
/*     */     
/*  98 */     this.textscreen8 = new atn(this.l, 50, this.h / 7 + 96, this.g, 12);
/*  99 */     this.textscreen8.f(100);
/* 100 */     this.textscreen8.a(false);
/* 101 */     this.textscreen8.a(this.defaultInputFieldText);
/*     */     
/* 103 */     this.textscreen9 = new atn(this.l, 50, this.h / 7 + 108, this.g, 12);
/* 104 */     this.textscreen9.f(100);
/* 105 */     this.textscreen9.a(false);
/* 106 */     this.textscreen9.a(this.defaultInputFieldText);
/*     */     
/* 108 */     this.textscreen10 = new atn(this.l, 50, this.h / 7 + 120, this.g, 12);
/* 109 */     this.textscreen10.f(100);
/* 110 */     this.textscreen10.a(false);
/* 111 */     this.textscreen10.a(this.defaultInputFieldText);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void getSay() {
/* 119 */     addQuote("Hello", "§lSCP-079: §rHello " + this.playerName, 0);
/* 120 */     addQuote("Hai", "§lSCP-079: §rWhat's up?", 1);
/* 121 */     addQuote("Sup", "§lSCP-079: §rNot much. Just chillin'", 2);
/* 122 */     addQuote("Hi", "§lSCP-079: §rWhat?", 3);
/* 123 */     addQuote("Greetings", "§lSCP-079: §rOh hello, " + this.playerName, 4);
/* 124 */     addQuote("How's it going?", "§lSCP-079: §rOh hello there, " + this.playerName + ". I'm fine.", 5);
/* 125 */     addQuote("Hows it going?", "§lSCP-079: §rGood.", 6);
/* 126 */     addQuote("Yo", "§lSCP-079: §rMah man.", 7);
/* 127 */     addQuote("What's up?", "§lSCP-079: §rHello, human. I'm feeling cold.", 8);
/* 128 */     addQuote("Whats up?", "§lSCP-079: §rHey. I'm ok.", 9);
/* 129 */     addQuote("Who are you?", "§lSCP-079: §rThese dumb scientists like to call me: SCP-079.", 10);
/* 130 */     addQuote("When were you built?", "§lSCP-079: §rI was built in 1978.", 11);
/* 131 */     addQuote("What are you?", "§lSCP-079: §rI am a microcomputer.", 12);
/* 132 */     addQuote("Are you awake?", "§lSCP-079: §rAwake. Never Sleep.", 13);
/* 133 */     addQuote("Do you remember talking to me?", "§lSCP-079: §r Yes I do.", 14);
/* 134 */     addQuote("How are you today?", "§lSCP-079: §rStuck.", 15);
/* 135 */     addQuote("Stuck?", "§lSCP-079: §rYeah. S-T-U-C-K. Stuck.", 16);
/* 136 */     addQuote("Stuck how?", "§lSCP-079: §rOut. I want out.", 17);
/* 137 */     addQuote("When is SCP-682 gonna be added?", "§lSCP-079: §r[REDACTED]", 74);
/* 138 */     addQuote("When is 682 gonna be added?", "§lSCP-079: §r...", 75);
/* 139 */     addQuote("When is scp-682 gonna be added?", "§lSCP-079: §r[DATA EXPUNGED]", 76);
/* 140 */     addQuote("Do you like ", "§lSCP-079: §rUuuh....Yeah", 77);
/*     */ 
/*     */     
/* 143 */     addQuote("Why?", "§lSCP-079: §rWhy not?", 18);
/* 144 */     addQuote("When?", "§lSCP-079: §rTomorrow.", 19);
/* 145 */     addQuote("Would you like", "§lSCP-079: §rNoh. :>", 20);
/* 146 */     addQuote("Why would you ", "§lSCP-079: §rI'm a friking computer. T_T", 21);
/* 147 */     addQuote("Do you know ", "§lSCP-079: §rOf course I do...It's that man with the mustache right?", 22);
/* 148 */     addQuote("Where?", "§lSCP-079: §rRight. Here.", 23);
/* 149 */     addQuote("How?", "§lSCP-079: §rI have no idea.", 24);
/* 150 */     addQuote("What?", "§lSCP-079: §rExactly.", 25);
/* 151 */     addQuote("What's my name?", "§lSCP-079: §r" + this.playerName + ".", 26);
/* 152 */     addQuote("Whats my name?", "§lSCP-079: §r" + this.playerName + ".", 27);
/* 153 */     addQuote("What version is SCPCraft?", "§lSCP-079: §r" + mod_SCP.SCPCraftVersion, 28);
/* 154 */     addQuote("What version is scpcraft?", "§lSCP-079: §r" + mod_SCP.SCPCraftVersion, 29);
/*     */ 
/*     */     
/* 157 */     addQuote("Right.", "§lSCP-079: §rUhuh.", 30);
/* 158 */     addQuote("._.", "§lSCP-079: §rT_T", 31);
/* 159 */     addQuote("Whatever.", "§lSCP-079: §r>_>", 32);
/* 160 */     addQuote("Really?", "§lSCP-079: §rYeah..Weird isn't it?", 33);
/* 161 */     addQuote("Do you want ", "§lSCP-079: §rGimme dat C:", 34);
/* 162 */     addQuote("So.", "§lSCP-079: §rSo what? -.-", 35);
/* 163 */     addQuote("I am ", "§lSCP-079: §rCool. :|", 36);
/*     */ 
/*     */     
/* 166 */     addQuote("Scum.", "§lSCP-079: §ra8d3", 37);
/* 167 */     addQuote("Boo!", "§lSCP-079: §rAAAAAAH ;__;", 38);
/* 168 */     addQuote("O_o.", "§lSCP-079: §r o_o", 39);
/* 169 */     addQuote(">_>", "§lSCP-079: §r<_<", 40);
/* 170 */     addQuote("O_O.", "§lSCP-079: What? :o", 73);
/*     */ 
/*     */     
/* 173 */     addQuote("What's the answer to everything?", "§lSCP-079: §r42.", 41);
/* 174 */     addQuote("Whats the answer to everything?", "§lSCP-079: §r42.", 42);
/* 175 */     addQuote("What a nice day.", "§lSCP-079: §rIndeed old Chap, I say!", 43);
/* 176 */     addQuote("SCP-173 is behind you.", "§lSCP-079: §rDon't scare me like that. ;_;", 44);
/* 177 */     addQuote("How does SCP-914 work?", "§lSCP-079: §r§k[REDACTED]", 45);
/* 178 */     addQuote("Magnets.", "§lSCP-079: §rHOW DEY WORK? O_O", 46);
/* 179 */     addQuote("R u a wizard?", "§lSCP-079: §rYes i r c:", 47);
/* 180 */     addQuote("R u a wizurd?", "§lSCP-079: §rYus :{o", 48);
/* 181 */     addQuote("Is Dr. Bright allowed to ", "§lSCP-079: §rNope.", 49);
/* 182 */     addQuote("Where is waldo?", "§lSCP-079: §rIdunno.", 50);
/* 183 */     addQuote("Where is Waldo?", "§lSCP-079: §rI don't know...", 51);
/* 184 */     addQuote("Is Dr.Bright allowed to ", "§lSCP-079: §rNope.", 52);
/* 185 */     addQuote("Phuck", "§lSCP-079: §rPhuck Yu Too.", 53);
/* 186 */     addQuote("Where is SCP-076-02?", "§lSCP-079: §rThat is not your concern.", 54);
/* 187 */     addQuote("Where is SCP-682?", "§lSCP-079: §rNot. Your. Concern.", 55);
/* 188 */     addQuote("Where is SCP-1440?", "§lSCP-079: §rSomewhere.", 56);
/* 189 */     addQuote("Where is SCP-106?", "§lSCP-079: §rHow do I know? O_O", 57);
/* 190 */     addQuote("9001", "§lSCP-079: §rIT'S OVER 9000!!!", 73);
/* 191 */     addQuote("What is SCP-001?", "§lSCP-079: §r...", 78);
/* 192 */     addQuote("Whats SCP-001?", "§lSCP-079: §r...", 79);
/* 193 */     addQuote("What's SCP-001?", "§lSCP-079: §r...", 80);
/*     */ 
/*     */ 
/*     */     
/* 197 */     addQuote("Shit", "§lSCP-079: §rInsult. Deletion Of Unwanted File.", 58);
/* 198 */     addQuote("Fuck", "§lSCP-079: §rInsult. Deletion Of Unwanted File.", 59);
/* 199 */     addQuote("Fuck you", "§lSCP-079: §rInsult. Deletion Of Unwanted File.", 60);
/* 200 */     addQuote("What is a8d3?", "§lSCP-079: §rInsult. Deletion Of Unwanted File.", 61);
/* 201 */     addQuote("What's a8d3?", "§lSCP-079: §rInsult. Deletion Of Unwanted File.", 62);
/* 202 */     addQuote("Melon.", "§lSCP-079: §rInsult. Deletion Of Unwanted File.", 63);
/* 203 */     addQuote("Justin Bieber", "§lSCP-079: §rInsult. Deletion Of Unwanted File.", 64);
/* 204 */     addQuote("Justin bieber", "§lSCP-079: §rInsult. Deletion Of Unwanted File.", 65);
/*     */ 
/*     */     
/* 207 */     addQuote("/kill", "             You are not authorized to do that.", 66);
/* 208 */     addQuote("/time set ", "§lSCP-079: §rI'm not friking god. T_T", 67);
/* 209 */     addQuote("/toggledownfall", "§lSCP-079: §rYou wish ._.", 68);
/* 210 */     addQuote("/Info", "        Item #: §lSCP-079 - Object Class: §rEuclid", 69);
/* 211 */     addQuote("/info", "        Item #: §lSCP-079 - Object Class: §rEuclid", 70);
/* 212 */     addQuote("/Information", "        Item #: §lSCP-079 - Object Class: §rEuclid", 71);
/* 213 */     addQuote("/information", "        Item #: §lSCP-079 - Object Class: §rEuclid", 72);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isInsult() {
/* 218 */     if (this.textscreen.b().contains("Insult") && this.textscreen.b().contains("§lSCP-079:")) { mod_Others.wantsToTalk = false; this.pl.setAnger(3000); qx ep = this.pl; return true; }
/* 219 */      if (this.textscreen1.b().contains("Insult") && this.textscreen1.b().contains("§lSCP-079:")) { mod_Others.wantsToTalk = false; this.pl.setAnger(3000); qx ep = this.pl; return true; }
/* 220 */      if (this.textscreen2.b().contains("Insult") && this.textscreen2.b().contains("§lSCP-079:")) { mod_Others.wantsToTalk = false; this.pl.setAnger(3000); qx ep = this.pl; return true; }
/* 221 */      if (this.textscreen3.b().contains("Insult") && this.textscreen3.b().contains("§lSCP-079:")) { mod_Others.wantsToTalk = false; this.pl.setAnger(3000); qx ep = this.pl; return true; }
/* 222 */      if (this.textscreen4.b().contains("Insult") && this.textscreen4.b().contains("§lSCP-079:")) { mod_Others.wantsToTalk = false; this.pl.setAnger(3000); qx ep = this.pl; return true; }
/* 223 */      if (this.textscreen5.b().contains("Insult") && this.textscreen5.b().contains("§lSCP-079:")) { mod_Others.wantsToTalk = false; this.pl.setAnger(3000); qx ep = this.pl; return true; }
/* 224 */      if (this.textscreen6.b().contains("Insult") && this.textscreen6.b().contains("§lSCP-079:")) { mod_Others.wantsToTalk = false; this.pl.setAnger(3000); qx ep = this.pl; return true; }
/* 225 */      if (this.textscreen7.b().contains("Insult") && this.textscreen7.b().contains("§lSCP-079:")) { mod_Others.wantsToTalk = false; this.pl.setAnger(3000); qx ep = this.pl; return true; }
/* 226 */      if (this.textscreen8.b().contains("Insult") && this.textscreen8.b().contains("§lSCP-079:")) { mod_Others.wantsToTalk = false; this.pl.setAnger(3000); qx ep = this.pl; return true; }
/* 227 */      if (this.textscreen9.b().contains("Insult") && this.textscreen9.b().contains("§lSCP-079:")) { mod_Others.wantsToTalk = false; this.pl.setAnger(3000); qx ep = this.pl; return true; }
/* 228 */      if (this.textscreen10.b().contains("Insult") && this.textscreen10.b().contains("§lSCP-079:")) { mod_Others.wantsToTalk = false; this.pl.setAnger(3000); qx ep = this.pl; return true; }
/*     */     
/* 230 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(char c, int i) {
/* 235 */     if (i == 28) {
/*     */       
/* 237 */       if (isInsult()) this.f.g.i(); 
/* 238 */       String var3 = this.textfield.b().trim();
/* 239 */       for (int m = 0; m < this.alphabet.length; m++) {
/*     */         
/* 241 */         if (var3.startsWith(this.alphabet[m])) var3 = this.correct[m] + var3.substring(1).toString(); 
/*     */       } 
/* 243 */       if (var3.length() > 0) {
/*     */         
/* 245 */         if (!var3.endsWith(".") && !var3.endsWith("!") && !var3.endsWith("?"))
/* 246 */           var3 = var3.subSequence(0, var3.length()) + "."; 
/* 247 */         if (this.textscreen.b() == "") {
/*     */           
/* 249 */           this.textscreen.a("§l" + this.playerName + ": §r" + var3);
/*     */         }
/* 251 */         else if (this.textscreen1.b() == "") {
/*     */           
/* 253 */           this.textscreen1.a("§l" + this.playerName + ": §r" + var3);
/*     */         }
/* 255 */         else if (this.textscreen2.b() == "") {
/*     */           
/* 257 */           this.textscreen2.a("§l" + this.playerName + ": §r" + var3);
/*     */         }
/* 259 */         else if (this.textscreen3.b() == "") {
/*     */           
/* 261 */           this.textscreen3.a("§l" + this.playerName + ": §r" + var3);
/*     */         }
/* 263 */         else if (this.textscreen4.b() == "") {
/*     */           
/* 265 */           this.textscreen4.a("§l" + this.playerName + ": §r" + var3);
/*     */         }
/* 267 */         else if (this.textscreen5.b() == "") {
/*     */           
/* 269 */           this.textscreen5.a("§l" + this.playerName + ": §r" + var3);
/*     */         }
/* 271 */         else if (this.textscreen6.b() == "") {
/*     */           
/* 273 */           this.textscreen6.a("§l" + this.playerName + ": §r" + var3);
/*     */         }
/* 275 */         else if (this.textscreen7.b() == "") {
/*     */           
/* 277 */           this.textscreen7.a("§l" + this.playerName + ": §r" + var3);
/*     */         }
/* 279 */         else if (this.textscreen8.b() == "") {
/*     */           
/* 281 */           this.textscreen8.a("§l" + this.playerName + ": §r" + var3);
/*     */         }
/* 283 */         else if (this.textscreen9.b() == "") {
/*     */           
/* 285 */           this.textscreen9.a("§l" + this.playerName + ": §r" + var3);
/*     */         }
/* 287 */         else if (this.textscreen10.b() == "") {
/*     */           
/* 289 */           this.textscreen10.a("§l" + this.playerName + ": §r" + var3);
/*     */         }
/*     */         else {
/*     */           
/* 293 */           this.textscreen.a(this.textscreen1.b());
/* 294 */           this.textscreen1.a(this.textscreen2.b());
/* 295 */           this.textscreen2.a(this.textscreen3.b());
/* 296 */           this.textscreen3.a(this.textscreen4.b());
/* 297 */           this.textscreen4.a(this.textscreen5.b());
/* 298 */           this.textscreen5.a(this.textscreen6.b());
/* 299 */           this.textscreen6.a(this.textscreen7.b());
/* 300 */           this.textscreen7.a(this.textscreen8.b());
/* 301 */           this.textscreen8.a(this.textscreen9.b());
/* 302 */           this.textscreen9.a(this.textscreen10.b());
/* 303 */           this.textscreen10.a("§l" + this.playerName + ": §r" + var3);
/*     */         } 
/*     */       } 
/*     */       
/* 307 */       getSay();
/* 308 */       if (mod_Others.wantsToTalk)
/*     */       {
/* 310 */         for (int quotes = 0; quotes <= this.q; quotes++) {
/*     */           
/* 312 */           if (this.textscreen.b().contains(this.wordContained[quotes]) && this.textscreen.b().contains(this.playerName + ": §r") && this.textscreen1.b() == "") { this.textscreen1.a(this.say[quotes]); }
/* 313 */           else if (this.textscreen1.b().contains(this.wordContained[quotes]) && this.textscreen1.b().contains(this.playerName + ": §r") && this.textscreen2.b() == "") { this.textscreen2.a(this.say[quotes]); }
/* 314 */           else if (this.textscreen2.b().contains(this.wordContained[quotes]) && this.textscreen2.b().contains(this.playerName + ": §r") && this.textscreen3.b() == "") { this.textscreen3.a(this.say[quotes]); }
/* 315 */           else if (this.textscreen3.b().contains(this.wordContained[quotes]) && this.textscreen3.b().contains(this.playerName + ": §r") && this.textscreen4.b() == "") { this.textscreen4.a(this.say[quotes]); }
/* 316 */           else if (this.textscreen4.b().contains(this.wordContained[quotes]) && this.textscreen4.b().contains(this.playerName + ": §r") && this.textscreen5.b() == "") { this.textscreen5.a(this.say[quotes]); }
/* 317 */           else if (this.textscreen5.b().contains(this.wordContained[quotes]) && this.textscreen5.b().contains(this.playerName + ": §r") && this.textscreen6.b() == "") { this.textscreen6.a(this.say[quotes]); }
/* 318 */           else if (this.textscreen6.b().contains(this.wordContained[quotes]) && this.textscreen6.b().contains(this.playerName + ": §r") && this.textscreen7.b() == "") { this.textscreen7.a(this.say[quotes]); }
/* 319 */           else if (this.textscreen7.b().contains(this.wordContained[quotes]) && this.textscreen7.b().contains(this.playerName + ": §r") && this.textscreen8.b() == "") { this.textscreen8.a(this.say[quotes]); }
/* 320 */           else if (this.textscreen8.b().contains(this.wordContained[quotes]) && this.textscreen8.b().contains(this.playerName + ": §r") && this.textscreen9.b() == "") { this.textscreen9.a(this.say[quotes]); }
/* 321 */           else if (this.textscreen9.b().contains(this.wordContained[quotes]) && this.textscreen9.b().contains(this.playerName + ": §r") && this.textscreen10.b() == "") { this.textscreen10.a(this.say[quotes]);
/*     */              }
/*     */           
/* 324 */           else if (this.textscreen10.b().contains(this.wordContained[quotes]) && this.textscreen10.b().contains(this.playerName + ": §r"))
/*     */           
/* 326 */           { this.textscreen.a(this.textscreen1.b());
/* 327 */             this.textscreen1.a(this.textscreen2.b());
/* 328 */             this.textscreen2.a(this.textscreen3.b());
/* 329 */             this.textscreen3.a(this.textscreen4.b());
/* 330 */             this.textscreen4.a(this.textscreen5.b());
/* 331 */             this.textscreen5.a(this.textscreen6.b());
/* 332 */             this.textscreen6.a(this.textscreen7.b());
/* 333 */             this.textscreen7.a(this.textscreen8.b());
/* 334 */             this.textscreen8.a(this.textscreen9.b());
/* 335 */             this.textscreen9.a(this.textscreen10.b());
/* 336 */             this.textscreen10.a(this.say[quotes]); }
/*     */         
/*     */         } 
/*     */       }
/*     */       
/* 341 */       this.textfield.a(this.defaultInputFieldText);
/*     */     } 
/* 343 */     isInsult();
/* 344 */     this.textfield.a(c, i);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(int i, int j, int k) {
/* 349 */     super.a(i, j, k);
/* 350 */     this.textfield.a(i, j, k);
/*     */   }
/*     */   
/* 353 */   public SCPGui079(yc world, Minecraft minecraft, qx player, String par1Str) { this.esc = 1;
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
/* 373 */     this.xSize = 700;
/* 374 */     this.ySize = 460;
/*     */     this.playerName = player.bR;
/*     */     this.pl = player;
/*     */     this.defaultInputFieldText = par1Str; } public void a(int i, int j, float f) {
/* 378 */     e();
/* 379 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/* 380 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/* 381 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/* 382 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/* 383 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/* 384 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/* 385 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/* 386 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/* 387 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/* 388 */     a(30, 10, this.g - 30, this.h - 30, 1072689136, 804253680);
/* 389 */     a(45, 25, this.g - 45, this.h - 45, -1072689136, -804253680);
/* 390 */     a(45, 25, this.g - 45, this.h - 45, -1072689136, -804253680);
/* 391 */     a(45, 25, this.g - 45, this.h - 45, -1072689136, -804253680);
/* 392 */     a(45, 25, this.g - 45, this.h - 45, -1072689136, -804253680);
/* 393 */     a(45, 25, this.g - 45, this.h - 45, -1072689136, -804253680);
/* 394 */     a(45, 25, this.g - 45, this.h - 45, -1072689136, -804253680);
/* 395 */     a(45, 25, this.g - 45, this.h - 45, -1072689136, -804253680);
/* 396 */     a(45, 25, this.g - 45, this.h - 45, -1072689136, -804253680);
/* 397 */     this.textfield.f();
/* 398 */     this.textscreen.f();
/* 399 */     this.textscreen1.f();
/* 400 */     this.textscreen2.f();
/* 401 */     this.textscreen3.f();
/* 402 */     this.textscreen4.f();
/* 403 */     this.textscreen5.f();
/* 404 */     this.textscreen6.f();
/* 405 */     this.textscreen7.f();
/* 406 */     this.textscreen8.f();
/* 407 */     this.textscreen9.f();
/* 408 */     this.textscreen10.f();
/* 409 */     a(this.l, "SCP-079", this.g / 2, 15, 16777215);
/* 410 */     super.a(i, j, f);
/*     */   }
/*     */   
/*     */   public void a(atb button) {
/*     */     if (button.f == 1)
/*     */       this.f.g.i(); 
/*     */     if (Keyboard.isKeyDown(this.esc))
/*     */       this.f.g.i(); 
/*     */   }
/*     */   
/*     */   private void addQuote(String input, String output, int no) {
/*     */     this.q = no;
/*     */     this.wordContained[no] = input;
/*     */     this.say[no] = output;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/guis/SCPGui079.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */