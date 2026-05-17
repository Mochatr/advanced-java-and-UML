public class PayPal extends Paiement {
    private String email;

    public PayPal(double montant, double numDeTransaction, String email) {
        super(montant, numDeTransaction);
        this.email = email;
    }

    @Override
    public Double effectuerPaiement(double montant) {
        System.out.println("Paiement de " + montant + " effectué avec PayPal pour l'adresse e-mail " + email);
        return montant;
    }
}