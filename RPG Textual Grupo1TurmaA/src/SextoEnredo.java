import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class SextoEnredo {

    // static int temp_dialog = 25, temp_narrativa = 75, temp_transicao = 10; //
    // Para rodar o jogo sem o delay nas
    static int temp_dialog = 1, temp_narrativa = 75, temp_transicao = 10; // Para rodar o jogo sem o delay nas
                                                                          // mensagens, pode mudar o valor destas 3
                                                                          // variáveis para 0;
    static Scanner scanner = new Scanner(System.in);
    static int choice = 0;

    public static void main(Object args) throws Exception {
        Digita("\nNARRADOR: \nE assim, finalizou a batalha."
                + "\nDevon está cada vez mais forte, já qu agora está com 4 Poderes Supremos."
                + "\nSerá possível que seu destino será realizado? Tudo voltará como deve ser?"
                + "\nDevon segue seu caminho para o próximo Deus. O Deus do fogo, Krieg."
                + "\nKrieg é um deus perverso, gosta de provocar dor e sofrimento quando tem a chance."
                + "\nEle possui grandes poderes de fogo." + "\nConsegue fazer qualquer coisa com o seu elemento."
                + "\n\n-----------------------CHEGANDO NA CASA DE KRIEG-----------------------"
                + "\nDEUS KRIEG: \nOlá olá olá, Devon, meu querido. Ouvi falar tanto de você."
                + "\nDerrotou meus queridíssimos amigos que eu tanto gostava."
                + "\nQue peninha. Eles não foram fortes o suficiente para derrotar você."
                + "\nMas adivinhe, EU SOU O SUFICIENTE HA-HA-HA-HA."
                + "\nDEVON: \nUAU, Krieg. Que bela introdução. Vamos ver se você é tudo isso mesmo."
                + "\nDEUS KRIEG: \nVOCÊ ESTÁ ME DESAFIANDO, GAROTO? QUEM VOCÊ PENSA QUE É?"
                + "\nDEVON: \nEU SOU O DEUS DO FOGO!"
                + "\nNARRADOR: \nKrieg fica furioso com o sarcasmo de Devon e por isso começam uma sangrenta batalha."
                + "\nPara Devon ganhar de Krieg rapidamente, ele precisa resolver logo o desafio, já que Krieg não está deixando fácil para ele."
        // DESAFIO 05
                , TimeUnit.MILLISECONDS, temp_dialog);

    }

    public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_mensagem);

        }

    }
}
