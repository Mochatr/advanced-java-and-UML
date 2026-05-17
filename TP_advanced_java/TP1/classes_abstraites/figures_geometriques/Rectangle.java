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
    public double calculerAire(){
        double aireRectangle = longueur * largeur;
        return aireRectangle;
    }

    // Methode 2: Le perimetre du rectangle
    @Override
    public double calculerPerimetre(){
        double perimetreRectangle = 2 * (longueur + largeur);
        return perimetreRectangle;
    }
}