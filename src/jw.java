/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.net.URL;
/*     */ import java.net.URLConnection;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @SideOnly(Side.CLIENT)
/*     */ final class jw
/*     */   implements Runnable
/*     */ {
/*     */   final kj a;
/*     */   final String b;
/*     */   final Map c;
/*     */   final File d;
/*     */   final jx e;
/*     */   final int f;
/*     */   
/*     */   jw(kj par1IProgressUpdate, String par2Str, Map par3Map, File par4File, jx par5IDownloadSuccess, int par6) {
/*  33 */     this.a = par1IProgressUpdate;
/*  34 */     this.b = par2Str;
/*  35 */     this.c = par3Map;
/*  36 */     this.d = par4File;
/*  37 */     this.e = par5IDownloadSuccess;
/*  38 */     this.f = par6;
/*     */   }
/*     */ 
/*     */   
/*     */   public void run() {
/*  43 */     URLConnection var1 = null;
/*  44 */     InputStream var2 = null;
/*  45 */     DataOutputStream var3 = null;
/*     */     
/*  47 */     if (this.a != null) {
/*     */       
/*  49 */       this.a.b("Downloading Texture Pack");
/*  50 */       this.a.c("Making Request...");
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/*  57 */       byte[] var4 = new byte[4096];
/*  58 */       URL var5 = new URL(this.b);
/*  59 */       var1 = var5.openConnection();
/*  60 */       float var6 = 0.0F;
/*  61 */       float var7 = this.c.entrySet().size();
/*  62 */       Iterator<Map.Entry> var8 = this.c.entrySet().iterator();
/*     */       
/*  64 */       while (var8.hasNext()) {
/*     */         
/*  66 */         Map.Entry var9 = var8.next();
/*  67 */         var1.setRequestProperty((String)var9.getKey(), (String)var9.getValue());
/*     */         
/*  69 */         if (this.a != null)
/*     */         {
/*  71 */           this.a.a((int)(++var6 / var7 * 100.0F));
/*     */         }
/*     */       } 
/*     */       
/*  75 */       var2 = var1.getInputStream();
/*  76 */       var7 = var1.getContentLength();
/*  77 */       int var28 = var1.getContentLength();
/*     */       
/*  79 */       if (this.a != null)
/*     */       {
/*  81 */         this.a.c(String.format("Downloading file (%.2f MB)...", new Object[] { Float.valueOf(var7 / 1000.0F / 1000.0F) }));
/*     */       }
/*     */       
/*  84 */       if (this.d.exists()) {
/*     */         
/*  86 */         long var29 = this.d.length();
/*     */         
/*  88 */         if (var29 == var28) {
/*     */           
/*  90 */           this.e.a(this.d);
/*     */           
/*  92 */           if (this.a != null)
/*     */           {
/*  94 */             this.a.a();
/*     */           }
/*     */           
/*     */           return;
/*     */         } 
/*     */         
/* 100 */         System.out.println("Deleting " + this.d + " as it does not match what we currently have (" + var28 + " vs our " + var29 + ").");
/* 101 */         this.d.delete();
/*     */       } 
/*     */       
/* 104 */       var3 = new DataOutputStream(new FileOutputStream(this.d));
/*     */       
/* 106 */       if (this.f > 0 && var7 > this.f) {
/*     */         
/* 108 */         if (this.a != null)
/*     */         {
/* 110 */           this.a.a();
/*     */         }
/*     */         
/* 113 */         throw new IOException("Filesize is bigger than maximum allowed (file is " + var6 + ", limit is " + this.f + ")");
/*     */       } 
/*     */       
/* 116 */       boolean var31 = false;
/*     */       
/*     */       int var30;
/* 119 */       while ((var30 = var2.read(var4)) >= 0) {
/*     */         
/* 121 */         var6 += var30;
/*     */         
/* 123 */         if (this.a != null)
/*     */         {
/* 125 */           this.a.a((int)(var6 / var7 * 100.0F));
/*     */         }
/*     */         
/* 128 */         if (this.f > 0 && var6 > this.f) {
/*     */           
/* 130 */           if (this.a != null)
/*     */           {
/* 132 */             this.a.a();
/*     */           }
/*     */           
/* 135 */           throw new IOException("Filesize was bigger than maximum allowed (got >= " + var6 + ", limit was " + this.f + ")");
/*     */         } 
/*     */         
/* 138 */         var3.write(var4, 0, var30);
/*     */       } 
/*     */       
/* 141 */       this.e.a(this.d);
/*     */       
/* 143 */       if (this.a != null) {
/*     */         
/* 145 */         this.a.a();
/*     */         
/*     */         return;
/*     */       } 
/* 149 */     } catch (Throwable throwable) {
/*     */       
/* 151 */       throwable.printStackTrace();
/*     */     } finally {
/*     */ 
/*     */       
/*     */       try {
/*     */ 
/*     */         
/* 158 */         if (var2 != null)
/*     */         {
/* 160 */           var2.close();
/*     */         }
/*     */       }
/* 163 */       catch (IOException var25) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       try {
/* 170 */         if (var3 != null)
/*     */         {
/* 172 */           var3.close();
/*     */         }
/*     */       }
/* 175 */       catch (IOException var24) {}
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/luigi/Documents/JAR.jar!/jw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */