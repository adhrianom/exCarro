package Principal.excarro;
import model.Veiculo;
import model.carroPasseio;
import model.Caminhao;
public class ExCarro {

    public static void main(String[] args) {
        /* Executar apenas o veiculo
        
        Veiculo vc = new Veiculo();
        vc.leitura();
        vc.imprimir();
        */
        
        /* Executar apenas o carro de passeio
        
        carroPasseio passeio = new carroPasseio();
        passeio.leitura();
        passeio.imprimir();
        */
        
        Caminhao caminhao = new Caminhao();
        caminhao.leitura();
        caminhao.imprimir();
    }
}
