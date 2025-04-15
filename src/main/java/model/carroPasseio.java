
package model;
import javax.swing.JOptionPane;
public class carroPasseio extends Veiculo {
    private String cor;
    private String modelo;

    public carroPasseio() {
    }

    public carroPasseio(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }

    public carroPasseio(String cor, String modelo, int peso, int velocMax, float preco) {
        super(peso, velocMax, preco);
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void leitura() {
       super.leitura();
       setCor(JOptionPane.showInputDialog("Qual a cor do carro que você deseja?"));
       setModelo(JOptionPane.showInputDialog("Qual o modelo do carro?"));
    }
    
    public void imprimir() {
        super.imprimir();
        JOptionPane.showMessageDialog(null, "A cor do carro escolhida foi a "
        + getCor()
        + ", e o modelo é "
        + getModelo());
    }
    
}
