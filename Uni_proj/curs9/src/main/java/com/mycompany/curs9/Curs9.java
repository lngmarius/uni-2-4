
package com.mycompany.curs9;

public class Curs9 {

    public static class Cosmetice{
        String tip;
        String culoare;
        int greutate;
        
        Cosmetice()
        {
        this.tip="Nedefinit";
        this.culoare="Nedefinit";
        this.greutate=0;
        }
        
        Cosmetice(String tip, String culoare, int greutate)
        {
        this.tip=tip;
        this.culoare=culoare;
        this.greutate=greutate;
        }
        
        void Afis()
        {
        System.out.print("Cosmetice: ");
        System.out.println("Tip: "+this.tip+" Culoare: "+this.culoare+" Greutate: "+this.greutate+" grame");
        }
        
    }
    
    public static class Sampon{
        String tip;
        String efect;
        int reciclare;
        
        Sampon()
        {
        this.tip="Nedefinit";
        this.efect="Nedefinit";
        this.reciclare=0;
        }
        
        Sampon(String tip, String efect, int reciclare)
        {
        this.tip=tip;
        this.efect=efect;
        this.reciclare=reciclare;
        }
        
        void Afis()
        {
        System.out.print("Sampon: ");
        System.out.println("Tip: "+this.tip+" Efect: "+this.efect+" Reciclare: "+this.reciclare+"%");
        }
        
    }
    
    public static class CremaFata{
        String tip;
        String continut;
        int natural;
        
        CremaFata()
        {
        this.tip="Nedefinit";
        this.continut="Nedefinit";
        this.natural=0;
        }
        
        CremaFata(String tip,String continut,int natural)
        {
        this.tip=tip;
        this.continut=continut;
        this.natural=natural;
        }
        
        void Afis()
        {
        System.out.print("Crema de fata: ");
        System.out.println("Tip: "+this.tip+" Contine: "+this.continut+" Natural: "+this.natural+"%");
        }
    }
    
    public static class CremaCorp{
        String tip;
        String continut;
        boolean cuParfum=true;
        
        CremaCorp()
        {
        this.tip="Nedefinit";
        this.continut="Nedefinit";
        this.cuParfum=false;
        }
        
        CremaCorp(String tip,String continut,boolean cuParfum)
        {
        this.tip=tip;
        this.continut=continut;
        this.cuParfum=cuParfum;
        }
        
        void Afis()
        {
        System.out.print("Crema de fata: ");
        System.out.print("Tip: "+this.tip+" Contine: "+this.continut);
        if(cuParfum==true)
            System.out.print(" Are parfum!");
                    else 
           System.out.print(" Nu are parfum!");

        }
    }
    
    public static class AfterShave{
        String firma;
        String tip;
        int alcool;
        
         AfterShave()
        {
        this.firma="Nedefinit";
        this.tip="Nedefinit";
        this.alcool=0;
        }
        
        AfterShave(String firma,String tip,int alcool)
        {
        this.firma=firma;
        this.tip=tip;
        this.alcool=alcool;
        }
        
        void Afis()
        {
        System.out.println("");
        System.out.print("After Shave: ");
        System.out.println("Firma: "+this.firma+" Tip: "+this.tip+" Alcool: "+this.alcool+"%");
        }
    }
    
    public static class GelDeDus{
        String firma;
        String continut;
        int gramaj;
        
         GelDeDus()
        {
        this.firma="Nedefinit";
        this.continut="Nedefinit";
        this.gramaj=0;
        }
        
        GelDeDus(String firma,String continut,int gramaj)
        {
        this.firma=firma;
        this.continut=continut;
        this.gramaj=gramaj;
        }
        
        void Afis()
        {
        System.out.print("Gel de dus: ");
        System.out.println("Firma: "+this.firma+" Continut: "+this.continut+" Gramaj: "+this.gramaj+"ml");
        }
    }
    
    static void Afis()
    {
    Cosmetice c1=new Cosmetice();
    Cosmetice c2=new Cosmetice("Ruj","Rosu",5);
    //c1.Afis();
    c2.Afis();
    
    Sampon s1=new Sampon();
    Sampon s2=new Sampon("Hidratant","Redensificator",100);
    //s1.Afis(); 
    s2.Afis();
    
    CremaFata cr1=new CremaFata();
    CremaFata cr2=new CremaFata("Hidratanta","catina si musetel",99);
    //cr1.Afis();
    cr2.Afis();
   
    CremaCorp cc1=new CremaCorp();
    CremaCorp cc2=new CremaCorp("Hidratanta","miere albine",true);
    //cc1.Afis();
    cc2.Afis();
    
    AfterShave a1=new AfterShave();
    AfterShave a2=new AfterShave("Nivea","No Burning",0);
    //a1.Afis();
    a2.Afis();
    
    GelDeDus g1=new GelDeDus();
    GelDeDus g2=new GelDeDus("Nivel","Rose, Almond oil",750);
    //g1.Afis();
    g2.Afis();
    
    }
    
    public static void main(String[] args) {

        Afis();

    }
}
