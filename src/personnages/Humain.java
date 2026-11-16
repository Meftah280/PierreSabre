package personnages;

public class Humain {
	// Les attributs
	private String nom;
	private String boissonFavorite;
	private int argent;
	
	//le constructeur
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
	// Les getters
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	// Faire parler un humain
	private void parler(String texte) {
		System.out.println("(" + nom + ")" + texte);
	}
	
	// Dire bonjour
	public void direBonjour() {
		parler("bonjour ! je m'appelle " + nom + "et j'aime boire du" + boissonFavorite);
	}
	
	// Boire
	public void boire() {
		parler("Mmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}
	
	// acheter un bien
	public void acheter(string bien , int prix) {
		parler("je viens d'acheter " + bien + " pour " + prix + "sous. ");
		perdreArgent(prix)
	}
	// Gagner de l'argent
	private void gagnerArgent(int gain) {
		argent = argent + gain;
	}
	// Perdre de l'argent
	private void perdreArgent(int perte) {
		argent =argent - perte;
	}

}
