import java.util.Scanner;
public class exer2LagoNegro {


	  public static void main(String[] args) {

	    perguntaUm();
	    perguntaDois();
	    perguntaTres();
	    perguntaQuatro();
	  }
	  public static void perguntaUm() {
	    Scanner input = new Scanner(System.in);
	    
	    String resposta;
	    
	    int tentativa = 0;
	    
	    System.out.println("Parabens !!! Voc� conseguiu o Ovo do drag�o .... Agora � hora de descansar, estamos perto do baile de natal, at� mais, bravo guerreiro...\n");
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

	  public static void perguntaDois() {
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

	  }public static void perguntaTres() {
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

	  }public static void perguntaQuatro() {
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

}
