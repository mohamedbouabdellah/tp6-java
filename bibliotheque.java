package tp6;

public class bibliotheque {
	private document[] listdoc ;
	private int nb_doc ;
	private int capacite ;
	
	
	public bibliotheque(int capacite) {
		this.capacite = capacite;
		this.listdoc = new document[capacite];
		this.nb_doc = 0;
		
	}


	public int getNb_doc() {
		return nb_doc;
	}
	public int getCapacite() {
		return capacite;
	}
	
	public void ajout_doc(document d) {
		if (nb_doc> capacite) {
			System.out.println( "La bibliotheque est plein") ;
		}
		else {
			int i=nb_doc -1 ;
			while (i>=0 && listdoc[i].getNum()> d.getNum()) {
				listdoc[i+1]=listdoc[i];
				i-- ;
				
			}
			listdoc[i+1]=d ;
			nb_doc+=1 ;
		}
	}
	
	public void supprim_doc(int num) {
		int i = 0;
		while (i<nb_doc && listdoc[i].getNum()!=num) {
			i++;
		}
		if (i>=nb_doc) {
			System.out.println("Document introuvable");
		}
		else {
			for (int j=i ; i<nb_doc-1 ; j++) {
				listdoc[j]=listdoc[j+1];
				
			}
			nb_doc-=1 ;
			System.out.println("Document supprimé.");
		}
		
	}
	
	public void inventaire_doc() {
		for (int i = 0 ; i<nb_doc ; i++) {
			listdoc[i].edition();
			System.out.println("------------------------");
		}
	}
	
	public bibliotheque liste_livre() {
		bibliotheque b =new bibliotheque (capacite) ;
		for (int i =0 ; i<nb_doc ; i++) {
			if (listdoc[i] instanceof livre) {
				b.ajout_doc(listdoc[i]);
			}
		}
		return b ;
	}
	
	public bibliotheque liste_article() {
		bibliotheque b = new bibliotheque(capacite);
		for (int i = 0; i < nb_doc; i++) {
            if (listdoc[i] instanceof article && !(listdoc[i] instanceof livre)) b.ajout_doc(listdoc[i]);
        }
        return b;
	}
	
	public bibliotheque liste_docsimple() {
		bibliotheque b =new bibliotheque (capacite) ;
		for (int i =0 ; i<nb_doc ; i++) {
			if (listdoc[i] instanceof document) {
				b.ajout_doc(listdoc[i]);
			}
		}
		return b ;
	}
	
	public bibliotheque liste_periodique() {
		bibliotheque b =new bibliotheque (capacite) ;
		for (int i =0 ; i<nb_doc ; i++) {
			if (listdoc[i] instanceof periodique) {
				b.ajout_doc(listdoc[i]);
			}
		}
		return b ;
	}
	
	
	
	
	
	
	
	
	
	
}
