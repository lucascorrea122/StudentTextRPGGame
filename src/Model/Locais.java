package Model;

/**
 *
 * @author Flávia
 */
public enum Locais {
    casa(0), cracolandia(1), onibus(2), metro(3), amigo(4), policia(5), hospital(6), festa(7), faculdade(8);
    private int indice;

    Locais(int indice) {
        this.indice = indice;
    }

    public int getIndice() {
        return indice;
    }
}
