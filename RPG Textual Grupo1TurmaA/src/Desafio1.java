import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class Main {  
  public static void main(String args[]) { 
    String letter[] = {"1", "2", "3", "4", "5"};
        String questao = "Devon percebe que não será fácil e precisa usar mais seus poderes para conseguir derrotar Hasad. Para isso precisará responder qual das alternativas abaixo corresponde para 4D2 em base hexadecimal para base decimal.";           
        String alternativas[] = {"1234", "4321", "3241", "4213", "1342"};
        String resposta = alternativas[0];
        String escolha = "", escolhaCerta = "";
        ArrayList<String> opcoes = new ArrayList<String>();
        int i;
Scanner scanner = new Scanner(System.in);



        System.out.println("Desafio1");
        System.out.println("\nNARRADOR: ");
        System.out.println("\nE começa a luta entre Devon e Hasad, Deus Metamorfo.");
        System.out.println("\nOs poderes de Hasad são impressionantes, já que ele pode se transformar em qualquer ser vivo e até objetos.");

        


        for(i = 0; i < alternativas.length; i++) {
            opcoes.add(alternativas[i]);
        }
        do
        {
            System.out.println("\n"+questao);
            if(escolha != "NULL"){
                Collections.shuffle(opcoes);}
            for(i = 0; i < alternativas.length; i++) {
                System.out.println(letter[i]+") "+opcoes.get(i));
                if(opcoes.get(i).equals(resposta)) {
                    escolhaCerta = letter[i]; }
            }
            System.out.print("Digite a resposta: ");
            escolha = scanner.nextLine();
            switch(escolha)
            {
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                    if(escolha.equalsIgnoreCase(escolhaCerta)){
                        System.out.print("E Devon consegue vencer Hasad! E agora tem 1 dos 6 Poderes Supremos dos Deuses. Meus parabéns, jogador.");
                        escolha = "ok";
                        break;
                    }else{
                        System.out.print("É meu caro jogador, não foi dessa vez que conseguiu derrotar Hasad. Melhor voltar para o Mefisto.");}
                    scanner.nextLine();
                    break;
                default:
                    System.out.print("Opção inválida ou inexistente");
                    escolha = "NULL";
                    scanner.nextLine();
            }
        }while(escolha != "ok");
          scanner.close(); 
  } 
}