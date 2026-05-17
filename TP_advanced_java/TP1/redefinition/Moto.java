public class Moto extends Vehicule {
    
    private String marque;
    private int puissance;

    // Conctructeur
    public Moto(String nom, double prix, String marque, int puissance){
        super(nom, prix);
        this.marque = marque;
        this.puissance = puissance;
    }

    // Redefinition de la methode emettreSon()
    @Override
    public void emettreSon(){
        System.out.println("La moto rugit.");
    }

    // Redefinition de la methode afficherInformations()
    @Override
    public void afficherInformations(){
        super.afficherInformations();
        System.out.println("La marque du Moto: " + marque);
        System.out.println("La puissance du Moto: " + puissance);
    }
}