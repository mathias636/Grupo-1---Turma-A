import java.util.concurrent.TimeUnit;

public class PrimeiroEnredo {

    static int temp_dialog = 25, temp_narrativa = 75, temp_transicao = 10; // Para rodar o jogo sem o delay nas
                                                                           // mensagens, pode mudar o valor destas 3
                                                                           // variáveis para 0;

    public static void main(String[] args) throws Exception {
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
                + "\nMEFISTO:"
                + "\nHA-HA-HA-HA VOCÊ PRECISARÁ DOS PODERES DOS 6 DEUSES MAIS PODEROSOS DO MUNDO PARA CONSEGUIR. PARA DERROTÁ-LOS VOU LHE DAR UM BELO DE UM UPGRADE."
                + "\nAQUI, RECEBA GLADIUS, SUA MAIS NOVA LEAL COMPANHEIRA. ELA IRÁ TE GUIAR E TE DAR FORÇAS PARA AS NOVAS BATALHAS."
                + "\nE ASSIM, QUANDO CONSEGUIR OS 6 PODERES SUPREMOS, TUDO FICARÁ DO JEITO QUE DEVE SER.",
                TimeUnit.MILLISECONDS, temp_dialog);

    }

    public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_mensagem);

        }

    }

}