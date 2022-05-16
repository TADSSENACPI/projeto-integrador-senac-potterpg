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
	    
	    System.out.println("Parabens !!! Você conseguiu o Ovo do dragão .... Agora é hora de descansar, estamos perto do baile de natal, até mais, bravo guerreiro...\n");
	    do {
	      System.out.println(
	          "Parece que Cedrico quer retribuir o favor que você fez a ele no desafio dos dragões, ele quer falar algo..."
	              + "\n");

	      System.out.println(
	          "Cedrico: Sabe o Banheiro dos monitores no 5º Piso ? É um bom lugar para um banho... Leve seu ovo e ilumine um pouco as coisas em baixo da água quente...");

	      System.out.println(
	          "  \nCedrico te deu uma dica, e agora, o que faremos? Você está no 4º andar da escola, Ao Sul está a Biblioteca,você pode tentar procurar mais sobre o ovo nos livros. a norte você pode ver o Salão Principal, a Oeste tem uma escada que dá acesso ao banheiro do 5º Piso, a oeste tem uma escada que dá acesso ao 3º Piso...");

	      System.out.println("\nNorte \nSul \nLeste \nOeste \nSelecione uma das opções:");

	      resposta = input.next();
	      
	      if (resposta.equalsIgnoreCase("Norte")) {
	        System.out.println(" Salão principal ? Não parece ser o melhor lugar para se tomar um banho!  ");
	        tentativa++;
	      } else if (resposta.equalsIgnoreCase("Sul")) {
	        System.out.println(" É para lavar seu ovo, não para ler para ele !");
	        tentativa++;

	      } else if (resposta.equals("Leste")) {
	        System.out.println("Não é o melhor lugar para ir...");
	        tentativa++;

	      } else if (resposta.equalsIgnoreCase("Oeste")) {
	        System.out.println("Boa ! Agora siga o conselho que Cedrico te deu e tome um banho com seu ovo no banheiro dos monitores... Mas cuidado viu, pode ter seres estranhos lá... ");
	      } else {
	        System.out.println("Digite uma das opções válidas");
	      }

	    } while (!resposta.equalsIgnoreCase("Oeste"));

	  }

	  public static void perguntaDois() {
	    Scanner input = new Scanner(System.in);
	    
	    String resposta;
	    
	    int tentativa = 0;
	    
	    System.out.println(" Que barulho é esse ? Parece que o Ovo tem uma musica que só se escuta em baixo d'água:" 
	    				+ "\n" + "	Onde ouvir da nossa vor o tom" 
	    				+ "\n" + "na superficie não há Sol "
	    				+ "\n" + "Durante uma hora deve buscar" 
	    				+ "\n" + "E o que quer vai encontrar \n"
	    				+ "\n" + "Nossa!! Parece o canto dos Sereianos... "
	    				+ "\n" + "Vamos você só tem algumas horas para 2º tarefa..");
	    do {
	      System.out.println(
	          " Oh não, parece que você dormiu... \n Está na hora da 2º tarefa!!! \n Você precisa encontrar seu amigo Ronald no fundo do Lago Negro, e você só tem uma hora para isso...\n Allastor Olho-Tonto te entregou um guelrricho, vai te ajudar na procura, coma rápido!!");
	      
	      System.out.println("Seus oponentes saíram na sua frente, nadaram rapidamente para o norte... \n Cuidado para não se perder no caminho, lembre-se, seu objetivo é salvar o que você ama, seu amigo...");
	      
	      System.out.println("Onde você quer procurar ? Selecione para qual lado você quer ir: \nNorte \nSul \nLeste \nOeste ");

	      resposta = input.next();
	  
	      if (resposta.equalsIgnoreCase("Norte")) {
	        System.out.println(" Isso ! Seus adversários podem dar boas pistas de onde seguir, agora vamos atrás do Rony !  ");
	        
	      } else if (resposta.equalsIgnoreCase("Sul")) {
	        System.out.println("Ir ao contrário da maioria nesse caso pode te atrapalhar, talvez eles saibam um caminho diferente do que você imaginou... ");
	        tentativa++;

	      } else if (resposta.equals("Leste")) {
	        System.out.println("Por ai não, só tem barreiras que pode te atrapalhar..");
	        tentativa++;

	      } else if (resposta.equalsIgnoreCase("Oeste")) {
	        System.out.println("\n"
	            + "Não parece ser o melhor local, acho que você só vai perder tempo... ");
	        tentativa++;
	        
	      } else {
	        System.out.println("Digite uma resposta válida");
	      }

	    } while (!resposta.equalsIgnoreCase("Norte"));

	  }public static void perguntaTres() {
	    Scanner input = new Scanner(System.in);
	    String resposta;
	    int tentativa = 0;
	    System.out.println(" Parece que já estou vendo um sereiano e ao lado dele parece que é o... RONY !!! Vamos atrás dele!!");
	    do {
	      System.out.println(
	          " Droga, parece que seus 2 adversários foram mais rápido que você e já cumpriram o objetivo, porém Rony não está sozinho, tem outra pessoa desmaiada ao lado dele..."
	          + "\n Parece que é a Gabrielle, irmã de Fleur, seu oponente, ele não vai conseguir completar a prova pois teve problema com os Grindylows, os diabos marinhos, você vai deixar ela sozinha ? "
	          + "\n Lembre-se não é somente cumprir a prova para ganhar o torneio tribruxo, para ser um verdadeiro Bruxo precisamos de mais...");
	      
	      System.out.println("O que você quer fazer agora ? \n A) Salvar Rony \n B) Salvar Rony e Gabrielle \n C) Desistir do Torneio");
	      resposta = input.next();
	  
	      if (resposta.equalsIgnoreCase("A")) {
	        System.out.println(" Você conseguiu salvar Rony porém chegou em 3º lugar, não há mais chances de ganhar o Torneio... ");
	        tentativa++;
	        
	      } else if (resposta.equalsIgnoreCase("B")) {
	        System.out.println("Parabéns!! Tenho certeza que os juizes levarão em conta sua bravura e compaixão, como um verdadeiro bruxo, agora vamos terminar o desafio! ");

	      } else if (resposta.equals("C")) {
	        System.out.println("Puxa, uma pena você não querer continuar...");
	        tentativa++;
	        
	      } else {
	        System.out.println("Digite uma resposta válida");
	      }

	    } while (!resposta.equalsIgnoreCase("B"));

	  }public static void perguntaQuatro() {
	    Scanner input = new Scanner(System.in);
	    
	    String resposta;
	    
	    int tentativa = 0;
	    
	    System.out.println("O que é isso ? "
	    		+ "\nAh não, são os Grindylows e eles não querem deixar você levar a irmã de Fleur, o que faremos agora?");
	    do {
	      System.out.println("A) Soltar um feitiço nos Grindylows e se libertar deles"
	      		+ "\n Ou" 
	      		+ "\nB)Desistir de levar Gabrielle ");
	      
	      System.out.println("O que você quer fazer agora ? \n A- Salvar Rony \n B- Salvar Rony e Gabrielle \n C- Desistir do Torneio");
	      resposta = input.next();
	  
	      if (resposta.equalsIgnoreCase("A")) {
	        System.out.println(" Bravo nobre bruxo ! Você chegou em 3º lugar porém os juízes viram sua dedicação e companheirismo e como forma de bonificação te beneficiaram com o 2º lugar "
	        		+ "\nVocê passou de fase !!");
	        
	      } else if (resposta.equalsIgnoreCase("B")) {
	        System.out.println("Você conseguiu salvar Rony porém chegou em 3º lugar, não há mais chances de ganhar o Torneio... ");
	        tentativa++;

	      } else {
	        System.out.println("Digite uma resposta válida");
	      }

	    } while (!resposta.equalsIgnoreCase("A"));

	  }

}
