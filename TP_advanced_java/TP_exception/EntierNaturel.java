public class EntierNaturel {
    private int val;

    public EntierNaturel(int val) throws NombreNegatifException {
        if (val < 0) {
            throw new NombreNegatifException("Erreur : Initialisation avec une valeur négative.", val);
        }
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) throws NombreNegatifException {
        if (val < 0) {
            throw new NombreNegatifException("Erreur : Modification avec une valeur négative.", val);
        }
        this.val = val;
    }

    public void decrementer() throws NombreNegatifException {
        if (this.val - 1 < 0) {
            throw new NombreNegatifException("Erreur : La décrémentation produit une valeur négative.", this.val - 1);
        }
        this.val--;
    }
}