public class GestionPaiementApp {
    public static void main(String[] args) {
        Paiement carte = new CarteCredit(150.0, 101, 123456789);
        Paiement paypal = new PayPal(80.0, 102, "j.doe@email.com");

        Commande cmd1 = new Commande(150.0, carte);
        Commande cmd2 = new Commande(80.0, paypal);

        System.out.println("--- Traitement des paiements ---");
        cmd1.processPayment(); // Appelle CarteCredit.effectuerPaiement()
        cmd2.processPayment(); // Appelle PayPal.effectuerPaiement()
    }
}