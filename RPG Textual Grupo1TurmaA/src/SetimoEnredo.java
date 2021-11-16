import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class SetimoEnredo {
    // static int temp_dialog = 25, temp_narrativa = 75, temp_transicao = 10; //
    // Para rodar o jogo sem o delay nas
    static int temp_dialog = 1, temp_narrativa = 75, temp_transicao = 10; // Para rodar o jogo sem o delay nas
                                                                          // mensagens, pode mudar o valor destas 3
                                                                          // variáveis para 0;
    static Scanner scanner = new Scanner(System.in);
    static int choice = 0;

    public static void main(Object args) throws Exception {
        Digita("\nNARRADOR: \nA batalha contra Krieg não foi fácil, e Devon está esgotado, mas sem tempo para descanso!"
                + "\nEle precisa ir o mais rápido possível para conseguir o ÚLTIMO Poder Supremo."
                + "\nE ela já está aguardando por ele." + "\nEla é Shi. A Deusa da Morte."
                + "\nShi é a mais forte dos Deuses, acho que pelo nome já deu para entender seus poderes."
                + "\nA Deusa Shi tem seu corpo e alma extremamente protegido." + "\nEla não sente nenhum tipo de dor."
                + "\nShi é uma Deusa que não pode ser controlada." + "\nNada pode atingir ela."
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
                + "\nDEVON: \nÉ realmente impressionante, obrigada." + "\nDEUSA SHI: Não há de que, Devon."
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
                + "\nPara que o destino se concretize, é preciso realizar o último desafio."
                // DESAFIO 06
                + "\nE ele conseguiu. Concretizou o seu destino. Agora, Devon voltará para Mefisto mais forte do que ele esperava."
                + "\n\n-----------------------CAMINHO PARA CHEGAR NA CASA DE MEFISTO-----------------------"
                + "\nMEFISTO: \nVOCÊ CONSEGUIU!! DEVON, VOCÊ CONSEGUIU!!!!"
                + "\nSinceramente por um instante achei que não iria conseguir mas VOCÊ DERROTOU TODOS!!"
                + "\nAGORA CHEGOU O MOMENTO DE FINALIZAR SEU DESTINO." + "\nDEVON: \nObrigada, Mefisto."
                + "\nAgora podemos finalizar meu destino. O que devemos fazer?"
                + "\nAgora meu menino, basta concentrar seus poderes e pensar no Mundo que você sempre desejou, e nunca pôde ter."
                + "\nEstarei sempre ao seu lado." + "\nDEVON: \nTudo bem." + "\nO Mundo que eu sempre quis..."
                + "\n\n-----------------------DEVON IMAGINANDO O MUNDO PERFEITO-----------------------"
                + "\nDEVON: \nEstá feito." + "\nMEFISTO: Muito bem, meu garoto. Como você pens..."
                + "\nO..que.. está.. acontecendo? Eu... estou... desaparecendo..."
                + "\nDEVON: Não é isso que você queria?" + "\nUm Mundo melhor? Pois bem, Mefisto, AQUI ESTÁ ELE."
                + "\nNesse exato momento, metade da população do Mundo está sendo aniquilada."
                + "\nTudo está ficando do jeito que deve ser."
                + "\nE relaxa, não é nada pessoal. As pessoas são aleatórias, assim como você."
                + "\nAgora o Mundo está perfeito. E vou tomar conta dele."
                + "\nMEFISTO: \nMas... não era pra... ser desse... jeito... garoto" + "\nO que... você... fez..."
                + "\nDEVON: \nAdeus, Mefisto."
                + "\nNARRADOR: Infelizmente, Devon aniquilou metade da população mundial."
                + "\nSem nenhum remorço, sem nenhum sentimento. Nada." + "\nEra o que ele queria desde o começo."
                + "\nSempre foi o objetivo.", TimeUnit.MILLISECONDS, temp_dialog);

    }

    public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_mensagem);

        }

    }
}
