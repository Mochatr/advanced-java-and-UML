import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CompteBancaire> listeComptes = new ArrayList<>();

        // Ajouter des comptes
        CompteCourant cc1 = new CompteCourant("CC001", 1000, "Alice", 500);
        CompteEpargne ce1 = new CompteEpargne("CE001", 2000, "Bob", 5);
        listeComptes.add(cc1);
        listeComptes.add(ce1);

        System.out.println("--- Opérations initiales ---");
        cc1.afficherSolde();
        ce1.afficherSolde();

        try {
            // Dépôt et retrait valides
            cc1.deposer(200);
            cc1.retirer(1500); // Utilise le découvert (1200 - 1500 = -300)
            cc1.afficherSolde();

            // Génération d'intérêts
            ce1.genererInterets();

            System.out.println("\n--- Tests de Transfert ---");
            // Transfert valide
            ce1.transferer(500, cc1);
            
            // Transfert vers un compte inexistant
            CompteBancaire compteFantome = null;
            cc1.transferer(100, compteFantome);

        } catch (FondsInsuffisantsException | CompteInexistantException e) {
            System.err.println("Erreur d'opération : " + e.getMessage());
        }

        try {
            System.out.println("\n--- Tests de Retrait en échec ---");
            // Retrait dépassant le découvert
            cc1.retirer(1000);
        } catch (FondsInsuffisantsException e) {
            System.err.println("Erreur de retrait : " + e.getMessage());
        }

        // Supprimer des comptes
        listeComptes.remove(cc1);
        System.out.println("\nComptes actifs restants : " + listeComptes.size());
    }
}