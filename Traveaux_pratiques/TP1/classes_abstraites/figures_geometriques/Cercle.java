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
    public void calculerAire(){
        double aireCercle = Math.PI * Math.pow(rayon, 2);
        System.out.println("L'aire du cercle est : " + (int)aireCercle);
    }

    // Mathode 2: Le perimetre du cercle
    @Override
    public void calculerPerimetre(){
        double perimetreCercle = 2 * Math.PI * rayon;
        System.out.println("Le périmètre du cercle est : " + (int)perimetreCercle);
    }
}