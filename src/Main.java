import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Board de Tarefas ---");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Avançar Tarefa");
            System.out.println("3. Listar Tarefas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título da tarefa: ");
                    String titulo = scanner.nextLine();
                    board.adicionarTarefa(titulo);
                    break;
                case 2:
                    System.out.print("Digite o título da tarefa para avançar: ");
                    String tituloAvancar = scanner.nextLine();
                    board.avancarTarefa(tituloAvancar);
                    break;
                case 3:
                    board.listarTarefas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
