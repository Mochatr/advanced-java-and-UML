public class Cercle extends Figure {
    // Attribut
    private double rayon;

    // Constructeur
    public Cercle(String nom, double rayon){
        super(nom);
        this.rayon = rayon;
    }

    // Methode 1: l'Aire du cercle
    @Override
    public double calculerAire(){
        double aireCercle = Math.PI * Math.pow(rayon, 2);
        return aireCercle;
    }

    // Mathode 2: Le perimetre du cercle
    @Override
    public double calculerPerimetre(){
        double perimetreCercle = 2 * Math.PI * rayon;
        return perimetreCercle;
    }
}