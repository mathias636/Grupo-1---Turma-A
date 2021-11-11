
import java.util.Scanner;

public class Desafio1{

    public static void Desafio1(int escolha) {
        System.out.println("Desafio1");
                
        switch (escolha){
            case 1:
                System.out.println("\nE Devon consegue vencer Hasad! E agora tem 1 dos 6 Poderes Supremos dos Deuses. Meus parabéns, jogador.");
                break;
            case 2:
                System.out.println("\nÉ meu caro jogador, não foi dessa vez que conseguiu derrotar Hasad. Melhor voltar para o Mefisto.");
                break;
            case 3:
                System.out.println("\nÉ meu caro jogador, não foi dessa vez que conseguiu derrotar Hasad. Melhor voltar para o Mefisto.");
                break;
            case 4:
                System.out.println("\nÉ meu caro jogador, não foi dessa vez que conseguiu derrotar Hasad. Melhor voltar para o Mefisto.");
                System.exit(0);
            case 5:
                System.out.println("\nÉ meu caro jogador, não foi dessa vez que conseguiu derrotar Hasad. Melhor voltar para o Mefisto.");
                System.exit(0);    
            default:
                System.out.println("\nOpção inválida ou inexistente");
                break;
        }
        
    }
    
     public static void main(Object args, int es) {
        System.out.println("Desafio1");
        System.out.println("\nNARRADOR: ");
        System.out.println("\nE começa a luta entre Devon e Hasad, Deus Metamorfo.");
        System.out.println("\nOs poderes de Hasad são impressionantes, já que ele pode se transformar em qualquer ser vivo e até objetos.");
        System.out.println("\nDevon percebe que não será fácil e precisa usar mais seus poderes para conseguir derrotar Hasad.\n" + "\nPara isso precisará responder qual das alternativas abaixo corresponde para 4D2 em base hexadecimal para base decimal.");
        System.out.println("\n1. 1234");
        System.out.println("\n2. 4321");
        System.out.println("\n3. 3241");
        System.out.println("\n4. 4213");
        System.out.println("\n5. 1342");
        
        int escolha;
        System.out.println("\nFaça sua escolha:");
        
        Scanner scanner = new Scanner(System.in);
        escolha = scanner.nextInt();
        
        Desafio1(escolha);
        
    }   

}
