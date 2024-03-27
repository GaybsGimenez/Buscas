package estruturas;

import grafoestacoes.Estacao;
import grafoestacoes.Mapa;

public class VetorOrdenado {
    private Estacao[] estacoes;
    private int numeroElementos;

    public VetorOrdenado(int tamanho) {
        estacoes = new Estacao[tamanho];
        numeroElementos = 0;
    }

    public void inserir(Estacao estacao) {
        int posicao;
        for (posicao = 0; posicao < numeroElementos; posicao++) {
            if (estacoes[posicao].getDistanciaObjetivo() > estacao.getDistanciaObjetivo()) {
                break;
            }
        }

        for (int k = numeroElementos; k > posicao; k--) {
            estacoes[k] = estacoes[k - 1];
        }

        estacoes[posicao] = estacao;
        numeroElementos++;
    }

    public Estacao getPrimeiro() {
        return estacoes[0];
    }

    public void mostrar() {
        for (int i = 0; i < numeroElementos; i++) {
            System.out.println(estacoes[i].getNome() + " - " + estacoes[i].getDistanciaObjetivo());
        }
    }

    public static void main(String args[]) {
        Mapa mapa = new Mapa();
        VetorOrdenado vetor = new VetorOrdenado(5);

        vetor.inserir(mapa.getE1());
        vetor.inserir(mapa.getE8());
        vetor.inserir(mapa.getE11());
        vetor.inserir(mapa.getE14());

        vetor.mostrar();
    }
}
