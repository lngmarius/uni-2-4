
package com.mycompany.curs5;
import java.lang.Runtime;

public class Curs5 {

    public static void main(String[] args) {
        
        //14
        Runtime r = Runtime.getRuntime();
        System.out.println("Numarul procesoarelor disponibile: " + r.availableProcessors());
        System.out.println("Memoria libera: " + r.freeMemory());
        System.out.println("Memoria maxima: " + r.maxMemory());
        System.out.println("Memoria totala: " + r.totalMemory());
        
        //Runtime.getRuntime().exit(0);
        
        
        //15
        int a = 2; byte b = 12; short c = 4;
        char d = 'd';
        long e = 123;
        float f = 12.1f; double g = 1.33;
        boolean h = true;
        System.out.println("\nOperator +: a+b= " + (a+b));
        System.out.println("Operator -: b-c= " + (b-c));
        System.out.println("Operator *: d*e= " + (d*e));
        System.out.println("Operator /: e/f= " + (e/f));
        System.out.println("Operator %: f%g= " + (f%g));
        System.out.println("Operator ++: ++a= " + (++a));
        System.out.println("Operator --: --b= " + (--b));
        System.out.println("Operator !: !h= " + (!h));
        System.out.println("Operator ==: a==b:  " + (a==b));
        System.out.println("Operator !=: b!=c: " + (b!=c));
        System.out.println("Operator >: a>b: " + (a>b));
        System.out.println("Operator >=: b>=c: " + (b>=c));
        System.out.println("Operator <: a<b: " + (a<b));
        System.out.println("Operator <=: b<=c: " + (b<=c));
        
    }
}