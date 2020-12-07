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
		System.out.println("Le medicamant a ete ajouter");
		AfficherMedicamant();
	}
	
	
	public void deleteMedicament(int ref){
		
		boolean test = false;
		for(int i = 0;i<medicament.size();i++) {
			
			if(ref == medicament.get(i).getRef()){
				
				medicament.remove(i);
				System.out.println("Suppression bien effectuer");
				test = true;
				break;
				
			}
		}
		AfficherMedicamant();
		if(test == false) {
			
			System.out.println("pardon il n'exisit pas se Medicamant");
			
		}
		
	}
	
	public void EditMedicament(String name,double price,int ref,int qte){
		
		boolean test = false;
		for(int i = 0;i<medicament.size();i++) {
			
			if(ref == medicament.get(i).getRef()) {
				
				medicament.get(i).setTitle(name);
				medicament.get(i).setPrice(price);
				medicament.get(i).setQte(qte);
				System.out.println("Modification bien effectuer");
				test = true;
				break;
			}
		}
		AfficherMedicamant();
           if(test == false) {
			
			System.out.println("pardon il n'exisit pas se Medicamant");
			
		}
		
	}
	
	public void AfficherMedicamant() {
		
		int i = 0;
		for(i = 0;i<medicament.size();i++) {	
			System.out.println("name : " + medicament.get(i).getTitle() + " price : " +  medicament.get(i).getprice() + " references : " + medicament.get(i).id + " quantiter  : " + medicament.get(i).getQte());
		}
	
  }
	public Medicament RechercheMedicament(int ref) {
		int i = 0;
		
		for(i = 0;i<medicament.size();i++) {	
			if(medicament.get(i).id == ref) {
				
				M1 = medicament.get(i);
				
			}
		}
		
		return M1;
		
	}
	
	public void Addpharmacien(Pharmacien a) {
		// TODO Auto-generated method stub
		employer.add(a);
		System.out.println("Le pharmacien  a ete ajouter");
		 Afficherpharmacie();
		
	}
	
	
	public void deletepharmacien(int ref){
		
		int i = 0;
		boolean test = false;
		for(i = 0;i<employer.size();i++) {
			
			if(ref == employer.get(i).getCode()){
				
				employer.remove(i);
				System.out.println("Suppression bien effectuer");
				test = true;
				break;
				
			}
		}
		Afficherpharmacie();
		if(test == false) {
			
			System.out.println("pardon il n'exisit pas se pharmacien");
			
		}
		
	}
	
	public void Editpharmacien(String name,double Salaire,String prenom,int code){
		int i = 0;
		boolean test = false;
		for(i = 0;i<employer.size();i++) {
			
			if(code == employer.get(i).getCode()) {
				
				employer.get(i).setFirstName(name);
				employer.get(i).setLastName(prenom);
				employer.get(i).setSalaire(Salaire);
				System.out.println("Modification bien effectuer");
				test = true;
				break;
			}
		}
		Afficherpharmacie();
		if(test == false) {
			System.out.println("pardon il n'exisit pas se pharmacien");
		}
		
	}
	
	public void Afficherpharmacie() {
		
		int i = 0;
		for(i = 0;i<employer.size();i++) {	
			System.out.println("name : " + employer.get(i).getFirstName() + " prenom : " +  employer.get(i).getLastName() + " Cni " +employer.get(i).getCni() +  " Salaire : " + employer.get(i).getSalaire() + " code : " +  employer.get(i).getCode());
		}
	
  }
	
public void AfficherClient() {
		
		int i = 0;
		for(i = 0;i<client.size();i++) {	
			if(client.get(i).getStatus()=="fedele") {
			System.out.println("name : " + client.get(i).getFirstName() + " prenom : " +  client.get(i).getLastName() + " Cni " +client.get(i).getCni() );
		}
		}
	
  }
	
}
