package Journal;

import java.util.ArrayList;

public class Journal implements Observable {
	
	private String nom;
	private ArrayList<Redacteur> redac = new ArrayList<Redacteur>();
	private ArrayList<Abonne> abonnes = new ArrayList<Abonne>();
	private ArrayList<Article> articles = new ArrayList<Article>();
	private static Journal journal;

//	Constructor
	public Journal() {
	
	}
	
	public Journal(String nom) {
		setNom(nom);
	}
	
//	Getters and Setter
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Redacteur> getRedac() {
		return redac;
	}

	public void setRedac(ArrayList<Redacteur> redac) {
		this.redac = redac;
	}
	
	public ArrayList<Article> getArticles() {
		return articles;
	}

	public void setArticles(ArrayList<Article> articles) {
		this.articles = articles;
	}

	public static Journal getJournal() {
		return journal;
	}

	public static void setJournal(Journal journal) {
		Journal.journal = journal;
	}


	public ArrayList<Abonne> getAbonnes() {
		return abonnes;
	}

	public void setAbonnes(ArrayList<Abonne> abonnes) {
		this.abonnes = abonnes;
	}
	
//	Methodes
	



	@Override
	public String toString() {
		return "Journal [nom=" + nom + "\nredac=" + redac + "\nabonnes=" + abonnes + "\narticles=" + articles + "]";
	}
	
	public static Journal getInstance() {

		return new Journal();
}
	
	public static Journal getInstance(String nom) {

		if (journal == null) {
			System.out.println("Création du journal: " + nom);
			journal = new Journal(nom);
		} else 
			System.out.println("Le compte existe déjà, il est juste renvoyé.");
		return journal;
		}
	
	public void inscription(Abonne abonne) {
	this.abonnes.add(abonne);
	}
	
	public void inscriptionRedac(Redacteur redacteur) {
	this.redac.add(redacteur);
	}
	
	public void addArticle (Article article) {
		this.articles.add(article);
		notifier("l'article: \"" + article.getTitre() + "\" paru le: " + article.getDate() + ", écrit par " + article.getNomAuteur() + " " + article.getPrenomAuteur() + " est maintenant disponible sur le site.");
		}
	
	public void notifier(String message) {
		for (Abonne abonne : this.abonnes) {
			abonne.update(message);
		}
	}
}
