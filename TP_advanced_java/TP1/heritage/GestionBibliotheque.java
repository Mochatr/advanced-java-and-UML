public class GestionBibliotheque {
    public static void main(String[] args) {
        // 1. Instanciation de l'adhérent
        Adherent adherent1 = new Adherent("Yasser", "Yazid", "yasser.yazid@example.com", "0600678955", 25, 1);

        // 2. Instanciation de l'auteur
        Auteur auteur1 = new Auteur("Albert", "Camus", "albert.camus@gmail.com", "0600123456", 46, 26678);

        // 3. Instanciation du livre (en passant l'objet auteur1)
        Livre livre1 = new Livre(9782222122L, "L'Étranger", auteur1);

        // 4. Affichage avec mise en forme
        System.out.println("----- INFORMATIONS ADHÉRENT -----");
        System.out.println(adherent1);
        
        System.out.println("\n----- INFORMATIONS LIVRE -----");
        System.out.println(livre1);
    }
}