package grafoestacoes;

public class Mapa {
    private Estacao e1red;
    private Estacao e2redGreen;
    private Estacao e3redBlue;
    private Estacao e4redYellow;
    private Estacao e5yellow;
    private Estacao e6blue;
    private Estacao e7blueGreen;
    private Estacao e8blueYellow;
    private Estacao e9yellowGreen;
    private Estacao e10greenBlue;
    private Estacao e11yellow;
    private Estacao e12blue;
    private Estacao e13green;
    private Estacao e14red;

    // Criar instâncias de todas as estações
    public Mapa() {
        e1red = new Estacao("Estação 1 - linha Vermelha", 17);
        e2redGreen = new Estacao("Estação 2 - Permite troca entre as linhas Vermelha e Verde", 13);
        e3redBlue = new Estacao("Estação 3 - Permite troca entre as linhas Vermelha e Azul", 10);
        e4redYellow = new Estacao("Estação 4 - Permite troca entre as linhas Vermelha e Amarela", 6);
        e5yellow = new Estacao("Estação 5 - Linha Amarela", 7);
        e6blue = new Estacao("Estação 6 - Linha Azul", 21);
        e7blueGreen = new Estacao("Estação 7 - Permite troca entre as linhas Azul e Verde", 17);
        e8blueYellow = new Estacao("Estação 8 - Permite troca entre as linhas azul e amarela", 6);
        e9yellowGreen = new Estacao("Estação 9 - Permite troca entre as linhas Amarela e Verde", 10);
        e10greenBlue = new Estacao("Estação 10 - Permite troca entre as linhas Verde e Azul", 8);
        e11yellow = new Estacao("Estação 11 - Linha Amarela", 13);
        e12blue = new Estacao("Estação 12 - Linha Azul", 12);
        e13green = new Estacao("Estação 13 - Linha Verde", 6);
        e14red = new Estacao("Estação 14 - Linha Vermelha", 0);


        // Definir as arestas de estacoes adjacentes a e1
        e1red.addEstacaoAdjacente(new Adjacente(e2redGreen, 4));

        // Definir as arestas de estacoes adjacentes a e2
        e2redGreen.addEstacaoAdjacente(new Adjacente(e1red, 4));
        e2redGreen.addEstacaoAdjacente(new Adjacente(e3redBlue, 5));
        e2redGreen.addEstacaoAdjacente(new Adjacente(e7blueGreen, 14));
        e2redGreen.addEstacaoAdjacente(new Adjacente(e9yellowGreen, 4));

        // Definir as arestas de estacoes adjacentes a e3
        e3redBlue.addEstacaoAdjacente(new Adjacente(e2redGreen, 5));
        e3redBlue.addEstacaoAdjacente(new Adjacente(e4redYellow, 6));
        e3redBlue.addEstacaoAdjacente(new Adjacente(e7blueGreen, 8));
        e3redBlue.addEstacaoAdjacente(new Adjacente(e8blueYellow, 4));

        // Definir as arestas de estacoes adjacentes a e4
        e4redYellow.addEstacaoAdjacente(new Adjacente(e3redBlue, 6));
        e4redYellow.addEstacaoAdjacente(new Adjacente(e5yellow, 3));
        e4redYellow.addEstacaoAdjacente(new Adjacente(e8blueYellow, 4));
        e4redYellow.addEstacaoAdjacente(new Adjacente(e14red, 6));

        // Definir as arestas de estacoes adjacentes a e5
        e5yellow.addEstacaoAdjacente(new Adjacente(e4redYellow, 3));

        // Definir as arestas de estacoes adjacentes a e6
        e6blue.addEstacaoAdjacente(new Adjacente(e7blueGreen, 3));

        // Definir as arestas de estacoes adjacentes a e7
        e7blueGreen.addEstacaoAdjacente(new Adjacente(e2redGreen, 14));
        e7blueGreen.addEstacaoAdjacente(new Adjacente(e3redBlue, 8));
        e7blueGreen.addEstacaoAdjacente(new Adjacente(e6blue, 3));

        // Definir as arestas de estacoes adjacentes a e8
        e8blueYellow.addEstacaoAdjacente(new Adjacente(e3redBlue, 4));
        e8blueYellow.addEstacaoAdjacente(new Adjacente(e4redYellow, 6));
        e8blueYellow.addEstacaoAdjacente(new Adjacente(e9yellowGreen, 5));
        e8blueYellow.addEstacaoAdjacente(new Adjacente(e10greenBlue, 6));

        // Definir as arestas de estacoes adjacentes a e9
        e9yellowGreen.addEstacaoAdjacente(new Adjacente(e2redGreen, 4));
        e9yellowGreen.addEstacaoAdjacente(new Adjacente(e8blueYellow, 5));
        e9yellowGreen.addEstacaoAdjacente(new Adjacente(e10greenBlue, 3));
        e9yellowGreen.addEstacaoAdjacente(new Adjacente(e11yellow, 3));

        // Definir as arestas de estacoes adjacentes a e10
        e10greenBlue.addEstacaoAdjacente(new Adjacente(e8blueYellow, 6));
        e10greenBlue.addEstacaoAdjacente(new Adjacente(e9yellowGreen, 3));
        e10greenBlue.addEstacaoAdjacente(new Adjacente(e12blue, 6));
        e10greenBlue.addEstacaoAdjacente(new Adjacente(e13green, 9));

        // Definir as arestas de estacoes adjacentes a e11
        e11yellow.addEstacaoAdjacente(new Adjacente(e9yellowGreen, 3));

        // Definir as arestas de estacoes adjacentes a e12
        e12blue.addEstacaoAdjacente(new Adjacente(e10greenBlue, 6));

        // Definir as arestas de estacoes adjacentes a e13
        e13green.addEstacaoAdjacente(new Adjacente(e10greenBlue, 9));

        // Definir as arestas de estacoes adjacentes a e14
        e14red.addEstacaoAdjacente(new Adjacente(e4redYellow, 6));
    }

