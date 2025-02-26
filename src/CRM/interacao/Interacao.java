package CRM.interacao;

import CRM.Cliente;
import CRM.remocao.RemoverInteracao;

public class Interacao {
    public static void registrarInteracao(Cliente cliente, String tipo, String descricao, String data) {
        //fifo first in first out {1, 2, 3, 4, 5} {7} -> {7, 2, 3, 4, 5}
        String[] novaInteracao = {tipo, descricao, data};

        // se contador < comprimento das interações:
        // interacoes[contador] = novaInteracao
        if (cliente.getContador() < cliente.getInteracoes().length) {
            cliente.getInteracoes()[cliente.getContador()] = novaInteracao;
            cliente.incrementarContador();
        } else {
            RemoverInteracao.removerAntiga(cliente, novaInteracao);
        }
    }
}