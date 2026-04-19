
package br.com.fiap.delivery.model;

public abstract class Veiculo {
	
	// primeiramente o que eu acho que está errado é que tudo ele colocou como publico, sendo que precisava alterar para privado em alguns pontos
    // se tudo for publico qualquer pessoa pode alterar algumas coisas que nao podem mudar facilmente
	// os acessos foram mudados para getters e setters
	// o estagiário usou nomes péssimos para a caracterizção dos nomes de objetos,
	// ele também não colocou o nome das classes em maiusculo

	private String placa;
    private double capacidade;

    public Veiculo(String placa, double capacidade) {
        this.placa = placa;
        this.capacidade = capacidade;
    }

    public String getPlaca() { return placa; }
    private void setPlaca(String placa) { this.placa = placa; } // Setters com privados

    public double getCapacidade() { return capacidade; }
    private void setCapacidade(double capacidade) { this.capacidade = capacidade; }
}