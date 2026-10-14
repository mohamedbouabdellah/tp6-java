package tp6;

public class livre extends article {
	private String nom_edit;

	public String getNom_edit() {
		return nom_edit;
	}

	public livre(String titre, int num, int nb_p, String nom_auteur, String nom_edit) {
		super(titre, num, nb_p, nom_auteur);
		this.nom_edit = nom_edit;
	}
	
	public String get_type() {
		return "livre" ;
	}
	
	public void edition() {
		super.edition();
		System.out.println("Editeur :" + nom_edit);
	}
}
