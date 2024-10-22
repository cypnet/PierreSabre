package personnages;

public class humain {
	private String nom;
	private String boissonFavorite;
	private int quantiteArgent;
	
	
	
	public humain(String nom, String boissonFavorite, int quantiteArgent) {
		super();
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.quantiteArgent = quantiteArgent;
	}

	public String getNom() {
		return nom;
	}
	
	public String getBoissonFavorite() {
		return boissonFavorite;
	}

	public int getQuantiteArgent() {
		return quantiteArgent;
	}
	
	public void parler(String texte) {
		System.out.println(texte);
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + "et j'aime boire du " + boissonFavorite);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de" + boissonFavorite + "! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (prix<=quantiteArgent) {
			parler("J'ai");
			System.out.println(quantiteArgent);
			quantiteArgent= quantiteArgent-prix;
		} else {
			

		}
		
		
	}
	
	protected void gagnerArgent(int gain) {	
		quantiteArgent= quantiteArgent + gain;
	}
	
	protected void perdreArgent(int perte) {
		quantiteArgent= quantiteArgent - perte;
	}
}
