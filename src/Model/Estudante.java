package Model;

/**
 * @author Flávia
 */
public class Estudante {

    private String nome;
    private static int forca = 0;
    private static int nivelLucidez = 80;
    private static int saude = 100;
    private static double dinheiro = 300.00;

    
    
    
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

   public void perderSaude(int saude) {
        setSaude(getSaude() - saude);
        
    }
   public void ganharSaude(int saude) {
        setSaude(getSaude() + saude);
        
    }
   public void setSaude(int saude) {
        this.saude = saude;
   }
   

    public double getDinheiro() {
        return dinheiro;
    }

    public void debitar(double custo) {
        setDinheiro(getDinheiro() - custo);

    }
     public void ganhardinheiro(double custo2) {
        dinheiro = dinheiro + custo2;

    }
     public void perderForca(int forca) {
        this.forca -= forca;

    }
     public void ganharForca(int forca2) {
        setForca(getForca() + forca2);

    }
    public void visitarLocal(Locais local) {
        int i = local.getIndice();
        this.vetorVisitados[i]++;
    }

    /**
     * @param dinheiro the dinheiro to set
     */
    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
    
    public void perderLucidez( int lucidez){
        this.nivelLucidez -= lucidez;
    }

    
    
}
