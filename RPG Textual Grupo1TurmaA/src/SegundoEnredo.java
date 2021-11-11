import java.util.concurrent.TimeUnit;
public class SegundoEnredo {
    static int temp_dialog =25, temp_narrativa = 75, temp_transicao = 10; //Para rodar o jogo sem o delay nas mensagens, pode mudar o valor destas 3 variáveis para 0;
        public static void main(String[] args) throws Exception{
        Digita("Alguns dias depois..." + 
        "\n "+
        "\nNARRADOR: " +
        "\nDepois de uma longa jornada, Devon chegou em sua primeira batalha... \nE lá, Hasad lhe aguardava."+
        "\n"+
        "\nDEVON: \nVIM EMBUSCA DO SEU PODER, HASAD!. E NÃO HÁ NADA QUE ME EMPEDIRÁ DE DERROTÁ-LO. "
        +"\nDEUS HASAD:  \nQUEM VOCÊ PENSA QUE É PARA ESTAR FALANDO COMIGO ASSIM?"+
        "\nEU SOU O GRANDE HASAD, DEUS METAMORFO." +
        "\nSAIA DAQUI ANTES QUE VEJA MINHA FÚRIA." +        
        "\nDEVON: \nVeremos essa fúria então, Hasad."+
        "\nDEUS HASAD:"+
       " \nVOCÊ FOI AVISADO, SEU TOLO.",TimeUnit.MILLISECONDS, temp_dialog);
        }
       public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
        System.out.print(caractere);
        unit.sleep(tempo_mensagem);
    }

    }

}
