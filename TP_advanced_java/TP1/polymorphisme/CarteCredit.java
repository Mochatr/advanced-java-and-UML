public class CarteCredit extends Paiement {
    private double numDeCarte;

    public CarteCredit(double montant, double numDeTransaction, double numDeCarte) {
        super(montant, numDeTransaction);
        this.numDeCarte = numDeCarte;
    }

    @Override
    public Double effectuerPaiement(double montant) {
        System.out.println("Paiement de " + montant + " effectué avec la carte de crédit numéro " + numDeCarte);
        return montant;
    }
}