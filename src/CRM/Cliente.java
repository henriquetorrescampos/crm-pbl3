package CRM;

public class Cliente {
    // attributes
    private String nome;
    private String email;
    private String telefone;
    private String[][] interacoes;
    private String status;
    private int totalInteracoes = 0;

    // metodo construtor
    public Cliente(String nome, String email, String telefone, String[][] interacoes, String status) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.interacoes = interacoes;
        this.status = status;
    }

    public void registrarInteracao(String tipo, String descricao, String data) { // FIFO, first in first out
        String[] novaInteracao = {tipo, descricao, data};

        if (totalInteracoes < interacoes.length) {
            interacoes[totalInteracoes] = novaInteracao;
            totalInteracoes++;
        } else {
            for (int i = 1; i < interacoes.length; i++) {
                interacoes[i - 1] = interacoes[i];
            }

            interacoes[interacoes.length - 1] = novaInteracao;
        }
        System.out.println("Registrada.");

    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Status: " + this.status);
        System.out.println("Interações: ");
        for (String[] interacao : interacoes) {
            if (interacao[0] != null) {
                System.out.println("Tipo: " + interacao[0] + ", Descrição: " + interacao[1] + ", Data: " + interacao[2]);
            }
        }
    }

    public void buscarInteracao(String palavraChave) {
        boolean encontrei = false;
        System.out.println("Interação com a palavra '" + palavraChave + "':");
        for (String[] interacao : interacoes) {
            if (interacao[0] != null) {
                for (String campo : interacao) {
                    if (campo != null && campo.contains(palavraChave)) {
                        System.out.println("Tipo: " + interacao[0] + ", Descrição: " + interacao[1] + ", Data: " + interacao[2]);
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

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
        System.out.println("Status atualizado para: " + this.status);
    }

    public String getNome() {
        return nome;
    }
}
