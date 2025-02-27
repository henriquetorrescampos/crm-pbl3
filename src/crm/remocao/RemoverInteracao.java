package crm.remocao;

import crm.Cliente;

public class RemoverInteracao {
    public static void removerAntiga(Cliente cliente, String [] novaInteracao) {
        String[][] interacoes = cliente.getInteracoes();

        for (int i = 1; i < interacoes.length ; i++) {
            interacoes[i - 1] = interacoes[i];
        }

        interacoes[interacoes.length - 1] = novaInteracao;

        System.out.println("Interação mais antiga removida.");
    }
}