package br.com.fiap.delivery.model;

//o estagiário usou nomes péssimos para a caracterizção dos nomes de objetos,
//ele também não colocou o nome das classes em maiusculo


public class Pacote {
    private String codigo;
    private double peso;
    private String status;

    public Pacote(String codigo, double peso, String status) {
        this.codigo = codigo;
        this.peso = peso;
        this.status = status;
    }

    public void atualizarStatus(String novoStatus) { this.status = novoStatus; }

    public String getCodigo() { return codigo; }
    public String getStatus() { return status; }
}
