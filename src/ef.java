/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.EOFException;
/*     */ import java.io.IOException;
/*     */ import java.net.Socket;
/*     */ import java.util.HashMap;
/*     */ import java.util.HashSet;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ef
/*     */ {
/*  20 */   public static jz l = new jz();
/*     */ 
/*     */   
/*  23 */   private static Map a = new HashMap<Object, Object>();
/*     */ 
/*     */   
/*  26 */   private static Set b = new HashSet();
/*     */ 
/*     */   
/*  29 */   private static Set c = new HashSet();
/*     */ 
/*     */   
/*  32 */   public final long m = System.currentTimeMillis();
/*     */ 
/*     */   
/*     */   public static long n;
/*     */ 
/*     */   
/*     */   public static long o;
/*     */ 
/*     */   
/*     */   public static long p;
/*     */ 
/*     */   
/*     */   public static long q;
/*     */ 
/*     */   
/*     */   public boolean r = false;
/*     */ 
/*     */   
/*     */   static void a(int par0, boolean par1, boolean par2, Class<?> par3Class) {
/*  51 */     if (l.b(par0))
/*     */     {
/*  53 */       throw new IllegalArgumentException("Duplicate packet id:" + par0);
/*     */     }
/*  55 */     if (a.containsKey(par3Class))
/*     */     {
/*  57 */       throw new IllegalArgumentException("Duplicate packet class:" + par3Class);
/*     */     }
/*     */ 
/*     */     
/*  61 */     l.a(par0, par3Class);
/*  62 */     a.put(par3Class, Integer.valueOf(par0));
/*     */     
/*  64 */     if (par1)
/*     */     {
/*  66 */       b.add(Integer.valueOf(par0));
/*     */     }
/*     */     
/*  69 */     if (par2)
/*     */     {
/*  71 */       c.add(Integer.valueOf(par0));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ef d(int par0) {
/*     */     try {
/*  83 */       Class<ef> var1 = (Class)l.a(par0);
/*  84 */       return (var1 == null) ? null : var1.newInstance();
/*     */     }
/*  86 */     catch (Exception var2) {
/*     */       
/*  88 */       var2.printStackTrace();
/*  89 */       System.out.println("Skipping packet with id " + par0);
/*  90 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(DataOutputStream par0DataOutputStream, byte[] par1ArrayOfByte) throws IOException {
/*  99 */     par0DataOutputStream.writeShort(par1ArrayOfByte.length);
/* 100 */     par0DataOutputStream.write(par1ArrayOfByte);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static byte[] b(DataInputStream par0DataInputStream) throws IOException {
/* 108 */     short var1 = par0DataInputStream.readShort();
/*     */     
/* 110 */     if (var1 < 0)
/*     */     {
/* 112 */       throw new IOException("Key was smaller than nothing!  Weird key!");
/*     */     }
/*     */ 
/*     */     
/* 116 */     byte[] var2 = new byte[var1];
/* 117 */     par0DataInputStream.read(var2);
/* 118 */     return var2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int k() {
/* 127 */     return ((Integer)a.get(getClass())).intValue();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ef a(DataInputStream par0DataInputStream, boolean par1, Socket par2Socket) throws IOException {
/*     */     int var8;
/* 135 */     boolean var3 = false;
/* 136 */     ef var4 = null;
/* 137 */     int var5 = par2Socket.getSoTimeout();
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 142 */       var8 = par0DataInputStream.read();
/*     */       
/* 144 */       if (var8 == -1)
/*     */       {
/* 146 */         return null;
/*     */       }
/*     */       
/* 149 */       if ((par1 && !c.contains(Integer.valueOf(var8))) || (!par1 && !b.contains(Integer.valueOf(var8))))
/*     */       {
/* 151 */         throw new IOException("Bad packet id " + var8);
/*     */       }
/*     */       
/* 154 */       var4 = d(var8);
/*     */       
/* 156 */       if (var4 == null)
/*     */       {
/* 158 */         throw new IOException("Bad packet id " + var8);
/*     */       }
/*     */       
/* 161 */       if (var4 instanceof do)
/*     */       {
/* 163 */         par2Socket.setSoTimeout(1500);
/*     */       }
/*     */       
/* 166 */       var4.a(par0DataInputStream);
/* 167 */       n++;
/* 168 */       o += var4.a();
/*     */     }
/* 170 */     catch (EOFException var7) {
/*     */       
/* 172 */       System.out.println("Reached end of stream");
/* 173 */       return null;
/*     */     } 
/*     */     
/* 176 */     kf.a(var8, var4.a());
/* 177 */     n++;
/* 178 */     o += var4.a();
/* 179 */     par2Socket.setSoTimeout(var5);
/* 180 */     return var4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(ef par0Packet, DataOutputStream par1DataOutputStream) throws IOException {
/* 188 */     par1DataOutputStream.write(par0Packet.k());
/* 189 */     par0Packet.a(par1DataOutputStream);
/* 190 */     p++;
/* 191 */     q += par0Packet.a();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(String par0Str, DataOutputStream par1DataOutputStream) throws IOException {
/* 199 */     if (par0Str.length() > 32767)
/*     */     {
/* 201 */       throw new IOException("String too big");
/*     */     }
/*     */ 
/*     */     
/* 205 */     par1DataOutputStream.writeShort(par0Str.length());
/* 206 */     par1DataOutputStream.writeChars(par0Str);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String a(DataInputStream par0DataInputStream, int par1) throws IOException {
/* 215 */     short var2 = par0DataInputStream.readShort();
/*     */     
/* 217 */     if (var2 > par1)
/*     */     {
/* 219 */       throw new IOException("Received string length longer than maximum allowed (" + var2 + " > " + par1 + ")");
/*     */     }
/* 221 */     if (var2 < 0)
/*     */     {
/* 223 */       throw new IOException("Received string length is less than zero! Weird string!");
/*     */     }
/*     */ 
/*     */     
/* 227 */     StringBuilder var3 = new StringBuilder();
/*     */     
/* 229 */     for (int var4 = 0; var4 < var2; var4++)
/*     */     {
/* 231 */       var3.append(par0DataInputStream.readChar());
/*     */     }
/*     */     
/* 234 */     return var3.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract void a(DataInputStream paramDataInputStream) throws IOException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract void a(DataOutputStream paramDataOutputStream) throws IOException;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract void a(eg parameg);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract int a();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean e() {
/* 263 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(ef par1Packet) {
/* 272 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a_() {
/* 280 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 285 */     String var1 = getClass().getSimpleName();
/* 286 */     return var1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ur c(DataInputStream par0DataInputStream) throws IOException {
/* 294 */     ur var1 = null;
/* 295 */     short var2 = par0DataInputStream.readShort();
/*     */     
/* 297 */     if (var2 >= 0) {
/*     */       
/* 299 */       byte var3 = par0DataInputStream.readByte();
/* 300 */       short var4 = par0DataInputStream.readShort();
/* 301 */       var1 = new ur(var2, var3, var4);
/* 302 */       var1.d = d(par0DataInputStream);
/*     */     } 
/*     */     
/* 305 */     return var1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(ur par0ItemStack, DataOutputStream par1DataOutputStream) throws IOException {
/* 313 */     if (par0ItemStack == null) {
/*     */       
/* 315 */       par1DataOutputStream.writeShort(-1);
/*     */     }
/*     */     else {
/*     */       
/* 319 */       par1DataOutputStream.writeShort(par0ItemStack.c);
/* 320 */       par1DataOutputStream.writeByte(par0ItemStack.a);
/* 321 */       par1DataOutputStream.writeShort(par0ItemStack.j());
/* 322 */       bq var2 = null;
/*     */       
/* 324 */       if (par0ItemStack.b().n() || par0ItemStack.b().q())
/*     */       {
/* 326 */         var2 = par0ItemStack.d;
/*     */       }
/*     */       
/* 329 */       a(var2, par1DataOutputStream);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static bq d(DataInputStream par0DataInputStream) throws IOException {
/* 338 */     short var1 = par0DataInputStream.readShort();
/*     */     
/* 340 */     if (var1 < 0)
/*     */     {
/* 342 */       return null;
/*     */     }
/*     */ 
/*     */     
/* 346 */     byte[] var2 = new byte[var1];
/* 347 */     par0DataInputStream.readFully(var2);
/* 348 */     return ca.a(var2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static void a(bq par0NBTTagCompound, DataOutputStream par1DataOutputStream) throws IOException {
/* 357 */     if (par0NBTTagCompound == null) {
/*     */       
/* 359 */       par1DataOutputStream.writeShort(-1);
/*     */     }
/*     */     else {
/*     */       
/* 363 */       byte[] var2 = ca.a(par0NBTTagCompound);
/* 364 */       par1DataOutputStream.writeShort((short)var2.length);
/* 365 */       par1DataOutputStream.write(var2);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   static {
/* 371 */     a(0, true, true, dq.class);
/* 372 */     a(1, true, true, dw.class);
/* 373 */     a(2, false, true, cy.class);
/* 374 */     a(3, true, true, cu.class);
/* 375 */     a(4, true, false, fa.class);
/* 376 */     a(5, true, false, ev.class);
/* 377 */     a(6, true, false, ez.class);
/* 378 */     a(7, false, true, dp.class);
/* 379 */     a(8, true, false, ex.class);
/* 380 */     a(9, true, true, eo.class);
/* 381 */     a(10, true, true, eb.class);
/* 382 */     a(11, true, true, ec.class);
/* 383 */     a(12, true, true, ee.class);
/* 384 */     a(13, true, true, ed.class);
/* 385 */     a(14, false, true, ei.class);
/* 386 */     a(15, false, true, fk.class);
/* 387 */     a(16, true, true, er.class);
/* 388 */     a(17, true, false, dk.class);
/* 389 */     a(18, true, true, cr.class);
/* 390 */     a(19, false, true, ej.class);
/* 391 */     a(20, true, false, cq.class);
/* 392 */     a(22, true, false, fd.class);
/* 393 */     a(23, true, false, cl.class);
/* 394 */     a(24, true, false, co.class);
/* 395 */     a(25, true, false, cp.class);
/* 396 */     a(26, true, false, cm.class);
/* 397 */     a(28, true, false, eu.class);
/* 398 */     a(29, true, false, em.class);
/* 399 */     a(30, true, false, dx.class);
/* 400 */     a(31, true, false, dy.class);
/* 401 */     a(32, true, false, ea.class);
/* 402 */     a(33, true, false, dz.class);
/* 403 */     a(34, true, false, fe.class);
/* 404 */     a(35, true, false, ep.class);
/* 405 */     a(38, true, false, dl.class);
/* 406 */     a(39, true, false, ey.class);
/* 407 */     a(40, true, false, et.class);
/* 408 */     a(41, true, false, fj.class);
/* 409 */     a(42, true, false, en.class);
/* 410 */     a(43, true, false, ew.class);
/* 411 */     a(51, true, false, dr.class);
/* 412 */     a(52, true, false, cv.class);
/* 413 */     a(53, true, false, fi.class);
/* 414 */     a(54, true, false, fh.class);
/* 415 */     a(55, true, false, ff.class);
/* 416 */     a(56, true, false, dt.class);
/* 417 */     a(60, true, false, dm.class);
/* 418 */     a(61, true, false, du.class);
/* 419 */     a(62, true, false, dv.class);
/* 420 */     a(70, true, false, dn.class);
/* 421 */     a(71, true, false, cn.class);
/* 422 */     a(100, true, false, de.class);
/* 423 */     a(101, true, true, dd.class);
/* 424 */     a(102, false, true, dc.class);
/* 425 */     a(103, true, false, dh.class);
/* 426 */     a(104, true, false, df.class);
/* 427 */     a(105, true, false, dg.class);
/* 428 */     a(106, true, true, da.class);
/* 429 */     a(107, true, true, es.class);
/* 430 */     a(108, false, true, db.class);
/* 431 */     a(130, true, true, fc.class);
/* 432 */     a(131, true, true, cz.class);
/* 433 */     a(132, true, false, fg.class);
/* 434 */     a(200, true, false, cs.class);
/* 435 */     a(201, true, false, ek.class);
/* 436 */     a(202, true, true, eh.class);
/* 437 */     a(203, true, true, ct.class);
/* 438 */     a(204, false, true, cx.class);
/* 439 */     a(205, false, true, cw.class);
/* 440 */     a(250, true, true, di.class);
/* 441 */     a(252, true, true, fb.class);
/* 442 */     a(253, true, false, eq.class);
/* 443 */     a(254, false, true, do.class);
/* 444 */     a(255, true, true, dj.class);
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/ef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */