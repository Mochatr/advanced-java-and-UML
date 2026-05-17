import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit> {
    // Attribut représentant la liste des produits 
    private final List<Produit> produits = new ArrayList<>();

    @Override
    public void add(Produit o) {
        produits.add(o);
    }

    @Override
    public List<Produit> getAll() {
        return produits;
    }

    @Override
    public Produit findById(long id) {
        for (Produit p : produits) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null; // Retourne null si aucun produit ne correspond à l'ID
    }

    @Override
    public void delete(long id) {
        Produit p = findById(id);
        if (p != null) {
            produits.remove(p);
            System.out.println("> Produit supprimé avec succès.");
        } else {
            System.out.println("> Erreur : Aucun produit trouvé avec cet ID.");
        }
    }
}