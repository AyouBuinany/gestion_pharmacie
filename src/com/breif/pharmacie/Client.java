package com.breif.pharmacie;

import java.util.ArrayList;
import java.util.Scanner;

public class Client extends Personne {	
	private static  int id = 0;
	private int nbrachat;
	public String status = "Vide";
	public Client(String firstName,String lastName,String cni) {
		super(firstName,lastName, cni);
		this.id++;
	}
	public int getId() {
		return id;
	}
	
	//set
public void setId() {
		
		this.id++;
		this.nbrachat = id;
		
	}
	
	public int getNbrachat() {
		
		return this.nbrachat;
		
	}
	
	public String getStatus() {
		
		return this.status;
		
	}
	@Override
	public String toString() {
		return "( id : " + this.id + "," + super.toString() + "   status : " + this.status + ")";
	}
	
	
}
