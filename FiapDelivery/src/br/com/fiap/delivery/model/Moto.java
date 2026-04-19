package br.com.fiap.delivery.model;

//o estagiário usou nomes péssimos para a caracterizção dos nomes de objetos,
//ele também não colocou o nome das classes em maiusculo


public class Moto extends Veiculo {
    private boolean possuiBau;

    public Moto(String placa, double capacidade, boolean possuiBau) {
        super(placa, capacidade);
        this.possuiBau = possuiBau;
    }

    public boolean isPossuiBau() { return possuiBau; }
    private void setPossuiBau(boolean possuiBau) { this.possuiBau = possuiBau; }
}