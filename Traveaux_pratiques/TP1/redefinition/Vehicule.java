public class Vehicule {
    private String nom;
    private double prix;

    // Constructeur
    public Vehicule(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    // Methode qui affiche un son générique pour un véhicule.
    public void emettreSon(){
        System.out.println("Le véhicule émet un son inconnu.");
    }

    // Methode qui affiche les informations de base sur le véhicule, y compris son nom et son prix.
    public void afficherInformations(){
        System.out.println("Nom du véhicule: " + nom);
        System.out.println("Prix du véhicule: " + prix + " Dirhams");
    }
}