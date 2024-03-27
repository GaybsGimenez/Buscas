package grafoestacoes;

public class Mapa {
    private Estacao e1;
    private Estacao e2;
    private Estacao e3;
    private Estacao e4;
    private Estacao e5;
    private Estacao e6;
    private Estacao e7;
    private Estacao e8;
    private Estacao e9;
    private Estacao e10;
    private Estacao e11;
    private Estacao e12;
    private Estacao e13;
    private Estacao e14;

    // Criar instâncias de todas as estações
    public Mapa() {
        e1 = new Estacao("E1", 17);
        e2 = new Estacao("E2", 13);
        e3 = new Estacao("E3", 23);
        e4 = new Estacao("E4", 28);
        e5 = new Estacao("E5", 26);
        e6 = new Estacao("E6", 32);
        e7 = new Estacao("E7", 30);
        e8 = new Estacao("E8", 19);
        e9 = new Estacao("E9", 22);
        e10 = new Estacao("E10", 21);
        e11 = new Estacao("E11", 26);
        e12 = new Estacao("E12", 12);
        e13 = new Estacao("E13", 19);
        e14 = new Estacao("E14", 0);


        // Definir as arestas de estacoes adjacentes a e1
        e1.addEstacaoAdjacente(new Adjacente(e2, 4));
        // Definir as arestas de estacoes adjacentes a e2
        e2.addEstacaoAdjacente(new Adjacente(e1, 4));
        e2.addEstacaoAdjacente(new Adjacente(e3, 5));
        e2.addEstacaoAdjacente(new Adjacente(e7, 10));
        e2.addEstacaoAdjacente(new Adjacente(e9, 7));
        // Definir as arestas de estacoes adjacentes a e3
        e3.addEstacaoAdjacente(new Adjacente(e2, 5));
        e3.addEstacaoAdjacente(new Adjacente(e4, 6));
        e3.addEstacaoAdjacente(new Adjacente(e7, 7));
        e3.addEstacaoAdjacente(new Adjacente(e8, 4));
        // Definir as arestas de estacoes adjacentes a e4
        e4.addEstacaoAdjacente(new Adjacente(e3, 6));
        e4.addEstacaoAdjacente(new Adjacente(e5, 12));
        e4.addEstacaoAdjacente(new Adjacente(e8, 9));
        e4.addEstacaoAdjacente(new Adjacente(e14, 28));
        // Definir as arestas de estacoes adjacentes a e5
        e5.addEstacaoAdjacente(new Adjacente(e4, 12));
        // Definir as arestas de estacoes adjacentes a e6
        e6.addEstacaoAdjacente(new Adjacente(e7, 2));
        // Definir as arestas de estacoes adjacentes a e7
        e7.addEstacaoAdjacente(new Adjacente(e2, 10));
        e7.addEstacaoAdjacente(new Adjacente(e3, 7));
        e7.addEstacaoAdjacente(new Adjacente(e6, 2));
        // Definir as arestas de estacoes adjacentes a e8
        e8.addEstacaoAdjacente(new Adjacente(e3, 4));
        e8.addEstacaoAdjacente(new Adjacente(e4, 9));
        e8.addEstacaoAdjacente(new Adjacente(e9, 6));
        e8.addEstacaoAdjacente(new Adjacente(e10, 3));
        // Definir as arestas de estacoes adjacentes a e9
        e9.addEstacaoAdjacente(new Adjacente(e2, 7));
        e9.addEstacaoAdjacente(new Adjacente(e8, 6));
        e9.addEstacaoAdjacente(new Adjacente(e10, 3));
        e9.addEstacaoAdjacente(new Adjacente(e11, 4));
        // Definir as arestas de estacoes adjacentes a e10
        e10.addEstacaoAdjacente(new Adjacente(e8, 3));
        e10.addEstacaoAdjacente(new Adjacente(e9, 3));
        e10.addEstacaoAdjacente(new Adjacente(e12, 5));
        e10.addEstacaoAdjacente(new Adjacente(e13, 4));
        // Definir as arestas de estacoes adjacentes a e11
        e11.addEstacaoAdjacente(new Adjacente(e9, 4));
        // Definir as arestas de estacoes adjacentes a e12
        e12.addEstacaoAdjacente(new Adjacente(e10, 5));
        // Definir as arestas de estacoes adjacentes a e13
        e13.addEstacaoAdjacente(new Adjacente(e10, 4));
        // Definir as arestas de estacoes adjacentes a e14
        e14.addEstacaoAdjacente(new Adjacente(e4, 28));
    }

    public Estacao getE1() {
        return e1;
    }

    public void setE1(Estacao e1) {
        this.e1 = e1;
    }

    public Estacao getE2() {
        return e2;
    }

    public void setE2(Estacao e2) {
        this.e2 = e2;
    }

    public Estacao getE3() {
        return e3;
    }

    public void setE3(Estacao e3) {
        this.e3 = e3;
    }

    public Estacao getE4() {
        return e4;
    }

    public void setE4(Estacao e4) {
        this.e4 = e4;
    }

    public Estacao getE5() {
        return e5;
    }

    public void setE5(Estacao e5) {
        this.e5 = e5;
    }

    public Estacao getE6() {
        return e6;
    }

    public void setE6(Estacao e6) {
        this.e6 = e6;
    }

    public Estacao getE7() {
        return e7;
    }

    public void setE7(Estacao e7) {
        this.e7 = e7;
    }

    public Estacao getE8() {
        return e8;
    }

    public void setE8(Estacao e8) {
        this.e8 = e8;
    }

    public Estacao getE9() {
        return e9;
    }

    public void setE9(Estacao e9) {
        this.e9 = e9;
    }

    public Estacao getE10() {
        return e10;
    }

    public void setE10(Estacao e10) {
        this.e10 = e10;
    }

    public Estacao getE11() {
        return e11;
    }

    public void setE11(Estacao e11) {
        this.e11 = e11;
    }

    public Estacao getE12() {
        return e12;
    }

    public void setE12(Estacao e12) {
        this.e12 = e12;
    }

    public Estacao getE13() {
        return e13;
    }

    public void setE13(Estacao e13) {
        this.e13 = e13;
    }

    public Estacao getE14() {
        return e14;
    }

    public void setE14(Estacao e14) {
        this.e14 = e14;
    }
}




