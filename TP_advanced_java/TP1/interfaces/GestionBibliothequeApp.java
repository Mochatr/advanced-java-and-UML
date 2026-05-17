import jdk.jshell.execution.Util;

public class GestionBibliothequeApp {
    public static void main(String[] args) {

        // Livre Objects  
        Livre livre1 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", false);
        Livre livre2 = new Livre("1984", "George Orwell", false);
        Livre livre3 = new Livre("To Kill a Mockingbird", "Harper Lee", false);


        DVD dvd1 = new DVD("The dark knight", "Christopher Nolan", false);
        DVD dvd2 = new DVD("Inception", "Christopher Nolan", false);
        DVD dvd3 = new DVD("Interstellar", "Christopher Nolan", false);
        
        Utilisateur utilisateur1 = new Utilisateur("Mohamed");
        Utilisateur utilisateur2 = new Utilisateur("Sara");
        Utilisateur utilisateur3 = new Utilisateur("Adam");
        
        utilisateur1.emprunterObject(livre2);
        utilisateur2.emprunterObject(livre1); 
        utilisateur3.emprunterObject(livre3); 

        utilisateur1.emprunterObject(dvd3); 
        utilisateur2.emprunterObject(dvd2);   
        utilisateur3.emprunterObject(dvd1);   
        
        utilisateur1.retournerObject(livre1); 
        utilisateur2.retournerObject(livre2);   
        utilisateur3.retournerObject(livre3);  

        utilisateur1.retournerObject(dvd1);  
        utilisateur2.retournerObject(dvd2);   
        utilisateur3.retournerObject(dvd3);   
    }
}