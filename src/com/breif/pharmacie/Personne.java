package com.breif.pharmacie;


public class Personne {
	
	private String firstName;
	private String lastName;
	private String cni;
	
	
	
	public Personne(String firstName,String lastName,String cni){
		// TODO Auto-generated constructor stub
		this.firstName = firstName;
		this.lastName = lastName;
		this.cni = cni;
	}
	
	
	public void setFirstName(String firstName){
		
		this.firstName = firstName;
		
		
	}
	
	public String getFirstName() {
		
		return this.firstName;
		
	}
	
	public void setLastName(String  lastName){
		
		this.lastName = lastName;
		
		
	}
	
	public String getLastName() {
		
		return this.lastName;
		
	}
	
	public void setCni(String cni){
		
		this.cni = cni;
		
		
	}
	
	public String getCni() {
		
		return this.cni;
		
	}
	@Override
	public String toString() {
		
		
		return " Nom : " + this.firstName + " prenom : " + this.lastName + " Cni : " + this.cni;
		
	}
	
	
	

}
