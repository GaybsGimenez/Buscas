package grafoestacoes;

// Classe que representa uma estacao adjacente em um grafo
public class Adjacente {
    private Estacao estacao; // Representa a estacao adjacente
    private int distancia;
    private int distanciaAEstrela; // Soma dos custos em linha reta e por estacao

    // Construtor da classe Adjacente
    public Adjacente(Estacao estacao, int distancia) {
        this.estacao = estacao; // Inicializa a estacao adjacente com a estacao fornecida como parametro
        this.distancia = distancia;
        this.distanciaAEstrela = this.estacao.getDistanciaObjetivo() + this.distancia; // Distancia em linha reta + distancia pela linha do metro
    }

    // Metodo getter para obter a estacao adjacente
    public Estacao getEstacao() {
        return estacao; // Retorna a estacao adjacente associada a este objeto Adjacente
    }

    // Metodo setter para definir a estacao adjacente
    public void setEstacao(Estacao estacao) {
        this.estacao = estacao; // Define a estacao adjacente associada a este objeto Adjacente com a estacao fornecida como parametro
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getDistanciaAEstrela() {
        return distanciaAEstrela;
    }
}
