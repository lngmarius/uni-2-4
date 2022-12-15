package com.mycompany.email_c9;

import java.io.*;
import java.lang.Math;

public class Email_c9 {
    public static void main(String[] args)throws IOException {
        
        
        
        String To,From,Subject,Mesaj;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        To = String.valueOf(reader.readLine());
        AdresaEmail to=new AdresaEmail(To);
        
        From = String.valueOf(reader.readLine());
        AdresaEmail from=new AdresaEmail(From);
        
        Subject = String.valueOf(reader.readLine());
        Mesaj = String.valueOf(reader.readLine());
        
        
        Email e=new Email(to,from,Subject,Mesaj);
        e.Afis();
        
        
    }

    public static class AdresaEmail
    {
    String Adresa;
    
    AdresaEmail()
    {
     this.Adresa="";
    }
    AdresaEmail(String Adresa)
    {
        int k=0;
     for(int i=0;i<(Adresa).length();i++)
         if((Adresa).charAt(i)=='@'||(Adresa).charAt(i)=='.')
             k++;
     
     if(k==2)
          this.Adresa=Adresa;
     else this.Adresa="Adresa Invalida";
    }
    
    void Afis()
    {
        if(this.Adresa!="Adresa Invalida")
         System.out.println("Adresa Email: "+this.Adresa);
        else System.out.println("Adresa email introdusa este invalida!");
    }
    
    }
    
    public static class Email
    {
    AdresaEmail To=new AdresaEmail();
    AdresaEmail From=new AdresaEmail();
    String Subject;
    String Mesaj;
    
    Email(AdresaEmail To,AdresaEmail From,String Subject,String Mesaj)
    {
     this.To=To;
     this.From=From;
     if(Subject!="")
     this.Subject=Subject;
     if(Mesaj!="")
     this.Mesaj=Mesaj;
    }
    
    void Afis()
    {
    System.out.println(""); 
    System.out.println("De la: "); this.To.Afis();
    System.out.println("Pentru: "); this.From.Afis();
    System.out.println("Subiect: "+this.Subject);
    System.out.println("Mesaj: "+this.Mesaj);

    }
  
    }
    
    
    
}
