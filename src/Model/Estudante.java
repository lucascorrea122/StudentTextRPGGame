package Model;

/**
 * @author Flávia
 */
public class Estudante {

    private String nome;
    private int forca = 0;
    private int nivelLucidez = 100;
    private int saude = 100;
    private double dinheiro = 1000;

    int vetorVisitados[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    public String getNome() {
        return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getLucidez() {
        return nivelLucidez;
    }

    public void setLucidez(int nivelLucidez) {
        this.nivelLucidez = nivelLucidez;

    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;

    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void debitar(double custo) {
        dinheiro = dinheiro - custo;

    }

    public void visitarLocal(Locais local) {
        int i = local.getIndice();
        this.vetorVisitados[i]++;
    }
}
