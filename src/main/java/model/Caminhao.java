
package model;
import javax.swing.JOptionPane;
public class Caminhao extends Veiculo {
    private int cargaMaxima;
    private int alturaMaxima;
    private int comprimento;

    public Caminhao() {
    }

    public Caminhao(int cargaMaxima, int alturaMaxima, int comprimento) {
        this.cargaMaxima = cargaMaxima;
        this.alturaMaxima = alturaMaxima;
        this.comprimento = comprimento;
    }

    public Caminhao(int cargaMaxima, int alturaMaxima, int comprimento, int peso, int velocMax, float preco) {
        super(peso, velocMax, preco);
        this.cargaMaxima = cargaMaxima;
        this.alturaMaxima = alturaMaxima;
        this.comprimento = comprimento;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
    
    public void leitura(){
        super.leitura();
        setCargaMaxima(Integer.parseInt(JOptionPane.showInputDialog("Qual a carga máxima do veiculo? (em Toneladas)")));
        setAlturaMaxima(Integer.parseInt(JOptionPane.showInputDialog("Qual a altura máxima do veiculo?")));
        setComprimento(Integer.parseInt(JOptionPane.showInputDialog("Qual o comprimento do veiculo?")));
    }
    
    public void imprimir(){
        super.imprimir();
  
        JOptionPane.showMessageDialog(null, "A carga máxima do veiculo é de "
         + getCargaMaxima()
         + " toneladas, e a altura máxima é "
         + getAlturaMaxima()
         + " metros, e seu comprimento é de "
         + getComprimento()
         + " metros.");
        
    }
    
}
