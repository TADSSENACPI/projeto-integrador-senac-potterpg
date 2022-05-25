package harry;

import java.util.Random;
import java.util.Scanner;

public class harryPotter {

	static Scanner input = new Scanner(System.in);
	static int vida;
	static int xp;

	public static void main(String[] args) {

		do {
			vida = 3;
			play();
		} while (vida > 0);
		System.out.println("XP\t: " + xp);
	}

	static void play() {
		System.out
				.println("Neste inicio de torneio, voce descobre que o objetivo da primeira fase e recuperar um ovo\n"
						+ "dourado que esta sendo guardado por um dragao.\nO ovo seria localizado dentro de uma ninhada de ovos "
						+ "de dragoes reais.");
		System.out.println("Cada um dos partcipantes vai ter que enfrentar um tipo de dragao para recuperar o ovo.\n");

		System.out.println(
				"Agora vamos sortear seu comeco, pressione qualquer letra e depois pressione Enter para prosseguir:\n");
		String dragon = input.next();

		Fase1PrimeiraPergunta(dragon);

		System.out.println("Boa, agora vamos para o que interessa...\n\n Agora que voce ja descobriu seu dragao,\n"
				+ "voce esta na arena, seu objetivo e pegar o ovo, o dragao protege ele, seu dragao cospe fogo voce precisa se esconder.\n");

		Fase1SegundaPergunta(dragon);
		Fase1TerceiraPergunta(dragon);
		Fase1QuartaPergunta(dragon);
		Fase1QuintaPergunta(dragon);

		Fase2PrimeiraPergunta();
		Fase2SegundaPergunta();
		Fase2TerceiraPergunta();
		Fase2QuartaPergunta();

		Fase3PrimeiraPergunta();
		Fase3SegundaPergunta();
		Fase3TerceiraPergunta();
		Fase3QuartaPergunta();

		Fase4PrimeiraPergunta();
		Fase4SegundaPergunta();
		Fase4TerceiraPergunta();
		Fase4QuartaPergunta();
		Fase4QuintaPergunta();
		Fase4SextaPergunta();
	}

	public static void Fase1PrimeiraPergunta(String dragon) {
		int dragons[] = { 0, 1, 2, 3 };
		int sorteioDragao = new Random().nextInt(4);
		System.out.println("O numero  " + sorteioDragao + " foi o numero sorteado para voce seguir sua historia.");
		if (sorteioDragao == 0) {
			System.out.println("Com isso o dragao que voce vai enfrentar e o Verde-Gales Comum.\n");
			System.out.println(
					"Esta raca esta entre as que causam menos problemas (excetuando-se pela rara excecao do Incidente Ilfracombe)\n"
							+ "preferindo, como o Olho-de-Opala, cacar carneiros e se empenha para evitar os humanos, a nao ser quando provocado.\n"
							+ "O verde-gales tem um urro surpreendentemente melodioso que e facilmente reconhecivel.\n"
							+ "Suas labaredas saem em jorros finos e seus ovos sao cor de terra, sarapintados de verde");
		} else if (sorteioDragao == 1) {
			System.out.println("Com isso o dragao que voce vai enfrentar � o Meteoro-Chines.\n");
			System.out.println(
					"O Meteoro-Chines e de cor escarlate, possui escamas macias e uma franja de pontas douradas em volta do focinho\n"
							+ "e olhos extremamente protuberantes. Pesa entra duas e quatro toneladas.\n"
							+ "� chamado de Meteoro por causa das esferas de fogo que solta pelas narinas quando enfurecido, que tomam o formato de cogumelos\n");
		} else if (sorteioDragao == 2) {
			System.out.println("Com isso o dragao que voc� vai enfrentar e o Focinho-Curto Sueco.\n");
			System.out
					.println("E uma das especies mais perigosas, devido ao seu voo agil e o fogo extremamente quente.\n"
							+ "O habitat natural dos Focinho-Curto suecos sao as montanhas gelidas, um paraiso frio, porem admiravel e muito bonito.\n"
							+ "Suas habilidades sao voar, expelir chamas, coura�a resistente a acidos e queimaduras graves.\n");
		} else if (sorteioDragao == 3) {
			System.out.println("Com isso o dragao que voce vai enfrentar e o Rabo-Corneo Hungaro.\n");
			System.out.println(
					"Tem escamas negras, e aparencia de lagarto. Ele tambem tem olhos amarelos, com pupilas verticais como as de um gato,\n"
							+ "chifres de bronze e picos coloridas semelhantes que se projetam a partir da sua longa cauda que ele usa em combate.\n"
							+ "O rugido do dragao e um grito estridente, e sua chama pode chegar a cerca de 15 metros.\n");
		}
	}

	public static void secondStep(String second) {
		Scanner input = new Scanner(System.in);

		System.out.println("Boa, agora vamos para o que interessa...\n\nAgora que voce ja descobriu seu dragao,\n"
				+ "voce esta na arena, seu objetivo e pegar o ovo, o drag�o protege ele, seu dragao cospe fogo voce precisa se esconder.\n");

		String correctAnswer;
		int i = 1;

		int alternativas = 4;
		String resposta[] = new String[alternativas];
		resposta[0] = "Esconder-Se esconder nas pedras.\n";
		resposta[1] = "Corredor-Correr no corredor.\n";
		resposta[2] = "Ficar-Ficar pulando em cima das pedras.\n";
		resposta[3] = "Correr-Correr ate o ovo.\n";

		do {

			System.out.println(resposta[0] + resposta[1] + resposta[2] + resposta[3]);
			System.out.println("\n");
			System.out.println(
					"Digite apenas a primeira palavra de acordo com seu proximo passo para conseguir realizar mais um desafio:");
			correctAnswer = input.next();

			System.out.println("\n");

			switch (correctAnswer.toUpperCase()) {
			case "ESCONDER":
				System.out.println("Voce se escondeu nas pedras, voce esta seguro agora.\n\n\n");
				break;
			case "CORREDOR":
			case "FICAR":
			case "CORRER":
				System.out.println("Essa escolha fara com que o dragao te pegue.\n");
				i++;

			}
		} while (i <= 3 && !(correctAnswer.equalsIgnoreCase("ESCONDER")));
		{

			if (i > 3) {
				System.out.println("Voce perdeu todas as suas vidas. FIM DE JOGO.");
				System.exit(i);
			}
		}
	}

	public static void thirdStep(String third) {
		Scanner input = new Scanner(System.in);
		String step;
		int i = 1;
		System.out.println(
				"BOAAAAAAAAA, voce e fera....Voce se escondeu nas pedras, o dragao esta cuspindo fogo na pedra em que voce esta.\n"
						+ "A pedra esta esquentando voce precisa tomar uma decisao.\n\n");
		int alternativas = 4;
		String resposta[] = new String[alternativas];
		resposta[0] = "Ficar-Ficar na pedra, pois ela nao esquentara muito.\n";
		resposta[1] = "Correr-Correr para outra pedra.\n";
		resposta[2] = "Dire��o-Ir em direcao ao ovo.\n";
		resposta[3] = "Vassoura-Chamar uma vassoura para voar.\n";
		do {
			System.out.println(resposta[0] + resposta[1] + resposta[2] + resposta[3]);
			System.out.println("\n");
			System.out.println(
					"Digite apenas a primeira palavra de acordo com seu proximo passo para conseguir realizar mais um desafio:");
            step = input.next();
            
			System.out.println("\n");

			switch (step.toUpperCase()) {
			case "VASSOURA":
				System.out.println("Isso ai, sua vassoura esta a caminho, suba nela e va adiante.\n\n\n");
				break;
			case "FICAR":
			case "CORRER":
			case "DIRE��O":
				System.out.println("Essa escolha fara com que o dragao de pegue, tente novamente.");
				i++;
			}
		} while (i <= 3 && !(step.equalsIgnoreCase("VASSOURA")));
		{
			if (i > 3) {
				System.out.println("Voce perdeu todas as suas vidas. FIM DE JOGO.");
				System.exit(i);
			}
		}
	}

	public static void fourthStep(String fourth) {
		Scanner input = new Scanner(System.in);
		String pass;
		int i = 1;
		System.out.println(
				"Mais uma vez voc� pegou as dicas certas, continue..Voce acaba de subir em sua vassoura magica e agora tem que matar o dragao.\n"
						+ "Voce comeca a fazer com que ele te siga,"
						+ "mas acaba caindo de cima da vassoura e sua vassoura ficar presa em um telhado um pouco afastado de voce. Voce pode:\n");
		int alternativas = 4;
		String resposta[] = new String[alternativas];
		resposta[0] = "Esconder-Se esconder ate o drag�o ir embora\n";
		resposta[1] = "feitico-Fazer um feitico para a vassoura voltar para voce.\n";
		resposta[2] = "Deslizar-Deslizar e pegar a vassoura.\n";
		resposta[3] = "Deixar-Deixar a vassoura la.\n";
		do {
			System.out.println(resposta[0] + resposta[1] + resposta[2] + resposta[3]);
			System.out.println("\n");
			System.out.println(
					"Digite apenas a primeira palavra de acordo com seu proximo passo para conseguir realizar mais um desafio:\n");
			pass = input.next();

			System.out.println("\n");

			switch (pass.toUpperCase()) {
			case "DESLIZAR":
				System.out.println("Deslizou e pegou, agora voce consegue seguir.\n\n\n");
				break;
			case "ESCONDER":
			case "FEITI�O":
			case "DEIXAR":
				System.out.println("Essa escolha fara com que o drag�o de pegue, tente novamente.");
				i++;
			}
		} while (i <= 3 && !(pass.equalsIgnoreCase("DESLIZAR")));
		{
			if (i > 3) {
				System.out.println("Voce perdeu todas as suas vidas. FIM DE JOGO.");
				System.exit(i);
			}
		}
	}

	public static void fifthStep(String fifth) {
		Scanner input = new Scanner(System.in);
		String continues;
		int i = 1;
		System.out.println(
				"Continue desse jeito, voce nao perde dica alguma...\nVoce acaba de pegar sua vassoura e comeca a voar para se livrar novamente do dragao, voce come�a a procurar saidas em sua volta.\n\n"
						+ "No Leste voce ve uma ponte com um espa�o estreito para passar e o drag�o n�o consegue passar ali se nao vai bater e morrer.\n"
						+ "No oeste voce olha e ve muita neblina, nao sabe se e um caminho.\n"
						+ "Se olhar para o  norte voce so consegue ir reto e nao sabe onde vai parar.\n"
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
					"Digite uma saida de acordo com seu proximo passo para conseguir realizar mais um desafio:\n");
			continues = input.next();

			System.out.println("\n");

			switch (continues.toUpperCase()) {
			case "LESTE":
				System.out.println(
						"Nessa voce foi maldoso em hahaha, porem era a coisa certa a se fazer, siga em frente.\n\n\n");
				break;
			case "SUL":
			case "NORTE":
			case "OESTE":
				System.out.println("Essa escolha far� com que o dragao de pegue, tente novamente.");
				i++;
			}
		} while (i <= 3 && !(continues.equalsIgnoreCase("LESTE")));
		{

			if (i > 3) {
				System.out.println("Voce perdeu todas as suas vidas. FIM DE JOGO.");
				System.exit(i);
			}
		}

	}

	public static void Fase2PrimeiraPergunta() {

		String resposta;

		System.out.println(
				"Parabens !!! Voc� conseguiu o Ovo do dragao .... Agora é hora de descansar, estamos perto do baile de natal, at� mais, bravo guerreiro...\n");
		do {
			System.out.println(
					"Parece que Cedrico quer retribuir o favor que voc� fez a ele no desafio dos drag�es, ele quer falar algo..."
							+ "\n");

			System.out.println(
					"Cedrico: Sabe o Banheiro dos monitores no 5� Piso ? � um bom lugar para um banho... Leve seu ovo e ilumine um pouco as coisas em baixo da �gua quente...");

			System.out.println(
					"  \nCedrico te deu uma dica, e agora, o que faremos? Voc� est� no 4� andar da escola, Ao Sul est� a Biblioteca,voc� pode tentar procurar mais sobre o ovo nos livros. a norte voc� pode ver o Sal�o Principal, a Oeste tem uma escada que d� acesso ao banheiro do 5� Piso, a oeste tem uma escada que d� acesso ao 3� Piso...");

			System.out.println("\nNorte \nSul \nLeste \nOeste \nSelecione uma das op��es:");

			resposta = input.next();

			if (resposta.equalsIgnoreCase("Norte")) {
				System.out.println(" Sal�o principal ? N�o parece ser o melhor lugar para se tomar um banho!  ");

			} else if (resposta.equalsIgnoreCase("Sul")) {
				System.out.println(" � para lavar seu ovo, n�o para ler para ele!");

			} else if (resposta.equals("Leste")) {
				System.out.println("N�o � o melhor lugar para ir...");

			} else if (resposta.equalsIgnoreCase("Oeste")) {
				System.out.println(
						"Boa ! Agora siga o conselho que Cedrico te deu e tome um banho com seu ovo no banheiro dos monitores... Mas cuidado viu, pode ter seres estranhos l�... ");
			} else {
				System.out.println("Digite uma das op��es v�lidas");
			}

		} while (!resposta.equalsIgnoreCase("Oeste"));

	}

	public static void Fase2SegundaPergunta() {

		String resposta;

		System.out
				.println(" Que barulho � esse ? Parece que o Ovo tem uma musica que s� se escuta em baixo d'�gua:"
						+ "\n" + "	Onde ouvir da nossa vor o tom" + "\n" + "na superficie n�o h� Sol " + "\n"
						+ "Durante uma hora deve buscar" + "\n" + "E o que quer vai encontrar \n" + "\n"
						+ "Nossa!! Parece o canto dos Sereianos... " + "\n"
						+ "Vamos voc� s� tem algumas horas para 2� tarefa..");
		do {
			System.out.println(
					" Oh n�o, parece que voc� dormiu... \n Est� na hora da 2� tarefa!!! \n Voc� precisa encontrar seu amigo Ronald no fundo do Lago Negro, e voc� s� tem uma hora para isso...\n Allastor Olho-Tonto te entregou um guelrricho, vai te ajudar na procura, coma r�pido!!");

			System.out.println(
					"Seus oponentes sa�ram na sua frente, nadaram rapidamente para o norte... \n Cuidado para n�o se perder no caminho, lembre-se, seu objetivo � salvar o que voc� ama, seu amigo...");

			System.out.println(
					"Onde voc� quer procurar ? Selecione para qual lado voc� quer ir: \nNorte \nSul \nLeste \nOeste ");

			resposta = input.next();

			if (resposta.equalsIgnoreCase("Norte")) {
				System.out.println(
						" Isso ! Seus advers�rios podem dar boas pistas de onde seguir, agora vamos atr�s do Rony !  ");

			} else if (resposta.equalsIgnoreCase("Sul")) {
				System.out.println(
						"Ir ao contr�rio da maioria nesse caso pode te atrapalhar, talvez eles saibam um caminho diferente do que voc� imaginou... ");

			} else if (resposta.equals("Leste")) {
				System.out.println("Por ai n�o, s� tem barreiras que pode te atrapalhar..");

			} else if (resposta.equalsIgnoreCase("Oeste")) {
				System.out.println("\n" + "N�o parece ser o melhor local, acho que voc� s� vai perder tempo... ");

			} else {
				System.out.println("Digite uma resposta v�lida");
			}

		} while (!resposta.equalsIgnoreCase("Norte"));

	}

	public static void Fase2TerceiraPergunta() {

		String resposta;

		System.out.println(
				" Parece que j� estou vendo um sereiano e ao lado dele parece que � o... RONY !!! Vamos atr�s dele!!");
		do {
			System.out.println(
					" Droga, parece que seus 2 advers�rios foram mais r�pido que voc� e j� cumpriram o objetivo, por�m Rony n�o est� sozinho, tem outra pessoa desmaiada ao lado dele..."
							+ "\n Parece que � a Gabrielle, irm� de Fleur, seu oponente, ele n�o vai conseguir completar a prova pois teve problema com os Grindylows, os diabos marinhos, voc� vai deixar ela sozinha ? "
							+ "\n Lembre-se n�o � somente cumprir a prova para ganhar o torneio tribruxo, para ser um verdadeiro Bruxo precisamos de mais...");

			System.out.println(
					"O que voc� quer fazer agora ? \n A) Salvar Rony \n B) Salvar Rony e Gabrielle \n C) Desistir do Torneio");
			resposta = input.next();

			if (resposta.equalsIgnoreCase("A")) {
				System.out.println(
						" Voc� conseguiu salvar Rony por�m chegou em 3� lugar, n�o h� mais chances de ganhar o Torneio... ");

			} else if (resposta.equalsIgnoreCase("B")) {
				System.out.println(
						"Parab�ns!! Tenho certeza que os juizes levar�o em conta sua bravura e compaix�o, como um verdadeiro bruxo, agora vamos terminar o desafio! ");

			} else if (resposta.equals("C")) {
				System.out.println("Puxa, uma pena voc� n�o querer continuar...");

			} else {
				System.out.println("Digite uma resposta v�lida");
			}

		} while (!resposta.equalsIgnoreCase("B"));

	}

	public static void Fase2QuartaPergunta() {

		String resposta;

		System.out.println("O que � isso ? "
				+ "\nAh n�o, s�o os Grindylows e eles n�o querem deixar voc� levar a irm� de Fleur, o que faremos agora?");
		do {
			System.out.println("A) Soltar um feiti�o nos Grindylows e se libertar deles" + "\n Ou"
					+ "\nB)Desistir de levar Gabrielle ");

			System.out.println(
					"O que voc� quer fazer agora ? \n A- Salvar Rony \n B- Salvar Rony e Gabrielle \n C- Desistir do Torneio");
			resposta = input.next();

			if (resposta.equalsIgnoreCase("A")) {
				System.out.println(
						" Bravo nobre bruxo ! Voc� chegou em 3� lugar por�m os ju�zes viram sua dedica��o e companheirismo e como forma de bonifica��o te beneficiaram com o 2� lugar "
								+ "\nVoc� passou de fase !!");

			} else if (resposta.equalsIgnoreCase("B")) {
				System.out.println(
						"Voc� conseguiu salvar Rony por�m chegou em 3� lugar, n�o h� mais chances de ganhar o Torneio... ");

			} else {
				System.out.println("Digite uma resposta v�lida");
			}

		} while (!resposta.equalsIgnoreCase("A"));

	}

	public static void Fase3PrimeiraPergunta() {
		System.out.println("Bem vindo a etapa 3!" + "\n"
				+ "Parabens voce chegou at� aqui, ao passar do lago, voce agora tem um novo desafio! para ser o campeão"
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

			alternativa = input.next();

			int vida = 0;
			if (alternativa.equalsIgnoreCase("a")) {

				System.out.println(" Com essa tentativa voce foi sugado também,  ");

				vida(vida, -1);
			} else if (alternativa.equalsIgnoreCase("B")) {
				System.out.println("o feitiço foi inutil, ela morreu");

				vida(vida, -1);
			} else if (alternativa.equals("C")) {

				System.out.println("muito bom por sua atitude ela foi salva e voce pode proseguir com seu teste");
				/**
				 * GANHA XP
				 */
			} else if (alternativa.equalsIgnoreCase("D")) {

				System.out.println("por essa atitude ela morreu e você foi desclassificado");
				vida(vida, -1);
			} else if (alternativa.equalsIgnoreCase("E")) {

				System.out.println("ninguém veio te ajudar e a mulher morreu");
				vida(vida, -1);
			} else {

				System.out.println("Digite um numero valido");
			}

		} while (!alternativa.equalsIgnoreCase("C"));

	}

	public static void Fase3SegundaPergunta() {

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

			alternativa = input.next();

			if (alternativa.equalsIgnoreCase("a")) {

				System.out.println("vocês dois foram desclassificados por matar");

				vida--;
			} else if (alternativa.equalsIgnoreCase("B")) {

				System.out.println("você foi  desclassificados por matar");

				vida--;
			} else if (alternativa.equalsIgnoreCase("C")) {

				System.out.println("muito bem agora voces podem prosseguir.");

			} else if (alternativa.equalsIgnoreCase("D")) {

				System.out.println("voc� precisava do Cedrico para continuar");

				vida--;
			} else {
				System.out.println("digite um valor valido");
			}

		} while (!alternativa.equalsIgnoreCase("C"));

	}

	public static void Fase3TerceiraPergunta() {

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

			alternativa = input.next();

			int vida = 0;
			if (alternativa.equalsIgnoreCase("a")) {

				System.out.println("por sua causa cetrico morreu voce precisava dele");

				vida(vida, -1);
			} else if (alternativa.equalsIgnoreCase("B")) {

				System.out.println("nesse caso o labirinto estava muito mais agressivo e cetrico morreu, "
						+ "voce precisava dele");

				vida(vida, -1);
			} else if (alternativa.equalsIgnoreCase("C")) {

				System.out.println("por sua causa cetrico morreu voce precisava dele");

			} else if (alternativa.equalsIgnoreCase("D")) {

				System.out.println("muito bem, sempre se salva um amigo");

				vida(vida, -1);
			} else if (alternativa.equalsIgnoreCase("E")) {

				System.out.println("Cetrico conseguiu escapar mas voce morreu.");

				vida(vida, -1);
			} else {
				System.out.println("digite um valor valido");
			}

		} while (!alternativa.equalsIgnoreCase("D"));

	}

	public static void Fase3QuartaPergunta() {

		String alternativa;
		do {

			System.out.println("Ao você salvar cedrico o labirinto todo começa a"
					+ " fechar vocês começam a correr de novo, ao chegar perto " + "do cálice voce decide " + "\n"
					+ "\n" + "A) Deixar que você pegue afinal salvou cedrico ." + "\n" + "B) Dar o cálice a ele "
					+ "\n" + "C) Decidem que vão ir juntos pegar o cálice. " + "\n"
					+ "D) Não pegar nenhum dos dois. +" + "\n"
					+ "E) Lutar contra cedrico para ver quem merece o cálice");

			alternativa = input.next();

			if (alternativa.equalsIgnoreCase("a")) {

				System.out.println("Voce precisava do cedrico para prosseguir");

				vida(vida, -1);
			} else if (alternativa.equalsIgnoreCase("B")) {

				System.out.println("o cedrico não poderia ter ganhado sozinho...");

				vida(vida, -1);
			} else if (alternativa.equalsIgnoreCase("C")) {

				System.out.println("muito bem voces ganharam juntos! ");

			} else if (alternativa.equalsIgnoreCase("D")) {

				System.out.println("o labirinto se fechou e vocês dois morreram");

				vida(vida, -1);
			} else if (alternativa.equalsIgnoreCase("E")) {

				System.out.println("Vocês dois acabam morrendo pelo labirinto que fechou");

				vida(vida, -1);
			} else {
				System.out.println("digite um valor valido");
			}

		} while (!alternativa.equalsIgnoreCase("c"));

	}

	public static void Fase4PrimeiraPergunta() {
		String step;

		int i = 1;
		System.out.println("Parabéns, você conseguiu superar todos os desafios!\n "
				+ "Harry e seu amigo Cedrico chegam em Little Hangleton. Mas... espere.. Aquele não é o... RABICHO?.\n"
				+ "E ele está estranho... Ele foi enfeitiçado pelo Valdemort e está usando um feitiço contra seu amigo! Você pode:");

		do {
			System.out.println(
					"Esconder - Se esconder e esperar Rabicho utilizar o feitiço da Maldição da morte.\n Feitiço-Utilizar um feitiço contra o Rabicho.\n Esconder - Se esconder do Rabicho. \n Correr - Correr em direção ao Rabicho e tirar a varinha mágica dele.\n");

			System.out.println(
					"Digite apenas a primeira palavra de acordo com seu próximo passo para conseguir realizar mais um desafio:\n");
			step = input.next();
			System.out.println("\n");


} 


public static void Fase4PrimeiraPergunta(String first) {
    Scanner input = new Scanner(System.in);
    String step;
   
    int i = 1;
    System.out.println(
             "Parabens, voce conseguiu superar todos os desafios!\n "
            +  "Harry e seu amigo Cedrico chegam em Little Hangleton. Mas... espere.. Aquele nao e o... RABICHO?.\n"
            +  "E ele esta estranho... Ele foi enfeiticado pelo Valdemort e esta usando um feitico contra seu amigo! Voce pode:");
            
    do {
        System.out.println(
                "Esconder - Se esconder e esperar Rabicho utilizar o feitico da Maldicao da morte.\n Feitico-Utilizar um feitico contra o Rabicho.\n Esconder - Se esconder do Rabicho. \n Correr - Correr em direcao ao Rabicho e tirar a varinha magica dele.\n");

        System.out.println(
                "Digite apenas a primeira palavra de acordo com seu próximo passo para conseguir realizar mais um desafio:\n");
        step = input.next();
        System.out.println("\n");

        switch (step.toUpperCase()) {
            case "ESCONDER":
                System.out.println("Infelizmente essa opcao acabou matando Cedrico... E voce foi preso pelo Rabicho no tumulo de Tom Riddle Sr..\n\n\n");
                break;
            case "FEITICO":
			System.out.println("Essa escolha fara com que o Rabicho consiga usar um feitico e te matar. Tente novamente.");
			i++;
			break;
            case "ESCONDER":
			System.out.println("Essa escolha fara com que o Rabicho consiga usar um feitico e te matar. Tente novamente.");
			i++;
			break;
            case "CORRER":
                System.out.println("Essa escolha fara com que o Rabicho consiga usar um feitico e te matar. Tente novamente.");
                i++;
				break;
				default :
				System.out.println("Escolha uma resposta valida.");
        }
    } while (i <= 3 && !(step.equalsIgnoreCase("ESCONDER")));{
        if (i > 3) {
            System.out.println("Voce perdeu todas as suas vidas. FIM DE JOGO.");
            System.exit(i);
        }
    }
}


public static void Fase4SegundaPergunta(String second) {
    Scanner input = new Scanner(System.in);
    String pass;
    int i = 1;
    System.out.println(
            "Agora que chegou ate aqui, devera encontrar uma forma de sair do tumulo.\n"
                    + "Mas... como voce devera sair dele?\n");

    do {
        System.out.println(
                "Cavar - Cavar por dentro do tumulo onde esta escondido. \n Aceitar - Aceitar que o Rabicho colete o seu sangue, um osso desenterrado do tumulo do Riddle e uma de suas proprias maos. \n
                Feitico -  Utilizar um feitico para que se teletransporte para outro lugar.\n Esperar - Esperar Rabicho aparecer, joga-lo dentro do tumulo e trancar ele la dentro");
        System.out.println(
                "Digite apenas a primeira palavra de acordo com seu próximo passo para conseguir realizar mais um desafio:\n");
        pass = input.next();

        System.out.println("\n");

        switch (pass.toUpperCase()) {
            case "ACEITAR":
                System.out.println("Oh nao! Essa opcao fez com que Valdemort tenha seu corpo regenerado! Ele agora esta mais poderoso do que nunca! Valdemort pegou sua varinha e, atraves da Marca Negra no braco de Pettigrew, convocou os Comensais da Morte.\n\n\n");
                break;
            case "ESCONDER":
			System.out.println("Essa escolha fara com que você fique preso dentro do tumulo. tente novamente.");
			i++;
			break;
            case "FEITICO":
			System.out.println("Essa escolha fara com que você fique preso dentro do tumulo. tente novamente.");
			i++;
			break;
            case "DEIXAR":
                System.out.println("Essa escolha fara com que você fique preso dentro do tumulo. tente novamente.");
                i++;
				break;
				default :
				System.out.println("Escolha uma resposta valida.");
        }
    } while (i <= 3 && !(pass.equalsIgnoreCase("ACEITAR")));{
        if (i > 3) {
            System.out.println("Voce perdeu todas as suas vidas. FIM DE JOGO.");
            System.exit(i);
        }
    }
}


public static void Fase4TerceiraPergunta(String third) {
    Scanner input = new Scanner(System.in);
    String pass;
    int i = 1;
    System.out.println(
            "Apos ter que precensiar esta cena de valdemort voltando a vida, voce tera que enfrentar ele e usar todas suas forcas! Mas antes disso, voce precisa pensar bem nos seus proximos passos. Para onde seguir?\n");
    do {
        System.out.println(
                "Norte - Ir para o norte do cemiterio e tentar encontrar a saida. \n Local - Continuar no mesmo local e enfrentar Valdemort. \n  Sul -  Ir para o sul do cemitério e seguir o caminho do rio para chegar a uma cabana e se esconder.\n
                Juntar - Se juntar aos comensais da morte, afinal, voce nao conseguira derrota-los\n");

        System.out.println(
                "Digite apenas a primeira palavra de acordo com seu próximo passo para conseguir realizar mais um desafio:\n");
        pass = input.next();

        System.out.println("\n");

        switch (pass.toUpperCase()) {
            case "LOCAL":
            System.out.println("Boa escolha! O duelo entre voces esta prestes a comecar! ");
            break;
            case "NORTE":
			System.out.println("Essa escolha fara com que o Voldemort te pegue, tente novamente.");
			i++;
			break;
            case "JUNTAR":
			System.out.println("Essa escolha fara com que o Voldemort te pegue, tente novamente.");
			i++;
			break;
            case "SUL":
                System.out.println("Essa escolha fara com que o Voldemort te pegue, tente novamente.");
                i++;
				default :
				System.out.println("Escolha uma resposta valida.");
        }
    } while (i <= 3 && !(pass.equalsIgnoreCase("LOCAL")));{
        if (i > 3) {
            System.out.println("Voce perdeu todas as suas vidas. FIM DE JOGO.");
            System.exit(i);
        }
    }
}


public static void Fase4QuartaPergunta(String fourth) {
    Scanner input = new Scanner(System.in);
    String pass;
    int i = 1;
    System.out.println(
             "Sendo assim, Valdemort ordenou Rabicho a dar-lhe uma varinha. Ele ordenou que voce se curve diante dele, o que voce faz:\n\n\n");
    do {
        System.out.println(
                "Obedecer - Obedece o Valdemort afinal, está sendo controlado pelo feitico.\n Nao - Nao obedece os comandos do Valdemort pois voce nao o respeita como um mestre a ser seguido.\n Feitiço - Você lança um feitiço contra Valdemort, matando ele.\n Correr - Você sai correndo pelo cemitério para fugir dele e de todos os comensais da morte\n");
     
        System.out.println(
                "Digite apenas a primeira palavra de acordo com seu próximo passo para conseguir realizar mais um desafio:\n");
        pass = input.next();

        System.out.println("\n");

        switch (pass.toUpperCase()) {
            case "OBEDECER":
                System.out.println("Sim... infelizmente você teve que obedecer aos comandos dele...");
                break;
            case "NAO":
			System.out.println("Essa escolha fara com que Voldemort te pegue, tente novamente.");
			i++;
			break;
            case "FEITICO":
			System.out.println("Essa escolha fara com que Voldemort te pegue, tente novamente.");
			i++;
			break;
            case "CORRER":
                System.out.println("Essa escolha fara com que Voldemort te pegue, tente novamente.");
                i++;
				break;
				default :
				System.out.println("Escolha uma resposta valida.");
        }
    } while (i <= 3 && !(pass.equalsIgnoreCase("OBEDECER")));{
        if (i > 3) {
            System.out.println("Voce perdeu todas as suas vidas. FIM DE JOGO.");
            System.exit(i);
        }
    }
}

public static void Fase4QuintaPergunta(String fifth) {
    Scanner input = new Scanner(System.in);
    String pass;
    int i = 1;
    System.out.println("Mas veja! Agora voce e capaz de resistir ao feitico desta vez. Surpreso com sua resistencia para a Maldicao, Voldemort disparou outro feitico, e voce sem pensar duas vezes: \n\n\n");
      
  
             do {
        System.out.println(
                "Pedra - Se escondeu atras de uma pedra para desviar do feitico.\n
                 Estatua - Se escondeu tras de uma estatua para desviar do feitico.\n 
                 Feitico - Bloqueia o feitico com outro feitico.\n 
                 Rastejar - Foi atingido pelo feitico e saiu rastejando tentando se esconde atras de uma pedra.\n");
     
        System.out.println(
                "Digite apenas a primeira palavra de acordo com seu próximo passo para conseguir realizar mais um desafio:\n");
        pass = input.next();

        System.out.println("\n");

        switch (pass.toUpperCase()) {
            case "PEDRA":
                System.out.println("Uffa essa foi por pouco!");
                break;
            case "ESTATUA":
			System.out.println("Essa escolha fara com que Voldemort te pegue, tente novamente.");
			i++;
			break;
            case "FEITICO":
			System.out.println("Essa escolha fara com que Voldemort te pegue, tente novamente.");
			i++;
			break;
            case "RASTEJAR":
                System.out.println("Essa escolha fara com que Voldemort te pegue, tente novamente.");
                i++;
				break;
				default :
				System.out.println("Escolha uma resposta valida.");
        }
    } while (i <= 3 && !(pass.equalsIgnoreCase("PEDRA")));{
        if (i > 3) {
            System.out.println("Voce perdeu todas as suas vidas. FIM DE JOGO.");
            System.exit(i);
        }
    }
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

public static void Fase4SextaPergunta(String sixth) {
    Scanner input = new Scanner(System.in);
    String pass;
    int i = 1;
    System.out.println(
             "No entanto, voce, percebendo que nao havia nenhuma maneira de escapar, decidiu que, se ia morrer, iria morrer lutando, e nao se encolhendo para longe e se escondendo. Com isso, voce saiu de tras da pedra para enfrentar Voldemort. Voces dois usaram dois feiticos ao mesmo tempo, Valdemort usou o Expelliarmus. Escolha seu feitico::\n\n\n");
    
             do {
        System.out.println(
                "Imperius - Imperius  \n
                Expelliarmus - Expelliarmus \n
                Avada - Avada Kedavra \n
                Leviosa - Leviosa  \n");

        System.out.println(
                "Digite apenas a primeira palavra de acordo com seu próximo passo para conseguir realizar mais um desafio:\n");
        pass = input.next();

        System.out.println("\n");

        switch (pass.toUpperCase()) {
            case "EXPELLIARMUS":
                System.out.println("Apos as varinhas colidirem e voce conseguir o dominio dos feiticos, ele usou um Feitico de Convocacao para pegar a Chave de Portal e aparecer de volta a Hogwarts, segurando o cadaver de Diggory...");

                System.out.println("Parabens! Chegar aqui nao foi uma tarefa facil, mas voce, como um fa de Harry Potter, foi facil chegar ate aqui! Obrigada por jogar e espero que tenha se divertido!");
                
                
                break;
            case "IMPERIUS":
			System.out.println("Essa escolha fara com que Voldemort te pegue, tente novamente.");
			i++;
			break;
            case "AVADA":
			System.out.println("Essa escolha fara com que Voldemort te pegue, tente novamente.");
			i++;
			break;
            case "LEVIOSA":
                System.out.println("Essa escolha fara com que Voldemort te pegue, tente novamente.");
                i++;
				break;
				default :
				System.out.println("Escolha uma resposta valida.");
        }
    } while (i <= 3 && !(pass.equalsIgnoreCase("EXPELLIARMUS")));{
        if (i > 3) {
            System.out.println("Voce perdeu todas as suas vidas. FIM DE JOGO.");
            System.exit(i);
        }
    }
}
	