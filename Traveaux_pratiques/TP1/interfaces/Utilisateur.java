public class Utilisateur {
    private String nom;

    public Utilisateur(String nom) {
        this.nom = nom;
    }

    public void emprunterObject(Empruntable item) {
        item.emprunter();
    }
    
    public void retournerObject(Empruntable item) {
        item.retourner();
    }
}