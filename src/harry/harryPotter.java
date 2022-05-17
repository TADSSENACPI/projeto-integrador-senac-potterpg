package harry;

import java.util.Random;

import java.util.Scanner;

public class harryPotter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Neste inicio de torneio, você descobre que o obejtivo da primeira fase é recuperar um ovo\n"
				+ "dourado que está sendo guardado por um dragão.\nO ovo seria localizado dentro de uma ninhada de ovos "
				+ "de dragões reais.");
		System.out.println("Cada um dos partcipantes vai ter que enfrentar um tipo de dragão para recuperar o ovo.\n");

		System.out.println(
				"Agora vamos sortear seu começo, pressione qualquer letra e depois pressione Enter para prosseguir:\n");
		String dragon = input.next();

		yourDragon(dragon);

		secondStep(dragon);

		thirdStep(dragon);

		fourthStep(dragon);

		fifthStep(dragon);
	}

	public static void yourDragon(String dragon) {
		int dragons[] = { 0, 1, 2, 3 };
		int sorteioDragao = new Random().nextInt(4);
		System.out.println("O número  " + sorteioDragao + " foi o número sorteado para você seguir sua história.");
		if (sorteioDragao == 0) {
			System.out.println("Com isso o dragão que você vai enfrentar é o Verde-Galês Comum.\n");
			System.out.println(
					"Esta raça está entre as que causam menos problemas (excetuando-se pela rara exceção do Incidente Ilfracombe)\n"
							+ "preferindo, como o Olho-de-Opala, caçar carneiros e se empenha para evitar os humanos, a não ser quando provocado.\n"
							+ "O verde-galês tem um urro surpreendentemente melodioso que é facilmente reconhecível.\n"
							+ "Suas labaredas saem em jorros finos e seus ovos são cor de terra, sarapintados de verde");
		} else if (sorteioDragao == 1) {
			System.out.println("Com isso o dragão que você vai enfrentar é o Meteoro-Chinês.\n");
			System.out.println(
					"O Meteoro-Chinês é de cor escarlate, possui escamas macias e uma franja de pontas douradas em volta do focinho\n"
							+ "e olhos extremamente protuberantes. Pesa entra duas e quatro toneladas.\n"
							+ "É chamado de Meteoro por causa das esferas de fogo que solta pelas narinas quando enfurecido, que tomam o formato de cogumelos\n");
		} else if (sorteioDragao == 2) {
			System.out.println("Com isso o dragão que você vai enfrentar é o Focinho-Curto Sueco.\n");
			System.out
					.println("É uma das espécies mais perigosas, devido ao seu voo ágil e o fogo extremamente quente.\n"
							+ "O habitat natural dos Focinho-Curto suecos são as montanhas gélidas, um paraíso frio, porém admirável e muito bonito.\n"
							+ "Suas habilidades são voar, expelir chamas, couraça resistente a ácidos e queimaduras graves.\n");
		} else if (sorteioDragao == 3) {
			System.out.println("Com isso o dragão que você vai enfrentar é o Rabo-Córneo Húngaro.\n");
			System.out.println(
					"Tem escamas negras, e aparência de lagarto. Ele também tem olhos amarelos, com pupilas verticais como as de um gato,\n"
							+ "chifres de bronze e picos coloridas semelhantes que se projetam a partir da sua longa cauda que ele usa em combate.\n"
							+ "O rugido do dragão é um grito estridente, e sua chama pode chegar a cerca de 15 metros.\n");
		}
	}

	public static void secondStep(String second) {
		Scanner input = new Scanner(System.in);

		System.out.println("Boa, agora vamos para o que interessa...\n\nAgora que você ja descobriu seu dragão,\n"
				+ "você está na arena, seu objetivo é pegar o ovo, o dragão protege ele, seu dragão cospe fogo você precisa se esconder.\n");

		String correctAnswer;
		int i = 1;

		int alternativas = 4;
		String resposta[] = new String[alternativas];
		resposta[0] = "Esconder-Se esconder nas pedras.\n";
		resposta[1] = "Corredor-Correr no corredor.\n";
		resposta[2] = "Ficar-Ficar pulando em cima das pedras.\n";
		resposta[3] = "Correr-Correr até o ovo.\n";

		do {

			System.out.println(resposta[0] + resposta[1] + resposta[2] + resposta[3]);
			System.out.println("\n");
			System.out.println(
					"Digite apenas a primeira palavra de acordo com seu próximo passo para conseguir realizar mais um desafio:");
			correctAnswer = input.next();

			System.out.println("\n");

			switch (correctAnswer.toUpperCase()) {
			case "ESCONDER":
				System.out.println("Você se escondeu nas pedras, você esta seguro agora.\n\n\n");
				break;
			case "CORREDOR":
			case "FICAR":
			case "CORRER":
				System.out.println("Essa escolha fará com que o dragão te pegue.\n");
				i++;

			}
		} while (i <= 3 && !(correctAnswer.equalsIgnoreCase("ESCONDER")));
		{

			if (i > 3) {
				System.out.println("Você perdeu todas as suas vidas. FIM DE JOGO.");
				System.exit(i);
			}
		}
	}

	public static void thirdStep(String third) {
		Scanner input = new Scanner(System.in);
		String step;
		int i = 1;
		System.out.println(
				"BOAAAAAAAAA, você é fera....Você se escondeu nas pedras, o dragão está cuspindo fogo na pedra em que voce está.\n"
						+ "A pedra está esquentando você precisa tomar uma decisão.\n\n");
		int alternativas = 4;
		String resposta[] = new String[alternativas];
		resposta[0] = "Ficar-Ficar na pedra, pois ela não esquentará muito.\n";
		resposta[1] = "Correr-Correr para outra pedra.\n";
		resposta[2] = "Direção-Ir em direção ao ovo.\n";
		resposta[3] = "Vassoura-Chamar uma vassoura para voar.\n";
		do {
			System.out.println(resposta[0] + resposta[1] + resposta[2] + resposta[3]);
			System.out.println("\n");
			System.out.println(
					"Digite apenas a primeira palavra de acordo com seu próximo passo para conseguir realizar mais um desafio:");

			step = input.next();
			System.out.println("\n");

			switch (step.toUpperCase()) {
			case "VASSOURA":
				System.out.println("Isso ai, sua vassoura esta a caminho, suba nela e vá adiante.\n\n\n");
				break;
			case "FICAR":
			case "CORRER":
			case "DIREÇÃO":
				System.out.println("Essa escolha fará com que o dragão de pegue, tente novamente.");
				i++;
			}
		} while (i <= 3 && !(step.equalsIgnoreCase("VASSOURA")));
		{
			if (i > 3) {
				System.out.println("Você perdeu todas as suas vidas. FIM DE JOGO.");
				System.exit(i);
			}
		}
	}

	public static void fourthStep(String fourth) {
		Scanner input = new Scanner(System.in);
		String pass;
		int i = 1;
		System.out.println(
				"Mais uma vez você pegou as dicas certas, continue..Você acaba de subir em sua vassoura mágica e agora tem que matar o dragão.\n"
						+ "Você começa a fazer com que ele te siga,"
						+ "mas acaba caindo de cima da vassoura e sua vassoura ficar presa em um telhado um pouco afastado de você,Você pode:\n");
		int alternativas = 4;
		String resposta[] = new String[alternativas];
		resposta[0] = "Esconder-Se esconder até o dragão ir embora\n";
		resposta[1] = "feitiço-Fazer um feitiço para a vassoura voltar para você.\n";
		resposta[2] = "Deslizar-Deslizar e pegar a vassoura.\n";
		resposta[3] = "Deixar-Deixar a vassoura lá.\n";
		do {
			System.out.println(resposta[0] + resposta[1] + resposta[2] + resposta[3]);
			System.out.println("\n");
			System.out.println(
					"Digite apenas a primeira palavra de acordo com seu próximo passo para conseguir realizar mais um desafio:\n");
			pass = input.next();

			System.out.println("\n");

			switch (pass.toUpperCase()) {
			case "DESLIZAR":
				System.out.println("Deslizou e pegou, agora você consegue seguir.\n\n\n");
				break;
			case "ESCONDER":
			case "FEITIÇO":
			case "DEIXAR":
				System.out.println("Essa escolha fará com que o dragão de pegue, tente novamente.");
				i++;
			}
		} while (i <= 3 && !(pass.equalsIgnoreCase("DESLIZAR")));
		{
			if (i > 3) {
				System.out.println("Você perdeu todas as suas vidas. FIM DE JOGO.");
				System.exit(i);
			}
		}
	}

	public static void fifthStep(String fifth) {
		Scanner input = new Scanner(System.in);
		String continues;
		int i = 1;
		System.out.println(
				"Continue desse jeito, você não perde dica alguma...\nVocê acaba de pegar sua vassoura e começa a voar para se livrar novamente do dragão, você começa a procurar saídas em sua volta.\n\n"
						+ "No Leste você vê uma ponte com um espaço estreito para passar e o dragão não consegue passar ali se não vai bater e morrer.\n"
						+ "No oeste você olha e vê muita neblina, não sabe se é um caminho.\n"
						+ "Se olhar para o  norte você só consegue ir reto e não sabe onde vai parar.\n"
						+ "Se olhar para sul vai voltar para os castelos onde acabou de recuperar a vassoura.\n");

		int alternativas = 4;
		String resposta[] = new String[alternativas];
		resposta[0] = "Norte.\n";
		resposta[1] = "Sul.\n";
		resposta[2] = "Leste.\n";
		resposta[3] = "Oeste.\n";
		do {
			System.out.println(resposta[0] + resposta[1] + resposta[2] + resposta[3]);
			System.out.println("\n");
			System.out.println(
					"Digite uma saida de acordo com seu próximo passo para conseguir realizar mais um desafio:\n");
			continues = input.next();

			System.out.println("\n");

			switch (continues.toUpperCase()) {
			case "LESTE":
				System.out.println(
						"Nessa você foi maldoso em hahaha, porém era a coisa certa a se fazer, siga em frente.\n\n\n");
				break;
			case "SUL":
			case "NORTE":
			case "OESTE":
				System.out.println("Essa escolha fará com que o dragão de pegue, tente novamente.");
				i++;
			}
		} while (i <= 3 && !(continues.equalsIgnoreCase("LESTE")));
		{

			if (i > 3) {
				System.out.println("Você perdeu todas as suas vidas. FIM DE JOGO.");
				System.exit(i);
			}
		}

	}
}
