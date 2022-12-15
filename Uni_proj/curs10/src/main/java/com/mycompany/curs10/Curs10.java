package com.mycompany.curs10;

public class Curs10 {

    public static class ex {

        int intreg;
        double real;
        String sir;

        ex() {
            this.intreg = 0;
            this.real = 0.0;
            this.sir = " ";
        }

        ex(int intreg, double real, String sir) {
            this.intreg = intreg;
            this.real = real;
            this.sir = sir;
        }

        void Afis() {
            System.out.println("Nr intreg: " + this.intreg);
            System.out.println("Nr real: " + this.real);
            System.out.println("Sir char: " + this.sir);
        }

        public boolean equals(ex e) {
            if (e == null) {
                return false;
            }
            
            if(this.intreg==e.intreg&&this.real==e.real&&this.sir==e.sir||e==this)
                return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        ex a = new ex(12, 11.3, "test1");
        ex b = new ex(13, 12.3, "test2");
        ex c = new ex(12, 11.3, "test1");


        System.out.println("---------------");
        System.out.println(a.equals(b));
        System.out.println(a != b);
        System.out.println(a == b);

        System.out.println("---------------");
        System.out.println(b.equals(c));
        System.out.println(b != c);
        System.out.println(b == c);

        System.out.println("---------------");
        System.out.println(a.equals(c));
        System.out.println(a != c);
        System.out.println(a == c);

    }
}
