package com.mycompany.curs7;

import java.io.*;
import java.lang.Math;


public class Curs7 {

    public class A {

        String a1;
        int a2;

        A() {
            a1 = "test";
            a2 = 11;
        }

        A(String s, int i) {
            a1 = s;
            a2 = i;
        }
    }

    public class B extends A {

        double b1;
        boolean b2;

        B() {
            super();
            b1 = 12.11;
            b2 = true;
        }

        B(String s, int i, double d, boolean b) {
            super(s, i);
            b1 = d;
            b2 = b;
        }
    }

    public class C extends B {

        float c1;
        char c2;

        C() {
            super();
            c1 = 123.123f;
            c2 = 'c';
        }

        C(String s, int i, double d, boolean b, float f, char c) {
            super(s, i, d, b);
            c1 = f;
            c2 = c;
        }

        void afis() {
            System.out.println(a1);
            System.out.println(a2);
            System.out.println(b1);
            System.out.println(b2);
            System.out.println(c1);
            System.out.println(c2);
        }
    }

    static public void fibonacci(int n) {
        int f1 = 1, f2 = 1, f3;
        System.out.print(f1 + " " + f2 + " ");
        for (int i = 2; i < n; i++) {
            f3 = f1 + f2;
            System.out.print(f3 + " ");
            f1 = f2;
            f2 = f3;
        }
    }

    public static class unghi {

        double u, m, s;

        unghi() {
            u = 0;
            m = 0;
            s = 0;
        }

        unghi(double u, double m, double s) {
            if(u<360){
            this.u = u;
            this.m = m;
            this.s = s;
            
             double sec,min=0.0,mins=0.0;
          int k=0;

          sec=this.s;
          while(sec>60)
          {
          sec=this.s-60;
          k++;   
          }

          mins=this.m+k;
          k=0;
          while(mins>60)
          {
          mins=mins-60;
          k++;   
          }
        
          double unghis;
          unghis=this.u+k;
          
            this.u = unghis;
            this.m = mins;
            this.s = sec;}
            else 
            {
            this.u = 0;
            this.m = 0;
            this.s = 0;
            System.out.println("introdu date corespunzatoare");
            }
        }

        void afis() {
            System.out.println(this.u + "° " + this.m + "' " + this.s + "'' ");
        }

        double getu() {
            return this.u;
        }

        double getm() {
            return this.m;
        }

        double gets() {
            return this.s;
        }
      
       
        unghi adunare(unghi u1)
         {
             double un,min,sec;
             sec=u1.gets()+this.s;
             min=u1.getm()+this.m;
             un=u1.getu()+this.u;
             unghi u=new unghi(un,min,sec);
             
             return u;
         }
        
        unghi scadere(unghi u1)
         {
             double un,min,sec;
             sec=u1.gets()-this.s;
             min=u1.getm()-this.m;
             un=u1.getu()-this.u;
             
             unghi u=new unghi(Math.abs(un),Math.abs(min),Math.abs(sec));
             
             return u;
         }
    }

    
     public static class ore {

        double o, m, s;

        ore() {
            o = 0;
            m = 0;
            s = 0;
        }

        ore(double o, double m, double s) {
            if(o<60){
            this.o = o;
            this.m = m;
            this.s = s;
            
             double sec,min=0.0,mins=0.0;
          int k=0;

          sec=this.s;
          while(sec>60)
          {
          sec=this.s-60;
          k++;   
          }

          mins=this.m+k;
          k=0;
          while(mins>60)
          {
          mins=mins-60;
          k++;   
          }
          
          double ores;
          ores=this.o+k;
          
            this.o = ores;
            this.m = mins;
            this.s = sec;}
            else 
            {
            this.o = 0;
            this.m = 0;
            this.s = 0;
            System.out.println("introdu date corespunzatoare");
            }
        }

        void afis() {
            System.out.println(this.o + "° " + this.m + "' " + this.s + "'' ");
        }

        double geto() {
            return this.o;
        }

        double getm() {
            return this.m;
        }

        double gets() {
            return this.s;
        }
      
       
        ore adunare(ore o)
         {
             double ore,min,sec;
             sec=o.gets()+this.s;
             min=o.getm()+this.m;
             ore=o.geto()+this.o;
             ore or=new ore(ore,min,sec);
             
             return or;
         }
        
        ore scadere(ore o)
         {
             double ore,min,sec;
             sec=o.gets()+this.s;
             min=o.getm()+this.m;
             ore=o.geto()+this.o;
             ore or=new ore(Math.abs(ore),Math.abs(min),Math.abs(sec));
             
             return or;
         }
    }

     
      
    public static boolean par(int n)
    {
    if(n%2==0)
        return true;
    else return false;
    }
    
    public static boolean prim(int n)
    {
        int k=0;
    for(int d=2;d<=n/2;d++)
        if(n%d==0)
            k++;
    
    if(k==0)
        return true;
    else return false;
           
    }
    
    public static void main(String args[]) throws IOException {
        Curs7 l = new Curs7();
        l.run();
       
        
        /*   
     19. Fibonacci + citire tastatura
     int n;
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     n = Integer.valueOf(reader.readLine());
     fibonacci(n);
         */
        
     /*
       // 20. Adunare si scadere unghi
        
        unghi u1 = new unghi(12, 64, 65);
        unghi u2 = new unghi(13,12,1);
        unghi ua=new unghi();
        unghi us=new unghi();
        ua=u1.adunare(u2);
        us=u1.scadere(u2);
        u1.afis();
        u2.afis();
        us.afis();
      */
     
         /*  
     
    //21. Adunare si scadere ceas
        ore o1 = new ore(12, 64, 65);
        ore o2 = new ore(13,12,1);
        ore o=new ore();
        o=o1.adunare(o2);
        o1.afis();
        o.afis();
         */
         
     //22. Nr citit tastatura, par impar prim
     int n;
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     n = Integer.valueOf(reader.readLine());
     
     if(par(n)==true)
         System.out.println("Nr par");
     else System.out.println("Nr impar");
         
     if(prim(n)==true)
         System.out.println("Nr prim");
     else System.out.println("Nr nu este prim");
     
         
    }

    public void run() {
        C pp = new C("tata", 2, 33.3, true, 11.2f, 'c');
        pp.afis();
    }
}
