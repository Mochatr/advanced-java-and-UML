public class Avion extends Vehicule {
    private String compagnie;
    private int vitesseMax;

    // constructeur
    public Avion(String nom, double prix, String compagnie, int vitesseMax){
        super(nom, prix);
        this.compagnie = compagnie;
        this.vitesseMax = vitesseMax;
    }

    // Redefinir la methode emettreSon
    @Override
    public void emettreSon(){
        System.out.println("L'avion fait un bruit du moteur puissant");
    }

    // Redefinir la methode afficherInformations
    @Override
    public void afficherInformations(){
        super.afficherInformations();
        // Rajouter les informations spécifiques à l'avion.
        System.out.println("Compagnie aérienne: " + compagnie);
        System.out.println("Vitesse maximale: " + vitesseMax + " km/h");
    }
}

