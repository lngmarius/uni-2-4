
package com.mycompany.curs6;

public class curs6_elev {

    public static class Persoana {

        String nume, prenume;
        int anulNasterii;
        

        Persoana() {
            anulNasterii = 2009;
        }

         Persoana(Persoana p) {
           nume=p.nume;
           prenume=p.prenume;
           anulNasterii=p.anulNasterii;
            
        }
        
        Persoana(String n, String p, int an) {
            nume = n;
            prenume = p;
            anulNasterii = an;
        }

      

        public String toString() {
            return  nume + " " + prenume + " nascut/a in " + anulNasterii + " " ;
        }

        void afisare() {
            System.out.print(nume + " " + prenume + " nascut/a in " + anulNasterii + " ");
        }

        int varsta() {
            return 2022 - anulNasterii;
        }
    }
    
    public static class Elev extends Persoana{
     Persoana p=new Persoana();
     String scoala;
      int nrmat;
      int an_studii;
      
      Elev(){
      scoala=null;
      nrmat=0;
      an_studii=0;
    }
      Elev(Persoana p,String scoala,int nrmat,int an_studii){
          super(p);
          this.p=p;
          this.scoala=scoala;
          this.nrmat=nrmat;
          this.an_studii=an_studii;
      }
      
      void Afis()
      {
      System.out.print("Eleva/ul: ");this.p.afisare();
      System.out.println("de la scoala: "+scoala+" din anul: "+an_studii+" are numarul matricol: "+nrmat);
      
      }
    }
    
    public static void main(String args[]) {
      Persoana persoana1=new Persoana("Andrei", "Popescu", 2003);
      
      Elev e=new Elev(persoana1,"Scoala nr 123" ,123124, 3);
      e.Afis();
      
    }
}
