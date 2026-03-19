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
/*     */ public class SCPDocumentItems
/*     */   extends SCPItemDocument
/*     */ {
/*     */   String scpName;
/*     */   String nickname;
/*     */   String col;
/*  24 */   String cont = "";
/*     */ 
/*     */   
/*     */   int securityValue;
/*     */ 
/*     */   
/*     */   up id;
/*     */ 
/*     */   
/*     */   int keycard;
/*     */ 
/*     */   
/*     */   int quantity;
/*     */ 
/*     */   
/*     */   public SCPDocumentItems(int i, String name, String nic, String color, int secVal, up item, int no) {
/*  40 */     super(i);
/*  41 */     this.ck = 1;
/*  42 */     this.scpName = name;
/*  43 */     this.col = color;
/*  44 */     this.securityValue = secVal;
/*  45 */     this.nickname = nic;
/*  46 */     this.id = item;
/*  47 */     this.quantity = no;
/*  48 */     e(1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ur par1ItemStack, qx par2EntityPlayer, List<String> list, boolean par4) {
/*  53 */     list.add(this.col + this.scpName);
/*  54 */     list.add("§7" + this.nickname);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean n_() {
/*  59 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ur par1ItemStack, qx par2EntityPlayer, yc par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/*  64 */     if (par3World.I)
/*     */     {
/*  66 */       return true;
/*     */     }
/*     */ 
/*     */     
/*  70 */     int var11 = par3World.a(par4, par5, par6);
/*  71 */     int metadata = ke.c((par2EntityPlayer.z * 4.0F / 360.0F) + 2.5D) & 0x3;
/*  72 */     if (var11 == amq.aV.cm) {
/*     */       
/*  74 */       par7 = 1;
/*     */     }
/*  76 */     else if (var11 != amq.bx.cm && var11 != amq.aa.cm && var11 != amq.ab.cm && (amq.p[var11] == null || !amq.p[var11].isBlockReplaceable(par3World, par4, par5, par6))) {
/*  77 */       par5++;
/*     */     }  int height;
/*  79 */     for (height = -1; height <= 3; height++) {
/*  80 */       for (int length = -2; length <= 2; length++) {
/*  81 */         for (int width = -1; width <= 3; width++)
/*     */         {
/*  83 */           par3World.d(par4 + length, par5 + height, par6 + width, amq.al.cm, 0); } 
/*     */       } 
/*  85 */     }  for (height = 0; height <= 2; height++) {
/*  86 */       for (int length = -1; length <= 1; length++) {
/*  87 */         for (int width = 0; width <= 2; width++)
/*     */         {
/*  89 */           par3World.d(par4 + length, par5 + height, par6 + width, 0, 0); } 
/*     */       } 
/*  91 */     }  if (this.securityValue == 1) {
/*  92 */       this.cont = "Safe";
/*  93 */       this.keycard = mod_SCP.KeycardSlot.cm;
/*     */     } 
/*  95 */     if (this.securityValue == 2) {
/*  96 */       this.cont = "Euclid";
/*  97 */       this.keycard = mod_SCP.KeycardSlotLv2.cm;
/*     */     } 
/*  99 */     if (this.securityValue == 3) {
/* 100 */       this.cont = "Keter";
/* 101 */       this.keycard = mod_SCP.KeycardSlotLv3.cm;
/*     */     } 
/* 103 */     SCPTileEntityShelf shelf = new SCPTileEntityShelf();
/* 104 */     if (metadata == 0) {
/* 105 */       SCPItemSlideDoor.placeDoorBlock(par3World, par4, par5, par6 + 3, 3);
/* 106 */       par3World.d(par4 - 1, par5 + 1, par6 + 2, this.keycard, 2);
/* 107 */       par3World.d(par4 + 1, par5 + 1, par6 + 4, this.keycard, 4);
/* 108 */       par3World.d(par4, par5, par6, amq.al.cm, 0);
/* 109 */       par3World.d(par4, par5 + 1, par6, mod_SCP.Shelf.cm, ke.c((par2EntityPlayer.z * 4.0F / 360.0F) + 2.5D) & 0x3);
/* 110 */       par3World.a(par4, par5 + 1, par6, (any)shelf);
/* 111 */       shelf.setItem(new ur(this.id, this.quantity));
/*     */     } 
/* 113 */     if (metadata == 1) {
/* 114 */       SCPItemSlideDoor.placeDoorBlock(par3World, par4 - 2, par5, par6 + 1, 0);
/* 115 */       par3World.d(par4 - 1, par5 + 1, par6, this.keycard, 3);
/* 116 */       par3World.d(par4 - 3, par5 + 1, par6 + 2, this.keycard, 1);
/* 117 */       par3World.d(par4 + 1, par5, par6 + 1, amq.al.cm, 0);
/* 118 */       par3World.d(par4 + 1, par5 + 1, par6 + 1, mod_SCP.Shelf.cm, ke.c((par2EntityPlayer.z * 4.0F / 360.0F) + 2.5D) & 0x3);
/* 119 */       par3World.a(par4 + 1, par5 + 1, par6 + 1, (any)shelf);
/* 120 */       shelf.setItem(new ur(this.id, this.quantity));
/*     */     } 
/* 122 */     if (metadata == 2) {
/* 123 */       SCPItemSlideDoor.placeDoorBlock(par3World, par4, par5, par6 - 1, 1);
/* 124 */       par3World.d(par4 - 1, par5 + 1, par6 - 2, this.keycard, 2);
/* 125 */       par3World.d(par4 + 1, par5 + 1, par6, this.keycard, 4);
/* 126 */       par3World.d(par4, par5, par6 + 2, amq.al.cm, 0);
/* 127 */       par3World.d(par4, par5 + 1, par6 + 2, mod_SCP.Shelf.cm, ke.c((par2EntityPlayer.z * 4.0F / 360.0F) + 2.5D) & 0x3);
/* 128 */       par3World.a(par4, par5 + 1, par6 + 2, (any)shelf);
/* 129 */       shelf.setItem(new ur(this.id, this.quantity));
/*     */     } 
/* 131 */     if (metadata == 3) {
/* 132 */       SCPItemSlideDoor.placeDoorBlock(par3World, par4 + 2, par5, par6 + 1, 2);
/* 133 */       par3World.d(par4 + 1, par5 + 1, par6 + 2, this.keycard, 1);
/* 134 */       par3World.d(par4 + 3, par5 + 1, par6, this.keycard, 3);
/* 135 */       par3World.d(par4 - 1, par5, par6 + 1, amq.al.cm, 0);
/* 136 */       par3World.d(par4 - 1, par5 + 1, par6 + 1, mod_SCP.Shelf.cm, ke.c((par2EntityPlayer.z * 4.0F / 360.0F) + 2.5D) & 0x3);
/* 137 */       par3World.a(par4 - 1, par5 + 1, par6 + 1, (any)shelf);
/* 138 */       shelf.setItem(new ur(this.id, this.quantity));
/*     */     } 
/* 140 */     par1ItemStack.a--;
/* 141 */     par2EntityPlayer.b(this.scpName + " Spawned." + " | [Type: " + this.col + this.cont + "§f]");
/*     */     
/* 143 */     return true;
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/items/SCPDocumentItems.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */