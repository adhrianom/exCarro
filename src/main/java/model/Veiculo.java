
package model;
import javax.swing.JOptionPane;
public class Veiculo {
   private int peso;
   private int velocMax;
   private float preco;

    public Veiculo() {
    }

    public Veiculo(int peso, int velocMax, float preco) {
        this.peso = peso;
        this.velocMax = velocMax;
        this.preco = preco;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelocMax() {
        return velocMax;
    }

    public void setVelocMax(int velocMax) {
        this.velocMax = velocMax;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
   
    public void leitura(){
        setPeso(Integer.parseInt(JOptionPane.showInputDialog("Qual o peso do carro em Kg?")));
        setVelocMax(Integer.parseInt(JOptionPane.showInputDialog("Qual a velocidade máxima do veiculo em Km/h ?")));
        setPreco(Float.parseFloat(JOptionPane.showInputDialog("Qual o preço do veiculo em R$?")));
        
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null, "O carro pesa em média " 
                + getPeso() 
                + " Kg, e sua velocidade máxima é de "
                + getVelocMax() 
                + " Km/h, custando em média: R$ "
                + String.format("%.3f%n", getPreco()));
                
                
    }
}
