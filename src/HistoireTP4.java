

import personnages.humain;
public class HistoireTP4 {

	public static void main(String[] args) {
		humain prof = new humain("Prof", "Kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("Kimono", 50);
	}
}
