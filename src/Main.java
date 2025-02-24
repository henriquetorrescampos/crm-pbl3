import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        CRM.Cliente cliente = null;


        do {
            System.out.println("\n-- CRM --");
            System.out.println("1. Criar Cliente");
            System.out.println("2. Registrar interação");
            System.out.println("3. Exibir informações do cliente");
            System.out.println("4. Buscar interação");
            System.out.println("5. Atualizar status");
            System.out.println("6. Sair");
            System.out.println("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.println("Email: ");
                    String email = scanner.nextLine();

                    System.out.println("Telefone: ");
                    String telefone = scanner.nextLine();

                    System.out.println("Status inicial: ");
                    String status = scanner.nextLine();

                    cliente = new CRM.Cliente(nome, email, telefone, new String[5][5], status);
                    System.out.println("Cliente criado");
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

