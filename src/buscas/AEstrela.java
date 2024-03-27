package buscas;

import estruturas.VetorOrdenadoAdjacente;
import grafoestacoes.Adjacente;
import grafoestacoes.Estacao;
import grafoestacoes.Mapa;

public class AEstrela {
    private VetorOrdenadoAdjacente fronteira;
    private Estacao objetivo;
    private boolean achou;

    public AEstrela(Estacao objetivo){
        this.objetivo = objetivo;
        achou = false;
    }
    public void buscar(Estacao atual) {
        System.out.println("\n * Atual: " + atual.getNome());
        atual.setVisitado(true);

        if (atual == objetivo) {
            achou = true;
        }
        else {
            fronteira = new VetorOrdenadoAdjacente(atual.getAdjacentes().size());
            for (Adjacente a: atual.getAdjacentes()) {
                if(!a.getEstacao().isVisitado()){
                    a.getEstacao().setVisitado(true);
                    fronteira.inserir(a); // pararemtro é o adjacente
                }
            }

            fronteira.mostrar();
            if(fronteira.getPrimeiro() != null){
                buscar(fronteira.getPrimeiro());
            }

        }
    }

    // teste metodo main

    public static void main(String args[]){
        Mapa mapa = new Mapa();
        AEstrela a = new AEstrela(mapa.getE1()); // estado objetivo
        a.buscar(mapa.getE14()); // estado inicial
    }

}
