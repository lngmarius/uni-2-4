package com.mycompany.curs8;

public class Curs8 {

    public static class Adresa{
    String Strada, Oras, Localitate;
    char Scara;
    int Numar, Bloc, Etaj, Aparament, CodPostal;
    
    Adresa()
    {
    this.Strada="Nedefinit";
    this.Numar=0;
    this.Bloc=0;
    this.Scara='X';
    this.Etaj=0;
    this.Aparament=0;
    this.CodPostal=0;
    this.Oras="Nedefinit";
    this.Localitate="Nedefinit";
    }
    
    Adresa(String Strada, int Numar, int Bloc, char Scara, int Etaj, int Aparament, int CodPostal,String Oras, String Localitate)
    {
    this.Strada=Strada;
    this.Numar=Numar;
    this.Bloc=Bloc;
    this.Scara=Scara;
    this.Etaj=Etaj;
    this.Aparament=Aparament;
    this.CodPostal=CodPostal;
    this.Oras=Oras;
    this.Localitate=Localitate;
    }
    
    void Afis()
    {
    System.out.println("Strada: "+this.Strada+", Numarul: "+this.Numar);
    System.out.println("Bloc: "+this.Bloc+", Scara: "+this.Scara+", Etaj: "+this.Etaj+", Apartament: "+this.Aparament+", CodPostal: "+this.CodPostal);
    System.out.println("Oras: "+this.Oras+", Localitate: "+this.Localitate);
    }
    
    }
    
    public static class Data{
    int zi,an;
    String luna;
    
    Data()
    {
    this.zi=1;
    this.an=1;
    this.luna="ianuarie";
    }
    Data(int zi, String luna, int an)
    {
    this.zi=zi;
    this.luna=luna;
    this.an=an;
    }
    
    void Afis()
    {
    System.out.println(this.zi+"-"+this.luna+"-"+this.an);
    }
    
    }
    
    public static class Banca{
     String nume;
     Adresa a=new Adresa();
     
     Banca()
     {
     this.nume="Nedefinit";
     this.a=a;
     }
     
     Banca(String nume, Adresa a)
     {
     this.nume=nume;
     this.a=a;
     }
     
     void Afis()
     {
     System.out.println("Banca: "+this.nume);
     a.Afis();
     }
     
    }
    
    public static class ContBancar{
        long Numar;
        Banca b=new Banca();
        String Titular;
        int Suma;
        
        ContBancar()
        {
        this.Numar=0;
        this.b=b;
        this.Titular="Nedefinit";
        this.Suma=0;
        }
        
        ContBancar(long Numar, Banca b, String Titular, int Suma)
        {
        this.Numar=Numar;
        this.b=b;
        this.Titular=Titular;
        this.Suma=Suma;
        }
        
        void Afis()
        {
        System.out.println("Numar Bancar: "+this.Numar);
        b.Afis();
        System.out.println("Titular: "+this.Titular+" Suma: "+this.Suma);

        
        }
    }
    
    public static class Depozit{
        int Numar;
        ContBancar c=new ContBancar();
        double Dobanda;
        Data dataInceput =new Data();
        Data dataSfarsit =new Data();
        double  SumaInitiala;
        double SumaFinala;
        
        Depozit(){
        this.Numar=0;
        this.c=c;
        this.Dobanda=0;
        this.dataInceput=dataInceput;
        this.dataSfarsit=dataSfarsit;
        this.SumaFinala=0;
        this.SumaInitiala=0;
        }
        
        Depozit(int Numar,ContBancar c,double Dobanda,Data dataInceput,Data dataSfarsit,double  SumaInitiala,double SumaFinala)
        {
         this.Numar=Numar;
        this.c=c;
        this.Dobanda=Dobanda;
        this.dataInceput=dataInceput;
        this.dataSfarsit=dataSfarsit;
        this.SumaFinala=SumaFinala;
        this.SumaInitiala=SumaInitiala;
        
        }
        
        void Afis()
        {
        System.out.println("Numar Depozit : "+this.Numar);
        c.Afis();
        System.out.println("Dobanda: "+this.Dobanda);
        dataInceput.Afis(); dataSfarsit.Afis();
        System.out.println("Suma Initiala: "+this.SumaInitiala+", SumaFinala: "+this.SumaFinala);
       
        }
        
    }
    
    
    
    public static void main(String[] args) {
       Data d1=new Data(1,"august",2005);
        Data d2=new Data(1,"aprilie",2003);
      //  d1.Afis();
      //d2.Afis();
        
       // Adresa a1= new Adresa();
        Adresa a2=new Adresa("Buldevardul Unirii",11,3,'C',4,60,140102,"Galati","Sendreni");
      // a1.Afis();
       // a2.Afis();

        Banca b1=new Banca("Bcr",a2);
       // b1.Afis();
        
        ContBancar cb1= new ContBancar(111111111,b1,"Ion Ionescu",20000);
        //ContBancar cb2=new ContBancar();
       // cb1.Afis();
        //cb2.Afis();
        
        Depozit dep1= new Depozit(123,cb1,12.3,d1,d2,1000,2000);
        dep1.Afis();
        
    }
}
