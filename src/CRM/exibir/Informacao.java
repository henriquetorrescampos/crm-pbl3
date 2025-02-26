package CRM.exibir;
import CRM.Cliente;

public class Informacao {
    // precisa de um objeto Cliente.`
    private Cliente cliente;

    public Informacao(Cliente cliente) {
        this.cliente = cliente;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Status: " + cliente.getStatus());

        System.out.println("Interações: ");
        for (String[] interacao : cliente.getInteracoes()) {
            if (interacao[0] != null) {
                System.out.println(
                        "Tipo: " + interacao[0] + ", Descrição: " + interacao[1] + ", Data: " + interacao[2]
                );
            }
        }
    }
}



