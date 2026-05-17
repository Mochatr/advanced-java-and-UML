abstract class Figure {
    // Attribut
    private String nom;

    // constructeur
    public Figure(String nom){
        this.nom = nom;
    }

    // Methode abstraite 1: Calcule l'aire de la figure
    public abstract double calculerAire();

    // Methode abstraite 2: Calcule le perimetre de la figure
    public abstract double calculerPerimetre();

    // Methode 3: Affiche le nom de la figure, son aire et son périmètre
    public void afficherDetails(){
        System.out.println("Nom de la figure: " + nom);
        System.out.println("Aire: " + calculerAire());
        System.out.println("Périmètre: " + calculerPerimetre());
    }
}