import java.util.Scanner;

public class Menu {
    public static Scanner scanner = new  Scanner(System.in);
    public static boolean main(String[] args, boolean menu_stop) {
        int escolha_do_menu = 0;
        System.out.print("\n-- DEVON --\n");
        System.out.println("\n1- Instruções\n2- Jogar\n3- Créditos\n4- Sair\n");
        System.out.print("Digite sua opção: ");
        escolha_do_menu = scanner.nextInt();
        switch (escolha_do_menu)
        {
            case 1:
                Instrucoes.main(args);
                ft_enter();
                break;
            case 2:
                menu_stop = true;
                break;
            case 3:
                Creditos.main(args);
                ft_enter();
                break;
            case 4:
                System.out.println("\nVocê escolheu: Sair");
                System.exit(0);
            default:
                System.out.println("\nOpção inválida ou inexistente");
                ft_enter();
                break;
        }
        return menu_stop;
    }

    private static void ft_enter() {
        System.out.print("\n>> Pressione \"Enter\" para mostrar o MENU novamente");
        Main.scanner.nextLine();
        // Main.scanner.nextLine();

    }
}
