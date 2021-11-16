import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class QuartoEnredo {
    // static int temp_dialog = 25, temp_narrativa = 75, temp_transicao = 10; // //
    // Para rodar o jogo sem o delay nas
    static int temp_dialog = 1, temp_narrativa = 75, temp_transicao = 10; // Para rodar o jogo sem o delay nas //
                                                                          // mensagens, pode mudar o valor destas 3 //
                                                                          // variáveis para 0;

    static Scanner scanner = new Scanner(System.in);
    static int choice = 0;

    public static void main(Object args) throws Exception {

        Digita("\nDEUSA EGOYIS: \nOlá, Devon." + "\nBem-vindo a minha humilde residência. Eu estava te aguardando."
                + "\nDEVON: \nComo você sabia que eu estava vindo?" + "\nDEUSA EGOYIS: Está brincando?"
                + "\nSou o Deus controlador de mentes, consigo saber de tudo o que está acontecendo." + "\nTUDO."
                + "\nInclusive o que se passa na sua cabeça." + "\nMas para nossa batalha, não vou te controlar."
                + "\nNão preciso disso para ganhar de você."
                + "\nDEVON: \nAcho que você não sabe com quem está falando, Egoyis."
                + "\nMas vamos lá, Deus Controlador."
                + "\nNARRADOR: \nDevon subestimou Egoyis, e agora precisará resolver o desafio para conseguir derrotá-la."

                // DESAFIO 03
                + "\nNARRADOR: \nE Devon, consegue vencer o Deusa Egoyis, e segue para o quarto Deus."
                + "\nAgora para seguir com seu destino, Devon irá tirar um descanso para sua próxima batalha.",
                TimeUnit.MILLISECONDS, temp_dialog);

    }

    public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_mensagem);

        }

    }

}
