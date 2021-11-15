
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class TerceiroEnredo {

    // static int temp_dialog = 25, temp_narrativa = 75, temp_transicao = 10; // //
    // Para rodar o jogo sem o delay nas
    static int temp_dialog = 1, temp_narrativa = 75, temp_transicao = 10; // Para rodar o jogo sem o delay nas //
                                                                          // mensagens, pode mudar o valor destas 3 //
                                                                          // variáveis para 0;

    static Scanner scanner = new Scanner(System.in);
    static int choice = 0;

    public static void main(Object args) throws Exception {

    Digita("\nDEVON: EU CONSEGUI!! EU VENCIIII!"
    + "\nDEUS HASAD: Você...não sabe...o que está fazendo...garoto"
    + "\nNARRADOR: E assim, Devon segue para o seu próximo Deus, o GRANDE Fieremana."
    +"\nFieremana é um Deus devorador, ou seja, ele basicamente come tudo o que deseja."
    + "\nNão será fácil para nosso Devon."
    +"\nApós a grande luta com Hasad, Devon parou um pouco no caminho para recarregar suas energias para sua próxima batalha, e terá um longo caminho para chegar no Deus Fieremana."
    +"\n\n---------------------------DESCANSO DE DEVON---------------------------"
    +"\n\nApós seu descanso, Devon seguiu em frente e finalmente chegou na casa do Deus Fieremana."
    +"\nDEUS FIEREMANA: QUEM OUSA ENTRAR EM MINHA CASA??"
    +"\nDEVON: Olá, Fieremana, sou Devon e estou aqui para basicamente te derrotar e pegar seus poderes."   
    +"\nDEUS FIEREMANA: VOCÊ ME FAZ RIR, SEU NANICO. JÁ VIU MEU TAMANHO? COMO ACHA QUE VAI CONSEGUIR ME DERROTAR? NÃO ME FAÇA RIR."
    +"\nDEVON: ESTOU PRONTO, FIEREMANA"
    +"\nNARRADOR:Fieremana é um Deus guloso, come de tudo que está ao seu alcance por isso justifica seu enorme tamanho. Fieremana nunca está satisfeito, e cabe até no seu cardápio seres humanos."
    //DESAFIO 03
    +"\nAgora, Devon segue para deu terceiro Deusa, Egoyis."
    +"\nO Deus Egoyis é uma deusa controladora."
    +"\nEla consegue entrar em sua mente para realizar tudo o que deseja." 
    +"\nSempre pensando nela e apenas nela."
    +"\nDevon terá muita batalha pela frente", TimeUnit.MILLISECONDS, temp_dialog);

    public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_mensagem);

        }

    }

}