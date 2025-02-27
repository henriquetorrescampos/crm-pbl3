package crm.consultar;

import crm.Cliente;

public class ConsultarCliente {
    private static Cliente cliente;

    public ConsultarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente consultarPorNome(String nome) {
        if (cliente.getNome().equals(nome)) {
            return cliente;
        }
        return null;
    }

    public Cliente consultarPorEmail(String email) {
        if (cliente.getEmail().equals(email)) {
            return cliente;
        }
        return null;
    }

    public Cliente consultarPorTelefone(String telefone) {
        if (cliente.getTelefone().equals(telefone)) {
            return cliente;
        }
        return null;
    }

    public String consultarStatus() {
        return cliente.getStatus();
    }
}
