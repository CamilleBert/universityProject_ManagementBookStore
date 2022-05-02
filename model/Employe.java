package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

public class Employe implements Serializable {
	
    // Attributs
	public static int totalE;
    private int id; 
	private String nom;
    private String prenom;
    private float salaire;
    private String fonction;
    private String adresse;
    private String mail;
    private String tel;
    private LocalDate dateNaiss;
    private int age;
    private String sexe;
    
    // Constructeur
    
    public Employe(String n, String p, float s, String f, String a, String ml, String t, LocalDate dateN) {
    	nom = n; 
    	prenom = p;
    	salaire = s;
    	fonction = f;
    	adresse = a;
    	mail = ml;
    	tel = t;
    	dateNaiss = dateN;
    	id = totalE;
    	totalE++;
    }
    
    public Employe() {
    	totalE = 0;
    }
    
    // Méthodes

    
    public int getId() {
    	return id;
    }
    
    public String getNom() {
    	return nom;
    }
    
    public void setNom(String a) {
    	nom = a;
    }
    
    public String getPrenom() {
    	return prenom;
    }
    
    public void setPrenom(String a) {
    	prenom = a;
    }
    
    public float getSalaire() {
    	return salaire;
    }
    
    public void setSalaire(float a) {
    	salaire = a;
    }
    
    public String getFonction() {
    	return fonction;
    }
    
    public void setFonction(String a) {
    	fonction = a;
    }
    
    public String getAdresse() {
    	return adresse;
    }
    
    public void setAdresse(String a) {
    	adresse = a;
    }
    
    public String getMail() {
    	return mail;
    }
    
    public void setMail(String a) {
    	mail = a;
    }
    
    public String getTel() {
    	return tel;
    }
    
    public void setTel(String a) {
    	tel = a;
    }
    
    public int getAge() {
    	return age;
    }
    
    public void setAge(int a) {
    	age = a;
    }
    
    public String getSexe() {
    	return sexe;
    }
    
    public void setSexe(String a) {
    	sexe = a;
    }
    
    public LocalDate getDateNaissance() {
    	return dateNaiss;
    }
    
    public void setDateNaissance(LocalDate a) {
    	dateNaiss = a;
    }
    
}
