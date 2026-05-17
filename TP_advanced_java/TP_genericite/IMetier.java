import java.util.List;

public interface IMetier<T> {
    void add(T o);          // Ajoute un objet à la liste [cite: 125]
    List<T> getAll();       // Retourne la liste complète [cite: 126]
    T findById(long id);    // Recherche un objet par son identifiant [cite: 127]
    void delete(long id);   // Supprime un objet par son identifiant [cite: 128]
}