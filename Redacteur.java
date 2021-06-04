package Journal;

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
			Article article1 = new Article("04/06/2021", "Les chaussons aux pommes", "Nourriture", "En vrai c'est pas dingue.", getNom(), getPrenom());
			this.journal.addArticle(article1);
		} catch (ExceptionArticle e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep((int) Math.floor(Math.random() * 3000));
		} catch (InterruptedException e) {

		}
		try {
			Article article2 = new Article("04/06/2021", "Les profiterolles", "Nourriture", "Ca par contre c'est délicieux.", getNom(), getPrenom());
			this.journal.addArticle(article2);
		} catch (ExceptionArticle e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep((int) Math.floor(Math.random() * 3000));
		} catch (InterruptedException e) {

		}
		try {
			Article article3 = new Article("04/06/2021", "Les pains aux raisins", "Nourriture", "J'aime pas du tout.", getNom(), getPrenom());
			this.journal.addArticle(article3);
		} catch (ExceptionArticle e) {
			e.printStackTrace();
		}
		
	}
}
