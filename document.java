package tp6;

public class document {
	private String titre ;
	private int num ;
	private int nb_p ;
	
	
	
	public document(String titre, int num, int nb_p) {
		this.titre = titre;
		this.num = num;
		this.nb_p = nb_p;
	}

	public void edition () {
		System.out.println(get_type() + ": le titre est "+getTitre()+" le numero : "+getNum() + " le nombre de pages : "+ getNb_p());
	}
	
	public String get_type() {
		return "Document" ;
	}

	public String getTitre() {
		return titre;
	}

	public int getNum() {
		return num;
	}

	public int getNb_p() {
		return nb_p;
	}

	
}
