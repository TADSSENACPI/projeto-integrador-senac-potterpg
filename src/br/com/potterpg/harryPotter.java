package br.com.potterpg;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class harryPotter {

	static class OpcoesException extends Exception {

		public OpcoesException(String msg) {
			super(msg);
		}

	}

	static class faseModelo {

	}

	static class faseUm extends faseModelo {

		void introducao() {
			System.out.println(
					"Neste inicio de torneio, você descobre que o obejtivo da primeira fase é recuperar um ovo\n"
							+ "dourado que está sendo guardado por um dragão.\nO ovo seria localizado dentro de uma ninhada de ovos "
							+ "de dragões reais.");
			System.out.println(
					"Cada um dos partcipantes vai ter que enfrentar um tipo de dragão para recuperar o ovo.\n");

			System.out.println(
					"Agora vamos sortear seu começo, pressione qualquer letra e depois pressione Enter para prosseguir:\n");
			Scanner input = new Scanner(System.in);

			String sort = input.next();
		}

		int escolhaDragao() {

			Random random = new Random();
			int randomNumber = random.nextInt(3);
			String nomeDragao = null;

			if (randomNumber == 0) {

				nomeDragao = "Verde-Galês Comum";
			} else if (randomNumber == 1) {

				nomeDragao = "Meteoro-Chinês";
			} else if (randomNumber == 2) {

				nomeDragao = "Focinho-Curto Sueco";
			} else if (randomNumber == 3) {

				nomeDragao = "Rabo-Córneo Húngaro";
			}
			System.out.println("Com isso o dragão que você vai enfrentar é o " + nomeDragao + ".\n");

			return randomNumber;

		}

		void historiaDragao() {
			String[] historiaDragao = new String[4];
			historiaDragao[0] = "Esta raça está entre as que causam menos problemas (excetuando-se pela rara exceção do Incidente Ilfracombe)\n"
					+ "preferindo, como o Olho-de-Opala, caçar carneiros e se empenha para evitar os humanos, a não ser quando provocado.\n"
					+ "O verde-galês tem um urro surpreendentemente melodioso que é facilmente reconhecível.\n"
					+ "Suas labaredas saem em jorros finos e seus ovos são cor de terra, sarapintados de verde";

			historiaDragao[1] = "O Meteoro-Chinês é de cor escarlate, possui escamas macias e uma franja de pontas douradas em volta do focinho\n"
					+ "e olhos extremamente protuberantes. Pesa entra duas e quatro toneladas.\n"
					+ "É chamado de Meteoro por causa das esferas de fogo que solta pelas narinas quando enfurecido, que tomam o formato de cogumelos\n";

			historiaDragao[2] = "É uma das espécies mais perigosas, devido ao seu voo ágil e o fogo extremamente quente.\n"
					+ "O habitat natural dos Focinho-Curto suecos são as montanhas gélidas, um paraíso frio, porém admirável e muito bonito.\n"
					+ "Suas habilidades são voar, expelir chamas, couraça resistente a ácidos e queimaduras graves.";

			historiaDragao[3] = "\"Tem escamas negras, e aparência de lagarto. Ele também tem olhos amarelos, com pupilas verticais como as de um gato,\\n\"\r\n"
					+ "							+ \"chifres de bronze e picos coloridas semelhantes que se projetam a partir da sua longa cauda que ele usa em combate.\\n\"\r\n"
					+ "							+ \"O rugido do dragão é um grito estridente, e sua chama pode chegar a cerca de 15 metros.\\n\"";

			System.out.println(historiaDragao[escolhaDragao()]);

		}

		public static void secondStep(String second) {
			Scanner input = new Scanner(System.in);

			String correctAnswer;
			int i = 1;

			do {
				System.out.println(
						"você pode :\n Esconder-Se esconder nas pedras.\n Corredor-Correr no corredor.\n Ficar-Ficar pulando em cima das pedras.\n Correr-Correr até o ovo.\n ");

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
			do {
				System.out.println(
						"Ficar-Ficar na pedra, pois ela não esquentará muito.\nCorrer-Correr para outra pedra.\nDireção-Ir em direção ao ovo.\nVassoura-Chamar uma vassoura para voar.\n");

				System.out.println(
						"Digite apenas a primeira palavra de acordo com seu próximo passo para conseguir realizar mais um desafio:\n");
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
			do {
				System.out.println(
						"Esconder-Se esconder até o dragão ir embora\nfeitiço-Fazer um feitiço para a vassoura voltar para você.\nDeslizar-Deslizar e pegar a vassoura.\nDeixar-Deixar a vassoura lá.");

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
							+ "No oeste você olha e vê muita neblina, não sabe se é um caminho.\n "
							+ "Se olhar para o  norte você só consegue ir reto e não sabe onde vai parar.\n"
							+ "Se olhar para sul vai voltar para os castelos onde acabou de recuperar a vassoura.\n");
			do {
				System.out.println("Saidas: Norte, Sul, leste e oeste.");

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

	static class faseDois extends faseModelo {

	}

	static class faseTres extends faseModelo {

	}

	static class faseBonus extends faseModelo {

	}

	static class utilitarios {

		boolean validaRespostas() {
			return false;
		}

		static void validaOpcoesMenu(String opcao) throws OpcoesException {

			Set<String> opcoesSet = new HashSet<String>();
			opcoesSet.add("1");
			opcoesSet.add("2");
			opcoesSet.add("3");
			opcoesSet.add("4");

			opcao = opcao.trim();

			if (opcao.equals("1")) {

				// Chamar metodo responsavel

			}
			if (opcao.equals("2")) {

				// Chamar metodo responsavel

			}
			if (opcao.equals("3")) {

				// Chamar metodo responsavel

			}
			if (opcao.equals("4")) {

				System.out.println("\n\nFIM!");
				System.exit(0);
			}
			if (!opcoesSet.contains(opcao)) {

				throw new OpcoesException("Opção invalida!");
			}

		}

		String showMenu() {

			Scanner scn = new Scanner(System.in);
			System.err.println(
					"********************************\n************* MENU *************\n********************************");
			System.out.println("");
			System.out.println("1 - INSTRUÇÕES\n2 - JOGAR\n3 - RANKING\n4 - EXIT");
			System.out.print("R = ");

			return scn.next();
		}

	}

	public static void main(String[] args) {

		faseUm faseUm = new faseUm();
		String dragon = null;

		faseUm.introducao();
		faseUm.historiaDragao();
//		faseUm.secondStep(dragon);
//		faseUm.thirdStep(dragon);
//		faseUm.fourthStep(dragon);
//		faseUm.fifthStep(dragon);
	}

}
