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
		System.out.println("Neste inicio de torneio, voc� descobre que o obejtivo da primeira fase � recuperar um ovo\n"
				+ "dourado que est� sendo guardado por um drag�o.\nO ovo seria localizado dentro de uma ninhada de ovos "
				+ "de drag�es reais.");
		System.out.println("Cada um dos partcipantes vai ter que enfrentar um tipo de drag�o para recuperar o ovo.\n");

		System.out.println(
				"Agora vamos sortear seu come�o, pressione qualquer letra e depois pressione Enter para prosseguir:\n");
		String dragon = input.next();

		yourDragon(dragon);

		System.out.println("Boa, agora vamos para o que interessa...\n\n Agora que voc� ja descobriu seu drag�o,\n"
				+ "voc� est� na arena, seu objetivo � pegar o ovo, o drag�o protege ele, seu drag�o cospe fogo voc� precisa se esconder.\n");

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
		System.out.println("O n�mero  " + randomNumber + " foi o n�mero sorteado para voc� seguir sua hist�ria.");
		if (randomNumber == 0) {
			System.out.println("Com isso o drag�o que voc� vai enfrentar � o Verde-Gal�s Comum.\n");
			System.out.println(
					"Esta ra�a est� entre as que causam menos problemas (excetuando-se pela rara exce��o do Incidente Ilfracombe)\n"
							+ "preferindo, como o Olho-de-Opala, ca�ar carneiros e se empenha para evitar os humanos, a n�o ser quando provocado.\n"
							+ "O verde-gal�s tem um urro surpreendentemente melodioso que � facilmente reconhec�vel.\n"
							+ "Suas labaredas saem em jorros finos e seus ovos s�o cor de terra, sarapintados de verde");
		} else if (randomNumber == 1) {
			System.out.println("Com isso o drag�o que voc� vai enfrentar � o Meteoro-Chin�s.\n");
			System.out.println(
					"O Meteoro-Chin�s � de cor escarlate, possui escamas macias e uma franja de pontas douradas em volta do focinho\n"
							+ "e olhos extremamente protuberantes. Pesa entra duas e quatro toneladas.\n"
							+ "� chamado de Meteoro por causa das esferas de fogo que solta pelas narinas quando enfurecido, que tomam o formato de cogumelos\n");
		} else if (randomNumber == 2) {
			System.out.println("Com isso o drag�o que voc� vai enfrentar � o Focinho-Curto Sueco.\n");
			System.out
					.println("� uma das esp�cies mais perigosas, devido ao seu voo �gil e o fogo extremamente quente.\n"
							+ "O habitat natural dos Focinho-Curto suecos s�o as montanhas g�lidas, um para�so frio, por�m admir�vel e muito bonito.\n"
							+ "Suas habilidades s�o voar, expelir chamas, coura�a resistente a �cidos e queimaduras graves.");
		} else if (randomNumber == 3) {
			System.out.println("Com isso o drag�o que voc� vai enfrentar � o Rabo-C�rneo H�ngaro.\n");
			System.out.println(
					"Tem escamas negras, e apar�ncia de lagarto. Ele tamb�m tem olhos amarelos, com pupilas verticais como as de um gato,\n"
							+ "chifres de bronze e picos coloridas semelhantes que se projetam a partir da sua longa cauda que ele usa em combate.\n"
							+ "O rugido do drag�o � um grito estridente, e sua chama pode chegar a cerca de 15 metros.\n");
		}
	}

	public static void secondStep(String second) {
		Scanner input = new Scanner(System.in);

		String correctAnswer;
		int i = 1;

		do {
			System.out.println(
					"voc� pode :\n Esconder-Se esconder nas pedras.\n Corredor-Correr no corredor.\n Ficar-Ficar pulando em cima das pedras.\n Correr-Correr at� o ovo.\n ");

			System.out.println(
					"Digite apenas a primeira palavra de acordo com seu pr�ximo passo para conseguir realizar mais um desafio:");
			correctAnswer = input.next();

			System.out.println("\n");

			switch (correctAnswer.toUpperCase()) {
			case "ESCONDER":
				System.out.println("Voc� se escondeu nas pedras, voc� esta seguro agora.\n\n\n");
				break;
			case "CORREDOR":
			case "FICAR":
			case "CORRER":
				System.out.println("Essa escolha far� com que o drag�o te pegue.\n");
				i++;

			}
		} while (i <= 3 && !(correctAnswer.equalsIgnoreCase("ESCONDER")));
		{

			if (i > 3) {
				System.out.println("Voc� perdeu todas as suas vidas. FIM DE JOGO.");
				System.exit(i);
			}
		}
	}

	public static void thirdStep(String third) {
		Scanner input = new Scanner(System.in);
		String step;
		int i = 1;
		System.out.println(
				"BOAAAAAAAAA, voc� � fera....Voc� se escondeu nas pedras, o drag�o est� cuspindo fogo na pedra em que voce est�.\n"
						+ "A pedra est� esquentando voc� precisa tomar uma decis�o.\n\n");
		do {
			System.out.println(
					"Ficar-Ficar na pedra, pois ela n�o esquentar� muito.\nCorrer-Correr para outra pedra.\nDire��o-Ir em dire��o ao ovo.\nVassoura-Chamar uma vassoura para voar.\n");

			System.out.println(
					"Digite apenas a primeira palavra de acordo com seu pr�ximo passo para conseguir realizar mais um desafio:\n");
			step = input.next();
			System.out.println("\n");

			switch (step.toUpperCase()) {
			case "VASSOURA":
				System.out.println("Isso ai, sua vassoura esta a caminho, suba nela e v� adiante.\n\n\n");
				break;
			case "FICAR":
			case "CORRER":
			case "DIRE��O":
				System.out.println("Essa escolha far� com que o drag�o de pegue, tente novamente.");
				i++;
			}
		} while (i <= 3 && !(step.equalsIgnoreCase("VASSOURA")));
		{
			if (i > 3) {
				System.out.println("Voc� perdeu todas as suas vidas. FIM DE JOGO.");
				System.exit(i);
			}
		}
	}

	public static void fourthStep(String fourth) {
		Scanner input = new Scanner(System.in);
		String pass;
		int i = 1;
		System.out.println(
				"Mais uma vez voc� pegou as dicas certas, continue..Voc� acaba de subir em sua vassoura m�gica e agora tem que matar o drag�o.\n"
						+ "Voc� come�a a fazer com que ele te siga,"
						+ "mas acaba caindo de cima da vassoura e sua vassoura ficar presa em um telhado um pouco afastado de voc�,Voc� pode:\n");
		do {
			System.out.println(
					"Esconder-Se esconder at� o drag�o ir embora\nfeiti�o-Fazer um feiti�o para a vassoura voltar para voc�.\nDeslizar-Deslizar e pegar a vassoura.\nDeixar-Deixar a vassoura l�.");

			System.out.println(
					"Digite apenas a primeira palavra de acordo com seu pr�ximo passo para conseguir realizar mais um desafio:\n");
			pass = input.next();

			System.out.println("\n");

			switch (pass.toUpperCase()) {
			case "DESLIZAR":
				System.out.println("Deslizou e pegou, agora voc� consegue seguir.\n\n\n");
				break;
			case "ESCONDER":
			case "FEITI�O":
			case "DEIXAR":
				System.out.println("Essa escolha far� com que o drag�o de pegue, tente novamente.");
				i++;
			}
		} while (i <= 3 && !(pass.equalsIgnoreCase("DESLIZAR")));
		{
			if (i > 3) {
				System.out.println("Voc� perdeu todas as suas vidas. FIM DE JOGO.");
				System.exit(i);
			}
		}
	}

	public static void fifthStep(String fifth) {
		Scanner input = new Scanner(System.in);
		String continues;
		int i = 1;
		System.out.println(
				"Continue desse jeito, voc� n�o perde dica alguma...\nVoc� acaba de pegar sua vassoura e come�a a voar para se livrar novamente do drag�o, voc� come�a a procurar sa�das em sua volta.\n\n"
						+ "No Leste voc� v� uma ponte com um espa�o estreito para passar e o drag�o n�o consegue passar ali se n�o vai bater e morrer.\n"
						+ "No oeste voc� olha e v� muita neblina, n�o sabe se � um caminho.\n "
						+ "Se olhar para o  norte voc� s� consegue ir reto e n�o sabe onde vai parar.\n"
						+ "Se olhar para sul vai voltar para os castelos onde acabou de recuperar a vassoura.\n");
		do {
			System.out.println("Saidas: Norte, Sul, leste e oeste.");

			System.out.println(
					"Digite uma saida de acordo com seu pr�ximo passo para conseguir realizar mais um desafio:\n");
			continues = input.next();

			System.out.println("\n");

			switch (continues.toUpperCase()) {
			case "LESTE":
				System.out.println(
						"Nessa voc� foi maldoso em hahaha, por�m era a coisa certa a se fazer, siga em frente.\n\n\n");
				break;
			case "SUL":
			case "NORTE":
			case "OESTE":
				System.out.println("Essa escolha far� com que o drag�o de pegue, tente novamente.");
				i++;
			}
		} while (i <= 3 && !(continues.equalsIgnoreCase("LESTE")));
		{

			if (i > 3) {
				System.out.println("Voc� perdeu todas as suas vidas. FIM DE JOGO.");
				System.exit(i);
			}
		}

	}

	public static void primeiraPergunta() {
		System.out.println("Bem vindo a etapa 3!" + "\n"
				+ "Parabens voce chegou até aqui, ao passar do lago, voce agora tem um novo desafio! para ser o campeão"
				+ " tribuxo voce precisa passar pelo labirinto e pegar o calice." + "\n"
				+ "Todos os participantes incluindo voce entram no labirinto e começam a tentar encontrar o caminho certo."
				+ "\n");
		String alternativa;
		do {
			System.out.println(
					"Você está no meio do labirinto, derrepente houve um barulho de gritos, você corre para "
							+ "ver o que aconteceu, você vê uma competidora desmaiada. " + "\n"
							+ "Por causa de victor crum outro adversário, ela está sendo sugada pelo labirinto você pode :"
							+ "\n" + "\n" + "A) Tenta soltar com as maos impedir que ela seja sugada." + "\n"
							+ "B) Joga um feitiço na parede \n"
							+ "C) Jogar um feitiço de localização para os professores dela virem.\n"
							+ "D) Não faz nada. Deixa ela lá.\n" + "E) Gritar pedindo ajuda pára outro competidor.");

			Scanner scanner = new Scanner(System.in);
			alternativa = scanner.next();

			int vida = 0;
			if (alternativa.equalsIgnoreCase("a")) {

				System.out.println(" Com essa tentativa voce foi sugado também,  ");

				vida--;
			} else if (alternativa.equalsIgnoreCase("B")) {
				System.out.println("o feitiço foi inutil, ela morreu");

				vida--;
			} else if (alternativa.equals("C")) {

				System.out.println("muito bom por sua atitude ela foi salva e voce pode proseguir com seu teste");

			} else if (alternativa.equalsIgnoreCase("D")) {

				System.out.println("por essa atitude ela morreu e você foi desclassificado");
				vida--;
			} else if (alternativa.equalsIgnoreCase("E")) {

				System.out.println("ninguém veio te ajudar e a mulher morreu");
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
					"Ao jogar o feitiço de localização  o labirinto começa a fechar  você começa a correr." + "\n"
							+ " Você percebe que tem dois competidores brigando com suas varinhas, um dele está enfeitiçado,"
							+ "cedrico ganha dele , \n entretando depois de ter derrotado ele, cedrigo quer matar ele pelo o que fez com a outra"
							+ " competidora, agora você\n" + "\n"
							+ "A) Deixa cedrico matar ele afinal quase matou a outra competidora." + "\n"
							+ "B) Mata cedrico impedindo ele." + "\n"
							+ "C) Segura ele explicando que ele apenas está enfeitiçado." + "\n"
							+ "D) Joga um feitiço contra cedrico deixando ele desmaiado. ");

			Scanner scanner = new Scanner(System.in);
			alternativa = scanner.next();

			int vida = 0;
			if (alternativa.equalsIgnoreCase("a")) {

				System.out.println("vocês dois foram desclassificados por matar");

				vida--;
			} else if (alternativa.equalsIgnoreCase("B")) {

				System.out.println("você foi  desclassificados por matar");

				vida--;
			} else if (alternativa.equalsIgnoreCase("C")) {

				System.out.println("muito bem agora voces podem prosseguir.");

			} else if (alternativa.equalsIgnoreCase("D")) {

				System.out.println("você precisava do cedrico para continuar");

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
					+ " em seguida começam a correr até o fim do labirinto, \n"
					+ "Vocês vêem o cálice de longe e começam a disputar entre si correndo,"
					+ " até que cedrico é pego pelos galhos do labirinto está prestes a morrer, \n"
					+ "mas o cálice está logo alí. Você : \n" + "\n"
					+ "A) Deixa cedrico e vai até o cálice para ganhar o jogo." + "\n"
					+ "B) Da um sinal de localização e vai até o cálice." + "\n"
					+ "C) Joga um feitiço em cedrico para que ele para de gritar." + "\n"
					+ "D) Salva cedrico com um feitiço nas plantas, tirando ele de lá" + "\n"
					+ "E) Se oferece como distração para que ele escape.");

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

			System.out.println("Ao você salvar cedrico o labirinto todo começa a"
					+ " fechar vocês começam a correr de novo, ao chegar perto " + "do cálice voce decide " + "\n"
					+ "\n" + "A) Deixar que você pegue afinal salvou cedrico ." + "\n" + "B) Dar o cálice a ele "
					+ "\n" + "C) Decidem que vão ir juntos pegar o cálice. " + "\n"
					+ "D) Não pegar nenhum dos dois. +" + "\n"
					+ "E) Lutar contra cedrico para ver quem merece o cálice");

			Scanner scanner = new Scanner(System.in);
			alternativa = scanner.next();

			int vida = 0;
			if (alternativa.equalsIgnoreCase("a")) {

				System.out.println("Voce precisava do cedrico para prosseguir");

				vida--;
			} else if (alternativa.equalsIgnoreCase("B")) {

				System.out.println("o cedrico não poderia ter ganhado sozinho...");

				vida--;
			} else if (alternativa.equalsIgnoreCase("C")) {

				System.out.println("muito bem voces ganharam juntos! ");

			} else if (alternativa.equalsIgnoreCase("D")) {

				System.out.println("o labirinto se fechou e vocês dois morreram");

				vida--;
			} else if (alternativa.equalsIgnoreCase("E")) {

				System.out.println("Vocês dois acabam morrendo pelo labirinto que fechou");

				vida--;
			} else {
				System.out.println("digite um valor valido");
			}

		} while (!alternativa.equalsIgnoreCase("c"));

	}

}
