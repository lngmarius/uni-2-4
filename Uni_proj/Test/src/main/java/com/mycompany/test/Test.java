package com.mycompany.test;

public class Test{
    int X=5;
    String Y="\"sir de caractere\"" ;
    byte b1=73,b2;
    int i1=2, i2=3, i3,i4;
    boolean i5;      
   
    //curs 1
    
    public static void main(String[] args)
 { 
     //1
     
     int x=24;
     String y="sir de caractere";
     System.out.println("variabila X are valoarea= "+x);
     System.out.println("variabila Y = "+y);
     System.out.println("unde X şi Y sunt variabile de tip intreg şi String.");
   
     
     //curs 2 
     
     //2
    //afisari obiecte
     Test obiect=new Test();
     System.out.println(obiect.X);
     System.out.println(obiect.Y);
 
    //conversii
    obiect.b2=(byte)obiect.i1;
    System.out.println(obiect.b2);
    System.out.println((byte)obiect.i1);
    
    //operatori unari
    System.out.println("I1+I2=" + (obiect.i1+obiect.i2) );
    System.out.println("I1-I2=" + (obiect.i1-obiect.i2) );
    System.out.println("I1*I2=" + (obiect.i1*obiect.i2) );
    
    obiect.i3=obiect.i1;
    System.out.println("I1++=" + (++obiect.i3));
    
    obiect.i4=obiect.i1;
    System.out.println("I1--=" + (--obiect.i4));
    
    obiect.i5=false;
    System.out.println("!I1=" + (obiect.i5=true));
    
    //3
        System.out.println("int min= "+Integer.MIN_VALUE);
        System.out.println("int max="+Integer.MAX_VALUE);
        System.out.println("long min= "+Long.MIN_VALUE );
        System.out.println("long max= "+Long.MAX_VALUE );
        System.out.println("float min= "+Float.MIN_VALUE );
        System.out.println("float max= "+Float.MAX_VALUE );
        System.out.println("double min= "+Double.MIN_VALUE );
        System.out.println("double max= "+Double.MAX_VALUE );

 }
 
    
}