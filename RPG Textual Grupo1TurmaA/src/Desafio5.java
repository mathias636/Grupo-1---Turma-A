import java.util.Scanner;

public class Desafio5 {

	public static void main(String[] args) {
        
        D5();
        
    }
    
    
    
   public static void D5() {
    	
	   Scanner scanner = new Scanner(System.in);
	   
	   
    	int resposta;
    	
    	System.out.println("Resolva o desafio 23x - 16 = 14 - 17x e derrote Krieg de uma vez por todas");
    	System.out.println("1. 4/5");
    	System.out.println("2. 3/4");
    	System.out.println("3. 2/3");
    	System.out.println("4. 1/2");
    	System.out.println("5. 4/3");
    	resposta = scanner.nextInt();
    	
    	switch (resposta) 
    	{
    	
    	case 1:
    		System.out.println("Krieg te pegou de jeito, Devon. Volte para o começo e fale com Mefisto.");
    		break;
    	case 2:
    		System.out.println("Krieg se deu mal mesmo. Muito bem, jogador! Agora tem 5 dos 6 Poderes Supremos dos Deuses. Você está cada vez mais próximo.");
    		break;
    	case 3:
    	case 4:
    	case 5:
    		System.out.println("Krieg te pegou de jeito, Devon. Volte para o começo e fale com Mefisto.");
    		break;
 
    	}
    	
    }
}
