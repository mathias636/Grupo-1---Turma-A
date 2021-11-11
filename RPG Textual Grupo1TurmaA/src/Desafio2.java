import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
        
        D2();
        
    }
    
    

   public static void D2() {
    	
	   Scanner scanner = new Scanner(System.in);
	   
	   
    	int resposta;
    	
    	System.out.println("Qual das alternativas corresponde 651 em base decimal para base octal? ");
    	System.out.println("1. 2234");
    	System.out.println("2. 1132");
    	System.out.println("3. 1211");
    	System.out.println("4. 1231");
    	System.out.println("5. 1213");
    	resposta = scanner.nextInt();
    	
    	switch (resposta) 
    	{
    	
    	case 1:
    	case 2:
    	case 3:
    	case 4:
    		System.out.println("Resposta errada: Infelizmente não foi dessa vez que conseguiu derrotar o grande Fieremana. Melhor voltar para o Mefisto para terem uma conversa sobre.");
    		break;
    	case 5:
    		System.out.println("Parabéns jogador! Conseguiu derrotar o gigante Deus Fieremana! E agora tem 2 dos 6 Poderes Supremos dos Deuses. ");
    		break;
    	
    	}
    	
    }



public static boolean main(Object args, boolean acertos) {
    return false;
}

}
