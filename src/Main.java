import java.util.Scanner;
import CRM.Cliente;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        Cliente cliente = null;

        do {
            System.out.format("""
                    -- CRM --
                    1. Criar Cliente;
                    2. Registrar Interação
                    3. Exibir Informações de um cliente
                    4. Buscar interação
                    5. Sair;
                    """);

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    System.out.print("Status inicial: ");
                    String status = scanner.nextLine();

                    cliente = new Cliente(nome, email, telefone, new String[5][3], status);
                    System.out.ormat("""
                                Cliente criado com sucesso! %s
                            """, cliente.getNome());

                    System.out.println(" ");
                    break;
                case 2:
                    if (cliente != null) {
                        System.out.println("Tipo de interação: ");
                        String tipo = scanner.nextLine();

                        System.out.println("Descrição: ");
                        String descricao = scanner.nextLine();

                        System.out.println("Data: ");
                        String data = scanner.nextLine();

                        cliente.registrarInteracao(tipo, descricao, data);
                    }
            }
        }
        while (opcao != 6);
    }
}

