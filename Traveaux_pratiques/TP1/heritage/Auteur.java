public class Auteur extends Personne {
    // Attribute
    private int numAuteur;

    // constructor
    public Auteur(String nom, String prenom, String email, String tel, int age, int numAuteur) {
        super(nom, prenom, email, tel, age);
        this.numAuteur = numAuteur;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + 
        "numAuteur: " + numAuteur;
    }
}