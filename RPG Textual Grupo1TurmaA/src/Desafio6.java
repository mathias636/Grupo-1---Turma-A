import java.util.Scanner;

public class Desafio6 {

	public static void main(String[] args) {

		D6();

	}

	public static void D6() {

		Scanner scanner = new Scanner(System.in);

		int resposta;

		System.out.println("Para esse último desafio, responda, 10y - 5(1 + y) = 3(2y - 2) - 20.");
		System.out.println("1. 20");
		System.out.println("2. 18");
		System.out.println("3. 19");
		System.out.println("4. 21");
		System.out.println("5. 16");
		resposta = scanner.nextInt();

		switch (resposta) {

		case 1:
		case 2:
		case 3:
			System.out.println(
					"Resposta errada: Shi te enganou e você foi pego pela escuridão dela. Volte e fale com Mefisto.");
			break;
		case 4:
			System.out.println(
					"Devon, VOCÊ CONSEGUIU!! CONQUISTOU TODOS OS 6 PODERES SUPREMOS DOS DEUSES.Agora cumpra seu destino.");
			break;
		case 5:
			System.out.println(
					"Resposta errada: Shi te enganou e você foi pego pela escuridão dela. Volte e fale com Mefisto.");
			break;

		}

	}

}
