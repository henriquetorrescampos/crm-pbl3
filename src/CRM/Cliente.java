package CRM;

public class Cliente {
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


        public void  atualizarStatus(String novoStatus) {
            this.status = novoStatus;
            System.out.println("Status atualizado para: " + this.status);
        }
    }

