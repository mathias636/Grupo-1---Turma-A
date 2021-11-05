import java.util.Scanner;

public class Menu {
    public static Scanner scanner = new  Scanner(System.in);
    public static void main(String[] args) {
        int escolha_do_menu;
        System.out.println("\nNOME DO JOGO");
        do
        {
            System.out.println("\n1- Instru��es\n2- Jogar\n3- Cr�ditos\n4- Sair");
            System.out.print("\nDigite sua op��o: ");
            escolha_do_menu = scanner.nextInt();
            switch (escolha_do_menu)
            {
                case 1:
                    System.out.println("Voc� escolheu: Instru��es");
                    Instrucoes.main(args);
                    ft_enter();
                    break;
                case 2:
                    System.out.println("Voc� escolheu: Jogar");
                    //ft_jogo();
                    break;
                case 3:
                    System.out.println("Voc� escolheu: Cr�ditos");
                    Creditos.main(args);
                    ft_enter();
                    //ft_cr�ditos();
                    break;
                case 4:
                    System.out.println("Voc� escolheu: Sair");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOp��o inv�lida ou inexistente");
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
