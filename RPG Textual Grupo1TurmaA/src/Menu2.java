import java.util.Scanner;
public class Menu2 {
    
    public static Scanner scanner = new Scanner(System.in);

    public static void creditos() {
        
        System.out.println("\n******************************************************************************************************************************");
        System.out.println("** 'Devon' Foi desenvolvido como parte do projeto integrador do curso de Analise e desenvolvimento de Sitemas no Senac      **");
        System.out.println("** O grupo de desenvolvimento é composto por:                                                                               **"+
        "\n** • Elton Freitas                                                                                                          **"+
        "\n** • Keity Pires                                                                                                            ** " + 
        "\n** • Matheus Galvão                                                                                                         **" + 
        "\n** • Milena Kamimura                                                                                                        **"+ 
        "\n** • Vinicius Gomes                                                                                                         **" );
        System.out.println("** Obrigado a todos                                                                                                         **");
        System.out.println("******************************************************************************************************************************");

    }
    
	public static void main(String[] args) {
        int escolha_do_menu = 0;
        System.out.print("\n-- DEVON --\n");
        System.out.println("\n1- Instruções\n2- Jogar\n3- Créditos\n4- Sair\n");
        System.out.print("Digite sua opção: ");
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
                    creditos();
                    ft_enter();
                    //ft_créditos();
                    break;
                    case 4:
                    System.out.println("Você escolheu: Sair");
                    System.exit(0);
                    break;
                    default:
                    System.out.println("\nOpção inválida ou inexistente teste");
                    ft_enter();
                }
                
                while(escolha_do_menu != 4);
                scanner.close();
                
                
                
            }
            private static void ft_enter() {
                System.out.print("\n>> Pressione \"Enter\" para mostrar o MENU novamente");
                Main.scanner.nextLine();
                // Main.scanner.nextLine();
            
            }
            
        }
        
        