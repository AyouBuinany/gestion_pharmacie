package com.breif.pharmacie;


public class Pharmacien  extends Personne{
	
     private double Salaire;
     private static int code = 1;
     public int id;
     
     public Pharmacien(String firstName,String lastName,String cni,double salaire){
		// TODO Auto-generated constructor stub 
    	 super(firstName,lastName,cni);
    	 this.Salaire = salaire;
    
    	 this.id =code++;
	}
     public int getId(){
    	 return this.id;
     }
     
     
     public double getSalaire(){
    	 return this.Salaire;
     }
     
     public void setSalaire(double salaire){
    	 this.Salaire = salaire;
     }
     
     public String toString() {
    	 return " id : " +  this.id +  super.toString() +  " Salaire : " + this.Salaire ;
     }
     
     
     
     
     
	
	

}

