package com.breif.pharmacie;

public enum Gestion {
AJOUTER("Ajouter avec succes"),SUPPRIMER("Supprimer avec succes"),MODIFIER("Modofier Avec Succes"),ERROR("Dont find");
	private String Msg;
 Gestion (String Msg){
	this.Msg=Msg;
	}
 //Set
 public String getMessage() {
	 return this.Msg;
 }
 public void AfficherMsg(String choix,String Msg) {
	 System.out.println(choix + Msg );
 }
}
