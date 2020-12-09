package com.breif.pharmacie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin extends Personne{

	private String adresse;
	private static int ref = 0;
	private double Salaire;
	private List<Medicament> medicament;
	private List<Pharmacien> employer;
	private List<Client> client;
	public Medicament M1;
	String msg="";
	Gestion pharmacie;
	public Admin(String firstName,String lastName,String cni,String  adresse){
		// TODO Auto-generated constructor stub.
		super(firstName,lastName,cni);
		this.adresse = adresse;
		Admin.ref++;
		medicament = new ArrayList<Medicament>();
		employer =   new ArrayList<Pharmacien>();
		client= new ArrayList<Client>();
	}
	
	public double getSalaire() {
		return this.Salaire;
	}
	public void SetSalaire(double salaire) {
		 this.Salaire=salaire;
	}
	public String getAdress() {
		
		return this.adresse;
		
	}
	public int getRef(){
		
		return Admin.ref;
		
	}
	
	
	
	public void setAdresse(String adress){
		
		this.adresse = adress;
		
	}
	public void AddMedicament(Medicament e) {
		// TODO Auto-generated method stub
		medicament.add(e);
		pharmacie= Gestion.AJOUTER;
		msg= pharmacie.getMessage();
		System.out.println(msg);
		AfficherMedicamant();
	}
	
	
	public void deleteMedicament(int ref){
		
		boolean test = false;
		for(int i = 0;i<medicament.size();i++) {
			
			if(ref == medicament.get(i).getRef()){
				
				medicament.remove(i);
				pharmacie= Gestion.SUPPRIMER;
				msg= pharmacie.getMessage();
				
				System.out.println(msg);
				test = true;
				break;
				
			}
		}
		AfficherMedicamant();
		if(test == false) {
			pharmacie= Gestion.ERROR;
			msg= pharmacie.getMessage();
			System.out.println(msg);
			
			
		}
		
	}
	
	public void EditMedicament(String name,double price,int ref,int qte){
		
		boolean test = false;
		for(int i = 0;i<medicament.size();i++) {
			
			if(ref == medicament.get(i).getRef()) {
				
				medicament.get(i).setTitle(name);
				medicament.get(i).setPrice(price);
				medicament.get(i).setQte(qte);
				 pharmacie= Gestion.MODIFIER;
				 
				System.out.println(pharmacie.getMessage());
				test = true;
				break;
			}
		}
		AfficherMedicamant();
           if(test == false) {
			 pharmacie= Gestion.ERROR;
			System.out.println(pharmacie.getMessage());
			
		}
		
	}
	
	public void AfficherMedicamant() {
		
		int i = 0;
		for(i = 0;i<medicament.size();i++) {	
			System.out.println(medicament.get(i).toString());
		}
	
  }
	public Medicament RechercheMedicament(int ref) {
		int i = 0;
		 
		for(i = 0;i<medicament.size();i++) {	
			if(ref==medicament.get(i).getRef())  {
				
				M1=medicament.get(i);
				
			}
		}
		
		return M1;
		
	}
	
	public void Addpharmacien(Pharmacien a) {
		// TODO Auto-generated method stub
		employer.add(a);
		Gestion pharmacien = Gestion.AJOUTER;
		String msg= pharmacien.getMessage();
		pharmacien.AfficherMsg("Le pharmacien ",msg );
		 Afficherpharmacien();
		
	}
	
	
	public void deletepharmacien(int ref){
		
		int i = 0;
		boolean test = false;
		for(i = 0;i<employer.size();i++) {
			
			if(ref == employer.get(i).getId()){
			
				employer.remove(i);
				 pharmacie=Gestion.SUPPRIMER;
				 msg=pharmacie.getMessage();
				 pharmacie.AfficherMsg("le pharmacien ", msg);
				test = true;
				break;
				
			}
		}
		Afficherpharmacien();
		if(test == false) {
			pharmacie=Gestion.ERROR;
			msg=pharmacie.getMessage();
			pharmacie.AfficherMsg("le referance ", msg);
			
			
		}
		
	}
	
	public void Editpharmacien(String name,double Salaire,String prenom,int id){
		int i = 0;
		boolean test = false;
		for(i = 0;i<employer.size();i++) {
			
			if(id == employer.get(i).getId()) {
				
				employer.get(i).setFirstName(name);
				employer.get(i).setLastName(prenom);
				employer.get(i).setSalaire(Salaire);
				pharmacie=Gestion.MODIFIER;
				System.out.println(pharmacie.getMessage());
				test = true;
				break;
			}
		}
		Afficherpharmacien();
		if(test == false) {
			pharmacie=Gestion.ERROR;
			msg=pharmacie.getMessage();
			pharmacie.AfficherMsg(" le id de pharmacien ", msg);
		}
		
	}
	
	public void Afficherpharmacien() {
		
		int i = 0;
		for(i = 0;i<employer.size();i++) {	
			System.out.println(employer.get(i).toString());
		}
	
  }
	
public void AfficherClient() {
		
		int i = 0;
		for(i = 0;i<client.size();i++) {	
			if(client.get(i).getStatus()=="fedele") {
			System.out.println(client.get(i).toString());
		}
		}
	
  }
	
}
