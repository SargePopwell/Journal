package Journal;

import java.util.Scanner;

public class Redacteur implements Runnable {

	private String nom;
	private String prenom;
	private Journal journal;
	
//	Constructors
	
	public Redacteur() {
	}
	
	public Redacteur(String nom, String prenom, Journal journal) {
		setNom(nom);
		setPrenom(prenom);
		setJournal(journal);
		journal.inscriptionRedac(this);
	}

//	Getters and Setters

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public Journal getJournal() {
		return journal;
	}

	public void setJournal(Journal journal) {
		this.journal = journal;
	}
	
//	Methodes
	

	

	public void newArticle() throws ExceptionArticle{
		Scanner s = new Scanner(System.in);
		System.out.println("Date de parution de l'article: (xx/xx/xxxx)");
		String date = s.nextLine();
		System.out.println("Titre de l'article:");
		String titre = s.nextLine();
		System.out.println("Sujet de l'article:");
		String sujet = s.nextLine();
		System.out.println("Contenu de l'article:");
		String contenu = s.nextLine();
		
		Article articleN = new Article(date, titre, sujet, contenu, getNom(), getPrenom());
		this.journal.addArticle(articleN);
	}
	
	public String toString() {
		return "Redacteur [nom=" + nom + ", prenom=" + prenom + "]";
	}


	public void run(){
		// Code exécuté par le thread.
		try {
			Thread.sleep((int) Math.floor(Math.random() * 3000));
		} catch (InterruptedException e) {

		}
		try {
			newArticle();
		} catch (ExceptionArticle e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep((int) Math.floor(Math.random() * 3000));
		} catch (InterruptedException e) {

		}
		try {
			newArticle();
		} catch (ExceptionArticle e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep((int) Math.floor(Math.random() * 3000));
		} catch (InterruptedException e) {

		}
		try {
			newArticle();
		} catch (ExceptionArticle e) {
			e.printStackTrace();
		}
	}
}
