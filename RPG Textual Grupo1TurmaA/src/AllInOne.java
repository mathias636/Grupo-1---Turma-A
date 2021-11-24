import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AllInOne {
    /*
    variavéis para a função "Digita";
    ORIGINAL:
    public static final int temp_dialog = 25, temp_narrativa = 75, temp_transicao = 10;
    */
    public static int temp_dialog = 0, temp_narrativa = 0, temp_transicao = 0;
    public static long tempo_mensagem = 0;
    /*
    abaixo, variáveis para condicionais do Jogo(), scanner,  e ContinuarVoltar(); 
    */
    public static int Contexto_ContinuarVoltar;
    public static boolean acertos;
    public static Scanner scanner = new Scanner(System.in);
    public static int escolha;
    /*
    MAIN ABAIXO
    */
    public static void main(String[] args) throws Exception {
        Menu();
        Jogo();
    }

    private static void Menu() throws Exception{
        int escolha_do_menu = 0;
        do
        {
            Digita("\n-- DEVON --\n"+"\n1- Instruções\n2- Jogar\n3- Créditos\n4- Sair\n"+"\nDigite sua opção:\n",TimeUnit.MILLISECONDS, temp_transicao);
            escolha_do_menu = scanner.nextInt();
            switch (escolha_do_menu)
            {
                case 1:
                    Instrucoes();
                    ft_enter_menu();
                    break;
                case 2:
                    ft_enter_comeca_jogo();
                    break;
                case 3:
                    Creditos();
                    ft_enter_menu();
                    break;
                case 4:
                    System.out.println("SAINDO DO JOGO...");
                    System.exit(0);
                default:
                    OpcaoInvalidaOuInexistente();
                    break;

            }
        }while(escolha_do_menu != 2);
    }
    
    private static void Jogo() throws Exception {
        /*
        "MAPA"

        acertos" (variável global) condicional para o jogo continuar ou reiniciar 
        se acertos == false, o jogo reinicia.

        */
        while(acertos == false)
        {
            acertos = true;
            PrimeiroEnredo();
            Contexto_ContinuarVoltar = 1;
            PrimeiroEnredoDecisao();
            if(acertos == true){
                SegundoEnredo();
                Desafio1();
            }
            if(acertos == true){
                TerceiroEnredo();
                Desafio2();
            }
            if(acertos == true){
                Contexto_ContinuarVoltar = 2;
                TerceiroEnredoDecisaoPósDesafio();
            }
            if(acertos == true){
                TerceiroEnredoFinal();
                QuartoEnredo();
                Desafio3();
            }
            if(acertos == true){
                QuartoEnredoFinal();
                Contexto_ContinuarVoltar = 3;
                QuartoEnredoDecisao();
                QuintoEnredo();
                Desafio4();
            }
            if(acertos == true){
                QuintoEnredoFinal();
                SextoEnredo();
                Desafio5();
            }
            if(acertos == true){
                SetimoEnredo();
                Desafio6();
            }
            if(acertos == true){
                SetimoEnredoFinal();
            }
        }
    }

    private static void PrimeiroEnredo() throws Exception{
        Digita("\nMEFISTO: Seja bem vindo, meu caro jogador. Sou Mefisto, e você, como se chamas?",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\nDEVON: \nMe chamo Devon "
            + "\nMEFISTO: \nDEVON? DEVON, O MÍSTICO? NÃO É POSSÍVEL!! É VOCÊ? O ESCOLHIDO??"
            + "\nDEVON: \nEU? ESCOLHIDO? "
            + "\nMEFISTO: \nSim, Devon. O ESCOLHIDO. Vivemos neste mundo caótico, podre e sem vida. Um mundo onde a ignorância e a ganância são os líderes."
            + "\nE você foi escolhido, sim, exatamente, você foi ESCOLHIDO. VOCÊ, DEVON. O MÍSTICO."
            + "\nSeu destino, Devon, é dar a VIDA de volta ao Mundo, e que tudo volte ao seu devido e correto lugar."
            + "\nPara que TUDO funcione novamente. Fazer com que tudo seja eliminado."
            + "\nNão será fácil! Para termos essa conquista, pode até custar a sua vida."
            + "\nDEVON: \nMas, Mefisto, não tenho poderes para tal conquista. Como vou fazer isso acontecer? Não tem como eu conseguir."
            + "\nMEFISTO: \nHA-HA-HA-HA VOCÊ PRECISARÁ DOS PODERES DOS 6 DEUSES MAIS PODEROSOS DO MUNDO PARA CONSEGUIR. PARA DERROTÁ-LOS, VOU LHE DAR UM BELO DE UM UPGRADE."
            + "\nAQUI, RECEBA GLADIUS, SUA MAIS NOVA LEAL COMPANHEIRA. ELA IRÁ TE GUIAR E TE DAR FORÇAS PARA AS NOVAS BATALHAS."
            + "\nE ASSIM, QUANDO CONSEGUIR OS 6 PODERES SUPREMOS, TUDO FICARÁ DO JEITO QUE DEVE SER."
            + "\nDEVON: \nE por onde eu devo começar?"
            + "\nMEFISTO: \nA partir de agora é com você. Você já sabe o que fazer. \nBoa sorte, Devon, O Místico.", TimeUnit.MILLISECONDS, temp_dialog);
        enter();
        Digita("\nNARRADOR: \nE começa a jornada de DEVON."
            + "\nSeu primeiro Deus é Hasada, que mora em Terra de Ninguém."
            + "\nMas para chegar lá, precisa escolher o caminho correto"
            , TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("\n");
        enter();
    }
    
    public static void PrimeiroEnredoDecisao() throws Exception{
        Digita("Para onde Devon deve ir?",TimeUnit.MILLISECONDS, temp_narrativa);
        do {
            System.out.println("\n\n1. Montanhas do Amanhã\n2. Ponte Travessa\n\nDigite sua opção:\n");
            escolha = scanner.nextInt();
            if (escolha == 1) {
                String mensagem1 = "Escolha 1: Você escolheu as Montanhas do Amanhã, e infelizmente elas te levaram para um buraco sem fundo.";
                Digita(mensagem1, TimeUnit.MILLISECONDS, temp_transicao);
                ContinuarVoltar(mensagem1);
            }
            else if (escolha == 2) {
                Digita("Escolha 2: Você escolheu a Ponte Travessa, e Devon conseguiu achar um atalho para chegar na Terra de Ninguém ", TimeUnit.MILLISECONDS, temp_transicao);
            } else {
               OpcaoInvalidaOuInexistente();
            }
        }while (escolha < 1 || escolha > 2);
    }

    private static void SegundoEnredo() throws Exception{
        Digita("Alguns dias depois..." + "\n " + "\nNARRADOR: "
                + "\nDepois de uma longa jornada, Devon chegou em sua primeira batalha... \nE lá, Hasad lhe aguardava.",TimeUnit.MILLISECONDS, temp_narrativa);
                System.out.println("\n");
                enter();
                System.out.println("\n");
                Digita("\nDEVON: \nVIM EM BUSCA DO SEU PODER, HASAD! E NÃO HÁ NADA QUE ME IMPEDIRÁ DE DERROTÁ-LO. "
                + "\nDEUS HASAD:  \nQUEM VOCÊ PENSA QUE É PARA ESTAR FALANDO COMIGO ASSIM?"
                + "\nEU SOU O GRANDE HASAD, DEUS METAMORFO." + "\nSAIA DAQUI ANTES QUE VEJA MINHA FÚRIA."
                + "\nDEVON: \nVeremos essa fúria então, Hasad." + "\nDEUS HASAD:" + 
                " \nVOCÊ FOI AVISADO, SEU TOLO.",TimeUnit.MILLISECONDS, temp_dialog);
    }

    static String Desafio1() throws Exception{
        Digita ("\n\nNARRADOR:", TimeUnit.MILLISECONDS, temp_narrativa);
        Digita ("\nE começa a luta entre Devon e Hasad, Deus Metamorfo.", TimeUnit.MILLISECONDS, temp_narrativa);
        Digita ("\nOs poderes de Hasad são impressionantes, já que ele pode se transformar em qualquer ser vivo e até objetos.", TimeUnit.MILLISECONDS, temp_narrativa);
        Digita ("\nDevon percebe que não será fácil e precisa usar mais de seus poderes para conseguir derrotar Hasad." + "\nPara isso precisará responder: ", TimeUnit.MILLISECONDS, temp_narrativa);
        String questao = "\nQual das alternativas abaixo corresponde para 4D2 em base hexadecimal para base decimal?";
        String alternativas[] = {"1234", "4321", "3241", "4213", "1342"};
        String resposta = alternativas[0]; //"1234 é a resposta"
        funcaoEmbaralhar(questao, alternativas, resposta);
        if(acertos == true)
        {
            Digita ("\nNARRADOR: \nE Devon consegue vencer Hasad! E agora tem 1 dos 6 Poderes Supremos dos Deuses. Meus parabéns, jogador.", TimeUnit.MILLISECONDS, temp_narrativa);
        }else{
            System.out.println("\nÉ meu caro jogador, não foi dessa vez que conseguiu derrotar Hasad. Melhor voltar para o Mefisto.");
            ft_enter();
        }
        return resposta;
    }
    
    private static void TerceiroEnredo() throws Exception{
        Digita("\nDEVON: \nEU CONSEGUI!! EU VENCIIII!" + "\nDEUS HASAD: Você...não sabe...o que está fazendo...garoto!", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\nNARRADOR: \nE assim, Devon segue para o próximo Deus, o GRANDE Fieremana."
        + "\nFieremana é um Deus devorador, ou seja, ele basicamente come tudo o que deseja."
        + "\nNão será fácil para nosso Devon."
        + "\nApós a grande luta com Hasad, Devon parou um pouco no caminho para recarregar suas energias para sua próxima batalha, e terá um longo caminho para chegar no Deus Fieremana.", TimeUnit.MILLISECONDS, temp_narrativa);
        System.out.println("\n");
        enter();
        System.out.println("\n---------------------------DESCANSO DE DEVON---------------------------");
        System.out.println("\n");
        enter();
        Digita("Narrador: \nApós seu descanso, Devon seguiu em frente e finalmente chegou na casa do Deus Fieremana.", TimeUnit.MILLISECONDS, temp_narrativa);
        Digita("\n\nDEUS FIEREMANA: \nQUEM OUSA ENTRAR EM MINHA CASA??"
        + "\nDEVON: \nOlá, Fieremana, sou Devon e estou aqui para basicamente te derrotar e pegar seus poderes."
        + "\nDEUS FIEREMANA: \nVOCÊ ME FAZ RIR, SEU NANICO. JÁ VIU MEU TAMANHO? COMO ACHA QUE VAI CONSEGUIR ME DERROTAR? NÃO ME FAÇA RIR."
        + "\nDEVON: \nESTOU PRONTO, FIEREMANA",TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("\n");
        enter();
        Digita("\n\nNARRADOR: \nFieremana é um Deus guloso, come de tudo que está ao seu alcance, isso justifica seu enorme tamanho."
        + "\nFieremana nunca está satisfeito, e seu cardápio é composto até por seres humanos."
        + "\nPara conseguir derrotar Fieremana, Devon precisa resolver o desafio para conseguir mais poderes e derrotar o gigante Deus.",
        TimeUnit.MILLISECONDS, temp_narrativa);
    }

    static String Desafio2() throws Exception{
        String questao = "Qual das alternativas corresponde 651 em base decimal para base octal? ";
        String alternativas[] = {"2234", "1132", "1211", "1231", "1213"};
        String resposta = alternativas[4]; // "1213";
        funcaoEmbaralhar(questao, alternativas, resposta);
        if(acertos == true)
        {
            System.out.println("Parabéns jogador! Conseguiu derrotar o gigante Deus Fieremana! E agora tem 2 dos 6 Poderes Supremos dos Deuses. ");
        }else{
            System.out.println("Resposta errada: Infelizmente não foi dessa vez que conseguiu derrotar o grande Fieremana. Melhor voltar para o Mefisto para terem uma conversa sobre.");
            ft_enter();
        }
        return resposta;
    }

    private static void ft_enter() {
        System.out.println("Aperte \"Enter\":");
        scanner.nextLine();
        scanner.nextLine();
    }

    public static void TerceiroEnredoDecisaoPósDesafio() throws Exception{
        DigitaLN("Havia dois caminhos para seguir, mas qual o certo?", TimeUnit.MILLISECONDS, temp_narrativa);
        DigitaLN("\n1. Ir pelo caminho da Floresta Negra", TimeUnit.MILLISECONDS, temp_narrativa);
        DigitaLN("\n2. Seguir para um caminho desconhecido", TimeUnit.MILLISECONDS, temp_narrativa);
        escolha = scanner.nextInt();
        do
        {
            if(escolha == 1){
                DigitaLN("\nEscolha 1: Ainda bem! Escolheu o melhor caminho para chegar ao seu próximo Deus.", TimeUnit.MILLISECONDS, temp_transicao);
            }
            else if(escolha == 2){
                String mensagem = "\nEscolheu 2: Tem o nome de Caminho Desconhecido por um motivo, volte para o começo.";
                DigitaLN(mensagem, TimeUnit.MILLISECONDS, temp_transicao);
                ContinuarVoltar(mensagem);
            }else{
                OpcaoInvalidaOuInexistente();
            }
        }while(escolha < 1 || escolha > 2);
    }

    private static void TerceiroEnredoFinal() throws Exception{
        Digita("Narrador: \nAgora, Devon segue para a terceira Deusa, Egoyis." + "\nEgoyis é uma deusa controladora."
        + "\nEla consegue entrar em sua mente para realizar tudo o que deseja."
        + "\nSempre pensando nela e apenas nela." + "\nDevon terá muita batalha pela frente",
        TimeUnit.MILLISECONDS, temp_narrativa);
    }

    private static void QuartoEnredo() throws Exception{
        System.out.println("\n");
        enter();
        Digita("\nDEUSA EGOYIS: \nOlá, Devon." + "\nBem-vindo a minha humilde residência. Eu estava te aguardando."
            + "\nDEVON: \nComo você sabia que eu estava vindo?" + "\nDEUSA EGOYIS: Está brincando?"
            + "\nSou o Deus controlador de mentes, consigo saber de tudo o que está acontecendo." + "\nTUDO."
            + "\nInclusive o que se passa na sua cabeça." + "\nMas para nossa batalha, não vou te controlar."
            + "\nNão preciso disso para ganhar de você."
            + "\nDEVON: \nAcho que você não sabe com quem está falando, Egoyis."
            + "\nMas vamos lá, Deus Controlador."
            + "\nNARRADOR: \nDevon subestimou Egoyis, e agora precisará resolver o desafio para conseguir derrotá-la.", 
        TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("\n");
        enter();
    }

    static String Desafio3() throws Exception{
        String questao = "Para derrotar Egoyis responda, simplifique o radical raiz quadrada de 27 e selecione a opção correta";
        String alternativas[] = {"raiz quadrada de 3", "2 raiz quadrada de 3", "3 raiz quadrada de 3", "3 raiz quadrada de 2", "2 raiz quadrada de 2"};
        String resposta = alternativas[2]; //3 raiz quadrada de 3
        funcaoEmbaralhar(questao, alternativas, resposta);
        if(acertos == true)
        {
            System.out.println("Parabéns, Devon! Conseguiu derrotar um dos maiores deuses. Agora tem 3 dos 6 Poderes Supremos dos Deuses. ");
        }else{
            System.out.println("Deusa Egoyis era mais poderosa do que você pensou. Melhor voltar para o Mefisto para terem uma conversa sobre.");
            ft_enter();
        }
        return resposta;
    }

    private static void QuartoEnredoFinal() throws Exception{
        Digita("\nNARRADOR: \nE Devon, consegue vencer a Deusa Egoyis, e segue para o quarto Deus."
            + "\nAgora para seguir com seu destino, Devon irá tirar um descanso para sua próxima batalha.",
        TimeUnit.MILLISECONDS, temp_narrativa);
    }

    static void QuartoEnredoDecisao() throws Exception{
        DigitaLN("\n-------------------------------DESCANSO DE DEVON------------------------------------",TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n");
        
        DigitaLN("ESCOLHA O QUE DEVON DEVE FAZER.",TimeUnit.MILLISECONDS,temp_transicao);
        DigitaLN("\n1. Deixar Devon descansar mais um pouco para que não tenha mais que descansar depois.",TimeUnit.MILLISECONDS,temp_transicao);
        DigitaLN("\n2. Acordar Devon para chegar na casa de Lust.",TimeUnit.MILLISECONDS,temp_transicao);
        escolha = scanner.nextInt();
        do
        {
            if(escolha == 1){
                String mensagem = "\nZzz...\n";
                DigitaLN(mensagem, TimeUnit.MILLISECONDS, temp_dialog);
                ContinuarVoltar(mensagem);
            }
            else if(escolha == 2){
                DigitaLN("\nACORDAR DEVON...", TimeUnit.MILLISECONDS, temp_dialog);
            }else{
                OpcaoInvalidaOuInexistente();
            }
        }while(escolha < 1 || escolha > 2);

    }

    private static void QuintoEnredo() throws Exception{
        System.out.println("\n");
        enter();
        Digita("\nNARRADOR: \nApós um longo caminho, Devon chegou na casa da Deusa Luts.", 
        TimeUnit.MILLISECONDS, temp_narrativa);
        System.out.println("\n");
        enter();
        Digita("\nDEVON: \nDEUSA LUTS, VIM AQUI PARA CUMPRIR MEU DESTINO. +\nDERROTÁ-LA E PEGAR O QUE ME PERTENCE. \nOS SEUS PODERES."
            + "\nDEUSA LUTS: \nDevon, se você sabe quem eu sou, não vai querer lutar comigo."
            + "\nAté porque, nem eu quero lutar com você."
            + "\nVocê é um ser inferior. + \nVocê não é digno de lutar comigo e muito menos ter meus poderes."
            + "\nDEVON: \nJá derrotei 3 deuses, Luts. + \nNão tenho medo de você. + \nVamos começar logo com isso."
            + "\nDEUSA LUTS: \nJá que é isso o que você deseja.",TimeUnit.MILLISECONDS, temp_dialog);
            enter();
            Digita("\nNARRADOR: \nE começa a batalha entre Luts e Devon."
            + "\nLuts é uma deusa que não aparenta a idade que possui."
            + "\nEla possui super resistência e poderes de regeneração."
            + "\nPraticamente impossível de ganhar dela em uma batalha."
            + "\nAlém disso, ela possui garras super afiadas, sendo possível cortar qualquer tipo de material."
            + "\nEla é uma grande Deusa e não será fácil ganhar dela.", 
        TimeUnit.MILLISECONDS, temp_narrativa);
        System.out.println("\n");
        enter();
    }

    static String Desafio4() throws Exception{
        System.out.println("\nDeusa Lust não esperava que Devon conseguisse chegar tão longe, ao ponto de derrubá-la.\n"
                + "E para finalizar, resolva o desafio:");
        String questao = "\nDesenvolva a equação de primeiro grau 4x - 8 = 6 + 2x para finalizar a Deusa Lust.";
        String alternativas[] = {"8", "5", "7", "9", "6"};
        String resposta = alternativas[2]; // 7
        funcaoEmbaralhar(questao, alternativas, resposta);
        if (acertos == false)
        {
            System.out.println("\nDeusa Lust te pegou de jeito. Melhor voltar para o Mefisto para terem uma conversa sobre essa última batalha.");
        }else{
            System.out.println("\nConseguiu derrotar a Deusa das Deusas! E agora tem 4 dos 6 Poderes Supremos dos Deuses. Você está quase lá.");
            ft_enter();
        }
        return resposta;
    }

    private static void QuintoEnredoFinal() throws Exception{
        Digita("\nA Deusa com suas últmas forças, falou suas últimas palavras..."
        + "\n\nDEUSA LUST: \nVocê me impressionou. Meus parabéns, garoto...", TimeUnit.MILLISECONDS, temp_dialog);
    }

    private static void SextoEnredo() throws Exception{
        Digita("\n\nNARRADOR: \nE assim, finalizou a batalha."
            + "\nDevon está cada vez mais forte, já que agora está com 4 Poderes Supremos."
            + "\nSerá possível que seu destino será realizado? Tudo voltará a ser como deve?"
            + "\nDevon segue seu caminho para o próximo Deus. O Deus do fogo, Krieg."
            + "\nKrieg é um deus perverso, gosta de provocar dor e sofrimento quando tem a chance."
            + "\nEle possui grandes poderes de fogo." + "\nConsegue fazer qualquer coisa com o seu elemento.",TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n\n-----------------------CHEGANDO NA CASA DE KRIEG-----------------------");
            enter();
            Digita("\nDEUS KRIEG: \nOlá olá olá, Devon, meu querido. Ouvi falar tanto de você."
            + "\nDerrotou meus queridíssimos amigos que eu tanto gostava."
            + "\nQue peninha. Eles não foram fortes o suficiente para derrotar você."
            + "\nMas adivinhe, EU SOU O SUFICIENTE HA-HA-HA-HA."
            + "\nDEVON: \nUAU, Krieg. Que bela introdução. Vamos ver se você é tudo isso mesmo."
            + "\nDEUS KRIEG: \nVOCÊ ESTÁ ME DESAFIANDO, GAROTO? QUEM VOCÊ PENSA QUE É?"
            + "\nDEVON: \nEU SOU O DEUS DO FOGO!",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n\nNARRADOR: \nKrieg fica furioso com o sarcasmo de Devon e por isso começam uma sangrenta batalha."
            + "\nPara Devon ganhar de Krieg rapidamente, ele precisa resolver logo o desafio, já que Krieg não está deixando fácil para ele.",
            TimeUnit.MILLISECONDS, temp_narrativa);
    }

    static String Desafio5() throws Exception{
        String questao = "Resolva o desafio 23x - 16 = 14 - 17x e derrote Krieg de uma vez por todas";
        String alternativas[] = {"4/5", "3/4", "2/3", "1/2", "4/3"};
        String resposta = alternativas[1]; // "3/4"
        funcaoEmbaralhar(questao, alternativas, resposta);
        if(acertos == false)
        {
            System.out.println("Krieg te pegou de jeito, Devon. Volte para o começo e fale com Mefisto.");
        }else{
            System.out.println("Krieg se deu mal mesmo. Muito bem, jogador! Agora tem 5 dos 6 Poderes Supremos dos Deuses. Você está cada vez mais próximo.");
            ft_enter();
        }
        return resposta;
    }

    private static void SetimoEnredo() throws Exception{
        Digita("\nNARRADOR: \nA batalha contra Krieg não foi fácil, e Devon está esgotado, mas sem tempo para descanso!"
            + "\nEle precisa ir o mais rápido possível para conseguir o ÚLTIMO Poder Supremo."
            + "\nE ela já está aguardando por ele." + "\nEla é Shi. A Deusa da Morte."
            + "\nShi é a mais forte dos Deuses, acho que pelo nome já deu para entender seus poderes."
            + "\nA Deusa Shi tem seu corpo e alma extremamente protegidos." + "\nEla não sente nenhum tipo de dor."
            + "\nShi é uma Deusa que não pode ser controlada." + "\nNada pode atingi-la."
            + "\nAtualmente, Devon está com 5 dos 6 Poderes Supremos. Será que eles são o suficiente para derrotar a Deusa Shi? Será que ELE é suficiente?"
            + "\nDevon está pensando na combinação perfeita dos poderes para conseguir derrotar a Deusa Shi."
            + "\n\n-----------------------A CAMINHO DA TORRE DE SHI-----------------------"
            + "\nChegando próximo a Torre de Shi, Devon começa a ouvir muitas pessoas gritando euforicamente."
            + "\nQuando ele vê, é um público gigante, que o aguardava para a grande batalha."
            + "\nTudo ideia da Deusa Shi" + "\nDEVON: Mas o que é isso?"
            + "\nDEUSA SHI: \nOlá Devon. Espero que tenha feito uma ótima viagem até aqui."
            + "\nSoube que teve algumas pedras no caminho, mas conseguiu."
            + "\nDEVON: \nÉ, não foi tão difícil assim. Essas tais pedras..."
            + "\nDEUSA SHI: \nCerto. Espero que tenha gostado do público que eu juntei para você."
            + "\nDEVON: \nÉ realmente impressionante, obrigado." + "\nDEUSA SHI: Não há de que, Devon."
            + "\nAgora me conte, está aqui pelo tal destino que Mefisto te deu?"
            + "\nEu imagino que sim. Aquele velho fala demais."
            + "\nO Mundo está do jeito que está por conta da podridão do ser humano."
            + "\nE eles devem SOFRER as consequências do que fizeram."
            + "\nVocê realmente acha que eles merecem ser salvos?"
            + "\nDEVON: \nAcho que podemos colocar tudo em seu lugar, Shi."
            + "\nDando uma segunda chance de um modo que eles vão entender."
            + "\nDEUSA SHI: \nDeixa eu te contar uma coisa. Você sabe o que quer dizer os nomes dos Deuses que você matou?"
            + "\nO primeiro Deus, Hasad é a inveja." + "\nO segundo Deus, Fieremana é a gula."
            + "\nA terceira Deusa, Egoyis é o egoísmo." + "\nA quarta Deusa, Lust, é a luxúria."
            + "\nO quinto Deus, Krieg é a guerra." + "\n E eu é claro, a MORTE."
            + "\nJunte nós todos em um e somos o que o ser humano é."
            + "\nSomos tudo o que há de errado com o Mundo."
            + "\nDEVON: \nE por isso, eu vou colocar tudo como era antes. Para que tudo funcione."
            + "\nTemos recursos limitados. As pessoas entenderão." + "\nNADA SERÁ EM VÃO."
            + "\nDEUSA SHI: \nQUE ASSIM SEJA!!"
            + "\n\n-----------------------COMEÇA A BATALHA ENTRE SHI E DEVON-----------------------"
            + "\nNARRADOR: \nShi não entendia porque Devon queria tanto isso."
            + "\nEla não entendia o porque dele quase morrer tantas vezes para conseguir os poderes."
            + "\nShi via que Devon carregava seu destino e que iria ser cumprido de qualquer jeito."
            + "\nEla não esperava tanta determinação vindo de Devon."
            + "\nShi estava fraca, desiludida e caindo em sua própria escuridão."
            + "\nPara que o destino se concretize, é preciso realizar o último desafio.",
            TimeUnit.MILLISECONDS, temp_dialog);
    }

    static String Desafio6() throws Exception{
        String questao = "Para esse último desafio, responda, 10y - 5(1 + y) = 3(2y - 2) - 20.";
        String alternativas[] = {"20", "18", "19", "21", "16"};
        String resposta = alternativas[3]; //21
        funcaoEmbaralhar(questao, alternativas, resposta);
        if(acertos == false)
        {
            System.out.println(
                "Resposta errada: Shi te enganou e você foi pego pela escuridão dela. Volte e fale com Mefisto.");
        }else{
            System.out.println(
                "Devon, VOCÊ CONSEGUIU!! CONQUISTOU TODOS OS 6 PODERES SUPREMOS DOS DEUSES.Agora cumpra seu destino.");
            ft_enter();
        }
        return resposta;
    }

    private static void SetimoEnredoFinal() throws Exception{
        Digita("\nE ele conseguiu. Concretizou o seu destino. Agora, Devon voltará para Mefisto mais forte do que ele esperava."
            + "\n\n-----------------------CAMINHO PARA CHEGAR NA CASA DE MEFISTO-----------------------"
            + "\nMEFISTO: \nVOCÊ CONSEGUIU!! DEVON, VOCÊ CONSEGUIU!!!!"
            + "\nSinceramente por um instante achei que não iria conseguir mas VOCÊ DERROTOU TODOS!!"
            + "\nAGORA CHEGOU O MOMENTO DE FINALIZAR SEU DESTINO." + "\nDEVON: \nObrigado, Mefisto."
            + "\nAgora podemos finalizar meu destino. O que devemos fazer?"
            + "\nAgora meu menino, basta concentrar seus poderes e pensar no mundo que você sempre desejou, e nunca pôde ter."
            + "\nEstarei sempre ao seu lado." + "\nDEVON: \nTudo bem." + "\nO mundo que eu sempre quis..."
            + "\n\n-----------------------DEVON IMAGINANDO O MUNDO PERFEITO-----------------------"
            + "\nDEVON: \nEstá feito." + "\nMEFISTO: Muito bem, meu garoto. Como você pens..."
            + "\nO..que.. está.. acontecendo? Eu... estou... desaparecendo..."
            + "\nDEVON: Não é isso que você queria?" + "\nUm Mundo melhor? Pois bem, Mefisto, AQUI ESTÁ ELE."
            + "\nNesse exato momento, metade da população do Mundo está sendo aniquilada."
            + "\nTudo está ficando do jeito que deve ser."
            + "\nE relaxa, não é nada pessoal. As pessoas são aleatórias, assim como você."
            + "\nAgora o mundo está perfeito. E vou tomar conta dele."
            + "\nMEFISTO: \nMas... não era pra... ser desse... jeito... garoto" + "\nO que... você... fez..."
            + "\nDEVON: \nAdeus, Mefisto."
            + "\nNARRADOR: Infelizmente, Devon aniquilou metade da população mundial."
            + "\nSem nenhum remorço, sem nenhum sentimento. Nada." + "\nEra o que ele queria desde o começo."
            + "\nSempre foi o objetivo.", 
        TimeUnit.MILLISECONDS, temp_dialog);
    }

    public static void ContinuarVoltar(String mensagem) throws Exception {
        /*
        função destinada a decisões sem saída
        */
        int escolha = 0;
        do
        {
            Digita("\n\n1 - Continuar\n2 - Voltar\n\nDigite sua opção:\n", TimeUnit.MILLISECONDS, temp_transicao);
            escolha = scanner.nextInt();
            if(escolha == 1){
                Digita(mensagem, TimeUnit.MILLISECONDS, temp_transicao);
                ContinuarVoltar(mensagem);
            }else if(escolha == 2){
                if(Contexto_ContinuarVoltar == 1){
                    PrimeiroEnredoDecisao();
                }
                if(Contexto_ContinuarVoltar == 2){
                    TerceiroEnredoDecisaoPósDesafio();
                }
                if(Contexto_ContinuarVoltar == 3){
                    QuartoEnredoDecisao();
                }
                return;
            }else{
                OpcaoInvalidaOuInexistente();
            }
        }while(escolha < 1 || escolha > 2);
    }

    private static void enter() throws Exception {
    System.out.println("\n>>Aperte \"Enter\" para seguir");
    scanner.nextLine();
}
    private static void ft_enter_comeca_jogo() throws Exception {
        System.out.println("\n>>Aperte \"Enter\" para começar o jogo");
        scanner.nextLine();
        scanner.nextLine();
    }

    private static void ft_enter_menu() throws Exception {
        System.out.println("\n>>Aperte \"Enter\" para mostrar o MENU novamente");
        scanner.nextLine();
        scanner.nextLine();
    }


    private static void Creditos() throws InterruptedException {
        Digita("\n********************************************************************************************************************************\n", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("** 'Devon' Foi desenvolvido como parte do projeto integrador do curso de Analise e Desenvolvimento de Sitemas no Senac        **\n", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("** O grupo de desenvolvimento é composto por:                                                                                 **"+
        "\n**                                                                                                                            **"+
        "\n** • Elton Freitas                                                                                                            **"+
        "\n** • Keity Pires                                                                                                              ** " + 
        "\n** • Matheus Galvão                                                                                                           **" + 
        "\n** • Milena Kamimura                                                                                                          **"+ 
        "\n** • Vinicius Gomes                                                                                                           **\n", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("**                                              Obrigado a todos                                                              **\n", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("********************************************************************************************************************************\n", TimeUnit.MILLISECONDS, temp_dialog);
    }

    private static void Instrucoes() throws InterruptedException {
        System.out.println("==================================================================================================================================================\n");
        Digita("Devon é um jogo de perguntas e respostas, onde o jogador enfrenta desafios para progredir na historia;\n", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("Os desafios são compostos por 6 desafios e 5 alternativas: (1, 2, 3, 4, 5) onde serão testados seus conhecimentos referente a matéria de matematica;\n", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("Para selecionar as respostas, você deve digitar a letra correspodente a alternativa que considera correta;\n", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("Não há chances para erro. Caso erre qualquer questão, o jogo será reiniciado.\n", TimeUnit.MILLISECONDS, temp_dialog);
    }

    public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_mensagem);
        }
    }

    /*
    DigitaLN (Digita e quebra linha) - substituto para println
    */
    public static void DigitaLN(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_mensagem);
        }
        System.out.print("\n");
    }

    public static void OpcaoInvalidaOuInexistente() throws Exception{
        DigitaLN("Opção inválida ou inexistente! \n>> Aperte \"Enter\" ", TimeUnit.MILLISECONDS, temp_dialog);
        scanner.nextLine();
        scanner.nextLine();
    }

    static boolean funcaoEmbaralhar(String questao, String alternativas[], String resposta) throws Exception {
        /*
        Principais objetivos desta função
        - Embaralhar
        - Imprimir alternativas embaralhadas
        - Verificar resposta
        */
        boolean result  = false; //variável para dar retorno ao teste
        int letter[] = {1, 2, 3, 4, 5}; //escolha das alternativas
        ArrayList<String> opcoes = new ArrayList<String>();
        int escolha_certa = 0; //variável para salvar a alternativa certa após embaralhar

        //adicionando conteúdo das alternativas para embaralhar      
        for(int i = 0; i < alternativas.length; i++){
            opcoes.add(alternativas[i]);
        }
        //embaralhando as alternativas
        Collections.shuffle(opcoes);
        //imprimindo as alternativas embaralhadas e verificando a escolha do usuário
        do
        {
            System.out.print("\n"+questao+"\n");
            for(int i = 0; i < alternativas.length; i++){
                System.out.println(letter[i]+". "+opcoes.get(i)); //imprime "letter" + alternativa
                if(opcoes.get(i).equals(resposta)){
                    escolha_certa = letter[i];} //salva a escolha certa 
            }
            ft_verifica_escolha(escolha_certa);
        }while(escolha < 1 || escolha > 5);
        result = acertos;
        return result;
    }

    private static void ft_verifica_escolha(int escolha_certa) throws Exception {
        Digita("\nDigite sua opção/escolha: ", TimeUnit.MILLISECONDS, temp_dialog);
        escolha = scanner.nextInt();
        switch(escolha)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                if(escolha == escolha_certa){
                    acertos = true;
                }else{
                    acertos = false;}
                break;
            default:
                OpcaoInvalidaOuInexistente();
                break;
        }
    }
}
