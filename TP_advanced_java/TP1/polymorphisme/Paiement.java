public abstract class Paiement {
    private double montant;
    private double numDeTransaction;

    public Paiement(double montant, double numDeTransaction) {
        this.montant = montant;
        this.numDeTransaction = numDeTransaction;
    }

    public abstract Double effectuerPaiement(double montant);
}