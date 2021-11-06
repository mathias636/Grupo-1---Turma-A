import java.util.Scanner;

public class Menu {
    public static Scanner scanner = new  Scanner(System.in);
    public static void main(String[] args) {
        int escolha_do_menu;
        do
        {
            System.out.print("\n");
            System.out.println("-- DEVON --");
            System.out.print("\n");
            System.out.println("\n1- Instruções\n2- Jogar\n3- Créditos\n4- Sair");
            System.out.print("\nDigite sua opção: ");
            escolha_do_menu = scanner.nextInt();
            switch (escolha_do_menu)
            {
                case 1:
                    System.out.println("Você escolheu: Instruções");
                    Instrucoes.main(args);
                    ft_enter();
                    break;
                case 2:
                    System.out.println("Você escolheu: Jogar");
                    //ft_jogo();
                    break;
                case 3:
                    System.out.println("Você escolheu: Créditos");
                    Creditos.main(args);
                    ft_enter();
                    break;
                case 4:
                    System.out.println("Você escolheu: Sair");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOpção inválida ou inexistente");
                    ft_enter();
            }
        }while(escolha_do_menu != 4);
        scanner.close();
    }

    private static void ft_enter() {
        System.out.print("\n\nPressione \"Enter\" para mostrar o menu novamente");
        scanner.nextLine(); scanner.nextLine();
    }
}
