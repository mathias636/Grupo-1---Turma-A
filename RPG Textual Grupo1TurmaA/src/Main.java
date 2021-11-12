import java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    private static Object args;
    public static void main(String[] args) throws Exception {
        boolean menu_stop = false;
        boolean acertos = false;
        do
        {
            menu_stop = Menu.main(args, menu_stop);
        }while(menu_stop == false);

        while(acertos == false)
        {
            acertos = ft_jogo(acertos);
        }
    }

    private static boolean ft_jogo(boolean acertos) throws Exception {
        //primeiro Enredo não precisa de condicional
        // PrimeiroEnredo.main(args);
        acertos = Desafio1.main(args, acertos);
        //Só passará para os próximos se e somente se acertar o desafio anterior
        if(acertos == true){
            SegundoEnredo.main(args);
            acertos = Desafio2.main(args, acertos);}
        if(acertos == true){
            TerceiroEnredo.main(args);
            acertos = Desafio3.main(args, acertos);}
        if(acertos == true){
            QuartoEnredo.main(args);
            acertos = Desafio4.main(args, acertos);}
        if(acertos == true){
            QuintoEnredo.main(args);
            acertos = Desafio5.main(args, acertos);}
        if(acertos == true){
            SextoEnredo.main(args);
            acertos = Desafio6.main(args, acertos);}
        return acertos;
        //se o parâmetro acertos não passar para as outras classes, criar uma variável boolean em ft_jogo
    }
}
