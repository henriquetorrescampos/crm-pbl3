import crm.Cliente;
import crm.interacao.Interacao;
import crm.exibir.Informacao;
import crm.consultar.ConsultarCliente;
import crm.consultar.BuscarPalavraInteracao;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        Cliente cliente = null;

        do {
            System.out.print("""
                    
                    ===========================
                    |       SISTEMA CRM       |
                    ===========================
                    | 1. Criar Cliente        |
                    | 2. Registrar Interação  |
                    | 3. Exibir Info Cliente  |
                    | 4. Buscar Interação     |
                    | 5. Sair                 |
                    ===========================
                    
                    Escolha uma opção:
                    """);

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print(""" 
                            ===========================
                            |    Cadastrar cliente    |
                            ===========================
                            
                            """);
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    System.out.print("Status inicial: ");
                    String status = scanner.nextLine();

                    cliente = new Cliente(nome, email, telefone, new String[5][3], status);
                    System.out.print(""" 
                            
                            ***************************************
                                Cliente cadastrado com sucesso!
                            ***************************************
                            """);
                    break;
                case 2:
                    System.out.print(""" 
                            =============================
                            |    Cadastrar Interação    |
                            =============================
                            
                            """);
                    if (cliente != null) {
                        System.out.print("Tipo de interação: ");
                        String tipo = scanner.nextLine();

                        System.out.print("Descrição: ");
                        String descricao = scanner.nextLine();

                        System.out.print("Data: ");
                        String data = scanner.nextLine();

                        Interacao.registrarInteracao(cliente, tipo, descricao, data);
                    }
                    else {
                        System.out.println("Nenhum cliente cadastrado.");
                    }
                case 3:
                    System.out.print(""" 
                            ============================
                            |    Exibir Informações    |
                            ============================
                            
                            """);
                    if (cliente != null) {
                        // criando objeto classe Informacao
                        Informacao info = new Informacao(cliente);

                        info.exibirInformacoes();
                    } else {
                        System.out.println("Nenhum cliente cadastrado.");
                    }
                    break;
                case 4:
                    System.out.print(""" 
                            ===========================================
                            |    Consultar Histórico de Interações    |
                            ===========================================
                            
                            """);
                    if (cliente != null) {
                        System.out.print("Insira a interação que deseja buscar: ");
                        String palavra = scanner.nextLine();

                        BuscarPalavraInteracao buscar = new BuscarPalavraInteracao(cliente);
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
