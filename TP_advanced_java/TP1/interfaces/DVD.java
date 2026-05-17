public class DVD implements Empruntable {
    private String titre;
    private String realisateur;
    private boolean estemprunte; 
    
    public DVD(String titre, String realisateur, boolean estemprunte) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.estemprunte = estemprunte; // DVD est disponible par défaut
    }

    @Override
    public void emprunter(){
        if (!estemprunte){
            estemprunte = true; // DVD est emprunté
            System.out.println("Vous avez emprunté le DVD : " + titre);
        } else {
            System.out.println("Désolé, le DVD " + titre + " est déjà emprunté.");
        }
    }

    @Override
    public void retourner(){
        estemprunte = false;
        System.out.println("Merci d'avoir rendu le DVD: " + titre); 
    }
}