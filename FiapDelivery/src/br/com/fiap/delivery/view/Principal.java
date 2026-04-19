package br.com.fiap.delivery.view;

import br.com.fiap.delivery.model.*;

public class Principal {
    public static void main(String[] args) {
        // Testando com Caminhão
        Veiculo caminhao = new Caminhao("ABC1234", 5000.0, 3);
        Pacote pac = new Pacote("BR999", 18.5, "Pendente");
        
        Rota r = new Rota(pac, caminhao);
        r.vai();
        
        // Testando com Moto (O que o estagiário não conseguia fazer!)
        Veiculo moto = new Moto("XYZ5678", 50.0, true);
        Rota r2 = new Rota(pac, moto);
        r2.vai();
    }
}
