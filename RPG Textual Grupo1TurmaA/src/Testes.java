import java.util.Scanner;

public class Testes {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int escolha = 0;
        System.out.println("Escolha um teste\n");
        do
        {
            System.out.println("0 - sair");
            System.out.println("1 - testesContinuarVoltar");
            System.out.println("2 - funcaoEmbaralhar");
            System.out.println("3 - Desafios");
            System.out.println("4 - TestesEnter");
            System.out.println("5 - testesEnredos");
            escolha = scanner.nextInt();
            switch(escolha)
            {
                case 0:
                    break;
                case 1:
                    testesContinuarVoltar();
                    break;
                case 2:
                    funcaoEmbaralhar();
                    break;
                case 3:
                    Desafios();
                    break;
                case 4:
                    testesEnter();
                case 5:
                    testesEnredos();
                case 6:
                //daí implementa quantos testes quiser...
                default:
                    break;
            }
        }while(escolha != 0);
        scanner.close();
    }
    private static void testesEnredos() throws Exception {
        int escolha;
        System.out.println("escolha uma opção\n");
        System.out.println("0 - sair");
        System.out.println("1 - PrimeiroEnredo");
        System.out.println("2 - SegundoEnredo");
        System.out.println("3 - TerceiroEnredo");
        System.out.println("4 - TerceiroEnredoFinal");
        System.out.println("5 - QuartoEnredo");
        System.out.println("6 - QuartoEnredoFinal");
        System.out.println("7 - QuintoEnredo");
        System.out.println("8 - QuintoEnredoFinal");
        System.out.println("9 - SextoEnredo");
        System.out.println("10 - SetimoEnredo");
        System.out.println("11 - SetimoEnredoFinal");
        escolha = scanner.nextInt();
        switch(escolha)
        {
            case 0:
                break;
            case 1:
                Devon.PrimeiroEnredo();
                break;
            case 2:
                Devon.SegundoEnredo();
                break;
            case 3:
                Devon.TerceiroEnredo();
                break;
            case 4:
                Devon.TerceiroEnredoFinal();
                break;
            case 5:
                Devon.QuartoEnredo();
                break;
            case 6:
                Devon.QuartoEnredoFinal();
                break;
            case 7:
                Devon.QuintoEnredo();
                break;
            case 8:
                Devon.QuintoEnredoFinal();
                break;
            case 9:
                Devon.SextoEnredo();
                break;
            case 10:
                Devon.SetimoEnredo();
                break;
            case 11:
                Devon.SetimoEnredoFinal();
                break;
            default:
                testesEnredos();
        }
        if(escolha != 0)
        {
            testesEnredos();
        }
    }
    private static void testesEnter() throws Exception {
        int escolha;
        System.out.println("escolha um teste");
        System.out.println("0- sair");
        System.out.println("1- enter");
        System.out.println("2- duplo_enter");
        System.out.println("3- enter_menu (duplo)");
        System.out.println("4- OpcaoInvalidaOuInexistente(duplo)");
        System.out.println("5- n/a");
        System.out.println("6- n/a");
        escolha = scanner.nextInt();
        switch(escolha)
        {
            case 0:
                break;
            case 1:
                Devon.enter();
                break;
            case 2:
                Devon.duplo_enter();
                break;
            case 3:
                Devon.enter_menu();
                break;
            case 4:
                Devon.OpcaoInvalidaOuInexistente();
                break;
            case 5:
            case 6:
            default:
                testesEnter();
                break;
        }
        if(escolha != 0)
        {
            testesEnter();
        }
    }
    private static void Desafios() throws Exception {
        String resposta = "";
        int escolha = 0;
        escolha = 0;
        System.out.println("\n\nescolha um desafio:\n");
        System.out.println("0 - SAIR");
        System.out.println("1 - DEAFIO 1");
        System.out.println("2 - DEAFIO 2");
        System.out.println("3 - DEAFIO 3");
        System.out.println("4 - DEAFIO 4");
        System.out.println("5 - DEAFIO 5");
        System.out.println("6 - DEAFIO 6");
        escolha = scanner.nextInt();
        switch(escolha)
        {
            case 0:
                break;
            case 1:
                System.out.println("\nDESAFIO 1 | RESPOSTA: 1234");
                resposta = Devon.Desafio1();
                System.out.println("\nCONFERINDO RESPOSTA | RESPOSTA CORRETA: "+resposta);
                break;
            case 2:
                System.out.println("\nDESAFIO 2 | RESPOSTA: 1213");
                resposta = Devon.Desafio2();
                System.out.println("\nCONFERINDO RESPOSTA | RESPOSTA CORRETA: "+resposta);
                break;
            case 3:
                System.out.println("\nDESAFIO 3 | RESPOSTA: 3 raiz quadrada de 3");
                resposta = Devon.Desafio3();
                System.out.println("\nCONFERINDO RESPOSTA | RESPOSTA CORRETA: "+resposta);
                break;
            case 4:
                System.out.println("\nDESAFIO 4 | RESPOSTA: 7");
                resposta = Devon.Desafio4();
                System.out.println("\nCONFERINDO RESPOSTA | RESPOSTA CORRETA: "+resposta);
                break;
            case 5:
                System.out.println("\nDESAFIO 5 | RESPOSTA: 3/4");
                resposta = Devon.Desafio5();
                System.out.println("\nCONFERINDO RESPOSTA | RESPOSTA CORRETA: "+resposta);
                break;
            case 6:
                System.out.println("\nDESAFIO 6 | RESPOSTA: 21");
                resposta = Devon.Desafio6();
                System.out.println("\nCONFERINDO RESPOSTA | RESPOSTA CORRETA: "+resposta);
                break;
            default:
                Desafios();
                break;
        }
        if(escolha != 0)
        {
            Desafios();
        }
    }
    private static void funcaoEmbaralhar() throws Exception {
        boolean result;
        String questao = "AQUI FICARIA A QUESTÃO";
        String array_de_alternativas[] = {"A", "B", "C", "D", "E"};
        String resposta = array_de_alternativas[1];
        System.out.println("Resposta = "+array_de_alternativas[1]);
        System.out.println("Array antes de passar pelo método embaralha_alternativas");
        for(int i = 0; i < array_de_alternativas.length; i++){
            System.out.println(array_de_alternativas[i]+" [i] = "+i);
        }
        result = Devon.funcaoEmbaralhar(questao, array_de_alternativas, resposta);
        if(result == false){
            System.out.println("ERROU");
        }else{
            System.out.println("ACERTOU MIZERAVI");
        }
    }
    public static void testesContinuarVoltar() throws Exception {
        int escolha = 0;
        /*
            Testes sem passar para enredos, apenas com as coisas que tem aqui.
        */
        int contexto = 0;
        String mensagem = "MENSAGEM QUE DEVERÁ APARECER NO LUGAR DESTE TEXTO | SE VOCÊ ESCOLHEU CONTINUAR, OK";
        System.out.println("contexto antes = "+contexto+"| se contexto == 0, ok");
        System.out.println("OPÇÃO 1 PASSA | OPÇÃO 2 ENTRA NO CONTINUAR VOLTAR");
        System.out.println("digite sua opção:");
        escolha = scanner.nextInt();
        if(escolha == 2){
            contexto = Devon.ContinuarVoltar(mensagem, contexto);
        }else{
            if(escolha != 1){
                Devon.OpcaoInvalidaOuInexistente();//utilizando a mesma no código fonte, apenas para mostrar opção inválida
                testesContinuarVoltar();
            }
        }
        System.out.println("contexto depois = "+ contexto+"\n\n\n");
        /*
            Teste nos enredos
        */
        System.out.println("PASSANDO PARA TESTES NO ENREDO...");
        System.out.print("\n\n----------------\nTESTES EM: TERCEIRO ENREDO\n\n");
        Devon.TerceiroEnredoDecisaoPósDesafio();
        System.out.print("\n\n----------------\nTESTES EM: QUARTO ENREDO\n\n");
        Devon.QuartoEnredoDecisao();
        System.exit(0);
    }
}
