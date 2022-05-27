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
				"\nNeste inicio de torneio, voc� descobre que o objetivo da primeira fase � recuperar um ovo\n" +
						"dourado que est� sendo guardado por um drag�o."
						+ "\nO ovo est� localizado dentro de uma ninhada de drag�es reais. \n" +
						"Cada um dos participantes vai ter que enfrentar um tipo de drag�oo para recuperar o ovo.\n"
						+ "\nAgora vamos sortear seu drag�o, pressione ENTER para prosseguir:");
		System.in.read();

		int sorteioDragao = new Random().nextInt(4);
		datilografa(sleep, "\nO n�mero " + sorteioDragao + " foi o n�mero sorteado para voc� seguir sua hist�ria.");

		if (sorteioDragao == 0) {
			datilografa(sleep, "Com isso o drag�o que voce vai enfrentar � o Verde-gal� Comum.\n");
			datilografa(sleep,
					"Esta ra�a est� entre as que causam menos problemas (excetuando-se pela rara exce��o do Incidente Ilfracombe)\n"
							+ "preferindo, como o Olho-de-Opala, ca�a carneiros e se empenha para evitar os humanos, a n�o ser quando provocado.\n"
							+ "O verde-gal� tem um urro surpreendentemente melodioso que � facilmente reconhecivel .\n"
							+ "Suas labaredas saem em jorros finos e seus ovos s�o cor de terra, sarapintados de verde");
		} else if (sorteioDragao == 1) {
			datilografa(sleep, "Com isso o drag�o que você vai enfrentar  o Meteoro-China.\n");
			datilografa(sleep,
					"O Meteoro-China de cor escarlate, possui escamas macias e uma franja de pontas douradas em volta do focinho\n"
							+ "e olhos extremamente protuberantes. Pesa entra duas e quatro toneladas.\n"
							+ " chamado de Meteoro por causa das esferas de fogo que solta pelas narinas quando enfurecido, que tomam o formato de cogumelos\n");
		} else if (sorteioDragao == 2) {
			datilografa(sleep, "Com isso o drag�o que voce vai enfrentar o Focinho-Curto Sueco.\n");
			datilografa(sleep,
					" uma das especie mais perigosas, devido ao seu voo agil e o fogo extremamente quente.\n"
							+ "O habitat natural dos Focinho-Curto suecos s�o as montanhas e s�o muito bonito.\n"
							+ "Suas habilidades s�o voar, expelir chamas, coura�a resistente a acido e queimaduras graves.");
		} else if (sorteioDragao == 3) {
			datilografa(sleep,
					"Com isso o dragao que voce vai enfrentar  o Rabo-Corneo .\nTem escamas negras, e aparencia de lagarto. Ele tambem tem olhos amarelos, " +
							"com pupilas verticais como as de um gato,\n"
							+ "chifres de bronze e picos coloridas semelhantes que se projetam a partir da sua longa cauda que ele usa em combate.\n"
							+ "O rugido do drag�o um grito estridente, e sua chama pode chegar a cerca de 15 metros.\n");
		}
		System.out.println("\n\nPRESSIONE ENTER PARA PROSEGUIR: ");
		System.in.read();
		clearConsole();
		fase1SegundaPergunta();
	}

	public static void fase1SegundaPergunta() throws InterruptedException, IOException {

		int alternativas = 4;
		String resposta[] = new String[alternativas], correctAnswer;
		datilografa(sleep, "\n \n  Boa, agora vamos para o que interessa...\n\nAgora que voce ja descobriu seu drag�o,\n"
				+ "voce est� na arena, seu objetivo ao pegar o ovo, o dragao protege ele, seu drag�o cospe fogo voce precisa se esconder.\n");

		resposta[0] = "\nEsconder\t| Se esconder nas rochas.\n";
		resposta[1] = "Corredor\t| Correr no corredor.\n";
		resposta[2] = "Ficar\t\t| Ficar pulando em cima das pedras.\n";
		resposta[3] = "Correr\t\t| Correr at� o ovo.\n";

		System.out.println(resposta[0] + resposta[1] + resposta[2] + resposta[3]);
		System.out.println(
				"Digite apenas a primeira palavra de acordo com seu proximo passo para conseguir realizar mais um desafio!");
		do {
			verificaVida();
			System.out.print("\nESCOLHA: ");
			correctAnswer = input.next();

			switch (correctAnswer.toUpperCase()) {
			case "ESCONDER":
				System.out.println("\nVoc� se escondeu nas rochas, est� seguro agora.");
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
				System.out.println("Essa escolha far� com oque o drag�o te coma.");
				vida = vida(vida, -1);

			}
		} while (correctAnswer.toUpperCase() != "ESCONDER");

	}

	public static void fase1TerceiraPergunta() throws InterruptedException, IOException {

		String step;
		datilografa(sleep,
				"\n  \n \n   O drag�o est� cuspindo fogo na rocha. "
						+ "Ela est� esquentando, presisamos tomar uma decis�o.\n");

		int alternativas = 4;
		String resposta[] = new String[alternativas];
		resposta[0] = "Ficar\t\t| Ficar na rocha, pois ela n�o esquentar� muito.\n";
		resposta[1] = "Correr\t\t| Correr para outra rocha.\n";
		resposta[2] = "Direcao\t\t| Ir em dire��o ao ovo.\n";
		resposta[3] = "Vassoura\t| Chamar uma vassoura para voar.\n\n";
		for (String s : resposta) {
			datilografa(sleep, s);
		}

		datilografa(sleep,
				"Digite apenas a primeira palavra de acordo com seu pr�ximo passo para conseguir realizar mais um desafio:\n");
		do {
			verificaVida();
			System.out.print("\nESCOLHA: ");
			step = input.next();
			String msg;
			System.out.println("\n");

			switch (step.toUpperCase()) {
			case "VASSOURA":

				datilografa(sleep, "\n  Isso ai, sua vassoura esta a caminho, suba nela e v� � adiante.\n");
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
						"  Essa escolha far� com que o drag�o te pegue, tente novamente.\\n\";\n");
				vida = vida(vida, -1);
				xp();
				break;
			}

		} while (step.toUpperCase() != "VASSOURA");
	}

	public static void fase1QuartaPergunta() throws InterruptedException, IOException {

		String pass;
		datilografa(sleep,
				"\n \n Mais uma vez voc� pegou as dicas certas, continue...Voc� acaba de subir em sua vassoura m�gica " +
						"e agora tem que matar o drag�o.\n"
						+ "Voc� come�a a fazer com que ele te siga,"
						+ "mas acaba caindo de cima da vassoura e a ela fica presa no telhado do castelo " +
						"\n um pouco afastado de voc�," +
						" restando apenas:\n");
		int alternativas = 4;
		String resposta[] = new String[alternativas];
		resposta[0] = "\nEsconder\t| Se esconder at� o drag�o ir embora\n";
		resposta[1] = "Feitico\t\t| Fazer um feiti�o para a vassoura voltar para voc�.\n";
		resposta[2] = "Deslizar\t| Deslizar e pegar a vassoura.\n";
		resposta[3] = "Deixar\t\t| Deixar a vassoura l�.\n";
		datilografa(sleep, resposta[0] + resposta[1] + resposta[2] + resposta[3]);
		datilografa(sleep,
				"\n Digite apenas a primeira palavra de acordo com seu pr�ximo passo para conseguir realizar mais um desafio:\n");

		do {
			verificaVida();
			System.out.print("\nESCOLHA: ");
			pass = input.next();

			switch (pass.toUpperCase()) {
			case "DESLIZAR":
				datilografa(sleep, " \n Deslizou e pegou, agora voc� consegue seguir.\n");
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
				System.out.println("Essa escolha far� com que o drag�o te pegue, tente novamente.");
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
						+ "No Leste voce va uma ponte com um espa�o estreito para passar e o dragao nao" +
						" consegue passar ali se n�o vai bater e morrer.\n"
						+ "No oeste voce olha e ve� muita neblina, n�o sabe se o caminho.\n "
						+ "Se olhar para o  norte voce consegue ir reto e n�o sabe onde vai parar.\n"
						+ "Se olhar para sul vai voltar para os castelos onde acabou de recuperar a vassoura.\n");
		int alternativas = 4;
		String resposta[] = new String[alternativas];

		resposta[0] = "\nNorte\t\t| Ir para o Norte\n";
		resposta[1] = "    Sul\t\t| Ir para o Sul\n";
		resposta[2] = "Leste\t\t| Ir para o Leste\n";
		resposta[3] = "Oeste\t\t| Ir para o Oeste\n";

		datilografa(sleep, resposta[0] + resposta[1] + resposta[2] + resposta[3]);
		datilografa(sleep,
				"\nDigite uma saida de acordo com seu pr�ximo passo para conseguir realizar mais um desafio:\n");

		do {
			verificaVida();
			System.out.print("\nESCOLHA: ");
			continues = input.next();

			switch (continues.toUpperCase()) {
			case "LESTE":
				datilografa(sleep,
						"Nessa voc� foi maldoso em hahaha, por�m era a coisa certa a se fazer, siga em frente.\n");
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
				System.out.println("Essa escolha far� com que o drag�o de pegue, tente novamente.");
				vida = vida(vida, -1);
			}
		} while (continues.toUpperCase() != "LESTE");

	}

	public static void fase2PrimeiraPergunta() throws InterruptedException, IOException {

		String resposta;

		datilografa(sleep,
				"\n  \n Parabens !!! Voc� conseguiu o Ovo do drag�o ... Agora � hora de descansar, estamos perto do" +
						" baile de natal, at� mais, bravo guerreiro...\n");
		clearConsole(0);
		datilografa(sleep,
				"Parece que Cedrico quer retribuir o favor que voc� fez a ele no desafio dos drag�es," +
						" ele quer falar algo...\n");

		datilografa(sleep,
				"Cedrico: Sabe o Banheiro dos monitores no 5� Piso ? � um bom lugar para um banho...  \n" +
						"Leve seu ovo e ilumine um pouco as coisas em baixo da �gua quente...");

		datilografa(sleep,
				"  \nCedrico te deu uma dica, e agora, o que faremos? " + "Voc� est� no 4� andar da escola.\n"
						+ "\nSul\t\t| Est� a Biblioteca, voc� pode tentar procurar mais sobre o ovo nos livros.\n"
						+ "Norte\t\t| Voc� pode ver o Sal�o Principal.\n"
						+ "Oeste\t\t| Tem uma escada que da acesso ao banheiro do 5� Piso.\n"
						+ "Leste\t\t| Tem uma escada que d� acesso ao 3� Piso...\n");
		do {
			verificaVida();

			System.out.print("\n\nESCOLHA A DIRE��O: ");
			resposta = input.next();

			if (resposta.equalsIgnoreCase("Norte")) {
				datilografa(sleep, " Sal�o principal ?... N�o parece ser o melhor lugar para se tomar um banho!\n");
				vida = vida(vida, -1);
			} else if (resposta.equalsIgnoreCase("Sul")) {
				datilografa(sleep, "\n� para lavar seu ovo, n�o para ler para ele!\n");
				vida = vida(vida, -1);
			} else if (resposta.equals("Leste")) {
				datilografa(sleep, "\n� para lavar seu ovo, n�o para ler para ele!\n");
				vida = vida(vida, -1);
			} else if (resposta.equalsIgnoreCase("Oeste")) {
				datilografa(sleep,
						"\nBoa! Agora siga o conselho que Cedrico te deu e tome um banho com seu ovo no banheiro dos monitores... "
								+ "\n Mas cuidado viu, pode ter seres estranhos l�... \n");
				xp = xp(xp);
				fase2SegundaPergunta();
			} else {
				datilografa(sleep, "Digite uma das op��es v�lidas!");
			}
			resposta = resposta.trim();
		} while (!resposta.equalsIgnoreCase("Oeste"));

	}

	public static void fase2SegundaPergunta() throws InterruptedException, IOException {


		String resposta;

		datilografa(sleep,
				"\n \n  Que barulho � esse? Parece que o Ovo tem uma musica que s� se escuta em baixo d'�gua: \n" +
						"            + Onde ouvir da nossa voz o tom na superficie n�o h� som \n " +
						"            + Durante uma hora deve buscar o que quer vai encontrar \n" +
						"            + Nossa!! Parece o canto dos Sereianos... \n" +
						"            + Vamos!! voc� s� tem algumas horas para 2� tarefa...\n");
		clearConsole(0);
		datilografa(sleep,
				"Oh n�o! Parece que voc� dormiu...");

		datilografa(sleep, "TECLE ENTER PARA ACORDAR!");

		clearConsole();

		datilografa(sleep, "\nEst� na hora da 2� tarefa!!! " + "\n"
				+ "\nVoc� precisa encontrar seu amigo Ronald no fundo do Lago Negro e voc� s� tem uma hora para isso..."
				+ "\nAllastor Olho-Tonto te entregou um guelrricho, vai te ajudar na procura, coma r�pido!! \n ");
		datilografa(sleep, "Seus oponentes sairam na sua frente, nadaram rapidamente para o norte... "
				+ "\n Cuidado para n�o se perder no caminho, lembre-se, seu objetivo � salvar o que voc� ama, seu amigo...");

		do {
			verificaVida();

			datilografa(sleep, "\nOnde voc� quer procurar? Selecione para qual lado voc� quer ir:" +
					"\n\nNorte\t\t| Ir para o Norte.\nSul\t\t| Ir para o Sul.\nLeste\t\t| Ir para o Leste" +
					".\nOeste\t\t| Ir para o Oeste.");


			System.out.print("\n\nESCOLHA A DIRE��O: ");

			resposta = input.next();

			if (resposta.equalsIgnoreCase("Norte")) {

				datilografa(sleep,"Isso! Seus advers�rios podem dar boas pistas de" +
						" onde seguir, agora vamos atr�s do Rony! ");
				xp = xp(xp);
				fase2TerceiraPergunta();


			} else if (resposta.equalsIgnoreCase("Sul")) {
				datilografa(sleep, "\n Ir ao contr�rio da maioria nesse caso pode te atrapalhar, talvez eles saibam " +
						"+\n" +
						"um caminho diferente do que voc� imaginou... ");
				vida = vida(vida, -1);
			} else if (resposta.equals("Leste")) {
				datilografa(sleep, "Por ai n�o, s� tem barreiras que pode te atrapalhar..");
				vida = vida(vida, -1);
			} else if (resposta.equalsIgnoreCase("Oeste")) {

				System.out.println("\n" + "N�o parece ser o melhor local, acho que voc� s� vai perder tempo... ");;
				vida = vida(vida, -1);

			} else {
				datilografa(sleep, "Digite uma das op��es v�lidas!");
			}
			resposta = resposta.trim();
		} while (!resposta.equalsIgnoreCase("norte"));




	}

	public static void fase2TerceiraPergunta() throws InterruptedException, IOException {

		String resposta;

		datilografa(sleep,
				"\n \n  Parece que j� estou vendo um sereiano e ao lado dele parece que � o... RONY !!! Vamos atr�s dele!!");
		datilografa(sleep,
				"Droga, parece que seus 2 advers�rios foram mais r�pido que voc� e j� cumpriram o objetivo, \n " +
						" por�m Rony n�o est� sozinho, tem outra pessoa ao lado dele... \n "
				+ "\n Parece que � a Gabrielle, irm� de Fleur, seu oponente, \n " +
						" ele n�o vai conseguir completar a prova pois teve problema com os Grindylows, os diabos marinhos,\n " +
						" voc� vai deixar ela sozinha ? "
				+ "\n Lembre-se n�o � somente cumprir a prova para ganhar o torneio tribruxo, \n  " +
						"para ser um verdadeiro Bruxo precisamos de mais...");

		datilografa(sleep,
				"O que voc� quer fazer agora? \n\nA) Salvar Rony \nB) Salvar Rony e Gabrielle \nC) Desistir do Torneio");
		do {
			verificaVida();
			datilografa(sleep, "\n\nESCOLHA:");
			System.out.println("");
			resposta = input.next();

			if (resposta.equalsIgnoreCase("A")) {
				datilografa(sleep,
						"\n Voc� conseguiu salvar Rony por�m chegou em 3� lugar, n�o h� mais chances de ganhar o Torneio... ");
				vida = vida(vida, -1);
			} else if (resposta.equalsIgnoreCase("B")) {
				datilografa(sleep,
						"\n Parab�ns!! Tenho certeza que os juizes levar�o em conta sua bravura e compaix�o," +
								" como um verdadeiro bruxo, agora vamos terminar o desafio! ");
				xp = xp(xp);
				fase2QuartaPergunta();
				/**
				 * ATEN��O NESSA CONDI��O
				 */
			} else if (resposta.equalsIgnoreCase("C")) {
				datilografa(sleep, "\nPuxa, uma pena voc� n�o querer continuar...");
				vida = vida(vida, -1);
			} else {
				datilografa(sleep, "\nDigite uma resposta v�lida!");

			}

		} while (!resposta.equalsIgnoreCase("B"));

	}

	public static void fase2QuartaPergunta() throws InterruptedException, IOException {

		String resposta;

		datilografa(sleep, "\n \n  O que � isso ? "
				+ "\n Ah n�o, s�o os Grindylows e eles n�o querem deixar voc� levar a irm� de Fleur, o que faremos agora?");

		datilografa(sleep,
				"\n\nA)Soltar um feiti�o nos Grindylows e se libertar deles." + "\nB)Desistir de levar Gabrielle.\n");

		do {
			verificaVida();
			datilografa(sleep, "\nESCOLHA: ");
			resposta = input.next();

			if (resposta.equalsIgnoreCase("A")) {
				datilografa(sleep,
						"Bravo nobre bruxo ! Voc� chegou em 3� lugar por�m os ju�zes viram sua dedica��o e companheirismo e" +
								" como forma de bonific�o te beneficiaram com o 2� lugar "
						+ "\n Voc� passou de fase !!");
				xp = xp(xp);
				fase3PrimeiraPergunta();

			} else if (resposta.equalsIgnoreCase("B")) {
				datilografa(sleep,
						"Voc� conseguiu salvar Rony por�m chegou em 3� lugar, n�o h� mais chances de ganhar o Torneio... ");
				vida = vida(vida, -1);
			} else {
				datilografa(sleep, "Digite uma resposta valida");
			}

		} while (!resposta.equalsIgnoreCase("A"));

	}

	public static void fase3PrimeiraPergunta() throws InterruptedException, IOException {
		datilografa(sleep, "\n \n  BEM VINDO A FASE 3!\n\n"
				+ "Parabens voce chegou at� aqui, ao passar do lago, voce agora tem um novo desafio! para ser o campeao"
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
						+ "D) n�o faz nada. Deixa ela la�.\n" +
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

				System.out.println("Digite um numero v�lido!");
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
				+ "cedrigo quer matar ele pelo o que fez com a outra" + " competidora, agora voc�\n" + "\n"
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

				datilografa(sleep,"Voc� precisava do Cedrico para continuar.");

				vida = vida(vida, -1);
			} else {
				datilografa(sleep,"Digite um valor v�lido!");
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
				+ "A) Deixa cedrico e vai at� o calice para ganhar o jogo." + "\n"
				+ "B) Da um sinal de localizacAo e vai ate o calice." + "\n"
				+ "C) Joga um feiti�o em cedrico para que ele para de gritar." + "\n"
				+ "D) Salva cedrico com um feitico nas plantas, tirando ele de lá" + "\n"
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
				+ "A) Deixar que você pegue afinal salvou cedrico ." + "\n" + "B) Dar o calice a ele " + "\n"
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

				System.out.println("o labirinto se fechou e voc�s dois morreram");

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

		datilografa(sleep, "\n\n Parab�ns, voc� conseguiu superar todos os desafios!\n");
		datilografa(sleep, "TECLE ENTER PARA CONTINUAR: ");
		clearConsole();
		datilografa(sleep,
				"Harry e seu amigo Cedrico chegam em Little Hangleton. Mas... espere... Aquele n�oo � o... RABICHO?.\n"
						+ "E ele est� estranho... Ele foi enfeiti�ado pelo Valdemort e est� usando um feiti�o contra Cedrico, oque voc� ira fazer?\n");

		datilografa(sleep,
				"Digite apenas a primeira palavra de acordo com seu proximo passo para conseguir realizar mais um desafio:\n");


		do {

			verificaVida();

			datilografa(sleep, "\nFeitico\t\t| Utilizar um feiti�o contra o Rabicho.");
			datilografa(sleep, "\nEsconder\t\t| Se esconder do Rabicho.");
			datilografa(sleep, "\nCorrer\t\t| Correr em dire��o ao Rabicho e tirar a varinha m�gica dele.\n");

			step = input.next();
			System.out.println("\n");

			switch (step.toUpperCase()) {
			case "ESCONDER":

				datilografa(sleep,"Infelizmente essa op��o acabou matando Cedrico... E voc� foi preso pelo Rabicho no tumulo de Tom Riddle");
				xp = xp(xp);
				fase4SegundaPergunta();

			case "feitico":
				datilografa(sleep,
						"Essa escolha far� com que o Rabicho consiga usar um feiti�o e te matar. Tente novamente.");
				vida = vida(vida, -1);
				break;
			case "CORRER":
				datilografa(sleep,
						"Essa escolha far� com que o Rabicho consiga usar um feiti�o e te matar. Tente novamente.");
				vida = vida(vida, -1);
				break;


				default:
				System.out.println("Escolha uma resposta v�lida.");
			}
		} while (step.equalsIgnoreCase("ESCONDER"));
	}

	public static void fase4SegundaPergunta() throws IOException, InterruptedException {
		// String second
		String pass;

		System.out.println("Agora que chegou at� aqui, precisa� encontrar uma forma de sair do tumulo.\n"
				+ "Mas... como voc� ir� sair dele?\n");

		do {

			verificaVida();

			datilografa(sleep,
					"Cavar - Cavar  dentro do tumulo onde est� escondido. \n " +
							"Aceitar - Aceitar que o Rabicho colete o seu sangue," +
							" um osso desenterrado do tum do Riddle e uma de suas proprias maos. \n"
							+ "feiti�o -  Utilizar um feiti�o para que se teletransporte para outro lugar." +
							"\n Esperar - Esperar Rabicho aparecer, jogo-lo dentro do tumulo e trancar ele l� dentro");
			datilografa(sleep,
					"Digite apenas a primeira palavra de acordo com seu proximo passo para conseguir realizar mais um desafio:\n");
			pass = input.next();

			System.out.println("\n");

			switch (pass.toUpperCase()) {
			case "ACEITAR":
				datilografa(sleep,
						"Oh n�o! Essa op��oo fez com que Valdemort tenha seu corpo regenerado! \n" +
								" Ele agora est� mais poderoso do que nunca! \n" +
								"Valdemort pegou sua varinha e,  \n" +
								"atrav�s da Marca Negra no bra�o de Pettigrew, convocou os Comensais da Morte");

				xp = xp(xp);
				fase4TerceiraPergunta();

				break;
			case "ESCONDER":
				datilografa(sleep,"Essa escolha far� com que voce fique preso dentro do t�mulo. . tente novamente.");

				vida = vida(vida, -1);
				break;
			case "FEITICO":
				datilografa(sleep,"Essa escolha far� com que voc� fique preso dentro do t�mulo. tente novamente.");
				vida = vida(vida, -1);
				break;
			case "DEIXAR":
				datilografa(sleep,"Essa escolha far� com que voc� fique preso dentro do t�mulo. tente novamente.");
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
				"Ap�s ter que presenciar esta cena de Valdemort voltando a vida, voc� ter� que enfrentar ele e usar todas suas for�as! Mas antes disso, voc� precisa pensar bem nos seus pr�ximos passos.\n" +
						" Para onde seguir?");
		do {

			verificaVida();
			datilografa(sleep,
					"\n \n Norte - Ir para o norte do cemit�rio e tentar encontrar o calice. \n Local - Continuar no mesmo local e enfrentar Valdemort." +
							" \n  Sul -  Ir para o sul do cemit�rio e seguir o caminho do rio para chegar a uma cabana e se esconder.\n"
					+ "Juntar - Se juntar aos comensais da morte, afinal, voc� n�o conseguir� derrot�-los\n");

			datilografa(sleep,
					"Digite apenas a primeira palavra de acordo com seu proximo passo para conseguir realizar mais um desafio:\n");
			pass = input.next();

			System.out.println("\n");

			switch (pass.toUpperCase()) {
			case "LOCAL":
				datilografa(sleep,"Boa escolha! O duelo entre voc� est� prestes a come�ar ");

				xp = xp(xp);
				fase4QuintaPergunta();
				break;
			case "NORTE":
				datilografa(sleep,"Essa escolha far� com que o Voldemort te pegue, tente novamente.");
				vida = vida(vida, -1);
				break;
			case "JUNTAR":
				datilografa(sleep,"Essa escolha far� com que o Voldemort te pegue, tente novamente.");
				vida = vida(vida, -1);
				break;
			case "SUL":
				datilografa(sleep,"Essa escolha far� com que o Voldemort te pegue, tente novamente.");
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
				"\n \n Mas veja! Agora voc� � capaz de resistir ao feiti�o desta vez. Surpreso com sua resist�ncia para a Maldi��o,\n" +
						" Voldemort disparou outro feiti�o, e voc� sem pensar duas vezes: \n");

		do {
			verificaVida();
			datilografa(sleep,"\n Pedra - Se escondeu atr�s de uma pedra para desviar do feiti�o.\n"
					+ "Estatua - Se escondeu atr�s de uma est�tua para desviar do feiti�o.\n"
					+ "FEITICO - Bloqueia o feiti�o com outro feiti�o.\n "
					+ "Rastejar - Foi atingido pelo feiti�o e saiu rastejando tentando se esconde atr�s de uma pedra.\n");

			datilografa(sleep,
					"Digite apenas a primeira palavra de acordo com seu pr�ximo  passo para conseguir realizar mais um desafio:\n");
			pass = input.next();

			System.out.println("\n");

			switch (pass.toUpperCase()) {
			case "PEDRA":
				datilografa(sleep,"Uffa essa foi por pouco!");
				xp = xp(xp);
				fase4SextaPergunta();

				break;
			case "ESTATUA":
				datilografa(sleep,"Essa escolha far� com que Voldemort te pegue, tente novamente.");
				vida = vida(vida, -1);
				break;
			case "FEITICO":
				datilografa(sleep,"Essa escolha far� com que Voldemort te pegue, tente novamente.");
				vida = vida(vida, -1);
				break;
			case "RASTEJAR":
				datilografa(sleep,"Essa escolha far� com que Voldemort te pegue, tente novamente.");
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
				"No entanto, voc�, percebendo que n�o havia nenhuma maneira de escapar,\n" +
						" decidiu que, se ia morrer, iria morrer lutando, e n�o se encolhendo para longe e se escondendo. \n" +
						"Com isso, voc� saiu de tr�s da pedra para enfrentar Voldemort. Voc�s dois usaram dois feiti�os ao mesmo tempo, Valdemort usou o Expelliarmus.\n" +
						" Escolha seu feiti�o::\\n\\n\\n\"");

		do {

			verificaVida();

			datilografa(sleep,"\n \n Imperius - Imperius  \n " + "Expelliarmus - Expelliarmus \n"
					+ "Avada - Avada Kedavra \n" + "Leviosa - Leviosa  \n");

			datilografa(sleep,
					"Digite apenas a primeira palavra de acordo com seu pr�ximo passo para conseguir realizar mais um desafio:\n");
			pass = input.next();

			System.out.println("\n");
			switch (pass.toUpperCase()) {
			case "EXPELLIARMUS":
				datilografa(sleep,
						"No entanto, voc�, percebendo que n�o havia nenhuma maneira de escapar,\n" +
								" decidiu que, se ia morrer, iria morrer lutando, e n�o se encolhendo para longe e se escondendo. \n" +
								"Com isso, voc� saiu de tr�s da pedra para enfrentar Voldemort. \n " +
								"Voc�s dois usaram dois feiti�os ao mesmo tempo, Valdemort usou o Expelliarmus.\n" +
								" Escolha seu feiti�o::\\n\\n\\n\"");
				datilografa(sleep,
						"Parab�ns! Chegar aqui n�o foi uma tarefa f�cil, mas voc�, \n " +
								"como um f� de Harry Potter fez parecer tranquilo! Obrigada por jogar e espero que tenha se divertido!");
				xp = xp(xp);
				break;
			case "IMPERIUS":
				datilografa(sleep,"Essa escolha far� com que Voldemort te pegue, tente novamente.");

				vida = vida(vida, -1);
				break;
			case "AVADA":
				datilografa(sleep,"Essa escolha far� com que Voldemort te pegue, tente novamente.");
				vida = vida(vida, -1);
				break;
			case "LEVIOSA":
				datilografa(sleep,"Essa escolha far� com que Voldemort te pegue, tente novamente.");

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
			throw new UnsupportedOperationException("Op��o invalida!");
		}
	}

	static String showMenu() throws InterruptedException, IOException {
		System.err.println(
				"********************************\n************* MENU *************\n********************************");
		System.out.println("");
		datilografa(sleep, "1 - INSTRU��ES\n2 - JOGAR\n3 - RANKING\n4 - EXIT\nR = ");
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
			datilografa(sleep, "\nVOC� MORREU!\n");
			datilografa(sleep, "VOC� ALCAN�OU " + xp + " DE XP.");
			System.exit(0);
		}
	}
}
