package com.breif.pharmacie;

import java.util.ArrayList;

public class Medicament {
	private String title;
	private double price;
	private static int  count =1;
	private int ref;
	private int qte;
	
	
	public Medicament(String title,double price,int qte){
		
		this.title = title;
		this.price = price;
		this.ref = count++;
		this.qte = qte;
		
	}
	
	
     public void setTitle(String title){
    	 
    	 this.title = title;
    	 
     }
     
     public void setPrice(double price) {
    	 
    	 this.price = price;
    	 
     }
     
     
     public String getTitle(){
    	 
    	return this.title;
    	 
     }
     
     public double getprice(){
    	 
    	return this.price;
    	 
     }
     
     public int getRef() {
    	 
    	 return this.ref;
    	 
     }
     
     public void setQte(int qte ) {
    	 this.qte = qte;	 
     }
     
     public int getQte() {
    	 
    	 return qte;
    	 
     }
     @Override
     public String toString() {
    	 return "reference  : " + this.ref + " Title : " + this.title + " Price : " + this.price + " quantity : " + this.qte;
     }
	 
     
	
	
	
	

}
