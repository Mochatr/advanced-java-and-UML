public class Personne {

    // Attributs
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private int age;

    // Constructors
    public Personne(String nom, String prenom, String email, String tel, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.age = age;
        this.tel = tel;
    }

    //Create a toString method to display the attributes of the class
    @Override
    public String toString() {
        return "nom: " + nom + "\n" +
                "prénom: " + prenom + "\n" +
                "email: " + email + "\n" +
                "téléphone: " + tel + "\n" +
                "âge: " + age;
    }
}