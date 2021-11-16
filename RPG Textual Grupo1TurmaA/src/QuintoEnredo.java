import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class QuintoEnredo {

    // static int temp_dialog = 25, temp_narrativa = 75, temp_transicao = 10; //
    // Para rodar o jogo sem o delay nas
    static int temp_dialog = 1, temp_narrativa = 75, temp_transicao = 10; // Para rodar o jogo sem o delay nas
                                                                          // mensagens, pode mudar o valor destas 3
                                                                          // variáveis para 0;
    static Scanner scanner = new Scanner(System.in);
    static int choice = 0;

    public static void main(Object args) throws Exception {
        Digita("\nNARRADOR: \nApós um longo caminho, Devon chegou na casa da Deusa Luts."
                + "\nDEVON: \nDEUSA LUTS, VIM AQUI PARA CUMPRIR MEU DESTINO. +\nDERROTÁ-LA E PEGAR O QUE ME PERTENCE. \nOS SEUS PODERES."
                + "\nDEUSA LUTS: \nDevon, se sabe quem eu sou não vai querer lutar comigo."
                + "\nAté porque, nem eu quero lutar com você."
                + "\nVocê é um ser inferior. + \nVocê não é digno de lutar comigo e muito menos ter meus poderes."
                + "\nDEVON: \nJá derrotei 3 deuses, Luts. + \nNão tenho medo de você. + \nVamos começar logo com isso."
                + "\nDEUSA LUTS: \nJá que é isso o que você deseja."
                + "\nNARRADOR: \nE começa a batalha entre Luts e Devon."
                + "\nLuts é uma deusa que não aparenta a idade que possui."
                + "\nEla possui super resistência e poderes de regeneração."
                + "\nPraticamente impossível de ganhar dela em uma batalha."
                + "\nAlém disso, ela possui garras super afiadas possíveis de cortar qualquer tipo de material."
                + "\nEla é uma grande Deusa e não será nenhum pouco fácil ganhar dela."
                // DESAFIO 04
                + "\nA Deusa com suas últmas forças, falou suas últimas palavras."
                + "\nDEUSA LUST: \nVocê me impressionou. Meus parabéns, garoto.", TimeUnit.MILLISECONDS, temp_dialog);

    }

    public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_mensagem);

        }

    }
}
