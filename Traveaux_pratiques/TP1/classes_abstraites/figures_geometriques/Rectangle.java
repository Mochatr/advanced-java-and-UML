public class Rectangle extends Figure {
    // Attributs
    private double longueur;
    private double largeur;

    // Constructeurs
    public Rectangle(String nom, double longueur, double largeur){
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // Methode 1: l'aire du rectangle
    @Override
    public void calculerAire(){
        double aireRectangle = longueur * largeur;
        System.out.println("L'aire du rectangle est : " + (int)aireRectangle);
    }

    // Methode 2: Le perimetre du rectangle
    @Override
    public void calculerPerimetre(){
        double perimetreRectangle = 2 * (longueur + largeur);
        System.out.println("Le périmètre du rectangle est : " + (int)perimetreRectangle);
    }
}