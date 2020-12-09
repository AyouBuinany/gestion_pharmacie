package com.breif.pharmacie;

import java.util.ArrayList;
import java.util.Scanner;

public class Client extends Personne {	
	private  double id ;
	private int nbrachat;
	public String status = "Vide";
	public Client(double id ,String firstName,String lastName,String cni) {
		super(firstName,lastName, cni);
		this.id=id;
	}
	public double getId() {
		return id;
	}
	
	//set
public void setId(double id) {
		this.id = id;
	}
	
	public int getNbrachat() {
		
		return this.nbrachat;
		
	}
	
	public String getStatus() {
		
		return this.status;
		
	}
	@Override
	public String toString() {
		return " id : " + this.id + "," + super.toString() + "   status : " + this.status;
	}
	
	
}
