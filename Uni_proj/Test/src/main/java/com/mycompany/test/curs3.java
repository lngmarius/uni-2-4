
package com.mycompany.test;

public class curs3 {

    public static void main(String args[]) {
        //4
        boolean a=true, b=false;
        //si
        System.out.println("----si----");
        System.out.println((boolean)a&&a);
        System.out.println((boolean)a&&b);
        System.out.println((boolean)b&&a);
        System.out.println((boolean)b&&b);
        
        
        //sau
        System.out.println("----sau----");
        System.out.println((boolean)a||a);
        System.out.println((boolean)a||b);
        System.out.println((boolean)b||a);
        System.out.println((boolean)b||b);
        
        
        //not
        System.out.println("----not----");
        System.out.println((boolean)!a);
        System.out.println((boolean)!b);
        
        
       //5
      System.out.println(" ");

       boolean p=true,q=true,r=true;
       System.out.println((boolean)(p && q) || (q && r) || !(p));

       p=false;q=false;r=false;
       System.out.println((boolean)(p && q) || (q && r) || !(p));

       p=false;q=true;r=true;
       System.out.println((boolean)(p && q) || (q && r) || !(p));       

       p=false;q=false;r=true;
       System.out.println((boolean)(p && q) || (q && r) || !(p));

       p=true;q=false;r=true;
       System.out.println((boolean)(p && q) || (q && r) || !(p));       
       
       p=true;q=true;r=false;
       System.out.println((boolean)(p && q) || (q && r) || !(p));
       
       p=true;q=false;r=false;
       System.out.println((boolean)(p && q) || (q && r) || !(p));
       
       p=true;q=false;r=true;
       System.out.println((boolean)(p && q) || (q && r) || !(p));
       
       //6
       System.out.println(" ");
       byte by=-121;
       short sh=-10617;
       int in=1234567;
       float fl=1234567.0f;
       double db=1234567.0d;
       long lg=1234567l;
       
       System.out.println(" byte*short:"+by*sh +"\n byte*int: "+by*in+"\n byte*float: "+by*fl+"\n byte*double: "+by*db+"\n byte*long: "+by*lg+"\n short*int: "+sh*in+" \n short*float: "+sh*fl+"\n short*double: "+sh*db+"\n short*long: "+sh*lg+"\n short*float: "+in*fl+"\n int*double: "+in*db+"\n int*long: "+in*lg+"\n float*double: "+fl*db+"\n float*long: "+fl*lg+"\n double*long: "+db*lg);
       System.out.println(" ");

       //7     
       System.out.println(" ");
       System.out.println("Byte: ["+Byte.MIN_VALUE+","+Byte.MAX_VALUE+"]");
       System.out.println("Short: ["+Short.MIN_VALUE+","+Short.MAX_VALUE+"]");
       System.out.println("Int: ["+Integer.MIN_VALUE+","+Integer.MAX_VALUE+"]");
       System.out.println("Float: ["+Float.MIN_VALUE+","+Float.MAX_VALUE+"]");
       System.out.println("Double: ["+Double.MIN_VALUE+","+Double.MAX_VALUE+"]");
       System.out.println("Long: ["+Long.MIN_VALUE+","+Long.MAX_VALUE+"]");

       //8
      System.out.println(" ");

      int A=15;
         System.out.println("A = "+A);
     int i=2;
     A=A+i++;
     System.out.println("i="+i +" A+i++ = "+A);
     i=2;
     A=A+++i;
     System.out.println("i="+i+" A+++i = "+A);
     i=2;
     A=A+--i;
     System.out.println("i="+i+" A+--i = "+A);
     i=2;
     A=A-i--;
     System.out.println("i="+i+" A-i-- = "+A);
                     
    }
}
