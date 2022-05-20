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

		Fase1PrimeiraPergunta(dragon);

		System.out.println("Boa, agora vamos para o que interessa...\n\n Agora que você ja descobriu seu dragão,\n"
				+ "você está na arena, seu objetivo é pegar o ovo, o dragão protege ele, seu dragão cospe fogo você precisa se esconder.\n");

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
		System.out.println("O número  " + sorteioDragao + " foi o número sorteado para você seguir sua história.");
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

	public static void Fase1SegundaPergunta(String second) {
		Scanner input = new Scanner(System.in);

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
		} while (i <= 3 && !(correctAnswer.equalsIgnoreCase("ESCONDER")));{

			if (i > 3) {
				System.out.println("Você perdeu todas as suas vidas. FIM DE JOGO.");
				System.exit(i);
			}
		}
	}

	public static void Fase1TerceiraPergunta(String third) {
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
		} while (i <= 3 && !(step.equalsIgnoreCase("VASSOURA")));{
			if (i > 3) {
				System.out.println("Você perdeu todas as suas vidas. FIM DE JOGO.");
				System.exit(i);
			}
		}
	}

	public static void Fase1QuartaPergunta(String fourth) {
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
		} while (i <= 3 && !(pass.equalsIgnoreCase("DESLIZAR")));{
			if (i > 3) {
				System.out.println("Você perdeu todas as suas vidas. FIM DE JOGO.");
				System.exit(i);
			}
		}
	}

	public static void Fase1QuintaPergunta(String fifth) {
		Scanner input = new Scanner(System.in);
		String continues;
		int i = 1;
		System.out.println(
				"Continue desse jeito, você não perde dica alguma...\nVocê acaba de pegar sua vassoura e começa a voar para se livrar novamente do dragão, você começa a procurar saídas em sua volta.\n\n"
						+ "No Leste você vê uma ponte com um espaço estreito para passar e o dragão não consegue passar ali se não vai bater e morrer.\n"
						+ "No oeste você olha e vê muita neblina, não sabe se é um caminho.\n "
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
		} while (i <= 3 && !(continues.equalsIgnoreCase("LESTE"))); {

			if (i > 3) {
				System.out.println("Você perdeu todas as suas vidas. FIM DE JOGO.");
				System.exit(i);
			}
		}

	}

	public static void Fase2PrimeiraPergunta() {
		Scanner input = new Scanner(System.in);

		String resposta;

		int tentativa = 0;

		System.out.println("Parabens !!! Voc� conseguiu o Ovo do dragao .... Agora é hora de descansar, estamos perto do baile de natal, at� mais, bravo guerreiro...\n");
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
				tentativa++;
			} else if (resposta.equalsIgnoreCase("Sul")) {
				System.out.println(" � para lavar seu ovo, n�o para ler para ele !");
				tentativa++;

			} else if (resposta.equals("Leste")) {
				System.out.println("N�o � o melhor lugar para ir...");
				tentativa++;

			} else if (resposta.equalsIgnoreCase("Oeste")) {
				System.out.println("Boa ! Agora siga o conselho que Cedrico te deu e tome um banho com seu ovo no banheiro dos monitores... Mas cuidado viu, pode ter seres estranhos l�... ");
			} else {
				System.out.println("Digite uma das op��es v�lidas");
			}

		} while (!resposta.equalsIgnoreCase("Oeste"));

	}

	public static void Fase2SegundaPergunta() {
		Scanner input = new Scanner(System.in);

		String resposta;

		int tentativa = 0;

		System.out.println(" Que barulho � esse ? Parece que o Ovo tem uma musica que s� se escuta em baixo d'�gua:"
				+ "\n" + "	Onde ouvir da nossa vor o tom"
				+ "\n" + "na superficie n�o h� Sol "
				+ "\n" + "Durante uma hora deve buscar"
				+ "\n" + "E o que quer vai encontrar \n"
				+ "\n" + "Nossa!! Parece o canto dos Sereianos... "
				+ "\n" + "Vamos voc� s� tem algumas horas para 2� tarefa..");
		do {
			System.out.println(
					" Oh n�o, parece que voc� dormiu... \n Est� na hora da 2� tarefa!!! \n Voc� precisa encontrar seu amigo Ronald no fundo do Lago Negro, e voc� s� tem uma hora para isso...\n Allastor Olho-Tonto te entregou um guelrricho, vai te ajudar na procura, coma r�pido!!");

			System.out.println("Seus oponentes sa�ram na sua frente, nadaram rapidamente para o norte... \n Cuidado para n�o se perder no caminho, lembre-se, seu objetivo � salvar o que voc� ama, seu amigo...");

			System.out.println("Onde voc� quer procurar ? Selecione para qual lado voc� quer ir: \nNorte \nSul \nLeste \nOeste ");

			resposta = input.next();

			if (resposta.equalsIgnoreCase("Norte")) {
				System.out.println(" Isso ! Seus advers�rios podem dar boas pistas de onde seguir, agora vamos atr�s do Rony !  ");

			} else if (resposta.equalsIgnoreCase("Sul")) {
				System.out.println("Ir ao contr�rio da maioria nesse caso pode te atrapalhar, talvez eles saibam um caminho diferente do que voc� imaginou... ");
				tentativa++;

			} else if (resposta.equals("Leste")) {
				System.out.println("Por ai n�o, s� tem barreiras que pode te atrapalhar..");
				tentativa++;

			} else if (resposta.equalsIgnoreCase("Oeste")) {
				System.out.println("\n"
						+ "N�o parece ser o melhor local, acho que voc� s� vai perder tempo... ");
				tentativa++;

			} else {
				System.out.println("Digite uma resposta v�lida");
			}

		} while (!resposta.equalsIgnoreCase("Norte"));

	}

	public static void Fase2TerceiraPergunta() {
		Scanner input = new Scanner(System.in);
		String resposta;
		int tentativa = 0;
		System.out.println(" Parece que j� estou vendo um sereiano e ao lado dele parece que � o... RONY !!! Vamos atr�s dele!!");
		do {
			System.out.println(
					" Droga, parece que seus 2 advers�rios foram mais r�pido que voc� e j� cumpriram o objetivo, por�m Rony n�o est� sozinho, tem outra pessoa desmaiada ao lado dele..."
							+ "\n Parece que � a Gabrielle, irm� de Fleur, seu oponente, ele n�o vai conseguir completar a prova pois teve problema com os Grindylows, os diabos marinhos, voc� vai deixar ela sozinha ? "
							+ "\n Lembre-se n�o � somente cumprir a prova para ganhar o torneio tribruxo, para ser um verdadeiro Bruxo precisamos de mais...");

			System.out.println("O que voc� quer fazer agora ? \n A) Salvar Rony \n B) Salvar Rony e Gabrielle \n C) Desistir do Torneio");
			resposta = input.next();

			if (resposta.equalsIgnoreCase("A")) {
				System.out.println(" Voc� conseguiu salvar Rony por�m chegou em 3� lugar, n�o h� mais chances de ganhar o Torneio... ");
				tentativa++;

			} else if (resposta.equalsIgnoreCase("B")) {
				System.out.println("Parab�ns!! Tenho certeza que os juizes levar�o em conta sua bravura e compaix�o, como um verdadeiro bruxo, agora vamos terminar o desafio! ");

			} else if (resposta.equals("C")) {
				System.out.println("Puxa, uma pena voc� n�o querer continuar...");
				tentativa++;

			} else {
				System.out.println("Digite uma resposta v�lida");
			}

		} while (!resposta.equalsIgnoreCase("B"));

	}

	public static void Fase2QuartaPergunta() {
		Scanner input = new Scanner(System.in);

		String resposta;

		int tentativa = 0;

		System.out.println("O que � isso ? "
				+ "\nAh n�o, s�o os Grindylows e eles n�o querem deixar voc� levar a irm� de Fleur, o que faremos agora?");
		do {
			System.out.println("A) Soltar um feiti�o nos Grindylows e se libertar deles"
					+ "\n Ou"
					+ "\nB)Desistir de levar Gabrielle ");

			System.out.println("O que voc� quer fazer agora ? \n A- Salvar Rony \n B- Salvar Rony e Gabrielle \n C- Desistir do Torneio");
			resposta = input.next();

			if (resposta.equalsIgnoreCase("A")) {
				System.out.println(" Bravo nobre bruxo ! Voc� chegou em 3� lugar por�m os ju�zes viram sua dedica��o e companheirismo e como forma de bonifica��o te beneficiaram com o 2� lugar "
						+ "\nVoc� passou de fase !!");

			} else if (resposta.equalsIgnoreCase("B")) {
				System.out.println("Voc� conseguiu salvar Rony por�m chegou em 3� lugar, n�o h� mais chances de ganhar o Torneio... ");
				tentativa++;

			} else {
				System.out.println("Digite uma resposta v�lida");
			}

		} while (!resposta.equalsIgnoreCase("A"));

	}

	public static void Fase3PrimeiraPergunta() {
		System.out.println("Bem vindo a etapa 3!" +
				"\n" +
				"Parabens voce chegou até aqui, ao passar do lago, voce agora tem um novo desafio! para ser o campeão" +
				" tribuxo voce precisa passar pelo labirinto e pegar o calice." +
				"\n" +
				"Todos os participantes incluindo voce entram no labirinto e começam a tentar encontrar o caminho certo." +
				"\n");
		String alternativa;
		do {
			System.out.println("Você está no meio do labirinto, derrepente houve um barulho de gritos, você corre para " +
					"ver o que aconteceu, você vê uma competidora desmaiada. " +
					"\n" +
					"Por causa de victor crum outro adversário, ela está sendo sugada pelo labirinto você pode :" +
					"\n" + "\n" +
					"A) Tenta soltar com as maos impedir que ela seja sugada." +
					"\n" +
					"B) Joga um feitiço na parede \n" +
					"C) Jogar um feitiço de localização para os professores dela virem.\n" +
					"D) Não faz nada. Deixa ela lá.\n" +
					"E) Gritar pedindo ajuda pára outro competidor.");

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

	public static void Fase3SegundaPergunta() {

		String alternativa;
		do {

			System.out.println("Ao jogar o feitiço de localização  o labirinto começa a fechar  você começa a correr." +
					"\n" +
					" Você percebe que tem dois competidores brigando com suas varinhas, um dele está enfeitiçado," +
					"cedrico ganha dele , \n entretando depois de ter derrotado ele, cedrigo quer matar ele pelo o que fez com a outra" +
					" competidora, agora você\n" +
					"\n" +
					"A) Deixa cedrico matar ele afinal quase matou a outra competidora." +
					"\n" +
					"B) Mata cedrico impedindo ele." +
					"\n" +
					"C) Segura ele explicando que ele apenas está enfeitiçado." +
					"\n" +
					"D) Joga um feitiço contra cedrico deixando ele desmaiado. ");


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

	public static void Fase3TerceiraPergunta() {

		String alternativa;
		do {

			System.out.println("Depois de convencer cedrico eles deixam o outro competidor ali," +
					" em seguida começam a correr até o fim do labirinto, \n" +
					"Vocês vêem o cálice de longe e começam a disputar entre si correndo," +
					" até que cedrico é pego pelos galhos do labirinto está prestes a morrer, \n" +
					"mas o cálice está logo alí. Você : \n" +
					"\n" +
					"A) Deixa cedrico e vai até o cálice para ganhar o jogo." +
					"\n" +
					"B) Da um sinal de localização e vai até o cálice." +
					"\n" +
					"C) Joga um feitiço em cedrico para que ele para de gritar." +
					"\n" +
					"D) Salva cedrico com um feitiço nas plantas, tirando ele de lá" +
					"\n" +
					"E) Se oferece como distração para que ele escape.");

			Scanner scanner = new Scanner(System.in);
			alternativa = scanner.next();


			int vida = 0;
			if (alternativa.equalsIgnoreCase("a")) {

				System.out.println("por sua causa cetrico morreu voce precisava dele");

				vida--;
			} else if (alternativa.equalsIgnoreCase("B")) {

				System.out.println("nesse caso o labirinto estava muito mais agressivo e cetrico morreu, " +
						"voce precisava dele"
				);

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

	public static void Fase3QuartaPergunta() {

		String alternativa;
		do {

			System.out.println("Ao você salvar cedrico o labirinto todo começa a" +
					" fechar vocês começam a correr de novo, ao chegar perto " +
					"do cálice voce decide " +
					"\n" +"\n"+
					"A) Deixar que você pegue afinal salvou cedrico ." +
					"\n" +
					"B) Dar o cálice a ele " +
					"\n" +
					"C) Decidem que vão ir juntos pegar o cálice. " +
					"\n" +
					"D) Não pegar nenhum dos dois. +" +
					"\n" +
					"E) Lutar contra cedrico para ver quem merece o cálice");

			Scanner scanner = new Scanner(System.in);
			alternativa = scanner.next();


			int vida = 0;
			if (alternativa.equalsIgnoreCase("a")) {

				System.out.println("Voce precisava do cedrico para prosseguir");

				vida--;
			} else if (alternativa.equalsIgnoreCase("B")) {

				System.out.println("o cedrico não poderia ter ganhado sozinho..."
				);

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


public static void Fase4PrimeiraPergunta(String first) {
    Scanner input = new Scanner(System.in);
    String step;
   
    int i = 1;
    System.out.println(
             "Parabéns, você conseguiu superar todos os desafios!\n "
            +  "Harry e seu amigo Cedrico chegam em Little Hangleton. Mas... espere.. Aquele não é o... RABICHO?.\n"
            +  "E ele está estranho... Ele foi enfeitiçado pelo Valdemort e está usando um feitiço contra seu amigo! Você pode:");
            
    do {
        System.out.println(
                "Esconder - Se esconder e esperar Rabicho utilizar o feitiço da Maldição da morte.\n Feitiço-Utilizar um feitiço contra o Rabicho.\n Esconder - Se esconder do Rabicho. \n Correr - Correr em direção ao Rabicho e tirar a varinha mágica dele.\n");

        System.out.println(
                "Digite apenas a primeira palavra de acordo com seu próximo passo para conseguir realizar mais um desafio:\n");
        step = input.next();
        System.out.println("\n");

        switch (step.toUpperCase()) {
            case "ESCONDER":
                System.out.println("Infelizmente essa opção acabou matando Cedrico... E você foi preso pelo Rabicho no túmulo de Tom Riddle Sr..\n\n\n");
                break;
            case "FEITIÇO":
			System.out.println("Essa escolha fará com que o Rabicho consiga usar um feitiço e te matar. Tente novamente.");
			i++;
			break;
            case "ESCONDER":
			System.out.println("Essa escolha fará com que o Rabicho consiga usar um feitiço e te matar. Tente novamente.");
			i++;
			break;
            case "CORRER":
                System.out.println("Essa escolha fará com que o Rabicho consiga usar um feitiço e te matar. Tente novamente.");
                i++;
				break;
				default :
				System.out.println("Escolha uma resposta válida.");
        }
    } while (i <= 3 && !(step.equalsIgnoreCase("ESCONDER")));{
        if (i > 3) {
            System.out.println("Você perdeu todas as suas vidas. FIM DE JOGO.");
            System.exit(i);
        }
    }
}


public static void Fase4SegundaPergunta(String second) {
    Scanner input = new Scanner(System.in);
    String pass;
    int i = 1;
    System.out.println(
            "Agora que chegou até aqui, deverá encontrar uma forma de sair do túmulo.\n"
                    + "Mas... como vocêdeverá sair dele?\n");

    do {
        System.out.println(
                "Cavar - Cavar por dentro do tumulo onde está escondido. \n Aceitar - Aceitar que o Rabicho colete o seu sangue, um osso desenterrado do túmulo do Riddle e uma de suas próprias mãos. \n
                Feitiço -  Utilizar um feitiço para que se teletransporte para outro lugar.\n Esperar - Esperar Rabicho aparecer, jogá-lo dentro do túmulo e trancar ele lá dentro");
        System.out.println(
                "Digite apenas a primeira palavra de acordo com seu próximo passo para conseguir realizar mais um desafio:\n");
        pass = input.next();

        System.out.println("\n");

        switch (pass.toUpperCase()) {
            case "ACEITAR":
                System.out.println("Oh não! Essa opção fez com que Valdemort tenha seu corpo regenerado! Ele agora está mais poderoso do que nunca! Valdemort pegou sua varinha e, através da Marca Negra no braço de Pettigrew, convocou os Comensais da Morte.\n\n\n");
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
				default :
				System.out.println("Escolha uma resposta válida.");
        }
    } while (i <= 3 && !(pass.equalsIgnoreCase("ACEITAR")));{
        if (i > 3) {
            System.out.println("Você perdeu todas as suas vidas. FIM DE JOGO.");
            System.exit(i);
        }
    }
}


public static void Fase4TerceiraPergunta(String third) {
    Scanner input = new Scanner(System.in);
    String pass;
    int i = 1;
    System.out.println(
            "Após ter que precensiar esta cena de valdemort voltando a vida, você terá que enfrentar ele e usar todas suas forças! Mas antes disso, você precisa pensar bem nos seus próximos passos. Para onde seguir?\n");
    do {
        System.out.println(
                "Norte - Ir para o norte do cemitério e tentar encontrar a saída. \n Local - Continuar no mesmo local e enfrentar Valdemort. \n  Sul -  Ir para o sul do cemitério e seguir o caminho do rio para chegar a uma cabana e se esconder.\n
                Juntar - Se juntar aos comensais da morte, afinal, você não conseguirá derrotá-los\n");

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
				default :
				System.out.println("Escolha uma resposta válida.");
        }
    } while (i <= 3 && !(pass.equalsIgnoreCase("LOCAL")));{
        if (i > 3) {
            System.out.println("Você perdeu todas as suas vidas. FIM DE JOGO.");
            System.exit(i);
        }
    }
}


public static void Fase4QuartaPergunta(String fourth) {
    Scanner input = new Scanner(System.in);
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
				default :
				System.out.println("Escolha uma resposta válida.");
        }
    } while (i <= 3 && !(pass.equalsIgnoreCase("OBEDECER")));{
        if (i > 3) {
            System.out.println("Você perdeu todas as suas vidas. FIM DE JOGO.");
            System.exit(i);
        }
    }
}

public static void Fase4QuintaPergunta(String fifth) {
    Scanner input = new Scanner(System.in);
    String pass;
    int i = 1;
    System.out.println("Mas veja! Agora você é capaz de resistir ao feitiço desta vez. Surpreso com sua resistência para a Maldição, Voldemort disparou outro feitiço, e você sem pensar duas vezes: \n\n\n");
  
  
             do {
        System.out.println(
                "Pedra - Se escondeu atrás de uma pedra para desviar do feitiço.\n
                 Estátua - Se escondeu trás de uma estátua para desviar do feitiço.\n 
                 Feitiço - Bloqueia o feitiço com outro feitiço.\n 
                 Rastejar - Foi atingido pelo feitiço e saiu rastejando tentando se esconde atrás de uma pedra.\n");
     
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
				default :
				System.out.println("Escolha uma resposta válida.");
        }
    } while (i <= 3 && !(pass.equalsIgnoreCase("PEDRA")));{
        if (i > 3) {
            System.out.println("Você perdeu todas as suas vidas. FIM DE JOGO.");
            System.exit(i);
        }
    }
}



public static void Fase4SextaPergunta(String sixth) {
    Scanner input = new Scanner(System.in);
    String pass;
    int i = 1;
    System.out.println(
             "No entanto, você, percebendo que não havia nenhuma maneira de escapar, decidiu que, se ia morrer, iria morrer lutando, e não se encolhendo para longe e se escondendo. Com isso, você saiu de trás da pedra para enfrentar Voldemort. Vocês dois usaram dois feitiços ao mesmo tempo, Valdemort usou o Expelliarmus. Escolha seu feitiço::\n\n\n");
    
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
                System.out.println("Após as varinhas colidirem e vocÊ conseguir o dominio dos feitiços, ele usou um Feitiço de Convocação para pegar a Chave de Portal e aparecer de volta a Hogwarts, segurando o cadáver de Diggory...");

                System.out.println("Parabéns! Chegar aqui não foi uma tarefa fácil, mas você, como um fã de Harry Potter, foi fácil chegar até aqui!Obrigada por jogar e espero que tenha se divertido!");
                
                
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
				default :
				System.out.println("Escolha uma resposta válida.");
        }
    } while (i <= 3 && !(pass.equalsIgnoreCase("EXPELLIARMUS")));{
        if (i > 3) {
            System.out.println("Você perdeu todas as suas vidas. FIM DE JOGO.");
            System.exit(i);
        }
    }
}



	






