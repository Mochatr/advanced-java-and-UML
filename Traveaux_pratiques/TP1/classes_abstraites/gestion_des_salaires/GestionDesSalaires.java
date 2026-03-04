public class GestionDesSalaires {
    public static void main(String[] args){
        Ingénieur ing1 = new Ingénieur("OMARI", "Yasser", "y.omari@gmail.com", "0609876754", 11500, "Backend developer");
        System.out.println("------------INFORMATIONS De l'INGENIEUR------------");
        System.out.println(ing1);

        System.out.println("------------SALAIRE DE L'INGENIEUR------------");
        ing1.calculerSalaire();


        Manager man1 = new Manager("Mohamed", "BENGHAZI", "m.benghazi@gmail.com", "0661876794", 20000, "Transformation digitale");
        System.out.println("------------INFORMATIONS DU MANAGER------------");
        System.out.println(man1);

        System.out.println("------------SALAIRE DU MANAGER------------");
        man1.calculerSalaire();
    }
}