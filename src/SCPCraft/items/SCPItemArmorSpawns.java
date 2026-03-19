/*     */ package SCPCraft.items;
/*     */ 
/*     */ import SCPCraft.mod_SCP;
/*     */ import SCPCraft.tileentities.SCPTileEntityShelf;
/*     */ import amq;
/*     */ import any;
/*     */ import java.util.List;
/*     */ import ke;
/*     */ import qx;
/*     */ import up;
/*     */ import ur;
/*     */ import yc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCPItemArmorSpawns
/*     */   extends SCPItemDocument
/*     */ {
/*     */   String scpName;
/*     */   String nickname;
/*     */   String col;
/*  24 */   String cont = "";
/*     */   
/*     */   int securityValue;
/*     */   
/*     */   up helmet;
/*     */   
/*     */   up chest;
/*     */   
/*     */   up pants;
/*     */   
/*     */   up boots;
/*     */   
/*     */   int keycard;
/*     */   int quantity;
/*     */   
/*     */   public SCPItemArmorSpawns(int i, String name, String nic, String color, int secVal, up head, up body, up legs, up feet, int no) {
/*  40 */     super(i);
/*  41 */     this.ck = 1;
/*  42 */     this.scpName = name;
/*  43 */     this.col = color;
/*  44 */     this.securityValue = secVal;
/*  45 */     this.nickname = nic;
/*  46 */     this.helmet = head;
/*  47 */     this.chest = body;
/*  48 */     this.pants = legs;
/*  49 */     this.boots = feet;
/*  50 */     this.quantity = no;
/*  51 */     e(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  56 */     list.add(this.col + this.scpName);
/*  57 */     list.add("§7" + this.nickname);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean n_() {
/*  62 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/*  67 */     if (par3World.I)
/*     */     {
/*  69 */       return true;
/*     */     }
/*     */ 
/*     */     
/*  73 */     int var11 = par3World.a(par4, par5, par6);
/*  74 */     int metadata = ke.c((par2EntityPlayer.z * 4.0F / 360.0F) + 2.5D) & 0x3;
/*  75 */     if (var11 == amq.aV.cm) {
/*     */       
/*  77 */       par7 = 1;
/*     */     }
/*  79 */     else if (var11 != amq.bx.cm && var11 != amq.aa.cm && var11 != amq.ab.cm && (amq.p[var11] == null || !amq.p[var11].isBlockReplaceable(par3World, par4, par5, par6))) {
/*  80 */       par5++;
/*     */     }  int height;
/*  82 */     for (height = -1; height <= 4; height++) {
/*  83 */       for (int length = -2; length <= 2; length++) {
/*  84 */         for (int width = -1; width <= 3; width++)
/*     */         {
/*  86 */           par3World.d(par4 + length, par5 + height, par6 + width, amq.al.cm, 0); } 
/*     */       } 
/*  88 */     }  for (height = 0; height <= 3; height++) {
/*  89 */       for (int length = -1; length <= 1; length++) {
/*  90 */         for (int width = 0; width <= 2; width++)
/*     */         {
/*  92 */           par3World.d(par4 + length, par5 + height, par6 + width, 0, 0); } 
/*     */       } 
/*  94 */     }  if (this.securityValue == 1) {
/*  95 */       this.cont = "Safe";
/*  96 */       this.keycard = mod_SCP.KeycardSlot.cm;
/*     */     } 
/*  98 */     if (this.securityValue == 2) {
/*  99 */       this.cont = "Euclid";
/* 100 */       this.keycard = mod_SCP.KeycardSlotLv2.cm;
/*     */     } 
/* 102 */     if (this.securityValue == 3) {
/* 103 */       this.cont = "Keter";
/* 104 */       this.keycard = mod_SCP.KeycardSlotLv3.cm;
/*     */     } 
/* 106 */     SCPTileEntityShelf shelf = new SCPTileEntityShelf();
/* 107 */     SCPTileEntityShelf shelf1 = new SCPTileEntityShelf();
/* 108 */     SCPTileEntityShelf shelf2 = new SCPTileEntityShelf();
/* 109 */     SCPTileEntityShelf shelf3 = new SCPTileEntityShelf();
/* 110 */     if (metadata == 0) {
/* 111 */       SCPItemSlideDoor.placeDoorBlock(par3World, par4, par5, par6 + 3, 3);
/* 112 */       par3World.d(par4 - 1, par5 + 1, par6 + 2, this.keycard, 2);
/* 113 */       par3World.d(par4 + 1, par5 + 1, par6 + 4, this.keycard, 4);
/* 114 */       par3World.d(par4, par5, par6, mod_SCP.Shelf.cm, ke.c((par2EntityPlayer.z * 4.0F / 360.0F) + 2.5D) & 0x3);
/* 115 */       par3World.a(par4, par5, par6, (any)shelf);
/* 116 */       shelf.setItem(new ur(this.boots, this.quantity));
/*     */       
/* 118 */       par3World.d(par4, par5 + 1, par6, mod_SCP.Shelf.cm, ke.c((par2EntityPlayer.z * 4.0F / 360.0F) + 2.5D) & 0x3);
/* 119 */       par3World.a(par4, par5 + 1, par6, (any)shelf1);
/* 120 */       shelf1.setItem(new ur(this.pants, this.quantity));
/*     */       
/* 122 */       par3World.d(par4, par5 + 2, par6, mod_SCP.Shelf.cm, ke.c((par2EntityPlayer.z * 4.0F / 360.0F) + 2.5D) & 0x3);
/* 123 */       par3World.a(par4, par5 + 2, par6, (any)shelf2);
/* 124 */       shelf2.setItem(new ur(this.chest, this.quantity));
/*     */       
/* 126 */       par3World.d(par4, par5 + 3, par6, mod_SCP.Shelf.cm, ke.c((par2EntityPlayer.z * 4.0F / 360.0F) + 2.5D) & 0x3);
/* 127 */       par3World.a(par4, par5 + 3, par6, (any)shelf3);
/* 128 */       shelf3.setItem(new ur(this.helmet, this.quantity));
/*     */     } 
/* 130 */     if (metadata == 1) {
/* 131 */       SCPItemSlideDoor.placeDoorBlock(par3World, par4 - 2, par5, par6 + 1, 0);
/* 132 */       par3World.d(par4 - 1, par5 + 1, par6, this.keycard, 3);
/* 133 */       par3World.d(par4 - 3, par5 + 1, par6 + 2, this.keycard, 1);
/* 134 */       par3World.d(par4 + 1, par5, par6 + 1, mod_SCP.Shelf.cm, ke.c((par2EntityPlayer.z * 4.0F / 360.0F) + 2.5D) & 0x3);
/* 135 */       par3World.a(par4 + 1, par5, par6 + 1, (any)shelf);
/* 136 */       shelf.setItem(new ur(this.boots, this.quantity));
/*     */       
/* 138 */       par3World.d(par4 + 1, par5 + 1, par6 + 1, mod_SCP.Shelf.cm, ke.c((par2EntityPlayer.z * 4.0F / 360.0F) + 2.5D) & 0x3);
/* 139 */       par3World.a(par4 + 1, par5 + 1, par6 + 1, (any)shelf1);
/* 140 */       shelf1.setItem(new ur(this.pants, this.quantity));
/*     */       
/* 142 */       par3World.d(par4 + 1, par5 + 2, par6 + 1, mod_SCP.Shelf.cm, ke.c((par2EntityPlayer.z * 4.0F / 360.0F) + 2.5D) & 0x3);
/* 143 */       par3World.a(par4 + 1, par5 + 2, par6 + 1, (any)shelf2);
/* 144 */       shelf2.setItem(new ur(this.chest, this.quantity));
/*     */       
/* 146 */       par3World.d(par4 + 1, par5 + 3, par6 + 1, mod_SCP.Shelf.cm, ke.c((par2EntityPlayer.z * 4.0F / 360.0F) + 2.5D) & 0x3);
/* 147 */       par3World.a(par4 + 1, par5 + 3, par6 + 1, (any)shelf3);
/* 148 */       shelf3.setItem(new ur(this.helmet, this.quantity));
/*     */     } 
/* 150 */     if (metadata == 2) {
/* 151 */       SCPItemSlideDoor.placeDoorBlock(par3World, par4, par5, par6 - 1, 1);
/* 152 */       par3World.d(par4 - 1, par5 + 1, par6 - 2, this.keycard, 2);
/* 153 */       par3World.d(par4 + 1, par5 + 1, par6, this.keycard, 4);
/* 154 */       par3World.d(par4, par5, par6 + 2, mod_SCP.Shelf.cm, ke.c((par2EntityPlayer.z * 4.0F / 360.0F) + 2.5D) & 0x3);
/* 155 */       par3World.a(par4, par5, par6 + 2, (any)shelf);
/* 156 */       shelf.setItem(new ur(this.boots, this.quantity));
/*     */       
/* 158 */       par3World.d(par4, par5 + 1, par6 + 2, mod_SCP.Shelf.cm, ke.c((par2EntityPlayer.z * 4.0F / 360.0F) + 2.5D) & 0x3);
/* 159 */       par3World.a(par4, par5 + 1, par6 + 2, (any)shelf1);
/* 160 */       shelf1.setItem(new ur(this.pants, this.quantity));
/*     */       
/* 162 */       par3World.d(par4, par5 + 2, par6 + 2, mod_SCP.Shelf.cm, ke.c((par2EntityPlayer.z * 4.0F / 360.0F) + 2.5D) & 0x3);
/* 163 */       par3World.a(par4, par5 + 2, par6 + 2, (any)shelf2);
/* 164 */       shelf2.setItem(new ur(this.chest, this.quantity));
/*     */       
/* 166 */       par3World.d(par4, par5 + 3, par6 + 2, mod_SCP.Shelf.cm, ke.c((par2EntityPlayer.z * 4.0F / 360.0F) + 2.5D) & 0x3);
/* 167 */       par3World.a(par4, par5 + 3, par6 + 2, (any)shelf3);
/* 168 */       shelf3.setItem(new ur(this.helmet, this.quantity));
/*     */     } 
/* 170 */     if (metadata == 3) {
/* 171 */       SCPItemSlideDoor.placeDoorBlock(par3World, par4 + 2, par5, par6 + 1, 2);
/* 172 */       par3World.d(par4 + 1, par5 + 1, par6 + 2, this.keycard, 1);
/* 173 */       par3World.d(par4 + 3, par5 + 1, par6, this.keycard, 3);
/* 174 */       par3World.d(par4 - 1, par5, par6 + 1, mod_SCP.Shelf.cm, ke.c((par2EntityPlayer.z * 4.0F / 360.0F) + 2.5D) & 0x3);
/* 175 */       par3World.a(par4 - 1, par5, par6 + 1, (any)shelf);
/* 176 */       shelf.setItem(new ur(this.boots, this.quantity));
/*     */       
/* 178 */       par3World.d(par4 - 1, par5 + 1, par6 + 1, mod_SCP.Shelf.cm, ke.c((par2EntityPlayer.z * 4.0F / 360.0F) + 2.5D) & 0x3);
/* 179 */       par3World.a(par4 - 1, par5 + 1, par6 + 1, (any)shelf1);
/* 180 */       shelf1.setItem(new ur(this.pants, this.quantity));
/*     */       
/* 182 */       par3World.d(par4 - 1, par5 + 2, par6 + 1, mod_SCP.Shelf.cm, ke.c((par2EntityPlayer.z * 4.0F / 360.0F) + 2.5D) & 0x3);
/* 183 */       par3World.a(par4 - 1, par5 + 2, par6 + 1, (any)shelf2);
/* 184 */       shelf2.setItem(new ur(this.chest, this.quantity));
/*     */       
/* 186 */       par3World.d(par4 - 1, par5 + 3, par6 + 1, mod_SCP.Shelf.cm, ke.c((par2EntityPlayer.z * 4.0F / 360.0F) + 2.5D) & 0x3);
/* 187 */       par3World.a(par4 - 1, par5 + 3, par6 + 1, (any)shelf3);
/* 188 */       shelf3.setItem(new ur(this.helmet, this.quantity));
/*     */     } 
/* 190 */     par1ItemStack.a--;
/* 191 */     par2EntityPlayer.b(this.scpName + " Spawned." + " | [Type: " + this.col + this.cont + "§f]");
/*     */     
/* 193 */     return true;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPItemArmorSpawns.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */