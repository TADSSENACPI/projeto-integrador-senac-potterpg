package harry;

import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class harryPotter {

	static Scanner input = new Scanner(System.in);
	static int vida, xp, sleep = 5;
	static String modo;

	public static void main(String[] args) throws IOException, InterruptedException {

		vida = 3;
//
//		validaOpcoesMenu(showMenu());
		Fase2SegundaPergunta();

	}

	static void play() throws IOException, InterruptedException {

		Fase1PrimeiraPergunta();

	}

	public static void Fase1PrimeiraPergunta() throws IOException, InterruptedException {

		datilografa(sleep,
				"\nNeste inicio de torneio, voc� descobre que o obejtivo da primeira fase � recuperar um ovo\ndourado que est� sendo guardado por um drag�o."
						+ "\nO ovo est� localizado dentro de uma ninhada de drag�es reais. Cada um dos participantes vai ter que enfrentar um tipo de drag�oo para recuperar o ovo.\n"
						+ "\nAgora vamos sortear seu drag�o, pressione ENTER para prosseguir:");
		System.in.read();

		int sorteioDragao = new Random().nextInt(4);
		datilografa(sleep, "\nO n�mero " + sorteioDragao + " foi o n�mero sorteado para voc� seguir sua hist�ria.");

		if (sorteioDragao == 0) {
			datilografa(sleep, "Com isso o drag�o que você vai enfrentar � o Verde-Galês Comum.\n");
			datilografa(sleep,
					"Esta ra�a est� entre as que causam menos problemas (excetuando-se pela rara exceção do Incidente Ilfracombe)\n"
							+ "preferindo, como o Olho-de-Opala, caçar carneiros e se empenha para evitar os humanos, a não ser quando provocado.\n"
							+ "O verde-galês tem um urro surpreendentemente melodioso que é facilmente reconhecível.\n"
							+ "Suas labaredas saem em jorros finos e seus ovos são cor de terra, sarapintados de verde");
		} else if (sorteioDragao == 1) {
			datilografa(sleep, "Com isso o dragão que você vai enfrentar é o Meteoro-Chinês.\n");
			datilografa(sleep,
					"O Meteoro-Chinês é de cor escarlate, possui escamas macias e uma franja de pontas douradas em volta do focinho\n"
							+ "e olhos extremamente protuberantes. Pesa entra duas e quatro toneladas.\n"
							+ "É chamado de Meteoro por causa das esferas de fogo que solta pelas narinas quando enfurecido, que tomam o formato de cogumelos\n");
		} else if (sorteioDragao == 2) {
			datilografa(sleep, "Com isso o dragão que você vai enfrentar é o Focinho-Curto Sueco.\n");
			datilografa(sleep,
					"É uma das espécies mais perigosas, devido ao seu voo ágil e o fogo extremamente quente.\n"
							+ "O habitat natural dos Focinho-Curto suecos são as montanhas gélidas, um paraíso frio, porém admirável e muito bonito.\n"
							+ "Suas habilidades são voar, expelir chamas, couraça resistente a ácidos e queimaduras graves.");
		} else if (sorteioDragao == 3) {
			datilografa(sleep,
					"Com isso o dragão que você vai enfrentar é o Rabo-Córneo Húngaro.\nTem escamas negras, e aparência de lagarto. Ele também tem olhos amarelos, com pupilas verticais como as de um gato,\n"
							+ "chifres de bronze e picos coloridas semelhantes que se projetam a partir da sua longa cauda que ele usa em combate.\n"
							+ "O rugido do dragão é um grito estridente, e sua chama pode chegar a cerca de 15 metros.\n");
		}
		System.out.println("\n\nPRESSIONE ENTER PARA PROSEGUIR: ");
		System.in.read();
		clearConsole();
		Fase1SegundaPergunta();
	}

	public static void Fase1SegundaPergunta() throws InterruptedException, IOException {

		int alternativas = 4;
		String resposta[] = new String[alternativas], correctAnswer;
		datilografa(sleep, "Boa, agora vamos para o que interessa...\nAgora que você ja descobriu seu dragão,\n"
				+ "voce est� na arena, seu objetivo ao pegar o ovo, o dragao protege ele, seu dragão cospe fogo voce precisa se esconder.\n");

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
				Fase1TerceiraPergunta();
				break;
			case "CORREDOR":
			case "FICAR":
			case "CORRER":
				System.out.println("Essa escolha far� com oque o drag�o te coma.");
				vida = vida(vida, -1);

			}
		} while (correctAnswer.toUpperCase() != "ESCONDER");

	}

	public static void Fase1TerceiraPergunta() throws InterruptedException, IOException {

		String step;
		datilografa(sleep,
				"\nO drag�o est� cuspindo fogo na rocha. " + "Ela est� esquentando, presisamos tomar uma decis�o.\n");

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

				datilografa(sleep, "Isso ai, sua vassoura esta a caminho, suba nela e v� � adiante.\n");
				xp = xp(xp);
				Fase1QuartaPergunta();
				break;
			case "FICAR":
			case "CORRER":
			case "DIRECAO":
				if (vida > 0) {
					msg = "\nEssa escolha far� com que o drag�o te pegue, tente novamente.\n";
				} else if (vida <= 0) {
					msg = "";
				} else {
					msg = "";
				}
				datilografa(sleep, msg);
				vida = vida(vida, -1);
				xp();
			}

		} while (step.toUpperCase() != "VASSOURA");
	}

	public static void Fase1QuartaPergunta() throws InterruptedException, IOException {

		String pass;
		datilografa(sleep,
				"\nMais uma vez voc� pegou as dicas certas, continue...Voc� acaba de subir em sua vassoura m�gica e agora tem que matar o drag�o.\n"
						+ "Voc� come�a a fazer com que ele te siga,"
						+ "mas acaba caindo de cima da vassoura e a ela fica presa no telhado do castelo um pouco afastado de voc�, restando apenas:\n");
		int alternativas = 4;
		String resposta[] = new String[alternativas];
		resposta[0] = "\nEsconder\t| Se esconder at� o drag�o ir embora\n";
		resposta[1] = "Feitico\t\t| Fazer um feiti�o para a vassoura voltar para voc�.\n";
		resposta[2] = "Deslizar\t| Deslizar e pegar a vassoura.\n";
		resposta[3] = "Deixar\t\t| Deixar a vassoura l�.\n";
		datilografa(sleep, resposta[0] + resposta[1] + resposta[2] + resposta[3]);
		datilografa(sleep,
				"\nDigite apenas a primeira palavra de acordo com seu pr�ximo passo para conseguir realizar mais um desafio:\n");

		do {
			verificaVida();
			System.out.print("\nESCOLHA: ");
			pass = input.next();

			switch (pass.toUpperCase()) {
			case "DESLIZAR":
				datilografa(sleep, "Deslizou e pegou, agora voc� consegue seguir.\n");
				xp = xp(xp);
				Fase1QuintaPergunta();
				break;
			case "ESCONDER":
			case "FEITICO":
			case "DEIXAR":
				vida = vida(vida, -1);
				System.out.println("Essa escolha far� com que o drag�o te pegue, tente novamente.");
			}
		} while (pass.toUpperCase() != "DESLIZAR");
	}

	public static void Fase1QuintaPergunta() throws InterruptedException, IOException {

		String continues;
		datilografa(sleep,
				"\nContinue desse jeito, voc� não perde dica alguma...\nVocê acaba de pegar sua vassoura e começa a voar para se livrar novamente do dragão, você começa a procurar saídas em sua volta.\n\n"
						+ "No Leste você vê uma ponte com um espaço estreito para passar e o dragão não consegue passar ali se não vai bater e morrer.\n"
						+ "No oeste você olha e vê muita neblina, não sabe se é um caminho.\n "
						+ "Se olhar para o  norte você só consegue ir reto e não sabe onde vai parar.\n"
						+ "Se olhar para sul vai voltar para os castelos onde acabou de recuperar a vassoura.\n");
		int alternativas = 4;
		String resposta[] = new String[alternativas];

		resposta[0] = "\nNorte\t\t| Ir para o Norte\n";
		resposta[1] = "Sul\t\t| Ir para o Sul\n";
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
				Fase2PrimeiraPergunta();
				break;
			case "SUL":
			case "NORTE":
			case "OESTE":
				System.out.println("Essa escolha fará com que o drag�o de pegue, tente novamente.");
				vida = vida(vida, -1);
			}
		} while (continues.toUpperCase() != "LESTE");

	}

	public static void Fase2PrimeiraPergunta() throws InterruptedException, IOException {

		String resposta;

		datilografa(sleep,
				"Parabens !!! Voc� conseguiu o Ovo do drag�o ... Agora � hora de descansar, estamos perto do baile de natal, at� mais, bravo guerreiro...\n");
		clearConsole(0);
		datilografa(sleep,
				"Parece que Cedrico quer retribuir o favor que voc� fez a ele no desafio dos drag�es, ele quer falar algo...\n");

		datilografa(sleep,
				"Cedrico: Sabe o Banheiro dos monitores no 5� Piso ? � um bom lugar para um banho... Leve seu ovo e ilumine um pouco as coisas em baixo da �gua quente...");

		datilografa(sleep,
				"\nCedrico te deu uma dica, e agora, o que faremos? Voc� est� no 4� andar da escola, Ao Sul est� a Biblioteca,voc� pode tentar procurar mais sobre o ovo nos livros. a norte voc� pode ver o Sal�o Principal, a Oeste tem uma escada que d� acesso ao banheiro do 5� Piso, a oeste tem uma escada que d� acesso ao 3� Piso...");

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
								+ "Mas cuidado viu, pode ter seres estranhos l�... \n");
				xp = xp(xp);
				Fase2SegundaPergunta();
			} else {
				datilografa(sleep, "Digite uma das op��es v�lidas!");
			}
			resposta = resposta.trim();
		} while (!resposta.equalsIgnoreCase("Oeste"));

	}

	public static void Fase2SegundaPergunta() throws InterruptedException, IOException {

		String resposta;

		clearConsole(0);
		datilografa(sleep,
				"\nQue barulho � esse? Parece que o Ovo tem uma musica que s� se escuta em baixo d'�gua: \n" + "\n"
						+ "	Onde ouvir da nossa vor o tom" + "\n" + "	na superficie n�o h� som " + "\n"
						+ "	Durante uma hora deve buscar" + "\n" + "	E o que quer vai encontrar \n" + "\n"
						+ "Nossa!! Parece o canto dos Sereianos... " + "\n"
						+ "Vamos!! voc� s� tem algumas horas para 2� tarefa...\n");

		datilografa(sleep, "Oh n�o! Parece que voc� dormiu...");
		datilografa("\n\n	TECLE ENTER PARA ACORDAR!");
		clearConsole();
		datilografa(sleep, "\nEst� na hora da 2� tarefa!!! " + "\n"
				+ "\nVoc� precisa encontrar seu amigo Ronald no fundo do Lago Negro e voc� s� tem uma hora para isso..."
				+ "\nAllastor Olho-Tonto te entregou um guelrricho, vai te ajudar na procura, coma r�pido!!");
		datilografa(sleep, "Seus oponentes sairam na sua frente, nadaram rapidamente para o norte... "
				+ "\n Cuidado para n�o se perder no caminho, lembre-se, seu objetivo � salvar o que voc� ama, seu amigo...");

		do {
			verificaVida();
			datilografa(sleep, "\nOnde voc� quer procurar? Selecione para qual lado voc� quer ir:\n\nNorte\t\t| Ir para o Norte.\nSul\t\t| Ir para o Sul.\nLeste\t\t| Ir para o Leste.\nOeste\t\t| Ir para o Oeste.");
			datilografa("\n\nESCOLHA: ");
			resposta = input.next();
			resposta = resposta.toUpperCase();
			resposta = resposta.trim();

			if (resposta.equals("NORTE")) {
				System.out.println(
						"Isso! Seus advers�rios podem dar boas pistas de onde seguir, agora vamos atr�s do Rony! ");
				xp = xp(xp);
				Fase2TerceiraPergunta();
				break;
			} else if (resposta.equals("SUL")) {
				System.out.println(
						"Ir ao contr�rio da maioria nesse caso pode te atrapalhar, talvez eles saibam um caminho diferente do que voc� imaginou... ");
				vida = vida(vida, -1);
			} else if (resposta.equals("LESTE")) {
				System.out.println("Por ai n�o, s� tem barreiras que pode te atrapalhar..");
				vida = vida(vida, -1);
			} else if (resposta.equals("OESTE")) {
				System.out.println("\n" + "N�o parece ser o melhor local, acho que voc� s� vai perder tempo... ");
				vida = vida(vida, -1);
			} else {
				System.out.println("Digite uma resposta v�lida");
			}

		} while (!resposta.equals("Norte"));

	}

	public static void Fase2TerceiraPergunta() throws InterruptedException, IOException {

		String resposta;

		datilografa(sleep,
				"Parece que j� estou vendo um sereiano e ao lado dele parece que � o... RONY !!! Vamos atr�s dele!!");
		datilografa(sleep,
				"Droga, parece que seus 2 advers�rios foram mais r�pido que voc� e j� cumpriram o objetivo, por�m Rony n�o est� sozinho, tem outra pessoa desmaiada ao lado dele..."
						+ "\nParece que � a Gabrielle, irm� de Fleur, seu oponente, ele n�o vai conseguir completar a prova pois teve problema com os Grindylows, os diabos marinhos, voc� vai deixar ela sozinha ? "
						+ "\nLembre-se n�o � somente cumprir a prova para ganhar o torneio tribruxo, para ser um verdadeiro Bruxo precisamos de mais...");

		datilografa(sleep,
				"O que voc� quer fazer agora? \n\nA) Salvar Rony \nB) Salvar Rony e Gabrielle \nC) Desistir do Torneio");
		do {
			verificaVida();
			datilografa(sleep, "\n\nESCOLHA: ");
			resposta = input.next();

			if (resposta.equalsIgnoreCase("A")) {
				datilografa(sleep,
						"\nVoc� conseguiu salvar Rony por�m chegou em 3� lugar, n�o h� mais chances de ganhar o Torneio... ");
				vida = vida(vida, -1);
			} else if (resposta.equalsIgnoreCase("B")) {
				datilografa(sleep,
						"\nParab�ns!! Tenho certeza que os juizes levar�o em conta sua bravura e compaix�o, como um verdadeiro bruxo, agora vamos terminar o desafio!\n");
				xp = xp(xp);
				Fase2QuartaPergunta();
				/**
				 * ATEN��O NESSA CONDI��O
				 */
			} else if (resposta.equals("C")) {
				datilografa(sleep, "\nPuxa, uma pena voc� n�o querer continuar...");
				vida = vida(vida, -1);
			} else {
				datilografa(sleep, "\nDigite uma resposta v�lida!");

			}

		} while (!resposta.equalsIgnoreCase("B"));

	}

	public static void Fase2QuartaPergunta() throws InterruptedException, IOException {

		String resposta;

		datilografa(sleep, "O que � isso ? "
				+ "\nAh n�o, s�o os Grindylows e eles n�o querem deixar voc� levar a irm� de Fleur, o que faremos agora?");

		datilografa(sleep,
				"\n\nA)Soltar um feiti�o nos Grindylows e se libertar deles." + "\nB)Desistir de levar Gabrielle.\n");

		do {
			verificaVida();
			datilografa(sleep, "\nESCOLHA: ");
			resposta = input.next();

			if (resposta.equalsIgnoreCase("A")) {
				datilografa(sleep,
						" Bravo nobre bruxo ! Voc� chegou em 3� lugar por�m os ju�zes viram sua dedica��o e companheirismo e como forma de bonifica��o te beneficiaram com o 2� lugar "
								+ "\nVoc� passou de fase !!");
				xp = xp(xp);
				fase3PrimeiraPergunta();

			} else if (resposta.equalsIgnoreCase("B")) {
				datilografa(sleep,
						"Voc� conseguiu salvar Rony por�m chegou em 3� lugar, n�o h� mais chances de ganhar o Torneio... ");
				vida = vida(vida, -1);
			} else {
				datilografa(sleep, "Digite uma resposta v�lida");
			}

		} while (!resposta.equalsIgnoreCase("A"));

	}

	public static void fase3PrimeiraPergunta() throws InterruptedException, IOException {
		datilografa(sleep, "\t\tBEM VINDO A FASE 3!\n\n"
				+ "Parabens voce chegou at� aqui, ao passar do lago, voce agora tem um novo desafio! para ser o campeao"
				+ " tribuxo voce precisa passar pelo labirinto e pegar o calice." + "\n"
				+ "Todos os participantes incluindo voce entram no labirinto e comecam a tentar encontrar o caminho certo."
				+ "\n");
		datilografa(sleep, "\nTECLE ENTER PARA CONTINUAR: ");
		clearConsole();
		String alternativa;

		datilografa(sleep,
				"\nVoce esta no meio do labirinto, derrepente houve um barulho de gritos, voce corre para "
						+ "ver o que aconteceu, voce ve uma competidora desmaiada. " + "\n"
						+ "Por causa de victor crum outro adversario, ela esta� sendo sugada pelo labirinto voce pode :"
						+ "\n\nA) Tenta soltar com as maos impedir que ela seja sugada." + "\n"
						+ "B) Joga um feitico na parede \n"
						+ "C) Jogar um feitico de localizacao para os professores dela virem.\n"
						+ "D) Não faz nada. Deixa ela la�.\n" + "E) Gritar pedindo ajuda para outro competidor.");
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

				datilografa(sleep, "Por essa atitude ela morreu e você foi desclassificado.\n");
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
		System.out.println("Ao jogar o feitico  de localizacao  o labirinto comeca a " + "fechar  voce comeca a correr."
				+ "\n" + "Voce percebe que tem dois competidores brigando com suas varinhas, "
				+ "um dele estao enfeiticado," + "cedrico ganha dele , \nentretando depois de ter derrotado ele, "
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

				System.out.println("Voce dois foram desclassificados por matar.");
				vida = vida(vida, -1);

			} else if (alternativa.equalsIgnoreCase("B")) {

				System.out.println("Voce foi  desclassificados por matar.");

				vida = vida(vida, -1);
			} else if (alternativa.equalsIgnoreCase("C")) {

				System.out.println("Muito bem agora voces podem prosseguir.");
				xp = xp(xp);
				fase3TerceiraPergunta();
				break;

			} else if (alternativa.equalsIgnoreCase("D")) {

				System.out.println("Voc� precisava do Cedrico para continuar.");

				vida = vida(vida, -1);
			} else {
				System.out.println("Digite um valor v�lido!");
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
				+ "D) Salva cedrico com um feitico nas plantas, tirando ele de lá" + "\n"
				+ "E) Se oferece como distracao para que ele escape.");
		do {
			verificaVida();
			datilografa(sleep, "\n\nESCOLHA: ");
			alternativa = input.next();

			if (alternativa.equalsIgnoreCase("a")) {

				System.out.println("por sua causa cetrico morreu voce precisava dele");

				vida = vida(vida, -1);
			} else if (alternativa.equalsIgnoreCase("B")) {

				System.out.println("nesse caso o labirinto estava muito mais agressivo e cetrico morreu, "
						+ "voce precisava dele");

				vida = vida(vida, -1);
			} else if (alternativa.equalsIgnoreCase("C")) {

				System.out.println("por sua causa cetrico morreu voce precisava dele");
				xp = xp(xp);
				fase3QuartaPergunta();
				break;
			} else if (alternativa.equalsIgnoreCase("D")) {

				System.out.println("muito bem, sempre se salva um amigo");

				vida = vida(vida, -1);
			} else if (alternativa.equalsIgnoreCase("E")) {

				System.out.println("Cetrico conseguiu escapar mas voce morreu.");

				vida = vida(vida, -1);
			} else {
				System.out.println("digite um valor valido");
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
			datilografa(sleep, "\n\nESCOLHA: ");
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
				Fase4PrimeiraPergunta();
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

	public static void Fase4PrimeiraPergunta() throws InterruptedException, IOException {
		String step;

		datilografa(sleep, "Parab�ns, voc� conseguiu superar todos os desafios!\n");
		datilografa(sleep, "TECLE ENTER PATA CONTINUAR: ");
		clearConsole();
		datilografa(sleep,
				"Harry e seu amigo Cedrico chegam em Little Hangleton. Mas... espere... Aquele n�oo � o... RABICHO?.\n"
						+ "E ele est� estranho... Ele foi enfeitiçado pelo Valdemort e est� usando um feiti�o contra Cedrico, oque voc� ira fazer?\n");

		datilografa(sleep,
				"Digite apenas a primeira palavra de acordo com seu próximo passo para conseguir realizar mais um desafio:\n");

		do {
			datilografa(sleep, "\nEsconder\t\t| Se esconder e esperar Rabicho usar a maldi��o da morte Avada Kedavra.");
			datilografa(sleep, "\nFeitico\t\t| Utilizar um feiti�o contra o Rabicho.");
			datilografa(sleep, "\nEsconder\t\t| Se esconder do Rabicho.");
			datilografa(sleep, "\nCorrer\t\t| Correr em dire��o ao Rabicho e tirar a varinha m�gica dele.\n");

			step = input.next();
			System.out.println("\n");

			switch (step.toUpperCase()) {
			case "ESCONDER":
				datilografa(sleep,
						"Infelizmente essa opção acabou matando Cedrico... E você foi preso pelo Rabicho no túmulo de Tom Riddle Sr..\n");
				break;
			case "FEITIÇO":
				datilografa(sleep,
						"Essa escolha fará com que o Rabicho consiga usar um feitiço e te matar. Tente novamente.");
				break;
			case "ESC":
				datilografa(sleep,
						"Essa escolha fará com que o Rabicho consiga usar um feitiço e te matar. Tente novamente.");
				break;
			case "CORRER":
				datilografa(sleep,
						"Essa escolha fará com que o Rabicho consiga usar um feitiço e te matar. Tente novamente.");
				break;
			default:
				System.out.println("Escolha uma resposta v�lida.");
			}
		} while (step.equalsIgnoreCase("ESCONDER"));
	}

	public static void Fase4SegundaPergunta() {
		// String second
		String pass;
		int i = 1;
		System.out.println("Agora que chegou até aqui, deverá encontrar uma forma de sair do túmulo.\n"
				+ "Mas... como vocêdeverá sair dele?\n");

		do {
			System.out.println(
					"Cavar - Cavar por dentro do tumulo onde está escondido. \n Aceitar - Aceitar que o Rabicho colete o seu sangue, um osso desenterrado do túmulo do Riddle e uma de suas próprias mãos. \n"
							+ "Feitiço -  Utilizar um feitiço para que se teletransporte para outro lugar.\n Esperar - Esperar Rabicho aparecer, jogá-lo dentro do túmulo e trancar ele lá dentro");
			System.out.println(
					"Digite apenas a primeira palavra de acordo com seu próximo passo para conseguir realizar mais um desafio:\n");
			pass = input.next();

			System.out.println("\n");

			switch (pass.toUpperCase()) {
			case "ACEITAR":
				System.out.println(
						"Oh não! Essa opção fez com que Valdemort tenha seu corpo regenerado! Ele agora está mais poderoso do que nunca! Valdemort pegou sua varinha e, através da Marca Negra no braço de Pettigrew, convocou os Comensais da Morte.\n\n\n");
				break;
			case "ESCONDER":
				System.out.println("Essa escolha fará com que você fique preso dentro do túmulo. tente novamente.");
				i++;
				break;
			case "FEITIÇO":
				System.out.println("Essa escolha fará com que você fique preso dentro do túmulo. tente novamente.");
				i++;
				break;
			case "DEIXAR":
				System.out.println("Essa escolha fará com que você fique preso dentro do túmulo. tente novamente.");
				i++;
				break;
			default:
				System.out.println("Escolha uma resposta válida.");
			}
		} while (i <= 3 && !(pass.equalsIgnoreCase("ACEITAR")));
		{
			if (i > 3) {
				System.out.println("Você perdeu todas as suas vidas. FIM DE JOGO.");
				System.exit(i);
			}
		}
	}

	public static void Fase4TerceiraPergunta() {
		String pass;
		int i = 1;
		System.out.println(
				"Após ter que precensiar esta cena de valdemort voltando a vida, você terá que enfrentar ele e usar todas suas forças! Mas antes disso, você precisa pensar bem nos seus próximos passos. Para onde seguir?\n");
		do {
			System.out.println(
					"Norte - Ir para o norte do cemitério e tentar encontrar a saída. \n Local - Continuar no mesmo local e enfrentar Valdemort. \n  Sul -  Ir para o sul do cemitério e seguir o caminho do rio para chegar a uma cabana e se esconder.\n"
							+ "Juntar - Se juntar aos comensais da morte, afinal, você não conseguirá derrotá-los\n");

			System.out.println(
					"Digite apenas a primeira palavra de acordo com seu próximo passo para conseguir realizar mais um desafio:\n");
			pass = input.next();

			System.out.println("\n");

			switch (pass.toUpperCase()) {
			case "LOCAL":
				System.out.println("Boa escolha! O duelo entre vocês está prestes a começar! ");
				break;
			case "NORTE":
				System.out.println("Essa escolha fará com que o Voldemort te pegue, tente novamente.");
				i++;
				break;
			case "JUNTAR":
				System.out.println("Essa escolha fará com que o Voldemort te pegue, tente novamente.");
				i++;
				break;
			case "SUL":
				System.out.println("Essa escolha fará com que o Voldemort te pegue, tente novamente.");
				i++;
			default:
				System.out.println("Escolha uma resposta válida.");
			}
		} while (i <= 3 && !(pass.equalsIgnoreCase("LOCAL")));
		{
			if (i > 3) {
				System.out.println("Você perdeu todas as suas vidas. FIM DE JOGO.");
				System.exit(i);
			}
		}
	}

	public static void Fase4QuartaPergunta() {
		// String fourth
		String pass;
		int i = 1;
		System.out.println(
				"Sendo assim, Valdemort ordenou Rabicho a dar-lhe uma varinha. Ele ordenou que você se curve diante dele, o que você faz:\n\n\n");
		do {
			System.out.println(
					"Obedecer - Obedece o Valdemort afinal, está sendo controlado pelo feitiço.\n Não - Não obedece os comandos do Valdemort pois você não o respeita como um mestre a ser seguido.\n Feitiço - Você lança um feitiço contra Valdemort, matando ele.\n Correr - Você sai correndo pelo cemitério para fugir dele e de todos os comensais da morte\n");

			System.out.println(
					"Digite apenas a primeira palavra de acordo com seu próximo passo para conseguir realizar mais um desafio:\n");
			pass = input.next();

			System.out.println("\n");

			switch (pass.toUpperCase()) {
			case "OBEDECER":
				System.out.println("Sim... infelizmente você teve que obedecer aos comandos dele...");
				break;
			case "NÃO":
				System.out.println("Essa escolha fará com que Voldemort te pegue, tente novamente.");
				i++;
				break;
			case "FEITIÇO":
				System.out.println("Essa escolha fará com que Voldemort te pegue, tente novamente.");
				i++;
				break;
			case "CORRER":
				System.out.println("Essa escolha fará com que Voldemort te pegue, tente novamente.");
				i++;
				break;
			default:
				System.out.println("Escolha uma resposta válida.");
			}
		} while (i <= 3 && !(pass.equalsIgnoreCase("OBEDECER")));
		{
			if (i > 3) {
				System.out.println("Você perdeu todas as suas vidas. FIM DE JOGO.");
				System.exit(i);
			}
		}
	}

	public static void Fase4QuintaPergunta() {
//		  String fifth
		String pass;
		int i = 1;
		System.out.println(
				"Mas veja! Agora você é capaz de resistir ao feitiço desta vez. Surpreso com sua resistência para a Maldição, Voldemort disparou outro feitiço, e você sem pensar duas vezes: \n\n\n");

		do {
			System.out.println("Pedra - Se escondeu atrás de uma pedra para desviar do feitiço.\n"
					+ "Estátua - Se escondeu trás de uma estátua para desviar do feitiço.\n"
					+ "Feitiço - Bloqueia o feitiço com outro feitiço.\n "
					+ "Rastejar - Foi atingido pelo feitiço e saiu rastejando tentando se esconde atrás de uma pedra.\n");

			System.out.println(
					"Digite apenas a primeira palavra de acordo com seu próximo passo para conseguir realizar mais um desafio:\n");
			pass = input.next();

			System.out.println("\n");

			switch (pass.toUpperCase()) {
			case "PEDRA":
				System.out.println("Uffa essa foi por pouco!");
				break;
			case "ESTATUA":
				System.out.println("Essa escolha fará com que Voldemort te pegue, tente novamente.");
				i++;
				break;
			case "FEITIÇO":
				System.out.println("Essa escolha fará com que Voldemort te pegue, tente novamente.");
				i++;
				break;
			case "RASTEJAR":
				System.out.println("Essa escolha fará com que Voldemort te pegue, tente novamente.");
				i++;
				break;
			default:
				System.out.println("Escolha uma resposta válida.");
			}
		} while (i <= 3 && !(pass.equalsIgnoreCase("PEDRA")));
		{
			if (i > 3) {
				System.out.println("Você perdeu todas as suas vidas. FIM DE JOGO.");
				System.exit(i);
			}
		}
	}

	public static void Fase4SextaPergunta() {
		String pass;
		int i = 1;
		System.out.println(
				"No entanto, você, percebendo que não havia nenhuma maneira de escapar, decidiu que, se ia morrer, iria morrer lutando, e não se encolhendo para longe e se escondendo. Com isso, você saiu de trás da pedra para enfrentar Voldemort. Vocês dois usaram dois feitiços ao mesmo tempo, Valdemort usou o Expelliarmus. Escolha seu feitiço::\n\n\n");

		do {
			System.out.println("Imperius - Imperius  \n " + "Expelliarmus - Expelliarmus \n"
					+ "Avada - Avada Kedavra \n" + "Leviosa - Leviosa  \n");

			System.out.println(
					"Digite apenas a primeira palavra de acordo com seu próximo passo para conseguir realizar mais um desafio:\n");
			pass = input.next();

			System.out.println("\n");
			switch (pass.toUpperCase()) {
			case "EXPELLIARMUS":
				System.out.println(
						"Após as varinhas colidirem e vocÊ conseguir o dominio dos feitiços, ele usou um Feitiço de Convocação para pegar a Chave de Portal e aparecer de volta a Hogwarts, segurando o cadáver de Diggory...");
				System.out.println(
						"Parabéns! Chegar aqui não foi uma tarefa fácil, mas você, como um fã de Harry Potter, foi fácil chegar até aqui!Obrigada por jogar e espero que tenha se divertido!");
				break;
			case "IMPERIUS":
				System.out.println("Essa escolha fará com que Voldemort te pegue, tente novamente.");
				i++;
				break;
			case "AVADA":
				System.out.println("Essa escolha fará com que Voldemort te pegue, tente novamente.");
				i++;
				break;
			case "LEVIOSA":
				System.out.println("Essa escolha fará com que Voldemort te pegue, tente novamente.");
				i++;
				break;
			default:
				System.out.println("Escolha uma resposta valida.");
			}
		} while (i <= 3 && !(pass.equalsIgnoreCase("EXPELLIARMUS")));
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
