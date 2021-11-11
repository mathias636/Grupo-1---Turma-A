import java.util.Scanner;

public class Menu {
	public static Scanner scanner = new Scanner(System.in);

	public static boolean main(String[] args, boolean menu_stop) {
        int escolha_do_menu = 0;
        System.out.print("\n-- DEVON --\n");
        System.out.println("\n1- Instruções\n2- Jogar\n3- Créditos\n4- Sair\n");
        System.out.print("Digite sua opção: ");
        escolha_do_menu = scanner.nextInt();
        switch (escolha_do_menu)
        {
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
                    //ft_créditos();
                    break;
                case 4:
                    System.out.println("Você escolheu: Sair");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOpção inválida ou inexistente");
                    ft_enter();
        }while(escolha_do_menu != 4);
        scanner.close();
        
        return menu_stop;
        
        }

	private static void ft_enter() {
		System.out.print("\n>> Pressione \"Enter\" para mostrar o MENU novamente");
		Main.scanner.nextLine();
		// Main.scanner.nextLine();

	}
}
