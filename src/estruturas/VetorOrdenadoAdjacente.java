package estruturas;

import grafoestacoes.Adjacente;
import grafoestacoes.Estacao;
import grafoestacoes.Mapa;

public class VetorOrdenadoAdjacente {
    private Adjacente[] adjacentes;
    private int numeroElementos;
    
    public VetorOrdenadoAdjacente(int tamanho) {
        adjacentes = new Adjacente[tamanho];
        numeroElementos = 0;
    }
    
    public void inserir(Adjacente adjacente) {
        int posicao;
        for (posicao = 0; posicao < numeroElementos; posicao++) {
            if (adjacentes[posicao].getDistanciaAEstrela() > adjacente.getDistanciaAEstrela()) {
                break;
            }
        }
        
        for (int k = numeroElementos; k > posicao; k--) {
            adjacentes[k] = adjacentes[k - 1];
        }
        
        adjacentes[posicao] = adjacente;
        numeroElementos++;
    }

    public Estacao getPrimeiro() {
        if (numeroElementos > 0 && adjacentes[0] != null) {
            return adjacentes[0].getEstacao();
        } else {
            return null; // lançar uma exceção
        }
    }


    public void mostrar() {
        for (int i = 0; i < numeroElementos; i++) {
            System.out.println(adjacentes[i].getEstacao().getNome() + " - " + adjacentes[i].getDistanciaAEstrela());
        }
    }

}
