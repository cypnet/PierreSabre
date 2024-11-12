package personnages;

public class Commercant extends humain {
	
	public Commercant(String boissonFavorite) {
		super();
		this.boissonFavorite = "thé";
	}
	
	private int seFaireExtorquer() {
		perdreArgent(quantiteArgent);
		parler("J'ai tout perdu! Le monde est trop injuste");
		return quantiteArgent;
	}
	
	private void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous! Je te remercie généreux donateur!");
	}

}
