public class MainVehicules {
    public static void main(String[] args){
        Vehicule v1 = new Vehicule("Lamborghini", 2020);
        v1.emettreSon();
        v1.afficherInformations();

        System.out.println("-----------------------------");

        Voiture car1 = new Voiture("Ferrari", 150000, "F8 Tributo", 2020);
        car1.emettreSon();
        car1.afficherInformations();

        System.out.println("-----------------------------");

        Moto moto1 = new Moto("Ducati", 20000, "Panigale V4", 214); 
        moto1.emettreSon();
        moto1.afficherInformations();

        System.out.println("-----------------------------");

        Avion avion1 = new Avion("Boeing 747", 150000000, "Air France", 900);
        avion1.emettreSon();
        avion1.afficherInformations();
    }
}