
package com.mycompany.test;
import java.util.*;
import java.lang.String;
import java.lang.Math;

public class curs4 {

  
    
    
    public static void main(String args[]) {
     String Sir1="Acesta este primul SIR", Sir2="cel de-al doilea sir de caractere";
    
     System.out.println(Sir1) ;  
     System.out.println(Sir2);   
     System.out.println(" ");
     
     System.out.println("Sir1");
     char ch1=Sir1.charAt(5);
     System.out.println("Pozitia 5: "+ ch1+" "+(int)ch1); 
     char ch2=Sir1.charAt(15);
     System.out.println("Pozitia 15: "+ ch2+" "+(int)ch2);
     
     System.out.println("Sir2");
     char ch3=Sir2.charAt(5);
     System.out.println("Pozitia 5: "+ ch3+" "+(int)ch3); 
     char ch4=Sir2.charAt(15);
     System.out.println("Pozitia 15: "+ ch4+" "+(int)ch4);
     
     System.out.println(" ");

     System.out.println(Sir1.equals(Sir2));
     System.out.println(Sir1==Sir2);  
     System.out.println(Sir1.compareTo(Sir2)); //comparare lexicografica 
     /*
     s1 == s2 : return 0.
     s1 > s2 : return +val.
     s1 < s2 : return -val.
     */
     
     System.out.println(" ");
     System.out.println(Sir1.toLowerCase());

     System.out.println(" ");
     System.out.println(Sir1.length());
     
     System.out.println(" ");
     System.out.println(Sir1.replace("SIR", "string"));
     
     
     System.out.println(" ");
     String siro="sir in oglinda",oglindit="";
     char cho;
     for(int i=0;i<siro.length();i++)
     {
         cho=siro.charAt(i);
         oglindit=cho+oglindit;
         
     }
     System.out.println(oglindit);
    }
    
     
    }

    



