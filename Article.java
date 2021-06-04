package Journal;

public class Article {
	
	private String date;
	private String titre;
	private String nomAuteur;
	private String prenomAuteur;
	private String sujet;
	private String contenu;
	private static Journal journal;
	
//	Constructors 
	
	public Article() {
		
	}
	
	public Article(String date, String titre, String sujet, String contenu, String nom, String prenom) throws ExceptionArticle {
		setDate(date);
		setTitre(titre);
		setSujet(sujet);
		setContenu(contenu);
		setNomAuteur(nom);
		setPrenomAuteur(prenom);
	}
	
//	Getters and Setters
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) throws ExceptionArticle {
		if (date.matches("^[0-9]{2}/[0-9]{2}/[0-9]{4}$"))
			this.date = date;
		else
			throw new ExceptionArticle("La date n'est pas écrite au bon format.");
			
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getSujet() {
		return sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public String getNomAuteur() {
		return nomAuteur;
	}

	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
	}

	public String getPrenomAuteur() {
		return prenomAuteur;
	}

	public void setPrenomAuteur(String prenomAuteur) {
		this.prenomAuteur = prenomAuteur;
	}

	public static Journal getJournal() {
		return journal;
	}

	public static void setJournal(Journal journal) {
		Article.journal = journal;

//	Methodes

	}
	
	public String toString() {
		return "Article [date=" + date + ", titre=" + titre + ", sujet=" + sujet + ", contenu=" + contenu + "]";
	}
}
