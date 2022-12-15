package com.mycompany.test;
import java.util.*;
import java.lang.*;
import java.lang.Object;
import java.lang.Math;
import static java.lang.Math.abs;


public class curs4_math {

    public static void main(String args[]) {
      double  d1=2.3d,d2=-2.5d;
      float f1=12.2f,f2=-1.3f;
      int i1=12,i2=-2;
      long l1=1235123,l2=-1235412;
      
      System.out.println("Abs double: " + Math.abs(d2));
      System.out.println("Abs float: " + Math.abs(f2));
      System.out.println("Abs int: " + Math.abs(i2));
      System.out.println("Abs long: " + Math.abs(l2));
      
      System.out.println(" ");
      System.out.println("addExact double: " + Math.addExact(i1,i2));
      System.out.println("addExact long: " + Math.addExact(l1,l2));
      
      System.out.println(" ");
      System.out.println("cube root double: "+ Math.cbrt(d1));
      
      System.out.println(" ");
      System.out.println("ceil double: "+ Math.ceil(d1));
      
      System.out.println(" ");
      System.out.println("decrementexact int: " + Math.decrementExact(i1));
      System.out.println("decrementexact long: " + Math.decrementExact(l2));

      System.out.println(" ");
      System.out.println("exp deouble: " + Math.exp(d1));

      System.out.println(" ");
      System.out.println("expm1 double: " + Math.expm1(d1));
      
      System.out.println(" ");
      System.out.println("floor double: " + Math.floor(d1));

      System.out.println(" ");
      System.out.println("floordiv int: " + Math.floorDiv(i1,i2));
      System.out.println("floordiv long: " + Math.floorDiv(l2,l1));
      
      System.out.println(" ");
      System.out.println("floormod int: " + Math.floorMod(i2,i1));
      System.out.println("floormod long: " + Math.floorMod(l2,l1));
      
      System.out.println(" ");
      System.out.println("getexponent double: " + Math.getExponent(d1));
      System.out.println("getexponent float: " + Math.getExponent(f1));
      
      System.out.println(" ");
      System.out.println("hypot double: " + Math.hypot(d1,d2)); //sqrt(x^2+y^2)
      
      System.out.println(" ");
      System.out.println("incrementexact int: " + Math.incrementExact(i1));
      System.out.println("incrementexact long: " + Math.incrementExact(l2));
      
      System.out.println(" ");
      System.out.println("log double: " + Math.log(d1));
      
      System.out.println(" ");
      System.out.println("log10 double: " + Math.log10(d1));
      
      System.out.println(" ");
      System.out.println("log1p double: " + Math.log1p(d1)); //natural logarithm of the sum of the argument and 1.
      
      System.out.println("max double: " + Math.max(d1,d2));
      System.out.println("max float: " + Math.max(f1,f2));
      System.out.println("max int: " + Math.max(i1,i2));
      System.out.println("max long: " + Math.max(l1,l2));
      
      System.out.println("min double: " + Math.min(d1,d2));
      System.out.println("min float: " + Math.min(f1,f2));
      System.out.println("min int: " + Math.min(i1,i2));
      System.out.println("min long: " + Math.min(l1,l2));
      
      System.out.println(" ");
      System.out.println("multiplyexact int: " + Math.multiplyExact(i1,i2));
      System.out.println("multiplyexact long: " + Math.multiplyExact(l1,l2));
      
      System.out.println(" ");
      System.out.println("negateexact int: " + Math.negateExact(i1));
      System.out.println("negateexact long: " + Math.negateExact(l1));
      
      System.out.println(" ");
      System.out.println("nextafter doubledouble: " + Math.nextAfter(d1,Double.MAX_VALUE));
      System.out.println("nextafter floatfloat: " + Math.nextAfter(f1, Float.MAX_VALUE));
      
      System.out.println(" ");
      System.out.println("nextdown double: " + Math.nextDown(d1));
      System.out.println("nextdown float: " + Math.nextDown(f1));
     
      System.out.println(" ");
      System.out.println("nextdown double: " + Math.nextDown(d1));
      System.out.println("nextdown float: " + Math.nextDown(f1));
      
      System.out.println(" ");
      System.out.println("nextup double: " + Math.nextUp(d1));
      System.out.println("nextup float: " + Math.nextUp(f1));
      
      System.out.println(" ");
      System.out.println("pow doubledouble: " + Math.pow(d1,d2));
     
      System.out.println(" ");
      System.out.println("random: " + Math.random());
        
      System.out.println(" ");
      System.out.println("rint double: " + Math.rint(d1));  
      
      System.out.println(" ");
      System.out.println("round double: " + Math.round(d1));
      System.out.println("round float: " + Math.round(f1));

      System.out.println(" ");
      System.out.println("scalb double: " + Math.scalb(d1,3));
      System.out.println("scalb float: " + Math.scalb(f1,3)); //f*2^scalefactor
      
      System.out.println(" ");
      System.out.println("signum double: " + Math.signum(d1));
      System.out.println("signum float: " + Math.signum(f1));   
      
      System.out.println(" ");
      System.out.println("sqrt double: " + Math.sqrt(d1));
      
      System.out.println(" ");
      System.out.println("subtractexact int: " + Math.subtractExact(i1,i2));
      System.out.println("subtractexact long: " + Math.subtractExact(l1,l2));
      
      System.out.println(" ");
      System.out.println("Functii trig: ");
      System.out.println("sin double: " + Math.sin(d1));
      System.out.println("cos double: " + Math.cos(d1));
      System.out.println("tan double: " + Math.tan(d1));
      System.out.println("asin double: " + Math.asin(d1));
      System.out.println("acos double: " + Math.acos(d1));
      System.out.println("atan double: " + Math.atan(d1));
      System.out.println("sinh double: " + Math.sinh(d1));
      System.out.println("cosh double: " + Math.cosh(d1));
      System.out.println("tanh double: " + Math.tanh(d1));
      


      
    }

   
}
