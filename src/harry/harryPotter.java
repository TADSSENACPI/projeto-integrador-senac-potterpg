package harry;

import java.util.Random;
import java.util.Scanner;

public class harryPotter {

	public static void main(String[] args) {

		faseUm();
		faseDois();

	}

	static void faseUm() {

		Scanner input = new Scanner(System.in);
		System.out.println("Neste inicio de torneio, você descobre que o obejtivo da primeira fase é recuperar um ovo\n"
				+ "dourado que está sendo guardado por um dragão.\nO ovo seria localizado dentro de uma ninhada de ovos "
				+ "de dragões reais.");
		System.out.println("Cada um dos partcipantes vai ter que enfrentar um tipo de dragão para recuperar o ovo.\n");

		System.out.println(
				"Agora vamos sortear seu começo, pressione qualquer letra e depois pressione Enter para prosseguir:\n");
		String dragon = input.next();

		yourDragon(dragon);

		System.out.println("Boa, agora vamos para o que interessa...\n\n Agora que você ja descobriu seu dragão,\n"
				+ "você está na arena, seu objetivo é pegar o ovo, o dragão protege ele, seu dragão cospe fogo você precisa se esconder.\n");

		secondStep(dragon);

		thirdStep(dragon);

		fourthStep(dragon);

		fifthStep(dragon);

	}

	static void faseDois() {

		primeiraPergunta();
		segundaPergunta();
		terceiraPergunta();
		quartaPergunta();
	}

