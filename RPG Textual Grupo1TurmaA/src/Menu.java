import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        int escolha_do_menu;
        System.out.println("\nNOME DO JOGO");
        do
        {
            System.out.println("\n1- Instruções\n2- Jogar\n3- Créditos\n4- Sair");
            System.out.print("\nDigite sua opção: ");
            escolha_do_menu = scanner.nextInt();
            // escolha_do_menu = scanner.next().charAt(0);
            if(escolha_do_menu == 1) {
                System.out.println("Você escolheu: Instruções");
                // ft_instrucoes();
            }
            else if(escolha_do_menu == 2) {
                System.out.println("Você escolheu: Jogar");
                //ft_jogo();
            }
            else if(escolha_do_menu == 3) {
                System.out.println("Você escolheu: Créditos");
                //ft_créditos();
            }
            else if(escolha_do_menu == 4) {
                System.out.println("Você escolheu: Sair");
                System.exit(0);
            }
            else {
                System.out.println("\nOpção inválida ou inexistente");
                System.out.print("pressione \"Enter\" para mostrar novamente");
                scanner.nextLine(); scanner.nextLine();
            }
        }while(escolha_do_menu != 1 && escolha_do_menu != 2 && escolha_do_menu != 3 && escolha_do_menu != 4);
        scanner.close();
    }
}
