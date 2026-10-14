package tp6;

public class article extends document  {
	private String nom_auteur ;

	public String getNom_auteur() {
		return nom_auteur;
	}

	public article(String titre, int num, int nb_p, String nom_auteur) {
		super(titre, num, nb_p);
		this.nom_auteur = nom_auteur;
	}
	
	public String get_type() {
		return "Article";
	}
	
	public void edition() {
		super.edition();
		System.out.println("Auteur :" + nom_auteur) ;
	}
}