	public static void yourDragon(String dragon) {
		Random random = new Random();
		int randomNumber = random.nextInt(3);
		System.out.println("O número  " + randomNumber + " foi o número sorteado para você seguir sua história.");
		if (randomNumber == 0) {
			System.out.println("Com isso o dragão que você vai enfrentar é o Verde-Galês Comum.\n");
			System.out.println(
					"Esta raça está entre as que causam menos problemas (excetuando-se pela rara exceção do Incidente Ilfracombe)\n"
							+ "preferindo, como o Olho-de-Opala, caçar carneiros e se empenha para evitar os humanos, a não ser quando provocado.\n"
							+ "O verde-galês tem um urro surpreendentemente melodioso que é facilmente reconhecível.\n"
							+ "Suas labaredas saem em jorros finos e seus ovos são cor de terra, sarapintados de verde");
		} else if (randomNumber == 1) {
			System.out.println("Com isso o dragão que você vai enfrentar é o Meteoro-Chinês.\n");
			System.out.println(
					"O Meteoro-Chinês é de cor escarlate, possui escamas macias e uma franja de pontas douradas em volta do focinho\n"
							+ "e olhos extremamente protuberantes. Pesa entra duas e quatro toneladas.\n"
							+ "É chamado de Meteoro por causa das esferas de fogo que solta pelas narinas quando enfurecido, que tomam o formato de cogumelos\n");
		} else if (randomNumber == 2) {
			System.out.println("Com isso o dragão que você vai enfrentar é o Focinho-Curto Sueco.\n");
			System.out
					.println("É uma das espécies mais perigosas, devido ao seu voo ágil e o fogo extremamente quente.\n"
							+ "O habitat natural dos Focinho-Curto suecos são as montanhas gélidas, um paraíso frio, porém admirável e muito bonito.\n"
							+ "Suas habilidades são voar, expelir chamas, couraça resistente a ácidos e queimaduras graves.");
		} else if (randomNumber == 3) {
			System.out.println("Com isso o dragão que você vai enfrentar é o Rabo-Córneo Húngaro.\n");
			System.out.println(
					"Tem escamas negras, e aparência de lagarto. Ele também tem olhos amarelos, com pupilas verticais como as de um gato,\n"
							+ "chifres de bronze e picos coloridas semelhantes que se projetam a partir da sua longa cauda que ele usa em combate.\n"
							+ "O rugido do dragão é um grito estridente, e sua chama pode chegar a cerca de 15 metros.\n");
		}
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

	public static void primeiraPergunta() {
		System.out.println("Bem vindo a etapa 3!" + "\n"
				+ "Parabens voce chegou atÃ© aqui, ao passar do lago, voce agora tem um novo desafio! para ser o campeÃ£o"
				+ " tribuxo voce precisa passar pelo labirinto e pegar o calice." + "\n"
				+ "Todos os participantes incluindo voce entram no labirinto e comeÃ§am a tentar encontrar o caminho certo."
				+ "\n");
		String alternativa;
		do {
			System.out.println(
					"VocÃª estÃ¡ no meio do labirinto, derrepente houve um barulho de gritos, vocÃª corre para "
							+ "ver o que aconteceu, vocÃª vÃª uma competidora desmaiada. " + "\n"
							+ "Por causa de victor crum outro adversÃ¡rio, ela estÃ¡ sendo sugada pelo labirinto vocÃª pode :"
							+ "\n" + "\n" + "A) Tenta soltar com as maos impedir que ela seja sugada." + "\n"
							+ "B) Joga um feitiÃ§o na parede \n"
							+ "C) Jogar um feitiÃ§o de localizaÃ§Ã£o para os professores dela virem.\n"
							+ "D) NÃ£o faz nada. Deixa ela lÃ¡.\n" + "E) Gritar pedindo ajuda pÃ¡ra outro competidor.");

			Scanner scanner = new Scanner(System.in);
			alternativa = scanner.next();

			int vida = 0;
			if (alternativa.equalsIgnoreCase("a")) {

				System.out.println(" Com essa tentativa voce foi sugado tambÃ©m,  ");

				vida--;
			} else if (alternativa.equalsIgnoreCase("B")) {
				System.out.println("o feitiÃ§o foi inutil, ela morreu");

				vida--;
			} else if (alternativa.equals("C")) {

				System.out.println("muito bom por sua atitude ela foi salva e voce pode proseguir com seu teste");

			} else if (alternativa.equalsIgnoreCase("D")) {

				System.out.println("por essa atitude ela morreu e vocÃª foi desclassificado");
				vida--;
			} else if (alternativa.equalsIgnoreCase("E")) {

				System.out.println("ninguÃ©m veio te ajudar e a mulher morreu");
				vida--;
			} else {

				System.out.println("Digite um numero valido");
			}

		} while (!alternativa.equalsIgnoreCase("C"));

	}

	public static void segundaPergunta() {

		String alternativa;
		do {

			System.out.println(
					"Ao jogar o feitiÃ§o de localizaÃ§Ã£o  o labirinto comeÃ§a a fechar  vocÃª comeÃ§a a correr." + "\n"
							+ " VocÃª percebe que tem dois competidores brigando com suas varinhas, um dele estÃ¡ enfeitiÃ§ado,"
							+ "cedrico ganha dele , \n entretando depois de ter derrotado ele, cedrigo quer matar ele pelo o que fez com a outra"
							+ " competidora, agora vocÃª\n" + "\n"
							+ "A) Deixa cedrico matar ele afinal quase matou a outra competidora." + "\n"
							+ "B) Mata cedrico impedindo ele." + "\n"
							+ "C) Segura ele explicando que ele apenas estÃ¡ enfeitiÃ§ado." + "\n"
							+ "D) Joga um feitiÃ§o contra cedrico deixando ele desmaiado. ");

			Scanner scanner = new Scanner(System.in);
			alternativa = scanner.next();

			int vida = 0;
			if (alternativa.equalsIgnoreCase("a")) {

				System.out.println("vocÃªs dois foram desclassificados por matar");

				vida--;
			} else if (alternativa.equalsIgnoreCase("B")) {

				System.out.println("vocÃª foi  desclassificados por matar");

				vida--;
			} else if (alternativa.equalsIgnoreCase("C")) {

				System.out.println("muito bem agora voces podem prosseguir.");

			} else if (alternativa.equalsIgnoreCase("D")) {

				System.out.println("vocÃª precisava do cedrico para continuar");

				vida--;
			} else {
				System.out.println("digite um valor valido");
			}

		} while (!alternativa.equalsIgnoreCase("C"));

	}

	public static void terceiraPergunta() {

		String alternativa;
		do {

			System.out.println("Depois de convencer cedrico eles deixam o outro competidor ali,"
					+ " em seguida comeÃ§am a correr atÃ© o fim do labirinto, \n"
					+ "VocÃªs vÃªem o cÃ¡lice de longe e comeÃ§am a disputar entre si correndo,"
					+ " atÃ© que cedrico Ã© pego pelos galhos do labirinto estÃ¡ prestes a morrer, \n"
					+ "mas o cÃ¡lice estÃ¡ logo alÃ­. VocÃª : \n" + "\n"
					+ "A) Deixa cedrico e vai atÃ© o cÃ¡lice para ganhar o jogo." + "\n"
					+ "B) Da um sinal de localizaÃ§Ã£o e vai atÃ© o cÃ¡lice." + "\n"
					+ "C) Joga um feitiÃ§o em cedrico para que ele para de gritar." + "\n"
					+ "D) Salva cedrico com um feitiÃ§o nas plantas, tirando ele de lÃ¡" + "\n"
					+ "E) Se oferece como distraÃ§Ã£o para que ele escape.");

			Scanner scanner = new Scanner(System.in);
			alternativa = scanner.next();

			int vida = 0;
			if (alternativa.equalsIgnoreCase("a")) {

				System.out.println("por sua causa cetrico morreu voce precisava dele");

				vida--;
			} else if (alternativa.equalsIgnoreCase("B")) {

				System.out.println("nesse caso o labirinto estava muito mais agressivo e cetrico morreu, "
						+ "voce precisava dele");

				vida--;
			} else if (alternativa.equalsIgnoreCase("C")) {

				System.out.println("por sua causa cetrico morreu voce precisava dele");

			} else if (alternativa.equalsIgnoreCase("D")) {

				System.out.println("muito bem, sempre se salva um amigo");

				vida--;
			} else if (alternativa.equalsIgnoreCase("E")) {

				System.out.println("Cetrico conseguiu escapar mas voce morreu.");

				vida--;
			} else {
				System.out.println("digite um valor valido");
			}

		} while (!alternativa.equalsIgnoreCase("D"));

	}

	public static void quartaPergunta() {

		String alternativa;
		do {

			System.out.println("Ao vocÃª salvar cedrico o labirinto todo comeÃ§a a"
					+ " fechar vocÃªs comeÃ§am a correr de novo, ao chegar perto " + "do cÃ¡lice voce decide " + "\n"
					+ "\n" + "A) Deixar que vocÃª pegue afinal salvou cedrico ." + "\n" + "B) Dar o cÃ¡lice a ele "
					+ "\n" + "C) Decidem que vÃ£o ir juntos pegar o cÃ¡lice. " + "\n"
					+ "D) NÃ£o pegar nenhum dos dois. +" + "\n"
					+ "E) Lutar contra cedrico para ver quem merece o cÃ¡lice");

			Scanner scanner = new Scanner(System.in);
			alternativa = scanner.next();

			int vida = 0;
			if (alternativa.equalsIgnoreCase("a")) {

				System.out.println("Voce precisava do cedrico para prosseguir");

				vida--;
			} else if (alternativa.equalsIgnoreCase("B")) {

				System.out.println("o cedrico nÃ£o poderia ter ganhado sozinho...");

				vida--;
			} else if (alternativa.equalsIgnoreCase("C")) {

				System.out.println("muito bem voces ganharam juntos! ");

			} else if (alternativa.equalsIgnoreCase("D")) {

				System.out.println("o labirinto se fechou e vocÃªs dois morreram");

				vida--;
			} else if (alternativa.equalsIgnoreCase("E")) {

				System.out.println("VocÃªs dois acabam morrendo pelo labirinto que fechou");

				vida--;
			} else {
				System.out.println("digite um valor valido");
			}

		} while (!alternativa.equalsIgnoreCase("c"));

	}

}
