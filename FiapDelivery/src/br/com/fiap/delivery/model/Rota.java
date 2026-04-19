package br.com.fiap.delivery.model;

// Caminhao e Moto agora herdam de Veiculo, eliminando a repetição
// agora a rota se associa a classe pai Veiculo
//o estagiário usou nomes péssimos para a caracterizção dos nomes de objetos,
//ele também não colocou o nome das classes em maiusculo


public class Rota {
    private Pacote pacote;
    private Veiculo veiculo; // Agora aceita Moto ou Caminhao!

    public Rota(Pacote pacote, Veiculo veiculo) {
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    public void vai() {
        System.out.println("Levando pacote " + pacote.getCodigo() + " no veiculo " + veiculo.getPlaca());
    }
}