package crm;

public class CRM {


    public static class Cliente {
        // atributos
        private String nome;
        private String email;
        private String telefone;
        private String[][] interacoes = new String[5][3];
        private String status;
        private int contador = 0;

        // metodo construtor
        public Cliente(String nome, String email, String telefone, String[][] interacoes, String status) {
            this.nome = nome;
            this.email = email;
            this.telefone = telefone;
            this.interacoes = interacoes;
            this.status = status;
        }

        public String getNome() {
            return nome;
        }

        public String getEmail() {
            return email;
        }

        public String getTelefone() {
            return telefone;
        }

        public String[][] getInteracoes() {
            return interacoes;
        }

        public String getStatus() {
            return status;
        }

        public int getContador() {
            return contador;
        }

        public int incrementarContador() {
            return contador++;
        }


//        public void registrarInteracao(String tipo, String descricao, String data) {
//            // FIFO, first in first out
//            String[] novaInteracao = {tipo, descricao, data};
//
//            if (contador < interacoes.length) {
//                interacoes[contador] = novaInteracao;
//                contador++;
//            } else {
//                removerAntiga(novaInteracao);
//            }
//
//            System.out.println("Registrada.");
//
//        }

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

        public void  atualizarStatus(String novoStatus) {
            this.status = novoStatus;
            System.out.println("Status atualizado para: " + this.status);
        }

        private void removerAntiga(String[] novaInteracao) {
            for (int i = 1; i < interacoes.length; i++) {
                interacoes[i - 1] = interacoes[i];
            }

            interacoes[interacoes.length - 1] = novaInteracao;
        }

    }



}