    public Estacao getE1red() {
        return e1red;
    }

    public void setE1red(Estacao e1red) {
        this.e1red = e1red;
    }

    public Estacao getE2redGreen() {
        return e2redGreen;
    }

    public void setE2redGreen(Estacao e2redGreen) {
        this.e2redGreen = e2redGreen;
    }

    public Estacao getE3redBlue() {
        return e3redBlue;
    }

    public void setE3redBlue(Estacao e3redBlue) {
        this.e3redBlue = e3redBlue;
    }

    public Estacao getE4redYellow() {
        return e4redYellow;
    }

    public void setE4redYellow(Estacao e4redYellow) {
        this.e4redYellow = e4redYellow;
    }

    public Estacao getE5yellow() {
        return e5yellow;
    }

    public void setE5yellow(Estacao e5yellow) {
        this.e5yellow = e5yellow;
    }

    public Estacao getE6blue() {
        return e6blue;
    }

    public void setE6blue(Estacao e6blue) {
        this.e6blue = e6blue;
    }

    public Estacao getE7blueGreen() {
        return e7blueGreen;
    }

    public void setE7blueGreen(Estacao e7blueGreen) {
        this.e7blueGreen = e7blueGreen;
    }

    public Estacao getE8blueYellow() {
        return e8blueYellow;
    }

    public void setE8blueYellow(Estacao e8blueYellow) {
        this.e8blueYellow = e8blueYellow;
    }

    public Estacao getE9yellowGreen() {
        return e9yellowGreen;
    }

    public void setE9yellowGreen(Estacao e9yellowGreen) {
        this.e9yellowGreen = e9yellowGreen;
    }

    public Estacao getE10greenBlue() {
        return e10greenBlue;
    }

    public void setE10greenBlue(Estacao e10greenBlue) {
        this.e10greenBlue = e10greenBlue;
    }

    public Estacao getE11yellow() {
        return e11yellow;
    }

    public void setE11yellow(Estacao e11yellow) {
        this.e11yellow = e11yellow;
    }

    public Estacao getE12blue() {
        return e12blue;
    }

    public void setE12blue(Estacao e12blue) {
        this.e12blue = e12blue;
    }

    public Estacao getE13green() {
        return e13green;
    }

    public void setE13green(Estacao e13green) {
        this.e13green = e13green;
    }

    public Estacao getE14red() {
        return e14red;
    }

    public void setE14red(Estacao e14red) {
        this.e14red = e14red;
    }
}




