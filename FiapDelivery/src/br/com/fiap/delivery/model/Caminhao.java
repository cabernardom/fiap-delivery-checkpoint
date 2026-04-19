package br.com.fiap.delivery.model;

// as classes caminhao e moto repetiam os atributos de placa e capacidade
// caminhao e moto agora herdam de Veiculo, eliminando a repetição 
// o estagiário usou nomes péssimos para a caracterizção dos nomes de objetos,
// ele também não colocou o nome das classes em maiusculo
// faltou criar pacotes para organizar as classes, tava tudo solto

public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, double capacidade, int eixos) {
        super(placa, capacidade);
        this.eixos = eixos;
    }

    public int getEixos() { return eixos; }
    private void setEixos(int eixos) { this.eixos = eixos; }
}