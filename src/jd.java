/*     */ import java.io.BufferedInputStream;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.net.Socket;
/*     */ import java.net.SocketTimeoutException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class jd
/*     */   extends ja
/*     */ {
/*     */   private boolean g = false;
/*     */   private Socket h;
/*  21 */   private byte[] i = new byte[1460];
/*     */ 
/*     */   
/*     */   private String j;
/*     */ 
/*     */   
/*     */   jd(gn par1IServer, Socket par2Socket) {
/*  28 */     super(par1IServer);
/*  29 */     this.h = par2Socket;
/*     */ 
/*     */     
/*     */     try {
/*  33 */       this.h.setSoTimeout(0);
/*     */     }
/*  35 */     catch (Exception var4) {
/*     */       
/*  37 */       this.a = false;
/*     */     } 
/*     */     
/*  40 */     this.j = par1IServer.a("rcon.password", "");
/*  41 */     b("Rcon connection from: " + par2Socket.getInetAddress());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void run() {
/*     */     
/*     */     try { while (true)
/*  50 */       { if (!this.a)
/*     */         
/*     */         { 
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
/*     */           
/* 130 */           g(); break; }  BufferedInputStream var1 = new BufferedInputStream(this.h.getInputStream()); int var2 = var1.read(this.i, 0, 1460); if (10 <= var2) { String var7; int var10000; byte var3 = 0; int var4 = iy.b(this.i, 0, var2); if (var4 != var2 - 4) return;  int var21 = var3 + 4; int var5 = iy.b(this.i, var21, var2); var21 += 4; int var6 = iy.b(this.i, var21); var21 += 4; switch (var6) { case 2: if (this.g) { String var8 = iy.a(this.i, var21, var2); try { a(var5, this.b.h(var8)); } catch (Exception var16) { a(var5, "Error executing: " + var8 + " (" + var16.getMessage() + ")"); }  g(); continue; }  f(); g(); continue;case 3: var7 = iy.a(this.i, var21, var2); var10000 = var21 + var7.length(); if (0 != var7.length() && var7.equals(this.j)) { this.g = true; a(var5, 2, ""); g(); continue; }  this.g = false; f(); g(); continue; }  a(var5, String.format("Unknown request %s", new Object[] { Integer.toHexString(var6) })); g(); continue; }  return; }  } catch (SocketTimeoutException var17) {  } catch (IOException var18) {  } catch (Exception var19) { System.out.println(var19); } finally { g(); }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(int par1, int par2, String par3Str) throws IOException {
/* 142 */     ByteArrayOutputStream var4 = new ByteArrayOutputStream(1248);
/* 143 */     DataOutputStream var5 = new DataOutputStream(var4);
/* 144 */     var5.writeInt(Integer.reverseBytes(par3Str.length() + 10));
/* 145 */     var5.writeInt(Integer.reverseBytes(par1));
/* 146 */     var5.writeInt(Integer.reverseBytes(par2));
/* 147 */     var5.writeBytes(par3Str);
/* 148 */     var5.write(0);
/* 149 */     var5.write(0);
/* 150 */     this.h.getOutputStream().write(var4.toByteArray());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void f() throws IOException {
/* 158 */     a(-1, 2, "");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(int par1, String par2Str) throws IOException {
/* 166 */     int var3 = par2Str.length();
/*     */ 
/*     */     
/*     */     do {
/* 170 */       int var4 = (4096 <= var3) ? 4096 : var3;
/* 171 */       a(par1, 0, par2Str.substring(0, var4));
/* 172 */       par2Str = par2Str.substring(var4);
/* 173 */       var3 = par2Str.length();
/*     */     }
/* 175 */     while (0 != var3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void g() {
/* 183 */     if (null != this.h) {
/*     */ 
/*     */       
/*     */       try {
/* 187 */         this.h.close();
/*     */       }
/* 189 */       catch (IOException var2) {
/*     */         
/* 191 */         c("IO: " + var2.getMessage());
/*     */       } 
/*     */       
/* 194 */       this.h = null;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/jd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */