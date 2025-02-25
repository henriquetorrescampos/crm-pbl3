import crm.CRM;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        CRM.Cliente cliente = null;


        do {
            System.out.print("""
                    -- CRM --
                    1. CRIAR CLIENTE
                    2. REGISTRAR INTERAÇÃO
                    3. EXIBIT INFORMAÇÕES CLENTE
                    4. BUSCAR INTERAÇÃO
                    5. SAIR
                    
                    ESCOLHA UMA OPÇÃO:
                    """);

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

                    cliente = new CRM.Cliente(nome, email, telefone, new String[5][3], status);
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
        while (opcao != 5);

    }

    }

