package com.mycompany.carti;
import java.util.*;
import java.lang.String;
import java.lang.Math;
import java.lang.Math.*;

public class Carti {

    public String[] tip=new String[4];
    public String[] carti=new String[14];
    
   public void setTip()
    {
        this.tip[0]="InimaRosie";
        this.tip[1]="InimaNeagra";
        this.tip[2]="Trefla";
        this.tip[3]="Romb";
        
    }
    
  public void setCarti()
    {
    carti[0]="As";
    carti[11]="Juva";
    carti[12]="Regina";
    carti[13]="Rege";
    for(int i=1;i<11;i++)
       carti[i]=Integer.toString(i);
    
   
    }
  
   String getTipi(int index)
    {
    return this.tip[index];
    } 
    
    String getCartei(int index)
    {
    return this.carti[index];
    } 
  
    Carti()
    {
    tip[0]=" ";
    carti[0]=" ";
    }
    
   Carti(String carte,String tipp)
  {
   carti[getCarte(carte)]=carte; 
   tip[getTip(tipp)]=tipp;

  }
  
 
    void AfisareTip()
    {
        
    System.out.println(" ");
    for(int i=0;i<4;i++){
    System.out.println(tip[i]);
    break;
    }
    }
    
    void AfisareCarti()
    {
    for(int j=1;j<14;j++)
    System.out.println(carti[j]);
    }
    
      int getTip(String tip)
    {
    for(int i=0;i<4;i++)
        if(tip==this.tip[i])
            return i;
        
        return 0;
    } 
    
    int getCarte(String carte)
    {
    for(int i=1;i<14;i++)
        if(carte==carti[i])
            return i;
        
        return 0;
    } 
   
    public static class Pachet extends Carti
    {
    String []pachett=new String[56];
        
    Pachet()
    {
     this.setCarti();
     this.setTip();
     int k=0;
     for(int i=0;i<4;i++)
     { 
      for(int j=0;j<14;j++)
      {
         this.pachett[k]=getCartei(j)+" "+getTipi(i); 
         k++;
     }
     
    }
    }
    
     Pachet(String[] pachett)
     {
         this.pachett =pachett;   
     }
    
   
    String getPachet(int index)
    {
     return this.pachett[index];
    }
    
    void AfisarePachet()
    {    
    for(int i=0;i<4;i++)
    {
      System.out.println(" ");
      for(int j=1;j<14;j++)
          System.out.println(carti[j]+" "+tip[i]);
     
    }


    }
    
    void distribuire()
    {
    int nrjucatori=4;
    int nrcarti=4;
    int x=0;
    int y=0;
    String[][] jucator=new String[4][4];
    int []vector=new int[16];
    System.out.println(" ");

    for(int i=0;i<nrjucatori;i++)
        { 
        for(int j=0;j<nrcarti;j++)
        {
        x=(int)(Math.random() * 52)+1;
        vector[y]=x;
        y++;
        for(int k=0;k<16;k++)
            if(vector[k]!=x)
        jucator[i][j]=getPachet(x)+" ";
    }
    System.out.println(" ");
    }
    
   for(int i=0;i<nrjucatori;i++)
   {  System.out.println("Jucatorul: "+(i+1)+":");
       for(int j=0;j<nrcarti;j++)   
       System.out.println(jucator[i][j]);
    
    System.out.println(" ");
    }
   
    }
    }
    
    public static void main(String[] args) {
    
     
    Pachet p = new Pachet();
   p.AfisarePachet();
        //i.Afisare("InimaRosie");
    p.distribuire();
    Carti i=new Carti("As","InimaNeagra");
 
   
   i.AfisareTip();
    }
}
