abstract class Employe {
    // Attributs
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private int salaire;

    // constructeur
    public Employe(String nom, String prenom, String email, String telephone, int salaire){
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.salaire = salaire;
    }

    // getters et setters
    public int getSalaire() {
        return this.salaire;
    }

    // Methode abstraite
    public abstract void calculerSalaire();

    // Tostring methode pour affichage des informations de l'employé
    @Override
    public String toString() {
        return "Nom: " + nom + "\n" +
                "Prénom: " + prenom + "\n" +
                "Email: " + email + "\n" +
                "Téléphone: " + telephone + "\n" +
                "Salaire : " + salaire;
    }
}