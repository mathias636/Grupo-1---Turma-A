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
        System.out.println("\nVocê escolheu: Instruções");
        System.out.println("\n =======================================================================================================");
        System.out.println("\n Devon é um jogo de perguntas e respostas, onde o jogador enfrenta desafios para progredir na história.");
        System.out.println("\n Os desafios são compostos por 5 questões (A,B,C,D,E), onde serão testados seus conhecimentos referente a matéria de matematica.");
        System.out.println("\n Para selecionar as respostas, você deve digitar a letra correspodente a alternativa que considera correta.");
        System.out.println("\n Não há chances para erro. Caso erre qualquer questão, o jogo será reiniciado.");
       
        ft_enter();
    }
    private static void Creditos() {
        System.out.println("\nVocê escolheu: Créditos");
        System.out.println("\n========================================================================");
        System.out.println("\n 'Devon' Foi desenvolvido como parte do projeto integrador do curso de Analise e Desenvolvimento de Sitemas do Senac");
        System.out.println("\n O grupo de desenvolvimento é composto por:"+"\n Elton Freitas"+"\n Keity Pires " + "\n Matheus Galvão" + "\n Milena Kamimura"+ "\n Vinicius Gomes");
        System.out.println("\n Obrigado a todos");
        
        ft_enter();
    }
    private static void ft_enter() {
        System.out.print("\n>> Pressione \"Enter\" para mostrar o menu novamente");
        Main.scanner.nextLine();
       
  
    }
    
    
}
