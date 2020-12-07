package com.breif.pharmacie;


public class Pharmacien  extends Personne{
	
     private double Salaire;
     private static int code = 0;
     public int id;
     
     public Pharmacien(String firstName,String lastName,String cni,double salaire){
		// TODO Auto-generated constructor stub 
    	 super(firstName,lastName,cni);
    	 this.Salaire = salaire;
    
    	 this.id =code++;
	}
     public int getCode(){
    	 return Pharmacien.code;
     }
     
     
     public double getSalaire(){
    	 return this.Salaire;
     }
     
     public void setSalaire(double salaire){
    	 this.Salaire = salaire;
     }
     
     
     
     
     
     
     
	
	

}

