public class Manager extends Employe {
    //Attribut
    private String service;

    // Constructeur
    public Manager(String nom, String prenom, String email, String telephone, int salaire, String service){
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    // Redefinir la méthode calculerSalaire
    @Override
    public void calculerSalaire(){
        int nvSalaire = getSalaire() + (int)(getSalaire() * 0.20);
        System.out.println("le salaire du manager du service " + service + " est " + nvSalaire);
    }

    // Redefinir la méthode toString pour afficher les informations du manager
    @Override
    public String toString() {
        return super.toString() + "\nService : " + service;
    }
}