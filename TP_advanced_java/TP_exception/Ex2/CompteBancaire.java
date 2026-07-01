public class CompteBancaire {
    protected String numeroCompte;
    protected double solde;
    protected String nomTitulaire;

    public CompteBancaire(String numeroCompte, double solde, String nomTitulaire) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.nomTitulaire = nomTitulaire;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println(montant + " déposés sur le compte de " + nomTitulaire);
        }
    }

    public void retirer(double montant) throws FondsInsuffisantsException {
        if (montant > solde) {
            throw new FondsInsuffisantsException("Fonds insuffisants pour le retrait sur le compte de " + nomTitulaire);
        }
        solde -= montant;
        System.out.println(montant + " retirés du compte de " + nomTitulaire);
    }

    public void afficherSolde() {
        System.out.println("Solde de " + nomTitulaire + " (" + numeroCompte + ") : " + solde + " MAD");
    }

    public void transferer(double montant, CompteBancaire destinataire) throws FondsInsuffisantsException, CompteInexistantException {
        if (destinataire == null) {
            throw new CompteInexistantException("Échec du transfert : le compte destinataire n'existe pas.");
        }
        this.retirer(montant);
        destinataire.deposer(montant);
        System.out.println("Transfert de " + montant + " MAD effectué avec succès.");
    }
    
    public String getNumeroCompte() {
        return numeroCompte;
    }
}