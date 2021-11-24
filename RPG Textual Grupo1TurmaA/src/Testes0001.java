import java.util.Scanner;

public class Testes0001 {

    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        System.out.println("Escolha um teste\n");
        do
        {
            System.out.println("1 - testesContinuarVoltar");
            System.out.println("2 - funcaoEmbaralhar");
            System.out.println("3 - ***************");

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
        System.out.println("\n-------DESAFIO 1-DESAFIO 1-DESAFIO 1-DESAFIO 1-DESAFIO 1-DESAFIO 1-DESAFIO 1------------------------------------------------ DESAFIO 1 ---\n");
        AllInOne.Desafio1();
        System.out.println("\n-------DESAFIO 2-DESAFIO 2-DESAFIO 2-DESAFIO 2-DESAFIO 2-DESAFIO 2-DESAFIO 2------------------------------------------------ DESAFIO 2 ---\n");
        AllInOne.Desafio2();
        System.out.println("\nA resposta é: "+AllInOne.Desafio2());
        System.out.println("\n-------DESAFIO 3-DESAFIO 3-DESAFIO 3-DESAFIO 3-DESAFIO 3-DESAFIO 3-DESAFIO 3------------------------------------------------ DESAFIO 3 ---\n");
        AllInOne.Desafio3();
        System.out.println("\nA resposta é: "+AllInOne.Desafio3());
        System.out.println("\n-------DESAFIO 4-DESAFIO 4-DESAFIO 4-DESAFIO 4-DESAFIO 4-DESAFIO 4-DESAFIO 4------------------------------------------------ DESAFIO 4 ---\n");
        AllInOne.Desafio4();
        System.out.println("\nA resposta é: "+AllInOne.Desafio4());
        System.out.println("\n-------DESAFIO 5-DESAFIO 5-DESAFIO 5-DESAFIO 5-DESAFIO 5-DESAFIO 5-DESAFIO 5------------------------------------------------ DESAFIO 5 ---\n");
        AllInOne.Desafio5();
        System.out.println("\nA resposta é: "+AllInOne.Desafio5());
        System.out.println("\n-------DESAFIO 6-DESAFIO 6-DESAFIO 6-DESAFIO 6-DESAFIO 6-DESAFIO 6-DESAFIO 6------------------------------------------------ DESAFIO 6 ---\n");
        AllInOne.Desafio6();
        System.out.println("\nA resposta é: "+AllInOne.Desafio6());
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