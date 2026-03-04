public class Ingénieur extends Employe {
    // Attributs
    private String spécialité;

    // Contructeur
    public Ingénieur(String nom, String prenom, String email, String telephone, int salaire, String spécialité) {
        super(nom, prenom, email, telephone, salaire);
        this.spécialité = spécialité;
    }

    // Implémentation de la méthode abstraite
    @Override
    public void calculerSalaire(){
        int nvSalaire = getSalaire() + (int)(getSalaire() * 0.15);
        System.out.println("Le salaire de l'ingénieur " + spécialité + " est : " + nvSalaire);
    }

    // Redefinir la méthode toString pour afficher les informations de l'ingénieur
    @Override
    public String toString() {
        return super.toString() + "\nSpécialité : " + spécialité;
    }
}