import java.util.Scanner;

public class Testes0001 {

    static Scanner scanner = new Scanner(System.in);
    static int escolha = 0;

    public static void main(String[] args) throws Exception {
        System.out.println("Escolha um teste\n");
        do
        {
            System.out.println("1 - testesContinuarVoltar");
            System.out.println("2 - funcaoEmbaralhar");
            System.out.println("3 - Desafios");
            escolha = scanner.nextInt();
            switch(escolha)
            {
                case 1:
                    testesContinuarVoltar();
                case 2:
                    funcaoEmbaralhar();
                case 3:
                    Desafios();
                case 4:
                case 5:
                default:
                    escolha = 0;
            }
        }while(escolha == 0);
        scanner.close();
    }
    private static void Desafios() throws Exception {
        escolha = 0;
        System.out.println("escolha um desafio\n");
        System.out.println("1 - DEAFIO 1");
        System.out.println("2 - DEAFIO 2");
        System.out.println("3 - DEAFIO 3");
        System.out.println("4 - DEAFIO 4");
        System.out.println("5 - DEAFIO 5");
        System.out.println("6 - DEAFIO 6");
        escolha = scanner.nextInt();
        switch(escolha)
        {
            case 1:
                System.out.println("\nDESAFIO 1 | RESPOSTA: 1234");
                AllInOne.Desafio1();
            case 2:
                System.out.println("\nDESAFIO 2 | RESPOSTA: 1213");
                AllInOne.Desafio2();
            case 3:
                System.out.println("\nDESAFIO 3 | RESPOSTA: 3 raiz quadrada de 3");
                AllInOne.Desafio3();
            case 4:
                System.out.println("\nDESAFIO 4 | RESPOSTA: 7");
                AllInOne.Desafio4();
            case 5:
                System.out.println("\nDESAFIO 5 | RESPOSTA: 3/4");
                AllInOne.Desafio5();
            case 6:
                System.out.println("\nDESAFIO 6 | RESPOSTA: 21");
                AllInOne.Desafio6();
            default:
                Desafios();
        }
    }
    private static void funcaoEmbaralhar() throws Exception {
        boolean result;
        String questao = "AQUI FICARIA A QUESTÃO | LOGO APÓS ELE SEGUIRÁ PARA OS TESTE NOS ENREDOS";
        String array_de_alternativas[] = {"A", "B", "C", "D", "E"};
        String resposta = array_de_alternativas[1];
        System.out.println("Resposta = "+array_de_alternativas[1]);
        System.out.println("Array antes de passar pelo método embaralha_alternativas");
        for(int i = 0; i < array_de_alternativas.length; i++){
            System.out.println(array_de_alternativas[i]+" [i] = "+i);
        }
        result = AllInOne.funcaoEmbaralhar(questao, array_de_alternativas, resposta);
        if(result == false){
            System.out.println("ERROU");
        }else{
            System.out.println("ACERTOU MIZERAVI");
        }
    }

    public static void testesContinuarVoltar() throws Exception {
        String mensagem = "MENSAGEM";
        AllInOne.ContinuarVoltar(mensagem);
        System.out.print("\n\n----------------\nTESTES EM: PRIMEIRO ENREDO\n\n");
        AllInOne.Contexto_ContinuarVoltar = 1;
        AllInOne.PrimeiroEnredoDecisao();
        System.out.print("\n\n----------------\nTESTES EM: TERCEIRO ENREDO\n\n");
        AllInOne.Contexto_ContinuarVoltar = 2;
        AllInOne.TerceiroEnredoDecisaoPósDesafio();
        AllInOne.Contexto_ContinuarVoltar = 3;
        System.out.print("\n\n----------------\nTESTES EM: QUARTO ENREDO\n\n");
        AllInOne.QuartoEnredoDecisao();
        
    }
}
