package harry;

import java.util.Random;
import java.util.Scanner;

public class harryPotter {

<<<<<<< HEAD
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Neste inicio de torneio, vocï¿½ descobre que o obejtivo da primeira fase ï¿½ recuperar um ovo\n"
					+ "dourado que estï¿½ sendo guardado por um dragao.\nO ovo seria localizado dentro de uma ninhada de ovos "
					+ "de dragï¿½es reais.");
			System.out.println("Cada um dos partcipantes vai ter que enfrentar um tipo de dragï¿½o para recuperar o ovo.\n");
	
			System.out.println(
					"Agora vamos sortear seu comeï¿½o, pressione qualquer letra e depois pressione Enter para prosseguir:\n");
			String dragon = input.next();
	
			yourDragon(dragon);
	
			System.out.println("Boa, agora vamos para o que interessa...\n\n Agora que vocï¿½ ja descobriu seu dragï¿½o,\n"
					+ "vocï¿½ estï¿½ na arena, seu objetivo ï¿½ pegar o ovo, o dragï¿½o protege ele, seu dragï¿½o cospe fogo vocï¿½ precisa se esconder.\n");
	
			secondStep(dragon);
	
			thirdStep(dragon);
	
			fourthStep(dragon);
	
			fifthStep(dragon);
		}

	public static void yourDragon(String dragon) {
			Random random = new Random();
			int randomNumber = random.nextInt(3);
			System.out.println("O nï¿½mero  " + randomNumber + " foi o nï¿½mero sorteado para vocï¿½ seguir sua histï¿½ria.");
			if (randomNumber == 0) {
				System.out.println("Com isso o dragï¿½o que vocï¿½ vai enfrentar ï¿½ o Verde-Galï¿½s Comum.\n");
				System.out.println(
						"Esta raï¿½a estï¿½ entre as que causam menos problemas (excetuando-se pela rara exceï¿½ï¿½o do Incidente Ilfracombe)\n"
								+ "preferindo, como o Olho-de-Opala, caï¿½ar carneiros e se empenha para evitar os humanos, a nï¿½o ser quando provocado.\n"
								+ "O verde-galï¿½s tem um urro surpreendentemente melodioso que ï¿½ facilmente reconhecï¿½vel.\n"
								+ "Suas labaredas saem em jorros finos e seus ovos sï¿½o cor de terra, sarapintados de verde");
			} else if (randomNumber == 1) {
				System.out.println("Com isso o dragï¿½o que vocï¿½ vai enfrentar ï¿½ o Meteoro-Chinï¿½s.\n");
				System.out.println(
						"O Meteoro-Chinï¿½s ï¿½ de cor escarlate, possui escamas macias e uma franja de pontas douradas em volta do focinho\n"
								+ "e olhos extremamente protuberantes. Pesa entra duas e quatro toneladas.\n"
								+ "ï¿½ chamado de Meteoro por causa das esferas de fogo que solta pelas narinas quando enfurecido, que tomam o formato de cogumelos\n");
			} else if (randomNumber == 2) {
				System.out.println("Com isso o dragï¿½o que vocï¿½ vai enfrentar ï¿½ o Focinho-Curto Sueco.\n");
				System.out
						.println("ï¿½ uma das espï¿½cies mais perigosas, devido ao seu voo ï¿½gil e o fogo extremamente quente.\n"
								+ "O habitat natural dos Focinho-Curto suecos sï¿½o as montanhas gï¿½lidas, um paraï¿½so frio, porï¿½m admirï¿½vel e muito bonito.\n"
								+ "Suas habilidades sï¿½o voar, expelir chamas, couraï¿½a resistente a ï¿½cidos e queimaduras graves.");
			} else if (randomNumber == 3) {
				System.out.println("Com isso o dragï¿½o que vocï¿½ vai enfrentar ï¿½ o Rabo-Cï¿½rneo Hï¿½ngaro.\n");
				System.out.println(
						"Tem escamas negras, e aparï¿½ncia de lagarto. Ele tambï¿½m tem olhos amarelos, com pupilas verticais como as de um gato,\n"
								+ "chifres de bronze e picos coloridas semelhantes que se projetam a partir da sua longa cauda que ele usa em combate.\n"
								+ "O rugido do dragï¿½o ï¿½ um grito estridente, e sua chama pode chegar a cerca de 15 metros.\n");
			}
=======
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
>>>>>>> 89ac85be0fdeee2a854025a1b8da952f877b07c1
	}

	public static void secondStep(String second) {
		Scanner input = new Scanner(System.in);

		String correctAnswer;
		int i = 1;

		do {
			System.out.println(
					"vocï¿½ pode :\n Esconder-Se esconder nas pedras.\n Corredor-Correr no corredor.\n Ficar-Ficar pulando em cima das pedras.\n Correr-Correr atï¿½ o ovo.\n ");

			System.out.println(
					"Digite apenas a primeira palavra de acordo com seu prï¿½ximo passo para conseguir realizar mais um desafio:");
			correctAnswer = input.next();

			System.out.println("\n");

			switch (correctAnswer.toUpperCase()) {
			case "ESCONDER":
				System.out.println("Vocï¿½ se escondeu nas pedras, vocï¿½ esta seguro agora.\n\n\n");
				break;
			case "CORREDOR":
			case "FICAR":
			case "CORRER":
				System.out.println("Essa escolha farï¿½ com que o dragï¿½o te pegue.\n");
				i++;

			}
		} while (i <= 3 && !(correctAnswer.equalsIgnoreCase("ESCONDER")));
		{

			if (i > 3) {
				System.out.println("Vocï¿½ perdeu todas as suas vidas. FIM DE JOGO.");
				System.exit(i);
			}
		}
	}

	public static void thirdStep(String third) {
		Scanner input = new Scanner(System.in);
		String step;
		int i = 1;
		System.out.println(
				"BOAAAAAAAAA, vocï¿½ ï¿½ fera....Vocï¿½ se escondeu nas pedras, o dragï¿½o estï¿½ cuspindo fogo na pedra em que voce estï¿½.\n"
						+ "A pedra estï¿½ esquentando vocï¿½ precisa tomar uma decisï¿½o.\n\n");
		do {
			System.out.println(
					"Ficar-Ficar na pedra, pois ela nï¿½o esquentarï¿½ muito.\nCorrer-Correr para outra pedra.\nDireï¿½ï¿½o-Ir em direï¿½ï¿½o ao ovo.\nVassoura-Chamar uma vassoura para voar.\n");

			System.out.println(
					"Digite apenas a primeira palavra de acordo com seu prï¿½ximo passo para conseguir realizar mais um desafio:\n");
			step = input.next();
			System.out.println("\n");

			switch (step.toUpperCase()) {
			case "VASSOURA":
				System.out.println("Isso ai, sua vassoura esta a caminho, suba nela e vï¿½ adiante.\n\n\n");
				break;
			case "FICAR":
			case "CORRER":
			case "DIREï¿½ï¿½O":
				System.out.println("Essa escolha farï¿½ com que o dragï¿½o de pegue, tente novamente.");
				i++;
			}
<<<<<<< HEAD
		} while (i <= 3 && !(step.equalsIgnoreCase("VASSOURA")));{
		if (i > 3) {
			System.out.println("Vocï¿½ perdeu todas as suas vidas. FIM DE JOGO.");
			System.exit(i);
=======
		} while (i <= 3 && !(step.equalsIgnoreCase("VASSOURA")));
		{
			if (i > 3) {
				System.out.println("Você perdeu todas as suas vidas. FIM DE JOGO.");
				System.exit(i);
			}
>>>>>>> 89ac85be0fdeee2a854025a1b8da952f877b07c1
		}
	}

	public static void fourthStep(String fourth) {
		Scanner input = new Scanner(System.in);
		String pass;
		int i = 1;
		System.out.println(
				"Mais uma vez vocï¿½ pegou as dicas certas, continue..Vocï¿½ acaba de subir em sua vassoura mï¿½gica e agora tem que matar o dragï¿½o.\n"
						+ "Vocï¿½ comeï¿½a a fazer com que ele te siga,"
						+ "mas acaba caindo de cima da vassoura e sua vassoura ficar presa em um telhado um pouco afastado de vocï¿½,Vocï¿½ pode:\n");
		do {
			System.out.println(
					"Esconder-Se esconder atï¿½ o dragï¿½o ir embora\nfeitiï¿½o-Fazer um feitiï¿½o para a vassoura voltar para vocï¿½.\nDeslizar-Deslizar e pegar a vassoura.\nDeixar-Deixar a vassoura lï¿½.");

			System.out.println(
					"Digite apenas a primeira palavra de acordo com seu prï¿½ximo passo para conseguir realizar mais um desafio:\n");
			pass = input.next();

			System.out.println("\n");

			switch (pass.toUpperCase()) {
			case "DESLIZAR":
				System.out.println("Deslizou e pegou, agora vocï¿½ consegue seguir.\n\n\n");
				break;
			case "ESCONDER":
			case "FEITIï¿½O":
			case "DEIXAR":
				System.out.println("Essa escolha farï¿½ com que o dragï¿½o de pegue, tente novamente.");
				i++;
			}
<<<<<<< HEAD
		} while (i <= 3 && !(pass.equalsIgnoreCase("DESLIZAR")));{
		if (i > 3) {
			System.out.println("Vocï¿½ perdeu todas as suas vidas. FIM DE JOGO.");
			System.exit(i);
=======
		} while (i <= 3 && !(pass.equalsIgnoreCase("DESLIZAR")));
		{
			if (i > 3) {
				System.out.println("Você perdeu todas as suas vidas. FIM DE JOGO.");
				System.exit(i);
			}
>>>>>>> 89ac85be0fdeee2a854025a1b8da952f877b07c1
		}
	}

	public static void fifthStep(String fifth) {
		Scanner input = new Scanner(System.in);
		String continues;
		int i = 1;
		System.out.println(
				"Continue desse jeito, vocï¿½ nï¿½o perde dica alguma...\nVocï¿½ acaba de pegar sua vassoura e comeï¿½a a voar para se livrar novamente do dragï¿½o, vocï¿½ comeï¿½a a procurar saï¿½das em sua volta.\n\n"
						+ "No Leste vocï¿½ vï¿½ uma ponte com um espaï¿½o estreito para passar e o dragï¿½o nï¿½o consegue passar ali se nï¿½o vai bater e morrer.\n"
						+ "No oeste vocï¿½ olha e vï¿½ muita neblina, nï¿½o sabe se ï¿½ um caminho.\n "
						+ "Se olhar para o  norte vocï¿½ sï¿½ consegue ir reto e nï¿½o sabe onde vai parar.\n"
						+ "Se olhar para sul vai voltar para os castelos onde acabou de recuperar a vassoura.\n");
		do {
			System.out.println("Saidas: Norte, Sul, leste e oeste.");

			System.out.println(
					"Digite uma saida de acordo com seu prï¿½ximo passo para conseguir realizar mais um desafio:\n");
			continues = input.next();

			System.out.println("\n");

			switch (continues.toUpperCase()) {
			case "LESTE":
				System.out.println(
						"Nessa vocï¿½ foi maldoso em hahaha, porï¿½m era a coisa certa a se fazer, siga em frente.\n\n\n");
				break;
			case "SUL":
			case "NORTE":
			case "OESTE":
				System.out.println("Essa escolha farï¿½ com que o dragï¿½o de pegue, tente novamente.");
				i++;
			}
		} while (i <= 3 && !(continues.equalsIgnoreCase("LESTE")));
		{

			if (i > 3) {
				System.out.println("Vocï¿½ perdeu todas as suas vidas. FIM DE JOGO.");
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
