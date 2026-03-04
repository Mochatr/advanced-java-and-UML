abstract class Figure {
    // Attribut
    private String nom;

    // constructeur
    public Figure(String nom){
        this.nom = nom;
    }

    // Methode abstraite 1: Calcule l'aire de la figure
    public abstract void calculerAire();

    // Methode abstraite 2: Calcule le perimetre de la figure
    public abstract void calculerPerimetre();

    // Methode 3: Affiche le nom de la figure, son aire et son périmètre
    public void afficherDetails(){
        System.out.println("Nom de la figure: " + nom);
        calculerAire();
        calculerPerimetre();
    }
}