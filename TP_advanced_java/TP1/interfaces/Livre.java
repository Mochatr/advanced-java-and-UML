public class Livre implements Empruntable {
    private String titre;
    private String auteur;
    private boolean estemprunte;

    public Livre(String titre, String auteur, boolean estemprunte) {
        this.titre = titre;
        this.auteur = auteur;
        this.estemprunte = false; // Livre est disponible par défaut
    }

    @Override
    public void emprunter(){
        if (!estemprunte){
            estemprunte = true; // Livre est emprunté
            System.out.println("Vous avez emprunté le livre : " + titre);
        } else {
            System.out.println("Désolé, le livre " + titre + " est déjà emprunté.");
        }
    }

    @Override
    public void retourner(){
        if (estemprunte){
            estemprunte = false;
            System.out.println("Merci d'avoir rendu le livre: " + titre);
        }
    }



}