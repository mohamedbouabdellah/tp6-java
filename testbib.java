package tp6;


public class testbib {
    public static void main(String[] args) {
        bibliotheque biblio = new bibliotheque(10);

        document d1 = new document("Doc1", 1, 50);
        article a1 = new article("Article1", 2, 30, "Auteur A");
        livre l1 = new livre("Livre1", 3, 200, "Auteur L", "Éditeur L");
        periodique p1 = new periodique("Periodique1", 4, 40, "Mensuel");

        biblio.ajout_doc(d1);
        biblio.ajout_doc(a1);
        biblio.ajout_doc(l1);
        biblio.ajout_doc(p1);

        System.out.println("Inventaire complet:");
        biblio.inventaire_doc();

        System.out.println("\nListe des livres:");
        biblio.liste_livre().inventaire_doc();
    }
}

