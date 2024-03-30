package grafoestacoes;

import java.util.ArrayList;
import java.util.List; // Importa a classe List do pacote java.util

public class Estacao {
    private String nome; // Nome da estacao
    private Boolean visitado; // Indica se a estacao foi visitada durante uma busca
    private int distanciaObjetivo; // Indica distancia até o objetivo
    private List<Adjacente> adjacentes; // Lista de estacoes adjacentes e suas conexoes (distancias)

    // Construtor da classe Estacao
    public Estacao(String nome, int distanciaObjetivo){
        this.nome = nome;
        visitado = false; // false, pois inicialmente, a estacao nao foi visitada
        this.distanciaObjetivo = distanciaObjetivo;
        adjacentes = new ArrayList<Adjacente>(); // Inicializa a lista de estacoes adjacentes
    }

    // Método para adicionar uma estacao adjacente à lista de adjacentes
    public void addEstacaoAdjacente(Adjacente estacao) {
        adjacentes.add(estacao);
    }

    // Métodos getters e setters para os atributos privados

    // Getter para o nome da estacao
    public String getNome() {
        return nome;
    }

    // Setter para o nome da estacao
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para verificar se a estacao foi visitada
    public Boolean getVisitado() {
        return visitado;
    }

    // Setter para marcar se a estacao foi visitada
    public void setVisitado(Boolean visitado) {
        this.visitado = visitado;
    }

    // Getter para obter a lista de estacoes adjacentes
    public List<Adjacente> getAdjacentes() {
        return adjacentes;
    }

    // Método para verificar se a estacao foi visitada
    public boolean isVisitado() {
        return visitado;
    }

    // Getter para obter a distância até o objetivo
    public int getDistanciaObjetivo() {
        return distanciaObjetivo;
    }

    // Setter para definir a distância até o objetivo
    public void setDistanciaObjetivo(int distanciaObjetivo) {
        this.distanciaObjetivo = distanciaObjetivo;
    }
}
