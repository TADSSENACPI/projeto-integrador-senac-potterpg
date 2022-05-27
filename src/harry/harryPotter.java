package harry;

import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class harryPotter {

	static Scanner input = new Scanner(System.in);
	static int xp, sleep = 5;
	static int vida =0;
	static String modo;

	public static void main(String[] args) throws IOException, InterruptedException {


		showMenu();
		validaOpcoesMenu(showMenu());



	}

	static void play() throws IOException, InterruptedException {

// mudar dps
		fase1PrimeiraPergunta();

	}

	public static void fase1PrimeiraPergunta() throws IOException, InterruptedException {


		System.out.println("digite sua modo de dificuldade que voce quer");
		System.out.println("1-facil \n" +
				"2- medio \n" +
				"3- Dificil \n");

		Scanner scanner = new Scanner(System.in);

		int modo = scanner.nextInt();

		if (modo == 1 ){
			System.out.println("voce escolheu o modo facil");
			vida = 5;
			System.out.println("voce tem 5 vidas");
		}else if (modo == 2 ){

			System.out.println("voce escolheu o modo medio");
			vida = 3;
			System.out.println("voce tem 3 vidas");

		} else if (modo == 3 ){
			System.out.println("voce escolheu o modo Dificil");
			vida = 1;
			System.out.println("voce tem 1 vidas");

		}


		datilografa(sleep,
				"\nNeste inicio de torneio, você descobre que o objetivo da primeira fase é recuperar um ovo\n" +
						"dourado que está sendo guardado por um dragão."
						+ "\nO ovo está localizado dentro de uma ninhada de dragões reais. \n" +
						"Cada um dos participantes vai ter que enfrentar um tipo de dragãoo para recuperar o ovo.\n"
						+ "\nAgora vamos sortear seu dragão, pressione ENTER para prosseguir:");
		System.in.read();

		int sorteioDragao = new Random().nextInt(4);
		datilografa(sleep, "\nO número " + sorteioDragao + " foi o número sorteado para você seguir sua história.");

		if (sorteioDragao == 0) {
			datilografa(sleep, "Com isso o dragão que voce vai enfrentar é o Verde-galã Comum.\n");
			datilografa(sleep,
					"Esta raça está entre as que causam menos problemas (excetuando-se pela rara exceção do Incidente Ilfracombe)\n"
							+ "preferindo, como o Olho-de-Opala, caça carneiros e se empenha para evitar os humanos, a não ser quando provocado.\n"
							+ "O verde-galã tem um urro surpreendentemente melodioso que é facilmente reconhecivel .\n"
							+ "Suas labaredas saem em jorros finos e seus ovos são cor de terra, sarapintados de verde");
		} else if (sorteioDragao == 1) {
			datilografa(sleep, "Com isso o dragão que vocÃª vai enfrentar  o Meteoro-China.\n");
			datilografa(sleep,
					"O Meteoro-China de cor escarlate, possui escamas macias e uma franja de pontas douradas em volta do focinho\n"
							+ "e olhos extremamente protuberantes. Pesa entra duas e quatro toneladas.\n"
							+ " chamado de Meteoro por causa das esferas de fogo que solta pelas narinas quando enfurecido, que tomam o formato de cogumelos\n");
		} else if (sorteioDragao == 2) {
			datilografa(sleep, "Com isso o dragão que voce vai enfrentar o Focinho-Curto Sueco.\n");
			datilografa(sleep,
					" uma das especie mais perigosas, devido ao seu voo agil e o fogo extremamente quente.\n"
							+ "O habitat natural dos Focinho-Curto suecos são as montanhas e são muito bonito.\n"
							+ "Suas habilidades são voar, expelir chamas, couraça resistente a acido e queimaduras graves.");
		} else if (sorteioDragao == 3) {
			datilografa(sleep,
					"Com isso o dragao que voce vai enfrentar  o Rabo-Corneo .\nTem escamas negras, e aparencia de lagarto. Ele tambem tem olhos amarelos, " +
							"com pupilas verticais como as de um gato,\n"
							+ "chifres de bronze e picos coloridas semelhantes que se projetam a partir da sua longa cauda que ele usa em combate.\n"
							+ "O rugido do dragão um grito estridente, e sua chama pode chegar a cerca de 15 metros.\n");
		}
		System.out.println("\n\nPRESSIONE ENTER PARA PROSEGUIR: ");
		System.in.read();
		clearConsole();
		fase1SegundaPergunta();
	}

	public static void fase1SegundaPergunta() throws InterruptedException, IOException {

		int alternativas = 4;
		String resposta[] = new String[alternativas], correctAnswer;
		datilografa(sleep, "\n \n  Boa, agora vamos para o que interessa...\n\nAgora que voce ja descobriu seu dragão,\n"
				+ "voce está na arena, seu objetivo ao pegar o ovo, o dragao protege ele, seu dragão cospe fogo voce precisa se esconder.\n");

		resposta[0] = "\nEsconder\t| Se esconder nas rochas.\n";
		resposta[1] = "Corredor\t| Correr no corredor.\n";
		resposta[2] = "Ficar\t\t| Ficar pulando em cima das pedras.\n";
		resposta[3] = "Correr\t\t| Correr até o ovo.\n";

		System.out.println(resposta[0] + resposta[1] + resposta[2] + resposta[3]);
		System.out.println(
				"Digite apenas a primeira palavra de acordo com seu proximo passo para conseguir realizar mais um desafio!");
		do {
			verificaVida();
			System.out.print("\nESCOLHA: ");
			correctAnswer = input.next();

			switch (correctAnswer.toUpperCase()) {
			case "ESCONDER":
				System.out.println("\nVocê se escondeu nas rochas, está seguro agora.");
				xp = xp(xp);
				fase1TerceiraPergunta();
				break;
			case "CORREDOR":

				vida = vida(vida, -1);
				break;
			case "FICAR":
				vida = vida(vida, -1);
				break;
			case "CORRER":
				System.out.println("Essa escolha fará com oque o dragão te coma.");
				vida = vida(vida, -1);

			}
		} while (correctAnswer.toUpperCase() != "ESCONDER");

	}

	public static void fase1TerceiraPergunta() throws InterruptedException, IOException {

		String step;
		datilografa(sleep,
				"\n  \n \n   O dragão está cuspindo fogo na rocha. "
						+ "Ela está esquentando, presisamos tomar uma decisão.\n");

		int alternativas = 4;
		String resposta[] = new String[alternativas];
		resposta[0] = "Ficar\t\t| Ficar na rocha, pois ela não esquentará muito.\n";
		resposta[1] = "Correr\t\t| Correr para outra rocha.\n";
		resposta[2] = "Direcao\t\t| Ir em direção ao ovo.\n";
		resposta[3] = "Vassoura\t| Chamar uma vassoura para voar.\n\n";
		for (String s : resposta) {
			datilografa(sleep, s);
		}

		datilografa(sleep,
				"Digite apenas a primeira palavra de acordo com seu próximo passo para conseguir realizar mais um desafio:\n");
		do {
			verificaVida();
			System.out.print("\nESCOLHA: ");
			step = input.next();
			String msg;
			System.out.println("\n");

			switch (step.toUpperCase()) {
			case "VASSOURA":

				datilografa(sleep, "\n  Isso ai, sua vassoura esta a caminho, suba nela e vá á adiante.\n");
				xp = xp(xp);
				fase1QuartaPergunta();
				break;
			case "FICAR":
				vida = vida(vida, -1);
				break;
			case "CORRER":
				vida = vida(vida, -1);
				break;
			case "DIRECAO":
				datilografa(sleep,"\t\t\t\t\tmsg = \"\\n" +
						"  Essa escolha fará com que o dragão te pegue, tente novamente.\\n\";\n");
				vida = vida(vida, -1);
				xp();
				break;
			}

		} while (step.toUpperCase() != "VASSOURA");
	}

	public static void fase1QuartaPergunta() throws InterruptedException, IOException {

		String pass;
		datilografa(sleep,
				"\n \n Mais uma vez você pegou as dicas certas, continue...Você acaba de subir em sua vassoura mágica " +
						"e agora tem que matar o dragão.\n"
						+ "Você começa a fazer com que ele te siga,"
						+ "mas acaba caindo de cima da vassoura e a ela fica presa no telhado do castelo " +
						"\n um pouco afastado de você," +
						" restando apenas:\n");
		int alternativas = 4;
		String resposta[] = new String[alternativas];
		resposta[0] = "\nEsconder\t| Se esconder até o dragão ir embora\n";
		resposta[1] = "Feitico\t\t| Fazer um feitiço para a vassoura voltar para você.\n";
		resposta[2] = "Deslizar\t| Deslizar e pegar a vassoura.\n";
		resposta[3] = "Deixar\t\t| Deixar a vassoura lá.\n";
		datilografa(sleep, resposta[0] + resposta[1] + resposta[2] + resposta[3]);
		datilografa(sleep,
				"\n Digite apenas a primeira palavra de acordo com seu próximo passo para conseguir realizar mais um desafio:\n");

		do {
			verificaVida();
			System.out.print("\nESCOLHA: ");
			pass = input.next();

			switch (pass.toUpperCase()) {
			case "DESLIZAR":
				datilografa(sleep, " \n Deslizou e pegou, agora você consegue seguir.\n");
				xp = xp(xp);
				fase1QuintaPergunta();
				break;
			case "ESCONDER":
				vida = vida(vida, -1);
				break;
			case "FEITICO":
				vida = vida(vida, -1);
				break;
			case "DEIXAR":
				vida = vida(vida, -1);
				System.out.println("Essa escolha fará com que o dragão te pegue, tente novamente.");
				break;
			}
		} while (pass.toUpperCase() != "DESLIZAR");
	}

	public static void fase1QuintaPergunta() throws InterruptedException, IOException {

		String continues;
		datilografa(sleep,
				"\n \n Continue desse jeito, voce nao perde dica alguma...\n" +
						"Voce acaba de pegar sua vassoura e comeca a voar para se livrar novamente do dragao," +
						" voce comeca a procurar uma saida em sua volta.\n\n"
						+ "No Leste voce va uma ponte com um espaço estreito para passar e o dragao nao" +
						" consegue passar ali se não vai bater e morrer.\n"
						+ "No oeste voce olha e veª muita neblina, não sabe se o caminho.\n "
						+ "Se olhar para o  norte voce consegue ir reto e não sabe onde vai parar.\n"
						+ "Se olhar para sul vai voltar para os castelos onde acabou de recuperar a vassoura.\n");
		int alternativas = 4;
		String resposta[] = new String[alternativas];

		resposta[0] = "\nNorte\t\t| Ir para o Norte\n";
		resposta[1] = "    Sul\t\t| Ir para o Sul\n";
		resposta[2] = "Leste\t\t| Ir para o Leste\n";
		resposta[3] = "Oeste\t\t| Ir para o Oeste\n";

		datilografa(sleep, resposta[0] + resposta[1] + resposta[2] + resposta[3]);
		datilografa(sleep,
				"\nDigite uma saida de acordo com seu próximo passo para conseguir realizar mais um desafio:\n");

		do {
			verificaVida();
			System.out.print("\nESCOLHA: ");
			continues = input.next();

			switch (continues.toUpperCase()) {
			case "LESTE":
				datilografa(sleep,
						"Nessa você foi maldoso em hahaha, porém era a coisa certa a se fazer, siga em frente.\n");
				xp = xp(xp);
				fase2PrimeiraPergunta();
				break;
			case "SUL":
				vida = vida(vida, -1);
				break;
			case "NORTE":
				vida = vida(vida, -1);
				break;
			case "OESTE":
				System.out.println("Essa escolha fará com que o dragão de pegue, tente novamente.");
				vida = vida(vida, -1);
			}
		} while (continues.toUpperCase() != "LESTE");

	}

	public static void fase2PrimeiraPergunta() throws InterruptedException, IOException {

		String resposta;

		datilografa(sleep,
				"\n  \n Parabens !!! Você conseguiu o Ovo do dragão ... Agora é hora de descansar, estamos perto do" +
						" baile de natal, até mais, bravo guerreiro...\n");
		clearConsole(0);
		datilografa(sleep,
				"Parece que Cedrico quer retribuir o favor que você fez a ele no desafio dos dragôes," +
						" ele quer falar algo...\n");

		datilografa(sleep,
				"Cedrico: Sabe o Banheiro dos monitores no 5º Piso ? É um bom lugar para um banho...  \n" +
						"Leve seu ovo e ilumine um pouco as coisas em baixo da água quente...");

		datilografa(sleep,
				"  \nCedrico te deu uma dica, e agora, o que faremos? " + "Você está no 4º andar da escola.\n"
						+ "\nSul\t\t| Está a Biblioteca, você pode tentar procurar mais sobre o ovo nos livros.\n"
						+ "Norte\t\t| Você pode ver o Salão Principal.\n"
						+ "Oeste\t\t| Tem uma escada que da acesso ao banheiro do 5º Piso.\n"
						+ "Leste\t\t| Tem uma escada que dá acesso ao 3º Piso...\n");
		do {
			verificaVida();

			System.out.print("\n\nESCOLHA A DIREÇÃO: ");
			resposta = input.next();

			if (resposta.equalsIgnoreCase("Norte")) {
				datilografa(sleep, " Salão principal ?... Não parece ser o melhor lugar para se tomar um banho!\n");
				vida = vida(vida, -1);
			} else if (resposta.equalsIgnoreCase("Sul")) {
				datilografa(sleep, "\nÉ para lavar seu ovo, não para ler para ele!\n");
				vida = vida(vida, -1);
			} else if (resposta.equals("Leste")) {
				datilografa(sleep, "\nÉ para lavar seu ovo, não para ler para ele!\n");
				vida = vida(vida, -1);
			} else if (resposta.equalsIgnoreCase("Oeste")) {
				datilografa(sleep,
						"\nBoa! Agora siga o conselho que Cedrico te deu e tome um banho com seu ovo no banheiro dos monitores... "
								+ "\n Mas cuidado viu, pode ter seres estranhos lá... \n");
				xp = xp(xp);
				fase2SegundaPergunta();
			} else {
				datilografa(sleep, "Digite uma das opções válidas!");
			}
			resposta = resposta.trim();
		} while (!resposta.equalsIgnoreCase("Oeste"));

	}

	public static void fase2SegundaPergunta() throws InterruptedException, IOException {


		String resposta;

		datilografa(sleep,
				"\n \n  Que barulho é esse? Parece que o Ovo tem uma musica que só se escuta em baixo d'água: \n" +
						"            + Onde ouvir da nossa voz o tom na superficie não há som \n " +
						"            + Durante uma hora deve buscar o que quer vai encontrar \n" +
						"            + Nossa!! Parece o canto dos Sereianos... \n" +
						"            + Vamos!! você só tem algumas horas para 2º tarefa...\n");
		clearConsole(0);
		datilografa(sleep,
				"Oh não! Parece que você dormiu...");

		datilografa(sleep, "TECLE ENTER PARA ACORDAR!");

		clearConsole();

		datilografa(sleep, "\nEstá na hora da 2º tarefa!!! " + "\n"
				+ "\nVocê precisa encontrar seu amigo Ronald no fundo do Lago Negro e você só tem uma hora para isso..."
				+ "\nAllastor Olho-Tonto te entregou um guelrricho, vai te ajudar na procura, coma rápido!! \n ");
		datilografa(sleep, "Seus oponentes sairam na sua frente, nadaram rapidamente para o norte... "
				+ "\n Cuidado para não se perder no caminho, lembre-se, seu objetivo é salvar o que você ama, seu amigo...");

		do {
			verificaVida();

			datilografa(sleep, "\nOnde você quer procurar? Selecione para qual lado você quer ir:" +
					"\n\nNorte\t\t| Ir para o Norte.\nSul\t\t| Ir para o Sul.\nLeste\t\t| Ir para o Leste" +
					".\nOeste\t\t| Ir para o Oeste.");


			System.out.print("\n\nESCOLHA A DIREÇÃO: ");

			resposta = input.next();

			if (resposta.equalsIgnoreCase("Norte")) {

				datilografa(sleep,"Isso! Seus adversários podem dar boas pistas de" +
						" onde seguir, agora vamos atrás do Rony! ");
				xp = xp(xp);
				fase2TerceiraPergunta();


			} else if (resposta.equalsIgnoreCase("Sul")) {
				datilografa(sleep, "\n Ir ao contrário da maioria nesse caso pode te atrapalhar, talvez eles saibam " +
						"+\n" +
						"um caminho diferente do que você imaginou... ");
				vida = vida(vida, -1);
			} else if (resposta.equals("Leste")) {
				datilografa(sleep, "Por ai não, só tem barreiras que pode te atrapalhar..");
				vida = vida(vida, -1);
			} else if (resposta.equalsIgnoreCase("Oeste")) {

				System.out.println("\n" + "Não parece ser o melhor local, acho que você só vai perder tempo... ");;
				vida = vida(vida, -1);

			} else {
				datilografa(sleep, "Digite uma das opções válidas!");
			}
			resposta = resposta.trim();
		} while (!resposta.equalsIgnoreCase("norte"));




	}

	public static void fase2TerceiraPergunta() throws InterruptedException, IOException {

		String resposta;

		datilografa(sleep,
				"\n \n  Parece que já estou vendo um sereiano e ao lado dele parece que é o... RONY !!! Vamos atrás dele!!");
		datilografa(sleep,
				"Droga, parece que seus 2 adversários foram mais rápido que você e já cumpriram o objetivo, \n " +
						" porém Rony não está sozinho, tem outra pessoa ao lado dele... \n "
				+ "\n Parece que é a Gabrielle, irmã de Fleur, seu oponente, \n " +
						" ele não vai conseguir completar a prova pois teve problema com os Grindylows, os diabos marinhos,\n " +
						" você vai deixar ela sozinha ? "
				+ "\n Lembre-se não é somente cumprir a prova para ganhar o torneio tribruxo, \n  " +
						"para ser um verdadeiro Bruxo precisamos de mais...");

		datilografa(sleep,
				"O que você quer fazer agora? \n\nA) Salvar Rony \nB) Salvar Rony e Gabrielle \nC) Desistir do Torneio");
		do {
			verificaVida();
			datilografa(sleep, "\n\nESCOLHA:");
			System.out.println("");
			resposta = input.next();

			if (resposta.equalsIgnoreCase("A")) {
				datilografa(sleep,
						"\n Você conseguiu salvar Rony porém chegou em 3º lugar, não há mais chances de ganhar o Torneio... ");
				vida = vida(vida, -1);
			} else if (resposta.equalsIgnoreCase("B")) {
				datilografa(sleep,
						"\n Parabéns!! Tenho certeza que os juizes levarão em conta sua bravura e compaixão," +
								" como um verdadeiro bruxo, agora vamos terminar o desafio! ");
				xp = xp(xp);
				fase2QuartaPergunta();
				/**
				 * ATENÇÃO NESSA CONDIÇÃO
				 */
			} else if (resposta.equalsIgnoreCase("C")) {
				datilografa(sleep, "\nPuxa, uma pena você não querer continuar...");
				vida = vida(vida, -1);
			} else {
				datilografa(sleep, "\nDigite uma resposta válida!");

			}

		} while (!resposta.equalsIgnoreCase("B"));

	}

	public static void fase2QuartaPergunta() throws InterruptedException, IOException {

		String resposta;

		datilografa(sleep, "\n \n  O que é isso ? "
				+ "\n Ah não, são os Grindylows e eles não querem deixar você levar a irmã de Fleur, o que faremos agora?");

		datilografa(sleep,
				"\n\nA)Soltar um feitiço nos Grindylows e se libertar deles." + "\nB)Desistir de levar Gabrielle.\n");

		do {
			verificaVida();
			datilografa(sleep, "\nESCOLHA: ");
			resposta = input.next();

			if (resposta.equalsIgnoreCase("A")) {
				datilografa(sleep,
						"Bravo nobre bruxo ! Você chegou em 3º lugar porém os juízes viram sua dedicação e companheirismo e" +
								" como forma de bonificão te beneficiaram com o 2º lugar "
						+ "\n Você passou de fase !!");
				xp = xp(xp);
				fase3PrimeiraPergunta();

			} else if (resposta.equalsIgnoreCase("B")) {
				datilografa(sleep,
						"Você conseguiu salvar Rony porém chegou em 3º lugar, não há mais chances de ganhar o Torneio... ");
				vida = vida(vida, -1);
			} else {
				datilografa(sleep, "Digite uma resposta valida");
			}

		} while (!resposta.equalsIgnoreCase("A"));

	}

	public static void fase3PrimeiraPergunta() throws InterruptedException, IOException {
		datilografa(sleep, "\n \n  BEM VINDO A FASE 3!\n\n"
				+ "Parabens voce chegou até aqui, ao passar do lago, voce agora tem um novo desafio! para ser o campeao"
				+ " tribuxo voce precisa passar pelo labirinto e pegar o calice." + "\n"
				+ "Todos os participantes incluindo voce entram no labirinto e comecam a tentar encontrar o caminho certo."
				+ "\n");
		datilografa(sleep, "\nTECLE ENTER PARA CONTINUAR: ");
		clearConsole();
		String alternativa;

		datilografa(sleep,
				"\n \n  Voce esta no meio do labirinto, derrepente houve um barulho de gritos, voce corre para "
						+ "ver o que aconteceu, voce ve uma competidora desmaiada. " + "\n"
						+ "Por causa de victor crum outro adversario, ela esta sendo sugada pelo labirinto voce pode :"
						+ "\n\nA) Tenta soltar com as maos impedir que ela seja sugada." + "\n"
						+ "B) Joga um feitico na parede \n"
						+ "C) Jogar um feitico de localizacao para os professores dela virem.\n"
						+ "D) não faz nada. Deixa ela la¡.\n" +
						"E) Gritar pedindo ajuda para outro competidor.");
		do {
			verificaVida();
			datilografa(sleep, "\n\nESCOLHA: ");
			alternativa = input.next();
			alternativa = alternativa.toUpperCase();
			if (alternativa.equalsIgnoreCase("A")) {

				datilografa(sleep, " Com essa tentativa voce foi sugado tambem.\n");

				vida = vida(vida, -1);
			} else if (alternativa.equalsIgnoreCase("B")) {
				datilografa(sleep, "O feitico foi inutil, ela morreu.\n");

				vida = vida(vida, -1);
			} else if (alternativa.equals("C")) {

				datilografa(sleep, "Muito bom por sua atitude ela foi salva e voce pode proseguir com seu teste.\n");
				xp = xp(xp);
				fase3SegundaPergunta();
				break;
			} else if (alternativa.equalsIgnoreCase("D")) {

				datilografa(sleep, "Por essa atitude ela morreu e voce foi desclassificado.\n");
				vida = vida(vida, -1);
			} else if (alternativa.equalsIgnoreCase("E")) {

				datilografa(sleep, "Ninguem veio te ajudar e a mulher morreu.\n");
				vida = vida(vida, -1);
			} else {

				System.out.println("Digite um numero válido!");
			}

//		} while (!alternativa.equalsIgnoreCase("C"));
		} while (alternativa.toUpperCase() != "C");

	}

	public static void fase3SegundaPergunta() throws InterruptedException, IOException {

		String alternativa;
		datilografa(sleep,"\n \n Ao jogar o feitico  de localizacao  o labirinto comeca a " +
				"fechar  voce comeca a correr."
				+ "\n" + "Voce percebe que tem dois competidores brigando com suas varinhas, "
				+ "um dele estao enfeiticado," + "cedrico ganha dele , \n" +
				"entretando depois de ter derrotado ele, "
				+ "cedrigo quer matar ele pelo o que fez com a outra" + " competidora, agora você\n" + "\n"
				+ "A) Deixa cedrico matar ele afinal quase matou a outra competidora." + "\n"
				+ "B) Mata cedrico impedindo ele." + "\n" + "C) Segura ele explicando que ele apenas esta enfeiticado."
				+ "\n" + "D) Joga um feitico contra cedrico deixando ele desmaiado. ");
		do {
			verificaVida();
			datilografa(sleep, "\n\nESCOLHA: ");
			alternativa = input.next();
			alternativa = alternativa.toUpperCase();
			if (alternativa.equalsIgnoreCase("A")) {

				datilografa(sleep,"Voce dois foram desclassificados por matar.");
				vida = vida(vida, -1);

			} else if (alternativa.equalsIgnoreCase("B")) {

				datilografa(sleep,"Voce foi  desclassificados por matar.");

				vida = vida(vida, -1);
			} else if (alternativa.equalsIgnoreCase("C")) {

				datilografa(sleep,"Muito bem agora voces podem prosseguir.");
				xp = xp(xp);
				fase3TerceiraPergunta();
				break;

			} else if (alternativa.equalsIgnoreCase("D")) {

				datilografa(sleep,"Você precisava do Cedrico para continuar.");

				vida = vida(vida, -1);
			} else {
				datilografa(sleep,"Digite um valor válido!");
			}

		} while (!alternativa.equals("C"));

	}

	public static void fase3TerceiraPergunta() throws InterruptedException, IOException {

		String alternativa;
		System.out.println("\nDepois de convencer cedrico eles deixam o outro competidor ali,"
				+ " em seguida comeca a correr ao  fim do labirinto, \n"
				+ "voce olha o calice de longe e comecam a disputar entre si correndo,"
				+ "que cedrico  pego pelos galhos do labirinto esta prestes a morrer, \n"
				+ "mas o calice esta logo ali. Voce" + " : \n" + "\n"
				+ "A) Deixa cedrico e vai até o calice para ganhar o jogo." + "\n"
				+ "B) Da um sinal de localizacAo e vai ate o calice." + "\n"
				+ "C) Joga um feitiço em cedrico para que ele para de gritar." + "\n"
				+ "D) Salva cedrico com um feitico nas plantas, tirando ele de lÃ¡" + "\n"
				+ "E) Se oferece como distracao para que ele escape.");
		do {
			verificaVida();
			datilografa(sleep, "\n\n  ESCOLHA: ");
			alternativa = input.next();

			if (alternativa.equalsIgnoreCase("a")) {

				System.out.println("por sua causa cetrico morreu voce precisava dele");

				vida = vida(vida, -1);
			} else if (alternativa.equalsIgnoreCase("B")) {

				datilografa(sleep,"nesse caso o labirinto estava muito mais agressivo e cetrico morreu, "
						+ "voce precisava dele");

				vida = vida(vida, -1);
			} else if (alternativa.equalsIgnoreCase("C")) {
				datilografa(sleep,"muito bem, sempre se salva um amigo");

				vida = vida(vida, -1);
			} else if (alternativa.equalsIgnoreCase("D")) {


				datilografa(sleep,"por sua causa cetrico morreu voce precisava dele");
				xp = xp(xp);
				fase3QuartaPergunta();
				break;


			} else if (alternativa.equalsIgnoreCase("E")) {

				datilografa(sleep,"Cetrico conseguiu escapar mas voce morreu.");

				vida = vida(vida, -1);
			} else {
				datilografa(sleep,"digite um valor valido");
			}

		} while (!alternativa.equalsIgnoreCase("D"));

	}

	public static void fase3QuartaPergunta() throws InterruptedException, IOException {

		String alternativa;
		System.out.println("Ao voce salvar cedrico o labirinto todo comeca"
				+ " fechar voce comeca a correr de novo, ao chegar perto " + "do calice voce decide " + "\n" + "\n"
				+ "A) Deixar que vocÃª pegue afinal salvou cedrico ." + "\n" + "B) Dar o calice a ele " + "\n"
				+ "C) Decidem que vao ir juntos pegar o calice. " + "\n" + "D) nao pegar nenhum dos dois. +" + "\n"
				+ "E) Lutar contra cedrico para ver quem merece o calice");
		do {
			verificaVida();
			datilografa(sleep, "\n\n   ESCOLHA: ");
			alternativa = input.next();

			if (alternativa.equalsIgnoreCase("a")) {

				System.out.println("Voce precisava do cedrico para prosseguir");

				vida = vida(vida, -1);
			} else if (alternativa.equalsIgnoreCase("B")) {

				System.out.println("o cedrico nao poderia ter ganhado sozinho...");

				vida = vida(vida, -1);
			} else if (alternativa.equalsIgnoreCase("C")) {

				System.out.println("muito bem voces ganharam juntos! ");
				xp = xp(xp);
				fase4PrimeiraPergunta();
				break;
			} else if (alternativa.equalsIgnoreCase("D")) {

				System.out.println("o labirinto se fechou e vocês dois morreram");

				vida = vida(vida, -1);
			} else if (alternativa.equalsIgnoreCase("E")) {

				System.out.println("Voces dois acabam morrendo pelo labirinto que fechou");

				vida = vida(vida, -1);
			} else {
				System.out.println("digite um valor valido");
			}

		} while (!alternativa.equalsIgnoreCase("c"));

	}

	public static void fase4PrimeiraPergunta() throws InterruptedException, IOException {
		String step;

		datilografa(sleep, "\n\n Parabéns, você conseguiu superar todos os desafios!\n");
		datilografa(sleep, "TECLE ENTER PARA CONTINUAR: ");
		clearConsole();
		datilografa(sleep,
				"Harry e seu amigo Cedrico chegam em Little Hangleton. Mas... espere... Aquele nãoo é o... RABICHO?.\n"
						+ "E ele está estranho... Ele foi enfeitiçado pelo Valdemort e está usando um feitiço contra Cedrico, oque você ira fazer?\n");

		datilografa(sleep,
				"Digite apenas a primeira palavra de acordo com seu proximo passo para conseguir realizar mais um desafio:\n");


		do {

			verificaVida();

			datilografa(sleep, "\nFeitico\t\t| Utilizar um feitiço contra o Rabicho.");
			datilografa(sleep, "\nEsconder\t\t| Se esconder do Rabicho.");
			datilografa(sleep, "\nCorrer\t\t| Correr em direção ao Rabicho e tirar a varinha mágica dele.\n");

			step = input.next();
			System.out.println("\n");

			switch (step.toUpperCase()) {
			case "ESCONDER":

				datilografa(sleep,"Infelizmente essa opção acabou matando Cedrico... E você foi preso pelo Rabicho no tumulo de Tom Riddle");
				xp = xp(xp);
				fase4SegundaPergunta();

			case "feitico":
				datilografa(sleep,
						"Essa escolha fará com que o Rabicho consiga usar um feitiço e te matar. Tente novamente.");
				vida = vida(vida, -1);
				break;
			case "CORRER":
				datilografa(sleep,
						"Essa escolha fará com que o Rabicho consiga usar um feitiço e te matar. Tente novamente.");
				vida = vida(vida, -1);
				break;


				default:
				System.out.println("Escolha uma resposta válida.");
			}
		} while (step.equalsIgnoreCase("ESCONDER"));
	}

	public static void fase4SegundaPergunta() throws IOException, InterruptedException {
		// String second
		String pass;

		System.out.println("Agora que chegou até aqui, precisa¡ encontrar uma forma de sair do tumulo.\n"
				+ "Mas... como você irá sair dele?\n");

		do {

			verificaVida();

			datilografa(sleep,
					"Cavar - Cavar  dentro do tumulo onde está escondido. \n " +
							"Aceitar - Aceitar que o Rabicho colete o seu sangue," +
							" um osso desenterrado do tum do Riddle e uma de suas proprias maos. \n"
							+ "feitiço -  Utilizar um feitiço para que se teletransporte para outro lugar." +
							"\n Esperar - Esperar Rabicho aparecer, jogo-lo dentro do tumulo e trancar ele lá dentro");
			datilografa(sleep,
					"Digite apenas a primeira palavra de acordo com seu proximo passo para conseguir realizar mais um desafio:\n");
			pass = input.next();

			System.out.println("\n");

			switch (pass.toUpperCase()) {
			case "ACEITAR":
				datilografa(sleep,
						"Oh não! Essa opçãoo fez com que Valdemort tenha seu corpo regenerado! \n" +
								" Ele agora está mais poderoso do que nunca! \n" +
								"Valdemort pegou sua varinha e,  \n" +
								"através da Marca Negra no braço de Pettigrew, convocou os Comensais da Morte");

				xp = xp(xp);
				fase4TerceiraPergunta();

				break;
			case "ESCONDER":
				datilografa(sleep,"Essa escolha fará com que voce fique preso dentro do túmulo. . tente novamente.");

				vida = vida(vida, -1);
				break;
			case "FEITICO":
				datilografa(sleep,"Essa escolha fará com que você fique preso dentro do túmulo. tente novamente.");
				vida = vida(vida, -1);
				break;
			case "DEIXAR":
				datilografa(sleep,"Essa escolha fará¡ com que você fique preso dentro do túmulo. tente novamente.");
				vida = vida(vida, -1);
				break;
			default:
				datilografa(sleep,"Escolha uma resposta valida.");

			}
		} while (!pass.equalsIgnoreCase("ACEITAR"));


	}

	public static void fase4TerceiraPergunta() throws IOException, InterruptedException {
		String pass;
		int i = 1;
		System.out.println(
				"Após ter que presenciar esta cena de Valdemort voltando a vida, você terá que enfrentar ele e usar todas suas forças! Mas antes disso, você precisa pensar bem nos seus próximos passos.\n" +
						" Para onde seguir?");
		do {

			verificaVida();
			datilografa(sleep,
					"\n \n Norte - Ir para o norte do cemitério e tentar encontrar o calice. \n Local - Continuar no mesmo local e enfrentar Valdemort." +
							" \n  Sul -  Ir para o sul do cemitério e seguir o caminho do rio para chegar a uma cabana e se esconder.\n"
					+ "Juntar - Se juntar aos comensais da morte, afinal, você não conseguirá derrotá-los\n");

			datilografa(sleep,
					"Digite apenas a primeira palavra de acordo com seu proximo passo para conseguir realizar mais um desafio:\n");
			pass = input.next();

			System.out.println("\n");

			switch (pass.toUpperCase()) {
			case "LOCAL":
				datilografa(sleep,"Boa escolha! O duelo entre você está prestes a começar ");

				xp = xp(xp);
				fase4QuintaPergunta();
				break;
			case "NORTE":
				datilografa(sleep,"Essa escolha fará com que o Voldemort te pegue, tente novamente.");
				vida = vida(vida, -1);
				break;
			case "JUNTAR":
				datilografa(sleep,"Essa escolha fará com que o Voldemort te pegue, tente novamente.");
				vida = vida(vida, -1);
				break;
			case "SUL":
				datilografa(sleep,"Essa escolha fará com que o Voldemort te pegue, tente novamente.");
				vida = vida(vida, -1);
			default:
				datilografa(sleep,"Escolha uma resposta valida.");
			}
		} while (!pass.equalsIgnoreCase("LOCAL"));



	}




	public static void fase4QuintaPergunta() throws IOException, InterruptedException {
//		  String fifth
		String pass;

		datilografa(sleep,
				"\n \n Mas veja! Agora você é capaz de resistir ao feitiço desta vez. Surpreso com sua resistência para a Maldição,\n" +
						" Voldemort disparou outro feitiço, e você sem pensar duas vezes: \n");

		do {
			verificaVida();
			datilografa(sleep,"\n Pedra - Se escondeu atrás de uma pedra para desviar do feitiço.\n"
					+ "Estatua - Se escondeu atrás de uma estátua para desviar do feitiço.\n"
					+ "FEITICO - Bloqueia o feitiço com outro feitiço.\n "
					+ "Rastejar - Foi atingido pelo feitiço e saiu rastejando tentando se esconde atrás de uma pedra.\n");

			datilografa(sleep,
					"Digite apenas a primeira palavra de acordo com seu próximo  passo para conseguir realizar mais um desafio:\n");
			pass = input.next();

			System.out.println("\n");

			switch (pass.toUpperCase()) {
			case "PEDRA":
				datilografa(sleep,"Uffa essa foi por pouco!");
				xp = xp(xp);
				fase4SextaPergunta();

				break;
			case "ESTATUA":
				datilografa(sleep,"Essa escolha fará com que Voldemort te pegue, tente novamente.");
				vida = vida(vida, -1);
				break;
			case "FEITICO":
				datilografa(sleep,"Essa escolha fará com que Voldemort te pegue, tente novamente.");
				vida = vida(vida, -1);
				break;
			case "RASTEJAR":
				datilografa(sleep,"Essa escolha fará com que Voldemort te pegue, tente novamente.");
				vida = vida(vida, -1);
				break;
			default:
				datilografa(sleep,"Escolha uma resposta valida.");
			}
		} while (!pass.equalsIgnoreCase("PEDRA"));

	}

	public static void fase4SextaPergunta() throws IOException, InterruptedException {
		String pass;

		datilografa(sleep,
				"No entanto, você, percebendo que não havia nenhuma maneira de escapar,\n" +
						" decidiu que, se ia morrer, iria morrer lutando, e não se encolhendo para longe e se escondendo. \n" +
						"Com isso, você saiu de trás da pedra para enfrentar Voldemort. Vocês dois usaram dois feitiços ao mesmo tempo, Valdemort usou o Expelliarmus.\n" +
						" Escolha seu feitiço::\\n\\n\\n\"");

		do {

			verificaVida();

			datilografa(sleep,"\n \n Imperius - Imperius  \n " + "Expelliarmus - Expelliarmus \n"
					+ "Avada - Avada Kedavra \n" + "Leviosa - Leviosa  \n");

			datilografa(sleep,
					"Digite apenas a primeira palavra de acordo com seu próximo passo para conseguir realizar mais um desafio:\n");
			pass = input.next();

			System.out.println("\n");
			switch (pass.toUpperCase()) {
			case "EXPELLIARMUS":
				datilografa(sleep,
						"No entanto, você, percebendo que não havia nenhuma maneira de escapar,\n" +
								" decidiu que, se ia morrer, iria morrer lutando, e não se encolhendo para longe e se escondendo. \n" +
								"Com isso, você saiu de trás da pedra para enfrentar Voldemort. \n " +
								"Vocês dois usaram dois feitiços ao mesmo tempo, Valdemort usou o Expelliarmus.\n" +
								" Escolha seu feitiço::\\n\\n\\n\"");
				datilografa(sleep,
						"Parabéns! Chegar aqui não foi uma tarefa fácil, mas você, \n " +
								"como um fã de Harry Potter fez parecer tranquilo! Obrigada por jogar e espero que tenha se divertido!");
				xp = xp(xp);
				break;
			case "IMPERIUS":
				datilografa(sleep,"Essa escolha fará com que Voldemort te pegue, tente novamente.");

				vida = vida(vida, -1);
				break;
			case "AVADA":
				datilografa(sleep,"Essa escolha fará com que Voldemort te pegue, tente novamente.");
				vida = vida(vida, -1);
				break;
			case "LEVIOSA":
				datilografa(sleep,"Essa escolha fará com que Voldemort te pegue, tente novamente.");

				vida = vida(vida, -1);
				break;
			default:
				System.out.println("Escolha uma resposta valida.");
			}
		} while (!pass.equalsIgnoreCase("EXPELLIARMUS"));


		System.out.println("Obrigado Por jogar!!");
	}

	static int vida(int vida, int condicao) {
		vida = vida + condicao;
		System.err.print("VIDAS RESTANTES: " + vida);
		return vida;
	}

	static int xp(int xp) {
		xp += 150;
		System.err.println("XP: " + xp);
		return xp;
	}

	static void xp() {
		System.err.println(" | XP: " + xp);
	}

	/// tentar arrumar
	static void validaOpcoesMenu(String opcao) throws IOException, InterruptedException {
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
			play();
		}
		if (opcao.equals("3")) {
			// Chamar metodo responsavel
		}
		if (opcao.equals("4")) {
			System.out.println("\n\nFIM!");
			System.exit(0);
		}
		if (!opcoesSet.contains(opcao)) {
			throw new UnsupportedOperationException("Opção invalida!");
		}
	}

	static String showMenu() throws InterruptedException, IOException {
		System.err.println(
				"********************************\n************* MENU *************\n********************************");
		System.out.println("");
		datilografa(sleep, "1 - INSTRUÇÕES\n2 - JOGAR\n3 - RANKING\n4 - EXIT\nR = ");
		return input.next();
	}

	static void clearConsole() throws IOException, InterruptedException {
		int inteiro = System.in.read();
		if (System.getProperty("os.name").contains("Windows"))
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		else
			Runtime.getRuntime().exec("clear");
	}

	static void clearConsole(int valor) throws IOException, InterruptedException {
		Thread.sleep(valor);
		if (System.getProperty("os.name").contains("Windows"))
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		else
			Runtime.getRuntime().exec("clear");
	}

	static void datilografa(String string) throws InterruptedException, IOException {
		for (int i = 0; i < string.length(); i++) {
			char caractere = string.charAt(i);
			Thread.sleep(5);
			System.out.print(caractere);
		}
		clearConsole();
	}

	static void datilografa(int tempo, String string) throws InterruptedException, IOException {
		for (int i = 0; i < string.length(); i++) {
			char caractere = string.charAt(i);
			Thread.sleep(tempo);
			System.out.print(caractere);
		}
	}

	static void verificaVida() throws InterruptedException, IOException {
		if (vida <= 0) {
			datilografa(sleep, "\nVOCÊ MORREU!\n");
			datilografa(sleep, "VOCÊ ALCANÇOU " + xp + " DE XP.");
			System.exit(0);
		}
	}
}
