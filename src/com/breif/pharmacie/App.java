package com.breif.pharmacie;

import java.util.ArrayList;
import java.util.Scanner;

public class App {


		// TODO Auto-generated constructor stub
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nom = "",prenom = "",nom_pharmacien = "",cni_pharmacien="" ,prenom_pharmacien = "",nom_client = "",prenom_client = "";
		double price,salaire;
		int ref=0,choix,verification,code,qte;
		int quiter = 2;
	    Admin ph = new Admin("Ayoub","el","33HG","32 RUE ELMATAR SAFI");
	    Scanner myInput = new Scanner(System.in);
	while(quiter == 2){
		System.out.println("*** - Gestion Medicament taper 1 : ");
		System.out.println("*** - Gestion pharmacien taper 2 : ");
		System.out.println("*** - Pour  acheter les medicaments taper 3 : ");
		verification = myInput.nextInt();
		switch(verification) {
		case 1: System.out.println("** - Ajouter   Medicament   taper   1     : ");
		        System.out.println("** - Supprimer Medicament   taper   2   : ");
		        System.out.println("** - Modifier  Medicament   taper   3    : ");
		        System.out.println("** - Afficher  Medicament   taper   4    : ");
		        break;
		case 2: System.out.println("** - Ajouter   pharmacien taper 1   : ");
                System.out.println("** - Supprimer pharmacien taper 2   :   ");
                System.out.println("** - Modifier  pharmacien taper 3   :  ");
                System.out.println("** - Afficher  pharmacien taper 4   :  ");
                break;
		case 3: System.out.println("** - Pour effectuer une achat vous devez  choisir 1  pour recherch 2  : ");
        break;
       
        
		
		
		}
	    choix = myInput.nextInt();
	
	if(verification == 1) {
		switch(choix){
		case 1: 
			System.out.println("Entrer le nom du  Medicament : ");
			myInput.nextLine();
			nom = myInput.next();
			System.out.println("Entrer la quantiter  du  Medicament : ");
			qte = myInput.nextInt();
			System.out.println("Entrer le prix du  Medicament : ");
			price = myInput.nextDouble();
			Medicament M1;
			M1 = new Medicament(nom,price,qte);
			ph.AddMedicament(M1);
			break;
		case 2: 
			System.out.println("Enter your references qui dois supprimer ");
			ref = myInput.nextInt();
			ph.deleteMedicament(ref);
			break;
		case 3:
			System.out.println("Entrer le reference  du  Medicament qui va modifier: ");
			ref = myInput.nextInt();
			System.out.println("Entrer le nom du  Medicament : ");
			nom = myInput.next();
			System.out.println("Entrer la quantiter  du  Medicament : ");
			qte = myInput.nextInt();
			System.out.println("Entrer le prix du  Medicament : ");
			price = myInput.nextDouble();
			ph.EditMedicament(nom, price, ref, qte);
			break;
		case 4: 
			ph.AfficherMedicamant();
			break;
		case 5: 
			ph.AfficherMedicamant();
			break;
			default : System.out.println("Error "); 
			break;
		}
	}else if(verification == 2) {
		
		switch(choix){
		case 1: 
			System.out.println("Entrer le nom du  pharmacien : ");
			myInput.nextLine();
			nom_pharmacien = "";
			nom_pharmacien  += myInput.next();
			System.out.println("Entrer le prenom  : ");
			myInput.nextLine();
			prenom_pharmacien = "";
			prenom_pharmacien +=myInput.nextLine();
			System.out.println("Entrer le Cni  : ");
			myInput.nextLine();
			cni_pharmacien = "";
			cni_pharmacien += myInput.next();
			System.out.println("Entrer le salaire : ");
			salaire = myInput.nextDouble();
			Pharmacien P1;
			P1 = new Pharmacien(nom_pharmacien,prenom_pharmacien,cni_pharmacien,salaire);
			ph.Addpharmacien(P1);
			break;
		case 2: 
			System.out.println("Entrer le code ");
			code = myInput.nextInt();
			ph.deletepharmacien(code);
			break;
		case 3:
			System.out.println("Entrer le id : ");
			code = myInput.nextInt();
			System.out.println("Entrer le nom du  pharmacien : ");
			myInput.nextLine();
			nom_pharmacien = "";
			nom_pharmacien += myInput.next();
			System.out.println("Entrer le prenom  : ");
			prenom_pharmacien = myInput.next();
			System.out.println("Entrer le salaire : ");
			salaire = myInput.nextDouble();
			ph.Editpharmacien(nom_pharmacien, salaire, prenom_pharmacien , code);
			break;
		case 4: 
			ph.Afficherpharmacien();
			break;
			default : System.out.println("Error "); break;
		}
		
		
		
	}else if(verification == 3) {
		switch(choix){
		case 1: 
		    ph.AfficherMedicamant();
			System.out.println("Entrer votre nom       : ");
			myInput.nextLine();
			nom_client = "";
			nom_client += myInput.nextLine();
			System.out.println("Entrer votre prenom    : ");
			prenom_client = "";
			prenom_client += myInput.nextLine();
			System.out.println("Entrer votre cne    : ");
    String	cne = myInput.next();
			System.out.println("Entrer votre quantiter : ");
			qte = myInput.nextInt();
			System.out.println("Entrer votre references de midicament qui va acheter: ");
			ref = myInput.nextInt();
			double id= Math.random();
			Client c1 = new Client(id,nom_client,prenom_client,cne);
		    Medicament M1 =	ph.RechercheMedicament(ref);
	        Facture F1 = new Facture(c1);
	        F1.addProduct(M1,qte);
	        System.out.println(F1.getCustomer().toString());
	    break;
		case 2:
			ph.AfficherMedicamant();
			System.out.println("Entrer votre references de midicament : ");
			ref = myInput.nextInt();
			System.out.println(ph.RechercheMedicament(ref));
			break;
		}   
		}
	System.out.println("voulez vous quiter 1- oui 2- Non");
	}
	System.out.println("Fin programme");


	
	

}

		
	}
