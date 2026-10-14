package tp6;

public class periodique extends document {
	private String freq ;

	public String getFreq() {
		return freq;
	}

	public periodique(String titre, int num, int nb_p, String freq) {
		super(titre, num, nb_p);
		this.freq = freq;
	}
	
	public String get_type() {
		return "periodique" ;
	}
	
	public void edition() {
		super.edition();
		System.out.println("Frequence :" + freq) ;
	}
}
