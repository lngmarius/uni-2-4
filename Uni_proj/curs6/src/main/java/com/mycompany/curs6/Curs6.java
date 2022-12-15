
package com.mycompany.curs6;

public class Curs6 {
    
    public static void main(String args[]) {
        int []vi = {1,2,3};
        double [] vd1={5.5,6.6,7.7},vd2={8.8,9.9,10.10};
        String[] vs={"casa","masa","caine"};
        Object[] vo1,vo2;
        Object ro1= new Object();
        Object ro2= new Object();
        vo1=vs;
        ro1=vi;
        ro2=vd1;
        vd2= (double[]) ro2;
        System.out.println(ro1);
        System.out.println(ro2);
    }
}
