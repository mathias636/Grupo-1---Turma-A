import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
        
        D3();
        
    }

	   public static void D3() {
	    	
		   Scanner scanner = new Scanner(System.in);
		   
		   
	    	int resposta;
	    	
	    	System.out.println("Para derrotar Egoyis responda, simplifique o radical raiz quadrada de 27 e selecione a opção correta");
	    	System.out.println("1. raiz quadrada de 3");
	    	System.out.println("2. 2 raiz quadrada de 3");
	    	System.out.println("3. 3 raiz quadrada de 3");
	    	System.out.println("4. 3 raiz quadrada de 2");
	    	System.out.println("5. 2 raiz quadrada de 2");
	    	resposta = scanner.nextInt();
	    	
	    	switch (resposta) 
	    	{
	    	
	    	case 1:
	    	case 2:
	    		System.out.println("Deusa Egoyis era mais poderosa do que você pensou. Melhor voltar para o Mefisto para terem uma conversa sobre.");
	    		break;
	    	case 3:
	    		System.out.println("Parabéns, Devon! Conseguiu derrotar um dos maiores deuses. Agora tem 3 dos 6 Poderes Supremos dos Deuses. ");
	    		break;
	    	case 4:
	    	case 5:
	    		System.out.println("Deusa Egoyis era mais poderosa do que você pensou. Melhor voltar para o Mefisto para terem uma conversa sobre.");
	    		break;
	    	
	    	}
	    	
	    }

    public static boolean main(Object args, boolean acertos) {
        return false;
    }

}
