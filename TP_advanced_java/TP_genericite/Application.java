// Application.java
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        IMetier<Produit> metier = new MetierProduitImpl();
        Scanner scanner = new Scanner(System.in);
        boolean enCours = true;

        // Quelques données de test initiales optionnelles
        metier.add(new Produit(101, "MacBook Pro", "Apple", 23000.00, "M3 Chip 16GB RAM", 8));
        metier.add(new Produit(102, "ThinkPad X1", "Lenovo", 18500.00, "Intel i7 Core VPro", 12));

        while (enCours) {
            System.out.println("\n================= MENU PRODUIT =================");
            System.out.println("1. Afficher la liste des produits.");         // [cite: 132]
            System.out.println("2. Rechercher un produit par son id.");       // [cite: 133]
            System.out.println("3. Ajouter un nouveau produit dans la liste.");// [cite: 134]
            System.out.println("4. Supprimer un produit par id.");             // [cite: 135]
            System.out.println("5. Quitter ce programme.");                   // [cite: 136]
            System.out.print("Veuillez choisir une option (1-5) : ");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer le retour à la ligne restant

            switch (choix) {
                case 1:
                    System.out.println("\n--- LISTE DES PRODUITS ---");
                    List<Produit> liste = metier.getAll();
                    if (liste.isEmpty()) {
                        System.out.println("Aucun produit en stock actuellement.");
                    } else {
                        liste.forEach(System.out::println);
                    }
                    break;

                case 2:
                    System.out.print("\nEntrez l'ID du produit à rechercher : ");
                    long idRecherche = scanner.nextLong();
                    Produit pTrouve = metier.findById(idRecherche);
                    if (pTrouve != null) {
                        System.out.println("Produit trouvé : " + pTrouve);
                    } else {
                        System.out.println("Aucun produit ne possède l'ID : " + idRecherche);
                    }
                    break;

                case 3:
                    System.out.println("\n--- AJOUT D'UN NOUVEAU PRODUIT ---");
                    System.out.print("ID : ");
                    long id = scanner.nextLong();
                    scanner.nextLine(); 

                    System.out.print("Nom : ");
                    String nom = scanner.nextLine();

                    System.out.print("Marque : ");
                    String marque = scanner.nextLine();

                    System.out.print("Prix (DH) : ");
                    double prix = scanner.nextDouble();
                    scanner.nextLine(); 

                    System.out.print("Description : ");
                    String description = scanner.nextLine();

                    System.out.print("Nombre en stock : ");
                    int stock = scanner.nextInt();

                    Produit nouveauProduit = new Produit(id, nom, marque, prix, description, stock);
                    metier.add(nouveauProduit);
                    System.out.println("> Produit enregistré avec succès !");
                    break;

                case 4:
                    System.out.print("\nEntrez l'ID du produit à supprimer : ");
                    long idSuppression = scanner.nextLong();
                    metier.delete(idSuppression);
                    break;

                case 5:
                    System.out.println("\nFermeture de l'application. Au revoir !");
                    enCours = false;
                    break;

                default:
                    System.out.println("\nChoix invalide ! Veuillez saisir un nombre entre 1 et 5.");
                    break;
            }
        }
        scanner.close();
    }
}