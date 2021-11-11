import java.util.Scanner;
public class AllInOne {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean menu_stop = false;
        boolean acertos = false;
        do
        {
            menu_stop = Menu(menu_stop);
        }while(menu_stop == false);

        while(acertos == false)
        {
            acertos = ft_jogo(acertos);
        }
        // scanner.close();
    }

    private static boolean Menu(boolean menu_stop) {
        int escolha_do_menu = 0;
        System.out.print("\n-- DEVON --\n");
        System.out.println("\n1- Instruções\n2- Jogar\n3- Créditos\n4- Sair\n");
        System.out.print("Digite sua opção: ");
        escolha_do_menu = scanner.nextInt();
        switch (escolha_do_menu)
        {
            case 1:
                Instrucoes();
                break;
            case 2:
                menu_stop = true;
                break;
            case 3:
                Creditos();
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
    private static boolean ft_jogo(boolean tentativa) {
        System.out.println("Olá, você errou e isso aparecerá novamente");
        tentativa = true;
        return(tentativa);
    }
    private static void Instrucoes() {
        System.out.println(" ============================================================================================================================================");
        System.out.println(" =  Devon é um jogo de perguntas e respostas, aonde o jogados enfrenta desafios para progredir na historia.                                 =");
        System.out.println(" == Os desafios são compostos por 5 questões (A,B,C,D,E), onde seram testados seus conhecimentos referente a materia de matematica .       ==");
        System.out.println(" =  Para selecionar as respostas voce deve digitar o a letra correspodente a alternativa correta.                                           =");
        System.out.println(" == Caso venha a errar alguma das questões, independete da etapa que esta no jogo, é game over, e o jogo recomeça.                         ==");
        System.out.println(" ============================================================================================================================================");
       
        ft_enter();
    }
    private static void Creditos() {
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
        ft_enter();
    }
    private static void ft_enter() {
        System.out.print("\n>> Pressione \"Enter\" para mostrar o menu novamente");
        Main.scanner.nextLine();
       
  
    }
}
