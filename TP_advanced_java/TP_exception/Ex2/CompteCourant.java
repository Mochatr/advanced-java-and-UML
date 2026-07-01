public class CompteCourant extends CompteBancaire {
    private double decouvertAutorise;

    public CompteCourant(String numeroCompte, double solde, String nomTitulaire, double decouvertAutorise) {
        super(numeroCompte, solde, nomTitulaire);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void retirer(double montant) throws FondsInsuffisantsException {
        if (montant > (solde + decouvertAutorise)) {
            throw new FondsInsuffisantsException("Fonds insuffisants (découvert dépassé) pour " + nomTitulaire);
        }
        solde -= montant;
        System.out.println(montant + " retirés du compte courant de " + nomTitulaire);
    }
}