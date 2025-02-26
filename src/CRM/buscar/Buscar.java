package CRM.buscar;

import CRM.Cliente;

public class Buscar {
    private Cliente cliente;

    public Buscar(Cliente cliente) {
        this.cliente = cliente;
    }

    public void buscarInteracao(String palavraChave) {
        boolean encontrei = false;
        System.out.println(
                "Interação com a palavra '" + palavraChave + "':");
        for (String[] interacao : cliente.getInteracoes()) {
            if (interacao[0] != null) {
                for (String campo : interacao) {
                    if (campo != null && campo.contains(palavraChave)) {
                        System.out.println(
                                "Tipo: " + interacao[0] + ", Descrição: " + interacao[1] + ", Data: " + interacao[2]
                        );
                        encontrei = true;
                        break;
                    }
                }
            }
        }
        if (!encontrei) {
            System.out.println("Nenhuma interação encontrada.");
        }
    }
}
