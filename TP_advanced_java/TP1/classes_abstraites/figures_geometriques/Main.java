public class Main {
    public static void main(String[] args) {
        
        System.out.println("-----------CERCLE-----------");

        Cercle cer1= new Cercle("cercle1", 9.23);
        System.out.println("-----------Détails du cercle-----------");
        cer1.afficherDetails();

        System.out.println("-----------RECTANGLE-----------");

        Rectangle rec1 = new Rectangle("rectangle1", 20, 30);
        System.out.println("-----------Détails du rectangle-----------");
        rec1.afficherDetails();
    }
}