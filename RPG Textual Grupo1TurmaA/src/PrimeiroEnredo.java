import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class PrimeiroEnredo {

    // static int temp_dialog = 25, temp_narrativa = 75, temp_transicao = 10; // Para rodar o jogo sem o delay nas
    static int temp_dialog = 1, temp_narrativa = 75, temp_transicao = 10; // Para rodar o jogo sem o delay nas
                                                                           // mensagens, pode mudar o valor destas 3
                                                                           // variáveis para 0;
    static Scanner scanner = new Scanner(System.in);
    static int choice = 0;

    public static void main(Object args) throws Exception {
        Digita("\nMEFISTO: Seja Bem Vindo, meu caro jogador. Sou Mefisto, e você, como se chamas?"
                + "\nDEVON: \nMe chamo Devon "
                + "\nMEFISTO: \nDEVON? DEVON, O MÍSTICO? NÃO É POSSÍVEL!! É VOCÊ? O ESCOLHIDO??"
                + "\nDEVON: \nEU? ESCOLHIDO? "
                + "\nMEFISTO: \nSim, Devon. O ESCOLHIDO. Vivemos neste Mundo caótico, podre e sem vida. Um mundo onde a ignorância e a ganância são os líderes."
                + "\nE você foi escolhido, sim, exatamente, você foi ESCOLHIDO. VOCÊ, DEVON. O MÍSTICO."
                + "\nSeu destino, Devon, é dar a VIDA de volta ao Mundo, e que tudo volte ao seu devido e correto lugar."
                + "\nPara que TUDO funcione novamente. Fazer com que tudo seja eliminado."
                + "\nNão será fácil, para termos essa conquista, pode até custar a sua vida."
                + "\nDEVON: \nMas, Mefisto, não tenho poderes para tal conquista. Como vou fazer isso acontecer? Não tem como eu conseguir."
                + "\nMEFISTO: \nHA-HA-HA-HA VOCÊ PRECISARÁ DOS PODERES DOS 6 DEUSES MAIS PODEROSOS DO MUNDO PARA CONSEGUIR. PARA DERROTÁ-LOS VOU LHE DAR UM BELO DE UM UPGRADE."
                + "\nAQUI, RECEBA GLADIUS, SUA MAIS NOVA LEAL COMPANHEIRA. ELA IRÁ TE GUIAR E TE DAR FORÇAS PARA AS NOVAS BATALHAS."
                + "\nE ASSIM, QUANDO CONSEGUIR OS 6 PODERES SUPREMOS, TUDO FICARÁ DO JEITO QUE DEVE SER."
                + "\nDEVON: \nE por onde eu devo começar?"
                + "\nMEFISTO: \nA partir de agora é com você. Você já sabe o que fazer. \nBoa sorte, Devon, O Místico."
                + "\n " + "\nNARRADOR: \nE começa a jornada de DEVON."
                + "\nSeu primeiro Deus é Hasada, que mora em Terra de Ninguém."
                + "\nMas para chegar lá, precisa escolhar o caminho correto" + "\nPara onde Devon deve ir?",
                TimeUnit.MILLISECONDS, temp_dialog);
                do 
                {
                    Digita("\n\n1. Montanhas do Amanhã\n2. Ponte Travessa\n\nDigite sua opção: ", TimeUnit.MILLISECONDS, temp_dialog);
                    choice = scanner.nextInt();
                    if(choice == 1){
                        Digita("Escolha 1: Você escolheu as Montanhas do Amanhã, e infelizmente elas te levaram para um buraco sem fundo.", TimeUnit.MILLISECONDS, temp_dialog);
                        break;
                    }
                    if(choice == 2){
                        Digita("Escolha 2: Você escolheu a Ponte Travessa, e Devon conseguiu achar um atalho para chegar na Terra de Ninguém ", TimeUnit.MILLISECONDS, temp_dialog);
                    }else{
                        System.out.println("Opção Inválida ou Inexistente");
                    }
                }while (choice < 1 || choice > 2);
    }

    public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_mensagem);

        }

    }

}