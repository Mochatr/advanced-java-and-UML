public class Main {
    public static void main(String[] args) {
        try {
            EntierNaturel entier = new EntierNaturel(5);
            System.out.println("Valeur initiale : " + entier.getVal());

            entier.decrementer();
            System.out.println("Après décrémentation : " + entier.getVal());

            // Test de l'exception sur le setVal
            entier.setVal(-3); 
            
        } catch (NombreNegatifException e) {
            System.out.println(e.getMessage() + " Valeur erronée : " + e.getValeurErronee());
        }

        try {
            // Test de l'exception sur la décrémentation
            EntierNaturel entier2 = new EntierNaturel(0);
            entier2.decrementer();
        } catch (NombreNegatifException e) {
            System.out.println(e.getMessage() + " Valeur erronée : " + e.getValeurErronee());
        }
    }
}