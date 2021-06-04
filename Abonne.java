package Journal;

public class Abonne implements Observateur {

	private String nom;
	private String prenom;
	private int numAbonnement;
	private Journal journal;

	
//	Constructors
	
	public Abonne() {

	}
	
	public Abonne(String nom, String prenom, Journal journal, int numAbonnement) {
		setNom(nom);
		setPrenom(prenom);
		setNumAbonnement(numAbonnement);
		setJournal(journal);
		journal.inscription(this);
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

	public int getNumAbonnement() {
		return numAbonnement;
	}

	public void setNumAbonnement(int numAbonnement) {
		this.numAbonnement = numAbonnement;
	}
	
	public void getJournal() {
		
	}
	
	public void setJournal(Journal journal) {
		this.journal = journal;
	}
	
//	Methodes

	public String toString() {
		return "Abonne [nom=" + nom + ", prenom=" + prenom + ", numAbonnement=" + numAbonnement + "]";
	}

	public void update(String message) {
		System.out.println(journal.getNom() + ": " + getPrenom() + ", " + message);
	}
}
