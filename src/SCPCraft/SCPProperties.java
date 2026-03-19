/*    */ package SCPCraft;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import java.util.Enumeration;
/*    */ import java.util.Properties;
/*    */ import java.util.Vector;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SCPProperties
/*    */   extends Properties
/*    */ {
/*    */   public synchronized Enumeration keys() {
/* 16 */     Enumeration<Object> enumeration = super.keys();
/* 17 */     Vector<Comparable> vector = new Vector();
/* 18 */     for (; enumeration.hasMoreElements(); vector.add(enumeration.nextElement()));
/* 19 */     Collections.sort(vector);
/* 20 */     return vector.elements();
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/SCPProperties.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */