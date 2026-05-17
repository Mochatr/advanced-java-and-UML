public class Voiture extends Vehicule {
    private String modele;
    private int annee;

    // Construcrteur
    public Voiture (String nom, double prix, String modele, int annee){
        super(nom, prix);
        this.modele = modele;
        this.annee = annee;
    }

    // Redefinir la methode emettreSon
    @Override
    public void emettreSon(){
        System.out.println("La voiture vrombit");
    }

    @Override
    public void afficherInformations(){
        super.afficherInformations();

        // Rajouter les informations spécifiques à la voiture.
        System.out.println("Modèle de la voiture: " + modele);
        System.out.println("Année de fabrication: " + annee); 
    }
}