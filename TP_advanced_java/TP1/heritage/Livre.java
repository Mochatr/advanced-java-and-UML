public class Livre {
    private long ISBN;
    private String titre;
    private Auteur auteur;


    // Constructor
    public Livre(long ISBN, String titre, Auteur auteur){
        this.ISBN = ISBN;
        this.titre = titre;
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Livre: " + "\n" + 
        "ISBN: " + ISBN + "\n" +
        "Titre: " + titre + "\n" +
        "Auteur: " + auteur;
    }


}