import CRM.Cliente;
import CRM.interacao.Interacao;
import CRM.exibir.Informacao;
import CRM.buscar.Buscar;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        Cliente cliente = null;

        do {
            System.out.print("""
                    -- CRM --
                    1. CRIAR CLIENTE
                    2. REGISTRAR INTERAÇÃO
                    3. EXIBIR INFORMAÇÕES CLENTE
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

                    cliente = new Cliente(nome, email, telefone, new String[5][3], status);
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

                        Interacao.registrarInteracao(cliente, tipo, descricao, data);
                    }
                    else {
                        System.out.println("Nenhum cliente cadastrado.");
                    }
                case 3:
                    if (cliente != null) {
                        // criando objeto classe Informacao
                        Informacao info = new Informacao(cliente);

                        info.exibirInformacoes();
                    } else {
                        System.out.println("Nenhum cliente cadastrado.");
                    }
                    break;
                case 4:
                    if (cliente != null) {
                        System.out.println("Insira a interação que deseja buscar: ");
                        String palavra = scanner.nextLine();

                        Buscar buscar = new Buscar(cliente);
                        buscar.buscarInteracao(palavra);
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
        while (opcao != 5);

    }

    }

