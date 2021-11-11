
import java.util.Scanner;


public class Desafio4{

    public static boolean main(Object args, boolean acertos) {
        return false;
    }
    
    public static void Desafio4(int escolha) {
        System.out.println("Desafio4");
                
        switch (escolha){
            case 1:
                System.out.println("\nDeusa Lust te pegou de jeito. Melhor voltar para o Mefisto para terem uma conversa sobre essa última batalha.");
                break;
            case 2:
                System.out.println("\nDeusa Lust te pegou de jeito. Melhor voltar para o Mefisto para terem uma conversa sobre essa última batalha.");
                break;
            case 3:
                System.out.println("\nConseguiu derrotar a Deusa das Deusas! E agora tem 4 dos 6 Poderes Supremos dos Deuses. Você está quase lá.");
                break;
            case 4:
                System.out.println("\nDeusa Lust te pegou de jeito. Melhor voltar para o Mefisto para terem uma conversa sobre essa última batalha.");
                System.exit(0);
            case 5:
                System.out.println("\nDeusa Lust te pegou de jeito. Melhor voltar para o Mefisto para terem uma conversa sobre essa última batalha.");
                System.exit(0);    
            default:
                System.out.println("\nOpção inválida ou inexistente");
                break;
        }
        
    }
    
     public static void main(Object args, int es) {
        System.out.println("Desafio4");
        System.out.println("\nDeusa Lust não esperava que ele conseguisse chegar tão longe, ao ponto de derrubá-la.\n" +"E para finalizar, precisa resolver o desafio:");
        System.out.println("\nDesenvolva a equação de primeiro grau 4x - 8 = 6 + 2x para finalizar a Deusa Lust.");    
        System.out.println("\n1. 8");
        System.out.println("\n2. 5");
        System.out.println("\n3. 7");
        System.out.println("\n4. 9");
        System.out.println("\n5. 6");
        
        int escolha;
        System.out.println("\nFaça sua escolha:");
        
        Scanner scanner = new Scanner(System.in);
        escolha = scanner.nextInt();
        
        Desafio4(escolha);
        
    }  
}
